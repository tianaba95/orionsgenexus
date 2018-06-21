/*
               File: StructSdtSDTCambiaContrasena
        Description: SDTCambiaContrasena
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:16.76
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTCambiaContrasena implements Cloneable, java.io.Serializable
{
   public StructSdtSDTCambiaContrasena( )
   {
      gxTv_SdtSDTCambiaContrasena_Usuacodigo = "" ;
      gxTv_SdtSDTCambiaContrasena_Usuaclave = "" ;
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
      return gxTv_SdtSDTCambiaContrasena_Usuacodigo ;
   }

   public void setUsuacodigo( String value )
   {
      gxTv_SdtSDTCambiaContrasena_Usuacodigo = value ;
   }

   public String getUsuaclave( )
   {
      return gxTv_SdtSDTCambiaContrasena_Usuaclave ;
   }

   public void setUsuaclave( String value )
   {
      gxTv_SdtSDTCambiaContrasena_Usuaclave = value ;
   }

   public java.util.Vector getGencentrocostocollection( )
   {
      return gxTv_SdtSDTCambiaContrasena_Gencentrocostocollection ;
   }

   public void setGencentrocostocollection( java.util.Vector value )
   {
      gxTv_SdtSDTCambiaContrasena_Gencentrocostocollection = value ;
   }

   protected String gxTv_SdtSDTCambiaContrasena_Usuacodigo ;
   protected String gxTv_SdtSDTCambiaContrasena_Usuaclave ;
   protected java.util.Vector gxTv_SdtSDTCambiaContrasena_Gencentrocostocollection=null ;
}

