/*
               File: StructSdtsdtsalidaconsumo
        Description: sdtsalidaconsumo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:19.93
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtsdtsalidaconsumo implements Cloneable, java.io.Serializable
{
   public StructSdtsdtsalidaconsumo( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_Sdtsdtsalidaconsumo_Tranregionabrev = "" ;
      gxTv_Sdtsdtsalidaconsumo_Tranmodulodestino = "" ;
      gxTv_Sdtsdtsalidaconsumo_Tranfecharegistro = cal.getTime() ;
      gxTv_Sdtsdtsalidaconsumo_Trancodalmadestino = "" ;
      gxTv_Sdtsdtsalidaconsumo_Trancodbodedestino = "" ;
      gxTv_Sdtsdtsalidaconsumo_Tranestado = "" ;
      gxTv_Sdtsdtsalidaconsumo_Trancentrocostocodigo = "" ;
      gxTv_Sdtsdtsalidaconsumo_Trancentrocostocodigodestino = "" ;
      gxTv_Sdtsdtsalidaconsumo_Trancursocodigo = "" ;
      gxTv_Sdtsdtsalidaconsumo_Tranareadantecodigo = "" ;
      gxTv_Sdtsdtsalidaconsumo_Tipodeelemento = "" ;
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

   public int getTranregioncodigo( )
   {
      return gxTv_Sdtsdtsalidaconsumo_Tranregioncodigo ;
   }

   public void setTranregioncodigo( int value )
   {
      gxTv_Sdtsdtsalidaconsumo_Tranregioncodigo = value ;
   }

   public String getTranregionabrev( )
   {
      return gxTv_Sdtsdtsalidaconsumo_Tranregionabrev ;
   }

   public void setTranregionabrev( String value )
   {
      gxTv_Sdtsdtsalidaconsumo_Tranregionabrev = value ;
   }

   public long getTranid( )
   {
      return gxTv_Sdtsdtsalidaconsumo_Tranid ;
   }

   public void setTranid( long value )
   {
      gxTv_Sdtsdtsalidaconsumo_Tranid = value ;
   }

   public long getTranconsecutivocc( )
   {
      return gxTv_Sdtsdtsalidaconsumo_Tranconsecutivocc ;
   }

   public void setTranconsecutivocc( long value )
   {
      gxTv_Sdtsdtsalidaconsumo_Tranconsecutivocc = value ;
   }

   public String getTranmodulodestino( )
   {
      return gxTv_Sdtsdtsalidaconsumo_Tranmodulodestino ;
   }

   public void setTranmodulodestino( String value )
   {
      gxTv_Sdtsdtsalidaconsumo_Tranmodulodestino = value ;
   }

   public java.util.Date getTranfecharegistro( )
   {
      return gxTv_Sdtsdtsalidaconsumo_Tranfecharegistro ;
   }

   public void setTranfecharegistro( java.util.Date value )
   {
      gxTv_Sdtsdtsalidaconsumo_Tranfecharegistro = value ;
   }

   public String getTrancodalmadestino( )
   {
      return gxTv_Sdtsdtsalidaconsumo_Trancodalmadestino ;
   }

   public void setTrancodalmadestino( String value )
   {
      gxTv_Sdtsdtsalidaconsumo_Trancodalmadestino = value ;
   }

   public String getTrancodbodedestino( )
   {
      return gxTv_Sdtsdtsalidaconsumo_Trancodbodedestino ;
   }

   public void setTrancodbodedestino( String value )
   {
      gxTv_Sdtsdtsalidaconsumo_Trancodbodedestino = value ;
   }

   public long getTranidcuentadantedestino( )
   {
      return gxTv_Sdtsdtsalidaconsumo_Tranidcuentadantedestino ;
   }

   public void setTranidcuentadantedestino( long value )
   {
      gxTv_Sdtsdtsalidaconsumo_Tranidcuentadantedestino = value ;
   }

   public String getTranestado( )
   {
      return gxTv_Sdtsdtsalidaconsumo_Tranestado ;
   }

   public void setTranestado( String value )
   {
      gxTv_Sdtsdtsalidaconsumo_Tranestado = value ;
   }

   public String getTrancentrocostocodigo( )
   {
      return gxTv_Sdtsdtsalidaconsumo_Trancentrocostocodigo ;
   }

   public void setTrancentrocostocodigo( String value )
   {
      gxTv_Sdtsdtsalidaconsumo_Trancentrocostocodigo = value ;
   }

   public String getTrancentrocostocodigodestino( )
   {
      return gxTv_Sdtsdtsalidaconsumo_Trancentrocostocodigodestino ;
   }

   public void setTrancentrocostocodigodestino( String value )
   {
      gxTv_Sdtsdtsalidaconsumo_Trancentrocostocodigodestino = value ;
   }

   public String getTrancursocodigo( )
   {
      return gxTv_Sdtsdtsalidaconsumo_Trancursocodigo ;
   }

   public void setTrancursocodigo( String value )
   {
      gxTv_Sdtsdtsalidaconsumo_Trancursocodigo = value ;
   }

   public String getTranareadantecodigo( )
   {
      return gxTv_Sdtsdtsalidaconsumo_Tranareadantecodigo ;
   }

   public void setTranareadantecodigo( String value )
   {
      gxTv_Sdtsdtsalidaconsumo_Tranareadantecodigo = value ;
   }

   public String getTipodeelemento( )
   {
      return gxTv_Sdtsdtsalidaconsumo_Tipodeelemento ;
   }

   public void setTipodeelemento( String value )
   {
      gxTv_Sdtsdtsalidaconsumo_Tipodeelemento = value ;
   }

   public java.util.Vector getDetalles( )
   {
      return gxTv_Sdtsdtsalidaconsumo_Detalles ;
   }

   public void setDetalles( java.util.Vector value )
   {
      gxTv_Sdtsdtsalidaconsumo_Detalles = value ;
   }

   protected int gxTv_Sdtsdtsalidaconsumo_Tranregioncodigo ;
   protected long gxTv_Sdtsdtsalidaconsumo_Tranid ;
   protected long gxTv_Sdtsdtsalidaconsumo_Tranconsecutivocc ;
   protected long gxTv_Sdtsdtsalidaconsumo_Tranidcuentadantedestino ;
   protected String gxTv_Sdtsdtsalidaconsumo_Tranestado ;
   protected String gxTv_Sdtsdtsalidaconsumo_Tranregionabrev ;
   protected String gxTv_Sdtsdtsalidaconsumo_Tranmodulodestino ;
   protected String gxTv_Sdtsdtsalidaconsumo_Trancodalmadestino ;
   protected String gxTv_Sdtsdtsalidaconsumo_Trancodbodedestino ;
   protected String gxTv_Sdtsdtsalidaconsumo_Trancentrocostocodigo ;
   protected String gxTv_Sdtsdtsalidaconsumo_Trancentrocostocodigodestino ;
   protected String gxTv_Sdtsdtsalidaconsumo_Trancursocodigo ;
   protected String gxTv_Sdtsdtsalidaconsumo_Tranareadantecodigo ;
   protected String gxTv_Sdtsdtsalidaconsumo_Tipodeelemento ;
   protected java.util.Date gxTv_Sdtsdtsalidaconsumo_Tranfecharegistro ;
   protected java.util.Vector gxTv_Sdtsdtsalidaconsumo_Detalles=null ;
}

