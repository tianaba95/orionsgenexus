/*
               File: StructSdtsdtcambiarestadotransaccion
        Description: sdtcambiarestadotransaccion
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:16.84
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtsdtcambiarestadotransaccion implements Cloneable, java.io.Serializable
{
   public StructSdtsdtcambiarestadotransaccion( )
   {
      gxTv_Sdtsdtcambiarestadotransaccion_Tranregionabrev = "" ;
      gxTv_Sdtsdtcambiarestadotransaccion_Tranmoduloorigen = "" ;
      gxTv_Sdtsdtcambiarestadotransaccion_Tranmodulodestino = "" ;
      gxTv_Sdtsdtcambiarestadotransaccion_Tranestado = "" ;
      gxTv_Sdtsdtcambiarestadotransaccion_Trantipoelemento = "" ;
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

   public int getTranregioncodigo( )
   {
      return gxTv_Sdtsdtcambiarestadotransaccion_Tranregioncodigo ;
   }

   public void setTranregioncodigo( int value )
   {
      gxTv_Sdtsdtcambiarestadotransaccion_Tranregioncodigo = value ;
   }

   public String getTranregionabrev( )
   {
      return gxTv_Sdtsdtcambiarestadotransaccion_Tranregionabrev ;
   }

   public void setTranregionabrev( String value )
   {
      gxTv_Sdtsdtcambiarestadotransaccion_Tranregionabrev = value ;
   }

   public long getTranid( )
   {
      return gxTv_Sdtsdtcambiarestadotransaccion_Tranid ;
   }

   public void setTranid( long value )
   {
      gxTv_Sdtsdtcambiarestadotransaccion_Tranid = value ;
   }

   public String getTranmoduloorigen( )
   {
      return gxTv_Sdtsdtcambiarestadotransaccion_Tranmoduloorigen ;
   }

   public void setTranmoduloorigen( String value )
   {
      gxTv_Sdtsdtcambiarestadotransaccion_Tranmoduloorigen = value ;
   }

   public String getTranmodulodestino( )
   {
      return gxTv_Sdtsdtcambiarestadotransaccion_Tranmodulodestino ;
   }

   public void setTranmodulodestino( String value )
   {
      gxTv_Sdtsdtcambiarestadotransaccion_Tranmodulodestino = value ;
   }

   public String getTranestado( )
   {
      return gxTv_Sdtsdtcambiarestadotransaccion_Tranestado ;
   }

   public void setTranestado( String value )
   {
      gxTv_Sdtsdtcambiarestadotransaccion_Tranestado = value ;
   }

   public String getTrantipoelemento( )
   {
      return gxTv_Sdtsdtcambiarestadotransaccion_Trantipoelemento ;
   }

   public void setTrantipoelemento( String value )
   {
      gxTv_Sdtsdtcambiarestadotransaccion_Trantipoelemento = value ;
   }

   public java.util.Vector getDetalles( )
   {
      return gxTv_Sdtsdtcambiarestadotransaccion_Detalles ;
   }

   public void setDetalles( java.util.Vector value )
   {
      gxTv_Sdtsdtcambiarestadotransaccion_Detalles = value ;
   }

   protected int gxTv_Sdtsdtcambiarestadotransaccion_Tranregioncodigo ;
   protected long gxTv_Sdtsdtcambiarestadotransaccion_Tranid ;
   protected String gxTv_Sdtsdtcambiarestadotransaccion_Tranestado ;
   protected String gxTv_Sdtsdtcambiarestadotransaccion_Trantipoelemento ;
   protected String gxTv_Sdtsdtcambiarestadotransaccion_Tranregionabrev ;
   protected String gxTv_Sdtsdtcambiarestadotransaccion_Tranmoduloorigen ;
   protected String gxTv_Sdtsdtcambiarestadotransaccion_Tranmodulodestino ;
   protected java.util.Vector gxTv_Sdtsdtcambiarestadotransaccion_Detalles=null ;
}

