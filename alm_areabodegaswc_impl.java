/*
               File: alm_areabodegaswc_impl
        Description: ALM_AREABODEGASWC
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:36.23
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

public final  class alm_areabodegaswc_impl extends GXWebComponent
{
   public alm_areabodegaswc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_areabodegaswc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_areabodegaswc_impl.class ));
   }

   public alm_areabodegaswc_impl( int remoteHandle ,
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
      cmbAlma_Modulo = new HTMLChoice();
      cmbAlma_Estado = new HTMLChoice();
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
               AV7BArea_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BArea_Codigo", AV7BArea_Codigo);
               AV8Cent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Cent_Id", GXutil.ltrim( GXutil.str( AV8Cent_Id, 11, 0)));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV7BArea_Codigo,new Long(AV8Cent_Id)});
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
               AV13Update = httpContext.GetNextPar( ) ;
               edtavUpdate_Tooltiptext = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_20_Refreshing);
               AV14Delete = httpContext.GetNextPar( ) ;
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
               AV7BArea_Codigo = httpContext.GetNextPar( ) ;
               AV8Cent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               AV13Update = httpContext.GetNextPar( ) ;
               edtavUpdate_Tooltiptext = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_20_Refreshing);
               AV14Delete = httpContext.GetNextPar( ) ;
               edtavDelete_Tooltiptext = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "Tooltiptext", edtavDelete_Tooltiptext, !bGXsfl_20_Refreshing);
               A27Alma_Modulo = httpContext.GetNextPar( ) ;
               A28Alma_Codigo = httpContext.GetNextPar( ) ;
               A1Cent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               A29Tpal_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               sPrefix = httpContext.GetNextPar( ) ;
               init_default_properties( ) ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxgrgrid_refresh( subGrid_Rows, AV7BArea_Codigo, AV8Cent_Id, AV13Update, AV14Delete, A27Alma_Modulo, A28Alma_Codigo, A1Cent_Id, A29Tpal_Id, sPrefix) ;
               GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
               GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
               forbiddenHiddens = sPrefix + "hsh" + "ALM_AREABODEGASWC" ;
               forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9") ;
               com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
               GXutil.writeLogln("alm_areabodegaswc:[SendSecurityCheck]"+forbiddenHiddens);
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
         pa172( ) ;
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
         httpContext.writeValue( "ALM_AREABODEGASWC") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414113631");
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_areabodegaswc") + "?" + GXutil.URLEncode(GXutil.rtrim(AV7BArea_Codigo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV8Cent_Id,11,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7BArea_Codigo", wcpOAV7BArea_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8Cent_Id", GXutil.ltrim( localUtil.ntoc( wcpOAV8Cent_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBAREA_CODIGO", AV7BArea_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCENT_ID", GXutil.ltrim( localUtil.ntoc( AV8Cent_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUPDATE_Tooltiptext", GXutil.rtrim( edtavUpdate_Tooltiptext));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDELETE_Tooltiptext", GXutil.rtrim( edtavDelete_Tooltiptext));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = sPrefix + "hsh" + "ALM_AREABODEGASWC" ;
      forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9") ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("alm_areabodegaswc:[SendSecurityCheck]"+forbiddenHiddens);
   }

   public void renderHtmlCloseForm172( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("alm_areabodegaswc.js", "?201861414113634");
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
      return "ALM_AREABODEGASWC" ;
   }

   public String getPgmdesc( )
   {
      return "ALM_AREABODEGASWC" ;
   }

   public void wb170( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.alm_areabodegaswc");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 20, 2, 0)+","+"null"+");", "Agregar", bttBtninsert_Jsonclick, 5, "Agregar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_AREABODEGASWC.htm");
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
            httpContext.writeValue( "C�digo del Centro de Costo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripci�n Centro de Costo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Modulo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "C�digo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripci�n Almac�n") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Id Tipo Almac�n") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripci�n Tipo Almac�n") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Direcci�n") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Telefono1") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Telefono2") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fax") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Responsable") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Nombre Responsable") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Email Responsable") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cuenta D�bito") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cuenta Cr�dito") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha Creaci�n") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Usuario Creaci�n") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha Modificaci�n") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Usuario Modificaci�n") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Estado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cedula Responsable") ;
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
            GridColumn.AddObjectProperty("Value", A3Cent_Codigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A4Cent_Descripcion);
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtCent_Descripcion_Link));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A27Alma_Modulo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A28Alma_Codigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A252Alma_Descripcion);
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtAlma_Descripcion_Link));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A29Tpal_Id, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A307Tpal_Descripcion);
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtTpal_Descripcion_Link));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A259Alma_Direccion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A260Alma_Telefono1, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A261Alma_Telefono2, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A262Alma_Fax, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A30Alma_IdResponsable, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A266Alma_NombreResponsable);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A268Alma_EmailResponsable);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A263Alma_CuentaDebito);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A264Alma_CuentaCredito);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A255Alma_FechaCrea, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A256Alma_UsuarioCrea);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A257Alma_FechaModifica, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A258Alma_UsuarioModifica);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A673Alma_Estado));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A265Alma_CedulaResponsable, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV13Update));
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtavUpdate_Link));
            GridColumn.AddObjectProperty("Tooltiptext", GXutil.rtrim( edtavUpdate_Tooltiptext));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV14Delete));
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtBArea_Codigo_Internalname, "BArea_Codigo", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtBArea_Codigo_Internalname, A32BArea_Codigo, GXutil.rtrim( localUtil.format( A32BArea_Codigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBArea_Codigo_Jsonclick, 0, "Attribute", "", "", "", edtBArea_Codigo_Visible, edtBArea_Codigo_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_AREABODEGASWC.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_Id_Internalname, "Identificador Centro de Costo", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ",", "")), ((edtCent_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_Id_Jsonclick, 0, "Attribute", "", "", "", edtCent_Id_Visible, edtCent_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_AREABODEGASWC.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start172( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "ALM_AREABODEGASWC", (short)(0)) ;
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
            strup170( ) ;
         }
      }
   }

   public void ws172( )
   {
      start172( ) ;
      evt172( ) ;
   }

   public void evt172( )
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
                              strup170( ) ;
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
                              strup170( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoInsert' */
                                 e11172 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup170( ) ;
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
                              strup170( ) ;
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
                              strup170( ) ;
                           }
                           nGXsfl_20_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_20_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_20_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_202( ) ;
                           A3Cent_Codigo = httpContext.cgiGet( edtCent_Codigo_Internalname) ;
                           A4Cent_Descripcion = httpContext.cgiGet( edtCent_Descripcion_Internalname) ;
                           cmbAlma_Modulo.setName( cmbAlma_Modulo.getInternalname() );
                           cmbAlma_Modulo.setValue( httpContext.cgiGet( cmbAlma_Modulo.getInternalname()) );
                           A27Alma_Modulo = httpContext.cgiGet( cmbAlma_Modulo.getInternalname()) ;
                           A28Alma_Codigo = httpContext.cgiGet( edtAlma_Codigo_Internalname) ;
                           A252Alma_Descripcion = GXutil.upper( httpContext.cgiGet( edtAlma_Descripcion_Internalname)) ;
                           A29Tpal_Id = localUtil.ctol( httpContext.cgiGet( edtTpal_Id_Internalname), ",", ".") ;
                           A307Tpal_Descripcion = GXutil.upper( httpContext.cgiGet( edtTpal_Descripcion_Internalname)) ;
                           A259Alma_Direccion = httpContext.cgiGet( edtAlma_Direccion_Internalname) ;
                           n259Alma_Direccion = false ;
                           A260Alma_Telefono1 = localUtil.ctol( httpContext.cgiGet( edtAlma_Telefono1_Internalname), ",", ".") ;
                           n260Alma_Telefono1 = false ;
                           A261Alma_Telefono2 = localUtil.ctol( httpContext.cgiGet( edtAlma_Telefono2_Internalname), ",", ".") ;
                           n261Alma_Telefono2 = false ;
                           A262Alma_Fax = localUtil.ctol( httpContext.cgiGet( edtAlma_Fax_Internalname), ",", ".") ;
                           n262Alma_Fax = false ;
                           A30Alma_IdResponsable = localUtil.ctol( httpContext.cgiGet( edtAlma_IdResponsable_Internalname), ",", ".") ;
                           A266Alma_NombreResponsable = GXutil.upper( httpContext.cgiGet( edtAlma_NombreResponsable_Internalname)) ;
                           n266Alma_NombreResponsable = false ;
                           A268Alma_EmailResponsable = httpContext.cgiGet( edtAlma_EmailResponsable_Internalname) ;
                           n268Alma_EmailResponsable = false ;
                           A263Alma_CuentaDebito = httpContext.cgiGet( edtAlma_CuentaDebito_Internalname) ;
                           n263Alma_CuentaDebito = false ;
                           A264Alma_CuentaCredito = httpContext.cgiGet( edtAlma_CuentaCredito_Internalname) ;
                           n264Alma_CuentaCredito = false ;
                           A255Alma_FechaCrea = localUtil.ctot( httpContext.cgiGet( edtAlma_FechaCrea_Internalname), 0) ;
                           n255Alma_FechaCrea = false ;
                           A256Alma_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtAlma_UsuarioCrea_Internalname)) ;
                           n256Alma_UsuarioCrea = false ;
                           A257Alma_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtAlma_FechaModifica_Internalname), 0) ;
                           n257Alma_FechaModifica = false ;
                           A258Alma_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtAlma_UsuarioModifica_Internalname)) ;
                           n258Alma_UsuarioModifica = false ;
                           cmbAlma_Estado.setName( cmbAlma_Estado.getInternalname() );
                           cmbAlma_Estado.setValue( httpContext.cgiGet( cmbAlma_Estado.getInternalname()) );
                           A673Alma_Estado = httpContext.cgiGet( cmbAlma_Estado.getInternalname()) ;
                           n673Alma_Estado = false ;
                           A265Alma_CedulaResponsable = localUtil.ctol( httpContext.cgiGet( edtAlma_CedulaResponsable_Internalname), ",", ".") ;
                           n265Alma_CedulaResponsable = false ;
                           AV13Update = httpContext.cgiGet( edtavUpdate_Internalname) ;
                           httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV13Update)==0) ? AV19Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV13Update))), !bGXsfl_20_Refreshing);
                           httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV13Update), true);
                           AV14Delete = httpContext.cgiGet( edtavDelete_Internalname) ;
                           httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "Bitmap", ((GXutil.strcmp("", AV14Delete)==0) ? AV20Delete_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV14Delete))), !bGXsfl_20_Refreshing);
                           httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV14Delete), true);
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
                                       e12172 ();
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
                                       e13172 ();
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
                                    strup170( ) ;
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

   public void we172( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm172( ) ;
         }
      }
   }

   public void pa172( )
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
         GXCCtl = "ALMA_MODULO_" + sGXsfl_20_idx ;
         cmbAlma_Modulo.setName( GXCCtl );
         cmbAlma_Modulo.setWebtags( "" );
         cmbAlma_Modulo.addItem("ALMA", "ALMACEN", (short)(0));
         cmbAlma_Modulo.addItem("INVE", "INVENTARIO", (short)(0));
         cmbAlma_Modulo.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
         if ( cmbAlma_Modulo.getItemCount() > 0 )
         {
            A27Alma_Modulo = cmbAlma_Modulo.getValidValue(A27Alma_Modulo) ;
         }
         GXCCtl = "ALMA_ESTADO_" + sGXsfl_20_idx ;
         cmbAlma_Estado.setName( GXCCtl );
         cmbAlma_Estado.setWebtags( "" );
         cmbAlma_Estado.addItem("A", "Activo", (short)(0));
         cmbAlma_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbAlma_Estado.getItemCount() > 0 )
         {
            A673Alma_Estado = cmbAlma_Estado.getValidValue(A673Alma_Estado) ;
            n673Alma_Estado = false ;
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
                                 String AV7BArea_Codigo ,
                                 long AV8Cent_Id ,
                                 String AV13Update ,
                                 String AV14Delete ,
                                 String A27Alma_Modulo ,
                                 String A28Alma_Codigo ,
                                 long A1Cent_Id ,
                                 long A29Tpal_Id ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid_Rows = subGrid_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID_nCurrentRecord = 0 ;
      rf172( ) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALMA_MODULO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A27Alma_Modulo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALMA_MODULO", A27Alma_Modulo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALMA_CODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A28Alma_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALMA_CODIGO", A28Alma_Codigo);
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf172( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV18Pgmname = "ALM_AREABODEGASWC" ;
      Gx_err = (short)(0) ;
   }

   public void rf172( )
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
         /* Using cursor H00172 */
         pr_default.execute(0, new Object[] {AV7BArea_Codigo, new Long(AV8Cent_Id), new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_20_idx = (short)(1) ;
         sGXsfl_20_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_20_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_202( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_recordsperpage( ) ) ) ) )
         {
            A32BArea_Codigo = H00172_A32BArea_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A32BArea_Codigo", A32BArea_Codigo);
            n32BArea_Codigo = H00172_n32BArea_Codigo[0] ;
            A1Cent_Id = H00172_A1Cent_Id[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
            A265Alma_CedulaResponsable = H00172_A265Alma_CedulaResponsable[0] ;
            n265Alma_CedulaResponsable = H00172_n265Alma_CedulaResponsable[0] ;
            A673Alma_Estado = H00172_A673Alma_Estado[0] ;
            n673Alma_Estado = H00172_n673Alma_Estado[0] ;
            A258Alma_UsuarioModifica = H00172_A258Alma_UsuarioModifica[0] ;
            n258Alma_UsuarioModifica = H00172_n258Alma_UsuarioModifica[0] ;
            A257Alma_FechaModifica = H00172_A257Alma_FechaModifica[0] ;
            n257Alma_FechaModifica = H00172_n257Alma_FechaModifica[0] ;
            A256Alma_UsuarioCrea = H00172_A256Alma_UsuarioCrea[0] ;
            n256Alma_UsuarioCrea = H00172_n256Alma_UsuarioCrea[0] ;
            A255Alma_FechaCrea = H00172_A255Alma_FechaCrea[0] ;
            n255Alma_FechaCrea = H00172_n255Alma_FechaCrea[0] ;
            A264Alma_CuentaCredito = H00172_A264Alma_CuentaCredito[0] ;
            n264Alma_CuentaCredito = H00172_n264Alma_CuentaCredito[0] ;
            A263Alma_CuentaDebito = H00172_A263Alma_CuentaDebito[0] ;
            n263Alma_CuentaDebito = H00172_n263Alma_CuentaDebito[0] ;
            A268Alma_EmailResponsable = H00172_A268Alma_EmailResponsable[0] ;
            n268Alma_EmailResponsable = H00172_n268Alma_EmailResponsable[0] ;
            A266Alma_NombreResponsable = H00172_A266Alma_NombreResponsable[0] ;
            n266Alma_NombreResponsable = H00172_n266Alma_NombreResponsable[0] ;
            A30Alma_IdResponsable = H00172_A30Alma_IdResponsable[0] ;
            A262Alma_Fax = H00172_A262Alma_Fax[0] ;
            n262Alma_Fax = H00172_n262Alma_Fax[0] ;
            A261Alma_Telefono2 = H00172_A261Alma_Telefono2[0] ;
            n261Alma_Telefono2 = H00172_n261Alma_Telefono2[0] ;
            A260Alma_Telefono1 = H00172_A260Alma_Telefono1[0] ;
            n260Alma_Telefono1 = H00172_n260Alma_Telefono1[0] ;
            A259Alma_Direccion = H00172_A259Alma_Direccion[0] ;
            n259Alma_Direccion = H00172_n259Alma_Direccion[0] ;
            A307Tpal_Descripcion = H00172_A307Tpal_Descripcion[0] ;
            A29Tpal_Id = H00172_A29Tpal_Id[0] ;
            A252Alma_Descripcion = H00172_A252Alma_Descripcion[0] ;
            A28Alma_Codigo = H00172_A28Alma_Codigo[0] ;
            A27Alma_Modulo = H00172_A27Alma_Modulo[0] ;
            A4Cent_Descripcion = H00172_A4Cent_Descripcion[0] ;
            A3Cent_Codigo = H00172_A3Cent_Codigo[0] ;
            A4Cent_Descripcion = H00172_A4Cent_Descripcion[0] ;
            A3Cent_Codigo = H00172_A3Cent_Codigo[0] ;
            A673Alma_Estado = H00172_A673Alma_Estado[0] ;
            n673Alma_Estado = H00172_n673Alma_Estado[0] ;
            A258Alma_UsuarioModifica = H00172_A258Alma_UsuarioModifica[0] ;
            n258Alma_UsuarioModifica = H00172_n258Alma_UsuarioModifica[0] ;
            A257Alma_FechaModifica = H00172_A257Alma_FechaModifica[0] ;
            n257Alma_FechaModifica = H00172_n257Alma_FechaModifica[0] ;
            A256Alma_UsuarioCrea = H00172_A256Alma_UsuarioCrea[0] ;
            n256Alma_UsuarioCrea = H00172_n256Alma_UsuarioCrea[0] ;
            A255Alma_FechaCrea = H00172_A255Alma_FechaCrea[0] ;
            n255Alma_FechaCrea = H00172_n255Alma_FechaCrea[0] ;
            A264Alma_CuentaCredito = H00172_A264Alma_CuentaCredito[0] ;
            n264Alma_CuentaCredito = H00172_n264Alma_CuentaCredito[0] ;
            A263Alma_CuentaDebito = H00172_A263Alma_CuentaDebito[0] ;
            n263Alma_CuentaDebito = H00172_n263Alma_CuentaDebito[0] ;
            A30Alma_IdResponsable = H00172_A30Alma_IdResponsable[0] ;
            A262Alma_Fax = H00172_A262Alma_Fax[0] ;
            n262Alma_Fax = H00172_n262Alma_Fax[0] ;
            A261Alma_Telefono2 = H00172_A261Alma_Telefono2[0] ;
            n261Alma_Telefono2 = H00172_n261Alma_Telefono2[0] ;
            A260Alma_Telefono1 = H00172_A260Alma_Telefono1[0] ;
            n260Alma_Telefono1 = H00172_n260Alma_Telefono1[0] ;
            A259Alma_Direccion = H00172_A259Alma_Direccion[0] ;
            n259Alma_Direccion = H00172_n259Alma_Direccion[0] ;
            A29Tpal_Id = H00172_A29Tpal_Id[0] ;
            A252Alma_Descripcion = H00172_A252Alma_Descripcion[0] ;
            A265Alma_CedulaResponsable = H00172_A265Alma_CedulaResponsable[0] ;
            n265Alma_CedulaResponsable = H00172_n265Alma_CedulaResponsable[0] ;
            A268Alma_EmailResponsable = H00172_A268Alma_EmailResponsable[0] ;
            n268Alma_EmailResponsable = H00172_n268Alma_EmailResponsable[0] ;
            A266Alma_NombreResponsable = H00172_A266Alma_NombreResponsable[0] ;
            n266Alma_NombreResponsable = H00172_n266Alma_NombreResponsable[0] ;
            A307Tpal_Descripcion = H00172_A307Tpal_Descripcion[0] ;
            e13172 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(20) ;
         wb170( ) ;
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
      /* Using cursor H00173 */
      pr_default.execute(1, new Object[] {AV7BArea_Codigo, new Long(AV8Cent_Id)});
      GRID_nRecordCount = H00173_AGRID_nRecordCount[0] ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7BArea_Codigo, AV8Cent_Id, AV13Update, AV14Delete, A27Alma_Modulo, A28Alma_Codigo, A1Cent_Id, A29Tpal_Id, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7BArea_Codigo, AV8Cent_Id, AV13Update, AV14Delete, A27Alma_Modulo, A28Alma_Codigo, A1Cent_Id, A29Tpal_Id, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7BArea_Codigo, AV8Cent_Id, AV13Update, AV14Delete, A27Alma_Modulo, A28Alma_Codigo, A1Cent_Id, A29Tpal_Id, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7BArea_Codigo, AV8Cent_Id, AV13Update, AV14Delete, A27Alma_Modulo, A28Alma_Codigo, A1Cent_Id, A29Tpal_Id, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7BArea_Codigo, AV8Cent_Id, AV13Update, AV14Delete, A27Alma_Modulo, A28Alma_Codigo, A1Cent_Id, A29Tpal_Id, sPrefix) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup170( )
   {
      /* Before Start, stand alone formulas. */
      AV18Pgmname = "ALM_AREABODEGASWC" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e12172 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A32BArea_Codigo = httpContext.cgiGet( edtBArea_Codigo_Internalname) ;
         n32BArea_Codigo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A32BArea_Codigo", A32BArea_Codigo);
         A1Cent_Id = localUtil.ctol( httpContext.cgiGet( edtCent_Id_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
         /* Read saved values. */
         nRC_GXsfl_20 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_20"), ",", ".")) ;
         wcpOAV7BArea_Codigo = httpContext.cgiGet( sPrefix+"wcpOAV7BArea_Codigo") ;
         wcpOAV8Cent_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8Cent_Id"), ",", ".") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), ",", ".") ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), ",", ".")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), ",", ".")) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = sPrefix + "hsh" + "ALM_AREABODEGASWC" ;
         A1Cent_Id = localUtil.ctol( httpContext.cgiGet( edtCent_Id_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
         forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9") ;
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
         {
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            GXutil.writeLog("alm_areabodegaswc:[SecurityCheckFailed]"+forbiddenHiddens);
            return  ;
         }
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
      e12172 ();
      if (returnInSub) return;
   }

   public void e12172( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV18Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV18Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      subGrid_Rows = 10 ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV13Update = context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV13Update)==0) ? AV19Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV13Update))), !bGXsfl_20_Refreshing);
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV13Update), true);
      AV19Update_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV13Update)==0) ? AV19Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV13Update))), !bGXsfl_20_Refreshing);
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV13Update), true);
      edtavUpdate_Tooltiptext = "Modificar" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_20_Refreshing);
      AV14Delete = context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "Bitmap", ((GXutil.strcmp("", AV14Delete)==0) ? AV20Delete_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV14Delete))), !bGXsfl_20_Refreshing);
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV14Delete), true);
      AV20Delete_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "Bitmap", ((GXutil.strcmp("", AV14Delete)==0) ? AV20Delete_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV14Delete))), !bGXsfl_20_Refreshing);
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV14Delete), true);
      edtavDelete_Tooltiptext = "Eliminar" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "Tooltiptext", edtavDelete_Tooltiptext, !bGXsfl_20_Refreshing);
      edtBArea_Codigo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBArea_Codigo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtBArea_Codigo_Visible, 5, 0)), true);
      edtCent_Id_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCent_Id_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtCent_Id_Visible, 5, 0)), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
   }

   private void e13172( )
   {
      /* Grid_Load Routine */
      edtavUpdate_Link = formatLink("com.orions2.alm_almacen") + "?" + GXutil.URLEncode(GXutil.rtrim("UPD")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV8Cent_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(A27Alma_Modulo)) + "," + GXutil.URLEncode(GXutil.rtrim(A28Alma_Codigo)) ;
      edtavDelete_Link = formatLink("com.orions2.alm_almacen") + "?" + GXutil.URLEncode(GXutil.rtrim("DLT")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV8Cent_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(A27Alma_Modulo)) + "," + GXutil.URLEncode(GXutil.rtrim(A28Alma_Codigo)) ;
      edtCent_Descripcion_Link = formatLink("com.orions2.viewgen_centrocosto") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A1Cent_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      edtAlma_Descripcion_Link = formatLink("com.orions2.viewalm_almacen") + "?" + GXutil.URLEncode(GXutil.rtrim(A28Alma_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(A27Alma_Modulo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A1Cent_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      edtTpal_Descripcion_Link = formatLink("com.orions2.viewalm_tipo_almacen") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A29Tpal_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
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

   public void e11172( )
   {
      /* 'DoInsert' Routine */
      callWebObject(formatLink("com.orions2.alm_almacen") + "?" + GXutil.URLEncode(GXutil.rtrim("INS")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV8Cent_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")));
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV11TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV18Pgmname );
      AV11TrnContext.setgxTv_SdtTransactionContext_Callerondelete( true );
      AV11TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV10HTTPRequest.getScriptName()+"?"+AV10HTTPRequest.getQuerystring() );
      AV11TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_ALMACEN" );
      AV12TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV12TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "BArea_Codigo" );
      AV12TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( AV7BArea_Codigo );
      AV11TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV12TrnContextAtt, 0);
      AV12TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV12TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Cent_Id" );
      AV12TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV8Cent_Id, 11, 0) );
      AV11TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV12TrnContextAtt, 0);
      AV9Session.setValue("TrnContext", AV11TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      AV7BArea_Codigo = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BArea_Codigo", AV7BArea_Codigo);
      AV8Cent_Id = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Cent_Id", GXutil.ltrim( GXutil.str( AV8Cent_Id, 11, 0)));
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
      pa172( ) ;
      ws172( ) ;
      we172( ) ;
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
      sCtrlAV7BArea_Codigo = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV8Cent_Id = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa172( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "alm_areabodegaswc");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa172( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV7BArea_Codigo = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BArea_Codigo", AV7BArea_Codigo);
         AV8Cent_Id = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Cent_Id", GXutil.ltrim( GXutil.str( AV8Cent_Id, 11, 0)));
      }
      wcpOAV7BArea_Codigo = httpContext.cgiGet( sPrefix+"wcpOAV7BArea_Codigo") ;
      wcpOAV8Cent_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8Cent_Id"), ",", ".") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV7BArea_Codigo, wcpOAV7BArea_Codigo) != 0 ) || ( AV8Cent_Id != wcpOAV8Cent_Id ) ) )
      {
         setjustcreated();
      }
      wcpOAV7BArea_Codigo = AV7BArea_Codigo ;
      wcpOAV8Cent_Id = AV8Cent_Id ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV7BArea_Codigo = httpContext.cgiGet( sPrefix+"AV7BArea_Codigo_CTRL") ;
      if ( GXutil.len( sCtrlAV7BArea_Codigo) > 0 )
      {
         AV7BArea_Codigo = httpContext.cgiGet( sCtrlAV7BArea_Codigo) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BArea_Codigo", AV7BArea_Codigo);
      }
      else
      {
         AV7BArea_Codigo = httpContext.cgiGet( sPrefix+"AV7BArea_Codigo_PARM") ;
      }
      sCtrlAV8Cent_Id = httpContext.cgiGet( sPrefix+"AV8Cent_Id_CTRL") ;
      if ( GXutil.len( sCtrlAV8Cent_Id) > 0 )
      {
         AV8Cent_Id = localUtil.ctol( httpContext.cgiGet( sCtrlAV8Cent_Id), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Cent_Id", GXutil.ltrim( GXutil.str( AV8Cent_Id, 11, 0)));
      }
      else
      {
         AV8Cent_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"AV8Cent_Id_PARM"), ",", ".") ;
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
      pa172( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws172( ) ;
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
      ws172( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7BArea_Codigo_PARM", AV7BArea_Codigo);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7BArea_Codigo)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7BArea_Codigo_CTRL", GXutil.rtrim( sCtrlAV7BArea_Codigo));
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Cent_Id_PARM", GXutil.ltrim( localUtil.ntoc( AV8Cent_Id, (byte)(11), (byte)(0), ",", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8Cent_Id)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Cent_Id_CTRL", GXutil.rtrim( sCtrlAV8Cent_Id));
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
      we172( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414113725");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("alm_areabodegaswc.js", "?201861414113725");
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_202( )
   {
      edtCent_Codigo_Internalname = sPrefix+"CENT_CODIGO_"+sGXsfl_20_idx ;
      edtCent_Descripcion_Internalname = sPrefix+"CENT_DESCRIPCION_"+sGXsfl_20_idx ;
      cmbAlma_Modulo.setInternalname( sPrefix+"ALMA_MODULO_"+sGXsfl_20_idx );
      edtAlma_Codigo_Internalname = sPrefix+"ALMA_CODIGO_"+sGXsfl_20_idx ;
      edtAlma_Descripcion_Internalname = sPrefix+"ALMA_DESCRIPCION_"+sGXsfl_20_idx ;
      edtTpal_Id_Internalname = sPrefix+"TPAL_ID_"+sGXsfl_20_idx ;
      edtTpal_Descripcion_Internalname = sPrefix+"TPAL_DESCRIPCION_"+sGXsfl_20_idx ;
      edtAlma_Direccion_Internalname = sPrefix+"ALMA_DIRECCION_"+sGXsfl_20_idx ;
      edtAlma_Telefono1_Internalname = sPrefix+"ALMA_TELEFONO1_"+sGXsfl_20_idx ;
      edtAlma_Telefono2_Internalname = sPrefix+"ALMA_TELEFONO2_"+sGXsfl_20_idx ;
      edtAlma_Fax_Internalname = sPrefix+"ALMA_FAX_"+sGXsfl_20_idx ;
      edtAlma_IdResponsable_Internalname = sPrefix+"ALMA_IDRESPONSABLE_"+sGXsfl_20_idx ;
      edtAlma_NombreResponsable_Internalname = sPrefix+"ALMA_NOMBRERESPONSABLE_"+sGXsfl_20_idx ;
      edtAlma_EmailResponsable_Internalname = sPrefix+"ALMA_EMAILRESPONSABLE_"+sGXsfl_20_idx ;
      edtAlma_CuentaDebito_Internalname = sPrefix+"ALMA_CUENTADEBITO_"+sGXsfl_20_idx ;
      edtAlma_CuentaCredito_Internalname = sPrefix+"ALMA_CUENTACREDITO_"+sGXsfl_20_idx ;
      edtAlma_FechaCrea_Internalname = sPrefix+"ALMA_FECHACREA_"+sGXsfl_20_idx ;
      edtAlma_UsuarioCrea_Internalname = sPrefix+"ALMA_USUARIOCREA_"+sGXsfl_20_idx ;
      edtAlma_FechaModifica_Internalname = sPrefix+"ALMA_FECHAMODIFICA_"+sGXsfl_20_idx ;
      edtAlma_UsuarioModifica_Internalname = sPrefix+"ALMA_USUARIOMODIFICA_"+sGXsfl_20_idx ;
      cmbAlma_Estado.setInternalname( sPrefix+"ALMA_ESTADO_"+sGXsfl_20_idx );
      edtAlma_CedulaResponsable_Internalname = sPrefix+"ALMA_CEDULARESPONSABLE_"+sGXsfl_20_idx ;
      edtavUpdate_Internalname = sPrefix+"vUPDATE_"+sGXsfl_20_idx ;
      edtavDelete_Internalname = sPrefix+"vDELETE_"+sGXsfl_20_idx ;
   }

   public void subsflControlProps_fel_202( )
   {
      edtCent_Codigo_Internalname = sPrefix+"CENT_CODIGO_"+sGXsfl_20_fel_idx ;
      edtCent_Descripcion_Internalname = sPrefix+"CENT_DESCRIPCION_"+sGXsfl_20_fel_idx ;
      cmbAlma_Modulo.setInternalname( sPrefix+"ALMA_MODULO_"+sGXsfl_20_fel_idx );
      edtAlma_Codigo_Internalname = sPrefix+"ALMA_CODIGO_"+sGXsfl_20_fel_idx ;
      edtAlma_Descripcion_Internalname = sPrefix+"ALMA_DESCRIPCION_"+sGXsfl_20_fel_idx ;
      edtTpal_Id_Internalname = sPrefix+"TPAL_ID_"+sGXsfl_20_fel_idx ;
      edtTpal_Descripcion_Internalname = sPrefix+"TPAL_DESCRIPCION_"+sGXsfl_20_fel_idx ;
      edtAlma_Direccion_Internalname = sPrefix+"ALMA_DIRECCION_"+sGXsfl_20_fel_idx ;
      edtAlma_Telefono1_Internalname = sPrefix+"ALMA_TELEFONO1_"+sGXsfl_20_fel_idx ;
      edtAlma_Telefono2_Internalname = sPrefix+"ALMA_TELEFONO2_"+sGXsfl_20_fel_idx ;
      edtAlma_Fax_Internalname = sPrefix+"ALMA_FAX_"+sGXsfl_20_fel_idx ;
      edtAlma_IdResponsable_Internalname = sPrefix+"ALMA_IDRESPONSABLE_"+sGXsfl_20_fel_idx ;
      edtAlma_NombreResponsable_Internalname = sPrefix+"ALMA_NOMBRERESPONSABLE_"+sGXsfl_20_fel_idx ;
      edtAlma_EmailResponsable_Internalname = sPrefix+"ALMA_EMAILRESPONSABLE_"+sGXsfl_20_fel_idx ;
      edtAlma_CuentaDebito_Internalname = sPrefix+"ALMA_CUENTADEBITO_"+sGXsfl_20_fel_idx ;
      edtAlma_CuentaCredito_Internalname = sPrefix+"ALMA_CUENTACREDITO_"+sGXsfl_20_fel_idx ;
      edtAlma_FechaCrea_Internalname = sPrefix+"ALMA_FECHACREA_"+sGXsfl_20_fel_idx ;
      edtAlma_UsuarioCrea_Internalname = sPrefix+"ALMA_USUARIOCREA_"+sGXsfl_20_fel_idx ;
      edtAlma_FechaModifica_Internalname = sPrefix+"ALMA_FECHAMODIFICA_"+sGXsfl_20_fel_idx ;
      edtAlma_UsuarioModifica_Internalname = sPrefix+"ALMA_USUARIOMODIFICA_"+sGXsfl_20_fel_idx ;
      cmbAlma_Estado.setInternalname( sPrefix+"ALMA_ESTADO_"+sGXsfl_20_fel_idx );
      edtAlma_CedulaResponsable_Internalname = sPrefix+"ALMA_CEDULARESPONSABLE_"+sGXsfl_20_fel_idx ;
      edtavUpdate_Internalname = sPrefix+"vUPDATE_"+sGXsfl_20_fel_idx ;
      edtavDelete_Internalname = sPrefix+"vDELETE_"+sGXsfl_20_fel_idx ;
   }

   public void sendrow_202( )
   {
      subsflControlProps_202( ) ;
      wb170( ) ;
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
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCent_Codigo_Internalname,A3Cent_Codigo,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCent_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(16),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCent_Descripcion_Internalname,A4Cent_Descripcion,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'",edtCent_Descripcion_Link,"","","",edtCent_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_20_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALMA_MODULO_" + sGXsfl_20_idx ;
            cmbAlma_Modulo.setName( GXCCtl );
            cmbAlma_Modulo.setWebtags( "" );
            cmbAlma_Modulo.addItem("ALMA", "ALMACEN", (short)(0));
            cmbAlma_Modulo.addItem("INVE", "INVENTARIO", (short)(0));
            cmbAlma_Modulo.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
            if ( cmbAlma_Modulo.getItemCount() > 0 )
            {
               A27Alma_Modulo = cmbAlma_Modulo.getValidValue(A27Alma_Modulo) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlma_Modulo,cmbAlma_Modulo.getInternalname(),GXutil.rtrim( A27Alma_Modulo),new Integer(1),cmbAlma_Modulo.getJsonclick(),new Integer(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbAlma_Modulo.setValue( GXutil.rtrim( A27Alma_Modulo) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlma_Modulo.getInternalname(), "Values", cmbAlma_Modulo.ToJavascriptSource(), !bGXsfl_20_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlma_Codigo_Internalname,A28Alma_Codigo,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlma_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlma_Descripcion_Internalname,A252Alma_Descripcion,GXutil.rtrim( localUtil.format( A252Alma_Descripcion, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'",edtAlma_Descripcion_Link,"","","",edtAlma_Descripcion_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTpal_Id_Internalname,GXutil.ltrim( localUtil.ntoc( A29Tpal_Id, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A29Tpal_Id), "ZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTpal_Id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTpal_Descripcion_Internalname,A307Tpal_Descripcion,GXutil.rtrim( localUtil.format( A307Tpal_Descripcion, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'",edtTpal_Descripcion_Link,"","","",edtTpal_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlma_Direccion_Internalname,A259Alma_Direccion,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","http://maps.google.com/maps?q="+PrivateUtilities.encodeURL( A259Alma_Direccion),"_blank","","",edtAlma_Direccion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1024),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"GeneXus\\Address","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlma_Telefono1_Internalname,GXutil.ltrim( localUtil.ntoc( A260Alma_Telefono1, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A260Alma_Telefono1), "ZZZZZZZZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlma_Telefono1_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlma_Telefono2_Internalname,GXutil.ltrim( localUtil.ntoc( A261Alma_Telefono2, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A261Alma_Telefono2), "ZZZZZZZZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlma_Telefono2_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlma_Fax_Internalname,GXutil.ltrim( localUtil.ntoc( A262Alma_Fax, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A262Alma_Fax), "ZZZZZZZZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlma_Fax_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlma_IdResponsable_Internalname,GXutil.ltrim( localUtil.ntoc( A30Alma_IdResponsable, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A30Alma_IdResponsable), "ZZZZZZZZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlma_IdResponsable_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlma_NombreResponsable_Internalname,A266Alma_NombreResponsable,GXutil.rtrim( localUtil.format( A266Alma_NombreResponsable, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlma_NombreResponsable_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlma_EmailResponsable_Internalname,A268Alma_EmailResponsable,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","mailto:"+A268Alma_EmailResponsable,"","","",edtAlma_EmailResponsable_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"email","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"GeneXus\\Email","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlma_CuentaDebito_Internalname,A263Alma_CuentaDebito,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlma_CuentaDebito_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(16),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlma_CuentaCredito_Internalname,A264Alma_CuentaCredito,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlma_CuentaCredito_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(16),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlma_FechaCrea_Internalname,localUtil.ttoc( A255Alma_FechaCrea, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A255Alma_FechaCrea, "99/99/99 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlma_FechaCrea_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlma_UsuarioCrea_Internalname,A256Alma_UsuarioCrea,GXutil.rtrim( localUtil.format( A256Alma_UsuarioCrea, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlma_UsuarioCrea_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlma_FechaModifica_Internalname,localUtil.ttoc( A257Alma_FechaModifica, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A257Alma_FechaModifica, "99/99/99 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlma_FechaModifica_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlma_UsuarioModifica_Internalname,A258Alma_UsuarioModifica,GXutil.rtrim( localUtil.format( A258Alma_UsuarioModifica, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlma_UsuarioModifica_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         GXCCtl = "ALMA_ESTADO_" + sGXsfl_20_idx ;
         cmbAlma_Estado.setName( GXCCtl );
         cmbAlma_Estado.setWebtags( "" );
         cmbAlma_Estado.addItem("A", "Activo", (short)(0));
         cmbAlma_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbAlma_Estado.getItemCount() > 0 )
         {
            A673Alma_Estado = cmbAlma_Estado.getValidValue(A673Alma_Estado) ;
            n673Alma_Estado = false ;
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlma_Estado,cmbAlma_Estado.getInternalname(),GXutil.rtrim( A673Alma_Estado),new Integer(1),cmbAlma_Estado.getJsonclick(),new Integer(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(0),new Integer(1),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbAlma_Estado.setValue( GXutil.rtrim( A673Alma_Estado) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlma_Estado.getInternalname(), "Values", cmbAlma_Estado.ToJavascriptSource(), !bGXsfl_20_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlma_CedulaResponsable_Internalname,GXutil.ltrim( localUtil.ntoc( A265Alma_CedulaResponsable, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A265Alma_CedulaResponsable), "ZZZZZZZZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlma_CedulaResponsable_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         ClassString = "UpdateAttribute" ;
         StyleString = "" ;
         AV13Update_IsBlob = (boolean)(((GXutil.strcmp("", AV13Update)==0)&&(GXutil.strcmp("", AV19Update_GXI)==0))||!(GXutil.strcmp("", AV13Update)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV13Update)==0) ? AV19Update_GXI : httpContext.getResourceRelative(AV13Update)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavUpdate_Internalname,sImgUrl,edtavUpdate_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"",edtavUpdate_Tooltiptext,new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV13Update_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         ClassString = "DeleteAttribute" ;
         StyleString = "" ;
         AV14Delete_IsBlob = (boolean)(((GXutil.strcmp("", AV14Delete)==0)&&(GXutil.strcmp("", AV20Delete_GXI)==0))||!(GXutil.strcmp("", AV14Delete)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV14Delete)==0) ? AV20Delete_GXI : httpContext.getResourceRelative(AV14Delete)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavDelete_Internalname,sImgUrl,edtavDelete_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"",edtavDelete_Tooltiptext,new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV14Delete_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALMA_MODULO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A27Alma_Modulo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALMA_CODIGO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A28Alma_Codigo, ""))));
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
      edtCent_Codigo_Internalname = sPrefix+"CENT_CODIGO" ;
      edtCent_Descripcion_Internalname = sPrefix+"CENT_DESCRIPCION" ;
      cmbAlma_Modulo.setInternalname( sPrefix+"ALMA_MODULO" );
      edtAlma_Codigo_Internalname = sPrefix+"ALMA_CODIGO" ;
      edtAlma_Descripcion_Internalname = sPrefix+"ALMA_DESCRIPCION" ;
      edtTpal_Id_Internalname = sPrefix+"TPAL_ID" ;
      edtTpal_Descripcion_Internalname = sPrefix+"TPAL_DESCRIPCION" ;
      edtAlma_Direccion_Internalname = sPrefix+"ALMA_DIRECCION" ;
      edtAlma_Telefono1_Internalname = sPrefix+"ALMA_TELEFONO1" ;
      edtAlma_Telefono2_Internalname = sPrefix+"ALMA_TELEFONO2" ;
      edtAlma_Fax_Internalname = sPrefix+"ALMA_FAX" ;
      edtAlma_IdResponsable_Internalname = sPrefix+"ALMA_IDRESPONSABLE" ;
      edtAlma_NombreResponsable_Internalname = sPrefix+"ALMA_NOMBRERESPONSABLE" ;
      edtAlma_EmailResponsable_Internalname = sPrefix+"ALMA_EMAILRESPONSABLE" ;
      edtAlma_CuentaDebito_Internalname = sPrefix+"ALMA_CUENTADEBITO" ;
      edtAlma_CuentaCredito_Internalname = sPrefix+"ALMA_CUENTACREDITO" ;
      edtAlma_FechaCrea_Internalname = sPrefix+"ALMA_FECHACREA" ;
      edtAlma_UsuarioCrea_Internalname = sPrefix+"ALMA_USUARIOCREA" ;
      edtAlma_FechaModifica_Internalname = sPrefix+"ALMA_FECHAMODIFICA" ;
      edtAlma_UsuarioModifica_Internalname = sPrefix+"ALMA_USUARIOMODIFICA" ;
      cmbAlma_Estado.setInternalname( sPrefix+"ALMA_ESTADO" );
      edtAlma_CedulaResponsable_Internalname = sPrefix+"ALMA_CEDULARESPONSABLE" ;
      edtavUpdate_Internalname = sPrefix+"vUPDATE" ;
      edtavDelete_Internalname = sPrefix+"vDELETE" ;
      divGridtable_Internalname = sPrefix+"GRIDTABLE" ;
      divGridcell_Internalname = sPrefix+"GRIDCELL" ;
      edtBArea_Codigo_Internalname = sPrefix+"BAREA_CODIGO" ;
      edtCent_Id_Internalname = sPrefix+"CENT_ID" ;
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
      edtAlma_CedulaResponsable_Jsonclick = "" ;
      cmbAlma_Estado.setJsonclick( "" );
      edtAlma_UsuarioModifica_Jsonclick = "" ;
      edtAlma_FechaModifica_Jsonclick = "" ;
      edtAlma_UsuarioCrea_Jsonclick = "" ;
      edtAlma_FechaCrea_Jsonclick = "" ;
      edtAlma_CuentaCredito_Jsonclick = "" ;
      edtAlma_CuentaDebito_Jsonclick = "" ;
      edtAlma_EmailResponsable_Jsonclick = "" ;
      edtAlma_NombreResponsable_Jsonclick = "" ;
      edtAlma_IdResponsable_Jsonclick = "" ;
      edtAlma_Fax_Jsonclick = "" ;
      edtAlma_Telefono2_Jsonclick = "" ;
      edtAlma_Telefono1_Jsonclick = "" ;
      edtAlma_Direccion_Jsonclick = "" ;
      edtTpal_Descripcion_Jsonclick = "" ;
      edtTpal_Id_Jsonclick = "" ;
      edtAlma_Descripcion_Jsonclick = "" ;
      edtAlma_Codigo_Jsonclick = "" ;
      cmbAlma_Modulo.setJsonclick( "" );
      edtCent_Descripcion_Jsonclick = "" ;
      edtCent_Codigo_Jsonclick = "" ;
      edtCent_Id_Jsonclick = "" ;
      edtCent_Id_Enabled = 0 ;
      edtCent_Id_Visible = 1 ;
      edtBArea_Codigo_Jsonclick = "" ;
      edtBArea_Codigo_Enabled = 0 ;
      edtBArea_Codigo_Visible = 1 ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      edtavDelete_Link = "" ;
      edtavUpdate_Link = "" ;
      edtTpal_Descripcion_Link = "" ;
      edtAlma_Descripcion_Link = "" ;
      edtCent_Descripcion_Link = "" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7BArea_Codigo',fld:'vBAREA_CODIGO',pic:'',nv:''},{av:'AV8Cent_Id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV13Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV14Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'cmbAlma_Modulo'},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',hsh:true,nv:''},{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',hsh:true,nv:''},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A29Tpal_Id',fld:'TPAL_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e13172',iparms:[{av:'AV8Cent_Id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbAlma_Modulo'},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',hsh:true,nv:''},{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',hsh:true,nv:''},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A29Tpal_Id',fld:'TPAL_ID',pic:'ZZZZZZZZZZ9',nv:0}],oparms:[{av:'edtavUpdate_Link',ctrl:'vUPDATE',prop:'Link'},{av:'edtavDelete_Link',ctrl:'vDELETE',prop:'Link'},{av:'edtCent_Descripcion_Link',ctrl:'CENT_DESCRIPCION',prop:'Link'},{av:'edtAlma_Descripcion_Link',ctrl:'ALMA_DESCRIPCION',prop:'Link'},{av:'edtTpal_Descripcion_Link',ctrl:'TPAL_DESCRIPCION',prop:'Link'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e11172',iparms:[{av:'AV8Cent_Id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbAlma_Modulo'},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',hsh:true,nv:''},{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',hsh:true,nv:''}],oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7BArea_Codigo',fld:'vBAREA_CODIGO',pic:'',nv:''},{av:'AV8Cent_Id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV13Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV14Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'cmbAlma_Modulo'},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',hsh:true,nv:''},{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',hsh:true,nv:''},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A29Tpal_Id',fld:'TPAL_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7BArea_Codigo',fld:'vBAREA_CODIGO',pic:'',nv:''},{av:'AV8Cent_Id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV13Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV14Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'cmbAlma_Modulo'},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',hsh:true,nv:''},{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',hsh:true,nv:''},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A29Tpal_Id',fld:'TPAL_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7BArea_Codigo',fld:'vBAREA_CODIGO',pic:'',nv:''},{av:'AV8Cent_Id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV13Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV14Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'cmbAlma_Modulo'},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',hsh:true,nv:''},{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',hsh:true,nv:''},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A29Tpal_Id',fld:'TPAL_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7BArea_Codigo',fld:'vBAREA_CODIGO',pic:'',nv:''},{av:'AV8Cent_Id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV13Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV14Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'cmbAlma_Modulo'},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',hsh:true,nv:''},{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',hsh:true,nv:''},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A29Tpal_Id',fld:'TPAL_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
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
      wcpOAV7BArea_Codigo = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV7BArea_Codigo = "" ;
      AV13Update = "" ;
      AV14Delete = "" ;
      A27Alma_Modulo = "" ;
      A28Alma_Codigo = "" ;
      GXKey = "" ;
      forbiddenHiddens = "" ;
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
      A3Cent_Codigo = "" ;
      A4Cent_Descripcion = "" ;
      A252Alma_Descripcion = "" ;
      A307Tpal_Descripcion = "" ;
      A259Alma_Direccion = "" ;
      A266Alma_NombreResponsable = "" ;
      A268Alma_EmailResponsable = "" ;
      A263Alma_CuentaDebito = "" ;
      A264Alma_CuentaCredito = "" ;
      A255Alma_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A256Alma_UsuarioCrea = "" ;
      A257Alma_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      A258Alma_UsuarioModifica = "" ;
      A673Alma_Estado = "" ;
      A32BArea_Codigo = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV19Update_GXI = "" ;
      AV20Delete_GXI = "" ;
      GXCCtl = "" ;
      AV18Pgmname = "" ;
      scmdbuf = "" ;
      H00172_A31Bode_Codigo = new String[] {""} ;
      H00172_A32BArea_Codigo = new String[] {""} ;
      H00172_n32BArea_Codigo = new boolean[] {false} ;
      H00172_A1Cent_Id = new long[1] ;
      H00172_A265Alma_CedulaResponsable = new long[1] ;
      H00172_n265Alma_CedulaResponsable = new boolean[] {false} ;
      H00172_A673Alma_Estado = new String[] {""} ;
      H00172_n673Alma_Estado = new boolean[] {false} ;
      H00172_A258Alma_UsuarioModifica = new String[] {""} ;
      H00172_n258Alma_UsuarioModifica = new boolean[] {false} ;
      H00172_A257Alma_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H00172_n257Alma_FechaModifica = new boolean[] {false} ;
      H00172_A256Alma_UsuarioCrea = new String[] {""} ;
      H00172_n256Alma_UsuarioCrea = new boolean[] {false} ;
      H00172_A255Alma_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      H00172_n255Alma_FechaCrea = new boolean[] {false} ;
      H00172_A264Alma_CuentaCredito = new String[] {""} ;
      H00172_n264Alma_CuentaCredito = new boolean[] {false} ;
      H00172_A263Alma_CuentaDebito = new String[] {""} ;
      H00172_n263Alma_CuentaDebito = new boolean[] {false} ;
      H00172_A268Alma_EmailResponsable = new String[] {""} ;
      H00172_n268Alma_EmailResponsable = new boolean[] {false} ;
      H00172_A266Alma_NombreResponsable = new String[] {""} ;
      H00172_n266Alma_NombreResponsable = new boolean[] {false} ;
      H00172_A30Alma_IdResponsable = new long[1] ;
      H00172_A262Alma_Fax = new long[1] ;
      H00172_n262Alma_Fax = new boolean[] {false} ;
      H00172_A261Alma_Telefono2 = new long[1] ;
      H00172_n261Alma_Telefono2 = new boolean[] {false} ;
      H00172_A260Alma_Telefono1 = new long[1] ;
      H00172_n260Alma_Telefono1 = new boolean[] {false} ;
      H00172_A259Alma_Direccion = new String[] {""} ;
      H00172_n259Alma_Direccion = new boolean[] {false} ;
      H00172_A307Tpal_Descripcion = new String[] {""} ;
      H00172_A29Tpal_Id = new long[1] ;
      H00172_A252Alma_Descripcion = new String[] {""} ;
      H00172_A28Alma_Codigo = new String[] {""} ;
      H00172_A27Alma_Modulo = new String[] {""} ;
      H00172_A4Cent_Descripcion = new String[] {""} ;
      H00172_A3Cent_Codigo = new String[] {""} ;
      H00173_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV11TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV10HTTPRequest = httpContext.getHttpRequest();
      AV12TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV9Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV7BArea_Codigo = "" ;
      sCtrlAV8Cent_Id = "" ;
      ROClassString = "" ;
      sImgUrl = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_areabodegaswc__default(),
         new Object[] {
             new Object[] {
            H00172_A31Bode_Codigo, H00172_A32BArea_Codigo, H00172_n32BArea_Codigo, H00172_A1Cent_Id, H00172_A265Alma_CedulaResponsable, H00172_n265Alma_CedulaResponsable, H00172_A673Alma_Estado, H00172_n673Alma_Estado, H00172_A258Alma_UsuarioModifica, H00172_n258Alma_UsuarioModifica,
            H00172_A257Alma_FechaModifica, H00172_n257Alma_FechaModifica, H00172_A256Alma_UsuarioCrea, H00172_n256Alma_UsuarioCrea, H00172_A255Alma_FechaCrea, H00172_n255Alma_FechaCrea, H00172_A264Alma_CuentaCredito, H00172_n264Alma_CuentaCredito, H00172_A263Alma_CuentaDebito, H00172_n263Alma_CuentaDebito,
            H00172_A268Alma_EmailResponsable, H00172_n268Alma_EmailResponsable, H00172_A266Alma_NombreResponsable, H00172_n266Alma_NombreResponsable, H00172_A30Alma_IdResponsable, H00172_A262Alma_Fax, H00172_n262Alma_Fax, H00172_A261Alma_Telefono2, H00172_n261Alma_Telefono2, H00172_A260Alma_Telefono1,
            H00172_n260Alma_Telefono1, H00172_A259Alma_Direccion, H00172_n259Alma_Direccion, H00172_A307Tpal_Descripcion, H00172_A29Tpal_Id, H00172_A252Alma_Descripcion, H00172_A28Alma_Codigo, H00172_A27Alma_Modulo, H00172_A4Cent_Descripcion, H00172_A3Cent_Codigo
            }
            , new Object[] {
            H00173_AGRID_nRecordCount
            }
         }
      );
      AV18Pgmname = "ALM_AREABODEGASWC" ;
      /* GeneXus formulas. */
      AV18Pgmname = "ALM_AREABODEGASWC" ;
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
   private int edtBArea_Codigo_Visible ;
   private int edtBArea_Codigo_Enabled ;
   private int edtCent_Id_Enabled ;
   private int edtCent_Id_Visible ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private long wcpOAV8Cent_Id ;
   private long AV8Cent_Id ;
   private long A1Cent_Id ;
   private long A29Tpal_Id ;
   private long GRID_nFirstRecordOnPage ;
   private long A260Alma_Telefono1 ;
   private long A261Alma_Telefono2 ;
   private long A262Alma_Fax ;
   private long A30Alma_IdResponsable ;
   private long A265Alma_CedulaResponsable ;
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
   private String forbiddenHiddens ;
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
   private String edtCent_Descripcion_Link ;
   private String edtAlma_Descripcion_Link ;
   private String edtTpal_Descripcion_Link ;
   private String A673Alma_Estado ;
   private String edtavUpdate_Link ;
   private String edtavDelete_Link ;
   private String edtBArea_Codigo_Internalname ;
   private String edtBArea_Codigo_Jsonclick ;
   private String edtCent_Id_Internalname ;
   private String edtCent_Id_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtCent_Codigo_Internalname ;
   private String edtCent_Descripcion_Internalname ;
   private String edtAlma_Codigo_Internalname ;
   private String edtAlma_Descripcion_Internalname ;
   private String edtTpal_Id_Internalname ;
   private String edtTpal_Descripcion_Internalname ;
   private String edtAlma_Direccion_Internalname ;
   private String edtAlma_Telefono1_Internalname ;
   private String edtAlma_Telefono2_Internalname ;
   private String edtAlma_Fax_Internalname ;
   private String edtAlma_IdResponsable_Internalname ;
   private String edtAlma_NombreResponsable_Internalname ;
   private String edtAlma_EmailResponsable_Internalname ;
   private String edtAlma_CuentaDebito_Internalname ;
   private String edtAlma_CuentaCredito_Internalname ;
   private String edtAlma_FechaCrea_Internalname ;
   private String edtAlma_UsuarioCrea_Internalname ;
   private String edtAlma_FechaModifica_Internalname ;
   private String edtAlma_UsuarioModifica_Internalname ;
   private String edtAlma_CedulaResponsable_Internalname ;
   private String GXCCtl ;
   private String AV18Pgmname ;
   private String scmdbuf ;
   private String hsh ;
   private String sCtrlAV7BArea_Codigo ;
   private String sCtrlAV8Cent_Id ;
   private String sGXsfl_20_fel_idx="0001" ;
   private String ROClassString ;
   private String edtCent_Codigo_Jsonclick ;
   private String edtCent_Descripcion_Jsonclick ;
   private String edtAlma_Codigo_Jsonclick ;
   private String edtAlma_Descripcion_Jsonclick ;
   private String edtTpal_Id_Jsonclick ;
   private String edtTpal_Descripcion_Jsonclick ;
   private String edtAlma_Direccion_Jsonclick ;
   private String edtAlma_Telefono1_Jsonclick ;
   private String edtAlma_Telefono2_Jsonclick ;
   private String edtAlma_Fax_Jsonclick ;
   private String edtAlma_IdResponsable_Jsonclick ;
   private String edtAlma_NombreResponsable_Jsonclick ;
   private String edtAlma_EmailResponsable_Jsonclick ;
   private String edtAlma_CuentaDebito_Jsonclick ;
   private String edtAlma_CuentaCredito_Jsonclick ;
   private String edtAlma_FechaCrea_Jsonclick ;
   private String edtAlma_UsuarioCrea_Jsonclick ;
   private String edtAlma_FechaModifica_Jsonclick ;
   private String edtAlma_UsuarioModifica_Jsonclick ;
   private String edtAlma_CedulaResponsable_Jsonclick ;
   private String sImgUrl ;
   private java.util.Date A255Alma_FechaCrea ;
   private java.util.Date A257Alma_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean bGXsfl_20_Refreshing=false ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n259Alma_Direccion ;
   private boolean n260Alma_Telefono1 ;
   private boolean n261Alma_Telefono2 ;
   private boolean n262Alma_Fax ;
   private boolean n266Alma_NombreResponsable ;
   private boolean n268Alma_EmailResponsable ;
   private boolean n263Alma_CuentaDebito ;
   private boolean n264Alma_CuentaCredito ;
   private boolean n255Alma_FechaCrea ;
   private boolean n256Alma_UsuarioCrea ;
   private boolean n257Alma_FechaModifica ;
   private boolean n258Alma_UsuarioModifica ;
   private boolean n673Alma_Estado ;
   private boolean n265Alma_CedulaResponsable ;
   private boolean n32BArea_Codigo ;
   private boolean returnInSub ;
   private boolean AV13Update_IsBlob ;
   private boolean AV14Delete_IsBlob ;
   private String wcpOAV7BArea_Codigo ;
   private String AV7BArea_Codigo ;
   private String A27Alma_Modulo ;
   private String A28Alma_Codigo ;
   private String A3Cent_Codigo ;
   private String A4Cent_Descripcion ;
   private String A252Alma_Descripcion ;
   private String A307Tpal_Descripcion ;
   private String A259Alma_Direccion ;
   private String A266Alma_NombreResponsable ;
   private String A268Alma_EmailResponsable ;
   private String A263Alma_CuentaDebito ;
   private String A264Alma_CuentaCredito ;
   private String A256Alma_UsuarioCrea ;
   private String A258Alma_UsuarioModifica ;
   private String A32BArea_Codigo ;
   private String AV19Update_GXI ;
   private String AV20Delete_GXI ;
   private String AV13Update ;
   private String AV14Delete ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private HTMLChoice cmbAlma_Modulo ;
   private HTMLChoice cmbAlma_Estado ;
   private IDataStoreProvider pr_default ;
   private String[] H00172_A31Bode_Codigo ;
   private String[] H00172_A32BArea_Codigo ;
   private boolean[] H00172_n32BArea_Codigo ;
   private long[] H00172_A1Cent_Id ;
   private long[] H00172_A265Alma_CedulaResponsable ;
   private boolean[] H00172_n265Alma_CedulaResponsable ;
   private String[] H00172_A673Alma_Estado ;
   private boolean[] H00172_n673Alma_Estado ;
   private String[] H00172_A258Alma_UsuarioModifica ;
   private boolean[] H00172_n258Alma_UsuarioModifica ;
   private java.util.Date[] H00172_A257Alma_FechaModifica ;
   private boolean[] H00172_n257Alma_FechaModifica ;
   private String[] H00172_A256Alma_UsuarioCrea ;
   private boolean[] H00172_n256Alma_UsuarioCrea ;
   private java.util.Date[] H00172_A255Alma_FechaCrea ;
   private boolean[] H00172_n255Alma_FechaCrea ;
   private String[] H00172_A264Alma_CuentaCredito ;
   private boolean[] H00172_n264Alma_CuentaCredito ;
   private String[] H00172_A263Alma_CuentaDebito ;
   private boolean[] H00172_n263Alma_CuentaDebito ;
   private String[] H00172_A268Alma_EmailResponsable ;
   private boolean[] H00172_n268Alma_EmailResponsable ;
   private String[] H00172_A266Alma_NombreResponsable ;
   private boolean[] H00172_n266Alma_NombreResponsable ;
   private long[] H00172_A30Alma_IdResponsable ;
   private long[] H00172_A262Alma_Fax ;
   private boolean[] H00172_n262Alma_Fax ;
   private long[] H00172_A261Alma_Telefono2 ;
   private boolean[] H00172_n261Alma_Telefono2 ;
   private long[] H00172_A260Alma_Telefono1 ;
   private boolean[] H00172_n260Alma_Telefono1 ;
   private String[] H00172_A259Alma_Direccion ;
   private boolean[] H00172_n259Alma_Direccion ;
   private String[] H00172_A307Tpal_Descripcion ;
   private long[] H00172_A29Tpal_Id ;
   private String[] H00172_A252Alma_Descripcion ;
   private String[] H00172_A28Alma_Codigo ;
   private String[] H00172_A27Alma_Modulo ;
   private String[] H00172_A4Cent_Descripcion ;
   private String[] H00172_A3Cent_Codigo ;
   private long[] H00173_AGRID_nRecordCount ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private com.orions2.SdtTransactionContext AV11TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV12TrnContextAtt ;
}

final  class alm_areabodegaswc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00172", "SELECT T1.Bode_Codigo, T1.BArea_Codigo, T1.Cent_Id, T4.Cuen_Cedula AS Alma_CedulaResponsable, T3.Alma_Estado, T3.Alma_UsuarioModifica, T3.Alma_FechaModifica, T3.Alma_UsuarioCrea, T3.Alma_FechaCrea, T3.Alma_CuentaCredito, T3.Alma_CuentaDebito, T4.Cuen_Email AS Alma_EmailResponsable, T4.Cuen_Nombre AS Alma_NombreResponsable, T3.Alma_IdResponsable AS Alma_IdResponsable, T3.Alma_Fax, T3.Alma_Telefono2, T3.Alma_Telefono1, T3.Alma_Direccion, T5.Tpal_Descripcion, T3.Tpal_Id, T3.Alma_Descripcion, T1.Alma_Codigo, T1.Alma_Modulo, T2.Cent_Descripcion, T2.Cent_Codigo FROM ((((ALM_ALMACEN_BODEGAS T1 INNER JOIN GEN_CENTROCOSTO T2 ON T2.Cent_Id = T1.Cent_Id) INNER JOIN ALM_ALMACEN T3 ON T3.Cent_Id = T1.Cent_Id AND T3.Alma_Modulo = T1.Alma_Modulo AND T3.Alma_Codigo = T1.Alma_Codigo) INNER JOIN ALM_CUENTADANTE T4 ON T4.Cuen_Identificacion = T3.Alma_IdResponsable) INNER JOIN ALM_TIPO_ALMACEN T5 ON T5.Tpal_Id = T3.Tpal_Id) WHERE T1.BArea_Codigo = ? and T1.Cent_Id = ? ORDER BY T1.BArea_Codigo, T1.Cent_Id  OFFSET ? ROWS FETCH NEXT (CASE WHEN ? > 0 THEN ? ELSE 1e9 END) ROWS ONLY",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H00173", "SELECT COUNT(*) FROM ((((ALM_ALMACEN_BODEGAS T1 INNER JOIN GEN_CENTROCOSTO T2 ON T2.Cent_Id = T1.Cent_Id) INNER JOIN ALM_ALMACEN T3 ON T3.Cent_Id = T1.Cent_Id AND T3.Alma_Modulo = T1.Alma_Modulo AND T3.Alma_Codigo = T1.Alma_Codigo) INNER JOIN ALM_CUENTADANTE T5 ON T5.Cuen_Identificacion = T3.Alma_IdResponsable) INNER JOIN ALM_TIPO_ALMACEN T4 ON T4.Tpal_Id = T3.Tpal_Id) WHERE T1.BArea_Codigo = ? and T1.Cent_Id = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((String[]) buf[6])[0] = rslt.getString(5, 1) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((long[]) buf[24])[0] = rslt.getLong(14) ;
               ((long[]) buf[25])[0] = rslt.getLong(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((long[]) buf[27])[0] = rslt.getLong(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((long[]) buf[29])[0] = rslt.getLong(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19) ;
               ((long[]) buf[34])[0] = rslt.getLong(20) ;
               ((String[]) buf[35])[0] = rslt.getVarchar(21) ;
               ((String[]) buf[36])[0] = rslt.getVarchar(22) ;
               ((String[]) buf[37])[0] = rslt.getVarchar(23) ;
               ((String[]) buf[38])[0] = rslt.getVarchar(24) ;
               ((String[]) buf[39])[0] = rslt.getVarchar(25) ;
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
               stmt.setVarchar(1, (String)parms[0], 16);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 16);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

