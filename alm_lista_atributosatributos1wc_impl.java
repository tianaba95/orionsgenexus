/*
               File: alm_lista_atributosatributos1wc_impl
        Description: ALM_LISTA_ATRIBUTOSATRIBUTOS1 WC
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:14:45.32
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

public final  class alm_lista_atributosatributos1wc_impl extends GXWebComponent
{
   public alm_lista_atributosatributos1wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_lista_atributosatributos1wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_lista_atributosatributos1wc_impl.class ));
   }

   public alm_lista_atributosatributos1wc_impl( int remoteHandle ,
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
               AV7TDet_ListId = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7TDet_ListId", GXutil.ltrim( GXutil.str( AV7TDet_ListId, 11, 0)));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,new Long(AV7TDet_ListId)});
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
               AV7TDet_ListId = GXutil.lval( httpContext.GetNextPar( )) ;
               AV12Update = httpContext.GetNextPar( ) ;
               edtavUpdate_Tooltiptext = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_20_Refreshing);
               AV13Delete = httpContext.GetNextPar( ) ;
               edtavDelete_Tooltiptext = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "Tooltiptext", edtavDelete_Tooltiptext, !bGXsfl_20_Refreshing);
               A46Tran_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               A69TDet_Consecutivo = GXutil.lval( httpContext.GetNextPar( )) ;
               A37Cata_Codigo = httpContext.GetNextPar( ) ;
               sPrefix = httpContext.GetNextPar( ) ;
               init_default_properties( ) ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxgrgrid_refresh( subGrid_Rows, AV7TDet_ListId, AV12Update, AV13Delete, A46Tran_Id, A69TDet_Consecutivo, A37Cata_Codigo, sPrefix) ;
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
         pa572( ) ;
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
         httpContext.writeValue( "ALM_LISTA_ATRIBUTOSATRIBUTOS1 WC") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414144537");
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_lista_atributosatributos1wc") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV7TDet_ListId,11,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7TDet_ListId", GXutil.ltrim( localUtil.ntoc( wcpOAV7TDet_ListId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTDET_LISTID", GXutil.ltrim( localUtil.ntoc( AV7TDet_ListId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CATA_CODIGO", A37Cata_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUPDATE_Tooltiptext", GXutil.rtrim( edtavUpdate_Tooltiptext));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDELETE_Tooltiptext", GXutil.rtrim( edtavDelete_Tooltiptext));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm572( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("alm_lista_atributosatributos1wc.js", "?201861414144540");
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
      return "ALM_LISTA_ATRIBUTOSATRIBUTOS1WC" ;
   }

   public String getPgmdesc( )
   {
      return "ALM_LISTA_ATRIBUTOSATRIBUTOS1 WC" ;
   }

   public void wb570( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.alm_lista_atributosatributos1wc");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 20, 2, 0)+","+"null"+");", "Agregar", bttBtninsert_Jsonclick, 5, "Agregar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_LISTA_ATRIBUTOSATRIBUTOS1WC.htm");
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
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Consecutivo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción del bien") ;
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
            httpContext.writeValue( "Segmento Codigo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "UNIDAD MEDIDA CODIGO") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Indicador Entrada/Salida") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Recuperada") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Codigo Tipo de Elemento") ;
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
            GridColumn.AddObjectProperty("Value", A66Elem_Consecutivo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A557Elem_Descripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A298Cata_Descripcion);
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtCata_Descripcion_Link));
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
            GridColumn.AddObjectProperty("Value", A75SEG_Codigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A77UNIMED_COD, (byte)(6), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A481Tran_IndE_S);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A817TDet_PlacaRecuperada);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ".", "")));
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTDet_ListId_Internalname, "Identificador Atributo", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTDet_ListId_Internalname, GXutil.ltrim( localUtil.ntoc( A70TDet_ListId, (byte)(11), (byte)(0), ",", "")), ((edtTDet_ListId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A70TDet_ListId), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A70TDet_ListId), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTDet_ListId_Jsonclick, 0, "Attribute", "", "", "", edtTDet_ListId_Visible, edtTDet_ListId_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_LISTA_ATRIBUTOSATRIBUTOS1WC.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start572( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "ALM_LISTA_ATRIBUTOSATRIBUTOS1 WC", (short)(0)) ;
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
            strup570( ) ;
         }
      }
   }

   public void ws572( )
   {
      start572( ) ;
      evt572( ) ;
   }

   public void evt572( )
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
                              strup570( ) ;
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
                              strup570( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoInsert' */
                                 e11572 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup570( ) ;
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
                              strup570( ) ;
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
                              strup570( ) ;
                           }
                           nGXsfl_20_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_20_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_20_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_202( ) ;
                           A46Tran_Id = localUtil.ctol( httpContext.cgiGet( edtTran_Id_Internalname), ",", ".") ;
                           A69TDet_Consecutivo = localUtil.ctol( httpContext.cgiGet( edtTDet_Consecutivo_Internalname), ",", ".") ;
                           A66Elem_Consecutivo = httpContext.cgiGet( edtElem_Consecutivo_Internalname) ;
                           A557Elem_Descripcion = httpContext.cgiGet( edtElem_Descripcion_Internalname) ;
                           A298Cata_Descripcion = GXutil.upper( httpContext.cgiGet( edtCata_Descripcion_Internalname)) ;
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
                           A75SEG_Codigo = httpContext.cgiGet( edtSEG_Codigo_Internalname) ;
                           A77UNIMED_COD = (int)(localUtil.ctol( httpContext.cgiGet( edtUNIMED_COD_Internalname), ",", ".")) ;
                           cmbTran_IndE_S.setName( cmbTran_IndE_S.getInternalname() );
                           cmbTran_IndE_S.setValue( httpContext.cgiGet( cmbTran_IndE_S.getInternalname()) );
                           A481Tran_IndE_S = httpContext.cgiGet( cmbTran_IndE_S.getInternalname()) ;
                           n481Tran_IndE_S = false ;
                           A817TDet_PlacaRecuperada = httpContext.cgiGet( edtTDet_PlacaRecuperada_Internalname) ;
                           n817TDet_PlacaRecuperada = false ;
                           A33Tipo_Codigo = localUtil.ctol( httpContext.cgiGet( edtTipo_Codigo_Internalname), ",", ".") ;
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
                                       e12572 ();
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
                                       e13572 ();
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
                                    strup570( ) ;
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

   public void we572( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm572( ) ;
         }
      }
   }

   public void pa572( )
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
                                 long AV7TDet_ListId ,
                                 String AV12Update ,
                                 String AV13Delete ,
                                 long A46Tran_Id ,
                                 long A69TDet_Consecutivo ,
                                 String A37Cata_Codigo ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid_Rows = subGrid_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID_nCurrentRecord = 0 ;
      rf572( ) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_ID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A46Tran_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TRAN_ID", GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_CONSECUTIVO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A69TDet_Consecutivo), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TDET_CONSECUTIVO", GXutil.ltrim( localUtil.ntoc( A69TDet_Consecutivo, (byte)(18), (byte)(0), ".", "")));
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf572( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV17Pgmname = "ALM_LISTA_ATRIBUTOSATRIBUTOS1WC" ;
      Gx_err = (short)(0) ;
   }

   public void rf572( )
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
         /* Using cursor H00572 */
         pr_default.execute(0, new Object[] {new Long(AV7TDet_ListId), new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_20_idx = (short)(1) ;
         sGXsfl_20_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_20_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_202( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_recordsperpage( ) ) ) ) )
         {
            A34Clas_Codigo = H00572_A34Clas_Codigo[0] ;
            A35FAM_Codigo = H00572_A35FAM_Codigo[0] ;
            A37Cata_Codigo = H00572_A37Cata_Codigo[0] ;
            A70TDet_ListId = H00572_A70TDet_ListId[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A70TDet_ListId", GXutil.ltrim( GXutil.str( A70TDet_ListId, 11, 0)));
            A33Tipo_Codigo = H00572_A33Tipo_Codigo[0] ;
            A817TDet_PlacaRecuperada = H00572_A817TDet_PlacaRecuperada[0] ;
            n817TDet_PlacaRecuperada = H00572_n817TDet_PlacaRecuperada[0] ;
            A481Tran_IndE_S = H00572_A481Tran_IndE_S[0] ;
            n481Tran_IndE_S = H00572_n481Tran_IndE_S[0] ;
            A77UNIMED_COD = H00572_A77UNIMED_COD[0] ;
            A75SEG_Codigo = H00572_A75SEG_Codigo[0] ;
            A658TDet_Agrupado = H00572_A658TDet_Agrupado[0] ;
            n658TDet_Agrupado = H00572_n658TDet_Agrupado[0] ;
            A657TDet_Otros_Costos = H00572_A657TDet_Otros_Costos[0] ;
            n657TDet_Otros_Costos = H00572_n657TDet_Otros_Costos[0] ;
            A656TDet_Plazo_N = H00572_A656TDet_Plazo_N[0] ;
            n656TDet_Plazo_N = H00572_n656TDet_Plazo_N[0] ;
            A655TDet_Taza = H00572_A655TDet_Taza[0] ;
            n655TDet_Taza = H00572_n655TDet_Taza[0] ;
            A654TDet_Valor_Futuro = H00572_A654TDet_Valor_Futuro[0] ;
            n654TDet_Valor_Futuro = H00572_n654TDet_Valor_Futuro[0] ;
            A653TDet_Valor_Presente = H00572_A653TDet_Valor_Presente[0] ;
            n653TDet_Valor_Presente = H00572_n653TDet_Valor_Presente[0] ;
            A525TDet_Atributos = H00572_A525TDet_Atributos[0] ;
            A505TDet_EsPadre = H00572_A505TDet_EsPadre[0] ;
            A491TDet_PlacaPadre = H00572_A491TDet_PlacaPadre[0] ;
            n491TDet_PlacaPadre = H00572_n491TDet_PlacaPadre[0] ;
            A504TDet_Observaciones = H00572_A504TDet_Observaciones[0] ;
            n504TDet_Observaciones = H00572_n504TDet_Observaciones[0] ;
            A490TDet_PlacaNumero = H00572_A490TDet_PlacaNumero[0] ;
            n490TDet_PlacaNumero = H00572_n490TDet_PlacaNumero[0] ;
            A489TDet_ValorTotal = H00572_A489TDet_ValorTotal[0] ;
            A488TDet_ValorUnitario = H00572_A488TDet_ValorUnitario[0] ;
            A487TDet_Cantidad = H00572_A487TDet_Cantidad[0] ;
            A298Cata_Descripcion = H00572_A298Cata_Descripcion[0] ;
            A557Elem_Descripcion = H00572_A557Elem_Descripcion[0] ;
            A66Elem_Consecutivo = H00572_A66Elem_Consecutivo[0] ;
            A69TDet_Consecutivo = H00572_A69TDet_Consecutivo[0] ;
            A46Tran_Id = H00572_A46Tran_Id[0] ;
            A481Tran_IndE_S = H00572_A481Tran_IndE_S[0] ;
            n481Tran_IndE_S = H00572_n481Tran_IndE_S[0] ;
            A817TDet_PlacaRecuperada = H00572_A817TDet_PlacaRecuperada[0] ;
            n817TDet_PlacaRecuperada = H00572_n817TDet_PlacaRecuperada[0] ;
            A658TDet_Agrupado = H00572_A658TDet_Agrupado[0] ;
            n658TDet_Agrupado = H00572_n658TDet_Agrupado[0] ;
            A657TDet_Otros_Costos = H00572_A657TDet_Otros_Costos[0] ;
            n657TDet_Otros_Costos = H00572_n657TDet_Otros_Costos[0] ;
            A656TDet_Plazo_N = H00572_A656TDet_Plazo_N[0] ;
            n656TDet_Plazo_N = H00572_n656TDet_Plazo_N[0] ;
            A655TDet_Taza = H00572_A655TDet_Taza[0] ;
            n655TDet_Taza = H00572_n655TDet_Taza[0] ;
            A654TDet_Valor_Futuro = H00572_A654TDet_Valor_Futuro[0] ;
            n654TDet_Valor_Futuro = H00572_n654TDet_Valor_Futuro[0] ;
            A653TDet_Valor_Presente = H00572_A653TDet_Valor_Presente[0] ;
            n653TDet_Valor_Presente = H00572_n653TDet_Valor_Presente[0] ;
            A525TDet_Atributos = H00572_A525TDet_Atributos[0] ;
            A505TDet_EsPadre = H00572_A505TDet_EsPadre[0] ;
            A491TDet_PlacaPadre = H00572_A491TDet_PlacaPadre[0] ;
            n491TDet_PlacaPadre = H00572_n491TDet_PlacaPadre[0] ;
            A504TDet_Observaciones = H00572_A504TDet_Observaciones[0] ;
            n504TDet_Observaciones = H00572_n504TDet_Observaciones[0] ;
            A490TDet_PlacaNumero = H00572_A490TDet_PlacaNumero[0] ;
            n490TDet_PlacaNumero = H00572_n490TDet_PlacaNumero[0] ;
            A489TDet_ValorTotal = H00572_A489TDet_ValorTotal[0] ;
            A488TDet_ValorUnitario = H00572_A488TDet_ValorUnitario[0] ;
            A487TDet_Cantidad = H00572_A487TDet_Cantidad[0] ;
            A66Elem_Consecutivo = H00572_A66Elem_Consecutivo[0] ;
            A37Cata_Codigo = H00572_A37Cata_Codigo[0] ;
            A33Tipo_Codigo = H00572_A33Tipo_Codigo[0] ;
            A77UNIMED_COD = H00572_A77UNIMED_COD[0] ;
            A557Elem_Descripcion = H00572_A557Elem_Descripcion[0] ;
            A34Clas_Codigo = H00572_A34Clas_Codigo[0] ;
            A298Cata_Descripcion = H00572_A298Cata_Descripcion[0] ;
            A35FAM_Codigo = H00572_A35FAM_Codigo[0] ;
            A75SEG_Codigo = H00572_A75SEG_Codigo[0] ;
            e13572 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(20) ;
         wb570( ) ;
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
      /* Using cursor H00573 */
      pr_default.execute(1, new Object[] {new Long(AV7TDet_ListId)});
      GRID_nRecordCount = H00573_AGRID_nRecordCount[0] ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7TDet_ListId, AV12Update, AV13Delete, A46Tran_Id, A69TDet_Consecutivo, A37Cata_Codigo, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7TDet_ListId, AV12Update, AV13Delete, A46Tran_Id, A69TDet_Consecutivo, A37Cata_Codigo, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7TDet_ListId, AV12Update, AV13Delete, A46Tran_Id, A69TDet_Consecutivo, A37Cata_Codigo, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7TDet_ListId, AV12Update, AV13Delete, A46Tran_Id, A69TDet_Consecutivo, A37Cata_Codigo, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7TDet_ListId, AV12Update, AV13Delete, A46Tran_Id, A69TDet_Consecutivo, A37Cata_Codigo, sPrefix) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup570( )
   {
      /* Before Start, stand alone formulas. */
      AV17Pgmname = "ALM_LISTA_ATRIBUTOSATRIBUTOS1WC" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e12572 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A70TDet_ListId = localUtil.ctol( httpContext.cgiGet( edtTDet_ListId_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A70TDet_ListId", GXutil.ltrim( GXutil.str( A70TDet_ListId, 11, 0)));
         /* Read saved values. */
         nRC_GXsfl_20 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_20"), ",", ".")) ;
         wcpOAV7TDet_ListId = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7TDet_ListId"), ",", ".") ;
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
      e12572 ();
      if (returnInSub) return;
   }

   public void e12572( )
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
      edtTDet_ListId_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTDet_ListId_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTDet_ListId_Visible, 5, 0)), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
   }

   private void e13572( )
   {
      /* Grid_Load Routine */
      edtavUpdate_Link = formatLink("com.orions2.alm_detalle_transaccion") + "?" + GXutil.URLEncode(GXutil.rtrim("UPD")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A46Tran_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A69TDet_Consecutivo,18,0))) ;
      edtavDelete_Link = formatLink("com.orions2.alm_detalle_transaccion") + "?" + GXutil.URLEncode(GXutil.rtrim("DLT")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A46Tran_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A69TDet_Consecutivo,18,0))) ;
      edtCata_Descripcion_Link = formatLink("com.orions2.viewalm_catalogo") + "?" + GXutil.URLEncode(GXutil.rtrim(A37Cata_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
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

   public void e11572( )
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
      AV11TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "TDet_ListId" );
      AV11TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV7TDet_ListId, 11, 0) );
      AV10TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV11TrnContextAtt, 0);
      AV8Session.setValue("TrnContext", AV10TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      AV7TDet_ListId = ((Number) GXutil.testNumericType( getParm(obj,0,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7TDet_ListId", GXutil.ltrim( GXutil.str( AV7TDet_ListId, 11, 0)));
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
      pa572( ) ;
      ws572( ) ;
      we572( ) ;
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
      sCtrlAV7TDet_ListId = (String)getParm(obj,0,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa572( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "alm_lista_atributosatributos1wc");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa572( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV7TDet_ListId = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7TDet_ListId", GXutil.ltrim( GXutil.str( AV7TDet_ListId, 11, 0)));
      }
      wcpOAV7TDet_ListId = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7TDet_ListId"), ",", ".") ;
      if ( ! GetJustCreated( ) && ( ( AV7TDet_ListId != wcpOAV7TDet_ListId ) ) )
      {
         setjustcreated();
      }
      wcpOAV7TDet_ListId = AV7TDet_ListId ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV7TDet_ListId = httpContext.cgiGet( sPrefix+"AV7TDet_ListId_CTRL") ;
      if ( GXutil.len( sCtrlAV7TDet_ListId) > 0 )
      {
         AV7TDet_ListId = localUtil.ctol( httpContext.cgiGet( sCtrlAV7TDet_ListId), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7TDet_ListId", GXutil.ltrim( GXutil.str( AV7TDet_ListId, 11, 0)));
      }
      else
      {
         AV7TDet_ListId = localUtil.ctol( httpContext.cgiGet( sPrefix+"AV7TDet_ListId_PARM"), ",", ".") ;
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
      pa572( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws572( ) ;
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
      ws572( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7TDet_ListId_PARM", GXutil.ltrim( localUtil.ntoc( AV7TDet_ListId, (byte)(11), (byte)(0), ",", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7TDet_ListId)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7TDet_ListId_CTRL", GXutil.rtrim( sCtrlAV7TDet_ListId));
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
      we572( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414144656");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("alm_lista_atributosatributos1wc.js", "?201861414144656");
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_202( )
   {
      edtTran_Id_Internalname = sPrefix+"TRAN_ID_"+sGXsfl_20_idx ;
      edtTDet_Consecutivo_Internalname = sPrefix+"TDET_CONSECUTIVO_"+sGXsfl_20_idx ;
      edtElem_Consecutivo_Internalname = sPrefix+"ELEM_CONSECUTIVO_"+sGXsfl_20_idx ;
      edtElem_Descripcion_Internalname = sPrefix+"ELEM_DESCRIPCION_"+sGXsfl_20_idx ;
      edtCata_Descripcion_Internalname = sPrefix+"CATA_DESCRIPCION_"+sGXsfl_20_idx ;
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
      edtSEG_Codigo_Internalname = sPrefix+"SEG_CODIGO_"+sGXsfl_20_idx ;
      edtUNIMED_COD_Internalname = sPrefix+"UNIMED_COD_"+sGXsfl_20_idx ;
      cmbTran_IndE_S.setInternalname( sPrefix+"TRAN_INDE_S_"+sGXsfl_20_idx );
      edtTDet_PlacaRecuperada_Internalname = sPrefix+"TDET_PLACARECUPERADA_"+sGXsfl_20_idx ;
      edtTipo_Codigo_Internalname = sPrefix+"TIPO_CODIGO_"+sGXsfl_20_idx ;
      edtavUpdate_Internalname = sPrefix+"vUPDATE_"+sGXsfl_20_idx ;
      edtavDelete_Internalname = sPrefix+"vDELETE_"+sGXsfl_20_idx ;
   }

   public void subsflControlProps_fel_202( )
   {
      edtTran_Id_Internalname = sPrefix+"TRAN_ID_"+sGXsfl_20_fel_idx ;
      edtTDet_Consecutivo_Internalname = sPrefix+"TDET_CONSECUTIVO_"+sGXsfl_20_fel_idx ;
      edtElem_Consecutivo_Internalname = sPrefix+"ELEM_CONSECUTIVO_"+sGXsfl_20_fel_idx ;
      edtElem_Descripcion_Internalname = sPrefix+"ELEM_DESCRIPCION_"+sGXsfl_20_fel_idx ;
      edtCata_Descripcion_Internalname = sPrefix+"CATA_DESCRIPCION_"+sGXsfl_20_fel_idx ;
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
      edtSEG_Codigo_Internalname = sPrefix+"SEG_CODIGO_"+sGXsfl_20_fel_idx ;
      edtUNIMED_COD_Internalname = sPrefix+"UNIMED_COD_"+sGXsfl_20_fel_idx ;
      cmbTran_IndE_S.setInternalname( sPrefix+"TRAN_INDE_S_"+sGXsfl_20_fel_idx );
      edtTDet_PlacaRecuperada_Internalname = sPrefix+"TDET_PLACARECUPERADA_"+sGXsfl_20_fel_idx ;
      edtTipo_Codigo_Internalname = sPrefix+"TIPO_CODIGO_"+sGXsfl_20_fel_idx ;
      edtavUpdate_Internalname = sPrefix+"vUPDATE_"+sGXsfl_20_fel_idx ;
      edtavDelete_Internalname = sPrefix+"vDELETE_"+sGXsfl_20_fel_idx ;
   }

   public void sendrow_202( )
   {
      subsflControlProps_202( ) ;
      wb570( ) ;
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtElem_Consecutivo_Internalname,A66Elem_Consecutivo,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtElem_Consecutivo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtElem_Descripcion_Internalname,A557Elem_Descripcion,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtElem_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2000),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCata_Descripcion_Internalname,A298Cata_Descripcion,GXutil.rtrim( localUtil.format( A298Cata_Descripcion, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'",edtCata_Descripcion_Link,"","","",edtCata_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
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
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSEG_Codigo_Internalname,A75SEG_Codigo,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtSEG_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUNIMED_COD_Internalname,GXutil.ltrim( localUtil.ntoc( A77UNIMED_COD, (byte)(6), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A77UNIMED_COD), "ZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtUNIMED_COD_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(6),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_PlacaRecuperada_Internalname,A817TDet_PlacaRecuperada,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTDet_PlacaRecuperada_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Placa","left",new Boolean(true)});
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
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_CONSECUTIVO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A69TDet_Consecutivo), "ZZZZZZZZZZZZZZZZZ9")));
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
      edtElem_Consecutivo_Internalname = sPrefix+"ELEM_CONSECUTIVO" ;
      edtElem_Descripcion_Internalname = sPrefix+"ELEM_DESCRIPCION" ;
      edtCata_Descripcion_Internalname = sPrefix+"CATA_DESCRIPCION" ;
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
      edtSEG_Codigo_Internalname = sPrefix+"SEG_CODIGO" ;
      edtUNIMED_COD_Internalname = sPrefix+"UNIMED_COD" ;
      cmbTran_IndE_S.setInternalname( sPrefix+"TRAN_INDE_S" );
      edtTDet_PlacaRecuperada_Internalname = sPrefix+"TDET_PLACARECUPERADA" ;
      edtTipo_Codigo_Internalname = sPrefix+"TIPO_CODIGO" ;
      edtavUpdate_Internalname = sPrefix+"vUPDATE" ;
      edtavDelete_Internalname = sPrefix+"vDELETE" ;
      divGridtable_Internalname = sPrefix+"GRIDTABLE" ;
      divGridcell_Internalname = sPrefix+"GRIDCELL" ;
      edtTDet_ListId_Internalname = sPrefix+"TDET_LISTID" ;
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
      edtTipo_Codigo_Jsonclick = "" ;
      edtTDet_PlacaRecuperada_Jsonclick = "" ;
      cmbTran_IndE_S.setJsonclick( "" );
      edtUNIMED_COD_Jsonclick = "" ;
      edtSEG_Codigo_Jsonclick = "" ;
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
      edtCata_Descripcion_Jsonclick = "" ;
      edtElem_Descripcion_Jsonclick = "" ;
      edtElem_Consecutivo_Jsonclick = "" ;
      edtTDet_Consecutivo_Jsonclick = "" ;
      edtTran_Id_Jsonclick = "" ;
      edtTDet_ListId_Jsonclick = "" ;
      edtTDet_ListId_Enabled = 0 ;
      edtTDet_ListId_Visible = 1 ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      edtavDelete_Link = "" ;
      edtavUpdate_Link = "" ;
      edtTDet_Cantidad_Link = "" ;
      edtCata_Descripcion_Link = "" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7TDet_ListId',fld:'vTDET_LISTID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'A37Cata_Codigo',fld:'CATA_CODIGO',pic:'',nv:''},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e13572',iparms:[{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'A37Cata_Codigo',fld:'CATA_CODIGO',pic:'',nv:''}],oparms:[{av:'edtavUpdate_Link',ctrl:'vUPDATE',prop:'Link'},{av:'edtavDelete_Link',ctrl:'vDELETE',prop:'Link'},{av:'edtCata_Descripcion_Link',ctrl:'CATA_DESCRIPCION',prop:'Link'},{av:'edtTDet_Cantidad_Link',ctrl:'TDET_CANTIDAD',prop:'Link'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e11572',iparms:[{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7TDet_ListId',fld:'vTDET_LISTID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'A37Cata_Codigo',fld:'CATA_CODIGO',pic:'',nv:''},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7TDet_ListId',fld:'vTDET_LISTID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'A37Cata_Codigo',fld:'CATA_CODIGO',pic:'',nv:''},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7TDet_ListId',fld:'vTDET_LISTID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'A37Cata_Codigo',fld:'CATA_CODIGO',pic:'',nv:''},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7TDet_ListId',fld:'vTDET_LISTID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'A37Cata_Codigo',fld:'CATA_CODIGO',pic:'',nv:''},{av:'sPrefix',nv:''}],oparms:[]}");
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
      A37Cata_Codigo = "" ;
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
      A66Elem_Consecutivo = "" ;
      A557Elem_Descripcion = "" ;
      A298Cata_Descripcion = "" ;
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
      A75SEG_Codigo = "" ;
      A481Tran_IndE_S = "" ;
      A817TDet_PlacaRecuperada = "" ;
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
      H00572_A34Clas_Codigo = new String[] {""} ;
      H00572_A35FAM_Codigo = new String[] {""} ;
      H00572_A37Cata_Codigo = new String[] {""} ;
      H00572_A70TDet_ListId = new long[1] ;
      H00572_A33Tipo_Codigo = new long[1] ;
      H00572_A817TDet_PlacaRecuperada = new String[] {""} ;
      H00572_n817TDet_PlacaRecuperada = new boolean[] {false} ;
      H00572_A481Tran_IndE_S = new String[] {""} ;
      H00572_n481Tran_IndE_S = new boolean[] {false} ;
      H00572_A77UNIMED_COD = new int[1] ;
      H00572_A75SEG_Codigo = new String[] {""} ;
      H00572_A658TDet_Agrupado = new short[1] ;
      H00572_n658TDet_Agrupado = new boolean[] {false} ;
      H00572_A657TDet_Otros_Costos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00572_n657TDet_Otros_Costos = new boolean[] {false} ;
      H00572_A656TDet_Plazo_N = new byte[1] ;
      H00572_n656TDet_Plazo_N = new boolean[] {false} ;
      H00572_A655TDet_Taza = new short[1] ;
      H00572_n655TDet_Taza = new boolean[] {false} ;
      H00572_A654TDet_Valor_Futuro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00572_n654TDet_Valor_Futuro = new boolean[] {false} ;
      H00572_A653TDet_Valor_Presente = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00572_n653TDet_Valor_Presente = new boolean[] {false} ;
      H00572_A525TDet_Atributos = new String[] {""} ;
      H00572_A505TDet_EsPadre = new String[] {""} ;
      H00572_A491TDet_PlacaPadre = new String[] {""} ;
      H00572_n491TDet_PlacaPadre = new boolean[] {false} ;
      H00572_A504TDet_Observaciones = new String[] {""} ;
      H00572_n504TDet_Observaciones = new boolean[] {false} ;
      H00572_A490TDet_PlacaNumero = new String[] {""} ;
      H00572_n490TDet_PlacaNumero = new boolean[] {false} ;
      H00572_A489TDet_ValorTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00572_A488TDet_ValorUnitario = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00572_A487TDet_Cantidad = new long[1] ;
      H00572_A298Cata_Descripcion = new String[] {""} ;
      H00572_A557Elem_Descripcion = new String[] {""} ;
      H00572_A66Elem_Consecutivo = new String[] {""} ;
      H00572_A69TDet_Consecutivo = new long[1] ;
      H00572_A46Tran_Id = new long[1] ;
      A34Clas_Codigo = "" ;
      A35FAM_Codigo = "" ;
      H00573_AGRID_nRecordCount = new long[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV10TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV9HTTPRequest = httpContext.getHttpRequest();
      AV11TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV8Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV7TDet_ListId = "" ;
      ROClassString = "" ;
      sImgUrl = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_lista_atributosatributos1wc__default(),
         new Object[] {
             new Object[] {
            H00572_A34Clas_Codigo, H00572_A35FAM_Codigo, H00572_A37Cata_Codigo, H00572_A70TDet_ListId, H00572_A33Tipo_Codigo, H00572_A817TDet_PlacaRecuperada, H00572_n817TDet_PlacaRecuperada, H00572_A481Tran_IndE_S, H00572_n481Tran_IndE_S, H00572_A77UNIMED_COD,
            H00572_A75SEG_Codigo, H00572_A658TDet_Agrupado, H00572_n658TDet_Agrupado, H00572_A657TDet_Otros_Costos, H00572_n657TDet_Otros_Costos, H00572_A656TDet_Plazo_N, H00572_n656TDet_Plazo_N, H00572_A655TDet_Taza, H00572_n655TDet_Taza, H00572_A654TDet_Valor_Futuro,
            H00572_n654TDet_Valor_Futuro, H00572_A653TDet_Valor_Presente, H00572_n653TDet_Valor_Presente, H00572_A525TDet_Atributos, H00572_A505TDet_EsPadre, H00572_A491TDet_PlacaPadre, H00572_n491TDet_PlacaPadre, H00572_A504TDet_Observaciones, H00572_n504TDet_Observaciones, H00572_A490TDet_PlacaNumero,
            H00572_n490TDet_PlacaNumero, H00572_A489TDet_ValorTotal, H00572_A488TDet_ValorUnitario, H00572_A487TDet_Cantidad, H00572_A298Cata_Descripcion, H00572_A557Elem_Descripcion, H00572_A66Elem_Consecutivo, H00572_A69TDet_Consecutivo, H00572_A46Tran_Id
            }
            , new Object[] {
            H00573_AGRID_nRecordCount
            }
         }
      );
      AV17Pgmname = "ALM_LISTA_ATRIBUTOSATRIBUTOS1WC" ;
      /* GeneXus formulas. */
      AV17Pgmname = "ALM_LISTA_ATRIBUTOSATRIBUTOS1WC" ;
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
   private int A77UNIMED_COD ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int edtTDet_ListId_Enabled ;
   private int edtTDet_ListId_Visible ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private long wcpOAV7TDet_ListId ;
   private long AV7TDet_ListId ;
   private long A46Tran_Id ;
   private long A69TDet_Consecutivo ;
   private long GRID_nFirstRecordOnPage ;
   private long A487TDet_Cantidad ;
   private long A33Tipo_Codigo ;
   private long A70TDet_ListId ;
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
   private String edtCata_Descripcion_Link ;
   private String edtTDet_Cantidad_Link ;
   private String edtavUpdate_Link ;
   private String edtavDelete_Link ;
   private String edtTDet_ListId_Internalname ;
   private String edtTDet_ListId_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtTran_Id_Internalname ;
   private String edtTDet_Consecutivo_Internalname ;
   private String edtElem_Consecutivo_Internalname ;
   private String edtElem_Descripcion_Internalname ;
   private String edtCata_Descripcion_Internalname ;
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
   private String edtSEG_Codigo_Internalname ;
   private String edtUNIMED_COD_Internalname ;
   private String edtTDet_PlacaRecuperada_Internalname ;
   private String edtTipo_Codigo_Internalname ;
   private String GXCCtl ;
   private String AV17Pgmname ;
   private String scmdbuf ;
   private String sCtrlAV7TDet_ListId ;
   private String sGXsfl_20_fel_idx="0001" ;
   private String ROClassString ;
   private String edtTran_Id_Jsonclick ;
   private String edtTDet_Consecutivo_Jsonclick ;
   private String edtElem_Consecutivo_Jsonclick ;
   private String edtElem_Descripcion_Jsonclick ;
   private String edtCata_Descripcion_Jsonclick ;
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
   private String edtSEG_Codigo_Jsonclick ;
   private String edtUNIMED_COD_Jsonclick ;
   private String edtTDet_PlacaRecuperada_Jsonclick ;
   private String edtTipo_Codigo_Jsonclick ;
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
   private boolean n817TDet_PlacaRecuperada ;
   private boolean returnInSub ;
   private boolean AV12Update_IsBlob ;
   private boolean AV13Delete_IsBlob ;
   private String A37Cata_Codigo ;
   private String A66Elem_Consecutivo ;
   private String A557Elem_Descripcion ;
   private String A298Cata_Descripcion ;
   private String A490TDet_PlacaNumero ;
   private String A504TDet_Observaciones ;
   private String A491TDet_PlacaPadre ;
   private String A505TDet_EsPadre ;
   private String A525TDet_Atributos ;
   private String A75SEG_Codigo ;
   private String A481Tran_IndE_S ;
   private String A817TDet_PlacaRecuperada ;
   private String AV18Update_GXI ;
   private String AV19Delete_GXI ;
   private String A34Clas_Codigo ;
   private String A35FAM_Codigo ;
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
   private String[] H00572_A34Clas_Codigo ;
   private String[] H00572_A35FAM_Codigo ;
   private String[] H00572_A37Cata_Codigo ;
   private long[] H00572_A70TDet_ListId ;
   private long[] H00572_A33Tipo_Codigo ;
   private String[] H00572_A817TDet_PlacaRecuperada ;
   private boolean[] H00572_n817TDet_PlacaRecuperada ;
   private String[] H00572_A481Tran_IndE_S ;
   private boolean[] H00572_n481Tran_IndE_S ;
   private int[] H00572_A77UNIMED_COD ;
   private String[] H00572_A75SEG_Codigo ;
   private short[] H00572_A658TDet_Agrupado ;
   private boolean[] H00572_n658TDet_Agrupado ;
   private java.math.BigDecimal[] H00572_A657TDet_Otros_Costos ;
   private boolean[] H00572_n657TDet_Otros_Costos ;
   private byte[] H00572_A656TDet_Plazo_N ;
   private boolean[] H00572_n656TDet_Plazo_N ;
   private short[] H00572_A655TDet_Taza ;
   private boolean[] H00572_n655TDet_Taza ;
   private java.math.BigDecimal[] H00572_A654TDet_Valor_Futuro ;
   private boolean[] H00572_n654TDet_Valor_Futuro ;
   private java.math.BigDecimal[] H00572_A653TDet_Valor_Presente ;
   private boolean[] H00572_n653TDet_Valor_Presente ;
   private String[] H00572_A525TDet_Atributos ;
   private String[] H00572_A505TDet_EsPadre ;
   private String[] H00572_A491TDet_PlacaPadre ;
   private boolean[] H00572_n491TDet_PlacaPadre ;
   private String[] H00572_A504TDet_Observaciones ;
   private boolean[] H00572_n504TDet_Observaciones ;
   private String[] H00572_A490TDet_PlacaNumero ;
   private boolean[] H00572_n490TDet_PlacaNumero ;
   private java.math.BigDecimal[] H00572_A489TDet_ValorTotal ;
   private java.math.BigDecimal[] H00572_A488TDet_ValorUnitario ;
   private long[] H00572_A487TDet_Cantidad ;
   private String[] H00572_A298Cata_Descripcion ;
   private String[] H00572_A557Elem_Descripcion ;
   private String[] H00572_A66Elem_Consecutivo ;
   private long[] H00572_A69TDet_Consecutivo ;
   private long[] H00572_A46Tran_Id ;
   private long[] H00573_AGRID_nRecordCount ;
   private com.genexus.webpanels.WebSession AV8Session ;
   private com.orions2.SdtTransactionContext AV10TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV11TrnContextAtt ;
}

