/*
               File: alm_elementoalm_devo_histwc_impl
        Description: ALM_ELEMENTOALM_DEVO_HISTWC
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:40.90
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

public final  class alm_elementoalm_devo_histwc_impl extends GXWebComponent
{
   public alm_elementoalm_devo_histwc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_elementoalm_devo_histwc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_elementoalm_devo_histwc_impl.class ));
   }

   public alm_elementoalm_devo_histwc_impl( int remoteHandle ,
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
      cmbDEVOC_ESTADO = new HTMLChoice();
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
               AV7DEVOC_CONSECUTIVO = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7DEVOC_CONSECUTIVO", AV7DEVOC_CONSECUTIVO);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV7DEVOC_CONSECUTIVO});
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
               AV7DEVOC_CONSECUTIVO = httpContext.GetNextPar( ) ;
               sPrefix = httpContext.GetNextPar( ) ;
               init_default_properties( ) ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxgrgrid_refresh( subGrid_Rows, AV7DEVOC_CONSECUTIVO, sPrefix) ;
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
         pa4H2( ) ;
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
         httpContext.writeValue( "ALM_ELEMENTOALM_DEVO_HISTWC") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414104096");
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_elementoalm_devo_histwc") + "?" + GXutil.URLEncode(GXutil.rtrim(AV7DEVOC_CONSECUTIVO))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7DEVOC_CONSECUTIVO", wcpOAV7DEVOC_CONSECUTIVO);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDEVOC_CONSECUTIVO", AV7DEVOC_CONSECUTIVO);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm4H2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("alm_elementoalm_devo_histwc.js", "?201861414104098");
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
      return "ALM_ELEMENTOALM_DEVO_HISTWC" ;
   }

   public String getPgmdesc( )
   {
      return "ALM_ELEMENTOALM_DEVO_HISTWC" ;
   }

   public void wb4H0( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.alm_elementoalm_devo_histwc");
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
            httpContext.writeValue( "ID") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "ID") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "ID") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "MOVIMIENTO") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "MOVIMIENTO") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "CONSECUTIVO") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "MOVIMIENTO") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "RENGLON") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "DEVOC_PLACA") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "PADRE") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "SERIAL") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "MARCA") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "MARCA2") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "MODELO") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "UTIL") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "ADQUISICION") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "ADQUISICION") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "ESTADO") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "ID ORIGEN") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "ORIGEN") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "ORIGEN") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "ORIGEN") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "ID ORIGEN") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "ID DESTINO") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "ID DESTINO") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "DESTINO") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "DESTINO") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "DESTINO") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "ID DESTINO") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "ID") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "DEVOC_FECHA_SERVICIO") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "ENTREGA") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "OBSERVACIONES") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "ID") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "ID") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "INGRESO") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "INGRESO") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "DEVOC_FECHA_INGRESO") ;
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
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A95DEVOC_ID, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A96DEVOC_REGIONAL, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A101DEVOC_TRAN_ID, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A722DEVOC_TIPO_MOVIMIENTO);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A100DEVOC_CODIGO_MOVIMIENTO);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A723DEVOC_TRAN_CC, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.format(A103DEVOC_FECHA_MOVIMIENTO, "99/99/99"));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A724DEVOC_RENGLON, (byte)(5), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A725DEVOC_PLACA);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A726DEVOC_PLACA_PADRE);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A727DEVOC_SERIAL);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A728DEVOC_MARCA);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A729DEVOC_MARCA2);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A730DEVOC_MODELO);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A731DEVOC_VIDA_UTIL, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A732DEVOC_VALOR_ADQUISICION, (byte)(18), (byte)(2), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.format(A733DEVOC_FECHA_ADQUISICION, "99/99/99"));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A99DEVOC_ESTADO);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A97DEVOC_CENTRO_COSTO_ORIGEN, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A734DEVOC_MODULO_ORIGEN);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A735DEVOC_ALMA_ORIGEN);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A736DEVOC_BODEGA_ORIGEN);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A98DEVOC_NIT_ORIGEN, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A737DEVOC_REGIONAL_DESTINO, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A738DEVOC_CENTRO_COSTO_DESTINO, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A739DEVOC_MODULO_DESTINO);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A740DEVOC_ALMA_DESTINO);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A741DEVOC_BODEGA_DESTINO);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A742DEVOC_NIT_DESTINO, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A743DEVOC_PROVEEDOR_ID, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.format(A744DEVOC_FECHA_SERVICIO, "99/99/99"));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A745DEVOC_ACTA_ENTREGA, (byte)(5), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A748DEVOC_TRAN_OBSERVACIONES);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A749DEVOC_CURSO_ID);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A750DEVOC_AREADANTE_ID);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A751DEVOC_TIPO_INGRESO, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A752DEVOC_NUMERO_INGRESO);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A753DEVOC_FECHA_INGRESO, (byte)(4), (byte)(0), ".", "")));
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_CONSECUTIVO_Internalname, "ELEMENTO CONSECUTIVO", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_CONSECUTIVO_Internalname, A102DEVOC_CONSECUTIVO, GXutil.rtrim( localUtil.format( A102DEVOC_CONSECUTIVO, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_CONSECUTIVO_Jsonclick, 0, "Attribute", "", "", "", edtDEVOC_CONSECUTIVO_Visible, edtDEVOC_CONSECUTIVO_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_ELEMENTOALM_DEVO_HISTWC.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start4H2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "ALM_ELEMENTOALM_DEVO_HISTWC", (short)(0)) ;
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
            strup4H0( ) ;
         }
      }
   }

   public void ws4H2( )
   {
      start4H2( ) ;
      evt4H2( ) ;
   }

   public void evt4H2( )
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
                              strup4H0( ) ;
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
                              strup4H0( ) ;
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
                              strup4H0( ) ;
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
                              strup4H0( ) ;
                           }
                           nGXsfl_12_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_12_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_12_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_122( ) ;
                           A95DEVOC_ID = localUtil.ctol( httpContext.cgiGet( edtDEVOC_ID_Internalname), ",", ".") ;
                           A96DEVOC_REGIONAL = localUtil.ctol( httpContext.cgiGet( edtDEVOC_REGIONAL_Internalname), ",", ".") ;
                           n96DEVOC_REGIONAL = false ;
                           A101DEVOC_TRAN_ID = localUtil.ctol( httpContext.cgiGet( edtDEVOC_TRAN_ID_Internalname), ",", ".") ;
                           n101DEVOC_TRAN_ID = false ;
                           A722DEVOC_TIPO_MOVIMIENTO = httpContext.cgiGet( edtDEVOC_TIPO_MOVIMIENTO_Internalname) ;
                           n722DEVOC_TIPO_MOVIMIENTO = false ;
                           A100DEVOC_CODIGO_MOVIMIENTO = httpContext.cgiGet( edtDEVOC_CODIGO_MOVIMIENTO_Internalname) ;
                           n100DEVOC_CODIGO_MOVIMIENTO = false ;
                           A723DEVOC_TRAN_CC = localUtil.ctol( httpContext.cgiGet( edtDEVOC_TRAN_CC_Internalname), ",", ".") ;
                           n723DEVOC_TRAN_CC = false ;
                           A103DEVOC_FECHA_MOVIMIENTO = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtDEVOC_FECHA_MOVIMIENTO_Internalname), 0)) ;
                           n103DEVOC_FECHA_MOVIMIENTO = false ;
                           A724DEVOC_RENGLON = (int)(localUtil.ctol( httpContext.cgiGet( edtDEVOC_RENGLON_Internalname), ",", ".")) ;
                           n724DEVOC_RENGLON = false ;
                           A725DEVOC_PLACA = httpContext.cgiGet( edtDEVOC_PLACA_Internalname) ;
                           n725DEVOC_PLACA = false ;
                           A726DEVOC_PLACA_PADRE = httpContext.cgiGet( edtDEVOC_PLACA_PADRE_Internalname) ;
                           n726DEVOC_PLACA_PADRE = false ;
                           A727DEVOC_SERIAL = httpContext.cgiGet( edtDEVOC_SERIAL_Internalname) ;
                           n727DEVOC_SERIAL = false ;
                           A728DEVOC_MARCA = httpContext.cgiGet( edtDEVOC_MARCA_Internalname) ;
                           n728DEVOC_MARCA = false ;
                           A729DEVOC_MARCA2 = httpContext.cgiGet( edtDEVOC_MARCA2_Internalname) ;
                           n729DEVOC_MARCA2 = false ;
                           A730DEVOC_MODELO = httpContext.cgiGet( edtDEVOC_MODELO_Internalname) ;
                           n730DEVOC_MODELO = false ;
                           A731DEVOC_VIDA_UTIL = (short)(localUtil.ctol( httpContext.cgiGet( edtDEVOC_VIDA_UTIL_Internalname), ",", ".")) ;
                           n731DEVOC_VIDA_UTIL = false ;
                           A732DEVOC_VALOR_ADQUISICION = localUtil.ctond( httpContext.cgiGet( edtDEVOC_VALOR_ADQUISICION_Internalname)) ;
                           n732DEVOC_VALOR_ADQUISICION = false ;
                           A733DEVOC_FECHA_ADQUISICION = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtDEVOC_FECHA_ADQUISICION_Internalname), 0)) ;
                           n733DEVOC_FECHA_ADQUISICION = false ;
                           cmbDEVOC_ESTADO.setName( cmbDEVOC_ESTADO.getInternalname() );
                           cmbDEVOC_ESTADO.setValue( httpContext.cgiGet( cmbDEVOC_ESTADO.getInternalname()) );
                           A99DEVOC_ESTADO = httpContext.cgiGet( cmbDEVOC_ESTADO.getInternalname()) ;
                           n99DEVOC_ESTADO = false ;
                           A97DEVOC_CENTRO_COSTO_ORIGEN = localUtil.ctol( httpContext.cgiGet( edtDEVOC_CENTRO_COSTO_ORIGEN_Internalname), ",", ".") ;
                           n97DEVOC_CENTRO_COSTO_ORIGEN = false ;
                           A734DEVOC_MODULO_ORIGEN = httpContext.cgiGet( edtDEVOC_MODULO_ORIGEN_Internalname) ;
                           n734DEVOC_MODULO_ORIGEN = false ;
                           A735DEVOC_ALMA_ORIGEN = httpContext.cgiGet( edtDEVOC_ALMA_ORIGEN_Internalname) ;
                           n735DEVOC_ALMA_ORIGEN = false ;
                           A736DEVOC_BODEGA_ORIGEN = httpContext.cgiGet( edtDEVOC_BODEGA_ORIGEN_Internalname) ;
                           n736DEVOC_BODEGA_ORIGEN = false ;
                           A98DEVOC_NIT_ORIGEN = localUtil.ctol( httpContext.cgiGet( edtDEVOC_NIT_ORIGEN_Internalname), ",", ".") ;
                           n98DEVOC_NIT_ORIGEN = false ;
                           A737DEVOC_REGIONAL_DESTINO = localUtil.ctol( httpContext.cgiGet( edtDEVOC_REGIONAL_DESTINO_Internalname), ",", ".") ;
                           n737DEVOC_REGIONAL_DESTINO = false ;
                           A738DEVOC_CENTRO_COSTO_DESTINO = localUtil.ctol( httpContext.cgiGet( edtDEVOC_CENTRO_COSTO_DESTINO_Internalname), ",", ".") ;
                           n738DEVOC_CENTRO_COSTO_DESTINO = false ;
                           A739DEVOC_MODULO_DESTINO = httpContext.cgiGet( edtDEVOC_MODULO_DESTINO_Internalname) ;
                           n739DEVOC_MODULO_DESTINO = false ;
                           A740DEVOC_ALMA_DESTINO = httpContext.cgiGet( edtDEVOC_ALMA_DESTINO_Internalname) ;
                           n740DEVOC_ALMA_DESTINO = false ;
                           A741DEVOC_BODEGA_DESTINO = httpContext.cgiGet( edtDEVOC_BODEGA_DESTINO_Internalname) ;
                           n741DEVOC_BODEGA_DESTINO = false ;
                           A742DEVOC_NIT_DESTINO = localUtil.ctol( httpContext.cgiGet( edtDEVOC_NIT_DESTINO_Internalname), ",", ".") ;
                           n742DEVOC_NIT_DESTINO = false ;
                           A743DEVOC_PROVEEDOR_ID = localUtil.ctol( httpContext.cgiGet( edtDEVOC_PROVEEDOR_ID_Internalname), ",", ".") ;
                           n743DEVOC_PROVEEDOR_ID = false ;
                           A744DEVOC_FECHA_SERVICIO = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtDEVOC_FECHA_SERVICIO_Internalname), 0)) ;
                           n744DEVOC_FECHA_SERVICIO = false ;
                           A745DEVOC_ACTA_ENTREGA = (int)(localUtil.ctol( httpContext.cgiGet( edtDEVOC_ACTA_ENTREGA_Internalname), ",", ".")) ;
                           n745DEVOC_ACTA_ENTREGA = false ;
                           A748DEVOC_TRAN_OBSERVACIONES = httpContext.cgiGet( edtDEVOC_TRAN_OBSERVACIONES_Internalname) ;
                           n748DEVOC_TRAN_OBSERVACIONES = false ;
                           A749DEVOC_CURSO_ID = httpContext.cgiGet( edtDEVOC_CURSO_ID_Internalname) ;
                           n749DEVOC_CURSO_ID = false ;
                           A750DEVOC_AREADANTE_ID = httpContext.cgiGet( edtDEVOC_AREADANTE_ID_Internalname) ;
                           n750DEVOC_AREADANTE_ID = false ;
                           A751DEVOC_TIPO_INGRESO = localUtil.ctol( httpContext.cgiGet( edtDEVOC_TIPO_INGRESO_Internalname), ",", ".") ;
                           n751DEVOC_TIPO_INGRESO = false ;
                           A752DEVOC_NUMERO_INGRESO = httpContext.cgiGet( edtDEVOC_NUMERO_INGRESO_Internalname) ;
                           n752DEVOC_NUMERO_INGRESO = false ;
                           A753DEVOC_FECHA_INGRESO = (short)(localUtil.ctol( httpContext.cgiGet( edtDEVOC_FECHA_INGRESO_Internalname), ",", ".")) ;
                           n753DEVOC_FECHA_INGRESO = false ;
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
                                       e114H2 ();
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
                                       e124H2 ();
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
                                    strup4H0( ) ;
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

   public void we4H2( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm4H2( ) ;
         }
      }
   }

   public void pa4H2( )
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
         GXCCtl = "DEVOC_ESTADO_" + sGXsfl_12_idx ;
         cmbDEVOC_ESTADO.setName( GXCCtl );
         cmbDEVOC_ESTADO.setWebtags( "" );
         if ( cmbDEVOC_ESTADO.getItemCount() > 0 )
         {
            A99DEVOC_ESTADO = cmbDEVOC_ESTADO.getValidValue(A99DEVOC_ESTADO) ;
            n99DEVOC_ESTADO = false ;
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
                                 String AV7DEVOC_CONSECUTIVO ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid_Rows = subGrid_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID_nCurrentRecord = 0 ;
      rf4H2( ) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_ID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A95DEVOC_ID), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_ID", GXutil.ltrim( localUtil.ntoc( A95DEVOC_ID, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_REGIONAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A96DEVOC_REGIONAL), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_REGIONAL", GXutil.ltrim( localUtil.ntoc( A96DEVOC_REGIONAL, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_TRAN_ID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A101DEVOC_TRAN_ID), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_TRAN_ID", GXutil.ltrim( localUtil.ntoc( A101DEVOC_TRAN_ID, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_TIPO_MOVIMIENTO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A722DEVOC_TIPO_MOVIMIENTO, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_TIPO_MOVIMIENTO", A722DEVOC_TIPO_MOVIMIENTO);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_CODIGO_MOVIMIENTO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A100DEVOC_CODIGO_MOVIMIENTO, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_CODIGO_MOVIMIENTO", A100DEVOC_CODIGO_MOVIMIENTO);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_TRAN_CC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A723DEVOC_TRAN_CC), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_TRAN_CC", GXutil.ltrim( localUtil.ntoc( A723DEVOC_TRAN_CC, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_FECHA_MOVIMIENTO", getSecureSignedToken( sPrefix, A103DEVOC_FECHA_MOVIMIENTO));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_FECHA_MOVIMIENTO", localUtil.format(A103DEVOC_FECHA_MOVIMIENTO, "99/99/99"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_RENGLON", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A724DEVOC_RENGLON), "ZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_RENGLON", GXutil.ltrim( localUtil.ntoc( A724DEVOC_RENGLON, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_PLACA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A725DEVOC_PLACA, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_PLACA", A725DEVOC_PLACA);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_PLACA_PADRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A726DEVOC_PLACA_PADRE, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_PLACA_PADRE", A726DEVOC_PLACA_PADRE);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_SERIAL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A727DEVOC_SERIAL, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_SERIAL", A727DEVOC_SERIAL);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_MARCA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A728DEVOC_MARCA, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_MARCA", A728DEVOC_MARCA);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_MARCA2", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A729DEVOC_MARCA2, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_MARCA2", A729DEVOC_MARCA2);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_MODELO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A730DEVOC_MODELO, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_MODELO", A730DEVOC_MODELO);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_VIDA_UTIL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A731DEVOC_VIDA_UTIL), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_VIDA_UTIL", GXutil.ltrim( localUtil.ntoc( A731DEVOC_VIDA_UTIL, (byte)(4), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_VALOR_ADQUISICION", getSecureSignedToken( sPrefix, localUtil.format( A732DEVOC_VALOR_ADQUISICION, "ZZZZZZZZZZZZZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_VALOR_ADQUISICION", GXutil.ltrim( localUtil.ntoc( A732DEVOC_VALOR_ADQUISICION, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_FECHA_ADQUISICION", getSecureSignedToken( sPrefix, A733DEVOC_FECHA_ADQUISICION));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_FECHA_ADQUISICION", localUtil.format(A733DEVOC_FECHA_ADQUISICION, "99/99/99"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A99DEVOC_ESTADO, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_ESTADO", A99DEVOC_ESTADO);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_CENTRO_COSTO_ORIGEN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A97DEVOC_CENTRO_COSTO_ORIGEN), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_CENTRO_COSTO_ORIGEN", GXutil.ltrim( localUtil.ntoc( A97DEVOC_CENTRO_COSTO_ORIGEN, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_MODULO_ORIGEN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A734DEVOC_MODULO_ORIGEN, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_MODULO_ORIGEN", A734DEVOC_MODULO_ORIGEN);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_ALMA_ORIGEN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A735DEVOC_ALMA_ORIGEN, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_ALMA_ORIGEN", A735DEVOC_ALMA_ORIGEN);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_BODEGA_ORIGEN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A736DEVOC_BODEGA_ORIGEN, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_BODEGA_ORIGEN", A736DEVOC_BODEGA_ORIGEN);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_NIT_ORIGEN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A98DEVOC_NIT_ORIGEN), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_NIT_ORIGEN", GXutil.ltrim( localUtil.ntoc( A98DEVOC_NIT_ORIGEN, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_REGIONAL_DESTINO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A737DEVOC_REGIONAL_DESTINO), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_REGIONAL_DESTINO", GXutil.ltrim( localUtil.ntoc( A737DEVOC_REGIONAL_DESTINO, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_CENTRO_COSTO_DESTINO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A738DEVOC_CENTRO_COSTO_DESTINO), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_CENTRO_COSTO_DESTINO", GXutil.ltrim( localUtil.ntoc( A738DEVOC_CENTRO_COSTO_DESTINO, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_MODULO_DESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A739DEVOC_MODULO_DESTINO, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_MODULO_DESTINO", A739DEVOC_MODULO_DESTINO);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_ALMA_DESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A740DEVOC_ALMA_DESTINO, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_ALMA_DESTINO", A740DEVOC_ALMA_DESTINO);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_BODEGA_DESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A741DEVOC_BODEGA_DESTINO, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_BODEGA_DESTINO", A741DEVOC_BODEGA_DESTINO);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_NIT_DESTINO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A742DEVOC_NIT_DESTINO), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_NIT_DESTINO", GXutil.ltrim( localUtil.ntoc( A742DEVOC_NIT_DESTINO, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_PROVEEDOR_ID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A743DEVOC_PROVEEDOR_ID), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_PROVEEDOR_ID", GXutil.ltrim( localUtil.ntoc( A743DEVOC_PROVEEDOR_ID, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_FECHA_SERVICIO", getSecureSignedToken( sPrefix, A744DEVOC_FECHA_SERVICIO));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_FECHA_SERVICIO", localUtil.format(A744DEVOC_FECHA_SERVICIO, "99/99/99"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_ACTA_ENTREGA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A745DEVOC_ACTA_ENTREGA), "ZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_ACTA_ENTREGA", GXutil.ltrim( localUtil.ntoc( A745DEVOC_ACTA_ENTREGA, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_TRAN_OBSERVACIONES", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A748DEVOC_TRAN_OBSERVACIONES, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_TRAN_OBSERVACIONES", A748DEVOC_TRAN_OBSERVACIONES);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_CURSO_ID", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A749DEVOC_CURSO_ID, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_CURSO_ID", A749DEVOC_CURSO_ID);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_AREADANTE_ID", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A750DEVOC_AREADANTE_ID, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_AREADANTE_ID", A750DEVOC_AREADANTE_ID);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_TIPO_INGRESO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A751DEVOC_TIPO_INGRESO), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_TIPO_INGRESO", GXutil.ltrim( localUtil.ntoc( A751DEVOC_TIPO_INGRESO, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_NUMERO_INGRESO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A752DEVOC_NUMERO_INGRESO, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_NUMERO_INGRESO", A752DEVOC_NUMERO_INGRESO);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_FECHA_INGRESO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A753DEVOC_FECHA_INGRESO), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVOC_FECHA_INGRESO", GXutil.ltrim( localUtil.ntoc( A753DEVOC_FECHA_INGRESO, (byte)(4), (byte)(0), ".", "")));
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf4H2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV15Pgmname = "ALM_ELEMENTOALM_DEVO_HISTWC" ;
      Gx_err = (short)(0) ;
   }

   public void rf4H2( )
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
         /* Using cursor H004H2 */
         pr_default.execute(0, new Object[] {AV7DEVOC_CONSECUTIVO, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_12_idx = (short)(1) ;
         sGXsfl_12_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_12_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_122( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_recordsperpage( ) ) ) ) )
         {
            A102DEVOC_CONSECUTIVO = H004H2_A102DEVOC_CONSECUTIVO[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A102DEVOC_CONSECUTIVO", A102DEVOC_CONSECUTIVO);
            n102DEVOC_CONSECUTIVO = H004H2_n102DEVOC_CONSECUTIVO[0] ;
            A753DEVOC_FECHA_INGRESO = H004H2_A753DEVOC_FECHA_INGRESO[0] ;
            n753DEVOC_FECHA_INGRESO = H004H2_n753DEVOC_FECHA_INGRESO[0] ;
            A752DEVOC_NUMERO_INGRESO = H004H2_A752DEVOC_NUMERO_INGRESO[0] ;
            n752DEVOC_NUMERO_INGRESO = H004H2_n752DEVOC_NUMERO_INGRESO[0] ;
            A751DEVOC_TIPO_INGRESO = H004H2_A751DEVOC_TIPO_INGRESO[0] ;
            n751DEVOC_TIPO_INGRESO = H004H2_n751DEVOC_TIPO_INGRESO[0] ;
            A750DEVOC_AREADANTE_ID = H004H2_A750DEVOC_AREADANTE_ID[0] ;
            n750DEVOC_AREADANTE_ID = H004H2_n750DEVOC_AREADANTE_ID[0] ;
            A749DEVOC_CURSO_ID = H004H2_A749DEVOC_CURSO_ID[0] ;
            n749DEVOC_CURSO_ID = H004H2_n749DEVOC_CURSO_ID[0] ;
            A748DEVOC_TRAN_OBSERVACIONES = H004H2_A748DEVOC_TRAN_OBSERVACIONES[0] ;
            n748DEVOC_TRAN_OBSERVACIONES = H004H2_n748DEVOC_TRAN_OBSERVACIONES[0] ;
            A745DEVOC_ACTA_ENTREGA = H004H2_A745DEVOC_ACTA_ENTREGA[0] ;
            n745DEVOC_ACTA_ENTREGA = H004H2_n745DEVOC_ACTA_ENTREGA[0] ;
            A744DEVOC_FECHA_SERVICIO = H004H2_A744DEVOC_FECHA_SERVICIO[0] ;
            n744DEVOC_FECHA_SERVICIO = H004H2_n744DEVOC_FECHA_SERVICIO[0] ;
            A743DEVOC_PROVEEDOR_ID = H004H2_A743DEVOC_PROVEEDOR_ID[0] ;
            n743DEVOC_PROVEEDOR_ID = H004H2_n743DEVOC_PROVEEDOR_ID[0] ;
            A742DEVOC_NIT_DESTINO = H004H2_A742DEVOC_NIT_DESTINO[0] ;
            n742DEVOC_NIT_DESTINO = H004H2_n742DEVOC_NIT_DESTINO[0] ;
            A741DEVOC_BODEGA_DESTINO = H004H2_A741DEVOC_BODEGA_DESTINO[0] ;
            n741DEVOC_BODEGA_DESTINO = H004H2_n741DEVOC_BODEGA_DESTINO[0] ;
            A740DEVOC_ALMA_DESTINO = H004H2_A740DEVOC_ALMA_DESTINO[0] ;
            n740DEVOC_ALMA_DESTINO = H004H2_n740DEVOC_ALMA_DESTINO[0] ;
            A739DEVOC_MODULO_DESTINO = H004H2_A739DEVOC_MODULO_DESTINO[0] ;
            n739DEVOC_MODULO_DESTINO = H004H2_n739DEVOC_MODULO_DESTINO[0] ;
            A738DEVOC_CENTRO_COSTO_DESTINO = H004H2_A738DEVOC_CENTRO_COSTO_DESTINO[0] ;
            n738DEVOC_CENTRO_COSTO_DESTINO = H004H2_n738DEVOC_CENTRO_COSTO_DESTINO[0] ;
            A737DEVOC_REGIONAL_DESTINO = H004H2_A737DEVOC_REGIONAL_DESTINO[0] ;
            n737DEVOC_REGIONAL_DESTINO = H004H2_n737DEVOC_REGIONAL_DESTINO[0] ;
            A98DEVOC_NIT_ORIGEN = H004H2_A98DEVOC_NIT_ORIGEN[0] ;
            n98DEVOC_NIT_ORIGEN = H004H2_n98DEVOC_NIT_ORIGEN[0] ;
            A736DEVOC_BODEGA_ORIGEN = H004H2_A736DEVOC_BODEGA_ORIGEN[0] ;
            n736DEVOC_BODEGA_ORIGEN = H004H2_n736DEVOC_BODEGA_ORIGEN[0] ;
            A735DEVOC_ALMA_ORIGEN = H004H2_A735DEVOC_ALMA_ORIGEN[0] ;
            n735DEVOC_ALMA_ORIGEN = H004H2_n735DEVOC_ALMA_ORIGEN[0] ;
            A734DEVOC_MODULO_ORIGEN = H004H2_A734DEVOC_MODULO_ORIGEN[0] ;
            n734DEVOC_MODULO_ORIGEN = H004H2_n734DEVOC_MODULO_ORIGEN[0] ;
            A97DEVOC_CENTRO_COSTO_ORIGEN = H004H2_A97DEVOC_CENTRO_COSTO_ORIGEN[0] ;
            n97DEVOC_CENTRO_COSTO_ORIGEN = H004H2_n97DEVOC_CENTRO_COSTO_ORIGEN[0] ;
            A99DEVOC_ESTADO = H004H2_A99DEVOC_ESTADO[0] ;
            n99DEVOC_ESTADO = H004H2_n99DEVOC_ESTADO[0] ;
            A733DEVOC_FECHA_ADQUISICION = H004H2_A733DEVOC_FECHA_ADQUISICION[0] ;
            n733DEVOC_FECHA_ADQUISICION = H004H2_n733DEVOC_FECHA_ADQUISICION[0] ;
            A732DEVOC_VALOR_ADQUISICION = H004H2_A732DEVOC_VALOR_ADQUISICION[0] ;
            n732DEVOC_VALOR_ADQUISICION = H004H2_n732DEVOC_VALOR_ADQUISICION[0] ;
            A731DEVOC_VIDA_UTIL = H004H2_A731DEVOC_VIDA_UTIL[0] ;
            n731DEVOC_VIDA_UTIL = H004H2_n731DEVOC_VIDA_UTIL[0] ;
            A730DEVOC_MODELO = H004H2_A730DEVOC_MODELO[0] ;
            n730DEVOC_MODELO = H004H2_n730DEVOC_MODELO[0] ;
            A729DEVOC_MARCA2 = H004H2_A729DEVOC_MARCA2[0] ;
            n729DEVOC_MARCA2 = H004H2_n729DEVOC_MARCA2[0] ;
            A728DEVOC_MARCA = H004H2_A728DEVOC_MARCA[0] ;
            n728DEVOC_MARCA = H004H2_n728DEVOC_MARCA[0] ;
            A727DEVOC_SERIAL = H004H2_A727DEVOC_SERIAL[0] ;
            n727DEVOC_SERIAL = H004H2_n727DEVOC_SERIAL[0] ;
            A726DEVOC_PLACA_PADRE = H004H2_A726DEVOC_PLACA_PADRE[0] ;
            n726DEVOC_PLACA_PADRE = H004H2_n726DEVOC_PLACA_PADRE[0] ;
            A725DEVOC_PLACA = H004H2_A725DEVOC_PLACA[0] ;
            n725DEVOC_PLACA = H004H2_n725DEVOC_PLACA[0] ;
            A724DEVOC_RENGLON = H004H2_A724DEVOC_RENGLON[0] ;
            n724DEVOC_RENGLON = H004H2_n724DEVOC_RENGLON[0] ;
            A103DEVOC_FECHA_MOVIMIENTO = H004H2_A103DEVOC_FECHA_MOVIMIENTO[0] ;
            n103DEVOC_FECHA_MOVIMIENTO = H004H2_n103DEVOC_FECHA_MOVIMIENTO[0] ;
            A723DEVOC_TRAN_CC = H004H2_A723DEVOC_TRAN_CC[0] ;
            n723DEVOC_TRAN_CC = H004H2_n723DEVOC_TRAN_CC[0] ;
            A100DEVOC_CODIGO_MOVIMIENTO = H004H2_A100DEVOC_CODIGO_MOVIMIENTO[0] ;
            n100DEVOC_CODIGO_MOVIMIENTO = H004H2_n100DEVOC_CODIGO_MOVIMIENTO[0] ;
            A722DEVOC_TIPO_MOVIMIENTO = H004H2_A722DEVOC_TIPO_MOVIMIENTO[0] ;
            n722DEVOC_TIPO_MOVIMIENTO = H004H2_n722DEVOC_TIPO_MOVIMIENTO[0] ;
            A101DEVOC_TRAN_ID = H004H2_A101DEVOC_TRAN_ID[0] ;
            n101DEVOC_TRAN_ID = H004H2_n101DEVOC_TRAN_ID[0] ;
            A96DEVOC_REGIONAL = H004H2_A96DEVOC_REGIONAL[0] ;
            n96DEVOC_REGIONAL = H004H2_n96DEVOC_REGIONAL[0] ;
            A95DEVOC_ID = H004H2_A95DEVOC_ID[0] ;
            e124H2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(12) ;
         wb4H0( ) ;
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
      /* Using cursor H004H3 */
      pr_default.execute(1, new Object[] {AV7DEVOC_CONSECUTIVO});
      GRID_nRecordCount = H004H3_AGRID_nRecordCount[0] ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7DEVOC_CONSECUTIVO, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7DEVOC_CONSECUTIVO, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7DEVOC_CONSECUTIVO, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7DEVOC_CONSECUTIVO, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7DEVOC_CONSECUTIVO, sPrefix) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup4H0( )
   {
      /* Before Start, stand alone formulas. */
      AV15Pgmname = "ALM_ELEMENTOALM_DEVO_HISTWC" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e114H2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A102DEVOC_CONSECUTIVO = httpContext.cgiGet( edtDEVOC_CONSECUTIVO_Internalname) ;
         n102DEVOC_CONSECUTIVO = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A102DEVOC_CONSECUTIVO", A102DEVOC_CONSECUTIVO);
         /* Read saved values. */
         nRC_GXsfl_12 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_12"), ",", ".")) ;
         wcpOAV7DEVOC_CONSECUTIVO = httpContext.cgiGet( sPrefix+"wcpOAV7DEVOC_CONSECUTIVO") ;
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
      e114H2 ();
      if (returnInSub) return;
   }

   public void e114H2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV15Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV15Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      subGrid_Rows = 10 ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      edtDEVOC_CONSECUTIVO_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDEVOC_CONSECUTIVO_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtDEVOC_CONSECUTIVO_Visible, 5, 0)), true);
   }

   private void e124H2( )
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

   public void setparameters( Object[] obj )
   {
      AV7DEVOC_CONSECUTIVO = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7DEVOC_CONSECUTIVO", AV7DEVOC_CONSECUTIVO);
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
      pa4H2( ) ;
      ws4H2( ) ;
      we4H2( ) ;
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
      sCtrlAV7DEVOC_CONSECUTIVO = (String)getParm(obj,0,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa4H2( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "alm_elementoalm_devo_histwc");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa4H2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV7DEVOC_CONSECUTIVO = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7DEVOC_CONSECUTIVO", AV7DEVOC_CONSECUTIVO);
      }
      wcpOAV7DEVOC_CONSECUTIVO = httpContext.cgiGet( sPrefix+"wcpOAV7DEVOC_CONSECUTIVO") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV7DEVOC_CONSECUTIVO, wcpOAV7DEVOC_CONSECUTIVO) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV7DEVOC_CONSECUTIVO = AV7DEVOC_CONSECUTIVO ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV7DEVOC_CONSECUTIVO = httpContext.cgiGet( sPrefix+"AV7DEVOC_CONSECUTIVO_CTRL") ;
      if ( GXutil.len( sCtrlAV7DEVOC_CONSECUTIVO) > 0 )
      {
         AV7DEVOC_CONSECUTIVO = httpContext.cgiGet( sCtrlAV7DEVOC_CONSECUTIVO) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7DEVOC_CONSECUTIVO", AV7DEVOC_CONSECUTIVO);
      }
      else
      {
         AV7DEVOC_CONSECUTIVO = httpContext.cgiGet( sPrefix+"AV7DEVOC_CONSECUTIVO_PARM") ;
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
      pa4H2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws4H2( ) ;
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
      ws4H2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7DEVOC_CONSECUTIVO_PARM", AV7DEVOC_CONSECUTIVO);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7DEVOC_CONSECUTIVO)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7DEVOC_CONSECUTIVO_CTRL", GXutil.rtrim( sCtrlAV7DEVOC_CONSECUTIVO));
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
      we4H2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414104196");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("alm_elementoalm_devo_histwc.js", "?201861414104196");
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_122( )
   {
      edtDEVOC_ID_Internalname = sPrefix+"DEVOC_ID_"+sGXsfl_12_idx ;
      edtDEVOC_REGIONAL_Internalname = sPrefix+"DEVOC_REGIONAL_"+sGXsfl_12_idx ;
      edtDEVOC_TRAN_ID_Internalname = sPrefix+"DEVOC_TRAN_ID_"+sGXsfl_12_idx ;
      edtDEVOC_TIPO_MOVIMIENTO_Internalname = sPrefix+"DEVOC_TIPO_MOVIMIENTO_"+sGXsfl_12_idx ;
      edtDEVOC_CODIGO_MOVIMIENTO_Internalname = sPrefix+"DEVOC_CODIGO_MOVIMIENTO_"+sGXsfl_12_idx ;
      edtDEVOC_TRAN_CC_Internalname = sPrefix+"DEVOC_TRAN_CC_"+sGXsfl_12_idx ;
      edtDEVOC_FECHA_MOVIMIENTO_Internalname = sPrefix+"DEVOC_FECHA_MOVIMIENTO_"+sGXsfl_12_idx ;
      edtDEVOC_RENGLON_Internalname = sPrefix+"DEVOC_RENGLON_"+sGXsfl_12_idx ;
      edtDEVOC_PLACA_Internalname = sPrefix+"DEVOC_PLACA_"+sGXsfl_12_idx ;
      edtDEVOC_PLACA_PADRE_Internalname = sPrefix+"DEVOC_PLACA_PADRE_"+sGXsfl_12_idx ;
      edtDEVOC_SERIAL_Internalname = sPrefix+"DEVOC_SERIAL_"+sGXsfl_12_idx ;
      edtDEVOC_MARCA_Internalname = sPrefix+"DEVOC_MARCA_"+sGXsfl_12_idx ;
      edtDEVOC_MARCA2_Internalname = sPrefix+"DEVOC_MARCA2_"+sGXsfl_12_idx ;
      edtDEVOC_MODELO_Internalname = sPrefix+"DEVOC_MODELO_"+sGXsfl_12_idx ;
      edtDEVOC_VIDA_UTIL_Internalname = sPrefix+"DEVOC_VIDA_UTIL_"+sGXsfl_12_idx ;
      edtDEVOC_VALOR_ADQUISICION_Internalname = sPrefix+"DEVOC_VALOR_ADQUISICION_"+sGXsfl_12_idx ;
      edtDEVOC_FECHA_ADQUISICION_Internalname = sPrefix+"DEVOC_FECHA_ADQUISICION_"+sGXsfl_12_idx ;
      cmbDEVOC_ESTADO.setInternalname( sPrefix+"DEVOC_ESTADO_"+sGXsfl_12_idx );
      edtDEVOC_CENTRO_COSTO_ORIGEN_Internalname = sPrefix+"DEVOC_CENTRO_COSTO_ORIGEN_"+sGXsfl_12_idx ;
      edtDEVOC_MODULO_ORIGEN_Internalname = sPrefix+"DEVOC_MODULO_ORIGEN_"+sGXsfl_12_idx ;
      edtDEVOC_ALMA_ORIGEN_Internalname = sPrefix+"DEVOC_ALMA_ORIGEN_"+sGXsfl_12_idx ;
      edtDEVOC_BODEGA_ORIGEN_Internalname = sPrefix+"DEVOC_BODEGA_ORIGEN_"+sGXsfl_12_idx ;
      edtDEVOC_NIT_ORIGEN_Internalname = sPrefix+"DEVOC_NIT_ORIGEN_"+sGXsfl_12_idx ;
      edtDEVOC_REGIONAL_DESTINO_Internalname = sPrefix+"DEVOC_REGIONAL_DESTINO_"+sGXsfl_12_idx ;
      edtDEVOC_CENTRO_COSTO_DESTINO_Internalname = sPrefix+"DEVOC_CENTRO_COSTO_DESTINO_"+sGXsfl_12_idx ;
      edtDEVOC_MODULO_DESTINO_Internalname = sPrefix+"DEVOC_MODULO_DESTINO_"+sGXsfl_12_idx ;
      edtDEVOC_ALMA_DESTINO_Internalname = sPrefix+"DEVOC_ALMA_DESTINO_"+sGXsfl_12_idx ;
      edtDEVOC_BODEGA_DESTINO_Internalname = sPrefix+"DEVOC_BODEGA_DESTINO_"+sGXsfl_12_idx ;
      edtDEVOC_NIT_DESTINO_Internalname = sPrefix+"DEVOC_NIT_DESTINO_"+sGXsfl_12_idx ;
      edtDEVOC_PROVEEDOR_ID_Internalname = sPrefix+"DEVOC_PROVEEDOR_ID_"+sGXsfl_12_idx ;
      edtDEVOC_FECHA_SERVICIO_Internalname = sPrefix+"DEVOC_FECHA_SERVICIO_"+sGXsfl_12_idx ;
      edtDEVOC_ACTA_ENTREGA_Internalname = sPrefix+"DEVOC_ACTA_ENTREGA_"+sGXsfl_12_idx ;
      edtDEVOC_TRAN_OBSERVACIONES_Internalname = sPrefix+"DEVOC_TRAN_OBSERVACIONES_"+sGXsfl_12_idx ;
      edtDEVOC_CURSO_ID_Internalname = sPrefix+"DEVOC_CURSO_ID_"+sGXsfl_12_idx ;
      edtDEVOC_AREADANTE_ID_Internalname = sPrefix+"DEVOC_AREADANTE_ID_"+sGXsfl_12_idx ;
      edtDEVOC_TIPO_INGRESO_Internalname = sPrefix+"DEVOC_TIPO_INGRESO_"+sGXsfl_12_idx ;
      edtDEVOC_NUMERO_INGRESO_Internalname = sPrefix+"DEVOC_NUMERO_INGRESO_"+sGXsfl_12_idx ;
      edtDEVOC_FECHA_INGRESO_Internalname = sPrefix+"DEVOC_FECHA_INGRESO_"+sGXsfl_12_idx ;
   }

   public void subsflControlProps_fel_122( )
   {
      edtDEVOC_ID_Internalname = sPrefix+"DEVOC_ID_"+sGXsfl_12_fel_idx ;
      edtDEVOC_REGIONAL_Internalname = sPrefix+"DEVOC_REGIONAL_"+sGXsfl_12_fel_idx ;
      edtDEVOC_TRAN_ID_Internalname = sPrefix+"DEVOC_TRAN_ID_"+sGXsfl_12_fel_idx ;
      edtDEVOC_TIPO_MOVIMIENTO_Internalname = sPrefix+"DEVOC_TIPO_MOVIMIENTO_"+sGXsfl_12_fel_idx ;
      edtDEVOC_CODIGO_MOVIMIENTO_Internalname = sPrefix+"DEVOC_CODIGO_MOVIMIENTO_"+sGXsfl_12_fel_idx ;
      edtDEVOC_TRAN_CC_Internalname = sPrefix+"DEVOC_TRAN_CC_"+sGXsfl_12_fel_idx ;
      edtDEVOC_FECHA_MOVIMIENTO_Internalname = sPrefix+"DEVOC_FECHA_MOVIMIENTO_"+sGXsfl_12_fel_idx ;
      edtDEVOC_RENGLON_Internalname = sPrefix+"DEVOC_RENGLON_"+sGXsfl_12_fel_idx ;
      edtDEVOC_PLACA_Internalname = sPrefix+"DEVOC_PLACA_"+sGXsfl_12_fel_idx ;
      edtDEVOC_PLACA_PADRE_Internalname = sPrefix+"DEVOC_PLACA_PADRE_"+sGXsfl_12_fel_idx ;
      edtDEVOC_SERIAL_Internalname = sPrefix+"DEVOC_SERIAL_"+sGXsfl_12_fel_idx ;
      edtDEVOC_MARCA_Internalname = sPrefix+"DEVOC_MARCA_"+sGXsfl_12_fel_idx ;
      edtDEVOC_MARCA2_Internalname = sPrefix+"DEVOC_MARCA2_"+sGXsfl_12_fel_idx ;
      edtDEVOC_MODELO_Internalname = sPrefix+"DEVOC_MODELO_"+sGXsfl_12_fel_idx ;
      edtDEVOC_VIDA_UTIL_Internalname = sPrefix+"DEVOC_VIDA_UTIL_"+sGXsfl_12_fel_idx ;
      edtDEVOC_VALOR_ADQUISICION_Internalname = sPrefix+"DEVOC_VALOR_ADQUISICION_"+sGXsfl_12_fel_idx ;
      edtDEVOC_FECHA_ADQUISICION_Internalname = sPrefix+"DEVOC_FECHA_ADQUISICION_"+sGXsfl_12_fel_idx ;
      cmbDEVOC_ESTADO.setInternalname( sPrefix+"DEVOC_ESTADO_"+sGXsfl_12_fel_idx );
      edtDEVOC_CENTRO_COSTO_ORIGEN_Internalname = sPrefix+"DEVOC_CENTRO_COSTO_ORIGEN_"+sGXsfl_12_fel_idx ;
      edtDEVOC_MODULO_ORIGEN_Internalname = sPrefix+"DEVOC_MODULO_ORIGEN_"+sGXsfl_12_fel_idx ;
      edtDEVOC_ALMA_ORIGEN_Internalname = sPrefix+"DEVOC_ALMA_ORIGEN_"+sGXsfl_12_fel_idx ;
      edtDEVOC_BODEGA_ORIGEN_Internalname = sPrefix+"DEVOC_BODEGA_ORIGEN_"+sGXsfl_12_fel_idx ;
      edtDEVOC_NIT_ORIGEN_Internalname = sPrefix+"DEVOC_NIT_ORIGEN_"+sGXsfl_12_fel_idx ;
      edtDEVOC_REGIONAL_DESTINO_Internalname = sPrefix+"DEVOC_REGIONAL_DESTINO_"+sGXsfl_12_fel_idx ;
      edtDEVOC_CENTRO_COSTO_DESTINO_Internalname = sPrefix+"DEVOC_CENTRO_COSTO_DESTINO_"+sGXsfl_12_fel_idx ;
      edtDEVOC_MODULO_DESTINO_Internalname = sPrefix+"DEVOC_MODULO_DESTINO_"+sGXsfl_12_fel_idx ;
      edtDEVOC_ALMA_DESTINO_Internalname = sPrefix+"DEVOC_ALMA_DESTINO_"+sGXsfl_12_fel_idx ;
      edtDEVOC_BODEGA_DESTINO_Internalname = sPrefix+"DEVOC_BODEGA_DESTINO_"+sGXsfl_12_fel_idx ;
      edtDEVOC_NIT_DESTINO_Internalname = sPrefix+"DEVOC_NIT_DESTINO_"+sGXsfl_12_fel_idx ;
      edtDEVOC_PROVEEDOR_ID_Internalname = sPrefix+"DEVOC_PROVEEDOR_ID_"+sGXsfl_12_fel_idx ;
      edtDEVOC_FECHA_SERVICIO_Internalname = sPrefix+"DEVOC_FECHA_SERVICIO_"+sGXsfl_12_fel_idx ;
      edtDEVOC_ACTA_ENTREGA_Internalname = sPrefix+"DEVOC_ACTA_ENTREGA_"+sGXsfl_12_fel_idx ;
      edtDEVOC_TRAN_OBSERVACIONES_Internalname = sPrefix+"DEVOC_TRAN_OBSERVACIONES_"+sGXsfl_12_fel_idx ;
      edtDEVOC_CURSO_ID_Internalname = sPrefix+"DEVOC_CURSO_ID_"+sGXsfl_12_fel_idx ;
      edtDEVOC_AREADANTE_ID_Internalname = sPrefix+"DEVOC_AREADANTE_ID_"+sGXsfl_12_fel_idx ;
      edtDEVOC_TIPO_INGRESO_Internalname = sPrefix+"DEVOC_TIPO_INGRESO_"+sGXsfl_12_fel_idx ;
      edtDEVOC_NUMERO_INGRESO_Internalname = sPrefix+"DEVOC_NUMERO_INGRESO_"+sGXsfl_12_fel_idx ;
      edtDEVOC_FECHA_INGRESO_Internalname = sPrefix+"DEVOC_FECHA_INGRESO_"+sGXsfl_12_fel_idx ;
   }

   public void sendrow_122( )
   {
      subsflControlProps_122( ) ;
      wb4H0( ) ;
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
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_ID_Internalname,GXutil.ltrim( localUtil.ntoc( A95DEVOC_ID, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A95DEVOC_ID), "ZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_ID_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_REGIONAL_Internalname,GXutil.ltrim( localUtil.ntoc( A96DEVOC_REGIONAL, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A96DEVOC_REGIONAL), "ZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_REGIONAL_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_TRAN_ID_Internalname,GXutil.ltrim( localUtil.ntoc( A101DEVOC_TRAN_ID, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A101DEVOC_TRAN_ID), "ZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_TRAN_ID_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_TIPO_MOVIMIENTO_Internalname,A722DEVOC_TIPO_MOVIMIENTO,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_TIPO_MOVIMIENTO_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_CODIGO_MOVIMIENTO_Internalname,A100DEVOC_CODIGO_MOVIMIENTO,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_CODIGO_MOVIMIENTO_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_TRAN_CC_Internalname,GXutil.ltrim( localUtil.ntoc( A723DEVOC_TRAN_CC, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A723DEVOC_TRAN_CC), "ZZZZZZZZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_TRAN_CC_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_FECHA_MOVIMIENTO_Internalname,localUtil.format(A103DEVOC_FECHA_MOVIMIENTO, "99/99/99"),localUtil.format( A103DEVOC_FECHA_MOVIMIENTO, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_FECHA_MOVIMIENTO_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_RENGLON_Internalname,GXutil.ltrim( localUtil.ntoc( A724DEVOC_RENGLON, (byte)(5), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A724DEVOC_RENGLON), "ZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_RENGLON_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(5),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_PLACA_Internalname,A725DEVOC_PLACA,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_PLACA_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_PLACA_PADRE_Internalname,A726DEVOC_PLACA_PADRE,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_PLACA_PADRE_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_SERIAL_Internalname,A727DEVOC_SERIAL,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_SERIAL_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_MARCA_Internalname,A728DEVOC_MARCA,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_MARCA_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_MARCA2_Internalname,A729DEVOC_MARCA2,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_MARCA2_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_MODELO_Internalname,A730DEVOC_MODELO,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_MODELO_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_VIDA_UTIL_Internalname,GXutil.ltrim( localUtil.ntoc( A731DEVOC_VIDA_UTIL, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A731DEVOC_VIDA_UTIL), "ZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_VIDA_UTIL_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_VALOR_ADQUISICION_Internalname,GXutil.ltrim( localUtil.ntoc( A732DEVOC_VALOR_ADQUISICION, (byte)(18), (byte)(2), ",", "")),localUtil.format( A732DEVOC_VALOR_ADQUISICION, "ZZZZZZZZZZZZZZ9.99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_VALOR_ADQUISICION_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_FECHA_ADQUISICION_Internalname,localUtil.format(A733DEVOC_FECHA_ADQUISICION, "99/99/99"),localUtil.format( A733DEVOC_FECHA_ADQUISICION, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_FECHA_ADQUISICION_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_12_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "DEVOC_ESTADO_" + sGXsfl_12_idx ;
            cmbDEVOC_ESTADO.setName( GXCCtl );
            cmbDEVOC_ESTADO.setWebtags( "" );
            if ( cmbDEVOC_ESTADO.getItemCount() > 0 )
            {
               A99DEVOC_ESTADO = cmbDEVOC_ESTADO.getValidValue(A99DEVOC_ESTADO) ;
               n99DEVOC_ESTADO = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbDEVOC_ESTADO,cmbDEVOC_ESTADO.getInternalname(),GXutil.rtrim( A99DEVOC_ESTADO),new Integer(1),cmbDEVOC_ESTADO.getJsonclick(),new Integer(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbDEVOC_ESTADO.setValue( GXutil.rtrim( A99DEVOC_ESTADO) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbDEVOC_ESTADO.getInternalname(), "Values", cmbDEVOC_ESTADO.ToJavascriptSource(), !bGXsfl_12_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_CENTRO_COSTO_ORIGEN_Internalname,GXutil.ltrim( localUtil.ntoc( A97DEVOC_CENTRO_COSTO_ORIGEN, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A97DEVOC_CENTRO_COSTO_ORIGEN), "ZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_CENTRO_COSTO_ORIGEN_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_MODULO_ORIGEN_Internalname,A734DEVOC_MODULO_ORIGEN,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_MODULO_ORIGEN_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_ALMA_ORIGEN_Internalname,A735DEVOC_ALMA_ORIGEN,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_ALMA_ORIGEN_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_BODEGA_ORIGEN_Internalname,A736DEVOC_BODEGA_ORIGEN,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_BODEGA_ORIGEN_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_NIT_ORIGEN_Internalname,GXutil.ltrim( localUtil.ntoc( A98DEVOC_NIT_ORIGEN, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A98DEVOC_NIT_ORIGEN), "ZZZZZZZZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_NIT_ORIGEN_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_REGIONAL_DESTINO_Internalname,GXutil.ltrim( localUtil.ntoc( A737DEVOC_REGIONAL_DESTINO, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A737DEVOC_REGIONAL_DESTINO), "ZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_REGIONAL_DESTINO_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_CENTRO_COSTO_DESTINO_Internalname,GXutil.ltrim( localUtil.ntoc( A738DEVOC_CENTRO_COSTO_DESTINO, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A738DEVOC_CENTRO_COSTO_DESTINO), "ZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_CENTRO_COSTO_DESTINO_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_MODULO_DESTINO_Internalname,A739DEVOC_MODULO_DESTINO,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_MODULO_DESTINO_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_ALMA_DESTINO_Internalname,A740DEVOC_ALMA_DESTINO,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_ALMA_DESTINO_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_BODEGA_DESTINO_Internalname,A741DEVOC_BODEGA_DESTINO,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_BODEGA_DESTINO_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_NIT_DESTINO_Internalname,GXutil.ltrim( localUtil.ntoc( A742DEVOC_NIT_DESTINO, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A742DEVOC_NIT_DESTINO), "ZZZZZZZZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_NIT_DESTINO_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_PROVEEDOR_ID_Internalname,GXutil.ltrim( localUtil.ntoc( A743DEVOC_PROVEEDOR_ID, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A743DEVOC_PROVEEDOR_ID), "ZZZZZZZZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_PROVEEDOR_ID_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_FECHA_SERVICIO_Internalname,localUtil.format(A744DEVOC_FECHA_SERVICIO, "99/99/99"),localUtil.format( A744DEVOC_FECHA_SERVICIO, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_FECHA_SERVICIO_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_ACTA_ENTREGA_Internalname,GXutil.ltrim( localUtil.ntoc( A745DEVOC_ACTA_ENTREGA, (byte)(5), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A745DEVOC_ACTA_ENTREGA), "ZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_ACTA_ENTREGA_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(5),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_TRAN_OBSERVACIONES_Internalname,A748DEVOC_TRAN_OBSERVACIONES,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_TRAN_OBSERVACIONES_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_CURSO_ID_Internalname,A749DEVOC_CURSO_ID,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_CURSO_ID_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(41),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_AREADANTE_ID_Internalname,A750DEVOC_AREADANTE_ID,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_AREADANTE_ID_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(20),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_TIPO_INGRESO_Internalname,GXutil.ltrim( localUtil.ntoc( A751DEVOC_TIPO_INGRESO, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A751DEVOC_TIPO_INGRESO), "ZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_TIPO_INGRESO_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_NUMERO_INGRESO_Internalname,A752DEVOC_NUMERO_INGRESO,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_NUMERO_INGRESO_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_FECHA_INGRESO_Internalname,GXutil.ltrim( localUtil.ntoc( A753DEVOC_FECHA_INGRESO, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A753DEVOC_FECHA_INGRESO), "ZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_FECHA_INGRESO_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(12),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_ID"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, localUtil.format( DecimalUtil.doubleToDec(A95DEVOC_ID), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_REGIONAL"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, localUtil.format( DecimalUtil.doubleToDec(A96DEVOC_REGIONAL), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_TRAN_ID"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, localUtil.format( DecimalUtil.doubleToDec(A101DEVOC_TRAN_ID), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_TIPO_MOVIMIENTO"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, GXutil.rtrim( localUtil.format( A722DEVOC_TIPO_MOVIMIENTO, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_CODIGO_MOVIMIENTO"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, GXutil.rtrim( localUtil.format( A100DEVOC_CODIGO_MOVIMIENTO, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_TRAN_CC"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, localUtil.format( DecimalUtil.doubleToDec(A723DEVOC_TRAN_CC), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_FECHA_MOVIMIENTO"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, A103DEVOC_FECHA_MOVIMIENTO));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_RENGLON"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, localUtil.format( DecimalUtil.doubleToDec(A724DEVOC_RENGLON), "ZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_PLACA"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, GXutil.rtrim( localUtil.format( A725DEVOC_PLACA, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_PLACA_PADRE"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, GXutil.rtrim( localUtil.format( A726DEVOC_PLACA_PADRE, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_SERIAL"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, GXutil.rtrim( localUtil.format( A727DEVOC_SERIAL, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_MARCA"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, GXutil.rtrim( localUtil.format( A728DEVOC_MARCA, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_MARCA2"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, GXutil.rtrim( localUtil.format( A729DEVOC_MARCA2, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_MODELO"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, GXutil.rtrim( localUtil.format( A730DEVOC_MODELO, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_VIDA_UTIL"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, localUtil.format( DecimalUtil.doubleToDec(A731DEVOC_VIDA_UTIL), "ZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_VALOR_ADQUISICION"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, localUtil.format( A732DEVOC_VALOR_ADQUISICION, "ZZZZZZZZZZZZZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_FECHA_ADQUISICION"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, A733DEVOC_FECHA_ADQUISICION));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_ESTADO"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, GXutil.rtrim( localUtil.format( A99DEVOC_ESTADO, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_CENTRO_COSTO_ORIGEN"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, localUtil.format( DecimalUtil.doubleToDec(A97DEVOC_CENTRO_COSTO_ORIGEN), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_MODULO_ORIGEN"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, GXutil.rtrim( localUtil.format( A734DEVOC_MODULO_ORIGEN, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_ALMA_ORIGEN"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, GXutil.rtrim( localUtil.format( A735DEVOC_ALMA_ORIGEN, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_BODEGA_ORIGEN"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, GXutil.rtrim( localUtil.format( A736DEVOC_BODEGA_ORIGEN, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_NIT_ORIGEN"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, localUtil.format( DecimalUtil.doubleToDec(A98DEVOC_NIT_ORIGEN), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_REGIONAL_DESTINO"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, localUtil.format( DecimalUtil.doubleToDec(A737DEVOC_REGIONAL_DESTINO), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_CENTRO_COSTO_DESTINO"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, localUtil.format( DecimalUtil.doubleToDec(A738DEVOC_CENTRO_COSTO_DESTINO), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_MODULO_DESTINO"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, GXutil.rtrim( localUtil.format( A739DEVOC_MODULO_DESTINO, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_ALMA_DESTINO"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, GXutil.rtrim( localUtil.format( A740DEVOC_ALMA_DESTINO, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_BODEGA_DESTINO"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, GXutil.rtrim( localUtil.format( A741DEVOC_BODEGA_DESTINO, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_NIT_DESTINO"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, localUtil.format( DecimalUtil.doubleToDec(A742DEVOC_NIT_DESTINO), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_PROVEEDOR_ID"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, localUtil.format( DecimalUtil.doubleToDec(A743DEVOC_PROVEEDOR_ID), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_FECHA_SERVICIO"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, A744DEVOC_FECHA_SERVICIO));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_ACTA_ENTREGA"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, localUtil.format( DecimalUtil.doubleToDec(A745DEVOC_ACTA_ENTREGA), "ZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_TRAN_OBSERVACIONES"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, GXutil.rtrim( localUtil.format( A748DEVOC_TRAN_OBSERVACIONES, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_CURSO_ID"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, GXutil.rtrim( localUtil.format( A749DEVOC_CURSO_ID, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_AREADANTE_ID"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, GXutil.rtrim( localUtil.format( A750DEVOC_AREADANTE_ID, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_TIPO_INGRESO"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, localUtil.format( DecimalUtil.doubleToDec(A751DEVOC_TIPO_INGRESO), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_NUMERO_INGRESO"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, GXutil.rtrim( localUtil.format( A752DEVOC_NUMERO_INGRESO, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVOC_FECHA_INGRESO"+"_"+sGXsfl_12_idx, getSecureSignedToken( sPrefix+sGXsfl_12_idx, localUtil.format( DecimalUtil.doubleToDec(A753DEVOC_FECHA_INGRESO), "ZZZ9")));
         GridContainer.AddRow(GridRow);
         nGXsfl_12_idx = (short)(((subGrid_Islastpage==1)&&(nGXsfl_12_idx+1>subgrid_recordsperpage( )) ? 1 : nGXsfl_12_idx+1)) ;
         sGXsfl_12_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_12_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_122( ) ;
      }
      /* End function sendrow_122 */
   }

   public void init_default_properties( )
   {
      edtDEVOC_ID_Internalname = sPrefix+"DEVOC_ID" ;
      edtDEVOC_REGIONAL_Internalname = sPrefix+"DEVOC_REGIONAL" ;
      edtDEVOC_TRAN_ID_Internalname = sPrefix+"DEVOC_TRAN_ID" ;
      edtDEVOC_TIPO_MOVIMIENTO_Internalname = sPrefix+"DEVOC_TIPO_MOVIMIENTO" ;
      edtDEVOC_CODIGO_MOVIMIENTO_Internalname = sPrefix+"DEVOC_CODIGO_MOVIMIENTO" ;
      edtDEVOC_TRAN_CC_Internalname = sPrefix+"DEVOC_TRAN_CC" ;
      edtDEVOC_FECHA_MOVIMIENTO_Internalname = sPrefix+"DEVOC_FECHA_MOVIMIENTO" ;
      edtDEVOC_RENGLON_Internalname = sPrefix+"DEVOC_RENGLON" ;
      edtDEVOC_PLACA_Internalname = sPrefix+"DEVOC_PLACA" ;
      edtDEVOC_PLACA_PADRE_Internalname = sPrefix+"DEVOC_PLACA_PADRE" ;
      edtDEVOC_SERIAL_Internalname = sPrefix+"DEVOC_SERIAL" ;
      edtDEVOC_MARCA_Internalname = sPrefix+"DEVOC_MARCA" ;
      edtDEVOC_MARCA2_Internalname = sPrefix+"DEVOC_MARCA2" ;
      edtDEVOC_MODELO_Internalname = sPrefix+"DEVOC_MODELO" ;
      edtDEVOC_VIDA_UTIL_Internalname = sPrefix+"DEVOC_VIDA_UTIL" ;
      edtDEVOC_VALOR_ADQUISICION_Internalname = sPrefix+"DEVOC_VALOR_ADQUISICION" ;
      edtDEVOC_FECHA_ADQUISICION_Internalname = sPrefix+"DEVOC_FECHA_ADQUISICION" ;
      cmbDEVOC_ESTADO.setInternalname( sPrefix+"DEVOC_ESTADO" );
      edtDEVOC_CENTRO_COSTO_ORIGEN_Internalname = sPrefix+"DEVOC_CENTRO_COSTO_ORIGEN" ;
      edtDEVOC_MODULO_ORIGEN_Internalname = sPrefix+"DEVOC_MODULO_ORIGEN" ;
      edtDEVOC_ALMA_ORIGEN_Internalname = sPrefix+"DEVOC_ALMA_ORIGEN" ;
      edtDEVOC_BODEGA_ORIGEN_Internalname = sPrefix+"DEVOC_BODEGA_ORIGEN" ;
      edtDEVOC_NIT_ORIGEN_Internalname = sPrefix+"DEVOC_NIT_ORIGEN" ;
      edtDEVOC_REGIONAL_DESTINO_Internalname = sPrefix+"DEVOC_REGIONAL_DESTINO" ;
      edtDEVOC_CENTRO_COSTO_DESTINO_Internalname = sPrefix+"DEVOC_CENTRO_COSTO_DESTINO" ;
      edtDEVOC_MODULO_DESTINO_Internalname = sPrefix+"DEVOC_MODULO_DESTINO" ;
      edtDEVOC_ALMA_DESTINO_Internalname = sPrefix+"DEVOC_ALMA_DESTINO" ;
      edtDEVOC_BODEGA_DESTINO_Internalname = sPrefix+"DEVOC_BODEGA_DESTINO" ;
      edtDEVOC_NIT_DESTINO_Internalname = sPrefix+"DEVOC_NIT_DESTINO" ;
      edtDEVOC_PROVEEDOR_ID_Internalname = sPrefix+"DEVOC_PROVEEDOR_ID" ;
      edtDEVOC_FECHA_SERVICIO_Internalname = sPrefix+"DEVOC_FECHA_SERVICIO" ;
      edtDEVOC_ACTA_ENTREGA_Internalname = sPrefix+"DEVOC_ACTA_ENTREGA" ;
      edtDEVOC_TRAN_OBSERVACIONES_Internalname = sPrefix+"DEVOC_TRAN_OBSERVACIONES" ;
      edtDEVOC_CURSO_ID_Internalname = sPrefix+"DEVOC_CURSO_ID" ;
      edtDEVOC_AREADANTE_ID_Internalname = sPrefix+"DEVOC_AREADANTE_ID" ;
      edtDEVOC_TIPO_INGRESO_Internalname = sPrefix+"DEVOC_TIPO_INGRESO" ;
      edtDEVOC_NUMERO_INGRESO_Internalname = sPrefix+"DEVOC_NUMERO_INGRESO" ;
      edtDEVOC_FECHA_INGRESO_Internalname = sPrefix+"DEVOC_FECHA_INGRESO" ;
      divGridtable_Internalname = sPrefix+"GRIDTABLE" ;
      divGridcell_Internalname = sPrefix+"GRIDCELL" ;
      edtDEVOC_CONSECUTIVO_Internalname = sPrefix+"DEVOC_CONSECUTIVO" ;
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
      edtDEVOC_FECHA_INGRESO_Jsonclick = "" ;
      edtDEVOC_NUMERO_INGRESO_Jsonclick = "" ;
      edtDEVOC_TIPO_INGRESO_Jsonclick = "" ;
      edtDEVOC_AREADANTE_ID_Jsonclick = "" ;
      edtDEVOC_CURSO_ID_Jsonclick = "" ;
      edtDEVOC_TRAN_OBSERVACIONES_Jsonclick = "" ;
      edtDEVOC_ACTA_ENTREGA_Jsonclick = "" ;
      edtDEVOC_FECHA_SERVICIO_Jsonclick = "" ;
      edtDEVOC_PROVEEDOR_ID_Jsonclick = "" ;
      edtDEVOC_NIT_DESTINO_Jsonclick = "" ;
      edtDEVOC_BODEGA_DESTINO_Jsonclick = "" ;
      edtDEVOC_ALMA_DESTINO_Jsonclick = "" ;
      edtDEVOC_MODULO_DESTINO_Jsonclick = "" ;
      edtDEVOC_CENTRO_COSTO_DESTINO_Jsonclick = "" ;
      edtDEVOC_REGIONAL_DESTINO_Jsonclick = "" ;
      edtDEVOC_NIT_ORIGEN_Jsonclick = "" ;
      edtDEVOC_BODEGA_ORIGEN_Jsonclick = "" ;
      edtDEVOC_ALMA_ORIGEN_Jsonclick = "" ;
      edtDEVOC_MODULO_ORIGEN_Jsonclick = "" ;
      edtDEVOC_CENTRO_COSTO_ORIGEN_Jsonclick = "" ;
      cmbDEVOC_ESTADO.setJsonclick( "" );
      edtDEVOC_FECHA_ADQUISICION_Jsonclick = "" ;
      edtDEVOC_VALOR_ADQUISICION_Jsonclick = "" ;
      edtDEVOC_VIDA_UTIL_Jsonclick = "" ;
      edtDEVOC_MODELO_Jsonclick = "" ;
      edtDEVOC_MARCA2_Jsonclick = "" ;
      edtDEVOC_MARCA_Jsonclick = "" ;
      edtDEVOC_SERIAL_Jsonclick = "" ;
      edtDEVOC_PLACA_PADRE_Jsonclick = "" ;
      edtDEVOC_PLACA_Jsonclick = "" ;
      edtDEVOC_RENGLON_Jsonclick = "" ;
      edtDEVOC_FECHA_MOVIMIENTO_Jsonclick = "" ;
      edtDEVOC_TRAN_CC_Jsonclick = "" ;
      edtDEVOC_CODIGO_MOVIMIENTO_Jsonclick = "" ;
      edtDEVOC_TIPO_MOVIMIENTO_Jsonclick = "" ;
      edtDEVOC_TRAN_ID_Jsonclick = "" ;
      edtDEVOC_REGIONAL_Jsonclick = "" ;
      edtDEVOC_ID_Jsonclick = "" ;
      edtDEVOC_CONSECUTIVO_Jsonclick = "" ;
      edtDEVOC_CONSECUTIVO_Enabled = 0 ;
      edtDEVOC_CONSECUTIVO_Visible = 1 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7DEVOC_CONSECUTIVO',fld:'vDEVOC_CONSECUTIVO',pic:'',nv:''},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e124H2',iparms:[],oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7DEVOC_CONSECUTIVO',fld:'vDEVOC_CONSECUTIVO',pic:'',nv:''},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7DEVOC_CONSECUTIVO',fld:'vDEVOC_CONSECUTIVO',pic:'',nv:''},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7DEVOC_CONSECUTIVO',fld:'vDEVOC_CONSECUTIVO',pic:'',nv:''},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7DEVOC_CONSECUTIVO',fld:'vDEVOC_CONSECUTIVO',pic:'',nv:''},{av:'sPrefix',nv:''}],oparms:[]}");
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
      wcpOAV7DEVOC_CONSECUTIVO = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV7DEVOC_CONSECUTIVO = "" ;
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
      A722DEVOC_TIPO_MOVIMIENTO = "" ;
      A100DEVOC_CODIGO_MOVIMIENTO = "" ;
      A103DEVOC_FECHA_MOVIMIENTO = GXutil.nullDate() ;
      A725DEVOC_PLACA = "" ;
      A726DEVOC_PLACA_PADRE = "" ;
      A727DEVOC_SERIAL = "" ;
      A728DEVOC_MARCA = "" ;
      A729DEVOC_MARCA2 = "" ;
      A730DEVOC_MODELO = "" ;
      A732DEVOC_VALOR_ADQUISICION = DecimalUtil.ZERO ;
      A733DEVOC_FECHA_ADQUISICION = GXutil.nullDate() ;
      A99DEVOC_ESTADO = "" ;
      A734DEVOC_MODULO_ORIGEN = "" ;
      A735DEVOC_ALMA_ORIGEN = "" ;
      A736DEVOC_BODEGA_ORIGEN = "" ;
      A739DEVOC_MODULO_DESTINO = "" ;
      A740DEVOC_ALMA_DESTINO = "" ;
      A741DEVOC_BODEGA_DESTINO = "" ;
      A744DEVOC_FECHA_SERVICIO = GXutil.nullDate() ;
      A748DEVOC_TRAN_OBSERVACIONES = "" ;
      A749DEVOC_CURSO_ID = "" ;
      A750DEVOC_AREADANTE_ID = "" ;
      A752DEVOC_NUMERO_INGRESO = "" ;
      A102DEVOC_CONSECUTIVO = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXCCtl = "" ;
      AV15Pgmname = "" ;
      scmdbuf = "" ;
      H004H2_A102DEVOC_CONSECUTIVO = new String[] {""} ;
      H004H2_n102DEVOC_CONSECUTIVO = new boolean[] {false} ;
      H004H2_A753DEVOC_FECHA_INGRESO = new short[1] ;
      H004H2_n753DEVOC_FECHA_INGRESO = new boolean[] {false} ;
      H004H2_A752DEVOC_NUMERO_INGRESO = new String[] {""} ;
      H004H2_n752DEVOC_NUMERO_INGRESO = new boolean[] {false} ;
      H004H2_A751DEVOC_TIPO_INGRESO = new long[1] ;
      H004H2_n751DEVOC_TIPO_INGRESO = new boolean[] {false} ;
      H004H2_A750DEVOC_AREADANTE_ID = new String[] {""} ;
      H004H2_n750DEVOC_AREADANTE_ID = new boolean[] {false} ;
      H004H2_A749DEVOC_CURSO_ID = new String[] {""} ;
      H004H2_n749DEVOC_CURSO_ID = new boolean[] {false} ;
      H004H2_A748DEVOC_TRAN_OBSERVACIONES = new String[] {""} ;
      H004H2_n748DEVOC_TRAN_OBSERVACIONES = new boolean[] {false} ;
      H004H2_A745DEVOC_ACTA_ENTREGA = new int[1] ;
      H004H2_n745DEVOC_ACTA_ENTREGA = new boolean[] {false} ;
      H004H2_A744DEVOC_FECHA_SERVICIO = new java.util.Date[] {GXutil.nullDate()} ;
      H004H2_n744DEVOC_FECHA_SERVICIO = new boolean[] {false} ;
      H004H2_A743DEVOC_PROVEEDOR_ID = new long[1] ;
      H004H2_n743DEVOC_PROVEEDOR_ID = new boolean[] {false} ;
      H004H2_A742DEVOC_NIT_DESTINO = new long[1] ;
      H004H2_n742DEVOC_NIT_DESTINO = new boolean[] {false} ;
      H004H2_A741DEVOC_BODEGA_DESTINO = new String[] {""} ;
      H004H2_n741DEVOC_BODEGA_DESTINO = new boolean[] {false} ;
      H004H2_A740DEVOC_ALMA_DESTINO = new String[] {""} ;
      H004H2_n740DEVOC_ALMA_DESTINO = new boolean[] {false} ;
      H004H2_A739DEVOC_MODULO_DESTINO = new String[] {""} ;
      H004H2_n739DEVOC_MODULO_DESTINO = new boolean[] {false} ;
      H004H2_A738DEVOC_CENTRO_COSTO_DESTINO = new long[1] ;
      H004H2_n738DEVOC_CENTRO_COSTO_DESTINO = new boolean[] {false} ;
      H004H2_A737DEVOC_REGIONAL_DESTINO = new long[1] ;
      H004H2_n737DEVOC_REGIONAL_DESTINO = new boolean[] {false} ;
      H004H2_A98DEVOC_NIT_ORIGEN = new long[1] ;
      H004H2_n98DEVOC_NIT_ORIGEN = new boolean[] {false} ;
      H004H2_A736DEVOC_BODEGA_ORIGEN = new String[] {""} ;
      H004H2_n736DEVOC_BODEGA_ORIGEN = new boolean[] {false} ;
      H004H2_A735DEVOC_ALMA_ORIGEN = new String[] {""} ;
      H004H2_n735DEVOC_ALMA_ORIGEN = new boolean[] {false} ;
      H004H2_A734DEVOC_MODULO_ORIGEN = new String[] {""} ;
      H004H2_n734DEVOC_MODULO_ORIGEN = new boolean[] {false} ;
      H004H2_A97DEVOC_CENTRO_COSTO_ORIGEN = new long[1] ;
      H004H2_n97DEVOC_CENTRO_COSTO_ORIGEN = new boolean[] {false} ;
      H004H2_A99DEVOC_ESTADO = new String[] {""} ;
      H004H2_n99DEVOC_ESTADO = new boolean[] {false} ;
      H004H2_A733DEVOC_FECHA_ADQUISICION = new java.util.Date[] {GXutil.nullDate()} ;
      H004H2_n733DEVOC_FECHA_ADQUISICION = new boolean[] {false} ;
      H004H2_A732DEVOC_VALOR_ADQUISICION = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H004H2_n732DEVOC_VALOR_ADQUISICION = new boolean[] {false} ;
      H004H2_A731DEVOC_VIDA_UTIL = new short[1] ;
      H004H2_n731DEVOC_VIDA_UTIL = new boolean[] {false} ;
      H004H2_A730DEVOC_MODELO = new String[] {""} ;
      H004H2_n730DEVOC_MODELO = new boolean[] {false} ;
      H004H2_A729DEVOC_MARCA2 = new String[] {""} ;
      H004H2_n729DEVOC_MARCA2 = new boolean[] {false} ;
      H004H2_A728DEVOC_MARCA = new String[] {""} ;
      H004H2_n728DEVOC_MARCA = new boolean[] {false} ;
      H004H2_A727DEVOC_SERIAL = new String[] {""} ;
      H004H2_n727DEVOC_SERIAL = new boolean[] {false} ;
      H004H2_A726DEVOC_PLACA_PADRE = new String[] {""} ;
      H004H2_n726DEVOC_PLACA_PADRE = new boolean[] {false} ;
      H004H2_A725DEVOC_PLACA = new String[] {""} ;
      H004H2_n725DEVOC_PLACA = new boolean[] {false} ;
      H004H2_A724DEVOC_RENGLON = new int[1] ;
      H004H2_n724DEVOC_RENGLON = new boolean[] {false} ;
      H004H2_A103DEVOC_FECHA_MOVIMIENTO = new java.util.Date[] {GXutil.nullDate()} ;
      H004H2_n103DEVOC_FECHA_MOVIMIENTO = new boolean[] {false} ;
      H004H2_A723DEVOC_TRAN_CC = new long[1] ;
      H004H2_n723DEVOC_TRAN_CC = new boolean[] {false} ;
      H004H2_A100DEVOC_CODIGO_MOVIMIENTO = new String[] {""} ;
      H004H2_n100DEVOC_CODIGO_MOVIMIENTO = new boolean[] {false} ;
      H004H2_A722DEVOC_TIPO_MOVIMIENTO = new String[] {""} ;
      H004H2_n722DEVOC_TIPO_MOVIMIENTO = new boolean[] {false} ;
      H004H2_A101DEVOC_TRAN_ID = new long[1] ;
      H004H2_n101DEVOC_TRAN_ID = new boolean[] {false} ;
      H004H2_A96DEVOC_REGIONAL = new long[1] ;
      H004H2_n96DEVOC_REGIONAL = new boolean[] {false} ;
      H004H2_A95DEVOC_ID = new long[1] ;
      H004H3_AGRID_nRecordCount = new long[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV7DEVOC_CONSECUTIVO = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_elementoalm_devo_histwc__default(),
         new Object[] {
             new Object[] {
            H004H2_A102DEVOC_CONSECUTIVO, H004H2_n102DEVOC_CONSECUTIVO, H004H2_A753DEVOC_FECHA_INGRESO, H004H2_n753DEVOC_FECHA_INGRESO, H004H2_A752DEVOC_NUMERO_INGRESO, H004H2_n752DEVOC_NUMERO_INGRESO, H004H2_A751DEVOC_TIPO_INGRESO, H004H2_n751DEVOC_TIPO_INGRESO, H004H2_A750DEVOC_AREADANTE_ID, H004H2_n750DEVOC_AREADANTE_ID,
            H004H2_A749DEVOC_CURSO_ID, H004H2_n749DEVOC_CURSO_ID, H004H2_A748DEVOC_TRAN_OBSERVACIONES, H004H2_n748DEVOC_TRAN_OBSERVACIONES, H004H2_A745DEVOC_ACTA_ENTREGA, H004H2_n745DEVOC_ACTA_ENTREGA, H004H2_A744DEVOC_FECHA_SERVICIO, H004H2_n744DEVOC_FECHA_SERVICIO, H004H2_A743DEVOC_PROVEEDOR_ID, H004H2_n743DEVOC_PROVEEDOR_ID,
            H004H2_A742DEVOC_NIT_DESTINO, H004H2_n742DEVOC_NIT_DESTINO, H004H2_A741DEVOC_BODEGA_DESTINO, H004H2_n741DEVOC_BODEGA_DESTINO, H004H2_A740DEVOC_ALMA_DESTINO, H004H2_n740DEVOC_ALMA_DESTINO, H004H2_A739DEVOC_MODULO_DESTINO, H004H2_n739DEVOC_MODULO_DESTINO, H004H2_A738DEVOC_CENTRO_COSTO_DESTINO, H004H2_n738DEVOC_CENTRO_COSTO_DESTINO,
            H004H2_A737DEVOC_REGIONAL_DESTINO, H004H2_n737DEVOC_REGIONAL_DESTINO, H004H2_A98DEVOC_NIT_ORIGEN, H004H2_n98DEVOC_NIT_ORIGEN, H004H2_A736DEVOC_BODEGA_ORIGEN, H004H2_n736DEVOC_BODEGA_ORIGEN, H004H2_A735DEVOC_ALMA_ORIGEN, H004H2_n735DEVOC_ALMA_ORIGEN, H004H2_A734DEVOC_MODULO_ORIGEN, H004H2_n734DEVOC_MODULO_ORIGEN,
            H004H2_A97DEVOC_CENTRO_COSTO_ORIGEN, H004H2_n97DEVOC_CENTRO_COSTO_ORIGEN, H004H2_A99DEVOC_ESTADO, H004H2_n99DEVOC_ESTADO, H004H2_A733DEVOC_FECHA_ADQUISICION, H004H2_n733DEVOC_FECHA_ADQUISICION, H004H2_A732DEVOC_VALOR_ADQUISICION, H004H2_n732DEVOC_VALOR_ADQUISICION, H004H2_A731DEVOC_VIDA_UTIL, H004H2_n731DEVOC_VIDA_UTIL,
            H004H2_A730DEVOC_MODELO, H004H2_n730DEVOC_MODELO, H004H2_A729DEVOC_MARCA2, H004H2_n729DEVOC_MARCA2, H004H2_A728DEVOC_MARCA, H004H2_n728DEVOC_MARCA, H004H2_A727DEVOC_SERIAL, H004H2_n727DEVOC_SERIAL, H004H2_A726DEVOC_PLACA_PADRE, H004H2_n726DEVOC_PLACA_PADRE,
            H004H2_A725DEVOC_PLACA, H004H2_n725DEVOC_PLACA, H004H2_A724DEVOC_RENGLON, H004H2_n724DEVOC_RENGLON, H004H2_A103DEVOC_FECHA_MOVIMIENTO, H004H2_n103DEVOC_FECHA_MOVIMIENTO, H004H2_A723DEVOC_TRAN_CC, H004H2_n723DEVOC_TRAN_CC, H004H2_A100DEVOC_CODIGO_MOVIMIENTO, H004H2_n100DEVOC_CODIGO_MOVIMIENTO,
            H004H2_A722DEVOC_TIPO_MOVIMIENTO, H004H2_n722DEVOC_TIPO_MOVIMIENTO, H004H2_A101DEVOC_TRAN_ID, H004H2_n101DEVOC_TRAN_ID, H004H2_A96DEVOC_REGIONAL, H004H2_n96DEVOC_REGIONAL, H004H2_A95DEVOC_ID
            }
            , new Object[] {
            H004H3_AGRID_nRecordCount
            }
         }
      );
      AV15Pgmname = "ALM_ELEMENTOALM_DEVO_HISTWC" ;
      /* GeneXus formulas. */
      AV15Pgmname = "ALM_ELEMENTOALM_DEVO_HISTWC" ;
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
   private short A731DEVOC_VIDA_UTIL ;
   private short A753DEVOC_FECHA_INGRESO ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Allbackcolor ;
   private int A724DEVOC_RENGLON ;
   private int A745DEVOC_ACTA_ENTREGA ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int edtDEVOC_CONSECUTIVO_Visible ;
   private int edtDEVOC_CONSECUTIVO_Enabled ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long A95DEVOC_ID ;
   private long A96DEVOC_REGIONAL ;
   private long A101DEVOC_TRAN_ID ;
   private long A723DEVOC_TRAN_CC ;
   private long A97DEVOC_CENTRO_COSTO_ORIGEN ;
   private long A98DEVOC_NIT_ORIGEN ;
   private long A737DEVOC_REGIONAL_DESTINO ;
   private long A738DEVOC_CENTRO_COSTO_DESTINO ;
   private long A742DEVOC_NIT_DESTINO ;
   private long A743DEVOC_PROVEEDOR_ID ;
   private long A751DEVOC_TIPO_INGRESO ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal A732DEVOC_VALOR_ADQUISICION ;
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
   private String edtDEVOC_CONSECUTIVO_Internalname ;
   private String edtDEVOC_CONSECUTIVO_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtDEVOC_ID_Internalname ;
   private String edtDEVOC_REGIONAL_Internalname ;
   private String edtDEVOC_TRAN_ID_Internalname ;
   private String edtDEVOC_TIPO_MOVIMIENTO_Internalname ;
   private String edtDEVOC_CODIGO_MOVIMIENTO_Internalname ;
   private String edtDEVOC_TRAN_CC_Internalname ;
   private String edtDEVOC_FECHA_MOVIMIENTO_Internalname ;
   private String edtDEVOC_RENGLON_Internalname ;
   private String edtDEVOC_PLACA_Internalname ;
   private String edtDEVOC_PLACA_PADRE_Internalname ;
   private String edtDEVOC_SERIAL_Internalname ;
   private String edtDEVOC_MARCA_Internalname ;
   private String edtDEVOC_MARCA2_Internalname ;
   private String edtDEVOC_MODELO_Internalname ;
   private String edtDEVOC_VIDA_UTIL_Internalname ;
   private String edtDEVOC_VALOR_ADQUISICION_Internalname ;
   private String edtDEVOC_FECHA_ADQUISICION_Internalname ;
   private String edtDEVOC_CENTRO_COSTO_ORIGEN_Internalname ;
   private String edtDEVOC_MODULO_ORIGEN_Internalname ;
   private String edtDEVOC_ALMA_ORIGEN_Internalname ;
   private String edtDEVOC_BODEGA_ORIGEN_Internalname ;
   private String edtDEVOC_NIT_ORIGEN_Internalname ;
   private String edtDEVOC_REGIONAL_DESTINO_Internalname ;
   private String edtDEVOC_CENTRO_COSTO_DESTINO_Internalname ;
   private String edtDEVOC_MODULO_DESTINO_Internalname ;
   private String edtDEVOC_ALMA_DESTINO_Internalname ;
   private String edtDEVOC_BODEGA_DESTINO_Internalname ;
   private String edtDEVOC_NIT_DESTINO_Internalname ;
   private String edtDEVOC_PROVEEDOR_ID_Internalname ;
   private String edtDEVOC_FECHA_SERVICIO_Internalname ;
   private String edtDEVOC_ACTA_ENTREGA_Internalname ;
   private String edtDEVOC_TRAN_OBSERVACIONES_Internalname ;
   private String edtDEVOC_CURSO_ID_Internalname ;
   private String edtDEVOC_AREADANTE_ID_Internalname ;
   private String edtDEVOC_TIPO_INGRESO_Internalname ;
   private String edtDEVOC_NUMERO_INGRESO_Internalname ;
   private String edtDEVOC_FECHA_INGRESO_Internalname ;
   private String GXCCtl ;
   private String AV15Pgmname ;
   private String scmdbuf ;
   private String sCtrlAV7DEVOC_CONSECUTIVO ;
   private String sGXsfl_12_fel_idx="0001" ;
   private String ROClassString ;
   private String edtDEVOC_ID_Jsonclick ;
   private String edtDEVOC_REGIONAL_Jsonclick ;
   private String edtDEVOC_TRAN_ID_Jsonclick ;
   private String edtDEVOC_TIPO_MOVIMIENTO_Jsonclick ;
   private String edtDEVOC_CODIGO_MOVIMIENTO_Jsonclick ;
   private String edtDEVOC_TRAN_CC_Jsonclick ;
   private String edtDEVOC_FECHA_MOVIMIENTO_Jsonclick ;
   private String edtDEVOC_RENGLON_Jsonclick ;
   private String edtDEVOC_PLACA_Jsonclick ;
   private String edtDEVOC_PLACA_PADRE_Jsonclick ;
   private String edtDEVOC_SERIAL_Jsonclick ;
   private String edtDEVOC_MARCA_Jsonclick ;
   private String edtDEVOC_MARCA2_Jsonclick ;
   private String edtDEVOC_MODELO_Jsonclick ;
   private String edtDEVOC_VIDA_UTIL_Jsonclick ;
   private String edtDEVOC_VALOR_ADQUISICION_Jsonclick ;
   private String edtDEVOC_FECHA_ADQUISICION_Jsonclick ;
   private String edtDEVOC_CENTRO_COSTO_ORIGEN_Jsonclick ;
   private String edtDEVOC_MODULO_ORIGEN_Jsonclick ;
   private String edtDEVOC_ALMA_ORIGEN_Jsonclick ;
   private String edtDEVOC_BODEGA_ORIGEN_Jsonclick ;
   private String edtDEVOC_NIT_ORIGEN_Jsonclick ;
   private String edtDEVOC_REGIONAL_DESTINO_Jsonclick ;
   private String edtDEVOC_CENTRO_COSTO_DESTINO_Jsonclick ;
   private String edtDEVOC_MODULO_DESTINO_Jsonclick ;
   private String edtDEVOC_ALMA_DESTINO_Jsonclick ;
   private String edtDEVOC_BODEGA_DESTINO_Jsonclick ;
   private String edtDEVOC_NIT_DESTINO_Jsonclick ;
   private String edtDEVOC_PROVEEDOR_ID_Jsonclick ;
   private String edtDEVOC_FECHA_SERVICIO_Jsonclick ;
   private String edtDEVOC_ACTA_ENTREGA_Jsonclick ;
   private String edtDEVOC_TRAN_OBSERVACIONES_Jsonclick ;
   private String edtDEVOC_CURSO_ID_Jsonclick ;
   private String edtDEVOC_AREADANTE_ID_Jsonclick ;
   private String edtDEVOC_TIPO_INGRESO_Jsonclick ;
   private String edtDEVOC_NUMERO_INGRESO_Jsonclick ;
   private String edtDEVOC_FECHA_INGRESO_Jsonclick ;
   private java.util.Date A103DEVOC_FECHA_MOVIMIENTO ;
   private java.util.Date A733DEVOC_FECHA_ADQUISICION ;
   private java.util.Date A744DEVOC_FECHA_SERVICIO ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n96DEVOC_REGIONAL ;
   private boolean n101DEVOC_TRAN_ID ;
   private boolean n722DEVOC_TIPO_MOVIMIENTO ;
   private boolean n100DEVOC_CODIGO_MOVIMIENTO ;
   private boolean n723DEVOC_TRAN_CC ;
   private boolean n103DEVOC_FECHA_MOVIMIENTO ;
   private boolean n724DEVOC_RENGLON ;
   private boolean n725DEVOC_PLACA ;
   private boolean n726DEVOC_PLACA_PADRE ;
   private boolean n727DEVOC_SERIAL ;
   private boolean n728DEVOC_MARCA ;
   private boolean n729DEVOC_MARCA2 ;
   private boolean n730DEVOC_MODELO ;
   private boolean n731DEVOC_VIDA_UTIL ;
   private boolean n732DEVOC_VALOR_ADQUISICION ;
   private boolean n733DEVOC_FECHA_ADQUISICION ;
   private boolean n99DEVOC_ESTADO ;
   private boolean n97DEVOC_CENTRO_COSTO_ORIGEN ;
   private boolean n734DEVOC_MODULO_ORIGEN ;
   private boolean n735DEVOC_ALMA_ORIGEN ;
   private boolean n736DEVOC_BODEGA_ORIGEN ;
   private boolean n98DEVOC_NIT_ORIGEN ;
   private boolean n737DEVOC_REGIONAL_DESTINO ;
   private boolean n738DEVOC_CENTRO_COSTO_DESTINO ;
   private boolean n739DEVOC_MODULO_DESTINO ;
   private boolean n740DEVOC_ALMA_DESTINO ;
   private boolean n741DEVOC_BODEGA_DESTINO ;
   private boolean n742DEVOC_NIT_DESTINO ;
   private boolean n743DEVOC_PROVEEDOR_ID ;
   private boolean n744DEVOC_FECHA_SERVICIO ;
   private boolean n745DEVOC_ACTA_ENTREGA ;
   private boolean n748DEVOC_TRAN_OBSERVACIONES ;
   private boolean n749DEVOC_CURSO_ID ;
   private boolean n750DEVOC_AREADANTE_ID ;
   private boolean n751DEVOC_TIPO_INGRESO ;
   private boolean n752DEVOC_NUMERO_INGRESO ;
   private boolean n753DEVOC_FECHA_INGRESO ;
   private boolean bGXsfl_12_Refreshing=false ;
   private boolean n102DEVOC_CONSECUTIVO ;
   private boolean returnInSub ;
   private String wcpOAV7DEVOC_CONSECUTIVO ;
   private String AV7DEVOC_CONSECUTIVO ;
   private String A722DEVOC_TIPO_MOVIMIENTO ;
   private String A100DEVOC_CODIGO_MOVIMIENTO ;
   private String A725DEVOC_PLACA ;
   private String A726DEVOC_PLACA_PADRE ;
   private String A727DEVOC_SERIAL ;
   private String A728DEVOC_MARCA ;
   private String A729DEVOC_MARCA2 ;
   private String A730DEVOC_MODELO ;
   private String A99DEVOC_ESTADO ;
   private String A734DEVOC_MODULO_ORIGEN ;
   private String A735DEVOC_ALMA_ORIGEN ;
   private String A736DEVOC_BODEGA_ORIGEN ;
   private String A739DEVOC_MODULO_DESTINO ;
   private String A740DEVOC_ALMA_DESTINO ;
   private String A741DEVOC_BODEGA_DESTINO ;
   private String A748DEVOC_TRAN_OBSERVACIONES ;
   private String A749DEVOC_CURSO_ID ;
   private String A750DEVOC_AREADANTE_ID ;
   private String A752DEVOC_NUMERO_INGRESO ;
   private String A102DEVOC_CONSECUTIVO ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private HTMLChoice cmbDEVOC_ESTADO ;
   private IDataStoreProvider pr_default ;
   private String[] H004H2_A102DEVOC_CONSECUTIVO ;
   private boolean[] H004H2_n102DEVOC_CONSECUTIVO ;
   private short[] H004H2_A753DEVOC_FECHA_INGRESO ;
   private boolean[] H004H2_n753DEVOC_FECHA_INGRESO ;
   private String[] H004H2_A752DEVOC_NUMERO_INGRESO ;
   private boolean[] H004H2_n752DEVOC_NUMERO_INGRESO ;
   private long[] H004H2_A751DEVOC_TIPO_INGRESO ;
   private boolean[] H004H2_n751DEVOC_TIPO_INGRESO ;
   private String[] H004H2_A750DEVOC_AREADANTE_ID ;
   private boolean[] H004H2_n750DEVOC_AREADANTE_ID ;
   private String[] H004H2_A749DEVOC_CURSO_ID ;
   private boolean[] H004H2_n749DEVOC_CURSO_ID ;
   private String[] H004H2_A748DEVOC_TRAN_OBSERVACIONES ;
   private boolean[] H004H2_n748DEVOC_TRAN_OBSERVACIONES ;
   private int[] H004H2_A745DEVOC_ACTA_ENTREGA ;
   private boolean[] H004H2_n745DEVOC_ACTA_ENTREGA ;
   private java.util.Date[] H004H2_A744DEVOC_FECHA_SERVICIO ;
   private boolean[] H004H2_n744DEVOC_FECHA_SERVICIO ;
   private long[] H004H2_A743DEVOC_PROVEEDOR_ID ;
   private boolean[] H004H2_n743DEVOC_PROVEEDOR_ID ;
   private long[] H004H2_A742DEVOC_NIT_DESTINO ;
   private boolean[] H004H2_n742DEVOC_NIT_DESTINO ;
   private String[] H004H2_A741DEVOC_BODEGA_DESTINO ;
   private boolean[] H004H2_n741DEVOC_BODEGA_DESTINO ;
   private String[] H004H2_A740DEVOC_ALMA_DESTINO ;
   private boolean[] H004H2_n740DEVOC_ALMA_DESTINO ;
   private String[] H004H2_A739DEVOC_MODULO_DESTINO ;
   private boolean[] H004H2_n739DEVOC_MODULO_DESTINO ;
   private long[] H004H2_A738DEVOC_CENTRO_COSTO_DESTINO ;
   private boolean[] H004H2_n738DEVOC_CENTRO_COSTO_DESTINO ;
   private long[] H004H2_A737DEVOC_REGIONAL_DESTINO ;
   private boolean[] H004H2_n737DEVOC_REGIONAL_DESTINO ;
   private long[] H004H2_A98DEVOC_NIT_ORIGEN ;
   private boolean[] H004H2_n98DEVOC_NIT_ORIGEN ;
   private String[] H004H2_A736DEVOC_BODEGA_ORIGEN ;
   private boolean[] H004H2_n736DEVOC_BODEGA_ORIGEN ;
   private String[] H004H2_A735DEVOC_ALMA_ORIGEN ;
   private boolean[] H004H2_n735DEVOC_ALMA_ORIGEN ;
   private String[] H004H2_A734DEVOC_MODULO_ORIGEN ;
   private boolean[] H004H2_n734DEVOC_MODULO_ORIGEN ;
   private long[] H004H2_A97DEVOC_CENTRO_COSTO_ORIGEN ;
   private boolean[] H004H2_n97DEVOC_CENTRO_COSTO_ORIGEN ;
   private String[] H004H2_A99DEVOC_ESTADO ;
   private boolean[] H004H2_n99DEVOC_ESTADO ;
   private java.util.Date[] H004H2_A733DEVOC_FECHA_ADQUISICION ;
   private boolean[] H004H2_n733DEVOC_FECHA_ADQUISICION ;
   private java.math.BigDecimal[] H004H2_A732DEVOC_VALOR_ADQUISICION ;
   private boolean[] H004H2_n732DEVOC_VALOR_ADQUISICION ;
   private short[] H004H2_A731DEVOC_VIDA_UTIL ;
   private boolean[] H004H2_n731DEVOC_VIDA_UTIL ;
   private String[] H004H2_A730DEVOC_MODELO ;
   private boolean[] H004H2_n730DEVOC_MODELO ;
   private String[] H004H2_A729DEVOC_MARCA2 ;
   private boolean[] H004H2_n729DEVOC_MARCA2 ;
   private String[] H004H2_A728DEVOC_MARCA ;
   private boolean[] H004H2_n728DEVOC_MARCA ;
   private String[] H004H2_A727DEVOC_SERIAL ;
   private boolean[] H004H2_n727DEVOC_SERIAL ;
   private String[] H004H2_A726DEVOC_PLACA_PADRE ;
   private boolean[] H004H2_n726DEVOC_PLACA_PADRE ;
   private String[] H004H2_A725DEVOC_PLACA ;
   private boolean[] H004H2_n725DEVOC_PLACA ;
   private int[] H004H2_A724DEVOC_RENGLON ;
   private boolean[] H004H2_n724DEVOC_RENGLON ;
   private java.util.Date[] H004H2_A103DEVOC_FECHA_MOVIMIENTO ;
   private boolean[] H004H2_n103DEVOC_FECHA_MOVIMIENTO ;
   private long[] H004H2_A723DEVOC_TRAN_CC ;
   private boolean[] H004H2_n723DEVOC_TRAN_CC ;
   private String[] H004H2_A100DEVOC_CODIGO_MOVIMIENTO ;
   private boolean[] H004H2_n100DEVOC_CODIGO_MOVIMIENTO ;
   private String[] H004H2_A722DEVOC_TIPO_MOVIMIENTO ;
   private boolean[] H004H2_n722DEVOC_TIPO_MOVIMIENTO ;
   private long[] H004H2_A101DEVOC_TRAN_ID ;
   private boolean[] H004H2_n101DEVOC_TRAN_ID ;
   private long[] H004H2_A96DEVOC_REGIONAL ;
   private boolean[] H004H2_n96DEVOC_REGIONAL ;
   private long[] H004H2_A95DEVOC_ID ;
   private long[] H004H3_AGRID_nRecordCount ;
}

final  class alm_elementoalm_devo_histwc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H004H2", "SELECT DEVOC_CONSECUTIVO, DEVOC_FECHA_INGRESO, DEVOC_NUMERO_INGRESO, DEVOC_TIPO_INGRESO, DEVOC_AREADANTE_ID, DEVOC_CURSO_ID, DEVOC_TRAN_OBSERVACIONES, DEVOC_ACTA_ENTREGA, DEVOC_FECHA_SERVICIO, DEVOC_PROVEEDOR_ID, DEVOC_NIT_DESTINO, DEVOC_BODEGA_DESTINO, DEVOC_ALMA_DESTINO, DEVOC_MODULO_DESTINO, DEVOC_CENTRO_COSTO_DESTINO, DEVOC_REGIONAL_DESTINO, DEVOC_NIT_ORIGEN, DEVOC_BODEGA_ORIGEN, DEVOC_ALMA_ORIGEN, DEVOC_MODULO_ORIGEN, DEVOC_CENTRO_COSTO_ORIGEN, DEVOC_ESTADO, DEVOC_FECHA_ADQUISICION, DEVOC_VALOR_ADQUISICION, DEVOC_VIDA_UTIL, DEVOC_MODELO, DEVOC_MARCA2, DEVOC_MARCA, DEVOC_SERIAL, DEVOC_PLACA_PADRE, DEVOC_PLACA, DEVOC_RENGLON, DEVOC_FECHA_MOVIMIENTO, DEVOC_TRAN_CC, DEVOC_CODIGO_MOVIMIENTO, DEVOC_TIPO_MOVIMIENTO, DEVOC_TRAN_ID, DEVOC_REGIONAL, DEVOC_ID FROM ALM_DEVO_HIST WHERE DEVOC_CONSECUTIVO = ? ORDER BY DEVOC_CONSECUTIVO  OFFSET ? ROWS FETCH NEXT (CASE WHEN ? > 0 THEN ? ELSE 1e9 END) ROWS ONLY",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H004H3", "SELECT COUNT(*) FROM ALM_DEVO_HIST WHERE DEVOC_CONSECUTIVO = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(9) ;
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
               ((long[]) buf[28])[0] = rslt.getLong(15) ;
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
               ((long[]) buf[40])[0] = rslt.getLong(21) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[44])[0] = rslt.getGXDate(23) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(24,2) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((short[]) buf[48])[0] = rslt.getShort(25) ;
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getVarchar(29) ;
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getVarchar(30) ;
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getVarchar(31) ;
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((int[]) buf[62])[0] = rslt.getInt(32) ;
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[64])[0] = rslt.getGXDate(33) ;
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((long[]) buf[66])[0] = rslt.getLong(34) ;
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((String[]) buf[68])[0] = rslt.getVarchar(35) ;
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getVarchar(36) ;
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((long[]) buf[72])[0] = rslt.getLong(37) ;
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((long[]) buf[74])[0] = rslt.getLong(38) ;
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((long[]) buf[76])[0] = rslt.getLong(39) ;
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

