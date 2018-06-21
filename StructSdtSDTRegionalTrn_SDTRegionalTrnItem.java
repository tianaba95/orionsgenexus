/*
               File: StructSdtSDTRegionalTrn_SDTRegionalTrnItem
        Description: SDTRegionalTrn
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:19.72
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTRegionalTrn_SDTRegionalTrnItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTRegionalTrn_SDTRegionalTrnItem( )
   {
      gxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regiondescripcion = "" ;
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

   public long getTran_regionid( )
   {
      return gxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regionid ;
   }

   public void setTran_regionid( long value )
   {
      gxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regionid = value ;
   }

   public short getTran_regioncodigo( )
   {
      return gxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regioncodigo ;
   }

   public void setTran_regioncodigo( short value )
   {
      gxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regioncodigo = value ;
   }

   public String getTran_regiondescripcion( )
   {
      return gxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regiondescripcion ;
   }

   public void setTran_regiondescripcion( String value )
   {
      gxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regiondescripcion = value ;
   }

   protected short gxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regioncodigo ;
   protected long gxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regionid ;
   protected String gxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regiondescripcion ;
}

