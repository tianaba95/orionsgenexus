/*
               File: wwseg_usuario_impl
        Description: Work With Usuario
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:19:29.26
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

public final  class wwseg_usuario_impl extends GXDataArea
{
   public wwseg_usuario_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wwseg_usuario_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwseg_usuario_impl.class ));
   }

   public wwseg_usuario_impl( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbUsua_TipoContrato = new HTMLChoice();
      cmbUsua_Estado = new HTMLChoice();
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
            nRC_GXsfl_26 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_26_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_26_idx = httpContext.GetNextPar( ) ;
            AV18Update = httpContext.GetNextPar( ) ;
            edtavUpdate_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_26_Refreshing);
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
            AV19Usua_Nombre = httpContext.GetNextPar( ) ;
            AV18Update = httpContext.GetNextPar( ) ;
            edtavUpdate_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_26_Refreshing);
            AV24Pgmname = httpContext.GetNextPar( ) ;
            A23Usua_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid_refresh( subGrid_Rows, AV19Usua_Nombre, AV18Update, AV24Pgmname, A23Usua_Id) ;
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
      pa3N2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start3N2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414192933");
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.wwseg_usuario") +"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vUSUA_NOMBRE", AV19Usua_Nombre);
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_26", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_26, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV24Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUPDATE_Tooltiptext", GXutil.rtrim( edtavUpdate_Tooltiptext));
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
         we3N2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt3N2( ) ;
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
      return formatLink("com.orions2.wwseg_usuario")  ;
   }

   public String getPgmname( )
   {
      return "WWSEG_USUARIO" ;
   }

   public String getPgmdesc( )
   {
      return "Work With Usuario" ;
   }

   public void wb3N0( )
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitletext_Internalname, "Usuario", "", "", lblTitletext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WWSEG_USUARIO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-5 col-sm-3 col-sm-push-6 WWActionsCell", "Right", "top", "", "", "div");
         httpContext.writeText( "<nav class=\"navbar navbar-default gx-navbar  ActionGroup\" data-gx-actiongroup-type=\"menu\">") ;
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "container-fluid", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "navbar-header", "left", "top", "", "", "div");
         httpContext.writeText( "<button type=\"button\" class=\"navbar-toggle collapsed gx-navbar-toggle\" data-toggle=\"collapse\" aria-expanded=\"false\">") ;
         httpContext.writeText( "<span class=\"icon-bar\"></span>") ;
         httpContext.writeText( "<span class=\"icon-bar\"></span>") ;
         httpContext.writeText( "<span class=\"icon-bar\"></span>") ;
         httpContext.writeText( "</button>") ;
         httpContext.writeText( "<span class=\"navbar-brand\"></span>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divActions_inner_Internalname, 1, 0, "px", 0, "px", "collapse navbar-collapse gx-navbar-inner", "left", "top", "", "", "div");
         httpContext.writeText( "<ul class=\"nav navbar-nav\">") ;
         httpContext.writeText( "<li>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 26, 2, 0)+","+"null"+");", "Agregar", bttBtninsert_Jsonclick, 5, "Agregar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WWSEG_USUARIO.htm");
         httpContext.writeText( "</li>") ;
         httpContext.writeText( "</ul>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</nav>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-sm-pull-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavUsua_nombre_Internalname, "Usua_Nombre", "col-sm-3 FilterSearchAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'" + sGXsfl_26_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavUsua_nombre_Internalname, AV19Usua_Nombre, GXutil.rtrim( localUtil.format( AV19Usua_Nombre, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,17);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "Nombre del Usuario", edtavUsua_nombre_Jsonclick, 0, "FilterSearchAttribute", "", "", "", 1, edtavUsua_nombre_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWSEG_USUARIO.htm");
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
            httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"26\">") ;
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
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Id Usuario") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Usuario") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Nombre del Usuario") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Correo Electrónico") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cédula") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Clave") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tipo de Contrato") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Estado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Usuario que Aprueba") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Usuario Creación ") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Fecha Creación") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Usuario Modifica") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Fecha Modifica") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Cambio Clave") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Administrador") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"UpdateAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
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
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A23Usua_Id, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A24Usua_Codigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A25Usua_Nombre);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A219Usua_Email);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A26Usua_Cedula, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A220Usua_Clave);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A226Usua_TipoContrato));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A221Usua_Estado));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A222Usua_UsuAprueba);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A223Usua_UsuarioCrea);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A224Usua_FechaCrea, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A225Usua_UsuarioModifica);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A227usua_FechaModifica, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A228Usua_IndCambioClave));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A229Usua_Administrador));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV18Update));
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtavUpdate_Link));
            GridColumn.AddObjectProperty("Tooltiptext", GXutil.rtrim( edtavUpdate_Tooltiptext));
            GridContainer.AddColumnProperties(GridColumn);
            GridContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid_Allowselection, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 26 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_26 = (short)(nGXsfl_26_idx-1) ;
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

   public void start3N2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Work With Usuario", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup3N0( ) ;
   }

   public void ws3N2( )
   {
      start3N2( ) ;
      evt3N2( ) ;
   }

   public void evt3N2( )
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
                           e113N2 ();
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
                           nGXsfl_26_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_26_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_26_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_262( ) ;
                           A23Usua_Id = localUtil.ctol( httpContext.cgiGet( edtUsua_Id_Internalname), ",", ".") ;
                           A24Usua_Codigo = GXutil.upper( httpContext.cgiGet( edtUsua_Codigo_Internalname)) ;
                           A25Usua_Nombre = httpContext.cgiGet( edtUsua_Nombre_Internalname) ;
                           A219Usua_Email = httpContext.cgiGet( edtUsua_Email_Internalname) ;
                           A26Usua_Cedula = localUtil.ctol( httpContext.cgiGet( edtUsua_Cedula_Internalname), ",", ".") ;
                           A220Usua_Clave = httpContext.cgiGet( edtUsua_Clave_Internalname) ;
                           cmbUsua_TipoContrato.setName( cmbUsua_TipoContrato.getInternalname() );
                           cmbUsua_TipoContrato.setValue( httpContext.cgiGet( cmbUsua_TipoContrato.getInternalname()) );
                           A226Usua_TipoContrato = httpContext.cgiGet( cmbUsua_TipoContrato.getInternalname()) ;
                           cmbUsua_Estado.setName( cmbUsua_Estado.getInternalname() );
                           cmbUsua_Estado.setValue( httpContext.cgiGet( cmbUsua_Estado.getInternalname()) );
                           A221Usua_Estado = httpContext.cgiGet( cmbUsua_Estado.getInternalname()) ;
                           A222Usua_UsuAprueba = httpContext.cgiGet( edtUsua_UsuAprueba_Internalname) ;
                           A223Usua_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtUsua_UsuarioCrea_Internalname)) ;
                           A224Usua_FechaCrea = localUtil.ctot( httpContext.cgiGet( edtUsua_FechaCrea_Internalname), 0) ;
                           A225Usua_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtUsua_UsuarioModifica_Internalname)) ;
                           A227usua_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtusua_FechaModifica_Internalname), 0) ;
                           A228Usua_IndCambioClave = httpContext.cgiGet( edtUsua_IndCambioClave_Internalname) ;
                           A229Usua_Administrador = httpContext.cgiGet( edtUsua_Administrador_Internalname) ;
                           AV18Update = httpContext.cgiGet( edtavUpdate_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV18Update)==0) ? AV25Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV18Update))), !bGXsfl_26_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV18Update), true);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e123N2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e133N2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e143N2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Usua_nombre Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vUSUA_NOMBRE"), AV19Usua_Nombre) != 0 )
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

   public void we3N2( )
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

   public void pa3N2( )
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
         GXCCtl = "USUA_TIPOCONTRATO_" + sGXsfl_26_idx ;
         cmbUsua_TipoContrato.setName( GXCCtl );
         cmbUsua_TipoContrato.setWebtags( "" );
         cmbUsua_TipoContrato.addItem("P", "Planta", (short)(0));
         cmbUsua_TipoContrato.addItem("C", "Contratista", (short)(0));
         if ( cmbUsua_TipoContrato.getItemCount() > 0 )
         {
            A226Usua_TipoContrato = cmbUsua_TipoContrato.getValidValue(A226Usua_TipoContrato) ;
         }
         GXCCtl = "USUA_ESTADO_" + sGXsfl_26_idx ;
         cmbUsua_Estado.setName( GXCCtl );
         cmbUsua_Estado.setWebtags( "" );
         cmbUsua_Estado.addItem("A", "Activo", (short)(0));
         cmbUsua_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbUsua_Estado.getItemCount() > 0 )
         {
            A221Usua_Estado = cmbUsua_Estado.getValidValue(A221Usua_Estado) ;
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
            GX_FocusControl = edtavUsua_nombre_Internalname ;
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
      subsflControlProps_262( ) ;
      while ( nGXsfl_26_idx <= nRC_GXsfl_26 )
      {
         sendrow_262( ) ;
         nGXsfl_26_idx = (short)(((subGrid_Islastpage==1)&&(nGXsfl_26_idx+1>subgrid_recordsperpage( )) ? 1 : nGXsfl_26_idx+1)) ;
         sGXsfl_26_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_26_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_262( ) ;
      }
      httpContext.GX_webresponse.addString(GridContainer.ToJavascriptSource());
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV19Usua_Nombre ,
                                 String AV18Update ,
                                 String AV24Pgmname ,
                                 long A23Usua_Id )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid_Rows = subGrid_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID_nCurrentRecord = 0 ;
      rf3N2( ) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A23Usua_Id), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_ID", GXutil.ltrim( localUtil.ntoc( A23Usua_Id, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A24Usua_Codigo, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_CODIGO", A24Usua_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_NOMBRE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A25Usua_Nombre, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_NOMBRE", A25Usua_Nombre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_EMAIL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A219Usua_Email, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_EMAIL", A219Usua_Email);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_CEDULA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A26Usua_Cedula), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_CEDULA", GXutil.ltrim( localUtil.ntoc( A26Usua_Cedula, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_CLAVE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A220Usua_Clave, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_CLAVE", A220Usua_Clave);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_TIPOCONTRATO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A226Usua_TipoContrato, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_TIPOCONTRATO", GXutil.rtrim( A226Usua_TipoContrato));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_ESTADO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A221Usua_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_ESTADO", GXutil.rtrim( A221Usua_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_USUAPRUEBA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A222Usua_UsuAprueba, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_USUAPRUEBA", A222Usua_UsuAprueba);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_USUARIOCREA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A223Usua_UsuarioCrea, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_USUARIOCREA", A223Usua_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_FECHACREA", getSecureSignedToken( "", localUtil.format( A224Usua_FechaCrea, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_FECHACREA", localUtil.ttoc( A224Usua_FechaCrea, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_USUARIOMODIFICA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A225Usua_UsuarioModifica, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_USUARIOMODIFICA", A225Usua_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_FECHAMODIFICA", getSecureSignedToken( "", localUtil.format( A227usua_FechaModifica, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_FECHAMODIFICA", localUtil.ttoc( A227usua_FechaModifica, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_INDCAMBIOCLAVE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A228Usua_IndCambioClave, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_INDCAMBIOCLAVE", GXutil.rtrim( A228Usua_IndCambioClave));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_ADMINISTRADOR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A229Usua_Administrador, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_ADMINISTRADOR", GXutil.rtrim( A229Usua_Administrador));
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf3N2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV24Pgmname = "WWSEG_USUARIO" ;
      Gx_err = (short)(0) ;
   }

   public void rf3N2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(26) ;
      /* Execute user event: Refresh */
      e133N2 ();
      nGXsfl_26_idx = (short)(1) ;
      sGXsfl_26_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_26_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_262( ) ;
      bGXsfl_26_Refreshing = true ;
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
         subsflControlProps_262( ) ;
         /* Using cursor H003N2 */
         pr_default.execute(0);
         nGXsfl_26_idx = (short)(1) ;
         sGXsfl_26_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_26_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_262( ) ;
         GRID_nEOF = (byte)(0) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) ) ) ) )
         {
            A229Usua_Administrador = H003N2_A229Usua_Administrador[0] ;
            A228Usua_IndCambioClave = H003N2_A228Usua_IndCambioClave[0] ;
            A227usua_FechaModifica = H003N2_A227usua_FechaModifica[0] ;
            A225Usua_UsuarioModifica = H003N2_A225Usua_UsuarioModifica[0] ;
            A224Usua_FechaCrea = H003N2_A224Usua_FechaCrea[0] ;
            A223Usua_UsuarioCrea = H003N2_A223Usua_UsuarioCrea[0] ;
            A222Usua_UsuAprueba = H003N2_A222Usua_UsuAprueba[0] ;
            A221Usua_Estado = H003N2_A221Usua_Estado[0] ;
            A226Usua_TipoContrato = H003N2_A226Usua_TipoContrato[0] ;
            A220Usua_Clave = H003N2_A220Usua_Clave[0] ;
            A26Usua_Cedula = H003N2_A26Usua_Cedula[0] ;
            A219Usua_Email = H003N2_A219Usua_Email[0] ;
            A25Usua_Nombre = H003N2_A25Usua_Nombre[0] ;
            A24Usua_Codigo = H003N2_A24Usua_Codigo[0] ;
            A23Usua_Id = H003N2_A23Usua_Id[0] ;
            if ( (GXutil.strcmp("", AV19Usua_Nombre)==0) || ( GXutil.like( GXutil.upper( A25Usua_Nombre) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV19Usua_Nombre), "") , 254 , "%"),  ' ' ) ) )
            {
               e143N2 ();
            }
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(26) ;
         wb3N0( ) ;
      }
      bGXsfl_26_Refreshing = true ;
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
      return -1 ;
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
      return -1 ;
   }

   public short subgrid_firstpage( )
   {
      GRID_nFirstRecordOnPage = 0 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV19Usua_Nombre, AV18Update, AV24Pgmname, A23Usua_Id) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_recordsperpage( )) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV19Usua_Nombre, AV18Update, AV24Pgmname, A23Usua_Id) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV19Usua_Nombre, AV18Update, AV24Pgmname, A23Usua_Id) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV19Usua_Nombre, AV18Update, AV24Pgmname, A23Usua_Id) ;
      }
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
         gxgrgrid_refresh( subGrid_Rows, AV19Usua_Nombre, AV18Update, AV24Pgmname, A23Usua_Id) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup3N0( )
   {
      /* Before Start, stand alone formulas. */
      AV24Pgmname = "WWSEG_USUARIO" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e123N2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV19Usua_Nombre = httpContext.cgiGet( edtavUsua_nombre_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Usua_Nombre", AV19Usua_Nombre);
         /* Read saved values. */
         nRC_GXsfl_26 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_26"), ",", ".")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), ",", ".") ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), ",", ".")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), ",", ".")) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vUSUA_NOMBRE"), AV19Usua_Nombre) != 0 )
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
      e123N2 ();
      if (returnInSub) return;
   }

   public void e123N2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV24Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV24Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      subGrid_Rows = 10 ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV18Update = context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV18Update)==0) ? AV25Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV18Update))), !bGXsfl_26_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV18Update), true);
      AV25Update_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV18Update)==0) ? AV25Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV18Update))), !bGXsfl_26_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV18Update), true);
      edtavUpdate_Tooltiptext = "Modificar" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_26_Refreshing);
      Form.setCaption( "Usuario" );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      AV19Usua_Nombre = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Usua_Nombre", AV19Usua_Nombre);
      AV20Usuario = AV21websession.getValue("Usuario") ;
   }

   public void e133N2( )
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

   private void e143N2( )
   {
      /* Grid_Load Routine */
      edtavUpdate_Link = formatLink("com.orions2.seg_usuario") + "?" + GXutil.URLEncode(GXutil.rtrim("UPD")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A23Usua_Id,18,0))) ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(26) ;
      }
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) ) ) )
      {
         sendrow_262( ) ;
         GRID_nEOF = (byte)(1) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_recordsperpage( )))) == 0 ) )
         {
            GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
         }
      }
      if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) )
      {
         GRID_nEOF = (byte)(0) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      }
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_26_Refreshing )
      {
         httpContext.doAjaxLoad(26, GridRow);
      }
   }

   public void e113N2( )
   {
      /* 'DoInsert' Routine */
      callWebObject(formatLink("com.orions2.seg_usuario") + "?" + GXutil.URLEncode(GXutil.rtrim("INS")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))));
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      if ( GXutil.strcmp(AV13HTTPRequest.getMethod(), "GET") == 0 )
      {
         AV11GridState.fromxml(AV15Session.getValue(AV24Pgmname+"GridState"), null, null);
         if ( AV11GridState.getgxTv_SdtGridState_Filtervalues().size() >= 1 )
         {
            AV19Usua_Nombre = ((com.orions2.SdtGridState_FilterValue)AV11GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+1)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19Usua_Nombre", AV19Usua_Nombre);
         }
         if ( AV11GridState.getgxTv_SdtGridState_Currentpage() > 0 )
         {
            AV10GridPageCount = subgrid_pagecount( ) ;
            if ( ( AV10GridPageCount > 0 ) && ( AV10GridPageCount < AV11GridState.getgxTv_SdtGridState_Currentpage() ) )
            {
               subgrid_gotopage( AV10GridPageCount) ;
            }
            else
            {
               subgrid_gotopage( AV11GridState.getgxTv_SdtGridState_Currentpage()) ;
            }
         }
      }
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      AV11GridState.fromxml(AV15Session.getValue(AV24Pgmname+"GridState"), null, null);
      AV11GridState.setgxTv_SdtGridState_Currentpage( (short)(subgrid_currentpage( )) );
      AV11GridState.getgxTv_SdtGridState_Filtervalues().clear();
      AV12GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV12GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV19Usua_Nombre );
      AV11GridState.getgxTv_SdtGridState_Filtervalues().add(AV12GridStateFilterValue, 0);
      AV15Session.setValue(AV24Pgmname+"GridState", AV11GridState.toxml(false, true, "GridState", "ACBSENA"));
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV16TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV16TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV24Pgmname );
      AV16TrnContext.setgxTv_SdtTransactionContext_Callerondelete( true );
      AV16TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV13HTTPRequest.getScriptName()+"?"+AV13HTTPRequest.getQuerystring() );
      AV16TrnContext.setgxTv_SdtTransactionContext_Transactionname( "SEG_USUARIO" );
      AV15Session.setValue("TrnContext", AV16TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
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
      pa3N2( ) ;
      ws3N2( ) ;
      we3N2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20186141419300");
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
         httpContext.AddJavascriptSource("wwseg_usuario.js", "?20186141419300");
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_262( )
   {
      edtUsua_Id_Internalname = "USUA_ID_"+sGXsfl_26_idx ;
      edtUsua_Codigo_Internalname = "USUA_CODIGO_"+sGXsfl_26_idx ;
      edtUsua_Nombre_Internalname = "USUA_NOMBRE_"+sGXsfl_26_idx ;
      edtUsua_Email_Internalname = "USUA_EMAIL_"+sGXsfl_26_idx ;
      edtUsua_Cedula_Internalname = "USUA_CEDULA_"+sGXsfl_26_idx ;
      edtUsua_Clave_Internalname = "USUA_CLAVE_"+sGXsfl_26_idx ;
      cmbUsua_TipoContrato.setInternalname( "USUA_TIPOCONTRATO_"+sGXsfl_26_idx );
      cmbUsua_Estado.setInternalname( "USUA_ESTADO_"+sGXsfl_26_idx );
      edtUsua_UsuAprueba_Internalname = "USUA_USUAPRUEBA_"+sGXsfl_26_idx ;
      edtUsua_UsuarioCrea_Internalname = "USUA_USUARIOCREA_"+sGXsfl_26_idx ;
      edtUsua_FechaCrea_Internalname = "USUA_FECHACREA_"+sGXsfl_26_idx ;
      edtUsua_UsuarioModifica_Internalname = "USUA_USUARIOMODIFICA_"+sGXsfl_26_idx ;
      edtusua_FechaModifica_Internalname = "USUA_FECHAMODIFICA_"+sGXsfl_26_idx ;
      edtUsua_IndCambioClave_Internalname = "USUA_INDCAMBIOCLAVE_"+sGXsfl_26_idx ;
      edtUsua_Administrador_Internalname = "USUA_ADMINISTRADOR_"+sGXsfl_26_idx ;
      edtavUpdate_Internalname = "vUPDATE_"+sGXsfl_26_idx ;
   }

   public void subsflControlProps_fel_262( )
   {
      edtUsua_Id_Internalname = "USUA_ID_"+sGXsfl_26_fel_idx ;
      edtUsua_Codigo_Internalname = "USUA_CODIGO_"+sGXsfl_26_fel_idx ;
      edtUsua_Nombre_Internalname = "USUA_NOMBRE_"+sGXsfl_26_fel_idx ;
      edtUsua_Email_Internalname = "USUA_EMAIL_"+sGXsfl_26_fel_idx ;
      edtUsua_Cedula_Internalname = "USUA_CEDULA_"+sGXsfl_26_fel_idx ;
      edtUsua_Clave_Internalname = "USUA_CLAVE_"+sGXsfl_26_fel_idx ;
      cmbUsua_TipoContrato.setInternalname( "USUA_TIPOCONTRATO_"+sGXsfl_26_fel_idx );
      cmbUsua_Estado.setInternalname( "USUA_ESTADO_"+sGXsfl_26_fel_idx );
      edtUsua_UsuAprueba_Internalname = "USUA_USUAPRUEBA_"+sGXsfl_26_fel_idx ;
      edtUsua_UsuarioCrea_Internalname = "USUA_USUARIOCREA_"+sGXsfl_26_fel_idx ;
      edtUsua_FechaCrea_Internalname = "USUA_FECHACREA_"+sGXsfl_26_fel_idx ;
      edtUsua_UsuarioModifica_Internalname = "USUA_USUARIOMODIFICA_"+sGXsfl_26_fel_idx ;
      edtusua_FechaModifica_Internalname = "USUA_FECHAMODIFICA_"+sGXsfl_26_fel_idx ;
      edtUsua_IndCambioClave_Internalname = "USUA_INDCAMBIOCLAVE_"+sGXsfl_26_fel_idx ;
      edtUsua_Administrador_Internalname = "USUA_ADMINISTRADOR_"+sGXsfl_26_fel_idx ;
      edtavUpdate_Internalname = "vUPDATE_"+sGXsfl_26_fel_idx ;
   }

   public void sendrow_262( )
   {
      subsflControlProps_262( ) ;
      wb3N0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_26_idx <= subgrid_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_26_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_26_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUsua_Id_Internalname,GXutil.ltrim( localUtil.ntoc( A23Usua_Id, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A23Usua_Id), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUsua_Id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(26),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"IdLargo","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUsua_Codigo_Internalname,A24Usua_Codigo,GXutil.rtrim( localUtil.format( A24Usua_Codigo, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUsua_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(26),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUsua_Nombre_Internalname,A25Usua_Nombre,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUsua_Nombre_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(26),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUsua_Email_Internalname,A219Usua_Email,"","","'"+""+"'"+",false,"+"'"+""+"'","mailto:"+A219Usua_Email,"","","",edtUsua_Email_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"email","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(26),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"GeneXus\\Email","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUsua_Cedula_Internalname,GXutil.ltrim( localUtil.ntoc( A26Usua_Cedula, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A26Usua_Cedula), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUsua_Cedula_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(26),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUsua_Clave_Internalname,A220Usua_Clave,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUsua_Clave_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(20),new Integer(-1),new Integer(0),new Integer(26),new Integer(1),new Integer(0),new Integer(-1),new Boolean(true),"Clave","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_26_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "USUA_TIPOCONTRATO_" + sGXsfl_26_idx ;
            cmbUsua_TipoContrato.setName( GXCCtl );
            cmbUsua_TipoContrato.setWebtags( "" );
            cmbUsua_TipoContrato.addItem("P", "Planta", (short)(0));
            cmbUsua_TipoContrato.addItem("C", "Contratista", (short)(0));
            if ( cmbUsua_TipoContrato.getItemCount() > 0 )
            {
               A226Usua_TipoContrato = cmbUsua_TipoContrato.getValidValue(A226Usua_TipoContrato) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbUsua_TipoContrato,cmbUsua_TipoContrato.getInternalname(),GXutil.rtrim( A226Usua_TipoContrato),new Integer(1),cmbUsua_TipoContrato.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbUsua_TipoContrato.setValue( GXutil.rtrim( A226Usua_TipoContrato) );
         httpContext.ajax_rsp_assign_prop("", false, cmbUsua_TipoContrato.getInternalname(), "Values", cmbUsua_TipoContrato.ToJavascriptSource(), !bGXsfl_26_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_26_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "USUA_ESTADO_" + sGXsfl_26_idx ;
            cmbUsua_Estado.setName( GXCCtl );
            cmbUsua_Estado.setWebtags( "" );
            cmbUsua_Estado.addItem("A", "Activo", (short)(0));
            cmbUsua_Estado.addItem("I", "Inactivo", (short)(0));
            if ( cmbUsua_Estado.getItemCount() > 0 )
            {
               A221Usua_Estado = cmbUsua_Estado.getValidValue(A221Usua_Estado) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbUsua_Estado,cmbUsua_Estado.getInternalname(),GXutil.rtrim( A221Usua_Estado),new Integer(1),cmbUsua_Estado.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbUsua_Estado.setValue( GXutil.rtrim( A221Usua_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbUsua_Estado.getInternalname(), "Values", cmbUsua_Estado.ToJavascriptSource(), !bGXsfl_26_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUsua_UsuAprueba_Internalname,A222Usua_UsuAprueba,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUsua_UsuAprueba_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(26),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUsua_UsuarioCrea_Internalname,A223Usua_UsuarioCrea,GXutil.rtrim( localUtil.format( A223Usua_UsuarioCrea, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUsua_UsuarioCrea_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(26),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUsua_FechaCrea_Internalname,localUtil.ttoc( A224Usua_FechaCrea, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A224Usua_FechaCrea, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUsua_FechaCrea_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(26),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUsua_UsuarioModifica_Internalname,A225Usua_UsuarioModifica,GXutil.rtrim( localUtil.format( A225Usua_UsuarioModifica, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUsua_UsuarioModifica_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(26),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtusua_FechaModifica_Internalname,localUtil.ttoc( A227usua_FechaModifica, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A227usua_FechaModifica, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtusua_FechaModifica_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(26),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUsua_IndCambioClave_Internalname,GXutil.rtrim( A228Usua_IndCambioClave),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUsua_IndCambioClave_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(26),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Indicador","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUsua_Administrador_Internalname,GXutil.rtrim( A229Usua_Administrador),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUsua_Administrador_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(26),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Indicador","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         ClassString = "UpdateAttribute" ;
         StyleString = "" ;
         AV18Update_IsBlob = (boolean)(((GXutil.strcmp("", AV18Update)==0)&&(GXutil.strcmp("", AV25Update_GXI)==0))||!(GXutil.strcmp("", AV18Update)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV18Update)==0) ? AV25Update_GXI : httpContext.getResourceRelative(AV18Update)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavUpdate_Internalname,sImgUrl,edtavUpdate_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"",edtavUpdate_Tooltiptext,new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV18Update_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_ID"+"_"+sGXsfl_26_idx, getSecureSignedToken( sGXsfl_26_idx, localUtil.format( DecimalUtil.doubleToDec(A23Usua_Id), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_CODIGO"+"_"+sGXsfl_26_idx, getSecureSignedToken( sGXsfl_26_idx, GXutil.rtrim( localUtil.format( A24Usua_Codigo, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_NOMBRE"+"_"+sGXsfl_26_idx, getSecureSignedToken( sGXsfl_26_idx, GXutil.rtrim( localUtil.format( A25Usua_Nombre, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_EMAIL"+"_"+sGXsfl_26_idx, getSecureSignedToken( sGXsfl_26_idx, GXutil.rtrim( localUtil.format( A219Usua_Email, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_CEDULA"+"_"+sGXsfl_26_idx, getSecureSignedToken( sGXsfl_26_idx, localUtil.format( DecimalUtil.doubleToDec(A26Usua_Cedula), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_CLAVE"+"_"+sGXsfl_26_idx, getSecureSignedToken( sGXsfl_26_idx, GXutil.rtrim( localUtil.format( A220Usua_Clave, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_TIPOCONTRATO"+"_"+sGXsfl_26_idx, getSecureSignedToken( sGXsfl_26_idx, GXutil.rtrim( localUtil.format( A226Usua_TipoContrato, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_ESTADO"+"_"+sGXsfl_26_idx, getSecureSignedToken( sGXsfl_26_idx, GXutil.rtrim( localUtil.format( A221Usua_Estado, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_USUAPRUEBA"+"_"+sGXsfl_26_idx, getSecureSignedToken( sGXsfl_26_idx, GXutil.rtrim( localUtil.format( A222Usua_UsuAprueba, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_USUARIOCREA"+"_"+sGXsfl_26_idx, getSecureSignedToken( sGXsfl_26_idx, GXutil.rtrim( localUtil.format( A223Usua_UsuarioCrea, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_FECHACREA"+"_"+sGXsfl_26_idx, getSecureSignedToken( sGXsfl_26_idx, localUtil.format( A224Usua_FechaCrea, "99/99/99 99:99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_USUARIOMODIFICA"+"_"+sGXsfl_26_idx, getSecureSignedToken( sGXsfl_26_idx, GXutil.rtrim( localUtil.format( A225Usua_UsuarioModifica, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_FECHAMODIFICA"+"_"+sGXsfl_26_idx, getSecureSignedToken( sGXsfl_26_idx, localUtil.format( A227usua_FechaModifica, "99/99/99 99:99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_INDCAMBIOCLAVE"+"_"+sGXsfl_26_idx, getSecureSignedToken( sGXsfl_26_idx, GXutil.rtrim( localUtil.format( A228Usua_IndCambioClave, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_ADMINISTRADOR"+"_"+sGXsfl_26_idx, getSecureSignedToken( sGXsfl_26_idx, GXutil.rtrim( localUtil.format( A229Usua_Administrador, ""))));
         GridContainer.AddRow(GridRow);
         nGXsfl_26_idx = (short)(((subGrid_Islastpage==1)&&(nGXsfl_26_idx+1>subgrid_recordsperpage( )) ? 1 : nGXsfl_26_idx+1)) ;
         sGXsfl_26_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_26_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_262( ) ;
      }
      /* End function sendrow_262 */
   }

   public void init_default_properties( )
   {
      lblTitletext_Internalname = "TITLETEXT" ;
      bttBtninsert_Internalname = "BTNINSERT" ;
      divActions_inner_Internalname = "ACTIONS_INNER" ;
      edtavUsua_nombre_Internalname = "vUSUA_NOMBRE" ;
      divTabletop_Internalname = "TABLETOP" ;
      edtUsua_Id_Internalname = "USUA_ID" ;
      edtUsua_Codigo_Internalname = "USUA_CODIGO" ;
      edtUsua_Nombre_Internalname = "USUA_NOMBRE" ;
      edtUsua_Email_Internalname = "USUA_EMAIL" ;
      edtUsua_Cedula_Internalname = "USUA_CEDULA" ;
      edtUsua_Clave_Internalname = "USUA_CLAVE" ;
      cmbUsua_TipoContrato.setInternalname( "USUA_TIPOCONTRATO" );
      cmbUsua_Estado.setInternalname( "USUA_ESTADO" );
      edtUsua_UsuAprueba_Internalname = "USUA_USUAPRUEBA" ;
      edtUsua_UsuarioCrea_Internalname = "USUA_USUARIOCREA" ;
      edtUsua_FechaCrea_Internalname = "USUA_FECHACREA" ;
      edtUsua_UsuarioModifica_Internalname = "USUA_USUARIOMODIFICA" ;
      edtusua_FechaModifica_Internalname = "USUA_FECHAMODIFICA" ;
      edtUsua_IndCambioClave_Internalname = "USUA_INDCAMBIOCLAVE" ;
      edtUsua_Administrador_Internalname = "USUA_ADMINISTRADOR" ;
      edtavUpdate_Internalname = "vUPDATE" ;
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
      edtUsua_Administrador_Jsonclick = "" ;
      edtUsua_IndCambioClave_Jsonclick = "" ;
      edtusua_FechaModifica_Jsonclick = "" ;
      edtUsua_UsuarioModifica_Jsonclick = "" ;
      edtUsua_FechaCrea_Jsonclick = "" ;
      edtUsua_UsuarioCrea_Jsonclick = "" ;
      edtUsua_UsuAprueba_Jsonclick = "" ;
      cmbUsua_Estado.setJsonclick( "" );
      cmbUsua_TipoContrato.setJsonclick( "" );
      edtUsua_Clave_Jsonclick = "" ;
      edtUsua_Cedula_Jsonclick = "" ;
      edtUsua_Email_Jsonclick = "" ;
      edtUsua_Nombre_Jsonclick = "" ;
      edtUsua_Codigo_Jsonclick = "" ;
      edtUsua_Id_Jsonclick = "" ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      edtavUpdate_Link = "" ;
      subGrid_Class = "WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavUsua_nombre_Jsonclick = "" ;
      edtavUsua_nombre_Enabled = 1 ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Work With Usuario" );
      subGrid_Rows = 0 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV18Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A23Usua_Id',fld:'USUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV24Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV19Usua_Nombre',fld:'vUSUA_NOMBRE',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e143N2',iparms:[{av:'A23Usua_Id',fld:'USUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[{av:'edtavUpdate_Link',ctrl:'vUPDATE',prop:'Link'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e113N2',iparms:[{av:'A23Usua_Id',fld:'USUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV18Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A23Usua_Id',fld:'USUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV24Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV19Usua_Nombre',fld:'vUSUA_NOMBRE',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV18Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A23Usua_Id',fld:'USUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV24Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV19Usua_Nombre',fld:'vUSUA_NOMBRE',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV18Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A23Usua_Id',fld:'USUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV24Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV19Usua_Nombre',fld:'vUSUA_NOMBRE',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV18Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A23Usua_Id',fld:'USUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV24Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV19Usua_Nombre',fld:'vUSUA_NOMBRE',pic:'',nv:''}],oparms:[]}");
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
      AV18Update = "" ;
      AV19Usua_Nombre = "" ;
      AV24Pgmname = "" ;
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
      A24Usua_Codigo = "" ;
      A25Usua_Nombre = "" ;
      A219Usua_Email = "" ;
      A220Usua_Clave = "" ;
      A226Usua_TipoContrato = "" ;
      A221Usua_Estado = "" ;
      A222Usua_UsuAprueba = "" ;
      A223Usua_UsuarioCrea = "" ;
      A224Usua_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A225Usua_UsuarioModifica = "" ;
      A227usua_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      A228Usua_IndCambioClave = "" ;
      A229Usua_Administrador = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV25Update_GXI = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      H003N2_A229Usua_Administrador = new String[] {""} ;
      H003N2_A228Usua_IndCambioClave = new String[] {""} ;
      H003N2_A227usua_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H003N2_A225Usua_UsuarioModifica = new String[] {""} ;
      H003N2_A224Usua_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      H003N2_A223Usua_UsuarioCrea = new String[] {""} ;
      H003N2_A222Usua_UsuAprueba = new String[] {""} ;
      H003N2_A221Usua_Estado = new String[] {""} ;
      H003N2_A226Usua_TipoContrato = new String[] {""} ;
      H003N2_A220Usua_Clave = new String[] {""} ;
      H003N2_A26Usua_Cedula = new long[1] ;
      H003N2_A219Usua_Email = new String[] {""} ;
      H003N2_A25Usua_Nombre = new String[] {""} ;
      H003N2_A24Usua_Codigo = new String[] {""} ;
      H003N2_A23Usua_Id = new long[1] ;
      AV20Usuario = "" ;
      AV21websession = httpContext.getWebSession();
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV13HTTPRequest = httpContext.getHttpRequest();
      AV11GridState = new com.orions2.SdtGridState(remoteHandle, context);
      AV15Session = httpContext.getWebSession();
      AV12GridStateFilterValue = new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV16TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      ROClassString = "" ;
      sImgUrl = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wwseg_usuario__default(),
         new Object[] {
             new Object[] {
            H003N2_A229Usua_Administrador, H003N2_A228Usua_IndCambioClave, H003N2_A227usua_FechaModifica, H003N2_A225Usua_UsuarioModifica, H003N2_A224Usua_FechaCrea, H003N2_A223Usua_UsuarioCrea, H003N2_A222Usua_UsuAprueba, H003N2_A221Usua_Estado, H003N2_A226Usua_TipoContrato, H003N2_A220Usua_Clave,
            H003N2_A26Usua_Cedula, H003N2_A219Usua_Email, H003N2_A25Usua_Nombre, H003N2_A24Usua_Codigo, H003N2_A23Usua_Id
            }
         }
      );
      AV24Pgmname = "WWSEG_USUARIO" ;
      /* GeneXus formulas. */
      AV24Pgmname = "WWSEG_USUARIO" ;
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
   private short nRC_GXsfl_26 ;
   private short nGXsfl_26_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int edtavUsua_nombre_Enabled ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int subGrid_Islastpage ;
   private int AV10GridPageCount ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private long A23Usua_Id ;
   private long GRID_nFirstRecordOnPage ;
   private long A26Usua_Cedula ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String edtavUpdate_Tooltiptext ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_26_idx="0001" ;
   private String edtavUpdate_Internalname ;
   private String AV24Pgmname ;
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
   private String divActions_inner_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtninsert_Internalname ;
   private String bttBtninsert_Jsonclick ;
   private String edtavUsua_nombre_Internalname ;
   private String edtavUsua_nombre_Jsonclick ;
   private String divGridcell_Internalname ;
   private String divGridtable_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String A226Usua_TipoContrato ;
   private String A221Usua_Estado ;
   private String A228Usua_IndCambioClave ;
   private String A229Usua_Administrador ;
   private String edtavUpdate_Link ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtUsua_Id_Internalname ;
   private String edtUsua_Codigo_Internalname ;
   private String edtUsua_Nombre_Internalname ;
   private String edtUsua_Email_Internalname ;
   private String edtUsua_Cedula_Internalname ;
   private String edtUsua_Clave_Internalname ;
   private String edtUsua_UsuAprueba_Internalname ;
   private String edtUsua_UsuarioCrea_Internalname ;
   private String edtUsua_FechaCrea_Internalname ;
   private String edtUsua_UsuarioModifica_Internalname ;
   private String edtusua_FechaModifica_Internalname ;
   private String edtUsua_IndCambioClave_Internalname ;
   private String edtUsua_Administrador_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String sGXsfl_26_fel_idx="0001" ;
   private String ROClassString ;
   private String edtUsua_Id_Jsonclick ;
   private String edtUsua_Codigo_Jsonclick ;
   private String edtUsua_Nombre_Jsonclick ;
   private String edtUsua_Email_Jsonclick ;
   private String edtUsua_Cedula_Jsonclick ;
   private String edtUsua_Clave_Jsonclick ;
   private String edtUsua_UsuAprueba_Jsonclick ;
   private String edtUsua_UsuarioCrea_Jsonclick ;
   private String edtUsua_FechaCrea_Jsonclick ;
   private String edtUsua_UsuarioModifica_Jsonclick ;
   private String edtusua_FechaModifica_Jsonclick ;
   private String edtUsua_IndCambioClave_Jsonclick ;
   private String edtUsua_Administrador_Jsonclick ;
   private String sImgUrl ;
   private java.util.Date A224Usua_FechaCrea ;
   private java.util.Date A227usua_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean bGXsfl_26_Refreshing=false ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV18Update_IsBlob ;
   private String AV19Usua_Nombre ;
   private String A24Usua_Codigo ;
   private String A25Usua_Nombre ;
   private String A219Usua_Email ;
   private String A220Usua_Clave ;
   private String A222Usua_UsuAprueba ;
   private String A223Usua_UsuarioCrea ;
   private String A225Usua_UsuarioModifica ;
   private String AV25Update_GXI ;
   private String AV20Usuario ;
   private String AV18Update ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV13HTTPRequest ;
   private com.genexus.webpanels.WebSession AV21websession ;
   private com.genexus.webpanels.WebSession AV15Session ;
   private HTMLChoice cmbUsua_TipoContrato ;
   private HTMLChoice cmbUsua_Estado ;
   private IDataStoreProvider pr_default ;
   private String[] H003N2_A229Usua_Administrador ;
   private String[] H003N2_A228Usua_IndCambioClave ;
   private java.util.Date[] H003N2_A227usua_FechaModifica ;
   private String[] H003N2_A225Usua_UsuarioModifica ;
   private java.util.Date[] H003N2_A224Usua_FechaCrea ;
   private String[] H003N2_A223Usua_UsuarioCrea ;
   private String[] H003N2_A222Usua_UsuAprueba ;
   private String[] H003N2_A221Usua_Estado ;
   private String[] H003N2_A226Usua_TipoContrato ;
   private String[] H003N2_A220Usua_Clave ;
   private long[] H003N2_A26Usua_Cedula ;
   private String[] H003N2_A219Usua_Email ;
   private String[] H003N2_A25Usua_Nombre ;
   private String[] H003N2_A24Usua_Codigo ;
   private long[] H003N2_A23Usua_Id ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtGridState AV11GridState ;
   private com.orions2.SdtGridState_FilterValue AV12GridStateFilterValue ;
   private com.orions2.SdtTransactionContext AV16TrnContext ;
}

final  class wwseg_usuario__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H003N2", "SELECT Usua_Administrador, Usua_IndCambioClave, usua_FechaModifica, Usua_UsuarioModifica, Usua_FechaCrea, Usua_UsuarioCrea, Usua_UsuAprueba, Usua_Estado, Usua_TipoContrato, Usua_Clave, Usua_Cedula, Usua_Email, Usua_Nombre, Usua_Codigo, Usua_Id FROM SEG_USUARIO ORDER BY Usua_Nombre ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 1) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getString(8, 1) ;
               ((String[]) buf[8])[0] = rslt.getString(9, 1) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((long[]) buf[10])[0] = rslt.getLong(11) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(12) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(14) ;
               ((long[]) buf[14])[0] = rslt.getLong(15) ;
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

