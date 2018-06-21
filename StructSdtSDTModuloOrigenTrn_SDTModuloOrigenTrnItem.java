/*
               File: StructSdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem
        Description: SDTModuloOrigenTrn
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:18.89
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem( )
   {
      gxTv_SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem_Tran_moduloorigen = "" ;
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

   public String getTran_moduloorigen( )
   {
      return gxTv_SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem_Tran_moduloorigen ;
   }

   public void setTran_moduloorigen( String value )
   {
      gxTv_SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem_Tran_moduloorigen = value ;
   }

   protected String gxTv_SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem_Tran_moduloorigen ;
}

