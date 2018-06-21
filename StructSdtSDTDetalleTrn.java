/*
               File: StructSdtSDTDetalleTrn
        Description: SDTDetalleTrn
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:17.43
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTDetalleTrn implements Cloneable, java.io.Serializable
{
   public StructSdtSDTDetalleTrn( )
   {
      gxTv_SdtSDTDetalleTrn_Elem_consecutivo = "" ;
      gxTv_SdtSDTDetalleTrn_Elem_descripcion = "" ;
      gxTv_SdtSDTDetalleTrn_Cata_descripcion = "" ;
      gxTv_SdtSDTDetalleTrn_Tdet_valorunitario = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDetalleTrn_Tdet_valortotal = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDetalleTrn_Tdet_placanumero = "" ;
      gxTv_SdtSDTDetalleTrn_Tdet_observaciones = "" ;
      gxTv_SdtSDTDetalleTrn_Tdet_placapadre = "" ;
      gxTv_SdtSDTDetalleTrn_Tdet_espadre = "" ;
      gxTv_SdtSDTDetalleTrn_Tdet_atributos = "" ;
      gxTv_SdtSDTDetalleTrn_Tdet_valor_presente = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDetalleTrn_Tdet_valor_futuro = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDetalleTrn_Tdet_otros_costos = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDetalleTrn_Tdet_placarecuperada = "" ;
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
      return gxTv_SdtSDTDetalleTrn_Tran_id ;
   }

   public void setTran_id( long value )
   {
      gxTv_SdtSDTDetalleTrn_Tran_id = value ;
   }

   public long getTdet_consecutivo( )
   {
      return gxTv_SdtSDTDetalleTrn_Tdet_consecutivo ;
   }

   public void setTdet_consecutivo( long value )
   {
      gxTv_SdtSDTDetalleTrn_Tdet_consecutivo = value ;
   }

   public String getElem_consecutivo( )
   {
      return gxTv_SdtSDTDetalleTrn_Elem_consecutivo ;
   }

   public void setElem_consecutivo( String value )
   {
      gxTv_SdtSDTDetalleTrn_Elem_consecutivo = value ;
   }

   public String getElem_descripcion( )
   {
      return gxTv_SdtSDTDetalleTrn_Elem_descripcion ;
   }

   public void setElem_descripcion( String value )
   {
      gxTv_SdtSDTDetalleTrn_Elem_descripcion = value ;
   }

   public String getCata_descripcion( )
   {
      return gxTv_SdtSDTDetalleTrn_Cata_descripcion ;
   }

   public void setCata_descripcion( String value )
   {
      gxTv_SdtSDTDetalleTrn_Cata_descripcion = value ;
   }

   public long getTdet_cantidad( )
   {
      return gxTv_SdtSDTDetalleTrn_Tdet_cantidad ;
   }

   public void setTdet_cantidad( long value )
   {
      gxTv_SdtSDTDetalleTrn_Tdet_cantidad = value ;
   }

   public java.math.BigDecimal getTdet_valorunitario( )
   {
      return gxTv_SdtSDTDetalleTrn_Tdet_valorunitario ;
   }

   public void setTdet_valorunitario( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDetalleTrn_Tdet_valorunitario = value ;
   }

   public java.math.BigDecimal getTdet_valortotal( )
   {
      return gxTv_SdtSDTDetalleTrn_Tdet_valortotal ;
   }

   public void setTdet_valortotal( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDetalleTrn_Tdet_valortotal = value ;
   }

   public String getTdet_placanumero( )
   {
      return gxTv_SdtSDTDetalleTrn_Tdet_placanumero ;
   }

   public void setTdet_placanumero( String value )
   {
      gxTv_SdtSDTDetalleTrn_Tdet_placanumero = value ;
   }

   public String getTdet_observaciones( )
   {
      return gxTv_SdtSDTDetalleTrn_Tdet_observaciones ;
   }

   public void setTdet_observaciones( String value )
   {
      gxTv_SdtSDTDetalleTrn_Tdet_observaciones = value ;
   }

   public String getTdet_placapadre( )
   {
      return gxTv_SdtSDTDetalleTrn_Tdet_placapadre ;
   }

   public void setTdet_placapadre( String value )
   {
      gxTv_SdtSDTDetalleTrn_Tdet_placapadre = value ;
   }

   public String getTdet_espadre( )
   {
      return gxTv_SdtSDTDetalleTrn_Tdet_espadre ;
   }

   public void setTdet_espadre( String value )
   {
      gxTv_SdtSDTDetalleTrn_Tdet_espadre = value ;
   }

   public String getTdet_atributos( )
   {
      return gxTv_SdtSDTDetalleTrn_Tdet_atributos ;
   }

   public void setTdet_atributos( String value )
   {
      gxTv_SdtSDTDetalleTrn_Tdet_atributos = value ;
   }

   public java.math.BigDecimal getTdet_valor_presente( )
   {
      return gxTv_SdtSDTDetalleTrn_Tdet_valor_presente ;
   }

   public void setTdet_valor_presente( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDetalleTrn_Tdet_valor_presente = value ;
   }

   public java.math.BigDecimal getTdet_valor_futuro( )
   {
      return gxTv_SdtSDTDetalleTrn_Tdet_valor_futuro ;
   }

   public void setTdet_valor_futuro( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDetalleTrn_Tdet_valor_futuro = value ;
   }

   public short getTdet_taza( )
   {
      return gxTv_SdtSDTDetalleTrn_Tdet_taza ;
   }

   public void setTdet_taza( short value )
   {
      gxTv_SdtSDTDetalleTrn_Tdet_taza = value ;
   }

   public byte getTdet_plazo_n( )
   {
      return gxTv_SdtSDTDetalleTrn_Tdet_plazo_n ;
   }

   public void setTdet_plazo_n( byte value )
   {
      gxTv_SdtSDTDetalleTrn_Tdet_plazo_n = value ;
   }

   public java.math.BigDecimal getTdet_otros_costos( )
   {
      return gxTv_SdtSDTDetalleTrn_Tdet_otros_costos ;
   }

   public void setTdet_otros_costos( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDetalleTrn_Tdet_otros_costos = value ;
   }

   public short getTdet_agrupado( )
   {
      return gxTv_SdtSDTDetalleTrn_Tdet_agrupado ;
   }

   public void setTdet_agrupado( short value )
   {
      gxTv_SdtSDTDetalleTrn_Tdet_agrupado = value ;
   }

   public String getTdet_placarecuperada( )
   {
      return gxTv_SdtSDTDetalleTrn_Tdet_placarecuperada ;
   }

   public void setTdet_placarecuperada( String value )
   {
      gxTv_SdtSDTDetalleTrn_Tdet_placarecuperada = value ;
   }

   protected byte gxTv_SdtSDTDetalleTrn_Tdet_plazo_n ;
   protected short gxTv_SdtSDTDetalleTrn_Tdet_taza ;
   protected short gxTv_SdtSDTDetalleTrn_Tdet_agrupado ;
   protected long gxTv_SdtSDTDetalleTrn_Tran_id ;
   protected long gxTv_SdtSDTDetalleTrn_Tdet_consecutivo ;
   protected long gxTv_SdtSDTDetalleTrn_Tdet_cantidad ;
   protected String gxTv_SdtSDTDetalleTrn_Elem_consecutivo ;
   protected String gxTv_SdtSDTDetalleTrn_Elem_descripcion ;
   protected String gxTv_SdtSDTDetalleTrn_Cata_descripcion ;
   protected String gxTv_SdtSDTDetalleTrn_Tdet_placanumero ;
   protected String gxTv_SdtSDTDetalleTrn_Tdet_observaciones ;
   protected String gxTv_SdtSDTDetalleTrn_Tdet_placapadre ;
   protected String gxTv_SdtSDTDetalleTrn_Tdet_espadre ;
   protected String gxTv_SdtSDTDetalleTrn_Tdet_atributos ;
   protected String gxTv_SdtSDTDetalleTrn_Tdet_placarecuperada ;
   protected java.math.BigDecimal gxTv_SdtSDTDetalleTrn_Tdet_valorunitario ;
   protected java.math.BigDecimal gxTv_SdtSDTDetalleTrn_Tdet_valortotal ;
   protected java.math.BigDecimal gxTv_SdtSDTDetalleTrn_Tdet_valor_presente ;
   protected java.math.BigDecimal gxTv_SdtSDTDetalleTrn_Tdet_valor_futuro ;
   protected java.math.BigDecimal gxTv_SdtSDTDetalleTrn_Tdet_otros_costos ;
}

