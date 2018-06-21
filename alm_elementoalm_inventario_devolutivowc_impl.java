/*
               File: alm_elementoalm_inventario_devolutivowc_impl
        Description: ALM_ELEMENTOALM_INVENTARIO_DEVOLUTIVOWC
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:15:25.28
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

public final  class alm_elementoalm_inventario_devolutivowc_impl extends GXWebComponent
{
   public alm_elementoalm_inventario_devolutivowc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_elementoalm_inventario_devolutivowc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_elementoalm_inventario_devolutivowc_impl.class ));
   }

   public alm_elementoalm_inventario_devolutivowc_impl( int remoteHandle ,
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
      cmbInvd_ModuloAlmacen = new HTMLChoice();
      cmbInvd_Estado = new HTMLChoice();
      cmbInvd_EntidadGobierno = new HTMLChoice();
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
               A67Invd_NumeroPlaca = httpContext.GetNextPar( ) ;
               A66Elem_Consecutivo = httpContext.GetNextPar( ) ;
               A43Cuen_Identificacion = GXutil.lval( httpContext.GetNextPar( )) ;
               n43Cuen_Identificacion = false ;
               sPrefix = httpContext.GetNextPar( ) ;
               init_default_properties( ) ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxgrgrid_refresh( subGrid_Rows, AV7Elem_Consecutivo, AV12Update, AV13Delete, A67Invd_NumeroPlaca, A66Elem_Consecutivo, A43Cuen_Identificacion, sPrefix) ;
               GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
               GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
               forbiddenHiddens = sPrefix + "hsh" + "ALM_ELEMENTOALM_INVENTARIO_DEVOLUTIVOWC" ;
               forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, "")) ;
               com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
               GXutil.writeLogln("alm_elementoalm_inventario_devolutivowc:[SendSecurityCheck]"+forbiddenHiddens);
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
         pa4E2( ) ;
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
         httpContext.writeValue( "ALM_ELEMENTOALM_INVENTARIO_DEVOLUTIVOWC") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414152534");
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_elementoalm_inventario_devolutivowc") + "?" + GXutil.URLEncode(GXutil.rtrim(AV7Elem_Consecutivo))+"\">") ;
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
      forbiddenHiddens = sPrefix + "hsh" + "ALM_ELEMENTOALM_INVENTARIO_DEVOLUTIVOWC" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, "")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("alm_elementoalm_inventario_devolutivowc:[SendSecurityCheck]"+forbiddenHiddens);
   }

   public void renderHtmlCloseForm4E2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("alm_elementoalm_inventario_devolutivowc.js", "?201861414152537");
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
      return "ALM_ELEMENTOALM_INVENTARIO_DEVOLUTIVOWC" ;
   }

   public String getPgmdesc( )
   {
      return "ALM_ELEMENTOALM_INVENTARIO_DEVOLUTIVOWC" ;
   }

   public void wb4E0( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.alm_elementoalm_inventario_devolutivowc");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 20, 2, 0)+","+"null"+");", "Agregar", bttBtninsert_Jsonclick, 5, "Agregar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_ELEMENTOALM_INVENTARIO_DEVOLUTIVOWC.htm");
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
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "de Placa") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Regional") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Centro Costo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Almacen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Almacén") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Bodega") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Estado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Adquisicion") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Adquisicion") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Padre") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Placa Padre") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Servicio") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Identificación") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Desmantelamiento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "futuro") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Interes") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tiempo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Costos Devolutivo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Total Devolutivo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Util Inicial") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Util Actual") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cuentadante Cedula") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Nombre Cuentadante") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Codigo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "de Gobierno") ;
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
            GridColumn.AddObjectProperty("Value", A67Invd_NumeroPlaca);
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtInvd_NumeroPlaca_Link));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A410Invd_RegionalId, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A411Invd_CentroCostoId, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A412Invd_ModuloAlmacen);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A413Invd_AlmacenCodigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A414Invd_BodegaCodigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A463Invd_Estado);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A465Invd_ValorAdquisicion, (byte)(24), (byte)(2), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.format(A466Invd_FechaAdquisicion, "99/99/99"));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A68Invd_PlacaPadre);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A501Invd_EsPlacaPadre));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.format(A467Invd_FechaServicio, "99/99/99"));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A43Cuen_Identificacion, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A624Costo_Desmante, (byte)(24), (byte)(2), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A625Variable_VF, (byte)(24), (byte)(2), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A626Variable_I, (byte)(3), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A627Variable_N, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A628Otros_Costos_Dev, (byte)(24), (byte)(2), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A629Costo_Total_Dev, (byte)(24), (byte)(2), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A630Vida_Util_Inicial, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A631Vida_Util_Actual, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A688Cuen_Cedula, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A44Cuen_Nombre);
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtCuen_Nombre_Link));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A711Invd_AreadanteCodigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A858Invd_EntidadGobierno);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtElem_Consecutivo_Internalname, "Consecutivo", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtElem_Consecutivo_Internalname, A66Elem_Consecutivo, GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtElem_Consecutivo_Jsonclick, 0, "Attribute", "", "", "", edtElem_Consecutivo_Visible, edtElem_Consecutivo_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_ELEMENTOALM_INVENTARIO_DEVOLUTIVOWC.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start4E2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "ALM_ELEMENTOALM_INVENTARIO_DEVOLUTIVOWC", (short)(0)) ;
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
            strup4E0( ) ;
         }
      }
   }

   public void ws4E2( )
   {
      start4E2( ) ;
      evt4E2( ) ;
   }

   public void evt4E2( )
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
                              strup4E0( ) ;
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
                              strup4E0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoInsert' */
                                 e114E2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup4E0( ) ;
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
                              strup4E0( ) ;
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
                              strup4E0( ) ;
                           }
                           nGXsfl_20_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_20_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_20_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_202( ) ;
                           A67Invd_NumeroPlaca = httpContext.cgiGet( edtInvd_NumeroPlaca_Internalname) ;
                           A410Invd_RegionalId = localUtil.ctol( httpContext.cgiGet( edtInvd_RegionalId_Internalname), ",", ".") ;
                           A411Invd_CentroCostoId = localUtil.ctol( httpContext.cgiGet( edtInvd_CentroCostoId_Internalname), ",", ".") ;
                           cmbInvd_ModuloAlmacen.setName( cmbInvd_ModuloAlmacen.getInternalname() );
                           cmbInvd_ModuloAlmacen.setValue( httpContext.cgiGet( cmbInvd_ModuloAlmacen.getInternalname()) );
                           A412Invd_ModuloAlmacen = httpContext.cgiGet( cmbInvd_ModuloAlmacen.getInternalname()) ;
                           A413Invd_AlmacenCodigo = httpContext.cgiGet( edtInvd_AlmacenCodigo_Internalname) ;
                           A414Invd_BodegaCodigo = httpContext.cgiGet( edtInvd_BodegaCodigo_Internalname) ;
                           cmbInvd_Estado.setName( cmbInvd_Estado.getInternalname() );
                           cmbInvd_Estado.setValue( httpContext.cgiGet( cmbInvd_Estado.getInternalname()) );
                           A463Invd_Estado = httpContext.cgiGet( cmbInvd_Estado.getInternalname()) ;
                           n463Invd_Estado = false ;
                           A465Invd_ValorAdquisicion = localUtil.ctond( httpContext.cgiGet( edtInvd_ValorAdquisicion_Internalname)) ;
                           n465Invd_ValorAdquisicion = false ;
                           A466Invd_FechaAdquisicion = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtInvd_FechaAdquisicion_Internalname), 0)) ;
                           n466Invd_FechaAdquisicion = false ;
                           A68Invd_PlacaPadre = httpContext.cgiGet( edtInvd_PlacaPadre_Internalname) ;
                           n68Invd_PlacaPadre = false ;
                           A501Invd_EsPlacaPadre = httpContext.cgiGet( edtInvd_EsPlacaPadre_Internalname) ;
                           n501Invd_EsPlacaPadre = false ;
                           A467Invd_FechaServicio = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtInvd_FechaServicio_Internalname), 0)) ;
                           n467Invd_FechaServicio = false ;
                           A43Cuen_Identificacion = localUtil.ctol( httpContext.cgiGet( edtCuen_Identificacion_Internalname), ",", ".") ;
                           n43Cuen_Identificacion = false ;
                           A624Costo_Desmante = localUtil.ctond( httpContext.cgiGet( edtCosto_Desmante_Internalname)) ;
                           n624Costo_Desmante = false ;
                           A625Variable_VF = localUtil.ctond( httpContext.cgiGet( edtVariable_VF_Internalname)) ;
                           n625Variable_VF = false ;
                           A626Variable_I = (short)(localUtil.ctol( httpContext.cgiGet( edtVariable_I_Internalname), ",", ".")) ;
                           n626Variable_I = false ;
                           A627Variable_N = (short)(localUtil.ctol( httpContext.cgiGet( edtVariable_N_Internalname), ",", ".")) ;
                           n627Variable_N = false ;
                           A628Otros_Costos_Dev = localUtil.ctond( httpContext.cgiGet( edtOtros_Costos_Dev_Internalname)) ;
                           n628Otros_Costos_Dev = false ;
                           A629Costo_Total_Dev = localUtil.ctond( httpContext.cgiGet( edtCosto_Total_Dev_Internalname)) ;
                           A630Vida_Util_Inicial = (short)(localUtil.ctol( httpContext.cgiGet( edtVida_Util_Inicial_Internalname), ",", ".")) ;
                           n630Vida_Util_Inicial = false ;
                           A631Vida_Util_Actual = (short)(localUtil.ctol( httpContext.cgiGet( edtVida_Util_Actual_Internalname), ",", ".")) ;
                           n631Vida_Util_Actual = false ;
                           A688Cuen_Cedula = localUtil.ctol( httpContext.cgiGet( edtCuen_Cedula_Internalname), ",", ".") ;
                           A44Cuen_Nombre = GXutil.upper( httpContext.cgiGet( edtCuen_Nombre_Internalname)) ;
                           n44Cuen_Nombre = false ;
                           A711Invd_AreadanteCodigo = httpContext.cgiGet( edtInvd_AreadanteCodigo_Internalname) ;
                           n711Invd_AreadanteCodigo = false ;
                           cmbInvd_EntidadGobierno.setName( cmbInvd_EntidadGobierno.getInternalname() );
                           cmbInvd_EntidadGobierno.setValue( httpContext.cgiGet( cmbInvd_EntidadGobierno.getInternalname()) );
                           A858Invd_EntidadGobierno = httpContext.cgiGet( cmbInvd_EntidadGobierno.getInternalname()) ;
                           n858Invd_EntidadGobierno = false ;
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
                                       e124E2 ();
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
                                       e134E2 ();
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
                                    strup4E0( ) ;
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

   public void we4E2( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm4E2( ) ;
         }
      }
   }

   public void pa4E2( )
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
         GXCCtl = "INVD_MODULOALMACEN_" + sGXsfl_20_idx ;
         cmbInvd_ModuloAlmacen.setName( GXCCtl );
         cmbInvd_ModuloAlmacen.setWebtags( "" );
         cmbInvd_ModuloAlmacen.addItem("", "", (short)(0));
         cmbInvd_ModuloAlmacen.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
         cmbInvd_ModuloAlmacen.addItem("INVE", "INVENTARIO", (short)(0));
         cmbInvd_ModuloAlmacen.addItem("ALMA", "ALMACEN", (short)(0));
         if ( cmbInvd_ModuloAlmacen.getItemCount() > 0 )
         {
            A412Invd_ModuloAlmacen = cmbInvd_ModuloAlmacen.getValidValue(A412Invd_ModuloAlmacen) ;
         }
         GXCCtl = "INVD_ESTADO_" + sGXsfl_20_idx ;
         cmbInvd_Estado.setName( GXCCtl );
         cmbInvd_Estado.setWebtags( "" );
         cmbInvd_Estado.addItem("R", "Ratificado", (short)(0));
         cmbInvd_Estado.addItem("P", "Pendiente", (short)(0));
         if ( cmbInvd_Estado.getItemCount() > 0 )
         {
            A463Invd_Estado = cmbInvd_Estado.getValidValue(A463Invd_Estado) ;
            n463Invd_Estado = false ;
         }
         GXCCtl = "INVD_ENTIDADGOBIERNO_" + sGXsfl_20_idx ;
         cmbInvd_EntidadGobierno.setName( GXCCtl );
         cmbInvd_EntidadGobierno.setWebtags( "" );
         cmbInvd_EntidadGobierno.addItem("", "", (short)(0));
         cmbInvd_EntidadGobierno.addItem("SI", "SI", (short)(0));
         cmbInvd_EntidadGobierno.addItem("NO", "NO", (short)(0));
         if ( cmbInvd_EntidadGobierno.getItemCount() > 0 )
         {
            A858Invd_EntidadGobierno = cmbInvd_EntidadGobierno.getValidValue(A858Invd_EntidadGobierno) ;
            n858Invd_EntidadGobierno = false ;
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
                                 String A67Invd_NumeroPlaca ,
                                 String A66Elem_Consecutivo ,
                                 long A43Cuen_Identificacion ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid_Rows = subGrid_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID_nCurrentRecord = 0 ;
      rf4E2( ) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_REGIONALID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A410Invd_RegionalId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INVD_REGIONALID", GXutil.ltrim( localUtil.ntoc( A410Invd_RegionalId, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_CENTROCOSTOID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A411Invd_CentroCostoId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INVD_CENTROCOSTOID", GXutil.ltrim( localUtil.ntoc( A411Invd_CentroCostoId, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_MODULOALMACEN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A412Invd_ModuloAlmacen, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INVD_MODULOALMACEN", A412Invd_ModuloAlmacen);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_ALMACENCODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A413Invd_AlmacenCodigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INVD_ALMACENCODIGO", A413Invd_AlmacenCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_BODEGACODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A414Invd_BodegaCodigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INVD_BODEGACODIGO", A414Invd_BodegaCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A463Invd_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INVD_ESTADO", A463Invd_Estado);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_VALORADQUISICION", getSecureSignedToken( sPrefix, localUtil.format( A465Invd_ValorAdquisicion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INVD_VALORADQUISICION", GXutil.ltrim( localUtil.ntoc( A465Invd_ValorAdquisicion, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_FECHAADQUISICION", getSecureSignedToken( sPrefix, A466Invd_FechaAdquisicion));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INVD_FECHAADQUISICION", localUtil.format(A466Invd_FechaAdquisicion, "99/99/99"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_PLACAPADRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A68Invd_PlacaPadre, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INVD_PLACAPADRE", A68Invd_PlacaPadre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_ESPLACAPADRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A501Invd_EsPlacaPadre, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INVD_ESPLACAPADRE", GXutil.rtrim( A501Invd_EsPlacaPadre));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_FECHASERVICIO", getSecureSignedToken( sPrefix, A467Invd_FechaServicio));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INVD_FECHASERVICIO", localUtil.format(A467Invd_FechaServicio, "99/99/99"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_IDENTIFICACION", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A43Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CUEN_IDENTIFICACION", GXutil.ltrim( localUtil.ntoc( A43Cuen_Identificacion, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_COSTO_DESMANTE", getSecureSignedToken( sPrefix, localUtil.format( A624Costo_Desmante, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"COSTO_DESMANTE", GXutil.ltrim( localUtil.ntoc( A624Costo_Desmante, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_VARIABLE_VF", getSecureSignedToken( sPrefix, localUtil.format( A625Variable_VF, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"VARIABLE_VF", GXutil.ltrim( localUtil.ntoc( A625Variable_VF, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_VARIABLE_I", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A626Variable_I), "ZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"VARIABLE_I", GXutil.ltrim( localUtil.ntoc( A626Variable_I, (byte)(3), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_VARIABLE_N", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A627Variable_N), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"VARIABLE_N", GXutil.ltrim( localUtil.ntoc( A627Variable_N, (byte)(4), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_OTROS_COSTOS_DEV", getSecureSignedToken( sPrefix, localUtil.format( A628Otros_Costos_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"OTROS_COSTOS_DEV", GXutil.ltrim( localUtil.ntoc( A628Otros_Costos_Dev, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_COSTO_TOTAL_DEV", getSecureSignedToken( sPrefix, localUtil.format( A629Costo_Total_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"COSTO_TOTAL_DEV", GXutil.ltrim( localUtil.ntoc( A629Costo_Total_Dev, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_VIDA_UTIL_INICIAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A630Vida_Util_Inicial), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"VIDA_UTIL_INICIAL", GXutil.ltrim( localUtil.ntoc( A630Vida_Util_Inicial, (byte)(4), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_VIDA_UTIL_ACTUAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A631Vida_Util_Actual), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"VIDA_UTIL_ACTUAL", GXutil.ltrim( localUtil.ntoc( A631Vida_Util_Actual, (byte)(4), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_AREADANTECODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A711Invd_AreadanteCodigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INVD_AREADANTECODIGO", A711Invd_AreadanteCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_ENTIDADGOBIERNO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A858Invd_EntidadGobierno, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INVD_ENTIDADGOBIERNO", A858Invd_EntidadGobierno);
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf4E2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV17Pgmname = "ALM_ELEMENTOALM_INVENTARIO_DEVOLUTIVOWC" ;
      Gx_err = (short)(0) ;
   }

   public void rf4E2( )
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
         /* Using cursor H004E2 */
         pr_default.execute(0, new Object[] {AV7Elem_Consecutivo, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_20_idx = (short)(1) ;
         sGXsfl_20_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_20_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_202( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_recordsperpage( ) ) ) ) )
         {
            A66Elem_Consecutivo = H004E2_A66Elem_Consecutivo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
            A858Invd_EntidadGobierno = H004E2_A858Invd_EntidadGobierno[0] ;
            n858Invd_EntidadGobierno = H004E2_n858Invd_EntidadGobierno[0] ;
            A711Invd_AreadanteCodigo = H004E2_A711Invd_AreadanteCodigo[0] ;
            n711Invd_AreadanteCodigo = H004E2_n711Invd_AreadanteCodigo[0] ;
            A44Cuen_Nombre = H004E2_A44Cuen_Nombre[0] ;
            n44Cuen_Nombre = H004E2_n44Cuen_Nombre[0] ;
            A688Cuen_Cedula = H004E2_A688Cuen_Cedula[0] ;
            A631Vida_Util_Actual = H004E2_A631Vida_Util_Actual[0] ;
            n631Vida_Util_Actual = H004E2_n631Vida_Util_Actual[0] ;
            A630Vida_Util_Inicial = H004E2_A630Vida_Util_Inicial[0] ;
            n630Vida_Util_Inicial = H004E2_n630Vida_Util_Inicial[0] ;
            A629Costo_Total_Dev = H004E2_A629Costo_Total_Dev[0] ;
            A628Otros_Costos_Dev = H004E2_A628Otros_Costos_Dev[0] ;
            n628Otros_Costos_Dev = H004E2_n628Otros_Costos_Dev[0] ;
            A627Variable_N = H004E2_A627Variable_N[0] ;
            n627Variable_N = H004E2_n627Variable_N[0] ;
            A626Variable_I = H004E2_A626Variable_I[0] ;
            n626Variable_I = H004E2_n626Variable_I[0] ;
            A625Variable_VF = H004E2_A625Variable_VF[0] ;
            n625Variable_VF = H004E2_n625Variable_VF[0] ;
            A624Costo_Desmante = H004E2_A624Costo_Desmante[0] ;
            n624Costo_Desmante = H004E2_n624Costo_Desmante[0] ;
            A43Cuen_Identificacion = H004E2_A43Cuen_Identificacion[0] ;
            n43Cuen_Identificacion = H004E2_n43Cuen_Identificacion[0] ;
            A467Invd_FechaServicio = H004E2_A467Invd_FechaServicio[0] ;
            n467Invd_FechaServicio = H004E2_n467Invd_FechaServicio[0] ;
            A501Invd_EsPlacaPadre = H004E2_A501Invd_EsPlacaPadre[0] ;
            n501Invd_EsPlacaPadre = H004E2_n501Invd_EsPlacaPadre[0] ;
            A68Invd_PlacaPadre = H004E2_A68Invd_PlacaPadre[0] ;
            n68Invd_PlacaPadre = H004E2_n68Invd_PlacaPadre[0] ;
            A466Invd_FechaAdquisicion = H004E2_A466Invd_FechaAdquisicion[0] ;
            n466Invd_FechaAdquisicion = H004E2_n466Invd_FechaAdquisicion[0] ;
            A465Invd_ValorAdquisicion = H004E2_A465Invd_ValorAdquisicion[0] ;
            n465Invd_ValorAdquisicion = H004E2_n465Invd_ValorAdquisicion[0] ;
            A463Invd_Estado = H004E2_A463Invd_Estado[0] ;
            n463Invd_Estado = H004E2_n463Invd_Estado[0] ;
            A414Invd_BodegaCodigo = H004E2_A414Invd_BodegaCodigo[0] ;
            A413Invd_AlmacenCodigo = H004E2_A413Invd_AlmacenCodigo[0] ;
            A412Invd_ModuloAlmacen = H004E2_A412Invd_ModuloAlmacen[0] ;
            A411Invd_CentroCostoId = H004E2_A411Invd_CentroCostoId[0] ;
            A410Invd_RegionalId = H004E2_A410Invd_RegionalId[0] ;
            A67Invd_NumeroPlaca = H004E2_A67Invd_NumeroPlaca[0] ;
            A44Cuen_Nombre = H004E2_A44Cuen_Nombre[0] ;
            n44Cuen_Nombre = H004E2_n44Cuen_Nombre[0] ;
            A688Cuen_Cedula = H004E2_A688Cuen_Cedula[0] ;
            e134E2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(20) ;
         wb4E0( ) ;
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
      /* Using cursor H004E3 */
      pr_default.execute(1, new Object[] {AV7Elem_Consecutivo});
      GRID_nRecordCount = H004E3_AGRID_nRecordCount[0] ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Elem_Consecutivo, AV12Update, AV13Delete, A67Invd_NumeroPlaca, A66Elem_Consecutivo, A43Cuen_Identificacion, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Elem_Consecutivo, AV12Update, AV13Delete, A67Invd_NumeroPlaca, A66Elem_Consecutivo, A43Cuen_Identificacion, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Elem_Consecutivo, AV12Update, AV13Delete, A67Invd_NumeroPlaca, A66Elem_Consecutivo, A43Cuen_Identificacion, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Elem_Consecutivo, AV12Update, AV13Delete, A67Invd_NumeroPlaca, A66Elem_Consecutivo, A43Cuen_Identificacion, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Elem_Consecutivo, AV12Update, AV13Delete, A67Invd_NumeroPlaca, A66Elem_Consecutivo, A43Cuen_Identificacion, sPrefix) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup4E0( )
   {
      /* Before Start, stand alone formulas. */
      AV17Pgmname = "ALM_ELEMENTOALM_INVENTARIO_DEVOLUTIVOWC" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e124E2 ();
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
         forbiddenHiddens = sPrefix + "hsh" + "ALM_ELEMENTOALM_INVENTARIO_DEVOLUTIVOWC" ;
         A66Elem_Consecutivo = httpContext.cgiGet( edtElem_Consecutivo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
         forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, "")) ;
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
         {
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            GXutil.writeLog("alm_elementoalm_inventario_devolutivowc:[SecurityCheckFailed]"+forbiddenHiddens);
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
      e124E2 ();
      if (returnInSub) return;
   }

   public void e124E2( )
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

   private void e134E2( )
   {
      /* Grid_Load Routine */
      edtavUpdate_Link = formatLink("com.orions2.alm_inventario_devolutivo") + "?" + GXutil.URLEncode(GXutil.rtrim("UPD")) + "," + GXutil.URLEncode(GXutil.rtrim(AV7Elem_Consecutivo)) + "," + GXutil.URLEncode(GXutil.rtrim(A67Invd_NumeroPlaca)) ;
      edtavDelete_Link = formatLink("com.orions2.alm_inventario_devolutivo") + "?" + GXutil.URLEncode(GXutil.rtrim("DLT")) + "," + GXutil.URLEncode(GXutil.rtrim(AV7Elem_Consecutivo)) + "," + GXutil.URLEncode(GXutil.rtrim(A67Invd_NumeroPlaca)) ;
      edtInvd_NumeroPlaca_Link = formatLink("com.orions2.viewalm_inventario_devolutivo") + "?" + GXutil.URLEncode(GXutil.rtrim(A67Invd_NumeroPlaca)) + "," + GXutil.URLEncode(GXutil.rtrim(A66Elem_Consecutivo)) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      edtCuen_Nombre_Link = formatLink("com.orions2.viewalm_cuentadante") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A43Cuen_Identificacion,18,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
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

   public void e114E2( )
   {
      /* 'DoInsert' Routine */
      callWebObject(formatLink("com.orions2.alm_inventario_devolutivo") + "?" + GXutil.URLEncode(GXutil.rtrim("INS")) + "," + GXutil.URLEncode(GXutil.rtrim(AV7Elem_Consecutivo)) + "," + GXutil.URLEncode(GXutil.rtrim("")));
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV10TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV17Pgmname );
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerondelete( true );
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV9HTTPRequest.getScriptName()+"?"+AV9HTTPRequest.getQuerystring() );
      AV10TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_INVENTARIO_DEVOLUTIVO" );
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
      pa4E2( ) ;
      ws4E2( ) ;
      we4E2( ) ;
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
      pa4E2( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "alm_elementoalm_inventario_devolutivowc");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa4E2( ) ;
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
      pa4E2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws4E2( ) ;
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
      ws4E2( ) ;
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
      we4E2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414152623");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("alm_elementoalm_inventario_devolutivowc.js", "?201861414152623");
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_202( )
   {
      edtInvd_NumeroPlaca_Internalname = sPrefix+"INVD_NUMEROPLACA_"+sGXsfl_20_idx ;
      edtInvd_RegionalId_Internalname = sPrefix+"INVD_REGIONALID_"+sGXsfl_20_idx ;
      edtInvd_CentroCostoId_Internalname = sPrefix+"INVD_CENTROCOSTOID_"+sGXsfl_20_idx ;
      cmbInvd_ModuloAlmacen.setInternalname( sPrefix+"INVD_MODULOALMACEN_"+sGXsfl_20_idx );
      edtInvd_AlmacenCodigo_Internalname = sPrefix+"INVD_ALMACENCODIGO_"+sGXsfl_20_idx ;
      edtInvd_BodegaCodigo_Internalname = sPrefix+"INVD_BODEGACODIGO_"+sGXsfl_20_idx ;
      cmbInvd_Estado.setInternalname( sPrefix+"INVD_ESTADO_"+sGXsfl_20_idx );
      edtInvd_ValorAdquisicion_Internalname = sPrefix+"INVD_VALORADQUISICION_"+sGXsfl_20_idx ;
      edtInvd_FechaAdquisicion_Internalname = sPrefix+"INVD_FECHAADQUISICION_"+sGXsfl_20_idx ;
      edtInvd_PlacaPadre_Internalname = sPrefix+"INVD_PLACAPADRE_"+sGXsfl_20_idx ;
      edtInvd_EsPlacaPadre_Internalname = sPrefix+"INVD_ESPLACAPADRE_"+sGXsfl_20_idx ;
      edtInvd_FechaServicio_Internalname = sPrefix+"INVD_FECHASERVICIO_"+sGXsfl_20_idx ;
      edtCuen_Identificacion_Internalname = sPrefix+"CUEN_IDENTIFICACION_"+sGXsfl_20_idx ;
      edtCosto_Desmante_Internalname = sPrefix+"COSTO_DESMANTE_"+sGXsfl_20_idx ;
      edtVariable_VF_Internalname = sPrefix+"VARIABLE_VF_"+sGXsfl_20_idx ;
      edtVariable_I_Internalname = sPrefix+"VARIABLE_I_"+sGXsfl_20_idx ;
      edtVariable_N_Internalname = sPrefix+"VARIABLE_N_"+sGXsfl_20_idx ;
      edtOtros_Costos_Dev_Internalname = sPrefix+"OTROS_COSTOS_DEV_"+sGXsfl_20_idx ;
      edtCosto_Total_Dev_Internalname = sPrefix+"COSTO_TOTAL_DEV_"+sGXsfl_20_idx ;
      edtVida_Util_Inicial_Internalname = sPrefix+"VIDA_UTIL_INICIAL_"+sGXsfl_20_idx ;
      edtVida_Util_Actual_Internalname = sPrefix+"VIDA_UTIL_ACTUAL_"+sGXsfl_20_idx ;
      edtCuen_Cedula_Internalname = sPrefix+"CUEN_CEDULA_"+sGXsfl_20_idx ;
      edtCuen_Nombre_Internalname = sPrefix+"CUEN_NOMBRE_"+sGXsfl_20_idx ;
      edtInvd_AreadanteCodigo_Internalname = sPrefix+"INVD_AREADANTECODIGO_"+sGXsfl_20_idx ;
      cmbInvd_EntidadGobierno.setInternalname( sPrefix+"INVD_ENTIDADGOBIERNO_"+sGXsfl_20_idx );
      edtavUpdate_Internalname = sPrefix+"vUPDATE_"+sGXsfl_20_idx ;
      edtavDelete_Internalname = sPrefix+"vDELETE_"+sGXsfl_20_idx ;
   }

   public void subsflControlProps_fel_202( )
   {
      edtInvd_NumeroPlaca_Internalname = sPrefix+"INVD_NUMEROPLACA_"+sGXsfl_20_fel_idx ;
      edtInvd_RegionalId_Internalname = sPrefix+"INVD_REGIONALID_"+sGXsfl_20_fel_idx ;
      edtInvd_CentroCostoId_Internalname = sPrefix+"INVD_CENTROCOSTOID_"+sGXsfl_20_fel_idx ;
      cmbInvd_ModuloAlmacen.setInternalname( sPrefix+"INVD_MODULOALMACEN_"+sGXsfl_20_fel_idx );
      edtInvd_AlmacenCodigo_Internalname = sPrefix+"INVD_ALMACENCODIGO_"+sGXsfl_20_fel_idx ;
      edtInvd_BodegaCodigo_Internalname = sPrefix+"INVD_BODEGACODIGO_"+sGXsfl_20_fel_idx ;
      cmbInvd_Estado.setInternalname( sPrefix+"INVD_ESTADO_"+sGXsfl_20_fel_idx );
      edtInvd_ValorAdquisicion_Internalname = sPrefix+"INVD_VALORADQUISICION_"+sGXsfl_20_fel_idx ;
      edtInvd_FechaAdquisicion_Internalname = sPrefix+"INVD_FECHAADQUISICION_"+sGXsfl_20_fel_idx ;
      edtInvd_PlacaPadre_Internalname = sPrefix+"INVD_PLACAPADRE_"+sGXsfl_20_fel_idx ;
      edtInvd_EsPlacaPadre_Internalname = sPrefix+"INVD_ESPLACAPADRE_"+sGXsfl_20_fel_idx ;
      edtInvd_FechaServicio_Internalname = sPrefix+"INVD_FECHASERVICIO_"+sGXsfl_20_fel_idx ;
      edtCuen_Identificacion_Internalname = sPrefix+"CUEN_IDENTIFICACION_"+sGXsfl_20_fel_idx ;
      edtCosto_Desmante_Internalname = sPrefix+"COSTO_DESMANTE_"+sGXsfl_20_fel_idx ;
      edtVariable_VF_Internalname = sPrefix+"VARIABLE_VF_"+sGXsfl_20_fel_idx ;
      edtVariable_I_Internalname = sPrefix+"VARIABLE_I_"+sGXsfl_20_fel_idx ;
      edtVariable_N_Internalname = sPrefix+"VARIABLE_N_"+sGXsfl_20_fel_idx ;
      edtOtros_Costos_Dev_Internalname = sPrefix+"OTROS_COSTOS_DEV_"+sGXsfl_20_fel_idx ;
      edtCosto_Total_Dev_Internalname = sPrefix+"COSTO_TOTAL_DEV_"+sGXsfl_20_fel_idx ;
      edtVida_Util_Inicial_Internalname = sPrefix+"VIDA_UTIL_INICIAL_"+sGXsfl_20_fel_idx ;
      edtVida_Util_Actual_Internalname = sPrefix+"VIDA_UTIL_ACTUAL_"+sGXsfl_20_fel_idx ;
      edtCuen_Cedula_Internalname = sPrefix+"CUEN_CEDULA_"+sGXsfl_20_fel_idx ;
      edtCuen_Nombre_Internalname = sPrefix+"CUEN_NOMBRE_"+sGXsfl_20_fel_idx ;
      edtInvd_AreadanteCodigo_Internalname = sPrefix+"INVD_AREADANTECODIGO_"+sGXsfl_20_fel_idx ;
      cmbInvd_EntidadGobierno.setInternalname( sPrefix+"INVD_ENTIDADGOBIERNO_"+sGXsfl_20_fel_idx );
      edtavUpdate_Internalname = sPrefix+"vUPDATE_"+sGXsfl_20_fel_idx ;
      edtavDelete_Internalname = sPrefix+"vDELETE_"+sGXsfl_20_fel_idx ;
   }

   public void sendrow_202( )
   {
      subsflControlProps_202( ) ;
      wb4E0( ) ;
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
         ROClassString = "DescriptionAttribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_NumeroPlaca_Internalname,A67Invd_NumeroPlaca,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'",edtInvd_NumeroPlaca_Link,"","","",edtInvd_NumeroPlaca_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_RegionalId_Internalname,GXutil.ltrim( localUtil.ntoc( A410Invd_RegionalId, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A410Invd_RegionalId), "ZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtInvd_RegionalId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_CentroCostoId_Internalname,GXutil.ltrim( localUtil.ntoc( A411Invd_CentroCostoId, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A411Invd_CentroCostoId), "ZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtInvd_CentroCostoId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_20_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "INVD_MODULOALMACEN_" + sGXsfl_20_idx ;
            cmbInvd_ModuloAlmacen.setName( GXCCtl );
            cmbInvd_ModuloAlmacen.setWebtags( "" );
            cmbInvd_ModuloAlmacen.addItem("", "", (short)(0));
            cmbInvd_ModuloAlmacen.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
            cmbInvd_ModuloAlmacen.addItem("INVE", "INVENTARIO", (short)(0));
            cmbInvd_ModuloAlmacen.addItem("ALMA", "ALMACEN", (short)(0));
            if ( cmbInvd_ModuloAlmacen.getItemCount() > 0 )
            {
               A412Invd_ModuloAlmacen = cmbInvd_ModuloAlmacen.getValidValue(A412Invd_ModuloAlmacen) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbInvd_ModuloAlmacen,cmbInvd_ModuloAlmacen.getInternalname(),GXutil.rtrim( A412Invd_ModuloAlmacen),new Integer(1),cmbInvd_ModuloAlmacen.getJsonclick(),new Integer(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbInvd_ModuloAlmacen.setValue( GXutil.rtrim( A412Invd_ModuloAlmacen) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbInvd_ModuloAlmacen.getInternalname(), "Values", cmbInvd_ModuloAlmacen.ToJavascriptSource(), !bGXsfl_20_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_AlmacenCodigo_Internalname,A413Invd_AlmacenCodigo,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtInvd_AlmacenCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_BodegaCodigo_Internalname,A414Invd_BodegaCodigo,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtInvd_BodegaCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_20_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "INVD_ESTADO_" + sGXsfl_20_idx ;
            cmbInvd_Estado.setName( GXCCtl );
            cmbInvd_Estado.setWebtags( "" );
            cmbInvd_Estado.addItem("R", "Ratificado", (short)(0));
            cmbInvd_Estado.addItem("P", "Pendiente", (short)(0));
            if ( cmbInvd_Estado.getItemCount() > 0 )
            {
               A463Invd_Estado = cmbInvd_Estado.getValidValue(A463Invd_Estado) ;
               n463Invd_Estado = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbInvd_Estado,cmbInvd_Estado.getInternalname(),GXutil.rtrim( A463Invd_Estado),new Integer(1),cmbInvd_Estado.getJsonclick(),new Integer(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbInvd_Estado.setValue( GXutil.rtrim( A463Invd_Estado) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbInvd_Estado.getInternalname(), "Values", cmbInvd_Estado.ToJavascriptSource(), !bGXsfl_20_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_ValorAdquisicion_Internalname,GXutil.ltrim( localUtil.ntoc( A465Invd_ValorAdquisicion, (byte)(24), (byte)(2), ",", "")),localUtil.format( A465Invd_ValorAdquisicion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtInvd_ValorAdquisicion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Valor","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_FechaAdquisicion_Internalname,localUtil.format(A466Invd_FechaAdquisicion, "99/99/99"),localUtil.format( A466Invd_FechaAdquisicion, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtInvd_FechaAdquisicion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Fecha","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_PlacaPadre_Internalname,A68Invd_PlacaPadre,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtInvd_PlacaPadre_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_EsPlacaPadre_Internalname,GXutil.rtrim( A501Invd_EsPlacaPadre),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtInvd_EsPlacaPadre_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_FechaServicio_Internalname,localUtil.format(A467Invd_FechaServicio, "99/99/99"),localUtil.format( A467Invd_FechaServicio, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtInvd_FechaServicio_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Fecha","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_Identificacion_Internalname,GXutil.ltrim( localUtil.ntoc( A43Cuen_Identificacion, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A43Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCuen_Identificacion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCosto_Desmante_Internalname,GXutil.ltrim( localUtil.ntoc( A624Costo_Desmante, (byte)(24), (byte)(2), ",", "")),localUtil.format( A624Costo_Desmante, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCosto_Desmante_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Valor","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVariable_VF_Internalname,GXutil.ltrim( localUtil.ntoc( A625Variable_VF, (byte)(24), (byte)(2), ",", "")),localUtil.format( A625Variable_VF, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtVariable_VF_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Valor","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVariable_I_Internalname,GXutil.ltrim( localUtil.ntoc( A626Variable_I, (byte)(3), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A626Variable_I), "ZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtVariable_I_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVariable_N_Internalname,GXutil.ltrim( localUtil.ntoc( A627Variable_N, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A627Variable_N), "ZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtVariable_N_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOtros_Costos_Dev_Internalname,GXutil.ltrim( localUtil.ntoc( A628Otros_Costos_Dev, (byte)(24), (byte)(2), ",", "")),localUtil.format( A628Otros_Costos_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtOtros_Costos_Dev_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Valor","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCosto_Total_Dev_Internalname,GXutil.ltrim( localUtil.ntoc( A629Costo_Total_Dev, (byte)(24), (byte)(2), ",", "")),localUtil.format( A629Costo_Total_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCosto_Total_Dev_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Valor","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVida_Util_Inicial_Internalname,GXutil.ltrim( localUtil.ntoc( A630Vida_Util_Inicial, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A630Vida_Util_Inicial), "ZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtVida_Util_Inicial_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVida_Util_Actual_Internalname,GXutil.ltrim( localUtil.ntoc( A631Vida_Util_Actual, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A631Vida_Util_Actual), "ZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtVida_Util_Actual_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_Cedula_Internalname,GXutil.ltrim( localUtil.ntoc( A688Cuen_Cedula, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A688Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCuen_Cedula_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_Nombre_Internalname,A44Cuen_Nombre,GXutil.rtrim( localUtil.format( A44Cuen_Nombre, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'",edtCuen_Nombre_Link,"","","",edtCuen_Nombre_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_AreadanteCodigo_Internalname,A711Invd_AreadanteCodigo,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtInvd_AreadanteCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(20),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_20_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "INVD_ENTIDADGOBIERNO_" + sGXsfl_20_idx ;
            cmbInvd_EntidadGobierno.setName( GXCCtl );
            cmbInvd_EntidadGobierno.setWebtags( "" );
            cmbInvd_EntidadGobierno.addItem("", "", (short)(0));
            cmbInvd_EntidadGobierno.addItem("SI", "SI", (short)(0));
            cmbInvd_EntidadGobierno.addItem("NO", "NO", (short)(0));
            if ( cmbInvd_EntidadGobierno.getItemCount() > 0 )
            {
               A858Invd_EntidadGobierno = cmbInvd_EntidadGobierno.getValidValue(A858Invd_EntidadGobierno) ;
               n858Invd_EntidadGobierno = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbInvd_EntidadGobierno,cmbInvd_EntidadGobierno.getInternalname(),GXutil.rtrim( A858Invd_EntidadGobierno),new Integer(1),cmbInvd_EntidadGobierno.getJsonclick(),new Integer(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbInvd_EntidadGobierno.setValue( GXutil.rtrim( A858Invd_EntidadGobierno) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbInvd_EntidadGobierno.getInternalname(), "Values", cmbInvd_EntidadGobierno.ToJavascriptSource(), !bGXsfl_20_Refreshing);
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
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_REGIONALID"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A410Invd_RegionalId), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_CENTROCOSTOID"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A411Invd_CentroCostoId), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_MODULOALMACEN"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A412Invd_ModuloAlmacen, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_ALMACENCODIGO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A413Invd_AlmacenCodigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_BODEGACODIGO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A414Invd_BodegaCodigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_ESTADO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A463Invd_Estado, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_VALORADQUISICION"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( A465Invd_ValorAdquisicion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_FECHAADQUISICION"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, A466Invd_FechaAdquisicion));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_PLACAPADRE"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A68Invd_PlacaPadre, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_ESPLACAPADRE"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A501Invd_EsPlacaPadre, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_FECHASERVICIO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, A467Invd_FechaServicio));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_IDENTIFICACION"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A43Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_COSTO_DESMANTE"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( A624Costo_Desmante, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_VARIABLE_VF"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( A625Variable_VF, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_VARIABLE_I"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A626Variable_I), "ZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_VARIABLE_N"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A627Variable_N), "ZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_OTROS_COSTOS_DEV"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( A628Otros_Costos_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_COSTO_TOTAL_DEV"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( A629Costo_Total_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_VIDA_UTIL_INICIAL"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A630Vida_Util_Inicial), "ZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_VIDA_UTIL_ACTUAL"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A631Vida_Util_Actual), "ZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_AREADANTECODIGO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A711Invd_AreadanteCodigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_ENTIDADGOBIERNO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A858Invd_EntidadGobierno, ""))));
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
      edtInvd_NumeroPlaca_Internalname = sPrefix+"INVD_NUMEROPLACA" ;
      edtInvd_RegionalId_Internalname = sPrefix+"INVD_REGIONALID" ;
      edtInvd_CentroCostoId_Internalname = sPrefix+"INVD_CENTROCOSTOID" ;
      cmbInvd_ModuloAlmacen.setInternalname( sPrefix+"INVD_MODULOALMACEN" );
      edtInvd_AlmacenCodigo_Internalname = sPrefix+"INVD_ALMACENCODIGO" ;
      edtInvd_BodegaCodigo_Internalname = sPrefix+"INVD_BODEGACODIGO" ;
      cmbInvd_Estado.setInternalname( sPrefix+"INVD_ESTADO" );
      edtInvd_ValorAdquisicion_Internalname = sPrefix+"INVD_VALORADQUISICION" ;
      edtInvd_FechaAdquisicion_Internalname = sPrefix+"INVD_FECHAADQUISICION" ;
      edtInvd_PlacaPadre_Internalname = sPrefix+"INVD_PLACAPADRE" ;
      edtInvd_EsPlacaPadre_Internalname = sPrefix+"INVD_ESPLACAPADRE" ;
      edtInvd_FechaServicio_Internalname = sPrefix+"INVD_FECHASERVICIO" ;
      edtCuen_Identificacion_Internalname = sPrefix+"CUEN_IDENTIFICACION" ;
      edtCosto_Desmante_Internalname = sPrefix+"COSTO_DESMANTE" ;
      edtVariable_VF_Internalname = sPrefix+"VARIABLE_VF" ;
      edtVariable_I_Internalname = sPrefix+"VARIABLE_I" ;
      edtVariable_N_Internalname = sPrefix+"VARIABLE_N" ;
      edtOtros_Costos_Dev_Internalname = sPrefix+"OTROS_COSTOS_DEV" ;
      edtCosto_Total_Dev_Internalname = sPrefix+"COSTO_TOTAL_DEV" ;
      edtVida_Util_Inicial_Internalname = sPrefix+"VIDA_UTIL_INICIAL" ;
      edtVida_Util_Actual_Internalname = sPrefix+"VIDA_UTIL_ACTUAL" ;
      edtCuen_Cedula_Internalname = sPrefix+"CUEN_CEDULA" ;
      edtCuen_Nombre_Internalname = sPrefix+"CUEN_NOMBRE" ;
      edtInvd_AreadanteCodigo_Internalname = sPrefix+"INVD_AREADANTECODIGO" ;
      cmbInvd_EntidadGobierno.setInternalname( sPrefix+"INVD_ENTIDADGOBIERNO" );
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
      cmbInvd_EntidadGobierno.setJsonclick( "" );
      edtInvd_AreadanteCodigo_Jsonclick = "" ;
      edtCuen_Nombre_Jsonclick = "" ;
      edtCuen_Cedula_Jsonclick = "" ;
      edtVida_Util_Actual_Jsonclick = "" ;
      edtVida_Util_Inicial_Jsonclick = "" ;
      edtCosto_Total_Dev_Jsonclick = "" ;
      edtOtros_Costos_Dev_Jsonclick = "" ;
      edtVariable_N_Jsonclick = "" ;
      edtVariable_I_Jsonclick = "" ;
      edtVariable_VF_Jsonclick = "" ;
      edtCosto_Desmante_Jsonclick = "" ;
      edtCuen_Identificacion_Jsonclick = "" ;
      edtInvd_FechaServicio_Jsonclick = "" ;
      edtInvd_EsPlacaPadre_Jsonclick = "" ;
      edtInvd_PlacaPadre_Jsonclick = "" ;
      edtInvd_FechaAdquisicion_Jsonclick = "" ;
      edtInvd_ValorAdquisicion_Jsonclick = "" ;
      cmbInvd_Estado.setJsonclick( "" );
      edtInvd_BodegaCodigo_Jsonclick = "" ;
      edtInvd_AlmacenCodigo_Jsonclick = "" ;
      cmbInvd_ModuloAlmacen.setJsonclick( "" );
      edtInvd_CentroCostoId_Jsonclick = "" ;
      edtInvd_RegionalId_Jsonclick = "" ;
      edtInvd_NumeroPlaca_Jsonclick = "" ;
      edtElem_Consecutivo_Jsonclick = "" ;
      edtElem_Consecutivo_Enabled = 0 ;
      edtElem_Consecutivo_Visible = 1 ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      edtavDelete_Link = "" ;
      edtavUpdate_Link = "" ;
      edtCuen_Nombre_Link = "" ;
      edtInvd_NumeroPlaca_Link = "" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Elem_Consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',nv:''},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A43Cuen_Identificacion',fld:'CUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e134E2',iparms:[{av:'AV7Elem_Consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',nv:''},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A43Cuen_Identificacion',fld:'CUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[{av:'edtavUpdate_Link',ctrl:'vUPDATE',prop:'Link'},{av:'edtavDelete_Link',ctrl:'vDELETE',prop:'Link'},{av:'edtInvd_NumeroPlaca_Link',ctrl:'INVD_NUMEROPLACA',prop:'Link'},{av:'edtCuen_Nombre_Link',ctrl:'CUEN_NOMBRE',prop:'Link'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e114E2',iparms:[{av:'AV7Elem_Consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Elem_Consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',nv:''},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A43Cuen_Identificacion',fld:'CUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Elem_Consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',nv:''},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A43Cuen_Identificacion',fld:'CUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Elem_Consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',nv:''},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A43Cuen_Identificacion',fld:'CUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Elem_Consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',nv:''},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A43Cuen_Identificacion',fld:'CUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
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
      A67Invd_NumeroPlaca = "" ;
      A66Elem_Consecutivo = "" ;
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
      A412Invd_ModuloAlmacen = "" ;
      A413Invd_AlmacenCodigo = "" ;
      A414Invd_BodegaCodigo = "" ;
      A463Invd_Estado = "" ;
      A465Invd_ValorAdquisicion = DecimalUtil.ZERO ;
      A466Invd_FechaAdquisicion = GXutil.nullDate() ;
      A68Invd_PlacaPadre = "" ;
      A501Invd_EsPlacaPadre = "" ;
      A467Invd_FechaServicio = GXutil.nullDate() ;
      A624Costo_Desmante = DecimalUtil.ZERO ;
      A625Variable_VF = DecimalUtil.ZERO ;
      A628Otros_Costos_Dev = DecimalUtil.ZERO ;
      A629Costo_Total_Dev = DecimalUtil.ZERO ;
      A44Cuen_Nombre = "" ;
      A711Invd_AreadanteCodigo = "" ;
      A858Invd_EntidadGobierno = "" ;
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
      H004E2_A66Elem_Consecutivo = new String[] {""} ;
      H004E2_A858Invd_EntidadGobierno = new String[] {""} ;
      H004E2_n858Invd_EntidadGobierno = new boolean[] {false} ;
      H004E2_A711Invd_AreadanteCodigo = new String[] {""} ;
      H004E2_n711Invd_AreadanteCodigo = new boolean[] {false} ;
      H004E2_A44Cuen_Nombre = new String[] {""} ;
      H004E2_n44Cuen_Nombre = new boolean[] {false} ;
      H004E2_A688Cuen_Cedula = new long[1] ;
      H004E2_A631Vida_Util_Actual = new short[1] ;
      H004E2_n631Vida_Util_Actual = new boolean[] {false} ;
      H004E2_A630Vida_Util_Inicial = new short[1] ;
      H004E2_n630Vida_Util_Inicial = new boolean[] {false} ;
      H004E2_A629Costo_Total_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H004E2_A628Otros_Costos_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H004E2_n628Otros_Costos_Dev = new boolean[] {false} ;
      H004E2_A627Variable_N = new short[1] ;
      H004E2_n627Variable_N = new boolean[] {false} ;
      H004E2_A626Variable_I = new short[1] ;
      H004E2_n626Variable_I = new boolean[] {false} ;
      H004E2_A625Variable_VF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H004E2_n625Variable_VF = new boolean[] {false} ;
      H004E2_A624Costo_Desmante = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H004E2_n624Costo_Desmante = new boolean[] {false} ;
      H004E2_A43Cuen_Identificacion = new long[1] ;
      H004E2_n43Cuen_Identificacion = new boolean[] {false} ;
      H004E2_A467Invd_FechaServicio = new java.util.Date[] {GXutil.nullDate()} ;
      H004E2_n467Invd_FechaServicio = new boolean[] {false} ;
      H004E2_A501Invd_EsPlacaPadre = new String[] {""} ;
      H004E2_n501Invd_EsPlacaPadre = new boolean[] {false} ;
      H004E2_A68Invd_PlacaPadre = new String[] {""} ;
      H004E2_n68Invd_PlacaPadre = new boolean[] {false} ;
      H004E2_A466Invd_FechaAdquisicion = new java.util.Date[] {GXutil.nullDate()} ;
      H004E2_n466Invd_FechaAdquisicion = new boolean[] {false} ;
      H004E2_A465Invd_ValorAdquisicion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H004E2_n465Invd_ValorAdquisicion = new boolean[] {false} ;
      H004E2_A463Invd_Estado = new String[] {""} ;
      H004E2_n463Invd_Estado = new boolean[] {false} ;
      H004E2_A414Invd_BodegaCodigo = new String[] {""} ;
      H004E2_A413Invd_AlmacenCodigo = new String[] {""} ;
      H004E2_A412Invd_ModuloAlmacen = new String[] {""} ;
      H004E2_A411Invd_CentroCostoId = new long[1] ;
      H004E2_A410Invd_RegionalId = new long[1] ;
      H004E2_A67Invd_NumeroPlaca = new String[] {""} ;
      H004E3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_elementoalm_inventario_devolutivowc__default(),
         new Object[] {
             new Object[] {
            H004E2_A66Elem_Consecutivo, H004E2_A858Invd_EntidadGobierno, H004E2_n858Invd_EntidadGobierno, H004E2_A711Invd_AreadanteCodigo, H004E2_n711Invd_AreadanteCodigo, H004E2_A44Cuen_Nombre, H004E2_n44Cuen_Nombre, H004E2_A688Cuen_Cedula, H004E2_A631Vida_Util_Actual, H004E2_n631Vida_Util_Actual,
            H004E2_A630Vida_Util_Inicial, H004E2_n630Vida_Util_Inicial, H004E2_A629Costo_Total_Dev, H004E2_A628Otros_Costos_Dev, H004E2_n628Otros_Costos_Dev, H004E2_A627Variable_N, H004E2_n627Variable_N, H004E2_A626Variable_I, H004E2_n626Variable_I, H004E2_A625Variable_VF,
            H004E2_n625Variable_VF, H004E2_A624Costo_Desmante, H004E2_n624Costo_Desmante, H004E2_A43Cuen_Identificacion, H004E2_n43Cuen_Identificacion, H004E2_A467Invd_FechaServicio, H004E2_n467Invd_FechaServicio, H004E2_A501Invd_EsPlacaPadre, H004E2_n501Invd_EsPlacaPadre, H004E2_A68Invd_PlacaPadre,
            H004E2_n68Invd_PlacaPadre, H004E2_A466Invd_FechaAdquisicion, H004E2_n466Invd_FechaAdquisicion, H004E2_A465Invd_ValorAdquisicion, H004E2_n465Invd_ValorAdquisicion, H004E2_A463Invd_Estado, H004E2_n463Invd_Estado, H004E2_A414Invd_BodegaCodigo, H004E2_A413Invd_AlmacenCodigo, H004E2_A412Invd_ModuloAlmacen,
            H004E2_A411Invd_CentroCostoId, H004E2_A410Invd_RegionalId, H004E2_A67Invd_NumeroPlaca
            }
            , new Object[] {
            H004E3_AGRID_nRecordCount
            }
         }
      );
      AV17Pgmname = "ALM_ELEMENTOALM_INVENTARIO_DEVOLUTIVOWC" ;
      /* GeneXus formulas. */
      AV17Pgmname = "ALM_ELEMENTOALM_INVENTARIO_DEVOLUTIVOWC" ;
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
   private short A626Variable_I ;
   private short A627Variable_N ;
   private short A630Vida_Util_Inicial ;
   private short A631Vida_Util_Actual ;
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
   private long A43Cuen_Identificacion ;
   private long GRID_nFirstRecordOnPage ;
   private long A410Invd_RegionalId ;
   private long A411Invd_CentroCostoId ;
   private long A688Cuen_Cedula ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal A465Invd_ValorAdquisicion ;
   private java.math.BigDecimal A624Costo_Desmante ;
   private java.math.BigDecimal A625Variable_VF ;
   private java.math.BigDecimal A628Otros_Costos_Dev ;
   private java.math.BigDecimal A629Costo_Total_Dev ;
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
   private String edtInvd_NumeroPlaca_Link ;
   private String A501Invd_EsPlacaPadre ;
   private String edtCuen_Nombre_Link ;
   private String edtavUpdate_Link ;
   private String edtavDelete_Link ;
   private String edtElem_Consecutivo_Internalname ;
   private String edtElem_Consecutivo_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtInvd_NumeroPlaca_Internalname ;
   private String edtInvd_RegionalId_Internalname ;
   private String edtInvd_CentroCostoId_Internalname ;
   private String edtInvd_AlmacenCodigo_Internalname ;
   private String edtInvd_BodegaCodigo_Internalname ;
   private String edtInvd_ValorAdquisicion_Internalname ;
   private String edtInvd_FechaAdquisicion_Internalname ;
   private String edtInvd_PlacaPadre_Internalname ;
   private String edtInvd_EsPlacaPadre_Internalname ;
   private String edtInvd_FechaServicio_Internalname ;
   private String edtCuen_Identificacion_Internalname ;
   private String edtCosto_Desmante_Internalname ;
   private String edtVariable_VF_Internalname ;
   private String edtVariable_I_Internalname ;
   private String edtVariable_N_Internalname ;
   private String edtOtros_Costos_Dev_Internalname ;
   private String edtCosto_Total_Dev_Internalname ;
   private String edtVida_Util_Inicial_Internalname ;
   private String edtVida_Util_Actual_Internalname ;
   private String edtCuen_Cedula_Internalname ;
   private String edtCuen_Nombre_Internalname ;
   private String edtInvd_AreadanteCodigo_Internalname ;
   private String GXCCtl ;
   private String AV17Pgmname ;
   private String scmdbuf ;
   private String hsh ;
   private String sCtrlAV7Elem_Consecutivo ;
   private String sGXsfl_20_fel_idx="0001" ;
   private String ROClassString ;
   private String edtInvd_NumeroPlaca_Jsonclick ;
   private String edtInvd_RegionalId_Jsonclick ;
   private String edtInvd_CentroCostoId_Jsonclick ;
   private String edtInvd_AlmacenCodigo_Jsonclick ;
   private String edtInvd_BodegaCodigo_Jsonclick ;
   private String edtInvd_ValorAdquisicion_Jsonclick ;
   private String edtInvd_FechaAdquisicion_Jsonclick ;
   private String edtInvd_PlacaPadre_Jsonclick ;
   private String edtInvd_EsPlacaPadre_Jsonclick ;
   private String edtInvd_FechaServicio_Jsonclick ;
   private String edtCuen_Identificacion_Jsonclick ;
   private String edtCosto_Desmante_Jsonclick ;
   private String edtVariable_VF_Jsonclick ;
   private String edtVariable_I_Jsonclick ;
   private String edtVariable_N_Jsonclick ;
   private String edtOtros_Costos_Dev_Jsonclick ;
   private String edtCosto_Total_Dev_Jsonclick ;
   private String edtVida_Util_Inicial_Jsonclick ;
   private String edtVida_Util_Actual_Jsonclick ;
   private String edtCuen_Cedula_Jsonclick ;
   private String edtCuen_Nombre_Jsonclick ;
   private String edtInvd_AreadanteCodigo_Jsonclick ;
   private String sImgUrl ;
   private java.util.Date A466Invd_FechaAdquisicion ;
   private java.util.Date A467Invd_FechaServicio ;
   private boolean entryPointCalled ;
   private boolean bGXsfl_20_Refreshing=false ;
   private boolean n43Cuen_Identificacion ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n463Invd_Estado ;
   private boolean n465Invd_ValorAdquisicion ;
   private boolean n466Invd_FechaAdquisicion ;
   private boolean n68Invd_PlacaPadre ;
   private boolean n501Invd_EsPlacaPadre ;
   private boolean n467Invd_FechaServicio ;
   private boolean n624Costo_Desmante ;
   private boolean n625Variable_VF ;
   private boolean n626Variable_I ;
   private boolean n627Variable_N ;
   private boolean n628Otros_Costos_Dev ;
   private boolean n630Vida_Util_Inicial ;
   private boolean n631Vida_Util_Actual ;
   private boolean n44Cuen_Nombre ;
   private boolean n711Invd_AreadanteCodigo ;
   private boolean n858Invd_EntidadGobierno ;
   private boolean returnInSub ;
   private boolean AV12Update_IsBlob ;
   private boolean AV13Delete_IsBlob ;
   private String wcpOAV7Elem_Consecutivo ;
   private String AV7Elem_Consecutivo ;
   private String A67Invd_NumeroPlaca ;
   private String A66Elem_Consecutivo ;
   private String A412Invd_ModuloAlmacen ;
   private String A413Invd_AlmacenCodigo ;
   private String A414Invd_BodegaCodigo ;
   private String A463Invd_Estado ;
   private String A68Invd_PlacaPadre ;
   private String A44Cuen_Nombre ;
   private String A711Invd_AreadanteCodigo ;
   private String A858Invd_EntidadGobierno ;
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
   private HTMLChoice cmbInvd_ModuloAlmacen ;
   private HTMLChoice cmbInvd_Estado ;
   private HTMLChoice cmbInvd_EntidadGobierno ;
   private IDataStoreProvider pr_default ;
   private String[] H004E2_A66Elem_Consecutivo ;
   private String[] H004E2_A858Invd_EntidadGobierno ;
   private boolean[] H004E2_n858Invd_EntidadGobierno ;
   private String[] H004E2_A711Invd_AreadanteCodigo ;
   private boolean[] H004E2_n711Invd_AreadanteCodigo ;
   private String[] H004E2_A44Cuen_Nombre ;
   private boolean[] H004E2_n44Cuen_Nombre ;
   private long[] H004E2_A688Cuen_Cedula ;
   private short[] H004E2_A631Vida_Util_Actual ;
   private boolean[] H004E2_n631Vida_Util_Actual ;
   private short[] H004E2_A630Vida_Util_Inicial ;
   private boolean[] H004E2_n630Vida_Util_Inicial ;
   private java.math.BigDecimal[] H004E2_A629Costo_Total_Dev ;
   private java.math.BigDecimal[] H004E2_A628Otros_Costos_Dev ;
   private boolean[] H004E2_n628Otros_Costos_Dev ;
   private short[] H004E2_A627Variable_N ;
   private boolean[] H004E2_n627Variable_N ;
   private short[] H004E2_A626Variable_I ;
   private boolean[] H004E2_n626Variable_I ;
   private java.math.BigDecimal[] H004E2_A625Variable_VF ;
   private boolean[] H004E2_n625Variable_VF ;
   private java.math.BigDecimal[] H004E2_A624Costo_Desmante ;
   private boolean[] H004E2_n624Costo_Desmante ;
   private long[] H004E2_A43Cuen_Identificacion ;
   private boolean[] H004E2_n43Cuen_Identificacion ;
   private java.util.Date[] H004E2_A467Invd_FechaServicio ;
   private boolean[] H004E2_n467Invd_FechaServicio ;
   private String[] H004E2_A501Invd_EsPlacaPadre ;
   private boolean[] H004E2_n501Invd_EsPlacaPadre ;
   private String[] H004E2_A68Invd_PlacaPadre ;
   private boolean[] H004E2_n68Invd_PlacaPadre ;
   private java.util.Date[] H004E2_A466Invd_FechaAdquisicion ;
   private boolean[] H004E2_n466Invd_FechaAdquisicion ;
   private java.math.BigDecimal[] H004E2_A465Invd_ValorAdquisicion ;
   private boolean[] H004E2_n465Invd_ValorAdquisicion ;
   private String[] H004E2_A463Invd_Estado ;
   private boolean[] H004E2_n463Invd_Estado ;
   private String[] H004E2_A414Invd_BodegaCodigo ;
   private String[] H004E2_A413Invd_AlmacenCodigo ;
   private String[] H004E2_A412Invd_ModuloAlmacen ;
   private long[] H004E2_A411Invd_CentroCostoId ;
   private long[] H004E2_A410Invd_RegionalId ;
   private String[] H004E2_A67Invd_NumeroPlaca ;
   private long[] H004E3_AGRID_nRecordCount ;
   private com.genexus.webpanels.WebSession AV8Session ;
   private com.orions2.SdtTransactionContext AV10TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV11TrnContextAtt ;
}

final  class alm_elementoalm_inventario_devolutivowc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H004E2", "SELECT T1.Elem_Consecutivo, T1.Invd_EntidadGobierno, T1.Invd_AreadanteCodigo, T2.Cuen_Nombre, T2.Cuen_Cedula, T1.Vida_Util_Actual, T1.Vida_Util_Inicial, T1.Costo_Total_Dev, T1.Otros_Costos_Dev, T1.Variable_N, T1.Variable_I, T1.Variable_VF, T1.Costo_Desmante, T1.Cuen_Identificacion, T1.Invd_FechaServicio, T1.Invd_EsPlacaPadre, T1.Invd_PlacaPadre, T1.Invd_FechaAdquisicion, T1.Invd_ValorAdquisicion, T1.Invd_Estado, T1.Invd_BodegaCodigo, T1.Invd_AlmacenCodigo, T1.Invd_ModuloAlmacen, T1.Invd_CentroCostoId, T1.Invd_RegionalId, T1.Invd_NumeroPlaca FROM (ALM_INVENTARIO_DEVOLUTIVO T1 LEFT JOIN ALM_CUENTADANTE T2 ON T2.Cuen_Identificacion = T1.Cuen_Identificacion) WHERE T1.Elem_Consecutivo = ? ORDER BY T1.Elem_Consecutivo  OFFSET ? ROWS FETCH NEXT (CASE WHEN ? > 0 THEN ? ELSE 1e9 END) ROWS ONLY",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H004E3", "SELECT COUNT(*) FROM (ALM_INVENTARIO_DEVOLUTIVO T1 LEFT JOIN ALM_CUENTADANTE T2 ON T2.Cuen_Identificacion = T1.Cuen_Identificacion) WHERE T1.Elem_Consecutivo = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(5) ;
               ((short[]) buf[8])[0] = rslt.getShort(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,2) ;
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(12,2) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(13,2) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((long[]) buf[23])[0] = rslt.getLong(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 2) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDate(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(19,2) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((String[]) buf[38])[0] = rslt.getVarchar(22) ;
               ((String[]) buf[39])[0] = rslt.getVarchar(23) ;
               ((long[]) buf[40])[0] = rslt.getLong(24) ;
               ((long[]) buf[41])[0] = rslt.getLong(25) ;
               ((String[]) buf[42])[0] = rslt.getVarchar(26) ;
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

