/*
               File: StructSdtSDTEditarRol
        Description: SDTEditarRol
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:17.68
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTEditarRol implements Cloneable, java.io.Serializable
{
   public StructSdtSDTEditarRol( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTEditarRol_Usuacodigo = "" ;
      gxTv_SdtSDTEditarRol_Usuanombre = "" ;
      gxTv_SdtSDTEditarRol_Usuausuaprueba = "" ;
      gxTv_SdtSDTEditarRol_Usuausuariomodifica = "" ;
      gxTv_SdtSDTEditarRol_Usuafechamodifica = cal.getTime() ;
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
      return gxTv_SdtSDTEditarRol_Usuacodigo ;
   }

   public void setUsuacodigo( String value )
   {
      gxTv_SdtSDTEditarRol_Usuacodigo = value ;
   }

   public String getUsuanombre( )
   {
      return gxTv_SdtSDTEditarRol_Usuanombre ;
   }

   public void setUsuanombre( String value )
   {
      gxTv_SdtSDTEditarRol_Usuanombre = value ;
   }

   public long getUsuacedula( )
   {
      return gxTv_SdtSDTEditarRol_Usuacedula ;
   }

   public void setUsuacedula( long value )
   {
      gxTv_SdtSDTEditarRol_Usuacedula = value ;
   }

   public String getUsuausuaprueba( )
   {
      return gxTv_SdtSDTEditarRol_Usuausuaprueba ;
   }

   public void setUsuausuaprueba( String value )
   {
      gxTv_SdtSDTEditarRol_Usuausuaprueba = value ;
   }

   public String getUsuausuariomodifica( )
   {
      return gxTv_SdtSDTEditarRol_Usuausuariomodifica ;
   }

   public void setUsuausuariomodifica( String value )
   {
      gxTv_SdtSDTEditarRol_Usuausuariomodifica = value ;
   }

   public java.util.Date getUsuafechamodifica( )
   {
      return gxTv_SdtSDTEditarRol_Usuafechamodifica ;
   }

   public void setUsuafechamodifica( java.util.Date value )
   {
      gxTv_SdtSDTEditarRol_Usuafechamodifica = value ;
   }

   public java.util.Vector getSegrolcollectioneliminado( )
   {
      return gxTv_SdtSDTEditarRol_Segrolcollectioneliminado ;
   }

   public void setSegrolcollectioneliminado( java.util.Vector value )
   {
      gxTv_SdtSDTEditarRol_Segrolcollectioneliminado = value ;
   }

   public java.util.Vector getSegrolcollectionagregado( )
   {
      return gxTv_SdtSDTEditarRol_Segrolcollectionagregado ;
   }

   public void setSegrolcollectionagregado( java.util.Vector value )
   {
      gxTv_SdtSDTEditarRol_Segrolcollectionagregado = value ;
   }

   public java.util.Vector getSegrolcollection( )
   {
      return gxTv_SdtSDTEditarRol_Segrolcollection ;
   }

   public void setSegrolcollection( java.util.Vector value )
   {
      gxTv_SdtSDTEditarRol_Segrolcollection = value ;
   }

   public java.util.Vector getGencentrocostocollectioneliminado( )
   {
      return gxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado ;
   }

   public void setGencentrocostocollectioneliminado( java.util.Vector value )
   {
      gxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado = value ;
   }

   public java.util.Vector getGencentrocostocollectionagregado( )
   {
      return gxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado ;
   }

   public void setGencentrocostocollectionagregado( java.util.Vector value )
   {
      gxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado = value ;
   }

   public java.util.Vector getGencentrocostocollection( )
   {
      return gxTv_SdtSDTEditarRol_Gencentrocostocollection ;
   }

   public void setGencentrocostocollection( java.util.Vector value )
   {
      gxTv_SdtSDTEditarRol_Gencentrocostocollection = value ;
   }

   protected long gxTv_SdtSDTEditarRol_Usuacedula ;
   protected String gxTv_SdtSDTEditarRol_Usuacodigo ;
   protected String gxTv_SdtSDTEditarRol_Usuanombre ;
   protected String gxTv_SdtSDTEditarRol_Usuausuaprueba ;
   protected String gxTv_SdtSDTEditarRol_Usuausuariomodifica ;
   protected java.util.Date gxTv_SdtSDTEditarRol_Usuafechamodifica ;
   protected java.util.Vector gxTv_SdtSDTEditarRol_Segrolcollectioneliminado=null ;
   protected java.util.Vector gxTv_SdtSDTEditarRol_Segrolcollectionagregado=null ;
   protected java.util.Vector gxTv_SdtSDTEditarRol_Segrolcollection=null ;
   protected java.util.Vector gxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado=null ;
   protected java.util.Vector gxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado=null ;
   protected java.util.Vector gxTv_SdtSDTEditarRol_Gencentrocostocollection=null ;
}

