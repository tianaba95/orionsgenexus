/*
               File: alm_inv_kardexgeneral_impl
        Description: ALM_INV_KARDEXGeneral
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:35.20
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

public final  class alm_inv_kardexgeneral_impl extends GXWebComponent
{
   public alm_inv_kardexgeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_inv_kardexgeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_inv_kardexgeneral_impl.class ));
   }

   public alm_inv_kardexgeneral_impl( int remoteHandle ,
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
               A85Kard_Regi_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A85Kard_Regi_Id", GXutil.ltrim( GXutil.str( A85Kard_Regi_Id, 11, 0)));
               A86Kard_Cent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A86Kard_Cent_Id", GXutil.ltrim( GXutil.str( A86Kard_Cent_Id, 11, 0)));
               A87Kard_Alm_Cod = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A87Kard_Alm_Cod", A87Kard_Alm_Cod);
               A88Kard_Bod_Cod = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A88Kard_Bod_Cod", A88Kard_Bod_Cod);
               A89Kard_Elem_Cons = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A89Kard_Elem_Cons", A89Kard_Elem_Cons);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,new Long(A85Kard_Regi_Id),new Long(A86Kard_Cent_Id),A87Kard_Alm_Cod,A88Kard_Bod_Cod,A89Kard_Elem_Cons});
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
         pa5T2( ) ;
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
         httpContext.writeValue( "ALM_INV_KARDEXGeneral") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414103522");
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_inv_kardexgeneral") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A85Kard_Regi_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A86Kard_Cent_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(A87Kard_Alm_Cod)) + "," + GXutil.URLEncode(GXutil.rtrim(A88Kard_Bod_Cod)) + "," + GXutil.URLEncode(GXutil.rtrim(A89Kard_Elem_Cons))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA85Kard_Regi_Id", GXutil.ltrim( localUtil.ntoc( wcpOA85Kard_Regi_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA86Kard_Cent_Id", GXutil.ltrim( localUtil.ntoc( wcpOA86Kard_Cent_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA87Kard_Alm_Cod", wcpOA87Kard_Alm_Cod);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA88Kard_Bod_Cod", wcpOA88Kard_Bod_Cod);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA89Kard_Elem_Cons", wcpOA89Kard_Elem_Cons);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_KARD_REGI_COD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A577Kard_Regi_Cod), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_KARD_CENT_COD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A578Kard_Cent_Cod, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_KARD_VAL_UNITARIO", getSecureSignedToken( sPrefix, localUtil.format( A588Kard_Val_Unitario, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_KARD_SALDO_CANT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A590Kard_Saldo_Cant), "ZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_KARD_SALDO_VALOR", getSecureSignedToken( sPrefix, localUtil.format( A589Kard_Saldo_Valor, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm5T2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("alm_inv_kardexgeneral.js", "?201861414103524");
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
      return "ALM_INV_KARDEXGeneral" ;
   }

   public String getPgmdesc( )
   {
      return "ALM_INV_KARDEXGeneral" ;
   }

   public void wb5T0( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.alm_inv_kardexgeneral");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", "Modificar", bttBtnupdate_Jsonclick, 7, "Modificar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e115t1_client"+"'", TempTags, "", 2, "HLP_ALM_INV_KARDEXGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", "Eliminar", bttBtndelete_Jsonclick, 7, "Eliminar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e125t1_client"+"'", TempTags, "", 2, "HLP_ALM_INV_KARDEXGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtKard_Regi_Id_Internalname, "Regional Id", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtKard_Regi_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A85Kard_Regi_Id, (byte)(11), (byte)(0), ",", "")), ((edtKard_Regi_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A85Kard_Regi_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A85Kard_Regi_Id), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtKard_Regi_Id_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtKard_Regi_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_INV_KARDEXGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtKard_Regi_Cod_Internalname, "Regional Codigo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtKard_Regi_Cod_Internalname, GXutil.ltrim( localUtil.ntoc( A577Kard_Regi_Cod, (byte)(4), (byte)(0), ",", "")), ((edtKard_Regi_Cod_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A577Kard_Regi_Cod), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A577Kard_Regi_Cod), "ZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtKard_Regi_Cod_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtKard_Regi_Cod_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_INV_KARDEXGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtKard_Cent_Id_Internalname, "Costo Id", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtKard_Cent_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A86Kard_Cent_Id, (byte)(11), (byte)(0), ",", "")), ((edtKard_Cent_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A86Kard_Cent_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A86Kard_Cent_Id), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtKard_Cent_Id_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtKard_Cent_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_INV_KARDEXGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtKard_Cent_Cod_Internalname, "Costo Codigo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtKard_Cent_Cod_Internalname, A578Kard_Cent_Cod, GXutil.rtrim( localUtil.format( A578Kard_Cent_Cod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtKard_Cent_Cod_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtKard_Cent_Cod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_INV_KARDEXGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtKard_Alm_Cod_Internalname, "Almacen Codigo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtKard_Alm_Cod_Internalname, A87Kard_Alm_Cod, GXutil.rtrim( localUtil.format( A87Kard_Alm_Cod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtKard_Alm_Cod_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtKard_Alm_Cod_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_INV_KARDEXGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtKard_Bod_Cod_Internalname, "Bodega Codigo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtKard_Bod_Cod_Internalname, A88Kard_Bod_Cod, GXutil.rtrim( localUtil.format( A88Kard_Bod_Cod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtKard_Bod_Cod_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtKard_Bod_Cod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_INV_KARDEXGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtKard_Elem_Cons_Internalname, "Elemento Consecutivo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtKard_Elem_Cons_Internalname, A89Kard_Elem_Cons, GXutil.rtrim( localUtil.format( A89Kard_Elem_Cons, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtKard_Elem_Cons_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtKard_Elem_Cons_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_INV_KARDEXGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtKard_Val_Unitario_Internalname, "Valor Unitario", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtKard_Val_Unitario_Internalname, GXutil.ltrim( localUtil.ntoc( A588Kard_Val_Unitario, (byte)(24), (byte)(2), ",", "")), ((edtKard_Val_Unitario_Enabled!=0) ? GXutil.ltrim( localUtil.format( A588Kard_Val_Unitario, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A588Kard_Val_Unitario, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtKard_Val_Unitario_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtKard_Val_Unitario_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_ALM_INV_KARDEXGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtKard_Saldo_Cant_Internalname, "Saldo Canitdad", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtKard_Saldo_Cant_Internalname, GXutil.ltrim( localUtil.ntoc( A590Kard_Saldo_Cant, (byte)(8), (byte)(0), ",", "")), ((edtKard_Saldo_Cant_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A590Kard_Saldo_Cant), "ZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A590Kard_Saldo_Cant), "ZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtKard_Saldo_Cant_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtKard_Saldo_Cant_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_INV_KARDEXGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtKard_Saldo_Valor_Internalname, "Saldo Valor", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtKard_Saldo_Valor_Internalname, GXutil.ltrim( localUtil.ntoc( A589Kard_Saldo_Valor, (byte)(24), (byte)(2), ",", "")), ((edtKard_Saldo_Valor_Enabled!=0) ? GXutil.ltrim( localUtil.format( A589Kard_Saldo_Valor, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A589Kard_Saldo_Valor, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtKard_Saldo_Valor_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtKard_Saldo_Valor_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_ALM_INV_KARDEXGeneral.htm");
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

   public void start5T2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "ALM_INV_KARDEXGeneral", (short)(0)) ;
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
            strup5T0( ) ;
         }
      }
   }

   public void ws5T2( )
   {
      start5T2( ) ;
      evt5T2( ) ;
   }

   public void evt5T2( )
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
                              strup5T0( ) ;
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
                              strup5T0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e135T2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup5T0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e145T2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup5T0( ) ;
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
                              strup5T0( ) ;
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

   public void we5T2( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm5T2( ) ;
         }
      }
   }

   public void pa5T2( )
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
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf5T2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV18Pgmname = "ALM_INV_KARDEXGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rf5T2( )
   {
      initialize_formulas( ) ;
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H005T2 */
         pr_default.execute(0, new Object[] {new Long(A85Kard_Regi_Id), new Long(A86Kard_Cent_Id), A87Kard_Alm_Cod, A88Kard_Bod_Cod, A89Kard_Elem_Cons});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A578Kard_Cent_Cod = H005T2_A578Kard_Cent_Cod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A578Kard_Cent_Cod", A578Kard_Cent_Cod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_KARD_CENT_COD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A578Kard_Cent_Cod, ""))));
            A577Kard_Regi_Cod = H005T2_A577Kard_Regi_Cod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A577Kard_Regi_Cod", GXutil.ltrim( GXutil.str( A577Kard_Regi_Cod, 4, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_KARD_REGI_COD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A577Kard_Regi_Cod), "ZZZ9")));
            A590Kard_Saldo_Cant = H005T2_A590Kard_Saldo_Cant[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A590Kard_Saldo_Cant", GXutil.ltrim( GXutil.str( A590Kard_Saldo_Cant, 8, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_KARD_SALDO_CANT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A590Kard_Saldo_Cant), "ZZZZZZZ9")));
            n590Kard_Saldo_Cant = H005T2_n590Kard_Saldo_Cant[0] ;
            A589Kard_Saldo_Valor = H005T2_A589Kard_Saldo_Valor[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A589Kard_Saldo_Valor", GXutil.ltrim( GXutil.str( A589Kard_Saldo_Valor, 18, 2)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_KARD_SALDO_VALOR", getSecureSignedToken( sPrefix, localUtil.format( A589Kard_Saldo_Valor, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
            n589Kard_Saldo_Valor = H005T2_n589Kard_Saldo_Valor[0] ;
            A588Kard_Val_Unitario = A589Kard_Saldo_Valor.divide(DecimalUtil.doubleToDec(A590Kard_Saldo_Cant), 18, java.math.BigDecimal.ROUND_DOWN) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A588Kard_Val_Unitario", GXutil.ltrim( GXutil.str( A588Kard_Val_Unitario, 18, 2)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_KARD_VAL_UNITARIO", getSecureSignedToken( sPrefix, localUtil.format( A588Kard_Val_Unitario, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
            /* Execute user event: Load */
            e145T2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb5T0( ) ;
      }
   }

   public void strup5T0( )
   {
      /* Before Start, stand alone formulas. */
      AV18Pgmname = "ALM_INV_KARDEXGeneral" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e135T2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A577Kard_Regi_Cod = (short)(localUtil.ctol( httpContext.cgiGet( edtKard_Regi_Cod_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A577Kard_Regi_Cod", GXutil.ltrim( GXutil.str( A577Kard_Regi_Cod, 4, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_KARD_REGI_COD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A577Kard_Regi_Cod), "ZZZ9")));
         A578Kard_Cent_Cod = httpContext.cgiGet( edtKard_Cent_Cod_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A578Kard_Cent_Cod", A578Kard_Cent_Cod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_KARD_CENT_COD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A578Kard_Cent_Cod, ""))));
         A588Kard_Val_Unitario = localUtil.ctond( httpContext.cgiGet( edtKard_Val_Unitario_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A588Kard_Val_Unitario", GXutil.ltrim( GXutil.str( A588Kard_Val_Unitario, 18, 2)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_KARD_VAL_UNITARIO", getSecureSignedToken( sPrefix, localUtil.format( A588Kard_Val_Unitario, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         A590Kard_Saldo_Cant = (int)(localUtil.ctol( httpContext.cgiGet( edtKard_Saldo_Cant_Internalname), ",", ".")) ;
         n590Kard_Saldo_Cant = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A590Kard_Saldo_Cant", GXutil.ltrim( GXutil.str( A590Kard_Saldo_Cant, 8, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_KARD_SALDO_CANT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A590Kard_Saldo_Cant), "ZZZZZZZ9")));
         A589Kard_Saldo_Valor = localUtil.ctond( httpContext.cgiGet( edtKard_Saldo_Valor_Internalname)) ;
         n589Kard_Saldo_Valor = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A589Kard_Saldo_Valor", GXutil.ltrim( GXutil.str( A589Kard_Saldo_Valor, 18, 2)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_KARD_SALDO_VALOR", getSecureSignedToken( sPrefix, localUtil.format( A589Kard_Saldo_Valor, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         /* Read saved values. */
         wcpOA85Kard_Regi_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA85Kard_Regi_Id"), ",", ".") ;
         wcpOA86Kard_Cent_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA86Kard_Cent_Id"), ",", ".") ;
         wcpOA87Kard_Alm_Cod = httpContext.cgiGet( sPrefix+"wcpOA87Kard_Alm_Cod") ;
         wcpOA88Kard_Bod_Cod = httpContext.cgiGet( sPrefix+"wcpOA88Kard_Bod_Cod") ;
         wcpOA89Kard_Elem_Cons = httpContext.cgiGet( sPrefix+"wcpOA89Kard_Elem_Cons") ;
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
      e135T2 ();
      if (returnInSub) return;
   }

   public void e135T2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV18Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV18Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
   }

   protected void nextLoad( )
   {
   }

   protected void e145T2( )
   {
      /* Load Routine */
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV12TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV12TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV18Pgmname );
      AV12TrnContext.setgxTv_SdtTransactionContext_Callerondelete( false );
      AV12TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV15HTTPRequest.getScriptName()+"?"+AV15HTTPRequest.getQuerystring() );
      AV12TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_INV_KARDEX" );
      AV13TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV13TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Kard_Regi_Id" );
      AV13TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV7Kard_Regi_Id, 11, 0) );
      AV12TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV13TrnContextAtt, 0);
      AV13TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV13TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Kard_Cent_Id" );
      AV13TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV8Kard_Cent_Id, 11, 0) );
      AV12TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV13TrnContextAtt, 0);
      AV13TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV13TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Kard_Alm_Cod" );
      AV13TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( AV9Kard_Alm_Cod );
      AV12TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV13TrnContextAtt, 0);
      AV13TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV13TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Kard_Bod_Cod" );
      AV13TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( AV10Kard_Bod_Cod );
      AV12TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV13TrnContextAtt, 0);
      AV13TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV13TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Kard_Elem_Cons" );
      AV13TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( AV11Kard_Elem_Cons );
      AV12TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV13TrnContextAtt, 0);
      AV14Session.setValue("TrnContext", AV12TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      A85Kard_Regi_Id = ((Number) GXutil.testNumericType( getParm(obj,0,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A85Kard_Regi_Id", GXutil.ltrim( GXutil.str( A85Kard_Regi_Id, 11, 0)));
      A86Kard_Cent_Id = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A86Kard_Cent_Id", GXutil.ltrim( GXutil.str( A86Kard_Cent_Id, 11, 0)));
      A87Kard_Alm_Cod = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A87Kard_Alm_Cod", A87Kard_Alm_Cod);
      A88Kard_Bod_Cod = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A88Kard_Bod_Cod", A88Kard_Bod_Cod);
      A89Kard_Elem_Cons = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A89Kard_Elem_Cons", A89Kard_Elem_Cons);
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
      pa5T2( ) ;
      ws5T2( ) ;
      we5T2( ) ;
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
      sCtrlA85Kard_Regi_Id = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlA86Kard_Cent_Id = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlA87Kard_Alm_Cod = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlA88Kard_Bod_Cod = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlA89Kard_Elem_Cons = (String)getParm(obj,4,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa5T2( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "alm_inv_kardexgeneral");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa5T2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A85Kard_Regi_Id = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A85Kard_Regi_Id", GXutil.ltrim( GXutil.str( A85Kard_Regi_Id, 11, 0)));
         A86Kard_Cent_Id = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A86Kard_Cent_Id", GXutil.ltrim( GXutil.str( A86Kard_Cent_Id, 11, 0)));
         A87Kard_Alm_Cod = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A87Kard_Alm_Cod", A87Kard_Alm_Cod);
         A88Kard_Bod_Cod = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A88Kard_Bod_Cod", A88Kard_Bod_Cod);
         A89Kard_Elem_Cons = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A89Kard_Elem_Cons", A89Kard_Elem_Cons);
      }
      wcpOA85Kard_Regi_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA85Kard_Regi_Id"), ",", ".") ;
      wcpOA86Kard_Cent_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA86Kard_Cent_Id"), ",", ".") ;
      wcpOA87Kard_Alm_Cod = httpContext.cgiGet( sPrefix+"wcpOA87Kard_Alm_Cod") ;
      wcpOA88Kard_Bod_Cod = httpContext.cgiGet( sPrefix+"wcpOA88Kard_Bod_Cod") ;
      wcpOA89Kard_Elem_Cons = httpContext.cgiGet( sPrefix+"wcpOA89Kard_Elem_Cons") ;
      if ( ! GetJustCreated( ) && ( ( A85Kard_Regi_Id != wcpOA85Kard_Regi_Id ) || ( A86Kard_Cent_Id != wcpOA86Kard_Cent_Id ) || ( GXutil.strcmp(A87Kard_Alm_Cod, wcpOA87Kard_Alm_Cod) != 0 ) || ( GXutil.strcmp(A88Kard_Bod_Cod, wcpOA88Kard_Bod_Cod) != 0 ) || ( GXutil.strcmp(A89Kard_Elem_Cons, wcpOA89Kard_Elem_Cons) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOA85Kard_Regi_Id = A85Kard_Regi_Id ;
      wcpOA86Kard_Cent_Id = A86Kard_Cent_Id ;
      wcpOA87Kard_Alm_Cod = A87Kard_Alm_Cod ;
      wcpOA88Kard_Bod_Cod = A88Kard_Bod_Cod ;
      wcpOA89Kard_Elem_Cons = A89Kard_Elem_Cons ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA85Kard_Regi_Id = httpContext.cgiGet( sPrefix+"A85Kard_Regi_Id_CTRL") ;
      if ( GXutil.len( sCtrlA85Kard_Regi_Id) > 0 )
      {
         A85Kard_Regi_Id = localUtil.ctol( httpContext.cgiGet( sCtrlA85Kard_Regi_Id), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A85Kard_Regi_Id", GXutil.ltrim( GXutil.str( A85Kard_Regi_Id, 11, 0)));
      }
      else
      {
         A85Kard_Regi_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"A85Kard_Regi_Id_PARM"), ",", ".") ;
      }
      sCtrlA86Kard_Cent_Id = httpContext.cgiGet( sPrefix+"A86Kard_Cent_Id_CTRL") ;
      if ( GXutil.len( sCtrlA86Kard_Cent_Id) > 0 )
      {
         A86Kard_Cent_Id = localUtil.ctol( httpContext.cgiGet( sCtrlA86Kard_Cent_Id), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A86Kard_Cent_Id", GXutil.ltrim( GXutil.str( A86Kard_Cent_Id, 11, 0)));
      }
      else
      {
         A86Kard_Cent_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"A86Kard_Cent_Id_PARM"), ",", ".") ;
      }
      sCtrlA87Kard_Alm_Cod = httpContext.cgiGet( sPrefix+"A87Kard_Alm_Cod_CTRL") ;
      if ( GXutil.len( sCtrlA87Kard_Alm_Cod) > 0 )
      {
         A87Kard_Alm_Cod = httpContext.cgiGet( sCtrlA87Kard_Alm_Cod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A87Kard_Alm_Cod", A87Kard_Alm_Cod);
      }
      else
      {
         A87Kard_Alm_Cod = httpContext.cgiGet( sPrefix+"A87Kard_Alm_Cod_PARM") ;
      }
      sCtrlA88Kard_Bod_Cod = httpContext.cgiGet( sPrefix+"A88Kard_Bod_Cod_CTRL") ;
      if ( GXutil.len( sCtrlA88Kard_Bod_Cod) > 0 )
      {
         A88Kard_Bod_Cod = httpContext.cgiGet( sCtrlA88Kard_Bod_Cod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A88Kard_Bod_Cod", A88Kard_Bod_Cod);
      }
      else
      {
         A88Kard_Bod_Cod = httpContext.cgiGet( sPrefix+"A88Kard_Bod_Cod_PARM") ;
      }
      sCtrlA89Kard_Elem_Cons = httpContext.cgiGet( sPrefix+"A89Kard_Elem_Cons_CTRL") ;
      if ( GXutil.len( sCtrlA89Kard_Elem_Cons) > 0 )
      {
         A89Kard_Elem_Cons = httpContext.cgiGet( sCtrlA89Kard_Elem_Cons) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A89Kard_Elem_Cons", A89Kard_Elem_Cons);
      }
      else
      {
         A89Kard_Elem_Cons = httpContext.cgiGet( sPrefix+"A89Kard_Elem_Cons_PARM") ;
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
      pa5T2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws5T2( ) ;
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
      ws5T2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A85Kard_Regi_Id_PARM", GXutil.ltrim( localUtil.ntoc( A85Kard_Regi_Id, (byte)(11), (byte)(0), ",", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA85Kard_Regi_Id)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A85Kard_Regi_Id_CTRL", GXutil.rtrim( sCtrlA85Kard_Regi_Id));
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A86Kard_Cent_Id_PARM", GXutil.ltrim( localUtil.ntoc( A86Kard_Cent_Id, (byte)(11), (byte)(0), ",", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA86Kard_Cent_Id)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A86Kard_Cent_Id_CTRL", GXutil.rtrim( sCtrlA86Kard_Cent_Id));
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A87Kard_Alm_Cod_PARM", A87Kard_Alm_Cod);
      if ( GXutil.len( GXutil.rtrim( sCtrlA87Kard_Alm_Cod)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A87Kard_Alm_Cod_CTRL", GXutil.rtrim( sCtrlA87Kard_Alm_Cod));
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A88Kard_Bod_Cod_PARM", A88Kard_Bod_Cod);
      if ( GXutil.len( GXutil.rtrim( sCtrlA88Kard_Bod_Cod)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A88Kard_Bod_Cod_CTRL", GXutil.rtrim( sCtrlA88Kard_Bod_Cod));
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A89Kard_Elem_Cons_PARM", A89Kard_Elem_Cons);
      if ( GXutil.len( GXutil.rtrim( sCtrlA89Kard_Elem_Cons)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A89Kard_Elem_Cons_CTRL", GXutil.rtrim( sCtrlA89Kard_Elem_Cons));
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
      we5T2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414103578");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("alm_inv_kardexgeneral.js", "?201861414103578");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtKard_Regi_Id_Internalname = sPrefix+"KARD_REGI_ID" ;
      edtKard_Regi_Cod_Internalname = sPrefix+"KARD_REGI_COD" ;
      edtKard_Cent_Id_Internalname = sPrefix+"KARD_CENT_ID" ;
      edtKard_Cent_Cod_Internalname = sPrefix+"KARD_CENT_COD" ;
      edtKard_Alm_Cod_Internalname = sPrefix+"KARD_ALM_COD" ;
      edtKard_Bod_Cod_Internalname = sPrefix+"KARD_BOD_COD" ;
      edtKard_Elem_Cons_Internalname = sPrefix+"KARD_ELEM_CONS" ;
      edtKard_Val_Unitario_Internalname = sPrefix+"KARD_VAL_UNITARIO" ;
      edtKard_Saldo_Cant_Internalname = sPrefix+"KARD_SALDO_CANT" ;
      edtKard_Saldo_Valor_Internalname = sPrefix+"KARD_SALDO_VALOR" ;
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
      edtKard_Saldo_Valor_Jsonclick = "" ;
      edtKard_Saldo_Valor_Enabled = 0 ;
      edtKard_Saldo_Cant_Jsonclick = "" ;
      edtKard_Saldo_Cant_Enabled = 0 ;
      edtKard_Val_Unitario_Jsonclick = "" ;
      edtKard_Val_Unitario_Enabled = 0 ;
      edtKard_Elem_Cons_Jsonclick = "" ;
      edtKard_Elem_Cons_Enabled = 0 ;
      edtKard_Bod_Cod_Jsonclick = "" ;
      edtKard_Bod_Cod_Enabled = 0 ;
      edtKard_Alm_Cod_Jsonclick = "" ;
      edtKard_Alm_Cod_Enabled = 0 ;
      edtKard_Cent_Cod_Jsonclick = "" ;
      edtKard_Cent_Cod_Enabled = 0 ;
      edtKard_Cent_Id_Jsonclick = "" ;
      edtKard_Cent_Id_Enabled = 0 ;
      edtKard_Regi_Cod_Jsonclick = "" ;
      edtKard_Regi_Cod_Enabled = 0 ;
      edtKard_Regi_Id_Jsonclick = "" ;
      edtKard_Regi_Id_Enabled = 0 ;
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
      setEventMetadata("'DOUPDATE'","{handler:'e115T1',iparms:[],oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e125T1',iparms:[],oparms:[]}");
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
      wcpOA87Kard_Alm_Cod = "" ;
      wcpOA88Kard_Bod_Cod = "" ;
      wcpOA89Kard_Elem_Cons = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      A87Kard_Alm_Cod = "" ;
      A88Kard_Bod_Cod = "" ;
      A89Kard_Elem_Cons = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      A578Kard_Cent_Cod = "" ;
      A588Kard_Val_Unitario = DecimalUtil.ZERO ;
      A589Kard_Saldo_Valor = DecimalUtil.ZERO ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV18Pgmname = "" ;
      scmdbuf = "" ;
      H005T2_A85Kard_Regi_Id = new long[1] ;
      H005T2_A86Kard_Cent_Id = new long[1] ;
      H005T2_A87Kard_Alm_Cod = new String[] {""} ;
      H005T2_A88Kard_Bod_Cod = new String[] {""} ;
      H005T2_A89Kard_Elem_Cons = new String[] {""} ;
      H005T2_A578Kard_Cent_Cod = new String[] {""} ;
      H005T2_A577Kard_Regi_Cod = new short[1] ;
      H005T2_A590Kard_Saldo_Cant = new int[1] ;
      H005T2_n590Kard_Saldo_Cant = new boolean[] {false} ;
      H005T2_A589Kard_Saldo_Valor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H005T2_n589Kard_Saldo_Valor = new boolean[] {false} ;
      AV12TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV15HTTPRequest = httpContext.getHttpRequest();
      AV13TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV9Kard_Alm_Cod = "" ;
      AV10Kard_Bod_Cod = "" ;
      AV11Kard_Elem_Cons = "" ;
      AV14Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA85Kard_Regi_Id = "" ;
      sCtrlA86Kard_Cent_Id = "" ;
      sCtrlA87Kard_Alm_Cod = "" ;
      sCtrlA88Kard_Bod_Cod = "" ;
      sCtrlA89Kard_Elem_Cons = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_inv_kardexgeneral__default(),
         new Object[] {
             new Object[] {
            H005T2_A85Kard_Regi_Id, H005T2_A86Kard_Cent_Id, H005T2_A87Kard_Alm_Cod, H005T2_A88Kard_Bod_Cod, H005T2_A89Kard_Elem_Cons, H005T2_A578Kard_Cent_Cod, H005T2_A577Kard_Regi_Cod, H005T2_A590Kard_Saldo_Cant, H005T2_n590Kard_Saldo_Cant, H005T2_A589Kard_Saldo_Valor,
            H005T2_n589Kard_Saldo_Valor
            }
         }
      );
      AV18Pgmname = "ALM_INV_KARDEXGeneral" ;
      /* GeneXus formulas. */
      AV18Pgmname = "ALM_INV_KARDEXGeneral" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short A577Kard_Regi_Cod ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int A590Kard_Saldo_Cant ;
   private int edtKard_Regi_Id_Enabled ;
   private int edtKard_Regi_Cod_Enabled ;
   private int edtKard_Cent_Id_Enabled ;
   private int edtKard_Cent_Cod_Enabled ;
   private int edtKard_Alm_Cod_Enabled ;
   private int edtKard_Bod_Cod_Enabled ;
   private int edtKard_Elem_Cons_Enabled ;
   private int edtKard_Val_Unitario_Enabled ;
   private int edtKard_Saldo_Cant_Enabled ;
   private int edtKard_Saldo_Valor_Enabled ;
   private int idxLst ;
   private long wcpOA85Kard_Regi_Id ;
   private long wcpOA86Kard_Cent_Id ;
   private long A85Kard_Regi_Id ;
   private long A86Kard_Cent_Id ;
   private long AV7Kard_Regi_Id ;
   private long AV8Kard_Cent_Id ;
   private java.math.BigDecimal A588Kard_Val_Unitario ;
   private java.math.BigDecimal A589Kard_Saldo_Valor ;
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
   private String edtKard_Regi_Id_Internalname ;
   private String edtKard_Regi_Id_Jsonclick ;
   private String edtKard_Regi_Cod_Internalname ;
   private String edtKard_Regi_Cod_Jsonclick ;
   private String edtKard_Cent_Id_Internalname ;
   private String edtKard_Cent_Id_Jsonclick ;
   private String edtKard_Cent_Cod_Internalname ;
   private String edtKard_Cent_Cod_Jsonclick ;
   private String edtKard_Alm_Cod_Internalname ;
   private String edtKard_Alm_Cod_Jsonclick ;
   private String edtKard_Bod_Cod_Internalname ;
   private String edtKard_Bod_Cod_Jsonclick ;
   private String edtKard_Elem_Cons_Internalname ;
   private String edtKard_Elem_Cons_Jsonclick ;
   private String edtKard_Val_Unitario_Internalname ;
   private String edtKard_Val_Unitario_Jsonclick ;
   private String edtKard_Saldo_Cant_Internalname ;
   private String edtKard_Saldo_Cant_Jsonclick ;
   private String edtKard_Saldo_Valor_Internalname ;
   private String edtKard_Saldo_Valor_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV18Pgmname ;
   private String scmdbuf ;
   private String sCtrlA85Kard_Regi_Id ;
   private String sCtrlA86Kard_Cent_Id ;
   private String sCtrlA87Kard_Alm_Cod ;
   private String sCtrlA88Kard_Bod_Cod ;
   private String sCtrlA89Kard_Elem_Cons ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n590Kard_Saldo_Cant ;
   private boolean n589Kard_Saldo_Valor ;
   private boolean returnInSub ;
   private String wcpOA87Kard_Alm_Cod ;
   private String wcpOA88Kard_Bod_Cod ;
   private String wcpOA89Kard_Elem_Cons ;
   private String A87Kard_Alm_Cod ;
   private String A88Kard_Bod_Cod ;
   private String A89Kard_Elem_Cons ;
   private String A578Kard_Cent_Cod ;
   private String AV9Kard_Alm_Cod ;
   private String AV10Kard_Bod_Cod ;
   private String AV11Kard_Elem_Cons ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV15HTTPRequest ;
   private IDataStoreProvider pr_default ;
   private long[] H005T2_A85Kard_Regi_Id ;
   private long[] H005T2_A86Kard_Cent_Id ;
   private String[] H005T2_A87Kard_Alm_Cod ;
   private String[] H005T2_A88Kard_Bod_Cod ;
   private String[] H005T2_A89Kard_Elem_Cons ;
   private String[] H005T2_A578Kard_Cent_Cod ;
   private short[] H005T2_A577Kard_Regi_Cod ;
   private int[] H005T2_A590Kard_Saldo_Cant ;
   private boolean[] H005T2_n590Kard_Saldo_Cant ;
   private java.math.BigDecimal[] H005T2_A589Kard_Saldo_Valor ;
   private boolean[] H005T2_n589Kard_Saldo_Valor ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private com.orions2.SdtTransactionContext AV12TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV13TrnContextAtt ;
}

final  class alm_inv_kardexgeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H005T2", "SELECT Kard_Regi_Id, Kard_Cent_Id, Kard_Alm_Cod, Kard_Bod_Cod, Kard_Elem_Cons, Kard_Cent_Cod, Kard_Regi_Cod, Kard_Saldo_Cant, Kard_Saldo_Valor FROM ALM_INV_KARDEX WHERE Kard_Regi_Id = ? and Kard_Cent_Id = ? and Kard_Alm_Cod = ? and Kard_Bod_Cod = ? and Kard_Elem_Cons = ? ORDER BY Kard_Regi_Id, Kard_Cent_Id, Kard_Alm_Cod, Kard_Bod_Cod, Kard_Elem_Cons ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((int[]) buf[7])[0] = rslt.getInt(8) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
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
               stmt.setVarchar(3, (String)parms[2], 2, false);
               stmt.setVarchar(4, (String)parms[3], 3, false);
               stmt.setVarchar(5, (String)parms[4], 9, false);
               return;
      }
   }

}

