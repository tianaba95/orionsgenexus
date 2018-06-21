/*
               File: StructSdtSDTNovedades
        Description: SDTNovedades
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:18.93
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTNovedades implements Cloneable, java.io.Serializable
{
   public StructSdtSDTNovedades( )
   {
      gxTv_SdtSDTNovedades_Nove_observaciones = "" ;
      gxTv_SdtSDTNovedades_Nove_masivo = "" ;
      gxTv_SdtSDTNovedades_Nove_soporte = "" ;
      gxTv_SdtSDTNovedades_Nove_rutasoporte = "" ;
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

   public long getNove_usuarioregistro( )
   {
      return gxTv_SdtSDTNovedades_Nove_usuarioregistro ;
   }

   public void setNove_usuarioregistro( long value )
   {
      gxTv_SdtSDTNovedades_Nove_usuarioregistro = value ;
   }

   public long getNove_transid( )
   {
      return gxTv_SdtSDTNovedades_Nove_transid ;
   }

   public void setNove_transid( long value )
   {
      gxTv_SdtSDTNovedades_Nove_transid = value ;
   }

   public int getTnov_codigo( )
   {
      return gxTv_SdtSDTNovedades_Tnov_codigo ;
   }

   public void setTnov_codigo( int value )
   {
      gxTv_SdtSDTNovedades_Tnov_codigo = value ;
   }

   public String getNove_observaciones( )
   {
      return gxTv_SdtSDTNovedades_Nove_observaciones ;
   }

   public void setNove_observaciones( String value )
   {
      gxTv_SdtSDTNovedades_Nove_observaciones = value ;
   }

   public String getNove_masivo( )
   {
      return gxTv_SdtSDTNovedades_Nove_masivo ;
   }

   public void setNove_masivo( String value )
   {
      gxTv_SdtSDTNovedades_Nove_masivo = value ;
   }

   public String getNove_soporte( )
   {
      return gxTv_SdtSDTNovedades_Nove_soporte ;
   }

   public void setNove_soporte( String value )
   {
      gxTv_SdtSDTNovedades_Nove_soporte = value ;
   }

   public String getNove_rutasoporte( )
   {
      return gxTv_SdtSDTNovedades_Nove_rutasoporte ;
   }

   public void setNove_rutasoporte( String value )
   {
      gxTv_SdtSDTNovedades_Nove_rutasoporte = value ;
   }

   protected int gxTv_SdtSDTNovedades_Tnov_codigo ;
   protected long gxTv_SdtSDTNovedades_Nove_usuarioregistro ;
   protected long gxTv_SdtSDTNovedades_Nove_transid ;
   protected String gxTv_SdtSDTNovedades_Nove_observaciones ;
   protected String gxTv_SdtSDTNovedades_Nove_soporte ;
   protected String gxTv_SdtSDTNovedades_Nove_masivo ;
   protected String gxTv_SdtSDTNovedades_Nove_rutasoporte ;
}

