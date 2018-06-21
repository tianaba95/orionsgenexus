/*
               File: StructSdtSDTPlacas
        Description: SDTPlacas
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:19.61
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTPlacas implements Cloneable, java.io.Serializable
{
   public StructSdtSDTPlacas( )
   {
      gxTv_SdtSDTPlacas_Elem_consecutivo = "" ;
      gxTv_SdtSDTPlacas_Cata_descripcion = "" ;
      gxTv_SdtSDTPlacas_Invd_numeroplaca = "" ;
      gxTv_SdtSDTPlacas_Invd_valoradquisicion = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTPlacas_Invd_placapadre = "" ;
      gxTv_SdtSDTPlacas_Invd_esplacapadre = "" ;
      gxTv_SdtSDTPlacas_Otros_costos_dev = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTPlacas_Costo_desmante = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTPlacas_Variable_vf = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTPlacas_Costo_total_dev = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTPlacas_Marca = "" ;
      gxTv_SdtSDTPlacas_Modelo = "" ;
      gxTv_SdtSDTPlacas_Serial = "" ;
      gxTv_SdtSDTPlacas_Observaciones = "" ;
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

   public String getElem_consecutivo( )
   {
      return gxTv_SdtSDTPlacas_Elem_consecutivo ;
   }

   public void setElem_consecutivo( String value )
   {
      gxTv_SdtSDTPlacas_Elem_consecutivo = value ;
   }

   public String getCata_descripcion( )
   {
      return gxTv_SdtSDTPlacas_Cata_descripcion ;
   }

   public void setCata_descripcion( String value )
   {
      gxTv_SdtSDTPlacas_Cata_descripcion = value ;
   }

   public String getInvd_numeroplaca( )
   {
      return gxTv_SdtSDTPlacas_Invd_numeroplaca ;
   }

   public void setInvd_numeroplaca( String value )
   {
      gxTv_SdtSDTPlacas_Invd_numeroplaca = value ;
   }

   public java.math.BigDecimal getInvd_valoradquisicion( )
   {
      return gxTv_SdtSDTPlacas_Invd_valoradquisicion ;
   }

   public void setInvd_valoradquisicion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTPlacas_Invd_valoradquisicion = value ;
   }

   public String getInvd_placapadre( )
   {
      return gxTv_SdtSDTPlacas_Invd_placapadre ;
   }

   public void setInvd_placapadre( String value )
   {
      gxTv_SdtSDTPlacas_Invd_placapadre = value ;
   }

   public String getInvd_esplacapadre( )
   {
      return gxTv_SdtSDTPlacas_Invd_esplacapadre ;
   }

   public void setInvd_esplacapadre( String value )
   {
      gxTv_SdtSDTPlacas_Invd_esplacapadre = value ;
   }

   public java.math.BigDecimal getOtros_costos_dev( )
   {
      return gxTv_SdtSDTPlacas_Otros_costos_dev ;
   }

   public void setOtros_costos_dev( java.math.BigDecimal value )
   {
      gxTv_SdtSDTPlacas_Otros_costos_dev = value ;
   }

   public java.math.BigDecimal getCosto_desmante( )
   {
      return gxTv_SdtSDTPlacas_Costo_desmante ;
   }

   public void setCosto_desmante( java.math.BigDecimal value )
   {
      gxTv_SdtSDTPlacas_Costo_desmante = value ;
   }

   public java.math.BigDecimal getVariable_vf( )
   {
      return gxTv_SdtSDTPlacas_Variable_vf ;
   }

   public void setVariable_vf( java.math.BigDecimal value )
   {
      gxTv_SdtSDTPlacas_Variable_vf = value ;
   }

   public short getVariable_i( )
   {
      return gxTv_SdtSDTPlacas_Variable_i ;
   }

   public void setVariable_i( short value )
   {
      gxTv_SdtSDTPlacas_Variable_i = value ;
   }

   public java.math.BigDecimal getCosto_total_dev( )
   {
      return gxTv_SdtSDTPlacas_Costo_total_dev ;
   }

   public void setCosto_total_dev( java.math.BigDecimal value )
   {
      gxTv_SdtSDTPlacas_Costo_total_dev = value ;
   }

   public short getVariable_n( )
   {
      return gxTv_SdtSDTPlacas_Variable_n ;
   }

   public void setVariable_n( short value )
   {
      gxTv_SdtSDTPlacas_Variable_n = value ;
   }

   public short getVida_util_inicial( )
   {
      return gxTv_SdtSDTPlacas_Vida_util_inicial ;
   }

   public void setVida_util_inicial( short value )
   {
      gxTv_SdtSDTPlacas_Vida_util_inicial = value ;
   }

   public short getVida_util_actual( )
   {
      return gxTv_SdtSDTPlacas_Vida_util_actual ;
   }

   public void setVida_util_actual( short value )
   {
      gxTv_SdtSDTPlacas_Vida_util_actual = value ;
   }

   public String getMarca( )
   {
      return gxTv_SdtSDTPlacas_Marca ;
   }

   public void setMarca( String value )
   {
      gxTv_SdtSDTPlacas_Marca = value ;
   }

   public String getModelo( )
   {
      return gxTv_SdtSDTPlacas_Modelo ;
   }

   public void setModelo( String value )
   {
      gxTv_SdtSDTPlacas_Modelo = value ;
   }

   public String getSerial( )
   {
      return gxTv_SdtSDTPlacas_Serial ;
   }

   public void setSerial( String value )
   {
      gxTv_SdtSDTPlacas_Serial = value ;
   }

   public String getObservaciones( )
   {
      return gxTv_SdtSDTPlacas_Observaciones ;
   }

   public void setObservaciones( String value )
   {
      gxTv_SdtSDTPlacas_Observaciones = value ;
   }

   public long getTran_entrada( )
   {
      return gxTv_SdtSDTPlacas_Tran_entrada ;
   }

   public void setTran_entrada( long value )
   {
      gxTv_SdtSDTPlacas_Tran_entrada = value ;
   }

   public int getNro_linea( )
   {
      return gxTv_SdtSDTPlacas_Nro_linea ;
   }

   public void setNro_linea( int value )
   {
      gxTv_SdtSDTPlacas_Nro_linea = value ;
   }

   protected short gxTv_SdtSDTPlacas_Variable_i ;
   protected short gxTv_SdtSDTPlacas_Variable_n ;
   protected short gxTv_SdtSDTPlacas_Vida_util_inicial ;
   protected short gxTv_SdtSDTPlacas_Vida_util_actual ;
   protected int gxTv_SdtSDTPlacas_Nro_linea ;
   protected long gxTv_SdtSDTPlacas_Tran_entrada ;
   protected String gxTv_SdtSDTPlacas_Invd_esplacapadre ;
   protected String gxTv_SdtSDTPlacas_Elem_consecutivo ;
   protected String gxTv_SdtSDTPlacas_Cata_descripcion ;
   protected String gxTv_SdtSDTPlacas_Invd_numeroplaca ;
   protected String gxTv_SdtSDTPlacas_Invd_placapadre ;
   protected String gxTv_SdtSDTPlacas_Marca ;
   protected String gxTv_SdtSDTPlacas_Modelo ;
   protected String gxTv_SdtSDTPlacas_Serial ;
   protected String gxTv_SdtSDTPlacas_Observaciones ;
   protected java.math.BigDecimal gxTv_SdtSDTPlacas_Invd_valoradquisicion ;
   protected java.math.BigDecimal gxTv_SdtSDTPlacas_Otros_costos_dev ;
   protected java.math.BigDecimal gxTv_SdtSDTPlacas_Costo_desmante ;
   protected java.math.BigDecimal gxTv_SdtSDTPlacas_Variable_vf ;
   protected java.math.BigDecimal gxTv_SdtSDTPlacas_Costo_total_dev ;
}

