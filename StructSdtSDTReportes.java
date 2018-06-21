/*
               File: StructSdtSDTReportes
        Description: SDTReportes
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: May 29, 2018 15:35:8.99
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTReportes implements Cloneable, java.io.Serializable
{
   public StructSdtSDTReportes( )
   {
      gxTv_SdtSDTReportes_Reportunituri = "" ;
      gxTv_SdtSDTReportes_Async = "" ;
      gxTv_SdtSDTReportes_Freshdata = "" ;
      gxTv_SdtSDTReportes_Savedatasnapshot = "" ;
      gxTv_SdtSDTReportes_Outputformat = "" ;
      gxTv_SdtSDTReportes_Interactive = "" ;
      gxTv_SdtSDTReportes_Ignorepagination = "" ;
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
      return gxTv_SdtSDTReportes_Reportunituri ;
   }

   public void setReportunituri( String value )
   {
      gxTv_SdtSDTReportes_Reportunituri = value ;
   }

   public String getAsync( )
   {
      return gxTv_SdtSDTReportes_Async ;
   }

   public void setAsync( String value )
   {
      gxTv_SdtSDTReportes_Async = value ;
   }

   public String getFreshdata( )
   {
      return gxTv_SdtSDTReportes_Freshdata ;
   }

   public void setFreshdata( String value )
   {
      gxTv_SdtSDTReportes_Freshdata = value ;
   }

   public String getSavedatasnapshot( )
   {
      return gxTv_SdtSDTReportes_Savedatasnapshot ;
   }

   public void setSavedatasnapshot( String value )
   {
      gxTv_SdtSDTReportes_Savedatasnapshot = value ;
   }

   public String getOutputformat( )
   {
      return gxTv_SdtSDTReportes_Outputformat ;
   }

   public void setOutputformat( String value )
   {
      gxTv_SdtSDTReportes_Outputformat = value ;
   }

   public String getInteractive( )
   {
      return gxTv_SdtSDTReportes_Interactive ;
   }

   public void setInteractive( String value )
   {
      gxTv_SdtSDTReportes_Interactive = value ;
   }

   public String getIgnorepagination( )
   {
      return gxTv_SdtSDTReportes_Ignorepagination ;
   }

   public void setIgnorepagination( String value )
   {
      gxTv_SdtSDTReportes_Ignorepagination = value ;
   }

   public java.util.Vector getParameters( )
   {
      return gxTv_SdtSDTReportes_Parameters ;
   }

   public void setParameters( java.util.Vector value )
   {
      gxTv_SdtSDTReportes_Parameters = value ;
   }

   protected String gxTv_SdtSDTReportes_Reportunituri ;
   protected String gxTv_SdtSDTReportes_Async ;
   protected String gxTv_SdtSDTReportes_Freshdata ;
   protected String gxTv_SdtSDTReportes_Savedatasnapshot ;
   protected String gxTv_SdtSDTReportes_Outputformat ;
   protected String gxTv_SdtSDTReportes_Interactive ;
   protected String gxTv_SdtSDTReportes_Ignorepagination ;
   protected java.util.Vector gxTv_SdtSDTReportes_Parameters=null ;
}

