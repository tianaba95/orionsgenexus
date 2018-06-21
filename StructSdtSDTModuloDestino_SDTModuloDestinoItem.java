/*
               File: StructSdtSDTModuloDestino_SDTModuloDestinoItem
        Description: SDTModuloDestino
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:18.85
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTModuloDestino_SDTModuloDestinoItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTModuloDestino_SDTModuloDestinoItem( )
   {
      gxTv_SdtSDTModuloDestino_SDTModuloDestinoItem_Modulo = "" ;
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

   public String getModulo( )
   {
      return gxTv_SdtSDTModuloDestino_SDTModuloDestinoItem_Modulo ;
   }

   public void setModulo( String value )
   {
      gxTv_SdtSDTModuloDestino_SDTModuloDestinoItem_Modulo = value ;
   }

   protected String gxTv_SdtSDTModuloDestino_SDTModuloDestinoItem_Modulo ;
}

