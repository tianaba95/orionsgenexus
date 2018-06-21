/*
               File: alm_detalle_transacciongeneral_impl
        Description: ALM_DETALLE_TRANSACCIONGeneral
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:14:54.68
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

public final  class alm_detalle_transacciongeneral_impl extends GXWebComponent
{
   public alm_detalle_transacciongeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_detalle_transacciongeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_detalle_transacciongeneral_impl.class ));
   }

   public alm_detalle_transacciongeneral_impl( int remoteHandle ,
                                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void setPrefix( String sPPrefix )
   {
      sPrefix = sPPrefix;
   }

   protected void createObjects( )
   {
      cmbTran_IndE_S = new HTMLChoice();
   }

   public void initweb( )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.setDefaultTheme("Carmine");
      }
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
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
            else if ( GXutil.strcmp(gxfirstwebparm, "dyncomponent") == 0 )
            {
               httpContext.setAjaxEventMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               nDynComponent = (byte)(1) ;
               sCompPrefix = httpContext.GetNextPar( ) ;
               sSFPrefix = httpContext.GetNextPar( ) ;
               A46Tran_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
               A69TDet_Consecutivo = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A69TDet_Consecutivo", GXutil.ltrim( GXutil.str( A69TDet_Consecutivo, 18, 0)));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,new Long(A46Tran_Id),new Long(A69TDet_Consecutivo)});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
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
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isLocalStorageSupported( ) )
         {
            httpContext.pushCurrentUrl();
         }
      }
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa212( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            validateSpaRequest();
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( ! isAjaxCallMode( ) )
            {
               if ( nDynComponent == 0 )
               {
                  httpContext.sendError( 404 );
                  GXutil.writeLog("send_http_error_code 404");
                  GxWebError = (byte)(1) ;
               }
            }
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            if ( nDynComponent == 0 )
            {
               throw new RuntimeException("WebComponent is not allowed to run");
            }
         }
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
      cleanup();
   }

   public void renderHtmlHeaders( )
   {
      com.orions2.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
         httpContext.writeText( "<title>") ;
         httpContext.writeValue( "ALM_DETALLE_TRANSACCIONGeneral") ;
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
      }
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414145475");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
         httpContext.writeText( "<body") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle = bodyStyle + ";-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_detalle_transacciongeneral") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A46Tran_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A69TDet_Consecutivo,18,0)))+"\">") ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" style=\"display:none\">") ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, "FORM", "Class", "form-horizontal Form", true);
      }
      else
      {
         httpContext.writeText( "<div") ;
         com.orions2.GxWebStd.classAttribute( httpContext, "gxwebcomponent-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
      }
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA46Tran_Id", GXutil.ltrim( localUtil.ntoc( wcpOA46Tran_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA69TDet_Consecutivo", GXutil.ltrim( localUtil.ntoc( wcpOA69TDet_Consecutivo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_CANTIDAD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A487TDet_Cantidad), "ZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_VALORUNITARIO", getSecureSignedToken( sPrefix, localUtil.format( A488TDet_ValorUnitario, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_VALORTOTAL", getSecureSignedToken( sPrefix, localUtil.format( A489TDet_ValorTotal, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_PLACANUMERO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A490TDet_PlacaNumero, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_PLACAPADRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A491TDet_PlacaPadre, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_OBSERVACIONES", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A504TDet_Observaciones, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_ESPADRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A505TDet_EsPadre, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_ATRIBUTOS", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A525TDet_Atributos, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ELEM_CONSECUTIVO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_VALOR_PRESENTE", getSecureSignedToken( sPrefix, localUtil.format( A653TDet_Valor_Presente, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_VALOR_FUTURO", getSecureSignedToken( sPrefix, localUtil.format( A654TDet_Valor_Futuro, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_TAZA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A655TDet_Taza), "ZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_PLAZO_N", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A656TDet_Plazo_N), "Z9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_OTROS_COSTOS", getSecureSignedToken( sPrefix, localUtil.format( A657TDet_Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_AGRUPADO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A658TDet_Agrupado), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TDET_PLACARECUPERADA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A817TDet_PlacaRecuperada, ""))));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm212( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("alm_detalle_transacciongeneral.js", "?201861414145479");
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GX_FocusControl", GX_FocusControl);
      define_styles( ) ;
      sendSecurityToken(sPrefix);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.SendAjaxEncryptionKey();
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
         httpContext.writeTextNL( "</body>") ;
         httpContext.writeTextNL( "</html>") ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
      }
      else
      {
         httpContext.SendWebComponentState();
         httpContext.writeText( "</div>") ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
   }

   public String getPgmname( )
   {
      return "ALM_DETALLE_TRANSACCIONGeneral" ;
   }

   public String getPgmdesc( )
   {
      return "ALM_DETALLE_TRANSACCIONGeneral" ;
   }

   public void wb210( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( GXutil.len( sPrefix) == 0 )
         {
            renderHtmlHeaders( ) ;
         }
         renderHtmlOpenForm( ) ;
         if ( GXutil.len( sPrefix) != 0 )
         {
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.alm_detalle_transacciongeneral");
         }
         com.orions2.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", sPrefix, "false");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewActionsCell", "Center", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group WWViewActions", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", "Modificar", bttBtnupdate_Jsonclick, 7, "Modificar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e11211_client"+"'", TempTags, "", 2, "HLP_ALM_DETALLE_TRANSACCIONGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", "Eliminar", bttBtndelete_Jsonclick, 7, "Eliminar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e12211_client"+"'", TempTags, "", 2, "HLP_ALM_DETALLE_TRANSACCIONGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divAttributestable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_Id_Internalname, "Identificador", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ",", "")), ((edtTran_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A46Tran_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A46Tran_Id), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_Id_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_DETALLE_TRANSACCIONGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTDet_Consecutivo_Internalname, "Item", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTDet_Consecutivo_Internalname, GXutil.ltrim( localUtil.ntoc( A69TDet_Consecutivo, (byte)(18), (byte)(0), ",", "")), ((edtTDet_Consecutivo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A69TDet_Consecutivo), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A69TDet_Consecutivo), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTDet_Consecutivo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTDet_Consecutivo_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DETALLE_TRANSACCIONGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTDet_Cantidad_Internalname, "Cantidad", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTDet_Cantidad_Internalname, GXutil.ltrim( localUtil.ntoc( A487TDet_Cantidad, (byte)(10), (byte)(0), ",", "")), ((edtTDet_Cantidad_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A487TDet_Cantidad), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A487TDet_Cantidad), "ZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTDet_Cantidad_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTDet_Cantidad_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DETALLE_TRANSACCIONGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTDet_ValorUnitario_Internalname, "Unitario", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTDet_ValorUnitario_Internalname, GXutil.ltrim( localUtil.ntoc( A488TDet_ValorUnitario, (byte)(22), (byte)(2), ",", "")), ((edtTDet_ValorUnitario_Enabled!=0) ? GXutil.ltrim( localUtil.format( A488TDet_ValorUnitario, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A488TDet_ValorUnitario, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTDet_ValorUnitario_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTDet_ValorUnitario_Enabled, 0, "text", "", 22, "chr", 1, "row", 22, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DETALLE_TRANSACCIONGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTDet_ValorTotal_Internalname, "Total", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTDet_ValorTotal_Internalname, GXutil.ltrim( localUtil.ntoc( A489TDet_ValorTotal, (byte)(22), (byte)(2), ",", "")), ((edtTDet_ValorTotal_Enabled!=0) ? GXutil.ltrim( localUtil.format( A489TDet_ValorTotal, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A489TDet_ValorTotal, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTDet_ValorTotal_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTDet_ValorTotal_Enabled, 0, "text", "", 22, "chr", 1, "row", 22, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DETALLE_TRANSACCIONGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTDet_PlacaNumero_Internalname, "Placa", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTDet_PlacaNumero_Internalname, A490TDet_PlacaNumero, GXutil.rtrim( localUtil.format( A490TDet_PlacaNumero, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTDet_PlacaNumero_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTDet_PlacaNumero_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_DETALLE_TRANSACCIONGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTDet_PlacaPadre_Internalname, "Padre", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTDet_PlacaPadre_Internalname, A491TDet_PlacaPadre, GXutil.rtrim( localUtil.format( A491TDet_PlacaPadre, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTDet_PlacaPadre_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTDet_PlacaPadre_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_DETALLE_TRANSACCIONGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTDet_Observaciones_Internalname, "Observaciones", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Multiple line edit */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtTDet_Observaciones_Internalname, A504TDet_Observaciones, "", "", (short)(0), 1, edtTDet_Observaciones_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_DETALLE_TRANSACCIONGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTDet_EsPadre_Internalname, "es Padre", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTDet_EsPadre_Internalname, A505TDet_EsPadre, GXutil.rtrim( localUtil.format( A505TDet_EsPadre, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTDet_EsPadre_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTDet_EsPadre_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_DETALLE_TRANSACCIONGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTDet_Atributos_Internalname, "TDet_Atributos", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTDet_Atributos_Internalname, A525TDet_Atributos, GXutil.rtrim( localUtil.format( A525TDet_Atributos, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTDet_Atributos_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTDet_Atributos_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_DETALLE_TRANSACCIONGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtElem_Consecutivo_Internalname, "Consecutivo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtElem_Consecutivo_Internalname, A66Elem_Consecutivo, GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtElem_Consecutivo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtElem_Consecutivo_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_DETALLE_TRANSACCIONGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtElem_Descripcion_Internalname, "Descripción", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Multiple line edit */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtElem_Descripcion_Internalname, A557Elem_Descripcion, "", "", (short)(0), 1, edtElem_Descripcion_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_DETALLE_TRANSACCIONGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCata_Descripcion_Internalname, "Descripción del bien", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Multiple line edit */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtCata_Descripcion_Internalname, A298Cata_Descripcion, edtCata_Descripcion_Link, "", (short)(0), 1, edtCata_Descripcion_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_DETALLE_TRANSACCIONGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTDet_Valor_Presente_Internalname, "Presente", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTDet_Valor_Presente_Internalname, GXutil.ltrim( localUtil.ntoc( A653TDet_Valor_Presente, (byte)(24), (byte)(2), ",", "")), ((edtTDet_Valor_Presente_Enabled!=0) ? GXutil.ltrim( localUtil.format( A653TDet_Valor_Presente, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A653TDet_Valor_Presente, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTDet_Valor_Presente_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTDet_Valor_Presente_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_ALM_DETALLE_TRANSACCIONGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTDet_Valor_Futuro_Internalname, "Futuro", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTDet_Valor_Futuro_Internalname, GXutil.ltrim( localUtil.ntoc( A654TDet_Valor_Futuro, (byte)(24), (byte)(2), ",", "")), ((edtTDet_Valor_Futuro_Enabled!=0) ? GXutil.ltrim( localUtil.format( A654TDet_Valor_Futuro, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A654TDet_Valor_Futuro, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTDet_Valor_Futuro_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTDet_Valor_Futuro_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_ALM_DETALLE_TRANSACCIONGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTDet_Taza_Internalname, "Taza", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTDet_Taza_Internalname, GXutil.ltrim( localUtil.ntoc( A655TDet_Taza, (byte)(3), (byte)(0), ",", "")), ((edtTDet_Taza_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A655TDet_Taza), "ZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A655TDet_Taza), "ZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTDet_Taza_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTDet_Taza_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DETALLE_TRANSACCIONGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTDet_Plazo_N_Internalname, "N", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTDet_Plazo_N_Internalname, GXutil.ltrim( localUtil.ntoc( A656TDet_Plazo_N, (byte)(2), (byte)(0), ",", "")), ((edtTDet_Plazo_N_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A656TDet_Plazo_N), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A656TDet_Plazo_N), "Z9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTDet_Plazo_N_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTDet_Plazo_N_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DETALLE_TRANSACCIONGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTDet_Otros_Costos_Internalname, "Costos", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTDet_Otros_Costos_Internalname, GXutil.ltrim( localUtil.ntoc( A657TDet_Otros_Costos, (byte)(24), (byte)(2), ",", "")), ((edtTDet_Otros_Costos_Enabled!=0) ? GXutil.ltrim( localUtil.format( A657TDet_Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A657TDet_Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTDet_Otros_Costos_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTDet_Otros_Costos_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_ALM_DETALLE_TRANSACCIONGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTDet_Agrupado_Internalname, "Grupo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTDet_Agrupado_Internalname, GXutil.ltrim( localUtil.ntoc( A658TDet_Agrupado, (byte)(4), (byte)(0), ",", "")), ((edtTDet_Agrupado_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A658TDet_Agrupado), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A658TDet_Agrupado), "ZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTDet_Agrupado_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTDet_Agrupado_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DETALLE_TRANSACCIONGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtSEG_Codigo_Internalname, "Segmento Codigo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtSEG_Codigo_Internalname, A75SEG_Codigo, GXutil.rtrim( localUtil.format( A75SEG_Codigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSEG_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtSEG_Codigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_DETALLE_TRANSACCIONGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtUNIMED_COD_Internalname, "UNIDAD MEDIDA CODIGO", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtUNIMED_COD_Internalname, GXutil.ltrim( localUtil.ntoc( A77UNIMED_COD, (byte)(6), (byte)(0), ",", "")), ((edtUNIMED_COD_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A77UNIMED_COD), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A77UNIMED_COD), "ZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUNIMED_COD_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtUNIMED_COD_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DETALLE_TRANSACCIONGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTran_IndE_S.getInternalname(), "Indicador Entrada/Salida", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTran_IndE_S, cmbTran_IndE_S.getInternalname(), GXutil.rtrim( A481Tran_IndE_S), 1, cmbTran_IndE_S.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTran_IndE_S.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_DETALLE_TRANSACCIONGeneral.htm");
         cmbTran_IndE_S.setValue( GXutil.rtrim( A481Tran_IndE_S) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTran_IndE_S.getInternalname(), "Values", cmbTran_IndE_S.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTDet_PlacaRecuperada_Internalname, "Recuperada", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTDet_PlacaRecuperada_Internalname, A817TDet_PlacaRecuperada, GXutil.rtrim( localUtil.format( A817TDet_PlacaRecuperada, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTDet_PlacaRecuperada_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTDet_PlacaRecuperada_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Placa", "left", true, "HLP_ALM_DETALLE_TRANSACCIONGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTipo_Codigo_Internalname, "Codigo Tipo de Elemento", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTipo_Codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ",", "")), ((edtTipo_Codigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A33Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A33Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipo_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTipo_Codigo_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DETALLE_TRANSACCIONGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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

   public void start212( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "ALM_DETALLE_TRANSACCIONGeneral", (short)(0)) ;
         }
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
         httpContext.wbHandled = (byte)(0) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            sXEvt = httpContext.cgiGet( "_EventName") ;
            if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
            {
            }
         }
      }
      wbErr = false ;
      if ( ( GXutil.len( sPrefix) == 0 ) || ( nDraw == 1 ) )
      {
         if ( nDoneStart == 0 )
         {
            strup210( ) ;
         }
      }
   }

   public void ws212( )
   {
      start212( ) ;
      evt212( ) ;
   }

   public void evt212( )
   {
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ( ( ( GXutil.len( sPrefix) == 0 ) ) || ( GXutil.strSearch( sXEvt, sPrefix, 1) > 0 ) ) && ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            if ( httpContext.wbHandled == 0 )
            {
               if ( GXutil.len( sPrefix) == 0 )
               {
                  sEvt = httpContext.cgiGet( "_EventName") ;
                  EvtGridId = httpContext.cgiGet( "_EventGridId") ;
                  EvtRowId = httpContext.cgiGet( "_EventRowId") ;
               }
               if ( GXutil.len( sEvt) > 0 )
               {
                  sEvtType = GXutil.left( sEvt, 1) ;
                  sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup210( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup210( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e13212 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup210( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e14212 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup210( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    if ( ! Rfr0gs )
                                    {
                                    }
                                    dynload_actions( ) ;
                                 }
                              }
                           }
                           /* No code required for Cancel button. It is implemented as the Reset button. */
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup210( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
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

   public void we212( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm212( ) ;
         }
      }
   }

   public void pa212( )
   {
      if ( nDonePA == 0 )
      {
         if ( GXutil.len( sPrefix) != 0 )
         {
            initialize_properties( ) ;
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
            {
               gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", com.genexus.util.Encryption.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(0)) ;
            }
         }
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableJsOutput();
            }
         }
         cmbTran_IndE_S.setName( "TRAN_INDE_S" );
         cmbTran_IndE_S.setWebtags( "" );
         cmbTran_IndE_S.addItem("E", "ENTRADA", (short)(0));
         cmbTran_IndE_S.addItem("S", "SALIDA", (short)(0));
         cmbTran_IndE_S.addItem("T", "TRASPASO", (short)(0));
         cmbTran_IndE_S.addItem("R", "RECUPERACIÓN", (short)(0));
         if ( cmbTran_IndE_S.getItemCount() > 0 )
         {
            A481Tran_IndE_S = cmbTran_IndE_S.getValidValue(A481Tran_IndE_S) ;
            n481Tran_IndE_S = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A481Tran_IndE_S", A481Tran_IndE_S);
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( toggleJsOutput )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableJsOutput();
               }
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

   public void send_integrity_hashes( )
   {
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbTran_IndE_S.getItemCount() > 0 )
      {
         A481Tran_IndE_S = cmbTran_IndE_S.getValidValue(A481Tran_IndE_S) ;
         n481Tran_IndE_S = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A481Tran_IndE_S", A481Tran_IndE_S);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf212( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV15Pgmname = "ALM_DETALLE_TRANSACCIONGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rf212( )
   {
      initialize_formulas( ) ;
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00212 */
         pr_default.execute(0, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A34Clas_Codigo = H00212_A34Clas_Codigo[0] ;
            A35FAM_Codigo = H00212_A35FAM_Codigo[0] ;
            A37Cata_Codigo = H00212_A37Cata_Codigo[0] ;
            A33Tipo_Codigo = H00212_A33Tipo_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
            A817TDet_PlacaRecuperada = H00212_A817TDet_PlacaRecuperada[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A817TDet_PlacaRecuperada", A817TDet_PlacaRecuperada);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TDET_PLACARECUPERADA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A817TDet_PlacaRecuperada, ""))));
            n817TDet_PlacaRecuperada = H00212_n817TDet_PlacaRecuperada[0] ;
            A77UNIMED_COD = H00212_A77UNIMED_COD[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A77UNIMED_COD", GXutil.ltrim( GXutil.str( A77UNIMED_COD, 6, 0)));
            A75SEG_Codigo = H00212_A75SEG_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A75SEG_Codigo", A75SEG_Codigo);
            A658TDet_Agrupado = H00212_A658TDet_Agrupado[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A658TDet_Agrupado", GXutil.ltrim( GXutil.str( A658TDet_Agrupado, 4, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TDET_AGRUPADO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A658TDet_Agrupado), "ZZZ9")));
            n658TDet_Agrupado = H00212_n658TDet_Agrupado[0] ;
            A657TDet_Otros_Costos = H00212_A657TDet_Otros_Costos[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A657TDet_Otros_Costos", GXutil.ltrim( GXutil.str( A657TDet_Otros_Costos, 18, 2)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TDET_OTROS_COSTOS", getSecureSignedToken( sPrefix, localUtil.format( A657TDet_Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
            n657TDet_Otros_Costos = H00212_n657TDet_Otros_Costos[0] ;
            A656TDet_Plazo_N = H00212_A656TDet_Plazo_N[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A656TDet_Plazo_N", GXutil.ltrim( GXutil.str( A656TDet_Plazo_N, 2, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TDET_PLAZO_N", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A656TDet_Plazo_N), "Z9")));
            n656TDet_Plazo_N = H00212_n656TDet_Plazo_N[0] ;
            A655TDet_Taza = H00212_A655TDet_Taza[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A655TDet_Taza", GXutil.ltrim( GXutil.str( A655TDet_Taza, 3, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TDET_TAZA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A655TDet_Taza), "ZZ9")));
            n655TDet_Taza = H00212_n655TDet_Taza[0] ;
            A654TDet_Valor_Futuro = H00212_A654TDet_Valor_Futuro[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A654TDet_Valor_Futuro", GXutil.ltrim( GXutil.str( A654TDet_Valor_Futuro, 18, 2)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TDET_VALOR_FUTURO", getSecureSignedToken( sPrefix, localUtil.format( A654TDet_Valor_Futuro, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
            n654TDet_Valor_Futuro = H00212_n654TDet_Valor_Futuro[0] ;
            A653TDet_Valor_Presente = H00212_A653TDet_Valor_Presente[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A653TDet_Valor_Presente", GXutil.ltrim( GXutil.str( A653TDet_Valor_Presente, 18, 2)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TDET_VALOR_PRESENTE", getSecureSignedToken( sPrefix, localUtil.format( A653TDet_Valor_Presente, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
            n653TDet_Valor_Presente = H00212_n653TDet_Valor_Presente[0] ;
            A298Cata_Descripcion = H00212_A298Cata_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A298Cata_Descripcion", A298Cata_Descripcion);
            A557Elem_Descripcion = H00212_A557Elem_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A557Elem_Descripcion", A557Elem_Descripcion);
            A66Elem_Consecutivo = H00212_A66Elem_Consecutivo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ELEM_CONSECUTIVO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, ""))));
            A525TDet_Atributos = H00212_A525TDet_Atributos[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A525TDet_Atributos", A525TDet_Atributos);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TDET_ATRIBUTOS", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A525TDet_Atributos, ""))));
            A505TDet_EsPadre = H00212_A505TDet_EsPadre[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A505TDet_EsPadre", A505TDet_EsPadre);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TDET_ESPADRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A505TDet_EsPadre, ""))));
            A504TDet_Observaciones = H00212_A504TDet_Observaciones[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A504TDet_Observaciones", A504TDet_Observaciones);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TDET_OBSERVACIONES", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A504TDet_Observaciones, ""))));
            n504TDet_Observaciones = H00212_n504TDet_Observaciones[0] ;
            A491TDet_PlacaPadre = H00212_A491TDet_PlacaPadre[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A491TDet_PlacaPadre", A491TDet_PlacaPadre);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TDET_PLACAPADRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A491TDet_PlacaPadre, ""))));
            n491TDet_PlacaPadre = H00212_n491TDet_PlacaPadre[0] ;
            A490TDet_PlacaNumero = H00212_A490TDet_PlacaNumero[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A490TDet_PlacaNumero", A490TDet_PlacaNumero);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TDET_PLACANUMERO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A490TDet_PlacaNumero, ""))));
            n490TDet_PlacaNumero = H00212_n490TDet_PlacaNumero[0] ;
            A489TDet_ValorTotal = H00212_A489TDet_ValorTotal[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A489TDet_ValorTotal", GXutil.ltrim( GXutil.str( A489TDet_ValorTotal, 18, 2)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TDET_VALORTOTAL", getSecureSignedToken( sPrefix, localUtil.format( A489TDet_ValorTotal, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
            A488TDet_ValorUnitario = H00212_A488TDet_ValorUnitario[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A488TDet_ValorUnitario", GXutil.ltrim( GXutil.str( A488TDet_ValorUnitario, 18, 2)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TDET_VALORUNITARIO", getSecureSignedToken( sPrefix, localUtil.format( A488TDet_ValorUnitario, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
            A487TDet_Cantidad = H00212_A487TDet_Cantidad[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A487TDet_Cantidad", GXutil.ltrim( GXutil.str( A487TDet_Cantidad, 10, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TDET_CANTIDAD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A487TDet_Cantidad), "ZZZZZZZZZ9")));
            A37Cata_Codigo = H00212_A37Cata_Codigo[0] ;
            A33Tipo_Codigo = H00212_A33Tipo_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
            A77UNIMED_COD = H00212_A77UNIMED_COD[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A77UNIMED_COD", GXutil.ltrim( GXutil.str( A77UNIMED_COD, 6, 0)));
            A557Elem_Descripcion = H00212_A557Elem_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A557Elem_Descripcion", A557Elem_Descripcion);
            A34Clas_Codigo = H00212_A34Clas_Codigo[0] ;
            A298Cata_Descripcion = H00212_A298Cata_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A298Cata_Descripcion", A298Cata_Descripcion);
            A35FAM_Codigo = H00212_A35FAM_Codigo[0] ;
            A75SEG_Codigo = H00212_A75SEG_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A75SEG_Codigo", A75SEG_Codigo);
            /* Execute user event: Load */
            e14212 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb210( ) ;
      }
   }

   public void strup210( )
   {
      /* Before Start, stand alone formulas. */
      AV15Pgmname = "ALM_DETALLE_TRANSACCIONGeneral" ;
      Gx_err = (short)(0) ;
      /* Using cursor H00213 */
      pr_default.execute(1, new Object[] {new Long(A46Tran_Id)});
      A481Tran_IndE_S = H00213_A481Tran_IndE_S[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A481Tran_IndE_S", A481Tran_IndE_S);
      n481Tran_IndE_S = H00213_n481Tran_IndE_S[0] ;
      pr_default.close(1);
      pr_default.close(1);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e13212 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A487TDet_Cantidad = localUtil.ctol( httpContext.cgiGet( edtTDet_Cantidad_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A487TDet_Cantidad", GXutil.ltrim( GXutil.str( A487TDet_Cantidad, 10, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TDET_CANTIDAD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A487TDet_Cantidad), "ZZZZZZZZZ9")));
         A488TDet_ValorUnitario = localUtil.ctond( httpContext.cgiGet( edtTDet_ValorUnitario_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A488TDet_ValorUnitario", GXutil.ltrim( GXutil.str( A488TDet_ValorUnitario, 18, 2)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TDET_VALORUNITARIO", getSecureSignedToken( sPrefix, localUtil.format( A488TDet_ValorUnitario, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         A489TDet_ValorTotal = localUtil.ctond( httpContext.cgiGet( edtTDet_ValorTotal_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A489TDet_ValorTotal", GXutil.ltrim( GXutil.str( A489TDet_ValorTotal, 18, 2)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TDET_VALORTOTAL", getSecureSignedToken( sPrefix, localUtil.format( A489TDet_ValorTotal, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         A490TDet_PlacaNumero = httpContext.cgiGet( edtTDet_PlacaNumero_Internalname) ;
         n490TDet_PlacaNumero = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A490TDet_PlacaNumero", A490TDet_PlacaNumero);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TDET_PLACANUMERO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A490TDet_PlacaNumero, ""))));
         A491TDet_PlacaPadre = httpContext.cgiGet( edtTDet_PlacaPadre_Internalname) ;
         n491TDet_PlacaPadre = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A491TDet_PlacaPadre", A491TDet_PlacaPadre);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TDET_PLACAPADRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A491TDet_PlacaPadre, ""))));
         A504TDet_Observaciones = httpContext.cgiGet( edtTDet_Observaciones_Internalname) ;
         n504TDet_Observaciones = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A504TDet_Observaciones", A504TDet_Observaciones);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TDET_OBSERVACIONES", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A504TDet_Observaciones, ""))));
         A505TDet_EsPadre = httpContext.cgiGet( edtTDet_EsPadre_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A505TDet_EsPadre", A505TDet_EsPadre);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TDET_ESPADRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A505TDet_EsPadre, ""))));
         A525TDet_Atributos = httpContext.cgiGet( edtTDet_Atributos_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A525TDet_Atributos", A525TDet_Atributos);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TDET_ATRIBUTOS", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A525TDet_Atributos, ""))));
         A66Elem_Consecutivo = httpContext.cgiGet( edtElem_Consecutivo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ELEM_CONSECUTIVO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, ""))));
         A557Elem_Descripcion = httpContext.cgiGet( edtElem_Descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A557Elem_Descripcion", A557Elem_Descripcion);
         A298Cata_Descripcion = GXutil.upper( httpContext.cgiGet( edtCata_Descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A298Cata_Descripcion", A298Cata_Descripcion);
         A653TDet_Valor_Presente = localUtil.ctond( httpContext.cgiGet( edtTDet_Valor_Presente_Internalname)) ;
         n653TDet_Valor_Presente = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A653TDet_Valor_Presente", GXutil.ltrim( GXutil.str( A653TDet_Valor_Presente, 18, 2)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TDET_VALOR_PRESENTE", getSecureSignedToken( sPrefix, localUtil.format( A653TDet_Valor_Presente, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         A654TDet_Valor_Futuro = localUtil.ctond( httpContext.cgiGet( edtTDet_Valor_Futuro_Internalname)) ;
         n654TDet_Valor_Futuro = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A654TDet_Valor_Futuro", GXutil.ltrim( GXutil.str( A654TDet_Valor_Futuro, 18, 2)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TDET_VALOR_FUTURO", getSecureSignedToken( sPrefix, localUtil.format( A654TDet_Valor_Futuro, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         A655TDet_Taza = (short)(localUtil.ctol( httpContext.cgiGet( edtTDet_Taza_Internalname), ",", ".")) ;
         n655TDet_Taza = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A655TDet_Taza", GXutil.ltrim( GXutil.str( A655TDet_Taza, 3, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TDET_TAZA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A655TDet_Taza), "ZZ9")));
         A656TDet_Plazo_N = (byte)(localUtil.ctol( httpContext.cgiGet( edtTDet_Plazo_N_Internalname), ",", ".")) ;
         n656TDet_Plazo_N = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A656TDet_Plazo_N", GXutil.ltrim( GXutil.str( A656TDet_Plazo_N, 2, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TDET_PLAZO_N", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A656TDet_Plazo_N), "Z9")));
         A657TDet_Otros_Costos = localUtil.ctond( httpContext.cgiGet( edtTDet_Otros_Costos_Internalname)) ;
         n657TDet_Otros_Costos = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A657TDet_Otros_Costos", GXutil.ltrim( GXutil.str( A657TDet_Otros_Costos, 18, 2)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TDET_OTROS_COSTOS", getSecureSignedToken( sPrefix, localUtil.format( A657TDet_Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         A658TDet_Agrupado = (short)(localUtil.ctol( httpContext.cgiGet( edtTDet_Agrupado_Internalname), ",", ".")) ;
         n658TDet_Agrupado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A658TDet_Agrupado", GXutil.ltrim( GXutil.str( A658TDet_Agrupado, 4, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TDET_AGRUPADO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A658TDet_Agrupado), "ZZZ9")));
         A75SEG_Codigo = httpContext.cgiGet( edtSEG_Codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A75SEG_Codigo", A75SEG_Codigo);
         A77UNIMED_COD = (int)(localUtil.ctol( httpContext.cgiGet( edtUNIMED_COD_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A77UNIMED_COD", GXutil.ltrim( GXutil.str( A77UNIMED_COD, 6, 0)));
         cmbTran_IndE_S.setValue( httpContext.cgiGet( cmbTran_IndE_S.getInternalname()) );
         A481Tran_IndE_S = httpContext.cgiGet( cmbTran_IndE_S.getInternalname()) ;
         n481Tran_IndE_S = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A481Tran_IndE_S", A481Tran_IndE_S);
         A817TDet_PlacaRecuperada = httpContext.cgiGet( edtTDet_PlacaRecuperada_Internalname) ;
         n817TDet_PlacaRecuperada = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A817TDet_PlacaRecuperada", A817TDet_PlacaRecuperada);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TDET_PLACARECUPERADA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A817TDet_PlacaRecuperada, ""))));
         A33Tipo_Codigo = localUtil.ctol( httpContext.cgiGet( edtTipo_Codigo_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
         /* Read saved values. */
         wcpOA46Tran_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA46Tran_Id"), ",", ".") ;
         wcpOA69TDet_Consecutivo = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA69TDet_Consecutivo"), ",", ".") ;
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
      e13212 ();
      if (returnInSub) return;
   }

   public void e13212( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV15Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV15Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
   }

   protected void nextLoad( )
   {
   }

   protected void e14212( )
   {
      /* Load Routine */
      edtCata_Descripcion_Link = formatLink("com.orions2.viewalm_catalogo") + "?" + GXutil.URLEncode(GXutil.rtrim(A37Cata_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCata_Descripcion_Internalname, "Link", edtCata_Descripcion_Link, true);
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV9TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV9TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV15Pgmname );
      AV9TrnContext.setgxTv_SdtTransactionContext_Callerondelete( false );
      AV9TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV12HTTPRequest.getScriptName()+"?"+AV12HTTPRequest.getQuerystring() );
      AV9TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_DETALLE_TRANSACCION" );
      AV10TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV10TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Tran_Id" );
      AV10TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV7Tran_Id, 11, 0) );
      AV9TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV10TrnContextAtt, 0);
      AV10TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV10TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "TDet_Consecutivo" );
      AV10TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV8TDet_Consecutivo, 18, 0) );
      AV9TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV10TrnContextAtt, 0);
      AV11Session.setValue("TrnContext", AV9TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      A46Tran_Id = ((Number) GXutil.testNumericType( getParm(obj,0,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
      A69TDet_Consecutivo = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A69TDet_Consecutivo", GXutil.ltrim( GXutil.str( A69TDet_Consecutivo, 18, 0)));
   }

   public String getresponse( String sGXDynURL )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.setDefaultTheme("Carmine");
      }
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa212( ) ;
      ws212( ) ;
      we212( ) ;
      httpContext.setWrapped(false);
      httpContext.SaveComponentMsgList(sPrefix);
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

   public void componentbind( Object[] obj )
   {
      if ( IsUrlCreated( ) )
      {
         return  ;
      }
      sCtrlA46Tran_Id = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlA69TDet_Consecutivo = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa212( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "alm_detalle_transacciongeneral");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa212( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A46Tran_Id = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
         A69TDet_Consecutivo = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A69TDet_Consecutivo", GXutil.ltrim( GXutil.str( A69TDet_Consecutivo, 18, 0)));
      }
      wcpOA46Tran_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA46Tran_Id"), ",", ".") ;
      wcpOA69TDet_Consecutivo = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA69TDet_Consecutivo"), ",", ".") ;
      if ( ! GetJustCreated( ) && ( ( A46Tran_Id != wcpOA46Tran_Id ) || ( A69TDet_Consecutivo != wcpOA69TDet_Consecutivo ) ) )
      {
         setjustcreated();
      }
      wcpOA46Tran_Id = A46Tran_Id ;
      wcpOA69TDet_Consecutivo = A69TDet_Consecutivo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA46Tran_Id = httpContext.cgiGet( sPrefix+"A46Tran_Id_CTRL") ;
      if ( GXutil.len( sCtrlA46Tran_Id) > 0 )
      {
         A46Tran_Id = localUtil.ctol( httpContext.cgiGet( sCtrlA46Tran_Id), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
      }
      else
      {
         A46Tran_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"A46Tran_Id_PARM"), ",", ".") ;
      }
      sCtrlA69TDet_Consecutivo = httpContext.cgiGet( sPrefix+"A69TDet_Consecutivo_CTRL") ;
      if ( GXutil.len( sCtrlA69TDet_Consecutivo) > 0 )
      {
         A69TDet_Consecutivo = localUtil.ctol( httpContext.cgiGet( sCtrlA69TDet_Consecutivo), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A69TDet_Consecutivo", GXutil.ltrim( GXutil.str( A69TDet_Consecutivo, 18, 0)));
      }
      else
      {
         A69TDet_Consecutivo = localUtil.ctol( httpContext.cgiGet( sPrefix+"A69TDet_Consecutivo_PARM"), ",", ".") ;
      }
   }

   public void componentprocess( String sPPrefix ,
                                 String sPSFPrefix ,
                                 String sCompEvt )
   {
      sCompPrefix = sPPrefix ;
      sSFPrefix = sPSFPrefix ;
      sPrefix = sCompPrefix + sSFPrefix ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      initweb( ) ;
      nDraw = (byte)(0) ;
      pa212( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws212( ) ;
      if ( isFullAjaxMode( ) )
      {
         componentdraw();
      }
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void componentstart( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
   }

   public void wcstart( )
   {
      nDraw = (byte)(1) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      ws212( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A46Tran_Id_PARM", GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ",", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA46Tran_Id)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A46Tran_Id_CTRL", GXutil.rtrim( sCtrlA46Tran_Id));
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A69TDet_Consecutivo_PARM", GXutil.ltrim( localUtil.ntoc( A69TDet_Consecutivo, (byte)(18), (byte)(0), ",", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA69TDet_Consecutivo)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A69TDet_Consecutivo_CTRL", GXutil.rtrim( sCtrlA69TDet_Consecutivo));
      }
   }

   public void componentdraw( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      wcparametersset( ) ;
      we212( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public String componentgetstring( String sGXControl )
   {
      String sCtrlName ;
      if ( GXutil.strcmp(GXutil.substring( sGXControl, 1, 1), "&") == 0 )
      {
         sCtrlName = GXutil.substring( sGXControl, 2, GXutil.len( sGXControl)-1) ;
      }
      else
      {
         sCtrlName = sGXControl ;
      }
      return httpContext.cgiGet( sPrefix+"v"+GXutil.upper( sCtrlName)) ;
   }

   public void componentjscripts( )
   {
      include_jscripts( ) ;
   }

   public void componentthemes( )
   {
      define_styles( ) ;
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414145620");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("alm_detalle_transacciongeneral.js", "?201861414145620");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtTran_Id_Internalname = sPrefix+"TRAN_ID" ;
      edtTDet_Consecutivo_Internalname = sPrefix+"TDET_CONSECUTIVO" ;
      edtTDet_Cantidad_Internalname = sPrefix+"TDET_CANTIDAD" ;
      edtTDet_ValorUnitario_Internalname = sPrefix+"TDET_VALORUNITARIO" ;
      edtTDet_ValorTotal_Internalname = sPrefix+"TDET_VALORTOTAL" ;
      edtTDet_PlacaNumero_Internalname = sPrefix+"TDET_PLACANUMERO" ;
      edtTDet_PlacaPadre_Internalname = sPrefix+"TDET_PLACAPADRE" ;
      edtTDet_Observaciones_Internalname = sPrefix+"TDET_OBSERVACIONES" ;
      edtTDet_EsPadre_Internalname = sPrefix+"TDET_ESPADRE" ;
      edtTDet_Atributos_Internalname = sPrefix+"TDET_ATRIBUTOS" ;
      edtElem_Consecutivo_Internalname = sPrefix+"ELEM_CONSECUTIVO" ;
      edtElem_Descripcion_Internalname = sPrefix+"ELEM_DESCRIPCION" ;
      edtCata_Descripcion_Internalname = sPrefix+"CATA_DESCRIPCION" ;
      edtTDet_Valor_Presente_Internalname = sPrefix+"TDET_VALOR_PRESENTE" ;
      edtTDet_Valor_Futuro_Internalname = sPrefix+"TDET_VALOR_FUTURO" ;
      edtTDet_Taza_Internalname = sPrefix+"TDET_TAZA" ;
      edtTDet_Plazo_N_Internalname = sPrefix+"TDET_PLAZO_N" ;
      edtTDet_Otros_Costos_Internalname = sPrefix+"TDET_OTROS_COSTOS" ;
      edtTDet_Agrupado_Internalname = sPrefix+"TDET_AGRUPADO" ;
      edtSEG_Codigo_Internalname = sPrefix+"SEG_CODIGO" ;
      edtUNIMED_COD_Internalname = sPrefix+"UNIMED_COD" ;
      cmbTran_IndE_S.setInternalname( sPrefix+"TRAN_INDE_S" );
      edtTDet_PlacaRecuperada_Internalname = sPrefix+"TDET_PLACARECUPERADA" ;
      edtTipo_Codigo_Internalname = sPrefix+"TIPO_CODIGO" ;
      divAttributestable_Internalname = sPrefix+"ATTRIBUTESTABLE" ;
      divMaintable_Internalname = sPrefix+"MAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
   }

   public void initialize_properties( )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      init_default_properties( ) ;
      edtTipo_Codigo_Jsonclick = "" ;
      edtTipo_Codigo_Enabled = 0 ;
      edtTDet_PlacaRecuperada_Jsonclick = "" ;
      edtTDet_PlacaRecuperada_Enabled = 0 ;
      cmbTran_IndE_S.setJsonclick( "" );
      cmbTran_IndE_S.setEnabled( 0 );
      edtUNIMED_COD_Jsonclick = "" ;
      edtUNIMED_COD_Enabled = 0 ;
      edtSEG_Codigo_Jsonclick = "" ;
      edtSEG_Codigo_Enabled = 0 ;
      edtTDet_Agrupado_Jsonclick = "" ;
      edtTDet_Agrupado_Enabled = 0 ;
      edtTDet_Otros_Costos_Jsonclick = "" ;
      edtTDet_Otros_Costos_Enabled = 0 ;
      edtTDet_Plazo_N_Jsonclick = "" ;
      edtTDet_Plazo_N_Enabled = 0 ;
      edtTDet_Taza_Jsonclick = "" ;
      edtTDet_Taza_Enabled = 0 ;
      edtTDet_Valor_Futuro_Jsonclick = "" ;
      edtTDet_Valor_Futuro_Enabled = 0 ;
      edtTDet_Valor_Presente_Jsonclick = "" ;
      edtTDet_Valor_Presente_Enabled = 0 ;
      edtCata_Descripcion_Link = "" ;
      edtCata_Descripcion_Enabled = 0 ;
      edtElem_Descripcion_Enabled = 0 ;
      edtElem_Consecutivo_Jsonclick = "" ;
      edtElem_Consecutivo_Enabled = 0 ;
      edtTDet_Atributos_Jsonclick = "" ;
      edtTDet_Atributos_Enabled = 0 ;
      edtTDet_EsPadre_Jsonclick = "" ;
      edtTDet_EsPadre_Enabled = 0 ;
      edtTDet_Observaciones_Enabled = 0 ;
      edtTDet_PlacaPadre_Jsonclick = "" ;
      edtTDet_PlacaPadre_Enabled = 0 ;
      edtTDet_PlacaNumero_Jsonclick = "" ;
      edtTDet_PlacaNumero_Enabled = 0 ;
      edtTDet_ValorTotal_Jsonclick = "" ;
      edtTDet_ValorTotal_Enabled = 0 ;
      edtTDet_ValorUnitario_Jsonclick = "" ;
      edtTDet_ValorUnitario_Enabled = 0 ;
      edtTDet_Cantidad_Jsonclick = "" ;
      edtTDet_Cantidad_Enabled = 0 ;
      edtTDet_Consecutivo_Jsonclick = "" ;
      edtTDet_Consecutivo_Enabled = 0 ;
      edtTran_Id_Jsonclick = "" ;
      edtTran_Id_Enabled = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("'DOUPDATE'","{handler:'e11211',iparms:[{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e12211',iparms:[{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[]}");
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
      sPrefix = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      A488TDet_ValorUnitario = DecimalUtil.ZERO ;
      A489TDet_ValorTotal = DecimalUtil.ZERO ;
      A490TDet_PlacaNumero = "" ;
      A491TDet_PlacaPadre = "" ;
      A504TDet_Observaciones = "" ;
      A505TDet_EsPadre = "" ;
      A525TDet_Atributos = "" ;
      A66Elem_Consecutivo = "" ;
      A653TDet_Valor_Presente = DecimalUtil.ZERO ;
      A654TDet_Valor_Futuro = DecimalUtil.ZERO ;
      A657TDet_Otros_Costos = DecimalUtil.ZERO ;
      A817TDet_PlacaRecuperada = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      A557Elem_Descripcion = "" ;
      A298Cata_Descripcion = "" ;
      A75SEG_Codigo = "" ;
      A481Tran_IndE_S = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV15Pgmname = "" ;
      scmdbuf = "" ;
      H00212_A34Clas_Codigo = new String[] {""} ;
      H00212_A35FAM_Codigo = new String[] {""} ;
      H00212_A46Tran_Id = new long[1] ;
      H00212_A69TDet_Consecutivo = new long[1] ;
      H00212_A37Cata_Codigo = new String[] {""} ;
      H00212_A33Tipo_Codigo = new long[1] ;
      H00212_A817TDet_PlacaRecuperada = new String[] {""} ;
      H00212_n817TDet_PlacaRecuperada = new boolean[] {false} ;
      H00212_A481Tran_IndE_S = new String[] {""} ;
      H00212_n481Tran_IndE_S = new boolean[] {false} ;
      H00212_A77UNIMED_COD = new int[1] ;
      H00212_A75SEG_Codigo = new String[] {""} ;
      H00212_A658TDet_Agrupado = new short[1] ;
      H00212_n658TDet_Agrupado = new boolean[] {false} ;
      H00212_A657TDet_Otros_Costos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00212_n657TDet_Otros_Costos = new boolean[] {false} ;
      H00212_A656TDet_Plazo_N = new byte[1] ;
      H00212_n656TDet_Plazo_N = new boolean[] {false} ;
      H00212_A655TDet_Taza = new short[1] ;
      H00212_n655TDet_Taza = new boolean[] {false} ;
      H00212_A654TDet_Valor_Futuro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00212_n654TDet_Valor_Futuro = new boolean[] {false} ;
      H00212_A653TDet_Valor_Presente = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00212_n653TDet_Valor_Presente = new boolean[] {false} ;
      H00212_A298Cata_Descripcion = new String[] {""} ;
      H00212_A557Elem_Descripcion = new String[] {""} ;
      H00212_A66Elem_Consecutivo = new String[] {""} ;
      H00212_A525TDet_Atributos = new String[] {""} ;
      H00212_A505TDet_EsPadre = new String[] {""} ;
      H00212_A504TDet_Observaciones = new String[] {""} ;
      H00212_n504TDet_Observaciones = new boolean[] {false} ;
      H00212_A491TDet_PlacaPadre = new String[] {""} ;
      H00212_n491TDet_PlacaPadre = new boolean[] {false} ;
      H00212_A490TDet_PlacaNumero = new String[] {""} ;
      H00212_n490TDet_PlacaNumero = new boolean[] {false} ;
      H00212_A489TDet_ValorTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00212_A488TDet_ValorUnitario = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00212_A487TDet_Cantidad = new long[1] ;
      A34Clas_Codigo = "" ;
      A35FAM_Codigo = "" ;
      A37Cata_Codigo = "" ;
      H00213_A481Tran_IndE_S = new String[] {""} ;
      H00213_n481Tran_IndE_S = new boolean[] {false} ;
      AV9TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV12HTTPRequest = httpContext.getHttpRequest();
      AV10TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV11Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA46Tran_Id = "" ;
      sCtrlA69TDet_Consecutivo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_detalle_transacciongeneral__default(),
         new Object[] {
             new Object[] {
            H00212_A34Clas_Codigo, H00212_A35FAM_Codigo, H00212_A46Tran_Id, H00212_A69TDet_Consecutivo, H00212_A37Cata_Codigo, H00212_A33Tipo_Codigo, H00212_A817TDet_PlacaRecuperada, H00212_n817TDet_PlacaRecuperada, H00212_A481Tran_IndE_S, H00212_n481Tran_IndE_S,
            H00212_A77UNIMED_COD, H00212_A75SEG_Codigo, H00212_A658TDet_Agrupado, H00212_n658TDet_Agrupado, H00212_A657TDet_Otros_Costos, H00212_n657TDet_Otros_Costos, H00212_A656TDet_Plazo_N, H00212_n656TDet_Plazo_N, H00212_A655TDet_Taza, H00212_n655TDet_Taza,
            H00212_A654TDet_Valor_Futuro, H00212_n654TDet_Valor_Futuro, H00212_A653TDet_Valor_Presente, H00212_n653TDet_Valor_Presente, H00212_A298Cata_Descripcion, H00212_A557Elem_Descripcion, H00212_A66Elem_Consecutivo, H00212_A525TDet_Atributos, H00212_A505TDet_EsPadre, H00212_A504TDet_Observaciones,
            H00212_n504TDet_Observaciones, H00212_A491TDet_PlacaPadre, H00212_n491TDet_PlacaPadre, H00212_A490TDet_PlacaNumero, H00212_n490TDet_PlacaNumero, H00212_A489TDet_ValorTotal, H00212_A488TDet_ValorUnitario, H00212_A487TDet_Cantidad
            }
            , new Object[] {
            H00213_A481Tran_IndE_S, H00213_n481Tran_IndE_S
            }
         }
      );
      AV15Pgmname = "ALM_DETALLE_TRANSACCIONGeneral" ;
      /* GeneXus formulas. */
      AV15Pgmname = "ALM_DETALLE_TRANSACCIONGeneral" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte A656TDet_Plazo_N ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short A655TDet_Taza ;
   private short A658TDet_Agrupado ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtTran_Id_Enabled ;
   private int edtTDet_Consecutivo_Enabled ;
   private int edtTDet_Cantidad_Enabled ;
   private int edtTDet_ValorUnitario_Enabled ;
   private int edtTDet_ValorTotal_Enabled ;
   private int edtTDet_PlacaNumero_Enabled ;
   private int edtTDet_PlacaPadre_Enabled ;
   private int edtTDet_Observaciones_Enabled ;
   private int edtTDet_EsPadre_Enabled ;
   private int edtTDet_Atributos_Enabled ;
   private int edtElem_Consecutivo_Enabled ;
   private int edtElem_Descripcion_Enabled ;
   private int edtCata_Descripcion_Enabled ;
   private int edtTDet_Valor_Presente_Enabled ;
   private int edtTDet_Valor_Futuro_Enabled ;
   private int edtTDet_Taza_Enabled ;
   private int edtTDet_Plazo_N_Enabled ;
   private int edtTDet_Otros_Costos_Enabled ;
   private int edtTDet_Agrupado_Enabled ;
   private int edtSEG_Codigo_Enabled ;
   private int A77UNIMED_COD ;
   private int edtUNIMED_COD_Enabled ;
   private int edtTDet_PlacaRecuperada_Enabled ;
   private int edtTipo_Codigo_Enabled ;
   private int idxLst ;
   private long wcpOA46Tran_Id ;
   private long wcpOA69TDet_Consecutivo ;
   private long A46Tran_Id ;
   private long A69TDet_Consecutivo ;
   private long A487TDet_Cantidad ;
   private long A33Tipo_Codigo ;
   private long AV7Tran_Id ;
   private long AV8TDet_Consecutivo ;
   private java.math.BigDecimal A488TDet_ValorUnitario ;
   private java.math.BigDecimal A489TDet_ValorTotal ;
   private java.math.BigDecimal A653TDet_Valor_Presente ;
   private java.math.BigDecimal A654TDet_Valor_Futuro ;
   private java.math.BigDecimal A657TDet_Otros_Costos ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GX_FocusControl ;
   private String divMaintable_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnupdate_Internalname ;
   private String bttBtnupdate_Jsonclick ;
   private String bttBtndelete_Internalname ;
   private String bttBtndelete_Jsonclick ;
   private String divAttributestable_Internalname ;
   private String edtTran_Id_Internalname ;
   private String edtTran_Id_Jsonclick ;
   private String edtTDet_Consecutivo_Internalname ;
   private String edtTDet_Consecutivo_Jsonclick ;
   private String edtTDet_Cantidad_Internalname ;
   private String edtTDet_Cantidad_Jsonclick ;
   private String edtTDet_ValorUnitario_Internalname ;
   private String edtTDet_ValorUnitario_Jsonclick ;
   private String edtTDet_ValorTotal_Internalname ;
   private String edtTDet_ValorTotal_Jsonclick ;
   private String edtTDet_PlacaNumero_Internalname ;
   private String edtTDet_PlacaNumero_Jsonclick ;
   private String edtTDet_PlacaPadre_Internalname ;
   private String edtTDet_PlacaPadre_Jsonclick ;
   private String edtTDet_Observaciones_Internalname ;
   private String edtTDet_EsPadre_Internalname ;
   private String edtTDet_EsPadre_Jsonclick ;
   private String edtTDet_Atributos_Internalname ;
   private String edtTDet_Atributos_Jsonclick ;
   private String edtElem_Consecutivo_Internalname ;
   private String edtElem_Consecutivo_Jsonclick ;
   private String edtElem_Descripcion_Internalname ;
   private String edtCata_Descripcion_Internalname ;
   private String edtCata_Descripcion_Link ;
   private String edtTDet_Valor_Presente_Internalname ;
   private String edtTDet_Valor_Presente_Jsonclick ;
   private String edtTDet_Valor_Futuro_Internalname ;
   private String edtTDet_Valor_Futuro_Jsonclick ;
   private String edtTDet_Taza_Internalname ;
   private String edtTDet_Taza_Jsonclick ;
   private String edtTDet_Plazo_N_Internalname ;
   private String edtTDet_Plazo_N_Jsonclick ;
   private String edtTDet_Otros_Costos_Internalname ;
   private String edtTDet_Otros_Costos_Jsonclick ;
   private String edtTDet_Agrupado_Internalname ;
   private String edtTDet_Agrupado_Jsonclick ;
   private String edtSEG_Codigo_Internalname ;
   private String edtSEG_Codigo_Jsonclick ;
   private String edtUNIMED_COD_Internalname ;
   private String edtUNIMED_COD_Jsonclick ;
   private String edtTDet_PlacaRecuperada_Internalname ;
   private String edtTDet_PlacaRecuperada_Jsonclick ;
   private String edtTipo_Codigo_Internalname ;
   private String edtTipo_Codigo_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV15Pgmname ;
   private String scmdbuf ;
   private String sCtrlA46Tran_Id ;
   private String sCtrlA69TDet_Consecutivo ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n481Tran_IndE_S ;
   private boolean n817TDet_PlacaRecuperada ;
   private boolean n658TDet_Agrupado ;
   private boolean n657TDet_Otros_Costos ;
   private boolean n656TDet_Plazo_N ;
   private boolean n655TDet_Taza ;
   private boolean n654TDet_Valor_Futuro ;
   private boolean n653TDet_Valor_Presente ;
   private boolean n504TDet_Observaciones ;
   private boolean n491TDet_PlacaPadre ;
   private boolean n490TDet_PlacaNumero ;
   private boolean returnInSub ;
   private String A490TDet_PlacaNumero ;
   private String A491TDet_PlacaPadre ;
   private String A504TDet_Observaciones ;
   private String A505TDet_EsPadre ;
   private String A525TDet_Atributos ;
   private String A66Elem_Consecutivo ;
   private String A817TDet_PlacaRecuperada ;
   private String A557Elem_Descripcion ;
   private String A298Cata_Descripcion ;
   private String A75SEG_Codigo ;
   private String A481Tran_IndE_S ;
   private String A34Clas_Codigo ;
   private String A35FAM_Codigo ;
   private String A37Cata_Codigo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV12HTTPRequest ;
   private HTMLChoice cmbTran_IndE_S ;
   private IDataStoreProvider pr_default ;
   private String[] H00212_A34Clas_Codigo ;
   private String[] H00212_A35FAM_Codigo ;
   private long[] H00212_A46Tran_Id ;
   private long[] H00212_A69TDet_Consecutivo ;
   private String[] H00212_A37Cata_Codigo ;
   private long[] H00212_A33Tipo_Codigo ;
   private String[] H00212_A817TDet_PlacaRecuperada ;
   private boolean[] H00212_n817TDet_PlacaRecuperada ;
   private String[] H00212_A481Tran_IndE_S ;
   private boolean[] H00212_n481Tran_IndE_S ;
   private int[] H00212_A77UNIMED_COD ;
   private String[] H00212_A75SEG_Codigo ;
   private short[] H00212_A658TDet_Agrupado ;
   private boolean[] H00212_n658TDet_Agrupado ;
   private java.math.BigDecimal[] H00212_A657TDet_Otros_Costos ;
   private boolean[] H00212_n657TDet_Otros_Costos ;
   private byte[] H00212_A656TDet_Plazo_N ;
   private boolean[] H00212_n656TDet_Plazo_N ;
   private short[] H00212_A655TDet_Taza ;
   private boolean[] H00212_n655TDet_Taza ;
   private java.math.BigDecimal[] H00212_A654TDet_Valor_Futuro ;
   private boolean[] H00212_n654TDet_Valor_Futuro ;
   private java.math.BigDecimal[] H00212_A653TDet_Valor_Presente ;
   private boolean[] H00212_n653TDet_Valor_Presente ;
   private String[] H00212_A298Cata_Descripcion ;
   private String[] H00212_A557Elem_Descripcion ;
   private String[] H00212_A66Elem_Consecutivo ;
   private String[] H00212_A525TDet_Atributos ;
   private String[] H00212_A505TDet_EsPadre ;
   private String[] H00212_A504TDet_Observaciones ;
   private boolean[] H00212_n504TDet_Observaciones ;
   private String[] H00212_A491TDet_PlacaPadre ;
   private boolean[] H00212_n491TDet_PlacaPadre ;
   private String[] H00212_A490TDet_PlacaNumero ;
   private boolean[] H00212_n490TDet_PlacaNumero ;
   private java.math.BigDecimal[] H00212_A489TDet_ValorTotal ;
   private java.math.BigDecimal[] H00212_A488TDet_ValorUnitario ;
   private long[] H00212_A487TDet_Cantidad ;
   private String[] H00213_A481Tran_IndE_S ;
   private boolean[] H00213_n481Tran_IndE_S ;
   private com.genexus.webpanels.WebSession AV11Session ;
   private com.orions2.SdtTransactionContext AV9TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV10TrnContextAtt ;
}

final  class alm_detalle_transacciongeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00212", "SELECT T3.Clas_Codigo, T4.FAM_Codigo, T1.Tran_Id, T1.TDet_Consecutivo, T2.Cata_Codigo, T2.Tipo_Codigo, T1.TDet_PlacaRecuperada, T6.Tran_IndE_S, T2.UNIMED_COD, T5.SEG_Codigo, T1.TDet_Agrupado, T1.TDet_Otros_Costos, T1.TDet_Plazo_N, T1.TDet_Taza, T1.TDet_Valor_Futuro, T1.TDet_Valor_Presente, T3.Cata_Descripcion, T2.Elem_Descripcion, T1.Elem_Consecutivo, T1.TDet_Atributos, T1.TDet_EsPadre, T1.TDet_Observaciones, T1.TDet_PlacaPadre, T1.TDet_PlacaNumero, T1.TDet_ValorTotal, T1.TDet_ValorUnitario, T1.TDet_Cantidad FROM (((((ALM_DETALLE_TRANSACCION T1 INNER JOIN ALM_ELEMENTO T2 ON T2.Elem_Consecutivo = T1.Elem_Consecutivo) INNER JOIN ALM_CATALOGO T3 ON T3.Cata_Codigo = T2.Cata_Codigo) INNER JOIN ALM_CLASE T4 ON T4.Clas_Codigo = T3.Clas_Codigo) INNER JOIN ALM_CAT_FAM T5 ON T5.FAM_Codigo = T4.FAM_Codigo) INNER JOIN ALM_TRANSACCION T6 ON T6.Tran_Id = T1.Tran_Id) WHERE T1.Tran_Id = ? and T1.TDet_Consecutivo = ? ORDER BY T1.Tran_Id, T1.TDet_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00213", "SELECT Tran_IndE_S FROM ALM_TRANSACCION WHERE Tran_Id = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(10) ;
               ((short[]) buf[12])[0] = rslt.getShort(11) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,2) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(13) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(15,2) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(16,2) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(17) ;
               ((String[]) buf[25])[0] = rslt.getVarchar(18) ;
               ((String[]) buf[26])[0] = rslt.getVarchar(19) ;
               ((String[]) buf[27])[0] = rslt.getVarchar(20) ;
               ((String[]) buf[28])[0] = rslt.getVarchar(21) ;
               ((String[]) buf[29])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(25,2) ;
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(26,2) ;
               ((long[]) buf[37])[0] = rslt.getLong(27) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

