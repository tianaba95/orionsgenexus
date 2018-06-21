/*
               File: StructSdtSDTRatificar_ATRIBUTOSItem
        Description: SDTRatificar
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:19.67
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTRatificar_ATRIBUTOSItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTRatificar_ATRIBUTOSItem( )
   {
      gxTv_SdtSDTRatificar_ATRIBUTOSItem_Tdetplacanumero = "" ;
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

   public String getTdetplacanumero( )
   {
      return gxTv_SdtSDTRatificar_ATRIBUTOSItem_Tdetplacanumero ;
   }

   public void setTdetplacanumero( String value )
   {
      gxTv_SdtSDTRatificar_ATRIBUTOSItem_Tdetplacanumero = value ;
   }

   protected String gxTv_SdtSDTRatificar_ATRIBUTOSItem_Tdetplacanumero ;
}

