/*
               File: StructSdtSDTALM_DETA
        Description: SDTALM_DETA
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:16.4
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTALM_DETA implements Cloneable, java.io.Serializable
{
   public StructSdtSDTALM_DETA( )
   {
      gxTv_SdtSDTALM_DETA_Tdet_codigobien = "" ;
      gxTv_SdtSDTALM_DETA_Tdet_valorunitario = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTALM_DETA_Tdet_valortotal = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTALM_DETA_Tdet_placanumero = "" ;
      gxTv_SdtSDTALM_DETA_Tdet_placapadre = "" ;
      gxTv_SdtSDTALM_DETA_Tdet_observaciones = "" ;
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

   public long getTran_id( )
   {
      return gxTv_SdtSDTALM_DETA_Tran_id ;
   }

   public void setTran_id( long value )
   {
      gxTv_SdtSDTALM_DETA_Tran_id = value ;
   }

   public long getTdet_consecutivo( )
   {
      return gxTv_SdtSDTALM_DETA_Tdet_consecutivo ;
   }

   public void setTdet_consecutivo( long value )
   {
      gxTv_SdtSDTALM_DETA_Tdet_consecutivo = value ;
   }

   public String getTdet_codigobien( )
   {
      return gxTv_SdtSDTALM_DETA_Tdet_codigobien ;
   }

   public void setTdet_codigobien( String value )
   {
      gxTv_SdtSDTALM_DETA_Tdet_codigobien = value ;
   }

   public long getTdet_cantidad( )
   {
      return gxTv_SdtSDTALM_DETA_Tdet_cantidad ;
   }

   public void setTdet_cantidad( long value )
   {
      gxTv_SdtSDTALM_DETA_Tdet_cantidad = value ;
   }

   public java.math.BigDecimal getTdet_valorunitario( )
   {
      return gxTv_SdtSDTALM_DETA_Tdet_valorunitario ;
   }

   public void setTdet_valorunitario( java.math.BigDecimal value )
   {
      gxTv_SdtSDTALM_DETA_Tdet_valorunitario = value ;
   }

   public java.math.BigDecimal getTdet_valortotal( )
   {
      return gxTv_SdtSDTALM_DETA_Tdet_valortotal ;
   }

   public void setTdet_valortotal( java.math.BigDecimal value )
   {
      gxTv_SdtSDTALM_DETA_Tdet_valortotal = value ;
   }

   public String getTdet_placanumero( )
   {
      return gxTv_SdtSDTALM_DETA_Tdet_placanumero ;
   }

   public void setTdet_placanumero( String value )
   {
      gxTv_SdtSDTALM_DETA_Tdet_placanumero = value ;
   }

   public String getTdet_placapadre( )
   {
      return gxTv_SdtSDTALM_DETA_Tdet_placapadre ;
   }

   public void setTdet_placapadre( String value )
   {
      gxTv_SdtSDTALM_DETA_Tdet_placapadre = value ;
   }

   public String getTdet_observaciones( )
   {
      return gxTv_SdtSDTALM_DETA_Tdet_observaciones ;
   }

   public void setTdet_observaciones( String value )
   {
      gxTv_SdtSDTALM_DETA_Tdet_observaciones = value ;
   }

   public java.util.Vector getTdet_atributos( )
   {
      return gxTv_SdtSDTALM_DETA_Tdet_atributos ;
   }

   public void setTdet_atributos( java.util.Vector value )
   {
      gxTv_SdtSDTALM_DETA_Tdet_atributos = value ;
   }

   protected long gxTv_SdtSDTALM_DETA_Tran_id ;
   protected long gxTv_SdtSDTALM_DETA_Tdet_consecutivo ;
   protected long gxTv_SdtSDTALM_DETA_Tdet_cantidad ;
   protected String gxTv_SdtSDTALM_DETA_Tdet_codigobien ;
   protected String gxTv_SdtSDTALM_DETA_Tdet_placanumero ;
   protected String gxTv_SdtSDTALM_DETA_Tdet_placapadre ;
   protected String gxTv_SdtSDTALM_DETA_Tdet_observaciones ;
   protected java.math.BigDecimal gxTv_SdtSDTALM_DETA_Tdet_valorunitario ;
   protected java.math.BigDecimal gxTv_SdtSDTALM_DETA_Tdet_valortotal ;
   protected java.util.Vector gxTv_SdtSDTALM_DETA_Tdet_atributos=null ;
}

