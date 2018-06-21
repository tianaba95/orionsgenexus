/*
               File: wpalm_asociar_placas_impl
        Description: Asociar y desasociar placas
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:18:36.54
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

public final  class wpalm_asociar_placas_impl extends GXDataArea
{
   public wpalm_asociar_placas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wpalm_asociar_placas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wpalm_asociar_placas_impl.class ));
   }

   public wpalm_asociar_placas_impl( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavAccion = new HTMLChoice();
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
            nRC_GXsfl_65 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_65_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_65_idx = httpContext.GetNextPar( ) ;
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
            A46Tran_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            AV14Tran_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            A69TDet_Consecutivo = GXutil.lval( httpContext.GetNextPar( )) ;
            A66Elem_Consecutivo = httpContext.GetNextPar( ) ;
            A487TDet_Cantidad = GXutil.lval( httpContext.GetNextPar( )) ;
            A488TDet_ValorUnitario = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            A489TDet_ValorTotal = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            A490TDet_PlacaNumero = httpContext.GetNextPar( ) ;
            n490TDet_PlacaNumero = false ;
            A491TDet_PlacaPadre = httpContext.GetNextPar( ) ;
            n491TDet_PlacaPadre = false ;
            A505TDet_EsPadre = httpContext.GetNextPar( ) ;
            A298Cata_Descripcion = httpContext.GetNextPar( ) ;
            A499Tran_CodTipoElemento = GXutil.lval( httpContext.GetNextPar( )) ;
            n499Tran_CodTipoElemento = false ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( A46Tran_Id, AV14Tran_Id, A69TDet_Consecutivo, A66Elem_Consecutivo, A487TDet_Cantidad, A488TDet_ValorUnitario, A489TDet_ValorTotal, A490TDet_PlacaNumero, A491TDet_PlacaPadre, A505TDet_EsPadre, A298Cata_Descripcion, A499Tran_CodTipoElemento) ;
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "WPALM_ASOCIAR_PLACAS" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV13Tran_DescripcionMovimiento, "")) ;
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
            GXutil.writeLogln("wpalm_asociar_placas:[SendSecurityCheck]"+forbiddenHiddens);
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
            AV14Tran_Id = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Tran_Id", GXutil.ltrim( GXutil.str( AV14Tran_Id, 11, 0)));
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
      pa1X2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1X2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414183662");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.wpalm_asociar_placas") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14Tran_Id,11,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_65", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_65, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_ID", GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_ID", GXutil.ltrim( localUtil.ntoc( AV14Tran_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_CONSECUTIVO", GXutil.ltrim( localUtil.ntoc( A69TDet_Consecutivo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_CONSECUTIVO", A66Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_CANTIDAD", GXutil.ltrim( localUtil.ntoc( A487TDet_Cantidad, (byte)(10), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_VALORUNITARIO", GXutil.ltrim( localUtil.ntoc( A488TDet_ValorUnitario, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_VALORTOTAL", GXutil.ltrim( localUtil.ntoc( A489TDet_ValorTotal, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_PLACANUMERO", A490TDet_PlacaNumero);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_PLACAPADRE", A491TDet_PlacaPadre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_ESPADRE", A505TDet_EsPadre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CATA_DESCRIPCION", A298Cata_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CODTIPOELEMENTO", GXutil.ltrim( localUtil.ntoc( A499Tran_CodTipoElemento, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vERROR", GXutil.rtrim( AV23Error));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINVD_ESTADO", AV25Invd_Estado);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vREGI_ID", GXutil.ltrim( localUtil.ntoc( AV10Regi_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCENT_ID", GXutil.ltrim( localUtil.ntoc( AV8Cent_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vALMA_MODULO", AV6Alma_Modulo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vALMA_CODIGO", AV5Alma_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vBODE_CODIGO", AV7Bode_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vNUEVAINVD_ESTADO", AV29NuevaInvd_Estado);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vNUEVAERROR", GXutil.rtrim( AV27NuevaError));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRAN_DESCRIPCIONMOVIMIENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13Tran_DescripcionMovimiento, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Type", GXutil.rtrim( Alertify1_Type));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textmessage", GXutil.rtrim( Alertify1_Textmessage));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textok", GXutil.rtrim( Alertify1_Textok));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textcancel", GXutil.rtrim( Alertify1_Textcancel));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "WPALM_ASOCIAR_PLACAS" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV13Tran_DescripcionMovimiento, "")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("wpalm_asociar_placas:[SendSecurityCheck]"+forbiddenHiddens);
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
         we1X2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1X2( ) ;
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
      return formatLink("com.orions2.wpalm_asociar_placas") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14Tran_Id,11,0))) ;
   }

   public String getPgmname( )
   {
      return "WPALM_ASOCIAR_PLACAS" ;
   }

   public String getPgmdesc( )
   {
      return "Asociar y desasociar placas" ;
   }

   public void wb1X0( )
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
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'" + sGXsfl_65_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_descripcionmovimiento_Internalname, AV13Tran_DescripcionMovimiento, GXutil.rtrim( localUtil.format( AV13Tran_DescripcionMovimiento, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,10);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_descripcionmovimiento_Jsonclick, 0, "BlobContentAttSubTitle", "", "", "", 1, edtavTran_descripcionmovimiento_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_ASOCIAR_PLACAS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_consecutivocc_Internalname, "Número de Transacción", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'" + sGXsfl_65_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_consecutivocc_Internalname, GXutil.ltrim( localUtil.ntoc( AV12Tran_ConsecutivoCC, (byte)(18), (byte)(0), ",", "")), ((edtavTran_consecutivocc_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12Tran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV12Tran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,21);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_consecutivocc_Jsonclick, 0, "Attribute", "", "", "", 1, edtavTran_consecutivocc_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WPALM_ASOCIAR_PLACAS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 col-md-4 col-lg-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage1_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "Seleccionar Devolutivo", "", 0, 0, 0, "px", 0, "px", 0, 0, 7, imgImage1_Jsonclick, "'"+""+"'"+",false,"+"'"+"e111x1_client"+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WPALM_ASOCIAR_PLACAS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavPlaca_Internalname, "Placa", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'" + sGXsfl_65_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavPlaca_Internalname, AV34Placa, GXutil.rtrim( localUtil.format( AV34Placa, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "SELECCIONAR", edtavPlaca_Jsonclick, 0, "Attribute", "", "", "", 1, edtavPlaca_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Placa", "left", true, "HLP_WPALM_ASOCIAR_PLACAS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 col-lg-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCata_descripcion_Internalname, "Descripción", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'" + sGXsfl_65_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavCata_descripcion_Internalname, AV18Cata_Descripcion, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,30);\"", (short)(0), 1, edtavCata_descripcion_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WPALM_ASOCIAR_PLACAS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 col-lg-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavPlacapadre_Internalname, "Placa Padre", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'" + sGXsfl_65_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavPlacapadre_Internalname, AV35PlacaPadre, GXutil.rtrim( localUtil.format( AV35PlacaPadre, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPlacapadre_Jsonclick, 0, "Attribute", "", "", "", 1, edtavPlacapadre_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Placa", "left", true, "HLP_WPALM_ASOCIAR_PLACAS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 col-lg-1", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavEsplacapadre_Internalname, "Padre", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_65_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavEsplacapadre_Internalname, GXutil.rtrim( AV24EsPlacaPadre), GXutil.rtrim( localUtil.format( AV24EsPlacaPadre, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEsplacapadre_Jsonclick, 0, "Attribute", "", "", "", 1, edtavEsplacapadre_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_ASOCIAR_PLACAS.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavAccion.getInternalname(), "Acción", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'" + sGXsfl_65_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavAccion, cmbavAccion.getInternalname(), GXutil.rtrim( AV17Accion), 1, cmbavAccion.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavAccion.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "", true, "HLP_WPALM_ASOCIAR_PLACAS.htm");
         cmbavAccion.setValue( GXutil.rtrim( AV17Accion) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAccion.getInternalname(), "Values", cmbavAccion.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 col-lg-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage2_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgImage2_Visible, 1, "Seleccionar Devolutivo", "", 0, 0, 0, "px", 0, "px", 0, 0, 7, imgImage2_Jsonclick, "'"+""+"'"+",false,"+"'"+"e121x1_client"+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WPALM_ASOCIAR_PLACAS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavNuevaplaca_Internalname, "Nueva placa padre", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_65_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavNuevaplaca_Internalname, AV30NuevaPlaca, GXutil.rtrim( localUtil.format( AV30NuevaPlaca, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNuevaplaca_Jsonclick, 0, "Attribute", "", "", "", edtavNuevaplaca_Visible, edtavNuevaplaca_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Placa", "left", true, "HLP_WPALM_ASOCIAR_PLACAS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 col-lg-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavNuevadescripcionplaca_Internalname, "Descripción", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_65_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavNuevadescripcionplaca_Internalname, AV26NuevaDescripcionPlaca, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,49);\"", (short)(0), edtavNuevadescripcionplaca_Visible, edtavNuevadescripcionplaca_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WPALM_ASOCIAR_PLACAS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 col-lg-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavNuevaplacapadre_Internalname, "Placa padre", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_65_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavNuevaplacapadre_Internalname, AV31NuevaPlacaPadre, GXutil.rtrim( localUtil.format( AV31NuevaPlacaPadre, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNuevaplacapadre_Jsonclick, 0, "Attribute", "", "", "", edtavNuevaplacapadre_Visible, edtavNuevaplacapadre_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Placa", "left", true, "HLP_WPALM_ASOCIAR_PLACAS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 col-lg-1", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavNuevaesplacapadre_Internalname, "Padre", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_65_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavNuevaesplacapadre_Internalname, GXutil.rtrim( AV28NuevaEsPlacaPadre), GXutil.rtrim( localUtil.format( AV28NuevaEsPlacaPadre, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNuevaesplacapadre_Jsonclick, 0, "Attribute", "", "", "", edtavNuevaesplacapadre_Visible, edtavNuevaesplacapadre_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_ASOCIAR_PLACAS.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavObservaciones_Internalname, "Observaciones", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_65_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavObservaciones_Internalname, AV33Observaciones, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", (short)(0), 1, edtavObservaciones_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "2097152", 1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WPALM_ASOCIAR_PLACAS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttAgregar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 65, 2, 0)+","+"null"+");", "Agregar", bttAgregar_Jsonclick, 5, "Agregar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'AGREGAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WPALM_ASOCIAR_PLACAS.htm");
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"65\">") ;
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
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Consecutivo Item") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Placa") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Consecutivo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Es placa padre?") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Placa Padre") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DeleteAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV40TDet_Consecutivo, (byte)(18), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTdet_consecutivo_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV42TDet_PlacaNumero);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTdet_placanumero_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV21Elem_Consecutivo);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavElem_consecutivo_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV19cCata_Descripcion);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcata_descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV41TDet_EsPadre);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTdet_espadre_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV43TDet_PlacaPadre);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTdet_placapadre_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( AV22EliminarItem));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 65 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_65 = (short)(nGXsfl_65_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
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
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable2_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttButton1_Internalname, "gx.evt.setGridEvt("+GXutil.str( 65, 2, 0)+","+"null"+");", "Confirmar", bttButton1_Jsonclick, 7, "Confirmar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e131x1_client"+"'", TempTags, "", 2, "HLP_WPALM_ASOCIAR_PLACAS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttButton2_Internalname, "gx.evt.setGridEvt("+GXutil.str( 65, 2, 0)+","+"null"+");", "Cancelar", bttButton2_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WPALM_ASOCIAR_PLACAS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         httpContext.writeText( "<div class=\"gx_usercontrol\" id=\""+"ALERTIFY1Container"+"\"></div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1X2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Asociar y desasociar placas", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1X0( ) ;
   }

   public void ws1X2( )
   {
      start1X2( ) ;
      evt1X2( ) ;
   }

   public void evt1X2( )
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
                        else if ( GXutil.strcmp(sEvt, "ALERTIFY1.OK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141X2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VACCION.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151X2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VNUEVAPLACA.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e161X2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'AGREGAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Agregar' */
                           e171X2 ();
                           /* No code required for Cancel button. It is implemented as the Reset button. */
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) )
                        {
                           nGXsfl_65_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_65_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_65_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_652( ) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTdet_consecutivo_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTdet_consecutivo_Internalname), ",", ".") > 999999999999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTDET_CONSECUTIVO");
                              GX_FocusControl = edtavTdet_consecutivo_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV40TDet_Consecutivo = 0 ;
                           }
                           else
                           {
                              AV40TDet_Consecutivo = localUtil.ctol( httpContext.cgiGet( edtavTdet_consecutivo_Internalname), ",", ".") ;
                           }
                           AV42TDet_PlacaNumero = httpContext.cgiGet( edtavTdet_placanumero_Internalname) ;
                           AV21Elem_Consecutivo = httpContext.cgiGet( edtavElem_consecutivo_Internalname) ;
                           AV19cCata_Descripcion = GXutil.upper( httpContext.cgiGet( edtavCcata_descripcion_Internalname)) ;
                           AV41TDet_EsPadre = httpContext.cgiGet( edtavTdet_espadre_Internalname) ;
                           AV43TDet_PlacaPadre = httpContext.cgiGet( edtavTdet_placapadre_Internalname) ;
                           AV22EliminarItem = httpContext.cgiGet( edtavEliminaritem_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavEliminaritem_Internalname, "Bitmap", ((GXutil.strcmp("", AV22EliminarItem)==0) ? AV56Eliminaritem_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV22EliminarItem))), !bGXsfl_65_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavEliminaritem_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV22EliminarItem), true);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e181X2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e191X2 ();
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

   public void we1X2( )
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

   public void pa1X2( )
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
         cmbavAccion.setName( "vACCION" );
         cmbavAccion.setWebtags( "" );
         cmbavAccion.addItem("DESAS", "Desasociar", (short)(0));
         cmbavAccion.addItem("ASOCI", "Asociar", (short)(0));
         if ( cmbavAccion.getItemCount() > 0 )
         {
            AV17Accion = cmbavAccion.getValidValue(AV17Accion) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Accion", AV17Accion);
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
            GX_FocusControl = edtavTran_descripcionmovimiento_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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
      subsflControlProps_652( ) ;
      while ( nGXsfl_65_idx <= nRC_GXsfl_65 )
      {
         sendrow_652( ) ;
         nGXsfl_65_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_65_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_65_idx+1)) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_65_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_652( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( long A46Tran_Id ,
                                  long AV14Tran_Id ,
                                  long A69TDet_Consecutivo ,
                                  String A66Elem_Consecutivo ,
                                  long A487TDet_Cantidad ,
                                  java.math.BigDecimal A488TDet_ValorUnitario ,
                                  java.math.BigDecimal A489TDet_ValorTotal ,
                                  String A490TDet_PlacaNumero ,
                                  String A491TDet_PlacaPadre ,
                                  String A505TDet_EsPadre ,
                                  String A298Cata_Descripcion ,
                                  long A499Tran_CodTipoElemento )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRID1_nCurrentRecord = 0 ;
      rf1X2( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbavAccion.getItemCount() > 0 )
      {
         AV17Accion = cmbavAccion.getValidValue(AV17Accion) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Accion", AV17Accion);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1X2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavTran_descripcionmovimiento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_descripcionmovimiento_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_descripcionmovimiento_Enabled, 5, 0)), true);
      edtavCata_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCata_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCata_descripcion_Enabled, 5, 0)), true);
      edtavPlacapadre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPlacapadre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPlacapadre_Enabled, 5, 0)), true);
      edtavEsplacapadre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEsplacapadre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavEsplacapadre_Enabled, 5, 0)), true);
      edtavNuevadescripcionplaca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNuevadescripcionplaca_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNuevadescripcionplaca_Enabled, 5, 0)), true);
      edtavNuevaplacapadre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNuevaplacapadre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNuevaplacapadre_Enabled, 5, 0)), true);
      edtavNuevaesplacapadre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNuevaesplacapadre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNuevaesplacapadre_Enabled, 5, 0)), true);
      edtavTdet_consecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_consecutivo_Enabled, 5, 0)), !bGXsfl_65_Refreshing);
      edtavTdet_placanumero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_placanumero_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_placanumero_Enabled, 5, 0)), !bGXsfl_65_Refreshing);
      edtavElem_consecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavElem_consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavElem_consecutivo_Enabled, 5, 0)), !bGXsfl_65_Refreshing);
      edtavCcata_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcata_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCcata_descripcion_Enabled, 5, 0)), !bGXsfl_65_Refreshing);
      edtavTdet_espadre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_espadre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_espadre_Enabled, 5, 0)), !bGXsfl_65_Refreshing);
      edtavTdet_placapadre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_placapadre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_placapadre_Enabled, 5, 0)), !bGXsfl_65_Refreshing);
   }

   public void rf1X2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(65) ;
      nGXsfl_65_idx = (short)(1) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_65_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_652( ) ;
      bGXsfl_65_Refreshing = true ;
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
         subsflControlProps_652( ) ;
         e191X2 ();
         wbEnd = (short)(65) ;
         wb1X0( ) ;
      }
      bGXsfl_65_Refreshing = true ;
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

   public void strup1X0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      edtavTran_descripcionmovimiento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_descripcionmovimiento_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_descripcionmovimiento_Enabled, 5, 0)), true);
      edtavCata_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCata_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCata_descripcion_Enabled, 5, 0)), true);
      edtavPlacapadre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPlacapadre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPlacapadre_Enabled, 5, 0)), true);
      edtavEsplacapadre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEsplacapadre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavEsplacapadre_Enabled, 5, 0)), true);
      edtavNuevadescripcionplaca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNuevadescripcionplaca_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNuevadescripcionplaca_Enabled, 5, 0)), true);
      edtavNuevaplacapadre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNuevaplacapadre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNuevaplacapadre_Enabled, 5, 0)), true);
      edtavNuevaesplacapadre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNuevaesplacapadre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNuevaesplacapadre_Enabled, 5, 0)), true);
      edtavTdet_consecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_consecutivo_Enabled, 5, 0)), !bGXsfl_65_Refreshing);
      edtavTdet_placanumero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_placanumero_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_placanumero_Enabled, 5, 0)), !bGXsfl_65_Refreshing);
      edtavElem_consecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavElem_consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavElem_consecutivo_Enabled, 5, 0)), !bGXsfl_65_Refreshing);
      edtavCcata_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcata_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCcata_descripcion_Enabled, 5, 0)), !bGXsfl_65_Refreshing);
      edtavTdet_espadre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_espadre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_espadre_Enabled, 5, 0)), !bGXsfl_65_Refreshing);
      edtavTdet_placapadre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_placapadre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_placapadre_Enabled, 5, 0)), !bGXsfl_65_Refreshing);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e181X2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV13Tran_DescripcionMovimiento = httpContext.cgiGet( edtavTran_descripcionmovimiento_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Tran_DescripcionMovimiento", AV13Tran_DescripcionMovimiento);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_DESCRIPCIONMOVIMIENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13Tran_DescripcionMovimiento, ""))));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTran_consecutivocc_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTran_consecutivocc_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTRAN_CONSECUTIVOCC");
            GX_FocusControl = edtavTran_consecutivocc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12Tran_ConsecutivoCC = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( AV12Tran_ConsecutivoCC, 18, 0)));
         }
         else
         {
            AV12Tran_ConsecutivoCC = localUtil.ctol( httpContext.cgiGet( edtavTran_consecutivocc_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( AV12Tran_ConsecutivoCC, 18, 0)));
         }
         AV34Placa = httpContext.cgiGet( edtavPlaca_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34Placa", AV34Placa);
         AV18Cata_Descripcion = GXutil.upper( httpContext.cgiGet( edtavCata_descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Cata_Descripcion", AV18Cata_Descripcion);
         AV35PlacaPadre = httpContext.cgiGet( edtavPlacapadre_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35PlacaPadre", AV35PlacaPadre);
         AV24EsPlacaPadre = httpContext.cgiGet( edtavEsplacapadre_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24EsPlacaPadre", AV24EsPlacaPadre);
         cmbavAccion.setName( cmbavAccion.getInternalname() );
         cmbavAccion.setValue( httpContext.cgiGet( cmbavAccion.getInternalname()) );
         AV17Accion = httpContext.cgiGet( cmbavAccion.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Accion", AV17Accion);
         AV30NuevaPlaca = httpContext.cgiGet( edtavNuevaplaca_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30NuevaPlaca", AV30NuevaPlaca);
         AV26NuevaDescripcionPlaca = GXutil.upper( httpContext.cgiGet( edtavNuevadescripcionplaca_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26NuevaDescripcionPlaca", AV26NuevaDescripcionPlaca);
         AV31NuevaPlacaPadre = httpContext.cgiGet( edtavNuevaplacapadre_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31NuevaPlacaPadre", AV31NuevaPlacaPadre);
         AV28NuevaEsPlacaPadre = httpContext.cgiGet( edtavNuevaesplacapadre_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28NuevaEsPlacaPadre", AV28NuevaEsPlacaPadre);
         AV33Observaciones = httpContext.cgiGet( edtavObservaciones_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Observaciones", AV33Observaciones);
         /* Read saved values. */
         nRC_GXsfl_65 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_65"), ",", ".")) ;
         AV29NuevaInvd_Estado = httpContext.cgiGet( "vNUEVAINVD_ESTADO") ;
         AV25Invd_Estado = httpContext.cgiGet( "vINVD_ESTADO") ;
         AV23Error = httpContext.cgiGet( "vERROR") ;
         Alertify1_Type = httpContext.cgiGet( "ALERTIFY1_Type") ;
         Alertify1_Textmessage = httpContext.cgiGet( "ALERTIFY1_Textmessage") ;
         Alertify1_Textok = httpContext.cgiGet( "ALERTIFY1_Textok") ;
         Alertify1_Textcancel = httpContext.cgiGet( "ALERTIFY1_Textcancel") ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = "hsh" + "WPALM_ASOCIAR_PLACAS" ;
         AV13Tran_DescripcionMovimiento = httpContext.cgiGet( edtavTran_descripcionmovimiento_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Tran_DescripcionMovimiento", AV13Tran_DescripcionMovimiento);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_DESCRIPCIONMOVIMIENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13Tran_DescripcionMovimiento, ""))));
         forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV13Tran_DescripcionMovimiento, "")) ;
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
         {
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            GXutil.writeLog("wpalm_asociar_placas:[SecurityCheckFailed]"+forbiddenHiddens);
            return  ;
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
      e181X2 ();
      if (returnInSub) return;
   }

   public void e181X2( )
   {
      /* Start Routine */
      Form.setCaption( "Asociar y desasociar placas" );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV47Usuario = AV16websession.getValue("Usuario") ;
      GXv_int1[0] = AV14Tran_Id ;
      GXv_int2[0] = AV10Regi_Id ;
      GXv_int3[0] = AV8Cent_Id ;
      GXv_char4[0] = AV6Alma_Modulo ;
      GXv_char5[0] = AV5Alma_Codigo ;
      GXv_char6[0] = AV7Bode_Codigo ;
      GXv_int7[0] = AV12Tran_ConsecutivoCC ;
      GXv_int8[0] = AV15Tran_IdCuentadanteOrigen ;
      GXv_char9[0] = AV13Tran_DescripcionMovimiento ;
      GXv_char10[0] = AV53Tran_Estado ;
      new com.orions2.datostran(remoteHandle, context).execute( GXv_int1, GXv_int2, GXv_int3, GXv_char4, GXv_char5, GXv_char6, GXv_int7, GXv_int8, GXv_char9, GXv_char10) ;
      wpalm_asociar_placas_impl.this.AV14Tran_Id = GXv_int1[0] ;
      wpalm_asociar_placas_impl.this.AV10Regi_Id = GXv_int2[0] ;
      wpalm_asociar_placas_impl.this.AV8Cent_Id = GXv_int3[0] ;
      wpalm_asociar_placas_impl.this.AV6Alma_Modulo = GXv_char4[0] ;
      wpalm_asociar_placas_impl.this.AV5Alma_Codigo = GXv_char5[0] ;
      wpalm_asociar_placas_impl.this.AV7Bode_Codigo = GXv_char6[0] ;
      wpalm_asociar_placas_impl.this.AV12Tran_ConsecutivoCC = GXv_int7[0] ;
      wpalm_asociar_placas_impl.this.AV15Tran_IdCuentadanteOrigen = GXv_int8[0] ;
      wpalm_asociar_placas_impl.this.AV13Tran_DescripcionMovimiento = GXv_char9[0] ;
      wpalm_asociar_placas_impl.this.AV53Tran_Estado = GXv_char10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Tran_Id", GXutil.ltrim( GXutil.str( AV14Tran_Id, 11, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV10Regi_Id", GXutil.ltrim( GXutil.str( AV10Regi_Id, 11, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV8Cent_Id", GXutil.ltrim( GXutil.str( AV8Cent_Id, 11, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV6Alma_Modulo", AV6Alma_Modulo);
      httpContext.ajax_rsp_assign_attri("", false, "AV5Alma_Codigo", AV5Alma_Codigo);
      httpContext.ajax_rsp_assign_attri("", false, "AV7Bode_Codigo", AV7Bode_Codigo);
      httpContext.ajax_rsp_assign_attri("", false, "AV12Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( AV12Tran_ConsecutivoCC, 18, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV15Tran_IdCuentadanteOrigen", GXutil.ltrim( GXutil.str( AV15Tran_IdCuentadanteOrigen, 18, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV13Tran_DescripcionMovimiento", AV13Tran_DescripcionMovimiento);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_DESCRIPCIONMOVIMIENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13Tran_DescripcionMovimiento, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV53Tran_Estado", AV53Tran_Estado);
      edtavNuevaplaca_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNuevaplaca_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNuevaplaca_Visible, 5, 0)), true);
      imgImage2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgImage2_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage2_Visible, 5, 0)), true);
      edtavNuevadescripcionplaca_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNuevadescripcionplaca_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNuevadescripcionplaca_Visible, 5, 0)), true);
      edtavNuevaesplacapadre_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNuevaesplacapadre_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNuevaesplacapadre_Visible, 5, 0)), true);
      edtavNuevaplacapadre_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNuevaplacapadre_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNuevaplacapadre_Visible, 5, 0)), true);
   }

   public void e151X2( )
   {
      /* Accion_Isvalid Routine */
      if ( GXutil.strcmp(AV17Accion, "ASOCI") == 0 )
      {
         edtavNuevaplaca_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNuevaplaca_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNuevaplaca_Visible, 5, 0)), true);
         imgImage2_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, imgImage2_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage2_Visible, 5, 0)), true);
         edtavNuevadescripcionplaca_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNuevadescripcionplaca_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNuevadescripcionplaca_Visible, 5, 0)), true);
         edtavNuevaesplacapadre_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNuevaesplacapadre_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNuevaesplacapadre_Visible, 5, 0)), true);
         edtavNuevaplacapadre_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNuevaplacapadre_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNuevaplacapadre_Visible, 5, 0)), true);
      }
      else
      {
         edtavNuevaplaca_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNuevaplaca_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNuevaplaca_Visible, 5, 0)), true);
         imgImage2_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, imgImage2_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage2_Visible, 5, 0)), true);
         edtavNuevadescripcionplaca_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNuevadescripcionplaca_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNuevadescripcionplaca_Visible, 5, 0)), true);
         edtavNuevaesplacapadre_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNuevaesplacapadre_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNuevaesplacapadre_Visible, 5, 0)), true);
         edtavNuevaplacapadre_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNuevaplacapadre_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNuevaplacapadre_Visible, 5, 0)), true);
      }
      if ( ( GXutil.strcmp(AV17Accion, "DESAS") == 0 ) && ( (GXutil.strcmp("", AV35PlacaPadre)==0) ) && ( GXutil.strcmp(AV24EsPlacaPadre, "SI") != 0 ) )
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Error la placa seleccionada no tiene ninguna asociación anterior" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
         AV23Error = "S" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23Error", AV23Error);
         AV34Placa = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34Placa", AV34Placa);
         AV18Cata_Descripcion = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Cata_Descripcion", AV18Cata_Descripcion);
         AV35PlacaPadre = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35PlacaPadre", AV35PlacaPadre);
         AV24EsPlacaPadre = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24EsPlacaPadre", AV24EsPlacaPadre);
         AV17Accion = "DESAS" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Accion", AV17Accion);
         GX_FocusControl = edtavPlaca_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      if ( ( GXutil.strcmp(AV17Accion, "DESAS") == 0 ) && ( GXutil.strcmp(AV24EsPlacaPadre, "SI") == 0 ) )
      {
         httpContext.GX_msglist.addItem("La placa seleccionada es placa padre y dejará placas sin padre");
      }
      if ( ( GXutil.strcmp(AV17Accion, "ASOCI") == 0 ) && ! (GXutil.strcmp("", AV35PlacaPadre)==0) )
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Error la placa seleccionada ya tiene una placa padre y no se puede asociar a otra placa" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
         AV23Error = "S" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23Error", AV23Error);
         AV34Placa = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34Placa", AV34Placa);
         AV18Cata_Descripcion = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Cata_Descripcion", AV18Cata_Descripcion);
         AV35PlacaPadre = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35PlacaPadre", AV35PlacaPadre);
         AV24EsPlacaPadre = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24EsPlacaPadre", AV24EsPlacaPadre);
         AV17Accion = "DESAS" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Accion", AV17Accion);
         edtavNuevaplaca_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNuevaplaca_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNuevaplaca_Visible, 5, 0)), true);
         imgImage2_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, imgImage2_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage2_Visible, 5, 0)), true);
         edtavNuevadescripcionplaca_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNuevadescripcionplaca_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNuevadescripcionplaca_Visible, 5, 0)), true);
         edtavNuevaesplacapadre_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNuevaesplacapadre_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNuevaesplacapadre_Visible, 5, 0)), true);
         edtavNuevaplacapadre_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNuevaplacapadre_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNuevaplacapadre_Visible, 5, 0)), true);
         GX_FocusControl = edtavPlaca_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      cmbavAccion.setValue( GXutil.rtrim( AV17Accion) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAccion.getInternalname(), "Values", cmbavAccion.ToJavascriptSource(), true);
   }

   public void e161X2( )
   {
      /* Nuevaplaca_Isvalid Routine */
      GXv_char10[0] = AV26NuevaDescripcionPlaca ;
      GXv_char9[0] = AV31NuevaPlacaPadre ;
      GXv_decimal11[0] = AV32NuevaValorAdquisicion ;
      GXv_char6[0] = AV28NuevaEsPlacaPadre ;
      GXv_char5[0] = AV29NuevaInvd_Estado ;
      GXv_char4[0] = AV27NuevaError ;
      GXv_char12[0] = "" ;
      GXv_int8[0] = 0 ;
      GXv_int13[0] = 0 ;
      new com.orions2.verificaplaca(remoteHandle, context).execute( AV30NuevaPlaca, GXv_char10, GXv_char9, GXv_decimal11, GXv_char6, GXv_char5, AV10Regi_Id, AV8Cent_Id, AV6Alma_Modulo, AV5Alma_Codigo, AV7Bode_Codigo, GXv_char4, GXv_char12, GXv_int8, GXv_int13) ;
      wpalm_asociar_placas_impl.this.AV26NuevaDescripcionPlaca = GXv_char10[0] ;
      wpalm_asociar_placas_impl.this.AV31NuevaPlacaPadre = GXv_char9[0] ;
      wpalm_asociar_placas_impl.this.AV32NuevaValorAdquisicion = GXv_decimal11[0] ;
      wpalm_asociar_placas_impl.this.AV28NuevaEsPlacaPadre = GXv_char6[0] ;
      wpalm_asociar_placas_impl.this.AV29NuevaInvd_Estado = GXv_char5[0] ;
      wpalm_asociar_placas_impl.this.AV27NuevaError = GXv_char4[0] ;
      if ( ! (GXutil.strcmp("", AV31NuevaPlacaPadre)==0) )
      {
         AV27NuevaError = "H" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27NuevaError", AV27NuevaError);
      }
      if ( GXutil.strcmp(AV27NuevaError, "N") == 0 )
      {
         if ( GXutil.strcmp(AV29NuevaInvd_Estado, "P") == 0 )
         {
            Alertify1_Type = "error" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
            Alertify1_Textmessage = "No es posible incluir esta placa ya que se encuentra en otro movimiento por ratificar" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
            this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
            AV23Error = "S" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23Error", AV23Error);
         }
      }
      else if ( GXutil.strcmp(AV27NuevaError, "E") == 0 )
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Error la placa no existe" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
      }
      else if ( GXutil.strcmp(AV27NuevaError, "S") == 0 )
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Error la placa no pertenece al almacén y bodega orígen" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
      }
      else if ( GXutil.strcmp(AV27NuevaError, "H") == 0 )
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Error la placa seleccionada es una placa hija y no es posible asociarla" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
      }
   }

   public void e171X2( )
   {
      /* 'Agregar' Routine */
      if ( GXutil.strcmp(AV17Accion, "DESAS") == 0 )
      {
         if ( ( GXutil.strcmp(AV25Invd_Estado, "R") == 0 ) && ! (GXutil.strcmp("", AV34Placa)==0) && ( GXutil.strcmp(AV23Error, "N") == 0 ) )
         {
            AV28NuevaEsPlacaPadre = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28NuevaEsPlacaPadre", AV28NuevaEsPlacaPadre);
            AV31NuevaPlacaPadre = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31NuevaPlacaPadre", AV31NuevaPlacaPadre);
            GXv_int8[0] = AV14Tran_Id ;
            GXv_char12[0] = AV34Placa ;
            GXv_char10[0] = AV33Observaciones ;
            GXv_char9[0] = AV17Accion ;
            GXv_char6[0] = AV30NuevaPlaca ;
            GXv_char5[0] = AV24EsPlacaPadre ;
            GXv_char4[0] = AV35PlacaPadre ;
            GXv_char14[0] = AV28NuevaEsPlacaPadre ;
            GXv_char15[0] = AV31NuevaPlacaPadre ;
            new com.orions2.pcambiarplacas(remoteHandle, context).execute( GXv_int8, GXv_char12, GXv_char10, GXv_char9, GXv_char6, GXv_char5, GXv_char4, GXv_char14, GXv_char15) ;
            wpalm_asociar_placas_impl.this.AV14Tran_Id = GXv_int8[0] ;
            wpalm_asociar_placas_impl.this.AV34Placa = GXv_char12[0] ;
            wpalm_asociar_placas_impl.this.AV33Observaciones = GXv_char10[0] ;
            wpalm_asociar_placas_impl.this.AV17Accion = GXv_char9[0] ;
            wpalm_asociar_placas_impl.this.AV30NuevaPlaca = GXv_char6[0] ;
            wpalm_asociar_placas_impl.this.AV24EsPlacaPadre = GXv_char5[0] ;
            wpalm_asociar_placas_impl.this.AV35PlacaPadre = GXv_char4[0] ;
            wpalm_asociar_placas_impl.this.AV28NuevaEsPlacaPadre = GXv_char14[0] ;
            wpalm_asociar_placas_impl.this.AV31NuevaPlacaPadre = GXv_char15[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Tran_Id", GXutil.ltrim( GXutil.str( AV14Tran_Id, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "AV34Placa", AV34Placa);
            httpContext.ajax_rsp_assign_attri("", false, "AV33Observaciones", AV33Observaciones);
            httpContext.ajax_rsp_assign_attri("", false, "AV17Accion", AV17Accion);
            httpContext.ajax_rsp_assign_attri("", false, "AV30NuevaPlaca", AV30NuevaPlaca);
            httpContext.ajax_rsp_assign_attri("", false, "AV24EsPlacaPadre", AV24EsPlacaPadre);
            httpContext.ajax_rsp_assign_attri("", false, "AV35PlacaPadre", AV35PlacaPadre);
            httpContext.ajax_rsp_assign_attri("", false, "AV28NuevaEsPlacaPadre", AV28NuevaEsPlacaPadre);
            httpContext.ajax_rsp_assign_attri("", false, "AV31NuevaPlacaPadre", AV31NuevaPlacaPadre);
         }
         else
         {
            Alertify1_Type = "error" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
            Alertify1_Textmessage = "Error la placa tiene un error y no es posible desasignarla" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
            this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
         }
      }
      else if ( GXutil.strcmp(AV17Accion, "ASOCI") == 0 )
      {
         if ( ( GXutil.strcmp(AV25Invd_Estado, "R") == 0 ) && ! (GXutil.strcmp("", AV34Placa)==0) && ( GXutil.strcmp(AV23Error, "N") == 0 ) && ( GXutil.strcmp(AV29NuevaInvd_Estado, "R") == 0 ) && ! (GXutil.strcmp("", AV30NuevaPlaca)==0) && ( GXutil.strcmp(AV27NuevaError, "N") == 0 ) )
         {
            GXv_int8[0] = AV14Tran_Id ;
            GXv_char15[0] = AV34Placa ;
            GXv_char14[0] = AV33Observaciones ;
            GXv_char12[0] = AV17Accion ;
            GXv_char10[0] = AV30NuevaPlaca ;
            GXv_char9[0] = AV24EsPlacaPadre ;
            GXv_char6[0] = AV35PlacaPadre ;
            GXv_char5[0] = AV28NuevaEsPlacaPadre ;
            GXv_char4[0] = AV31NuevaPlacaPadre ;
            new com.orions2.pcambiarplacas(remoteHandle, context).execute( GXv_int8, GXv_char15, GXv_char14, GXv_char12, GXv_char10, GXv_char9, GXv_char6, GXv_char5, GXv_char4) ;
            wpalm_asociar_placas_impl.this.AV14Tran_Id = GXv_int8[0] ;
            wpalm_asociar_placas_impl.this.AV34Placa = GXv_char15[0] ;
            wpalm_asociar_placas_impl.this.AV33Observaciones = GXv_char14[0] ;
            wpalm_asociar_placas_impl.this.AV17Accion = GXv_char12[0] ;
            wpalm_asociar_placas_impl.this.AV30NuevaPlaca = GXv_char10[0] ;
            wpalm_asociar_placas_impl.this.AV24EsPlacaPadre = GXv_char9[0] ;
            wpalm_asociar_placas_impl.this.AV35PlacaPadre = GXv_char6[0] ;
            wpalm_asociar_placas_impl.this.AV28NuevaEsPlacaPadre = GXv_char5[0] ;
            wpalm_asociar_placas_impl.this.AV31NuevaPlacaPadre = GXv_char4[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Tran_Id", GXutil.ltrim( GXutil.str( AV14Tran_Id, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "AV34Placa", AV34Placa);
            httpContext.ajax_rsp_assign_attri("", false, "AV33Observaciones", AV33Observaciones);
            httpContext.ajax_rsp_assign_attri("", false, "AV17Accion", AV17Accion);
            httpContext.ajax_rsp_assign_attri("", false, "AV30NuevaPlaca", AV30NuevaPlaca);
            httpContext.ajax_rsp_assign_attri("", false, "AV24EsPlacaPadre", AV24EsPlacaPadre);
            httpContext.ajax_rsp_assign_attri("", false, "AV35PlacaPadre", AV35PlacaPadre);
            httpContext.ajax_rsp_assign_attri("", false, "AV28NuevaEsPlacaPadre", AV28NuevaEsPlacaPadre);
            httpContext.ajax_rsp_assign_attri("", false, "AV31NuevaPlacaPadre", AV31NuevaPlacaPadre);
         }
         else
         {
            Alertify1_Type = "error" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
            Alertify1_Textmessage = "Error en las placas, no es posible asignarlas" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
            this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
         }
      }
      gxgrgrid1_refresh( A46Tran_Id, AV14Tran_Id, A69TDet_Consecutivo, A66Elem_Consecutivo, A487TDet_Cantidad, A488TDet_ValorUnitario, A489TDet_ValorTotal, A490TDet_PlacaNumero, A491TDet_PlacaPadre, A505TDet_EsPadre, A298Cata_Descripcion, A499Tran_CodTipoElemento) ;
      AV34Placa = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Placa", AV34Placa);
      AV18Cata_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Cata_Descripcion", AV18Cata_Descripcion);
      AV33Observaciones = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Observaciones", AV33Observaciones);
      AV24EsPlacaPadre = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24EsPlacaPadre", AV24EsPlacaPadre);
      AV35PlacaPadre = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35PlacaPadre", AV35PlacaPadre);
      AV30NuevaPlaca = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30NuevaPlaca", AV30NuevaPlaca);
      AV28NuevaEsPlacaPadre = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28NuevaEsPlacaPadre", AV28NuevaEsPlacaPadre);
      AV31NuevaPlacaPadre = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31NuevaPlacaPadre", AV31NuevaPlacaPadre);
      AV26NuevaDescripcionPlaca = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26NuevaDescripcionPlaca", AV26NuevaDescripcionPlaca);
      AV17Accion = "DESAS" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Accion", AV17Accion);
      edtavNuevaplaca_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNuevaplaca_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNuevaplaca_Visible, 5, 0)), true);
      imgImage2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgImage2_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage2_Visible, 5, 0)), true);
      edtavNuevadescripcionplaca_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNuevadescripcionplaca_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNuevadescripcionplaca_Visible, 5, 0)), true);
      edtavNuevaesplacapadre_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNuevaesplacapadre_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNuevaesplacapadre_Visible, 5, 0)), true);
      edtavNuevaplacapadre_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNuevaplacapadre_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNuevaplacapadre_Visible, 5, 0)), true);
      cmbavAccion.setValue( GXutil.rtrim( AV17Accion) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAccion.getInternalname(), "Values", cmbavAccion.ToJavascriptSource(), true);
   }

   private void e191X2( )
   {
      /* Grid1_Load Routine */
      AV22EliminarItem = context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )) ;
      AV56Eliminaritem_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      /* Using cursor H001X2 */
      pr_default.execute(0, new Object[] {new Long(AV14Tran_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A37Cata_Codigo = H001X2_A37Cata_Codigo[0] ;
         A49Tran_CodigoMovimiento = H001X2_A49Tran_CodigoMovimiento[0] ;
         A46Tran_Id = H001X2_A46Tran_Id[0] ;
         A69TDet_Consecutivo = H001X2_A69TDet_Consecutivo[0] ;
         A66Elem_Consecutivo = H001X2_A66Elem_Consecutivo[0] ;
         A487TDet_Cantidad = H001X2_A487TDet_Cantidad[0] ;
         A488TDet_ValorUnitario = H001X2_A488TDet_ValorUnitario[0] ;
         A489TDet_ValorTotal = H001X2_A489TDet_ValorTotal[0] ;
         A490TDet_PlacaNumero = H001X2_A490TDet_PlacaNumero[0] ;
         n490TDet_PlacaNumero = H001X2_n490TDet_PlacaNumero[0] ;
         A491TDet_PlacaPadre = H001X2_A491TDet_PlacaPadre[0] ;
         n491TDet_PlacaPadre = H001X2_n491TDet_PlacaPadre[0] ;
         A505TDet_EsPadre = H001X2_A505TDet_EsPadre[0] ;
         A298Cata_Descripcion = H001X2_A298Cata_Descripcion[0] ;
         A499Tran_CodTipoElemento = H001X2_A499Tran_CodTipoElemento[0] ;
         n499Tran_CodTipoElemento = H001X2_n499Tran_CodTipoElemento[0] ;
         A49Tran_CodigoMovimiento = H001X2_A49Tran_CodigoMovimiento[0] ;
         A499Tran_CodTipoElemento = H001X2_A499Tran_CodTipoElemento[0] ;
         n499Tran_CodTipoElemento = H001X2_n499Tran_CodTipoElemento[0] ;
         A37Cata_Codigo = H001X2_A37Cata_Codigo[0] ;
         A298Cata_Descripcion = H001X2_A298Cata_Descripcion[0] ;
         AV40TDet_Consecutivo = A69TDet_Consecutivo ;
         AV21Elem_Consecutivo = A66Elem_Consecutivo ;
         AV38TDet_Cantidad = A487TDet_Cantidad ;
         AV46TDet_ValorUnitario = A488TDet_ValorUnitario ;
         AV45TDet_ValorTotal = A489TDet_ValorTotal ;
         AV42TDet_PlacaNumero = A490TDet_PlacaNumero ;
         AV43TDet_PlacaPadre = A491TDet_PlacaPadre ;
         AV41TDet_EsPadre = A505TDet_EsPadre ;
         AV19cCata_Descripcion = A298Cata_Descripcion ;
         AV52Tran_CodTipoElemento = A499Tran_CodTipoElemento ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(65) ;
         }
         sendrow_652( ) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_65_Refreshing )
         {
            httpContext.doAjaxLoad(65, Grid1Row);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void e141X2( )
   {
      /* Alertify1_Ok Routine */
      GXv_int8[0] = AV14Tran_Id ;
      new com.orions2.pratificapadres(remoteHandle, context).execute( GXv_int8) ;
      wpalm_asociar_placas_impl.this.AV14Tran_Id = GXv_int8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Tran_Id", GXutil.ltrim( GXutil.str( AV14Tran_Id, 11, 0)));
      callWebObject(formatLink("com.orions2.wwalm_transaccion") );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void setparameters( Object[] obj )
   {
      AV14Tran_Id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Tran_Id", GXutil.ltrim( GXutil.str( AV14Tran_Id, 11, 0)));
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
      pa1X2( ) ;
      ws1X2( ) ;
      we1X2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414183839");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("wpalm_asociar_placas.js", "?201861414183839");
      httpContext.AddJavascriptSource("Shared/jquery/jquery-1.9.0.js", "");
      httpContext.AddJavascriptSource("Alertify/js/alertify.min.js", "");
      httpContext.AddJavascriptSource("Alertify/GlobalAlerts.js", "");
      httpContext.AddJavascriptSource("Alertify/AlertifyRender.js", "");
      /* End function include_jscripts */
   }

   public void subsflControlProps_652( )
   {
      edtavTdet_consecutivo_Internalname = "vTDET_CONSECUTIVO_"+sGXsfl_65_idx ;
      edtavTdet_placanumero_Internalname = "vTDET_PLACANUMERO_"+sGXsfl_65_idx ;
      edtavElem_consecutivo_Internalname = "vELEM_CONSECUTIVO_"+sGXsfl_65_idx ;
      edtavCcata_descripcion_Internalname = "vCCATA_DESCRIPCION_"+sGXsfl_65_idx ;
      edtavTdet_espadre_Internalname = "vTDET_ESPADRE_"+sGXsfl_65_idx ;
      edtavTdet_placapadre_Internalname = "vTDET_PLACAPADRE_"+sGXsfl_65_idx ;
      edtavEliminaritem_Internalname = "vELIMINARITEM_"+sGXsfl_65_idx ;
   }

   public void subsflControlProps_fel_652( )
   {
      edtavTdet_consecutivo_Internalname = "vTDET_CONSECUTIVO_"+sGXsfl_65_fel_idx ;
      edtavTdet_placanumero_Internalname = "vTDET_PLACANUMERO_"+sGXsfl_65_fel_idx ;
      edtavElem_consecutivo_Internalname = "vELEM_CONSECUTIVO_"+sGXsfl_65_fel_idx ;
      edtavCcata_descripcion_Internalname = "vCCATA_DESCRIPCION_"+sGXsfl_65_fel_idx ;
      edtavTdet_espadre_Internalname = "vTDET_ESPADRE_"+sGXsfl_65_fel_idx ;
      edtavTdet_placapadre_Internalname = "vTDET_PLACAPADRE_"+sGXsfl_65_fel_idx ;
      edtavEliminaritem_Internalname = "vELIMINARITEM_"+sGXsfl_65_fel_idx ;
   }

   public void sendrow_652( )
   {
      subsflControlProps_652( ) ;
      wb1X0( ) ;
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
         if ( ((int)((nGXsfl_65_idx) % (2))) == 0 )
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
         httpContext.writeText( " gxrow=\""+sGXsfl_65_idx+"\">") ;
      }
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavTdet_consecutivo_Enabled!=0)&&(edtavTdet_consecutivo_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 66,'',false,'"+sGXsfl_65_idx+"',65)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTdet_consecutivo_Internalname,GXutil.ltrim( localUtil.ntoc( AV40TDet_Consecutivo, (byte)(18), (byte)(0), ",", "")),((edtavTdet_consecutivo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV40TDet_Consecutivo), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV40TDet_Consecutivo), "ZZZZZZZZZZZZZZZZZ9")),TempTags+((edtavTdet_consecutivo_Enabled!=0)&&(edtavTdet_consecutivo_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavTdet_consecutivo_Enabled!=0)&&(edtavTdet_consecutivo_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,66);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTdet_consecutivo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(edtavTdet_consecutivo_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(65),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavTdet_placanumero_Enabled!=0)&&(edtavTdet_placanumero_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 67,'',false,'"+sGXsfl_65_idx+"',65)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTdet_placanumero_Internalname,AV42TDet_PlacaNumero,"",TempTags+((edtavTdet_placanumero_Enabled!=0)&&(edtavTdet_placanumero_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavTdet_placanumero_Enabled!=0)&&(edtavTdet_placanumero_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,67);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTdet_placanumero_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavTdet_placanumero_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(65),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavElem_consecutivo_Enabled!=0)&&(edtavElem_consecutivo_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 68,'',false,'"+sGXsfl_65_idx+"',65)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavElem_consecutivo_Internalname,AV21Elem_Consecutivo,"",TempTags+((edtavElem_consecutivo_Enabled!=0)&&(edtavElem_consecutivo_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavElem_consecutivo_Enabled!=0)&&(edtavElem_consecutivo_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,68);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavElem_consecutivo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavElem_consecutivo_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(65),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCcata_descripcion_Enabled!=0)&&(edtavCcata_descripcion_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 69,'',false,'"+sGXsfl_65_idx+"',65)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcata_descripcion_Internalname,AV19cCata_Descripcion,GXutil.rtrim( localUtil.format( AV19cCata_Descripcion, "@!")),TempTags+((edtavCcata_descripcion_Enabled!=0)&&(edtavCcata_descripcion_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavCcata_descripcion_Enabled!=0)&&(edtavCcata_descripcion_Visible!=0) ? " onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,69);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCcata_descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavCcata_descripcion_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(65),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavTdet_espadre_Enabled!=0)&&(edtavTdet_espadre_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 70,'',false,'"+sGXsfl_65_idx+"',65)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTdet_espadre_Internalname,AV41TDet_EsPadre,"",TempTags+((edtavTdet_espadre_Enabled!=0)&&(edtavTdet_espadre_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavTdet_espadre_Enabled!=0)&&(edtavTdet_espadre_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,70);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTdet_espadre_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavTdet_espadre_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(65),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavTdet_placapadre_Enabled!=0)&&(edtavTdet_placapadre_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 71,'',false,'"+sGXsfl_65_idx+"',65)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTdet_placapadre_Internalname,AV43TDet_PlacaPadre,"",TempTags+((edtavTdet_placapadre_Enabled!=0)&&(edtavTdet_placapadre_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavTdet_placapadre_Enabled!=0)&&(edtavTdet_placapadre_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,71);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTdet_placapadre_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavTdet_placapadre_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(65),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
      }
      /* Active Bitmap Variable */
      TempTags = " " + ((edtavEliminaritem_Enabled!=0)&&(edtavEliminaritem_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 72,'',false,'',65)\"" : " ") ;
      ClassString = "DeleteAttribute" ;
      StyleString = "" ;
      AV22EliminarItem_IsBlob = (boolean)(((GXutil.strcmp("", AV22EliminarItem)==0)&&(GXutil.strcmp("", AV56Eliminaritem_GXI)==0))||!(GXutil.strcmp("", AV22EliminarItem)==0)) ;
      sImgUrl = ((GXutil.strcmp("", AV22EliminarItem)==0) ? AV56Eliminaritem_GXI : httpContext.getResourceRelative(AV22EliminarItem)) ;
      Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavEliminaritem_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","Eliminar",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(7),edtavEliminaritem_Jsonclick,"'"+""+"'"+",false,"+"'"+"e201x2_client"+"'",StyleString,ClassString,"WWActionColumn","","",""+TempTags,"","",new Integer(1),new Boolean(AV22EliminarItem_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      Grid1Container.AddRow(Grid1Row);
      nGXsfl_65_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_65_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_65_idx+1)) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_65_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_652( ) ;
      /* End function sendrow_652 */
   }

   public void init_default_properties( )
   {
      edtavTran_descripcionmovimiento_Internalname = "vTRAN_DESCRIPCIONMOVIMIENTO" ;
      divTitlecontainer_Internalname = "TITLECONTAINER" ;
      edtavTran_consecutivocc_Internalname = "vTRAN_CONSECUTIVOCC" ;
      imgImage1_Internalname = "IMAGE1" ;
      edtavPlaca_Internalname = "vPLACA" ;
      edtavCata_descripcion_Internalname = "vCATA_DESCRIPCION" ;
      edtavPlacapadre_Internalname = "vPLACAPADRE" ;
      edtavEsplacapadre_Internalname = "vESPLACAPADRE" ;
      cmbavAccion.setInternalname( "vACCION" );
      imgImage2_Internalname = "IMAGE2" ;
      edtavNuevaplaca_Internalname = "vNUEVAPLACA" ;
      edtavNuevadescripcionplaca_Internalname = "vNUEVADESCRIPCIONPLACA" ;
      edtavNuevaplacapadre_Internalname = "vNUEVAPLACAPADRE" ;
      edtavNuevaesplacapadre_Internalname = "vNUEVAESPLACAPADRE" ;
      edtavObservaciones_Internalname = "vOBSERVACIONES" ;
      bttAgregar_Internalname = "AGREGAR" ;
      edtavTdet_consecutivo_Internalname = "vTDET_CONSECUTIVO" ;
      edtavTdet_placanumero_Internalname = "vTDET_PLACANUMERO" ;
      edtavElem_consecutivo_Internalname = "vELEM_CONSECUTIVO" ;
      edtavCcata_descripcion_Internalname = "vCCATA_DESCRIPCION" ;
      edtavTdet_espadre_Internalname = "vTDET_ESPADRE" ;
      edtavTdet_placapadre_Internalname = "vTDET_PLACAPADRE" ;
      edtavEliminaritem_Internalname = "vELIMINARITEM" ;
      divTable2_Internalname = "TABLE2" ;
      divTable1_Internalname = "TABLE1" ;
      bttButton1_Internalname = "BUTTON1" ;
      bttButton2_Internalname = "BUTTON2" ;
      Alertify1_Internalname = "ALERTIFY1" ;
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
      edtavEliminaritem_Jsonclick = "" ;
      edtavEliminaritem_Visible = -1 ;
      edtavEliminaritem_Enabled = 1 ;
      edtavTdet_placapadre_Jsonclick = "" ;
      edtavTdet_placapadre_Visible = -1 ;
      edtavTdet_espadre_Jsonclick = "" ;
      edtavTdet_espadre_Visible = -1 ;
      edtavCcata_descripcion_Jsonclick = "" ;
      edtavCcata_descripcion_Visible = -1 ;
      edtavElem_consecutivo_Jsonclick = "" ;
      edtavElem_consecutivo_Visible = -1 ;
      edtavTdet_placanumero_Jsonclick = "" ;
      edtavTdet_placanumero_Visible = -1 ;
      edtavTdet_consecutivo_Jsonclick = "" ;
      edtavTdet_consecutivo_Visible = 0 ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtavTdet_placapadre_Enabled = 1 ;
      edtavTdet_espadre_Enabled = 1 ;
      edtavCcata_descripcion_Enabled = 1 ;
      edtavElem_consecutivo_Enabled = 1 ;
      edtavTdet_placanumero_Enabled = 1 ;
      edtavTdet_consecutivo_Enabled = 1 ;
      subGrid1_Class = "WorkWith" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavObservaciones_Enabled = 1 ;
      edtavNuevaesplacapadre_Jsonclick = "" ;
      edtavNuevaesplacapadre_Enabled = 1 ;
      edtavNuevaesplacapadre_Visible = 1 ;
      edtavNuevaplacapadre_Jsonclick = "" ;
      edtavNuevaplacapadre_Enabled = 1 ;
      edtavNuevaplacapadre_Visible = 1 ;
      edtavNuevadescripcionplaca_Enabled = 1 ;
      edtavNuevadescripcionplaca_Visible = 1 ;
      edtavNuevaplaca_Jsonclick = "" ;
      edtavNuevaplaca_Enabled = 1 ;
      edtavNuevaplaca_Visible = 1 ;
      imgImage2_Visible = 1 ;
      cmbavAccion.setJsonclick( "" );
      cmbavAccion.setEnabled( 1 );
      edtavEsplacapadre_Jsonclick = "" ;
      edtavEsplacapadre_Enabled = 1 ;
      edtavPlacapadre_Jsonclick = "" ;
      edtavPlacapadre_Enabled = 1 ;
      edtavCata_descripcion_Enabled = 1 ;
      edtavPlaca_Jsonclick = "" ;
      edtavPlaca_Enabled = 1 ;
      edtavTran_consecutivocc_Jsonclick = "" ;
      edtavTran_consecutivocc_Enabled = 1 ;
      edtavTran_descripcionmovimiento_Jsonclick = "" ;
      edtavTran_descripcionmovimiento_Enabled = 1 ;
      Alertify1_Textcancel = "Cancelar" ;
      Alertify1_Textok = "Confirmar" ;
      Alertify1_Textmessage = "" ;
      Alertify1_Type = "confirm" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Asociar y desasociar placas" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV14Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A487TDet_Cantidad',fld:'TDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'A488TDet_ValorUnitario',fld:'TDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A490TDet_PlacaNumero',fld:'TDET_PLACANUMERO',pic:'',nv:''},{av:'A491TDet_PlacaPadre',fld:'TDET_PLACAPADRE',pic:'',nv:''},{av:'A505TDet_EsPadre',fld:'TDET_ESPADRE',pic:'',nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A499Tran_CodTipoElemento',fld:'TRAN_CODTIPOELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("'BUSCARINVENTARIO'","{handler:'e111X1',iparms:[],oparms:[{av:'AV25Invd_Estado',fld:'vINVD_ESTADO',pic:'',nv:''}]}");
      setEventMetadata("VACCION.ISVALID","{handler:'e151X2',iparms:[{av:'cmbavAccion'},{av:'AV17Accion',fld:'vACCION',pic:'',nv:''},{av:'AV35PlacaPadre',fld:'vPLACAPADRE',pic:'',nv:''},{av:'AV24EsPlacaPadre',fld:'vESPLACAPADRE',pic:'',nv:''},{av:'AV34Placa',fld:'vPLACA',pic:'',nv:''},{av:'AV18Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''}],oparms:[{av:'edtavNuevaplaca_Visible',ctrl:'vNUEVAPLACA',prop:'Visible'},{av:'imgImage2_Visible',ctrl:'IMAGE2',prop:'Visible'},{av:'edtavNuevadescripcionplaca_Visible',ctrl:'vNUEVADESCRIPCIONPLACA',prop:'Visible'},{av:'edtavNuevaesplacapadre_Visible',ctrl:'vNUEVAESPLACAPADRE',prop:'Visible'},{av:'edtavNuevaplacapadre_Visible',ctrl:'vNUEVAPLACAPADRE',prop:'Visible'},{av:'Alertify1_Type',ctrl:'ALERTIFY1',prop:'Type'},{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'},{av:'AV23Error',fld:'vERROR',pic:'',nv:''},{av:'AV34Placa',fld:'vPLACA',pic:'',nv:''},{av:'AV18Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV35PlacaPadre',fld:'vPLACAPADRE',pic:'',nv:''},{av:'AV24EsPlacaPadre',fld:'vESPLACAPADRE',pic:'',nv:''},{av:'cmbavAccion'},{av:'AV17Accion',fld:'vACCION',pic:'',nv:''}]}");
      setEventMetadata("'BUSCARINVENTARIO2'","{handler:'e121X1',iparms:[],oparms:[{av:'AV29NuevaInvd_Estado',fld:'vNUEVAINVD_ESTADO',pic:'',nv:''}]}");
      setEventMetadata("VNUEVAPLACA.ISVALID","{handler:'e161X2',iparms:[{av:'AV30NuevaPlaca',fld:'vNUEVAPLACA',pic:'',nv:''},{av:'AV10Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV8Cent_Id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV6Alma_Modulo',fld:'vALMA_MODULO',pic:'',nv:''},{av:'AV5Alma_Codigo',fld:'vALMA_CODIGO',pic:'',nv:''},{av:'AV7Bode_Codigo',fld:'vBODE_CODIGO',pic:'',nv:''}],oparms:[{av:'AV27NuevaError',fld:'vNUEVAERROR',pic:'',nv:''},{av:'AV29NuevaInvd_Estado',fld:'vNUEVAINVD_ESTADO',pic:'',nv:''},{av:'AV28NuevaEsPlacaPadre',fld:'vNUEVAESPLACAPADRE',pic:'',nv:''},{av:'AV31NuevaPlacaPadre',fld:'vNUEVAPLACAPADRE',pic:'',nv:''},{av:'AV26NuevaDescripcionPlaca',fld:'vNUEVADESCRIPCIONPLACA',pic:'@!',nv:''},{av:'Alertify1_Type',ctrl:'ALERTIFY1',prop:'Type'},{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'},{av:'AV23Error',fld:'vERROR',pic:'',nv:''}]}");
      setEventMetadata("'AGREGAR'","{handler:'e171X2',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV14Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A487TDet_Cantidad',fld:'TDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'A488TDet_ValorUnitario',fld:'TDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A490TDet_PlacaNumero',fld:'TDET_PLACANUMERO',pic:'',nv:''},{av:'A491TDet_PlacaPadre',fld:'TDET_PLACAPADRE',pic:'',nv:''},{av:'A505TDet_EsPadre',fld:'TDET_ESPADRE',pic:'',nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A499Tran_CodTipoElemento',fld:'TRAN_CODTIPOELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'cmbavAccion'},{av:'AV17Accion',fld:'vACCION',pic:'',nv:''},{av:'AV25Invd_Estado',fld:'vINVD_ESTADO',pic:'',nv:''},{av:'AV34Placa',fld:'vPLACA',pic:'',nv:''},{av:'AV23Error',fld:'vERROR',pic:'',nv:''},{av:'AV28NuevaEsPlacaPadre',fld:'vNUEVAESPLACAPADRE',pic:'',nv:''},{av:'AV31NuevaPlacaPadre',fld:'vNUEVAPLACAPADRE',pic:'',nv:''},{av:'AV33Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV30NuevaPlaca',fld:'vNUEVAPLACA',pic:'',nv:''},{av:'AV24EsPlacaPadre',fld:'vESPLACAPADRE',pic:'',nv:''},{av:'AV35PlacaPadre',fld:'vPLACAPADRE',pic:'',nv:''},{av:'AV29NuevaInvd_Estado',fld:'vNUEVAINVD_ESTADO',pic:'',nv:''},{av:'AV27NuevaError',fld:'vNUEVAERROR',pic:'',nv:''}],oparms:[{av:'AV28NuevaEsPlacaPadre',fld:'vNUEVAESPLACAPADRE',pic:'',nv:''},{av:'AV31NuevaPlacaPadre',fld:'vNUEVAPLACAPADRE',pic:'',nv:''},{av:'AV35PlacaPadre',fld:'vPLACAPADRE',pic:'',nv:''},{av:'AV24EsPlacaPadre',fld:'vESPLACAPADRE',pic:'',nv:''},{av:'AV30NuevaPlaca',fld:'vNUEVAPLACA',pic:'',nv:''},{av:'cmbavAccion'},{av:'AV17Accion',fld:'vACCION',pic:'',nv:''},{av:'AV33Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV34Placa',fld:'vPLACA',pic:'',nv:''},{av:'AV14Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'Alertify1_Type',ctrl:'ALERTIFY1',prop:'Type'},{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'},{av:'AV18Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV26NuevaDescripcionPlaca',fld:'vNUEVADESCRIPCIONPLACA',pic:'@!',nv:''},{av:'edtavNuevaplaca_Visible',ctrl:'vNUEVAPLACA',prop:'Visible'},{av:'imgImage2_Visible',ctrl:'IMAGE2',prop:'Visible'},{av:'edtavNuevadescripcionplaca_Visible',ctrl:'vNUEVADESCRIPCIONPLACA',prop:'Visible'},{av:'edtavNuevaesplacapadre_Visible',ctrl:'vNUEVAESPLACAPADRE',prop:'Visible'},{av:'edtavNuevaplacapadre_Visible',ctrl:'vNUEVAPLACAPADRE',prop:'Visible'}]}");
      setEventMetadata("GRID1.LOAD","{handler:'e191X2',iparms:[{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV14Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A487TDet_Cantidad',fld:'TDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'A488TDet_ValorUnitario',fld:'TDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A490TDet_PlacaNumero',fld:'TDET_PLACANUMERO',pic:'',nv:''},{av:'A491TDet_PlacaPadre',fld:'TDET_PLACAPADRE',pic:'',nv:''},{av:'A505TDet_EsPadre',fld:'TDET_ESPADRE',pic:'',nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A499Tran_CodTipoElemento',fld:'TRAN_CODTIPOELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[{av:'AV22EliminarItem',fld:'vELIMINARITEM',pic:'',nv:''},{av:'AV40TDet_Consecutivo',fld:'vTDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV21Elem_Consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV42TDet_PlacaNumero',fld:'vTDET_PLACANUMERO',pic:'',nv:''},{av:'AV43TDet_PlacaPadre',fld:'vTDET_PLACAPADRE',pic:'',nv:''},{av:'AV41TDet_EsPadre',fld:'vTDET_ESPADRE',pic:'',nv:''},{av:'AV19cCata_Descripcion',fld:'vCCATA_DESCRIPCION',pic:'@!',nv:''}]}");
      setEventMetadata("'ELIMINAR ITEM'","{handler:'e201X2',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV14Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A487TDet_Cantidad',fld:'TDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'A488TDet_ValorUnitario',fld:'TDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A490TDet_PlacaNumero',fld:'TDET_PLACANUMERO',pic:'',nv:''},{av:'A491TDet_PlacaPadre',fld:'TDET_PLACAPADRE',pic:'',nv:''},{av:'A505TDet_EsPadre',fld:'TDET_ESPADRE',pic:'',nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A499Tran_CodTipoElemento',fld:'TRAN_CODTIPOELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("'CONFIRMAR'","{handler:'e131X1',iparms:[],oparms:[{av:'Alertify1_Type',ctrl:'ALERTIFY1',prop:'Type'},{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'}]}");
      setEventMetadata("ALERTIFY1.OK","{handler:'e141X2',iparms:[{av:'AV14Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0}],oparms:[{av:'AV14Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0}]}");
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
      A66Elem_Consecutivo = "" ;
      A488TDet_ValorUnitario = DecimalUtil.ZERO ;
      A489TDet_ValorTotal = DecimalUtil.ZERO ;
      A490TDet_PlacaNumero = "" ;
      A491TDet_PlacaPadre = "" ;
      A505TDet_EsPadre = "" ;
      A298Cata_Descripcion = "" ;
      GXKey = "" ;
      forbiddenHiddens = "" ;
      AV13Tran_DescripcionMovimiento = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV23Error = "" ;
      AV25Invd_Estado = "" ;
      AV6Alma_Modulo = "" ;
      AV5Alma_Codigo = "" ;
      AV7Bode_Codigo = "" ;
      AV29NuevaInvd_Estado = "" ;
      AV27NuevaError = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      sImgUrl = "" ;
      imgImage1_Jsonclick = "" ;
      AV34Placa = "" ;
      AV18Cata_Descripcion = "" ;
      AV35PlacaPadre = "" ;
      AV24EsPlacaPadre = "" ;
      AV17Accion = "" ;
      imgImage2_Jsonclick = "" ;
      AV30NuevaPlaca = "" ;
      AV26NuevaDescripcionPlaca = "" ;
      AV31NuevaPlacaPadre = "" ;
      AV28NuevaEsPlacaPadre = "" ;
      AV33Observaciones = "" ;
      bttAgregar_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV42TDet_PlacaNumero = "" ;
      AV21Elem_Consecutivo = "" ;
      AV19cCata_Descripcion = "" ;
      AV41TDet_EsPadre = "" ;
      AV43TDet_PlacaPadre = "" ;
      AV22EliminarItem = "" ;
      bttButton1_Jsonclick = "" ;
      bttButton2_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV56Eliminaritem_GXI = "" ;
      hsh = "" ;
      AV47Usuario = "" ;
      AV16websession = httpContext.getWebSession();
      GXv_int1 = new long [1] ;
      GXv_int2 = new long [1] ;
      GXv_int3 = new long [1] ;
      GXv_int7 = new long [1] ;
      AV53Tran_Estado = "" ;
      AV32NuevaValorAdquisicion = DecimalUtil.ZERO ;
      GXv_decimal11 = new java.math.BigDecimal [1] ;
      GXv_int13 = new int [1] ;
      GXv_char15 = new String [1] ;
      GXv_char14 = new String [1] ;
      GXv_char12 = new String [1] ;
      GXv_char10 = new String [1] ;
      GXv_char9 = new String [1] ;
      GXv_char6 = new String [1] ;
      GXv_char5 = new String [1] ;
      GXv_char4 = new String [1] ;
      scmdbuf = "" ;
      H001X2_A37Cata_Codigo = new String[] {""} ;
      H001X2_A49Tran_CodigoMovimiento = new String[] {""} ;
      H001X2_A46Tran_Id = new long[1] ;
      H001X2_A69TDet_Consecutivo = new long[1] ;
      H001X2_A66Elem_Consecutivo = new String[] {""} ;
      H001X2_A487TDet_Cantidad = new long[1] ;
      H001X2_A488TDet_ValorUnitario = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H001X2_A489TDet_ValorTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H001X2_A490TDet_PlacaNumero = new String[] {""} ;
      H001X2_n490TDet_PlacaNumero = new boolean[] {false} ;
      H001X2_A491TDet_PlacaPadre = new String[] {""} ;
      H001X2_n491TDet_PlacaPadre = new boolean[] {false} ;
      H001X2_A505TDet_EsPadre = new String[] {""} ;
      H001X2_A298Cata_Descripcion = new String[] {""} ;
      H001X2_A499Tran_CodTipoElemento = new long[1] ;
      H001X2_n499Tran_CodTipoElemento = new boolean[] {false} ;
      A37Cata_Codigo = "" ;
      A49Tran_CodigoMovimiento = "" ;
      AV46TDet_ValorUnitario = DecimalUtil.ZERO ;
      AV45TDet_ValorTotal = DecimalUtil.ZERO ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      GXv_int8 = new long [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wpalm_asociar_placas__default(),
         new Object[] {
             new Object[] {
            H001X2_A37Cata_Codigo, H001X2_A49Tran_CodigoMovimiento, H001X2_A46Tran_Id, H001X2_A69TDet_Consecutivo, H001X2_A66Elem_Consecutivo, H001X2_A487TDet_Cantidad, H001X2_A488TDet_ValorUnitario, H001X2_A489TDet_ValorTotal, H001X2_A490TDet_PlacaNumero, H001X2_n490TDet_PlacaNumero,
            H001X2_A491TDet_PlacaPadre, H001X2_n491TDet_PlacaPadre, H001X2_A505TDet_EsPadre, H001X2_A298Cata_Descripcion, H001X2_A499Tran_CodTipoElemento, H001X2_n499Tran_CodTipoElemento
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavTran_descripcionmovimiento_Enabled = 0 ;
      edtavCata_descripcion_Enabled = 0 ;
      edtavPlacapadre_Enabled = 0 ;
      edtavEsplacapadre_Enabled = 0 ;
      edtavNuevadescripcionplaca_Enabled = 0 ;
      edtavNuevaplacapadre_Enabled = 0 ;
      edtavNuevaesplacapadre_Enabled = 0 ;
      edtavTdet_consecutivo_Enabled = 0 ;
      edtavTdet_placanumero_Enabled = 0 ;
      edtavElem_consecutivo_Enabled = 0 ;
      edtavCcata_descripcion_Enabled = 0 ;
      edtavTdet_espadre_Enabled = 0 ;
      edtavTdet_placapadre_Enabled = 0 ;
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
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short nRC_GXsfl_65 ;
   private short nGXsfl_65_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtavTran_descripcionmovimiento_Enabled ;
   private int edtavTran_consecutivocc_Enabled ;
   private int edtavPlaca_Enabled ;
   private int edtavCata_descripcion_Enabled ;
   private int edtavPlacapadre_Enabled ;
   private int edtavEsplacapadre_Enabled ;
   private int imgImage2_Visible ;
   private int edtavNuevaplaca_Visible ;
   private int edtavNuevaplaca_Enabled ;
   private int edtavNuevadescripcionplaca_Visible ;
   private int edtavNuevadescripcionplaca_Enabled ;
   private int edtavNuevaplacapadre_Visible ;
   private int edtavNuevaplacapadre_Enabled ;
   private int edtavNuevaesplacapadre_Visible ;
   private int edtavNuevaesplacapadre_Enabled ;
   private int edtavObservaciones_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavTdet_consecutivo_Enabled ;
   private int edtavTdet_placanumero_Enabled ;
   private int edtavElem_consecutivo_Enabled ;
   private int edtavCcata_descripcion_Enabled ;
   private int edtavTdet_espadre_Enabled ;
   private int edtavTdet_placapadre_Enabled ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GXv_int13[] ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int edtavTdet_consecutivo_Visible ;
   private int edtavTdet_placanumero_Visible ;
   private int edtavElem_consecutivo_Visible ;
   private int edtavCcata_descripcion_Visible ;
   private int edtavTdet_espadre_Visible ;
   private int edtavTdet_placapadre_Visible ;
   private int edtavEliminaritem_Enabled ;
   private int edtavEliminaritem_Visible ;
   private long wcpOAV14Tran_Id ;
   private long A46Tran_Id ;
   private long AV14Tran_Id ;
   private long A69TDet_Consecutivo ;
   private long A487TDet_Cantidad ;
   private long A499Tran_CodTipoElemento ;
   private long AV10Regi_Id ;
   private long AV8Cent_Id ;
   private long AV12Tran_ConsecutivoCC ;
   private long AV40TDet_Consecutivo ;
   private long GRID1_nCurrentRecord ;
   private long GXv_int1[] ;
   private long GXv_int2[] ;
   private long GXv_int3[] ;
   private long GXv_int7[] ;
   private long AV15Tran_IdCuentadanteOrigen ;
   private long AV38TDet_Cantidad ;
   private long AV52Tran_CodTipoElemento ;
   private long GXv_int8[] ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal A488TDet_ValorUnitario ;
   private java.math.BigDecimal A489TDet_ValorTotal ;
   private java.math.BigDecimal AV32NuevaValorAdquisicion ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal AV46TDet_ValorUnitario ;
   private java.math.BigDecimal AV45TDet_ValorTotal ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_65_idx="0001" ;
   private String GXKey ;
   private String forbiddenHiddens ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV23Error ;
   private String AV27NuevaError ;
   private String Alertify1_Type ;
   private String Alertify1_Textmessage ;
   private String Alertify1_Textok ;
   private String Alertify1_Textcancel ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String divTitlecontainer_Internalname ;
   private String TempTags ;
   private String edtavTran_descripcionmovimiento_Internalname ;
   private String edtavTran_descripcionmovimiento_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divTable1_Internalname ;
   private String edtavTran_consecutivocc_Internalname ;
   private String edtavTran_consecutivocc_Jsonclick ;
   private String sImgUrl ;
   private String imgImage1_Internalname ;
   private String imgImage1_Jsonclick ;
   private String edtavPlaca_Internalname ;
   private String edtavPlaca_Jsonclick ;
   private String edtavCata_descripcion_Internalname ;
   private String edtavPlacapadre_Internalname ;
   private String edtavPlacapadre_Jsonclick ;
   private String edtavEsplacapadre_Internalname ;
   private String AV24EsPlacaPadre ;
   private String edtavEsplacapadre_Jsonclick ;
   private String AV17Accion ;
   private String imgImage2_Internalname ;
   private String imgImage2_Jsonclick ;
   private String edtavNuevaplaca_Internalname ;
   private String edtavNuevaplaca_Jsonclick ;
   private String edtavNuevadescripcionplaca_Internalname ;
   private String edtavNuevaplacapadre_Internalname ;
   private String edtavNuevaplacapadre_Jsonclick ;
   private String edtavNuevaesplacapadre_Internalname ;
   private String AV28NuevaEsPlacaPadre ;
   private String edtavNuevaesplacapadre_Jsonclick ;
   private String edtavObservaciones_Internalname ;
   private String bttAgregar_Internalname ;
   private String bttAgregar_Jsonclick ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String divTable2_Internalname ;
   private String bttButton1_Internalname ;
   private String bttButton1_Jsonclick ;
   private String bttButton2_Internalname ;
   private String bttButton2_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavTdet_consecutivo_Internalname ;
   private String edtavTdet_placanumero_Internalname ;
   private String edtavElem_consecutivo_Internalname ;
   private String edtavCcata_descripcion_Internalname ;
   private String edtavTdet_espadre_Internalname ;
   private String edtavTdet_placapadre_Internalname ;
   private String edtavEliminaritem_Internalname ;
   private String hsh ;
   private String AV53Tran_Estado ;
   private String Alertify1_Internalname ;
   private String GXv_char15[] ;
   private String GXv_char14[] ;
   private String GXv_char12[] ;
   private String GXv_char10[] ;
   private String GXv_char9[] ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String sGXsfl_65_fel_idx="0001" ;
   private String ROClassString ;
   private String edtavTdet_consecutivo_Jsonclick ;
   private String edtavTdet_placanumero_Jsonclick ;
   private String edtavElem_consecutivo_Jsonclick ;
   private String edtavCcata_descripcion_Jsonclick ;
   private String edtavTdet_espadre_Jsonclick ;
   private String edtavTdet_placapadre_Jsonclick ;
   private String edtavEliminaritem_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean n490TDet_PlacaNumero ;
   private boolean n491TDet_PlacaPadre ;
   private boolean n499Tran_CodTipoElemento ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_65_Refreshing=false ;
   private boolean returnInSub ;
   private boolean AV22EliminarItem_IsBlob ;
   private String AV33Observaciones ;
   private String A66Elem_Consecutivo ;
   private String A490TDet_PlacaNumero ;
   private String A491TDet_PlacaPadre ;
   private String A505TDet_EsPadre ;
   private String A298Cata_Descripcion ;
   private String AV13Tran_DescripcionMovimiento ;
   private String AV25Invd_Estado ;
   private String AV6Alma_Modulo ;
   private String AV5Alma_Codigo ;
   private String AV7Bode_Codigo ;
   private String AV29NuevaInvd_Estado ;
   private String AV34Placa ;
   private String AV18Cata_Descripcion ;
   private String AV35PlacaPadre ;
   private String AV30NuevaPlaca ;
   private String AV26NuevaDescripcionPlaca ;
   private String AV31NuevaPlacaPadre ;
   private String AV42TDet_PlacaNumero ;
   private String AV21Elem_Consecutivo ;
   private String AV19cCata_Descripcion ;
   private String AV41TDet_EsPadre ;
   private String AV43TDet_PlacaPadre ;
   private String AV56Eliminaritem_GXI ;
   private String AV47Usuario ;
   private String A37Cata_Codigo ;
   private String A49Tran_CodigoMovimiento ;
   private String AV22EliminarItem ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV16websession ;
   private HTMLChoice cmbavAccion ;
   private IDataStoreProvider pr_default ;
   private String[] H001X2_A37Cata_Codigo ;
   private String[] H001X2_A49Tran_CodigoMovimiento ;
   private long[] H001X2_A46Tran_Id ;
   private long[] H001X2_A69TDet_Consecutivo ;
   private String[] H001X2_A66Elem_Consecutivo ;
   private long[] H001X2_A487TDet_Cantidad ;
   private java.math.BigDecimal[] H001X2_A488TDet_ValorUnitario ;
   private java.math.BigDecimal[] H001X2_A489TDet_ValorTotal ;
   private String[] H001X2_A490TDet_PlacaNumero ;
   private boolean[] H001X2_n490TDet_PlacaNumero ;
   private String[] H001X2_A491TDet_PlacaPadre ;
   private boolean[] H001X2_n491TDet_PlacaPadre ;
   private String[] H001X2_A505TDet_EsPadre ;
   private String[] H001X2_A298Cata_Descripcion ;
   private long[] H001X2_A499Tran_CodTipoElemento ;
   private boolean[] H001X2_n499Tran_CodTipoElemento ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class wpalm_asociar_placas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001X2", "SELECT T4.Cata_Codigo, T2.Tran_CodigoMovimiento AS Tran_CodigoMovimiento, T1.Tran_Id, T1.TDet_Consecutivo, T1.Elem_Consecutivo, T1.TDet_Cantidad, T1.TDet_ValorUnitario, T1.TDet_ValorTotal, T1.TDet_PlacaNumero, T1.TDet_PlacaPadre, T1.TDet_EsPadre, T5.Cata_Descripcion, T3.Tipo_Codigo AS Tran_CodTipoElemento FROM ((((ALM_DETALLE_TRANSACCION T1 INNER JOIN ALM_TRANSACCION T2 ON T2.Tran_Id = T1.Tran_Id) INNER JOIN ALM_TIPO_MOVIMIENTO T3 ON T3.Tpmo_Codigo = T2.Tran_CodigoMovimiento) INNER JOIN ALM_ELEMENTO T4 ON T4.Elem_Consecutivo = T1.Elem_Consecutivo) INNER JOIN ALM_CATALOGO T5 ON T5.Cata_Codigo = T4.Cata_Codigo) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((long[]) buf[5])[0] = rslt.getLong(6) ;
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2) ;
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(11) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(12) ;
               ((long[]) buf[14])[0] = rslt.getLong(13) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

