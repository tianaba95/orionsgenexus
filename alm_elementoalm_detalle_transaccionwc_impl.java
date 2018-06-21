/*
               File: alm_elementoalm_detalle_transaccionwc_impl
        Description: ALM_ELEMENTOALM_DETALLE_TRANSACCIONWC
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:14:59.71
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

public final  class alm_elementoalm_detalle_transaccionwc_impl extends GXWebComponent
{
   public alm_elementoalm_detalle_transaccionwc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_elementoalm_detalle_transaccionwc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_elementoalm_detalle_transaccionwc_impl.class ));
   }

   public alm_elementoalm_detalle_transaccionwc_impl( int remoteHandle ,
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
      cmbTran_IndE_S = new HTMLChoice();
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
               AV7Elem_Consecutivo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Elem_Consecutivo", AV7Elem_Consecutivo);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV7Elem_Consecutivo});
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
               AV7Elem_Consecutivo = httpContext.GetNextPar( ) ;
               AV12Update = httpContext.GetNextPar( ) ;
               edtavUpdate_Tooltiptext = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_20_Refreshing);
               AV13Delete = httpContext.GetNextPar( ) ;
               edtavDelete_Tooltiptext = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "Tooltiptext", edtavDelete_Tooltiptext, !bGXsfl_20_Refreshing);
               A46Tran_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               A69TDet_Consecutivo = GXutil.lval( httpContext.GetNextPar( )) ;
               sPrefix = httpContext.GetNextPar( ) ;
               init_default_properties( ) ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxgrgrid_refresh( subGrid_Rows, AV7Elem_Consecutivo, AV12Update, AV13Delete, A46Tran_Id, A69TDet_Consecutivo, sPrefix) ;
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
         pa4F2( ) ;
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
         httpContext.writeValue( "ALM_ELEMENTOALM_DETALLE_TRANSACCIONWC") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414145978");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_elementoalm_detalle_transaccionwc") + "?" + GXutil.URLEncode(GXutil.rtrim(AV7Elem_Consecutivo))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7Elem_Consecutivo", wcpOAV7Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vELEM_CONSECUTIVO", AV7Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUPDATE_Tooltiptext", GXutil.rtrim( edtavUpdate_Tooltiptext));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDELETE_Tooltiptext", GXutil.rtrim( edtavDelete_Tooltiptext));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm4F2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("alm_elementoalm_detalle_transaccionwc.js", "?201861414145980");
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
      return "ALM_ELEMENTOALM_DETALLE_TRANSACCIONWC" ;
   }

   public String getPgmdesc( )
   {
      return "ALM_ELEMENTOALM_DETALLE_TRANSACCIONWC" ;
   }

   public void wb4F0( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.alm_elementoalm_detalle_transaccionwc");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 20, 2, 0)+","+"null"+");", "Agregar", bttBtninsert_Jsonclick, 5, "Agregar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_ELEMENTOALM_DETALLE_TRANSACCIONWC.htm");
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
            httpContext.writeValue( "Item") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cantidad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Unitario") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Total") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Placa") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Observaciones") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Padre") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "es Padre") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "TDet_Atributos") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Presente") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Futuro") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Taza") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "N") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Costos") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Grupo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Indicador Entrada/Salida") ;
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
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A69TDet_Consecutivo, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A487TDet_Cantidad, (byte)(10), (byte)(0), ".", "")));
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtTDet_Cantidad_Link));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A488TDet_ValorUnitario, (byte)(22), (byte)(2), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A489TDet_ValorTotal, (byte)(22), (byte)(2), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A490TDet_PlacaNumero);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A504TDet_Observaciones);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A491TDet_PlacaPadre);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A505TDet_EsPadre);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A525TDet_Atributos);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A653TDet_Valor_Presente, (byte)(24), (byte)(2), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A654TDet_Valor_Futuro, (byte)(24), (byte)(2), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A655TDet_Taza, (byte)(3), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A656TDet_Plazo_N, (byte)(2), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A657TDet_Otros_Costos, (byte)(24), (byte)(2), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A658TDet_Agrupado, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A481Tran_IndE_S);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV12Update));
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtavUpdate_Link));
            GridColumn.AddObjectProperty("Tooltiptext", GXutil.rtrim( edtavUpdate_Tooltiptext));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV13Delete));
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtElem_Consecutivo_Internalname, "Consecutivo", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtElem_Consecutivo_Internalname, A66Elem_Consecutivo, GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtElem_Consecutivo_Jsonclick, 0, "Attribute", "", "", "", edtElem_Consecutivo_Visible, edtElem_Consecutivo_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_ELEMENTOALM_DETALLE_TRANSACCIONWC.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start4F2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "ALM_ELEMENTOALM_DETALLE_TRANSACCIONWC", (short)(0)) ;
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
            strup4F0( ) ;
         }
      }
   }

   public void ws4F2( )
   {
      start4F2( ) ;
      evt4F2( ) ;
   }

   public void evt4F2( )
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
                              strup4F0( ) ;
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
                              strup4F0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoInsert' */
                                 e114F2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup4F0( ) ;
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
                              strup4F0( ) ;
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
                              strup4F0( ) ;
                           }
                           nGXsfl_20_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_20_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_20_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_202( ) ;
                           A46Tran_Id = localUtil.ctol( httpContext.cgiGet( edtTran_Id_Internalname), ",", ".") ;
                           A69TDet_Consecutivo = localUtil.ctol( httpContext.cgiGet( edtTDet_Consecutivo_Internalname), ",", ".") ;
                           A487TDet_Cantidad = localUtil.ctol( httpContext.cgiGet( edtTDet_Cantidad_Internalname), ",", ".") ;
                           A488TDet_ValorUnitario = localUtil.ctond( httpContext.cgiGet( edtTDet_ValorUnitario_Internalname)) ;
                           A489TDet_ValorTotal = localUtil.ctond( httpContext.cgiGet( edtTDet_ValorTotal_Internalname)) ;
                           A490TDet_PlacaNumero = httpContext.cgiGet( edtTDet_PlacaNumero_Internalname) ;
                           n490TDet_PlacaNumero = false ;
                           A504TDet_Observaciones = httpContext.cgiGet( edtTDet_Observaciones_Internalname) ;
                           n504TDet_Observaciones = false ;
                           A491TDet_PlacaPadre = httpContext.cgiGet( edtTDet_PlacaPadre_Internalname) ;
                           n491TDet_PlacaPadre = false ;
                           A505TDet_EsPadre = httpContext.cgiGet( edtTDet_EsPadre_Internalname) ;
                           A525TDet_Atributos = httpContext.cgiGet( edtTDet_Atributos_Internalname) ;
                           A653TDet_Valor_Presente = localUtil.ctond( httpContext.cgiGet( edtTDet_Valor_Presente_Internalname)) ;
                           n653TDet_Valor_Presente = false ;
                           A654TDet_Valor_Futuro = localUtil.ctond( httpContext.cgiGet( edtTDet_Valor_Futuro_Internalname)) ;
                           n654TDet_Valor_Futuro = false ;
                           A655TDet_Taza = (short)(localUtil.ctol( httpContext.cgiGet( edtTDet_Taza_Internalname), ",", ".")) ;
                           n655TDet_Taza = false ;
                           A656TDet_Plazo_N = (byte)(localUtil.ctol( httpContext.cgiGet( edtTDet_Plazo_N_Internalname), ",", ".")) ;
                           n656TDet_Plazo_N = false ;
                           A657TDet_Otros_Costos = localUtil.ctond( httpContext.cgiGet( edtTDet_Otros_Costos_Internalname)) ;
                           n657TDet_Otros_Costos = false ;
                           A658TDet_Agrupado = (short)(localUtil.ctol( httpContext.cgiGet( edtTDet_Agrupado_Internalname), ",", ".")) ;
                           n658TDet_Agrupado = false ;
                           cmbTran_IndE_S.setName( cmbTran_IndE_S.getInternalname() );
                           cmbTran_IndE_S.setValue( httpContext.cgiGet( cmbTran_IndE_S.getInternalname()) );
                           A481Tran_IndE_S = httpContext.cgiGet( cmbTran_IndE_S.getInternalname()) ;
                           n481Tran_IndE_S = false ;
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
                                       e124F2 ();
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
                                       e134F2 ();
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
                                    strup4F0( ) ;
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

   public void we4F2( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm4F2( ) ;
         }
      }
   }

   public void pa4F2( )
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
         GXCCtl = "TRAN_INDE_S_" + sGXsfl_20_idx ;
         cmbTran_IndE_S.setName( GXCCtl );
         cmbTran_IndE_S.setWebtags( "" );
         cmbTran_IndE_S.addItem("E", "ENTRADA", (short)(0));
         cmbTran_IndE_S.addItem("S", "SALIDA", (short)(0));
         cmbTran_IndE_S.addItem("T", "TRASPASO", (short)(0));
         cmbTran_IndE_S.addItem("R", "RECUPERACIÓN", (short)(0));
         if ( cmbTran_IndE_S.getItemCount() > 0 )
         {
            A481Tran_IndE_S = cmbTran_IndE_S.getValidValue(A481Tran_IndE_S) ;
            n481Tran_IndE_S = false ;
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
                                 String AV7Elem_Consecutivo ,
                                 String AV12Update ,
                                 String AV13Delete ,
                                 long A46Tran_Id ,
                                 long A69TDet_Consecutivo ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid_Rows = subGrid_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID_nCurrentRecord = 0 ;
      rf4F2( ) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_ID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A46Tran_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_ID", GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_CONSECUTIVO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A69TDet_Consecutivo), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TDET_CONSECUTIVO", GXutil.ltrim( localUtil.ntoc( A69TDet_Consecutivo, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_VALORUNITARIO", getSecureSignedToken( sPrefix, localUtil.format( A488TDet_ValorUnitario, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TDET_VALORUNITARIO", GXutil.ltrim( localUtil.ntoc( A488TDet_ValorUnitario, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_VALORTOTAL", getSecureSignedToken( sPrefix, localUtil.format( A489TDet_ValorTotal, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TDET_VALORTOTAL", GXutil.ltrim( localUtil.ntoc( A489TDet_ValorTotal, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_PLACANUMERO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A490TDet_PlacaNumero, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TDET_PLACANUMERO", A490TDet_PlacaNumero);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_OBSERVACIONES", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A504TDet_Observaciones, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TDET_OBSERVACIONES", A504TDet_Observaciones);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_PLACAPADRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A491TDet_PlacaPadre, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TDET_PLACAPADRE", A491TDet_PlacaPadre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_ESPADRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A505TDet_EsPadre, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TDET_ESPADRE", A505TDet_EsPadre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_ATRIBUTOS", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A525TDet_Atributos, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TDET_ATRIBUTOS", A525TDet_Atributos);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_VALOR_PRESENTE", getSecureSignedToken( sPrefix, localUtil.format( A653TDet_Valor_Presente, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TDET_VALOR_PRESENTE", GXutil.ltrim( localUtil.ntoc( A653TDet_Valor_Presente, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_VALOR_FUTURO", getSecureSignedToken( sPrefix, localUtil.format( A654TDet_Valor_Futuro, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TDET_VALOR_FUTURO", GXutil.ltrim( localUtil.ntoc( A654TDet_Valor_Futuro, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_TAZA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A655TDet_Taza), "ZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TDET_TAZA", GXutil.ltrim( localUtil.ntoc( A655TDet_Taza, (byte)(3), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_PLAZO_N", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A656TDet_Plazo_N), "Z9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TDET_PLAZO_N", GXutil.ltrim( localUtil.ntoc( A656TDet_Plazo_N, (byte)(2), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_OTROS_COSTOS", getSecureSignedToken( sPrefix, localUtil.format( A657TDet_Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TDET_OTROS_COSTOS", GXutil.ltrim( localUtil.ntoc( A657TDet_Otros_Costos, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_AGRUPADO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A658TDet_Agrupado), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TDET_AGRUPADO", GXutil.ltrim( localUtil.ntoc( A658TDet_Agrupado, (byte)(4), (byte)(0), ".", "")));
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf4F2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV17Pgmname = "ALM_ELEMENTOALM_DETALLE_TRANSACCIONWC" ;
      Gx_err = (short)(0) ;
   }

   public void rf4F2( )
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
         /* Using cursor H004F2 */
         pr_default.execute(0, new Object[] {AV7Elem_Consecutivo, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_20_idx = (short)(1) ;
         sGXsfl_20_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_20_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_202( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_recordsperpage( ) ) ) ) )
         {
            A66Elem_Consecutivo = H004F2_A66Elem_Consecutivo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
            A481Tran_IndE_S = H004F2_A481Tran_IndE_S[0] ;
            n481Tran_IndE_S = H004F2_n481Tran_IndE_S[0] ;
            A658TDet_Agrupado = H004F2_A658TDet_Agrupado[0] ;
            n658TDet_Agrupado = H004F2_n658TDet_Agrupado[0] ;
            A657TDet_Otros_Costos = H004F2_A657TDet_Otros_Costos[0] ;
            n657TDet_Otros_Costos = H004F2_n657TDet_Otros_Costos[0] ;
            A656TDet_Plazo_N = H004F2_A656TDet_Plazo_N[0] ;
            n656TDet_Plazo_N = H004F2_n656TDet_Plazo_N[0] ;
            A655TDet_Taza = H004F2_A655TDet_Taza[0] ;
            n655TDet_Taza = H004F2_n655TDet_Taza[0] ;
            A654TDet_Valor_Futuro = H004F2_A654TDet_Valor_Futuro[0] ;
            n654TDet_Valor_Futuro = H004F2_n654TDet_Valor_Futuro[0] ;
            A653TDet_Valor_Presente = H004F2_A653TDet_Valor_Presente[0] ;
            n653TDet_Valor_Presente = H004F2_n653TDet_Valor_Presente[0] ;
            A525TDet_Atributos = H004F2_A525TDet_Atributos[0] ;
            A505TDet_EsPadre = H004F2_A505TDet_EsPadre[0] ;
            A491TDet_PlacaPadre = H004F2_A491TDet_PlacaPadre[0] ;
            n491TDet_PlacaPadre = H004F2_n491TDet_PlacaPadre[0] ;
            A504TDet_Observaciones = H004F2_A504TDet_Observaciones[0] ;
            n504TDet_Observaciones = H004F2_n504TDet_Observaciones[0] ;
            A490TDet_PlacaNumero = H004F2_A490TDet_PlacaNumero[0] ;
            n490TDet_PlacaNumero = H004F2_n490TDet_PlacaNumero[0] ;
            A489TDet_ValorTotal = H004F2_A489TDet_ValorTotal[0] ;
            A488TDet_ValorUnitario = H004F2_A488TDet_ValorUnitario[0] ;
            A487TDet_Cantidad = H004F2_A487TDet_Cantidad[0] ;
            A69TDet_Consecutivo = H004F2_A69TDet_Consecutivo[0] ;
            A46Tran_Id = H004F2_A46Tran_Id[0] ;
            A481Tran_IndE_S = H004F2_A481Tran_IndE_S[0] ;
            n481Tran_IndE_S = H004F2_n481Tran_IndE_S[0] ;
            e134F2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(20) ;
         wb4F0( ) ;
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
      /* Using cursor H004F3 */
      pr_default.execute(1, new Object[] {AV7Elem_Consecutivo});
      GRID_nRecordCount = H004F3_AGRID_nRecordCount[0] ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Elem_Consecutivo, AV12Update, AV13Delete, A46Tran_Id, A69TDet_Consecutivo, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Elem_Consecutivo, AV12Update, AV13Delete, A46Tran_Id, A69TDet_Consecutivo, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Elem_Consecutivo, AV12Update, AV13Delete, A46Tran_Id, A69TDet_Consecutivo, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Elem_Consecutivo, AV12Update, AV13Delete, A46Tran_Id, A69TDet_Consecutivo, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Elem_Consecutivo, AV12Update, AV13Delete, A46Tran_Id, A69TDet_Consecutivo, sPrefix) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup4F0( )
   {
      /* Before Start, stand alone formulas. */
      AV17Pgmname = "ALM_ELEMENTOALM_DETALLE_TRANSACCIONWC" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e124F2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A66Elem_Consecutivo = httpContext.cgiGet( edtElem_Consecutivo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
         /* Read saved values. */
         nRC_GXsfl_20 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_20"), ",", ".")) ;
         wcpOAV7Elem_Consecutivo = httpContext.cgiGet( sPrefix+"wcpOAV7Elem_Consecutivo") ;
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
      e124F2 ();
      if (returnInSub) return;
   }

   public void e124F2( )
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
      edtElem_Consecutivo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtElem_Consecutivo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtElem_Consecutivo_Visible, 5, 0)), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
   }

   private void e134F2( )
   {
      /* Grid_Load Routine */
      edtavUpdate_Link = formatLink("com.orions2.alm_detalle_transaccion") + "?" + GXutil.URLEncode(GXutil.rtrim("UPD")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A46Tran_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A69TDet_Consecutivo,18,0))) ;
      edtTDet_Cantidad_Link = formatLink("com.orions2.viewalm_detalle_transaccion") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A46Tran_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A69TDet_Consecutivo,18,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
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

   public void e114F2( )
   {
      /* 'DoInsert' Routine */
      callWebObject(formatLink("com.orions2.alm_detalle_transaccion") + "?" + GXutil.URLEncode(GXutil.rtrim("INS")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))));
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV10TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV17Pgmname );
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerondelete( true );
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV9HTTPRequest.getScriptName()+"?"+AV9HTTPRequest.getQuerystring() );
      AV10TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_DETALLE_TRANSACCION" );
      AV11TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV11TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Elem_Consecutivo" );
      AV11TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( AV7Elem_Consecutivo );
      AV10TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV11TrnContextAtt, 0);
      AV8Session.setValue("TrnContext", AV10TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      AV7Elem_Consecutivo = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Elem_Consecutivo", AV7Elem_Consecutivo);
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
      pa4F2( ) ;
      ws4F2( ) ;
      we4F2( ) ;
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
      sCtrlAV7Elem_Consecutivo = (String)getParm(obj,0,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa4F2( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "alm_elementoalm_detalle_transaccionwc");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa4F2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV7Elem_Consecutivo = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Elem_Consecutivo", AV7Elem_Consecutivo);
      }
      wcpOAV7Elem_Consecutivo = httpContext.cgiGet( sPrefix+"wcpOAV7Elem_Consecutivo") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV7Elem_Consecutivo, wcpOAV7Elem_Consecutivo) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV7Elem_Consecutivo = AV7Elem_Consecutivo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV7Elem_Consecutivo = httpContext.cgiGet( sPrefix+"AV7Elem_Consecutivo_CTRL") ;
      if ( GXutil.len( sCtrlAV7Elem_Consecutivo) > 0 )
      {
         AV7Elem_Consecutivo = httpContext.cgiGet( sCtrlAV7Elem_Consecutivo) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Elem_Consecutivo", AV7Elem_Consecutivo);
      }
      else
      {
         AV7Elem_Consecutivo = httpContext.cgiGet( sPrefix+"AV7Elem_Consecutivo_PARM") ;
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
      pa4F2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws4F2( ) ;
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
      ws4F2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Elem_Consecutivo_PARM", AV7Elem_Consecutivo);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7Elem_Consecutivo)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Elem_Consecutivo_CTRL", GXutil.rtrim( sCtrlAV7Elem_Consecutivo));
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
      we4F2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20186141415045");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("alm_elementoalm_detalle_transaccionwc.js", "?20186141415045");
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_202( )
   {
      edtTran_Id_Internalname = sPrefix+"TRAN_ID_"+sGXsfl_20_idx ;
      edtTDet_Consecutivo_Internalname = sPrefix+"TDET_CONSECUTIVO_"+sGXsfl_20_idx ;
      edtTDet_Cantidad_Internalname = sPrefix+"TDET_CANTIDAD_"+sGXsfl_20_idx ;
      edtTDet_ValorUnitario_Internalname = sPrefix+"TDET_VALORUNITARIO_"+sGXsfl_20_idx ;
      edtTDet_ValorTotal_Internalname = sPrefix+"TDET_VALORTOTAL_"+sGXsfl_20_idx ;
      edtTDet_PlacaNumero_Internalname = sPrefix+"TDET_PLACANUMERO_"+sGXsfl_20_idx ;
      edtTDet_Observaciones_Internalname = sPrefix+"TDET_OBSERVACIONES_"+sGXsfl_20_idx ;
      edtTDet_PlacaPadre_Internalname = sPrefix+"TDET_PLACAPADRE_"+sGXsfl_20_idx ;
      edtTDet_EsPadre_Internalname = sPrefix+"TDET_ESPADRE_"+sGXsfl_20_idx ;
      edtTDet_Atributos_Internalname = sPrefix+"TDET_ATRIBUTOS_"+sGXsfl_20_idx ;
      edtTDet_Valor_Presente_Internalname = sPrefix+"TDET_VALOR_PRESENTE_"+sGXsfl_20_idx ;
      edtTDet_Valor_Futuro_Internalname = sPrefix+"TDET_VALOR_FUTURO_"+sGXsfl_20_idx ;
      edtTDet_Taza_Internalname = sPrefix+"TDET_TAZA_"+sGXsfl_20_idx ;
      edtTDet_Plazo_N_Internalname = sPrefix+"TDET_PLAZO_N_"+sGXsfl_20_idx ;
      edtTDet_Otros_Costos_Internalname = sPrefix+"TDET_OTROS_COSTOS_"+sGXsfl_20_idx ;
      edtTDet_Agrupado_Internalname = sPrefix+"TDET_AGRUPADO_"+sGXsfl_20_idx ;
      cmbTran_IndE_S.setInternalname( sPrefix+"TRAN_INDE_S_"+sGXsfl_20_idx );
      edtavUpdate_Internalname = sPrefix+"vUPDATE_"+sGXsfl_20_idx ;
      edtavDelete_Internalname = sPrefix+"vDELETE_"+sGXsfl_20_idx ;
   }

   public void subsflControlProps_fel_202( )
   {
      edtTran_Id_Internalname = sPrefix+"TRAN_ID_"+sGXsfl_20_fel_idx ;
      edtTDet_Consecutivo_Internalname = sPrefix+"TDET_CONSECUTIVO_"+sGXsfl_20_fel_idx ;
      edtTDet_Cantidad_Internalname = sPrefix+"TDET_CANTIDAD_"+sGXsfl_20_fel_idx ;
      edtTDet_ValorUnitario_Internalname = sPrefix+"TDET_VALORUNITARIO_"+sGXsfl_20_fel_idx ;
      edtTDet_ValorTotal_Internalname = sPrefix+"TDET_VALORTOTAL_"+sGXsfl_20_fel_idx ;
      edtTDet_PlacaNumero_Internalname = sPrefix+"TDET_PLACANUMERO_"+sGXsfl_20_fel_idx ;
      edtTDet_Observaciones_Internalname = sPrefix+"TDET_OBSERVACIONES_"+sGXsfl_20_fel_idx ;
      edtTDet_PlacaPadre_Internalname = sPrefix+"TDET_PLACAPADRE_"+sGXsfl_20_fel_idx ;
      edtTDet_EsPadre_Internalname = sPrefix+"TDET_ESPADRE_"+sGXsfl_20_fel_idx ;
      edtTDet_Atributos_Internalname = sPrefix+"TDET_ATRIBUTOS_"+sGXsfl_20_fel_idx ;
      edtTDet_Valor_Presente_Internalname = sPrefix+"TDET_VALOR_PRESENTE_"+sGXsfl_20_fel_idx ;
      edtTDet_Valor_Futuro_Internalname = sPrefix+"TDET_VALOR_FUTURO_"+sGXsfl_20_fel_idx ;
      edtTDet_Taza_Internalname = sPrefix+"TDET_TAZA_"+sGXsfl_20_fel_idx ;
      edtTDet_Plazo_N_Internalname = sPrefix+"TDET_PLAZO_N_"+sGXsfl_20_fel_idx ;
      edtTDet_Otros_Costos_Internalname = sPrefix+"TDET_OTROS_COSTOS_"+sGXsfl_20_fel_idx ;
      edtTDet_Agrupado_Internalname = sPrefix+"TDET_AGRUPADO_"+sGXsfl_20_fel_idx ;
      cmbTran_IndE_S.setInternalname( sPrefix+"TRAN_INDE_S_"+sGXsfl_20_fel_idx );
      edtavUpdate_Internalname = sPrefix+"vUPDATE_"+sGXsfl_20_fel_idx ;
      edtavDelete_Internalname = sPrefix+"vDELETE_"+sGXsfl_20_fel_idx ;
   }

   public void sendrow_202( )
   {
      subsflControlProps_202( ) ;
      wb4F0( ) ;
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
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_Consecutivo_Internalname,GXutil.ltrim( localUtil.ntoc( A69TDet_Consecutivo, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A69TDet_Consecutivo), "ZZZZZZZZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTDet_Consecutivo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_Cantidad_Internalname,GXutil.ltrim( localUtil.ntoc( A487TDet_Cantidad, (byte)(10), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A487TDet_Cantidad), "ZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'",edtTDet_Cantidad_Link,"","","",edtTDet_Cantidad_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_ValorUnitario_Internalname,GXutil.ltrim( localUtil.ntoc( A488TDet_ValorUnitario, (byte)(22), (byte)(2), ",", "")),localUtil.format( A488TDet_ValorUnitario, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTDet_ValorUnitario_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(22),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_ValorTotal_Internalname,GXutil.ltrim( localUtil.ntoc( A489TDet_ValorTotal, (byte)(22), (byte)(2), ",", "")),localUtil.format( A489TDet_ValorTotal, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTDet_ValorTotal_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(22),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_PlacaNumero_Internalname,A490TDet_PlacaNumero,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTDet_PlacaNumero_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_Observaciones_Internalname,A504TDet_Observaciones,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTDet_Observaciones_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_PlacaPadre_Internalname,A491TDet_PlacaPadre,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTDet_PlacaPadre_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_EsPadre_Internalname,A505TDet_EsPadre,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTDet_EsPadre_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_Atributos_Internalname,A525TDet_Atributos,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTDet_Atributos_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_Valor_Presente_Internalname,GXutil.ltrim( localUtil.ntoc( A653TDet_Valor_Presente, (byte)(24), (byte)(2), ",", "")),localUtil.format( A653TDet_Valor_Presente, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTDet_Valor_Presente_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Valor","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_Valor_Futuro_Internalname,GXutil.ltrim( localUtil.ntoc( A654TDet_Valor_Futuro, (byte)(24), (byte)(2), ",", "")),localUtil.format( A654TDet_Valor_Futuro, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTDet_Valor_Futuro_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Valor","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_Taza_Internalname,GXutil.ltrim( localUtil.ntoc( A655TDet_Taza, (byte)(3), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A655TDet_Taza), "ZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTDet_Taza_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_Plazo_N_Internalname,GXutil.ltrim( localUtil.ntoc( A656TDet_Plazo_N, (byte)(2), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A656TDet_Plazo_N), "Z9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTDet_Plazo_N_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_Otros_Costos_Internalname,GXutil.ltrim( localUtil.ntoc( A657TDet_Otros_Costos, (byte)(24), (byte)(2), ",", "")),localUtil.format( A657TDet_Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTDet_Otros_Costos_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Valor","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_Agrupado_Internalname,GXutil.ltrim( localUtil.ntoc( A658TDet_Agrupado, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A658TDet_Agrupado), "ZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTDet_Agrupado_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         GXCCtl = "TRAN_INDE_S_" + sGXsfl_20_idx ;
         cmbTran_IndE_S.setName( GXCCtl );
         cmbTran_IndE_S.setWebtags( "" );
         cmbTran_IndE_S.addItem("E", "ENTRADA", (short)(0));
         cmbTran_IndE_S.addItem("S", "SALIDA", (short)(0));
         cmbTran_IndE_S.addItem("T", "TRASPASO", (short)(0));
         cmbTran_IndE_S.addItem("R", "RECUPERACIÓN", (short)(0));
         if ( cmbTran_IndE_S.getItemCount() > 0 )
         {
            A481Tran_IndE_S = cmbTran_IndE_S.getValidValue(A481Tran_IndE_S) ;
            n481Tran_IndE_S = false ;
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTran_IndE_S,cmbTran_IndE_S.getInternalname(),GXutil.rtrim( A481Tran_IndE_S),new Integer(1),cmbTran_IndE_S.getJsonclick(),new Integer(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(1),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbTran_IndE_S.setValue( GXutil.rtrim( A481Tran_IndE_S) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTran_IndE_S.getInternalname(), "Values", cmbTran_IndE_S.ToJavascriptSource(), !bGXsfl_20_Refreshing);
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
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavDelete_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(0),"",edtavDelete_Tooltiptext,new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV13Delete_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_ID"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A46Tran_Id), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_CONSECUTIVO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A69TDet_Consecutivo), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_VALORUNITARIO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( A488TDet_ValorUnitario, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_VALORTOTAL"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( A489TDet_ValorTotal, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_PLACANUMERO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A490TDet_PlacaNumero, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_OBSERVACIONES"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A504TDet_Observaciones, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_PLACAPADRE"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A491TDet_PlacaPadre, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_ESPADRE"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A505TDet_EsPadre, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_ATRIBUTOS"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A525TDet_Atributos, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_VALOR_PRESENTE"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( A653TDet_Valor_Presente, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_VALOR_FUTURO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( A654TDet_Valor_Futuro, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_TAZA"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A655TDet_Taza), "ZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_PLAZO_N"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A656TDet_Plazo_N), "Z9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_OTROS_COSTOS"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( A657TDet_Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_AGRUPADO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A658TDet_Agrupado), "ZZZ9")));
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
      edtTDet_Consecutivo_Internalname = sPrefix+"TDET_CONSECUTIVO" ;
      edtTDet_Cantidad_Internalname = sPrefix+"TDET_CANTIDAD" ;
      edtTDet_ValorUnitario_Internalname = sPrefix+"TDET_VALORUNITARIO" ;
      edtTDet_ValorTotal_Internalname = sPrefix+"TDET_VALORTOTAL" ;
      edtTDet_PlacaNumero_Internalname = sPrefix+"TDET_PLACANUMERO" ;
      edtTDet_Observaciones_Internalname = sPrefix+"TDET_OBSERVACIONES" ;
      edtTDet_PlacaPadre_Internalname = sPrefix+"TDET_PLACAPADRE" ;
      edtTDet_EsPadre_Internalname = sPrefix+"TDET_ESPADRE" ;
      edtTDet_Atributos_Internalname = sPrefix+"TDET_ATRIBUTOS" ;
      edtTDet_Valor_Presente_Internalname = sPrefix+"TDET_VALOR_PRESENTE" ;
      edtTDet_Valor_Futuro_Internalname = sPrefix+"TDET_VALOR_FUTURO" ;
      edtTDet_Taza_Internalname = sPrefix+"TDET_TAZA" ;
      edtTDet_Plazo_N_Internalname = sPrefix+"TDET_PLAZO_N" ;
      edtTDet_Otros_Costos_Internalname = sPrefix+"TDET_OTROS_COSTOS" ;
      edtTDet_Agrupado_Internalname = sPrefix+"TDET_AGRUPADO" ;
      cmbTran_IndE_S.setInternalname( sPrefix+"TRAN_INDE_S" );
      edtavUpdate_Internalname = sPrefix+"vUPDATE" ;
      edtavDelete_Internalname = sPrefix+"vDELETE" ;
      divGridtable_Internalname = sPrefix+"GRIDTABLE" ;
      divGridcell_Internalname = sPrefix+"GRIDCELL" ;
      edtElem_Consecutivo_Internalname = sPrefix+"ELEM_CONSECUTIVO" ;
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
      cmbTran_IndE_S.setJsonclick( "" );
      edtTDet_Agrupado_Jsonclick = "" ;
      edtTDet_Otros_Costos_Jsonclick = "" ;
      edtTDet_Plazo_N_Jsonclick = "" ;
      edtTDet_Taza_Jsonclick = "" ;
      edtTDet_Valor_Futuro_Jsonclick = "" ;
      edtTDet_Valor_Presente_Jsonclick = "" ;
      edtTDet_Atributos_Jsonclick = "" ;
      edtTDet_EsPadre_Jsonclick = "" ;
      edtTDet_PlacaPadre_Jsonclick = "" ;
      edtTDet_Observaciones_Jsonclick = "" ;
      edtTDet_PlacaNumero_Jsonclick = "" ;
      edtTDet_ValorTotal_Jsonclick = "" ;
      edtTDet_ValorUnitario_Jsonclick = "" ;
      edtTDet_Cantidad_Jsonclick = "" ;
      edtTDet_Consecutivo_Jsonclick = "" ;
      edtTran_Id_Jsonclick = "" ;
      edtElem_Consecutivo_Jsonclick = "" ;
      edtElem_Consecutivo_Enabled = 0 ;
      edtElem_Consecutivo_Visible = 1 ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      edtavUpdate_Link = "" ;
      edtTDet_Cantidad_Link = "" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Elem_Consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e134F2',iparms:[{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[{av:'edtavUpdate_Link',ctrl:'vUPDATE',prop:'Link'},{av:'edtTDet_Cantidad_Link',ctrl:'TDET_CANTIDAD',prop:'Link'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e114F2',iparms:[{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Elem_Consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Elem_Consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Elem_Consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Elem_Consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
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
      wcpOAV7Elem_Consecutivo = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV7Elem_Consecutivo = "" ;
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
      A488TDet_ValorUnitario = DecimalUtil.ZERO ;
      A489TDet_ValorTotal = DecimalUtil.ZERO ;
      A490TDet_PlacaNumero = "" ;
      A504TDet_Observaciones = "" ;
      A491TDet_PlacaPadre = "" ;
      A505TDet_EsPadre = "" ;
      A525TDet_Atributos = "" ;
      A653TDet_Valor_Presente = DecimalUtil.ZERO ;
      A654TDet_Valor_Futuro = DecimalUtil.ZERO ;
      A657TDet_Otros_Costos = DecimalUtil.ZERO ;
      A481Tran_IndE_S = "" ;
      A66Elem_Consecutivo = "" ;
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
      H004F2_A66Elem_Consecutivo = new String[] {""} ;
      H004F2_A481Tran_IndE_S = new String[] {""} ;
      H004F2_n481Tran_IndE_S = new boolean[] {false} ;
      H004F2_A658TDet_Agrupado = new short[1] ;
      H004F2_n658TDet_Agrupado = new boolean[] {false} ;
      H004F2_A657TDet_Otros_Costos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H004F2_n657TDet_Otros_Costos = new boolean[] {false} ;
      H004F2_A656TDet_Plazo_N = new byte[1] ;
      H004F2_n656TDet_Plazo_N = new boolean[] {false} ;
      H004F2_A655TDet_Taza = new short[1] ;
      H004F2_n655TDet_Taza = new boolean[] {false} ;
      H004F2_A654TDet_Valor_Futuro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H004F2_n654TDet_Valor_Futuro = new boolean[] {false} ;
      H004F2_A653TDet_Valor_Presente = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H004F2_n653TDet_Valor_Presente = new boolean[] {false} ;
      H004F2_A525TDet_Atributos = new String[] {""} ;
      H004F2_A505TDet_EsPadre = new String[] {""} ;
      H004F2_A491TDet_PlacaPadre = new String[] {""} ;
      H004F2_n491TDet_PlacaPadre = new boolean[] {false} ;
      H004F2_A504TDet_Observaciones = new String[] {""} ;
      H004F2_n504TDet_Observaciones = new boolean[] {false} ;
      H004F2_A490TDet_PlacaNumero = new String[] {""} ;
      H004F2_n490TDet_PlacaNumero = new boolean[] {false} ;
      H004F2_A489TDet_ValorTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H004F2_A488TDet_ValorUnitario = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H004F2_A487TDet_Cantidad = new long[1] ;
      H004F2_A69TDet_Consecutivo = new long[1] ;
      H004F2_A46Tran_Id = new long[1] ;
      H004F3_AGRID_nRecordCount = new long[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV10TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV9HTTPRequest = httpContext.getHttpRequest();
      AV11TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV8Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV7Elem_Consecutivo = "" ;
      ROClassString = "" ;
      sImgUrl = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_elementoalm_detalle_transaccionwc__default(),
         new Object[] {
             new Object[] {
            H004F2_A66Elem_Consecutivo, H004F2_A481Tran_IndE_S, H004F2_n481Tran_IndE_S, H004F2_A658TDet_Agrupado, H004F2_n658TDet_Agrupado, H004F2_A657TDet_Otros_Costos, H004F2_n657TDet_Otros_Costos, H004F2_A656TDet_Plazo_N, H004F2_n656TDet_Plazo_N, H004F2_A655TDet_Taza,
            H004F2_n655TDet_Taza, H004F2_A654TDet_Valor_Futuro, H004F2_n654TDet_Valor_Futuro, H004F2_A653TDet_Valor_Presente, H004F2_n653TDet_Valor_Presente, H004F2_A525TDet_Atributos, H004F2_A505TDet_EsPadre, H004F2_A491TDet_PlacaPadre, H004F2_n491TDet_PlacaPadre, H004F2_A504TDet_Observaciones,
            H004F2_n504TDet_Observaciones, H004F2_A490TDet_PlacaNumero, H004F2_n490TDet_PlacaNumero, H004F2_A489TDet_ValorTotal, H004F2_A488TDet_ValorUnitario, H004F2_A487TDet_Cantidad, H004F2_A69TDet_Consecutivo, H004F2_A46Tran_Id
            }
            , new Object[] {
            H004F3_AGRID_nRecordCount
            }
         }
      );
      AV17Pgmname = "ALM_ELEMENTOALM_DETALLE_TRANSACCIONWC" ;
      /* GeneXus formulas. */
      AV17Pgmname = "ALM_ELEMENTOALM_DETALLE_TRANSACCIONWC" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nGXWrapped ;
   private byte GRID_nEOF ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte A656TDet_Plazo_N ;
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
   private short A655TDet_Taza ;
   private short A658TDet_Agrupado ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int edtElem_Consecutivo_Visible ;
   private int edtElem_Consecutivo_Enabled ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private long A46Tran_Id ;
   private long A69TDet_Consecutivo ;
   private long GRID_nFirstRecordOnPage ;
   private long A487TDet_Cantidad ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal A488TDet_ValorUnitario ;
   private java.math.BigDecimal A489TDet_ValorTotal ;
   private java.math.BigDecimal A653TDet_Valor_Presente ;
   private java.math.BigDecimal A654TDet_Valor_Futuro ;
   private java.math.BigDecimal A657TDet_Otros_Costos ;
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
   private String edtTDet_Cantidad_Link ;
   private String edtavUpdate_Link ;
   private String edtElem_Consecutivo_Internalname ;
   private String edtElem_Consecutivo_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtTran_Id_Internalname ;
   private String edtTDet_Consecutivo_Internalname ;
   private String edtTDet_Cantidad_Internalname ;
   private String edtTDet_ValorUnitario_Internalname ;
   private String edtTDet_ValorTotal_Internalname ;
   private String edtTDet_PlacaNumero_Internalname ;
   private String edtTDet_Observaciones_Internalname ;
   private String edtTDet_PlacaPadre_Internalname ;
   private String edtTDet_EsPadre_Internalname ;
   private String edtTDet_Atributos_Internalname ;
   private String edtTDet_Valor_Presente_Internalname ;
   private String edtTDet_Valor_Futuro_Internalname ;
   private String edtTDet_Taza_Internalname ;
   private String edtTDet_Plazo_N_Internalname ;
   private String edtTDet_Otros_Costos_Internalname ;
   private String edtTDet_Agrupado_Internalname ;
   private String GXCCtl ;
   private String AV17Pgmname ;
   private String scmdbuf ;
   private String sCtrlAV7Elem_Consecutivo ;
   private String sGXsfl_20_fel_idx="0001" ;
   private String ROClassString ;
   private String edtTran_Id_Jsonclick ;
   private String edtTDet_Consecutivo_Jsonclick ;
   private String edtTDet_Cantidad_Jsonclick ;
   private String edtTDet_ValorUnitario_Jsonclick ;
   private String edtTDet_ValorTotal_Jsonclick ;
   private String edtTDet_PlacaNumero_Jsonclick ;
   private String edtTDet_Observaciones_Jsonclick ;
   private String edtTDet_PlacaPadre_Jsonclick ;
   private String edtTDet_EsPadre_Jsonclick ;
   private String edtTDet_Atributos_Jsonclick ;
   private String edtTDet_Valor_Presente_Jsonclick ;
   private String edtTDet_Valor_Futuro_Jsonclick ;
   private String edtTDet_Taza_Jsonclick ;
   private String edtTDet_Plazo_N_Jsonclick ;
   private String edtTDet_Otros_Costos_Jsonclick ;
   private String edtTDet_Agrupado_Jsonclick ;
   private String sImgUrl ;
   private boolean entryPointCalled ;
   private boolean bGXsfl_20_Refreshing=false ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n490TDet_PlacaNumero ;
   private boolean n504TDet_Observaciones ;
   private boolean n491TDet_PlacaPadre ;
   private boolean n653TDet_Valor_Presente ;
   private boolean n654TDet_Valor_Futuro ;
   private boolean n655TDet_Taza ;
   private boolean n656TDet_Plazo_N ;
   private boolean n657TDet_Otros_Costos ;
   private boolean n658TDet_Agrupado ;
   private boolean n481Tran_IndE_S ;
   private boolean returnInSub ;
   private boolean AV12Update_IsBlob ;
   private boolean AV13Delete_IsBlob ;
   private String wcpOAV7Elem_Consecutivo ;
   private String AV7Elem_Consecutivo ;
   private String A490TDet_PlacaNumero ;
   private String A504TDet_Observaciones ;
   private String A491TDet_PlacaPadre ;
   private String A505TDet_EsPadre ;
   private String A525TDet_Atributos ;
   private String A481Tran_IndE_S ;
   private String A66Elem_Consecutivo ;
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
   private HTMLChoice cmbTran_IndE_S ;
   private IDataStoreProvider pr_default ;
   private String[] H004F2_A66Elem_Consecutivo ;
   private String[] H004F2_A481Tran_IndE_S ;
   private boolean[] H004F2_n481Tran_IndE_S ;
   private short[] H004F2_A658TDet_Agrupado ;
   private boolean[] H004F2_n658TDet_Agrupado ;
   private java.math.BigDecimal[] H004F2_A657TDet_Otros_Costos ;
   private boolean[] H004F2_n657TDet_Otros_Costos ;
   private byte[] H004F2_A656TDet_Plazo_N ;
   private boolean[] H004F2_n656TDet_Plazo_N ;
   private short[] H004F2_A655TDet_Taza ;
   private boolean[] H004F2_n655TDet_Taza ;
   private java.math.BigDecimal[] H004F2_A654TDet_Valor_Futuro ;
   private boolean[] H004F2_n654TDet_Valor_Futuro ;
   private java.math.BigDecimal[] H004F2_A653TDet_Valor_Presente ;
   private boolean[] H004F2_n653TDet_Valor_Presente ;
   private String[] H004F2_A525TDet_Atributos ;
   private String[] H004F2_A505TDet_EsPadre ;
   private String[] H004F2_A491TDet_PlacaPadre ;
   private boolean[] H004F2_n491TDet_PlacaPadre ;
   private String[] H004F2_A504TDet_Observaciones ;
   private boolean[] H004F2_n504TDet_Observaciones ;
   private String[] H004F2_A490TDet_PlacaNumero ;
   private boolean[] H004F2_n490TDet_PlacaNumero ;
   private java.math.BigDecimal[] H004F2_A489TDet_ValorTotal ;
   private java.math.BigDecimal[] H004F2_A488TDet_ValorUnitario ;
   private long[] H004F2_A487TDet_Cantidad ;
   private long[] H004F2_A69TDet_Consecutivo ;
   private long[] H004F2_A46Tran_Id ;
   private long[] H004F3_AGRID_nRecordCount ;
   private com.genexus.webpanels.WebSession AV8Session ;
   private com.orions2.SdtTransactionContext AV10TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV11TrnContextAtt ;
}

final  class alm_elementoalm_detalle_transaccionwc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H004F2", "SELECT T1.Elem_Consecutivo, T2.Tran_IndE_S, T1.TDet_Agrupado, T1.TDet_Otros_Costos, T1.TDet_Plazo_N, T1.TDet_Taza, T1.TDet_Valor_Futuro, T1.TDet_Valor_Presente, T1.TDet_Atributos, T1.TDet_EsPadre, T1.TDet_PlacaPadre, T1.TDet_Observaciones, T1.TDet_PlacaNumero, T1.TDet_ValorTotal, T1.TDet_ValorUnitario, T1.TDet_Cantidad, T1.TDet_Consecutivo, T1.Tran_Id FROM (ALM_DETALLE_TRANSACCION T1 INNER JOIN ALM_TRANSACCION T2 ON T2.Tran_Id = T1.Tran_Id) WHERE T1.Elem_Consecutivo = ? ORDER BY T1.Elem_Consecutivo  OFFSET ? ROWS FETCH NEXT (CASE WHEN ? > 0 THEN ? ELSE 1e9 END) ROWS ONLY",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H004F3", "SELECT COUNT(*) FROM (ALM_DETALLE_TRANSACCION T1 INNER JOIN ALM_TRANSACCION T2 ON T2.Tran_Id = T1.Tran_Id) WHERE T1.Elem_Consecutivo = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,2) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(14,2) ;
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(15,2) ;
               ((long[]) buf[25])[0] = rslt.getLong(16) ;
               ((long[]) buf[26])[0] = rslt.getLong(17) ;
               ((long[]) buf[27])[0] = rslt.getLong(18) ;
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
               stmt.setVarchar(1, (String)parms[0], 9);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 9);
               return;
      }
   }

}

