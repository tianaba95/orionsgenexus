/*
               File: StructSdtSDTUsuarios_genCentrocostoCollectionItem
        Description: SDTUsuarios
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 18, 2018 13:32:47.85
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTUsuarios_genCentrocostoCollectionItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTUsuarios_genCentrocostoCollectionItem( )
   {
      gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Centcodigo = "" ;
      gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Centdescripcion = "" ;
      gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regidescripcion = "" ;
      gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regiabrev = "" ;
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

   public String getCentcodigo( )
   {
      return gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Centcodigo ;
   }

   public void setCentcodigo( String value )
   {
      gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Centcodigo = value ;
   }

   public String getCentdescripcion( )
   {
      return gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Centdescripcion ;
   }

   public void setCentdescripcion( String value )
   {
      gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Centdescripcion = value ;
   }

   public short getRegicod( )
   {
      return gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regicod ;
   }

   public void setRegicod( short value )
   {
      gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regicod = value ;
   }

   public String getRegidescripcion( )
   {
      return gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regidescripcion ;
   }

   public void setRegidescripcion( String value )
   {
      gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regidescripcion = value ;
   }

   public String getRegiabrev( )
   {
      return gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regiabrev ;
   }

   public void setRegiabrev( String value )
   {
      gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regiabrev = value ;
   }

   protected short gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regicod ;
   protected String gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Centcodigo ;
   protected String gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Centdescripcion ;
   protected String gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regidescripcion ;
   protected String gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regiabrev ;
}

