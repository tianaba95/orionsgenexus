/*
               File: StructSdtSDTRolUsu_SDTRolUsuItem
        Description: SDTRolUsu
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:19.83
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTRolUsu_SDTRolUsuItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTRolUsu_SDTRolUsuItem( )
   {
      gxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_descripcion = "" ;
      gxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_tipo = "" ;
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

   public long getRol_id( )
   {
      return gxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_id ;
   }

   public void setRol_id( long value )
   {
      gxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_id = value ;
   }

   public String getRol_descripcion( )
   {
      return gxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_descripcion ;
   }

   public void setRol_descripcion( String value )
   {
      gxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_descripcion = value ;
   }

   public String getRol_tipo( )
   {
      return gxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_tipo ;
   }

   public void setRol_tipo( String value )
   {
      gxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_tipo = value ;
   }

   protected long gxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_id ;
   protected String gxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_tipo ;
   protected String gxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_descripcion ;
}

