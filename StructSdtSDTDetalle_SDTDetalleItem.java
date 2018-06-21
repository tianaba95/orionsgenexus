/*
               File: StructSdtSDTDetalle_SDTDetalleItem
        Description: SDTDetalle
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:17.33
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTDetalle_SDTDetalleItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTDetalle_SDTDetalleItem( )
   {
      gxTv_SdtSDTDetalle_SDTDetalleItem_Placa = "" ;
      gxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivo = "" ;
      gxTv_SdtSDTDetalle_SDTDetalleItem_Descripcion = "" ;
      gxTv_SdtSDTDetalle_SDTDetalleItem_Placapadreactual = "" ;
      gxTv_SdtSDTDetalle_SDTDetalleItem_Placapadrenueva = "" ;
      gxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivoactual = "" ;
      gxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivonuevo = "" ;
      gxTv_SdtSDTDetalle_SDTDetalleItem_Atributoactual = "" ;
      gxTv_SdtSDTDetalle_SDTDetalleItem_Atributonuevo = "" ;
      gxTv_SdtSDTDetalle_SDTDetalleItem_Valoractual = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDetalle_SDTDetalleItem_Valornuevo = new java.math.BigDecimal(0) ;
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

   public String getPlaca( )
   {
      return gxTv_SdtSDTDetalle_SDTDetalleItem_Placa ;
   }

   public void setPlaca( String value )
   {
      gxTv_SdtSDTDetalle_SDTDetalleItem_Placa = value ;
   }

   public String getConsecutivo( )
   {
      return gxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivo ;
   }

   public void setConsecutivo( String value )
   {
      gxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivo = value ;
   }

   public String getDescripcion( )
   {
      return gxTv_SdtSDTDetalle_SDTDetalleItem_Descripcion ;
   }

   public void setDescripcion( String value )
   {
      gxTv_SdtSDTDetalle_SDTDetalleItem_Descripcion = value ;
   }

   public String getPlacapadreactual( )
   {
      return gxTv_SdtSDTDetalle_SDTDetalleItem_Placapadreactual ;
   }

   public void setPlacapadreactual( String value )
   {
      gxTv_SdtSDTDetalle_SDTDetalleItem_Placapadreactual = value ;
   }

   public String getPlacapadrenueva( )
   {
      return gxTv_SdtSDTDetalle_SDTDetalleItem_Placapadrenueva ;
   }

   public void setPlacapadrenueva( String value )
   {
      gxTv_SdtSDTDetalle_SDTDetalleItem_Placapadrenueva = value ;
   }

   public long getCantidadactual( )
   {
      return gxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadactual ;
   }

   public void setCantidadactual( long value )
   {
      gxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadactual = value ;
   }

   public long getCantidadnueva( )
   {
      return gxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadnueva ;
   }

   public void setCantidadnueva( long value )
   {
      gxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadnueva = value ;
   }

   public String getConsecutivoactual( )
   {
      return gxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivoactual ;
   }

   public void setConsecutivoactual( String value )
   {
      gxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivoactual = value ;
   }

   public String getConsecutivonuevo( )
   {
      return gxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivonuevo ;
   }

   public void setConsecutivonuevo( String value )
   {
      gxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivonuevo = value ;
   }

   public int getNro_linea( )
   {
      return gxTv_SdtSDTDetalle_SDTDetalleItem_Nro_linea ;
   }

   public void setNro_linea( int value )
   {
      gxTv_SdtSDTDetalle_SDTDetalleItem_Nro_linea = value ;
   }

   public String getAtributoactual( )
   {
      return gxTv_SdtSDTDetalle_SDTDetalleItem_Atributoactual ;
   }

   public void setAtributoactual( String value )
   {
      gxTv_SdtSDTDetalle_SDTDetalleItem_Atributoactual = value ;
   }

   public String getAtributonuevo( )
   {
      return gxTv_SdtSDTDetalle_SDTDetalleItem_Atributonuevo ;
   }

   public void setAtributonuevo( String value )
   {
      gxTv_SdtSDTDetalle_SDTDetalleItem_Atributonuevo = value ;
   }

   public java.math.BigDecimal getValoractual( )
   {
      return gxTv_SdtSDTDetalle_SDTDetalleItem_Valoractual ;
   }

   public void setValoractual( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDetalle_SDTDetalleItem_Valoractual = value ;
   }

   public java.math.BigDecimal getValornuevo( )
   {
      return gxTv_SdtSDTDetalle_SDTDetalleItem_Valornuevo ;
   }

   public void setValornuevo( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDetalle_SDTDetalleItem_Valornuevo = value ;
   }

   protected int gxTv_SdtSDTDetalle_SDTDetalleItem_Nro_linea ;
   protected long gxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadactual ;
   protected long gxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadnueva ;
   protected String gxTv_SdtSDTDetalle_SDTDetalleItem_Placa ;
   protected String gxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivo ;
   protected String gxTv_SdtSDTDetalle_SDTDetalleItem_Descripcion ;
   protected String gxTv_SdtSDTDetalle_SDTDetalleItem_Placapadreactual ;
   protected String gxTv_SdtSDTDetalle_SDTDetalleItem_Placapadrenueva ;
   protected String gxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivoactual ;
   protected String gxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivonuevo ;
   protected String gxTv_SdtSDTDetalle_SDTDetalleItem_Atributoactual ;
   protected String gxTv_SdtSDTDetalle_SDTDetalleItem_Atributonuevo ;
   protected java.math.BigDecimal gxTv_SdtSDTDetalle_SDTDetalleItem_Valoractual ;
   protected java.math.BigDecimal gxTv_SdtSDTDetalle_SDTDetalleItem_Valornuevo ;
}

