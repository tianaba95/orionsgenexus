/*
               File: StructSdtSDTInvenConsumo_SDTInvenConsumoItem
        Description: SDTInvenConsumo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:18.73
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTInvenConsumo_SDTInvenConsumoItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTInvenConsumo_SDTInvenConsumoItem( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_modulo = "" ;
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_codigo = "" ;
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Bode_codigo = "" ;
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_consecutivo = "" ;
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_descripcion = "" ;
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cata_codigo = "" ;
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cata_descripcion = "" ;
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Valor_unitario = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Otros_costos = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Costo_total = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Descrip_atributos = "" ;
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_fecharatificacion = cal.getTime() ;
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Unimed_des = "" ;
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Observaciones = "" ;
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Marca = "" ;
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Modelo = "" ;
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Serial = "" ;
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

   public long getRegional( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Regional ;
   }

   public void setRegional( long value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Regional = value ;
   }

   public long getCentro_id( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Centro_id ;
   }

   public void setCentro_id( long value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Centro_id = value ;
   }

   public String getAlma_modulo( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_modulo ;
   }

   public void setAlma_modulo( String value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_modulo = value ;
   }

   public String getAlma_codigo( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_codigo ;
   }

   public void setAlma_codigo( String value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_codigo = value ;
   }

   public String getBode_codigo( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Bode_codigo ;
   }

   public void setBode_codigo( String value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Bode_codigo = value ;
   }

   public long getTrans_id( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Trans_id ;
   }

   public void setTrans_id( long value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Trans_id = value ;
   }

   public String getElem_consecutivo( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_consecutivo ;
   }

   public void setElem_consecutivo( String value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_consecutivo = value ;
   }

   public int getNum_linea( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Num_linea ;
   }

   public void setNum_linea( int value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Num_linea = value ;
   }

   public String getElem_descripcion( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_descripcion ;
   }

   public void setElem_descripcion( String value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_descripcion = value ;
   }

   public String getCata_codigo( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cata_codigo ;
   }

   public void setCata_codigo( String value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cata_codigo = value ;
   }

   public String getCata_descripcion( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cata_descripcion ;
   }

   public void setCata_descripcion( String value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cata_descripcion = value ;
   }

   public int getCantidad_transito( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_transito ;
   }

   public void setCantidad_transito( int value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_transito = value ;
   }

   public java.math.BigDecimal getValor_unitario( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Valor_unitario ;
   }

   public void setValor_unitario( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Valor_unitario = value ;
   }

   public java.math.BigDecimal getOtros_costos( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Otros_costos ;
   }

   public void setOtros_costos( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Otros_costos = value ;
   }

   public java.math.BigDecimal getCosto_total( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Costo_total ;
   }

   public void setCosto_total( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Costo_total = value ;
   }

   public String getDescrip_atributos( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Descrip_atributos ;
   }

   public void setDescrip_atributos( String value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Descrip_atributos = value ;
   }

   public int getCantidad_solicitada( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_solicitada ;
   }

   public void setCantidad_solicitada( int value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_solicitada = value ;
   }

   public java.util.Date getTran_fecharatificacion( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_fecharatificacion ;
   }

   public void setTran_fecharatificacion( java.util.Date value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_fecharatificacion = value ;
   }

   public int getCantidad_diponible( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_diponible ;
   }

   public void setCantidad_diponible( int value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_diponible = value ;
   }

   public int getUnimed_cod( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Unimed_cod ;
   }

   public void setUnimed_cod( int value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Unimed_cod = value ;
   }

   public String getUnimed_des( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Unimed_des ;
   }

   public void setUnimed_des( String value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Unimed_des = value ;
   }

   public String getObservaciones( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Observaciones ;
   }

   public void setObservaciones( String value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Observaciones = value ;
   }

   public String getMarca( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Marca ;
   }

   public void setMarca( String value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Marca = value ;
   }

   public String getModelo( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Modelo ;
   }

   public void setModelo( String value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Modelo = value ;
   }

   public String getSerial( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Serial ;
   }

   public void setSerial( String value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Serial = value ;
   }

   public long getTran_consecutivo( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_consecutivo ;
   }

   public void setTran_consecutivo( long value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_consecutivo = value ;
   }

   protected int gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Num_linea ;
   protected int gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_transito ;
   protected int gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_solicitada ;
   protected int gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_diponible ;
   protected int gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Unimed_cod ;
   protected long gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Regional ;
   protected long gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Centro_id ;
   protected long gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Trans_id ;
   protected long gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_consecutivo ;
   protected String gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Descrip_atributos ;
   protected String gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_modulo ;
   protected String gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_codigo ;
   protected String gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Bode_codigo ;
   protected String gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_consecutivo ;
   protected String gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_descripcion ;
   protected String gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cata_codigo ;
   protected String gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cata_descripcion ;
   protected String gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Unimed_des ;
   protected String gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Observaciones ;
   protected String gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Marca ;
   protected String gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Modelo ;
   protected String gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Serial ;
   protected java.math.BigDecimal gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Valor_unitario ;
   protected java.math.BigDecimal gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Otros_costos ;
   protected java.math.BigDecimal gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Costo_total ;
   protected java.util.Date gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_fecharatificacion ;
}

