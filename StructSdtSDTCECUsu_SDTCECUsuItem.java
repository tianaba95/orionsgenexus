/*
               File: StructSdtSDTCECUsu_SDTCECUsuItem
        Description: SDTCECUsu
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:16.91
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTCECUsu_SDTCECUsuItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTCECUsu_SDTCECUsuItem( )
   {
      gxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_descripcion = "" ;
      gxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_codigo = "" ;
      gxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_abrev = "" ;
      gxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_descripcion = "" ;
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

   public long getCent_id( )
   {
      return gxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_id ;
   }

   public void setCent_id( long value )
   {
      gxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_id = value ;
   }

   public String getCent_descripcion( )
   {
      return gxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_descripcion ;
   }

   public void setCent_descripcion( String value )
   {
      gxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_descripcion = value ;
   }

   public short getRegi_cod( )
   {
      return gxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_cod ;
   }

   public void setRegi_cod( short value )
   {
      gxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_cod = value ;
   }

   public String getCent_codigo( )
   {
      return gxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_codigo ;
   }

   public void setCent_codigo( String value )
   {
      gxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_codigo = value ;
   }

   public String getRegi_abrev( )
   {
      return gxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_abrev ;
   }

   public void setRegi_abrev( String value )
   {
      gxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_abrev = value ;
   }

   public String getRegi_descripcion( )
   {
      return gxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_descripcion ;
   }

   public void setRegi_descripcion( String value )
   {
      gxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_descripcion = value ;
   }

   protected short gxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_cod ;
   protected long gxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_id ;
   protected String gxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_descripcion ;
   protected String gxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_codigo ;
   protected String gxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_abrev ;
   protected String gxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_descripcion ;
}

