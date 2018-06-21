/*
               File: gen_ciudadgen_regionalwc_impl
        Description: GEN_CIUDADGEN_REGIONALWC
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:15:45.44
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

public final  class gen_ciudadgen_regionalwc_impl extends GXWebComponent
{
   public gen_ciudadgen_regionalwc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gen_ciudadgen_regionalwc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gen_ciudadgen_regionalwc_impl.class ));
   }

   public gen_ciudadgen_regionalwc_impl( int remoteHandle ,
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
      cmbRegi_Estado = new HTMLChoice();
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
               AV5Ciud_Codigo = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Ciud_Codigo", GXutil.ltrim( GXutil.str( AV5Ciud_Codigo, 4, 0)));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,new Short(AV5Ciud_Codigo)});
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
               AV7Delete = httpContext.GetNextPar( ) ;
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
               AV5Ciud_Codigo = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               AV13Update = httpContext.GetNextPar( ) ;
               edtavUpdate_Tooltiptext = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_20_Refreshing);
               AV7Delete = httpContext.GetNextPar( ) ;
               edtavDelete_Tooltiptext = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "Tooltiptext", edtavDelete_Tooltiptext, !bGXsfl_20_Refreshing);
               A2Regi_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               sPrefix = httpContext.GetNextPar( ) ;
               init_default_properties( ) ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxgrgrid_refresh( subGrid_Rows, AV5Ciud_Codigo, AV13Update, AV7Delete, A2Regi_Id, sPrefix) ;
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
         pa2H2( ) ;
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
         httpContext.writeValue( "GEN_CIUDADGEN_REGIONALWC") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414154553");
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.gen_ciudadgen_regionalwc") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV5Ciud_Codigo,4,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5Ciud_Codigo", GXutil.ltrim( localUtil.ntoc( wcpOAV5Ciud_Codigo, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCIUD_CODIGO", GXutil.ltrim( localUtil.ntoc( AV5Ciud_Codigo, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUPDATE_Tooltiptext", GXutil.rtrim( edtavUpdate_Tooltiptext));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDELETE_Tooltiptext", GXutil.rtrim( edtavDelete_Tooltiptext));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm2H2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("gen_ciudadgen_regionalwc.js", "?201861414154555");
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
      return "GEN_CIUDADGEN_REGIONALWC" ;
   }

   public String getPgmdesc( )
   {
      return "GEN_CIUDADGEN_REGIONALWC" ;
   }

   public void wb2H0( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.gen_ciudadgen_regionalwc");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 20, 2, 0)+","+"null"+");", "Agregar", bttBtninsert_Jsonclick, 5, "Agregar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GEN_CIUDADGEN_REGIONALWC.htm");
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
            httpContext.writeValue( "Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cod") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Et Ct") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Et Co") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Et Cf") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Mes Inicio") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Año Inicio") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Parámetro de vigencia") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Año Activo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Año Calculado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Periodo Contable") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Dirección ") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Nit") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Abreviatura") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tipo Movimiento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cnd Pre") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cnd PTes") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cnd Mon") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Usuario Crea Regional") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha Creación Regional") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Usuario Modifica Regional") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha Modifica Regional") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Graba") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Ultimo Mes") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Ultimo Año") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Padre") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Importar") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Estado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Transaccion") ;
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
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2Regi_Id, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12Regi_Cod, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A144Regi_EtCt, (byte)(2), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A145Regi_EtCo, (byte)(2), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A146Regi_EtCf, (byte)(2), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A147Regi_MesArr, (byte)(2), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A148Regi_AnoArr, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A149Regi_PerAct, (byte)(2), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A150Regi_AnoAct, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A151Regi_AnoCal, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A152Regi_NroPer, (byte)(2), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A13Regi_Descripcion);
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtRegi_Descripcion_Link));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A153Regi_DirCia);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A165Regi_NroRif);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A154Regi_Abrev);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A155Regi_TpMvo, (byte)(2), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A156Regi_CndPre);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A157Regi_CndPTes);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A158Regi_CndMon);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A140Regi_UsuarioCrea);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A141Regi_FechaCrea, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A142Regi_UsuarioModifica);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A143Regi_FechaModifica, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A159Regi_Graba);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A160Regi_MesUlt, (byte)(2), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A161Regi_AnoUlt, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A162Regi_Padre, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A163Regi_Importar);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A164Regi_Estado));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A698Regi_Conse_Tran, (byte)(6), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV13Update));
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtavUpdate_Link));
            GridColumn.AddObjectProperty("Tooltiptext", GXutil.rtrim( edtavUpdate_Tooltiptext));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV7Delete));
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCiud_Codigo_Internalname, "Código Ciudad", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCiud_Codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A5Ciud_Codigo, (byte)(4), (byte)(0), ",", "")), ((edtCiud_Codigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5Ciud_Codigo), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A5Ciud_Codigo), "ZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCiud_Codigo_Jsonclick, 0, "Attribute", "", "", "", edtCiud_Codigo_Visible, edtCiud_Codigo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_CIUDADGEN_REGIONALWC.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start2H2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "GEN_CIUDADGEN_REGIONALWC", (short)(0)) ;
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
            strup2H0( ) ;
         }
      }
   }

   public void ws2H2( )
   {
      start2H2( ) ;
      evt2H2( ) ;
   }

   public void evt2H2( )
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
                              strup2H0( ) ;
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
                              strup2H0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoInsert' */
                                 e112H2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2H0( ) ;
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
                              strup2H0( ) ;
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
                              strup2H0( ) ;
                           }
                           nGXsfl_20_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_20_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_20_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_202( ) ;
                           A2Regi_Id = localUtil.ctol( httpContext.cgiGet( edtRegi_Id_Internalname), ",", ".") ;
                           A12Regi_Cod = (short)(localUtil.ctol( httpContext.cgiGet( edtRegi_Cod_Internalname), ",", ".")) ;
                           A144Regi_EtCt = (byte)(localUtil.ctol( httpContext.cgiGet( edtRegi_EtCt_Internalname), ",", ".")) ;
                           A145Regi_EtCo = (byte)(localUtil.ctol( httpContext.cgiGet( edtRegi_EtCo_Internalname), ",", ".")) ;
                           A146Regi_EtCf = (byte)(localUtil.ctol( httpContext.cgiGet( edtRegi_EtCf_Internalname), ",", ".")) ;
                           A147Regi_MesArr = (byte)(localUtil.ctol( httpContext.cgiGet( edtRegi_MesArr_Internalname), ",", ".")) ;
                           A148Regi_AnoArr = (short)(localUtil.ctol( httpContext.cgiGet( edtRegi_AnoArr_Internalname), ",", ".")) ;
                           A149Regi_PerAct = (byte)(localUtil.ctol( httpContext.cgiGet( edtRegi_PerAct_Internalname), ",", ".")) ;
                           A150Regi_AnoAct = (short)(localUtil.ctol( httpContext.cgiGet( edtRegi_AnoAct_Internalname), ",", ".")) ;
                           A151Regi_AnoCal = (short)(localUtil.ctol( httpContext.cgiGet( edtRegi_AnoCal_Internalname), ",", ".")) ;
                           A152Regi_NroPer = (byte)(localUtil.ctol( httpContext.cgiGet( edtRegi_NroPer_Internalname), ",", ".")) ;
                           A13Regi_Descripcion = httpContext.cgiGet( edtRegi_Descripcion_Internalname) ;
                           A153Regi_DirCia = httpContext.cgiGet( edtRegi_DirCia_Internalname) ;
                           A165Regi_NroRif = httpContext.cgiGet( edtRegi_NroRif_Internalname) ;
                           A154Regi_Abrev = httpContext.cgiGet( edtRegi_Abrev_Internalname) ;
                           A155Regi_TpMvo = (byte)(localUtil.ctol( httpContext.cgiGet( edtRegi_TpMvo_Internalname), ",", ".")) ;
                           A156Regi_CndPre = httpContext.cgiGet( edtRegi_CndPre_Internalname) ;
                           A157Regi_CndPTes = httpContext.cgiGet( edtRegi_CndPTes_Internalname) ;
                           A158Regi_CndMon = httpContext.cgiGet( edtRegi_CndMon_Internalname) ;
                           A140Regi_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtRegi_UsuarioCrea_Internalname)) ;
                           A141Regi_FechaCrea = localUtil.ctot( httpContext.cgiGet( edtRegi_FechaCrea_Internalname), 0) ;
                           A142Regi_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtRegi_UsuarioModifica_Internalname)) ;
                           A143Regi_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtRegi_FechaModifica_Internalname), 0) ;
                           A159Regi_Graba = httpContext.cgiGet( edtRegi_Graba_Internalname) ;
                           A160Regi_MesUlt = (byte)(localUtil.ctol( httpContext.cgiGet( edtRegi_MesUlt_Internalname), ",", ".")) ;
                           A161Regi_AnoUlt = (short)(localUtil.ctol( httpContext.cgiGet( edtRegi_AnoUlt_Internalname), ",", ".")) ;
                           A162Regi_Padre = (short)(localUtil.ctol( httpContext.cgiGet( edtRegi_Padre_Internalname), ",", ".")) ;
                           A163Regi_Importar = httpContext.cgiGet( edtRegi_Importar_Internalname) ;
                           cmbRegi_Estado.setName( cmbRegi_Estado.getInternalname() );
                           cmbRegi_Estado.setValue( httpContext.cgiGet( cmbRegi_Estado.getInternalname()) );
                           A164Regi_Estado = httpContext.cgiGet( cmbRegi_Estado.getInternalname()) ;
                           A698Regi_Conse_Tran = (int)(localUtil.ctol( httpContext.cgiGet( edtRegi_Conse_Tran_Internalname), ",", ".")) ;
                           AV13Update = httpContext.cgiGet( edtavUpdate_Internalname) ;
                           httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV13Update)==0) ? AV18Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV13Update))), !bGXsfl_20_Refreshing);
                           httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV13Update), true);
                           AV7Delete = httpContext.cgiGet( edtavDelete_Internalname) ;
                           httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "Bitmap", ((GXutil.strcmp("", AV7Delete)==0) ? AV19Delete_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV7Delete))), !bGXsfl_20_Refreshing);
                           httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV7Delete), true);
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
                                       e122H2 ();
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
                                       e132H2 ();
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
                                    strup2H0( ) ;
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

   public void we2H2( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2H2( ) ;
         }
      }
   }

   public void pa2H2( )
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
         GXCCtl = "REGI_ESTADO_" + sGXsfl_20_idx ;
         cmbRegi_Estado.setName( GXCCtl );
         cmbRegi_Estado.setWebtags( "" );
         cmbRegi_Estado.addItem("A", "Activo", (short)(0));
         cmbRegi_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbRegi_Estado.getItemCount() > 0 )
         {
            A164Regi_Estado = cmbRegi_Estado.getValidValue(A164Regi_Estado) ;
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
                                 short AV5Ciud_Codigo ,
                                 String AV13Update ,
                                 String AV7Delete ,
                                 long A2Regi_Id ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid_Rows = subGrid_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID_nCurrentRecord = 0 ;
      rf2H2( ) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_ID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A2Regi_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"REGI_ID", GXutil.ltrim( localUtil.ntoc( A2Regi_Id, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_COD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A12Regi_Cod), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"REGI_COD", GXutil.ltrim( localUtil.ntoc( A12Regi_Cod, (byte)(4), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_ETCT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A144Regi_EtCt), "Z9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"REGI_ETCT", GXutil.ltrim( localUtil.ntoc( A144Regi_EtCt, (byte)(2), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_ETCO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A145Regi_EtCo), "Z9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"REGI_ETCO", GXutil.ltrim( localUtil.ntoc( A145Regi_EtCo, (byte)(2), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_ETCF", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A146Regi_EtCf), "Z9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"REGI_ETCF", GXutil.ltrim( localUtil.ntoc( A146Regi_EtCf, (byte)(2), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_MESARR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A147Regi_MesArr), "Z9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"REGI_MESARR", GXutil.ltrim( localUtil.ntoc( A147Regi_MesArr, (byte)(2), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_ANOARR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A148Regi_AnoArr), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"REGI_ANOARR", GXutil.ltrim( localUtil.ntoc( A148Regi_AnoArr, (byte)(4), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_PERACT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A149Regi_PerAct), "Z9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"REGI_PERACT", GXutil.ltrim( localUtil.ntoc( A149Regi_PerAct, (byte)(2), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_ANOACT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A150Regi_AnoAct), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"REGI_ANOACT", GXutil.ltrim( localUtil.ntoc( A150Regi_AnoAct, (byte)(4), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_ANOCAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A151Regi_AnoCal), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"REGI_ANOCAL", GXutil.ltrim( localUtil.ntoc( A151Regi_AnoCal, (byte)(4), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_NROPER", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A152Regi_NroPer), "Z9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"REGI_NROPER", GXutil.ltrim( localUtil.ntoc( A152Regi_NroPer, (byte)(2), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_DIRCIA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A153Regi_DirCia, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"REGI_DIRCIA", A153Regi_DirCia);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_NRORIF", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A165Regi_NroRif, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"REGI_NRORIF", A165Regi_NroRif);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_ABREV", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A154Regi_Abrev, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"REGI_ABREV", A154Regi_Abrev);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_TPMVO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A155Regi_TpMvo), "Z9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"REGI_TPMVO", GXutil.ltrim( localUtil.ntoc( A155Regi_TpMvo, (byte)(2), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_CNDPRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A156Regi_CndPre, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"REGI_CNDPRE", A156Regi_CndPre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_CNDPTES", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A157Regi_CndPTes, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"REGI_CNDPTES", A157Regi_CndPTes);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_CNDMON", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A158Regi_CndMon, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"REGI_CNDMON", A158Regi_CndMon);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A140Regi_UsuarioCrea, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"REGI_USUARIOCREA", A140Regi_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A141Regi_FechaCrea, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"REGI_FECHACREA", localUtil.ttoc( A141Regi_FechaCrea, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A142Regi_UsuarioModifica, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"REGI_USUARIOMODIFICA", A142Regi_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A143Regi_FechaModifica, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"REGI_FECHAMODIFICA", localUtil.ttoc( A143Regi_FechaModifica, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_GRABA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A159Regi_Graba, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"REGI_GRABA", A159Regi_Graba);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_MESULT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A160Regi_MesUlt), "Z9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"REGI_MESULT", GXutil.ltrim( localUtil.ntoc( A160Regi_MesUlt, (byte)(2), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_ANOULT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A161Regi_AnoUlt), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"REGI_ANOULT", GXutil.ltrim( localUtil.ntoc( A161Regi_AnoUlt, (byte)(4), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_PADRE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A162Regi_Padre), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"REGI_PADRE", GXutil.ltrim( localUtil.ntoc( A162Regi_Padre, (byte)(4), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_IMPORTAR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A163Regi_Importar, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"REGI_IMPORTAR", A163Regi_Importar);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A164Regi_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"REGI_ESTADO", GXutil.rtrim( A164Regi_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_CONSE_TRAN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A698Regi_Conse_Tran), "ZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"REGI_CONSE_TRAN", GXutil.ltrim( localUtil.ntoc( A698Regi_Conse_Tran, (byte)(6), (byte)(0), ".", "")));
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2H2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV17Pgmname = "GEN_CIUDADGEN_REGIONALWC" ;
      Gx_err = (short)(0) ;
   }

   public void rf2H2( )
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
         /* Using cursor H002H2 */
         pr_default.execute(0, new Object[] {new Short(AV5Ciud_Codigo), new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_20_idx = (short)(1) ;
         sGXsfl_20_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_20_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_202( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_recordsperpage( ) ) ) ) )
         {
            A5Ciud_Codigo = H002H2_A5Ciud_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
            A698Regi_Conse_Tran = H002H2_A698Regi_Conse_Tran[0] ;
            A164Regi_Estado = H002H2_A164Regi_Estado[0] ;
            A163Regi_Importar = H002H2_A163Regi_Importar[0] ;
            A162Regi_Padre = H002H2_A162Regi_Padre[0] ;
            A161Regi_AnoUlt = H002H2_A161Regi_AnoUlt[0] ;
            A160Regi_MesUlt = H002H2_A160Regi_MesUlt[0] ;
            A159Regi_Graba = H002H2_A159Regi_Graba[0] ;
            A143Regi_FechaModifica = H002H2_A143Regi_FechaModifica[0] ;
            A142Regi_UsuarioModifica = H002H2_A142Regi_UsuarioModifica[0] ;
            A141Regi_FechaCrea = H002H2_A141Regi_FechaCrea[0] ;
            A140Regi_UsuarioCrea = H002H2_A140Regi_UsuarioCrea[0] ;
            A158Regi_CndMon = H002H2_A158Regi_CndMon[0] ;
            A157Regi_CndPTes = H002H2_A157Regi_CndPTes[0] ;
            A156Regi_CndPre = H002H2_A156Regi_CndPre[0] ;
            A155Regi_TpMvo = H002H2_A155Regi_TpMvo[0] ;
            A154Regi_Abrev = H002H2_A154Regi_Abrev[0] ;
            A165Regi_NroRif = H002H2_A165Regi_NroRif[0] ;
            A153Regi_DirCia = H002H2_A153Regi_DirCia[0] ;
            A13Regi_Descripcion = H002H2_A13Regi_Descripcion[0] ;
            A152Regi_NroPer = H002H2_A152Regi_NroPer[0] ;
            A151Regi_AnoCal = H002H2_A151Regi_AnoCal[0] ;
            A150Regi_AnoAct = H002H2_A150Regi_AnoAct[0] ;
            A149Regi_PerAct = H002H2_A149Regi_PerAct[0] ;
            A148Regi_AnoArr = H002H2_A148Regi_AnoArr[0] ;
            A147Regi_MesArr = H002H2_A147Regi_MesArr[0] ;
            A146Regi_EtCf = H002H2_A146Regi_EtCf[0] ;
            A145Regi_EtCo = H002H2_A145Regi_EtCo[0] ;
            A144Regi_EtCt = H002H2_A144Regi_EtCt[0] ;
            A12Regi_Cod = H002H2_A12Regi_Cod[0] ;
            A2Regi_Id = H002H2_A2Regi_Id[0] ;
            e132H2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(20) ;
         wb2H0( ) ;
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
      /* Using cursor H002H3 */
      pr_default.execute(1, new Object[] {new Short(AV5Ciud_Codigo)});
      GRID_nRecordCount = H002H3_AGRID_nRecordCount[0] ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Ciud_Codigo, AV13Update, AV7Delete, A2Regi_Id, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Ciud_Codigo, AV13Update, AV7Delete, A2Regi_Id, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Ciud_Codigo, AV13Update, AV7Delete, A2Regi_Id, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Ciud_Codigo, AV13Update, AV7Delete, A2Regi_Id, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Ciud_Codigo, AV13Update, AV7Delete, A2Regi_Id, sPrefix) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup2H0( )
   {
      /* Before Start, stand alone formulas. */
      AV17Pgmname = "GEN_CIUDADGEN_REGIONALWC" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e122H2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A5Ciud_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( edtCiud_Codigo_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
         /* Read saved values. */
         nRC_GXsfl_20 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_20"), ",", ".")) ;
         wcpOAV5Ciud_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV5Ciud_Codigo"), ",", ".")) ;
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
      e122H2 ();
      if (returnInSub) return;
   }

   public void e122H2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV17Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV17Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      subGrid_Rows = 10 ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV13Update = context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV13Update)==0) ? AV18Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV13Update))), !bGXsfl_20_Refreshing);
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV13Update), true);
      AV18Update_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV13Update)==0) ? AV18Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV13Update))), !bGXsfl_20_Refreshing);
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV13Update), true);
      edtavUpdate_Tooltiptext = "Modificar" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_20_Refreshing);
      AV7Delete = context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "Bitmap", ((GXutil.strcmp("", AV7Delete)==0) ? AV19Delete_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV7Delete))), !bGXsfl_20_Refreshing);
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV7Delete), true);
      AV19Delete_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "Bitmap", ((GXutil.strcmp("", AV7Delete)==0) ? AV19Delete_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV7Delete))), !bGXsfl_20_Refreshing);
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV7Delete), true);
      edtavDelete_Tooltiptext = "Eliminar" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "Tooltiptext", edtavDelete_Tooltiptext, !bGXsfl_20_Refreshing);
      edtCiud_Codigo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCiud_Codigo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtCiud_Codigo_Visible, 5, 0)), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
   }

   private void e132H2( )
   {
      /* Grid_Load Routine */
      edtavUpdate_Link = formatLink("com.orions2.gen_regional") + "?" + GXutil.URLEncode(GXutil.rtrim("UPD")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A2Regi_Id,11,0))) ;
      edtavDelete_Link = formatLink("com.orions2.gen_regional") + "?" + GXutil.URLEncode(GXutil.rtrim("DLT")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A2Regi_Id,11,0))) ;
      edtRegi_Descripcion_Link = formatLink("com.orions2.viewgen_regional") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A2Regi_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
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

   public void e112H2( )
   {
      /* 'DoInsert' Routine */
      callWebObject(formatLink("com.orions2.gen_regional") + "?" + GXutil.URLEncode(GXutil.rtrim("INS")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))));
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV11TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV17Pgmname );
      AV11TrnContext.setgxTv_SdtTransactionContext_Callerondelete( true );
      AV11TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV8HTTPRequest.getScriptName()+"?"+AV8HTTPRequest.getQuerystring() );
      AV11TrnContext.setgxTv_SdtTransactionContext_Transactionname( "GEN_REGIONAL" );
      AV12TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV12TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Ciud_Codigo" );
      AV12TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV5Ciud_Codigo, 4, 0) );
      AV11TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV12TrnContextAtt, 0);
      AV10Session.setValue("TrnContext", AV11TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      AV5Ciud_Codigo = ((Number) GXutil.testNumericType( getParm(obj,0,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Ciud_Codigo", GXutil.ltrim( GXutil.str( AV5Ciud_Codigo, 4, 0)));
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
      pa2H2( ) ;
      ws2H2( ) ;
      we2H2( ) ;
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
      sCtrlAV5Ciud_Codigo = (String)getParm(obj,0,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2H2( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "gen_ciudadgen_regionalwc");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa2H2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5Ciud_Codigo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Ciud_Codigo", GXutil.ltrim( GXutil.str( AV5Ciud_Codigo, 4, 0)));
      }
      wcpOAV5Ciud_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV5Ciud_Codigo"), ",", ".")) ;
      if ( ! GetJustCreated( ) && ( ( AV5Ciud_Codigo != wcpOAV5Ciud_Codigo ) ) )
      {
         setjustcreated();
      }
      wcpOAV5Ciud_Codigo = AV5Ciud_Codigo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV5Ciud_Codigo = httpContext.cgiGet( sPrefix+"AV5Ciud_Codigo_CTRL") ;
      if ( GXutil.len( sCtrlAV5Ciud_Codigo) > 0 )
      {
         AV5Ciud_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV5Ciud_Codigo), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Ciud_Codigo", GXutil.ltrim( GXutil.str( AV5Ciud_Codigo, 4, 0)));
      }
      else
      {
         AV5Ciud_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV5Ciud_Codigo_PARM"), ",", ".")) ;
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
      pa2H2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2H2( ) ;
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
      ws2H2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Ciud_Codigo_PARM", GXutil.ltrim( localUtil.ntoc( AV5Ciud_Codigo, (byte)(4), (byte)(0), ",", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5Ciud_Codigo)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Ciud_Codigo_CTRL", GXutil.rtrim( sCtrlAV5Ciud_Codigo));
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
      we2H2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414154653");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("gen_ciudadgen_regionalwc.js", "?201861414154653");
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_202( )
   {
      edtRegi_Id_Internalname = sPrefix+"REGI_ID_"+sGXsfl_20_idx ;
      edtRegi_Cod_Internalname = sPrefix+"REGI_COD_"+sGXsfl_20_idx ;
      edtRegi_EtCt_Internalname = sPrefix+"REGI_ETCT_"+sGXsfl_20_idx ;
      edtRegi_EtCo_Internalname = sPrefix+"REGI_ETCO_"+sGXsfl_20_idx ;
      edtRegi_EtCf_Internalname = sPrefix+"REGI_ETCF_"+sGXsfl_20_idx ;
      edtRegi_MesArr_Internalname = sPrefix+"REGI_MESARR_"+sGXsfl_20_idx ;
      edtRegi_AnoArr_Internalname = sPrefix+"REGI_ANOARR_"+sGXsfl_20_idx ;
      edtRegi_PerAct_Internalname = sPrefix+"REGI_PERACT_"+sGXsfl_20_idx ;
      edtRegi_AnoAct_Internalname = sPrefix+"REGI_ANOACT_"+sGXsfl_20_idx ;
      edtRegi_AnoCal_Internalname = sPrefix+"REGI_ANOCAL_"+sGXsfl_20_idx ;
      edtRegi_NroPer_Internalname = sPrefix+"REGI_NROPER_"+sGXsfl_20_idx ;
      edtRegi_Descripcion_Internalname = sPrefix+"REGI_DESCRIPCION_"+sGXsfl_20_idx ;
      edtRegi_DirCia_Internalname = sPrefix+"REGI_DIRCIA_"+sGXsfl_20_idx ;
      edtRegi_NroRif_Internalname = sPrefix+"REGI_NRORIF_"+sGXsfl_20_idx ;
      edtRegi_Abrev_Internalname = sPrefix+"REGI_ABREV_"+sGXsfl_20_idx ;
      edtRegi_TpMvo_Internalname = sPrefix+"REGI_TPMVO_"+sGXsfl_20_idx ;
      edtRegi_CndPre_Internalname = sPrefix+"REGI_CNDPRE_"+sGXsfl_20_idx ;
      edtRegi_CndPTes_Internalname = sPrefix+"REGI_CNDPTES_"+sGXsfl_20_idx ;
      edtRegi_CndMon_Internalname = sPrefix+"REGI_CNDMON_"+sGXsfl_20_idx ;
      edtRegi_UsuarioCrea_Internalname = sPrefix+"REGI_USUARIOCREA_"+sGXsfl_20_idx ;
      edtRegi_FechaCrea_Internalname = sPrefix+"REGI_FECHACREA_"+sGXsfl_20_idx ;
      edtRegi_UsuarioModifica_Internalname = sPrefix+"REGI_USUARIOMODIFICA_"+sGXsfl_20_idx ;
      edtRegi_FechaModifica_Internalname = sPrefix+"REGI_FECHAMODIFICA_"+sGXsfl_20_idx ;
      edtRegi_Graba_Internalname = sPrefix+"REGI_GRABA_"+sGXsfl_20_idx ;
      edtRegi_MesUlt_Internalname = sPrefix+"REGI_MESULT_"+sGXsfl_20_idx ;
      edtRegi_AnoUlt_Internalname = sPrefix+"REGI_ANOULT_"+sGXsfl_20_idx ;
      edtRegi_Padre_Internalname = sPrefix+"REGI_PADRE_"+sGXsfl_20_idx ;
      edtRegi_Importar_Internalname = sPrefix+"REGI_IMPORTAR_"+sGXsfl_20_idx ;
      cmbRegi_Estado.setInternalname( sPrefix+"REGI_ESTADO_"+sGXsfl_20_idx );
      edtRegi_Conse_Tran_Internalname = sPrefix+"REGI_CONSE_TRAN_"+sGXsfl_20_idx ;
      edtavUpdate_Internalname = sPrefix+"vUPDATE_"+sGXsfl_20_idx ;
      edtavDelete_Internalname = sPrefix+"vDELETE_"+sGXsfl_20_idx ;
   }

   public void subsflControlProps_fel_202( )
   {
      edtRegi_Id_Internalname = sPrefix+"REGI_ID_"+sGXsfl_20_fel_idx ;
      edtRegi_Cod_Internalname = sPrefix+"REGI_COD_"+sGXsfl_20_fel_idx ;
      edtRegi_EtCt_Internalname = sPrefix+"REGI_ETCT_"+sGXsfl_20_fel_idx ;
      edtRegi_EtCo_Internalname = sPrefix+"REGI_ETCO_"+sGXsfl_20_fel_idx ;
      edtRegi_EtCf_Internalname = sPrefix+"REGI_ETCF_"+sGXsfl_20_fel_idx ;
      edtRegi_MesArr_Internalname = sPrefix+"REGI_MESARR_"+sGXsfl_20_fel_idx ;
      edtRegi_AnoArr_Internalname = sPrefix+"REGI_ANOARR_"+sGXsfl_20_fel_idx ;
      edtRegi_PerAct_Internalname = sPrefix+"REGI_PERACT_"+sGXsfl_20_fel_idx ;
      edtRegi_AnoAct_Internalname = sPrefix+"REGI_ANOACT_"+sGXsfl_20_fel_idx ;
      edtRegi_AnoCal_Internalname = sPrefix+"REGI_ANOCAL_"+sGXsfl_20_fel_idx ;
      edtRegi_NroPer_Internalname = sPrefix+"REGI_NROPER_"+sGXsfl_20_fel_idx ;
      edtRegi_Descripcion_Internalname = sPrefix+"REGI_DESCRIPCION_"+sGXsfl_20_fel_idx ;
      edtRegi_DirCia_Internalname = sPrefix+"REGI_DIRCIA_"+sGXsfl_20_fel_idx ;
      edtRegi_NroRif_Internalname = sPrefix+"REGI_NRORIF_"+sGXsfl_20_fel_idx ;
      edtRegi_Abrev_Internalname = sPrefix+"REGI_ABREV_"+sGXsfl_20_fel_idx ;
      edtRegi_TpMvo_Internalname = sPrefix+"REGI_TPMVO_"+sGXsfl_20_fel_idx ;
      edtRegi_CndPre_Internalname = sPrefix+"REGI_CNDPRE_"+sGXsfl_20_fel_idx ;
      edtRegi_CndPTes_Internalname = sPrefix+"REGI_CNDPTES_"+sGXsfl_20_fel_idx ;
      edtRegi_CndMon_Internalname = sPrefix+"REGI_CNDMON_"+sGXsfl_20_fel_idx ;
      edtRegi_UsuarioCrea_Internalname = sPrefix+"REGI_USUARIOCREA_"+sGXsfl_20_fel_idx ;
      edtRegi_FechaCrea_Internalname = sPrefix+"REGI_FECHACREA_"+sGXsfl_20_fel_idx ;
      edtRegi_UsuarioModifica_Internalname = sPrefix+"REGI_USUARIOMODIFICA_"+sGXsfl_20_fel_idx ;
      edtRegi_FechaModifica_Internalname = sPrefix+"REGI_FECHAMODIFICA_"+sGXsfl_20_fel_idx ;
      edtRegi_Graba_Internalname = sPrefix+"REGI_GRABA_"+sGXsfl_20_fel_idx ;
      edtRegi_MesUlt_Internalname = sPrefix+"REGI_MESULT_"+sGXsfl_20_fel_idx ;
      edtRegi_AnoUlt_Internalname = sPrefix+"REGI_ANOULT_"+sGXsfl_20_fel_idx ;
      edtRegi_Padre_Internalname = sPrefix+"REGI_PADRE_"+sGXsfl_20_fel_idx ;
      edtRegi_Importar_Internalname = sPrefix+"REGI_IMPORTAR_"+sGXsfl_20_fel_idx ;
      cmbRegi_Estado.setInternalname( sPrefix+"REGI_ESTADO_"+sGXsfl_20_fel_idx );
      edtRegi_Conse_Tran_Internalname = sPrefix+"REGI_CONSE_TRAN_"+sGXsfl_20_fel_idx ;
      edtavUpdate_Internalname = sPrefix+"vUPDATE_"+sGXsfl_20_fel_idx ;
      edtavDelete_Internalname = sPrefix+"vDELETE_"+sGXsfl_20_fel_idx ;
   }

   public void sendrow_202( )
   {
      subsflControlProps_202( ) ;
      wb2H0( ) ;
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
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_Id_Internalname,GXutil.ltrim( localUtil.ntoc( A2Regi_Id, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A2Regi_Id), "ZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRegi_Id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_Cod_Internalname,GXutil.ltrim( localUtil.ntoc( A12Regi_Cod, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A12Regi_Cod), "ZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRegi_Cod_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_EtCt_Internalname,GXutil.ltrim( localUtil.ntoc( A144Regi_EtCt, (byte)(2), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A144Regi_EtCt), "Z9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRegi_EtCt_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_EtCo_Internalname,GXutil.ltrim( localUtil.ntoc( A145Regi_EtCo, (byte)(2), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A145Regi_EtCo), "Z9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRegi_EtCo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_EtCf_Internalname,GXutil.ltrim( localUtil.ntoc( A146Regi_EtCf, (byte)(2), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A146Regi_EtCf), "Z9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRegi_EtCf_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_MesArr_Internalname,GXutil.ltrim( localUtil.ntoc( A147Regi_MesArr, (byte)(2), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A147Regi_MesArr), "Z9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRegi_MesArr_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_AnoArr_Internalname,GXutil.ltrim( localUtil.ntoc( A148Regi_AnoArr, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A148Regi_AnoArr), "ZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRegi_AnoArr_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_PerAct_Internalname,GXutil.ltrim( localUtil.ntoc( A149Regi_PerAct, (byte)(2), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A149Regi_PerAct), "Z9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRegi_PerAct_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_AnoAct_Internalname,GXutil.ltrim( localUtil.ntoc( A150Regi_AnoAct, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A150Regi_AnoAct), "ZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRegi_AnoAct_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_AnoCal_Internalname,GXutil.ltrim( localUtil.ntoc( A151Regi_AnoCal, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A151Regi_AnoCal), "ZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRegi_AnoCal_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_NroPer_Internalname,GXutil.ltrim( localUtil.ntoc( A152Regi_NroPer, (byte)(2), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A152Regi_NroPer), "Z9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRegi_NroPer_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_Descripcion_Internalname,A13Regi_Descripcion,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'",edtRegi_Descripcion_Link,"","","",edtRegi_Descripcion_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_DirCia_Internalname,A153Regi_DirCia,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","http://maps.google.com/maps?q="+PrivateUtilities.encodeURL( A153Regi_DirCia),"_blank","","",edtRegi_DirCia_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1024),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"GeneXus\\Address","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_NroRif_Internalname,A165Regi_NroRif,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRegi_NroRif_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(15),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_Abrev_Internalname,A154Regi_Abrev,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRegi_Abrev_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(15),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_TpMvo_Internalname,GXutil.ltrim( localUtil.ntoc( A155Regi_TpMvo, (byte)(2), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A155Regi_TpMvo), "Z9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRegi_TpMvo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_CndPre_Internalname,A156Regi_CndPre,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRegi_CndPre_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_CndPTes_Internalname,A157Regi_CndPTes,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRegi_CndPTes_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_CndMon_Internalname,A158Regi_CndMon,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRegi_CndMon_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_UsuarioCrea_Internalname,A140Regi_UsuarioCrea,GXutil.rtrim( localUtil.format( A140Regi_UsuarioCrea, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRegi_UsuarioCrea_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_FechaCrea_Internalname,localUtil.ttoc( A141Regi_FechaCrea, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A141Regi_FechaCrea, "99/99/99 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRegi_FechaCrea_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_UsuarioModifica_Internalname,A142Regi_UsuarioModifica,GXutil.rtrim( localUtil.format( A142Regi_UsuarioModifica, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRegi_UsuarioModifica_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_FechaModifica_Internalname,localUtil.ttoc( A143Regi_FechaModifica, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A143Regi_FechaModifica, "99/99/99 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRegi_FechaModifica_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_Graba_Internalname,A159Regi_Graba,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRegi_Graba_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_MesUlt_Internalname,GXutil.ltrim( localUtil.ntoc( A160Regi_MesUlt, (byte)(2), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A160Regi_MesUlt), "Z9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRegi_MesUlt_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_AnoUlt_Internalname,GXutil.ltrim( localUtil.ntoc( A161Regi_AnoUlt, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A161Regi_AnoUlt), "ZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRegi_AnoUlt_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_Padre_Internalname,GXutil.ltrim( localUtil.ntoc( A162Regi_Padre, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A162Regi_Padre), "ZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRegi_Padre_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_Importar_Internalname,A163Regi_Importar,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRegi_Importar_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_20_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "REGI_ESTADO_" + sGXsfl_20_idx ;
            cmbRegi_Estado.setName( GXCCtl );
            cmbRegi_Estado.setWebtags( "" );
            cmbRegi_Estado.addItem("A", "Activo", (short)(0));
            cmbRegi_Estado.addItem("I", "Inactivo", (short)(0));
            if ( cmbRegi_Estado.getItemCount() > 0 )
            {
               A164Regi_Estado = cmbRegi_Estado.getValidValue(A164Regi_Estado) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbRegi_Estado,cmbRegi_Estado.getInternalname(),GXutil.rtrim( A164Regi_Estado),new Integer(1),cmbRegi_Estado.getJsonclick(),new Integer(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbRegi_Estado.setValue( GXutil.rtrim( A164Regi_Estado) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbRegi_Estado.getInternalname(), "Values", cmbRegi_Estado.ToJavascriptSource(), !bGXsfl_20_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_Conse_Tran_Internalname,GXutil.ltrim( localUtil.ntoc( A698Regi_Conse_Tran, (byte)(6), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A698Regi_Conse_Tran), "ZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRegi_Conse_Tran_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(6),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         ClassString = "UpdateAttribute" ;
         StyleString = "" ;
         AV13Update_IsBlob = (boolean)(((GXutil.strcmp("", AV13Update)==0)&&(GXutil.strcmp("", AV18Update_GXI)==0))||!(GXutil.strcmp("", AV13Update)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV13Update)==0) ? AV18Update_GXI : httpContext.getResourceRelative(AV13Update)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavUpdate_Internalname,sImgUrl,edtavUpdate_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"",edtavUpdate_Tooltiptext,new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV13Update_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         ClassString = "DeleteAttribute" ;
         StyleString = "" ;
         AV7Delete_IsBlob = (boolean)(((GXutil.strcmp("", AV7Delete)==0)&&(GXutil.strcmp("", AV19Delete_GXI)==0))||!(GXutil.strcmp("", AV7Delete)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV7Delete)==0) ? AV19Delete_GXI : httpContext.getResourceRelative(AV7Delete)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavDelete_Internalname,sImgUrl,edtavDelete_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"",edtavDelete_Tooltiptext,new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV7Delete_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_ID"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A2Regi_Id), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_COD"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A12Regi_Cod), "ZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_ETCT"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A144Regi_EtCt), "Z9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_ETCO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A145Regi_EtCo), "Z9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_ETCF"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A146Regi_EtCf), "Z9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_MESARR"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A147Regi_MesArr), "Z9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_ANOARR"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A148Regi_AnoArr), "ZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_PERACT"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A149Regi_PerAct), "Z9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_ANOACT"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A150Regi_AnoAct), "ZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_ANOCAL"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A151Regi_AnoCal), "ZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_NROPER"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A152Regi_NroPer), "Z9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_DIRCIA"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A153Regi_DirCia, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_NRORIF"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A165Regi_NroRif, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_ABREV"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A154Regi_Abrev, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_TPMVO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A155Regi_TpMvo), "Z9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_CNDPRE"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A156Regi_CndPre, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_CNDPTES"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A157Regi_CndPTes, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_CNDMON"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A158Regi_CndMon, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_USUARIOCREA"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A140Regi_UsuarioCrea, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_FECHACREA"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( A141Regi_FechaCrea, "99/99/99 99:99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_USUARIOMODIFICA"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A142Regi_UsuarioModifica, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_FECHAMODIFICA"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( A143Regi_FechaModifica, "99/99/99 99:99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_GRABA"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A159Regi_Graba, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_MESULT"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A160Regi_MesUlt), "Z9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_ANOULT"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A161Regi_AnoUlt), "ZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_PADRE"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A162Regi_Padre), "ZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_IMPORTAR"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A163Regi_Importar, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_ESTADO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A164Regi_Estado, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_CONSE_TRAN"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A698Regi_Conse_Tran), "ZZZZZ9")));
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
      edtRegi_Id_Internalname = sPrefix+"REGI_ID" ;
      edtRegi_Cod_Internalname = sPrefix+"REGI_COD" ;
      edtRegi_EtCt_Internalname = sPrefix+"REGI_ETCT" ;
      edtRegi_EtCo_Internalname = sPrefix+"REGI_ETCO" ;
      edtRegi_EtCf_Internalname = sPrefix+"REGI_ETCF" ;
      edtRegi_MesArr_Internalname = sPrefix+"REGI_MESARR" ;
      edtRegi_AnoArr_Internalname = sPrefix+"REGI_ANOARR" ;
      edtRegi_PerAct_Internalname = sPrefix+"REGI_PERACT" ;
      edtRegi_AnoAct_Internalname = sPrefix+"REGI_ANOACT" ;
      edtRegi_AnoCal_Internalname = sPrefix+"REGI_ANOCAL" ;
      edtRegi_NroPer_Internalname = sPrefix+"REGI_NROPER" ;
      edtRegi_Descripcion_Internalname = sPrefix+"REGI_DESCRIPCION" ;
      edtRegi_DirCia_Internalname = sPrefix+"REGI_DIRCIA" ;
      edtRegi_NroRif_Internalname = sPrefix+"REGI_NRORIF" ;
      edtRegi_Abrev_Internalname = sPrefix+"REGI_ABREV" ;
      edtRegi_TpMvo_Internalname = sPrefix+"REGI_TPMVO" ;
      edtRegi_CndPre_Internalname = sPrefix+"REGI_CNDPRE" ;
      edtRegi_CndPTes_Internalname = sPrefix+"REGI_CNDPTES" ;
      edtRegi_CndMon_Internalname = sPrefix+"REGI_CNDMON" ;
      edtRegi_UsuarioCrea_Internalname = sPrefix+"REGI_USUARIOCREA" ;
      edtRegi_FechaCrea_Internalname = sPrefix+"REGI_FECHACREA" ;
      edtRegi_UsuarioModifica_Internalname = sPrefix+"REGI_USUARIOMODIFICA" ;
      edtRegi_FechaModifica_Internalname = sPrefix+"REGI_FECHAMODIFICA" ;
      edtRegi_Graba_Internalname = sPrefix+"REGI_GRABA" ;
      edtRegi_MesUlt_Internalname = sPrefix+"REGI_MESULT" ;
      edtRegi_AnoUlt_Internalname = sPrefix+"REGI_ANOULT" ;
      edtRegi_Padre_Internalname = sPrefix+"REGI_PADRE" ;
      edtRegi_Importar_Internalname = sPrefix+"REGI_IMPORTAR" ;
      cmbRegi_Estado.setInternalname( sPrefix+"REGI_ESTADO" );
      edtRegi_Conse_Tran_Internalname = sPrefix+"REGI_CONSE_TRAN" ;
      edtavUpdate_Internalname = sPrefix+"vUPDATE" ;
      edtavDelete_Internalname = sPrefix+"vDELETE" ;
      divGridtable_Internalname = sPrefix+"GRIDTABLE" ;
      divGridcell_Internalname = sPrefix+"GRIDCELL" ;
      edtCiud_Codigo_Internalname = sPrefix+"CIUD_CODIGO" ;
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
      edtRegi_Conse_Tran_Jsonclick = "" ;
      cmbRegi_Estado.setJsonclick( "" );
      edtRegi_Importar_Jsonclick = "" ;
      edtRegi_Padre_Jsonclick = "" ;
      edtRegi_AnoUlt_Jsonclick = "" ;
      edtRegi_MesUlt_Jsonclick = "" ;
      edtRegi_Graba_Jsonclick = "" ;
      edtRegi_FechaModifica_Jsonclick = "" ;
      edtRegi_UsuarioModifica_Jsonclick = "" ;
      edtRegi_FechaCrea_Jsonclick = "" ;
      edtRegi_UsuarioCrea_Jsonclick = "" ;
      edtRegi_CndMon_Jsonclick = "" ;
      edtRegi_CndPTes_Jsonclick = "" ;
      edtRegi_CndPre_Jsonclick = "" ;
      edtRegi_TpMvo_Jsonclick = "" ;
      edtRegi_Abrev_Jsonclick = "" ;
      edtRegi_NroRif_Jsonclick = "" ;
      edtRegi_DirCia_Jsonclick = "" ;
      edtRegi_Descripcion_Jsonclick = "" ;
      edtRegi_NroPer_Jsonclick = "" ;
      edtRegi_AnoCal_Jsonclick = "" ;
      edtRegi_AnoAct_Jsonclick = "" ;
      edtRegi_PerAct_Jsonclick = "" ;
      edtRegi_AnoArr_Jsonclick = "" ;
      edtRegi_MesArr_Jsonclick = "" ;
      edtRegi_EtCf_Jsonclick = "" ;
      edtRegi_EtCo_Jsonclick = "" ;
      edtRegi_EtCt_Jsonclick = "" ;
      edtRegi_Cod_Jsonclick = "" ;
      edtRegi_Id_Jsonclick = "" ;
      edtCiud_Codigo_Jsonclick = "" ;
      edtCiud_Codigo_Enabled = 0 ;
      edtCiud_Codigo_Visible = 1 ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      edtavDelete_Link = "" ;
      edtavUpdate_Link = "" ;
      edtRegi_Descripcion_Link = "" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV5Ciud_Codigo',fld:'vCIUD_CODIGO',pic:'ZZZ9',nv:0},{av:'AV13Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV7Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A2Regi_Id',fld:'REGI_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e132H2',iparms:[{av:'A2Regi_Id',fld:'REGI_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[{av:'edtavUpdate_Link',ctrl:'vUPDATE',prop:'Link'},{av:'edtavDelete_Link',ctrl:'vDELETE',prop:'Link'},{av:'edtRegi_Descripcion_Link',ctrl:'REGI_DESCRIPCION',prop:'Link'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e112H2',iparms:[{av:'A2Regi_Id',fld:'REGI_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV5Ciud_Codigo',fld:'vCIUD_CODIGO',pic:'ZZZ9',nv:0},{av:'AV13Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV7Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A2Regi_Id',fld:'REGI_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV5Ciud_Codigo',fld:'vCIUD_CODIGO',pic:'ZZZ9',nv:0},{av:'AV13Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV7Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A2Regi_Id',fld:'REGI_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV5Ciud_Codigo',fld:'vCIUD_CODIGO',pic:'ZZZ9',nv:0},{av:'AV13Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV7Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A2Regi_Id',fld:'REGI_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV5Ciud_Codigo',fld:'vCIUD_CODIGO',pic:'ZZZ9',nv:0},{av:'AV13Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV7Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A2Regi_Id',fld:'REGI_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
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
      AV13Update = "" ;
      AV7Delete = "" ;
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
      A13Regi_Descripcion = "" ;
      A153Regi_DirCia = "" ;
      A165Regi_NroRif = "" ;
      A154Regi_Abrev = "" ;
      A156Regi_CndPre = "" ;
      A157Regi_CndPTes = "" ;
      A158Regi_CndMon = "" ;
      A140Regi_UsuarioCrea = "" ;
      A141Regi_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A142Regi_UsuarioModifica = "" ;
      A143Regi_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      A159Regi_Graba = "" ;
      A163Regi_Importar = "" ;
      A164Regi_Estado = "" ;
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
      H002H2_A5Ciud_Codigo = new short[1] ;
      H002H2_A698Regi_Conse_Tran = new int[1] ;
      H002H2_A164Regi_Estado = new String[] {""} ;
      H002H2_A163Regi_Importar = new String[] {""} ;
      H002H2_A162Regi_Padre = new short[1] ;
      H002H2_A161Regi_AnoUlt = new short[1] ;
      H002H2_A160Regi_MesUlt = new byte[1] ;
      H002H2_A159Regi_Graba = new String[] {""} ;
      H002H2_A143Regi_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H002H2_A142Regi_UsuarioModifica = new String[] {""} ;
      H002H2_A141Regi_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      H002H2_A140Regi_UsuarioCrea = new String[] {""} ;
      H002H2_A158Regi_CndMon = new String[] {""} ;
      H002H2_A157Regi_CndPTes = new String[] {""} ;
      H002H2_A156Regi_CndPre = new String[] {""} ;
      H002H2_A155Regi_TpMvo = new byte[1] ;
      H002H2_A154Regi_Abrev = new String[] {""} ;
      H002H2_A165Regi_NroRif = new String[] {""} ;
      H002H2_A153Regi_DirCia = new String[] {""} ;
      H002H2_A13Regi_Descripcion = new String[] {""} ;
      H002H2_A152Regi_NroPer = new byte[1] ;
      H002H2_A151Regi_AnoCal = new short[1] ;
      H002H2_A150Regi_AnoAct = new short[1] ;
      H002H2_A149Regi_PerAct = new byte[1] ;
      H002H2_A148Regi_AnoArr = new short[1] ;
      H002H2_A147Regi_MesArr = new byte[1] ;
      H002H2_A146Regi_EtCf = new byte[1] ;
      H002H2_A145Regi_EtCo = new byte[1] ;
      H002H2_A144Regi_EtCt = new byte[1] ;
      H002H2_A12Regi_Cod = new short[1] ;
      H002H2_A2Regi_Id = new long[1] ;
      H002H3_AGRID_nRecordCount = new long[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV11TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV8HTTPRequest = httpContext.getHttpRequest();
      AV12TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV10Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5Ciud_Codigo = "" ;
      ROClassString = "" ;
      sImgUrl = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.gen_ciudadgen_regionalwc__default(),
         new Object[] {
             new Object[] {
            H002H2_A5Ciud_Codigo, H002H2_A698Regi_Conse_Tran, H002H2_A164Regi_Estado, H002H2_A163Regi_Importar, H002H2_A162Regi_Padre, H002H2_A161Regi_AnoUlt, H002H2_A160Regi_MesUlt, H002H2_A159Regi_Graba, H002H2_A143Regi_FechaModifica, H002H2_A142Regi_UsuarioModifica,
            H002H2_A141Regi_FechaCrea, H002H2_A140Regi_UsuarioCrea, H002H2_A158Regi_CndMon, H002H2_A157Regi_CndPTes, H002H2_A156Regi_CndPre, H002H2_A155Regi_TpMvo, H002H2_A154Regi_Abrev, H002H2_A165Regi_NroRif, H002H2_A153Regi_DirCia, H002H2_A13Regi_Descripcion,
            H002H2_A152Regi_NroPer, H002H2_A151Regi_AnoCal, H002H2_A150Regi_AnoAct, H002H2_A149Regi_PerAct, H002H2_A148Regi_AnoArr, H002H2_A147Regi_MesArr, H002H2_A146Regi_EtCf, H002H2_A145Regi_EtCo, H002H2_A144Regi_EtCt, H002H2_A12Regi_Cod,
            H002H2_A2Regi_Id
            }
            , new Object[] {
            H002H3_AGRID_nRecordCount
            }
         }
      );
      AV17Pgmname = "GEN_CIUDADGEN_REGIONALWC" ;
      /* GeneXus formulas. */
      AV17Pgmname = "GEN_CIUDADGEN_REGIONALWC" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nGXWrapped ;
   private byte GRID_nEOF ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte A144Regi_EtCt ;
   private byte A145Regi_EtCo ;
   private byte A146Regi_EtCf ;
   private byte A147Regi_MesArr ;
   private byte A149Regi_PerAct ;
   private byte A152Regi_NroPer ;
   private byte A155Regi_TpMvo ;
   private byte A160Regi_MesUlt ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backstyle ;
   private short wcpOAV5Ciud_Codigo ;
   private short AV5Ciud_Codigo ;
   private short nRC_GXsfl_20 ;
   private short nGXsfl_20_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short A12Regi_Cod ;
   private short A148Regi_AnoArr ;
   private short A150Regi_AnoAct ;
   private short A151Regi_AnoCal ;
   private short A161Regi_AnoUlt ;
   private short A162Regi_Padre ;
   private short A5Ciud_Codigo ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Allbackcolor ;
   private int A698Regi_Conse_Tran ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int edtCiud_Codigo_Enabled ;
   private int edtCiud_Codigo_Visible ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private long A2Regi_Id ;
   private long GRID_nFirstRecordOnPage ;
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
   private String edtRegi_Descripcion_Link ;
   private String A164Regi_Estado ;
   private String edtavUpdate_Link ;
   private String edtavDelete_Link ;
   private String edtCiud_Codigo_Internalname ;
   private String edtCiud_Codigo_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtRegi_Id_Internalname ;
   private String edtRegi_Cod_Internalname ;
   private String edtRegi_EtCt_Internalname ;
   private String edtRegi_EtCo_Internalname ;
   private String edtRegi_EtCf_Internalname ;
   private String edtRegi_MesArr_Internalname ;
   private String edtRegi_AnoArr_Internalname ;
   private String edtRegi_PerAct_Internalname ;
   private String edtRegi_AnoAct_Internalname ;
   private String edtRegi_AnoCal_Internalname ;
   private String edtRegi_NroPer_Internalname ;
   private String edtRegi_Descripcion_Internalname ;
   private String edtRegi_DirCia_Internalname ;
   private String edtRegi_NroRif_Internalname ;
   private String edtRegi_Abrev_Internalname ;
   private String edtRegi_TpMvo_Internalname ;
   private String edtRegi_CndPre_Internalname ;
   private String edtRegi_CndPTes_Internalname ;
   private String edtRegi_CndMon_Internalname ;
   private String edtRegi_UsuarioCrea_Internalname ;
   private String edtRegi_FechaCrea_Internalname ;
   private String edtRegi_UsuarioModifica_Internalname ;
   private String edtRegi_FechaModifica_Internalname ;
   private String edtRegi_Graba_Internalname ;
   private String edtRegi_MesUlt_Internalname ;
   private String edtRegi_AnoUlt_Internalname ;
   private String edtRegi_Padre_Internalname ;
   private String edtRegi_Importar_Internalname ;
   private String edtRegi_Conse_Tran_Internalname ;
   private String GXCCtl ;
   private String AV17Pgmname ;
   private String scmdbuf ;
   private String sCtrlAV5Ciud_Codigo ;
   private String sGXsfl_20_fel_idx="0001" ;
   private String ROClassString ;
   private String edtRegi_Id_Jsonclick ;
   private String edtRegi_Cod_Jsonclick ;
   private String edtRegi_EtCt_Jsonclick ;
   private String edtRegi_EtCo_Jsonclick ;
   private String edtRegi_EtCf_Jsonclick ;
   private String edtRegi_MesArr_Jsonclick ;
   private String edtRegi_AnoArr_Jsonclick ;
   private String edtRegi_PerAct_Jsonclick ;
   private String edtRegi_AnoAct_Jsonclick ;
   private String edtRegi_AnoCal_Jsonclick ;
   private String edtRegi_NroPer_Jsonclick ;
   private String edtRegi_Descripcion_Jsonclick ;
   private String edtRegi_DirCia_Jsonclick ;
   private String edtRegi_NroRif_Jsonclick ;
   private String edtRegi_Abrev_Jsonclick ;
   private String edtRegi_TpMvo_Jsonclick ;
   private String edtRegi_CndPre_Jsonclick ;
   private String edtRegi_CndPTes_Jsonclick ;
   private String edtRegi_CndMon_Jsonclick ;
   private String edtRegi_UsuarioCrea_Jsonclick ;
   private String edtRegi_FechaCrea_Jsonclick ;
   private String edtRegi_UsuarioModifica_Jsonclick ;
   private String edtRegi_FechaModifica_Jsonclick ;
   private String edtRegi_Graba_Jsonclick ;
   private String edtRegi_MesUlt_Jsonclick ;
   private String edtRegi_AnoUlt_Jsonclick ;
   private String edtRegi_Padre_Jsonclick ;
   private String edtRegi_Importar_Jsonclick ;
   private String edtRegi_Conse_Tran_Jsonclick ;
   private String sImgUrl ;
   private java.util.Date A141Regi_FechaCrea ;
   private java.util.Date A143Regi_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean bGXsfl_20_Refreshing=false ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean AV13Update_IsBlob ;
   private boolean AV7Delete_IsBlob ;
   private String A13Regi_Descripcion ;
   private String A153Regi_DirCia ;
   private String A165Regi_NroRif ;
   private String A154Regi_Abrev ;
   private String A156Regi_CndPre ;
   private String A157Regi_CndPTes ;
   private String A158Regi_CndMon ;
   private String A140Regi_UsuarioCrea ;
   private String A142Regi_UsuarioModifica ;
   private String A159Regi_Graba ;
   private String A163Regi_Importar ;
   private String AV18Update_GXI ;
   private String AV19Delete_GXI ;
   private String AV13Update ;
   private String AV7Delete ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV8HTTPRequest ;
   private HTMLChoice cmbRegi_Estado ;
   private IDataStoreProvider pr_default ;
   private short[] H002H2_A5Ciud_Codigo ;
   private int[] H002H2_A698Regi_Conse_Tran ;
   private String[] H002H2_A164Regi_Estado ;
   private String[] H002H2_A163Regi_Importar ;
   private short[] H002H2_A162Regi_Padre ;
   private short[] H002H2_A161Regi_AnoUlt ;
   private byte[] H002H2_A160Regi_MesUlt ;
   private String[] H002H2_A159Regi_Graba ;
   private java.util.Date[] H002H2_A143Regi_FechaModifica ;
   private String[] H002H2_A142Regi_UsuarioModifica ;
   private java.util.Date[] H002H2_A141Regi_FechaCrea ;
   private String[] H002H2_A140Regi_UsuarioCrea ;
   private String[] H002H2_A158Regi_CndMon ;
   private String[] H002H2_A157Regi_CndPTes ;
   private String[] H002H2_A156Regi_CndPre ;
   private byte[] H002H2_A155Regi_TpMvo ;
   private String[] H002H2_A154Regi_Abrev ;
   private String[] H002H2_A165Regi_NroRif ;
   private String[] H002H2_A153Regi_DirCia ;
   private String[] H002H2_A13Regi_Descripcion ;
   private byte[] H002H2_A152Regi_NroPer ;
   private short[] H002H2_A151Regi_AnoCal ;
   private short[] H002H2_A150Regi_AnoAct ;
   private byte[] H002H2_A149Regi_PerAct ;
   private short[] H002H2_A148Regi_AnoArr ;
   private byte[] H002H2_A147Regi_MesArr ;
   private byte[] H002H2_A146Regi_EtCf ;
   private byte[] H002H2_A145Regi_EtCo ;
   private byte[] H002H2_A144Regi_EtCt ;
   private short[] H002H2_A12Regi_Cod ;
   private long[] H002H2_A2Regi_Id ;
   private long[] H002H3_AGRID_nRecordCount ;
   private com.genexus.webpanels.WebSession AV10Session ;
   private com.orions2.SdtTransactionContext AV11TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV12TrnContextAtt ;
}

final  class gen_ciudadgen_regionalwc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H002H2", "SELECT Ciud_Codigo, Regi_Conse_Tran, Regi_Estado, Regi_Importar, Regi_Padre, Regi_AnoUlt, Regi_MesUlt, Regi_Graba, Regi_FechaModifica, Regi_UsuarioModifica, Regi_FechaCrea, Regi_UsuarioCrea, Regi_CndMon, Regi_CndPTes, Regi_CndPre, Regi_TpMvo, Regi_Abrev, Regi_NroRif, Regi_DirCia, Regi_Descripcion, Regi_NroPer, Regi_AnoCal, Regi_AnoAct, Regi_PerAct, Regi_AnoArr, Regi_MesArr, Regi_EtCf, Regi_EtCo, Regi_EtCt, Regi_Cod, Regi_Id FROM GEN_REGIONAL WHERE Ciud_Codigo = ? ORDER BY Ciud_Codigo  OFFSET ? ROWS FETCH NEXT (CASE WHEN ? > 0 THEN ? ELSE 1e9 END) ROWS ONLY",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H002H3", "SELECT COUNT(*) FROM GEN_REGIONAL WHERE Ciud_Codigo = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 1) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((byte[]) buf[6])[0] = rslt.getByte(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(11) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(12) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(14) ;
               ((String[]) buf[14])[0] = rslt.getVarchar(15) ;
               ((byte[]) buf[15])[0] = rslt.getByte(16) ;
               ((String[]) buf[16])[0] = rslt.getVarchar(17) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(18) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(19) ;
               ((String[]) buf[19])[0] = rslt.getVarchar(20) ;
               ((byte[]) buf[20])[0] = rslt.getByte(21) ;
               ((short[]) buf[21])[0] = rslt.getShort(22) ;
               ((short[]) buf[22])[0] = rslt.getShort(23) ;
               ((byte[]) buf[23])[0] = rslt.getByte(24) ;
               ((short[]) buf[24])[0] = rslt.getShort(25) ;
               ((byte[]) buf[25])[0] = rslt.getByte(26) ;
               ((byte[]) buf[26])[0] = rslt.getByte(27) ;
               ((byte[]) buf[27])[0] = rslt.getByte(28) ;
               ((byte[]) buf[28])[0] = rslt.getByte(29) ;
               ((short[]) buf[29])[0] = rslt.getShort(30) ;
               ((long[]) buf[30])[0] = rslt.getLong(31) ;
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
      }
   }

}

