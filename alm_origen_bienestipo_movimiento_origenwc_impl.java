/*
               File: alm_origen_bienestipo_movimiento_origenwc_impl
        Description: ALM_ORIGEN_BIENESTIPO_MOVIMIENTO_ORIGENWC
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:16:25.99
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

public final  class alm_origen_bienestipo_movimiento_origenwc_impl extends GXWebComponent
{
   public alm_origen_bienestipo_movimiento_origenwc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_origen_bienestipo_movimiento_origenwc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_origen_bienestipo_movimiento_origenwc_impl.class ));
   }

   public alm_origen_bienestipo_movimiento_origenwc_impl( int remoteHandle ,
                                                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void setPrefix( String sPPrefix )
   {
      sPrefix = sPPrefix;
   }

   protected void createObjects( )
   {
      cmbTipo_Tipo = new HTMLChoice();
      cmbTpmo_TipoE_S = new HTMLChoice();
      cmbTpmo_Modulo = new HTMLChoice();
      cmbTpmo_IngresaAredante = new HTMLChoice();
      cmbTpmo_IngresaCurso = new HTMLChoice();
      cmbTpmo_Controlado = new HTMLChoice();
      cmbTpmo_VidaUtil = new HTMLChoice();
      cmbTpmo_Estado = new HTMLChoice();
      cmbTpmo_CuentaResponsabilidad = new HTMLChoice();
      cmbTpmo_SolicitaRegionDestino = new HTMLChoice();
      cmbTpmo_SolicitaCentroDestino = new HTMLChoice();
      cmbTpmo_ImprimeOrigen = new HTMLChoice();
      cmbTpmo_ImprimeDestino = new HTMLChoice();
      cmbTmpo_ImprimeResponsable = new HTMLChoice();
   }

   public void initweb( )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.setDefaultTheme("Carmine");
      }
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
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
            else if ( GXutil.strcmp(gxfirstwebparm, "dyncomponent") == 0 )
            {
               httpContext.setAjaxEventMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               nDynComponent = (byte)(1) ;
               sCompPrefix = httpContext.GetNextPar( ) ;
               sSFPrefix = httpContext.GetNextPar( ) ;
               AV7Orig_Identificador = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Orig_Identificador", GXutil.ltrim( GXutil.str( AV7Orig_Identificador, 11, 0)));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,new Long(AV7Orig_Identificador)});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
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
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid") == 0 )
            {
               nRC_GXsfl_20 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               nGXsfl_20_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               sGXsfl_20_idx = httpContext.GetNextPar( ) ;
               sPrefix = httpContext.GetNextPar( ) ;
               AV12Update = httpContext.GetNextPar( ) ;
               edtavUpdate_Tooltiptext = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_20_Refreshing);
               AV13Delete = httpContext.GetNextPar( ) ;
               edtavDelete_Tooltiptext = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "Tooltiptext", edtavDelete_Tooltiptext, !bGXsfl_20_Refreshing);
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxnrgrid_newrow( ) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid") == 0 )
            {
               subGrid_Rows = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               AV7Orig_Identificador = GXutil.lval( httpContext.GetNextPar( )) ;
               AV12Update = httpContext.GetNextPar( ) ;
               edtavUpdate_Tooltiptext = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_20_Refreshing);
               AV13Delete = httpContext.GetNextPar( ) ;
               edtavDelete_Tooltiptext = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "Tooltiptext", edtavDelete_Tooltiptext, !bGXsfl_20_Refreshing);
               A38Tpmo_Codigo = httpContext.GetNextPar( ) ;
               A33Tipo_Codigo = GXutil.lval( httpContext.GetNextPar( )) ;
               sPrefix = httpContext.GetNextPar( ) ;
               init_default_properties( ) ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxgrgrid_refresh( subGrid_Rows, AV7Orig_Identificador, AV12Update, AV13Delete, A38Tpmo_Codigo, A33Tipo_Codigo, sPrefix) ;
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
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isLocalStorageSupported( ) )
         {
            httpContext.pushCurrentUrl();
         }
      }
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa5Y2( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            validateSpaRequest();
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( ! isAjaxCallMode( ) )
            {
               if ( nDynComponent == 0 )
               {
                  httpContext.sendError( 404 );
                  GXutil.writeLog("send_http_error_code 404");
                  GxWebError = (byte)(1) ;
               }
            }
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            if ( nDynComponent == 0 )
            {
               throw new RuntimeException("WebComponent is not allowed to run");
            }
         }
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
      cleanup();
   }

   public void renderHtmlHeaders( )
   {
      com.orions2.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
         httpContext.writeText( "<title>") ;
         httpContext.writeValue( "ALM_ORIGEN_BIENESTIPO_MOVIMIENTO_ORIGENWC") ;
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
      }
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxcfg.js", "?20186141416265");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("calendar-es.js", "?"+httpContext.getBuildNumber( 113785));
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"false\"" : "") ;
         httpContext.writeText( "<body") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle = bodyStyle + ";-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         if ( nGXWrapped != 1 )
         {
            httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_origen_bienestipo_movimiento_origenwc") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV7Orig_Identificador,11,0)))+"\">") ;
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
            httpContext.writeText( "<input type=\"submit\" style=\"display:none\">") ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, "FORM", "Class", "form-horizontal Form", true);
         }
      }
      else
      {
         httpContext.writeText( "<div") ;
         com.orions2.GxWebStd.classAttribute( httpContext, "gxwebcomponent-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
      }
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_20", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_20, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7Orig_Identificador", GXutil.ltrim( localUtil.ntoc( wcpOAV7Orig_Identificador, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORIG_IDENTIFICADOR", GXutil.ltrim( localUtil.ntoc( AV7Orig_Identificador, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUPDATE_Tooltiptext", GXutil.rtrim( edtavUpdate_Tooltiptext));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDELETE_Tooltiptext", GXutil.rtrim( edtavDelete_Tooltiptext));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm5Y2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("alm_origen_bienestipo_movimiento_origenwc.js", "?20186141416268");
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GX_FocusControl", GX_FocusControl);
      define_styles( ) ;
      sendSecurityToken(sPrefix);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.SendAjaxEncryptionKey();
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
         httpContext.writeTextNL( "</body>") ;
         httpContext.writeTextNL( "</html>") ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
      }
      else
      {
         httpContext.SendWebComponentState();
         httpContext.writeText( "</div>") ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
   }

   public String getPgmname( )
   {
      return "ALM_ORIGEN_BIENESTIPO_MOVIMIENTO_ORIGENWC" ;
   }

   public String getPgmdesc( )
   {
      return "ALM_ORIGEN_BIENESTIPO_MOVIMIENTO_ORIGENWC" ;
   }

   public void wb5Y0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( GXutil.len( sPrefix) == 0 )
         {
            renderHtmlHeaders( ) ;
         }
         renderHtmlOpenForm( ) ;
         if ( GXutil.len( sPrefix) != 0 )
         {
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.alm_origen_bienestipo_movimiento_origenwc");
         }
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "GridTabMainTable", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTabletop_Internalname, 1, 0, "px", 0, "px", "TableTopSearch", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-7 col-sm-2 col-sm-offset-1 ViewGridActionsCell", "Right", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group WWViewActions", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 20, 2, 0)+","+"null"+");", "Agregar", bttBtninsert_Jsonclick, 5, "Agregar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_ORIGEN_BIENESTIPO_MOVIMIENTO_ORIGENWC.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divGridcell_Internalname, 1, 0, "px", 0, "px", "col-xs-12 ViewGridCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divGridtable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, sPrefix, "false");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"20\">") ;
            sStyleString = "" ;
            com.orions2.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "ViewGrid", 0, "", "", 1, 2, sStyleString, "", 0);
            /* Subfile titles */
            httpContext.writeText( "<tr") ;
            httpContext.writeTextNL( ">") ;
            if ( subGrid_Backcolorstyle == 0 )
            {
               subGrid_Titlebackstyle = (byte)(0) ;
               if ( GXutil.len( subGrid_Class) > 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Title" ;
               }
            }
            else
            {
               subGrid_Titlebackstyle = (byte)(1) ;
               if ( subGrid_Backcolorstyle == 1 )
               {
                  subGrid_Titlebackcolor = subGrid_Allbackcolor ;
                  if ( GXutil.len( subGrid_Class) > 0 )
                  {
                     subGrid_Linesclass = subGrid_Class+"UniformTitle" ;
                  }
               }
               else
               {
                  if ( GXutil.len( subGrid_Class) > 0 )
                  {
                     subGrid_Linesclass = subGrid_Class+"Title" ;
                  }
               }
            }
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Código") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tipo de movimiento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Codigo Tipo de Elemento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tipo de Elemento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tipo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Almacén orígen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Almacén") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Almacén destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Almacén") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tipo E/S") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Módulo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Ingresa areadante") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Ingresa curso") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Usuario Creación") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha Creación") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Usuario Modifica") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha Modifica") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Transaccion") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Consumo controlado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Solicita vida útil") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Estado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Responsabilidad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Región Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Centro Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Origen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Responsable") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"UpdateAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DeleteAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeTextNL( "</tr>") ;
            GridContainer.AddObjectProperty("GridName", "Grid");
         }
         else
         {
            if ( isAjaxCallMode( ) )
            {
               GridContainer = new com.genexus.webpanels.GXWebGrid(context);
            }
            else
            {
               GridContainer.Clear();
            }
            GridContainer.SetWrapped(nGXWrapped);
            GridContainer.AddObjectProperty("GridName", "Grid");
            GridContainer.AddObjectProperty("Class", "ViewGrid");
            GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("CmpContext", sPrefix);
            GridContainer.AddObjectProperty("InMasterPage", "false");
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A38Tpmo_Codigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A313Tpmo_Descripcion);
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtTpmo_Descripcion_Link));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A253Tipo_Descripcion);
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtTipo_Descripcion_Link));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A480Tipo_Tipo));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A39Tpmo_AlmacenOrigenId, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A312Tpmo_AlmacenOrigenDescrip);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A40Tpmo_AlmacenDestinoId, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A314Tpmo_AlmacenDestinoDescrip);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A315Tpmo_TipoE_S);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A316Tpmo_Modulo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A440Tpmo_IngresaAredante);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A441Tpmo_IngresaCurso);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A317Tpmo_UsuarioCrea);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A318Tpmo_FechaCrea, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A319Tpmo_UsuarioModifica);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A320Tpmo_FechaModifica, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A595Tpmo_ConsecutivoTrans, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A633Tpmo_Controlado);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A641Tpmo_VidaUtil);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A679Tpmo_Estado));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A680Tpmo_CuentaResponsabilidad);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A705Tpmo_SolicitaRegionDestino);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A706Tpmo_SolicitaCentroDestino);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A716Tpmo_ImprimeOrigen);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A717Tpmo_ImprimeDestino);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A718Tmpo_ImprimeResponsable);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV12Update));
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtavUpdate_Link));
            GridColumn.AddObjectProperty("Tooltiptext", GXutil.rtrim( edtavUpdate_Tooltiptext));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV13Delete));
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtavDelete_Link));
            GridColumn.AddObjectProperty("Tooltiptext", GXutil.rtrim( edtavDelete_Tooltiptext));
            GridContainer.AddColumnProperties(GridColumn);
            GridContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid_Allowselection, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 20 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_20 = (short)(nGXsfl_20_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
            GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid", GridContainer);
            if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
            {
               com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData", GridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData"+"V", GridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
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
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtOrig_Identificador_Internalname, "Identificador Orígen", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtOrig_Identificador_Internalname, GXutil.ltrim( localUtil.ntoc( A41Orig_Identificador, (byte)(11), (byte)(0), ",", "")), ((edtOrig_Identificador_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A41Orig_Identificador), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A41Orig_Identificador), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOrig_Identificador_Jsonclick, 0, "Attribute", "", "", "", edtOrig_Identificador_Visible, edtOrig_Identificador_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_ORIGEN_BIENESTIPO_MOVIMIENTO_ORIGENWC.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start5Y2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "ALM_ORIGEN_BIENESTIPO_MOVIMIENTO_ORIGENWC", (short)(0)) ;
         }
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
         httpContext.wbHandled = (byte)(0) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            sXEvt = httpContext.cgiGet( "_EventName") ;
            if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
            {
            }
         }
      }
      wbErr = false ;
      if ( ( GXutil.len( sPrefix) == 0 ) || ( nDraw == 1 ) )
      {
         if ( nDoneStart == 0 )
         {
            strup5Y0( ) ;
         }
      }
   }

   public void ws5Y2( )
   {
      start5Y2( ) ;
      evt5Y2( ) ;
   }

   public void evt5Y2( )
   {
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ( ( ( GXutil.len( sPrefix) == 0 ) ) || ( GXutil.strSearch( sXEvt, sPrefix, 1) > 0 ) ) && ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            if ( httpContext.wbHandled == 0 )
            {
               if ( GXutil.len( sPrefix) == 0 )
               {
                  sEvt = httpContext.cgiGet( "_EventName") ;
                  EvtGridId = httpContext.cgiGet( "_EventGridId") ;
                  EvtRowId = httpContext.cgiGet( "_EventRowId") ;
               }
               if ( GXutil.len( sEvt) > 0 )
               {
                  sEvtType = GXutil.left( sEvt, 1) ;
                  sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup5Y0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup5Y0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoInsert' */
                                 e115Y2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup5Y0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup5Y0( ) ;
                           }
                           sEvt = httpContext.cgiGet( sPrefix+"GRIDPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup5Y0( ) ;
                           }
                           nGXsfl_20_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_20_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_20_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_202( ) ;
                           A38Tpmo_Codigo = httpContext.cgiGet( edtTpmo_Codigo_Internalname) ;
                           A313Tpmo_Descripcion = httpContext.cgiGet( edtTpmo_Descripcion_Internalname) ;
                           A33Tipo_Codigo = localUtil.ctol( httpContext.cgiGet( edtTipo_Codigo_Internalname), ",", ".") ;
                           A253Tipo_Descripcion = GXutil.upper( httpContext.cgiGet( edtTipo_Descripcion_Internalname)) ;
                           cmbTipo_Tipo.setName( cmbTipo_Tipo.getInternalname() );
                           cmbTipo_Tipo.setValue( httpContext.cgiGet( cmbTipo_Tipo.getInternalname()) );
                           A480Tipo_Tipo = httpContext.cgiGet( cmbTipo_Tipo.getInternalname()) ;
                           A39Tpmo_AlmacenOrigenId = localUtil.ctol( httpContext.cgiGet( edtTpmo_AlmacenOrigenId_Internalname), ",", ".") ;
                           A312Tpmo_AlmacenOrigenDescrip = GXutil.upper( httpContext.cgiGet( edtTpmo_AlmacenOrigenDescrip_Internalname)) ;
                           n312Tpmo_AlmacenOrigenDescrip = false ;
                           A40Tpmo_AlmacenDestinoId = localUtil.ctol( httpContext.cgiGet( edtTpmo_AlmacenDestinoId_Internalname), ",", ".") ;
                           A314Tpmo_AlmacenDestinoDescrip = GXutil.upper( httpContext.cgiGet( edtTpmo_AlmacenDestinoDescrip_Internalname)) ;
                           n314Tpmo_AlmacenDestinoDescrip = false ;
                           cmbTpmo_TipoE_S.setName( cmbTpmo_TipoE_S.getInternalname() );
                           cmbTpmo_TipoE_S.setValue( httpContext.cgiGet( cmbTpmo_TipoE_S.getInternalname()) );
                           A315Tpmo_TipoE_S = httpContext.cgiGet( cmbTpmo_TipoE_S.getInternalname()) ;
                           cmbTpmo_Modulo.setName( cmbTpmo_Modulo.getInternalname() );
                           cmbTpmo_Modulo.setValue( httpContext.cgiGet( cmbTpmo_Modulo.getInternalname()) );
                           A316Tpmo_Modulo = httpContext.cgiGet( cmbTpmo_Modulo.getInternalname()) ;
                           cmbTpmo_IngresaAredante.setName( cmbTpmo_IngresaAredante.getInternalname() );
                           cmbTpmo_IngresaAredante.setValue( httpContext.cgiGet( cmbTpmo_IngresaAredante.getInternalname()) );
                           A440Tpmo_IngresaAredante = httpContext.cgiGet( cmbTpmo_IngresaAredante.getInternalname()) ;
                           cmbTpmo_IngresaCurso.setName( cmbTpmo_IngresaCurso.getInternalname() );
                           cmbTpmo_IngresaCurso.setValue( httpContext.cgiGet( cmbTpmo_IngresaCurso.getInternalname()) );
                           A441Tpmo_IngresaCurso = httpContext.cgiGet( cmbTpmo_IngresaCurso.getInternalname()) ;
                           A317Tpmo_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtTpmo_UsuarioCrea_Internalname)) ;
                           A318Tpmo_FechaCrea = localUtil.ctot( httpContext.cgiGet( edtTpmo_FechaCrea_Internalname), 0) ;
                           A319Tpmo_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtTpmo_UsuarioModifica_Internalname)) ;
                           n319Tpmo_UsuarioModifica = false ;
                           A320Tpmo_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtTpmo_FechaModifica_Internalname), 0) ;
                           n320Tpmo_FechaModifica = false ;
                           A595Tpmo_ConsecutivoTrans = localUtil.ctol( httpContext.cgiGet( edtTpmo_ConsecutivoTrans_Internalname), ",", ".") ;
                           n595Tpmo_ConsecutivoTrans = false ;
                           cmbTpmo_Controlado.setName( cmbTpmo_Controlado.getInternalname() );
                           cmbTpmo_Controlado.setValue( httpContext.cgiGet( cmbTpmo_Controlado.getInternalname()) );
                           A633Tpmo_Controlado = httpContext.cgiGet( cmbTpmo_Controlado.getInternalname()) ;
                           n633Tpmo_Controlado = false ;
                           cmbTpmo_VidaUtil.setName( cmbTpmo_VidaUtil.getInternalname() );
                           cmbTpmo_VidaUtil.setValue( httpContext.cgiGet( cmbTpmo_VidaUtil.getInternalname()) );
                           A641Tpmo_VidaUtil = httpContext.cgiGet( cmbTpmo_VidaUtil.getInternalname()) ;
                           n641Tpmo_VidaUtil = false ;
                           cmbTpmo_Estado.setName( cmbTpmo_Estado.getInternalname() );
                           cmbTpmo_Estado.setValue( httpContext.cgiGet( cmbTpmo_Estado.getInternalname()) );
                           A679Tpmo_Estado = httpContext.cgiGet( cmbTpmo_Estado.getInternalname()) ;
                           n679Tpmo_Estado = false ;
                           cmbTpmo_CuentaResponsabilidad.setName( cmbTpmo_CuentaResponsabilidad.getInternalname() );
                           cmbTpmo_CuentaResponsabilidad.setValue( httpContext.cgiGet( cmbTpmo_CuentaResponsabilidad.getInternalname()) );
                           A680Tpmo_CuentaResponsabilidad = httpContext.cgiGet( cmbTpmo_CuentaResponsabilidad.getInternalname()) ;
                           n680Tpmo_CuentaResponsabilidad = false ;
                           cmbTpmo_SolicitaRegionDestino.setName( cmbTpmo_SolicitaRegionDestino.getInternalname() );
                           cmbTpmo_SolicitaRegionDestino.setValue( httpContext.cgiGet( cmbTpmo_SolicitaRegionDestino.getInternalname()) );
                           A705Tpmo_SolicitaRegionDestino = httpContext.cgiGet( cmbTpmo_SolicitaRegionDestino.getInternalname()) ;
                           n705Tpmo_SolicitaRegionDestino = false ;
                           cmbTpmo_SolicitaCentroDestino.setName( cmbTpmo_SolicitaCentroDestino.getInternalname() );
                           cmbTpmo_SolicitaCentroDestino.setValue( httpContext.cgiGet( cmbTpmo_SolicitaCentroDestino.getInternalname()) );
                           A706Tpmo_SolicitaCentroDestino = httpContext.cgiGet( cmbTpmo_SolicitaCentroDestino.getInternalname()) ;
                           n706Tpmo_SolicitaCentroDestino = false ;
                           cmbTpmo_ImprimeOrigen.setName( cmbTpmo_ImprimeOrigen.getInternalname() );
                           cmbTpmo_ImprimeOrigen.setValue( httpContext.cgiGet( cmbTpmo_ImprimeOrigen.getInternalname()) );
                           A716Tpmo_ImprimeOrigen = httpContext.cgiGet( cmbTpmo_ImprimeOrigen.getInternalname()) ;
                           n716Tpmo_ImprimeOrigen = false ;
                           cmbTpmo_ImprimeDestino.setName( cmbTpmo_ImprimeDestino.getInternalname() );
                           cmbTpmo_ImprimeDestino.setValue( httpContext.cgiGet( cmbTpmo_ImprimeDestino.getInternalname()) );
                           A717Tpmo_ImprimeDestino = httpContext.cgiGet( cmbTpmo_ImprimeDestino.getInternalname()) ;
                           n717Tpmo_ImprimeDestino = false ;
                           cmbTmpo_ImprimeResponsable.setName( cmbTmpo_ImprimeResponsable.getInternalname() );
                           cmbTmpo_ImprimeResponsable.setValue( httpContext.cgiGet( cmbTmpo_ImprimeResponsable.getInternalname()) );
                           A718Tmpo_ImprimeResponsable = httpContext.cgiGet( cmbTmpo_ImprimeResponsable.getInternalname()) ;
                           n718Tmpo_ImprimeResponsable = false ;
                           AV12Update = httpContext.cgiGet( edtavUpdate_Internalname) ;
                           httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV12Update)==0) ? AV18Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV12Update))), !bGXsfl_20_Refreshing);
                           httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV12Update), true);
                           AV13Delete = httpContext.cgiGet( edtavDelete_Internalname) ;
                           httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "Bitmap", ((GXutil.strcmp("", AV13Delete)==0) ? AV19Delete_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV13Delete))), !bGXsfl_20_Refreshing);
                           httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV13Delete), true);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       /* Execute user event: Start */
                                       e125Y2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       e135Y2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       if ( ! wbErr )
                                       {
                                          Rfr0gs = false ;
                                          if ( ! Rfr0gs )
                                          {
                                          }
                                          dynload_actions( ) ;
                                       }
                                    }
                                 }
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                                 {
                                    strup5Y0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                    }
                                 }
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

   public void we5Y2( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm5Y2( ) ;
         }
      }
   }

   public void pa5Y2( )
   {
      if ( nDonePA == 0 )
      {
         if ( GXutil.len( sPrefix) != 0 )
         {
            initialize_properties( ) ;
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
            {
               gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", com.genexus.util.Encryption.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(0)) ;
            }
         }
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableJsOutput();
            }
         }
         GXCCtl = "TIPO_TIPO_" + sGXsfl_20_idx ;
         cmbTipo_Tipo.setName( GXCCtl );
         cmbTipo_Tipo.setWebtags( "" );
         cmbTipo_Tipo.addItem("C", "Consumo", (short)(0));
         cmbTipo_Tipo.addItem("D", "Devolutivo", (short)(0));
         if ( cmbTipo_Tipo.getItemCount() > 0 )
         {
            A480Tipo_Tipo = cmbTipo_Tipo.getValidValue(A480Tipo_Tipo) ;
         }
         GXCCtl = "TPMO_TIPOE_S_" + sGXsfl_20_idx ;
         cmbTpmo_TipoE_S.setName( GXCCtl );
         cmbTpmo_TipoE_S.setWebtags( "" );
         cmbTpmo_TipoE_S.addItem("E", "ENTRADA", (short)(0));
         cmbTpmo_TipoE_S.addItem("S", "SALIDA", (short)(0));
         cmbTpmo_TipoE_S.addItem("T", "TRASPASO", (short)(0));
         cmbTpmo_TipoE_S.addItem("R", "RECUPERACIÓN", (short)(0));
         if ( cmbTpmo_TipoE_S.getItemCount() > 0 )
         {
            A315Tpmo_TipoE_S = cmbTpmo_TipoE_S.getValidValue(A315Tpmo_TipoE_S) ;
         }
         GXCCtl = "TPMO_MODULO_" + sGXsfl_20_idx ;
         cmbTpmo_Modulo.setName( GXCCtl );
         cmbTpmo_Modulo.setWebtags( "" );
         cmbTpmo_Modulo.addItem("", "", (short)(0));
         cmbTpmo_Modulo.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
         cmbTpmo_Modulo.addItem("INVE", "INVENTARIO", (short)(0));
         cmbTpmo_Modulo.addItem("ALMA", "ALMACEN", (short)(0));
         if ( cmbTpmo_Modulo.getItemCount() > 0 )
         {
            A316Tpmo_Modulo = cmbTpmo_Modulo.getValidValue(A316Tpmo_Modulo) ;
         }
         GXCCtl = "TPMO_INGRESAAREDANTE_" + sGXsfl_20_idx ;
         cmbTpmo_IngresaAredante.setName( GXCCtl );
         cmbTpmo_IngresaAredante.setWebtags( "" );
         cmbTpmo_IngresaAredante.addItem("", "", (short)(0));
         cmbTpmo_IngresaAredante.addItem("SI", "SI", (short)(0));
         cmbTpmo_IngresaAredante.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_IngresaAredante.getItemCount() > 0 )
         {
            A440Tpmo_IngresaAredante = cmbTpmo_IngresaAredante.getValidValue(A440Tpmo_IngresaAredante) ;
         }
         GXCCtl = "TPMO_INGRESACURSO_" + sGXsfl_20_idx ;
         cmbTpmo_IngresaCurso.setName( GXCCtl );
         cmbTpmo_IngresaCurso.setWebtags( "" );
         cmbTpmo_IngresaCurso.addItem("", "", (short)(0));
         cmbTpmo_IngresaCurso.addItem("SI", "SI", (short)(0));
         cmbTpmo_IngresaCurso.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_IngresaCurso.getItemCount() > 0 )
         {
            A441Tpmo_IngresaCurso = cmbTpmo_IngresaCurso.getValidValue(A441Tpmo_IngresaCurso) ;
         }
         GXCCtl = "TPMO_CONTROLADO_" + sGXsfl_20_idx ;
         cmbTpmo_Controlado.setName( GXCCtl );
         cmbTpmo_Controlado.setWebtags( "" );
         cmbTpmo_Controlado.addItem("", "", (short)(0));
         cmbTpmo_Controlado.addItem("SI", "SI", (short)(0));
         cmbTpmo_Controlado.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_Controlado.getItemCount() > 0 )
         {
            A633Tpmo_Controlado = cmbTpmo_Controlado.getValidValue(A633Tpmo_Controlado) ;
            n633Tpmo_Controlado = false ;
         }
         GXCCtl = "TPMO_VIDAUTIL_" + sGXsfl_20_idx ;
         cmbTpmo_VidaUtil.setName( GXCCtl );
         cmbTpmo_VidaUtil.setWebtags( "" );
         cmbTpmo_VidaUtil.addItem("", "", (short)(0));
         cmbTpmo_VidaUtil.addItem("SI", "SI", (short)(0));
         cmbTpmo_VidaUtil.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_VidaUtil.getItemCount() > 0 )
         {
            A641Tpmo_VidaUtil = cmbTpmo_VidaUtil.getValidValue(A641Tpmo_VidaUtil) ;
            n641Tpmo_VidaUtil = false ;
         }
         GXCCtl = "TPMO_ESTADO_" + sGXsfl_20_idx ;
         cmbTpmo_Estado.setName( GXCCtl );
         cmbTpmo_Estado.setWebtags( "" );
         cmbTpmo_Estado.addItem("A", "Activo", (short)(0));
         cmbTpmo_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbTpmo_Estado.getItemCount() > 0 )
         {
            A679Tpmo_Estado = cmbTpmo_Estado.getValidValue(A679Tpmo_Estado) ;
            n679Tpmo_Estado = false ;
         }
         GXCCtl = "TPMO_CUENTARESPONSABILIDAD_" + sGXsfl_20_idx ;
         cmbTpmo_CuentaResponsabilidad.setName( GXCCtl );
         cmbTpmo_CuentaResponsabilidad.setWebtags( "" );
         cmbTpmo_CuentaResponsabilidad.addItem("", "", (short)(0));
         cmbTpmo_CuentaResponsabilidad.addItem("SI", "SI", (short)(0));
         cmbTpmo_CuentaResponsabilidad.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_CuentaResponsabilidad.getItemCount() > 0 )
         {
            A680Tpmo_CuentaResponsabilidad = cmbTpmo_CuentaResponsabilidad.getValidValue(A680Tpmo_CuentaResponsabilidad) ;
            n680Tpmo_CuentaResponsabilidad = false ;
         }
         GXCCtl = "TPMO_SOLICITAREGIONDESTINO_" + sGXsfl_20_idx ;
         cmbTpmo_SolicitaRegionDestino.setName( GXCCtl );
         cmbTpmo_SolicitaRegionDestino.setWebtags( "" );
         cmbTpmo_SolicitaRegionDestino.addItem("", "", (short)(0));
         cmbTpmo_SolicitaRegionDestino.addItem("SI", "SI", (short)(0));
         cmbTpmo_SolicitaRegionDestino.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_SolicitaRegionDestino.getItemCount() > 0 )
         {
            A705Tpmo_SolicitaRegionDestino = cmbTpmo_SolicitaRegionDestino.getValidValue(A705Tpmo_SolicitaRegionDestino) ;
            n705Tpmo_SolicitaRegionDestino = false ;
         }
         GXCCtl = "TPMO_SOLICITACENTRODESTINO_" + sGXsfl_20_idx ;
         cmbTpmo_SolicitaCentroDestino.setName( GXCCtl );
         cmbTpmo_SolicitaCentroDestino.setWebtags( "" );
         cmbTpmo_SolicitaCentroDestino.addItem("", "", (short)(0));
         cmbTpmo_SolicitaCentroDestino.addItem("SI", "SI", (short)(0));
         cmbTpmo_SolicitaCentroDestino.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_SolicitaCentroDestino.getItemCount() > 0 )
         {
            A706Tpmo_SolicitaCentroDestino = cmbTpmo_SolicitaCentroDestino.getValidValue(A706Tpmo_SolicitaCentroDestino) ;
            n706Tpmo_SolicitaCentroDestino = false ;
         }
         GXCCtl = "TPMO_IMPRIMEORIGEN_" + sGXsfl_20_idx ;
         cmbTpmo_ImprimeOrigen.setName( GXCCtl );
         cmbTpmo_ImprimeOrigen.setWebtags( "" );
         cmbTpmo_ImprimeOrigen.addItem("", "", (short)(0));
         cmbTpmo_ImprimeOrigen.addItem("SI", "SI", (short)(0));
         cmbTpmo_ImprimeOrigen.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_ImprimeOrigen.getItemCount() > 0 )
         {
            A716Tpmo_ImprimeOrigen = cmbTpmo_ImprimeOrigen.getValidValue(A716Tpmo_ImprimeOrigen) ;
            n716Tpmo_ImprimeOrigen = false ;
         }
         GXCCtl = "TPMO_IMPRIMEDESTINO_" + sGXsfl_20_idx ;
         cmbTpmo_ImprimeDestino.setName( GXCCtl );
         cmbTpmo_ImprimeDestino.setWebtags( "" );
         cmbTpmo_ImprimeDestino.addItem("", "", (short)(0));
         cmbTpmo_ImprimeDestino.addItem("SI", "SI", (short)(0));
         cmbTpmo_ImprimeDestino.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_ImprimeDestino.getItemCount() > 0 )
         {
            A717Tpmo_ImprimeDestino = cmbTpmo_ImprimeDestino.getValidValue(A717Tpmo_ImprimeDestino) ;
            n717Tpmo_ImprimeDestino = false ;
         }
         GXCCtl = "TMPO_IMPRIMERESPONSABLE_" + sGXsfl_20_idx ;
         cmbTmpo_ImprimeResponsable.setName( GXCCtl );
         cmbTmpo_ImprimeResponsable.setWebtags( "" );
         cmbTmpo_ImprimeResponsable.addItem("", "", (short)(0));
         cmbTmpo_ImprimeResponsable.addItem("SI", "SI", (short)(0));
         cmbTmpo_ImprimeResponsable.addItem("NO", "NO", (short)(0));
         if ( cmbTmpo_ImprimeResponsable.getItemCount() > 0 )
         {
            A718Tmpo_ImprimeResponsable = cmbTmpo_ImprimeResponsable.getValidValue(A718Tmpo_ImprimeResponsable) ;
            n718Tmpo_ImprimeResponsable = false ;
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( toggleJsOutput )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableJsOutput();
               }
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid_newrow( )
   {
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_202( ) ;
      while ( nGXsfl_20_idx <= nRC_GXsfl_20 )
      {
         sendrow_202( ) ;
         nGXsfl_20_idx = (short)(((subGrid_Islastpage==1)&&(nGXsfl_20_idx+1>subgrid_recordsperpage( )) ? 1 : nGXsfl_20_idx+1)) ;
         sGXsfl_20_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_20_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_202( ) ;
      }
      httpContext.GX_webresponse.addString(GridContainer.ToJavascriptSource());
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 long AV7Orig_Identificador ,
                                 String AV12Update ,
                                 String AV13Delete ,
                                 String A38Tpmo_Codigo ,
                                 long A33Tipo_Codigo ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid_Rows = subGrid_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID_nCurrentRecord = 0 ;
      rf5Y2( ) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TPMO_CODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A38Tpmo_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TPMO_CODIGO", A38Tpmo_Codigo);
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf5Y2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV17Pgmname = "ALM_ORIGEN_BIENESTIPO_MOVIMIENTO_ORIGENWC" ;
      Gx_err = (short)(0) ;
   }

   public void rf5Y2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(20) ;
      nGXsfl_20_idx = (short)(1) ;
      sGXsfl_20_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_20_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_202( ) ;
      bGXsfl_20_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "ViewGrid");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_recordsperpage( ) );
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_202( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 0 : GRID_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((subGrid_Rows==0) ? 10000 : subgrid_recordsperpage( )+1) ;
         /* Using cursor H005Y2 */
         pr_default.execute(0, new Object[] {new Long(AV7Orig_Identificador), new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_20_idx = (short)(1) ;
         sGXsfl_20_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_20_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_202( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_recordsperpage( ) ) ) ) )
         {
            A41Orig_Identificador = H005Y2_A41Orig_Identificador[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A41Orig_Identificador", GXutil.ltrim( GXutil.str( A41Orig_Identificador, 11, 0)));
            A718Tmpo_ImprimeResponsable = H005Y2_A718Tmpo_ImprimeResponsable[0] ;
            n718Tmpo_ImprimeResponsable = H005Y2_n718Tmpo_ImprimeResponsable[0] ;
            A717Tpmo_ImprimeDestino = H005Y2_A717Tpmo_ImprimeDestino[0] ;
            n717Tpmo_ImprimeDestino = H005Y2_n717Tpmo_ImprimeDestino[0] ;
            A716Tpmo_ImprimeOrigen = H005Y2_A716Tpmo_ImprimeOrigen[0] ;
            n716Tpmo_ImprimeOrigen = H005Y2_n716Tpmo_ImprimeOrigen[0] ;
            A706Tpmo_SolicitaCentroDestino = H005Y2_A706Tpmo_SolicitaCentroDestino[0] ;
            n706Tpmo_SolicitaCentroDestino = H005Y2_n706Tpmo_SolicitaCentroDestino[0] ;
            A705Tpmo_SolicitaRegionDestino = H005Y2_A705Tpmo_SolicitaRegionDestino[0] ;
            n705Tpmo_SolicitaRegionDestino = H005Y2_n705Tpmo_SolicitaRegionDestino[0] ;
            A680Tpmo_CuentaResponsabilidad = H005Y2_A680Tpmo_CuentaResponsabilidad[0] ;
            n680Tpmo_CuentaResponsabilidad = H005Y2_n680Tpmo_CuentaResponsabilidad[0] ;
            A679Tpmo_Estado = H005Y2_A679Tpmo_Estado[0] ;
            n679Tpmo_Estado = H005Y2_n679Tpmo_Estado[0] ;
            A641Tpmo_VidaUtil = H005Y2_A641Tpmo_VidaUtil[0] ;
            n641Tpmo_VidaUtil = H005Y2_n641Tpmo_VidaUtil[0] ;
            A633Tpmo_Controlado = H005Y2_A633Tpmo_Controlado[0] ;
            n633Tpmo_Controlado = H005Y2_n633Tpmo_Controlado[0] ;
            A595Tpmo_ConsecutivoTrans = H005Y2_A595Tpmo_ConsecutivoTrans[0] ;
            n595Tpmo_ConsecutivoTrans = H005Y2_n595Tpmo_ConsecutivoTrans[0] ;
            A320Tpmo_FechaModifica = H005Y2_A320Tpmo_FechaModifica[0] ;
            n320Tpmo_FechaModifica = H005Y2_n320Tpmo_FechaModifica[0] ;
            A319Tpmo_UsuarioModifica = H005Y2_A319Tpmo_UsuarioModifica[0] ;
            n319Tpmo_UsuarioModifica = H005Y2_n319Tpmo_UsuarioModifica[0] ;
            A318Tpmo_FechaCrea = H005Y2_A318Tpmo_FechaCrea[0] ;
            A317Tpmo_UsuarioCrea = H005Y2_A317Tpmo_UsuarioCrea[0] ;
            A441Tpmo_IngresaCurso = H005Y2_A441Tpmo_IngresaCurso[0] ;
            A440Tpmo_IngresaAredante = H005Y2_A440Tpmo_IngresaAredante[0] ;
            A316Tpmo_Modulo = H005Y2_A316Tpmo_Modulo[0] ;
            A315Tpmo_TipoE_S = H005Y2_A315Tpmo_TipoE_S[0] ;
            A314Tpmo_AlmacenDestinoDescrip = H005Y2_A314Tpmo_AlmacenDestinoDescrip[0] ;
            n314Tpmo_AlmacenDestinoDescrip = H005Y2_n314Tpmo_AlmacenDestinoDescrip[0] ;
            A40Tpmo_AlmacenDestinoId = H005Y2_A40Tpmo_AlmacenDestinoId[0] ;
            A312Tpmo_AlmacenOrigenDescrip = H005Y2_A312Tpmo_AlmacenOrigenDescrip[0] ;
            n312Tpmo_AlmacenOrigenDescrip = H005Y2_n312Tpmo_AlmacenOrigenDescrip[0] ;
            A39Tpmo_AlmacenOrigenId = H005Y2_A39Tpmo_AlmacenOrigenId[0] ;
            A480Tipo_Tipo = H005Y2_A480Tipo_Tipo[0] ;
            A253Tipo_Descripcion = H005Y2_A253Tipo_Descripcion[0] ;
            A33Tipo_Codigo = H005Y2_A33Tipo_Codigo[0] ;
            A313Tpmo_Descripcion = H005Y2_A313Tpmo_Descripcion[0] ;
            A38Tpmo_Codigo = H005Y2_A38Tpmo_Codigo[0] ;
            A718Tmpo_ImprimeResponsable = H005Y2_A718Tmpo_ImprimeResponsable[0] ;
            n718Tmpo_ImprimeResponsable = H005Y2_n718Tmpo_ImprimeResponsable[0] ;
            A717Tpmo_ImprimeDestino = H005Y2_A717Tpmo_ImprimeDestino[0] ;
            n717Tpmo_ImprimeDestino = H005Y2_n717Tpmo_ImprimeDestino[0] ;
            A716Tpmo_ImprimeOrigen = H005Y2_A716Tpmo_ImprimeOrigen[0] ;
            n716Tpmo_ImprimeOrigen = H005Y2_n716Tpmo_ImprimeOrigen[0] ;
            A706Tpmo_SolicitaCentroDestino = H005Y2_A706Tpmo_SolicitaCentroDestino[0] ;
            n706Tpmo_SolicitaCentroDestino = H005Y2_n706Tpmo_SolicitaCentroDestino[0] ;
            A705Tpmo_SolicitaRegionDestino = H005Y2_A705Tpmo_SolicitaRegionDestino[0] ;
            n705Tpmo_SolicitaRegionDestino = H005Y2_n705Tpmo_SolicitaRegionDestino[0] ;
            A680Tpmo_CuentaResponsabilidad = H005Y2_A680Tpmo_CuentaResponsabilidad[0] ;
            n680Tpmo_CuentaResponsabilidad = H005Y2_n680Tpmo_CuentaResponsabilidad[0] ;
            A679Tpmo_Estado = H005Y2_A679Tpmo_Estado[0] ;
            n679Tpmo_Estado = H005Y2_n679Tpmo_Estado[0] ;
            A641Tpmo_VidaUtil = H005Y2_A641Tpmo_VidaUtil[0] ;
            n641Tpmo_VidaUtil = H005Y2_n641Tpmo_VidaUtil[0] ;
            A633Tpmo_Controlado = H005Y2_A633Tpmo_Controlado[0] ;
            n633Tpmo_Controlado = H005Y2_n633Tpmo_Controlado[0] ;
            A595Tpmo_ConsecutivoTrans = H005Y2_A595Tpmo_ConsecutivoTrans[0] ;
            n595Tpmo_ConsecutivoTrans = H005Y2_n595Tpmo_ConsecutivoTrans[0] ;
            A320Tpmo_FechaModifica = H005Y2_A320Tpmo_FechaModifica[0] ;
            n320Tpmo_FechaModifica = H005Y2_n320Tpmo_FechaModifica[0] ;
            A319Tpmo_UsuarioModifica = H005Y2_A319Tpmo_UsuarioModifica[0] ;
            n319Tpmo_UsuarioModifica = H005Y2_n319Tpmo_UsuarioModifica[0] ;
            A318Tpmo_FechaCrea = H005Y2_A318Tpmo_FechaCrea[0] ;
            A317Tpmo_UsuarioCrea = H005Y2_A317Tpmo_UsuarioCrea[0] ;
            A441Tpmo_IngresaCurso = H005Y2_A441Tpmo_IngresaCurso[0] ;
            A440Tpmo_IngresaAredante = H005Y2_A440Tpmo_IngresaAredante[0] ;
            A316Tpmo_Modulo = H005Y2_A316Tpmo_Modulo[0] ;
            A315Tpmo_TipoE_S = H005Y2_A315Tpmo_TipoE_S[0] ;
            A40Tpmo_AlmacenDestinoId = H005Y2_A40Tpmo_AlmacenDestinoId[0] ;
            A39Tpmo_AlmacenOrigenId = H005Y2_A39Tpmo_AlmacenOrigenId[0] ;
            A33Tipo_Codigo = H005Y2_A33Tipo_Codigo[0] ;
            A313Tpmo_Descripcion = H005Y2_A313Tpmo_Descripcion[0] ;
            A314Tpmo_AlmacenDestinoDescrip = H005Y2_A314Tpmo_AlmacenDestinoDescrip[0] ;
            n314Tpmo_AlmacenDestinoDescrip = H005Y2_n314Tpmo_AlmacenDestinoDescrip[0] ;
            A312Tpmo_AlmacenOrigenDescrip = H005Y2_A312Tpmo_AlmacenOrigenDescrip[0] ;
            n312Tpmo_AlmacenOrigenDescrip = H005Y2_n312Tpmo_AlmacenOrigenDescrip[0] ;
            A480Tipo_Tipo = H005Y2_A480Tipo_Tipo[0] ;
            A253Tipo_Descripcion = H005Y2_A253Tipo_Descripcion[0] ;
            e135Y2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(20) ;
         wb5Y0( ) ;
      }
      bGXsfl_20_Refreshing = true ;
   }

   public int subgrid_pagecount( )
   {
      GRID_nRecordCount = subgrid_recordcount( ) ;
      if ( ((int)((GRID_nRecordCount) % (subgrid_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRID_nRecordCount/ (double) (subgrid_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID_nRecordCount/ (double) (subgrid_recordsperpage( )))+1) ;
   }

   public int subgrid_recordcount( )
   {
      /* Using cursor H005Y3 */
      pr_default.execute(1, new Object[] {new Long(AV7Orig_Identificador)});
      GRID_nRecordCount = H005Y3_AGRID_nRecordCount[0] ;
      pr_default.close(1);
      return (int)(GRID_nRecordCount) ;
   }

   public int subgrid_recordsperpage( )
   {
      if ( subGrid_Rows > 0 )
      {
         return subGrid_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgrid_currentpage( )
   {
      return (int)(GXutil.Int( GRID_nFirstRecordOnPage/ (double) (subgrid_recordsperpage( )))+1) ;
   }

   public short subgrid_firstpage( )
   {
      GRID_nFirstRecordOnPage = 0 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7Orig_Identificador, AV12Update, AV13Delete, A38Tpmo_Codigo, A33Tipo_Codigo, sPrefix) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      GRID_nRecordCount = subgrid_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7Orig_Identificador, AV12Update, AV13Delete, A38Tpmo_Codigo, A33Tipo_Codigo, sPrefix) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      if ( GRID_nFirstRecordOnPage >= subgrid_recordsperpage( ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage-subgrid_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7Orig_Identificador, AV12Update, AV13Delete, A38Tpmo_Codigo, A33Tipo_Codigo, sPrefix) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      GRID_nRecordCount = subgrid_recordcount( ) ;
      if ( GRID_nRecordCount > subgrid_recordsperpage( ) )
      {
         if ( ((int)((GRID_nRecordCount) % (subgrid_recordsperpage( )))) == 0 )
         {
            GRID_nFirstRecordOnPage = (long)(GRID_nRecordCount-subgrid_recordsperpage( )) ;
         }
         else
         {
            GRID_nFirstRecordOnPage = (long)(GRID_nRecordCount-((int)((GRID_nRecordCount) % (subgrid_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7Orig_Identificador, AV12Update, AV13Delete, A38Tpmo_Codigo, A33Tipo_Codigo, sPrefix) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7Orig_Identificador, AV12Update, AV13Delete, A38Tpmo_Codigo, A33Tipo_Codigo, sPrefix) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup5Y0( )
   {
      /* Before Start, stand alone formulas. */
      AV17Pgmname = "ALM_ORIGEN_BIENESTIPO_MOVIMIENTO_ORIGENWC" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e125Y2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A41Orig_Identificador = localUtil.ctol( httpContext.cgiGet( edtOrig_Identificador_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A41Orig_Identificador", GXutil.ltrim( GXutil.str( A41Orig_Identificador, 11, 0)));
         /* Read saved values. */
         nRC_GXsfl_20 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_20"), ",", ".")) ;
         wcpOAV7Orig_Identificador = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7Orig_Identificador"), ",", ".") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), ",", ".") ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), ",", ".")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), ",", ".")) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      e125Y2 ();
      if (returnInSub) return;
   }

   public void e125Y2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV17Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV17Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      subGrid_Rows = 10 ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV12Update = context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV12Update)==0) ? AV18Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV12Update))), !bGXsfl_20_Refreshing);
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV12Update), true);
      AV18Update_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV12Update)==0) ? AV18Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV12Update))), !bGXsfl_20_Refreshing);
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV12Update), true);
      edtavUpdate_Tooltiptext = "Modificar" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_20_Refreshing);
      AV13Delete = context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "Bitmap", ((GXutil.strcmp("", AV13Delete)==0) ? AV19Delete_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV13Delete))), !bGXsfl_20_Refreshing);
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV13Delete), true);
      AV19Delete_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "Bitmap", ((GXutil.strcmp("", AV13Delete)==0) ? AV19Delete_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV13Delete))), !bGXsfl_20_Refreshing);
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV13Delete), true);
      edtavDelete_Tooltiptext = "Eliminar" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "Tooltiptext", edtavDelete_Tooltiptext, !bGXsfl_20_Refreshing);
      edtOrig_Identificador_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtOrig_Identificador_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtOrig_Identificador_Visible, 5, 0)), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
   }

   private void e135Y2( )
   {
      /* Grid_Load Routine */
      edtavUpdate_Link = formatLink("com.orions2.alm_tipo_movimiento") + "?" + GXutil.URLEncode(GXutil.rtrim("UPD")) + "," + GXutil.URLEncode(GXutil.rtrim(A38Tpmo_Codigo)) ;
      edtavDelete_Link = formatLink("com.orions2.alm_tipo_movimiento") + "?" + GXutil.URLEncode(GXutil.rtrim("DLT")) + "," + GXutil.URLEncode(GXutil.rtrim(A38Tpmo_Codigo)) ;
      edtTpmo_Descripcion_Link = formatLink("com.orions2.viewalm_tipo_movimiento") + "?" + GXutil.URLEncode(GXutil.rtrim(A38Tpmo_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      edtTipo_Descripcion_Link = formatLink("com.orions2.viewalm_tipo_elemento") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A33Tipo_Codigo,18,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(20) ;
      }
      sendrow_202( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_20_Refreshing )
      {
         httpContext.doAjaxLoad(20, GridRow);
      }
   }

   public void e115Y2( )
   {
      /* 'DoInsert' Routine */
      callWebObject(formatLink("com.orions2.alm_tipo_movimiento") + "?" + GXutil.URLEncode(GXutil.rtrim("INS")) + "," + GXutil.URLEncode(GXutil.rtrim("")));
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV10TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV17Pgmname );
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerondelete( true );
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV9HTTPRequest.getScriptName()+"?"+AV9HTTPRequest.getQuerystring() );
      AV10TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_TIPO_MOVIMIENTO" );
      AV11TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV11TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Orig_Identificador" );
      AV11TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV7Orig_Identificador, 11, 0) );
      AV10TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV11TrnContextAtt, 0);
      AV8Session.setValue("TrnContext", AV10TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      AV7Orig_Identificador = ((Number) GXutil.testNumericType( getParm(obj,0,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Orig_Identificador", GXutil.ltrim( GXutil.str( AV7Orig_Identificador, 11, 0)));
   }

   public String getresponse( String sGXDynURL )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.setDefaultTheme("Carmine");
      }
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa5Y2( ) ;
      ws5Y2( ) ;
      we5Y2( ) ;
      httpContext.setWrapped(false);
      httpContext.SaveComponentMsgList(sPrefix);
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

   public void componentbind( Object[] obj )
   {
      if ( IsUrlCreated( ) )
      {
         return  ;
      }
      sCtrlAV7Orig_Identificador = (String)getParm(obj,0,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa5Y2( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "alm_origen_bienestipo_movimiento_origenwc");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa5Y2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV7Orig_Identificador = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Orig_Identificador", GXutil.ltrim( GXutil.str( AV7Orig_Identificador, 11, 0)));
      }
      wcpOAV7Orig_Identificador = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7Orig_Identificador"), ",", ".") ;
      if ( ! GetJustCreated( ) && ( ( AV7Orig_Identificador != wcpOAV7Orig_Identificador ) ) )
      {
         setjustcreated();
      }
      wcpOAV7Orig_Identificador = AV7Orig_Identificador ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV7Orig_Identificador = httpContext.cgiGet( sPrefix+"AV7Orig_Identificador_CTRL") ;
      if ( GXutil.len( sCtrlAV7Orig_Identificador) > 0 )
      {
         AV7Orig_Identificador = localUtil.ctol( httpContext.cgiGet( sCtrlAV7Orig_Identificador), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Orig_Identificador", GXutil.ltrim( GXutil.str( AV7Orig_Identificador, 11, 0)));
      }
      else
      {
         AV7Orig_Identificador = localUtil.ctol( httpContext.cgiGet( sPrefix+"AV7Orig_Identificador_PARM"), ",", ".") ;
      }
   }

   public void componentprocess( String sPPrefix ,
                                 String sPSFPrefix ,
                                 String sCompEvt )
   {
      sCompPrefix = sPPrefix ;
      sSFPrefix = sPSFPrefix ;
      sPrefix = sCompPrefix + sSFPrefix ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      initweb( ) ;
      nDraw = (byte)(0) ;
      pa5Y2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws5Y2( ) ;
      if ( isFullAjaxMode( ) )
      {
         componentdraw();
      }
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void componentstart( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
   }

   public void wcstart( )
   {
      nDraw = (byte)(1) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      ws5Y2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Orig_Identificador_PARM", GXutil.ltrim( localUtil.ntoc( AV7Orig_Identificador, (byte)(11), (byte)(0), ",", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7Orig_Identificador)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Orig_Identificador_CTRL", GXutil.rtrim( sCtrlAV7Orig_Identificador));
      }
   }

   public void componentdraw( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      wcparametersset( ) ;
      we5Y2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public String componentgetstring( String sGXControl )
   {
      String sCtrlName ;
      if ( GXutil.strcmp(GXutil.substring( sGXControl, 1, 1), "&") == 0 )
      {
         sCtrlName = GXutil.substring( sGXControl, 2, GXutil.len( sGXControl)-1) ;
      }
      else
      {
         sCtrlName = sGXControl ;
      }
      return httpContext.cgiGet( sPrefix+"v"+GXutil.upper( sCtrlName)) ;
   }

   public void componentjscripts( )
   {
      include_jscripts( ) ;
   }

   public void componentthemes( )
   {
      define_styles( ) ;
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?14361167");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20186141416278");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("alm_origen_bienestipo_movimiento_origenwc.js", "?20186141416278");
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_202( )
   {
      edtTpmo_Codigo_Internalname = sPrefix+"TPMO_CODIGO_"+sGXsfl_20_idx ;
      edtTpmo_Descripcion_Internalname = sPrefix+"TPMO_DESCRIPCION_"+sGXsfl_20_idx ;
      edtTipo_Codigo_Internalname = sPrefix+"TIPO_CODIGO_"+sGXsfl_20_idx ;
      edtTipo_Descripcion_Internalname = sPrefix+"TIPO_DESCRIPCION_"+sGXsfl_20_idx ;
      cmbTipo_Tipo.setInternalname( sPrefix+"TIPO_TIPO_"+sGXsfl_20_idx );
      edtTpmo_AlmacenOrigenId_Internalname = sPrefix+"TPMO_ALMACENORIGENID_"+sGXsfl_20_idx ;
      edtTpmo_AlmacenOrigenDescrip_Internalname = sPrefix+"TPMO_ALMACENORIGENDESCRIP_"+sGXsfl_20_idx ;
      edtTpmo_AlmacenDestinoId_Internalname = sPrefix+"TPMO_ALMACENDESTINOID_"+sGXsfl_20_idx ;
      edtTpmo_AlmacenDestinoDescrip_Internalname = sPrefix+"TPMO_ALMACENDESTINODESCRIP_"+sGXsfl_20_idx ;
      cmbTpmo_TipoE_S.setInternalname( sPrefix+"TPMO_TIPOE_S_"+sGXsfl_20_idx );
      cmbTpmo_Modulo.setInternalname( sPrefix+"TPMO_MODULO_"+sGXsfl_20_idx );
      cmbTpmo_IngresaAredante.setInternalname( sPrefix+"TPMO_INGRESAAREDANTE_"+sGXsfl_20_idx );
      cmbTpmo_IngresaCurso.setInternalname( sPrefix+"TPMO_INGRESACURSO_"+sGXsfl_20_idx );
      edtTpmo_UsuarioCrea_Internalname = sPrefix+"TPMO_USUARIOCREA_"+sGXsfl_20_idx ;
      edtTpmo_FechaCrea_Internalname = sPrefix+"TPMO_FECHACREA_"+sGXsfl_20_idx ;
      edtTpmo_UsuarioModifica_Internalname = sPrefix+"TPMO_USUARIOMODIFICA_"+sGXsfl_20_idx ;
      edtTpmo_FechaModifica_Internalname = sPrefix+"TPMO_FECHAMODIFICA_"+sGXsfl_20_idx ;
      edtTpmo_ConsecutivoTrans_Internalname = sPrefix+"TPMO_CONSECUTIVOTRANS_"+sGXsfl_20_idx ;
      cmbTpmo_Controlado.setInternalname( sPrefix+"TPMO_CONTROLADO_"+sGXsfl_20_idx );
      cmbTpmo_VidaUtil.setInternalname( sPrefix+"TPMO_VIDAUTIL_"+sGXsfl_20_idx );
      cmbTpmo_Estado.setInternalname( sPrefix+"TPMO_ESTADO_"+sGXsfl_20_idx );
      cmbTpmo_CuentaResponsabilidad.setInternalname( sPrefix+"TPMO_CUENTARESPONSABILIDAD_"+sGXsfl_20_idx );
      cmbTpmo_SolicitaRegionDestino.setInternalname( sPrefix+"TPMO_SOLICITAREGIONDESTINO_"+sGXsfl_20_idx );
      cmbTpmo_SolicitaCentroDestino.setInternalname( sPrefix+"TPMO_SOLICITACENTRODESTINO_"+sGXsfl_20_idx );
      cmbTpmo_ImprimeOrigen.setInternalname( sPrefix+"TPMO_IMPRIMEORIGEN_"+sGXsfl_20_idx );
      cmbTpmo_ImprimeDestino.setInternalname( sPrefix+"TPMO_IMPRIMEDESTINO_"+sGXsfl_20_idx );
      cmbTmpo_ImprimeResponsable.setInternalname( sPrefix+"TMPO_IMPRIMERESPONSABLE_"+sGXsfl_20_idx );
      edtavUpdate_Internalname = sPrefix+"vUPDATE_"+sGXsfl_20_idx ;
      edtavDelete_Internalname = sPrefix+"vDELETE_"+sGXsfl_20_idx ;
   }

   public void subsflControlProps_fel_202( )
   {
      edtTpmo_Codigo_Internalname = sPrefix+"TPMO_CODIGO_"+sGXsfl_20_fel_idx ;
      edtTpmo_Descripcion_Internalname = sPrefix+"TPMO_DESCRIPCION_"+sGXsfl_20_fel_idx ;
      edtTipo_Codigo_Internalname = sPrefix+"TIPO_CODIGO_"+sGXsfl_20_fel_idx ;
      edtTipo_Descripcion_Internalname = sPrefix+"TIPO_DESCRIPCION_"+sGXsfl_20_fel_idx ;
      cmbTipo_Tipo.setInternalname( sPrefix+"TIPO_TIPO_"+sGXsfl_20_fel_idx );
      edtTpmo_AlmacenOrigenId_Internalname = sPrefix+"TPMO_ALMACENORIGENID_"+sGXsfl_20_fel_idx ;
      edtTpmo_AlmacenOrigenDescrip_Internalname = sPrefix+"TPMO_ALMACENORIGENDESCRIP_"+sGXsfl_20_fel_idx ;
      edtTpmo_AlmacenDestinoId_Internalname = sPrefix+"TPMO_ALMACENDESTINOID_"+sGXsfl_20_fel_idx ;
      edtTpmo_AlmacenDestinoDescrip_Internalname = sPrefix+"TPMO_ALMACENDESTINODESCRIP_"+sGXsfl_20_fel_idx ;
      cmbTpmo_TipoE_S.setInternalname( sPrefix+"TPMO_TIPOE_S_"+sGXsfl_20_fel_idx );
      cmbTpmo_Modulo.setInternalname( sPrefix+"TPMO_MODULO_"+sGXsfl_20_fel_idx );
      cmbTpmo_IngresaAredante.setInternalname( sPrefix+"TPMO_INGRESAAREDANTE_"+sGXsfl_20_fel_idx );
      cmbTpmo_IngresaCurso.setInternalname( sPrefix+"TPMO_INGRESACURSO_"+sGXsfl_20_fel_idx );
      edtTpmo_UsuarioCrea_Internalname = sPrefix+"TPMO_USUARIOCREA_"+sGXsfl_20_fel_idx ;
      edtTpmo_FechaCrea_Internalname = sPrefix+"TPMO_FECHACREA_"+sGXsfl_20_fel_idx ;
      edtTpmo_UsuarioModifica_Internalname = sPrefix+"TPMO_USUARIOMODIFICA_"+sGXsfl_20_fel_idx ;
      edtTpmo_FechaModifica_Internalname = sPrefix+"TPMO_FECHAMODIFICA_"+sGXsfl_20_fel_idx ;
      edtTpmo_ConsecutivoTrans_Internalname = sPrefix+"TPMO_CONSECUTIVOTRANS_"+sGXsfl_20_fel_idx ;
      cmbTpmo_Controlado.setInternalname( sPrefix+"TPMO_CONTROLADO_"+sGXsfl_20_fel_idx );
      cmbTpmo_VidaUtil.setInternalname( sPrefix+"TPMO_VIDAUTIL_"+sGXsfl_20_fel_idx );
      cmbTpmo_Estado.setInternalname( sPrefix+"TPMO_ESTADO_"+sGXsfl_20_fel_idx );
      cmbTpmo_CuentaResponsabilidad.setInternalname( sPrefix+"TPMO_CUENTARESPONSABILIDAD_"+sGXsfl_20_fel_idx );
      cmbTpmo_SolicitaRegionDestino.setInternalname( sPrefix+"TPMO_SOLICITAREGIONDESTINO_"+sGXsfl_20_fel_idx );
      cmbTpmo_SolicitaCentroDestino.setInternalname( sPrefix+"TPMO_SOLICITACENTRODESTINO_"+sGXsfl_20_fel_idx );
      cmbTpmo_ImprimeOrigen.setInternalname( sPrefix+"TPMO_IMPRIMEORIGEN_"+sGXsfl_20_fel_idx );
      cmbTpmo_ImprimeDestino.setInternalname( sPrefix+"TPMO_IMPRIMEDESTINO_"+sGXsfl_20_fel_idx );
      cmbTmpo_ImprimeResponsable.setInternalname( sPrefix+"TMPO_IMPRIMERESPONSABLE_"+sGXsfl_20_fel_idx );
      edtavUpdate_Internalname = sPrefix+"vUPDATE_"+sGXsfl_20_fel_idx ;
      edtavDelete_Internalname = sPrefix+"vDELETE_"+sGXsfl_20_fel_idx ;
   }

   public void sendrow_202( )
   {
      subsflControlProps_202( ) ;
      wb5Y0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_20_idx <= subgrid_recordsperpage( ) * 1 ) )
      {
         GridRow = GXWebRow.GetNew(context,GridContainer) ;
         if ( subGrid_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Odd" ;
            }
         }
         else if ( subGrid_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid_Backstyle = (byte)(0) ;
            subGrid_Backcolor = subGrid_Allbackcolor ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Uniform" ;
            }
         }
         else if ( subGrid_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Odd" ;
            }
            subGrid_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_20_idx) % (2))) == 0 )
            {
               subGrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid_Class, "") != 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Even" ;
               }
            }
            else
            {
               subGrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid_Class, "") != 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Odd" ;
               }
            }
         }
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"ViewGrid"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_20_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTpmo_Codigo_Internalname,A38Tpmo_Codigo,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTpmo_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTpmo_Descripcion_Internalname,A313Tpmo_Descripcion,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'",edtTpmo_Descripcion_Link,"","","",edtTpmo_Descripcion_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipo_Codigo_Internalname,GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A33Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTipo_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipo_Descripcion_Internalname,A253Tipo_Descripcion,GXutil.rtrim( localUtil.format( A253Tipo_Descripcion, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'",edtTipo_Descripcion_Link,"","","",edtTipo_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         GXCCtl = "TIPO_TIPO_" + sGXsfl_20_idx ;
         cmbTipo_Tipo.setName( GXCCtl );
         cmbTipo_Tipo.setWebtags( "" );
         cmbTipo_Tipo.addItem("C", "Consumo", (short)(0));
         cmbTipo_Tipo.addItem("D", "Devolutivo", (short)(0));
         if ( cmbTipo_Tipo.getItemCount() > 0 )
         {
            A480Tipo_Tipo = cmbTipo_Tipo.getValidValue(A480Tipo_Tipo) ;
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTipo_Tipo,cmbTipo_Tipo.getInternalname(),GXutil.rtrim( A480Tipo_Tipo),new Integer(1),cmbTipo_Tipo.getJsonclick(),new Integer(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(0),new Integer(1),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbTipo_Tipo.setValue( GXutil.rtrim( A480Tipo_Tipo) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTipo_Tipo.getInternalname(), "Values", cmbTipo_Tipo.ToJavascriptSource(), !bGXsfl_20_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTpmo_AlmacenOrigenId_Internalname,GXutil.ltrim( localUtil.ntoc( A39Tpmo_AlmacenOrigenId, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A39Tpmo_AlmacenOrigenId), "ZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTpmo_AlmacenOrigenId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTpmo_AlmacenOrigenDescrip_Internalname,A312Tpmo_AlmacenOrigenDescrip,GXutil.rtrim( localUtil.format( A312Tpmo_AlmacenOrigenDescrip, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTpmo_AlmacenOrigenDescrip_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTpmo_AlmacenDestinoId_Internalname,GXutil.ltrim( localUtil.ntoc( A40Tpmo_AlmacenDestinoId, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A40Tpmo_AlmacenDestinoId), "ZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTpmo_AlmacenDestinoId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTpmo_AlmacenDestinoDescrip_Internalname,A314Tpmo_AlmacenDestinoDescrip,GXutil.rtrim( localUtil.format( A314Tpmo_AlmacenDestinoDescrip, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTpmo_AlmacenDestinoDescrip_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         GXCCtl = "TPMO_TIPOE_S_" + sGXsfl_20_idx ;
         cmbTpmo_TipoE_S.setName( GXCCtl );
         cmbTpmo_TipoE_S.setWebtags( "" );
         cmbTpmo_TipoE_S.addItem("E", "ENTRADA", (short)(0));
         cmbTpmo_TipoE_S.addItem("S", "SALIDA", (short)(0));
         cmbTpmo_TipoE_S.addItem("T", "TRASPASO", (short)(0));
         cmbTpmo_TipoE_S.addItem("R", "RECUPERACIÓN", (short)(0));
         if ( cmbTpmo_TipoE_S.getItemCount() > 0 )
         {
            A315Tpmo_TipoE_S = cmbTpmo_TipoE_S.getValidValue(A315Tpmo_TipoE_S) ;
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTpmo_TipoE_S,cmbTpmo_TipoE_S.getInternalname(),GXutil.rtrim( A315Tpmo_TipoE_S),new Integer(1),cmbTpmo_TipoE_S.getJsonclick(),new Integer(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(1),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbTpmo_TipoE_S.setValue( GXutil.rtrim( A315Tpmo_TipoE_S) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTpmo_TipoE_S.getInternalname(), "Values", cmbTpmo_TipoE_S.ToJavascriptSource(), !bGXsfl_20_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         GXCCtl = "TPMO_MODULO_" + sGXsfl_20_idx ;
         cmbTpmo_Modulo.setName( GXCCtl );
         cmbTpmo_Modulo.setWebtags( "" );
         cmbTpmo_Modulo.addItem("", "", (short)(0));
         cmbTpmo_Modulo.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
         cmbTpmo_Modulo.addItem("INVE", "INVENTARIO", (short)(0));
         cmbTpmo_Modulo.addItem("ALMA", "ALMACEN", (short)(0));
         if ( cmbTpmo_Modulo.getItemCount() > 0 )
         {
            A316Tpmo_Modulo = cmbTpmo_Modulo.getValidValue(A316Tpmo_Modulo) ;
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTpmo_Modulo,cmbTpmo_Modulo.getInternalname(),GXutil.rtrim( A316Tpmo_Modulo),new Integer(1),cmbTpmo_Modulo.getJsonclick(),new Integer(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(1),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbTpmo_Modulo.setValue( GXutil.rtrim( A316Tpmo_Modulo) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTpmo_Modulo.getInternalname(), "Values", cmbTpmo_Modulo.ToJavascriptSource(), !bGXsfl_20_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         GXCCtl = "TPMO_INGRESAAREDANTE_" + sGXsfl_20_idx ;
         cmbTpmo_IngresaAredante.setName( GXCCtl );
         cmbTpmo_IngresaAredante.setWebtags( "" );
         cmbTpmo_IngresaAredante.addItem("", "", (short)(0));
         cmbTpmo_IngresaAredante.addItem("SI", "SI", (short)(0));
         cmbTpmo_IngresaAredante.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_IngresaAredante.getItemCount() > 0 )
         {
            A440Tpmo_IngresaAredante = cmbTpmo_IngresaAredante.getValidValue(A440Tpmo_IngresaAredante) ;
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTpmo_IngresaAredante,cmbTpmo_IngresaAredante.getInternalname(),GXutil.rtrim( A440Tpmo_IngresaAredante),new Integer(1),cmbTpmo_IngresaAredante.getJsonclick(),new Integer(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(1),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbTpmo_IngresaAredante.setValue( GXutil.rtrim( A440Tpmo_IngresaAredante) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTpmo_IngresaAredante.getInternalname(), "Values", cmbTpmo_IngresaAredante.ToJavascriptSource(), !bGXsfl_20_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         GXCCtl = "TPMO_INGRESACURSO_" + sGXsfl_20_idx ;
         cmbTpmo_IngresaCurso.setName( GXCCtl );
         cmbTpmo_IngresaCurso.setWebtags( "" );
         cmbTpmo_IngresaCurso.addItem("", "", (short)(0));
         cmbTpmo_IngresaCurso.addItem("SI", "SI", (short)(0));
         cmbTpmo_IngresaCurso.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_IngresaCurso.getItemCount() > 0 )
         {
            A441Tpmo_IngresaCurso = cmbTpmo_IngresaCurso.getValidValue(A441Tpmo_IngresaCurso) ;
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTpmo_IngresaCurso,cmbTpmo_IngresaCurso.getInternalname(),GXutil.rtrim( A441Tpmo_IngresaCurso),new Integer(1),cmbTpmo_IngresaCurso.getJsonclick(),new Integer(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(1),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbTpmo_IngresaCurso.setValue( GXutil.rtrim( A441Tpmo_IngresaCurso) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTpmo_IngresaCurso.getInternalname(), "Values", cmbTpmo_IngresaCurso.ToJavascriptSource(), !bGXsfl_20_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTpmo_UsuarioCrea_Internalname,A317Tpmo_UsuarioCrea,GXutil.rtrim( localUtil.format( A317Tpmo_UsuarioCrea, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTpmo_UsuarioCrea_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTpmo_FechaCrea_Internalname,localUtil.ttoc( A318Tpmo_FechaCrea, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A318Tpmo_FechaCrea, "99/99/99 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTpmo_FechaCrea_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTpmo_UsuarioModifica_Internalname,A319Tpmo_UsuarioModifica,GXutil.rtrim( localUtil.format( A319Tpmo_UsuarioModifica, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTpmo_UsuarioModifica_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTpmo_FechaModifica_Internalname,localUtil.ttoc( A320Tpmo_FechaModifica, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A320Tpmo_FechaModifica, "99/99/99 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTpmo_FechaModifica_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTpmo_ConsecutivoTrans_Internalname,GXutil.ltrim( localUtil.ntoc( A595Tpmo_ConsecutivoTrans, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A595Tpmo_ConsecutivoTrans), "ZZZZZZZZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTpmo_ConsecutivoTrans_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         GXCCtl = "TPMO_CONTROLADO_" + sGXsfl_20_idx ;
         cmbTpmo_Controlado.setName( GXCCtl );
         cmbTpmo_Controlado.setWebtags( "" );
         cmbTpmo_Controlado.addItem("", "", (short)(0));
         cmbTpmo_Controlado.addItem("SI", "SI", (short)(0));
         cmbTpmo_Controlado.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_Controlado.getItemCount() > 0 )
         {
            A633Tpmo_Controlado = cmbTpmo_Controlado.getValidValue(A633Tpmo_Controlado) ;
            n633Tpmo_Controlado = false ;
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTpmo_Controlado,cmbTpmo_Controlado.getInternalname(),GXutil.rtrim( A633Tpmo_Controlado),new Integer(1),cmbTpmo_Controlado.getJsonclick(),new Integer(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(1),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbTpmo_Controlado.setValue( GXutil.rtrim( A633Tpmo_Controlado) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTpmo_Controlado.getInternalname(), "Values", cmbTpmo_Controlado.ToJavascriptSource(), !bGXsfl_20_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         GXCCtl = "TPMO_VIDAUTIL_" + sGXsfl_20_idx ;
         cmbTpmo_VidaUtil.setName( GXCCtl );
         cmbTpmo_VidaUtil.setWebtags( "" );
         cmbTpmo_VidaUtil.addItem("", "", (short)(0));
         cmbTpmo_VidaUtil.addItem("SI", "SI", (short)(0));
         cmbTpmo_VidaUtil.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_VidaUtil.getItemCount() > 0 )
         {
            A641Tpmo_VidaUtil = cmbTpmo_VidaUtil.getValidValue(A641Tpmo_VidaUtil) ;
            n641Tpmo_VidaUtil = false ;
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTpmo_VidaUtil,cmbTpmo_VidaUtil.getInternalname(),GXutil.rtrim( A641Tpmo_VidaUtil),new Integer(1),cmbTpmo_VidaUtil.getJsonclick(),new Integer(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(1),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbTpmo_VidaUtil.setValue( GXutil.rtrim( A641Tpmo_VidaUtil) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTpmo_VidaUtil.getInternalname(), "Values", cmbTpmo_VidaUtil.ToJavascriptSource(), !bGXsfl_20_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         GXCCtl = "TPMO_ESTADO_" + sGXsfl_20_idx ;
         cmbTpmo_Estado.setName( GXCCtl );
         cmbTpmo_Estado.setWebtags( "" );
         cmbTpmo_Estado.addItem("A", "Activo", (short)(0));
         cmbTpmo_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbTpmo_Estado.getItemCount() > 0 )
         {
            A679Tpmo_Estado = cmbTpmo_Estado.getValidValue(A679Tpmo_Estado) ;
            n679Tpmo_Estado = false ;
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTpmo_Estado,cmbTpmo_Estado.getInternalname(),GXutil.rtrim( A679Tpmo_Estado),new Integer(1),cmbTpmo_Estado.getJsonclick(),new Integer(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(0),new Integer(1),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbTpmo_Estado.setValue( GXutil.rtrim( A679Tpmo_Estado) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTpmo_Estado.getInternalname(), "Values", cmbTpmo_Estado.ToJavascriptSource(), !bGXsfl_20_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         GXCCtl = "TPMO_CUENTARESPONSABILIDAD_" + sGXsfl_20_idx ;
         cmbTpmo_CuentaResponsabilidad.setName( GXCCtl );
         cmbTpmo_CuentaResponsabilidad.setWebtags( "" );
         cmbTpmo_CuentaResponsabilidad.addItem("", "", (short)(0));
         cmbTpmo_CuentaResponsabilidad.addItem("SI", "SI", (short)(0));
         cmbTpmo_CuentaResponsabilidad.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_CuentaResponsabilidad.getItemCount() > 0 )
         {
            A680Tpmo_CuentaResponsabilidad = cmbTpmo_CuentaResponsabilidad.getValidValue(A680Tpmo_CuentaResponsabilidad) ;
            n680Tpmo_CuentaResponsabilidad = false ;
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTpmo_CuentaResponsabilidad,cmbTpmo_CuentaResponsabilidad.getInternalname(),GXutil.rtrim( A680Tpmo_CuentaResponsabilidad),new Integer(1),cmbTpmo_CuentaResponsabilidad.getJsonclick(),new Integer(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(1),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbTpmo_CuentaResponsabilidad.setValue( GXutil.rtrim( A680Tpmo_CuentaResponsabilidad) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTpmo_CuentaResponsabilidad.getInternalname(), "Values", cmbTpmo_CuentaResponsabilidad.ToJavascriptSource(), !bGXsfl_20_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         GXCCtl = "TPMO_SOLICITAREGIONDESTINO_" + sGXsfl_20_idx ;
         cmbTpmo_SolicitaRegionDestino.setName( GXCCtl );
         cmbTpmo_SolicitaRegionDestino.setWebtags( "" );
         cmbTpmo_SolicitaRegionDestino.addItem("", "", (short)(0));
         cmbTpmo_SolicitaRegionDestino.addItem("SI", "SI", (short)(0));
         cmbTpmo_SolicitaRegionDestino.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_SolicitaRegionDestino.getItemCount() > 0 )
         {
            A705Tpmo_SolicitaRegionDestino = cmbTpmo_SolicitaRegionDestino.getValidValue(A705Tpmo_SolicitaRegionDestino) ;
            n705Tpmo_SolicitaRegionDestino = false ;
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTpmo_SolicitaRegionDestino,cmbTpmo_SolicitaRegionDestino.getInternalname(),GXutil.rtrim( A705Tpmo_SolicitaRegionDestino),new Integer(1),cmbTpmo_SolicitaRegionDestino.getJsonclick(),new Integer(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(1),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbTpmo_SolicitaRegionDestino.setValue( GXutil.rtrim( A705Tpmo_SolicitaRegionDestino) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTpmo_SolicitaRegionDestino.getInternalname(), "Values", cmbTpmo_SolicitaRegionDestino.ToJavascriptSource(), !bGXsfl_20_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         GXCCtl = "TPMO_SOLICITACENTRODESTINO_" + sGXsfl_20_idx ;
         cmbTpmo_SolicitaCentroDestino.setName( GXCCtl );
         cmbTpmo_SolicitaCentroDestino.setWebtags( "" );
         cmbTpmo_SolicitaCentroDestino.addItem("", "", (short)(0));
         cmbTpmo_SolicitaCentroDestino.addItem("SI", "SI", (short)(0));
         cmbTpmo_SolicitaCentroDestino.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_SolicitaCentroDestino.getItemCount() > 0 )
         {
            A706Tpmo_SolicitaCentroDestino = cmbTpmo_SolicitaCentroDestino.getValidValue(A706Tpmo_SolicitaCentroDestino) ;
            n706Tpmo_SolicitaCentroDestino = false ;
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTpmo_SolicitaCentroDestino,cmbTpmo_SolicitaCentroDestino.getInternalname(),GXutil.rtrim( A706Tpmo_SolicitaCentroDestino),new Integer(1),cmbTpmo_SolicitaCentroDestino.getJsonclick(),new Integer(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(1),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbTpmo_SolicitaCentroDestino.setValue( GXutil.rtrim( A706Tpmo_SolicitaCentroDestino) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTpmo_SolicitaCentroDestino.getInternalname(), "Values", cmbTpmo_SolicitaCentroDestino.ToJavascriptSource(), !bGXsfl_20_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         GXCCtl = "TPMO_IMPRIMEORIGEN_" + sGXsfl_20_idx ;
         cmbTpmo_ImprimeOrigen.setName( GXCCtl );
         cmbTpmo_ImprimeOrigen.setWebtags( "" );
         cmbTpmo_ImprimeOrigen.addItem("", "", (short)(0));
         cmbTpmo_ImprimeOrigen.addItem("SI", "SI", (short)(0));
         cmbTpmo_ImprimeOrigen.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_ImprimeOrigen.getItemCount() > 0 )
         {
            A716Tpmo_ImprimeOrigen = cmbTpmo_ImprimeOrigen.getValidValue(A716Tpmo_ImprimeOrigen) ;
            n716Tpmo_ImprimeOrigen = false ;
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTpmo_ImprimeOrigen,cmbTpmo_ImprimeOrigen.getInternalname(),GXutil.rtrim( A716Tpmo_ImprimeOrigen),new Integer(1),cmbTpmo_ImprimeOrigen.getJsonclick(),new Integer(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(1),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbTpmo_ImprimeOrigen.setValue( GXutil.rtrim( A716Tpmo_ImprimeOrigen) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTpmo_ImprimeOrigen.getInternalname(), "Values", cmbTpmo_ImprimeOrigen.ToJavascriptSource(), !bGXsfl_20_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         GXCCtl = "TPMO_IMPRIMEDESTINO_" + sGXsfl_20_idx ;
         cmbTpmo_ImprimeDestino.setName( GXCCtl );
         cmbTpmo_ImprimeDestino.setWebtags( "" );
         cmbTpmo_ImprimeDestino.addItem("", "", (short)(0));
         cmbTpmo_ImprimeDestino.addItem("SI", "SI", (short)(0));
         cmbTpmo_ImprimeDestino.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_ImprimeDestino.getItemCount() > 0 )
         {
            A717Tpmo_ImprimeDestino = cmbTpmo_ImprimeDestino.getValidValue(A717Tpmo_ImprimeDestino) ;
            n717Tpmo_ImprimeDestino = false ;
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTpmo_ImprimeDestino,cmbTpmo_ImprimeDestino.getInternalname(),GXutil.rtrim( A717Tpmo_ImprimeDestino),new Integer(1),cmbTpmo_ImprimeDestino.getJsonclick(),new Integer(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(1),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbTpmo_ImprimeDestino.setValue( GXutil.rtrim( A717Tpmo_ImprimeDestino) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTpmo_ImprimeDestino.getInternalname(), "Values", cmbTpmo_ImprimeDestino.ToJavascriptSource(), !bGXsfl_20_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         GXCCtl = "TMPO_IMPRIMERESPONSABLE_" + sGXsfl_20_idx ;
         cmbTmpo_ImprimeResponsable.setName( GXCCtl );
         cmbTmpo_ImprimeResponsable.setWebtags( "" );
         cmbTmpo_ImprimeResponsable.addItem("", "", (short)(0));
         cmbTmpo_ImprimeResponsable.addItem("SI", "SI", (short)(0));
         cmbTmpo_ImprimeResponsable.addItem("NO", "NO", (short)(0));
         if ( cmbTmpo_ImprimeResponsable.getItemCount() > 0 )
         {
            A718Tmpo_ImprimeResponsable = cmbTmpo_ImprimeResponsable.getValidValue(A718Tmpo_ImprimeResponsable) ;
            n718Tmpo_ImprimeResponsable = false ;
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTmpo_ImprimeResponsable,cmbTmpo_ImprimeResponsable.getInternalname(),GXutil.rtrim( A718Tmpo_ImprimeResponsable),new Integer(1),cmbTmpo_ImprimeResponsable.getJsonclick(),new Integer(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(1),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbTmpo_ImprimeResponsable.setValue( GXutil.rtrim( A718Tmpo_ImprimeResponsable) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTmpo_ImprimeResponsable.getInternalname(), "Values", cmbTmpo_ImprimeResponsable.ToJavascriptSource(), !bGXsfl_20_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         ClassString = "UpdateAttribute" ;
         StyleString = "" ;
         AV12Update_IsBlob = (boolean)(((GXutil.strcmp("", AV12Update)==0)&&(GXutil.strcmp("", AV18Update_GXI)==0))||!(GXutil.strcmp("", AV12Update)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV12Update)==0) ? AV18Update_GXI : httpContext.getResourceRelative(AV12Update)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavUpdate_Internalname,sImgUrl,edtavUpdate_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"",edtavUpdate_Tooltiptext,new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV12Update_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         ClassString = "DeleteAttribute" ;
         StyleString = "" ;
         AV13Delete_IsBlob = (boolean)(((GXutil.strcmp("", AV13Delete)==0)&&(GXutil.strcmp("", AV19Delete_GXI)==0))||!(GXutil.strcmp("", AV13Delete)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV13Delete)==0) ? AV19Delete_GXI : httpContext.getResourceRelative(AV13Delete)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavDelete_Internalname,sImgUrl,edtavDelete_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"",edtavDelete_Tooltiptext,new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV13Delete_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TPMO_CODIGO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A38Tpmo_Codigo, ""))));
         GridContainer.AddRow(GridRow);
         nGXsfl_20_idx = (short)(((subGrid_Islastpage==1)&&(nGXsfl_20_idx+1>subgrid_recordsperpage( )) ? 1 : nGXsfl_20_idx+1)) ;
         sGXsfl_20_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_20_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_202( ) ;
      }
      /* End function sendrow_202 */
   }

   public void init_default_properties( )
   {
      bttBtninsert_Internalname = sPrefix+"BTNINSERT" ;
      divTabletop_Internalname = sPrefix+"TABLETOP" ;
      edtTpmo_Codigo_Internalname = sPrefix+"TPMO_CODIGO" ;
      edtTpmo_Descripcion_Internalname = sPrefix+"TPMO_DESCRIPCION" ;
      edtTipo_Codigo_Internalname = sPrefix+"TIPO_CODIGO" ;
      edtTipo_Descripcion_Internalname = sPrefix+"TIPO_DESCRIPCION" ;
      cmbTipo_Tipo.setInternalname( sPrefix+"TIPO_TIPO" );
      edtTpmo_AlmacenOrigenId_Internalname = sPrefix+"TPMO_ALMACENORIGENID" ;
      edtTpmo_AlmacenOrigenDescrip_Internalname = sPrefix+"TPMO_ALMACENORIGENDESCRIP" ;
      edtTpmo_AlmacenDestinoId_Internalname = sPrefix+"TPMO_ALMACENDESTINOID" ;
      edtTpmo_AlmacenDestinoDescrip_Internalname = sPrefix+"TPMO_ALMACENDESTINODESCRIP" ;
      cmbTpmo_TipoE_S.setInternalname( sPrefix+"TPMO_TIPOE_S" );
      cmbTpmo_Modulo.setInternalname( sPrefix+"TPMO_MODULO" );
      cmbTpmo_IngresaAredante.setInternalname( sPrefix+"TPMO_INGRESAAREDANTE" );
      cmbTpmo_IngresaCurso.setInternalname( sPrefix+"TPMO_INGRESACURSO" );
      edtTpmo_UsuarioCrea_Internalname = sPrefix+"TPMO_USUARIOCREA" ;
      edtTpmo_FechaCrea_Internalname = sPrefix+"TPMO_FECHACREA" ;
      edtTpmo_UsuarioModifica_Internalname = sPrefix+"TPMO_USUARIOMODIFICA" ;
      edtTpmo_FechaModifica_Internalname = sPrefix+"TPMO_FECHAMODIFICA" ;
      edtTpmo_ConsecutivoTrans_Internalname = sPrefix+"TPMO_CONSECUTIVOTRANS" ;
      cmbTpmo_Controlado.setInternalname( sPrefix+"TPMO_CONTROLADO" );
      cmbTpmo_VidaUtil.setInternalname( sPrefix+"TPMO_VIDAUTIL" );
      cmbTpmo_Estado.setInternalname( sPrefix+"TPMO_ESTADO" );
      cmbTpmo_CuentaResponsabilidad.setInternalname( sPrefix+"TPMO_CUENTARESPONSABILIDAD" );
      cmbTpmo_SolicitaRegionDestino.setInternalname( sPrefix+"TPMO_SOLICITAREGIONDESTINO" );
      cmbTpmo_SolicitaCentroDestino.setInternalname( sPrefix+"TPMO_SOLICITACENTRODESTINO" );
      cmbTpmo_ImprimeOrigen.setInternalname( sPrefix+"TPMO_IMPRIMEORIGEN" );
      cmbTpmo_ImprimeDestino.setInternalname( sPrefix+"TPMO_IMPRIMEDESTINO" );
      cmbTmpo_ImprimeResponsable.setInternalname( sPrefix+"TMPO_IMPRIMERESPONSABLE" );
      edtavUpdate_Internalname = sPrefix+"vUPDATE" ;
      edtavDelete_Internalname = sPrefix+"vDELETE" ;
      divGridtable_Internalname = sPrefix+"GRIDTABLE" ;
      divGridcell_Internalname = sPrefix+"GRIDCELL" ;
      edtOrig_Identificador_Internalname = sPrefix+"ORIG_IDENTIFICADOR" ;
      divMaintable_Internalname = sPrefix+"MAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
      subGrid_Internalname = sPrefix+"GRID" ;
   }

   public void initialize_properties( )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      init_default_properties( ) ;
      cmbTmpo_ImprimeResponsable.setJsonclick( "" );
      cmbTpmo_ImprimeDestino.setJsonclick( "" );
      cmbTpmo_ImprimeOrigen.setJsonclick( "" );
      cmbTpmo_SolicitaCentroDestino.setJsonclick( "" );
      cmbTpmo_SolicitaRegionDestino.setJsonclick( "" );
      cmbTpmo_CuentaResponsabilidad.setJsonclick( "" );
      cmbTpmo_Estado.setJsonclick( "" );
      cmbTpmo_VidaUtil.setJsonclick( "" );
      cmbTpmo_Controlado.setJsonclick( "" );
      edtTpmo_ConsecutivoTrans_Jsonclick = "" ;
      edtTpmo_FechaModifica_Jsonclick = "" ;
      edtTpmo_UsuarioModifica_Jsonclick = "" ;
      edtTpmo_FechaCrea_Jsonclick = "" ;
      edtTpmo_UsuarioCrea_Jsonclick = "" ;
      cmbTpmo_IngresaCurso.setJsonclick( "" );
      cmbTpmo_IngresaAredante.setJsonclick( "" );
      cmbTpmo_Modulo.setJsonclick( "" );
      cmbTpmo_TipoE_S.setJsonclick( "" );
      edtTpmo_AlmacenDestinoDescrip_Jsonclick = "" ;
      edtTpmo_AlmacenDestinoId_Jsonclick = "" ;
      edtTpmo_AlmacenOrigenDescrip_Jsonclick = "" ;
      edtTpmo_AlmacenOrigenId_Jsonclick = "" ;
      cmbTipo_Tipo.setJsonclick( "" );
      edtTipo_Descripcion_Jsonclick = "" ;
      edtTipo_Codigo_Jsonclick = "" ;
      edtTpmo_Descripcion_Jsonclick = "" ;
      edtTpmo_Codigo_Jsonclick = "" ;
      edtOrig_Identificador_Jsonclick = "" ;
      edtOrig_Identificador_Enabled = 0 ;
      edtOrig_Identificador_Visible = 1 ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      edtavDelete_Link = "" ;
      edtavUpdate_Link = "" ;
      edtTipo_Descripcion_Link = "" ;
      edtTpmo_Descripcion_Link = "" ;
      subGrid_Class = "ViewGrid" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Rows = 0 ;
      edtavDelete_Tooltiptext = "Eliminar" ;
      edtavUpdate_Tooltiptext = "Modificar" ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Orig_Identificador',fld:'vORIG_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A38Tpmo_Codigo',fld:'TPMO_CODIGO',pic:'',hsh:true,nv:''},{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e135Y2',iparms:[{av:'A38Tpmo_Codigo',fld:'TPMO_CODIGO',pic:'',hsh:true,nv:''},{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[{av:'edtavUpdate_Link',ctrl:'vUPDATE',prop:'Link'},{av:'edtavDelete_Link',ctrl:'vDELETE',prop:'Link'},{av:'edtTpmo_Descripcion_Link',ctrl:'TPMO_DESCRIPCION',prop:'Link'},{av:'edtTipo_Descripcion_Link',ctrl:'TIPO_DESCRIPCION',prop:'Link'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e115Y2',iparms:[{av:'A38Tpmo_Codigo',fld:'TPMO_CODIGO',pic:'',hsh:true,nv:''}],oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Orig_Identificador',fld:'vORIG_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A38Tpmo_Codigo',fld:'TPMO_CODIGO',pic:'',hsh:true,nv:''},{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Orig_Identificador',fld:'vORIG_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A38Tpmo_Codigo',fld:'TPMO_CODIGO',pic:'',hsh:true,nv:''},{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Orig_Identificador',fld:'vORIG_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A38Tpmo_Codigo',fld:'TPMO_CODIGO',pic:'',hsh:true,nv:''},{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Orig_Identificador',fld:'vORIG_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A38Tpmo_Codigo',fld:'TPMO_CODIGO',pic:'',hsh:true,nv:''},{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
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
      sPrefix = "" ;
      AV12Update = "" ;
      AV13Delete = "" ;
      A38Tpmo_Codigo = "" ;
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtninsert_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid_Linesclass = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      A313Tpmo_Descripcion = "" ;
      A253Tipo_Descripcion = "" ;
      A480Tipo_Tipo = "" ;
      A312Tpmo_AlmacenOrigenDescrip = "" ;
      A314Tpmo_AlmacenDestinoDescrip = "" ;
      A315Tpmo_TipoE_S = "" ;
      A316Tpmo_Modulo = "" ;
      A440Tpmo_IngresaAredante = "" ;
      A441Tpmo_IngresaCurso = "" ;
      A317Tpmo_UsuarioCrea = "" ;
      A318Tpmo_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A319Tpmo_UsuarioModifica = "" ;
      A320Tpmo_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      A633Tpmo_Controlado = "" ;
      A641Tpmo_VidaUtil = "" ;
      A679Tpmo_Estado = "" ;
      A680Tpmo_CuentaResponsabilidad = "" ;
      A705Tpmo_SolicitaRegionDestino = "" ;
      A706Tpmo_SolicitaCentroDestino = "" ;
      A716Tpmo_ImprimeOrigen = "" ;
      A717Tpmo_ImprimeDestino = "" ;
      A718Tmpo_ImprimeResponsable = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV18Update_GXI = "" ;
      AV19Delete_GXI = "" ;
      GXCCtl = "" ;
      AV17Pgmname = "" ;
      scmdbuf = "" ;
      H005Y2_A41Orig_Identificador = new long[1] ;
      H005Y2_A718Tmpo_ImprimeResponsable = new String[] {""} ;
      H005Y2_n718Tmpo_ImprimeResponsable = new boolean[] {false} ;
      H005Y2_A717Tpmo_ImprimeDestino = new String[] {""} ;
      H005Y2_n717Tpmo_ImprimeDestino = new boolean[] {false} ;
      H005Y2_A716Tpmo_ImprimeOrigen = new String[] {""} ;
      H005Y2_n716Tpmo_ImprimeOrigen = new boolean[] {false} ;
      H005Y2_A706Tpmo_SolicitaCentroDestino = new String[] {""} ;
      H005Y2_n706Tpmo_SolicitaCentroDestino = new boolean[] {false} ;
      H005Y2_A705Tpmo_SolicitaRegionDestino = new String[] {""} ;
      H005Y2_n705Tpmo_SolicitaRegionDestino = new boolean[] {false} ;
      H005Y2_A680Tpmo_CuentaResponsabilidad = new String[] {""} ;
      H005Y2_n680Tpmo_CuentaResponsabilidad = new boolean[] {false} ;
      H005Y2_A679Tpmo_Estado = new String[] {""} ;
      H005Y2_n679Tpmo_Estado = new boolean[] {false} ;
      H005Y2_A641Tpmo_VidaUtil = new String[] {""} ;
      H005Y2_n641Tpmo_VidaUtil = new boolean[] {false} ;
      H005Y2_A633Tpmo_Controlado = new String[] {""} ;
      H005Y2_n633Tpmo_Controlado = new boolean[] {false} ;
      H005Y2_A595Tpmo_ConsecutivoTrans = new long[1] ;
      H005Y2_n595Tpmo_ConsecutivoTrans = new boolean[] {false} ;
      H005Y2_A320Tpmo_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H005Y2_n320Tpmo_FechaModifica = new boolean[] {false} ;
      H005Y2_A319Tpmo_UsuarioModifica = new String[] {""} ;
      H005Y2_n319Tpmo_UsuarioModifica = new boolean[] {false} ;
      H005Y2_A318Tpmo_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      H005Y2_A317Tpmo_UsuarioCrea = new String[] {""} ;
      H005Y2_A441Tpmo_IngresaCurso = new String[] {""} ;
      H005Y2_A440Tpmo_IngresaAredante = new String[] {""} ;
      H005Y2_A316Tpmo_Modulo = new String[] {""} ;
      H005Y2_A315Tpmo_TipoE_S = new String[] {""} ;
      H005Y2_A314Tpmo_AlmacenDestinoDescrip = new String[] {""} ;
      H005Y2_n314Tpmo_AlmacenDestinoDescrip = new boolean[] {false} ;
      H005Y2_A40Tpmo_AlmacenDestinoId = new long[1] ;
      H005Y2_A312Tpmo_AlmacenOrigenDescrip = new String[] {""} ;
      H005Y2_n312Tpmo_AlmacenOrigenDescrip = new boolean[] {false} ;
      H005Y2_A39Tpmo_AlmacenOrigenId = new long[1] ;
      H005Y2_A480Tipo_Tipo = new String[] {""} ;
      H005Y2_A253Tipo_Descripcion = new String[] {""} ;
      H005Y2_A33Tipo_Codigo = new long[1] ;
      H005Y2_A313Tpmo_Descripcion = new String[] {""} ;
      H005Y2_A38Tpmo_Codigo = new String[] {""} ;
      H005Y3_AGRID_nRecordCount = new long[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV10TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV9HTTPRequest = httpContext.getHttpRequest();
      AV11TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV8Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV7Orig_Identificador = "" ;
      ROClassString = "" ;
      sImgUrl = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_origen_bienestipo_movimiento_origenwc__default(),
         new Object[] {
             new Object[] {
            H005Y2_A41Orig_Identificador, H005Y2_A718Tmpo_ImprimeResponsable, H005Y2_n718Tmpo_ImprimeResponsable, H005Y2_A717Tpmo_ImprimeDestino, H005Y2_n717Tpmo_ImprimeDestino, H005Y2_A716Tpmo_ImprimeOrigen, H005Y2_n716Tpmo_ImprimeOrigen, H005Y2_A706Tpmo_SolicitaCentroDestino, H005Y2_n706Tpmo_SolicitaCentroDestino, H005Y2_A705Tpmo_SolicitaRegionDestino,
            H005Y2_n705Tpmo_SolicitaRegionDestino, H005Y2_A680Tpmo_CuentaResponsabilidad, H005Y2_n680Tpmo_CuentaResponsabilidad, H005Y2_A679Tpmo_Estado, H005Y2_n679Tpmo_Estado, H005Y2_A641Tpmo_VidaUtil, H005Y2_n641Tpmo_VidaUtil, H005Y2_A633Tpmo_Controlado, H005Y2_n633Tpmo_Controlado, H005Y2_A595Tpmo_ConsecutivoTrans,
            H005Y2_n595Tpmo_ConsecutivoTrans, H005Y2_A320Tpmo_FechaModifica, H005Y2_n320Tpmo_FechaModifica, H005Y2_A319Tpmo_UsuarioModifica, H005Y2_n319Tpmo_UsuarioModifica, H005Y2_A318Tpmo_FechaCrea, H005Y2_A317Tpmo_UsuarioCrea, H005Y2_A441Tpmo_IngresaCurso, H005Y2_A440Tpmo_IngresaAredante, H005Y2_A316Tpmo_Modulo,
            H005Y2_A315Tpmo_TipoE_S, H005Y2_A314Tpmo_AlmacenDestinoDescrip, H005Y2_n314Tpmo_AlmacenDestinoDescrip, H005Y2_A40Tpmo_AlmacenDestinoId, H005Y2_A312Tpmo_AlmacenOrigenDescrip, H005Y2_n312Tpmo_AlmacenOrigenDescrip, H005Y2_A39Tpmo_AlmacenOrigenId, H005Y2_A480Tipo_Tipo, H005Y2_A253Tipo_Descripcion, H005Y2_A33Tipo_Codigo,
            H005Y2_A313Tpmo_Descripcion, H005Y2_A38Tpmo_Codigo
            }
            , new Object[] {
            H005Y3_AGRID_nRecordCount
            }
         }
      );
      AV17Pgmname = "ALM_ORIGEN_BIENESTIPO_MOVIMIENTO_ORIGENWC" ;
      /* GeneXus formulas. */
      AV17Pgmname = "ALM_ORIGEN_BIENESTIPO_MOVIMIENTO_ORIGENWC" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nGXWrapped ;
   private byte GRID_nEOF ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backstyle ;
   private short nRC_GXsfl_20 ;
   private short nGXsfl_20_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int edtOrig_Identificador_Enabled ;
   private int edtOrig_Identificador_Visible ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private long wcpOAV7Orig_Identificador ;
   private long AV7Orig_Identificador ;
   private long A33Tipo_Codigo ;
   private long GRID_nFirstRecordOnPage ;
   private long A39Tpmo_AlmacenOrigenId ;
   private long A40Tpmo_AlmacenDestinoId ;
   private long A595Tpmo_ConsecutivoTrans ;
   private long A41Orig_Identificador ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String edtavUpdate_Tooltiptext ;
   private String edtavDelete_Tooltiptext ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sGXsfl_20_idx="0001" ;
   private String edtavUpdate_Internalname ;
   private String edtavDelete_Internalname ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String divMaintable_Internalname ;
   private String divTabletop_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtninsert_Internalname ;
   private String bttBtninsert_Jsonclick ;
   private String divGridcell_Internalname ;
   private String divGridtable_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String edtTpmo_Descripcion_Link ;
   private String edtTipo_Descripcion_Link ;
   private String A480Tipo_Tipo ;
   private String A679Tpmo_Estado ;
   private String edtavUpdate_Link ;
   private String edtavDelete_Link ;
   private String edtOrig_Identificador_Internalname ;
   private String edtOrig_Identificador_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtTpmo_Codigo_Internalname ;
   private String edtTpmo_Descripcion_Internalname ;
   private String edtTipo_Codigo_Internalname ;
   private String edtTipo_Descripcion_Internalname ;
   private String edtTpmo_AlmacenOrigenId_Internalname ;
   private String edtTpmo_AlmacenOrigenDescrip_Internalname ;
   private String edtTpmo_AlmacenDestinoId_Internalname ;
   private String edtTpmo_AlmacenDestinoDescrip_Internalname ;
   private String edtTpmo_UsuarioCrea_Internalname ;
   private String edtTpmo_FechaCrea_Internalname ;
   private String edtTpmo_UsuarioModifica_Internalname ;
   private String edtTpmo_FechaModifica_Internalname ;
   private String edtTpmo_ConsecutivoTrans_Internalname ;
   private String GXCCtl ;
   private String AV17Pgmname ;
   private String scmdbuf ;
   private String sCtrlAV7Orig_Identificador ;
   private String sGXsfl_20_fel_idx="0001" ;
   private String ROClassString ;
   private String edtTpmo_Codigo_Jsonclick ;
   private String edtTpmo_Descripcion_Jsonclick ;
   private String edtTipo_Codigo_Jsonclick ;
   private String edtTipo_Descripcion_Jsonclick ;
   private String edtTpmo_AlmacenOrigenId_Jsonclick ;
   private String edtTpmo_AlmacenOrigenDescrip_Jsonclick ;
   private String edtTpmo_AlmacenDestinoId_Jsonclick ;
   private String edtTpmo_AlmacenDestinoDescrip_Jsonclick ;
   private String edtTpmo_UsuarioCrea_Jsonclick ;
   private String edtTpmo_FechaCrea_Jsonclick ;
   private String edtTpmo_UsuarioModifica_Jsonclick ;
   private String edtTpmo_FechaModifica_Jsonclick ;
   private String edtTpmo_ConsecutivoTrans_Jsonclick ;
   private String sImgUrl ;
   private java.util.Date A318Tpmo_FechaCrea ;
   private java.util.Date A320Tpmo_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean bGXsfl_20_Refreshing=false ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n312Tpmo_AlmacenOrigenDescrip ;
   private boolean n314Tpmo_AlmacenDestinoDescrip ;
   private boolean n319Tpmo_UsuarioModifica ;
   private boolean n320Tpmo_FechaModifica ;
   private boolean n595Tpmo_ConsecutivoTrans ;
   private boolean n633Tpmo_Controlado ;
   private boolean n641Tpmo_VidaUtil ;
   private boolean n679Tpmo_Estado ;
   private boolean n680Tpmo_CuentaResponsabilidad ;
   private boolean n705Tpmo_SolicitaRegionDestino ;
   private boolean n706Tpmo_SolicitaCentroDestino ;
   private boolean n716Tpmo_ImprimeOrigen ;
   private boolean n717Tpmo_ImprimeDestino ;
   private boolean n718Tmpo_ImprimeResponsable ;
   private boolean returnInSub ;
   private boolean AV12Update_IsBlob ;
   private boolean AV13Delete_IsBlob ;
   private String A38Tpmo_Codigo ;
   private String A313Tpmo_Descripcion ;
   private String A253Tipo_Descripcion ;
   private String A312Tpmo_AlmacenOrigenDescrip ;
   private String A314Tpmo_AlmacenDestinoDescrip ;
   private String A315Tpmo_TipoE_S ;
   private String A316Tpmo_Modulo ;
   private String A440Tpmo_IngresaAredante ;
   private String A441Tpmo_IngresaCurso ;
   private String A317Tpmo_UsuarioCrea ;
   private String A319Tpmo_UsuarioModifica ;
   private String A633Tpmo_Controlado ;
   private String A641Tpmo_VidaUtil ;
   private String A680Tpmo_CuentaResponsabilidad ;
   private String A705Tpmo_SolicitaRegionDestino ;
   private String A706Tpmo_SolicitaCentroDestino ;
   private String A716Tpmo_ImprimeOrigen ;
   private String A717Tpmo_ImprimeDestino ;
   private String A718Tmpo_ImprimeResponsable ;
   private String AV18Update_GXI ;
   private String AV19Delete_GXI ;
   private String AV12Update ;
   private String AV13Delete ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV9HTTPRequest ;
   private HTMLChoice cmbTipo_Tipo ;
   private HTMLChoice cmbTpmo_TipoE_S ;
   private HTMLChoice cmbTpmo_Modulo ;
   private HTMLChoice cmbTpmo_IngresaAredante ;
   private HTMLChoice cmbTpmo_IngresaCurso ;
   private HTMLChoice cmbTpmo_Controlado ;
   private HTMLChoice cmbTpmo_VidaUtil ;
   private HTMLChoice cmbTpmo_Estado ;
   private HTMLChoice cmbTpmo_CuentaResponsabilidad ;
   private HTMLChoice cmbTpmo_SolicitaRegionDestino ;
   private HTMLChoice cmbTpmo_SolicitaCentroDestino ;
   private HTMLChoice cmbTpmo_ImprimeOrigen ;
   private HTMLChoice cmbTpmo_ImprimeDestino ;
   private HTMLChoice cmbTmpo_ImprimeResponsable ;
   private IDataStoreProvider pr_default ;
   private long[] H005Y2_A41Orig_Identificador ;
   private String[] H005Y2_A718Tmpo_ImprimeResponsable ;
   private boolean[] H005Y2_n718Tmpo_ImprimeResponsable ;
   private String[] H005Y2_A717Tpmo_ImprimeDestino ;
   private boolean[] H005Y2_n717Tpmo_ImprimeDestino ;
   private String[] H005Y2_A716Tpmo_ImprimeOrigen ;
   private boolean[] H005Y2_n716Tpmo_ImprimeOrigen ;
   private String[] H005Y2_A706Tpmo_SolicitaCentroDestino ;
   private boolean[] H005Y2_n706Tpmo_SolicitaCentroDestino ;
   private String[] H005Y2_A705Tpmo_SolicitaRegionDestino ;
   private boolean[] H005Y2_n705Tpmo_SolicitaRegionDestino ;
   private String[] H005Y2_A680Tpmo_CuentaResponsabilidad ;
   private boolean[] H005Y2_n680Tpmo_CuentaResponsabilidad ;
   private String[] H005Y2_A679Tpmo_Estado ;
   private boolean[] H005Y2_n679Tpmo_Estado ;
   private String[] H005Y2_A641Tpmo_VidaUtil ;
   private boolean[] H005Y2_n641Tpmo_VidaUtil ;
   private String[] H005Y2_A633Tpmo_Controlado ;
   private boolean[] H005Y2_n633Tpmo_Controlado ;
   private long[] H005Y2_A595Tpmo_ConsecutivoTrans ;
   private boolean[] H005Y2_n595Tpmo_ConsecutivoTrans ;
   private java.util.Date[] H005Y2_A320Tpmo_FechaModifica ;
   private boolean[] H005Y2_n320Tpmo_FechaModifica ;
   private String[] H005Y2_A319Tpmo_UsuarioModifica ;
   private boolean[] H005Y2_n319Tpmo_UsuarioModifica ;
   private java.util.Date[] H005Y2_A318Tpmo_FechaCrea ;
   private String[] H005Y2_A317Tpmo_UsuarioCrea ;
   private String[] H005Y2_A441Tpmo_IngresaCurso ;
   private String[] H005Y2_A440Tpmo_IngresaAredante ;
   private String[] H005Y2_A316Tpmo_Modulo ;
   private String[] H005Y2_A315Tpmo_TipoE_S ;
   private String[] H005Y2_A314Tpmo_AlmacenDestinoDescrip ;
   private boolean[] H005Y2_n314Tpmo_AlmacenDestinoDescrip ;
   private long[] H005Y2_A40Tpmo_AlmacenDestinoId ;
   private String[] H005Y2_A312Tpmo_AlmacenOrigenDescrip ;
   private boolean[] H005Y2_n312Tpmo_AlmacenOrigenDescrip ;
   private long[] H005Y2_A39Tpmo_AlmacenOrigenId ;
   private String[] H005Y2_A480Tipo_Tipo ;
   private String[] H005Y2_A253Tipo_Descripcion ;
   private long[] H005Y2_A33Tipo_Codigo ;
   private String[] H005Y2_A313Tpmo_Descripcion ;
   private String[] H005Y2_A38Tpmo_Codigo ;
   private long[] H005Y3_AGRID_nRecordCount ;
   private com.genexus.webpanels.WebSession AV8Session ;
   private com.orions2.SdtTransactionContext AV10TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV11TrnContextAtt ;
}

final  class alm_origen_bienestipo_movimiento_origenwc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H005Y2", "SELECT T1.Orig_Identificador, T2.Tmpo_ImprimeResponsable, T2.Tpmo_ImprimeDestino, T2.Tpmo_ImprimeOrigen, T2.Tpmo_SolicitaCentroDestino, T2.Tpmo_SolicitaRegionDestino, T2.Tpmo_CuentaResponsabilidad, T2.Tpmo_Estado, T2.Tpmo_VidaUtil, T2.Tpmo_Controlado, T2.Tpmo_ConsecutivoTrans, T2.Tpmo_FechaModifica, T2.Tpmo_UsuarioModifica, T2.Tpmo_FechaCrea, T2.Tpmo_UsuarioCrea, T2.Tpmo_IngresaCurso, T2.Tpmo_IngresaAredante, T2.Tpmo_Modulo, T2.Tpmo_TipoE_S, T3.Tpal_Descripcion AS Tpmo_AlmacenDestinoDescrip, T2.Tpmo_AlmacenDestinoId AS Tpmo_AlmacenDestinoId, T4.Tpal_Descripcion AS Tpmo_AlmacenOrigenDescrip, T2.Tpmo_AlmacenOrigenId AS Tpmo_AlmacenOrigenId, T5.Tipo_Tipo, T5.Tipo_Descripcion, T2.Tipo_Codigo, T2.Tpmo_Descripcion, T1.Tpmo_Codigo FROM ((((ALM_TIPO_MOVIMIENTO_ORIGEN T1 INNER JOIN ALM_TIPO_MOVIMIENTO T2 ON T2.Tpmo_Codigo = T1.Tpmo_Codigo) INNER JOIN ALM_TIPO_ALMACEN T3 ON T3.Tpal_Id = T2.Tpmo_AlmacenDestinoId) INNER JOIN ALM_TIPO_ALMACEN T4 ON T4.Tpal_Id = T2.Tpmo_AlmacenOrigenId) INNER JOIN ALM_TIPO_ELEMENTO T5 ON T5.Tipo_Codigo = T2.Tipo_Codigo) WHERE T1.Orig_Identificador = ? ORDER BY T1.Orig_Identificador  OFFSET ? ROWS FETCH NEXT (CASE WHEN ? > 0 THEN ? ELSE 1e9 END) ROWS ONLY",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H005Y3", "SELECT COUNT(*) FROM ((((ALM_TIPO_MOVIMIENTO_ORIGEN T1 INNER JOIN ALM_TIPO_MOVIMIENTO T2 ON T2.Tpmo_Codigo = T1.Tpmo_Codigo) INNER JOIN ALM_TIPO_ALMACEN T5 ON T5.Tpal_Id = T2.Tpmo_AlmacenDestinoId) INNER JOIN ALM_TIPO_ALMACEN T4 ON T4.Tpal_Id = T2.Tpmo_AlmacenOrigenId) INNER JOIN ALM_TIPO_ELEMENTO T3 ON T3.Tipo_Codigo = T2.Tipo_Codigo) WHERE T1.Orig_Identificador = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((String[]) buf[13])[0] = rslt.getString(8, 1) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((long[]) buf[19])[0] = rslt.getLong(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(14) ;
               ((String[]) buf[26])[0] = rslt.getVarchar(15) ;
               ((String[]) buf[27])[0] = rslt.getVarchar(16) ;
               ((String[]) buf[28])[0] = rslt.getVarchar(17) ;
               ((String[]) buf[29])[0] = rslt.getVarchar(18) ;
               ((String[]) buf[30])[0] = rslt.getVarchar(19) ;
               ((String[]) buf[31])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((long[]) buf[33])[0] = rslt.getLong(21) ;
               ((String[]) buf[34])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((long[]) buf[36])[0] = rslt.getLong(23) ;
               ((String[]) buf[37])[0] = rslt.getString(24, 1) ;
               ((String[]) buf[38])[0] = rslt.getVarchar(25) ;
               ((long[]) buf[39])[0] = rslt.getLong(26) ;
               ((String[]) buf[40])[0] = rslt.getVarchar(27) ;
               ((String[]) buf[41])[0] = rslt.getVarchar(28) ;
               return;
            case 1 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

