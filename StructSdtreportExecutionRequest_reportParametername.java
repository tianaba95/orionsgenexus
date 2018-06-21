/*
               File: StructSdtreportExecutionRequest_reportParametername
        Description: reportExecutionRequest
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: May 29, 2018 15:54:51.76
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtreportExecutionRequest_reportParametername implements Cloneable, java.io.Serializable
{
   public StructSdtreportExecutionRequest_reportParametername( )
   {
      gxTv_SdtreportExecutionRequest_reportParametername_Name = "" ;
      gxTv_SdtreportExecutionRequest_reportParametername_Value = "" ;
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
      return gxTv_SdtreportExecutionRequest_reportParametername_Name ;
   }

   public void setName( String value )
   {
      gxTv_SdtreportExecutionRequest_reportParametername_Name = value ;
   }

   public String getValue( )
   {
      return gxTv_SdtreportExecutionRequest_reportParametername_Value ;
   }

   public void setValue( String value )
   {
      gxTv_SdtreportExecutionRequest_reportParametername_Value = value ;
   }

   protected String gxTv_SdtreportExecutionRequest_reportParametername_Name ;
   protected String gxTv_SdtreportExecutionRequest_reportParametername_Value ;
}

