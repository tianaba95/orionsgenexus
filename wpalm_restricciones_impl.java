/*
               File: wpalm_restricciones_impl
        Description: Restricciones
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:20:18.13
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

public final  class wpalm_restricciones_impl extends GXDataArea
{
   public wpalm_restricciones_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wpalm_restricciones_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wpalm_restricciones_impl.class ));
   }

   public wpalm_restricciones_impl( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavMbod_almmodorigen = new HTMLChoice();
      cmbavMbod_almmoddestino = new HTMLChoice();
      cmbavMbod_estado = new HTMLChoice();
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
            Gx_mode = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV6PMbod_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6PMbod_Id", GXutil.ltrim( GXutil.str( AV6PMbod_Id, 11, 0)));
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
      pa662( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start662( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414201822");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.wpalm_restricciones") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV6PMbod_Id,11,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMBOD_REGIONID", GXutil.ltrim( localUtil.ntoc( AV24Mbod_RegionId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMBOD_CENTCOSTOID", GXutil.ltrim( localUtil.ntoc( AV19Mbod_CentCostoId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vSW", GXutil.ltrim( localUtil.ntoc( AV34SW, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vSWE", GXutil.ltrim( localUtil.ntoc( AV40Swe, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPMBOD_ID", GXutil.ltrim( localUtil.ntoc( AV6PMbod_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTALM_RESTRICCIONES", AV33SDTALM_RESTRICCIONES);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTALM_RESTRICCIONES", AV33SDTALM_RESTRICCIONES);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUARIO", AV35Usuario);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMBOD_TIPOELEMENTOCOD", GXutil.ltrim( localUtil.ntoc( AV5Mbod_TipoElementoCod, (byte)(18), (byte)(0), ",", "")));
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
         we662( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt662( ) ;
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
      return formatLink("com.orions2.wpalm_restricciones") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV6PMbod_Id,11,0))) ;
   }

   public String getPgmname( )
   {
      return "WPALM_RESTRICCIONES" ;
   }

   public String getPgmdesc( )
   {
      return "Restricciones" ;
   }

   public void wb660( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "WWAdvancedContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-9 col-lg-offset-1", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTitlecontainer_Internalname, 1, 0, "px", 0, "px", "TableTop", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Restricciones", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_WPALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-9 col-lg-offset-1", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable1_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "min-height:10px;", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage1_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "Seleccionar Rol", "", 0, 0, 0, "px", 0, "px", 0, 0, 7, imgImage1_Jsonclick, "'"+""+"'"+",false,"+"'"+"e11661_client"+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WPALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-7", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavMbod_tipomovdescrip_Internalname, "Tipo de movimiento", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavMbod_tipomovdescrip_Internalname, AV27Mbod_TipoMovDescrip, GXutil.rtrim( localUtil.format( AV27Mbod_TipoMovDescrip, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "SELECCIONAR", edtavMbod_tipomovdescrip_Jsonclick, 0, "Attribute", "", "", "", 1, edtavMbod_tipomovdescrip_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 hidden-sm", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavMbod_tipomovcodigo_Internalname, "Código", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavMbod_tipomovcodigo_Internalname, AV26Mbod_TipoMovCodigo, GXutil.rtrim( localUtil.format( AV26Mbod_TipoMovCodigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMbod_tipomovcodigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtavMbod_tipomovcodigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage2_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "Seleccionar Rol", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgImage2_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BUSCARREGIONAL\\'."+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WPALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-7", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavMbod_regiondescripcion_Internalname, "Regional", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavMbod_regiondescripcion_Internalname, AV23Mbod_RegionDescripcion, GXutil.rtrim( localUtil.format( AV23Mbod_RegionDescripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "SELECCIONAR", edtavMbod_regiondescripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtavMbod_regiondescripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavMbod_regioncodigo_Internalname, "Código", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavMbod_regioncodigo_Internalname, GXutil.ltrim( localUtil.ntoc( AV22Mbod_RegionCodigo, (byte)(4), (byte)(0), ",", "")), ((edtavMbod_regioncodigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22Mbod_RegionCodigo), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV22Mbod_RegionCodigo), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMbod_regioncodigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtavMbod_regioncodigo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WPALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage3_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "Seleccionar Rol", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgImage3_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BUSCARCENTROCOSTO\\'."+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WPALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-7", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavMbod_centrocostodescrip_Internalname, "Centro de costo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavMbod_centrocostodescrip_Internalname, AV20Mbod_CentroCostoDescrip, GXutil.rtrim( localUtil.format( AV20Mbod_CentroCostoDescrip, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "SELECCIONAR", edtavMbod_centrocostodescrip_Jsonclick, 0, "Attribute", "", "", "", 1, edtavMbod_centrocostodescrip_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavMbod_centcostocodigo_Internalname, "Código", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavMbod_centcostocodigo_Internalname, AV18Mbod_CentCostoCodigo, GXutil.rtrim( localUtil.format( AV18Mbod_CentCostoCodigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMbod_centcostocodigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtavMbod_centcostocodigo_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavMbod_almmodorigen.getInternalname(), "Módulo orígen", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavMbod_almmodorigen, cmbavMbod_almmodorigen.getInternalname(), GXutil.rtrim( AV12Mbod_AlmModOrigen), 1, cmbavMbod_almmodorigen.getJsonclick(), 5, "'"+""+"'"+",false,"+"'"+"EVMBOD_ALMMODORIGEN.CLICK."+"'", "svchar", "", 1, cmbavMbod_almmodorigen.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,47);\"", "", true, "HLP_WPALM_RESTRICCIONES.htm");
         cmbavMbod_almmodorigen.setValue( GXutil.rtrim( AV12Mbod_AlmModOrigen) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavMbod_almmodorigen.getInternalname(), "Values", cmbavMbod_almmodorigen.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage4_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "Seleccionar Rol", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgImage4_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BUSCARALMACENORIGEN\\'."+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WPALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-7", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavAlmag_descripcionori_Internalname, "Almacén origen", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavAlmag_descripcionori_Internalname, AV9AlmaG_DescripcionOri, GXutil.rtrim( localUtil.format( AV9AlmaG_DescripcionOri, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "SELECCIONAR", edtavAlmag_descripcionori_Jsonclick, 0, "Attribute", "", "", "", 1, edtavAlmag_descripcionori_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavMbod_almorigencodigo_Internalname, "Código", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavMbod_almorigencodigo_Internalname, AV13Mbod_AlmOrigenCodigo, GXutil.rtrim( localUtil.format( AV13Mbod_AlmOrigenCodigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMbod_almorigencodigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtavMbod_almorigencodigo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage5_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "Seleccionar Rol", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgImage5_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BUSCARBODEGAORIGEN\\'."+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WPALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-7", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavMbod_bodorigendescripcion_Internalname, "Bodega orígen", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavMbod_bodorigendescripcion_Internalname, AV17Mbod_BodOrigenDescripcion, GXutil.rtrim( localUtil.format( AV17Mbod_BodOrigenDescripcion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,62);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "SELECCIONAR", edtavMbod_bodorigendescripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtavMbod_bodorigendescripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavMbod_bodorigencodigo_Internalname, "Código", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavMbod_bodorigencodigo_Internalname, AV16Mbod_BodOrigenCodigo, GXutil.rtrim( localUtil.format( AV16Mbod_BodOrigenCodigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMbod_bodorigencodigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtavMbod_bodorigencodigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavMbod_almmoddestino.getInternalname(), "Módulo destino", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavMbod_almmoddestino, cmbavMbod_almmoddestino.getInternalname(), GXutil.rtrim( AV11Mbod_AlmModDestino), 1, cmbavMbod_almmoddestino.getJsonclick(), 5, "'"+""+"'"+",false,"+"'"+"EVMBOD_ALMMODDESTINO.CLICK."+"'", "svchar", "", 1, cmbavMbod_almmoddestino.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "", true, "HLP_WPALM_RESTRICCIONES.htm");
         cmbavMbod_almmoddestino.setValue( GXutil.rtrim( AV11Mbod_AlmModDestino) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavMbod_almmoddestino.getInternalname(), "Values", cmbavMbod_almmoddestino.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage6_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "Seleccionar Rol", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgImage6_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BUSCARALMACENDESTINIO\\'."+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WPALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-7", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavAlmag_descripciondes_Internalname, "Almacén destino", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavAlmag_descripciondes_Internalname, AV8AlmaG_DescripcionDes, GXutil.rtrim( localUtil.format( AV8AlmaG_DescripcionDes, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "SELECCIONAR", edtavAlmag_descripciondes_Jsonclick, 0, "Attribute", "", "", "", 1, edtavAlmag_descripciondes_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavMbod_almdestinocodigo_Internalname, "Código", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavMbod_almdestinocodigo_Internalname, AV10Mbod_AlmDestinoCodigo, GXutil.rtrim( localUtil.format( AV10Mbod_AlmDestinoCodigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMbod_almdestinocodigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtavMbod_almdestinocodigo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage7_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "Seleccionar Rol", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgImage7_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BUSCARBODEGADESTINIO\\'."+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WPALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-7", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavMbod_boddestinodescripcion_Internalname, "Bodega destino", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavMbod_boddestinodescripcion_Internalname, AV15Mbod_BodDestinoDescripcion, GXutil.rtrim( localUtil.format( AV15Mbod_BodDestinoDescripcion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "SELECCIONAR", edtavMbod_boddestinodescripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtavMbod_boddestinodescripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavMbod_boddestinocodigo_Internalname, "Código", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavMbod_boddestinocodigo_Internalname, AV14Mbod_BodDestinoCodigo, GXutil.rtrim( localUtil.format( AV14Mbod_BodDestinoCodigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMbod_boddestinocodigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtavMbod_boddestinocodigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavMbod_estado.getInternalname(), "Estado", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavMbod_estado, cmbavMbod_estado.getInternalname(), GXutil.rtrim( AV21Mbod_Estado), 1, cmbavMbod_estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavMbod_estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "", true, "HLP_WPALM_RESTRICCIONES.htm");
         cmbavMbod_estado.setValue( GXutil.rtrim( AV21Mbod_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavMbod_estado.getInternalname(), "Values", cmbavMbod_estado.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-xs hidden-sm hidden-md hidden-lg", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavMbod_tipoelementodesc_Internalname, "Descripción del elemento", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavMbod_tipoelementodesc_Internalname, AV25Mbod_TipoElementoDesc, GXutil.rtrim( localUtil.format( AV25Mbod_TipoElementoDesc, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMbod_tipoelementodesc_Jsonclick, 0, "Attribute", "", "", "", 1, edtavMbod_tipoelementodesc_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group Confirm", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttButton1_Internalname, "", "Confirmar", bttButton1_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'CONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WPALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttButton2_Internalname, "", "Cancelar", bttButton2_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WPALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start662( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Restricciones", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup660( ) ;
   }

   public void ws662( )
   {
      start662( ) ;
      evt662( ) ;
   }

   public void evt662( )
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
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e12662 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'BUSCARREGIONAL'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'BuscarRegional' */
                           e13662 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'BUSCARCENTROCOSTO'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'BuscarCentroCosto' */
                           e14662 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VMBOD_ALMMODORIGEN.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15662 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'BUSCARALMACENORIGEN'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'BuscarAlmacenOrigen' */
                           e16662 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'BUSCARBODEGAORIGEN'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'BuscarBodegaOrigen' */
                           e17662 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VMBOD_ALMMODDESTINO.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e18662 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'BUSCARALMACENDESTINIO'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'BuscarAlmacenDestinio' */
                           e19662 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'BUSCARBODEGADESTINIO'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'BuscarBodegaDestinio' */
                           e20662 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'CONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Confirmar' */
                           e21662 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e22662 ();
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
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we662( )
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

   public void pa662( )
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
         cmbavMbod_almmodorigen.setName( "vMBOD_ALMMODORIGEN" );
         cmbavMbod_almmodorigen.setWebtags( "" );
         cmbavMbod_almmodorigen.addItem("", "SELECCIONAR", (short)(0));
         cmbavMbod_almmodorigen.addItem("ALMA", "ALMACEN", (short)(0));
         cmbavMbod_almmodorigen.addItem("INVE", "INVENTARIO", (short)(0));
         cmbavMbod_almmodorigen.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
         if ( cmbavMbod_almmodorigen.getItemCount() > 0 )
         {
            AV12Mbod_AlmModOrigen = cmbavMbod_almmodorigen.getValidValue(AV12Mbod_AlmModOrigen) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12Mbod_AlmModOrigen", AV12Mbod_AlmModOrigen);
         }
         cmbavMbod_almmoddestino.setName( "vMBOD_ALMMODDESTINO" );
         cmbavMbod_almmoddestino.setWebtags( "" );
         cmbavMbod_almmoddestino.addItem("", "SELECCIONAR", (short)(0));
         cmbavMbod_almmoddestino.addItem("ALMA", "ALMACEN", (short)(0));
         cmbavMbod_almmoddestino.addItem("INVE", "INVENTARIO", (short)(0));
         cmbavMbod_almmoddestino.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
         if ( cmbavMbod_almmoddestino.getItemCount() > 0 )
         {
            AV11Mbod_AlmModDestino = cmbavMbod_almmoddestino.getValidValue(AV11Mbod_AlmModDestino) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11Mbod_AlmModDestino", AV11Mbod_AlmModDestino);
         }
         cmbavMbod_estado.setName( "vMBOD_ESTADO" );
         cmbavMbod_estado.setWebtags( "" );
         cmbavMbod_estado.addItem("A", "Activo", (short)(0));
         cmbavMbod_estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbavMbod_estado.getItemCount() > 0 )
         {
            AV21Mbod_Estado = cmbavMbod_estado.getValidValue(AV21Mbod_Estado) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21Mbod_Estado", AV21Mbod_Estado);
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
            GX_FocusControl = edtavMbod_tipomovdescrip_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void send_integrity_hashes( )
   {
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbavMbod_almmodorigen.getItemCount() > 0 )
      {
         AV12Mbod_AlmModOrigen = cmbavMbod_almmodorigen.getValidValue(AV12Mbod_AlmModOrigen) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Mbod_AlmModOrigen", AV12Mbod_AlmModOrigen);
      }
      if ( cmbavMbod_almmoddestino.getItemCount() > 0 )
      {
         AV11Mbod_AlmModDestino = cmbavMbod_almmoddestino.getValidValue(AV11Mbod_AlmModDestino) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Mbod_AlmModDestino", AV11Mbod_AlmModDestino);
      }
      if ( cmbavMbod_estado.getItemCount() > 0 )
      {
         AV21Mbod_Estado = cmbavMbod_estado.getValidValue(AV21Mbod_Estado) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Mbod_Estado", AV21Mbod_Estado);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf662( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavMbod_tipomovdescrip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMbod_tipomovdescrip_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMbod_tipomovdescrip_Enabled, 5, 0)), true);
      edtavMbod_tipomovcodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMbod_tipomovcodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMbod_tipomovcodigo_Enabled, 5, 0)), true);
      edtavMbod_regiondescripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMbod_regiondescripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMbod_regiondescripcion_Enabled, 5, 0)), true);
      edtavMbod_regioncodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMbod_regioncodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMbod_regioncodigo_Enabled, 5, 0)), true);
      edtavMbod_centrocostodescrip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMbod_centrocostodescrip_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMbod_centrocostodescrip_Enabled, 5, 0)), true);
      edtavMbod_centcostocodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMbod_centcostocodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMbod_centcostocodigo_Enabled, 5, 0)), true);
      edtavAlmag_descripcionori_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmag_descripcionori_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAlmag_descripcionori_Enabled, 5, 0)), true);
      edtavMbod_almorigencodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMbod_almorigencodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMbod_almorigencodigo_Enabled, 5, 0)), true);
      edtavMbod_bodorigendescripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMbod_bodorigendescripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMbod_bodorigendescripcion_Enabled, 5, 0)), true);
      edtavMbod_bodorigencodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMbod_bodorigencodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMbod_bodorigencodigo_Enabled, 5, 0)), true);
      edtavAlmag_descripciondes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmag_descripciondes_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAlmag_descripciondes_Enabled, 5, 0)), true);
      edtavMbod_almdestinocodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMbod_almdestinocodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMbod_almdestinocodigo_Enabled, 5, 0)), true);
      edtavMbod_boddestinodescripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMbod_boddestinodescripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMbod_boddestinodescripcion_Enabled, 5, 0)), true);
      edtavMbod_boddestinocodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMbod_boddestinocodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMbod_boddestinocodigo_Enabled, 5, 0)), true);
      edtavMbod_tipoelementodesc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMbod_tipoelementodesc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMbod_tipoelementodesc_Enabled, 5, 0)), true);
   }

   public void rf662( )
   {
      initialize_formulas( ) ;
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e22662 ();
         wb660( ) ;
      }
   }

   public void strup660( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      edtavMbod_tipomovdescrip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMbod_tipomovdescrip_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMbod_tipomovdescrip_Enabled, 5, 0)), true);
      edtavMbod_tipomovcodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMbod_tipomovcodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMbod_tipomovcodigo_Enabled, 5, 0)), true);
      edtavMbod_regiondescripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMbod_regiondescripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMbod_regiondescripcion_Enabled, 5, 0)), true);
      edtavMbod_regioncodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMbod_regioncodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMbod_regioncodigo_Enabled, 5, 0)), true);
      edtavMbod_centrocostodescrip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMbod_centrocostodescrip_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMbod_centrocostodescrip_Enabled, 5, 0)), true);
      edtavMbod_centcostocodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMbod_centcostocodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMbod_centcostocodigo_Enabled, 5, 0)), true);
      edtavAlmag_descripcionori_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmag_descripcionori_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAlmag_descripcionori_Enabled, 5, 0)), true);
      edtavMbod_almorigencodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMbod_almorigencodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMbod_almorigencodigo_Enabled, 5, 0)), true);
      edtavMbod_bodorigendescripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMbod_bodorigendescripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMbod_bodorigendescripcion_Enabled, 5, 0)), true);
      edtavMbod_bodorigencodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMbod_bodorigencodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMbod_bodorigencodigo_Enabled, 5, 0)), true);
      edtavAlmag_descripciondes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmag_descripciondes_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAlmag_descripciondes_Enabled, 5, 0)), true);
      edtavMbod_almdestinocodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMbod_almdestinocodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMbod_almdestinocodigo_Enabled, 5, 0)), true);
      edtavMbod_boddestinodescripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMbod_boddestinodescripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMbod_boddestinodescripcion_Enabled, 5, 0)), true);
      edtavMbod_boddestinocodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMbod_boddestinocodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMbod_boddestinocodigo_Enabled, 5, 0)), true);
      edtavMbod_tipoelementodesc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMbod_tipoelementodesc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMbod_tipoelementodesc_Enabled, 5, 0)), true);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e12662 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV27Mbod_TipoMovDescrip = httpContext.cgiGet( edtavMbod_tipomovdescrip_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Mbod_TipoMovDescrip", AV27Mbod_TipoMovDescrip);
         AV26Mbod_TipoMovCodigo = httpContext.cgiGet( edtavMbod_tipomovcodigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Mbod_TipoMovCodigo", AV26Mbod_TipoMovCodigo);
         AV23Mbod_RegionDescripcion = httpContext.cgiGet( edtavMbod_regiondescripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23Mbod_RegionDescripcion", AV23Mbod_RegionDescripcion);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMbod_regioncodigo_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMbod_regioncodigo_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMBOD_REGIONCODIGO");
            GX_FocusControl = edtavMbod_regioncodigo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV22Mbod_RegionCodigo = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22Mbod_RegionCodigo", GXutil.ltrim( GXutil.str( AV22Mbod_RegionCodigo, 4, 0)));
         }
         else
         {
            AV22Mbod_RegionCodigo = (short)(localUtil.ctol( httpContext.cgiGet( edtavMbod_regioncodigo_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22Mbod_RegionCodigo", GXutil.ltrim( GXutil.str( AV22Mbod_RegionCodigo, 4, 0)));
         }
         AV20Mbod_CentroCostoDescrip = httpContext.cgiGet( edtavMbod_centrocostodescrip_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Mbod_CentroCostoDescrip", AV20Mbod_CentroCostoDescrip);
         AV18Mbod_CentCostoCodigo = httpContext.cgiGet( edtavMbod_centcostocodigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Mbod_CentCostoCodigo", AV18Mbod_CentCostoCodigo);
         cmbavMbod_almmodorigen.setValue( httpContext.cgiGet( cmbavMbod_almmodorigen.getInternalname()) );
         AV12Mbod_AlmModOrigen = httpContext.cgiGet( cmbavMbod_almmodorigen.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Mbod_AlmModOrigen", AV12Mbod_AlmModOrigen);
         AV9AlmaG_DescripcionOri = httpContext.cgiGet( edtavAlmag_descripcionori_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlmaG_DescripcionOri", AV9AlmaG_DescripcionOri);
         AV13Mbod_AlmOrigenCodigo = httpContext.cgiGet( edtavMbod_almorigencodigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Mbod_AlmOrigenCodigo", AV13Mbod_AlmOrigenCodigo);
         AV17Mbod_BodOrigenDescripcion = GXutil.upper( httpContext.cgiGet( edtavMbod_bodorigendescripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Mbod_BodOrigenDescripcion", AV17Mbod_BodOrigenDescripcion);
         AV16Mbod_BodOrigenCodigo = httpContext.cgiGet( edtavMbod_bodorigencodigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Mbod_BodOrigenCodigo", AV16Mbod_BodOrigenCodigo);
         cmbavMbod_almmoddestino.setValue( httpContext.cgiGet( cmbavMbod_almmoddestino.getInternalname()) );
         AV11Mbod_AlmModDestino = httpContext.cgiGet( cmbavMbod_almmoddestino.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Mbod_AlmModDestino", AV11Mbod_AlmModDestino);
         AV8AlmaG_DescripcionDes = httpContext.cgiGet( edtavAlmag_descripciondes_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8AlmaG_DescripcionDes", AV8AlmaG_DescripcionDes);
         AV10Mbod_AlmDestinoCodigo = httpContext.cgiGet( edtavMbod_almdestinocodigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10Mbod_AlmDestinoCodigo", AV10Mbod_AlmDestinoCodigo);
         AV15Mbod_BodDestinoDescripcion = GXutil.upper( httpContext.cgiGet( edtavMbod_boddestinodescripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Mbod_BodDestinoDescripcion", AV15Mbod_BodDestinoDescripcion);
         AV14Mbod_BodDestinoCodigo = httpContext.cgiGet( edtavMbod_boddestinocodigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Mbod_BodDestinoCodigo", AV14Mbod_BodDestinoCodigo);
         cmbavMbod_estado.setValue( httpContext.cgiGet( cmbavMbod_estado.getInternalname()) );
         AV21Mbod_Estado = httpContext.cgiGet( cmbavMbod_estado.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Mbod_Estado", AV21Mbod_Estado);
         AV25Mbod_TipoElementoDesc = GXutil.upper( httpContext.cgiGet( edtavMbod_tipoelementodesc_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25Mbod_TipoElementoDesc", AV25Mbod_TipoElementoDesc);
         /* Read saved values. */
         AV5Mbod_TipoElementoCod = localUtil.ctol( httpContext.cgiGet( "vMBOD_TIPOELEMENTOCOD"), ",", ".") ;
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
      e12662 ();
      if (returnInSub) return;
   }

   public void e12662( )
   {
      /* Start Routine */
      Form.setCaption( "Restricciones" );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV35Usuario = AV7websession.getValue("Usuario") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Usuario", AV35Usuario);
      AV27Mbod_TipoMovDescrip = "SELECCIONAR" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Mbod_TipoMovDescrip", AV27Mbod_TipoMovDescrip);
      AV23Mbod_RegionDescripcion = "SELECCIONAR" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Mbod_RegionDescripcion", AV23Mbod_RegionDescripcion);
      AV20Mbod_CentroCostoDescrip = "SELECCIONAR" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Mbod_CentroCostoDescrip", AV20Mbod_CentroCostoDescrip);
      AV9AlmaG_DescripcionOri = "SELECCIONAR" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9AlmaG_DescripcionOri", AV9AlmaG_DescripcionOri);
      AV17Mbod_BodOrigenDescripcion = "SELECCIONAR" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Mbod_BodOrigenDescripcion", AV17Mbod_BodOrigenDescripcion);
      AV8AlmaG_DescripcionDes = "SELECCIONAR" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8AlmaG_DescripcionDes", AV8AlmaG_DescripcionDes);
      AV15Mbod_BodDestinoDescripcion = "SELECCIONAR" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Mbod_BodDestinoDescripcion", AV15Mbod_BodDestinoDescripcion);
      if ( GXutil.strcmp(Gx_mode, "UDP") == 0 )
      {
         /* Execute user subroutine: 'MODOCARGAR' */
         S112 ();
         if (returnInSub) return;
      }
      if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
      {
         /* Execute user subroutine: 'CONFIRMAR' */
         S122 ();
         if (returnInSub) return;
         httpContext.setWebReturnParms(new Object[] {Gx_mode,new Long(AV6PMbod_Id)});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
   }

   public void S112( )
   {
      /* 'MODOCARGAR' Routine */
      GXv_SdtSDTALM_RESTRICCIONES1[0] = AV33SDTALM_RESTRICCIONES;
      GXv_char2[0] = "CAR" ;
      GXv_int3[0] = AV6PMbod_Id ;
      new com.orions2.palm_restricciones(remoteHandle, context).execute( GXv_SdtSDTALM_RESTRICCIONES1, GXv_char2, GXv_int3) ;
      AV33SDTALM_RESTRICCIONES = GXv_SdtSDTALM_RESTRICCIONES1[0] ;
      wpalm_restricciones_impl.this.AV6PMbod_Id = GXv_int3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6PMbod_Id", GXutil.ltrim( GXutil.str( AV6PMbod_Id, 11, 0)));
      AV26Mbod_TipoMovCodigo = AV33SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovcodigo() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Mbod_TipoMovCodigo", AV26Mbod_TipoMovCodigo);
      AV27Mbod_TipoMovDescrip = AV33SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovdescrip() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Mbod_TipoMovDescrip", AV27Mbod_TipoMovDescrip);
      AV5Mbod_TipoElementoCod = AV33SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipoelementocod() ;
      AV25Mbod_TipoElementoDesc = AV33SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipoelementodesc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Mbod_TipoElementoDesc", AV25Mbod_TipoElementoDesc);
      AV24Mbod_RegionId = AV33SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_regionid() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Mbod_RegionId", GXutil.ltrim( GXutil.str( AV24Mbod_RegionId, 11, 0)));
      AV22Mbod_RegionCodigo = AV33SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_regioncodigo() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Mbod_RegionCodigo", GXutil.ltrim( GXutil.str( AV22Mbod_RegionCodigo, 4, 0)));
      AV23Mbod_RegionDescripcion = AV33SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_regiondescripcion() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Mbod_RegionDescripcion", AV23Mbod_RegionDescripcion);
      AV19Mbod_CentCostoId = AV33SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostoid() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Mbod_CentCostoId", GXutil.ltrim( GXutil.str( AV19Mbod_CentCostoId, 11, 0)));
      AV18Mbod_CentCostoCodigo = AV33SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostocodigo() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Mbod_CentCostoCodigo", AV18Mbod_CentCostoCodigo);
      AV20Mbod_CentroCostoDescrip = AV33SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_centrocostodescrip() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Mbod_CentroCostoDescrip", AV20Mbod_CentroCostoDescrip);
      AV12Mbod_AlmModOrigen = AV33SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmodorigen() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Mbod_AlmModOrigen", AV12Mbod_AlmModOrigen);
      AV13Mbod_AlmOrigenCodigo = AV33SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigencodigo() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Mbod_AlmOrigenCodigo", AV13Mbod_AlmOrigenCodigo);
      AV9AlmaG_DescripcionOri = AV33SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigendescripcion() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9AlmaG_DescripcionOri", AV9AlmaG_DescripcionOri);
      AV16Mbod_BodOrigenCodigo = AV33SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigencodigo() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Mbod_BodOrigenCodigo", AV16Mbod_BodOrigenCodigo);
      AV17Mbod_BodOrigenDescripcion = AV33SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigendescripcion() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Mbod_BodOrigenDescripcion", AV17Mbod_BodOrigenDescripcion);
      AV11Mbod_AlmModDestino = AV33SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmoddestino() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Mbod_AlmModDestino", AV11Mbod_AlmModDestino);
      AV10Mbod_AlmDestinoCodigo = AV33SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinocodigo() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Mbod_AlmDestinoCodigo", AV10Mbod_AlmDestinoCodigo);
      AV8AlmaG_DescripcionDes = AV33SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinodescripcion() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8AlmaG_DescripcionDes", AV8AlmaG_DescripcionDes);
      AV14Mbod_BodDestinoCodigo = AV33SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinocodigo() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Mbod_BodDestinoCodigo", AV14Mbod_BodDestinoCodigo);
      AV15Mbod_BodDestinoDescripcion = AV33SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinodescripcion() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Mbod_BodDestinoDescripcion", AV15Mbod_BodDestinoDescripcion);
      AV21Mbod_Estado = AV33SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_estado() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Mbod_Estado", AV21Mbod_Estado);
   }

   public void S122( )
   {
      /* 'CONFIRMAR' Routine */
      AV33SDTALM_RESTRICCIONES.setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovcodigo( AV26Mbod_TipoMovCodigo );
      AV33SDTALM_RESTRICCIONES.setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_regionid( AV24Mbod_RegionId );
      AV33SDTALM_RESTRICCIONES.setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostoid( AV19Mbod_CentCostoId );
      AV33SDTALM_RESTRICCIONES.setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmodorigen( AV12Mbod_AlmModOrigen );
      AV33SDTALM_RESTRICCIONES.setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigencodigo( AV13Mbod_AlmOrigenCodigo );
      AV33SDTALM_RESTRICCIONES.setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigencodigo( AV16Mbod_BodOrigenCodigo );
      AV33SDTALM_RESTRICCIONES.setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmoddestino( AV11Mbod_AlmModDestino );
      AV33SDTALM_RESTRICCIONES.setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinocodigo( AV10Mbod_AlmDestinoCodigo );
      AV33SDTALM_RESTRICCIONES.setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinocodigo( AV14Mbod_BodDestinoCodigo );
      AV33SDTALM_RESTRICCIONES.setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_usuariocrea( AV35Usuario );
      AV33SDTALM_RESTRICCIONES.setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_estado( AV21Mbod_Estado );
      GXv_SdtSDTALM_RESTRICCIONES1[0] = AV33SDTALM_RESTRICCIONES;
      GXv_char2[0] = Gx_mode ;
      GXv_int3[0] = AV6PMbod_Id ;
      new com.orions2.palm_restricciones(remoteHandle, context).execute( GXv_SdtSDTALM_RESTRICCIONES1, GXv_char2, GXv_int3) ;
      AV33SDTALM_RESTRICCIONES = GXv_SdtSDTALM_RESTRICCIONES1[0] ;
      wpalm_restricciones_impl.this.Gx_mode = GXv_char2[0] ;
      wpalm_restricciones_impl.this.AV6PMbod_Id = GXv_int3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "AV6PMbod_Id", GXutil.ltrim( GXutil.str( AV6PMbod_Id, 11, 0)));
   }

   public void e13662( )
   {
      /* 'BuscarRegional' Routine */
      AV34SW = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34SW", GXutil.ltrim( GXutil.str( AV34SW, 4, 0)));
      /* Execute user subroutine: 'BORRARDATOS' */
      S132 ();
      if (returnInSub) return;
      httpContext.popup(formatLink("com.orions2.regionalres") + "?" + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")), new Object[] {"AV24Mbod_RegionId","AV22Mbod_RegionCodigo","AV23Mbod_RegionDescripcion"});
      cmbavMbod_almmodorigen.setValue( GXutil.rtrim( AV12Mbod_AlmModOrigen) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavMbod_almmodorigen.getInternalname(), "Values", cmbavMbod_almmodorigen.ToJavascriptSource(), true);
      cmbavMbod_almmoddestino.setValue( GXutil.rtrim( AV11Mbod_AlmModDestino) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavMbod_almmoddestino.getInternalname(), "Values", cmbavMbod_almmoddestino.ToJavascriptSource(), true);
   }

   public void e14662( )
   {
      /* 'BuscarCentroCosto' Routine */
      if ( AV24Mbod_RegionId != 0 )
      {
         AV34SW = (short)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34SW", GXutil.ltrim( GXutil.str( AV34SW, 4, 0)));
         /* Execute user subroutine: 'BORRARDATOS' */
         S132 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("com.orions2.centrocostorest") + "?" + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV22Mbod_RegionCodigo,4,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")), new Object[] {"AV19Mbod_CentCostoId","AV20Mbod_CentroCostoDescrip","AV22Mbod_RegionCodigo","AV18Mbod_CentCostoCodigo"});
      }
      else
      {
         httpContext.GX_msglist.addItem("ERROR.. Debe seleccionar una regional.");
      }
      cmbavMbod_almmodorigen.setValue( GXutil.rtrim( AV12Mbod_AlmModOrigen) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavMbod_almmodorigen.getInternalname(), "Values", cmbavMbod_almmodorigen.ToJavascriptSource(), true);
      cmbavMbod_almmoddestino.setValue( GXutil.rtrim( AV11Mbod_AlmModDestino) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavMbod_almmoddestino.getInternalname(), "Values", cmbavMbod_almmoddestino.ToJavascriptSource(), true);
   }

   public void e15662( )
   {
      /* Mbod_almmodorigen_Click Routine */
      AV34SW = (short)(3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34SW", GXutil.ltrim( GXutil.str( AV34SW, 4, 0)));
      /* Execute user subroutine: 'BORRARDATOS' */
      S132 ();
      if (returnInSub) return;
      cmbavMbod_almmodorigen.setValue( GXutil.rtrim( AV12Mbod_AlmModOrigen) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavMbod_almmodorigen.getInternalname(), "Values", cmbavMbod_almmodorigen.ToJavascriptSource(), true);
      cmbavMbod_almmoddestino.setValue( GXutil.rtrim( AV11Mbod_AlmModDestino) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavMbod_almmoddestino.getInternalname(), "Values", cmbavMbod_almmoddestino.ToJavascriptSource(), true);
   }

   public void e16662( )
   {
      /* 'BuscarAlmacenOrigen' Routine */
      if ( AV24Mbod_RegionId != 0 )
      {
         if ( AV19Mbod_CentCostoId != 0 )
         {
            if ( GXutil.strcmp(AV12Mbod_AlmModOrigen, "") != 0 )
            {
               AV34SW = (short)(4) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV34SW", GXutil.ltrim( GXutil.str( AV34SW, 4, 0)));
               /* Execute user subroutine: 'BORRARDATOS' */
               S132 ();
               if (returnInSub) return;
               if ( GXutil.strcmp(AV18Mbod_CentCostoCodigo, "000000") == 0 )
               {
                  httpContext.popup(formatLink("com.orions2.almagenrest") + "?" + GXutil.URLEncode(GXutil.rtrim(AV13Mbod_AlmOrigenCodigo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV9AlmaG_DescripcionOri)) + "," + GXutil.URLEncode(GXutil.rtrim(AV12Mbod_AlmModOrigen)), new Object[] {"AV13Mbod_AlmOrigenCodigo","AV9AlmaG_DescripcionOri","AV12Mbod_AlmModOrigen"});
               }
               else
               {
                  httpContext.popup(formatLink("com.orions2.almacenrest") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV19Mbod_CentCostoId,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim(AV12Mbod_AlmModOrigen)), new Object[] {"AV19Mbod_CentCostoId","AV13Mbod_AlmOrigenCodigo","AV9AlmaG_DescripcionOri","AV12Mbod_AlmModOrigen"});
               }
            }
            else
            {
               httpContext.GX_msglist.addItem("ERROR.. Debe seleccionar el Modulo Origen.");
            }
         }
         else
         {
            httpContext.GX_msglist.addItem("ERROR.. Debe seleccionar un Centro de Costo.");
         }
      }
      else
      {
         httpContext.GX_msglist.addItem("ERROR.. Debe seleccionar una Regional");
      }
      cmbavMbod_almmodorigen.setValue( GXutil.rtrim( AV12Mbod_AlmModOrigen) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavMbod_almmodorigen.getInternalname(), "Values", cmbavMbod_almmodorigen.ToJavascriptSource(), true);
      cmbavMbod_almmoddestino.setValue( GXutil.rtrim( AV11Mbod_AlmModDestino) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavMbod_almmoddestino.getInternalname(), "Values", cmbavMbod_almmoddestino.ToJavascriptSource(), true);
   }

   public void e17662( )
   {
      /* 'BuscarBodegaOrigen' Routine */
      if ( AV24Mbod_RegionId != 0 )
      {
         if ( AV19Mbod_CentCostoId != 0 )
         {
            if ( GXutil.strcmp(AV12Mbod_AlmModOrigen, "") != 0 )
            {
               if ( GXutil.strcmp(AV13Mbod_AlmOrigenCodigo, "") != 0 )
               {
                  if ( GXutil.strcmp(AV13Mbod_AlmOrigenCodigo, "00") == 0 )
                  {
                     httpContext.popup(formatLink("com.orions2.bodegarest") + "?" + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")), new Object[] {"AV16Mbod_BodOrigenCodigo","AV17Mbod_BodOrigenDescripcion"});
                  }
                  else
                  {
                     httpContext.popup(formatLink("com.orions2.bodealmrest") + "?" + GXutil.URLEncode(GXutil.rtrim(AV18Mbod_CentCostoCodigo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV13Mbod_AlmOrigenCodigo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV12Mbod_AlmModOrigen)) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")), new Object[] {"AV13Mbod_AlmOrigenCodigo","AV12Mbod_AlmModOrigen","AV16Mbod_BodOrigenCodigo","AV17Mbod_BodOrigenDescripcion"});
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem("ERROR.. Debe seleccionar un Almacen de Origen.");
               }
            }
            else
            {
               httpContext.GX_msglist.addItem("ERROR.. Debe seleccionar el Modulo Origen.");
            }
         }
         else
         {
            httpContext.GX_msglist.addItem("ERROR.. Debe seleccionar un Centro de Costo.");
         }
      }
      else
      {
         httpContext.GX_msglist.addItem("ERROR.. Debe seleccionar una Regional");
      }
      cmbavMbod_almmodorigen.setValue( GXutil.rtrim( AV12Mbod_AlmModOrigen) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavMbod_almmodorigen.getInternalname(), "Values", cmbavMbod_almmodorigen.ToJavascriptSource(), true);
   }

   public void e18662( )
   {
      /* Mbod_almmoddestino_Click Routine */
      AV34SW = (short)(5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34SW", GXutil.ltrim( GXutil.str( AV34SW, 4, 0)));
      /* Execute user subroutine: 'BORRARDATOS' */
      S132 ();
      if (returnInSub) return;
      cmbavMbod_almmodorigen.setValue( GXutil.rtrim( AV12Mbod_AlmModOrigen) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavMbod_almmodorigen.getInternalname(), "Values", cmbavMbod_almmodorigen.ToJavascriptSource(), true);
      cmbavMbod_almmoddestino.setValue( GXutil.rtrim( AV11Mbod_AlmModDestino) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavMbod_almmoddestino.getInternalname(), "Values", cmbavMbod_almmoddestino.ToJavascriptSource(), true);
   }

   public void e19662( )
   {
      /* 'BuscarAlmacenDestinio' Routine */
      if ( AV24Mbod_RegionId != 0 )
      {
         if ( AV19Mbod_CentCostoId != 0 )
         {
            if ( GXutil.strcmp(AV11Mbod_AlmModDestino, "") != 0 )
            {
               AV34SW = (short)(6) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV34SW", GXutil.ltrim( GXutil.str( AV34SW, 4, 0)));
               /* Execute user subroutine: 'BORRARDATOS' */
               S132 ();
               if (returnInSub) return;
               if ( GXutil.strcmp(AV18Mbod_CentCostoCodigo, "000000") == 0 )
               {
                  httpContext.popup(formatLink("com.orions2.almagenrest") + "?" + GXutil.URLEncode(GXutil.rtrim(AV10Mbod_AlmDestinoCodigo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV8AlmaG_DescripcionDes)) + "," + GXutil.URLEncode(GXutil.rtrim(AV11Mbod_AlmModDestino)), new Object[] {"AV10Mbod_AlmDestinoCodigo","AV8AlmaG_DescripcionDes","AV11Mbod_AlmModDestino"});
               }
               else
               {
                  httpContext.popup(formatLink("com.orions2.almacenrest") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV19Mbod_CentCostoId,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim(AV11Mbod_AlmModDestino)), new Object[] {"AV19Mbod_CentCostoId","AV10Mbod_AlmDestinoCodigo","AV8AlmaG_DescripcionDes","AV11Mbod_AlmModDestino"});
               }
            }
            else
            {
               httpContext.GX_msglist.addItem("ERROR.. Debe seleccionar el Modulo Destino.");
            }
         }
         else
         {
            httpContext.GX_msglist.addItem("ERROR.. Debe seleccionar un Centro de Costo.");
         }
      }
      else
      {
         httpContext.GX_msglist.addItem("ERROR.. Debe seleccionar una Regional");
      }
      cmbavMbod_almmoddestino.setValue( GXutil.rtrim( AV11Mbod_AlmModDestino) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavMbod_almmoddestino.getInternalname(), "Values", cmbavMbod_almmoddestino.ToJavascriptSource(), true);
      cmbavMbod_almmodorigen.setValue( GXutil.rtrim( AV12Mbod_AlmModOrigen) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavMbod_almmodorigen.getInternalname(), "Values", cmbavMbod_almmodorigen.ToJavascriptSource(), true);
   }

   public void e20662( )
   {
      /* 'BuscarBodegaDestinio' Routine */
      if ( AV24Mbod_RegionId != 0 )
      {
         if ( AV19Mbod_CentCostoId != 0 )
         {
            if ( GXutil.strcmp(AV11Mbod_AlmModDestino, "") != 0 )
            {
               if ( GXutil.strcmp(AV10Mbod_AlmDestinoCodigo, "") != 0 )
               {
                  if ( GXutil.strcmp(AV10Mbod_AlmDestinoCodigo, "00") == 0 )
                  {
                     httpContext.popup(formatLink("com.orions2.bodegarest") + "?" + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")), new Object[] {"AV14Mbod_BodDestinoCodigo","AV15Mbod_BodDestinoDescripcion"});
                  }
                  else
                  {
                     httpContext.popup(formatLink("com.orions2.bodealmrest") + "?" + GXutil.URLEncode(GXutil.rtrim(AV18Mbod_CentCostoCodigo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV10Mbod_AlmDestinoCodigo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV11Mbod_AlmModDestino)) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")), new Object[] {"AV10Mbod_AlmDestinoCodigo","AV11Mbod_AlmModDestino","AV14Mbod_BodDestinoCodigo","AV15Mbod_BodDestinoDescripcion"});
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem("ERROR.. Debe seleccionar un Almacen de Destino.");
               }
            }
            else
            {
               httpContext.GX_msglist.addItem("ERROR.. Debe seleccionar el Modulo Origen.");
            }
         }
         else
         {
            httpContext.GX_msglist.addItem("ERROR.. Debe seleccionar un Centro de Costo.");
         }
      }
      else
      {
         httpContext.GX_msglist.addItem("ERROR.. Debe seleccionar una Regional");
      }
      cmbavMbod_almmoddestino.setValue( GXutil.rtrim( AV11Mbod_AlmModDestino) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavMbod_almmoddestino.getInternalname(), "Values", cmbavMbod_almmoddestino.ToJavascriptSource(), true);
   }

   public void S132( )
   {
      /* 'BORRARDATOS' Routine */
      if ( AV34SW == 1 )
      {
         AV24Mbod_RegionId = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24Mbod_RegionId", GXutil.ltrim( GXutil.str( AV24Mbod_RegionId, 11, 0)));
         AV22Mbod_RegionCodigo = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Mbod_RegionCodigo", GXutil.ltrim( GXutil.str( AV22Mbod_RegionCodigo, 4, 0)));
         AV23Mbod_RegionDescripcion = "SELECCIONAR" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23Mbod_RegionDescripcion", AV23Mbod_RegionDescripcion);
         AV19Mbod_CentCostoId = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Mbod_CentCostoId", GXutil.ltrim( GXutil.str( AV19Mbod_CentCostoId, 11, 0)));
         AV20Mbod_CentroCostoDescrip = "SELECCIONAR" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Mbod_CentroCostoDescrip", AV20Mbod_CentroCostoDescrip);
         AV18Mbod_CentCostoCodigo = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Mbod_CentCostoCodigo", AV18Mbod_CentCostoCodigo);
         AV12Mbod_AlmModOrigen = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Mbod_AlmModOrigen", AV12Mbod_AlmModOrigen);
         AV13Mbod_AlmOrigenCodigo = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Mbod_AlmOrigenCodigo", AV13Mbod_AlmOrigenCodigo);
         AV9AlmaG_DescripcionOri = "SELECCIONAR" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlmaG_DescripcionOri", AV9AlmaG_DescripcionOri);
         AV16Mbod_BodOrigenCodigo = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Mbod_BodOrigenCodigo", AV16Mbod_BodOrigenCodigo);
         AV17Mbod_BodOrigenDescripcion = "SELECCIONAR" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Mbod_BodOrigenDescripcion", AV17Mbod_BodOrigenDescripcion);
         AV11Mbod_AlmModDestino = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Mbod_AlmModDestino", AV11Mbod_AlmModDestino);
         AV10Mbod_AlmDestinoCodigo = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10Mbod_AlmDestinoCodigo", AV10Mbod_AlmDestinoCodigo);
         AV8AlmaG_DescripcionDes = "SELECCIONAR" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8AlmaG_DescripcionDes", AV8AlmaG_DescripcionDes);
         AV16Mbod_BodOrigenCodigo = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Mbod_BodOrigenCodigo", AV16Mbod_BodOrigenCodigo);
         AV17Mbod_BodOrigenDescripcion = "SELECCIONAR" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Mbod_BodOrigenDescripcion", AV17Mbod_BodOrigenDescripcion);
      }
      else if ( AV34SW == 2 )
      {
         AV19Mbod_CentCostoId = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Mbod_CentCostoId", GXutil.ltrim( GXutil.str( AV19Mbod_CentCostoId, 11, 0)));
         AV20Mbod_CentroCostoDescrip = "SELECCIONAR" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Mbod_CentroCostoDescrip", AV20Mbod_CentroCostoDescrip);
         AV18Mbod_CentCostoCodigo = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Mbod_CentCostoCodigo", AV18Mbod_CentCostoCodigo);
         AV12Mbod_AlmModOrigen = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Mbod_AlmModOrigen", AV12Mbod_AlmModOrigen);
         AV13Mbod_AlmOrigenCodigo = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Mbod_AlmOrigenCodigo", AV13Mbod_AlmOrigenCodigo);
         AV9AlmaG_DescripcionOri = "SELECCIONAR" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlmaG_DescripcionOri", AV9AlmaG_DescripcionOri);
         AV16Mbod_BodOrigenCodigo = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Mbod_BodOrigenCodigo", AV16Mbod_BodOrigenCodigo);
         AV17Mbod_BodOrigenDescripcion = "SELECCIONAR" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Mbod_BodOrigenDescripcion", AV17Mbod_BodOrigenDescripcion);
         AV11Mbod_AlmModDestino = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Mbod_AlmModDestino", AV11Mbod_AlmModDestino);
         AV10Mbod_AlmDestinoCodigo = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10Mbod_AlmDestinoCodigo", AV10Mbod_AlmDestinoCodigo);
         AV8AlmaG_DescripcionDes = "SELECCIONAR" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8AlmaG_DescripcionDes", AV8AlmaG_DescripcionDes);
         AV14Mbod_BodDestinoCodigo = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Mbod_BodDestinoCodigo", AV14Mbod_BodDestinoCodigo);
         AV15Mbod_BodDestinoDescripcion = "SELECCIONAR" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Mbod_BodDestinoDescripcion", AV15Mbod_BodDestinoDescripcion);
      }
      else if ( AV34SW == 3 )
      {
         AV13Mbod_AlmOrigenCodigo = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Mbod_AlmOrigenCodigo", AV13Mbod_AlmOrigenCodigo);
         AV9AlmaG_DescripcionOri = "SELECCIONAR" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlmaG_DescripcionOri", AV9AlmaG_DescripcionOri);
         AV16Mbod_BodOrigenCodigo = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Mbod_BodOrigenCodigo", AV16Mbod_BodOrigenCodigo);
         AV17Mbod_BodOrigenDescripcion = "SELECCIONAR" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Mbod_BodOrigenDescripcion", AV17Mbod_BodOrigenDescripcion);
      }
      else if ( AV34SW == 4 )
      {
         AV16Mbod_BodOrigenCodigo = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Mbod_BodOrigenCodigo", AV16Mbod_BodOrigenCodigo);
         AV17Mbod_BodOrigenDescripcion = "SELECCIONAR" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Mbod_BodOrigenDescripcion", AV17Mbod_BodOrigenDescripcion);
      }
      else if ( AV34SW == 5 )
      {
         AV10Mbod_AlmDestinoCodigo = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10Mbod_AlmDestinoCodigo", AV10Mbod_AlmDestinoCodigo);
         AV8AlmaG_DescripcionDes = "SELECCIONAR" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8AlmaG_DescripcionDes", AV8AlmaG_DescripcionDes);
         AV14Mbod_BodDestinoCodigo = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Mbod_BodDestinoCodigo", AV14Mbod_BodDestinoCodigo);
         AV15Mbod_BodDestinoDescripcion = "SELECCIONAR" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Mbod_BodDestinoDescripcion", AV15Mbod_BodDestinoDescripcion);
      }
      else if ( AV34SW == 6 )
      {
         AV14Mbod_BodDestinoCodigo = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Mbod_BodDestinoCodigo", AV14Mbod_BodDestinoCodigo);
         AV15Mbod_BodDestinoDescripcion = "SELECCIONAR" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Mbod_BodDestinoDescripcion", AV15Mbod_BodDestinoDescripcion);
      }
   }

   public void S142( )
   {
      /* 'VALIDARDATOS' Routine */
      AV40Swe = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Swe", GXutil.str( AV40Swe, 1, 0));
      if ( AV24Mbod_RegionId == 0 )
      {
         AV40Swe = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Swe", GXutil.str( AV40Swe, 1, 0));
      }
      if ( GXutil.strcmp(AV23Mbod_RegionDescripcion, "") == 0 )
      {
         AV40Swe = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Swe", GXutil.str( AV40Swe, 1, 0));
      }
      if ( AV19Mbod_CentCostoId == 0 )
      {
         AV40Swe = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Swe", GXutil.str( AV40Swe, 1, 0));
      }
      if ( GXutil.strcmp(AV20Mbod_CentroCostoDescrip, "") == 0 )
      {
         AV40Swe = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Swe", GXutil.str( AV40Swe, 1, 0));
      }
      if ( GXutil.strcmp(AV18Mbod_CentCostoCodigo, "") == 0 )
      {
         AV40Swe = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Swe", GXutil.str( AV40Swe, 1, 0));
      }
      if ( GXutil.strcmp(AV12Mbod_AlmModOrigen, "") == 0 )
      {
         AV40Swe = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Swe", GXutil.str( AV40Swe, 1, 0));
      }
      if ( GXutil.strcmp(AV13Mbod_AlmOrigenCodigo, "") == 0 )
      {
         AV40Swe = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Swe", GXutil.str( AV40Swe, 1, 0));
      }
      if ( GXutil.strcmp(AV9AlmaG_DescripcionOri, "") == 0 )
      {
         AV40Swe = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Swe", GXutil.str( AV40Swe, 1, 0));
      }
      if ( GXutil.strcmp(AV16Mbod_BodOrigenCodigo, "") == 0 )
      {
         AV40Swe = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Swe", GXutil.str( AV40Swe, 1, 0));
      }
      if ( GXutil.strcmp(AV17Mbod_BodOrigenDescripcion, "") == 0 )
      {
         AV40Swe = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Swe", GXutil.str( AV40Swe, 1, 0));
      }
      if ( GXutil.strcmp(AV11Mbod_AlmModDestino, "") == 0 )
      {
         AV40Swe = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Swe", GXutil.str( AV40Swe, 1, 0));
      }
      if ( GXutil.strcmp(AV10Mbod_AlmDestinoCodigo, "") == 0 )
      {
         AV40Swe = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Swe", GXutil.str( AV40Swe, 1, 0));
      }
      if ( GXutil.strcmp(AV8AlmaG_DescripcionDes, "") == 0 )
      {
         AV40Swe = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Swe", GXutil.str( AV40Swe, 1, 0));
      }
      if ( GXutil.strcmp(AV16Mbod_BodOrigenCodigo, "") == 0 )
      {
         AV40Swe = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Swe", GXutil.str( AV40Swe, 1, 0));
      }
      if ( GXutil.strcmp(AV17Mbod_BodOrigenDescripcion, "") == 0 )
      {
         AV40Swe = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Swe", GXutil.str( AV40Swe, 1, 0));
      }
   }

   public void e21662( )
   {
      /* 'Confirmar' Routine */
      /* Execute user subroutine: 'VALIDARDATOS' */
      S142 ();
      if (returnInSub) return;
      if ( AV40Swe == 1 )
      {
         httpContext.GX_msglist.addItem("ERROR..Todos los datos son obligatorios");
      }
      else
      {
         AV36SWConvinacion = false ;
         /* Execute user subroutine: 'VALIDARDEFINICION' */
         S152 ();
         if (returnInSub) return;
         if ( ! AV36SWConvinacion )
         {
            /* Execute user subroutine: 'CONFIRMAR' */
            S122 ();
            if (returnInSub) return;
            httpContext.setWebReturnParms(new Object[] {Gx_mode,new Long(AV6PMbod_Id)});
            httpContext.wjLocDisableFrm = (byte)(1) ;
            httpContext.nUserReturn = (byte)(1) ;
            returnInSub = true;
            if (true) return;
         }
      }
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33SDTALM_RESTRICCIONES", AV33SDTALM_RESTRICCIONES);
   }

   public void S152( )
   {
      /* 'VALIDARDEFINICION' Routine */
      if ( ( AV22Mbod_RegionCodigo == 0 ) && ( GXutil.strcmp(AV18Mbod_CentCostoCodigo, "000000") == 0 ) && ( GXutil.strcmp(AV13Mbod_AlmOrigenCodigo, "00") == 0 ) && ( GXutil.strcmp(AV16Mbod_BodOrigenCodigo, "000") == 0 ) && ( GXutil.strcmp(AV10Mbod_AlmDestinoCodigo, "00") == 0 ) && ( GXutil.strcmp(AV14Mbod_BodDestinoCodigo, "000") == 0 ) )
      {
         httpContext.GX_msglist.addItem("ERROR.. No se permite este tipo de combinaciones");
         AV36SWConvinacion = true ;
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e22662( )
   {
      /* Load Routine */
   }

   public void setparameters( Object[] obj )
   {
      Gx_mode = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      AV6PMbod_Id = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6PMbod_Id", GXutil.ltrim( GXutil.str( AV6PMbod_Id, 11, 0)));
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
      pa662( ) ;
      ws662( ) ;
      we662( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414201999");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("wpalm_restricciones.js", "?201861414201999");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTitle_Internalname = "TITLE" ;
      divTitlecontainer_Internalname = "TITLECONTAINER" ;
      imgImage1_Internalname = "IMAGE1" ;
      edtavMbod_tipomovdescrip_Internalname = "vMBOD_TIPOMOVDESCRIP" ;
      edtavMbod_tipomovcodigo_Internalname = "vMBOD_TIPOMOVCODIGO" ;
      imgImage2_Internalname = "IMAGE2" ;
      edtavMbod_regiondescripcion_Internalname = "vMBOD_REGIONDESCRIPCION" ;
      edtavMbod_regioncodigo_Internalname = "vMBOD_REGIONCODIGO" ;
      imgImage3_Internalname = "IMAGE3" ;
      edtavMbod_centrocostodescrip_Internalname = "vMBOD_CENTROCOSTODESCRIP" ;
      edtavMbod_centcostocodigo_Internalname = "vMBOD_CENTCOSTOCODIGO" ;
      cmbavMbod_almmodorigen.setInternalname( "vMBOD_ALMMODORIGEN" );
      imgImage4_Internalname = "IMAGE4" ;
      edtavAlmag_descripcionori_Internalname = "vALMAG_DESCRIPCIONORI" ;
      edtavMbod_almorigencodigo_Internalname = "vMBOD_ALMORIGENCODIGO" ;
      imgImage5_Internalname = "IMAGE5" ;
      edtavMbod_bodorigendescripcion_Internalname = "vMBOD_BODORIGENDESCRIPCION" ;
      edtavMbod_bodorigencodigo_Internalname = "vMBOD_BODORIGENCODIGO" ;
      cmbavMbod_almmoddestino.setInternalname( "vMBOD_ALMMODDESTINO" );
      imgImage6_Internalname = "IMAGE6" ;
      edtavAlmag_descripciondes_Internalname = "vALMAG_DESCRIPCIONDES" ;
      edtavMbod_almdestinocodigo_Internalname = "vMBOD_ALMDESTINOCODIGO" ;
      imgImage7_Internalname = "IMAGE7" ;
      edtavMbod_boddestinodescripcion_Internalname = "vMBOD_BODDESTINODESCRIPCION" ;
      edtavMbod_boddestinocodigo_Internalname = "vMBOD_BODDESTINOCODIGO" ;
      cmbavMbod_estado.setInternalname( "vMBOD_ESTADO" );
      edtavMbod_tipoelementodesc_Internalname = "vMBOD_TIPOELEMENTODESC" ;
      divTable1_Internalname = "TABLE1" ;
      bttButton1_Internalname = "BUTTON1" ;
      bttButton2_Internalname = "BUTTON2" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
   }

   public void initialize_properties( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      edtavMbod_tipoelementodesc_Jsonclick = "" ;
      edtavMbod_tipoelementodesc_Enabled = 1 ;
      cmbavMbod_estado.setJsonclick( "" );
      cmbavMbod_estado.setEnabled( 1 );
      edtavMbod_boddestinocodigo_Jsonclick = "" ;
      edtavMbod_boddestinocodigo_Enabled = 1 ;
      edtavMbod_boddestinodescripcion_Jsonclick = "" ;
      edtavMbod_boddestinodescripcion_Enabled = 1 ;
      edtavMbod_almdestinocodigo_Jsonclick = "" ;
      edtavMbod_almdestinocodigo_Enabled = 1 ;
      edtavAlmag_descripciondes_Jsonclick = "" ;
      edtavAlmag_descripciondes_Enabled = 1 ;
      cmbavMbod_almmoddestino.setJsonclick( "" );
      cmbavMbod_almmoddestino.setEnabled( 1 );
      edtavMbod_bodorigencodigo_Jsonclick = "" ;
      edtavMbod_bodorigencodigo_Enabled = 1 ;
      edtavMbod_bodorigendescripcion_Jsonclick = "" ;
      edtavMbod_bodorigendescripcion_Enabled = 1 ;
      edtavMbod_almorigencodigo_Jsonclick = "" ;
      edtavMbod_almorigencodigo_Enabled = 1 ;
      edtavAlmag_descripcionori_Jsonclick = "" ;
      edtavAlmag_descripcionori_Enabled = 1 ;
      cmbavMbod_almmodorigen.setJsonclick( "" );
      cmbavMbod_almmodorigen.setEnabled( 1 );
      edtavMbod_centcostocodigo_Jsonclick = "" ;
      edtavMbod_centcostocodigo_Enabled = 1 ;
      edtavMbod_centrocostodescrip_Jsonclick = "" ;
      edtavMbod_centrocostodescrip_Enabled = 1 ;
      edtavMbod_regioncodigo_Jsonclick = "" ;
      edtavMbod_regioncodigo_Enabled = 1 ;
      edtavMbod_regiondescripcion_Jsonclick = "" ;
      edtavMbod_regiondescripcion_Enabled = 1 ;
      edtavMbod_tipomovcodigo_Jsonclick = "" ;
      edtavMbod_tipomovcodigo_Enabled = 1 ;
      edtavMbod_tipomovdescrip_Jsonclick = "" ;
      edtavMbod_tipomovdescrip_Enabled = 1 ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Restricciones" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("'BUSCARTIPOMOVIMIENTO'","{handler:'e11661',iparms:[],oparms:[{av:'AV25Mbod_TipoElementoDesc',fld:'vMBOD_TIPOELEMENTODESC',pic:'@!',nv:''},{av:'AV27Mbod_TipoMovDescrip',fld:'vMBOD_TIPOMOVDESCRIP',pic:'',nv:''},{av:'AV26Mbod_TipoMovCodigo',fld:'vMBOD_TIPOMOVCODIGO',pic:'',nv:''}]}");
      setEventMetadata("'BUSCARREGIONAL'","{handler:'e13662',iparms:[{av:'AV22Mbod_RegionCodigo',fld:'vMBOD_REGIONCODIGO',pic:'ZZZ9',nv:0},{av:'AV24Mbod_RegionId',fld:'vMBOD_REGIONID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavMbod_almmoddestino'},{av:'AV11Mbod_AlmModDestino',fld:'vMBOD_ALMMODDESTINO',pic:'',nv:''},{av:'cmbavMbod_almmodorigen'},{av:'AV12Mbod_AlmModOrigen',fld:'vMBOD_ALMMODORIGEN',pic:'',nv:''},{av:'AV18Mbod_CentCostoCodigo',fld:'vMBOD_CENTCOSTOCODIGO',pic:'',nv:''},{av:'AV19Mbod_CentCostoId',fld:'vMBOD_CENTCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV13Mbod_AlmOrigenCodigo',fld:'vMBOD_ALMORIGENCODIGO',pic:'',nv:''},{av:'AV16Mbod_BodOrigenCodigo',fld:'vMBOD_BODORIGENCODIGO',pic:'',nv:''},{av:'AV10Mbod_AlmDestinoCodigo',fld:'vMBOD_ALMDESTINOCODIGO',pic:'',nv:''},{av:'AV14Mbod_BodDestinoCodigo',fld:'vMBOD_BODDESTINOCODIGO',pic:'',nv:''},{av:'AV34SW',fld:'vSW',pic:'ZZZ9',nv:0}],oparms:[{av:'AV34SW',fld:'vSW',pic:'ZZZ9',nv:0},{av:'AV23Mbod_RegionDescripcion',fld:'vMBOD_REGIONDESCRIPCION',pic:'',nv:''},{av:'AV22Mbod_RegionCodigo',fld:'vMBOD_REGIONCODIGO',pic:'ZZZ9',nv:0},{av:'AV24Mbod_RegionId',fld:'vMBOD_REGIONID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV14Mbod_BodDestinoCodigo',fld:'vMBOD_BODDESTINOCODIGO',pic:'',nv:''},{av:'AV15Mbod_BodDestinoDescripcion',fld:'vMBOD_BODDESTINODESCRIPCION',pic:'@!',nv:''},{av:'AV10Mbod_AlmDestinoCodigo',fld:'vMBOD_ALMDESTINOCODIGO',pic:'',nv:''},{av:'AV8AlmaG_DescripcionDes',fld:'vALMAG_DESCRIPCIONDES',pic:'',nv:''},{av:'AV16Mbod_BodOrigenCodigo',fld:'vMBOD_BODORIGENCODIGO',pic:'',nv:''},{av:'AV17Mbod_BodOrigenDescripcion',fld:'vMBOD_BODORIGENDESCRIPCION',pic:'@!',nv:''},{av:'AV13Mbod_AlmOrigenCodigo',fld:'vMBOD_ALMORIGENCODIGO',pic:'',nv:''},{av:'AV9AlmaG_DescripcionOri',fld:'vALMAG_DESCRIPCIONORI',pic:'',nv:''},{av:'AV19Mbod_CentCostoId',fld:'vMBOD_CENTCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV20Mbod_CentroCostoDescrip',fld:'vMBOD_CENTROCOSTODESCRIP',pic:'',nv:''},{av:'AV18Mbod_CentCostoCodigo',fld:'vMBOD_CENTCOSTOCODIGO',pic:'',nv:''},{av:'cmbavMbod_almmodorigen'},{av:'AV12Mbod_AlmModOrigen',fld:'vMBOD_ALMMODORIGEN',pic:'',nv:''},{av:'cmbavMbod_almmoddestino'},{av:'AV11Mbod_AlmModDestino',fld:'vMBOD_ALMMODDESTINO',pic:'',nv:''}]}");
      setEventMetadata("'BUSCARCENTROCOSTO'","{handler:'e14662',iparms:[{av:'AV24Mbod_RegionId',fld:'vMBOD_REGIONID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV22Mbod_RegionCodigo',fld:'vMBOD_REGIONCODIGO',pic:'ZZZ9',nv:0},{av:'cmbavMbod_almmoddestino'},{av:'AV11Mbod_AlmModDestino',fld:'vMBOD_ALMMODDESTINO',pic:'',nv:''},{av:'cmbavMbod_almmodorigen'},{av:'AV12Mbod_AlmModOrigen',fld:'vMBOD_ALMMODORIGEN',pic:'',nv:''},{av:'AV18Mbod_CentCostoCodigo',fld:'vMBOD_CENTCOSTOCODIGO',pic:'',nv:''},{av:'AV19Mbod_CentCostoId',fld:'vMBOD_CENTCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV13Mbod_AlmOrigenCodigo',fld:'vMBOD_ALMORIGENCODIGO',pic:'',nv:''},{av:'AV16Mbod_BodOrigenCodigo',fld:'vMBOD_BODORIGENCODIGO',pic:'',nv:''},{av:'AV10Mbod_AlmDestinoCodigo',fld:'vMBOD_ALMDESTINOCODIGO',pic:'',nv:''},{av:'AV14Mbod_BodDestinoCodigo',fld:'vMBOD_BODDESTINOCODIGO',pic:'',nv:''},{av:'AV34SW',fld:'vSW',pic:'ZZZ9',nv:0}],oparms:[{av:'AV34SW',fld:'vSW',pic:'ZZZ9',nv:0},{av:'AV18Mbod_CentCostoCodigo',fld:'vMBOD_CENTCOSTOCODIGO',pic:'',nv:''},{av:'AV22Mbod_RegionCodigo',fld:'vMBOD_REGIONCODIGO',pic:'ZZZ9',nv:0},{av:'AV20Mbod_CentroCostoDescrip',fld:'vMBOD_CENTROCOSTODESCRIP',pic:'',nv:''},{av:'AV19Mbod_CentCostoId',fld:'vMBOD_CENTCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV14Mbod_BodDestinoCodigo',fld:'vMBOD_BODDESTINOCODIGO',pic:'',nv:''},{av:'AV15Mbod_BodDestinoDescripcion',fld:'vMBOD_BODDESTINODESCRIPCION',pic:'@!',nv:''},{av:'AV10Mbod_AlmDestinoCodigo',fld:'vMBOD_ALMDESTINOCODIGO',pic:'',nv:''},{av:'AV8AlmaG_DescripcionDes',fld:'vALMAG_DESCRIPCIONDES',pic:'',nv:''},{av:'AV16Mbod_BodOrigenCodigo',fld:'vMBOD_BODORIGENCODIGO',pic:'',nv:''},{av:'AV17Mbod_BodOrigenDescripcion',fld:'vMBOD_BODORIGENDESCRIPCION',pic:'@!',nv:''},{av:'AV13Mbod_AlmOrigenCodigo',fld:'vMBOD_ALMORIGENCODIGO',pic:'',nv:''},{av:'AV9AlmaG_DescripcionOri',fld:'vALMAG_DESCRIPCIONORI',pic:'',nv:''},{av:'cmbavMbod_almmodorigen'},{av:'AV12Mbod_AlmModOrigen',fld:'vMBOD_ALMMODORIGEN',pic:'',nv:''},{av:'cmbavMbod_almmoddestino'},{av:'AV11Mbod_AlmModDestino',fld:'vMBOD_ALMMODDESTINO',pic:'',nv:''},{av:'AV24Mbod_RegionId',fld:'vMBOD_REGIONID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV23Mbod_RegionDescripcion',fld:'vMBOD_REGIONDESCRIPCION',pic:'',nv:''}]}");
      setEventMetadata("VMBOD_ALMMODORIGEN.CLICK","{handler:'e15662',iparms:[{av:'AV22Mbod_RegionCodigo',fld:'vMBOD_REGIONCODIGO',pic:'ZZZ9',nv:0},{av:'AV24Mbod_RegionId',fld:'vMBOD_REGIONID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavMbod_almmoddestino'},{av:'AV11Mbod_AlmModDestino',fld:'vMBOD_ALMMODDESTINO',pic:'',nv:''},{av:'cmbavMbod_almmodorigen'},{av:'AV12Mbod_AlmModOrigen',fld:'vMBOD_ALMMODORIGEN',pic:'',nv:''},{av:'AV18Mbod_CentCostoCodigo',fld:'vMBOD_CENTCOSTOCODIGO',pic:'',nv:''},{av:'AV19Mbod_CentCostoId',fld:'vMBOD_CENTCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV13Mbod_AlmOrigenCodigo',fld:'vMBOD_ALMORIGENCODIGO',pic:'',nv:''},{av:'AV16Mbod_BodOrigenCodigo',fld:'vMBOD_BODORIGENCODIGO',pic:'',nv:''},{av:'AV10Mbod_AlmDestinoCodigo',fld:'vMBOD_ALMDESTINOCODIGO',pic:'',nv:''},{av:'AV14Mbod_BodDestinoCodigo',fld:'vMBOD_BODDESTINOCODIGO',pic:'',nv:''},{av:'AV34SW',fld:'vSW',pic:'ZZZ9',nv:0}],oparms:[{av:'AV34SW',fld:'vSW',pic:'ZZZ9',nv:0},{av:'AV14Mbod_BodDestinoCodigo',fld:'vMBOD_BODDESTINOCODIGO',pic:'',nv:''},{av:'AV15Mbod_BodDestinoDescripcion',fld:'vMBOD_BODDESTINODESCRIPCION',pic:'@!',nv:''},{av:'AV10Mbod_AlmDestinoCodigo',fld:'vMBOD_ALMDESTINOCODIGO',pic:'',nv:''},{av:'AV8AlmaG_DescripcionDes',fld:'vALMAG_DESCRIPCIONDES',pic:'',nv:''},{av:'AV16Mbod_BodOrigenCodigo',fld:'vMBOD_BODORIGENCODIGO',pic:'',nv:''},{av:'AV17Mbod_BodOrigenDescripcion',fld:'vMBOD_BODORIGENDESCRIPCION',pic:'@!',nv:''},{av:'AV13Mbod_AlmOrigenCodigo',fld:'vMBOD_ALMORIGENCODIGO',pic:'',nv:''},{av:'AV9AlmaG_DescripcionOri',fld:'vALMAG_DESCRIPCIONORI',pic:'',nv:''},{av:'AV19Mbod_CentCostoId',fld:'vMBOD_CENTCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV20Mbod_CentroCostoDescrip',fld:'vMBOD_CENTROCOSTODESCRIP',pic:'',nv:''},{av:'AV18Mbod_CentCostoCodigo',fld:'vMBOD_CENTCOSTOCODIGO',pic:'',nv:''},{av:'cmbavMbod_almmodorigen'},{av:'AV12Mbod_AlmModOrigen',fld:'vMBOD_ALMMODORIGEN',pic:'',nv:''},{av:'cmbavMbod_almmoddestino'},{av:'AV11Mbod_AlmModDestino',fld:'vMBOD_ALMMODDESTINO',pic:'',nv:''},{av:'AV24Mbod_RegionId',fld:'vMBOD_REGIONID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV22Mbod_RegionCodigo',fld:'vMBOD_REGIONCODIGO',pic:'ZZZ9',nv:0},{av:'AV23Mbod_RegionDescripcion',fld:'vMBOD_REGIONDESCRIPCION',pic:'',nv:''}]}");
      setEventMetadata("'BUSCARALMACENORIGEN'","{handler:'e16662',iparms:[{av:'AV24Mbod_RegionId',fld:'vMBOD_REGIONID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV19Mbod_CentCostoId',fld:'vMBOD_CENTCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavMbod_almmodorigen'},{av:'AV12Mbod_AlmModOrigen',fld:'vMBOD_ALMMODORIGEN',pic:'',nv:''},{av:'AV18Mbod_CentCostoCodigo',fld:'vMBOD_CENTCOSTOCODIGO',pic:'',nv:''},{av:'AV13Mbod_AlmOrigenCodigo',fld:'vMBOD_ALMORIGENCODIGO',pic:'',nv:''},{av:'AV9AlmaG_DescripcionOri',fld:'vALMAG_DESCRIPCIONORI',pic:'',nv:''},{av:'AV22Mbod_RegionCodigo',fld:'vMBOD_REGIONCODIGO',pic:'ZZZ9',nv:0},{av:'cmbavMbod_almmoddestino'},{av:'AV11Mbod_AlmModDestino',fld:'vMBOD_ALMMODDESTINO',pic:'',nv:''},{av:'AV16Mbod_BodOrigenCodigo',fld:'vMBOD_BODORIGENCODIGO',pic:'',nv:''},{av:'AV10Mbod_AlmDestinoCodigo',fld:'vMBOD_ALMDESTINOCODIGO',pic:'',nv:''},{av:'AV14Mbod_BodDestinoCodigo',fld:'vMBOD_BODDESTINOCODIGO',pic:'',nv:''},{av:'AV34SW',fld:'vSW',pic:'ZZZ9',nv:0}],oparms:[{av:'AV34SW',fld:'vSW',pic:'ZZZ9',nv:0},{av:'AV19Mbod_CentCostoId',fld:'vMBOD_CENTCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavMbod_almmodorigen'},{av:'AV12Mbod_AlmModOrigen',fld:'vMBOD_ALMMODORIGEN',pic:'',nv:''},{av:'AV9AlmaG_DescripcionOri',fld:'vALMAG_DESCRIPCIONORI',pic:'',nv:''},{av:'AV13Mbod_AlmOrigenCodigo',fld:'vMBOD_ALMORIGENCODIGO',pic:'',nv:''},{av:'AV14Mbod_BodDestinoCodigo',fld:'vMBOD_BODDESTINOCODIGO',pic:'',nv:''},{av:'AV15Mbod_BodDestinoDescripcion',fld:'vMBOD_BODDESTINODESCRIPCION',pic:'@!',nv:''},{av:'AV10Mbod_AlmDestinoCodigo',fld:'vMBOD_ALMDESTINOCODIGO',pic:'',nv:''},{av:'AV8AlmaG_DescripcionDes',fld:'vALMAG_DESCRIPCIONDES',pic:'',nv:''},{av:'AV16Mbod_BodOrigenCodigo',fld:'vMBOD_BODORIGENCODIGO',pic:'',nv:''},{av:'AV17Mbod_BodOrigenDescripcion',fld:'vMBOD_BODORIGENDESCRIPCION',pic:'@!',nv:''},{av:'AV20Mbod_CentroCostoDescrip',fld:'vMBOD_CENTROCOSTODESCRIP',pic:'',nv:''},{av:'AV18Mbod_CentCostoCodigo',fld:'vMBOD_CENTCOSTOCODIGO',pic:'',nv:''},{av:'cmbavMbod_almmoddestino'},{av:'AV11Mbod_AlmModDestino',fld:'vMBOD_ALMMODDESTINO',pic:'',nv:''},{av:'AV24Mbod_RegionId',fld:'vMBOD_REGIONID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV22Mbod_RegionCodigo',fld:'vMBOD_REGIONCODIGO',pic:'ZZZ9',nv:0},{av:'AV23Mbod_RegionDescripcion',fld:'vMBOD_REGIONDESCRIPCION',pic:'',nv:''}]}");
      setEventMetadata("'BUSCARBODEGAORIGEN'","{handler:'e17662',iparms:[{av:'AV24Mbod_RegionId',fld:'vMBOD_REGIONID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV19Mbod_CentCostoId',fld:'vMBOD_CENTCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavMbod_almmodorigen'},{av:'AV12Mbod_AlmModOrigen',fld:'vMBOD_ALMMODORIGEN',pic:'',nv:''},{av:'AV13Mbod_AlmOrigenCodigo',fld:'vMBOD_ALMORIGENCODIGO',pic:'',nv:''},{av:'AV18Mbod_CentCostoCodigo',fld:'vMBOD_CENTCOSTOCODIGO',pic:'',nv:''}],oparms:[{av:'cmbavMbod_almmodorigen'},{av:'AV12Mbod_AlmModOrigen',fld:'vMBOD_ALMMODORIGEN',pic:'',nv:''},{av:'AV13Mbod_AlmOrigenCodigo',fld:'vMBOD_ALMORIGENCODIGO',pic:'',nv:''},{av:'AV17Mbod_BodOrigenDescripcion',fld:'vMBOD_BODORIGENDESCRIPCION',pic:'@!',nv:''},{av:'AV16Mbod_BodOrigenCodigo',fld:'vMBOD_BODORIGENCODIGO',pic:'',nv:''}]}");
      setEventMetadata("VMBOD_ALMMODDESTINO.CLICK","{handler:'e18662',iparms:[{av:'AV22Mbod_RegionCodigo',fld:'vMBOD_REGIONCODIGO',pic:'ZZZ9',nv:0},{av:'AV24Mbod_RegionId',fld:'vMBOD_REGIONID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavMbod_almmoddestino'},{av:'AV11Mbod_AlmModDestino',fld:'vMBOD_ALMMODDESTINO',pic:'',nv:''},{av:'cmbavMbod_almmodorigen'},{av:'AV12Mbod_AlmModOrigen',fld:'vMBOD_ALMMODORIGEN',pic:'',nv:''},{av:'AV18Mbod_CentCostoCodigo',fld:'vMBOD_CENTCOSTOCODIGO',pic:'',nv:''},{av:'AV19Mbod_CentCostoId',fld:'vMBOD_CENTCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV13Mbod_AlmOrigenCodigo',fld:'vMBOD_ALMORIGENCODIGO',pic:'',nv:''},{av:'AV16Mbod_BodOrigenCodigo',fld:'vMBOD_BODORIGENCODIGO',pic:'',nv:''},{av:'AV10Mbod_AlmDestinoCodigo',fld:'vMBOD_ALMDESTINOCODIGO',pic:'',nv:''},{av:'AV14Mbod_BodDestinoCodigo',fld:'vMBOD_BODDESTINOCODIGO',pic:'',nv:''},{av:'AV34SW',fld:'vSW',pic:'ZZZ9',nv:0}],oparms:[{av:'AV34SW',fld:'vSW',pic:'ZZZ9',nv:0},{av:'AV14Mbod_BodDestinoCodigo',fld:'vMBOD_BODDESTINOCODIGO',pic:'',nv:''},{av:'AV15Mbod_BodDestinoDescripcion',fld:'vMBOD_BODDESTINODESCRIPCION',pic:'@!',nv:''},{av:'AV10Mbod_AlmDestinoCodigo',fld:'vMBOD_ALMDESTINOCODIGO',pic:'',nv:''},{av:'AV8AlmaG_DescripcionDes',fld:'vALMAG_DESCRIPCIONDES',pic:'',nv:''},{av:'AV16Mbod_BodOrigenCodigo',fld:'vMBOD_BODORIGENCODIGO',pic:'',nv:''},{av:'AV17Mbod_BodOrigenDescripcion',fld:'vMBOD_BODORIGENDESCRIPCION',pic:'@!',nv:''},{av:'AV13Mbod_AlmOrigenCodigo',fld:'vMBOD_ALMORIGENCODIGO',pic:'',nv:''},{av:'AV9AlmaG_DescripcionOri',fld:'vALMAG_DESCRIPCIONORI',pic:'',nv:''},{av:'AV19Mbod_CentCostoId',fld:'vMBOD_CENTCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV20Mbod_CentroCostoDescrip',fld:'vMBOD_CENTROCOSTODESCRIP',pic:'',nv:''},{av:'AV18Mbod_CentCostoCodigo',fld:'vMBOD_CENTCOSTOCODIGO',pic:'',nv:''},{av:'cmbavMbod_almmodorigen'},{av:'AV12Mbod_AlmModOrigen',fld:'vMBOD_ALMMODORIGEN',pic:'',nv:''},{av:'cmbavMbod_almmoddestino'},{av:'AV11Mbod_AlmModDestino',fld:'vMBOD_ALMMODDESTINO',pic:'',nv:''},{av:'AV24Mbod_RegionId',fld:'vMBOD_REGIONID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV22Mbod_RegionCodigo',fld:'vMBOD_REGIONCODIGO',pic:'ZZZ9',nv:0},{av:'AV23Mbod_RegionDescripcion',fld:'vMBOD_REGIONDESCRIPCION',pic:'',nv:''}]}");
      setEventMetadata("'BUSCARALMACENDESTINIO'","{handler:'e19662',iparms:[{av:'AV24Mbod_RegionId',fld:'vMBOD_REGIONID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV19Mbod_CentCostoId',fld:'vMBOD_CENTCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavMbod_almmoddestino'},{av:'AV11Mbod_AlmModDestino',fld:'vMBOD_ALMMODDESTINO',pic:'',nv:''},{av:'AV18Mbod_CentCostoCodigo',fld:'vMBOD_CENTCOSTOCODIGO',pic:'',nv:''},{av:'AV10Mbod_AlmDestinoCodigo',fld:'vMBOD_ALMDESTINOCODIGO',pic:'',nv:''},{av:'AV8AlmaG_DescripcionDes',fld:'vALMAG_DESCRIPCIONDES',pic:'',nv:''},{av:'AV22Mbod_RegionCodigo',fld:'vMBOD_REGIONCODIGO',pic:'ZZZ9',nv:0},{av:'cmbavMbod_almmodorigen'},{av:'AV12Mbod_AlmModOrigen',fld:'vMBOD_ALMMODORIGEN',pic:'',nv:''},{av:'AV13Mbod_AlmOrigenCodigo',fld:'vMBOD_ALMORIGENCODIGO',pic:'',nv:''},{av:'AV16Mbod_BodOrigenCodigo',fld:'vMBOD_BODORIGENCODIGO',pic:'',nv:''},{av:'AV14Mbod_BodDestinoCodigo',fld:'vMBOD_BODDESTINOCODIGO',pic:'',nv:''},{av:'AV34SW',fld:'vSW',pic:'ZZZ9',nv:0}],oparms:[{av:'AV34SW',fld:'vSW',pic:'ZZZ9',nv:0},{av:'AV19Mbod_CentCostoId',fld:'vMBOD_CENTCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavMbod_almmoddestino'},{av:'AV11Mbod_AlmModDestino',fld:'vMBOD_ALMMODDESTINO',pic:'',nv:''},{av:'AV8AlmaG_DescripcionDes',fld:'vALMAG_DESCRIPCIONDES',pic:'',nv:''},{av:'AV10Mbod_AlmDestinoCodigo',fld:'vMBOD_ALMDESTINOCODIGO',pic:'',nv:''},{av:'AV14Mbod_BodDestinoCodigo',fld:'vMBOD_BODDESTINOCODIGO',pic:'',nv:''},{av:'AV15Mbod_BodDestinoDescripcion',fld:'vMBOD_BODDESTINODESCRIPCION',pic:'@!',nv:''},{av:'AV16Mbod_BodOrigenCodigo',fld:'vMBOD_BODORIGENCODIGO',pic:'',nv:''},{av:'AV17Mbod_BodOrigenDescripcion',fld:'vMBOD_BODORIGENDESCRIPCION',pic:'@!',nv:''},{av:'AV13Mbod_AlmOrigenCodigo',fld:'vMBOD_ALMORIGENCODIGO',pic:'',nv:''},{av:'AV9AlmaG_DescripcionOri',fld:'vALMAG_DESCRIPCIONORI',pic:'',nv:''},{av:'AV20Mbod_CentroCostoDescrip',fld:'vMBOD_CENTROCOSTODESCRIP',pic:'',nv:''},{av:'AV18Mbod_CentCostoCodigo',fld:'vMBOD_CENTCOSTOCODIGO',pic:'',nv:''},{av:'cmbavMbod_almmodorigen'},{av:'AV12Mbod_AlmModOrigen',fld:'vMBOD_ALMMODORIGEN',pic:'',nv:''},{av:'AV24Mbod_RegionId',fld:'vMBOD_REGIONID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV22Mbod_RegionCodigo',fld:'vMBOD_REGIONCODIGO',pic:'ZZZ9',nv:0},{av:'AV23Mbod_RegionDescripcion',fld:'vMBOD_REGIONDESCRIPCION',pic:'',nv:''}]}");
      setEventMetadata("'BUSCARBODEGADESTINIO'","{handler:'e20662',iparms:[{av:'AV24Mbod_RegionId',fld:'vMBOD_REGIONID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV19Mbod_CentCostoId',fld:'vMBOD_CENTCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavMbod_almmoddestino'},{av:'AV11Mbod_AlmModDestino',fld:'vMBOD_ALMMODDESTINO',pic:'',nv:''},{av:'AV10Mbod_AlmDestinoCodigo',fld:'vMBOD_ALMDESTINOCODIGO',pic:'',nv:''},{av:'AV18Mbod_CentCostoCodigo',fld:'vMBOD_CENTCOSTOCODIGO',pic:'',nv:''}],oparms:[{av:'cmbavMbod_almmoddestino'},{av:'AV11Mbod_AlmModDestino',fld:'vMBOD_ALMMODDESTINO',pic:'',nv:''},{av:'AV10Mbod_AlmDestinoCodigo',fld:'vMBOD_ALMDESTINOCODIGO',pic:'',nv:''},{av:'AV15Mbod_BodDestinoDescripcion',fld:'vMBOD_BODDESTINODESCRIPCION',pic:'@!',nv:''},{av:'AV14Mbod_BodDestinoCodigo',fld:'vMBOD_BODDESTINOCODIGO',pic:'',nv:''}]}");
      setEventMetadata("'CONFIRMAR'","{handler:'e21662',iparms:[{av:'AV40Swe',fld:'vSWE',pic:'9',nv:0},{av:'AV6PMbod_Id',fld:'vPMBOD_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'Gx_mode',fld:'vMODE',pic:'@!',nv:''},{av:'AV24Mbod_RegionId',fld:'vMBOD_REGIONID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV23Mbod_RegionDescripcion',fld:'vMBOD_REGIONDESCRIPCION',pic:'',nv:''},{av:'AV19Mbod_CentCostoId',fld:'vMBOD_CENTCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV20Mbod_CentroCostoDescrip',fld:'vMBOD_CENTROCOSTODESCRIP',pic:'',nv:''},{av:'AV18Mbod_CentCostoCodigo',fld:'vMBOD_CENTCOSTOCODIGO',pic:'',nv:''},{av:'cmbavMbod_almmodorigen'},{av:'AV12Mbod_AlmModOrigen',fld:'vMBOD_ALMMODORIGEN',pic:'',nv:''},{av:'AV13Mbod_AlmOrigenCodigo',fld:'vMBOD_ALMORIGENCODIGO',pic:'',nv:''},{av:'AV9AlmaG_DescripcionOri',fld:'vALMAG_DESCRIPCIONORI',pic:'',nv:''},{av:'AV16Mbod_BodOrigenCodigo',fld:'vMBOD_BODORIGENCODIGO',pic:'',nv:''},{av:'AV17Mbod_BodOrigenDescripcion',fld:'vMBOD_BODORIGENDESCRIPCION',pic:'@!',nv:''},{av:'cmbavMbod_almmoddestino'},{av:'AV11Mbod_AlmModDestino',fld:'vMBOD_ALMMODDESTINO',pic:'',nv:''},{av:'AV10Mbod_AlmDestinoCodigo',fld:'vMBOD_ALMDESTINOCODIGO',pic:'',nv:''},{av:'AV8AlmaG_DescripcionDes',fld:'vALMAG_DESCRIPCIONDES',pic:'',nv:''},{av:'AV22Mbod_RegionCodigo',fld:'vMBOD_REGIONCODIGO',pic:'ZZZ9',nv:0},{av:'AV14Mbod_BodDestinoCodigo',fld:'vMBOD_BODDESTINOCODIGO',pic:'',nv:''},{av:'AV26Mbod_TipoMovCodigo',fld:'vMBOD_TIPOMOVCODIGO',pic:'',nv:''},{av:'AV33SDTALM_RESTRICCIONES',fld:'vSDTALM_RESTRICCIONES',pic:'',nv:null},{av:'AV35Usuario',fld:'vUSUARIO',pic:'@!',nv:''},{av:'cmbavMbod_estado'},{av:'AV21Mbod_Estado',fld:'vMBOD_ESTADO',pic:'',nv:''}],oparms:[{av:'AV40Swe',fld:'vSWE',pic:'9',nv:0},{av:'AV33SDTALM_RESTRICCIONES',fld:'vSDTALM_RESTRICCIONES',pic:'',nv:null},{av:'AV6PMbod_Id',fld:'vPMBOD_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'Gx_mode',fld:'vMODE',pic:'@!',nv:''}]}");
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
      wcpOGx_mode = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV33SDTALM_RESTRICCIONES = new com.orions2.SdtSDTALM_RESTRICCIONES(remoteHandle, context);
      AV35Usuario = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblTitle_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      sImgUrl = "" ;
      imgImage1_Jsonclick = "" ;
      AV27Mbod_TipoMovDescrip = "" ;
      AV26Mbod_TipoMovCodigo = "" ;
      imgImage2_Jsonclick = "" ;
      AV23Mbod_RegionDescripcion = "" ;
      imgImage3_Jsonclick = "" ;
      AV20Mbod_CentroCostoDescrip = "" ;
      AV18Mbod_CentCostoCodigo = "" ;
      AV12Mbod_AlmModOrigen = "" ;
      imgImage4_Jsonclick = "" ;
      AV9AlmaG_DescripcionOri = "" ;
      AV13Mbod_AlmOrigenCodigo = "" ;
      imgImage5_Jsonclick = "" ;
      AV17Mbod_BodOrigenDescripcion = "" ;
      AV16Mbod_BodOrigenCodigo = "" ;
      AV11Mbod_AlmModDestino = "" ;
      imgImage6_Jsonclick = "" ;
      AV8AlmaG_DescripcionDes = "" ;
      AV10Mbod_AlmDestinoCodigo = "" ;
      imgImage7_Jsonclick = "" ;
      AV15Mbod_BodDestinoDescripcion = "" ;
      AV14Mbod_BodDestinoCodigo = "" ;
      AV21Mbod_Estado = "" ;
      AV25Mbod_TipoElementoDesc = "" ;
      bttButton1_Jsonclick = "" ;
      bttButton2_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV7websession = httpContext.getWebSession();
      GXv_SdtSDTALM_RESTRICCIONES1 = new com.orions2.SdtSDTALM_RESTRICCIONES [1] ;
      GXv_char2 = new String [1] ;
      GXv_int3 = new long [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavMbod_tipomovdescrip_Enabled = 0 ;
      edtavMbod_tipomovcodigo_Enabled = 0 ;
      edtavMbod_regiondescripcion_Enabled = 0 ;
      edtavMbod_regioncodigo_Enabled = 0 ;
      edtavMbod_centrocostodescrip_Enabled = 0 ;
      edtavMbod_centcostocodigo_Enabled = 0 ;
      edtavAlmag_descripcionori_Enabled = 0 ;
      edtavMbod_almorigencodigo_Enabled = 0 ;
      edtavMbod_bodorigendescripcion_Enabled = 0 ;
      edtavMbod_bodorigencodigo_Enabled = 0 ;
      edtavAlmag_descripciondes_Enabled = 0 ;
      edtavMbod_almdestinocodigo_Enabled = 0 ;
      edtavMbod_boddestinodescripcion_Enabled = 0 ;
      edtavMbod_boddestinocodigo_Enabled = 0 ;
      edtavMbod_tipoelementodesc_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV40Swe ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short AV34SW ;
   private short wbEnd ;
   private short wbStart ;
   private short AV22Mbod_RegionCodigo ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtavMbod_tipomovdescrip_Enabled ;
   private int edtavMbod_tipomovcodigo_Enabled ;
   private int edtavMbod_regiondescripcion_Enabled ;
   private int edtavMbod_regioncodigo_Enabled ;
   private int edtavMbod_centrocostodescrip_Enabled ;
   private int edtavMbod_centcostocodigo_Enabled ;
   private int edtavAlmag_descripcionori_Enabled ;
   private int edtavMbod_almorigencodigo_Enabled ;
   private int edtavMbod_bodorigendescripcion_Enabled ;
   private int edtavMbod_bodorigencodigo_Enabled ;
   private int edtavAlmag_descripciondes_Enabled ;
   private int edtavMbod_almdestinocodigo_Enabled ;
   private int edtavMbod_boddestinodescripcion_Enabled ;
   private int edtavMbod_boddestinocodigo_Enabled ;
   private int edtavMbod_tipoelementodesc_Enabled ;
   private int idxLst ;
   private long wcpOAV6PMbod_Id ;
   private long AV6PMbod_Id ;
   private long AV24Mbod_RegionId ;
   private long AV19Mbod_CentCostoId ;
   private long AV5Mbod_TipoElementoCod ;
   private long GXv_int3[] ;
   private String wcpOGx_mode ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String divTitlecontainer_Internalname ;
   private String lblTitle_Internalname ;
   private String lblTitle_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divTable1_Internalname ;
   private String TempTags ;
   private String sImgUrl ;
   private String imgImage1_Internalname ;
   private String imgImage1_Jsonclick ;
   private String edtavMbod_tipomovdescrip_Internalname ;
   private String edtavMbod_tipomovdescrip_Jsonclick ;
   private String edtavMbod_tipomovcodigo_Internalname ;
   private String edtavMbod_tipomovcodigo_Jsonclick ;
   private String imgImage2_Internalname ;
   private String imgImage2_Jsonclick ;
   private String edtavMbod_regiondescripcion_Internalname ;
   private String edtavMbod_regiondescripcion_Jsonclick ;
   private String edtavMbod_regioncodigo_Internalname ;
   private String edtavMbod_regioncodigo_Jsonclick ;
   private String imgImage3_Internalname ;
   private String imgImage3_Jsonclick ;
   private String edtavMbod_centrocostodescrip_Internalname ;
   private String edtavMbod_centrocostodescrip_Jsonclick ;
   private String edtavMbod_centcostocodigo_Internalname ;
   private String edtavMbod_centcostocodigo_Jsonclick ;
   private String imgImage4_Internalname ;
   private String imgImage4_Jsonclick ;
   private String edtavAlmag_descripcionori_Internalname ;
   private String edtavAlmag_descripcionori_Jsonclick ;
   private String edtavMbod_almorigencodigo_Internalname ;
   private String edtavMbod_almorigencodigo_Jsonclick ;
   private String imgImage5_Internalname ;
   private String imgImage5_Jsonclick ;
   private String edtavMbod_bodorigendescripcion_Internalname ;
   private String edtavMbod_bodorigendescripcion_Jsonclick ;
   private String edtavMbod_bodorigencodigo_Internalname ;
   private String edtavMbod_bodorigencodigo_Jsonclick ;
   private String imgImage6_Internalname ;
   private String imgImage6_Jsonclick ;
   private String edtavAlmag_descripciondes_Internalname ;
   private String edtavAlmag_descripciondes_Jsonclick ;
   private String edtavMbod_almdestinocodigo_Internalname ;
   private String edtavMbod_almdestinocodigo_Jsonclick ;
   private String imgImage7_Internalname ;
   private String imgImage7_Jsonclick ;
   private String edtavMbod_boddestinodescripcion_Internalname ;
   private String edtavMbod_boddestinodescripcion_Jsonclick ;
   private String edtavMbod_boddestinocodigo_Internalname ;
   private String edtavMbod_boddestinocodigo_Jsonclick ;
   private String AV21Mbod_Estado ;
   private String edtavMbod_tipoelementodesc_Internalname ;
   private String edtavMbod_tipoelementodesc_Jsonclick ;
   private String bttButton1_Internalname ;
   private String bttButton1_Jsonclick ;
   private String bttButton2_Internalname ;
   private String bttButton2_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXv_char2[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean AV36SWConvinacion ;
   private String AV35Usuario ;
   private String AV27Mbod_TipoMovDescrip ;
   private String AV26Mbod_TipoMovCodigo ;
   private String AV23Mbod_RegionDescripcion ;
   private String AV20Mbod_CentroCostoDescrip ;
   private String AV18Mbod_CentCostoCodigo ;
   private String AV12Mbod_AlmModOrigen ;
   private String AV9AlmaG_DescripcionOri ;
   private String AV13Mbod_AlmOrigenCodigo ;
   private String AV17Mbod_BodOrigenDescripcion ;
   private String AV16Mbod_BodOrigenCodigo ;
   private String AV11Mbod_AlmModDestino ;
   private String AV8AlmaG_DescripcionDes ;
   private String AV10Mbod_AlmDestinoCodigo ;
   private String AV15Mbod_BodDestinoDescripcion ;
   private String AV14Mbod_BodDestinoCodigo ;
   private String AV25Mbod_TipoElementoDesc ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV7websession ;
   private HTMLChoice cmbavMbod_almmodorigen ;
   private HTMLChoice cmbavMbod_almmoddestino ;
   private HTMLChoice cmbavMbod_estado ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtSDTALM_RESTRICCIONES AV33SDTALM_RESTRICCIONES ;
   private com.orions2.SdtSDTALM_RESTRICCIONES GXv_SdtSDTALM_RESTRICCIONES1[] ;
}

