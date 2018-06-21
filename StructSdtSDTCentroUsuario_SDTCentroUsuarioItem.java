/*
               File: StructSdtSDTCentroUsuario_SDTCentroUsuarioItem
        Description: SDTCentroUsuario
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:16.99
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTCentroUsuario_SDTCentroUsuarioItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTCentroUsuario_SDTCentroUsuarioItem( )
   {
      gxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Cent_codigo = "" ;
      gxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Cent_descripcion = "" ;
      gxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Regi_descripcion = "" ;
      gxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Regi_abrev = "" ;
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

   public long getCent_id( )
   {
      return gxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Cent_id ;
   }

   public void setCent_id( long value )
   {
      gxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Cent_id = value ;
   }

   public String getCent_codigo( )
   {
      return gxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Cent_codigo ;
   }

   public void setCent_codigo( String value )
   {
      gxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Cent_codigo = value ;
   }

   public String getCent_descripcion( )
   {
      return gxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Cent_descripcion ;
   }

   public void setCent_descripcion( String value )
   {
      gxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Cent_descripcion = value ;
   }

   public short getRegi_cod( )
   {
      return gxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Regi_cod ;
   }

   public void setRegi_cod( short value )
   {
      gxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Regi_cod = value ;
   }

   public String getRegi_descripcion( )
   {
      return gxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Regi_descripcion ;
   }

   public void setRegi_descripcion( String value )
   {
      gxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Regi_descripcion = value ;
   }

   public String getRegi_abrev( )
   {
      return gxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Regi_abrev ;
   }

   public void setRegi_abrev( String value )
   {
      gxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Regi_abrev = value ;
   }

   public boolean getSeleccion( )
   {
      return gxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Seleccion ;
   }

   public void setSeleccion( boolean value )
   {
      gxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Seleccion = value ;
   }

   protected short gxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Regi_cod ;
   protected long gxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Cent_id ;
   protected boolean gxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Seleccion ;
   protected String gxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Cent_codigo ;
   protected String gxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Cent_descripcion ;
   protected String gxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Regi_descripcion ;
   protected String gxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Regi_abrev ;
}

