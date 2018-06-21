/*
               File: alm_inv_congeneral_impl
        Description: ALM_INV_CONGeneral
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:15:7.90
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

public final  class alm_inv_congeneral_impl extends GXWebComponent
{
   public alm_inv_congeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_inv_congeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_inv_congeneral_impl.class ));
   }

   public alm_inv_congeneral_impl( int remoteHandle ,
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
      cmbAlma_Modulo = new HTMLChoice();
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
               A91Regional = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A91Regional", GXutil.ltrim( GXutil.str( A91Regional, 11, 0)));
               A27Alma_Modulo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A27Alma_Modulo", A27Alma_Modulo);
               A28Alma_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A28Alma_Codigo", A28Alma_Codigo);
               A31Bode_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A31Bode_Codigo", A31Bode_Codigo);
               A93Trans_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A93Trans_Id", GXutil.ltrim( GXutil.str( A93Trans_Id, 11, 0)));
               A66Elem_Consecutivo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
               A94Num_Linea = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A94Num_Linea", GXutil.ltrim( GXutil.str( A94Num_Linea, 8, 0)));
               A92Centro_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A92Centro_Id", GXutil.ltrim( GXutil.str( A92Centro_Id, 11, 0)));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,new Long(A91Regional),A27Alma_Modulo,A28Alma_Codigo,A31Bode_Codigo,new Long(A93Trans_Id),A66Elem_Consecutivo,new Integer(A94Num_Linea),new Long(A92Centro_Id)});
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
         pa262( ) ;
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
         httpContext.writeValue( "ALM_INV_CONGeneral") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20186141415796");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("calendar-es.js", "?"+httpContext.getBuildNumber( 113785));
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_inv_congeneral") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A91Regional,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(A27Alma_Modulo)) + "," + GXutil.URLEncode(GXutil.rtrim(A28Alma_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(A31Bode_Codigo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A93Trans_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(A66Elem_Consecutivo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A94Num_Linea,8,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A92Centro_Id,11,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA91Regional", GXutil.ltrim( localUtil.ntoc( wcpOA91Regional, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA27Alma_Modulo", wcpOA27Alma_Modulo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA28Alma_Codigo", wcpOA28Alma_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA31Bode_Codigo", wcpOA31Bode_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA93Trans_Id", GXutil.ltrim( localUtil.ntoc( wcpOA93Trans_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA66Elem_Consecutivo", wcpOA66Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA94Num_Linea", GXutil.ltrim( localUtil.ntoc( wcpOA94Num_Linea, (byte)(8), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA92Centro_Id", GXutil.ltrim( localUtil.ntoc( wcpOA92Centro_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CANTIDAD_DIPONIBLE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A618Cantidad_Diponible), "ZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CANTIDAD_TRANSITO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A619Cantidad_Transito), "ZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_VALOR_UNITARIO", getSecureSignedToken( sPrefix, localUtil.format( A620Valor_Unitario, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_OTROS_COSTOS", getSecureSignedToken( sPrefix, localUtil.format( A621Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_COSTO_TOTAL", getSecureSignedToken( sPrefix, localUtil.format( A622Costo_Total, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DESCRIP_ATRIBUTOS", getSecureSignedToken( sPrefix, A623Descrip_Atributos));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm262( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("alm_inv_congeneral.js", "?20186141415798");
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
      return "ALM_INV_CONGeneral" ;
   }

   public String getPgmdesc( )
   {
      return "ALM_INV_CONGeneral" ;
   }

   public void wb260( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.alm_inv_congeneral");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", "Modificar", bttBtnupdate_Jsonclick, 7, "Modificar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e11261_client"+"'", TempTags, "", 2, "HLP_ALM_INV_CONGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", "Eliminar", bttBtndelete_Jsonclick, 7, "Eliminar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e12261_client"+"'", TempTags, "", 2, "HLP_ALM_INV_CONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbAlma_Modulo.getInternalname(), "Modulo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlma_Modulo, cmbAlma_Modulo.getInternalname(), GXutil.rtrim( A27Alma_Modulo), 1, cmbAlma_Modulo.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbAlma_Modulo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_INV_CONGeneral.htm");
         cmbAlma_Modulo.setValue( GXutil.rtrim( A27Alma_Modulo) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlma_Modulo.getInternalname(), "Values", cmbAlma_Modulo.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtBode_Codigo_Internalname, "Código Bodega", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtBode_Codigo_Internalname, A31Bode_Codigo, GXutil.rtrim( localUtil.format( A31Bode_Codigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBode_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtBode_Codigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_INV_CONGeneral.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtElem_Consecutivo_Internalname, A66Elem_Consecutivo, GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtElem_Consecutivo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtElem_Consecutivo_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_INV_CONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNum_Linea_Internalname, "por transaccion", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNum_Linea_Internalname, GXutil.ltrim( localUtil.ntoc( A94Num_Linea, (byte)(8), (byte)(0), ",", "")), ((edtNum_Linea_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A94Num_Linea), "ZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A94Num_Linea), "ZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNum_Linea_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtNum_Linea_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_INV_CONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCantidad_Diponible_Internalname, "Diponible", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCantidad_Diponible_Internalname, GXutil.ltrim( localUtil.ntoc( A618Cantidad_Diponible, (byte)(8), (byte)(0), ",", "")), ((edtCantidad_Diponible_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A618Cantidad_Diponible), "ZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A618Cantidad_Diponible), "ZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCantidad_Diponible_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCantidad_Diponible_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_INV_CONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCantidad_Transito_Internalname, "Transito", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCantidad_Transito_Internalname, GXutil.ltrim( localUtil.ntoc( A619Cantidad_Transito, (byte)(8), (byte)(0), ",", "")), ((edtCantidad_Transito_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A619Cantidad_Transito), "ZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A619Cantidad_Transito), "ZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCantidad_Transito_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCantidad_Transito_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_INV_CONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtValor_Unitario_Internalname, "Unitario", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtValor_Unitario_Internalname, GXutil.ltrim( localUtil.ntoc( A620Valor_Unitario, (byte)(24), (byte)(2), ",", "")), ((edtValor_Unitario_Enabled!=0) ? GXutil.ltrim( localUtil.format( A620Valor_Unitario, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A620Valor_Unitario, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtValor_Unitario_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtValor_Unitario_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_ALM_INV_CONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtOtros_Costos_Internalname, "Costos", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtOtros_Costos_Internalname, GXutil.ltrim( localUtil.ntoc( A621Otros_Costos, (byte)(24), (byte)(2), ",", "")), ((edtOtros_Costos_Enabled!=0) ? GXutil.ltrim( localUtil.format( A621Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A621Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOtros_Costos_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtOtros_Costos_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_ALM_INV_CONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCosto_Total_Internalname, "Total", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCosto_Total_Internalname, GXutil.ltrim( localUtil.ntoc( A622Costo_Total, (byte)(24), (byte)(2), ",", "")), ((edtCosto_Total_Enabled!=0) ? GXutil.ltrim( localUtil.format( A622Costo_Total, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A622Costo_Total, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCosto_Total_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCosto_Total_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_ALM_INV_CONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDescrip_Atributos_Internalname, "Atributos", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Multiple line edit */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtDescrip_Atributos_Internalname, A623Descrip_Atributos, "", "", (short)(0), 1, edtDescrip_Atributos_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_INV_CONGeneral.htm");
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
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtElem_Descripcion_Internalname, A557Elem_Descripcion, edtElem_Descripcion_Link, "", (short)(0), 1, edtElem_Descripcion_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_INV_CONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCata_Codigo_Internalname, "Código del Bien", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCata_Codigo_Internalname, A37Cata_Codigo, GXutil.rtrim( localUtil.format( A37Cata_Codigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCata_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCata_Codigo_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_INV_CONGeneral.htm");
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
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtCata_Descripcion_Internalname, A298Cata_Descripcion, edtCata_Descripcion_Link, "", (short)(0), 1, edtCata_Descripcion_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_INV_CONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlma_Codigo_Internalname, "Código", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlma_Codigo_Internalname, A28Alma_Codigo, GXutil.rtrim( localUtil.format( A28Alma_Codigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlma_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtAlma_Codigo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_INV_CONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegional_Internalname, "Regional", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegional_Internalname, GXutil.ltrim( localUtil.ntoc( A91Regional, (byte)(11), (byte)(0), ",", "")), ((edtRegional_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A91Regional), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A91Regional), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegional_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtRegional_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_INV_CONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTrans_Id_Internalname, "Id", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTrans_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A93Trans_Id, (byte)(11), (byte)(0), ",", "")), ((edtTrans_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A93Trans_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A93Trans_Id), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrans_Id_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTrans_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_INV_CONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCentro_Id_Internalname, "de Costo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCentro_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A92Centro_Id, (byte)(11), (byte)(0), ",", "")), ((edtCentro_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A92Centro_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A92Centro_Id), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCentro_Id_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCentro_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_INV_CONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTrans_ConsecutivoCC_Internalname, "CC", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTrans_ConsecutivoCC_Internalname, GXutil.ltrim( localUtil.ntoc( A710Trans_ConsecutivoCC, (byte)(18), (byte)(0), ",", "")), ((edtTrans_ConsecutivoCC_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A710Trans_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A710Trans_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrans_ConsecutivoCC_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTrans_ConsecutivoCC_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_INV_CONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTrans_FechaRatificacion_Internalname, "Ratificacion", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtTrans_FechaRatificacion_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTrans_FechaRatificacion_Internalname, localUtil.ttoc( A709Trans_FechaRatificacion, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A709Trans_FechaRatificacion, "99/99/9999 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrans_FechaRatificacion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTrans_FechaRatificacion_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_INV_CONGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtTrans_FechaRatificacion_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTrans_FechaRatificacion_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_INV_CONGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
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

   public void start262( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "ALM_INV_CONGeneral", (short)(0)) ;
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
            strup260( ) ;
         }
      }
   }

   public void ws262( )
   {
      start262( ) ;
      evt262( ) ;
   }

   public void evt262( )
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
                              strup260( ) ;
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
                              strup260( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e13262 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup260( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e14262 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup260( ) ;
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
                              strup260( ) ;
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

   public void we262( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm262( ) ;
         }
      }
   }

   public void pa262( )
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
         cmbAlma_Modulo.setName( "ALMA_MODULO" );
         cmbAlma_Modulo.setWebtags( "" );
         cmbAlma_Modulo.addItem("ALMA", "ALMACEN", (short)(0));
         cmbAlma_Modulo.addItem("INVE", "INVENTARIO", (short)(0));
         cmbAlma_Modulo.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
         if ( cmbAlma_Modulo.getItemCount() > 0 )
         {
            A27Alma_Modulo = cmbAlma_Modulo.getValidValue(A27Alma_Modulo) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A27Alma_Modulo", A27Alma_Modulo);
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
      if ( cmbAlma_Modulo.getItemCount() > 0 )
      {
         A27Alma_Modulo = cmbAlma_Modulo.getValidValue(A27Alma_Modulo) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A27Alma_Modulo", A27Alma_Modulo);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf262( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV21Pgmname = "ALM_INV_CONGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rf262( )
   {
      initialize_formulas( ) ;
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00262 */
         pr_default.execute(0, new Object[] {new Long(A91Regional), new Long(A92Centro_Id), A27Alma_Modulo, A28Alma_Codigo, A31Bode_Codigo, new Long(A93Trans_Id), A66Elem_Consecutivo, new Integer(A94Num_Linea)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A623Descrip_Atributos = H00262_A623Descrip_Atributos[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A623Descrip_Atributos", A623Descrip_Atributos);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_DESCRIP_ATRIBUTOS", getSecureSignedToken( sPrefix, A623Descrip_Atributos));
            n623Descrip_Atributos = H00262_n623Descrip_Atributos[0] ;
            A622Costo_Total = H00262_A622Costo_Total[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A622Costo_Total", GXutil.ltrim( GXutil.str( A622Costo_Total, 18, 2)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_COSTO_TOTAL", getSecureSignedToken( sPrefix, localUtil.format( A622Costo_Total, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
            A621Otros_Costos = H00262_A621Otros_Costos[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A621Otros_Costos", GXutil.ltrim( GXutil.str( A621Otros_Costos, 18, 2)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_OTROS_COSTOS", getSecureSignedToken( sPrefix, localUtil.format( A621Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
            n621Otros_Costos = H00262_n621Otros_Costos[0] ;
            A620Valor_Unitario = H00262_A620Valor_Unitario[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A620Valor_Unitario", GXutil.ltrim( GXutil.str( A620Valor_Unitario, 18, 2)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_VALOR_UNITARIO", getSecureSignedToken( sPrefix, localUtil.format( A620Valor_Unitario, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
            A619Cantidad_Transito = H00262_A619Cantidad_Transito[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A619Cantidad_Transito", GXutil.ltrim( GXutil.str( A619Cantidad_Transito, 8, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CANTIDAD_TRANSITO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A619Cantidad_Transito), "ZZZZZZZ9")));
            n619Cantidad_Transito = H00262_n619Cantidad_Transito[0] ;
            A618Cantidad_Diponible = H00262_A618Cantidad_Diponible[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A618Cantidad_Diponible", GXutil.ltrim( GXutil.str( A618Cantidad_Diponible, 8, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CANTIDAD_DIPONIBLE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A618Cantidad_Diponible), "ZZZZZZZ9")));
            n618Cantidad_Diponible = H00262_n618Cantidad_Diponible[0] ;
            /* Execute user event: Load */
            e14262 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb260( ) ;
      }
   }

   public void strup260( )
   {
      /* Before Start, stand alone formulas. */
      AV21Pgmname = "ALM_INV_CONGeneral" ;
      Gx_err = (short)(0) ;
      /* Using cursor H00263 */
      pr_default.execute(1, new Object[] {new Long(A93Trans_Id)});
      A709Trans_FechaRatificacion = H00263_A709Trans_FechaRatificacion[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A709Trans_FechaRatificacion", localUtil.ttoc( A709Trans_FechaRatificacion, 10, 5, 0, 3, "/", ":", " "));
      n709Trans_FechaRatificacion = H00263_n709Trans_FechaRatificacion[0] ;
      A710Trans_ConsecutivoCC = H00263_A710Trans_ConsecutivoCC[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A710Trans_ConsecutivoCC", GXutil.ltrim( GXutil.str( A710Trans_ConsecutivoCC, 18, 0)));
      n710Trans_ConsecutivoCC = H00263_n710Trans_ConsecutivoCC[0] ;
      pr_default.close(1);
      /* Using cursor H00264 */
      pr_default.execute(2, new Object[] {A66Elem_Consecutivo});
      A37Cata_Codigo = H00264_A37Cata_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A37Cata_Codigo", A37Cata_Codigo);
      A557Elem_Descripcion = H00264_A557Elem_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A557Elem_Descripcion", A557Elem_Descripcion);
      pr_default.close(2);
      /* Using cursor H00265 */
      pr_default.execute(3, new Object[] {A37Cata_Codigo});
      A298Cata_Descripcion = H00265_A298Cata_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A298Cata_Descripcion", A298Cata_Descripcion);
      pr_default.close(3);
      pr_default.close(1);
      pr_default.close(2);
      pr_default.close(3);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e13262 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A618Cantidad_Diponible = (int)(localUtil.ctol( httpContext.cgiGet( edtCantidad_Diponible_Internalname), ",", ".")) ;
         n618Cantidad_Diponible = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A618Cantidad_Diponible", GXutil.ltrim( GXutil.str( A618Cantidad_Diponible, 8, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CANTIDAD_DIPONIBLE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A618Cantidad_Diponible), "ZZZZZZZ9")));
         A619Cantidad_Transito = (int)(localUtil.ctol( httpContext.cgiGet( edtCantidad_Transito_Internalname), ",", ".")) ;
         n619Cantidad_Transito = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A619Cantidad_Transito", GXutil.ltrim( GXutil.str( A619Cantidad_Transito, 8, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CANTIDAD_TRANSITO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A619Cantidad_Transito), "ZZZZZZZ9")));
         A620Valor_Unitario = localUtil.ctond( httpContext.cgiGet( edtValor_Unitario_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A620Valor_Unitario", GXutil.ltrim( GXutil.str( A620Valor_Unitario, 18, 2)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_VALOR_UNITARIO", getSecureSignedToken( sPrefix, localUtil.format( A620Valor_Unitario, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         A621Otros_Costos = localUtil.ctond( httpContext.cgiGet( edtOtros_Costos_Internalname)) ;
         n621Otros_Costos = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A621Otros_Costos", GXutil.ltrim( GXutil.str( A621Otros_Costos, 18, 2)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_OTROS_COSTOS", getSecureSignedToken( sPrefix, localUtil.format( A621Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         A622Costo_Total = localUtil.ctond( httpContext.cgiGet( edtCosto_Total_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A622Costo_Total", GXutil.ltrim( GXutil.str( A622Costo_Total, 18, 2)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_COSTO_TOTAL", getSecureSignedToken( sPrefix, localUtil.format( A622Costo_Total, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         A623Descrip_Atributos = httpContext.cgiGet( edtDescrip_Atributos_Internalname) ;
         n623Descrip_Atributos = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A623Descrip_Atributos", A623Descrip_Atributos);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_DESCRIP_ATRIBUTOS", getSecureSignedToken( sPrefix, A623Descrip_Atributos));
         A557Elem_Descripcion = httpContext.cgiGet( edtElem_Descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A557Elem_Descripcion", A557Elem_Descripcion);
         A37Cata_Codigo = httpContext.cgiGet( edtCata_Codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A37Cata_Codigo", A37Cata_Codigo);
         A298Cata_Descripcion = GXutil.upper( httpContext.cgiGet( edtCata_Descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A298Cata_Descripcion", A298Cata_Descripcion);
         A710Trans_ConsecutivoCC = localUtil.ctol( httpContext.cgiGet( edtTrans_ConsecutivoCC_Internalname), ",", ".") ;
         n710Trans_ConsecutivoCC = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A710Trans_ConsecutivoCC", GXutil.ltrim( GXutil.str( A710Trans_ConsecutivoCC, 18, 0)));
         A709Trans_FechaRatificacion = localUtil.ctot( httpContext.cgiGet( edtTrans_FechaRatificacion_Internalname), 0) ;
         n709Trans_FechaRatificacion = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A709Trans_FechaRatificacion", localUtil.ttoc( A709Trans_FechaRatificacion, 10, 5, 0, 3, "/", ":", " "));
         /* Read saved values. */
         wcpOA91Regional = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA91Regional"), ",", ".") ;
         wcpOA27Alma_Modulo = httpContext.cgiGet( sPrefix+"wcpOA27Alma_Modulo") ;
         wcpOA28Alma_Codigo = httpContext.cgiGet( sPrefix+"wcpOA28Alma_Codigo") ;
         wcpOA31Bode_Codigo = httpContext.cgiGet( sPrefix+"wcpOA31Bode_Codigo") ;
         wcpOA93Trans_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA93Trans_Id"), ",", ".") ;
         wcpOA66Elem_Consecutivo = httpContext.cgiGet( sPrefix+"wcpOA66Elem_Consecutivo") ;
         wcpOA94Num_Linea = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA94Num_Linea"), ",", ".")) ;
         wcpOA92Centro_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA92Centro_Id"), ",", ".") ;
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
      e13262 ();
      if (returnInSub) return;
   }

   public void e13262( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV21Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV21Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
   }

   protected void nextLoad( )
   {
   }

   protected void e14262( )
   {
      /* Load Routine */
      edtElem_Descripcion_Link = formatLink("com.orions2.viewalm_elemento") + "?" + GXutil.URLEncode(GXutil.rtrim(A66Elem_Consecutivo)) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtElem_Descripcion_Internalname, "Link", edtElem_Descripcion_Link, true);
      edtCata_Descripcion_Link = formatLink("com.orions2.viewalm_catalogo") + "?" + GXutil.URLEncode(GXutil.rtrim(A37Cata_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCata_Descripcion_Internalname, "Link", edtCata_Descripcion_Link, true);
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV15TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV15TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV21Pgmname );
      AV15TrnContext.setgxTv_SdtTransactionContext_Callerondelete( false );
      AV15TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV18HTTPRequest.getScriptName()+"?"+AV18HTTPRequest.getQuerystring() );
      AV15TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_INV_CON" );
      AV16TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV16TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Regional" );
      AV16TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV7Regional, 11, 0) );
      AV15TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV16TrnContextAtt, 0);
      AV16TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV16TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Alma_Modulo" );
      AV16TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( AV8Alma_Modulo );
      AV15TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV16TrnContextAtt, 0);
      AV16TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV16TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Alma_Codigo" );
      AV16TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( AV9Alma_Codigo );
      AV15TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV16TrnContextAtt, 0);
      AV16TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV16TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Bode_Codigo" );
      AV16TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( AV10Bode_Codigo );
      AV15TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV16TrnContextAtt, 0);
      AV16TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV16TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Trans_Id" );
      AV16TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV11Trans_Id, 11, 0) );
      AV15TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV16TrnContextAtt, 0);
      AV16TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV16TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Elem_Consecutivo" );
      AV16TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( AV12Elem_Consecutivo );
      AV15TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV16TrnContextAtt, 0);
      AV16TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV16TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Num_Linea" );
      AV16TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV13Num_Linea, 8, 0) );
      AV15TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV16TrnContextAtt, 0);
      AV16TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV16TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Centro_Id" );
      AV16TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV14Centro_Id, 11, 0) );
      AV15TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV16TrnContextAtt, 0);
      AV17Session.setValue("TrnContext", AV15TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      A91Regional = ((Number) GXutil.testNumericType( getParm(obj,0,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A91Regional", GXutil.ltrim( GXutil.str( A91Regional, 11, 0)));
      A27Alma_Modulo = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A27Alma_Modulo", A27Alma_Modulo);
      A28Alma_Codigo = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A28Alma_Codigo", A28Alma_Codigo);
      A31Bode_Codigo = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A31Bode_Codigo", A31Bode_Codigo);
      A93Trans_Id = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A93Trans_Id", GXutil.ltrim( GXutil.str( A93Trans_Id, 11, 0)));
      A66Elem_Consecutivo = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
      A94Num_Linea = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A94Num_Linea", GXutil.ltrim( GXutil.str( A94Num_Linea, 8, 0)));
      A92Centro_Id = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A92Centro_Id", GXutil.ltrim( GXutil.str( A92Centro_Id, 11, 0)));
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
      pa262( ) ;
      ws262( ) ;
      we262( ) ;
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
      sCtrlA91Regional = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlA27Alma_Modulo = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlA28Alma_Codigo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlA31Bode_Codigo = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlA93Trans_Id = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlA66Elem_Consecutivo = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlA94Num_Linea = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlA92Centro_Id = (String)getParm(obj,7,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa262( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "alm_inv_congeneral");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa262( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A91Regional = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A91Regional", GXutil.ltrim( GXutil.str( A91Regional, 11, 0)));
         A27Alma_Modulo = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A27Alma_Modulo", A27Alma_Modulo);
         A28Alma_Codigo = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A28Alma_Codigo", A28Alma_Codigo);
         A31Bode_Codigo = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A31Bode_Codigo", A31Bode_Codigo);
         A93Trans_Id = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A93Trans_Id", GXutil.ltrim( GXutil.str( A93Trans_Id, 11, 0)));
         A66Elem_Consecutivo = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
         A94Num_Linea = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A94Num_Linea", GXutil.ltrim( GXutil.str( A94Num_Linea, 8, 0)));
         A92Centro_Id = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A92Centro_Id", GXutil.ltrim( GXutil.str( A92Centro_Id, 11, 0)));
      }
      wcpOA91Regional = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA91Regional"), ",", ".") ;
      wcpOA27Alma_Modulo = httpContext.cgiGet( sPrefix+"wcpOA27Alma_Modulo") ;
      wcpOA28Alma_Codigo = httpContext.cgiGet( sPrefix+"wcpOA28Alma_Codigo") ;
      wcpOA31Bode_Codigo = httpContext.cgiGet( sPrefix+"wcpOA31Bode_Codigo") ;
      wcpOA93Trans_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA93Trans_Id"), ",", ".") ;
      wcpOA66Elem_Consecutivo = httpContext.cgiGet( sPrefix+"wcpOA66Elem_Consecutivo") ;
      wcpOA94Num_Linea = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA94Num_Linea"), ",", ".")) ;
      wcpOA92Centro_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA92Centro_Id"), ",", ".") ;
      if ( ! GetJustCreated( ) && ( ( A91Regional != wcpOA91Regional ) || ( GXutil.strcmp(A27Alma_Modulo, wcpOA27Alma_Modulo) != 0 ) || ( GXutil.strcmp(A28Alma_Codigo, wcpOA28Alma_Codigo) != 0 ) || ( GXutil.strcmp(A31Bode_Codigo, wcpOA31Bode_Codigo) != 0 ) || ( A93Trans_Id != wcpOA93Trans_Id ) || ( GXutil.strcmp(A66Elem_Consecutivo, wcpOA66Elem_Consecutivo) != 0 ) || ( A94Num_Linea != wcpOA94Num_Linea ) || ( A92Centro_Id != wcpOA92Centro_Id ) ) )
      {
         setjustcreated();
      }
      wcpOA91Regional = A91Regional ;
      wcpOA27Alma_Modulo = A27Alma_Modulo ;
      wcpOA28Alma_Codigo = A28Alma_Codigo ;
      wcpOA31Bode_Codigo = A31Bode_Codigo ;
      wcpOA93Trans_Id = A93Trans_Id ;
      wcpOA66Elem_Consecutivo = A66Elem_Consecutivo ;
      wcpOA94Num_Linea = A94Num_Linea ;
      wcpOA92Centro_Id = A92Centro_Id ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA91Regional = httpContext.cgiGet( sPrefix+"A91Regional_CTRL") ;
      if ( GXutil.len( sCtrlA91Regional) > 0 )
      {
         A91Regional = localUtil.ctol( httpContext.cgiGet( sCtrlA91Regional), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A91Regional", GXutil.ltrim( GXutil.str( A91Regional, 11, 0)));
      }
      else
      {
         A91Regional = localUtil.ctol( httpContext.cgiGet( sPrefix+"A91Regional_PARM"), ",", ".") ;
      }
      sCtrlA27Alma_Modulo = httpContext.cgiGet( sPrefix+"A27Alma_Modulo_CTRL") ;
      if ( GXutil.len( sCtrlA27Alma_Modulo) > 0 )
      {
         A27Alma_Modulo = httpContext.cgiGet( sCtrlA27Alma_Modulo) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A27Alma_Modulo", A27Alma_Modulo);
      }
      else
      {
         A27Alma_Modulo = httpContext.cgiGet( sPrefix+"A27Alma_Modulo_PARM") ;
      }
      sCtrlA28Alma_Codigo = httpContext.cgiGet( sPrefix+"A28Alma_Codigo_CTRL") ;
      if ( GXutil.len( sCtrlA28Alma_Codigo) > 0 )
      {
         A28Alma_Codigo = httpContext.cgiGet( sCtrlA28Alma_Codigo) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A28Alma_Codigo", A28Alma_Codigo);
      }
      else
      {
         A28Alma_Codigo = httpContext.cgiGet( sPrefix+"A28Alma_Codigo_PARM") ;
      }
      sCtrlA31Bode_Codigo = httpContext.cgiGet( sPrefix+"A31Bode_Codigo_CTRL") ;
      if ( GXutil.len( sCtrlA31Bode_Codigo) > 0 )
      {
         A31Bode_Codigo = httpContext.cgiGet( sCtrlA31Bode_Codigo) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A31Bode_Codigo", A31Bode_Codigo);
      }
      else
      {
         A31Bode_Codigo = httpContext.cgiGet( sPrefix+"A31Bode_Codigo_PARM") ;
      }
      sCtrlA93Trans_Id = httpContext.cgiGet( sPrefix+"A93Trans_Id_CTRL") ;
      if ( GXutil.len( sCtrlA93Trans_Id) > 0 )
      {
         A93Trans_Id = localUtil.ctol( httpContext.cgiGet( sCtrlA93Trans_Id), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A93Trans_Id", GXutil.ltrim( GXutil.str( A93Trans_Id, 11, 0)));
      }
      else
      {
         A93Trans_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"A93Trans_Id_PARM"), ",", ".") ;
      }
      sCtrlA66Elem_Consecutivo = httpContext.cgiGet( sPrefix+"A66Elem_Consecutivo_CTRL") ;
      if ( GXutil.len( sCtrlA66Elem_Consecutivo) > 0 )
      {
         A66Elem_Consecutivo = httpContext.cgiGet( sCtrlA66Elem_Consecutivo) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
      }
      else
      {
         A66Elem_Consecutivo = httpContext.cgiGet( sPrefix+"A66Elem_Consecutivo_PARM") ;
      }
      sCtrlA94Num_Linea = httpContext.cgiGet( sPrefix+"A94Num_Linea_CTRL") ;
      if ( GXutil.len( sCtrlA94Num_Linea) > 0 )
      {
         A94Num_Linea = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlA94Num_Linea), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A94Num_Linea", GXutil.ltrim( GXutil.str( A94Num_Linea, 8, 0)));
      }
      else
      {
         A94Num_Linea = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A94Num_Linea_PARM"), ",", ".")) ;
      }
      sCtrlA92Centro_Id = httpContext.cgiGet( sPrefix+"A92Centro_Id_CTRL") ;
      if ( GXutil.len( sCtrlA92Centro_Id) > 0 )
      {
         A92Centro_Id = localUtil.ctol( httpContext.cgiGet( sCtrlA92Centro_Id), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A92Centro_Id", GXutil.ltrim( GXutil.str( A92Centro_Id, 11, 0)));
      }
      else
      {
         A92Centro_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"A92Centro_Id_PARM"), ",", ".") ;
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
      pa262( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws262( ) ;
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
      ws262( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A91Regional_PARM", GXutil.ltrim( localUtil.ntoc( A91Regional, (byte)(11), (byte)(0), ",", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA91Regional)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A91Regional_CTRL", GXutil.rtrim( sCtrlA91Regional));
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A27Alma_Modulo_PARM", A27Alma_Modulo);
      if ( GXutil.len( GXutil.rtrim( sCtrlA27Alma_Modulo)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A27Alma_Modulo_CTRL", GXutil.rtrim( sCtrlA27Alma_Modulo));
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A28Alma_Codigo_PARM", A28Alma_Codigo);
      if ( GXutil.len( GXutil.rtrim( sCtrlA28Alma_Codigo)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A28Alma_Codigo_CTRL", GXutil.rtrim( sCtrlA28Alma_Codigo));
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A31Bode_Codigo_PARM", A31Bode_Codigo);
      if ( GXutil.len( GXutil.rtrim( sCtrlA31Bode_Codigo)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A31Bode_Codigo_CTRL", GXutil.rtrim( sCtrlA31Bode_Codigo));
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A93Trans_Id_PARM", GXutil.ltrim( localUtil.ntoc( A93Trans_Id, (byte)(11), (byte)(0), ",", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA93Trans_Id)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A93Trans_Id_CTRL", GXutil.rtrim( sCtrlA93Trans_Id));
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A66Elem_Consecutivo_PARM", A66Elem_Consecutivo);
      if ( GXutil.len( GXutil.rtrim( sCtrlA66Elem_Consecutivo)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A66Elem_Consecutivo_CTRL", GXutil.rtrim( sCtrlA66Elem_Consecutivo));
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A94Num_Linea_PARM", GXutil.ltrim( localUtil.ntoc( A94Num_Linea, (byte)(8), (byte)(0), ",", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA94Num_Linea)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A94Num_Linea_CTRL", GXutil.rtrim( sCtrlA94Num_Linea));
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A92Centro_Id_PARM", GXutil.ltrim( localUtil.ntoc( A92Centro_Id, (byte)(11), (byte)(0), ",", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA92Centro_Id)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A92Centro_Id_CTRL", GXutil.rtrim( sCtrlA92Centro_Id));
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
      we262( ) ;
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
      httpContext.AddStyleSheetFile("calendar-system.css", "?14361167");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20186141415911");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("alm_inv_congeneral.js", "?20186141415911");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      cmbAlma_Modulo.setInternalname( sPrefix+"ALMA_MODULO" );
      edtBode_Codigo_Internalname = sPrefix+"BODE_CODIGO" ;
      edtElem_Consecutivo_Internalname = sPrefix+"ELEM_CONSECUTIVO" ;
      edtNum_Linea_Internalname = sPrefix+"NUM_LINEA" ;
      edtCantidad_Diponible_Internalname = sPrefix+"CANTIDAD_DIPONIBLE" ;
      edtCantidad_Transito_Internalname = sPrefix+"CANTIDAD_TRANSITO" ;
      edtValor_Unitario_Internalname = sPrefix+"VALOR_UNITARIO" ;
      edtOtros_Costos_Internalname = sPrefix+"OTROS_COSTOS" ;
      edtCosto_Total_Internalname = sPrefix+"COSTO_TOTAL" ;
      edtDescrip_Atributos_Internalname = sPrefix+"DESCRIP_ATRIBUTOS" ;
      edtElem_Descripcion_Internalname = sPrefix+"ELEM_DESCRIPCION" ;
      edtCata_Codigo_Internalname = sPrefix+"CATA_CODIGO" ;
      edtCata_Descripcion_Internalname = sPrefix+"CATA_DESCRIPCION" ;
      edtAlma_Codigo_Internalname = sPrefix+"ALMA_CODIGO" ;
      edtRegional_Internalname = sPrefix+"REGIONAL" ;
      edtTrans_Id_Internalname = sPrefix+"TRANS_ID" ;
      edtCentro_Id_Internalname = sPrefix+"CENTRO_ID" ;
      edtTrans_ConsecutivoCC_Internalname = sPrefix+"TRANS_CONSECUTIVOCC" ;
      edtTrans_FechaRatificacion_Internalname = sPrefix+"TRANS_FECHARATIFICACION" ;
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
      edtTrans_FechaRatificacion_Jsonclick = "" ;
      edtTrans_FechaRatificacion_Enabled = 0 ;
      edtTrans_ConsecutivoCC_Jsonclick = "" ;
      edtTrans_ConsecutivoCC_Enabled = 0 ;
      edtCentro_Id_Jsonclick = "" ;
      edtCentro_Id_Enabled = 0 ;
      edtTrans_Id_Jsonclick = "" ;
      edtTrans_Id_Enabled = 0 ;
      edtRegional_Jsonclick = "" ;
      edtRegional_Enabled = 0 ;
      edtAlma_Codigo_Jsonclick = "" ;
      edtAlma_Codigo_Enabled = 0 ;
      edtCata_Descripcion_Link = "" ;
      edtCata_Descripcion_Enabled = 0 ;
      edtCata_Codigo_Jsonclick = "" ;
      edtCata_Codigo_Enabled = 0 ;
      edtElem_Descripcion_Link = "" ;
      edtElem_Descripcion_Enabled = 0 ;
      edtDescrip_Atributos_Enabled = 0 ;
      edtCosto_Total_Jsonclick = "" ;
      edtCosto_Total_Enabled = 0 ;
      edtOtros_Costos_Jsonclick = "" ;
      edtOtros_Costos_Enabled = 0 ;
      edtValor_Unitario_Jsonclick = "" ;
      edtValor_Unitario_Enabled = 0 ;
      edtCantidad_Transito_Jsonclick = "" ;
      edtCantidad_Transito_Enabled = 0 ;
      edtCantidad_Diponible_Jsonclick = "" ;
      edtCantidad_Diponible_Enabled = 0 ;
      edtNum_Linea_Jsonclick = "" ;
      edtNum_Linea_Enabled = 0 ;
      edtElem_Consecutivo_Jsonclick = "" ;
      edtElem_Consecutivo_Enabled = 0 ;
      edtBode_Codigo_Jsonclick = "" ;
      edtBode_Codigo_Enabled = 0 ;
      cmbAlma_Modulo.setJsonclick( "" );
      cmbAlma_Modulo.setEnabled( 0 );
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
      setEventMetadata("'DOUPDATE'","{handler:'e11261',iparms:[{av:'A91Regional',fld:'REGIONAL',pic:'ZZZZZZZZZZ9',nv:0},{av:'A92Centro_Id',fld:'CENTRO_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbAlma_Modulo'},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',nv:''},{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',nv:''},{av:'A31Bode_Codigo',fld:'BODE_CODIGO',pic:'',nv:''},{av:'A93Trans_Id',fld:'TRANS_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A94Num_Linea',fld:'NUM_LINEA',pic:'ZZZZZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e12261',iparms:[{av:'A91Regional',fld:'REGIONAL',pic:'ZZZZZZZZZZ9',nv:0},{av:'A92Centro_Id',fld:'CENTRO_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbAlma_Modulo'},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',nv:''},{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',nv:''},{av:'A31Bode_Codigo',fld:'BODE_CODIGO',pic:'',nv:''},{av:'A93Trans_Id',fld:'TRANS_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A94Num_Linea',fld:'NUM_LINEA',pic:'ZZZZZZZ9',nv:0}],oparms:[]}");
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
      wcpOA27Alma_Modulo = "" ;
      wcpOA28Alma_Codigo = "" ;
      wcpOA31Bode_Codigo = "" ;
      wcpOA66Elem_Consecutivo = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      A27Alma_Modulo = "" ;
      A28Alma_Codigo = "" ;
      A31Bode_Codigo = "" ;
      A66Elem_Consecutivo = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      A620Valor_Unitario = DecimalUtil.ZERO ;
      A621Otros_Costos = DecimalUtil.ZERO ;
      A622Costo_Total = DecimalUtil.ZERO ;
      A623Descrip_Atributos = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      A557Elem_Descripcion = "" ;
      A37Cata_Codigo = "" ;
      A298Cata_Descripcion = "" ;
      A709Trans_FechaRatificacion = GXutil.resetTime( GXutil.nullDate() );
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV21Pgmname = "" ;
      scmdbuf = "" ;
      H00262_A623Descrip_Atributos = new String[] {""} ;
      H00262_n623Descrip_Atributos = new boolean[] {false} ;
      H00262_A91Regional = new long[1] ;
      H00262_A92Centro_Id = new long[1] ;
      H00262_A27Alma_Modulo = new String[] {""} ;
      H00262_A28Alma_Codigo = new String[] {""} ;
      H00262_A31Bode_Codigo = new String[] {""} ;
      H00262_A93Trans_Id = new long[1] ;
      H00262_A66Elem_Consecutivo = new String[] {""} ;
      H00262_A94Num_Linea = new int[1] ;
      H00262_A709Trans_FechaRatificacion = new java.util.Date[] {GXutil.nullDate()} ;
      H00262_n709Trans_FechaRatificacion = new boolean[] {false} ;
      H00262_A710Trans_ConsecutivoCC = new long[1] ;
      H00262_n710Trans_ConsecutivoCC = new boolean[] {false} ;
      H00262_A298Cata_Descripcion = new String[] {""} ;
      H00262_A37Cata_Codigo = new String[] {""} ;
      H00262_A557Elem_Descripcion = new String[] {""} ;
      H00262_A622Costo_Total = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00262_A621Otros_Costos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00262_n621Otros_Costos = new boolean[] {false} ;
      H00262_A620Valor_Unitario = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00262_A619Cantidad_Transito = new int[1] ;
      H00262_n619Cantidad_Transito = new boolean[] {false} ;
      H00262_A618Cantidad_Diponible = new int[1] ;
      H00262_n618Cantidad_Diponible = new boolean[] {false} ;
      H00263_A709Trans_FechaRatificacion = new java.util.Date[] {GXutil.nullDate()} ;
      H00263_n709Trans_FechaRatificacion = new boolean[] {false} ;
      H00263_A710Trans_ConsecutivoCC = new long[1] ;
      H00263_n710Trans_ConsecutivoCC = new boolean[] {false} ;
      H00264_A37Cata_Codigo = new String[] {""} ;
      H00264_A557Elem_Descripcion = new String[] {""} ;
      H00265_A298Cata_Descripcion = new String[] {""} ;
      AV15TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV18HTTPRequest = httpContext.getHttpRequest();
      AV16TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV8Alma_Modulo = "" ;
      AV9Alma_Codigo = "" ;
      AV10Bode_Codigo = "" ;
      AV12Elem_Consecutivo = "" ;
      AV17Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA91Regional = "" ;
      sCtrlA27Alma_Modulo = "" ;
      sCtrlA28Alma_Codigo = "" ;
      sCtrlA31Bode_Codigo = "" ;
      sCtrlA93Trans_Id = "" ;
      sCtrlA66Elem_Consecutivo = "" ;
      sCtrlA94Num_Linea = "" ;
      sCtrlA92Centro_Id = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_inv_congeneral__default(),
         new Object[] {
             new Object[] {
            H00262_A623Descrip_Atributos, H00262_n623Descrip_Atributos, H00262_A91Regional, H00262_A92Centro_Id, H00262_A27Alma_Modulo, H00262_A28Alma_Codigo, H00262_A31Bode_Codigo, H00262_A93Trans_Id, H00262_A66Elem_Consecutivo, H00262_A94Num_Linea,
            H00262_A709Trans_FechaRatificacion, H00262_n709Trans_FechaRatificacion, H00262_A710Trans_ConsecutivoCC, H00262_n710Trans_ConsecutivoCC, H00262_A298Cata_Descripcion, H00262_A37Cata_Codigo, H00262_A557Elem_Descripcion, H00262_A622Costo_Total, H00262_A621Otros_Costos, H00262_n621Otros_Costos,
            H00262_A620Valor_Unitario, H00262_A619Cantidad_Transito, H00262_n619Cantidad_Transito, H00262_A618Cantidad_Diponible, H00262_n618Cantidad_Diponible
            }
            , new Object[] {
            H00263_A709Trans_FechaRatificacion, H00263_n709Trans_FechaRatificacion, H00263_A710Trans_ConsecutivoCC, H00263_n710Trans_ConsecutivoCC
            }
            , new Object[] {
            H00264_A37Cata_Codigo, H00264_A557Elem_Descripcion
            }
            , new Object[] {
            H00265_A298Cata_Descripcion
            }
         }
      );
      AV21Pgmname = "ALM_INV_CONGeneral" ;
      /* GeneXus formulas. */
      AV21Pgmname = "ALM_INV_CONGeneral" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOA94Num_Linea ;
   private int A94Num_Linea ;
   private int A618Cantidad_Diponible ;
   private int A619Cantidad_Transito ;
   private int edtBode_Codigo_Enabled ;
   private int edtElem_Consecutivo_Enabled ;
   private int edtNum_Linea_Enabled ;
   private int edtCantidad_Diponible_Enabled ;
   private int edtCantidad_Transito_Enabled ;
   private int edtValor_Unitario_Enabled ;
   private int edtOtros_Costos_Enabled ;
   private int edtCosto_Total_Enabled ;
   private int edtDescrip_Atributos_Enabled ;
   private int edtElem_Descripcion_Enabled ;
   private int edtCata_Codigo_Enabled ;
   private int edtCata_Descripcion_Enabled ;
   private int edtAlma_Codigo_Enabled ;
   private int edtRegional_Enabled ;
   private int edtTrans_Id_Enabled ;
   private int edtCentro_Id_Enabled ;
   private int edtTrans_ConsecutivoCC_Enabled ;
   private int edtTrans_FechaRatificacion_Enabled ;
   private int AV13Num_Linea ;
   private int idxLst ;
   private long wcpOA91Regional ;
   private long wcpOA93Trans_Id ;
   private long wcpOA92Centro_Id ;
   private long A91Regional ;
   private long A93Trans_Id ;
   private long A92Centro_Id ;
   private long A710Trans_ConsecutivoCC ;
   private long AV7Regional ;
   private long AV11Trans_Id ;
   private long AV14Centro_Id ;
   private java.math.BigDecimal A620Valor_Unitario ;
   private java.math.BigDecimal A621Otros_Costos ;
   private java.math.BigDecimal A622Costo_Total ;
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
   private String edtBode_Codigo_Internalname ;
   private String edtBode_Codigo_Jsonclick ;
   private String edtElem_Consecutivo_Internalname ;
   private String edtElem_Consecutivo_Jsonclick ;
   private String edtNum_Linea_Internalname ;
   private String edtNum_Linea_Jsonclick ;
   private String edtCantidad_Diponible_Internalname ;
   private String edtCantidad_Diponible_Jsonclick ;
   private String edtCantidad_Transito_Internalname ;
   private String edtCantidad_Transito_Jsonclick ;
   private String edtValor_Unitario_Internalname ;
   private String edtValor_Unitario_Jsonclick ;
   private String edtOtros_Costos_Internalname ;
   private String edtOtros_Costos_Jsonclick ;
   private String edtCosto_Total_Internalname ;
   private String edtCosto_Total_Jsonclick ;
   private String edtDescrip_Atributos_Internalname ;
   private String edtElem_Descripcion_Internalname ;
   private String edtElem_Descripcion_Link ;
   private String edtCata_Codigo_Internalname ;
   private String edtCata_Codigo_Jsonclick ;
   private String edtCata_Descripcion_Internalname ;
   private String edtCata_Descripcion_Link ;
   private String edtAlma_Codigo_Internalname ;
   private String edtAlma_Codigo_Jsonclick ;
   private String edtRegional_Internalname ;
   private String edtRegional_Jsonclick ;
   private String edtTrans_Id_Internalname ;
   private String edtTrans_Id_Jsonclick ;
   private String edtCentro_Id_Internalname ;
   private String edtCentro_Id_Jsonclick ;
   private String edtTrans_ConsecutivoCC_Internalname ;
   private String edtTrans_ConsecutivoCC_Jsonclick ;
   private String edtTrans_FechaRatificacion_Internalname ;
   private String edtTrans_FechaRatificacion_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV21Pgmname ;
   private String scmdbuf ;
   private String sCtrlA91Regional ;
   private String sCtrlA27Alma_Modulo ;
   private String sCtrlA28Alma_Codigo ;
   private String sCtrlA31Bode_Codigo ;
   private String sCtrlA93Trans_Id ;
   private String sCtrlA66Elem_Consecutivo ;
   private String sCtrlA94Num_Linea ;
   private String sCtrlA92Centro_Id ;
   private java.util.Date A709Trans_FechaRatificacion ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n623Descrip_Atributos ;
   private boolean n621Otros_Costos ;
   private boolean n619Cantidad_Transito ;
   private boolean n618Cantidad_Diponible ;
   private boolean n709Trans_FechaRatificacion ;
   private boolean n710Trans_ConsecutivoCC ;
   private boolean returnInSub ;
   private String A623Descrip_Atributos ;
   private String wcpOA27Alma_Modulo ;
   private String wcpOA28Alma_Codigo ;
   private String wcpOA31Bode_Codigo ;
   private String wcpOA66Elem_Consecutivo ;
   private String A27Alma_Modulo ;
   private String A28Alma_Codigo ;
   private String A31Bode_Codigo ;
   private String A66Elem_Consecutivo ;
   private String A557Elem_Descripcion ;
   private String A37Cata_Codigo ;
   private String A298Cata_Descripcion ;
   private String AV8Alma_Modulo ;
   private String AV9Alma_Codigo ;
   private String AV10Bode_Codigo ;
   private String AV12Elem_Consecutivo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV18HTTPRequest ;
   private HTMLChoice cmbAlma_Modulo ;
   private IDataStoreProvider pr_default ;
   private String[] H00262_A623Descrip_Atributos ;
   private boolean[] H00262_n623Descrip_Atributos ;
   private long[] H00262_A91Regional ;
   private long[] H00262_A92Centro_Id ;
   private String[] H00262_A27Alma_Modulo ;
   private String[] H00262_A28Alma_Codigo ;
   private String[] H00262_A31Bode_Codigo ;
   private long[] H00262_A93Trans_Id ;
   private String[] H00262_A66Elem_Consecutivo ;
   private int[] H00262_A94Num_Linea ;
   private java.util.Date[] H00262_A709Trans_FechaRatificacion ;
   private boolean[] H00262_n709Trans_FechaRatificacion ;
   private long[] H00262_A710Trans_ConsecutivoCC ;
   private boolean[] H00262_n710Trans_ConsecutivoCC ;
   private String[] H00262_A298Cata_Descripcion ;
   private String[] H00262_A37Cata_Codigo ;
   private String[] H00262_A557Elem_Descripcion ;
   private java.math.BigDecimal[] H00262_A622Costo_Total ;
   private java.math.BigDecimal[] H00262_A621Otros_Costos ;
   private boolean[] H00262_n621Otros_Costos ;
   private java.math.BigDecimal[] H00262_A620Valor_Unitario ;
   private int[] H00262_A619Cantidad_Transito ;
   private boolean[] H00262_n619Cantidad_Transito ;
   private int[] H00262_A618Cantidad_Diponible ;
   private boolean[] H00262_n618Cantidad_Diponible ;
   private java.util.Date[] H00263_A709Trans_FechaRatificacion ;
   private boolean[] H00263_n709Trans_FechaRatificacion ;
   private long[] H00263_A710Trans_ConsecutivoCC ;
   private boolean[] H00263_n710Trans_ConsecutivoCC ;
   private String[] H00264_A37Cata_Codigo ;
   private String[] H00264_A557Elem_Descripcion ;
   private String[] H00265_A298Cata_Descripcion ;
   private com.genexus.webpanels.WebSession AV17Session ;
   private com.orions2.SdtTransactionContext AV15TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV16TrnContextAtt ;
}

final  class alm_inv_congeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00262", "SELECT T1.Descrip_Atributos, T1.Regional, T1.Centro_Id, T1.Alma_Modulo, T1.Alma_Codigo, T1.Bode_Codigo, T1.Trans_Id AS Trans_Id, T1.Elem_Consecutivo, T1.Num_Linea, T2.Tran_FechaRatificacion AS Trans_FechaRatificacion, T2.Tran_ConsecutivoCC AS Trans_ConsecutivoCC, T4.Cata_Descripcion, T3.Cata_Codigo, T3.Elem_Descripcion, T1.Costo_Total, T1.Otros_Costos, T1.Valor_Unitario, T1.Cantidad_Transito, T1.Cantidad_Diponible FROM (((ALM_INV_CON T1 INNER JOIN ALM_TRANSACCION T2 ON T2.Tran_Id = T1.Trans_Id) INNER JOIN ALM_ELEMENTO T3 ON T3.Elem_Consecutivo = T1.Elem_Consecutivo) INNER JOIN ALM_CATALOGO T4 ON T4.Cata_Codigo = T3.Cata_Codigo) WHERE T1.Regional = ? and T1.Centro_Id = ? and T1.Alma_Modulo = ? and T1.Alma_Codigo = ? and T1.Bode_Codigo = ? and T1.Trans_Id = ? and T1.Elem_Consecutivo = ? and T1.Num_Linea = ? ORDER BY T1.Regional, T1.Centro_Id, T1.Alma_Modulo, T1.Alma_Codigo, T1.Bode_Codigo, T1.Trans_Id, T1.Elem_Consecutivo, T1.Num_Linea ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00263", "SELECT Tran_FechaRatificacion AS Trans_FechaRatificacion, Tran_ConsecutivoCC AS Trans_ConsecutivoCC FROM ALM_TRANSACCION WHERE Tran_Id = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00264", "SELECT Cata_Codigo, Elem_Descripcion FROM ALM_ELEMENTO WHERE Elem_Consecutivo = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00265", "SELECT Cata_Descripcion FROM ALM_CATALOGO WHERE Cata_Codigo = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((long[]) buf[7])[0] = rslt.getLong(7) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(8) ;
               ((int[]) buf[9])[0] = rslt.getInt(9) ;
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(11) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(12) ;
               ((String[]) buf[15])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[16])[0] = rslt.getVarchar(14) ;
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(15,2) ;
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(16,2) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(17,2) ;
               ((int[]) buf[21])[0] = rslt.getInt(18) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((int[]) buf[23])[0] = rslt.getInt(19) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 8, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               stmt.setVarchar(5, (String)parms[4], 3, false);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setVarchar(7, (String)parms[6], 9, false);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
      }
   }

}

