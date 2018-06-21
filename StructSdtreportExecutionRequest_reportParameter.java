/*
               File: StructSdtreportExecutionRequest_reportParameter
        Description: reportExecutionRequest
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:15.95
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtreportExecutionRequest_reportParameter implements Cloneable, java.io.Serializable
{
   public StructSdtreportExecutionRequest_reportParameter( )
   {
      gxTv_SdtreportExecutionRequest_reportParameter_Name = "" ;
      gxTv_SdtreportExecutionRequest_reportParameter_Value = "" ;
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
      return gxTv_SdtreportExecutionRequest_reportParameter_Name ;
   }

   public void setName( String value )
   {
      gxTv_SdtreportExecutionRequest_reportParameter_Name = value ;
   }

   public String getValue( )
   {
      return gxTv_SdtreportExecutionRequest_reportParameter_Value ;
   }

   public void setValue( String value )
   {
      gxTv_SdtreportExecutionRequest_reportParameter_Value = value ;
   }

   protected String gxTv_SdtreportExecutionRequest_reportParameter_Name ;
   protected String gxTv_SdtreportExecutionRequest_reportParameter_Value ;
}

