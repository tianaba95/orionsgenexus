/*
               File: gx0050_impl
        Description: Selection List USUARIO
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:24:11.1
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

public final  class gx0050_impl extends GXDataArea
{
   public gx0050_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx0050_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx0050_impl.class ));
   }

   public gx0050_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavCusua_estado = new HTMLChoice();
      cmbUsua_Estado = new HTMLChoice();
      cmbUsua_TipoContrato = new HTMLChoice();
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
            AV6cUsua_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            AV7cUsua_Codigo = httpContext.GetNextPar( ) ;
            AV8cUsua_Nombre = httpContext.GetNextPar( ) ;
            AV9cUsua_Email = httpContext.GetNextPar( ) ;
            AV10cUsua_Cedula = GXutil.lval( httpContext.GetNextPar( )) ;
            AV11cUsua_Clave = httpContext.GetNextPar( ) ;
            AV12cUsua_Estado = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cUsua_Id, AV7cUsua_Codigo, AV8cUsua_Nombre, AV9cUsua_Email, AV10cUsua_Cedula, AV11cUsua_Clave, AV12cUsua_Estado) ;
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
            AV13pUsua_Id = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13pUsua_Id", GXutil.ltrim( GXutil.str( AV13pUsua_Id, 18, 0)));
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
      pa882( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start882( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20186141424118");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.gx0050") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pUsua_Id,18,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCUSUA_ID", GXutil.ltrim( localUtil.ntoc( AV6cUsua_Id, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCUSUA_CODIGO", AV7cUsua_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCUSUA_NOMBRE", AV8cUsua_Nombre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCUSUA_EMAIL", AV9cUsua_Email);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCUSUA_CEDULA", GXutil.ltrim( localUtil.ntoc( AV10cUsua_Cedula, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCUSUA_CLAVE", AV11cUsua_Clave);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCUSUA_ESTADO", GXutil.rtrim( AV12cUsua_Estado));
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_84", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_84, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPUSUA_ID", GXutil.ltrim( localUtil.ntoc( AV13pUsua_Id, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_IDFILTERCONTAINER_Class", GXutil.rtrim( divUsua_idfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_CODIGOFILTERCONTAINER_Class", GXutil.rtrim( divUsua_codigofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_NOMBREFILTERCONTAINER_Class", GXutil.rtrim( divUsua_nombrefiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_EMAILFILTERCONTAINER_Class", GXutil.rtrim( divUsua_emailfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_CEDULAFILTERCONTAINER_Class", GXutil.rtrim( divUsua_cedulafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_CLAVEFILTERCONTAINER_Class", GXutil.rtrim( divUsua_clavefiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_ESTADOFILTERCONTAINER_Class", GXutil.rtrim( divUsua_estadofiltercontainer_Class));
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
         we882( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt882( ) ;
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
      return formatLink("com.orions2.gx0050") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pUsua_Id,18,0))) ;
   }

   public String getPgmname( )
   {
      return "Gx0050" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List USUARIO" ;
   }

   public void wb880( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divUsua_idfiltercontainer_Internalname, 1, 0, "px", 0, "px", divUsua_idfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblusua_idfilter_Internalname, "Identificador del Usuario", "", "", lblLblusua_idfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e11881_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0050.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCusua_id_Internalname, "Identificador del Usuario", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCusua_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cUsua_Id, (byte)(18), (byte)(0), ",", "")), ((edtavCusua_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6cUsua_Id), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV6cUsua_Id), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCusua_id_Jsonclick, 0, "Attribute", "", "", "", edtavCusua_id_Visible, edtavCusua_id_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx0050.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divUsua_codigofiltercontainer_Internalname, 1, 0, "px", 0, "px", divUsua_codigofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblusua_codigofilter_Internalname, "Código del Usuario", "", "", lblLblusua_codigofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e12881_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0050.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCusua_codigo_Internalname, "Código del Usuario", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCusua_codigo_Internalname, AV7cUsua_Codigo, GXutil.rtrim( localUtil.format( AV7cUsua_Codigo, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCusua_codigo_Jsonclick, 0, "Attribute", "", "", "", edtavCusua_codigo_Visible, edtavCusua_codigo_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx0050.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divUsua_nombrefiltercontainer_Internalname, 1, 0, "px", 0, "px", divUsua_nombrefiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblusua_nombrefilter_Internalname, "Nombre del Usuario", "", "", lblLblusua_nombrefilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e13881_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0050.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCusua_nombre_Internalname, "Nombre del Usuario", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCusua_nombre_Internalname, AV8cUsua_Nombre, GXutil.rtrim( localUtil.format( AV8cUsua_Nombre, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCusua_nombre_Jsonclick, 0, "Attribute", "", "", "", edtavCusua_nombre_Visible, edtavCusua_nombre_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx0050.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divUsua_emailfiltercontainer_Internalname, 1, 0, "px", 0, "px", divUsua_emailfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblusua_emailfilter_Internalname, "Email del Usuario", "", "", lblLblusua_emailfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e14881_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0050.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCusua_email_Internalname, "Email del Usuario", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCusua_email_Internalname, AV9cUsua_Email, GXutil.rtrim( localUtil.format( AV9cUsua_Email, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCusua_email_Jsonclick, 0, "Attribute", "", "", "", edtavCusua_email_Visible, edtavCusua_email_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "left", true, "HLP_Gx0050.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divUsua_cedulafiltercontainer_Internalname, 1, 0, "px", 0, "px", divUsua_cedulafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblusua_cedulafilter_Internalname, "Cedula del Usuario", "", "", lblLblusua_cedulafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e15881_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0050.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCusua_cedula_Internalname, "Cedula del Usuario", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCusua_cedula_Internalname, GXutil.ltrim( localUtil.ntoc( AV10cUsua_Cedula, (byte)(18), (byte)(0), ",", "")), ((edtavCusua_cedula_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10cUsua_Cedula), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10cUsua_Cedula), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCusua_cedula_Jsonclick, 0, "Attribute", "", "", "", edtavCusua_cedula_Visible, edtavCusua_cedula_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx0050.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divUsua_clavefiltercontainer_Internalname, 1, 0, "px", 0, "px", divUsua_clavefiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblusua_clavefilter_Internalname, "Clave del Usuario", "", "", lblLblusua_clavefilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e16881_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0050.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCusua_clave_Internalname, "Clave del Usuario", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCusua_clave_Internalname, AV11cUsua_Clave, GXutil.rtrim( localUtil.format( AV11cUsua_Clave, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCusua_clave_Jsonclick, 0, "Attribute", "", "", "", edtavCusua_clave_Visible, edtavCusua_clave_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(-1), (short)(0), 0, (byte)(1), (byte)(0), (byte)(-1), true, "", "left", true, "HLP_Gx0050.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divUsua_estadofiltercontainer_Internalname, 1, 0, "px", 0, "px", divUsua_estadofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblusua_estadofilter_Internalname, "Estado del Usuario", "", "", lblLblusua_estadofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e17881_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0050.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavCusua_estado.getInternalname(), "Estado del Usuario", "col-sm-3 AttributeLabel", 0, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCusua_estado, cmbavCusua_estado.getInternalname(), GXutil.rtrim( AV12cUsua_Estado), 1, cmbavCusua_estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbavCusua_estado.getVisible(), cmbavCusua_estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "", true, "HLP_Gx0050.htm");
         cmbavCusua_estado.setValue( GXutil.rtrim( AV12cUsua_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCusua_estado.getInternalname(), "Values", cmbavCusua_estado.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e18881_client"+"'", TempTags, "", 2, "HLP_Gx0050.htm");
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
            httpContext.writeValue( "Id Usuario") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cod Usuario") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cedula") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Clave del Usuario") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Estado del Usuario") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tipo Contrato") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A23Usua_Id, (byte)(18), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A24Usua_Codigo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A26Usua_Cedula, (byte)(18), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A220Usua_Clave);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A221Usua_Estado));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A226Usua_TipoContrato));
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx0050.htm");
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

   public void start882( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List USUARIO", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup880( ) ;
   }

   public void ws882( )
   {
      start882( ) ;
      evt882( ) ;
   }

   public void evt882( )
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
                           A23Usua_Id = localUtil.ctol( httpContext.cgiGet( edtUsua_Id_Internalname), ",", ".") ;
                           A24Usua_Codigo = GXutil.upper( httpContext.cgiGet( edtUsua_Codigo_Internalname)) ;
                           A26Usua_Cedula = localUtil.ctol( httpContext.cgiGet( edtUsua_Cedula_Internalname), ",", ".") ;
                           A220Usua_Clave = httpContext.cgiGet( edtUsua_Clave_Internalname) ;
                           cmbUsua_Estado.setName( cmbUsua_Estado.getInternalname() );
                           cmbUsua_Estado.setValue( httpContext.cgiGet( cmbUsua_Estado.getInternalname()) );
                           A221Usua_Estado = httpContext.cgiGet( cmbUsua_Estado.getInternalname()) ;
                           cmbUsua_TipoContrato.setName( cmbUsua_TipoContrato.getInternalname() );
                           cmbUsua_TipoContrato.setValue( httpContext.cgiGet( cmbUsua_TipoContrato.getInternalname()) );
                           A226Usua_TipoContrato = httpContext.cgiGet( cmbUsua_TipoContrato.getInternalname()) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e19882 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e20882 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Cusua_id Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCUSUA_ID"), ",", ".") != AV6cUsua_Id )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cusua_codigo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCUSUA_CODIGO"), AV7cUsua_Codigo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cusua_nombre Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCUSUA_NOMBRE"), AV8cUsua_Nombre) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cusua_email Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCUSUA_EMAIL"), AV9cUsua_Email) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cusua_cedula Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCUSUA_CEDULA"), ",", ".") != AV10cUsua_Cedula )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cusua_clave Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCUSUA_CLAVE"), AV11cUsua_Clave) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cusua_estado Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCUSUA_ESTADO"), AV12cUsua_Estado) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e21882 ();
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

   public void we882( )
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

   public void pa882( )
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
         cmbavCusua_estado.setName( "vCUSUA_ESTADO" );
         cmbavCusua_estado.setWebtags( "" );
         cmbavCusua_estado.addItem("A", "Activo", (short)(0));
         cmbavCusua_estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbavCusua_estado.getItemCount() > 0 )
         {
            AV12cUsua_Estado = cmbavCusua_estado.getValidValue(AV12cUsua_Estado) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cUsua_Estado", AV12cUsua_Estado);
         }
         GXCCtl = "USUA_ESTADO_" + sGXsfl_84_idx ;
         cmbUsua_Estado.setName( GXCCtl );
         cmbUsua_Estado.setWebtags( "" );
         cmbUsua_Estado.addItem("A", "Activo", (short)(0));
         cmbUsua_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbUsua_Estado.getItemCount() > 0 )
         {
            A221Usua_Estado = cmbUsua_Estado.getValidValue(A221Usua_Estado) ;
         }
         GXCCtl = "USUA_TIPOCONTRATO_" + sGXsfl_84_idx ;
         cmbUsua_TipoContrato.setName( GXCCtl );
         cmbUsua_TipoContrato.setWebtags( "" );
         cmbUsua_TipoContrato.addItem("P", "Planta", (short)(0));
         cmbUsua_TipoContrato.addItem("C", "Contratista", (short)(0));
         if ( cmbUsua_TipoContrato.getItemCount() > 0 )
         {
            A226Usua_TipoContrato = cmbUsua_TipoContrato.getValidValue(A226Usua_TipoContrato) ;
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
                                  long AV6cUsua_Id ,
                                  String AV7cUsua_Codigo ,
                                  String AV8cUsua_Nombre ,
                                  String AV9cUsua_Email ,
                                  long AV10cUsua_Cedula ,
                                  String AV11cUsua_Clave ,
                                  String AV12cUsua_Estado )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID1_nCurrentRecord = 0 ;
      rf882( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A23Usua_Id), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_ID", GXutil.ltrim( localUtil.ntoc( A23Usua_Id, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A24Usua_Codigo, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_CODIGO", A24Usua_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_CEDULA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A26Usua_Cedula), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_CEDULA", GXutil.ltrim( localUtil.ntoc( A26Usua_Cedula, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_CLAVE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A220Usua_Clave, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_CLAVE", A220Usua_Clave);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_ESTADO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A221Usua_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_ESTADO", GXutil.rtrim( A221Usua_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_TIPOCONTRATO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A226Usua_TipoContrato, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_TIPOCONTRATO", GXutil.rtrim( A226Usua_TipoContrato));
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbavCusua_estado.getItemCount() > 0 )
      {
         AV12cUsua_Estado = cmbavCusua_estado.getValidValue(AV12cUsua_Estado) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cUsua_Estado", AV12cUsua_Estado);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf882( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf882( )
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
                                              AV7cUsua_Codigo ,
                                              AV8cUsua_Nombre ,
                                              AV9cUsua_Email ,
                                              new Long(AV10cUsua_Cedula) ,
                                              AV11cUsua_Clave ,
                                              AV12cUsua_Estado ,
                                              A24Usua_Codigo ,
                                              A25Usua_Nombre ,
                                              A219Usua_Email ,
                                              new Long(A26Usua_Cedula) ,
                                              A220Usua_Clave ,
                                              A221Usua_Estado ,
                                              new Long(AV6cUsua_Id) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG
                                              }
         } ) ;
         lV7cUsua_Codigo = GXutil.concat( GXutil.rtrim( AV7cUsua_Codigo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cUsua_Codigo", AV7cUsua_Codigo);
         lV8cUsua_Nombre = GXutil.concat( GXutil.rtrim( AV8cUsua_Nombre), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cUsua_Nombre", AV8cUsua_Nombre);
         lV9cUsua_Email = GXutil.concat( GXutil.rtrim( AV9cUsua_Email), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cUsua_Email", AV9cUsua_Email);
         lV11cUsua_Clave = GXutil.concat( GXutil.rtrim( AV11cUsua_Clave), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cUsua_Clave", AV11cUsua_Clave);
         lV12cUsua_Estado = GXutil.padr( GXutil.rtrim( AV12cUsua_Estado), 1, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cUsua_Estado", AV12cUsua_Estado);
         /* Using cursor H00882 */
         pr_default.execute(0, new Object[] {new Long(AV6cUsua_Id), lV7cUsua_Codigo, lV8cUsua_Nombre, lV9cUsua_Email, new Long(AV10cUsua_Cedula), lV11cUsua_Clave, lV12cUsua_Estado, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_84_idx = (short)(1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A219Usua_Email = H00882_A219Usua_Email[0] ;
            A25Usua_Nombre = H00882_A25Usua_Nombre[0] ;
            A226Usua_TipoContrato = H00882_A226Usua_TipoContrato[0] ;
            A221Usua_Estado = H00882_A221Usua_Estado[0] ;
            A220Usua_Clave = H00882_A220Usua_Clave[0] ;
            A26Usua_Cedula = H00882_A26Usua_Cedula[0] ;
            A24Usua_Codigo = H00882_A24Usua_Codigo[0] ;
            A23Usua_Id = H00882_A23Usua_Id[0] ;
            /* Execute user event: Load */
            e20882 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(84) ;
         wb880( ) ;
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
                                           AV7cUsua_Codigo ,
                                           AV8cUsua_Nombre ,
                                           AV9cUsua_Email ,
                                           new Long(AV10cUsua_Cedula) ,
                                           AV11cUsua_Clave ,
                                           AV12cUsua_Estado ,
                                           A24Usua_Codigo ,
                                           A25Usua_Nombre ,
                                           A219Usua_Email ,
                                           new Long(A26Usua_Cedula) ,
                                           A220Usua_Clave ,
                                           A221Usua_Estado ,
                                           new Long(AV6cUsua_Id) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG
                                           }
      } ) ;
      lV7cUsua_Codigo = GXutil.concat( GXutil.rtrim( AV7cUsua_Codigo), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7cUsua_Codigo", AV7cUsua_Codigo);
      lV8cUsua_Nombre = GXutil.concat( GXutil.rtrim( AV8cUsua_Nombre), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8cUsua_Nombre", AV8cUsua_Nombre);
      lV9cUsua_Email = GXutil.concat( GXutil.rtrim( AV9cUsua_Email), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9cUsua_Email", AV9cUsua_Email);
      lV11cUsua_Clave = GXutil.concat( GXutil.rtrim( AV11cUsua_Clave), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11cUsua_Clave", AV11cUsua_Clave);
      lV12cUsua_Estado = GXutil.padr( GXutil.rtrim( AV12cUsua_Estado), 1, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12cUsua_Estado", AV12cUsua_Estado);
      /* Using cursor H00883 */
      pr_default.execute(1, new Object[] {new Long(AV6cUsua_Id), lV7cUsua_Codigo, lV8cUsua_Nombre, lV9cUsua_Email, new Long(AV10cUsua_Cedula), lV11cUsua_Clave, lV12cUsua_Estado});
      GRID1_nRecordCount = H00883_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cUsua_Id, AV7cUsua_Codigo, AV8cUsua_Nombre, AV9cUsua_Email, AV10cUsua_Cedula, AV11cUsua_Clave, AV12cUsua_Estado) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cUsua_Id, AV7cUsua_Codigo, AV8cUsua_Nombre, AV9cUsua_Email, AV10cUsua_Cedula, AV11cUsua_Clave, AV12cUsua_Estado) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cUsua_Id, AV7cUsua_Codigo, AV8cUsua_Nombre, AV9cUsua_Email, AV10cUsua_Cedula, AV11cUsua_Clave, AV12cUsua_Estado) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cUsua_Id, AV7cUsua_Codigo, AV8cUsua_Nombre, AV9cUsua_Email, AV10cUsua_Cedula, AV11cUsua_Clave, AV12cUsua_Estado) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cUsua_Id, AV7cUsua_Codigo, AV8cUsua_Nombre, AV9cUsua_Email, AV10cUsua_Cedula, AV11cUsua_Clave, AV12cUsua_Estado) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup880( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e19882 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCusua_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCusua_id_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCUSUA_ID");
            GX_FocusControl = edtavCusua_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cUsua_Id = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cUsua_Id", GXutil.ltrim( GXutil.str( AV6cUsua_Id, 18, 0)));
         }
         else
         {
            AV6cUsua_Id = localUtil.ctol( httpContext.cgiGet( edtavCusua_id_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cUsua_Id", GXutil.ltrim( GXutil.str( AV6cUsua_Id, 18, 0)));
         }
         AV7cUsua_Codigo = GXutil.upper( httpContext.cgiGet( edtavCusua_codigo_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cUsua_Codigo", AV7cUsua_Codigo);
         AV8cUsua_Nombre = httpContext.cgiGet( edtavCusua_nombre_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cUsua_Nombre", AV8cUsua_Nombre);
         AV9cUsua_Email = httpContext.cgiGet( edtavCusua_email_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cUsua_Email", AV9cUsua_Email);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCusua_cedula_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCusua_cedula_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCUSUA_CEDULA");
            GX_FocusControl = edtavCusua_cedula_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10cUsua_Cedula = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cUsua_Cedula", GXutil.ltrim( GXutil.str( AV10cUsua_Cedula, 18, 0)));
         }
         else
         {
            AV10cUsua_Cedula = localUtil.ctol( httpContext.cgiGet( edtavCusua_cedula_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cUsua_Cedula", GXutil.ltrim( GXutil.str( AV10cUsua_Cedula, 18, 0)));
         }
         AV11cUsua_Clave = httpContext.cgiGet( edtavCusua_clave_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cUsua_Clave", AV11cUsua_Clave);
         cmbavCusua_estado.setName( cmbavCusua_estado.getInternalname() );
         cmbavCusua_estado.setValue( httpContext.cgiGet( cmbavCusua_estado.getInternalname()) );
         AV12cUsua_Estado = httpContext.cgiGet( cmbavCusua_estado.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cUsua_Estado", AV12cUsua_Estado);
         /* Read saved values. */
         nRC_GXsfl_84 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_84"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCUSUA_ID"), ",", ".") != AV6cUsua_Id )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCUSUA_CODIGO"), AV7cUsua_Codigo) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCUSUA_NOMBRE"), AV8cUsua_Nombre) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCUSUA_EMAIL"), AV9cUsua_Email) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCUSUA_CEDULA"), ",", ".") != AV10cUsua_Cedula )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCUSUA_CLAVE"), AV11cUsua_Clave) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCUSUA_ESTADO"), AV12cUsua_Estado) != 0 )
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
      e19882 ();
      if (returnInSub) return;
   }

   public void e19882( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "USUARIO", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV14ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e20882( )
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
      e21882 ();
      if (returnInSub) return;
   }

   public void e21882( )
   {
      /* Enter Routine */
      AV13pUsua_Id = A23Usua_Id ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pUsua_Id", GXutil.ltrim( GXutil.str( AV13pUsua_Id, 18, 0)));
      httpContext.setWebReturnParms(new Object[] {new Long(AV13pUsua_Id)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV13pUsua_Id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pUsua_Id", GXutil.ltrim( GXutil.str( AV13pUsua_Id, 18, 0)));
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
      pa882( ) ;
      ws882( ) ;
      we882( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414241238");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gx0050.js", "?201861414241238");
      /* End function include_jscripts */
   }

   public void subsflControlProps_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_idx ;
      edtUsua_Id_Internalname = "USUA_ID_"+sGXsfl_84_idx ;
      edtUsua_Codigo_Internalname = "USUA_CODIGO_"+sGXsfl_84_idx ;
      edtUsua_Cedula_Internalname = "USUA_CEDULA_"+sGXsfl_84_idx ;
      edtUsua_Clave_Internalname = "USUA_CLAVE_"+sGXsfl_84_idx ;
      cmbUsua_Estado.setInternalname( "USUA_ESTADO_"+sGXsfl_84_idx );
      cmbUsua_TipoContrato.setInternalname( "USUA_TIPOCONTRATO_"+sGXsfl_84_idx );
   }

   public void subsflControlProps_fel_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_fel_idx ;
      edtUsua_Id_Internalname = "USUA_ID_"+sGXsfl_84_fel_idx ;
      edtUsua_Codigo_Internalname = "USUA_CODIGO_"+sGXsfl_84_fel_idx ;
      edtUsua_Cedula_Internalname = "USUA_CEDULA_"+sGXsfl_84_fel_idx ;
      edtUsua_Clave_Internalname = "USUA_CLAVE_"+sGXsfl_84_fel_idx ;
      cmbUsua_Estado.setInternalname( "USUA_ESTADO_"+sGXsfl_84_fel_idx );
      cmbUsua_TipoContrato.setInternalname( "USUA_TIPOCONTRATO_"+sGXsfl_84_fel_idx );
   }

   public void sendrow_842( )
   {
      subsflControlProps_842( ) ;
      wb880( ) ;
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
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A23Usua_Id, (byte)(18), (byte)(0), ",", "")))+"'"+"]);" ;
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
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUsua_Id_Internalname,GXutil.ltrim( localUtil.ntoc( A23Usua_Id, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A23Usua_Id), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUsua_Id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"IdLargo","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUsua_Codigo_Internalname,A24Usua_Codigo,GXutil.rtrim( localUtil.format( A24Usua_Codigo, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUsua_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUsua_Cedula_Internalname,GXutil.ltrim( localUtil.ntoc( A26Usua_Cedula, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A26Usua_Cedula), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUsua_Cedula_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUsua_Clave_Internalname,A220Usua_Clave,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUsua_Clave_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(20),new Integer(-1),new Integer(0),new Integer(84),new Integer(1),new Integer(0),new Integer(-1),new Boolean(true),"Clave","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_84_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "USUA_ESTADO_" + sGXsfl_84_idx ;
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
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbUsua_Estado,cmbUsua_Estado.getInternalname(),GXutil.rtrim( A221Usua_Estado),new Integer(1),cmbUsua_Estado.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn OptionalColumn","","",new Boolean(true)});
         cmbUsua_Estado.setValue( GXutil.rtrim( A221Usua_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbUsua_Estado.getInternalname(), "Values", cmbUsua_Estado.ToJavascriptSource(), !bGXsfl_84_Refreshing);
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_84_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "USUA_TIPOCONTRATO_" + sGXsfl_84_idx ;
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
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbUsua_TipoContrato,cmbUsua_TipoContrato.getInternalname(),GXutil.rtrim( A226Usua_TipoContrato),new Integer(1),cmbUsua_TipoContrato.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn OptionalColumn","","",new Boolean(true)});
         cmbUsua_TipoContrato.setValue( GXutil.rtrim( A226Usua_TipoContrato) );
         httpContext.ajax_rsp_assign_prop("", false, cmbUsua_TipoContrato.getInternalname(), "Values", cmbUsua_TipoContrato.ToJavascriptSource(), !bGXsfl_84_Refreshing);
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_ID"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A23Usua_Id), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_CODIGO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A24Usua_Codigo, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_CEDULA"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A26Usua_Cedula), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_CLAVE"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A220Usua_Clave, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_ESTADO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A221Usua_Estado, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_TIPOCONTRATO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A226Usua_TipoContrato, ""))));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_84_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_84_idx+1)) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      /* End function sendrow_842 */
   }

   public void init_default_properties( )
   {
      lblLblusua_idfilter_Internalname = "LBLUSUA_IDFILTER" ;
      edtavCusua_id_Internalname = "vCUSUA_ID" ;
      divUsua_idfiltercontainer_Internalname = "USUA_IDFILTERCONTAINER" ;
      lblLblusua_codigofilter_Internalname = "LBLUSUA_CODIGOFILTER" ;
      edtavCusua_codigo_Internalname = "vCUSUA_CODIGO" ;
      divUsua_codigofiltercontainer_Internalname = "USUA_CODIGOFILTERCONTAINER" ;
      lblLblusua_nombrefilter_Internalname = "LBLUSUA_NOMBREFILTER" ;
      edtavCusua_nombre_Internalname = "vCUSUA_NOMBRE" ;
      divUsua_nombrefiltercontainer_Internalname = "USUA_NOMBREFILTERCONTAINER" ;
      lblLblusua_emailfilter_Internalname = "LBLUSUA_EMAILFILTER" ;
      edtavCusua_email_Internalname = "vCUSUA_EMAIL" ;
      divUsua_emailfiltercontainer_Internalname = "USUA_EMAILFILTERCONTAINER" ;
      lblLblusua_cedulafilter_Internalname = "LBLUSUA_CEDULAFILTER" ;
      edtavCusua_cedula_Internalname = "vCUSUA_CEDULA" ;
      divUsua_cedulafiltercontainer_Internalname = "USUA_CEDULAFILTERCONTAINER" ;
      lblLblusua_clavefilter_Internalname = "LBLUSUA_CLAVEFILTER" ;
      edtavCusua_clave_Internalname = "vCUSUA_CLAVE" ;
      divUsua_clavefiltercontainer_Internalname = "USUA_CLAVEFILTERCONTAINER" ;
      lblLblusua_estadofilter_Internalname = "LBLUSUA_ESTADOFILTER" ;
      cmbavCusua_estado.setInternalname( "vCUSUA_ESTADO" );
      divUsua_estadofiltercontainer_Internalname = "USUA_ESTADOFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtUsua_Id_Internalname = "USUA_ID" ;
      edtUsua_Codigo_Internalname = "USUA_CODIGO" ;
      edtUsua_Cedula_Internalname = "USUA_CEDULA" ;
      edtUsua_Clave_Internalname = "USUA_CLAVE" ;
      cmbUsua_Estado.setInternalname( "USUA_ESTADO" );
      cmbUsua_TipoContrato.setInternalname( "USUA_TIPOCONTRATO" );
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
      cmbUsua_TipoContrato.setJsonclick( "" );
      cmbUsua_Estado.setJsonclick( "" );
      edtUsua_Clave_Jsonclick = "" ;
      edtUsua_Cedula_Jsonclick = "" ;
      edtUsua_Codigo_Jsonclick = "" ;
      edtUsua_Id_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      cmbavCusua_estado.setJsonclick( "" );
      cmbavCusua_estado.setEnabled( 1 );
      cmbavCusua_estado.setVisible( 1 );
      edtavCusua_clave_Jsonclick = "" ;
      edtavCusua_clave_Enabled = 1 ;
      edtavCusua_clave_Visible = 1 ;
      edtavCusua_cedula_Jsonclick = "" ;
      edtavCusua_cedula_Enabled = 1 ;
      edtavCusua_cedula_Visible = 1 ;
      edtavCusua_email_Jsonclick = "" ;
      edtavCusua_email_Enabled = 1 ;
      edtavCusua_email_Visible = 1 ;
      edtavCusua_nombre_Jsonclick = "" ;
      edtavCusua_nombre_Enabled = 1 ;
      edtavCusua_nombre_Visible = 1 ;
      edtavCusua_codigo_Jsonclick = "" ;
      edtavCusua_codigo_Enabled = 1 ;
      edtavCusua_codigo_Visible = 1 ;
      edtavCusua_id_Jsonclick = "" ;
      edtavCusua_id_Enabled = 1 ;
      edtavCusua_id_Visible = 1 ;
      divUsua_estadofiltercontainer_Class = "AdvancedContainerItem" ;
      divUsua_clavefiltercontainer_Class = "AdvancedContainerItem" ;
      divUsua_cedulafiltercontainer_Class = "AdvancedContainerItem" ;
      divUsua_emailfiltercontainer_Class = "AdvancedContainerItem" ;
      divUsua_nombrefiltercontainer_Class = "AdvancedContainerItem" ;
      divUsua_codigofiltercontainer_Class = "AdvancedContainerItem" ;
      divUsua_idfiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List USUARIO" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cUsua_Id',fld:'vCUSUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV7cUsua_Codigo',fld:'vCUSUA_CODIGO',pic:'@!',nv:''},{av:'AV8cUsua_Nombre',fld:'vCUSUA_NOMBRE',pic:'',nv:''},{av:'AV9cUsua_Email',fld:'vCUSUA_EMAIL',pic:'',nv:''},{av:'AV10cUsua_Cedula',fld:'vCUSUA_CEDULA',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV11cUsua_Clave',fld:'vCUSUA_CLAVE',pic:'',nv:''},{av:'cmbavCusua_estado'},{av:'AV12cUsua_Estado',fld:'vCUSUA_ESTADO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e18881',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLUSUA_IDFILTER.CLICK","{handler:'e11881',iparms:[{av:'divUsua_idfiltercontainer_Class',ctrl:'USUA_IDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divUsua_idfiltercontainer_Class',ctrl:'USUA_IDFILTERCONTAINER',prop:'Class'},{av:'edtavCusua_id_Visible',ctrl:'vCUSUA_ID',prop:'Visible'}]}");
      setEventMetadata("LBLUSUA_CODIGOFILTER.CLICK","{handler:'e12881',iparms:[{av:'divUsua_codigofiltercontainer_Class',ctrl:'USUA_CODIGOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divUsua_codigofiltercontainer_Class',ctrl:'USUA_CODIGOFILTERCONTAINER',prop:'Class'},{av:'edtavCusua_codigo_Visible',ctrl:'vCUSUA_CODIGO',prop:'Visible'}]}");
      setEventMetadata("LBLUSUA_NOMBREFILTER.CLICK","{handler:'e13881',iparms:[{av:'divUsua_nombrefiltercontainer_Class',ctrl:'USUA_NOMBREFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divUsua_nombrefiltercontainer_Class',ctrl:'USUA_NOMBREFILTERCONTAINER',prop:'Class'},{av:'edtavCusua_nombre_Visible',ctrl:'vCUSUA_NOMBRE',prop:'Visible'}]}");
      setEventMetadata("LBLUSUA_EMAILFILTER.CLICK","{handler:'e14881',iparms:[{av:'divUsua_emailfiltercontainer_Class',ctrl:'USUA_EMAILFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divUsua_emailfiltercontainer_Class',ctrl:'USUA_EMAILFILTERCONTAINER',prop:'Class'},{av:'edtavCusua_email_Visible',ctrl:'vCUSUA_EMAIL',prop:'Visible'}]}");
      setEventMetadata("LBLUSUA_CEDULAFILTER.CLICK","{handler:'e15881',iparms:[{av:'divUsua_cedulafiltercontainer_Class',ctrl:'USUA_CEDULAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divUsua_cedulafiltercontainer_Class',ctrl:'USUA_CEDULAFILTERCONTAINER',prop:'Class'},{av:'edtavCusua_cedula_Visible',ctrl:'vCUSUA_CEDULA',prop:'Visible'}]}");
      setEventMetadata("LBLUSUA_CLAVEFILTER.CLICK","{handler:'e16881',iparms:[{av:'divUsua_clavefiltercontainer_Class',ctrl:'USUA_CLAVEFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divUsua_clavefiltercontainer_Class',ctrl:'USUA_CLAVEFILTERCONTAINER',prop:'Class'},{av:'edtavCusua_clave_Visible',ctrl:'vCUSUA_CLAVE',prop:'Visible'}]}");
      setEventMetadata("LBLUSUA_ESTADOFILTER.CLICK","{handler:'e17881',iparms:[{av:'divUsua_estadofiltercontainer_Class',ctrl:'USUA_ESTADOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divUsua_estadofiltercontainer_Class',ctrl:'USUA_ESTADOFILTERCONTAINER',prop:'Class'},{av:'cmbavCusua_estado'}]}");
      setEventMetadata("ENTER","{handler:'e21882',iparms:[{av:'A23Usua_Id',fld:'USUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[{av:'AV13pUsua_Id',fld:'vPUSUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cUsua_Id',fld:'vCUSUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV7cUsua_Codigo',fld:'vCUSUA_CODIGO',pic:'@!',nv:''},{av:'AV8cUsua_Nombre',fld:'vCUSUA_NOMBRE',pic:'',nv:''},{av:'AV9cUsua_Email',fld:'vCUSUA_EMAIL',pic:'',nv:''},{av:'AV10cUsua_Cedula',fld:'vCUSUA_CEDULA',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV11cUsua_Clave',fld:'vCUSUA_CLAVE',pic:'',nv:''},{av:'cmbavCusua_estado'},{av:'AV12cUsua_Estado',fld:'vCUSUA_ESTADO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cUsua_Id',fld:'vCUSUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV7cUsua_Codigo',fld:'vCUSUA_CODIGO',pic:'@!',nv:''},{av:'AV8cUsua_Nombre',fld:'vCUSUA_NOMBRE',pic:'',nv:''},{av:'AV9cUsua_Email',fld:'vCUSUA_EMAIL',pic:'',nv:''},{av:'AV10cUsua_Cedula',fld:'vCUSUA_CEDULA',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV11cUsua_Clave',fld:'vCUSUA_CLAVE',pic:'',nv:''},{av:'cmbavCusua_estado'},{av:'AV12cUsua_Estado',fld:'vCUSUA_ESTADO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cUsua_Id',fld:'vCUSUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV7cUsua_Codigo',fld:'vCUSUA_CODIGO',pic:'@!',nv:''},{av:'AV8cUsua_Nombre',fld:'vCUSUA_NOMBRE',pic:'',nv:''},{av:'AV9cUsua_Email',fld:'vCUSUA_EMAIL',pic:'',nv:''},{av:'AV10cUsua_Cedula',fld:'vCUSUA_CEDULA',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV11cUsua_Clave',fld:'vCUSUA_CLAVE',pic:'',nv:''},{av:'cmbavCusua_estado'},{av:'AV12cUsua_Estado',fld:'vCUSUA_ESTADO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cUsua_Id',fld:'vCUSUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV7cUsua_Codigo',fld:'vCUSUA_CODIGO',pic:'@!',nv:''},{av:'AV8cUsua_Nombre',fld:'vCUSUA_NOMBRE',pic:'',nv:''},{av:'AV9cUsua_Email',fld:'vCUSUA_EMAIL',pic:'',nv:''},{av:'AV10cUsua_Cedula',fld:'vCUSUA_CEDULA',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV11cUsua_Clave',fld:'vCUSUA_CLAVE',pic:'',nv:''},{av:'cmbavCusua_estado'},{av:'AV12cUsua_Estado',fld:'vCUSUA_ESTADO',pic:'',nv:''}],oparms:[]}");
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
      AV7cUsua_Codigo = "" ;
      AV8cUsua_Nombre = "" ;
      AV9cUsua_Email = "" ;
      AV11cUsua_Clave = "" ;
      AV12cUsua_Estado = "" ;
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblusua_idfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblusua_codigofilter_Jsonclick = "" ;
      lblLblusua_nombrefilter_Jsonclick = "" ;
      lblLblusua_emailfilter_Jsonclick = "" ;
      lblLblusua_cedulafilter_Jsonclick = "" ;
      lblLblusua_clavefilter_Jsonclick = "" ;
      lblLblusua_estadofilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A24Usua_Codigo = "" ;
      A220Usua_Clave = "" ;
      A221Usua_Estado = "" ;
      A226Usua_TipoContrato = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV17Linkselection_GXI = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV7cUsua_Codigo = "" ;
      lV8cUsua_Nombre = "" ;
      lV9cUsua_Email = "" ;
      lV11cUsua_Clave = "" ;
      lV12cUsua_Estado = "" ;
      A25Usua_Nombre = "" ;
      A219Usua_Email = "" ;
      H00882_A219Usua_Email = new String[] {""} ;
      H00882_A25Usua_Nombre = new String[] {""} ;
      H00882_A226Usua_TipoContrato = new String[] {""} ;
      H00882_A221Usua_Estado = new String[] {""} ;
      H00882_A220Usua_Clave = new String[] {""} ;
      H00882_A26Usua_Cedula = new long[1] ;
      H00882_A24Usua_Codigo = new String[] {""} ;
      H00882_A23Usua_Id = new long[1] ;
      H00883_AGRID1_nRecordCount = new long[1] ;
      AV14ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.gx0050__default(),
         new Object[] {
             new Object[] {
            H00882_A219Usua_Email, H00882_A25Usua_Nombre, H00882_A226Usua_TipoContrato, H00882_A221Usua_Estado, H00882_A220Usua_Clave, H00882_A26Usua_Cedula, H00882_A24Usua_Codigo, H00882_A23Usua_Id
            }
            , new Object[] {
            H00883_AGRID1_nRecordCount
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
   private int edtavCusua_id_Enabled ;
   private int edtavCusua_id_Visible ;
   private int edtavCusua_codigo_Visible ;
   private int edtavCusua_codigo_Enabled ;
   private int edtavCusua_nombre_Visible ;
   private int edtavCusua_nombre_Enabled ;
   private int edtavCusua_email_Visible ;
   private int edtavCusua_email_Enabled ;
   private int edtavCusua_cedula_Enabled ;
   private int edtavCusua_cedula_Visible ;
   private int edtavCusua_clave_Visible ;
   private int edtavCusua_clave_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long AV6cUsua_Id ;
   private long AV10cUsua_Cedula ;
   private long AV13pUsua_Id ;
   private long GRID1_nFirstRecordOnPage ;
   private long A23Usua_Id ;
   private long A26Usua_Cedula ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divUsua_idfiltercontainer_Class ;
   private String divUsua_codigofiltercontainer_Class ;
   private String divUsua_nombrefiltercontainer_Class ;
   private String divUsua_emailfiltercontainer_Class ;
   private String divUsua_cedulafiltercontainer_Class ;
   private String divUsua_clavefiltercontainer_Class ;
   private String divUsua_estadofiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_84_idx="0001" ;
   private String AV12cUsua_Estado ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divUsua_idfiltercontainer_Internalname ;
   private String lblLblusua_idfilter_Internalname ;
   private String lblLblusua_idfilter_Jsonclick ;
   private String edtavCusua_id_Internalname ;
   private String TempTags ;
   private String edtavCusua_id_Jsonclick ;
   private String divUsua_codigofiltercontainer_Internalname ;
   private String lblLblusua_codigofilter_Internalname ;
   private String lblLblusua_codigofilter_Jsonclick ;
   private String edtavCusua_codigo_Internalname ;
   private String edtavCusua_codigo_Jsonclick ;
   private String divUsua_nombrefiltercontainer_Internalname ;
   private String lblLblusua_nombrefilter_Internalname ;
   private String lblLblusua_nombrefilter_Jsonclick ;
   private String edtavCusua_nombre_Internalname ;
   private String edtavCusua_nombre_Jsonclick ;
   private String divUsua_emailfiltercontainer_Internalname ;
   private String lblLblusua_emailfilter_Internalname ;
   private String lblLblusua_emailfilter_Jsonclick ;
   private String edtavCusua_email_Internalname ;
   private String edtavCusua_email_Jsonclick ;
   private String divUsua_cedulafiltercontainer_Internalname ;
   private String lblLblusua_cedulafilter_Internalname ;
   private String lblLblusua_cedulafilter_Jsonclick ;
   private String edtavCusua_cedula_Internalname ;
   private String edtavCusua_cedula_Jsonclick ;
   private String divUsua_clavefiltercontainer_Internalname ;
   private String lblLblusua_clavefilter_Internalname ;
   private String lblLblusua_clavefilter_Jsonclick ;
   private String edtavCusua_clave_Internalname ;
   private String edtavCusua_clave_Jsonclick ;
   private String divUsua_estadofiltercontainer_Internalname ;
   private String lblLblusua_estadofilter_Internalname ;
   private String lblLblusua_estadofilter_Jsonclick ;
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
   private String A221Usua_Estado ;
   private String A226Usua_TipoContrato ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtUsua_Id_Internalname ;
   private String edtUsua_Codigo_Internalname ;
   private String edtUsua_Cedula_Internalname ;
   private String edtUsua_Clave_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV12cUsua_Estado ;
   private String AV14ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_84_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtUsua_Id_Jsonclick ;
   private String edtUsua_Codigo_Jsonclick ;
   private String edtUsua_Cedula_Jsonclick ;
   private String edtUsua_Clave_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_84_Refreshing=false ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV7cUsua_Codigo ;
   private String AV8cUsua_Nombre ;
   private String AV9cUsua_Email ;
   private String AV11cUsua_Clave ;
   private String A24Usua_Codigo ;
   private String A220Usua_Clave ;
   private String AV17Linkselection_GXI ;
   private String lV7cUsua_Codigo ;
   private String lV8cUsua_Nombre ;
   private String lV9cUsua_Email ;
   private String lV11cUsua_Clave ;
   private String A25Usua_Nombre ;
   private String A219Usua_Email ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private HTMLChoice cmbavCusua_estado ;
   private HTMLChoice cmbUsua_Estado ;
   private HTMLChoice cmbUsua_TipoContrato ;
   private IDataStoreProvider pr_default ;
   private String[] H00882_A219Usua_Email ;
   private String[] H00882_A25Usua_Nombre ;
   private String[] H00882_A226Usua_TipoContrato ;
   private String[] H00882_A221Usua_Estado ;
   private String[] H00882_A220Usua_Clave ;
   private long[] H00882_A26Usua_Cedula ;
   private String[] H00882_A24Usua_Codigo ;
   private long[] H00882_A23Usua_Id ;
   private long[] H00883_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx0050__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00882( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV7cUsua_Codigo ,
                                          String AV8cUsua_Nombre ,
                                          String AV9cUsua_Email ,
                                          long AV10cUsua_Cedula ,
                                          String AV11cUsua_Clave ,
                                          String AV12cUsua_Estado ,
                                          String A24Usua_Codigo ,
                                          String A25Usua_Nombre ,
                                          String A219Usua_Email ,
                                          long A26Usua_Cedula ,
                                          String A220Usua_Clave ,
                                          String A221Usua_Estado ,
                                          long AV6cUsua_Id )
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
      sSelectString = " /*+ FIRST_ROWS(11) */ Usua_Email, Usua_Nombre, Usua_TipoContrato, Usua_Estado, Usua_Clave," ;
      sSelectString = sSelectString + " Usua_Cedula, Usua_Codigo, Usua_Id" ;
      sFromString = " FROM SEG_USUARIO" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (Usua_Id >= ?)" ;
      if ( ! (GXutil.strcmp("", AV7cUsua_Codigo)==0) )
      {
         sWhereString = sWhereString + " and (Usua_Codigo like ?)" ;
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cUsua_Nombre)==0) )
      {
         sWhereString = sWhereString + " and (Usua_Nombre like ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cUsua_Email)==0) )
      {
         sWhereString = sWhereString + " and (Usua_Email like ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (0==AV10cUsua_Cedula) )
      {
         sWhereString = sWhereString + " and (Usua_Cedula >= ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11cUsua_Clave)==0) )
      {
         sWhereString = sWhereString + " and (Usua_Clave like ?)" ;
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12cUsua_Estado)==0) )
      {
         sWhereString = sWhereString + " and (Usua_Estado like ?)" ;
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY Usua_Id" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT (CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H00883( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV7cUsua_Codigo ,
                                          String AV8cUsua_Nombre ,
                                          String AV9cUsua_Email ,
                                          long AV10cUsua_Cedula ,
                                          String AV11cUsua_Clave ,
                                          String AV12cUsua_Estado ,
                                          String A24Usua_Codigo ,
                                          String A25Usua_Nombre ,
                                          String A219Usua_Email ,
                                          long A26Usua_Cedula ,
                                          String A220Usua_Clave ,
                                          String A221Usua_Estado ,
                                          long AV6cUsua_Id )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [7] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM SEG_USUARIO" ;
      scmdbuf = scmdbuf + " WHERE (Usua_Id >= ?)" ;
      if ( ! (GXutil.strcmp("", AV7cUsua_Codigo)==0) )
      {
         sWhereString = sWhereString + " and (Usua_Codigo like ?)" ;
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cUsua_Nombre)==0) )
      {
         sWhereString = sWhereString + " and (Usua_Nombre like ?)" ;
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cUsua_Email)==0) )
      {
         sWhereString = sWhereString + " and (Usua_Email like ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (0==AV10cUsua_Cedula) )
      {
         sWhereString = sWhereString + " and (Usua_Cedula >= ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11cUsua_Clave)==0) )
      {
         sWhereString = sWhereString + " and (Usua_Clave like ?)" ;
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12cUsua_Estado)==0) )
      {
         sWhereString = sWhereString + " and (Usua_Estado like ?)" ;
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
                  return conditional_H00882(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).longValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).longValue() );
            case 1 :
                  return conditional_H00883(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).longValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00882", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H00883", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1) ;
               ((String[]) buf[3])[0] = rslt.getString(4, 1) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((long[]) buf[5])[0] = rslt.getLong(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((long[]) buf[7])[0] = rslt.getLong(8) ;
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
                  stmt.setBigDecimal(sIdx, ((Number) parms[10]).longValue(), 0);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, ((Number) parms[14]).longValue(), 0);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 1);
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
                  stmt.setBigDecimal(sIdx, ((Number) parms[7]).longValue(), 0);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[8], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, ((Number) parms[11]).longValue(), 0);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 1);
               }
               return;
      }
   }

}

