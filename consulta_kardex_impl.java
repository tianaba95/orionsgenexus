/*
               File: consulta_kardex_impl
        Description: Consulta_Kardex
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:22:3.70
       Program type: Main program
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consulta_kardex_impl extends GXDataArea
{
   public consulta_kardex_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public consulta_kardex_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consulta_kardex_impl.class ));
   }

   public consulta_kardex_impl( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void executeCmdLine( String args[] )
   {
      nGotPars = 1 ;
      webExecute();
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
            nRC_GXsfl_76 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_76_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_76_idx = httpContext.GetNextPar( ) ;
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
            AV53Tipo_codigo = GXutil.lval( httpContext.GetNextPar( )) ;
            AV30kard_Elem = httpContext.GetNextPar( ) ;
            AV13Cata_Descripcion = httpContext.GetNextPar( ) ;
            AV55tipo_elemento = GXutil.lval( httpContext.GetNextPar( )) ;
            A66Elem_Consecutivo = httpContext.GetNextPar( ) ;
            A33Tipo_Codigo = GXutil.lval( httpContext.GetNextPar( )) ;
            A298Cata_Descripcion = httpContext.GetNextPar( ) ;
            AV46Regi_cod = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV23FechaInicial = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
            A577Kard_Regi_Cod = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            A578Kard_Cent_Cod = httpContext.GetNextPar( ) ;
            AV14Cent_Codigo = httpContext.GetNextPar( ) ;
            A87Kard_Alm_Cod = httpContext.GetNextPar( ) ;
            AV6Alma_Codigo = httpContext.GetNextPar( ) ;
            A88Kard_Bod_Cod = httpContext.GetNextPar( ) ;
            AV8Bode_Codigo = httpContext.GetNextPar( ) ;
            A89Kard_Elem_Cons = httpContext.GetNextPar( ) ;
            A579Mov_Tpmp_Codigo = httpContext.GetNextPar( ) ;
            A90Mov_Trans = GXutil.lval( httpContext.GetNextPar( )) ;
            A580Mov_Fecha = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
            A582Mov_Entrada_Cant = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            n582Mov_Entrada_Cant = false ;
            A583Mov_Entrada_Valor = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            n583Mov_Entrada_Valor = false ;
            A584Mov_Salida_Cant = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            n584Mov_Salida_Cant = false ;
            A585Mov_Salida_Valor = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            n585Mov_Salida_Valor = false ;
            AV22FechaFinal = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
            AV57Tran_ConsecutivoCC = GXutil.lval( httpContext.GetNextPar( )) ;
            AV58Tran_FechaRatificacion = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
            A46Tran_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            AV44Mov_Trans = GXutil.lval( httpContext.GetNextPar( )) ;
            A513Tran_ConsecutivoCC = GXutil.lval( httpContext.GetNextPar( )) ;
            n513Tran_ConsecutivoCC = false ;
            A390Tran_FechaRatificacion = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
            n390Tran_FechaRatificacion = false ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV53Tipo_codigo, AV30kard_Elem, AV13Cata_Descripcion, AV55tipo_elemento, A66Elem_Consecutivo, A33Tipo_Codigo, A298Cata_Descripcion, AV46Regi_cod, AV23FechaInicial, A577Kard_Regi_Cod, A578Kard_Cent_Cod, AV14Cent_Codigo, A87Kard_Alm_Cod, AV6Alma_Codigo, A88Kard_Bod_Cod, AV8Bode_Codigo, A89Kard_Elem_Cons, A579Mov_Tpmp_Codigo, A90Mov_Trans, A580Mov_Fecha, A582Mov_Entrada_Cant, A583Mov_Entrada_Valor, A584Mov_Salida_Cant, A585Mov_Salida_Valor, AV22FechaFinal, AV57Tran_ConsecutivoCC, AV58Tran_FechaRatificacion, A46Tran_Id, AV44Mov_Trans, A513Tran_ConsecutivoCC, A390Tran_FechaRatificacion) ;
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
      pa7J2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start7J2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20186141422384");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("calendar-es.js", "?"+httpContext.getBuildNumber( 113785));
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.consulta_kardex") +"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_76", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_76, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_CONSECUTIVO", A66Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TIPO_CODIGO", GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CATA_DESCRIPCION", A298Cata_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "KARD_REGI_COD", GXutil.ltrim( localUtil.ntoc( A577Kard_Regi_Cod, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "KARD_CENT_COD", A578Kard_Cent_Cod);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "KARD_ALM_COD", A87Kard_Alm_Cod);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "KARD_BOD_COD", A88Kard_Bod_Cod);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "KARD_ELEM_CONS", A89Kard_Elem_Cons);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "MOV_TPMP_CODIGO", A579Mov_Tpmp_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "MOV_TRANS", GXutil.ltrim( localUtil.ntoc( A90Mov_Trans, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "MOV_FECHA", localUtil.dtoc( A580Mov_Fecha, 0, "/"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "MOV_ENTRADA_CANT", GXutil.ltrim( localUtil.ntoc( A582Mov_Entrada_Cant, (byte)(8), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "MOV_ENTRADA_VALOR", GXutil.ltrim( localUtil.ntoc( A583Mov_Entrada_Valor, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "MOV_SALIDA_CANT", GXutil.ltrim( localUtil.ntoc( A584Mov_Salida_Cant, (byte)(8), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "MOV_SALIDA_VALOR", GXutil.ltrim( localUtil.ntoc( A585Mov_Salida_Valor, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_ID", GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CONSECUTIVOCC", GXutil.ltrim( localUtil.ntoc( A513Tran_ConsecutivoCC, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_FECHARATIFICACION", localUtil.ttoc( A390Tran_FechaRatificacion, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TIPO_DESCRIPCION", A253Tipo_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_DESCRIPCION", A557Elem_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "REGI_COD", GXutil.ltrim( localUtil.ntoc( A12Regi_Cod, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "REGI_DESCRIPCION", A13Regi_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_CODIGO", A3Cent_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_DESCRIPCION", A4Cent_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_CODIGO", A28Alma_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_DESCRIPCION", A252Alma_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BODE_CODIGO", A31Bode_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BODE_DESCRIPCION", A251Bode_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
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
         we7J2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt7J2( ) ;
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
      return formatLink("com.orions2.consulta_kardex")  ;
   }

   public String getPgmname( )
   {
      return "Consulta_Kardex" ;
   }

   public String getPgmdesc( )
   {
      return "Consulta_Kardex" ;
   }

   public void wb7J0( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTitlecontainer_Internalname, 1, 0, "px", 0, "px", "TableTop", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Inventario Kardex", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_Consulta_Kardex.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable17_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 col-lg-1", "left", "Middle", "", "", "div");
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage7_Internalname, sImgUrl, imgImage7_Link, "", "", context.getHttpContext().getTheme( ), 1, 1, "Seleccionar Rol", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_Consulta_Kardex.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "Middle", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "Middle", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-7 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTipo_codigo_Internalname, "Tipo de Elemento:", "col-sm-3 col-lg-5 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'" + sGXsfl_76_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTipo_codigo_Internalname, GXutil.ltrim( localUtil.ntoc( AV53Tipo_codigo, (byte)(18), (byte)(0), ",", "")), ((edtavTipo_codigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV53Tipo_codigo), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV53Tipo_codigo), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,21);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipo_codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtavTipo_codigo_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Consulta_Kardex.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "Middle", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "Middle", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'" + sGXsfl_76_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTipo_descripcion_Internalname, AV54Tipo_Descripcion, GXutil.rtrim( localUtil.format( AV54Tipo_Descripcion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,24);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipo_descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtavTipo_descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Consulta_Kardex.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "Middle", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 col-lg-1", "left", "Middle", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage6_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgImage6_Jsonclick, "'"+""+"'"+",false,"+"'"+"EIMAGE6.CLICK."+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_Consulta_Kardex.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "Middle", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 col-lg-3", "left", "Middle", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-7 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavKard_elem_Internalname, "Consecutivo:", "col-sm-3 col-lg-5 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'" + sGXsfl_76_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavKard_elem_Internalname, AV30kard_Elem, GXutil.rtrim( localUtil.format( AV30kard_Elem, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavKard_elem_Jsonclick, 0, "Attribute", "", "", "", 1, edtavKard_elem_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Consulta_Kardex.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "Middle", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 col-lg-3", "left", "Middle", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'" + sGXsfl_76_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavElem_descripcion_Internalname, AV18Elem_Descripcion, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", (short)(0), 1, edtavElem_descripcion_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Consulta_Kardex.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "Middle", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 col-lg-1", "left", "Middle", "", "", "div");
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage1_Internalname, sImgUrl, imgImage1_Link, "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_Consulta_Kardex.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "Middle", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "Middle", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-7 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavRegi_cod_Internalname, "Regional:", "col-sm-3 col-lg-5 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_76_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavRegi_cod_Internalname, GXutil.ltrim( localUtil.ntoc( AV46Regi_cod, (byte)(4), (byte)(0), ",", "")), ((edtavRegi_cod_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV46Regi_cod), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV46Regi_cod), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRegi_cod_Jsonclick, 0, "Attribute", "", "", "", 1, edtavRegi_cod_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Consulta_Kardex.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "Middle", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "Middle", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_76_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavRegi_descripcion_Internalname, AV48Regi_Descripcion, GXutil.rtrim( localUtil.format( AV48Regi_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRegi_descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtavRegi_descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Consulta_Kardex.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "Middle", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 col-lg-1", "left", "Middle", "", "", "div");
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage2_Internalname, sImgUrl, imgImage2_Link, "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_Consulta_Kardex.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "Middle", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 col-lg-3", "left", "Middle", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-7 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCent_codigo_Internalname, "Centro de Costo:", "col-sm-3 col-lg-5 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_76_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCent_codigo_Internalname, AV14Cent_Codigo, GXutil.rtrim( localUtil.format( AV14Cent_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCent_codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCent_codigo_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Consulta_Kardex.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "Middle", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 col-lg-3", "left", "Middle", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_76_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCent_descripcion_Internalname, AV15Cent_Descripcion, GXutil.rtrim( localUtil.format( AV15Cent_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCent_descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCent_descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Consulta_Kardex.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "Middle", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 col-lg-1", "left", "Middle", "", "", "div");
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage3_Internalname, sImgUrl, imgImage3_Link, "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_Consulta_Kardex.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "Middle", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "Middle", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-7 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavAlma_codigo_Internalname, "Almacen:", "col-sm-3 col-lg-5 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_76_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavAlma_codigo_Internalname, AV6Alma_Codigo, GXutil.rtrim( localUtil.format( AV6Alma_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlma_codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtavAlma_codigo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Consulta_Kardex.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "Middle", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "Middle", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_76_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavAlma_descripcion_Internalname, AV7Alma_Descripcion, GXutil.rtrim( localUtil.format( AV7Alma_Descripcion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlma_descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtavAlma_descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Consulta_Kardex.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "Middle", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 col-lg-1", "left", "Middle", "", "", "div");
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage4_Internalname, sImgUrl, imgImage4_Link, "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_Consulta_Kardex.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "Middle", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 col-lg-3", "left", "Middle", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-7 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavBode_codigo_Internalname, "Bodega:", "col-sm-3 col-lg-5 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_76_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavBode_codigo_Internalname, AV8Bode_Codigo, GXutil.rtrim( localUtil.format( AV8Bode_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBode_codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtavBode_codigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Consulta_Kardex.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "Middle", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 col-lg-3", "left", "Middle", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_76_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavBode_descripcion_Internalname, AV9Bode_Descripcion, GXutil.rtrim( localUtil.format( AV9Bode_Descripcion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBode_descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtavBode_descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Consulta_Kardex.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "Middle", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-5", "left", "Middle", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-10 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavFechainicial_Internalname, "Fecha Inicial:", "col-sm-3 col-lg-2 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_76_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFechainicial_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavFechainicial_Internalname, localUtil.format(AV23FechaInicial, "99/99/99"), localUtil.format( AV23FechaInicial, "99/99/99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'spa',false,0);"+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFechainicial_Jsonclick, 0, "Attribute", "", "", "", 1, edtavFechainicial_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Consulta_Kardex.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtavFechainicial_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFechainicial_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Consulta_Kardex.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "Middle", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-7", "left", "Middle", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-10 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavFechafinal_Internalname, "Fecha Final:", "col-sm-3 col-lg-2 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_76_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFechafinal_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavFechafinal_Internalname, localUtil.format(AV22FechaFinal, "99/99/99"), localUtil.format( AV22FechaFinal, "99/99/99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'spa',false,0);"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFechafinal_Jsonclick, 0, "Attribute", "", "", "", 1, edtavFechafinal_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Consulta_Kardex.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtavFechafinal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFechafinal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Consulta_Kardex.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "Middle", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"76\">") ;
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
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Regional") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "C Costo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tipo Elemento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Consecutivo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción Bien") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Almacen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Bodega") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tipo Movimiento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Transaccion") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Movimiento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Fecha Ratificacion") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Entrada Cantidad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Entrada Valor") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Salida Cantidad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Salida Valor") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV33kard_Regi_Cod, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV29Kard_Cent_Cod);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV55tipo_elemento, (byte)(18), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV31Kard_Elem_Cons);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV13Cata_Descripcion);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV27Kard_Alm_Cod);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV28Kard_Bod_Cod);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV43Mov_Tpmp_Codigo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV44Mov_Trans, (byte)(11), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMov_trans_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV57Tran_ConsecutivoCC, (byte)(18), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", localUtil.ttoc( AV58Tran_FechaRatificacion, 10, 8, 0, 3, "/", ":", " "));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTran_fecharatificacion_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", localUtil.format(AV40Mov_Fecha, "99/99/99"));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV38Mov_Entrada_Cant, (byte)(8), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV39Mov_Entrada_Valor, (byte)(24), (byte)(2), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV41Mov_Salida_Cant, (byte)(8), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV42Mov_Salida_Valor, (byte)(24), (byte)(2), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 76 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_76 = (short)(nGXsfl_76_idx-1) ;
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
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start7J2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Consulta_Kardex", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup7J0( ) ;
   }

   public void ws7J2( )
   {
      start7J2( ) ;
      evt7J2( ) ;
   }

   public void evt7J2( )
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
                        else if ( GXutil.strcmp(sEvt, "VTIPO_CODIGO.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e117J2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VKARD_ELEM.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e127J2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VREGI_COD.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e137J2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCENT_CODIGO.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e147J2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VALMA_CODIGO.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e157J2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBODE_CODIGO.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e167J2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "IMAGE6.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e177J2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 4), "LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_76_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_76_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_76_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_762( ) ;
                           AV33kard_Regi_Cod = (short)(localUtil.ctol( httpContext.cgiGet( edtavKard_regi_cod_Internalname), ",", ".")) ;
                           AV29Kard_Cent_Cod = httpContext.cgiGet( edtavKard_cent_cod_Internalname) ;
                           AV55tipo_elemento = localUtil.ctol( httpContext.cgiGet( edtavTipo_elemento_Internalname), ",", ".") ;
                           AV31Kard_Elem_Cons = httpContext.cgiGet( edtavKard_elem_cons_Internalname) ;
                           AV13Cata_Descripcion = GXutil.upper( httpContext.cgiGet( edtavCata_descripcion_Internalname)) ;
                           AV27Kard_Alm_Cod = httpContext.cgiGet( edtavKard_alm_cod_Internalname) ;
                           AV28Kard_Bod_Cod = httpContext.cgiGet( edtavKard_bod_cod_Internalname) ;
                           AV43Mov_Tpmp_Codigo = httpContext.cgiGet( edtavMov_tpmp_codigo_Internalname) ;
                           AV44Mov_Trans = localUtil.ctol( httpContext.cgiGet( edtavMov_trans_Internalname), ",", ".") ;
                           AV57Tran_ConsecutivoCC = localUtil.ctol( httpContext.cgiGet( edtavTran_consecutivocc_Internalname), ",", ".") ;
                           AV58Tran_FechaRatificacion = localUtil.ctot( httpContext.cgiGet( edtavTran_fecharatificacion_Internalname), 0) ;
                           AV40Mov_Fecha = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavMov_fecha_Internalname), 0)) ;
                           AV38Mov_Entrada_Cant = (int)(localUtil.ctol( httpContext.cgiGet( edtavMov_entrada_cant_Internalname), ",", ".")) ;
                           AV39Mov_Entrada_Valor = localUtil.ctond( httpContext.cgiGet( edtavMov_entrada_valor_Internalname)) ;
                           AV41Mov_Salida_Cant = (int)(localUtil.ctol( httpContext.cgiGet( edtavMov_salida_cant_Internalname), ",", ".")) ;
                           AV42Mov_Salida_Valor = localUtil.ctond( httpContext.cgiGet( edtavMov_salida_valor_Internalname)) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e187J2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e197J2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e207J2 ();
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

   public void we7J2( )
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

   public void pa7J2( )
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
            GX_FocusControl = edtavTipo_codigo_Internalname ;
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
      subsflControlProps_762( ) ;
      while ( nGXsfl_76_idx <= nRC_GXsfl_76 )
      {
         sendrow_762( ) ;
         nGXsfl_76_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_76_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_76_idx+1)) ;
         sGXsfl_76_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_76_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_762( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  long AV53Tipo_codigo ,
                                  String AV30kard_Elem ,
                                  String AV13Cata_Descripcion ,
                                  long AV55tipo_elemento ,
                                  String A66Elem_Consecutivo ,
                                  long A33Tipo_Codigo ,
                                  String A298Cata_Descripcion ,
                                  short AV46Regi_cod ,
                                  java.util.Date AV23FechaInicial ,
                                  short A577Kard_Regi_Cod ,
                                  String A578Kard_Cent_Cod ,
                                  String AV14Cent_Codigo ,
                                  String A87Kard_Alm_Cod ,
                                  String AV6Alma_Codigo ,
                                  String A88Kard_Bod_Cod ,
                                  String AV8Bode_Codigo ,
                                  String A89Kard_Elem_Cons ,
                                  String A579Mov_Tpmp_Codigo ,
                                  long A90Mov_Trans ,
                                  java.util.Date A580Mov_Fecha ,
                                  int A582Mov_Entrada_Cant ,
                                  java.math.BigDecimal A583Mov_Entrada_Valor ,
                                  int A584Mov_Salida_Cant ,
                                  java.math.BigDecimal A585Mov_Salida_Valor ,
                                  java.util.Date AV22FechaFinal ,
                                  long AV57Tran_ConsecutivoCC ,
                                  java.util.Date AV58Tran_FechaRatificacion ,
                                  long A46Tran_Id ,
                                  long AV44Mov_Trans ,
                                  long A513Tran_ConsecutivoCC ,
                                  java.util.Date A390Tran_FechaRatificacion )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID1_nCurrentRecord = 0 ;
      rf7J2( ) ;
      /* End function gxgrGrid1_refresh */
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
      rf7J2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavTipo_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipo_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTipo_descripcion_Enabled, 5, 0)), true);
      edtavElem_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavElem_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavElem_descripcion_Enabled, 5, 0)), true);
      edtavRegi_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRegi_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavRegi_descripcion_Enabled, 5, 0)), true);
      edtavCent_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCent_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCent_descripcion_Enabled, 5, 0)), true);
      edtavAlma_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlma_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAlma_descripcion_Enabled, 5, 0)), true);
      edtavBode_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBode_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavBode_descripcion_Enabled, 5, 0)), true);
      edtavMov_trans_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMov_trans_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMov_trans_Enabled, 5, 0)), !bGXsfl_76_Refreshing);
      edtavTran_fecharatificacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_fecharatificacion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_fecharatificacion_Enabled, 5, 0)), !bGXsfl_76_Refreshing);
      imgImage1_Link = "javascript:"+"gx.popup.openPrompt('"+"com.orions2.sel_reg"+"',["+"{Ctrl:gx.dom.el('"+"vREGI_COD"+"'), id:'"+"vREGI_COD"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"vREGI_DESCRIPCION"+"'), id:'"+"vREGI_DESCRIPCION"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgImage1_Internalname, "Link", imgImage1_Link, true);
      imgImage2_Link = "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gxselectcentrocosto"+"',["+"{Ctrl:gx.dom.el('"+"vCENT_ID"+"'), id:'"+"vCENT_ID"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"vCENT_DESCRIPCION"+"'), id:'"+"vCENT_DESCRIPCION"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"vREGI_CODIGO"+"'), id:'"+"vREGI_CODIGO"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"vCENT_CODIGO"+"'), id:'"+"vCENT_CODIGO"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"vREGI_ABREV"+"'), id:'"+"vREGI_ABREV"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgImage2_Internalname, "Link", imgImage2_Link, true);
      imgImage3_Link = "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gxselectalmacen"+"',["+"{Ctrl:gx.dom.el('"+"vCENT_ID"+"'), id:'"+"vCENT_ID"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"vALMA_MODULO"+"'), id:'"+"vALMA_MODULO"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"vALMA_CODIGO"+"'), id:'"+"vALMA_CODIGO"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgImage3_Internalname, "Link", imgImage3_Link, true);
      imgImage4_Link = "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gxselectbodega"+"',["+"{Ctrl:gx.dom.el('"+"vBODE_CODIGO"+"'), id:'"+"vBODE_CODIGO"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgImage4_Internalname, "Link", imgImage4_Link, true);
      imgImage7_Link = "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gxselecttipoelemento"+"',["+"{Ctrl:gx.dom.el('"+"vTIPO_CODIGO"+"'), id:'"+"vTIPO_CODIGO"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"vTIPO_DESCRIPCION"+"'), id:'"+"vTIPO_DESCRIPCION"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgImage7_Internalname, "Link", imgImage7_Link, true);
   }

   public void rf7J2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(76) ;
      /* Execute user event: Refresh */
      e197J2 ();
      nGXsfl_76_idx = (short)(1) ;
      sGXsfl_76_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_76_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_762( ) ;
      bGXsfl_76_Refreshing = true ;
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
         subsflControlProps_762( ) ;
         /* Execute user event: Load */
         e207J2 ();
         if ( ( GRID1_nCurrentRecord > 0 ) && ( GRID1_nGridOutOfScope == 0 ) && ( nGXsfl_76_idx == 1 ) )
         {
            GRID1_nCurrentRecord = 0 ;
            GRID1_nGridOutOfScope = 1 ;
            subgrid1_firstpage( ) ;
            /* Execute user event: Load */
            e207J2 ();
         }
         wbEnd = (short)(76) ;
         wb7J0( ) ;
      }
      bGXsfl_76_Refreshing = true ;
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
      return -1 ;
   }

   public int subgrid1_recordsperpage( )
   {
      if ( subGrid1_Rows > 0 )
      {
         return subGrid1_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgrid1_currentpage( )
   {
      return -1 ;
   }

   public short subgrid1_firstpage( )
   {
      GRID1_nFirstRecordOnPage = 0 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV53Tipo_codigo, AV30kard_Elem, AV13Cata_Descripcion, AV55tipo_elemento, A66Elem_Consecutivo, A33Tipo_Codigo, A298Cata_Descripcion, AV46Regi_cod, AV23FechaInicial, A577Kard_Regi_Cod, A578Kard_Cent_Cod, AV14Cent_Codigo, A87Kard_Alm_Cod, AV6Alma_Codigo, A88Kard_Bod_Cod, AV8Bode_Codigo, A89Kard_Elem_Cons, A579Mov_Tpmp_Codigo, A90Mov_Trans, A580Mov_Fecha, A582Mov_Entrada_Cant, A583Mov_Entrada_Valor, A584Mov_Salida_Cant, A585Mov_Salida_Valor, AV22FechaFinal, AV57Tran_ConsecutivoCC, AV58Tran_FechaRatificacion, A46Tran_Id, AV44Mov_Trans, A513Tran_ConsecutivoCC, A390Tran_FechaRatificacion) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid1_nextpage( )
   {
      if ( GRID1_nEOF == 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage+subgrid1_recordsperpage( )) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV53Tipo_codigo, AV30kard_Elem, AV13Cata_Descripcion, AV55tipo_elemento, A66Elem_Consecutivo, A33Tipo_Codigo, A298Cata_Descripcion, AV46Regi_cod, AV23FechaInicial, A577Kard_Regi_Cod, A578Kard_Cent_Cod, AV14Cent_Codigo, A87Kard_Alm_Cod, AV6Alma_Codigo, A88Kard_Bod_Cod, AV8Bode_Codigo, A89Kard_Elem_Cons, A579Mov_Tpmp_Codigo, A90Mov_Trans, A580Mov_Fecha, A582Mov_Entrada_Cant, A583Mov_Entrada_Valor, A584Mov_Salida_Cant, A585Mov_Salida_Valor, AV22FechaFinal, AV57Tran_ConsecutivoCC, AV58Tran_FechaRatificacion, A46Tran_Id, AV44Mov_Trans, A513Tran_ConsecutivoCC, A390Tran_FechaRatificacion) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV53Tipo_codigo, AV30kard_Elem, AV13Cata_Descripcion, AV55tipo_elemento, A66Elem_Consecutivo, A33Tipo_Codigo, A298Cata_Descripcion, AV46Regi_cod, AV23FechaInicial, A577Kard_Regi_Cod, A578Kard_Cent_Cod, AV14Cent_Codigo, A87Kard_Alm_Cod, AV6Alma_Codigo, A88Kard_Bod_Cod, AV8Bode_Codigo, A89Kard_Elem_Cons, A579Mov_Tpmp_Codigo, A90Mov_Trans, A580Mov_Fecha, A582Mov_Entrada_Cant, A583Mov_Entrada_Valor, A584Mov_Salida_Cant, A585Mov_Salida_Valor, AV22FechaFinal, AV57Tran_ConsecutivoCC, AV58Tran_FechaRatificacion, A46Tran_Id, AV44Mov_Trans, A513Tran_ConsecutivoCC, A390Tran_FechaRatificacion) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid1_lastpage( )
   {
      subGrid1_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV53Tipo_codigo, AV30kard_Elem, AV13Cata_Descripcion, AV55tipo_elemento, A66Elem_Consecutivo, A33Tipo_Codigo, A298Cata_Descripcion, AV46Regi_cod, AV23FechaInicial, A577Kard_Regi_Cod, A578Kard_Cent_Cod, AV14Cent_Codigo, A87Kard_Alm_Cod, AV6Alma_Codigo, A88Kard_Bod_Cod, AV8Bode_Codigo, A89Kard_Elem_Cons, A579Mov_Tpmp_Codigo, A90Mov_Trans, A580Mov_Fecha, A582Mov_Entrada_Cant, A583Mov_Entrada_Valor, A584Mov_Salida_Cant, A585Mov_Salida_Valor, AV22FechaFinal, AV57Tran_ConsecutivoCC, AV58Tran_FechaRatificacion, A46Tran_Id, AV44Mov_Trans, A513Tran_ConsecutivoCC, A390Tran_FechaRatificacion) ;
      }
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
         gxgrgrid1_refresh( subGrid1_Rows, AV53Tipo_codigo, AV30kard_Elem, AV13Cata_Descripcion, AV55tipo_elemento, A66Elem_Consecutivo, A33Tipo_Codigo, A298Cata_Descripcion, AV46Regi_cod, AV23FechaInicial, A577Kard_Regi_Cod, A578Kard_Cent_Cod, AV14Cent_Codigo, A87Kard_Alm_Cod, AV6Alma_Codigo, A88Kard_Bod_Cod, AV8Bode_Codigo, A89Kard_Elem_Cons, A579Mov_Tpmp_Codigo, A90Mov_Trans, A580Mov_Fecha, A582Mov_Entrada_Cant, A583Mov_Entrada_Valor, A584Mov_Salida_Cant, A585Mov_Salida_Valor, AV22FechaFinal, AV57Tran_ConsecutivoCC, AV58Tran_FechaRatificacion, A46Tran_Id, AV44Mov_Trans, A513Tran_ConsecutivoCC, A390Tran_FechaRatificacion) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup7J0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      edtavTipo_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipo_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTipo_descripcion_Enabled, 5, 0)), true);
      edtavElem_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavElem_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavElem_descripcion_Enabled, 5, 0)), true);
      edtavRegi_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRegi_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavRegi_descripcion_Enabled, 5, 0)), true);
      edtavCent_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCent_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCent_descripcion_Enabled, 5, 0)), true);
      edtavAlma_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlma_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAlma_descripcion_Enabled, 5, 0)), true);
      edtavBode_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBode_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavBode_descripcion_Enabled, 5, 0)), true);
      edtavMov_trans_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMov_trans_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMov_trans_Enabled, 5, 0)), !bGXsfl_76_Refreshing);
      edtavTran_fecharatificacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_fecharatificacion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_fecharatificacion_Enabled, 5, 0)), !bGXsfl_76_Refreshing);
      imgImage1_Link = "javascript:"+"gx.popup.openPrompt('"+"com.orions2.sel_reg"+"',["+"{Ctrl:gx.dom.el('"+"vREGI_COD"+"'), id:'"+"vREGI_COD"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"vREGI_DESCRIPCION"+"'), id:'"+"vREGI_DESCRIPCION"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgImage1_Internalname, "Link", imgImage1_Link, true);
      imgImage2_Link = "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gxselectcentrocosto"+"',["+"{Ctrl:gx.dom.el('"+"vCENT_ID"+"'), id:'"+"vCENT_ID"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"vCENT_DESCRIPCION"+"'), id:'"+"vCENT_DESCRIPCION"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"vREGI_CODIGO"+"'), id:'"+"vREGI_CODIGO"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"vCENT_CODIGO"+"'), id:'"+"vCENT_CODIGO"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"vREGI_ABREV"+"'), id:'"+"vREGI_ABREV"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgImage2_Internalname, "Link", imgImage2_Link, true);
      imgImage3_Link = "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gxselectalmacen"+"',["+"{Ctrl:gx.dom.el('"+"vCENT_ID"+"'), id:'"+"vCENT_ID"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"vALMA_MODULO"+"'), id:'"+"vALMA_MODULO"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"vALMA_CODIGO"+"'), id:'"+"vALMA_CODIGO"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgImage3_Internalname, "Link", imgImage3_Link, true);
      imgImage4_Link = "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gxselectbodega"+"',["+"{Ctrl:gx.dom.el('"+"vBODE_CODIGO"+"'), id:'"+"vBODE_CODIGO"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgImage4_Internalname, "Link", imgImage4_Link, true);
      imgImage7_Link = "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gxselecttipoelemento"+"',["+"{Ctrl:gx.dom.el('"+"vTIPO_CODIGO"+"'), id:'"+"vTIPO_CODIGO"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"vTIPO_DESCRIPCION"+"'), id:'"+"vTIPO_DESCRIPCION"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgImage7_Internalname, "Link", imgImage7_Link, true);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e187J2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTipo_codigo_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTipo_codigo_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIPO_CODIGO");
            GX_FocusControl = edtavTipo_codigo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV53Tipo_codigo = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53Tipo_codigo", GXutil.ltrim( GXutil.str( AV53Tipo_codigo, 18, 0)));
         }
         else
         {
            AV53Tipo_codigo = localUtil.ctol( httpContext.cgiGet( edtavTipo_codigo_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53Tipo_codigo", GXutil.ltrim( GXutil.str( AV53Tipo_codigo, 18, 0)));
         }
         AV54Tipo_Descripcion = GXutil.upper( httpContext.cgiGet( edtavTipo_descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54Tipo_Descripcion", AV54Tipo_Descripcion);
         AV30kard_Elem = httpContext.cgiGet( edtavKard_elem_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30kard_Elem", AV30kard_Elem);
         AV18Elem_Descripcion = httpContext.cgiGet( edtavElem_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Elem_Descripcion", AV18Elem_Descripcion);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavRegi_cod_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavRegi_cod_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vREGI_COD");
            GX_FocusControl = edtavRegi_cod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV46Regi_cod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46Regi_cod", GXutil.ltrim( GXutil.str( AV46Regi_cod, 4, 0)));
         }
         else
         {
            AV46Regi_cod = (short)(localUtil.ctol( httpContext.cgiGet( edtavRegi_cod_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46Regi_cod", GXutil.ltrim( GXutil.str( AV46Regi_cod, 4, 0)));
         }
         AV48Regi_Descripcion = httpContext.cgiGet( edtavRegi_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Regi_Descripcion", AV48Regi_Descripcion);
         AV14Cent_Codigo = httpContext.cgiGet( edtavCent_codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Cent_Codigo", AV14Cent_Codigo);
         AV15Cent_Descripcion = httpContext.cgiGet( edtavCent_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Cent_Descripcion", AV15Cent_Descripcion);
         AV6Alma_Codigo = httpContext.cgiGet( edtavAlma_codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Alma_Codigo", AV6Alma_Codigo);
         AV7Alma_Descripcion = GXutil.upper( httpContext.cgiGet( edtavAlma_descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7Alma_Descripcion", AV7Alma_Descripcion);
         AV8Bode_Codigo = httpContext.cgiGet( edtavBode_codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Bode_Codigo", AV8Bode_Codigo);
         AV9Bode_Descripcion = GXutil.upper( httpContext.cgiGet( edtavBode_descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Bode_Descripcion", AV9Bode_Descripcion);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavFechainicial_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFECHAINICIAL");
            GX_FocusControl = edtavFechainicial_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV23FechaInicial = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23FechaInicial", localUtil.format(AV23FechaInicial, "99/99/99"));
         }
         else
         {
            AV23FechaInicial = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavFechainicial_Internalname), 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23FechaInicial", localUtil.format(AV23FechaInicial, "99/99/99"));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavFechafinal_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFECHAFINAL");
            GX_FocusControl = edtavFechafinal_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV22FechaFinal = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22FechaFinal", localUtil.format(AV22FechaFinal, "99/99/99"));
         }
         else
         {
            AV22FechaFinal = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavFechafinal_Internalname), 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22FechaFinal", localUtil.format(AV22FechaFinal, "99/99/99"));
         }
         /* Read saved values. */
         nRC_GXsfl_76 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_76"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         subGrid1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), ",", ".")) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e187J2 ();
      if (returnInSub) return;
   }

   public void e187J2( )
   {
      /* Start Routine */
      subGrid1_Rows = 10 ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   public void e117J2( )
   {
      /* Tipo_codigo_Isvalid Routine */
      AV66GXLvl25 = (byte)(0) ;
      /* Using cursor H007J2 */
      pr_default.execute(0, new Object[] {new Long(AV53Tipo_codigo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A33Tipo_Codigo = H007J2_A33Tipo_Codigo[0] ;
         A253Tipo_Descripcion = H007J2_A253Tipo_Descripcion[0] ;
         AV66GXLvl25 = (byte)(1) ;
         AV54Tipo_Descripcion = A253Tipo_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54Tipo_Descripcion", AV54Tipo_Descripcion);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV66GXLvl25 == 0 )
      {
         AV54Tipo_Descripcion = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54Tipo_Descripcion", AV54Tipo_Descripcion);
      }
   }

   public void e127J2( )
   {
      /* Kard_elem_Isvalid Routine */
      AV67GXLvl34 = (byte)(0) ;
      /* Using cursor H007J3 */
      pr_default.execute(1, new Object[] {AV30kard_Elem});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A66Elem_Consecutivo = H007J3_A66Elem_Consecutivo[0] ;
         A557Elem_Descripcion = H007J3_A557Elem_Descripcion[0] ;
         AV67GXLvl34 = (byte)(1) ;
         AV18Elem_Descripcion = A557Elem_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Elem_Descripcion", AV18Elem_Descripcion);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( AV67GXLvl34 == 0 )
      {
         AV18Elem_Descripcion = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Elem_Descripcion", AV18Elem_Descripcion);
      }
   }

   public void e137J2( )
   {
      /* Regi_cod_Isvalid Routine */
      AV68GXLvl43 = (byte)(0) ;
      /* Using cursor H007J4 */
      pr_default.execute(2, new Object[] {new Short(AV46Regi_cod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A12Regi_Cod = H007J4_A12Regi_Cod[0] ;
         A13Regi_Descripcion = H007J4_A13Regi_Descripcion[0] ;
         AV68GXLvl43 = (byte)(1) ;
         AV48Regi_Descripcion = A13Regi_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Regi_Descripcion", AV48Regi_Descripcion);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( AV68GXLvl43 == 0 )
      {
         AV48Regi_Descripcion = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Regi_Descripcion", AV48Regi_Descripcion);
      }
   }

   public void e147J2( )
   {
      /* Cent_codigo_Isvalid Routine */
      AV69GXLvl53 = (byte)(0) ;
      /* Using cursor H007J5 */
      pr_default.execute(3, new Object[] {AV14Cent_Codigo});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A3Cent_Codigo = H007J5_A3Cent_Codigo[0] ;
         A4Cent_Descripcion = H007J5_A4Cent_Descripcion[0] ;
         AV69GXLvl53 = (byte)(1) ;
         AV15Cent_Descripcion = A4Cent_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Cent_Descripcion", AV15Cent_Descripcion);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      if ( AV69GXLvl53 == 0 )
      {
         AV15Cent_Descripcion = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Cent_Descripcion", AV15Cent_Descripcion);
      }
   }

   public void e157J2( )
   {
      /* Alma_codigo_Isvalid Routine */
      AV70GXLvl64 = (byte)(0) ;
      /* Using cursor H007J6 */
      pr_default.execute(4, new Object[] {AV6Alma_Codigo});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A28Alma_Codigo = H007J6_A28Alma_Codigo[0] ;
         A252Alma_Descripcion = H007J6_A252Alma_Descripcion[0] ;
         AV70GXLvl64 = (byte)(1) ;
         AV7Alma_Descripcion = A252Alma_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7Alma_Descripcion", AV7Alma_Descripcion);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      if ( AV70GXLvl64 == 0 )
      {
         AV7Alma_Descripcion = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7Alma_Descripcion", AV7Alma_Descripcion);
      }
   }

   public void e167J2( )
   {
      /* Bode_codigo_Isvalid Routine */
      AV71GXLvl74 = (byte)(0) ;
      /* Using cursor H007J7 */
      pr_default.execute(5, new Object[] {AV8Bode_Codigo});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A31Bode_Codigo = H007J7_A31Bode_Codigo[0] ;
         A251Bode_Descripcion = H007J7_A251Bode_Descripcion[0] ;
         AV71GXLvl74 = (byte)(1) ;
         AV9Bode_Descripcion = A251Bode_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Bode_Descripcion", AV9Bode_Descripcion);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
      if ( AV71GXLvl74 == 0 )
      {
         AV9Bode_Descripcion = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Bode_Descripcion", AV9Bode_Descripcion);
      }
   }

   public void S1115( )
   {
      /* 'BUSCA KARDEX' Routine */
      if ( AV46Regi_cod == 0 )
      {
         if ( GXutil.dateCompare(GXutil.nullDate(), AV23FechaInicial) )
         {
            /* Using cursor H007J8 */
            pr_default.execute(6, new Object[] {new Short(AV46Regi_cod), AV14Cent_Codigo, AV14Cent_Codigo, AV6Alma_Codigo, AV6Alma_Codigo, AV8Bode_Codigo, AV8Bode_Codigo, AV30kard_Elem});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A85Kard_Regi_Id = H007J8_A85Kard_Regi_Id[0] ;
               A86Kard_Cent_Id = H007J8_A86Kard_Cent_Id[0] ;
               A89Kard_Elem_Cons = H007J8_A89Kard_Elem_Cons[0] ;
               A88Kard_Bod_Cod = H007J8_A88Kard_Bod_Cod[0] ;
               A87Kard_Alm_Cod = H007J8_A87Kard_Alm_Cod[0] ;
               A578Kard_Cent_Cod = H007J8_A578Kard_Cent_Cod[0] ;
               A577Kard_Regi_Cod = H007J8_A577Kard_Regi_Cod[0] ;
               A579Mov_Tpmp_Codigo = H007J8_A579Mov_Tpmp_Codigo[0] ;
               A90Mov_Trans = H007J8_A90Mov_Trans[0] ;
               A580Mov_Fecha = H007J8_A580Mov_Fecha[0] ;
               A582Mov_Entrada_Cant = H007J8_A582Mov_Entrada_Cant[0] ;
               n582Mov_Entrada_Cant = H007J8_n582Mov_Entrada_Cant[0] ;
               A583Mov_Entrada_Valor = H007J8_A583Mov_Entrada_Valor[0] ;
               n583Mov_Entrada_Valor = H007J8_n583Mov_Entrada_Valor[0] ;
               A584Mov_Salida_Cant = H007J8_A584Mov_Salida_Cant[0] ;
               n584Mov_Salida_Cant = H007J8_n584Mov_Salida_Cant[0] ;
               A585Mov_Salida_Valor = H007J8_A585Mov_Salida_Valor[0] ;
               n585Mov_Salida_Valor = H007J8_n585Mov_Salida_Valor[0] ;
               A578Kard_Cent_Cod = H007J8_A578Kard_Cent_Cod[0] ;
               A577Kard_Regi_Cod = H007J8_A577Kard_Regi_Cod[0] ;
               AV33kard_Regi_Cod = A577Kard_Regi_Cod ;
               AV29Kard_Cent_Cod = A578Kard_Cent_Cod ;
               AV27Kard_Alm_Cod = A87Kard_Alm_Cod ;
               AV28Kard_Bod_Cod = A88Kard_Bod_Cod ;
               AV31Kard_Elem_Cons = A89Kard_Elem_Cons ;
               AV43Mov_Tpmp_Codigo = A579Mov_Tpmp_Codigo ;
               AV44Mov_Trans = A90Mov_Trans ;
               AV40Mov_Fecha = A580Mov_Fecha ;
               AV38Mov_Entrada_Cant = A582Mov_Entrada_Cant ;
               AV39Mov_Entrada_Valor = A583Mov_Entrada_Valor ;
               AV41Mov_Salida_Cant = A584Mov_Salida_Cant ;
               AV42Mov_Salida_Valor = A585Mov_Salida_Valor ;
               /* Execute user subroutine: 'TRANSACCION' */
               S129 ();
               if ( returnInSub )
               {
                  pr_default.close(6);
                  pr_default.close(6);
                  returnInSub = true;
                  if (true) return;
               }
               if ( ( subGrid1_Islastpage == 1 ) || ( subGrid1_Rows == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
               {
                  sendrow_762( ) ;
                  GRID1_nEOF = (byte)(1) ;
                  com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
                  if ( ( subGrid1_Islastpage == 1 ) && ( ((int)((GRID1_nCurrentRecord) % (subgrid1_recordsperpage( )))) == 0 ) )
                  {
                     GRID1_nFirstRecordOnPage = GRID1_nCurrentRecord ;
                  }
               }
               if ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) )
               {
                  GRID1_nEOF = (byte)(0) ;
                  com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
               }
               GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
               if ( isFullAjaxMode( ) && ! bGXsfl_76_Refreshing )
               {
                  httpContext.doAjaxLoad(76, Grid1Row);
               }
               pr_default.readNext(6);
            }
            pr_default.close(6);
            httpContext.GX_msglist.addItem("Seleccione una Regional");
         }
         else
         {
            if ( GXutil.dateCompare(GXutil.nullDate(), AV22FechaFinal) )
            {
               /* Using cursor H007J9 */
               pr_default.execute(7, new Object[] {new Short(AV46Regi_cod), AV14Cent_Codigo, AV14Cent_Codigo, AV6Alma_Codigo, AV6Alma_Codigo, AV8Bode_Codigo, AV8Bode_Codigo, AV23FechaInicial, AV30kard_Elem});
               while ( (pr_default.getStatus(7) != 101) )
               {
                  A85Kard_Regi_Id = H007J9_A85Kard_Regi_Id[0] ;
                  A86Kard_Cent_Id = H007J9_A86Kard_Cent_Id[0] ;
                  A580Mov_Fecha = H007J9_A580Mov_Fecha[0] ;
                  A89Kard_Elem_Cons = H007J9_A89Kard_Elem_Cons[0] ;
                  A88Kard_Bod_Cod = H007J9_A88Kard_Bod_Cod[0] ;
                  A87Kard_Alm_Cod = H007J9_A87Kard_Alm_Cod[0] ;
                  A578Kard_Cent_Cod = H007J9_A578Kard_Cent_Cod[0] ;
                  A577Kard_Regi_Cod = H007J9_A577Kard_Regi_Cod[0] ;
                  A579Mov_Tpmp_Codigo = H007J9_A579Mov_Tpmp_Codigo[0] ;
                  A90Mov_Trans = H007J9_A90Mov_Trans[0] ;
                  A582Mov_Entrada_Cant = H007J9_A582Mov_Entrada_Cant[0] ;
                  n582Mov_Entrada_Cant = H007J9_n582Mov_Entrada_Cant[0] ;
                  A583Mov_Entrada_Valor = H007J9_A583Mov_Entrada_Valor[0] ;
                  n583Mov_Entrada_Valor = H007J9_n583Mov_Entrada_Valor[0] ;
                  A584Mov_Salida_Cant = H007J9_A584Mov_Salida_Cant[0] ;
                  n584Mov_Salida_Cant = H007J9_n584Mov_Salida_Cant[0] ;
                  A585Mov_Salida_Valor = H007J9_A585Mov_Salida_Valor[0] ;
                  n585Mov_Salida_Valor = H007J9_n585Mov_Salida_Valor[0] ;
                  A578Kard_Cent_Cod = H007J9_A578Kard_Cent_Cod[0] ;
                  A577Kard_Regi_Cod = H007J9_A577Kard_Regi_Cod[0] ;
                  AV33kard_Regi_Cod = A577Kard_Regi_Cod ;
                  AV29Kard_Cent_Cod = A578Kard_Cent_Cod ;
                  AV27Kard_Alm_Cod = A87Kard_Alm_Cod ;
                  AV28Kard_Bod_Cod = A88Kard_Bod_Cod ;
                  AV31Kard_Elem_Cons = A89Kard_Elem_Cons ;
                  AV43Mov_Tpmp_Codigo = A579Mov_Tpmp_Codigo ;
                  AV44Mov_Trans = A90Mov_Trans ;
                  AV40Mov_Fecha = A580Mov_Fecha ;
                  AV38Mov_Entrada_Cant = A582Mov_Entrada_Cant ;
                  AV39Mov_Entrada_Valor = A583Mov_Entrada_Valor ;
                  AV41Mov_Salida_Cant = A584Mov_Salida_Cant ;
                  AV42Mov_Salida_Valor = A585Mov_Salida_Valor ;
                  /* Execute user subroutine: 'TRANSACCION' */
                  S129 ();
                  if ( returnInSub )
                  {
                     pr_default.close(7);
                     pr_default.close(7);
                     returnInSub = true;
                     if (true) return;
                  }
                  if ( ( subGrid1_Islastpage == 1 ) || ( subGrid1_Rows == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
                  {
                     sendrow_762( ) ;
                     GRID1_nEOF = (byte)(1) ;
                     com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
                     if ( ( subGrid1_Islastpage == 1 ) && ( ((int)((GRID1_nCurrentRecord) % (subgrid1_recordsperpage( )))) == 0 ) )
                     {
                        GRID1_nFirstRecordOnPage = GRID1_nCurrentRecord ;
                     }
                  }
                  if ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) )
                  {
                     GRID1_nEOF = (byte)(0) ;
                     com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
                  }
                  GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
                  if ( isFullAjaxMode( ) && ! bGXsfl_76_Refreshing )
                  {
                     httpContext.doAjaxLoad(76, Grid1Row);
                  }
                  pr_default.readNext(7);
               }
               pr_default.close(7);
               httpContext.GX_msglist.addItem("Seleccione una Regional");
            }
            else
            {
               if ( (( AV22FechaFinal.after( AV23FechaInicial ) ) || ( GXutil.dateCompare(AV22FechaFinal, AV23FechaInicial) )) )
               {
                  /* Using cursor H007J10 */
                  pr_default.execute(8, new Object[] {new Short(AV46Regi_cod), AV14Cent_Codigo, AV14Cent_Codigo, AV6Alma_Codigo, AV6Alma_Codigo, AV8Bode_Codigo, AV8Bode_Codigo, AV23FechaInicial, AV22FechaFinal, AV30kard_Elem});
                  while ( (pr_default.getStatus(8) != 101) )
                  {
                     A85Kard_Regi_Id = H007J10_A85Kard_Regi_Id[0] ;
                     A86Kard_Cent_Id = H007J10_A86Kard_Cent_Id[0] ;
                     A580Mov_Fecha = H007J10_A580Mov_Fecha[0] ;
                     A89Kard_Elem_Cons = H007J10_A89Kard_Elem_Cons[0] ;
                     A88Kard_Bod_Cod = H007J10_A88Kard_Bod_Cod[0] ;
                     A87Kard_Alm_Cod = H007J10_A87Kard_Alm_Cod[0] ;
                     A578Kard_Cent_Cod = H007J10_A578Kard_Cent_Cod[0] ;
                     A577Kard_Regi_Cod = H007J10_A577Kard_Regi_Cod[0] ;
                     A579Mov_Tpmp_Codigo = H007J10_A579Mov_Tpmp_Codigo[0] ;
                     A90Mov_Trans = H007J10_A90Mov_Trans[0] ;
                     A582Mov_Entrada_Cant = H007J10_A582Mov_Entrada_Cant[0] ;
                     n582Mov_Entrada_Cant = H007J10_n582Mov_Entrada_Cant[0] ;
                     A583Mov_Entrada_Valor = H007J10_A583Mov_Entrada_Valor[0] ;
                     n583Mov_Entrada_Valor = H007J10_n583Mov_Entrada_Valor[0] ;
                     A584Mov_Salida_Cant = H007J10_A584Mov_Salida_Cant[0] ;
                     n584Mov_Salida_Cant = H007J10_n584Mov_Salida_Cant[0] ;
                     A585Mov_Salida_Valor = H007J10_A585Mov_Salida_Valor[0] ;
                     n585Mov_Salida_Valor = H007J10_n585Mov_Salida_Valor[0] ;
                     A578Kard_Cent_Cod = H007J10_A578Kard_Cent_Cod[0] ;
                     A577Kard_Regi_Cod = H007J10_A577Kard_Regi_Cod[0] ;
                     AV33kard_Regi_Cod = A577Kard_Regi_Cod ;
                     AV29Kard_Cent_Cod = A578Kard_Cent_Cod ;
                     AV27Kard_Alm_Cod = A87Kard_Alm_Cod ;
                     AV28Kard_Bod_Cod = A88Kard_Bod_Cod ;
                     AV31Kard_Elem_Cons = A89Kard_Elem_Cons ;
                     AV43Mov_Tpmp_Codigo = A579Mov_Tpmp_Codigo ;
                     AV44Mov_Trans = A90Mov_Trans ;
                     AV40Mov_Fecha = A580Mov_Fecha ;
                     AV38Mov_Entrada_Cant = A582Mov_Entrada_Cant ;
                     AV39Mov_Entrada_Valor = A583Mov_Entrada_Valor ;
                     AV41Mov_Salida_Cant = A584Mov_Salida_Cant ;
                     AV42Mov_Salida_Valor = A585Mov_Salida_Valor ;
                     /* Execute user subroutine: 'TRANSACCION' */
                     S129 ();
                     if ( returnInSub )
                     {
                        pr_default.close(8);
                        pr_default.close(8);
                        returnInSub = true;
                        if (true) return;
                     }
                     if ( ( subGrid1_Islastpage == 1 ) || ( subGrid1_Rows == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
                     {
                        sendrow_762( ) ;
                        GRID1_nEOF = (byte)(1) ;
                        com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
                        if ( ( subGrid1_Islastpage == 1 ) && ( ((int)((GRID1_nCurrentRecord) % (subgrid1_recordsperpage( )))) == 0 ) )
                        {
                           GRID1_nFirstRecordOnPage = GRID1_nCurrentRecord ;
                        }
                     }
                     if ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) )
                     {
                        GRID1_nEOF = (byte)(0) ;
                        com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
                     }
                     GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
                     if ( isFullAjaxMode( ) && ! bGXsfl_76_Refreshing )
                     {
                        httpContext.doAjaxLoad(76, Grid1Row);
                     }
                     pr_default.readNext(8);
                  }
                  pr_default.close(8);
                  httpContext.GX_msglist.addItem("Seleccione una Regional");
               }
               else
               {
                  httpContext.GX_msglist.addItem("Seleccione una Regional");
                  httpContext.GX_msglist.addItem("Fecha final no es válida");
               }
            }
         }
      }
      else
      {
         if ( GXutil.dateCompare(GXutil.nullDate(), AV23FechaInicial) )
         {
            /* Using cursor H007J11 */
            pr_default.execute(9, new Object[] {AV14Cent_Codigo, AV14Cent_Codigo, AV6Alma_Codigo, AV6Alma_Codigo, AV8Bode_Codigo, AV8Bode_Codigo, new Short(AV46Regi_cod), AV30kard_Elem});
            while ( (pr_default.getStatus(9) != 101) )
            {
               A85Kard_Regi_Id = H007J11_A85Kard_Regi_Id[0] ;
               A86Kard_Cent_Id = H007J11_A86Kard_Cent_Id[0] ;
               A89Kard_Elem_Cons = H007J11_A89Kard_Elem_Cons[0] ;
               A88Kard_Bod_Cod = H007J11_A88Kard_Bod_Cod[0] ;
               A87Kard_Alm_Cod = H007J11_A87Kard_Alm_Cod[0] ;
               A578Kard_Cent_Cod = H007J11_A578Kard_Cent_Cod[0] ;
               A577Kard_Regi_Cod = H007J11_A577Kard_Regi_Cod[0] ;
               A579Mov_Tpmp_Codigo = H007J11_A579Mov_Tpmp_Codigo[0] ;
               A90Mov_Trans = H007J11_A90Mov_Trans[0] ;
               A580Mov_Fecha = H007J11_A580Mov_Fecha[0] ;
               A582Mov_Entrada_Cant = H007J11_A582Mov_Entrada_Cant[0] ;
               n582Mov_Entrada_Cant = H007J11_n582Mov_Entrada_Cant[0] ;
               A583Mov_Entrada_Valor = H007J11_A583Mov_Entrada_Valor[0] ;
               n583Mov_Entrada_Valor = H007J11_n583Mov_Entrada_Valor[0] ;
               A584Mov_Salida_Cant = H007J11_A584Mov_Salida_Cant[0] ;
               n584Mov_Salida_Cant = H007J11_n584Mov_Salida_Cant[0] ;
               A585Mov_Salida_Valor = H007J11_A585Mov_Salida_Valor[0] ;
               n585Mov_Salida_Valor = H007J11_n585Mov_Salida_Valor[0] ;
               A578Kard_Cent_Cod = H007J11_A578Kard_Cent_Cod[0] ;
               A577Kard_Regi_Cod = H007J11_A577Kard_Regi_Cod[0] ;
               AV33kard_Regi_Cod = A577Kard_Regi_Cod ;
               AV29Kard_Cent_Cod = A578Kard_Cent_Cod ;
               AV27Kard_Alm_Cod = A87Kard_Alm_Cod ;
               AV28Kard_Bod_Cod = A88Kard_Bod_Cod ;
               AV31Kard_Elem_Cons = A89Kard_Elem_Cons ;
               AV43Mov_Tpmp_Codigo = A579Mov_Tpmp_Codigo ;
               AV44Mov_Trans = A90Mov_Trans ;
               AV40Mov_Fecha = A580Mov_Fecha ;
               AV38Mov_Entrada_Cant = A582Mov_Entrada_Cant ;
               AV39Mov_Entrada_Valor = A583Mov_Entrada_Valor ;
               AV41Mov_Salida_Cant = A584Mov_Salida_Cant ;
               AV42Mov_Salida_Valor = A585Mov_Salida_Valor ;
               /* Execute user subroutine: 'TRANSACCION' */
               S129 ();
               if ( returnInSub )
               {
                  pr_default.close(9);
                  pr_default.close(9);
                  returnInSub = true;
                  if (true) return;
               }
               if ( ( subGrid1_Islastpage == 1 ) || ( subGrid1_Rows == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
               {
                  sendrow_762( ) ;
                  GRID1_nEOF = (byte)(1) ;
                  com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
                  if ( ( subGrid1_Islastpage == 1 ) && ( ((int)((GRID1_nCurrentRecord) % (subgrid1_recordsperpage( )))) == 0 ) )
                  {
                     GRID1_nFirstRecordOnPage = GRID1_nCurrentRecord ;
                  }
               }
               if ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) )
               {
                  GRID1_nEOF = (byte)(0) ;
                  com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
               }
               GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
               if ( isFullAjaxMode( ) && ! bGXsfl_76_Refreshing )
               {
                  httpContext.doAjaxLoad(76, Grid1Row);
               }
               pr_default.readNext(9);
            }
            pr_default.close(9);
         }
         else
         {
            if ( GXutil.dateCompare(GXutil.nullDate(), AV22FechaFinal) )
            {
               /* Using cursor H007J12 */
               pr_default.execute(10, new Object[] {AV14Cent_Codigo, AV14Cent_Codigo, AV6Alma_Codigo, AV6Alma_Codigo, AV8Bode_Codigo, AV8Bode_Codigo, AV23FechaInicial, new Short(AV46Regi_cod), AV30kard_Elem});
               while ( (pr_default.getStatus(10) != 101) )
               {
                  A85Kard_Regi_Id = H007J12_A85Kard_Regi_Id[0] ;
                  A86Kard_Cent_Id = H007J12_A86Kard_Cent_Id[0] ;
                  A580Mov_Fecha = H007J12_A580Mov_Fecha[0] ;
                  A89Kard_Elem_Cons = H007J12_A89Kard_Elem_Cons[0] ;
                  A88Kard_Bod_Cod = H007J12_A88Kard_Bod_Cod[0] ;
                  A87Kard_Alm_Cod = H007J12_A87Kard_Alm_Cod[0] ;
                  A578Kard_Cent_Cod = H007J12_A578Kard_Cent_Cod[0] ;
                  A577Kard_Regi_Cod = H007J12_A577Kard_Regi_Cod[0] ;
                  A579Mov_Tpmp_Codigo = H007J12_A579Mov_Tpmp_Codigo[0] ;
                  A90Mov_Trans = H007J12_A90Mov_Trans[0] ;
                  A582Mov_Entrada_Cant = H007J12_A582Mov_Entrada_Cant[0] ;
                  n582Mov_Entrada_Cant = H007J12_n582Mov_Entrada_Cant[0] ;
                  A583Mov_Entrada_Valor = H007J12_A583Mov_Entrada_Valor[0] ;
                  n583Mov_Entrada_Valor = H007J12_n583Mov_Entrada_Valor[0] ;
                  A584Mov_Salida_Cant = H007J12_A584Mov_Salida_Cant[0] ;
                  n584Mov_Salida_Cant = H007J12_n584Mov_Salida_Cant[0] ;
                  A585Mov_Salida_Valor = H007J12_A585Mov_Salida_Valor[0] ;
                  n585Mov_Salida_Valor = H007J12_n585Mov_Salida_Valor[0] ;
                  A578Kard_Cent_Cod = H007J12_A578Kard_Cent_Cod[0] ;
                  A577Kard_Regi_Cod = H007J12_A577Kard_Regi_Cod[0] ;
                  AV33kard_Regi_Cod = A577Kard_Regi_Cod ;
                  AV29Kard_Cent_Cod = A578Kard_Cent_Cod ;
                  AV27Kard_Alm_Cod = A87Kard_Alm_Cod ;
                  AV28Kard_Bod_Cod = A88Kard_Bod_Cod ;
                  AV31Kard_Elem_Cons = A89Kard_Elem_Cons ;
                  AV43Mov_Tpmp_Codigo = A579Mov_Tpmp_Codigo ;
                  AV44Mov_Trans = A90Mov_Trans ;
                  AV40Mov_Fecha = A580Mov_Fecha ;
                  AV38Mov_Entrada_Cant = A582Mov_Entrada_Cant ;
                  AV39Mov_Entrada_Valor = A583Mov_Entrada_Valor ;
                  AV41Mov_Salida_Cant = A584Mov_Salida_Cant ;
                  AV42Mov_Salida_Valor = A585Mov_Salida_Valor ;
                  /* Execute user subroutine: 'TRANSACCION' */
                  S129 ();
                  if ( returnInSub )
                  {
                     pr_default.close(10);
                     pr_default.close(10);
                     returnInSub = true;
                     if (true) return;
                  }
                  if ( ( subGrid1_Islastpage == 1 ) || ( subGrid1_Rows == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
                  {
                     sendrow_762( ) ;
                     GRID1_nEOF = (byte)(1) ;
                     com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
                     if ( ( subGrid1_Islastpage == 1 ) && ( ((int)((GRID1_nCurrentRecord) % (subgrid1_recordsperpage( )))) == 0 ) )
                     {
                        GRID1_nFirstRecordOnPage = GRID1_nCurrentRecord ;
                     }
                  }
                  if ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) )
                  {
                     GRID1_nEOF = (byte)(0) ;
                     com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
                  }
                  GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
                  if ( isFullAjaxMode( ) && ! bGXsfl_76_Refreshing )
                  {
                     httpContext.doAjaxLoad(76, Grid1Row);
                  }
                  pr_default.readNext(10);
               }
               pr_default.close(10);
            }
            else
            {
               if ( (( AV22FechaFinal.after( AV23FechaInicial ) ) || ( GXutil.dateCompare(AV22FechaFinal, AV23FechaInicial) )) )
               {
                  /* Using cursor H007J13 */
                  pr_default.execute(11, new Object[] {AV14Cent_Codigo, AV14Cent_Codigo, AV6Alma_Codigo, AV6Alma_Codigo, AV8Bode_Codigo, AV8Bode_Codigo, AV23FechaInicial, AV22FechaFinal, new Short(AV46Regi_cod), AV30kard_Elem});
                  while ( (pr_default.getStatus(11) != 101) )
                  {
                     A85Kard_Regi_Id = H007J13_A85Kard_Regi_Id[0] ;
                     A86Kard_Cent_Id = H007J13_A86Kard_Cent_Id[0] ;
                     A580Mov_Fecha = H007J13_A580Mov_Fecha[0] ;
                     A89Kard_Elem_Cons = H007J13_A89Kard_Elem_Cons[0] ;
                     A88Kard_Bod_Cod = H007J13_A88Kard_Bod_Cod[0] ;
                     A87Kard_Alm_Cod = H007J13_A87Kard_Alm_Cod[0] ;
                     A578Kard_Cent_Cod = H007J13_A578Kard_Cent_Cod[0] ;
                     A577Kard_Regi_Cod = H007J13_A577Kard_Regi_Cod[0] ;
                     A579Mov_Tpmp_Codigo = H007J13_A579Mov_Tpmp_Codigo[0] ;
                     A90Mov_Trans = H007J13_A90Mov_Trans[0] ;
                     A582Mov_Entrada_Cant = H007J13_A582Mov_Entrada_Cant[0] ;
                     n582Mov_Entrada_Cant = H007J13_n582Mov_Entrada_Cant[0] ;
                     A583Mov_Entrada_Valor = H007J13_A583Mov_Entrada_Valor[0] ;
                     n583Mov_Entrada_Valor = H007J13_n583Mov_Entrada_Valor[0] ;
                     A584Mov_Salida_Cant = H007J13_A584Mov_Salida_Cant[0] ;
                     n584Mov_Salida_Cant = H007J13_n584Mov_Salida_Cant[0] ;
                     A585Mov_Salida_Valor = H007J13_A585Mov_Salida_Valor[0] ;
                     n585Mov_Salida_Valor = H007J13_n585Mov_Salida_Valor[0] ;
                     A578Kard_Cent_Cod = H007J13_A578Kard_Cent_Cod[0] ;
                     A577Kard_Regi_Cod = H007J13_A577Kard_Regi_Cod[0] ;
                     AV33kard_Regi_Cod = A577Kard_Regi_Cod ;
                     AV29Kard_Cent_Cod = A578Kard_Cent_Cod ;
                     AV27Kard_Alm_Cod = A87Kard_Alm_Cod ;
                     AV28Kard_Bod_Cod = A88Kard_Bod_Cod ;
                     AV31Kard_Elem_Cons = A89Kard_Elem_Cons ;
                     AV43Mov_Tpmp_Codigo = A579Mov_Tpmp_Codigo ;
                     AV44Mov_Trans = A90Mov_Trans ;
                     AV40Mov_Fecha = A580Mov_Fecha ;
                     AV38Mov_Entrada_Cant = A582Mov_Entrada_Cant ;
                     AV39Mov_Entrada_Valor = A583Mov_Entrada_Valor ;
                     AV41Mov_Salida_Cant = A584Mov_Salida_Cant ;
                     AV42Mov_Salida_Valor = A585Mov_Salida_Valor ;
                     /* Execute user subroutine: 'TRANSACCION' */
                     S129 ();
                     if ( returnInSub )
                     {
                        pr_default.close(11);
                        pr_default.close(11);
                        returnInSub = true;
                        if (true) return;
                     }
                     if ( ( subGrid1_Islastpage == 1 ) || ( subGrid1_Rows == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
                     {
                        sendrow_762( ) ;
                        GRID1_nEOF = (byte)(1) ;
                        com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
                        if ( ( subGrid1_Islastpage == 1 ) && ( ((int)((GRID1_nCurrentRecord) % (subgrid1_recordsperpage( )))) == 0 ) )
                        {
                           GRID1_nFirstRecordOnPage = GRID1_nCurrentRecord ;
                        }
                     }
                     if ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) )
                     {
                        GRID1_nEOF = (byte)(0) ;
                        com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
                     }
                     GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
                     if ( isFullAjaxMode( ) && ! bGXsfl_76_Refreshing )
                     {
                        httpContext.doAjaxLoad(76, Grid1Row);
                     }
                     pr_default.readNext(11);
                  }
                  pr_default.close(11);
               }
               else
               {
                  httpContext.GX_msglist.addItem("Fecha final no es válida");
               }
            }
         }
      }
   }

   public void e197J2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      if ( ! (0==AV53Tipo_codigo) && ! (GXutil.strcmp("", AV30kard_Elem)==0) )
      {
         AV13Cata_Descripcion = "" ;
         AV55tipo_elemento = 0 ;
         /* Using cursor H007J14 */
         pr_default.execute(12, new Object[] {AV30kard_Elem, new Long(AV53Tipo_codigo)});
         while ( (pr_default.getStatus(12) != 101) )
         {
            A37Cata_Codigo = H007J14_A37Cata_Codigo[0] ;
            A33Tipo_Codigo = H007J14_A33Tipo_Codigo[0] ;
            A66Elem_Consecutivo = H007J14_A66Elem_Consecutivo[0] ;
            A298Cata_Descripcion = H007J14_A298Cata_Descripcion[0] ;
            A298Cata_Descripcion = H007J14_A298Cata_Descripcion[0] ;
            AV13Cata_Descripcion = A298Cata_Descripcion ;
            AV55tipo_elemento = A33Tipo_Codigo ;
            /* Execute user subroutine: 'BUSCA KARDEX' */
            S1115 ();
            if ( returnInSub )
            {
               pr_default.close(12);
               pr_default.close(12);
               returnInSub = true;
               if (true) return;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(12);
      }
   }

   public void S129( )
   {
      /* 'TRANSACCION' Routine */
      AV57Tran_ConsecutivoCC = 0 ;
      AV58Tran_FechaRatificacion = GXutil.resetTime( GXutil.nullDate() );
      /* Using cursor H007J15 */
      pr_default.execute(13, new Object[] {new Long(AV44Mov_Trans)});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A46Tran_Id = H007J15_A46Tran_Id[0] ;
         A513Tran_ConsecutivoCC = H007J15_A513Tran_ConsecutivoCC[0] ;
         n513Tran_ConsecutivoCC = H007J15_n513Tran_ConsecutivoCC[0] ;
         A390Tran_FechaRatificacion = H007J15_A390Tran_FechaRatificacion[0] ;
         n390Tran_FechaRatificacion = H007J15_n390Tran_FechaRatificacion[0] ;
         AV57Tran_ConsecutivoCC = A513Tran_ConsecutivoCC ;
         AV58Tran_FechaRatificacion = A390Tran_FechaRatificacion ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(13);
   }

   public void e177J2( )
   {
      /* Image6_Click Routine */
      httpContext.popup(formatLink("com.orions2.sel_elemento") + "?" + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")), new Object[] {"AV30kard_Elem","AV18Elem_Descripcion"});
   }

   private void e207J2( )
   {
      /* Load Routine */
   }

   public void setparameters( Object[] obj )
   {
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
      pa7J2( ) ;
      ws7J2( ) ;
      we7J2( ) ;
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
      httpContext.AddStyleSheetFile("calendar-system.css", "?14361167");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20186141422651");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("consulta_kardex.js", "?20186141422651");
      /* End function include_jscripts */
   }

   public void subsflControlProps_762( )
   {
      edtavKard_regi_cod_Internalname = "vKARD_REGI_COD_"+sGXsfl_76_idx ;
      edtavKard_cent_cod_Internalname = "vKARD_CENT_COD_"+sGXsfl_76_idx ;
      edtavTipo_elemento_Internalname = "vTIPO_ELEMENTO_"+sGXsfl_76_idx ;
      edtavKard_elem_cons_Internalname = "vKARD_ELEM_CONS_"+sGXsfl_76_idx ;
      edtavCata_descripcion_Internalname = "vCATA_DESCRIPCION_"+sGXsfl_76_idx ;
      edtavKard_alm_cod_Internalname = "vKARD_ALM_COD_"+sGXsfl_76_idx ;
      edtavKard_bod_cod_Internalname = "vKARD_BOD_COD_"+sGXsfl_76_idx ;
      edtavMov_tpmp_codigo_Internalname = "vMOV_TPMP_CODIGO_"+sGXsfl_76_idx ;
      edtavMov_trans_Internalname = "vMOV_TRANS_"+sGXsfl_76_idx ;
      edtavTran_consecutivocc_Internalname = "vTRAN_CONSECUTIVOCC_"+sGXsfl_76_idx ;
      edtavTran_fecharatificacion_Internalname = "vTRAN_FECHARATIFICACION_"+sGXsfl_76_idx ;
      edtavMov_fecha_Internalname = "vMOV_FECHA_"+sGXsfl_76_idx ;
      edtavMov_entrada_cant_Internalname = "vMOV_ENTRADA_CANT_"+sGXsfl_76_idx ;
      edtavMov_entrada_valor_Internalname = "vMOV_ENTRADA_VALOR_"+sGXsfl_76_idx ;
      edtavMov_salida_cant_Internalname = "vMOV_SALIDA_CANT_"+sGXsfl_76_idx ;
      edtavMov_salida_valor_Internalname = "vMOV_SALIDA_VALOR_"+sGXsfl_76_idx ;
   }

   public void subsflControlProps_fel_762( )
   {
      edtavKard_regi_cod_Internalname = "vKARD_REGI_COD_"+sGXsfl_76_fel_idx ;
      edtavKard_cent_cod_Internalname = "vKARD_CENT_COD_"+sGXsfl_76_fel_idx ;
      edtavTipo_elemento_Internalname = "vTIPO_ELEMENTO_"+sGXsfl_76_fel_idx ;
      edtavKard_elem_cons_Internalname = "vKARD_ELEM_CONS_"+sGXsfl_76_fel_idx ;
      edtavCata_descripcion_Internalname = "vCATA_DESCRIPCION_"+sGXsfl_76_fel_idx ;
      edtavKard_alm_cod_Internalname = "vKARD_ALM_COD_"+sGXsfl_76_fel_idx ;
      edtavKard_bod_cod_Internalname = "vKARD_BOD_COD_"+sGXsfl_76_fel_idx ;
      edtavMov_tpmp_codigo_Internalname = "vMOV_TPMP_CODIGO_"+sGXsfl_76_fel_idx ;
      edtavMov_trans_Internalname = "vMOV_TRANS_"+sGXsfl_76_fel_idx ;
      edtavTran_consecutivocc_Internalname = "vTRAN_CONSECUTIVOCC_"+sGXsfl_76_fel_idx ;
      edtavTran_fecharatificacion_Internalname = "vTRAN_FECHARATIFICACION_"+sGXsfl_76_fel_idx ;
      edtavMov_fecha_Internalname = "vMOV_FECHA_"+sGXsfl_76_fel_idx ;
      edtavMov_entrada_cant_Internalname = "vMOV_ENTRADA_CANT_"+sGXsfl_76_fel_idx ;
      edtavMov_entrada_valor_Internalname = "vMOV_ENTRADA_VALOR_"+sGXsfl_76_fel_idx ;
      edtavMov_salida_cant_Internalname = "vMOV_SALIDA_CANT_"+sGXsfl_76_fel_idx ;
      edtavMov_salida_valor_Internalname = "vMOV_SALIDA_VALOR_"+sGXsfl_76_fel_idx ;
   }

   public void sendrow_762( )
   {
      subsflControlProps_762( ) ;
      wb7J0( ) ;
      if ( ( subGrid1_Rows * 1 == 0 ) || ( nGXsfl_76_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_76_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_76_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavKard_regi_cod_Internalname,GXutil.ltrim( localUtil.ntoc( AV33kard_Regi_Cod, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(AV33kard_Regi_Cod), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavKard_regi_cod_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(76),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavKard_cent_cod_Internalname,AV29Kard_Cent_Cod,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavKard_cent_cod_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(16),new Integer(0),new Integer(0),new Integer(76),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTipo_elemento_Internalname,GXutil.ltrim( localUtil.ntoc( AV55tipo_elemento, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(AV55tipo_elemento), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTipo_elemento_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(76),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavKard_elem_cons_Internalname,AV31Kard_Elem_Cons,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavKard_elem_cons_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(76),new Integer(1),new Integer(0),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCata_descripcion_Internalname,AV13Cata_Descripcion,GXutil.rtrim( localUtil.format( AV13Cata_Descripcion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCata_descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(76),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavKard_alm_cod_Internalname,AV27Kard_Alm_Cod,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavKard_alm_cod_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(76),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavKard_bod_cod_Internalname,AV28Kard_Bod_Cod,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavKard_bod_cod_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(76),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMov_tpmp_codigo_Internalname,AV43Mov_Tpmp_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMov_tpmp_codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(76),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMov_trans_Internalname,GXutil.ltrim( localUtil.ntoc( AV44Mov_Trans, (byte)(11), (byte)(0), ",", "")),((edtavMov_trans_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV44Mov_Trans), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV44Mov_Trans), "ZZZZZZZZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMov_trans_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(0),new Integer(edtavMov_trans_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(76),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTran_consecutivocc_Internalname,GXutil.ltrim( localUtil.ntoc( AV57Tran_ConsecutivoCC, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(AV57Tran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTran_consecutivocc_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(76),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTran_fecharatificacion_Internalname,localUtil.ttoc( AV58Tran_FechaRatificacion, 10, 8, 0, 3, "/", ":", " "),localUtil.format( AV58Tran_FechaRatificacion, "99/99/9999 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTran_fecharatificacion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(0),new Integer(edtavTran_fecharatificacion_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(16),new Integer(0),new Integer(0),new Integer(76),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMov_fecha_Internalname,localUtil.format(AV40Mov_Fecha, "99/99/99"),localUtil.format( AV40Mov_Fecha, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMov_fecha_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(76),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMov_entrada_cant_Internalname,GXutil.ltrim( localUtil.ntoc( AV38Mov_Entrada_Cant, (byte)(8), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(AV38Mov_Entrada_Cant), "ZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMov_entrada_cant_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(76),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMov_entrada_valor_Internalname,GXutil.ltrim( localUtil.ntoc( AV39Mov_Entrada_Valor, (byte)(24), (byte)(2), ",", "")),localUtil.format( AV39Mov_Entrada_Valor, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMov_entrada_valor_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(76),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMov_salida_cant_Internalname,GXutil.ltrim( localUtil.ntoc( AV41Mov_Salida_Cant, (byte)(8), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(AV41Mov_Salida_Cant), "ZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMov_salida_cant_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(76),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMov_salida_valor_Internalname,GXutil.ltrim( localUtil.ntoc( AV42Mov_Salida_Valor, (byte)(24), (byte)(2), ",", "")),localUtil.format( AV42Mov_Salida_Valor, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMov_salida_valor_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(76),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_76_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_76_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_76_idx+1)) ;
         sGXsfl_76_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_76_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_762( ) ;
      }
      /* End function sendrow_762 */
   }

   public void init_default_properties( )
   {
      lblTitle_Internalname = "TITLE" ;
      divTitlecontainer_Internalname = "TITLECONTAINER" ;
      imgImage7_Internalname = "IMAGE7" ;
      edtavTipo_codigo_Internalname = "vTIPO_CODIGO" ;
      edtavTipo_descripcion_Internalname = "vTIPO_DESCRIPCION" ;
      imgImage6_Internalname = "IMAGE6" ;
      edtavKard_elem_Internalname = "vKARD_ELEM" ;
      edtavElem_descripcion_Internalname = "vELEM_DESCRIPCION" ;
      imgImage1_Internalname = "IMAGE1" ;
      edtavRegi_cod_Internalname = "vREGI_COD" ;
      edtavRegi_descripcion_Internalname = "vREGI_DESCRIPCION" ;
      imgImage2_Internalname = "IMAGE2" ;
      edtavCent_codigo_Internalname = "vCENT_CODIGO" ;
      edtavCent_descripcion_Internalname = "vCENT_DESCRIPCION" ;
      imgImage3_Internalname = "IMAGE3" ;
      edtavAlma_codigo_Internalname = "vALMA_CODIGO" ;
      edtavAlma_descripcion_Internalname = "vALMA_DESCRIPCION" ;
      imgImage4_Internalname = "IMAGE4" ;
      edtavBode_codigo_Internalname = "vBODE_CODIGO" ;
      edtavBode_descripcion_Internalname = "vBODE_DESCRIPCION" ;
      edtavFechainicial_Internalname = "vFECHAINICIAL" ;
      edtavFechafinal_Internalname = "vFECHAFINAL" ;
      divTable17_Internalname = "TABLE17" ;
      edtavKard_regi_cod_Internalname = "vKARD_REGI_COD" ;
      edtavKard_cent_cod_Internalname = "vKARD_CENT_COD" ;
      edtavTipo_elemento_Internalname = "vTIPO_ELEMENTO" ;
      edtavKard_elem_cons_Internalname = "vKARD_ELEM_CONS" ;
      edtavCata_descripcion_Internalname = "vCATA_DESCRIPCION" ;
      edtavKard_alm_cod_Internalname = "vKARD_ALM_COD" ;
      edtavKard_bod_cod_Internalname = "vKARD_BOD_COD" ;
      edtavMov_tpmp_codigo_Internalname = "vMOV_TPMP_CODIGO" ;
      edtavMov_trans_Internalname = "vMOV_TRANS" ;
      edtavTran_consecutivocc_Internalname = "vTRAN_CONSECUTIVOCC" ;
      edtavTran_fecharatificacion_Internalname = "vTRAN_FECHARATIFICACION" ;
      edtavMov_fecha_Internalname = "vMOV_FECHA" ;
      edtavMov_entrada_cant_Internalname = "vMOV_ENTRADA_CANT" ;
      edtavMov_entrada_valor_Internalname = "vMOV_ENTRADA_VALOR" ;
      edtavMov_salida_cant_Internalname = "vMOV_SALIDA_CANT" ;
      edtavMov_salida_valor_Internalname = "vMOV_SALIDA_VALOR" ;
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
      edtavMov_salida_valor_Jsonclick = "" ;
      edtavMov_salida_cant_Jsonclick = "" ;
      edtavMov_entrada_valor_Jsonclick = "" ;
      edtavMov_entrada_cant_Jsonclick = "" ;
      edtavMov_fecha_Jsonclick = "" ;
      edtavTran_fecharatificacion_Jsonclick = "" ;
      edtavTran_consecutivocc_Jsonclick = "" ;
      edtavMov_trans_Jsonclick = "" ;
      edtavMov_tpmp_codigo_Jsonclick = "" ;
      edtavKard_bod_cod_Jsonclick = "" ;
      edtavKard_alm_cod_Jsonclick = "" ;
      edtavCata_descripcion_Jsonclick = "" ;
      edtavKard_elem_cons_Jsonclick = "" ;
      edtavTipo_elemento_Jsonclick = "" ;
      edtavKard_cent_cod_Jsonclick = "" ;
      edtavKard_regi_cod_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtavTran_fecharatificacion_Enabled = 0 ;
      edtavMov_trans_Enabled = 0 ;
      subGrid1_Class = "WorkWith" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavFechafinal_Jsonclick = "" ;
      edtavFechafinal_Enabled = 1 ;
      edtavFechainicial_Jsonclick = "" ;
      edtavFechainicial_Enabled = 1 ;
      edtavBode_descripcion_Jsonclick = "" ;
      edtavBode_descripcion_Enabled = 1 ;
      edtavBode_codigo_Jsonclick = "" ;
      edtavBode_codigo_Enabled = 1 ;
      imgImage4_Link = "" ;
      edtavAlma_descripcion_Jsonclick = "" ;
      edtavAlma_descripcion_Enabled = 1 ;
      edtavAlma_codigo_Jsonclick = "" ;
      edtavAlma_codigo_Enabled = 1 ;
      imgImage3_Link = "" ;
      edtavCent_descripcion_Jsonclick = "" ;
      edtavCent_descripcion_Enabled = 1 ;
      edtavCent_codigo_Jsonclick = "" ;
      edtavCent_codigo_Enabled = 1 ;
      imgImage2_Link = "" ;
      edtavRegi_descripcion_Jsonclick = "" ;
      edtavRegi_descripcion_Enabled = 1 ;
      edtavRegi_cod_Jsonclick = "" ;
      edtavRegi_cod_Enabled = 1 ;
      imgImage1_Link = "" ;
      edtavElem_descripcion_Enabled = 1 ;
      edtavKard_elem_Jsonclick = "" ;
      edtavKard_elem_Enabled = 1 ;
      edtavTipo_descripcion_Jsonclick = "" ;
      edtavTipo_descripcion_Enabled = 1 ;
      edtavTipo_codigo_Jsonclick = "" ;
      edtavTipo_codigo_Enabled = 1 ;
      imgImage7_Link = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Consulta_Kardex" );
      subGrid1_Rows = 0 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV53Tipo_codigo',fld:'vTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV30kard_Elem',fld:'vKARD_ELEM',pic:'',nv:''},{av:'AV13Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV55tipo_elemento',fld:'vTIPO_ELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV46Regi_cod',fld:'vREGI_COD',pic:'ZZZ9',nv:0},{av:'AV23FechaInicial',fld:'vFECHAINICIAL',pic:'',nv:''},{av:'A577Kard_Regi_Cod',fld:'KARD_REGI_COD',pic:'ZZZ9',nv:0},{av:'A578Kard_Cent_Cod',fld:'KARD_CENT_COD',pic:'',nv:''},{av:'AV14Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''},{av:'A87Kard_Alm_Cod',fld:'KARD_ALM_COD',pic:'',nv:''},{av:'AV6Alma_Codigo',fld:'vALMA_CODIGO',pic:'',nv:''},{av:'A88Kard_Bod_Cod',fld:'KARD_BOD_COD',pic:'',nv:''},{av:'AV8Bode_Codigo',fld:'vBODE_CODIGO',pic:'',nv:''},{av:'A89Kard_Elem_Cons',fld:'KARD_ELEM_CONS',pic:'',nv:''},{av:'A579Mov_Tpmp_Codigo',fld:'MOV_TPMP_CODIGO',pic:'',nv:''},{av:'A90Mov_Trans',fld:'MOV_TRANS',pic:'ZZZZZZZZZZ9',nv:0},{av:'A580Mov_Fecha',fld:'MOV_FECHA',pic:'',nv:''},{av:'A582Mov_Entrada_Cant',fld:'MOV_ENTRADA_CANT',pic:'ZZZZZZZ9',nv:0},{av:'A583Mov_Entrada_Valor',fld:'MOV_ENTRADA_VALOR',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A584Mov_Salida_Cant',fld:'MOV_SALIDA_CANT',pic:'ZZZZZZZ9',nv:0},{av:'A585Mov_Salida_Valor',fld:'MOV_SALIDA_VALOR',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV22FechaFinal',fld:'vFECHAFINAL',pic:'',nv:''},{av:'AV57Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV58Tran_FechaRatificacion',fld:'vTRAN_FECHARATIFICACION',pic:'99/99/9999 99:99',nv:''},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV44Mov_Trans',fld:'vMOV_TRANS',pic:'ZZZZZZZZZZ9',nv:0},{av:'A513Tran_ConsecutivoCC',fld:'TRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A390Tran_FechaRatificacion',fld:'TRAN_FECHARATIFICACION',pic:'99/99/9999 99:99',nv:''}],oparms:[{av:'AV13Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV55tipo_elemento',fld:'vTIPO_ELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV33kard_Regi_Cod',fld:'vKARD_REGI_COD',pic:'ZZZ9',nv:0},{av:'AV29Kard_Cent_Cod',fld:'vKARD_CENT_COD',pic:'',nv:''},{av:'AV27Kard_Alm_Cod',fld:'vKARD_ALM_COD',pic:'',nv:''},{av:'AV28Kard_Bod_Cod',fld:'vKARD_BOD_COD',pic:'',nv:''},{av:'AV31Kard_Elem_Cons',fld:'vKARD_ELEM_CONS',pic:'',nv:''},{av:'AV43Mov_Tpmp_Codigo',fld:'vMOV_TPMP_CODIGO',pic:'',nv:''},{av:'AV44Mov_Trans',fld:'vMOV_TRANS',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV40Mov_Fecha',fld:'vMOV_FECHA',pic:'',nv:''},{av:'AV38Mov_Entrada_Cant',fld:'vMOV_ENTRADA_CANT',pic:'ZZZZZZZ9',nv:0},{av:'AV39Mov_Entrada_Valor',fld:'vMOV_ENTRADA_VALOR',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV41Mov_Salida_Cant',fld:'vMOV_SALIDA_CANT',pic:'ZZZZZZZ9',nv:0},{av:'AV42Mov_Salida_Valor',fld:'vMOV_SALIDA_VALOR',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV57Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV58Tran_FechaRatificacion',fld:'vTRAN_FECHARATIFICACION',pic:'99/99/9999 99:99',nv:''}]}");
      setEventMetadata("VTIPO_CODIGO.ISVALID","{handler:'e117J2',iparms:[{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV53Tipo_codigo',fld:'vTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A253Tipo_Descripcion',fld:'TIPO_DESCRIPCION',pic:'@!',nv:''}],oparms:[{av:'AV54Tipo_Descripcion',fld:'vTIPO_DESCRIPCION',pic:'@!',nv:''}]}");
      setEventMetadata("VKARD_ELEM.ISVALID","{handler:'e127J2',iparms:[{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV30kard_Elem',fld:'vKARD_ELEM',pic:'',nv:''},{av:'A557Elem_Descripcion',fld:'ELEM_DESCRIPCION',pic:'',nv:''}],oparms:[{av:'AV18Elem_Descripcion',fld:'vELEM_DESCRIPCION',pic:'',nv:''}]}");
      setEventMetadata("VREGI_COD.ISVALID","{handler:'e137J2',iparms:[{av:'A12Regi_Cod',fld:'REGI_COD',pic:'ZZZ9',nv:0},{av:'AV46Regi_cod',fld:'vREGI_COD',pic:'ZZZ9',nv:0},{av:'A13Regi_Descripcion',fld:'REGI_DESCRIPCION',pic:'',nv:''}],oparms:[{av:'AV48Regi_Descripcion',fld:'vREGI_DESCRIPCION',pic:'',nv:''}]}");
      setEventMetadata("VCENT_CODIGO.ISVALID","{handler:'e147J2',iparms:[{av:'A3Cent_Codigo',fld:'CENT_CODIGO',pic:'',nv:''},{av:'AV14Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''},{av:'A4Cent_Descripcion',fld:'CENT_DESCRIPCION',pic:'',nv:''}],oparms:[{av:'AV15Cent_Descripcion',fld:'vCENT_DESCRIPCION',pic:'',nv:''}]}");
      setEventMetadata("VALMA_CODIGO.ISVALID","{handler:'e157J2',iparms:[{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',nv:''},{av:'AV6Alma_Codigo',fld:'vALMA_CODIGO',pic:'',nv:''},{av:'A252Alma_Descripcion',fld:'ALMA_DESCRIPCION',pic:'@!',nv:''}],oparms:[{av:'AV7Alma_Descripcion',fld:'vALMA_DESCRIPCION',pic:'@!',nv:''}]}");
      setEventMetadata("VBODE_CODIGO.ISVALID","{handler:'e167J2',iparms:[{av:'A31Bode_Codigo',fld:'BODE_CODIGO',pic:'',nv:''},{av:'AV8Bode_Codigo',fld:'vBODE_CODIGO',pic:'',nv:''},{av:'A251Bode_Descripcion',fld:'BODE_DESCRIPCION',pic:'@!',nv:''}],oparms:[{av:'AV9Bode_Descripcion',fld:'vBODE_DESCRIPCION',pic:'@!',nv:''}]}");
      setEventMetadata("IMAGE6.CLICK","{handler:'e177J2',iparms:[],oparms:[{av:'AV18Elem_Descripcion',fld:'vELEM_DESCRIPCION',pic:'',nv:''},{av:'AV30kard_Elem',fld:'vKARD_ELEM',pic:'',nv:''}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV53Tipo_codigo',fld:'vTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV30kard_Elem',fld:'vKARD_ELEM',pic:'',nv:''},{av:'AV13Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV55tipo_elemento',fld:'vTIPO_ELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV46Regi_cod',fld:'vREGI_COD',pic:'ZZZ9',nv:0},{av:'AV23FechaInicial',fld:'vFECHAINICIAL',pic:'',nv:''},{av:'A577Kard_Regi_Cod',fld:'KARD_REGI_COD',pic:'ZZZ9',nv:0},{av:'A578Kard_Cent_Cod',fld:'KARD_CENT_COD',pic:'',nv:''},{av:'AV14Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''},{av:'A87Kard_Alm_Cod',fld:'KARD_ALM_COD',pic:'',nv:''},{av:'AV6Alma_Codigo',fld:'vALMA_CODIGO',pic:'',nv:''},{av:'A88Kard_Bod_Cod',fld:'KARD_BOD_COD',pic:'',nv:''},{av:'AV8Bode_Codigo',fld:'vBODE_CODIGO',pic:'',nv:''},{av:'A89Kard_Elem_Cons',fld:'KARD_ELEM_CONS',pic:'',nv:''},{av:'A579Mov_Tpmp_Codigo',fld:'MOV_TPMP_CODIGO',pic:'',nv:''},{av:'A90Mov_Trans',fld:'MOV_TRANS',pic:'ZZZZZZZZZZ9',nv:0},{av:'A580Mov_Fecha',fld:'MOV_FECHA',pic:'',nv:''},{av:'A582Mov_Entrada_Cant',fld:'MOV_ENTRADA_CANT',pic:'ZZZZZZZ9',nv:0},{av:'A583Mov_Entrada_Valor',fld:'MOV_ENTRADA_VALOR',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A584Mov_Salida_Cant',fld:'MOV_SALIDA_CANT',pic:'ZZZZZZZ9',nv:0},{av:'A585Mov_Salida_Valor',fld:'MOV_SALIDA_VALOR',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV22FechaFinal',fld:'vFECHAFINAL',pic:'',nv:''},{av:'AV57Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV58Tran_FechaRatificacion',fld:'vTRAN_FECHARATIFICACION',pic:'99/99/9999 99:99',nv:''},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV44Mov_Trans',fld:'vMOV_TRANS',pic:'ZZZZZZZZZZ9',nv:0},{av:'A513Tran_ConsecutivoCC',fld:'TRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A390Tran_FechaRatificacion',fld:'TRAN_FECHARATIFICACION',pic:'99/99/9999 99:99',nv:''}],oparms:[{av:'AV13Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV55tipo_elemento',fld:'vTIPO_ELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV33kard_Regi_Cod',fld:'vKARD_REGI_COD',pic:'ZZZ9',nv:0},{av:'AV29Kard_Cent_Cod',fld:'vKARD_CENT_COD',pic:'',nv:''},{av:'AV27Kard_Alm_Cod',fld:'vKARD_ALM_COD',pic:'',nv:''},{av:'AV28Kard_Bod_Cod',fld:'vKARD_BOD_COD',pic:'',nv:''},{av:'AV31Kard_Elem_Cons',fld:'vKARD_ELEM_CONS',pic:'',nv:''},{av:'AV43Mov_Tpmp_Codigo',fld:'vMOV_TPMP_CODIGO',pic:'',nv:''},{av:'AV44Mov_Trans',fld:'vMOV_TRANS',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV40Mov_Fecha',fld:'vMOV_FECHA',pic:'',nv:''},{av:'AV38Mov_Entrada_Cant',fld:'vMOV_ENTRADA_CANT',pic:'ZZZZZZZ9',nv:0},{av:'AV39Mov_Entrada_Valor',fld:'vMOV_ENTRADA_VALOR',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV41Mov_Salida_Cant',fld:'vMOV_SALIDA_CANT',pic:'ZZZZZZZ9',nv:0},{av:'AV42Mov_Salida_Valor',fld:'vMOV_SALIDA_VALOR',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV57Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV58Tran_FechaRatificacion',fld:'vTRAN_FECHARATIFICACION',pic:'99/99/9999 99:99',nv:''}]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV53Tipo_codigo',fld:'vTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV30kard_Elem',fld:'vKARD_ELEM',pic:'',nv:''},{av:'AV13Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV55tipo_elemento',fld:'vTIPO_ELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV46Regi_cod',fld:'vREGI_COD',pic:'ZZZ9',nv:0},{av:'AV23FechaInicial',fld:'vFECHAINICIAL',pic:'',nv:''},{av:'A577Kard_Regi_Cod',fld:'KARD_REGI_COD',pic:'ZZZ9',nv:0},{av:'A578Kard_Cent_Cod',fld:'KARD_CENT_COD',pic:'',nv:''},{av:'AV14Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''},{av:'A87Kard_Alm_Cod',fld:'KARD_ALM_COD',pic:'',nv:''},{av:'AV6Alma_Codigo',fld:'vALMA_CODIGO',pic:'',nv:''},{av:'A88Kard_Bod_Cod',fld:'KARD_BOD_COD',pic:'',nv:''},{av:'AV8Bode_Codigo',fld:'vBODE_CODIGO',pic:'',nv:''},{av:'A89Kard_Elem_Cons',fld:'KARD_ELEM_CONS',pic:'',nv:''},{av:'A579Mov_Tpmp_Codigo',fld:'MOV_TPMP_CODIGO',pic:'',nv:''},{av:'A90Mov_Trans',fld:'MOV_TRANS',pic:'ZZZZZZZZZZ9',nv:0},{av:'A580Mov_Fecha',fld:'MOV_FECHA',pic:'',nv:''},{av:'A582Mov_Entrada_Cant',fld:'MOV_ENTRADA_CANT',pic:'ZZZZZZZ9',nv:0},{av:'A583Mov_Entrada_Valor',fld:'MOV_ENTRADA_VALOR',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A584Mov_Salida_Cant',fld:'MOV_SALIDA_CANT',pic:'ZZZZZZZ9',nv:0},{av:'A585Mov_Salida_Valor',fld:'MOV_SALIDA_VALOR',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV22FechaFinal',fld:'vFECHAFINAL',pic:'',nv:''},{av:'AV57Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV58Tran_FechaRatificacion',fld:'vTRAN_FECHARATIFICACION',pic:'99/99/9999 99:99',nv:''},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV44Mov_Trans',fld:'vMOV_TRANS',pic:'ZZZZZZZZZZ9',nv:0},{av:'A513Tran_ConsecutivoCC',fld:'TRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A390Tran_FechaRatificacion',fld:'TRAN_FECHARATIFICACION',pic:'99/99/9999 99:99',nv:''}],oparms:[{av:'AV13Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV55tipo_elemento',fld:'vTIPO_ELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV33kard_Regi_Cod',fld:'vKARD_REGI_COD',pic:'ZZZ9',nv:0},{av:'AV29Kard_Cent_Cod',fld:'vKARD_CENT_COD',pic:'',nv:''},{av:'AV27Kard_Alm_Cod',fld:'vKARD_ALM_COD',pic:'',nv:''},{av:'AV28Kard_Bod_Cod',fld:'vKARD_BOD_COD',pic:'',nv:''},{av:'AV31Kard_Elem_Cons',fld:'vKARD_ELEM_CONS',pic:'',nv:''},{av:'AV43Mov_Tpmp_Codigo',fld:'vMOV_TPMP_CODIGO',pic:'',nv:''},{av:'AV44Mov_Trans',fld:'vMOV_TRANS',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV40Mov_Fecha',fld:'vMOV_FECHA',pic:'',nv:''},{av:'AV38Mov_Entrada_Cant',fld:'vMOV_ENTRADA_CANT',pic:'ZZZZZZZ9',nv:0},{av:'AV39Mov_Entrada_Valor',fld:'vMOV_ENTRADA_VALOR',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV41Mov_Salida_Cant',fld:'vMOV_SALIDA_CANT',pic:'ZZZZZZZ9',nv:0},{av:'AV42Mov_Salida_Valor',fld:'vMOV_SALIDA_VALOR',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV57Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV58Tran_FechaRatificacion',fld:'vTRAN_FECHARATIFICACION',pic:'99/99/9999 99:99',nv:''}]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV53Tipo_codigo',fld:'vTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV30kard_Elem',fld:'vKARD_ELEM',pic:'',nv:''},{av:'AV13Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV55tipo_elemento',fld:'vTIPO_ELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV46Regi_cod',fld:'vREGI_COD',pic:'ZZZ9',nv:0},{av:'AV23FechaInicial',fld:'vFECHAINICIAL',pic:'',nv:''},{av:'A577Kard_Regi_Cod',fld:'KARD_REGI_COD',pic:'ZZZ9',nv:0},{av:'A578Kard_Cent_Cod',fld:'KARD_CENT_COD',pic:'',nv:''},{av:'AV14Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''},{av:'A87Kard_Alm_Cod',fld:'KARD_ALM_COD',pic:'',nv:''},{av:'AV6Alma_Codigo',fld:'vALMA_CODIGO',pic:'',nv:''},{av:'A88Kard_Bod_Cod',fld:'KARD_BOD_COD',pic:'',nv:''},{av:'AV8Bode_Codigo',fld:'vBODE_CODIGO',pic:'',nv:''},{av:'A89Kard_Elem_Cons',fld:'KARD_ELEM_CONS',pic:'',nv:''},{av:'A579Mov_Tpmp_Codigo',fld:'MOV_TPMP_CODIGO',pic:'',nv:''},{av:'A90Mov_Trans',fld:'MOV_TRANS',pic:'ZZZZZZZZZZ9',nv:0},{av:'A580Mov_Fecha',fld:'MOV_FECHA',pic:'',nv:''},{av:'A582Mov_Entrada_Cant',fld:'MOV_ENTRADA_CANT',pic:'ZZZZZZZ9',nv:0},{av:'A583Mov_Entrada_Valor',fld:'MOV_ENTRADA_VALOR',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A584Mov_Salida_Cant',fld:'MOV_SALIDA_CANT',pic:'ZZZZZZZ9',nv:0},{av:'A585Mov_Salida_Valor',fld:'MOV_SALIDA_VALOR',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV22FechaFinal',fld:'vFECHAFINAL',pic:'',nv:''},{av:'AV57Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV58Tran_FechaRatificacion',fld:'vTRAN_FECHARATIFICACION',pic:'99/99/9999 99:99',nv:''},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV44Mov_Trans',fld:'vMOV_TRANS',pic:'ZZZZZZZZZZ9',nv:0},{av:'A513Tran_ConsecutivoCC',fld:'TRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A390Tran_FechaRatificacion',fld:'TRAN_FECHARATIFICACION',pic:'99/99/9999 99:99',nv:''}],oparms:[{av:'AV13Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV55tipo_elemento',fld:'vTIPO_ELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV33kard_Regi_Cod',fld:'vKARD_REGI_COD',pic:'ZZZ9',nv:0},{av:'AV29Kard_Cent_Cod',fld:'vKARD_CENT_COD',pic:'',nv:''},{av:'AV27Kard_Alm_Cod',fld:'vKARD_ALM_COD',pic:'',nv:''},{av:'AV28Kard_Bod_Cod',fld:'vKARD_BOD_COD',pic:'',nv:''},{av:'AV31Kard_Elem_Cons',fld:'vKARD_ELEM_CONS',pic:'',nv:''},{av:'AV43Mov_Tpmp_Codigo',fld:'vMOV_TPMP_CODIGO',pic:'',nv:''},{av:'AV44Mov_Trans',fld:'vMOV_TRANS',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV40Mov_Fecha',fld:'vMOV_FECHA',pic:'',nv:''},{av:'AV38Mov_Entrada_Cant',fld:'vMOV_ENTRADA_CANT',pic:'ZZZZZZZ9',nv:0},{av:'AV39Mov_Entrada_Valor',fld:'vMOV_ENTRADA_VALOR',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV41Mov_Salida_Cant',fld:'vMOV_SALIDA_CANT',pic:'ZZZZZZZ9',nv:0},{av:'AV42Mov_Salida_Valor',fld:'vMOV_SALIDA_VALOR',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV57Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV58Tran_FechaRatificacion',fld:'vTRAN_FECHARATIFICACION',pic:'99/99/9999 99:99',nv:''}]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV53Tipo_codigo',fld:'vTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV30kard_Elem',fld:'vKARD_ELEM',pic:'',nv:''},{av:'AV13Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV55tipo_elemento',fld:'vTIPO_ELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV46Regi_cod',fld:'vREGI_COD',pic:'ZZZ9',nv:0},{av:'AV23FechaInicial',fld:'vFECHAINICIAL',pic:'',nv:''},{av:'A577Kard_Regi_Cod',fld:'KARD_REGI_COD',pic:'ZZZ9',nv:0},{av:'A578Kard_Cent_Cod',fld:'KARD_CENT_COD',pic:'',nv:''},{av:'AV14Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''},{av:'A87Kard_Alm_Cod',fld:'KARD_ALM_COD',pic:'',nv:''},{av:'AV6Alma_Codigo',fld:'vALMA_CODIGO',pic:'',nv:''},{av:'A88Kard_Bod_Cod',fld:'KARD_BOD_COD',pic:'',nv:''},{av:'AV8Bode_Codigo',fld:'vBODE_CODIGO',pic:'',nv:''},{av:'A89Kard_Elem_Cons',fld:'KARD_ELEM_CONS',pic:'',nv:''},{av:'A579Mov_Tpmp_Codigo',fld:'MOV_TPMP_CODIGO',pic:'',nv:''},{av:'A90Mov_Trans',fld:'MOV_TRANS',pic:'ZZZZZZZZZZ9',nv:0},{av:'A580Mov_Fecha',fld:'MOV_FECHA',pic:'',nv:''},{av:'A582Mov_Entrada_Cant',fld:'MOV_ENTRADA_CANT',pic:'ZZZZZZZ9',nv:0},{av:'A583Mov_Entrada_Valor',fld:'MOV_ENTRADA_VALOR',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A584Mov_Salida_Cant',fld:'MOV_SALIDA_CANT',pic:'ZZZZZZZ9',nv:0},{av:'A585Mov_Salida_Valor',fld:'MOV_SALIDA_VALOR',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV22FechaFinal',fld:'vFECHAFINAL',pic:'',nv:''},{av:'AV57Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV58Tran_FechaRatificacion',fld:'vTRAN_FECHARATIFICACION',pic:'99/99/9999 99:99',nv:''},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV44Mov_Trans',fld:'vMOV_TRANS',pic:'ZZZZZZZZZZ9',nv:0},{av:'A513Tran_ConsecutivoCC',fld:'TRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A390Tran_FechaRatificacion',fld:'TRAN_FECHARATIFICACION',pic:'99/99/9999 99:99',nv:''}],oparms:[{av:'AV13Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV55tipo_elemento',fld:'vTIPO_ELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV33kard_Regi_Cod',fld:'vKARD_REGI_COD',pic:'ZZZ9',nv:0},{av:'AV29Kard_Cent_Cod',fld:'vKARD_CENT_COD',pic:'',nv:''},{av:'AV27Kard_Alm_Cod',fld:'vKARD_ALM_COD',pic:'',nv:''},{av:'AV28Kard_Bod_Cod',fld:'vKARD_BOD_COD',pic:'',nv:''},{av:'AV31Kard_Elem_Cons',fld:'vKARD_ELEM_CONS',pic:'',nv:''},{av:'AV43Mov_Tpmp_Codigo',fld:'vMOV_TPMP_CODIGO',pic:'',nv:''},{av:'AV44Mov_Trans',fld:'vMOV_TRANS',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV40Mov_Fecha',fld:'vMOV_FECHA',pic:'',nv:''},{av:'AV38Mov_Entrada_Cant',fld:'vMOV_ENTRADA_CANT',pic:'ZZZZZZZ9',nv:0},{av:'AV39Mov_Entrada_Valor',fld:'vMOV_ENTRADA_VALOR',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV41Mov_Salida_Cant',fld:'vMOV_SALIDA_CANT',pic:'ZZZZZZZ9',nv:0},{av:'AV42Mov_Salida_Valor',fld:'vMOV_SALIDA_VALOR',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV57Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV58Tran_FechaRatificacion',fld:'vTRAN_FECHARATIFICACION',pic:'99/99/9999 99:99',nv:''}]}");
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
      AV30kard_Elem = "" ;
      AV13Cata_Descripcion = "" ;
      A66Elem_Consecutivo = "" ;
      A298Cata_Descripcion = "" ;
      AV23FechaInicial = GXutil.nullDate() ;
      A578Kard_Cent_Cod = "" ;
      AV14Cent_Codigo = "" ;
      A87Kard_Alm_Cod = "" ;
      AV6Alma_Codigo = "" ;
      A88Kard_Bod_Cod = "" ;
      AV8Bode_Codigo = "" ;
      A89Kard_Elem_Cons = "" ;
      A579Mov_Tpmp_Codigo = "" ;
      A580Mov_Fecha = GXutil.nullDate() ;
      A583Mov_Entrada_Valor = DecimalUtil.ZERO ;
      A585Mov_Salida_Valor = DecimalUtil.ZERO ;
      AV22FechaFinal = GXutil.nullDate() ;
      AV58Tran_FechaRatificacion = GXutil.resetTime( GXutil.nullDate() );
      A390Tran_FechaRatificacion = GXutil.resetTime( GXutil.nullDate() );
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      A253Tipo_Descripcion = "" ;
      A557Elem_Descripcion = "" ;
      A13Regi_Descripcion = "" ;
      A3Cent_Codigo = "" ;
      A4Cent_Descripcion = "" ;
      A28Alma_Codigo = "" ;
      A252Alma_Descripcion = "" ;
      A31Bode_Codigo = "" ;
      A251Bode_Descripcion = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblTitle_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      sImgUrl = "" ;
      TempTags = "" ;
      AV54Tipo_Descripcion = "" ;
      imgImage6_Jsonclick = "" ;
      AV18Elem_Descripcion = "" ;
      AV48Regi_Descripcion = "" ;
      AV15Cent_Descripcion = "" ;
      AV7Alma_Descripcion = "" ;
      AV9Bode_Descripcion = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV29Kard_Cent_Cod = "" ;
      AV31Kard_Elem_Cons = "" ;
      AV27Kard_Alm_Cod = "" ;
      AV28Kard_Bod_Cod = "" ;
      AV43Mov_Tpmp_Codigo = "" ;
      AV40Mov_Fecha = GXutil.nullDate() ;
      AV39Mov_Entrada_Valor = DecimalUtil.ZERO ;
      AV42Mov_Salida_Valor = DecimalUtil.ZERO ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      scmdbuf = "" ;
      H007J2_A33Tipo_Codigo = new long[1] ;
      H007J2_A253Tipo_Descripcion = new String[] {""} ;
      H007J3_A66Elem_Consecutivo = new String[] {""} ;
      H007J3_A557Elem_Descripcion = new String[] {""} ;
      H007J4_A2Regi_Id = new long[1] ;
      H007J4_A12Regi_Cod = new short[1] ;
      H007J4_A13Regi_Descripcion = new String[] {""} ;
      H007J5_A1Cent_Id = new long[1] ;
      H007J5_A3Cent_Codigo = new String[] {""} ;
      H007J5_A4Cent_Descripcion = new String[] {""} ;
      H007J6_A1Cent_Id = new long[1] ;
      H007J6_A27Alma_Modulo = new String[] {""} ;
      H007J6_A28Alma_Codigo = new String[] {""} ;
      H007J6_A252Alma_Descripcion = new String[] {""} ;
      H007J7_A31Bode_Codigo = new String[] {""} ;
      H007J7_A251Bode_Descripcion = new String[] {""} ;
      H007J8_A85Kard_Regi_Id = new long[1] ;
      H007J8_A86Kard_Cent_Id = new long[1] ;
      H007J8_A89Kard_Elem_Cons = new String[] {""} ;
      H007J8_A88Kard_Bod_Cod = new String[] {""} ;
      H007J8_A87Kard_Alm_Cod = new String[] {""} ;
      H007J8_A578Kard_Cent_Cod = new String[] {""} ;
      H007J8_A577Kard_Regi_Cod = new short[1] ;
      H007J8_A579Mov_Tpmp_Codigo = new String[] {""} ;
      H007J8_A90Mov_Trans = new long[1] ;
      H007J8_A580Mov_Fecha = new java.util.Date[] {GXutil.nullDate()} ;
      H007J8_A582Mov_Entrada_Cant = new int[1] ;
      H007J8_n582Mov_Entrada_Cant = new boolean[] {false} ;
      H007J8_A583Mov_Entrada_Valor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H007J8_n583Mov_Entrada_Valor = new boolean[] {false} ;
      H007J8_A584Mov_Salida_Cant = new int[1] ;
      H007J8_n584Mov_Salida_Cant = new boolean[] {false} ;
      H007J8_A585Mov_Salida_Valor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H007J8_n585Mov_Salida_Valor = new boolean[] {false} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      H007J9_A85Kard_Regi_Id = new long[1] ;
      H007J9_A86Kard_Cent_Id = new long[1] ;
      H007J9_A580Mov_Fecha = new java.util.Date[] {GXutil.nullDate()} ;
      H007J9_A89Kard_Elem_Cons = new String[] {""} ;
      H007J9_A88Kard_Bod_Cod = new String[] {""} ;
      H007J9_A87Kard_Alm_Cod = new String[] {""} ;
      H007J9_A578Kard_Cent_Cod = new String[] {""} ;
      H007J9_A577Kard_Regi_Cod = new short[1] ;
      H007J9_A579Mov_Tpmp_Codigo = new String[] {""} ;
      H007J9_A90Mov_Trans = new long[1] ;
      H007J9_A582Mov_Entrada_Cant = new int[1] ;
      H007J9_n582Mov_Entrada_Cant = new boolean[] {false} ;
      H007J9_A583Mov_Entrada_Valor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H007J9_n583Mov_Entrada_Valor = new boolean[] {false} ;
      H007J9_A584Mov_Salida_Cant = new int[1] ;
      H007J9_n584Mov_Salida_Cant = new boolean[] {false} ;
      H007J9_A585Mov_Salida_Valor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H007J9_n585Mov_Salida_Valor = new boolean[] {false} ;
      H007J10_A85Kard_Regi_Id = new long[1] ;
      H007J10_A86Kard_Cent_Id = new long[1] ;
      H007J10_A580Mov_Fecha = new java.util.Date[] {GXutil.nullDate()} ;
      H007J10_A89Kard_Elem_Cons = new String[] {""} ;
      H007J10_A88Kard_Bod_Cod = new String[] {""} ;
      H007J10_A87Kard_Alm_Cod = new String[] {""} ;
      H007J10_A578Kard_Cent_Cod = new String[] {""} ;
      H007J10_A577Kard_Regi_Cod = new short[1] ;
      H007J10_A579Mov_Tpmp_Codigo = new String[] {""} ;
      H007J10_A90Mov_Trans = new long[1] ;
      H007J10_A582Mov_Entrada_Cant = new int[1] ;
      H007J10_n582Mov_Entrada_Cant = new boolean[] {false} ;
      H007J10_A583Mov_Entrada_Valor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H007J10_n583Mov_Entrada_Valor = new boolean[] {false} ;
      H007J10_A584Mov_Salida_Cant = new int[1] ;
      H007J10_n584Mov_Salida_Cant = new boolean[] {false} ;
      H007J10_A585Mov_Salida_Valor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H007J10_n585Mov_Salida_Valor = new boolean[] {false} ;
      H007J11_A85Kard_Regi_Id = new long[1] ;
      H007J11_A86Kard_Cent_Id = new long[1] ;
      H007J11_A89Kard_Elem_Cons = new String[] {""} ;
      H007J11_A88Kard_Bod_Cod = new String[] {""} ;
      H007J11_A87Kard_Alm_Cod = new String[] {""} ;
      H007J11_A578Kard_Cent_Cod = new String[] {""} ;
      H007J11_A577Kard_Regi_Cod = new short[1] ;
      H007J11_A579Mov_Tpmp_Codigo = new String[] {""} ;
      H007J11_A90Mov_Trans = new long[1] ;
      H007J11_A580Mov_Fecha = new java.util.Date[] {GXutil.nullDate()} ;
      H007J11_A582Mov_Entrada_Cant = new int[1] ;
      H007J11_n582Mov_Entrada_Cant = new boolean[] {false} ;
      H007J11_A583Mov_Entrada_Valor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H007J11_n583Mov_Entrada_Valor = new boolean[] {false} ;
      H007J11_A584Mov_Salida_Cant = new int[1] ;
      H007J11_n584Mov_Salida_Cant = new boolean[] {false} ;
      H007J11_A585Mov_Salida_Valor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H007J11_n585Mov_Salida_Valor = new boolean[] {false} ;
      H007J12_A85Kard_Regi_Id = new long[1] ;
      H007J12_A86Kard_Cent_Id = new long[1] ;
      H007J12_A580Mov_Fecha = new java.util.Date[] {GXutil.nullDate()} ;
      H007J12_A89Kard_Elem_Cons = new String[] {""} ;
      H007J12_A88Kard_Bod_Cod = new String[] {""} ;
      H007J12_A87Kard_Alm_Cod = new String[] {""} ;
      H007J12_A578Kard_Cent_Cod = new String[] {""} ;
      H007J12_A577Kard_Regi_Cod = new short[1] ;
      H007J12_A579Mov_Tpmp_Codigo = new String[] {""} ;
      H007J12_A90Mov_Trans = new long[1] ;
      H007J12_A582Mov_Entrada_Cant = new int[1] ;
      H007J12_n582Mov_Entrada_Cant = new boolean[] {false} ;
      H007J12_A583Mov_Entrada_Valor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H007J12_n583Mov_Entrada_Valor = new boolean[] {false} ;
      H007J12_A584Mov_Salida_Cant = new int[1] ;
      H007J12_n584Mov_Salida_Cant = new boolean[] {false} ;
      H007J12_A585Mov_Salida_Valor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H007J12_n585Mov_Salida_Valor = new boolean[] {false} ;
      H007J13_A85Kard_Regi_Id = new long[1] ;
      H007J13_A86Kard_Cent_Id = new long[1] ;
      H007J13_A580Mov_Fecha = new java.util.Date[] {GXutil.nullDate()} ;
      H007J13_A89Kard_Elem_Cons = new String[] {""} ;
      H007J13_A88Kard_Bod_Cod = new String[] {""} ;
      H007J13_A87Kard_Alm_Cod = new String[] {""} ;
      H007J13_A578Kard_Cent_Cod = new String[] {""} ;
      H007J13_A577Kard_Regi_Cod = new short[1] ;
      H007J13_A579Mov_Tpmp_Codigo = new String[] {""} ;
      H007J13_A90Mov_Trans = new long[1] ;
      H007J13_A582Mov_Entrada_Cant = new int[1] ;
      H007J13_n582Mov_Entrada_Cant = new boolean[] {false} ;
      H007J13_A583Mov_Entrada_Valor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H007J13_n583Mov_Entrada_Valor = new boolean[] {false} ;
      H007J13_A584Mov_Salida_Cant = new int[1] ;
      H007J13_n584Mov_Salida_Cant = new boolean[] {false} ;
      H007J13_A585Mov_Salida_Valor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H007J13_n585Mov_Salida_Valor = new boolean[] {false} ;
      H007J14_A37Cata_Codigo = new String[] {""} ;
      H007J14_A33Tipo_Codigo = new long[1] ;
      H007J14_A66Elem_Consecutivo = new String[] {""} ;
      H007J14_A298Cata_Descripcion = new String[] {""} ;
      A37Cata_Codigo = "" ;
      H007J15_A46Tran_Id = new long[1] ;
      H007J15_A513Tran_ConsecutivoCC = new long[1] ;
      H007J15_n513Tran_ConsecutivoCC = new boolean[] {false} ;
      H007J15_A390Tran_FechaRatificacion = new java.util.Date[] {GXutil.nullDate()} ;
      H007J15_n390Tran_FechaRatificacion = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.consulta_kardex__default(),
         new Object[] {
             new Object[] {
            H007J2_A33Tipo_Codigo, H007J2_A253Tipo_Descripcion
            }
            , new Object[] {
            H007J3_A66Elem_Consecutivo, H007J3_A557Elem_Descripcion
            }
            , new Object[] {
            H007J4_A2Regi_Id, H007J4_A12Regi_Cod, H007J4_A13Regi_Descripcion
            }
            , new Object[] {
            H007J5_A1Cent_Id, H007J5_A3Cent_Codigo, H007J5_A4Cent_Descripcion
            }
            , new Object[] {
            H007J6_A1Cent_Id, H007J6_A27Alma_Modulo, H007J6_A28Alma_Codigo, H007J6_A252Alma_Descripcion
            }
            , new Object[] {
            H007J7_A31Bode_Codigo, H007J7_A251Bode_Descripcion
            }
            , new Object[] {
            H007J8_A85Kard_Regi_Id, H007J8_A86Kard_Cent_Id, H007J8_A89Kard_Elem_Cons, H007J8_A88Kard_Bod_Cod, H007J8_A87Kard_Alm_Cod, H007J8_A578Kard_Cent_Cod, H007J8_A577Kard_Regi_Cod, H007J8_A579Mov_Tpmp_Codigo, H007J8_A90Mov_Trans, H007J8_A580Mov_Fecha,
            H007J8_A582Mov_Entrada_Cant, H007J8_n582Mov_Entrada_Cant, H007J8_A583Mov_Entrada_Valor, H007J8_n583Mov_Entrada_Valor, H007J8_A584Mov_Salida_Cant, H007J8_n584Mov_Salida_Cant, H007J8_A585Mov_Salida_Valor, H007J8_n585Mov_Salida_Valor
            }
            , new Object[] {
            H007J9_A85Kard_Regi_Id, H007J9_A86Kard_Cent_Id, H007J9_A580Mov_Fecha, H007J9_A89Kard_Elem_Cons, H007J9_A88Kard_Bod_Cod, H007J9_A87Kard_Alm_Cod, H007J9_A578Kard_Cent_Cod, H007J9_A577Kard_Regi_Cod, H007J9_A579Mov_Tpmp_Codigo, H007J9_A90Mov_Trans,
            H007J9_A582Mov_Entrada_Cant, H007J9_n582Mov_Entrada_Cant, H007J9_A583Mov_Entrada_Valor, H007J9_n583Mov_Entrada_Valor, H007J9_A584Mov_Salida_Cant, H007J9_n584Mov_Salida_Cant, H007J9_A585Mov_Salida_Valor, H007J9_n585Mov_Salida_Valor
            }
            , new Object[] {
            H007J10_A85Kard_Regi_Id, H007J10_A86Kard_Cent_Id, H007J10_A580Mov_Fecha, H007J10_A89Kard_Elem_Cons, H007J10_A88Kard_Bod_Cod, H007J10_A87Kard_Alm_Cod, H007J10_A578Kard_Cent_Cod, H007J10_A577Kard_Regi_Cod, H007J10_A579Mov_Tpmp_Codigo, H007J10_A90Mov_Trans,
            H007J10_A582Mov_Entrada_Cant, H007J10_n582Mov_Entrada_Cant, H007J10_A583Mov_Entrada_Valor, H007J10_n583Mov_Entrada_Valor, H007J10_A584Mov_Salida_Cant, H007J10_n584Mov_Salida_Cant, H007J10_A585Mov_Salida_Valor, H007J10_n585Mov_Salida_Valor
            }
            , new Object[] {
            H007J11_A85Kard_Regi_Id, H007J11_A86Kard_Cent_Id, H007J11_A89Kard_Elem_Cons, H007J11_A88Kard_Bod_Cod, H007J11_A87Kard_Alm_Cod, H007J11_A578Kard_Cent_Cod, H007J11_A577Kard_Regi_Cod, H007J11_A579Mov_Tpmp_Codigo, H007J11_A90Mov_Trans, H007J11_A580Mov_Fecha,
            H007J11_A582Mov_Entrada_Cant, H007J11_n582Mov_Entrada_Cant, H007J11_A583Mov_Entrada_Valor, H007J11_n583Mov_Entrada_Valor, H007J11_A584Mov_Salida_Cant, H007J11_n584Mov_Salida_Cant, H007J11_A585Mov_Salida_Valor, H007J11_n585Mov_Salida_Valor
            }
            , new Object[] {
            H007J12_A85Kard_Regi_Id, H007J12_A86Kard_Cent_Id, H007J12_A580Mov_Fecha, H007J12_A89Kard_Elem_Cons, H007J12_A88Kard_Bod_Cod, H007J12_A87Kard_Alm_Cod, H007J12_A578Kard_Cent_Cod, H007J12_A577Kard_Regi_Cod, H007J12_A579Mov_Tpmp_Codigo, H007J12_A90Mov_Trans,
            H007J12_A582Mov_Entrada_Cant, H007J12_n582Mov_Entrada_Cant, H007J12_A583Mov_Entrada_Valor, H007J12_n583Mov_Entrada_Valor, H007J12_A584Mov_Salida_Cant, H007J12_n584Mov_Salida_Cant, H007J12_A585Mov_Salida_Valor, H007J12_n585Mov_Salida_Valor
            }
            , new Object[] {
            H007J13_A85Kard_Regi_Id, H007J13_A86Kard_Cent_Id, H007J13_A580Mov_Fecha, H007J13_A89Kard_Elem_Cons, H007J13_A88Kard_Bod_Cod, H007J13_A87Kard_Alm_Cod, H007J13_A578Kard_Cent_Cod, H007J13_A577Kard_Regi_Cod, H007J13_A579Mov_Tpmp_Codigo, H007J13_A90Mov_Trans,
            H007J13_A582Mov_Entrada_Cant, H007J13_n582Mov_Entrada_Cant, H007J13_A583Mov_Entrada_Valor, H007J13_n583Mov_Entrada_Valor, H007J13_A584Mov_Salida_Cant, H007J13_n584Mov_Salida_Cant, H007J13_A585Mov_Salida_Valor, H007J13_n585Mov_Salida_Valor
            }
            , new Object[] {
            H007J14_A37Cata_Codigo, H007J14_A33Tipo_Codigo, H007J14_A66Elem_Consecutivo, H007J14_A298Cata_Descripcion
            }
            , new Object[] {
            H007J15_A46Tran_Id, H007J15_A513Tran_ConsecutivoCC, H007J15_n513Tran_ConsecutivoCC, H007J15_A390Tran_FechaRatificacion, H007J15_n390Tran_FechaRatificacion
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavTipo_descripcion_Enabled = 0 ;
      edtavElem_descripcion_Enabled = 0 ;
      edtavRegi_descripcion_Enabled = 0 ;
      edtavCent_descripcion_Enabled = 0 ;
      edtavAlma_descripcion_Enabled = 0 ;
      edtavBode_descripcion_Enabled = 0 ;
      edtavMov_trans_Enabled = 0 ;
      edtavTran_fecharatificacion_Enabled = 0 ;
      imgImage1_Link = "javascript:"+"gx.popup.openPrompt('"+"com.orions2.sel_reg"+"',["+"{Ctrl:gx.dom.el('"+"vREGI_COD"+"'), id:'"+"vREGI_COD"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"vREGI_DESCRIPCION"+"'), id:'"+"vREGI_DESCRIPCION"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      imgImage2_Link = "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gxselectcentrocosto"+"',["+"{Ctrl:gx.dom.el('"+"vCENT_ID"+"'), id:'"+"vCENT_ID"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"vCENT_DESCRIPCION"+"'), id:'"+"vCENT_DESCRIPCION"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"vREGI_CODIGO"+"'), id:'"+"vREGI_CODIGO"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"vCENT_CODIGO"+"'), id:'"+"vCENT_CODIGO"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"vREGI_ABREV"+"'), id:'"+"vREGI_ABREV"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      imgImage3_Link = "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gxselectalmacen"+"',["+"{Ctrl:gx.dom.el('"+"vCENT_ID"+"'), id:'"+"vCENT_ID"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"vALMA_MODULO"+"'), id:'"+"vALMA_MODULO"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"vALMA_CODIGO"+"'), id:'"+"vALMA_CODIGO"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      imgImage4_Link = "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gxselectbodega"+"',["+"{Ctrl:gx.dom.el('"+"vBODE_CODIGO"+"'), id:'"+"vBODE_CODIGO"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      imgImage7_Link = "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gxselecttipoelemento"+"',["+"{Ctrl:gx.dom.el('"+"vTIPO_CODIGO"+"'), id:'"+"vTIPO_CODIGO"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"vTIPO_DESCRIPCION"+"'), id:'"+"vTIPO_DESCRIPCION"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
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
   private byte AV66GXLvl25 ;
   private byte AV67GXLvl34 ;
   private byte AV68GXLvl43 ;
   private byte AV69GXLvl53 ;
   private byte AV70GXLvl64 ;
   private byte AV71GXLvl74 ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private short nRcdExists_8 ;
   private short nIsMod_8 ;
   private short nRcdExists_7 ;
   private short nIsMod_7 ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short nRC_GXsfl_76 ;
   private short nGXsfl_76_idx=1 ;
   private short AV46Regi_cod ;
   private short A577Kard_Regi_Cod ;
   private short A12Regi_Cod ;
   private short wbEnd ;
   private short wbStart ;
   private short AV33kard_Regi_Cod ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid1_Rows ;
   private int A582Mov_Entrada_Cant ;
   private int A584Mov_Salida_Cant ;
   private int edtavTipo_codigo_Enabled ;
   private int edtavTipo_descripcion_Enabled ;
   private int edtavKard_elem_Enabled ;
   private int edtavElem_descripcion_Enabled ;
   private int edtavRegi_cod_Enabled ;
   private int edtavRegi_descripcion_Enabled ;
   private int edtavCent_codigo_Enabled ;
   private int edtavCent_descripcion_Enabled ;
   private int edtavAlma_codigo_Enabled ;
   private int edtavAlma_descripcion_Enabled ;
   private int edtavBode_codigo_Enabled ;
   private int edtavBode_descripcion_Enabled ;
   private int edtavFechainicial_Enabled ;
   private int edtavFechafinal_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavMov_trans_Enabled ;
   private int edtavTran_fecharatificacion_Enabled ;
   private int AV38Mov_Entrada_Cant ;
   private int AV41Mov_Salida_Cant ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GRID1_nGridOutOfScope ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long AV53Tipo_codigo ;
   private long AV55tipo_elemento ;
   private long A33Tipo_Codigo ;
   private long A90Mov_Trans ;
   private long AV57Tran_ConsecutivoCC ;
   private long A46Tran_Id ;
   private long AV44Mov_Trans ;
   private long A513Tran_ConsecutivoCC ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private long A85Kard_Regi_Id ;
   private long A86Kard_Cent_Id ;
   private java.math.BigDecimal A583Mov_Entrada_Valor ;
   private java.math.BigDecimal A585Mov_Salida_Valor ;
   private java.math.BigDecimal AV39Mov_Entrada_Valor ;
   private java.math.BigDecimal AV42Mov_Salida_Valor ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_76_idx="0001" ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String divTitlecontainer_Internalname ;
   private String lblTitle_Internalname ;
   private String lblTitle_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divTable17_Internalname ;
   private String sImgUrl ;
   private String imgImage7_Internalname ;
   private String imgImage7_Link ;
   private String edtavTipo_codigo_Internalname ;
   private String TempTags ;
   private String edtavTipo_codigo_Jsonclick ;
   private String edtavTipo_descripcion_Internalname ;
   private String edtavTipo_descripcion_Jsonclick ;
   private String imgImage6_Internalname ;
   private String imgImage6_Jsonclick ;
   private String edtavKard_elem_Internalname ;
   private String edtavKard_elem_Jsonclick ;
   private String edtavElem_descripcion_Internalname ;
   private String imgImage1_Internalname ;
   private String imgImage1_Link ;
   private String edtavRegi_cod_Internalname ;
   private String edtavRegi_cod_Jsonclick ;
   private String edtavRegi_descripcion_Internalname ;
   private String edtavRegi_descripcion_Jsonclick ;
   private String imgImage2_Internalname ;
   private String imgImage2_Link ;
   private String edtavCent_codigo_Internalname ;
   private String edtavCent_codigo_Jsonclick ;
   private String edtavCent_descripcion_Internalname ;
   private String edtavCent_descripcion_Jsonclick ;
   private String imgImage3_Internalname ;
   private String imgImage3_Link ;
   private String edtavAlma_codigo_Internalname ;
   private String edtavAlma_codigo_Jsonclick ;
   private String edtavAlma_descripcion_Internalname ;
   private String edtavAlma_descripcion_Jsonclick ;
   private String imgImage4_Internalname ;
   private String imgImage4_Link ;
   private String edtavBode_codigo_Internalname ;
   private String edtavBode_codigo_Jsonclick ;
   private String edtavBode_descripcion_Internalname ;
   private String edtavBode_descripcion_Jsonclick ;
   private String edtavFechainicial_Internalname ;
   private String edtavFechainicial_Jsonclick ;
   private String edtavFechafinal_Internalname ;
   private String edtavFechafinal_Jsonclick ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavKard_regi_cod_Internalname ;
   private String edtavKard_cent_cod_Internalname ;
   private String edtavTipo_elemento_Internalname ;
   private String edtavKard_elem_cons_Internalname ;
   private String edtavCata_descripcion_Internalname ;
   private String edtavKard_alm_cod_Internalname ;
   private String edtavKard_bod_cod_Internalname ;
   private String edtavMov_tpmp_codigo_Internalname ;
   private String edtavMov_trans_Internalname ;
   private String edtavTran_consecutivocc_Internalname ;
   private String edtavTran_fecharatificacion_Internalname ;
   private String edtavMov_fecha_Internalname ;
   private String edtavMov_entrada_cant_Internalname ;
   private String edtavMov_entrada_valor_Internalname ;
   private String edtavMov_salida_cant_Internalname ;
   private String edtavMov_salida_valor_Internalname ;
   private String scmdbuf ;
   private String sGXsfl_76_fel_idx="0001" ;
   private String ROClassString ;
   private String edtavKard_regi_cod_Jsonclick ;
   private String edtavKard_cent_cod_Jsonclick ;
   private String edtavTipo_elemento_Jsonclick ;
   private String edtavKard_elem_cons_Jsonclick ;
   private String edtavCata_descripcion_Jsonclick ;
   private String edtavKard_alm_cod_Jsonclick ;
   private String edtavKard_bod_cod_Jsonclick ;
   private String edtavMov_tpmp_codigo_Jsonclick ;
   private String edtavMov_trans_Jsonclick ;
   private String edtavTran_consecutivocc_Jsonclick ;
   private String edtavTran_fecharatificacion_Jsonclick ;
   private String edtavMov_fecha_Jsonclick ;
   private String edtavMov_entrada_cant_Jsonclick ;
   private String edtavMov_entrada_valor_Jsonclick ;
   private String edtavMov_salida_cant_Jsonclick ;
   private String edtavMov_salida_valor_Jsonclick ;
   private java.util.Date AV58Tran_FechaRatificacion ;
   private java.util.Date A390Tran_FechaRatificacion ;
   private java.util.Date AV23FechaInicial ;
   private java.util.Date A580Mov_Fecha ;
   private java.util.Date AV22FechaFinal ;
   private java.util.Date AV40Mov_Fecha ;
   private boolean entryPointCalled ;
   private boolean n582Mov_Entrada_Cant ;
   private boolean n583Mov_Entrada_Valor ;
   private boolean n584Mov_Salida_Cant ;
   private boolean n585Mov_Salida_Valor ;
   private boolean n513Tran_ConsecutivoCC ;
   private boolean n390Tran_FechaRatificacion ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_76_Refreshing=false ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV30kard_Elem ;
   private String AV13Cata_Descripcion ;
   private String A66Elem_Consecutivo ;
   private String A298Cata_Descripcion ;
   private String A578Kard_Cent_Cod ;
   private String AV14Cent_Codigo ;
   private String A87Kard_Alm_Cod ;
   private String AV6Alma_Codigo ;
   private String A88Kard_Bod_Cod ;
   private String AV8Bode_Codigo ;
   private String A89Kard_Elem_Cons ;
   private String A579Mov_Tpmp_Codigo ;
   private String A253Tipo_Descripcion ;
   private String A557Elem_Descripcion ;
   private String A13Regi_Descripcion ;
   private String A3Cent_Codigo ;
   private String A4Cent_Descripcion ;
   private String A28Alma_Codigo ;
   private String A252Alma_Descripcion ;
   private String A31Bode_Codigo ;
   private String A251Bode_Descripcion ;
   private String AV54Tipo_Descripcion ;
   private String AV18Elem_Descripcion ;
   private String AV48Regi_Descripcion ;
   private String AV15Cent_Descripcion ;
   private String AV7Alma_Descripcion ;
   private String AV9Bode_Descripcion ;
   private String AV29Kard_Cent_Cod ;
   private String AV31Kard_Elem_Cons ;
   private String AV27Kard_Alm_Cod ;
   private String AV28Kard_Bod_Cod ;
   private String AV43Mov_Tpmp_Codigo ;
   private String A37Cata_Codigo ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private long[] H007J2_A33Tipo_Codigo ;
   private String[] H007J2_A253Tipo_Descripcion ;
   private String[] H007J3_A66Elem_Consecutivo ;
   private String[] H007J3_A557Elem_Descripcion ;
   private long[] H007J4_A2Regi_Id ;
   private short[] H007J4_A12Regi_Cod ;
   private String[] H007J4_A13Regi_Descripcion ;
   private long[] H007J5_A1Cent_Id ;
   private String[] H007J5_A3Cent_Codigo ;
   private String[] H007J5_A4Cent_Descripcion ;
   private long[] H007J6_A1Cent_Id ;
   private String[] H007J6_A27Alma_Modulo ;
   private String[] H007J6_A28Alma_Codigo ;
   private String[] H007J6_A252Alma_Descripcion ;
   private String[] H007J7_A31Bode_Codigo ;
   private String[] H007J7_A251Bode_Descripcion ;
   private long[] H007J8_A85Kard_Regi_Id ;
   private long[] H007J8_A86Kard_Cent_Id ;
   private String[] H007J8_A89Kard_Elem_Cons ;
   private String[] H007J8_A88Kard_Bod_Cod ;
   private String[] H007J8_A87Kard_Alm_Cod ;
   private String[] H007J8_A578Kard_Cent_Cod ;
   private short[] H007J8_A577Kard_Regi_Cod ;
   private String[] H007J8_A579Mov_Tpmp_Codigo ;
   private long[] H007J8_A90Mov_Trans ;
   private java.util.Date[] H007J8_A580Mov_Fecha ;
   private int[] H007J8_A582Mov_Entrada_Cant ;
   private boolean[] H007J8_n582Mov_Entrada_Cant ;
   private java.math.BigDecimal[] H007J8_A583Mov_Entrada_Valor ;
   private boolean[] H007J8_n583Mov_Entrada_Valor ;
   private int[] H007J8_A584Mov_Salida_Cant ;
   private boolean[] H007J8_n584Mov_Salida_Cant ;
   private java.math.BigDecimal[] H007J8_A585Mov_Salida_Valor ;
   private boolean[] H007J8_n585Mov_Salida_Valor ;
   private long[] H007J9_A85Kard_Regi_Id ;
   private long[] H007J9_A86Kard_Cent_Id ;
   private java.util.Date[] H007J9_A580Mov_Fecha ;
   private String[] H007J9_A89Kard_Elem_Cons ;
   private String[] H007J9_A88Kard_Bod_Cod ;
   private String[] H007J9_A87Kard_Alm_Cod ;
   private String[] H007J9_A578Kard_Cent_Cod ;
   private short[] H007J9_A577Kard_Regi_Cod ;
   private String[] H007J9_A579Mov_Tpmp_Codigo ;
   private long[] H007J9_A90Mov_Trans ;
   private int[] H007J9_A582Mov_Entrada_Cant ;
   private boolean[] H007J9_n582Mov_Entrada_Cant ;
   private java.math.BigDecimal[] H007J9_A583Mov_Entrada_Valor ;
   private boolean[] H007J9_n583Mov_Entrada_Valor ;
   private int[] H007J9_A584Mov_Salida_Cant ;
   private boolean[] H007J9_n584Mov_Salida_Cant ;
   private java.math.BigDecimal[] H007J9_A585Mov_Salida_Valor ;
   private boolean[] H007J9_n585Mov_Salida_Valor ;
   private long[] H007J10_A85Kard_Regi_Id ;
   private long[] H007J10_A86Kard_Cent_Id ;
   private java.util.Date[] H007J10_A580Mov_Fecha ;
   private String[] H007J10_A89Kard_Elem_Cons ;
   private String[] H007J10_A88Kard_Bod_Cod ;
   private String[] H007J10_A87Kard_Alm_Cod ;
   private String[] H007J10_A578Kard_Cent_Cod ;
   private short[] H007J10_A577Kard_Regi_Cod ;
   private String[] H007J10_A579Mov_Tpmp_Codigo ;
   private long[] H007J10_A90Mov_Trans ;
   private int[] H007J10_A582Mov_Entrada_Cant ;
   private boolean[] H007J10_n582Mov_Entrada_Cant ;
   private java.math.BigDecimal[] H007J10_A583Mov_Entrada_Valor ;
   private boolean[] H007J10_n583Mov_Entrada_Valor ;
   private int[] H007J10_A584Mov_Salida_Cant ;
   private boolean[] H007J10_n584Mov_Salida_Cant ;
   private java.math.BigDecimal[] H007J10_A585Mov_Salida_Valor ;
   private boolean[] H007J10_n585Mov_Salida_Valor ;
   private long[] H007J11_A85Kard_Regi_Id ;
   private long[] H007J11_A86Kard_Cent_Id ;
   private String[] H007J11_A89Kard_Elem_Cons ;
   private String[] H007J11_A88Kard_Bod_Cod ;
   private String[] H007J11_A87Kard_Alm_Cod ;
   private String[] H007J11_A578Kard_Cent_Cod ;
   private short[] H007J11_A577Kard_Regi_Cod ;
   private String[] H007J11_A579Mov_Tpmp_Codigo ;
   private long[] H007J11_A90Mov_Trans ;
   private java.util.Date[] H007J11_A580Mov_Fecha ;
   private int[] H007J11_A582Mov_Entrada_Cant ;
   private boolean[] H007J11_n582Mov_Entrada_Cant ;
   private java.math.BigDecimal[] H007J11_A583Mov_Entrada_Valor ;
   private boolean[] H007J11_n583Mov_Entrada_Valor ;
   private int[] H007J11_A584Mov_Salida_Cant ;
   private boolean[] H007J11_n584Mov_Salida_Cant ;
   private java.math.BigDecimal[] H007J11_A585Mov_Salida_Valor ;
   private boolean[] H007J11_n585Mov_Salida_Valor ;
   private long[] H007J12_A85Kard_Regi_Id ;
   private long[] H007J12_A86Kard_Cent_Id ;
   private java.util.Date[] H007J12_A580Mov_Fecha ;
   private String[] H007J12_A89Kard_Elem_Cons ;
   private String[] H007J12_A88Kard_Bod_Cod ;
   private String[] H007J12_A87Kard_Alm_Cod ;
   private String[] H007J12_A578Kard_Cent_Cod ;
   private short[] H007J12_A577Kard_Regi_Cod ;
   private String[] H007J12_A579Mov_Tpmp_Codigo ;
   private long[] H007J12_A90Mov_Trans ;
   private int[] H007J12_A582Mov_Entrada_Cant ;
   private boolean[] H007J12_n582Mov_Entrada_Cant ;
   private java.math.BigDecimal[] H007J12_A583Mov_Entrada_Valor ;
   private boolean[] H007J12_n583Mov_Entrada_Valor ;
   private int[] H007J12_A584Mov_Salida_Cant ;
   private boolean[] H007J12_n584Mov_Salida_Cant ;
   private java.math.BigDecimal[] H007J12_A585Mov_Salida_Valor ;
   private boolean[] H007J12_n585Mov_Salida_Valor ;
   private long[] H007J13_A85Kard_Regi_Id ;
   private long[] H007J13_A86Kard_Cent_Id ;
   private java.util.Date[] H007J13_A580Mov_Fecha ;
   private String[] H007J13_A89Kard_Elem_Cons ;
   private String[] H007J13_A88Kard_Bod_Cod ;
   private String[] H007J13_A87Kard_Alm_Cod ;
   private String[] H007J13_A578Kard_Cent_Cod ;
   private short[] H007J13_A577Kard_Regi_Cod ;
   private String[] H007J13_A579Mov_Tpmp_Codigo ;
   private long[] H007J13_A90Mov_Trans ;
   private int[] H007J13_A582Mov_Entrada_Cant ;
   private boolean[] H007J13_n582Mov_Entrada_Cant ;
   private java.math.BigDecimal[] H007J13_A583Mov_Entrada_Valor ;
   private boolean[] H007J13_n583Mov_Entrada_Valor ;
   private int[] H007J13_A584Mov_Salida_Cant ;
   private boolean[] H007J13_n584Mov_Salida_Cant ;
   private java.math.BigDecimal[] H007J13_A585Mov_Salida_Valor ;
   private boolean[] H007J13_n585Mov_Salida_Valor ;
   private String[] H007J14_A37Cata_Codigo ;
   private long[] H007J14_A33Tipo_Codigo ;
   private String[] H007J14_A66Elem_Consecutivo ;
   private String[] H007J14_A298Cata_Descripcion ;
   private long[] H007J15_A46Tran_Id ;
   private long[] H007J15_A513Tran_ConsecutivoCC ;
   private boolean[] H007J15_n513Tran_ConsecutivoCC ;
   private java.util.Date[] H007J15_A390Tran_FechaRatificacion ;
   private boolean[] H007J15_n390Tran_FechaRatificacion ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class consulta_kardex__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H007J2", "SELECT Tipo_Codigo, Tipo_Descripcion FROM ALM_TIPO_ELEMENTO WHERE Tipo_Codigo = ? ORDER BY Tipo_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H007J3", "SELECT Elem_Consecutivo, Elem_Descripcion FROM ALM_ELEMENTO WHERE Elem_Consecutivo = ? ORDER BY Elem_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H007J4", "SELECT Regi_Id, Regi_Cod, Regi_Descripcion FROM GEN_REGIONAL WHERE Regi_Cod = ? ORDER BY Regi_Cod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H007J5", "SELECT Cent_Id, Cent_Codigo, Cent_Descripcion FROM GEN_CENTROCOSTO WHERE Cent_Codigo = ? ORDER BY Cent_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H007J6", "SELECT Cent_Id, Alma_Modulo, Alma_Codigo, Alma_Descripcion FROM ALM_ALMACEN WHERE Alma_Codigo = ? ORDER BY Cent_Id, Alma_Modulo, Alma_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H007J7", "SELECT Bode_Codigo, Bode_Descripcion FROM ALM_BODEGA WHERE Bode_Codigo = ? ORDER BY Bode_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H007J8", "SELECT T1.Kard_Regi_Id, T1.Kard_Cent_Id, T1.Kard_Elem_Cons, T1.Kard_Bod_Cod, T1.Kard_Alm_Cod, T2.Kard_Cent_Cod, T2.Kard_Regi_Cod, T1.Mov_Tpmp_Codigo, T1.Mov_Trans, T1.Mov_Fecha, T1.Mov_Entrada_Cant, T1.Mov_Entrada_Valor, T1.Mov_Salida_Cant, T1.Mov_Salida_Valor FROM (KARDEX_MOVIMIENTO T1 INNER JOIN ALM_INV_KARDEX T2 ON T2.Kard_Regi_Id = T1.Kard_Regi_Id AND T2.Kard_Cent_Id = T1.Kard_Cent_Id AND T2.Kard_Alm_Cod = T1.Kard_Alm_Cod AND T2.Kard_Bod_Cod = T1.Kard_Bod_Cod AND T2.Kard_Elem_Cons = T1.Kard_Elem_Cons) WHERE (T2.Kard_Regi_Cod >= ?) AND (T2.Kard_Cent_Cod = ? or (rtrim(?) IS NULL)) AND (T1.Kard_Alm_Cod = ? or (rtrim(?) IS NULL)) AND (T1.Kard_Bod_Cod = ? or (rtrim(?) IS NULL)) AND (T1.Kard_Elem_Cons = ?) ORDER BY T1.Kard_Regi_Id, T1.Kard_Cent_Id, T1.Kard_Alm_Cod, T1.Kard_Bod_Cod, T1.Kard_Elem_Cons, T1.Mov_Trans, T1.Mov_Fecha ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H007J9", "SELECT T1.Kard_Regi_Id, T1.Kard_Cent_Id, T1.Mov_Fecha, T1.Kard_Elem_Cons, T1.Kard_Bod_Cod, T1.Kard_Alm_Cod, T2.Kard_Cent_Cod, T2.Kard_Regi_Cod, T1.Mov_Tpmp_Codigo, T1.Mov_Trans, T1.Mov_Entrada_Cant, T1.Mov_Entrada_Valor, T1.Mov_Salida_Cant, T1.Mov_Salida_Valor FROM (KARDEX_MOVIMIENTO T1 INNER JOIN ALM_INV_KARDEX T2 ON T2.Kard_Regi_Id = T1.Kard_Regi_Id AND T2.Kard_Cent_Id = T1.Kard_Cent_Id AND T2.Kard_Alm_Cod = T1.Kard_Alm_Cod AND T2.Kard_Bod_Cod = T1.Kard_Bod_Cod AND T2.Kard_Elem_Cons = T1.Kard_Elem_Cons) WHERE (T2.Kard_Regi_Cod >= ?) AND (T2.Kard_Cent_Cod = ? or (rtrim(?) IS NULL)) AND (T1.Kard_Alm_Cod = ? or (rtrim(?) IS NULL)) AND (T1.Kard_Bod_Cod = ? or (rtrim(?) IS NULL)) AND (T1.Mov_Fecha >= ?) AND (T1.Kard_Elem_Cons = ?) ORDER BY T1.Kard_Regi_Id, T1.Kard_Cent_Id, T1.Kard_Alm_Cod, T1.Kard_Bod_Cod, T1.Kard_Elem_Cons, T1.Mov_Trans, T1.Mov_Fecha ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H007J10", "SELECT T1.Kard_Regi_Id, T1.Kard_Cent_Id, T1.Mov_Fecha, T1.Kard_Elem_Cons, T1.Kard_Bod_Cod, T1.Kard_Alm_Cod, T2.Kard_Cent_Cod, T2.Kard_Regi_Cod, T1.Mov_Tpmp_Codigo, T1.Mov_Trans, T1.Mov_Entrada_Cant, T1.Mov_Entrada_Valor, T1.Mov_Salida_Cant, T1.Mov_Salida_Valor FROM (KARDEX_MOVIMIENTO T1 INNER JOIN ALM_INV_KARDEX T2 ON T2.Kard_Regi_Id = T1.Kard_Regi_Id AND T2.Kard_Cent_Id = T1.Kard_Cent_Id AND T2.Kard_Alm_Cod = T1.Kard_Alm_Cod AND T2.Kard_Bod_Cod = T1.Kard_Bod_Cod AND T2.Kard_Elem_Cons = T1.Kard_Elem_Cons) WHERE (T2.Kard_Regi_Cod >= ?) AND (T2.Kard_Cent_Cod = ? or (rtrim(?) IS NULL)) AND (T1.Kard_Alm_Cod = ? or (rtrim(?) IS NULL)) AND (T1.Kard_Bod_Cod = ? or (rtrim(?) IS NULL)) AND (T1.Mov_Fecha >= ? and T1.Mov_Fecha <= ?) AND (T1.Kard_Elem_Cons = ?) ORDER BY T1.Kard_Regi_Id, T1.Kard_Cent_Id, T1.Kard_Alm_Cod, T1.Kard_Bod_Cod, T1.Kard_Elem_Cons, T1.Mov_Trans, T1.Mov_Fecha ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H007J11", "SELECT T1.Kard_Regi_Id, T1.Kard_Cent_Id, T1.Kard_Elem_Cons, T1.Kard_Bod_Cod, T1.Kard_Alm_Cod, T2.Kard_Cent_Cod, T2.Kard_Regi_Cod, T1.Mov_Tpmp_Codigo, T1.Mov_Trans, T1.Mov_Fecha, T1.Mov_Entrada_Cant, T1.Mov_Entrada_Valor, T1.Mov_Salida_Cant, T1.Mov_Salida_Valor FROM (KARDEX_MOVIMIENTO T1 INNER JOIN ALM_INV_KARDEX T2 ON T2.Kard_Regi_Id = T1.Kard_Regi_Id AND T2.Kard_Cent_Id = T1.Kard_Cent_Id AND T2.Kard_Alm_Cod = T1.Kard_Alm_Cod AND T2.Kard_Bod_Cod = T1.Kard_Bod_Cod AND T2.Kard_Elem_Cons = T1.Kard_Elem_Cons) WHERE (T2.Kard_Cent_Cod = ? or (rtrim(?) IS NULL)) AND (T1.Kard_Alm_Cod = ? or (rtrim(?) IS NULL)) AND (T1.Kard_Bod_Cod = ? or (rtrim(?) IS NULL)) AND (T2.Kard_Regi_Cod = ?) AND (T1.Kard_Elem_Cons = ?) ORDER BY T1.Kard_Regi_Id, T1.Kard_Cent_Id, T1.Kard_Alm_Cod, T1.Kard_Bod_Cod, T1.Kard_Elem_Cons, T1.Mov_Trans, T1.Mov_Fecha ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H007J12", "SELECT T1.Kard_Regi_Id, T1.Kard_Cent_Id, T1.Mov_Fecha, T1.Kard_Elem_Cons, T1.Kard_Bod_Cod, T1.Kard_Alm_Cod, T2.Kard_Cent_Cod, T2.Kard_Regi_Cod, T1.Mov_Tpmp_Codigo, T1.Mov_Trans, T1.Mov_Entrada_Cant, T1.Mov_Entrada_Valor, T1.Mov_Salida_Cant, T1.Mov_Salida_Valor FROM (KARDEX_MOVIMIENTO T1 INNER JOIN ALM_INV_KARDEX T2 ON T2.Kard_Regi_Id = T1.Kard_Regi_Id AND T2.Kard_Cent_Id = T1.Kard_Cent_Id AND T2.Kard_Alm_Cod = T1.Kard_Alm_Cod AND T2.Kard_Bod_Cod = T1.Kard_Bod_Cod AND T2.Kard_Elem_Cons = T1.Kard_Elem_Cons) WHERE (T2.Kard_Cent_Cod = ? or (rtrim(?) IS NULL)) AND (T1.Kard_Alm_Cod = ? or (rtrim(?) IS NULL)) AND (T1.Kard_Bod_Cod = ? or (rtrim(?) IS NULL)) AND (T1.Mov_Fecha >= ?) AND (T2.Kard_Regi_Cod = ?) AND (T1.Kard_Elem_Cons = ?) ORDER BY T1.Kard_Regi_Id, T1.Kard_Cent_Id, T1.Kard_Alm_Cod, T1.Kard_Bod_Cod, T1.Kard_Elem_Cons, T1.Mov_Trans, T1.Mov_Fecha ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H007J13", "SELECT T1.Kard_Regi_Id, T1.Kard_Cent_Id, T1.Mov_Fecha, T1.Kard_Elem_Cons, T1.Kard_Bod_Cod, T1.Kard_Alm_Cod, T2.Kard_Cent_Cod, T2.Kard_Regi_Cod, T1.Mov_Tpmp_Codigo, T1.Mov_Trans, T1.Mov_Entrada_Cant, T1.Mov_Entrada_Valor, T1.Mov_Salida_Cant, T1.Mov_Salida_Valor FROM (KARDEX_MOVIMIENTO T1 INNER JOIN ALM_INV_KARDEX T2 ON T2.Kard_Regi_Id = T1.Kard_Regi_Id AND T2.Kard_Cent_Id = T1.Kard_Cent_Id AND T2.Kard_Alm_Cod = T1.Kard_Alm_Cod AND T2.Kard_Bod_Cod = T1.Kard_Bod_Cod AND T2.Kard_Elem_Cons = T1.Kard_Elem_Cons) WHERE (T2.Kard_Cent_Cod = ? or (rtrim(?) IS NULL)) AND (T1.Kard_Alm_Cod = ? or (rtrim(?) IS NULL)) AND (T1.Kard_Bod_Cod = ? or (rtrim(?) IS NULL)) AND (T1.Mov_Fecha >= ? and T1.Mov_Fecha <= ?) AND (T2.Kard_Regi_Cod = ?) AND (T1.Kard_Elem_Cons = ?) ORDER BY T1.Kard_Regi_Id, T1.Kard_Cent_Id, T1.Kard_Alm_Cod, T1.Kard_Bod_Cod, T1.Kard_Elem_Cons, T1.Mov_Trans, T1.Mov_Fecha ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H007J14", "SELECT T1.Cata_Codigo, T1.Tipo_Codigo, T1.Elem_Consecutivo, T2.Cata_Descripcion FROM (ALM_ELEMENTO T1 INNER JOIN ALM_CATALOGO T2 ON T2.Cata_Codigo = T1.Cata_Codigo) WHERE (T1.Elem_Consecutivo = ?) AND (T1.Tipo_Codigo = ?) ORDER BY T1.Elem_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H007J15", "SELECT Tran_Id, Tran_ConsecutivoCC, Tran_FechaRatificacion FROM ALM_TRANSACCION WHERE Tran_Id = ? ORDER BY Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((long[]) buf[8])[0] = rslt.getLong(9) ;
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10) ;
               ((int[]) buf[10])[0] = rslt.getInt(11) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(13) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(14,2) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((long[]) buf[9])[0] = rslt.getLong(10) ;
               ((int[]) buf[10])[0] = rslt.getInt(11) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(13) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(14,2) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 8 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((long[]) buf[9])[0] = rslt.getLong(10) ;
               ((int[]) buf[10])[0] = rslt.getInt(11) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(13) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(14,2) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((long[]) buf[8])[0] = rslt.getLong(9) ;
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10) ;
               ((int[]) buf[10])[0] = rslt.getInt(11) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(13) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(14,2) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((long[]) buf[9])[0] = rslt.getLong(10) ;
               ((int[]) buf[10])[0] = rslt.getInt(11) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(13) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(14,2) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 11 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((long[]) buf[9])[0] = rslt.getLong(10) ;
               ((int[]) buf[10])[0] = rslt.getInt(11) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(13) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(14,2) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 13 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setVarchar(1, (String)parms[0], 9);
               return;
            case 2 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 16);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 2);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setVarchar(2, (String)parms[1], 16);
               stmt.setVarchar(3, (String)parms[2], 16);
               stmt.setVarchar(4, (String)parms[3], 2);
               stmt.setVarchar(5, (String)parms[4], 2);
               stmt.setVarchar(6, (String)parms[5], 3);
               stmt.setVarchar(7, (String)parms[6], 3);
               stmt.setVarchar(8, (String)parms[7], 9);
               return;
            case 7 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setVarchar(2, (String)parms[1], 16);
               stmt.setVarchar(3, (String)parms[2], 16);
               stmt.setVarchar(4, (String)parms[3], 2);
               stmt.setVarchar(5, (String)parms[4], 2);
               stmt.setVarchar(6, (String)parms[5], 3);
               stmt.setVarchar(7, (String)parms[6], 3);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setVarchar(9, (String)parms[8], 9);
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setVarchar(2, (String)parms[1], 16);
               stmt.setVarchar(3, (String)parms[2], 16);
               stmt.setVarchar(4, (String)parms[3], 2);
               stmt.setVarchar(5, (String)parms[4], 2);
               stmt.setVarchar(6, (String)parms[5], 3);
               stmt.setVarchar(7, (String)parms[6], 3);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setDate(9, (java.util.Date)parms[8]);
               stmt.setVarchar(10, (String)parms[9], 9);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 16);
               stmt.setVarchar(2, (String)parms[1], 16);
               stmt.setVarchar(3, (String)parms[2], 2);
               stmt.setVarchar(4, (String)parms[3], 2);
               stmt.setVarchar(5, (String)parms[4], 3);
               stmt.setVarchar(6, (String)parms[5], 3);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setVarchar(8, (String)parms[7], 9);
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 16);
               stmt.setVarchar(2, (String)parms[1], 16);
               stmt.setVarchar(3, (String)parms[2], 2);
               stmt.setVarchar(4, (String)parms[3], 2);
               stmt.setVarchar(5, (String)parms[4], 3);
               stmt.setVarchar(6, (String)parms[5], 3);
               stmt.setDate(7, (java.util.Date)parms[6]);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setVarchar(9, (String)parms[8], 9);
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 16);
               stmt.setVarchar(2, (String)parms[1], 16);
               stmt.setVarchar(3, (String)parms[2], 2);
               stmt.setVarchar(4, (String)parms[3], 2);
               stmt.setVarchar(5, (String)parms[4], 3);
               stmt.setVarchar(6, (String)parms[5], 3);
               stmt.setDate(7, (java.util.Date)parms[6]);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setVarchar(10, (String)parms[9], 9);
               return;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 9);
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 13 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

