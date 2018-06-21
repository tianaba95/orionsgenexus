/*
               File: wpseg_usuariorol_impl
        Description: USUARIO ROL
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:20:5.7
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

public final  class wpseg_usuariorol_impl extends GXDataArea
{
   public wpseg_usuariorol_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wpseg_usuariorol_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wpseg_usuariorol_impl.class ));
   }

   public wpseg_usuariorol_impl( int remoteHandle ,
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
            nRC_GXsfl_63 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_63_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_63_idx = httpContext.GetNextPar( ) ;
            AV8EliminarRol = httpContext.GetNextPar( ) ;
            edtavEliminarrol_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavEliminarrol_Internalname, "Tooltiptext", edtavEliminarrol_Tooltiptext, !bGXsfl_63_Refreshing);
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
            AV8EliminarRol = httpContext.GetNextPar( ) ;
            edtavEliminarrol_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavEliminarrol_Internalname, "Tooltiptext", edtavEliminarrol_Tooltiptext, !bGXsfl_63_Refreshing);
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( AV8EliminarRol) ;
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "WPSEG_USUARIOROL" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV19Usua_Nombre, "")) ;
            forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(AV16Usua_Cedula), "ZZZZZZZZZZZZZZZZZ9") ;
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
            GXutil.writeLogln("wpseg_usuariorol:[SendSecurityCheck]"+forbiddenHiddens);
            httpContext.GX_webresponse.addString(httpContext.getJSONResponse( ));
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
         {
            nRC_GXsfl_88 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_88_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_88_idx = httpContext.GetNextPar( ) ;
            AV7EliminarCEC = httpContext.GetNextPar( ) ;
            edtavEliminarcec_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavEliminarcec_Internalname, "Tooltiptext", edtavEliminarcec_Tooltiptext, !bGXsfl_88_Refreshing);
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid2_newrow( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid2") == 0 )
         {
            AV7EliminarCEC = httpContext.GetNextPar( ) ;
            edtavEliminarcec_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavEliminarcec_Internalname, "Tooltiptext", edtavEliminarcec_Tooltiptext, !bGXsfl_88_Refreshing);
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid2_refresh( AV7EliminarCEC) ;
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "WPSEG_USUARIOROL" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV19Usua_Nombre, "")) ;
            forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(AV16Usua_Cedula), "ZZZZZZZZZZZZZZZZZ9") ;
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
            GXutil.writeLogln("wpseg_usuariorol:[SendSecurityCheck]"+forbiddenHiddens);
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
      pa622( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start622( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20186141420522");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.wpseg_usuariorol") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pUsua_Id,18,0)))+"\">") ;
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
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Sdtcecusu", AV23SDTCECUsu);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Sdtcecusu", AV23SDTCECUsu);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Sdtrolusu", AV20SDTRolUsu);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Sdtrolusu", AV20SDTRolUsu);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_63", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_63, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_88", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_88, (byte)(4), (byte)(0), ",", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTROLUSU", AV20SDTRolUsu);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTROLUSU", AV20SDTRolUsu);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPROL_TIPO", GXutil.rtrim( AV57PRol_Tipo));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTAGREGARLROL", AV47SDTAgregarlRol);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTAGREGARLROL", AV47SDTAgregarlRol);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTELIMINADOLROL", AV50SDTEliminadolRol);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTELIMINADOLROL", AV50SDTEliminadolRol);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTCECUSU", AV23SDTCECUsu);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTCECUSU", AV23SDTCECUsu);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTCENTROAGREGADO", AV37SDTCentroAgregado);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTCENTROAGREGADO", AV37SDTCentroAgregado);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTCENTROELIMINADO", AV39SDTCentroEliminado);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTCENTROELIMINADO", AV39SDTCentroEliminado);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTEDITARROL", AV51SDTEditarRol);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTEDITARROL", AV51SDTEditarRol);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUA_USUAPRUEBA", AV59Usua_UsuAprueba);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUARIO", AV28Usuario);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTORIGINALROL", AV42SDTOriginalRol);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTORIGINALROL", AV42SDTOriginalRol);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTCENTROORIGINAL", AV30SDTCentroOriginal);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTCENTROORIGINAL", AV30SDTCentroOriginal);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vELIMINARROL_Tooltiptext", GXutil.rtrim( edtavEliminarrol_Tooltiptext));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "WPSEG_USUARIOROL" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV19Usua_Nombre, "")) ;
      forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(AV16Usua_Cedula), "ZZZZZZZZZZZZZZZZZ9") ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("wpseg_usuariorol:[SendSecurityCheck]"+forbiddenHiddens);
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
         we622( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt622( ) ;
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
      return formatLink("com.orions2.wpseg_usuariorol") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pUsua_Id,18,0))) ;
   }

   public String getPgmname( )
   {
      return "WPSEG_USUARIOROL" ;
   }

   public String getPgmdesc( )
   {
      return "USUARIO ROL" ;
   }

   public void wb620( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-md-8 col-md-offset-2", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTitlecontainer_Internalname, 1, 0, "px", 0, "px", "TableTop", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Asignación de Roles", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_WPSEG_USUARIOROL.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-md-8 col-md-offset-2", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divFormcontainer_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavPusua_id_Internalname, "Identificador", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavPusua_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV13pUsua_Id, (byte)(18), (byte)(0), ",", "")), ((edtavPusua_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13pUsua_Id), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV13pUsua_Id), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPusua_id_Jsonclick, 0, "Attribute", "", "", "", edtavPusua_id_Visible, edtavPusua_id_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WPSEG_USUARIOROL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavUsua_codigo_Internalname, "Código del Usuario", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'" + sGXsfl_63_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavUsua_codigo_Internalname, AV17Usua_Codigo, GXutil.rtrim( localUtil.format( AV17Usua_Codigo, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUsua_codigo_Jsonclick, 0, "Attribute", "", "", "", edtavUsua_codigo_Visible, edtavUsua_codigo_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPSEG_USUARIOROL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavUsua_nombre_Internalname, "Nombre del usuario", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'" + sGXsfl_63_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavUsua_nombre_Internalname, AV19Usua_Nombre, GXutil.rtrim( localUtil.format( AV19Usua_Nombre, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUsua_nombre_Jsonclick, 0, "Attribute", "", "", "", 1, edtavUsua_nombre_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPSEG_USUARIOROL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavUsua_email_Internalname, "Correo electrónico", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'" + sGXsfl_63_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavUsua_email_Internalname, AV18Usua_Email, GXutil.rtrim( localUtil.format( AV18Usua_Email, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUsua_email_Jsonclick, 0, "Attribute", "", "", "", 1, edtavUsua_email_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "left", true, "HLP_WPSEG_USUARIOROL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavUsua_cedula_Internalname, "Cédula", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_63_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavUsua_cedula_Internalname, GXutil.ltrim( localUtil.ntoc( AV16Usua_Cedula, (byte)(18), (byte)(0), ",", "")), ((edtavUsua_cedula_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16Usua_Cedula), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV16Usua_Cedula), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUsua_cedula_Jsonclick, 0, "Attribute", "", "", "", 1, edtavUsua_cedula_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WPSEG_USUARIOROL.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-md-10 col-lg-9 col-lg-offset-2 LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable2_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "ROLES ASIGNADOS", "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WPSEG_USUARIOROL.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 10, "px", "col-xs-12", "left", "top", "", "", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable1_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-md-8 col-lg-1", "Right", "Bottom", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage1_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "Seleccionar Rol", "Buscar rol", 0, 0, 0, "px", 0, "px", 0, 0, 7, imgImage1_Jsonclick, "'"+""+"'"+",false,"+"'"+"e11621_client"+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WPSEG_USUARIOROL.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Right", "Bottom", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-8", "left", "Middle", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_63_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavProl_descripcion_Internalname, AV11pRol_Descripcion, GXutil.rtrim( localUtil.format( AV11pRol_Descripcion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "SELECCIONAR ROL", edtavProl_descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtavProl_descripcion_Enabled, 0, "text", "", 60, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPSEG_USUARIOROL.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "Middle", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-3", "left", "Middle", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttAsignarrol_Internalname, "gx.evt.setGridEvt("+GXutil.str( 63, 2, 0)+","+"null"+");", "Asignar rol", bttAsignarrol_Jsonclick, 5, "Asignar rol", "", StyleString, ClassString, 1, bttAsignarrol_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"E\\'ASIGNARROL\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WPSEG_USUARIOROL.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "Middle", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "Middle", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavProl_id_Internalname, "Rol", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_63_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavProl_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV12pRol_Id, (byte)(11), (byte)(0), ",", "")), ((edtavProl_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12pRol_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV12pRol_Id), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,60);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProl_id_Jsonclick, 0, "Attribute", "", "", "", edtavProl_id_Visible, edtavProl_id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WPSEG_USUARIOROL.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "Middle", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"63\">") ;
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
            httpContext.writeValue( "Identificador del Rol") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
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
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlrol_id_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlrol_descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( AV8EliminarRol));
            Grid1Column.AddObjectProperty("Tooltiptext", GXutil.rtrim( edtavEliminarrol_Tooltiptext));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 63 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_63 = (short)(nGXsfl_63_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV70GXV1 = nGXsfl_63_idx ;
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
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-9 col-lg-offset-2 LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable3_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, "CENTROS DE COSTO  ASIGNADOS", "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_WPSEG_USUARIOROL.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 10, "px", "col-xs-12", "left", "top", "", "", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable4_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage2_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "Buscar centro costo", 0, 0, 0, "px", 0, "px", 0, 0, 7, imgImage2_Jsonclick, "'"+""+"'"+",false,"+"'"+"e12621_client"+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WPSEG_USUARIOROL.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-8", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_63_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavPcent_descripcion_Internalname, AV9pCent_Descripcion, GXutil.rtrim( localUtil.format( AV9pCent_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,83);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "SELECCIONAR CENTRO", edtavPcent_descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtavPcent_descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPSEG_USUARIOROL.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-3", "left", "Middle", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttAsignarcec_Internalname, "gx.evt.setGridEvt("+GXutil.str( 63, 2, 0)+","+"null"+");", "Asignar centro", bttAsignarcec_Jsonclick, 5, "Asignar centro costo", "", StyleString, ClassString, 1, bttAsignarcec_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"E\\'ASIGNARCEC\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WPSEG_USUARIOROL.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "Middle", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid2Container.SetWrapped(nGXWrapped);
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid2Container"+"DivS\" data-gxgridid=\"88\">") ;
            sStyleString = "" ;
            com.orions2.GxWebStd.gx_table_start( httpContext, subGrid2_Internalname, subGrid2_Internalname, "", "WorkWith", 0, "", "", 1, 2, sStyleString, "", 0);
            /* Subfile titles */
            httpContext.writeText( "<tr") ;
            httpContext.writeTextNL( ">") ;
            if ( subGrid2_Backcolorstyle == 0 )
            {
               subGrid2_Titlebackstyle = (byte)(0) ;
               if ( GXutil.len( subGrid2_Class) > 0 )
               {
                  subGrid2_Linesclass = subGrid2_Class+"Title" ;
               }
            }
            else
            {
               subGrid2_Titlebackstyle = (byte)(1) ;
               if ( subGrid2_Backcolorstyle == 1 )
               {
                  subGrid2_Titlebackcolor = subGrid2_Allbackcolor ;
                  if ( GXutil.len( subGrid2_Class) > 0 )
                  {
                     subGrid2_Linesclass = subGrid2_Class+"UniformTitle" ;
                  }
               }
               else
               {
                  if ( GXutil.len( subGrid2_Class) > 0 )
                  {
                     subGrid2_Linesclass = subGrid2_Class+"Title" ;
                  }
               }
            }
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 30, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 60, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DeleteAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Identificador Centro de Costo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Abreviatura Regional") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeTextNL( "</tr>") ;
            Grid2Container.AddObjectProperty("GridName", "Grid2");
         }
         else
         {
            Grid2Container.AddObjectProperty("GridName", "Grid2");
            Grid2Container.AddObjectProperty("Class", "WorkWith");
            Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("CmpContext", "");
            Grid2Container.AddObjectProperty("InMasterPage", "false");
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlregi_cod_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlregi_descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlcent_codigo_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlcent_descripcion1_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Value", httpContext.convertURL( AV7EliminarCEC));
            Grid2Column.AddObjectProperty("Tooltiptext", GXutil.rtrim( edtavEliminarcec_Tooltiptext));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlcent_id1_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlregi_abrev_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid2_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 88 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_88 = (short)(nGXsfl_88_idx-1) ;
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV73GXV2 = nGXsfl_88_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Grid2Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid2", Grid2Container);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               com.orions2.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData", Grid2Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               com.orions2.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V", Grid2Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V"+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
            }
         }
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttButton1_Internalname, "gx.evt.setGridEvt("+GXutil.str( 63, 2, 0)+","+"null"+");", "Confirmar", bttButton1_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'CONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WPSEG_USUARIOROL.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttButton2_Internalname, "gx.evt.setGridEvt("+GXutil.str( 63, 2, 0)+","+"null"+");", "Cancelar", bttButton2_Jsonclick, 5, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'CANCELAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WPSEG_USUARIOROL.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start622( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "USUARIO ROL", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup620( ) ;
   }

   public void ws622( )
   {
      start622( ) ;
      evt622( ) ;
   }

   public void evt622( )
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
                        else if ( GXutil.strcmp(sEvt, "'ASIGNARROL'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'AsignarRol' */
                           e13622 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'ASIGNARCEC'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'AsignarCEC' */
                           e14622 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'CONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'CONFIRMAR' */
                           e15622 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'CANCELAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Cancelar' */
                           e16622 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 13), "'ELIMINARCEC'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "GRID2.REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID2.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "'ELIMINARCEC'") == 0 ) )
                        {
                           nGXsfl_88_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_88_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_88_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_887( ) ;
                           AV73GXV2 = nGXsfl_88_idx ;
                           if ( ( AV23SDTCECUsu.size() >= AV73GXV2 ) && ( AV73GXV2 > 0 ) )
                           {
                              AV23SDTCECUsu.currentItem( ((com.orions2.SdtSDTCECUsu_SDTCECUsuItem)AV23SDTCECUsu.elementAt(-1+AV73GXV2)) );
                              AV7EliminarCEC = httpContext.cgiGet( edtavEliminarcec_Internalname) ;
                              httpContext.ajax_rsp_assign_prop("", false, edtavEliminarcec_Internalname, "Bitmap", ((GXutil.strcmp("", AV7EliminarCEC)==0) ? AV81Eliminarcec_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV7EliminarCEC))), !bGXsfl_88_Refreshing);
                              httpContext.ajax_rsp_assign_prop("", false, edtavEliminarcec_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV7EliminarCEC), true);
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "'ELIMINARCEC'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'EliminarCEC' */
                                 e17622 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID2.REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e18622 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID2.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e19627 ();
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
                        else if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "'ELIMINARROL'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "GRID1.REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "'ELIMINARROL'") == 0 ) )
                        {
                           nGXsfl_63_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_63_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_63_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_632( ) ;
                           AV70GXV1 = nGXsfl_63_idx ;
                           if ( ( AV20SDTRolUsu.size() >= AV70GXV1 ) && ( AV70GXV1 > 0 ) )
                           {
                              AV20SDTRolUsu.currentItem( ((com.orions2.SdtSDTRolUsu_SDTRolUsuItem)AV20SDTRolUsu.elementAt(-1+AV70GXV1)) );
                              AV8EliminarRol = httpContext.cgiGet( edtavEliminarrol_Internalname) ;
                              httpContext.ajax_rsp_assign_prop("", false, edtavEliminarrol_Internalname, "Bitmap", ((GXutil.strcmp("", AV8EliminarRol)==0) ? AV80Eliminarrol_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV8EliminarRol))), !bGXsfl_63_Refreshing);
                              httpContext.ajax_rsp_assign_prop("", false, edtavEliminarrol_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV8EliminarRol), true);
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e20622 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'ELIMINARROL'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'EliminarRol' */
                                 e21622 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID1.REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e22622 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e23622 ();
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

   public void we622( )
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

   public void pa622( )
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
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GX_FocusControl = edtavUsua_codigo_Internalname ;
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
      subsflControlProps_632( ) ;
      while ( nGXsfl_63_idx <= nRC_GXsfl_63 )
      {
         sendrow_632( ) ;
         nGXsfl_63_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_63_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_63_idx+1)) ;
         sGXsfl_63_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_63_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_632( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_887( ) ;
      while ( nGXsfl_88_idx <= nRC_GXsfl_88 )
      {
         sendrow_887( ) ;
         nGXsfl_88_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_88_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_88_idx+1)) ;
         sGXsfl_88_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_88_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_887( ) ;
      }
      httpContext.GX_webresponse.addString(Grid2Container.ToJavascriptSource());
      /* End function gxnrGrid2_newrow */
   }

   public void gxgrgrid1_refresh( String AV8EliminarRol )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRID1_nCurrentRecord = 0 ;
      rf622( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void gxgrgrid2_refresh( String AV7EliminarCEC )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      e22622 ();
      GRID2_nCurrentRecord = 0 ;
      rf627( ) ;
      /* End function gxgrGrid2_refresh */
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
      rf622( ) ;
      rf627( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavPusua_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPusua_id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPusua_id_Enabled, 5, 0)), true);
      edtavUsua_codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUsua_codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavUsua_codigo_Enabled, 5, 0)), true);
      edtavUsua_nombre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUsua_nombre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavUsua_nombre_Enabled, 5, 0)), true);
      edtavUsua_email_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUsua_email_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavUsua_email_Enabled, 5, 0)), true);
      edtavUsua_cedula_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUsua_cedula_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavUsua_cedula_Enabled, 5, 0)), true);
      edtavProl_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProl_id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavProl_id_Enabled, 5, 0)), true);
      edtavCtlrol_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlrol_id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlrol_id_Enabled, 5, 0)), !bGXsfl_63_Refreshing);
      edtavCtlrol_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlrol_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlrol_descripcion_Enabled, 5, 0)), !bGXsfl_63_Refreshing);
      edtavPcent_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPcent_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPcent_descripcion_Enabled, 5, 0)), true);
      edtavCtlregi_cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlregi_cod_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlregi_cod_Enabled, 5, 0)), !bGXsfl_88_Refreshing);
      edtavCtlregi_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlregi_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlregi_descripcion_Enabled, 5, 0)), !bGXsfl_88_Refreshing);
      edtavCtlcent_codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlcent_codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlcent_codigo_Enabled, 5, 0)), !bGXsfl_88_Refreshing);
      edtavCtlcent_descripcion1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlcent_descripcion1_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlcent_descripcion1_Enabled, 5, 0)), !bGXsfl_88_Refreshing);
      edtavCtlcent_id1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlcent_id1_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlcent_id1_Enabled, 5, 0)), !bGXsfl_88_Refreshing);
      edtavCtlregi_abrev_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlregi_abrev_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlregi_abrev_Enabled, 5, 0)), !bGXsfl_88_Refreshing);
   }

   public void rf622( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(63) ;
      e22622 ();
      nGXsfl_63_idx = (short)(1) ;
      sGXsfl_63_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_63_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_632( ) ;
      bGXsfl_63_Refreshing = true ;
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
         subsflControlProps_632( ) ;
         e23622 ();
         wbEnd = (short)(63) ;
         wb620( ) ;
      }
      bGXsfl_63_Refreshing = true ;
   }

   public void rf627( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid2Container.ClearRows();
      }
      wbStart = (short)(88) ;
      e18622 ();
      nGXsfl_88_idx = (short)(1) ;
      sGXsfl_88_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_88_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_887( ) ;
      bGXsfl_88_Refreshing = true ;
      Grid2Container.AddObjectProperty("GridName", "Grid2");
      Grid2Container.AddObjectProperty("CmpContext", "");
      Grid2Container.AddObjectProperty("InMasterPage", "false");
      Grid2Container.AddObjectProperty("Class", "WorkWith");
      Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.setPageSize( subgrid2_recordsperpage( ) );
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_887( ) ;
         e19627 ();
         wbEnd = (short)(88) ;
         wb620( ) ;
      }
      bGXsfl_88_Refreshing = true ;
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

   public int subgrid2_pagecount( )
   {
      return -1 ;
   }

   public int subgrid2_recordcount( )
   {
      return -1 ;
   }

   public int subgrid2_recordsperpage( )
   {
      return -1 ;
   }

   public int subgrid2_currentpage( )
   {
      return -1 ;
   }

   public void strup620( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      edtavPusua_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPusua_id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPusua_id_Enabled, 5, 0)), true);
      edtavUsua_codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUsua_codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavUsua_codigo_Enabled, 5, 0)), true);
      edtavUsua_nombre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUsua_nombre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavUsua_nombre_Enabled, 5, 0)), true);
      edtavUsua_email_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUsua_email_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavUsua_email_Enabled, 5, 0)), true);
      edtavUsua_cedula_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUsua_cedula_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavUsua_cedula_Enabled, 5, 0)), true);
      edtavProl_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProl_id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavProl_id_Enabled, 5, 0)), true);
      edtavCtlrol_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlrol_id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlrol_id_Enabled, 5, 0)), !bGXsfl_63_Refreshing);
      edtavCtlrol_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlrol_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlrol_descripcion_Enabled, 5, 0)), !bGXsfl_63_Refreshing);
      edtavPcent_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPcent_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPcent_descripcion_Enabled, 5, 0)), true);
      edtavCtlregi_cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlregi_cod_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlregi_cod_Enabled, 5, 0)), !bGXsfl_88_Refreshing);
      edtavCtlregi_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlregi_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlregi_descripcion_Enabled, 5, 0)), !bGXsfl_88_Refreshing);
      edtavCtlcent_codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlcent_codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlcent_codigo_Enabled, 5, 0)), !bGXsfl_88_Refreshing);
      edtavCtlcent_descripcion1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlcent_descripcion1_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlcent_descripcion1_Enabled, 5, 0)), !bGXsfl_88_Refreshing);
      edtavCtlcent_id1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlcent_id1_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlcent_id1_Enabled, 5, 0)), !bGXsfl_88_Refreshing);
      edtavCtlregi_abrev_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlregi_abrev_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlregi_abrev_Enabled, 5, 0)), !bGXsfl_88_Refreshing);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e20622 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Sdtcecusu"), AV23SDTCECUsu);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Sdtrolusu"), AV20SDTRolUsu);
         /* Read variables values. */
         AV13pUsua_Id = localUtil.ctol( httpContext.cgiGet( edtavPusua_id_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13pUsua_Id", GXutil.ltrim( GXutil.str( AV13pUsua_Id, 18, 0)));
         AV17Usua_Codigo = GXutil.upper( httpContext.cgiGet( edtavUsua_codigo_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Usua_Codigo", AV17Usua_Codigo);
         AV19Usua_Nombre = httpContext.cgiGet( edtavUsua_nombre_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Usua_Nombre", AV19Usua_Nombre);
         AV18Usua_Email = httpContext.cgiGet( edtavUsua_email_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Usua_Email", AV18Usua_Email);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavUsua_cedula_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavUsua_cedula_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vUSUA_CEDULA");
            GX_FocusControl = edtavUsua_cedula_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16Usua_Cedula = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Usua_Cedula", GXutil.ltrim( GXutil.str( AV16Usua_Cedula, 18, 0)));
         }
         else
         {
            AV16Usua_Cedula = localUtil.ctol( httpContext.cgiGet( edtavUsua_cedula_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Usua_Cedula", GXutil.ltrim( GXutil.str( AV16Usua_Cedula, 18, 0)));
         }
         AV11pRol_Descripcion = GXutil.upper( httpContext.cgiGet( edtavProl_descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11pRol_Descripcion", AV11pRol_Descripcion);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavProl_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavProl_id_Internalname), ",", ".") > 99999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPROL_ID");
            GX_FocusControl = edtavProl_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12pRol_Id = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12pRol_Id", GXutil.ltrim( GXutil.str( AV12pRol_Id, 11, 0)));
         }
         else
         {
            AV12pRol_Id = localUtil.ctol( httpContext.cgiGet( edtavProl_id_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12pRol_Id", GXutil.ltrim( GXutil.str( AV12pRol_Id, 11, 0)));
         }
         AV9pCent_Descripcion = httpContext.cgiGet( edtavPcent_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9pCent_Descripcion", AV9pCent_Descripcion);
         /* Read saved values. */
         nRC_GXsfl_63 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_63"), ",", ".")) ;
         nRC_GXsfl_88 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_88"), ",", ".")) ;
         AV57PRol_Tipo = httpContext.cgiGet( "vPROL_TIPO") ;
         nRC_GXsfl_63 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_63"), ",", ".")) ;
         nGXsfl_63_fel_idx = (short)(0) ;
         while ( nGXsfl_63_fel_idx < nRC_GXsfl_63 )
         {
            nGXsfl_63_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_63_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_63_fel_idx+1)) ;
            sGXsfl_63_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_63_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_632( ) ;
            AV70GXV1 = nGXsfl_63_fel_idx ;
            if ( ( AV20SDTRolUsu.size() >= AV70GXV1 ) && ( AV70GXV1 > 0 ) )
            {
               AV20SDTRolUsu.currentItem( ((com.orions2.SdtSDTRolUsu_SDTRolUsuItem)AV20SDTRolUsu.elementAt(-1+AV70GXV1)) );
               AV8EliminarRol = httpContext.cgiGet( edtavEliminarrol_Internalname) ;
            }
         }
         if ( nGXsfl_63_fel_idx == 0 )
         {
            nGXsfl_63_idx = (short)(1) ;
            sGXsfl_63_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_63_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_632( ) ;
         }
         nGXsfl_63_fel_idx = (short)(1) ;
         nRC_GXsfl_88 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_88"), ",", ".")) ;
         nGXsfl_88_fel_idx = (short)(0) ;
         while ( nGXsfl_88_fel_idx < nRC_GXsfl_88 )
         {
            nGXsfl_88_fel_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_88_fel_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_88_fel_idx+1)) ;
            sGXsfl_88_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_88_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_887( ) ;
            AV73GXV2 = nGXsfl_88_fel_idx ;
            if ( ( AV23SDTCECUsu.size() >= AV73GXV2 ) && ( AV73GXV2 > 0 ) )
            {
               AV23SDTCECUsu.currentItem( ((com.orions2.SdtSDTCECUsu_SDTCECUsuItem)AV23SDTCECUsu.elementAt(-1+AV73GXV2)) );
               AV7EliminarCEC = httpContext.cgiGet( edtavEliminarcec_Internalname) ;
            }
         }
         if ( nGXsfl_88_fel_idx == 0 )
         {
            nGXsfl_88_idx = (short)(1) ;
            sGXsfl_88_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_88_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_887( ) ;
         }
         nGXsfl_88_fel_idx = (short)(1) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = "hsh" + "WPSEG_USUARIOROL" ;
         AV19Usua_Nombre = httpContext.cgiGet( edtavUsua_nombre_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Usua_Nombre", AV19Usua_Nombre);
         forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV19Usua_Nombre, "")) ;
         AV16Usua_Cedula = localUtil.ctol( httpContext.cgiGet( edtavUsua_cedula_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Usua_Cedula", GXutil.ltrim( GXutil.str( AV16Usua_Cedula, 18, 0)));
         forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(AV16Usua_Cedula), "ZZZZZZZZZZZZZZZZZ9") ;
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
         {
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            GXutil.writeLog("wpseg_usuariorol:[SecurityCheckFailed]"+forbiddenHiddens);
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
      e20622 ();
      if (returnInSub) return;
   }

   public void e20622( )
   {
      /* Start Routine */
      AV28Usuario = AV29websession.getValue("Usuario") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Usuario", AV28Usuario);
      AV52Usua_Id = GXutil.lval( AV29websession.getValue("UsuarioId")) ;
      AV8EliminarRol = context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEliminarrol_Internalname, "Bitmap", ((GXutil.strcmp("", AV8EliminarRol)==0) ? AV80Eliminarrol_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV8EliminarRol))), !bGXsfl_63_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavEliminarrol_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV8EliminarRol), true);
      AV80Eliminarrol_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEliminarrol_Internalname, "Bitmap", ((GXutil.strcmp("", AV8EliminarRol)==0) ? AV80Eliminarrol_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV8EliminarRol))), !bGXsfl_63_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavEliminarrol_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV8EliminarRol), true);
      AV7EliminarCEC = context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEliminarcec_Internalname, "Bitmap", ((GXutil.strcmp("", AV7EliminarCEC)==0) ? AV81Eliminarcec_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV7EliminarCEC))), !bGXsfl_88_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavEliminarcec_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV7EliminarCEC), true);
      AV81Eliminarcec_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEliminarcec_Internalname, "Bitmap", ((GXutil.strcmp("", AV7EliminarCEC)==0) ? AV81Eliminarcec_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV7EliminarCEC))), !bGXsfl_88_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavEliminarcec_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV7EliminarCEC), true);
      edtavProl_id_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProl_id_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavProl_id_Visible, 5, 0)), true);
      edtavPusua_id_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPusua_id_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavPusua_id_Visible, 5, 0)), true);
      edtavUsua_codigo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUsua_codigo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavUsua_codigo_Visible, 5, 0)), true);
      edtavEliminarrol_Tooltiptext = "Borrar Rol" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEliminarrol_Internalname, "Tooltiptext", edtavEliminarrol_Tooltiptext, !bGXsfl_63_Refreshing);
      edtavEliminarcec_Tooltiptext = "Borrar Centro" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEliminarcec_Internalname, "Tooltiptext", edtavEliminarcec_Tooltiptext, !bGXsfl_88_Refreshing);
      bttAsignarrol_Enabled = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, bttAsignarrol_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttAsignarrol_Enabled, 5, 0)), true);
      bttAsignarcec_Enabled = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, bttAsignarcec_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttAsignarcec_Enabled, 5, 0)), true);
      /* Execute user subroutine: 'DATOSPERSOANALES' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'CARGARROLES' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'CARGARCENTROS' */
      S132 ();
      if (returnInSub) return;
   }

   public void S112( )
   {
      /* 'DATOSPERSOANALES' Routine */
      /* Using cursor H00622 */
      pr_default.execute(0, new Object[] {new Long(AV13pUsua_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A23Usua_Id = H00622_A23Usua_Id[0] ;
         A24Usua_Codigo = H00622_A24Usua_Codigo[0] ;
         A25Usua_Nombre = H00622_A25Usua_Nombre[0] ;
         A219Usua_Email = H00622_A219Usua_Email[0] ;
         A26Usua_Cedula = H00622_A26Usua_Cedula[0] ;
         A222Usua_UsuAprueba = H00622_A222Usua_UsuAprueba[0] ;
         AV17Usua_Codigo = A24Usua_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Usua_Codigo", AV17Usua_Codigo);
         AV19Usua_Nombre = A25Usua_Nombre ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Usua_Nombre", AV19Usua_Nombre);
         AV18Usua_Email = A219Usua_Email ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Usua_Email", AV18Usua_Email);
         AV16Usua_Cedula = A26Usua_Cedula ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Usua_Cedula", GXutil.ltrim( GXutil.str( AV16Usua_Cedula, 18, 0)));
         AV13pUsua_Id = A23Usua_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13pUsua_Id", GXutil.ltrim( GXutil.str( AV13pUsua_Id, 18, 0)));
         AV60pUsua_UsuAprueba = A222Usua_UsuAprueba ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
   }

   public void S122( )
   {
      /* 'CARGARROLES' Routine */
      /* Using cursor H00623 */
      pr_default.execute(1, new Object[] {new Long(AV13pUsua_Id)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A23Usua_Id = H00623_A23Usua_Id[0] ;
         A21Rol_Id = H00623_A21Rol_Id[0] ;
         A22Rol_Descripcion = H00623_A22Rol_Descripcion[0] ;
         A402Rol_Tipo = H00623_A402Rol_Tipo[0] ;
         A22Rol_Descripcion = H00623_A22Rol_Descripcion[0] ;
         A402Rol_Tipo = H00623_A402Rol_Tipo[0] ;
         AV44cRol_Id = A21Rol_Id ;
         AV45cRol_Descripcion = A22Rol_Descripcion ;
         AV53cRol_Tipo = A402Rol_Tipo ;
         AV21SDTRolUsuItem = (com.orions2.SdtSDTRolUsu_SDTRolUsuItem)new com.orions2.SdtSDTRolUsu_SDTRolUsuItem(remoteHandle, context);
         AV21SDTRolUsuItem.setgxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_id( AV44cRol_Id );
         AV21SDTRolUsuItem.setgxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_descripcion( AV45cRol_Descripcion );
         AV21SDTRolUsuItem.setgxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_tipo( AV53cRol_Tipo );
         AV20SDTRolUsu.add(AV21SDTRolUsuItem, 0);
         gx_BV63 = true ;
         AV43SDTOriginalRolItem.setgxTv_SdtSDTRolUs_SDTRolUsItem_Rolid( AV44cRol_Id );
         AV43SDTOriginalRolItem.setgxTv_SdtSDTRolUs_SDTRolUsItem_Roldescripcion( AV45cRol_Descripcion );
         AV42SDTOriginalRol.add(AV43SDTOriginalRolItem, 0);
         AV43SDTOriginalRolItem = (com.orions2.SdtSDTRolUs_SDTRolUsItem)new com.orions2.SdtSDTRolUs_SDTRolUsItem(remoteHandle, context);
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S132( )
   {
      /* 'CARGARCENTROS' Routine */
      /* Using cursor H00624 */
      pr_default.execute(2, new Object[] {new Long(AV13pUsua_Id)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A23Usua_Id = H00624_A23Usua_Id[0] ;
         A1Cent_Id = H00624_A1Cent_Id[0] ;
         AV32cCent_Id = A1Cent_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32cCent_Id", GXutil.ltrim( GXutil.str( AV32cCent_Id, 11, 0)));
         /* Execute user subroutine: 'DATOSCENTROCOSTO' */
         S145 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
         AV24SDTCECUsuItem.setgxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_id( AV32cCent_Id );
         AV24SDTCECUsuItem.setgxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_descripcion( AV33cCent_Descripcion );
         AV24SDTCECUsuItem.setgxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_cod( AV34cRegi_Cod );
         AV24SDTCECUsuItem.setgxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_codigo( AV35cCent_Codigo );
         AV24SDTCECUsuItem.setgxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_descripcion( AV62cRegi_Descripcion );
         AV23SDTCECUsu.add(AV24SDTCECUsuItem, 0);
         gx_BV88 = true ;
         AV24SDTCECUsuItem = (com.orions2.SdtSDTCECUsu_SDTCECUsuItem)new com.orions2.SdtSDTCECUsu_SDTCECUsuItem(remoteHandle, context);
         AV31SDTCentroOriginalItem.setgxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centcodigo( AV35cCent_Codigo );
         AV31SDTCentroOriginalItem.setgxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centid( AV32cCent_Id );
         AV31SDTCentroOriginalItem.setgxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Regicod( AV34cRegi_Cod );
         AV31SDTCentroOriginalItem.setgxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Regiabrev( AV56cRegi_Abrev );
         AV30SDTCentroOriginal.add(AV31SDTCentroOriginalItem, 0);
         AV31SDTCentroOriginalItem = (com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem)new com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem(remoteHandle, context);
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S145( )
   {
      /* 'DATOSCENTROCOSTO' Routine */
      /* Using cursor H00625 */
      pr_default.execute(3, new Object[] {new Long(AV32cCent_Id)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A2Regi_Id = H00625_A2Regi_Id[0] ;
         A1Cent_Id = H00625_A1Cent_Id[0] ;
         A4Cent_Descripcion = H00625_A4Cent_Descripcion[0] ;
         A12Regi_Cod = H00625_A12Regi_Cod[0] ;
         A3Cent_Codigo = H00625_A3Cent_Codigo[0] ;
         A154Regi_Abrev = H00625_A154Regi_Abrev[0] ;
         A13Regi_Descripcion = H00625_A13Regi_Descripcion[0] ;
         A12Regi_Cod = H00625_A12Regi_Cod[0] ;
         A154Regi_Abrev = H00625_A154Regi_Abrev[0] ;
         A13Regi_Descripcion = H00625_A13Regi_Descripcion[0] ;
         AV33cCent_Descripcion = A4Cent_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33cCent_Descripcion", AV33cCent_Descripcion);
         AV34cRegi_Cod = A12Regi_Cod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34cRegi_Cod", GXutil.ltrim( GXutil.str( AV34cRegi_Cod, 4, 0)));
         AV35cCent_Codigo = A3Cent_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35cCent_Codigo", AV35cCent_Codigo);
         AV56cRegi_Abrev = A154Regi_Abrev ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56cRegi_Abrev", AV56cRegi_Abrev);
         AV62cRegi_Descripcion = A13Regi_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62cRegi_Descripcion", AV62cRegi_Descripcion);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void e13622( )
   {
      AV70GXV1 = nGXsfl_63_idx ;
      if ( AV20SDTRolUsu.size() >= AV70GXV1 )
      {
         AV20SDTRolUsu.currentItem( ((com.orions2.SdtSDTRolUsu_SDTRolUsuItem)AV20SDTRolUsu.elementAt(-1+AV70GXV1)) );
      }
      /* 'AsignarRol' Routine */
      if ( ( AV12pRol_Id != 0 ) && ( GXutil.strcmp(AV11pRol_Descripcion, "") != 0 ) )
      {
         AV22SWRol = false ;
         AV46SWRolEC = false ;
         AV86GXV3 = 1 ;
         while ( AV86GXV3 <= AV20SDTRolUsu.size() )
         {
            AV21SDTRolUsuItem = (com.orions2.SdtSDTRolUsu_SDTRolUsuItem)((com.orions2.SdtSDTRolUsu_SDTRolUsuItem)AV20SDTRolUsu.elementAt(-1+AV86GXV3));
            if ( AV21SDTRolUsuItem.getgxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_id() == AV12pRol_Id )
            {
               AV22SWRol = true ;
            }
            AV86GXV3 = (int)(AV86GXV3+1) ;
         }
         if ( ! AV22SWRol )
         {
            AV21SDTRolUsuItem = (com.orions2.SdtSDTRolUsu_SDTRolUsuItem)new com.orions2.SdtSDTRolUsu_SDTRolUsuItem(remoteHandle, context);
            AV21SDTRolUsuItem.setgxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_id( AV12pRol_Id );
            AV21SDTRolUsuItem.setgxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_descripcion( AV11pRol_Descripcion );
            AV21SDTRolUsuItem.setgxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_tipo( AV57PRol_Tipo );
            AV20SDTRolUsu.add(AV21SDTRolUsuItem, 0);
            gx_BV63 = true ;
         }
         AV87GXV4 = 1 ;
         while ( AV87GXV4 <= AV47SDTAgregarlRol.size() )
         {
            AV48SDTAgregarRolItem = (com.orions2.SdtSDTRolUs_SDTRolUsItem)((com.orions2.SdtSDTRolUs_SDTRolUsItem)AV47SDTAgregarlRol.elementAt(-1+AV87GXV4));
            if ( AV48SDTAgregarRolItem.getgxTv_SdtSDTRolUs_SDTRolUsItem_Rolid() == AV12pRol_Id )
            {
               AV46SWRolEC = true ;
            }
            AV87GXV4 = (int)(AV87GXV4+1) ;
         }
         if ( ! AV46SWRolEC )
         {
            AV48SDTAgregarRolItem = (com.orions2.SdtSDTRolUs_SDTRolUsItem)new com.orions2.SdtSDTRolUs_SDTRolUsItem(remoteHandle, context);
            AV48SDTAgregarRolItem.setgxTv_SdtSDTRolUs_SDTRolUsItem_Rolid( AV12pRol_Id );
            AV48SDTAgregarRolItem.setgxTv_SdtSDTRolUs_SDTRolUsItem_Roldescripcion( AV11pRol_Descripcion );
            AV47SDTAgregarlRol.add(AV48SDTAgregarRolItem, 0);
         }
         AV12pRol_Id = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12pRol_Id", GXutil.ltrim( GXutil.str( AV12pRol_Id, 11, 0)));
         AV11pRol_Descripcion = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11pRol_Descripcion", AV11pRol_Descripcion);
      }
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20SDTRolUsu", AV20SDTRolUsu);
      nGXsfl_63_bak_idx = nGXsfl_63_idx ;
      gxgrgrid1_refresh( AV8EliminarRol) ;
      nGXsfl_63_idx = nGXsfl_63_bak_idx ;
      sGXsfl_63_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_63_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_632( ) ;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV47SDTAgregarlRol", AV47SDTAgregarlRol);
   }

   public void e21622( )
   {
      AV70GXV1 = nGXsfl_63_idx ;
      if ( AV20SDTRolUsu.size() >= AV70GXV1 )
      {
         AV20SDTRolUsu.currentItem( ((com.orions2.SdtSDTRolUsu_SDTRolUsuItem)AV20SDTRolUsu.elementAt(-1+AV70GXV1)) );
      }
      /* 'EliminarRol' Routine */
      AV46SWRolEC = false ;
      AV20SDTRolUsu.removeItem(AV20SDTRolUsu.indexof(((com.orions2.SdtSDTRolUsu_SDTRolUsuItem)AV20SDTRolUsu.currentItem())));
      gx_BV63 = true ;
      AV88GXV5 = 1 ;
      while ( AV88GXV5 <= AV50SDTEliminadolRol.size() )
      {
         AV49SDTEliminadoRolItem = (com.orions2.SdtSDTRolUs_SDTRolUsItem)((com.orions2.SdtSDTRolUs_SDTRolUsItem)AV50SDTEliminadolRol.elementAt(-1+AV88GXV5));
         if ( AV49SDTEliminadoRolItem.getgxTv_SdtSDTRolUs_SDTRolUsItem_Rolid() == ((com.orions2.SdtSDTRolUsu_SDTRolUsuItem)(AV20SDTRolUsu.currentItem())).getgxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_id() )
         {
            AV46SWRolEC = true ;
         }
         AV88GXV5 = (int)(AV88GXV5+1) ;
      }
      if ( ! AV46SWRolEC )
      {
         AV49SDTEliminadoRolItem = (com.orions2.SdtSDTRolUs_SDTRolUsItem)new com.orions2.SdtSDTRolUs_SDTRolUsItem(remoteHandle, context);
         AV49SDTEliminadoRolItem.setgxTv_SdtSDTRolUs_SDTRolUsItem_Rolid( ((com.orions2.SdtSDTRolUsu_SDTRolUsuItem)(AV20SDTRolUsu.currentItem())).getgxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_id() );
         AV49SDTEliminadoRolItem.setgxTv_SdtSDTRolUs_SDTRolUsItem_Roldescripcion( ((com.orions2.SdtSDTRolUsu_SDTRolUsuItem)(AV20SDTRolUsu.currentItem())).getgxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_descripcion() );
         AV50SDTEliminadolRol.add(AV49SDTEliminadoRolItem, 0);
      }
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20SDTRolUsu", AV20SDTRolUsu);
      nGXsfl_63_bak_idx = nGXsfl_63_idx ;
      gxgrgrid1_refresh( AV8EliminarRol) ;
      nGXsfl_63_idx = nGXsfl_63_bak_idx ;
      sGXsfl_63_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_63_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_632( ) ;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV50SDTEliminadolRol", AV50SDTEliminadolRol);
   }

   public void e14622( )
   {
      AV73GXV2 = nGXsfl_88_idx ;
      if ( AV23SDTCECUsu.size() >= AV73GXV2 )
      {
         AV23SDTCECUsu.currentItem( ((com.orions2.SdtSDTCECUsu_SDTCECUsuItem)AV23SDTCECUsu.elementAt(-1+AV73GXV2)) );
      }
      /* 'AsignarCEC' Routine */
      AV63SDTCentros = AV29websession.getValue("UsuarioCentro") ;
      AV64SDTCentroUsuario.fromxml(AV63SDTCentros, null, null);
      AV89GXV6 = 1 ;
      while ( AV89GXV6 <= AV64SDTCentroUsuario.size() )
      {
         AV65SDTCentroUsuarioItem = (com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem)((com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem)AV64SDTCentroUsuario.elementAt(-1+AV89GXV6));
         if ( AV65SDTCentroUsuarioItem.getgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Seleccion() )
         {
            AV25SWCCE = false ;
            AV36SWCCEC = false ;
            AV90GXV7 = 1 ;
            while ( AV90GXV7 <= AV23SDTCECUsu.size() )
            {
               AV24SDTCECUsuItem = (com.orions2.SdtSDTCECUsu_SDTCECUsuItem)((com.orions2.SdtSDTCECUsu_SDTCECUsuItem)AV23SDTCECUsu.elementAt(-1+AV90GXV7));
               if ( AV24SDTCECUsuItem.getgxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_id() == AV65SDTCentroUsuarioItem.getgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Cent_id() )
               {
                  AV25SWCCE = true ;
               }
               AV90GXV7 = (int)(AV90GXV7+1) ;
            }
            if ( ! AV25SWCCE )
            {
               AV24SDTCECUsuItem = (com.orions2.SdtSDTCECUsu_SDTCECUsuItem)new com.orions2.SdtSDTCECUsu_SDTCECUsuItem(remoteHandle, context);
               AV24SDTCECUsuItem.setgxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_id( AV65SDTCentroUsuarioItem.getgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Cent_id() );
               AV24SDTCECUsuItem.setgxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_descripcion( AV65SDTCentroUsuarioItem.getgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Cent_descripcion() );
               AV24SDTCECUsuItem.setgxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_cod( AV65SDTCentroUsuarioItem.getgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Regi_cod() );
               AV24SDTCECUsuItem.setgxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_codigo( AV65SDTCentroUsuarioItem.getgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Cent_codigo() );
               AV24SDTCECUsuItem.setgxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_abrev( AV65SDTCentroUsuarioItem.getgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Regi_abrev() );
               AV24SDTCECUsuItem.setgxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_descripcion( AV65SDTCentroUsuarioItem.getgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Regi_descripcion() );
               AV23SDTCECUsu.add(AV24SDTCECUsuItem, 0);
               gx_BV88 = true ;
            }
            AV91GXV8 = 1 ;
            while ( AV91GXV8 <= AV37SDTCentroAgregado.size() )
            {
               AV38SDTCentroAgregadoItem = (com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem)((com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem)AV37SDTCentroAgregado.elementAt(-1+AV91GXV8));
               if ( AV38SDTCentroAgregadoItem.getgxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centid() == AV65SDTCentroUsuarioItem.getgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Cent_id() )
               {
                  AV36SWCCEC = true ;
               }
               AV91GXV8 = (int)(AV91GXV8+1) ;
            }
            if ( ! AV36SWCCEC )
            {
               AV38SDTCentroAgregadoItem = (com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem)new com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem(remoteHandle, context);
               AV38SDTCentroAgregadoItem.setgxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centcodigo( AV65SDTCentroUsuarioItem.getgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Cent_codigo() );
               AV38SDTCentroAgregadoItem.setgxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centid( AV65SDTCentroUsuarioItem.getgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Cent_id() );
               AV38SDTCentroAgregadoItem.setgxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Regicod( AV65SDTCentroUsuarioItem.getgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Regi_cod() );
               AV38SDTCentroAgregadoItem.setgxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Regiabrev( AV65SDTCentroUsuarioItem.getgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Regi_abrev() );
               AV37SDTCentroAgregado.add(AV38SDTCentroAgregadoItem, 0);
            }
         }
         AV89GXV6 = (int)(AV89GXV6+1) ;
      }
      AV9pCent_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9pCent_Descripcion", AV9pCent_Descripcion);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24SDTCECUsuItem", AV24SDTCECUsuItem);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23SDTCECUsu", AV23SDTCECUsu);
      nGXsfl_88_bak_idx = nGXsfl_88_idx ;
      gxgrgrid2_refresh( AV7EliminarCEC) ;
      nGXsfl_88_idx = nGXsfl_88_bak_idx ;
      sGXsfl_88_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_88_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_887( ) ;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV37SDTCentroAgregado", AV37SDTCentroAgregado);
   }

   public void e17622( )
   {
      AV73GXV2 = nGXsfl_88_idx ;
      if ( AV23SDTCECUsu.size() >= AV73GXV2 )
      {
         AV23SDTCECUsu.currentItem( ((com.orions2.SdtSDTCECUsu_SDTCECUsuItem)AV23SDTCECUsu.elementAt(-1+AV73GXV2)) );
      }
      /* 'EliminarCEC' Routine */
      AV36SWCCEC = false ;
      AV23SDTCECUsu.removeItem(AV23SDTCECUsu.indexof(((com.orions2.SdtSDTCECUsu_SDTCECUsuItem)AV23SDTCECUsu.currentItem())));
      gx_BV88 = true ;
      AV92GXV9 = 1 ;
      while ( AV92GXV9 <= AV39SDTCentroEliminado.size() )
      {
         AV40SDTCentroEliminadoItem = (com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem)((com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem)AV39SDTCentroEliminado.elementAt(-1+AV92GXV9));
         if ( AV40SDTCentroEliminadoItem.getgxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centid() == ((com.orions2.SdtSDTCECUsu_SDTCECUsuItem)(AV23SDTCECUsu.currentItem())).getgxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_id() )
         {
            AV36SWCCEC = true ;
         }
         AV92GXV9 = (int)(AV92GXV9+1) ;
      }
      if ( ! AV36SWCCEC )
      {
         AV40SDTCentroEliminadoItem = (com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem)new com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem(remoteHandle, context);
         AV40SDTCentroEliminadoItem.setgxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centcodigo( ((com.orions2.SdtSDTCECUsu_SDTCECUsuItem)(AV23SDTCECUsu.currentItem())).getgxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_codigo() );
         AV40SDTCentroEliminadoItem.setgxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centid( ((com.orions2.SdtSDTCECUsu_SDTCECUsuItem)(AV23SDTCECUsu.currentItem())).getgxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_id() );
         AV40SDTCentroEliminadoItem.setgxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Regicod( ((com.orions2.SdtSDTCECUsu_SDTCECUsuItem)(AV23SDTCECUsu.currentItem())).getgxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_cod() );
         AV40SDTCentroEliminadoItem.setgxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Regiabrev( ((com.orions2.SdtSDTCECUsu_SDTCECUsuItem)(AV23SDTCECUsu.currentItem())).getgxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_abrev() );
         AV39SDTCentroEliminado.add(AV40SDTCentroEliminadoItem, 0);
      }
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23SDTCECUsu", AV23SDTCECUsu);
      nGXsfl_88_bak_idx = nGXsfl_88_idx ;
      gxgrgrid2_refresh( AV7EliminarCEC) ;
      nGXsfl_88_idx = nGXsfl_88_bak_idx ;
      sGXsfl_88_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_88_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_887( ) ;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SDTCentroEliminado", AV39SDTCentroEliminado);
   }

   public void e15622( )
   {
      AV73GXV2 = nGXsfl_88_idx ;
      if ( AV23SDTCECUsu.size() >= AV73GXV2 )
      {
         AV23SDTCECUsu.currentItem( ((com.orions2.SdtSDTCECUsu_SDTCECUsuItem)AV23SDTCECUsu.elementAt(-1+AV73GXV2)) );
      }
      AV70GXV1 = nGXsfl_63_idx ;
      if ( AV20SDTRolUsu.size() >= AV70GXV1 )
      {
         AV20SDTRolUsu.currentItem( ((com.orions2.SdtSDTRolUsu_SDTRolUsuItem)AV20SDTRolUsu.elementAt(-1+AV70GXV1)) );
      }
      /* 'CONFIRMAR' Routine */
      if ( AV20SDTRolUsu.size() > 0 )
      {
         AV54SWValida = (short)(0) ;
      }
      else
      {
         AV54SWValida = (short)(1) ;
         httpContext.GX_msglist.addItem("ERROR..  Debe asignar mínimo un rol para el usuario");
      }
      AV58SWValidaCE = (short)(0) ;
      AV93GXV10 = 1 ;
      while ( AV93GXV10 <= AV20SDTRolUsu.size() )
      {
         AV21SDTRolUsuItem = (com.orions2.SdtSDTRolUsu_SDTRolUsuItem)((com.orions2.SdtSDTRolUsu_SDTRolUsuItem)AV20SDTRolUsu.elementAt(-1+AV93GXV10));
         if ( GXutil.strcmp(AV21SDTRolUsuItem.getgxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_tipo(), "U") == 0 )
         {
            if ( AV23SDTCECUsu.size() == 0 )
            {
               AV58SWValidaCE = (short)(1) ;
               httpContext.GX_msglist.addItem("ERROR..  Debe asignar mínimo un Centro de Costo al usuario");
            }
         }
         AV93GXV10 = (int)(AV93GXV10+1) ;
      }
      if ( ( AV54SWValida == 0 ) && ( AV58SWValidaCE == 0 ) )
      {
         AV51SDTEditarRol.setgxTv_SdtSDTEditarRol_Usuacodigo( AV17Usua_Codigo );
         AV51SDTEditarRol.setgxTv_SdtSDTEditarRol_Usuanombre( AV19Usua_Nombre );
         AV51SDTEditarRol.setgxTv_SdtSDTEditarRol_Usuacedula( AV16Usua_Cedula );
         AV51SDTEditarRol.setgxTv_SdtSDTEditarRol_Usuausuaprueba( AV59Usua_UsuAprueba );
         AV51SDTEditarRol.setgxTv_SdtSDTEditarRol_Usuausuariomodifica( AV28Usuario );
         AV51SDTEditarRol.setgxTv_SdtSDTEditarRol_Usuafechamodifica( GXutil.now( ) );
         AV51SDTEditarRol.setgxTv_SdtSDTEditarRol_Segrolcollection( AV42SDTOriginalRol );
         AV51SDTEditarRol.setgxTv_SdtSDTEditarRol_Segrolcollectionagregado( AV47SDTAgregarlRol );
         AV51SDTEditarRol.setgxTv_SdtSDTEditarRol_Segrolcollectioneliminado( AV50SDTEliminadolRol );
         AV51SDTEditarRol.setgxTv_SdtSDTEditarRol_Gencentrocostocollection( AV30SDTCentroOriginal );
         AV51SDTEditarRol.setgxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado( AV37SDTCentroAgregado );
         AV51SDTEditarRol.setgxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado( AV39SDTCentroEliminado );
         GXv_int1[0] = AV13pUsua_Id ;
         GXv_char2[0] = AV17Usua_Codigo ;
         GXv_objcol_SdtSDTRolUsu_SDTRolUsuItem3[0] = AV20SDTRolUsu ;
         GXv_objcol_SdtSDTCECUsu_SDTCECUsuItem4[0] = AV23SDTCECUsu ;
         GXv_char5[0] = AV28Usuario ;
         new com.orions2.pr_usuariorol(remoteHandle, context).execute( GXv_int1, GXv_char2, GXv_objcol_SdtSDTRolUsu_SDTRolUsuItem3, GXv_objcol_SdtSDTCECUsu_SDTCECUsuItem4, GXv_char5) ;
         wpseg_usuariorol_impl.this.AV13pUsua_Id = GXv_int1[0] ;
         wpseg_usuariorol_impl.this.AV17Usua_Codigo = GXv_char2[0] ;
         AV20SDTRolUsu = GXv_objcol_SdtSDTRolUsu_SDTRolUsuItem3[0] ;
         AV23SDTCECUsu = GXv_objcol_SdtSDTCECUsu_SDTCECUsuItem4[0] ;
         wpseg_usuariorol_impl.this.AV28Usuario = GXv_char5[0] ;
         gx_BV63 = true ;
         gx_BV88 = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13pUsua_Id", GXutil.ltrim( GXutil.str( AV13pUsua_Id, 18, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "AV17Usua_Codigo", AV17Usua_Codigo);
         httpContext.ajax_rsp_assign_attri("", false, "AV28Usuario", AV28Usuario);
         GXv_char5[0] = AV67Integra ;
         new com.orions2.parametrosintegracion(remoteHandle, context).execute( GXv_char5) ;
         wpseg_usuariorol_impl.this.AV67Integra = GXv_char5[0] ;
         if ( GXutil.strcmp(AV67Integra, "SI") == 0 )
         {
            if ( ( AV42SDTOriginalRol.size() > 0 ) || ( AV30SDTCentroOriginal.size() > 0 ) )
            {
               GXv_SdtSDTEditarRol6[0] = AV51SDTEditarRol;
               GXv_int1[0] = AV13pUsua_Id ;
               GXv_char5[0] = AV28Usuario ;
               new com.orions2.ws_dat_usu(remoteHandle, context).execute( GXv_SdtSDTEditarRol6, GXv_int1, GXv_char5) ;
               AV51SDTEditarRol = GXv_SdtSDTEditarRol6[0] ;
               wpseg_usuariorol_impl.this.AV13pUsua_Id = GXv_int1[0] ;
               wpseg_usuariorol_impl.this.AV28Usuario = GXv_char5[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13pUsua_Id", GXutil.ltrim( GXutil.str( AV13pUsua_Id, 18, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "AV28Usuario", AV28Usuario);
            }
            else
            {
               GXv_int1[0] = AV13pUsua_Id ;
               GXv_char5[0] = "INS" ;
               new com.orions2.wscreausuario(remoteHandle, context).execute( GXv_int1, GXv_char5) ;
               wpseg_usuariorol_impl.this.AV13pUsua_Id = GXv_int1[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13pUsua_Id", GXutil.ltrim( GXutil.str( AV13pUsua_Id, 18, 0)));
            }
         }
         AV20SDTRolUsu.clear();
         gx_BV63 = true ;
         AV23SDTCECUsu.clear();
         gx_BV88 = true ;
         AV30SDTCentroOriginal.clear();
         AV37SDTCentroAgregado.clear();
         AV39SDTCentroEliminado.clear();
         AV42SDTOriginalRol.clear();
         AV47SDTAgregarlRol.clear();
         AV50SDTEliminadolRol.clear();
         httpContext.setWebReturnParms(new Object[] {new Long(AV13pUsua_Id)});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV51SDTEditarRol", AV51SDTEditarRol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23SDTCECUsu", AV23SDTCECUsu);
      nGXsfl_88_bak_idx = nGXsfl_88_idx ;
      gxgrgrid2_refresh( AV7EliminarCEC) ;
      nGXsfl_88_idx = nGXsfl_88_bak_idx ;
      sGXsfl_88_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_88_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_887( ) ;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20SDTRolUsu", AV20SDTRolUsu);
      nGXsfl_63_bak_idx = nGXsfl_63_idx ;
      gxgrgrid1_refresh( AV8EliminarRol) ;
      nGXsfl_63_idx = nGXsfl_63_bak_idx ;
      sGXsfl_63_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_63_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_632( ) ;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30SDTCentroOriginal", AV30SDTCentroOriginal);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV37SDTCentroAgregado", AV37SDTCentroAgregado);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39SDTCentroEliminado", AV39SDTCentroEliminado);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV42SDTOriginalRol", AV42SDTOriginalRol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV47SDTAgregarlRol", AV47SDTAgregarlRol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV50SDTEliminadolRol", AV50SDTEliminadolRol);
   }

   public void e16622( )
   {
      /* 'Cancelar' Routine */
      AV20SDTRolUsu.clear();
      gx_BV63 = true ;
      AV23SDTCECUsu.clear();
      gx_BV88 = true ;
      httpContext.setWebReturnParms(new Object[] {new Long(AV13pUsua_Id)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20SDTRolUsu", AV20SDTRolUsu);
      nGXsfl_63_bak_idx = nGXsfl_63_idx ;
      gxgrgrid1_refresh( AV8EliminarRol) ;
      nGXsfl_63_idx = nGXsfl_63_bak_idx ;
      sGXsfl_63_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_63_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_632( ) ;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23SDTCECUsu", AV23SDTCECUsu);
      nGXsfl_88_bak_idx = nGXsfl_88_idx ;
      gxgrgrid2_refresh( AV7EliminarCEC) ;
      nGXsfl_88_idx = nGXsfl_88_bak_idx ;
      sGXsfl_88_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_88_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_887( ) ;
   }

   public void e18622( )
   {
      /* Grid2_Refresh Routine */
      AV7EliminarCEC = context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEliminarcec_Internalname, "Bitmap", ((GXutil.strcmp("", AV7EliminarCEC)==0) ? AV81Eliminarcec_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV7EliminarCEC))), !bGXsfl_88_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavEliminarcec_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV7EliminarCEC), true);
      AV81Eliminarcec_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEliminarcec_Internalname, "Bitmap", ((GXutil.strcmp("", AV7EliminarCEC)==0) ? AV81Eliminarcec_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV7EliminarCEC))), !bGXsfl_88_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavEliminarcec_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV7EliminarCEC), true);
   }

   public void e22622( )
   {
      /* Grid1_Refresh Routine */
      AV8EliminarRol = context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEliminarrol_Internalname, "Bitmap", ((GXutil.strcmp("", AV8EliminarRol)==0) ? AV80Eliminarrol_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV8EliminarRol))), !bGXsfl_63_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavEliminarrol_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV8EliminarRol), true);
      AV80Eliminarrol_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEliminarrol_Internalname, "Bitmap", ((GXutil.strcmp("", AV8EliminarRol)==0) ? AV80Eliminarrol_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV8EliminarRol))), !bGXsfl_63_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavEliminarrol_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV8EliminarRol), true);
   }

   private void e23622( )
   {
      /* Grid1_Load Routine */
      AV70GXV1 = (short)(1) ;
      while ( AV70GXV1 <= AV20SDTRolUsu.size() )
      {
         AV20SDTRolUsu.currentItem( ((com.orions2.SdtSDTRolUsu_SDTRolUsuItem)AV20SDTRolUsu.elementAt(-1+AV70GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(63) ;
         }
         sendrow_632( ) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_63_Refreshing )
         {
            httpContext.doAjaxLoad(63, Grid1Row);
         }
         AV70GXV1 = (short)(AV70GXV1+1) ;
      }
   }

   private void e19627( )
   {
      /* Grid2_Load Routine */
      AV73GXV2 = (short)(1) ;
      while ( AV73GXV2 <= AV23SDTCECUsu.size() )
      {
         AV23SDTCECUsu.currentItem( ((com.orions2.SdtSDTCECUsu_SDTCECUsuItem)AV23SDTCECUsu.elementAt(-1+AV73GXV2)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(88) ;
         }
         sendrow_887( ) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_88_Refreshing )
         {
            httpContext.doAjaxLoad(88, Grid2Row);
         }
         AV73GXV2 = (short)(AV73GXV2+1) ;
      }
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
      pa622( ) ;
      ws622( ) ;
      we622( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20186141420891");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("wpseg_usuariorol.js", "?20186141420891");
      /* End function include_jscripts */
   }

   public void subsflControlProps_632( )
   {
      edtavCtlrol_id_Internalname = "CTLROL_ID_"+sGXsfl_63_idx ;
      edtavCtlrol_descripcion_Internalname = "CTLROL_DESCRIPCION_"+sGXsfl_63_idx ;
      edtavEliminarrol_Internalname = "vELIMINARROL_"+sGXsfl_63_idx ;
   }

   public void subsflControlProps_fel_632( )
   {
      edtavCtlrol_id_Internalname = "CTLROL_ID_"+sGXsfl_63_fel_idx ;
      edtavCtlrol_descripcion_Internalname = "CTLROL_DESCRIPCION_"+sGXsfl_63_fel_idx ;
      edtavEliminarrol_Internalname = "vELIMINARROL_"+sGXsfl_63_fel_idx ;
   }

   public void sendrow_632( )
   {
      subsflControlProps_632( ) ;
      wb620( ) ;
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
         if ( ((int)((nGXsfl_63_idx) % (2))) == 0 )
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
         httpContext.writeText( " gxrow=\""+sGXsfl_63_idx+"\">") ;
      }
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlrol_id_Internalname,GXutil.ltrim( localUtil.ntoc( ((com.orions2.SdtSDTRolUsu_SDTRolUsuItem)AV20SDTRolUsu.elementAt(-1+AV70GXV1)).getgxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_id(), (byte)(11), (byte)(0), ",", "")),((edtavCtlrol_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTRolUsu_SDTRolUsuItem)AV20SDTRolUsu.elementAt(-1+AV70GXV1)).getgxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_id()), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTRolUsu_SDTRolUsuItem)AV20SDTRolUsu.elementAt(-1+AV70GXV1)).getgxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_id()), "ZZZZZZZZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlrol_id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(edtavCtlrol_id_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(63),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlrol_descripcion_Internalname,((com.orions2.SdtSDTRolUsu_SDTRolUsuItem)AV20SDTRolUsu.elementAt(-1+AV70GXV1)).getgxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_descripcion(),GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTRolUsu_SDTRolUsuItem)AV20SDTRolUsu.elementAt(-1+AV70GXV1)).getgxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_descripcion(), "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlrol_descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavCtlrol_descripcion_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(63),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
      }
      /* Active Bitmap Variable */
      TempTags = " " + ((edtavEliminarrol_Enabled!=0)&&(edtavEliminarrol_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 66,'',false,'',63)\"" : " ") ;
      ClassString = "DeleteAttribute" ;
      StyleString = "" ;
      AV8EliminarRol_IsBlob = (boolean)(((GXutil.strcmp("", AV8EliminarRol)==0)&&(GXutil.strcmp("", AV80Eliminarrol_GXI)==0))||!(GXutil.strcmp("", AV8EliminarRol)==0)) ;
      sImgUrl = ((GXutil.strcmp("", AV8EliminarRol)==0) ? AV80Eliminarrol_GXI : httpContext.getResourceRelative(AV8EliminarRol)) ;
      Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavEliminarrol_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"",edtavEliminarrol_Tooltiptext,new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(5),edtavEliminarrol_Jsonclick,"'"+""+"'"+",false,"+"'"+"E\\'ELIMINARROL\\'."+sGXsfl_63_idx+"'",StyleString,ClassString,"WWActionColumn","","",""+TempTags,"","",new Integer(1),new Boolean(AV8EliminarRol_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLROL_ID"+"_"+sGXsfl_63_idx, getSecureSignedToken( sGXsfl_63_idx, localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTRolUsu_SDTRolUsuItem)AV20SDTRolUsu.elementAt(-1+AV70GXV1)).getgxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_id()), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLROL_DESCRIPCION"+"_"+sGXsfl_63_idx, getSecureSignedToken( sGXsfl_63_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTRolUsu_SDTRolUsuItem)AV20SDTRolUsu.elementAt(-1+AV70GXV1)).getgxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_descripcion(), "@!"))));
      Grid1Container.AddRow(Grid1Row);
      nGXsfl_63_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_63_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_63_idx+1)) ;
      sGXsfl_63_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_63_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_632( ) ;
      /* End function sendrow_632 */
   }

   public void subsflControlProps_887( )
   {
      edtavCtlregi_cod_Internalname = "CTLREGI_COD_"+sGXsfl_88_idx ;
      edtavCtlregi_descripcion_Internalname = "CTLREGI_DESCRIPCION_"+sGXsfl_88_idx ;
      edtavCtlcent_codigo_Internalname = "CTLCENT_CODIGO_"+sGXsfl_88_idx ;
      edtavCtlcent_descripcion1_Internalname = "CTLCENT_DESCRIPCION1_"+sGXsfl_88_idx ;
      edtavEliminarcec_Internalname = "vELIMINARCEC_"+sGXsfl_88_idx ;
      edtavCtlcent_id1_Internalname = "CTLCENT_ID1_"+sGXsfl_88_idx ;
      edtavCtlregi_abrev_Internalname = "CTLREGI_ABREV_"+sGXsfl_88_idx ;
   }

   public void subsflControlProps_fel_887( )
   {
      edtavCtlregi_cod_Internalname = "CTLREGI_COD_"+sGXsfl_88_fel_idx ;
      edtavCtlregi_descripcion_Internalname = "CTLREGI_DESCRIPCION_"+sGXsfl_88_fel_idx ;
      edtavCtlcent_codigo_Internalname = "CTLCENT_CODIGO_"+sGXsfl_88_fel_idx ;
      edtavCtlcent_descripcion1_Internalname = "CTLCENT_DESCRIPCION1_"+sGXsfl_88_fel_idx ;
      edtavEliminarcec_Internalname = "vELIMINARCEC_"+sGXsfl_88_fel_idx ;
      edtavCtlcent_id1_Internalname = "CTLCENT_ID1_"+sGXsfl_88_fel_idx ;
      edtavCtlregi_abrev_Internalname = "CTLREGI_ABREV_"+sGXsfl_88_fel_idx ;
   }

   public void sendrow_887( )
   {
      subsflControlProps_887( ) ;
      wb620( ) ;
      Grid2Row = GXWebRow.GetNew(context,Grid2Container) ;
      if ( subGrid2_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         subGrid2_Backcolor = subGrid2_Allbackcolor ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Uniform" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
         subGrid2_Backcolor = (int)(0x0) ;
      }
      else if ( subGrid2_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_88_idx) % (2))) == 0 )
         {
            subGrid2_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Even" ;
            }
         }
         else
         {
            subGrid2_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Odd" ;
            }
         }
      }
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr ") ;
         httpContext.writeText( " class=\""+"WorkWith"+"\" style=\""+""+"\"") ;
         httpContext.writeText( " gxrow=\""+sGXsfl_88_idx+"\">") ;
      }
      /* Subfile cell */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlregi_cod_Internalname,GXutil.ltrim( localUtil.ntoc( ((com.orions2.SdtSDTCECUsu_SDTCECUsuItem)AV23SDTCECUsu.elementAt(-1+AV73GXV2)).getgxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_cod(), (byte)(4), (byte)(0), ",", "")),((edtavCtlregi_cod_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTCECUsu_SDTCECUsuItem)AV23SDTCECUsu.elementAt(-1+AV73GXV2)).getgxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_cod()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTCECUsu_SDTCECUsuItem)AV23SDTCECUsu.elementAt(-1+AV73GXV2)).getgxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_cod()), "ZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlregi_cod_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlregi_cod_Enabled),new Integer(0),"text","",new Integer(30),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(88),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlregi_descripcion_Internalname,((com.orions2.SdtSDTCECUsu_SDTCECUsuItem)AV23SDTCECUsu.elementAt(-1+AV73GXV2)).getgxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_descripcion(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlregi_descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlregi_descripcion_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(88),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlcent_codigo_Internalname,((com.orions2.SdtSDTCECUsu_SDTCECUsuItem)AV23SDTCECUsu.elementAt(-1+AV73GXV2)).getgxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_codigo(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlcent_codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlcent_codigo_Enabled),new Integer(0),"text","",new Integer(60),"px",new Integer(17),"px",new Integer(16),new Integer(0),new Integer(0),new Integer(88),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlcent_descripcion1_Internalname,((com.orions2.SdtSDTCECUsu_SDTCECUsuItem)AV23SDTCECUsu.elementAt(-1+AV73GXV2)).getgxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_descripcion(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlcent_descripcion1_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlcent_descripcion1_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(88),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
      }
      /* Active Bitmap Variable */
      TempTags = " " + ((edtavEliminarcec_Enabled!=0)&&(edtavEliminarcec_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 93,'',false,'',88)\"" : " ") ;
      ClassString = "DeleteAttribute" ;
      StyleString = "" ;
      AV7EliminarCEC_IsBlob = (boolean)(((GXutil.strcmp("", AV7EliminarCEC)==0)&&(GXutil.strcmp("", AV81Eliminarcec_GXI)==0))||!(GXutil.strcmp("", AV7EliminarCEC)==0)) ;
      sImgUrl = ((GXutil.strcmp("", AV7EliminarCEC)==0) ? AV81Eliminarcec_GXI : httpContext.getResourceRelative(AV7EliminarCEC)) ;
      Grid2Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavEliminarcec_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"",edtavEliminarcec_Tooltiptext,new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(5),edtavEliminarcec_Jsonclick,"'"+""+"'"+",false,"+"'"+"E\\'ELIMINARCEC\\'."+sGXsfl_88_idx+"'",StyleString,ClassString,"WWActionColumn","","",""+TempTags,"","",new Integer(1),new Boolean(AV7EliminarCEC_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlcent_id1_Internalname,GXutil.ltrim( localUtil.ntoc( ((com.orions2.SdtSDTCECUsu_SDTCECUsuItem)AV23SDTCECUsu.elementAt(-1+AV73GXV2)).getgxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_id(), (byte)(11), (byte)(0), ",", "")),((edtavCtlcent_id1_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTCECUsu_SDTCECUsuItem)AV23SDTCECUsu.elementAt(-1+AV73GXV2)).getgxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_id()), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTCECUsu_SDTCECUsuItem)AV23SDTCECUsu.elementAt(-1+AV73GXV2)).getgxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_id()), "ZZZZZZZZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlcent_id1_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(edtavCtlcent_id1_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(88),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlregi_abrev_Internalname,((com.orions2.SdtSDTCECUsu_SDTCECUsuItem)AV23SDTCECUsu.elementAt(-1+AV73GXV2)).getgxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_abrev(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlregi_abrev_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(edtavCtlregi_abrev_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(15),new Integer(0),new Integer(0),new Integer(88),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      Grid2Container.AddRow(Grid2Row);
      nGXsfl_88_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_88_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_88_idx+1)) ;
      sGXsfl_88_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_88_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_887( ) ;
      /* End function sendrow_887 */
   }

   public void init_default_properties( )
   {
      lblTitle_Internalname = "TITLE" ;
      divTitlecontainer_Internalname = "TITLECONTAINER" ;
      edtavPusua_id_Internalname = "vPUSUA_ID" ;
      edtavUsua_codigo_Internalname = "vUSUA_CODIGO" ;
      edtavUsua_nombre_Internalname = "vUSUA_NOMBRE" ;
      edtavUsua_email_Internalname = "vUSUA_EMAIL" ;
      edtavUsua_cedula_Internalname = "vUSUA_CEDULA" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      imgImage1_Internalname = "IMAGE1" ;
      edtavProl_descripcion_Internalname = "vPROL_DESCRIPCION" ;
      bttAsignarrol_Internalname = "ASIGNARROL" ;
      edtavProl_id_Internalname = "vPROL_ID" ;
      edtavCtlrol_id_Internalname = "CTLROL_ID" ;
      edtavCtlrol_descripcion_Internalname = "CTLROL_DESCRIPCION" ;
      edtavEliminarrol_Internalname = "vELIMINARROL" ;
      divTable1_Internalname = "TABLE1" ;
      divTable2_Internalname = "TABLE2" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      imgImage2_Internalname = "IMAGE2" ;
      edtavPcent_descripcion_Internalname = "vPCENT_DESCRIPCION" ;
      bttAsignarcec_Internalname = "ASIGNARCEC" ;
      edtavCtlregi_cod_Internalname = "CTLREGI_COD" ;
      edtavCtlregi_descripcion_Internalname = "CTLREGI_DESCRIPCION" ;
      edtavCtlcent_codigo_Internalname = "CTLCENT_CODIGO" ;
      edtavCtlcent_descripcion1_Internalname = "CTLCENT_DESCRIPCION1" ;
      edtavEliminarcec_Internalname = "vELIMINARCEC" ;
      edtavCtlcent_id1_Internalname = "CTLCENT_ID1" ;
      edtavCtlregi_abrev_Internalname = "CTLREGI_ABREV" ;
      divTable4_Internalname = "TABLE4" ;
      divTable3_Internalname = "TABLE3" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttButton1_Internalname = "BUTTON1" ;
      bttButton2_Internalname = "BUTTON2" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
      subGrid2_Internalname = "GRID2" ;
   }

   public void initialize_properties( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      edtavCtlregi_abrev_Jsonclick = "" ;
      edtavCtlcent_id1_Jsonclick = "" ;
      edtavEliminarcec_Jsonclick = "" ;
      edtavEliminarcec_Visible = -1 ;
      edtavEliminarcec_Enabled = 1 ;
      edtavCtlcent_descripcion1_Jsonclick = "" ;
      edtavCtlcent_codigo_Jsonclick = "" ;
      edtavCtlregi_descripcion_Jsonclick = "" ;
      edtavCtlregi_cod_Jsonclick = "" ;
      edtavEliminarrol_Jsonclick = "" ;
      edtavEliminarrol_Visible = -1 ;
      edtavEliminarrol_Enabled = 1 ;
      edtavCtlrol_descripcion_Jsonclick = "" ;
      edtavCtlrol_id_Jsonclick = "" ;
      edtavCtlregi_abrev_Enabled = -1 ;
      edtavCtlcent_id1_Enabled = -1 ;
      edtavCtlcent_descripcion1_Enabled = -1 ;
      edtavCtlcent_codigo_Enabled = -1 ;
      edtavCtlregi_descripcion_Enabled = -1 ;
      edtavCtlregi_cod_Enabled = -1 ;
      edtavCtlrol_descripcion_Enabled = -1 ;
      edtavCtlrol_id_Enabled = -1 ;
      subGrid2_Allowcollapsing = (byte)(0) ;
      subGrid2_Allowselection = (byte)(0) ;
      edtavCtlregi_abrev_Enabled = 0 ;
      edtavCtlcent_id1_Enabled = 0 ;
      edtavCtlcent_descripcion1_Enabled = 0 ;
      edtavCtlcent_codigo_Enabled = 0 ;
      edtavCtlregi_descripcion_Enabled = 0 ;
      edtavCtlregi_cod_Enabled = 0 ;
      subGrid2_Class = "WorkWith" ;
      subGrid2_Backcolorstyle = (byte)(0) ;
      bttAsignarcec_Enabled = 1 ;
      edtavPcent_descripcion_Jsonclick = "" ;
      edtavPcent_descripcion_Enabled = 1 ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtavCtlrol_descripcion_Enabled = 0 ;
      edtavCtlrol_id_Enabled = 0 ;
      subGrid1_Class = "WorkWith" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavProl_id_Jsonclick = "" ;
      edtavProl_id_Enabled = 1 ;
      edtavProl_id_Visible = 1 ;
      bttAsignarrol_Enabled = 1 ;
      edtavProl_descripcion_Jsonclick = "" ;
      edtavProl_descripcion_Enabled = 1 ;
      edtavUsua_cedula_Jsonclick = "" ;
      edtavUsua_cedula_Enabled = 1 ;
      edtavUsua_email_Jsonclick = "" ;
      edtavUsua_email_Enabled = 1 ;
      edtavUsua_nombre_Jsonclick = "" ;
      edtavUsua_nombre_Enabled = 1 ;
      edtavUsua_codigo_Jsonclick = "" ;
      edtavUsua_codigo_Enabled = 1 ;
      edtavUsua_codigo_Visible = 1 ;
      edtavPusua_id_Jsonclick = "" ;
      edtavPusua_id_Enabled = 0 ;
      edtavPusua_id_Visible = 1 ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "USUARIO ROL" );
      edtavEliminarcec_Tooltiptext = "Eliminar centro costo" ;
      edtavEliminarrol_Tooltiptext = "Eliminar rol" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'AV20SDTRolUsu',fld:'vSDTROLUSU',grid:63,pic:'',nv:null},{av:'AV8EliminarRol',fld:'vELIMINARROL',pic:'',nv:''},{av:'edtavEliminarrol_Tooltiptext',ctrl:'vELIMINARROL',prop:'Tooltiptext'},{av:'GRID2_nFirstRecordOnPage',nv:0},{av:'GRID2_nEOF',nv:0},{av:'AV23SDTCECUsu',fld:'vSDTCECUSU',grid:88,pic:'',nv:null},{av:'AV7EliminarCEC',fld:'vELIMINARCEC',pic:'',nv:''},{av:'edtavEliminarcec_Tooltiptext',ctrl:'vELIMINARCEC',prop:'Tooltiptext'}],oparms:[]}");
      setEventMetadata("'BUSCARROL'","{handler:'e11621',iparms:[],oparms:[{av:'AV57PRol_Tipo',fld:'vPROL_TIPO',pic:'',nv:''},{av:'AV11pRol_Descripcion',fld:'vPROL_DESCRIPCION',pic:'@!',nv:''},{av:'AV12pRol_Id',fld:'vPROL_ID',pic:'ZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("'ASIGNARROL'","{handler:'e13622',iparms:[{av:'AV12pRol_Id',fld:'vPROL_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV11pRol_Descripcion',fld:'vPROL_DESCRIPCION',pic:'@!',nv:''},{av:'AV20SDTRolUsu',fld:'vSDTROLUSU',grid:63,pic:'',nv:null},{av:'AV57PRol_Tipo',fld:'vPROL_TIPO',pic:'',nv:''},{av:'AV47SDTAgregarlRol',fld:'vSDTAGREGARLROL',pic:'',nv:null},{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'AV8EliminarRol',fld:'vELIMINARROL',pic:'',nv:''},{av:'edtavEliminarrol_Tooltiptext',ctrl:'vELIMINARROL',prop:'Tooltiptext'}],oparms:[{av:'AV20SDTRolUsu',fld:'vSDTROLUSU',grid:63,pic:'',nv:null},{av:'AV47SDTAgregarlRol',fld:'vSDTAGREGARLROL',pic:'',nv:null},{av:'AV12pRol_Id',fld:'vPROL_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV11pRol_Descripcion',fld:'vPROL_DESCRIPCION',pic:'@!',nv:''}]}");
      setEventMetadata("'ELIMINARROL'","{handler:'e21622',iparms:[{av:'AV20SDTRolUsu',fld:'vSDTROLUSU',grid:63,pic:'',nv:null},{av:'AV50SDTEliminadolRol',fld:'vSDTELIMINADOLROL',pic:'',nv:null},{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'AV8EliminarRol',fld:'vELIMINARROL',pic:'',nv:''},{av:'edtavEliminarrol_Tooltiptext',ctrl:'vELIMINARROL',prop:'Tooltiptext'}],oparms:[{av:'AV20SDTRolUsu',fld:'vSDTROLUSU',grid:63,pic:'',nv:null},{av:'AV50SDTEliminadolRol',fld:'vSDTELIMINADOLROL',pic:'',nv:null}]}");
      setEventMetadata("'BUSCARCEC'","{handler:'e12621',iparms:[],oparms:[{av:'AV9pCent_Descripcion',fld:'vPCENT_DESCRIPCION',pic:'',nv:''}]}");
      setEventMetadata("'ASIGNARCEC'","{handler:'e14622',iparms:[{av:'AV23SDTCECUsu',fld:'vSDTCECUSU',grid:88,pic:'',nv:null},{av:'AV37SDTCentroAgregado',fld:'vSDTCENTROAGREGADO',pic:'',nv:null},{av:'GRID2_nFirstRecordOnPage',nv:0},{av:'GRID2_nEOF',nv:0},{av:'AV7EliminarCEC',fld:'vELIMINARCEC',pic:'',nv:''},{av:'edtavEliminarcec_Tooltiptext',ctrl:'vELIMINARCEC',prop:'Tooltiptext'}],oparms:[{av:'AV24SDTCECUsuItem',fld:'vSDTCECUSUITEM',pic:'',nv:null},{av:'AV23SDTCECUsu',fld:'vSDTCECUSU',grid:88,pic:'',nv:null},{av:'AV37SDTCentroAgregado',fld:'vSDTCENTROAGREGADO',pic:'',nv:null},{av:'AV9pCent_Descripcion',fld:'vPCENT_DESCRIPCION',pic:'',nv:''}]}");
      setEventMetadata("'ELIMINARCEC'","{handler:'e17622',iparms:[{av:'AV23SDTCECUsu',fld:'vSDTCECUSU',grid:88,pic:'',nv:null},{av:'AV39SDTCentroEliminado',fld:'vSDTCENTROELIMINADO',pic:'',nv:null},{av:'GRID2_nFirstRecordOnPage',nv:0},{av:'GRID2_nEOF',nv:0},{av:'AV7EliminarCEC',fld:'vELIMINARCEC',pic:'',nv:''},{av:'edtavEliminarcec_Tooltiptext',ctrl:'vELIMINARCEC',prop:'Tooltiptext'}],oparms:[{av:'AV23SDTCECUsu',fld:'vSDTCECUSU',grid:88,pic:'',nv:null},{av:'AV39SDTCentroEliminado',fld:'vSDTCENTROELIMINADO',pic:'',nv:null}]}");
      setEventMetadata("'CONFIRMAR'","{handler:'e15622',iparms:[{av:'AV20SDTRolUsu',fld:'vSDTROLUSU',grid:63,pic:'',nv:null},{av:'AV23SDTCECUsu',fld:'vSDTCECUSU',grid:88,pic:'',nv:null},{av:'AV17Usua_Codigo',fld:'vUSUA_CODIGO',pic:'@!',nv:''},{av:'AV51SDTEditarRol',fld:'vSDTEDITARROL',pic:'',nv:null},{av:'AV19Usua_Nombre',fld:'vUSUA_NOMBRE',pic:'',nv:''},{av:'AV16Usua_Cedula',fld:'vUSUA_CEDULA',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV59Usua_UsuAprueba',fld:'vUSUA_USUAPRUEBA',pic:'',nv:''},{av:'AV28Usuario',fld:'vUSUARIO',pic:'@!',nv:''},{av:'AV42SDTOriginalRol',fld:'vSDTORIGINALROL',pic:'',nv:null},{av:'AV47SDTAgregarlRol',fld:'vSDTAGREGARLROL',pic:'',nv:null},{av:'AV50SDTEliminadolRol',fld:'vSDTELIMINADOLROL',pic:'',nv:null},{av:'AV30SDTCentroOriginal',fld:'vSDTCENTROORIGINAL',pic:'',nv:null},{av:'AV37SDTCentroAgregado',fld:'vSDTCENTROAGREGADO',pic:'',nv:null},{av:'AV39SDTCentroEliminado',fld:'vSDTCENTROELIMINADO',pic:'',nv:null},{av:'AV13pUsua_Id',fld:'vPUSUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'GRID2_nFirstRecordOnPage',nv:0},{av:'GRID2_nEOF',nv:0},{av:'AV7EliminarCEC',fld:'vELIMINARCEC',pic:'',nv:''},{av:'edtavEliminarcec_Tooltiptext',ctrl:'vELIMINARCEC',prop:'Tooltiptext'},{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'AV8EliminarRol',fld:'vELIMINARROL',pic:'',nv:''},{av:'edtavEliminarrol_Tooltiptext',ctrl:'vELIMINARROL',prop:'Tooltiptext'}],oparms:[{av:'AV51SDTEditarRol',fld:'vSDTEDITARROL',pic:'',nv:null},{av:'AV28Usuario',fld:'vUSUARIO',pic:'@!',nv:''},{av:'AV23SDTCECUsu',fld:'vSDTCECUSU',grid:88,pic:'',nv:null},{av:'AV20SDTRolUsu',fld:'vSDTROLUSU',grid:63,pic:'',nv:null},{av:'AV17Usua_Codigo',fld:'vUSUA_CODIGO',pic:'@!',nv:''},{av:'AV13pUsua_Id',fld:'vPUSUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV30SDTCentroOriginal',fld:'vSDTCENTROORIGINAL',pic:'',nv:null},{av:'AV37SDTCentroAgregado',fld:'vSDTCENTROAGREGADO',pic:'',nv:null},{av:'AV39SDTCentroEliminado',fld:'vSDTCENTROELIMINADO',pic:'',nv:null},{av:'AV42SDTOriginalRol',fld:'vSDTORIGINALROL',pic:'',nv:null},{av:'AV47SDTAgregarlRol',fld:'vSDTAGREGARLROL',pic:'',nv:null},{av:'AV50SDTEliminadolRol',fld:'vSDTELIMINADOLROL',pic:'',nv:null}]}");
      setEventMetadata("'CANCELAR'","{handler:'e16622',iparms:[{av:'AV13pUsua_Id',fld:'vPUSUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV20SDTRolUsu',fld:'vSDTROLUSU',grid:63,pic:'',nv:null},{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'AV8EliminarRol',fld:'vELIMINARROL',pic:'',nv:''},{av:'edtavEliminarrol_Tooltiptext',ctrl:'vELIMINARROL',prop:'Tooltiptext'},{av:'AV23SDTCECUsu',fld:'vSDTCECUSU',grid:88,pic:'',nv:null},{av:'GRID2_nFirstRecordOnPage',nv:0},{av:'GRID2_nEOF',nv:0},{av:'AV7EliminarCEC',fld:'vELIMINARCEC',pic:'',nv:''},{av:'edtavEliminarcec_Tooltiptext',ctrl:'vELIMINARCEC',prop:'Tooltiptext'}],oparms:[{av:'AV20SDTRolUsu',fld:'vSDTROLUSU',grid:63,pic:'',nv:null},{av:'AV23SDTCECUsu',fld:'vSDTCECUSU',grid:88,pic:'',nv:null}]}");
      setEventMetadata("GRID2.REFRESH","{handler:'e18622',iparms:[],oparms:[{av:'AV7EliminarCEC',fld:'vELIMINARCEC',pic:'',nv:''}]}");
      setEventMetadata("GRID1.REFRESH","{handler:'e22622',iparms:[],oparms:[{av:'AV8EliminarRol',fld:'vELIMINARROL',pic:'',nv:''}]}");
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
      AV8EliminarRol = "" ;
      GXKey = "" ;
      forbiddenHiddens = "" ;
      AV19Usua_Nombre = "" ;
      AV7EliminarCEC = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV23SDTCECUsu = new GXBaseCollection<com.orions2.SdtSDTCECUsu_SDTCECUsuItem>(com.orions2.SdtSDTCECUsu_SDTCECUsuItem.class, "SDTCECUsu.SDTCECUsuItem", "ACBSENA", remoteHandle);
      AV20SDTRolUsu = new GXBaseCollection<com.orions2.SdtSDTRolUsu_SDTRolUsuItem>(com.orions2.SdtSDTRolUsu_SDTRolUsuItem.class, "SDTRolUsu.SDTRolUsuItem", "ACBSENA", remoteHandle);
      AV57PRol_Tipo = "" ;
      AV47SDTAgregarlRol = new GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem>(com.orions2.SdtSDTRolUs_SDTRolUsItem.class, "SDTRolUs.SDTRolUsItem", "ACBSENA", remoteHandle);
      AV50SDTEliminadolRol = new GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem>(com.orions2.SdtSDTRolUs_SDTRolUsItem.class, "SDTRolUs.SDTRolUsItem", "ACBSENA", remoteHandle);
      AV37SDTCentroAgregado = new GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem>(com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem.class, "SDTCentroUsu.SDTCentroUsuItem", "ACBSENA", remoteHandle);
      AV39SDTCentroEliminado = new GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem>(com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem.class, "SDTCentroUsu.SDTCentroUsuItem", "ACBSENA", remoteHandle);
      AV51SDTEditarRol = new com.orions2.SdtSDTEditarRol(remoteHandle, context);
      AV59Usua_UsuAprueba = "" ;
      AV28Usuario = "" ;
      AV42SDTOriginalRol = new GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem>(com.orions2.SdtSDTRolUs_SDTRolUsItem.class, "SDTRolUs.SDTRolUsItem", "ACBSENA", remoteHandle);
      AV30SDTCentroOriginal = new GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem>(com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem.class, "SDTCentroUsu.SDTCentroUsuItem", "ACBSENA", remoteHandle);
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblTitle_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      AV17Usua_Codigo = "" ;
      AV18Usua_Email = "" ;
      lblTextblock1_Jsonclick = "" ;
      sImgUrl = "" ;
      imgImage1_Jsonclick = "" ;
      AV11pRol_Descripcion = "" ;
      bttAsignarrol_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      lblTextblock3_Jsonclick = "" ;
      imgImage2_Jsonclick = "" ;
      AV9pCent_Descripcion = "" ;
      bttAsignarcec_Jsonclick = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      subGrid2_Linesclass = "" ;
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      bttButton1_Jsonclick = "" ;
      bttButton2_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV81Eliminarcec_GXI = "" ;
      AV80Eliminarrol_GXI = "" ;
      hsh = "" ;
      AV29websession = httpContext.getWebSession();
      scmdbuf = "" ;
      H00622_A23Usua_Id = new long[1] ;
      H00622_A24Usua_Codigo = new String[] {""} ;
      H00622_A25Usua_Nombre = new String[] {""} ;
      H00622_A219Usua_Email = new String[] {""} ;
      H00622_A26Usua_Cedula = new long[1] ;
      H00622_A222Usua_UsuAprueba = new String[] {""} ;
      A24Usua_Codigo = "" ;
      A25Usua_Nombre = "" ;
      A219Usua_Email = "" ;
      A222Usua_UsuAprueba = "" ;
      AV60pUsua_UsuAprueba = "" ;
      H00623_A23Usua_Id = new long[1] ;
      H00623_A21Rol_Id = new long[1] ;
      H00623_A22Rol_Descripcion = new String[] {""} ;
      H00623_A402Rol_Tipo = new String[] {""} ;
      A22Rol_Descripcion = "" ;
      A402Rol_Tipo = "" ;
      AV45cRol_Descripcion = "" ;
      AV53cRol_Tipo = "" ;
      AV21SDTRolUsuItem = new com.orions2.SdtSDTRolUsu_SDTRolUsuItem(remoteHandle, context);
      AV43SDTOriginalRolItem = new com.orions2.SdtSDTRolUs_SDTRolUsItem(remoteHandle, context);
      H00624_A23Usua_Id = new long[1] ;
      H00624_A1Cent_Id = new long[1] ;
      AV24SDTCECUsuItem = new com.orions2.SdtSDTCECUsu_SDTCECUsuItem(remoteHandle, context);
      AV33cCent_Descripcion = "" ;
      AV35cCent_Codigo = "" ;
      AV62cRegi_Descripcion = "" ;
      AV31SDTCentroOriginalItem = new com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem(remoteHandle, context);
      AV56cRegi_Abrev = "" ;
      H00625_A2Regi_Id = new long[1] ;
      H00625_A1Cent_Id = new long[1] ;
      H00625_A4Cent_Descripcion = new String[] {""} ;
      H00625_A12Regi_Cod = new short[1] ;
      H00625_A3Cent_Codigo = new String[] {""} ;
      H00625_A154Regi_Abrev = new String[] {""} ;
      H00625_A13Regi_Descripcion = new String[] {""} ;
      A4Cent_Descripcion = "" ;
      A3Cent_Codigo = "" ;
      A154Regi_Abrev = "" ;
      A13Regi_Descripcion = "" ;
      AV48SDTAgregarRolItem = new com.orions2.SdtSDTRolUs_SDTRolUsItem(remoteHandle, context);
      AV49SDTEliminadoRolItem = new com.orions2.SdtSDTRolUs_SDTRolUsItem(remoteHandle, context);
      AV63SDTCentros = "" ;
      AV64SDTCentroUsuario = new GXBaseCollection<com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem>(com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem.class, "SDTCentroUsuario.SDTCentroUsuarioItem", "ACBSENA", remoteHandle);
      AV65SDTCentroUsuarioItem = new com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem(remoteHandle, context);
      AV38SDTCentroAgregadoItem = new com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem(remoteHandle, context);
      AV40SDTCentroEliminadoItem = new com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem(remoteHandle, context);
      GXv_char2 = new String [1] ;
      GXv_objcol_SdtSDTRolUsu_SDTRolUsuItem3 = new GXBaseCollection [1] ;
      GXv_objcol_SdtSDTCECUsu_SDTCECUsuItem4 = new GXBaseCollection [1] ;
      AV67Integra = "" ;
      GXv_SdtSDTEditarRol6 = new com.orions2.SdtSDTEditarRol [1] ;
      GXv_int1 = new long [1] ;
      GXv_char5 = new String [1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wpseg_usuariorol__default(),
         new Object[] {
             new Object[] {
            H00622_A23Usua_Id, H00622_A24Usua_Codigo, H00622_A25Usua_Nombre, H00622_A219Usua_Email, H00622_A26Usua_Cedula, H00622_A222Usua_UsuAprueba
            }
            , new Object[] {
            H00623_A23Usua_Id, H00623_A21Rol_Id, H00623_A22Rol_Descripcion, H00623_A402Rol_Tipo
            }
            , new Object[] {
            H00624_A23Usua_Id, H00624_A1Cent_Id
            }
            , new Object[] {
            H00625_A2Regi_Id, H00625_A1Cent_Id, H00625_A4Cent_Descripcion, H00625_A12Regi_Cod, H00625_A3Cent_Codigo, H00625_A154Regi_Abrev, H00625_A13Regi_Descripcion
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavPusua_id_Enabled = 0 ;
      edtavUsua_codigo_Enabled = 0 ;
      edtavUsua_nombre_Enabled = 0 ;
      edtavUsua_email_Enabled = 0 ;
      edtavUsua_cedula_Enabled = 0 ;
      edtavProl_id_Enabled = 0 ;
      edtavCtlrol_id_Enabled = 0 ;
      edtavCtlrol_descripcion_Enabled = 0 ;
      edtavPcent_descripcion_Enabled = 0 ;
      edtavCtlregi_cod_Enabled = 0 ;
      edtavCtlregi_descripcion_Enabled = 0 ;
      edtavCtlcent_codigo_Enabled = 0 ;
      edtavCtlcent_descripcion1_Enabled = 0 ;
      edtavCtlcent_id1_Enabled = 0 ;
      edtavCtlregi_abrev_Enabled = 0 ;
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
   private byte subGrid2_Backcolorstyle ;
   private byte subGrid2_Titlebackstyle ;
   private byte subGrid2_Allowselection ;
   private byte subGrid2_Allowhovering ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private byte nDonePA ;
   private byte GRID1_nEOF ;
   private byte GRID2_nEOF ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private byte subGrid2_Backstyle ;
   private short nRC_GXsfl_63 ;
   private short nGXsfl_63_idx=1 ;
   private short nRC_GXsfl_88 ;
   private short nGXsfl_88_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV70GXV1 ;
   private short AV73GXV2 ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short nGXsfl_63_fel_idx=1 ;
   private short nGXsfl_88_fel_idx=1 ;
   private short AV34cRegi_Cod ;
   private short A12Regi_Cod ;
   private short nGXsfl_63_bak_idx=1 ;
   private short nGXsfl_88_bak_idx=1 ;
   private short AV54SWValida ;
   private short AV58SWValidaCE ;
   private int edtavPusua_id_Enabled ;
   private int edtavPusua_id_Visible ;
   private int edtavUsua_codigo_Visible ;
   private int edtavUsua_codigo_Enabled ;
   private int edtavUsua_nombre_Enabled ;
   private int edtavUsua_email_Enabled ;
   private int edtavUsua_cedula_Enabled ;
   private int edtavProl_descripcion_Enabled ;
   private int bttAsignarrol_Enabled ;
   private int edtavProl_id_Enabled ;
   private int edtavProl_id_Visible ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavCtlrol_id_Enabled ;
   private int edtavCtlrol_descripcion_Enabled ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtavPcent_descripcion_Enabled ;
   private int bttAsignarcec_Enabled ;
   private int subGrid2_Titlebackcolor ;
   private int subGrid2_Allbackcolor ;
   private int edtavCtlregi_cod_Enabled ;
   private int edtavCtlregi_descripcion_Enabled ;
   private int edtavCtlcent_codigo_Enabled ;
   private int edtavCtlcent_descripcion1_Enabled ;
   private int edtavCtlcent_id1_Enabled ;
   private int edtavCtlregi_abrev_Enabled ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int subGrid2_Islastpage ;
   private int AV86GXV3 ;
   private int AV87GXV4 ;
   private int AV88GXV5 ;
   private int AV89GXV6 ;
   private int AV90GXV7 ;
   private int AV91GXV8 ;
   private int AV92GXV9 ;
   private int AV93GXV10 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int edtavEliminarrol_Enabled ;
   private int edtavEliminarrol_Visible ;
   private int subGrid2_Backcolor ;
   private int edtavEliminarcec_Enabled ;
   private int edtavEliminarcec_Visible ;
   private long wcpOAV13pUsua_Id ;
   private long AV16Usua_Cedula ;
   private long AV13pUsua_Id ;
   private long AV12pRol_Id ;
   private long GRID1_nCurrentRecord ;
   private long GRID2_nCurrentRecord ;
   private long AV52Usua_Id ;
   private long A23Usua_Id ;
   private long A26Usua_Cedula ;
   private long A21Rol_Id ;
   private long AV44cRol_Id ;
   private long A1Cent_Id ;
   private long AV32cCent_Id ;
   private long A2Regi_Id ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private long GXv_int1[] ;
   private String edtavEliminarrol_Tooltiptext ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_63_idx="0001" ;
   private String edtavEliminarrol_Internalname ;
   private String GXKey ;
   private String forbiddenHiddens ;
   private String sGXsfl_88_idx="0001" ;
   private String edtavEliminarcec_Tooltiptext ;
   private String edtavEliminarcec_Internalname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV57PRol_Tipo ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String divTitlecontainer_Internalname ;
   private String lblTitle_Internalname ;
   private String lblTitle_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divFormcontainer_Internalname ;
   private String edtavPusua_id_Internalname ;
   private String edtavPusua_id_Jsonclick ;
   private String edtavUsua_codigo_Internalname ;
   private String TempTags ;
   private String edtavUsua_codigo_Jsonclick ;
   private String edtavUsua_nombre_Internalname ;
   private String edtavUsua_nombre_Jsonclick ;
   private String edtavUsua_email_Internalname ;
   private String edtavUsua_email_Jsonclick ;
   private String edtavUsua_cedula_Internalname ;
   private String edtavUsua_cedula_Jsonclick ;
   private String divTable2_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String divTable1_Internalname ;
   private String sImgUrl ;
   private String imgImage1_Internalname ;
   private String imgImage1_Jsonclick ;
   private String edtavProl_descripcion_Internalname ;
   private String edtavProl_descripcion_Jsonclick ;
   private String bttAsignarrol_Internalname ;
   private String bttAsignarrol_Jsonclick ;
   private String edtavProl_id_Internalname ;
   private String edtavProl_id_Jsonclick ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String divTable3_Internalname ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String divTable4_Internalname ;
   private String imgImage2_Internalname ;
   private String imgImage2_Jsonclick ;
   private String edtavPcent_descripcion_Internalname ;
   private String edtavPcent_descripcion_Jsonclick ;
   private String bttAsignarcec_Internalname ;
   private String bttAsignarcec_Jsonclick ;
   private String subGrid2_Internalname ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String bttButton1_Internalname ;
   private String bttButton1_Jsonclick ;
   private String bttButton2_Internalname ;
   private String bttButton2_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavCtlrol_id_Internalname ;
   private String edtavCtlrol_descripcion_Internalname ;
   private String edtavCtlregi_cod_Internalname ;
   private String edtavCtlregi_descripcion_Internalname ;
   private String edtavCtlcent_codigo_Internalname ;
   private String edtavCtlcent_descripcion1_Internalname ;
   private String edtavCtlcent_id1_Internalname ;
   private String edtavCtlregi_abrev_Internalname ;
   private String sGXsfl_63_fel_idx="0001" ;
   private String sGXsfl_88_fel_idx="0001" ;
   private String hsh ;
   private String scmdbuf ;
   private String A402Rol_Tipo ;
   private String AV53cRol_Tipo ;
   private String GXv_char2[] ;
   private String AV67Integra ;
   private String GXv_char5[] ;
   private String ROClassString ;
   private String edtavCtlrol_id_Jsonclick ;
   private String edtavCtlrol_descripcion_Jsonclick ;
   private String edtavEliminarrol_Jsonclick ;
   private String edtavCtlregi_cod_Jsonclick ;
   private String edtavCtlregi_descripcion_Jsonclick ;
   private String edtavCtlcent_codigo_Jsonclick ;
   private String edtavCtlcent_descripcion1_Jsonclick ;
   private String edtavEliminarcec_Jsonclick ;
   private String edtavCtlcent_id1_Jsonclick ;
   private String edtavCtlregi_abrev_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean bGXsfl_63_Refreshing=false ;
   private boolean bGXsfl_88_Refreshing=false ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean gx_BV63 ;
   private boolean gx_BV88 ;
   private boolean AV22SWRol ;
   private boolean AV46SWRolEC ;
   private boolean AV25SWCCE ;
   private boolean AV36SWCCEC ;
   private boolean AV8EliminarRol_IsBlob ;
   private boolean AV7EliminarCEC_IsBlob ;
   private String AV63SDTCentros ;
   private String AV19Usua_Nombre ;
   private String AV59Usua_UsuAprueba ;
   private String AV28Usuario ;
   private String AV17Usua_Codigo ;
   private String AV18Usua_Email ;
   private String AV11pRol_Descripcion ;
   private String AV9pCent_Descripcion ;
   private String AV81Eliminarcec_GXI ;
   private String AV80Eliminarrol_GXI ;
   private String A24Usua_Codigo ;
   private String A25Usua_Nombre ;
   private String A219Usua_Email ;
   private String A222Usua_UsuAprueba ;
   private String AV60pUsua_UsuAprueba ;
   private String A22Rol_Descripcion ;
   private String AV45cRol_Descripcion ;
   private String AV33cCent_Descripcion ;
   private String AV35cCent_Codigo ;
   private String AV62cRegi_Descripcion ;
   private String AV56cRegi_Abrev ;
   private String A4Cent_Descripcion ;
   private String A3Cent_Codigo ;
   private String A154Regi_Abrev ;
   private String A13Regi_Descripcion ;
   private String AV8EliminarRol ;
   private String AV7EliminarCEC ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV29websession ;
   private com.orions2.SdtSDTRolUs_SDTRolUsItem AV43SDTOriginalRolItem ;
   private com.orions2.SdtSDTCECUsu_SDTCECUsuItem AV24SDTCECUsuItem ;
   private com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem AV31SDTCentroOriginalItem ;
   private IDataStoreProvider pr_default ;
   private long[] H00622_A23Usua_Id ;
   private String[] H00622_A24Usua_Codigo ;
   private String[] H00622_A25Usua_Nombre ;
   private String[] H00622_A219Usua_Email ;
   private long[] H00622_A26Usua_Cedula ;
   private String[] H00622_A222Usua_UsuAprueba ;
   private long[] H00623_A23Usua_Id ;
   private long[] H00623_A21Rol_Id ;
   private String[] H00623_A22Rol_Descripcion ;
   private String[] H00623_A402Rol_Tipo ;
   private long[] H00624_A23Usua_Id ;
   private long[] H00624_A1Cent_Id ;
   private long[] H00625_A2Regi_Id ;
   private long[] H00625_A1Cent_Id ;
   private String[] H00625_A4Cent_Descripcion ;
   private short[] H00625_A12Regi_Cod ;
   private String[] H00625_A3Cent_Codigo ;
   private String[] H00625_A154Regi_Abrev ;
   private String[] H00625_A13Regi_Descripcion ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem> AV64SDTCentroUsuario ;
   private GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem> AV47SDTAgregarlRol ;
   private GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem> AV50SDTEliminadolRol ;
   private GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem> AV42SDTOriginalRol ;
   private GXBaseCollection<com.orions2.SdtSDTCECUsu_SDTCECUsuItem> AV23SDTCECUsu ;
   private GXBaseCollection<com.orions2.SdtSDTCECUsu_SDTCECUsuItem> GXv_objcol_SdtSDTCECUsu_SDTCECUsuItem4[] ;
   private GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> AV37SDTCentroAgregado ;
   private GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> AV39SDTCentroEliminado ;
   private GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> AV30SDTCentroOriginal ;
   private GXBaseCollection<com.orions2.SdtSDTRolUsu_SDTRolUsuItem> AV20SDTRolUsu ;
   private GXBaseCollection<com.orions2.SdtSDTRolUsu_SDTRolUsuItem> GXv_objcol_SdtSDTRolUsu_SDTRolUsuItem3[] ;
   private com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem AV65SDTCentroUsuarioItem ;
   private com.orions2.SdtSDTRolUs_SDTRolUsItem AV48SDTAgregarRolItem ;
   private com.orions2.SdtSDTRolUs_SDTRolUsItem AV49SDTEliminadoRolItem ;
   private com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem AV38SDTCentroAgregadoItem ;
   private com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem AV40SDTCentroEliminadoItem ;
   private com.orions2.SdtSDTEditarRol AV51SDTEditarRol ;
   private com.orions2.SdtSDTEditarRol GXv_SdtSDTEditarRol6[] ;
   private com.orions2.SdtSDTRolUsu_SDTRolUsuItem AV21SDTRolUsuItem ;
}

final  class wpseg_usuariorol__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00622", "SELECT Usua_Id, Usua_Codigo, Usua_Nombre, Usua_Email, Usua_Cedula, Usua_UsuAprueba FROM SEG_USUARIO WHERE Usua_Id = ? ORDER BY Usua_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00623", "SELECT T1.Usua_Id, T1.Rol_Id, T2.Rol_Descripcion, T2.Rol_Tipo FROM (SEG_USUARIO_ROL T1 INNER JOIN SEG_ROL T2 ON T2.Rol_Id = T1.Rol_Id) WHERE T1.Usua_Id = ? ORDER BY T1.Usua_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H00624", "SELECT Usua_Id, Cent_Id FROM SEG_USUARIO_CENTRO WHERE Usua_Id = ? ORDER BY Usua_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H00625", "SELECT T1.Regi_Id, T1.Cent_Id, T1.Cent_Descripcion, T2.Regi_Cod, T1.Cent_Codigo, T2.Regi_Abrev, T2.Regi_Descripcion FROM (GEN_CENTROCOSTO T1 INNER JOIN GEN_REGIONAL T2 ON T2.Regi_Id = T1.Regi_Id) WHERE T1.Cent_Id = ? ORDER BY T1.Cent_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getString(4, 1) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
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
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 1 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 2 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

