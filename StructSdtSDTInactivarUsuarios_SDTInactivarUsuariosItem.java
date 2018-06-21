/*
               File: StructSdtSDTInactivarUsuarios_SDTInactivarUsuariosItem
        Description: SDTInactivarUsuarios
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:18.43
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTInactivarUsuarios_SDTInactivarUsuariosItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTInactivarUsuarios_SDTInactivarUsuariosItem( )
   {
      gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Usuacodigo = "" ;
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

   public byte getTipoactivacion( )
   {
      return gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Tipoactivacion ;
   }

   public void setTipoactivacion( byte value )
   {
      gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Tipoactivacion = value ;
   }

   public String getUsuacodigo( )
   {
      return gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Usuacodigo ;
   }

   public void setUsuacodigo( String value )
   {
      gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Usuacodigo = value ;
   }

   public java.util.Vector getGencentrocostocollection( )
   {
      return gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection ;
   }

   public void setGencentrocostocollection( java.util.Vector value )
   {
      gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection = value ;
   }

   protected byte gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Tipoactivacion ;
   protected String gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Usuacodigo ;
   protected java.util.Vector gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection=null ;
}

