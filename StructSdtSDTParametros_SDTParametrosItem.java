/*
               File: StructSdtSDTParametros_SDTParametrosItem
        Description: SDTParametros
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:19.51
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTParametros_SDTParametrosItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTParametros_SDTParametrosItem( )
   {
      gxTv_SdtSDTParametros_SDTParametrosItem_Para_nombre = "" ;
      gxTv_SdtSDTParametros_SDTParametrosItem_Para_valor = "" ;
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

   public long getPara_id( )
   {
      return gxTv_SdtSDTParametros_SDTParametrosItem_Para_id ;
   }

   public void setPara_id( long value )
   {
      gxTv_SdtSDTParametros_SDTParametrosItem_Para_id = value ;
   }

   public String getPara_nombre( )
   {
      return gxTv_SdtSDTParametros_SDTParametrosItem_Para_nombre ;
   }

   public void setPara_nombre( String value )
   {
      gxTv_SdtSDTParametros_SDTParametrosItem_Para_nombre = value ;
   }

   public String getPara_valor( )
   {
      return gxTv_SdtSDTParametros_SDTParametrosItem_Para_valor ;
   }

   public void setPara_valor( String value )
   {
      gxTv_SdtSDTParametros_SDTParametrosItem_Para_valor = value ;
   }

   protected long gxTv_SdtSDTParametros_SDTParametrosItem_Para_id ;
   protected String gxTv_SdtSDTParametros_SDTParametrosItem_Para_nombre ;
   protected String gxTv_SdtSDTParametros_SDTParametrosItem_Para_valor ;
}

