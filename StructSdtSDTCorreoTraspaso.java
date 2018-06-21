/*
               File: StructSdtSDTCorreoTraspaso
        Description: SDTCorreoTraspaso
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:17.14
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTCorreoTraspaso implements Cloneable, java.io.Serializable
{
   public StructSdtSDTCorreoTraspaso( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTCorreoTraspaso_Nombcuentadanteorigen = "" ;
      gxTv_SdtSDTCorreoTraspaso_Fecharatificacion = cal.getTime() ;
      gxTv_SdtSDTCorreoTraspaso_Descripcionmovimiento = "" ;
      gxTv_SdtSDTCorreoTraspaso_Indicadormovimiento = "" ;
      gxTv_SdtSDTCorreoTraspaso_Tranregionalorigen = "" ;
      gxTv_SdtSDTCorreoTraspaso_Tranregionaldestino = "" ;
      gxTv_SdtSDTCorreoTraspaso_Trancentrocostodescripcionorigen = "" ;
      gxTv_SdtSDTCorreoTraspaso_Trancentrocostodescripciondestino = "" ;
      gxTv_SdtSDTCorreoTraspaso_Tranvalortransaccion = new java.math.BigDecimal(0) ;
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

   public String getNombcuentadanteorigen( )
   {
      return gxTv_SdtSDTCorreoTraspaso_Nombcuentadanteorigen ;
   }

   public void setNombcuentadanteorigen( String value )
   {
      gxTv_SdtSDTCorreoTraspaso_Nombcuentadanteorigen = value ;
   }

   public java.util.Date getFecharatificacion( )
   {
      return gxTv_SdtSDTCorreoTraspaso_Fecharatificacion ;
   }

   public void setFecharatificacion( java.util.Date value )
   {
      gxTv_SdtSDTCorreoTraspaso_Fecharatificacion = value ;
   }

   public String getDescripcionmovimiento( )
   {
      return gxTv_SdtSDTCorreoTraspaso_Descripcionmovimiento ;
   }

   public void setDescripcionmovimiento( String value )
   {
      gxTv_SdtSDTCorreoTraspaso_Descripcionmovimiento = value ;
   }

   public String getIndicadormovimiento( )
   {
      return gxTv_SdtSDTCorreoTraspaso_Indicadormovimiento ;
   }

   public void setIndicadormovimiento( String value )
   {
      gxTv_SdtSDTCorreoTraspaso_Indicadormovimiento = value ;
   }

   public short getTranid( )
   {
      return gxTv_SdtSDTCorreoTraspaso_Tranid ;
   }

   public void setTranid( short value )
   {
      gxTv_SdtSDTCorreoTraspaso_Tranid = value ;
   }

   public String getTranregionalorigen( )
   {
      return gxTv_SdtSDTCorreoTraspaso_Tranregionalorigen ;
   }

   public void setTranregionalorigen( String value )
   {
      gxTv_SdtSDTCorreoTraspaso_Tranregionalorigen = value ;
   }

   public String getTranregionaldestino( )
   {
      return gxTv_SdtSDTCorreoTraspaso_Tranregionaldestino ;
   }

   public void setTranregionaldestino( String value )
   {
      gxTv_SdtSDTCorreoTraspaso_Tranregionaldestino = value ;
   }

   public String getTrancentrocostodescripcionorigen( )
   {
      return gxTv_SdtSDTCorreoTraspaso_Trancentrocostodescripcionorigen ;
   }

   public void setTrancentrocostodescripcionorigen( String value )
   {
      gxTv_SdtSDTCorreoTraspaso_Trancentrocostodescripcionorigen = value ;
   }

   public String getTrancentrocostodescripciondestino( )
   {
      return gxTv_SdtSDTCorreoTraspaso_Trancentrocostodescripciondestino ;
   }

   public void setTrancentrocostodescripciondestino( String value )
   {
      gxTv_SdtSDTCorreoTraspaso_Trancentrocostodescripciondestino = value ;
   }

   public java.math.BigDecimal getTranvalortransaccion( )
   {
      return gxTv_SdtSDTCorreoTraspaso_Tranvalortransaccion ;
   }

   public void setTranvalortransaccion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTCorreoTraspaso_Tranvalortransaccion = value ;
   }

   public java.util.Vector getEmails( )
   {
      return gxTv_SdtSDTCorreoTraspaso_Emails ;
   }

   public void setEmails( java.util.Vector value )
   {
      gxTv_SdtSDTCorreoTraspaso_Emails = value ;
   }

   public java.util.Vector getCantidad( )
   {
      return gxTv_SdtSDTCorreoTraspaso_Cantidad ;
   }

   public void setCantidad( java.util.Vector value )
   {
      gxTv_SdtSDTCorreoTraspaso_Cantidad = value ;
   }

   protected short gxTv_SdtSDTCorreoTraspaso_Tranid ;
   protected String gxTv_SdtSDTCorreoTraspaso_Nombcuentadanteorigen ;
   protected String gxTv_SdtSDTCorreoTraspaso_Descripcionmovimiento ;
   protected String gxTv_SdtSDTCorreoTraspaso_Indicadormovimiento ;
   protected String gxTv_SdtSDTCorreoTraspaso_Tranregionalorigen ;
   protected String gxTv_SdtSDTCorreoTraspaso_Tranregionaldestino ;
   protected String gxTv_SdtSDTCorreoTraspaso_Trancentrocostodescripcionorigen ;
   protected String gxTv_SdtSDTCorreoTraspaso_Trancentrocostodescripciondestino ;
   protected java.util.Date gxTv_SdtSDTCorreoTraspaso_Fecharatificacion ;
   protected java.math.BigDecimal gxTv_SdtSDTCorreoTraspaso_Tranvalortransaccion ;
   protected java.util.Vector gxTv_SdtSDTCorreoTraspaso_Emails=null ;
   protected java.util.Vector gxTv_SdtSDTCorreoTraspaso_Cantidad=null ;
}

