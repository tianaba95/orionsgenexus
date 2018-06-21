/*
               File: StructSdtSDTPadreseHijos
        Description: SDTPadreseHijos
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:19.47
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTPadreseHijos implements Cloneable, java.io.Serializable
{
   public StructSdtSDTPadreseHijos( )
   {
      gxTv_SdtSDTPadreseHijos_Regiabrev = "" ;
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

   public String getRegiabrev( )
   {
      return gxTv_SdtSDTPadreseHijos_Regiabrev ;
   }

   public void setRegiabrev( String value )
   {
      gxTv_SdtSDTPadreseHijos_Regiabrev = value ;
   }

   public short getRegicod( )
   {
      return gxTv_SdtSDTPadreseHijos_Regicod ;
   }

   public void setRegicod( short value )
   {
      gxTv_SdtSDTPadreseHijos_Regicod = value ;
   }

   public java.util.Vector getPlacas( )
   {
      return gxTv_SdtSDTPadreseHijos_Placas ;
   }

   public void setPlacas( java.util.Vector value )
   {
      gxTv_SdtSDTPadreseHijos_Placas = value ;
   }

   protected short gxTv_SdtSDTPadreseHijos_Regicod ;
   protected String gxTv_SdtSDTPadreseHijos_Regiabrev ;
   protected java.util.Vector gxTv_SdtSDTPadreseHijos_Placas=null ;
}

