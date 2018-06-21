/*
               File: StructSdtSDTEditarCCU
        Description: SDTEditarCCU
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:17.55
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTEditarCCU implements Cloneable, java.io.Serializable
{
   public StructSdtSDTEditarCCU( )
   {
      gxTv_SdtSDTEditarCCU_Usuacodigo = "" ;
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

   public String getUsuacodigo( )
   {
      return gxTv_SdtSDTEditarCCU_Usuacodigo ;
   }

   public void setUsuacodigo( String value )
   {
      gxTv_SdtSDTEditarCCU_Usuacodigo = value ;
   }

   public java.util.Vector getGencentrocostocollectioneliminado( )
   {
      return gxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado ;
   }

   public void setGencentrocostocollectioneliminado( java.util.Vector value )
   {
      gxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado = value ;
   }

   public java.util.Vector getGencentrocostocollectionagregado( )
   {
      return gxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado ;
   }

   public void setGencentrocostocollectionagregado( java.util.Vector value )
   {
      gxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado = value ;
   }

   public java.util.Vector getGencentrocostocollection( )
   {
      return gxTv_SdtSDTEditarCCU_Gencentrocostocollection ;
   }

   public void setGencentrocostocollection( java.util.Vector value )
   {
      gxTv_SdtSDTEditarCCU_Gencentrocostocollection = value ;
   }

   protected String gxTv_SdtSDTEditarCCU_Usuacodigo ;
   protected java.util.Vector gxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado=null ;
   protected java.util.Vector gxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado=null ;
   protected java.util.Vector gxTv_SdtSDTEditarCCU_Gencentrocostocollection=null ;
}

