/*
               File: gx00r0_impl
        Description: Selection List ROL
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:24:13.21
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

public final  class gx00r0_impl extends GXDataArea
{
   public gx00r0_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx00r0_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx00r0_impl.class ));
   }

   public gx00r0_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavCrol_tipo = new HTMLChoice();
      cmbRol_Tipo = new HTMLChoice();
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
            nRC_GXsfl_84 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_84_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_84_idx = httpContext.GetNextPar( ) ;
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
            AV6cRol_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            AV7cRol_Descripcion = httpContext.GetNextPar( ) ;
            AV8cRol_Tipo = httpContext.GetNextPar( ) ;
            AV9cRol_UsuarioCrea = httpContext.GetNextPar( ) ;
            AV10cRol_FechaCrea = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
            AV11cRol_UsuarioModifica = httpContext.GetNextPar( ) ;
            AV12cRol_FechaModifica = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cRol_Id, AV7cRol_Descripcion, AV8cRol_Tipo, AV9cRol_UsuarioCrea, AV10cRol_FechaCrea, AV11cRol_UsuarioModifica, AV12cRol_FechaModifica) ;
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
            AV13pRol_Id = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13pRol_Id", GXutil.ltrim( GXutil.str( AV13pRol_Id, 11, 0)));
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
         MasterPageObj.setDataArea(this,true);
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
      pa8A2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start8A2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414241327");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.gx00r0") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pRol_Id,11,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCROL_ID", GXutil.ltrim( localUtil.ntoc( AV6cRol_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCROL_DESCRIPCION", AV7cRol_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCROL_TIPO", GXutil.rtrim( AV8cRol_Tipo));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCROL_USUARIOCREA", AV9cRol_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCROL_FECHACREA", localUtil.ttoc( AV10cRol_FechaCrea, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCROL_USUARIOMODIFICA", AV11cRol_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCROL_FECHAMODIFICA", localUtil.ttoc( AV12cRol_FechaModifica, 10, 8, 0, 3, "/", ":", " "));
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_84", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_84, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPROL_ID", GXutil.ltrim( localUtil.ntoc( AV13pRol_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ROL_IDFILTERCONTAINER_Class", GXutil.rtrim( divRol_idfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ROL_DESCRIPCIONFILTERCONTAINER_Class", GXutil.rtrim( divRol_descripcionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ROL_TIPOFILTERCONTAINER_Class", GXutil.rtrim( divRol_tipofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ROL_USUARIOCREAFILTERCONTAINER_Class", GXutil.rtrim( divRol_usuariocreafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ROL_FECHACREAFILTERCONTAINER_Class", GXutil.rtrim( divRol_fechacreafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ROL_USUARIOMODIFICAFILTERCONTAINER_Class", GXutil.rtrim( divRol_usuariomodificafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ROL_FECHAMODIFICAFILTERCONTAINER_Class", GXutil.rtrim( divRol_fechamodificafiltercontainer_Class));
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
         we8A2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt8A2( ) ;
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
      return formatLink("com.orions2.gx00r0") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pRol_Id,11,0))) ;
   }

   public String getPgmname( )
   {
      return "Gx00R0" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List ROL" ;
   }

   public void wb8A0( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 PromptAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divAdvancedcontainer_Internalname, 1, 0, "px", 0, "px", divAdvancedcontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divRol_idfiltercontainer_Internalname, 1, 0, "px", 0, "px", divRol_idfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblrol_idfilter_Internalname, "Identificador del Rol", "", "", lblLblrol_idfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e118a1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00R0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCrol_id_Internalname, "Identificador del Rol", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCrol_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cRol_Id, (byte)(11), (byte)(0), ",", "")), ((edtavCrol_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6cRol_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV6cRol_Id), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCrol_id_Jsonclick, 0, "Attribute", "", "", "", edtavCrol_id_Visible, edtavCrol_id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx00R0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divRol_descripcionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divRol_descripcionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblrol_descripcionfilter_Internalname, "Descripcion del Rol", "", "", lblLblrol_descripcionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e128a1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00R0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCrol_descripcion_Internalname, "Descripcion del Rol", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCrol_descripcion_Internalname, AV7cRol_Descripcion, GXutil.rtrim( localUtil.format( AV7cRol_Descripcion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCrol_descripcion_Jsonclick, 0, "Attribute", "", "", "", edtavCrol_descripcion_Visible, edtavCrol_descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx00R0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divRol_tipofiltercontainer_Internalname, 1, 0, "px", 0, "px", divRol_tipofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblrol_tipofilter_Internalname, "Tipo de Rol", "", "", lblLblrol_tipofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e138a1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00R0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavCrol_tipo.getInternalname(), "Tipo de Rol", "col-sm-3 AttributeLabel", 0, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCrol_tipo, cmbavCrol_tipo.getInternalname(), GXutil.rtrim( AV8cRol_Tipo), 1, cmbavCrol_tipo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbavCrol_tipo.getVisible(), cmbavCrol_tipo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "", true, "HLP_Gx00R0.htm");
         cmbavCrol_tipo.setValue( GXutil.rtrim( AV8cRol_Tipo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCrol_tipo.getInternalname(), "Values", cmbavCrol_tipo.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divRol_usuariocreafiltercontainer_Internalname, 1, 0, "px", 0, "px", divRol_usuariocreafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblrol_usuariocreafilter_Internalname, "Usuario Creación Rol", "", "", lblLblrol_usuariocreafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e148a1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00R0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCrol_usuariocrea_Internalname, "Usuario Creación Rol", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCrol_usuariocrea_Internalname, AV9cRol_UsuarioCrea, GXutil.rtrim( localUtil.format( AV9cRol_UsuarioCrea, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCrol_usuariocrea_Jsonclick, 0, "Attribute", "", "", "", edtavCrol_usuariocrea_Visible, edtavCrol_usuariocrea_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx00R0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divRol_fechacreafiltercontainer_Internalname, 1, 0, "px", 0, "px", divRol_fechacreafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblrol_fechacreafilter_Internalname, "Fecha Creación Rol", "", "", lblLblrol_fechacreafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e158a1_client"+"'", "", "WWAdvancedLabel WWDateFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00R0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCrol_fechacrea_Internalname, "Fecha Creación Rol", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCrol_fechacrea_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCrol_fechacrea_Internalname, localUtil.ttoc( AV10cRol_FechaCrea, 10, 8, 0, 3, "/", ":", " "), localUtil.format( AV10cRol_FechaCrea, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCrol_fechacrea_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCrol_fechacrea_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx00R0.htm");
         httpContext.writeTextNL( "</div>") ;
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divRol_usuariomodificafiltercontainer_Internalname, 1, 0, "px", 0, "px", divRol_usuariomodificafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblrol_usuariomodificafilter_Internalname, "Usuario Modificación Rol", "", "", lblLblrol_usuariomodificafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e168a1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00R0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCrol_usuariomodifica_Internalname, "Usuario Modificación Rol", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCrol_usuariomodifica_Internalname, AV11cRol_UsuarioModifica, GXutil.rtrim( localUtil.format( AV11cRol_UsuarioModifica, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCrol_usuariomodifica_Jsonclick, 0, "Attribute", "", "", "", edtavCrol_usuariomodifica_Visible, edtavCrol_usuariomodifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx00R0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divRol_fechamodificafiltercontainer_Internalname, 1, 0, "px", 0, "px", divRol_fechamodificafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblrol_fechamodificafilter_Internalname, "Fecha Modificación Rol", "", "", lblLblrol_fechamodificafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e178a1_client"+"'", "", "WWAdvancedLabel WWDateFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00R0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCrol_fechamodifica_Internalname, "Fecha Modificación Rol", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCrol_fechamodifica_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCrol_fechamodifica_Internalname, localUtil.ttoc( AV12cRol_FechaModifica, 10, 8, 0, 3, "/", ":", " "), localUtil.format( AV12cRol_FechaModifica, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCrol_fechamodifica_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCrol_fechamodifica_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx00R0.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 WWGridCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divGridtable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-sm hidden-md hidden-lg ToggleCell", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         ClassString = bttBtntoggle_Class ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e188a1_client"+"'", TempTags, "", 2, "HLP_Gx00R0.htm");
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"84\">") ;
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
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"SelectionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Identificador del Rol") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripcion del Rol") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tipo de Rol") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Usuario Creación Rol") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeTextNL( "</tr>") ;
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
            if ( isAjaxCallMode( ) )
            {
               Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
            }
            else
            {
               Grid1Container.Clear();
            }
            Grid1Container.SetWrapped(nGXWrapped);
            Grid1Container.AddObjectProperty("GridName", "Grid1");
            Grid1Container.AddObjectProperty("Class", "PromptGrid");
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("CmpContext", "");
            Grid1Container.AddObjectProperty("InMasterPage", "false");
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( AV5LinkSelection));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtavLinkselection_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A21Rol_Id, (byte)(11), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A22Rol_Descripcion);
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtRol_Descripcion_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A402Rol_Tipo));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A211Rol_UsuarioCrea);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 84 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_84 = (short)(nGXsfl_84_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Grid1Container.AddObjectProperty("GRID1_nEOF", GRID1_nEOF);
            Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx00R0.htm");
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

   public void start8A2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List ROL", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup8A0( ) ;
   }

   public void ws8A2( )
   {
      start8A2( ) ;
      evt8A2( ) ;
   }

   public void evt8A2( )
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 4), "LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) )
                        {
                           nGXsfl_84_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_842( ) ;
                           AV5LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV17Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV5LinkSelection))), !bGXsfl_84_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV5LinkSelection), true);
                           A21Rol_Id = localUtil.ctol( httpContext.cgiGet( edtRol_Id_Internalname), ",", ".") ;
                           A22Rol_Descripcion = GXutil.upper( httpContext.cgiGet( edtRol_Descripcion_Internalname)) ;
                           cmbRol_Tipo.setName( cmbRol_Tipo.getInternalname() );
                           cmbRol_Tipo.setValue( httpContext.cgiGet( cmbRol_Tipo.getInternalname()) );
                           A402Rol_Tipo = httpContext.cgiGet( cmbRol_Tipo.getInternalname()) ;
                           A211Rol_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtRol_UsuarioCrea_Internalname)) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e198A2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e208A2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Crol_id Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCROL_ID"), ",", ".") != AV6cRol_Id )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Crol_descripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCROL_DESCRIPCION"), AV7cRol_Descripcion) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Crol_tipo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCROL_TIPO"), AV8cRol_Tipo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Crol_usuariocrea Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCROL_USUARIOCREA"), AV9cRol_UsuarioCrea) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Crol_fechacrea Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCROL_FECHACREA"), 0), AV10cRol_FechaCrea) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Crol_usuariomodifica Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCROL_USUARIOMODIFICA"), AV11cRol_UsuarioModifica) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Crol_fechamodifica Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCROL_FECHAMODIFICA"), 0), AV12cRol_FechaModifica) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e218A2 ();
                                    }
                                    dynload_actions( ) ;
                                 }
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

   public void we8A2( )
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

   public void pa8A2( )
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
         cmbavCrol_tipo.setName( "vCROL_TIPO" );
         cmbavCrol_tipo.setWebtags( "" );
         cmbavCrol_tipo.addItem("U", "Usuario", (short)(0));
         cmbavCrol_tipo.addItem("S", "Admin Sistema", (short)(0));
         cmbavCrol_tipo.addItem("F", "Admin Funcional", (short)(0));
         if ( cmbavCrol_tipo.getItemCount() > 0 )
         {
            AV8cRol_Tipo = cmbavCrol_tipo.getValidValue(AV8cRol_Tipo) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cRol_Tipo", AV8cRol_Tipo);
         }
         GXCCtl = "ROL_TIPO_" + sGXsfl_84_idx ;
         cmbRol_Tipo.setName( GXCCtl );
         cmbRol_Tipo.setWebtags( "" );
         cmbRol_Tipo.addItem("U", "Usuario", (short)(0));
         cmbRol_Tipo.addItem("S", "Admin Sistema", (short)(0));
         cmbRol_Tipo.addItem("F", "Admin Funcional", (short)(0));
         if ( cmbRol_Tipo.getItemCount() > 0 )
         {
            A402Rol_Tipo = cmbRol_Tipo.getValidValue(A402Rol_Tipo) ;
         }
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
      subsflControlProps_842( ) ;
      while ( nGXsfl_84_idx <= nRC_GXsfl_84 )
      {
         sendrow_842( ) ;
         nGXsfl_84_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_84_idx+1)) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  long AV6cRol_Id ,
                                  String AV7cRol_Descripcion ,
                                  String AV8cRol_Tipo ,
                                  String AV9cRol_UsuarioCrea ,
                                  java.util.Date AV10cRol_FechaCrea ,
                                  String AV11cRol_UsuarioModifica ,
                                  java.util.Date AV12cRol_FechaModifica )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID1_nCurrentRecord = 0 ;
      rf8A2( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ROL_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A21Rol_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ROL_ID", GXutil.ltrim( localUtil.ntoc( A21Rol_Id, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ROL_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A22Rol_Descripcion, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ROL_DESCRIPCION", A22Rol_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ROL_TIPO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A402Rol_Tipo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ROL_TIPO", GXutil.rtrim( A402Rol_Tipo));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ROL_USUARIOCREA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A211Rol_UsuarioCrea, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ROL_USUARIOCREA", A211Rol_UsuarioCrea);
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbavCrol_tipo.getItemCount() > 0 )
      {
         AV8cRol_Tipo = cmbavCrol_tipo.getValidValue(AV8cRol_Tipo) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cRol_Tipo", AV8cRol_Tipo);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf8A2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf8A2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(84) ;
      nGXsfl_84_idx = (short)(1) ;
      sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_842( ) ;
      bGXsfl_84_Refreshing = true ;
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
         subsflControlProps_842( ) ;
         GXPagingFrom2 = (int)(((10==0) ? 0 : GRID1_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((10==0) ? 10000 : subgrid1_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV7cRol_Descripcion ,
                                              AV8cRol_Tipo ,
                                              AV9cRol_UsuarioCrea ,
                                              AV10cRol_FechaCrea ,
                                              AV11cRol_UsuarioModifica ,
                                              AV12cRol_FechaModifica ,
                                              A22Rol_Descripcion ,
                                              A402Rol_Tipo ,
                                              A211Rol_UsuarioCrea ,
                                              A212Rol_FechaCrea ,
                                              A213Rol_UsuarioModifica ,
                                              A214Rol_FechaModifica ,
                                              new Long(AV6cRol_Id) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                              TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG
                                              }
         } ) ;
         lV7cRol_Descripcion = GXutil.concat( GXutil.rtrim( AV7cRol_Descripcion), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cRol_Descripcion", AV7cRol_Descripcion);
         lV8cRol_Tipo = GXutil.padr( GXutil.rtrim( AV8cRol_Tipo), 1, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cRol_Tipo", AV8cRol_Tipo);
         lV9cRol_UsuarioCrea = GXutil.concat( GXutil.rtrim( AV9cRol_UsuarioCrea), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cRol_UsuarioCrea", AV9cRol_UsuarioCrea);
         lV11cRol_UsuarioModifica = GXutil.concat( GXutil.rtrim( AV11cRol_UsuarioModifica), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cRol_UsuarioModifica", AV11cRol_UsuarioModifica);
         /* Using cursor H008A2 */
         pr_default.execute(0, new Object[] {new Long(AV6cRol_Id), lV7cRol_Descripcion, lV8cRol_Tipo, lV9cRol_UsuarioCrea, AV10cRol_FechaCrea, lV11cRol_UsuarioModifica, AV12cRol_FechaModifica, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_84_idx = (short)(1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A214Rol_FechaModifica = H008A2_A214Rol_FechaModifica[0] ;
            A213Rol_UsuarioModifica = H008A2_A213Rol_UsuarioModifica[0] ;
            A212Rol_FechaCrea = H008A2_A212Rol_FechaCrea[0] ;
            A211Rol_UsuarioCrea = H008A2_A211Rol_UsuarioCrea[0] ;
            A402Rol_Tipo = H008A2_A402Rol_Tipo[0] ;
            A22Rol_Descripcion = H008A2_A22Rol_Descripcion[0] ;
            A21Rol_Id = H008A2_A21Rol_Id[0] ;
            /* Execute user event: Load */
            e208A2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(84) ;
         wb8A0( ) ;
      }
      bGXsfl_84_Refreshing = true ;
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
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV7cRol_Descripcion ,
                                           AV8cRol_Tipo ,
                                           AV9cRol_UsuarioCrea ,
                                           AV10cRol_FechaCrea ,
                                           AV11cRol_UsuarioModifica ,
                                           AV12cRol_FechaModifica ,
                                           A22Rol_Descripcion ,
                                           A402Rol_Tipo ,
                                           A211Rol_UsuarioCrea ,
                                           A212Rol_FechaCrea ,
                                           A213Rol_UsuarioModifica ,
                                           A214Rol_FechaModifica ,
                                           new Long(AV6cRol_Id) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG
                                           }
      } ) ;
      lV7cRol_Descripcion = GXutil.concat( GXutil.rtrim( AV7cRol_Descripcion), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7cRol_Descripcion", AV7cRol_Descripcion);
      lV8cRol_Tipo = GXutil.padr( GXutil.rtrim( AV8cRol_Tipo), 1, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8cRol_Tipo", AV8cRol_Tipo);
      lV9cRol_UsuarioCrea = GXutil.concat( GXutil.rtrim( AV9cRol_UsuarioCrea), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9cRol_UsuarioCrea", AV9cRol_UsuarioCrea);
      lV11cRol_UsuarioModifica = GXutil.concat( GXutil.rtrim( AV11cRol_UsuarioModifica), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11cRol_UsuarioModifica", AV11cRol_UsuarioModifica);
      /* Using cursor H008A3 */
      pr_default.execute(1, new Object[] {new Long(AV6cRol_Id), lV7cRol_Descripcion, lV8cRol_Tipo, lV9cRol_UsuarioCrea, AV10cRol_FechaCrea, lV11cRol_UsuarioModifica, AV12cRol_FechaModifica});
      GRID1_nRecordCount = H008A3_AGRID1_nRecordCount[0] ;
      pr_default.close(1);
      return (int)(GRID1_nRecordCount) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cRol_Id, AV7cRol_Descripcion, AV8cRol_Tipo, AV9cRol_UsuarioCrea, AV10cRol_FechaCrea, AV11cRol_UsuarioModifica, AV12cRol_FechaModifica) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cRol_Id, AV7cRol_Descripcion, AV8cRol_Tipo, AV9cRol_UsuarioCrea, AV10cRol_FechaCrea, AV11cRol_UsuarioModifica, AV12cRol_FechaModifica) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cRol_Id, AV7cRol_Descripcion, AV8cRol_Tipo, AV9cRol_UsuarioCrea, AV10cRol_FechaCrea, AV11cRol_UsuarioModifica, AV12cRol_FechaModifica) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cRol_Id, AV7cRol_Descripcion, AV8cRol_Tipo, AV9cRol_UsuarioCrea, AV10cRol_FechaCrea, AV11cRol_UsuarioModifica, AV12cRol_FechaModifica) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cRol_Id, AV7cRol_Descripcion, AV8cRol_Tipo, AV9cRol_UsuarioCrea, AV10cRol_FechaCrea, AV11cRol_UsuarioModifica, AV12cRol_FechaModifica) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup8A0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e198A2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCrol_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCrol_id_Internalname), ",", ".") > 99999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCROL_ID");
            GX_FocusControl = edtavCrol_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cRol_Id = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cRol_Id", GXutil.ltrim( GXutil.str( AV6cRol_Id, 11, 0)));
         }
         else
         {
            AV6cRol_Id = localUtil.ctol( httpContext.cgiGet( edtavCrol_id_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cRol_Id", GXutil.ltrim( GXutil.str( AV6cRol_Id, 11, 0)));
         }
         AV7cRol_Descripcion = GXutil.upper( httpContext.cgiGet( edtavCrol_descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cRol_Descripcion", AV7cRol_Descripcion);
         cmbavCrol_tipo.setName( cmbavCrol_tipo.getInternalname() );
         cmbavCrol_tipo.setValue( httpContext.cgiGet( cmbavCrol_tipo.getInternalname()) );
         AV8cRol_Tipo = httpContext.cgiGet( cmbavCrol_tipo.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cRol_Tipo", AV8cRol_Tipo);
         AV9cRol_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtavCrol_usuariocrea_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cRol_UsuarioCrea", AV9cRol_UsuarioCrea);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCrol_fechacrea_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vCROL_FECHACREA");
            GX_FocusControl = edtavCrol_fechacrea_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10cRol_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV10cRol_FechaCrea", localUtil.ttoc( AV10cRol_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
         }
         else
         {
            AV10cRol_FechaCrea = localUtil.ctot( httpContext.cgiGet( edtavCrol_fechacrea_Internalname), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cRol_FechaCrea", localUtil.ttoc( AV10cRol_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
         }
         AV11cRol_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtavCrol_usuariomodifica_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cRol_UsuarioModifica", AV11cRol_UsuarioModifica);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCrol_fechamodifica_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vCROL_FECHAMODIFICA");
            GX_FocusControl = edtavCrol_fechamodifica_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12cRol_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV12cRol_FechaModifica", localUtil.ttoc( AV12cRol_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         }
         else
         {
            AV12cRol_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtavCrol_fechamodifica_Internalname), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cRol_FechaModifica", localUtil.ttoc( AV12cRol_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         }
         /* Read saved values. */
         nRC_GXsfl_84 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_84"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCROL_ID"), ",", ".") != AV6cRol_Id )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCROL_DESCRIPCION"), AV7cRol_Descripcion) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCROL_TIPO"), AV8cRol_Tipo) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCROL_USUARIOCREA"), AV9cRol_UsuarioCrea) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCROL_FECHACREA"), 0), AV10cRol_FechaCrea) ) )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCROL_USUARIOMODIFICA"), AV11cRol_UsuarioModifica) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCROL_FECHAMODIFICA"), 0), AV12cRol_FechaModifica) ) )
         {
            GRID1_nFirstRecordOnPage = 0 ;
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
      e198A2 ();
      if (returnInSub) return;
   }

   public void e198A2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "ROL", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV14ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e208A2( )
   {
      /* Load Routine */
      AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      AV17Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      sendrow_842( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_84_Refreshing )
      {
         httpContext.doAjaxLoad(84, Grid1Row);
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e218A2 ();
      if (returnInSub) return;
   }

   public void e218A2( )
   {
      /* Enter Routine */
      AV13pRol_Id = A21Rol_Id ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pRol_Id", GXutil.ltrim( GXutil.str( AV13pRol_Id, 11, 0)));
      httpContext.setWebReturnParms(new Object[] {new Long(AV13pRol_Id)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV13pRol_Id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pRol_Id", GXutil.ltrim( GXutil.str( AV13pRol_Id, 11, 0)));
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
      pa8A2( ) ;
      ws8A2( ) ;
      we8A2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414241449");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gx00r0.js", "?201861414241451");
      /* End function include_jscripts */
   }

   public void subsflControlProps_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_idx ;
      edtRol_Id_Internalname = "ROL_ID_"+sGXsfl_84_idx ;
      edtRol_Descripcion_Internalname = "ROL_DESCRIPCION_"+sGXsfl_84_idx ;
      cmbRol_Tipo.setInternalname( "ROL_TIPO_"+sGXsfl_84_idx );
      edtRol_UsuarioCrea_Internalname = "ROL_USUARIOCREA_"+sGXsfl_84_idx ;
   }

   public void subsflControlProps_fel_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_fel_idx ;
      edtRol_Id_Internalname = "ROL_ID_"+sGXsfl_84_fel_idx ;
      edtRol_Descripcion_Internalname = "ROL_DESCRIPCION_"+sGXsfl_84_fel_idx ;
      cmbRol_Tipo.setInternalname( "ROL_TIPO_"+sGXsfl_84_fel_idx );
      edtRol_UsuarioCrea_Internalname = "ROL_USUARIOCREA_"+sGXsfl_84_fel_idx ;
   }

   public void sendrow_842( )
   {
      subsflControlProps_842( ) ;
      wb8A0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_84_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_84_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_84_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A21Rol_Id, (byte)(11), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link, !bGXsfl_84_Refreshing);
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV5LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV5LinkSelection)==0)&&(GXutil.strcmp("", AV17Linkselection_GXI)==0))||!(GXutil.strcmp("", AV5LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV17Linkselection_GXI : httpContext.getResourceRelative(AV5LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV5LinkSelection_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRol_Id_Internalname,GXutil.ltrim( localUtil.ntoc( A21Rol_Id, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A21Rol_Id), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRol_Id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         edtRol_Descripcion_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A21Rol_Id, (byte)(11), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtRol_Descripcion_Internalname, "Link", edtRol_Descripcion_Link, !bGXsfl_84_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRol_Descripcion_Internalname,A22Rol_Descripcion,GXutil.rtrim( localUtil.format( A22Rol_Descripcion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'",edtRol_Descripcion_Link,"","","",edtRol_Descripcion_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_84_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ROL_TIPO_" + sGXsfl_84_idx ;
            cmbRol_Tipo.setName( GXCCtl );
            cmbRol_Tipo.setWebtags( "" );
            cmbRol_Tipo.addItem("U", "Usuario", (short)(0));
            cmbRol_Tipo.addItem("S", "Admin Sistema", (short)(0));
            cmbRol_Tipo.addItem("F", "Admin Funcional", (short)(0));
            if ( cmbRol_Tipo.getItemCount() > 0 )
            {
               A402Rol_Tipo = cmbRol_Tipo.getValidValue(A402Rol_Tipo) ;
            }
         }
         /* ComboBox */
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbRol_Tipo,cmbRol_Tipo.getInternalname(),GXutil.rtrim( A402Rol_Tipo),new Integer(1),cmbRol_Tipo.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn OptionalColumn","","",new Boolean(true)});
         cmbRol_Tipo.setValue( GXutil.rtrim( A402Rol_Tipo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbRol_Tipo.getInternalname(), "Values", cmbRol_Tipo.ToJavascriptSource(), !bGXsfl_84_Refreshing);
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRol_UsuarioCrea_Internalname,A211Rol_UsuarioCrea,GXutil.rtrim( localUtil.format( A211Rol_UsuarioCrea, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRol_UsuarioCrea_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ROL_ID"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A21Rol_Id), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ROL_DESCRIPCION"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A22Rol_Descripcion, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ROL_TIPO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A402Rol_Tipo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ROL_USUARIOCREA"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A211Rol_UsuarioCrea, "@!"))));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_84_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_84_idx+1)) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      /* End function sendrow_842 */
   }

   public void init_default_properties( )
   {
      lblLblrol_idfilter_Internalname = "LBLROL_IDFILTER" ;
      edtavCrol_id_Internalname = "vCROL_ID" ;
      divRol_idfiltercontainer_Internalname = "ROL_IDFILTERCONTAINER" ;
      lblLblrol_descripcionfilter_Internalname = "LBLROL_DESCRIPCIONFILTER" ;
      edtavCrol_descripcion_Internalname = "vCROL_DESCRIPCION" ;
      divRol_descripcionfiltercontainer_Internalname = "ROL_DESCRIPCIONFILTERCONTAINER" ;
      lblLblrol_tipofilter_Internalname = "LBLROL_TIPOFILTER" ;
      cmbavCrol_tipo.setInternalname( "vCROL_TIPO" );
      divRol_tipofiltercontainer_Internalname = "ROL_TIPOFILTERCONTAINER" ;
      lblLblrol_usuariocreafilter_Internalname = "LBLROL_USUARIOCREAFILTER" ;
      edtavCrol_usuariocrea_Internalname = "vCROL_USUARIOCREA" ;
      divRol_usuariocreafiltercontainer_Internalname = "ROL_USUARIOCREAFILTERCONTAINER" ;
      lblLblrol_fechacreafilter_Internalname = "LBLROL_FECHACREAFILTER" ;
      edtavCrol_fechacrea_Internalname = "vCROL_FECHACREA" ;
      divRol_fechacreafiltercontainer_Internalname = "ROL_FECHACREAFILTERCONTAINER" ;
      lblLblrol_usuariomodificafilter_Internalname = "LBLROL_USUARIOMODIFICAFILTER" ;
      edtavCrol_usuariomodifica_Internalname = "vCROL_USUARIOMODIFICA" ;
      divRol_usuariomodificafiltercontainer_Internalname = "ROL_USUARIOMODIFICAFILTERCONTAINER" ;
      lblLblrol_fechamodificafilter_Internalname = "LBLROL_FECHAMODIFICAFILTER" ;
      edtavCrol_fechamodifica_Internalname = "vCROL_FECHAMODIFICA" ;
      divRol_fechamodificafiltercontainer_Internalname = "ROL_FECHAMODIFICAFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtRol_Id_Internalname = "ROL_ID" ;
      edtRol_Descripcion_Internalname = "ROL_DESCRIPCION" ;
      cmbRol_Tipo.setInternalname( "ROL_TIPO" );
      edtRol_UsuarioCrea_Internalname = "ROL_USUARIOCREA" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
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
      edtRol_UsuarioCrea_Jsonclick = "" ;
      cmbRol_Tipo.setJsonclick( "" );
      edtRol_Descripcion_Jsonclick = "" ;
      edtRol_Id_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtRol_Descripcion_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCrol_fechamodifica_Jsonclick = "" ;
      edtavCrol_fechamodifica_Enabled = 1 ;
      edtavCrol_usuariomodifica_Jsonclick = "" ;
      edtavCrol_usuariomodifica_Enabled = 1 ;
      edtavCrol_usuariomodifica_Visible = 1 ;
      edtavCrol_fechacrea_Jsonclick = "" ;
      edtavCrol_fechacrea_Enabled = 1 ;
      edtavCrol_usuariocrea_Jsonclick = "" ;
      edtavCrol_usuariocrea_Enabled = 1 ;
      edtavCrol_usuariocrea_Visible = 1 ;
      cmbavCrol_tipo.setJsonclick( "" );
      cmbavCrol_tipo.setEnabled( 1 );
      cmbavCrol_tipo.setVisible( 1 );
      edtavCrol_descripcion_Jsonclick = "" ;
      edtavCrol_descripcion_Enabled = 1 ;
      edtavCrol_descripcion_Visible = 1 ;
      edtavCrol_id_Jsonclick = "" ;
      edtavCrol_id_Enabled = 1 ;
      edtavCrol_id_Visible = 1 ;
      divRol_fechamodificafiltercontainer_Class = "AdvancedContainerItem" ;
      divRol_usuariomodificafiltercontainer_Class = "AdvancedContainerItem" ;
      divRol_fechacreafiltercontainer_Class = "AdvancedContainerItem" ;
      divRol_usuariocreafiltercontainer_Class = "AdvancedContainerItem" ;
      divRol_tipofiltercontainer_Class = "AdvancedContainerItem" ;
      divRol_descripcionfiltercontainer_Class = "AdvancedContainerItem" ;
      divRol_idfiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List ROL" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cRol_Id',fld:'vCROL_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cRol_Descripcion',fld:'vCROL_DESCRIPCION',pic:'@!',nv:''},{av:'cmbavCrol_tipo'},{av:'AV8cRol_Tipo',fld:'vCROL_TIPO',pic:'',nv:''},{av:'AV9cRol_UsuarioCrea',fld:'vCROL_USUARIOCREA',pic:'@!',nv:''},{av:'AV10cRol_FechaCrea',fld:'vCROL_FECHACREA',pic:'99/99/99 99:99',nv:''},{av:'AV11cRol_UsuarioModifica',fld:'vCROL_USUARIOMODIFICA',pic:'@!',nv:''},{av:'AV12cRol_FechaModifica',fld:'vCROL_FECHAMODIFICA',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e188A1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLROL_IDFILTER.CLICK","{handler:'e118A1',iparms:[{av:'divRol_idfiltercontainer_Class',ctrl:'ROL_IDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divRol_idfiltercontainer_Class',ctrl:'ROL_IDFILTERCONTAINER',prop:'Class'},{av:'edtavCrol_id_Visible',ctrl:'vCROL_ID',prop:'Visible'}]}");
      setEventMetadata("LBLROL_DESCRIPCIONFILTER.CLICK","{handler:'e128A1',iparms:[{av:'divRol_descripcionfiltercontainer_Class',ctrl:'ROL_DESCRIPCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divRol_descripcionfiltercontainer_Class',ctrl:'ROL_DESCRIPCIONFILTERCONTAINER',prop:'Class'},{av:'edtavCrol_descripcion_Visible',ctrl:'vCROL_DESCRIPCION',prop:'Visible'}]}");
      setEventMetadata("LBLROL_TIPOFILTER.CLICK","{handler:'e138A1',iparms:[{av:'divRol_tipofiltercontainer_Class',ctrl:'ROL_TIPOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divRol_tipofiltercontainer_Class',ctrl:'ROL_TIPOFILTERCONTAINER',prop:'Class'},{av:'cmbavCrol_tipo'}]}");
      setEventMetadata("LBLROL_USUARIOCREAFILTER.CLICK","{handler:'e148A1',iparms:[{av:'divRol_usuariocreafiltercontainer_Class',ctrl:'ROL_USUARIOCREAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divRol_usuariocreafiltercontainer_Class',ctrl:'ROL_USUARIOCREAFILTERCONTAINER',prop:'Class'},{av:'edtavCrol_usuariocrea_Visible',ctrl:'vCROL_USUARIOCREA',prop:'Visible'}]}");
      setEventMetadata("LBLROL_FECHACREAFILTER.CLICK","{handler:'e158A1',iparms:[{av:'divRol_fechacreafiltercontainer_Class',ctrl:'ROL_FECHACREAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divRol_fechacreafiltercontainer_Class',ctrl:'ROL_FECHACREAFILTERCONTAINER',prop:'Class'}]}");
      setEventMetadata("LBLROL_USUARIOMODIFICAFILTER.CLICK","{handler:'e168A1',iparms:[{av:'divRol_usuariomodificafiltercontainer_Class',ctrl:'ROL_USUARIOMODIFICAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divRol_usuariomodificafiltercontainer_Class',ctrl:'ROL_USUARIOMODIFICAFILTERCONTAINER',prop:'Class'},{av:'edtavCrol_usuariomodifica_Visible',ctrl:'vCROL_USUARIOMODIFICA',prop:'Visible'}]}");
      setEventMetadata("LBLROL_FECHAMODIFICAFILTER.CLICK","{handler:'e178A1',iparms:[{av:'divRol_fechamodificafiltercontainer_Class',ctrl:'ROL_FECHAMODIFICAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divRol_fechamodificafiltercontainer_Class',ctrl:'ROL_FECHAMODIFICAFILTERCONTAINER',prop:'Class'}]}");
      setEventMetadata("ENTER","{handler:'e218A2',iparms:[{av:'A21Rol_Id',fld:'ROL_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[{av:'AV13pRol_Id',fld:'vPROL_ID',pic:'ZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cRol_Id',fld:'vCROL_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cRol_Descripcion',fld:'vCROL_DESCRIPCION',pic:'@!',nv:''},{av:'cmbavCrol_tipo'},{av:'AV8cRol_Tipo',fld:'vCROL_TIPO',pic:'',nv:''},{av:'AV9cRol_UsuarioCrea',fld:'vCROL_USUARIOCREA',pic:'@!',nv:''},{av:'AV10cRol_FechaCrea',fld:'vCROL_FECHACREA',pic:'99/99/99 99:99',nv:''},{av:'AV11cRol_UsuarioModifica',fld:'vCROL_USUARIOMODIFICA',pic:'@!',nv:''},{av:'AV12cRol_FechaModifica',fld:'vCROL_FECHAMODIFICA',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cRol_Id',fld:'vCROL_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cRol_Descripcion',fld:'vCROL_DESCRIPCION',pic:'@!',nv:''},{av:'cmbavCrol_tipo'},{av:'AV8cRol_Tipo',fld:'vCROL_TIPO',pic:'',nv:''},{av:'AV9cRol_UsuarioCrea',fld:'vCROL_USUARIOCREA',pic:'@!',nv:''},{av:'AV10cRol_FechaCrea',fld:'vCROL_FECHACREA',pic:'99/99/99 99:99',nv:''},{av:'AV11cRol_UsuarioModifica',fld:'vCROL_USUARIOMODIFICA',pic:'@!',nv:''},{av:'AV12cRol_FechaModifica',fld:'vCROL_FECHAMODIFICA',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cRol_Id',fld:'vCROL_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cRol_Descripcion',fld:'vCROL_DESCRIPCION',pic:'@!',nv:''},{av:'cmbavCrol_tipo'},{av:'AV8cRol_Tipo',fld:'vCROL_TIPO',pic:'',nv:''},{av:'AV9cRol_UsuarioCrea',fld:'vCROL_USUARIOCREA',pic:'@!',nv:''},{av:'AV10cRol_FechaCrea',fld:'vCROL_FECHACREA',pic:'99/99/99 99:99',nv:''},{av:'AV11cRol_UsuarioModifica',fld:'vCROL_USUARIOMODIFICA',pic:'@!',nv:''},{av:'AV12cRol_FechaModifica',fld:'vCROL_FECHAMODIFICA',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cRol_Id',fld:'vCROL_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cRol_Descripcion',fld:'vCROL_DESCRIPCION',pic:'@!',nv:''},{av:'cmbavCrol_tipo'},{av:'AV8cRol_Tipo',fld:'vCROL_TIPO',pic:'',nv:''},{av:'AV9cRol_UsuarioCrea',fld:'vCROL_USUARIOCREA',pic:'@!',nv:''},{av:'AV10cRol_FechaCrea',fld:'vCROL_FECHACREA',pic:'99/99/99 99:99',nv:''},{av:'AV11cRol_UsuarioModifica',fld:'vCROL_USUARIOMODIFICA',pic:'@!',nv:''},{av:'AV12cRol_FechaModifica',fld:'vCROL_FECHAMODIFICA',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
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
      AV7cRol_Descripcion = "" ;
      AV8cRol_Tipo = "" ;
      AV9cRol_UsuarioCrea = "" ;
      AV10cRol_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      AV11cRol_UsuarioModifica = "" ;
      AV12cRol_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblrol_idfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblrol_descripcionfilter_Jsonclick = "" ;
      lblLblrol_tipofilter_Jsonclick = "" ;
      lblLblrol_usuariocreafilter_Jsonclick = "" ;
      lblLblrol_fechacreafilter_Jsonclick = "" ;
      lblLblrol_usuariomodificafilter_Jsonclick = "" ;
      lblLblrol_fechamodificafilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A22Rol_Descripcion = "" ;
      A402Rol_Tipo = "" ;
      A211Rol_UsuarioCrea = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV17Linkselection_GXI = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV7cRol_Descripcion = "" ;
      lV8cRol_Tipo = "" ;
      lV9cRol_UsuarioCrea = "" ;
      lV11cRol_UsuarioModifica = "" ;
      A212Rol_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A213Rol_UsuarioModifica = "" ;
      A214Rol_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      H008A2_A214Rol_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H008A2_A213Rol_UsuarioModifica = new String[] {""} ;
      H008A2_A212Rol_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      H008A2_A211Rol_UsuarioCrea = new String[] {""} ;
      H008A2_A402Rol_Tipo = new String[] {""} ;
      H008A2_A22Rol_Descripcion = new String[] {""} ;
      H008A2_A21Rol_Id = new long[1] ;
      H008A3_AGRID1_nRecordCount = new long[1] ;
      AV14ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.gx00r0__default(),
         new Object[] {
             new Object[] {
            H008A2_A214Rol_FechaModifica, H008A2_A213Rol_UsuarioModifica, H008A2_A212Rol_FechaCrea, H008A2_A211Rol_UsuarioCrea, H008A2_A402Rol_Tipo, H008A2_A22Rol_Descripcion, H008A2_A21Rol_Id
            }
            , new Object[] {
            H008A3_AGRID1_nRecordCount
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
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
   private short nRC_GXsfl_84 ;
   private short nGXsfl_84_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid1_Rows ;
   private int edtavCrol_id_Enabled ;
   private int edtavCrol_id_Visible ;
   private int edtavCrol_descripcion_Visible ;
   private int edtavCrol_descripcion_Enabled ;
   private int edtavCrol_usuariocrea_Visible ;
   private int edtavCrol_usuariocrea_Enabled ;
   private int edtavCrol_fechacrea_Enabled ;
   private int edtavCrol_usuariomodifica_Visible ;
   private int edtavCrol_usuariomodifica_Enabled ;
   private int edtavCrol_fechamodifica_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long AV6cRol_Id ;
   private long AV13pRol_Id ;
   private long GRID1_nFirstRecordOnPage ;
   private long A21Rol_Id ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divRol_idfiltercontainer_Class ;
   private String divRol_descripcionfiltercontainer_Class ;
   private String divRol_tipofiltercontainer_Class ;
   private String divRol_usuariocreafiltercontainer_Class ;
   private String divRol_fechacreafiltercontainer_Class ;
   private String divRol_usuariomodificafiltercontainer_Class ;
   private String divRol_fechamodificafiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_84_idx="0001" ;
   private String AV8cRol_Tipo ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divRol_idfiltercontainer_Internalname ;
   private String lblLblrol_idfilter_Internalname ;
   private String lblLblrol_idfilter_Jsonclick ;
   private String edtavCrol_id_Internalname ;
   private String TempTags ;
   private String edtavCrol_id_Jsonclick ;
   private String divRol_descripcionfiltercontainer_Internalname ;
   private String lblLblrol_descripcionfilter_Internalname ;
   private String lblLblrol_descripcionfilter_Jsonclick ;
   private String edtavCrol_descripcion_Internalname ;
   private String edtavCrol_descripcion_Jsonclick ;
   private String divRol_tipofiltercontainer_Internalname ;
   private String lblLblrol_tipofilter_Internalname ;
   private String lblLblrol_tipofilter_Jsonclick ;
   private String divRol_usuariocreafiltercontainer_Internalname ;
   private String lblLblrol_usuariocreafilter_Internalname ;
   private String lblLblrol_usuariocreafilter_Jsonclick ;
   private String edtavCrol_usuariocrea_Internalname ;
   private String edtavCrol_usuariocrea_Jsonclick ;
   private String divRol_fechacreafiltercontainer_Internalname ;
   private String lblLblrol_fechacreafilter_Internalname ;
   private String lblLblrol_fechacreafilter_Jsonclick ;
   private String edtavCrol_fechacrea_Internalname ;
   private String edtavCrol_fechacrea_Jsonclick ;
   private String divRol_usuariomodificafiltercontainer_Internalname ;
   private String lblLblrol_usuariomodificafilter_Internalname ;
   private String lblLblrol_usuariomodificafilter_Jsonclick ;
   private String edtavCrol_usuariomodifica_Internalname ;
   private String edtavCrol_usuariomodifica_Jsonclick ;
   private String divRol_fechamodificafiltercontainer_Internalname ;
   private String lblLblrol_fechamodificafilter_Internalname ;
   private String lblLblrol_fechamodificafilter_Jsonclick ;
   private String edtavCrol_fechamodifica_Internalname ;
   private String edtavCrol_fechamodifica_Jsonclick ;
   private String divGridtable_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtntoggle_Internalname ;
   private String bttBtntoggle_Jsonclick ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String edtavLinkselection_Link ;
   private String edtRol_Descripcion_Link ;
   private String A402Rol_Tipo ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtRol_Id_Internalname ;
   private String edtRol_Descripcion_Internalname ;
   private String edtRol_UsuarioCrea_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV8cRol_Tipo ;
   private String AV14ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_84_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtRol_Id_Jsonclick ;
   private String edtRol_Descripcion_Jsonclick ;
   private String edtRol_UsuarioCrea_Jsonclick ;
   private java.util.Date AV10cRol_FechaCrea ;
   private java.util.Date AV12cRol_FechaModifica ;
   private java.util.Date A212Rol_FechaCrea ;
   private java.util.Date A214Rol_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_84_Refreshing=false ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV7cRol_Descripcion ;
   private String AV9cRol_UsuarioCrea ;
   private String AV11cRol_UsuarioModifica ;
   private String A22Rol_Descripcion ;
   private String A211Rol_UsuarioCrea ;
   private String AV17Linkselection_GXI ;
   private String lV7cRol_Descripcion ;
   private String lV9cRol_UsuarioCrea ;
   private String lV11cRol_UsuarioModifica ;
   private String A213Rol_UsuarioModifica ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private HTMLChoice cmbavCrol_tipo ;
   private HTMLChoice cmbRol_Tipo ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] H008A2_A214Rol_FechaModifica ;
   private String[] H008A2_A213Rol_UsuarioModifica ;
   private java.util.Date[] H008A2_A212Rol_FechaCrea ;
   private String[] H008A2_A211Rol_UsuarioCrea ;
   private String[] H008A2_A402Rol_Tipo ;
   private String[] H008A2_A22Rol_Descripcion ;
   private long[] H008A2_A21Rol_Id ;
   private long[] H008A3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx00r0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H008A2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV7cRol_Descripcion ,
                                          String AV8cRol_Tipo ,
                                          String AV9cRol_UsuarioCrea ,
                                          java.util.Date AV10cRol_FechaCrea ,
                                          String AV11cRol_UsuarioModifica ,
                                          java.util.Date AV12cRol_FechaModifica ,
                                          String A22Rol_Descripcion ,
                                          String A402Rol_Tipo ,
                                          String A211Rol_UsuarioCrea ,
                                          java.util.Date A212Rol_FechaCrea ,
                                          String A213Rol_UsuarioModifica ,
                                          java.util.Date A214Rol_FechaModifica ,
                                          long AV6cRol_Id )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int1 ;
      GXv_int1 = new byte [10] ;
      Object[] GXv_Object2 ;
      GXv_Object2 = new Object [2] ;
      String sSelectString ;
      String sFromString ;
      String sOrderString ;
      sSelectString = " /*+ FIRST_ROWS(11) */ Rol_FechaModifica, Rol_UsuarioModifica, Rol_FechaCrea, Rol_UsuarioCrea," ;
      sSelectString = sSelectString + " Rol_Tipo, Rol_Descripcion, Rol_Id" ;
      sFromString = " FROM SEG_ROL" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (Rol_Id >= ?)" ;
      if ( ! (GXutil.strcmp("", AV7cRol_Descripcion)==0) )
      {
         sWhereString = sWhereString + " and (Rol_Descripcion like ?)" ;
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cRol_Tipo)==0) )
      {
         sWhereString = sWhereString + " and (Rol_Tipo like ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cRol_UsuarioCrea)==0) )
      {
         sWhereString = sWhereString + " and (Rol_UsuarioCrea like ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV10cRol_FechaCrea) )
      {
         sWhereString = sWhereString + " and (Rol_FechaCrea >= ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11cRol_UsuarioModifica)==0) )
      {
         sWhereString = sWhereString + " and (Rol_UsuarioModifica like ?)" ;
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV12cRol_FechaModifica) )
      {
         sWhereString = sWhereString + " and (Rol_FechaModifica >= ?)" ;
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY Rol_Id" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT (CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H008A3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV7cRol_Descripcion ,
                                          String AV8cRol_Tipo ,
                                          String AV9cRol_UsuarioCrea ,
                                          java.util.Date AV10cRol_FechaCrea ,
                                          String AV11cRol_UsuarioModifica ,
                                          java.util.Date AV12cRol_FechaModifica ,
                                          String A22Rol_Descripcion ,
                                          String A402Rol_Tipo ,
                                          String A211Rol_UsuarioCrea ,
                                          java.util.Date A212Rol_FechaCrea ,
                                          String A213Rol_UsuarioModifica ,
                                          java.util.Date A214Rol_FechaModifica ,
                                          long AV6cRol_Id )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [7] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM SEG_ROL" ;
      scmdbuf = scmdbuf + " WHERE (Rol_Id >= ?)" ;
      if ( ! (GXutil.strcmp("", AV7cRol_Descripcion)==0) )
      {
         sWhereString = sWhereString + " and (Rol_Descripcion like ?)" ;
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cRol_Tipo)==0) )
      {
         sWhereString = sWhereString + " and (Rol_Tipo like ?)" ;
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cRol_UsuarioCrea)==0) )
      {
         sWhereString = sWhereString + " and (Rol_UsuarioCrea like ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV10cRol_FechaCrea) )
      {
         sWhereString = sWhereString + " and (Rol_FechaCrea >= ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11cRol_UsuarioModifica)==0) )
      {
         sWhereString = sWhereString + " and (Rol_UsuarioModifica like ?)" ;
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV12cRol_FechaModifica) )
      {
         sWhereString = sWhereString + " and (Rol_FechaModifica >= ?)" ;
      }
      else
      {
         GXv_int3[6] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
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
                  return conditional_H008A2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).longValue() );
            case 1 :
                  return conditional_H008A3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H008A2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H008A3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getString(5, 1) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((long[]) buf[6])[0] = rslt.getLong(7) ;
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
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 50);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[14], false);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[16], false);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[7]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[8], 50);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[11], false);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[13], false);
               }
               return;
      }
   }

}

