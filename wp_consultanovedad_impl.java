/*
               File: wp_consultanovedad_impl
        Description: Novedades de la Transacción
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:23:52.36
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

public final  class wp_consultanovedad_impl extends GXDataArea
{
   public wp_consultanovedad_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wp_consultanovedad_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wp_consultanovedad_impl.class ));
   }

   public wp_consultanovedad_impl( int remoteHandle ,
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            nRC_GXsfl_9 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_9_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_9_idx = httpContext.GetNextPar( ) ;
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
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( ) ;
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
            AV6Tran_Id = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6Tran_Id", GXutil.ltrim( GXutil.str( AV6Tran_Id, 11, 0)));
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
      pa9U2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start9U2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414235238");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.wp_consultanovedad") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV6Tran_Id,11,0)))+"\">") ;
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
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Sdtnovedadtrn", AV5SDTNovedadTrn);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Sdtnovedadtrn", AV5SDTNovedadTrn);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_9", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_9, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_ID", GXutil.ltrim( localUtil.ntoc( AV6Tran_Id, (byte)(11), (byte)(0), ",", "")));
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
         we9U2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt9U2( ) ;
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
      return formatLink("com.orions2.wp_consultanovedad") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV6Tran_Id,11,0))) ;
   }

   public String getPgmname( )
   {
      return "WP_ConsultaNovedad" ;
   }

   public String getPgmdesc( )
   {
      return "Novedades de la Transacción" ;
   }

   public void wb9U0( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable1_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"9\">") ;
            sStyleString = "" ;
            com.orions2.GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "WorkWith", 0, "", "", 1, 2, sStyleString, "", 0);
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
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Nro") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Novedad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCtlnove_valorantiguo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "Valor Antiguo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCtlnove_valornuevo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "Valor Nuevo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCtlvalor_antiguo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "Valor Antiguo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCtlvalor_nuevo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "Valor Nuevo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeTextNL( "</tr>") ;
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
            Grid1Container.AddObjectProperty("GridName", "Grid1");
            Grid1Container.AddObjectProperty("Class", "WorkWith");
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("CmpContext", "");
            Grid1Container.AddObjectProperty("InMasterPage", "false");
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlnove_identificador_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlnove_fecharegistro_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltnov_descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlnove_valorantiguo_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCtlnove_valorantiguo_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlnove_valornuevo_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCtlnove_valornuevo_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlvalor_antiguo_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCtlvalor_antiguo_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlvalor_nuevo_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCtlvalor_nuevo_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 9 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_9 = (short)(nGXsfl_9_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV18GXV1 = nGXsfl_9_idx ;
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
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 col-sm-offset-4", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttSalir_Internalname, "gx.evt.setGridEvt("+GXutil.str( 9, 1, 0)+","+"null"+");", "Salir", bttSalir_Jsonclick, 5, "Salir", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'SALIR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WP_ConsultaNovedad.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start9U2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Novedades de la Transacción", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup9U0( ) ;
   }

   public void ws9U2( )
   {
      start9U2( ) ;
      evt9U2( ) ;
   }

   public void evt9U2( )
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
                        else if ( GXutil.strcmp(sEvt, "'SALIR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Salir' */
                           e119U2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_9_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_9_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_9_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_92( ) ;
                           AV18GXV1 = nGXsfl_9_idx ;
                           if ( ( AV5SDTNovedadTrn.size() >= AV18GXV1 ) && ( AV18GXV1 > 0 ) )
                           {
                              AV5SDTNovedadTrn.currentItem( ((com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem)AV5SDTNovedadTrn.elementAt(-1+AV18GXV1)) );
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
                                 e129U2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e139U2 ();
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

   public void we9U2( )
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

   public void pa9U2( )
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
      subsflControlProps_92( ) ;
      while ( nGXsfl_9_idx <= nRC_GXsfl_9 )
      {
         sendrow_92( ) ;
         nGXsfl_9_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_9_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_9_idx+1)) ;
         sGXsfl_9_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_9_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_92( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRID1_nCurrentRecord = 0 ;
      rf9U2( ) ;
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
      rf9U2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavCtlnove_identificador_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlnove_identificador_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlnove_identificador_Enabled, 5, 0)), !bGXsfl_9_Refreshing);
      edtavCtlnove_fecharegistro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlnove_fecharegistro_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlnove_fecharegistro_Enabled, 5, 0)), !bGXsfl_9_Refreshing);
      edtavCtltnov_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltnov_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltnov_descripcion_Enabled, 5, 0)), !bGXsfl_9_Refreshing);
      edtavCtlnove_valorantiguo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlnove_valorantiguo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlnove_valorantiguo_Enabled, 5, 0)), !bGXsfl_9_Refreshing);
      edtavCtlnove_valornuevo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlnove_valornuevo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlnove_valornuevo_Enabled, 5, 0)), !bGXsfl_9_Refreshing);
      edtavCtlvalor_antiguo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlvalor_antiguo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlvalor_antiguo_Enabled, 5, 0)), !bGXsfl_9_Refreshing);
      edtavCtlvalor_nuevo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlvalor_nuevo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlvalor_nuevo_Enabled, 5, 0)), !bGXsfl_9_Refreshing);
   }

   public void rf9U2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(9) ;
      nGXsfl_9_idx = (short)(1) ;
      sGXsfl_9_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_9_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_92( ) ;
      bGXsfl_9_Refreshing = true ;
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "WorkWith");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_92( ) ;
         e139U2 ();
         wbEnd = (short)(9) ;
         wb9U0( ) ;
      }
      bGXsfl_9_Refreshing = true ;
   }

   public int subgrid1_pagecount( )
   {
      return -1 ;
   }

   public int subgrid1_recordcount( )
   {
      return -1 ;
   }

   public int subgrid1_recordsperpage( )
   {
      return -1 ;
   }

   public int subgrid1_currentpage( )
   {
      return -1 ;
   }

   public void strup9U0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      edtavCtlnove_identificador_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlnove_identificador_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlnove_identificador_Enabled, 5, 0)), !bGXsfl_9_Refreshing);
      edtavCtlnove_fecharegistro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlnove_fecharegistro_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlnove_fecharegistro_Enabled, 5, 0)), !bGXsfl_9_Refreshing);
      edtavCtltnov_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltnov_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltnov_descripcion_Enabled, 5, 0)), !bGXsfl_9_Refreshing);
      edtavCtlnove_valorantiguo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlnove_valorantiguo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlnove_valorantiguo_Enabled, 5, 0)), !bGXsfl_9_Refreshing);
      edtavCtlnove_valornuevo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlnove_valornuevo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlnove_valornuevo_Enabled, 5, 0)), !bGXsfl_9_Refreshing);
      edtavCtlvalor_antiguo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlvalor_antiguo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlvalor_antiguo_Enabled, 5, 0)), !bGXsfl_9_Refreshing);
      edtavCtlvalor_nuevo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlvalor_nuevo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlvalor_nuevo_Enabled, 5, 0)), !bGXsfl_9_Refreshing);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e129U2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Sdtnovedadtrn"), AV5SDTNovedadTrn);
         /* Read variables values. */
         /* Read saved values. */
         nRC_GXsfl_9 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_9"), ",", ".")) ;
         nRC_GXsfl_9 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_9"), ",", ".")) ;
         nGXsfl_9_fel_idx = (short)(0) ;
         while ( nGXsfl_9_fel_idx < nRC_GXsfl_9 )
         {
            nGXsfl_9_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_9_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_9_fel_idx+1)) ;
            sGXsfl_9_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_9_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_92( ) ;
            AV18GXV1 = nGXsfl_9_fel_idx ;
            if ( ( AV5SDTNovedadTrn.size() >= AV18GXV1 ) && ( AV18GXV1 > 0 ) )
            {
               AV5SDTNovedadTrn.currentItem( ((com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem)AV5SDTNovedadTrn.elementAt(-1+AV18GXV1)) );
            }
         }
         if ( nGXsfl_9_fel_idx == 0 )
         {
            nGXsfl_9_idx = (short)(1) ;
            sGXsfl_9_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_9_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_92( ) ;
         }
         nGXsfl_9_fel_idx = (short)(1) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e129U2 ();
      if (returnInSub) return;
   }

   public void e129U2( )
   {
      /* Start Routine */
      GXt_objcol_SdtSDTNovedadTrn_SDTNovedadTrnItem1 = AV5SDTNovedadTrn ;
      GXv_objcol_SdtSDTNovedadTrn_SDTNovedadTrnItem2[0] = GXt_objcol_SdtSDTNovedadTrn_SDTNovedadTrnItem1 ;
      new com.orions2.dpnovedadestrn(remoteHandle, context).execute( AV6Tran_Id, GXv_objcol_SdtSDTNovedadTrn_SDTNovedadTrnItem2) ;
      GXt_objcol_SdtSDTNovedadTrn_SDTNovedadTrnItem1 = GXv_objcol_SdtSDTNovedadTrn_SDTNovedadTrnItem2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Tran_Id", GXutil.ltrim( GXutil.str( AV6Tran_Id, 11, 0)));
      AV5SDTNovedadTrn = GXt_objcol_SdtSDTNovedadTrn_SDTNovedadTrnItem1 ;
      gx_BV9 = true ;
      /* Execute user subroutine: 'DESCRIPCIONES' */
      S112 ();
      if (returnInSub) return;
   }

   public void e119U2( )
   {
      /* 'Salir' Routine */
      httpContext.setWebReturnParms(new Object[] {new Long(AV6Tran_Id)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'DESCRIPCIONES' Routine */
      AV26GXV2 = 1 ;
      while ( AV26GXV2 <= AV5SDTNovedadTrn.size() )
      {
         AV7SDTNovedadTrnItem = (com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem)((com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem)AV5SDTNovedadTrn.elementAt(-1+AV26GXV2));
         AV9Nove_Identificador = AV7SDTNovedadTrnItem.getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_identificador() ;
         AV10TNov_Nombre_Campo = AV7SDTNovedadTrnItem.getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_nombre_campo() ;
         AV11Nove_ValorAntiguo = AV7SDTNovedadTrnItem.getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valorantiguo() ;
         AV12Nove_ValorNuevo = AV7SDTNovedadTrnItem.getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valornuevo() ;
         AV15TNov_Tipo = AV7SDTNovedadTrnItem.getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_tipo() ;
         GXv_int3[0] = AV9Nove_Identificador ;
         GXv_char4[0] = AV10TNov_Nombre_Campo ;
         GXv_char5[0] = AV11Nove_ValorAntiguo ;
         GXv_char6[0] = AV12Nove_ValorNuevo ;
         GXv_char7[0] = AV13Valor_Antiguo ;
         GXv_char8[0] = AV14Valor_Nuevo ;
         new com.orions2.pvaloresnove(remoteHandle, context).execute( GXv_int3, GXv_char4, GXv_char5, GXv_char6, GXv_char7, GXv_char8) ;
         wp_consultanovedad_impl.this.AV9Nove_Identificador = GXv_int3[0] ;
         wp_consultanovedad_impl.this.AV10TNov_Nombre_Campo = GXv_char4[0] ;
         wp_consultanovedad_impl.this.AV11Nove_ValorAntiguo = GXv_char5[0] ;
         wp_consultanovedad_impl.this.AV12Nove_ValorNuevo = GXv_char6[0] ;
         wp_consultanovedad_impl.this.AV13Valor_Antiguo = GXv_char7[0] ;
         wp_consultanovedad_impl.this.AV14Valor_Nuevo = GXv_char8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Valor_Antiguo", AV13Valor_Antiguo);
         httpContext.ajax_rsp_assign_attri("", false, "AV14Valor_Nuevo", AV14Valor_Nuevo);
         AV7SDTNovedadTrnItem.setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_antiguo( AV13Valor_Antiguo );
         AV7SDTNovedadTrnItem.setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_nuevo( AV14Valor_Nuevo );
         AV26GXV2 = (int)(AV26GXV2+1) ;
      }
      if ( GXutil.strcmp(AV15TNov_Tipo, "D") == 0 )
      {
         edtavCtlnove_valorantiguo_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtlnove_valorantiguo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlnove_valorantiguo_Visible, 5, 0)), !bGXsfl_9_Refreshing);
         edtavCtlnove_valornuevo_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtlnove_valornuevo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlnove_valornuevo_Visible, 5, 0)), !bGXsfl_9_Refreshing);
         edtavCtlvalor_antiguo_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtlvalor_antiguo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlvalor_antiguo_Visible, 5, 0)), !bGXsfl_9_Refreshing);
         edtavCtlvalor_nuevo_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtlvalor_nuevo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlvalor_nuevo_Visible, 5, 0)), !bGXsfl_9_Refreshing);
      }
      else
      {
         edtavCtlnove_valorantiguo_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtlnove_valorantiguo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlnove_valorantiguo_Visible, 5, 0)), !bGXsfl_9_Refreshing);
         edtavCtlnove_valornuevo_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtlnove_valornuevo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlnove_valornuevo_Visible, 5, 0)), !bGXsfl_9_Refreshing);
         edtavCtlvalor_antiguo_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtlvalor_antiguo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlvalor_antiguo_Visible, 5, 0)), !bGXsfl_9_Refreshing);
         edtavCtlvalor_nuevo_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtlvalor_nuevo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlvalor_nuevo_Visible, 5, 0)), !bGXsfl_9_Refreshing);
      }
   }

   private void e139U2( )
   {
      /* Grid1_Load Routine */
      AV18GXV1 = (short)(1) ;
      while ( AV18GXV1 <= AV5SDTNovedadTrn.size() )
      {
         AV5SDTNovedadTrn.currentItem( ((com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem)AV5SDTNovedadTrn.elementAt(-1+AV18GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(9) ;
         }
         sendrow_92( ) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_9_Refreshing )
         {
            httpContext.doAjaxLoad(9, Grid1Row);
         }
         AV18GXV1 = (short)(AV18GXV1+1) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV6Tran_Id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Tran_Id", GXutil.ltrim( GXutil.str( AV6Tran_Id, 11, 0)));
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
      pa9U2( ) ;
      ws9U2( ) ;
      we9U2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414235268");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("wp_consultanovedad.js", "?201861414235268");
      /* End function include_jscripts */
   }

   public void subsflControlProps_92( )
   {
      edtavCtlnove_identificador_Internalname = "CTLNOVE_IDENTIFICADOR_"+sGXsfl_9_idx ;
      edtavCtlnove_fecharegistro_Internalname = "CTLNOVE_FECHAREGISTRO_"+sGXsfl_9_idx ;
      edtavCtltnov_descripcion_Internalname = "CTLTNOV_DESCRIPCION_"+sGXsfl_9_idx ;
      edtavCtlnove_valorantiguo_Internalname = "CTLNOVE_VALORANTIGUO_"+sGXsfl_9_idx ;
      edtavCtlnove_valornuevo_Internalname = "CTLNOVE_VALORNUEVO_"+sGXsfl_9_idx ;
      edtavCtlvalor_antiguo_Internalname = "CTLVALOR_ANTIGUO_"+sGXsfl_9_idx ;
      edtavCtlvalor_nuevo_Internalname = "CTLVALOR_NUEVO_"+sGXsfl_9_idx ;
   }

   public void subsflControlProps_fel_92( )
   {
      edtavCtlnove_identificador_Internalname = "CTLNOVE_IDENTIFICADOR_"+sGXsfl_9_fel_idx ;
      edtavCtlnove_fecharegistro_Internalname = "CTLNOVE_FECHAREGISTRO_"+sGXsfl_9_fel_idx ;
      edtavCtltnov_descripcion_Internalname = "CTLTNOV_DESCRIPCION_"+sGXsfl_9_fel_idx ;
      edtavCtlnove_valorantiguo_Internalname = "CTLNOVE_VALORANTIGUO_"+sGXsfl_9_fel_idx ;
      edtavCtlnove_valornuevo_Internalname = "CTLNOVE_VALORNUEVO_"+sGXsfl_9_fel_idx ;
      edtavCtlvalor_antiguo_Internalname = "CTLVALOR_ANTIGUO_"+sGXsfl_9_fel_idx ;
      edtavCtlvalor_nuevo_Internalname = "CTLVALOR_NUEVO_"+sGXsfl_9_fel_idx ;
   }

   public void sendrow_92( )
   {
      subsflControlProps_92( ) ;
      wb9U0( ) ;
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
         if ( ((int)((nGXsfl_9_idx) % (2))) == 0 )
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
         httpContext.writeText( " class=\""+"WorkWith"+"\" style=\""+""+"\"") ;
         httpContext.writeText( " gxrow=\""+sGXsfl_9_idx+"\">") ;
      }
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlnove_identificador_Internalname,GXutil.ltrim( localUtil.ntoc( ((com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem)AV5SDTNovedadTrn.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_identificador(), (byte)(11), (byte)(0), ",", "")),((edtavCtlnove_identificador_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem)AV5SDTNovedadTrn.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_identificador()), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem)AV5SDTNovedadTrn.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_identificador()), "ZZZZZZZZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlnove_identificador_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlnove_identificador_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(9),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlnove_fecharegistro_Internalname,localUtil.ttoc( ((com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem)AV5SDTNovedadTrn.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_fecharegistro(), 10, 8, 0, 3, "/", ":", " "),localUtil.format( ((com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem)AV5SDTNovedadTrn.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_fecharegistro(), "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlnove_fecharegistro_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlnove_fecharegistro_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(9),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtltnov_descripcion_Internalname,((com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem)AV5SDTNovedadTrn.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_descripcion(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtltnov_descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtltnov_descripcion_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(9),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCtlnove_valorantiguo_Visible==0) ? "display:none;" : "")+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlnove_valorantiguo_Internalname,((com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem)AV5SDTNovedadTrn.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valorantiguo(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlnove_valorantiguo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(edtavCtlnove_valorantiguo_Visible),new Integer(edtavCtlnove_valorantiguo_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(9),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCtlnove_valornuevo_Visible==0) ? "display:none;" : "")+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlnove_valornuevo_Internalname,((com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem)AV5SDTNovedadTrn.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valornuevo(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlnove_valornuevo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(edtavCtlnove_valornuevo_Visible),new Integer(edtavCtlnove_valornuevo_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(9),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCtlvalor_antiguo_Visible==0) ? "display:none;" : "")+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlvalor_antiguo_Internalname,GXutil.rtrim( ((com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem)AV5SDTNovedadTrn.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_antiguo()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlvalor_antiguo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(edtavCtlvalor_antiguo_Visible),new Integer(edtavCtlvalor_antiguo_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(9),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCtlvalor_nuevo_Visible==0) ? "display:none;" : "")+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlvalor_nuevo_Internalname,GXutil.rtrim( ((com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem)AV5SDTNovedadTrn.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_nuevo()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlvalor_nuevo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(edtavCtlvalor_nuevo_Visible),new Integer(edtavCtlvalor_nuevo_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(9),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLNOVE_IDENTIFICADOR"+"_"+sGXsfl_9_idx, getSecureSignedToken( sGXsfl_9_idx, localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem)AV5SDTNovedadTrn.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_identificador()), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLNOVE_FECHAREGISTRO"+"_"+sGXsfl_9_idx, getSecureSignedToken( sGXsfl_9_idx, localUtil.format( ((com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem)AV5SDTNovedadTrn.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_fecharegistro(), "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLTNOV_DESCRIPCION"+"_"+sGXsfl_9_idx, getSecureSignedToken( sGXsfl_9_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem)AV5SDTNovedadTrn.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_descripcion(), ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLNOVE_VALORANTIGUO"+"_"+sGXsfl_9_idx, getSecureSignedToken( sGXsfl_9_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem)AV5SDTNovedadTrn.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valorantiguo(), ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLNOVE_VALORNUEVO"+"_"+sGXsfl_9_idx, getSecureSignedToken( sGXsfl_9_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem)AV5SDTNovedadTrn.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valornuevo(), ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLVALOR_ANTIGUO"+"_"+sGXsfl_9_idx, getSecureSignedToken( sGXsfl_9_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem)AV5SDTNovedadTrn.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_antiguo(), ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLVALOR_NUEVO"+"_"+sGXsfl_9_idx, getSecureSignedToken( sGXsfl_9_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem)AV5SDTNovedadTrn.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_nuevo(), ""))));
      Grid1Container.AddRow(Grid1Row);
      nGXsfl_9_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_9_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_9_idx+1)) ;
      sGXsfl_9_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_9_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_92( ) ;
      /* End function sendrow_92 */
   }

   public void init_default_properties( )
   {
      edtavCtlnove_identificador_Internalname = "CTLNOVE_IDENTIFICADOR" ;
      edtavCtlnove_fecharegistro_Internalname = "CTLNOVE_FECHAREGISTRO" ;
      edtavCtltnov_descripcion_Internalname = "CTLTNOV_DESCRIPCION" ;
      edtavCtlnove_valorantiguo_Internalname = "CTLNOVE_VALORANTIGUO" ;
      edtavCtlnove_valornuevo_Internalname = "CTLNOVE_VALORNUEVO" ;
      edtavCtlvalor_antiguo_Internalname = "CTLVALOR_ANTIGUO" ;
      edtavCtlvalor_nuevo_Internalname = "CTLVALOR_NUEVO" ;
      divTable1_Internalname = "TABLE1" ;
      bttSalir_Internalname = "SALIR" ;
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
      edtavCtlvalor_nuevo_Jsonclick = "" ;
      edtavCtlvalor_antiguo_Jsonclick = "" ;
      edtavCtlnove_valornuevo_Jsonclick = "" ;
      edtavCtlnove_valorantiguo_Jsonclick = "" ;
      edtavCtltnov_descripcion_Jsonclick = "" ;
      edtavCtlnove_fecharegistro_Jsonclick = "" ;
      edtavCtlnove_identificador_Jsonclick = "" ;
      edtavCtlvalor_nuevo_Visible = -1 ;
      edtavCtlvalor_antiguo_Visible = -1 ;
      edtavCtlnove_valornuevo_Visible = -1 ;
      edtavCtlnove_valorantiguo_Visible = -1 ;
      edtavCtlvalor_nuevo_Enabled = -1 ;
      edtavCtlvalor_antiguo_Enabled = -1 ;
      edtavCtlnove_valornuevo_Enabled = -1 ;
      edtavCtlnove_valorantiguo_Enabled = -1 ;
      edtavCtltnov_descripcion_Enabled = -1 ;
      edtavCtlnove_fecharegistro_Enabled = -1 ;
      edtavCtlnove_identificador_Enabled = -1 ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtavCtlvalor_nuevo_Enabled = 0 ;
      edtavCtlvalor_nuevo_Visible = -1 ;
      edtavCtlvalor_antiguo_Enabled = 0 ;
      edtavCtlvalor_antiguo_Visible = -1 ;
      edtavCtlnove_valornuevo_Enabled = 0 ;
      edtavCtlnove_valornuevo_Visible = -1 ;
      edtavCtlnove_valorantiguo_Enabled = 0 ;
      edtavCtlnove_valorantiguo_Visible = -1 ;
      edtavCtltnov_descripcion_Enabled = 0 ;
      edtavCtlnove_fecharegistro_Enabled = 0 ;
      edtavCtlnove_identificador_Enabled = 0 ;
      subGrid1_Class = "WorkWith" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Novedades de la Transacción" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'AV5SDTNovedadTrn',fld:'vSDTNOVEDADTRN',grid:9,pic:'',nv:null}],oparms:[]}");
      setEventMetadata("'SALIR'","{handler:'e119U2',iparms:[{av:'AV6Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0}],oparms:[]}");
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
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV5SDTNovedadTrn = new GXBaseCollection<com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem>(com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem.class, "SDTNovedadTrn.SDTNovedadTrnItem", "ACBSENA", remoteHandle);
      GX_FocusControl = "" ;
      sPrefix = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttSalir_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXt_objcol_SdtSDTNovedadTrn_SDTNovedadTrnItem1 = new GXBaseCollection<com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem>(com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem.class, "SDTNovedadTrn.SDTNovedadTrnItem", "ACBSENA", remoteHandle);
      GXv_objcol_SdtSDTNovedadTrn_SDTNovedadTrnItem2 = new GXBaseCollection [1] ;
      AV7SDTNovedadTrnItem = new com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem(remoteHandle, context);
      AV10TNov_Nombre_Campo = "" ;
      AV11Nove_ValorAntiguo = "" ;
      AV12Nove_ValorNuevo = "" ;
      AV15TNov_Tipo = "" ;
      GXv_int3 = new long [1] ;
      GXv_char4 = new String [1] ;
      GXv_char5 = new String [1] ;
      GXv_char6 = new String [1] ;
      AV13Valor_Antiguo = "" ;
      GXv_char7 = new String [1] ;
      AV14Valor_Nuevo = "" ;
      GXv_char8 = new String [1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      ROClassString = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavCtlnove_identificador_Enabled = 0 ;
      edtavCtlnove_fecharegistro_Enabled = 0 ;
      edtavCtltnov_descripcion_Enabled = 0 ;
      edtavCtlnove_valorantiguo_Enabled = 0 ;
      edtavCtlnove_valornuevo_Enabled = 0 ;
      edtavCtlvalor_antiguo_Enabled = 0 ;
      edtavCtlvalor_nuevo_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private byte GRID1_nEOF ;
   private short nRC_GXsfl_9 ;
   private short nGXsfl_9_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV18GXV1 ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short nGXsfl_9_fel_idx=1 ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavCtlnove_valorantiguo_Visible ;
   private int edtavCtlnove_valornuevo_Visible ;
   private int edtavCtlvalor_antiguo_Visible ;
   private int edtavCtlvalor_nuevo_Visible ;
   private int edtavCtlnove_identificador_Enabled ;
   private int edtavCtlnove_fecharegistro_Enabled ;
   private int edtavCtltnov_descripcion_Enabled ;
   private int edtavCtlnove_valorantiguo_Enabled ;
   private int edtavCtlnove_valornuevo_Enabled ;
   private int edtavCtlvalor_antiguo_Enabled ;
   private int edtavCtlvalor_nuevo_Enabled ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int AV26GXV2 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long wcpOAV6Tran_Id ;
   private long AV6Tran_Id ;
   private long GRID1_nCurrentRecord ;
   private long AV9Nove_Identificador ;
   private long GXv_int3[] ;
   private long GRID1_nFirstRecordOnPage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_9_idx="0001" ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String divTable1_Internalname ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttSalir_Internalname ;
   private String bttSalir_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavCtlnove_identificador_Internalname ;
   private String edtavCtlnove_fecharegistro_Internalname ;
   private String edtavCtltnov_descripcion_Internalname ;
   private String edtavCtlnove_valorantiguo_Internalname ;
   private String edtavCtlnove_valornuevo_Internalname ;
   private String edtavCtlvalor_antiguo_Internalname ;
   private String edtavCtlvalor_nuevo_Internalname ;
   private String sGXsfl_9_fel_idx="0001" ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String AV13Valor_Antiguo ;
   private String GXv_char7[] ;
   private String AV14Valor_Nuevo ;
   private String GXv_char8[] ;
   private String ROClassString ;
   private String edtavCtlnove_identificador_Jsonclick ;
   private String edtavCtlnove_fecharegistro_Jsonclick ;
   private String edtavCtltnov_descripcion_Jsonclick ;
   private String edtavCtlnove_valorantiguo_Jsonclick ;
   private String edtavCtlnove_valornuevo_Jsonclick ;
   private String edtavCtlvalor_antiguo_Jsonclick ;
   private String edtavCtlvalor_nuevo_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_9_Refreshing=false ;
   private boolean returnInSub ;
   private boolean gx_BV9 ;
   private String AV10TNov_Nombre_Campo ;
   private String AV11Nove_ValorAntiguo ;
   private String AV12Nove_ValorNuevo ;
   private String AV15TNov_Tipo ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem> AV5SDTNovedadTrn ;
   private GXBaseCollection<com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem> GXt_objcol_SdtSDTNovedadTrn_SDTNovedadTrnItem1 ;
   private GXBaseCollection<com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem> GXv_objcol_SdtSDTNovedadTrn_SDTNovedadTrnItem2[] ;
   private com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem AV7SDTNovedadTrnItem ;
}

