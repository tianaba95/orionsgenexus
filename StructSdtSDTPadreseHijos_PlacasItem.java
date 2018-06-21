/*
               File: StructSdtSDTPadreseHijos_PlacasItem
        Description: SDTPadreseHijos
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:19.48
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTPadreseHijos_PlacasItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTPadreseHijos_PlacasItem( )
   {
      gxTv_SdtSDTPadreseHijos_PlacasItem_Tdetplacanumero = "" ;
      gxTv_SdtSDTPadreseHijos_PlacasItem_Tdetplacapadre = "" ;
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
      return gxTv_SdtSDTPadreseHijos_PlacasItem_Tdetplacanumero ;
   }

   public void setTdetplacanumero( String value )
   {
      gxTv_SdtSDTPadreseHijos_PlacasItem_Tdetplacanumero = value ;
   }

   public String getTdetplacapadre( )
   {
      return gxTv_SdtSDTPadreseHijos_PlacasItem_Tdetplacapadre ;
   }

   public void setTdetplacapadre( String value )
   {
      gxTv_SdtSDTPadreseHijos_PlacasItem_Tdetplacapadre = value ;
   }

   protected String gxTv_SdtSDTPadreseHijos_PlacasItem_Tdetplacanumero ;
   protected String gxTv_SdtSDTPadreseHijos_PlacasItem_Tdetplacapadre ;
}

