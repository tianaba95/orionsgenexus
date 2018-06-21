/*
               File: StructSdtGridState
        Description: GridState
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:15.78
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtGridState implements Cloneable, java.io.Serializable
{
   public StructSdtGridState( )
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

   public short getCurrentpage( )
   {
      return gxTv_SdtGridState_Currentpage ;
   }

   public void setCurrentpage( short value )
   {
      gxTv_SdtGridState_Currentpage = value ;
   }

   public short getOrderedby( )
   {
      return gxTv_SdtGridState_Orderedby ;
   }

   public void setOrderedby( short value )
   {
      gxTv_SdtGridState_Orderedby = value ;
   }

   public byte getHidingsearch( )
   {
      return gxTv_SdtGridState_Hidingsearch ;
   }

   public void setHidingsearch( byte value )
   {
      gxTv_SdtGridState_Hidingsearch = value ;
   }

   public java.util.Vector getFiltervalues( )
   {
      return gxTv_SdtGridState_Filtervalues ;
   }

   public void setFiltervalues( java.util.Vector value )
   {
      gxTv_SdtGridState_Filtervalues = value ;
   }

   protected byte gxTv_SdtGridState_Hidingsearch ;
   protected short gxTv_SdtGridState_Currentpage ;
   protected short gxTv_SdtGridState_Orderedby ;
   protected java.util.Vector gxTv_SdtGridState_Filtervalues=null ;
}

