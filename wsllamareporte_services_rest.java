/*
               File: wsllamareporte_services_rest
        Description: WSLlama Reporte
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:15.82
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

@Path("/WSLlamaReporte")
public final  class wsllamareporte_services_rest extends GxRestService
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
   public Response execute( com.orions2.wsllamareporte_RESTInterfaceIN entity )
   {
      super.init( "POST" , myServletRequest, myServletResponse, myContext);
      ApplicationContext.getInstance().setServletEngineDefaultPath(myContext.getRealPath("/"));
      Response.ResponseBuilder builder = null;
      short [] AV47RPT_REP_ID = new short[] { 0 };
      AV47RPT_REP_ID[0] = entity.getRPT_REP_ID() ;
      String [] AV55Codigo_Regional = new String[] { "" };
      AV55Codigo_Regional[0] = entity.getCodigo_Regional() ;
      String [] AV28Cent_Codigo = new String[] { "" };
      AV28Cent_Codigo[0] = entity.getCent_Codigo() ;
      String [] AV34Modulo = new String[] { "" };
      AV34Modulo[0] = entity.getModulo() ;
      String [] AV25Almacen = new String[] { "" };
      AV25Almacen[0] = entity.getAlmacen() ;
      String [] AV26Bodega = new String[] { "" };
      AV26Bodega[0] = entity.getBodega() ;
      String [] AV59CedulaChar = new String[] { "" };
      AV59CedulaChar[0] = entity.getCedulaChar() ;
      java.util.Date [] AV32Fecha_Inicial = new java.util.Date[] { GXutil.nullDate() };
      AV32Fecha_Inicial[0] = GXutil.charToDateREST( entity.getFecha_Inicial()) ;
      java.util.Date [] AV31Fecha_Final = new java.util.Date[] { GXutil.nullDate() };
      AV31Fecha_Final[0] = GXutil.charToDateREST( entity.getFecha_Final()) ;
      String [] AV30Estado_Inicial = new String[] { "" };
      AV30Estado_Inicial[0] = entity.getEstado_Inicial() ;
      String [] AV29Estado_Final = new String[] { "" };
      AV29Estado_Final[0] = entity.getEstado_Final() ;
      String [] AV36Movimiento_Inicial = new String[] { "" };
      AV36Movimiento_Inicial[0] = entity.getMovimiento_Inicial() ;
      String [] AV35Movimiento_Final = new String[] { "" };
      AV35Movimiento_Final[0] = entity.getMovimiento_Final() ;
      long [] AV40Trans_ConsecutivoCC = new long[] { 0 };
      AV40Trans_ConsecutivoCC[0] = GXutil.lval( entity.getTrans_ConsecutivoCC()) ;
      long [] AV41Trans_ConsecutivoCCFin = new long[] { 0 };
      AV41Trans_ConsecutivoCCFin[0] = GXutil.lval( entity.getTrans_ConsecutivoCCFin()) ;
      long [] AV39Tipo_Codigo = new long[] { 0 };
      AV39Tipo_Codigo[0] = GXutil.lval( entity.getTipo_Codigo()) ;
      long [] AV42Proveedor = new long[] { 0 };
      AV42Proveedor[0] = GXutil.lval( entity.getProveedor()) ;
      String [] AV44Area_Codigo = new String[] { "" };
      AV44Area_Codigo[0] = entity.getArea_Codigo() ;
      String [] AV45Curs_Codigo = new String[] { "" };
      AV45Curs_Codigo[0] = entity.getCurs_Codigo() ;
      String [] AV56Placa = new String[] { "" };
      AV56Placa[0] = entity.getPlaca() ;
      String [] AV33Formato = new String[] { "" };
      AV33Formato[0] = entity.getFormato() ;
      GXBaseCollection<com.orions2.SdtSDTSku_SDTSkuItem> [] AV38SDTSKU = new GXBaseCollection[] { new GXBaseCollection<com.orions2.SdtSDTSku_SDTSkuItem>() };
      AV38SDTSKU[0]= SdtSDTSku_SDTSkuItem_RESTInterfacetoGXObjectCollection(entity.getSDTSKU());
      String [] AV19Usuario = new String[] { "" };
      AV19Usuario[0] = entity.getUsuario() ;
      String [] AV64Periodo = new String[] { "" };
      AV64Periodo[0] = entity.getPeriodo() ;
      if ( ! processHeaders("wsllamareporte",myServletRequest,myServletResponse) )
      {
         builder = Response.notModified();
         cleanup();
         return builder.build();
      }
      try
      {
         com.orions2.wsllamareporte worker = new com.orions2.wsllamareporte(remoteHandle, context) ;
         worker.execute(AV47RPT_REP_ID,AV55Codigo_Regional,AV28Cent_Codigo,AV34Modulo,AV25Almacen,AV26Bodega,AV59CedulaChar,AV32Fecha_Inicial,AV31Fecha_Final,AV30Estado_Inicial,AV29Estado_Final,AV36Movimiento_Inicial,AV35Movimiento_Final,AV40Trans_ConsecutivoCC,AV41Trans_ConsecutivoCCFin,AV39Tipo_Codigo,AV42Proveedor,AV44Area_Codigo,AV45Curs_Codigo,AV56Placa,AV33Formato,AV38SDTSKU,AV19Usuario,AV64Periodo );
         com.orions2.wsllamareporte_RESTInterfaceOUT data = new com.orions2.wsllamareporte_RESTInterfaceOUT();
         data.setRPT_REP_ID(AV47RPT_REP_ID[0]);
         data.setCodigo_Regional(AV55Codigo_Regional[0]);
         data.setCent_Codigo(AV28Cent_Codigo[0]);
         data.setModulo(AV34Modulo[0]);
         data.setAlmacen(AV25Almacen[0]);
         data.setBodega(AV26Bodega[0]);
         data.setCedulaChar(AV59CedulaChar[0]);
         data.setFecha_Inicial(GXutil.dateToCharREST( AV32Fecha_Inicial[0]));
         data.setFecha_Final(GXutil.dateToCharREST( AV31Fecha_Final[0]));
         data.setEstado_Inicial(AV30Estado_Inicial[0]);
         data.setEstado_Final(AV29Estado_Final[0]);
         data.setMovimiento_Inicial(AV36Movimiento_Inicial[0]);
         data.setMovimiento_Final(AV35Movimiento_Final[0]);
         data.setTrans_ConsecutivoCC(GXutil.ltrim( GXutil.str( AV40Trans_ConsecutivoCC[0], 18, 0)));
         data.setTrans_ConsecutivoCCFin(GXutil.ltrim( GXutil.str( AV41Trans_ConsecutivoCCFin[0], 18, 0)));
         data.setTipo_Codigo(GXutil.ltrim( GXutil.str( AV39Tipo_Codigo[0], 18, 0)));
         data.setProveedor(GXutil.ltrim( GXutil.str( AV42Proveedor[0], 18, 0)));
         data.setArea_Codigo(AV44Area_Codigo[0]);
         data.setCurs_Codigo(AV45Curs_Codigo[0]);
         data.setPlaca(AV56Placa[0]);
         data.setFormato(AV33Formato[0]);
         data.setSDTSKU(SdtSDTSku_SDTSkuItem_RESTInterfacefromGXObjectCollection(AV38SDTSKU[0]));
         data.setUsuario(AV19Usuario[0]);
         data.setPeriodo(AV64Periodo[0]);
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

   private GXBaseCollection<com.orions2.SdtSDTSku_SDTSkuItem> SdtSDTSku_SDTSkuItem_RESTInterfacetoGXObjectCollection( Vector<com.orions2.SdtSDTSku_SDTSkuItem_RESTInterface> collection )
   {
      GXBaseCollection<com.orions2.SdtSDTSku_SDTSkuItem> result = new GXBaseCollection<com.orions2.SdtSDTSku_SDTSkuItem>(com.orions2.SdtSDTSku_SDTSkuItem.class, "SDTSku.SDTSkuItem", "ACBSENA.SDTSku", remoteHandle);
      for (int i = 0; i < collection.size(); i++)
      {
         result.add((com.orions2.SdtSDTSku_SDTSkuItem)collection.elementAt(i).getSdt());
      }
      return result ;
   }

   private Vector<com.orions2.SdtSDTSku_SDTSkuItem_RESTInterface> SdtSDTSku_SDTSkuItem_RESTInterfacefromGXObjectCollection( GXBaseCollection<com.orions2.SdtSDTSku_SDTSkuItem> collection )
   {
      Vector<com.orions2.SdtSDTSku_SDTSkuItem_RESTInterface> result = new Vector<com.orions2.SdtSDTSku_SDTSkuItem_RESTInterface>();
      for (int i = 0; i < collection.size(); i++)
      {
         result.addElement(new com.orions2.SdtSDTSku_SDTSkuItem_RESTInterface((com.orions2.SdtSDTSku_SDTSkuItem)collection.elementAt(i)));
      }
      return result ;
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

