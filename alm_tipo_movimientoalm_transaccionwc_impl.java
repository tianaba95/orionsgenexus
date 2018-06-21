/*
               File: alm_tipo_movimientoalm_transaccionwc_impl
        Description: ALM_TIPO_MOVIMIENTOALM_TRANSACCIONWC
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:12:4.36
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

public final  class alm_tipo_movimientoalm_transaccionwc_impl extends GXWebComponent
{
   public alm_tipo_movimientoalm_transaccionwc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_tipo_movimientoalm_transaccionwc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_tipo_movimientoalm_transaccionwc_impl.class ));
   }

   public alm_tipo_movimientoalm_transaccionwc_impl( int remoteHandle ,
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
      cmbTran_Estado = new HTMLChoice();
      cmbTran_TipoIngreso = new HTMLChoice();
      cmbTran_TipoEntra = new HTMLChoice();
      cmbTran_EntidadGobierno = new HTMLChoice();
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
               AV7Tran_CodigoMovimiento = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Tran_CodigoMovimiento", AV7Tran_CodigoMovimiento);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV7Tran_CodigoMovimiento});
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
               AV7Tran_CodigoMovimiento = httpContext.GetNextPar( ) ;
               AV12Update = httpContext.GetNextPar( ) ;
               edtavUpdate_Tooltiptext = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_20_Refreshing);
               AV13Delete = httpContext.GetNextPar( ) ;
               edtavDelete_Tooltiptext = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "Tooltiptext", edtavDelete_Tooltiptext, !bGXsfl_20_Refreshing);
               A46Tran_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               sPrefix = httpContext.GetNextPar( ) ;
               init_default_properties( ) ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxgrgrid_refresh( subGrid_Rows, AV7Tran_CodigoMovimiento, AV12Update, AV13Delete, A46Tran_Id, sPrefix) ;
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
         pa492( ) ;
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
         httpContext.writeValue( "ALM_TIPO_MOVIMIENTOALM_TRANSACCIONWC") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20186141412451");
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_tipo_movimientoalm_transaccionwc") + "?" + GXutil.URLEncode(GXutil.rtrim(AV7Tran_CodigoMovimiento))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7Tran_CodigoMovimiento", wcpOAV7Tran_CodigoMovimiento);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTRAN_CODIGOMOVIMIENTO", AV7Tran_CodigoMovimiento);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUPDATE_Tooltiptext", GXutil.rtrim( edtavUpdate_Tooltiptext));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDELETE_Tooltiptext", GXutil.rtrim( edtavDelete_Tooltiptext));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm492( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("alm_tipo_movimientoalm_transaccionwc.js", "?20186141412454");
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
      return "ALM_TIPO_MOVIMIENTOALM_TRANSACCIONWC" ;
   }

   public String getPgmdesc( )
   {
      return "ALM_TIPO_MOVIMIENTOALM_TRANSACCIONWC" ;
   }

   public void wb490( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.alm_tipo_movimientoalm_transaccionwc");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 20, 2, 0)+","+"null"+");", "Agregar", bttBtninsert_Jsonclick, 5, "Agregar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_MOVIMIENTOALM_TRANSACCIONWC.htm");
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
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Identificador") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha de Registro") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Id Usuario") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cod Usuario") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Nombre Usuario") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Id C.C") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Código C.C") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripcion C.C") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Id Región") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Código Región") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción Regional") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Modulo Origen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Almacén Origen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Bodega Origen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cuentadante Origen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Modulo Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Almacén Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Bodega Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cuentadante Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Observaciones") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Areadante") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Curso") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Estado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Ratificacion") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Ratifica") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Transaccion") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "de Lineas") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "por Movimiento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "de Ingreso") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "de Ingreso") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "de Ingreso") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Costo Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Costo Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Costo Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Región Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Región Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Región Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "entrada devolutivo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "de Padres") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Proveedor") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Abreviatura Región") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Abrev Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Detalle") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "del Grupo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "o Anula") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "o Anula") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "la Anulación") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cuentadante Origen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Proveedor") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cuentadante Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Ingreso") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cuentadante Origen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Proveedor") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cuentadante Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cuentadante Origen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cuentadante Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cuenta Responsabilidad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cuenta Responsabilidad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cuenta Responsabilidad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cuentadante Responsabilidad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tran_Abreviado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Responsabilidad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Responsabilidad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Gobierno") ;
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
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A55Tran_FechaRegistro, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A47Tran_UsuarioId, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A417Tran_UsuarioCodigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A418Tran_UsuarioNombre);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A48Tran_CentroCostoId, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A419Tran_CentroCostoCodigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A420Tran_CentroCostoDescripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A57Tran_RegionId, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A421Tran_RegionCodigo, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A422Tran_RegionDescripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A110Tran_ModuloOrigen);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A109Tran_CodAlmaOrigen);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A112Tran_CodBodeOrigen);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A51Tran_IdCuentadanteOrigen, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A385Tran_ModuloDestino);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A111Tran_CodAlmaDestino);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A387Tran_CodBodeDestino);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A52Tran_IdCuentadanteDestino, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A416Tran_Observaciones);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A407Tran_AreadanteCodigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A408Tran_CursoCodigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A58Tran_Estado));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A390Tran_FechaRatificacion, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A391Tran_UsuarioRatifica);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A483Tran_ValorTransaccion, (byte)(24), (byte)(2), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A498Tran_NumeroLineas, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A513Tran_ConsecutivoCC, (byte)(18), (byte)(0), ".", "")));
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtTran_ConsecutivoCC_Link));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A54Tran_TipoIngreso, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A514Tran_NumeroIngreso));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.format(A515Tran_FechaIngreso, "99/99/99"));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A50Tran_CentroCostoIdDestino, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A516Tran_CentroCostoCodigoDestino);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A517Tran_CentroCostoDescripcionDes);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A518Tran_RegionIdDestino, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A519Tran_RegionCodigoDestino, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A520Tran_RegionDescripcionDestino);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A527Tran_TipoEntra));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A568Tran_CantidadPadres, (byte)(8), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A53Tran_IdProveedor, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A594Tran_RegionAbrev);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A608Tran_RegionAbrevDestino);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A524Tran_Detalle));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A667Tran_NumeroGrupo, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A668Tran_UsuarioEliminaoAnula);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A669Tran_FechaEliminaoAnula, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A670Tran_ObservacionesAnula);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A384Tran_NombCuentadanteOrigen);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A575Tran_NombreProveedor);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A389Tran_NombCuentadanteDestino);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A672Tran_NombreIngreso);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A702Tran_CedulaCuentadanteOrigen, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A703Tran_CedulaProveedor, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A704Tran_CedulaCuentadanteDestino, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A714Tran_EmailCuentadanteOrigen);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A715Tran_EmailCuentadanteDestino);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A56Tran_IdCuentadanteResponsabili, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A719Tran_TransaccResponsabilidad, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.format(A720Tran_FechaResponsabilidad, "99/99/99"));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A721Tran_NombreCuentadanteResponsa);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A756Tran_Abreviado);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A758Tran_TablaResponsabilidad, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A759Tran_CedulaResponsabilidad, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A859Tran_EntidadGobierno);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CodigoMovimiento_Internalname, "Código Movimiento", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CodigoMovimiento_Internalname, A49Tran_CodigoMovimiento, GXutil.rtrim( localUtil.format( A49Tran_CodigoMovimiento, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CodigoMovimiento_Jsonclick, 0, "Attribute", "", "", "", edtTran_CodigoMovimiento_Visible, edtTran_CodigoMovimiento_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TIPO_MOVIMIENTOALM_TRANSACCIONWC.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start492( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "ALM_TIPO_MOVIMIENTOALM_TRANSACCIONWC", (short)(0)) ;
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
            strup490( ) ;
         }
      }
   }

   public void ws492( )
   {
      start492( ) ;
      evt492( ) ;
   }

   public void evt492( )
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
                              strup490( ) ;
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
                              strup490( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoInsert' */
                                 e11492 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup490( ) ;
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
                              strup490( ) ;
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
                              strup490( ) ;
                           }
                           nGXsfl_20_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_20_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_20_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_202( ) ;
                           A46Tran_Id = localUtil.ctol( httpContext.cgiGet( edtTran_Id_Internalname), ",", ".") ;
                           A55Tran_FechaRegistro = localUtil.ctot( httpContext.cgiGet( edtTran_FechaRegistro_Internalname), 0) ;
                           A47Tran_UsuarioId = localUtil.ctol( httpContext.cgiGet( edtTran_UsuarioId_Internalname), ",", ".") ;
                           n47Tran_UsuarioId = false ;
                           A417Tran_UsuarioCodigo = GXutil.upper( httpContext.cgiGet( edtTran_UsuarioCodigo_Internalname)) ;
                           n417Tran_UsuarioCodigo = false ;
                           A418Tran_UsuarioNombre = httpContext.cgiGet( edtTran_UsuarioNombre_Internalname) ;
                           n418Tran_UsuarioNombre = false ;
                           A48Tran_CentroCostoId = localUtil.ctol( httpContext.cgiGet( edtTran_CentroCostoId_Internalname), ",", ".") ;
                           A419Tran_CentroCostoCodigo = httpContext.cgiGet( edtTran_CentroCostoCodigo_Internalname) ;
                           n419Tran_CentroCostoCodigo = false ;
                           A420Tran_CentroCostoDescripcion = httpContext.cgiGet( edtTran_CentroCostoDescripcion_Internalname) ;
                           n420Tran_CentroCostoDescripcion = false ;
                           A57Tran_RegionId = localUtil.ctol( httpContext.cgiGet( edtTran_RegionId_Internalname), ",", ".") ;
                           n57Tran_RegionId = false ;
                           A421Tran_RegionCodigo = (short)(localUtil.ctol( httpContext.cgiGet( edtTran_RegionCodigo_Internalname), ",", ".")) ;
                           n421Tran_RegionCodigo = false ;
                           A422Tran_RegionDescripcion = httpContext.cgiGet( edtTran_RegionDescripcion_Internalname) ;
                           n422Tran_RegionDescripcion = false ;
                           A110Tran_ModuloOrigen = httpContext.cgiGet( edtTran_ModuloOrigen_Internalname) ;
                           A109Tran_CodAlmaOrigen = httpContext.cgiGet( edtTran_CodAlmaOrigen_Internalname) ;
                           A112Tran_CodBodeOrigen = httpContext.cgiGet( edtTran_CodBodeOrigen_Internalname) ;
                           A51Tran_IdCuentadanteOrigen = localUtil.ctol( httpContext.cgiGet( edtTran_IdCuentadanteOrigen_Internalname), ",", ".") ;
                           n51Tran_IdCuentadanteOrigen = false ;
                           A385Tran_ModuloDestino = httpContext.cgiGet( edtTran_ModuloDestino_Internalname) ;
                           A111Tran_CodAlmaDestino = httpContext.cgiGet( edtTran_CodAlmaDestino_Internalname) ;
                           A387Tran_CodBodeDestino = httpContext.cgiGet( edtTran_CodBodeDestino_Internalname) ;
                           A52Tran_IdCuentadanteDestino = localUtil.ctol( httpContext.cgiGet( edtTran_IdCuentadanteDestino_Internalname), ",", ".") ;
                           n52Tran_IdCuentadanteDestino = false ;
                           A416Tran_Observaciones = httpContext.cgiGet( edtTran_Observaciones_Internalname) ;
                           n416Tran_Observaciones = false ;
                           A407Tran_AreadanteCodigo = httpContext.cgiGet( edtTran_AreadanteCodigo_Internalname) ;
                           n407Tran_AreadanteCodigo = false ;
                           A408Tran_CursoCodigo = httpContext.cgiGet( edtTran_CursoCodigo_Internalname) ;
                           n408Tran_CursoCodigo = false ;
                           cmbTran_Estado.setName( cmbTran_Estado.getInternalname() );
                           cmbTran_Estado.setValue( httpContext.cgiGet( cmbTran_Estado.getInternalname()) );
                           A58Tran_Estado = httpContext.cgiGet( cmbTran_Estado.getInternalname()) ;
                           n58Tran_Estado = false ;
                           A390Tran_FechaRatificacion = localUtil.ctot( httpContext.cgiGet( edtTran_FechaRatificacion_Internalname), 0) ;
                           n390Tran_FechaRatificacion = false ;
                           A391Tran_UsuarioRatifica = GXutil.upper( httpContext.cgiGet( edtTran_UsuarioRatifica_Internalname)) ;
                           n391Tran_UsuarioRatifica = false ;
                           A483Tran_ValorTransaccion = localUtil.ctond( httpContext.cgiGet( edtTran_ValorTransaccion_Internalname)) ;
                           n483Tran_ValorTransaccion = false ;
                           A498Tran_NumeroLineas = localUtil.ctol( httpContext.cgiGet( edtTran_NumeroLineas_Internalname), ",", ".") ;
                           n498Tran_NumeroLineas = false ;
                           A513Tran_ConsecutivoCC = localUtil.ctol( httpContext.cgiGet( edtTran_ConsecutivoCC_Internalname), ",", ".") ;
                           n513Tran_ConsecutivoCC = false ;
                           cmbTran_TipoIngreso.setName( cmbTran_TipoIngreso.getInternalname() );
                           cmbTran_TipoIngreso.setValue( httpContext.cgiGet( cmbTran_TipoIngreso.getInternalname()) );
                           A54Tran_TipoIngreso = GXutil.lval( httpContext.cgiGet( cmbTran_TipoIngreso.getInternalname())) ;
                           n54Tran_TipoIngreso = false ;
                           A514Tran_NumeroIngreso = httpContext.cgiGet( edtTran_NumeroIngreso_Internalname) ;
                           n514Tran_NumeroIngreso = false ;
                           A515Tran_FechaIngreso = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtTran_FechaIngreso_Internalname), 0)) ;
                           n515Tran_FechaIngreso = false ;
                           A50Tran_CentroCostoIdDestino = localUtil.ctol( httpContext.cgiGet( edtTran_CentroCostoIdDestino_Internalname), ",", ".") ;
                           n50Tran_CentroCostoIdDestino = false ;
                           A516Tran_CentroCostoCodigoDestino = httpContext.cgiGet( edtTran_CentroCostoCodigoDestino_Internalname) ;
                           n516Tran_CentroCostoCodigoDestino = false ;
                           A517Tran_CentroCostoDescripcionDes = httpContext.cgiGet( edtTran_CentroCostoDescripcionDes_Internalname) ;
                           n517Tran_CentroCostoDescripcionDes = false ;
                           A518Tran_RegionIdDestino = localUtil.ctol( httpContext.cgiGet( edtTran_RegionIdDestino_Internalname), ",", ".") ;
                           n518Tran_RegionIdDestino = false ;
                           A519Tran_RegionCodigoDestino = (short)(localUtil.ctol( httpContext.cgiGet( edtTran_RegionCodigoDestino_Internalname), ",", ".")) ;
                           n519Tran_RegionCodigoDestino = false ;
                           A520Tran_RegionDescripcionDestino = httpContext.cgiGet( edtTran_RegionDescripcionDestino_Internalname) ;
                           n520Tran_RegionDescripcionDestino = false ;
                           cmbTran_TipoEntra.setName( cmbTran_TipoEntra.getInternalname() );
                           cmbTran_TipoEntra.setValue( httpContext.cgiGet( cmbTran_TipoEntra.getInternalname()) );
                           A527Tran_TipoEntra = httpContext.cgiGet( cmbTran_TipoEntra.getInternalname()) ;
                           n527Tran_TipoEntra = false ;
                           A568Tran_CantidadPadres = (int)(localUtil.ctol( httpContext.cgiGet( edtTran_CantidadPadres_Internalname), ",", ".")) ;
                           n568Tran_CantidadPadres = false ;
                           A53Tran_IdProveedor = localUtil.ctol( httpContext.cgiGet( edtTran_IdProveedor_Internalname), ",", ".") ;
                           n53Tran_IdProveedor = false ;
                           A594Tran_RegionAbrev = httpContext.cgiGet( edtTran_RegionAbrev_Internalname) ;
                           n594Tran_RegionAbrev = false ;
                           A608Tran_RegionAbrevDestino = httpContext.cgiGet( edtTran_RegionAbrevDestino_Internalname) ;
                           n608Tran_RegionAbrevDestino = false ;
                           A524Tran_Detalle = httpContext.cgiGet( edtTran_Detalle_Internalname) ;
                           n524Tran_Detalle = false ;
                           A667Tran_NumeroGrupo = (short)(localUtil.ctol( httpContext.cgiGet( edtTran_NumeroGrupo_Internalname), ",", ".")) ;
                           n667Tran_NumeroGrupo = false ;
                           A668Tran_UsuarioEliminaoAnula = GXutil.upper( httpContext.cgiGet( edtTran_UsuarioEliminaoAnula_Internalname)) ;
                           n668Tran_UsuarioEliminaoAnula = false ;
                           A669Tran_FechaEliminaoAnula = localUtil.ctot( httpContext.cgiGet( edtTran_FechaEliminaoAnula_Internalname), 0) ;
                           n669Tran_FechaEliminaoAnula = false ;
                           A670Tran_ObservacionesAnula = httpContext.cgiGet( edtTran_ObservacionesAnula_Internalname) ;
                           n670Tran_ObservacionesAnula = false ;
                           A384Tran_NombCuentadanteOrigen = GXutil.upper( httpContext.cgiGet( edtTran_NombCuentadanteOrigen_Internalname)) ;
                           n384Tran_NombCuentadanteOrigen = false ;
                           A575Tran_NombreProveedor = GXutil.upper( httpContext.cgiGet( edtTran_NombreProveedor_Internalname)) ;
                           n575Tran_NombreProveedor = false ;
                           A389Tran_NombCuentadanteDestino = GXutil.upper( httpContext.cgiGet( edtTran_NombCuentadanteDestino_Internalname)) ;
                           n389Tran_NombCuentadanteDestino = false ;
                           A672Tran_NombreIngreso = GXutil.upper( httpContext.cgiGet( edtTran_NombreIngreso_Internalname)) ;
                           n672Tran_NombreIngreso = false ;
                           A702Tran_CedulaCuentadanteOrigen = localUtil.ctol( httpContext.cgiGet( edtTran_CedulaCuentadanteOrigen_Internalname), ",", ".") ;
                           n702Tran_CedulaCuentadanteOrigen = false ;
                           A703Tran_CedulaProveedor = localUtil.ctol( httpContext.cgiGet( edtTran_CedulaProveedor_Internalname), ",", ".") ;
                           n703Tran_CedulaProveedor = false ;
                           A704Tran_CedulaCuentadanteDestino = localUtil.ctol( httpContext.cgiGet( edtTran_CedulaCuentadanteDestino_Internalname), ",", ".") ;
                           n704Tran_CedulaCuentadanteDestino = false ;
                           A714Tran_EmailCuentadanteOrigen = httpContext.cgiGet( edtTran_EmailCuentadanteOrigen_Internalname) ;
                           n714Tran_EmailCuentadanteOrigen = false ;
                           A715Tran_EmailCuentadanteDestino = httpContext.cgiGet( edtTran_EmailCuentadanteDestino_Internalname) ;
                           n715Tran_EmailCuentadanteDestino = false ;
                           A56Tran_IdCuentadanteResponsabili = localUtil.ctol( httpContext.cgiGet( edtTran_IdCuentadanteResponsabili_Internalname), ",", ".") ;
                           n56Tran_IdCuentadanteResponsabili = false ;
                           A719Tran_TransaccResponsabilidad = localUtil.ctol( httpContext.cgiGet( edtTran_TransaccResponsabilidad_Internalname), ",", ".") ;
                           n719Tran_TransaccResponsabilidad = false ;
                           A720Tran_FechaResponsabilidad = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtTran_FechaResponsabilidad_Internalname), 0)) ;
                           n720Tran_FechaResponsabilidad = false ;
                           A721Tran_NombreCuentadanteResponsa = GXutil.upper( httpContext.cgiGet( edtTran_NombreCuentadanteResponsa_Internalname)) ;
                           n721Tran_NombreCuentadanteResponsa = false ;
                           A756Tran_Abreviado = httpContext.cgiGet( edtTran_Abreviado_Internalname) ;
                           n756Tran_Abreviado = false ;
                           A758Tran_TablaResponsabilidad = (short)(localUtil.ctol( httpContext.cgiGet( edtTran_TablaResponsabilidad_Internalname), ",", ".")) ;
                           n758Tran_TablaResponsabilidad = false ;
                           A759Tran_CedulaResponsabilidad = localUtil.ctol( httpContext.cgiGet( edtTran_CedulaResponsabilidad_Internalname), ",", ".") ;
                           n759Tran_CedulaResponsabilidad = false ;
                           cmbTran_EntidadGobierno.setName( cmbTran_EntidadGobierno.getInternalname() );
                           cmbTran_EntidadGobierno.setValue( httpContext.cgiGet( cmbTran_EntidadGobierno.getInternalname()) );
                           A859Tran_EntidadGobierno = httpContext.cgiGet( cmbTran_EntidadGobierno.getInternalname()) ;
                           n859Tran_EntidadGobierno = false ;
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
                                       e12492 ();
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
                                       e13492 ();
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
                                    strup490( ) ;
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

   public void we492( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm492( ) ;
         }
      }
   }

   public void pa492( )
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
         GXCCtl = "TRAN_ESTADO_" + sGXsfl_20_idx ;
         cmbTran_Estado.setName( GXCCtl );
         cmbTran_Estado.setWebtags( "" );
         cmbTran_Estado.addItem("A", "Anulado", (short)(0));
         cmbTran_Estado.addItem("R", "Ratificado", (short)(0));
         cmbTran_Estado.addItem("P", "Pendiente", (short)(0));
         cmbTran_Estado.addItem("I", "Incompleto", (short)(0));
         if ( cmbTran_Estado.getItemCount() > 0 )
         {
            A58Tran_Estado = cmbTran_Estado.getValidValue(A58Tran_Estado) ;
            n58Tran_Estado = false ;
         }
         GXCCtl = "TRAN_TIPOINGRESO_" + sGXsfl_20_idx ;
         cmbTran_TipoIngreso.setName( GXCCtl );
         cmbTran_TipoIngreso.setWebtags( "" );
         if ( cmbTran_TipoIngreso.getItemCount() > 0 )
         {
            A54Tran_TipoIngreso = GXutil.lval( cmbTran_TipoIngreso.getValidValue(GXutil.trim( GXutil.str( A54Tran_TipoIngreso, 11, 0)))) ;
            n54Tran_TipoIngreso = false ;
         }
         GXCCtl = "TRAN_TIPOENTRA_" + sGXsfl_20_idx ;
         cmbTran_TipoEntra.setName( GXCCtl );
         cmbTran_TipoEntra.setWebtags( "" );
         if ( cmbTran_TipoEntra.getItemCount() > 0 )
         {
            A527Tran_TipoEntra = cmbTran_TipoEntra.getValidValue(A527Tran_TipoEntra) ;
            n527Tran_TipoEntra = false ;
         }
         GXCCtl = "TRAN_ENTIDADGOBIERNO_" + sGXsfl_20_idx ;
         cmbTran_EntidadGobierno.setName( GXCCtl );
         cmbTran_EntidadGobierno.setWebtags( "" );
         cmbTran_EntidadGobierno.addItem("", "", (short)(0));
         cmbTran_EntidadGobierno.addItem("SI", "SI", (short)(0));
         cmbTran_EntidadGobierno.addItem("NO", "NO", (short)(0));
         if ( cmbTran_EntidadGobierno.getItemCount() > 0 )
         {
            A859Tran_EntidadGobierno = cmbTran_EntidadGobierno.getValidValue(A859Tran_EntidadGobierno) ;
            n859Tran_EntidadGobierno = false ;
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
                                 String AV7Tran_CodigoMovimiento ,
                                 String AV12Update ,
                                 String AV13Delete ,
                                 long A46Tran_Id ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid_Rows = subGrid_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID_nCurrentRecord = 0 ;
      rf492( ) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_ID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A46Tran_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_ID", GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_FECHAREGISTRO", getSecureSignedToken( sPrefix, localUtil.format( A55Tran_FechaRegistro, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_FECHAREGISTRO", localUtil.ttoc( A55Tran_FechaRegistro, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_USUARIOID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A47Tran_UsuarioId), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_USUARIOID", GXutil.ltrim( localUtil.ntoc( A47Tran_UsuarioId, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_CENTROCOSTOID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A48Tran_CentroCostoId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_CENTROCOSTOID", GXutil.ltrim( localUtil.ntoc( A48Tran_CentroCostoId, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_REGIONID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A57Tran_RegionId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_REGIONID", GXutil.ltrim( localUtil.ntoc( A57Tran_RegionId, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_MODULOORIGEN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A110Tran_ModuloOrigen, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_MODULOORIGEN", A110Tran_ModuloOrigen);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_CODALMAORIGEN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A109Tran_CodAlmaOrigen, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_CODALMAORIGEN", A109Tran_CodAlmaOrigen);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_CODBODEORIGEN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A112Tran_CodBodeOrigen, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_CODBODEORIGEN", A112Tran_CodBodeOrigen);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_IDCUENTADANTEORIGEN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A51Tran_IdCuentadanteOrigen), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_IDCUENTADANTEORIGEN", GXutil.ltrim( localUtil.ntoc( A51Tran_IdCuentadanteOrigen, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_MODULODESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A385Tran_ModuloDestino, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_MODULODESTINO", A385Tran_ModuloDestino);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_CODALMADESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A111Tran_CodAlmaDestino, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_CODALMADESTINO", A111Tran_CodAlmaDestino);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_CODBODEDESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A387Tran_CodBodeDestino, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_CODBODEDESTINO", A387Tran_CodBodeDestino);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_IDCUENTADANTEDESTINO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A52Tran_IdCuentadanteDestino), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_IDCUENTADANTEDESTINO", GXutil.ltrim( localUtil.ntoc( A52Tran_IdCuentadanteDestino, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_OBSERVACIONES", getSecureSignedToken( sPrefix, A416Tran_Observaciones));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_OBSERVACIONES", A416Tran_Observaciones);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_AREADANTECODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A407Tran_AreadanteCodigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_AREADANTECODIGO", A407Tran_AreadanteCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_CURSOCODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A408Tran_CursoCodigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_CURSOCODIGO", A408Tran_CursoCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A58Tran_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_ESTADO", GXutil.rtrim( A58Tran_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_FECHARATIFICACION", getSecureSignedToken( sPrefix, localUtil.format( A390Tran_FechaRatificacion, "99/99/9999 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_FECHARATIFICACION", localUtil.ttoc( A390Tran_FechaRatificacion, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_USUARIORATIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A391Tran_UsuarioRatifica, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_USUARIORATIFICA", A391Tran_UsuarioRatifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_VALORTRANSACCION", getSecureSignedToken( sPrefix, localUtil.format( A483Tran_ValorTransaccion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_VALORTRANSACCION", GXutil.ltrim( localUtil.ntoc( A483Tran_ValorTransaccion, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_NUMEROLINEAS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A498Tran_NumeroLineas), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_NUMEROLINEAS", GXutil.ltrim( localUtil.ntoc( A498Tran_NumeroLineas, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_TIPOINGRESO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A54Tran_TipoIngreso), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_TIPOINGRESO", GXutil.ltrim( localUtil.ntoc( A54Tran_TipoIngreso, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_NUMEROINGRESO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A514Tran_NumeroIngreso, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_NUMEROINGRESO", GXutil.rtrim( A514Tran_NumeroIngreso));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_FECHAINGRESO", getSecureSignedToken( sPrefix, A515Tran_FechaIngreso));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_FECHAINGRESO", localUtil.format(A515Tran_FechaIngreso, "99/99/99"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_CENTROCOSTOIDDESTINO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A50Tran_CentroCostoIdDestino), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_CENTROCOSTOIDDESTINO", GXutil.ltrim( localUtil.ntoc( A50Tran_CentroCostoIdDestino, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_REGIONIDDESTINO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A518Tran_RegionIdDestino), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_REGIONIDDESTINO", GXutil.ltrim( localUtil.ntoc( A518Tran_RegionIdDestino, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_TIPOENTRA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A527Tran_TipoEntra, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_TIPOENTRA", GXutil.rtrim( A527Tran_TipoEntra));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_CANTIDADPADRES", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A568Tran_CantidadPadres), "ZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_CANTIDADPADRES", GXutil.ltrim( localUtil.ntoc( A568Tran_CantidadPadres, (byte)(8), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_IDPROVEEDOR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A53Tran_IdProveedor), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_IDPROVEEDOR", GXutil.ltrim( localUtil.ntoc( A53Tran_IdProveedor, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_DETALLE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A524Tran_Detalle, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_DETALLE", GXutil.rtrim( A524Tran_Detalle));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_NUMEROGRUPO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A667Tran_NumeroGrupo), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_NUMEROGRUPO", GXutil.ltrim( localUtil.ntoc( A667Tran_NumeroGrupo, (byte)(4), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_USUARIOELIMINAOANULA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A668Tran_UsuarioEliminaoAnula, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_USUARIOELIMINAOANULA", A668Tran_UsuarioEliminaoAnula);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_FECHAELIMINAOANULA", getSecureSignedToken( sPrefix, localUtil.format( A669Tran_FechaEliminaoAnula, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_FECHAELIMINAOANULA", localUtil.ttoc( A669Tran_FechaEliminaoAnula, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_OBSERVACIONESANULA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A670Tran_ObservacionesAnula, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_OBSERVACIONESANULA", A670Tran_ObservacionesAnula);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_IDCUENTADANTERESPONSABILI", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A56Tran_IdCuentadanteResponsabili), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_IDCUENTADANTERESPONSABILI", GXutil.ltrim( localUtil.ntoc( A56Tran_IdCuentadanteResponsabili, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_TRANSACCRESPONSABILIDAD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A719Tran_TransaccResponsabilidad), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_TRANSACCRESPONSABILIDAD", GXutil.ltrim( localUtil.ntoc( A719Tran_TransaccResponsabilidad, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_FECHARESPONSABILIDAD", getSecureSignedToken( sPrefix, A720Tran_FechaResponsabilidad));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_FECHARESPONSABILIDAD", localUtil.format(A720Tran_FechaResponsabilidad, "99/99/99"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_TABLARESPONSABILIDAD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A758Tran_TablaResponsabilidad), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_TABLARESPONSABILIDAD", GXutil.ltrim( localUtil.ntoc( A758Tran_TablaResponsabilidad, (byte)(4), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_ENTIDADGOBIERNO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A859Tran_EntidadGobierno, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_ENTIDADGOBIERNO", A859Tran_EntidadGobierno);
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf492( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV17Pgmname = "ALM_TIPO_MOVIMIENTOALM_TRANSACCIONWC" ;
      Gx_err = (short)(0) ;
   }

   public void rf492( )
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
         /* Using cursor H00492 */
         pr_default.execute(0, new Object[] {AV7Tran_CodigoMovimiento, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_20_idx = (short)(1) ;
         sGXsfl_20_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_20_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_202( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_recordsperpage( ) ) ) ) )
         {
            A416Tran_Observaciones = H00492_A416Tran_Observaciones[0] ;
            n416Tran_Observaciones = H00492_n416Tran_Observaciones[0] ;
            A49Tran_CodigoMovimiento = H00492_A49Tran_CodigoMovimiento[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A49Tran_CodigoMovimiento", A49Tran_CodigoMovimiento);
            A859Tran_EntidadGobierno = H00492_A859Tran_EntidadGobierno[0] ;
            n859Tran_EntidadGobierno = H00492_n859Tran_EntidadGobierno[0] ;
            A759Tran_CedulaResponsabilidad = H00492_A759Tran_CedulaResponsabilidad[0] ;
            n759Tran_CedulaResponsabilidad = H00492_n759Tran_CedulaResponsabilidad[0] ;
            A758Tran_TablaResponsabilidad = H00492_A758Tran_TablaResponsabilidad[0] ;
            n758Tran_TablaResponsabilidad = H00492_n758Tran_TablaResponsabilidad[0] ;
            A756Tran_Abreviado = H00492_A756Tran_Abreviado[0] ;
            n756Tran_Abreviado = H00492_n756Tran_Abreviado[0] ;
            A721Tran_NombreCuentadanteResponsa = H00492_A721Tran_NombreCuentadanteResponsa[0] ;
            n721Tran_NombreCuentadanteResponsa = H00492_n721Tran_NombreCuentadanteResponsa[0] ;
            A720Tran_FechaResponsabilidad = H00492_A720Tran_FechaResponsabilidad[0] ;
            n720Tran_FechaResponsabilidad = H00492_n720Tran_FechaResponsabilidad[0] ;
            A719Tran_TransaccResponsabilidad = H00492_A719Tran_TransaccResponsabilidad[0] ;
            n719Tran_TransaccResponsabilidad = H00492_n719Tran_TransaccResponsabilidad[0] ;
            A56Tran_IdCuentadanteResponsabili = H00492_A56Tran_IdCuentadanteResponsabili[0] ;
            n56Tran_IdCuentadanteResponsabili = H00492_n56Tran_IdCuentadanteResponsabili[0] ;
            A715Tran_EmailCuentadanteDestino = H00492_A715Tran_EmailCuentadanteDestino[0] ;
            n715Tran_EmailCuentadanteDestino = H00492_n715Tran_EmailCuentadanteDestino[0] ;
            A714Tran_EmailCuentadanteOrigen = H00492_A714Tran_EmailCuentadanteOrigen[0] ;
            n714Tran_EmailCuentadanteOrigen = H00492_n714Tran_EmailCuentadanteOrigen[0] ;
            A704Tran_CedulaCuentadanteDestino = H00492_A704Tran_CedulaCuentadanteDestino[0] ;
            n704Tran_CedulaCuentadanteDestino = H00492_n704Tran_CedulaCuentadanteDestino[0] ;
            A703Tran_CedulaProveedor = H00492_A703Tran_CedulaProveedor[0] ;
            n703Tran_CedulaProveedor = H00492_n703Tran_CedulaProveedor[0] ;
            A702Tran_CedulaCuentadanteOrigen = H00492_A702Tran_CedulaCuentadanteOrigen[0] ;
            n702Tran_CedulaCuentadanteOrigen = H00492_n702Tran_CedulaCuentadanteOrigen[0] ;
            A672Tran_NombreIngreso = H00492_A672Tran_NombreIngreso[0] ;
            n672Tran_NombreIngreso = H00492_n672Tran_NombreIngreso[0] ;
            A389Tran_NombCuentadanteDestino = H00492_A389Tran_NombCuentadanteDestino[0] ;
            n389Tran_NombCuentadanteDestino = H00492_n389Tran_NombCuentadanteDestino[0] ;
            A575Tran_NombreProveedor = H00492_A575Tran_NombreProveedor[0] ;
            n575Tran_NombreProveedor = H00492_n575Tran_NombreProveedor[0] ;
            A384Tran_NombCuentadanteOrigen = H00492_A384Tran_NombCuentadanteOrigen[0] ;
            n384Tran_NombCuentadanteOrigen = H00492_n384Tran_NombCuentadanteOrigen[0] ;
            A670Tran_ObservacionesAnula = H00492_A670Tran_ObservacionesAnula[0] ;
            n670Tran_ObservacionesAnula = H00492_n670Tran_ObservacionesAnula[0] ;
            A669Tran_FechaEliminaoAnula = H00492_A669Tran_FechaEliminaoAnula[0] ;
            n669Tran_FechaEliminaoAnula = H00492_n669Tran_FechaEliminaoAnula[0] ;
            A668Tran_UsuarioEliminaoAnula = H00492_A668Tran_UsuarioEliminaoAnula[0] ;
            n668Tran_UsuarioEliminaoAnula = H00492_n668Tran_UsuarioEliminaoAnula[0] ;
            A667Tran_NumeroGrupo = H00492_A667Tran_NumeroGrupo[0] ;
            n667Tran_NumeroGrupo = H00492_n667Tran_NumeroGrupo[0] ;
            A524Tran_Detalle = H00492_A524Tran_Detalle[0] ;
            n524Tran_Detalle = H00492_n524Tran_Detalle[0] ;
            A608Tran_RegionAbrevDestino = H00492_A608Tran_RegionAbrevDestino[0] ;
            n608Tran_RegionAbrevDestino = H00492_n608Tran_RegionAbrevDestino[0] ;
            A594Tran_RegionAbrev = H00492_A594Tran_RegionAbrev[0] ;
            n594Tran_RegionAbrev = H00492_n594Tran_RegionAbrev[0] ;
            A53Tran_IdProveedor = H00492_A53Tran_IdProveedor[0] ;
            n53Tran_IdProveedor = H00492_n53Tran_IdProveedor[0] ;
            A568Tran_CantidadPadres = H00492_A568Tran_CantidadPadres[0] ;
            n568Tran_CantidadPadres = H00492_n568Tran_CantidadPadres[0] ;
            A527Tran_TipoEntra = H00492_A527Tran_TipoEntra[0] ;
            n527Tran_TipoEntra = H00492_n527Tran_TipoEntra[0] ;
            A520Tran_RegionDescripcionDestino = H00492_A520Tran_RegionDescripcionDestino[0] ;
            n520Tran_RegionDescripcionDestino = H00492_n520Tran_RegionDescripcionDestino[0] ;
            A519Tran_RegionCodigoDestino = H00492_A519Tran_RegionCodigoDestino[0] ;
            n519Tran_RegionCodigoDestino = H00492_n519Tran_RegionCodigoDestino[0] ;
            A518Tran_RegionIdDestino = H00492_A518Tran_RegionIdDestino[0] ;
            n518Tran_RegionIdDestino = H00492_n518Tran_RegionIdDestino[0] ;
            A517Tran_CentroCostoDescripcionDes = H00492_A517Tran_CentroCostoDescripcionDes[0] ;
            n517Tran_CentroCostoDescripcionDes = H00492_n517Tran_CentroCostoDescripcionDes[0] ;
            A516Tran_CentroCostoCodigoDestino = H00492_A516Tran_CentroCostoCodigoDestino[0] ;
            n516Tran_CentroCostoCodigoDestino = H00492_n516Tran_CentroCostoCodigoDestino[0] ;
            A50Tran_CentroCostoIdDestino = H00492_A50Tran_CentroCostoIdDestino[0] ;
            n50Tran_CentroCostoIdDestino = H00492_n50Tran_CentroCostoIdDestino[0] ;
            A515Tran_FechaIngreso = H00492_A515Tran_FechaIngreso[0] ;
            n515Tran_FechaIngreso = H00492_n515Tran_FechaIngreso[0] ;
            A514Tran_NumeroIngreso = H00492_A514Tran_NumeroIngreso[0] ;
            n514Tran_NumeroIngreso = H00492_n514Tran_NumeroIngreso[0] ;
            A54Tran_TipoIngreso = H00492_A54Tran_TipoIngreso[0] ;
            n54Tran_TipoIngreso = H00492_n54Tran_TipoIngreso[0] ;
            A513Tran_ConsecutivoCC = H00492_A513Tran_ConsecutivoCC[0] ;
            n513Tran_ConsecutivoCC = H00492_n513Tran_ConsecutivoCC[0] ;
            A498Tran_NumeroLineas = H00492_A498Tran_NumeroLineas[0] ;
            n498Tran_NumeroLineas = H00492_n498Tran_NumeroLineas[0] ;
            A483Tran_ValorTransaccion = H00492_A483Tran_ValorTransaccion[0] ;
            n483Tran_ValorTransaccion = H00492_n483Tran_ValorTransaccion[0] ;
            A391Tran_UsuarioRatifica = H00492_A391Tran_UsuarioRatifica[0] ;
            n391Tran_UsuarioRatifica = H00492_n391Tran_UsuarioRatifica[0] ;
            A390Tran_FechaRatificacion = H00492_A390Tran_FechaRatificacion[0] ;
            n390Tran_FechaRatificacion = H00492_n390Tran_FechaRatificacion[0] ;
            A58Tran_Estado = H00492_A58Tran_Estado[0] ;
            n58Tran_Estado = H00492_n58Tran_Estado[0] ;
            A408Tran_CursoCodigo = H00492_A408Tran_CursoCodigo[0] ;
            n408Tran_CursoCodigo = H00492_n408Tran_CursoCodigo[0] ;
            A407Tran_AreadanteCodigo = H00492_A407Tran_AreadanteCodigo[0] ;
            n407Tran_AreadanteCodigo = H00492_n407Tran_AreadanteCodigo[0] ;
            A52Tran_IdCuentadanteDestino = H00492_A52Tran_IdCuentadanteDestino[0] ;
            n52Tran_IdCuentadanteDestino = H00492_n52Tran_IdCuentadanteDestino[0] ;
            A387Tran_CodBodeDestino = H00492_A387Tran_CodBodeDestino[0] ;
            A111Tran_CodAlmaDestino = H00492_A111Tran_CodAlmaDestino[0] ;
            A385Tran_ModuloDestino = H00492_A385Tran_ModuloDestino[0] ;
            A51Tran_IdCuentadanteOrigen = H00492_A51Tran_IdCuentadanteOrigen[0] ;
            n51Tran_IdCuentadanteOrigen = H00492_n51Tran_IdCuentadanteOrigen[0] ;
            A112Tran_CodBodeOrigen = H00492_A112Tran_CodBodeOrigen[0] ;
            A109Tran_CodAlmaOrigen = H00492_A109Tran_CodAlmaOrigen[0] ;
            A110Tran_ModuloOrigen = H00492_A110Tran_ModuloOrigen[0] ;
            A422Tran_RegionDescripcion = H00492_A422Tran_RegionDescripcion[0] ;
            n422Tran_RegionDescripcion = H00492_n422Tran_RegionDescripcion[0] ;
            A421Tran_RegionCodigo = H00492_A421Tran_RegionCodigo[0] ;
            n421Tran_RegionCodigo = H00492_n421Tran_RegionCodigo[0] ;
            A57Tran_RegionId = H00492_A57Tran_RegionId[0] ;
            n57Tran_RegionId = H00492_n57Tran_RegionId[0] ;
            A420Tran_CentroCostoDescripcion = H00492_A420Tran_CentroCostoDescripcion[0] ;
            n420Tran_CentroCostoDescripcion = H00492_n420Tran_CentroCostoDescripcion[0] ;
            A419Tran_CentroCostoCodigo = H00492_A419Tran_CentroCostoCodigo[0] ;
            n419Tran_CentroCostoCodigo = H00492_n419Tran_CentroCostoCodigo[0] ;
            A48Tran_CentroCostoId = H00492_A48Tran_CentroCostoId[0] ;
            A418Tran_UsuarioNombre = H00492_A418Tran_UsuarioNombre[0] ;
            n418Tran_UsuarioNombre = H00492_n418Tran_UsuarioNombre[0] ;
            A417Tran_UsuarioCodigo = H00492_A417Tran_UsuarioCodigo[0] ;
            n417Tran_UsuarioCodigo = H00492_n417Tran_UsuarioCodigo[0] ;
            A47Tran_UsuarioId = H00492_A47Tran_UsuarioId[0] ;
            n47Tran_UsuarioId = H00492_n47Tran_UsuarioId[0] ;
            A55Tran_FechaRegistro = H00492_A55Tran_FechaRegistro[0] ;
            A46Tran_Id = H00492_A46Tran_Id[0] ;
            A759Tran_CedulaResponsabilidad = H00492_A759Tran_CedulaResponsabilidad[0] ;
            n759Tran_CedulaResponsabilidad = H00492_n759Tran_CedulaResponsabilidad[0] ;
            A721Tran_NombreCuentadanteResponsa = H00492_A721Tran_NombreCuentadanteResponsa[0] ;
            n721Tran_NombreCuentadanteResponsa = H00492_n721Tran_NombreCuentadanteResponsa[0] ;
            A703Tran_CedulaProveedor = H00492_A703Tran_CedulaProveedor[0] ;
            n703Tran_CedulaProveedor = H00492_n703Tran_CedulaProveedor[0] ;
            A575Tran_NombreProveedor = H00492_A575Tran_NombreProveedor[0] ;
            n575Tran_NombreProveedor = H00492_n575Tran_NombreProveedor[0] ;
            A608Tran_RegionAbrevDestino = H00492_A608Tran_RegionAbrevDestino[0] ;
            n608Tran_RegionAbrevDestino = H00492_n608Tran_RegionAbrevDestino[0] ;
            A520Tran_RegionDescripcionDestino = H00492_A520Tran_RegionDescripcionDestino[0] ;
            n520Tran_RegionDescripcionDestino = H00492_n520Tran_RegionDescripcionDestino[0] ;
            A519Tran_RegionCodigoDestino = H00492_A519Tran_RegionCodigoDestino[0] ;
            n519Tran_RegionCodigoDestino = H00492_n519Tran_RegionCodigoDestino[0] ;
            A517Tran_CentroCostoDescripcionDes = H00492_A517Tran_CentroCostoDescripcionDes[0] ;
            n517Tran_CentroCostoDescripcionDes = H00492_n517Tran_CentroCostoDescripcionDes[0] ;
            A516Tran_CentroCostoCodigoDestino = H00492_A516Tran_CentroCostoCodigoDestino[0] ;
            n516Tran_CentroCostoCodigoDestino = H00492_n516Tran_CentroCostoCodigoDestino[0] ;
            A756Tran_Abreviado = H00492_A756Tran_Abreviado[0] ;
            n756Tran_Abreviado = H00492_n756Tran_Abreviado[0] ;
            A672Tran_NombreIngreso = H00492_A672Tran_NombreIngreso[0] ;
            n672Tran_NombreIngreso = H00492_n672Tran_NombreIngreso[0] ;
            A715Tran_EmailCuentadanteDestino = H00492_A715Tran_EmailCuentadanteDestino[0] ;
            n715Tran_EmailCuentadanteDestino = H00492_n715Tran_EmailCuentadanteDestino[0] ;
            A704Tran_CedulaCuentadanteDestino = H00492_A704Tran_CedulaCuentadanteDestino[0] ;
            n704Tran_CedulaCuentadanteDestino = H00492_n704Tran_CedulaCuentadanteDestino[0] ;
            A389Tran_NombCuentadanteDestino = H00492_A389Tran_NombCuentadanteDestino[0] ;
            n389Tran_NombCuentadanteDestino = H00492_n389Tran_NombCuentadanteDestino[0] ;
            A714Tran_EmailCuentadanteOrigen = H00492_A714Tran_EmailCuentadanteOrigen[0] ;
            n714Tran_EmailCuentadanteOrigen = H00492_n714Tran_EmailCuentadanteOrigen[0] ;
            A702Tran_CedulaCuentadanteOrigen = H00492_A702Tran_CedulaCuentadanteOrigen[0] ;
            n702Tran_CedulaCuentadanteOrigen = H00492_n702Tran_CedulaCuentadanteOrigen[0] ;
            A384Tran_NombCuentadanteOrigen = H00492_A384Tran_NombCuentadanteOrigen[0] ;
            n384Tran_NombCuentadanteOrigen = H00492_n384Tran_NombCuentadanteOrigen[0] ;
            A594Tran_RegionAbrev = H00492_A594Tran_RegionAbrev[0] ;
            n594Tran_RegionAbrev = H00492_n594Tran_RegionAbrev[0] ;
            A422Tran_RegionDescripcion = H00492_A422Tran_RegionDescripcion[0] ;
            n422Tran_RegionDescripcion = H00492_n422Tran_RegionDescripcion[0] ;
            A421Tran_RegionCodigo = H00492_A421Tran_RegionCodigo[0] ;
            n421Tran_RegionCodigo = H00492_n421Tran_RegionCodigo[0] ;
            A420Tran_CentroCostoDescripcion = H00492_A420Tran_CentroCostoDescripcion[0] ;
            n420Tran_CentroCostoDescripcion = H00492_n420Tran_CentroCostoDescripcion[0] ;
            A419Tran_CentroCostoCodigo = H00492_A419Tran_CentroCostoCodigo[0] ;
            n419Tran_CentroCostoCodigo = H00492_n419Tran_CentroCostoCodigo[0] ;
            A418Tran_UsuarioNombre = H00492_A418Tran_UsuarioNombre[0] ;
            n418Tran_UsuarioNombre = H00492_n418Tran_UsuarioNombre[0] ;
            A417Tran_UsuarioCodigo = H00492_A417Tran_UsuarioCodigo[0] ;
            n417Tran_UsuarioCodigo = H00492_n417Tran_UsuarioCodigo[0] ;
            e13492 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(20) ;
         wb490( ) ;
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
      /* Using cursor H00493 */
      pr_default.execute(1, new Object[] {AV7Tran_CodigoMovimiento});
      GRID_nRecordCount = H00493_AGRID_nRecordCount[0] ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Tran_CodigoMovimiento, AV12Update, AV13Delete, A46Tran_Id, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Tran_CodigoMovimiento, AV12Update, AV13Delete, A46Tran_Id, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Tran_CodigoMovimiento, AV12Update, AV13Delete, A46Tran_Id, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Tran_CodigoMovimiento, AV12Update, AV13Delete, A46Tran_Id, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Tran_CodigoMovimiento, AV12Update, AV13Delete, A46Tran_Id, sPrefix) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup490( )
   {
      /* Before Start, stand alone formulas. */
      AV17Pgmname = "ALM_TIPO_MOVIMIENTOALM_TRANSACCIONWC" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e12492 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A49Tran_CodigoMovimiento = httpContext.cgiGet( edtTran_CodigoMovimiento_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A49Tran_CodigoMovimiento", A49Tran_CodigoMovimiento);
         /* Read saved values. */
         nRC_GXsfl_20 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_20"), ",", ".")) ;
         wcpOAV7Tran_CodigoMovimiento = httpContext.cgiGet( sPrefix+"wcpOAV7Tran_CodigoMovimiento") ;
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
      e12492 ();
      if (returnInSub) return;
   }

   public void e12492( )
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
      edtTran_CodigoMovimiento_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTran_CodigoMovimiento_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTran_CodigoMovimiento_Visible, 5, 0)), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
   }

   private void e13492( )
   {
      /* Grid_Load Routine */
      edtavUpdate_Link = formatLink("com.orions2.alm_transaccion") + "?" + GXutil.URLEncode(GXutil.rtrim("UPD")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A46Tran_Id,11,0))) ;
      edtavDelete_Link = formatLink("com.orions2.alm_transaccion") + "?" + GXutil.URLEncode(GXutil.rtrim("DLT")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A46Tran_Id,11,0))) ;
      edtTran_ConsecutivoCC_Link = formatLink("com.orions2.viewalm_transaccion") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A46Tran_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
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

   public void e11492( )
   {
      /* 'DoInsert' Routine */
      callWebObject(formatLink("com.orions2.alm_transaccion") + "?" + GXutil.URLEncode(GXutil.rtrim("INS")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))));
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV10TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV17Pgmname );
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerondelete( true );
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV9HTTPRequest.getScriptName()+"?"+AV9HTTPRequest.getQuerystring() );
      AV10TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_TRANSACCION" );
      AV11TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV11TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Tran_CodigoMovimiento" );
      AV11TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( AV7Tran_CodigoMovimiento );
      AV10TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV11TrnContextAtt, 0);
      AV8Session.setValue("TrnContext", AV10TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      AV7Tran_CodigoMovimiento = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Tran_CodigoMovimiento", AV7Tran_CodigoMovimiento);
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
      pa492( ) ;
      ws492( ) ;
      we492( ) ;
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
      sCtrlAV7Tran_CodigoMovimiento = (String)getParm(obj,0,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa492( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "alm_tipo_movimientoalm_transaccionwc");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa492( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV7Tran_CodigoMovimiento = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Tran_CodigoMovimiento", AV7Tran_CodigoMovimiento);
      }
      wcpOAV7Tran_CodigoMovimiento = httpContext.cgiGet( sPrefix+"wcpOAV7Tran_CodigoMovimiento") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV7Tran_CodigoMovimiento, wcpOAV7Tran_CodigoMovimiento) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV7Tran_CodigoMovimiento = AV7Tran_CodigoMovimiento ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV7Tran_CodigoMovimiento = httpContext.cgiGet( sPrefix+"AV7Tran_CodigoMovimiento_CTRL") ;
      if ( GXutil.len( sCtrlAV7Tran_CodigoMovimiento) > 0 )
      {
         AV7Tran_CodigoMovimiento = httpContext.cgiGet( sCtrlAV7Tran_CodigoMovimiento) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Tran_CodigoMovimiento", AV7Tran_CodigoMovimiento);
      }
      else
      {
         AV7Tran_CodigoMovimiento = httpContext.cgiGet( sPrefix+"AV7Tran_CodigoMovimiento_PARM") ;
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
      pa492( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws492( ) ;
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
      ws492( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Tran_CodigoMovimiento_PARM", AV7Tran_CodigoMovimiento);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7Tran_CodigoMovimiento)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Tran_CodigoMovimiento_CTRL", GXutil.rtrim( sCtrlAV7Tran_CodigoMovimiento));
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
      we492( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20186141412693");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("alm_tipo_movimientoalm_transaccionwc.js", "?20186141412693");
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_202( )
   {
      edtTran_Id_Internalname = sPrefix+"TRAN_ID_"+sGXsfl_20_idx ;
      edtTran_FechaRegistro_Internalname = sPrefix+"TRAN_FECHAREGISTRO_"+sGXsfl_20_idx ;
      edtTran_UsuarioId_Internalname = sPrefix+"TRAN_USUARIOID_"+sGXsfl_20_idx ;
      edtTran_UsuarioCodigo_Internalname = sPrefix+"TRAN_USUARIOCODIGO_"+sGXsfl_20_idx ;
      edtTran_UsuarioNombre_Internalname = sPrefix+"TRAN_USUARIONOMBRE_"+sGXsfl_20_idx ;
      edtTran_CentroCostoId_Internalname = sPrefix+"TRAN_CENTROCOSTOID_"+sGXsfl_20_idx ;
      edtTran_CentroCostoCodigo_Internalname = sPrefix+"TRAN_CENTROCOSTOCODIGO_"+sGXsfl_20_idx ;
      edtTran_CentroCostoDescripcion_Internalname = sPrefix+"TRAN_CENTROCOSTODESCRIPCION_"+sGXsfl_20_idx ;
      edtTran_RegionId_Internalname = sPrefix+"TRAN_REGIONID_"+sGXsfl_20_idx ;
      edtTran_RegionCodigo_Internalname = sPrefix+"TRAN_REGIONCODIGO_"+sGXsfl_20_idx ;
      edtTran_RegionDescripcion_Internalname = sPrefix+"TRAN_REGIONDESCRIPCION_"+sGXsfl_20_idx ;
      edtTran_ModuloOrigen_Internalname = sPrefix+"TRAN_MODULOORIGEN_"+sGXsfl_20_idx ;
      edtTran_CodAlmaOrigen_Internalname = sPrefix+"TRAN_CODALMAORIGEN_"+sGXsfl_20_idx ;
      edtTran_CodBodeOrigen_Internalname = sPrefix+"TRAN_CODBODEORIGEN_"+sGXsfl_20_idx ;
      edtTran_IdCuentadanteOrigen_Internalname = sPrefix+"TRAN_IDCUENTADANTEORIGEN_"+sGXsfl_20_idx ;
      edtTran_ModuloDestino_Internalname = sPrefix+"TRAN_MODULODESTINO_"+sGXsfl_20_idx ;
      edtTran_CodAlmaDestino_Internalname = sPrefix+"TRAN_CODALMADESTINO_"+sGXsfl_20_idx ;
      edtTran_CodBodeDestino_Internalname = sPrefix+"TRAN_CODBODEDESTINO_"+sGXsfl_20_idx ;
      edtTran_IdCuentadanteDestino_Internalname = sPrefix+"TRAN_IDCUENTADANTEDESTINO_"+sGXsfl_20_idx ;
      edtTran_Observaciones_Internalname = sPrefix+"TRAN_OBSERVACIONES_"+sGXsfl_20_idx ;
      edtTran_AreadanteCodigo_Internalname = sPrefix+"TRAN_AREADANTECODIGO_"+sGXsfl_20_idx ;
      edtTran_CursoCodigo_Internalname = sPrefix+"TRAN_CURSOCODIGO_"+sGXsfl_20_idx ;
      cmbTran_Estado.setInternalname( sPrefix+"TRAN_ESTADO_"+sGXsfl_20_idx );
      edtTran_FechaRatificacion_Internalname = sPrefix+"TRAN_FECHARATIFICACION_"+sGXsfl_20_idx ;
      edtTran_UsuarioRatifica_Internalname = sPrefix+"TRAN_USUARIORATIFICA_"+sGXsfl_20_idx ;
      edtTran_ValorTransaccion_Internalname = sPrefix+"TRAN_VALORTRANSACCION_"+sGXsfl_20_idx ;
      edtTran_NumeroLineas_Internalname = sPrefix+"TRAN_NUMEROLINEAS_"+sGXsfl_20_idx ;
      edtTran_ConsecutivoCC_Internalname = sPrefix+"TRAN_CONSECUTIVOCC_"+sGXsfl_20_idx ;
      cmbTran_TipoIngreso.setInternalname( sPrefix+"TRAN_TIPOINGRESO_"+sGXsfl_20_idx );
      edtTran_NumeroIngreso_Internalname = sPrefix+"TRAN_NUMEROINGRESO_"+sGXsfl_20_idx ;
      edtTran_FechaIngreso_Internalname = sPrefix+"TRAN_FECHAINGRESO_"+sGXsfl_20_idx ;
      edtTran_CentroCostoIdDestino_Internalname = sPrefix+"TRAN_CENTROCOSTOIDDESTINO_"+sGXsfl_20_idx ;
      edtTran_CentroCostoCodigoDestino_Internalname = sPrefix+"TRAN_CENTROCOSTOCODIGODESTINO_"+sGXsfl_20_idx ;
      edtTran_CentroCostoDescripcionDes_Internalname = sPrefix+"TRAN_CENTROCOSTODESCRIPCIONDES_"+sGXsfl_20_idx ;
      edtTran_RegionIdDestino_Internalname = sPrefix+"TRAN_REGIONIDDESTINO_"+sGXsfl_20_idx ;
      edtTran_RegionCodigoDestino_Internalname = sPrefix+"TRAN_REGIONCODIGODESTINO_"+sGXsfl_20_idx ;
      edtTran_RegionDescripcionDestino_Internalname = sPrefix+"TRAN_REGIONDESCRIPCIONDESTINO_"+sGXsfl_20_idx ;
      cmbTran_TipoEntra.setInternalname( sPrefix+"TRAN_TIPOENTRA_"+sGXsfl_20_idx );
      edtTran_CantidadPadres_Internalname = sPrefix+"TRAN_CANTIDADPADRES_"+sGXsfl_20_idx ;
      edtTran_IdProveedor_Internalname = sPrefix+"TRAN_IDPROVEEDOR_"+sGXsfl_20_idx ;
      edtTran_RegionAbrev_Internalname = sPrefix+"TRAN_REGIONABREV_"+sGXsfl_20_idx ;
      edtTran_RegionAbrevDestino_Internalname = sPrefix+"TRAN_REGIONABREVDESTINO_"+sGXsfl_20_idx ;
      edtTran_Detalle_Internalname = sPrefix+"TRAN_DETALLE_"+sGXsfl_20_idx ;
      edtTran_NumeroGrupo_Internalname = sPrefix+"TRAN_NUMEROGRUPO_"+sGXsfl_20_idx ;
      edtTran_UsuarioEliminaoAnula_Internalname = sPrefix+"TRAN_USUARIOELIMINAOANULA_"+sGXsfl_20_idx ;
      edtTran_FechaEliminaoAnula_Internalname = sPrefix+"TRAN_FECHAELIMINAOANULA_"+sGXsfl_20_idx ;
      edtTran_ObservacionesAnula_Internalname = sPrefix+"TRAN_OBSERVACIONESANULA_"+sGXsfl_20_idx ;
      edtTran_NombCuentadanteOrigen_Internalname = sPrefix+"TRAN_NOMBCUENTADANTEORIGEN_"+sGXsfl_20_idx ;
      edtTran_NombreProveedor_Internalname = sPrefix+"TRAN_NOMBREPROVEEDOR_"+sGXsfl_20_idx ;
      edtTran_NombCuentadanteDestino_Internalname = sPrefix+"TRAN_NOMBCUENTADANTEDESTINO_"+sGXsfl_20_idx ;
      edtTran_NombreIngreso_Internalname = sPrefix+"TRAN_NOMBREINGRESO_"+sGXsfl_20_idx ;
      edtTran_CedulaCuentadanteOrigen_Internalname = sPrefix+"TRAN_CEDULACUENTADANTEORIGEN_"+sGXsfl_20_idx ;
      edtTran_CedulaProveedor_Internalname = sPrefix+"TRAN_CEDULAPROVEEDOR_"+sGXsfl_20_idx ;
      edtTran_CedulaCuentadanteDestino_Internalname = sPrefix+"TRAN_CEDULACUENTADANTEDESTINO_"+sGXsfl_20_idx ;
      edtTran_EmailCuentadanteOrigen_Internalname = sPrefix+"TRAN_EMAILCUENTADANTEORIGEN_"+sGXsfl_20_idx ;
      edtTran_EmailCuentadanteDestino_Internalname = sPrefix+"TRAN_EMAILCUENTADANTEDESTINO_"+sGXsfl_20_idx ;
      edtTran_IdCuentadanteResponsabili_Internalname = sPrefix+"TRAN_IDCUENTADANTERESPONSABILI_"+sGXsfl_20_idx ;
      edtTran_TransaccResponsabilidad_Internalname = sPrefix+"TRAN_TRANSACCRESPONSABILIDAD_"+sGXsfl_20_idx ;
      edtTran_FechaResponsabilidad_Internalname = sPrefix+"TRAN_FECHARESPONSABILIDAD_"+sGXsfl_20_idx ;
      edtTran_NombreCuentadanteResponsa_Internalname = sPrefix+"TRAN_NOMBRECUENTADANTERESPONSA_"+sGXsfl_20_idx ;
      edtTran_Abreviado_Internalname = sPrefix+"TRAN_ABREVIADO_"+sGXsfl_20_idx ;
      edtTran_TablaResponsabilidad_Internalname = sPrefix+"TRAN_TABLARESPONSABILIDAD_"+sGXsfl_20_idx ;
      edtTran_CedulaResponsabilidad_Internalname = sPrefix+"TRAN_CEDULARESPONSABILIDAD_"+sGXsfl_20_idx ;
      cmbTran_EntidadGobierno.setInternalname( sPrefix+"TRAN_ENTIDADGOBIERNO_"+sGXsfl_20_idx );
      edtavUpdate_Internalname = sPrefix+"vUPDATE_"+sGXsfl_20_idx ;
      edtavDelete_Internalname = sPrefix+"vDELETE_"+sGXsfl_20_idx ;
   }

   public void subsflControlProps_fel_202( )
   {
      edtTran_Id_Internalname = sPrefix+"TRAN_ID_"+sGXsfl_20_fel_idx ;
      edtTran_FechaRegistro_Internalname = sPrefix+"TRAN_FECHAREGISTRO_"+sGXsfl_20_fel_idx ;
      edtTran_UsuarioId_Internalname = sPrefix+"TRAN_USUARIOID_"+sGXsfl_20_fel_idx ;
      edtTran_UsuarioCodigo_Internalname = sPrefix+"TRAN_USUARIOCODIGO_"+sGXsfl_20_fel_idx ;
      edtTran_UsuarioNombre_Internalname = sPrefix+"TRAN_USUARIONOMBRE_"+sGXsfl_20_fel_idx ;
      edtTran_CentroCostoId_Internalname = sPrefix+"TRAN_CENTROCOSTOID_"+sGXsfl_20_fel_idx ;
      edtTran_CentroCostoCodigo_Internalname = sPrefix+"TRAN_CENTROCOSTOCODIGO_"+sGXsfl_20_fel_idx ;
      edtTran_CentroCostoDescripcion_Internalname = sPrefix+"TRAN_CENTROCOSTODESCRIPCION_"+sGXsfl_20_fel_idx ;
      edtTran_RegionId_Internalname = sPrefix+"TRAN_REGIONID_"+sGXsfl_20_fel_idx ;
      edtTran_RegionCodigo_Internalname = sPrefix+"TRAN_REGIONCODIGO_"+sGXsfl_20_fel_idx ;
      edtTran_RegionDescripcion_Internalname = sPrefix+"TRAN_REGIONDESCRIPCION_"+sGXsfl_20_fel_idx ;
      edtTran_ModuloOrigen_Internalname = sPrefix+"TRAN_MODULOORIGEN_"+sGXsfl_20_fel_idx ;
      edtTran_CodAlmaOrigen_Internalname = sPrefix+"TRAN_CODALMAORIGEN_"+sGXsfl_20_fel_idx ;
      edtTran_CodBodeOrigen_Internalname = sPrefix+"TRAN_CODBODEORIGEN_"+sGXsfl_20_fel_idx ;
      edtTran_IdCuentadanteOrigen_Internalname = sPrefix+"TRAN_IDCUENTADANTEORIGEN_"+sGXsfl_20_fel_idx ;
      edtTran_ModuloDestino_Internalname = sPrefix+"TRAN_MODULODESTINO_"+sGXsfl_20_fel_idx ;
      edtTran_CodAlmaDestino_Internalname = sPrefix+"TRAN_CODALMADESTINO_"+sGXsfl_20_fel_idx ;
      edtTran_CodBodeDestino_Internalname = sPrefix+"TRAN_CODBODEDESTINO_"+sGXsfl_20_fel_idx ;
      edtTran_IdCuentadanteDestino_Internalname = sPrefix+"TRAN_IDCUENTADANTEDESTINO_"+sGXsfl_20_fel_idx ;
      edtTran_Observaciones_Internalname = sPrefix+"TRAN_OBSERVACIONES_"+sGXsfl_20_fel_idx ;
      edtTran_AreadanteCodigo_Internalname = sPrefix+"TRAN_AREADANTECODIGO_"+sGXsfl_20_fel_idx ;
      edtTran_CursoCodigo_Internalname = sPrefix+"TRAN_CURSOCODIGO_"+sGXsfl_20_fel_idx ;
      cmbTran_Estado.setInternalname( sPrefix+"TRAN_ESTADO_"+sGXsfl_20_fel_idx );
      edtTran_FechaRatificacion_Internalname = sPrefix+"TRAN_FECHARATIFICACION_"+sGXsfl_20_fel_idx ;
      edtTran_UsuarioRatifica_Internalname = sPrefix+"TRAN_USUARIORATIFICA_"+sGXsfl_20_fel_idx ;
      edtTran_ValorTransaccion_Internalname = sPrefix+"TRAN_VALORTRANSACCION_"+sGXsfl_20_fel_idx ;
      edtTran_NumeroLineas_Internalname = sPrefix+"TRAN_NUMEROLINEAS_"+sGXsfl_20_fel_idx ;
      edtTran_ConsecutivoCC_Internalname = sPrefix+"TRAN_CONSECUTIVOCC_"+sGXsfl_20_fel_idx ;
      cmbTran_TipoIngreso.setInternalname( sPrefix+"TRAN_TIPOINGRESO_"+sGXsfl_20_fel_idx );
      edtTran_NumeroIngreso_Internalname = sPrefix+"TRAN_NUMEROINGRESO_"+sGXsfl_20_fel_idx ;
      edtTran_FechaIngreso_Internalname = sPrefix+"TRAN_FECHAINGRESO_"+sGXsfl_20_fel_idx ;
      edtTran_CentroCostoIdDestino_Internalname = sPrefix+"TRAN_CENTROCOSTOIDDESTINO_"+sGXsfl_20_fel_idx ;
      edtTran_CentroCostoCodigoDestino_Internalname = sPrefix+"TRAN_CENTROCOSTOCODIGODESTINO_"+sGXsfl_20_fel_idx ;
      edtTran_CentroCostoDescripcionDes_Internalname = sPrefix+"TRAN_CENTROCOSTODESCRIPCIONDES_"+sGXsfl_20_fel_idx ;
      edtTran_RegionIdDestino_Internalname = sPrefix+"TRAN_REGIONIDDESTINO_"+sGXsfl_20_fel_idx ;
      edtTran_RegionCodigoDestino_Internalname = sPrefix+"TRAN_REGIONCODIGODESTINO_"+sGXsfl_20_fel_idx ;
      edtTran_RegionDescripcionDestino_Internalname = sPrefix+"TRAN_REGIONDESCRIPCIONDESTINO_"+sGXsfl_20_fel_idx ;
      cmbTran_TipoEntra.setInternalname( sPrefix+"TRAN_TIPOENTRA_"+sGXsfl_20_fel_idx );
      edtTran_CantidadPadres_Internalname = sPrefix+"TRAN_CANTIDADPADRES_"+sGXsfl_20_fel_idx ;
      edtTran_IdProveedor_Internalname = sPrefix+"TRAN_IDPROVEEDOR_"+sGXsfl_20_fel_idx ;
      edtTran_RegionAbrev_Internalname = sPrefix+"TRAN_REGIONABREV_"+sGXsfl_20_fel_idx ;
      edtTran_RegionAbrevDestino_Internalname = sPrefix+"TRAN_REGIONABREVDESTINO_"+sGXsfl_20_fel_idx ;
      edtTran_Detalle_Internalname = sPrefix+"TRAN_DETALLE_"+sGXsfl_20_fel_idx ;
      edtTran_NumeroGrupo_Internalname = sPrefix+"TRAN_NUMEROGRUPO_"+sGXsfl_20_fel_idx ;
      edtTran_UsuarioEliminaoAnula_Internalname = sPrefix+"TRAN_USUARIOELIMINAOANULA_"+sGXsfl_20_fel_idx ;
      edtTran_FechaEliminaoAnula_Internalname = sPrefix+"TRAN_FECHAELIMINAOANULA_"+sGXsfl_20_fel_idx ;
      edtTran_ObservacionesAnula_Internalname = sPrefix+"TRAN_OBSERVACIONESANULA_"+sGXsfl_20_fel_idx ;
      edtTran_NombCuentadanteOrigen_Internalname = sPrefix+"TRAN_NOMBCUENTADANTEORIGEN_"+sGXsfl_20_fel_idx ;
      edtTran_NombreProveedor_Internalname = sPrefix+"TRAN_NOMBREPROVEEDOR_"+sGXsfl_20_fel_idx ;
      edtTran_NombCuentadanteDestino_Internalname = sPrefix+"TRAN_NOMBCUENTADANTEDESTINO_"+sGXsfl_20_fel_idx ;
      edtTran_NombreIngreso_Internalname = sPrefix+"TRAN_NOMBREINGRESO_"+sGXsfl_20_fel_idx ;
      edtTran_CedulaCuentadanteOrigen_Internalname = sPrefix+"TRAN_CEDULACUENTADANTEORIGEN_"+sGXsfl_20_fel_idx ;
      edtTran_CedulaProveedor_Internalname = sPrefix+"TRAN_CEDULAPROVEEDOR_"+sGXsfl_20_fel_idx ;
      edtTran_CedulaCuentadanteDestino_Internalname = sPrefix+"TRAN_CEDULACUENTADANTEDESTINO_"+sGXsfl_20_fel_idx ;
      edtTran_EmailCuentadanteOrigen_Internalname = sPrefix+"TRAN_EMAILCUENTADANTEORIGEN_"+sGXsfl_20_fel_idx ;
      edtTran_EmailCuentadanteDestino_Internalname = sPrefix+"TRAN_EMAILCUENTADANTEDESTINO_"+sGXsfl_20_fel_idx ;
      edtTran_IdCuentadanteResponsabili_Internalname = sPrefix+"TRAN_IDCUENTADANTERESPONSABILI_"+sGXsfl_20_fel_idx ;
      edtTran_TransaccResponsabilidad_Internalname = sPrefix+"TRAN_TRANSACCRESPONSABILIDAD_"+sGXsfl_20_fel_idx ;
      edtTran_FechaResponsabilidad_Internalname = sPrefix+"TRAN_FECHARESPONSABILIDAD_"+sGXsfl_20_fel_idx ;
      edtTran_NombreCuentadanteResponsa_Internalname = sPrefix+"TRAN_NOMBRECUENTADANTERESPONSA_"+sGXsfl_20_fel_idx ;
      edtTran_Abreviado_Internalname = sPrefix+"TRAN_ABREVIADO_"+sGXsfl_20_fel_idx ;
      edtTran_TablaResponsabilidad_Internalname = sPrefix+"TRAN_TABLARESPONSABILIDAD_"+sGXsfl_20_fel_idx ;
      edtTran_CedulaResponsabilidad_Internalname = sPrefix+"TRAN_CEDULARESPONSABILIDAD_"+sGXsfl_20_fel_idx ;
      cmbTran_EntidadGobierno.setInternalname( sPrefix+"TRAN_ENTIDADGOBIERNO_"+sGXsfl_20_fel_idx );
      edtavUpdate_Internalname = sPrefix+"vUPDATE_"+sGXsfl_20_fel_idx ;
      edtavDelete_Internalname = sPrefix+"vDELETE_"+sGXsfl_20_fel_idx ;
   }

   public void sendrow_202( )
   {
      subsflControlProps_202( ) ;
      wb490( ) ;
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_Id_Internalname,GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A46Tran_Id), "ZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_Id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_FechaRegistro_Internalname,localUtil.ttoc( A55Tran_FechaRegistro, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A55Tran_FechaRegistro, "99/99/99 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_FechaRegistro_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_UsuarioId_Internalname,GXutil.ltrim( localUtil.ntoc( A47Tran_UsuarioId, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A47Tran_UsuarioId), "ZZZZZZZZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_UsuarioId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"IdLargo","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_UsuarioCodigo_Internalname,A417Tran_UsuarioCodigo,GXutil.rtrim( localUtil.format( A417Tran_UsuarioCodigo, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_UsuarioCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_UsuarioNombre_Internalname,A418Tran_UsuarioNombre,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_UsuarioNombre_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_CentroCostoId_Internalname,GXutil.ltrim( localUtil.ntoc( A48Tran_CentroCostoId, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A48Tran_CentroCostoId), "ZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_CentroCostoId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_CentroCostoCodigo_Internalname,A419Tran_CentroCostoCodigo,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_CentroCostoCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(16),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_CentroCostoDescripcion_Internalname,A420Tran_CentroCostoDescripcion,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_CentroCostoDescripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_RegionId_Internalname,GXutil.ltrim( localUtil.ntoc( A57Tran_RegionId, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A57Tran_RegionId), "ZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_RegionId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_RegionCodigo_Internalname,GXutil.ltrim( localUtil.ntoc( A421Tran_RegionCodigo, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A421Tran_RegionCodigo), "ZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_RegionCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_RegionDescripcion_Internalname,A422Tran_RegionDescripcion,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_RegionDescripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_ModuloOrigen_Internalname,A110Tran_ModuloOrigen,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_ModuloOrigen_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Modulo","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_CodAlmaOrigen_Internalname,A109Tran_CodAlmaOrigen,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_CodAlmaOrigen_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_CodBodeOrigen_Internalname,A112Tran_CodBodeOrigen,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_CodBodeOrigen_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_IdCuentadanteOrigen_Internalname,GXutil.ltrim( localUtil.ntoc( A51Tran_IdCuentadanteOrigen, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A51Tran_IdCuentadanteOrigen), "ZZZZZZZZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_IdCuentadanteOrigen_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_ModuloDestino_Internalname,A385Tran_ModuloDestino,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_ModuloDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Modulo","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_CodAlmaDestino_Internalname,A111Tran_CodAlmaDestino,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_CodAlmaDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_CodBodeDestino_Internalname,A387Tran_CodBodeDestino,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_CodBodeDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_IdCuentadanteDestino_Internalname,GXutil.ltrim( localUtil.ntoc( A52Tran_IdCuentadanteDestino, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A52Tran_IdCuentadanteDestino), "ZZZZZZZZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_IdCuentadanteDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_Observaciones_Internalname,A416Tran_Observaciones,A416Tran_Observaciones,"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_Observaciones_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2097152),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(0),new Integer(-1),new Boolean(true),"","left",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_AreadanteCodigo_Internalname,A407Tran_AreadanteCodigo,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_AreadanteCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(20),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_CursoCodigo_Internalname,A408Tran_CursoCodigo,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_CursoCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(41),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_20_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "TRAN_ESTADO_" + sGXsfl_20_idx ;
            cmbTran_Estado.setName( GXCCtl );
            cmbTran_Estado.setWebtags( "" );
            cmbTran_Estado.addItem("A", "Anulado", (short)(0));
            cmbTran_Estado.addItem("R", "Ratificado", (short)(0));
            cmbTran_Estado.addItem("P", "Pendiente", (short)(0));
            cmbTran_Estado.addItem("I", "Incompleto", (short)(0));
            if ( cmbTran_Estado.getItemCount() > 0 )
            {
               A58Tran_Estado = cmbTran_Estado.getValidValue(A58Tran_Estado) ;
               n58Tran_Estado = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTran_Estado,cmbTran_Estado.getInternalname(),GXutil.rtrim( A58Tran_Estado),new Integer(1),cmbTran_Estado.getJsonclick(),new Integer(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbTran_Estado.setValue( GXutil.rtrim( A58Tran_Estado) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTran_Estado.getInternalname(), "Values", cmbTran_Estado.ToJavascriptSource(), !bGXsfl_20_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_FechaRatificacion_Internalname,localUtil.ttoc( A390Tran_FechaRatificacion, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A390Tran_FechaRatificacion, "99/99/9999 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_FechaRatificacion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(16),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_UsuarioRatifica_Internalname,A391Tran_UsuarioRatifica,GXutil.rtrim( localUtil.format( A391Tran_UsuarioRatifica, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_UsuarioRatifica_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_ValorTransaccion_Internalname,GXutil.ltrim( localUtil.ntoc( A483Tran_ValorTransaccion, (byte)(24), (byte)(2), ",", "")),localUtil.format( A483Tran_ValorTransaccion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_ValorTransaccion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Valor","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_NumeroLineas_Internalname,GXutil.ltrim( localUtil.ntoc( A498Tran_NumeroLineas, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A498Tran_NumeroLineas), "ZZZZZZZZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_NumeroLineas_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_ConsecutivoCC_Internalname,GXutil.ltrim( localUtil.ntoc( A513Tran_ConsecutivoCC, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A513Tran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'",edtTran_ConsecutivoCC_Link,"","","",edtTran_ConsecutivoCC_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_20_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "TRAN_TIPOINGRESO_" + sGXsfl_20_idx ;
            cmbTran_TipoIngreso.setName( GXCCtl );
            cmbTran_TipoIngreso.setWebtags( "" );
            if ( cmbTran_TipoIngreso.getItemCount() > 0 )
            {
               A54Tran_TipoIngreso = GXutil.lval( cmbTran_TipoIngreso.getValidValue(GXutil.trim( GXutil.str( A54Tran_TipoIngreso, 11, 0)))) ;
               n54Tran_TipoIngreso = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTran_TipoIngreso,cmbTran_TipoIngreso.getInternalname(),GXutil.trim( GXutil.str( A54Tran_TipoIngreso, 11, 0)),new Integer(1),cmbTran_TipoIngreso.getJsonclick(),new Integer(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","int","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbTran_TipoIngreso.setValue( GXutil.trim( GXutil.str( A54Tran_TipoIngreso, 11, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTran_TipoIngreso.getInternalname(), "Values", cmbTran_TipoIngreso.ToJavascriptSource(), !bGXsfl_20_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_NumeroIngreso_Internalname,GXutil.rtrim( A514Tran_NumeroIngreso),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_NumeroIngreso_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_FechaIngreso_Internalname,localUtil.format(A515Tran_FechaIngreso, "99/99/99"),localUtil.format( A515Tran_FechaIngreso, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_FechaIngreso_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Fecha","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_CentroCostoIdDestino_Internalname,GXutil.ltrim( localUtil.ntoc( A50Tran_CentroCostoIdDestino, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A50Tran_CentroCostoIdDestino), "ZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_CentroCostoIdDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_CentroCostoCodigoDestino_Internalname,A516Tran_CentroCostoCodigoDestino,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_CentroCostoCodigoDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(16),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_CentroCostoDescripcionDes_Internalname,A517Tran_CentroCostoDescripcionDes,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_CentroCostoDescripcionDes_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_RegionIdDestino_Internalname,GXutil.ltrim( localUtil.ntoc( A518Tran_RegionIdDestino, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A518Tran_RegionIdDestino), "ZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_RegionIdDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_RegionCodigoDestino_Internalname,GXutil.ltrim( localUtil.ntoc( A519Tran_RegionCodigoDestino, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A519Tran_RegionCodigoDestino), "ZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_RegionCodigoDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_RegionDescripcionDestino_Internalname,A520Tran_RegionDescripcionDestino,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_RegionDescripcionDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_20_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "TRAN_TIPOENTRA_" + sGXsfl_20_idx ;
            cmbTran_TipoEntra.setName( GXCCtl );
            cmbTran_TipoEntra.setWebtags( "" );
            if ( cmbTran_TipoEntra.getItemCount() > 0 )
            {
               A527Tran_TipoEntra = cmbTran_TipoEntra.getValidValue(A527Tran_TipoEntra) ;
               n527Tran_TipoEntra = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTran_TipoEntra,cmbTran_TipoEntra.getInternalname(),GXutil.rtrim( A527Tran_TipoEntra),new Integer(1),cmbTran_TipoEntra.getJsonclick(),new Integer(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbTran_TipoEntra.setValue( GXutil.rtrim( A527Tran_TipoEntra) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTran_TipoEntra.getInternalname(), "Values", cmbTran_TipoEntra.ToJavascriptSource(), !bGXsfl_20_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_CantidadPadres_Internalname,GXutil.ltrim( localUtil.ntoc( A568Tran_CantidadPadres, (byte)(8), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A568Tran_CantidadPadres), "ZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_CantidadPadres_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_IdProveedor_Internalname,GXutil.ltrim( localUtil.ntoc( A53Tran_IdProveedor, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A53Tran_IdProveedor), "ZZZZZZZZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_IdProveedor_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_RegionAbrev_Internalname,A594Tran_RegionAbrev,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_RegionAbrev_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(15),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_RegionAbrevDestino_Internalname,A608Tran_RegionAbrevDestino,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_RegionAbrevDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(15),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_Detalle_Internalname,GXutil.rtrim( A524Tran_Detalle),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_Detalle_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_NumeroGrupo_Internalname,GXutil.ltrim( localUtil.ntoc( A667Tran_NumeroGrupo, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A667Tran_NumeroGrupo), "ZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_NumeroGrupo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_UsuarioEliminaoAnula_Internalname,A668Tran_UsuarioEliminaoAnula,GXutil.rtrim( localUtil.format( A668Tran_UsuarioEliminaoAnula, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_UsuarioEliminaoAnula_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_FechaEliminaoAnula_Internalname,localUtil.ttoc( A669Tran_FechaEliminaoAnula, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A669Tran_FechaEliminaoAnula, "99/99/99 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_FechaEliminaoAnula_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_ObservacionesAnula_Internalname,A670Tran_ObservacionesAnula,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_ObservacionesAnula_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(300),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_NombCuentadanteOrigen_Internalname,A384Tran_NombCuentadanteOrigen,GXutil.rtrim( localUtil.format( A384Tran_NombCuentadanteOrigen, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_NombCuentadanteOrigen_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_NombreProveedor_Internalname,A575Tran_NombreProveedor,GXutil.rtrim( localUtil.format( A575Tran_NombreProveedor, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_NombreProveedor_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_NombCuentadanteDestino_Internalname,A389Tran_NombCuentadanteDestino,GXutil.rtrim( localUtil.format( A389Tran_NombCuentadanteDestino, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_NombCuentadanteDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_NombreIngreso_Internalname,A672Tran_NombreIngreso,GXutil.rtrim( localUtil.format( A672Tran_NombreIngreso, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_NombreIngreso_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_CedulaCuentadanteOrigen_Internalname,GXutil.ltrim( localUtil.ntoc( A702Tran_CedulaCuentadanteOrigen, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A702Tran_CedulaCuentadanteOrigen), "ZZZZZZZZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_CedulaCuentadanteOrigen_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_CedulaProveedor_Internalname,GXutil.ltrim( localUtil.ntoc( A703Tran_CedulaProveedor, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A703Tran_CedulaProveedor), "ZZZZZZZZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_CedulaProveedor_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_CedulaCuentadanteDestino_Internalname,GXutil.ltrim( localUtil.ntoc( A704Tran_CedulaCuentadanteDestino, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A704Tran_CedulaCuentadanteDestino), "ZZZZZZZZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_CedulaCuentadanteDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_EmailCuentadanteOrigen_Internalname,A714Tran_EmailCuentadanteOrigen,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","mailto:"+A714Tran_EmailCuentadanteOrigen,"","","",edtTran_EmailCuentadanteOrigen_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"email","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"GeneXus\\Email","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_EmailCuentadanteDestino_Internalname,A715Tran_EmailCuentadanteDestino,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","mailto:"+A715Tran_EmailCuentadanteDestino,"","","",edtTran_EmailCuentadanteDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"email","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"GeneXus\\Email","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_IdCuentadanteResponsabili_Internalname,GXutil.ltrim( localUtil.ntoc( A56Tran_IdCuentadanteResponsabili, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A56Tran_IdCuentadanteResponsabili), "ZZZZZZZZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_IdCuentadanteResponsabili_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_TransaccResponsabilidad_Internalname,GXutil.ltrim( localUtil.ntoc( A719Tran_TransaccResponsabilidad, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A719Tran_TransaccResponsabilidad), "ZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_TransaccResponsabilidad_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_FechaResponsabilidad_Internalname,localUtil.format(A720Tran_FechaResponsabilidad, "99/99/99"),localUtil.format( A720Tran_FechaResponsabilidad, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_FechaResponsabilidad_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Fecha","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_NombreCuentadanteResponsa_Internalname,A721Tran_NombreCuentadanteResponsa,GXutil.rtrim( localUtil.format( A721Tran_NombreCuentadanteResponsa, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_NombreCuentadanteResponsa_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_Abreviado_Internalname,A756Tran_Abreviado,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_Abreviado_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_TablaResponsabilidad_Internalname,GXutil.ltrim( localUtil.ntoc( A758Tran_TablaResponsabilidad, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A758Tran_TablaResponsabilidad), "ZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_TablaResponsabilidad_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_CedulaResponsabilidad_Internalname,GXutil.ltrim( localUtil.ntoc( A759Tran_CedulaResponsabilidad, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A759Tran_CedulaResponsabilidad), "ZZZZZZZZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_CedulaResponsabilidad_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_20_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "TRAN_ENTIDADGOBIERNO_" + sGXsfl_20_idx ;
            cmbTran_EntidadGobierno.setName( GXCCtl );
            cmbTran_EntidadGobierno.setWebtags( "" );
            cmbTran_EntidadGobierno.addItem("", "", (short)(0));
            cmbTran_EntidadGobierno.addItem("SI", "SI", (short)(0));
            cmbTran_EntidadGobierno.addItem("NO", "NO", (short)(0));
            if ( cmbTran_EntidadGobierno.getItemCount() > 0 )
            {
               A859Tran_EntidadGobierno = cmbTran_EntidadGobierno.getValidValue(A859Tran_EntidadGobierno) ;
               n859Tran_EntidadGobierno = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTran_EntidadGobierno,cmbTran_EntidadGobierno.getInternalname(),GXutil.rtrim( A859Tran_EntidadGobierno),new Integer(1),cmbTran_EntidadGobierno.getJsonclick(),new Integer(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbTran_EntidadGobierno.setValue( GXutil.rtrim( A859Tran_EntidadGobierno) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTran_EntidadGobierno.getInternalname(), "Values", cmbTran_EntidadGobierno.ToJavascriptSource(), !bGXsfl_20_Refreshing);
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
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_ID"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A46Tran_Id), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_FECHAREGISTRO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( A55Tran_FechaRegistro, "99/99/99 99:99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_USUARIOID"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A47Tran_UsuarioId), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_CENTROCOSTOID"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A48Tran_CentroCostoId), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_REGIONID"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A57Tran_RegionId), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_MODULOORIGEN"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A110Tran_ModuloOrigen, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_CODALMAORIGEN"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A109Tran_CodAlmaOrigen, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_CODBODEORIGEN"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A112Tran_CodBodeOrigen, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_IDCUENTADANTEORIGEN"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A51Tran_IdCuentadanteOrigen), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_MODULODESTINO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A385Tran_ModuloDestino, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_CODALMADESTINO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A111Tran_CodAlmaDestino, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_CODBODEDESTINO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A387Tran_CodBodeDestino, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_IDCUENTADANTEDESTINO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A52Tran_IdCuentadanteDestino), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_OBSERVACIONES"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, A416Tran_Observaciones));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_AREADANTECODIGO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A407Tran_AreadanteCodigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_CURSOCODIGO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A408Tran_CursoCodigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_ESTADO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A58Tran_Estado, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_FECHARATIFICACION"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( A390Tran_FechaRatificacion, "99/99/9999 99:99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_USUARIORATIFICA"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A391Tran_UsuarioRatifica, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_VALORTRANSACCION"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( A483Tran_ValorTransaccion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_NUMEROLINEAS"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A498Tran_NumeroLineas), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_TIPOINGRESO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A54Tran_TipoIngreso), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_NUMEROINGRESO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A514Tran_NumeroIngreso, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_FECHAINGRESO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, A515Tran_FechaIngreso));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_CENTROCOSTOIDDESTINO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A50Tran_CentroCostoIdDestino), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_REGIONIDDESTINO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A518Tran_RegionIdDestino), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_TIPOENTRA"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A527Tran_TipoEntra, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_CANTIDADPADRES"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A568Tran_CantidadPadres), "ZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_IDPROVEEDOR"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A53Tran_IdProveedor), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_DETALLE"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A524Tran_Detalle, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_NUMEROGRUPO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A667Tran_NumeroGrupo), "ZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_USUARIOELIMINAOANULA"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A668Tran_UsuarioEliminaoAnula, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_FECHAELIMINAOANULA"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( A669Tran_FechaEliminaoAnula, "99/99/99 99:99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_OBSERVACIONESANULA"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A670Tran_ObservacionesAnula, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_IDCUENTADANTERESPONSABILI"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A56Tran_IdCuentadanteResponsabili), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_TRANSACCRESPONSABILIDAD"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A719Tran_TransaccResponsabilidad), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_FECHARESPONSABILIDAD"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, A720Tran_FechaResponsabilidad));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_TABLARESPONSABILIDAD"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A758Tran_TablaResponsabilidad), "ZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_ENTIDADGOBIERNO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A859Tran_EntidadGobierno, ""))));
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
      edtTran_Id_Internalname = sPrefix+"TRAN_ID" ;
      edtTran_FechaRegistro_Internalname = sPrefix+"TRAN_FECHAREGISTRO" ;
      edtTran_UsuarioId_Internalname = sPrefix+"TRAN_USUARIOID" ;
      edtTran_UsuarioCodigo_Internalname = sPrefix+"TRAN_USUARIOCODIGO" ;
      edtTran_UsuarioNombre_Internalname = sPrefix+"TRAN_USUARIONOMBRE" ;
      edtTran_CentroCostoId_Internalname = sPrefix+"TRAN_CENTROCOSTOID" ;
      edtTran_CentroCostoCodigo_Internalname = sPrefix+"TRAN_CENTROCOSTOCODIGO" ;
      edtTran_CentroCostoDescripcion_Internalname = sPrefix+"TRAN_CENTROCOSTODESCRIPCION" ;
      edtTran_RegionId_Internalname = sPrefix+"TRAN_REGIONID" ;
      edtTran_RegionCodigo_Internalname = sPrefix+"TRAN_REGIONCODIGO" ;
      edtTran_RegionDescripcion_Internalname = sPrefix+"TRAN_REGIONDESCRIPCION" ;
      edtTran_ModuloOrigen_Internalname = sPrefix+"TRAN_MODULOORIGEN" ;
      edtTran_CodAlmaOrigen_Internalname = sPrefix+"TRAN_CODALMAORIGEN" ;
      edtTran_CodBodeOrigen_Internalname = sPrefix+"TRAN_CODBODEORIGEN" ;
      edtTran_IdCuentadanteOrigen_Internalname = sPrefix+"TRAN_IDCUENTADANTEORIGEN" ;
      edtTran_ModuloDestino_Internalname = sPrefix+"TRAN_MODULODESTINO" ;
      edtTran_CodAlmaDestino_Internalname = sPrefix+"TRAN_CODALMADESTINO" ;
      edtTran_CodBodeDestino_Internalname = sPrefix+"TRAN_CODBODEDESTINO" ;
      edtTran_IdCuentadanteDestino_Internalname = sPrefix+"TRAN_IDCUENTADANTEDESTINO" ;
      edtTran_Observaciones_Internalname = sPrefix+"TRAN_OBSERVACIONES" ;
      edtTran_AreadanteCodigo_Internalname = sPrefix+"TRAN_AREADANTECODIGO" ;
      edtTran_CursoCodigo_Internalname = sPrefix+"TRAN_CURSOCODIGO" ;
      cmbTran_Estado.setInternalname( sPrefix+"TRAN_ESTADO" );
      edtTran_FechaRatificacion_Internalname = sPrefix+"TRAN_FECHARATIFICACION" ;
      edtTran_UsuarioRatifica_Internalname = sPrefix+"TRAN_USUARIORATIFICA" ;
      edtTran_ValorTransaccion_Internalname = sPrefix+"TRAN_VALORTRANSACCION" ;
      edtTran_NumeroLineas_Internalname = sPrefix+"TRAN_NUMEROLINEAS" ;
      edtTran_ConsecutivoCC_Internalname = sPrefix+"TRAN_CONSECUTIVOCC" ;
      cmbTran_TipoIngreso.setInternalname( sPrefix+"TRAN_TIPOINGRESO" );
      edtTran_NumeroIngreso_Internalname = sPrefix+"TRAN_NUMEROINGRESO" ;
      edtTran_FechaIngreso_Internalname = sPrefix+"TRAN_FECHAINGRESO" ;
      edtTran_CentroCostoIdDestino_Internalname = sPrefix+"TRAN_CENTROCOSTOIDDESTINO" ;
      edtTran_CentroCostoCodigoDestino_Internalname = sPrefix+"TRAN_CENTROCOSTOCODIGODESTINO" ;
      edtTran_CentroCostoDescripcionDes_Internalname = sPrefix+"TRAN_CENTROCOSTODESCRIPCIONDES" ;
      edtTran_RegionIdDestino_Internalname = sPrefix+"TRAN_REGIONIDDESTINO" ;
      edtTran_RegionCodigoDestino_Internalname = sPrefix+"TRAN_REGIONCODIGODESTINO" ;
      edtTran_RegionDescripcionDestino_Internalname = sPrefix+"TRAN_REGIONDESCRIPCIONDESTINO" ;
      cmbTran_TipoEntra.setInternalname( sPrefix+"TRAN_TIPOENTRA" );
      edtTran_CantidadPadres_Internalname = sPrefix+"TRAN_CANTIDADPADRES" ;
      edtTran_IdProveedor_Internalname = sPrefix+"TRAN_IDPROVEEDOR" ;
      edtTran_RegionAbrev_Internalname = sPrefix+"TRAN_REGIONABREV" ;
      edtTran_RegionAbrevDestino_Internalname = sPrefix+"TRAN_REGIONABREVDESTINO" ;
      edtTran_Detalle_Internalname = sPrefix+"TRAN_DETALLE" ;
      edtTran_NumeroGrupo_Internalname = sPrefix+"TRAN_NUMEROGRUPO" ;
      edtTran_UsuarioEliminaoAnula_Internalname = sPrefix+"TRAN_USUARIOELIMINAOANULA" ;
      edtTran_FechaEliminaoAnula_Internalname = sPrefix+"TRAN_FECHAELIMINAOANULA" ;
      edtTran_ObservacionesAnula_Internalname = sPrefix+"TRAN_OBSERVACIONESANULA" ;
      edtTran_NombCuentadanteOrigen_Internalname = sPrefix+"TRAN_NOMBCUENTADANTEORIGEN" ;
      edtTran_NombreProveedor_Internalname = sPrefix+"TRAN_NOMBREPROVEEDOR" ;
      edtTran_NombCuentadanteDestino_Internalname = sPrefix+"TRAN_NOMBCUENTADANTEDESTINO" ;
      edtTran_NombreIngreso_Internalname = sPrefix+"TRAN_NOMBREINGRESO" ;
      edtTran_CedulaCuentadanteOrigen_Internalname = sPrefix+"TRAN_CEDULACUENTADANTEORIGEN" ;
      edtTran_CedulaProveedor_Internalname = sPrefix+"TRAN_CEDULAPROVEEDOR" ;
      edtTran_CedulaCuentadanteDestino_Internalname = sPrefix+"TRAN_CEDULACUENTADANTEDESTINO" ;
      edtTran_EmailCuentadanteOrigen_Internalname = sPrefix+"TRAN_EMAILCUENTADANTEORIGEN" ;
      edtTran_EmailCuentadanteDestino_Internalname = sPrefix+"TRAN_EMAILCUENTADANTEDESTINO" ;
      edtTran_IdCuentadanteResponsabili_Internalname = sPrefix+"TRAN_IDCUENTADANTERESPONSABILI" ;
      edtTran_TransaccResponsabilidad_Internalname = sPrefix+"TRAN_TRANSACCRESPONSABILIDAD" ;
      edtTran_FechaResponsabilidad_Internalname = sPrefix+"TRAN_FECHARESPONSABILIDAD" ;
      edtTran_NombreCuentadanteResponsa_Internalname = sPrefix+"TRAN_NOMBRECUENTADANTERESPONSA" ;
      edtTran_Abreviado_Internalname = sPrefix+"TRAN_ABREVIADO" ;
      edtTran_TablaResponsabilidad_Internalname = sPrefix+"TRAN_TABLARESPONSABILIDAD" ;
      edtTran_CedulaResponsabilidad_Internalname = sPrefix+"TRAN_CEDULARESPONSABILIDAD" ;
      cmbTran_EntidadGobierno.setInternalname( sPrefix+"TRAN_ENTIDADGOBIERNO" );
      edtavUpdate_Internalname = sPrefix+"vUPDATE" ;
      edtavDelete_Internalname = sPrefix+"vDELETE" ;
      divGridtable_Internalname = sPrefix+"GRIDTABLE" ;
      divGridcell_Internalname = sPrefix+"GRIDCELL" ;
      edtTran_CodigoMovimiento_Internalname = sPrefix+"TRAN_CODIGOMOVIMIENTO" ;
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
      cmbTran_EntidadGobierno.setJsonclick( "" );
      edtTran_CedulaResponsabilidad_Jsonclick = "" ;
      edtTran_TablaResponsabilidad_Jsonclick = "" ;
      edtTran_Abreviado_Jsonclick = "" ;
      edtTran_NombreCuentadanteResponsa_Jsonclick = "" ;
      edtTran_FechaResponsabilidad_Jsonclick = "" ;
      edtTran_TransaccResponsabilidad_Jsonclick = "" ;
      edtTran_IdCuentadanteResponsabili_Jsonclick = "" ;
      edtTran_EmailCuentadanteDestino_Jsonclick = "" ;
      edtTran_EmailCuentadanteOrigen_Jsonclick = "" ;
      edtTran_CedulaCuentadanteDestino_Jsonclick = "" ;
      edtTran_CedulaProveedor_Jsonclick = "" ;
      edtTran_CedulaCuentadanteOrigen_Jsonclick = "" ;
      edtTran_NombreIngreso_Jsonclick = "" ;
      edtTran_NombCuentadanteDestino_Jsonclick = "" ;
      edtTran_NombreProveedor_Jsonclick = "" ;
      edtTran_NombCuentadanteOrigen_Jsonclick = "" ;
      edtTran_ObservacionesAnula_Jsonclick = "" ;
      edtTran_FechaEliminaoAnula_Jsonclick = "" ;
      edtTran_UsuarioEliminaoAnula_Jsonclick = "" ;
      edtTran_NumeroGrupo_Jsonclick = "" ;
      edtTran_Detalle_Jsonclick = "" ;
      edtTran_RegionAbrevDestino_Jsonclick = "" ;
      edtTran_RegionAbrev_Jsonclick = "" ;
      edtTran_IdProveedor_Jsonclick = "" ;
      edtTran_CantidadPadres_Jsonclick = "" ;
      cmbTran_TipoEntra.setJsonclick( "" );
      edtTran_RegionDescripcionDestino_Jsonclick = "" ;
      edtTran_RegionCodigoDestino_Jsonclick = "" ;
      edtTran_RegionIdDestino_Jsonclick = "" ;
      edtTran_CentroCostoDescripcionDes_Jsonclick = "" ;
      edtTran_CentroCostoCodigoDestino_Jsonclick = "" ;
      edtTran_CentroCostoIdDestino_Jsonclick = "" ;
      edtTran_FechaIngreso_Jsonclick = "" ;
      edtTran_NumeroIngreso_Jsonclick = "" ;
      cmbTran_TipoIngreso.setJsonclick( "" );
      edtTran_ConsecutivoCC_Jsonclick = "" ;
      edtTran_NumeroLineas_Jsonclick = "" ;
      edtTran_ValorTransaccion_Jsonclick = "" ;
      edtTran_UsuarioRatifica_Jsonclick = "" ;
      edtTran_FechaRatificacion_Jsonclick = "" ;
      cmbTran_Estado.setJsonclick( "" );
      edtTran_CursoCodigo_Jsonclick = "" ;
      edtTran_AreadanteCodigo_Jsonclick = "" ;
      edtTran_Observaciones_Jsonclick = "" ;
      edtTran_IdCuentadanteDestino_Jsonclick = "" ;
      edtTran_CodBodeDestino_Jsonclick = "" ;
      edtTran_CodAlmaDestino_Jsonclick = "" ;
      edtTran_ModuloDestino_Jsonclick = "" ;
      edtTran_IdCuentadanteOrigen_Jsonclick = "" ;
      edtTran_CodBodeOrigen_Jsonclick = "" ;
      edtTran_CodAlmaOrigen_Jsonclick = "" ;
      edtTran_ModuloOrigen_Jsonclick = "" ;
      edtTran_RegionDescripcion_Jsonclick = "" ;
      edtTran_RegionCodigo_Jsonclick = "" ;
      edtTran_RegionId_Jsonclick = "" ;
      edtTran_CentroCostoDescripcion_Jsonclick = "" ;
      edtTran_CentroCostoCodigo_Jsonclick = "" ;
      edtTran_CentroCostoId_Jsonclick = "" ;
      edtTran_UsuarioNombre_Jsonclick = "" ;
      edtTran_UsuarioCodigo_Jsonclick = "" ;
      edtTran_UsuarioId_Jsonclick = "" ;
      edtTran_FechaRegistro_Jsonclick = "" ;
      edtTran_Id_Jsonclick = "" ;
      edtTran_CodigoMovimiento_Jsonclick = "" ;
      edtTran_CodigoMovimiento_Enabled = 0 ;
      edtTran_CodigoMovimiento_Visible = 1 ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      edtavDelete_Link = "" ;
      edtavUpdate_Link = "" ;
      edtTran_ConsecutivoCC_Link = "" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Tran_CodigoMovimiento',fld:'vTRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e13492',iparms:[{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[{av:'edtavUpdate_Link',ctrl:'vUPDATE',prop:'Link'},{av:'edtavDelete_Link',ctrl:'vDELETE',prop:'Link'},{av:'edtTran_ConsecutivoCC_Link',ctrl:'TRAN_CONSECUTIVOCC',prop:'Link'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e11492',iparms:[{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Tran_CodigoMovimiento',fld:'vTRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Tran_CodigoMovimiento',fld:'vTRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Tran_CodigoMovimiento',fld:'vTRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Tran_CodigoMovimiento',fld:'vTRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
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
      wcpOAV7Tran_CodigoMovimiento = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV7Tran_CodigoMovimiento = "" ;
      AV12Update = "" ;
      AV13Delete = "" ;
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
      A55Tran_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      A417Tran_UsuarioCodigo = "" ;
      A418Tran_UsuarioNombre = "" ;
      A419Tran_CentroCostoCodigo = "" ;
      A420Tran_CentroCostoDescripcion = "" ;
      A422Tran_RegionDescripcion = "" ;
      A110Tran_ModuloOrigen = "" ;
      A109Tran_CodAlmaOrigen = "" ;
      A112Tran_CodBodeOrigen = "" ;
      A385Tran_ModuloDestino = "" ;
      A111Tran_CodAlmaDestino = "" ;
      A387Tran_CodBodeDestino = "" ;
      A416Tran_Observaciones = "" ;
      A407Tran_AreadanteCodigo = "" ;
      A408Tran_CursoCodigo = "" ;
      A58Tran_Estado = "" ;
      A390Tran_FechaRatificacion = GXutil.resetTime( GXutil.nullDate() );
      A391Tran_UsuarioRatifica = "" ;
      A483Tran_ValorTransaccion = DecimalUtil.ZERO ;
      A514Tran_NumeroIngreso = "" ;
      A515Tran_FechaIngreso = GXutil.nullDate() ;
      A516Tran_CentroCostoCodigoDestino = "" ;
      A517Tran_CentroCostoDescripcionDes = "" ;
      A520Tran_RegionDescripcionDestino = "" ;
      A527Tran_TipoEntra = "" ;
      A594Tran_RegionAbrev = "" ;
      A608Tran_RegionAbrevDestino = "" ;
      A524Tran_Detalle = "" ;
      A668Tran_UsuarioEliminaoAnula = "" ;
      A669Tran_FechaEliminaoAnula = GXutil.resetTime( GXutil.nullDate() );
      A670Tran_ObservacionesAnula = "" ;
      A384Tran_NombCuentadanteOrigen = "" ;
      A575Tran_NombreProveedor = "" ;
      A389Tran_NombCuentadanteDestino = "" ;
      A672Tran_NombreIngreso = "" ;
      A714Tran_EmailCuentadanteOrigen = "" ;
      A715Tran_EmailCuentadanteDestino = "" ;
      A720Tran_FechaResponsabilidad = GXutil.nullDate() ;
      A721Tran_NombreCuentadanteResponsa = "" ;
      A756Tran_Abreviado = "" ;
      A859Tran_EntidadGobierno = "" ;
      A49Tran_CodigoMovimiento = "" ;
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
      H00492_A416Tran_Observaciones = new String[] {""} ;
      H00492_n416Tran_Observaciones = new boolean[] {false} ;
      H00492_A49Tran_CodigoMovimiento = new String[] {""} ;
      H00492_A859Tran_EntidadGobierno = new String[] {""} ;
      H00492_n859Tran_EntidadGobierno = new boolean[] {false} ;
      H00492_A759Tran_CedulaResponsabilidad = new long[1] ;
      H00492_n759Tran_CedulaResponsabilidad = new boolean[] {false} ;
      H00492_A758Tran_TablaResponsabilidad = new short[1] ;
      H00492_n758Tran_TablaResponsabilidad = new boolean[] {false} ;
      H00492_A756Tran_Abreviado = new String[] {""} ;
      H00492_n756Tran_Abreviado = new boolean[] {false} ;
      H00492_A721Tran_NombreCuentadanteResponsa = new String[] {""} ;
      H00492_n721Tran_NombreCuentadanteResponsa = new boolean[] {false} ;
      H00492_A720Tran_FechaResponsabilidad = new java.util.Date[] {GXutil.nullDate()} ;
      H00492_n720Tran_FechaResponsabilidad = new boolean[] {false} ;
      H00492_A719Tran_TransaccResponsabilidad = new long[1] ;
      H00492_n719Tran_TransaccResponsabilidad = new boolean[] {false} ;
      H00492_A56Tran_IdCuentadanteResponsabili = new long[1] ;
      H00492_n56Tran_IdCuentadanteResponsabili = new boolean[] {false} ;
      H00492_A715Tran_EmailCuentadanteDestino = new String[] {""} ;
      H00492_n715Tran_EmailCuentadanteDestino = new boolean[] {false} ;
      H00492_A714Tran_EmailCuentadanteOrigen = new String[] {""} ;
      H00492_n714Tran_EmailCuentadanteOrigen = new boolean[] {false} ;
      H00492_A704Tran_CedulaCuentadanteDestino = new long[1] ;
      H00492_n704Tran_CedulaCuentadanteDestino = new boolean[] {false} ;
      H00492_A703Tran_CedulaProveedor = new long[1] ;
      H00492_n703Tran_CedulaProveedor = new boolean[] {false} ;
      H00492_A702Tran_CedulaCuentadanteOrigen = new long[1] ;
      H00492_n702Tran_CedulaCuentadanteOrigen = new boolean[] {false} ;
      H00492_A672Tran_NombreIngreso = new String[] {""} ;
      H00492_n672Tran_NombreIngreso = new boolean[] {false} ;
      H00492_A389Tran_NombCuentadanteDestino = new String[] {""} ;
      H00492_n389Tran_NombCuentadanteDestino = new boolean[] {false} ;
      H00492_A575Tran_NombreProveedor = new String[] {""} ;
      H00492_n575Tran_NombreProveedor = new boolean[] {false} ;
      H00492_A384Tran_NombCuentadanteOrigen = new String[] {""} ;
      H00492_n384Tran_NombCuentadanteOrigen = new boolean[] {false} ;
      H00492_A670Tran_ObservacionesAnula = new String[] {""} ;
      H00492_n670Tran_ObservacionesAnula = new boolean[] {false} ;
      H00492_A669Tran_FechaEliminaoAnula = new java.util.Date[] {GXutil.nullDate()} ;
      H00492_n669Tran_FechaEliminaoAnula = new boolean[] {false} ;
      H00492_A668Tran_UsuarioEliminaoAnula = new String[] {""} ;
      H00492_n668Tran_UsuarioEliminaoAnula = new boolean[] {false} ;
      H00492_A667Tran_NumeroGrupo = new short[1] ;
      H00492_n667Tran_NumeroGrupo = new boolean[] {false} ;
      H00492_A524Tran_Detalle = new String[] {""} ;
      H00492_n524Tran_Detalle = new boolean[] {false} ;
      H00492_A608Tran_RegionAbrevDestino = new String[] {""} ;
      H00492_n608Tran_RegionAbrevDestino = new boolean[] {false} ;
      H00492_A594Tran_RegionAbrev = new String[] {""} ;
      H00492_n594Tran_RegionAbrev = new boolean[] {false} ;
      H00492_A53Tran_IdProveedor = new long[1] ;
      H00492_n53Tran_IdProveedor = new boolean[] {false} ;
      H00492_A568Tran_CantidadPadres = new int[1] ;
      H00492_n568Tran_CantidadPadres = new boolean[] {false} ;
      H00492_A527Tran_TipoEntra = new String[] {""} ;
      H00492_n527Tran_TipoEntra = new boolean[] {false} ;
      H00492_A520Tran_RegionDescripcionDestino = new String[] {""} ;
      H00492_n520Tran_RegionDescripcionDestino = new boolean[] {false} ;
      H00492_A519Tran_RegionCodigoDestino = new short[1] ;
      H00492_n519Tran_RegionCodigoDestino = new boolean[] {false} ;
      H00492_A518Tran_RegionIdDestino = new long[1] ;
      H00492_n518Tran_RegionIdDestino = new boolean[] {false} ;
      H00492_A517Tran_CentroCostoDescripcionDes = new String[] {""} ;
      H00492_n517Tran_CentroCostoDescripcionDes = new boolean[] {false} ;
      H00492_A516Tran_CentroCostoCodigoDestino = new String[] {""} ;
      H00492_n516Tran_CentroCostoCodigoDestino = new boolean[] {false} ;
      H00492_A50Tran_CentroCostoIdDestino = new long[1] ;
      H00492_n50Tran_CentroCostoIdDestino = new boolean[] {false} ;
      H00492_A515Tran_FechaIngreso = new java.util.Date[] {GXutil.nullDate()} ;
      H00492_n515Tran_FechaIngreso = new boolean[] {false} ;
      H00492_A514Tran_NumeroIngreso = new String[] {""} ;
      H00492_n514Tran_NumeroIngreso = new boolean[] {false} ;
      H00492_A54Tran_TipoIngreso = new long[1] ;
      H00492_n54Tran_TipoIngreso = new boolean[] {false} ;
      H00492_A513Tran_ConsecutivoCC = new long[1] ;
      H00492_n513Tran_ConsecutivoCC = new boolean[] {false} ;
      H00492_A498Tran_NumeroLineas = new long[1] ;
      H00492_n498Tran_NumeroLineas = new boolean[] {false} ;
      H00492_A483Tran_ValorTransaccion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00492_n483Tran_ValorTransaccion = new boolean[] {false} ;
      H00492_A391Tran_UsuarioRatifica = new String[] {""} ;
      H00492_n391Tran_UsuarioRatifica = new boolean[] {false} ;
      H00492_A390Tran_FechaRatificacion = new java.util.Date[] {GXutil.nullDate()} ;
      H00492_n390Tran_FechaRatificacion = new boolean[] {false} ;
      H00492_A58Tran_Estado = new String[] {""} ;
      H00492_n58Tran_Estado = new boolean[] {false} ;
      H00492_A408Tran_CursoCodigo = new String[] {""} ;
      H00492_n408Tran_CursoCodigo = new boolean[] {false} ;
      H00492_A407Tran_AreadanteCodigo = new String[] {""} ;
      H00492_n407Tran_AreadanteCodigo = new boolean[] {false} ;
      H00492_A52Tran_IdCuentadanteDestino = new long[1] ;
      H00492_n52Tran_IdCuentadanteDestino = new boolean[] {false} ;
      H00492_A387Tran_CodBodeDestino = new String[] {""} ;
      H00492_A111Tran_CodAlmaDestino = new String[] {""} ;
      H00492_A385Tran_ModuloDestino = new String[] {""} ;
      H00492_A51Tran_IdCuentadanteOrigen = new long[1] ;
      H00492_n51Tran_IdCuentadanteOrigen = new boolean[] {false} ;
      H00492_A112Tran_CodBodeOrigen = new String[] {""} ;
      H00492_A109Tran_CodAlmaOrigen = new String[] {""} ;
      H00492_A110Tran_ModuloOrigen = new String[] {""} ;
      H00492_A422Tran_RegionDescripcion = new String[] {""} ;
      H00492_n422Tran_RegionDescripcion = new boolean[] {false} ;
      H00492_A421Tran_RegionCodigo = new short[1] ;
      H00492_n421Tran_RegionCodigo = new boolean[] {false} ;
      H00492_A57Tran_RegionId = new long[1] ;
      H00492_n57Tran_RegionId = new boolean[] {false} ;
      H00492_A420Tran_CentroCostoDescripcion = new String[] {""} ;
      H00492_n420Tran_CentroCostoDescripcion = new boolean[] {false} ;
      H00492_A419Tran_CentroCostoCodigo = new String[] {""} ;
      H00492_n419Tran_CentroCostoCodigo = new boolean[] {false} ;
      H00492_A48Tran_CentroCostoId = new long[1] ;
      H00492_A418Tran_UsuarioNombre = new String[] {""} ;
      H00492_n418Tran_UsuarioNombre = new boolean[] {false} ;
      H00492_A417Tran_UsuarioCodigo = new String[] {""} ;
      H00492_n417Tran_UsuarioCodigo = new boolean[] {false} ;
      H00492_A47Tran_UsuarioId = new long[1] ;
      H00492_n47Tran_UsuarioId = new boolean[] {false} ;
      H00492_A55Tran_FechaRegistro = new java.util.Date[] {GXutil.nullDate()} ;
      H00492_A46Tran_Id = new long[1] ;
      H00493_AGRID_nRecordCount = new long[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV10TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV9HTTPRequest = httpContext.getHttpRequest();
      AV11TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV8Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV7Tran_CodigoMovimiento = "" ;
      ROClassString = "" ;
      sImgUrl = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_tipo_movimientoalm_transaccionwc__default(),
         new Object[] {
             new Object[] {
            H00492_A416Tran_Observaciones, H00492_n416Tran_Observaciones, H00492_A49Tran_CodigoMovimiento, H00492_A859Tran_EntidadGobierno, H00492_n859Tran_EntidadGobierno, H00492_A759Tran_CedulaResponsabilidad, H00492_n759Tran_CedulaResponsabilidad, H00492_A758Tran_TablaResponsabilidad, H00492_n758Tran_TablaResponsabilidad, H00492_A756Tran_Abreviado,
            H00492_n756Tran_Abreviado, H00492_A721Tran_NombreCuentadanteResponsa, H00492_n721Tran_NombreCuentadanteResponsa, H00492_A720Tran_FechaResponsabilidad, H00492_n720Tran_FechaResponsabilidad, H00492_A719Tran_TransaccResponsabilidad, H00492_n719Tran_TransaccResponsabilidad, H00492_A56Tran_IdCuentadanteResponsabili, H00492_n56Tran_IdCuentadanteResponsabili, H00492_A715Tran_EmailCuentadanteDestino,
            H00492_n715Tran_EmailCuentadanteDestino, H00492_A714Tran_EmailCuentadanteOrigen, H00492_n714Tran_EmailCuentadanteOrigen, H00492_A704Tran_CedulaCuentadanteDestino, H00492_n704Tran_CedulaCuentadanteDestino, H00492_A703Tran_CedulaProveedor, H00492_n703Tran_CedulaProveedor, H00492_A702Tran_CedulaCuentadanteOrigen, H00492_n702Tran_CedulaCuentadanteOrigen, H00492_A672Tran_NombreIngreso,
            H00492_n672Tran_NombreIngreso, H00492_A389Tran_NombCuentadanteDestino, H00492_n389Tran_NombCuentadanteDestino, H00492_A575Tran_NombreProveedor, H00492_n575Tran_NombreProveedor, H00492_A384Tran_NombCuentadanteOrigen, H00492_n384Tran_NombCuentadanteOrigen, H00492_A670Tran_ObservacionesAnula, H00492_n670Tran_ObservacionesAnula, H00492_A669Tran_FechaEliminaoAnula,
            H00492_n669Tran_FechaEliminaoAnula, H00492_A668Tran_UsuarioEliminaoAnula, H00492_n668Tran_UsuarioEliminaoAnula, H00492_A667Tran_NumeroGrupo, H00492_n667Tran_NumeroGrupo, H00492_A524Tran_Detalle, H00492_n524Tran_Detalle, H00492_A608Tran_RegionAbrevDestino, H00492_n608Tran_RegionAbrevDestino, H00492_A594Tran_RegionAbrev,
            H00492_n594Tran_RegionAbrev, H00492_A53Tran_IdProveedor, H00492_n53Tran_IdProveedor, H00492_A568Tran_CantidadPadres, H00492_n568Tran_CantidadPadres, H00492_A527Tran_TipoEntra, H00492_n527Tran_TipoEntra, H00492_A520Tran_RegionDescripcionDestino, H00492_n520Tran_RegionDescripcionDestino, H00492_A519Tran_RegionCodigoDestino,
            H00492_n519Tran_RegionCodigoDestino, H00492_A518Tran_RegionIdDestino, H00492_n518Tran_RegionIdDestino, H00492_A517Tran_CentroCostoDescripcionDes, H00492_n517Tran_CentroCostoDescripcionDes, H00492_A516Tran_CentroCostoCodigoDestino, H00492_n516Tran_CentroCostoCodigoDestino, H00492_A50Tran_CentroCostoIdDestino, H00492_n50Tran_CentroCostoIdDestino, H00492_A515Tran_FechaIngreso,
            H00492_n515Tran_FechaIngreso, H00492_A514Tran_NumeroIngreso, H00492_n514Tran_NumeroIngreso, H00492_A54Tran_TipoIngreso, H00492_n54Tran_TipoIngreso, H00492_A513Tran_ConsecutivoCC, H00492_n513Tran_ConsecutivoCC, H00492_A498Tran_NumeroLineas, H00492_n498Tran_NumeroLineas, H00492_A483Tran_ValorTransaccion,
            H00492_n483Tran_ValorTransaccion, H00492_A391Tran_UsuarioRatifica, H00492_n391Tran_UsuarioRatifica, H00492_A390Tran_FechaRatificacion, H00492_n390Tran_FechaRatificacion, H00492_A58Tran_Estado, H00492_n58Tran_Estado, H00492_A408Tran_CursoCodigo, H00492_n408Tran_CursoCodigo, H00492_A407Tran_AreadanteCodigo,
            H00492_n407Tran_AreadanteCodigo, H00492_A52Tran_IdCuentadanteDestino, H00492_n52Tran_IdCuentadanteDestino, H00492_A387Tran_CodBodeDestino, H00492_A111Tran_CodAlmaDestino, H00492_A385Tran_ModuloDestino, H00492_A51Tran_IdCuentadanteOrigen, H00492_n51Tran_IdCuentadanteOrigen, H00492_A112Tran_CodBodeOrigen, H00492_A109Tran_CodAlmaOrigen,
            H00492_A110Tran_ModuloOrigen, H00492_A422Tran_RegionDescripcion, H00492_n422Tran_RegionDescripcion, H00492_A421Tran_RegionCodigo, H00492_n421Tran_RegionCodigo, H00492_A57Tran_RegionId, H00492_n57Tran_RegionId, H00492_A420Tran_CentroCostoDescripcion, H00492_n420Tran_CentroCostoDescripcion, H00492_A419Tran_CentroCostoCodigo,
            H00492_n419Tran_CentroCostoCodigo, H00492_A48Tran_CentroCostoId, H00492_A418Tran_UsuarioNombre, H00492_n418Tran_UsuarioNombre, H00492_A417Tran_UsuarioCodigo, H00492_n417Tran_UsuarioCodigo, H00492_A47Tran_UsuarioId, H00492_n47Tran_UsuarioId, H00492_A55Tran_FechaRegistro, H00492_A46Tran_Id
            }
            , new Object[] {
            H00493_AGRID_nRecordCount
            }
         }
      );
      AV17Pgmname = "ALM_TIPO_MOVIMIENTOALM_TRANSACCIONWC" ;
      /* GeneXus formulas. */
      AV17Pgmname = "ALM_TIPO_MOVIMIENTOALM_TRANSACCIONWC" ;
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
   private short A421Tran_RegionCodigo ;
   private short A519Tran_RegionCodigoDestino ;
   private short A667Tran_NumeroGrupo ;
   private short A758Tran_TablaResponsabilidad ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Allbackcolor ;
   private int A568Tran_CantidadPadres ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int edtTran_CodigoMovimiento_Visible ;
   private int edtTran_CodigoMovimiento_Enabled ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private long A46Tran_Id ;
   private long GRID_nFirstRecordOnPage ;
   private long A47Tran_UsuarioId ;
   private long A48Tran_CentroCostoId ;
   private long A57Tran_RegionId ;
   private long A51Tran_IdCuentadanteOrigen ;
   private long A52Tran_IdCuentadanteDestino ;
   private long A498Tran_NumeroLineas ;
   private long A513Tran_ConsecutivoCC ;
   private long A54Tran_TipoIngreso ;
   private long A50Tran_CentroCostoIdDestino ;
   private long A518Tran_RegionIdDestino ;
   private long A53Tran_IdProveedor ;
   private long A702Tran_CedulaCuentadanteOrigen ;
   private long A703Tran_CedulaProveedor ;
   private long A704Tran_CedulaCuentadanteDestino ;
   private long A56Tran_IdCuentadanteResponsabili ;
   private long A719Tran_TransaccResponsabilidad ;
   private long A759Tran_CedulaResponsabilidad ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal A483Tran_ValorTransaccion ;
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
   private String A58Tran_Estado ;
   private String edtTran_ConsecutivoCC_Link ;
   private String A514Tran_NumeroIngreso ;
   private String A527Tran_TipoEntra ;
   private String A524Tran_Detalle ;
   private String edtavUpdate_Link ;
   private String edtavDelete_Link ;
   private String edtTran_CodigoMovimiento_Internalname ;
   private String edtTran_CodigoMovimiento_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtTran_Id_Internalname ;
   private String edtTran_FechaRegistro_Internalname ;
   private String edtTran_UsuarioId_Internalname ;
   private String edtTran_UsuarioCodigo_Internalname ;
   private String edtTran_UsuarioNombre_Internalname ;
   private String edtTran_CentroCostoId_Internalname ;
   private String edtTran_CentroCostoCodigo_Internalname ;
   private String edtTran_CentroCostoDescripcion_Internalname ;
   private String edtTran_RegionId_Internalname ;
   private String edtTran_RegionCodigo_Internalname ;
   private String edtTran_RegionDescripcion_Internalname ;
   private String edtTran_ModuloOrigen_Internalname ;
   private String edtTran_CodAlmaOrigen_Internalname ;
   private String edtTran_CodBodeOrigen_Internalname ;
   private String edtTran_IdCuentadanteOrigen_Internalname ;
   private String edtTran_ModuloDestino_Internalname ;
   private String edtTran_CodAlmaDestino_Internalname ;
   private String edtTran_CodBodeDestino_Internalname ;
   private String edtTran_IdCuentadanteDestino_Internalname ;
   private String edtTran_Observaciones_Internalname ;
   private String edtTran_AreadanteCodigo_Internalname ;
   private String edtTran_CursoCodigo_Internalname ;
   private String edtTran_FechaRatificacion_Internalname ;
   private String edtTran_UsuarioRatifica_Internalname ;
   private String edtTran_ValorTransaccion_Internalname ;
   private String edtTran_NumeroLineas_Internalname ;
   private String edtTran_ConsecutivoCC_Internalname ;
   private String edtTran_NumeroIngreso_Internalname ;
   private String edtTran_FechaIngreso_Internalname ;
   private String edtTran_CentroCostoIdDestino_Internalname ;
   private String edtTran_CentroCostoCodigoDestino_Internalname ;
   private String edtTran_CentroCostoDescripcionDes_Internalname ;
   private String edtTran_RegionIdDestino_Internalname ;
   private String edtTran_RegionCodigoDestino_Internalname ;
   private String edtTran_RegionDescripcionDestino_Internalname ;
   private String edtTran_CantidadPadres_Internalname ;
   private String edtTran_IdProveedor_Internalname ;
   private String edtTran_RegionAbrev_Internalname ;
   private String edtTran_RegionAbrevDestino_Internalname ;
   private String edtTran_Detalle_Internalname ;
   private String edtTran_NumeroGrupo_Internalname ;
   private String edtTran_UsuarioEliminaoAnula_Internalname ;
   private String edtTran_FechaEliminaoAnula_Internalname ;
   private String edtTran_ObservacionesAnula_Internalname ;
   private String edtTran_NombCuentadanteOrigen_Internalname ;
   private String edtTran_NombreProveedor_Internalname ;
   private String edtTran_NombCuentadanteDestino_Internalname ;
   private String edtTran_NombreIngreso_Internalname ;
   private String edtTran_CedulaCuentadanteOrigen_Internalname ;
   private String edtTran_CedulaProveedor_Internalname ;
   private String edtTran_CedulaCuentadanteDestino_Internalname ;
   private String edtTran_EmailCuentadanteOrigen_Internalname ;
   private String edtTran_EmailCuentadanteDestino_Internalname ;
   private String edtTran_IdCuentadanteResponsabili_Internalname ;
   private String edtTran_TransaccResponsabilidad_Internalname ;
   private String edtTran_FechaResponsabilidad_Internalname ;
   private String edtTran_NombreCuentadanteResponsa_Internalname ;
   private String edtTran_Abreviado_Internalname ;
   private String edtTran_TablaResponsabilidad_Internalname ;
   private String edtTran_CedulaResponsabilidad_Internalname ;
   private String GXCCtl ;
   private String AV17Pgmname ;
   private String scmdbuf ;
   private String sCtrlAV7Tran_CodigoMovimiento ;
   private String sGXsfl_20_fel_idx="0001" ;
   private String ROClassString ;
   private String edtTran_Id_Jsonclick ;
   private String edtTran_FechaRegistro_Jsonclick ;
   private String edtTran_UsuarioId_Jsonclick ;
   private String edtTran_UsuarioCodigo_Jsonclick ;
   private String edtTran_UsuarioNombre_Jsonclick ;
   private String edtTran_CentroCostoId_Jsonclick ;
   private String edtTran_CentroCostoCodigo_Jsonclick ;
   private String edtTran_CentroCostoDescripcion_Jsonclick ;
   private String edtTran_RegionId_Jsonclick ;
   private String edtTran_RegionCodigo_Jsonclick ;
   private String edtTran_RegionDescripcion_Jsonclick ;
   private String edtTran_ModuloOrigen_Jsonclick ;
   private String edtTran_CodAlmaOrigen_Jsonclick ;
   private String edtTran_CodBodeOrigen_Jsonclick ;
   private String edtTran_IdCuentadanteOrigen_Jsonclick ;
   private String edtTran_ModuloDestino_Jsonclick ;
   private String edtTran_CodAlmaDestino_Jsonclick ;
   private String edtTran_CodBodeDestino_Jsonclick ;
   private String edtTran_IdCuentadanteDestino_Jsonclick ;
   private String edtTran_Observaciones_Jsonclick ;
   private String edtTran_AreadanteCodigo_Jsonclick ;
   private String edtTran_CursoCodigo_Jsonclick ;
   private String edtTran_FechaRatificacion_Jsonclick ;
   private String edtTran_UsuarioRatifica_Jsonclick ;
   private String edtTran_ValorTransaccion_Jsonclick ;
   private String edtTran_NumeroLineas_Jsonclick ;
   private String edtTran_ConsecutivoCC_Jsonclick ;
   private String edtTran_NumeroIngreso_Jsonclick ;
   private String edtTran_FechaIngreso_Jsonclick ;
   private String edtTran_CentroCostoIdDestino_Jsonclick ;
   private String edtTran_CentroCostoCodigoDestino_Jsonclick ;
   private String edtTran_CentroCostoDescripcionDes_Jsonclick ;
   private String edtTran_RegionIdDestino_Jsonclick ;
   private String edtTran_RegionCodigoDestino_Jsonclick ;
   private String edtTran_RegionDescripcionDestino_Jsonclick ;
   private String edtTran_CantidadPadres_Jsonclick ;
   private String edtTran_IdProveedor_Jsonclick ;
   private String edtTran_RegionAbrev_Jsonclick ;
   private String edtTran_RegionAbrevDestino_Jsonclick ;
   private String edtTran_Detalle_Jsonclick ;
   private String edtTran_NumeroGrupo_Jsonclick ;
   private String edtTran_UsuarioEliminaoAnula_Jsonclick ;
   private String edtTran_FechaEliminaoAnula_Jsonclick ;
   private String edtTran_ObservacionesAnula_Jsonclick ;
   private String edtTran_NombCuentadanteOrigen_Jsonclick ;
   private String edtTran_NombreProveedor_Jsonclick ;
   private String edtTran_NombCuentadanteDestino_Jsonclick ;
   private String edtTran_NombreIngreso_Jsonclick ;
   private String edtTran_CedulaCuentadanteOrigen_Jsonclick ;
   private String edtTran_CedulaProveedor_Jsonclick ;
   private String edtTran_CedulaCuentadanteDestino_Jsonclick ;
   private String edtTran_EmailCuentadanteOrigen_Jsonclick ;
   private String edtTran_EmailCuentadanteDestino_Jsonclick ;
   private String edtTran_IdCuentadanteResponsabili_Jsonclick ;
   private String edtTran_TransaccResponsabilidad_Jsonclick ;
   private String edtTran_FechaResponsabilidad_Jsonclick ;
   private String edtTran_NombreCuentadanteResponsa_Jsonclick ;
   private String edtTran_Abreviado_Jsonclick ;
   private String edtTran_TablaResponsabilidad_Jsonclick ;
   private String edtTran_CedulaResponsabilidad_Jsonclick ;
   private String sImgUrl ;
   private java.util.Date A55Tran_FechaRegistro ;
   private java.util.Date A390Tran_FechaRatificacion ;
   private java.util.Date A669Tran_FechaEliminaoAnula ;
   private java.util.Date A515Tran_FechaIngreso ;
   private java.util.Date A720Tran_FechaResponsabilidad ;
   private boolean entryPointCalled ;
   private boolean bGXsfl_20_Refreshing=false ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n47Tran_UsuarioId ;
   private boolean n417Tran_UsuarioCodigo ;
   private boolean n418Tran_UsuarioNombre ;
   private boolean n419Tran_CentroCostoCodigo ;
   private boolean n420Tran_CentroCostoDescripcion ;
   private boolean n57Tran_RegionId ;
   private boolean n421Tran_RegionCodigo ;
   private boolean n422Tran_RegionDescripcion ;
   private boolean n51Tran_IdCuentadanteOrigen ;
   private boolean n52Tran_IdCuentadanteDestino ;
   private boolean n416Tran_Observaciones ;
   private boolean n407Tran_AreadanteCodigo ;
   private boolean n408Tran_CursoCodigo ;
   private boolean n58Tran_Estado ;
   private boolean n390Tran_FechaRatificacion ;
   private boolean n391Tran_UsuarioRatifica ;
   private boolean n483Tran_ValorTransaccion ;
   private boolean n498Tran_NumeroLineas ;
   private boolean n513Tran_ConsecutivoCC ;
   private boolean n54Tran_TipoIngreso ;
   private boolean n514Tran_NumeroIngreso ;
   private boolean n515Tran_FechaIngreso ;
   private boolean n50Tran_CentroCostoIdDestino ;
   private boolean n516Tran_CentroCostoCodigoDestino ;
   private boolean n517Tran_CentroCostoDescripcionDes ;
   private boolean n518Tran_RegionIdDestino ;
   private boolean n519Tran_RegionCodigoDestino ;
   private boolean n520Tran_RegionDescripcionDestino ;
   private boolean n527Tran_TipoEntra ;
   private boolean n568Tran_CantidadPadres ;
   private boolean n53Tran_IdProveedor ;
   private boolean n594Tran_RegionAbrev ;
   private boolean n608Tran_RegionAbrevDestino ;
   private boolean n524Tran_Detalle ;
   private boolean n667Tran_NumeroGrupo ;
   private boolean n668Tran_UsuarioEliminaoAnula ;
   private boolean n669Tran_FechaEliminaoAnula ;
   private boolean n670Tran_ObservacionesAnula ;
   private boolean n384Tran_NombCuentadanteOrigen ;
   private boolean n575Tran_NombreProveedor ;
   private boolean n389Tran_NombCuentadanteDestino ;
   private boolean n672Tran_NombreIngreso ;
   private boolean n702Tran_CedulaCuentadanteOrigen ;
   private boolean n703Tran_CedulaProveedor ;
   private boolean n704Tran_CedulaCuentadanteDestino ;
   private boolean n714Tran_EmailCuentadanteOrigen ;
   private boolean n715Tran_EmailCuentadanteDestino ;
   private boolean n56Tran_IdCuentadanteResponsabili ;
   private boolean n719Tran_TransaccResponsabilidad ;
   private boolean n720Tran_FechaResponsabilidad ;
   private boolean n721Tran_NombreCuentadanteResponsa ;
   private boolean n756Tran_Abreviado ;
   private boolean n758Tran_TablaResponsabilidad ;
   private boolean n759Tran_CedulaResponsabilidad ;
   private boolean n859Tran_EntidadGobierno ;
   private boolean returnInSub ;
   private boolean AV12Update_IsBlob ;
   private boolean AV13Delete_IsBlob ;
   private String A416Tran_Observaciones ;
   private String wcpOAV7Tran_CodigoMovimiento ;
   private String AV7Tran_CodigoMovimiento ;
   private String A417Tran_UsuarioCodigo ;
   private String A418Tran_UsuarioNombre ;
   private String A419Tran_CentroCostoCodigo ;
   private String A420Tran_CentroCostoDescripcion ;
   private String A422Tran_RegionDescripcion ;
   private String A110Tran_ModuloOrigen ;
   private String A109Tran_CodAlmaOrigen ;
   private String A112Tran_CodBodeOrigen ;
   private String A385Tran_ModuloDestino ;
   private String A111Tran_CodAlmaDestino ;
   private String A387Tran_CodBodeDestino ;
   private String A407Tran_AreadanteCodigo ;
   private String A408Tran_CursoCodigo ;
   private String A391Tran_UsuarioRatifica ;
   private String A516Tran_CentroCostoCodigoDestino ;
   private String A517Tran_CentroCostoDescripcionDes ;
   private String A520Tran_RegionDescripcionDestino ;
   private String A594Tran_RegionAbrev ;
   private String A608Tran_RegionAbrevDestino ;
   private String A668Tran_UsuarioEliminaoAnula ;
   private String A670Tran_ObservacionesAnula ;
   private String A384Tran_NombCuentadanteOrigen ;
   private String A575Tran_NombreProveedor ;
   private String A389Tran_NombCuentadanteDestino ;
   private String A672Tran_NombreIngreso ;
   private String A714Tran_EmailCuentadanteOrigen ;
   private String A715Tran_EmailCuentadanteDestino ;
   private String A721Tran_NombreCuentadanteResponsa ;
   private String A756Tran_Abreviado ;
   private String A859Tran_EntidadGobierno ;
   private String A49Tran_CodigoMovimiento ;
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
   private HTMLChoice cmbTran_Estado ;
   private HTMLChoice cmbTran_TipoIngreso ;
   private HTMLChoice cmbTran_TipoEntra ;
   private HTMLChoice cmbTran_EntidadGobierno ;
   private IDataStoreProvider pr_default ;
   private String[] H00492_A416Tran_Observaciones ;
   private boolean[] H00492_n416Tran_Observaciones ;
   private String[] H00492_A49Tran_CodigoMovimiento ;
   private String[] H00492_A859Tran_EntidadGobierno ;
   private boolean[] H00492_n859Tran_EntidadGobierno ;
   private long[] H00492_A759Tran_CedulaResponsabilidad ;
   private boolean[] H00492_n759Tran_CedulaResponsabilidad ;
   private short[] H00492_A758Tran_TablaResponsabilidad ;
   private boolean[] H00492_n758Tran_TablaResponsabilidad ;
   private String[] H00492_A756Tran_Abreviado ;
   private boolean[] H00492_n756Tran_Abreviado ;
   private String[] H00492_A721Tran_NombreCuentadanteResponsa ;
   private boolean[] H00492_n721Tran_NombreCuentadanteResponsa ;
   private java.util.Date[] H00492_A720Tran_FechaResponsabilidad ;
   private boolean[] H00492_n720Tran_FechaResponsabilidad ;
   private long[] H00492_A719Tran_TransaccResponsabilidad ;
   private boolean[] H00492_n719Tran_TransaccResponsabilidad ;
   private long[] H00492_A56Tran_IdCuentadanteResponsabili ;
   private boolean[] H00492_n56Tran_IdCuentadanteResponsabili ;
   private String[] H00492_A715Tran_EmailCuentadanteDestino ;
   private boolean[] H00492_n715Tran_EmailCuentadanteDestino ;
   private String[] H00492_A714Tran_EmailCuentadanteOrigen ;
   private boolean[] H00492_n714Tran_EmailCuentadanteOrigen ;
   private long[] H00492_A704Tran_CedulaCuentadanteDestino ;
   private boolean[] H00492_n704Tran_CedulaCuentadanteDestino ;
   private long[] H00492_A703Tran_CedulaProveedor ;
   private boolean[] H00492_n703Tran_CedulaProveedor ;
   private long[] H00492_A702Tran_CedulaCuentadanteOrigen ;
   private boolean[] H00492_n702Tran_CedulaCuentadanteOrigen ;
   private String[] H00492_A672Tran_NombreIngreso ;
   private boolean[] H00492_n672Tran_NombreIngreso ;
   private String[] H00492_A389Tran_NombCuentadanteDestino ;
   private boolean[] H00492_n389Tran_NombCuentadanteDestino ;
   private String[] H00492_A575Tran_NombreProveedor ;
   private boolean[] H00492_n575Tran_NombreProveedor ;
   private String[] H00492_A384Tran_NombCuentadanteOrigen ;
   private boolean[] H00492_n384Tran_NombCuentadanteOrigen ;
   private String[] H00492_A670Tran_ObservacionesAnula ;
   private boolean[] H00492_n670Tran_ObservacionesAnula ;
   private java.util.Date[] H00492_A669Tran_FechaEliminaoAnula ;
   private boolean[] H00492_n669Tran_FechaEliminaoAnula ;
   private String[] H00492_A668Tran_UsuarioEliminaoAnula ;
   private boolean[] H00492_n668Tran_UsuarioEliminaoAnula ;
   private short[] H00492_A667Tran_NumeroGrupo ;
   private boolean[] H00492_n667Tran_NumeroGrupo ;
   private String[] H00492_A524Tran_Detalle ;
   private boolean[] H00492_n524Tran_Detalle ;
   private String[] H00492_A608Tran_RegionAbrevDestino ;
   private boolean[] H00492_n608Tran_RegionAbrevDestino ;
   private String[] H00492_A594Tran_RegionAbrev ;
   private boolean[] H00492_n594Tran_RegionAbrev ;
   private long[] H00492_A53Tran_IdProveedor ;
   private boolean[] H00492_n53Tran_IdProveedor ;
   private int[] H00492_A568Tran_CantidadPadres ;
   private boolean[] H00492_n568Tran_CantidadPadres ;
   private String[] H00492_A527Tran_TipoEntra ;
   private boolean[] H00492_n527Tran_TipoEntra ;
   private String[] H00492_A520Tran_RegionDescripcionDestino ;
   private boolean[] H00492_n520Tran_RegionDescripcionDestino ;
   private short[] H00492_A519Tran_RegionCodigoDestino ;
   private boolean[] H00492_n519Tran_RegionCodigoDestino ;
   private long[] H00492_A518Tran_RegionIdDestino ;
   private boolean[] H00492_n518Tran_RegionIdDestino ;
   private String[] H00492_A517Tran_CentroCostoDescripcionDes ;
   private boolean[] H00492_n517Tran_CentroCostoDescripcionDes ;
   private String[] H00492_A516Tran_CentroCostoCodigoDestino ;
   private boolean[] H00492_n516Tran_CentroCostoCodigoDestino ;
   private long[] H00492_A50Tran_CentroCostoIdDestino ;
   private boolean[] H00492_n50Tran_CentroCostoIdDestino ;
   private java.util.Date[] H00492_A515Tran_FechaIngreso ;
   private boolean[] H00492_n515Tran_FechaIngreso ;
   private String[] H00492_A514Tran_NumeroIngreso ;
   private boolean[] H00492_n514Tran_NumeroIngreso ;
   private long[] H00492_A54Tran_TipoIngreso ;
   private boolean[] H00492_n54Tran_TipoIngreso ;
   private long[] H00492_A513Tran_ConsecutivoCC ;
   private boolean[] H00492_n513Tran_ConsecutivoCC ;
   private long[] H00492_A498Tran_NumeroLineas ;
   private boolean[] H00492_n498Tran_NumeroLineas ;
   private java.math.BigDecimal[] H00492_A483Tran_ValorTransaccion ;
   private boolean[] H00492_n483Tran_ValorTransaccion ;
   private String[] H00492_A391Tran_UsuarioRatifica ;
   private boolean[] H00492_n391Tran_UsuarioRatifica ;
   private java.util.Date[] H00492_A390Tran_FechaRatificacion ;
   private boolean[] H00492_n390Tran_FechaRatificacion ;
   private String[] H00492_A58Tran_Estado ;
   private boolean[] H00492_n58Tran_Estado ;
   private String[] H00492_A408Tran_CursoCodigo ;
   private boolean[] H00492_n408Tran_CursoCodigo ;
   private String[] H00492_A407Tran_AreadanteCodigo ;
   private boolean[] H00492_n407Tran_AreadanteCodigo ;
   private long[] H00492_A52Tran_IdCuentadanteDestino ;
   private boolean[] H00492_n52Tran_IdCuentadanteDestino ;
   private String[] H00492_A387Tran_CodBodeDestino ;
   private String[] H00492_A111Tran_CodAlmaDestino ;
   private String[] H00492_A385Tran_ModuloDestino ;
   private long[] H00492_A51Tran_IdCuentadanteOrigen ;
   private boolean[] H00492_n51Tran_IdCuentadanteOrigen ;
   private String[] H00492_A112Tran_CodBodeOrigen ;
   private String[] H00492_A109Tran_CodAlmaOrigen ;
   private String[] H00492_A110Tran_ModuloOrigen ;
   private String[] H00492_A422Tran_RegionDescripcion ;
   private boolean[] H00492_n422Tran_RegionDescripcion ;
   private short[] H00492_A421Tran_RegionCodigo ;
   private boolean[] H00492_n421Tran_RegionCodigo ;
   private long[] H00492_A57Tran_RegionId ;
   private boolean[] H00492_n57Tran_RegionId ;
   private String[] H00492_A420Tran_CentroCostoDescripcion ;
   private boolean[] H00492_n420Tran_CentroCostoDescripcion ;
   private String[] H00492_A419Tran_CentroCostoCodigo ;
   private boolean[] H00492_n419Tran_CentroCostoCodigo ;
   private long[] H00492_A48Tran_CentroCostoId ;
   private String[] H00492_A418Tran_UsuarioNombre ;
   private boolean[] H00492_n418Tran_UsuarioNombre ;
   private String[] H00492_A417Tran_UsuarioCodigo ;
   private boolean[] H00492_n417Tran_UsuarioCodigo ;
   private long[] H00492_A47Tran_UsuarioId ;
   private boolean[] H00492_n47Tran_UsuarioId ;
   private java.util.Date[] H00492_A55Tran_FechaRegistro ;
   private long[] H00492_A46Tran_Id ;
   private long[] H00493_AGRID_nRecordCount ;
   private com.genexus.webpanels.WebSession AV8Session ;
   private com.orions2.SdtTransactionContext AV10TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV11TrnContextAtt ;
}

final  class alm_tipo_movimientoalm_transaccionwc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00492", "SELECT T1.Tran_Observaciones, T1.Tran_CodigoMovimiento, T1.Tran_EntidadGobierno, T2.Cuen_Cedula AS Tran_CedulaResponsabilidad, T1.Tran_TablaResponsabilidad, T6.Orig_Descripcion_Abreviado AS Tran_Abreviado, T2.Cuen_Nombre AS Tran_NombreCuentadanteResponsa, T1.Tran_FechaResponsabilidad, T1.Tran_TransaccResponsabilidad, T1.Tran_IdCuentadanteResponsabili AS Tran_IdCuentadanteResponsabili, T7.Cuen_Email AS Tran_EmailCuentadanteDestino, T8.Cuen_Email AS Tran_EmailCuentadanteOrigen, T7.Cuen_Cedula AS Tran_CedulaCuentadanteDestino, T3.Cuen_Cedula AS Tran_CedulaProveedor, T8.Cuen_Cedula AS Tran_CedulaCuentadanteOrigen, T6.Orig_Descripcion AS Tran_NombreIngreso, T7.Cuen_Nombre AS Tran_NombCuentadanteDestino, T3.Cuen_Nombre AS Tran_NombreProveedor, T8.Cuen_Nombre AS Tran_NombCuentadanteOrigen, T1.Tran_ObservacionesAnula, T1.Tran_FechaEliminaoAnula, T1.Tran_UsuarioEliminaoAnula, T1.Tran_NumeroGrupo, T1.Tran_Detalle, T4.Regi_Abrev AS Tran_RegionAbrevDestino, T9.Regi_Abrev AS Tran_RegionAbrev, T1.Tran_IdProveedor AS Tran_IdProveedor, T1.Tran_CantidadPadres, T1.Tran_TipoEntra, T4.Regi_Descripcion AS Tran_RegionDescripcionDestino, T4.Regi_Cod AS Tran_RegionCodigoDestino, T1.Tran_RegionIdDestino AS Tran_RegionIdDestino, T5.Cent_Descripcion AS Tran_CentroCostoDescripcionDes, T5.Cent_Codigo AS Tran_CentroCostoCodigoDestino, T1.Tran_CentroCostoIdDestino AS Tran_CentroCostoIdDestino, T1.Tran_FechaIngreso, T1.Tran_NumeroIngreso, T1.Tran_TipoIngreso AS Tran_TipoIngreso, T1.Tran_ConsecutivoCC, T1.Tran_NumeroLineas, T1.Tran_ValorTransaccion, T1.Tran_UsuarioRatifica, T1.Tran_FechaRatificacion, T1.Tran_Estado, T1.Tran_CursoCodigo, T1.Tran_AreadanteCodigo, T1.Tran_IdCuentadanteDestino AS Tran_IdCuentadanteDestino, T1.Tran_CodBodeDestino, T1.Tran_CodAlmaDestino, T1.Tran_ModuloDestino, T1.Tran_IdCuentadanteOrigen AS Tran_IdCuentadanteOrigen, T1.Tran_CodBodeOrigen, T1.Tran_CodAlmaOrigen, T1.Tran_ModuloOrigen, T9.Regi_Descripcion AS Tran_RegionDescripcion, T9.Regi_Cod AS Tran_RegionCodigo, T1.Tran_RegionId AS Tran_RegionId, T10.Cent_Descripcion AS Tran_CentroCostoDescripcion, T10.Cent_Codigo AS Tran_CentroCostoCodigo, T1.Tran_CentroCostoId AS Tran_CentroCostoId, T11.Usua_Nombre AS Tran_UsuarioNombre, T11.Usua_Codigo AS Tran_UsuarioCodigo, T1.Tran_UsuarioId AS Tran_UsuarioId, T1.Tran_FechaRegistro, T1.Tran_Id FROM ((((((((((ALM_TRANSACCION T1 LEFT JOIN ALM_CUENTADANTE T2 ON T2.Cuen_Identificacion = T1.Tran_IdCuentadanteResponsabili) LEFT JOIN ALM_CUENTADANTE T3 ON T3.Cuen_Identificacion = T1.Tran_IdProveedor) LEFT JOIN GEN_REGIONAL T4 ON T4.Regi_Id = T1.Tran_RegionIdDestino) LEFT JOIN GEN_CENTROCOSTO T5 ON T5.Cent_Id = T1.Tran_CentroCostoIdDestino) LEFT JOIN ALM_ORIGEN_BIENES T6 ON T6.Orig_Identificador = T1.Tran_TipoIngreso) LEFT JOIN ALM_CUENTADANTE T7 ON T7.Cuen_Identificacion = T1.Tran_IdCuentadanteDestino) LEFT JOIN ALM_CUENTADANTE T8 ON T8.Cuen_Identificacion = T1.Tran_IdCuentadanteOrigen) LEFT JOIN GEN_REGIONAL T9 ON T9.Regi_Id = T1.Tran_RegionId) INNER JOIN GEN_CENTROCOSTO T10 ON T10.Cent_Id = T1.Tran_CentroCostoId) LEFT JOIN SEG_USUARIO T11 ON T11.Usua_Id = T1.Tran_UsuarioId) WHERE T1.Tran_CodigoMovimiento = ? ORDER BY T1.Tran_CodigoMovimiento  OFFSET ? ROWS FETCH NEXT (CASE WHEN ? > 0 THEN ? ELSE 1e9 END) ROWS ONLY",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H00493", "SELECT COUNT(*) FROM ((((((((((ALM_TRANSACCION T1 LEFT JOIN ALM_CUENTADANTE T10 ON T10.Cuen_Identificacion = T1.Tran_IdCuentadanteResponsabili) LEFT JOIN ALM_CUENTADANTE T8 ON T8.Cuen_Identificacion = T1.Tran_IdProveedor) LEFT JOIN GEN_REGIONAL T6 ON T6.Regi_Id = T1.Tran_RegionIdDestino) LEFT JOIN GEN_CENTROCOSTO T4 ON T4.Cent_Id = T1.Tran_CentroCostoIdDestino) LEFT JOIN ALM_ORIGEN_BIENES T11 ON T11.Orig_Identificador = T1.Tran_TipoIngreso) LEFT JOIN ALM_CUENTADANTE T9 ON T9.Cuen_Identificacion = T1.Tran_IdCuentadanteDestino) LEFT JOIN ALM_CUENTADANTE T7 ON T7.Cuen_Identificacion = T1.Tran_IdCuentadanteOrigen) LEFT JOIN GEN_REGIONAL T5 ON T5.Regi_Id = T1.Tran_RegionId) INNER JOIN GEN_CENTROCOSTO T3 ON T3.Cent_Id = T1.Tran_CentroCostoId) LEFT JOIN SEG_USUARIO T2 ON T2.Usua_Id = T1.Tran_UsuarioId) WHERE T1.Tran_CodigoMovimiento = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((long[]) buf[15])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((long[]) buf[17])[0] = rslt.getLong(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((long[]) buf[23])[0] = rslt.getLong(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((long[]) buf[25])[0] = rslt.getLong(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((long[]) buf[27])[0] = rslt.getLong(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[39])[0] = rslt.getGXDateTime(21) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((short[]) buf[43])[0] = rslt.getShort(23) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 1) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((long[]) buf[51])[0] = rslt.getLong(27) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((int[]) buf[53])[0] = rslt.getInt(28) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 4) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getVarchar(30) ;
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((short[]) buf[59])[0] = rslt.getShort(31) ;
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((long[]) buf[61])[0] = rslt.getLong(32) ;
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getVarchar(33) ;
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getVarchar(34) ;
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((long[]) buf[67])[0] = rslt.getLong(35) ;
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[69])[0] = rslt.getGXDate(36) ;
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(37, 30) ;
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((long[]) buf[73])[0] = rslt.getLong(38) ;
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((long[]) buf[75])[0] = rslt.getLong(39) ;
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((long[]) buf[77])[0] = rslt.getLong(40) ;
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[79])[0] = rslt.getBigDecimal(41,2) ;
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((String[]) buf[81])[0] = rslt.getVarchar(42) ;
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[83])[0] = rslt.getGXDateTime(43) ;
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getString(44, 1) ;
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getVarchar(45) ;
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getVarchar(46) ;
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((long[]) buf[91])[0] = rslt.getLong(47) ;
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((String[]) buf[93])[0] = rslt.getVarchar(48) ;
               ((String[]) buf[94])[0] = rslt.getVarchar(49) ;
               ((String[]) buf[95])[0] = rslt.getVarchar(50) ;
               ((long[]) buf[96])[0] = rslt.getLong(51) ;
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((String[]) buf[98])[0] = rslt.getVarchar(52) ;
               ((String[]) buf[99])[0] = rslt.getVarchar(53) ;
               ((String[]) buf[100])[0] = rslt.getVarchar(54) ;
               ((String[]) buf[101])[0] = rslt.getVarchar(55) ;
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((short[]) buf[103])[0] = rslt.getShort(56) ;
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               ((long[]) buf[105])[0] = rslt.getLong(57) ;
               ((boolean[]) buf[106])[0] = rslt.wasNull();
               ((String[]) buf[107])[0] = rslt.getVarchar(58) ;
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((String[]) buf[109])[0] = rslt.getVarchar(59) ;
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((long[]) buf[111])[0] = rslt.getLong(60) ;
               ((String[]) buf[112])[0] = rslt.getVarchar(61) ;
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((String[]) buf[114])[0] = rslt.getVarchar(62) ;
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((long[]) buf[116])[0] = rslt.getLong(63) ;
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[118])[0] = rslt.getGXDateTime(64) ;
               ((long[]) buf[119])[0] = rslt.getLong(65) ;
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
               stmt.setVarchar(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 3);
               return;
      }
   }

}

