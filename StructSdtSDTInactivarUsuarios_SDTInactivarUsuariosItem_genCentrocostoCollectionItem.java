/*
               File: StructSdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem
        Description: SDTInactivarUsuarios
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:18.47
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem( )
   {
      gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem_Centcodigo = "" ;
      gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem_Centdescripcion = "" ;
      gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem_Regidescripcion = "" ;
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

   public long getCentid( )
   {
      return gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem_Centid ;
   }

   public void setCentid( long value )
   {
      gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem_Centid = value ;
   }

   public String getCentcodigo( )
   {
      return gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem_Centcodigo ;
   }

   public void setCentcodigo( String value )
   {
      gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem_Centcodigo = value ;
   }

   public String getCentdescripcion( )
   {
      return gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem_Centdescripcion ;
   }

   public void setCentdescripcion( String value )
   {
      gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem_Centdescripcion = value ;
   }

   public short getRegicod( )
   {
      return gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem_Regicod ;
   }

   public void setRegicod( short value )
   {
      gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem_Regicod = value ;
   }

   public String getRegidescripcion( )
   {
      return gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem_Regidescripcion ;
   }

   public void setRegidescripcion( String value )
   {
      gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem_Regidescripcion = value ;
   }

   protected short gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem_Regicod ;
   protected long gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem_Centid ;
   protected String gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem_Centcodigo ;
   protected String gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem_Centdescripcion ;
   protected String gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem_Regidescripcion ;
}

