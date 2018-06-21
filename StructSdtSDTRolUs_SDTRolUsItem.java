/*
               File: StructSdtSDTRolUs_SDTRolUsItem
        Description: SDTRolUs
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:19.79
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTRolUs_SDTRolUsItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTRolUs_SDTRolUsItem( )
   {
      gxTv_SdtSDTRolUs_SDTRolUsItem_Roldescripcion = "" ;
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

   public long getRolid( )
   {
      return gxTv_SdtSDTRolUs_SDTRolUsItem_Rolid ;
   }

   public void setRolid( long value )
   {
      gxTv_SdtSDTRolUs_SDTRolUsItem_Rolid = value ;
   }

   public String getRoldescripcion( )
   {
      return gxTv_SdtSDTRolUs_SDTRolUsItem_Roldescripcion ;
   }

   public void setRoldescripcion( String value )
   {
      gxTv_SdtSDTRolUs_SDTRolUsItem_Roldescripcion = value ;
   }

   protected long gxTv_SdtSDTRolUs_SDTRolUsItem_Rolid ;
   protected String gxTv_SdtSDTRolUs_SDTRolUsItem_Roldescripcion ;
}

