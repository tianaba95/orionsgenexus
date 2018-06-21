/*
               File: StructSdtSDTRespuestaReport
        Description: SDTRespuestaReport
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:19.78
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTRespuestaReport implements Cloneable, java.io.Serializable
{
   public StructSdtSDTRespuestaReport( )
   {
      gxTv_SdtSDTRespuestaReport_Id = "" ;
      gxTv_SdtSDTRespuestaReport_Status = "" ;
      gxTv_SdtSDTRespuestaReport_Reporturi = "" ;
      gxTv_SdtSDTRespuestaReport_Requestid = "" ;
      gxTv_SdtSDTRespuestaReport_Status2 = "" ;
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

   public String getId( )
   {
      return gxTv_SdtSDTRespuestaReport_Id ;
   }

   public void setId( String value )
   {
      gxTv_SdtSDTRespuestaReport_Id = value ;
   }

   public String getStatus( )
   {
      return gxTv_SdtSDTRespuestaReport_Status ;
   }

   public void setStatus( String value )
   {
      gxTv_SdtSDTRespuestaReport_Status = value ;
   }

   public String getReporturi( )
   {
      return gxTv_SdtSDTRespuestaReport_Reporturi ;
   }

   public void setReporturi( String value )
   {
      gxTv_SdtSDTRespuestaReport_Reporturi = value ;
   }

   public String getRequestid( )
   {
      return gxTv_SdtSDTRespuestaReport_Requestid ;
   }

   public void setRequestid( String value )
   {
      gxTv_SdtSDTRespuestaReport_Requestid = value ;
   }

   public String getStatus2( )
   {
      return gxTv_SdtSDTRespuestaReport_Status2 ;
   }

   public void setStatus2( String value )
   {
      gxTv_SdtSDTRespuestaReport_Status2 = value ;
   }

   protected String gxTv_SdtSDTRespuestaReport_Id ;
   protected String gxTv_SdtSDTRespuestaReport_Status ;
   protected String gxTv_SdtSDTRespuestaReport_Reporturi ;
   protected String gxTv_SdtSDTRespuestaReport_Requestid ;
   protected String gxTv_SdtSDTRespuestaReport_Status2 ;
}

