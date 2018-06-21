/*
               File: wwalm_cat_fam_impl
        Description: Work With Familia del cat�logo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:19:57.50
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

public final  class wwalm_cat_fam_impl extends GXDataArea
{
   public wwalm_cat_fam_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wwalm_cat_fam_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwalm_cat_fam_impl.class ));
   }

   public wwalm_cat_fam_impl( int remoteHandle ,
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
            AV14FAM_Descripcion = httpContext.GetNextPar( ) ;
            AV15Update = httpContext.GetNextPar( ) ;
            edtavUpdate_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_25_Refreshing);
            AV16Delete = httpContext.GetNextPar( ) ;
            edtavDelete_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "Tooltiptext", edtavDelete_Tooltiptext, !bGXsfl_25_Refreshing);
            AV20Pgmname = httpContext.GetNextPar( ) ;
            A35FAM_Codigo = httpContext.GetNextPar( ) ;
            A75SEG_Codigo = httpContext.GetNextPar( ) ;
            A74TIP_Codigo = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid_refresh( subGrid_Rows, AV14FAM_Descripcion, AV15Update, AV16Delete, AV20Pgmname, A35FAM_Codigo, A75SEG_Codigo, A74TIP_Codigo) ;
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
      pa5H2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start5H2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414195757");
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.wwalm_cat_fam") +"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vFAM_DESCRIPCION", AV14FAM_Descripcion);
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
         we5H2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt5H2( ) ;
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
      return formatLink("com.orions2.wwalm_cat_fam")  ;
   }

   public String getPgmname( )
   {
      return "WWALM_CAT_FAM" ;
   }

   public String getPgmdesc( )
   {
      return "Work With Familia del cat�logo" ;
   }

   public void wb5H0( )
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitletext_Internalname, "Familia del cat�logo", "", "", lblTitletext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WWALM_CAT_FAM.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 25, 2, 0)+","+"null"+");", "Agregar", bttBtninsert_Jsonclick, 5, "Agregar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WWALM_CAT_FAM.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-sm-pull-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavFam_descripcion_Internalname, "FAM_Descripcion", "col-sm-3 FilterSearchAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_25_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavFam_descripcion_Internalname, AV14FAM_Descripcion, GXutil.rtrim( localUtil.format( AV14FAM_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "Descripcion", edtavFam_descripcion_Jsonclick, 0, "FilterSearchAttribute", "", "", "", 1, edtavFam_descripcion_Enabled, 0, "text", "", 70, "chr", 1, "row", 70, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_CAT_FAM.htm");
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
            httpContext.writeValue( "Codigo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripcion") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Segmento Codigo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Segmento Descripcion") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Usuario Creacion") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha Creacion") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Usuario Modifica") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha Moficia") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tipo Codigo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tipo Descripcion") ;
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
            GridColumn.AddObjectProperty("Value", A35FAM_Codigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A447FAM_Descripcion);
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtFAM_Descripcion_Link));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A75SEG_Codigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A442SEG_Descripcion);
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtSEG_Descripcion_Link));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A448FAM_UsuarioCreacion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A449FAM_FechaCreacion, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A450FAM_UsuarioModifica);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A451FAM_FechaModifica, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A74TIP_Codigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A435TIP_Descripcion);
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtTIP_Descripcion_Link));
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

   public void start5H2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Work With Familia del cat�logo", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup5H0( ) ;
   }

   public void ws5H2( )
   {
      start5H2( ) ;
      evt5H2( ) ;
   }

   public void evt5H2( )
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
                           e115H2 ();
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
                           A35FAM_Codigo = httpContext.cgiGet( edtFAM_Codigo_Internalname) ;
                           A447FAM_Descripcion = httpContext.cgiGet( edtFAM_Descripcion_Internalname) ;
                           A75SEG_Codigo = httpContext.cgiGet( edtSEG_Codigo_Internalname) ;
                           A442SEG_Descripcion = httpContext.cgiGet( edtSEG_Descripcion_Internalname) ;
                           A448FAM_UsuarioCreacion = GXutil.upper( httpContext.cgiGet( edtFAM_UsuarioCreacion_Internalname)) ;
                           A449FAM_FechaCreacion = localUtil.ctot( httpContext.cgiGet( edtFAM_FechaCreacion_Internalname), 0) ;
                           A450FAM_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtFAM_UsuarioModifica_Internalname)) ;
                           A451FAM_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtFAM_FechaModifica_Internalname), 0) ;
                           A74TIP_Codigo = httpContext.cgiGet( edtTIP_Codigo_Internalname) ;
                           A435TIP_Descripcion = httpContext.cgiGet( edtTIP_Descripcion_Internalname) ;
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
                                 e125H2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e135H2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e145H2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Fam_descripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFAM_DESCRIPCION"), AV14FAM_Descripcion) != 0 )
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

   public void we5H2( )
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

   public void pa5H2( )
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
            GX_FocusControl = edtavFam_descripcion_Internalname ;
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
                                 String AV14FAM_Descripcion ,
                                 String AV15Update ,
                                 String AV16Delete ,
                                 String AV20Pgmname ,
                                 String A35FAM_Codigo ,
                                 String A75SEG_Codigo ,
                                 String A74TIP_Codigo )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid_Rows = subGrid_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID_nCurrentRecord = 0 ;
      rf5H2( ) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_FAM_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A35FAM_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "FAM_CODIGO", A35FAM_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_SEG_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A75SEG_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "SEG_CODIGO", A75SEG_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_FAM_USUARIOCREACION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A448FAM_UsuarioCreacion, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "FAM_USUARIOCREACION", A448FAM_UsuarioCreacion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_FAM_FECHACREACION", getSecureSignedToken( "", localUtil.format( A449FAM_FechaCreacion, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "FAM_FECHACREACION", localUtil.ttoc( A449FAM_FechaCreacion, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_FAM_USUARIOMODIFICA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A450FAM_UsuarioModifica, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "FAM_USUARIOMODIFICA", A450FAM_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_FAM_FECHAMODIFICA", getSecureSignedToken( "", localUtil.format( A451FAM_FechaModifica, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "FAM_FECHAMODIFICA", localUtil.ttoc( A451FAM_FechaModifica, 10, 8, 0, 3, "/", ":", " "));
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf5H2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV20Pgmname = "WWALM_CAT_FAM" ;
      Gx_err = (short)(0) ;
   }

   public void rf5H2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(25) ;
      /* Execute user event: Refresh */
      e135H2 ();
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
                                              AV14FAM_Descripcion ,
                                              A447FAM_Descripcion } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING
                                              }
         } ) ;
         lV14FAM_Descripcion = GXutil.concat( GXutil.rtrim( AV14FAM_Descripcion), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14FAM_Descripcion", AV14FAM_Descripcion);
         /* Using cursor H005H2 */
         pr_default.execute(0, new Object[] {lV14FAM_Descripcion, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_25_idx = (short)(1) ;
         sGXsfl_25_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_25_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_252( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_recordsperpage( ) ) ) ) )
         {
            A435TIP_Descripcion = H005H2_A435TIP_Descripcion[0] ;
            A74TIP_Codigo = H005H2_A74TIP_Codigo[0] ;
            A451FAM_FechaModifica = H005H2_A451FAM_FechaModifica[0] ;
            A450FAM_UsuarioModifica = H005H2_A450FAM_UsuarioModifica[0] ;
            A449FAM_FechaCreacion = H005H2_A449FAM_FechaCreacion[0] ;
            A448FAM_UsuarioCreacion = H005H2_A448FAM_UsuarioCreacion[0] ;
            A442SEG_Descripcion = H005H2_A442SEG_Descripcion[0] ;
            A75SEG_Codigo = H005H2_A75SEG_Codigo[0] ;
            A447FAM_Descripcion = H005H2_A447FAM_Descripcion[0] ;
            A35FAM_Codigo = H005H2_A35FAM_Codigo[0] ;
            A74TIP_Codigo = H005H2_A74TIP_Codigo[0] ;
            A442SEG_Descripcion = H005H2_A442SEG_Descripcion[0] ;
            A435TIP_Descripcion = H005H2_A435TIP_Descripcion[0] ;
            e145H2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(25) ;
         wb5H0( ) ;
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
                                           AV14FAM_Descripcion ,
                                           A447FAM_Descripcion } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      } ) ;
      lV14FAM_Descripcion = GXutil.concat( GXutil.rtrim( AV14FAM_Descripcion), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14FAM_Descripcion", AV14FAM_Descripcion);
      /* Using cursor H005H3 */
      pr_default.execute(1, new Object[] {lV14FAM_Descripcion});
      GRID_nRecordCount = H005H3_AGRID_nRecordCount[0] ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14FAM_Descripcion, AV15Update, AV16Delete, AV20Pgmname, A35FAM_Codigo, A75SEG_Codigo, A74TIP_Codigo) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14FAM_Descripcion, AV15Update, AV16Delete, AV20Pgmname, A35FAM_Codigo, A75SEG_Codigo, A74TIP_Codigo) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14FAM_Descripcion, AV15Update, AV16Delete, AV20Pgmname, A35FAM_Codigo, A75SEG_Codigo, A74TIP_Codigo) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14FAM_Descripcion, AV15Update, AV16Delete, AV20Pgmname, A35FAM_Codigo, A75SEG_Codigo, A74TIP_Codigo) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14FAM_Descripcion, AV15Update, AV16Delete, AV20Pgmname, A35FAM_Codigo, A75SEG_Codigo, A74TIP_Codigo) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup5H0( )
   {
      /* Before Start, stand alone formulas. */
      AV20Pgmname = "WWALM_CAT_FAM" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e125H2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV14FAM_Descripcion = httpContext.cgiGet( edtavFam_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14FAM_Descripcion", AV14FAM_Descripcion);
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
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFAM_DESCRIPCION"), AV14FAM_Descripcion) != 0 )
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
      e125H2 ();
      if (returnInSub) return;
   }

   public void e125H2( )
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
      Form.setCaption( "Familia del cat�logo" );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
   }

   public void e135H2( )
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

   private void e145H2( )
   {
      /* Grid_Load Routine */
      edtavUpdate_Link = formatLink("com.orions2.alm_cat_fam") + "?" + GXutil.URLEncode(GXutil.rtrim("UPD")) + "," + GXutil.URLEncode(GXutil.rtrim(A35FAM_Codigo)) ;
      edtavDelete_Link = formatLink("com.orions2.alm_cat_fam") + "?" + GXutil.URLEncode(GXutil.rtrim("DLT")) + "," + GXutil.URLEncode(GXutil.rtrim(A35FAM_Codigo)) ;
      edtFAM_Descripcion_Link = formatLink("com.orions2.viewalm_cat_fam") + "?" + GXutil.URLEncode(GXutil.rtrim(A35FAM_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      edtSEG_Descripcion_Link = formatLink("com.orions2.viewalm_cat_seg") + "?" + GXutil.URLEncode(GXutil.rtrim(A75SEG_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      edtTIP_Descripcion_Link = formatLink("com.orions2.viewalm_cat_tip") + "?" + GXutil.URLEncode(GXutil.rtrim(A74TIP_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
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

   public void e115H2( )
   {
      /* 'DoInsert' Routine */
      callWebObject(formatLink("com.orions2.alm_cat_fam") + "?" + GXutil.URLEncode(GXutil.rtrim("INS")) + "," + GXutil.URLEncode(GXutil.rtrim("")));
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
            AV14FAM_Descripcion = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+1)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14FAM_Descripcion", AV14FAM_Descripcion);
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
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV14FAM_Descripcion );
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
      AV12TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_CAT_FAM" );
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
      pa5H2( ) ;
      ws5H2( ) ;
      we5H2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414195819");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
         httpContext.AddJavascriptSource("wwalm_cat_fam.js", "?201861414195819");
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_252( )
   {
      edtFAM_Codigo_Internalname = "FAM_CODIGO_"+sGXsfl_25_idx ;
      edtFAM_Descripcion_Internalname = "FAM_DESCRIPCION_"+sGXsfl_25_idx ;
      edtSEG_Codigo_Internalname = "SEG_CODIGO_"+sGXsfl_25_idx ;
      edtSEG_Descripcion_Internalname = "SEG_DESCRIPCION_"+sGXsfl_25_idx ;
      edtFAM_UsuarioCreacion_Internalname = "FAM_USUARIOCREACION_"+sGXsfl_25_idx ;
      edtFAM_FechaCreacion_Internalname = "FAM_FECHACREACION_"+sGXsfl_25_idx ;
      edtFAM_UsuarioModifica_Internalname = "FAM_USUARIOMODIFICA_"+sGXsfl_25_idx ;
      edtFAM_FechaModifica_Internalname = "FAM_FECHAMODIFICA_"+sGXsfl_25_idx ;
      edtTIP_Codigo_Internalname = "TIP_CODIGO_"+sGXsfl_25_idx ;
      edtTIP_Descripcion_Internalname = "TIP_DESCRIPCION_"+sGXsfl_25_idx ;
      edtavUpdate_Internalname = "vUPDATE_"+sGXsfl_25_idx ;
      edtavDelete_Internalname = "vDELETE_"+sGXsfl_25_idx ;
   }

   public void subsflControlProps_fel_252( )
   {
      edtFAM_Codigo_Internalname = "FAM_CODIGO_"+sGXsfl_25_fel_idx ;
      edtFAM_Descripcion_Internalname = "FAM_DESCRIPCION_"+sGXsfl_25_fel_idx ;
      edtSEG_Codigo_Internalname = "SEG_CODIGO_"+sGXsfl_25_fel_idx ;
      edtSEG_Descripcion_Internalname = "SEG_DESCRIPCION_"+sGXsfl_25_fel_idx ;
      edtFAM_UsuarioCreacion_Internalname = "FAM_USUARIOCREACION_"+sGXsfl_25_fel_idx ;
      edtFAM_FechaCreacion_Internalname = "FAM_FECHACREACION_"+sGXsfl_25_fel_idx ;
      edtFAM_UsuarioModifica_Internalname = "FAM_USUARIOMODIFICA_"+sGXsfl_25_fel_idx ;
      edtFAM_FechaModifica_Internalname = "FAM_FECHAMODIFICA_"+sGXsfl_25_fel_idx ;
      edtTIP_Codigo_Internalname = "TIP_CODIGO_"+sGXsfl_25_fel_idx ;
      edtTIP_Descripcion_Internalname = "TIP_DESCRIPCION_"+sGXsfl_25_fel_idx ;
      edtavUpdate_Internalname = "vUPDATE_"+sGXsfl_25_fel_idx ;
      edtavDelete_Internalname = "vDELETE_"+sGXsfl_25_fel_idx ;
   }

   public void sendrow_252( )
   {
      subsflControlProps_252( ) ;
      wb5H0( ) ;
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
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFAM_Codigo_Internalname,A35FAM_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFAM_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(5),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFAM_Descripcion_Internalname,A447FAM_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'",edtFAM_Descripcion_Link,"","","",edtFAM_Descripcion_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(70),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSEG_Codigo_Internalname,A75SEG_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSEG_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSEG_Descripcion_Internalname,A442SEG_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'",edtSEG_Descripcion_Link,"","","",edtSEG_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFAM_UsuarioCreacion_Internalname,A448FAM_UsuarioCreacion,GXutil.rtrim( localUtil.format( A448FAM_UsuarioCreacion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFAM_UsuarioCreacion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFAM_FechaCreacion_Internalname,localUtil.ttoc( A449FAM_FechaCreacion, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A449FAM_FechaCreacion, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFAM_FechaCreacion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFAM_UsuarioModifica_Internalname,A450FAM_UsuarioModifica,GXutil.rtrim( localUtil.format( A450FAM_UsuarioModifica, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFAM_UsuarioModifica_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFAM_FechaModifica_Internalname,localUtil.ttoc( A451FAM_FechaModifica, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A451FAM_FechaModifica, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFAM_FechaModifica_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTIP_Codigo_Internalname,A74TIP_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTIP_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTIP_Descripcion_Internalname,A435TIP_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'",edtTIP_Descripcion_Link,"","","",edtTIP_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
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
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_FAM_CODIGO"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, GXutil.rtrim( localUtil.format( A35FAM_Codigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_SEG_CODIGO"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, GXutil.rtrim( localUtil.format( A75SEG_Codigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_FAM_USUARIOCREACION"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, GXutil.rtrim( localUtil.format( A448FAM_UsuarioCreacion, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_FAM_FECHACREACION"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( A449FAM_FechaCreacion, "99/99/99 99:99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_FAM_USUARIOMODIFICA"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, GXutil.rtrim( localUtil.format( A450FAM_UsuarioModifica, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_FAM_FECHAMODIFICA"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( A451FAM_FechaModifica, "99/99/99 99:99")));
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
      edtavFam_descripcion_Internalname = "vFAM_DESCRIPCION" ;
      divTabletop_Internalname = "TABLETOP" ;
      edtFAM_Codigo_Internalname = "FAM_CODIGO" ;
      edtFAM_Descripcion_Internalname = "FAM_DESCRIPCION" ;
      edtSEG_Codigo_Internalname = "SEG_CODIGO" ;
      edtSEG_Descripcion_Internalname = "SEG_DESCRIPCION" ;
      edtFAM_UsuarioCreacion_Internalname = "FAM_USUARIOCREACION" ;
      edtFAM_FechaCreacion_Internalname = "FAM_FECHACREACION" ;
      edtFAM_UsuarioModifica_Internalname = "FAM_USUARIOMODIFICA" ;
      edtFAM_FechaModifica_Internalname = "FAM_FECHAMODIFICA" ;
      edtTIP_Codigo_Internalname = "TIP_CODIGO" ;
      edtTIP_Descripcion_Internalname = "TIP_DESCRIPCION" ;
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
      edtTIP_Descripcion_Jsonclick = "" ;
      edtTIP_Codigo_Jsonclick = "" ;
      edtFAM_FechaModifica_Jsonclick = "" ;
      edtFAM_UsuarioModifica_Jsonclick = "" ;
      edtFAM_FechaCreacion_Jsonclick = "" ;
      edtFAM_UsuarioCreacion_Jsonclick = "" ;
      edtSEG_Descripcion_Jsonclick = "" ;
      edtSEG_Codigo_Jsonclick = "" ;
      edtFAM_Descripcion_Jsonclick = "" ;
      edtFAM_Codigo_Jsonclick = "" ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      edtavDelete_Link = "" ;
      edtavUpdate_Link = "" ;
      edtTIP_Descripcion_Link = "" ;
      edtSEG_Descripcion_Link = "" ;
      edtFAM_Descripcion_Link = "" ;
      subGrid_Class = "WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFam_descripcion_Jsonclick = "" ;
      edtavFam_descripcion_Enabled = 1 ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Work With Familia del cat�logo" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV15Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV16Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A35FAM_Codigo',fld:'FAM_CODIGO',pic:'',hsh:true,nv:''},{av:'A75SEG_Codigo',fld:'SEG_CODIGO',pic:'',hsh:true,nv:''},{av:'A74TIP_Codigo',fld:'TIP_CODIGO',pic:'',nv:''},{av:'AV20Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14FAM_Descripcion',fld:'vFAM_DESCRIPCION',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e145H2',iparms:[{av:'A35FAM_Codigo',fld:'FAM_CODIGO',pic:'',hsh:true,nv:''},{av:'A75SEG_Codigo',fld:'SEG_CODIGO',pic:'',hsh:true,nv:''},{av:'A74TIP_Codigo',fld:'TIP_CODIGO',pic:'',nv:''}],oparms:[{av:'edtavUpdate_Link',ctrl:'vUPDATE',prop:'Link'},{av:'edtavDelete_Link',ctrl:'vDELETE',prop:'Link'},{av:'edtFAM_Descripcion_Link',ctrl:'FAM_DESCRIPCION',prop:'Link'},{av:'edtSEG_Descripcion_Link',ctrl:'SEG_DESCRIPCION',prop:'Link'},{av:'edtTIP_Descripcion_Link',ctrl:'TIP_DESCRIPCION',prop:'Link'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e115H2',iparms:[{av:'A35FAM_Codigo',fld:'FAM_CODIGO',pic:'',hsh:true,nv:''}],oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV15Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV16Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A35FAM_Codigo',fld:'FAM_CODIGO',pic:'',hsh:true,nv:''},{av:'A75SEG_Codigo',fld:'SEG_CODIGO',pic:'',hsh:true,nv:''},{av:'A74TIP_Codigo',fld:'TIP_CODIGO',pic:'',nv:''},{av:'AV20Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14FAM_Descripcion',fld:'vFAM_DESCRIPCION',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV15Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV16Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A35FAM_Codigo',fld:'FAM_CODIGO',pic:'',hsh:true,nv:''},{av:'A75SEG_Codigo',fld:'SEG_CODIGO',pic:'',hsh:true,nv:''},{av:'A74TIP_Codigo',fld:'TIP_CODIGO',pic:'',nv:''},{av:'AV20Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14FAM_Descripcion',fld:'vFAM_DESCRIPCION',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV15Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV16Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A35FAM_Codigo',fld:'FAM_CODIGO',pic:'',hsh:true,nv:''},{av:'A75SEG_Codigo',fld:'SEG_CODIGO',pic:'',hsh:true,nv:''},{av:'A74TIP_Codigo',fld:'TIP_CODIGO',pic:'',nv:''},{av:'AV20Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14FAM_Descripcion',fld:'vFAM_DESCRIPCION',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV15Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV16Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A35FAM_Codigo',fld:'FAM_CODIGO',pic:'',hsh:true,nv:''},{av:'A75SEG_Codigo',fld:'SEG_CODIGO',pic:'',hsh:true,nv:''},{av:'A74TIP_Codigo',fld:'TIP_CODIGO',pic:'',nv:''},{av:'AV20Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14FAM_Descripcion',fld:'vFAM_DESCRIPCION',pic:'',nv:''}],oparms:[]}");
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
      AV14FAM_Descripcion = "" ;
      AV20Pgmname = "" ;
      A35FAM_Codigo = "" ;
      A75SEG_Codigo = "" ;
      A74TIP_Codigo = "" ;
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
      A447FAM_Descripcion = "" ;
      A442SEG_Descripcion = "" ;
      A448FAM_UsuarioCreacion = "" ;
      A449FAM_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      A450FAM_UsuarioModifica = "" ;
      A451FAM_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      A435TIP_Descripcion = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV21Update_GXI = "" ;
      AV22Delete_GXI = "" ;
      scmdbuf = "" ;
      lV14FAM_Descripcion = "" ;
      H005H2_A435TIP_Descripcion = new String[] {""} ;
      H005H2_A74TIP_Codigo = new String[] {""} ;
      H005H2_A451FAM_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H005H2_A450FAM_UsuarioModifica = new String[] {""} ;
      H005H2_A449FAM_FechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      H005H2_A448FAM_UsuarioCreacion = new String[] {""} ;
      H005H2_A442SEG_Descripcion = new String[] {""} ;
      H005H2_A75SEG_Codigo = new String[] {""} ;
      H005H2_A447FAM_Descripcion = new String[] {""} ;
      H005H2_A35FAM_Codigo = new String[] {""} ;
      H005H3_AGRID_nRecordCount = new long[1] ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wwalm_cat_fam__default(),
         new Object[] {
             new Object[] {
            H005H2_A435TIP_Descripcion, H005H2_A74TIP_Codigo, H005H2_A451FAM_FechaModifica, H005H2_A450FAM_UsuarioModifica, H005H2_A449FAM_FechaCreacion, H005H2_A448FAM_UsuarioCreacion, H005H2_A442SEG_Descripcion, H005H2_A75SEG_Codigo, H005H2_A447FAM_Descripcion, H005H2_A35FAM_Codigo
            }
            , new Object[] {
            H005H3_AGRID_nRecordCount
            }
         }
      );
      AV20Pgmname = "WWALM_CAT_FAM" ;
      /* GeneXus formulas. */
      AV20Pgmname = "WWALM_CAT_FAM" ;
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
   private int edtavFam_descripcion_Enabled ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV11GridPageCount ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
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
   private String edtavFam_descripcion_Internalname ;
   private String edtavFam_descripcion_Jsonclick ;
   private String divGridcell_Internalname ;
   private String divGridtable_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String edtFAM_Descripcion_Link ;
   private String edtSEG_Descripcion_Link ;
   private String edtTIP_Descripcion_Link ;
   private String edtavUpdate_Link ;
   private String edtavDelete_Link ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtFAM_Codigo_Internalname ;
   private String edtFAM_Descripcion_Internalname ;
   private String edtSEG_Codigo_Internalname ;
   private String edtSEG_Descripcion_Internalname ;
   private String edtFAM_UsuarioCreacion_Internalname ;
   private String edtFAM_FechaCreacion_Internalname ;
   private String edtFAM_UsuarioModifica_Internalname ;
   private String edtFAM_FechaModifica_Internalname ;
   private String edtTIP_Codigo_Internalname ;
   private String edtTIP_Descripcion_Internalname ;
   private String scmdbuf ;
   private String sGXsfl_25_fel_idx="0001" ;
   private String ROClassString ;
   private String edtFAM_Codigo_Jsonclick ;
   private String edtFAM_Descripcion_Jsonclick ;
   private String edtSEG_Codigo_Jsonclick ;
   private String edtSEG_Descripcion_Jsonclick ;
   private String edtFAM_UsuarioCreacion_Jsonclick ;
   private String edtFAM_FechaCreacion_Jsonclick ;
   private String edtFAM_UsuarioModifica_Jsonclick ;
   private String edtFAM_FechaModifica_Jsonclick ;
   private String edtTIP_Codigo_Jsonclick ;
   private String edtTIP_Descripcion_Jsonclick ;
   private String sImgUrl ;
   private java.util.Date A449FAM_FechaCreacion ;
   private java.util.Date A451FAM_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean bGXsfl_25_Refreshing=false ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV15Update_IsBlob ;
   private boolean AV16Delete_IsBlob ;
   private String AV14FAM_Descripcion ;
   private String A35FAM_Codigo ;
   private String A75SEG_Codigo ;
   private String A74TIP_Codigo ;
   private String A447FAM_Descripcion ;
   private String A442SEG_Descripcion ;
   private String A448FAM_UsuarioCreacion ;
   private String A450FAM_UsuarioModifica ;
   private String A435TIP_Descripcion ;
   private String AV21Update_GXI ;
   private String AV22Delete_GXI ;
   private String lV14FAM_Descripcion ;
   private String AV15Update ;
   private String AV16Delete ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV8HTTPRequest ;
   private com.genexus.webpanels.WebSession AV7Session ;
   private IDataStoreProvider pr_default ;
   private String[] H005H2_A435TIP_Descripcion ;
   private String[] H005H2_A74TIP_Codigo ;
   private java.util.Date[] H005H2_A451FAM_FechaModifica ;
   private String[] H005H2_A450FAM_UsuarioModifica ;
   private java.util.Date[] H005H2_A449FAM_FechaCreacion ;
   private String[] H005H2_A448FAM_UsuarioCreacion ;
   private String[] H005H2_A442SEG_Descripcion ;
   private String[] H005H2_A75SEG_Codigo ;
   private String[] H005H2_A447FAM_Descripcion ;
   private String[] H005H2_A35FAM_Codigo ;
   private long[] H005H3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtGridState AV9GridState ;
   private com.orions2.SdtGridState_FilterValue AV10GridStateFilterValue ;
   private com.orions2.SdtTransactionContext AV12TrnContext ;
}

final  class wwalm_cat_fam__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H005H2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV14FAM_Descripcion ,
                                          String A447FAM_Descripcion )
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
      sSelectString = " T3.TIP_Descripcion, T2.TIP_Codigo, T1.FAM_FechaModifica, T1.FAM_UsuarioModifica," ;
      sSelectString = sSelectString + " T1.FAM_FechaCreacion, T1.FAM_UsuarioCreacion, T2.SEG_Descripcion, T1.SEG_Codigo," ;
      sSelectString = sSelectString + " T1.FAM_Descripcion, T1.FAM_Codigo" ;
      sFromString = " FROM ((ALM_CAT_FAM T1 INNER JOIN ALM_CAT_SEG T2 ON T2.SEG_Codigo = T1.SEG_Codigo)" ;
      sFromString = sFromString + " INNER JOIN ALM_CAT_TIP T3 ON T3.TIP_Codigo = T2.TIP_Codigo)" ;
      sOrderString = "" ;
      if ( ! (GXutil.strcmp("", AV14FAM_Descripcion)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (T1.FAM_Descripcion like ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (T1.FAM_Descripcion like ?)" ;
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
      sOrderString = sOrderString + " ORDER BY T1.FAM_Descripcion" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT (CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H005H3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV14FAM_Descripcion ,
                                          String A447FAM_Descripcion )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [1] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM ((ALM_CAT_FAM T1 INNER JOIN ALM_CAT_SEG T2 ON T2.SEG_Codigo" ;
      scmdbuf = scmdbuf + " = T1.SEG_Codigo) INNER JOIN ALM_CAT_TIP T3 ON T3.TIP_Codigo = T2.TIP_Codigo)" ;
      if ( ! (GXutil.strcmp("", AV14FAM_Descripcion)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (T1.FAM_Descripcion like ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (T1.FAM_Descripcion like ?)" ;
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
                  return conditional_H005H2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] );
            case 1 :
                  return conditional_H005H3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H005H2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H005H3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
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
                  stmt.setVarchar(sIdx, (String)parms[4], 70);
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
                  stmt.setVarchar(sIdx, (String)parms[1], 70);
               }
               return;
      }
   }

}

