/*
               File: StructSdtMensajes_MensajesItem
        Description: Mensajes
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:15.85
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtMensajes_MensajesItem implements Cloneable, java.io.Serializable
{
   public StructSdtMensajes_MensajesItem( )
   {
      gxTv_SdtMensajes_MensajesItem_Descripcion = "" ;
      gxTv_SdtMensajes_MensajesItem_Inconsistencia = "" ;
      gxTv_SdtMensajes_MensajesItem_Nombrearchivo = "" ;
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

   public short getColumna( )
   {
      return gxTv_SdtMensajes_MensajesItem_Columna ;
   }

   public void setColumna( short value )
   {
      gxTv_SdtMensajes_MensajesItem_Columna = value ;
   }

   public String getDescripcion( )
   {
      return gxTv_SdtMensajes_MensajesItem_Descripcion ;
   }

   public void setDescripcion( String value )
   {
      gxTv_SdtMensajes_MensajesItem_Descripcion = value ;
   }

   public short getFila( )
   {
      return gxTv_SdtMensajes_MensajesItem_Fila ;
   }

   public void setFila( short value )
   {
      gxTv_SdtMensajes_MensajesItem_Fila = value ;
   }

   public String getInconsistencia( )
   {
      return gxTv_SdtMensajes_MensajesItem_Inconsistencia ;
   }

   public void setInconsistencia( String value )
   {
      gxTv_SdtMensajes_MensajesItem_Inconsistencia = value ;
   }

   public String getNombrearchivo( )
   {
      return gxTv_SdtMensajes_MensajesItem_Nombrearchivo ;
   }

   public void setNombrearchivo( String value )
   {
      gxTv_SdtMensajes_MensajesItem_Nombrearchivo = value ;
   }

   protected short gxTv_SdtMensajes_MensajesItem_Columna ;
   protected short gxTv_SdtMensajes_MensajesItem_Fila ;
   protected String gxTv_SdtMensajes_MensajesItem_Nombrearchivo ;
   protected String gxTv_SdtMensajes_MensajesItem_Descripcion ;
   protected String gxTv_SdtMensajes_MensajesItem_Inconsistencia ;
}

