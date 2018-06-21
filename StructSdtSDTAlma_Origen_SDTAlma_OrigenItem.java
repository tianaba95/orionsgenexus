/*
               File: StructSdtSDTAlma_Origen_SDTAlma_OrigenItem
        Description: SDTAlma_Origen
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:15.98
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTAlma_Origen_SDTAlma_OrigenItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTAlma_Origen_SDTAlma_OrigenItem( )
   {
      gxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_codigo = "" ;
      gxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_descripcion = "" ;
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
      return gxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_codigo ;
   }

   public void setAlma_codigo( String value )
   {
      gxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_codigo = value ;
   }

   public String getAlma_descripcion( )
   {
      return gxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_descripcion ;
   }

   public void setAlma_descripcion( String value )
   {
      gxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_descripcion = value ;
   }

   protected String gxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_codigo ;
   protected String gxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_descripcion ;
}

