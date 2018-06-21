/*
               File: wsrecordarusuario_services_rest
        Description: WSRecordar Usuario
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:3.13
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

@Path("/WSRecordarUsuario")
public final  class wsrecordarusuario_services_rest extends GxRestService
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
   public Response execute( com.orions2.wsrecordarusuario_RESTInterfaceIN entity )
   {
      super.init( "POST" , myServletRequest, myServletResponse, myContext);
      ApplicationContext.getInstance().setServletEngineDefaultPath(myContext.getRealPath("/"));
      Response.ResponseBuilder builder = null;
      long [] AV17usua_Cedula = new long[] { 0 };
      AV17usua_Cedula[0] = GXutil.lval( entity.getusua_Cedula()) ;
      String [] AV19Usua_Email = new String[] { "" };
      AV19Usua_Email[0] = entity.getUsua_Email() ;
      String [] AV22Error = new String[] { "" };
      AV22Error[0] = entity.getError() ;
      if ( ! processHeaders("wsrecordarusuario",myServletRequest,myServletResponse) )
      {
         builder = Response.notModified();
         cleanup();
         return builder.build();
      }
      try
      {
         com.orions2.wsrecordarusuario worker = new com.orions2.wsrecordarusuario(remoteHandle, context) ;
         worker.execute(AV17usua_Cedula,AV19Usua_Email,AV22Error );
         com.orions2.wsrecordarusuario_RESTInterfaceOUT data = new com.orions2.wsrecordarusuario_RESTInterfaceOUT();
         data.setusua_Cedula(GXutil.ltrim( GXutil.str( AV17usua_Cedula[0], 18, 0)));
         data.setUsua_Email(AV19Usua_Email[0]);
         data.setError(AV22Error[0]);
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

