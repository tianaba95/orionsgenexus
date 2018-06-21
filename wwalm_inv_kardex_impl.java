/*
               File: wwalm_inv_kardex_impl
        Description: Work With Inventario Kardex
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:20:2.4
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

public final  class wwalm_inv_kardex_impl extends GXDataArea
{
   public wwalm_inv_kardex_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wwalm_inv_kardex_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwalm_inv_kardex_impl.class ));
   }

   public wwalm_inv_kardex_impl( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      httpContext.setDefaultTheme("Carmine");
      initialize_properties( ) ;
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
            nRC_GXsfl_21 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_21_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_21_idx = httpContext.GetNextPar( ) ;
            AV15Display = httpContext.GetNextPar( ) ;
            edtavDisplay_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "Tooltiptext", edtavDisplay_Tooltiptext, !bGXsfl_21_Refreshing);
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
            AV14Kard_Elem_Cons = httpContext.GetNextPar( ) ;
            AV15Display = httpContext.GetNextPar( ) ;
            edtavDisplay_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "Tooltiptext", edtavDisplay_Tooltiptext, !bGXsfl_21_Refreshing);
            AV19Pgmname = httpContext.GetNextPar( ) ;
            A85Kard_Regi_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            A86Kard_Cent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            A87Kard_Alm_Cod = httpContext.GetNextPar( ) ;
            A88Kard_Bod_Cod = httpContext.GetNextPar( ) ;
            A89Kard_Elem_Cons = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid_refresh( subGrid_Rows, AV14Kard_Elem_Cons, AV15Display, AV19Pgmname, A85Kard_Regi_Id, A86Kard_Cent_Id, A87Kard_Alm_Cod, A88Kard_Bod_Cod, A89Kard_Elem_Cons) ;
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
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         MasterPageObj = new com.orions2.rwdmasterpage_impl (remoteHandle, context.copy());
         MasterPageObj.setDataArea(this,false);
         validateSpaRequest();
         MasterPageObj.webExecute();
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
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
   }

   public byte executeStartEvent( )
   {
      pa5S2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start5S2( ) ;
      }
      return gxajaxcallmode ;
   }

   public void renderHtmlHeaders( )
   {
      com.orions2.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( Form.getCaption()) ;
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
      if ( nGXWrapped != 1 )
      {
         MasterPageObj.master_styles();
      }
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxcfg.js", "?2018614142028");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"false\"" : "") ;
      httpContext.writeText( "<body") ;
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      if ( nGXWrapped == 0 )
      {
         bodyStyle = bodyStyle + ";-moz-opacity:0;opacity:0;" ;
      }
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle = bodyStyle + " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      if ( nGXWrapped != 1 )
      {
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.wwalm_inv_kardex") +"\">") ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" style=\"display:none\">") ;
         httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      }
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vKARD_ELEM_CONS", AV14Kard_Elem_Cons);
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_21", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_21, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV19Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vDISPLAY_Tooltiptext", GXutil.rtrim( edtavDisplay_Tooltiptext));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm( )
   {
      sendCloseFormHiddens( ) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", GX_FocusControl);
      httpContext.SendAjaxEncryptionKey();
      sendSecurityToken(sPrefix);
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
   }

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         com.orions2.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we5S2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt5S2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return false ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("com.orions2.wwalm_inv_kardex")  ;
   }

   public String getPgmname( )
   {
      return "WWALM_INV_KARDEX" ;
   }

   public String getPgmdesc( )
   {
      return "Work With Inventario Kardex" ;
   }

   public void wb5S0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( nGXWrapped == 1 )
         {
            renderHtmlHeaders( ) ;
            renderHtmlOpenForm( ) ;
         }
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "BodyContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTabletop_Internalname, 1, 0, "px", 0, "px", "TableTopSearch", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-7 col-sm-2 col-sm-offset-1", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitletext_Internalname, "Work With Inventario Kardexs", "", "", lblTitletext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WWALM_INV_KARDEX.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-5 col-sm-3 col-sm-push-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavKard_elem_cons_Internalname, "Kard_Elem_Cons", "col-sm-3 FilterSearchAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'" + sGXsfl_21_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavKard_elem_cons_Internalname, AV14Kard_Elem_Cons, GXutil.rtrim( localUtil.format( AV14Kard_Elem_Cons, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,12);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "Elemento Consecutivo", edtavKard_elem_cons_Jsonclick, 0, "FilterSearchAttribute", "", "", "", 1, edtavKard_elem_cons_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_INV_KARDEX.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divGridcell_Internalname, 1, 0, "px", 0, "px", "col-xs-12 ViewGridCellAdvanced", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divGridtable_Internalname, 1, 0, "px", 0, "px", "ContainerFluid WWAdvancedContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
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
            httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"21\">") ;
            sStyleString = "" ;
            com.orions2.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "WorkWith", 0, "", "", 1, 2, sStyleString, "", 0);
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
            httpContext.writeValue( "Regional Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Regional Codigo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Costo Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Costo Codigo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Almacen Codigo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Bodega Codigo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Elemento Consecutivo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Valor Unitario") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Saldo Canitdad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Saldo Valor") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DisplayAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
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
            GridContainer.AddObjectProperty("Class", "WorkWith");
            GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("CmpContext", "");
            GridContainer.AddObjectProperty("InMasterPage", "false");
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A85Kard_Regi_Id, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A577Kard_Regi_Cod, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A86Kard_Cent_Id, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A578Kard_Cent_Cod);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A87Kard_Alm_Cod);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A88Kard_Bod_Cod);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A89Kard_Elem_Cons);
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtKard_Elem_Cons_Link));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A588Kard_Val_Unitario, (byte)(24), (byte)(2), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A590Kard_Saldo_Cant, (byte)(8), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A589Kard_Saldo_Valor, (byte)(24), (byte)(2), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV15Display));
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtavDisplay_Link));
            GridColumn.AddObjectProperty("Tooltiptext", GXutil.rtrim( edtavDisplay_Tooltiptext));
            GridContainer.AddColumnProperties(GridColumn);
            GridContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid_Allowselection, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 21 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_21 = (short)(nGXsfl_21_idx-1) ;
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
            httpContext.writeText( "<div id=\""+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid", GridContainer);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               com.orions2.GxWebStd.gx_hidden_field( httpContext, "GridContainerData", GridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               com.orions2.GxWebStd.gx_hidden_field( httpContext, "GridContainerData"+"V", GridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
            }
         }
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start5S2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Work With Inventario Kardex", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup5S0( ) ;
   }

   public void ws5S2( )
   {
      start5S2( ) ;
      evt5S2( ) ;
   }

   public void evt5S2( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            sEvt = httpContext.cgiGet( "_EventName") ;
            EvtGridId = httpContext.cgiGet( "_EventGridId") ;
            EvtRowId = httpContext.cgiGet( "_EventRowId") ;
            if ( GXutil.len( sEvt) > 0 )
            {
               sEvtType = GXutil.left( sEvt, 1) ;
               sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
               if ( GXutil.strcmp(sEvtType, "M") != 0 )
               {
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRIDPAGING") ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_21_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_21_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_21_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_212( ) ;
                           A85Kard_Regi_Id = localUtil.ctol( httpContext.cgiGet( edtKard_Regi_Id_Internalname), ",", ".") ;
                           A577Kard_Regi_Cod = (short)(localUtil.ctol( httpContext.cgiGet( edtKard_Regi_Cod_Internalname), ",", ".")) ;
                           A86Kard_Cent_Id = localUtil.ctol( httpContext.cgiGet( edtKard_Cent_Id_Internalname), ",", ".") ;
                           A578Kard_Cent_Cod = httpContext.cgiGet( edtKard_Cent_Cod_Internalname) ;
                           A87Kard_Alm_Cod = httpContext.cgiGet( edtKard_Alm_Cod_Internalname) ;
                           A88Kard_Bod_Cod = httpContext.cgiGet( edtKard_Bod_Cod_Internalname) ;
                           A89Kard_Elem_Cons = httpContext.cgiGet( edtKard_Elem_Cons_Internalname) ;
                           A588Kard_Val_Unitario = localUtil.ctond( httpContext.cgiGet( edtKard_Val_Unitario_Internalname)) ;
                           A590Kard_Saldo_Cant = (int)(localUtil.ctol( httpContext.cgiGet( edtKard_Saldo_Cant_Internalname), ",", ".")) ;
                           n590Kard_Saldo_Cant = false ;
                           A589Kard_Saldo_Valor = localUtil.ctond( httpContext.cgiGet( edtKard_Saldo_Valor_Internalname)) ;
                           n589Kard_Saldo_Valor = false ;
                           AV15Display = httpContext.cgiGet( edtavDisplay_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "Bitmap", ((GXutil.strcmp("", AV15Display)==0) ? AV20Display_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV15Display))), !bGXsfl_21_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV15Display), true);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e115S2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e125S2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e135S2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Kard_elem_cons Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vKARD_ELEM_CONS"), AV14Kard_Elem_Cons) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                    }
                                    dynload_actions( ) ;
                                 }
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
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

   public void we5S2( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            if ( nGXWrapped == 1 )
            {
               renderHtmlCloseForm( ) ;
            }
         }
      }
   }

   public void pa5S2( )
   {
      if ( nDonePA == 0 )
      {
         if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
         {
            gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", com.genexus.util.Encryption.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(0)) ;
         }
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GX_FocusControl = edtavKard_elem_cons_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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
      subsflControlProps_212( ) ;
      while ( nGXsfl_21_idx <= nRC_GXsfl_21 )
      {
         sendrow_212( ) ;
         nGXsfl_21_idx = (short)(((subGrid_Islastpage==1)&&(nGXsfl_21_idx+1>subgrid_recordsperpage( )) ? 1 : nGXsfl_21_idx+1)) ;
         sGXsfl_21_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_21_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_212( ) ;
      }
      httpContext.GX_webresponse.addString(GridContainer.ToJavascriptSource());
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV14Kard_Elem_Cons ,
                                 String AV15Display ,
                                 String AV19Pgmname ,
                                 long A85Kard_Regi_Id ,
                                 long A86Kard_Cent_Id ,
                                 String A87Kard_Alm_Cod ,
                                 String A88Kard_Bod_Cod ,
                                 String A89Kard_Elem_Cons )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid_Rows = subGrid_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID_nCurrentRecord = 0 ;
      rf5S2( ) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_KARD_REGI_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A85Kard_Regi_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "KARD_REGI_ID", GXutil.ltrim( localUtil.ntoc( A85Kard_Regi_Id, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_KARD_REGI_COD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A577Kard_Regi_Cod), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "KARD_REGI_COD", GXutil.ltrim( localUtil.ntoc( A577Kard_Regi_Cod, (byte)(4), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_KARD_CENT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A86Kard_Cent_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "KARD_CENT_ID", GXutil.ltrim( localUtil.ntoc( A86Kard_Cent_Id, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_KARD_CENT_COD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A578Kard_Cent_Cod, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "KARD_CENT_COD", A578Kard_Cent_Cod);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_KARD_ALM_COD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A87Kard_Alm_Cod, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "KARD_ALM_COD", A87Kard_Alm_Cod);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_KARD_BOD_COD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A88Kard_Bod_Cod, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "KARD_BOD_COD", A88Kard_Bod_Cod);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_KARD_VAL_UNITARIO", getSecureSignedToken( "", localUtil.format( A588Kard_Val_Unitario, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "KARD_VAL_UNITARIO", GXutil.ltrim( localUtil.ntoc( A588Kard_Val_Unitario, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_KARD_SALDO_CANT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A590Kard_Saldo_Cant), "ZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "KARD_SALDO_CANT", GXutil.ltrim( localUtil.ntoc( A590Kard_Saldo_Cant, (byte)(8), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_KARD_SALDO_VALOR", getSecureSignedToken( "", localUtil.format( A589Kard_Saldo_Valor, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "KARD_SALDO_VALOR", GXutil.ltrim( localUtil.ntoc( A589Kard_Saldo_Valor, (byte)(18), (byte)(2), ".", "")));
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf5S2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV19Pgmname = "WWALM_INV_KARDEX" ;
      Gx_err = (short)(0) ;
   }

   public void rf5S2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(21) ;
      /* Execute user event: Refresh */
      e125S2 ();
      nGXsfl_21_idx = (short)(1) ;
      sGXsfl_21_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_21_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_212( ) ;
      bGXsfl_21_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_recordsperpage( ) );
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_212( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 0 : GRID_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((subGrid_Rows==0) ? 10000 : subgrid_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV14Kard_Elem_Cons ,
                                              A89Kard_Elem_Cons } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING
                                              }
         } ) ;
         lV14Kard_Elem_Cons = GXutil.concat( GXutil.rtrim( AV14Kard_Elem_Cons), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Kard_Elem_Cons", AV14Kard_Elem_Cons);
         /* Using cursor H005S2 */
         pr_default.execute(0, new Object[] {lV14Kard_Elem_Cons, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_21_idx = (short)(1) ;
         sGXsfl_21_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_21_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_212( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_recordsperpage( ) ) ) ) )
         {
            A89Kard_Elem_Cons = H005S2_A89Kard_Elem_Cons[0] ;
            A88Kard_Bod_Cod = H005S2_A88Kard_Bod_Cod[0] ;
            A87Kard_Alm_Cod = H005S2_A87Kard_Alm_Cod[0] ;
            A578Kard_Cent_Cod = H005S2_A578Kard_Cent_Cod[0] ;
            A86Kard_Cent_Id = H005S2_A86Kard_Cent_Id[0] ;
            A577Kard_Regi_Cod = H005S2_A577Kard_Regi_Cod[0] ;
            A85Kard_Regi_Id = H005S2_A85Kard_Regi_Id[0] ;
            A590Kard_Saldo_Cant = H005S2_A590Kard_Saldo_Cant[0] ;
            n590Kard_Saldo_Cant = H005S2_n590Kard_Saldo_Cant[0] ;
            A589Kard_Saldo_Valor = H005S2_A589Kard_Saldo_Valor[0] ;
            n589Kard_Saldo_Valor = H005S2_n589Kard_Saldo_Valor[0] ;
            A588Kard_Val_Unitario = A589Kard_Saldo_Valor.divide(DecimalUtil.doubleToDec(A590Kard_Saldo_Cant), 18, java.math.BigDecimal.ROUND_DOWN) ;
            e135S2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(21) ;
         wb5S0( ) ;
      }
      bGXsfl_21_Refreshing = true ;
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
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV14Kard_Elem_Cons ,
                                           A89Kard_Elem_Cons } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      } ) ;
      lV14Kard_Elem_Cons = GXutil.concat( GXutil.rtrim( AV14Kard_Elem_Cons), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Kard_Elem_Cons", AV14Kard_Elem_Cons);
      /* Using cursor H005S3 */
      pr_default.execute(1, new Object[] {lV14Kard_Elem_Cons});
      GRID_nRecordCount = H005S3_AGRID_nRecordCount[0] ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14Kard_Elem_Cons, AV15Display, AV19Pgmname, A85Kard_Regi_Id, A86Kard_Cent_Id, A87Kard_Alm_Cod, A88Kard_Bod_Cod, A89Kard_Elem_Cons) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
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
         gxgrgrid_refresh( subGrid_Rows, AV14Kard_Elem_Cons, AV15Display, AV19Pgmname, A85Kard_Regi_Id, A86Kard_Cent_Id, A87Kard_Alm_Cod, A88Kard_Bod_Cod, A89Kard_Elem_Cons) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
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
         gxgrgrid_refresh( subGrid_Rows, AV14Kard_Elem_Cons, AV15Display, AV19Pgmname, A85Kard_Regi_Id, A86Kard_Cent_Id, A87Kard_Alm_Cod, A88Kard_Bod_Cod, A89Kard_Elem_Cons) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
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
         gxgrgrid_refresh( subGrid_Rows, AV14Kard_Elem_Cons, AV15Display, AV19Pgmname, A85Kard_Regi_Id, A86Kard_Cent_Id, A87Kard_Alm_Cod, A88Kard_Bod_Cod, A89Kard_Elem_Cons) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
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
         gxgrgrid_refresh( subGrid_Rows, AV14Kard_Elem_Cons, AV15Display, AV19Pgmname, A85Kard_Regi_Id, A86Kard_Cent_Id, A87Kard_Alm_Cod, A88Kard_Bod_Cod, A89Kard_Elem_Cons) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup5S0( )
   {
      /* Before Start, stand alone formulas. */
      AV19Pgmname = "WWALM_INV_KARDEX" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e115S2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV14Kard_Elem_Cons = httpContext.cgiGet( edtavKard_elem_cons_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Kard_Elem_Cons", AV14Kard_Elem_Cons);
         /* Read saved values. */
         nRC_GXsfl_21 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_21"), ",", ".")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), ",", ".") ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), ",", ".")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), ",", ".")) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vKARD_ELEM_CONS"), AV14Kard_Elem_Cons) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e115S2 ();
      if (returnInSub) return;
   }

   public void e115S2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV19Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV19Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      subGrid_Rows = 10 ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV15Display = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "Bitmap", ((GXutil.strcmp("", AV15Display)==0) ? AV20Display_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV15Display))), !bGXsfl_21_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV15Display), true);
      AV20Display_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "Bitmap", ((GXutil.strcmp("", AV15Display)==0) ? AV20Display_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV15Display))), !bGXsfl_21_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV15Display), true);
      edtavDisplay_Tooltiptext = "Visualizar" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "Tooltiptext", edtavDisplay_Tooltiptext, !bGXsfl_21_Refreshing);
      Form.setCaption( "Work With Inventario Kardexs" );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
   }

   public void e125S2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
   }

   private void e135S2( )
   {
      /* Grid_Load Routine */
      edtavDisplay_Link = formatLink("com.orions2.alm_inv_kardex") + "?" + GXutil.URLEncode(GXutil.rtrim("DSP")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A85Kard_Regi_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A86Kard_Cent_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(A87Kard_Alm_Cod)) + "," + GXutil.URLEncode(GXutil.rtrim(A88Kard_Bod_Cod)) + "," + GXutil.URLEncode(GXutil.rtrim(A89Kard_Elem_Cons)) ;
      edtKard_Elem_Cons_Link = formatLink("com.orions2.viewalm_inv_kardex") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A85Kard_Regi_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A86Kard_Cent_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(A87Kard_Alm_Cod)) + "," + GXutil.URLEncode(GXutil.rtrim(A88Kard_Bod_Cod)) + "," + GXutil.URLEncode(GXutil.rtrim(A89Kard_Elem_Cons)) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(21) ;
      }
      sendrow_212( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_21_Refreshing )
      {
         httpContext.doAjaxLoad(21, GridRow);
      }
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      if ( GXutil.strcmp(AV8HTTPRequest.getMethod(), "GET") == 0 )
      {
         AV9GridState.fromxml(AV7Session.getValue(AV19Pgmname+"GridState"), null, null);
         if ( AV9GridState.getgxTv_SdtGridState_Filtervalues().size() >= 1 )
         {
            AV14Kard_Elem_Cons = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+1)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Kard_Elem_Cons", AV14Kard_Elem_Cons);
         }
         if ( AV9GridState.getgxTv_SdtGridState_Currentpage() > 0 )
         {
            AV11GridPageCount = subgrid_pagecount( ) ;
            if ( ( AV11GridPageCount > 0 ) && ( AV11GridPageCount < AV9GridState.getgxTv_SdtGridState_Currentpage() ) )
            {
               subgrid_gotopage( AV11GridPageCount) ;
            }
            else
            {
               subgrid_gotopage( AV9GridState.getgxTv_SdtGridState_Currentpage()) ;
            }
         }
      }
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      AV9GridState.fromxml(AV7Session.getValue(AV19Pgmname+"GridState"), null, null);
      AV9GridState.setgxTv_SdtGridState_Currentpage( (short)(subgrid_currentpage( )) );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().clear();
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV14Kard_Elem_Cons );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV7Session.setValue(AV19Pgmname+"GridState", AV9GridState.toxml(false, true, "GridState", "ACBSENA"));
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV12TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV12TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV19Pgmname );
      AV12TrnContext.setgxTv_SdtTransactionContext_Callerondelete( true );
      AV12TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV8HTTPRequest.getScriptName()+"?"+AV8HTTPRequest.getQuerystring() );
      AV12TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_INV_KARDEX" );
      AV7Session.setValue("TrnContext", AV12TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
   }

   public String getresponse( String sGXDynURL )
   {
      httpContext.setDefaultTheme("Carmine");
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa5S2( ) ;
      ws5S2( ) ;
      we5S2( ) ;
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
      httpContext.setWrapped(false);
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

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20186141420257");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
         httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
         httpContext.AddJavascriptSource("wwalm_inv_kardex.js", "?20186141420258");
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_212( )
   {
      edtKard_Regi_Id_Internalname = "KARD_REGI_ID_"+sGXsfl_21_idx ;
      edtKard_Regi_Cod_Internalname = "KARD_REGI_COD_"+sGXsfl_21_idx ;
      edtKard_Cent_Id_Internalname = "KARD_CENT_ID_"+sGXsfl_21_idx ;
      edtKard_Cent_Cod_Internalname = "KARD_CENT_COD_"+sGXsfl_21_idx ;
      edtKard_Alm_Cod_Internalname = "KARD_ALM_COD_"+sGXsfl_21_idx ;
      edtKard_Bod_Cod_Internalname = "KARD_BOD_COD_"+sGXsfl_21_idx ;
      edtKard_Elem_Cons_Internalname = "KARD_ELEM_CONS_"+sGXsfl_21_idx ;
      edtKard_Val_Unitario_Internalname = "KARD_VAL_UNITARIO_"+sGXsfl_21_idx ;
      edtKard_Saldo_Cant_Internalname = "KARD_SALDO_CANT_"+sGXsfl_21_idx ;
      edtKard_Saldo_Valor_Internalname = "KARD_SALDO_VALOR_"+sGXsfl_21_idx ;
      edtavDisplay_Internalname = "vDISPLAY_"+sGXsfl_21_idx ;
   }

   public void subsflControlProps_fel_212( )
   {
      edtKard_Regi_Id_Internalname = "KARD_REGI_ID_"+sGXsfl_21_fel_idx ;
      edtKard_Regi_Cod_Internalname = "KARD_REGI_COD_"+sGXsfl_21_fel_idx ;
      edtKard_Cent_Id_Internalname = "KARD_CENT_ID_"+sGXsfl_21_fel_idx ;
      edtKard_Cent_Cod_Internalname = "KARD_CENT_COD_"+sGXsfl_21_fel_idx ;
      edtKard_Alm_Cod_Internalname = "KARD_ALM_COD_"+sGXsfl_21_fel_idx ;
      edtKard_Bod_Cod_Internalname = "KARD_BOD_COD_"+sGXsfl_21_fel_idx ;
      edtKard_Elem_Cons_Internalname = "KARD_ELEM_CONS_"+sGXsfl_21_fel_idx ;
      edtKard_Val_Unitario_Internalname = "KARD_VAL_UNITARIO_"+sGXsfl_21_fel_idx ;
      edtKard_Saldo_Cant_Internalname = "KARD_SALDO_CANT_"+sGXsfl_21_fel_idx ;
      edtKard_Saldo_Valor_Internalname = "KARD_SALDO_VALOR_"+sGXsfl_21_fel_idx ;
      edtavDisplay_Internalname = "vDISPLAY_"+sGXsfl_21_fel_idx ;
   }

   public void sendrow_212( )
   {
      subsflControlProps_212( ) ;
      wb5S0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_21_idx <= subgrid_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_21_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_21_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtKard_Regi_Id_Internalname,GXutil.ltrim( localUtil.ntoc( A85Kard_Regi_Id, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A85Kard_Regi_Id), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtKard_Regi_Id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(21),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtKard_Regi_Cod_Internalname,GXutil.ltrim( localUtil.ntoc( A577Kard_Regi_Cod, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A577Kard_Regi_Cod), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtKard_Regi_Cod_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(21),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtKard_Cent_Id_Internalname,GXutil.ltrim( localUtil.ntoc( A86Kard_Cent_Id, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A86Kard_Cent_Id), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtKard_Cent_Id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(21),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtKard_Cent_Cod_Internalname,A578Kard_Cent_Cod,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtKard_Cent_Cod_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(16),new Integer(0),new Integer(0),new Integer(21),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtKard_Alm_Cod_Internalname,A87Kard_Alm_Cod,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtKard_Alm_Cod_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(21),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtKard_Bod_Cod_Internalname,A88Kard_Bod_Cod,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtKard_Bod_Cod_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(21),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtKard_Elem_Cons_Internalname,A89Kard_Elem_Cons,"","","'"+""+"'"+",false,"+"'"+""+"'",edtKard_Elem_Cons_Link,"","","",edtKard_Elem_Cons_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(21),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtKard_Val_Unitario_Internalname,GXutil.ltrim( localUtil.ntoc( A588Kard_Val_Unitario, (byte)(24), (byte)(2), ",", "")),localUtil.format( A588Kard_Val_Unitario, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtKard_Val_Unitario_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(21),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Valor","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtKard_Saldo_Cant_Internalname,GXutil.ltrim( localUtil.ntoc( A590Kard_Saldo_Cant, (byte)(8), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A590Kard_Saldo_Cant), "ZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtKard_Saldo_Cant_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(21),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtKard_Saldo_Valor_Internalname,GXutil.ltrim( localUtil.ntoc( A589Kard_Saldo_Valor, (byte)(24), (byte)(2), ",", "")),localUtil.format( A589Kard_Saldo_Valor, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtKard_Saldo_Valor_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(21),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Valor","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         ClassString = "DisplayAttribute" ;
         StyleString = "" ;
         AV15Display_IsBlob = (boolean)(((GXutil.strcmp("", AV15Display)==0)&&(GXutil.strcmp("", AV20Display_GXI)==0))||!(GXutil.strcmp("", AV15Display)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV15Display)==0) ? AV20Display_GXI : httpContext.getResourceRelative(AV15Display)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavDisplay_Internalname,sImgUrl,edtavDisplay_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"",edtavDisplay_Tooltiptext,new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV15Display_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_KARD_REGI_ID"+"_"+sGXsfl_21_idx, getSecureSignedToken( sGXsfl_21_idx, localUtil.format( DecimalUtil.doubleToDec(A85Kard_Regi_Id), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_KARD_REGI_COD"+"_"+sGXsfl_21_idx, getSecureSignedToken( sGXsfl_21_idx, localUtil.format( DecimalUtil.doubleToDec(A577Kard_Regi_Cod), "ZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_KARD_CENT_ID"+"_"+sGXsfl_21_idx, getSecureSignedToken( sGXsfl_21_idx, localUtil.format( DecimalUtil.doubleToDec(A86Kard_Cent_Id), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_KARD_CENT_COD"+"_"+sGXsfl_21_idx, getSecureSignedToken( sGXsfl_21_idx, GXutil.rtrim( localUtil.format( A578Kard_Cent_Cod, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_KARD_ALM_COD"+"_"+sGXsfl_21_idx, getSecureSignedToken( sGXsfl_21_idx, GXutil.rtrim( localUtil.format( A87Kard_Alm_Cod, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_KARD_BOD_COD"+"_"+sGXsfl_21_idx, getSecureSignedToken( sGXsfl_21_idx, GXutil.rtrim( localUtil.format( A88Kard_Bod_Cod, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_KARD_VAL_UNITARIO"+"_"+sGXsfl_21_idx, getSecureSignedToken( sGXsfl_21_idx, localUtil.format( A588Kard_Val_Unitario, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_KARD_SALDO_CANT"+"_"+sGXsfl_21_idx, getSecureSignedToken( sGXsfl_21_idx, localUtil.format( DecimalUtil.doubleToDec(A590Kard_Saldo_Cant), "ZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_KARD_SALDO_VALOR"+"_"+sGXsfl_21_idx, getSecureSignedToken( sGXsfl_21_idx, localUtil.format( A589Kard_Saldo_Valor, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         GridContainer.AddRow(GridRow);
         nGXsfl_21_idx = (short)(((subGrid_Islastpage==1)&&(nGXsfl_21_idx+1>subgrid_recordsperpage( )) ? 1 : nGXsfl_21_idx+1)) ;
         sGXsfl_21_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_21_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_212( ) ;
      }
      /* End function sendrow_212 */
   }

   public void init_default_properties( )
   {
      lblTitletext_Internalname = "TITLETEXT" ;
      edtavKard_elem_cons_Internalname = "vKARD_ELEM_CONS" ;
      divTabletop_Internalname = "TABLETOP" ;
      edtKard_Regi_Id_Internalname = "KARD_REGI_ID" ;
      edtKard_Regi_Cod_Internalname = "KARD_REGI_COD" ;
      edtKard_Cent_Id_Internalname = "KARD_CENT_ID" ;
      edtKard_Cent_Cod_Internalname = "KARD_CENT_COD" ;
      edtKard_Alm_Cod_Internalname = "KARD_ALM_COD" ;
      edtKard_Bod_Cod_Internalname = "KARD_BOD_COD" ;
      edtKard_Elem_Cons_Internalname = "KARD_ELEM_CONS" ;
      edtKard_Val_Unitario_Internalname = "KARD_VAL_UNITARIO" ;
      edtKard_Saldo_Cant_Internalname = "KARD_SALDO_CANT" ;
      edtKard_Saldo_Valor_Internalname = "KARD_SALDO_VALOR" ;
      edtavDisplay_Internalname = "vDISPLAY" ;
      divGridtable_Internalname = "GRIDTABLE" ;
      divGridcell_Internalname = "GRIDCELL" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGrid_Internalname = "GRID" ;
   }

   public void initialize_properties( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      edtKard_Saldo_Valor_Jsonclick = "" ;
      edtKard_Saldo_Cant_Jsonclick = "" ;
      edtKard_Val_Unitario_Jsonclick = "" ;
      edtKard_Elem_Cons_Jsonclick = "" ;
      edtKard_Bod_Cod_Jsonclick = "" ;
      edtKard_Alm_Cod_Jsonclick = "" ;
      edtKard_Cent_Cod_Jsonclick = "" ;
      edtKard_Cent_Id_Jsonclick = "" ;
      edtKard_Regi_Cod_Jsonclick = "" ;
      edtKard_Regi_Id_Jsonclick = "" ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      edtavDisplay_Link = "" ;
      edtKard_Elem_Cons_Link = "" ;
      subGrid_Class = "WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavKard_elem_cons_Jsonclick = "" ;
      edtavKard_elem_cons_Enabled = 1 ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Work With Inventario Kardex" );
      subGrid_Rows = 0 ;
      edtavDisplay_Tooltiptext = "Visualizar" ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV15Display',fld:'vDISPLAY',pic:'',nv:''},{av:'edtavDisplay_Tooltiptext',ctrl:'vDISPLAY',prop:'Tooltiptext'},{av:'A85Kard_Regi_Id',fld:'KARD_REGI_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A86Kard_Cent_Id',fld:'KARD_CENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A87Kard_Alm_Cod',fld:'KARD_ALM_COD',pic:'',hsh:true,nv:''},{av:'A88Kard_Bod_Cod',fld:'KARD_BOD_COD',pic:'',hsh:true,nv:''},{av:'A89Kard_Elem_Cons',fld:'KARD_ELEM_CONS',pic:'',nv:''},{av:'AV19Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Kard_Elem_Cons',fld:'vKARD_ELEM_CONS',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e135S2',iparms:[{av:'A85Kard_Regi_Id',fld:'KARD_REGI_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A86Kard_Cent_Id',fld:'KARD_CENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A87Kard_Alm_Cod',fld:'KARD_ALM_COD',pic:'',hsh:true,nv:''},{av:'A88Kard_Bod_Cod',fld:'KARD_BOD_COD',pic:'',hsh:true,nv:''},{av:'A89Kard_Elem_Cons',fld:'KARD_ELEM_CONS',pic:'',nv:''}],oparms:[{av:'edtavDisplay_Link',ctrl:'vDISPLAY',prop:'Link'},{av:'edtKard_Elem_Cons_Link',ctrl:'KARD_ELEM_CONS',prop:'Link'}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV15Display',fld:'vDISPLAY',pic:'',nv:''},{av:'edtavDisplay_Tooltiptext',ctrl:'vDISPLAY',prop:'Tooltiptext'},{av:'A85Kard_Regi_Id',fld:'KARD_REGI_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A86Kard_Cent_Id',fld:'KARD_CENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A87Kard_Alm_Cod',fld:'KARD_ALM_COD',pic:'',hsh:true,nv:''},{av:'A88Kard_Bod_Cod',fld:'KARD_BOD_COD',pic:'',hsh:true,nv:''},{av:'A89Kard_Elem_Cons',fld:'KARD_ELEM_CONS',pic:'',nv:''},{av:'AV19Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Kard_Elem_Cons',fld:'vKARD_ELEM_CONS',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV15Display',fld:'vDISPLAY',pic:'',nv:''},{av:'edtavDisplay_Tooltiptext',ctrl:'vDISPLAY',prop:'Tooltiptext'},{av:'A85Kard_Regi_Id',fld:'KARD_REGI_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A86Kard_Cent_Id',fld:'KARD_CENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A87Kard_Alm_Cod',fld:'KARD_ALM_COD',pic:'',hsh:true,nv:''},{av:'A88Kard_Bod_Cod',fld:'KARD_BOD_COD',pic:'',hsh:true,nv:''},{av:'A89Kard_Elem_Cons',fld:'KARD_ELEM_CONS',pic:'',nv:''},{av:'AV19Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Kard_Elem_Cons',fld:'vKARD_ELEM_CONS',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV15Display',fld:'vDISPLAY',pic:'',nv:''},{av:'edtavDisplay_Tooltiptext',ctrl:'vDISPLAY',prop:'Tooltiptext'},{av:'A85Kard_Regi_Id',fld:'KARD_REGI_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A86Kard_Cent_Id',fld:'KARD_CENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A87Kard_Alm_Cod',fld:'KARD_ALM_COD',pic:'',hsh:true,nv:''},{av:'A88Kard_Bod_Cod',fld:'KARD_BOD_COD',pic:'',hsh:true,nv:''},{av:'A89Kard_Elem_Cons',fld:'KARD_ELEM_CONS',pic:'',nv:''},{av:'AV19Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Kard_Elem_Cons',fld:'vKARD_ELEM_CONS',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV15Display',fld:'vDISPLAY',pic:'',nv:''},{av:'edtavDisplay_Tooltiptext',ctrl:'vDISPLAY',prop:'Tooltiptext'},{av:'A85Kard_Regi_Id',fld:'KARD_REGI_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A86Kard_Cent_Id',fld:'KARD_CENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A87Kard_Alm_Cod',fld:'KARD_ALM_COD',pic:'',hsh:true,nv:''},{av:'A88Kard_Bod_Cod',fld:'KARD_BOD_COD',pic:'',hsh:true,nv:''},{av:'A89Kard_Elem_Cons',fld:'KARD_ELEM_CONS',pic:'',nv:''},{av:'AV19Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Kard_Elem_Cons',fld:'vKARD_ELEM_CONS',pic:'',nv:''}],oparms:[]}");
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
      AV15Display = "" ;
      AV14Kard_Elem_Cons = "" ;
      AV19Pgmname = "" ;
      A87Kard_Alm_Cod = "" ;
      A88Kard_Bod_Cod = "" ;
      A89Kard_Elem_Cons = "" ;
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblTitletext_Jsonclick = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid_Linesclass = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      A578Kard_Cent_Cod = "" ;
      A588Kard_Val_Unitario = DecimalUtil.ZERO ;
      A589Kard_Saldo_Valor = DecimalUtil.ZERO ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV20Display_GXI = "" ;
      scmdbuf = "" ;
      lV14Kard_Elem_Cons = "" ;
      H005S2_A89Kard_Elem_Cons = new String[] {""} ;
      H005S2_A88Kard_Bod_Cod = new String[] {""} ;
      H005S2_A87Kard_Alm_Cod = new String[] {""} ;
      H005S2_A578Kard_Cent_Cod = new String[] {""} ;
      H005S2_A86Kard_Cent_Id = new long[1] ;
      H005S2_A577Kard_Regi_Cod = new short[1] ;
      H005S2_A85Kard_Regi_Id = new long[1] ;
      H005S2_A590Kard_Saldo_Cant = new int[1] ;
      H005S2_n590Kard_Saldo_Cant = new boolean[] {false} ;
      H005S2_A589Kard_Saldo_Valor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H005S2_n589Kard_Saldo_Valor = new boolean[] {false} ;
      H005S3_AGRID_nRecordCount = new long[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV8HTTPRequest = httpContext.getHttpRequest();
      AV9GridState = new com.orions2.SdtGridState(remoteHandle, context);
      AV7Session = httpContext.getWebSession();
      AV10GridStateFilterValue = new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV12TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      ROClassString = "" ;
      sImgUrl = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wwalm_inv_kardex__default(),
         new Object[] {
             new Object[] {
            H005S2_A89Kard_Elem_Cons, H005S2_A88Kard_Bod_Cod, H005S2_A87Kard_Alm_Cod, H005S2_A578Kard_Cent_Cod, H005S2_A86Kard_Cent_Id, H005S2_A577Kard_Regi_Cod, H005S2_A85Kard_Regi_Id, H005S2_A590Kard_Saldo_Cant, H005S2_n590Kard_Saldo_Cant, H005S2_A589Kard_Saldo_Valor,
            H005S2_n589Kard_Saldo_Valor
            }
            , new Object[] {
            H005S3_AGRID_nRecordCount
            }
         }
      );
      AV19Pgmname = "WWALM_INV_KARDEX" ;
      /* GeneXus formulas. */
      AV19Pgmname = "WWALM_INV_KARDEX" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte GRID_nEOF ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private byte nDonePA ;
   private byte subGrid_Backstyle ;
   private short nRC_GXsfl_21 ;
   private short nGXsfl_21_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short A577Kard_Regi_Cod ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int edtavKard_elem_cons_Enabled ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Allbackcolor ;
   private int A590Kard_Saldo_Cant ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV11GridPageCount ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private long A85Kard_Regi_Id ;
   private long A86Kard_Cent_Id ;
   private long GRID_nFirstRecordOnPage ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal A588Kard_Val_Unitario ;
   private java.math.BigDecimal A589Kard_Saldo_Valor ;
   private String edtavDisplay_Tooltiptext ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_21_idx="0001" ;
   private String edtavDisplay_Internalname ;
   private String AV19Pgmname ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String divTabletop_Internalname ;
   private String lblTitletext_Internalname ;
   private String lblTitletext_Jsonclick ;
   private String edtavKard_elem_cons_Internalname ;
   private String TempTags ;
   private String edtavKard_elem_cons_Jsonclick ;
   private String divGridcell_Internalname ;
   private String divGridtable_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String edtKard_Elem_Cons_Link ;
   private String edtavDisplay_Link ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtKard_Regi_Id_Internalname ;
   private String edtKard_Regi_Cod_Internalname ;
   private String edtKard_Cent_Id_Internalname ;
   private String edtKard_Cent_Cod_Internalname ;
   private String edtKard_Alm_Cod_Internalname ;
   private String edtKard_Bod_Cod_Internalname ;
   private String edtKard_Elem_Cons_Internalname ;
   private String edtKard_Val_Unitario_Internalname ;
   private String edtKard_Saldo_Cant_Internalname ;
   private String edtKard_Saldo_Valor_Internalname ;
   private String scmdbuf ;
   private String sGXsfl_21_fel_idx="0001" ;
   private String ROClassString ;
   private String edtKard_Regi_Id_Jsonclick ;
   private String edtKard_Regi_Cod_Jsonclick ;
   private String edtKard_Cent_Id_Jsonclick ;
   private String edtKard_Cent_Cod_Jsonclick ;
   private String edtKard_Alm_Cod_Jsonclick ;
   private String edtKard_Bod_Cod_Jsonclick ;
   private String edtKard_Elem_Cons_Jsonclick ;
   private String edtKard_Val_Unitario_Jsonclick ;
   private String edtKard_Saldo_Cant_Jsonclick ;
   private String edtKard_Saldo_Valor_Jsonclick ;
   private String sImgUrl ;
   private boolean entryPointCalled ;
   private boolean bGXsfl_21_Refreshing=false ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n590Kard_Saldo_Cant ;
   private boolean n589Kard_Saldo_Valor ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV15Display_IsBlob ;
   private String AV14Kard_Elem_Cons ;
   private String A87Kard_Alm_Cod ;
   private String A88Kard_Bod_Cod ;
   private String A89Kard_Elem_Cons ;
   private String A578Kard_Cent_Cod ;
   private String AV20Display_GXI ;
   private String lV14Kard_Elem_Cons ;
   private String AV15Display ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV8HTTPRequest ;
   private com.genexus.webpanels.WebSession AV7Session ;
   private IDataStoreProvider pr_default ;
   private String[] H005S2_A89Kard_Elem_Cons ;
   private String[] H005S2_A88Kard_Bod_Cod ;
   private String[] H005S2_A87Kard_Alm_Cod ;
   private String[] H005S2_A578Kard_Cent_Cod ;
   private long[] H005S2_A86Kard_Cent_Id ;
   private short[] H005S2_A577Kard_Regi_Cod ;
   private long[] H005S2_A85Kard_Regi_Id ;
   private int[] H005S2_A590Kard_Saldo_Cant ;
   private boolean[] H005S2_n590Kard_Saldo_Cant ;
   private java.math.BigDecimal[] H005S2_A589Kard_Saldo_Valor ;
   private boolean[] H005S2_n589Kard_Saldo_Valor ;
   private long[] H005S3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtGridState AV9GridState ;
   private com.orions2.SdtGridState_FilterValue AV10GridStateFilterValue ;
   private com.orions2.SdtTransactionContext AV12TrnContext ;
}

final  class wwalm_inv_kardex__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H005S2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV14Kard_Elem_Cons ,
                                          String A89Kard_Elem_Cons )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int1 ;
      GXv_int1 = new byte [4] ;
      Object[] GXv_Object2 ;
      GXv_Object2 = new Object [2] ;
      String sSelectString ;
      String sFromString ;
      String sOrderString ;
      sSelectString = " Kard_Elem_Cons, Kard_Bod_Cod, Kard_Alm_Cod, Kard_Cent_Cod, Kard_Cent_Id, Kard_Regi_Cod," ;
      sSelectString = sSelectString + " Kard_Regi_Id, Kard_Saldo_Cant, Kard_Saldo_Valor" ;
      sFromString = " FROM ALM_INV_KARDEX" ;
      sOrderString = "" ;
      if ( ! (GXutil.strcmp("", AV14Kard_Elem_Cons)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (Kard_Elem_Cons like ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (Kard_Elem_Cons like ?)" ;
         }
      }
      else
      {
         GXv_int1[0] = (byte)(1) ;
      }
      if ( GXutil.strcmp("", sWhereString) != 0 )
      {
         sWhereString = " WHERE" + sWhereString ;
      }
      sOrderString = sOrderString + " ORDER BY Kard_Elem_Cons" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT (CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H005S3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV14Kard_Elem_Cons ,
                                          String A89Kard_Elem_Cons )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [1] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM ALM_INV_KARDEX" ;
      if ( ! (GXutil.strcmp("", AV14Kard_Elem_Cons)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (Kard_Elem_Cons like ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (Kard_Elem_Cons like ?)" ;
         }
      }
      else
      {
         GXv_int3[0] = (byte)(1) ;
      }
      if ( GXutil.strcmp("", sWhereString) != 0 )
      {
         scmdbuf = scmdbuf + " WHERE" + sWhereString ;
      }
      scmdbuf = scmdbuf + "" ;
      GXv_Object4[0] = scmdbuf ;
      GXv_Object4[1] = GXv_int3 ;
      return GXv_Object4 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_H005S2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] );
            case 1 :
                  return conditional_H005S3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H005S2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H005S3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((long[]) buf[6])[0] = rslt.getLong(7) ;
               ((int[]) buf[7])[0] = rslt.getInt(8) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
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
      short sIdx ;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[4], 9);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[5]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[6]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[1], 9);
               }
               return;
      }
   }

}

