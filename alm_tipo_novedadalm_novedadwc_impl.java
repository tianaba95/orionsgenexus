/*
               File: alm_tipo_novedadalm_novedadwc_impl
        Description: ALM_TIPO_NOVEDADALM_NOVEDADWC
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:15:9.40
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

public final  class alm_tipo_novedadalm_novedadwc_impl extends GXWebComponent
{
   public alm_tipo_novedadalm_novedadwc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_tipo_novedadalm_novedadwc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_tipo_novedadalm_novedadwc_impl.class ));
   }

   public alm_tipo_novedadalm_novedadwc_impl( int remoteHandle ,
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
      cmbNove_Masivo = new HTMLChoice();
      cmbNove_Estado = new HTMLChoice();
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
               AV7TNov_Codigo = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7TNov_Codigo", GXutil.ltrim( GXutil.str( AV7TNov_Codigo, 6, 0)));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,new Integer(AV7TNov_Codigo)});
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
               AV7TNov_Codigo = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               AV12Update = httpContext.GetNextPar( ) ;
               edtavUpdate_Tooltiptext = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_20_Refreshing);
               AV13Delete = httpContext.GetNextPar( ) ;
               edtavDelete_Tooltiptext = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "Tooltiptext", edtavDelete_Tooltiptext, !bGXsfl_20_Refreshing);
               A106Nove_Identificador = GXutil.lval( httpContext.GetNextPar( )) ;
               sPrefix = httpContext.GetNextPar( ) ;
               init_default_properties( ) ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxgrgrid_refresh( subGrid_Rows, AV7TNov_Codigo, AV12Update, AV13Delete, A106Nove_Identificador, sPrefix) ;
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
         pa3H2( ) ;
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
         httpContext.writeValue( "ALM_TIPO_NOVEDADALM_NOVEDADWC") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20186141415947");
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_tipo_novedadalm_novedadwc") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV7TNov_Codigo,6,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7TNov_Codigo", GXutil.ltrim( localUtil.ntoc( wcpOAV7TNov_Codigo, (byte)(6), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTNOV_CODIGO", GXutil.ltrim( localUtil.ntoc( AV7TNov_Codigo, (byte)(6), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUPDATE_Tooltiptext", GXutil.rtrim( edtavUpdate_Tooltiptext));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDELETE_Tooltiptext", GXutil.rtrim( edtavDelete_Tooltiptext));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm3H2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("alm_tipo_novedadalm_novedadwc.js", "?20186141415951");
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
      return "ALM_TIPO_NOVEDADALM_NOVEDADWC" ;
   }

   public String getPgmdesc( )
   {
      return "ALM_TIPO_NOVEDADALM_NOVEDADWC" ;
   }

   public void wb3H0( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.alm_tipo_novedadalm_novedadwc");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 20, 2, 0)+","+"null"+");", "Agregar", bttBtninsert_Jsonclick, 5, "Agregar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_NOVEDADALM_NOVEDADWC.htm");
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
            httpContext.writeValue( "Novedad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Novedad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Usuario") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Codigo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripcion") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Codigo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripcion") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Movimiento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descrip") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Origen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Origen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Origen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Id Origen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Ced Origen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Nom Origen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Id Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Ced Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Nom Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Observaciones") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Masivo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Image"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Soporte") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Soporte") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "CC") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "la Novedad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Procedimiento") ;
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
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A106Nove_Identificador, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A780Nove_FechaRegistro, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A781Nove_UsuarioRegistro, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A107Nove_TransId, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A782Nove_RegionId, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A783Nove_RegionCodigo, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A784Nove_RegionDescripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A785Nove_CentroId, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A786Nove_CentroCodigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A787Nove_CentroDescripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A788Nove_CodigoMovimiento);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A789Nove_MovimientoDescrip);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A790Nove_ModuloOrigen);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A791Nove_AlmaOrigen);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A792Nove_BodeOrigen);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A793Nove_CuentadanteIdOrigen, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A794Nove_CuentadanteCedOrigen, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A795Nove_CuentadanteNomOrigen);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A796Nove_ModuloDestino);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A797Nove_AlmaDestino);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A798Nove_BodeDestino);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A799Nove_CuentadanteIdDestino, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A800Nove_CuentadanteCedDestino, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A801Nove_CuentadanteNomDestino);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A802Nove_Observaciones);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A803Nove_Masivo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A804Nove_Soporte);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A805Nove_RutaSoporte);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A814Nove_TranCC, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A765Nove_Estado));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A815Nove_RespuestaProc);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTNov_Codigo_Internalname, "Código de la Novedad", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTNov_Codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A104TNov_Codigo, (byte)(6), (byte)(0), ",", "")), ((edtTNov_Codigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A104TNov_Codigo), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A104TNov_Codigo), "ZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTNov_Codigo_Jsonclick, 0, "Attribute", "", "", "", edtTNov_Codigo_Visible, edtTNov_Codigo_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Codigo", "right", false, "HLP_ALM_TIPO_NOVEDADALM_NOVEDADWC.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start3H2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "ALM_TIPO_NOVEDADALM_NOVEDADWC", (short)(0)) ;
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
            strup3H0( ) ;
         }
      }
   }

   public void ws3H2( )
   {
      start3H2( ) ;
      evt3H2( ) ;
   }

   public void evt3H2( )
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
                              strup3H0( ) ;
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
                              strup3H0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoInsert' */
                                 e113H2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup3H0( ) ;
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
                              strup3H0( ) ;
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
                              strup3H0( ) ;
                           }
                           nGXsfl_20_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_20_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_20_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_202( ) ;
                           A106Nove_Identificador = localUtil.ctol( httpContext.cgiGet( edtNove_Identificador_Internalname), ",", ".") ;
                           A780Nove_FechaRegistro = localUtil.ctot( httpContext.cgiGet( edtNove_FechaRegistro_Internalname), 0) ;
                           n780Nove_FechaRegistro = false ;
                           A781Nove_UsuarioRegistro = localUtil.ctol( httpContext.cgiGet( edtNove_UsuarioRegistro_Internalname), ",", ".") ;
                           n781Nove_UsuarioRegistro = false ;
                           A107Nove_TransId = localUtil.ctol( httpContext.cgiGet( edtNove_TransId_Internalname), ",", ".") ;
                           n107Nove_TransId = false ;
                           A782Nove_RegionId = localUtil.ctol( httpContext.cgiGet( edtNove_RegionId_Internalname), ",", ".") ;
                           n782Nove_RegionId = false ;
                           A783Nove_RegionCodigo = (short)(localUtil.ctol( httpContext.cgiGet( edtNove_RegionCodigo_Internalname), ",", ".")) ;
                           n783Nove_RegionCodigo = false ;
                           A784Nove_RegionDescripcion = httpContext.cgiGet( edtNove_RegionDescripcion_Internalname) ;
                           n784Nove_RegionDescripcion = false ;
                           A785Nove_CentroId = localUtil.ctol( httpContext.cgiGet( edtNove_CentroId_Internalname), ",", ".") ;
                           n785Nove_CentroId = false ;
                           A786Nove_CentroCodigo = httpContext.cgiGet( edtNove_CentroCodigo_Internalname) ;
                           n786Nove_CentroCodigo = false ;
                           A787Nove_CentroDescripcion = httpContext.cgiGet( edtNove_CentroDescripcion_Internalname) ;
                           n787Nove_CentroDescripcion = false ;
                           A788Nove_CodigoMovimiento = httpContext.cgiGet( edtNove_CodigoMovimiento_Internalname) ;
                           n788Nove_CodigoMovimiento = false ;
                           A789Nove_MovimientoDescrip = httpContext.cgiGet( edtNove_MovimientoDescrip_Internalname) ;
                           n789Nove_MovimientoDescrip = false ;
                           A790Nove_ModuloOrigen = httpContext.cgiGet( edtNove_ModuloOrigen_Internalname) ;
                           n790Nove_ModuloOrigen = false ;
                           A791Nove_AlmaOrigen = httpContext.cgiGet( edtNove_AlmaOrigen_Internalname) ;
                           n791Nove_AlmaOrigen = false ;
                           A792Nove_BodeOrigen = httpContext.cgiGet( edtNove_BodeOrigen_Internalname) ;
                           n792Nove_BodeOrigen = false ;
                           A793Nove_CuentadanteIdOrigen = localUtil.ctol( httpContext.cgiGet( edtNove_CuentadanteIdOrigen_Internalname), ",", ".") ;
                           n793Nove_CuentadanteIdOrigen = false ;
                           A794Nove_CuentadanteCedOrigen = localUtil.ctol( httpContext.cgiGet( edtNove_CuentadanteCedOrigen_Internalname), ",", ".") ;
                           n794Nove_CuentadanteCedOrigen = false ;
                           A795Nove_CuentadanteNomOrigen = GXutil.upper( httpContext.cgiGet( edtNove_CuentadanteNomOrigen_Internalname)) ;
                           n795Nove_CuentadanteNomOrigen = false ;
                           A796Nove_ModuloDestino = httpContext.cgiGet( edtNove_ModuloDestino_Internalname) ;
                           n796Nove_ModuloDestino = false ;
                           A797Nove_AlmaDestino = httpContext.cgiGet( edtNove_AlmaDestino_Internalname) ;
                           n797Nove_AlmaDestino = false ;
                           A798Nove_BodeDestino = httpContext.cgiGet( edtNove_BodeDestino_Internalname) ;
                           n798Nove_BodeDestino = false ;
                           A799Nove_CuentadanteIdDestino = localUtil.ctol( httpContext.cgiGet( edtNove_CuentadanteIdDestino_Internalname), ",", ".") ;
                           n799Nove_CuentadanteIdDestino = false ;
                           A800Nove_CuentadanteCedDestino = localUtil.ctol( httpContext.cgiGet( edtNove_CuentadanteCedDestino_Internalname), ",", ".") ;
                           n800Nove_CuentadanteCedDestino = false ;
                           A801Nove_CuentadanteNomDestino = GXutil.upper( httpContext.cgiGet( edtNove_CuentadanteNomDestino_Internalname)) ;
                           n801Nove_CuentadanteNomDestino = false ;
                           A802Nove_Observaciones = httpContext.cgiGet( edtNove_Observaciones_Internalname) ;
                           n802Nove_Observaciones = false ;
                           cmbNove_Masivo.setName( cmbNove_Masivo.getInternalname() );
                           cmbNove_Masivo.setValue( httpContext.cgiGet( cmbNove_Masivo.getInternalname()) );
                           A803Nove_Masivo = httpContext.cgiGet( cmbNove_Masivo.getInternalname()) ;
                           n803Nove_Masivo = false ;
                           A804Nove_Soporte = httpContext.cgiGet( edtNove_Soporte_Internalname) ;
                           n804Nove_Soporte = false ;
                           httpContext.ajax_rsp_assign_prop(sPrefix, false, edtNove_Soporte_Internalname, "URL", httpContext.getResourceRelative(A804Nove_Soporte), !bGXsfl_20_Refreshing);
                           A805Nove_RutaSoporte = httpContext.cgiGet( edtNove_RutaSoporte_Internalname) ;
                           n805Nove_RutaSoporte = false ;
                           A814Nove_TranCC = localUtil.ctol( httpContext.cgiGet( edtNove_TranCC_Internalname), ",", ".") ;
                           n814Nove_TranCC = false ;
                           cmbNove_Estado.setName( cmbNove_Estado.getInternalname() );
                           cmbNove_Estado.setValue( httpContext.cgiGet( cmbNove_Estado.getInternalname()) );
                           A765Nove_Estado = httpContext.cgiGet( cmbNove_Estado.getInternalname()) ;
                           n765Nove_Estado = false ;
                           A815Nove_RespuestaProc = httpContext.cgiGet( edtNove_RespuestaProc_Internalname) ;
                           n815Nove_RespuestaProc = false ;
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
                                       e123H2 ();
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
                                       e133H2 ();
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
                                    strup3H0( ) ;
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

   public void we3H2( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm3H2( ) ;
         }
      }
   }

   public void pa3H2( )
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
         GXCCtl = "NOVE_MASIVO_" + sGXsfl_20_idx ;
         cmbNove_Masivo.setName( GXCCtl );
         cmbNove_Masivo.setWebtags( "" );
         cmbNove_Masivo.addItem("", "", (short)(0));
         cmbNove_Masivo.addItem("SI", "SI", (short)(0));
         cmbNove_Masivo.addItem("NO", "NO", (short)(0));
         if ( cmbNove_Masivo.getItemCount() > 0 )
         {
            A803Nove_Masivo = cmbNove_Masivo.getValidValue(A803Nove_Masivo) ;
            n803Nove_Masivo = false ;
         }
         GXCCtl = "NOVE_ESTADO_" + sGXsfl_20_idx ;
         cmbNove_Estado.setName( GXCCtl );
         cmbNove_Estado.setWebtags( "" );
         if ( cmbNove_Estado.getItemCount() > 0 )
         {
            A765Nove_Estado = cmbNove_Estado.getValidValue(A765Nove_Estado) ;
            n765Nove_Estado = false ;
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
                                 int AV7TNov_Codigo ,
                                 String AV12Update ,
                                 String AV13Delete ,
                                 long A106Nove_Identificador ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid_Rows = subGrid_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID_nCurrentRecord = 0 ;
      rf3H2( ) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_NOVE_IDENTIFICADOR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A106Nove_Identificador), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"NOVE_IDENTIFICADOR", GXutil.ltrim( localUtil.ntoc( A106Nove_Identificador, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_NOVE_FECHAREGISTRO", getSecureSignedToken( sPrefix, localUtil.format( A780Nove_FechaRegistro, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"NOVE_FECHAREGISTRO", localUtil.ttoc( A780Nove_FechaRegistro, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_NOVE_USUARIOREGISTRO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A781Nove_UsuarioRegistro), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"NOVE_USUARIOREGISTRO", GXutil.ltrim( localUtil.ntoc( A781Nove_UsuarioRegistro, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_NOVE_TRANSID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A107Nove_TransId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"NOVE_TRANSID", GXutil.ltrim( localUtil.ntoc( A107Nove_TransId, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_NOVE_OBSERVACIONES", getSecureSignedToken( sPrefix, A802Nove_Observaciones));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"NOVE_OBSERVACIONES", A802Nove_Observaciones);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_NOVE_MASIVO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A803Nove_Masivo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"NOVE_MASIVO", A803Nove_Masivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_NOVE_RUTASOPORTE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A805Nove_RutaSoporte, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"NOVE_RUTASOPORTE", A805Nove_RutaSoporte);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_NOVE_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A765Nove_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"NOVE_ESTADO", GXutil.rtrim( A765Nove_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_NOVE_RESPUESTAPROC", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A815Nove_RespuestaProc, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"NOVE_RESPUESTAPROC", A815Nove_RespuestaProc);
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf3H2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV17Pgmname = "ALM_TIPO_NOVEDADALM_NOVEDADWC" ;
      Gx_err = (short)(0) ;
   }

   public void rf3H2( )
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
         /* Using cursor H003H2 */
         pr_default.execute(0, new Object[] {new Integer(AV7TNov_Codigo), new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_20_idx = (short)(1) ;
         sGXsfl_20_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_20_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_202( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_recordsperpage( ) ) ) ) )
         {
            A802Nove_Observaciones = H003H2_A802Nove_Observaciones[0] ;
            n802Nove_Observaciones = H003H2_n802Nove_Observaciones[0] ;
            A104TNov_Codigo = H003H2_A104TNov_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A104TNov_Codigo", GXutil.ltrim( GXutil.str( A104TNov_Codigo, 6, 0)));
            n104TNov_Codigo = H003H2_n104TNov_Codigo[0] ;
            A815Nove_RespuestaProc = H003H2_A815Nove_RespuestaProc[0] ;
            n815Nove_RespuestaProc = H003H2_n815Nove_RespuestaProc[0] ;
            A765Nove_Estado = H003H2_A765Nove_Estado[0] ;
            n765Nove_Estado = H003H2_n765Nove_Estado[0] ;
            A814Nove_TranCC = H003H2_A814Nove_TranCC[0] ;
            n814Nove_TranCC = H003H2_n814Nove_TranCC[0] ;
            A805Nove_RutaSoporte = H003H2_A805Nove_RutaSoporte[0] ;
            n805Nove_RutaSoporte = H003H2_n805Nove_RutaSoporte[0] ;
            A804Nove_Soporte = H003H2_A804Nove_Soporte[0] ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtNove_Soporte_Internalname, "URL", httpContext.getResourceRelative(A804Nove_Soporte), !bGXsfl_20_Refreshing);
            n804Nove_Soporte = H003H2_n804Nove_Soporte[0] ;
            A803Nove_Masivo = H003H2_A803Nove_Masivo[0] ;
            n803Nove_Masivo = H003H2_n803Nove_Masivo[0] ;
            A801Nove_CuentadanteNomDestino = H003H2_A801Nove_CuentadanteNomDestino[0] ;
            n801Nove_CuentadanteNomDestino = H003H2_n801Nove_CuentadanteNomDestino[0] ;
            A800Nove_CuentadanteCedDestino = H003H2_A800Nove_CuentadanteCedDestino[0] ;
            n800Nove_CuentadanteCedDestino = H003H2_n800Nove_CuentadanteCedDestino[0] ;
            A799Nove_CuentadanteIdDestino = H003H2_A799Nove_CuentadanteIdDestino[0] ;
            n799Nove_CuentadanteIdDestino = H003H2_n799Nove_CuentadanteIdDestino[0] ;
            A798Nove_BodeDestino = H003H2_A798Nove_BodeDestino[0] ;
            n798Nove_BodeDestino = H003H2_n798Nove_BodeDestino[0] ;
            A797Nove_AlmaDestino = H003H2_A797Nove_AlmaDestino[0] ;
            n797Nove_AlmaDestino = H003H2_n797Nove_AlmaDestino[0] ;
            A796Nove_ModuloDestino = H003H2_A796Nove_ModuloDestino[0] ;
            n796Nove_ModuloDestino = H003H2_n796Nove_ModuloDestino[0] ;
            A795Nove_CuentadanteNomOrigen = H003H2_A795Nove_CuentadanteNomOrigen[0] ;
            n795Nove_CuentadanteNomOrigen = H003H2_n795Nove_CuentadanteNomOrigen[0] ;
            A794Nove_CuentadanteCedOrigen = H003H2_A794Nove_CuentadanteCedOrigen[0] ;
            n794Nove_CuentadanteCedOrigen = H003H2_n794Nove_CuentadanteCedOrigen[0] ;
            A793Nove_CuentadanteIdOrigen = H003H2_A793Nove_CuentadanteIdOrigen[0] ;
            n793Nove_CuentadanteIdOrigen = H003H2_n793Nove_CuentadanteIdOrigen[0] ;
            A792Nove_BodeOrigen = H003H2_A792Nove_BodeOrigen[0] ;
            n792Nove_BodeOrigen = H003H2_n792Nove_BodeOrigen[0] ;
            A791Nove_AlmaOrigen = H003H2_A791Nove_AlmaOrigen[0] ;
            n791Nove_AlmaOrigen = H003H2_n791Nove_AlmaOrigen[0] ;
            A790Nove_ModuloOrigen = H003H2_A790Nove_ModuloOrigen[0] ;
            n790Nove_ModuloOrigen = H003H2_n790Nove_ModuloOrigen[0] ;
            A789Nove_MovimientoDescrip = H003H2_A789Nove_MovimientoDescrip[0] ;
            n789Nove_MovimientoDescrip = H003H2_n789Nove_MovimientoDescrip[0] ;
            A788Nove_CodigoMovimiento = H003H2_A788Nove_CodigoMovimiento[0] ;
            n788Nove_CodigoMovimiento = H003H2_n788Nove_CodigoMovimiento[0] ;
            A787Nove_CentroDescripcion = H003H2_A787Nove_CentroDescripcion[0] ;
            n787Nove_CentroDescripcion = H003H2_n787Nove_CentroDescripcion[0] ;
            A786Nove_CentroCodigo = H003H2_A786Nove_CentroCodigo[0] ;
            n786Nove_CentroCodigo = H003H2_n786Nove_CentroCodigo[0] ;
            A785Nove_CentroId = H003H2_A785Nove_CentroId[0] ;
            n785Nove_CentroId = H003H2_n785Nove_CentroId[0] ;
            A784Nove_RegionDescripcion = H003H2_A784Nove_RegionDescripcion[0] ;
            n784Nove_RegionDescripcion = H003H2_n784Nove_RegionDescripcion[0] ;
            A783Nove_RegionCodigo = H003H2_A783Nove_RegionCodigo[0] ;
            n783Nove_RegionCodigo = H003H2_n783Nove_RegionCodigo[0] ;
            A782Nove_RegionId = H003H2_A782Nove_RegionId[0] ;
            n782Nove_RegionId = H003H2_n782Nove_RegionId[0] ;
            A107Nove_TransId = H003H2_A107Nove_TransId[0] ;
            n107Nove_TransId = H003H2_n107Nove_TransId[0] ;
            A781Nove_UsuarioRegistro = H003H2_A781Nove_UsuarioRegistro[0] ;
            n781Nove_UsuarioRegistro = H003H2_n781Nove_UsuarioRegistro[0] ;
            A780Nove_FechaRegistro = H003H2_A780Nove_FechaRegistro[0] ;
            n780Nove_FechaRegistro = H003H2_n780Nove_FechaRegistro[0] ;
            A106Nove_Identificador = H003H2_A106Nove_Identificador[0] ;
            A814Nove_TranCC = H003H2_A814Nove_TranCC[0] ;
            n814Nove_TranCC = H003H2_n814Nove_TranCC[0] ;
            A799Nove_CuentadanteIdDestino = H003H2_A799Nove_CuentadanteIdDestino[0] ;
            n799Nove_CuentadanteIdDestino = H003H2_n799Nove_CuentadanteIdDestino[0] ;
            A798Nove_BodeDestino = H003H2_A798Nove_BodeDestino[0] ;
            n798Nove_BodeDestino = H003H2_n798Nove_BodeDestino[0] ;
            A797Nove_AlmaDestino = H003H2_A797Nove_AlmaDestino[0] ;
            n797Nove_AlmaDestino = H003H2_n797Nove_AlmaDestino[0] ;
            A796Nove_ModuloDestino = H003H2_A796Nove_ModuloDestino[0] ;
            n796Nove_ModuloDestino = H003H2_n796Nove_ModuloDestino[0] ;
            A793Nove_CuentadanteIdOrigen = H003H2_A793Nove_CuentadanteIdOrigen[0] ;
            n793Nove_CuentadanteIdOrigen = H003H2_n793Nove_CuentadanteIdOrigen[0] ;
            A792Nove_BodeOrigen = H003H2_A792Nove_BodeOrigen[0] ;
            n792Nove_BodeOrigen = H003H2_n792Nove_BodeOrigen[0] ;
            A791Nove_AlmaOrigen = H003H2_A791Nove_AlmaOrigen[0] ;
            n791Nove_AlmaOrigen = H003H2_n791Nove_AlmaOrigen[0] ;
            A790Nove_ModuloOrigen = H003H2_A790Nove_ModuloOrigen[0] ;
            n790Nove_ModuloOrigen = H003H2_n790Nove_ModuloOrigen[0] ;
            A788Nove_CodigoMovimiento = H003H2_A788Nove_CodigoMovimiento[0] ;
            n788Nove_CodigoMovimiento = H003H2_n788Nove_CodigoMovimiento[0] ;
            A785Nove_CentroId = H003H2_A785Nove_CentroId[0] ;
            n785Nove_CentroId = H003H2_n785Nove_CentroId[0] ;
            A782Nove_RegionId = H003H2_A782Nove_RegionId[0] ;
            n782Nove_RegionId = H003H2_n782Nove_RegionId[0] ;
            A801Nove_CuentadanteNomDestino = H003H2_A801Nove_CuentadanteNomDestino[0] ;
            n801Nove_CuentadanteNomDestino = H003H2_n801Nove_CuentadanteNomDestino[0] ;
            A800Nove_CuentadanteCedDestino = H003H2_A800Nove_CuentadanteCedDestino[0] ;
            n800Nove_CuentadanteCedDestino = H003H2_n800Nove_CuentadanteCedDestino[0] ;
            A795Nove_CuentadanteNomOrigen = H003H2_A795Nove_CuentadanteNomOrigen[0] ;
            n795Nove_CuentadanteNomOrigen = H003H2_n795Nove_CuentadanteNomOrigen[0] ;
            A794Nove_CuentadanteCedOrigen = H003H2_A794Nove_CuentadanteCedOrigen[0] ;
            n794Nove_CuentadanteCedOrigen = H003H2_n794Nove_CuentadanteCedOrigen[0] ;
            A789Nove_MovimientoDescrip = H003H2_A789Nove_MovimientoDescrip[0] ;
            n789Nove_MovimientoDescrip = H003H2_n789Nove_MovimientoDescrip[0] ;
            A787Nove_CentroDescripcion = H003H2_A787Nove_CentroDescripcion[0] ;
            n787Nove_CentroDescripcion = H003H2_n787Nove_CentroDescripcion[0] ;
            A786Nove_CentroCodigo = H003H2_A786Nove_CentroCodigo[0] ;
            n786Nove_CentroCodigo = H003H2_n786Nove_CentroCodigo[0] ;
            A784Nove_RegionDescripcion = H003H2_A784Nove_RegionDescripcion[0] ;
            n784Nove_RegionDescripcion = H003H2_n784Nove_RegionDescripcion[0] ;
            A783Nove_RegionCodigo = H003H2_A783Nove_RegionCodigo[0] ;
            n783Nove_RegionCodigo = H003H2_n783Nove_RegionCodigo[0] ;
            e133H2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(20) ;
         wb3H0( ) ;
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
      /* Using cursor H003H3 */
      pr_default.execute(1, new Object[] {new Integer(AV7TNov_Codigo)});
      GRID_nRecordCount = H003H3_AGRID_nRecordCount[0] ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7TNov_Codigo, AV12Update, AV13Delete, A106Nove_Identificador, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7TNov_Codigo, AV12Update, AV13Delete, A106Nove_Identificador, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7TNov_Codigo, AV12Update, AV13Delete, A106Nove_Identificador, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7TNov_Codigo, AV12Update, AV13Delete, A106Nove_Identificador, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7TNov_Codigo, AV12Update, AV13Delete, A106Nove_Identificador, sPrefix) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup3H0( )
   {
      /* Before Start, stand alone formulas. */
      AV17Pgmname = "ALM_TIPO_NOVEDADALM_NOVEDADWC" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e123H2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A104TNov_Codigo = (int)(localUtil.ctol( httpContext.cgiGet( edtTNov_Codigo_Internalname), ",", ".")) ;
         n104TNov_Codigo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A104TNov_Codigo", GXutil.ltrim( GXutil.str( A104TNov_Codigo, 6, 0)));
         /* Read saved values. */
         nRC_GXsfl_20 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_20"), ",", ".")) ;
         wcpOAV7TNov_Codigo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7TNov_Codigo"), ",", ".")) ;
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
      e123H2 ();
      if (returnInSub) return;
   }

   public void e123H2( )
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
      edtTNov_Codigo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTNov_Codigo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTNov_Codigo_Visible, 5, 0)), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
   }

   private void e133H2( )
   {
      /* Grid_Load Routine */
      edtavUpdate_Link = formatLink("com.orions2.alm_novedad") + "?" + GXutil.URLEncode(GXutil.rtrim("UPD")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A106Nove_Identificador,11,0))) ;
      edtavDelete_Link = formatLink("com.orions2.alm_novedad") + "?" + GXutil.URLEncode(GXutil.rtrim("DLT")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A106Nove_Identificador,11,0))) ;
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

   public void e113H2( )
   {
      /* 'DoInsert' Routine */
      callWebObject(formatLink("com.orions2.alm_novedad") + "?" + GXutil.URLEncode(GXutil.rtrim("INS")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))));
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV10TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV17Pgmname );
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerondelete( true );
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV9HTTPRequest.getScriptName()+"?"+AV9HTTPRequest.getQuerystring() );
      AV10TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_NOVEDAD" );
      AV11TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV11TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "TNov_Codigo" );
      AV11TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV7TNov_Codigo, 6, 0) );
      AV10TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV11TrnContextAtt, 0);
      AV8Session.setValue("TrnContext", AV10TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      AV7TNov_Codigo = ((Number) GXutil.testNumericType( getParm(obj,0,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7TNov_Codigo", GXutil.ltrim( GXutil.str( AV7TNov_Codigo, 6, 0)));
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
      pa3H2( ) ;
      ws3H2( ) ;
      we3H2( ) ;
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
      sCtrlAV7TNov_Codigo = (String)getParm(obj,0,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa3H2( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "alm_tipo_novedadalm_novedadwc");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa3H2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV7TNov_Codigo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7TNov_Codigo", GXutil.ltrim( GXutil.str( AV7TNov_Codigo, 6, 0)));
      }
      wcpOAV7TNov_Codigo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7TNov_Codigo"), ",", ".")) ;
      if ( ! GetJustCreated( ) && ( ( AV7TNov_Codigo != wcpOAV7TNov_Codigo ) ) )
      {
         setjustcreated();
      }
      wcpOAV7TNov_Codigo = AV7TNov_Codigo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV7TNov_Codigo = httpContext.cgiGet( sPrefix+"AV7TNov_Codigo_CTRL") ;
      if ( GXutil.len( sCtrlAV7TNov_Codigo) > 0 )
      {
         AV7TNov_Codigo = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV7TNov_Codigo), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7TNov_Codigo", GXutil.ltrim( GXutil.str( AV7TNov_Codigo, 6, 0)));
      }
      else
      {
         AV7TNov_Codigo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV7TNov_Codigo_PARM"), ",", ".")) ;
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
      pa3H2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws3H2( ) ;
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
      ws3H2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7TNov_Codigo_PARM", GXutil.ltrim( localUtil.ntoc( AV7TNov_Codigo, (byte)(6), (byte)(0), ",", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7TNov_Codigo)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7TNov_Codigo_CTRL", GXutil.rtrim( sCtrlAV7TNov_Codigo));
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
      we3H2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414151058");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("alm_tipo_novedadalm_novedadwc.js", "?201861414151059");
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_202( )
   {
      edtNove_Identificador_Internalname = sPrefix+"NOVE_IDENTIFICADOR_"+sGXsfl_20_idx ;
      edtNove_FechaRegistro_Internalname = sPrefix+"NOVE_FECHAREGISTRO_"+sGXsfl_20_idx ;
      edtNove_UsuarioRegistro_Internalname = sPrefix+"NOVE_USUARIOREGISTRO_"+sGXsfl_20_idx ;
      edtNove_TransId_Internalname = sPrefix+"NOVE_TRANSID_"+sGXsfl_20_idx ;
      edtNove_RegionId_Internalname = sPrefix+"NOVE_REGIONID_"+sGXsfl_20_idx ;
      edtNove_RegionCodigo_Internalname = sPrefix+"NOVE_REGIONCODIGO_"+sGXsfl_20_idx ;
      edtNove_RegionDescripcion_Internalname = sPrefix+"NOVE_REGIONDESCRIPCION_"+sGXsfl_20_idx ;
      edtNove_CentroId_Internalname = sPrefix+"NOVE_CENTROID_"+sGXsfl_20_idx ;
      edtNove_CentroCodigo_Internalname = sPrefix+"NOVE_CENTROCODIGO_"+sGXsfl_20_idx ;
      edtNove_CentroDescripcion_Internalname = sPrefix+"NOVE_CENTRODESCRIPCION_"+sGXsfl_20_idx ;
      edtNove_CodigoMovimiento_Internalname = sPrefix+"NOVE_CODIGOMOVIMIENTO_"+sGXsfl_20_idx ;
      edtNove_MovimientoDescrip_Internalname = sPrefix+"NOVE_MOVIMIENTODESCRIP_"+sGXsfl_20_idx ;
      edtNove_ModuloOrigen_Internalname = sPrefix+"NOVE_MODULOORIGEN_"+sGXsfl_20_idx ;
      edtNove_AlmaOrigen_Internalname = sPrefix+"NOVE_ALMAORIGEN_"+sGXsfl_20_idx ;
      edtNove_BodeOrigen_Internalname = sPrefix+"NOVE_BODEORIGEN_"+sGXsfl_20_idx ;
      edtNove_CuentadanteIdOrigen_Internalname = sPrefix+"NOVE_CUENTADANTEIDORIGEN_"+sGXsfl_20_idx ;
      edtNove_CuentadanteCedOrigen_Internalname = sPrefix+"NOVE_CUENTADANTECEDORIGEN_"+sGXsfl_20_idx ;
      edtNove_CuentadanteNomOrigen_Internalname = sPrefix+"NOVE_CUENTADANTENOMORIGEN_"+sGXsfl_20_idx ;
      edtNove_ModuloDestino_Internalname = sPrefix+"NOVE_MODULODESTINO_"+sGXsfl_20_idx ;
      edtNove_AlmaDestino_Internalname = sPrefix+"NOVE_ALMADESTINO_"+sGXsfl_20_idx ;
      edtNove_BodeDestino_Internalname = sPrefix+"NOVE_BODEDESTINO_"+sGXsfl_20_idx ;
      edtNove_CuentadanteIdDestino_Internalname = sPrefix+"NOVE_CUENTADANTEIDDESTINO_"+sGXsfl_20_idx ;
      edtNove_CuentadanteCedDestino_Internalname = sPrefix+"NOVE_CUENTADANTECEDDESTINO_"+sGXsfl_20_idx ;
      edtNove_CuentadanteNomDestino_Internalname = sPrefix+"NOVE_CUENTADANTENOMDESTINO_"+sGXsfl_20_idx ;
      edtNove_Observaciones_Internalname = sPrefix+"NOVE_OBSERVACIONES_"+sGXsfl_20_idx ;
      cmbNove_Masivo.setInternalname( sPrefix+"NOVE_MASIVO_"+sGXsfl_20_idx );
      edtNove_Soporte_Internalname = sPrefix+"NOVE_SOPORTE_"+sGXsfl_20_idx ;
      edtNove_RutaSoporte_Internalname = sPrefix+"NOVE_RUTASOPORTE_"+sGXsfl_20_idx ;
      edtNove_TranCC_Internalname = sPrefix+"NOVE_TRANCC_"+sGXsfl_20_idx ;
      cmbNove_Estado.setInternalname( sPrefix+"NOVE_ESTADO_"+sGXsfl_20_idx );
      edtNove_RespuestaProc_Internalname = sPrefix+"NOVE_RESPUESTAPROC_"+sGXsfl_20_idx ;
      edtavUpdate_Internalname = sPrefix+"vUPDATE_"+sGXsfl_20_idx ;
      edtavDelete_Internalname = sPrefix+"vDELETE_"+sGXsfl_20_idx ;
   }

   public void subsflControlProps_fel_202( )
   {
      edtNove_Identificador_Internalname = sPrefix+"NOVE_IDENTIFICADOR_"+sGXsfl_20_fel_idx ;
      edtNove_FechaRegistro_Internalname = sPrefix+"NOVE_FECHAREGISTRO_"+sGXsfl_20_fel_idx ;
      edtNove_UsuarioRegistro_Internalname = sPrefix+"NOVE_USUARIOREGISTRO_"+sGXsfl_20_fel_idx ;
      edtNove_TransId_Internalname = sPrefix+"NOVE_TRANSID_"+sGXsfl_20_fel_idx ;
      edtNove_RegionId_Internalname = sPrefix+"NOVE_REGIONID_"+sGXsfl_20_fel_idx ;
      edtNove_RegionCodigo_Internalname = sPrefix+"NOVE_REGIONCODIGO_"+sGXsfl_20_fel_idx ;
      edtNove_RegionDescripcion_Internalname = sPrefix+"NOVE_REGIONDESCRIPCION_"+sGXsfl_20_fel_idx ;
      edtNove_CentroId_Internalname = sPrefix+"NOVE_CENTROID_"+sGXsfl_20_fel_idx ;
      edtNove_CentroCodigo_Internalname = sPrefix+"NOVE_CENTROCODIGO_"+sGXsfl_20_fel_idx ;
      edtNove_CentroDescripcion_Internalname = sPrefix+"NOVE_CENTRODESCRIPCION_"+sGXsfl_20_fel_idx ;
      edtNove_CodigoMovimiento_Internalname = sPrefix+"NOVE_CODIGOMOVIMIENTO_"+sGXsfl_20_fel_idx ;
      edtNove_MovimientoDescrip_Internalname = sPrefix+"NOVE_MOVIMIENTODESCRIP_"+sGXsfl_20_fel_idx ;
      edtNove_ModuloOrigen_Internalname = sPrefix+"NOVE_MODULOORIGEN_"+sGXsfl_20_fel_idx ;
      edtNove_AlmaOrigen_Internalname = sPrefix+"NOVE_ALMAORIGEN_"+sGXsfl_20_fel_idx ;
      edtNove_BodeOrigen_Internalname = sPrefix+"NOVE_BODEORIGEN_"+sGXsfl_20_fel_idx ;
      edtNove_CuentadanteIdOrigen_Internalname = sPrefix+"NOVE_CUENTADANTEIDORIGEN_"+sGXsfl_20_fel_idx ;
      edtNove_CuentadanteCedOrigen_Internalname = sPrefix+"NOVE_CUENTADANTECEDORIGEN_"+sGXsfl_20_fel_idx ;
      edtNove_CuentadanteNomOrigen_Internalname = sPrefix+"NOVE_CUENTADANTENOMORIGEN_"+sGXsfl_20_fel_idx ;
      edtNove_ModuloDestino_Internalname = sPrefix+"NOVE_MODULODESTINO_"+sGXsfl_20_fel_idx ;
      edtNove_AlmaDestino_Internalname = sPrefix+"NOVE_ALMADESTINO_"+sGXsfl_20_fel_idx ;
      edtNove_BodeDestino_Internalname = sPrefix+"NOVE_BODEDESTINO_"+sGXsfl_20_fel_idx ;
      edtNove_CuentadanteIdDestino_Internalname = sPrefix+"NOVE_CUENTADANTEIDDESTINO_"+sGXsfl_20_fel_idx ;
      edtNove_CuentadanteCedDestino_Internalname = sPrefix+"NOVE_CUENTADANTECEDDESTINO_"+sGXsfl_20_fel_idx ;
      edtNove_CuentadanteNomDestino_Internalname = sPrefix+"NOVE_CUENTADANTENOMDESTINO_"+sGXsfl_20_fel_idx ;
      edtNove_Observaciones_Internalname = sPrefix+"NOVE_OBSERVACIONES_"+sGXsfl_20_fel_idx ;
      cmbNove_Masivo.setInternalname( sPrefix+"NOVE_MASIVO_"+sGXsfl_20_fel_idx );
      edtNove_Soporte_Internalname = sPrefix+"NOVE_SOPORTE_"+sGXsfl_20_fel_idx ;
      edtNove_RutaSoporte_Internalname = sPrefix+"NOVE_RUTASOPORTE_"+sGXsfl_20_fel_idx ;
      edtNove_TranCC_Internalname = sPrefix+"NOVE_TRANCC_"+sGXsfl_20_fel_idx ;
      cmbNove_Estado.setInternalname( sPrefix+"NOVE_ESTADO_"+sGXsfl_20_fel_idx );
      edtNove_RespuestaProc_Internalname = sPrefix+"NOVE_RESPUESTAPROC_"+sGXsfl_20_fel_idx ;
      edtavUpdate_Internalname = sPrefix+"vUPDATE_"+sGXsfl_20_fel_idx ;
      edtavDelete_Internalname = sPrefix+"vDELETE_"+sGXsfl_20_fel_idx ;
   }

   public void sendrow_202( )
   {
      subsflControlProps_202( ) ;
      wb3H0( ) ;
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
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_Identificador_Internalname,GXutil.ltrim( localUtil.ntoc( A106Nove_Identificador, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A106Nove_Identificador), "ZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtNove_Identificador_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_FechaRegistro_Internalname,localUtil.ttoc( A780Nove_FechaRegistro, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A780Nove_FechaRegistro, "99/99/99 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtNove_FechaRegistro_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_UsuarioRegistro_Internalname,GXutil.ltrim( localUtil.ntoc( A781Nove_UsuarioRegistro, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A781Nove_UsuarioRegistro), "ZZZZZZZZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtNove_UsuarioRegistro_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"IdLargo","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_TransId_Internalname,GXutil.ltrim( localUtil.ntoc( A107Nove_TransId, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A107Nove_TransId), "ZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtNove_TransId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_RegionId_Internalname,GXutil.ltrim( localUtil.ntoc( A782Nove_RegionId, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A782Nove_RegionId), "ZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtNove_RegionId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_RegionCodigo_Internalname,GXutil.ltrim( localUtil.ntoc( A783Nove_RegionCodigo, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A783Nove_RegionCodigo), "ZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtNove_RegionCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_RegionDescripcion_Internalname,A784Nove_RegionDescripcion,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtNove_RegionDescripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_CentroId_Internalname,GXutil.ltrim( localUtil.ntoc( A785Nove_CentroId, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A785Nove_CentroId), "ZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtNove_CentroId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_CentroCodigo_Internalname,A786Nove_CentroCodigo,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtNove_CentroCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(16),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_CentroDescripcion_Internalname,A787Nove_CentroDescripcion,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtNove_CentroDescripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_CodigoMovimiento_Internalname,A788Nove_CodigoMovimiento,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtNove_CodigoMovimiento_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_MovimientoDescrip_Internalname,A789Nove_MovimientoDescrip,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtNove_MovimientoDescrip_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_ModuloOrigen_Internalname,A790Nove_ModuloOrigen,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtNove_ModuloOrigen_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Modulo","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_AlmaOrigen_Internalname,A791Nove_AlmaOrigen,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtNove_AlmaOrigen_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_BodeOrigen_Internalname,A792Nove_BodeOrigen,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtNove_BodeOrigen_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_CuentadanteIdOrigen_Internalname,GXutil.ltrim( localUtil.ntoc( A793Nove_CuentadanteIdOrigen, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A793Nove_CuentadanteIdOrigen), "ZZZZZZZZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtNove_CuentadanteIdOrigen_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_CuentadanteCedOrigen_Internalname,GXutil.ltrim( localUtil.ntoc( A794Nove_CuentadanteCedOrigen, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A794Nove_CuentadanteCedOrigen), "ZZZZZZZZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtNove_CuentadanteCedOrigen_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_CuentadanteNomOrigen_Internalname,A795Nove_CuentadanteNomOrigen,GXutil.rtrim( localUtil.format( A795Nove_CuentadanteNomOrigen, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtNove_CuentadanteNomOrigen_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_ModuloDestino_Internalname,A796Nove_ModuloDestino,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtNove_ModuloDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Modulo","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_AlmaDestino_Internalname,A797Nove_AlmaDestino,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtNove_AlmaDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_BodeDestino_Internalname,A798Nove_BodeDestino,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtNove_BodeDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_CuentadanteIdDestino_Internalname,GXutil.ltrim( localUtil.ntoc( A799Nove_CuentadanteIdDestino, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A799Nove_CuentadanteIdDestino), "ZZZZZZZZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtNove_CuentadanteIdDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_CuentadanteCedDestino_Internalname,GXutil.ltrim( localUtil.ntoc( A800Nove_CuentadanteCedDestino, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A800Nove_CuentadanteCedDestino), "ZZZZZZZZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtNove_CuentadanteCedDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_CuentadanteNomDestino_Internalname,A801Nove_CuentadanteNomDestino,GXutil.rtrim( localUtil.format( A801Nove_CuentadanteNomDestino, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtNove_CuentadanteNomDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_Observaciones_Internalname,A802Nove_Observaciones,A802Nove_Observaciones,"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtNove_Observaciones_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2097152),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(0),new Integer(-1),new Boolean(true),"","left",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_20_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "NOVE_MASIVO_" + sGXsfl_20_idx ;
            cmbNove_Masivo.setName( GXCCtl );
            cmbNove_Masivo.setWebtags( "" );
            cmbNove_Masivo.addItem("", "", (short)(0));
            cmbNove_Masivo.addItem("SI", "SI", (short)(0));
            cmbNove_Masivo.addItem("NO", "NO", (short)(0));
            if ( cmbNove_Masivo.getItemCount() > 0 )
            {
               A803Nove_Masivo = cmbNove_Masivo.getValidValue(A803Nove_Masivo) ;
               n803Nove_Masivo = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbNove_Masivo,cmbNove_Masivo.getInternalname(),GXutil.rtrim( A803Nove_Masivo),new Integer(1),cmbNove_Masivo.getJsonclick(),new Integer(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbNove_Masivo.setValue( GXutil.rtrim( A803Nove_Masivo) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbNove_Masivo.getInternalname(), "Values", cmbNove_Masivo.ToJavascriptSource(), !bGXsfl_20_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         ClassString = "Image" ;
         StyleString = "" ;
         edtNove_Soporte_Filetype = "tmp" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtNove_Soporte_Internalname, "Filetype", edtNove_Soporte_Filetype, !bGXsfl_20_Refreshing);
         if ( ! (GXutil.strcmp("", A804Nove_Soporte)==0) )
         {
            gxblobfileaux.setSource( A804Nove_Soporte );
            if ( ! gxblobfileaux.hasExtension() || ( GXutil.strcmp(edtNove_Soporte_Filetype, "tmp") != 0 ) )
            {
               gxblobfileaux.setExt(GXutil.trim( edtNove_Soporte_Filetype));
            }
            if ( gxblobfileaux.getErrCode() == 0 )
            {
               A804Nove_Soporte = gxblobfileaux.getAbsoluteName() ;
               n804Nove_Soporte = false ;
               httpContext.ajax_rsp_assign_prop(sPrefix, false, edtNove_Soporte_Internalname, "URL", httpContext.getResourceRelative(A804Nove_Soporte), !bGXsfl_20_Refreshing);
               edtNove_Soporte_Filetype = gxblobfileaux.getExtension() ;
               httpContext.ajax_rsp_assign_prop(sPrefix, false, edtNove_Soporte_Internalname, "Filetype", edtNove_Soporte_Filetype, !bGXsfl_20_Refreshing);
               gxblobfileaux.setBlobToDelete();
            }
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtNove_Soporte_Internalname, "URL", httpContext.getResourceRelative(A804Nove_Soporte), !bGXsfl_20_Refreshing);
         }
         GridRow.AddColumnProperties("blob", 2, isAjaxCallMode( ), new Object[] {edtNove_Soporte_Internalname,GXutil.rtrim( A804Nove_Soporte),httpContext.getResourceRelative(A804Nove_Soporte),((GXutil.strcmp("", edtNove_Soporte_Contenttype)==0) ? com.genexus.internet.HttpResponse.getContentType(((GXutil.strcmp("", edtNove_Soporte_Filetype)==0) ? A804Nove_Soporte : edtNove_Soporte_Filetype)) : edtNove_Soporte_Contenttype),new Boolean(false),"",edtNove_Soporte_Parameters,new Integer(0),new Integer(0),new Integer(-1),"","",new Integer(0),new Integer(-1),new Integer(0),"px",new Integer(60),"px",new Integer(0),new Integer(0),new Integer(0),edtNove_Soporte_Jsonclick,"'"+sPrefix+"'"+",false,"+"'"+""+"'",StyleString,ClassString,"WWColumn WWOptionalColumn",""+"","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_RutaSoporte_Internalname,A805Nove_RutaSoporte,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtNove_RutaSoporte_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_TranCC_Internalname,GXutil.ltrim( localUtil.ntoc( A814Nove_TranCC, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A814Nove_TranCC), "ZZZZZZZZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtNove_TranCC_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_20_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "NOVE_ESTADO_" + sGXsfl_20_idx ;
            cmbNove_Estado.setName( GXCCtl );
            cmbNove_Estado.setWebtags( "" );
            if ( cmbNove_Estado.getItemCount() > 0 )
            {
               A765Nove_Estado = cmbNove_Estado.getValidValue(A765Nove_Estado) ;
               n765Nove_Estado = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbNove_Estado,cmbNove_Estado.getInternalname(),GXutil.rtrim( A765Nove_Estado),new Integer(1),cmbNove_Estado.getJsonclick(),new Integer(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbNove_Estado.setValue( GXutil.rtrim( A765Nove_Estado) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbNove_Estado.getInternalname(), "Values", cmbNove_Estado.ToJavascriptSource(), !bGXsfl_20_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_RespuestaProc_Internalname,A815Nove_RespuestaProc,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtNove_RespuestaProc_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
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
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_NOVE_IDENTIFICADOR"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A106Nove_Identificador), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_NOVE_FECHAREGISTRO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( A780Nove_FechaRegistro, "99/99/99 99:99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_NOVE_USUARIOREGISTRO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A781Nove_UsuarioRegistro), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_NOVE_TRANSID"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A107Nove_TransId), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_NOVE_OBSERVACIONES"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, A802Nove_Observaciones));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_NOVE_MASIVO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A803Nove_Masivo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_NOVE_RUTASOPORTE"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A805Nove_RutaSoporte, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_NOVE_ESTADO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A765Nove_Estado, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_NOVE_RESPUESTAPROC"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A815Nove_RespuestaProc, ""))));
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
      edtNove_Identificador_Internalname = sPrefix+"NOVE_IDENTIFICADOR" ;
      edtNove_FechaRegistro_Internalname = sPrefix+"NOVE_FECHAREGISTRO" ;
      edtNove_UsuarioRegistro_Internalname = sPrefix+"NOVE_USUARIOREGISTRO" ;
      edtNove_TransId_Internalname = sPrefix+"NOVE_TRANSID" ;
      edtNove_RegionId_Internalname = sPrefix+"NOVE_REGIONID" ;
      edtNove_RegionCodigo_Internalname = sPrefix+"NOVE_REGIONCODIGO" ;
      edtNove_RegionDescripcion_Internalname = sPrefix+"NOVE_REGIONDESCRIPCION" ;
      edtNove_CentroId_Internalname = sPrefix+"NOVE_CENTROID" ;
      edtNove_CentroCodigo_Internalname = sPrefix+"NOVE_CENTROCODIGO" ;
      edtNove_CentroDescripcion_Internalname = sPrefix+"NOVE_CENTRODESCRIPCION" ;
      edtNove_CodigoMovimiento_Internalname = sPrefix+"NOVE_CODIGOMOVIMIENTO" ;
      edtNove_MovimientoDescrip_Internalname = sPrefix+"NOVE_MOVIMIENTODESCRIP" ;
      edtNove_ModuloOrigen_Internalname = sPrefix+"NOVE_MODULOORIGEN" ;
      edtNove_AlmaOrigen_Internalname = sPrefix+"NOVE_ALMAORIGEN" ;
      edtNove_BodeOrigen_Internalname = sPrefix+"NOVE_BODEORIGEN" ;
      edtNove_CuentadanteIdOrigen_Internalname = sPrefix+"NOVE_CUENTADANTEIDORIGEN" ;
      edtNove_CuentadanteCedOrigen_Internalname = sPrefix+"NOVE_CUENTADANTECEDORIGEN" ;
      edtNove_CuentadanteNomOrigen_Internalname = sPrefix+"NOVE_CUENTADANTENOMORIGEN" ;
      edtNove_ModuloDestino_Internalname = sPrefix+"NOVE_MODULODESTINO" ;
      edtNove_AlmaDestino_Internalname = sPrefix+"NOVE_ALMADESTINO" ;
      edtNove_BodeDestino_Internalname = sPrefix+"NOVE_BODEDESTINO" ;
      edtNove_CuentadanteIdDestino_Internalname = sPrefix+"NOVE_CUENTADANTEIDDESTINO" ;
      edtNove_CuentadanteCedDestino_Internalname = sPrefix+"NOVE_CUENTADANTECEDDESTINO" ;
      edtNove_CuentadanteNomDestino_Internalname = sPrefix+"NOVE_CUENTADANTENOMDESTINO" ;
      edtNove_Observaciones_Internalname = sPrefix+"NOVE_OBSERVACIONES" ;
      cmbNove_Masivo.setInternalname( sPrefix+"NOVE_MASIVO" );
      edtNove_Soporte_Internalname = sPrefix+"NOVE_SOPORTE" ;
      edtNove_RutaSoporte_Internalname = sPrefix+"NOVE_RUTASOPORTE" ;
      edtNove_TranCC_Internalname = sPrefix+"NOVE_TRANCC" ;
      cmbNove_Estado.setInternalname( sPrefix+"NOVE_ESTADO" );
      edtNove_RespuestaProc_Internalname = sPrefix+"NOVE_RESPUESTAPROC" ;
      edtavUpdate_Internalname = sPrefix+"vUPDATE" ;
      edtavDelete_Internalname = sPrefix+"vDELETE" ;
      divGridtable_Internalname = sPrefix+"GRIDTABLE" ;
      divGridcell_Internalname = sPrefix+"GRIDCELL" ;
      edtTNov_Codigo_Internalname = sPrefix+"TNOV_CODIGO" ;
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
      edtNove_RespuestaProc_Jsonclick = "" ;
      cmbNove_Estado.setJsonclick( "" );
      edtNove_TranCC_Jsonclick = "" ;
      edtNove_RutaSoporte_Jsonclick = "" ;
      edtNove_Soporte_Jsonclick = "" ;
      edtNove_Soporte_Parameters = "" ;
      edtNove_Soporte_Contenttype = "" ;
      edtNove_Soporte_Filetype = "" ;
      cmbNove_Masivo.setJsonclick( "" );
      edtNove_Observaciones_Jsonclick = "" ;
      edtNove_CuentadanteNomDestino_Jsonclick = "" ;
      edtNove_CuentadanteCedDestino_Jsonclick = "" ;
      edtNove_CuentadanteIdDestino_Jsonclick = "" ;
      edtNove_BodeDestino_Jsonclick = "" ;
      edtNove_AlmaDestino_Jsonclick = "" ;
      edtNove_ModuloDestino_Jsonclick = "" ;
      edtNove_CuentadanteNomOrigen_Jsonclick = "" ;
      edtNove_CuentadanteCedOrigen_Jsonclick = "" ;
      edtNove_CuentadanteIdOrigen_Jsonclick = "" ;
      edtNove_BodeOrigen_Jsonclick = "" ;
      edtNove_AlmaOrigen_Jsonclick = "" ;
      edtNove_ModuloOrigen_Jsonclick = "" ;
      edtNove_MovimientoDescrip_Jsonclick = "" ;
      edtNove_CodigoMovimiento_Jsonclick = "" ;
      edtNove_CentroDescripcion_Jsonclick = "" ;
      edtNove_CentroCodigo_Jsonclick = "" ;
      edtNove_CentroId_Jsonclick = "" ;
      edtNove_RegionDescripcion_Jsonclick = "" ;
      edtNove_RegionCodigo_Jsonclick = "" ;
      edtNove_RegionId_Jsonclick = "" ;
      edtNove_TransId_Jsonclick = "" ;
      edtNove_UsuarioRegistro_Jsonclick = "" ;
      edtNove_FechaRegistro_Jsonclick = "" ;
      edtNove_Identificador_Jsonclick = "" ;
      edtTNov_Codigo_Jsonclick = "" ;
      edtTNov_Codigo_Enabled = 0 ;
      edtTNov_Codigo_Visible = 1 ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      edtavDelete_Link = "" ;
      edtavUpdate_Link = "" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7TNov_Codigo',fld:'vTNOV_CODIGO',pic:'ZZZZZ9',nv:0},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A106Nove_Identificador',fld:'NOVE_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e133H2',iparms:[{av:'A106Nove_Identificador',fld:'NOVE_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[{av:'edtavUpdate_Link',ctrl:'vUPDATE',prop:'Link'},{av:'edtavDelete_Link',ctrl:'vDELETE',prop:'Link'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e113H2',iparms:[{av:'A106Nove_Identificador',fld:'NOVE_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7TNov_Codigo',fld:'vTNOV_CODIGO',pic:'ZZZZZ9',nv:0},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A106Nove_Identificador',fld:'NOVE_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7TNov_Codigo',fld:'vTNOV_CODIGO',pic:'ZZZZZ9',nv:0},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A106Nove_Identificador',fld:'NOVE_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7TNov_Codigo',fld:'vTNOV_CODIGO',pic:'ZZZZZ9',nv:0},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A106Nove_Identificador',fld:'NOVE_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7TNov_Codigo',fld:'vTNOV_CODIGO',pic:'ZZZZZ9',nv:0},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A106Nove_Identificador',fld:'NOVE_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
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
      A780Nove_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      A784Nove_RegionDescripcion = "" ;
      A786Nove_CentroCodigo = "" ;
      A787Nove_CentroDescripcion = "" ;
      A788Nove_CodigoMovimiento = "" ;
      A789Nove_MovimientoDescrip = "" ;
      A790Nove_ModuloOrigen = "" ;
      A791Nove_AlmaOrigen = "" ;
      A792Nove_BodeOrigen = "" ;
      A795Nove_CuentadanteNomOrigen = "" ;
      A796Nove_ModuloDestino = "" ;
      A797Nove_AlmaDestino = "" ;
      A798Nove_BodeDestino = "" ;
      A801Nove_CuentadanteNomDestino = "" ;
      A802Nove_Observaciones = "" ;
      A803Nove_Masivo = "" ;
      A804Nove_Soporte = "" ;
      A805Nove_RutaSoporte = "" ;
      A765Nove_Estado = "" ;
      A815Nove_RespuestaProc = "" ;
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
      H003H2_A802Nove_Observaciones = new String[] {""} ;
      H003H2_n802Nove_Observaciones = new boolean[] {false} ;
      H003H2_A104TNov_Codigo = new int[1] ;
      H003H2_n104TNov_Codigo = new boolean[] {false} ;
      H003H2_A815Nove_RespuestaProc = new String[] {""} ;
      H003H2_n815Nove_RespuestaProc = new boolean[] {false} ;
      H003H2_A765Nove_Estado = new String[] {""} ;
      H003H2_n765Nove_Estado = new boolean[] {false} ;
      H003H2_A814Nove_TranCC = new long[1] ;
      H003H2_n814Nove_TranCC = new boolean[] {false} ;
      H003H2_A805Nove_RutaSoporte = new String[] {""} ;
      H003H2_n805Nove_RutaSoporte = new boolean[] {false} ;
      H003H2_A804Nove_Soporte = new String[] {""} ;
      H003H2_n804Nove_Soporte = new boolean[] {false} ;
      H003H2_A803Nove_Masivo = new String[] {""} ;
      H003H2_n803Nove_Masivo = new boolean[] {false} ;
      H003H2_A801Nove_CuentadanteNomDestino = new String[] {""} ;
      H003H2_n801Nove_CuentadanteNomDestino = new boolean[] {false} ;
      H003H2_A800Nove_CuentadanteCedDestino = new long[1] ;
      H003H2_n800Nove_CuentadanteCedDestino = new boolean[] {false} ;
      H003H2_A799Nove_CuentadanteIdDestino = new long[1] ;
      H003H2_n799Nove_CuentadanteIdDestino = new boolean[] {false} ;
      H003H2_A798Nove_BodeDestino = new String[] {""} ;
      H003H2_n798Nove_BodeDestino = new boolean[] {false} ;
      H003H2_A797Nove_AlmaDestino = new String[] {""} ;
      H003H2_n797Nove_AlmaDestino = new boolean[] {false} ;
      H003H2_A796Nove_ModuloDestino = new String[] {""} ;
      H003H2_n796Nove_ModuloDestino = new boolean[] {false} ;
      H003H2_A795Nove_CuentadanteNomOrigen = new String[] {""} ;
      H003H2_n795Nove_CuentadanteNomOrigen = new boolean[] {false} ;
      H003H2_A794Nove_CuentadanteCedOrigen = new long[1] ;
      H003H2_n794Nove_CuentadanteCedOrigen = new boolean[] {false} ;
      H003H2_A793Nove_CuentadanteIdOrigen = new long[1] ;
      H003H2_n793Nove_CuentadanteIdOrigen = new boolean[] {false} ;
      H003H2_A792Nove_BodeOrigen = new String[] {""} ;
      H003H2_n792Nove_BodeOrigen = new boolean[] {false} ;
      H003H2_A791Nove_AlmaOrigen = new String[] {""} ;
      H003H2_n791Nove_AlmaOrigen = new boolean[] {false} ;
      H003H2_A790Nove_ModuloOrigen = new String[] {""} ;
      H003H2_n790Nove_ModuloOrigen = new boolean[] {false} ;
      H003H2_A789Nove_MovimientoDescrip = new String[] {""} ;
      H003H2_n789Nove_MovimientoDescrip = new boolean[] {false} ;
      H003H2_A788Nove_CodigoMovimiento = new String[] {""} ;
      H003H2_n788Nove_CodigoMovimiento = new boolean[] {false} ;
      H003H2_A787Nove_CentroDescripcion = new String[] {""} ;
      H003H2_n787Nove_CentroDescripcion = new boolean[] {false} ;
      H003H2_A786Nove_CentroCodigo = new String[] {""} ;
      H003H2_n786Nove_CentroCodigo = new boolean[] {false} ;
      H003H2_A785Nove_CentroId = new long[1] ;
      H003H2_n785Nove_CentroId = new boolean[] {false} ;
      H003H2_A784Nove_RegionDescripcion = new String[] {""} ;
      H003H2_n784Nove_RegionDescripcion = new boolean[] {false} ;
      H003H2_A783Nove_RegionCodigo = new short[1] ;
      H003H2_n783Nove_RegionCodigo = new boolean[] {false} ;
      H003H2_A782Nove_RegionId = new long[1] ;
      H003H2_n782Nove_RegionId = new boolean[] {false} ;
      H003H2_A107Nove_TransId = new long[1] ;
      H003H2_n107Nove_TransId = new boolean[] {false} ;
      H003H2_A781Nove_UsuarioRegistro = new long[1] ;
      H003H2_n781Nove_UsuarioRegistro = new boolean[] {false} ;
      H003H2_A780Nove_FechaRegistro = new java.util.Date[] {GXutil.nullDate()} ;
      H003H2_n780Nove_FechaRegistro = new boolean[] {false} ;
      H003H2_A106Nove_Identificador = new long[1] ;
      H003H3_AGRID_nRecordCount = new long[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV10TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV9HTTPRequest = httpContext.getHttpRequest();
      AV11TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV8Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV7TNov_Codigo = "" ;
      ROClassString = "" ;
      gxblobfileaux = new com.genexus.util.GXFile();
      sImgUrl = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_tipo_novedadalm_novedadwc__default(),
         new Object[] {
             new Object[] {
            H003H2_A802Nove_Observaciones, H003H2_n802Nove_Observaciones, H003H2_A104TNov_Codigo, H003H2_n104TNov_Codigo, H003H2_A815Nove_RespuestaProc, H003H2_n815Nove_RespuestaProc, H003H2_A765Nove_Estado, H003H2_n765Nove_Estado, H003H2_A814Nove_TranCC, H003H2_n814Nove_TranCC,
            H003H2_A805Nove_RutaSoporte, H003H2_n805Nove_RutaSoporte, H003H2_A804Nove_Soporte, H003H2_n804Nove_Soporte, H003H2_A803Nove_Masivo, H003H2_n803Nove_Masivo, H003H2_A801Nove_CuentadanteNomDestino, H003H2_n801Nove_CuentadanteNomDestino, H003H2_A800Nove_CuentadanteCedDestino, H003H2_n800Nove_CuentadanteCedDestino,
            H003H2_A799Nove_CuentadanteIdDestino, H003H2_n799Nove_CuentadanteIdDestino, H003H2_A798Nove_BodeDestino, H003H2_n798Nove_BodeDestino, H003H2_A797Nove_AlmaDestino, H003H2_n797Nove_AlmaDestino, H003H2_A796Nove_ModuloDestino, H003H2_n796Nove_ModuloDestino, H003H2_A795Nove_CuentadanteNomOrigen, H003H2_n795Nove_CuentadanteNomOrigen,
            H003H2_A794Nove_CuentadanteCedOrigen, H003H2_n794Nove_CuentadanteCedOrigen, H003H2_A793Nove_CuentadanteIdOrigen, H003H2_n793Nove_CuentadanteIdOrigen, H003H2_A792Nove_BodeOrigen, H003H2_n792Nove_BodeOrigen, H003H2_A791Nove_AlmaOrigen, H003H2_n791Nove_AlmaOrigen, H003H2_A790Nove_ModuloOrigen, H003H2_n790Nove_ModuloOrigen,
            H003H2_A789Nove_MovimientoDescrip, H003H2_n789Nove_MovimientoDescrip, H003H2_A788Nove_CodigoMovimiento, H003H2_n788Nove_CodigoMovimiento, H003H2_A787Nove_CentroDescripcion, H003H2_n787Nove_CentroDescripcion, H003H2_A786Nove_CentroCodigo, H003H2_n786Nove_CentroCodigo, H003H2_A785Nove_CentroId, H003H2_n785Nove_CentroId,
            H003H2_A784Nove_RegionDescripcion, H003H2_n784Nove_RegionDescripcion, H003H2_A783Nove_RegionCodigo, H003H2_n783Nove_RegionCodigo, H003H2_A782Nove_RegionId, H003H2_n782Nove_RegionId, H003H2_A107Nove_TransId, H003H2_n107Nove_TransId, H003H2_A781Nove_UsuarioRegistro, H003H2_n781Nove_UsuarioRegistro,
            H003H2_A780Nove_FechaRegistro, H003H2_n780Nove_FechaRegistro, H003H2_A106Nove_Identificador
            }
            , new Object[] {
            H003H3_AGRID_nRecordCount
            }
         }
      );
      AV17Pgmname = "ALM_TIPO_NOVEDADALM_NOVEDADWC" ;
      /* GeneXus formulas. */
      AV17Pgmname = "ALM_TIPO_NOVEDADALM_NOVEDADWC" ;
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
   private short A783Nove_RegionCodigo ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV7TNov_Codigo ;
   private int AV7TNov_Codigo ;
   private int subGrid_Rows ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int A104TNov_Codigo ;
   private int edtTNov_Codigo_Enabled ;
   private int edtTNov_Codigo_Visible ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private long A106Nove_Identificador ;
   private long GRID_nFirstRecordOnPage ;
   private long A781Nove_UsuarioRegistro ;
   private long A107Nove_TransId ;
   private long A782Nove_RegionId ;
   private long A785Nove_CentroId ;
   private long A793Nove_CuentadanteIdOrigen ;
   private long A794Nove_CuentadanteCedOrigen ;
   private long A799Nove_CuentadanteIdDestino ;
   private long A800Nove_CuentadanteCedDestino ;
   private long A814Nove_TranCC ;
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
   private String A765Nove_Estado ;
   private String edtavUpdate_Link ;
   private String edtavDelete_Link ;
   private String edtTNov_Codigo_Internalname ;
   private String edtTNov_Codigo_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtNove_Identificador_Internalname ;
   private String edtNove_FechaRegistro_Internalname ;
   private String edtNove_UsuarioRegistro_Internalname ;
   private String edtNove_TransId_Internalname ;
   private String edtNove_RegionId_Internalname ;
   private String edtNove_RegionCodigo_Internalname ;
   private String edtNove_RegionDescripcion_Internalname ;
   private String edtNove_CentroId_Internalname ;
   private String edtNove_CentroCodigo_Internalname ;
   private String edtNove_CentroDescripcion_Internalname ;
   private String edtNove_CodigoMovimiento_Internalname ;
   private String edtNove_MovimientoDescrip_Internalname ;
   private String edtNove_ModuloOrigen_Internalname ;
   private String edtNove_AlmaOrigen_Internalname ;
   private String edtNove_BodeOrigen_Internalname ;
   private String edtNove_CuentadanteIdOrigen_Internalname ;
   private String edtNove_CuentadanteCedOrigen_Internalname ;
   private String edtNove_CuentadanteNomOrigen_Internalname ;
   private String edtNove_ModuloDestino_Internalname ;
   private String edtNove_AlmaDestino_Internalname ;
   private String edtNove_BodeDestino_Internalname ;
   private String edtNove_CuentadanteIdDestino_Internalname ;
   private String edtNove_CuentadanteCedDestino_Internalname ;
   private String edtNove_CuentadanteNomDestino_Internalname ;
   private String edtNove_Observaciones_Internalname ;
   private String edtNove_Soporte_Internalname ;
   private String edtNove_RutaSoporte_Internalname ;
   private String edtNove_TranCC_Internalname ;
   private String edtNove_RespuestaProc_Internalname ;
   private String GXCCtl ;
   private String AV17Pgmname ;
   private String scmdbuf ;
   private String sCtrlAV7TNov_Codigo ;
   private String sGXsfl_20_fel_idx="0001" ;
   private String ROClassString ;
   private String edtNove_Identificador_Jsonclick ;
   private String edtNove_FechaRegistro_Jsonclick ;
   private String edtNove_UsuarioRegistro_Jsonclick ;
   private String edtNove_TransId_Jsonclick ;
   private String edtNove_RegionId_Jsonclick ;
   private String edtNove_RegionCodigo_Jsonclick ;
   private String edtNove_RegionDescripcion_Jsonclick ;
   private String edtNove_CentroId_Jsonclick ;
   private String edtNove_CentroCodigo_Jsonclick ;
   private String edtNove_CentroDescripcion_Jsonclick ;
   private String edtNove_CodigoMovimiento_Jsonclick ;
   private String edtNove_MovimientoDescrip_Jsonclick ;
   private String edtNove_ModuloOrigen_Jsonclick ;
   private String edtNove_AlmaOrigen_Jsonclick ;
   private String edtNove_BodeOrigen_Jsonclick ;
   private String edtNove_CuentadanteIdOrigen_Jsonclick ;
   private String edtNove_CuentadanteCedOrigen_Jsonclick ;
   private String edtNove_CuentadanteNomOrigen_Jsonclick ;
   private String edtNove_ModuloDestino_Jsonclick ;
   private String edtNove_AlmaDestino_Jsonclick ;
   private String edtNove_BodeDestino_Jsonclick ;
   private String edtNove_CuentadanteIdDestino_Jsonclick ;
   private String edtNove_CuentadanteCedDestino_Jsonclick ;
   private String edtNove_CuentadanteNomDestino_Jsonclick ;
   private String edtNove_Observaciones_Jsonclick ;
   private String edtNove_Soporte_Filetype ;
   private String edtNove_Soporte_Contenttype ;
   private String edtNove_Soporte_Parameters ;
   private String edtNove_Soporte_Jsonclick ;
   private String edtNove_RutaSoporte_Jsonclick ;
   private String edtNove_TranCC_Jsonclick ;
   private String edtNove_RespuestaProc_Jsonclick ;
   private String sImgUrl ;
   private java.util.Date A780Nove_FechaRegistro ;
   private boolean entryPointCalled ;
   private boolean bGXsfl_20_Refreshing=false ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n780Nove_FechaRegistro ;
   private boolean n781Nove_UsuarioRegistro ;
   private boolean n107Nove_TransId ;
   private boolean n782Nove_RegionId ;
   private boolean n783Nove_RegionCodigo ;
   private boolean n784Nove_RegionDescripcion ;
   private boolean n785Nove_CentroId ;
   private boolean n786Nove_CentroCodigo ;
   private boolean n787Nove_CentroDescripcion ;
   private boolean n788Nove_CodigoMovimiento ;
   private boolean n789Nove_MovimientoDescrip ;
   private boolean n790Nove_ModuloOrigen ;
   private boolean n791Nove_AlmaOrigen ;
   private boolean n792Nove_BodeOrigen ;
   private boolean n793Nove_CuentadanteIdOrigen ;
   private boolean n794Nove_CuentadanteCedOrigen ;
   private boolean n795Nove_CuentadanteNomOrigen ;
   private boolean n796Nove_ModuloDestino ;
   private boolean n797Nove_AlmaDestino ;
   private boolean n798Nove_BodeDestino ;
   private boolean n799Nove_CuentadanteIdDestino ;
   private boolean n800Nove_CuentadanteCedDestino ;
   private boolean n801Nove_CuentadanteNomDestino ;
   private boolean n802Nove_Observaciones ;
   private boolean n803Nove_Masivo ;
   private boolean n804Nove_Soporte ;
   private boolean n805Nove_RutaSoporte ;
   private boolean n814Nove_TranCC ;
   private boolean n765Nove_Estado ;
   private boolean n815Nove_RespuestaProc ;
   private boolean n104TNov_Codigo ;
   private boolean returnInSub ;
   private boolean AV12Update_IsBlob ;
   private boolean AV13Delete_IsBlob ;
   private String A802Nove_Observaciones ;
   private String A804Nove_Soporte ;
   private String A784Nove_RegionDescripcion ;
   private String A786Nove_CentroCodigo ;
   private String A787Nove_CentroDescripcion ;
   private String A788Nove_CodigoMovimiento ;
   private String A789Nove_MovimientoDescrip ;
   private String A790Nove_ModuloOrigen ;
   private String A791Nove_AlmaOrigen ;
   private String A792Nove_BodeOrigen ;
   private String A795Nove_CuentadanteNomOrigen ;
   private String A796Nove_ModuloDestino ;
   private String A797Nove_AlmaDestino ;
   private String A798Nove_BodeDestino ;
   private String A801Nove_CuentadanteNomDestino ;
   private String A803Nove_Masivo ;
   private String A805Nove_RutaSoporte ;
   private String A815Nove_RespuestaProc ;
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
   private com.genexus.util.GXFile gxblobfileaux ;
   private HTMLChoice cmbNove_Masivo ;
   private HTMLChoice cmbNove_Estado ;
   private IDataStoreProvider pr_default ;
   private String[] H003H2_A802Nove_Observaciones ;
   private boolean[] H003H2_n802Nove_Observaciones ;
   private int[] H003H2_A104TNov_Codigo ;
   private boolean[] H003H2_n104TNov_Codigo ;
   private String[] H003H2_A815Nove_RespuestaProc ;
   private boolean[] H003H2_n815Nove_RespuestaProc ;
   private String[] H003H2_A765Nove_Estado ;
   private boolean[] H003H2_n765Nove_Estado ;
   private long[] H003H2_A814Nove_TranCC ;
   private boolean[] H003H2_n814Nove_TranCC ;
   private String[] H003H2_A805Nove_RutaSoporte ;
   private boolean[] H003H2_n805Nove_RutaSoporte ;
   private String[] H003H2_A804Nove_Soporte ;
   private boolean[] H003H2_n804Nove_Soporte ;
   private String[] H003H2_A803Nove_Masivo ;
   private boolean[] H003H2_n803Nove_Masivo ;
   private String[] H003H2_A801Nove_CuentadanteNomDestino ;
   private boolean[] H003H2_n801Nove_CuentadanteNomDestino ;
   private long[] H003H2_A800Nove_CuentadanteCedDestino ;
   private boolean[] H003H2_n800Nove_CuentadanteCedDestino ;
   private long[] H003H2_A799Nove_CuentadanteIdDestino ;
   private boolean[] H003H2_n799Nove_CuentadanteIdDestino ;
   private String[] H003H2_A798Nove_BodeDestino ;
   private boolean[] H003H2_n798Nove_BodeDestino ;
   private String[] H003H2_A797Nove_AlmaDestino ;
   private boolean[] H003H2_n797Nove_AlmaDestino ;
   private String[] H003H2_A796Nove_ModuloDestino ;
   private boolean[] H003H2_n796Nove_ModuloDestino ;
   private String[] H003H2_A795Nove_CuentadanteNomOrigen ;
   private boolean[] H003H2_n795Nove_CuentadanteNomOrigen ;
   private long[] H003H2_A794Nove_CuentadanteCedOrigen ;
   private boolean[] H003H2_n794Nove_CuentadanteCedOrigen ;
   private long[] H003H2_A793Nove_CuentadanteIdOrigen ;
   private boolean[] H003H2_n793Nove_CuentadanteIdOrigen ;
   private String[] H003H2_A792Nove_BodeOrigen ;
   private boolean[] H003H2_n792Nove_BodeOrigen ;
   private String[] H003H2_A791Nove_AlmaOrigen ;
   private boolean[] H003H2_n791Nove_AlmaOrigen ;
   private String[] H003H2_A790Nove_ModuloOrigen ;
   private boolean[] H003H2_n790Nove_ModuloOrigen ;
   private String[] H003H2_A789Nove_MovimientoDescrip ;
   private boolean[] H003H2_n789Nove_MovimientoDescrip ;
   private String[] H003H2_A788Nove_CodigoMovimiento ;
   private boolean[] H003H2_n788Nove_CodigoMovimiento ;
   private String[] H003H2_A787Nove_CentroDescripcion ;
   private boolean[] H003H2_n787Nove_CentroDescripcion ;
   private String[] H003H2_A786Nove_CentroCodigo ;
   private boolean[] H003H2_n786Nove_CentroCodigo ;
   private long[] H003H2_A785Nove_CentroId ;
   private boolean[] H003H2_n785Nove_CentroId ;
   private String[] H003H2_A784Nove_RegionDescripcion ;
   private boolean[] H003H2_n784Nove_RegionDescripcion ;
   private short[] H003H2_A783Nove_RegionCodigo ;
   private boolean[] H003H2_n783Nove_RegionCodigo ;
   private long[] H003H2_A782Nove_RegionId ;
   private boolean[] H003H2_n782Nove_RegionId ;
   private long[] H003H2_A107Nove_TransId ;
   private boolean[] H003H2_n107Nove_TransId ;
   private long[] H003H2_A781Nove_UsuarioRegistro ;
   private boolean[] H003H2_n781Nove_UsuarioRegistro ;
   private java.util.Date[] H003H2_A780Nove_FechaRegistro ;
   private boolean[] H003H2_n780Nove_FechaRegistro ;
   private long[] H003H2_A106Nove_Identificador ;
   private long[] H003H3_AGRID_nRecordCount ;
   private com.genexus.webpanels.WebSession AV8Session ;
   private com.orions2.SdtTransactionContext AV10TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV11TrnContextAtt ;
}

final  class alm_tipo_novedadalm_novedadwc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H003H2", "SELECT T1.Nove_Observaciones, T1.TNov_Codigo, T1.Nove_RespuestaProc, T1.Nove_Estado, T2.Tran_ConsecutivoCC AS Nove_TranCC, T1.Nove_RutaSoporte, T1.Nove_Soporte, T1.Nove_Masivo, T3.Cuen_Nombre AS Nove_CuentadanteNomDestino, T3.Cuen_Cedula AS Nove_CuentadanteCedDestino, T2.Tran_IdCuentadanteDestino AS Nove_CuentadanteIdDestino, T2.Tran_CodBodeDestino AS Nove_BodeDestino, T2.Tran_CodAlmaDestino AS Nove_AlmaDestino, T2.Tran_ModuloDestino AS Nove_ModuloDestino, T4.Cuen_Nombre AS Nove_CuentadanteNomOrigen, T4.Cuen_Cedula AS Nove_CuentadanteCedOrigen, T2.Tran_IdCuentadanteOrigen AS Nove_CuentadanteIdOrigen, T2.Tran_CodBodeOrigen AS Nove_BodeOrigen, T2.Tran_CodAlmaOrigen AS Nove_AlmaOrigen, T2.Tran_ModuloOrigen AS Nove_ModuloOrigen, T5.Tpmo_Descripcion AS Nove_MovimientoDescrip, T2.Tran_CodigoMovimiento AS Nove_CodigoMovimiento, T6.Cent_Descripcion AS Nove_CentroDescripcion, T6.Cent_Codigo AS Nove_CentroCodigo, T2.Tran_CentroCostoId AS Nove_CentroId, T7.Regi_Descripcion AS Nove_RegionDescripcion, T7.Regi_Cod AS Nove_RegionCodigo, T2.Tran_RegionId AS Nove_RegionId, T1.Nove_TransId AS Nove_TransId, T1.Nove_UsuarioRegistro, T1.Nove_FechaRegistro, T1.Nove_Identificador FROM ((((((ALM_NOVEDAD T1 LEFT JOIN ALM_TRANSACCION T2 ON T2.Tran_Id = T1.Nove_TransId) LEFT JOIN ALM_CUENTADANTE T3 ON T3.Cuen_Identificacion = T2.Tran_IdCuentadanteDestino) LEFT JOIN ALM_CUENTADANTE T4 ON T4.Cuen_Identificacion = T2.Tran_IdCuentadanteOrigen) LEFT JOIN ALM_TIPO_MOVIMIENTO T5 ON T5.Tpmo_Codigo = T2.Tran_CodigoMovimiento) LEFT JOIN GEN_CENTROCOSTO T6 ON T6.Cent_Id = T2.Tran_CentroCostoId) LEFT JOIN GEN_REGIONAL T7 ON T7.Regi_Id = T2.Tran_RegionId) WHERE T1.TNov_Codigo = ? ORDER BY T1.TNov_Codigo  OFFSET ? ROWS FETCH NEXT (CASE WHEN ? > 0 THEN ? ELSE 1e9 END) ROWS ONLY",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H003H3", "SELECT COUNT(*) FROM ((((((ALM_NOVEDAD T1 LEFT JOIN ALM_TRANSACCION T2 ON T2.Tran_Id = T1.Nove_TransId) LEFT JOIN ALM_CUENTADANTE T7 ON T7.Cuen_Identificacion = T2.Tran_IdCuentadanteDestino) LEFT JOIN ALM_CUENTADANTE T6 ON T6.Cuen_Identificacion = T2.Tran_IdCuentadanteOrigen) LEFT JOIN ALM_TIPO_MOVIMIENTO T5 ON T5.Tpmo_Codigo = T2.Tran_CodigoMovimiento) LEFT JOIN GEN_CENTROCOSTO T3 ON T3.Cent_Id = T2.Tran_CentroCostoId) LEFT JOIN GEN_REGIONAL T4 ON T4.Regi_Id = T2.Tran_RegionId) WHERE T1.TNov_Codigo = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 1) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getBLOBFile(7, "tmp", "") ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((long[]) buf[18])[0] = rslt.getLong(10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((long[]) buf[20])[0] = rslt.getLong(11) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((long[]) buf[30])[0] = rslt.getLong(16) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((long[]) buf[32])[0] = rslt.getLong(17) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((long[]) buf[48])[0] = rslt.getLong(25) ;
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((short[]) buf[52])[0] = rslt.getShort(27) ;
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((long[]) buf[54])[0] = rslt.getLong(28) ;
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((long[]) buf[56])[0] = rslt.getLong(29) ;
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((long[]) buf[58])[0] = rslt.getLong(30) ;
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[60])[0] = rslt.getGXDateTime(31) ;
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((long[]) buf[62])[0] = rslt.getLong(32) ;
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

