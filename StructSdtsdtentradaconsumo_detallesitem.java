/*
               File: StructSdtsdtentradaconsumo_detallesitem
        Description: sdtentradaconsumo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:17.90
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtsdtentradaconsumo_detallesitem implements Cloneable, java.io.Serializable
{
   public StructSdtsdtentradaconsumo_detallesitem( )
   {
      gxTv_Sdtsdtentradaconsumo_detallesitem_Elemconsecutivo = "" ;
      gxTv_Sdtsdtentradaconsumo_detallesitem_Elemdescripcion = "" ;
      gxTv_Sdtsdtentradaconsumo_detallesitem_Tdetvalortotal = new java.math.BigDecimal(0) ;
      gxTv_Sdtsdtentradaconsumo_detallesitem_Marca = "" ;
      gxTv_Sdtsdtentradaconsumo_detallesitem_Serial = "" ;
      gxTv_Sdtsdtentradaconsumo_detallesitem_Modelo = "" ;
      gxTv_Sdtsdtentradaconsumo_detallesitem_Otroscostos = new java.math.BigDecimal(0) ;
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

   public long getTdetconsecutivo( )
   {
      return gxTv_Sdtsdtentradaconsumo_detallesitem_Tdetconsecutivo ;
   }

   public void setTdetconsecutivo( long value )
   {
      gxTv_Sdtsdtentradaconsumo_detallesitem_Tdetconsecutivo = value ;
   }

   public long getTdetcantidad( )
   {
      return gxTv_Sdtsdtentradaconsumo_detallesitem_Tdetcantidad ;
   }

   public void setTdetcantidad( long value )
   {
      gxTv_Sdtsdtentradaconsumo_detallesitem_Tdetcantidad = value ;
   }

   public String getElemconsecutivo( )
   {
      return gxTv_Sdtsdtentradaconsumo_detallesitem_Elemconsecutivo ;
   }

   public void setElemconsecutivo( String value )
   {
      gxTv_Sdtsdtentradaconsumo_detallesitem_Elemconsecutivo = value ;
   }

   public String getElemdescripcion( )
   {
      return gxTv_Sdtsdtentradaconsumo_detallesitem_Elemdescripcion ;
   }

   public void setElemdescripcion( String value )
   {
      gxTv_Sdtsdtentradaconsumo_detallesitem_Elemdescripcion = value ;
   }

   public java.math.BigDecimal getTdetvalortotal( )
   {
      return gxTv_Sdtsdtentradaconsumo_detallesitem_Tdetvalortotal ;
   }

   public void setTdetvalortotal( java.math.BigDecimal value )
   {
      gxTv_Sdtsdtentradaconsumo_detallesitem_Tdetvalortotal = value ;
   }

   public String getMarca( )
   {
      return gxTv_Sdtsdtentradaconsumo_detallesitem_Marca ;
   }

   public void setMarca( String value )
   {
      gxTv_Sdtsdtentradaconsumo_detallesitem_Marca = value ;
   }

   public String getSerial( )
   {
      return gxTv_Sdtsdtentradaconsumo_detallesitem_Serial ;
   }

   public void setSerial( String value )
   {
      gxTv_Sdtsdtentradaconsumo_detallesitem_Serial = value ;
   }

   public String getModelo( )
   {
      return gxTv_Sdtsdtentradaconsumo_detallesitem_Modelo ;
   }

   public void setModelo( String value )
   {
      gxTv_Sdtsdtentradaconsumo_detallesitem_Modelo = value ;
   }

   public java.math.BigDecimal getOtroscostos( )
   {
      return gxTv_Sdtsdtentradaconsumo_detallesitem_Otroscostos ;
   }

   public void setOtroscostos( java.math.BigDecimal value )
   {
      gxTv_Sdtsdtentradaconsumo_detallesitem_Otroscostos = value ;
   }

   public java.util.Vector getLista( )
   {
      return gxTv_Sdtsdtentradaconsumo_detallesitem_Lista ;
   }

   public void setLista( java.util.Vector value )
   {
      gxTv_Sdtsdtentradaconsumo_detallesitem_Lista = value ;
   }

   protected long gxTv_Sdtsdtentradaconsumo_detallesitem_Tdetconsecutivo ;
   protected long gxTv_Sdtsdtentradaconsumo_detallesitem_Tdetcantidad ;
   protected String gxTv_Sdtsdtentradaconsumo_detallesitem_Elemconsecutivo ;
   protected String gxTv_Sdtsdtentradaconsumo_detallesitem_Elemdescripcion ;
   protected String gxTv_Sdtsdtentradaconsumo_detallesitem_Marca ;
   protected String gxTv_Sdtsdtentradaconsumo_detallesitem_Serial ;
   protected String gxTv_Sdtsdtentradaconsumo_detallesitem_Modelo ;
   protected java.math.BigDecimal gxTv_Sdtsdtentradaconsumo_detallesitem_Tdetvalortotal ;
   protected java.math.BigDecimal gxTv_Sdtsdtentradaconsumo_detallesitem_Otroscostos ;
   protected java.util.Vector gxTv_Sdtsdtentradaconsumo_detallesitem_Lista=null ;
}

