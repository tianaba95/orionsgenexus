/*
               File: StructSdtSDTOrigenbienes_SDTOrigenbienesItem
        Description: SDTOrigenbienes
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:19.45
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTOrigenbienes_SDTOrigenbienesItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTOrigenbienes_SDTOrigenbienesItem( )
   {
      gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Orig_descripcion = "" ;
      gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Tpmo_solicitanumero = "" ;
      gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Tpmo_solicitafecha = "" ;
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

   public long getOrig_identificador( )
   {
      return gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Orig_identificador ;
   }

   public void setOrig_identificador( long value )
   {
      gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Orig_identificador = value ;
   }

   public String getOrig_descripcion( )
   {
      return gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Orig_descripcion ;
   }

   public void setOrig_descripcion( String value )
   {
      gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Orig_descripcion = value ;
   }

   public String getTpmo_solicitanumero( )
   {
      return gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Tpmo_solicitanumero ;
   }

   public void setTpmo_solicitanumero( String value )
   {
      gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Tpmo_solicitanumero = value ;
   }

   public String getTpmo_solicitafecha( )
   {
      return gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Tpmo_solicitafecha ;
   }

   public void setTpmo_solicitafecha( String value )
   {
      gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Tpmo_solicitafecha = value ;
   }

   protected long gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Orig_identificador ;
   protected String gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Orig_descripcion ;
   protected String gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Tpmo_solicitanumero ;
   protected String gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Tpmo_solicitafecha ;
}

