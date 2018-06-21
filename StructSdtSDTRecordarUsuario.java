/*
               File: StructSdtSDTRecordarUsuario
        Description: SDTRecordarUsuario
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:19.68
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTRecordarUsuario implements Cloneable, java.io.Serializable
{
   public StructSdtSDTRecordarUsuario( )
   {
      gxTv_SdtSDTRecordarUsuario_Usuaemail = "" ;
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

   public String getUsuaemail( )
   {
      return gxTv_SdtSDTRecordarUsuario_Usuaemail ;
   }

   public void setUsuaemail( String value )
   {
      gxTv_SdtSDTRecordarUsuario_Usuaemail = value ;
   }

   public long getUsuacedula( )
   {
      return gxTv_SdtSDTRecordarUsuario_Usuacedula ;
   }

   public void setUsuacedula( long value )
   {
      gxTv_SdtSDTRecordarUsuario_Usuacedula = value ;
   }

   protected long gxTv_SdtSDTRecordarUsuario_Usuacedula ;
   protected String gxTv_SdtSDTRecordarUsuario_Usuaemail ;
}

