/*
               File: alm_transacciongeneral_impl
        Description: ALM_TRANSACCIONGeneral
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:13:37.69
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

public final  class alm_transacciongeneral_impl extends GXWebComponent
{
   public alm_transacciongeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_transacciongeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_transacciongeneral_impl.class ));
   }

   public alm_transacciongeneral_impl( int remoteHandle ,
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
      cmbTran_Estado = new HTMLChoice();
      cmbTran_IndAreadante = new HTMLChoice();
      cmbTran_IndCurso = new HTMLChoice();
      cmbTran_IndE_S = new HTMLChoice();
      cmbTran_TipoElemento = new HTMLChoice();
      cmbTran_TipoIngreso = new HTMLChoice();
      cmbTran_TipoEntra = new HTMLChoice();
      cmbTran_SolicitaCCDestino = new HTMLChoice();
      cmbTran_SolicitaRegionDestino = new HTMLChoice();
      cmbTran_CuentaResponsabilidad = new HTMLChoice();
      cmbTran_EntidadGobierno = new HTMLChoice();
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
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,new Long(A46Tran_Id)});
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
         pa0X2( ) ;
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
         httpContext.writeValue( "ALM_TRANSACCIONGeneral") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414133790");
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_transacciongeneral") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A46Tran_Id,11,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_CONSECUTIVOCC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A513Tran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_CODIGOMOVIMIENTO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A49Tran_CodigoMovimiento, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_FECHAREGISTRO", getSecureSignedToken( sPrefix, localUtil.format( A55Tran_FechaRegistro, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_MODULOORIGEN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A110Tran_ModuloOrigen, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_CODALMAORIGEN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A109Tran_CodAlmaOrigen, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A58Tran_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_CODBODEORIGEN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A112Tran_CodBodeOrigen, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_IDCUENTADANTEORIGEN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A51Tran_IdCuentadanteOrigen), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_MODULODESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A385Tran_ModuloDestino, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_CODALMADESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A111Tran_CodAlmaDestino, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_CODBODEDESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A387Tran_CodBodeDestino, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_IDCUENTADANTEDESTINO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A52Tran_IdCuentadanteDestino), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_FECHARATIFICACION", getSecureSignedToken( sPrefix, localUtil.format( A390Tran_FechaRatificacion, "99/99/9999 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_USUARIORATIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A391Tran_UsuarioRatifica, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_OBSERVACIONES", getSecureSignedToken( sPrefix, A416Tran_Observaciones));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_USUARIOID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A47Tran_UsuarioId), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_CENTROCOSTOID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A48Tran_CentroCostoId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_REGIONID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A57Tran_RegionId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_AREADANTECODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A407Tran_AreadanteCodigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_CURSOCODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A408Tran_CursoCodigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_INDE_S", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A481Tran_IndE_S, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_VALORTRANSACCION", getSecureSignedToken( sPrefix, localUtil.format( A483Tran_ValorTransaccion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_NUMEROLINEAS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A498Tran_NumeroLineas), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_TIPOELEMENTO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A482Tran_TipoElemento, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_TIPOINGRESO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A54Tran_TipoIngreso), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_NUMEROINGRESO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A514Tran_NumeroIngreso, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_FECHAINGRESO", getSecureSignedToken( sPrefix, A515Tran_FechaIngreso));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_CENTROCOSTOIDDESTINO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A50Tran_CentroCostoIdDestino), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_REGIONIDDESTINO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A518Tran_RegionIdDestino), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_TIPOENTRA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A527Tran_TipoEntra, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_CANTIDADPADRES", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A568Tran_CantidadPadres), "ZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_IDPROVEEDOR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A53Tran_IdProveedor), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_DETALLE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A524Tran_Detalle, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_NUMEROGRUPO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A667Tran_NumeroGrupo), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_USUARIOELIMINAOANULA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A668Tran_UsuarioEliminaoAnula, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_FECHAELIMINAOANULA", getSecureSignedToken( sPrefix, localUtil.format( A669Tran_FechaEliminaoAnula, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_OBSERVACIONESANULA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A670Tran_ObservacionesAnula, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_IDCUENTADANTERESPONSABILI", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A56Tran_IdCuentadanteResponsabili), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_TRANSACCRESPONSABILIDAD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A719Tran_TransaccResponsabilidad), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_FECHARESPONSABILIDAD", getSecureSignedToken( sPrefix, A720Tran_FechaResponsabilidad));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_TABLARESPONSABILIDAD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A758Tran_TablaResponsabilidad), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TRAN_ENTIDADGOBIERNO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A859Tran_EntidadGobierno, ""))));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm0X2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("alm_transacciongeneral.js", "?20186141413384");
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
      return "ALM_TRANSACCIONGeneral" ;
   }

   public String getPgmdesc( )
   {
      return "ALM_TRANSACCIONGeneral" ;
   }

   public void wb0X0( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.alm_transacciongeneral");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", "Modificar", bttBtnupdate_Jsonclick, 7, "Modificar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e110x1_client"+"'", TempTags, "", 2, "HLP_ALM_TRANSACCIONGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", "Eliminar", bttBtndelete_Jsonclick, 7, "Eliminar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e120x1_client"+"'", TempTags, "", 2, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_ConsecutivoCC_Internalname, "por Movimiento", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_ConsecutivoCC_Internalname, GXutil.ltrim( localUtil.ntoc( A513Tran_ConsecutivoCC, (byte)(18), (byte)(0), ",", "")), ((edtTran_ConsecutivoCC_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A513Tran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A513Tran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_ConsecutivoCC_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_ConsecutivoCC_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CodigoMovimiento_Internalname, "Cod Movimiento", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CodigoMovimiento_Internalname, A49Tran_CodigoMovimiento, GXutil.rtrim( localUtil.format( A49Tran_CodigoMovimiento, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CodigoMovimiento_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_CodigoMovimiento_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_FechaRegistro_Internalname, "Fecha de Registro", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtTran_FechaRegistro_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_FechaRegistro_Internalname, localUtil.ttoc( A55Tran_FechaRegistro, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A55Tran_FechaRegistro, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_FechaRegistro_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_FechaRegistro_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_TRANSACCIONGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtTran_FechaRegistro_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTran_FechaRegistro_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_TRANSACCIONGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_ModuloOrigen_Internalname, "Modulo Origen", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_ModuloOrigen_Internalname, A110Tran_ModuloOrigen, GXutil.rtrim( localUtil.format( A110Tran_ModuloOrigen, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_ModuloOrigen_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_ModuloOrigen_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Modulo", "left", true, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CodAlmaOrigen_Internalname, "Almacén Origen", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CodAlmaOrigen_Internalname, A109Tran_CodAlmaOrigen, GXutil.rtrim( localUtil.format( A109Tran_CodAlmaOrigen, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CodAlmaOrigen_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_CodAlmaOrigen_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTran_Estado.getInternalname(), "Estado", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTran_Estado, cmbTran_Estado.getInternalname(), GXutil.rtrim( A58Tran_Estado), 1, cmbTran_Estado.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbTran_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_TRANSACCIONGeneral.htm");
         cmbTran_Estado.setValue( GXutil.rtrim( A58Tran_Estado) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTran_Estado.getInternalname(), "Values", cmbTran_Estado.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CodBodeOrigen_Internalname, "Bodega Origen", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CodBodeOrigen_Internalname, A112Tran_CodBodeOrigen, GXutil.rtrim( localUtil.format( A112Tran_CodBodeOrigen, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CodBodeOrigen_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_CodBodeOrigen_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_IdCuentadanteOrigen_Internalname, "Cuentadante Origen", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_IdCuentadanteOrigen_Internalname, GXutil.ltrim( localUtil.ntoc( A51Tran_IdCuentadanteOrigen, (byte)(18), (byte)(0), ",", "")), ((edtTran_IdCuentadanteOrigen_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A51Tran_IdCuentadanteOrigen), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A51Tran_IdCuentadanteOrigen), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_IdCuentadanteOrigen_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_IdCuentadanteOrigen_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_ModuloDestino_Internalname, "Modulo Destino", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_ModuloDestino_Internalname, A385Tran_ModuloDestino, GXutil.rtrim( localUtil.format( A385Tran_ModuloDestino, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_ModuloDestino_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_ModuloDestino_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Modulo", "left", true, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CodAlmaDestino_Internalname, "Almacén Destino", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CodAlmaDestino_Internalname, A111Tran_CodAlmaDestino, GXutil.rtrim( localUtil.format( A111Tran_CodAlmaDestino, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CodAlmaDestino_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_CodAlmaDestino_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CodBodeDestino_Internalname, "Bodega Destino", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CodBodeDestino_Internalname, A387Tran_CodBodeDestino, GXutil.rtrim( localUtil.format( A387Tran_CodBodeDestino, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CodBodeDestino_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_CodBodeDestino_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_IdCuentadanteDestino_Internalname, "Cuentadante Destino", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_IdCuentadanteDestino_Internalname, GXutil.ltrim( localUtil.ntoc( A52Tran_IdCuentadanteDestino, (byte)(18), (byte)(0), ",", "")), ((edtTran_IdCuentadanteDestino_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A52Tran_IdCuentadanteDestino), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A52Tran_IdCuentadanteDestino), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_IdCuentadanteDestino_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_IdCuentadanteDestino_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_FechaRatificacion_Internalname, "Ratificacion", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtTran_FechaRatificacion_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_FechaRatificacion_Internalname, localUtil.ttoc( A390Tran_FechaRatificacion, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A390Tran_FechaRatificacion, "99/99/9999 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_FechaRatificacion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_FechaRatificacion_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TRANSACCIONGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtTran_FechaRatificacion_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTran_FechaRatificacion_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_TRANSACCIONGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_UsuarioRatifica_Internalname, "Ratifica", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_UsuarioRatifica_Internalname, A391Tran_UsuarioRatifica, GXutil.rtrim( localUtil.format( A391Tran_UsuarioRatifica, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_UsuarioRatifica_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_UsuarioRatifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_DescripcionMovimiento_Internalname, "Movimiento", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_DescripcionMovimiento_Internalname, A381Tran_DescripcionMovimiento, GXutil.rtrim( localUtil.format( A381Tran_DescripcionMovimiento, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_DescripcionMovimiento_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_DescripcionMovimiento_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_Observaciones_Internalname, "Observaciones", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Multiple line edit */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtTran_Observaciones_Internalname, A416Tran_Observaciones, "", "", (short)(0), 1, edtTran_Observaciones_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_UsuarioId_Internalname, "Id Usuario", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_UsuarioId_Internalname, GXutil.ltrim( localUtil.ntoc( A47Tran_UsuarioId, (byte)(18), (byte)(0), ",", "")), ((edtTran_UsuarioId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A47Tran_UsuarioId), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A47Tran_UsuarioId), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_UsuarioId_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_UsuarioId_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "IdLargo", "right", false, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_UsuarioCodigo_Internalname, "Cod Usuario", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_UsuarioCodigo_Internalname, A417Tran_UsuarioCodigo, GXutil.rtrim( localUtil.format( A417Tran_UsuarioCodigo, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_UsuarioCodigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_UsuarioCodigo_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_UsuarioNombre_Internalname, "Nombre Usuario", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_UsuarioNombre_Internalname, A418Tran_UsuarioNombre, GXutil.rtrim( localUtil.format( A418Tran_UsuarioNombre, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_UsuarioNombre_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_UsuarioNombre_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CentroCostoId_Internalname, "Id C.C", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CentroCostoId_Internalname, GXutil.ltrim( localUtil.ntoc( A48Tran_CentroCostoId, (byte)(11), (byte)(0), ",", "")), ((edtTran_CentroCostoId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A48Tran_CentroCostoId), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A48Tran_CentroCostoId), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CentroCostoId_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_CentroCostoId_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CentroCostoCodigo_Internalname, "Código C.C", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CentroCostoCodigo_Internalname, A419Tran_CentroCostoCodigo, GXutil.rtrim( localUtil.format( A419Tran_CentroCostoCodigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CentroCostoCodigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_CentroCostoCodigo_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CentroCostoDescripcion_Internalname, "Descripcion C.C", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CentroCostoDescripcion_Internalname, A420Tran_CentroCostoDescripcion, GXutil.rtrim( localUtil.format( A420Tran_CentroCostoDescripcion, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CentroCostoDescripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_CentroCostoDescripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_RegionId_Internalname, "Id Región", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_RegionId_Internalname, GXutil.ltrim( localUtil.ntoc( A57Tran_RegionId, (byte)(11), (byte)(0), ",", "")), ((edtTran_RegionId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A57Tran_RegionId), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A57Tran_RegionId), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_RegionId_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_RegionId_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_RegionCodigo_Internalname, "Código Región", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_RegionCodigo_Internalname, GXutil.ltrim( localUtil.ntoc( A421Tran_RegionCodigo, (byte)(4), (byte)(0), ",", "")), ((edtTran_RegionCodigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A421Tran_RegionCodigo), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A421Tran_RegionCodigo), "ZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_RegionCodigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_RegionCodigo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_RegionDescripcion_Internalname, "Descripción Regional", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_RegionDescripcion_Internalname, A422Tran_RegionDescripcion, GXutil.rtrim( localUtil.format( A422Tran_RegionDescripcion, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_RegionDescripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_RegionDescripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_AreadanteCodigo_Internalname, "Areadante", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_AreadanteCodigo_Internalname, A407Tran_AreadanteCodigo, GXutil.rtrim( localUtil.format( A407Tran_AreadanteCodigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_AreadanteCodigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_AreadanteCodigo_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CursoCodigo_Internalname, "Curso", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CursoCodigo_Internalname, A408Tran_CursoCodigo, GXutil.rtrim( localUtil.format( A408Tran_CursoCodigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CursoCodigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_CursoCodigo_Enabled, 0, "text", "", 41, "chr", 1, "row", 41, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTran_IndAreadante.getInternalname(), "Areadante", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTran_IndAreadante, cmbTran_IndAreadante.getInternalname(), GXutil.rtrim( A478Tran_IndAreadante), 1, cmbTran_IndAreadante.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTran_IndAreadante.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_TRANSACCIONGeneral.htm");
         cmbTran_IndAreadante.setValue( GXutil.rtrim( A478Tran_IndAreadante) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTran_IndAreadante.getInternalname(), "Values", cmbTran_IndAreadante.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTran_IndCurso.getInternalname(), "Curso", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTran_IndCurso, cmbTran_IndCurso.getInternalname(), GXutil.rtrim( A479Tran_IndCurso), 1, cmbTran_IndCurso.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTran_IndCurso.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_TRANSACCIONGeneral.htm");
         cmbTran_IndCurso.setValue( GXutil.rtrim( A479Tran_IndCurso) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTran_IndCurso.getInternalname(), "Values", cmbTran_IndCurso.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTran_IndE_S.getInternalname(), "Entrada/ Salida", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTran_IndE_S, cmbTran_IndE_S.getInternalname(), GXutil.rtrim( A481Tran_IndE_S), 1, cmbTran_IndE_S.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTran_IndE_S.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_ValorTransaccion_Internalname, "Transaccion", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_ValorTransaccion_Internalname, GXutil.ltrim( localUtil.ntoc( A483Tran_ValorTransaccion, (byte)(24), (byte)(2), ",", "")), ((edtTran_ValorTransaccion_Enabled!=0) ? GXutil.ltrim( localUtil.format( A483Tran_ValorTransaccion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A483Tran_ValorTransaccion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_ValorTransaccion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_ValorTransaccion_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_NumeroLineas_Internalname, "de Lineas", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_NumeroLineas_Internalname, GXutil.ltrim( localUtil.ntoc( A498Tran_NumeroLineas, (byte)(18), (byte)(0), ",", "")), ((edtTran_NumeroLineas_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A498Tran_NumeroLineas), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A498Tran_NumeroLineas), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_NumeroLineas_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_NumeroLineas_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CodTipoElemento_Internalname, "Elemento", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CodTipoElemento_Internalname, GXutil.ltrim( localUtil.ntoc( A499Tran_CodTipoElemento, (byte)(18), (byte)(0), ",", "")), ((edtTran_CodTipoElemento_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A499Tran_CodTipoElemento), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A499Tran_CodTipoElemento), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CodTipoElemento_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_CodTipoElemento_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTran_TipoElemento.getInternalname(), "de Elemento", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTran_TipoElemento, cmbTran_TipoElemento.getInternalname(), GXutil.rtrim( A482Tran_TipoElemento), 1, cmbTran_TipoElemento.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbTran_TipoElemento.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_TRANSACCIONGeneral.htm");
         cmbTran_TipoElemento.setValue( GXutil.rtrim( A482Tran_TipoElemento) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTran_TipoElemento.getInternalname(), "Values", cmbTran_TipoElemento.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTran_TipoIngreso.getInternalname(), "de Ingreso", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTran_TipoIngreso, cmbTran_TipoIngreso.getInternalname(), GXutil.trim( GXutil.str( A54Tran_TipoIngreso, 11, 0)), 1, cmbTran_TipoIngreso.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbTran_TipoIngreso.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_TRANSACCIONGeneral.htm");
         cmbTran_TipoIngreso.setValue( GXutil.trim( GXutil.str( A54Tran_TipoIngreso, 11, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTran_TipoIngreso.getInternalname(), "Values", cmbTran_TipoIngreso.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_NumeroIngreso_Internalname, "de Ingreso", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_NumeroIngreso_Internalname, GXutil.rtrim( A514Tran_NumeroIngreso), GXutil.rtrim( localUtil.format( A514Tran_NumeroIngreso, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_NumeroIngreso_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_NumeroIngreso_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_FechaIngreso_Internalname, "de Ingreso", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtTran_FechaIngreso_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_FechaIngreso_Internalname, localUtil.format(A515Tran_FechaIngreso, "99/99/99"), localUtil.format( A515Tran_FechaIngreso, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_FechaIngreso_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_FechaIngreso_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Fecha", "right", false, "HLP_ALM_TRANSACCIONGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtTran_FechaIngreso_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTran_FechaIngreso_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_TRANSACCIONGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CentroCostoIdDestino_Internalname, "Costo Destino", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CentroCostoIdDestino_Internalname, GXutil.ltrim( localUtil.ntoc( A50Tran_CentroCostoIdDestino, (byte)(11), (byte)(0), ",", "")), ((edtTran_CentroCostoIdDestino_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A50Tran_CentroCostoIdDestino), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A50Tran_CentroCostoIdDestino), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CentroCostoIdDestino_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_CentroCostoIdDestino_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CentroCostoCodigoDestino_Internalname, "Costo Destino", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CentroCostoCodigoDestino_Internalname, A516Tran_CentroCostoCodigoDestino, GXutil.rtrim( localUtil.format( A516Tran_CentroCostoCodigoDestino, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CentroCostoCodigoDestino_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_CentroCostoCodigoDestino_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CentroCostoDescripcionDes_Internalname, "Costo Destino", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CentroCostoDescripcionDes_Internalname, A517Tran_CentroCostoDescripcionDes, GXutil.rtrim( localUtil.format( A517Tran_CentroCostoDescripcionDes, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CentroCostoDescripcionDes_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_CentroCostoDescripcionDes_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_RegionIdDestino_Internalname, "Región Destino", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_RegionIdDestino_Internalname, GXutil.ltrim( localUtil.ntoc( A518Tran_RegionIdDestino, (byte)(11), (byte)(0), ",", "")), ((edtTran_RegionIdDestino_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A518Tran_RegionIdDestino), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A518Tran_RegionIdDestino), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_RegionIdDestino_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_RegionIdDestino_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_RegionCodigoDestino_Internalname, "Región Destino", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_RegionCodigoDestino_Internalname, GXutil.ltrim( localUtil.ntoc( A519Tran_RegionCodigoDestino, (byte)(4), (byte)(0), ",", "")), ((edtTran_RegionCodigoDestino_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A519Tran_RegionCodigoDestino), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A519Tran_RegionCodigoDestino), "ZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_RegionCodigoDestino_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_RegionCodigoDestino_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_RegionDescripcionDestino_Internalname, "Región Destino", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_RegionDescripcionDestino_Internalname, A520Tran_RegionDescripcionDestino, GXutil.rtrim( localUtil.format( A520Tran_RegionDescripcionDestino, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_RegionDescripcionDestino_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_RegionDescripcionDestino_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTran_TipoEntra.getInternalname(), "entrada devolutivo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTran_TipoEntra, cmbTran_TipoEntra.getInternalname(), GXutil.rtrim( A527Tran_TipoEntra), 1, cmbTran_TipoEntra.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbTran_TipoEntra.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_TRANSACCIONGeneral.htm");
         cmbTran_TipoEntra.setValue( GXutil.rtrim( A527Tran_TipoEntra) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTran_TipoEntra.getInternalname(), "Values", cmbTran_TipoEntra.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CantidadPadres_Internalname, "de Padres", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CantidadPadres_Internalname, GXutil.ltrim( localUtil.ntoc( A568Tran_CantidadPadres, (byte)(8), (byte)(0), ",", "")), ((edtTran_CantidadPadres_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A568Tran_CantidadPadres), "ZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A568Tran_CantidadPadres), "ZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CantidadPadres_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_CantidadPadres_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_IdProveedor_Internalname, "Proveedor", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_IdProveedor_Internalname, GXutil.ltrim( localUtil.ntoc( A53Tran_IdProveedor, (byte)(18), (byte)(0), ",", "")), ((edtTran_IdProveedor_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A53Tran_IdProveedor), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A53Tran_IdProveedor), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_IdProveedor_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_IdProveedor_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_RegionAbrev_Internalname, "Abreviatura Región", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_RegionAbrev_Internalname, A594Tran_RegionAbrev, GXutil.rtrim( localUtil.format( A594Tran_RegionAbrev, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_RegionAbrev_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_RegionAbrev_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_RegionAbrevDestino_Internalname, "Abrev Destino", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_RegionAbrevDestino_Internalname, A608Tran_RegionAbrevDestino, GXutil.rtrim( localUtil.format( A608Tran_RegionAbrevDestino, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_RegionAbrevDestino_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_RegionAbrevDestino_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_Detalle_Internalname, "Detalle", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_Detalle_Internalname, GXutil.rtrim( A524Tran_Detalle), GXutil.rtrim( localUtil.format( A524Tran_Detalle, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_Detalle_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_Detalle_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_NumeroGrupo_Internalname, "del Grupo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_NumeroGrupo_Internalname, GXutil.ltrim( localUtil.ntoc( A667Tran_NumeroGrupo, (byte)(4), (byte)(0), ",", "")), ((edtTran_NumeroGrupo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A667Tran_NumeroGrupo), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A667Tran_NumeroGrupo), "ZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_NumeroGrupo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_NumeroGrupo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_UsuarioEliminaoAnula_Internalname, "o Anula", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_UsuarioEliminaoAnula_Internalname, A668Tran_UsuarioEliminaoAnula, GXutil.rtrim( localUtil.format( A668Tran_UsuarioEliminaoAnula, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_UsuarioEliminaoAnula_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_UsuarioEliminaoAnula_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_FechaEliminaoAnula_Internalname, "o Anula", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtTran_FechaEliminaoAnula_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_FechaEliminaoAnula_Internalname, localUtil.ttoc( A669Tran_FechaEliminaoAnula, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A669Tran_FechaEliminaoAnula, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_FechaEliminaoAnula_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_FechaEliminaoAnula_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_TRANSACCIONGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtTran_FechaEliminaoAnula_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTran_FechaEliminaoAnula_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_TRANSACCIONGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_ObservacionesAnula_Internalname, "la Anulación", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Multiple line edit */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtTran_ObservacionesAnula_Internalname, A670Tran_ObservacionesAnula, "", "", (short)(0), 1, edtTran_ObservacionesAnula_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "", "300", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_NombCuentadanteOrigen_Internalname, "Cuentadante Origen", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_NombCuentadanteOrigen_Internalname, A384Tran_NombCuentadanteOrigen, GXutil.rtrim( localUtil.format( A384Tran_NombCuentadanteOrigen, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_NombCuentadanteOrigen_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_NombCuentadanteOrigen_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_NombreProveedor_Internalname, "Proveedor", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_NombreProveedor_Internalname, A575Tran_NombreProveedor, GXutil.rtrim( localUtil.format( A575Tran_NombreProveedor, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_NombreProveedor_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_NombreProveedor_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_NombCuentadanteDestino_Internalname, "Cuentadante Destino", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_NombCuentadanteDestino_Internalname, A389Tran_NombCuentadanteDestino, GXutil.rtrim( localUtil.format( A389Tran_NombCuentadanteDestino, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_NombCuentadanteDestino_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_NombCuentadanteDestino_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_NombreIngreso_Internalname, "Ingreso", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_NombreIngreso_Internalname, A672Tran_NombreIngreso, GXutil.rtrim( localUtil.format( A672Tran_NombreIngreso, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_NombreIngreso_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_NombreIngreso_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CedulaCuentadanteOrigen_Internalname, "Cuentadante Origen", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CedulaCuentadanteOrigen_Internalname, GXutil.ltrim( localUtil.ntoc( A702Tran_CedulaCuentadanteOrigen, (byte)(18), (byte)(0), ",", "")), ((edtTran_CedulaCuentadanteOrigen_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A702Tran_CedulaCuentadanteOrigen), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A702Tran_CedulaCuentadanteOrigen), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CedulaCuentadanteOrigen_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_CedulaCuentadanteOrigen_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CedulaProveedor_Internalname, "Proveedor", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CedulaProveedor_Internalname, GXutil.ltrim( localUtil.ntoc( A703Tran_CedulaProveedor, (byte)(18), (byte)(0), ",", "")), ((edtTran_CedulaProveedor_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A703Tran_CedulaProveedor), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A703Tran_CedulaProveedor), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CedulaProveedor_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_CedulaProveedor_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CedulaCuentadanteDestino_Internalname, "Cuentadante Destino", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CedulaCuentadanteDestino_Internalname, GXutil.ltrim( localUtil.ntoc( A704Tran_CedulaCuentadanteDestino, (byte)(18), (byte)(0), ",", "")), ((edtTran_CedulaCuentadanteDestino_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A704Tran_CedulaCuentadanteDestino), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A704Tran_CedulaCuentadanteDestino), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CedulaCuentadanteDestino_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_CedulaCuentadanteDestino_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTran_SolicitaCCDestino.getInternalname(), "CCDestino", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTran_SolicitaCCDestino, cmbTran_SolicitaCCDestino.getInternalname(), GXutil.rtrim( A707Tran_SolicitaCCDestino), 1, cmbTran_SolicitaCCDestino.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTran_SolicitaCCDestino.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_TRANSACCIONGeneral.htm");
         cmbTran_SolicitaCCDestino.setValue( GXutil.rtrim( A707Tran_SolicitaCCDestino) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTran_SolicitaCCDestino.getInternalname(), "Values", cmbTran_SolicitaCCDestino.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTran_SolicitaRegionDestino.getInternalname(), "Region Destino", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTran_SolicitaRegionDestino, cmbTran_SolicitaRegionDestino.getInternalname(), GXutil.rtrim( A708Tran_SolicitaRegionDestino), 1, cmbTran_SolicitaRegionDestino.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTran_SolicitaRegionDestino.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_TRANSACCIONGeneral.htm");
         cmbTran_SolicitaRegionDestino.setValue( GXutil.rtrim( A708Tran_SolicitaRegionDestino) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTran_SolicitaRegionDestino.getInternalname(), "Values", cmbTran_SolicitaRegionDestino.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_EmailCuentadanteOrigen_Internalname, "Cuentadante Origen", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_EmailCuentadanteOrigen_Internalname, A714Tran_EmailCuentadanteOrigen, GXutil.rtrim( localUtil.format( A714Tran_EmailCuentadanteOrigen, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "mailto:"+A714Tran_EmailCuentadanteOrigen, "", "", "", edtTran_EmailCuentadanteOrigen_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_EmailCuentadanteOrigen_Enabled, 0, "email", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "GeneXus\\Email", "left", true, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_EmailCuentadanteDestino_Internalname, "Cuentadante Destino", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_EmailCuentadanteDestino_Internalname, A715Tran_EmailCuentadanteDestino, GXutil.rtrim( localUtil.format( A715Tran_EmailCuentadanteDestino, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "mailto:"+A715Tran_EmailCuentadanteDestino, "", "", "", edtTran_EmailCuentadanteDestino_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_EmailCuentadanteDestino_Enabled, 0, "email", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "GeneXus\\Email", "left", true, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_IdCuentadanteResponsabili_Internalname, "Cuenta Responsabilidad", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_IdCuentadanteResponsabili_Internalname, GXutil.ltrim( localUtil.ntoc( A56Tran_IdCuentadanteResponsabili, (byte)(18), (byte)(0), ",", "")), ((edtTran_IdCuentadanteResponsabili_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A56Tran_IdCuentadanteResponsabili), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A56Tran_IdCuentadanteResponsabili), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_IdCuentadanteResponsabili_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_IdCuentadanteResponsabili_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_NombreCuentadanteResponsa_Internalname, "Cuentadante Responsabilidad", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_NombreCuentadanteResponsa_Internalname, A721Tran_NombreCuentadanteResponsa, GXutil.rtrim( localUtil.format( A721Tran_NombreCuentadanteResponsa, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_NombreCuentadanteResponsa_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_NombreCuentadanteResponsa_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_TransaccResponsabilidad_Internalname, "Cuenta Responsabilidad", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_TransaccResponsabilidad_Internalname, GXutil.ltrim( localUtil.ntoc( A719Tran_TransaccResponsabilidad, (byte)(11), (byte)(0), ",", "")), ((edtTran_TransaccResponsabilidad_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A719Tran_TransaccResponsabilidad), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A719Tran_TransaccResponsabilidad), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_TransaccResponsabilidad_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_TransaccResponsabilidad_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_FechaResponsabilidad_Internalname, "Cuenta Responsabilidad", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtTran_FechaResponsabilidad_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_FechaResponsabilidad_Internalname, localUtil.format(A720Tran_FechaResponsabilidad, "99/99/99"), localUtil.format( A720Tran_FechaResponsabilidad, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_FechaResponsabilidad_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_FechaResponsabilidad_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Fecha", "right", false, "HLP_ALM_TRANSACCIONGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtTran_FechaResponsabilidad_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTran_FechaResponsabilidad_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_TRANSACCIONGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTran_CuentaResponsabilidad.getInternalname(), "Responsabilidad", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTran_CuentaResponsabilidad, cmbTran_CuentaResponsabilidad.getInternalname(), GXutil.rtrim( A754Tran_CuentaResponsabilidad), 1, cmbTran_CuentaResponsabilidad.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTran_CuentaResponsabilidad.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_TRANSACCIONGeneral.htm");
         cmbTran_CuentaResponsabilidad.setValue( GXutil.rtrim( A754Tran_CuentaResponsabilidad) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTran_CuentaResponsabilidad.getInternalname(), "Values", cmbTran_CuentaResponsabilidad.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_Abreviado_Internalname, "Tran_Abreviado", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_Abreviado_Internalname, A756Tran_Abreviado, GXutil.rtrim( localUtil.format( A756Tran_Abreviado, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_Abreviado_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_Abreviado_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_TablaResponsabilidad_Internalname, "Responsabilidad", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_TablaResponsabilidad_Internalname, GXutil.ltrim( localUtil.ntoc( A758Tran_TablaResponsabilidad, (byte)(4), (byte)(0), ",", "")), ((edtTran_TablaResponsabilidad_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A758Tran_TablaResponsabilidad), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A758Tran_TablaResponsabilidad), "ZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_TablaResponsabilidad_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_TablaResponsabilidad_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CedulaResponsabilidad_Internalname, "Responsabilidad", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CedulaResponsabilidad_Internalname, GXutil.ltrim( localUtil.ntoc( A759Tran_CedulaResponsabilidad, (byte)(18), (byte)(0), ",", "")), ((edtTran_CedulaResponsabilidad_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A759Tran_CedulaResponsabilidad), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A759Tran_CedulaResponsabilidad), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CedulaResponsabilidad_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTran_CedulaResponsabilidad_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TRANSACCIONGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTran_EntidadGobierno.getInternalname(), "Gobierno", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTran_EntidadGobierno, cmbTran_EntidadGobierno.getInternalname(), GXutil.rtrim( A859Tran_EntidadGobierno), 1, cmbTran_EntidadGobierno.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTran_EntidadGobierno.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_TRANSACCIONGeneral.htm");
         cmbTran_EntidadGobierno.setValue( GXutil.rtrim( A859Tran_EntidadGobierno) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTran_EntidadGobierno.getInternalname(), "Values", cmbTran_EntidadGobierno.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_Id_Internalname, "Identificador", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ",", "")), ((edtTran_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A46Tran_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A46Tran_Id), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_Id_Jsonclick, 0, "Attribute", "", "", "", edtTran_Id_Visible, edtTran_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_TRANSACCIONGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start0X2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "ALM_TRANSACCIONGeneral", (short)(0)) ;
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
            strup0X0( ) ;
         }
      }
   }

   public void ws0X2( )
   {
      start0X2( ) ;
      evt0X2( ) ;
   }

   public void evt0X2( )
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
                              strup0X0( ) ;
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
                              strup0X0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e130X2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup0X0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e140X2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup0X0( ) ;
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
                              strup0X0( ) ;
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

   public void we0X2( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm0X2( ) ;
         }
      }
   }

   public void pa0X2( )
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
         cmbTran_Estado.setName( "TRAN_ESTADO" );
         cmbTran_Estado.setWebtags( "" );
         cmbTran_Estado.addItem("A", "Anulado", (short)(0));
         cmbTran_Estado.addItem("R", "Ratificado", (short)(0));
         cmbTran_Estado.addItem("P", "Pendiente", (short)(0));
         cmbTran_Estado.addItem("I", "Incompleto", (short)(0));
         if ( cmbTran_Estado.getItemCount() > 0 )
         {
            A58Tran_Estado = cmbTran_Estado.getValidValue(A58Tran_Estado) ;
            n58Tran_Estado = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A58Tran_Estado", A58Tran_Estado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A58Tran_Estado, ""))));
         }
         cmbTran_IndAreadante.setName( "TRAN_INDAREADANTE" );
         cmbTran_IndAreadante.setWebtags( "" );
         cmbTran_IndAreadante.addItem("", "", (short)(0));
         cmbTran_IndAreadante.addItem("SI", "SI", (short)(0));
         cmbTran_IndAreadante.addItem("NO", "NO", (short)(0));
         if ( cmbTran_IndAreadante.getItemCount() > 0 )
         {
            A478Tran_IndAreadante = cmbTran_IndAreadante.getValidValue(A478Tran_IndAreadante) ;
            n478Tran_IndAreadante = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A478Tran_IndAreadante", A478Tran_IndAreadante);
         }
         cmbTran_IndCurso.setName( "TRAN_INDCURSO" );
         cmbTran_IndCurso.setWebtags( "" );
         cmbTran_IndCurso.addItem("", "", (short)(0));
         cmbTran_IndCurso.addItem("SI", "SI", (short)(0));
         cmbTran_IndCurso.addItem("NO", "NO", (short)(0));
         if ( cmbTran_IndCurso.getItemCount() > 0 )
         {
            A479Tran_IndCurso = cmbTran_IndCurso.getValidValue(A479Tran_IndCurso) ;
            n479Tran_IndCurso = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A479Tran_IndCurso", A479Tran_IndCurso);
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
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_INDE_S", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A481Tran_IndE_S, ""))));
         }
         cmbTran_TipoElemento.setName( "TRAN_TIPOELEMENTO" );
         cmbTran_TipoElemento.setWebtags( "" );
         cmbTran_TipoElemento.addItem("C", "Consumo", (short)(0));
         cmbTran_TipoElemento.addItem("D", "Devolutivo", (short)(0));
         if ( cmbTran_TipoElemento.getItemCount() > 0 )
         {
            A482Tran_TipoElemento = cmbTran_TipoElemento.getValidValue(A482Tran_TipoElemento) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A482Tran_TipoElemento", A482Tran_TipoElemento);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_TIPOELEMENTO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A482Tran_TipoElemento, ""))));
         }
         cmbTran_TipoIngreso.setName( "TRAN_TIPOINGRESO" );
         cmbTran_TipoIngreso.setWebtags( "" );
         if ( cmbTran_TipoIngreso.getItemCount() > 0 )
         {
            A54Tran_TipoIngreso = GXutil.lval( cmbTran_TipoIngreso.getValidValue(GXutil.trim( GXutil.str( A54Tran_TipoIngreso, 11, 0)))) ;
            n54Tran_TipoIngreso = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A54Tran_TipoIngreso", GXutil.ltrim( GXutil.str( A54Tran_TipoIngreso, 11, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_TIPOINGRESO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A54Tran_TipoIngreso), "ZZZZZZZZZZ9")));
         }
         cmbTran_TipoEntra.setName( "TRAN_TIPOENTRA" );
         cmbTran_TipoEntra.setWebtags( "" );
         if ( cmbTran_TipoEntra.getItemCount() > 0 )
         {
            A527Tran_TipoEntra = cmbTran_TipoEntra.getValidValue(A527Tran_TipoEntra) ;
            n527Tran_TipoEntra = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A527Tran_TipoEntra", A527Tran_TipoEntra);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_TIPOENTRA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A527Tran_TipoEntra, ""))));
         }
         cmbTran_SolicitaCCDestino.setName( "TRAN_SOLICITACCDESTINO" );
         cmbTran_SolicitaCCDestino.setWebtags( "" );
         cmbTran_SolicitaCCDestino.addItem("", "", (short)(0));
         cmbTran_SolicitaCCDestino.addItem("SI", "SI", (short)(0));
         cmbTran_SolicitaCCDestino.addItem("NO", "NO", (short)(0));
         if ( cmbTran_SolicitaCCDestino.getItemCount() > 0 )
         {
            A707Tran_SolicitaCCDestino = cmbTran_SolicitaCCDestino.getValidValue(A707Tran_SolicitaCCDestino) ;
            n707Tran_SolicitaCCDestino = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A707Tran_SolicitaCCDestino", A707Tran_SolicitaCCDestino);
         }
         cmbTran_SolicitaRegionDestino.setName( "TRAN_SOLICITAREGIONDESTINO" );
         cmbTran_SolicitaRegionDestino.setWebtags( "" );
         cmbTran_SolicitaRegionDestino.addItem("", "", (short)(0));
         cmbTran_SolicitaRegionDestino.addItem("SI", "SI", (short)(0));
         cmbTran_SolicitaRegionDestino.addItem("NO", "NO", (short)(0));
         if ( cmbTran_SolicitaRegionDestino.getItemCount() > 0 )
         {
            A708Tran_SolicitaRegionDestino = cmbTran_SolicitaRegionDestino.getValidValue(A708Tran_SolicitaRegionDestino) ;
            n708Tran_SolicitaRegionDestino = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A708Tran_SolicitaRegionDestino", A708Tran_SolicitaRegionDestino);
         }
         cmbTran_CuentaResponsabilidad.setName( "TRAN_CUENTARESPONSABILIDAD" );
         cmbTran_CuentaResponsabilidad.setWebtags( "" );
         cmbTran_CuentaResponsabilidad.addItem("", "", (short)(0));
         cmbTran_CuentaResponsabilidad.addItem("SI", "SI", (short)(0));
         cmbTran_CuentaResponsabilidad.addItem("NO", "NO", (short)(0));
         if ( cmbTran_CuentaResponsabilidad.getItemCount() > 0 )
         {
            A754Tran_CuentaResponsabilidad = cmbTran_CuentaResponsabilidad.getValidValue(A754Tran_CuentaResponsabilidad) ;
            n754Tran_CuentaResponsabilidad = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A754Tran_CuentaResponsabilidad", A754Tran_CuentaResponsabilidad);
         }
         cmbTran_EntidadGobierno.setName( "TRAN_ENTIDADGOBIERNO" );
         cmbTran_EntidadGobierno.setWebtags( "" );
         cmbTran_EntidadGobierno.addItem("", "", (short)(0));
         cmbTran_EntidadGobierno.addItem("SI", "SI", (short)(0));
         cmbTran_EntidadGobierno.addItem("NO", "NO", (short)(0));
         if ( cmbTran_EntidadGobierno.getItemCount() > 0 )
         {
            A859Tran_EntidadGobierno = cmbTran_EntidadGobierno.getValidValue(A859Tran_EntidadGobierno) ;
            n859Tran_EntidadGobierno = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A859Tran_EntidadGobierno", A859Tran_EntidadGobierno);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_ENTIDADGOBIERNO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A859Tran_EntidadGobierno, ""))));
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
      if ( cmbTran_Estado.getItemCount() > 0 )
      {
         A58Tran_Estado = cmbTran_Estado.getValidValue(A58Tran_Estado) ;
         n58Tran_Estado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A58Tran_Estado", A58Tran_Estado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A58Tran_Estado, ""))));
      }
      if ( cmbTran_IndAreadante.getItemCount() > 0 )
      {
         A478Tran_IndAreadante = cmbTran_IndAreadante.getValidValue(A478Tran_IndAreadante) ;
         n478Tran_IndAreadante = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A478Tran_IndAreadante", A478Tran_IndAreadante);
      }
      if ( cmbTran_IndCurso.getItemCount() > 0 )
      {
         A479Tran_IndCurso = cmbTran_IndCurso.getValidValue(A479Tran_IndCurso) ;
         n479Tran_IndCurso = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A479Tran_IndCurso", A479Tran_IndCurso);
      }
      if ( cmbTran_IndE_S.getItemCount() > 0 )
      {
         A481Tran_IndE_S = cmbTran_IndE_S.getValidValue(A481Tran_IndE_S) ;
         n481Tran_IndE_S = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A481Tran_IndE_S", A481Tran_IndE_S);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_INDE_S", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A481Tran_IndE_S, ""))));
      }
      if ( cmbTran_TipoElemento.getItemCount() > 0 )
      {
         A482Tran_TipoElemento = cmbTran_TipoElemento.getValidValue(A482Tran_TipoElemento) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A482Tran_TipoElemento", A482Tran_TipoElemento);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_TIPOELEMENTO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A482Tran_TipoElemento, ""))));
      }
      if ( cmbTran_TipoIngreso.getItemCount() > 0 )
      {
         A54Tran_TipoIngreso = GXutil.lval( cmbTran_TipoIngreso.getValidValue(GXutil.trim( GXutil.str( A54Tran_TipoIngreso, 11, 0)))) ;
         n54Tran_TipoIngreso = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A54Tran_TipoIngreso", GXutil.ltrim( GXutil.str( A54Tran_TipoIngreso, 11, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_TIPOINGRESO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A54Tran_TipoIngreso), "ZZZZZZZZZZ9")));
      }
      if ( cmbTran_TipoEntra.getItemCount() > 0 )
      {
         A527Tran_TipoEntra = cmbTran_TipoEntra.getValidValue(A527Tran_TipoEntra) ;
         n527Tran_TipoEntra = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A527Tran_TipoEntra", A527Tran_TipoEntra);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_TIPOENTRA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A527Tran_TipoEntra, ""))));
      }
      if ( cmbTran_SolicitaCCDestino.getItemCount() > 0 )
      {
         A707Tran_SolicitaCCDestino = cmbTran_SolicitaCCDestino.getValidValue(A707Tran_SolicitaCCDestino) ;
         n707Tran_SolicitaCCDestino = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A707Tran_SolicitaCCDestino", A707Tran_SolicitaCCDestino);
      }
      if ( cmbTran_SolicitaRegionDestino.getItemCount() > 0 )
      {
         A708Tran_SolicitaRegionDestino = cmbTran_SolicitaRegionDestino.getValidValue(A708Tran_SolicitaRegionDestino) ;
         n708Tran_SolicitaRegionDestino = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A708Tran_SolicitaRegionDestino", A708Tran_SolicitaRegionDestino);
      }
      if ( cmbTran_CuentaResponsabilidad.getItemCount() > 0 )
      {
         A754Tran_CuentaResponsabilidad = cmbTran_CuentaResponsabilidad.getValidValue(A754Tran_CuentaResponsabilidad) ;
         n754Tran_CuentaResponsabilidad = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A754Tran_CuentaResponsabilidad", A754Tran_CuentaResponsabilidad);
      }
      if ( cmbTran_EntidadGobierno.getItemCount() > 0 )
      {
         A859Tran_EntidadGobierno = cmbTran_EntidadGobierno.getValidValue(A859Tran_EntidadGobierno) ;
         n859Tran_EntidadGobierno = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A859Tran_EntidadGobierno", A859Tran_EntidadGobierno);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_ENTIDADGOBIERNO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A859Tran_EntidadGobierno, ""))));
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf0X2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV14Pgmname = "ALM_TRANSACCIONGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rf0X2( )
   {
      initialize_formulas( ) ;
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H000X2 */
         pr_default.execute(0, new Object[] {new Long(A46Tran_Id)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A416Tran_Observaciones = H000X2_A416Tran_Observaciones[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A416Tran_Observaciones", A416Tran_Observaciones);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_OBSERVACIONES", getSecureSignedToken( sPrefix, A416Tran_Observaciones));
            n416Tran_Observaciones = H000X2_n416Tran_Observaciones[0] ;
            A859Tran_EntidadGobierno = H000X2_A859Tran_EntidadGobierno[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A859Tran_EntidadGobierno", A859Tran_EntidadGobierno);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_ENTIDADGOBIERNO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A859Tran_EntidadGobierno, ""))));
            n859Tran_EntidadGobierno = H000X2_n859Tran_EntidadGobierno[0] ;
            A759Tran_CedulaResponsabilidad = H000X2_A759Tran_CedulaResponsabilidad[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A759Tran_CedulaResponsabilidad", GXutil.ltrim( GXutil.str( A759Tran_CedulaResponsabilidad, 18, 0)));
            n759Tran_CedulaResponsabilidad = H000X2_n759Tran_CedulaResponsabilidad[0] ;
            A758Tran_TablaResponsabilidad = H000X2_A758Tran_TablaResponsabilidad[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A758Tran_TablaResponsabilidad", GXutil.ltrim( GXutil.str( A758Tran_TablaResponsabilidad, 4, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_TABLARESPONSABILIDAD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A758Tran_TablaResponsabilidad), "ZZZ9")));
            n758Tran_TablaResponsabilidad = H000X2_n758Tran_TablaResponsabilidad[0] ;
            A756Tran_Abreviado = H000X2_A756Tran_Abreviado[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A756Tran_Abreviado", A756Tran_Abreviado);
            n756Tran_Abreviado = H000X2_n756Tran_Abreviado[0] ;
            A754Tran_CuentaResponsabilidad = H000X2_A754Tran_CuentaResponsabilidad[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A754Tran_CuentaResponsabilidad", A754Tran_CuentaResponsabilidad);
            n754Tran_CuentaResponsabilidad = H000X2_n754Tran_CuentaResponsabilidad[0] ;
            A720Tran_FechaResponsabilidad = H000X2_A720Tran_FechaResponsabilidad[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A720Tran_FechaResponsabilidad", localUtil.format(A720Tran_FechaResponsabilidad, "99/99/99"));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_FECHARESPONSABILIDAD", getSecureSignedToken( sPrefix, A720Tran_FechaResponsabilidad));
            n720Tran_FechaResponsabilidad = H000X2_n720Tran_FechaResponsabilidad[0] ;
            A719Tran_TransaccResponsabilidad = H000X2_A719Tran_TransaccResponsabilidad[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A719Tran_TransaccResponsabilidad", GXutil.ltrim( GXutil.str( A719Tran_TransaccResponsabilidad, 11, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_TRANSACCRESPONSABILIDAD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A719Tran_TransaccResponsabilidad), "ZZZZZZZZZZ9")));
            n719Tran_TransaccResponsabilidad = H000X2_n719Tran_TransaccResponsabilidad[0] ;
            A721Tran_NombreCuentadanteResponsa = H000X2_A721Tran_NombreCuentadanteResponsa[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A721Tran_NombreCuentadanteResponsa", A721Tran_NombreCuentadanteResponsa);
            n721Tran_NombreCuentadanteResponsa = H000X2_n721Tran_NombreCuentadanteResponsa[0] ;
            A56Tran_IdCuentadanteResponsabili = H000X2_A56Tran_IdCuentadanteResponsabili[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A56Tran_IdCuentadanteResponsabili", GXutil.ltrim( GXutil.str( A56Tran_IdCuentadanteResponsabili, 18, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_IDCUENTADANTERESPONSABILI", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A56Tran_IdCuentadanteResponsabili), "ZZZZZZZZZZZZZZZZZ9")));
            n56Tran_IdCuentadanteResponsabili = H000X2_n56Tran_IdCuentadanteResponsabili[0] ;
            A715Tran_EmailCuentadanteDestino = H000X2_A715Tran_EmailCuentadanteDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A715Tran_EmailCuentadanteDestino", A715Tran_EmailCuentadanteDestino);
            n715Tran_EmailCuentadanteDestino = H000X2_n715Tran_EmailCuentadanteDestino[0] ;
            A714Tran_EmailCuentadanteOrigen = H000X2_A714Tran_EmailCuentadanteOrigen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A714Tran_EmailCuentadanteOrigen", A714Tran_EmailCuentadanteOrigen);
            n714Tran_EmailCuentadanteOrigen = H000X2_n714Tran_EmailCuentadanteOrigen[0] ;
            A708Tran_SolicitaRegionDestino = H000X2_A708Tran_SolicitaRegionDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A708Tran_SolicitaRegionDestino", A708Tran_SolicitaRegionDestino);
            n708Tran_SolicitaRegionDestino = H000X2_n708Tran_SolicitaRegionDestino[0] ;
            A707Tran_SolicitaCCDestino = H000X2_A707Tran_SolicitaCCDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A707Tran_SolicitaCCDestino", A707Tran_SolicitaCCDestino);
            n707Tran_SolicitaCCDestino = H000X2_n707Tran_SolicitaCCDestino[0] ;
            A704Tran_CedulaCuentadanteDestino = H000X2_A704Tran_CedulaCuentadanteDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A704Tran_CedulaCuentadanteDestino", GXutil.ltrim( GXutil.str( A704Tran_CedulaCuentadanteDestino, 18, 0)));
            n704Tran_CedulaCuentadanteDestino = H000X2_n704Tran_CedulaCuentadanteDestino[0] ;
            A703Tran_CedulaProveedor = H000X2_A703Tran_CedulaProveedor[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A703Tran_CedulaProveedor", GXutil.ltrim( GXutil.str( A703Tran_CedulaProveedor, 18, 0)));
            n703Tran_CedulaProveedor = H000X2_n703Tran_CedulaProveedor[0] ;
            A702Tran_CedulaCuentadanteOrigen = H000X2_A702Tran_CedulaCuentadanteOrigen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A702Tran_CedulaCuentadanteOrigen", GXutil.ltrim( GXutil.str( A702Tran_CedulaCuentadanteOrigen, 18, 0)));
            n702Tran_CedulaCuentadanteOrigen = H000X2_n702Tran_CedulaCuentadanteOrigen[0] ;
            A672Tran_NombreIngreso = H000X2_A672Tran_NombreIngreso[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A672Tran_NombreIngreso", A672Tran_NombreIngreso);
            n672Tran_NombreIngreso = H000X2_n672Tran_NombreIngreso[0] ;
            A389Tran_NombCuentadanteDestino = H000X2_A389Tran_NombCuentadanteDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A389Tran_NombCuentadanteDestino", A389Tran_NombCuentadanteDestino);
            n389Tran_NombCuentadanteDestino = H000X2_n389Tran_NombCuentadanteDestino[0] ;
            A575Tran_NombreProveedor = H000X2_A575Tran_NombreProveedor[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A575Tran_NombreProveedor", A575Tran_NombreProveedor);
            n575Tran_NombreProveedor = H000X2_n575Tran_NombreProveedor[0] ;
            A384Tran_NombCuentadanteOrigen = H000X2_A384Tran_NombCuentadanteOrigen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A384Tran_NombCuentadanteOrigen", A384Tran_NombCuentadanteOrigen);
            n384Tran_NombCuentadanteOrigen = H000X2_n384Tran_NombCuentadanteOrigen[0] ;
            A670Tran_ObservacionesAnula = H000X2_A670Tran_ObservacionesAnula[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A670Tran_ObservacionesAnula", A670Tran_ObservacionesAnula);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_OBSERVACIONESANULA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A670Tran_ObservacionesAnula, ""))));
            n670Tran_ObservacionesAnula = H000X2_n670Tran_ObservacionesAnula[0] ;
            A669Tran_FechaEliminaoAnula = H000X2_A669Tran_FechaEliminaoAnula[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A669Tran_FechaEliminaoAnula", localUtil.ttoc( A669Tran_FechaEliminaoAnula, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_FECHAELIMINAOANULA", getSecureSignedToken( sPrefix, localUtil.format( A669Tran_FechaEliminaoAnula, "99/99/99 99:99")));
            n669Tran_FechaEliminaoAnula = H000X2_n669Tran_FechaEliminaoAnula[0] ;
            A668Tran_UsuarioEliminaoAnula = H000X2_A668Tran_UsuarioEliminaoAnula[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A668Tran_UsuarioEliminaoAnula", A668Tran_UsuarioEliminaoAnula);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_USUARIOELIMINAOANULA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A668Tran_UsuarioEliminaoAnula, "@!"))));
            n668Tran_UsuarioEliminaoAnula = H000X2_n668Tran_UsuarioEliminaoAnula[0] ;
            A667Tran_NumeroGrupo = H000X2_A667Tran_NumeroGrupo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A667Tran_NumeroGrupo", GXutil.ltrim( GXutil.str( A667Tran_NumeroGrupo, 4, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_NUMEROGRUPO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A667Tran_NumeroGrupo), "ZZZ9")));
            n667Tran_NumeroGrupo = H000X2_n667Tran_NumeroGrupo[0] ;
            A524Tran_Detalle = H000X2_A524Tran_Detalle[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A524Tran_Detalle", A524Tran_Detalle);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_DETALLE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A524Tran_Detalle, ""))));
            n524Tran_Detalle = H000X2_n524Tran_Detalle[0] ;
            A608Tran_RegionAbrevDestino = H000X2_A608Tran_RegionAbrevDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A608Tran_RegionAbrevDestino", A608Tran_RegionAbrevDestino);
            n608Tran_RegionAbrevDestino = H000X2_n608Tran_RegionAbrevDestino[0] ;
            A594Tran_RegionAbrev = H000X2_A594Tran_RegionAbrev[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A594Tran_RegionAbrev", A594Tran_RegionAbrev);
            n594Tran_RegionAbrev = H000X2_n594Tran_RegionAbrev[0] ;
            A53Tran_IdProveedor = H000X2_A53Tran_IdProveedor[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A53Tran_IdProveedor", GXutil.ltrim( GXutil.str( A53Tran_IdProveedor, 18, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_IDPROVEEDOR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A53Tran_IdProveedor), "ZZZZZZZZZZZZZZZZZ9")));
            n53Tran_IdProveedor = H000X2_n53Tran_IdProveedor[0] ;
            A568Tran_CantidadPadres = H000X2_A568Tran_CantidadPadres[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A568Tran_CantidadPadres", GXutil.ltrim( GXutil.str( A568Tran_CantidadPadres, 8, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_CANTIDADPADRES", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A568Tran_CantidadPadres), "ZZZZZZZ9")));
            n568Tran_CantidadPadres = H000X2_n568Tran_CantidadPadres[0] ;
            A527Tran_TipoEntra = H000X2_A527Tran_TipoEntra[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A527Tran_TipoEntra", A527Tran_TipoEntra);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_TIPOENTRA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A527Tran_TipoEntra, ""))));
            n527Tran_TipoEntra = H000X2_n527Tran_TipoEntra[0] ;
            A520Tran_RegionDescripcionDestino = H000X2_A520Tran_RegionDescripcionDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A520Tran_RegionDescripcionDestino", A520Tran_RegionDescripcionDestino);
            n520Tran_RegionDescripcionDestino = H000X2_n520Tran_RegionDescripcionDestino[0] ;
            A519Tran_RegionCodigoDestino = H000X2_A519Tran_RegionCodigoDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A519Tran_RegionCodigoDestino", GXutil.ltrim( GXutil.str( A519Tran_RegionCodigoDestino, 4, 0)));
            n519Tran_RegionCodigoDestino = H000X2_n519Tran_RegionCodigoDestino[0] ;
            A518Tran_RegionIdDestino = H000X2_A518Tran_RegionIdDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A518Tran_RegionIdDestino", GXutil.ltrim( GXutil.str( A518Tran_RegionIdDestino, 11, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_REGIONIDDESTINO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A518Tran_RegionIdDestino), "ZZZZZZZZZZ9")));
            n518Tran_RegionIdDestino = H000X2_n518Tran_RegionIdDestino[0] ;
            A517Tran_CentroCostoDescripcionDes = H000X2_A517Tran_CentroCostoDescripcionDes[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A517Tran_CentroCostoDescripcionDes", A517Tran_CentroCostoDescripcionDes);
            n517Tran_CentroCostoDescripcionDes = H000X2_n517Tran_CentroCostoDescripcionDes[0] ;
            A516Tran_CentroCostoCodigoDestino = H000X2_A516Tran_CentroCostoCodigoDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A516Tran_CentroCostoCodigoDestino", A516Tran_CentroCostoCodigoDestino);
            n516Tran_CentroCostoCodigoDestino = H000X2_n516Tran_CentroCostoCodigoDestino[0] ;
            A50Tran_CentroCostoIdDestino = H000X2_A50Tran_CentroCostoIdDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A50Tran_CentroCostoIdDestino", GXutil.ltrim( GXutil.str( A50Tran_CentroCostoIdDestino, 11, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_CENTROCOSTOIDDESTINO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A50Tran_CentroCostoIdDestino), "ZZZZZZZZZZ9")));
            n50Tran_CentroCostoIdDestino = H000X2_n50Tran_CentroCostoIdDestino[0] ;
            A515Tran_FechaIngreso = H000X2_A515Tran_FechaIngreso[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A515Tran_FechaIngreso", localUtil.format(A515Tran_FechaIngreso, "99/99/99"));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_FECHAINGRESO", getSecureSignedToken( sPrefix, A515Tran_FechaIngreso));
            n515Tran_FechaIngreso = H000X2_n515Tran_FechaIngreso[0] ;
            A514Tran_NumeroIngreso = H000X2_A514Tran_NumeroIngreso[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A514Tran_NumeroIngreso", A514Tran_NumeroIngreso);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_NUMEROINGRESO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A514Tran_NumeroIngreso, ""))));
            n514Tran_NumeroIngreso = H000X2_n514Tran_NumeroIngreso[0] ;
            A54Tran_TipoIngreso = H000X2_A54Tran_TipoIngreso[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A54Tran_TipoIngreso", GXutil.ltrim( GXutil.str( A54Tran_TipoIngreso, 11, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_TIPOINGRESO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A54Tran_TipoIngreso), "ZZZZZZZZZZ9")));
            n54Tran_TipoIngreso = H000X2_n54Tran_TipoIngreso[0] ;
            A482Tran_TipoElemento = H000X2_A482Tran_TipoElemento[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A482Tran_TipoElemento", A482Tran_TipoElemento);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_TIPOELEMENTO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A482Tran_TipoElemento, ""))));
            A499Tran_CodTipoElemento = H000X2_A499Tran_CodTipoElemento[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A499Tran_CodTipoElemento", GXutil.ltrim( GXutil.str( A499Tran_CodTipoElemento, 18, 0)));
            n499Tran_CodTipoElemento = H000X2_n499Tran_CodTipoElemento[0] ;
            A498Tran_NumeroLineas = H000X2_A498Tran_NumeroLineas[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A498Tran_NumeroLineas", GXutil.ltrim( GXutil.str( A498Tran_NumeroLineas, 18, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_NUMEROLINEAS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A498Tran_NumeroLineas), "ZZZZZZZZZZZZZZZZZ9")));
            n498Tran_NumeroLineas = H000X2_n498Tran_NumeroLineas[0] ;
            A483Tran_ValorTransaccion = H000X2_A483Tran_ValorTransaccion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A483Tran_ValorTransaccion", GXutil.ltrim( GXutil.str( A483Tran_ValorTransaccion, 18, 2)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_VALORTRANSACCION", getSecureSignedToken( sPrefix, localUtil.format( A483Tran_ValorTransaccion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
            n483Tran_ValorTransaccion = H000X2_n483Tran_ValorTransaccion[0] ;
            A481Tran_IndE_S = H000X2_A481Tran_IndE_S[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A481Tran_IndE_S", A481Tran_IndE_S);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_INDE_S", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A481Tran_IndE_S, ""))));
            n481Tran_IndE_S = H000X2_n481Tran_IndE_S[0] ;
            A479Tran_IndCurso = H000X2_A479Tran_IndCurso[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A479Tran_IndCurso", A479Tran_IndCurso);
            n479Tran_IndCurso = H000X2_n479Tran_IndCurso[0] ;
            A478Tran_IndAreadante = H000X2_A478Tran_IndAreadante[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A478Tran_IndAreadante", A478Tran_IndAreadante);
            n478Tran_IndAreadante = H000X2_n478Tran_IndAreadante[0] ;
            A408Tran_CursoCodigo = H000X2_A408Tran_CursoCodigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A408Tran_CursoCodigo", A408Tran_CursoCodigo);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_CURSOCODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A408Tran_CursoCodigo, ""))));
            n408Tran_CursoCodigo = H000X2_n408Tran_CursoCodigo[0] ;
            A407Tran_AreadanteCodigo = H000X2_A407Tran_AreadanteCodigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A407Tran_AreadanteCodigo", A407Tran_AreadanteCodigo);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_AREADANTECODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A407Tran_AreadanteCodigo, ""))));
            n407Tran_AreadanteCodigo = H000X2_n407Tran_AreadanteCodigo[0] ;
            A422Tran_RegionDescripcion = H000X2_A422Tran_RegionDescripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A422Tran_RegionDescripcion", A422Tran_RegionDescripcion);
            n422Tran_RegionDescripcion = H000X2_n422Tran_RegionDescripcion[0] ;
            A421Tran_RegionCodigo = H000X2_A421Tran_RegionCodigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A421Tran_RegionCodigo", GXutil.ltrim( GXutil.str( A421Tran_RegionCodigo, 4, 0)));
            n421Tran_RegionCodigo = H000X2_n421Tran_RegionCodigo[0] ;
            A57Tran_RegionId = H000X2_A57Tran_RegionId[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A57Tran_RegionId", GXutil.ltrim( GXutil.str( A57Tran_RegionId, 11, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_REGIONID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A57Tran_RegionId), "ZZZZZZZZZZ9")));
            n57Tran_RegionId = H000X2_n57Tran_RegionId[0] ;
            A420Tran_CentroCostoDescripcion = H000X2_A420Tran_CentroCostoDescripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A420Tran_CentroCostoDescripcion", A420Tran_CentroCostoDescripcion);
            n420Tran_CentroCostoDescripcion = H000X2_n420Tran_CentroCostoDescripcion[0] ;
            A419Tran_CentroCostoCodigo = H000X2_A419Tran_CentroCostoCodigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A419Tran_CentroCostoCodigo", A419Tran_CentroCostoCodigo);
            n419Tran_CentroCostoCodigo = H000X2_n419Tran_CentroCostoCodigo[0] ;
            A48Tran_CentroCostoId = H000X2_A48Tran_CentroCostoId[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A48Tran_CentroCostoId", GXutil.ltrim( GXutil.str( A48Tran_CentroCostoId, 11, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_CENTROCOSTOID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A48Tran_CentroCostoId), "ZZZZZZZZZZ9")));
            A418Tran_UsuarioNombre = H000X2_A418Tran_UsuarioNombre[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A418Tran_UsuarioNombre", A418Tran_UsuarioNombre);
            n418Tran_UsuarioNombre = H000X2_n418Tran_UsuarioNombre[0] ;
            A417Tran_UsuarioCodigo = H000X2_A417Tran_UsuarioCodigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A417Tran_UsuarioCodigo", A417Tran_UsuarioCodigo);
            n417Tran_UsuarioCodigo = H000X2_n417Tran_UsuarioCodigo[0] ;
            A47Tran_UsuarioId = H000X2_A47Tran_UsuarioId[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A47Tran_UsuarioId", GXutil.ltrim( GXutil.str( A47Tran_UsuarioId, 18, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_USUARIOID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A47Tran_UsuarioId), "ZZZZZZZZZZZZZZZZZ9")));
            n47Tran_UsuarioId = H000X2_n47Tran_UsuarioId[0] ;
            A381Tran_DescripcionMovimiento = H000X2_A381Tran_DescripcionMovimiento[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A381Tran_DescripcionMovimiento", A381Tran_DescripcionMovimiento);
            n381Tran_DescripcionMovimiento = H000X2_n381Tran_DescripcionMovimiento[0] ;
            A391Tran_UsuarioRatifica = H000X2_A391Tran_UsuarioRatifica[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A391Tran_UsuarioRatifica", A391Tran_UsuarioRatifica);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_USUARIORATIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A391Tran_UsuarioRatifica, "@!"))));
            n391Tran_UsuarioRatifica = H000X2_n391Tran_UsuarioRatifica[0] ;
            A390Tran_FechaRatificacion = H000X2_A390Tran_FechaRatificacion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A390Tran_FechaRatificacion", localUtil.ttoc( A390Tran_FechaRatificacion, 10, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_FECHARATIFICACION", getSecureSignedToken( sPrefix, localUtil.format( A390Tran_FechaRatificacion, "99/99/9999 99:99")));
            n390Tran_FechaRatificacion = H000X2_n390Tran_FechaRatificacion[0] ;
            A52Tran_IdCuentadanteDestino = H000X2_A52Tran_IdCuentadanteDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A52Tran_IdCuentadanteDestino", GXutil.ltrim( GXutil.str( A52Tran_IdCuentadanteDestino, 18, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_IDCUENTADANTEDESTINO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A52Tran_IdCuentadanteDestino), "ZZZZZZZZZZZZZZZZZ9")));
            n52Tran_IdCuentadanteDestino = H000X2_n52Tran_IdCuentadanteDestino[0] ;
            A387Tran_CodBodeDestino = H000X2_A387Tran_CodBodeDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A387Tran_CodBodeDestino", A387Tran_CodBodeDestino);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_CODBODEDESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A387Tran_CodBodeDestino, ""))));
            A111Tran_CodAlmaDestino = H000X2_A111Tran_CodAlmaDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A111Tran_CodAlmaDestino", A111Tran_CodAlmaDestino);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_CODALMADESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A111Tran_CodAlmaDestino, ""))));
            A385Tran_ModuloDestino = H000X2_A385Tran_ModuloDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A385Tran_ModuloDestino", A385Tran_ModuloDestino);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_MODULODESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A385Tran_ModuloDestino, ""))));
            A51Tran_IdCuentadanteOrigen = H000X2_A51Tran_IdCuentadanteOrigen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A51Tran_IdCuentadanteOrigen", GXutil.ltrim( GXutil.str( A51Tran_IdCuentadanteOrigen, 18, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_IDCUENTADANTEORIGEN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A51Tran_IdCuentadanteOrigen), "ZZZZZZZZZZZZZZZZZ9")));
            n51Tran_IdCuentadanteOrigen = H000X2_n51Tran_IdCuentadanteOrigen[0] ;
            A112Tran_CodBodeOrigen = H000X2_A112Tran_CodBodeOrigen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A112Tran_CodBodeOrigen", A112Tran_CodBodeOrigen);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_CODBODEORIGEN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A112Tran_CodBodeOrigen, ""))));
            A58Tran_Estado = H000X2_A58Tran_Estado[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A58Tran_Estado", A58Tran_Estado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A58Tran_Estado, ""))));
            n58Tran_Estado = H000X2_n58Tran_Estado[0] ;
            A109Tran_CodAlmaOrigen = H000X2_A109Tran_CodAlmaOrigen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A109Tran_CodAlmaOrigen", A109Tran_CodAlmaOrigen);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_CODALMAORIGEN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A109Tran_CodAlmaOrigen, ""))));
            A110Tran_ModuloOrigen = H000X2_A110Tran_ModuloOrigen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A110Tran_ModuloOrigen", A110Tran_ModuloOrigen);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_MODULOORIGEN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A110Tran_ModuloOrigen, ""))));
            A55Tran_FechaRegistro = H000X2_A55Tran_FechaRegistro[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A55Tran_FechaRegistro", localUtil.ttoc( A55Tran_FechaRegistro, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_FECHAREGISTRO", getSecureSignedToken( sPrefix, localUtil.format( A55Tran_FechaRegistro, "99/99/99 99:99")));
            A49Tran_CodigoMovimiento = H000X2_A49Tran_CodigoMovimiento[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A49Tran_CodigoMovimiento", A49Tran_CodigoMovimiento);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_CODIGOMOVIMIENTO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A49Tran_CodigoMovimiento, ""))));
            A513Tran_ConsecutivoCC = H000X2_A513Tran_ConsecutivoCC[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A513Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( A513Tran_ConsecutivoCC, 18, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_CONSECUTIVOCC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A513Tran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")));
            n513Tran_ConsecutivoCC = H000X2_n513Tran_ConsecutivoCC[0] ;
            A759Tran_CedulaResponsabilidad = H000X2_A759Tran_CedulaResponsabilidad[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A759Tran_CedulaResponsabilidad", GXutil.ltrim( GXutil.str( A759Tran_CedulaResponsabilidad, 18, 0)));
            n759Tran_CedulaResponsabilidad = H000X2_n759Tran_CedulaResponsabilidad[0] ;
            A721Tran_NombreCuentadanteResponsa = H000X2_A721Tran_NombreCuentadanteResponsa[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A721Tran_NombreCuentadanteResponsa", A721Tran_NombreCuentadanteResponsa);
            n721Tran_NombreCuentadanteResponsa = H000X2_n721Tran_NombreCuentadanteResponsa[0] ;
            A703Tran_CedulaProveedor = H000X2_A703Tran_CedulaProveedor[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A703Tran_CedulaProveedor", GXutil.ltrim( GXutil.str( A703Tran_CedulaProveedor, 18, 0)));
            n703Tran_CedulaProveedor = H000X2_n703Tran_CedulaProveedor[0] ;
            A575Tran_NombreProveedor = H000X2_A575Tran_NombreProveedor[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A575Tran_NombreProveedor", A575Tran_NombreProveedor);
            n575Tran_NombreProveedor = H000X2_n575Tran_NombreProveedor[0] ;
            A608Tran_RegionAbrevDestino = H000X2_A608Tran_RegionAbrevDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A608Tran_RegionAbrevDestino", A608Tran_RegionAbrevDestino);
            n608Tran_RegionAbrevDestino = H000X2_n608Tran_RegionAbrevDestino[0] ;
            A520Tran_RegionDescripcionDestino = H000X2_A520Tran_RegionDescripcionDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A520Tran_RegionDescripcionDestino", A520Tran_RegionDescripcionDestino);
            n520Tran_RegionDescripcionDestino = H000X2_n520Tran_RegionDescripcionDestino[0] ;
            A519Tran_RegionCodigoDestino = H000X2_A519Tran_RegionCodigoDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A519Tran_RegionCodigoDestino", GXutil.ltrim( GXutil.str( A519Tran_RegionCodigoDestino, 4, 0)));
            n519Tran_RegionCodigoDestino = H000X2_n519Tran_RegionCodigoDestino[0] ;
            A517Tran_CentroCostoDescripcionDes = H000X2_A517Tran_CentroCostoDescripcionDes[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A517Tran_CentroCostoDescripcionDes", A517Tran_CentroCostoDescripcionDes);
            n517Tran_CentroCostoDescripcionDes = H000X2_n517Tran_CentroCostoDescripcionDes[0] ;
            A516Tran_CentroCostoCodigoDestino = H000X2_A516Tran_CentroCostoCodigoDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A516Tran_CentroCostoCodigoDestino", A516Tran_CentroCostoCodigoDestino);
            n516Tran_CentroCostoCodigoDestino = H000X2_n516Tran_CentroCostoCodigoDestino[0] ;
            A756Tran_Abreviado = H000X2_A756Tran_Abreviado[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A756Tran_Abreviado", A756Tran_Abreviado);
            n756Tran_Abreviado = H000X2_n756Tran_Abreviado[0] ;
            A672Tran_NombreIngreso = H000X2_A672Tran_NombreIngreso[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A672Tran_NombreIngreso", A672Tran_NombreIngreso);
            n672Tran_NombreIngreso = H000X2_n672Tran_NombreIngreso[0] ;
            A594Tran_RegionAbrev = H000X2_A594Tran_RegionAbrev[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A594Tran_RegionAbrev", A594Tran_RegionAbrev);
            n594Tran_RegionAbrev = H000X2_n594Tran_RegionAbrev[0] ;
            A422Tran_RegionDescripcion = H000X2_A422Tran_RegionDescripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A422Tran_RegionDescripcion", A422Tran_RegionDescripcion);
            n422Tran_RegionDescripcion = H000X2_n422Tran_RegionDescripcion[0] ;
            A421Tran_RegionCodigo = H000X2_A421Tran_RegionCodigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A421Tran_RegionCodigo", GXutil.ltrim( GXutil.str( A421Tran_RegionCodigo, 4, 0)));
            n421Tran_RegionCodigo = H000X2_n421Tran_RegionCodigo[0] ;
            A420Tran_CentroCostoDescripcion = H000X2_A420Tran_CentroCostoDescripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A420Tran_CentroCostoDescripcion", A420Tran_CentroCostoDescripcion);
            n420Tran_CentroCostoDescripcion = H000X2_n420Tran_CentroCostoDescripcion[0] ;
            A419Tran_CentroCostoCodigo = H000X2_A419Tran_CentroCostoCodigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A419Tran_CentroCostoCodigo", A419Tran_CentroCostoCodigo);
            n419Tran_CentroCostoCodigo = H000X2_n419Tran_CentroCostoCodigo[0] ;
            A418Tran_UsuarioNombre = H000X2_A418Tran_UsuarioNombre[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A418Tran_UsuarioNombre", A418Tran_UsuarioNombre);
            n418Tran_UsuarioNombre = H000X2_n418Tran_UsuarioNombre[0] ;
            A417Tran_UsuarioCodigo = H000X2_A417Tran_UsuarioCodigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A417Tran_UsuarioCodigo", A417Tran_UsuarioCodigo);
            n417Tran_UsuarioCodigo = H000X2_n417Tran_UsuarioCodigo[0] ;
            A715Tran_EmailCuentadanteDestino = H000X2_A715Tran_EmailCuentadanteDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A715Tran_EmailCuentadanteDestino", A715Tran_EmailCuentadanteDestino);
            n715Tran_EmailCuentadanteDestino = H000X2_n715Tran_EmailCuentadanteDestino[0] ;
            A704Tran_CedulaCuentadanteDestino = H000X2_A704Tran_CedulaCuentadanteDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A704Tran_CedulaCuentadanteDestino", GXutil.ltrim( GXutil.str( A704Tran_CedulaCuentadanteDestino, 18, 0)));
            n704Tran_CedulaCuentadanteDestino = H000X2_n704Tran_CedulaCuentadanteDestino[0] ;
            A389Tran_NombCuentadanteDestino = H000X2_A389Tran_NombCuentadanteDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A389Tran_NombCuentadanteDestino", A389Tran_NombCuentadanteDestino);
            n389Tran_NombCuentadanteDestino = H000X2_n389Tran_NombCuentadanteDestino[0] ;
            A714Tran_EmailCuentadanteOrigen = H000X2_A714Tran_EmailCuentadanteOrigen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A714Tran_EmailCuentadanteOrigen", A714Tran_EmailCuentadanteOrigen);
            n714Tran_EmailCuentadanteOrigen = H000X2_n714Tran_EmailCuentadanteOrigen[0] ;
            A702Tran_CedulaCuentadanteOrigen = H000X2_A702Tran_CedulaCuentadanteOrigen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A702Tran_CedulaCuentadanteOrigen", GXutil.ltrim( GXutil.str( A702Tran_CedulaCuentadanteOrigen, 18, 0)));
            n702Tran_CedulaCuentadanteOrigen = H000X2_n702Tran_CedulaCuentadanteOrigen[0] ;
            A384Tran_NombCuentadanteOrigen = H000X2_A384Tran_NombCuentadanteOrigen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A384Tran_NombCuentadanteOrigen", A384Tran_NombCuentadanteOrigen);
            n384Tran_NombCuentadanteOrigen = H000X2_n384Tran_NombCuentadanteOrigen[0] ;
            A754Tran_CuentaResponsabilidad = H000X2_A754Tran_CuentaResponsabilidad[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A754Tran_CuentaResponsabilidad", A754Tran_CuentaResponsabilidad);
            n754Tran_CuentaResponsabilidad = H000X2_n754Tran_CuentaResponsabilidad[0] ;
            A708Tran_SolicitaRegionDestino = H000X2_A708Tran_SolicitaRegionDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A708Tran_SolicitaRegionDestino", A708Tran_SolicitaRegionDestino);
            n708Tran_SolicitaRegionDestino = H000X2_n708Tran_SolicitaRegionDestino[0] ;
            A707Tran_SolicitaCCDestino = H000X2_A707Tran_SolicitaCCDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A707Tran_SolicitaCCDestino", A707Tran_SolicitaCCDestino);
            n707Tran_SolicitaCCDestino = H000X2_n707Tran_SolicitaCCDestino[0] ;
            A499Tran_CodTipoElemento = H000X2_A499Tran_CodTipoElemento[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A499Tran_CodTipoElemento", GXutil.ltrim( GXutil.str( A499Tran_CodTipoElemento, 18, 0)));
            n499Tran_CodTipoElemento = H000X2_n499Tran_CodTipoElemento[0] ;
            A479Tran_IndCurso = H000X2_A479Tran_IndCurso[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A479Tran_IndCurso", A479Tran_IndCurso);
            n479Tran_IndCurso = H000X2_n479Tran_IndCurso[0] ;
            A478Tran_IndAreadante = H000X2_A478Tran_IndAreadante[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A478Tran_IndAreadante", A478Tran_IndAreadante);
            n478Tran_IndAreadante = H000X2_n478Tran_IndAreadante[0] ;
            A381Tran_DescripcionMovimiento = H000X2_A381Tran_DescripcionMovimiento[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A381Tran_DescripcionMovimiento", A381Tran_DescripcionMovimiento);
            n381Tran_DescripcionMovimiento = H000X2_n381Tran_DescripcionMovimiento[0] ;
            /* Execute user event: Load */
            e140X2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb0X0( ) ;
      }
   }

   public void strup0X0( )
   {
      /* Before Start, stand alone formulas. */
      AV14Pgmname = "ALM_TRANSACCIONGeneral" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e130X2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A513Tran_ConsecutivoCC = localUtil.ctol( httpContext.cgiGet( edtTran_ConsecutivoCC_Internalname), ",", ".") ;
         n513Tran_ConsecutivoCC = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A513Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( A513Tran_ConsecutivoCC, 18, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_CONSECUTIVOCC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A513Tran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")));
         A49Tran_CodigoMovimiento = httpContext.cgiGet( edtTran_CodigoMovimiento_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A49Tran_CodigoMovimiento", A49Tran_CodigoMovimiento);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_CODIGOMOVIMIENTO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A49Tran_CodigoMovimiento, ""))));
         A55Tran_FechaRegistro = localUtil.ctot( httpContext.cgiGet( edtTran_FechaRegistro_Internalname), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A55Tran_FechaRegistro", localUtil.ttoc( A55Tran_FechaRegistro, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_FECHAREGISTRO", getSecureSignedToken( sPrefix, localUtil.format( A55Tran_FechaRegistro, "99/99/99 99:99")));
         A110Tran_ModuloOrigen = httpContext.cgiGet( edtTran_ModuloOrigen_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A110Tran_ModuloOrigen", A110Tran_ModuloOrigen);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_MODULOORIGEN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A110Tran_ModuloOrigen, ""))));
         A109Tran_CodAlmaOrigen = httpContext.cgiGet( edtTran_CodAlmaOrigen_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A109Tran_CodAlmaOrigen", A109Tran_CodAlmaOrigen);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_CODALMAORIGEN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A109Tran_CodAlmaOrigen, ""))));
         cmbTran_Estado.setValue( httpContext.cgiGet( cmbTran_Estado.getInternalname()) );
         A58Tran_Estado = httpContext.cgiGet( cmbTran_Estado.getInternalname()) ;
         n58Tran_Estado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A58Tran_Estado", A58Tran_Estado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A58Tran_Estado, ""))));
         A112Tran_CodBodeOrigen = httpContext.cgiGet( edtTran_CodBodeOrigen_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A112Tran_CodBodeOrigen", A112Tran_CodBodeOrigen);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_CODBODEORIGEN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A112Tran_CodBodeOrigen, ""))));
         A51Tran_IdCuentadanteOrigen = localUtil.ctol( httpContext.cgiGet( edtTran_IdCuentadanteOrigen_Internalname), ",", ".") ;
         n51Tran_IdCuentadanteOrigen = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A51Tran_IdCuentadanteOrigen", GXutil.ltrim( GXutil.str( A51Tran_IdCuentadanteOrigen, 18, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_IDCUENTADANTEORIGEN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A51Tran_IdCuentadanteOrigen), "ZZZZZZZZZZZZZZZZZ9")));
         A385Tran_ModuloDestino = httpContext.cgiGet( edtTran_ModuloDestino_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A385Tran_ModuloDestino", A385Tran_ModuloDestino);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_MODULODESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A385Tran_ModuloDestino, ""))));
         A111Tran_CodAlmaDestino = httpContext.cgiGet( edtTran_CodAlmaDestino_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A111Tran_CodAlmaDestino", A111Tran_CodAlmaDestino);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_CODALMADESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A111Tran_CodAlmaDestino, ""))));
         A387Tran_CodBodeDestino = httpContext.cgiGet( edtTran_CodBodeDestino_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A387Tran_CodBodeDestino", A387Tran_CodBodeDestino);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_CODBODEDESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A387Tran_CodBodeDestino, ""))));
         A52Tran_IdCuentadanteDestino = localUtil.ctol( httpContext.cgiGet( edtTran_IdCuentadanteDestino_Internalname), ",", ".") ;
         n52Tran_IdCuentadanteDestino = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A52Tran_IdCuentadanteDestino", GXutil.ltrim( GXutil.str( A52Tran_IdCuentadanteDestino, 18, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_IDCUENTADANTEDESTINO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A52Tran_IdCuentadanteDestino), "ZZZZZZZZZZZZZZZZZ9")));
         A390Tran_FechaRatificacion = localUtil.ctot( httpContext.cgiGet( edtTran_FechaRatificacion_Internalname), 0) ;
         n390Tran_FechaRatificacion = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A390Tran_FechaRatificacion", localUtil.ttoc( A390Tran_FechaRatificacion, 10, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_FECHARATIFICACION", getSecureSignedToken( sPrefix, localUtil.format( A390Tran_FechaRatificacion, "99/99/9999 99:99")));
         A391Tran_UsuarioRatifica = GXutil.upper( httpContext.cgiGet( edtTran_UsuarioRatifica_Internalname)) ;
         n391Tran_UsuarioRatifica = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A391Tran_UsuarioRatifica", A391Tran_UsuarioRatifica);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_USUARIORATIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A391Tran_UsuarioRatifica, "@!"))));
         A381Tran_DescripcionMovimiento = httpContext.cgiGet( edtTran_DescripcionMovimiento_Internalname) ;
         n381Tran_DescripcionMovimiento = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A381Tran_DescripcionMovimiento", A381Tran_DescripcionMovimiento);
         A416Tran_Observaciones = httpContext.cgiGet( edtTran_Observaciones_Internalname) ;
         n416Tran_Observaciones = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A416Tran_Observaciones", A416Tran_Observaciones);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_OBSERVACIONES", getSecureSignedToken( sPrefix, A416Tran_Observaciones));
         A47Tran_UsuarioId = localUtil.ctol( httpContext.cgiGet( edtTran_UsuarioId_Internalname), ",", ".") ;
         n47Tran_UsuarioId = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A47Tran_UsuarioId", GXutil.ltrim( GXutil.str( A47Tran_UsuarioId, 18, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_USUARIOID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A47Tran_UsuarioId), "ZZZZZZZZZZZZZZZZZ9")));
         A417Tran_UsuarioCodigo = GXutil.upper( httpContext.cgiGet( edtTran_UsuarioCodigo_Internalname)) ;
         n417Tran_UsuarioCodigo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A417Tran_UsuarioCodigo", A417Tran_UsuarioCodigo);
         A418Tran_UsuarioNombre = httpContext.cgiGet( edtTran_UsuarioNombre_Internalname) ;
         n418Tran_UsuarioNombre = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A418Tran_UsuarioNombre", A418Tran_UsuarioNombre);
         A48Tran_CentroCostoId = localUtil.ctol( httpContext.cgiGet( edtTran_CentroCostoId_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A48Tran_CentroCostoId", GXutil.ltrim( GXutil.str( A48Tran_CentroCostoId, 11, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_CENTROCOSTOID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A48Tran_CentroCostoId), "ZZZZZZZZZZ9")));
         A419Tran_CentroCostoCodigo = httpContext.cgiGet( edtTran_CentroCostoCodigo_Internalname) ;
         n419Tran_CentroCostoCodigo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A419Tran_CentroCostoCodigo", A419Tran_CentroCostoCodigo);
         A420Tran_CentroCostoDescripcion = httpContext.cgiGet( edtTran_CentroCostoDescripcion_Internalname) ;
         n420Tran_CentroCostoDescripcion = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A420Tran_CentroCostoDescripcion", A420Tran_CentroCostoDescripcion);
         A57Tran_RegionId = localUtil.ctol( httpContext.cgiGet( edtTran_RegionId_Internalname), ",", ".") ;
         n57Tran_RegionId = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A57Tran_RegionId", GXutil.ltrim( GXutil.str( A57Tran_RegionId, 11, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_REGIONID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A57Tran_RegionId), "ZZZZZZZZZZ9")));
         A421Tran_RegionCodigo = (short)(localUtil.ctol( httpContext.cgiGet( edtTran_RegionCodigo_Internalname), ",", ".")) ;
         n421Tran_RegionCodigo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A421Tran_RegionCodigo", GXutil.ltrim( GXutil.str( A421Tran_RegionCodigo, 4, 0)));
         A422Tran_RegionDescripcion = httpContext.cgiGet( edtTran_RegionDescripcion_Internalname) ;
         n422Tran_RegionDescripcion = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A422Tran_RegionDescripcion", A422Tran_RegionDescripcion);
         A407Tran_AreadanteCodigo = httpContext.cgiGet( edtTran_AreadanteCodigo_Internalname) ;
         n407Tran_AreadanteCodigo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A407Tran_AreadanteCodigo", A407Tran_AreadanteCodigo);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_AREADANTECODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A407Tran_AreadanteCodigo, ""))));
         A408Tran_CursoCodigo = httpContext.cgiGet( edtTran_CursoCodigo_Internalname) ;
         n408Tran_CursoCodigo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A408Tran_CursoCodigo", A408Tran_CursoCodigo);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_CURSOCODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A408Tran_CursoCodigo, ""))));
         cmbTran_IndAreadante.setValue( httpContext.cgiGet( cmbTran_IndAreadante.getInternalname()) );
         A478Tran_IndAreadante = httpContext.cgiGet( cmbTran_IndAreadante.getInternalname()) ;
         n478Tran_IndAreadante = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A478Tran_IndAreadante", A478Tran_IndAreadante);
         cmbTran_IndCurso.setValue( httpContext.cgiGet( cmbTran_IndCurso.getInternalname()) );
         A479Tran_IndCurso = httpContext.cgiGet( cmbTran_IndCurso.getInternalname()) ;
         n479Tran_IndCurso = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A479Tran_IndCurso", A479Tran_IndCurso);
         cmbTran_IndE_S.setValue( httpContext.cgiGet( cmbTran_IndE_S.getInternalname()) );
         A481Tran_IndE_S = httpContext.cgiGet( cmbTran_IndE_S.getInternalname()) ;
         n481Tran_IndE_S = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A481Tran_IndE_S", A481Tran_IndE_S);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_INDE_S", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A481Tran_IndE_S, ""))));
         A483Tran_ValorTransaccion = localUtil.ctond( httpContext.cgiGet( edtTran_ValorTransaccion_Internalname)) ;
         n483Tran_ValorTransaccion = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A483Tran_ValorTransaccion", GXutil.ltrim( GXutil.str( A483Tran_ValorTransaccion, 18, 2)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_VALORTRANSACCION", getSecureSignedToken( sPrefix, localUtil.format( A483Tran_ValorTransaccion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         A498Tran_NumeroLineas = localUtil.ctol( httpContext.cgiGet( edtTran_NumeroLineas_Internalname), ",", ".") ;
         n498Tran_NumeroLineas = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A498Tran_NumeroLineas", GXutil.ltrim( GXutil.str( A498Tran_NumeroLineas, 18, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_NUMEROLINEAS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A498Tran_NumeroLineas), "ZZZZZZZZZZZZZZZZZ9")));
         A499Tran_CodTipoElemento = localUtil.ctol( httpContext.cgiGet( edtTran_CodTipoElemento_Internalname), ",", ".") ;
         n499Tran_CodTipoElemento = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A499Tran_CodTipoElemento", GXutil.ltrim( GXutil.str( A499Tran_CodTipoElemento, 18, 0)));
         cmbTran_TipoElemento.setValue( httpContext.cgiGet( cmbTran_TipoElemento.getInternalname()) );
         A482Tran_TipoElemento = httpContext.cgiGet( cmbTran_TipoElemento.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A482Tran_TipoElemento", A482Tran_TipoElemento);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_TIPOELEMENTO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A482Tran_TipoElemento, ""))));
         cmbTran_TipoIngreso.setValue( httpContext.cgiGet( cmbTran_TipoIngreso.getInternalname()) );
         A54Tran_TipoIngreso = GXutil.lval( httpContext.cgiGet( cmbTran_TipoIngreso.getInternalname())) ;
         n54Tran_TipoIngreso = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A54Tran_TipoIngreso", GXutil.ltrim( GXutil.str( A54Tran_TipoIngreso, 11, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_TIPOINGRESO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A54Tran_TipoIngreso), "ZZZZZZZZZZ9")));
         A514Tran_NumeroIngreso = httpContext.cgiGet( edtTran_NumeroIngreso_Internalname) ;
         n514Tran_NumeroIngreso = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A514Tran_NumeroIngreso", A514Tran_NumeroIngreso);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_NUMEROINGRESO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A514Tran_NumeroIngreso, ""))));
         A515Tran_FechaIngreso = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtTran_FechaIngreso_Internalname), 0)) ;
         n515Tran_FechaIngreso = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A515Tran_FechaIngreso", localUtil.format(A515Tran_FechaIngreso, "99/99/99"));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_FECHAINGRESO", getSecureSignedToken( sPrefix, A515Tran_FechaIngreso));
         A50Tran_CentroCostoIdDestino = localUtil.ctol( httpContext.cgiGet( edtTran_CentroCostoIdDestino_Internalname), ",", ".") ;
         n50Tran_CentroCostoIdDestino = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A50Tran_CentroCostoIdDestino", GXutil.ltrim( GXutil.str( A50Tran_CentroCostoIdDestino, 11, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_CENTROCOSTOIDDESTINO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A50Tran_CentroCostoIdDestino), "ZZZZZZZZZZ9")));
         A516Tran_CentroCostoCodigoDestino = httpContext.cgiGet( edtTran_CentroCostoCodigoDestino_Internalname) ;
         n516Tran_CentroCostoCodigoDestino = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A516Tran_CentroCostoCodigoDestino", A516Tran_CentroCostoCodigoDestino);
         A517Tran_CentroCostoDescripcionDes = httpContext.cgiGet( edtTran_CentroCostoDescripcionDes_Internalname) ;
         n517Tran_CentroCostoDescripcionDes = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A517Tran_CentroCostoDescripcionDes", A517Tran_CentroCostoDescripcionDes);
         A518Tran_RegionIdDestino = localUtil.ctol( httpContext.cgiGet( edtTran_RegionIdDestino_Internalname), ",", ".") ;
         n518Tran_RegionIdDestino = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A518Tran_RegionIdDestino", GXutil.ltrim( GXutil.str( A518Tran_RegionIdDestino, 11, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_REGIONIDDESTINO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A518Tran_RegionIdDestino), "ZZZZZZZZZZ9")));
         A519Tran_RegionCodigoDestino = (short)(localUtil.ctol( httpContext.cgiGet( edtTran_RegionCodigoDestino_Internalname), ",", ".")) ;
         n519Tran_RegionCodigoDestino = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A519Tran_RegionCodigoDestino", GXutil.ltrim( GXutil.str( A519Tran_RegionCodigoDestino, 4, 0)));
         A520Tran_RegionDescripcionDestino = httpContext.cgiGet( edtTran_RegionDescripcionDestino_Internalname) ;
         n520Tran_RegionDescripcionDestino = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A520Tran_RegionDescripcionDestino", A520Tran_RegionDescripcionDestino);
         cmbTran_TipoEntra.setValue( httpContext.cgiGet( cmbTran_TipoEntra.getInternalname()) );
         A527Tran_TipoEntra = httpContext.cgiGet( cmbTran_TipoEntra.getInternalname()) ;
         n527Tran_TipoEntra = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A527Tran_TipoEntra", A527Tran_TipoEntra);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_TIPOENTRA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A527Tran_TipoEntra, ""))));
         A568Tran_CantidadPadres = (int)(localUtil.ctol( httpContext.cgiGet( edtTran_CantidadPadres_Internalname), ",", ".")) ;
         n568Tran_CantidadPadres = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A568Tran_CantidadPadres", GXutil.ltrim( GXutil.str( A568Tran_CantidadPadres, 8, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_CANTIDADPADRES", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A568Tran_CantidadPadres), "ZZZZZZZ9")));
         A53Tran_IdProveedor = localUtil.ctol( httpContext.cgiGet( edtTran_IdProveedor_Internalname), ",", ".") ;
         n53Tran_IdProveedor = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A53Tran_IdProveedor", GXutil.ltrim( GXutil.str( A53Tran_IdProveedor, 18, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_IDPROVEEDOR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A53Tran_IdProveedor), "ZZZZZZZZZZZZZZZZZ9")));
         A594Tran_RegionAbrev = httpContext.cgiGet( edtTran_RegionAbrev_Internalname) ;
         n594Tran_RegionAbrev = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A594Tran_RegionAbrev", A594Tran_RegionAbrev);
         A608Tran_RegionAbrevDestino = httpContext.cgiGet( edtTran_RegionAbrevDestino_Internalname) ;
         n608Tran_RegionAbrevDestino = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A608Tran_RegionAbrevDestino", A608Tran_RegionAbrevDestino);
         A524Tran_Detalle = httpContext.cgiGet( edtTran_Detalle_Internalname) ;
         n524Tran_Detalle = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A524Tran_Detalle", A524Tran_Detalle);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_DETALLE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A524Tran_Detalle, ""))));
         A667Tran_NumeroGrupo = (short)(localUtil.ctol( httpContext.cgiGet( edtTran_NumeroGrupo_Internalname), ",", ".")) ;
         n667Tran_NumeroGrupo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A667Tran_NumeroGrupo", GXutil.ltrim( GXutil.str( A667Tran_NumeroGrupo, 4, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_NUMEROGRUPO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A667Tran_NumeroGrupo), "ZZZ9")));
         A668Tran_UsuarioEliminaoAnula = GXutil.upper( httpContext.cgiGet( edtTran_UsuarioEliminaoAnula_Internalname)) ;
         n668Tran_UsuarioEliminaoAnula = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A668Tran_UsuarioEliminaoAnula", A668Tran_UsuarioEliminaoAnula);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_USUARIOELIMINAOANULA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A668Tran_UsuarioEliminaoAnula, "@!"))));
         A669Tran_FechaEliminaoAnula = localUtil.ctot( httpContext.cgiGet( edtTran_FechaEliminaoAnula_Internalname), 0) ;
         n669Tran_FechaEliminaoAnula = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A669Tran_FechaEliminaoAnula", localUtil.ttoc( A669Tran_FechaEliminaoAnula, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_FECHAELIMINAOANULA", getSecureSignedToken( sPrefix, localUtil.format( A669Tran_FechaEliminaoAnula, "99/99/99 99:99")));
         A670Tran_ObservacionesAnula = httpContext.cgiGet( edtTran_ObservacionesAnula_Internalname) ;
         n670Tran_ObservacionesAnula = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A670Tran_ObservacionesAnula", A670Tran_ObservacionesAnula);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_OBSERVACIONESANULA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A670Tran_ObservacionesAnula, ""))));
         A384Tran_NombCuentadanteOrigen = GXutil.upper( httpContext.cgiGet( edtTran_NombCuentadanteOrigen_Internalname)) ;
         n384Tran_NombCuentadanteOrigen = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A384Tran_NombCuentadanteOrigen", A384Tran_NombCuentadanteOrigen);
         A575Tran_NombreProveedor = GXutil.upper( httpContext.cgiGet( edtTran_NombreProveedor_Internalname)) ;
         n575Tran_NombreProveedor = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A575Tran_NombreProveedor", A575Tran_NombreProveedor);
         A389Tran_NombCuentadanteDestino = GXutil.upper( httpContext.cgiGet( edtTran_NombCuentadanteDestino_Internalname)) ;
         n389Tran_NombCuentadanteDestino = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A389Tran_NombCuentadanteDestino", A389Tran_NombCuentadanteDestino);
         A672Tran_NombreIngreso = GXutil.upper( httpContext.cgiGet( edtTran_NombreIngreso_Internalname)) ;
         n672Tran_NombreIngreso = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A672Tran_NombreIngreso", A672Tran_NombreIngreso);
         A702Tran_CedulaCuentadanteOrigen = localUtil.ctol( httpContext.cgiGet( edtTran_CedulaCuentadanteOrigen_Internalname), ",", ".") ;
         n702Tran_CedulaCuentadanteOrigen = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A702Tran_CedulaCuentadanteOrigen", GXutil.ltrim( GXutil.str( A702Tran_CedulaCuentadanteOrigen, 18, 0)));
         A703Tran_CedulaProveedor = localUtil.ctol( httpContext.cgiGet( edtTran_CedulaProveedor_Internalname), ",", ".") ;
         n703Tran_CedulaProveedor = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A703Tran_CedulaProveedor", GXutil.ltrim( GXutil.str( A703Tran_CedulaProveedor, 18, 0)));
         A704Tran_CedulaCuentadanteDestino = localUtil.ctol( httpContext.cgiGet( edtTran_CedulaCuentadanteDestino_Internalname), ",", ".") ;
         n704Tran_CedulaCuentadanteDestino = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A704Tran_CedulaCuentadanteDestino", GXutil.ltrim( GXutil.str( A704Tran_CedulaCuentadanteDestino, 18, 0)));
         cmbTran_SolicitaCCDestino.setValue( httpContext.cgiGet( cmbTran_SolicitaCCDestino.getInternalname()) );
         A707Tran_SolicitaCCDestino = httpContext.cgiGet( cmbTran_SolicitaCCDestino.getInternalname()) ;
         n707Tran_SolicitaCCDestino = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A707Tran_SolicitaCCDestino", A707Tran_SolicitaCCDestino);
         cmbTran_SolicitaRegionDestino.setValue( httpContext.cgiGet( cmbTran_SolicitaRegionDestino.getInternalname()) );
         A708Tran_SolicitaRegionDestino = httpContext.cgiGet( cmbTran_SolicitaRegionDestino.getInternalname()) ;
         n708Tran_SolicitaRegionDestino = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A708Tran_SolicitaRegionDestino", A708Tran_SolicitaRegionDestino);
         A714Tran_EmailCuentadanteOrigen = httpContext.cgiGet( edtTran_EmailCuentadanteOrigen_Internalname) ;
         n714Tran_EmailCuentadanteOrigen = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A714Tran_EmailCuentadanteOrigen", A714Tran_EmailCuentadanteOrigen);
         A715Tran_EmailCuentadanteDestino = httpContext.cgiGet( edtTran_EmailCuentadanteDestino_Internalname) ;
         n715Tran_EmailCuentadanteDestino = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A715Tran_EmailCuentadanteDestino", A715Tran_EmailCuentadanteDestino);
         A56Tran_IdCuentadanteResponsabili = localUtil.ctol( httpContext.cgiGet( edtTran_IdCuentadanteResponsabili_Internalname), ",", ".") ;
         n56Tran_IdCuentadanteResponsabili = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A56Tran_IdCuentadanteResponsabili", GXutil.ltrim( GXutil.str( A56Tran_IdCuentadanteResponsabili, 18, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_IDCUENTADANTERESPONSABILI", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A56Tran_IdCuentadanteResponsabili), "ZZZZZZZZZZZZZZZZZ9")));
         A721Tran_NombreCuentadanteResponsa = GXutil.upper( httpContext.cgiGet( edtTran_NombreCuentadanteResponsa_Internalname)) ;
         n721Tran_NombreCuentadanteResponsa = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A721Tran_NombreCuentadanteResponsa", A721Tran_NombreCuentadanteResponsa);
         A719Tran_TransaccResponsabilidad = localUtil.ctol( httpContext.cgiGet( edtTran_TransaccResponsabilidad_Internalname), ",", ".") ;
         n719Tran_TransaccResponsabilidad = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A719Tran_TransaccResponsabilidad", GXutil.ltrim( GXutil.str( A719Tran_TransaccResponsabilidad, 11, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_TRANSACCRESPONSABILIDAD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A719Tran_TransaccResponsabilidad), "ZZZZZZZZZZ9")));
         A720Tran_FechaResponsabilidad = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtTran_FechaResponsabilidad_Internalname), 0)) ;
         n720Tran_FechaResponsabilidad = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A720Tran_FechaResponsabilidad", localUtil.format(A720Tran_FechaResponsabilidad, "99/99/99"));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_FECHARESPONSABILIDAD", getSecureSignedToken( sPrefix, A720Tran_FechaResponsabilidad));
         cmbTran_CuentaResponsabilidad.setValue( httpContext.cgiGet( cmbTran_CuentaResponsabilidad.getInternalname()) );
         A754Tran_CuentaResponsabilidad = httpContext.cgiGet( cmbTran_CuentaResponsabilidad.getInternalname()) ;
         n754Tran_CuentaResponsabilidad = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A754Tran_CuentaResponsabilidad", A754Tran_CuentaResponsabilidad);
         A756Tran_Abreviado = httpContext.cgiGet( edtTran_Abreviado_Internalname) ;
         n756Tran_Abreviado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A756Tran_Abreviado", A756Tran_Abreviado);
         A758Tran_TablaResponsabilidad = (short)(localUtil.ctol( httpContext.cgiGet( edtTran_TablaResponsabilidad_Internalname), ",", ".")) ;
         n758Tran_TablaResponsabilidad = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A758Tran_TablaResponsabilidad", GXutil.ltrim( GXutil.str( A758Tran_TablaResponsabilidad, 4, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_TABLARESPONSABILIDAD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A758Tran_TablaResponsabilidad), "ZZZ9")));
         A759Tran_CedulaResponsabilidad = localUtil.ctol( httpContext.cgiGet( edtTran_CedulaResponsabilidad_Internalname), ",", ".") ;
         n759Tran_CedulaResponsabilidad = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A759Tran_CedulaResponsabilidad", GXutil.ltrim( GXutil.str( A759Tran_CedulaResponsabilidad, 18, 0)));
         cmbTran_EntidadGobierno.setValue( httpContext.cgiGet( cmbTran_EntidadGobierno.getInternalname()) );
         A859Tran_EntidadGobierno = httpContext.cgiGet( cmbTran_EntidadGobierno.getInternalname()) ;
         n859Tran_EntidadGobierno = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A859Tran_EntidadGobierno", A859Tran_EntidadGobierno);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TRAN_ENTIDADGOBIERNO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A859Tran_EntidadGobierno, ""))));
         /* Read saved values. */
         wcpOA46Tran_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA46Tran_Id"), ",", ".") ;
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
      e130X2 ();
      if (returnInSub) return;
   }

   public void e130X2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV14Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV14Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
   }

   protected void nextLoad( )
   {
   }

   protected void e140X2( )
   {
      /* Load Routine */
      edtTran_Id_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTran_Id_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTran_Id_Visible, 5, 0)), true);
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV8TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV14Pgmname );
      AV8TrnContext.setgxTv_SdtTransactionContext_Callerondelete( false );
      AV8TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV11HTTPRequest.getScriptName()+"?"+AV11HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_TRANSACCION" );
      AV9TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Tran_Id" );
      AV9TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV7Tran_Id, 11, 0) );
      AV8TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV10Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      A46Tran_Id = ((Number) GXutil.testNumericType( getParm(obj,0,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
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
      pa0X2( ) ;
      ws0X2( ) ;
      we0X2( ) ;
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
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa0X2( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "alm_transacciongeneral");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa0X2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A46Tran_Id = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
      }
      wcpOA46Tran_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA46Tran_Id"), ",", ".") ;
      if ( ! GetJustCreated( ) && ( ( A46Tran_Id != wcpOA46Tran_Id ) ) )
      {
         setjustcreated();
      }
      wcpOA46Tran_Id = A46Tran_Id ;
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
      pa0X2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws0X2( ) ;
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
      ws0X2( ) ;
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
      we0X2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414134587");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("alm_transacciongeneral.js", "?201861414134588");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtTran_ConsecutivoCC_Internalname = sPrefix+"TRAN_CONSECUTIVOCC" ;
      edtTran_CodigoMovimiento_Internalname = sPrefix+"TRAN_CODIGOMOVIMIENTO" ;
      edtTran_FechaRegistro_Internalname = sPrefix+"TRAN_FECHAREGISTRO" ;
      edtTran_ModuloOrigen_Internalname = sPrefix+"TRAN_MODULOORIGEN" ;
      edtTran_CodAlmaOrigen_Internalname = sPrefix+"TRAN_CODALMAORIGEN" ;
      cmbTran_Estado.setInternalname( sPrefix+"TRAN_ESTADO" );
      edtTran_CodBodeOrigen_Internalname = sPrefix+"TRAN_CODBODEORIGEN" ;
      edtTran_IdCuentadanteOrigen_Internalname = sPrefix+"TRAN_IDCUENTADANTEORIGEN" ;
      edtTran_ModuloDestino_Internalname = sPrefix+"TRAN_MODULODESTINO" ;
      edtTran_CodAlmaDestino_Internalname = sPrefix+"TRAN_CODALMADESTINO" ;
      edtTran_CodBodeDestino_Internalname = sPrefix+"TRAN_CODBODEDESTINO" ;
      edtTran_IdCuentadanteDestino_Internalname = sPrefix+"TRAN_IDCUENTADANTEDESTINO" ;
      edtTran_FechaRatificacion_Internalname = sPrefix+"TRAN_FECHARATIFICACION" ;
      edtTran_UsuarioRatifica_Internalname = sPrefix+"TRAN_USUARIORATIFICA" ;
      edtTran_DescripcionMovimiento_Internalname = sPrefix+"TRAN_DESCRIPCIONMOVIMIENTO" ;
      edtTran_Observaciones_Internalname = sPrefix+"TRAN_OBSERVACIONES" ;
      edtTran_UsuarioId_Internalname = sPrefix+"TRAN_USUARIOID" ;
      edtTran_UsuarioCodigo_Internalname = sPrefix+"TRAN_USUARIOCODIGO" ;
      edtTran_UsuarioNombre_Internalname = sPrefix+"TRAN_USUARIONOMBRE" ;
      edtTran_CentroCostoId_Internalname = sPrefix+"TRAN_CENTROCOSTOID" ;
      edtTran_CentroCostoCodigo_Internalname = sPrefix+"TRAN_CENTROCOSTOCODIGO" ;
      edtTran_CentroCostoDescripcion_Internalname = sPrefix+"TRAN_CENTROCOSTODESCRIPCION" ;
      edtTran_RegionId_Internalname = sPrefix+"TRAN_REGIONID" ;
      edtTran_RegionCodigo_Internalname = sPrefix+"TRAN_REGIONCODIGO" ;
      edtTran_RegionDescripcion_Internalname = sPrefix+"TRAN_REGIONDESCRIPCION" ;
      edtTran_AreadanteCodigo_Internalname = sPrefix+"TRAN_AREADANTECODIGO" ;
      edtTran_CursoCodigo_Internalname = sPrefix+"TRAN_CURSOCODIGO" ;
      cmbTran_IndAreadante.setInternalname( sPrefix+"TRAN_INDAREADANTE" );
      cmbTran_IndCurso.setInternalname( sPrefix+"TRAN_INDCURSO" );
      cmbTran_IndE_S.setInternalname( sPrefix+"TRAN_INDE_S" );
      edtTran_ValorTransaccion_Internalname = sPrefix+"TRAN_VALORTRANSACCION" ;
      edtTran_NumeroLineas_Internalname = sPrefix+"TRAN_NUMEROLINEAS" ;
      edtTran_CodTipoElemento_Internalname = sPrefix+"TRAN_CODTIPOELEMENTO" ;
      cmbTran_TipoElemento.setInternalname( sPrefix+"TRAN_TIPOELEMENTO" );
      cmbTran_TipoIngreso.setInternalname( sPrefix+"TRAN_TIPOINGRESO" );
      edtTran_NumeroIngreso_Internalname = sPrefix+"TRAN_NUMEROINGRESO" ;
      edtTran_FechaIngreso_Internalname = sPrefix+"TRAN_FECHAINGRESO" ;
      edtTran_CentroCostoIdDestino_Internalname = sPrefix+"TRAN_CENTROCOSTOIDDESTINO" ;
      edtTran_CentroCostoCodigoDestino_Internalname = sPrefix+"TRAN_CENTROCOSTOCODIGODESTINO" ;
      edtTran_CentroCostoDescripcionDes_Internalname = sPrefix+"TRAN_CENTROCOSTODESCRIPCIONDES" ;
      edtTran_RegionIdDestino_Internalname = sPrefix+"TRAN_REGIONIDDESTINO" ;
      edtTran_RegionCodigoDestino_Internalname = sPrefix+"TRAN_REGIONCODIGODESTINO" ;
      edtTran_RegionDescripcionDestino_Internalname = sPrefix+"TRAN_REGIONDESCRIPCIONDESTINO" ;
      cmbTran_TipoEntra.setInternalname( sPrefix+"TRAN_TIPOENTRA" );
      edtTran_CantidadPadres_Internalname = sPrefix+"TRAN_CANTIDADPADRES" ;
      edtTran_IdProveedor_Internalname = sPrefix+"TRAN_IDPROVEEDOR" ;
      edtTran_RegionAbrev_Internalname = sPrefix+"TRAN_REGIONABREV" ;
      edtTran_RegionAbrevDestino_Internalname = sPrefix+"TRAN_REGIONABREVDESTINO" ;
      edtTran_Detalle_Internalname = sPrefix+"TRAN_DETALLE" ;
      edtTran_NumeroGrupo_Internalname = sPrefix+"TRAN_NUMEROGRUPO" ;
      edtTran_UsuarioEliminaoAnula_Internalname = sPrefix+"TRAN_USUARIOELIMINAOANULA" ;
      edtTran_FechaEliminaoAnula_Internalname = sPrefix+"TRAN_FECHAELIMINAOANULA" ;
      edtTran_ObservacionesAnula_Internalname = sPrefix+"TRAN_OBSERVACIONESANULA" ;
      edtTran_NombCuentadanteOrigen_Internalname = sPrefix+"TRAN_NOMBCUENTADANTEORIGEN" ;
      edtTran_NombreProveedor_Internalname = sPrefix+"TRAN_NOMBREPROVEEDOR" ;
      edtTran_NombCuentadanteDestino_Internalname = sPrefix+"TRAN_NOMBCUENTADANTEDESTINO" ;
      edtTran_NombreIngreso_Internalname = sPrefix+"TRAN_NOMBREINGRESO" ;
      edtTran_CedulaCuentadanteOrigen_Internalname = sPrefix+"TRAN_CEDULACUENTADANTEORIGEN" ;
      edtTran_CedulaProveedor_Internalname = sPrefix+"TRAN_CEDULAPROVEEDOR" ;
      edtTran_CedulaCuentadanteDestino_Internalname = sPrefix+"TRAN_CEDULACUENTADANTEDESTINO" ;
      cmbTran_SolicitaCCDestino.setInternalname( sPrefix+"TRAN_SOLICITACCDESTINO" );
      cmbTran_SolicitaRegionDestino.setInternalname( sPrefix+"TRAN_SOLICITAREGIONDESTINO" );
      edtTran_EmailCuentadanteOrigen_Internalname = sPrefix+"TRAN_EMAILCUENTADANTEORIGEN" ;
      edtTran_EmailCuentadanteDestino_Internalname = sPrefix+"TRAN_EMAILCUENTADANTEDESTINO" ;
      edtTran_IdCuentadanteResponsabili_Internalname = sPrefix+"TRAN_IDCUENTADANTERESPONSABILI" ;
      edtTran_NombreCuentadanteResponsa_Internalname = sPrefix+"TRAN_NOMBRECUENTADANTERESPONSA" ;
      edtTran_TransaccResponsabilidad_Internalname = sPrefix+"TRAN_TRANSACCRESPONSABILIDAD" ;
      edtTran_FechaResponsabilidad_Internalname = sPrefix+"TRAN_FECHARESPONSABILIDAD" ;
      cmbTran_CuentaResponsabilidad.setInternalname( sPrefix+"TRAN_CUENTARESPONSABILIDAD" );
      edtTran_Abreviado_Internalname = sPrefix+"TRAN_ABREVIADO" ;
      edtTran_TablaResponsabilidad_Internalname = sPrefix+"TRAN_TABLARESPONSABILIDAD" ;
      edtTran_CedulaResponsabilidad_Internalname = sPrefix+"TRAN_CEDULARESPONSABILIDAD" ;
      cmbTran_EntidadGobierno.setInternalname( sPrefix+"TRAN_ENTIDADGOBIERNO" );
      divAttributestable_Internalname = sPrefix+"ATTRIBUTESTABLE" ;
      edtTran_Id_Internalname = sPrefix+"TRAN_ID" ;
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
      edtTran_Id_Jsonclick = "" ;
      edtTran_Id_Enabled = 0 ;
      edtTran_Id_Visible = 1 ;
      cmbTran_EntidadGobierno.setJsonclick( "" );
      cmbTran_EntidadGobierno.setEnabled( 0 );
      edtTran_CedulaResponsabilidad_Jsonclick = "" ;
      edtTran_CedulaResponsabilidad_Enabled = 0 ;
      edtTran_TablaResponsabilidad_Jsonclick = "" ;
      edtTran_TablaResponsabilidad_Enabled = 0 ;
      edtTran_Abreviado_Jsonclick = "" ;
      edtTran_Abreviado_Enabled = 0 ;
      cmbTran_CuentaResponsabilidad.setJsonclick( "" );
      cmbTran_CuentaResponsabilidad.setEnabled( 0 );
      edtTran_FechaResponsabilidad_Jsonclick = "" ;
      edtTran_FechaResponsabilidad_Enabled = 0 ;
      edtTran_TransaccResponsabilidad_Jsonclick = "" ;
      edtTran_TransaccResponsabilidad_Enabled = 0 ;
      edtTran_NombreCuentadanteResponsa_Jsonclick = "" ;
      edtTran_NombreCuentadanteResponsa_Enabled = 0 ;
      edtTran_IdCuentadanteResponsabili_Jsonclick = "" ;
      edtTran_IdCuentadanteResponsabili_Enabled = 0 ;
      edtTran_EmailCuentadanteDestino_Jsonclick = "" ;
      edtTran_EmailCuentadanteDestino_Enabled = 0 ;
      edtTran_EmailCuentadanteOrigen_Jsonclick = "" ;
      edtTran_EmailCuentadanteOrigen_Enabled = 0 ;
      cmbTran_SolicitaRegionDestino.setJsonclick( "" );
      cmbTran_SolicitaRegionDestino.setEnabled( 0 );
      cmbTran_SolicitaCCDestino.setJsonclick( "" );
      cmbTran_SolicitaCCDestino.setEnabled( 0 );
      edtTran_CedulaCuentadanteDestino_Jsonclick = "" ;
      edtTran_CedulaCuentadanteDestino_Enabled = 0 ;
      edtTran_CedulaProveedor_Jsonclick = "" ;
      edtTran_CedulaProveedor_Enabled = 0 ;
      edtTran_CedulaCuentadanteOrigen_Jsonclick = "" ;
      edtTran_CedulaCuentadanteOrigen_Enabled = 0 ;
      edtTran_NombreIngreso_Jsonclick = "" ;
      edtTran_NombreIngreso_Enabled = 0 ;
      edtTran_NombCuentadanteDestino_Jsonclick = "" ;
      edtTran_NombCuentadanteDestino_Enabled = 0 ;
      edtTran_NombreProveedor_Jsonclick = "" ;
      edtTran_NombreProveedor_Enabled = 0 ;
      edtTran_NombCuentadanteOrigen_Jsonclick = "" ;
      edtTran_NombCuentadanteOrigen_Enabled = 0 ;
      edtTran_ObservacionesAnula_Enabled = 0 ;
      edtTran_FechaEliminaoAnula_Jsonclick = "" ;
      edtTran_FechaEliminaoAnula_Enabled = 0 ;
      edtTran_UsuarioEliminaoAnula_Jsonclick = "" ;
      edtTran_UsuarioEliminaoAnula_Enabled = 0 ;
      edtTran_NumeroGrupo_Jsonclick = "" ;
      edtTran_NumeroGrupo_Enabled = 0 ;
      edtTran_Detalle_Jsonclick = "" ;
      edtTran_Detalle_Enabled = 0 ;
      edtTran_RegionAbrevDestino_Jsonclick = "" ;
      edtTran_RegionAbrevDestino_Enabled = 0 ;
      edtTran_RegionAbrev_Jsonclick = "" ;
      edtTran_RegionAbrev_Enabled = 0 ;
      edtTran_IdProveedor_Jsonclick = "" ;
      edtTran_IdProveedor_Enabled = 0 ;
      edtTran_CantidadPadres_Jsonclick = "" ;
      edtTran_CantidadPadres_Enabled = 0 ;
      cmbTran_TipoEntra.setJsonclick( "" );
      cmbTran_TipoEntra.setEnabled( 0 );
      edtTran_RegionDescripcionDestino_Jsonclick = "" ;
      edtTran_RegionDescripcionDestino_Enabled = 0 ;
      edtTran_RegionCodigoDestino_Jsonclick = "" ;
      edtTran_RegionCodigoDestino_Enabled = 0 ;
      edtTran_RegionIdDestino_Jsonclick = "" ;
      edtTran_RegionIdDestino_Enabled = 0 ;
      edtTran_CentroCostoDescripcionDes_Jsonclick = "" ;
      edtTran_CentroCostoDescripcionDes_Enabled = 0 ;
      edtTran_CentroCostoCodigoDestino_Jsonclick = "" ;
      edtTran_CentroCostoCodigoDestino_Enabled = 0 ;
      edtTran_CentroCostoIdDestino_Jsonclick = "" ;
      edtTran_CentroCostoIdDestino_Enabled = 0 ;
      edtTran_FechaIngreso_Jsonclick = "" ;
      edtTran_FechaIngreso_Enabled = 0 ;
      edtTran_NumeroIngreso_Jsonclick = "" ;
      edtTran_NumeroIngreso_Enabled = 0 ;
      cmbTran_TipoIngreso.setJsonclick( "" );
      cmbTran_TipoIngreso.setEnabled( 0 );
      cmbTran_TipoElemento.setJsonclick( "" );
      cmbTran_TipoElemento.setEnabled( 0 );
      edtTran_CodTipoElemento_Jsonclick = "" ;
      edtTran_CodTipoElemento_Enabled = 0 ;
      edtTran_NumeroLineas_Jsonclick = "" ;
      edtTran_NumeroLineas_Enabled = 0 ;
      edtTran_ValorTransaccion_Jsonclick = "" ;
      edtTran_ValorTransaccion_Enabled = 0 ;
      cmbTran_IndE_S.setJsonclick( "" );
      cmbTran_IndE_S.setEnabled( 0 );
      cmbTran_IndCurso.setJsonclick( "" );
      cmbTran_IndCurso.setEnabled( 0 );
      cmbTran_IndAreadante.setJsonclick( "" );
      cmbTran_IndAreadante.setEnabled( 0 );
      edtTran_CursoCodigo_Jsonclick = "" ;
      edtTran_CursoCodigo_Enabled = 0 ;
      edtTran_AreadanteCodigo_Jsonclick = "" ;
      edtTran_AreadanteCodigo_Enabled = 0 ;
      edtTran_RegionDescripcion_Jsonclick = "" ;
      edtTran_RegionDescripcion_Enabled = 0 ;
      edtTran_RegionCodigo_Jsonclick = "" ;
      edtTran_RegionCodigo_Enabled = 0 ;
      edtTran_RegionId_Jsonclick = "" ;
      edtTran_RegionId_Enabled = 0 ;
      edtTran_CentroCostoDescripcion_Jsonclick = "" ;
      edtTran_CentroCostoDescripcion_Enabled = 0 ;
      edtTran_CentroCostoCodigo_Jsonclick = "" ;
      edtTran_CentroCostoCodigo_Enabled = 0 ;
      edtTran_CentroCostoId_Jsonclick = "" ;
      edtTran_CentroCostoId_Enabled = 0 ;
      edtTran_UsuarioNombre_Jsonclick = "" ;
      edtTran_UsuarioNombre_Enabled = 0 ;
      edtTran_UsuarioCodigo_Jsonclick = "" ;
      edtTran_UsuarioCodigo_Enabled = 0 ;
      edtTran_UsuarioId_Jsonclick = "" ;
      edtTran_UsuarioId_Enabled = 0 ;
      edtTran_Observaciones_Enabled = 0 ;
      edtTran_DescripcionMovimiento_Jsonclick = "" ;
      edtTran_DescripcionMovimiento_Enabled = 0 ;
      edtTran_UsuarioRatifica_Jsonclick = "" ;
      edtTran_UsuarioRatifica_Enabled = 0 ;
      edtTran_FechaRatificacion_Jsonclick = "" ;
      edtTran_FechaRatificacion_Enabled = 0 ;
      edtTran_IdCuentadanteDestino_Jsonclick = "" ;
      edtTran_IdCuentadanteDestino_Enabled = 0 ;
      edtTran_CodBodeDestino_Jsonclick = "" ;
      edtTran_CodBodeDestino_Enabled = 0 ;
      edtTran_CodAlmaDestino_Jsonclick = "" ;
      edtTran_CodAlmaDestino_Enabled = 0 ;
      edtTran_ModuloDestino_Jsonclick = "" ;
      edtTran_ModuloDestino_Enabled = 0 ;
      edtTran_IdCuentadanteOrigen_Jsonclick = "" ;
      edtTran_IdCuentadanteOrigen_Enabled = 0 ;
      edtTran_CodBodeOrigen_Jsonclick = "" ;
      edtTran_CodBodeOrigen_Enabled = 0 ;
      cmbTran_Estado.setJsonclick( "" );
      cmbTran_Estado.setEnabled( 0 );
      edtTran_CodAlmaOrigen_Jsonclick = "" ;
      edtTran_CodAlmaOrigen_Enabled = 0 ;
      edtTran_ModuloOrigen_Jsonclick = "" ;
      edtTran_ModuloOrigen_Enabled = 0 ;
      edtTran_FechaRegistro_Jsonclick = "" ;
      edtTran_FechaRegistro_Enabled = 0 ;
      edtTran_CodigoMovimiento_Jsonclick = "" ;
      edtTran_CodigoMovimiento_Enabled = 0 ;
      edtTran_ConsecutivoCC_Jsonclick = "" ;
      edtTran_ConsecutivoCC_Enabled = 0 ;
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
      setEventMetadata("'DOUPDATE'","{handler:'e110X1',iparms:[{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e120X1',iparms:[{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0}],oparms:[]}");
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
      A49Tran_CodigoMovimiento = "" ;
      A55Tran_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      A110Tran_ModuloOrigen = "" ;
      A109Tran_CodAlmaOrigen = "" ;
      A58Tran_Estado = "" ;
      A112Tran_CodBodeOrigen = "" ;
      A385Tran_ModuloDestino = "" ;
      A111Tran_CodAlmaDestino = "" ;
      A387Tran_CodBodeDestino = "" ;
      A390Tran_FechaRatificacion = GXutil.resetTime( GXutil.nullDate() );
      A391Tran_UsuarioRatifica = "" ;
      A416Tran_Observaciones = "" ;
      A407Tran_AreadanteCodigo = "" ;
      A408Tran_CursoCodigo = "" ;
      A481Tran_IndE_S = "" ;
      A483Tran_ValorTransaccion = DecimalUtil.ZERO ;
      A482Tran_TipoElemento = "" ;
      A514Tran_NumeroIngreso = "" ;
      A515Tran_FechaIngreso = GXutil.nullDate() ;
      A527Tran_TipoEntra = "" ;
      A524Tran_Detalle = "" ;
      A668Tran_UsuarioEliminaoAnula = "" ;
      A669Tran_FechaEliminaoAnula = GXutil.resetTime( GXutil.nullDate() );
      A670Tran_ObservacionesAnula = "" ;
      A720Tran_FechaResponsabilidad = GXutil.nullDate() ;
      A859Tran_EntidadGobierno = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      A381Tran_DescripcionMovimiento = "" ;
      A417Tran_UsuarioCodigo = "" ;
      A418Tran_UsuarioNombre = "" ;
      A419Tran_CentroCostoCodigo = "" ;
      A420Tran_CentroCostoDescripcion = "" ;
      A422Tran_RegionDescripcion = "" ;
      A478Tran_IndAreadante = "" ;
      A479Tran_IndCurso = "" ;
      A516Tran_CentroCostoCodigoDestino = "" ;
      A517Tran_CentroCostoDescripcionDes = "" ;
      A520Tran_RegionDescripcionDestino = "" ;
      A594Tran_RegionAbrev = "" ;
      A608Tran_RegionAbrevDestino = "" ;
      A384Tran_NombCuentadanteOrigen = "" ;
      A575Tran_NombreProveedor = "" ;
      A389Tran_NombCuentadanteDestino = "" ;
      A672Tran_NombreIngreso = "" ;
      A707Tran_SolicitaCCDestino = "" ;
      A708Tran_SolicitaRegionDestino = "" ;
      A714Tran_EmailCuentadanteOrigen = "" ;
      A715Tran_EmailCuentadanteDestino = "" ;
      A721Tran_NombreCuentadanteResponsa = "" ;
      A754Tran_CuentaResponsabilidad = "" ;
      A756Tran_Abreviado = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV14Pgmname = "" ;
      scmdbuf = "" ;
      H000X2_A416Tran_Observaciones = new String[] {""} ;
      H000X2_n416Tran_Observaciones = new boolean[] {false} ;
      H000X2_A46Tran_Id = new long[1] ;
      H000X2_A859Tran_EntidadGobierno = new String[] {""} ;
      H000X2_n859Tran_EntidadGobierno = new boolean[] {false} ;
      H000X2_A759Tran_CedulaResponsabilidad = new long[1] ;
      H000X2_n759Tran_CedulaResponsabilidad = new boolean[] {false} ;
      H000X2_A758Tran_TablaResponsabilidad = new short[1] ;
      H000X2_n758Tran_TablaResponsabilidad = new boolean[] {false} ;
      H000X2_A756Tran_Abreviado = new String[] {""} ;
      H000X2_n756Tran_Abreviado = new boolean[] {false} ;
      H000X2_A754Tran_CuentaResponsabilidad = new String[] {""} ;
      H000X2_n754Tran_CuentaResponsabilidad = new boolean[] {false} ;
      H000X2_A720Tran_FechaResponsabilidad = new java.util.Date[] {GXutil.nullDate()} ;
      H000X2_n720Tran_FechaResponsabilidad = new boolean[] {false} ;
      H000X2_A719Tran_TransaccResponsabilidad = new long[1] ;
      H000X2_n719Tran_TransaccResponsabilidad = new boolean[] {false} ;
      H000X2_A721Tran_NombreCuentadanteResponsa = new String[] {""} ;
      H000X2_n721Tran_NombreCuentadanteResponsa = new boolean[] {false} ;
      H000X2_A56Tran_IdCuentadanteResponsabili = new long[1] ;
      H000X2_n56Tran_IdCuentadanteResponsabili = new boolean[] {false} ;
      H000X2_A715Tran_EmailCuentadanteDestino = new String[] {""} ;
      H000X2_n715Tran_EmailCuentadanteDestino = new boolean[] {false} ;
      H000X2_A714Tran_EmailCuentadanteOrigen = new String[] {""} ;
      H000X2_n714Tran_EmailCuentadanteOrigen = new boolean[] {false} ;
      H000X2_A708Tran_SolicitaRegionDestino = new String[] {""} ;
      H000X2_n708Tran_SolicitaRegionDestino = new boolean[] {false} ;
      H000X2_A707Tran_SolicitaCCDestino = new String[] {""} ;
      H000X2_n707Tran_SolicitaCCDestino = new boolean[] {false} ;
      H000X2_A704Tran_CedulaCuentadanteDestino = new long[1] ;
      H000X2_n704Tran_CedulaCuentadanteDestino = new boolean[] {false} ;
      H000X2_A703Tran_CedulaProveedor = new long[1] ;
      H000X2_n703Tran_CedulaProveedor = new boolean[] {false} ;
      H000X2_A702Tran_CedulaCuentadanteOrigen = new long[1] ;
      H000X2_n702Tran_CedulaCuentadanteOrigen = new boolean[] {false} ;
      H000X2_A672Tran_NombreIngreso = new String[] {""} ;
      H000X2_n672Tran_NombreIngreso = new boolean[] {false} ;
      H000X2_A389Tran_NombCuentadanteDestino = new String[] {""} ;
      H000X2_n389Tran_NombCuentadanteDestino = new boolean[] {false} ;
      H000X2_A575Tran_NombreProveedor = new String[] {""} ;
      H000X2_n575Tran_NombreProveedor = new boolean[] {false} ;
      H000X2_A384Tran_NombCuentadanteOrigen = new String[] {""} ;
      H000X2_n384Tran_NombCuentadanteOrigen = new boolean[] {false} ;
      H000X2_A670Tran_ObservacionesAnula = new String[] {""} ;
      H000X2_n670Tran_ObservacionesAnula = new boolean[] {false} ;
      H000X2_A669Tran_FechaEliminaoAnula = new java.util.Date[] {GXutil.nullDate()} ;
      H000X2_n669Tran_FechaEliminaoAnula = new boolean[] {false} ;
      H000X2_A668Tran_UsuarioEliminaoAnula = new String[] {""} ;
      H000X2_n668Tran_UsuarioEliminaoAnula = new boolean[] {false} ;
      H000X2_A667Tran_NumeroGrupo = new short[1] ;
      H000X2_n667Tran_NumeroGrupo = new boolean[] {false} ;
      H000X2_A524Tran_Detalle = new String[] {""} ;
      H000X2_n524Tran_Detalle = new boolean[] {false} ;
      H000X2_A608Tran_RegionAbrevDestino = new String[] {""} ;
      H000X2_n608Tran_RegionAbrevDestino = new boolean[] {false} ;
      H000X2_A594Tran_RegionAbrev = new String[] {""} ;
      H000X2_n594Tran_RegionAbrev = new boolean[] {false} ;
      H000X2_A53Tran_IdProveedor = new long[1] ;
      H000X2_n53Tran_IdProveedor = new boolean[] {false} ;
      H000X2_A568Tran_CantidadPadres = new int[1] ;
      H000X2_n568Tran_CantidadPadres = new boolean[] {false} ;
      H000X2_A527Tran_TipoEntra = new String[] {""} ;
      H000X2_n527Tran_TipoEntra = new boolean[] {false} ;
      H000X2_A520Tran_RegionDescripcionDestino = new String[] {""} ;
      H000X2_n520Tran_RegionDescripcionDestino = new boolean[] {false} ;
      H000X2_A519Tran_RegionCodigoDestino = new short[1] ;
      H000X2_n519Tran_RegionCodigoDestino = new boolean[] {false} ;
      H000X2_A518Tran_RegionIdDestino = new long[1] ;
      H000X2_n518Tran_RegionIdDestino = new boolean[] {false} ;
      H000X2_A517Tran_CentroCostoDescripcionDes = new String[] {""} ;
      H000X2_n517Tran_CentroCostoDescripcionDes = new boolean[] {false} ;
      H000X2_A516Tran_CentroCostoCodigoDestino = new String[] {""} ;
      H000X2_n516Tran_CentroCostoCodigoDestino = new boolean[] {false} ;
      H000X2_A50Tran_CentroCostoIdDestino = new long[1] ;
      H000X2_n50Tran_CentroCostoIdDestino = new boolean[] {false} ;
      H000X2_A515Tran_FechaIngreso = new java.util.Date[] {GXutil.nullDate()} ;
      H000X2_n515Tran_FechaIngreso = new boolean[] {false} ;
      H000X2_A514Tran_NumeroIngreso = new String[] {""} ;
      H000X2_n514Tran_NumeroIngreso = new boolean[] {false} ;
      H000X2_A54Tran_TipoIngreso = new long[1] ;
      H000X2_n54Tran_TipoIngreso = new boolean[] {false} ;
      H000X2_A482Tran_TipoElemento = new String[] {""} ;
      H000X2_A499Tran_CodTipoElemento = new long[1] ;
      H000X2_n499Tran_CodTipoElemento = new boolean[] {false} ;
      H000X2_A498Tran_NumeroLineas = new long[1] ;
      H000X2_n498Tran_NumeroLineas = new boolean[] {false} ;
      H000X2_A483Tran_ValorTransaccion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H000X2_n483Tran_ValorTransaccion = new boolean[] {false} ;
      H000X2_A481Tran_IndE_S = new String[] {""} ;
      H000X2_n481Tran_IndE_S = new boolean[] {false} ;
      H000X2_A479Tran_IndCurso = new String[] {""} ;
      H000X2_n479Tran_IndCurso = new boolean[] {false} ;
      H000X2_A478Tran_IndAreadante = new String[] {""} ;
      H000X2_n478Tran_IndAreadante = new boolean[] {false} ;
      H000X2_A408Tran_CursoCodigo = new String[] {""} ;
      H000X2_n408Tran_CursoCodigo = new boolean[] {false} ;
      H000X2_A407Tran_AreadanteCodigo = new String[] {""} ;
      H000X2_n407Tran_AreadanteCodigo = new boolean[] {false} ;
      H000X2_A422Tran_RegionDescripcion = new String[] {""} ;
      H000X2_n422Tran_RegionDescripcion = new boolean[] {false} ;
      H000X2_A421Tran_RegionCodigo = new short[1] ;
      H000X2_n421Tran_RegionCodigo = new boolean[] {false} ;
      H000X2_A57Tran_RegionId = new long[1] ;
      H000X2_n57Tran_RegionId = new boolean[] {false} ;
      H000X2_A420Tran_CentroCostoDescripcion = new String[] {""} ;
      H000X2_n420Tran_CentroCostoDescripcion = new boolean[] {false} ;
      H000X2_A419Tran_CentroCostoCodigo = new String[] {""} ;
      H000X2_n419Tran_CentroCostoCodigo = new boolean[] {false} ;
      H000X2_A48Tran_CentroCostoId = new long[1] ;
      H000X2_A418Tran_UsuarioNombre = new String[] {""} ;
      H000X2_n418Tran_UsuarioNombre = new boolean[] {false} ;
      H000X2_A417Tran_UsuarioCodigo = new String[] {""} ;
      H000X2_n417Tran_UsuarioCodigo = new boolean[] {false} ;
      H000X2_A47Tran_UsuarioId = new long[1] ;
      H000X2_n47Tran_UsuarioId = new boolean[] {false} ;
      H000X2_A381Tran_DescripcionMovimiento = new String[] {""} ;
      H000X2_n381Tran_DescripcionMovimiento = new boolean[] {false} ;
      H000X2_A391Tran_UsuarioRatifica = new String[] {""} ;
      H000X2_n391Tran_UsuarioRatifica = new boolean[] {false} ;
      H000X2_A390Tran_FechaRatificacion = new java.util.Date[] {GXutil.nullDate()} ;
      H000X2_n390Tran_FechaRatificacion = new boolean[] {false} ;
      H000X2_A52Tran_IdCuentadanteDestino = new long[1] ;
      H000X2_n52Tran_IdCuentadanteDestino = new boolean[] {false} ;
      H000X2_A387Tran_CodBodeDestino = new String[] {""} ;
      H000X2_A111Tran_CodAlmaDestino = new String[] {""} ;
      H000X2_A385Tran_ModuloDestino = new String[] {""} ;
      H000X2_A51Tran_IdCuentadanteOrigen = new long[1] ;
      H000X2_n51Tran_IdCuentadanteOrigen = new boolean[] {false} ;
      H000X2_A112Tran_CodBodeOrigen = new String[] {""} ;
      H000X2_A58Tran_Estado = new String[] {""} ;
      H000X2_n58Tran_Estado = new boolean[] {false} ;
      H000X2_A109Tran_CodAlmaOrigen = new String[] {""} ;
      H000X2_A110Tran_ModuloOrigen = new String[] {""} ;
      H000X2_A55Tran_FechaRegistro = new java.util.Date[] {GXutil.nullDate()} ;
      H000X2_A49Tran_CodigoMovimiento = new String[] {""} ;
      H000X2_A513Tran_ConsecutivoCC = new long[1] ;
      H000X2_n513Tran_ConsecutivoCC = new boolean[] {false} ;
      AV8TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11HTTPRequest = httpContext.getHttpRequest();
      AV9TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV10Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA46Tran_Id = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_transacciongeneral__default(),
         new Object[] {
             new Object[] {
            H000X2_A416Tran_Observaciones, H000X2_n416Tran_Observaciones, H000X2_A46Tran_Id, H000X2_A859Tran_EntidadGobierno, H000X2_n859Tran_EntidadGobierno, H000X2_A759Tran_CedulaResponsabilidad, H000X2_n759Tran_CedulaResponsabilidad, H000X2_A758Tran_TablaResponsabilidad, H000X2_n758Tran_TablaResponsabilidad, H000X2_A756Tran_Abreviado,
            H000X2_n756Tran_Abreviado, H000X2_A754Tran_CuentaResponsabilidad, H000X2_n754Tran_CuentaResponsabilidad, H000X2_A720Tran_FechaResponsabilidad, H000X2_n720Tran_FechaResponsabilidad, H000X2_A719Tran_TransaccResponsabilidad, H000X2_n719Tran_TransaccResponsabilidad, H000X2_A721Tran_NombreCuentadanteResponsa, H000X2_n721Tran_NombreCuentadanteResponsa, H000X2_A56Tran_IdCuentadanteResponsabili,
            H000X2_n56Tran_IdCuentadanteResponsabili, H000X2_A715Tran_EmailCuentadanteDestino, H000X2_n715Tran_EmailCuentadanteDestino, H000X2_A714Tran_EmailCuentadanteOrigen, H000X2_n714Tran_EmailCuentadanteOrigen, H000X2_A708Tran_SolicitaRegionDestino, H000X2_n708Tran_SolicitaRegionDestino, H000X2_A707Tran_SolicitaCCDestino, H000X2_n707Tran_SolicitaCCDestino, H000X2_A704Tran_CedulaCuentadanteDestino,
            H000X2_n704Tran_CedulaCuentadanteDestino, H000X2_A703Tran_CedulaProveedor, H000X2_n703Tran_CedulaProveedor, H000X2_A702Tran_CedulaCuentadanteOrigen, H000X2_n702Tran_CedulaCuentadanteOrigen, H000X2_A672Tran_NombreIngreso, H000X2_n672Tran_NombreIngreso, H000X2_A389Tran_NombCuentadanteDestino, H000X2_n389Tran_NombCuentadanteDestino, H000X2_A575Tran_NombreProveedor,
            H000X2_n575Tran_NombreProveedor, H000X2_A384Tran_NombCuentadanteOrigen, H000X2_n384Tran_NombCuentadanteOrigen, H000X2_A670Tran_ObservacionesAnula, H000X2_n670Tran_ObservacionesAnula, H000X2_A669Tran_FechaEliminaoAnula, H000X2_n669Tran_FechaEliminaoAnula, H000X2_A668Tran_UsuarioEliminaoAnula, H000X2_n668Tran_UsuarioEliminaoAnula, H000X2_A667Tran_NumeroGrupo,
            H000X2_n667Tran_NumeroGrupo, H000X2_A524Tran_Detalle, H000X2_n524Tran_Detalle, H000X2_A608Tran_RegionAbrevDestino, H000X2_n608Tran_RegionAbrevDestino, H000X2_A594Tran_RegionAbrev, H000X2_n594Tran_RegionAbrev, H000X2_A53Tran_IdProveedor, H000X2_n53Tran_IdProveedor, H000X2_A568Tran_CantidadPadres,
            H000X2_n568Tran_CantidadPadres, H000X2_A527Tran_TipoEntra, H000X2_n527Tran_TipoEntra, H000X2_A520Tran_RegionDescripcionDestino, H000X2_n520Tran_RegionDescripcionDestino, H000X2_A519Tran_RegionCodigoDestino, H000X2_n519Tran_RegionCodigoDestino, H000X2_A518Tran_RegionIdDestino, H000X2_n518Tran_RegionIdDestino, H000X2_A517Tran_CentroCostoDescripcionDes,
            H000X2_n517Tran_CentroCostoDescripcionDes, H000X2_A516Tran_CentroCostoCodigoDestino, H000X2_n516Tran_CentroCostoCodigoDestino, H000X2_A50Tran_CentroCostoIdDestino, H000X2_n50Tran_CentroCostoIdDestino, H000X2_A515Tran_FechaIngreso, H000X2_n515Tran_FechaIngreso, H000X2_A514Tran_NumeroIngreso, H000X2_n514Tran_NumeroIngreso, H000X2_A54Tran_TipoIngreso,
            H000X2_n54Tran_TipoIngreso, H000X2_A482Tran_TipoElemento, H000X2_A499Tran_CodTipoElemento, H000X2_n499Tran_CodTipoElemento, H000X2_A498Tran_NumeroLineas, H000X2_n498Tran_NumeroLineas, H000X2_A483Tran_ValorTransaccion, H000X2_n483Tran_ValorTransaccion, H000X2_A481Tran_IndE_S, H000X2_n481Tran_IndE_S,
            H000X2_A479Tran_IndCurso, H000X2_n479Tran_IndCurso, H000X2_A478Tran_IndAreadante, H000X2_n478Tran_IndAreadante, H000X2_A408Tran_CursoCodigo, H000X2_n408Tran_CursoCodigo, H000X2_A407Tran_AreadanteCodigo, H000X2_n407Tran_AreadanteCodigo, H000X2_A422Tran_RegionDescripcion, H000X2_n422Tran_RegionDescripcion,
            H000X2_A421Tran_RegionCodigo, H000X2_n421Tran_RegionCodigo, H000X2_A57Tran_RegionId, H000X2_n57Tran_RegionId, H000X2_A420Tran_CentroCostoDescripcion, H000X2_n420Tran_CentroCostoDescripcion, H000X2_A419Tran_CentroCostoCodigo, H000X2_n419Tran_CentroCostoCodigo, H000X2_A48Tran_CentroCostoId, H000X2_A418Tran_UsuarioNombre,
            H000X2_n418Tran_UsuarioNombre, H000X2_A417Tran_UsuarioCodigo, H000X2_n417Tran_UsuarioCodigo, H000X2_A47Tran_UsuarioId, H000X2_n47Tran_UsuarioId, H000X2_A381Tran_DescripcionMovimiento, H000X2_n381Tran_DescripcionMovimiento, H000X2_A391Tran_UsuarioRatifica, H000X2_n391Tran_UsuarioRatifica, H000X2_A390Tran_FechaRatificacion,
            H000X2_n390Tran_FechaRatificacion, H000X2_A52Tran_IdCuentadanteDestino, H000X2_n52Tran_IdCuentadanteDestino, H000X2_A387Tran_CodBodeDestino, H000X2_A111Tran_CodAlmaDestino, H000X2_A385Tran_ModuloDestino, H000X2_A51Tran_IdCuentadanteOrigen, H000X2_n51Tran_IdCuentadanteOrigen, H000X2_A112Tran_CodBodeOrigen, H000X2_A58Tran_Estado,
            H000X2_n58Tran_Estado, H000X2_A109Tran_CodAlmaOrigen, H000X2_A110Tran_ModuloOrigen, H000X2_A55Tran_FechaRegistro, H000X2_A49Tran_CodigoMovimiento, H000X2_A513Tran_ConsecutivoCC, H000X2_n513Tran_ConsecutivoCC
            }
         }
      );
      AV14Pgmname = "ALM_TRANSACCIONGeneral" ;
      /* GeneXus formulas. */
      AV14Pgmname = "ALM_TRANSACCIONGeneral" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short A667Tran_NumeroGrupo ;
   private short A758Tran_TablaResponsabilidad ;
   private short wbEnd ;
   private short wbStart ;
   private short A421Tran_RegionCodigo ;
   private short A519Tran_RegionCodigoDestino ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int A568Tran_CantidadPadres ;
   private int edtTran_ConsecutivoCC_Enabled ;
   private int edtTran_CodigoMovimiento_Enabled ;
   private int edtTran_FechaRegistro_Enabled ;
   private int edtTran_ModuloOrigen_Enabled ;
   private int edtTran_CodAlmaOrigen_Enabled ;
   private int edtTran_CodBodeOrigen_Enabled ;
   private int edtTran_IdCuentadanteOrigen_Enabled ;
   private int edtTran_ModuloDestino_Enabled ;
   private int edtTran_CodAlmaDestino_Enabled ;
   private int edtTran_CodBodeDestino_Enabled ;
   private int edtTran_IdCuentadanteDestino_Enabled ;
   private int edtTran_FechaRatificacion_Enabled ;
   private int edtTran_UsuarioRatifica_Enabled ;
   private int edtTran_DescripcionMovimiento_Enabled ;
   private int edtTran_Observaciones_Enabled ;
   private int edtTran_UsuarioId_Enabled ;
   private int edtTran_UsuarioCodigo_Enabled ;
   private int edtTran_UsuarioNombre_Enabled ;
   private int edtTran_CentroCostoId_Enabled ;
   private int edtTran_CentroCostoCodigo_Enabled ;
   private int edtTran_CentroCostoDescripcion_Enabled ;
   private int edtTran_RegionId_Enabled ;
   private int edtTran_RegionCodigo_Enabled ;
   private int edtTran_RegionDescripcion_Enabled ;
   private int edtTran_AreadanteCodigo_Enabled ;
   private int edtTran_CursoCodigo_Enabled ;
   private int edtTran_ValorTransaccion_Enabled ;
   private int edtTran_NumeroLineas_Enabled ;
   private int edtTran_CodTipoElemento_Enabled ;
   private int edtTran_NumeroIngreso_Enabled ;
   private int edtTran_FechaIngreso_Enabled ;
   private int edtTran_CentroCostoIdDestino_Enabled ;
   private int edtTran_CentroCostoCodigoDestino_Enabled ;
   private int edtTran_CentroCostoDescripcionDes_Enabled ;
   private int edtTran_RegionIdDestino_Enabled ;
   private int edtTran_RegionCodigoDestino_Enabled ;
   private int edtTran_RegionDescripcionDestino_Enabled ;
   private int edtTran_CantidadPadres_Enabled ;
   private int edtTran_IdProveedor_Enabled ;
   private int edtTran_RegionAbrev_Enabled ;
   private int edtTran_RegionAbrevDestino_Enabled ;
   private int edtTran_Detalle_Enabled ;
   private int edtTran_NumeroGrupo_Enabled ;
   private int edtTran_UsuarioEliminaoAnula_Enabled ;
   private int edtTran_FechaEliminaoAnula_Enabled ;
   private int edtTran_ObservacionesAnula_Enabled ;
   private int edtTran_NombCuentadanteOrigen_Enabled ;
   private int edtTran_NombreProveedor_Enabled ;
   private int edtTran_NombCuentadanteDestino_Enabled ;
   private int edtTran_NombreIngreso_Enabled ;
   private int edtTran_CedulaCuentadanteOrigen_Enabled ;
   private int edtTran_CedulaProveedor_Enabled ;
   private int edtTran_CedulaCuentadanteDestino_Enabled ;
   private int edtTran_EmailCuentadanteOrigen_Enabled ;
   private int edtTran_EmailCuentadanteDestino_Enabled ;
   private int edtTran_IdCuentadanteResponsabili_Enabled ;
   private int edtTran_NombreCuentadanteResponsa_Enabled ;
   private int edtTran_TransaccResponsabilidad_Enabled ;
   private int edtTran_FechaResponsabilidad_Enabled ;
   private int edtTran_Abreviado_Enabled ;
   private int edtTran_TablaResponsabilidad_Enabled ;
   private int edtTran_CedulaResponsabilidad_Enabled ;
   private int edtTran_Id_Enabled ;
   private int edtTran_Id_Visible ;
   private int idxLst ;
   private long wcpOA46Tran_Id ;
   private long A46Tran_Id ;
   private long A513Tran_ConsecutivoCC ;
   private long A51Tran_IdCuentadanteOrigen ;
   private long A52Tran_IdCuentadanteDestino ;
   private long A47Tran_UsuarioId ;
   private long A48Tran_CentroCostoId ;
   private long A57Tran_RegionId ;
   private long A498Tran_NumeroLineas ;
   private long A54Tran_TipoIngreso ;
   private long A50Tran_CentroCostoIdDestino ;
   private long A518Tran_RegionIdDestino ;
   private long A53Tran_IdProveedor ;
   private long A56Tran_IdCuentadanteResponsabili ;
   private long A719Tran_TransaccResponsabilidad ;
   private long A499Tran_CodTipoElemento ;
   private long A702Tran_CedulaCuentadanteOrigen ;
   private long A703Tran_CedulaProveedor ;
   private long A704Tran_CedulaCuentadanteDestino ;
   private long A759Tran_CedulaResponsabilidad ;
   private long AV7Tran_Id ;
   private java.math.BigDecimal A483Tran_ValorTransaccion ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A58Tran_Estado ;
   private String A482Tran_TipoElemento ;
   private String A514Tran_NumeroIngreso ;
   private String A527Tran_TipoEntra ;
   private String A524Tran_Detalle ;
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
   private String edtTran_ConsecutivoCC_Internalname ;
   private String edtTran_ConsecutivoCC_Jsonclick ;
   private String edtTran_CodigoMovimiento_Internalname ;
   private String edtTran_CodigoMovimiento_Jsonclick ;
   private String edtTran_FechaRegistro_Internalname ;
   private String edtTran_FechaRegistro_Jsonclick ;
   private String edtTran_ModuloOrigen_Internalname ;
   private String edtTran_ModuloOrigen_Jsonclick ;
   private String edtTran_CodAlmaOrigen_Internalname ;
   private String edtTran_CodAlmaOrigen_Jsonclick ;
   private String edtTran_CodBodeOrigen_Internalname ;
   private String edtTran_CodBodeOrigen_Jsonclick ;
   private String edtTran_IdCuentadanteOrigen_Internalname ;
   private String edtTran_IdCuentadanteOrigen_Jsonclick ;
   private String edtTran_ModuloDestino_Internalname ;
   private String edtTran_ModuloDestino_Jsonclick ;
   private String edtTran_CodAlmaDestino_Internalname ;
   private String edtTran_CodAlmaDestino_Jsonclick ;
   private String edtTran_CodBodeDestino_Internalname ;
   private String edtTran_CodBodeDestino_Jsonclick ;
   private String edtTran_IdCuentadanteDestino_Internalname ;
   private String edtTran_IdCuentadanteDestino_Jsonclick ;
   private String edtTran_FechaRatificacion_Internalname ;
   private String edtTran_FechaRatificacion_Jsonclick ;
   private String edtTran_UsuarioRatifica_Internalname ;
   private String edtTran_UsuarioRatifica_Jsonclick ;
   private String edtTran_DescripcionMovimiento_Internalname ;
   private String edtTran_DescripcionMovimiento_Jsonclick ;
   private String edtTran_Observaciones_Internalname ;
   private String edtTran_UsuarioId_Internalname ;
   private String edtTran_UsuarioId_Jsonclick ;
   private String edtTran_UsuarioCodigo_Internalname ;
   private String edtTran_UsuarioCodigo_Jsonclick ;
   private String edtTran_UsuarioNombre_Internalname ;
   private String edtTran_UsuarioNombre_Jsonclick ;
   private String edtTran_CentroCostoId_Internalname ;
   private String edtTran_CentroCostoId_Jsonclick ;
   private String edtTran_CentroCostoCodigo_Internalname ;
   private String edtTran_CentroCostoCodigo_Jsonclick ;
   private String edtTran_CentroCostoDescripcion_Internalname ;
   private String edtTran_CentroCostoDescripcion_Jsonclick ;
   private String edtTran_RegionId_Internalname ;
   private String edtTran_RegionId_Jsonclick ;
   private String edtTran_RegionCodigo_Internalname ;
   private String edtTran_RegionCodigo_Jsonclick ;
   private String edtTran_RegionDescripcion_Internalname ;
   private String edtTran_RegionDescripcion_Jsonclick ;
   private String edtTran_AreadanteCodigo_Internalname ;
   private String edtTran_AreadanteCodigo_Jsonclick ;
   private String edtTran_CursoCodigo_Internalname ;
   private String edtTran_CursoCodigo_Jsonclick ;
   private String edtTran_ValorTransaccion_Internalname ;
   private String edtTran_ValorTransaccion_Jsonclick ;
   private String edtTran_NumeroLineas_Internalname ;
   private String edtTran_NumeroLineas_Jsonclick ;
   private String edtTran_CodTipoElemento_Internalname ;
   private String edtTran_CodTipoElemento_Jsonclick ;
   private String edtTran_NumeroIngreso_Internalname ;
   private String edtTran_NumeroIngreso_Jsonclick ;
   private String edtTran_FechaIngreso_Internalname ;
   private String edtTran_FechaIngreso_Jsonclick ;
   private String edtTran_CentroCostoIdDestino_Internalname ;
   private String edtTran_CentroCostoIdDestino_Jsonclick ;
   private String edtTran_CentroCostoCodigoDestino_Internalname ;
   private String edtTran_CentroCostoCodigoDestino_Jsonclick ;
   private String edtTran_CentroCostoDescripcionDes_Internalname ;
   private String edtTran_CentroCostoDescripcionDes_Jsonclick ;
   private String edtTran_RegionIdDestino_Internalname ;
   private String edtTran_RegionIdDestino_Jsonclick ;
   private String edtTran_RegionCodigoDestino_Internalname ;
   private String edtTran_RegionCodigoDestino_Jsonclick ;
   private String edtTran_RegionDescripcionDestino_Internalname ;
   private String edtTran_RegionDescripcionDestino_Jsonclick ;
   private String edtTran_CantidadPadres_Internalname ;
   private String edtTran_CantidadPadres_Jsonclick ;
   private String edtTran_IdProveedor_Internalname ;
   private String edtTran_IdProveedor_Jsonclick ;
   private String edtTran_RegionAbrev_Internalname ;
   private String edtTran_RegionAbrev_Jsonclick ;
   private String edtTran_RegionAbrevDestino_Internalname ;
   private String edtTran_RegionAbrevDestino_Jsonclick ;
   private String edtTran_Detalle_Internalname ;
   private String edtTran_Detalle_Jsonclick ;
   private String edtTran_NumeroGrupo_Internalname ;
   private String edtTran_NumeroGrupo_Jsonclick ;
   private String edtTran_UsuarioEliminaoAnula_Internalname ;
   private String edtTran_UsuarioEliminaoAnula_Jsonclick ;
   private String edtTran_FechaEliminaoAnula_Internalname ;
   private String edtTran_FechaEliminaoAnula_Jsonclick ;
   private String edtTran_ObservacionesAnula_Internalname ;
   private String edtTran_NombCuentadanteOrigen_Internalname ;
   private String edtTran_NombCuentadanteOrigen_Jsonclick ;
   private String edtTran_NombreProveedor_Internalname ;
   private String edtTran_NombreProveedor_Jsonclick ;
   private String edtTran_NombCuentadanteDestino_Internalname ;
   private String edtTran_NombCuentadanteDestino_Jsonclick ;
   private String edtTran_NombreIngreso_Internalname ;
   private String edtTran_NombreIngreso_Jsonclick ;
   private String edtTran_CedulaCuentadanteOrigen_Internalname ;
   private String edtTran_CedulaCuentadanteOrigen_Jsonclick ;
   private String edtTran_CedulaProveedor_Internalname ;
   private String edtTran_CedulaProveedor_Jsonclick ;
   private String edtTran_CedulaCuentadanteDestino_Internalname ;
   private String edtTran_CedulaCuentadanteDestino_Jsonclick ;
   private String edtTran_EmailCuentadanteOrigen_Internalname ;
   private String edtTran_EmailCuentadanteOrigen_Jsonclick ;
   private String edtTran_EmailCuentadanteDestino_Internalname ;
   private String edtTran_EmailCuentadanteDestino_Jsonclick ;
   private String edtTran_IdCuentadanteResponsabili_Internalname ;
   private String edtTran_IdCuentadanteResponsabili_Jsonclick ;
   private String edtTran_NombreCuentadanteResponsa_Internalname ;
   private String edtTran_NombreCuentadanteResponsa_Jsonclick ;
   private String edtTran_TransaccResponsabilidad_Internalname ;
   private String edtTran_TransaccResponsabilidad_Jsonclick ;
   private String edtTran_FechaResponsabilidad_Internalname ;
   private String edtTran_FechaResponsabilidad_Jsonclick ;
   private String edtTran_Abreviado_Internalname ;
   private String edtTran_Abreviado_Jsonclick ;
   private String edtTran_TablaResponsabilidad_Internalname ;
   private String edtTran_TablaResponsabilidad_Jsonclick ;
   private String edtTran_CedulaResponsabilidad_Internalname ;
   private String edtTran_CedulaResponsabilidad_Jsonclick ;
   private String edtTran_Id_Internalname ;
   private String edtTran_Id_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV14Pgmname ;
   private String scmdbuf ;
   private String sCtrlA46Tran_Id ;
   private java.util.Date A55Tran_FechaRegistro ;
   private java.util.Date A390Tran_FechaRatificacion ;
   private java.util.Date A669Tran_FechaEliminaoAnula ;
   private java.util.Date A515Tran_FechaIngreso ;
   private java.util.Date A720Tran_FechaResponsabilidad ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n58Tran_Estado ;
   private boolean n478Tran_IndAreadante ;
   private boolean n479Tran_IndCurso ;
   private boolean n481Tran_IndE_S ;
   private boolean n54Tran_TipoIngreso ;
   private boolean n527Tran_TipoEntra ;
   private boolean n707Tran_SolicitaCCDestino ;
   private boolean n708Tran_SolicitaRegionDestino ;
   private boolean n754Tran_CuentaResponsabilidad ;
   private boolean n859Tran_EntidadGobierno ;
   private boolean n416Tran_Observaciones ;
   private boolean n759Tran_CedulaResponsabilidad ;
   private boolean n758Tran_TablaResponsabilidad ;
   private boolean n756Tran_Abreviado ;
   private boolean n720Tran_FechaResponsabilidad ;
   private boolean n719Tran_TransaccResponsabilidad ;
   private boolean n721Tran_NombreCuentadanteResponsa ;
   private boolean n56Tran_IdCuentadanteResponsabili ;
   private boolean n715Tran_EmailCuentadanteDestino ;
   private boolean n714Tran_EmailCuentadanteOrigen ;
   private boolean n704Tran_CedulaCuentadanteDestino ;
   private boolean n703Tran_CedulaProveedor ;
   private boolean n702Tran_CedulaCuentadanteOrigen ;
   private boolean n672Tran_NombreIngreso ;
   private boolean n389Tran_NombCuentadanteDestino ;
   private boolean n575Tran_NombreProveedor ;
   private boolean n384Tran_NombCuentadanteOrigen ;
   private boolean n670Tran_ObservacionesAnula ;
   private boolean n669Tran_FechaEliminaoAnula ;
   private boolean n668Tran_UsuarioEliminaoAnula ;
   private boolean n667Tran_NumeroGrupo ;
   private boolean n524Tran_Detalle ;
   private boolean n608Tran_RegionAbrevDestino ;
   private boolean n594Tran_RegionAbrev ;
   private boolean n53Tran_IdProveedor ;
   private boolean n568Tran_CantidadPadres ;
   private boolean n520Tran_RegionDescripcionDestino ;
   private boolean n519Tran_RegionCodigoDestino ;
   private boolean n518Tran_RegionIdDestino ;
   private boolean n517Tran_CentroCostoDescripcionDes ;
   private boolean n516Tran_CentroCostoCodigoDestino ;
   private boolean n50Tran_CentroCostoIdDestino ;
   private boolean n515Tran_FechaIngreso ;
   private boolean n514Tran_NumeroIngreso ;
   private boolean n499Tran_CodTipoElemento ;
   private boolean n498Tran_NumeroLineas ;
   private boolean n483Tran_ValorTransaccion ;
   private boolean n408Tran_CursoCodigo ;
   private boolean n407Tran_AreadanteCodigo ;
   private boolean n422Tran_RegionDescripcion ;
   private boolean n421Tran_RegionCodigo ;
   private boolean n57Tran_RegionId ;
   private boolean n420Tran_CentroCostoDescripcion ;
   private boolean n419Tran_CentroCostoCodigo ;
   private boolean n418Tran_UsuarioNombre ;
   private boolean n417Tran_UsuarioCodigo ;
   private boolean n47Tran_UsuarioId ;
   private boolean n381Tran_DescripcionMovimiento ;
   private boolean n391Tran_UsuarioRatifica ;
   private boolean n390Tran_FechaRatificacion ;
   private boolean n52Tran_IdCuentadanteDestino ;
   private boolean n51Tran_IdCuentadanteOrigen ;
   private boolean n513Tran_ConsecutivoCC ;
   private boolean returnInSub ;
   private String A416Tran_Observaciones ;
   private String A49Tran_CodigoMovimiento ;
   private String A110Tran_ModuloOrigen ;
   private String A109Tran_CodAlmaOrigen ;
   private String A112Tran_CodBodeOrigen ;
   private String A385Tran_ModuloDestino ;
   private String A111Tran_CodAlmaDestino ;
   private String A387Tran_CodBodeDestino ;
   private String A391Tran_UsuarioRatifica ;
   private String A407Tran_AreadanteCodigo ;
   private String A408Tran_CursoCodigo ;
   private String A481Tran_IndE_S ;
   private String A668Tran_UsuarioEliminaoAnula ;
   private String A670Tran_ObservacionesAnula ;
   private String A859Tran_EntidadGobierno ;
   private String A381Tran_DescripcionMovimiento ;
   private String A417Tran_UsuarioCodigo ;
   private String A418Tran_UsuarioNombre ;
   private String A419Tran_CentroCostoCodigo ;
   private String A420Tran_CentroCostoDescripcion ;
   private String A422Tran_RegionDescripcion ;
   private String A478Tran_IndAreadante ;
   private String A479Tran_IndCurso ;
   private String A516Tran_CentroCostoCodigoDestino ;
   private String A517Tran_CentroCostoDescripcionDes ;
   private String A520Tran_RegionDescripcionDestino ;
   private String A594Tran_RegionAbrev ;
   private String A608Tran_RegionAbrevDestino ;
   private String A384Tran_NombCuentadanteOrigen ;
   private String A575Tran_NombreProveedor ;
   private String A389Tran_NombCuentadanteDestino ;
   private String A672Tran_NombreIngreso ;
   private String A707Tran_SolicitaCCDestino ;
   private String A708Tran_SolicitaRegionDestino ;
   private String A714Tran_EmailCuentadanteOrigen ;
   private String A715Tran_EmailCuentadanteDestino ;
   private String A721Tran_NombreCuentadanteResponsa ;
   private String A754Tran_CuentaResponsabilidad ;
   private String A756Tran_Abreviado ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV11HTTPRequest ;
   private HTMLChoice cmbTran_Estado ;
   private HTMLChoice cmbTran_IndAreadante ;
   private HTMLChoice cmbTran_IndCurso ;
   private HTMLChoice cmbTran_IndE_S ;
   private HTMLChoice cmbTran_TipoElemento ;
   private HTMLChoice cmbTran_TipoIngreso ;
   private HTMLChoice cmbTran_TipoEntra ;
   private HTMLChoice cmbTran_SolicitaCCDestino ;
   private HTMLChoice cmbTran_SolicitaRegionDestino ;
   private HTMLChoice cmbTran_CuentaResponsabilidad ;
   private HTMLChoice cmbTran_EntidadGobierno ;
   private IDataStoreProvider pr_default ;
   private String[] H000X2_A416Tran_Observaciones ;
   private boolean[] H000X2_n416Tran_Observaciones ;
   private long[] H000X2_A46Tran_Id ;
   private String[] H000X2_A859Tran_EntidadGobierno ;
   private boolean[] H000X2_n859Tran_EntidadGobierno ;
   private long[] H000X2_A759Tran_CedulaResponsabilidad ;
   private boolean[] H000X2_n759Tran_CedulaResponsabilidad ;
   private short[] H000X2_A758Tran_TablaResponsabilidad ;
   private boolean[] H000X2_n758Tran_TablaResponsabilidad ;
   private String[] H000X2_A756Tran_Abreviado ;
   private boolean[] H000X2_n756Tran_Abreviado ;
   private String[] H000X2_A754Tran_CuentaResponsabilidad ;
   private boolean[] H000X2_n754Tran_CuentaResponsabilidad ;
   private java.util.Date[] H000X2_A720Tran_FechaResponsabilidad ;
   private boolean[] H000X2_n720Tran_FechaResponsabilidad ;
   private long[] H000X2_A719Tran_TransaccResponsabilidad ;
   private boolean[] H000X2_n719Tran_TransaccResponsabilidad ;
   private String[] H000X2_A721Tran_NombreCuentadanteResponsa ;
   private boolean[] H000X2_n721Tran_NombreCuentadanteResponsa ;
   private long[] H000X2_A56Tran_IdCuentadanteResponsabili ;
   private boolean[] H000X2_n56Tran_IdCuentadanteResponsabili ;
   private String[] H000X2_A715Tran_EmailCuentadanteDestino ;
   private boolean[] H000X2_n715Tran_EmailCuentadanteDestino ;
   private String[] H000X2_A714Tran_EmailCuentadanteOrigen ;
   private boolean[] H000X2_n714Tran_EmailCuentadanteOrigen ;
   private String[] H000X2_A708Tran_SolicitaRegionDestino ;
   private boolean[] H000X2_n708Tran_SolicitaRegionDestino ;
   private String[] H000X2_A707Tran_SolicitaCCDestino ;
   private boolean[] H000X2_n707Tran_SolicitaCCDestino ;
   private long[] H000X2_A704Tran_CedulaCuentadanteDestino ;
   private boolean[] H000X2_n704Tran_CedulaCuentadanteDestino ;
   private long[] H000X2_A703Tran_CedulaProveedor ;
   private boolean[] H000X2_n703Tran_CedulaProveedor ;
   private long[] H000X2_A702Tran_CedulaCuentadanteOrigen ;
   private boolean[] H000X2_n702Tran_CedulaCuentadanteOrigen ;
   private String[] H000X2_A672Tran_NombreIngreso ;
   private boolean[] H000X2_n672Tran_NombreIngreso ;
   private String[] H000X2_A389Tran_NombCuentadanteDestino ;
   private boolean[] H000X2_n389Tran_NombCuentadanteDestino ;
   private String[] H000X2_A575Tran_NombreProveedor ;
   private boolean[] H000X2_n575Tran_NombreProveedor ;
   private String[] H000X2_A384Tran_NombCuentadanteOrigen ;
   private boolean[] H000X2_n384Tran_NombCuentadanteOrigen ;
   private String[] H000X2_A670Tran_ObservacionesAnula ;
   private boolean[] H000X2_n670Tran_ObservacionesAnula ;
   private java.util.Date[] H000X2_A669Tran_FechaEliminaoAnula ;
   private boolean[] H000X2_n669Tran_FechaEliminaoAnula ;
   private String[] H000X2_A668Tran_UsuarioEliminaoAnula ;
   private boolean[] H000X2_n668Tran_UsuarioEliminaoAnula ;
   private short[] H000X2_A667Tran_NumeroGrupo ;
   private boolean[] H000X2_n667Tran_NumeroGrupo ;
   private String[] H000X2_A524Tran_Detalle ;
   private boolean[] H000X2_n524Tran_Detalle ;
   private String[] H000X2_A608Tran_RegionAbrevDestino ;
   private boolean[] H000X2_n608Tran_RegionAbrevDestino ;
   private String[] H000X2_A594Tran_RegionAbrev ;
   private boolean[] H000X2_n594Tran_RegionAbrev ;
   private long[] H000X2_A53Tran_IdProveedor ;
   private boolean[] H000X2_n53Tran_IdProveedor ;
   private int[] H000X2_A568Tran_CantidadPadres ;
   private boolean[] H000X2_n568Tran_CantidadPadres ;
   private String[] H000X2_A527Tran_TipoEntra ;
   private boolean[] H000X2_n527Tran_TipoEntra ;
   private String[] H000X2_A520Tran_RegionDescripcionDestino ;
   private boolean[] H000X2_n520Tran_RegionDescripcionDestino ;
   private short[] H000X2_A519Tran_RegionCodigoDestino ;
   private boolean[] H000X2_n519Tran_RegionCodigoDestino ;
   private long[] H000X2_A518Tran_RegionIdDestino ;
   private boolean[] H000X2_n518Tran_RegionIdDestino ;
   private String[] H000X2_A517Tran_CentroCostoDescripcionDes ;
   private boolean[] H000X2_n517Tran_CentroCostoDescripcionDes ;
   private String[] H000X2_A516Tran_CentroCostoCodigoDestino ;
   private boolean[] H000X2_n516Tran_CentroCostoCodigoDestino ;
   private long[] H000X2_A50Tran_CentroCostoIdDestino ;
   private boolean[] H000X2_n50Tran_CentroCostoIdDestino ;
   private java.util.Date[] H000X2_A515Tran_FechaIngreso ;
   private boolean[] H000X2_n515Tran_FechaIngreso ;
   private String[] H000X2_A514Tran_NumeroIngreso ;
   private boolean[] H000X2_n514Tran_NumeroIngreso ;
   private long[] H000X2_A54Tran_TipoIngreso ;
   private boolean[] H000X2_n54Tran_TipoIngreso ;
   private String[] H000X2_A482Tran_TipoElemento ;
   private long[] H000X2_A499Tran_CodTipoElemento ;
   private boolean[] H000X2_n499Tran_CodTipoElemento ;
   private long[] H000X2_A498Tran_NumeroLineas ;
   private boolean[] H000X2_n498Tran_NumeroLineas ;
   private java.math.BigDecimal[] H000X2_A483Tran_ValorTransaccion ;
   private boolean[] H000X2_n483Tran_ValorTransaccion ;
   private String[] H000X2_A481Tran_IndE_S ;
   private boolean[] H000X2_n481Tran_IndE_S ;
   private String[] H000X2_A479Tran_IndCurso ;
   private boolean[] H000X2_n479Tran_IndCurso ;
   private String[] H000X2_A478Tran_IndAreadante ;
   private boolean[] H000X2_n478Tran_IndAreadante ;
   private String[] H000X2_A408Tran_CursoCodigo ;
   private boolean[] H000X2_n408Tran_CursoCodigo ;
   private String[] H000X2_A407Tran_AreadanteCodigo ;
   private boolean[] H000X2_n407Tran_AreadanteCodigo ;
   private String[] H000X2_A422Tran_RegionDescripcion ;
   private boolean[] H000X2_n422Tran_RegionDescripcion ;
   private short[] H000X2_A421Tran_RegionCodigo ;
   private boolean[] H000X2_n421Tran_RegionCodigo ;
   private long[] H000X2_A57Tran_RegionId ;
   private boolean[] H000X2_n57Tran_RegionId ;
   private String[] H000X2_A420Tran_CentroCostoDescripcion ;
   private boolean[] H000X2_n420Tran_CentroCostoDescripcion ;
   private String[] H000X2_A419Tran_CentroCostoCodigo ;
   private boolean[] H000X2_n419Tran_CentroCostoCodigo ;
   private long[] H000X2_A48Tran_CentroCostoId ;
   private String[] H000X2_A418Tran_UsuarioNombre ;
   private boolean[] H000X2_n418Tran_UsuarioNombre ;
   private String[] H000X2_A417Tran_UsuarioCodigo ;
   private boolean[] H000X2_n417Tran_UsuarioCodigo ;
   private long[] H000X2_A47Tran_UsuarioId ;
   private boolean[] H000X2_n47Tran_UsuarioId ;
   private String[] H000X2_A381Tran_DescripcionMovimiento ;
   private boolean[] H000X2_n381Tran_DescripcionMovimiento ;
   private String[] H000X2_A391Tran_UsuarioRatifica ;
   private boolean[] H000X2_n391Tran_UsuarioRatifica ;
   private java.util.Date[] H000X2_A390Tran_FechaRatificacion ;
   private boolean[] H000X2_n390Tran_FechaRatificacion ;
   private long[] H000X2_A52Tran_IdCuentadanteDestino ;
   private boolean[] H000X2_n52Tran_IdCuentadanteDestino ;
   private String[] H000X2_A387Tran_CodBodeDestino ;
   private String[] H000X2_A111Tran_CodAlmaDestino ;
   private String[] H000X2_A385Tran_ModuloDestino ;
   private long[] H000X2_A51Tran_IdCuentadanteOrigen ;
   private boolean[] H000X2_n51Tran_IdCuentadanteOrigen ;
   private String[] H000X2_A112Tran_CodBodeOrigen ;
   private String[] H000X2_A58Tran_Estado ;
   private boolean[] H000X2_n58Tran_Estado ;
   private String[] H000X2_A109Tran_CodAlmaOrigen ;
   private String[] H000X2_A110Tran_ModuloOrigen ;
   private java.util.Date[] H000X2_A55Tran_FechaRegistro ;
   private String[] H000X2_A49Tran_CodigoMovimiento ;
   private long[] H000X2_A513Tran_ConsecutivoCC ;
   private boolean[] H000X2_n513Tran_ConsecutivoCC ;
   private com.genexus.webpanels.WebSession AV10Session ;
   private com.orions2.SdtTransactionContext AV8TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV9TrnContextAtt ;
}

final  class alm_transacciongeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000X2", "SELECT T1.Tran_Observaciones, T1.Tran_Id, T1.Tran_EntidadGobierno, T2.Cuen_Cedula AS Tran_CedulaResponsabilidad, T1.Tran_TablaResponsabilidad, T6.Orig_Descripcion_Abreviado AS Tran_Abreviado, T12.Tpmo_CuentaResponsabilidad AS Tran_CuentaResponsabilidad, T1.Tran_FechaResponsabilidad, T1.Tran_TransaccResponsabilidad, T2.Cuen_Nombre AS Tran_NombreCuentadanteResponsa, T1.Tran_IdCuentadanteResponsabili AS Tran_IdCuentadanteResponsabili, T10.Cuen_Email AS Tran_EmailCuentadanteDestino, T11.Cuen_Email AS Tran_EmailCuentadanteOrigen, T12.Tpmo_SolicitaRegionDestino AS Tran_SolicitaRegionDestino, T12.Tpmo_SolicitaCentroDestino AS Tran_SolicitaCCDestino, T10.Cuen_Cedula AS Tran_CedulaCuentadanteDestino, T3.Cuen_Cedula AS Tran_CedulaProveedor, T11.Cuen_Cedula AS Tran_CedulaCuentadanteOrigen, T6.Orig_Descripcion AS Tran_NombreIngreso, T10.Cuen_Nombre AS Tran_NombCuentadanteDestino, T3.Cuen_Nombre AS Tran_NombreProveedor, T11.Cuen_Nombre AS Tran_NombCuentadanteOrigen, T1.Tran_ObservacionesAnula, T1.Tran_FechaEliminaoAnula, T1.Tran_UsuarioEliminaoAnula, T1.Tran_NumeroGrupo, T1.Tran_Detalle, T4.Regi_Abrev AS Tran_RegionAbrevDestino, T7.Regi_Abrev AS Tran_RegionAbrev, T1.Tran_IdProveedor AS Tran_IdProveedor, T1.Tran_CantidadPadres, T1.Tran_TipoEntra, T4.Regi_Descripcion AS Tran_RegionDescripcionDestino, T4.Regi_Cod AS Tran_RegionCodigoDestino, T1.Tran_RegionIdDestino AS Tran_RegionIdDestino, T5.Cent_Descripcion AS Tran_CentroCostoDescripcionDes, T5.Cent_Codigo AS Tran_CentroCostoCodigoDestino, T1.Tran_CentroCostoIdDestino AS Tran_CentroCostoIdDestino, T1.Tran_FechaIngreso, T1.Tran_NumeroIngreso, T1.Tran_TipoIngreso AS Tran_TipoIngreso, T1.Tran_TipoElemento, T12.Tipo_Codigo AS Tran_CodTipoElemento, T1.Tran_NumeroLineas, T1.Tran_ValorTransaccion, T1.Tran_IndE_S AS Tran_IndE_S, T12.Tpmo_IngresaCurso AS Tran_IndCurso, T12.Tpmo_IngresaAredante AS Tran_IndAreadante, T1.Tran_CursoCodigo, T1.Tran_AreadanteCodigo, T7.Regi_Descripcion AS Tran_RegionDescripcion, T7.Regi_Cod AS Tran_RegionCodigo, T1.Tran_RegionId AS Tran_RegionId, T8.Cent_Descripcion AS Tran_CentroCostoDescripcion, T8.Cent_Codigo AS Tran_CentroCostoCodigo, T1.Tran_CentroCostoId AS Tran_CentroCostoId, T9.Usua_Nombre AS Tran_UsuarioNombre, T9.Usua_Codigo AS Tran_UsuarioCodigo, T1.Tran_UsuarioId AS Tran_UsuarioId, T12.Tpmo_Descripcion AS Tran_DescripcionMovimiento, T1.Tran_UsuarioRatifica, T1.Tran_FechaRatificacion, T1.Tran_IdCuentadanteDestino AS Tran_IdCuentadanteDestino, T1.Tran_CodBodeDestino, T1.Tran_CodAlmaDestino, T1.Tran_ModuloDestino, T1.Tran_IdCuentadanteOrigen AS Tran_IdCuentadanteOrigen, T1.Tran_CodBodeOrigen, T1.Tran_Estado, T1.Tran_CodAlmaOrigen, T1.Tran_ModuloOrigen, T1.Tran_FechaRegistro, T1.Tran_CodigoMovimiento AS Tran_CodigoMovimiento, T1.Tran_ConsecutivoCC FROM (((((((((((ALM_TRANSACCION T1 LEFT JOIN ALM_CUENTADANTE T2 ON T2.Cuen_Identificacion = T1.Tran_IdCuentadanteResponsabili) LEFT JOIN ALM_CUENTADANTE T3 ON T3.Cuen_Identificacion = T1.Tran_IdProveedor) LEFT JOIN GEN_REGIONAL T4 ON T4.Regi_Id = T1.Tran_RegionIdDestino) LEFT JOIN GEN_CENTROCOSTO T5 ON T5.Cent_Id = T1.Tran_CentroCostoIdDestino) LEFT JOIN ALM_ORIGEN_BIENES T6 ON T6.Orig_Identificador = T1.Tran_TipoIngreso) LEFT JOIN GEN_REGIONAL T7 ON T7.Regi_Id = T1.Tran_RegionId) INNER JOIN GEN_CENTROCOSTO T8 ON T8.Cent_Id = T1.Tran_CentroCostoId) LEFT JOIN SEG_USUARIO T9 ON T9.Usua_Id = T1.Tran_UsuarioId) LEFT JOIN ALM_CUENTADANTE T10 ON T10.Cuen_Identificacion = T1.Tran_IdCuentadanteDestino) LEFT JOIN ALM_CUENTADANTE T11 ON T11.Cuen_Identificacion = T1.Tran_IdCuentadanteOrigen) INNER JOIN ALM_TIPO_MOVIMIENTO T12 ON T12.Tpmo_Codigo = T1.Tran_CodigoMovimiento) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((long[]) buf[15])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((long[]) buf[19])[0] = rslt.getLong(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((long[]) buf[29])[0] = rslt.getLong(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((long[]) buf[31])[0] = rslt.getLong(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((long[]) buf[33])[0] = rslt.getLong(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[45])[0] = rslt.getGXDateTime(24) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((short[]) buf[49])[0] = rslt.getShort(26) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(27, 1) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getVarchar(29) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((long[]) buf[57])[0] = rslt.getLong(30) ;
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((int[]) buf[59])[0] = rslt.getInt(31) ;
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(32, 4) ;
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getVarchar(33) ;
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((short[]) buf[65])[0] = rslt.getShort(34) ;
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((long[]) buf[67])[0] = rslt.getLong(35) ;
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getVarchar(36) ;
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getVarchar(37) ;
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((long[]) buf[73])[0] = rslt.getLong(38) ;
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[75])[0] = rslt.getGXDate(39) ;
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(40, 30) ;
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((long[]) buf[79])[0] = rslt.getLong(41) ;
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((String[]) buf[81])[0] = rslt.getString(42, 1) ;
               ((long[]) buf[82])[0] = rslt.getLong(43) ;
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((long[]) buf[84])[0] = rslt.getLong(44) ;
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[86])[0] = rslt.getBigDecimal(45,2) ;
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getVarchar(46) ;
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((String[]) buf[90])[0] = rslt.getVarchar(47) ;
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((String[]) buf[92])[0] = rslt.getVarchar(48) ;
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((String[]) buf[94])[0] = rslt.getVarchar(49) ;
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((String[]) buf[96])[0] = rslt.getVarchar(50) ;
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((String[]) buf[98])[0] = rslt.getVarchar(51) ;
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((short[]) buf[100])[0] = rslt.getShort(52) ;
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((long[]) buf[102])[0] = rslt.getLong(53) ;
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((String[]) buf[104])[0] = rslt.getVarchar(54) ;
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((String[]) buf[106])[0] = rslt.getVarchar(55) ;
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((long[]) buf[108])[0] = rslt.getLong(56) ;
               ((String[]) buf[109])[0] = rslt.getVarchar(57) ;
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((String[]) buf[111])[0] = rslt.getVarchar(58) ;
               ((boolean[]) buf[112])[0] = rslt.wasNull();
               ((long[]) buf[113])[0] = rslt.getLong(59) ;
               ((boolean[]) buf[114])[0] = rslt.wasNull();
               ((String[]) buf[115])[0] = rslt.getVarchar(60) ;
               ((boolean[]) buf[116])[0] = rslt.wasNull();
               ((String[]) buf[117])[0] = rslt.getVarchar(61) ;
               ((boolean[]) buf[118])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[119])[0] = rslt.getGXDateTime(62) ;
               ((boolean[]) buf[120])[0] = rslt.wasNull();
               ((long[]) buf[121])[0] = rslt.getLong(63) ;
               ((boolean[]) buf[122])[0] = rslt.wasNull();
               ((String[]) buf[123])[0] = rslt.getVarchar(64) ;
               ((String[]) buf[124])[0] = rslt.getVarchar(65) ;
               ((String[]) buf[125])[0] = rslt.getVarchar(66) ;
               ((long[]) buf[126])[0] = rslt.getLong(67) ;
               ((boolean[]) buf[127])[0] = rslt.wasNull();
               ((String[]) buf[128])[0] = rslt.getVarchar(68) ;
               ((String[]) buf[129])[0] = rslt.getString(69, 1) ;
               ((boolean[]) buf[130])[0] = rslt.wasNull();
               ((String[]) buf[131])[0] = rslt.getVarchar(70) ;
               ((String[]) buf[132])[0] = rslt.getVarchar(71) ;
               ((java.util.Date[]) buf[133])[0] = rslt.getGXDateTime(72) ;
               ((String[]) buf[134])[0] = rslt.getVarchar(73) ;
               ((long[]) buf[135])[0] = rslt.getLong(74) ;
               ((boolean[]) buf[136])[0] = rslt.wasNull();
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

