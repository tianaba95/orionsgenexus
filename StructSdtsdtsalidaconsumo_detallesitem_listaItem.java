/*
               File: StructSdtsdtsalidaconsumo_detallesitem_listaItem
        Description: sdtsalidaconsumo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:20.1
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtsdtsalidaconsumo_detallesitem_listaItem implements Cloneable, java.io.Serializable
{
   public StructSdtsdtsalidaconsumo_detallesitem_listaItem( )
   {
      gxTv_Sdtsdtsalidaconsumo_detallesitem_listaItem_Nombrelista = "" ;
      gxTv_Sdtsdtsalidaconsumo_detallesitem_listaItem_Valorlista = "" ;
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

   public long getCodigolista( )
   {
      return gxTv_Sdtsdtsalidaconsumo_detallesitem_listaItem_Codigolista ;
   }

   public void setCodigolista( long value )
   {
      gxTv_Sdtsdtsalidaconsumo_detallesitem_listaItem_Codigolista = value ;
   }

   public String getNombrelista( )
   {
      return gxTv_Sdtsdtsalidaconsumo_detallesitem_listaItem_Nombrelista ;
   }

   public void setNombrelista( String value )
   {
      gxTv_Sdtsdtsalidaconsumo_detallesitem_listaItem_Nombrelista = value ;
   }

   public String getValorlista( )
   {
      return gxTv_Sdtsdtsalidaconsumo_detallesitem_listaItem_Valorlista ;
   }

   public void setValorlista( String value )
   {
      gxTv_Sdtsdtsalidaconsumo_detallesitem_listaItem_Valorlista = value ;
   }

   protected long gxTv_Sdtsdtsalidaconsumo_detallesitem_listaItem_Codigolista ;
   protected String gxTv_Sdtsdtsalidaconsumo_detallesitem_listaItem_Nombrelista ;
   protected String gxTv_Sdtsdtsalidaconsumo_detallesitem_listaItem_Valorlista ;
}

