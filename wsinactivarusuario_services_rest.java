/*
               File: wsinactivarusuario_services_rest
        Description: WSInactivar Usuario
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:58.24
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

@Path("/WSInactivarUsuario")
public final  class wsinactivarusuario_services_rest extends GxRestService
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
   public Response execute( com.orions2.wsinactivarusuario_RESTInterfaceIN entity )
   {
      super.init( "POST" , myServletRequest, myServletResponse, myContext);
      ApplicationContext.getInstance().setServletEngineDefaultPath(myContext.getRealPath("/"));
      Response.ResponseBuilder builder = null;
      String [] AV20Usuario = new String[] { "" };
      AV20Usuario[0] = entity.getUsuario() ;
      long [] AV19Usua_Id = new long[] { 0 };
      AV19Usua_Id[0] = GXutil.lval( entity.getUsua_Id()) ;
      byte [] AV21Tipo = new byte[] { 0 };
      AV21Tipo[0] = entity.getTipo() ;
      if ( ! processHeaders("wsinactivarusuario",myServletRequest,myServletResponse) )
      {
         builder = Response.notModified();
         cleanup();
         return builder.build();
      }
      try
      {
         com.orions2.wsinactivarusuario worker = new com.orions2.wsinactivarusuario(remoteHandle, context) ;
         worker.execute(AV20Usuario,AV19Usua_Id,AV21Tipo );
         com.orions2.wsinactivarusuario_RESTInterfaceOUT data = new com.orions2.wsinactivarusuario_RESTInterfaceOUT();
         data.setUsuario(AV20Usuario[0]);
         data.setUsua_Id(GXutil.ltrim( GXutil.str( AV19Usua_Id[0], 18, 0)));
         data.setTipo(AV21Tipo[0]);
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

