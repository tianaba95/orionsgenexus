/*
               File: StructSdtSDTTipoMovimiento_SDTTipoMovimientoItem
        Description: SDTTipoMovimiento
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:20.29
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTTipoMovimiento_SDTTipoMovimientoItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTTipoMovimiento_SDTTipoMovimientoItem( )
   {
      gxTv_SdtSDTTipoMovimiento_SDTTipoMovimientoItem_Tran_codigomovimiento = "" ;
      gxTv_SdtSDTTipoMovimiento_SDTTipoMovimientoItem_Tran_descripcionmovimiento = "" ;
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

   public String getTran_codigomovimiento( )
   {
      return gxTv_SdtSDTTipoMovimiento_SDTTipoMovimientoItem_Tran_codigomovimiento ;
   }

   public void setTran_codigomovimiento( String value )
   {
      gxTv_SdtSDTTipoMovimiento_SDTTipoMovimientoItem_Tran_codigomovimiento = value ;
   }

   public String getTran_descripcionmovimiento( )
   {
      return gxTv_SdtSDTTipoMovimiento_SDTTipoMovimientoItem_Tran_descripcionmovimiento ;
   }

   public void setTran_descripcionmovimiento( String value )
   {
      gxTv_SdtSDTTipoMovimiento_SDTTipoMovimientoItem_Tran_descripcionmovimiento = value ;
   }

   protected String gxTv_SdtSDTTipoMovimiento_SDTTipoMovimientoItem_Tran_codigomovimiento ;
   protected String gxTv_SdtSDTTipoMovimiento_SDTTipoMovimientoItem_Tran_descripcionmovimiento ;
}

