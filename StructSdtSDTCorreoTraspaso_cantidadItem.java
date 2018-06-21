/*
               File: StructSdtSDTCorreoTraspaso_cantidadItem
        Description: SDTCorreoTraspaso
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:17.19
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTCorreoTraspaso_cantidadItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTCorreoTraspaso_cantidadItem( )
   {
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

   public int getTrancantidadelementos( )
   {
      return gxTv_SdtSDTCorreoTraspaso_cantidadItem_Trancantidadelementos ;
   }

   public void setTrancantidadelementos( int value )
   {
      gxTv_SdtSDTCorreoTraspaso_cantidadItem_Trancantidadelementos = value ;
   }

   protected int gxTv_SdtSDTCorreoTraspaso_cantidadItem_Trancantidadelementos ;
}

