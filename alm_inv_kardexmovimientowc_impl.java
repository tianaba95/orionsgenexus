/*
               File: alm_inv_kardexmovimientowc_impl
        Description: ALM_INV_KARDEXMovimiento WC
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:33.58
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

public final  class alm_inv_kardexmovimientowc_impl extends GXWebComponent
{
   public alm_inv_kardexmovimientowc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_inv_kardexmovimientowc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_inv_kardexmovimientowc_impl.class ));
   }

   public alm_inv_kardexmovimientowc_impl( int remoteHandle ,
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
               AV7Kard_Regi_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Kard_Regi_Id", GXutil.ltrim( GXutil.str( AV7Kard_Regi_Id, 11, 0)));
               AV8Kard_Cent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Kard_Cent_Id", GXutil.ltrim( GXutil.str( AV8Kard_Cent_Id, 11, 0)));
               AV9Kard_Alm_Cod = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Kard_Alm_Cod", AV9Kard_Alm_Cod);
               AV10Kard_Bod_Cod = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Kard_Bod_Cod", AV10Kard_Bod_Cod);
               AV11Kard_Elem_Cons = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11Kard_Elem_Cons", AV11Kard_Elem_Cons);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,new Long(AV7Kard_Regi_Id),new Long(AV8Kard_Cent_Id),AV9Kard_Alm_Cod,AV10Kard_Bod_Cod,AV11Kard_Elem_Cons});
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
               AV7Kard_Regi_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               AV8Kard_Cent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               AV9Kard_Alm_Cod = httpContext.GetNextPar( ) ;
               AV10Kard_Bod_Cod = httpContext.GetNextPar( ) ;
               AV11Kard_Elem_Cons = httpContext.GetNextPar( ) ;
               sPrefix = httpContext.GetNextPar( ) ;
               init_default_properties( ) ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxgrgrid_refresh( subGrid_Rows, AV7Kard_Regi_Id, AV8Kard_Cent_Id, AV9Kard_Alm_Cod, AV10Kard_Bod_Cod, AV11Kard_Elem_Cons, sPrefix) ;
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
         pa5U2( ) ;
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
         httpContext.writeValue( "ALM_INV_KARDEXMovimiento WC") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414103364");
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_inv_kardexmovimientowc") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV7Kard_Regi_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV8Kard_Cent_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV9Kard_Alm_Cod)) + "," + GXutil.URLEncode(GXutil.rtrim(AV10Kard_Bod_Cod)) + "," + GXutil.URLEncode(GXutil.rtrim(AV11Kard_Elem_Cons))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7Kard_Regi_Id", GXutil.ltrim( localUtil.ntoc( wcpOAV7Kard_Regi_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8Kard_Cent_Id", GXutil.ltrim( localUtil.ntoc( wcpOAV8Kard_Cent_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9Kard_Alm_Cod", wcpOAV9Kard_Alm_Cod);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10Kard_Bod_Cod", wcpOAV10Kard_Bod_Cod);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11Kard_Elem_Cons", wcpOAV11Kard_Elem_Cons);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vKARD_REGI_ID", GXutil.ltrim( localUtil.ntoc( AV7Kard_Regi_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vKARD_CENT_ID", GXutil.ltrim( localUtil.ntoc( AV8Kard_Cent_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vKARD_ALM_COD", AV9Kard_Alm_Cod);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vKARD_BOD_COD", AV10Kard_Bod_Cod);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vKARD_ELEM_CONS", AV11Kard_Elem_Cons);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm5U2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("alm_inv_kardexmovimientowc.js", "?201861414103366");
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
      return "ALM_INV_KARDEXMovimientoWC" ;
   }

   public String getPgmdesc( )
   {
      return "ALM_INV_KARDEXMovimiento WC" ;
   }

   public void wb5U0( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.alm_inv_kardexmovimientowc");
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
            httpContext.writeValue( "Transaccion") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tipo Movimiento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Entrada Cantidad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Entrada Valor") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Salida Cantidad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Salida Valor") ;
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
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A90Mov_Trans, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A579Mov_Tpmp_Codigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.format(A580Mov_Fecha, "99/99/99"));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A582Mov_Entrada_Cant, (byte)(8), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A583Mov_Entrada_Valor, (byte)(24), (byte)(2), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A584Mov_Salida_Cant, (byte)(8), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A585Mov_Salida_Valor, (byte)(24), (byte)(2), ".", "")));
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtKard_Regi_Id_Internalname, "Kardex Regional Id", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtKard_Regi_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A85Kard_Regi_Id, (byte)(11), (byte)(0), ",", "")), ((edtKard_Regi_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A85Kard_Regi_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A85Kard_Regi_Id), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtKard_Regi_Id_Jsonclick, 0, "Attribute", "", "", "", edtKard_Regi_Id_Visible, edtKard_Regi_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_INV_KARDEXMovimientoWC.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtKard_Cent_Id_Internalname, "Kardex Centro Costo Id", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtKard_Cent_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A86Kard_Cent_Id, (byte)(11), (byte)(0), ",", "")), ((edtKard_Cent_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A86Kard_Cent_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A86Kard_Cent_Id), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtKard_Cent_Id_Jsonclick, 0, "Attribute", "", "", "", edtKard_Cent_Id_Visible, edtKard_Cent_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_INV_KARDEXMovimientoWC.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtKard_Alm_Cod_Internalname, "Kardex Almacen Codigo", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtKard_Alm_Cod_Internalname, A87Kard_Alm_Cod, GXutil.rtrim( localUtil.format( A87Kard_Alm_Cod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtKard_Alm_Cod_Jsonclick, 0, "Attribute", "", "", "", edtKard_Alm_Cod_Visible, edtKard_Alm_Cod_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_INV_KARDEXMovimientoWC.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtKard_Bod_Cod_Internalname, "Kardex Bodega Codigo", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtKard_Bod_Cod_Internalname, A88Kard_Bod_Cod, GXutil.rtrim( localUtil.format( A88Kard_Bod_Cod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtKard_Bod_Cod_Jsonclick, 0, "Attribute", "", "", "", edtKard_Bod_Cod_Visible, edtKard_Bod_Cod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_INV_KARDEXMovimientoWC.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtKard_Elem_Cons_Internalname, "Kardex Elemento Consecutivo", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtKard_Elem_Cons_Internalname, A89Kard_Elem_Cons, GXutil.rtrim( localUtil.format( A89Kard_Elem_Cons, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtKard_Elem_Cons_Jsonclick, 0, "Attribute", "", "", "", edtKard_Elem_Cons_Visible, edtKard_Elem_Cons_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_INV_KARDEXMovimientoWC.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start5U2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "ALM_INV_KARDEXMovimiento WC", (short)(0)) ;
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
            strup5U0( ) ;
         }
      }
   }

   public void ws5U2( )
   {
      start5U2( ) ;
      evt5U2( ) ;
   }

   public void evt5U2( )
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
                              strup5U0( ) ;
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
                              strup5U0( ) ;
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
                              strup5U0( ) ;
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
                              strup5U0( ) ;
                           }
                           nGXsfl_12_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_12_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_12_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_122( ) ;
                           A90Mov_Trans = localUtil.ctol( httpContext.cgiGet( edtMov_Trans_Internalname), ",", ".") ;
                           A579Mov_Tpmp_Codigo = httpContext.cgiGet( edtMov_Tpmp_Codigo_Internalname) ;
                           A580Mov_Fecha = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtMov_Fecha_Internalname), 0)) ;
                           A582Mov_Entrada_Cant = (int)(localUtil.ctol( httpContext.cgiGet( edtMov_Entrada_Cant_Internalname), ",", ".")) ;
                           n582Mov_Entrada_Cant = false ;
                           A583Mov_Entrada_Valor = localUtil.ctond( httpContext.cgiGet( edtMov_Entrada_Valor_Internalname)) ;
                           n583Mov_Entrada_Valor = false ;
                           A584Mov_Salida_Cant = (int)(localUtil.ctol( httpContext.cgiGet( edtMov_Salida_Cant_Internalname), ",", ".")) ;
                           n584Mov_Salida_Cant = false ;
                           A585Mov_Salida_Valor = localUtil.ctond( httpContext.cgiGet( edtMov_Salida_Valor_Internalname)) ;
                           n585Mov_Salida_Valor = false ;
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
                                       e115U2 ();
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
                                       e125U2 ();
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
                                    strup5U0( ) ;
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

   public void we5U2( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm5U2( ) ;
         }
      }
   }

   public void pa5U2( )
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
                                 long AV7Kard_Regi_Id ,
                                 long AV8Kard_Cent_Id ,
                                 String AV9Kard_Alm_Cod ,
                                 String AV10Kard_Bod_Cod ,
                                 String AV11Kard_Elem_Cons ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid_Rows = subGrid_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID_nCurrentRecord = 0 ;
      rf5U2( ) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MOV_TRANS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A90Mov_Trans), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MOV_TRANS", GXutil.ltrim( localUtil.ntoc( A90Mov_Trans, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MOV_TPMP_CODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A579Mov_Tpmp_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MOV_TPMP_CODIGO", A579Mov_Tpmp_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MOV_FECHA", getSecureSignedToken( sPrefix, A580Mov_Fecha));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MOV_FECHA", localUtil.format(A580Mov_Fecha, "99/99/99"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MOV_ENTRADA_CANT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A582Mov_Entrada_Cant), "ZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MOV_ENTRADA_CANT", GXutil.ltrim( localUtil.ntoc( A582Mov_Entrada_Cant, (byte)(8), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MOV_ENTRADA_VALOR", getSecureSignedToken( sPrefix, localUtil.format( A583Mov_Entrada_Valor, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MOV_ENTRADA_VALOR", GXutil.ltrim( localUtil.ntoc( A583Mov_Entrada_Valor, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MOV_SALIDA_CANT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A584Mov_Salida_Cant), "ZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MOV_SALIDA_CANT", GXutil.ltrim( localUtil.ntoc( A584Mov_Salida_Cant, (byte)(8), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MOV_SALIDA_VALOR", getSecureSignedToken( sPrefix, localUtil.format( A585Mov_Salida_Valor, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MOV_SALIDA_VALOR", GXutil.ltrim( localUtil.ntoc( A585Mov_Salida_Valor, (byte)(18), (byte)(2), ".", "")));
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf5U2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV19Pgmname = "ALM_INV_KARDEXMovimientoWC" ;
      Gx_err = (short)(0) ;
   }

   public void rf5U2( )
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
         /* Using cursor H005U2 */
         pr_default.execute(0, new Object[] {new Long(AV7Kard_Regi_Id), new Long(AV8Kard_Cent_Id), AV9Kard_Alm_Cod, AV10Kard_Bod_Cod, AV11Kard_Elem_Cons, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_12_idx = (short)(1) ;
         sGXsfl_12_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_12_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_122( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_recordsperpage( ) ) ) ) )
         {
            A85Kard_Regi_Id = H005U2_A85Kard_Regi_Id[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A85Kard_Regi_Id", GXutil.ltrim( GXutil.str( A85Kard_Regi_Id, 11, 0)));
            A86Kard_Cent_Id = H005U2_A86Kard_Cent_Id[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A86Kard_Cent_Id", GXutil.ltrim( GXutil.str( A86Kard_Cent_Id, 11, 0)));
            A87Kard_Alm_Cod = H005U2_A87Kard_Alm_Cod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A87Kard_Alm_Cod", A87Kard_Alm_Cod);
            A88Kard_Bod_Cod = H005U2_A88Kard_Bod_Cod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A88Kard_Bod_Cod", A88Kard_Bod_Cod);
            A89Kard_Elem_Cons = H005U2_A89Kard_Elem_Cons[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A89Kard_Elem_Cons", A89Kard_Elem_Cons);
            A585Mov_Salida_Valor = H005U2_A585Mov_Salida_Valor[0] ;
            n585Mov_Salida_Valor = H005U2_n585Mov_Salida_Valor[0] ;
            A584Mov_Salida_Cant = H005U2_A584Mov_Salida_Cant[0] ;
            n584Mov_Salida_Cant = H005U2_n584Mov_Salida_Cant[0] ;
            A583Mov_Entrada_Valor = H005U2_A583Mov_Entrada_Valor[0] ;
            n583Mov_Entrada_Valor = H005U2_n583Mov_Entrada_Valor[0] ;
            A582Mov_Entrada_Cant = H005U2_A582Mov_Entrada_Cant[0] ;
            n582Mov_Entrada_Cant = H005U2_n582Mov_Entrada_Cant[0] ;
            A580Mov_Fecha = H005U2_A580Mov_Fecha[0] ;
            A579Mov_Tpmp_Codigo = H005U2_A579Mov_Tpmp_Codigo[0] ;
            A90Mov_Trans = H005U2_A90Mov_Trans[0] ;
            e125U2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(12) ;
         wb5U0( ) ;
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
      /* Using cursor H005U3 */
      pr_default.execute(1, new Object[] {new Long(AV7Kard_Regi_Id), new Long(AV8Kard_Cent_Id), AV9Kard_Alm_Cod, AV10Kard_Bod_Cod, AV11Kard_Elem_Cons});
      GRID_nRecordCount = H005U3_AGRID_nRecordCount[0] ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Kard_Regi_Id, AV8Kard_Cent_Id, AV9Kard_Alm_Cod, AV10Kard_Bod_Cod, AV11Kard_Elem_Cons, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Kard_Regi_Id, AV8Kard_Cent_Id, AV9Kard_Alm_Cod, AV10Kard_Bod_Cod, AV11Kard_Elem_Cons, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Kard_Regi_Id, AV8Kard_Cent_Id, AV9Kard_Alm_Cod, AV10Kard_Bod_Cod, AV11Kard_Elem_Cons, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Kard_Regi_Id, AV8Kard_Cent_Id, AV9Kard_Alm_Cod, AV10Kard_Bod_Cod, AV11Kard_Elem_Cons, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Kard_Regi_Id, AV8Kard_Cent_Id, AV9Kard_Alm_Cod, AV10Kard_Bod_Cod, AV11Kard_Elem_Cons, sPrefix) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup5U0( )
   {
      /* Before Start, stand alone formulas. */
      AV19Pgmname = "ALM_INV_KARDEXMovimientoWC" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e115U2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A85Kard_Regi_Id = localUtil.ctol( httpContext.cgiGet( edtKard_Regi_Id_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A85Kard_Regi_Id", GXutil.ltrim( GXutil.str( A85Kard_Regi_Id, 11, 0)));
         A86Kard_Cent_Id = localUtil.ctol( httpContext.cgiGet( edtKard_Cent_Id_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A86Kard_Cent_Id", GXutil.ltrim( GXutil.str( A86Kard_Cent_Id, 11, 0)));
         A87Kard_Alm_Cod = httpContext.cgiGet( edtKard_Alm_Cod_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A87Kard_Alm_Cod", A87Kard_Alm_Cod);
         A88Kard_Bod_Cod = httpContext.cgiGet( edtKard_Bod_Cod_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A88Kard_Bod_Cod", A88Kard_Bod_Cod);
         A89Kard_Elem_Cons = httpContext.cgiGet( edtKard_Elem_Cons_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A89Kard_Elem_Cons", A89Kard_Elem_Cons);
         /* Read saved values. */
         nRC_GXsfl_12 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_12"), ",", ".")) ;
         wcpOAV7Kard_Regi_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7Kard_Regi_Id"), ",", ".") ;
         wcpOAV8Kard_Cent_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8Kard_Cent_Id"), ",", ".") ;
         wcpOAV9Kard_Alm_Cod = httpContext.cgiGet( sPrefix+"wcpOAV9Kard_Alm_Cod") ;
         wcpOAV10Kard_Bod_Cod = httpContext.cgiGet( sPrefix+"wcpOAV10Kard_Bod_Cod") ;
         wcpOAV11Kard_Elem_Cons = httpContext.cgiGet( sPrefix+"wcpOAV11Kard_Elem_Cons") ;
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
      e115U2 ();
      if (returnInSub) return;
   }

   public void e115U2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV19Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV19Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      subGrid_Rows = 10 ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      edtKard_Regi_Id_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtKard_Regi_Id_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtKard_Regi_Id_Visible, 5, 0)), true);
      edtKard_Cent_Id_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtKard_Cent_Id_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtKard_Cent_Id_Visible, 5, 0)), true);
      edtKard_Alm_Cod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtKard_Alm_Cod_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtKard_Alm_Cod_Visible, 5, 0)), true);
      edtKard_Bod_Cod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtKard_Bod_Cod_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtKard_Bod_Cod_Visible, 5, 0)), true);
      edtKard_Elem_Cons_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtKard_Elem_Cons_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtKard_Elem_Cons_Visible, 5, 0)), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
   }

   private void e125U2( )
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
      AV14TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV14TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV19Pgmname );
      AV14TrnContext.setgxTv_SdtTransactionContext_Callerondelete( true );
      AV14TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV13HTTPRequest.getScriptName()+"?"+AV13HTTPRequest.getQuerystring() );
      AV14TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_INV_KARDEX" );
      AV15TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV15TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Kard_Regi_Id" );
      AV15TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV7Kard_Regi_Id, 11, 0) );
      AV14TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV15TrnContextAtt, 0);
      AV15TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV15TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Kard_Cent_Id" );
      AV15TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV8Kard_Cent_Id, 11, 0) );
      AV14TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV15TrnContextAtt, 0);
      AV15TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV15TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Kard_Alm_Cod" );
      AV15TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( AV9Kard_Alm_Cod );
      AV14TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV15TrnContextAtt, 0);
      AV15TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV15TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Kard_Bod_Cod" );
      AV15TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( AV10Kard_Bod_Cod );
      AV14TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV15TrnContextAtt, 0);
      AV15TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV15TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Kard_Elem_Cons" );
      AV15TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( AV11Kard_Elem_Cons );
      AV14TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV15TrnContextAtt, 0);
      AV12Session.setValue("TrnContext", AV14TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      AV7Kard_Regi_Id = ((Number) GXutil.testNumericType( getParm(obj,0,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Kard_Regi_Id", GXutil.ltrim( GXutil.str( AV7Kard_Regi_Id, 11, 0)));
      AV8Kard_Cent_Id = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Kard_Cent_Id", GXutil.ltrim( GXutil.str( AV8Kard_Cent_Id, 11, 0)));
      AV9Kard_Alm_Cod = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Kard_Alm_Cod", AV9Kard_Alm_Cod);
      AV10Kard_Bod_Cod = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Kard_Bod_Cod", AV10Kard_Bod_Cod);
      AV11Kard_Elem_Cons = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11Kard_Elem_Cons", AV11Kard_Elem_Cons);
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
      pa5U2( ) ;
      ws5U2( ) ;
      we5U2( ) ;
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
      sCtrlAV7Kard_Regi_Id = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV8Kard_Cent_Id = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV9Kard_Alm_Cod = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV10Kard_Bod_Cod = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV11Kard_Elem_Cons = (String)getParm(obj,4,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa5U2( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "alm_inv_kardexmovimientowc");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa5U2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV7Kard_Regi_Id = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Kard_Regi_Id", GXutil.ltrim( GXutil.str( AV7Kard_Regi_Id, 11, 0)));
         AV8Kard_Cent_Id = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Kard_Cent_Id", GXutil.ltrim( GXutil.str( AV8Kard_Cent_Id, 11, 0)));
         AV9Kard_Alm_Cod = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Kard_Alm_Cod", AV9Kard_Alm_Cod);
         AV10Kard_Bod_Cod = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Kard_Bod_Cod", AV10Kard_Bod_Cod);
         AV11Kard_Elem_Cons = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11Kard_Elem_Cons", AV11Kard_Elem_Cons);
      }
      wcpOAV7Kard_Regi_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7Kard_Regi_Id"), ",", ".") ;
      wcpOAV8Kard_Cent_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8Kard_Cent_Id"), ",", ".") ;
      wcpOAV9Kard_Alm_Cod = httpContext.cgiGet( sPrefix+"wcpOAV9Kard_Alm_Cod") ;
      wcpOAV10Kard_Bod_Cod = httpContext.cgiGet( sPrefix+"wcpOAV10Kard_Bod_Cod") ;
      wcpOAV11Kard_Elem_Cons = httpContext.cgiGet( sPrefix+"wcpOAV11Kard_Elem_Cons") ;
      if ( ! GetJustCreated( ) && ( ( AV7Kard_Regi_Id != wcpOAV7Kard_Regi_Id ) || ( AV8Kard_Cent_Id != wcpOAV8Kard_Cent_Id ) || ( GXutil.strcmp(AV9Kard_Alm_Cod, wcpOAV9Kard_Alm_Cod) != 0 ) || ( GXutil.strcmp(AV10Kard_Bod_Cod, wcpOAV10Kard_Bod_Cod) != 0 ) || ( GXutil.strcmp(AV11Kard_Elem_Cons, wcpOAV11Kard_Elem_Cons) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV7Kard_Regi_Id = AV7Kard_Regi_Id ;
      wcpOAV8Kard_Cent_Id = AV8Kard_Cent_Id ;
      wcpOAV9Kard_Alm_Cod = AV9Kard_Alm_Cod ;
      wcpOAV10Kard_Bod_Cod = AV10Kard_Bod_Cod ;
      wcpOAV11Kard_Elem_Cons = AV11Kard_Elem_Cons ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV7Kard_Regi_Id = httpContext.cgiGet( sPrefix+"AV7Kard_Regi_Id_CTRL") ;
      if ( GXutil.len( sCtrlAV7Kard_Regi_Id) > 0 )
      {
         AV7Kard_Regi_Id = localUtil.ctol( httpContext.cgiGet( sCtrlAV7Kard_Regi_Id), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Kard_Regi_Id", GXutil.ltrim( GXutil.str( AV7Kard_Regi_Id, 11, 0)));
      }
      else
      {
         AV7Kard_Regi_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"AV7Kard_Regi_Id_PARM"), ",", ".") ;
      }
      sCtrlAV8Kard_Cent_Id = httpContext.cgiGet( sPrefix+"AV8Kard_Cent_Id_CTRL") ;
      if ( GXutil.len( sCtrlAV8Kard_Cent_Id) > 0 )
      {
         AV8Kard_Cent_Id = localUtil.ctol( httpContext.cgiGet( sCtrlAV8Kard_Cent_Id), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Kard_Cent_Id", GXutil.ltrim( GXutil.str( AV8Kard_Cent_Id, 11, 0)));
      }
      else
      {
         AV8Kard_Cent_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"AV8Kard_Cent_Id_PARM"), ",", ".") ;
      }
      sCtrlAV9Kard_Alm_Cod = httpContext.cgiGet( sPrefix+"AV9Kard_Alm_Cod_CTRL") ;
      if ( GXutil.len( sCtrlAV9Kard_Alm_Cod) > 0 )
      {
         AV9Kard_Alm_Cod = httpContext.cgiGet( sCtrlAV9Kard_Alm_Cod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Kard_Alm_Cod", AV9Kard_Alm_Cod);
      }
      else
      {
         AV9Kard_Alm_Cod = httpContext.cgiGet( sPrefix+"AV9Kard_Alm_Cod_PARM") ;
      }
      sCtrlAV10Kard_Bod_Cod = httpContext.cgiGet( sPrefix+"AV10Kard_Bod_Cod_CTRL") ;
      if ( GXutil.len( sCtrlAV10Kard_Bod_Cod) > 0 )
      {
         AV10Kard_Bod_Cod = httpContext.cgiGet( sCtrlAV10Kard_Bod_Cod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Kard_Bod_Cod", AV10Kard_Bod_Cod);
      }
      else
      {
         AV10Kard_Bod_Cod = httpContext.cgiGet( sPrefix+"AV10Kard_Bod_Cod_PARM") ;
      }
      sCtrlAV11Kard_Elem_Cons = httpContext.cgiGet( sPrefix+"AV11Kard_Elem_Cons_CTRL") ;
      if ( GXutil.len( sCtrlAV11Kard_Elem_Cons) > 0 )
      {
         AV11Kard_Elem_Cons = httpContext.cgiGet( sCtrlAV11Kard_Elem_Cons) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11Kard_Elem_Cons", AV11Kard_Elem_Cons);
      }
      else
      {
         AV11Kard_Elem_Cons = httpContext.cgiGet( sPrefix+"AV11Kard_Elem_Cons_PARM") ;
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
      pa5U2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws5U2( ) ;
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
      ws5U2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Kard_Regi_Id_PARM", GXutil.ltrim( localUtil.ntoc( AV7Kard_Regi_Id, (byte)(11), (byte)(0), ",", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7Kard_Regi_Id)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Kard_Regi_Id_CTRL", GXutil.rtrim( sCtrlAV7Kard_Regi_Id));
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Kard_Cent_Id_PARM", GXutil.ltrim( localUtil.ntoc( AV8Kard_Cent_Id, (byte)(11), (byte)(0), ",", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8Kard_Cent_Id)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Kard_Cent_Id_CTRL", GXutil.rtrim( sCtrlAV8Kard_Cent_Id));
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9Kard_Alm_Cod_PARM", AV9Kard_Alm_Cod);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9Kard_Alm_Cod)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9Kard_Alm_Cod_CTRL", GXutil.rtrim( sCtrlAV9Kard_Alm_Cod));
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10Kard_Bod_Cod_PARM", AV10Kard_Bod_Cod);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10Kard_Bod_Cod)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10Kard_Bod_Cod_CTRL", GXutil.rtrim( sCtrlAV10Kard_Bod_Cod));
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11Kard_Elem_Cons_PARM", AV11Kard_Elem_Cons);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11Kard_Elem_Cons)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11Kard_Elem_Cons_CTRL", GXutil.rtrim( sCtrlAV11Kard_Elem_Cons));
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
      we5U2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414103422");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("alm_inv_kardexmovimientowc.js", "?201861414103422");
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_122( )
   {
      edtMov_Trans_Internalname = sPrefix+"MOV_TRANS_"+sGXsfl_12_idx ;
      edtMov_Tpmp_Codigo_Internalname = sPrefix+"MOV_TPMP_CODIGO_"+sGXsfl_12_idx ;
      edtMov_Fecha_Internalname = sPrefix+"MOV_FECHA_"+sGXsfl_12_idx ;
      edtMov_Entrada_Cant_Internalname = sPrefix+"MOV_ENTRADA_CANT_"+sGXsfl_12_idx ;
      edtMov_Entrada_Valor_Internalname = sPrefix+"MOV_ENTRADA_VALOR_"+sGXsfl_12_idx ;
      edtMov_Salida_Cant_Internalname = sPrefix+"MOV_SALIDA_CANT_"+sGXsfl_12_idx ;
      edtMov_Salida_Valor_Internalname = sPrefix+"MOV_SALIDA_VALOR_"+sGXsfl_12_idx ;
   }

   public void subsflControlProps_fel_122( )
   {
      edtMov_Trans_Internalname = sPrefix+"MOV_TRANS_"+sGXsfl_12_fel_idx ;
      edtMov_Tpmp_Codigo_Internalname = sPrefix+"MOV_TPMP_CODIGO_"+sGXsfl_12_fel_idx ;
      edtMov_Fecha_Internalname = sPrefix+"MOV_FECHA_"+sGXsfl_12_fel_idx ;
      edtMov_Entrada_Cant_Internalname = sPrefix+"MOV_ENTRADA_CANT_"+sGXsfl_12_fel_idx ;
      edtMov_Entrada_Valor_Internalname = sPrefix+"MOV_ENTRADA_VALOR_"+sGXsfl_12_fel_idx ;
      edtMov_Salida_Cant_Internalname = sPrefix+"MOV_SALIDA_CANT_"+sGXsfl_12_fel_idx ;
      edtMov_Salida_Valor_Internalname = sPrefix+"MOV_SALIDA_VALOR_"+sGXsfl_12_fel_idx ;
   }

   public void sendrow_122( )
   {
      subsflControlProps_122( ) ;
      wb5U0( ) ;
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
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMov_Trans_Internalname,GXutil.ltrim( localUtil.ntoc( A90Mov_Trans, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A90Mov_Trans), "ZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMov_Trans_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMov_Tpmp_Codigo_Internalname,A579Mov_Tpmp_Codigo,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMov_Tpmp_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMov_Fecha_Internalname,localUtil.format(A580Mov_Fecha, "99/99/99"),localUtil.format( A580Mov_Fecha, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMov_Fecha_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Fecha","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMov_Entrada_Cant_Internalname,GXutil.ltrim( localUtil.ntoc( A582Mov_Entrada_Cant, (byte)(8), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A582Mov_Entrada_Cant), "ZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMov_Entrada_Cant_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMov_Entrada_Valor_Internalname,GXutil.ltrim( localUtil.ntoc( A583Mov_Entrada_Valor, (byte)(24), (byte)(2), ",", "")),localUtil.format( A583Mov_Entrada_Valor, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMov_Entrada_Valor_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Valor","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMov_Salida_Cant_Internalname,GXutil.ltrim( localUtil.ntoc( A584Mov_Salida_Cant, (byte)(8), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A584Mov_Salida_Cant), "ZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMov_Salida_Cant_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMov_Salida_Valor_Internalname,GXutil.ltrim( localUtil.ntoc( A585Mov_Salida_Valor, (byte)(24), (byte)(2), ",", "")),localUtil.format( A585Mov_Salida_Valor, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMov_Salida_Valor_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Valor","right",new Boolean(false)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MOV_TRANS"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, localUtil.format( DecimalUtil.doubleToDec(A90Mov_Trans), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MOV_TPMP_CODIGO"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, GXutil.rtrim( localUtil.format( A579Mov_Tpmp_Codigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MOV_FECHA"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, A580Mov_Fecha));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MOV_ENTRADA_CANT"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, localUtil.format( DecimalUtil.doubleToDec(A582Mov_Entrada_Cant), "ZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MOV_ENTRADA_VALOR"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, localUtil.format( A583Mov_Entrada_Valor, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MOV_SALIDA_CANT"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, localUtil.format( DecimalUtil.doubleToDec(A584Mov_Salida_Cant), "ZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MOV_SALIDA_VALOR"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, localUtil.format( A585Mov_Salida_Valor, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         GridContainer.AddRow(GridRow);
         nGXsfl_12_idx = (short)(((subGrid_Islastpage==1)&&(nGXsfl_12_idx+1>subgrid_recordsperpage( )) ? 1 : nGXsfl_12_idx+1)) ;
         sGXsfl_12_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_12_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_122( ) ;
      }
      /* End function sendrow_122 */
   }

   public void init_default_properties( )
   {
      edtMov_Trans_Internalname = sPrefix+"MOV_TRANS" ;
      edtMov_Tpmp_Codigo_Internalname = sPrefix+"MOV_TPMP_CODIGO" ;
      edtMov_Fecha_Internalname = sPrefix+"MOV_FECHA" ;
      edtMov_Entrada_Cant_Internalname = sPrefix+"MOV_ENTRADA_CANT" ;
      edtMov_Entrada_Valor_Internalname = sPrefix+"MOV_ENTRADA_VALOR" ;
      edtMov_Salida_Cant_Internalname = sPrefix+"MOV_SALIDA_CANT" ;
      edtMov_Salida_Valor_Internalname = sPrefix+"MOV_SALIDA_VALOR" ;
      divGridtable_Internalname = sPrefix+"GRIDTABLE" ;
      divGridcell_Internalname = sPrefix+"GRIDCELL" ;
      edtKard_Regi_Id_Internalname = sPrefix+"KARD_REGI_ID" ;
      edtKard_Cent_Id_Internalname = sPrefix+"KARD_CENT_ID" ;
      edtKard_Alm_Cod_Internalname = sPrefix+"KARD_ALM_COD" ;
      edtKard_Bod_Cod_Internalname = sPrefix+"KARD_BOD_COD" ;
      edtKard_Elem_Cons_Internalname = sPrefix+"KARD_ELEM_CONS" ;
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
      edtMov_Salida_Valor_Jsonclick = "" ;
      edtMov_Salida_Cant_Jsonclick = "" ;
      edtMov_Entrada_Valor_Jsonclick = "" ;
      edtMov_Entrada_Cant_Jsonclick = "" ;
      edtMov_Fecha_Jsonclick = "" ;
      edtMov_Tpmp_Codigo_Jsonclick = "" ;
      edtMov_Trans_Jsonclick = "" ;
      edtKard_Elem_Cons_Jsonclick = "" ;
      edtKard_Elem_Cons_Enabled = 0 ;
      edtKard_Elem_Cons_Visible = 1 ;
      edtKard_Bod_Cod_Jsonclick = "" ;
      edtKard_Bod_Cod_Enabled = 0 ;
      edtKard_Bod_Cod_Visible = 1 ;
      edtKard_Alm_Cod_Jsonclick = "" ;
      edtKard_Alm_Cod_Enabled = 0 ;
      edtKard_Alm_Cod_Visible = 1 ;
      edtKard_Cent_Id_Jsonclick = "" ;
      edtKard_Cent_Id_Enabled = 0 ;
      edtKard_Cent_Id_Visible = 1 ;
      edtKard_Regi_Id_Jsonclick = "" ;
      edtKard_Regi_Id_Enabled = 0 ;
      edtKard_Regi_Id_Visible = 1 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Kard_Regi_Id',fld:'vKARD_REGI_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV8Kard_Cent_Id',fld:'vKARD_CENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV9Kard_Alm_Cod',fld:'vKARD_ALM_COD',pic:'',nv:''},{av:'AV10Kard_Bod_Cod',fld:'vKARD_BOD_COD',pic:'',nv:''},{av:'AV11Kard_Elem_Cons',fld:'vKARD_ELEM_CONS',pic:'',nv:''},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e125U2',iparms:[],oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Kard_Regi_Id',fld:'vKARD_REGI_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV8Kard_Cent_Id',fld:'vKARD_CENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV9Kard_Alm_Cod',fld:'vKARD_ALM_COD',pic:'',nv:''},{av:'AV10Kard_Bod_Cod',fld:'vKARD_BOD_COD',pic:'',nv:''},{av:'AV11Kard_Elem_Cons',fld:'vKARD_ELEM_CONS',pic:'',nv:''},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Kard_Regi_Id',fld:'vKARD_REGI_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV8Kard_Cent_Id',fld:'vKARD_CENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV9Kard_Alm_Cod',fld:'vKARD_ALM_COD',pic:'',nv:''},{av:'AV10Kard_Bod_Cod',fld:'vKARD_BOD_COD',pic:'',nv:''},{av:'AV11Kard_Elem_Cons',fld:'vKARD_ELEM_CONS',pic:'',nv:''},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Kard_Regi_Id',fld:'vKARD_REGI_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV8Kard_Cent_Id',fld:'vKARD_CENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV9Kard_Alm_Cod',fld:'vKARD_ALM_COD',pic:'',nv:''},{av:'AV10Kard_Bod_Cod',fld:'vKARD_BOD_COD',pic:'',nv:''},{av:'AV11Kard_Elem_Cons',fld:'vKARD_ELEM_CONS',pic:'',nv:''},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Kard_Regi_Id',fld:'vKARD_REGI_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV8Kard_Cent_Id',fld:'vKARD_CENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV9Kard_Alm_Cod',fld:'vKARD_ALM_COD',pic:'',nv:''},{av:'AV10Kard_Bod_Cod',fld:'vKARD_BOD_COD',pic:'',nv:''},{av:'AV11Kard_Elem_Cons',fld:'vKARD_ELEM_CONS',pic:'',nv:''},{av:'sPrefix',nv:''}],oparms:[]}");
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
      wcpOAV9Kard_Alm_Cod = "" ;
      wcpOAV10Kard_Bod_Cod = "" ;
      wcpOAV11Kard_Elem_Cons = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV9Kard_Alm_Cod = "" ;
      AV10Kard_Bod_Cod = "" ;
      AV11Kard_Elem_Cons = "" ;
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
      A579Mov_Tpmp_Codigo = "" ;
      A580Mov_Fecha = GXutil.nullDate() ;
      A583Mov_Entrada_Valor = DecimalUtil.ZERO ;
      A585Mov_Salida_Valor = DecimalUtil.ZERO ;
      A87Kard_Alm_Cod = "" ;
      A88Kard_Bod_Cod = "" ;
      A89Kard_Elem_Cons = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV19Pgmname = "" ;
      scmdbuf = "" ;
      H005U2_A85Kard_Regi_Id = new long[1] ;
      H005U2_A86Kard_Cent_Id = new long[1] ;
      H005U2_A87Kard_Alm_Cod = new String[] {""} ;
      H005U2_A88Kard_Bod_Cod = new String[] {""} ;
      H005U2_A89Kard_Elem_Cons = new String[] {""} ;
      H005U2_A585Mov_Salida_Valor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H005U2_n585Mov_Salida_Valor = new boolean[] {false} ;
      H005U2_A584Mov_Salida_Cant = new int[1] ;
      H005U2_n584Mov_Salida_Cant = new boolean[] {false} ;
      H005U2_A583Mov_Entrada_Valor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H005U2_n583Mov_Entrada_Valor = new boolean[] {false} ;
      H005U2_A582Mov_Entrada_Cant = new int[1] ;
      H005U2_n582Mov_Entrada_Cant = new boolean[] {false} ;
      H005U2_A580Mov_Fecha = new java.util.Date[] {GXutil.nullDate()} ;
      H005U2_A579Mov_Tpmp_Codigo = new String[] {""} ;
      H005U2_A90Mov_Trans = new long[1] ;
      H005U3_AGRID_nRecordCount = new long[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV14TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV13HTTPRequest = httpContext.getHttpRequest();
      AV15TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV12Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV7Kard_Regi_Id = "" ;
      sCtrlAV8Kard_Cent_Id = "" ;
      sCtrlAV9Kard_Alm_Cod = "" ;
      sCtrlAV10Kard_Bod_Cod = "" ;
      sCtrlAV11Kard_Elem_Cons = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_inv_kardexmovimientowc__default(),
         new Object[] {
             new Object[] {
            H005U2_A85Kard_Regi_Id, H005U2_A86Kard_Cent_Id, H005U2_A87Kard_Alm_Cod, H005U2_A88Kard_Bod_Cod, H005U2_A89Kard_Elem_Cons, H005U2_A585Mov_Salida_Valor, H005U2_n585Mov_Salida_Valor, H005U2_A584Mov_Salida_Cant, H005U2_n584Mov_Salida_Cant, H005U2_A583Mov_Entrada_Valor,
            H005U2_n583Mov_Entrada_Valor, H005U2_A582Mov_Entrada_Cant, H005U2_n582Mov_Entrada_Cant, H005U2_A580Mov_Fecha, H005U2_A579Mov_Tpmp_Codigo, H005U2_A90Mov_Trans
            }
            , new Object[] {
            H005U3_AGRID_nRecordCount
            }
         }
      );
      AV19Pgmname = "ALM_INV_KARDEXMovimientoWC" ;
      /* GeneXus formulas. */
      AV19Pgmname = "ALM_INV_KARDEXMovimientoWC" ;
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
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Allbackcolor ;
   private int A582Mov_Entrada_Cant ;
   private int A584Mov_Salida_Cant ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int edtKard_Regi_Id_Enabled ;
   private int edtKard_Regi_Id_Visible ;
   private int edtKard_Cent_Id_Enabled ;
   private int edtKard_Cent_Id_Visible ;
   private int edtKard_Alm_Cod_Visible ;
   private int edtKard_Alm_Cod_Enabled ;
   private int edtKard_Bod_Cod_Visible ;
   private int edtKard_Bod_Cod_Enabled ;
   private int edtKard_Elem_Cons_Visible ;
   private int edtKard_Elem_Cons_Enabled ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private long wcpOAV7Kard_Regi_Id ;
   private long wcpOAV8Kard_Cent_Id ;
   private long AV7Kard_Regi_Id ;
   private long AV8Kard_Cent_Id ;
   private long GRID_nFirstRecordOnPage ;
   private long A90Mov_Trans ;
   private long A85Kard_Regi_Id ;
   private long A86Kard_Cent_Id ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal A583Mov_Entrada_Valor ;
   private java.math.BigDecimal A585Mov_Salida_Valor ;
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
   private String edtKard_Regi_Id_Internalname ;
   private String edtKard_Regi_Id_Jsonclick ;
   private String edtKard_Cent_Id_Internalname ;
   private String edtKard_Cent_Id_Jsonclick ;
   private String edtKard_Alm_Cod_Internalname ;
   private String edtKard_Alm_Cod_Jsonclick ;
   private String edtKard_Bod_Cod_Internalname ;
   private String edtKard_Bod_Cod_Jsonclick ;
   private String edtKard_Elem_Cons_Internalname ;
   private String edtKard_Elem_Cons_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtMov_Trans_Internalname ;
   private String edtMov_Tpmp_Codigo_Internalname ;
   private String edtMov_Fecha_Internalname ;
   private String edtMov_Entrada_Cant_Internalname ;
   private String edtMov_Entrada_Valor_Internalname ;
   private String edtMov_Salida_Cant_Internalname ;
   private String edtMov_Salida_Valor_Internalname ;
   private String AV19Pgmname ;
   private String scmdbuf ;
   private String sCtrlAV7Kard_Regi_Id ;
   private String sCtrlAV8Kard_Cent_Id ;
   private String sCtrlAV9Kard_Alm_Cod ;
   private String sCtrlAV10Kard_Bod_Cod ;
   private String sCtrlAV11Kard_Elem_Cons ;
   private String sGXsfl_12_fel_idx="0001" ;
   private String ROClassString ;
   private String edtMov_Trans_Jsonclick ;
   private String edtMov_Tpmp_Codigo_Jsonclick ;
   private String edtMov_Fecha_Jsonclick ;
   private String edtMov_Entrada_Cant_Jsonclick ;
   private String edtMov_Entrada_Valor_Jsonclick ;
   private String edtMov_Salida_Cant_Jsonclick ;
   private String edtMov_Salida_Valor_Jsonclick ;
   private java.util.Date A580Mov_Fecha ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n582Mov_Entrada_Cant ;
   private boolean n583Mov_Entrada_Valor ;
   private boolean n584Mov_Salida_Cant ;
   private boolean n585Mov_Salida_Valor ;
   private boolean bGXsfl_12_Refreshing=false ;
   private boolean returnInSub ;
   private String wcpOAV9Kard_Alm_Cod ;
   private String wcpOAV10Kard_Bod_Cod ;
   private String wcpOAV11Kard_Elem_Cons ;
   private String AV9Kard_Alm_Cod ;
   private String AV10Kard_Bod_Cod ;
   private String AV11Kard_Elem_Cons ;
   private String A579Mov_Tpmp_Codigo ;
   private String A87Kard_Alm_Cod ;
   private String A88Kard_Bod_Cod ;
   private String A89Kard_Elem_Cons ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV13HTTPRequest ;
   private IDataStoreProvider pr_default ;
   private long[] H005U2_A85Kard_Regi_Id ;
   private long[] H005U2_A86Kard_Cent_Id ;
   private String[] H005U2_A87Kard_Alm_Cod ;
   private String[] H005U2_A88Kard_Bod_Cod ;
   private String[] H005U2_A89Kard_Elem_Cons ;
   private java.math.BigDecimal[] H005U2_A585Mov_Salida_Valor ;
   private boolean[] H005U2_n585Mov_Salida_Valor ;
   private int[] H005U2_A584Mov_Salida_Cant ;
   private boolean[] H005U2_n584Mov_Salida_Cant ;
   private java.math.BigDecimal[] H005U2_A583Mov_Entrada_Valor ;
   private boolean[] H005U2_n583Mov_Entrada_Valor ;
   private int[] H005U2_A582Mov_Entrada_Cant ;
   private boolean[] H005U2_n582Mov_Entrada_Cant ;
   private java.util.Date[] H005U2_A580Mov_Fecha ;
   private String[] H005U2_A579Mov_Tpmp_Codigo ;
   private long[] H005U2_A90Mov_Trans ;
   private long[] H005U3_AGRID_nRecordCount ;
   private com.genexus.webpanels.WebSession AV12Session ;
   private com.orions2.SdtTransactionContext AV14TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV15TrnContextAtt ;
}

final  class alm_inv_kardexmovimientowc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H005U2", "SELECT Kard_Regi_Id, Kard_Cent_Id, Kard_Alm_Cod, Kard_Bod_Cod, Kard_Elem_Cons, Mov_Salida_Valor, Mov_Salida_Cant, Mov_Entrada_Valor, Mov_Entrada_Cant, Mov_Fecha, Mov_Tpmp_Codigo, Mov_Trans FROM KARDEX_MOVIMIENTO WHERE Kard_Regi_Id = ? and Kard_Cent_Id = ? and Kard_Alm_Cod = ? and Kard_Bod_Cod = ? and Kard_Elem_Cons = ? ORDER BY Kard_Regi_Id, Kard_Cent_Id, Kard_Alm_Cod, Kard_Bod_Cod, Kard_Elem_Cons  OFFSET ? ROWS FETCH NEXT (CASE WHEN ? > 0 THEN ? ELSE 1e9 END) ROWS ONLY",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H005U3", "SELECT COUNT(*) FROM KARDEX_MOVIMIENTO WHERE Kard_Regi_Id = ? and Kard_Cent_Id = ? and Kard_Alm_Cod = ? and Kard_Bod_Cod = ? and Kard_Elem_Cons = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(9) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(10) ;
               ((String[]) buf[14])[0] = rslt.getVarchar(11) ;
               ((long[]) buf[15])[0] = rslt.getLong(12) ;
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 2);
               stmt.setVarchar(4, (String)parms[3], 3);
               stmt.setVarchar(5, (String)parms[4], 9);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 2);
               stmt.setVarchar(4, (String)parms[3], 3);
               stmt.setVarchar(5, (String)parms[4], 9);
               return;
      }
   }

}

