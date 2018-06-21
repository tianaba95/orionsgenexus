/*
               File: StructSdtSDTCierreMes
        Description: SDTCierreMes
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:17.6
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTCierreMes implements Cloneable, java.io.Serializable
{
   public StructSdtSDTCierreMes( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTCierreMes_Tranfecharegistro = cal.getTime() ;
      gxTv_SdtSDTCierreMes_Tranregionabrevorigen = "" ;
      gxTv_SdtSDTCierreMes_Trancentrocostocodigoorigen = "" ;
      gxTv_SdtSDTCierreMes_Tranmoduloorigen = "" ;
      gxTv_SdtSDTCierreMes_Trancodalmaorigen = "" ;
      gxTv_SdtSDTCierreMes_Trancodbodeorigen = "" ;
      gxTv_SdtSDTCierreMes_Tranregionabrevdestino = "" ;
      gxTv_SdtSDTCierreMes_Tranmodulodestino = "" ;
      gxTv_SdtSDTCierreMes_Trancodalmadestino = "" ;
      gxTv_SdtSDTCierreMes_Trancodbodedestino = "" ;
      gxTv_SdtSDTCierreMes_Trancentrocostocodigodestino = "" ;
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

   public java.util.Date getTranfecharegistro( )
   {
      return gxTv_SdtSDTCierreMes_Tranfecharegistro ;
   }

   public void setTranfecharegistro( java.util.Date value )
   {
      gxTv_SdtSDTCierreMes_Tranfecharegistro = value ;
   }

   public String getTranregionabrevorigen( )
   {
      return gxTv_SdtSDTCierreMes_Tranregionabrevorigen ;
   }

   public void setTranregionabrevorigen( String value )
   {
      gxTv_SdtSDTCierreMes_Tranregionabrevorigen = value ;
   }

   public short getTranregioncodigo( )
   {
      return gxTv_SdtSDTCierreMes_Tranregioncodigo ;
   }

   public void setTranregioncodigo( short value )
   {
      gxTv_SdtSDTCierreMes_Tranregioncodigo = value ;
   }

   public String getTrancentrocostocodigoorigen( )
   {
      return gxTv_SdtSDTCierreMes_Trancentrocostocodigoorigen ;
   }

   public void setTrancentrocostocodigoorigen( String value )
   {
      gxTv_SdtSDTCierreMes_Trancentrocostocodigoorigen = value ;
   }

   public String getTranmoduloorigen( )
   {
      return gxTv_SdtSDTCierreMes_Tranmoduloorigen ;
   }

   public void setTranmoduloorigen( String value )
   {
      gxTv_SdtSDTCierreMes_Tranmoduloorigen = value ;
   }

   public String getTrancodalmaorigen( )
   {
      return gxTv_SdtSDTCierreMes_Trancodalmaorigen ;
   }

   public void setTrancodalmaorigen( String value )
   {
      gxTv_SdtSDTCierreMes_Trancodalmaorigen = value ;
   }

   public String getTrancodbodeorigen( )
   {
      return gxTv_SdtSDTCierreMes_Trancodbodeorigen ;
   }

   public void setTrancodbodeorigen( String value )
   {
      gxTv_SdtSDTCierreMes_Trancodbodeorigen = value ;
   }

   public short getTranregioncodigodestino( )
   {
      return gxTv_SdtSDTCierreMes_Tranregioncodigodestino ;
   }

   public void setTranregioncodigodestino( short value )
   {
      gxTv_SdtSDTCierreMes_Tranregioncodigodestino = value ;
   }

   public String getTranregionabrevdestino( )
   {
      return gxTv_SdtSDTCierreMes_Tranregionabrevdestino ;
   }

   public void setTranregionabrevdestino( String value )
   {
      gxTv_SdtSDTCierreMes_Tranregionabrevdestino = value ;
   }

   public String getTranmodulodestino( )
   {
      return gxTv_SdtSDTCierreMes_Tranmodulodestino ;
   }

   public void setTranmodulodestino( String value )
   {
      gxTv_SdtSDTCierreMes_Tranmodulodestino = value ;
   }

   public String getTrancodalmadestino( )
   {
      return gxTv_SdtSDTCierreMes_Trancodalmadestino ;
   }

   public void setTrancodalmadestino( String value )
   {
      gxTv_SdtSDTCierreMes_Trancodalmadestino = value ;
   }

   public String getTrancodbodedestino( )
   {
      return gxTv_SdtSDTCierreMes_Trancodbodedestino ;
   }

   public void setTrancodbodedestino( String value )
   {
      gxTv_SdtSDTCierreMes_Trancodbodedestino = value ;
   }

   public String getTrancentrocostocodigodestino( )
   {
      return gxTv_SdtSDTCierreMes_Trancentrocostocodigodestino ;
   }

   public void setTrancentrocostocodigodestino( String value )
   {
      gxTv_SdtSDTCierreMes_Trancentrocostocodigodestino = value ;
   }

   protected short gxTv_SdtSDTCierreMes_Tranregioncodigo ;
   protected short gxTv_SdtSDTCierreMes_Tranregioncodigodestino ;
   protected String gxTv_SdtSDTCierreMes_Tranregionabrevorigen ;
   protected String gxTv_SdtSDTCierreMes_Trancentrocostocodigoorigen ;
   protected String gxTv_SdtSDTCierreMes_Tranmoduloorigen ;
   protected String gxTv_SdtSDTCierreMes_Trancodalmaorigen ;
   protected String gxTv_SdtSDTCierreMes_Trancodbodeorigen ;
   protected String gxTv_SdtSDTCierreMes_Tranregionabrevdestino ;
   protected String gxTv_SdtSDTCierreMes_Tranmodulodestino ;
   protected String gxTv_SdtSDTCierreMes_Trancodalmadestino ;
   protected String gxTv_SdtSDTCierreMes_Trancodbodedestino ;
   protected String gxTv_SdtSDTCierreMes_Trancentrocostocodigodestino ;
   protected java.util.Date gxTv_SdtSDTCierreMes_Tranfecharegistro ;
}

