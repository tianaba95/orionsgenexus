/*
               File: gxcentcos_impl
        Description: Gx Centro Costo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:21:51.31
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

public final  class gxcentcos_impl extends GXDataArea
{
   public gxcentcos_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gxcentcos_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gxcentcos_impl.class ));
   }

   public gxcentcos_impl( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavTodocentros = UIFactory.getCheckbox(this);
      chkavCtlseleccion = UIFactory.getCheckbox(this);
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
            nRC_GXsfl_51 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_51_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_51_idx = httpContext.GetNextPar( ) ;
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
            AV46Mensaje = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46Mensaje", AV46Mensaje);
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
         MasterPageObj = new com.orions2.rwdpromptmasterpage_impl (remoteHandle, context.copy());
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
      pa712( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start712( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414215137");
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
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.gxcentcos") + "?" + GXutil.URLEncode(GXutil.rtrim(AV46Mensaje))+"\">") ;
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
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Sdtcentrousuario", AV22SDTCentroUsuario);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Sdtcentrousuario", AV22SDTCentroUsuario);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_51", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_51, (byte)(4), (byte)(0), ",", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTCENTROUSUARIO", AV22SDTCentroUsuario);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTCENTROUSUARIO", AV22SDTCentroUsuario);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_ID", GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_CODIGO", A3Cent_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_DESCRIPCION", A4Cent_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "REGI_COD", GXutil.ltrim( localUtil.ntoc( A12Regi_Cod, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "REGI_DESCRIPCION", A13Regi_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "REGI_ABREV", A154Regi_Abrev);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCENT_CODIGO", AV37Cent_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCENT_DESCRIPCION", AV39Cent_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCENT_ID", GXutil.ltrim( localUtil.ntoc( AV36Cent_id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vREGI_ABREV", AV41Regi_Abrev);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vREGI_COD", GXutil.ltrim( localUtil.ntoc( AV40Regi_Cod, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vREGI_DESCRIPCION", AV38Regi_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMENSAJE", AV46Mensaje);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_CODIGOFILTERCONTAINER_Class", GXutil.rtrim( divCent_codigofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_DESCRIPCIONFILTERCONTAINER_Class", GXutil.rtrim( divCent_descripcionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_REGIONALFILTERCONTAINER_Class", GXutil.rtrim( divCent_regionalfiltercontainer_Class));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm( )
   {
      sendCloseFormHiddens( ) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", "notset");
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
         we712( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt712( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return true ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("com.orions2.gxcentcos") + "?" + GXutil.URLEncode(GXutil.rtrim(AV46Mensaje)) ;
   }

   public String getPgmname( )
   {
      return "GxCentCos" ;
   }

   public String getPgmdesc( )
   {
      return "Gx Centro Costo" ;
   }

   public void wb710( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divMain_Internalname, 1, 0, "px", 0, "px", "ContainerFluid PromptContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 col-lg-4 PromptAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divAdvancedcontainer_Internalname, 1, 0, "px", 0, "px", divAdvancedcontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divCent_regionalfiltercontainer_Internalname, 1, 0, "px", 0, "px", divCent_regionalfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblregionfilter_Internalname, "Regional", "", "", lblLblregionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e11711_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_GxCentCos.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCregi_descripcion_Internalname, "Descripción Regional", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_51_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCregi_descripcion_Internalname, AV19cRegi_Descripcion, GXutil.rtrim( localUtil.format( AV19cRegi_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCregi_descripcion_Jsonclick, 0, "Attribute", "", "", "", edtavCregi_descripcion_Visible, edtavCregi_descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GxCentCos.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divCent_codigofiltercontainer_Internalname, 1, 0, "px", 0, "px", divCent_codigofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblcent_codigofilter_Internalname, "Codigo C.C.", "", "", lblLblcent_codigofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e12711_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_GxCentCos.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCcent_codigo_Internalname, "Código del Centro de Costo", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_51_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCcent_codigo_Internalname, AV6cCent_Codigo, GXutil.rtrim( localUtil.format( AV6cCent_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcent_codigo_Jsonclick, 0, "Attribute", "", "", "", edtavCcent_codigo_Visible, edtavCcent_codigo_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GxCentCos.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divCent_descripcionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divCent_descripcionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblcent_descripcionfilter_Internalname, "Descripción  C.C.", "", "", lblLblcent_descripcionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e13711_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_GxCentCos.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCcent_descripcion_Internalname, "Descripción Centro de Costo", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_51_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCcent_descripcion_Internalname, AV7cCent_Descripcion, GXutil.rtrim( localUtil.format( AV7cCent_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcent_descripcion_Jsonclick, 0, "Attribute", "", "", "", edtavCcent_descripcion_Visible, edtavCcent_descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GxCentCos.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-lg-8 WWGridCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divGridtable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-sm hidden-md hidden-lg ToggleCell", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         ClassString = bttBtntoggle_Class ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 51, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e14711_client"+"'", TempTags, "", 2, "HLP_GxCentCos.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable2_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, chkavTodocentros.getInternalname(), "Seleccionar todos", "col-sm-3 AttributeLabel", 1, true);
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_51_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_checkbox_ctrl( httpContext, chkavTodocentros.getInternalname(), GXutil.booltostr( AV45TodoCentros), "", "Seleccionar todos", 1, chkavTodocentros.getEnabled(), "true", "", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(48, this, 'true', 'false');gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"51\">") ;
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
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Regional") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Identificador Centro de Costo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Código C.C.") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción C.C.") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Código de la Regional") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Abreviatura Regional") ;
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
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlregi_descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlcent_id_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlcent_codigo_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlcent_descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlregi_cod_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlregi_abrev_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 51 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_51 = (short)(nGXsfl_51_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Grid1Container.AddObjectProperty("GRID1_nEOF", GRID1_nEOF);
            Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
            AV49GXV1 = nGXsfl_51_idx ;
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-md-5", "Center", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable1_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "Center", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttEnter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 51, 2, 0)+","+"null"+");", "Confirmar", bttEnter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GxCentCos.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "Center", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 51, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GxCentCos.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start712( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Gx Centro Costo", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup710( ) ;
   }

   public void ws712( )
   {
      start712( ) ;
      evt712( ) ;
   }

   public void evt712( )
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
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ! wbErr )
                           {
                              Rfr0gs = false ;
                              if ( ! Rfr0gs )
                              {
                                 /* Execute user event: Enter */
                                 e15712 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "VCREGI_DESCRIPCION.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e16712 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCCENT_CODIGO.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e17712 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCCENT_DESCRIPCION.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e18712 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VTODOCENTROS.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e19712 ();
                           /* No code required for Cancel button. It is implemented as the Reset button. */
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) )
                        {
                           nGXsfl_51_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_51_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_51_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_512( ) ;
                           AV49GXV1 = (short)(nGXsfl_51_idx+GRID1_nFirstRecordOnPage) ;
                           if ( ( AV22SDTCentroUsuario.size() >= AV49GXV1 ) && ( AV49GXV1 > 0 ) )
                           {
                              AV22SDTCentroUsuario.currentItem( ((com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem)AV22SDTCentroUsuario.elementAt(-1+AV49GXV1)) );
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
                                 e20712 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e21712 ();
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

   public void we712( )
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

   public void pa712( )
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
         chkavTodocentros.setName( "vTODOCENTROS" );
         chkavTodocentros.setWebtags( "" );
         chkavTodocentros.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavTodocentros.getInternalname(), "TitleCaption", chkavTodocentros.getCaption(), true);
         chkavTodocentros.setCheckedValue( "false" );
         GXCCtl = "CTLSELECCION_" + sGXsfl_51_idx ;
         chkavCtlseleccion.setName( GXCCtl );
         chkavCtlseleccion.setWebtags( "" );
         chkavCtlseleccion.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavCtlseleccion.getInternalname(), "TitleCaption", chkavCtlseleccion.getCaption(), !bGXsfl_51_Refreshing);
         chkavCtlseleccion.setCheckedValue( "false" );
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
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
      subsflControlProps_512( ) ;
      while ( nGXsfl_51_idx <= nRC_GXsfl_51 )
      {
         sendrow_512( ) ;
         nGXsfl_51_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_51_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_51_idx+1)) ;
         sGXsfl_51_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_51_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_512( ) ;
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
      rf712( ) ;
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
      rf712( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavCtlregi_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlregi_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlregi_descripcion_Enabled, 5, 0)), !bGXsfl_51_Refreshing);
      edtavCtlcent_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlcent_id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlcent_id_Enabled, 5, 0)), !bGXsfl_51_Refreshing);
      edtavCtlcent_codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlcent_codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlcent_codigo_Enabled, 5, 0)), !bGXsfl_51_Refreshing);
      edtavCtlcent_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlcent_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlcent_descripcion_Enabled, 5, 0)), !bGXsfl_51_Refreshing);
      edtavCtlregi_cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlregi_cod_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlregi_cod_Enabled, 5, 0)), !bGXsfl_51_Refreshing);
      edtavCtlregi_abrev_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlregi_abrev_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlregi_abrev_Enabled, 5, 0)), !bGXsfl_51_Refreshing);
   }

   public void rf712( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(51) ;
      nGXsfl_51_idx = (short)(1) ;
      sGXsfl_51_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_51_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_512( ) ;
      bGXsfl_51_Refreshing = true ;
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
         subsflControlProps_512( ) ;
         e21712 ();
         if ( ( GRID1_nCurrentRecord > 0 ) && ( GRID1_nGridOutOfScope == 0 ) && ( nGXsfl_51_idx == 1 ) )
         {
            GRID1_nCurrentRecord = 0 ;
            GRID1_nGridOutOfScope = 1 ;
            subgrid1_firstpage( ) ;
            e21712 ();
         }
         wbEnd = (short)(51) ;
         wb710( ) ;
      }
      bGXsfl_51_Refreshing = true ;
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
      return AV22SDTCentroUsuario.size() ;
   }

   public int subgrid1_recordsperpage( )
   {
      if ( subGrid1_Rows > 0 )
      {
         return subGrid1_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
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

   public void strup710( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      edtavCtlregi_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlregi_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlregi_descripcion_Enabled, 5, 0)), !bGXsfl_51_Refreshing);
      edtavCtlcent_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlcent_id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlcent_id_Enabled, 5, 0)), !bGXsfl_51_Refreshing);
      edtavCtlcent_codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlcent_codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlcent_codigo_Enabled, 5, 0)), !bGXsfl_51_Refreshing);
      edtavCtlcent_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlcent_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlcent_descripcion_Enabled, 5, 0)), !bGXsfl_51_Refreshing);
      edtavCtlregi_cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlregi_cod_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlregi_cod_Enabled, 5, 0)), !bGXsfl_51_Refreshing);
      edtavCtlregi_abrev_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlregi_abrev_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlregi_abrev_Enabled, 5, 0)), !bGXsfl_51_Refreshing);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e20712 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Sdtcentrousuario"), AV22SDTCentroUsuario);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vSDTCENTROUSUARIO"), AV22SDTCentroUsuario);
         /* Read variables values. */
         AV19cRegi_Descripcion = httpContext.cgiGet( edtavCregi_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19cRegi_Descripcion", AV19cRegi_Descripcion);
         AV6cCent_Codigo = httpContext.cgiGet( edtavCcent_codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cCent_Codigo", AV6cCent_Codigo);
         AV7cCent_Descripcion = httpContext.cgiGet( edtavCcent_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cCent_Descripcion", AV7cCent_Descripcion);
         AV45TodoCentros = GXutil.strtobool( httpContext.cgiGet( chkavTodocentros.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45TodoCentros", AV45TodoCentros);
         /* Read saved values. */
         nRC_GXsfl_51 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_51"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         subGrid1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), ",", ".")) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
         nRC_GXsfl_51 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_51"), ",", ".")) ;
         nGXsfl_51_fel_idx = (short)(0) ;
         while ( nGXsfl_51_fel_idx < nRC_GXsfl_51 )
         {
            nGXsfl_51_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_51_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_51_fel_idx+1)) ;
            sGXsfl_51_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_51_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_512( ) ;
            AV49GXV1 = (short)(nGXsfl_51_fel_idx+GRID1_nFirstRecordOnPage) ;
            if ( ( AV22SDTCentroUsuario.size() >= AV49GXV1 ) && ( AV49GXV1 > 0 ) )
            {
               AV22SDTCentroUsuario.currentItem( ((com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem)AV22SDTCentroUsuario.elementAt(-1+AV49GXV1)) );
            }
         }
         if ( nGXsfl_51_fel_idx == 0 )
         {
            nGXsfl_51_idx = (short)(1) ;
            sGXsfl_51_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_51_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_512( ) ;
         }
         nGXsfl_51_fel_idx = (short)(1) ;
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
      e20712 ();
      if (returnInSub) return;
   }

   public void e20712( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "Centro de Costo", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV5ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
      subGrid1_Rows = 7 ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      /* Execute user subroutine: 'LOAD' */
      S112 ();
      if (returnInSub) return;
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e15712 ();
      if (returnInSub) return;
   }

   public void e15712( )
   {
      AV49GXV1 = (short)(nGXsfl_51_idx+GRID1_nFirstRecordOnPage) ;
      if ( AV22SDTCentroUsuario.size() >= AV49GXV1 )
      {
         AV22SDTCentroUsuario.currentItem( ((com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem)AV22SDTCentroUsuario.elementAt(-1+AV49GXV1)) );
      }
      /* Enter Routine */
      AV42Index = (short)(0) ;
      AV43SDTUsuario = AV22SDTCentroUsuario.toxml(false, true, "SDTCentroUsuario", "ACBSENA") ;
      AV57GXV2 = 1 ;
      while ( AV57GXV2 <= AV22SDTCentroUsuario.size() )
      {
         AV23SDTCentroUsuarioItem = (com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem)((com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem)AV22SDTCentroUsuario.elementAt(-1+AV57GXV2));
         if ( AV23SDTCentroUsuarioItem.getgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Seleccion() )
         {
            AV42Index = (short)(AV42Index+1) ;
         }
         AV57GXV2 = (int)(AV57GXV2+1) ;
      }
      AV46Mensaje = "Se seleccionaron un total de " + GXutil.str( AV42Index, 4, 0) + " Centros de costo" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Mensaje", AV46Mensaje);
      AV44websession.setValue("UsuarioCentro", AV22SDTCentroUsuario.toxml(false, true, "SDTCentroUsuario", "ACBSENA"));
      httpContext.setWebReturnParms(new Object[] {AV46Mensaje});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'LOAD' Routine */
      AV22SDTCentroUsuario.clear();
      gx_BV51 = true ;
      /* Using cursor H00712 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2Regi_Id = H00712_A2Regi_Id[0] ;
         A1Cent_Id = H00712_A1Cent_Id[0] ;
         A3Cent_Codigo = H00712_A3Cent_Codigo[0] ;
         A4Cent_Descripcion = H00712_A4Cent_Descripcion[0] ;
         A12Regi_Cod = H00712_A12Regi_Cod[0] ;
         A13Regi_Descripcion = H00712_A13Regi_Descripcion[0] ;
         A154Regi_Abrev = H00712_A154Regi_Abrev[0] ;
         A12Regi_Cod = H00712_A12Regi_Cod[0] ;
         A13Regi_Descripcion = H00712_A13Regi_Descripcion[0] ;
         A154Regi_Abrev = H00712_A154Regi_Abrev[0] ;
         AV36Cent_id = A1Cent_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36Cent_id", GXutil.ltrim( GXutil.str( AV36Cent_id, 11, 0)));
         AV37Cent_Codigo = A3Cent_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37Cent_Codigo", AV37Cent_Codigo);
         AV39Cent_Descripcion = A4Cent_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39Cent_Descripcion", AV39Cent_Descripcion);
         AV40Regi_Cod = A12Regi_Cod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Regi_Cod", GXutil.ltrim( GXutil.str( AV40Regi_Cod, 4, 0)));
         AV38Regi_Descripcion = A13Regi_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38Regi_Descripcion", AV38Regi_Descripcion);
         AV41Regi_Abrev = A154Regi_Abrev ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41Regi_Abrev", AV41Regi_Abrev);
         if ( (GXutil.strcmp("", AV6cCent_Codigo)==0) && (GXutil.strcmp("", AV7cCent_Descripcion)==0) && (GXutil.strcmp("", AV19cRegi_Descripcion)==0) )
         {
            /* Execute user subroutine: 'CARGARSDT' */
            S123 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
         }
         else if ( ! (GXutil.strcmp("", AV6cCent_Codigo)==0) && (GXutil.strcmp("", AV7cCent_Descripcion)==0) && (GXutil.strcmp("", AV19cRegi_Descripcion)==0) )
         {
            if ( GXutil.strcmp(A3Cent_Codigo, AV6cCent_Codigo) == 0 )
            {
               /* Execute user subroutine: 'CARGARSDT' */
               S123 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV6cCent_Codigo)==0) && ! (GXutil.strcmp("", AV7cCent_Descripcion)==0) && (GXutil.strcmp("", AV19cRegi_Descripcion)==0) )
         {
            if ( GXutil.like( GXutil.upper( A4Cent_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV7cCent_Descripcion), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGARSDT' */
               S123 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV6cCent_Codigo)==0) && (GXutil.strcmp("", AV7cCent_Descripcion)==0) && ! (GXutil.strcmp("", AV19cRegi_Descripcion)==0) )
         {
            if ( GXutil.like( GXutil.upper( A13Regi_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV19cRegi_Descripcion), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGARSDT' */
               S123 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( ! (GXutil.strcmp("", AV6cCent_Codigo)==0) && ! (GXutil.strcmp("", AV7cCent_Descripcion)==0) && (GXutil.strcmp("", AV19cRegi_Descripcion)==0) )
         {
            if ( ( GXutil.strcmp(A3Cent_Codigo, AV6cCent_Codigo) == 0 ) && GXutil.like( GXutil.upper( A4Cent_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV7cCent_Descripcion), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGARSDT' */
               S123 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV6cCent_Codigo)==0) && ! (GXutil.strcmp("", AV7cCent_Descripcion)==0) && ! (GXutil.strcmp("", AV19cRegi_Descripcion)==0) )
         {
            if ( GXutil.like( GXutil.upper( A4Cent_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV7cCent_Descripcion), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( A13Regi_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV19cRegi_Descripcion), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGARSDT' */
               S123 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( ! (GXutil.strcmp("", AV6cCent_Codigo)==0) && (GXutil.strcmp("", AV7cCent_Descripcion)==0) && ! (GXutil.strcmp("", AV19cRegi_Descripcion)==0) )
         {
            if ( ( GXutil.strcmp(A3Cent_Codigo, AV6cCent_Codigo) == 0 ) && GXutil.like( GXutil.upper( A13Regi_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV19cRegi_Descripcion), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGARSDT' */
               S123 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( ! (GXutil.strcmp("", AV6cCent_Codigo)==0) && ! (GXutil.strcmp("", AV7cCent_Descripcion)==0) && ! (GXutil.strcmp("", AV19cRegi_Descripcion)==0) )
         {
            if ( ( GXutil.strcmp(A3Cent_Codigo, AV6cCent_Codigo) == 0 ) && GXutil.like( GXutil.upper( A4Cent_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV7cCent_Descripcion), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( A13Regi_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV19cRegi_Descripcion), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGARSDT' */
               S123 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void e16712( )
   {
      AV49GXV1 = (short)(nGXsfl_51_idx+GRID1_nFirstRecordOnPage) ;
      if ( AV22SDTCentroUsuario.size() >= AV49GXV1 )
      {
         AV22SDTCentroUsuario.currentItem( ((com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem)AV22SDTCentroUsuario.elementAt(-1+AV49GXV1)) );
      }
      /* Cregi_descripcion_Isvalid Routine */
      /* Execute user subroutine: 'LOAD' */
      S112 ();
      if (returnInSub) return;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22SDTCentroUsuario", AV22SDTCentroUsuario);
      nGXsfl_51_bak_idx = nGXsfl_51_idx ;
      gxgrgrid1_refresh( subGrid1_Rows) ;
      nGXsfl_51_idx = nGXsfl_51_bak_idx ;
      sGXsfl_51_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_51_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_512( ) ;
   }

   public void e17712( )
   {
      AV49GXV1 = (short)(nGXsfl_51_idx+GRID1_nFirstRecordOnPage) ;
      if ( AV22SDTCentroUsuario.size() >= AV49GXV1 )
      {
         AV22SDTCentroUsuario.currentItem( ((com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem)AV22SDTCentroUsuario.elementAt(-1+AV49GXV1)) );
      }
      /* Ccent_codigo_Isvalid Routine */
      /* Execute user subroutine: 'LOAD' */
      S112 ();
      if (returnInSub) return;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22SDTCentroUsuario", AV22SDTCentroUsuario);
      nGXsfl_51_bak_idx = nGXsfl_51_idx ;
      gxgrgrid1_refresh( subGrid1_Rows) ;
      nGXsfl_51_idx = nGXsfl_51_bak_idx ;
      sGXsfl_51_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_51_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_512( ) ;
   }

   public void e18712( )
   {
      AV49GXV1 = (short)(nGXsfl_51_idx+GRID1_nFirstRecordOnPage) ;
      if ( AV22SDTCentroUsuario.size() >= AV49GXV1 )
      {
         AV22SDTCentroUsuario.currentItem( ((com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem)AV22SDTCentroUsuario.elementAt(-1+AV49GXV1)) );
      }
      /* Ccent_descripcion_Isvalid Routine */
      /* Execute user subroutine: 'LOAD' */
      S112 ();
      if (returnInSub) return;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22SDTCentroUsuario", AV22SDTCentroUsuario);
      nGXsfl_51_bak_idx = nGXsfl_51_idx ;
      gxgrgrid1_refresh( subGrid1_Rows) ;
      nGXsfl_51_idx = nGXsfl_51_bak_idx ;
      sGXsfl_51_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_51_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_512( ) ;
   }

   public void S123( )
   {
      /* 'CARGARSDT' Routine */
      AV23SDTCentroUsuarioItem = (com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem)new com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem(remoteHandle, context);
      AV23SDTCentroUsuarioItem.setgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Cent_codigo( AV37Cent_Codigo );
      AV23SDTCentroUsuarioItem.setgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Cent_descripcion( AV39Cent_Descripcion );
      AV23SDTCentroUsuarioItem.setgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Cent_id( AV36Cent_id );
      AV23SDTCentroUsuarioItem.setgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Regi_abrev( AV41Regi_Abrev );
      AV23SDTCentroUsuarioItem.setgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Regi_cod( AV40Regi_Cod );
      AV23SDTCentroUsuarioItem.setgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Regi_descripcion( AV38Regi_Descripcion );
      if ( AV45TodoCentros )
      {
         AV23SDTCentroUsuarioItem.setgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Seleccion( true );
      }
      else
      {
         AV23SDTCentroUsuarioItem.setgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Seleccion( false );
      }
      AV22SDTCentroUsuario.add(AV23SDTCentroUsuarioItem, 0);
      gx_BV51 = true ;
   }

   public void e19712( )
   {
      AV49GXV1 = (short)(nGXsfl_51_idx+GRID1_nFirstRecordOnPage) ;
      if ( AV22SDTCentroUsuario.size() >= AV49GXV1 )
      {
         AV22SDTCentroUsuario.currentItem( ((com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem)AV22SDTCentroUsuario.elementAt(-1+AV49GXV1)) );
      }
      /* Todocentros_Isvalid Routine */
      /* Execute user subroutine: 'LOAD' */
      S112 ();
      if (returnInSub) return;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22SDTCentroUsuario", AV22SDTCentroUsuario);
      nGXsfl_51_bak_idx = nGXsfl_51_idx ;
      gxgrgrid1_refresh( subGrid1_Rows) ;
      nGXsfl_51_idx = nGXsfl_51_bak_idx ;
      sGXsfl_51_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_51_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_512( ) ;
   }

   private void e21712( )
   {
      /* Grid1_Load Routine */
      AV49GXV1 = (short)(1) ;
      while ( AV49GXV1 <= AV22SDTCentroUsuario.size() )
      {
         AV22SDTCentroUsuario.currentItem( ((com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem)AV22SDTCentroUsuario.elementAt(-1+AV49GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(51) ;
         }
         if ( ( subGrid1_Islastpage == 1 ) || ( subGrid1_Rows == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
         {
            sendrow_512( ) ;
            GRID1_nEOF = (byte)(0) ;
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID1_nCurrentRecord + 1 >= subgrid1_recordcount( ) )
            {
               GRID1_nEOF = (byte)(1) ;
               com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_51_Refreshing )
         {
            httpContext.doAjaxLoad(51, Grid1Row);
         }
         AV49GXV1 = (short)(AV49GXV1+1) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV46Mensaje = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Mensaje", AV46Mensaje);
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
      pa712( ) ;
      ws712( ) ;
      we712( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414215247");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxcentcos.js", "?201861414215247");
      /* End function include_jscripts */
   }

   public void subsflControlProps_512( )
   {
      chkavCtlseleccion.setInternalname( "CTLSELECCION_"+sGXsfl_51_idx );
      edtavCtlregi_descripcion_Internalname = "CTLREGI_DESCRIPCION_"+sGXsfl_51_idx ;
      edtavCtlcent_id_Internalname = "CTLCENT_ID_"+sGXsfl_51_idx ;
      edtavCtlcent_codigo_Internalname = "CTLCENT_CODIGO_"+sGXsfl_51_idx ;
      edtavCtlcent_descripcion_Internalname = "CTLCENT_DESCRIPCION_"+sGXsfl_51_idx ;
      edtavCtlregi_cod_Internalname = "CTLREGI_COD_"+sGXsfl_51_idx ;
      edtavCtlregi_abrev_Internalname = "CTLREGI_ABREV_"+sGXsfl_51_idx ;
   }

   public void subsflControlProps_fel_512( )
   {
      chkavCtlseleccion.setInternalname( "CTLSELECCION_"+sGXsfl_51_fel_idx );
      edtavCtlregi_descripcion_Internalname = "CTLREGI_DESCRIPCION_"+sGXsfl_51_fel_idx ;
      edtavCtlcent_id_Internalname = "CTLCENT_ID_"+sGXsfl_51_fel_idx ;
      edtavCtlcent_codigo_Internalname = "CTLCENT_CODIGO_"+sGXsfl_51_fel_idx ;
      edtavCtlcent_descripcion_Internalname = "CTLCENT_DESCRIPCION_"+sGXsfl_51_fel_idx ;
      edtavCtlregi_cod_Internalname = "CTLREGI_COD_"+sGXsfl_51_fel_idx ;
      edtavCtlregi_abrev_Internalname = "CTLREGI_ABREV_"+sGXsfl_51_fel_idx ;
   }

   public void sendrow_512( )
   {
      subsflControlProps_512( ) ;
      wb710( ) ;
      if ( ( subGrid1_Rows * 1 == 0 ) || ( nGXsfl_51_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_51_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_51_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavCtlseleccion.getEnabled()!=0)&&(chkavCtlseleccion.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 52,'',false,'"+sGXsfl_51_idx+"',51)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavCtlseleccion.getInternalname(),GXutil.booltostr( ((com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem)AV22SDTCentroUsuario.elementAt(-1+AV49GXV1)).getgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Seleccion()),"","",new Integer(-1),new Integer(1),"true","",StyleString,ClassString,"WWColumn",TempTags+((chkavCtlseleccion.getEnabled()!=0)&&(chkavCtlseleccion.getVisible()!=0) ? " onclick=\"gx.fn.checkboxClick(52, this, 'true', 'false');gx.evt.onchange(this);\" " : " ")+((chkavCtlseleccion.getEnabled()!=0)&&(chkavCtlseleccion.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,52);\"" : " ")});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlregi_descripcion_Internalname,((com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem)AV22SDTCentroUsuario.elementAt(-1+AV49GXV1)).getgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Regi_descripcion(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlregi_descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlregi_descripcion_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(51),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlcent_id_Internalname,GXutil.ltrim( localUtil.ntoc( ((com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem)AV22SDTCentroUsuario.elementAt(-1+AV49GXV1)).getgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Cent_id(), (byte)(11), (byte)(0), ",", "")),((edtavCtlcent_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem)AV22SDTCentroUsuario.elementAt(-1+AV49GXV1)).getgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Cent_id()), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem)AV22SDTCentroUsuario.elementAt(-1+AV49GXV1)).getgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Cent_id()), "ZZZZZZZZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlcent_id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(0),new Integer(edtavCtlcent_id_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(51),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlcent_codigo_Internalname,((com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem)AV22SDTCentroUsuario.elementAt(-1+AV49GXV1)).getgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Cent_codigo(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlcent_codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlcent_codigo_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(16),new Integer(0),new Integer(0),new Integer(51),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlcent_descripcion_Internalname,((com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem)AV22SDTCentroUsuario.elementAt(-1+AV49GXV1)).getgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Cent_descripcion(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlcent_descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlcent_descripcion_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(51),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlregi_cod_Internalname,GXutil.ltrim( localUtil.ntoc( ((com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem)AV22SDTCentroUsuario.elementAt(-1+AV49GXV1)).getgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Regi_cod(), (byte)(4), (byte)(0), ",", "")),((edtavCtlregi_cod_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem)AV22SDTCentroUsuario.elementAt(-1+AV49GXV1)).getgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Regi_cod()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem)AV22SDTCentroUsuario.elementAt(-1+AV49GXV1)).getgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Regi_cod()), "ZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlregi_cod_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(0),new Integer(edtavCtlregi_cod_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(51),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlregi_abrev_Internalname,((com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem)AV22SDTCentroUsuario.elementAt(-1+AV49GXV1)).getgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Regi_abrev(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlregi_abrev_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(0),new Integer(edtavCtlregi_abrev_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(15),new Integer(0),new Integer(0),new Integer(51),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLREGI_DESCRIPCION"+"_"+sGXsfl_51_idx, getSecureSignedToken( sGXsfl_51_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem)AV22SDTCentroUsuario.elementAt(-1+AV49GXV1)).getgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Regi_descripcion(), ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLCENT_ID"+"_"+sGXsfl_51_idx, getSecureSignedToken( sGXsfl_51_idx, localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem)AV22SDTCentroUsuario.elementAt(-1+AV49GXV1)).getgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Cent_id()), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLCENT_CODIGO"+"_"+sGXsfl_51_idx, getSecureSignedToken( sGXsfl_51_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem)AV22SDTCentroUsuario.elementAt(-1+AV49GXV1)).getgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Cent_codigo(), ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLCENT_DESCRIPCION"+"_"+sGXsfl_51_idx, getSecureSignedToken( sGXsfl_51_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem)AV22SDTCentroUsuario.elementAt(-1+AV49GXV1)).getgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Cent_descripcion(), ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLREGI_COD"+"_"+sGXsfl_51_idx, getSecureSignedToken( sGXsfl_51_idx, localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem)AV22SDTCentroUsuario.elementAt(-1+AV49GXV1)).getgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Regi_cod()), "ZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLREGI_ABREV"+"_"+sGXsfl_51_idx, getSecureSignedToken( sGXsfl_51_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem)AV22SDTCentroUsuario.elementAt(-1+AV49GXV1)).getgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Regi_abrev(), ""))));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_51_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_51_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_51_idx+1)) ;
         sGXsfl_51_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_51_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_512( ) ;
      }
      /* End function sendrow_512 */
   }

   public void init_default_properties( )
   {
      lblLblregionfilter_Internalname = "LBLREGIONFILTER" ;
      edtavCregi_descripcion_Internalname = "vCREGI_DESCRIPCION" ;
      divCent_regionalfiltercontainer_Internalname = "CENT_REGIONALFILTERCONTAINER" ;
      lblLblcent_codigofilter_Internalname = "LBLCENT_CODIGOFILTER" ;
      edtavCcent_codigo_Internalname = "vCCENT_CODIGO" ;
      divCent_codigofiltercontainer_Internalname = "CENT_CODIGOFILTERCONTAINER" ;
      lblLblcent_descripcionfilter_Internalname = "LBLCENT_DESCRIPCIONFILTER" ;
      edtavCcent_descripcion_Internalname = "vCCENT_DESCRIPCION" ;
      divCent_descripcionfiltercontainer_Internalname = "CENT_DESCRIPCIONFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      chkavTodocentros.setInternalname( "vTODOCENTROS" );
      divTable2_Internalname = "TABLE2" ;
      chkavCtlseleccion.setInternalname( "CTLSELECCION" );
      edtavCtlregi_descripcion_Internalname = "CTLREGI_DESCRIPCION" ;
      edtavCtlcent_id_Internalname = "CTLCENT_ID" ;
      edtavCtlcent_codigo_Internalname = "CTLCENT_CODIGO" ;
      edtavCtlcent_descripcion_Internalname = "CTLCENT_DESCRIPCION" ;
      edtavCtlregi_cod_Internalname = "CTLREGI_COD" ;
      edtavCtlregi_abrev_Internalname = "CTLREGI_ABREV" ;
      bttEnter_Internalname = "ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      divTable1_Internalname = "TABLE1" ;
      divGridtable_Internalname = "GRIDTABLE" ;
      divMain_Internalname = "MAIN" ;
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
      edtavCtlregi_abrev_Jsonclick = "" ;
      edtavCtlregi_cod_Jsonclick = "" ;
      edtavCtlcent_descripcion_Jsonclick = "" ;
      edtavCtlcent_codigo_Jsonclick = "" ;
      edtavCtlcent_id_Jsonclick = "" ;
      edtavCtlregi_descripcion_Jsonclick = "" ;
      chkavCtlseleccion.setVisible( -1 );
      chkavCtlseleccion.setEnabled( 1 );
      edtavCtlregi_abrev_Enabled = -1 ;
      edtavCtlregi_cod_Enabled = -1 ;
      edtavCtlcent_descripcion_Enabled = -1 ;
      edtavCtlcent_codigo_Enabled = -1 ;
      edtavCtlcent_id_Enabled = -1 ;
      edtavCtlregi_descripcion_Enabled = -1 ;
      chkavCtlseleccion.setCaption( "" );
      chkavTodocentros.setCaption( "Seleccionar todos" );
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtavCtlregi_abrev_Enabled = 0 ;
      edtavCtlregi_cod_Enabled = 0 ;
      edtavCtlcent_descripcion_Enabled = 0 ;
      edtavCtlcent_codigo_Enabled = 0 ;
      edtavCtlcent_id_Enabled = 0 ;
      edtavCtlregi_descripcion_Enabled = 0 ;
      subGrid1_Class = "WorkWith" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      chkavTodocentros.setEnabled( 1 );
      edtavCcent_descripcion_Jsonclick = "" ;
      edtavCcent_descripcion_Enabled = 1 ;
      edtavCcent_descripcion_Visible = 1 ;
      edtavCcent_codigo_Jsonclick = "" ;
      edtavCcent_codigo_Enabled = 1 ;
      edtavCcent_codigo_Visible = 1 ;
      edtavCregi_descripcion_Jsonclick = "" ;
      edtavCregi_descripcion_Enabled = 1 ;
      edtavCregi_descripcion_Visible = 1 ;
      divCent_regionalfiltercontainer_Class = "AdvancedContainerItem" ;
      divCent_descripcionfiltercontainer_Class = "AdvancedContainerItem" ;
      divCent_codigofiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Gx Centro Costo" );
      subGrid1_Rows = 0 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'AV22SDTCentroUsuario',fld:'vSDTCENTROUSUARIO',grid:51,pic:'',nv:null},{av:'subGrid1_Rows',nv:0}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e14711',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLCENT_CODIGOFILTER.CLICK","{handler:'e12711',iparms:[{av:'divCent_codigofiltercontainer_Class',ctrl:'CENT_CODIGOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCent_codigofiltercontainer_Class',ctrl:'CENT_CODIGOFILTERCONTAINER',prop:'Class'},{av:'edtavCcent_codigo_Visible',ctrl:'vCCENT_CODIGO',prop:'Visible'}]}");
      setEventMetadata("LBLCENT_DESCRIPCIONFILTER.CLICK","{handler:'e13711',iparms:[{av:'divCent_descripcionfiltercontainer_Class',ctrl:'CENT_DESCRIPCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCent_descripcionfiltercontainer_Class',ctrl:'CENT_DESCRIPCIONFILTERCONTAINER',prop:'Class'},{av:'edtavCcent_descripcion_Visible',ctrl:'vCCENT_DESCRIPCION',prop:'Visible'}]}");
      setEventMetadata("LBLREGIONFILTER.CLICK","{handler:'e11711',iparms:[{av:'divCent_regionalfiltercontainer_Class',ctrl:'CENT_REGIONALFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCent_regionalfiltercontainer_Class',ctrl:'CENT_REGIONALFILTERCONTAINER',prop:'Class'},{av:'edtavCregi_descripcion_Visible',ctrl:'vCREGI_DESCRIPCION',prop:'Visible'}]}");
      setEventMetadata("ENTER","{handler:'e15712',iparms:[{av:'AV22SDTCentroUsuario',fld:'vSDTCENTROUSUARIO',grid:51,pic:'',nv:null}],oparms:[{av:'AV46Mensaje',fld:'vMENSAJE',pic:'',nv:''}]}");
      setEventMetadata("VCREGI_DESCRIPCION.ISVALID","{handler:'e16712',iparms:[{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A3Cent_Codigo',fld:'CENT_CODIGO',pic:'',nv:''},{av:'A4Cent_Descripcion',fld:'CENT_DESCRIPCION',pic:'',nv:''},{av:'A12Regi_Cod',fld:'REGI_COD',pic:'ZZZ9',nv:0},{av:'A13Regi_Descripcion',fld:'REGI_DESCRIPCION',pic:'',nv:''},{av:'A154Regi_Abrev',fld:'REGI_ABREV',pic:'',nv:''},{av:'AV19cRegi_Descripcion',fld:'vCREGI_DESCRIPCION',pic:'',nv:''},{av:'AV7cCent_Descripcion',fld:'vCCENT_DESCRIPCION',pic:'',nv:''},{av:'AV6cCent_Codigo',fld:'vCCENT_CODIGO',pic:'',nv:''},{av:'AV37Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''},{av:'AV39Cent_Descripcion',fld:'vCENT_DESCRIPCION',pic:'',nv:''},{av:'AV36Cent_id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV41Regi_Abrev',fld:'vREGI_ABREV',pic:'',nv:''},{av:'AV40Regi_Cod',fld:'vREGI_COD',pic:'ZZZ9',nv:0},{av:'AV38Regi_Descripcion',fld:'vREGI_DESCRIPCION',pic:'',nv:''},{av:'AV45TodoCentros',fld:'vTODOCENTROS',pic:'',nv:false},{av:'AV22SDTCentroUsuario',fld:'vSDTCENTROUSUARIO',grid:51,pic:'',nv:null},{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0}],oparms:[{av:'AV22SDTCentroUsuario',fld:'vSDTCENTROUSUARIO',grid:51,pic:'',nv:null},{av:'AV36Cent_id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV37Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''},{av:'AV39Cent_Descripcion',fld:'vCENT_DESCRIPCION',pic:'',nv:''},{av:'AV40Regi_Cod',fld:'vREGI_COD',pic:'ZZZ9',nv:0},{av:'AV38Regi_Descripcion',fld:'vREGI_DESCRIPCION',pic:'',nv:''},{av:'AV41Regi_Abrev',fld:'vREGI_ABREV',pic:'',nv:''}]}");
      setEventMetadata("VCCENT_CODIGO.ISVALID","{handler:'e17712',iparms:[{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A3Cent_Codigo',fld:'CENT_CODIGO',pic:'',nv:''},{av:'A4Cent_Descripcion',fld:'CENT_DESCRIPCION',pic:'',nv:''},{av:'A12Regi_Cod',fld:'REGI_COD',pic:'ZZZ9',nv:0},{av:'A13Regi_Descripcion',fld:'REGI_DESCRIPCION',pic:'',nv:''},{av:'A154Regi_Abrev',fld:'REGI_ABREV',pic:'',nv:''},{av:'AV19cRegi_Descripcion',fld:'vCREGI_DESCRIPCION',pic:'',nv:''},{av:'AV7cCent_Descripcion',fld:'vCCENT_DESCRIPCION',pic:'',nv:''},{av:'AV6cCent_Codigo',fld:'vCCENT_CODIGO',pic:'',nv:''},{av:'AV37Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''},{av:'AV39Cent_Descripcion',fld:'vCENT_DESCRIPCION',pic:'',nv:''},{av:'AV36Cent_id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV41Regi_Abrev',fld:'vREGI_ABREV',pic:'',nv:''},{av:'AV40Regi_Cod',fld:'vREGI_COD',pic:'ZZZ9',nv:0},{av:'AV38Regi_Descripcion',fld:'vREGI_DESCRIPCION',pic:'',nv:''},{av:'AV45TodoCentros',fld:'vTODOCENTROS',pic:'',nv:false},{av:'AV22SDTCentroUsuario',fld:'vSDTCENTROUSUARIO',grid:51,pic:'',nv:null},{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0}],oparms:[{av:'AV22SDTCentroUsuario',fld:'vSDTCENTROUSUARIO',grid:51,pic:'',nv:null},{av:'AV36Cent_id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV37Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''},{av:'AV39Cent_Descripcion',fld:'vCENT_DESCRIPCION',pic:'',nv:''},{av:'AV40Regi_Cod',fld:'vREGI_COD',pic:'ZZZ9',nv:0},{av:'AV38Regi_Descripcion',fld:'vREGI_DESCRIPCION',pic:'',nv:''},{av:'AV41Regi_Abrev',fld:'vREGI_ABREV',pic:'',nv:''}]}");
      setEventMetadata("VCCENT_DESCRIPCION.ISVALID","{handler:'e18712',iparms:[{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A3Cent_Codigo',fld:'CENT_CODIGO',pic:'',nv:''},{av:'A4Cent_Descripcion',fld:'CENT_DESCRIPCION',pic:'',nv:''},{av:'A12Regi_Cod',fld:'REGI_COD',pic:'ZZZ9',nv:0},{av:'A13Regi_Descripcion',fld:'REGI_DESCRIPCION',pic:'',nv:''},{av:'A154Regi_Abrev',fld:'REGI_ABREV',pic:'',nv:''},{av:'AV19cRegi_Descripcion',fld:'vCREGI_DESCRIPCION',pic:'',nv:''},{av:'AV7cCent_Descripcion',fld:'vCCENT_DESCRIPCION',pic:'',nv:''},{av:'AV6cCent_Codigo',fld:'vCCENT_CODIGO',pic:'',nv:''},{av:'AV37Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''},{av:'AV39Cent_Descripcion',fld:'vCENT_DESCRIPCION',pic:'',nv:''},{av:'AV36Cent_id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV41Regi_Abrev',fld:'vREGI_ABREV',pic:'',nv:''},{av:'AV40Regi_Cod',fld:'vREGI_COD',pic:'ZZZ9',nv:0},{av:'AV38Regi_Descripcion',fld:'vREGI_DESCRIPCION',pic:'',nv:''},{av:'AV45TodoCentros',fld:'vTODOCENTROS',pic:'',nv:false},{av:'AV22SDTCentroUsuario',fld:'vSDTCENTROUSUARIO',grid:51,pic:'',nv:null},{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0}],oparms:[{av:'AV22SDTCentroUsuario',fld:'vSDTCENTROUSUARIO',grid:51,pic:'',nv:null},{av:'AV36Cent_id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV37Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''},{av:'AV39Cent_Descripcion',fld:'vCENT_DESCRIPCION',pic:'',nv:''},{av:'AV40Regi_Cod',fld:'vREGI_COD',pic:'ZZZ9',nv:0},{av:'AV38Regi_Descripcion',fld:'vREGI_DESCRIPCION',pic:'',nv:''},{av:'AV41Regi_Abrev',fld:'vREGI_ABREV',pic:'',nv:''}]}");
      setEventMetadata("VTODOCENTROS.ISVALID","{handler:'e19712',iparms:[{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A3Cent_Codigo',fld:'CENT_CODIGO',pic:'',nv:''},{av:'A4Cent_Descripcion',fld:'CENT_DESCRIPCION',pic:'',nv:''},{av:'A12Regi_Cod',fld:'REGI_COD',pic:'ZZZ9',nv:0},{av:'A13Regi_Descripcion',fld:'REGI_DESCRIPCION',pic:'',nv:''},{av:'A154Regi_Abrev',fld:'REGI_ABREV',pic:'',nv:''},{av:'AV19cRegi_Descripcion',fld:'vCREGI_DESCRIPCION',pic:'',nv:''},{av:'AV7cCent_Descripcion',fld:'vCCENT_DESCRIPCION',pic:'',nv:''},{av:'AV6cCent_Codigo',fld:'vCCENT_CODIGO',pic:'',nv:''},{av:'AV37Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''},{av:'AV39Cent_Descripcion',fld:'vCENT_DESCRIPCION',pic:'',nv:''},{av:'AV36Cent_id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV41Regi_Abrev',fld:'vREGI_ABREV',pic:'',nv:''},{av:'AV40Regi_Cod',fld:'vREGI_COD',pic:'ZZZ9',nv:0},{av:'AV38Regi_Descripcion',fld:'vREGI_DESCRIPCION',pic:'',nv:''},{av:'AV45TodoCentros',fld:'vTODOCENTROS',pic:'',nv:false},{av:'AV22SDTCentroUsuario',fld:'vSDTCENTROUSUARIO',grid:51,pic:'',nv:null},{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0}],oparms:[{av:'AV22SDTCentroUsuario',fld:'vSDTCENTROUSUARIO',grid:51,pic:'',nv:null},{av:'AV36Cent_id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV37Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''},{av:'AV39Cent_Descripcion',fld:'vCENT_DESCRIPCION',pic:'',nv:''},{av:'AV40Regi_Cod',fld:'vREGI_COD',pic:'ZZZ9',nv:0},{av:'AV38Regi_Descripcion',fld:'vREGI_DESCRIPCION',pic:'',nv:''},{av:'AV41Regi_Abrev',fld:'vREGI_ABREV',pic:'',nv:''}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV22SDTCentroUsuario',fld:'vSDTCENTROUSUARIO',grid:51,pic:'',nv:null}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV22SDTCentroUsuario',fld:'vSDTCENTROUSUARIO',grid:51,pic:'',nv:null}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV22SDTCentroUsuario',fld:'vSDTCENTROUSUARIO',grid:51,pic:'',nv:null}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV22SDTCentroUsuario',fld:'vSDTCENTROUSUARIO',grid:51,pic:'',nv:null}],oparms:[]}");
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
      AV46Mensaje = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV22SDTCentroUsuario = new GXBaseCollection<com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem>(com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem.class, "SDTCentroUsuario.SDTCentroUsuarioItem", "ACBSENA", remoteHandle);
      A3Cent_Codigo = "" ;
      A4Cent_Descripcion = "" ;
      A13Regi_Descripcion = "" ;
      A154Regi_Abrev = "" ;
      AV37Cent_Codigo = "" ;
      AV39Cent_Descripcion = "" ;
      AV41Regi_Abrev = "" ;
      AV38Regi_Descripcion = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblregionfilter_Jsonclick = "" ;
      TempTags = "" ;
      AV19cRegi_Descripcion = "" ;
      lblLblcent_codigofilter_Jsonclick = "" ;
      AV6cCent_Codigo = "" ;
      lblLblcent_descripcionfilter_Jsonclick = "" ;
      AV7cCent_Descripcion = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      bttEnter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXCCtl = "" ;
      AV5ADVANCED_LABEL_TEMPLATE = "" ;
      AV43SDTUsuario = "" ;
      AV23SDTCentroUsuarioItem = new com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem(remoteHandle, context);
      AV44websession = httpContext.getWebSession();
      scmdbuf = "" ;
      H00712_A2Regi_Id = new long[1] ;
      H00712_A1Cent_Id = new long[1] ;
      H00712_A3Cent_Codigo = new String[] {""} ;
      H00712_A4Cent_Descripcion = new String[] {""} ;
      H00712_A12Regi_Cod = new short[1] ;
      H00712_A13Regi_Descripcion = new String[] {""} ;
      H00712_A154Regi_Abrev = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.gxcentcos__default(),
         new Object[] {
             new Object[] {
            H00712_A2Regi_Id, H00712_A1Cent_Id, H00712_A3Cent_Codigo, H00712_A4Cent_Descripcion, H00712_A12Regi_Cod, H00712_A13Regi_Descripcion, H00712_A154Regi_Abrev
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavCtlregi_descripcion_Enabled = 0 ;
      edtavCtlcent_id_Enabled = 0 ;
      edtavCtlcent_codigo_Enabled = 0 ;
      edtavCtlcent_descripcion_Enabled = 0 ;
      edtavCtlregi_cod_Enabled = 0 ;
      edtavCtlregi_abrev_Enabled = 0 ;
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
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private short nRC_GXsfl_51 ;
   private short nGXsfl_51_idx=1 ;
   private short A12Regi_Cod ;
   private short AV40Regi_Cod ;
   private short wbEnd ;
   private short wbStart ;
   private short AV49GXV1 ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short nGXsfl_51_fel_idx=1 ;
   private short AV42Index ;
   private short nGXsfl_51_bak_idx=1 ;
   private int subGrid1_Rows ;
   private int edtavCregi_descripcion_Visible ;
   private int edtavCregi_descripcion_Enabled ;
   private int edtavCcent_codigo_Visible ;
   private int edtavCcent_codigo_Enabled ;
   private int edtavCcent_descripcion_Visible ;
   private int edtavCcent_descripcion_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavCtlregi_descripcion_Enabled ;
   private int edtavCtlcent_id_Enabled ;
   private int edtavCtlcent_codigo_Enabled ;
   private int edtavCtlcent_descripcion_Enabled ;
   private int edtavCtlregi_cod_Enabled ;
   private int edtavCtlregi_abrev_Enabled ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GRID1_nGridOutOfScope ;
   private int AV57GXV2 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private long A1Cent_Id ;
   private long AV36Cent_id ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private long A2Regi_Id ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divCent_codigofiltercontainer_Class ;
   private String divCent_descripcionfiltercontainer_Class ;
   private String divCent_regionalfiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_51_idx="0001" ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divCent_regionalfiltercontainer_Internalname ;
   private String lblLblregionfilter_Internalname ;
   private String lblLblregionfilter_Jsonclick ;
   private String edtavCregi_descripcion_Internalname ;
   private String TempTags ;
   private String edtavCregi_descripcion_Jsonclick ;
   private String divCent_codigofiltercontainer_Internalname ;
   private String lblLblcent_codigofilter_Internalname ;
   private String lblLblcent_codigofilter_Jsonclick ;
   private String edtavCcent_codigo_Internalname ;
   private String edtavCcent_codigo_Jsonclick ;
   private String divCent_descripcionfiltercontainer_Internalname ;
   private String lblLblcent_descripcionfilter_Internalname ;
   private String lblLblcent_descripcionfilter_Jsonclick ;
   private String edtavCcent_descripcion_Internalname ;
   private String edtavCcent_descripcion_Jsonclick ;
   private String divGridtable_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtntoggle_Internalname ;
   private String bttBtntoggle_Jsonclick ;
   private String divTable2_Internalname ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String divTable1_Internalname ;
   private String bttEnter_Internalname ;
   private String bttEnter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXCCtl ;
   private String edtavCtlregi_descripcion_Internalname ;
   private String edtavCtlcent_id_Internalname ;
   private String edtavCtlcent_codigo_Internalname ;
   private String edtavCtlcent_descripcion_Internalname ;
   private String edtavCtlregi_cod_Internalname ;
   private String edtavCtlregi_abrev_Internalname ;
   private String sGXsfl_51_fel_idx="0001" ;
   private String AV5ADVANCED_LABEL_TEMPLATE ;
   private String scmdbuf ;
   private String ROClassString ;
   private String edtavCtlregi_descripcion_Jsonclick ;
   private String edtavCtlcent_id_Jsonclick ;
   private String edtavCtlcent_codigo_Jsonclick ;
   private String edtavCtlcent_descripcion_Jsonclick ;
   private String edtavCtlregi_cod_Jsonclick ;
   private String edtavCtlregi_abrev_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean AV45TodoCentros ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_51_Refreshing=false ;
   private boolean returnInSub ;
   private boolean gx_BV51 ;
   private String AV43SDTUsuario ;
   private String AV46Mensaje ;
   private String A3Cent_Codigo ;
   private String A4Cent_Descripcion ;
   private String A13Regi_Descripcion ;
   private String A154Regi_Abrev ;
   private String AV37Cent_Codigo ;
   private String AV39Cent_Descripcion ;
   private String AV41Regi_Abrev ;
   private String AV38Regi_Descripcion ;
   private String AV19cRegi_Descripcion ;
   private String AV6cCent_Codigo ;
   private String AV7cCent_Descripcion ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private ICheckbox chkavTodocentros ;
   private ICheckbox chkavCtlseleccion ;
   private IDataStoreProvider pr_default ;
   private long[] H00712_A2Regi_Id ;
   private long[] H00712_A1Cent_Id ;
   private String[] H00712_A3Cent_Codigo ;
   private String[] H00712_A4Cent_Descripcion ;
   private short[] H00712_A12Regi_Cod ;
   private String[] H00712_A13Regi_Descripcion ;
   private String[] H00712_A154Regi_Abrev ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.WebSession AV44websession ;
   private GXBaseCollection<com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem> AV22SDTCentroUsuario ;
   private com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem AV23SDTCentroUsuarioItem ;
}

final  class gxcentcos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00712", "SELECT T1.Regi_Id, T1.Cent_Id, T1.Cent_Codigo, T1.Cent_Descripcion, T2.Regi_Cod, T2.Regi_Descripcion, T2.Regi_Abrev FROM (GEN_CENTROCOSTO T1 INNER JOIN GEN_REGIONAL T2 ON T2.Regi_Id = T1.Regi_Id) ORDER BY T1.Cent_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
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

