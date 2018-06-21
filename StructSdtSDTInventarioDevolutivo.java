/*
               File: StructSdtSDTInventarioDevolutivo
        Description: SDTInventarioDevolutivo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:18.85
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTInventarioDevolutivo implements Cloneable, java.io.Serializable
{
   public StructSdtSDTInventarioDevolutivo( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTInventarioDevolutivo_Invd_numeroplaca = "" ;
      gxTv_SdtSDTInventarioDevolutivo_Invd_descripciondevolutivo = "" ;
      gxTv_SdtSDTInventarioDevolutivo_Invd_moduloalmacen = "" ;
      gxTv_SdtSDTInventarioDevolutivo_Invd_almacencodigo = "" ;
      gxTv_SdtSDTInventarioDevolutivo_Invd_bodegacodigo = "" ;
      gxTv_SdtSDTInventarioDevolutivo_Invd_serial = "" ;
      gxTv_SdtSDTInventarioDevolutivo_Invd_marca = "" ;
      gxTv_SdtSDTInventarioDevolutivo_Invd_modelo = "" ;
      gxTv_SdtSDTInventarioDevolutivo_Invd_estado = "" ;
      gxTv_SdtSDTInventarioDevolutivo_Invd_valoradquisicion = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInventarioDevolutivo_Invd_fechaadquisicion = cal.getTime() ;
      gxTv_SdtSDTInventarioDevolutivo_Invd_placapadre = "" ;
      gxTv_SdtSDTInventarioDevolutivo_Invd_esplacapadre = "" ;
      gxTv_SdtSDTInventarioDevolutivo_Invd_fechaservicio = cal.getTime() ;
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
      return gxTv_SdtSDTInventarioDevolutivo_Invd_numeroplaca ;
   }

   public void setInvd_numeroplaca( String value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_numeroplaca = value ;
   }

   public String getInvd_descripciondevolutivo( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Invd_descripciondevolutivo ;
   }

   public void setInvd_descripciondevolutivo( String value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_descripciondevolutivo = value ;
   }

   public long getInvd_regionalid( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Invd_regionalid ;
   }

   public void setInvd_regionalid( long value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_regionalid = value ;
   }

   public long getInvd_centrocostoid( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Invd_centrocostoid ;
   }

   public void setInvd_centrocostoid( long value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_centrocostoid = value ;
   }

   public String getInvd_moduloalmacen( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Invd_moduloalmacen ;
   }

   public void setInvd_moduloalmacen( String value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_moduloalmacen = value ;
   }

   public String getInvd_almacencodigo( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Invd_almacencodigo ;
   }

   public void setInvd_almacencodigo( String value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_almacencodigo = value ;
   }

   public String getInvd_bodegacodigo( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Invd_bodegacodigo ;
   }

   public void setInvd_bodegacodigo( String value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_bodegacodigo = value ;
   }

   public String getInvd_serial( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Invd_serial ;
   }

   public void setInvd_serial( String value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_serial = value ;
   }

   public String getInvd_marca( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Invd_marca ;
   }

   public void setInvd_marca( String value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_marca = value ;
   }

   public String getInvd_modelo( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Invd_modelo ;
   }

   public void setInvd_modelo( String value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_modelo = value ;
   }

   public String getInvd_estado( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Invd_estado ;
   }

   public void setInvd_estado( String value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_estado = value ;
   }

   public int getInvd_vidautil( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Invd_vidautil ;
   }

   public void setInvd_vidautil( int value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_vidautil = value ;
   }

   public java.math.BigDecimal getInvd_valoradquisicion( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Invd_valoradquisicion ;
   }

   public void setInvd_valoradquisicion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_valoradquisicion = value ;
   }

   public java.util.Date getInvd_fechaadquisicion( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Invd_fechaadquisicion ;
   }

   public void setInvd_fechaadquisicion( java.util.Date value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_fechaadquisicion = value ;
   }

   public long getCuen_identificacion( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Cuen_identificacion ;
   }

   public void setCuen_identificacion( long value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Cuen_identificacion = value ;
   }

   public String getInvd_placapadre( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Invd_placapadre ;
   }

   public void setInvd_placapadre( String value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_placapadre = value ;
   }

   public String getInvd_esplacapadre( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Invd_esplacapadre ;
   }

   public void setInvd_esplacapadre( String value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_esplacapadre = value ;
   }

   public java.util.Date getInvd_fechaservicio( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Invd_fechaservicio ;
   }

   public void setInvd_fechaservicio( java.util.Date value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_fechaservicio = value ;
   }

   protected int gxTv_SdtSDTInventarioDevolutivo_Invd_vidautil ;
   protected long gxTv_SdtSDTInventarioDevolutivo_Invd_regionalid ;
   protected long gxTv_SdtSDTInventarioDevolutivo_Invd_centrocostoid ;
   protected long gxTv_SdtSDTInventarioDevolutivo_Cuen_identificacion ;
   protected String gxTv_SdtSDTInventarioDevolutivo_Invd_esplacapadre ;
   protected String gxTv_SdtSDTInventarioDevolutivo_Invd_descripciondevolutivo ;
   protected String gxTv_SdtSDTInventarioDevolutivo_Invd_numeroplaca ;
   protected String gxTv_SdtSDTInventarioDevolutivo_Invd_moduloalmacen ;
   protected String gxTv_SdtSDTInventarioDevolutivo_Invd_almacencodigo ;
   protected String gxTv_SdtSDTInventarioDevolutivo_Invd_bodegacodigo ;
   protected String gxTv_SdtSDTInventarioDevolutivo_Invd_serial ;
   protected String gxTv_SdtSDTInventarioDevolutivo_Invd_marca ;
   protected String gxTv_SdtSDTInventarioDevolutivo_Invd_modelo ;
   protected String gxTv_SdtSDTInventarioDevolutivo_Invd_estado ;
   protected String gxTv_SdtSDTInventarioDevolutivo_Invd_placapadre ;
   protected java.math.BigDecimal gxTv_SdtSDTInventarioDevolutivo_Invd_valoradquisicion ;
   protected java.util.Date gxTv_SdtSDTInventarioDevolutivo_Invd_fechaadquisicion ;
   protected java.util.Date gxTv_SdtSDTInventarioDevolutivo_Invd_fechaservicio ;
}

