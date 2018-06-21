/*
               File: StructSdtSDTInvDevoSel_SDTInvDevoSelItem
        Description: SDTInvDevoSel
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:18.56
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTInvDevoSel_SDTInvDevoSelItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTInvDevoSel_SDTInvDevoSelItem( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_numeroplaca = "" ;
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Elem_consecutivo = "" ;
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Cata_descripcion = "" ;
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_placapadre = "" ;
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Marca = "" ;
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Modelo = "" ;
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Serial = "" ;
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_fechaadquisicion = cal.getTime() ;
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Observaciones = "" ;
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Costo_total_dev = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_estado = "" ;
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_seleccion = "" ;
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

   public String getInvd_numeroplaca( )
   {
      return gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_numeroplaca ;
   }

   public void setInvd_numeroplaca( String value )
   {
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_numeroplaca = value ;
   }

   public String getElem_consecutivo( )
   {
      return gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Elem_consecutivo ;
   }

   public void setElem_consecutivo( String value )
   {
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Elem_consecutivo = value ;
   }

   public String getCata_descripcion( )
   {
      return gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Cata_descripcion ;
   }

   public void setCata_descripcion( String value )
   {
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Cata_descripcion = value ;
   }

   public String getInvd_placapadre( )
   {
      return gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_placapadre ;
   }

   public void setInvd_placapadre( String value )
   {
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_placapadre = value ;
   }

   public String getMarca( )
   {
      return gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Marca ;
   }

   public void setMarca( String value )
   {
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Marca = value ;
   }

   public String getModelo( )
   {
      return gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Modelo ;
   }

   public void setModelo( String value )
   {
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Modelo = value ;
   }

   public String getSerial( )
   {
      return gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Serial ;
   }

   public void setSerial( String value )
   {
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Serial = value ;
   }

   public java.util.Date getInvd_fechaadquisicion( )
   {
      return gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_fechaadquisicion ;
   }

   public void setInvd_fechaadquisicion( java.util.Date value )
   {
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_fechaadquisicion = value ;
   }

   public String getObservaciones( )
   {
      return gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Observaciones ;
   }

   public void setObservaciones( String value )
   {
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Observaciones = value ;
   }

   public java.math.BigDecimal getCosto_total_dev( )
   {
      return gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Costo_total_dev ;
   }

   public void setCosto_total_dev( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Costo_total_dev = value ;
   }

   public String getInvd_estado( )
   {
      return gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_estado ;
   }

   public void setInvd_estado( String value )
   {
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_estado = value ;
   }

   public String getInvd_seleccion( )
   {
      return gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_seleccion ;
   }

   public void setInvd_seleccion( String value )
   {
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_seleccion = value ;
   }

   public long getTran_entrada( )
   {
      return gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_entrada ;
   }

   public void setTran_entrada( long value )
   {
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_entrada = value ;
   }

   public int getTran_nrolinea( )
   {
      return gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_nrolinea ;
   }

   public void setTran_nrolinea( int value )
   {
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_nrolinea = value ;
   }

   public long getTran_consecutivocc( )
   {
      return gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_consecutivocc ;
   }

   public void setTran_consecutivocc( long value )
   {
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_consecutivocc = value ;
   }

   protected int gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_nrolinea ;
   protected long gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_entrada ;
   protected long gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_consecutivocc ;
   protected String gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_seleccion ;
   protected String gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_numeroplaca ;
   protected String gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Elem_consecutivo ;
   protected String gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Cata_descripcion ;
   protected String gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_placapadre ;
   protected String gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Marca ;
   protected String gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Modelo ;
   protected String gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Serial ;
   protected String gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Observaciones ;
   protected String gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_estado ;
   protected java.util.Date gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_fechaadquisicion ;
   protected java.math.BigDecimal gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Costo_total_dev ;
}

