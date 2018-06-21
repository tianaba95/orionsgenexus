/*
               File: StructSdtsdtsalidaconsumo_detallesitem
        Description: sdtsalidaconsumo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:19.99
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtsdtsalidaconsumo_detallesitem implements Cloneable, java.io.Serializable
{
   public StructSdtsdtsalidaconsumo_detallesitem( )
   {
      gxTv_Sdtsdtsalidaconsumo_detallesitem_Elemconsecutivo = "" ;
      gxTv_Sdtsdtsalidaconsumo_detallesitem_Elemdescripcion = "" ;
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
      return gxTv_Sdtsdtsalidaconsumo_detallesitem_Tdetconsecutivo ;
   }

   public void setTdetconsecutivo( long value )
   {
      gxTv_Sdtsdtsalidaconsumo_detallesitem_Tdetconsecutivo = value ;
   }

   public String getElemconsecutivo( )
   {
      return gxTv_Sdtsdtsalidaconsumo_detallesitem_Elemconsecutivo ;
   }

   public void setElemconsecutivo( String value )
   {
      gxTv_Sdtsdtsalidaconsumo_detallesitem_Elemconsecutivo = value ;
   }

   public String getElemdescripcion( )
   {
      return gxTv_Sdtsdtsalidaconsumo_detallesitem_Elemdescripcion ;
   }

   public void setElemdescripcion( String value )
   {
      gxTv_Sdtsdtsalidaconsumo_detallesitem_Elemdescripcion = value ;
   }

   public long getTdetcantidad( )
   {
      return gxTv_Sdtsdtsalidaconsumo_detallesitem_Tdetcantidad ;
   }

   public void setTdetcantidad( long value )
   {
      gxTv_Sdtsdtsalidaconsumo_detallesitem_Tdetcantidad = value ;
   }

   public java.util.Vector getLista( )
   {
      return gxTv_Sdtsdtsalidaconsumo_detallesitem_Lista ;
   }

   public void setLista( java.util.Vector value )
   {
      gxTv_Sdtsdtsalidaconsumo_detallesitem_Lista = value ;
   }

   protected long gxTv_Sdtsdtsalidaconsumo_detallesitem_Tdetconsecutivo ;
   protected long gxTv_Sdtsdtsalidaconsumo_detallesitem_Tdetcantidad ;
   protected String gxTv_Sdtsdtsalidaconsumo_detallesitem_Elemconsecutivo ;
   protected String gxTv_Sdtsdtsalidaconsumo_detallesitem_Elemdescripcion ;
   protected java.util.Vector gxTv_Sdtsdtsalidaconsumo_detallesitem_Lista=null ;
}

