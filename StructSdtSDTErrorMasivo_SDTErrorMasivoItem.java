/*
               File: StructSdtSDTErrorMasivo_SDTErrorMasivoItem
        Description: SDTErrorMasivo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:18.25
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTErrorMasivo_SDTErrorMasivoItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTErrorMasivo_SDTErrorMasivoItem( )
   {
      gxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Error = "" ;
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

   public short getFila( )
   {
      return gxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Fila ;
   }

   public void setFila( short value )
   {
      gxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Fila = value ;
   }

   public short getColumna( )
   {
      return gxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Columna ;
   }

   public void setColumna( short value )
   {
      gxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Columna = value ;
   }

   public String getError( )
   {
      return gxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Error ;
   }

   public void setError( String value )
   {
      gxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Error = value ;
   }

   protected short gxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Fila ;
   protected short gxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Columna ;
   protected String gxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Error ;
}

