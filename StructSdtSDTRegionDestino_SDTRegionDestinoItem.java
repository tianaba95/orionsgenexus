/*
               File: StructSdtSDTRegionDestino_SDTRegionDestinoItem
        Description: SDTRegionDestino
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:19.75
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTRegionDestino_SDTRegionDestinoItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTRegionDestino_SDTRegionDestinoItem( )
   {
      gxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regiondescripciondestino = "" ;
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

   public long getTran_regioniddestino( )
   {
      return gxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regioniddestino ;
   }

   public void setTran_regioniddestino( long value )
   {
      gxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regioniddestino = value ;
   }

   public short getTran_regioncodigodestino( )
   {
      return gxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regioncodigodestino ;
   }

   public void setTran_regioncodigodestino( short value )
   {
      gxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regioncodigodestino = value ;
   }

   public String getTran_regiondescripciondestino( )
   {
      return gxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regiondescripciondestino ;
   }

   public void setTran_regiondescripciondestino( String value )
   {
      gxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regiondescripciondestino = value ;
   }

   protected short gxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regioncodigodestino ;
   protected long gxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regioniddestino ;
   protected String gxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regiondescripciondestino ;
}

