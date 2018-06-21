/*
               File: StructSdtSDTTransaccion
        Description: SDTTransaccion
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:20.33
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTTransaccion implements Cloneable, java.io.Serializable
{
   public StructSdtSDTTransaccion( )
   {
      gxTv_SdtSDTTransaccion_Tran_moduloorigen = "" ;
      gxTv_SdtSDTTransaccion_Tran_codalmaorigen = "" ;
      gxTv_SdtSDTTransaccion_Tran_codbodeorigen = "" ;
      gxTv_SdtSDTTransaccion_Tran_modulodestino = "" ;
      gxTv_SdtSDTTransaccion_Tran_codalmadestino = "" ;
      gxTv_SdtSDTTransaccion_Tran_codbodedestino = "" ;
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
      return gxTv_SdtSDTTransaccion_Tran_moduloorigen ;
   }

   public void setTran_moduloorigen( String value )
   {
      gxTv_SdtSDTTransaccion_Tran_moduloorigen = value ;
   }

   public String getTran_codalmaorigen( )
   {
      return gxTv_SdtSDTTransaccion_Tran_codalmaorigen ;
   }

   public void setTran_codalmaorigen( String value )
   {
      gxTv_SdtSDTTransaccion_Tran_codalmaorigen = value ;
   }

   public String getTran_codbodeorigen( )
   {
      return gxTv_SdtSDTTransaccion_Tran_codbodeorigen ;
   }

   public void setTran_codbodeorigen( String value )
   {
      gxTv_SdtSDTTransaccion_Tran_codbodeorigen = value ;
   }

   public long getTran_idcuentadanteorigen( )
   {
      return gxTv_SdtSDTTransaccion_Tran_idcuentadanteorigen ;
   }

   public void setTran_idcuentadanteorigen( long value )
   {
      gxTv_SdtSDTTransaccion_Tran_idcuentadanteorigen = value ;
   }

   public String getTran_modulodestino( )
   {
      return gxTv_SdtSDTTransaccion_Tran_modulodestino ;
   }

   public void setTran_modulodestino( String value )
   {
      gxTv_SdtSDTTransaccion_Tran_modulodestino = value ;
   }

   public String getTran_codalmadestino( )
   {
      return gxTv_SdtSDTTransaccion_Tran_codalmadestino ;
   }

   public void setTran_codalmadestino( String value )
   {
      gxTv_SdtSDTTransaccion_Tran_codalmadestino = value ;
   }

   public String getTran_codbodedestino( )
   {
      return gxTv_SdtSDTTransaccion_Tran_codbodedestino ;
   }

   public void setTran_codbodedestino( String value )
   {
      gxTv_SdtSDTTransaccion_Tran_codbodedestino = value ;
   }

   public long getTran_idcuentadantedestino( )
   {
      return gxTv_SdtSDTTransaccion_Tran_idcuentadantedestino ;
   }

   public void setTran_idcuentadantedestino( long value )
   {
      gxTv_SdtSDTTransaccion_Tran_idcuentadantedestino = value ;
   }

   protected long gxTv_SdtSDTTransaccion_Tran_idcuentadanteorigen ;
   protected long gxTv_SdtSDTTransaccion_Tran_idcuentadantedestino ;
   protected String gxTv_SdtSDTTransaccion_Tran_moduloorigen ;
   protected String gxTv_SdtSDTTransaccion_Tran_codalmaorigen ;
   protected String gxTv_SdtSDTTransaccion_Tran_codbodeorigen ;
   protected String gxTv_SdtSDTTransaccion_Tran_modulodestino ;
   protected String gxTv_SdtSDTTransaccion_Tran_codalmadestino ;
   protected String gxTv_SdtSDTTransaccion_Tran_codbodedestino ;
}

