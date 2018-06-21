/*
               File: wpatributosdev_impl
        Description: Atributos
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:20:44.99
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

public final  class wpatributosdev_impl extends GXDataArea
{
   public wpatributosdev_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wpatributosdev_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wpatributosdev_impl.class ));
   }

   public wpatributosdev_impl( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavCtltdet_listtipo = new HTMLChoice();
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            nRC_GXsfl_17 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_17_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_17_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid1") == 0 )
         {
            subGrid1_Rows = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows) ;
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
         if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            AV12Tran_Id = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12Tran_Id", GXutil.ltrim( GXutil.str( AV12Tran_Id, 11, 0)));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV11TDet_Consecutivo = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11TDet_Consecutivo", GXutil.ltrim( GXutil.str( AV11TDet_Consecutivo, 18, 0)));
               AV15Elem_Consecutivo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15Elem_Consecutivo", AV15Elem_Consecutivo);
               Gx_mode = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            }
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
      pa6E2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start6E2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20186141420452");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.AddJavascriptSource("Shared/jquery/jquery-1.9.0.js", "");
      httpContext.AddJavascriptSource("Alertify/js/alertify.min.js", "");
      httpContext.AddJavascriptSource("Alertify/GlobalAlerts.js", "");
      httpContext.AddJavascriptSource("Alertify/AlertifyRender.js", "");
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.wpatributosdev") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV12Tran_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV11TDet_Consecutivo,18,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV15Elem_Consecutivo)) + "," + GXutil.URLEncode(GXutil.rtrim(Gx_mode))+"\">") ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" style=\"display:none\">") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Sdtdetalletrnatr", AV9SDTDetalleTrnAtr);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Sdtdetalletrnatr", AV9SDTDetalleTrnAtr);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_17", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_17, (byte)(4), (byte)(0), ",", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTDETALLETRNATR", AV9SDTDetalleTrnAtr);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTDETALLETRNATR", AV9SDTDetalleTrnAtr);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_ID", GXutil.ltrim( localUtil.ntoc( AV12Tran_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTDET_CONSECUTIVO", GXutil.ltrim( localUtil.ntoc( AV11TDet_Consecutivo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vELEM_CONSECUTIVO", AV15Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Type", GXutil.rtrim( Alertify1_Type));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textmessage", GXutil.rtrim( Alertify1_Textmessage));
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
      httpContext.writeTextNL( "</form>") ;
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
         we6E2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt6E2( ) ;
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
      return formatLink("com.orions2.wpatributosdev") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV12Tran_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV11TDet_Consecutivo,18,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV15Elem_Consecutivo)) + "," + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) ;
   }

   public String getPgmname( )
   {
      return "WPAtributosDev" ;
   }

   public String getPgmdesc( )
   {
      return "Atributos" ;
   }

   public void wb6E0( )
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
         com.orions2.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", "", "false");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable1_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitleatributos_Internalname, "Atributos Adicionales", "", "", lblTitleatributos_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WPAtributosDev.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         httpContext.writeText( "<div class=\"gx_usercontrol\" id=\""+"ALERTIFY1Container"+"\"></div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"17\">") ;
            sStyleString = "" ;
            com.orions2.GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "PromptGrid", 0, "", "", 1, 2, sStyleString, "", 0);
            /* Subfile titles */
            httpContext.writeText( "<tr") ;
            httpContext.writeTextNL( ">") ;
            if ( subGrid1_Backcolorstyle == 0 )
            {
               subGrid1_Titlebackstyle = (byte)(0) ;
               if ( GXutil.len( subGrid1_Class) > 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Title" ;
               }
            }
            else
            {
               subGrid1_Titlebackstyle = (byte)(1) ;
               if ( subGrid1_Backcolorstyle == 1 )
               {
                  subGrid1_Titlebackcolor = subGrid1_Allbackcolor ;
                  if ( GXutil.len( subGrid1_Class) > 0 )
                  {
                     subGrid1_Linesclass = subGrid1_Class+"UniformTitle" ;
                  }
               }
               else
               {
                  if ( GXutil.len( subGrid1_Class) > 0 )
                  {
                     subGrid1_Linesclass = subGrid1_Class+"Title" ;
                  }
               }
            }
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Identificador Atributo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Atributo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( " Tipo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Valor") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Atributo Obligatorio") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeTextNL( "</tr>") ;
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
            Grid1Container.AddObjectProperty("GridName", "Grid1");
            Grid1Container.AddObjectProperty("Class", "PromptGrid");
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("CmpContext", "");
            Grid1Container.AddObjectProperty("InMasterPage", "false");
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltdet_listid_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltdet_listdescripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbavCtltdet_listtipo.getEnabled(), (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlclas_atributoobligatorio_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 17 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_17 = (short)(nGXsfl_17_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Grid1Container.AddObjectProperty("GRID1_nEOF", GRID1_nEOF);
            Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
            AV23GXV1 = nGXsfl_17_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               com.orions2.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               com.orions2.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
            }
         }
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "Right", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnAdd" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttConfirma_Internalname, "gx.evt.setGridEvt("+GXutil.str( 17, 2, 0)+","+"null"+");", "Confirmar", bttConfirma_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'CONFIRMA\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WPAtributosDev.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttCancelar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 17, 2, 0)+","+"null"+");", "Cancelar", bttCancelar_Jsonclick, 5, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'CANCELAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WPAtributosDev.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start6E2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Atributos", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup6E0( ) ;
   }

   public void ws6E2( )
   {
      start6E2( ) ;
      evt6E2( ) ;
   }

   public void evt6E2( )
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
                        else if ( GXutil.strcmp(sEvt, "'CONFIRMA'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'CONFIRMA' */
                           e116E2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'CANCELAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Cancelar' */
                           e126E2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRID1PAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRID1PAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid1_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid1_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid1_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid1_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_17_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_17_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_17_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_172( ) ;
                           AV23GXV1 = (short)(nGXsfl_17_idx+GRID1_nFirstRecordOnPage) ;
                           if ( ( AV9SDTDetalleTrnAtr.size() >= AV23GXV1 ) && ( AV23GXV1 > 0 ) )
                           {
                              AV9SDTDetalleTrnAtr.currentItem( ((com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem)AV9SDTDetalleTrnAtr.elementAt(-1+AV23GXV1)) );
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e136E2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e146E2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    if ( ! Rfr0gs )
                                    {
                                    }
                                    dynload_actions( ) ;
                                 }
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
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

   public void we6E2( )
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

   public void pa6E2( )
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
         GXCCtl = "CTLTDET_LISTTIPO_" + sGXsfl_17_idx ;
         cmbavCtltdet_listtipo.setName( GXCCtl );
         cmbavCtltdet_listtipo.setWebtags( "" );
         cmbavCtltdet_listtipo.addItem("O", "Otro", (short)(0));
         cmbavCtltdet_listtipo.addItem("F", "Fecha", (short)(0));
         if ( cmbavCtltdet_listtipo.getItemCount() > 0 )
         {
            if ( ( AV23GXV1 > 0 ) && ( AV9SDTDetalleTrnAtr.size() >= AV23GXV1 ) && (GXutil.strcmp("", ((com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem)AV9SDTDetalleTrnAtr.elementAt(-1+AV23GXV1)).getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listtipo())==0) )
            {
               ((com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem)AV9SDTDetalleTrnAtr.elementAt(-1+AV23GXV1)).setgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listtipo( cmbavCtltdet_listtipo.getValidValue(((com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem)AV9SDTDetalleTrnAtr.elementAt(-1+AV23GXV1)).getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listtipo()) );
            }
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
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( )
   {
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_172( ) ;
      while ( nGXsfl_17_idx <= nRC_GXsfl_17 )
      {
         sendrow_172( ) ;
         nGXsfl_17_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_17_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_17_idx+1)) ;
         sGXsfl_17_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_17_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_172( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID1_nCurrentRecord = 0 ;
      rf6E2( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf6E2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavCtltdet_listid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltdet_listid_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltdet_listid_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavCtltdet_listdescripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltdet_listdescripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltdet_listdescripcion_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      cmbavCtltdet_listtipo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavCtltdet_listtipo.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbavCtltdet_listtipo.getEnabled(), 5, 0)), !bGXsfl_17_Refreshing);
      edtavCtlclas_atributoobligatorio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlclas_atributoobligatorio_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlclas_atributoobligatorio_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
   }

   public void rf6E2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(17) ;
      nGXsfl_17_idx = (short)(1) ;
      sGXsfl_17_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_17_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_172( ) ;
      bGXsfl_17_Refreshing = true ;
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "PromptGrid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_172( ) ;
         e146E2 ();
         if ( ( GRID1_nCurrentRecord > 0 ) && ( GRID1_nGridOutOfScope == 0 ) && ( nGXsfl_17_idx == 1 ) )
         {
            GRID1_nCurrentRecord = 0 ;
            GRID1_nGridOutOfScope = 1 ;
            subgrid1_firstpage( ) ;
            e146E2 ();
         }
         wbEnd = (short)(17) ;
         wb6E0( ) ;
      }
      bGXsfl_17_Refreshing = true ;
   }

   public int subgrid1_pagecount( )
   {
      GRID1_nRecordCount = subgrid1_recordcount( ) ;
      if ( ((int)((GRID1_nRecordCount) % (subgrid1_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRID1_nRecordCount/ (double) (subgrid1_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID1_nRecordCount/ (double) (subgrid1_recordsperpage( )))+1) ;
   }

   public int subgrid1_recordcount( )
   {
      return AV9SDTDetalleTrnAtr.size() ;
   }

   public int subgrid1_recordsperpage( )
   {
      return 10*1 ;
   }

   public int subgrid1_currentpage( )
   {
      return (int)(GXutil.Int( GRID1_nFirstRecordOnPage/ (double) (subgrid1_recordsperpage( )))+1) ;
   }

   public short subgrid1_firstpage( )
   {
      GRID1_nFirstRecordOnPage = 0 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid1_nextpage( )
   {
      GRID1_nRecordCount = subgrid1_recordcount( ) ;
      if ( ( GRID1_nRecordCount >= subgrid1_recordsperpage( ) ) && ( GRID1_nEOF == 0 ) )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage+subgrid1_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
      return (short)(((GRID1_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid1_previouspage( )
   {
      if ( GRID1_nFirstRecordOnPage >= subgrid1_recordsperpage( ) )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage-subgrid1_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid1_lastpage( )
   {
      GRID1_nRecordCount = subgrid1_recordcount( ) ;
      if ( GRID1_nRecordCount > subgrid1_recordsperpage( ) )
      {
         if ( ((int)((GRID1_nRecordCount) % (subgrid1_recordsperpage( )))) == 0 )
         {
            GRID1_nFirstRecordOnPage = (long)(GRID1_nRecordCount-subgrid1_recordsperpage( )) ;
         }
         else
         {
            GRID1_nFirstRecordOnPage = (long)(GRID1_nRecordCount-((int)((GRID1_nRecordCount) % (subgrid1_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public int subgrid1_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(subgrid1_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup6E0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      edtavCtltdet_listid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltdet_listid_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltdet_listid_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavCtltdet_listdescripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltdet_listdescripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltdet_listdescripcion_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      cmbavCtltdet_listtipo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavCtltdet_listtipo.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbavCtltdet_listtipo.getEnabled(), 5, 0)), !bGXsfl_17_Refreshing);
      edtavCtlclas_atributoobligatorio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlclas_atributoobligatorio_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlclas_atributoobligatorio_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e136E2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Sdtdetalletrnatr"), AV9SDTDetalleTrnAtr);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vSDTDETALLETRNATR"), AV9SDTDetalleTrnAtr);
         /* Read variables values. */
         /* Read saved values. */
         nRC_GXsfl_17 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_17"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         Alertify1_Type = httpContext.cgiGet( "ALERTIFY1_Type") ;
         Alertify1_Textmessage = httpContext.cgiGet( "ALERTIFY1_Textmessage") ;
         nRC_GXsfl_17 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_17"), ",", ".")) ;
         nGXsfl_17_fel_idx = (short)(0) ;
         while ( nGXsfl_17_fel_idx < nRC_GXsfl_17 )
         {
            nGXsfl_17_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_17_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_17_fel_idx+1)) ;
            sGXsfl_17_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_17_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_172( ) ;
            AV23GXV1 = (short)(nGXsfl_17_fel_idx+GRID1_nFirstRecordOnPage) ;
            if ( ( AV9SDTDetalleTrnAtr.size() >= AV23GXV1 ) && ( AV23GXV1 > 0 ) )
            {
               AV9SDTDetalleTrnAtr.currentItem( ((com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem)AV9SDTDetalleTrnAtr.elementAt(-1+AV23GXV1)) );
            }
         }
         if ( nGXsfl_17_fel_idx == 0 )
         {
            nGXsfl_17_idx = (short)(1) ;
            sGXsfl_17_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_17_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_172( ) ;
         }
         nGXsfl_17_fel_idx = (short)(1) ;
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
      e136E2 ();
      if (returnInSub) return;
   }

   public void e136E2( )
   {
      /* Start Routine */
      /* Execute user subroutine: 'BUSCARCATALOGO' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'SDT' */
      S122 ();
      if (returnInSub) return;
   }

   public void S112( )
   {
      /* 'BUSCARCATALOGO' Routine */
      /* Using cursor H006E2 */
      pr_default.execute(0, new Object[] {AV15Elem_Consecutivo});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A37Cata_Codigo = H006E2_A37Cata_Codigo[0] ;
         A66Elem_Consecutivo = H006E2_A66Elem_Consecutivo[0] ;
         A74TIP_Codigo = H006E2_A74TIP_Codigo[0] ;
         A75SEG_Codigo = H006E2_A75SEG_Codigo[0] ;
         A35FAM_Codigo = H006E2_A35FAM_Codigo[0] ;
         A34Clas_Codigo = H006E2_A34Clas_Codigo[0] ;
         A34Clas_Codigo = H006E2_A34Clas_Codigo[0] ;
         A35FAM_Codigo = H006E2_A35FAM_Codigo[0] ;
         A75SEG_Codigo = H006E2_A75SEG_Codigo[0] ;
         A74TIP_Codigo = H006E2_A74TIP_Codigo[0] ;
         AV5TIP_Codigo = A74TIP_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5TIP_Codigo", AV5TIP_Codigo);
         AV6SEG_Codigo = A75SEG_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6SEG_Codigo", AV6SEG_Codigo);
         AV7FAM_Codigo = A35FAM_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7FAM_Codigo", AV7FAM_Codigo);
         AV8Clas_Codigo = A34Clas_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Clas_Codigo", AV8Clas_Codigo);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
   }

   public void S122( )
   {
      /* 'SDT' Routine */
      AV30GXLvl18 = (byte)(0) ;
      /* Using cursor H006E3 */
      pr_default.execute(1, new Object[] {AV8Clas_Codigo, AV5TIP_Codigo, AV6SEG_Codigo, AV7FAM_Codigo});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A495Clas_EstadoAtributo = H006E3_A495Clas_EstadoAtributo[0] ;
         A34Clas_Codigo = H006E3_A34Clas_Codigo[0] ;
         A35FAM_Codigo = H006E3_A35FAM_Codigo[0] ;
         A75SEG_Codigo = H006E3_A75SEG_Codigo[0] ;
         A74TIP_Codigo = H006E3_A74TIP_Codigo[0] ;
         A36List_Id = H006E3_A36List_Id[0] ;
         A393List_Descripcion = H006E3_A393List_Descripcion[0] ;
         A423List_Tipo = H006E3_A423List_Tipo[0] ;
         A555Clas_AtributoObligatorio = H006E3_A555Clas_AtributoObligatorio[0] ;
         A35FAM_Codigo = H006E3_A35FAM_Codigo[0] ;
         A75SEG_Codigo = H006E3_A75SEG_Codigo[0] ;
         A74TIP_Codigo = H006E3_A74TIP_Codigo[0] ;
         A393List_Descripcion = H006E3_A393List_Descripcion[0] ;
         A423List_Tipo = H006E3_A423List_Tipo[0] ;
         AV30GXLvl18 = (byte)(1) ;
         AV17List_Id = A36List_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17List_Id", GXutil.ltrim( GXutil.str( AV17List_Id, 11, 0)));
         AV10SDTDetalleTrnAtrItem.setgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listid( AV17List_Id );
         AV10SDTDetalleTrnAtrItem.setgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listdescripcion( A393List_Descripcion );
         AV10SDTDetalleTrnAtrItem.setgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listtipo( A423List_Tipo );
         AV10SDTDetalleTrnAtrItem.setgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Clas_atributoobligatorio( A555Clas_AtributoObligatorio );
         if ( GXutil.strcmp(Gx_mode, "UDP") == 0 )
         {
            /* Execute user subroutine: 'BUSCARDATOS' */
            S134 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               returnInSub = true;
               if (true) return;
            }
         }
         AV10SDTDetalleTrnAtrItem.setgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_valoratributo( AV16TDet_ValorAtributo );
         AV9SDTDetalleTrnAtr.add(AV10SDTDetalleTrnAtrItem, 0);
         gx_BV17 = true ;
         AV10SDTDetalleTrnAtrItem = (com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem)new com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem(remoteHandle, context);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( AV30GXLvl18 == 0 )
      {
         httpContext.setWebReturnParms(new Object[] {new Long(AV12Tran_Id)});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
   }

   public void S134( )
   {
      /* 'BUSCARDATOS' Routine */
      AV31GXLvl41 = (byte)(0) ;
      /* Using cursor H006E4 */
      pr_default.execute(2, new Object[] {new Long(AV12Tran_Id), new Long(AV11TDet_Consecutivo), new Long(AV17List_Id)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A70TDet_ListId = H006E4_A70TDet_ListId[0] ;
         A69TDet_Consecutivo = H006E4_A69TDet_Consecutivo[0] ;
         A46Tran_Id = H006E4_A46Tran_Id[0] ;
         A494TDet_ValorAtributo = H006E4_A494TDet_ValorAtributo[0] ;
         AV31GXLvl41 = (byte)(1) ;
         AV16TDet_ValorAtributo = A494TDet_ValorAtributo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16TDet_ValorAtributo", AV16TDet_ValorAtributo);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( AV31GXLvl41 == 0 )
      {
         AV16TDet_ValorAtributo = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16TDet_ValorAtributo", AV16TDet_ValorAtributo);
      }
   }

   public void e116E2( )
   {
      AV23GXV1 = (short)(nGXsfl_17_idx+GRID1_nFirstRecordOnPage) ;
      if ( AV9SDTDetalleTrnAtr.size() >= AV23GXV1 )
      {
         AV9SDTDetalleTrnAtr.currentItem( ((com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem)AV9SDTDetalleTrnAtr.elementAt(-1+AV23GXV1)) );
      }
      /* 'CONFIRMA' Routine */
      AV13Pattern = "\\b(\\d{1,2})/(\\d{1,2})/(\\d{2,4})\\b" ;
      AV19Swerror = (byte)(0) ;
      AV32GXV2 = 1 ;
      while ( AV32GXV2 <= AV9SDTDetalleTrnAtr.size() )
      {
         AV10SDTDetalleTrnAtrItem = (com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem)((com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem)AV9SDTDetalleTrnAtr.elementAt(-1+AV32GXV2));
         if ( GXutil.strcmp(AV10SDTDetalleTrnAtrItem.getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listtipo(), "F") == 0 )
         {
            if ( GxRegex.IsMatch(AV10SDTDetalleTrnAtrItem.getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_valoratributo(),AV13Pattern) )
            {
            }
            else
            {
               Alertify1_Type = "error" ;
               httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
               Alertify1_Textmessage = "ERROR..El valor del atributo "+AV10SDTDetalleTrnAtrItem.getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listdescripcion()+" de tipo Fecha debe ser (dd/mm/aaaa)" ;
               httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
               this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
               AV19Swerror = (byte)(1) ;
            }
         }
         AV18DescripcionCampo = AV10SDTDetalleTrnAtrItem.getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listdescripcion() ;
         if ( ( GXutil.strcmp(AV10SDTDetalleTrnAtrItem.getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Clas_atributoobligatorio(), "SI") == 0 ) && (GXutil.strcmp("", AV10SDTDetalleTrnAtrItem.getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_valoratributo())==0) )
         {
            Alertify1_Type = "error" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
            Alertify1_Textmessage = "ERROR..El atributo "+AV18DescripcionCampo+" es obligatorio" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
            this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
            AV19Swerror = (byte)(1) ;
            AV18DescripcionCampo = "" ;
            if (true) break;
         }
         AV32GXV2 = (int)(AV32GXV2+1) ;
      }
      if ( AV19Swerror == 0 )
      {
         GXv_int1[0] = AV12Tran_Id ;
         GXv_int2[0] = AV11TDet_Consecutivo ;
         GXv_objcol_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem3[0] = AV9SDTDetalleTrnAtr ;
         GXv_char4[0] = Gx_mode ;
         GXv_char5[0] = AV15Elem_Consecutivo ;
         new com.orions2.pentraconsudet(remoteHandle, context).execute( GXv_int1, GXv_int2, GXv_objcol_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem3, GXv_char4, GXv_char5) ;
         wpatributosdev_impl.this.AV12Tran_Id = GXv_int1[0] ;
         wpatributosdev_impl.this.AV11TDet_Consecutivo = GXv_int2[0] ;
         AV9SDTDetalleTrnAtr = GXv_objcol_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem3[0] ;
         wpatributosdev_impl.this.Gx_mode = GXv_char4[0] ;
         wpatributosdev_impl.this.AV15Elem_Consecutivo = GXv_char5[0] ;
         gx_BV17 = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Tran_Id", GXutil.ltrim( GXutil.str( AV12Tran_Id, 11, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "AV11TDet_Consecutivo", GXutil.ltrim( GXutil.str( AV11TDet_Consecutivo, 18, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "AV15Elem_Consecutivo", AV15Elem_Consecutivo);
         httpContext.setWebReturnParms(new Object[] {new Long(AV12Tran_Id)});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10SDTDetalleTrnAtrItem", AV10SDTDetalleTrnAtrItem);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9SDTDetalleTrnAtr", AV9SDTDetalleTrnAtr);
      nGXsfl_17_bak_idx = nGXsfl_17_idx ;
      gxgrgrid1_refresh( subGrid1_Rows) ;
      nGXsfl_17_idx = nGXsfl_17_bak_idx ;
      sGXsfl_17_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_17_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_172( ) ;
   }

   public void e126E2( )
   {
      /* 'Cancelar' Routine */
      httpContext.setWebReturnParms(new Object[] {new Long(AV12Tran_Id)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   private void e146E2( )
   {
      /* Grid1_Load Routine */
      AV23GXV1 = (short)(1) ;
      while ( AV23GXV1 <= AV9SDTDetalleTrnAtr.size() )
      {
         AV9SDTDetalleTrnAtr.currentItem( ((com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem)AV9SDTDetalleTrnAtr.elementAt(-1+AV23GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(17) ;
         }
         if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
         {
            sendrow_172( ) ;
            GRID1_nEOF = (byte)(0) ;
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID1_nCurrentRecord + 1 >= subgrid1_recordcount( ) )
            {
               GRID1_nEOF = (byte)(1) ;
               com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_17_Refreshing )
         {
            httpContext.doAjaxLoad(17, Grid1Row);
         }
         AV23GXV1 = (short)(AV23GXV1+1) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV12Tran_Id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Tran_Id", GXutil.ltrim( GXutil.str( AV12Tran_Id, 11, 0)));
      AV11TDet_Consecutivo = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11TDet_Consecutivo", GXutil.ltrim( GXutil.str( AV11TDet_Consecutivo, 18, 0)));
      AV15Elem_Consecutivo = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Elem_Consecutivo", AV15Elem_Consecutivo);
      Gx_mode = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
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
      pa6E2( ) ;
      ws6E2( ) ;
      we6E2( ) ;
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
      httpContext.AddStyleSheetFile("Alertify/css/alertify.core.css", "?1126220");
      httpContext.AddStyleSheetFile("Alertify/css/alertify.default.css", "?11295124");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414204566");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("wpatributosdev.js", "?201861414204566");
      httpContext.AddJavascriptSource("Shared/jquery/jquery-1.9.0.js", "");
      httpContext.AddJavascriptSource("Alertify/js/alertify.min.js", "");
      httpContext.AddJavascriptSource("Alertify/GlobalAlerts.js", "");
      httpContext.AddJavascriptSource("Alertify/AlertifyRender.js", "");
      /* End function include_jscripts */
   }

   public void subsflControlProps_172( )
   {
      edtavCtltdet_listid_Internalname = "CTLTDET_LISTID_"+sGXsfl_17_idx ;
      edtavCtltdet_listdescripcion_Internalname = "CTLTDET_LISTDESCRIPCION_"+sGXsfl_17_idx ;
      cmbavCtltdet_listtipo.setInternalname( "CTLTDET_LISTTIPO_"+sGXsfl_17_idx );
      edtavCtltdet_valoratributo_Internalname = "CTLTDET_VALORATRIBUTO_"+sGXsfl_17_idx ;
      edtavCtlclas_atributoobligatorio_Internalname = "CTLCLAS_ATRIBUTOOBLIGATORIO_"+sGXsfl_17_idx ;
   }

   public void subsflControlProps_fel_172( )
   {
      edtavCtltdet_listid_Internalname = "CTLTDET_LISTID_"+sGXsfl_17_fel_idx ;
      edtavCtltdet_listdescripcion_Internalname = "CTLTDET_LISTDESCRIPCION_"+sGXsfl_17_fel_idx ;
      cmbavCtltdet_listtipo.setInternalname( "CTLTDET_LISTTIPO_"+sGXsfl_17_fel_idx );
      edtavCtltdet_valoratributo_Internalname = "CTLTDET_VALORATRIBUTO_"+sGXsfl_17_fel_idx ;
      edtavCtlclas_atributoobligatorio_Internalname = "CTLCLAS_ATRIBUTOOBLIGATORIO_"+sGXsfl_17_fel_idx ;
   }

   public void sendrow_172( )
   {
      subsflControlProps_172( ) ;
      wb6E0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_17_idx <= subgrid1_recordsperpage( ) * 1 ) )
      {
         Grid1Row = GXWebRow.GetNew(context,Grid1Container) ;
         if ( subGrid1_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid1_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
         }
         else if ( subGrid1_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid1_Backstyle = (byte)(0) ;
            subGrid1_Backcolor = subGrid1_Allbackcolor ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Uniform" ;
            }
         }
         else if ( subGrid1_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid1_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
            subGrid1_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid1_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid1_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_17_idx) % (2))) == 0 )
            {
               subGrid1_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Even" ;
               }
            }
            else
            {
               subGrid1_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Odd" ;
               }
            }
         }
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"PromptGrid"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_17_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtltdet_listid_Internalname,GXutil.ltrim( localUtil.ntoc( ((com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem)AV9SDTDetalleTrnAtr.elementAt(-1+AV23GXV1)).getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listid(), (byte)(11), (byte)(0), ",", "")),((edtavCtltdet_listid_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem)AV9SDTDetalleTrnAtr.elementAt(-1+AV23GXV1)).getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listid()), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem)AV9SDTDetalleTrnAtr.elementAt(-1+AV23GXV1)).getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listid()), "ZZZZZZZZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtltdet_listid_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(edtavCtltdet_listid_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(17),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtltdet_listdescripcion_Internalname,((com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem)AV9SDTDetalleTrnAtr.elementAt(-1+AV23GXV1)).getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listdescripcion(),GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem)AV9SDTDetalleTrnAtr.elementAt(-1+AV23GXV1)).getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listdescripcion(), "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtltdet_listdescripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavCtltdet_listdescripcion_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(17),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( nGXsfl_17_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "CTLTDET_LISTTIPO_" + sGXsfl_17_idx ;
            cmbavCtltdet_listtipo.setName( GXCCtl );
            cmbavCtltdet_listtipo.setWebtags( "" );
            cmbavCtltdet_listtipo.addItem("O", "Otro", (short)(0));
            cmbavCtltdet_listtipo.addItem("F", "Fecha", (short)(0));
            if ( cmbavCtltdet_listtipo.getItemCount() > 0 )
            {
               if ( ( AV23GXV1 > 0 ) && ( AV9SDTDetalleTrnAtr.size() >= AV23GXV1 ) && (GXutil.strcmp("", ((com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem)AV9SDTDetalleTrnAtr.elementAt(-1+AV23GXV1)).getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listtipo())==0) )
               {
                  ((com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem)AV9SDTDetalleTrnAtr.elementAt(-1+AV23GXV1)).setgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listtipo( cmbavCtltdet_listtipo.getValidValue(((com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem)AV9SDTDetalleTrnAtr.elementAt(-1+AV23GXV1)).getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listtipo()) );
               }
            }
         }
         /* ComboBox */
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavCtltdet_listtipo,cmbavCtltdet_listtipo.getInternalname(),GXutil.rtrim( ((com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem)AV9SDTDetalleTrnAtr.elementAt(-1+AV23GXV1)).getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listtipo()),new Integer(1),cmbavCtltdet_listtipo.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(0),new Integer(cmbavCtltdet_listtipo.getEnabled()),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","","","",new Boolean(true)});
         cmbavCtltdet_listtipo.setValue( GXutil.rtrim( ((com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem)AV9SDTDetalleTrnAtr.elementAt(-1+AV23GXV1)).getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listtipo()) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCtltdet_listtipo.getInternalname(), "Values", cmbavCtltdet_listtipo.ToJavascriptSource(), !bGXsfl_17_Refreshing);
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCtltdet_valoratributo_Enabled!=0)&&(edtavCtltdet_valoratributo_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 21,'',false,'"+sGXsfl_17_idx+"',17)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtltdet_valoratributo_Internalname,((com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem)AV9SDTDetalleTrnAtr.elementAt(-1+AV23GXV1)).getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_valoratributo(),"",TempTags+((edtavCtltdet_valoratributo_Enabled!=0)&&(edtavCtltdet_valoratributo_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavCtltdet_valoratributo_Enabled!=0)&&(edtavCtltdet_valoratributo_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,21);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtltdet_valoratributo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(1),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(17),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlclas_atributoobligatorio_Internalname,GXutil.rtrim( ((com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem)AV9SDTDetalleTrnAtr.elementAt(-1+AV23GXV1)).getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Clas_atributoobligatorio()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlclas_atributoobligatorio_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(edtavCtlclas_atributoobligatorio_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(17),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLTDET_LISTID"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem)AV9SDTDetalleTrnAtr.elementAt(-1+AV23GXV1)).getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listid()), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLTDET_LISTDESCRIPCION"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem)AV9SDTDetalleTrnAtr.elementAt(-1+AV23GXV1)).getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listdescripcion(), "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLTDET_LISTTIPO"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem)AV9SDTDetalleTrnAtr.elementAt(-1+AV23GXV1)).getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listtipo(), ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLCLAS_ATRIBUTOOBLIGATORIO"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem)AV9SDTDetalleTrnAtr.elementAt(-1+AV23GXV1)).getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Clas_atributoobligatorio(), ""))));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_17_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_17_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_17_idx+1)) ;
         sGXsfl_17_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_17_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_172( ) ;
      }
      /* End function sendrow_172 */
   }

   public void init_default_properties( )
   {
      lblTitleatributos_Internalname = "TITLEATRIBUTOS" ;
      Alertify1_Internalname = "ALERTIFY1" ;
      edtavCtltdet_listid_Internalname = "CTLTDET_LISTID" ;
      edtavCtltdet_listdescripcion_Internalname = "CTLTDET_LISTDESCRIPCION" ;
      cmbavCtltdet_listtipo.setInternalname( "CTLTDET_LISTTIPO" );
      edtavCtltdet_valoratributo_Internalname = "CTLTDET_VALORATRIBUTO" ;
      edtavCtlclas_atributoobligatorio_Internalname = "CTLCLAS_ATRIBUTOOBLIGATORIO" ;
      bttConfirma_Internalname = "CONFIRMA" ;
      bttCancelar_Internalname = "CANCELAR" ;
      divTable1_Internalname = "TABLE1" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
   }

   public void initialize_properties( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      edtavCtlclas_atributoobligatorio_Jsonclick = "" ;
      edtavCtltdet_valoratributo_Jsonclick = "" ;
      edtavCtltdet_valoratributo_Visible = -1 ;
      edtavCtltdet_valoratributo_Enabled = 1 ;
      cmbavCtltdet_listtipo.setJsonclick( "" );
      edtavCtltdet_listdescripcion_Jsonclick = "" ;
      edtavCtltdet_listid_Jsonclick = "" ;
      edtavCtlclas_atributoobligatorio_Enabled = -1 ;
      cmbavCtltdet_listtipo.setEnabled( -1 );
      edtavCtltdet_listdescripcion_Enabled = -1 ;
      edtavCtltdet_listid_Enabled = -1 ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtavCtlclas_atributoobligatorio_Enabled = 0 ;
      cmbavCtltdet_listtipo.setEnabled( 0 );
      edtavCtltdet_listdescripcion_Enabled = 0 ;
      edtavCtltdet_listid_Enabled = 0 ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      Alertify1_Textmessage = "Click now!!!" ;
      Alertify1_Type = "error" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Atributos" );
      subGrid1_Rows = 10 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'AV9SDTDetalleTrnAtr',fld:'vSDTDETALLETRNATR',grid:17,pic:'',nv:null},{av:'subGrid1_Rows',nv:0}],oparms:[]}");
      setEventMetadata("'CONFIRMA'","{handler:'e116E2',iparms:[{av:'AV9SDTDetalleTrnAtr',fld:'vSDTDETALLETRNATR',grid:17,pic:'',nv:null},{av:'AV12Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV11TDet_Consecutivo',fld:'vTDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'Gx_mode',fld:'vMODE',pic:'@!',nv:''},{av:'AV15Elem_Consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0}],oparms:[{av:'AV10SDTDetalleTrnAtrItem',fld:'vSDTDETALLETRNATRITEM',pic:'',nv:null},{av:'Alertify1_Type',ctrl:'ALERTIFY1',prop:'Type'},{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'},{av:'AV15Elem_Consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',nv:''},{av:'AV9SDTDetalleTrnAtr',fld:'vSDTDETALLETRNATR',grid:17,pic:'',nv:null},{av:'AV11TDet_Consecutivo',fld:'vTDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV12Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("'CANCELAR'","{handler:'e126E2',iparms:[{av:'AV12Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV9SDTDetalleTrnAtr',fld:'vSDTDETALLETRNATR',grid:17,pic:'',nv:null}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV9SDTDetalleTrnAtr',fld:'vSDTDETALLETRNATR',grid:17,pic:'',nv:null}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV9SDTDetalleTrnAtr',fld:'vSDTDETALLETRNATR',grid:17,pic:'',nv:null}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV9SDTDetalleTrnAtr',fld:'vSDTDETALLETRNATR',grid:17,pic:'',nv:null}],oparms:[]}");
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
      wcpOAV15Elem_Consecutivo = "" ;
      wcpOGx_mode = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      GXKey = "" ;
      AV15Elem_Consecutivo = "" ;
      Gx_mode = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV9SDTDetalleTrnAtr = new GXBaseCollection<com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem>(com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem.class, "SDTDetalleTrnAtr.SDTDetalleTrnAtrItem", "ACBSENA", remoteHandle);
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblTitleatributos_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttConfirma_Jsonclick = "" ;
      bttCancelar_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      H006E2_A37Cata_Codigo = new String[] {""} ;
      H006E2_A66Elem_Consecutivo = new String[] {""} ;
      H006E2_A74TIP_Codigo = new String[] {""} ;
      H006E2_A75SEG_Codigo = new String[] {""} ;
      H006E2_A35FAM_Codigo = new String[] {""} ;
      H006E2_A34Clas_Codigo = new String[] {""} ;
      A37Cata_Codigo = "" ;
      A66Elem_Consecutivo = "" ;
      A74TIP_Codigo = "" ;
      A75SEG_Codigo = "" ;
      A35FAM_Codigo = "" ;
      A34Clas_Codigo = "" ;
      AV5TIP_Codigo = "" ;
      AV6SEG_Codigo = "" ;
      AV7FAM_Codigo = "" ;
      AV8Clas_Codigo = "" ;
      A393List_Descripcion = "" ;
      A423List_Tipo = "" ;
      A555Clas_AtributoObligatorio = "" ;
      A494TDet_ValorAtributo = "" ;
      H006E3_A495Clas_EstadoAtributo = new String[] {""} ;
      H006E3_A34Clas_Codigo = new String[] {""} ;
      H006E3_A35FAM_Codigo = new String[] {""} ;
      H006E3_A75SEG_Codigo = new String[] {""} ;
      H006E3_A74TIP_Codigo = new String[] {""} ;
      H006E3_A36List_Id = new long[1] ;
      H006E3_A393List_Descripcion = new String[] {""} ;
      H006E3_A423List_Tipo = new String[] {""} ;
      H006E3_A555Clas_AtributoObligatorio = new String[] {""} ;
      A495Clas_EstadoAtributo = "" ;
      AV10SDTDetalleTrnAtrItem = new com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem(remoteHandle, context);
      AV16TDet_ValorAtributo = "" ;
      H006E4_A70TDet_ListId = new long[1] ;
      H006E4_A69TDet_Consecutivo = new long[1] ;
      H006E4_A46Tran_Id = new long[1] ;
      H006E4_A494TDet_ValorAtributo = new String[] {""} ;
      AV13Pattern = "" ;
      AV18DescripcionCampo = "" ;
      GXv_int1 = new long [1] ;
      GXv_int2 = new long [1] ;
      GXv_objcol_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem3 = new GXBaseCollection [1] ;
      GXv_char4 = new String [1] ;
      GXv_char5 = new String [1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wpatributosdev__default(),
         new Object[] {
             new Object[] {
            H006E2_A37Cata_Codigo, H006E2_A66Elem_Consecutivo, H006E2_A74TIP_Codigo, H006E2_A75SEG_Codigo, H006E2_A35FAM_Codigo, H006E2_A34Clas_Codigo
            }
            , new Object[] {
            H006E3_A495Clas_EstadoAtributo, H006E3_A34Clas_Codigo, H006E3_A35FAM_Codigo, H006E3_A75SEG_Codigo, H006E3_A74TIP_Codigo, H006E3_A36List_Id, H006E3_A393List_Descripcion, H006E3_A423List_Tipo, H006E3_A555Clas_AtributoObligatorio
            }
            , new Object[] {
            H006E4_A70TDet_ListId, H006E4_A69TDet_Consecutivo, H006E4_A46Tran_Id, H006E4_A494TDet_ValorAtributo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavCtltdet_listid_Enabled = 0 ;
      edtavCtltdet_listdescripcion_Enabled = 0 ;
      cmbavCtltdet_listtipo.setEnabled( 0 );
      edtavCtlclas_atributoobligatorio_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte GRID1_nEOF ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nDonePA ;
   private byte AV30GXLvl18 ;
   private byte AV31GXLvl41 ;
   private byte AV19Swerror ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private short nRC_GXsfl_17 ;
   private short nGXsfl_17_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV23GXV1 ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short nGXsfl_17_fel_idx=1 ;
   private short nGXsfl_17_bak_idx=1 ;
   private int subGrid1_Rows ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavCtltdet_listid_Enabled ;
   private int edtavCtltdet_listdescripcion_Enabled ;
   private int edtavCtlclas_atributoobligatorio_Enabled ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GRID1_nGridOutOfScope ;
   private int AV32GXV2 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int edtavCtltdet_valoratributo_Enabled ;
   private int edtavCtltdet_valoratributo_Visible ;
   private long wcpOAV12Tran_Id ;
   private long wcpOAV11TDet_Consecutivo ;
   private long AV12Tran_Id ;
   private long AV11TDet_Consecutivo ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private long A36List_Id ;
   private long AV17List_Id ;
   private long A70TDet_ListId ;
   private long A69TDet_Consecutivo ;
   private long A46Tran_Id ;
   private long GXv_int1[] ;
   private long GXv_int2[] ;
   private String wcpOGx_mode ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_17_idx="0001" ;
   private String GXKey ;
   private String Gx_mode ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String Alertify1_Type ;
   private String Alertify1_Textmessage ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String divTable1_Internalname ;
   private String lblTitleatributos_Internalname ;
   private String lblTitleatributos_Jsonclick ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttConfirma_Internalname ;
   private String bttConfirma_Jsonclick ;
   private String bttCancelar_Internalname ;
   private String bttCancelar_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXCCtl ;
   private String edtavCtltdet_listid_Internalname ;
   private String edtavCtltdet_listdescripcion_Internalname ;
   private String edtavCtlclas_atributoobligatorio_Internalname ;
   private String sGXsfl_17_fel_idx="0001" ;
   private String scmdbuf ;
   private String A423List_Tipo ;
   private String A555Clas_AtributoObligatorio ;
   private String A495Clas_EstadoAtributo ;
   private String Alertify1_Internalname ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String edtavCtltdet_valoratributo_Internalname ;
   private String ROClassString ;
   private String edtavCtltdet_listid_Jsonclick ;
   private String edtavCtltdet_listdescripcion_Jsonclick ;
   private String edtavCtltdet_valoratributo_Jsonclick ;
   private String edtavCtlclas_atributoobligatorio_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_17_Refreshing=false ;
   private boolean returnInSub ;
   private boolean gx_BV17 ;
   private String wcpOAV15Elem_Consecutivo ;
   private String AV15Elem_Consecutivo ;
   private String A37Cata_Codigo ;
   private String A66Elem_Consecutivo ;
   private String A74TIP_Codigo ;
   private String A75SEG_Codigo ;
   private String A35FAM_Codigo ;
   private String A34Clas_Codigo ;
   private String AV5TIP_Codigo ;
   private String AV6SEG_Codigo ;
   private String AV7FAM_Codigo ;
   private String AV8Clas_Codigo ;
   private String A393List_Descripcion ;
   private String A494TDet_ValorAtributo ;
   private String AV16TDet_ValorAtributo ;
   private String AV13Pattern ;
   private String AV18DescripcionCampo ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem AV10SDTDetalleTrnAtrItem ;
   private HTMLChoice cmbavCtltdet_listtipo ;
   private IDataStoreProvider pr_default ;
   private String[] H006E2_A37Cata_Codigo ;
   private String[] H006E2_A66Elem_Consecutivo ;
   private String[] H006E2_A74TIP_Codigo ;
   private String[] H006E2_A75SEG_Codigo ;
   private String[] H006E2_A35FAM_Codigo ;
   private String[] H006E2_A34Clas_Codigo ;
   private String[] H006E3_A495Clas_EstadoAtributo ;
   private String[] H006E3_A34Clas_Codigo ;
   private String[] H006E3_A35FAM_Codigo ;
   private String[] H006E3_A75SEG_Codigo ;
   private String[] H006E3_A74TIP_Codigo ;
   private long[] H006E3_A36List_Id ;
   private String[] H006E3_A393List_Descripcion ;
   private String[] H006E3_A423List_Tipo ;
   private String[] H006E3_A555Clas_AtributoObligatorio ;
   private long[] H006E4_A70TDet_ListId ;
   private long[] H006E4_A69TDet_Consecutivo ;
   private long[] H006E4_A46Tran_Id ;
   private String[] H006E4_A494TDet_ValorAtributo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem> AV9SDTDetalleTrnAtr ;
   private GXBaseCollection<com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem> GXv_objcol_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem3[] ;
}

final  class wpatributosdev__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H006E2", "SELECT T1.Cata_Codigo, T1.Elem_Consecutivo, T5.TIP_Codigo, T4.SEG_Codigo, T3.FAM_Codigo, T2.Clas_Codigo FROM ((((ALM_ELEMENTO T1 INNER JOIN ALM_CATALOGO T2 ON T2.Cata_Codigo = T1.Cata_Codigo) INNER JOIN ALM_CLASE T3 ON T3.Clas_Codigo = T2.Clas_Codigo) INNER JOIN ALM_CAT_FAM T4 ON T4.FAM_Codigo = T3.FAM_Codigo) INNER JOIN ALM_CAT_SEG T5 ON T5.SEG_Codigo = T4.SEG_Codigo) WHERE T1.Elem_Consecutivo = ? ORDER BY T1.Elem_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H006E3", "SELECT T1.Clas_EstadoAtributo, T1.Clas_Codigo, T2.FAM_Codigo, T3.SEG_Codigo, T4.TIP_Codigo, T1.List_Id, T5.List_Descripcion, T5.List_Tipo, T1.Clas_AtributoObligatorio FROM ((((ALM_CLASEATRIBUTOS T1 INNER JOIN ALM_CLASE T2 ON T2.Clas_Codigo = T1.Clas_Codigo) INNER JOIN ALM_CAT_FAM T3 ON T3.FAM_Codigo = T2.FAM_Codigo) INNER JOIN ALM_CAT_SEG T4 ON T4.SEG_Codigo = T3.SEG_Codigo) INNER JOIN ALM_LISTA_ATRIBUTOS T5 ON T5.List_Id = T1.List_Id) WHERE (T1.Clas_Codigo = ?) AND (T4.TIP_Codigo = ?) AND (T3.SEG_Codigo = ?) AND (T2.FAM_Codigo = ?) AND (T1.Clas_EstadoAtributo = 'A') ORDER BY T1.Clas_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H006E4", "SELECT TDet_ListId, TDet_Consecutivo, Tran_Id, TDet_ValorAtributo FROM ALM_DETALLE_TRANSACCIONATRIBUT WHERE Tran_Id = ? and TDet_Consecutivo = ? and TDet_ListId = ? ORDER BY Tran_Id, TDet_Consecutivo, TDet_ListId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((long[]) buf[5])[0] = rslt.getLong(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getString(8, 1) ;
               ((String[]) buf[8])[0] = rslt.getString(9, 2) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
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
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 7);
               stmt.setVarchar(2, (String)parms[1], 2);
               stmt.setVarchar(3, (String)parms[2], 3);
               stmt.setVarchar(4, (String)parms[3], 5);
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
      }
   }

}

