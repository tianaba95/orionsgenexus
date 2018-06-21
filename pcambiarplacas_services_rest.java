/*
               File: pcambiarplacas_services_rest
        Description: PCambiar Placas
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:7.6
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

@Path("/PCambiarPlacas")
public final  class pcambiarplacas_services_rest extends GxRestService
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
   public Response execute( com.orions2.pcambiarplacas_RESTInterfaceIN entity )
   {
      super.init( "POST" , myServletRequest, myServletResponse, myContext);
      ApplicationContext.getInstance().setServletEngineDefaultPath(myContext.getRealPath("/"));
      Response.ResponseBuilder builder = null;
      long [] AV11Tran_Id = new long[] { 0 };
      AV11Tran_Id[0] = GXutil.lval( entity.getTran_Id()) ;
      String [] AV9Placa = new String[] { "" };
      AV9Placa[0] = entity.getPlaca() ;
      String [] AV15Observaciones = new String[] { "" };
      AV15Observaciones[0] = entity.getObservaciones() ;
      String [] AV12Accion = new String[] { "" };
      AV12Accion[0] = entity.getAccion() ;
      String [] AV14NuevaPlaca = new String[] { "" };
      AV14NuevaPlaca[0] = entity.getNuevaPlaca() ;
      String [] AV13EsPlacaPadre = new String[] { "" };
      AV13EsPlacaPadre[0] = entity.getEsPlacaPadre() ;
      String [] AV16PlacaPadre = new String[] { "" };
      AV16PlacaPadre[0] = entity.getPlacaPadre() ;
      String [] AV18NuevaEsPlacaPadre = new String[] { "" };
      AV18NuevaEsPlacaPadre[0] = entity.getNuevaEsPlacaPadre() ;
      String [] AV19NuevaPlacaPadre = new String[] { "" };
      AV19NuevaPlacaPadre[0] = entity.getNuevaPlacaPadre() ;
      if ( ! processHeaders("pcambiarplacas",myServletRequest,myServletResponse) )
      {
         builder = Response.notModified();
         cleanup();
         return builder.build();
      }
      try
      {
         com.orions2.pcambiarplacas worker = new com.orions2.pcambiarplacas(remoteHandle, context) ;
         worker.execute(AV11Tran_Id,AV9Placa,AV15Observaciones,AV12Accion,AV14NuevaPlaca,AV13EsPlacaPadre,AV16PlacaPadre,AV18NuevaEsPlacaPadre,AV19NuevaPlacaPadre );
         com.orions2.pcambiarplacas_RESTInterfaceOUT data = new com.orions2.pcambiarplacas_RESTInterfaceOUT();
         data.setTran_Id(GXutil.ltrim( GXutil.str( AV11Tran_Id[0], 11, 0)));
         data.setPlaca(AV9Placa[0]);
         data.setObservaciones(AV15Observaciones[0]);
         data.setAccion(AV12Accion[0]);
         data.setNuevaPlaca(AV14NuevaPlaca[0]);
         data.setEsPlacaPadre(AV13EsPlacaPadre[0]);
         data.setPlacaPadre(AV16PlacaPadre[0]);
         data.setNuevaEsPlacaPadre(AV18NuevaEsPlacaPadre[0]);
         data.setNuevaPlacaPadre(AV19NuevaPlacaPadre[0]);
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

