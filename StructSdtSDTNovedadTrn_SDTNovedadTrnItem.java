/*
               File: StructSdtSDTNovedadTrn_SDTNovedadTrnItem
        Description: SDTNovedadTrn
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:19.11
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTNovedadTrn_SDTNovedadTrnItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTNovedadTrn_SDTNovedadTrnItem( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_fecharegistro = cal.getTime() ;
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_descripcion = "" ;
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_soporte = "" ;
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valorantiguo = "" ;
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valornuevo = "" ;
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_nombre_campo = "" ;
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_antiguo = "" ;
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_nuevo = "" ;
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_tipo = "" ;
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
      return gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_identificador ;
   }

   public void setNove_identificador( long value )
   {
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_identificador = value ;
   }

   public java.util.Date getNove_fecharegistro( )
   {
      return gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_fecharegistro ;
   }

   public void setNove_fecharegistro( java.util.Date value )
   {
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_fecharegistro = value ;
   }

   public long getNove_transid( )
   {
      return gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_transid ;
   }

   public void setNove_transid( long value )
   {
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_transid = value ;
   }

   public long getNove_trancc( )
   {
      return gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_trancc ;
   }

   public void setNove_trancc( long value )
   {
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_trancc = value ;
   }

   public int getTnov_codigo( )
   {
      return gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_codigo ;
   }

   public void setTnov_codigo( int value )
   {
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_codigo = value ;
   }

   public String getTnov_descripcion( )
   {
      return gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_descripcion ;
   }

   public void setTnov_descripcion( String value )
   {
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_descripcion = value ;
   }

   public String getNove_soporte( )
   {
      return gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_soporte ;
   }

   public void setNove_soporte( String value )
   {
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_soporte = value ;
   }

   public String getNove_valorantiguo( )
   {
      return gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valorantiguo ;
   }

   public void setNove_valorantiguo( String value )
   {
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valorantiguo = value ;
   }

   public String getNove_valornuevo( )
   {
      return gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valornuevo ;
   }

   public void setNove_valornuevo( String value )
   {
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valornuevo = value ;
   }

   public String getTnov_nombre_campo( )
   {
      return gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_nombre_campo ;
   }

   public void setTnov_nombre_campo( String value )
   {
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_nombre_campo = value ;
   }

   public String getValor_antiguo( )
   {
      return gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_antiguo ;
   }

   public void setValor_antiguo( String value )
   {
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_antiguo = value ;
   }

   public String getValor_nuevo( )
   {
      return gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_nuevo ;
   }

   public void setValor_nuevo( String value )
   {
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_nuevo = value ;
   }

   public String getTnov_tipo( )
   {
      return gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_tipo ;
   }

   public void setTnov_tipo( String value )
   {
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_tipo = value ;
   }

   protected int gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_codigo ;
   protected long gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_identificador ;
   protected long gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_transid ;
   protected long gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_trancc ;
   protected String gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_antiguo ;
   protected String gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_nuevo ;
   protected String gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_soporte ;
   protected String gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_descripcion ;
   protected String gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valorantiguo ;
   protected String gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valornuevo ;
   protected String gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_nombre_campo ;
   protected String gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_tipo ;
   protected java.util.Date gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_fecharegistro ;
}

