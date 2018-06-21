/*
               File: StructSdtsdtsalidadevolutivo_detallesitem
        Description: sdtsalidadevolutivo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:20.21
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtsdtsalidadevolutivo_detallesitem implements Cloneable, java.io.Serializable
{
   public StructSdtsdtsalidadevolutivo_detallesitem( )
   {
      gxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetplacanumero = "" ;
      gxTv_Sdtsdtsalidadevolutivo_detallesitem_Elemconsecutivo = "" ;
      gxTv_Sdtsdtsalidadevolutivo_detallesitem_Elemdescripcion = "" ;
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
      return gxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetconsecutivo ;
   }

   public void setTdetconsecutivo( long value )
   {
      gxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetconsecutivo = value ;
   }

   public String getTdetplacanumero( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetplacanumero ;
   }

   public void setTdetplacanumero( String value )
   {
      gxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetplacanumero = value ;
   }

   public String getElemconsecutivo( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_detallesitem_Elemconsecutivo ;
   }

   public void setElemconsecutivo( String value )
   {
      gxTv_Sdtsdtsalidadevolutivo_detallesitem_Elemconsecutivo = value ;
   }

   public String getElemdescripcion( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_detallesitem_Elemdescripcion ;
   }

   public void setElemdescripcion( String value )
   {
      gxTv_Sdtsdtsalidadevolutivo_detallesitem_Elemdescripcion = value ;
   }

   public long getTdetcantidad( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetcantidad ;
   }

   public void setTdetcantidad( long value )
   {
      gxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetcantidad = value ;
   }

   public java.util.Vector getLista( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista ;
   }

   public void setLista( java.util.Vector value )
   {
      gxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista = value ;
   }

   protected long gxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetconsecutivo ;
   protected long gxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetcantidad ;
   protected String gxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetplacanumero ;
   protected String gxTv_Sdtsdtsalidadevolutivo_detallesitem_Elemconsecutivo ;
   protected String gxTv_Sdtsdtsalidadevolutivo_detallesitem_Elemdescripcion ;
   protected java.util.Vector gxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista=null ;
}

