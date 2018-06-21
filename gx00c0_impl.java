/*
               File: gx00c0_impl
        Description: Selection List DETALLE TRANSACCIÓN
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:24:23.31
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

public final  class gx00c0_impl extends GXDataArea
{
   public gx00c0_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx00c0_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx00c0_impl.class ));
   }

   public gx00c0_impl( int remoteHandle ,
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
            AV6cTran_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            AV7cTDet_Consecutivo = GXutil.lval( httpContext.GetNextPar( )) ;
            AV8cElem_Consecutivo = httpContext.GetNextPar( ) ;
            AV9cTDet_Cantidad = GXutil.lval( httpContext.GetNextPar( )) ;
            AV10cTDet_ValorUnitario = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            AV11cTDet_ValorTotal = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            AV12cTDet_PlacaNumero = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cTran_Id, AV7cTDet_Consecutivo, AV8cElem_Consecutivo, AV9cTDet_Cantidad, AV10cTDet_ValorUnitario, AV11cTDet_ValorTotal, AV12cTDet_PlacaNumero) ;
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
            AV13pTran_Id = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13pTran_Id", GXutil.ltrim( GXutil.str( AV13pTran_Id, 11, 0)));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV14pTDet_Consecutivo = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14pTDet_Consecutivo", GXutil.ltrim( GXutil.str( AV14pTDet_Consecutivo, 18, 0)));
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
      pa8F2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start8F2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414242338");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.gx00c0") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pTran_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14pTDet_Consecutivo,18,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTRAN_ID", GXutil.ltrim( localUtil.ntoc( AV6cTran_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTDET_CONSECUTIVO", GXutil.ltrim( localUtil.ntoc( AV7cTDet_Consecutivo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCELEM_CONSECUTIVO", AV8cElem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTDET_CANTIDAD", GXutil.ltrim( localUtil.ntoc( AV9cTDet_Cantidad, (byte)(10), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTDET_VALORUNITARIO", GXutil.ltrim( localUtil.ntoc( AV10cTDet_ValorUnitario, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTDET_VALORTOTAL", GXutil.ltrim( localUtil.ntoc( AV11cTDet_ValorTotal, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTDET_PLACANUMERO", AV12cTDet_PlacaNumero);
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_84", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_84, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPTRAN_ID", GXutil.ltrim( localUtil.ntoc( AV13pTran_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPTDET_CONSECUTIVO", GXutil.ltrim( localUtil.ntoc( AV14pTDet_Consecutivo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_IDFILTERCONTAINER_Class", GXutil.rtrim( divTran_idfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_CONSECUTIVOFILTERCONTAINER_Class", GXutil.rtrim( divTdet_consecutivofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_CONSECUTIVOFILTERCONTAINER_Class", GXutil.rtrim( divElem_consecutivofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_CANTIDADFILTERCONTAINER_Class", GXutil.rtrim( divTdet_cantidadfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_VALORUNITARIOFILTERCONTAINER_Class", GXutil.rtrim( divTdet_valorunitariofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_VALORTOTALFILTERCONTAINER_Class", GXutil.rtrim( divTdet_valortotalfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_PLACANUMEROFILTERCONTAINER_Class", GXutil.rtrim( divTdet_placanumerofiltercontainer_Class));
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
         we8F2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt8F2( ) ;
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
      return formatLink("com.orions2.gx00c0") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pTran_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14pTDet_Consecutivo,18,0))) ;
   }

   public String getPgmname( )
   {
      return "Gx00C0" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List DETALLE TRANSACCIÓN" ;
   }

   public void wb8F0( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTran_idfiltercontainer_Internalname, 1, 0, "px", 0, "px", divTran_idfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltran_idfilter_Internalname, "Identificador", "", "", lblLbltran_idfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e118f1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00C0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtran_id_Internalname, "Identificador", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtran_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cTran_Id, (byte)(11), (byte)(0), ",", "")), ((edtavCtran_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6cTran_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV6cTran_Id), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtran_id_Jsonclick, 0, "Attribute", "", "", "", edtavCtran_id_Visible, edtavCtran_id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx00C0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTdet_consecutivofiltercontainer_Internalname, 1, 0, "px", 0, "px", divTdet_consecutivofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltdet_consecutivofilter_Internalname, "Consecutivo Item", "", "", lblLbltdet_consecutivofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e128f1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00C0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtdet_consecutivo_Internalname, "Consecutivo Item", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtdet_consecutivo_Internalname, GXutil.ltrim( localUtil.ntoc( AV7cTDet_Consecutivo, (byte)(18), (byte)(0), ",", "")), ((edtavCtdet_consecutivo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV7cTDet_Consecutivo), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV7cTDet_Consecutivo), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtdet_consecutivo_Jsonclick, 0, "Attribute", "", "", "", edtavCtdet_consecutivo_Visible, edtavCtdet_consecutivo_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx00C0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divElem_consecutivofiltercontainer_Internalname, 1, 0, "px", 0, "px", divElem_consecutivofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblelem_consecutivofilter_Internalname, "Consecutivo", "", "", lblLblelem_consecutivofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e138f1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00C0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCelem_consecutivo_Internalname, "Consecutivo", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCelem_consecutivo_Internalname, AV8cElem_Consecutivo, GXutil.rtrim( localUtil.format( AV8cElem_Consecutivo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCelem_consecutivo_Jsonclick, 0, "Attribute", "", "", "", edtavCelem_consecutivo_Visible, edtavCelem_consecutivo_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx00C0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTdet_cantidadfiltercontainer_Internalname, 1, 0, "px", 0, "px", divTdet_cantidadfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltdet_cantidadfilter_Internalname, "Cantidad", "", "", lblLbltdet_cantidadfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e148f1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00C0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtdet_cantidad_Internalname, "Cantidad", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtdet_cantidad_Internalname, GXutil.ltrim( localUtil.ntoc( AV9cTDet_Cantidad, (byte)(10), (byte)(0), ",", "")), ((edtavCtdet_cantidad_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9cTDet_Cantidad), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV9cTDet_Cantidad), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtdet_cantidad_Jsonclick, 0, "Attribute", "", "", "", edtavCtdet_cantidad_Visible, edtavCtdet_cantidad_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx00C0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTdet_valorunitariofiltercontainer_Internalname, 1, 0, "px", 0, "px", divTdet_valorunitariofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltdet_valorunitariofilter_Internalname, "Valor Unitario", "", "", lblLbltdet_valorunitariofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e158f1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00C0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtdet_valorunitario_Internalname, "Valor Unitario", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtdet_valorunitario_Internalname, GXutil.ltrim( localUtil.ntoc( AV10cTDet_ValorUnitario, (byte)(22), (byte)(2), ",", "")), ((edtavCtdet_valorunitario_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV10cTDet_ValorUnitario, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV10cTDet_ValorUnitario, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtdet_valorunitario_Jsonclick, 0, "Attribute", "", "", "", edtavCtdet_valorunitario_Visible, edtavCtdet_valorunitario_Enabled, 0, "text", "", 22, "chr", 1, "row", 22, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx00C0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTdet_valortotalfiltercontainer_Internalname, 1, 0, "px", 0, "px", divTdet_valortotalfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltdet_valortotalfilter_Internalname, "Valor Total", "", "", lblLbltdet_valortotalfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e168f1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00C0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtdet_valortotal_Internalname, "Valor Total", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtdet_valortotal_Internalname, GXutil.ltrim( localUtil.ntoc( AV11cTDet_ValorTotal, (byte)(22), (byte)(2), ",", "")), ((edtavCtdet_valortotal_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV11cTDet_ValorTotal, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV11cTDet_ValorTotal, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtdet_valortotal_Jsonclick, 0, "Attribute", "", "", "", edtavCtdet_valortotal_Visible, edtavCtdet_valortotal_Enabled, 0, "text", "", 22, "chr", 1, "row", 22, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx00C0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTdet_placanumerofiltercontainer_Internalname, 1, 0, "px", 0, "px", divTdet_placanumerofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltdet_placanumerofilter_Internalname, "Número Placa", "", "", lblLbltdet_placanumerofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e178f1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00C0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtdet_placanumero_Internalname, "Número Placa", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtdet_placanumero_Internalname, AV12cTDet_PlacaNumero, GXutil.rtrim( localUtil.format( AV12cTDet_PlacaNumero, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtdet_placanumero_Jsonclick, 0, "Attribute", "", "", "", edtavCtdet_placanumero_Visible, edtavCtdet_placanumero_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx00C0.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e188f1_client"+"'", TempTags, "", 2, "HLP_Gx00C0.htm");
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
            httpContext.writeValue( "Identificador") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Item") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Consecutivo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cantidad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Unitario") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Total") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "es Padre") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "TDet_Atributos") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A69TDet_Consecutivo, (byte)(18), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A66Elem_Consecutivo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A487TDet_Cantidad, (byte)(10), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtTDet_Cantidad_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A488TDet_ValorUnitario, (byte)(22), (byte)(2), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A489TDet_ValorTotal, (byte)(22), (byte)(2), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A505TDet_EsPadre);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A525TDet_Atributos);
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx00C0.htm");
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

   public void start8F2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List DETALLE TRANSACCIÓN", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup8F0( ) ;
   }

   public void ws8F2( )
   {
      start8F2( ) ;
      evt8F2( ) ;
   }

   public void evt8F2( )
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
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV18Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV5LinkSelection))), !bGXsfl_84_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV5LinkSelection), true);
                           A46Tran_Id = localUtil.ctol( httpContext.cgiGet( edtTran_Id_Internalname), ",", ".") ;
                           A69TDet_Consecutivo = localUtil.ctol( httpContext.cgiGet( edtTDet_Consecutivo_Internalname), ",", ".") ;
                           A66Elem_Consecutivo = httpContext.cgiGet( edtElem_Consecutivo_Internalname) ;
                           A487TDet_Cantidad = localUtil.ctol( httpContext.cgiGet( edtTDet_Cantidad_Internalname), ",", ".") ;
                           A488TDet_ValorUnitario = localUtil.ctond( httpContext.cgiGet( edtTDet_ValorUnitario_Internalname)) ;
                           A489TDet_ValorTotal = localUtil.ctond( httpContext.cgiGet( edtTDet_ValorTotal_Internalname)) ;
                           A505TDet_EsPadre = httpContext.cgiGet( edtTDet_EsPadre_Internalname) ;
                           A525TDet_Atributos = httpContext.cgiGet( edtTDet_Atributos_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e198F2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e208F2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Ctran_id Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCTRAN_ID"), ",", ".") != AV6cTran_Id )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctdet_consecutivo Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCTDET_CONSECUTIVO"), ",", ".") != AV7cTDet_Consecutivo )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Celem_consecutivo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCELEM_CONSECUTIVO"), AV8cElem_Consecutivo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctdet_cantidad Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCTDET_CANTIDAD"), ",", ".") != AV9cTDet_Cantidad )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctdet_valorunitario Changed */
                                    if ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( "GXH_vCTDET_VALORUNITARIO")), AV10cTDet_ValorUnitario) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctdet_valortotal Changed */
                                    if ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( "GXH_vCTDET_VALORTOTAL")), AV11cTDet_ValorTotal) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctdet_placanumero Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTDET_PLACANUMERO"), AV12cTDet_PlacaNumero) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e218F2 ();
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

   public void we8F2( )
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

   public void pa8F2( )
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
                                  long AV6cTran_Id ,
                                  long AV7cTDet_Consecutivo ,
                                  String AV8cElem_Consecutivo ,
                                  long AV9cTDet_Cantidad ,
                                  java.math.BigDecimal AV10cTDet_ValorUnitario ,
                                  java.math.BigDecimal AV11cTDet_ValorTotal ,
                                  String AV12cTDet_PlacaNumero )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID1_nCurrentRecord = 0 ;
      rf8F2( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A46Tran_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_ID", GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_CONSECUTIVO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A69TDet_Consecutivo), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_CONSECUTIVO", GXutil.ltrim( localUtil.ntoc( A69TDet_Consecutivo, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_CONSECUTIVO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_CONSECUTIVO", A66Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_CANTIDAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A487TDet_Cantidad), "ZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_CANTIDAD", GXutil.ltrim( localUtil.ntoc( A487TDet_Cantidad, (byte)(10), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_VALORUNITARIO", getSecureSignedToken( "", localUtil.format( A488TDet_ValorUnitario, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_VALORUNITARIO", GXutil.ltrim( localUtil.ntoc( A488TDet_ValorUnitario, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_VALORTOTAL", getSecureSignedToken( "", localUtil.format( A489TDet_ValorTotal, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_VALORTOTAL", GXutil.ltrim( localUtil.ntoc( A489TDet_ValorTotal, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_ESPADRE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A505TDet_EsPadre, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_ESPADRE", A505TDet_EsPadre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_ATRIBUTOS", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A525TDet_Atributos, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_ATRIBUTOS", A525TDet_Atributos);
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf8F2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf8F2( )
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
                                              AV8cElem_Consecutivo ,
                                              new Long(AV9cTDet_Cantidad) ,
                                              AV10cTDet_ValorUnitario ,
                                              AV11cTDet_ValorTotal ,
                                              AV12cTDet_PlacaNumero ,
                                              A66Elem_Consecutivo ,
                                              new Long(A487TDet_Cantidad) ,
                                              A488TDet_ValorUnitario ,
                                              A489TDet_ValorTotal ,
                                              A490TDet_PlacaNumero ,
                                              new Long(AV6cTran_Id) ,
                                              new Long(AV7cTDet_Consecutivo) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.LONG
                                              }
         } ) ;
         lV8cElem_Consecutivo = GXutil.concat( GXutil.rtrim( AV8cElem_Consecutivo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cElem_Consecutivo", AV8cElem_Consecutivo);
         lV12cTDet_PlacaNumero = GXutil.concat( GXutil.rtrim( AV12cTDet_PlacaNumero), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cTDet_PlacaNumero", AV12cTDet_PlacaNumero);
         /* Using cursor H008F2 */
         pr_default.execute(0, new Object[] {new Long(AV6cTran_Id), new Long(AV7cTDet_Consecutivo), lV8cElem_Consecutivo, new Long(AV9cTDet_Cantidad), AV10cTDet_ValorUnitario, AV11cTDet_ValorTotal, lV12cTDet_PlacaNumero, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_84_idx = (short)(1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A490TDet_PlacaNumero = H008F2_A490TDet_PlacaNumero[0] ;
            n490TDet_PlacaNumero = H008F2_n490TDet_PlacaNumero[0] ;
            A525TDet_Atributos = H008F2_A525TDet_Atributos[0] ;
            A505TDet_EsPadre = H008F2_A505TDet_EsPadre[0] ;
            A489TDet_ValorTotal = H008F2_A489TDet_ValorTotal[0] ;
            A488TDet_ValorUnitario = H008F2_A488TDet_ValorUnitario[0] ;
            A487TDet_Cantidad = H008F2_A487TDet_Cantidad[0] ;
            A66Elem_Consecutivo = H008F2_A66Elem_Consecutivo[0] ;
            A69TDet_Consecutivo = H008F2_A69TDet_Consecutivo[0] ;
            A46Tran_Id = H008F2_A46Tran_Id[0] ;
            /* Execute user event: Load */
            e208F2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(84) ;
         wb8F0( ) ;
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
                                           AV8cElem_Consecutivo ,
                                           new Long(AV9cTDet_Cantidad) ,
                                           AV10cTDet_ValorUnitario ,
                                           AV11cTDet_ValorTotal ,
                                           AV12cTDet_PlacaNumero ,
                                           A66Elem_Consecutivo ,
                                           new Long(A487TDet_Cantidad) ,
                                           A488TDet_ValorUnitario ,
                                           A489TDet_ValorTotal ,
                                           A490TDet_PlacaNumero ,
                                           new Long(AV6cTran_Id) ,
                                           new Long(AV7cTDet_Consecutivo) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.LONG
                                           }
      } ) ;
      lV8cElem_Consecutivo = GXutil.concat( GXutil.rtrim( AV8cElem_Consecutivo), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8cElem_Consecutivo", AV8cElem_Consecutivo);
      lV12cTDet_PlacaNumero = GXutil.concat( GXutil.rtrim( AV12cTDet_PlacaNumero), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12cTDet_PlacaNumero", AV12cTDet_PlacaNumero);
      /* Using cursor H008F3 */
      pr_default.execute(1, new Object[] {new Long(AV6cTran_Id), new Long(AV7cTDet_Consecutivo), lV8cElem_Consecutivo, new Long(AV9cTDet_Cantidad), AV10cTDet_ValorUnitario, AV11cTDet_ValorTotal, lV12cTDet_PlacaNumero});
      GRID1_nRecordCount = H008F3_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cTran_Id, AV7cTDet_Consecutivo, AV8cElem_Consecutivo, AV9cTDet_Cantidad, AV10cTDet_ValorUnitario, AV11cTDet_ValorTotal, AV12cTDet_PlacaNumero) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cTran_Id, AV7cTDet_Consecutivo, AV8cElem_Consecutivo, AV9cTDet_Cantidad, AV10cTDet_ValorUnitario, AV11cTDet_ValorTotal, AV12cTDet_PlacaNumero) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cTran_Id, AV7cTDet_Consecutivo, AV8cElem_Consecutivo, AV9cTDet_Cantidad, AV10cTDet_ValorUnitario, AV11cTDet_ValorTotal, AV12cTDet_PlacaNumero) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cTran_Id, AV7cTDet_Consecutivo, AV8cElem_Consecutivo, AV9cTDet_Cantidad, AV10cTDet_ValorUnitario, AV11cTDet_ValorTotal, AV12cTDet_PlacaNumero) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cTran_Id, AV7cTDet_Consecutivo, AV8cElem_Consecutivo, AV9cTDet_Cantidad, AV10cTDet_ValorUnitario, AV11cTDet_ValorTotal, AV12cTDet_PlacaNumero) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup8F0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e198F2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtran_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtran_id_Internalname), ",", ".") > 99999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCTRAN_ID");
            GX_FocusControl = edtavCtran_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cTran_Id = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cTran_Id", GXutil.ltrim( GXutil.str( AV6cTran_Id, 11, 0)));
         }
         else
         {
            AV6cTran_Id = localUtil.ctol( httpContext.cgiGet( edtavCtran_id_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cTran_Id", GXutil.ltrim( GXutil.str( AV6cTran_Id, 11, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtdet_consecutivo_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtdet_consecutivo_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCTDET_CONSECUTIVO");
            GX_FocusControl = edtavCtdet_consecutivo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7cTDet_Consecutivo = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cTDet_Consecutivo", GXutil.ltrim( GXutil.str( AV7cTDet_Consecutivo, 18, 0)));
         }
         else
         {
            AV7cTDet_Consecutivo = localUtil.ctol( httpContext.cgiGet( edtavCtdet_consecutivo_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cTDet_Consecutivo", GXutil.ltrim( GXutil.str( AV7cTDet_Consecutivo, 18, 0)));
         }
         AV8cElem_Consecutivo = httpContext.cgiGet( edtavCelem_consecutivo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cElem_Consecutivo", AV8cElem_Consecutivo);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtdet_cantidad_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtdet_cantidad_Internalname), ",", ".") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCTDET_CANTIDAD");
            GX_FocusControl = edtavCtdet_cantidad_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9cTDet_Cantidad = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cTDet_Cantidad", GXutil.ltrim( GXutil.str( AV9cTDet_Cantidad, 10, 0)));
         }
         else
         {
            AV9cTDet_Cantidad = localUtil.ctol( httpContext.cgiGet( edtavCtdet_cantidad_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cTDet_Cantidad", GXutil.ltrim( GXutil.str( AV9cTDet_Cantidad, 10, 0)));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCtdet_valorunitario_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCtdet_valorunitario_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCTDET_VALORUNITARIO");
            GX_FocusControl = edtavCtdet_valorunitario_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10cTDet_ValorUnitario = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cTDet_ValorUnitario", GXutil.ltrim( GXutil.str( AV10cTDet_ValorUnitario, 18, 2)));
         }
         else
         {
            AV10cTDet_ValorUnitario = localUtil.ctond( httpContext.cgiGet( edtavCtdet_valorunitario_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cTDet_ValorUnitario", GXutil.ltrim( GXutil.str( AV10cTDet_ValorUnitario, 18, 2)));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCtdet_valortotal_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCtdet_valortotal_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCTDET_VALORTOTAL");
            GX_FocusControl = edtavCtdet_valortotal_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11cTDet_ValorTotal = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cTDet_ValorTotal", GXutil.ltrim( GXutil.str( AV11cTDet_ValorTotal, 18, 2)));
         }
         else
         {
            AV11cTDet_ValorTotal = localUtil.ctond( httpContext.cgiGet( edtavCtdet_valortotal_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cTDet_ValorTotal", GXutil.ltrim( GXutil.str( AV11cTDet_ValorTotal, 18, 2)));
         }
         AV12cTDet_PlacaNumero = httpContext.cgiGet( edtavCtdet_placanumero_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cTDet_PlacaNumero", AV12cTDet_PlacaNumero);
         /* Read saved values. */
         nRC_GXsfl_84 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_84"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCTRAN_ID"), ",", ".") != AV6cTran_Id )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCTDET_CONSECUTIVO"), ",", ".") != AV7cTDet_Consecutivo )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCELEM_CONSECUTIVO"), AV8cElem_Consecutivo) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCTDET_CANTIDAD"), ",", ".") != AV9cTDet_Cantidad )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( "GXH_vCTDET_VALORUNITARIO")), AV10cTDet_ValorUnitario) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( "GXH_vCTDET_VALORTOTAL")), AV11cTDet_ValorTotal) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTDET_PLACANUMERO"), AV12cTDet_PlacaNumero) != 0 )
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
      e198F2 ();
      if (returnInSub) return;
   }

   public void e198F2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "DETALLE TRANSACCIÓN", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV15ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e208F2( )
   {
      /* Load Routine */
      AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      AV18Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
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
      e218F2 ();
      if (returnInSub) return;
   }

   public void e218F2( )
   {
      /* Enter Routine */
      AV13pTran_Id = A46Tran_Id ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pTran_Id", GXutil.ltrim( GXutil.str( AV13pTran_Id, 11, 0)));
      AV14pTDet_Consecutivo = A69TDet_Consecutivo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14pTDet_Consecutivo", GXutil.ltrim( GXutil.str( AV14pTDet_Consecutivo, 18, 0)));
      httpContext.setWebReturnParms(new Object[] {new Long(AV13pTran_Id),new Long(AV14pTDet_Consecutivo)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV13pTran_Id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pTran_Id", GXutil.ltrim( GXutil.str( AV13pTran_Id, 11, 0)));
      AV14pTDet_Consecutivo = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14pTDet_Consecutivo", GXutil.ltrim( GXutil.str( AV14pTDet_Consecutivo, 18, 0)));
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
      pa8F2( ) ;
      ws8F2( ) ;
      we8F2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414242477");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gx00c0.js", "?201861414242479");
      /* End function include_jscripts */
   }

   public void subsflControlProps_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_idx ;
      edtTran_Id_Internalname = "TRAN_ID_"+sGXsfl_84_idx ;
      edtTDet_Consecutivo_Internalname = "TDET_CONSECUTIVO_"+sGXsfl_84_idx ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO_"+sGXsfl_84_idx ;
      edtTDet_Cantidad_Internalname = "TDET_CANTIDAD_"+sGXsfl_84_idx ;
      edtTDet_ValorUnitario_Internalname = "TDET_VALORUNITARIO_"+sGXsfl_84_idx ;
      edtTDet_ValorTotal_Internalname = "TDET_VALORTOTAL_"+sGXsfl_84_idx ;
      edtTDet_EsPadre_Internalname = "TDET_ESPADRE_"+sGXsfl_84_idx ;
      edtTDet_Atributos_Internalname = "TDET_ATRIBUTOS_"+sGXsfl_84_idx ;
   }

   public void subsflControlProps_fel_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_fel_idx ;
      edtTran_Id_Internalname = "TRAN_ID_"+sGXsfl_84_fel_idx ;
      edtTDet_Consecutivo_Internalname = "TDET_CONSECUTIVO_"+sGXsfl_84_fel_idx ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO_"+sGXsfl_84_fel_idx ;
      edtTDet_Cantidad_Internalname = "TDET_CANTIDAD_"+sGXsfl_84_fel_idx ;
      edtTDet_ValorUnitario_Internalname = "TDET_VALORUNITARIO_"+sGXsfl_84_fel_idx ;
      edtTDet_ValorTotal_Internalname = "TDET_VALORTOTAL_"+sGXsfl_84_fel_idx ;
      edtTDet_EsPadre_Internalname = "TDET_ESPADRE_"+sGXsfl_84_fel_idx ;
      edtTDet_Atributos_Internalname = "TDET_ATRIBUTOS_"+sGXsfl_84_fel_idx ;
   }

   public void sendrow_842( )
   {
      subsflControlProps_842( ) ;
      wb8F0( ) ;
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
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ",", "")))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A69TDet_Consecutivo, (byte)(18), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link, !bGXsfl_84_Refreshing);
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV5LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV5LinkSelection)==0)&&(GXutil.strcmp("", AV18Linkselection_GXI)==0))||!(GXutil.strcmp("", AV5LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV18Linkselection_GXI : httpContext.getResourceRelative(AV5LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV5LinkSelection_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_Id_Internalname,GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A46Tran_Id), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_Id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_Consecutivo_Internalname,GXutil.ltrim( localUtil.ntoc( A69TDet_Consecutivo, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A69TDet_Consecutivo), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTDet_Consecutivo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtElem_Consecutivo_Internalname,A66Elem_Consecutivo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtElem_Consecutivo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         edtTDet_Cantidad_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ",", "")))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A69TDet_Consecutivo, (byte)(18), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtTDet_Cantidad_Internalname, "Link", edtTDet_Cantidad_Link, !bGXsfl_84_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_Cantidad_Internalname,GXutil.ltrim( localUtil.ntoc( A487TDet_Cantidad, (byte)(10), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A487TDet_Cantidad), "ZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'",edtTDet_Cantidad_Link,"","","",edtTDet_Cantidad_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_ValorUnitario_Internalname,GXutil.ltrim( localUtil.ntoc( A488TDet_ValorUnitario, (byte)(22), (byte)(2), ",", "")),localUtil.format( A488TDet_ValorUnitario, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTDet_ValorUnitario_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(22),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_ValorTotal_Internalname,GXutil.ltrim( localUtil.ntoc( A489TDet_ValorTotal, (byte)(22), (byte)(2), ",", "")),localUtil.format( A489TDet_ValorTotal, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTDet_ValorTotal_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(22),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_EsPadre_Internalname,A505TDet_EsPadre,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTDet_EsPadre_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_Atributos_Internalname,A525TDet_Atributos,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTDet_Atributos_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_ID"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A46Tran_Id), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_CONSECUTIVO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A69TDet_Consecutivo), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_CONSECUTIVO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_CANTIDAD"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A487TDet_Cantidad), "ZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_VALORUNITARIO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( A488TDet_ValorUnitario, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_VALORTOTAL"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( A489TDet_ValorTotal, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_ESPADRE"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A505TDet_EsPadre, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_ATRIBUTOS"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A525TDet_Atributos, ""))));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_84_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_84_idx+1)) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      /* End function sendrow_842 */
   }

   public void init_default_properties( )
   {
      lblLbltran_idfilter_Internalname = "LBLTRAN_IDFILTER" ;
      edtavCtran_id_Internalname = "vCTRAN_ID" ;
      divTran_idfiltercontainer_Internalname = "TRAN_IDFILTERCONTAINER" ;
      lblLbltdet_consecutivofilter_Internalname = "LBLTDET_CONSECUTIVOFILTER" ;
      edtavCtdet_consecutivo_Internalname = "vCTDET_CONSECUTIVO" ;
      divTdet_consecutivofiltercontainer_Internalname = "TDET_CONSECUTIVOFILTERCONTAINER" ;
      lblLblelem_consecutivofilter_Internalname = "LBLELEM_CONSECUTIVOFILTER" ;
      edtavCelem_consecutivo_Internalname = "vCELEM_CONSECUTIVO" ;
      divElem_consecutivofiltercontainer_Internalname = "ELEM_CONSECUTIVOFILTERCONTAINER" ;
      lblLbltdet_cantidadfilter_Internalname = "LBLTDET_CANTIDADFILTER" ;
      edtavCtdet_cantidad_Internalname = "vCTDET_CANTIDAD" ;
      divTdet_cantidadfiltercontainer_Internalname = "TDET_CANTIDADFILTERCONTAINER" ;
      lblLbltdet_valorunitariofilter_Internalname = "LBLTDET_VALORUNITARIOFILTER" ;
      edtavCtdet_valorunitario_Internalname = "vCTDET_VALORUNITARIO" ;
      divTdet_valorunitariofiltercontainer_Internalname = "TDET_VALORUNITARIOFILTERCONTAINER" ;
      lblLbltdet_valortotalfilter_Internalname = "LBLTDET_VALORTOTALFILTER" ;
      edtavCtdet_valortotal_Internalname = "vCTDET_VALORTOTAL" ;
      divTdet_valortotalfiltercontainer_Internalname = "TDET_VALORTOTALFILTERCONTAINER" ;
      lblLbltdet_placanumerofilter_Internalname = "LBLTDET_PLACANUMEROFILTER" ;
      edtavCtdet_placanumero_Internalname = "vCTDET_PLACANUMERO" ;
      divTdet_placanumerofiltercontainer_Internalname = "TDET_PLACANUMEROFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtTran_Id_Internalname = "TRAN_ID" ;
      edtTDet_Consecutivo_Internalname = "TDET_CONSECUTIVO" ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO" ;
      edtTDet_Cantidad_Internalname = "TDET_CANTIDAD" ;
      edtTDet_ValorUnitario_Internalname = "TDET_VALORUNITARIO" ;
      edtTDet_ValorTotal_Internalname = "TDET_VALORTOTAL" ;
      edtTDet_EsPadre_Internalname = "TDET_ESPADRE" ;
      edtTDet_Atributos_Internalname = "TDET_ATRIBUTOS" ;
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
      edtTDet_Atributos_Jsonclick = "" ;
      edtTDet_EsPadre_Jsonclick = "" ;
      edtTDet_ValorTotal_Jsonclick = "" ;
      edtTDet_ValorUnitario_Jsonclick = "" ;
      edtTDet_Cantidad_Jsonclick = "" ;
      edtElem_Consecutivo_Jsonclick = "" ;
      edtTDet_Consecutivo_Jsonclick = "" ;
      edtTran_Id_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtTDet_Cantidad_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCtdet_placanumero_Jsonclick = "" ;
      edtavCtdet_placanumero_Enabled = 1 ;
      edtavCtdet_placanumero_Visible = 1 ;
      edtavCtdet_valortotal_Jsonclick = "" ;
      edtavCtdet_valortotal_Enabled = 1 ;
      edtavCtdet_valortotal_Visible = 1 ;
      edtavCtdet_valorunitario_Jsonclick = "" ;
      edtavCtdet_valorunitario_Enabled = 1 ;
      edtavCtdet_valorunitario_Visible = 1 ;
      edtavCtdet_cantidad_Jsonclick = "" ;
      edtavCtdet_cantidad_Enabled = 1 ;
      edtavCtdet_cantidad_Visible = 1 ;
      edtavCelem_consecutivo_Jsonclick = "" ;
      edtavCelem_consecutivo_Enabled = 1 ;
      edtavCelem_consecutivo_Visible = 1 ;
      edtavCtdet_consecutivo_Jsonclick = "" ;
      edtavCtdet_consecutivo_Enabled = 1 ;
      edtavCtdet_consecutivo_Visible = 1 ;
      edtavCtran_id_Jsonclick = "" ;
      edtavCtran_id_Enabled = 1 ;
      edtavCtran_id_Visible = 1 ;
      divTdet_placanumerofiltercontainer_Class = "AdvancedContainerItem" ;
      divTdet_valortotalfiltercontainer_Class = "AdvancedContainerItem" ;
      divTdet_valorunitariofiltercontainer_Class = "AdvancedContainerItem" ;
      divTdet_cantidadfiltercontainer_Class = "AdvancedContainerItem" ;
      divElem_consecutivofiltercontainer_Class = "AdvancedContainerItem" ;
      divTdet_consecutivofiltercontainer_Class = "AdvancedContainerItem" ;
      divTran_idfiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List DETALLE TRANSACCIÓN" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cTran_Id',fld:'vCTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cTDet_Consecutivo',fld:'vCTDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV8cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV9cTDet_Cantidad',fld:'vCTDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'AV10cTDet_ValorUnitario',fld:'vCTDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV11cTDet_ValorTotal',fld:'vCTDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV12cTDet_PlacaNumero',fld:'vCTDET_PLACANUMERO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e188F1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLTRAN_IDFILTER.CLICK","{handler:'e118F1',iparms:[{av:'divTran_idfiltercontainer_Class',ctrl:'TRAN_IDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTran_idfiltercontainer_Class',ctrl:'TRAN_IDFILTERCONTAINER',prop:'Class'},{av:'edtavCtran_id_Visible',ctrl:'vCTRAN_ID',prop:'Visible'}]}");
      setEventMetadata("LBLTDET_CONSECUTIVOFILTER.CLICK","{handler:'e128F1',iparms:[{av:'divTdet_consecutivofiltercontainer_Class',ctrl:'TDET_CONSECUTIVOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTdet_consecutivofiltercontainer_Class',ctrl:'TDET_CONSECUTIVOFILTERCONTAINER',prop:'Class'},{av:'edtavCtdet_consecutivo_Visible',ctrl:'vCTDET_CONSECUTIVO',prop:'Visible'}]}");
      setEventMetadata("LBLELEM_CONSECUTIVOFILTER.CLICK","{handler:'e138F1',iparms:[{av:'divElem_consecutivofiltercontainer_Class',ctrl:'ELEM_CONSECUTIVOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divElem_consecutivofiltercontainer_Class',ctrl:'ELEM_CONSECUTIVOFILTERCONTAINER',prop:'Class'},{av:'edtavCelem_consecutivo_Visible',ctrl:'vCELEM_CONSECUTIVO',prop:'Visible'}]}");
      setEventMetadata("LBLTDET_CANTIDADFILTER.CLICK","{handler:'e148F1',iparms:[{av:'divTdet_cantidadfiltercontainer_Class',ctrl:'TDET_CANTIDADFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTdet_cantidadfiltercontainer_Class',ctrl:'TDET_CANTIDADFILTERCONTAINER',prop:'Class'},{av:'edtavCtdet_cantidad_Visible',ctrl:'vCTDET_CANTIDAD',prop:'Visible'}]}");
      setEventMetadata("LBLTDET_VALORUNITARIOFILTER.CLICK","{handler:'e158F1',iparms:[{av:'divTdet_valorunitariofiltercontainer_Class',ctrl:'TDET_VALORUNITARIOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTdet_valorunitariofiltercontainer_Class',ctrl:'TDET_VALORUNITARIOFILTERCONTAINER',prop:'Class'},{av:'edtavCtdet_valorunitario_Visible',ctrl:'vCTDET_VALORUNITARIO',prop:'Visible'}]}");
      setEventMetadata("LBLTDET_VALORTOTALFILTER.CLICK","{handler:'e168F1',iparms:[{av:'divTdet_valortotalfiltercontainer_Class',ctrl:'TDET_VALORTOTALFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTdet_valortotalfiltercontainer_Class',ctrl:'TDET_VALORTOTALFILTERCONTAINER',prop:'Class'},{av:'edtavCtdet_valortotal_Visible',ctrl:'vCTDET_VALORTOTAL',prop:'Visible'}]}");
      setEventMetadata("LBLTDET_PLACANUMEROFILTER.CLICK","{handler:'e178F1',iparms:[{av:'divTdet_placanumerofiltercontainer_Class',ctrl:'TDET_PLACANUMEROFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTdet_placanumerofiltercontainer_Class',ctrl:'TDET_PLACANUMEROFILTERCONTAINER',prop:'Class'},{av:'edtavCtdet_placanumero_Visible',ctrl:'vCTDET_PLACANUMERO',prop:'Visible'}]}");
      setEventMetadata("ENTER","{handler:'e218F2',iparms:[{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[{av:'AV13pTran_Id',fld:'vPTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV14pTDet_Consecutivo',fld:'vPTDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cTran_Id',fld:'vCTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cTDet_Consecutivo',fld:'vCTDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV8cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV9cTDet_Cantidad',fld:'vCTDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'AV10cTDet_ValorUnitario',fld:'vCTDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV11cTDet_ValorTotal',fld:'vCTDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV12cTDet_PlacaNumero',fld:'vCTDET_PLACANUMERO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cTran_Id',fld:'vCTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cTDet_Consecutivo',fld:'vCTDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV8cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV9cTDet_Cantidad',fld:'vCTDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'AV10cTDet_ValorUnitario',fld:'vCTDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV11cTDet_ValorTotal',fld:'vCTDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV12cTDet_PlacaNumero',fld:'vCTDET_PLACANUMERO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cTran_Id',fld:'vCTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cTDet_Consecutivo',fld:'vCTDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV8cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV9cTDet_Cantidad',fld:'vCTDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'AV10cTDet_ValorUnitario',fld:'vCTDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV11cTDet_ValorTotal',fld:'vCTDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV12cTDet_PlacaNumero',fld:'vCTDET_PLACANUMERO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cTran_Id',fld:'vCTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cTDet_Consecutivo',fld:'vCTDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV8cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV9cTDet_Cantidad',fld:'vCTDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'AV10cTDet_ValorUnitario',fld:'vCTDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV11cTDet_ValorTotal',fld:'vCTDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV12cTDet_PlacaNumero',fld:'vCTDET_PLACANUMERO',pic:'',nv:''}],oparms:[]}");
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
      AV8cElem_Consecutivo = "" ;
      AV10cTDet_ValorUnitario = DecimalUtil.ZERO ;
      AV11cTDet_ValorTotal = DecimalUtil.ZERO ;
      AV12cTDet_PlacaNumero = "" ;
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLbltran_idfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLbltdet_consecutivofilter_Jsonclick = "" ;
      lblLblelem_consecutivofilter_Jsonclick = "" ;
      lblLbltdet_cantidadfilter_Jsonclick = "" ;
      lblLbltdet_valorunitariofilter_Jsonclick = "" ;
      lblLbltdet_valortotalfilter_Jsonclick = "" ;
      lblLbltdet_placanumerofilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A66Elem_Consecutivo = "" ;
      A488TDet_ValorUnitario = DecimalUtil.ZERO ;
      A489TDet_ValorTotal = DecimalUtil.ZERO ;
      A505TDet_EsPadre = "" ;
      A525TDet_Atributos = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV18Linkselection_GXI = "" ;
      scmdbuf = "" ;
      lV8cElem_Consecutivo = "" ;
      lV12cTDet_PlacaNumero = "" ;
      A490TDet_PlacaNumero = "" ;
      H008F2_A490TDet_PlacaNumero = new String[] {""} ;
      H008F2_n490TDet_PlacaNumero = new boolean[] {false} ;
      H008F2_A525TDet_Atributos = new String[] {""} ;
      H008F2_A505TDet_EsPadre = new String[] {""} ;
      H008F2_A489TDet_ValorTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H008F2_A488TDet_ValorUnitario = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H008F2_A487TDet_Cantidad = new long[1] ;
      H008F2_A66Elem_Consecutivo = new String[] {""} ;
      H008F2_A69TDet_Consecutivo = new long[1] ;
      H008F2_A46Tran_Id = new long[1] ;
      H008F3_AGRID1_nRecordCount = new long[1] ;
      AV15ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.gx00c0__default(),
         new Object[] {
             new Object[] {
            H008F2_A490TDet_PlacaNumero, H008F2_n490TDet_PlacaNumero, H008F2_A525TDet_Atributos, H008F2_A505TDet_EsPadre, H008F2_A489TDet_ValorTotal, H008F2_A488TDet_ValorUnitario, H008F2_A487TDet_Cantidad, H008F2_A66Elem_Consecutivo, H008F2_A69TDet_Consecutivo, H008F2_A46Tran_Id
            }
            , new Object[] {
            H008F3_AGRID1_nRecordCount
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
   private int edtavCtran_id_Enabled ;
   private int edtavCtran_id_Visible ;
   private int edtavCtdet_consecutivo_Enabled ;
   private int edtavCtdet_consecutivo_Visible ;
   private int edtavCelem_consecutivo_Visible ;
   private int edtavCelem_consecutivo_Enabled ;
   private int edtavCtdet_cantidad_Enabled ;
   private int edtavCtdet_cantidad_Visible ;
   private int edtavCtdet_valorunitario_Enabled ;
   private int edtavCtdet_valorunitario_Visible ;
   private int edtavCtdet_valortotal_Enabled ;
   private int edtavCtdet_valortotal_Visible ;
   private int edtavCtdet_placanumero_Visible ;
   private int edtavCtdet_placanumero_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long AV6cTran_Id ;
   private long AV7cTDet_Consecutivo ;
   private long AV9cTDet_Cantidad ;
   private long AV13pTran_Id ;
   private long AV14pTDet_Consecutivo ;
   private long GRID1_nFirstRecordOnPage ;
   private long A46Tran_Id ;
   private long A69TDet_Consecutivo ;
   private long A487TDet_Cantidad ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private java.math.BigDecimal AV10cTDet_ValorUnitario ;
   private java.math.BigDecimal AV11cTDet_ValorTotal ;
   private java.math.BigDecimal A488TDet_ValorUnitario ;
   private java.math.BigDecimal A489TDet_ValorTotal ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divTran_idfiltercontainer_Class ;
   private String divTdet_consecutivofiltercontainer_Class ;
   private String divElem_consecutivofiltercontainer_Class ;
   private String divTdet_cantidadfiltercontainer_Class ;
   private String divTdet_valorunitariofiltercontainer_Class ;
   private String divTdet_valortotalfiltercontainer_Class ;
   private String divTdet_placanumerofiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_84_idx="0001" ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divTran_idfiltercontainer_Internalname ;
   private String lblLbltran_idfilter_Internalname ;
   private String lblLbltran_idfilter_Jsonclick ;
   private String edtavCtran_id_Internalname ;
   private String TempTags ;
   private String edtavCtran_id_Jsonclick ;
   private String divTdet_consecutivofiltercontainer_Internalname ;
   private String lblLbltdet_consecutivofilter_Internalname ;
   private String lblLbltdet_consecutivofilter_Jsonclick ;
   private String edtavCtdet_consecutivo_Internalname ;
   private String edtavCtdet_consecutivo_Jsonclick ;
   private String divElem_consecutivofiltercontainer_Internalname ;
   private String lblLblelem_consecutivofilter_Internalname ;
   private String lblLblelem_consecutivofilter_Jsonclick ;
   private String edtavCelem_consecutivo_Internalname ;
   private String edtavCelem_consecutivo_Jsonclick ;
   private String divTdet_cantidadfiltercontainer_Internalname ;
   private String lblLbltdet_cantidadfilter_Internalname ;
   private String lblLbltdet_cantidadfilter_Jsonclick ;
   private String edtavCtdet_cantidad_Internalname ;
   private String edtavCtdet_cantidad_Jsonclick ;
   private String divTdet_valorunitariofiltercontainer_Internalname ;
   private String lblLbltdet_valorunitariofilter_Internalname ;
   private String lblLbltdet_valorunitariofilter_Jsonclick ;
   private String edtavCtdet_valorunitario_Internalname ;
   private String edtavCtdet_valorunitario_Jsonclick ;
   private String divTdet_valortotalfiltercontainer_Internalname ;
   private String lblLbltdet_valortotalfilter_Internalname ;
   private String lblLbltdet_valortotalfilter_Jsonclick ;
   private String edtavCtdet_valortotal_Internalname ;
   private String edtavCtdet_valortotal_Jsonclick ;
   private String divTdet_placanumerofiltercontainer_Internalname ;
   private String lblLbltdet_placanumerofilter_Internalname ;
   private String lblLbltdet_placanumerofilter_Jsonclick ;
   private String edtavCtdet_placanumero_Internalname ;
   private String edtavCtdet_placanumero_Jsonclick ;
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
   private String edtTDet_Cantidad_Link ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtTran_Id_Internalname ;
   private String edtTDet_Consecutivo_Internalname ;
   private String edtElem_Consecutivo_Internalname ;
   private String edtTDet_Cantidad_Internalname ;
   private String edtTDet_ValorUnitario_Internalname ;
   private String edtTDet_ValorTotal_Internalname ;
   private String edtTDet_EsPadre_Internalname ;
   private String edtTDet_Atributos_Internalname ;
   private String scmdbuf ;
   private String AV15ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_84_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtTran_Id_Jsonclick ;
   private String edtTDet_Consecutivo_Jsonclick ;
   private String edtElem_Consecutivo_Jsonclick ;
   private String edtTDet_Cantidad_Jsonclick ;
   private String edtTDet_ValorUnitario_Jsonclick ;
   private String edtTDet_ValorTotal_Jsonclick ;
   private String edtTDet_EsPadre_Jsonclick ;
   private String edtTDet_Atributos_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_84_Refreshing=false ;
   private boolean n490TDet_PlacaNumero ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV8cElem_Consecutivo ;
   private String AV12cTDet_PlacaNumero ;
   private String A66Elem_Consecutivo ;
   private String A505TDet_EsPadre ;
   private String A525TDet_Atributos ;
   private String AV18Linkselection_GXI ;
   private String lV8cElem_Consecutivo ;
   private String lV12cTDet_PlacaNumero ;
   private String A490TDet_PlacaNumero ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private String[] H008F2_A490TDet_PlacaNumero ;
   private boolean[] H008F2_n490TDet_PlacaNumero ;
   private String[] H008F2_A525TDet_Atributos ;
   private String[] H008F2_A505TDet_EsPadre ;
   private java.math.BigDecimal[] H008F2_A489TDet_ValorTotal ;
   private java.math.BigDecimal[] H008F2_A488TDet_ValorUnitario ;
   private long[] H008F2_A487TDet_Cantidad ;
   private String[] H008F2_A66Elem_Consecutivo ;
   private long[] H008F2_A69TDet_Consecutivo ;
   private long[] H008F2_A46Tran_Id ;
   private long[] H008F3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx00c0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H008F2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV8cElem_Consecutivo ,
                                          long AV9cTDet_Cantidad ,
                                          java.math.BigDecimal AV10cTDet_ValorUnitario ,
                                          java.math.BigDecimal AV11cTDet_ValorTotal ,
                                          String AV12cTDet_PlacaNumero ,
                                          String A66Elem_Consecutivo ,
                                          long A487TDet_Cantidad ,
                                          java.math.BigDecimal A488TDet_ValorUnitario ,
                                          java.math.BigDecimal A489TDet_ValorTotal ,
                                          String A490TDet_PlacaNumero ,
                                          long AV6cTran_Id ,
                                          long AV7cTDet_Consecutivo )
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
      sSelectString = " /*+ FIRST_ROWS(11) */ TDet_PlacaNumero, TDet_Atributos, TDet_EsPadre, TDet_ValorTotal," ;
      sSelectString = sSelectString + " TDet_ValorUnitario, TDet_Cantidad, Elem_Consecutivo, TDet_Consecutivo, Tran_Id" ;
      sFromString = " FROM ALM_DETALLE_TRANSACCION" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (Tran_Id >= ? and TDet_Consecutivo >= ?)" ;
      if ( ! (GXutil.strcmp("", AV8cElem_Consecutivo)==0) )
      {
         sWhereString = sWhereString + " and (Elem_Consecutivo like ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (0==AV9cTDet_Cantidad) )
      {
         sWhereString = sWhereString + " and (TDet_Cantidad >= ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV10cTDet_ValorUnitario)==0) )
      {
         sWhereString = sWhereString + " and (TDet_ValorUnitario >= ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV11cTDet_ValorTotal)==0) )
      {
         sWhereString = sWhereString + " and (TDet_ValorTotal >= ?)" ;
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12cTDet_PlacaNumero)==0) )
      {
         sWhereString = sWhereString + " and (TDet_PlacaNumero like ?)" ;
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY Tran_Id, TDet_Consecutivo" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT (CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H008F3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV8cElem_Consecutivo ,
                                          long AV9cTDet_Cantidad ,
                                          java.math.BigDecimal AV10cTDet_ValorUnitario ,
                                          java.math.BigDecimal AV11cTDet_ValorTotal ,
                                          String AV12cTDet_PlacaNumero ,
                                          String A66Elem_Consecutivo ,
                                          long A487TDet_Cantidad ,
                                          java.math.BigDecimal A488TDet_ValorUnitario ,
                                          java.math.BigDecimal A489TDet_ValorTotal ,
                                          String A490TDet_PlacaNumero ,
                                          long AV6cTran_Id ,
                                          long AV7cTDet_Consecutivo )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [7] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM ALM_DETALLE_TRANSACCION" ;
      scmdbuf = scmdbuf + " WHERE (Tran_Id >= ? and TDet_Consecutivo >= ?)" ;
      if ( ! (GXutil.strcmp("", AV8cElem_Consecutivo)==0) )
      {
         sWhereString = sWhereString + " and (Elem_Consecutivo like ?)" ;
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (0==AV9cTDet_Cantidad) )
      {
         sWhereString = sWhereString + " and (TDet_Cantidad >= ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV10cTDet_ValorUnitario)==0) )
      {
         sWhereString = sWhereString + " and (TDet_ValorUnitario >= ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV11cTDet_ValorTotal)==0) )
      {
         sWhereString = sWhereString + " and (TDet_ValorTotal >= ?)" ;
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12cTDet_PlacaNumero)==0) )
      {
         sWhereString = sWhereString + " and (TDet_PlacaNumero like ?)" ;
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
                  return conditional_H008F2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).longValue() , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).longValue() , ((Number) dynConstraints[11]).longValue() );
            case 1 :
                  return conditional_H008F3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).longValue() , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).longValue() , ((Number) dynConstraints[11]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H008F2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H008F3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2) ;
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2) ;
               ((long[]) buf[6])[0] = rslt.getLong(6) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((long[]) buf[8])[0] = rslt.getLong(8) ;
               ((long[]) buf[9])[0] = rslt.getLong(9) ;
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
                  stmt.setBigDecimal(sIdx, ((Number) parms[11]).longValue(), 0);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 9);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[13]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 30);
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
                  stmt.setBigDecimal(sIdx, ((Number) parms[8]).longValue(), 0);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 9);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 30);
               }
               return;
      }
   }

}

