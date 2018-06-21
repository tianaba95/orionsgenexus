/*
               File: StructSdtreportExecutionRequest
        Description: reportExecutionRequest
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:15.93
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtreportExecutionRequest implements Cloneable, java.io.Serializable
{
   public StructSdtreportExecutionRequest( )
   {
      gxTv_SdtreportExecutionRequest_Reportunituri = "" ;
      gxTv_SdtreportExecutionRequest_Async = "" ;
      gxTv_SdtreportExecutionRequest_Freshdata = "" ;
      gxTv_SdtreportExecutionRequest_Savedatasnapshot = "" ;
      gxTv_SdtreportExecutionRequest_Outputformat = "" ;
      gxTv_SdtreportExecutionRequest_Interactive = "" ;
      gxTv_SdtreportExecutionRequest_Ignorepagination = "" ;
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

   public String getReportunituri( )
   {
      return gxTv_SdtreportExecutionRequest_Reportunituri ;
   }

   public void setReportunituri( String value )
   {
      gxTv_SdtreportExecutionRequest_Reportunituri = value ;
   }

   public String getAsync( )
   {
      return gxTv_SdtreportExecutionRequest_Async ;
   }

   public void setAsync( String value )
   {
      gxTv_SdtreportExecutionRequest_Async = value ;
   }

   public String getFreshdata( )
   {
      return gxTv_SdtreportExecutionRequest_Freshdata ;
   }

   public void setFreshdata( String value )
   {
      gxTv_SdtreportExecutionRequest_Freshdata = value ;
   }

   public String getSavedatasnapshot( )
   {
      return gxTv_SdtreportExecutionRequest_Savedatasnapshot ;
   }

   public void setSavedatasnapshot( String value )
   {
      gxTv_SdtreportExecutionRequest_Savedatasnapshot = value ;
   }

   public String getOutputformat( )
   {
      return gxTv_SdtreportExecutionRequest_Outputformat ;
   }

   public void setOutputformat( String value )
   {
      gxTv_SdtreportExecutionRequest_Outputformat = value ;
   }

   public String getInteractive( )
   {
      return gxTv_SdtreportExecutionRequest_Interactive ;
   }

   public void setInteractive( String value )
   {
      gxTv_SdtreportExecutionRequest_Interactive = value ;
   }

   public String getIgnorepagination( )
   {
      return gxTv_SdtreportExecutionRequest_Ignorepagination ;
   }

   public void setIgnorepagination( String value )
   {
      gxTv_SdtreportExecutionRequest_Ignorepagination = value ;
   }

   public java.util.Vector getParameters( )
   {
      return gxTv_SdtreportExecutionRequest_Parameters ;
   }

   public void setParameters( java.util.Vector value )
   {
      gxTv_SdtreportExecutionRequest_Parameters = value ;
   }

   protected String gxTv_SdtreportExecutionRequest_Reportunituri ;
   protected String gxTv_SdtreportExecutionRequest_Async ;
   protected String gxTv_SdtreportExecutionRequest_Freshdata ;
   protected String gxTv_SdtreportExecutionRequest_Savedatasnapshot ;
   protected String gxTv_SdtreportExecutionRequest_Outputformat ;
   protected String gxTv_SdtreportExecutionRequest_Interactive ;
   protected String gxTv_SdtreportExecutionRequest_Ignorepagination ;
   protected java.util.Vector gxTv_SdtreportExecutionRequest_Parameters=null ;
}

