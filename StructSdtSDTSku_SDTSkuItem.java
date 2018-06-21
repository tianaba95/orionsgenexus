/*
               File: StructSdtSDTSku_SDTSkuItem
        Description: SDTSku
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:20.27
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTSku_SDTSkuItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTSku_SDTSkuItem( )
   {
      gxTv_SdtSDTSku_SDTSkuItem_Elem_consecutivo = "" ;
      gxTv_SdtSDTSku_SDTSkuItem_Cata_descripcion = "" ;
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

   public String getElem_consecutivo( )
   {
      return gxTv_SdtSDTSku_SDTSkuItem_Elem_consecutivo ;
   }

   public void setElem_consecutivo( String value )
   {
      gxTv_SdtSDTSku_SDTSkuItem_Elem_consecutivo = value ;
   }

   public String getCata_descripcion( )
   {
      return gxTv_SdtSDTSku_SDTSkuItem_Cata_descripcion ;
   }

   public void setCata_descripcion( String value )
   {
      gxTv_SdtSDTSku_SDTSkuItem_Cata_descripcion = value ;
   }

   protected String gxTv_SdtSDTSku_SDTSkuItem_Elem_consecutivo ;
   protected String gxTv_SdtSDTSku_SDTSkuItem_Cata_descripcion ;
}

