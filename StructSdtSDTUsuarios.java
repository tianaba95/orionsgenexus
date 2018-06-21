/*
               File: StructSdtSDTUsuarios
        Description: SDTUsuarios
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 18, 2018 13:32:47.80
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTUsuarios implements Cloneable, java.io.Serializable
{
   public StructSdtSDTUsuarios( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTUsuarios_Usuacodigo = "" ;
      gxTv_SdtSDTUsuarios_Usuanombre = "" ;
      gxTv_SdtSDTUsuarios_Usuaemail = "" ;
      gxTv_SdtSDTUsuarios_Usuaclave = "" ;
      gxTv_SdtSDTUsuarios_Usuaestado = "" ;
      gxTv_SdtSDTUsuarios_Usuausuaprueba = "" ;
      gxTv_SdtSDTUsuarios_Usuatipocontrato = "" ;
      gxTv_SdtSDTUsuarios_Usuausuariocrea = "" ;
      gxTv_SdtSDTUsuarios_Usuafechacrea = cal.getTime() ;
      gxTv_SdtSDTUsuarios_Usuausuariomodifica = "" ;
      gxTv_SdtSDTUsuarios_Usuafechamodifica = cal.getTime() ;
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

   public long getUsuaid( )
   {
      return gxTv_SdtSDTUsuarios_Usuaid ;
   }

   public void setUsuaid( long value )
   {
      gxTv_SdtSDTUsuarios_Usuaid = value ;
   }

   public String getUsuacodigo( )
   {
      return gxTv_SdtSDTUsuarios_Usuacodigo ;
   }

   public void setUsuacodigo( String value )
   {
      gxTv_SdtSDTUsuarios_Usuacodigo = value ;
   }

   public String getUsuanombre( )
   {
      return gxTv_SdtSDTUsuarios_Usuanombre ;
   }

   public void setUsuanombre( String value )
   {
      gxTv_SdtSDTUsuarios_Usuanombre = value ;
   }

   public String getUsuaemail( )
   {
      return gxTv_SdtSDTUsuarios_Usuaemail ;
   }

   public void setUsuaemail( String value )
   {
      gxTv_SdtSDTUsuarios_Usuaemail = value ;
   }

   public long getUsuacedula( )
   {
      return gxTv_SdtSDTUsuarios_Usuacedula ;
   }

   public void setUsuacedula( long value )
   {
      gxTv_SdtSDTUsuarios_Usuacedula = value ;
   }

   public String getUsuaclave( )
   {
      return gxTv_SdtSDTUsuarios_Usuaclave ;
   }

   public void setUsuaclave( String value )
   {
      gxTv_SdtSDTUsuarios_Usuaclave = value ;
   }

   public String getUsuaestado( )
   {
      return gxTv_SdtSDTUsuarios_Usuaestado ;
   }

   public void setUsuaestado( String value )
   {
      gxTv_SdtSDTUsuarios_Usuaestado = value ;
   }

   public String getUsuausuaprueba( )
   {
      return gxTv_SdtSDTUsuarios_Usuausuaprueba ;
   }

   public void setUsuausuaprueba( String value )
   {
      gxTv_SdtSDTUsuarios_Usuausuaprueba = value ;
   }

   public String getUsuatipocontrato( )
   {
      return gxTv_SdtSDTUsuarios_Usuatipocontrato ;
   }

   public void setUsuatipocontrato( String value )
   {
      gxTv_SdtSDTUsuarios_Usuatipocontrato = value ;
   }

   public String getUsuausuariocrea( )
   {
      return gxTv_SdtSDTUsuarios_Usuausuariocrea ;
   }

   public void setUsuausuariocrea( String value )
   {
      gxTv_SdtSDTUsuarios_Usuausuariocrea = value ;
   }

   public java.util.Date getUsuafechacrea( )
   {
      return gxTv_SdtSDTUsuarios_Usuafechacrea ;
   }

   public void setUsuafechacrea( java.util.Date value )
   {
      gxTv_SdtSDTUsuarios_Usuafechacrea = value ;
   }

   public String getUsuausuariomodifica( )
   {
      return gxTv_SdtSDTUsuarios_Usuausuariomodifica ;
   }

   public void setUsuausuariomodifica( String value )
   {
      gxTv_SdtSDTUsuarios_Usuausuariomodifica = value ;
   }

   public java.util.Date getUsuafechamodifica( )
   {
      return gxTv_SdtSDTUsuarios_Usuafechamodifica ;
   }

   public void setUsuafechamodifica( java.util.Date value )
   {
      gxTv_SdtSDTUsuarios_Usuafechamodifica = value ;
   }

   public java.util.Vector getGencentrocostocollection( )
   {
      return gxTv_SdtSDTUsuarios_Gencentrocostocollection ;
   }

   public void setGencentrocostocollection( java.util.Vector value )
   {
      gxTv_SdtSDTUsuarios_Gencentrocostocollection = value ;
   }

   public java.util.Vector getSegrolcollection( )
   {
      return gxTv_SdtSDTUsuarios_Segrolcollection ;
   }

   public void setSegrolcollection( java.util.Vector value )
   {
      gxTv_SdtSDTUsuarios_Segrolcollection = value ;
   }

   protected long gxTv_SdtSDTUsuarios_Usuaid ;
   protected long gxTv_SdtSDTUsuarios_Usuacedula ;
   protected String gxTv_SdtSDTUsuarios_Usuaestado ;
   protected String gxTv_SdtSDTUsuarios_Usuatipocontrato ;
   protected String gxTv_SdtSDTUsuarios_Usuacodigo ;
   protected String gxTv_SdtSDTUsuarios_Usuanombre ;
   protected String gxTv_SdtSDTUsuarios_Usuaemail ;
   protected String gxTv_SdtSDTUsuarios_Usuaclave ;
   protected String gxTv_SdtSDTUsuarios_Usuausuaprueba ;
   protected String gxTv_SdtSDTUsuarios_Usuausuariocrea ;
   protected String gxTv_SdtSDTUsuarios_Usuausuariomodifica ;
   protected java.util.Date gxTv_SdtSDTUsuarios_Usuafechacrea ;
   protected java.util.Date gxTv_SdtSDTUsuarios_Usuafechamodifica ;
   protected java.util.Vector gxTv_SdtSDTUsuarios_Gencentrocostocollection=null ;
   protected java.util.Vector gxTv_SdtSDTUsuarios_Segrolcollection=null ;
}

