/*
               File: selecplaca_impl
        Description: Selec Placa
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:23:11.24
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

public final  class selecplaca_impl extends GXDataArea
{
   public selecplaca_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public selecplaca_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( selecplaca_impl.class ));
   }

   public selecplaca_impl( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbInvd_ModuloAlmacen = new HTMLChoice();
      cmbInvd_Estado = new HTMLChoice();
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
            nRC_GXsfl_94 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_94_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_94_idx = httpContext.GetNextPar( ) ;
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
            AV14cInvd_NumeroPlaca = httpContext.GetNextPar( ) ;
            AV11cInvd_DescripcionDevolutivo = httpContext.GetNextPar( ) ;
            AV7cElem_Consecutivo = httpContext.GetNextPar( ) ;
            AV15cInvd_PlacaPadre = httpContext.GetNextPar( ) ;
            AV12cInvd_FechaAdquisicion = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
            AV45Regi_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            A67Invd_NumeroPlaca = httpContext.GetNextPar( ) ;
            AV23Marca = httpContext.GetNextPar( ) ;
            AV24Modelo = httpContext.GetNextPar( ) ;
            AV38Serial = httpContext.GetNextPar( ) ;
            AV26Observaciones = httpContext.GetNextPar( ) ;
            AV41Tran_IdEntrada = GXutil.lval( httpContext.GetNextPar( )) ;
            AV25Nro_Linea = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV20cSerial = httpContext.GetNextPar( ) ;
            AV19cModelo = httpContext.GetNextPar( ) ;
            AV18cMarca = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV14cInvd_NumeroPlaca, AV11cInvd_DescripcionDevolutivo, AV7cElem_Consecutivo, AV15cInvd_PlacaPadre, AV12cInvd_FechaAdquisicion, AV45Regi_Id, A67Invd_NumeroPlaca, AV23Marca, AV24Modelo, AV38Serial, AV26Observaciones, AV41Tran_IdEntrada, AV25Nro_Linea, AV20cSerial, AV19cModelo, AV18cMarca) ;
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
            AV29Placa = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29Placa", AV29Placa);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV45Regi_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV45Regi_Id", GXutil.ltrim( GXutil.str( AV45Regi_Id, 11, 0)));
               AV41Tran_IdEntrada = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV41Tran_IdEntrada", GXutil.ltrim( GXutil.str( AV41Tran_IdEntrada, 11, 0)));
               AV25Nro_Linea = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25Nro_Linea", GXutil.ltrim( GXutil.str( AV25Nro_Linea, 8, 0)));
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
      pa802( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start802( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414231138");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.selecplaca") + "?" + GXutil.URLEncode(GXutil.rtrim(AV29Placa)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV45Regi_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV41Tran_IdEntrada,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV25Nro_Linea,8,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCINVD_NUMEROPLACA", AV14cInvd_NumeroPlaca);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCINVD_DESCRIPCIONDEVOLUTIVO", AV11cInvd_DescripcionDevolutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCELEM_CONSECUTIVO", AV7cElem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCINVD_PLACAPADRE", AV15cInvd_PlacaPadre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCINVD_FECHAADQUISICION", localUtil.format(AV12cInvd_FechaAdquisicion, "99/99/99"));
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_94", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_94, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vREGI_ID", GXutil.ltrim( localUtil.ntoc( AV45Regi_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_IDENTRADA", GXutil.ltrim( localUtil.ntoc( AV41Tran_IdEntrada, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vNRO_LINEA", GXutil.ltrim( localUtil.ntoc( AV25Nro_Linea, (byte)(8), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPLACA", AV29Placa);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_NUMEROPLACAFILTERCONTAINER_Class", GXutil.rtrim( divInvd_numeroplacafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_DESCRIPCIONIDFILTERCONTAINER_Class", GXutil.rtrim( divInvd_descripcionidfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_PLACAPADREFILTERCONTAINER_Class", GXutil.rtrim( divInvd_placapadrefiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_CONSECUTIVOFILTERCONTAINER_Class", GXutil.rtrim( divElem_consecutivofiltercontainer_Class));
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
         we802( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt802( ) ;
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
      return formatLink("com.orions2.selecplaca") + "?" + GXutil.URLEncode(GXutil.rtrim(AV29Placa)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV45Regi_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV41Tran_IdEntrada,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV25Nro_Linea,8,0))) ;
   }

   public String getPgmname( )
   {
      return "SelecPlaca" ;
   }

   public String getPgmdesc( )
   {
      return "Selec Placa" ;
   }

   public void wb800( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 col-lg-2 PromptAdvancedBarCell", "left", "top", "", "", "div");
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblinvd_numeroplacafilter_Internalname, "Número de placa", "", "", lblLblinvd_numeroplacafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e11801_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelecPlaca.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_94_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCinvd_numeroplaca_Internalname, AV14cInvd_NumeroPlaca, GXutil.rtrim( localUtil.format( AV14cInvd_NumeroPlaca, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCinvd_numeroplaca_Jsonclick, 0, "Attribute", "", "", "", edtavCinvd_numeroplaca_Visible, edtavCinvd_numeroplaca_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_SelecPlaca.htm");
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblinvd_descripcionidfilter_Internalname, "Descripción", "", "", lblLblinvd_descripcionidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e12801_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelecPlaca.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_94_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavCinvd_descripciondevolutivo_Internalname, AV11cInvd_DescripcionDevolutivo, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", (short)(0), edtavCinvd_descripciondevolutivo_Visible, edtavCinvd_descripciondevolutivo_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_SelecPlaca.htm");
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblelem_consecutivofilter_Internalname, "Consecutivo", "", "", lblLblelem_consecutivofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e13801_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelecPlaca.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_94_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCelem_consecutivo_Internalname, AV7cElem_Consecutivo, GXutil.rtrim( localUtil.format( AV7cElem_Consecutivo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCelem_consecutivo_Jsonclick, 0, "Attribute", "", "", "", edtavCelem_consecutivo_Visible, edtavCelem_consecutivo_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_SelecPlaca.htm");
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblinvd_placapadrefilter_Internalname, "Placa Padre", "", "", lblLblinvd_placapadrefilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e14801_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelecPlaca.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_94_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCinvd_placapadre_Internalname, AV15cInvd_PlacaPadre, GXutil.rtrim( localUtil.format( AV15cInvd_PlacaPadre, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCinvd_placapadre_Jsonclick, 0, "Attribute", "", "", "", edtavCinvd_placapadre_Visible, edtavCinvd_placapadre_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_SelecPlaca.htm");
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblfechafilter_Internalname, "Fecha de Adquisición", "", "", lblLblfechafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e15801_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelecPlaca.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_94_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCinvd_fechaadquisicion_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCinvd_fechaadquisicion_Internalname, localUtil.format(AV12cInvd_FechaAdquisicion, "99/99/99"), localUtil.format( AV12cInvd_FechaAdquisicion, "99/99/99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'spa',false,0);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCinvd_fechaadquisicion_Jsonclick, 0, "Attribute", "", "", "", edtavCinvd_fechaadquisicion_Visible, edtavCinvd_fechaadquisicion_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Fecha", "right", false, "HLP_SelecPlaca.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtavCinvd_fechaadquisicion_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtavCinvd_fechaadquisicion_Visible==0)||(edtavCinvd_fechaadquisicion_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_SelecPlaca.htm");
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblmarcafilter_Internalname, "Marca", "", "", lblLblmarcafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e16801_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelecPlaca.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_94_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCmarca_Internalname, AV18cMarca, GXutil.rtrim( localUtil.format( AV18cMarca, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCmarca_Jsonclick, 0, "Attribute", "", "", "", edtavCmarca_Visible, edtavCmarca_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_SelecPlaca.htm");
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblmodelofilter_Internalname, "Modelo", "", "", lblLblmodelofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e17801_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelecPlaca.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_94_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCmodelo_Internalname, AV19cModelo, GXutil.rtrim( localUtil.format( AV19cModelo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCmodelo_Jsonclick, 0, "Attribute", "", "", "", edtavCmodelo_Visible, edtavCmodelo_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_SelecPlaca.htm");
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblserialfilter_Internalname, "Serial", "", "", lblLblserialfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e18801_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelecPlaca.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_94_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCserial_Internalname, AV20cSerial, GXutil.rtrim( localUtil.format( AV20cSerial, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCserial_Jsonclick, 0, "Attribute", "", "", "", edtavCserial_Visible, edtavCserial_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_SelecPlaca.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
         ClassString = bttBtntoggle_Class ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 94, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e19801_client"+"'", TempTags, "", 2, "HLP_SelecPlaca.htm");
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"94\">") ;
            sStyleString = "" ;
            com.orions2.GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "PromptGrid", 0, "", "", 1, 2, sStyleString, "", 0);
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
            httpContext.writeText( "<th align=\""+""+"\" "+" width="+GXutil.ltrim( GXutil.str( 20, 4, 0))+"px"+" class=\""+"SelectionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 80, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Placa") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 85, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Consecutivo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 100, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 85, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Placa Padre") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 80, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Marca") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 80, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Modelo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 80, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Serial") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 80, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 150, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Observaciones") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 80, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Costo Total") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Regional") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Centro Costo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Almacen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Almacén") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Bodega") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Estado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Valor Adquisicion") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Valor futuro") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Tiempo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Interes") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Otros Costos Devolutivo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Vida Util Actual") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeTextNL( "</tr>") ;
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
            if ( isAjaxCallMode( ) )
            {
               Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
            }
            else
            {
               Grid1Container.Clear();
            }
            Grid1Container.SetWrapped(nGXWrapped);
            Grid1Container.AddObjectProperty("GridName", "Grid1");
            Grid1Container.AddObjectProperty("Class", "PromptGrid");
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("CmpContext", "");
            Grid1Container.AddObjectProperty("InMasterPage", "false");
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( AV22LinkSelection));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A67Invd_NumeroPlaca);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A66Elem_Consecutivo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A298Cata_Descripcion);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A68Invd_PlacaPadre);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV23Marca);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMarca_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV24Modelo);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavModelo_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV38Serial);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSerial_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", localUtil.format(A466Invd_FechaAdquisicion, "99/99/99"));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV26Observaciones);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavObservaciones_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A629Costo_Total_Dev, (byte)(24), (byte)(2), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A410Invd_RegionalId, (byte)(11), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtInvd_RegionalId_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A411Invd_CentroCostoId, (byte)(11), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A412Invd_ModuloAlmacen);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A413Invd_AlmacenCodigo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A414Invd_BodegaCodigo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A463Invd_Estado);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A465Invd_ValorAdquisicion, (byte)(24), (byte)(2), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A625Variable_VF, (byte)(24), (byte)(2), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A627Variable_N, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A626Variable_I, (byte)(3), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A628Otros_Costos_Dev, (byte)(24), (byte)(2), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A631Vida_Util_Actual, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 94 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_94 = (short)(nGXsfl_94_idx-1) ;
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
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 120,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 94, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SelecPlaca.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start802( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Selec Placa", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup800( ) ;
   }

   public void ws802( )
   {
      start802( ) ;
      evt802( ) ;
   }

   public void evt802( )
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 4), "LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) )
                        {
                           nGXsfl_94_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_94_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_94_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_942( ) ;
                           AV22LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV22LinkSelection)==0) ? AV48Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV22LinkSelection))), !bGXsfl_94_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV22LinkSelection), true);
                           A67Invd_NumeroPlaca = httpContext.cgiGet( edtInvd_NumeroPlaca_Internalname) ;
                           A66Elem_Consecutivo = httpContext.cgiGet( edtElem_Consecutivo_Internalname) ;
                           A298Cata_Descripcion = GXutil.upper( httpContext.cgiGet( edtCata_Descripcion_Internalname)) ;
                           A68Invd_PlacaPadre = httpContext.cgiGet( edtInvd_PlacaPadre_Internalname) ;
                           n68Invd_PlacaPadre = false ;
                           AV23Marca = httpContext.cgiGet( edtavMarca_Internalname) ;
                           AV24Modelo = httpContext.cgiGet( edtavModelo_Internalname) ;
                           AV38Serial = httpContext.cgiGet( edtavSerial_Internalname) ;
                           A466Invd_FechaAdquisicion = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtInvd_FechaAdquisicion_Internalname), 0)) ;
                           n466Invd_FechaAdquisicion = false ;
                           AV26Observaciones = httpContext.cgiGet( edtavObservaciones_Internalname) ;
                           A629Costo_Total_Dev = localUtil.ctond( httpContext.cgiGet( edtCosto_Total_Dev_Internalname)) ;
                           A410Invd_RegionalId = localUtil.ctol( httpContext.cgiGet( edtInvd_RegionalId_Internalname), ",", ".") ;
                           A411Invd_CentroCostoId = localUtil.ctol( httpContext.cgiGet( edtInvd_CentroCostoId_Internalname), ",", ".") ;
                           cmbInvd_ModuloAlmacen.setName( cmbInvd_ModuloAlmacen.getInternalname() );
                           cmbInvd_ModuloAlmacen.setValue( httpContext.cgiGet( cmbInvd_ModuloAlmacen.getInternalname()) );
                           A412Invd_ModuloAlmacen = httpContext.cgiGet( cmbInvd_ModuloAlmacen.getInternalname()) ;
                           A413Invd_AlmacenCodigo = httpContext.cgiGet( edtInvd_AlmacenCodigo_Internalname) ;
                           A414Invd_BodegaCodigo = httpContext.cgiGet( edtInvd_BodegaCodigo_Internalname) ;
                           cmbInvd_Estado.setName( cmbInvd_Estado.getInternalname() );
                           cmbInvd_Estado.setValue( httpContext.cgiGet( cmbInvd_Estado.getInternalname()) );
                           A463Invd_Estado = httpContext.cgiGet( cmbInvd_Estado.getInternalname()) ;
                           n463Invd_Estado = false ;
                           A465Invd_ValorAdquisicion = localUtil.ctond( httpContext.cgiGet( edtInvd_ValorAdquisicion_Internalname)) ;
                           n465Invd_ValorAdquisicion = false ;
                           A625Variable_VF = localUtil.ctond( httpContext.cgiGet( edtVariable_VF_Internalname)) ;
                           n625Variable_VF = false ;
                           A627Variable_N = (short)(localUtil.ctol( httpContext.cgiGet( edtVariable_N_Internalname), ",", ".")) ;
                           n627Variable_N = false ;
                           A626Variable_I = (short)(localUtil.ctol( httpContext.cgiGet( edtVariable_I_Internalname), ",", ".")) ;
                           n626Variable_I = false ;
                           A628Otros_Costos_Dev = localUtil.ctond( httpContext.cgiGet( edtOtros_Costos_Dev_Internalname)) ;
                           n628Otros_Costos_Dev = false ;
                           A631Vida_Util_Actual = (short)(localUtil.ctol( httpContext.cgiGet( edtVida_Util_Actual_Internalname), ",", ".")) ;
                           n631Vida_Util_Actual = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e20802 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e21802 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Cinvd_numeroplaca Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCINVD_NUMEROPLACA"), AV14cInvd_NumeroPlaca) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cinvd_descripciondevolutivo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCINVD_DESCRIPCIONDEVOLUTIVO"), AV11cInvd_DescripcionDevolutivo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Celem_consecutivo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCELEM_CONSECUTIVO"), AV7cElem_Consecutivo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cinvd_placapadre Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCINVD_PLACAPADRE"), AV15cInvd_PlacaPadre) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cinvd_fechaadquisicion Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCINVD_FECHAADQUISICION"), 0), AV12cInvd_FechaAdquisicion) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e22802 ();
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

   public void we802( )
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

   public void pa802( )
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
         GXCCtl = "INVD_MODULOALMACEN_" + sGXsfl_94_idx ;
         cmbInvd_ModuloAlmacen.setName( GXCCtl );
         cmbInvd_ModuloAlmacen.setWebtags( "" );
         cmbInvd_ModuloAlmacen.addItem("", "", (short)(0));
         cmbInvd_ModuloAlmacen.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
         cmbInvd_ModuloAlmacen.addItem("INVE", "INVENTARIO", (short)(0));
         cmbInvd_ModuloAlmacen.addItem("ALMA", "ALMACEN", (short)(0));
         if ( cmbInvd_ModuloAlmacen.getItemCount() > 0 )
         {
            A412Invd_ModuloAlmacen = cmbInvd_ModuloAlmacen.getValidValue(A412Invd_ModuloAlmacen) ;
         }
         GXCCtl = "INVD_ESTADO_" + sGXsfl_94_idx ;
         cmbInvd_Estado.setName( GXCCtl );
         cmbInvd_Estado.setWebtags( "" );
         cmbInvd_Estado.addItem("R", "Ratificado", (short)(0));
         cmbInvd_Estado.addItem("P", "Pendiente", (short)(0));
         if ( cmbInvd_Estado.getItemCount() > 0 )
         {
            A463Invd_Estado = cmbInvd_Estado.getValidValue(A463Invd_Estado) ;
            n463Invd_Estado = false ;
         }
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
      subsflControlProps_942( ) ;
      while ( nGXsfl_94_idx <= nRC_GXsfl_94 )
      {
         sendrow_942( ) ;
         nGXsfl_94_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_94_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_94_idx+1)) ;
         sGXsfl_94_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_94_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_942( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  String AV14cInvd_NumeroPlaca ,
                                  String AV11cInvd_DescripcionDevolutivo ,
                                  String AV7cElem_Consecutivo ,
                                  String AV15cInvd_PlacaPadre ,
                                  java.util.Date AV12cInvd_FechaAdquisicion ,
                                  long AV45Regi_Id ,
                                  String A67Invd_NumeroPlaca ,
                                  String AV23Marca ,
                                  String AV24Modelo ,
                                  String AV38Serial ,
                                  String AV26Observaciones ,
                                  long AV41Tran_IdEntrada ,
                                  int AV25Nro_Linea ,
                                  String AV20cSerial ,
                                  String AV19cModelo ,
                                  String AV18cMarca )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID1_nCurrentRecord = 0 ;
      rf802( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_NUMEROPLACA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A67Invd_NumeroPlaca, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_NUMEROPLACA", A67Invd_NumeroPlaca);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_CONSECUTIVO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_CONSECUTIVO", A66Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_PLACAPADRE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A68Invd_PlacaPadre, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_PLACAPADRE", A68Invd_PlacaPadre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMARCA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23Marca, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMARCA", AV23Marca);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODELO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24Modelo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODELO", AV24Modelo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSERIAL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV38Serial, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vSERIAL", AV38Serial);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_FECHAADQUISICION", getSecureSignedToken( "", A466Invd_FechaAdquisicion));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_FECHAADQUISICION", localUtil.format(A466Invd_FechaAdquisicion, "99/99/99"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOBSERVACIONES", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26Observaciones, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vOBSERVACIONES", AV26Observaciones);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_COSTO_TOTAL_DEV", getSecureSignedToken( "", localUtil.format( A629Costo_Total_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "COSTO_TOTAL_DEV", GXutil.ltrim( localUtil.ntoc( A629Costo_Total_Dev, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_REGIONALID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A410Invd_RegionalId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_REGIONALID", GXutil.ltrim( localUtil.ntoc( A410Invd_RegionalId, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_CENTROCOSTOID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A411Invd_CentroCostoId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_CENTROCOSTOID", GXutil.ltrim( localUtil.ntoc( A411Invd_CentroCostoId, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_MODULOALMACEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A412Invd_ModuloAlmacen, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_MODULOALMACEN", A412Invd_ModuloAlmacen);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_ALMACENCODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A413Invd_AlmacenCodigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_ALMACENCODIGO", A413Invd_AlmacenCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_BODEGACODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A414Invd_BodegaCodigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_BODEGACODIGO", A414Invd_BodegaCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_ESTADO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A463Invd_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_ESTADO", A463Invd_Estado);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_VALORADQUISICION", getSecureSignedToken( "", localUtil.format( A465Invd_ValorAdquisicion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_VALORADQUISICION", GXutil.ltrim( localUtil.ntoc( A465Invd_ValorAdquisicion, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_VARIABLE_VF", getSecureSignedToken( "", localUtil.format( A625Variable_VF, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "VARIABLE_VF", GXutil.ltrim( localUtil.ntoc( A625Variable_VF, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_VARIABLE_N", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A627Variable_N), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "VARIABLE_N", GXutil.ltrim( localUtil.ntoc( A627Variable_N, (byte)(4), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_VARIABLE_I", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A626Variable_I), "ZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "VARIABLE_I", GXutil.ltrim( localUtil.ntoc( A626Variable_I, (byte)(3), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_OTROS_COSTOS_DEV", getSecureSignedToken( "", localUtil.format( A628Otros_Costos_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "OTROS_COSTOS_DEV", GXutil.ltrim( localUtil.ntoc( A628Otros_Costos_Dev, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_VIDA_UTIL_ACTUAL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A631Vida_Util_Actual), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "VIDA_UTIL_ACTUAL", GXutil.ltrim( localUtil.ntoc( A631Vida_Util_Actual, (byte)(4), (byte)(0), ".", "")));
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf802( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavMarca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMarca_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMarca_Enabled, 5, 0)), !bGXsfl_94_Refreshing);
      edtavModelo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavModelo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavModelo_Enabled, 5, 0)), !bGXsfl_94_Refreshing);
      edtavSerial_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSerial_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavSerial_Enabled, 5, 0)), !bGXsfl_94_Refreshing);
      edtavObservaciones_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavObservaciones_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavObservaciones_Enabled, 5, 0)), !bGXsfl_94_Refreshing);
   }

   public void rf802( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(94) ;
      nGXsfl_94_idx = (short)(1) ;
      sGXsfl_94_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_94_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_942( ) ;
      bGXsfl_94_Refreshing = true ;
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "PromptGrid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_942( ) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV14cInvd_NumeroPlaca ,
                                              AV15cInvd_PlacaPadre ,
                                              AV7cElem_Consecutivo ,
                                              AV12cInvd_FechaAdquisicion ,
                                              A67Invd_NumeroPlaca ,
                                              A68Invd_PlacaPadre ,
                                              A66Elem_Consecutivo ,
                                              A466Invd_FechaAdquisicion ,
                                              AV11cInvd_DescripcionDevolutivo ,
                                              A298Cata_Descripcion ,
                                              A463Invd_Estado ,
                                              new Long(A410Invd_RegionalId) ,
                                              new Long(AV45Regi_Id) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.LONG
                                              }
         } ) ;
         lV14cInvd_NumeroPlaca = GXutil.concat( GXutil.rtrim( AV14cInvd_NumeroPlaca), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14cInvd_NumeroPlaca", AV14cInvd_NumeroPlaca);
         lV15cInvd_PlacaPadre = GXutil.concat( GXutil.rtrim( AV15cInvd_PlacaPadre), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15cInvd_PlacaPadre", AV15cInvd_PlacaPadre);
         lV7cElem_Consecutivo = GXutil.concat( GXutil.rtrim( AV7cElem_Consecutivo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cElem_Consecutivo", AV7cElem_Consecutivo);
         /* Using cursor H00802 */
         pr_default.execute(0, new Object[] {new Long(AV45Regi_Id), lV14cInvd_NumeroPlaca, lV15cInvd_PlacaPadre, lV7cElem_Consecutivo, AV12cInvd_FechaAdquisicion});
         nGXsfl_94_idx = (short)(1) ;
         sGXsfl_94_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_94_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_942( ) ;
         GRID1_nEOF = (byte)(0) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) ) )
         {
            brk802 = false ;
            A37Cata_Codigo = H00802_A37Cata_Codigo[0] ;
            A298Cata_Descripcion = H00802_A298Cata_Descripcion[0] ;
            A463Invd_Estado = H00802_A463Invd_Estado[0] ;
            n463Invd_Estado = H00802_n463Invd_Estado[0] ;
            A68Invd_PlacaPadre = H00802_A68Invd_PlacaPadre[0] ;
            n68Invd_PlacaPadre = H00802_n68Invd_PlacaPadre[0] ;
            A66Elem_Consecutivo = H00802_A66Elem_Consecutivo[0] ;
            A466Invd_FechaAdquisicion = H00802_A466Invd_FechaAdquisicion[0] ;
            n466Invd_FechaAdquisicion = H00802_n466Invd_FechaAdquisicion[0] ;
            A410Invd_RegionalId = H00802_A410Invd_RegionalId[0] ;
            A67Invd_NumeroPlaca = H00802_A67Invd_NumeroPlaca[0] ;
            A631Vida_Util_Actual = H00802_A631Vida_Util_Actual[0] ;
            n631Vida_Util_Actual = H00802_n631Vida_Util_Actual[0] ;
            A628Otros_Costos_Dev = H00802_A628Otros_Costos_Dev[0] ;
            n628Otros_Costos_Dev = H00802_n628Otros_Costos_Dev[0] ;
            A626Variable_I = H00802_A626Variable_I[0] ;
            n626Variable_I = H00802_n626Variable_I[0] ;
            A627Variable_N = H00802_A627Variable_N[0] ;
            n627Variable_N = H00802_n627Variable_N[0] ;
            A625Variable_VF = H00802_A625Variable_VF[0] ;
            n625Variable_VF = H00802_n625Variable_VF[0] ;
            A465Invd_ValorAdquisicion = H00802_A465Invd_ValorAdquisicion[0] ;
            n465Invd_ValorAdquisicion = H00802_n465Invd_ValorAdquisicion[0] ;
            A414Invd_BodegaCodigo = H00802_A414Invd_BodegaCodigo[0] ;
            A413Invd_AlmacenCodigo = H00802_A413Invd_AlmacenCodigo[0] ;
            A412Invd_ModuloAlmacen = H00802_A412Invd_ModuloAlmacen[0] ;
            A411Invd_CentroCostoId = H00802_A411Invd_CentroCostoId[0] ;
            A629Costo_Total_Dev = H00802_A629Costo_Total_Dev[0] ;
            A37Cata_Codigo = H00802_A37Cata_Codigo[0] ;
            A298Cata_Descripcion = H00802_A298Cata_Descripcion[0] ;
            if ( (GXutil.strcmp("", AV11cInvd_DescripcionDevolutivo)==0) || ( GXutil.like( GXutil.upper( A298Cata_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV11cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) ) )
            {
               /* Execute user event: Load */
               e21802 ();
            }
            if ( ! brk802 )
            {
               brk802 = true ;
               pr_default.readNext(0);
            }
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         wbEnd = (short)(94) ;
         wb800( ) ;
      }
      bGXsfl_94_Refreshing = true ;
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
      return 10*1 ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV14cInvd_NumeroPlaca, AV11cInvd_DescripcionDevolutivo, AV7cElem_Consecutivo, AV15cInvd_PlacaPadre, AV12cInvd_FechaAdquisicion, AV45Regi_Id, A67Invd_NumeroPlaca, AV23Marca, AV24Modelo, AV38Serial, AV26Observaciones, AV41Tran_IdEntrada, AV25Nro_Linea, AV20cSerial, AV19cModelo, AV18cMarca) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV14cInvd_NumeroPlaca, AV11cInvd_DescripcionDevolutivo, AV7cElem_Consecutivo, AV15cInvd_PlacaPadre, AV12cInvd_FechaAdquisicion, AV45Regi_Id, A67Invd_NumeroPlaca, AV23Marca, AV24Modelo, AV38Serial, AV26Observaciones, AV41Tran_IdEntrada, AV25Nro_Linea, AV20cSerial, AV19cModelo, AV18cMarca) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV14cInvd_NumeroPlaca, AV11cInvd_DescripcionDevolutivo, AV7cElem_Consecutivo, AV15cInvd_PlacaPadre, AV12cInvd_FechaAdquisicion, AV45Regi_Id, A67Invd_NumeroPlaca, AV23Marca, AV24Modelo, AV38Serial, AV26Observaciones, AV41Tran_IdEntrada, AV25Nro_Linea, AV20cSerial, AV19cModelo, AV18cMarca) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid1_lastpage( )
   {
      subGrid1_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV14cInvd_NumeroPlaca, AV11cInvd_DescripcionDevolutivo, AV7cElem_Consecutivo, AV15cInvd_PlacaPadre, AV12cInvd_FechaAdquisicion, AV45Regi_Id, A67Invd_NumeroPlaca, AV23Marca, AV24Modelo, AV38Serial, AV26Observaciones, AV41Tran_IdEntrada, AV25Nro_Linea, AV20cSerial, AV19cModelo, AV18cMarca) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV14cInvd_NumeroPlaca, AV11cInvd_DescripcionDevolutivo, AV7cElem_Consecutivo, AV15cInvd_PlacaPadre, AV12cInvd_FechaAdquisicion, AV45Regi_Id, A67Invd_NumeroPlaca, AV23Marca, AV24Modelo, AV38Serial, AV26Observaciones, AV41Tran_IdEntrada, AV25Nro_Linea, AV20cSerial, AV19cModelo, AV18cMarca) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup800( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      edtavMarca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMarca_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMarca_Enabled, 5, 0)), !bGXsfl_94_Refreshing);
      edtavModelo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavModelo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavModelo_Enabled, 5, 0)), !bGXsfl_94_Refreshing);
      edtavSerial_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSerial_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavSerial_Enabled, 5, 0)), !bGXsfl_94_Refreshing);
      edtavObservaciones_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavObservaciones_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavObservaciones_Enabled, 5, 0)), !bGXsfl_94_Refreshing);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e20802 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV14cInvd_NumeroPlaca = httpContext.cgiGet( edtavCinvd_numeroplaca_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14cInvd_NumeroPlaca", AV14cInvd_NumeroPlaca);
         AV11cInvd_DescripcionDevolutivo = httpContext.cgiGet( edtavCinvd_descripciondevolutivo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cInvd_DescripcionDevolutivo", AV11cInvd_DescripcionDevolutivo);
         AV7cElem_Consecutivo = httpContext.cgiGet( edtavCelem_consecutivo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cElem_Consecutivo", AV7cElem_Consecutivo);
         AV15cInvd_PlacaPadre = httpContext.cgiGet( edtavCinvd_placapadre_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15cInvd_PlacaPadre", AV15cInvd_PlacaPadre);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCinvd_fechaadquisicion_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vCINVD_FECHAADQUISICION");
            GX_FocusControl = edtavCinvd_fechaadquisicion_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12cInvd_FechaAdquisicion = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cInvd_FechaAdquisicion", localUtil.format(AV12cInvd_FechaAdquisicion, "99/99/99"));
         }
         else
         {
            AV12cInvd_FechaAdquisicion = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavCinvd_fechaadquisicion_Internalname), 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cInvd_FechaAdquisicion", localUtil.format(AV12cInvd_FechaAdquisicion, "99/99/99"));
         }
         AV18cMarca = httpContext.cgiGet( edtavCmarca_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18cMarca", AV18cMarca);
         AV19cModelo = httpContext.cgiGet( edtavCmodelo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19cModelo", AV19cModelo);
         AV20cSerial = httpContext.cgiGet( edtavCserial_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20cSerial", AV20cSerial);
         /* Read saved values. */
         nRC_GXsfl_94 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_94"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCINVD_NUMEROPLACA"), AV14cInvd_NumeroPlaca) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCINVD_DESCRIPCIONDEVOLUTIVO"), AV11cInvd_DescripcionDevolutivo) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCELEM_CONSECUTIVO"), AV7cElem_Consecutivo) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCINVD_PLACAPADRE"), AV15cInvd_PlacaPadre) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCINVD_FECHAADQUISICION"), 0), AV12cInvd_FechaAdquisicion) ) )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e20802 ();
      if ( returnInSub )
      {
         pr_default.close(0);
         pr_default.close(0);
         pr_default.close(0);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e20802( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "Placas", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV5ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
      AV31Placas = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Placas", AV31Placas);
   }

   private void e21802( )
   {
      /* Load Routine */
      AV22LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      AV48Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      GRID1_nEOF = (byte)(0) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
      while ( ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(H00802_A67Invd_NumeroPlaca[0], A67Invd_NumeroPlaca) == 0 ) && ( H00802_A410Invd_RegionalId[0] == AV45Regi_Id ) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) ) )
      {
         brk802 = false ;
         A37Cata_Codigo = H00802_A37Cata_Codigo[0] ;
         A298Cata_Descripcion = H00802_A298Cata_Descripcion[0] ;
         A463Invd_Estado = H00802_A463Invd_Estado[0] ;
         n463Invd_Estado = H00802_n463Invd_Estado[0] ;
         A68Invd_PlacaPadre = H00802_A68Invd_PlacaPadre[0] ;
         n68Invd_PlacaPadre = H00802_n68Invd_PlacaPadre[0] ;
         A66Elem_Consecutivo = H00802_A66Elem_Consecutivo[0] ;
         A466Invd_FechaAdquisicion = H00802_A466Invd_FechaAdquisicion[0] ;
         n466Invd_FechaAdquisicion = H00802_n466Invd_FechaAdquisicion[0] ;
         A410Invd_RegionalId = H00802_A410Invd_RegionalId[0] ;
         A631Vida_Util_Actual = H00802_A631Vida_Util_Actual[0] ;
         n631Vida_Util_Actual = H00802_n631Vida_Util_Actual[0] ;
         A628Otros_Costos_Dev = H00802_A628Otros_Costos_Dev[0] ;
         n628Otros_Costos_Dev = H00802_n628Otros_Costos_Dev[0] ;
         A626Variable_I = H00802_A626Variable_I[0] ;
         n626Variable_I = H00802_n626Variable_I[0] ;
         A627Variable_N = H00802_A627Variable_N[0] ;
         n627Variable_N = H00802_n627Variable_N[0] ;
         A625Variable_VF = H00802_A625Variable_VF[0] ;
         n625Variable_VF = H00802_n625Variable_VF[0] ;
         A465Invd_ValorAdquisicion = H00802_A465Invd_ValorAdquisicion[0] ;
         n465Invd_ValorAdquisicion = H00802_n465Invd_ValorAdquisicion[0] ;
         A414Invd_BodegaCodigo = H00802_A414Invd_BodegaCodigo[0] ;
         A413Invd_AlmacenCodigo = H00802_A413Invd_AlmacenCodigo[0] ;
         A412Invd_ModuloAlmacen = H00802_A412Invd_ModuloAlmacen[0] ;
         A411Invd_CentroCostoId = H00802_A411Invd_CentroCostoId[0] ;
         A629Costo_Total_Dev = H00802_A629Costo_Total_Dev[0] ;
         A37Cata_Codigo = H00802_A37Cata_Codigo[0] ;
         A298Cata_Descripcion = H00802_A298Cata_Descripcion[0] ;
         if ( (GXutil.strcmp("", AV11cInvd_DescripcionDevolutivo)==0) || ( GXutil.like( GXutil.upper( A298Cata_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV11cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) ) )
         {
            if ( GXutil.strcmp(A463Invd_Estado, "R") == 0 )
            {
               AV29Placa = A67Invd_NumeroPlaca ;
               httpContext.ajax_rsp_assign_attri("", false, "AV29Placa", AV29Placa);
               GXv_char1[0] = AV29Placa ;
               GXv_char2[0] = AV23Marca ;
               GXv_char3[0] = AV24Modelo ;
               GXv_char4[0] = AV38Serial ;
               GXv_char5[0] = AV26Observaciones ;
               GXv_int6[0] = AV41Tran_IdEntrada ;
               GXv_int7[0] = AV25Nro_Linea ;
               new com.orions2.buscaatributos(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_char3, GXv_char4, GXv_char5, GXv_int6, GXv_int7) ;
               selecplaca_impl.this.AV29Placa = GXv_char1[0] ;
               selecplaca_impl.this.AV23Marca = GXv_char2[0] ;
               selecplaca_impl.this.AV24Modelo = GXv_char3[0] ;
               selecplaca_impl.this.AV38Serial = GXv_char4[0] ;
               selecplaca_impl.this.AV26Observaciones = GXv_char5[0] ;
               selecplaca_impl.this.AV41Tran_IdEntrada = GXv_int6[0] ;
               selecplaca_impl.this.AV25Nro_Linea = GXv_int7[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV29Placa", AV29Placa);
               httpContext.ajax_rsp_assign_attri("", false, "AV41Tran_IdEntrada", GXutil.ltrim( GXutil.str( AV41Tran_IdEntrada, 11, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "AV25Nro_Linea", GXutil.ltrim( GXutil.str( AV25Nro_Linea, 8, 0)));
               if ( (GXutil.strcmp("", AV18cMarca)==0) && (GXutil.strcmp("", AV19cModelo)==0) && (GXutil.strcmp("", AV20cSerial)==0) )
               {
                  if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
                  {
                     sendrow_942( ) ;
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
                  if ( isFullAjaxMode( ) && ! bGXsfl_94_Refreshing )
                  {
                     httpContext.doAjaxLoad(94, Grid1Row);
                  }
               }
               else if ( GXutil.like( GXutil.upper( AV23Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV18cMarca), "") , 254 , "%"),  ' ' ) && (GXutil.strcmp("", AV19cModelo)==0) && (GXutil.strcmp("", AV20cSerial)==0) )
               {
                  if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
                  {
                     sendrow_942( ) ;
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
                  if ( isFullAjaxMode( ) && ! bGXsfl_94_Refreshing )
                  {
                     httpContext.doAjaxLoad(94, Grid1Row);
                  }
               }
               else if ( GXutil.like( GXutil.upper( AV23Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV18cMarca), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV24Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV19cModelo), "") , 254 , "%"),  ' ' ) && (GXutil.strcmp("", AV20cSerial)==0) )
               {
                  if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
                  {
                     sendrow_942( ) ;
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
                  if ( isFullAjaxMode( ) && ! bGXsfl_94_Refreshing )
                  {
                     httpContext.doAjaxLoad(94, Grid1Row);
                  }
               }
               else if ( GXutil.like( GXutil.upper( AV23Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV18cMarca), "") , 254 , "%"),  ' ' ) && (GXutil.strcmp("", AV19cModelo)==0) && GXutil.like( GXutil.upper( AV38Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV20cSerial), "") , 254 , "%"),  ' ' ) )
               {
                  if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
                  {
                     sendrow_942( ) ;
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
                  if ( isFullAjaxMode( ) && ! bGXsfl_94_Refreshing )
                  {
                     httpContext.doAjaxLoad(94, Grid1Row);
                  }
               }
               else if ( GXutil.like( GXutil.upper( AV24Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV19cModelo), "") , 254 , "%"),  ' ' ) && (GXutil.strcmp("", AV18cMarca)==0) && (GXutil.strcmp("", AV20cSerial)==0) )
               {
                  if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
                  {
                     sendrow_942( ) ;
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
                  if ( isFullAjaxMode( ) && ! bGXsfl_94_Refreshing )
                  {
                     httpContext.doAjaxLoad(94, Grid1Row);
                  }
               }
               else if ( GXutil.like( GXutil.upper( AV24Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV19cModelo), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV23Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV18cMarca), "") , 254 , "%"),  ' ' ) && (GXutil.strcmp("", AV20cSerial)==0) )
               {
                  if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
                  {
                     sendrow_942( ) ;
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
                  if ( isFullAjaxMode( ) && ! bGXsfl_94_Refreshing )
                  {
                     httpContext.doAjaxLoad(94, Grid1Row);
                  }
               }
               else if ( GXutil.like( GXutil.upper( AV24Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV19cModelo), "") , 254 , "%"),  ' ' ) && (GXutil.strcmp("", AV18cMarca)==0) && GXutil.like( GXutil.upper( AV38Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV20cSerial), "") , 254 , "%"),  ' ' ) )
               {
                  if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
                  {
                     sendrow_942( ) ;
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
                  if ( isFullAjaxMode( ) && ! bGXsfl_94_Refreshing )
                  {
                     httpContext.doAjaxLoad(94, Grid1Row);
                  }
               }
               else if ( GXutil.like( GXutil.upper( AV38Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV20cSerial), "") , 254 , "%"),  ' ' ) && (GXutil.strcmp("", AV19cModelo)==0) && (GXutil.strcmp("", AV18cMarca)==0) )
               {
                  if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
                  {
                     sendrow_942( ) ;
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
                  if ( isFullAjaxMode( ) && ! bGXsfl_94_Refreshing )
                  {
                     httpContext.doAjaxLoad(94, Grid1Row);
                  }
               }
               else if ( GXutil.like( GXutil.upper( AV38Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV20cSerial), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV24Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV19cModelo), "") , 254 , "%"),  ' ' ) && (GXutil.strcmp("", AV18cMarca)==0) )
               {
                  if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
                  {
                     sendrow_942( ) ;
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
                  if ( isFullAjaxMode( ) && ! bGXsfl_94_Refreshing )
                  {
                     httpContext.doAjaxLoad(94, Grid1Row);
                  }
               }
               else if ( GXutil.like( GXutil.upper( AV38Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV20cSerial), "") , 254 , "%"),  ' ' ) && (GXutil.strcmp("", AV19cModelo)==0) && GXutil.like( GXutil.upper( AV23Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV18cMarca), "") , 254 , "%"),  ' ' ) )
               {
                  if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
                  {
                     sendrow_942( ) ;
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
                  if ( isFullAjaxMode( ) && ! bGXsfl_94_Refreshing )
                  {
                     httpContext.doAjaxLoad(94, Grid1Row);
                  }
               }
               else if ( GXutil.like( GXutil.upper( AV23Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV18cMarca), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV24Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV19cModelo), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV38Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV20cSerial), "") , 254 , "%"),  ' ' ) )
               {
                  if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
                  {
                     sendrow_942( ) ;
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
                  if ( isFullAjaxMode( ) && ! bGXsfl_94_Refreshing )
                  {
                     httpContext.doAjaxLoad(94, Grid1Row);
                  }
               }
            }
         }
         brk802 = true ;
         pr_default.readNext(0);
      }
      GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e22802 ();
      if ( returnInSub )
      {
         pr_default.close(0);
         pr_default.close(0);
         pr_default.close(0);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e22802( )
   {
      /* Enter Routine */
      AV29Placa = A67Invd_NumeroPlaca ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Placa", AV29Placa);
      httpContext.setWebReturnParms(new Object[] {AV29Placa,new Long(AV45Regi_Id),new Long(AV41Tran_IdEntrada),new Integer(AV25Nro_Linea)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(0);
      pr_default.close(0);
      pr_default.close(0);
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV29Placa = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Placa", AV29Placa);
      AV45Regi_Id = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45Regi_Id", GXutil.ltrim( GXutil.str( AV45Regi_Id, 11, 0)));
      AV41Tran_IdEntrada = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Tran_IdEntrada", GXutil.ltrim( GXutil.str( AV41Tran_IdEntrada, 11, 0)));
      AV25Nro_Linea = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Nro_Linea", GXutil.ltrim( GXutil.str( AV25Nro_Linea, 8, 0)));
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
      pa802( ) ;
      ws802( ) ;
      we802( ) ;
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
      httpContext.AddStyleSheetFile("calendar-system.css", "?14361167");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414231383");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("selecplaca.js", "?201861414231383");
      /* End function include_jscripts */
   }

   public void subsflControlProps_942( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_94_idx ;
      edtInvd_NumeroPlaca_Internalname = "INVD_NUMEROPLACA_"+sGXsfl_94_idx ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO_"+sGXsfl_94_idx ;
      edtCata_Descripcion_Internalname = "CATA_DESCRIPCION_"+sGXsfl_94_idx ;
      edtInvd_PlacaPadre_Internalname = "INVD_PLACAPADRE_"+sGXsfl_94_idx ;
      edtavMarca_Internalname = "vMARCA_"+sGXsfl_94_idx ;
      edtavModelo_Internalname = "vMODELO_"+sGXsfl_94_idx ;
      edtavSerial_Internalname = "vSERIAL_"+sGXsfl_94_idx ;
      edtInvd_FechaAdquisicion_Internalname = "INVD_FECHAADQUISICION_"+sGXsfl_94_idx ;
      edtavObservaciones_Internalname = "vOBSERVACIONES_"+sGXsfl_94_idx ;
      edtCosto_Total_Dev_Internalname = "COSTO_TOTAL_DEV_"+sGXsfl_94_idx ;
      edtInvd_RegionalId_Internalname = "INVD_REGIONALID_"+sGXsfl_94_idx ;
      edtInvd_CentroCostoId_Internalname = "INVD_CENTROCOSTOID_"+sGXsfl_94_idx ;
      cmbInvd_ModuloAlmacen.setInternalname( "INVD_MODULOALMACEN_"+sGXsfl_94_idx );
      edtInvd_AlmacenCodigo_Internalname = "INVD_ALMACENCODIGO_"+sGXsfl_94_idx ;
      edtInvd_BodegaCodigo_Internalname = "INVD_BODEGACODIGO_"+sGXsfl_94_idx ;
      cmbInvd_Estado.setInternalname( "INVD_ESTADO_"+sGXsfl_94_idx );
      edtInvd_ValorAdquisicion_Internalname = "INVD_VALORADQUISICION_"+sGXsfl_94_idx ;
      edtVariable_VF_Internalname = "VARIABLE_VF_"+sGXsfl_94_idx ;
      edtVariable_N_Internalname = "VARIABLE_N_"+sGXsfl_94_idx ;
      edtVariable_I_Internalname = "VARIABLE_I_"+sGXsfl_94_idx ;
      edtOtros_Costos_Dev_Internalname = "OTROS_COSTOS_DEV_"+sGXsfl_94_idx ;
      edtVida_Util_Actual_Internalname = "VIDA_UTIL_ACTUAL_"+sGXsfl_94_idx ;
   }

   public void subsflControlProps_fel_942( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_94_fel_idx ;
      edtInvd_NumeroPlaca_Internalname = "INVD_NUMEROPLACA_"+sGXsfl_94_fel_idx ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO_"+sGXsfl_94_fel_idx ;
      edtCata_Descripcion_Internalname = "CATA_DESCRIPCION_"+sGXsfl_94_fel_idx ;
      edtInvd_PlacaPadre_Internalname = "INVD_PLACAPADRE_"+sGXsfl_94_fel_idx ;
      edtavMarca_Internalname = "vMARCA_"+sGXsfl_94_fel_idx ;
      edtavModelo_Internalname = "vMODELO_"+sGXsfl_94_fel_idx ;
      edtavSerial_Internalname = "vSERIAL_"+sGXsfl_94_fel_idx ;
      edtInvd_FechaAdquisicion_Internalname = "INVD_FECHAADQUISICION_"+sGXsfl_94_fel_idx ;
      edtavObservaciones_Internalname = "vOBSERVACIONES_"+sGXsfl_94_fel_idx ;
      edtCosto_Total_Dev_Internalname = "COSTO_TOTAL_DEV_"+sGXsfl_94_fel_idx ;
      edtInvd_RegionalId_Internalname = "INVD_REGIONALID_"+sGXsfl_94_fel_idx ;
      edtInvd_CentroCostoId_Internalname = "INVD_CENTROCOSTOID_"+sGXsfl_94_fel_idx ;
      cmbInvd_ModuloAlmacen.setInternalname( "INVD_MODULOALMACEN_"+sGXsfl_94_fel_idx );
      edtInvd_AlmacenCodigo_Internalname = "INVD_ALMACENCODIGO_"+sGXsfl_94_fel_idx ;
      edtInvd_BodegaCodigo_Internalname = "INVD_BODEGACODIGO_"+sGXsfl_94_fel_idx ;
      cmbInvd_Estado.setInternalname( "INVD_ESTADO_"+sGXsfl_94_fel_idx );
      edtInvd_ValorAdquisicion_Internalname = "INVD_VALORADQUISICION_"+sGXsfl_94_fel_idx ;
      edtVariable_VF_Internalname = "VARIABLE_VF_"+sGXsfl_94_fel_idx ;
      edtVariable_N_Internalname = "VARIABLE_N_"+sGXsfl_94_fel_idx ;
      edtVariable_I_Internalname = "VARIABLE_I_"+sGXsfl_94_fel_idx ;
      edtOtros_Costos_Dev_Internalname = "OTROS_COSTOS_DEV_"+sGXsfl_94_fel_idx ;
      edtVida_Util_Actual_Internalname = "VIDA_UTIL_ACTUAL_"+sGXsfl_94_fel_idx ;
   }

   public void sendrow_942( )
   {
      subsflControlProps_942( ) ;
      wb800( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_94_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_94_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"PromptGrid"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_94_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Active Bitmap Variable */
         TempTags = " " + ((edtavLinkselection_Enabled!=0)&&(edtavLinkselection_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 95,'',false,'',94)\"" : " ") ;
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV22LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV22LinkSelection)==0)&&(GXutil.strcmp("", AV48Linkselection_GXI)==0))||!(GXutil.strcmp("", AV22LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV22LinkSelection)==0) ? AV48Linkselection_GXI : httpContext.getResourceRelative(AV22LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","",new Integer(1),new Integer(1),new Integer(20),"px",new Integer(18),"px",new Integer(0),new Integer(0),new Integer(5),edtavLinkselection_Jsonclick,"'"+""+"'"+",false,"+"'"+"EENTER."+sGXsfl_94_idx+"'",StyleString,ClassString,"WWActionColumn","","",""+TempTags,"","",new Integer(1),new Boolean(AV22LinkSelection_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_NumeroPlaca_Internalname,A67Invd_NumeroPlaca,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInvd_NumeroPlaca_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(80),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(94),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtElem_Consecutivo_Internalname,A66Elem_Consecutivo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtElem_Consecutivo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(85),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(94),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCata_Descripcion_Internalname,A298Cata_Descripcion,GXutil.rtrim( localUtil.format( A298Cata_Descripcion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCata_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(100),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(94),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_PlacaPadre_Internalname,A68Invd_PlacaPadre,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInvd_PlacaPadre_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(85),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(94),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMarca_Enabled!=0)&&(edtavMarca_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 100,'',false,'"+sGXsfl_94_idx+"',94)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMarca_Internalname,AV23Marca,"",TempTags+((edtavMarca_Enabled!=0)&&(edtavMarca_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavMarca_Enabled!=0)&&(edtavMarca_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,100);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMarca_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavMarca_Enabled),new Integer(0),"text","",new Integer(80),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(94),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavModelo_Enabled!=0)&&(edtavModelo_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 101,'',false,'"+sGXsfl_94_idx+"',94)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavModelo_Internalname,AV24Modelo,"",TempTags+((edtavModelo_Enabled!=0)&&(edtavModelo_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavModelo_Enabled!=0)&&(edtavModelo_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,101);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavModelo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavModelo_Enabled),new Integer(0),"text","",new Integer(80),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(94),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavSerial_Enabled!=0)&&(edtavSerial_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 102,'',false,'"+sGXsfl_94_idx+"',94)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSerial_Internalname,AV38Serial,"",TempTags+((edtavSerial_Enabled!=0)&&(edtavSerial_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavSerial_Enabled!=0)&&(edtavSerial_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,102);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSerial_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavSerial_Enabled),new Integer(0),"text","",new Integer(80),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(94),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_FechaAdquisicion_Internalname,localUtil.format(A466Invd_FechaAdquisicion, "99/99/99"),localUtil.format( A466Invd_FechaAdquisicion, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInvd_FechaAdquisicion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(80),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(94),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Fecha","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavObservaciones_Enabled!=0)&&(edtavObservaciones_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 104,'',false,'"+sGXsfl_94_idx+"',94)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavObservaciones_Internalname,AV26Observaciones,"",TempTags+((edtavObservaciones_Enabled!=0)&&(edtavObservaciones_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavObservaciones_Enabled!=0)&&(edtavObservaciones_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,104);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavObservaciones_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavObservaciones_Enabled),new Integer(0),"text","",new Integer(150),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(94),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCosto_Total_Dev_Internalname,GXutil.ltrim( localUtil.ntoc( A629Costo_Total_Dev, (byte)(24), (byte)(2), ",", "")),localUtil.format( A629Costo_Total_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCosto_Total_Dev_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(80),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(94),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Valor","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         edtInvd_RegionalId_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( AV29Placa)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV45Regi_Id, (byte)(11), (byte)(0), ",", "")))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV41Tran_IdEntrada, (byte)(11), (byte)(0), ",", "")))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV25Nro_Linea, (byte)(8), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtInvd_RegionalId_Internalname, "Link", edtInvd_RegionalId_Link, !bGXsfl_94_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_RegionalId_Internalname,GXutil.ltrim( localUtil.ntoc( A410Invd_RegionalId, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A410Invd_RegionalId), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'",edtInvd_RegionalId_Link,"","","",edtInvd_RegionalId_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(94),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_CentroCostoId_Internalname,GXutil.ltrim( localUtil.ntoc( A411Invd_CentroCostoId, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A411Invd_CentroCostoId), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInvd_CentroCostoId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(94),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( nGXsfl_94_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "INVD_MODULOALMACEN_" + sGXsfl_94_idx ;
            cmbInvd_ModuloAlmacen.setName( GXCCtl );
            cmbInvd_ModuloAlmacen.setWebtags( "" );
            cmbInvd_ModuloAlmacen.addItem("", "", (short)(0));
            cmbInvd_ModuloAlmacen.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
            cmbInvd_ModuloAlmacen.addItem("INVE", "INVENTARIO", (short)(0));
            cmbInvd_ModuloAlmacen.addItem("ALMA", "ALMACEN", (short)(0));
            if ( cmbInvd_ModuloAlmacen.getItemCount() > 0 )
            {
               A412Invd_ModuloAlmacen = cmbInvd_ModuloAlmacen.getValidValue(A412Invd_ModuloAlmacen) ;
            }
         }
         /* ComboBox */
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbInvd_ModuloAlmacen,cmbInvd_ModuloAlmacen.getInternalname(),GXutil.rtrim( A412Invd_ModuloAlmacen),new Integer(1),cmbInvd_ModuloAlmacen.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(0),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn OptionalColumn","","",new Boolean(true)});
         cmbInvd_ModuloAlmacen.setValue( GXutil.rtrim( A412Invd_ModuloAlmacen) );
         httpContext.ajax_rsp_assign_prop("", false, cmbInvd_ModuloAlmacen.getInternalname(), "Values", cmbInvd_ModuloAlmacen.ToJavascriptSource(), !bGXsfl_94_Refreshing);
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_AlmacenCodigo_Internalname,A413Invd_AlmacenCodigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInvd_AlmacenCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(94),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_BodegaCodigo_Internalname,A414Invd_BodegaCodigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInvd_BodegaCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(94),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( nGXsfl_94_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "INVD_ESTADO_" + sGXsfl_94_idx ;
            cmbInvd_Estado.setName( GXCCtl );
            cmbInvd_Estado.setWebtags( "" );
            cmbInvd_Estado.addItem("R", "Ratificado", (short)(0));
            cmbInvd_Estado.addItem("P", "Pendiente", (short)(0));
            if ( cmbInvd_Estado.getItemCount() > 0 )
            {
               A463Invd_Estado = cmbInvd_Estado.getValidValue(A463Invd_Estado) ;
               n463Invd_Estado = false ;
            }
         }
         /* ComboBox */
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbInvd_Estado,cmbInvd_Estado.getInternalname(),GXutil.rtrim( A463Invd_Estado),new Integer(1),cmbInvd_Estado.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(0),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn OptionalColumn","","",new Boolean(true)});
         cmbInvd_Estado.setValue( GXutil.rtrim( A463Invd_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbInvd_Estado.getInternalname(), "Values", cmbInvd_Estado.ToJavascriptSource(), !bGXsfl_94_Refreshing);
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_ValorAdquisicion_Internalname,GXutil.ltrim( localUtil.ntoc( A465Invd_ValorAdquisicion, (byte)(24), (byte)(2), ",", "")),localUtil.format( A465Invd_ValorAdquisicion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInvd_ValorAdquisicion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(94),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Valor","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVariable_VF_Internalname,GXutil.ltrim( localUtil.ntoc( A625Variable_VF, (byte)(24), (byte)(2), ",", "")),localUtil.format( A625Variable_VF, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVariable_VF_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(94),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Valor","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVariable_N_Internalname,GXutil.ltrim( localUtil.ntoc( A627Variable_N, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A627Variable_N), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVariable_N_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(94),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVariable_I_Internalname,GXutil.ltrim( localUtil.ntoc( A626Variable_I, (byte)(3), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A626Variable_I), "ZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVariable_I_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(94),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOtros_Costos_Dev_Internalname,GXutil.ltrim( localUtil.ntoc( A628Otros_Costos_Dev, (byte)(24), (byte)(2), ",", "")),localUtil.format( A628Otros_Costos_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOtros_Costos_Dev_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(94),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Valor","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVida_Util_Actual_Internalname,GXutil.ltrim( localUtil.ntoc( A631Vida_Util_Actual, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A631Vida_Util_Actual), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVida_Util_Actual_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(94),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_NUMEROPLACA"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, GXutil.rtrim( localUtil.format( A67Invd_NumeroPlaca, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_CONSECUTIVO"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_PLACAPADRE"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, GXutil.rtrim( localUtil.format( A68Invd_PlacaPadre, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMARCA"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, GXutil.rtrim( localUtil.format( AV23Marca, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODELO"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, GXutil.rtrim( localUtil.format( AV24Modelo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSERIAL"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, GXutil.rtrim( localUtil.format( AV38Serial, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_FECHAADQUISICION"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, A466Invd_FechaAdquisicion));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOBSERVACIONES"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, GXutil.rtrim( localUtil.format( AV26Observaciones, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_COSTO_TOTAL_DEV"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, localUtil.format( A629Costo_Total_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_REGIONALID"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, localUtil.format( DecimalUtil.doubleToDec(A410Invd_RegionalId), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_CENTROCOSTOID"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, localUtil.format( DecimalUtil.doubleToDec(A411Invd_CentroCostoId), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_MODULOALMACEN"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, GXutil.rtrim( localUtil.format( A412Invd_ModuloAlmacen, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_ALMACENCODIGO"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, GXutil.rtrim( localUtil.format( A413Invd_AlmacenCodigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_BODEGACODIGO"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, GXutil.rtrim( localUtil.format( A414Invd_BodegaCodigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_ESTADO"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, GXutil.rtrim( localUtil.format( A463Invd_Estado, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_VALORADQUISICION"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, localUtil.format( A465Invd_ValorAdquisicion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_VARIABLE_VF"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, localUtil.format( A625Variable_VF, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_VARIABLE_N"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, localUtil.format( DecimalUtil.doubleToDec(A627Variable_N), "ZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_VARIABLE_I"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, localUtil.format( DecimalUtil.doubleToDec(A626Variable_I), "ZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_OTROS_COSTOS_DEV"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, localUtil.format( A628Otros_Costos_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_VIDA_UTIL_ACTUAL"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, localUtil.format( DecimalUtil.doubleToDec(A631Vida_Util_Actual), "ZZZ9")));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_94_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_94_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_94_idx+1)) ;
         sGXsfl_94_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_94_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_942( ) ;
      }
      /* End function sendrow_942 */
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
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtInvd_NumeroPlaca_Internalname = "INVD_NUMEROPLACA" ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO" ;
      edtCata_Descripcion_Internalname = "CATA_DESCRIPCION" ;
      edtInvd_PlacaPadre_Internalname = "INVD_PLACAPADRE" ;
      edtavMarca_Internalname = "vMARCA" ;
      edtavModelo_Internalname = "vMODELO" ;
      edtavSerial_Internalname = "vSERIAL" ;
      edtInvd_FechaAdquisicion_Internalname = "INVD_FECHAADQUISICION" ;
      edtavObservaciones_Internalname = "vOBSERVACIONES" ;
      edtCosto_Total_Dev_Internalname = "COSTO_TOTAL_DEV" ;
      edtInvd_RegionalId_Internalname = "INVD_REGIONALID" ;
      edtInvd_CentroCostoId_Internalname = "INVD_CENTROCOSTOID" ;
      cmbInvd_ModuloAlmacen.setInternalname( "INVD_MODULOALMACEN" );
      edtInvd_AlmacenCodigo_Internalname = "INVD_ALMACENCODIGO" ;
      edtInvd_BodegaCodigo_Internalname = "INVD_BODEGACODIGO" ;
      cmbInvd_Estado.setInternalname( "INVD_ESTADO" );
      edtInvd_ValorAdquisicion_Internalname = "INVD_VALORADQUISICION" ;
      edtVariable_VF_Internalname = "VARIABLE_VF" ;
      edtVariable_N_Internalname = "VARIABLE_N" ;
      edtVariable_I_Internalname = "VARIABLE_I" ;
      edtOtros_Costos_Dev_Internalname = "OTROS_COSTOS_DEV" ;
      edtVida_Util_Actual_Internalname = "VIDA_UTIL_ACTUAL" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      divGridtable_Internalname = "GRIDTABLE" ;
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
      edtVida_Util_Actual_Jsonclick = "" ;
      edtOtros_Costos_Dev_Jsonclick = "" ;
      edtVariable_I_Jsonclick = "" ;
      edtVariable_N_Jsonclick = "" ;
      edtVariable_VF_Jsonclick = "" ;
      edtInvd_ValorAdquisicion_Jsonclick = "" ;
      cmbInvd_Estado.setJsonclick( "" );
      edtInvd_BodegaCodigo_Jsonclick = "" ;
      edtInvd_AlmacenCodigo_Jsonclick = "" ;
      cmbInvd_ModuloAlmacen.setJsonclick( "" );
      edtInvd_CentroCostoId_Jsonclick = "" ;
      edtInvd_RegionalId_Jsonclick = "" ;
      edtCosto_Total_Dev_Jsonclick = "" ;
      edtavObservaciones_Jsonclick = "" ;
      edtavObservaciones_Visible = -1 ;
      edtInvd_FechaAdquisicion_Jsonclick = "" ;
      edtavSerial_Jsonclick = "" ;
      edtavSerial_Visible = -1 ;
      edtavModelo_Jsonclick = "" ;
      edtavModelo_Visible = -1 ;
      edtavMarca_Jsonclick = "" ;
      edtavMarca_Visible = -1 ;
      edtInvd_PlacaPadre_Jsonclick = "" ;
      edtCata_Descripcion_Jsonclick = "" ;
      edtElem_Consecutivo_Jsonclick = "" ;
      edtInvd_NumeroPlaca_Jsonclick = "" ;
      edtavLinkselection_Jsonclick = "" ;
      edtavLinkselection_Visible = -1 ;
      edtavLinkselection_Enabled = 1 ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtInvd_RegionalId_Link = "" ;
      edtavObservaciones_Enabled = 1 ;
      edtavSerial_Enabled = 1 ;
      edtavModelo_Enabled = 1 ;
      edtavMarca_Enabled = 1 ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
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
      divElem_consecutivofiltercontainer_Class = "AdvancedContainerItem" ;
      divInvd_placapadrefiltercontainer_Class = "AdvancedContainerItem" ;
      divInvd_descripcionidfiltercontainer_Class = "AdvancedContainerItem" ;
      divInvd_numeroplacafiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selec Placa" );
      subGrid1_Rows = 10 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV14cInvd_NumeroPlaca',fld:'vCINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV11cInvd_DescripcionDevolutivo',fld:'vCINVD_DESCRIPCIONDEVOLUTIVO',pic:'',nv:''},{av:'AV7cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV15cInvd_PlacaPadre',fld:'vCINVD_PLACAPADRE',pic:'',nv:''},{av:'AV12cInvd_FechaAdquisicion',fld:'vCINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV45Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',hsh:true,nv:''},{av:'AV23Marca',fld:'vMARCA',pic:'',hsh:true,nv:''},{av:'AV24Modelo',fld:'vMODELO',pic:'',hsh:true,nv:''},{av:'AV38Serial',fld:'vSERIAL',pic:'',hsh:true,nv:''},{av:'AV26Observaciones',fld:'vOBSERVACIONES',pic:'',hsh:true,nv:''},{av:'AV41Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV25Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV20cSerial',fld:'vCSERIAL',pic:'',nv:''},{av:'AV19cModelo',fld:'vCMODELO',pic:'',nv:''},{av:'AV18cMarca',fld:'vCMARCA',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e19801',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLINVD_NUMEROPLACAFILTER.CLICK","{handler:'e11801',iparms:[{av:'divInvd_numeroplacafiltercontainer_Class',ctrl:'INVD_NUMEROPLACAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_numeroplacafiltercontainer_Class',ctrl:'INVD_NUMEROPLACAFILTERCONTAINER',prop:'Class'},{av:'edtavCinvd_numeroplaca_Visible',ctrl:'vCINVD_NUMEROPLACA',prop:'Visible'}]}");
      setEventMetadata("LBLINVD_DESCRIPCIONIDFILTER.CLICK","{handler:'e12801',iparms:[{av:'divInvd_descripcionidfiltercontainer_Class',ctrl:'INVD_DESCRIPCIONIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_descripcionidfiltercontainer_Class',ctrl:'INVD_DESCRIPCIONIDFILTERCONTAINER',prop:'Class'},{av:'edtavCinvd_descripciondevolutivo_Visible',ctrl:'vCINVD_DESCRIPCIONDEVOLUTIVO',prop:'Visible'}]}");
      setEventMetadata("LBLINVD_PLACAPADREFILTER.CLICK","{handler:'e14801',iparms:[{av:'divInvd_placapadrefiltercontainer_Class',ctrl:'INVD_PLACAPADREFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_placapadrefiltercontainer_Class',ctrl:'INVD_PLACAPADREFILTERCONTAINER',prop:'Class'},{av:'edtavCinvd_placapadre_Visible',ctrl:'vCINVD_PLACAPADRE',prop:'Visible'}]}");
      setEventMetadata("LBLELEM_CONSECUTIVOFILTER.CLICK","{handler:'e13801',iparms:[{av:'divElem_consecutivofiltercontainer_Class',ctrl:'ELEM_CONSECUTIVOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divElem_consecutivofiltercontainer_Class',ctrl:'ELEM_CONSECUTIVOFILTERCONTAINER',prop:'Class'},{av:'edtavCelem_consecutivo_Visible',ctrl:'vCELEM_CONSECUTIVO',prop:'Visible'}]}");
      setEventMetadata("LBLFECHAFILTER.CLICK","{handler:'e15801',iparms:[{av:'divInvd_fechafiltercontainer_Class',ctrl:'INVD_FECHAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_fechafiltercontainer_Class',ctrl:'INVD_FECHAFILTERCONTAINER',prop:'Class'},{av:'edtavCinvd_fechaadquisicion_Visible',ctrl:'vCINVD_FECHAADQUISICION',prop:'Visible'}]}");
      setEventMetadata("LBLMARCAFILTER.CLICK","{handler:'e16801',iparms:[{av:'divInvd_marcafiltercontainer_Class',ctrl:'INVD_MARCAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_marcafiltercontainer_Class',ctrl:'INVD_MARCAFILTERCONTAINER',prop:'Class'},{av:'edtavCmarca_Visible',ctrl:'vCMARCA',prop:'Visible'}]}");
      setEventMetadata("LBLMODELOFILTER.CLICK","{handler:'e17801',iparms:[{av:'divInvd_modelofiltercontainer_Class',ctrl:'INVD_MODELOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_modelofiltercontainer_Class',ctrl:'INVD_MODELOFILTERCONTAINER',prop:'Class'},{av:'edtavCmodelo_Visible',ctrl:'vCMODELO',prop:'Visible'}]}");
      setEventMetadata("LBLSERIALFILTER.CLICK","{handler:'e18801',iparms:[{av:'divInvd_serialfiltercontainer_Class',ctrl:'INVD_SERIALFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_serialfiltercontainer_Class',ctrl:'INVD_SERIALFILTERCONTAINER',prop:'Class'},{av:'edtavCserial_Visible',ctrl:'vCSERIAL',prop:'Visible'}]}");
      setEventMetadata("ENTER","{handler:'e22802',iparms:[{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',hsh:true,nv:''},{av:'AV25Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV41Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV45Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',nv:0}],oparms:[{av:'AV29Placa',fld:'vPLACA',pic:'',nv:''}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV14cInvd_NumeroPlaca',fld:'vCINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV11cInvd_DescripcionDevolutivo',fld:'vCINVD_DESCRIPCIONDEVOLUTIVO',pic:'',nv:''},{av:'AV7cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV15cInvd_PlacaPadre',fld:'vCINVD_PLACAPADRE',pic:'',nv:''},{av:'AV12cInvd_FechaAdquisicion',fld:'vCINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV45Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',hsh:true,nv:''},{av:'AV23Marca',fld:'vMARCA',pic:'',hsh:true,nv:''},{av:'AV24Modelo',fld:'vMODELO',pic:'',hsh:true,nv:''},{av:'AV38Serial',fld:'vSERIAL',pic:'',hsh:true,nv:''},{av:'AV26Observaciones',fld:'vOBSERVACIONES',pic:'',hsh:true,nv:''},{av:'AV41Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV25Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV20cSerial',fld:'vCSERIAL',pic:'',nv:''},{av:'AV19cModelo',fld:'vCMODELO',pic:'',nv:''},{av:'AV18cMarca',fld:'vCMARCA',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV14cInvd_NumeroPlaca',fld:'vCINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV11cInvd_DescripcionDevolutivo',fld:'vCINVD_DESCRIPCIONDEVOLUTIVO',pic:'',nv:''},{av:'AV7cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV15cInvd_PlacaPadre',fld:'vCINVD_PLACAPADRE',pic:'',nv:''},{av:'AV12cInvd_FechaAdquisicion',fld:'vCINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV45Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',hsh:true,nv:''},{av:'AV23Marca',fld:'vMARCA',pic:'',hsh:true,nv:''},{av:'AV24Modelo',fld:'vMODELO',pic:'',hsh:true,nv:''},{av:'AV38Serial',fld:'vSERIAL',pic:'',hsh:true,nv:''},{av:'AV26Observaciones',fld:'vOBSERVACIONES',pic:'',hsh:true,nv:''},{av:'AV41Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV25Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV20cSerial',fld:'vCSERIAL',pic:'',nv:''},{av:'AV19cModelo',fld:'vCMODELO',pic:'',nv:''},{av:'AV18cMarca',fld:'vCMARCA',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV14cInvd_NumeroPlaca',fld:'vCINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV11cInvd_DescripcionDevolutivo',fld:'vCINVD_DESCRIPCIONDEVOLUTIVO',pic:'',nv:''},{av:'AV7cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV15cInvd_PlacaPadre',fld:'vCINVD_PLACAPADRE',pic:'',nv:''},{av:'AV12cInvd_FechaAdquisicion',fld:'vCINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV45Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',hsh:true,nv:''},{av:'AV23Marca',fld:'vMARCA',pic:'',hsh:true,nv:''},{av:'AV24Modelo',fld:'vMODELO',pic:'',hsh:true,nv:''},{av:'AV38Serial',fld:'vSERIAL',pic:'',hsh:true,nv:''},{av:'AV26Observaciones',fld:'vOBSERVACIONES',pic:'',hsh:true,nv:''},{av:'AV41Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV25Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV20cSerial',fld:'vCSERIAL',pic:'',nv:''},{av:'AV19cModelo',fld:'vCMODELO',pic:'',nv:''},{av:'AV18cMarca',fld:'vCMARCA',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV14cInvd_NumeroPlaca',fld:'vCINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV11cInvd_DescripcionDevolutivo',fld:'vCINVD_DESCRIPCIONDEVOLUTIVO',pic:'',nv:''},{av:'AV7cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV15cInvd_PlacaPadre',fld:'vCINVD_PLACAPADRE',pic:'',nv:''},{av:'AV12cInvd_FechaAdquisicion',fld:'vCINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV45Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',hsh:true,nv:''},{av:'AV23Marca',fld:'vMARCA',pic:'',hsh:true,nv:''},{av:'AV24Modelo',fld:'vMODELO',pic:'',hsh:true,nv:''},{av:'AV38Serial',fld:'vSERIAL',pic:'',hsh:true,nv:''},{av:'AV26Observaciones',fld:'vOBSERVACIONES',pic:'',hsh:true,nv:''},{av:'AV41Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV25Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV20cSerial',fld:'vCSERIAL',pic:'',nv:''},{av:'AV19cModelo',fld:'vCMODELO',pic:'',nv:''},{av:'AV18cMarca',fld:'vCMARCA',pic:'',nv:''}],oparms:[]}");
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
      pr_default.close(0);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV14cInvd_NumeroPlaca = "" ;
      AV11cInvd_DescripcionDevolutivo = "" ;
      AV7cElem_Consecutivo = "" ;
      AV15cInvd_PlacaPadre = "" ;
      AV12cInvd_FechaAdquisicion = GXutil.nullDate() ;
      A67Invd_NumeroPlaca = "" ;
      AV23Marca = "" ;
      AV24Modelo = "" ;
      AV38Serial = "" ;
      AV26Observaciones = "" ;
      AV20cSerial = "" ;
      AV19cModelo = "" ;
      AV18cMarca = "" ;
      GXKey = "" ;
      AV29Placa = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblinvd_numeroplacafilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblinvd_descripcionidfilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblLblelem_consecutivofilter_Jsonclick = "" ;
      lblLblinvd_placapadrefilter_Jsonclick = "" ;
      lblLblfechafilter_Jsonclick = "" ;
      lblLblmarcafilter_Jsonclick = "" ;
      lblLblmodelofilter_Jsonclick = "" ;
      lblLblserialfilter_Jsonclick = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV22LinkSelection = "" ;
      A66Elem_Consecutivo = "" ;
      A298Cata_Descripcion = "" ;
      A68Invd_PlacaPadre = "" ;
      A466Invd_FechaAdquisicion = GXutil.nullDate() ;
      A629Costo_Total_Dev = DecimalUtil.ZERO ;
      A412Invd_ModuloAlmacen = "" ;
      A413Invd_AlmacenCodigo = "" ;
      A414Invd_BodegaCodigo = "" ;
      A463Invd_Estado = "" ;
      A465Invd_ValorAdquisicion = DecimalUtil.ZERO ;
      A625Variable_VF = DecimalUtil.ZERO ;
      A628Otros_Costos_Dev = DecimalUtil.ZERO ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV48Linkselection_GXI = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV14cInvd_NumeroPlaca = "" ;
      lV15cInvd_PlacaPadre = "" ;
      lV7cElem_Consecutivo = "" ;
      H00802_A37Cata_Codigo = new String[] {""} ;
      H00802_A298Cata_Descripcion = new String[] {""} ;
      H00802_A463Invd_Estado = new String[] {""} ;
      H00802_n463Invd_Estado = new boolean[] {false} ;
      H00802_A68Invd_PlacaPadre = new String[] {""} ;
      H00802_n68Invd_PlacaPadre = new boolean[] {false} ;
      H00802_A66Elem_Consecutivo = new String[] {""} ;
      H00802_A466Invd_FechaAdquisicion = new java.util.Date[] {GXutil.nullDate()} ;
      H00802_n466Invd_FechaAdquisicion = new boolean[] {false} ;
      H00802_A410Invd_RegionalId = new long[1] ;
      H00802_A67Invd_NumeroPlaca = new String[] {""} ;
      H00802_A631Vida_Util_Actual = new short[1] ;
      H00802_n631Vida_Util_Actual = new boolean[] {false} ;
      H00802_A628Otros_Costos_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00802_n628Otros_Costos_Dev = new boolean[] {false} ;
      H00802_A626Variable_I = new short[1] ;
      H00802_n626Variable_I = new boolean[] {false} ;
      H00802_A627Variable_N = new short[1] ;
      H00802_n627Variable_N = new boolean[] {false} ;
      H00802_A625Variable_VF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00802_n625Variable_VF = new boolean[] {false} ;
      H00802_A465Invd_ValorAdquisicion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00802_n465Invd_ValorAdquisicion = new boolean[] {false} ;
      H00802_A414Invd_BodegaCodigo = new String[] {""} ;
      H00802_A413Invd_AlmacenCodigo = new String[] {""} ;
      H00802_A412Invd_ModuloAlmacen = new String[] {""} ;
      H00802_A411Invd_CentroCostoId = new long[1] ;
      H00802_A629Costo_Total_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A37Cata_Codigo = "" ;
      AV5ADVANCED_LABEL_TEMPLATE = "" ;
      AV31Placas = "" ;
      GXv_char1 = new String [1] ;
      GXv_char2 = new String [1] ;
      GXv_char3 = new String [1] ;
      GXv_char4 = new String [1] ;
      GXv_char5 = new String [1] ;
      GXv_int6 = new long [1] ;
      GXv_int7 = new int [1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.selecplaca__default(),
         new Object[] {
             new Object[] {
            H00802_A37Cata_Codigo, H00802_A298Cata_Descripcion, H00802_A463Invd_Estado, H00802_n463Invd_Estado, H00802_A68Invd_PlacaPadre, H00802_n68Invd_PlacaPadre, H00802_A66Elem_Consecutivo, H00802_A466Invd_FechaAdquisicion, H00802_n466Invd_FechaAdquisicion, H00802_A410Invd_RegionalId,
            H00802_A67Invd_NumeroPlaca, H00802_A631Vida_Util_Actual, H00802_n631Vida_Util_Actual, H00802_A628Otros_Costos_Dev, H00802_n628Otros_Costos_Dev, H00802_A626Variable_I, H00802_n626Variable_I, H00802_A627Variable_N, H00802_n627Variable_N, H00802_A625Variable_VF,
            H00802_n625Variable_VF, H00802_A465Invd_ValorAdquisicion, H00802_n465Invd_ValorAdquisicion, H00802_A414Invd_BodegaCodigo, H00802_A413Invd_AlmacenCodigo, H00802_A412Invd_ModuloAlmacen, H00802_A411Invd_CentroCostoId, H00802_A629Costo_Total_Dev
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavMarca_Enabled = 0 ;
      edtavModelo_Enabled = 0 ;
      edtavSerial_Enabled = 0 ;
      edtavObservaciones_Enabled = 0 ;
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
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short nRC_GXsfl_94 ;
   private short nGXsfl_94_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short A627Variable_N ;
   private short A626Variable_I ;
   private short A631Vida_Util_Actual ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid1_Rows ;
   private int AV25Nro_Linea ;
   private int edtavCinvd_numeroplaca_Visible ;
   private int edtavCinvd_numeroplaca_Enabled ;
   private int edtavCinvd_descripciondevolutivo_Visible ;
   private int edtavCinvd_descripciondevolutivo_Enabled ;
   private int edtavCelem_consecutivo_Visible ;
   private int edtavCelem_consecutivo_Enabled ;
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
   private int edtavMarca_Enabled ;
   private int edtavModelo_Enabled ;
   private int edtavSerial_Enabled ;
   private int edtavObservaciones_Enabled ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GXv_int7[] ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int edtavLinkselection_Enabled ;
   private int edtavLinkselection_Visible ;
   private int edtavMarca_Visible ;
   private int edtavModelo_Visible ;
   private int edtavSerial_Visible ;
   private int edtavObservaciones_Visible ;
   private long wcpOAV45Regi_Id ;
   private long AV45Regi_Id ;
   private long AV41Tran_IdEntrada ;
   private long GRID1_nFirstRecordOnPage ;
   private long A410Invd_RegionalId ;
   private long A411Invd_CentroCostoId ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private long GXv_int6[] ;
   private java.math.BigDecimal A629Costo_Total_Dev ;
   private java.math.BigDecimal A465Invd_ValorAdquisicion ;
   private java.math.BigDecimal A625Variable_VF ;
   private java.math.BigDecimal A628Otros_Costos_Dev ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divInvd_numeroplacafiltercontainer_Class ;
   private String divInvd_descripcionidfiltercontainer_Class ;
   private String divInvd_placapadrefiltercontainer_Class ;
   private String divElem_consecutivofiltercontainer_Class ;
   private String divInvd_fechafiltercontainer_Class ;
   private String divInvd_marcafiltercontainer_Class ;
   private String divInvd_modelofiltercontainer_Class ;
   private String divInvd_serialfiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_94_idx="0001" ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
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
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String edtInvd_RegionalId_Link ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtInvd_NumeroPlaca_Internalname ;
   private String edtElem_Consecutivo_Internalname ;
   private String edtCata_Descripcion_Internalname ;
   private String edtInvd_PlacaPadre_Internalname ;
   private String edtavMarca_Internalname ;
   private String edtavModelo_Internalname ;
   private String edtavSerial_Internalname ;
   private String edtInvd_FechaAdquisicion_Internalname ;
   private String edtavObservaciones_Internalname ;
   private String edtCosto_Total_Dev_Internalname ;
   private String edtInvd_RegionalId_Internalname ;
   private String edtInvd_CentroCostoId_Internalname ;
   private String edtInvd_AlmacenCodigo_Internalname ;
   private String edtInvd_BodegaCodigo_Internalname ;
   private String edtInvd_ValorAdquisicion_Internalname ;
   private String edtVariable_VF_Internalname ;
   private String edtVariable_N_Internalname ;
   private String edtVariable_I_Internalname ;
   private String edtOtros_Costos_Dev_Internalname ;
   private String edtVida_Util_Actual_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String AV5ADVANCED_LABEL_TEMPLATE ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String sGXsfl_94_fel_idx="0001" ;
   private String sImgUrl ;
   private String edtavLinkselection_Jsonclick ;
   private String ROClassString ;
   private String edtInvd_NumeroPlaca_Jsonclick ;
   private String edtElem_Consecutivo_Jsonclick ;
   private String edtCata_Descripcion_Jsonclick ;
   private String edtInvd_PlacaPadre_Jsonclick ;
   private String edtavMarca_Jsonclick ;
   private String edtavModelo_Jsonclick ;
   private String edtavSerial_Jsonclick ;
   private String edtInvd_FechaAdquisicion_Jsonclick ;
   private String edtavObservaciones_Jsonclick ;
   private String edtCosto_Total_Dev_Jsonclick ;
   private String edtInvd_RegionalId_Jsonclick ;
   private String edtInvd_CentroCostoId_Jsonclick ;
   private String edtInvd_AlmacenCodigo_Jsonclick ;
   private String edtInvd_BodegaCodigo_Jsonclick ;
   private String edtInvd_ValorAdquisicion_Jsonclick ;
   private String edtVariable_VF_Jsonclick ;
   private String edtVariable_N_Jsonclick ;
   private String edtVariable_I_Jsonclick ;
   private String edtOtros_Costos_Dev_Jsonclick ;
   private String edtVida_Util_Actual_Jsonclick ;
   private java.util.Date AV12cInvd_FechaAdquisicion ;
   private java.util.Date A466Invd_FechaAdquisicion ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_94_Refreshing=false ;
   private boolean n68Invd_PlacaPadre ;
   private boolean n466Invd_FechaAdquisicion ;
   private boolean n463Invd_Estado ;
   private boolean n465Invd_ValorAdquisicion ;
   private boolean n625Variable_VF ;
   private boolean n627Variable_N ;
   private boolean n626Variable_I ;
   private boolean n628Otros_Costos_Dev ;
   private boolean n631Vida_Util_Actual ;
   private boolean brk802 ;
   private boolean returnInSub ;
   private boolean AV22LinkSelection_IsBlob ;
   private String AV11cInvd_DescripcionDevolutivo ;
   private String AV31Placas ;
   private String AV14cInvd_NumeroPlaca ;
   private String AV7cElem_Consecutivo ;
   private String AV15cInvd_PlacaPadre ;
   private String A67Invd_NumeroPlaca ;
   private String AV23Marca ;
   private String AV24Modelo ;
   private String AV38Serial ;
   private String AV26Observaciones ;
   private String AV20cSerial ;
   private String AV19cModelo ;
   private String AV18cMarca ;
   private String AV29Placa ;
   private String A66Elem_Consecutivo ;
   private String A298Cata_Descripcion ;
   private String A68Invd_PlacaPadre ;
   private String A412Invd_ModuloAlmacen ;
   private String A413Invd_AlmacenCodigo ;
   private String A414Invd_BodegaCodigo ;
   private String A463Invd_Estado ;
   private String AV48Linkselection_GXI ;
   private String lV14cInvd_NumeroPlaca ;
   private String lV15cInvd_PlacaPadre ;
   private String lV7cElem_Consecutivo ;
   private String A37Cata_Codigo ;
   private String AV22LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private HTMLChoice cmbInvd_ModuloAlmacen ;
   private HTMLChoice cmbInvd_Estado ;
   private IDataStoreProvider pr_default ;
   private String[] H00802_A37Cata_Codigo ;
   private String[] H00802_A298Cata_Descripcion ;
   private String[] H00802_A463Invd_Estado ;
   private boolean[] H00802_n463Invd_Estado ;
   private String[] H00802_A68Invd_PlacaPadre ;
   private boolean[] H00802_n68Invd_PlacaPadre ;
   private String[] H00802_A66Elem_Consecutivo ;
   private java.util.Date[] H00802_A466Invd_FechaAdquisicion ;
   private boolean[] H00802_n466Invd_FechaAdquisicion ;
   private long[] H00802_A410Invd_RegionalId ;
   private String[] H00802_A67Invd_NumeroPlaca ;
   private short[] H00802_A631Vida_Util_Actual ;
   private boolean[] H00802_n631Vida_Util_Actual ;
   private java.math.BigDecimal[] H00802_A628Otros_Costos_Dev ;
   private boolean[] H00802_n628Otros_Costos_Dev ;
   private short[] H00802_A626Variable_I ;
   private boolean[] H00802_n626Variable_I ;
   private short[] H00802_A627Variable_N ;
   private boolean[] H00802_n627Variable_N ;
   private java.math.BigDecimal[] H00802_A625Variable_VF ;
   private boolean[] H00802_n625Variable_VF ;
   private java.math.BigDecimal[] H00802_A465Invd_ValorAdquisicion ;
   private boolean[] H00802_n465Invd_ValorAdquisicion ;
   private String[] H00802_A414Invd_BodegaCodigo ;
   private String[] H00802_A413Invd_AlmacenCodigo ;
   private String[] H00802_A412Invd_ModuloAlmacen ;
   private long[] H00802_A411Invd_CentroCostoId ;
   private java.math.BigDecimal[] H00802_A629Costo_Total_Dev ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class selecplaca__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00802( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV14cInvd_NumeroPlaca ,
                                          String AV15cInvd_PlacaPadre ,
                                          String AV7cElem_Consecutivo ,
                                          java.util.Date AV12cInvd_FechaAdquisicion ,
                                          String A67Invd_NumeroPlaca ,
                                          String A68Invd_PlacaPadre ,
                                          String A66Elem_Consecutivo ,
                                          java.util.Date A466Invd_FechaAdquisicion ,
                                          String AV11cInvd_DescripcionDevolutivo ,
                                          String A298Cata_Descripcion ,
                                          String A463Invd_Estado ,
                                          long A410Invd_RegionalId ,
                                          long AV45Regi_Id )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int8 ;
      GXv_int8 = new byte [5] ;
      Object[] GXv_Object9 ;
      GXv_Object9 = new Object [2] ;
      scmdbuf = "SELECT /*+ FIRST_ROWS(11) */ T2.Cata_Codigo, T3.Cata_Descripcion, T1.Invd_Estado," ;
      scmdbuf = scmdbuf + " T1.Invd_PlacaPadre, T1.Elem_Consecutivo, T1.Invd_FechaAdquisicion, T1.Invd_RegionalId," ;
      scmdbuf = scmdbuf + " T1.Invd_NumeroPlaca, T1.Vida_Util_Actual, T1.Otros_Costos_Dev, T1.Variable_I, T1.Variable_N," ;
      scmdbuf = scmdbuf + " T1.Variable_VF, T1.Invd_ValorAdquisicion, T1.Invd_BodegaCodigo, T1.Invd_AlmacenCodigo," ;
      scmdbuf = scmdbuf + " T1.Invd_ModuloAlmacen, T1.Invd_CentroCostoId, T1.Costo_Total_Dev FROM ((ALM_INVENTARIO_DEVOLUTIVO" ;
      scmdbuf = scmdbuf + " T1 INNER JOIN ALM_ELEMENTO T2 ON T2.Elem_Consecutivo = T1.Elem_Consecutivo) INNER" ;
      scmdbuf = scmdbuf + " JOIN ALM_CATALOGO T3 ON T3.Cata_Codigo = T2.Cata_Codigo)" ;
      scmdbuf = scmdbuf + " WHERE (T1.Invd_Estado = 'R')" ;
      scmdbuf = scmdbuf + " and (T1.Invd_RegionalId = ?)" ;
      if ( ! (GXutil.strcmp("", AV14cInvd_NumeroPlaca)==0) )
      {
         sWhereString = sWhereString + " and (T1.Invd_NumeroPlaca like ?)" ;
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15cInvd_PlacaPadre)==0) )
      {
         sWhereString = sWhereString + " and (T1.Invd_PlacaPadre like ?)" ;
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV7cElem_Consecutivo)==0) )
      {
         sWhereString = sWhereString + " and (T1.Elem_Consecutivo like ?)" ;
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV12cInvd_FechaAdquisicion) )
      {
         sWhereString = sWhereString + " and (T1.Invd_FechaAdquisicion = ?)" ;
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY T1.Invd_NumeroPlaca, T1.Invd_RegionalId" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_H00802(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).longValue() , ((Number) dynConstraints[12]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00802", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(7) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((short[]) buf[11])[0] = rslt.getShort(9) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(11) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(12) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(13,2) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(14,2) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(15) ;
               ((String[]) buf[24])[0] = rslt.getVarchar(16) ;
               ((String[]) buf[25])[0] = rslt.getVarchar(17) ;
               ((long[]) buf[26])[0] = rslt.getLong(18) ;
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(19,2) ;
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx ;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[5]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[6], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[8], 9);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[9]);
               }
               return;
      }
   }

}

