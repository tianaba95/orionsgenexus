/*
               File: StructSdtSDTReportes_parametersItem
        Description: SDTReportes
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: May 29, 2018 15:35:9.2
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTReportes_parametersItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTReportes_parametersItem( )
   {
      gxTv_SdtSDTReportes_parametersItem_Name = "" ;
      gxTv_SdtSDTReportes_parametersItem_Value = "" ;
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

   public String getName( )
   {
      return gxTv_SdtSDTReportes_parametersItem_Name ;
   }

   public void setName( String value )
   {
      gxTv_SdtSDTReportes_parametersItem_Name = value ;
   }

   public String getValue( )
   {
      return gxTv_SdtSDTReportes_parametersItem_Value ;
   }

   public void setValue( String value )
   {
      gxTv_SdtSDTReportes_parametersItem_Value = value ;
   }

   protected String gxTv_SdtSDTReportes_parametersItem_Name ;
   protected String gxTv_SdtSDTReportes_parametersItem_Value ;
}

