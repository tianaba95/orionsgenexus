/*
               File: StructSdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem
        Description: SDTCuentaResponsabilidad
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:17.23
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_codigomovimiento = "" ;
      gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_fecharatificacion = cal.getTime() ;
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

   public long getTran_id( )
   {
      return gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_id ;
   }

   public void setTran_id( long value )
   {
      gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_id = value ;
   }

   public long getTran_centrocostoid( )
   {
      return gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_centrocostoid ;
   }

   public void setTran_centrocostoid( long value )
   {
      gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_centrocostoid = value ;
   }

   public long getTran_regionid( )
   {
      return gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_regionid ;
   }

   public void setTran_regionid( long value )
   {
      gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_regionid = value ;
   }

   public String getTran_codigomovimiento( )
   {
      return gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_codigomovimiento ;
   }

   public void setTran_codigomovimiento( String value )
   {
      gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_codigomovimiento = value ;
   }

   public long getTran_idcuentadante( )
   {
      return gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_idcuentadante ;
   }

   public void setTran_idcuentadante( long value )
   {
      gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_idcuentadante = value ;
   }

   public java.util.Date getTran_fecharatificacion( )
   {
      return gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_fecharatificacion ;
   }

   public void setTran_fecharatificacion( java.util.Date value )
   {
      gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_fecharatificacion = value ;
   }

   public long getTran_consecutivocc( )
   {
      return gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_consecutivocc ;
   }

   public void setTran_consecutivocc( long value )
   {
      gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_consecutivocc = value ;
   }

   public short getTran_tabla( )
   {
      return gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_tabla ;
   }

   public void setTran_tabla( short value )
   {
      gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_tabla = value ;
   }

   protected short gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_tabla ;
   protected long gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_id ;
   protected long gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_centrocostoid ;
   protected long gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_regionid ;
   protected long gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_idcuentadante ;
   protected long gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_consecutivocc ;
   protected String gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_codigomovimiento ;
   protected java.util.Date gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_fecharatificacion ;
}

