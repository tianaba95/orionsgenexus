/*
               File: wsinactivarusuariomasiva_services_rest
        Description: WSInactivar Usuario Masiva
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:11.90
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

@Path("/WSInactivarUsuarioMasiva")
public final  class wsinactivarusuariomasiva_services_rest extends GxRestService
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
   public Response execute( com.orions2.wsinactivarusuariomasiva_RESTInterfaceIN entity )
   {
      super.init( "POST" , myServletRequest, myServletResponse, myContext);
      ApplicationContext.getInstance().setServletEngineDefaultPath(myContext.getRealPath("/"));
      Response.ResponseBuilder builder = null;
      String [] AV17Usuario = new String[] { "" };
      AV17Usuario[0] = entity.getUsuario() ;
      String [] AV11Estado = new String[] { "" };
      AV11Estado[0] = entity.getEstado() ;
      if ( ! processHeaders("wsinactivarusuariomasiva",myServletRequest,myServletResponse) )
      {
         builder = Response.notModified();
         cleanup();
         return builder.build();
      }
      try
      {
         com.orions2.wsinactivarusuariomasiva worker = new com.orions2.wsinactivarusuariomasiva(remoteHandle, context) ;
         worker.execute(AV17Usuario,AV11Estado );
         com.orions2.wsinactivarusuariomasiva_RESTInterfaceOUT data = new com.orions2.wsinactivarusuariomasiva_RESTInterfaceOUT();
         data.setUsuario(AV17Usuario[0]);
         data.setEstado(AV11Estado[0]);
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

