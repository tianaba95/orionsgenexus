/*
               File: StructSdtsdtsalidadevolutivo
        Description: sdtsalidadevolutivo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:20.14
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtsdtsalidadevolutivo implements Cloneable, java.io.Serializable
{
   public StructSdtsdtsalidadevolutivo( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_Sdtsdtsalidadevolutivo_Tranregionabrev = "" ;
      gxTv_Sdtsdtsalidadevolutivo_Tranmoduloorigen = "" ;
      gxTv_Sdtsdtsalidadevolutivo_Tranmodulodestino = "" ;
      gxTv_Sdtsdtsalidadevolutivo_Tranfecharegistro = cal.getTime() ;
      gxTv_Sdtsdtsalidadevolutivo_Trancodalmaorigen = "" ;
      gxTv_Sdtsdtsalidadevolutivo_Trancodalmadestino = "" ;
      gxTv_Sdtsdtsalidadevolutivo_Trancodbodeorigen = "" ;
      gxTv_Sdtsdtsalidadevolutivo_Trancodbodedestino = "" ;
      gxTv_Sdtsdtsalidadevolutivo_Tranestado = "" ;
      gxTv_Sdtsdtsalidadevolutivo_Trancentrocostocodigo = "" ;
      gxTv_Sdtsdtsalidadevolutivo_Trancentrocostocodigodestino = "" ;
      gxTv_Sdtsdtsalidadevolutivo_Trancursocodigo = "" ;
      gxTv_Sdtsdtsalidadevolutivo_Tranareadantecodigo = "" ;
      gxTv_Sdtsdtsalidadevolutivo_Tipodeelemento = "" ;
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
      return gxTv_Sdtsdtsalidadevolutivo_Tranregioncodigo ;
   }

   public void setTranregioncodigo( int value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Tranregioncodigo = value ;
   }

   public String getTranregionabrev( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Tranregionabrev ;
   }

   public void setTranregionabrev( String value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Tranregionabrev = value ;
   }

   public long getTranid( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Tranid ;
   }

   public void setTranid( long value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Tranid = value ;
   }

   public long getTranconsecutivocc( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Tranconsecutivocc ;
   }

   public void setTranconsecutivocc( long value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Tranconsecutivocc = value ;
   }

   public String getTranmoduloorigen( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Tranmoduloorigen ;
   }

   public void setTranmoduloorigen( String value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Tranmoduloorigen = value ;
   }

   public String getTranmodulodestino( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Tranmodulodestino ;
   }

   public void setTranmodulodestino( String value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Tranmodulodestino = value ;
   }

   public java.util.Date getTranfecharegistro( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Tranfecharegistro ;
   }

   public void setTranfecharegistro( java.util.Date value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Tranfecharegistro = value ;
   }

   public String getTrancodalmaorigen( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Trancodalmaorigen ;
   }

   public void setTrancodalmaorigen( String value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Trancodalmaorigen = value ;
   }

   public String getTrancodalmadestino( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Trancodalmadestino ;
   }

   public void setTrancodalmadestino( String value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Trancodalmadestino = value ;
   }

   public String getTrancodbodeorigen( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Trancodbodeorigen ;
   }

   public void setTrancodbodeorigen( String value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Trancodbodeorigen = value ;
   }

   public String getTrancodbodedestino( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Trancodbodedestino ;
   }

   public void setTrancodbodedestino( String value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Trancodbodedestino = value ;
   }

   public long getTranidcuentadantedestino( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Tranidcuentadantedestino ;
   }

   public void setTranidcuentadantedestino( long value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Tranidcuentadantedestino = value ;
   }

   public String getTranestado( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Tranestado ;
   }

   public void setTranestado( String value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Tranestado = value ;
   }

   public String getTrancentrocostocodigo( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Trancentrocostocodigo ;
   }

   public void setTrancentrocostocodigo( String value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Trancentrocostocodigo = value ;
   }

   public String getTrancentrocostocodigodestino( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Trancentrocostocodigodestino ;
   }

   public void setTrancentrocostocodigodestino( String value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Trancentrocostocodigodestino = value ;
   }

   public String getTrancursocodigo( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Trancursocodigo ;
   }

   public void setTrancursocodigo( String value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Trancursocodigo = value ;
   }

   public String getTranareadantecodigo( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Tranareadantecodigo ;
   }

   public void setTranareadantecodigo( String value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Tranareadantecodigo = value ;
   }

   public String getTipodeelemento( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Tipodeelemento ;
   }

   public void setTipodeelemento( String value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Tipodeelemento = value ;
   }

   public java.util.Vector getDetalles( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Detalles ;
   }

   public void setDetalles( java.util.Vector value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Detalles = value ;
   }

   protected int gxTv_Sdtsdtsalidadevolutivo_Tranregioncodigo ;
   protected long gxTv_Sdtsdtsalidadevolutivo_Tranid ;
   protected long gxTv_Sdtsdtsalidadevolutivo_Tranconsecutivocc ;
   protected long gxTv_Sdtsdtsalidadevolutivo_Tranidcuentadantedestino ;
   protected String gxTv_Sdtsdtsalidadevolutivo_Tranestado ;
   protected String gxTv_Sdtsdtsalidadevolutivo_Tranregionabrev ;
   protected String gxTv_Sdtsdtsalidadevolutivo_Tranmoduloorigen ;
   protected String gxTv_Sdtsdtsalidadevolutivo_Tranmodulodestino ;
   protected String gxTv_Sdtsdtsalidadevolutivo_Trancodalmaorigen ;
   protected String gxTv_Sdtsdtsalidadevolutivo_Trancodalmadestino ;
   protected String gxTv_Sdtsdtsalidadevolutivo_Trancodbodeorigen ;
   protected String gxTv_Sdtsdtsalidadevolutivo_Trancodbodedestino ;
   protected String gxTv_Sdtsdtsalidadevolutivo_Trancentrocostocodigo ;
   protected String gxTv_Sdtsdtsalidadevolutivo_Trancentrocostocodigodestino ;
   protected String gxTv_Sdtsdtsalidadevolutivo_Trancursocodigo ;
   protected String gxTv_Sdtsdtsalidadevolutivo_Tranareadantecodigo ;
   protected String gxTv_Sdtsdtsalidadevolutivo_Tipodeelemento ;
   protected java.util.Date gxTv_Sdtsdtsalidadevolutivo_Tranfecharegistro ;
   protected java.util.Vector gxTv_Sdtsdtsalidadevolutivo_Detalles=null ;
}

