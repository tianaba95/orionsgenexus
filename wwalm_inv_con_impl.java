/*
               File: wwalm_inv_con_impl
        Description: Work With ALMACEN INVENTARIO CONSUMO
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:18:56.12
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

public final  class wwalm_inv_con_impl extends GXDataArea
{
   public wwalm_inv_con_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wwalm_inv_con_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwalm_inv_con_impl.class ));
   }

   public wwalm_inv_con_impl( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlma_Modulo = new HTMLChoice();
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
            nRC_GXsfl_25 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_25_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_25_idx = httpContext.GetNextPar( ) ;
            AV15Update = httpContext.GetNextPar( ) ;
            edtavUpdate_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_25_Refreshing);
            AV16Delete = httpContext.GetNextPar( ) ;
            edtavDelete_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "Tooltiptext", edtavDelete_Tooltiptext, !bGXsfl_25_Refreshing);
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
            AV14Elem_Descripcion = httpContext.GetNextPar( ) ;
            AV15Update = httpContext.GetNextPar( ) ;
            edtavUpdate_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_25_Refreshing);
            AV16Delete = httpContext.GetNextPar( ) ;
            edtavDelete_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "Tooltiptext", edtavDelete_Tooltiptext, !bGXsfl_25_Refreshing);
            AV20Pgmname = httpContext.GetNextPar( ) ;
            A91Regional = GXutil.lval( httpContext.GetNextPar( )) ;
            A92Centro_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            A27Alma_Modulo = httpContext.GetNextPar( ) ;
            A28Alma_Codigo = httpContext.GetNextPar( ) ;
            A31Bode_Codigo = httpContext.GetNextPar( ) ;
            A93Trans_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            A66Elem_Consecutivo = httpContext.GetNextPar( ) ;
            A94Num_Linea = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            A37Cata_Codigo = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid_refresh( subGrid_Rows, AV14Elem_Descripcion, AV15Update, AV16Delete, AV20Pgmname, A91Regional, A92Centro_Id, A27Alma_Modulo, A28Alma_Codigo, A31Bode_Codigo, A93Trans_Id, A66Elem_Consecutivo, A94Num_Linea, A37Cata_Codigo) ;
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
      pa252( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start252( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414185618");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("calendar-es.js", "?"+httpContext.getBuildNumber( 113785));
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.wwalm_inv_con") +"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vELEM_DESCRIPCION", AV14Elem_Descripcion);
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_25", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_25, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV20Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUPDATE_Tooltiptext", GXutil.rtrim( edtavUpdate_Tooltiptext));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vDELETE_Tooltiptext", GXutil.rtrim( edtavDelete_Tooltiptext));
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
         we252( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt252( ) ;
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
      return formatLink("com.orions2.wwalm_inv_con")  ;
   }

   public String getPgmname( )
   {
      return "WWALM_INV_CON" ;
   }

   public String getPgmdesc( )
   {
      return "Work With ALMACEN INVENTARIO CONSUMO" ;
   }

   public void wb250( )
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitletext_Internalname, "Work With ALMACEN INVENTARIO CONSUMOES", "", "", lblTitletext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WWALM_INV_CON.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-5 col-sm-3 col-sm-push-6 WWActionsCell", "Right", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 25, 2, 0)+","+"null"+");", "Agregar", bttBtninsert_Jsonclick, 5, "Agregar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WWALM_INV_CON.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-sm-pull-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavElem_descripcion_Internalname, "Elem_Descripcion", "col-sm-3 FilterSearchAttributeLabel", 0, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_25_idx + "',0)\"" ;
         ClassString = "FilterSearchAttribute" ;
         StyleString = "" ;
         ClassString = "FilterSearchAttribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavElem_descripcion_Internalname, AV14Elem_Descripcion, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,16);\"", (short)(0), 1, edtavElem_descripcion_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2000", -1, 0, "", "Descripción", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WWALM_INV_CON.htm");
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
            httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"25\">") ;
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
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Modulo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cod. Bodega") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Consecutivo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "por transaccion") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Diponible") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Transito") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Unitario") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Costos") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Total") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Atributos") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Código del Bien") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción del bien") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Código") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Regional") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "de Costo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "CC") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Ratificacion") ;
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
            GridContainer.AddObjectProperty("Class", "WorkWith");
            GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("CmpContext", "");
            GridContainer.AddObjectProperty("InMasterPage", "false");
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A27Alma_Modulo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A31Bode_Codigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A66Elem_Consecutivo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A94Num_Linea, (byte)(8), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A618Cantidad_Diponible, (byte)(8), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A619Cantidad_Transito, (byte)(8), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A620Valor_Unitario, (byte)(24), (byte)(2), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A621Otros_Costos, (byte)(24), (byte)(2), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A622Costo_Total, (byte)(24), (byte)(2), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A623Descrip_Atributos);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A557Elem_Descripcion);
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtElem_Descripcion_Link));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A37Cata_Codigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A298Cata_Descripcion);
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtCata_Descripcion_Link));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A28Alma_Codigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A91Regional, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A93Trans_Id, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A92Centro_Id, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A710Trans_ConsecutivoCC, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A709Trans_FechaRatificacion, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV15Update));
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtavUpdate_Link));
            GridColumn.AddObjectProperty("Tooltiptext", GXutil.rtrim( edtavUpdate_Tooltiptext));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV16Delete));
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
      if ( wbEnd == 25 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_25 = (short)(nGXsfl_25_idx-1) ;
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

   public void start252( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Work With ALMACEN INVENTARIO CONSUMO", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup250( ) ;
   }

   public void ws252( )
   {
      start252( ) ;
      evt252( ) ;
   }

   public void evt252( )
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
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e11252 ();
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
                           nGXsfl_25_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_25_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_25_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_252( ) ;
                           cmbAlma_Modulo.setName( cmbAlma_Modulo.getInternalname() );
                           cmbAlma_Modulo.setValue( httpContext.cgiGet( cmbAlma_Modulo.getInternalname()) );
                           A27Alma_Modulo = httpContext.cgiGet( cmbAlma_Modulo.getInternalname()) ;
                           A31Bode_Codigo = httpContext.cgiGet( edtBode_Codigo_Internalname) ;
                           A66Elem_Consecutivo = httpContext.cgiGet( edtElem_Consecutivo_Internalname) ;
                           A94Num_Linea = (int)(localUtil.ctol( httpContext.cgiGet( edtNum_Linea_Internalname), ",", ".")) ;
                           A618Cantidad_Diponible = (int)(localUtil.ctol( httpContext.cgiGet( edtCantidad_Diponible_Internalname), ",", ".")) ;
                           n618Cantidad_Diponible = false ;
                           A619Cantidad_Transito = (int)(localUtil.ctol( httpContext.cgiGet( edtCantidad_Transito_Internalname), ",", ".")) ;
                           n619Cantidad_Transito = false ;
                           A620Valor_Unitario = localUtil.ctond( httpContext.cgiGet( edtValor_Unitario_Internalname)) ;
                           A621Otros_Costos = localUtil.ctond( httpContext.cgiGet( edtOtros_Costos_Internalname)) ;
                           n621Otros_Costos = false ;
                           A622Costo_Total = localUtil.ctond( httpContext.cgiGet( edtCosto_Total_Internalname)) ;
                           A623Descrip_Atributos = httpContext.cgiGet( edtDescrip_Atributos_Internalname) ;
                           n623Descrip_Atributos = false ;
                           A557Elem_Descripcion = httpContext.cgiGet( edtElem_Descripcion_Internalname) ;
                           A37Cata_Codigo = httpContext.cgiGet( edtCata_Codigo_Internalname) ;
                           A298Cata_Descripcion = GXutil.upper( httpContext.cgiGet( edtCata_Descripcion_Internalname)) ;
                           A28Alma_Codigo = httpContext.cgiGet( edtAlma_Codigo_Internalname) ;
                           A91Regional = localUtil.ctol( httpContext.cgiGet( edtRegional_Internalname), ",", ".") ;
                           A93Trans_Id = localUtil.ctol( httpContext.cgiGet( edtTrans_Id_Internalname), ",", ".") ;
                           A92Centro_Id = localUtil.ctol( httpContext.cgiGet( edtCentro_Id_Internalname), ",", ".") ;
                           A710Trans_ConsecutivoCC = localUtil.ctol( httpContext.cgiGet( edtTrans_ConsecutivoCC_Internalname), ",", ".") ;
                           n710Trans_ConsecutivoCC = false ;
                           A709Trans_FechaRatificacion = localUtil.ctot( httpContext.cgiGet( edtTrans_FechaRatificacion_Internalname), 0) ;
                           n709Trans_FechaRatificacion = false ;
                           AV15Update = httpContext.cgiGet( edtavUpdate_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV15Update)==0) ? AV21Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV15Update))), !bGXsfl_25_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV15Update), true);
                           AV16Delete = httpContext.cgiGet( edtavDelete_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "Bitmap", ((GXutil.strcmp("", AV16Delete)==0) ? AV22Delete_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV16Delete))), !bGXsfl_25_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV16Delete), true);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e12252 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e13252 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e14252 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Elem_descripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vELEM_DESCRIPCION"), AV14Elem_Descripcion) != 0 )
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

   public void we252( )
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

   public void pa252( )
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
         GXCCtl = "ALMA_MODULO_" + sGXsfl_25_idx ;
         cmbAlma_Modulo.setName( GXCCtl );
         cmbAlma_Modulo.setWebtags( "" );
         cmbAlma_Modulo.addItem("ALMA", "ALMACEN", (short)(0));
         cmbAlma_Modulo.addItem("INVE", "INVENTARIO", (short)(0));
         cmbAlma_Modulo.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
         if ( cmbAlma_Modulo.getItemCount() > 0 )
         {
            A27Alma_Modulo = cmbAlma_Modulo.getValidValue(A27Alma_Modulo) ;
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
            GX_FocusControl = edtavElem_descripcion_Internalname ;
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
      subsflControlProps_252( ) ;
      while ( nGXsfl_25_idx <= nRC_GXsfl_25 )
      {
         sendrow_252( ) ;
         nGXsfl_25_idx = (short)(((subGrid_Islastpage==1)&&(nGXsfl_25_idx+1>subgrid_recordsperpage( )) ? 1 : nGXsfl_25_idx+1)) ;
         sGXsfl_25_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_25_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_252( ) ;
      }
      httpContext.GX_webresponse.addString(GridContainer.ToJavascriptSource());
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV14Elem_Descripcion ,
                                 String AV15Update ,
                                 String AV16Delete ,
                                 String AV20Pgmname ,
                                 long A91Regional ,
                                 long A92Centro_Id ,
                                 String A27Alma_Modulo ,
                                 String A28Alma_Codigo ,
                                 String A31Bode_Codigo ,
                                 long A93Trans_Id ,
                                 String A66Elem_Consecutivo ,
                                 int A94Num_Linea ,
                                 String A37Cata_Codigo )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid_Rows = subGrid_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID_nCurrentRecord = 0 ;
      rf252( ) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_MODULO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A27Alma_Modulo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_MODULO", A27Alma_Modulo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_BODE_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A31Bode_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BODE_CODIGO", A31Bode_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_CONSECUTIVO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_CONSECUTIVO", A66Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_NUM_LINEA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A94Num_Linea), "ZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NUM_LINEA", GXutil.ltrim( localUtil.ntoc( A94Num_Linea, (byte)(8), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CANTIDAD_DIPONIBLE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A618Cantidad_Diponible), "ZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CANTIDAD_DIPONIBLE", GXutil.ltrim( localUtil.ntoc( A618Cantidad_Diponible, (byte)(8), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CANTIDAD_TRANSITO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A619Cantidad_Transito), "ZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CANTIDAD_TRANSITO", GXutil.ltrim( localUtil.ntoc( A619Cantidad_Transito, (byte)(8), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_VALOR_UNITARIO", getSecureSignedToken( "", localUtil.format( A620Valor_Unitario, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "VALOR_UNITARIO", GXutil.ltrim( localUtil.ntoc( A620Valor_Unitario, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_OTROS_COSTOS", getSecureSignedToken( "", localUtil.format( A621Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "OTROS_COSTOS", GXutil.ltrim( localUtil.ntoc( A621Otros_Costos, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_COSTO_TOTAL", getSecureSignedToken( "", localUtil.format( A622Costo_Total, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "COSTO_TOTAL", GXutil.ltrim( localUtil.ntoc( A622Costo_Total, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_DESCRIP_ATRIBUTOS", getSecureSignedToken( "", A623Descrip_Atributos));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DESCRIP_ATRIBUTOS", A623Descrip_Atributos);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A28Alma_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_CODIGO", A28Alma_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_REGIONAL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A91Regional), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "REGIONAL", GXutil.ltrim( localUtil.ntoc( A91Regional, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRANS_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A93Trans_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRANS_ID", GXutil.ltrim( localUtil.ntoc( A93Trans_Id, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENTRO_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A92Centro_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENTRO_ID", GXutil.ltrim( localUtil.ntoc( A92Centro_Id, (byte)(11), (byte)(0), ".", "")));
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf252( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV20Pgmname = "WWALM_INV_CON" ;
      Gx_err = (short)(0) ;
   }

   public void rf252( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(25) ;
      /* Execute user event: Refresh */
      e13252 ();
      nGXsfl_25_idx = (short)(1) ;
      sGXsfl_25_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_25_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_252( ) ;
      bGXsfl_25_Refreshing = true ;
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
         subsflControlProps_252( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 0 : GRID_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((subGrid_Rows==0) ? 10000 : subgrid_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV14Elem_Descripcion ,
                                              A557Elem_Descripcion } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING
                                              }
         } ) ;
         lV14Elem_Descripcion = GXutil.concat( GXutil.rtrim( AV14Elem_Descripcion), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Elem_Descripcion", AV14Elem_Descripcion);
         /* Using cursor H00252 */
         pr_default.execute(0, new Object[] {lV14Elem_Descripcion, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_25_idx = (short)(1) ;
         sGXsfl_25_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_25_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_252( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_recordsperpage( ) ) ) ) )
         {
            A623Descrip_Atributos = H00252_A623Descrip_Atributos[0] ;
            n623Descrip_Atributos = H00252_n623Descrip_Atributos[0] ;
            A709Trans_FechaRatificacion = H00252_A709Trans_FechaRatificacion[0] ;
            n709Trans_FechaRatificacion = H00252_n709Trans_FechaRatificacion[0] ;
            A710Trans_ConsecutivoCC = H00252_A710Trans_ConsecutivoCC[0] ;
            n710Trans_ConsecutivoCC = H00252_n710Trans_ConsecutivoCC[0] ;
            A92Centro_Id = H00252_A92Centro_Id[0] ;
            A93Trans_Id = H00252_A93Trans_Id[0] ;
            A91Regional = H00252_A91Regional[0] ;
            A28Alma_Codigo = H00252_A28Alma_Codigo[0] ;
            A298Cata_Descripcion = H00252_A298Cata_Descripcion[0] ;
            A37Cata_Codigo = H00252_A37Cata_Codigo[0] ;
            A557Elem_Descripcion = H00252_A557Elem_Descripcion[0] ;
            A622Costo_Total = H00252_A622Costo_Total[0] ;
            A621Otros_Costos = H00252_A621Otros_Costos[0] ;
            n621Otros_Costos = H00252_n621Otros_Costos[0] ;
            A620Valor_Unitario = H00252_A620Valor_Unitario[0] ;
            A619Cantidad_Transito = H00252_A619Cantidad_Transito[0] ;
            n619Cantidad_Transito = H00252_n619Cantidad_Transito[0] ;
            A618Cantidad_Diponible = H00252_A618Cantidad_Diponible[0] ;
            n618Cantidad_Diponible = H00252_n618Cantidad_Diponible[0] ;
            A94Num_Linea = H00252_A94Num_Linea[0] ;
            A66Elem_Consecutivo = H00252_A66Elem_Consecutivo[0] ;
            A31Bode_Codigo = H00252_A31Bode_Codigo[0] ;
            A27Alma_Modulo = H00252_A27Alma_Modulo[0] ;
            A709Trans_FechaRatificacion = H00252_A709Trans_FechaRatificacion[0] ;
            n709Trans_FechaRatificacion = H00252_n709Trans_FechaRatificacion[0] ;
            A710Trans_ConsecutivoCC = H00252_A710Trans_ConsecutivoCC[0] ;
            n710Trans_ConsecutivoCC = H00252_n710Trans_ConsecutivoCC[0] ;
            A37Cata_Codigo = H00252_A37Cata_Codigo[0] ;
            A557Elem_Descripcion = H00252_A557Elem_Descripcion[0] ;
            A298Cata_Descripcion = H00252_A298Cata_Descripcion[0] ;
            e14252 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(25) ;
         wb250( ) ;
      }
      bGXsfl_25_Refreshing = true ;
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
                                           AV14Elem_Descripcion ,
                                           A557Elem_Descripcion } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      } ) ;
      lV14Elem_Descripcion = GXutil.concat( GXutil.rtrim( AV14Elem_Descripcion), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Elem_Descripcion", AV14Elem_Descripcion);
      /* Using cursor H00253 */
      pr_default.execute(1, new Object[] {lV14Elem_Descripcion});
      GRID_nRecordCount = H00253_AGRID_nRecordCount[0] ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14Elem_Descripcion, AV15Update, AV16Delete, AV20Pgmname, A91Regional, A92Centro_Id, A27Alma_Modulo, A28Alma_Codigo, A31Bode_Codigo, A93Trans_Id, A66Elem_Consecutivo, A94Num_Linea, A37Cata_Codigo) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14Elem_Descripcion, AV15Update, AV16Delete, AV20Pgmname, A91Regional, A92Centro_Id, A27Alma_Modulo, A28Alma_Codigo, A31Bode_Codigo, A93Trans_Id, A66Elem_Consecutivo, A94Num_Linea, A37Cata_Codigo) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14Elem_Descripcion, AV15Update, AV16Delete, AV20Pgmname, A91Regional, A92Centro_Id, A27Alma_Modulo, A28Alma_Codigo, A31Bode_Codigo, A93Trans_Id, A66Elem_Consecutivo, A94Num_Linea, A37Cata_Codigo) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14Elem_Descripcion, AV15Update, AV16Delete, AV20Pgmname, A91Regional, A92Centro_Id, A27Alma_Modulo, A28Alma_Codigo, A31Bode_Codigo, A93Trans_Id, A66Elem_Consecutivo, A94Num_Linea, A37Cata_Codigo) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14Elem_Descripcion, AV15Update, AV16Delete, AV20Pgmname, A91Regional, A92Centro_Id, A27Alma_Modulo, A28Alma_Codigo, A31Bode_Codigo, A93Trans_Id, A66Elem_Consecutivo, A94Num_Linea, A37Cata_Codigo) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup250( )
   {
      /* Before Start, stand alone formulas. */
      AV20Pgmname = "WWALM_INV_CON" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e12252 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV14Elem_Descripcion = httpContext.cgiGet( edtavElem_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Elem_Descripcion", AV14Elem_Descripcion);
         /* Read saved values. */
         nRC_GXsfl_25 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_25"), ",", ".")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), ",", ".") ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), ",", ".")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), ",", ".")) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vELEM_DESCRIPCION"), AV14Elem_Descripcion) != 0 )
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
      e12252 ();
      if (returnInSub) return;
   }

   public void e12252( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV20Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV20Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      subGrid_Rows = 10 ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV15Update = context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV15Update)==0) ? AV21Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV15Update))), !bGXsfl_25_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV15Update), true);
      AV21Update_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV15Update)==0) ? AV21Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV15Update))), !bGXsfl_25_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV15Update), true);
      edtavUpdate_Tooltiptext = "Modificar" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_25_Refreshing);
      AV16Delete = context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "Bitmap", ((GXutil.strcmp("", AV16Delete)==0) ? AV22Delete_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV16Delete))), !bGXsfl_25_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV16Delete), true);
      AV22Delete_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "Bitmap", ((GXutil.strcmp("", AV16Delete)==0) ? AV22Delete_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV16Delete))), !bGXsfl_25_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV16Delete), true);
      edtavDelete_Tooltiptext = "Eliminar" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "Tooltiptext", edtavDelete_Tooltiptext, !bGXsfl_25_Refreshing);
      Form.setCaption( "Work With ALMACEN INVENTARIO CONSUMOES" );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
   }

   public void e13252( )
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

   private void e14252( )
   {
      /* Grid_Load Routine */
      edtavUpdate_Link = formatLink("com.orions2.alm_inv_con") + "?" + GXutil.URLEncode(GXutil.rtrim("UPD")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A91Regional,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A92Centro_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(A27Alma_Modulo)) + "," + GXutil.URLEncode(GXutil.rtrim(A28Alma_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(A31Bode_Codigo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A93Trans_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(A66Elem_Consecutivo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A94Num_Linea,8,0))) ;
      edtavDelete_Link = formatLink("com.orions2.alm_inv_con") + "?" + GXutil.URLEncode(GXutil.rtrim("DLT")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A91Regional,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A92Centro_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(A27Alma_Modulo)) + "," + GXutil.URLEncode(GXutil.rtrim(A28Alma_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(A31Bode_Codigo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A93Trans_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(A66Elem_Consecutivo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A94Num_Linea,8,0))) ;
      edtElem_Descripcion_Link = formatLink("com.orions2.viewalm_inv_con") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A91Regional,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(A27Alma_Modulo)) + "," + GXutil.URLEncode(GXutil.rtrim(A28Alma_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(A31Bode_Codigo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A93Trans_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(A66Elem_Consecutivo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A94Num_Linea,8,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A92Centro_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      edtCata_Descripcion_Link = formatLink("com.orions2.viewalm_catalogo") + "?" + GXutil.URLEncode(GXutil.rtrim(A37Cata_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(25) ;
      }
      sendrow_252( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_25_Refreshing )
      {
         httpContext.doAjaxLoad(25, GridRow);
      }
   }

   public void e11252( )
   {
      /* 'DoInsert' Routine */
      callWebObject(formatLink("com.orions2.alm_inv_con") + "?" + GXutil.URLEncode(GXutil.rtrim("INS")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))));
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      if ( GXutil.strcmp(AV8HTTPRequest.getMethod(), "GET") == 0 )
      {
         AV9GridState.fromxml(AV7Session.getValue(AV20Pgmname+"GridState"), null, null);
         if ( AV9GridState.getgxTv_SdtGridState_Filtervalues().size() >= 1 )
         {
            AV14Elem_Descripcion = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+1)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Elem_Descripcion", AV14Elem_Descripcion);
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
      AV9GridState.fromxml(AV7Session.getValue(AV20Pgmname+"GridState"), null, null);
      AV9GridState.setgxTv_SdtGridState_Currentpage( (short)(subgrid_currentpage( )) );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().clear();
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV14Elem_Descripcion );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV7Session.setValue(AV20Pgmname+"GridState", AV9GridState.toxml(false, true, "GridState", "ACBSENA"));
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV12TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV12TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV20Pgmname );
      AV12TrnContext.setgxTv_SdtTransactionContext_Callerondelete( true );
      AV12TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV8HTTPRequest.getScriptName()+"?"+AV8HTTPRequest.getQuerystring() );
      AV12TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_INV_CON" );
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
      pa252( ) ;
      ws252( ) ;
      we252( ) ;
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
      httpContext.AddStyleSheetFile("calendar-system.css", "?14361167");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20186141418573");
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
         httpContext.AddJavascriptSource("wwalm_inv_con.js", "?20186141418574");
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_252( )
   {
      cmbAlma_Modulo.setInternalname( "ALMA_MODULO_"+sGXsfl_25_idx );
      edtBode_Codigo_Internalname = "BODE_CODIGO_"+sGXsfl_25_idx ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO_"+sGXsfl_25_idx ;
      edtNum_Linea_Internalname = "NUM_LINEA_"+sGXsfl_25_idx ;
      edtCantidad_Diponible_Internalname = "CANTIDAD_DIPONIBLE_"+sGXsfl_25_idx ;
      edtCantidad_Transito_Internalname = "CANTIDAD_TRANSITO_"+sGXsfl_25_idx ;
      edtValor_Unitario_Internalname = "VALOR_UNITARIO_"+sGXsfl_25_idx ;
      edtOtros_Costos_Internalname = "OTROS_COSTOS_"+sGXsfl_25_idx ;
      edtCosto_Total_Internalname = "COSTO_TOTAL_"+sGXsfl_25_idx ;
      edtDescrip_Atributos_Internalname = "DESCRIP_ATRIBUTOS_"+sGXsfl_25_idx ;
      edtElem_Descripcion_Internalname = "ELEM_DESCRIPCION_"+sGXsfl_25_idx ;
      edtCata_Codigo_Internalname = "CATA_CODIGO_"+sGXsfl_25_idx ;
      edtCata_Descripcion_Internalname = "CATA_DESCRIPCION_"+sGXsfl_25_idx ;
      edtAlma_Codigo_Internalname = "ALMA_CODIGO_"+sGXsfl_25_idx ;
      edtRegional_Internalname = "REGIONAL_"+sGXsfl_25_idx ;
      edtTrans_Id_Internalname = "TRANS_ID_"+sGXsfl_25_idx ;
      edtCentro_Id_Internalname = "CENTRO_ID_"+sGXsfl_25_idx ;
      edtTrans_ConsecutivoCC_Internalname = "TRANS_CONSECUTIVOCC_"+sGXsfl_25_idx ;
      edtTrans_FechaRatificacion_Internalname = "TRANS_FECHARATIFICACION_"+sGXsfl_25_idx ;
      edtavUpdate_Internalname = "vUPDATE_"+sGXsfl_25_idx ;
      edtavDelete_Internalname = "vDELETE_"+sGXsfl_25_idx ;
   }

   public void subsflControlProps_fel_252( )
   {
      cmbAlma_Modulo.setInternalname( "ALMA_MODULO_"+sGXsfl_25_fel_idx );
      edtBode_Codigo_Internalname = "BODE_CODIGO_"+sGXsfl_25_fel_idx ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO_"+sGXsfl_25_fel_idx ;
      edtNum_Linea_Internalname = "NUM_LINEA_"+sGXsfl_25_fel_idx ;
      edtCantidad_Diponible_Internalname = "CANTIDAD_DIPONIBLE_"+sGXsfl_25_fel_idx ;
      edtCantidad_Transito_Internalname = "CANTIDAD_TRANSITO_"+sGXsfl_25_fel_idx ;
      edtValor_Unitario_Internalname = "VALOR_UNITARIO_"+sGXsfl_25_fel_idx ;
      edtOtros_Costos_Internalname = "OTROS_COSTOS_"+sGXsfl_25_fel_idx ;
      edtCosto_Total_Internalname = "COSTO_TOTAL_"+sGXsfl_25_fel_idx ;
      edtDescrip_Atributos_Internalname = "DESCRIP_ATRIBUTOS_"+sGXsfl_25_fel_idx ;
      edtElem_Descripcion_Internalname = "ELEM_DESCRIPCION_"+sGXsfl_25_fel_idx ;
      edtCata_Codigo_Internalname = "CATA_CODIGO_"+sGXsfl_25_fel_idx ;
      edtCata_Descripcion_Internalname = "CATA_DESCRIPCION_"+sGXsfl_25_fel_idx ;
      edtAlma_Codigo_Internalname = "ALMA_CODIGO_"+sGXsfl_25_fel_idx ;
      edtRegional_Internalname = "REGIONAL_"+sGXsfl_25_fel_idx ;
      edtTrans_Id_Internalname = "TRANS_ID_"+sGXsfl_25_fel_idx ;
      edtCentro_Id_Internalname = "CENTRO_ID_"+sGXsfl_25_fel_idx ;
      edtTrans_ConsecutivoCC_Internalname = "TRANS_CONSECUTIVOCC_"+sGXsfl_25_fel_idx ;
      edtTrans_FechaRatificacion_Internalname = "TRANS_FECHARATIFICACION_"+sGXsfl_25_fel_idx ;
      edtavUpdate_Internalname = "vUPDATE_"+sGXsfl_25_fel_idx ;
      edtavDelete_Internalname = "vDELETE_"+sGXsfl_25_fel_idx ;
   }

   public void sendrow_252( )
   {
      subsflControlProps_252( ) ;
      wb250( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_25_idx <= subgrid_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_25_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_25_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_25_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALMA_MODULO_" + sGXsfl_25_idx ;
            cmbAlma_Modulo.setName( GXCCtl );
            cmbAlma_Modulo.setWebtags( "" );
            cmbAlma_Modulo.addItem("ALMA", "ALMACEN", (short)(0));
            cmbAlma_Modulo.addItem("INVE", "INVENTARIO", (short)(0));
            cmbAlma_Modulo.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
            if ( cmbAlma_Modulo.getItemCount() > 0 )
            {
               A27Alma_Modulo = cmbAlma_Modulo.getValidValue(A27Alma_Modulo) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlma_Modulo,cmbAlma_Modulo.getInternalname(),GXutil.rtrim( A27Alma_Modulo),new Integer(1),cmbAlma_Modulo.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbAlma_Modulo.setValue( GXutil.rtrim( A27Alma_Modulo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlma_Modulo.getInternalname(), "Values", cmbAlma_Modulo.ToJavascriptSource(), !bGXsfl_25_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBode_Codigo_Internalname,A31Bode_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBode_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtElem_Consecutivo_Internalname,A66Elem_Consecutivo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtElem_Consecutivo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNum_Linea_Internalname,GXutil.ltrim( localUtil.ntoc( A94Num_Linea, (byte)(8), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A94Num_Linea), "ZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNum_Linea_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCantidad_Diponible_Internalname,GXutil.ltrim( localUtil.ntoc( A618Cantidad_Diponible, (byte)(8), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A618Cantidad_Diponible), "ZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCantidad_Diponible_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCantidad_Transito_Internalname,GXutil.ltrim( localUtil.ntoc( A619Cantidad_Transito, (byte)(8), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A619Cantidad_Transito), "ZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCantidad_Transito_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtValor_Unitario_Internalname,GXutil.ltrim( localUtil.ntoc( A620Valor_Unitario, (byte)(24), (byte)(2), ",", "")),localUtil.format( A620Valor_Unitario, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtValor_Unitario_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Valor","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOtros_Costos_Internalname,GXutil.ltrim( localUtil.ntoc( A621Otros_Costos, (byte)(24), (byte)(2), ",", "")),localUtil.format( A621Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOtros_Costos_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Valor","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCosto_Total_Internalname,GXutil.ltrim( localUtil.ntoc( A622Costo_Total, (byte)(24), (byte)(2), ",", "")),localUtil.format( A622Costo_Total, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCosto_Total_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Valor","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDescrip_Atributos_Internalname,A623Descrip_Atributos,A623Descrip_Atributos,"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDescrip_Atributos_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2097152),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(0),new Integer(-1),new Boolean(true),"","left",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtElem_Descripcion_Internalname,A557Elem_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'",edtElem_Descripcion_Link,"","","",edtElem_Descripcion_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2000),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCata_Codigo_Internalname,A37Cata_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCata_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCata_Descripcion_Internalname,A298Cata_Descripcion,GXutil.rtrim( localUtil.format( A298Cata_Descripcion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'",edtCata_Descripcion_Link,"","","",edtCata_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlma_Codigo_Internalname,A28Alma_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlma_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegional_Internalname,GXutil.ltrim( localUtil.ntoc( A91Regional, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A91Regional), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRegional_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTrans_Id_Internalname,GXutil.ltrim( localUtil.ntoc( A93Trans_Id, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A93Trans_Id), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTrans_Id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCentro_Id_Internalname,GXutil.ltrim( localUtil.ntoc( A92Centro_Id, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A92Centro_Id), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCentro_Id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTrans_ConsecutivoCC_Internalname,GXutil.ltrim( localUtil.ntoc( A710Trans_ConsecutivoCC, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A710Trans_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTrans_ConsecutivoCC_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTrans_FechaRatificacion_Internalname,localUtil.ttoc( A709Trans_FechaRatificacion, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A709Trans_FechaRatificacion, "99/99/9999 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTrans_FechaRatificacion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(16),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         ClassString = "UpdateAttribute" ;
         StyleString = "" ;
         AV15Update_IsBlob = (boolean)(((GXutil.strcmp("", AV15Update)==0)&&(GXutil.strcmp("", AV21Update_GXI)==0))||!(GXutil.strcmp("", AV15Update)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV15Update)==0) ? AV21Update_GXI : httpContext.getResourceRelative(AV15Update)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavUpdate_Internalname,sImgUrl,edtavUpdate_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"",edtavUpdate_Tooltiptext,new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV15Update_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         ClassString = "DeleteAttribute" ;
         StyleString = "" ;
         AV16Delete_IsBlob = (boolean)(((GXutil.strcmp("", AV16Delete)==0)&&(GXutil.strcmp("", AV22Delete_GXI)==0))||!(GXutil.strcmp("", AV16Delete)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV16Delete)==0) ? AV22Delete_GXI : httpContext.getResourceRelative(AV16Delete)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavDelete_Internalname,sImgUrl,edtavDelete_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"",edtavDelete_Tooltiptext,new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV16Delete_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_MODULO"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, GXutil.rtrim( localUtil.format( A27Alma_Modulo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_BODE_CODIGO"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, GXutil.rtrim( localUtil.format( A31Bode_Codigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_CONSECUTIVO"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_NUM_LINEA"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(A94Num_Linea), "ZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CANTIDAD_DIPONIBLE"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(A618Cantidad_Diponible), "ZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CANTIDAD_TRANSITO"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(A619Cantidad_Transito), "ZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_VALOR_UNITARIO"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( A620Valor_Unitario, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_OTROS_COSTOS"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( A621Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_COSTO_TOTAL"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( A622Costo_Total, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_DESCRIP_ATRIBUTOS"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, A623Descrip_Atributos));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_CODIGO"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, GXutil.rtrim( localUtil.format( A28Alma_Codigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_REGIONAL"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(A91Regional), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRANS_ID"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(A93Trans_Id), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENTRO_ID"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(A92Centro_Id), "ZZZZZZZZZZ9")));
         GridContainer.AddRow(GridRow);
         nGXsfl_25_idx = (short)(((subGrid_Islastpage==1)&&(nGXsfl_25_idx+1>subgrid_recordsperpage( )) ? 1 : nGXsfl_25_idx+1)) ;
         sGXsfl_25_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_25_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_252( ) ;
      }
      /* End function sendrow_252 */
   }

   public void init_default_properties( )
   {
      lblTitletext_Internalname = "TITLETEXT" ;
      bttBtninsert_Internalname = "BTNINSERT" ;
      edtavElem_descripcion_Internalname = "vELEM_DESCRIPCION" ;
      divTabletop_Internalname = "TABLETOP" ;
      cmbAlma_Modulo.setInternalname( "ALMA_MODULO" );
      edtBode_Codigo_Internalname = "BODE_CODIGO" ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO" ;
      edtNum_Linea_Internalname = "NUM_LINEA" ;
      edtCantidad_Diponible_Internalname = "CANTIDAD_DIPONIBLE" ;
      edtCantidad_Transito_Internalname = "CANTIDAD_TRANSITO" ;
      edtValor_Unitario_Internalname = "VALOR_UNITARIO" ;
      edtOtros_Costos_Internalname = "OTROS_COSTOS" ;
      edtCosto_Total_Internalname = "COSTO_TOTAL" ;
      edtDescrip_Atributos_Internalname = "DESCRIP_ATRIBUTOS" ;
      edtElem_Descripcion_Internalname = "ELEM_DESCRIPCION" ;
      edtCata_Codigo_Internalname = "CATA_CODIGO" ;
      edtCata_Descripcion_Internalname = "CATA_DESCRIPCION" ;
      edtAlma_Codigo_Internalname = "ALMA_CODIGO" ;
      edtRegional_Internalname = "REGIONAL" ;
      edtTrans_Id_Internalname = "TRANS_ID" ;
      edtCentro_Id_Internalname = "CENTRO_ID" ;
      edtTrans_ConsecutivoCC_Internalname = "TRANS_CONSECUTIVOCC" ;
      edtTrans_FechaRatificacion_Internalname = "TRANS_FECHARATIFICACION" ;
      edtavUpdate_Internalname = "vUPDATE" ;
      edtavDelete_Internalname = "vDELETE" ;
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
      edtTrans_FechaRatificacion_Jsonclick = "" ;
      edtTrans_ConsecutivoCC_Jsonclick = "" ;
      edtCentro_Id_Jsonclick = "" ;
      edtTrans_Id_Jsonclick = "" ;
      edtRegional_Jsonclick = "" ;
      edtAlma_Codigo_Jsonclick = "" ;
      edtCata_Descripcion_Jsonclick = "" ;
      edtCata_Codigo_Jsonclick = "" ;
      edtElem_Descripcion_Jsonclick = "" ;
      edtDescrip_Atributos_Jsonclick = "" ;
      edtCosto_Total_Jsonclick = "" ;
      edtOtros_Costos_Jsonclick = "" ;
      edtValor_Unitario_Jsonclick = "" ;
      edtCantidad_Transito_Jsonclick = "" ;
      edtCantidad_Diponible_Jsonclick = "" ;
      edtNum_Linea_Jsonclick = "" ;
      edtElem_Consecutivo_Jsonclick = "" ;
      edtBode_Codigo_Jsonclick = "" ;
      cmbAlma_Modulo.setJsonclick( "" );
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      edtavDelete_Link = "" ;
      edtavUpdate_Link = "" ;
      edtCata_Descripcion_Link = "" ;
      edtElem_Descripcion_Link = "" ;
      subGrid_Class = "WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavElem_descripcion_Enabled = 1 ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Work With ALMACEN INVENTARIO CONSUMO" );
      subGrid_Rows = 0 ;
      edtavDelete_Tooltiptext = "Eliminar" ;
      edtavUpdate_Tooltiptext = "Modificar" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV15Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV16Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A91Regional',fld:'REGIONAL',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A92Centro_Id',fld:'CENTRO_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'cmbAlma_Modulo'},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',hsh:true,nv:''},{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',hsh:true,nv:''},{av:'A31Bode_Codigo',fld:'BODE_CODIGO',pic:'',hsh:true,nv:''},{av:'A93Trans_Id',fld:'TRANS_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',hsh:true,nv:''},{av:'A94Num_Linea',fld:'NUM_LINEA',pic:'ZZZZZZZ9',hsh:true,nv:0},{av:'A37Cata_Codigo',fld:'CATA_CODIGO',pic:'',nv:''},{av:'AV20Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Elem_Descripcion',fld:'vELEM_DESCRIPCION',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e14252',iparms:[{av:'A91Regional',fld:'REGIONAL',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A92Centro_Id',fld:'CENTRO_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'cmbAlma_Modulo'},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',hsh:true,nv:''},{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',hsh:true,nv:''},{av:'A31Bode_Codigo',fld:'BODE_CODIGO',pic:'',hsh:true,nv:''},{av:'A93Trans_Id',fld:'TRANS_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',hsh:true,nv:''},{av:'A94Num_Linea',fld:'NUM_LINEA',pic:'ZZZZZZZ9',hsh:true,nv:0},{av:'A37Cata_Codigo',fld:'CATA_CODIGO',pic:'',nv:''}],oparms:[{av:'edtavUpdate_Link',ctrl:'vUPDATE',prop:'Link'},{av:'edtavDelete_Link',ctrl:'vDELETE',prop:'Link'},{av:'edtElem_Descripcion_Link',ctrl:'ELEM_DESCRIPCION',prop:'Link'},{av:'edtCata_Descripcion_Link',ctrl:'CATA_DESCRIPCION',prop:'Link'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e11252',iparms:[{av:'A91Regional',fld:'REGIONAL',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A92Centro_Id',fld:'CENTRO_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'cmbAlma_Modulo'},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',hsh:true,nv:''},{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',hsh:true,nv:''},{av:'A31Bode_Codigo',fld:'BODE_CODIGO',pic:'',hsh:true,nv:''},{av:'A93Trans_Id',fld:'TRANS_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',hsh:true,nv:''},{av:'A94Num_Linea',fld:'NUM_LINEA',pic:'ZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV15Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV16Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A91Regional',fld:'REGIONAL',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A92Centro_Id',fld:'CENTRO_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'cmbAlma_Modulo'},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',hsh:true,nv:''},{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',hsh:true,nv:''},{av:'A31Bode_Codigo',fld:'BODE_CODIGO',pic:'',hsh:true,nv:''},{av:'A93Trans_Id',fld:'TRANS_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',hsh:true,nv:''},{av:'A94Num_Linea',fld:'NUM_LINEA',pic:'ZZZZZZZ9',hsh:true,nv:0},{av:'A37Cata_Codigo',fld:'CATA_CODIGO',pic:'',nv:''},{av:'AV20Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Elem_Descripcion',fld:'vELEM_DESCRIPCION',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV15Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV16Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A91Regional',fld:'REGIONAL',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A92Centro_Id',fld:'CENTRO_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'cmbAlma_Modulo'},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',hsh:true,nv:''},{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',hsh:true,nv:''},{av:'A31Bode_Codigo',fld:'BODE_CODIGO',pic:'',hsh:true,nv:''},{av:'A93Trans_Id',fld:'TRANS_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',hsh:true,nv:''},{av:'A94Num_Linea',fld:'NUM_LINEA',pic:'ZZZZZZZ9',hsh:true,nv:0},{av:'A37Cata_Codigo',fld:'CATA_CODIGO',pic:'',nv:''},{av:'AV20Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Elem_Descripcion',fld:'vELEM_DESCRIPCION',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV15Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV16Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A91Regional',fld:'REGIONAL',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A92Centro_Id',fld:'CENTRO_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'cmbAlma_Modulo'},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',hsh:true,nv:''},{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',hsh:true,nv:''},{av:'A31Bode_Codigo',fld:'BODE_CODIGO',pic:'',hsh:true,nv:''},{av:'A93Trans_Id',fld:'TRANS_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',hsh:true,nv:''},{av:'A94Num_Linea',fld:'NUM_LINEA',pic:'ZZZZZZZ9',hsh:true,nv:0},{av:'A37Cata_Codigo',fld:'CATA_CODIGO',pic:'',nv:''},{av:'AV20Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Elem_Descripcion',fld:'vELEM_DESCRIPCION',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV15Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV16Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A91Regional',fld:'REGIONAL',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A92Centro_Id',fld:'CENTRO_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'cmbAlma_Modulo'},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',hsh:true,nv:''},{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',hsh:true,nv:''},{av:'A31Bode_Codigo',fld:'BODE_CODIGO',pic:'',hsh:true,nv:''},{av:'A93Trans_Id',fld:'TRANS_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',hsh:true,nv:''},{av:'A94Num_Linea',fld:'NUM_LINEA',pic:'ZZZZZZZ9',hsh:true,nv:0},{av:'A37Cata_Codigo',fld:'CATA_CODIGO',pic:'',nv:''},{av:'AV20Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Elem_Descripcion',fld:'vELEM_DESCRIPCION',pic:'',nv:''}],oparms:[]}");
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
      AV15Update = "" ;
      AV16Delete = "" ;
      AV14Elem_Descripcion = "" ;
      AV20Pgmname = "" ;
      A27Alma_Modulo = "" ;
      A28Alma_Codigo = "" ;
      A31Bode_Codigo = "" ;
      A66Elem_Consecutivo = "" ;
      A37Cata_Codigo = "" ;
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
      bttBtninsert_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid_Linesclass = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      A620Valor_Unitario = DecimalUtil.ZERO ;
      A621Otros_Costos = DecimalUtil.ZERO ;
      A622Costo_Total = DecimalUtil.ZERO ;
      A623Descrip_Atributos = "" ;
      A557Elem_Descripcion = "" ;
      A298Cata_Descripcion = "" ;
      A709Trans_FechaRatificacion = GXutil.resetTime( GXutil.nullDate() );
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV21Update_GXI = "" ;
      AV22Delete_GXI = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV14Elem_Descripcion = "" ;
      H00252_A623Descrip_Atributos = new String[] {""} ;
      H00252_n623Descrip_Atributos = new boolean[] {false} ;
      H00252_A709Trans_FechaRatificacion = new java.util.Date[] {GXutil.nullDate()} ;
      H00252_n709Trans_FechaRatificacion = new boolean[] {false} ;
      H00252_A710Trans_ConsecutivoCC = new long[1] ;
      H00252_n710Trans_ConsecutivoCC = new boolean[] {false} ;
      H00252_A92Centro_Id = new long[1] ;
      H00252_A93Trans_Id = new long[1] ;
      H00252_A91Regional = new long[1] ;
      H00252_A28Alma_Codigo = new String[] {""} ;
      H00252_A298Cata_Descripcion = new String[] {""} ;
      H00252_A37Cata_Codigo = new String[] {""} ;
      H00252_A557Elem_Descripcion = new String[] {""} ;
      H00252_A622Costo_Total = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00252_A621Otros_Costos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00252_n621Otros_Costos = new boolean[] {false} ;
      H00252_A620Valor_Unitario = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00252_A619Cantidad_Transito = new int[1] ;
      H00252_n619Cantidad_Transito = new boolean[] {false} ;
      H00252_A618Cantidad_Diponible = new int[1] ;
      H00252_n618Cantidad_Diponible = new boolean[] {false} ;
      H00252_A94Num_Linea = new int[1] ;
      H00252_A66Elem_Consecutivo = new String[] {""} ;
      H00252_A31Bode_Codigo = new String[] {""} ;
      H00252_A27Alma_Modulo = new String[] {""} ;
      H00253_AGRID_nRecordCount = new long[1] ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wwalm_inv_con__default(),
         new Object[] {
             new Object[] {
            H00252_A623Descrip_Atributos, H00252_n623Descrip_Atributos, H00252_A709Trans_FechaRatificacion, H00252_n709Trans_FechaRatificacion, H00252_A710Trans_ConsecutivoCC, H00252_n710Trans_ConsecutivoCC, H00252_A92Centro_Id, H00252_A93Trans_Id, H00252_A91Regional, H00252_A28Alma_Codigo,
            H00252_A298Cata_Descripcion, H00252_A37Cata_Codigo, H00252_A557Elem_Descripcion, H00252_A622Costo_Total, H00252_A621Otros_Costos, H00252_n621Otros_Costos, H00252_A620Valor_Unitario, H00252_A619Cantidad_Transito, H00252_n619Cantidad_Transito, H00252_A618Cantidad_Diponible,
            H00252_n618Cantidad_Diponible, H00252_A94Num_Linea, H00252_A66Elem_Consecutivo, H00252_A31Bode_Codigo, H00252_A27Alma_Modulo
            }
            , new Object[] {
            H00253_AGRID_nRecordCount
            }
         }
      );
      AV20Pgmname = "WWALM_INV_CON" ;
      /* GeneXus formulas. */
      AV20Pgmname = "WWALM_INV_CON" ;
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
   private short nRC_GXsfl_25 ;
   private short nGXsfl_25_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int A94Num_Linea ;
   private int edtavElem_descripcion_Enabled ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Allbackcolor ;
   private int A618Cantidad_Diponible ;
   private int A619Cantidad_Transito ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV11GridPageCount ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private long A91Regional ;
   private long A92Centro_Id ;
   private long A93Trans_Id ;
   private long GRID_nFirstRecordOnPage ;
   private long A710Trans_ConsecutivoCC ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal A620Valor_Unitario ;
   private java.math.BigDecimal A621Otros_Costos ;
   private java.math.BigDecimal A622Costo_Total ;
   private String edtavUpdate_Tooltiptext ;
   private String edtavDelete_Tooltiptext ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_25_idx="0001" ;
   private String edtavUpdate_Internalname ;
   private String edtavDelete_Internalname ;
   private String AV20Pgmname ;
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
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtninsert_Internalname ;
   private String bttBtninsert_Jsonclick ;
   private String edtavElem_descripcion_Internalname ;
   private String divGridcell_Internalname ;
   private String divGridtable_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String edtElem_Descripcion_Link ;
   private String edtCata_Descripcion_Link ;
   private String edtavUpdate_Link ;
   private String edtavDelete_Link ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtBode_Codigo_Internalname ;
   private String edtElem_Consecutivo_Internalname ;
   private String edtNum_Linea_Internalname ;
   private String edtCantidad_Diponible_Internalname ;
   private String edtCantidad_Transito_Internalname ;
   private String edtValor_Unitario_Internalname ;
   private String edtOtros_Costos_Internalname ;
   private String edtCosto_Total_Internalname ;
   private String edtDescrip_Atributos_Internalname ;
   private String edtElem_Descripcion_Internalname ;
   private String edtCata_Codigo_Internalname ;
   private String edtCata_Descripcion_Internalname ;
   private String edtAlma_Codigo_Internalname ;
   private String edtRegional_Internalname ;
   private String edtTrans_Id_Internalname ;
   private String edtCentro_Id_Internalname ;
   private String edtTrans_ConsecutivoCC_Internalname ;
   private String edtTrans_FechaRatificacion_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String sGXsfl_25_fel_idx="0001" ;
   private String ROClassString ;
   private String edtBode_Codigo_Jsonclick ;
   private String edtElem_Consecutivo_Jsonclick ;
   private String edtNum_Linea_Jsonclick ;
   private String edtCantidad_Diponible_Jsonclick ;
   private String edtCantidad_Transito_Jsonclick ;
   private String edtValor_Unitario_Jsonclick ;
   private String edtOtros_Costos_Jsonclick ;
   private String edtCosto_Total_Jsonclick ;
   private String edtDescrip_Atributos_Jsonclick ;
   private String edtElem_Descripcion_Jsonclick ;
   private String edtCata_Codigo_Jsonclick ;
   private String edtCata_Descripcion_Jsonclick ;
   private String edtAlma_Codigo_Jsonclick ;
   private String edtRegional_Jsonclick ;
   private String edtTrans_Id_Jsonclick ;
   private String edtCentro_Id_Jsonclick ;
   private String edtTrans_ConsecutivoCC_Jsonclick ;
   private String edtTrans_FechaRatificacion_Jsonclick ;
   private String sImgUrl ;
   private java.util.Date A709Trans_FechaRatificacion ;
   private boolean entryPointCalled ;
   private boolean bGXsfl_25_Refreshing=false ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n618Cantidad_Diponible ;
   private boolean n619Cantidad_Transito ;
   private boolean n621Otros_Costos ;
   private boolean n623Descrip_Atributos ;
   private boolean n710Trans_ConsecutivoCC ;
   private boolean n709Trans_FechaRatificacion ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV15Update_IsBlob ;
   private boolean AV16Delete_IsBlob ;
   private String A623Descrip_Atributos ;
   private String AV14Elem_Descripcion ;
   private String A27Alma_Modulo ;
   private String A28Alma_Codigo ;
   private String A31Bode_Codigo ;
   private String A66Elem_Consecutivo ;
   private String A37Cata_Codigo ;
   private String A557Elem_Descripcion ;
   private String A298Cata_Descripcion ;
   private String AV21Update_GXI ;
   private String AV22Delete_GXI ;
   private String lV14Elem_Descripcion ;
   private String AV15Update ;
   private String AV16Delete ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV8HTTPRequest ;
   private com.genexus.webpanels.WebSession AV7Session ;
   private HTMLChoice cmbAlma_Modulo ;
   private IDataStoreProvider pr_default ;
   private String[] H00252_A623Descrip_Atributos ;
   private boolean[] H00252_n623Descrip_Atributos ;
   private java.util.Date[] H00252_A709Trans_FechaRatificacion ;
   private boolean[] H00252_n709Trans_FechaRatificacion ;
   private long[] H00252_A710Trans_ConsecutivoCC ;
   private boolean[] H00252_n710Trans_ConsecutivoCC ;
   private long[] H00252_A92Centro_Id ;
   private long[] H00252_A93Trans_Id ;
   private long[] H00252_A91Regional ;
   private String[] H00252_A28Alma_Codigo ;
   private String[] H00252_A298Cata_Descripcion ;
   private String[] H00252_A37Cata_Codigo ;
   private String[] H00252_A557Elem_Descripcion ;
   private java.math.BigDecimal[] H00252_A622Costo_Total ;
   private java.math.BigDecimal[] H00252_A621Otros_Costos ;
   private boolean[] H00252_n621Otros_Costos ;
   private java.math.BigDecimal[] H00252_A620Valor_Unitario ;
   private int[] H00252_A619Cantidad_Transito ;
   private boolean[] H00252_n619Cantidad_Transito ;
   private int[] H00252_A618Cantidad_Diponible ;
   private boolean[] H00252_n618Cantidad_Diponible ;
   private int[] H00252_A94Num_Linea ;
   private String[] H00252_A66Elem_Consecutivo ;
   private String[] H00252_A31Bode_Codigo ;
   private String[] H00252_A27Alma_Modulo ;
   private long[] H00253_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtGridState AV9GridState ;
   private com.orions2.SdtGridState_FilterValue AV10GridStateFilterValue ;
   private com.orions2.SdtTransactionContext AV12TrnContext ;
}

final  class wwalm_inv_con__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00252( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV14Elem_Descripcion ,
                                          String A557Elem_Descripcion )
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
      sSelectString = " T1.Descrip_Atributos, T2.Tran_FechaRatificacion AS Trans_FechaRatificacion, T2.Tran_ConsecutivoCC" ;
      sSelectString = sSelectString + " AS Trans_ConsecutivoCC, T1.Centro_Id, T1.Trans_Id AS Trans_Id, T1.Regional, T1.Alma_Codigo," ;
      sSelectString = sSelectString + " T4.Cata_Descripcion, T3.Cata_Codigo, T3.Elem_Descripcion, T1.Costo_Total, T1.Otros_Costos," ;
      sSelectString = sSelectString + " T1.Valor_Unitario, T1.Cantidad_Transito, T1.Cantidad_Diponible, T1.Num_Linea, T1.Elem_Consecutivo," ;
      sSelectString = sSelectString + " T1.Bode_Codigo, T1.Alma_Modulo" ;
      sFromString = " FROM (((ALM_INV_CON T1 INNER JOIN ALM_TRANSACCION T2 ON T2.Tran_Id = T1.Trans_Id)" ;
      sFromString = sFromString + " INNER JOIN ALM_ELEMENTO T3 ON T3.Elem_Consecutivo = T1.Elem_Consecutivo) INNER JOIN" ;
      sFromString = sFromString + " ALM_CATALOGO T4 ON T4.Cata_Codigo = T3.Cata_Codigo)" ;
      sOrderString = "" ;
      if ( ! (GXutil.strcmp("", AV14Elem_Descripcion)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (T3.Elem_Descripcion like ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (T3.Elem_Descripcion like ?)" ;
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
      sOrderString = sOrderString + " ORDER BY T3.Elem_Descripcion" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT (CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H00253( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV14Elem_Descripcion ,
                                          String A557Elem_Descripcion )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [1] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM (((ALM_INV_CON T1 INNER JOIN ALM_TRANSACCION T4 ON T4.Tran_Id" ;
      scmdbuf = scmdbuf + " = T1.Trans_Id) INNER JOIN ALM_ELEMENTO T2 ON T2.Elem_Consecutivo = T1.Elem_Consecutivo)" ;
      scmdbuf = scmdbuf + " INNER JOIN ALM_CATALOGO T3 ON T3.Cata_Codigo = T2.Cata_Codigo)" ;
      if ( ! (GXutil.strcmp("", AV14Elem_Descripcion)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (T2.Elem_Descripcion like ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (T2.Elem_Descripcion like ?)" ;
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
                  return conditional_H00252(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] );
            case 1 :
                  return conditional_H00253(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00252", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H00253", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(4) ;
               ((long[]) buf[7])[0] = rslt.getLong(5) ;
               ((long[]) buf[8])[0] = rslt.getLong(6) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(10) ;
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,2) ;
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,2) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(13,2) ;
               ((int[]) buf[17])[0] = rslt.getInt(14) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(15) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(16) ;
               ((String[]) buf[22])[0] = rslt.getVarchar(17) ;
               ((String[]) buf[23])[0] = rslt.getVarchar(18) ;
               ((String[]) buf[24])[0] = rslt.getVarchar(19) ;
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
                  stmt.setVarchar(sIdx, (String)parms[4], 2000);
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
                  stmt.setVarchar(sIdx, (String)parms[1], 2000);
               }
               return;
      }
   }

}

