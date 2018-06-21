/*
               File: StructSdtSDTRatificar
        Description: SDTRatificar
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:19.65
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTRatificar implements Cloneable, java.io.Serializable
{
   public StructSdtSDTRatificar( )
   {
      gxTv_SdtSDTRatificar_Tranregionabrev = "" ;
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

   public long getTranid( )
   {
      return gxTv_SdtSDTRatificar_Tranid ;
   }

   public void setTranid( long value )
   {
      gxTv_SdtSDTRatificar_Tranid = value ;
   }

   public long getTranconsecutivocc( )
   {
      return gxTv_SdtSDTRatificar_Tranconsecutivocc ;
   }

   public void setTranconsecutivocc( long value )
   {
      gxTv_SdtSDTRatificar_Tranconsecutivocc = value ;
   }

   public short getTranregioncodigo( )
   {
      return gxTv_SdtSDTRatificar_Tranregioncodigo ;
   }

   public void setTranregioncodigo( short value )
   {
      gxTv_SdtSDTRatificar_Tranregioncodigo = value ;
   }

   public String getTranregionabrev( )
   {
      return gxTv_SdtSDTRatificar_Tranregionabrev ;
   }

   public void setTranregionabrev( String value )
   {
      gxTv_SdtSDTRatificar_Tranregionabrev = value ;
   }

   public long getTrancodtipoelemento( )
   {
      return gxTv_SdtSDTRatificar_Trancodtipoelemento ;
   }

   public void setTrancodtipoelemento( long value )
   {
      gxTv_SdtSDTRatificar_Trancodtipoelemento = value ;
   }

   public java.util.Vector getAtributos( )
   {
      return gxTv_SdtSDTRatificar_Atributos ;
   }

   public void setAtributos( java.util.Vector value )
   {
      gxTv_SdtSDTRatificar_Atributos = value ;
   }

   protected short gxTv_SdtSDTRatificar_Tranregioncodigo ;
   protected long gxTv_SdtSDTRatificar_Tranid ;
   protected long gxTv_SdtSDTRatificar_Tranconsecutivocc ;
   protected long gxTv_SdtSDTRatificar_Trancodtipoelemento ;
   protected String gxTv_SdtSDTRatificar_Tranregionabrev ;
   protected java.util.Vector gxTv_SdtSDTRatificar_Atributos=null ;
}

