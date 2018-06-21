/*
               File: alm_bodegaalm_restriccioneswc_impl
        Description: ALM_BODEGAALM_RESTRICCIONESWC
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:14:14.34
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

public final  class alm_bodegaalm_restriccioneswc_impl extends GXWebComponent
{
   public alm_bodegaalm_restriccioneswc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_bodegaalm_restriccioneswc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_bodegaalm_restriccioneswc_impl.class ));
   }

   public alm_bodegaalm_restriccioneswc_impl( int remoteHandle ,
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
      cmbMbod_AlmModOrigen = new HTMLChoice();
      cmbMbod_AlmModDestino = new HTMLChoice();
      cmbMbod_Estado = new HTMLChoice();
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
               AV7Mbod_BodOrigenCodigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Mbod_BodOrigenCodigo", AV7Mbod_BodOrigenCodigo);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV7Mbod_BodOrigenCodigo});
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
               AV7Mbod_BodOrigenCodigo = httpContext.GetNextPar( ) ;
               AV12Update = httpContext.GetNextPar( ) ;
               edtavUpdate_Tooltiptext = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_20_Refreshing);
               AV13Delete = httpContext.GetNextPar( ) ;
               edtavDelete_Tooltiptext = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "Tooltiptext", edtavDelete_Tooltiptext, !bGXsfl_20_Refreshing);
               A60Mbod_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               sPrefix = httpContext.GetNextPar( ) ;
               init_default_properties( ) ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxgrgrid_refresh( subGrid_Rows, AV7Mbod_BodOrigenCodigo, AV12Update, AV13Delete, A60Mbod_Id, sPrefix) ;
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
         pa3Y2( ) ;
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
         httpContext.writeValue( "ALM_BODEGAALM_RESTRICCIONESWC") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414141440");
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_bodegaalm_restriccioneswc") + "?" + GXutil.URLEncode(GXutil.rtrim(AV7Mbod_BodOrigenCodigo))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7Mbod_BodOrigenCodigo", wcpOAV7Mbod_BodOrigenCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMBOD_BODORIGENCODIGO", AV7Mbod_BodOrigenCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUPDATE_Tooltiptext", GXutil.rtrim( edtavUpdate_Tooltiptext));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDELETE_Tooltiptext", GXutil.rtrim( edtavDelete_Tooltiptext));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm3Y2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("alm_bodegaalm_restriccioneswc.js", "?201861414141443");
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
      return "ALM_BODEGAALM_RESTRICCIONESWC" ;
   }

   public String getPgmdesc( )
   {
      return "ALM_BODEGAALM_RESTRICCIONESWC" ;
   }

   public void wb3Y0( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.alm_bodegaalm_restriccioneswc");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 20, 2, 0)+","+"null"+");", "Agregar", bttBtninsert_Jsonclick, 5, "Agregar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_BODEGAALM_RESTRICCIONESWC.htm");
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
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tipo Movimiento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tipo Movimiento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Elemento Codigo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Elemento Descripcion") ;
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
            httpContext.writeValue( "Costo Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Costo Codigo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Costo Descripción") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Origen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Almacen Origen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Almacen Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Bodega Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Bodega Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Estado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Creación") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Usuario") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Usuario") ;
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
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A60Mbod_Id, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A61Mbod_TipoMovCodigo);
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtMbod_TipoMovCodigo_Link));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A428Mbod_TipoMovDescrip);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A431Mbod_TipoElementoCod, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A432Mbod_TipoElementoDesc);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A62Mbod_RegionId, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A426Mbod_RegionCodigo, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A427Mbod_RegionDescripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A63Mbod_CentCostoId, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A429Mbod_CentCostoCodigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A430Mbod_CentroCostoDescrip);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A364Mbod_AlmModOrigen);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A342Mbod_AlmOrigenCodigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A368Mbod_AlmModDestino);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A345Mbod_AlmDestinoCodigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A65Mbod_BodDestinoCodigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A347Mbod_BodDestinoDescripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A434Mbod_Estado));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A433Mbod_FechaCrea, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A359Mbod_UsuarioCrea);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A362Mbod_FechaModifica, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A361Mbod_UsuarioModifica);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_BodOrigenCodigo_Internalname, "Codigo Bodega Origen", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_BodOrigenCodigo_Internalname, A64Mbod_BodOrigenCodigo, GXutil.rtrim( localUtil.format( A64Mbod_BodOrigenCodigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_BodOrigenCodigo_Jsonclick, 0, "Attribute", "", "", "", edtMbod_BodOrigenCodigo_Visible, edtMbod_BodOrigenCodigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_BODEGAALM_RESTRICCIONESWC.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start3Y2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "ALM_BODEGAALM_RESTRICCIONESWC", (short)(0)) ;
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
            strup3Y0( ) ;
         }
      }
   }

   public void ws3Y2( )
   {
      start3Y2( ) ;
      evt3Y2( ) ;
   }

   public void evt3Y2( )
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
                              strup3Y0( ) ;
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
                              strup3Y0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoInsert' */
                                 e113Y2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup3Y0( ) ;
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
                              strup3Y0( ) ;
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
                              strup3Y0( ) ;
                           }
                           nGXsfl_20_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_20_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_20_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_202( ) ;
                           A60Mbod_Id = localUtil.ctol( httpContext.cgiGet( edtMbod_Id_Internalname), ",", ".") ;
                           A61Mbod_TipoMovCodigo = httpContext.cgiGet( edtMbod_TipoMovCodigo_Internalname) ;
                           A428Mbod_TipoMovDescrip = httpContext.cgiGet( edtMbod_TipoMovDescrip_Internalname) ;
                           n428Mbod_TipoMovDescrip = false ;
                           A431Mbod_TipoElementoCod = localUtil.ctol( httpContext.cgiGet( edtMbod_TipoElementoCod_Internalname), ",", ".") ;
                           n431Mbod_TipoElementoCod = false ;
                           A432Mbod_TipoElementoDesc = GXutil.upper( httpContext.cgiGet( edtMbod_TipoElementoDesc_Internalname)) ;
                           n432Mbod_TipoElementoDesc = false ;
                           A62Mbod_RegionId = localUtil.ctol( httpContext.cgiGet( edtMbod_RegionId_Internalname), ",", ".") ;
                           A426Mbod_RegionCodigo = (short)(localUtil.ctol( httpContext.cgiGet( edtMbod_RegionCodigo_Internalname), ",", ".")) ;
                           n426Mbod_RegionCodigo = false ;
                           A427Mbod_RegionDescripcion = httpContext.cgiGet( edtMbod_RegionDescripcion_Internalname) ;
                           n427Mbod_RegionDescripcion = false ;
                           A63Mbod_CentCostoId = localUtil.ctol( httpContext.cgiGet( edtMbod_CentCostoId_Internalname), ",", ".") ;
                           A429Mbod_CentCostoCodigo = httpContext.cgiGet( edtMbod_CentCostoCodigo_Internalname) ;
                           n429Mbod_CentCostoCodigo = false ;
                           A430Mbod_CentroCostoDescrip = httpContext.cgiGet( edtMbod_CentroCostoDescrip_Internalname) ;
                           n430Mbod_CentroCostoDescrip = false ;
                           cmbMbod_AlmModOrigen.setName( cmbMbod_AlmModOrigen.getInternalname() );
                           cmbMbod_AlmModOrigen.setValue( httpContext.cgiGet( cmbMbod_AlmModOrigen.getInternalname()) );
                           A364Mbod_AlmModOrigen = httpContext.cgiGet( cmbMbod_AlmModOrigen.getInternalname()) ;
                           A342Mbod_AlmOrigenCodigo = httpContext.cgiGet( edtMbod_AlmOrigenCodigo_Internalname) ;
                           cmbMbod_AlmModDestino.setName( cmbMbod_AlmModDestino.getInternalname() );
                           cmbMbod_AlmModDestino.setValue( httpContext.cgiGet( cmbMbod_AlmModDestino.getInternalname()) );
                           A368Mbod_AlmModDestino = httpContext.cgiGet( cmbMbod_AlmModDestino.getInternalname()) ;
                           A345Mbod_AlmDestinoCodigo = httpContext.cgiGet( edtMbod_AlmDestinoCodigo_Internalname) ;
                           A65Mbod_BodDestinoCodigo = httpContext.cgiGet( edtMbod_BodDestinoCodigo_Internalname) ;
                           A347Mbod_BodDestinoDescripcion = GXutil.upper( httpContext.cgiGet( edtMbod_BodDestinoDescripcion_Internalname)) ;
                           cmbMbod_Estado.setName( cmbMbod_Estado.getInternalname() );
                           cmbMbod_Estado.setValue( httpContext.cgiGet( cmbMbod_Estado.getInternalname()) );
                           A434Mbod_Estado = httpContext.cgiGet( cmbMbod_Estado.getInternalname()) ;
                           A433Mbod_FechaCrea = localUtil.ctot( httpContext.cgiGet( edtMbod_FechaCrea_Internalname), 0) ;
                           A359Mbod_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtMbod_UsuarioCrea_Internalname)) ;
                           A362Mbod_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtMbod_FechaModifica_Internalname), 0) ;
                           A361Mbod_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtMbod_UsuarioModifica_Internalname)) ;
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
                                       e123Y2 ();
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
                                       e133Y2 ();
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
                                    strup3Y0( ) ;
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

   public void we3Y2( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm3Y2( ) ;
         }
      }
   }

   public void pa3Y2( )
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
         GXCCtl = "MBOD_ALMMODORIGEN_" + sGXsfl_20_idx ;
         cmbMbod_AlmModOrigen.setName( GXCCtl );
         cmbMbod_AlmModOrigen.setWebtags( "" );
         cmbMbod_AlmModOrigen.addItem("ALMA", "ALMACEN", (short)(0));
         cmbMbod_AlmModOrigen.addItem("INVE", "INVENTARIO", (short)(0));
         cmbMbod_AlmModOrigen.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
         if ( cmbMbod_AlmModOrigen.getItemCount() > 0 )
         {
            A364Mbod_AlmModOrigen = cmbMbod_AlmModOrigen.getValidValue(A364Mbod_AlmModOrigen) ;
         }
         GXCCtl = "MBOD_ALMMODDESTINO_" + sGXsfl_20_idx ;
         cmbMbod_AlmModDestino.setName( GXCCtl );
         cmbMbod_AlmModDestino.setWebtags( "" );
         cmbMbod_AlmModDestino.addItem("ALMA", "ALMACEN", (short)(0));
         cmbMbod_AlmModDestino.addItem("INVE", "INVENTARIO", (short)(0));
         cmbMbod_AlmModDestino.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
         if ( cmbMbod_AlmModDestino.getItemCount() > 0 )
         {
            A368Mbod_AlmModDestino = cmbMbod_AlmModDestino.getValidValue(A368Mbod_AlmModDestino) ;
         }
         GXCCtl = "MBOD_ESTADO_" + sGXsfl_20_idx ;
         cmbMbod_Estado.setName( GXCCtl );
         cmbMbod_Estado.setWebtags( "" );
         cmbMbod_Estado.addItem("A", "Activo", (short)(0));
         cmbMbod_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbMbod_Estado.getItemCount() > 0 )
         {
            A434Mbod_Estado = cmbMbod_Estado.getValidValue(A434Mbod_Estado) ;
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
                                 String AV7Mbod_BodOrigenCodigo ,
                                 String AV12Update ,
                                 String AV13Delete ,
                                 long A60Mbod_Id ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid_Rows = subGrid_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID_nCurrentRecord = 0 ;
      rf3Y2( ) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_ID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A60Mbod_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MBOD_ID", GXutil.ltrim( localUtil.ntoc( A60Mbod_Id, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_REGIONID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A62Mbod_RegionId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MBOD_REGIONID", GXutil.ltrim( localUtil.ntoc( A62Mbod_RegionId, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_CENTCOSTOID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A63Mbod_CentCostoId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MBOD_CENTCOSTOID", GXutil.ltrim( localUtil.ntoc( A63Mbod_CentCostoId, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_ALMMODORIGEN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A364Mbod_AlmModOrigen, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MBOD_ALMMODORIGEN", A364Mbod_AlmModOrigen);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_ALMORIGENCODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A342Mbod_AlmOrigenCodigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MBOD_ALMORIGENCODIGO", A342Mbod_AlmOrigenCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_ALMMODDESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A368Mbod_AlmModDestino, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MBOD_ALMMODDESTINO", A368Mbod_AlmModDestino);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_ALMDESTINOCODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A345Mbod_AlmDestinoCodigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MBOD_ALMDESTINOCODIGO", A345Mbod_AlmDestinoCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_BODDESTINOCODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A65Mbod_BodDestinoCodigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MBOD_BODDESTINOCODIGO", A65Mbod_BodDestinoCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A434Mbod_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MBOD_ESTADO", GXutil.rtrim( A434Mbod_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A433Mbod_FechaCrea, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MBOD_FECHACREA", localUtil.ttoc( A433Mbod_FechaCrea, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A359Mbod_UsuarioCrea, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MBOD_USUARIOCREA", A359Mbod_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A362Mbod_FechaModifica, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MBOD_FECHAMODIFICA", localUtil.ttoc( A362Mbod_FechaModifica, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A361Mbod_UsuarioModifica, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MBOD_USUARIOMODIFICA", A361Mbod_UsuarioModifica);
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf3Y2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV17Pgmname = "ALM_BODEGAALM_RESTRICCIONESWC" ;
      Gx_err = (short)(0) ;
   }

   public void rf3Y2( )
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
         /* Using cursor H003Y2 */
         pr_default.execute(0, new Object[] {AV7Mbod_BodOrigenCodigo, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_20_idx = (short)(1) ;
         sGXsfl_20_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_20_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_202( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_recordsperpage( ) ) ) ) )
         {
            A64Mbod_BodOrigenCodigo = H003Y2_A64Mbod_BodOrigenCodigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A64Mbod_BodOrigenCodigo", A64Mbod_BodOrigenCodigo);
            A361Mbod_UsuarioModifica = H003Y2_A361Mbod_UsuarioModifica[0] ;
            A362Mbod_FechaModifica = H003Y2_A362Mbod_FechaModifica[0] ;
            A359Mbod_UsuarioCrea = H003Y2_A359Mbod_UsuarioCrea[0] ;
            A433Mbod_FechaCrea = H003Y2_A433Mbod_FechaCrea[0] ;
            A434Mbod_Estado = H003Y2_A434Mbod_Estado[0] ;
            A65Mbod_BodDestinoCodigo = H003Y2_A65Mbod_BodDestinoCodigo[0] ;
            A345Mbod_AlmDestinoCodigo = H003Y2_A345Mbod_AlmDestinoCodigo[0] ;
            A368Mbod_AlmModDestino = H003Y2_A368Mbod_AlmModDestino[0] ;
            A342Mbod_AlmOrigenCodigo = H003Y2_A342Mbod_AlmOrigenCodigo[0] ;
            A364Mbod_AlmModOrigen = H003Y2_A364Mbod_AlmModOrigen[0] ;
            A430Mbod_CentroCostoDescrip = H003Y2_A430Mbod_CentroCostoDescrip[0] ;
            n430Mbod_CentroCostoDescrip = H003Y2_n430Mbod_CentroCostoDescrip[0] ;
            A429Mbod_CentCostoCodigo = H003Y2_A429Mbod_CentCostoCodigo[0] ;
            n429Mbod_CentCostoCodigo = H003Y2_n429Mbod_CentCostoCodigo[0] ;
            A63Mbod_CentCostoId = H003Y2_A63Mbod_CentCostoId[0] ;
            A427Mbod_RegionDescripcion = H003Y2_A427Mbod_RegionDescripcion[0] ;
            n427Mbod_RegionDescripcion = H003Y2_n427Mbod_RegionDescripcion[0] ;
            A426Mbod_RegionCodigo = H003Y2_A426Mbod_RegionCodigo[0] ;
            n426Mbod_RegionCodigo = H003Y2_n426Mbod_RegionCodigo[0] ;
            A62Mbod_RegionId = H003Y2_A62Mbod_RegionId[0] ;
            A432Mbod_TipoElementoDesc = H003Y2_A432Mbod_TipoElementoDesc[0] ;
            n432Mbod_TipoElementoDesc = H003Y2_n432Mbod_TipoElementoDesc[0] ;
            A431Mbod_TipoElementoCod = H003Y2_A431Mbod_TipoElementoCod[0] ;
            n431Mbod_TipoElementoCod = H003Y2_n431Mbod_TipoElementoCod[0] ;
            A428Mbod_TipoMovDescrip = H003Y2_A428Mbod_TipoMovDescrip[0] ;
            n428Mbod_TipoMovDescrip = H003Y2_n428Mbod_TipoMovDescrip[0] ;
            A61Mbod_TipoMovCodigo = H003Y2_A61Mbod_TipoMovCodigo[0] ;
            A60Mbod_Id = H003Y2_A60Mbod_Id[0] ;
            A430Mbod_CentroCostoDescrip = H003Y2_A430Mbod_CentroCostoDescrip[0] ;
            n430Mbod_CentroCostoDescrip = H003Y2_n430Mbod_CentroCostoDescrip[0] ;
            A429Mbod_CentCostoCodigo = H003Y2_A429Mbod_CentCostoCodigo[0] ;
            n429Mbod_CentCostoCodigo = H003Y2_n429Mbod_CentCostoCodigo[0] ;
            A427Mbod_RegionDescripcion = H003Y2_A427Mbod_RegionDescripcion[0] ;
            n427Mbod_RegionDescripcion = H003Y2_n427Mbod_RegionDescripcion[0] ;
            A426Mbod_RegionCodigo = H003Y2_A426Mbod_RegionCodigo[0] ;
            n426Mbod_RegionCodigo = H003Y2_n426Mbod_RegionCodigo[0] ;
            A431Mbod_TipoElementoCod = H003Y2_A431Mbod_TipoElementoCod[0] ;
            n431Mbod_TipoElementoCod = H003Y2_n431Mbod_TipoElementoCod[0] ;
            A428Mbod_TipoMovDescrip = H003Y2_A428Mbod_TipoMovDescrip[0] ;
            n428Mbod_TipoMovDescrip = H003Y2_n428Mbod_TipoMovDescrip[0] ;
            A432Mbod_TipoElementoDesc = H003Y2_A432Mbod_TipoElementoDesc[0] ;
            n432Mbod_TipoElementoDesc = H003Y2_n432Mbod_TipoElementoDesc[0] ;
            /* Using cursor H003Y3 */
            pr_default.execute(1, new Object[] {A65Mbod_BodDestinoCodigo});
            pr_default.close(1);
            /* Using cursor H003Y4 */
            pr_default.execute(2, new Object[] {A64Mbod_BodOrigenCodigo});
            A251Bode_Descripcion = H003Y4_A251Bode_Descripcion[0] ;
            pr_default.close(2);
            e133Y2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         pr_default.close(2);
         wbEnd = (short)(20) ;
         wb3Y0( ) ;
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
      return -1 ;
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
      return -1 ;
   }

   public short subgrid_firstpage( )
   {
      GRID_nFirstRecordOnPage = 0 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7Mbod_BodOrigenCodigo, AV12Update, AV13Delete, A60Mbod_Id, sPrefix) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_recordsperpage( )) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7Mbod_BodOrigenCodigo, AV12Update, AV13Delete, A60Mbod_Id, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Mbod_BodOrigenCodigo, AV12Update, AV13Delete, A60Mbod_Id, sPrefix) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7Mbod_BodOrigenCodigo, AV12Update, AV13Delete, A60Mbod_Id, sPrefix) ;
      }
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
         gxgrgrid_refresh( subGrid_Rows, AV7Mbod_BodOrigenCodigo, AV12Update, AV13Delete, A60Mbod_Id, sPrefix) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup3Y0( )
   {
      /* Before Start, stand alone formulas. */
      AV17Pgmname = "ALM_BODEGAALM_RESTRICCIONESWC" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e123Y2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A64Mbod_BodOrigenCodigo = httpContext.cgiGet( edtMbod_BodOrigenCodigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A64Mbod_BodOrigenCodigo", A64Mbod_BodOrigenCodigo);
         /* Read saved values. */
         nRC_GXsfl_20 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_20"), ",", ".")) ;
         wcpOAV7Mbod_BodOrigenCodigo = httpContext.cgiGet( sPrefix+"wcpOAV7Mbod_BodOrigenCodigo") ;
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
      e123Y2 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e123Y2( )
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
      edtMbod_BodOrigenCodigo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMbod_BodOrigenCodigo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtMbod_BodOrigenCodigo_Visible, 5, 0)), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   private void e133Y2( )
   {
      /* Grid_Load Routine */
      edtavUpdate_Link = formatLink("com.orions2.alm_restricciones") + "?" + GXutil.URLEncode(GXutil.rtrim("UPD")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A60Mbod_Id,11,0))) ;
      edtavDelete_Link = formatLink("com.orions2.alm_restricciones") + "?" + GXutil.URLEncode(GXutil.rtrim("DLT")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A60Mbod_Id,11,0))) ;
      edtMbod_TipoMovCodigo_Link = formatLink("com.orions2.viewalm_restricciones") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A60Mbod_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
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

   public void e113Y2( )
   {
      /* 'DoInsert' Routine */
      callWebObject(formatLink("com.orions2.alm_restricciones") + "?" + GXutil.URLEncode(GXutil.rtrim("INS")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))));
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV10TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV17Pgmname );
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerondelete( true );
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV9HTTPRequest.getScriptName()+"?"+AV9HTTPRequest.getQuerystring() );
      AV10TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_RESTRICCIONES" );
      AV11TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV11TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Mbod_BodOrigenCodigo" );
      AV11TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( AV7Mbod_BodOrigenCodigo );
      AV10TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV11TrnContextAtt, 0);
      AV8Session.setValue("TrnContext", AV10TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      AV7Mbod_BodOrigenCodigo = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Mbod_BodOrigenCodigo", AV7Mbod_BodOrigenCodigo);
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
      pa3Y2( ) ;
      ws3Y2( ) ;
      we3Y2( ) ;
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
      sCtrlAV7Mbod_BodOrigenCodigo = (String)getParm(obj,0,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa3Y2( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "alm_bodegaalm_restriccioneswc");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa3Y2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV7Mbod_BodOrigenCodigo = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Mbod_BodOrigenCodigo", AV7Mbod_BodOrigenCodigo);
      }
      wcpOAV7Mbod_BodOrigenCodigo = httpContext.cgiGet( sPrefix+"wcpOAV7Mbod_BodOrigenCodigo") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV7Mbod_BodOrigenCodigo, wcpOAV7Mbod_BodOrigenCodigo) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV7Mbod_BodOrigenCodigo = AV7Mbod_BodOrigenCodigo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV7Mbod_BodOrigenCodigo = httpContext.cgiGet( sPrefix+"AV7Mbod_BodOrigenCodigo_CTRL") ;
      if ( GXutil.len( sCtrlAV7Mbod_BodOrigenCodigo) > 0 )
      {
         AV7Mbod_BodOrigenCodigo = httpContext.cgiGet( sCtrlAV7Mbod_BodOrigenCodigo) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Mbod_BodOrigenCodigo", AV7Mbod_BodOrigenCodigo);
      }
      else
      {
         AV7Mbod_BodOrigenCodigo = httpContext.cgiGet( sPrefix+"AV7Mbod_BodOrigenCodigo_PARM") ;
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
      pa3Y2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws3Y2( ) ;
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
      ws3Y2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Mbod_BodOrigenCodigo_PARM", AV7Mbod_BodOrigenCodigo);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7Mbod_BodOrigenCodigo)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Mbod_BodOrigenCodigo_CTRL", GXutil.rtrim( sCtrlAV7Mbod_BodOrigenCodigo));
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
      we3Y2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414141523");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("alm_bodegaalm_restriccioneswc.js", "?201861414141523");
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_202( )
   {
      edtMbod_Id_Internalname = sPrefix+"MBOD_ID_"+sGXsfl_20_idx ;
      edtMbod_TipoMovCodigo_Internalname = sPrefix+"MBOD_TIPOMOVCODIGO_"+sGXsfl_20_idx ;
      edtMbod_TipoMovDescrip_Internalname = sPrefix+"MBOD_TIPOMOVDESCRIP_"+sGXsfl_20_idx ;
      edtMbod_TipoElementoCod_Internalname = sPrefix+"MBOD_TIPOELEMENTOCOD_"+sGXsfl_20_idx ;
      edtMbod_TipoElementoDesc_Internalname = sPrefix+"MBOD_TIPOELEMENTODESC_"+sGXsfl_20_idx ;
      edtMbod_RegionId_Internalname = sPrefix+"MBOD_REGIONID_"+sGXsfl_20_idx ;
      edtMbod_RegionCodigo_Internalname = sPrefix+"MBOD_REGIONCODIGO_"+sGXsfl_20_idx ;
      edtMbod_RegionDescripcion_Internalname = sPrefix+"MBOD_REGIONDESCRIPCION_"+sGXsfl_20_idx ;
      edtMbod_CentCostoId_Internalname = sPrefix+"MBOD_CENTCOSTOID_"+sGXsfl_20_idx ;
      edtMbod_CentCostoCodigo_Internalname = sPrefix+"MBOD_CENTCOSTOCODIGO_"+sGXsfl_20_idx ;
      edtMbod_CentroCostoDescrip_Internalname = sPrefix+"MBOD_CENTROCOSTODESCRIP_"+sGXsfl_20_idx ;
      cmbMbod_AlmModOrigen.setInternalname( sPrefix+"MBOD_ALMMODORIGEN_"+sGXsfl_20_idx );
      edtMbod_AlmOrigenCodigo_Internalname = sPrefix+"MBOD_ALMORIGENCODIGO_"+sGXsfl_20_idx ;
      cmbMbod_AlmModDestino.setInternalname( sPrefix+"MBOD_ALMMODDESTINO_"+sGXsfl_20_idx );
      edtMbod_AlmDestinoCodigo_Internalname = sPrefix+"MBOD_ALMDESTINOCODIGO_"+sGXsfl_20_idx ;
      edtMbod_BodDestinoCodigo_Internalname = sPrefix+"MBOD_BODDESTINOCODIGO_"+sGXsfl_20_idx ;
      edtMbod_BodDestinoDescripcion_Internalname = sPrefix+"MBOD_BODDESTINODESCRIPCION_"+sGXsfl_20_idx ;
      cmbMbod_Estado.setInternalname( sPrefix+"MBOD_ESTADO_"+sGXsfl_20_idx );
      edtMbod_FechaCrea_Internalname = sPrefix+"MBOD_FECHACREA_"+sGXsfl_20_idx ;
      edtMbod_UsuarioCrea_Internalname = sPrefix+"MBOD_USUARIOCREA_"+sGXsfl_20_idx ;
      edtMbod_FechaModifica_Internalname = sPrefix+"MBOD_FECHAMODIFICA_"+sGXsfl_20_idx ;
      edtMbod_UsuarioModifica_Internalname = sPrefix+"MBOD_USUARIOMODIFICA_"+sGXsfl_20_idx ;
      edtavUpdate_Internalname = sPrefix+"vUPDATE_"+sGXsfl_20_idx ;
      edtavDelete_Internalname = sPrefix+"vDELETE_"+sGXsfl_20_idx ;
   }

   public void subsflControlProps_fel_202( )
   {
      edtMbod_Id_Internalname = sPrefix+"MBOD_ID_"+sGXsfl_20_fel_idx ;
      edtMbod_TipoMovCodigo_Internalname = sPrefix+"MBOD_TIPOMOVCODIGO_"+sGXsfl_20_fel_idx ;
      edtMbod_TipoMovDescrip_Internalname = sPrefix+"MBOD_TIPOMOVDESCRIP_"+sGXsfl_20_fel_idx ;
      edtMbod_TipoElementoCod_Internalname = sPrefix+"MBOD_TIPOELEMENTOCOD_"+sGXsfl_20_fel_idx ;
      edtMbod_TipoElementoDesc_Internalname = sPrefix+"MBOD_TIPOELEMENTODESC_"+sGXsfl_20_fel_idx ;
      edtMbod_RegionId_Internalname = sPrefix+"MBOD_REGIONID_"+sGXsfl_20_fel_idx ;
      edtMbod_RegionCodigo_Internalname = sPrefix+"MBOD_REGIONCODIGO_"+sGXsfl_20_fel_idx ;
      edtMbod_RegionDescripcion_Internalname = sPrefix+"MBOD_REGIONDESCRIPCION_"+sGXsfl_20_fel_idx ;
      edtMbod_CentCostoId_Internalname = sPrefix+"MBOD_CENTCOSTOID_"+sGXsfl_20_fel_idx ;
      edtMbod_CentCostoCodigo_Internalname = sPrefix+"MBOD_CENTCOSTOCODIGO_"+sGXsfl_20_fel_idx ;
      edtMbod_CentroCostoDescrip_Internalname = sPrefix+"MBOD_CENTROCOSTODESCRIP_"+sGXsfl_20_fel_idx ;
      cmbMbod_AlmModOrigen.setInternalname( sPrefix+"MBOD_ALMMODORIGEN_"+sGXsfl_20_fel_idx );
      edtMbod_AlmOrigenCodigo_Internalname = sPrefix+"MBOD_ALMORIGENCODIGO_"+sGXsfl_20_fel_idx ;
      cmbMbod_AlmModDestino.setInternalname( sPrefix+"MBOD_ALMMODDESTINO_"+sGXsfl_20_fel_idx );
      edtMbod_AlmDestinoCodigo_Internalname = sPrefix+"MBOD_ALMDESTINOCODIGO_"+sGXsfl_20_fel_idx ;
      edtMbod_BodDestinoCodigo_Internalname = sPrefix+"MBOD_BODDESTINOCODIGO_"+sGXsfl_20_fel_idx ;
      edtMbod_BodDestinoDescripcion_Internalname = sPrefix+"MBOD_BODDESTINODESCRIPCION_"+sGXsfl_20_fel_idx ;
      cmbMbod_Estado.setInternalname( sPrefix+"MBOD_ESTADO_"+sGXsfl_20_fel_idx );
      edtMbod_FechaCrea_Internalname = sPrefix+"MBOD_FECHACREA_"+sGXsfl_20_fel_idx ;
      edtMbod_UsuarioCrea_Internalname = sPrefix+"MBOD_USUARIOCREA_"+sGXsfl_20_fel_idx ;
      edtMbod_FechaModifica_Internalname = sPrefix+"MBOD_FECHAMODIFICA_"+sGXsfl_20_fel_idx ;
      edtMbod_UsuarioModifica_Internalname = sPrefix+"MBOD_USUARIOMODIFICA_"+sGXsfl_20_fel_idx ;
      edtavUpdate_Internalname = sPrefix+"vUPDATE_"+sGXsfl_20_fel_idx ;
      edtavDelete_Internalname = sPrefix+"vDELETE_"+sGXsfl_20_fel_idx ;
   }

   public void sendrow_202( )
   {
      subsflControlProps_202( ) ;
      wb3Y0( ) ;
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
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_Id_Internalname,GXutil.ltrim( localUtil.ntoc( A60Mbod_Id, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A60Mbod_Id), "ZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMbod_Id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_TipoMovCodigo_Internalname,A61Mbod_TipoMovCodigo,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'",edtMbod_TipoMovCodigo_Link,"","","",edtMbod_TipoMovCodigo_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_TipoMovDescrip_Internalname,A428Mbod_TipoMovDescrip,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMbod_TipoMovDescrip_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_TipoElementoCod_Internalname,GXutil.ltrim( localUtil.ntoc( A431Mbod_TipoElementoCod, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A431Mbod_TipoElementoCod), "ZZZZZZZZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMbod_TipoElementoCod_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_TipoElementoDesc_Internalname,A432Mbod_TipoElementoDesc,GXutil.rtrim( localUtil.format( A432Mbod_TipoElementoDesc, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMbod_TipoElementoDesc_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_RegionId_Internalname,GXutil.ltrim( localUtil.ntoc( A62Mbod_RegionId, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A62Mbod_RegionId), "ZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMbod_RegionId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_RegionCodigo_Internalname,GXutil.ltrim( localUtil.ntoc( A426Mbod_RegionCodigo, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A426Mbod_RegionCodigo), "ZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMbod_RegionCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_RegionDescripcion_Internalname,A427Mbod_RegionDescripcion,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMbod_RegionDescripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_CentCostoId_Internalname,GXutil.ltrim( localUtil.ntoc( A63Mbod_CentCostoId, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A63Mbod_CentCostoId), "ZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMbod_CentCostoId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_CentCostoCodigo_Internalname,A429Mbod_CentCostoCodigo,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMbod_CentCostoCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(16),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_CentroCostoDescrip_Internalname,A430Mbod_CentroCostoDescrip,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMbod_CentroCostoDescrip_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_20_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "MBOD_ALMMODORIGEN_" + sGXsfl_20_idx ;
            cmbMbod_AlmModOrigen.setName( GXCCtl );
            cmbMbod_AlmModOrigen.setWebtags( "" );
            cmbMbod_AlmModOrigen.addItem("ALMA", "ALMACEN", (short)(0));
            cmbMbod_AlmModOrigen.addItem("INVE", "INVENTARIO", (short)(0));
            cmbMbod_AlmModOrigen.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
            if ( cmbMbod_AlmModOrigen.getItemCount() > 0 )
            {
               A364Mbod_AlmModOrigen = cmbMbod_AlmModOrigen.getValidValue(A364Mbod_AlmModOrigen) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbMbod_AlmModOrigen,cmbMbod_AlmModOrigen.getInternalname(),GXutil.rtrim( A364Mbod_AlmModOrigen),new Integer(1),cmbMbod_AlmModOrigen.getJsonclick(),new Integer(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbMbod_AlmModOrigen.setValue( GXutil.rtrim( A364Mbod_AlmModOrigen) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbMbod_AlmModOrigen.getInternalname(), "Values", cmbMbod_AlmModOrigen.ToJavascriptSource(), !bGXsfl_20_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_AlmOrigenCodigo_Internalname,A342Mbod_AlmOrigenCodigo,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMbod_AlmOrigenCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_20_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "MBOD_ALMMODDESTINO_" + sGXsfl_20_idx ;
            cmbMbod_AlmModDestino.setName( GXCCtl );
            cmbMbod_AlmModDestino.setWebtags( "" );
            cmbMbod_AlmModDestino.addItem("ALMA", "ALMACEN", (short)(0));
            cmbMbod_AlmModDestino.addItem("INVE", "INVENTARIO", (short)(0));
            cmbMbod_AlmModDestino.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
            if ( cmbMbod_AlmModDestino.getItemCount() > 0 )
            {
               A368Mbod_AlmModDestino = cmbMbod_AlmModDestino.getValidValue(A368Mbod_AlmModDestino) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbMbod_AlmModDestino,cmbMbod_AlmModDestino.getInternalname(),GXutil.rtrim( A368Mbod_AlmModDestino),new Integer(1),cmbMbod_AlmModDestino.getJsonclick(),new Integer(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbMbod_AlmModDestino.setValue( GXutil.rtrim( A368Mbod_AlmModDestino) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbMbod_AlmModDestino.getInternalname(), "Values", cmbMbod_AlmModDestino.ToJavascriptSource(), !bGXsfl_20_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_AlmDestinoCodigo_Internalname,A345Mbod_AlmDestinoCodigo,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMbod_AlmDestinoCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_BodDestinoCodigo_Internalname,A65Mbod_BodDestinoCodigo,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMbod_BodDestinoCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_BodDestinoDescripcion_Internalname,A347Mbod_BodDestinoDescripcion,GXutil.rtrim( localUtil.format( A347Mbod_BodDestinoDescripcion, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMbod_BodDestinoDescripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_20_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "MBOD_ESTADO_" + sGXsfl_20_idx ;
            cmbMbod_Estado.setName( GXCCtl );
            cmbMbod_Estado.setWebtags( "" );
            cmbMbod_Estado.addItem("A", "Activo", (short)(0));
            cmbMbod_Estado.addItem("I", "Inactivo", (short)(0));
            if ( cmbMbod_Estado.getItemCount() > 0 )
            {
               A434Mbod_Estado = cmbMbod_Estado.getValidValue(A434Mbod_Estado) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbMbod_Estado,cmbMbod_Estado.getInternalname(),GXutil.rtrim( A434Mbod_Estado),new Integer(1),cmbMbod_Estado.getJsonclick(),new Integer(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbMbod_Estado.setValue( GXutil.rtrim( A434Mbod_Estado) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbMbod_Estado.getInternalname(), "Values", cmbMbod_Estado.ToJavascriptSource(), !bGXsfl_20_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_FechaCrea_Internalname,localUtil.ttoc( A433Mbod_FechaCrea, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A433Mbod_FechaCrea, "99/99/99 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMbod_FechaCrea_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_UsuarioCrea_Internalname,A359Mbod_UsuarioCrea,GXutil.rtrim( localUtil.format( A359Mbod_UsuarioCrea, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMbod_UsuarioCrea_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_FechaModifica_Internalname,localUtil.ttoc( A362Mbod_FechaModifica, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A362Mbod_FechaModifica, "99/99/99 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMbod_FechaModifica_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_UsuarioModifica_Internalname,A361Mbod_UsuarioModifica,GXutil.rtrim( localUtil.format( A361Mbod_UsuarioModifica, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMbod_UsuarioModifica_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
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
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_ID"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A60Mbod_Id), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_REGIONID"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A62Mbod_RegionId), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_CENTCOSTOID"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A63Mbod_CentCostoId), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_ALMMODORIGEN"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A364Mbod_AlmModOrigen, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_ALMORIGENCODIGO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A342Mbod_AlmOrigenCodigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_ALMMODDESTINO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A368Mbod_AlmModDestino, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_ALMDESTINOCODIGO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A345Mbod_AlmDestinoCodigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_BODDESTINOCODIGO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A65Mbod_BodDestinoCodigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_ESTADO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A434Mbod_Estado, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_FECHACREA"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( A433Mbod_FechaCrea, "99/99/99 99:99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_USUARIOCREA"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A359Mbod_UsuarioCrea, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_FECHAMODIFICA"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( A362Mbod_FechaModifica, "99/99/99 99:99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_USUARIOMODIFICA"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A361Mbod_UsuarioModifica, "@!"))));
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
      edtMbod_Id_Internalname = sPrefix+"MBOD_ID" ;
      edtMbod_TipoMovCodigo_Internalname = sPrefix+"MBOD_TIPOMOVCODIGO" ;
      edtMbod_TipoMovDescrip_Internalname = sPrefix+"MBOD_TIPOMOVDESCRIP" ;
      edtMbod_TipoElementoCod_Internalname = sPrefix+"MBOD_TIPOELEMENTOCOD" ;
      edtMbod_TipoElementoDesc_Internalname = sPrefix+"MBOD_TIPOELEMENTODESC" ;
      edtMbod_RegionId_Internalname = sPrefix+"MBOD_REGIONID" ;
      edtMbod_RegionCodigo_Internalname = sPrefix+"MBOD_REGIONCODIGO" ;
      edtMbod_RegionDescripcion_Internalname = sPrefix+"MBOD_REGIONDESCRIPCION" ;
      edtMbod_CentCostoId_Internalname = sPrefix+"MBOD_CENTCOSTOID" ;
      edtMbod_CentCostoCodigo_Internalname = sPrefix+"MBOD_CENTCOSTOCODIGO" ;
      edtMbod_CentroCostoDescrip_Internalname = sPrefix+"MBOD_CENTROCOSTODESCRIP" ;
      cmbMbod_AlmModOrigen.setInternalname( sPrefix+"MBOD_ALMMODORIGEN" );
      edtMbod_AlmOrigenCodigo_Internalname = sPrefix+"MBOD_ALMORIGENCODIGO" ;
      cmbMbod_AlmModDestino.setInternalname( sPrefix+"MBOD_ALMMODDESTINO" );
      edtMbod_AlmDestinoCodigo_Internalname = sPrefix+"MBOD_ALMDESTINOCODIGO" ;
      edtMbod_BodDestinoCodigo_Internalname = sPrefix+"MBOD_BODDESTINOCODIGO" ;
      edtMbod_BodDestinoDescripcion_Internalname = sPrefix+"MBOD_BODDESTINODESCRIPCION" ;
      cmbMbod_Estado.setInternalname( sPrefix+"MBOD_ESTADO" );
      edtMbod_FechaCrea_Internalname = sPrefix+"MBOD_FECHACREA" ;
      edtMbod_UsuarioCrea_Internalname = sPrefix+"MBOD_USUARIOCREA" ;
      edtMbod_FechaModifica_Internalname = sPrefix+"MBOD_FECHAMODIFICA" ;
      edtMbod_UsuarioModifica_Internalname = sPrefix+"MBOD_USUARIOMODIFICA" ;
      edtavUpdate_Internalname = sPrefix+"vUPDATE" ;
      edtavDelete_Internalname = sPrefix+"vDELETE" ;
      divGridtable_Internalname = sPrefix+"GRIDTABLE" ;
      divGridcell_Internalname = sPrefix+"GRIDCELL" ;
      edtMbod_BodOrigenCodigo_Internalname = sPrefix+"MBOD_BODORIGENCODIGO" ;
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
      edtMbod_UsuarioModifica_Jsonclick = "" ;
      edtMbod_FechaModifica_Jsonclick = "" ;
      edtMbod_UsuarioCrea_Jsonclick = "" ;
      edtMbod_FechaCrea_Jsonclick = "" ;
      cmbMbod_Estado.setJsonclick( "" );
      edtMbod_BodDestinoDescripcion_Jsonclick = "" ;
      edtMbod_BodDestinoCodigo_Jsonclick = "" ;
      edtMbod_AlmDestinoCodigo_Jsonclick = "" ;
      cmbMbod_AlmModDestino.setJsonclick( "" );
      edtMbod_AlmOrigenCodigo_Jsonclick = "" ;
      cmbMbod_AlmModOrigen.setJsonclick( "" );
      edtMbod_CentroCostoDescrip_Jsonclick = "" ;
      edtMbod_CentCostoCodigo_Jsonclick = "" ;
      edtMbod_CentCostoId_Jsonclick = "" ;
      edtMbod_RegionDescripcion_Jsonclick = "" ;
      edtMbod_RegionCodigo_Jsonclick = "" ;
      edtMbod_RegionId_Jsonclick = "" ;
      edtMbod_TipoElementoDesc_Jsonclick = "" ;
      edtMbod_TipoElementoCod_Jsonclick = "" ;
      edtMbod_TipoMovDescrip_Jsonclick = "" ;
      edtMbod_TipoMovCodigo_Jsonclick = "" ;
      edtMbod_Id_Jsonclick = "" ;
      edtMbod_BodOrigenCodigo_Jsonclick = "" ;
      edtMbod_BodOrigenCodigo_Enabled = 0 ;
      edtMbod_BodOrigenCodigo_Visible = 1 ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      edtavDelete_Link = "" ;
      edtavUpdate_Link = "" ;
      edtMbod_TipoMovCodigo_Link = "" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Mbod_BodOrigenCodigo',fld:'vMBOD_BODORIGENCODIGO',pic:'',nv:''},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A60Mbod_Id',fld:'MBOD_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e133Y2',iparms:[{av:'A60Mbod_Id',fld:'MBOD_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[{av:'edtavUpdate_Link',ctrl:'vUPDATE',prop:'Link'},{av:'edtavDelete_Link',ctrl:'vDELETE',prop:'Link'},{av:'edtMbod_TipoMovCodigo_Link',ctrl:'MBOD_TIPOMOVCODIGO',prop:'Link'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e113Y2',iparms:[{av:'A60Mbod_Id',fld:'MBOD_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Mbod_BodOrigenCodigo',fld:'vMBOD_BODORIGENCODIGO',pic:'',nv:''},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A60Mbod_Id',fld:'MBOD_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Mbod_BodOrigenCodigo',fld:'vMBOD_BODORIGENCODIGO',pic:'',nv:''},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A60Mbod_Id',fld:'MBOD_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Mbod_BodOrigenCodigo',fld:'vMBOD_BODORIGENCODIGO',pic:'',nv:''},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A60Mbod_Id',fld:'MBOD_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Mbod_BodOrigenCodigo',fld:'vMBOD_BODORIGENCODIGO',pic:'',nv:''},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A60Mbod_Id',fld:'MBOD_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
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
      pr_default.close(1);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      wcpOAV7Mbod_BodOrigenCodigo = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV7Mbod_BodOrigenCodigo = "" ;
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
      A61Mbod_TipoMovCodigo = "" ;
      A428Mbod_TipoMovDescrip = "" ;
      A432Mbod_TipoElementoDesc = "" ;
      A427Mbod_RegionDescripcion = "" ;
      A429Mbod_CentCostoCodigo = "" ;
      A430Mbod_CentroCostoDescrip = "" ;
      A364Mbod_AlmModOrigen = "" ;
      A342Mbod_AlmOrigenCodigo = "" ;
      A368Mbod_AlmModDestino = "" ;
      A345Mbod_AlmDestinoCodigo = "" ;
      A65Mbod_BodDestinoCodigo = "" ;
      A347Mbod_BodDestinoDescripcion = "" ;
      A434Mbod_Estado = "" ;
      A433Mbod_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A359Mbod_UsuarioCrea = "" ;
      A362Mbod_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      A361Mbod_UsuarioModifica = "" ;
      A64Mbod_BodOrigenCodigo = "" ;
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
      H003Y2_A64Mbod_BodOrigenCodigo = new String[] {""} ;
      H003Y2_A361Mbod_UsuarioModifica = new String[] {""} ;
      H003Y2_A362Mbod_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H003Y2_A359Mbod_UsuarioCrea = new String[] {""} ;
      H003Y2_A433Mbod_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      H003Y2_A434Mbod_Estado = new String[] {""} ;
      H003Y2_A65Mbod_BodDestinoCodigo = new String[] {""} ;
      H003Y2_A345Mbod_AlmDestinoCodigo = new String[] {""} ;
      H003Y2_A368Mbod_AlmModDestino = new String[] {""} ;
      H003Y2_A342Mbod_AlmOrigenCodigo = new String[] {""} ;
      H003Y2_A364Mbod_AlmModOrigen = new String[] {""} ;
      H003Y2_A430Mbod_CentroCostoDescrip = new String[] {""} ;
      H003Y2_n430Mbod_CentroCostoDescrip = new boolean[] {false} ;
      H003Y2_A429Mbod_CentCostoCodigo = new String[] {""} ;
      H003Y2_n429Mbod_CentCostoCodigo = new boolean[] {false} ;
      H003Y2_A63Mbod_CentCostoId = new long[1] ;
      H003Y2_A427Mbod_RegionDescripcion = new String[] {""} ;
      H003Y2_n427Mbod_RegionDescripcion = new boolean[] {false} ;
      H003Y2_A426Mbod_RegionCodigo = new short[1] ;
      H003Y2_n426Mbod_RegionCodigo = new boolean[] {false} ;
      H003Y2_A62Mbod_RegionId = new long[1] ;
      H003Y2_A432Mbod_TipoElementoDesc = new String[] {""} ;
      H003Y2_n432Mbod_TipoElementoDesc = new boolean[] {false} ;
      H003Y2_A431Mbod_TipoElementoCod = new long[1] ;
      H003Y2_n431Mbod_TipoElementoCod = new boolean[] {false} ;
      H003Y2_A428Mbod_TipoMovDescrip = new String[] {""} ;
      H003Y2_n428Mbod_TipoMovDescrip = new boolean[] {false} ;
      H003Y2_A61Mbod_TipoMovCodigo = new String[] {""} ;
      H003Y2_A60Mbod_Id = new long[1] ;
      H003Y3_A31Bode_Codigo = new String[] {""} ;
      H003Y4_A251Bode_Descripcion = new String[] {""} ;
      A251Bode_Descripcion = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV10TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV9HTTPRequest = httpContext.getHttpRequest();
      AV11TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV8Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV7Mbod_BodOrigenCodigo = "" ;
      ROClassString = "" ;
      sImgUrl = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_bodegaalm_restriccioneswc__default(),
         new Object[] {
             new Object[] {
            H003Y2_A64Mbod_BodOrigenCodigo, H003Y2_A361Mbod_UsuarioModifica, H003Y2_A362Mbod_FechaModifica, H003Y2_A359Mbod_UsuarioCrea, H003Y2_A433Mbod_FechaCrea, H003Y2_A434Mbod_Estado, H003Y2_A65Mbod_BodDestinoCodigo, H003Y2_A345Mbod_AlmDestinoCodigo, H003Y2_A368Mbod_AlmModDestino, H003Y2_A342Mbod_AlmOrigenCodigo,
            H003Y2_A364Mbod_AlmModOrigen, H003Y2_A430Mbod_CentroCostoDescrip, H003Y2_n430Mbod_CentroCostoDescrip, H003Y2_A429Mbod_CentCostoCodigo, H003Y2_n429Mbod_CentCostoCodigo, H003Y2_A63Mbod_CentCostoId, H003Y2_A427Mbod_RegionDescripcion, H003Y2_n427Mbod_RegionDescripcion, H003Y2_A426Mbod_RegionCodigo, H003Y2_n426Mbod_RegionCodigo,
            H003Y2_A62Mbod_RegionId, H003Y2_A432Mbod_TipoElementoDesc, H003Y2_n432Mbod_TipoElementoDesc, H003Y2_A431Mbod_TipoElementoCod, H003Y2_n431Mbod_TipoElementoCod, H003Y2_A428Mbod_TipoMovDescrip, H003Y2_n428Mbod_TipoMovDescrip, H003Y2_A61Mbod_TipoMovCodigo, H003Y2_A60Mbod_Id
            }
            , new Object[] {
            H003Y3_A31Bode_Codigo
            }
            , new Object[] {
            H003Y4_A251Bode_Descripcion
            }
         }
      );
      AV17Pgmname = "ALM_BODEGAALM_RESTRICCIONESWC" ;
      /* GeneXus formulas. */
      AV17Pgmname = "ALM_BODEGAALM_RESTRICCIONESWC" ;
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
   private short A426Mbod_RegionCodigo ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int edtMbod_BodOrigenCodigo_Visible ;
   private int edtMbod_BodOrigenCodigo_Enabled ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private long A60Mbod_Id ;
   private long GRID_nFirstRecordOnPage ;
   private long A431Mbod_TipoElementoCod ;
   private long A62Mbod_RegionId ;
   private long A63Mbod_CentCostoId ;
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
   private String edtMbod_TipoMovCodigo_Link ;
   private String A434Mbod_Estado ;
   private String edtavUpdate_Link ;
   private String edtavDelete_Link ;
   private String edtMbod_BodOrigenCodigo_Internalname ;
   private String edtMbod_BodOrigenCodigo_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtMbod_Id_Internalname ;
   private String edtMbod_TipoMovCodigo_Internalname ;
   private String edtMbod_TipoMovDescrip_Internalname ;
   private String edtMbod_TipoElementoCod_Internalname ;
   private String edtMbod_TipoElementoDesc_Internalname ;
   private String edtMbod_RegionId_Internalname ;
   private String edtMbod_RegionCodigo_Internalname ;
   private String edtMbod_RegionDescripcion_Internalname ;
   private String edtMbod_CentCostoId_Internalname ;
   private String edtMbod_CentCostoCodigo_Internalname ;
   private String edtMbod_CentroCostoDescrip_Internalname ;
   private String edtMbod_AlmOrigenCodigo_Internalname ;
   private String edtMbod_AlmDestinoCodigo_Internalname ;
   private String edtMbod_BodDestinoCodigo_Internalname ;
   private String edtMbod_BodDestinoDescripcion_Internalname ;
   private String edtMbod_FechaCrea_Internalname ;
   private String edtMbod_UsuarioCrea_Internalname ;
   private String edtMbod_FechaModifica_Internalname ;
   private String edtMbod_UsuarioModifica_Internalname ;
   private String GXCCtl ;
   private String AV17Pgmname ;
   private String scmdbuf ;
   private String sCtrlAV7Mbod_BodOrigenCodigo ;
   private String sGXsfl_20_fel_idx="0001" ;
   private String ROClassString ;
   private String edtMbod_Id_Jsonclick ;
   private String edtMbod_TipoMovCodigo_Jsonclick ;
   private String edtMbod_TipoMovDescrip_Jsonclick ;
   private String edtMbod_TipoElementoCod_Jsonclick ;
   private String edtMbod_TipoElementoDesc_Jsonclick ;
   private String edtMbod_RegionId_Jsonclick ;
   private String edtMbod_RegionCodigo_Jsonclick ;
   private String edtMbod_RegionDescripcion_Jsonclick ;
   private String edtMbod_CentCostoId_Jsonclick ;
   private String edtMbod_CentCostoCodigo_Jsonclick ;
   private String edtMbod_CentroCostoDescrip_Jsonclick ;
   private String edtMbod_AlmOrigenCodigo_Jsonclick ;
   private String edtMbod_AlmDestinoCodigo_Jsonclick ;
   private String edtMbod_BodDestinoCodigo_Jsonclick ;
   private String edtMbod_BodDestinoDescripcion_Jsonclick ;
   private String edtMbod_FechaCrea_Jsonclick ;
   private String edtMbod_UsuarioCrea_Jsonclick ;
   private String edtMbod_FechaModifica_Jsonclick ;
   private String edtMbod_UsuarioModifica_Jsonclick ;
   private String sImgUrl ;
   private java.util.Date A433Mbod_FechaCrea ;
   private java.util.Date A362Mbod_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean bGXsfl_20_Refreshing=false ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n428Mbod_TipoMovDescrip ;
   private boolean n431Mbod_TipoElementoCod ;
   private boolean n432Mbod_TipoElementoDesc ;
   private boolean n426Mbod_RegionCodigo ;
   private boolean n427Mbod_RegionDescripcion ;
   private boolean n429Mbod_CentCostoCodigo ;
   private boolean n430Mbod_CentroCostoDescrip ;
   private boolean returnInSub ;
   private boolean AV12Update_IsBlob ;
   private boolean AV13Delete_IsBlob ;
   private String wcpOAV7Mbod_BodOrigenCodigo ;
   private String AV7Mbod_BodOrigenCodigo ;
   private String A61Mbod_TipoMovCodigo ;
   private String A428Mbod_TipoMovDescrip ;
   private String A432Mbod_TipoElementoDesc ;
   private String A427Mbod_RegionDescripcion ;
   private String A429Mbod_CentCostoCodigo ;
   private String A430Mbod_CentroCostoDescrip ;
   private String A364Mbod_AlmModOrigen ;
   private String A342Mbod_AlmOrigenCodigo ;
   private String A368Mbod_AlmModDestino ;
   private String A345Mbod_AlmDestinoCodigo ;
   private String A65Mbod_BodDestinoCodigo ;
   private String A347Mbod_BodDestinoDescripcion ;
   private String A359Mbod_UsuarioCrea ;
   private String A361Mbod_UsuarioModifica ;
   private String A64Mbod_BodOrigenCodigo ;
   private String AV18Update_GXI ;
   private String AV19Delete_GXI ;
   private String A251Bode_Descripcion ;
   private String AV12Update ;
   private String AV13Delete ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV9HTTPRequest ;
   private HTMLChoice cmbMbod_AlmModOrigen ;
   private HTMLChoice cmbMbod_AlmModDestino ;
   private HTMLChoice cmbMbod_Estado ;
   private IDataStoreProvider pr_default ;
   private String[] H003Y2_A64Mbod_BodOrigenCodigo ;
   private String[] H003Y2_A361Mbod_UsuarioModifica ;
   private java.util.Date[] H003Y2_A362Mbod_FechaModifica ;
   private String[] H003Y2_A359Mbod_UsuarioCrea ;
   private java.util.Date[] H003Y2_A433Mbod_FechaCrea ;
   private String[] H003Y2_A434Mbod_Estado ;
   private String[] H003Y2_A65Mbod_BodDestinoCodigo ;
   private String[] H003Y2_A345Mbod_AlmDestinoCodigo ;
   private String[] H003Y2_A368Mbod_AlmModDestino ;
   private String[] H003Y2_A342Mbod_AlmOrigenCodigo ;
   private String[] H003Y2_A364Mbod_AlmModOrigen ;
   private String[] H003Y2_A430Mbod_CentroCostoDescrip ;
   private boolean[] H003Y2_n430Mbod_CentroCostoDescrip ;
   private String[] H003Y2_A429Mbod_CentCostoCodigo ;
   private boolean[] H003Y2_n429Mbod_CentCostoCodigo ;
   private long[] H003Y2_A63Mbod_CentCostoId ;
   private String[] H003Y2_A427Mbod_RegionDescripcion ;
   private boolean[] H003Y2_n427Mbod_RegionDescripcion ;
   private short[] H003Y2_A426Mbod_RegionCodigo ;
   private boolean[] H003Y2_n426Mbod_RegionCodigo ;
   private long[] H003Y2_A62Mbod_RegionId ;
   private String[] H003Y2_A432Mbod_TipoElementoDesc ;
   private boolean[] H003Y2_n432Mbod_TipoElementoDesc ;
   private long[] H003Y2_A431Mbod_TipoElementoCod ;
   private boolean[] H003Y2_n431Mbod_TipoElementoCod ;
   private String[] H003Y2_A428Mbod_TipoMovDescrip ;
   private boolean[] H003Y2_n428Mbod_TipoMovDescrip ;
   private String[] H003Y2_A61Mbod_TipoMovCodigo ;
   private long[] H003Y2_A60Mbod_Id ;
   private String[] H003Y3_A31Bode_Codigo ;
   private String[] H003Y4_A251Bode_Descripcion ;
   private com.genexus.webpanels.WebSession AV8Session ;
   private com.orions2.SdtTransactionContext AV10TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV11TrnContextAtt ;
}

final  class alm_bodegaalm_restriccioneswc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H003Y2", "SELECT T1.Mbod_BodOrigenCodigo, T1.Mbod_UsuarioModifica, T1.Mbod_FechaModifica, T1.Mbod_UsuarioCrea, T1.Mbod_FechaCrea, T1.Mbod_Estado, T1.Mbod_BodDestinoCodigo, T1.Mbod_AlmDestinoCodigo, T1.Mbod_AlmModDestino, T1.Mbod_AlmOrigenCodigo, T1.Mbod_AlmModOrigen, T2.Cent_Descripcion AS Mbod_CentroCostoDescrip, T2.Cent_Codigo AS Mbod_CentCostoCodigo, T1.Mbod_CentCostoId AS Mbod_CentCostoId, T3.Regi_Descripcion AS Mbod_RegionDescripcion, T3.Regi_Cod AS Mbod_RegionCodigo, T1.Mbod_RegionId AS Mbod_RegionId, T5.Tipo_Descripcion AS Mbod_TipoElementoDesc, T4.Tipo_Codigo AS Mbod_TipoElementoCod, T4.Tpmo_Descripcion AS Mbod_TipoMovDescrip, T1.Mbod_TipoMovCodigo AS Mbod_TipoMovCodigo, T1.Mbod_Id FROM ((((ALM_RESTRICCIONES T1 INNER JOIN GEN_CENTROCOSTO T2 ON T2.Cent_Id = T1.Mbod_CentCostoId) INNER JOIN GEN_REGIONAL T3 ON T3.Regi_Id = T1.Mbod_RegionId) INNER JOIN ALM_TIPO_MOVIMIENTO T4 ON T4.Tpmo_Codigo = T1.Mbod_TipoMovCodigo) LEFT JOIN ALM_TIPO_ELEMENTO T5 ON T5.Tipo_Codigo = T4.Tipo_Codigo) WHERE T1.Mbod_BodOrigenCodigo = ? ORDER BY T1.Mbod_BodOrigenCodigo  OFFSET ? ROWS FETCH NEXT (CASE WHEN ? > 0 THEN ? ELSE 1e9 END) ROWS ONLY",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H003Y3", "SELECT Bode_Codigo FROM ALM_BODEGA WHERE Bode_Codigo = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("H003Y4", "SELECT Bode_Descripcion FROM ALM_BODEGA WHERE Bode_Codigo = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[5])[0] = rslt.getString(6, 1) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((long[]) buf[15])[0] = rslt.getLong(14) ;
               ((String[]) buf[16])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(16) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((long[]) buf[20])[0] = rslt.getLong(17) ;
               ((String[]) buf[21])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((long[]) buf[23])[0] = rslt.getLong(19) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(21) ;
               ((long[]) buf[28])[0] = rslt.getLong(22) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
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
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 3);
               return;
      }
   }

}

