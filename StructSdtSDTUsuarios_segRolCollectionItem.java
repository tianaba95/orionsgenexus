/*
               File: StructSdtSDTUsuarios_segRolCollectionItem
        Description: SDTUsuarios
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 18, 2018 13:32:47.86
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTUsuarios_segRolCollectionItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTUsuarios_segRolCollectionItem( )
   {
      gxTv_SdtSDTUsuarios_segRolCollectionItem_Roldescripcion = "" ;
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

   public long getRolid( )
   {
      return gxTv_SdtSDTUsuarios_segRolCollectionItem_Rolid ;
   }

   public void setRolid( long value )
   {
      gxTv_SdtSDTUsuarios_segRolCollectionItem_Rolid = value ;
   }

   public String getRoldescripcion( )
   {
      return gxTv_SdtSDTUsuarios_segRolCollectionItem_Roldescripcion ;
   }

   public void setRoldescripcion( String value )
   {
      gxTv_SdtSDTUsuarios_segRolCollectionItem_Roldescripcion = value ;
   }

   protected long gxTv_SdtSDTUsuarios_segRolCollectionItem_Rolid ;
   protected String gxTv_SdtSDTUsuarios_segRolCollectionItem_Roldescripcion ;
}

