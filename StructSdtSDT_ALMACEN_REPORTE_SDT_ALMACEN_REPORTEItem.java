/*
               File: StructSdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem
        Description: SDT_ALMACEN_REPORTE
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: May 10, 2018 17:5:32.1
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem( )
   {
      gxTv_SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem_Alma_codigo = "" ;
      gxTv_SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem_Alma_descripcion = "" ;
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

   public String getAlma_codigo( )
   {
      return gxTv_SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem_Alma_codigo ;
   }

   public void setAlma_codigo( String value )
   {
      gxTv_SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem_Alma_codigo = value ;
   }

   public String getAlma_descripcion( )
   {
      return gxTv_SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem_Alma_descripcion ;
   }

   public void setAlma_descripcion( String value )
   {
      gxTv_SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem_Alma_descripcion = value ;
   }

   protected String gxTv_SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem_Alma_codigo ;
   protected String gxTv_SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem_Alma_descripcion ;
}

