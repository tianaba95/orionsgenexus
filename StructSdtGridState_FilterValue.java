/*
               File: StructSdtGridState_FilterValue
        Description: GridState
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:15.79
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtGridState_FilterValue implements Cloneable, java.io.Serializable
{
   public StructSdtGridState_FilterValue( )
   {
      gxTv_SdtGridState_FilterValue_Value = "" ;
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

   public String getValue( )
   {
      return gxTv_SdtGridState_FilterValue_Value ;
   }

   public void setValue( String value )
   {
      gxTv_SdtGridState_FilterValue_Value = value ;
   }

   protected String gxTv_SdtGridState_FilterValue_Value ;
}

