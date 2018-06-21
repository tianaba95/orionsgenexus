/*
               File: apdescarc_impl
        Description: Descargar Archivo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:12.96
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

public final  class apdescarc_impl extends GXWebProcedure
{
   public apdescarc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", com.genexus.util.Encryption.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(0)) ;
      }
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      if ( ! entryPointCalled )
      {
         AV17Tipo = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV14NomArch = httpContext.GetNextPar( ) ;
            AV15Path = httpContext.GetNextPar( ) ;
         }
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         AV12HttpResponse.addHeader("Cache-Control", "max-age=0");
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         AV12HttpResponse.addHeader("Content-Type", AV17Tipo);
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         AV12HttpResponse.addHeader("Content-Disposition", "attachment;filename="+AV14NomArch);
      }
      AV12HttpResponse.addFile(AV15Path);
      if ( AV12HttpResponse.getErrCode() > 0 )
      {
         AV10ErrDesc = GXutil.str( AV12HttpResponse.getErrCode(), 10, 2) + " " + AV12HttpResponse.getErrDescription() ;
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
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
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      AV17Tipo = "" ;
      AV14NomArch = "" ;
      AV15Path = "" ;
      AV12HttpResponse = httpContext.getHttpResponse();
      AV10ErrDesc = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short Gx_err ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private boolean entryPointCalled ;
   private String AV17Tipo ;
   private String AV14NomArch ;
   private String AV15Path ;
   private String AV10ErrDesc ;
   private com.genexus.internet.HttpResponse AV12HttpResponse ;
}

