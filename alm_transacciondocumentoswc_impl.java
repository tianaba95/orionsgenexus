/*
               File: alm_transacciondocumentoswc_impl
        Description: ALM_TRANSACCIONDocumentos WC
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:34.60
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

public final  class alm_transacciondocumentoswc_impl extends GXWebComponent
{
   public alm_transacciondocumentoswc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_transacciondocumentoswc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_transacciondocumentoswc_impl.class ));
   }

   public alm_transacciondocumentoswc_impl( int remoteHandle ,
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
               AV7Tran_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Tran_Id", GXutil.ltrim( GXutil.str( AV7Tran_Id, 11, 0)));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,new Long(AV7Tran_Id)});
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
               nRC_GXsfl_12 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               nGXsfl_12_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               sGXsfl_12_idx = httpContext.GetNextPar( ) ;
               sPrefix = httpContext.GetNextPar( ) ;
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
               AV7Tran_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               sPrefix = httpContext.GetNextPar( ) ;
               init_default_properties( ) ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxgrgrid_refresh( subGrid_Rows, AV7Tran_Id, sPrefix) ;
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
         pa9D2( ) ;
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
         httpContext.writeValue( "ALM_TRANSACCIONDocumentos WC") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414103464");
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_transacciondocumentoswc") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV7Tran_Id,11,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_12", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_12, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7Tran_Id", GXutil.ltrim( localUtil.ntoc( wcpOAV7Tran_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTRAN_ID", GXutil.ltrim( localUtil.ntoc( AV7Tran_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm9D2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("alm_transacciondocumentoswc.js", "?201861414103465");
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
      return "ALM_TRANSACCIONDocumentosWC" ;
   }

   public String getPgmdesc( )
   {
      return "ALM_TRANSACCIONDocumentos WC" ;
   }

   public void wb9D0( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.alm_transacciondocumentoswc");
         }
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "GridTabMainTable", "left", "top", "", "", "div");
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
            httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"12\">") ;
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
            httpContext.writeValue( "Documento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Documento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Documento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Image"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "soporte") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Archivo") ;
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
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A827Tran_Nro_Documento, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A828Tran_Descrip_Documento);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A829Tran_Prefijo_Documento);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A830Tran_Archivo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A831Tran_Ruta_Archivo);
            GridContainer.AddColumnProperties(GridColumn);
            GridContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid_Allowselection, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 12 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_12 = (short)(nGXsfl_12_idx-1) ;
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_Id_Internalname, "Identificador", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ",", "")), ((edtTran_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A46Tran_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A46Tran_Id), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_Id_Jsonclick, 0, "Attribute", "", "", "", edtTran_Id_Visible, edtTran_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_TRANSACCIONDocumentosWC.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start9D2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "ALM_TRANSACCIONDocumentos WC", (short)(0)) ;
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
            strup9D0( ) ;
         }
      }
   }

   public void ws9D2( )
   {
      start9D2( ) ;
      evt9D2( ) ;
   }

   public void evt9D2( )
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
                              strup9D0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup9D0( ) ;
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
                              strup9D0( ) ;
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
                              strup9D0( ) ;
                           }
                           nGXsfl_12_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_12_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_12_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_122( ) ;
                           A827Tran_Nro_Documento = (short)(localUtil.ctol( httpContext.cgiGet( edtTran_Nro_Documento_Internalname), ",", ".")) ;
                           A828Tran_Descrip_Documento = httpContext.cgiGet( edtTran_Descrip_Documento_Internalname) ;
                           n828Tran_Descrip_Documento = false ;
                           A829Tran_Prefijo_Documento = httpContext.cgiGet( edtTran_Prefijo_Documento_Internalname) ;
                           n829Tran_Prefijo_Documento = false ;
                           A830Tran_Archivo = httpContext.cgiGet( edtTran_Archivo_Internalname) ;
                           n830Tran_Archivo = false ;
                           httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTran_Archivo_Internalname, "URL", httpContext.getResourceRelative(A830Tran_Archivo), !bGXsfl_12_Refreshing);
                           A831Tran_Ruta_Archivo = httpContext.cgiGet( edtTran_Ruta_Archivo_Internalname) ;
                           n831Tran_Ruta_Archivo = false ;
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
                                       e119D2 ();
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
                                       e129D2 ();
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
                                    strup9D0( ) ;
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

   public void we9D2( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm9D2( ) ;
         }
      }
   }

   public void pa9D2( )
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
      subsflControlProps_122( ) ;
      while ( nGXsfl_12_idx <= nRC_GXsfl_12 )
      {
         sendrow_122( ) ;
         nGXsfl_12_idx = (short)(((subGrid_Islastpage==1)&&(nGXsfl_12_idx+1>subgrid_recordsperpage( )) ? 1 : nGXsfl_12_idx+1)) ;
         sGXsfl_12_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_12_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_122( ) ;
      }
      httpContext.GX_webresponse.addString(GridContainer.ToJavascriptSource());
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 long AV7Tran_Id ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid_Rows = subGrid_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID_nCurrentRecord = 0 ;
      rf9D2( ) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_NRO_DOCUMENTO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A827Tran_Nro_Documento), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_NRO_DOCUMENTO", GXutil.ltrim( localUtil.ntoc( A827Tran_Nro_Documento, (byte)(4), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_RUTA_ARCHIVO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A831Tran_Ruta_Archivo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_RUTA_ARCHIVO", A831Tran_Ruta_Archivo);
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf9D2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV15Pgmname = "ALM_TRANSACCIONDocumentosWC" ;
      Gx_err = (short)(0) ;
   }

   public void rf9D2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(12) ;
      nGXsfl_12_idx = (short)(1) ;
      sGXsfl_12_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_12_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_122( ) ;
      bGXsfl_12_Refreshing = true ;
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
         subsflControlProps_122( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 0 : GRID_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((subGrid_Rows==0) ? 10000 : subgrid_recordsperpage( )+1) ;
         /* Using cursor H009D2 */
         pr_default.execute(0, new Object[] {new Long(AV7Tran_Id), new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_12_idx = (short)(1) ;
         sGXsfl_12_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_12_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_122( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_recordsperpage( ) ) ) ) )
         {
            A46Tran_Id = H009D2_A46Tran_Id[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
            A831Tran_Ruta_Archivo = H009D2_A831Tran_Ruta_Archivo[0] ;
            n831Tran_Ruta_Archivo = H009D2_n831Tran_Ruta_Archivo[0] ;
            A830Tran_Archivo = H009D2_A830Tran_Archivo[0] ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTran_Archivo_Internalname, "URL", httpContext.getResourceRelative(A830Tran_Archivo), !bGXsfl_12_Refreshing);
            n830Tran_Archivo = H009D2_n830Tran_Archivo[0] ;
            A829Tran_Prefijo_Documento = H009D2_A829Tran_Prefijo_Documento[0] ;
            n829Tran_Prefijo_Documento = H009D2_n829Tran_Prefijo_Documento[0] ;
            A828Tran_Descrip_Documento = H009D2_A828Tran_Descrip_Documento[0] ;
            n828Tran_Descrip_Documento = H009D2_n828Tran_Descrip_Documento[0] ;
            A827Tran_Nro_Documento = H009D2_A827Tran_Nro_Documento[0] ;
            A829Tran_Prefijo_Documento = H009D2_A829Tran_Prefijo_Documento[0] ;
            n829Tran_Prefijo_Documento = H009D2_n829Tran_Prefijo_Documento[0] ;
            A828Tran_Descrip_Documento = H009D2_A828Tran_Descrip_Documento[0] ;
            n828Tran_Descrip_Documento = H009D2_n828Tran_Descrip_Documento[0] ;
            e129D2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(12) ;
         wb9D0( ) ;
      }
      bGXsfl_12_Refreshing = true ;
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
      /* Using cursor H009D3 */
      pr_default.execute(1, new Object[] {new Long(AV7Tran_Id)});
      GRID_nRecordCount = H009D3_AGRID_nRecordCount[0] ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Tran_Id, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Tran_Id, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Tran_Id, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Tran_Id, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Tran_Id, sPrefix) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup9D0( )
   {
      /* Before Start, stand alone formulas. */
      AV15Pgmname = "ALM_TRANSACCIONDocumentosWC" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e119D2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A46Tran_Id = localUtil.ctol( httpContext.cgiGet( edtTran_Id_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
         /* Read saved values. */
         nRC_GXsfl_12 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_12"), ",", ".")) ;
         wcpOAV7Tran_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7Tran_Id"), ",", ".") ;
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
      e119D2 ();
      if (returnInSub) return;
   }

   public void e119D2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV15Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV15Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      subGrid_Rows = 10 ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      edtTran_Id_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTran_Id_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTran_Id_Visible, 5, 0)), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
   }

   private void e129D2( )
   {
      /* Grid_Load Routine */
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(12) ;
      }
      sendrow_122( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_12_Refreshing )
      {
         httpContext.doAjaxLoad(12, GridRow);
      }
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV10TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV15Pgmname );
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerondelete( true );
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV9HTTPRequest.getScriptName()+"?"+AV9HTTPRequest.getQuerystring() );
      AV10TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_TRANSACCION" );
      AV11TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV11TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Tran_Id" );
      AV11TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV7Tran_Id, 11, 0) );
      AV10TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV11TrnContextAtt, 0);
      AV8Session.setValue("TrnContext", AV10TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      AV7Tran_Id = ((Number) GXutil.testNumericType( getParm(obj,0,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Tran_Id", GXutil.ltrim( GXutil.str( AV7Tran_Id, 11, 0)));
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
      pa9D2( ) ;
      ws9D2( ) ;
      we9D2( ) ;
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
      sCtrlAV7Tran_Id = (String)getParm(obj,0,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa9D2( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "alm_transacciondocumentoswc");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa9D2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV7Tran_Id = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Tran_Id", GXutil.ltrim( GXutil.str( AV7Tran_Id, 11, 0)));
      }
      wcpOAV7Tran_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7Tran_Id"), ",", ".") ;
      if ( ! GetJustCreated( ) && ( ( AV7Tran_Id != wcpOAV7Tran_Id ) ) )
      {
         setjustcreated();
      }
      wcpOAV7Tran_Id = AV7Tran_Id ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV7Tran_Id = httpContext.cgiGet( sPrefix+"AV7Tran_Id_CTRL") ;
      if ( GXutil.len( sCtrlAV7Tran_Id) > 0 )
      {
         AV7Tran_Id = localUtil.ctol( httpContext.cgiGet( sCtrlAV7Tran_Id), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Tran_Id", GXutil.ltrim( GXutil.str( AV7Tran_Id, 11, 0)));
      }
      else
      {
         AV7Tran_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"AV7Tran_Id_PARM"), ",", ".") ;
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
      pa9D2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws9D2( ) ;
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
      ws9D2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Tran_Id_PARM", GXutil.ltrim( localUtil.ntoc( AV7Tran_Id, (byte)(11), (byte)(0), ",", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7Tran_Id)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Tran_Id_CTRL", GXutil.rtrim( sCtrlAV7Tran_Id));
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
      we9D2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414103494");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("alm_transacciondocumentoswc.js", "?201861414103494");
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_122( )
   {
      edtTran_Nro_Documento_Internalname = sPrefix+"TRAN_NRO_DOCUMENTO_"+sGXsfl_12_idx ;
      edtTran_Descrip_Documento_Internalname = sPrefix+"TRAN_DESCRIP_DOCUMENTO_"+sGXsfl_12_idx ;
      edtTran_Prefijo_Documento_Internalname = sPrefix+"TRAN_PREFIJO_DOCUMENTO_"+sGXsfl_12_idx ;
      edtTran_Archivo_Internalname = sPrefix+"TRAN_ARCHIVO_"+sGXsfl_12_idx ;
      edtTran_Ruta_Archivo_Internalname = sPrefix+"TRAN_RUTA_ARCHIVO_"+sGXsfl_12_idx ;
   }

   public void subsflControlProps_fel_122( )
   {
      edtTran_Nro_Documento_Internalname = sPrefix+"TRAN_NRO_DOCUMENTO_"+sGXsfl_12_fel_idx ;
      edtTran_Descrip_Documento_Internalname = sPrefix+"TRAN_DESCRIP_DOCUMENTO_"+sGXsfl_12_fel_idx ;
      edtTran_Prefijo_Documento_Internalname = sPrefix+"TRAN_PREFIJO_DOCUMENTO_"+sGXsfl_12_fel_idx ;
      edtTran_Archivo_Internalname = sPrefix+"TRAN_ARCHIVO_"+sGXsfl_12_fel_idx ;
      edtTran_Ruta_Archivo_Internalname = sPrefix+"TRAN_RUTA_ARCHIVO_"+sGXsfl_12_fel_idx ;
   }

   public void sendrow_122( )
   {
      subsflControlProps_122( ) ;
      wb9D0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_12_idx <= subgrid_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_12_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_12_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_Nro_Documento_Internalname,GXutil.ltrim( localUtil.ntoc( A827Tran_Nro_Documento, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A827Tran_Nro_Documento), "ZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_Nro_Documento_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_Descrip_Documento_Internalname,A828Tran_Descrip_Documento,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_Descrip_Documento_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_Prefijo_Documento_Internalname,A829Tran_Prefijo_Documento,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_Prefijo_Documento_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         ClassString = "Image" ;
         StyleString = "" ;
         edtTran_Archivo_Filetype = "tmp" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTran_Archivo_Internalname, "Filetype", edtTran_Archivo_Filetype, !bGXsfl_12_Refreshing);
         if ( ! (GXutil.strcmp("", A830Tran_Archivo)==0) )
         {
            gxblobfileaux.setSource( A830Tran_Archivo );
            if ( ! gxblobfileaux.hasExtension() || ( GXutil.strcmp(edtTran_Archivo_Filetype, "tmp") != 0 ) )
            {
               gxblobfileaux.setExt(GXutil.trim( edtTran_Archivo_Filetype));
            }
            if ( gxblobfileaux.getErrCode() == 0 )
            {
               A830Tran_Archivo = gxblobfileaux.getAbsoluteName() ;
               n830Tran_Archivo = false ;
               httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTran_Archivo_Internalname, "URL", httpContext.getResourceRelative(A830Tran_Archivo), !bGXsfl_12_Refreshing);
               edtTran_Archivo_Filetype = gxblobfileaux.getExtension() ;
               httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTran_Archivo_Internalname, "Filetype", edtTran_Archivo_Filetype, !bGXsfl_12_Refreshing);
               gxblobfileaux.setBlobToDelete();
            }
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTran_Archivo_Internalname, "URL", httpContext.getResourceRelative(A830Tran_Archivo), !bGXsfl_12_Refreshing);
         }
         GridRow.AddColumnProperties("blob", 2, isAjaxCallMode( ), new Object[] {edtTran_Archivo_Internalname,GXutil.rtrim( A830Tran_Archivo),httpContext.getResourceRelative(A830Tran_Archivo),((GXutil.strcmp("", edtTran_Archivo_Contenttype)==0) ? com.genexus.internet.HttpResponse.getContentType(((GXutil.strcmp("", edtTran_Archivo_Filetype)==0) ? A830Tran_Archivo : edtTran_Archivo_Filetype)) : edtTran_Archivo_Contenttype),new Boolean(false),"",edtTran_Archivo_Parameters,new Integer(0),new Integer(0),new Integer(-1),"","",new Integer(0),new Integer(-1),new Integer(0),"px",new Integer(60),"px",new Integer(0),new Integer(0),new Integer(0),edtTran_Archivo_Jsonclick,"'"+sPrefix+"'"+",false,"+"'"+""+"'",StyleString,ClassString,"WWColumn WWOptionalColumn",""+"","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_Ruta_Archivo_Internalname,A831Tran_Ruta_Archivo,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTran_Ruta_Archivo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_NRO_DOCUMENTO"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, localUtil.format( DecimalUtil.doubleToDec(A827Tran_Nro_Documento), "ZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_RUTA_ARCHIVO"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, GXutil.rtrim( localUtil.format( A831Tran_Ruta_Archivo, ""))));
         GridContainer.AddRow(GridRow);
         nGXsfl_12_idx = (short)(((subGrid_Islastpage==1)&&(nGXsfl_12_idx+1>subgrid_recordsperpage( )) ? 1 : nGXsfl_12_idx+1)) ;
         sGXsfl_12_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_12_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_122( ) ;
      }
      /* End function sendrow_122 */
   }

   public void init_default_properties( )
   {
      edtTran_Nro_Documento_Internalname = sPrefix+"TRAN_NRO_DOCUMENTO" ;
      edtTran_Descrip_Documento_Internalname = sPrefix+"TRAN_DESCRIP_DOCUMENTO" ;
      edtTran_Prefijo_Documento_Internalname = sPrefix+"TRAN_PREFIJO_DOCUMENTO" ;
      edtTran_Archivo_Internalname = sPrefix+"TRAN_ARCHIVO" ;
      edtTran_Ruta_Archivo_Internalname = sPrefix+"TRAN_RUTA_ARCHIVO" ;
      divGridtable_Internalname = sPrefix+"GRIDTABLE" ;
      divGridcell_Internalname = sPrefix+"GRIDCELL" ;
      edtTran_Id_Internalname = sPrefix+"TRAN_ID" ;
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
      edtTran_Ruta_Archivo_Jsonclick = "" ;
      edtTran_Archivo_Jsonclick = "" ;
      edtTran_Archivo_Parameters = "" ;
      edtTran_Archivo_Contenttype = "" ;
      edtTran_Archivo_Filetype = "" ;
      edtTran_Prefijo_Documento_Jsonclick = "" ;
      edtTran_Descrip_Documento_Jsonclick = "" ;
      edtTran_Nro_Documento_Jsonclick = "" ;
      edtTran_Id_Jsonclick = "" ;
      edtTran_Id_Enabled = 0 ;
      edtTran_Id_Visible = 1 ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Class = "ViewGrid" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Rows = 0 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e129D2',iparms:[],oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
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
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid_Linesclass = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      A828Tran_Descrip_Documento = "" ;
      A829Tran_Prefijo_Documento = "" ;
      A830Tran_Archivo = "" ;
      A831Tran_Ruta_Archivo = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV15Pgmname = "" ;
      scmdbuf = "" ;
      H009D2_A46Tran_Id = new long[1] ;
      H009D2_A831Tran_Ruta_Archivo = new String[] {""} ;
      H009D2_n831Tran_Ruta_Archivo = new boolean[] {false} ;
      H009D2_A830Tran_Archivo = new String[] {""} ;
      H009D2_n830Tran_Archivo = new boolean[] {false} ;
      H009D2_A829Tran_Prefijo_Documento = new String[] {""} ;
      H009D2_n829Tran_Prefijo_Documento = new boolean[] {false} ;
      H009D2_A828Tran_Descrip_Documento = new String[] {""} ;
      H009D2_n828Tran_Descrip_Documento = new boolean[] {false} ;
      H009D2_A827Tran_Nro_Documento = new short[1] ;
      H009D3_AGRID_nRecordCount = new long[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV10TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV9HTTPRequest = httpContext.getHttpRequest();
      AV11TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV8Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV7Tran_Id = "" ;
      ROClassString = "" ;
      gxblobfileaux = new com.genexus.util.GXFile();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_transacciondocumentoswc__default(),
         new Object[] {
             new Object[] {
            H009D2_A46Tran_Id, H009D2_A831Tran_Ruta_Archivo, H009D2_n831Tran_Ruta_Archivo, H009D2_A830Tran_Archivo, H009D2_n830Tran_Archivo, H009D2_A829Tran_Prefijo_Documento, H009D2_n829Tran_Prefijo_Documento, H009D2_A828Tran_Descrip_Documento, H009D2_n828Tran_Descrip_Documento, H009D2_A827Tran_Nro_Documento
            }
            , new Object[] {
            H009D3_AGRID_nRecordCount
            }
         }
      );
      AV15Pgmname = "ALM_TRANSACCIONDocumentosWC" ;
      /* GeneXus formulas. */
      AV15Pgmname = "ALM_TRANSACCIONDocumentosWC" ;
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
   private short nRC_GXsfl_12 ;
   private short nGXsfl_12_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short A827Tran_Nro_Documento ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int edtTran_Id_Enabled ;
   private int edtTran_Id_Visible ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private long wcpOAV7Tran_Id ;
   private long AV7Tran_Id ;
   private long GRID_nFirstRecordOnPage ;
   private long A46Tran_Id ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sGXsfl_12_idx="0001" ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String divMaintable_Internalname ;
   private String divGridcell_Internalname ;
   private String divGridtable_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String edtTran_Id_Internalname ;
   private String edtTran_Id_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtTran_Nro_Documento_Internalname ;
   private String edtTran_Descrip_Documento_Internalname ;
   private String edtTran_Prefijo_Documento_Internalname ;
   private String edtTran_Archivo_Internalname ;
   private String edtTran_Ruta_Archivo_Internalname ;
   private String AV15Pgmname ;
   private String scmdbuf ;
   private String sCtrlAV7Tran_Id ;
   private String sGXsfl_12_fel_idx="0001" ;
   private String ROClassString ;
   private String edtTran_Nro_Documento_Jsonclick ;
   private String edtTran_Descrip_Documento_Jsonclick ;
   private String edtTran_Prefijo_Documento_Jsonclick ;
   private String edtTran_Archivo_Filetype ;
   private String edtTran_Archivo_Contenttype ;
   private String edtTran_Archivo_Parameters ;
   private String edtTran_Archivo_Jsonclick ;
   private String edtTran_Ruta_Archivo_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n828Tran_Descrip_Documento ;
   private boolean n829Tran_Prefijo_Documento ;
   private boolean n830Tran_Archivo ;
   private boolean bGXsfl_12_Refreshing=false ;
   private boolean n831Tran_Ruta_Archivo ;
   private boolean returnInSub ;
   private String A830Tran_Archivo ;
   private String A828Tran_Descrip_Documento ;
   private String A829Tran_Prefijo_Documento ;
   private String A831Tran_Ruta_Archivo ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV9HTTPRequest ;
   private com.genexus.util.GXFile gxblobfileaux ;
   private IDataStoreProvider pr_default ;
   private long[] H009D2_A46Tran_Id ;
   private String[] H009D2_A831Tran_Ruta_Archivo ;
   private boolean[] H009D2_n831Tran_Ruta_Archivo ;
   private String[] H009D2_A830Tran_Archivo ;
   private boolean[] H009D2_n830Tran_Archivo ;
   private String[] H009D2_A829Tran_Prefijo_Documento ;
   private boolean[] H009D2_n829Tran_Prefijo_Documento ;
   private String[] H009D2_A828Tran_Descrip_Documento ;
   private boolean[] H009D2_n828Tran_Descrip_Documento ;
   private short[] H009D2_A827Tran_Nro_Documento ;
   private long[] H009D3_AGRID_nRecordCount ;
   private com.genexus.webpanels.WebSession AV8Session ;
   private com.orions2.SdtTransactionContext AV10TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV11TrnContextAtt ;
}

final  class alm_transacciondocumentoswc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H009D2", "SELECT T1.Tran_Id, T1.Tran_Ruta_Archivo, T1.Tran_Archivo, T2.Docu_Prefijo AS Tran_Prefijo_Documento, T2.Docu_Descripcion AS Tran_Descrip_Documento, T1.Tran_Nro_Documento AS Tran_Nro_Documento FROM (ALM_TRANSACCION_DOCUM T1 INNER JOIN ALM_DOCUMENTOS T2 ON T2.Docu_Nro = T1.Tran_Nro_Documento) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id  OFFSET ? ROWS FETCH NEXT (CASE WHEN ? > 0 THEN ? ELSE 1e9 END) ROWS ONLY",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H009D3", "SELECT COUNT(*) FROM (ALM_TRANSACCION_DOCUM T1 INNER JOIN ALM_DOCUMENTOS T2 ON T2.Docu_Nro = T1.Tran_Nro_Documento) WHERE T1.Tran_Id = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((String[]) buf[3])[0] = rslt.getBLOBFile(3, "tmp", "") ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6) ;
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

