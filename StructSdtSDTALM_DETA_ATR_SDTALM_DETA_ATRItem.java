/*
               File: StructSdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem
        Description: SDTALM_DETA_ATR
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:16.8
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem( )
   {
      gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listdescripcion = "" ;
      gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_valoratributo = "" ;
      gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listtipo = "" ;
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

   public String getTdet_listdescripcion( )
   {
      return gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listdescripcion ;
   }

   public void setTdet_listdescripcion( String value )
   {
      gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listdescripcion = value ;
   }

   public String getTdet_valoratributo( )
   {
      return gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_valoratributo ;
   }

   public void setTdet_valoratributo( String value )
   {
      gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_valoratributo = value ;
   }

   public String getTdet_listtipo( )
   {
      return gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listtipo ;
   }

   public void setTdet_listtipo( String value )
   {
      gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listtipo = value ;
   }

   public long getTdet_listid( )
   {
      return gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listid ;
   }

   public void setTdet_listid( long value )
   {
      gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listid = value ;
   }

   protected long gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listid ;
   protected String gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listtipo ;
   protected String gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listdescripcion ;
   protected String gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_valoratributo ;
}

