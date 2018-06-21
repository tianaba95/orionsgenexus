/*
               File: StructSdtSDTNovedadesBien_SDTNovedadesBienItem
        Description: SDTNovedadesBien
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:18.98
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTNovedadesBien_SDTNovedadesBienItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTNovedadesBien_SDTNovedadesBienItem( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_fecharegistro = cal.getTime() ;
      gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_placa = "" ;
      gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_valorantiguo = "" ;
      gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_valornuevo = "" ;
      gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Tnov_descripcion = "" ;
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

   public long getNove_identificador( )
   {
      return gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_identificador ;
   }

   public void setNove_identificador( long value )
   {
      gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_identificador = value ;
   }

   public java.util.Date getNove_fecharegistro( )
   {
      return gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_fecharegistro ;
   }

   public void setNove_fecharegistro( java.util.Date value )
   {
      gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_fecharegistro = value ;
   }

   public String getNove_placa( )
   {
      return gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_placa ;
   }

   public void setNove_placa( String value )
   {
      gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_placa = value ;
   }

   public String getNove_valorantiguo( )
   {
      return gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_valorantiguo ;
   }

   public void setNove_valorantiguo( String value )
   {
      gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_valorantiguo = value ;
   }

   public String getNove_valornuevo( )
   {
      return gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_valornuevo ;
   }

   public void setNove_valornuevo( String value )
   {
      gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_valornuevo = value ;
   }

   public int getTnov_codigo( )
   {
      return gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Tnov_codigo ;
   }

   public void setTnov_codigo( int value )
   {
      gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Tnov_codigo = value ;
   }

   public String getTnov_descripcion( )
   {
      return gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Tnov_descripcion ;
   }

   public void setTnov_descripcion( String value )
   {
      gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Tnov_descripcion = value ;
   }

   protected int gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Tnov_codigo ;
   protected long gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_identificador ;
   protected String gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_placa ;
   protected String gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_valorantiguo ;
   protected String gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_valornuevo ;
   protected String gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Tnov_descripcion ;
   protected java.util.Date gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_fecharegistro ;
}

