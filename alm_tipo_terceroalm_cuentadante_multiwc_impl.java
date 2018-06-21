/*
               File: alm_tipo_terceroalm_cuentadante_multiwc_impl
        Description: ALM_TIPO_TERCEROALM_CUENTADANTE_MULTIWC
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:14:34.20
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

public final  class alm_tipo_terceroalm_cuentadante_multiwc_impl extends GXWebComponent
{
   public alm_tipo_terceroalm_cuentadante_multiwc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_tipo_terceroalm_cuentadante_multiwc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_tipo_terceroalm_cuentadante_multiwc_impl.class ));
   }

   public alm_tipo_terceroalm_cuentadante_multiwc_impl( int remoteHandle ,
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
      cmbCuen_Estado = new HTMLChoice();
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
               AV7Tpte_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Tpte_Codigo", AV7Tpte_Codigo);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV7Tpte_Codigo});
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
               AV7Tpte_Codigo = httpContext.GetNextPar( ) ;
               AV12Update = httpContext.GetNextPar( ) ;
               edtavUpdate_Tooltiptext = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_20_Refreshing);
               AV13Delete = httpContext.GetNextPar( ) ;
               edtavDelete_Tooltiptext = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "Tooltiptext", edtavDelete_Tooltiptext, !bGXsfl_20_Refreshing);
               A43Cuen_Identificacion = GXutil.lval( httpContext.GetNextPar( )) ;
               A5Ciud_Codigo = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               A6Dept_Codigo = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               A1Cent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               A2Regi_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               sPrefix = httpContext.GetNextPar( ) ;
               init_default_properties( ) ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxgrgrid_refresh( subGrid_Rows, AV7Tpte_Codigo, AV12Update, AV13Delete, A43Cuen_Identificacion, A5Ciud_Codigo, A6Dept_Codigo, A1Cent_Id, A2Regi_Id, sPrefix) ;
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
         pa522( ) ;
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
         httpContext.writeValue( "ALM_TIPO_TERCEROALM_CUENTADANTE_MULTIWC") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414143428");
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_tipo_terceroalm_cuentadante_multiwc") + "?" + GXutil.URLEncode(GXutil.rtrim(AV7Tpte_Codigo))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7Tpte_Codigo", GXutil.rtrim( wcpOAV7Tpte_Codigo));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTPTE_CODIGO", GXutil.rtrim( AV7Tpte_Codigo));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUPDATE_Tooltiptext", GXutil.rtrim( edtavUpdate_Tooltiptext));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDELETE_Tooltiptext", GXutil.rtrim( edtavDelete_Tooltiptext));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm522( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("alm_tipo_terceroalm_cuentadante_multiwc.js", "?201861414143430");
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
      return "ALM_TIPO_TERCEROALM_CUENTADANTE_MULTIWC" ;
   }

   public String getPgmdesc( )
   {
      return "ALM_TIPO_TERCEROALM_CUENTADANTE_MULTIWC" ;
   }

   public void wb520( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.alm_tipo_terceroalm_cuentadante_multiwc");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 20, 2, 0)+","+"null"+");", "Agregar", bttBtninsert_Jsonclick, 5, "Agregar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_TERCEROALM_CUENTADANTE_MULTIWC.htm");
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
            httpContext.writeValue( "Identificación") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cedula") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Dígito Verificación") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Nombre") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Nombre") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Apellido") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Apellido") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cuentadante") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Clase") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Estado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Dirección") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Teléfono") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Email") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Código Ciudad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción Ciudad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Código Departamento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción Departamento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Identificador Centro de Costo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Código del Centro de Costo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción Centro de Costo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Identificador Regional") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Código de la Regional") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción Regional") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Usuario Creación") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha Creación") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Usuario") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha ") ;
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
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A43Cuen_Identificacion, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A688Cuen_Cedula, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A326Cuen_DigitoVerificacion, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A331Cuen_PrimerNombre);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A332Cuen_SegundoNombre);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A329Cuen_PrimerApellido);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A330Cuen_SegundoApellido);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A44Cuen_Nombre);
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtCuen_Nombre_Link));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A328Cuen_Clase);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A333Cuen_Estado));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A334Cuen_Direccion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A335Cuen_Telefono);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A336Cuen_Email);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5Ciud_Codigo, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A7Ciud_Descripcion);
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtCiud_Descripcion_Link));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6Dept_Codigo, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A10Dept_Descripcion);
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtDept_Descripcion_Link));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A3Cent_Codigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A4Cent_Descripcion);
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtCent_Descripcion_Link));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2Regi_Id, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12Regi_Cod, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A13Regi_Descripcion);
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtRegi_Descripcion_Link));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A337Cuen_UsuarioCrea);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A338Cuen_FechaCrea, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A339Cuen_UsuarioModifica);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A340Cuen_FechaModifica, 10, 8, 0, 3, "/", ":", " "));
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTpte_Codigo_Internalname, "Código", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTpte_Codigo_Internalname, GXutil.rtrim( A42Tpte_Codigo), GXutil.rtrim( localUtil.format( A42Tpte_Codigo, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTpte_Codigo_Jsonclick, 0, "Attribute", "", "", "", edtTpte_Codigo_Visible, edtTpte_Codigo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TIPO_TERCEROALM_CUENTADANTE_MULTIWC.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start522( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "ALM_TIPO_TERCEROALM_CUENTADANTE_MULTIWC", (short)(0)) ;
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
            strup520( ) ;
         }
      }
   }

   public void ws522( )
   {
      start522( ) ;
      evt522( ) ;
   }

   public void evt522( )
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
                              strup520( ) ;
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
                              strup520( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoInsert' */
                                 e11522 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup520( ) ;
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
                              strup520( ) ;
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
                              strup520( ) ;
                           }
                           nGXsfl_20_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_20_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_20_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_202( ) ;
                           A43Cuen_Identificacion = localUtil.ctol( httpContext.cgiGet( edtCuen_Identificacion_Internalname), ",", ".") ;
                           A688Cuen_Cedula = localUtil.ctol( httpContext.cgiGet( edtCuen_Cedula_Internalname), ",", ".") ;
                           A326Cuen_DigitoVerificacion = (byte)(localUtil.ctol( httpContext.cgiGet( edtCuen_DigitoVerificacion_Internalname), ",", ".")) ;
                           n326Cuen_DigitoVerificacion = false ;
                           A331Cuen_PrimerNombre = GXutil.upper( httpContext.cgiGet( edtCuen_PrimerNombre_Internalname)) ;
                           n331Cuen_PrimerNombre = false ;
                           A332Cuen_SegundoNombre = GXutil.upper( httpContext.cgiGet( edtCuen_SegundoNombre_Internalname)) ;
                           n332Cuen_SegundoNombre = false ;
                           A329Cuen_PrimerApellido = GXutil.upper( httpContext.cgiGet( edtCuen_PrimerApellido_Internalname)) ;
                           n329Cuen_PrimerApellido = false ;
                           A330Cuen_SegundoApellido = GXutil.upper( httpContext.cgiGet( edtCuen_SegundoApellido_Internalname)) ;
                           n330Cuen_SegundoApellido = false ;
                           A44Cuen_Nombre = GXutil.upper( httpContext.cgiGet( edtCuen_Nombre_Internalname)) ;
                           n44Cuen_Nombre = false ;
                           A328Cuen_Clase = httpContext.cgiGet( edtCuen_Clase_Internalname) ;
                           n328Cuen_Clase = false ;
                           cmbCuen_Estado.setName( cmbCuen_Estado.getInternalname() );
                           cmbCuen_Estado.setValue( httpContext.cgiGet( cmbCuen_Estado.getInternalname()) );
                           A333Cuen_Estado = httpContext.cgiGet( cmbCuen_Estado.getInternalname()) ;
                           n333Cuen_Estado = false ;
                           A334Cuen_Direccion = httpContext.cgiGet( edtCuen_Direccion_Internalname) ;
                           n334Cuen_Direccion = false ;
                           A335Cuen_Telefono = httpContext.cgiGet( edtCuen_Telefono_Internalname) ;
                           n335Cuen_Telefono = false ;
                           A336Cuen_Email = httpContext.cgiGet( edtCuen_Email_Internalname) ;
                           n336Cuen_Email = false ;
                           A5Ciud_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( edtCiud_Codigo_Internalname), ",", ".")) ;
                           A7Ciud_Descripcion = GXutil.upper( httpContext.cgiGet( edtCiud_Descripcion_Internalname)) ;
                           A6Dept_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( edtDept_Codigo_Internalname), ",", ".")) ;
                           A10Dept_Descripcion = GXutil.upper( httpContext.cgiGet( edtDept_Descripcion_Internalname)) ;
                           A1Cent_Id = localUtil.ctol( httpContext.cgiGet( edtCent_Id_Internalname), ",", ".") ;
                           A3Cent_Codigo = httpContext.cgiGet( edtCent_Codigo_Internalname) ;
                           A4Cent_Descripcion = httpContext.cgiGet( edtCent_Descripcion_Internalname) ;
                           A2Regi_Id = localUtil.ctol( httpContext.cgiGet( edtRegi_Id_Internalname), ",", ".") ;
                           A12Regi_Cod = (short)(localUtil.ctol( httpContext.cgiGet( edtRegi_Cod_Internalname), ",", ".")) ;
                           A13Regi_Descripcion = httpContext.cgiGet( edtRegi_Descripcion_Internalname) ;
                           A337Cuen_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtCuen_UsuarioCrea_Internalname)) ;
                           A338Cuen_FechaCrea = localUtil.ctot( httpContext.cgiGet( edtCuen_FechaCrea_Internalname), 0) ;
                           A339Cuen_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtCuen_UsuarioModifica_Internalname)) ;
                           n339Cuen_UsuarioModifica = false ;
                           A340Cuen_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtCuen_FechaModifica_Internalname), 0) ;
                           n340Cuen_FechaModifica = false ;
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
                                       e12522 ();
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
                                       e13522 ();
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
                                    strup520( ) ;
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

   public void we522( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm522( ) ;
         }
      }
   }

   public void pa522( )
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
         GXCCtl = "CUEN_ESTADO_" + sGXsfl_20_idx ;
         cmbCuen_Estado.setName( GXCCtl );
         cmbCuen_Estado.setWebtags( "" );
         cmbCuen_Estado.addItem("A", "Activo", (short)(0));
         cmbCuen_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbCuen_Estado.getItemCount() > 0 )
         {
            A333Cuen_Estado = cmbCuen_Estado.getValidValue(A333Cuen_Estado) ;
            n333Cuen_Estado = false ;
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
                                 String AV7Tpte_Codigo ,
                                 String AV12Update ,
                                 String AV13Delete ,
                                 long A43Cuen_Identificacion ,
                                 short A5Ciud_Codigo ,
                                 short A6Dept_Codigo ,
                                 long A1Cent_Id ,
                                 long A2Regi_Id ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid_Rows = subGrid_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID_nCurrentRecord = 0 ;
      rf522( ) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_IDENTIFICACION", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A43Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CUEN_IDENTIFICACION", GXutil.ltrim( localUtil.ntoc( A43Cuen_Identificacion, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_CEDULA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A688Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CUEN_CEDULA", GXutil.ltrim( localUtil.ntoc( A688Cuen_Cedula, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_DIGITOVERIFICACION", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A326Cuen_DigitoVerificacion), "9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CUEN_DIGITOVERIFICACION", GXutil.ltrim( localUtil.ntoc( A326Cuen_DigitoVerificacion, (byte)(1), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_PRIMERNOMBRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A331Cuen_PrimerNombre, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CUEN_PRIMERNOMBRE", A331Cuen_PrimerNombre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_SEGUNDONOMBRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A332Cuen_SegundoNombre, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CUEN_SEGUNDONOMBRE", A332Cuen_SegundoNombre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_PRIMERAPELLIDO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A329Cuen_PrimerApellido, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CUEN_PRIMERAPELLIDO", A329Cuen_PrimerApellido);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_SEGUNDOAPELLIDO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A330Cuen_SegundoApellido, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CUEN_SEGUNDOAPELLIDO", A330Cuen_SegundoApellido);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_CLASE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A328Cuen_Clase, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CUEN_CLASE", A328Cuen_Clase);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A333Cuen_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CUEN_ESTADO", GXutil.rtrim( A333Cuen_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_DIRECCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A334Cuen_Direccion, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CUEN_DIRECCION", A334Cuen_Direccion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_TELEFONO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A335Cuen_Telefono, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CUEN_TELEFONO", A335Cuen_Telefono);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_EMAIL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A336Cuen_Email, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CUEN_EMAIL", A336Cuen_Email);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CENT_ID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CENT_ID", GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_ID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A2Regi_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"REGI_ID", GXutil.ltrim( localUtil.ntoc( A2Regi_Id, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A337Cuen_UsuarioCrea, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CUEN_USUARIOCREA", A337Cuen_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A338Cuen_FechaCrea, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CUEN_FECHACREA", localUtil.ttoc( A338Cuen_FechaCrea, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A339Cuen_UsuarioModifica, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CUEN_USUARIOMODIFICA", A339Cuen_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A340Cuen_FechaModifica, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CUEN_FECHAMODIFICA", localUtil.ttoc( A340Cuen_FechaModifica, 10, 8, 0, 3, "/", ":", " "));
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf522( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV17Pgmname = "ALM_TIPO_TERCEROALM_CUENTADANTE_MULTIWC" ;
      Gx_err = (short)(0) ;
   }

   public void rf522( )
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
         /* Using cursor H00522 */
         pr_default.execute(0, new Object[] {AV7Tpte_Codigo, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_20_idx = (short)(1) ;
         sGXsfl_20_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_20_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_202( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_recordsperpage( ) ) ) ) )
         {
            A42Tpte_Codigo = H00522_A42Tpte_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A42Tpte_Codigo", A42Tpte_Codigo);
            A340Cuen_FechaModifica = H00522_A340Cuen_FechaModifica[0] ;
            n340Cuen_FechaModifica = H00522_n340Cuen_FechaModifica[0] ;
            A339Cuen_UsuarioModifica = H00522_A339Cuen_UsuarioModifica[0] ;
            n339Cuen_UsuarioModifica = H00522_n339Cuen_UsuarioModifica[0] ;
            A338Cuen_FechaCrea = H00522_A338Cuen_FechaCrea[0] ;
            A337Cuen_UsuarioCrea = H00522_A337Cuen_UsuarioCrea[0] ;
            A13Regi_Descripcion = H00522_A13Regi_Descripcion[0] ;
            A12Regi_Cod = H00522_A12Regi_Cod[0] ;
            A2Regi_Id = H00522_A2Regi_Id[0] ;
            A4Cent_Descripcion = H00522_A4Cent_Descripcion[0] ;
            A3Cent_Codigo = H00522_A3Cent_Codigo[0] ;
            A1Cent_Id = H00522_A1Cent_Id[0] ;
            A10Dept_Descripcion = H00522_A10Dept_Descripcion[0] ;
            A6Dept_Codigo = H00522_A6Dept_Codigo[0] ;
            A7Ciud_Descripcion = H00522_A7Ciud_Descripcion[0] ;
            A5Ciud_Codigo = H00522_A5Ciud_Codigo[0] ;
            A336Cuen_Email = H00522_A336Cuen_Email[0] ;
            n336Cuen_Email = H00522_n336Cuen_Email[0] ;
            A335Cuen_Telefono = H00522_A335Cuen_Telefono[0] ;
            n335Cuen_Telefono = H00522_n335Cuen_Telefono[0] ;
            A334Cuen_Direccion = H00522_A334Cuen_Direccion[0] ;
            n334Cuen_Direccion = H00522_n334Cuen_Direccion[0] ;
            A333Cuen_Estado = H00522_A333Cuen_Estado[0] ;
            n333Cuen_Estado = H00522_n333Cuen_Estado[0] ;
            A328Cuen_Clase = H00522_A328Cuen_Clase[0] ;
            n328Cuen_Clase = H00522_n328Cuen_Clase[0] ;
            A44Cuen_Nombre = H00522_A44Cuen_Nombre[0] ;
            n44Cuen_Nombre = H00522_n44Cuen_Nombre[0] ;
            A330Cuen_SegundoApellido = H00522_A330Cuen_SegundoApellido[0] ;
            n330Cuen_SegundoApellido = H00522_n330Cuen_SegundoApellido[0] ;
            A329Cuen_PrimerApellido = H00522_A329Cuen_PrimerApellido[0] ;
            n329Cuen_PrimerApellido = H00522_n329Cuen_PrimerApellido[0] ;
            A332Cuen_SegundoNombre = H00522_A332Cuen_SegundoNombre[0] ;
            n332Cuen_SegundoNombre = H00522_n332Cuen_SegundoNombre[0] ;
            A331Cuen_PrimerNombre = H00522_A331Cuen_PrimerNombre[0] ;
            n331Cuen_PrimerNombre = H00522_n331Cuen_PrimerNombre[0] ;
            A326Cuen_DigitoVerificacion = H00522_A326Cuen_DigitoVerificacion[0] ;
            n326Cuen_DigitoVerificacion = H00522_n326Cuen_DigitoVerificacion[0] ;
            A688Cuen_Cedula = H00522_A688Cuen_Cedula[0] ;
            A43Cuen_Identificacion = H00522_A43Cuen_Identificacion[0] ;
            A13Regi_Descripcion = H00522_A13Regi_Descripcion[0] ;
            A12Regi_Cod = H00522_A12Regi_Cod[0] ;
            A5Ciud_Codigo = H00522_A5Ciud_Codigo[0] ;
            A6Dept_Codigo = H00522_A6Dept_Codigo[0] ;
            A7Ciud_Descripcion = H00522_A7Ciud_Descripcion[0] ;
            A10Dept_Descripcion = H00522_A10Dept_Descripcion[0] ;
            A4Cent_Descripcion = H00522_A4Cent_Descripcion[0] ;
            A3Cent_Codigo = H00522_A3Cent_Codigo[0] ;
            e13522 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(20) ;
         wb520( ) ;
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
      /* Using cursor H00523 */
      pr_default.execute(1, new Object[] {AV7Tpte_Codigo});
      GRID_nRecordCount = H00523_AGRID_nRecordCount[0] ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Tpte_Codigo, AV12Update, AV13Delete, A43Cuen_Identificacion, A5Ciud_Codigo, A6Dept_Codigo, A1Cent_Id, A2Regi_Id, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Tpte_Codigo, AV12Update, AV13Delete, A43Cuen_Identificacion, A5Ciud_Codigo, A6Dept_Codigo, A1Cent_Id, A2Regi_Id, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Tpte_Codigo, AV12Update, AV13Delete, A43Cuen_Identificacion, A5Ciud_Codigo, A6Dept_Codigo, A1Cent_Id, A2Regi_Id, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Tpte_Codigo, AV12Update, AV13Delete, A43Cuen_Identificacion, A5Ciud_Codigo, A6Dept_Codigo, A1Cent_Id, A2Regi_Id, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Tpte_Codigo, AV12Update, AV13Delete, A43Cuen_Identificacion, A5Ciud_Codigo, A6Dept_Codigo, A1Cent_Id, A2Regi_Id, sPrefix) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup520( )
   {
      /* Before Start, stand alone formulas. */
      AV17Pgmname = "ALM_TIPO_TERCEROALM_CUENTADANTE_MULTIWC" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e12522 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A42Tpte_Codigo = GXutil.upper( httpContext.cgiGet( edtTpte_Codigo_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A42Tpte_Codigo", A42Tpte_Codigo);
         /* Read saved values. */
         nRC_GXsfl_20 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_20"), ",", ".")) ;
         wcpOAV7Tpte_Codigo = httpContext.cgiGet( sPrefix+"wcpOAV7Tpte_Codigo") ;
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
      e12522 ();
      if (returnInSub) return;
   }

   public void e12522( )
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
      edtTpte_Codigo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTpte_Codigo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTpte_Codigo_Visible, 5, 0)), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
   }

   private void e13522( )
   {
      /* Grid_Load Routine */
      edtavUpdate_Link = formatLink("com.orions2.alm_cuentadante_multi") + "?" + GXutil.URLEncode(GXutil.rtrim("UPD")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A43Cuen_Identificacion,18,0))) ;
      edtavDelete_Link = formatLink("com.orions2.alm_cuentadante_multi") + "?" + GXutil.URLEncode(GXutil.rtrim("DLT")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A43Cuen_Identificacion,18,0))) ;
      edtCuen_Nombre_Link = formatLink("com.orions2.viewalm_cuentadante") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A43Cuen_Identificacion,18,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      edtCiud_Descripcion_Link = formatLink("com.orions2.viewgen_ciudad") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A5Ciud_Codigo,4,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      edtDept_Descripcion_Link = formatLink("com.orions2.viewgen_departamento") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A6Dept_Codigo,4,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      edtCent_Descripcion_Link = formatLink("com.orions2.viewgen_centrocosto") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A1Cent_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
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

   public void e11522( )
   {
      /* 'DoInsert' Routine */
      callWebObject(formatLink("com.orions2.alm_cuentadante_multi") + "?" + GXutil.URLEncode(GXutil.rtrim("INS")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))));
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV10TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV17Pgmname );
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerondelete( true );
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV9HTTPRequest.getScriptName()+"?"+AV9HTTPRequest.getQuerystring() );
      AV10TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_CUENTADANTE_MULTI" );
      AV11TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV11TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Tpte_Codigo" );
      AV11TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( AV7Tpte_Codigo );
      AV10TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV11TrnContextAtt, 0);
      AV8Session.setValue("TrnContext", AV10TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      AV7Tpte_Codigo = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Tpte_Codigo", AV7Tpte_Codigo);
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
      pa522( ) ;
      ws522( ) ;
      we522( ) ;
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
      sCtrlAV7Tpte_Codigo = (String)getParm(obj,0,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa522( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "alm_tipo_terceroalm_cuentadante_multiwc");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa522( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV7Tpte_Codigo = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Tpte_Codigo", AV7Tpte_Codigo);
      }
      wcpOAV7Tpte_Codigo = httpContext.cgiGet( sPrefix+"wcpOAV7Tpte_Codigo") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV7Tpte_Codigo, wcpOAV7Tpte_Codigo) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV7Tpte_Codigo = AV7Tpte_Codigo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV7Tpte_Codigo = httpContext.cgiGet( sPrefix+"AV7Tpte_Codigo_CTRL") ;
      if ( GXutil.len( sCtrlAV7Tpte_Codigo) > 0 )
      {
         AV7Tpte_Codigo = httpContext.cgiGet( sCtrlAV7Tpte_Codigo) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Tpte_Codigo", AV7Tpte_Codigo);
      }
      else
      {
         AV7Tpte_Codigo = httpContext.cgiGet( sPrefix+"AV7Tpte_Codigo_PARM") ;
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
      pa522( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws522( ) ;
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
      ws522( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Tpte_Codigo_PARM", GXutil.rtrim( AV7Tpte_Codigo));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7Tpte_Codigo)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Tpte_Codigo_CTRL", GXutil.rtrim( sCtrlAV7Tpte_Codigo));
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
      we522( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414143528");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("alm_tipo_terceroalm_cuentadante_multiwc.js", "?201861414143528");
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_202( )
   {
      edtCuen_Identificacion_Internalname = sPrefix+"CUEN_IDENTIFICACION_"+sGXsfl_20_idx ;
      edtCuen_Cedula_Internalname = sPrefix+"CUEN_CEDULA_"+sGXsfl_20_idx ;
      edtCuen_DigitoVerificacion_Internalname = sPrefix+"CUEN_DIGITOVERIFICACION_"+sGXsfl_20_idx ;
      edtCuen_PrimerNombre_Internalname = sPrefix+"CUEN_PRIMERNOMBRE_"+sGXsfl_20_idx ;
      edtCuen_SegundoNombre_Internalname = sPrefix+"CUEN_SEGUNDONOMBRE_"+sGXsfl_20_idx ;
      edtCuen_PrimerApellido_Internalname = sPrefix+"CUEN_PRIMERAPELLIDO_"+sGXsfl_20_idx ;
      edtCuen_SegundoApellido_Internalname = sPrefix+"CUEN_SEGUNDOAPELLIDO_"+sGXsfl_20_idx ;
      edtCuen_Nombre_Internalname = sPrefix+"CUEN_NOMBRE_"+sGXsfl_20_idx ;
      edtCuen_Clase_Internalname = sPrefix+"CUEN_CLASE_"+sGXsfl_20_idx ;
      cmbCuen_Estado.setInternalname( sPrefix+"CUEN_ESTADO_"+sGXsfl_20_idx );
      edtCuen_Direccion_Internalname = sPrefix+"CUEN_DIRECCION_"+sGXsfl_20_idx ;
      edtCuen_Telefono_Internalname = sPrefix+"CUEN_TELEFONO_"+sGXsfl_20_idx ;
      edtCuen_Email_Internalname = sPrefix+"CUEN_EMAIL_"+sGXsfl_20_idx ;
      edtCiud_Codigo_Internalname = sPrefix+"CIUD_CODIGO_"+sGXsfl_20_idx ;
      edtCiud_Descripcion_Internalname = sPrefix+"CIUD_DESCRIPCION_"+sGXsfl_20_idx ;
      edtDept_Codigo_Internalname = sPrefix+"DEPT_CODIGO_"+sGXsfl_20_idx ;
      edtDept_Descripcion_Internalname = sPrefix+"DEPT_DESCRIPCION_"+sGXsfl_20_idx ;
      edtCent_Id_Internalname = sPrefix+"CENT_ID_"+sGXsfl_20_idx ;
      edtCent_Codigo_Internalname = sPrefix+"CENT_CODIGO_"+sGXsfl_20_idx ;
      edtCent_Descripcion_Internalname = sPrefix+"CENT_DESCRIPCION_"+sGXsfl_20_idx ;
      edtRegi_Id_Internalname = sPrefix+"REGI_ID_"+sGXsfl_20_idx ;
      edtRegi_Cod_Internalname = sPrefix+"REGI_COD_"+sGXsfl_20_idx ;
      edtRegi_Descripcion_Internalname = sPrefix+"REGI_DESCRIPCION_"+sGXsfl_20_idx ;
      edtCuen_UsuarioCrea_Internalname = sPrefix+"CUEN_USUARIOCREA_"+sGXsfl_20_idx ;
      edtCuen_FechaCrea_Internalname = sPrefix+"CUEN_FECHACREA_"+sGXsfl_20_idx ;
      edtCuen_UsuarioModifica_Internalname = sPrefix+"CUEN_USUARIOMODIFICA_"+sGXsfl_20_idx ;
      edtCuen_FechaModifica_Internalname = sPrefix+"CUEN_FECHAMODIFICA_"+sGXsfl_20_idx ;
      edtavUpdate_Internalname = sPrefix+"vUPDATE_"+sGXsfl_20_idx ;
      edtavDelete_Internalname = sPrefix+"vDELETE_"+sGXsfl_20_idx ;
   }

   public void subsflControlProps_fel_202( )
   {
      edtCuen_Identificacion_Internalname = sPrefix+"CUEN_IDENTIFICACION_"+sGXsfl_20_fel_idx ;
      edtCuen_Cedula_Internalname = sPrefix+"CUEN_CEDULA_"+sGXsfl_20_fel_idx ;
      edtCuen_DigitoVerificacion_Internalname = sPrefix+"CUEN_DIGITOVERIFICACION_"+sGXsfl_20_fel_idx ;
      edtCuen_PrimerNombre_Internalname = sPrefix+"CUEN_PRIMERNOMBRE_"+sGXsfl_20_fel_idx ;
      edtCuen_SegundoNombre_Internalname = sPrefix+"CUEN_SEGUNDONOMBRE_"+sGXsfl_20_fel_idx ;
      edtCuen_PrimerApellido_Internalname = sPrefix+"CUEN_PRIMERAPELLIDO_"+sGXsfl_20_fel_idx ;
      edtCuen_SegundoApellido_Internalname = sPrefix+"CUEN_SEGUNDOAPELLIDO_"+sGXsfl_20_fel_idx ;
      edtCuen_Nombre_Internalname = sPrefix+"CUEN_NOMBRE_"+sGXsfl_20_fel_idx ;
      edtCuen_Clase_Internalname = sPrefix+"CUEN_CLASE_"+sGXsfl_20_fel_idx ;
      cmbCuen_Estado.setInternalname( sPrefix+"CUEN_ESTADO_"+sGXsfl_20_fel_idx );
      edtCuen_Direccion_Internalname = sPrefix+"CUEN_DIRECCION_"+sGXsfl_20_fel_idx ;
      edtCuen_Telefono_Internalname = sPrefix+"CUEN_TELEFONO_"+sGXsfl_20_fel_idx ;
      edtCuen_Email_Internalname = sPrefix+"CUEN_EMAIL_"+sGXsfl_20_fel_idx ;
      edtCiud_Codigo_Internalname = sPrefix+"CIUD_CODIGO_"+sGXsfl_20_fel_idx ;
      edtCiud_Descripcion_Internalname = sPrefix+"CIUD_DESCRIPCION_"+sGXsfl_20_fel_idx ;
      edtDept_Codigo_Internalname = sPrefix+"DEPT_CODIGO_"+sGXsfl_20_fel_idx ;
      edtDept_Descripcion_Internalname = sPrefix+"DEPT_DESCRIPCION_"+sGXsfl_20_fel_idx ;
      edtCent_Id_Internalname = sPrefix+"CENT_ID_"+sGXsfl_20_fel_idx ;
      edtCent_Codigo_Internalname = sPrefix+"CENT_CODIGO_"+sGXsfl_20_fel_idx ;
      edtCent_Descripcion_Internalname = sPrefix+"CENT_DESCRIPCION_"+sGXsfl_20_fel_idx ;
      edtRegi_Id_Internalname = sPrefix+"REGI_ID_"+sGXsfl_20_fel_idx ;
      edtRegi_Cod_Internalname = sPrefix+"REGI_COD_"+sGXsfl_20_fel_idx ;
      edtRegi_Descripcion_Internalname = sPrefix+"REGI_DESCRIPCION_"+sGXsfl_20_fel_idx ;
      edtCuen_UsuarioCrea_Internalname = sPrefix+"CUEN_USUARIOCREA_"+sGXsfl_20_fel_idx ;
      edtCuen_FechaCrea_Internalname = sPrefix+"CUEN_FECHACREA_"+sGXsfl_20_fel_idx ;
      edtCuen_UsuarioModifica_Internalname = sPrefix+"CUEN_USUARIOMODIFICA_"+sGXsfl_20_fel_idx ;
      edtCuen_FechaModifica_Internalname = sPrefix+"CUEN_FECHAMODIFICA_"+sGXsfl_20_fel_idx ;
      edtavUpdate_Internalname = sPrefix+"vUPDATE_"+sGXsfl_20_fel_idx ;
      edtavDelete_Internalname = sPrefix+"vDELETE_"+sGXsfl_20_fel_idx ;
   }

   public void sendrow_202( )
   {
      subsflControlProps_202( ) ;
      wb520( ) ;
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
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_Identificacion_Internalname,GXutil.ltrim( localUtil.ntoc( A43Cuen_Identificacion, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A43Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCuen_Identificacion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_DigitoVerificacion_Internalname,GXutil.ltrim( localUtil.ntoc( A326Cuen_DigitoVerificacion, (byte)(1), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A326Cuen_DigitoVerificacion), "9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCuen_DigitoVerificacion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_PrimerNombre_Internalname,A331Cuen_PrimerNombre,GXutil.rtrim( localUtil.format( A331Cuen_PrimerNombre, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCuen_PrimerNombre_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_SegundoNombre_Internalname,A332Cuen_SegundoNombre,GXutil.rtrim( localUtil.format( A332Cuen_SegundoNombre, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCuen_SegundoNombre_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_PrimerApellido_Internalname,A329Cuen_PrimerApellido,GXutil.rtrim( localUtil.format( A329Cuen_PrimerApellido, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCuen_PrimerApellido_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_SegundoApellido_Internalname,A330Cuen_SegundoApellido,GXutil.rtrim( localUtil.format( A330Cuen_SegundoApellido, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCuen_SegundoApellido_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_Nombre_Internalname,A44Cuen_Nombre,GXutil.rtrim( localUtil.format( A44Cuen_Nombre, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'",edtCuen_Nombre_Link,"","","",edtCuen_Nombre_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_Clase_Internalname,A328Cuen_Clase,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCuen_Clase_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_20_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "CUEN_ESTADO_" + sGXsfl_20_idx ;
            cmbCuen_Estado.setName( GXCCtl );
            cmbCuen_Estado.setWebtags( "" );
            cmbCuen_Estado.addItem("A", "Activo", (short)(0));
            cmbCuen_Estado.addItem("I", "Inactivo", (short)(0));
            if ( cmbCuen_Estado.getItemCount() > 0 )
            {
               A333Cuen_Estado = cmbCuen_Estado.getValidValue(A333Cuen_Estado) ;
               n333Cuen_Estado = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbCuen_Estado,cmbCuen_Estado.getInternalname(),GXutil.rtrim( A333Cuen_Estado),new Integer(1),cmbCuen_Estado.getJsonclick(),new Integer(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbCuen_Estado.setValue( GXutil.rtrim( A333Cuen_Estado) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbCuen_Estado.getInternalname(), "Values", cmbCuen_Estado.ToJavascriptSource(), !bGXsfl_20_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_Direccion_Internalname,A334Cuen_Direccion,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","http://maps.google.com/maps?q="+PrivateUtilities.encodeURL( A334Cuen_Direccion),"_blank","","",edtCuen_Direccion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1024),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"GeneXus\\Address","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_Telefono_Internalname,A335Cuen_Telefono,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCuen_Telefono_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(15),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_Email_Internalname,A336Cuen_Email,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","mailto:"+A336Cuen_Email,"","","",edtCuen_Email_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"email","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"GeneXus\\Email","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCiud_Codigo_Internalname,GXutil.ltrim( localUtil.ntoc( A5Ciud_Codigo, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A5Ciud_Codigo), "ZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCiud_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCiud_Descripcion_Internalname,A7Ciud_Descripcion,GXutil.rtrim( localUtil.format( A7Ciud_Descripcion, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'",edtCiud_Descripcion_Link,"","","",edtCiud_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDept_Codigo_Internalname,GXutil.ltrim( localUtil.ntoc( A6Dept_Codigo, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A6Dept_Codigo), "ZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDept_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDept_Descripcion_Internalname,A10Dept_Descripcion,GXutil.rtrim( localUtil.format( A10Dept_Descripcion, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'",edtDept_Descripcion_Link,"","","",edtDept_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCent_Id_Internalname,GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCent_Id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_Descripcion_Internalname,A13Regi_Descripcion,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'",edtRegi_Descripcion_Link,"","","",edtRegi_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_UsuarioCrea_Internalname,A337Cuen_UsuarioCrea,GXutil.rtrim( localUtil.format( A337Cuen_UsuarioCrea, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCuen_UsuarioCrea_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_FechaCrea_Internalname,localUtil.ttoc( A338Cuen_FechaCrea, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A338Cuen_FechaCrea, "99/99/99 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCuen_FechaCrea_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_UsuarioModifica_Internalname,A339Cuen_UsuarioModifica,GXutil.rtrim( localUtil.format( A339Cuen_UsuarioModifica, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCuen_UsuarioModifica_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_FechaModifica_Internalname,localUtil.ttoc( A340Cuen_FechaModifica, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A340Cuen_FechaModifica, "99/99/99 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCuen_FechaModifica_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(20),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
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
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_IDENTIFICACION"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A43Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_CEDULA"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A688Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_DIGITOVERIFICACION"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A326Cuen_DigitoVerificacion), "9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_PRIMERNOMBRE"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A331Cuen_PrimerNombre, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_SEGUNDONOMBRE"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A332Cuen_SegundoNombre, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_PRIMERAPELLIDO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A329Cuen_PrimerApellido, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_SEGUNDOAPELLIDO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A330Cuen_SegundoApellido, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_CLASE"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A328Cuen_Clase, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_ESTADO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A333Cuen_Estado, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_DIRECCION"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A334Cuen_Direccion, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_TELEFONO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A335Cuen_Telefono, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_EMAIL"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A336Cuen_Email, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CENT_ID"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_ID"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A2Regi_Id), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_USUARIOCREA"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A337Cuen_UsuarioCrea, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_FECHACREA"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( A338Cuen_FechaCrea, "99/99/99 99:99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_USUARIOMODIFICA"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A339Cuen_UsuarioModifica, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_FECHAMODIFICA"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( A340Cuen_FechaModifica, "99/99/99 99:99")));
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
      edtCuen_Identificacion_Internalname = sPrefix+"CUEN_IDENTIFICACION" ;
      edtCuen_Cedula_Internalname = sPrefix+"CUEN_CEDULA" ;
      edtCuen_DigitoVerificacion_Internalname = sPrefix+"CUEN_DIGITOVERIFICACION" ;
      edtCuen_PrimerNombre_Internalname = sPrefix+"CUEN_PRIMERNOMBRE" ;
      edtCuen_SegundoNombre_Internalname = sPrefix+"CUEN_SEGUNDONOMBRE" ;
      edtCuen_PrimerApellido_Internalname = sPrefix+"CUEN_PRIMERAPELLIDO" ;
      edtCuen_SegundoApellido_Internalname = sPrefix+"CUEN_SEGUNDOAPELLIDO" ;
      edtCuen_Nombre_Internalname = sPrefix+"CUEN_NOMBRE" ;
      edtCuen_Clase_Internalname = sPrefix+"CUEN_CLASE" ;
      cmbCuen_Estado.setInternalname( sPrefix+"CUEN_ESTADO" );
      edtCuen_Direccion_Internalname = sPrefix+"CUEN_DIRECCION" ;
      edtCuen_Telefono_Internalname = sPrefix+"CUEN_TELEFONO" ;
      edtCuen_Email_Internalname = sPrefix+"CUEN_EMAIL" ;
      edtCiud_Codigo_Internalname = sPrefix+"CIUD_CODIGO" ;
      edtCiud_Descripcion_Internalname = sPrefix+"CIUD_DESCRIPCION" ;
      edtDept_Codigo_Internalname = sPrefix+"DEPT_CODIGO" ;
      edtDept_Descripcion_Internalname = sPrefix+"DEPT_DESCRIPCION" ;
      edtCent_Id_Internalname = sPrefix+"CENT_ID" ;
      edtCent_Codigo_Internalname = sPrefix+"CENT_CODIGO" ;
      edtCent_Descripcion_Internalname = sPrefix+"CENT_DESCRIPCION" ;
      edtRegi_Id_Internalname = sPrefix+"REGI_ID" ;
      edtRegi_Cod_Internalname = sPrefix+"REGI_COD" ;
      edtRegi_Descripcion_Internalname = sPrefix+"REGI_DESCRIPCION" ;
      edtCuen_UsuarioCrea_Internalname = sPrefix+"CUEN_USUARIOCREA" ;
      edtCuen_FechaCrea_Internalname = sPrefix+"CUEN_FECHACREA" ;
      edtCuen_UsuarioModifica_Internalname = sPrefix+"CUEN_USUARIOMODIFICA" ;
      edtCuen_FechaModifica_Internalname = sPrefix+"CUEN_FECHAMODIFICA" ;
      edtavUpdate_Internalname = sPrefix+"vUPDATE" ;
      edtavDelete_Internalname = sPrefix+"vDELETE" ;
      divGridtable_Internalname = sPrefix+"GRIDTABLE" ;
      divGridcell_Internalname = sPrefix+"GRIDCELL" ;
      edtTpte_Codigo_Internalname = sPrefix+"TPTE_CODIGO" ;
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
      edtCuen_FechaModifica_Jsonclick = "" ;
      edtCuen_UsuarioModifica_Jsonclick = "" ;
      edtCuen_FechaCrea_Jsonclick = "" ;
      edtCuen_UsuarioCrea_Jsonclick = "" ;
      edtRegi_Descripcion_Jsonclick = "" ;
      edtRegi_Cod_Jsonclick = "" ;
      edtRegi_Id_Jsonclick = "" ;
      edtCent_Descripcion_Jsonclick = "" ;
      edtCent_Codigo_Jsonclick = "" ;
      edtCent_Id_Jsonclick = "" ;
      edtDept_Descripcion_Jsonclick = "" ;
      edtDept_Codigo_Jsonclick = "" ;
      edtCiud_Descripcion_Jsonclick = "" ;
      edtCiud_Codigo_Jsonclick = "" ;
      edtCuen_Email_Jsonclick = "" ;
      edtCuen_Telefono_Jsonclick = "" ;
      edtCuen_Direccion_Jsonclick = "" ;
      cmbCuen_Estado.setJsonclick( "" );
      edtCuen_Clase_Jsonclick = "" ;
      edtCuen_Nombre_Jsonclick = "" ;
      edtCuen_SegundoApellido_Jsonclick = "" ;
      edtCuen_PrimerApellido_Jsonclick = "" ;
      edtCuen_SegundoNombre_Jsonclick = "" ;
      edtCuen_PrimerNombre_Jsonclick = "" ;
      edtCuen_DigitoVerificacion_Jsonclick = "" ;
      edtCuen_Cedula_Jsonclick = "" ;
      edtCuen_Identificacion_Jsonclick = "" ;
      edtTpte_Codigo_Jsonclick = "" ;
      edtTpte_Codigo_Enabled = 0 ;
      edtTpte_Codigo_Visible = 1 ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      edtavDelete_Link = "" ;
      edtavUpdate_Link = "" ;
      edtRegi_Descripcion_Link = "" ;
      edtCent_Descripcion_Link = "" ;
      edtDept_Descripcion_Link = "" ;
      edtCiud_Descripcion_Link = "" ;
      edtCuen_Nombre_Link = "" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Tpte_Codigo',fld:'vTPTE_CODIGO',pic:'@!',nv:''},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A43Cuen_Identificacion',fld:'CUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'A5Ciud_Codigo',fld:'CIUD_CODIGO',pic:'ZZZ9',nv:0},{av:'A6Dept_Codigo',fld:'DEPT_CODIGO',pic:'ZZZ9',nv:0},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A2Regi_Id',fld:'REGI_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e13522',iparms:[{av:'A43Cuen_Identificacion',fld:'CUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'A5Ciud_Codigo',fld:'CIUD_CODIGO',pic:'ZZZ9',nv:0},{av:'A6Dept_Codigo',fld:'DEPT_CODIGO',pic:'ZZZ9',nv:0},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A2Regi_Id',fld:'REGI_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[{av:'edtavUpdate_Link',ctrl:'vUPDATE',prop:'Link'},{av:'edtavDelete_Link',ctrl:'vDELETE',prop:'Link'},{av:'edtCuen_Nombre_Link',ctrl:'CUEN_NOMBRE',prop:'Link'},{av:'edtCiud_Descripcion_Link',ctrl:'CIUD_DESCRIPCION',prop:'Link'},{av:'edtDept_Descripcion_Link',ctrl:'DEPT_DESCRIPCION',prop:'Link'},{av:'edtCent_Descripcion_Link',ctrl:'CENT_DESCRIPCION',prop:'Link'},{av:'edtRegi_Descripcion_Link',ctrl:'REGI_DESCRIPCION',prop:'Link'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e11522',iparms:[{av:'A43Cuen_Identificacion',fld:'CUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Tpte_Codigo',fld:'vTPTE_CODIGO',pic:'@!',nv:''},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A43Cuen_Identificacion',fld:'CUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'A5Ciud_Codigo',fld:'CIUD_CODIGO',pic:'ZZZ9',nv:0},{av:'A6Dept_Codigo',fld:'DEPT_CODIGO',pic:'ZZZ9',nv:0},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A2Regi_Id',fld:'REGI_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Tpte_Codigo',fld:'vTPTE_CODIGO',pic:'@!',nv:''},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A43Cuen_Identificacion',fld:'CUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'A5Ciud_Codigo',fld:'CIUD_CODIGO',pic:'ZZZ9',nv:0},{av:'A6Dept_Codigo',fld:'DEPT_CODIGO',pic:'ZZZ9',nv:0},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A2Regi_Id',fld:'REGI_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Tpte_Codigo',fld:'vTPTE_CODIGO',pic:'@!',nv:''},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A43Cuen_Identificacion',fld:'CUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'A5Ciud_Codigo',fld:'CIUD_CODIGO',pic:'ZZZ9',nv:0},{av:'A6Dept_Codigo',fld:'DEPT_CODIGO',pic:'ZZZ9',nv:0},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A2Regi_Id',fld:'REGI_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV7Tpte_Codigo',fld:'vTPTE_CODIGO',pic:'@!',nv:''},{av:'AV12Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV13Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A43Cuen_Identificacion',fld:'CUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'A5Ciud_Codigo',fld:'CIUD_CODIGO',pic:'ZZZ9',nv:0},{av:'A6Dept_Codigo',fld:'DEPT_CODIGO',pic:'ZZZ9',nv:0},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A2Regi_Id',fld:'REGI_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'sPrefix',nv:''}],oparms:[]}");
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
      wcpOAV7Tpte_Codigo = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV7Tpte_Codigo = "" ;
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
      A331Cuen_PrimerNombre = "" ;
      A332Cuen_SegundoNombre = "" ;
      A329Cuen_PrimerApellido = "" ;
      A330Cuen_SegundoApellido = "" ;
      A44Cuen_Nombre = "" ;
      A328Cuen_Clase = "" ;
      A333Cuen_Estado = "" ;
      A334Cuen_Direccion = "" ;
      A335Cuen_Telefono = "" ;
      A336Cuen_Email = "" ;
      A7Ciud_Descripcion = "" ;
      A10Dept_Descripcion = "" ;
      A3Cent_Codigo = "" ;
      A4Cent_Descripcion = "" ;
      A13Regi_Descripcion = "" ;
      A337Cuen_UsuarioCrea = "" ;
      A338Cuen_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A339Cuen_UsuarioModifica = "" ;
      A340Cuen_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      A42Tpte_Codigo = "" ;
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
      H00522_A42Tpte_Codigo = new String[] {""} ;
      H00522_A340Cuen_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H00522_n340Cuen_FechaModifica = new boolean[] {false} ;
      H00522_A339Cuen_UsuarioModifica = new String[] {""} ;
      H00522_n339Cuen_UsuarioModifica = new boolean[] {false} ;
      H00522_A338Cuen_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      H00522_A337Cuen_UsuarioCrea = new String[] {""} ;
      H00522_A13Regi_Descripcion = new String[] {""} ;
      H00522_A12Regi_Cod = new short[1] ;
      H00522_A2Regi_Id = new long[1] ;
      H00522_A4Cent_Descripcion = new String[] {""} ;
      H00522_A3Cent_Codigo = new String[] {""} ;
      H00522_A1Cent_Id = new long[1] ;
      H00522_A10Dept_Descripcion = new String[] {""} ;
      H00522_A6Dept_Codigo = new short[1] ;
      H00522_A7Ciud_Descripcion = new String[] {""} ;
      H00522_A5Ciud_Codigo = new short[1] ;
      H00522_A336Cuen_Email = new String[] {""} ;
      H00522_n336Cuen_Email = new boolean[] {false} ;
      H00522_A335Cuen_Telefono = new String[] {""} ;
      H00522_n335Cuen_Telefono = new boolean[] {false} ;
      H00522_A334Cuen_Direccion = new String[] {""} ;
      H00522_n334Cuen_Direccion = new boolean[] {false} ;
      H00522_A333Cuen_Estado = new String[] {""} ;
      H00522_n333Cuen_Estado = new boolean[] {false} ;
      H00522_A328Cuen_Clase = new String[] {""} ;
      H00522_n328Cuen_Clase = new boolean[] {false} ;
      H00522_A44Cuen_Nombre = new String[] {""} ;
      H00522_n44Cuen_Nombre = new boolean[] {false} ;
      H00522_A330Cuen_SegundoApellido = new String[] {""} ;
      H00522_n330Cuen_SegundoApellido = new boolean[] {false} ;
      H00522_A329Cuen_PrimerApellido = new String[] {""} ;
      H00522_n329Cuen_PrimerApellido = new boolean[] {false} ;
      H00522_A332Cuen_SegundoNombre = new String[] {""} ;
      H00522_n332Cuen_SegundoNombre = new boolean[] {false} ;
      H00522_A331Cuen_PrimerNombre = new String[] {""} ;
      H00522_n331Cuen_PrimerNombre = new boolean[] {false} ;
      H00522_A326Cuen_DigitoVerificacion = new byte[1] ;
      H00522_n326Cuen_DigitoVerificacion = new boolean[] {false} ;
      H00522_A688Cuen_Cedula = new long[1] ;
      H00522_A43Cuen_Identificacion = new long[1] ;
      H00523_AGRID_nRecordCount = new long[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV10TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV9HTTPRequest = httpContext.getHttpRequest();
      AV11TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV8Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV7Tpte_Codigo = "" ;
      ROClassString = "" ;
      sImgUrl = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_tipo_terceroalm_cuentadante_multiwc__default(),
         new Object[] {
             new Object[] {
            H00522_A42Tpte_Codigo, H00522_A340Cuen_FechaModifica, H00522_n340Cuen_FechaModifica, H00522_A339Cuen_UsuarioModifica, H00522_n339Cuen_UsuarioModifica, H00522_A338Cuen_FechaCrea, H00522_A337Cuen_UsuarioCrea, H00522_A13Regi_Descripcion, H00522_A12Regi_Cod, H00522_A2Regi_Id,
            H00522_A4Cent_Descripcion, H00522_A3Cent_Codigo, H00522_A1Cent_Id, H00522_A10Dept_Descripcion, H00522_A6Dept_Codigo, H00522_A7Ciud_Descripcion, H00522_A5Ciud_Codigo, H00522_A336Cuen_Email, H00522_n336Cuen_Email, H00522_A335Cuen_Telefono,
            H00522_n335Cuen_Telefono, H00522_A334Cuen_Direccion, H00522_n334Cuen_Direccion, H00522_A333Cuen_Estado, H00522_n333Cuen_Estado, H00522_A328Cuen_Clase, H00522_n328Cuen_Clase, H00522_A44Cuen_Nombre, H00522_n44Cuen_Nombre, H00522_A330Cuen_SegundoApellido,
            H00522_n330Cuen_SegundoApellido, H00522_A329Cuen_PrimerApellido, H00522_n329Cuen_PrimerApellido, H00522_A332Cuen_SegundoNombre, H00522_n332Cuen_SegundoNombre, H00522_A331Cuen_PrimerNombre, H00522_n331Cuen_PrimerNombre, H00522_A326Cuen_DigitoVerificacion, H00522_n326Cuen_DigitoVerificacion, H00522_A688Cuen_Cedula,
            H00522_A43Cuen_Identificacion
            }
            , new Object[] {
            H00523_AGRID_nRecordCount
            }
         }
      );
      AV17Pgmname = "ALM_TIPO_TERCEROALM_CUENTADANTE_MULTIWC" ;
      /* GeneXus formulas. */
      AV17Pgmname = "ALM_TIPO_TERCEROALM_CUENTADANTE_MULTIWC" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nGXWrapped ;
   private byte GRID_nEOF ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte A326Cuen_DigitoVerificacion ;
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
   private short A5Ciud_Codigo ;
   private short A6Dept_Codigo ;
   private short wbEnd ;
   private short wbStart ;
   private short A12Regi_Cod ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int edtTpte_Codigo_Visible ;
   private int edtTpte_Codigo_Enabled ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private long A43Cuen_Identificacion ;
   private long A1Cent_Id ;
   private long A2Regi_Id ;
   private long GRID_nFirstRecordOnPage ;
   private long A688Cuen_Cedula ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV7Tpte_Codigo ;
   private String edtavUpdate_Tooltiptext ;
   private String edtavDelete_Tooltiptext ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV7Tpte_Codigo ;
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
   private String edtCuen_Nombre_Link ;
   private String A333Cuen_Estado ;
   private String edtCiud_Descripcion_Link ;
   private String edtDept_Descripcion_Link ;
   private String edtCent_Descripcion_Link ;
   private String edtRegi_Descripcion_Link ;
   private String edtavUpdate_Link ;
   private String edtavDelete_Link ;
   private String edtTpte_Codigo_Internalname ;
   private String A42Tpte_Codigo ;
   private String edtTpte_Codigo_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtCuen_Identificacion_Internalname ;
   private String edtCuen_Cedula_Internalname ;
   private String edtCuen_DigitoVerificacion_Internalname ;
   private String edtCuen_PrimerNombre_Internalname ;
   private String edtCuen_SegundoNombre_Internalname ;
   private String edtCuen_PrimerApellido_Internalname ;
   private String edtCuen_SegundoApellido_Internalname ;
   private String edtCuen_Nombre_Internalname ;
   private String edtCuen_Clase_Internalname ;
   private String edtCuen_Direccion_Internalname ;
   private String edtCuen_Telefono_Internalname ;
   private String edtCuen_Email_Internalname ;
   private String edtCiud_Codigo_Internalname ;
   private String edtCiud_Descripcion_Internalname ;
   private String edtDept_Codigo_Internalname ;
   private String edtDept_Descripcion_Internalname ;
   private String edtCent_Id_Internalname ;
   private String edtCent_Codigo_Internalname ;
   private String edtCent_Descripcion_Internalname ;
   private String edtRegi_Id_Internalname ;
   private String edtRegi_Cod_Internalname ;
   private String edtRegi_Descripcion_Internalname ;
   private String edtCuen_UsuarioCrea_Internalname ;
   private String edtCuen_FechaCrea_Internalname ;
   private String edtCuen_UsuarioModifica_Internalname ;
   private String edtCuen_FechaModifica_Internalname ;
   private String GXCCtl ;
   private String AV17Pgmname ;
   private String scmdbuf ;
   private String sCtrlAV7Tpte_Codigo ;
   private String sGXsfl_20_fel_idx="0001" ;
   private String ROClassString ;
   private String edtCuen_Identificacion_Jsonclick ;
   private String edtCuen_Cedula_Jsonclick ;
   private String edtCuen_DigitoVerificacion_Jsonclick ;
   private String edtCuen_PrimerNombre_Jsonclick ;
   private String edtCuen_SegundoNombre_Jsonclick ;
   private String edtCuen_PrimerApellido_Jsonclick ;
   private String edtCuen_SegundoApellido_Jsonclick ;
   private String edtCuen_Nombre_Jsonclick ;
   private String edtCuen_Clase_Jsonclick ;
   private String edtCuen_Direccion_Jsonclick ;
   private String edtCuen_Telefono_Jsonclick ;
   private String edtCuen_Email_Jsonclick ;
   private String edtCiud_Codigo_Jsonclick ;
   private String edtCiud_Descripcion_Jsonclick ;
   private String edtDept_Codigo_Jsonclick ;
   private String edtDept_Descripcion_Jsonclick ;
   private String edtCent_Id_Jsonclick ;
   private String edtCent_Codigo_Jsonclick ;
   private String edtCent_Descripcion_Jsonclick ;
   private String edtRegi_Id_Jsonclick ;
   private String edtRegi_Cod_Jsonclick ;
   private String edtRegi_Descripcion_Jsonclick ;
   private String edtCuen_UsuarioCrea_Jsonclick ;
   private String edtCuen_FechaCrea_Jsonclick ;
   private String edtCuen_UsuarioModifica_Jsonclick ;
   private String edtCuen_FechaModifica_Jsonclick ;
   private String sImgUrl ;
   private java.util.Date A338Cuen_FechaCrea ;
   private java.util.Date A340Cuen_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean bGXsfl_20_Refreshing=false ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n326Cuen_DigitoVerificacion ;
   private boolean n331Cuen_PrimerNombre ;
   private boolean n332Cuen_SegundoNombre ;
   private boolean n329Cuen_PrimerApellido ;
   private boolean n330Cuen_SegundoApellido ;
   private boolean n44Cuen_Nombre ;
   private boolean n328Cuen_Clase ;
   private boolean n333Cuen_Estado ;
   private boolean n334Cuen_Direccion ;
   private boolean n335Cuen_Telefono ;
   private boolean n336Cuen_Email ;
   private boolean n339Cuen_UsuarioModifica ;
   private boolean n340Cuen_FechaModifica ;
   private boolean returnInSub ;
   private boolean AV12Update_IsBlob ;
   private boolean AV13Delete_IsBlob ;
   private String A331Cuen_PrimerNombre ;
   private String A332Cuen_SegundoNombre ;
   private String A329Cuen_PrimerApellido ;
   private String A330Cuen_SegundoApellido ;
   private String A44Cuen_Nombre ;
   private String A328Cuen_Clase ;
   private String A334Cuen_Direccion ;
   private String A335Cuen_Telefono ;
   private String A336Cuen_Email ;
   private String A7Ciud_Descripcion ;
   private String A10Dept_Descripcion ;
   private String A3Cent_Codigo ;
   private String A4Cent_Descripcion ;
   private String A13Regi_Descripcion ;
   private String A337Cuen_UsuarioCrea ;
   private String A339Cuen_UsuarioModifica ;
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
   private HTMLChoice cmbCuen_Estado ;
   private IDataStoreProvider pr_default ;
   private String[] H00522_A42Tpte_Codigo ;
   private java.util.Date[] H00522_A340Cuen_FechaModifica ;
   private boolean[] H00522_n340Cuen_FechaModifica ;
   private String[] H00522_A339Cuen_UsuarioModifica ;
   private boolean[] H00522_n339Cuen_UsuarioModifica ;
   private java.util.Date[] H00522_A338Cuen_FechaCrea ;
   private String[] H00522_A337Cuen_UsuarioCrea ;
   private String[] H00522_A13Regi_Descripcion ;
   private short[] H00522_A12Regi_Cod ;
   private long[] H00522_A2Regi_Id ;
   private String[] H00522_A4Cent_Descripcion ;
   private String[] H00522_A3Cent_Codigo ;
   private long[] H00522_A1Cent_Id ;
   private String[] H00522_A10Dept_Descripcion ;
   private short[] H00522_A6Dept_Codigo ;
   private String[] H00522_A7Ciud_Descripcion ;
   private short[] H00522_A5Ciud_Codigo ;
   private String[] H00522_A336Cuen_Email ;
   private boolean[] H00522_n336Cuen_Email ;
   private String[] H00522_A335Cuen_Telefono ;
   private boolean[] H00522_n335Cuen_Telefono ;
   private String[] H00522_A334Cuen_Direccion ;
   private boolean[] H00522_n334Cuen_Direccion ;
   private String[] H00522_A333Cuen_Estado ;
   private boolean[] H00522_n333Cuen_Estado ;
   private String[] H00522_A328Cuen_Clase ;
   private boolean[] H00522_n328Cuen_Clase ;
   private String[] H00522_A44Cuen_Nombre ;
   private boolean[] H00522_n44Cuen_Nombre ;
   private String[] H00522_A330Cuen_SegundoApellido ;
   private boolean[] H00522_n330Cuen_SegundoApellido ;
   private String[] H00522_A329Cuen_PrimerApellido ;
   private boolean[] H00522_n329Cuen_PrimerApellido ;
   private String[] H00522_A332Cuen_SegundoNombre ;
   private boolean[] H00522_n332Cuen_SegundoNombre ;
   private String[] H00522_A331Cuen_PrimerNombre ;
   private boolean[] H00522_n331Cuen_PrimerNombre ;
   private byte[] H00522_A326Cuen_DigitoVerificacion ;
   private boolean[] H00522_n326Cuen_DigitoVerificacion ;
   private long[] H00522_A688Cuen_Cedula ;
   private long[] H00522_A43Cuen_Identificacion ;
   private long[] H00523_AGRID_nRecordCount ;
   private com.genexus.webpanels.WebSession AV8Session ;
   private com.orions2.SdtTransactionContext AV10TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV11TrnContextAtt ;
}

final  class alm_tipo_terceroalm_cuentadante_multiwc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00522", "SELECT T1.Tpte_Codigo, T1.Cuen_FechaModifica, T1.Cuen_UsuarioModifica, T1.Cuen_FechaCrea, T1.Cuen_UsuarioCrea, T2.Regi_Descripcion, T2.Regi_Cod, T1.Regi_Id, T5.Cent_Descripcion, T5.Cent_Codigo, T1.Cent_Id, T4.Dept_Descripcion, T3.Dept_Codigo, T3.Ciud_Descripcion, T2.Ciud_Codigo, T1.Cuen_Email, T1.Cuen_Telefono, T1.Cuen_Direccion, T1.Cuen_Estado, T1.Cuen_Clase, T1.Cuen_Nombre, T1.Cuen_SegundoApellido, T1.Cuen_PrimerApellido, T1.Cuen_SegundoNombre, T1.Cuen_PrimerNombre, T1.Cuen_DigitoVerificacion, T1.Cuen_Cedula, T1.Cuen_Identificacion FROM ((((ALM_CUENTADANTE T1 INNER JOIN GEN_REGIONAL T2 ON T2.Regi_Id = T1.Regi_Id) INNER JOIN GEN_CIUDAD T3 ON T3.Ciud_Codigo = T2.Ciud_Codigo) INNER JOIN GEN_DEPARTAMENTO T4 ON T4.Dept_Codigo = T3.Dept_Codigo) INNER JOIN GEN_CENTROCOSTO T5 ON T5.Cent_Id = T1.Cent_Id) WHERE T1.Tpte_Codigo = ? ORDER BY T1.Tpte_Codigo  OFFSET ? ROWS FETCH NEXT (CASE WHEN ? > 0 THEN ? ELSE 1e9 END) ROWS ONLY",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H00523", "SELECT COUNT(*) FROM ((((ALM_CUENTADANTE T1 INNER JOIN GEN_REGIONAL T3 ON T3.Regi_Id = T1.Regi_Id) INNER JOIN GEN_CIUDAD T4 ON T4.Ciud_Codigo = T3.Ciud_Codigo) INNER JOIN GEN_DEPARTAMENTO T5 ON T5.Dept_Codigo = T4.Dept_Codigo) INNER JOIN GEN_CENTROCOSTO T2 ON T2.Cent_Id = T1.Cent_Id) WHERE T1.Tpte_Codigo = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((short[]) buf[8])[0] = rslt.getShort(7) ;
               ((long[]) buf[9])[0] = rslt.getLong(8) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(10) ;
               ((long[]) buf[12])[0] = rslt.getLong(11) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(12) ;
               ((short[]) buf[14])[0] = rslt.getShort(13) ;
               ((String[]) buf[15])[0] = rslt.getVarchar(14) ;
               ((short[]) buf[16])[0] = rslt.getShort(15) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(19, 1) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(26) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((long[]) buf[39])[0] = rslt.getLong(27) ;
               ((long[]) buf[40])[0] = rslt.getLong(28) ;
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
               stmt.setString(1, (String)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 2);
               return;
      }
   }

}

