/*
               File: gx00q0_impl
        Description: Selection List ROL Y PANTALLAS
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:24:41.46
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

public final  class gx00q0_impl extends GXDataArea
{
   public gx00q0_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx00q0_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx00q0_impl.class ));
   }

   public gx00q0_impl( int remoteHandle ,
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
            nRC_GXsfl_74 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_74_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_74_idx = httpContext.GetNextPar( ) ;
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
            AV7cPant_Id = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV8cRolP_UsuarioCrea = httpContext.GetNextPar( ) ;
            AV9cRolP_UsuarioModifica = httpContext.GetNextPar( ) ;
            AV10cRolP_FechaModifica = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
            AV11cRolP_FechaCrea = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cRol_Id, AV7cPant_Id, AV8cRolP_UsuarioCrea, AV9cRolP_UsuarioModifica, AV10cRolP_FechaModifica, AV11cRolP_FechaCrea) ;
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
            AV12pRol_Id = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12pRol_Id", GXutil.ltrim( GXutil.str( AV12pRol_Id, 11, 0)));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV13pPant_Id = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13pPant_Id", GXutil.ltrim( GXutil.str( AV13pPant_Id, 6, 0)));
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
      pa8P2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start8P2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414244153");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.gx00q0") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV12pRol_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pPant_Id,6,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCPANT_ID", GXutil.ltrim( localUtil.ntoc( AV7cPant_Id, (byte)(6), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCROLP_USUARIOCREA", AV8cRolP_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCROLP_USUARIOMODIFICA", AV9cRolP_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCROLP_FECHAMODIFICA", localUtil.ttoc( AV10cRolP_FechaModifica, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCROLP_FECHACREA", localUtil.ttoc( AV11cRolP_FechaCrea, 10, 8, 0, 3, "/", ":", " "));
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_74", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_74, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPROL_ID", GXutil.ltrim( localUtil.ntoc( AV12pRol_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPPANT_ID", GXutil.ltrim( localUtil.ntoc( AV13pPant_Id, (byte)(6), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ROL_IDFILTERCONTAINER_Class", GXutil.rtrim( divRol_idfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PANT_IDFILTERCONTAINER_Class", GXutil.rtrim( divPant_idfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ROLP_USUARIOCREAFILTERCONTAINER_Class", GXutil.rtrim( divRolp_usuariocreafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ROLP_USUARIOMODIFICAFILTERCONTAINER_Class", GXutil.rtrim( divRolp_usuariomodificafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ROLP_FECHAMODIFICAFILTERCONTAINER_Class", GXutil.rtrim( divRolp_fechamodificafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ROLP_FECHACREAFILTERCONTAINER_Class", GXutil.rtrim( divRolp_fechacreafiltercontainer_Class));
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
         we8P2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt8P2( ) ;
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
      return formatLink("com.orions2.gx00q0") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV12pRol_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pPant_Id,6,0))) ;
   }

   public String getPgmname( )
   {
      return "Gx00Q0" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List ROL Y PANTALLAS" ;
   }

   public void wb8P0( )
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblrol_idfilter_Internalname, "Identificador del Rol", "", "", lblLblrol_idfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e118p1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00Q0.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCrol_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cRol_Id, (byte)(11), (byte)(0), ",", "")), ((edtavCrol_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6cRol_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV6cRol_Id), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCrol_id_Jsonclick, 0, "Attribute", "", "", "", edtavCrol_id_Visible, edtavCrol_id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx00Q0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divPant_idfiltercontainer_Internalname, 1, 0, "px", 0, "px", divPant_idfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblpant_idfilter_Internalname, "Identificador Pantalla", "", "", lblLblpant_idfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e128p1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00Q0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCpant_id_Internalname, "Identificador Pantalla", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCpant_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV7cPant_Id, (byte)(6), (byte)(0), ",", "")), ((edtavCpant_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV7cPant_Id), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV7cPant_Id), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCpant_id_Jsonclick, 0, "Attribute", "", "", "", edtavCpant_id_Visible, edtavCpant_id_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx00Q0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divRolp_usuariocreafiltercontainer_Internalname, 1, 0, "px", 0, "px", divRolp_usuariocreafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblrolp_usuariocreafilter_Internalname, "Usuario Creación Rol Pantalla", "", "", lblLblrolp_usuariocreafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e138p1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00Q0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCrolp_usuariocrea_Internalname, "Usuario Creación Rol Pantalla", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCrolp_usuariocrea_Internalname, AV8cRolP_UsuarioCrea, GXutil.rtrim( localUtil.format( AV8cRolP_UsuarioCrea, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCrolp_usuariocrea_Jsonclick, 0, "Attribute", "", "", "", edtavCrolp_usuariocrea_Visible, edtavCrolp_usuariocrea_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx00Q0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divRolp_usuariomodificafiltercontainer_Internalname, 1, 0, "px", 0, "px", divRolp_usuariomodificafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblrolp_usuariomodificafilter_Internalname, "Usuario Modifica Rol Pantalla", "", "", lblLblrolp_usuariomodificafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e148p1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00Q0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCrolp_usuariomodifica_Internalname, "Usuario Modifica Rol Pantalla", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCrolp_usuariomodifica_Internalname, AV9cRolP_UsuarioModifica, GXutil.rtrim( localUtil.format( AV9cRolP_UsuarioModifica, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCrolp_usuariomodifica_Jsonclick, 0, "Attribute", "", "", "", edtavCrolp_usuariomodifica_Visible, edtavCrolp_usuariomodifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx00Q0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divRolp_fechamodificafiltercontainer_Internalname, 1, 0, "px", 0, "px", divRolp_fechamodificafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblrolp_fechamodificafilter_Internalname, "Fecha Modifica Rol Pantalla", "", "", lblLblrolp_fechamodificafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e158p1_client"+"'", "", "WWAdvancedLabel WWDateFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00Q0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCrolp_fechamodifica_Internalname, "Fecha Modifica Rol Pantalla", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCrolp_fechamodifica_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCrolp_fechamodifica_Internalname, localUtil.ttoc( AV10cRolP_FechaModifica, 10, 8, 0, 3, "/", ":", " "), localUtil.format( AV10cRolP_FechaModifica, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCrolp_fechamodifica_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCrolp_fechamodifica_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx00Q0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divRolp_fechacreafiltercontainer_Internalname, 1, 0, "px", 0, "px", divRolp_fechacreafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblrolp_fechacreafilter_Internalname, "Fecha Creación Rol Pantalla", "", "", lblLblrolp_fechacreafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e168p1_client"+"'", "", "WWAdvancedLabel WWDateFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00Q0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCrolp_fechacrea_Internalname, "Fecha Creación Rol Pantalla", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCrolp_fechacrea_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCrolp_fechacrea_Internalname, localUtil.ttoc( AV11cRolP_FechaCrea, 10, 8, 0, 3, "/", ":", " "), localUtil.format( AV11cRolP_FechaCrea, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCrolp_fechacrea_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCrolp_fechacrea_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx00Q0.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
         ClassString = bttBtntoggle_Class ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 74, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e178p1_client"+"'", TempTags, "", 2, "HLP_Gx00Q0.htm");
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"74\">") ;
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
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Identificador Pantalla") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Rol Pantalla") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Rol Pantalla") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A18Pant_Id, (byte)(6), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A215RolP_UsuarioCrea);
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtRolP_UsuarioCrea_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A217RolP_UsuarioModifica);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 74 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_74 = (short)(nGXsfl_74_idx-1) ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 74, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx00Q0.htm");
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

   public void start8P2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List ROL Y PANTALLAS", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup8P0( ) ;
   }

   public void ws8P2( )
   {
      start8P2( ) ;
      evt8P2( ) ;
   }

   public void evt8P2( )
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
                           nGXsfl_74_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_74_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_74_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_742( ) ;
                           AV5LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV17Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV5LinkSelection))), !bGXsfl_74_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV5LinkSelection), true);
                           A21Rol_Id = localUtil.ctol( httpContext.cgiGet( edtRol_Id_Internalname), ",", ".") ;
                           A18Pant_Id = (int)(localUtil.ctol( httpContext.cgiGet( edtPant_Id_Internalname), ",", ".")) ;
                           A215RolP_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtRolP_UsuarioCrea_Internalname)) ;
                           A217RolP_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtRolP_UsuarioModifica_Internalname)) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e188P2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e198P2 ();
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
                                    /* Set Refresh If Cpant_id Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCPANT_ID"), ",", ".") != AV7cPant_Id )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Crolp_usuariocrea Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCROLP_USUARIOCREA"), AV8cRolP_UsuarioCrea) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Crolp_usuariomodifica Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCROLP_USUARIOMODIFICA"), AV9cRolP_UsuarioModifica) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Crolp_fechamodifica Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCROLP_FECHAMODIFICA"), 0), AV10cRolP_FechaModifica) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Crolp_fechacrea Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCROLP_FECHACREA"), 0), AV11cRolP_FechaCrea) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e208P2 ();
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

   public void we8P2( )
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

   public void pa8P2( )
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
      subsflControlProps_742( ) ;
      while ( nGXsfl_74_idx <= nRC_GXsfl_74 )
      {
         sendrow_742( ) ;
         nGXsfl_74_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_74_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_74_idx+1)) ;
         sGXsfl_74_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_74_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_742( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  long AV6cRol_Id ,
                                  int AV7cPant_Id ,
                                  String AV8cRolP_UsuarioCrea ,
                                  String AV9cRolP_UsuarioModifica ,
                                  java.util.Date AV10cRolP_FechaModifica ,
                                  java.util.Date AV11cRolP_FechaCrea )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID1_nCurrentRecord = 0 ;
      rf8P2( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ROL_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A21Rol_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ROL_ID", GXutil.ltrim( localUtil.ntoc( A21Rol_Id, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_PANT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A18Pant_Id), "ZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PANT_ID", GXutil.ltrim( localUtil.ntoc( A18Pant_Id, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ROLP_USUARIOCREA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A215RolP_UsuarioCrea, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ROLP_USUARIOCREA", A215RolP_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ROLP_USUARIOMODIFICA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A217RolP_UsuarioModifica, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ROLP_USUARIOMODIFICA", A217RolP_UsuarioModifica);
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf8P2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf8P2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(74) ;
      nGXsfl_74_idx = (short)(1) ;
      sGXsfl_74_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_74_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_742( ) ;
      bGXsfl_74_Refreshing = true ;
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
         subsflControlProps_742( ) ;
         GXPagingFrom2 = (int)(((10==0) ? 0 : GRID1_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((10==0) ? 10000 : subgrid1_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV8cRolP_UsuarioCrea ,
                                              AV9cRolP_UsuarioModifica ,
                                              AV10cRolP_FechaModifica ,
                                              AV11cRolP_FechaCrea ,
                                              A215RolP_UsuarioCrea ,
                                              A217RolP_UsuarioModifica ,
                                              A218RolP_FechaModifica ,
                                              A216RolP_FechaCrea ,
                                              new Long(AV6cRol_Id) ,
                                              new Integer(AV7cPant_Id) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.INT
                                              }
         } ) ;
         lV8cRolP_UsuarioCrea = GXutil.concat( GXutil.rtrim( AV8cRolP_UsuarioCrea), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cRolP_UsuarioCrea", AV8cRolP_UsuarioCrea);
         lV9cRolP_UsuarioModifica = GXutil.concat( GXutil.rtrim( AV9cRolP_UsuarioModifica), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cRolP_UsuarioModifica", AV9cRolP_UsuarioModifica);
         /* Using cursor H008P2 */
         pr_default.execute(0, new Object[] {new Long(AV6cRol_Id), new Integer(AV7cPant_Id), lV8cRolP_UsuarioCrea, lV9cRolP_UsuarioModifica, AV10cRolP_FechaModifica, AV11cRolP_FechaCrea, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_74_idx = (short)(1) ;
         sGXsfl_74_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_74_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_742( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A216RolP_FechaCrea = H008P2_A216RolP_FechaCrea[0] ;
            A218RolP_FechaModifica = H008P2_A218RolP_FechaModifica[0] ;
            A217RolP_UsuarioModifica = H008P2_A217RolP_UsuarioModifica[0] ;
            A215RolP_UsuarioCrea = H008P2_A215RolP_UsuarioCrea[0] ;
            A18Pant_Id = H008P2_A18Pant_Id[0] ;
            A21Rol_Id = H008P2_A21Rol_Id[0] ;
            /* Execute user event: Load */
            e198P2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(74) ;
         wb8P0( ) ;
      }
      bGXsfl_74_Refreshing = true ;
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
                                           AV8cRolP_UsuarioCrea ,
                                           AV9cRolP_UsuarioModifica ,
                                           AV10cRolP_FechaModifica ,
                                           AV11cRolP_FechaCrea ,
                                           A215RolP_UsuarioCrea ,
                                           A217RolP_UsuarioModifica ,
                                           A218RolP_FechaModifica ,
                                           A216RolP_FechaCrea ,
                                           new Long(AV6cRol_Id) ,
                                           new Integer(AV7cPant_Id) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.INT
                                           }
      } ) ;
      lV8cRolP_UsuarioCrea = GXutil.concat( GXutil.rtrim( AV8cRolP_UsuarioCrea), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8cRolP_UsuarioCrea", AV8cRolP_UsuarioCrea);
      lV9cRolP_UsuarioModifica = GXutil.concat( GXutil.rtrim( AV9cRolP_UsuarioModifica), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9cRolP_UsuarioModifica", AV9cRolP_UsuarioModifica);
      /* Using cursor H008P3 */
      pr_default.execute(1, new Object[] {new Long(AV6cRol_Id), new Integer(AV7cPant_Id), lV8cRolP_UsuarioCrea, lV9cRolP_UsuarioModifica, AV10cRolP_FechaModifica, AV11cRolP_FechaCrea});
      GRID1_nRecordCount = H008P3_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cRol_Id, AV7cPant_Id, AV8cRolP_UsuarioCrea, AV9cRolP_UsuarioModifica, AV10cRolP_FechaModifica, AV11cRolP_FechaCrea) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cRol_Id, AV7cPant_Id, AV8cRolP_UsuarioCrea, AV9cRolP_UsuarioModifica, AV10cRolP_FechaModifica, AV11cRolP_FechaCrea) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cRol_Id, AV7cPant_Id, AV8cRolP_UsuarioCrea, AV9cRolP_UsuarioModifica, AV10cRolP_FechaModifica, AV11cRolP_FechaCrea) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cRol_Id, AV7cPant_Id, AV8cRolP_UsuarioCrea, AV9cRolP_UsuarioModifica, AV10cRolP_FechaModifica, AV11cRolP_FechaCrea) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cRol_Id, AV7cPant_Id, AV8cRolP_UsuarioCrea, AV9cRolP_UsuarioModifica, AV10cRolP_FechaModifica, AV11cRolP_FechaCrea) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup8P0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e188P2 ();
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCpant_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCpant_id_Internalname), ",", ".") > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCPANT_ID");
            GX_FocusControl = edtavCpant_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7cPant_Id = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cPant_Id", GXutil.ltrim( GXutil.str( AV7cPant_Id, 6, 0)));
         }
         else
         {
            AV7cPant_Id = (int)(localUtil.ctol( httpContext.cgiGet( edtavCpant_id_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cPant_Id", GXutil.ltrim( GXutil.str( AV7cPant_Id, 6, 0)));
         }
         AV8cRolP_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtavCrolp_usuariocrea_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cRolP_UsuarioCrea", AV8cRolP_UsuarioCrea);
         AV9cRolP_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtavCrolp_usuariomodifica_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cRolP_UsuarioModifica", AV9cRolP_UsuarioModifica);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCrolp_fechamodifica_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vCROLP_FECHAMODIFICA");
            GX_FocusControl = edtavCrolp_fechamodifica_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10cRolP_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV10cRolP_FechaModifica", localUtil.ttoc( AV10cRolP_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         }
         else
         {
            AV10cRolP_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtavCrolp_fechamodifica_Internalname), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cRolP_FechaModifica", localUtil.ttoc( AV10cRolP_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCrolp_fechacrea_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vCROLP_FECHACREA");
            GX_FocusControl = edtavCrolp_fechacrea_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11cRolP_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV11cRolP_FechaCrea", localUtil.ttoc( AV11cRolP_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
         }
         else
         {
            AV11cRolP_FechaCrea = localUtil.ctot( httpContext.cgiGet( edtavCrolp_fechacrea_Internalname), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cRolP_FechaCrea", localUtil.ttoc( AV11cRolP_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
         }
         /* Read saved values. */
         nRC_GXsfl_74 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_74"), ",", ".")) ;
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
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCPANT_ID"), ",", ".") != AV7cPant_Id )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCROLP_USUARIOCREA"), AV8cRolP_UsuarioCrea) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCROLP_USUARIOMODIFICA"), AV9cRolP_UsuarioModifica) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCROLP_FECHAMODIFICA"), 0), AV10cRolP_FechaModifica) ) )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCROLP_FECHACREA"), 0), AV11cRolP_FechaCrea) ) )
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
      e188P2 ();
      if (returnInSub) return;
   }

   public void e188P2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "ROL Y PANTALLAS", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV14ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e198P2( )
   {
      /* Load Routine */
      AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      AV17Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      sendrow_742( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_74_Refreshing )
      {
         httpContext.doAjaxLoad(74, Grid1Row);
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e208P2 ();
      if (returnInSub) return;
   }

   public void e208P2( )
   {
      /* Enter Routine */
      AV12pRol_Id = A21Rol_Id ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12pRol_Id", GXutil.ltrim( GXutil.str( AV12pRol_Id, 11, 0)));
      AV13pPant_Id = A18Pant_Id ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pPant_Id", GXutil.ltrim( GXutil.str( AV13pPant_Id, 6, 0)));
      httpContext.setWebReturnParms(new Object[] {new Long(AV12pRol_Id),new Integer(AV13pPant_Id)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV12pRol_Id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12pRol_Id", GXutil.ltrim( GXutil.str( AV12pRol_Id, 11, 0)));
      AV13pPant_Id = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pPant_Id", GXutil.ltrim( GXutil.str( AV13pPant_Id, 6, 0)));
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
      pa8P2( ) ;
      ws8P2( ) ;
      we8P2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414244260");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gx00q0.js", "?201861414244260");
      /* End function include_jscripts */
   }

   public void subsflControlProps_742( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_74_idx ;
      edtRol_Id_Internalname = "ROL_ID_"+sGXsfl_74_idx ;
      edtPant_Id_Internalname = "PANT_ID_"+sGXsfl_74_idx ;
      edtRolP_UsuarioCrea_Internalname = "ROLP_USUARIOCREA_"+sGXsfl_74_idx ;
      edtRolP_UsuarioModifica_Internalname = "ROLP_USUARIOMODIFICA_"+sGXsfl_74_idx ;
   }

   public void subsflControlProps_fel_742( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_74_fel_idx ;
      edtRol_Id_Internalname = "ROL_ID_"+sGXsfl_74_fel_idx ;
      edtPant_Id_Internalname = "PANT_ID_"+sGXsfl_74_fel_idx ;
      edtRolP_UsuarioCrea_Internalname = "ROLP_USUARIOCREA_"+sGXsfl_74_fel_idx ;
      edtRolP_UsuarioModifica_Internalname = "ROLP_USUARIOMODIFICA_"+sGXsfl_74_fel_idx ;
   }

   public void sendrow_742( )
   {
      subsflControlProps_742( ) ;
      wb8P0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_74_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_74_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_74_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A21Rol_Id, (byte)(11), (byte)(0), ",", "")))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A18Pant_Id, (byte)(6), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link, !bGXsfl_74_Refreshing);
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
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRol_Id_Internalname,GXutil.ltrim( localUtil.ntoc( A21Rol_Id, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A21Rol_Id), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRol_Id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPant_Id_Internalname,GXutil.ltrim( localUtil.ntoc( A18Pant_Id, (byte)(6), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A18Pant_Id), "ZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPant_Id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(6),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Codigo","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         edtRolP_UsuarioCrea_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A21Rol_Id, (byte)(11), (byte)(0), ",", "")))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A18Pant_Id, (byte)(6), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtRolP_UsuarioCrea_Internalname, "Link", edtRolP_UsuarioCrea_Link, !bGXsfl_74_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRolP_UsuarioCrea_Internalname,A215RolP_UsuarioCrea,GXutil.rtrim( localUtil.format( A215RolP_UsuarioCrea, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'",edtRolP_UsuarioCrea_Link,"","","",edtRolP_UsuarioCrea_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRolP_UsuarioModifica_Internalname,A217RolP_UsuarioModifica,GXutil.rtrim( localUtil.format( A217RolP_UsuarioModifica, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRolP_UsuarioModifica_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ROL_ID"+"_"+sGXsfl_74_idx, getSecureSignedToken( sGXsfl_74_idx, localUtil.format( DecimalUtil.doubleToDec(A21Rol_Id), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_PANT_ID"+"_"+sGXsfl_74_idx, getSecureSignedToken( sGXsfl_74_idx, localUtil.format( DecimalUtil.doubleToDec(A18Pant_Id), "ZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ROLP_USUARIOCREA"+"_"+sGXsfl_74_idx, getSecureSignedToken( sGXsfl_74_idx, GXutil.rtrim( localUtil.format( A215RolP_UsuarioCrea, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ROLP_USUARIOMODIFICA"+"_"+sGXsfl_74_idx, getSecureSignedToken( sGXsfl_74_idx, GXutil.rtrim( localUtil.format( A217RolP_UsuarioModifica, "@!"))));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_74_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_74_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_74_idx+1)) ;
         sGXsfl_74_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_74_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_742( ) ;
      }
      /* End function sendrow_742 */
   }

   public void init_default_properties( )
   {
      lblLblrol_idfilter_Internalname = "LBLROL_IDFILTER" ;
      edtavCrol_id_Internalname = "vCROL_ID" ;
      divRol_idfiltercontainer_Internalname = "ROL_IDFILTERCONTAINER" ;
      lblLblpant_idfilter_Internalname = "LBLPANT_IDFILTER" ;
      edtavCpant_id_Internalname = "vCPANT_ID" ;
      divPant_idfiltercontainer_Internalname = "PANT_IDFILTERCONTAINER" ;
      lblLblrolp_usuariocreafilter_Internalname = "LBLROLP_USUARIOCREAFILTER" ;
      edtavCrolp_usuariocrea_Internalname = "vCROLP_USUARIOCREA" ;
      divRolp_usuariocreafiltercontainer_Internalname = "ROLP_USUARIOCREAFILTERCONTAINER" ;
      lblLblrolp_usuariomodificafilter_Internalname = "LBLROLP_USUARIOMODIFICAFILTER" ;
      edtavCrolp_usuariomodifica_Internalname = "vCROLP_USUARIOMODIFICA" ;
      divRolp_usuariomodificafiltercontainer_Internalname = "ROLP_USUARIOMODIFICAFILTERCONTAINER" ;
      lblLblrolp_fechamodificafilter_Internalname = "LBLROLP_FECHAMODIFICAFILTER" ;
      edtavCrolp_fechamodifica_Internalname = "vCROLP_FECHAMODIFICA" ;
      divRolp_fechamodificafiltercontainer_Internalname = "ROLP_FECHAMODIFICAFILTERCONTAINER" ;
      lblLblrolp_fechacreafilter_Internalname = "LBLROLP_FECHACREAFILTER" ;
      edtavCrolp_fechacrea_Internalname = "vCROLP_FECHACREA" ;
      divRolp_fechacreafiltercontainer_Internalname = "ROLP_FECHACREAFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtRol_Id_Internalname = "ROL_ID" ;
      edtPant_Id_Internalname = "PANT_ID" ;
      edtRolP_UsuarioCrea_Internalname = "ROLP_USUARIOCREA" ;
      edtRolP_UsuarioModifica_Internalname = "ROLP_USUARIOMODIFICA" ;
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
      edtRolP_UsuarioModifica_Jsonclick = "" ;
      edtRolP_UsuarioCrea_Jsonclick = "" ;
      edtPant_Id_Jsonclick = "" ;
      edtRol_Id_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtRolP_UsuarioCrea_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCrolp_fechacrea_Jsonclick = "" ;
      edtavCrolp_fechacrea_Enabled = 1 ;
      edtavCrolp_fechamodifica_Jsonclick = "" ;
      edtavCrolp_fechamodifica_Enabled = 1 ;
      edtavCrolp_usuariomodifica_Jsonclick = "" ;
      edtavCrolp_usuariomodifica_Enabled = 1 ;
      edtavCrolp_usuariomodifica_Visible = 1 ;
      edtavCrolp_usuariocrea_Jsonclick = "" ;
      edtavCrolp_usuariocrea_Enabled = 1 ;
      edtavCrolp_usuariocrea_Visible = 1 ;
      edtavCpant_id_Jsonclick = "" ;
      edtavCpant_id_Enabled = 1 ;
      edtavCpant_id_Visible = 1 ;
      edtavCrol_id_Jsonclick = "" ;
      edtavCrol_id_Enabled = 1 ;
      edtavCrol_id_Visible = 1 ;
      divRolp_fechacreafiltercontainer_Class = "AdvancedContainerItem" ;
      divRolp_fechamodificafiltercontainer_Class = "AdvancedContainerItem" ;
      divRolp_usuariomodificafiltercontainer_Class = "AdvancedContainerItem" ;
      divRolp_usuariocreafiltercontainer_Class = "AdvancedContainerItem" ;
      divPant_idfiltercontainer_Class = "AdvancedContainerItem" ;
      divRol_idfiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List ROL Y PANTALLAS" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cRol_Id',fld:'vCROL_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cPant_Id',fld:'vCPANT_ID',pic:'ZZZZZ9',nv:0},{av:'AV8cRolP_UsuarioCrea',fld:'vCROLP_USUARIOCREA',pic:'@!',nv:''},{av:'AV9cRolP_UsuarioModifica',fld:'vCROLP_USUARIOMODIFICA',pic:'@!',nv:''},{av:'AV10cRolP_FechaModifica',fld:'vCROLP_FECHAMODIFICA',pic:'99/99/99 99:99',nv:''},{av:'AV11cRolP_FechaCrea',fld:'vCROLP_FECHACREA',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e178P1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLROL_IDFILTER.CLICK","{handler:'e118P1',iparms:[{av:'divRol_idfiltercontainer_Class',ctrl:'ROL_IDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divRol_idfiltercontainer_Class',ctrl:'ROL_IDFILTERCONTAINER',prop:'Class'},{av:'edtavCrol_id_Visible',ctrl:'vCROL_ID',prop:'Visible'}]}");
      setEventMetadata("LBLPANT_IDFILTER.CLICK","{handler:'e128P1',iparms:[{av:'divPant_idfiltercontainer_Class',ctrl:'PANT_IDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divPant_idfiltercontainer_Class',ctrl:'PANT_IDFILTERCONTAINER',prop:'Class'},{av:'edtavCpant_id_Visible',ctrl:'vCPANT_ID',prop:'Visible'}]}");
      setEventMetadata("LBLROLP_USUARIOCREAFILTER.CLICK","{handler:'e138P1',iparms:[{av:'divRolp_usuariocreafiltercontainer_Class',ctrl:'ROLP_USUARIOCREAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divRolp_usuariocreafiltercontainer_Class',ctrl:'ROLP_USUARIOCREAFILTERCONTAINER',prop:'Class'},{av:'edtavCrolp_usuariocrea_Visible',ctrl:'vCROLP_USUARIOCREA',prop:'Visible'}]}");
      setEventMetadata("LBLROLP_USUARIOMODIFICAFILTER.CLICK","{handler:'e148P1',iparms:[{av:'divRolp_usuariomodificafiltercontainer_Class',ctrl:'ROLP_USUARIOMODIFICAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divRolp_usuariomodificafiltercontainer_Class',ctrl:'ROLP_USUARIOMODIFICAFILTERCONTAINER',prop:'Class'},{av:'edtavCrolp_usuariomodifica_Visible',ctrl:'vCROLP_USUARIOMODIFICA',prop:'Visible'}]}");
      setEventMetadata("LBLROLP_FECHAMODIFICAFILTER.CLICK","{handler:'e158P1',iparms:[{av:'divRolp_fechamodificafiltercontainer_Class',ctrl:'ROLP_FECHAMODIFICAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divRolp_fechamodificafiltercontainer_Class',ctrl:'ROLP_FECHAMODIFICAFILTERCONTAINER',prop:'Class'}]}");
      setEventMetadata("LBLROLP_FECHACREAFILTER.CLICK","{handler:'e168P1',iparms:[{av:'divRolp_fechacreafiltercontainer_Class',ctrl:'ROLP_FECHACREAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divRolp_fechacreafiltercontainer_Class',ctrl:'ROLP_FECHACREAFILTERCONTAINER',prop:'Class'}]}");
      setEventMetadata("ENTER","{handler:'e208P2',iparms:[{av:'A21Rol_Id',fld:'ROL_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A18Pant_Id',fld:'PANT_ID',pic:'ZZZZZ9',hsh:true,nv:0}],oparms:[{av:'AV12pRol_Id',fld:'vPROL_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV13pPant_Id',fld:'vPPANT_ID',pic:'ZZZZZ9',nv:0}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cRol_Id',fld:'vCROL_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cPant_Id',fld:'vCPANT_ID',pic:'ZZZZZ9',nv:0},{av:'AV8cRolP_UsuarioCrea',fld:'vCROLP_USUARIOCREA',pic:'@!',nv:''},{av:'AV9cRolP_UsuarioModifica',fld:'vCROLP_USUARIOMODIFICA',pic:'@!',nv:''},{av:'AV10cRolP_FechaModifica',fld:'vCROLP_FECHAMODIFICA',pic:'99/99/99 99:99',nv:''},{av:'AV11cRolP_FechaCrea',fld:'vCROLP_FECHACREA',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cRol_Id',fld:'vCROL_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cPant_Id',fld:'vCPANT_ID',pic:'ZZZZZ9',nv:0},{av:'AV8cRolP_UsuarioCrea',fld:'vCROLP_USUARIOCREA',pic:'@!',nv:''},{av:'AV9cRolP_UsuarioModifica',fld:'vCROLP_USUARIOMODIFICA',pic:'@!',nv:''},{av:'AV10cRolP_FechaModifica',fld:'vCROLP_FECHAMODIFICA',pic:'99/99/99 99:99',nv:''},{av:'AV11cRolP_FechaCrea',fld:'vCROLP_FECHACREA',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cRol_Id',fld:'vCROL_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cPant_Id',fld:'vCPANT_ID',pic:'ZZZZZ9',nv:0},{av:'AV8cRolP_UsuarioCrea',fld:'vCROLP_USUARIOCREA',pic:'@!',nv:''},{av:'AV9cRolP_UsuarioModifica',fld:'vCROLP_USUARIOMODIFICA',pic:'@!',nv:''},{av:'AV10cRolP_FechaModifica',fld:'vCROLP_FECHAMODIFICA',pic:'99/99/99 99:99',nv:''},{av:'AV11cRolP_FechaCrea',fld:'vCROLP_FECHACREA',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cRol_Id',fld:'vCROL_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cPant_Id',fld:'vCPANT_ID',pic:'ZZZZZ9',nv:0},{av:'AV8cRolP_UsuarioCrea',fld:'vCROLP_USUARIOCREA',pic:'@!',nv:''},{av:'AV9cRolP_UsuarioModifica',fld:'vCROLP_USUARIOMODIFICA',pic:'@!',nv:''},{av:'AV10cRolP_FechaModifica',fld:'vCROLP_FECHAMODIFICA',pic:'99/99/99 99:99',nv:''},{av:'AV11cRolP_FechaCrea',fld:'vCROLP_FECHACREA',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
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
      AV8cRolP_UsuarioCrea = "" ;
      AV9cRolP_UsuarioModifica = "" ;
      AV10cRolP_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      AV11cRolP_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblrol_idfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblpant_idfilter_Jsonclick = "" ;
      lblLblrolp_usuariocreafilter_Jsonclick = "" ;
      lblLblrolp_usuariomodificafilter_Jsonclick = "" ;
      lblLblrolp_fechamodificafilter_Jsonclick = "" ;
      lblLblrolp_fechacreafilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A215RolP_UsuarioCrea = "" ;
      A217RolP_UsuarioModifica = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV17Linkselection_GXI = "" ;
      scmdbuf = "" ;
      lV8cRolP_UsuarioCrea = "" ;
      lV9cRolP_UsuarioModifica = "" ;
      A218RolP_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      A216RolP_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      H008P2_A216RolP_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      H008P2_A218RolP_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H008P2_A217RolP_UsuarioModifica = new String[] {""} ;
      H008P2_A215RolP_UsuarioCrea = new String[] {""} ;
      H008P2_A18Pant_Id = new int[1] ;
      H008P2_A21Rol_Id = new long[1] ;
      H008P3_AGRID1_nRecordCount = new long[1] ;
      AV14ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.gx00q0__default(),
         new Object[] {
             new Object[] {
            H008P2_A216RolP_FechaCrea, H008P2_A218RolP_FechaModifica, H008P2_A217RolP_UsuarioModifica, H008P2_A215RolP_UsuarioCrea, H008P2_A18Pant_Id, H008P2_A21Rol_Id
            }
            , new Object[] {
            H008P3_AGRID1_nRecordCount
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
   private short nRC_GXsfl_74 ;
   private short nGXsfl_74_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid1_Rows ;
   private int AV7cPant_Id ;
   private int AV13pPant_Id ;
   private int edtavCrol_id_Enabled ;
   private int edtavCrol_id_Visible ;
   private int edtavCpant_id_Enabled ;
   private int edtavCpant_id_Visible ;
   private int edtavCrolp_usuariocrea_Visible ;
   private int edtavCrolp_usuariocrea_Enabled ;
   private int edtavCrolp_usuariomodifica_Visible ;
   private int edtavCrolp_usuariomodifica_Enabled ;
   private int edtavCrolp_fechamodifica_Enabled ;
   private int edtavCrolp_fechacrea_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int A18Pant_Id ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long AV6cRol_Id ;
   private long AV12pRol_Id ;
   private long GRID1_nFirstRecordOnPage ;
   private long A21Rol_Id ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divRol_idfiltercontainer_Class ;
   private String divPant_idfiltercontainer_Class ;
   private String divRolp_usuariocreafiltercontainer_Class ;
   private String divRolp_usuariomodificafiltercontainer_Class ;
   private String divRolp_fechamodificafiltercontainer_Class ;
   private String divRolp_fechacreafiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_74_idx="0001" ;
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
   private String divPant_idfiltercontainer_Internalname ;
   private String lblLblpant_idfilter_Internalname ;
   private String lblLblpant_idfilter_Jsonclick ;
   private String edtavCpant_id_Internalname ;
   private String edtavCpant_id_Jsonclick ;
   private String divRolp_usuariocreafiltercontainer_Internalname ;
   private String lblLblrolp_usuariocreafilter_Internalname ;
   private String lblLblrolp_usuariocreafilter_Jsonclick ;
   private String edtavCrolp_usuariocrea_Internalname ;
   private String edtavCrolp_usuariocrea_Jsonclick ;
   private String divRolp_usuariomodificafiltercontainer_Internalname ;
   private String lblLblrolp_usuariomodificafilter_Internalname ;
   private String lblLblrolp_usuariomodificafilter_Jsonclick ;
   private String edtavCrolp_usuariomodifica_Internalname ;
   private String edtavCrolp_usuariomodifica_Jsonclick ;
   private String divRolp_fechamodificafiltercontainer_Internalname ;
   private String lblLblrolp_fechamodificafilter_Internalname ;
   private String lblLblrolp_fechamodificafilter_Jsonclick ;
   private String edtavCrolp_fechamodifica_Internalname ;
   private String edtavCrolp_fechamodifica_Jsonclick ;
   private String divRolp_fechacreafiltercontainer_Internalname ;
   private String lblLblrolp_fechacreafilter_Internalname ;
   private String lblLblrolp_fechacreafilter_Jsonclick ;
   private String edtavCrolp_fechacrea_Internalname ;
   private String edtavCrolp_fechacrea_Jsonclick ;
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
   private String edtRolP_UsuarioCrea_Link ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtRol_Id_Internalname ;
   private String edtPant_Id_Internalname ;
   private String edtRolP_UsuarioCrea_Internalname ;
   private String edtRolP_UsuarioModifica_Internalname ;
   private String scmdbuf ;
   private String AV14ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_74_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtRol_Id_Jsonclick ;
   private String edtPant_Id_Jsonclick ;
   private String edtRolP_UsuarioCrea_Jsonclick ;
   private String edtRolP_UsuarioModifica_Jsonclick ;
   private java.util.Date AV10cRolP_FechaModifica ;
   private java.util.Date AV11cRolP_FechaCrea ;
   private java.util.Date A218RolP_FechaModifica ;
   private java.util.Date A216RolP_FechaCrea ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_74_Refreshing=false ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV8cRolP_UsuarioCrea ;
   private String AV9cRolP_UsuarioModifica ;
   private String A215RolP_UsuarioCrea ;
   private String A217RolP_UsuarioModifica ;
   private String AV17Linkselection_GXI ;
   private String lV8cRolP_UsuarioCrea ;
   private String lV9cRolP_UsuarioModifica ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] H008P2_A216RolP_FechaCrea ;
   private java.util.Date[] H008P2_A218RolP_FechaModifica ;
   private String[] H008P2_A217RolP_UsuarioModifica ;
   private String[] H008P2_A215RolP_UsuarioCrea ;
   private int[] H008P2_A18Pant_Id ;
   private long[] H008P2_A21Rol_Id ;
   private long[] H008P3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx00q0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H008P2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV8cRolP_UsuarioCrea ,
                                          String AV9cRolP_UsuarioModifica ,
                                          java.util.Date AV10cRolP_FechaModifica ,
                                          java.util.Date AV11cRolP_FechaCrea ,
                                          String A215RolP_UsuarioCrea ,
                                          String A217RolP_UsuarioModifica ,
                                          java.util.Date A218RolP_FechaModifica ,
                                          java.util.Date A216RolP_FechaCrea ,
                                          long AV6cRol_Id ,
                                          int AV7cPant_Id )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int1 ;
      GXv_int1 = new byte [9] ;
      Object[] GXv_Object2 ;
      GXv_Object2 = new Object [2] ;
      String sSelectString ;
      String sFromString ;
      String sOrderString ;
      sSelectString = " /*+ FIRST_ROWS(11) */ RolP_FechaCrea, RolP_FechaModifica, RolP_UsuarioModifica," ;
      sSelectString = sSelectString + " RolP_UsuarioCrea, Pant_Id, Rol_Id" ;
      sFromString = " FROM SEG_ROL_PANTALLA" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (Rol_Id >= ? and Pant_Id >= ?)" ;
      if ( ! (GXutil.strcmp("", AV8cRolP_UsuarioCrea)==0) )
      {
         sWhereString = sWhereString + " and (RolP_UsuarioCrea like ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cRolP_UsuarioModifica)==0) )
      {
         sWhereString = sWhereString + " and (RolP_UsuarioModifica like ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV10cRolP_FechaModifica) )
      {
         sWhereString = sWhereString + " and (RolP_FechaModifica >= ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV11cRolP_FechaCrea) )
      {
         sWhereString = sWhereString + " and (RolP_FechaCrea >= ?)" ;
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY Rol_Id, Pant_Id" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT (CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H008P3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV8cRolP_UsuarioCrea ,
                                          String AV9cRolP_UsuarioModifica ,
                                          java.util.Date AV10cRolP_FechaModifica ,
                                          java.util.Date AV11cRolP_FechaCrea ,
                                          String A215RolP_UsuarioCrea ,
                                          String A217RolP_UsuarioModifica ,
                                          java.util.Date A218RolP_FechaModifica ,
                                          java.util.Date A216RolP_FechaCrea ,
                                          long AV6cRol_Id ,
                                          int AV7cPant_Id )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [6] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM SEG_ROL_PANTALLA" ;
      scmdbuf = scmdbuf + " WHERE (Rol_Id >= ? and Pant_Id >= ?)" ;
      if ( ! (GXutil.strcmp("", AV8cRolP_UsuarioCrea)==0) )
      {
         sWhereString = sWhereString + " and (RolP_UsuarioCrea like ?)" ;
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cRolP_UsuarioModifica)==0) )
      {
         sWhereString = sWhereString + " and (RolP_UsuarioModifica like ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV10cRolP_FechaModifica) )
      {
         sWhereString = sWhereString + " and (RolP_FechaModifica >= ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV11cRolP_FechaCrea) )
      {
         sWhereString = sWhereString + " and (RolP_FechaCrea >= ?)" ;
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
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
                  return conditional_H008P2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).longValue() , ((Number) dynConstraints[9]).intValue() );
            case 1 :
                  return conditional_H008P3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).longValue() , ((Number) dynConstraints[9]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H008P2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H008P3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((long[]) buf[5])[0] = rslt.getLong(6) ;
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
                  stmt.setLong(sIdx, ((Number) parms[9]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[13], false);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[14], false);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[6]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[8], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[10], false);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[11], false);
               }
               return;
      }
   }

}

