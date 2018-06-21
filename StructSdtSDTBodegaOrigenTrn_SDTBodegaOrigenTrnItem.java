/*
               File: StructSdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem
        Description: SDTBodegaOrigenTrn
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:16.27
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem( )
   {
      gxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_codigo = "" ;
      gxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_descripcion = "" ;
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

   public String getBode_codigo( )
   {
      return gxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_codigo ;
   }

   public void setBode_codigo( String value )
   {
      gxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_codigo = value ;
   }

   public String getBode_descripcion( )
   {
      return gxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_descripcion ;
   }

   public void setBode_descripcion( String value )
   {
      gxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_descripcion = value ;
   }

   protected String gxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_codigo ;
   protected String gxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_descripcion ;
}

