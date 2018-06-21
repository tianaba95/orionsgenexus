/*
               File: StructSdtSDTHVAtributos_SDTHVAtributosItem
        Description: SDTHVAtributos
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:18.28
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTHVAtributos_SDTHVAtributosItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTHVAtributos_SDTHVAtributosItem( )
   {
      gxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_listdescripcion = "" ;
      gxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_valoratributo = "" ;
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

   public String getGtdet_listdescripcion( )
   {
      return gxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_listdescripcion ;
   }

   public void setGtdet_listdescripcion( String value )
   {
      gxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_listdescripcion = value ;
   }

   public String getGtdet_valoratributo( )
   {
      return gxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_valoratributo ;
   }

   public void setGtdet_valoratributo( String value )
   {
      gxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_valoratributo = value ;
   }

   protected String gxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_listdescripcion ;
   protected String gxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_valoratributo ;
}

