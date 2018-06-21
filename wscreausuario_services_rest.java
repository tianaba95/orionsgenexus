/*
               File: wscreausuario_services_rest
        Description: WSCrea Usuario
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:56.90
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.*;
import javax.servlet.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;

@Path("/WSCreaUsuario")
public final  class wscreausuario_services_rest extends GxRestService
{
   @Context
   private ServletContext myContext;
   @Context
   private javax.servlet.http.HttpServletRequest myServletRequest;
   @Context
   private javax.servlet.http.HttpServletResponse myServletResponse;
   @POST
   @Consumes({MediaType.APPLICATION_JSON})
   @Produces({MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public Response execute( com.orions2.wscreausuario_RESTInterfaceIN entity )
   {
      super.init( "POST" , myServletRequest, myServletResponse, myContext);
      ApplicationContext.getInstance().setServletEngineDefaultPath(myContext.getRealPath("/"));
      Response.ResponseBuilder builder = null;
      long [] AV18Usua_Id = new long[] { 0 };
      AV18Usua_Id[0] = GXutil.lval( entity.getUsua_Id()) ;
      String [] Gx_mode = new String[] { "" };
      Gx_mode[0] = entity.getGx_mode() ;
      if ( ! processHeaders("wscreausuario",myServletRequest,myServletResponse) )
      {
         builder = Response.notModified();
         cleanup();
         return builder.build();
      }
      try
      {
         com.orions2.wscreausuario worker = new com.orions2.wscreausuario(remoteHandle, context) ;
         worker.execute(AV18Usua_Id,Gx_mode );
         com.orions2.wscreausuario_RESTInterfaceOUT data = new com.orions2.wscreausuario_RESTInterfaceOUT();
         data.setUsua_Id(GXutil.ltrim( GXutil.str( AV18Usua_Id[0], 18, 0)));
         data.setGx_mode(Gx_mode[0]);
         if ( data.setValue )
         {
            builder = Response.ok(data);
         }
         else
         {
            builder = Response.ok("{}");
         }
         cleanup();
         return builder.build() ;
      }
      catch ( Exception e )
      {
         e.printStackTrace();
         cleanup();
         SetError("500", e.getMessage());
         builder = Response.status(500);
         builder.entity(errorJson.toString());
         return builder.build() ;
      }
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

}

