/*
               File: StructSdtSDTHVTraza_SDTHVTrazaItem
        Description: SDTHVTraza
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:18.39
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTHVTraza_SDTHVTrazaItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTHVTraza_SDTHVTrazaItem( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_centrocostocodigo = "" ;
      gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_codigomovimiento = "" ;
      gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_descripcionmovimiento = "" ;
      gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_fecharegistro = cal.getTime() ;
      gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_nombcuentadantedestino = "" ;
      gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_estado = "" ;
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

   public String getGtran_centrocostocodigo( )
   {
      return gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_centrocostocodigo ;
   }

   public void setGtran_centrocostocodigo( String value )
   {
      gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_centrocostocodigo = value ;
   }

   public String getGtran_codigomovimiento( )
   {
      return gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_codigomovimiento ;
   }

   public void setGtran_codigomovimiento( String value )
   {
      gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_codigomovimiento = value ;
   }

   public String getGtran_descripcionmovimiento( )
   {
      return gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_descripcionmovimiento ;
   }

   public void setGtran_descripcionmovimiento( String value )
   {
      gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_descripcionmovimiento = value ;
   }

   public long getGtran_consecutivocc( )
   {
      return gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_consecutivocc ;
   }

   public void setGtran_consecutivocc( long value )
   {
      gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_consecutivocc = value ;
   }

   public java.util.Date getGtran_fecharegistro( )
   {
      return gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_fecharegistro ;
   }

   public void setGtran_fecharegistro( java.util.Date value )
   {
      gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_fecharegistro = value ;
   }

   public long getGtran_idcuentadantedestino( )
   {
      return gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_idcuentadantedestino ;
   }

   public void setGtran_idcuentadantedestino( long value )
   {
      gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_idcuentadantedestino = value ;
   }

   public long getGtran_cedulacuentadantedestino( )
   {
      return gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_cedulacuentadantedestino ;
   }

   public void setGtran_cedulacuentadantedestino( long value )
   {
      gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_cedulacuentadantedestino = value ;
   }

   public String getGtran_nombcuentadantedestino( )
   {
      return gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_nombcuentadantedestino ;
   }

   public void setGtran_nombcuentadantedestino( String value )
   {
      gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_nombcuentadantedestino = value ;
   }

   public String getGtran_estado( )
   {
      return gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_estado ;
   }

   public void setGtran_estado( String value )
   {
      gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_estado = value ;
   }

   protected long gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_consecutivocc ;
   protected long gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_idcuentadantedestino ;
   protected long gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_cedulacuentadantedestino ;
   protected String gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_estado ;
   protected String gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_centrocostocodigo ;
   protected String gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_codigomovimiento ;
   protected String gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_descripcionmovimiento ;
   protected String gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_nombcuentadantedestino ;
   protected java.util.Date gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_fecharegistro ;
}