final  class alm_lista_atributosatributos1wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00572", "SELECT T5.Clas_Codigo, T6.FAM_Codigo, T4.Cata_Codigo, T1.TDet_ListId, T4.Tipo_Codigo, T3.TDet_PlacaRecuperada, T2.Tran_IndE_S, T4.UNIMED_COD, T7.SEG_Codigo, T3.TDet_Agrupado, T3.TDet_Otros_Costos, T3.TDet_Plazo_N, T3.TDet_Taza, T3.TDet_Valor_Futuro, T3.TDet_Valor_Presente, T3.TDet_Atributos, T3.TDet_EsPadre, T3.TDet_PlacaPadre, T3.TDet_Observaciones, T3.TDet_PlacaNumero, T3.TDet_ValorTotal, T3.TDet_ValorUnitario, T3.TDet_Cantidad, T5.Cata_Descripcion, T4.Elem_Descripcion, T3.Elem_Consecutivo, T1.TDet_Consecutivo, T1.Tran_Id FROM ((((((ALM_DETALLE_TRANSACCIONATRIBUT T1 INNER JOIN ALM_TRANSACCION T2 ON T2.Tran_Id = T1.Tran_Id) INNER JOIN ALM_DETALLE_TRANSACCION T3 ON T3.Tran_Id = T1.Tran_Id AND T3.TDet_Consecutivo = T1.TDet_Consecutivo) INNER JOIN ALM_ELEMENTO T4 ON T4.Elem_Consecutivo = T3.Elem_Consecutivo) INNER JOIN ALM_CATALOGO T5 ON T5.Cata_Codigo = T4.Cata_Codigo) INNER JOIN ALM_CLASE T6 ON T6.Clas_Codigo = T5.Clas_Codigo) INNER JOIN ALM_CAT_FAM T7 ON T7.FAM_Codigo = T6.FAM_Codigo) WHERE T1.TDet_ListId = ? ORDER BY T1.TDet_ListId  OFFSET ? ROWS FETCH NEXT (CASE WHEN ? > 0 THEN ? ELSE 1e9 END) ROWS ONLY",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H00573", "SELECT COUNT(*) FROM ((((((ALM_DETALLE_TRANSACCIONATRIBUT T1 INNER JOIN ALM_TRANSACCION T2 ON T2.Tran_Id = T1.Tran_Id) INNER JOIN ALM_DETALLE_TRANSACCION T3 ON T3.Tran_Id = T1.Tran_Id AND T3.TDet_Consecutivo = T1.TDet_Consecutivo) INNER JOIN ALM_ELEMENTO T4 ON T4.Elem_Consecutivo = T3.Elem_Consecutivo) INNER JOIN ALM_CATALOGO T5 ON T5.Cata_Codigo = T4.Cata_Codigo) INNER JOIN ALM_CLASE T6 ON T6.Clas_Codigo = T5.Clas_Codigo) INNER JOIN ALM_CAT_FAM T7 ON T7.FAM_Codigo = T6.FAM_Codigo) WHERE T1.TDet_ListId = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((short[]) buf[11])[0] = rslt.getShort(10) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,2) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(12) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(13) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(14,2) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(15,2) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(16) ;
               ((String[]) buf[24])[0] = rslt.getVarchar(17) ;
               ((String[]) buf[25])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(21,2) ;
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(22,2) ;
               ((long[]) buf[33])[0] = rslt.getLong(23) ;
               ((String[]) buf[34])[0] = rslt.getVarchar(24) ;
               ((String[]) buf[35])[0] = rslt.getVarchar(25) ;
               ((String[]) buf[36])[0] = rslt.getVarchar(26) ;
               ((long[]) buf[37])[0] = rslt.getLong(27) ;
               ((long[]) buf[38])[0] = rslt.getLong(28) ;
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

