/*
               File: gen_regionalgeneral_impl
        Description: GEN_REGIONALGeneral
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:15:42.41
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

public final  class gen_regionalgeneral_impl extends GXWebComponent
{
   public gen_regionalgeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gen_regionalgeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gen_regionalgeneral_impl.class ));
   }

   public gen_regionalgeneral_impl( int remoteHandle ,
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
               A2Regi_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,new Long(A2Regi_Id)});
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
         pa2K2( ) ;
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
         httpContext.writeValue( "GEN_REGIONALGeneral") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414154248");
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.gen_regionalgeneral") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A2Regi_Id,11,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA2Regi_Id", GXutil.ltrim( localUtil.ntoc( wcpOA2Regi_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_COD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A12Regi_Cod), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A13Regi_Descripcion, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_DIRCIA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A153Regi_DirCia, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CIUD_CODIGO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A5Ciud_Codigo), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_CONSE_TRAN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A698Regi_Conse_Tran), "ZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_ETCT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A144Regi_EtCt), "Z9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_ETCO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A145Regi_EtCo), "Z9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_ETCF", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A146Regi_EtCf), "Z9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_MESARR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A147Regi_MesArr), "Z9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_ANOARR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A148Regi_AnoArr), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_PERACT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A149Regi_PerAct), "Z9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_ANOACT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A150Regi_AnoAct), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_ANOCAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A151Regi_AnoCal), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_NROPER", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A152Regi_NroPer), "Z9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_NRORIF", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A165Regi_NroRif, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_ABREV", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A154Regi_Abrev, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_TPMVO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A155Regi_TpMvo), "Z9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_CNDPRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A156Regi_CndPre, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_CNDPTES", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A157Regi_CndPTes, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_CNDMON", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A158Regi_CndMon, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A140Regi_UsuarioCrea, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A141Regi_FechaCrea, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A142Regi_UsuarioModifica, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A143Regi_FechaModifica, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_GRABA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A159Regi_Graba, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_MESULT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A160Regi_MesUlt), "Z9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_ANOULT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A161Regi_AnoUlt), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_PADRE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A162Regi_Padre), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_IMPORTAR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A163Regi_Importar, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A164Regi_Estado, ""))));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = sPrefix + "hsh" + "GEN_REGIONALGeneral" ;
      forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A5Ciud_Codigo), "ZZZ9") ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("gen_regionalgeneral:[SendSecurityCheck]"+forbiddenHiddens);
   }

   public void renderHtmlCloseForm2K2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("gen_regionalgeneral.js", "?201861414154256");
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
      return "GEN_REGIONALGeneral" ;
   }

   public String getPgmdesc( )
   {
      return "GEN_REGIONALGeneral" ;
   }

   public void wb2K0( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.gen_regionalgeneral");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", "Modificar", bttBtnupdate_Jsonclick, 7, "Modificar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e112k1_client"+"'", TempTags, "", 2, "HLP_GEN_REGIONALGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", "Eliminar", bttBtndelete_Jsonclick, 7, "Eliminar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e122k1_client"+"'", TempTags, "", 2, "HLP_GEN_REGIONALGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_Id_Internalname, "Id", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A2Regi_Id, (byte)(11), (byte)(0), ",", "")), ((edtRegi_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2Regi_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A2Regi_Id), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_Id_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtRegi_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_GEN_REGIONALGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_Cod_Internalname, "Cod", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_Cod_Internalname, GXutil.ltrim( localUtil.ntoc( A12Regi_Cod, (byte)(4), (byte)(0), ",", "")), ((edtRegi_Cod_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12Regi_Cod), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A12Regi_Cod), "ZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_Cod_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtRegi_Cod_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_REGIONALGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_Descripcion_Internalname, "Descripción", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_Descripcion_Internalname, A13Regi_Descripcion, GXutil.rtrim( localUtil.format( A13Regi_Descripcion, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtRegi_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_GEN_REGIONALGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_DirCia_Internalname, "Dirección ", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Multiple line edit */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtRegi_DirCia_Internalname, A153Regi_DirCia, "http://maps.google.com/maps?q="+PrivateUtilities.encodeURL( A153Regi_DirCia), "", (short)(0), 1, edtRegi_DirCia_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "1024", -1, 0, "_blank", "", (byte)(0), true, "GeneXus\\Address", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_GEN_REGIONALGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDept_Codigo_Internalname, "Código Departamento", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDept_Codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A6Dept_Codigo, (byte)(4), (byte)(0), ",", "")), ((edtDept_Codigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6Dept_Codigo), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A6Dept_Codigo), "ZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDept_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtDept_Codigo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_REGIONALGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDept_Descripcion_Internalname, "Descripción Departamento", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDept_Descripcion_Internalname, A10Dept_Descripcion, GXutil.rtrim( localUtil.format( A10Dept_Descripcion, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtDept_Descripcion_Link, "", "", "", edtDept_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtDept_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_GEN_REGIONALGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCiud_Codigo_Internalname, "Código Ciudad", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCiud_Codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A5Ciud_Codigo, (byte)(4), (byte)(0), ",", "")), ((edtCiud_Codigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5Ciud_Codigo), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A5Ciud_Codigo), "ZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCiud_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCiud_Codigo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_REGIONALGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCiud_Descripcion_Internalname, "Descripción Ciudad", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCiud_Descripcion_Internalname, A7Ciud_Descripcion, GXutil.rtrim( localUtil.format( A7Ciud_Descripcion, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtCiud_Descripcion_Link, "", "", "", edtCiud_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCiud_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_GEN_REGIONALGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_Conse_Tran_Internalname, "Transaccion", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_Conse_Tran_Internalname, GXutil.ltrim( localUtil.ntoc( A698Regi_Conse_Tran, (byte)(6), (byte)(0), ",", "")), ((edtRegi_Conse_Tran_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A698Regi_Conse_Tran), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A698Regi_Conse_Tran), "ZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_Conse_Tran_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtRegi_Conse_Tran_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_REGIONALGeneral.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_EtCt_Internalname, "Regional Et Ct", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_EtCt_Internalname, GXutil.ltrim( localUtil.ntoc( A144Regi_EtCt, (byte)(2), (byte)(0), ",", "")), ((edtRegi_EtCt_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A144Regi_EtCt), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A144Regi_EtCt), "Z9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_EtCt_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_EtCt_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_REGIONALGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_EtCo_Internalname, "Regional Et Co", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_EtCo_Internalname, GXutil.ltrim( localUtil.ntoc( A145Regi_EtCo, (byte)(2), (byte)(0), ",", "")), ((edtRegi_EtCo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A145Regi_EtCo), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A145Regi_EtCo), "Z9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_EtCo_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_EtCo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_REGIONALGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_EtCf_Internalname, "Regional Et Cf", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_EtCf_Internalname, GXutil.ltrim( localUtil.ntoc( A146Regi_EtCf, (byte)(2), (byte)(0), ",", "")), ((edtRegi_EtCf_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A146Regi_EtCf), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A146Regi_EtCf), "Z9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_EtCf_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_EtCf_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_REGIONALGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_MesArr_Internalname, "Mes que Inicia Regional", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_MesArr_Internalname, GXutil.ltrim( localUtil.ntoc( A147Regi_MesArr, (byte)(2), (byte)(0), ",", "")), ((edtRegi_MesArr_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A147Regi_MesArr), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A147Regi_MesArr), "Z9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_MesArr_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_MesArr_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_REGIONALGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_AnoArr_Internalname, "Año que Inicia Regional", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_AnoArr_Internalname, GXutil.ltrim( localUtil.ntoc( A148Regi_AnoArr, (byte)(4), (byte)(0), ",", "")), ((edtRegi_AnoArr_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A148Regi_AnoArr), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A148Regi_AnoArr), "ZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_AnoArr_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_AnoArr_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_REGIONALGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_PerAct_Internalname, "Parámetro de vigencia Regional", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_PerAct_Internalname, GXutil.ltrim( localUtil.ntoc( A149Regi_PerAct, (byte)(2), (byte)(0), ",", "")), ((edtRegi_PerAct_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A149Regi_PerAct), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A149Regi_PerAct), "Z9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_PerAct_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_PerAct_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_REGIONALGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_AnoAct_Internalname, "Año Activo Regional", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_AnoAct_Internalname, GXutil.ltrim( localUtil.ntoc( A150Regi_AnoAct, (byte)(4), (byte)(0), ",", "")), ((edtRegi_AnoAct_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A150Regi_AnoAct), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A150Regi_AnoAct), "ZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_AnoAct_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_AnoAct_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_REGIONALGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_AnoCal_Internalname, "Año Calculado Regional", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_AnoCal_Internalname, GXutil.ltrim( localUtil.ntoc( A151Regi_AnoCal, (byte)(4), (byte)(0), ",", "")), ((edtRegi_AnoCal_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A151Regi_AnoCal), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A151Regi_AnoCal), "ZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_AnoCal_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_AnoCal_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_REGIONALGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_NroPer_Internalname, "Periodo Contable Regional", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_NroPer_Internalname, GXutil.ltrim( localUtil.ntoc( A152Regi_NroPer, (byte)(2), (byte)(0), ",", "")), ((edtRegi_NroPer_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A152Regi_NroPer), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A152Regi_NroPer), "Z9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_NroPer_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_NroPer_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_REGIONALGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_NroRif_Internalname, "Nit Regional", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_NroRif_Internalname, A165Regi_NroRif, GXutil.rtrim( localUtil.format( A165Regi_NroRif, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_NroRif_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_NroRif_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GEN_REGIONALGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_Abrev_Internalname, "Abreviatura Regional", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_Abrev_Internalname, A154Regi_Abrev, GXutil.rtrim( localUtil.format( A154Regi_Abrev, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_Abrev_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_Abrev_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GEN_REGIONALGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_TpMvo_Internalname, "Regional Tipo Movimiento", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_TpMvo_Internalname, GXutil.ltrim( localUtil.ntoc( A155Regi_TpMvo, (byte)(2), (byte)(0), ",", "")), ((edtRegi_TpMvo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A155Regi_TpMvo), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A155Regi_TpMvo), "Z9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_TpMvo_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_TpMvo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_REGIONALGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_CndPre_Internalname, "Regional Cnd Pre", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_CndPre_Internalname, A156Regi_CndPre, GXutil.rtrim( localUtil.format( A156Regi_CndPre, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_CndPre_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_CndPre_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GEN_REGIONALGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_CndPTes_Internalname, "Regional Cnd PTes", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_CndPTes_Internalname, A157Regi_CndPTes, GXutil.rtrim( localUtil.format( A157Regi_CndPTes, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_CndPTes_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_CndPTes_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GEN_REGIONALGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_CndMon_Internalname, "Regional Cnd Mon", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_CndMon_Internalname, A158Regi_CndMon, GXutil.rtrim( localUtil.format( A158Regi_CndMon, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_CndMon_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_CndMon_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GEN_REGIONALGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_UsuarioCrea_Internalname, "Usuario Crea Regional", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_UsuarioCrea_Internalname, A140Regi_UsuarioCrea, GXutil.rtrim( localUtil.format( A140Regi_UsuarioCrea, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_UsuarioCrea_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_UsuarioCrea_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_GEN_REGIONALGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_FechaCrea_Internalname, "Fecha Creación Regional", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtRegi_FechaCrea_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_FechaCrea_Internalname, localUtil.ttoc( A141Regi_FechaCrea, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A141Regi_FechaCrea, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_FechaCrea_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_FechaCrea_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_GEN_REGIONALGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtRegi_FechaCrea_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtRegi_FechaCrea_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GEN_REGIONALGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_UsuarioModifica_Internalname, "Usuario Modifica Regional", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_UsuarioModifica_Internalname, A142Regi_UsuarioModifica, GXutil.rtrim( localUtil.format( A142Regi_UsuarioModifica, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_UsuarioModifica_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_UsuarioModifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_GEN_REGIONALGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_FechaModifica_Internalname, "Fecha Modifica Regional", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtRegi_FechaModifica_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_FechaModifica_Internalname, localUtil.ttoc( A143Regi_FechaModifica, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A143Regi_FechaModifica, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_FechaModifica_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_FechaModifica_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_GEN_REGIONALGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtRegi_FechaModifica_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtRegi_FechaModifica_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GEN_REGIONALGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_Graba_Internalname, "Regional Graba", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_Graba_Internalname, A159Regi_Graba, GXutil.rtrim( localUtil.format( A159Regi_Graba, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_Graba_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_Graba_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GEN_REGIONALGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_MesUlt_Internalname, "Ultimo Mes Regional", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_MesUlt_Internalname, GXutil.ltrim( localUtil.ntoc( A160Regi_MesUlt, (byte)(2), (byte)(0), ",", "")), ((edtRegi_MesUlt_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A160Regi_MesUlt), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A160Regi_MesUlt), "Z9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_MesUlt_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_MesUlt_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_REGIONALGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_AnoUlt_Internalname, "Ultimo Año Regional", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_AnoUlt_Internalname, GXutil.ltrim( localUtil.ntoc( A161Regi_AnoUlt, (byte)(4), (byte)(0), ",", "")), ((edtRegi_AnoUlt_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A161Regi_AnoUlt), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A161Regi_AnoUlt), "ZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_AnoUlt_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_AnoUlt_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_REGIONALGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtPais_Codigo_Internalname, "Código del País", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtPais_Codigo_Internalname, A9Pais_Codigo, GXutil.rtrim( localUtil.format( A9Pais_Codigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPais_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtPais_Codigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GEN_REGIONALGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtPais_Descripcion_Internalname, "Descripción del País", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtPais_Descripcion_Internalname, A11Pais_Descripcion, GXutil.rtrim( localUtil.format( A11Pais_Descripcion, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtPais_Descripcion_Link, "", "", "", edtPais_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtPais_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_GEN_REGIONALGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_Padre_Internalname, "Regional Padre", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_Padre_Internalname, GXutil.ltrim( localUtil.ntoc( A162Regi_Padre, (byte)(4), (byte)(0), ",", "")), ((edtRegi_Padre_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A162Regi_Padre), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A162Regi_Padre), "ZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_Padre_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_Padre_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_REGIONALGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_Importar_Internalname, "Regional Importar", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_Importar_Internalname, A163Regi_Importar, GXutil.rtrim( localUtil.format( A163Regi_Importar, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_Importar_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_Importar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GEN_REGIONALGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_Estado_Internalname, "Estado", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_Estado_Internalname, GXutil.rtrim( A164Regi_Estado), GXutil.rtrim( localUtil.format( A164Regi_Estado, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_Estado_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_Estado_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Estado", "left", true, "HLP_GEN_REGIONALGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start2K2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "GEN_REGIONALGeneral", (short)(0)) ;
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
            strup2K0( ) ;
         }
      }
   }

   public void ws2K2( )
   {
      start2K2( ) ;
      evt2K2( ) ;
   }

   public void evt2K2( )
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
                              strup2K0( ) ;
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
                              strup2K0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e132K2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2K0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e142K2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2K0( ) ;
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
                              strup2K0( ) ;
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

   public void we2K2( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2K2( ) ;
         }
      }
   }

   public void pa2K2( )
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
      rf2K2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV15Pgmname = "GEN_REGIONALGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rf2K2( )
   {
      initialize_formulas( ) ;
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H002K2 */
         pr_default.execute(0, new Object[] {new Long(A2Regi_Id)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A164Regi_Estado = H002K2_A164Regi_Estado[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A164Regi_Estado", A164Regi_Estado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A164Regi_Estado, ""))));
            A163Regi_Importar = H002K2_A163Regi_Importar[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A163Regi_Importar", A163Regi_Importar);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_IMPORTAR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A163Regi_Importar, ""))));
            A162Regi_Padre = H002K2_A162Regi_Padre[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A162Regi_Padre", GXutil.ltrim( GXutil.str( A162Regi_Padre, 4, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_PADRE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A162Regi_Padre), "ZZZ9")));
            A11Pais_Descripcion = H002K2_A11Pais_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11Pais_Descripcion", A11Pais_Descripcion);
            A9Pais_Codigo = H002K2_A9Pais_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9Pais_Codigo", A9Pais_Codigo);
            A161Regi_AnoUlt = H002K2_A161Regi_AnoUlt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A161Regi_AnoUlt", GXutil.ltrim( GXutil.str( A161Regi_AnoUlt, 4, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_ANOULT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A161Regi_AnoUlt), "ZZZ9")));
            A160Regi_MesUlt = H002K2_A160Regi_MesUlt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A160Regi_MesUlt", GXutil.ltrim( GXutil.str( A160Regi_MesUlt, 2, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_MESULT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A160Regi_MesUlt), "Z9")));
            A159Regi_Graba = H002K2_A159Regi_Graba[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A159Regi_Graba", A159Regi_Graba);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_GRABA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A159Regi_Graba, ""))));
            A143Regi_FechaModifica = H002K2_A143Regi_FechaModifica[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A143Regi_FechaModifica", localUtil.ttoc( A143Regi_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A143Regi_FechaModifica, "99/99/99 99:99")));
            A142Regi_UsuarioModifica = H002K2_A142Regi_UsuarioModifica[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A142Regi_UsuarioModifica", A142Regi_UsuarioModifica);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A142Regi_UsuarioModifica, "@!"))));
            A141Regi_FechaCrea = H002K2_A141Regi_FechaCrea[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A141Regi_FechaCrea", localUtil.ttoc( A141Regi_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A141Regi_FechaCrea, "99/99/99 99:99")));
            A140Regi_UsuarioCrea = H002K2_A140Regi_UsuarioCrea[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A140Regi_UsuarioCrea", A140Regi_UsuarioCrea);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A140Regi_UsuarioCrea, "@!"))));
            A158Regi_CndMon = H002K2_A158Regi_CndMon[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A158Regi_CndMon", A158Regi_CndMon);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_CNDMON", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A158Regi_CndMon, ""))));
            A157Regi_CndPTes = H002K2_A157Regi_CndPTes[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A157Regi_CndPTes", A157Regi_CndPTes);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_CNDPTES", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A157Regi_CndPTes, ""))));
            A156Regi_CndPre = H002K2_A156Regi_CndPre[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A156Regi_CndPre", A156Regi_CndPre);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_CNDPRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A156Regi_CndPre, ""))));
            A155Regi_TpMvo = H002K2_A155Regi_TpMvo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A155Regi_TpMvo", GXutil.ltrim( GXutil.str( A155Regi_TpMvo, 2, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_TPMVO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A155Regi_TpMvo), "Z9")));
            A154Regi_Abrev = H002K2_A154Regi_Abrev[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A154Regi_Abrev", A154Regi_Abrev);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_ABREV", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A154Regi_Abrev, ""))));
            A165Regi_NroRif = H002K2_A165Regi_NroRif[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A165Regi_NroRif", A165Regi_NroRif);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_NRORIF", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A165Regi_NroRif, ""))));
            A152Regi_NroPer = H002K2_A152Regi_NroPer[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A152Regi_NroPer", GXutil.ltrim( GXutil.str( A152Regi_NroPer, 2, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_NROPER", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A152Regi_NroPer), "Z9")));
            A151Regi_AnoCal = H002K2_A151Regi_AnoCal[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A151Regi_AnoCal", GXutil.ltrim( GXutil.str( A151Regi_AnoCal, 4, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_ANOCAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A151Regi_AnoCal), "ZZZ9")));
            A150Regi_AnoAct = H002K2_A150Regi_AnoAct[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A150Regi_AnoAct", GXutil.ltrim( GXutil.str( A150Regi_AnoAct, 4, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_ANOACT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A150Regi_AnoAct), "ZZZ9")));
            A149Regi_PerAct = H002K2_A149Regi_PerAct[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A149Regi_PerAct", GXutil.ltrim( GXutil.str( A149Regi_PerAct, 2, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_PERACT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A149Regi_PerAct), "Z9")));
            A148Regi_AnoArr = H002K2_A148Regi_AnoArr[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A148Regi_AnoArr", GXutil.ltrim( GXutil.str( A148Regi_AnoArr, 4, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_ANOARR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A148Regi_AnoArr), "ZZZ9")));
            A147Regi_MesArr = H002K2_A147Regi_MesArr[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A147Regi_MesArr", GXutil.ltrim( GXutil.str( A147Regi_MesArr, 2, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_MESARR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A147Regi_MesArr), "Z9")));
            A146Regi_EtCf = H002K2_A146Regi_EtCf[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A146Regi_EtCf", GXutil.ltrim( GXutil.str( A146Regi_EtCf, 2, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_ETCF", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A146Regi_EtCf), "Z9")));
            A145Regi_EtCo = H002K2_A145Regi_EtCo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A145Regi_EtCo", GXutil.ltrim( GXutil.str( A145Regi_EtCo, 2, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_ETCO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A145Regi_EtCo), "Z9")));
            A144Regi_EtCt = H002K2_A144Regi_EtCt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A144Regi_EtCt", GXutil.ltrim( GXutil.str( A144Regi_EtCt, 2, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_ETCT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A144Regi_EtCt), "Z9")));
            A698Regi_Conse_Tran = H002K2_A698Regi_Conse_Tran[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A698Regi_Conse_Tran", GXutil.ltrim( GXutil.str( A698Regi_Conse_Tran, 6, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_CONSE_TRAN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A698Regi_Conse_Tran), "ZZZZZ9")));
            A7Ciud_Descripcion = H002K2_A7Ciud_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
            A5Ciud_Codigo = H002K2_A5Ciud_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CIUD_CODIGO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A5Ciud_Codigo), "ZZZ9")));
            A10Dept_Descripcion = H002K2_A10Dept_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10Dept_Descripcion", A10Dept_Descripcion);
            A6Dept_Codigo = H002K2_A6Dept_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
            A153Regi_DirCia = H002K2_A153Regi_DirCia[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A153Regi_DirCia", A153Regi_DirCia);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_DIRCIA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A153Regi_DirCia, ""))));
            A13Regi_Descripcion = H002K2_A13Regi_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13Regi_Descripcion", A13Regi_Descripcion);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A13Regi_Descripcion, ""))));
            A12Regi_Cod = H002K2_A12Regi_Cod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12Regi_Cod", GXutil.ltrim( GXutil.str( A12Regi_Cod, 4, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_COD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A12Regi_Cod), "ZZZ9")));
            A7Ciud_Descripcion = H002K2_A7Ciud_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
            A6Dept_Codigo = H002K2_A6Dept_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
            A9Pais_Codigo = H002K2_A9Pais_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9Pais_Codigo", A9Pais_Codigo);
            A10Dept_Descripcion = H002K2_A10Dept_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10Dept_Descripcion", A10Dept_Descripcion);
            A11Pais_Descripcion = H002K2_A11Pais_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11Pais_Descripcion", A11Pais_Descripcion);
            /* Execute user event: Load */
            e142K2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb2K0( ) ;
      }
   }

   public void strup2K0( )
   {
      /* Before Start, stand alone formulas. */
      AV15Pgmname = "GEN_REGIONALGeneral" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e132K2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A12Regi_Cod = (short)(localUtil.ctol( httpContext.cgiGet( edtRegi_Cod_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12Regi_Cod", GXutil.ltrim( GXutil.str( A12Regi_Cod, 4, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_COD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A12Regi_Cod), "ZZZ9")));
         A13Regi_Descripcion = httpContext.cgiGet( edtRegi_Descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13Regi_Descripcion", A13Regi_Descripcion);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A13Regi_Descripcion, ""))));
         A153Regi_DirCia = httpContext.cgiGet( edtRegi_DirCia_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A153Regi_DirCia", A153Regi_DirCia);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_DIRCIA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A153Regi_DirCia, ""))));
         A6Dept_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( edtDept_Codigo_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
         A10Dept_Descripcion = GXutil.upper( httpContext.cgiGet( edtDept_Descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10Dept_Descripcion", A10Dept_Descripcion);
         A5Ciud_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( edtCiud_Codigo_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CIUD_CODIGO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A5Ciud_Codigo), "ZZZ9")));
         A7Ciud_Descripcion = GXutil.upper( httpContext.cgiGet( edtCiud_Descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
         A698Regi_Conse_Tran = (int)(localUtil.ctol( httpContext.cgiGet( edtRegi_Conse_Tran_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A698Regi_Conse_Tran", GXutil.ltrim( GXutil.str( A698Regi_Conse_Tran, 6, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_CONSE_TRAN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A698Regi_Conse_Tran), "ZZZZZ9")));
         A144Regi_EtCt = (byte)(localUtil.ctol( httpContext.cgiGet( edtRegi_EtCt_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A144Regi_EtCt", GXutil.ltrim( GXutil.str( A144Regi_EtCt, 2, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_ETCT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A144Regi_EtCt), "Z9")));
         A145Regi_EtCo = (byte)(localUtil.ctol( httpContext.cgiGet( edtRegi_EtCo_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A145Regi_EtCo", GXutil.ltrim( GXutil.str( A145Regi_EtCo, 2, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_ETCO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A145Regi_EtCo), "Z9")));
         A146Regi_EtCf = (byte)(localUtil.ctol( httpContext.cgiGet( edtRegi_EtCf_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A146Regi_EtCf", GXutil.ltrim( GXutil.str( A146Regi_EtCf, 2, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_ETCF", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A146Regi_EtCf), "Z9")));
         A147Regi_MesArr = (byte)(localUtil.ctol( httpContext.cgiGet( edtRegi_MesArr_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A147Regi_MesArr", GXutil.ltrim( GXutil.str( A147Regi_MesArr, 2, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_MESARR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A147Regi_MesArr), "Z9")));
         A148Regi_AnoArr = (short)(localUtil.ctol( httpContext.cgiGet( edtRegi_AnoArr_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A148Regi_AnoArr", GXutil.ltrim( GXutil.str( A148Regi_AnoArr, 4, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_ANOARR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A148Regi_AnoArr), "ZZZ9")));
         A149Regi_PerAct = (byte)(localUtil.ctol( httpContext.cgiGet( edtRegi_PerAct_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A149Regi_PerAct", GXutil.ltrim( GXutil.str( A149Regi_PerAct, 2, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_PERACT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A149Regi_PerAct), "Z9")));
         A150Regi_AnoAct = (short)(localUtil.ctol( httpContext.cgiGet( edtRegi_AnoAct_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A150Regi_AnoAct", GXutil.ltrim( GXutil.str( A150Regi_AnoAct, 4, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_ANOACT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A150Regi_AnoAct), "ZZZ9")));
         A151Regi_AnoCal = (short)(localUtil.ctol( httpContext.cgiGet( edtRegi_AnoCal_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A151Regi_AnoCal", GXutil.ltrim( GXutil.str( A151Regi_AnoCal, 4, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_ANOCAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A151Regi_AnoCal), "ZZZ9")));
         A152Regi_NroPer = (byte)(localUtil.ctol( httpContext.cgiGet( edtRegi_NroPer_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A152Regi_NroPer", GXutil.ltrim( GXutil.str( A152Regi_NroPer, 2, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_NROPER", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A152Regi_NroPer), "Z9")));
         A165Regi_NroRif = httpContext.cgiGet( edtRegi_NroRif_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A165Regi_NroRif", A165Regi_NroRif);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_NRORIF", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A165Regi_NroRif, ""))));
         A154Regi_Abrev = httpContext.cgiGet( edtRegi_Abrev_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A154Regi_Abrev", A154Regi_Abrev);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_ABREV", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A154Regi_Abrev, ""))));
         A155Regi_TpMvo = (byte)(localUtil.ctol( httpContext.cgiGet( edtRegi_TpMvo_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A155Regi_TpMvo", GXutil.ltrim( GXutil.str( A155Regi_TpMvo, 2, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_TPMVO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A155Regi_TpMvo), "Z9")));
         A156Regi_CndPre = httpContext.cgiGet( edtRegi_CndPre_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A156Regi_CndPre", A156Regi_CndPre);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_CNDPRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A156Regi_CndPre, ""))));
         A157Regi_CndPTes = httpContext.cgiGet( edtRegi_CndPTes_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A157Regi_CndPTes", A157Regi_CndPTes);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_CNDPTES", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A157Regi_CndPTes, ""))));
         A158Regi_CndMon = httpContext.cgiGet( edtRegi_CndMon_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A158Regi_CndMon", A158Regi_CndMon);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_CNDMON", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A158Regi_CndMon, ""))));
         A140Regi_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtRegi_UsuarioCrea_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A140Regi_UsuarioCrea", A140Regi_UsuarioCrea);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A140Regi_UsuarioCrea, "@!"))));
         A141Regi_FechaCrea = localUtil.ctot( httpContext.cgiGet( edtRegi_FechaCrea_Internalname), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A141Regi_FechaCrea", localUtil.ttoc( A141Regi_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A141Regi_FechaCrea, "99/99/99 99:99")));
         A142Regi_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtRegi_UsuarioModifica_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A142Regi_UsuarioModifica", A142Regi_UsuarioModifica);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A142Regi_UsuarioModifica, "@!"))));
         A143Regi_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtRegi_FechaModifica_Internalname), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A143Regi_FechaModifica", localUtil.ttoc( A143Regi_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A143Regi_FechaModifica, "99/99/99 99:99")));
         A159Regi_Graba = httpContext.cgiGet( edtRegi_Graba_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A159Regi_Graba", A159Regi_Graba);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_GRABA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A159Regi_Graba, ""))));
         A160Regi_MesUlt = (byte)(localUtil.ctol( httpContext.cgiGet( edtRegi_MesUlt_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A160Regi_MesUlt", GXutil.ltrim( GXutil.str( A160Regi_MesUlt, 2, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_MESULT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A160Regi_MesUlt), "Z9")));
         A161Regi_AnoUlt = (short)(localUtil.ctol( httpContext.cgiGet( edtRegi_AnoUlt_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A161Regi_AnoUlt", GXutil.ltrim( GXutil.str( A161Regi_AnoUlt, 4, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_ANOULT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A161Regi_AnoUlt), "ZZZ9")));
         A9Pais_Codigo = httpContext.cgiGet( edtPais_Codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9Pais_Codigo", A9Pais_Codigo);
         A11Pais_Descripcion = GXutil.upper( httpContext.cgiGet( edtPais_Descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11Pais_Descripcion", A11Pais_Descripcion);
         A162Regi_Padre = (short)(localUtil.ctol( httpContext.cgiGet( edtRegi_Padre_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A162Regi_Padre", GXutil.ltrim( GXutil.str( A162Regi_Padre, 4, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_PADRE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A162Regi_Padre), "ZZZ9")));
         A163Regi_Importar = httpContext.cgiGet( edtRegi_Importar_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A163Regi_Importar", A163Regi_Importar);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_IMPORTAR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A163Regi_Importar, ""))));
         A164Regi_Estado = httpContext.cgiGet( edtRegi_Estado_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A164Regi_Estado", A164Regi_Estado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A164Regi_Estado, ""))));
         /* Read saved values. */
         wcpOA2Regi_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA2Regi_Id"), ",", ".") ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = sPrefix + "hsh" + "GEN_REGIONALGeneral" ;
         A5Ciud_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( edtCiud_Codigo_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CIUD_CODIGO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A5Ciud_Codigo), "ZZZ9")));
         forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A5Ciud_Codigo), "ZZZ9") ;
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
         {
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            GXutil.writeLog("gen_regionalgeneral:[SecurityCheckFailed]"+forbiddenHiddens);
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
      e132K2 ();
      if (returnInSub) return;
   }

   public void e132K2( )
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

   protected void e142K2( )
   {
      /* Load Routine */
      edtPais_Descripcion_Link = formatLink("com.orions2.viewgen_pais") + "?" + GXutil.URLEncode(GXutil.rtrim(A9Pais_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPais_Descripcion_Internalname, "Link", edtPais_Descripcion_Link, true);
      edtDept_Descripcion_Link = formatLink("com.orions2.viewgen_departamento") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A6Dept_Codigo,4,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDept_Descripcion_Internalname, "Link", edtDept_Descripcion_Link, true);
      edtCiud_Descripcion_Link = formatLink("com.orions2.viewgen_ciudad") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A5Ciud_Codigo,4,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCiud_Descripcion_Internalname, "Link", edtCiud_Descripcion_Link, true);
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV10TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV15Pgmname );
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerondelete( false );
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV6HTTPRequest.getScriptName()+"?"+AV6HTTPRequest.getQuerystring() );
      AV10TrnContext.setgxTv_SdtTransactionContext_Transactionname( "GEN_REGIONAL" );
      AV11TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV11TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Regi_Id" );
      AV11TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV8Regi_Id, 11, 0) );
      AV10TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV11TrnContextAtt, 0);
      AV9Session.setValue("TrnContext", AV10TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      A2Regi_Id = ((Number) GXutil.testNumericType( getParm(obj,0,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
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
      pa2K2( ) ;
      ws2K2( ) ;
      we2K2( ) ;
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
      sCtrlA2Regi_Id = (String)getParm(obj,0,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2K2( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "gen_regionalgeneral");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa2K2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A2Regi_Id = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
      }
      wcpOA2Regi_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA2Regi_Id"), ",", ".") ;
      if ( ! GetJustCreated( ) && ( ( A2Regi_Id != wcpOA2Regi_Id ) ) )
      {
         setjustcreated();
      }
      wcpOA2Regi_Id = A2Regi_Id ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA2Regi_Id = httpContext.cgiGet( sPrefix+"A2Regi_Id_CTRL") ;
      if ( GXutil.len( sCtrlA2Regi_Id) > 0 )
      {
         A2Regi_Id = localUtil.ctol( httpContext.cgiGet( sCtrlA2Regi_Id), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
      }
      else
      {
         A2Regi_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"A2Regi_Id_PARM"), ",", ".") ;
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
      pa2K2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2K2( ) ;
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
      ws2K2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A2Regi_Id_PARM", GXutil.ltrim( localUtil.ntoc( A2Regi_Id, (byte)(11), (byte)(0), ",", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA2Regi_Id)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A2Regi_Id_CTRL", GXutil.rtrim( sCtrlA2Regi_Id));
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
      we2K2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414154494");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("gen_regionalgeneral.js", "?201861414154494");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtRegi_Id_Internalname = sPrefix+"REGI_ID" ;
      edtRegi_Cod_Internalname = sPrefix+"REGI_COD" ;
      edtRegi_Descripcion_Internalname = sPrefix+"REGI_DESCRIPCION" ;
      edtRegi_DirCia_Internalname = sPrefix+"REGI_DIRCIA" ;
      edtDept_Codigo_Internalname = sPrefix+"DEPT_CODIGO" ;
      edtDept_Descripcion_Internalname = sPrefix+"DEPT_DESCRIPCION" ;
      edtCiud_Codigo_Internalname = sPrefix+"CIUD_CODIGO" ;
      edtCiud_Descripcion_Internalname = sPrefix+"CIUD_DESCRIPCION" ;
      edtRegi_Conse_Tran_Internalname = sPrefix+"REGI_CONSE_TRAN" ;
      divAttributestable_Internalname = sPrefix+"ATTRIBUTESTABLE" ;
      edtRegi_EtCt_Internalname = sPrefix+"REGI_ETCT" ;
      edtRegi_EtCo_Internalname = sPrefix+"REGI_ETCO" ;
      edtRegi_EtCf_Internalname = sPrefix+"REGI_ETCF" ;
      edtRegi_MesArr_Internalname = sPrefix+"REGI_MESARR" ;
      edtRegi_AnoArr_Internalname = sPrefix+"REGI_ANOARR" ;
      edtRegi_PerAct_Internalname = sPrefix+"REGI_PERACT" ;
      edtRegi_AnoAct_Internalname = sPrefix+"REGI_ANOACT" ;
      edtRegi_AnoCal_Internalname = sPrefix+"REGI_ANOCAL" ;
      edtRegi_NroPer_Internalname = sPrefix+"REGI_NROPER" ;
      edtRegi_NroRif_Internalname = sPrefix+"REGI_NRORIF" ;
      edtRegi_Abrev_Internalname = sPrefix+"REGI_ABREV" ;
      edtRegi_TpMvo_Internalname = sPrefix+"REGI_TPMVO" ;
      edtRegi_CndPre_Internalname = sPrefix+"REGI_CNDPRE" ;
      edtRegi_CndPTes_Internalname = sPrefix+"REGI_CNDPTES" ;
      edtRegi_CndMon_Internalname = sPrefix+"REGI_CNDMON" ;
      edtRegi_UsuarioCrea_Internalname = sPrefix+"REGI_USUARIOCREA" ;
      edtRegi_FechaCrea_Internalname = sPrefix+"REGI_FECHACREA" ;
      edtRegi_UsuarioModifica_Internalname = sPrefix+"REGI_USUARIOMODIFICA" ;
      edtRegi_FechaModifica_Internalname = sPrefix+"REGI_FECHAMODIFICA" ;
      edtRegi_Graba_Internalname = sPrefix+"REGI_GRABA" ;
      edtRegi_MesUlt_Internalname = sPrefix+"REGI_MESULT" ;
      edtRegi_AnoUlt_Internalname = sPrefix+"REGI_ANOULT" ;
      edtPais_Codigo_Internalname = sPrefix+"PAIS_CODIGO" ;
      edtPais_Descripcion_Internalname = sPrefix+"PAIS_DESCRIPCION" ;
      edtRegi_Padre_Internalname = sPrefix+"REGI_PADRE" ;
      edtRegi_Importar_Internalname = sPrefix+"REGI_IMPORTAR" ;
      edtRegi_Estado_Internalname = sPrefix+"REGI_ESTADO" ;
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
      edtRegi_Estado_Jsonclick = "" ;
      edtRegi_Estado_Enabled = 0 ;
      edtRegi_Importar_Jsonclick = "" ;
      edtRegi_Importar_Enabled = 0 ;
      edtRegi_Padre_Jsonclick = "" ;
      edtRegi_Padre_Enabled = 0 ;
      edtPais_Descripcion_Jsonclick = "" ;
      edtPais_Descripcion_Link = "" ;
      edtPais_Descripcion_Enabled = 0 ;
      edtPais_Codigo_Jsonclick = "" ;
      edtPais_Codigo_Enabled = 0 ;
      edtRegi_AnoUlt_Jsonclick = "" ;
      edtRegi_AnoUlt_Enabled = 0 ;
      edtRegi_MesUlt_Jsonclick = "" ;
      edtRegi_MesUlt_Enabled = 0 ;
      edtRegi_Graba_Jsonclick = "" ;
      edtRegi_Graba_Enabled = 0 ;
      edtRegi_FechaModifica_Jsonclick = "" ;
      edtRegi_FechaModifica_Enabled = 0 ;
      edtRegi_UsuarioModifica_Jsonclick = "" ;
      edtRegi_UsuarioModifica_Enabled = 0 ;
      edtRegi_FechaCrea_Jsonclick = "" ;
      edtRegi_FechaCrea_Enabled = 0 ;
      edtRegi_UsuarioCrea_Jsonclick = "" ;
      edtRegi_UsuarioCrea_Enabled = 0 ;
      edtRegi_CndMon_Jsonclick = "" ;
      edtRegi_CndMon_Enabled = 0 ;
      edtRegi_CndPTes_Jsonclick = "" ;
      edtRegi_CndPTes_Enabled = 0 ;
      edtRegi_CndPre_Jsonclick = "" ;
      edtRegi_CndPre_Enabled = 0 ;
      edtRegi_TpMvo_Jsonclick = "" ;
      edtRegi_TpMvo_Enabled = 0 ;
      edtRegi_Abrev_Jsonclick = "" ;
      edtRegi_Abrev_Enabled = 0 ;
      edtRegi_NroRif_Jsonclick = "" ;
      edtRegi_NroRif_Enabled = 0 ;
      edtRegi_NroPer_Jsonclick = "" ;
      edtRegi_NroPer_Enabled = 0 ;
      edtRegi_AnoCal_Jsonclick = "" ;
      edtRegi_AnoCal_Enabled = 0 ;
      edtRegi_AnoAct_Jsonclick = "" ;
      edtRegi_AnoAct_Enabled = 0 ;
      edtRegi_PerAct_Jsonclick = "" ;
      edtRegi_PerAct_Enabled = 0 ;
      edtRegi_AnoArr_Jsonclick = "" ;
      edtRegi_AnoArr_Enabled = 0 ;
      edtRegi_MesArr_Jsonclick = "" ;
      edtRegi_MesArr_Enabled = 0 ;
      edtRegi_EtCf_Jsonclick = "" ;
      edtRegi_EtCf_Enabled = 0 ;
      edtRegi_EtCo_Jsonclick = "" ;
      edtRegi_EtCo_Enabled = 0 ;
      edtRegi_EtCt_Jsonclick = "" ;
      edtRegi_EtCt_Enabled = 0 ;
      edtRegi_Conse_Tran_Jsonclick = "" ;
      edtRegi_Conse_Tran_Enabled = 0 ;
      edtCiud_Descripcion_Jsonclick = "" ;
      edtCiud_Descripcion_Link = "" ;
      edtCiud_Descripcion_Enabled = 0 ;
      edtCiud_Codigo_Jsonclick = "" ;
      edtCiud_Codigo_Enabled = 0 ;
      edtDept_Descripcion_Jsonclick = "" ;
      edtDept_Descripcion_Link = "" ;
      edtDept_Descripcion_Enabled = 0 ;
      edtDept_Codigo_Jsonclick = "" ;
      edtDept_Codigo_Enabled = 0 ;
      edtRegi_DirCia_Enabled = 0 ;
      edtRegi_Descripcion_Jsonclick = "" ;
      edtRegi_Descripcion_Enabled = 0 ;
      edtRegi_Cod_Jsonclick = "" ;
      edtRegi_Cod_Enabled = 0 ;
      edtRegi_Id_Jsonclick = "" ;
      edtRegi_Id_Enabled = 0 ;
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
      setEventMetadata("'DOUPDATE'","{handler:'e112K1',iparms:[{av:'A2Regi_Id',fld:'REGI_ID',pic:'ZZZZZZZZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e122K1',iparms:[{av:'A2Regi_Id',fld:'REGI_ID',pic:'ZZZZZZZZZZ9',nv:0}],oparms:[]}");
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
      A13Regi_Descripcion = "" ;
      A153Regi_DirCia = "" ;
      A165Regi_NroRif = "" ;
      A154Regi_Abrev = "" ;
      A156Regi_CndPre = "" ;
      A157Regi_CndPTes = "" ;
      A158Regi_CndMon = "" ;
      A140Regi_UsuarioCrea = "" ;
      A141Regi_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A142Regi_UsuarioModifica = "" ;
      A143Regi_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      A159Regi_Graba = "" ;
      A163Regi_Importar = "" ;
      A164Regi_Estado = "" ;
      GXKey = "" ;
      forbiddenHiddens = "" ;
      GX_FocusControl = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      A10Dept_Descripcion = "" ;
      A7Ciud_Descripcion = "" ;
      A9Pais_Codigo = "" ;
      A11Pais_Descripcion = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV15Pgmname = "" ;
      scmdbuf = "" ;
      H002K2_A2Regi_Id = new long[1] ;
      H002K2_A164Regi_Estado = new String[] {""} ;
      H002K2_A163Regi_Importar = new String[] {""} ;
      H002K2_A162Regi_Padre = new short[1] ;
      H002K2_A11Pais_Descripcion = new String[] {""} ;
      H002K2_A9Pais_Codigo = new String[] {""} ;
      H002K2_A161Regi_AnoUlt = new short[1] ;
      H002K2_A160Regi_MesUlt = new byte[1] ;
      H002K2_A159Regi_Graba = new String[] {""} ;
      H002K2_A143Regi_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H002K2_A142Regi_UsuarioModifica = new String[] {""} ;
      H002K2_A141Regi_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      H002K2_A140Regi_UsuarioCrea = new String[] {""} ;
      H002K2_A158Regi_CndMon = new String[] {""} ;
      H002K2_A157Regi_CndPTes = new String[] {""} ;
      H002K2_A156Regi_CndPre = new String[] {""} ;
      H002K2_A155Regi_TpMvo = new byte[1] ;
      H002K2_A154Regi_Abrev = new String[] {""} ;
      H002K2_A165Regi_NroRif = new String[] {""} ;
      H002K2_A152Regi_NroPer = new byte[1] ;
      H002K2_A151Regi_AnoCal = new short[1] ;
      H002K2_A150Regi_AnoAct = new short[1] ;
      H002K2_A149Regi_PerAct = new byte[1] ;
      H002K2_A148Regi_AnoArr = new short[1] ;
      H002K2_A147Regi_MesArr = new byte[1] ;
      H002K2_A146Regi_EtCf = new byte[1] ;
      H002K2_A145Regi_EtCo = new byte[1] ;
      H002K2_A144Regi_EtCt = new byte[1] ;
      H002K2_A698Regi_Conse_Tran = new int[1] ;
      H002K2_A7Ciud_Descripcion = new String[] {""} ;
      H002K2_A5Ciud_Codigo = new short[1] ;
      H002K2_A10Dept_Descripcion = new String[] {""} ;
      H002K2_A6Dept_Codigo = new short[1] ;
      H002K2_A153Regi_DirCia = new String[] {""} ;
      H002K2_A13Regi_Descripcion = new String[] {""} ;
      H002K2_A12Regi_Cod = new short[1] ;
      hsh = "" ;
      AV10TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV6HTTPRequest = httpContext.getHttpRequest();
      AV11TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV9Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA2Regi_Id = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.gen_regionalgeneral__default(),
         new Object[] {
             new Object[] {
            H002K2_A2Regi_Id, H002K2_A164Regi_Estado, H002K2_A163Regi_Importar, H002K2_A162Regi_Padre, H002K2_A11Pais_Descripcion, H002K2_A9Pais_Codigo, H002K2_A161Regi_AnoUlt, H002K2_A160Regi_MesUlt, H002K2_A159Regi_Graba, H002K2_A143Regi_FechaModifica,
            H002K2_A142Regi_UsuarioModifica, H002K2_A141Regi_FechaCrea, H002K2_A140Regi_UsuarioCrea, H002K2_A158Regi_CndMon, H002K2_A157Regi_CndPTes, H002K2_A156Regi_CndPre, H002K2_A155Regi_TpMvo, H002K2_A154Regi_Abrev, H002K2_A165Regi_NroRif, H002K2_A152Regi_NroPer,
            H002K2_A151Regi_AnoCal, H002K2_A150Regi_AnoAct, H002K2_A149Regi_PerAct, H002K2_A148Regi_AnoArr, H002K2_A147Regi_MesArr, H002K2_A146Regi_EtCf, H002K2_A145Regi_EtCo, H002K2_A144Regi_EtCt, H002K2_A698Regi_Conse_Tran, H002K2_A7Ciud_Descripcion,
            H002K2_A5Ciud_Codigo, H002K2_A10Dept_Descripcion, H002K2_A6Dept_Codigo, H002K2_A153Regi_DirCia, H002K2_A13Regi_Descripcion, H002K2_A12Regi_Cod
            }
         }
      );
      AV15Pgmname = "GEN_REGIONALGeneral" ;
      /* GeneXus formulas. */
      AV15Pgmname = "GEN_REGIONALGeneral" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte A144Regi_EtCt ;
   private byte A145Regi_EtCo ;
   private byte A146Regi_EtCf ;
   private byte A147Regi_MesArr ;
   private byte A149Regi_PerAct ;
   private byte A152Regi_NroPer ;
   private byte A155Regi_TpMvo ;
   private byte A160Regi_MesUlt ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short A12Regi_Cod ;
   private short A5Ciud_Codigo ;
   private short A148Regi_AnoArr ;
   private short A150Regi_AnoAct ;
   private short A151Regi_AnoCal ;
   private short A161Regi_AnoUlt ;
   private short A162Regi_Padre ;
   private short wbEnd ;
   private short wbStart ;
   private short A6Dept_Codigo ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int A698Regi_Conse_Tran ;
   private int edtRegi_Id_Enabled ;
   private int edtRegi_Cod_Enabled ;
   private int edtRegi_Descripcion_Enabled ;
   private int edtRegi_DirCia_Enabled ;
   private int edtDept_Codigo_Enabled ;
   private int edtDept_Descripcion_Enabled ;
   private int edtCiud_Codigo_Enabled ;
   private int edtCiud_Descripcion_Enabled ;
   private int edtRegi_Conse_Tran_Enabled ;
   private int edtRegi_EtCt_Enabled ;
   private int edtRegi_EtCo_Enabled ;
   private int edtRegi_EtCf_Enabled ;
   private int edtRegi_MesArr_Enabled ;
   private int edtRegi_AnoArr_Enabled ;
   private int edtRegi_PerAct_Enabled ;
   private int edtRegi_AnoAct_Enabled ;
   private int edtRegi_AnoCal_Enabled ;
   private int edtRegi_NroPer_Enabled ;
   private int edtRegi_NroRif_Enabled ;
   private int edtRegi_Abrev_Enabled ;
   private int edtRegi_TpMvo_Enabled ;
   private int edtRegi_CndPre_Enabled ;
   private int edtRegi_CndPTes_Enabled ;
   private int edtRegi_CndMon_Enabled ;
   private int edtRegi_UsuarioCrea_Enabled ;
   private int edtRegi_FechaCrea_Enabled ;
   private int edtRegi_UsuarioModifica_Enabled ;
   private int edtRegi_FechaModifica_Enabled ;
   private int edtRegi_Graba_Enabled ;
   private int edtRegi_MesUlt_Enabled ;
   private int edtRegi_AnoUlt_Enabled ;
   private int edtPais_Codigo_Enabled ;
   private int edtPais_Descripcion_Enabled ;
   private int edtRegi_Padre_Enabled ;
   private int edtRegi_Importar_Enabled ;
   private int edtRegi_Estado_Enabled ;
   private int idxLst ;
   private long wcpOA2Regi_Id ;
   private long A2Regi_Id ;
   private long AV8Regi_Id ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A164Regi_Estado ;
   private String GXKey ;
   private String forbiddenHiddens ;
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
   private String edtRegi_Id_Internalname ;
   private String edtRegi_Id_Jsonclick ;
   private String edtRegi_Cod_Internalname ;
   private String edtRegi_Cod_Jsonclick ;
   private String edtRegi_Descripcion_Internalname ;
   private String edtRegi_Descripcion_Jsonclick ;
   private String edtRegi_DirCia_Internalname ;
   private String edtDept_Codigo_Internalname ;
   private String edtDept_Codigo_Jsonclick ;
   private String edtDept_Descripcion_Internalname ;
   private String edtDept_Descripcion_Link ;
   private String edtDept_Descripcion_Jsonclick ;
   private String edtCiud_Codigo_Internalname ;
   private String edtCiud_Codigo_Jsonclick ;
   private String edtCiud_Descripcion_Internalname ;
   private String edtCiud_Descripcion_Link ;
   private String edtCiud_Descripcion_Jsonclick ;
   private String edtRegi_Conse_Tran_Internalname ;
   private String edtRegi_Conse_Tran_Jsonclick ;
   private String edtRegi_EtCt_Internalname ;
   private String edtRegi_EtCt_Jsonclick ;
   private String edtRegi_EtCo_Internalname ;
   private String edtRegi_EtCo_Jsonclick ;
   private String edtRegi_EtCf_Internalname ;
   private String edtRegi_EtCf_Jsonclick ;
   private String edtRegi_MesArr_Internalname ;
   private String edtRegi_MesArr_Jsonclick ;
   private String edtRegi_AnoArr_Internalname ;
   private String edtRegi_AnoArr_Jsonclick ;
   private String edtRegi_PerAct_Internalname ;
   private String edtRegi_PerAct_Jsonclick ;
   private String edtRegi_AnoAct_Internalname ;
   private String edtRegi_AnoAct_Jsonclick ;
   private String edtRegi_AnoCal_Internalname ;
   private String edtRegi_AnoCal_Jsonclick ;
   private String edtRegi_NroPer_Internalname ;
   private String edtRegi_NroPer_Jsonclick ;
   private String edtRegi_NroRif_Internalname ;
   private String edtRegi_NroRif_Jsonclick ;
   private String edtRegi_Abrev_Internalname ;
   private String edtRegi_Abrev_Jsonclick ;
   private String edtRegi_TpMvo_Internalname ;
   private String edtRegi_TpMvo_Jsonclick ;
   private String edtRegi_CndPre_Internalname ;
   private String edtRegi_CndPre_Jsonclick ;
   private String edtRegi_CndPTes_Internalname ;
   private String edtRegi_CndPTes_Jsonclick ;
   private String edtRegi_CndMon_Internalname ;
   private String edtRegi_CndMon_Jsonclick ;
   private String edtRegi_UsuarioCrea_Internalname ;
   private String edtRegi_UsuarioCrea_Jsonclick ;
   private String edtRegi_FechaCrea_Internalname ;
   private String edtRegi_FechaCrea_Jsonclick ;
   private String edtRegi_UsuarioModifica_Internalname ;
   private String edtRegi_UsuarioModifica_Jsonclick ;
   private String edtRegi_FechaModifica_Internalname ;
   private String edtRegi_FechaModifica_Jsonclick ;
   private String edtRegi_Graba_Internalname ;
   private String edtRegi_Graba_Jsonclick ;
   private String edtRegi_MesUlt_Internalname ;
   private String edtRegi_MesUlt_Jsonclick ;
   private String edtRegi_AnoUlt_Internalname ;
   private String edtRegi_AnoUlt_Jsonclick ;
   private String edtPais_Codigo_Internalname ;
   private String edtPais_Codigo_Jsonclick ;
   private String edtPais_Descripcion_Internalname ;
   private String edtPais_Descripcion_Link ;
   private String edtPais_Descripcion_Jsonclick ;
   private String edtRegi_Padre_Internalname ;
   private String edtRegi_Padre_Jsonclick ;
   private String edtRegi_Importar_Internalname ;
   private String edtRegi_Importar_Jsonclick ;
   private String edtRegi_Estado_Internalname ;
   private String edtRegi_Estado_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV15Pgmname ;
   private String scmdbuf ;
   private String hsh ;
   private String sCtrlA2Regi_Id ;
   private java.util.Date A141Regi_FechaCrea ;
   private java.util.Date A143Regi_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private String A13Regi_Descripcion ;
   private String A153Regi_DirCia ;
   private String A165Regi_NroRif ;
   private String A154Regi_Abrev ;
   private String A156Regi_CndPre ;
   private String A157Regi_CndPTes ;
   private String A158Regi_CndMon ;
   private String A140Regi_UsuarioCrea ;
   private String A142Regi_UsuarioModifica ;
   private String A159Regi_Graba ;
   private String A163Regi_Importar ;
   private String A10Dept_Descripcion ;
   private String A7Ciud_Descripcion ;
   private String A9Pais_Codigo ;
   private String A11Pais_Descripcion ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV6HTTPRequest ;
   private IDataStoreProvider pr_default ;
   private long[] H002K2_A2Regi_Id ;
   private String[] H002K2_A164Regi_Estado ;
   private String[] H002K2_A163Regi_Importar ;
   private short[] H002K2_A162Regi_Padre ;
   private String[] H002K2_A11Pais_Descripcion ;
   private String[] H002K2_A9Pais_Codigo ;
   private short[] H002K2_A161Regi_AnoUlt ;
   private byte[] H002K2_A160Regi_MesUlt ;
   private String[] H002K2_A159Regi_Graba ;
   private java.util.Date[] H002K2_A143Regi_FechaModifica ;
   private String[] H002K2_A142Regi_UsuarioModifica ;
   private java.util.Date[] H002K2_A141Regi_FechaCrea ;
   private String[] H002K2_A140Regi_UsuarioCrea ;
   private String[] H002K2_A158Regi_CndMon ;
   private String[] H002K2_A157Regi_CndPTes ;
   private String[] H002K2_A156Regi_CndPre ;
   private byte[] H002K2_A155Regi_TpMvo ;
   private String[] H002K2_A154Regi_Abrev ;
   private String[] H002K2_A165Regi_NroRif ;
   private byte[] H002K2_A152Regi_NroPer ;
   private short[] H002K2_A151Regi_AnoCal ;
   private short[] H002K2_A150Regi_AnoAct ;
   private byte[] H002K2_A149Regi_PerAct ;
   private short[] H002K2_A148Regi_AnoArr ;
   private byte[] H002K2_A147Regi_MesArr ;
   private byte[] H002K2_A146Regi_EtCf ;
   private byte[] H002K2_A145Regi_EtCo ;
   private byte[] H002K2_A144Regi_EtCt ;
   private int[] H002K2_A698Regi_Conse_Tran ;
   private String[] H002K2_A7Ciud_Descripcion ;
   private short[] H002K2_A5Ciud_Codigo ;
   private String[] H002K2_A10Dept_Descripcion ;
   private short[] H002K2_A6Dept_Codigo ;
   private String[] H002K2_A153Regi_DirCia ;
   private String[] H002K2_A13Regi_Descripcion ;
   private short[] H002K2_A12Regi_Cod ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private com.orions2.SdtTransactionContext AV10TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV11TrnContextAtt ;
}

final  class gen_regionalgeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H002K2", "SELECT T1.Regi_Id, T1.Regi_Estado, T1.Regi_Importar, T1.Regi_Padre, T4.Pais_Descripcion, T3.Pais_Codigo, T1.Regi_AnoUlt, T1.Regi_MesUlt, T1.Regi_Graba, T1.Regi_FechaModifica, T1.Regi_UsuarioModifica, T1.Regi_FechaCrea, T1.Regi_UsuarioCrea, T1.Regi_CndMon, T1.Regi_CndPTes, T1.Regi_CndPre, T1.Regi_TpMvo, T1.Regi_Abrev, T1.Regi_NroRif, T1.Regi_NroPer, T1.Regi_AnoCal, T1.Regi_AnoAct, T1.Regi_PerAct, T1.Regi_AnoArr, T1.Regi_MesArr, T1.Regi_EtCf, T1.Regi_EtCo, T1.Regi_EtCt, T1.Regi_Conse_Tran, T2.Ciud_Descripcion, T1.Ciud_Codigo, T3.Dept_Descripcion, T2.Dept_Codigo, T1.Regi_DirCia, T1.Regi_Descripcion, T1.Regi_Cod FROM (((GEN_REGIONAL T1 INNER JOIN GEN_CIUDAD T2 ON T2.Ciud_Codigo = T1.Ciud_Codigo) INNER JOIN GEN_DEPARTAMENTO T3 ON T3.Dept_Codigo = T2.Dept_Codigo) INNER JOIN GEN_PAIS T4 ON T4.Pais_Codigo = T3.Pais_Codigo) WHERE T1.Regi_Id = ? ORDER BY T1.Regi_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((byte[]) buf[7])[0] = rslt.getByte(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(12) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(14) ;
               ((String[]) buf[14])[0] = rslt.getVarchar(15) ;
               ((String[]) buf[15])[0] = rslt.getVarchar(16) ;
               ((byte[]) buf[16])[0] = rslt.getByte(17) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(18) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(19) ;
               ((byte[]) buf[19])[0] = rslt.getByte(20) ;
               ((short[]) buf[20])[0] = rslt.getShort(21) ;
               ((short[]) buf[21])[0] = rslt.getShort(22) ;
               ((byte[]) buf[22])[0] = rslt.getByte(23) ;
               ((short[]) buf[23])[0] = rslt.getShort(24) ;
               ((byte[]) buf[24])[0] = rslt.getByte(25) ;
               ((byte[]) buf[25])[0] = rslt.getByte(26) ;
               ((byte[]) buf[26])[0] = rslt.getByte(27) ;
               ((byte[]) buf[27])[0] = rslt.getByte(28) ;
               ((int[]) buf[28])[0] = rslt.getInt(29) ;
               ((String[]) buf[29])[0] = rslt.getVarchar(30) ;
               ((short[]) buf[30])[0] = rslt.getShort(31) ;
               ((String[]) buf[31])[0] = rslt.getVarchar(32) ;
               ((short[]) buf[32])[0] = rslt.getShort(33) ;
               ((String[]) buf[33])[0] = rslt.getVarchar(34) ;
               ((String[]) buf[34])[0] = rslt.getVarchar(35) ;
               ((short[]) buf[35])[0] = rslt.getShort(36) ;
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

