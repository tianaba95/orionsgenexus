/*
               File: StructSdtSDTCentroUsu_SDTCentroUsuItem
        Description: SDTCentroUsu
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:16.93
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTCentroUsu_SDTCentroUsuItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTCentroUsu_SDTCentroUsuItem( )
   {
      gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centcodigo = "" ;
      gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Regiabrev = "" ;
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

   public String getCentcodigo( )
   {
      return gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centcodigo ;
   }

   public void setCentcodigo( String value )
   {
      gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centcodigo = value ;
   }

   public long getCentid( )
   {
      return gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centid ;
   }

   public void setCentid( long value )
   {
      gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centid = value ;
   }

   public short getRegicod( )
   {
      return gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Regicod ;
   }

   public void setRegicod( short value )
   {
      gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Regicod = value ;
   }

   public String getRegiabrev( )
   {
      return gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Regiabrev ;
   }

   public void setRegiabrev( String value )
   {
      gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Regiabrev = value ;
   }

   protected short gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Regicod ;
   protected long gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centid ;
   protected String gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centcodigo ;
   protected String gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Regiabrev ;
}

