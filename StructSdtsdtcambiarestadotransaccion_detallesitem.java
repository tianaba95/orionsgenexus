/*
               File: StructSdtsdtcambiarestadotransaccion_detallesitem
        Description: sdtcambiarestadotransaccion
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:16.87
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtsdtcambiarestadotransaccion_detallesitem implements Cloneable, java.io.Serializable
{
   public StructSdtsdtcambiarestadotransaccion_detallesitem( )
   {
      gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Elemconsecutivo = "" ;
      gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetplacanumero = "" ;
      gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetvalortotal = new java.math.BigDecimal(0) ;
      gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Trancentrocostocodigo = "" ;
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

   public String getElemconsecutivo( )
   {
      return gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Elemconsecutivo ;
   }

   public void setElemconsecutivo( String value )
   {
      gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Elemconsecutivo = value ;
   }

   public String getTdetplacanumero( )
   {
      return gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetplacanumero ;
   }

   public void setTdetplacanumero( String value )
   {
      gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetplacanumero = value ;
   }

   public long getTdetconsecutivo( )
   {
      return gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetconsecutivo ;
   }

   public void setTdetconsecutivo( long value )
   {
      gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetconsecutivo = value ;
   }

   public java.math.BigDecimal getTdetvalortotal( )
   {
      return gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetvalortotal ;
   }

   public void setTdetvalortotal( java.math.BigDecimal value )
   {
      gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetvalortotal = value ;
   }

   public short getTdetcantidad( )
   {
      return gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetcantidad ;
   }

   public void setTdetcantidad( short value )
   {
      gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetcantidad = value ;
   }

   public String getTrancentrocostocodigo( )
   {
      return gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Trancentrocostocodigo ;
   }

   public void setTrancentrocostocodigo( String value )
   {
      gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Trancentrocostocodigo = value ;
   }

   protected short gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetcantidad ;
   protected long gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetconsecutivo ;
   protected String gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Elemconsecutivo ;
   protected String gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetplacanumero ;
   protected String gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Trancentrocostocodigo ;
   protected java.math.BigDecimal gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetvalortotal ;
}

