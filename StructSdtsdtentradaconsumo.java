/*
               File: StructSdtsdtentradaconsumo
        Description: sdtentradaconsumo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:17.81
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtsdtentradaconsumo implements Cloneable, java.io.Serializable
{
   public StructSdtsdtentradaconsumo( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_Sdtsdtentradaconsumo_Tranregionabrev = "" ;
      gxTv_Sdtsdtentradaconsumo_Tranmoduloorigen = "" ;
      gxTv_Sdtsdtentradaconsumo_Tranfecharegistro = cal.getTime() ;
      gxTv_Sdtsdtentradaconsumo_Tranfecharatificacion = cal.getTime() ;
      gxTv_Sdtsdtentradaconsumo_Trancodalmaorigen = "" ;
      gxTv_Sdtsdtentradaconsumo_Trancodbodeorigen = "" ;
      gxTv_Sdtsdtentradaconsumo_Tranestado = "" ;
      gxTv_Sdtsdtentradaconsumo_Trancentrocostocodigo = "" ;
      gxTv_Sdtsdtentradaconsumo_Tranareadantecodigo = "" ;
      gxTv_Sdtsdtentradaconsumo_Trancursocodigo = "" ;
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
      return gxTv_Sdtsdtentradaconsumo_Tranregioncodigo ;
   }

   public void setTranregioncodigo( int value )
   {
      gxTv_Sdtsdtentradaconsumo_Tranregioncodigo = value ;
   }

   public short getTranregionid( )
   {
      return gxTv_Sdtsdtentradaconsumo_Tranregionid ;
   }

   public void setTranregionid( short value )
   {
      gxTv_Sdtsdtentradaconsumo_Tranregionid = value ;
   }

   public String getTranregionabrev( )
   {
      return gxTv_Sdtsdtentradaconsumo_Tranregionabrev ;
   }

   public void setTranregionabrev( String value )
   {
      gxTv_Sdtsdtentradaconsumo_Tranregionabrev = value ;
   }

   public long getTranid( )
   {
      return gxTv_Sdtsdtentradaconsumo_Tranid ;
   }

   public void setTranid( long value )
   {
      gxTv_Sdtsdtentradaconsumo_Tranid = value ;
   }

   public long getTranconsecutivocc( )
   {
      return gxTv_Sdtsdtentradaconsumo_Tranconsecutivocc ;
   }

   public void setTranconsecutivocc( long value )
   {
      gxTv_Sdtsdtentradaconsumo_Tranconsecutivocc = value ;
   }

   public String getTranmoduloorigen( )
   {
      return gxTv_Sdtsdtentradaconsumo_Tranmoduloorigen ;
   }

   public void setTranmoduloorigen( String value )
   {
      gxTv_Sdtsdtentradaconsumo_Tranmoduloorigen = value ;
   }

   public java.util.Date getTranfecharegistro( )
   {
      return gxTv_Sdtsdtentradaconsumo_Tranfecharegistro ;
   }

   public void setTranfecharegistro( java.util.Date value )
   {
      gxTv_Sdtsdtentradaconsumo_Tranfecharegistro = value ;
   }

   public java.util.Date getTranfecharatificacion( )
   {
      return gxTv_Sdtsdtentradaconsumo_Tranfecharatificacion ;
   }

   public void setTranfecharatificacion( java.util.Date value )
   {
      gxTv_Sdtsdtentradaconsumo_Tranfecharatificacion = value ;
   }

   public String getTrancodalmaorigen( )
   {
      return gxTv_Sdtsdtentradaconsumo_Trancodalmaorigen ;
   }

   public void setTrancodalmaorigen( String value )
   {
      gxTv_Sdtsdtentradaconsumo_Trancodalmaorigen = value ;
   }

   public String getTrancodbodeorigen( )
   {
      return gxTv_Sdtsdtentradaconsumo_Trancodbodeorigen ;
   }

   public void setTrancodbodeorigen( String value )
   {
      gxTv_Sdtsdtentradaconsumo_Trancodbodeorigen = value ;
   }

   public long getTranidcuentadanteorigen( )
   {
      return gxTv_Sdtsdtentradaconsumo_Tranidcuentadanteorigen ;
   }

   public void setTranidcuentadanteorigen( long value )
   {
      gxTv_Sdtsdtentradaconsumo_Tranidcuentadanteorigen = value ;
   }

   public long getTranidproveedor( )
   {
      return gxTv_Sdtsdtentradaconsumo_Tranidproveedor ;
   }

   public void setTranidproveedor( long value )
   {
      gxTv_Sdtsdtentradaconsumo_Tranidproveedor = value ;
   }

   public String getTranestado( )
   {
      return gxTv_Sdtsdtentradaconsumo_Tranestado ;
   }

   public void setTranestado( String value )
   {
      gxTv_Sdtsdtentradaconsumo_Tranestado = value ;
   }

   public String getTrancentrocostocodigo( )
   {
      return gxTv_Sdtsdtentradaconsumo_Trancentrocostocodigo ;
   }

   public void setTrancentrocostocodigo( String value )
   {
      gxTv_Sdtsdtentradaconsumo_Trancentrocostocodigo = value ;
   }

   public String getTranareadantecodigo( )
   {
      return gxTv_Sdtsdtentradaconsumo_Tranareadantecodigo ;
   }

   public void setTranareadantecodigo( String value )
   {
      gxTv_Sdtsdtentradaconsumo_Tranareadantecodigo = value ;
   }

   public String getTrancursocodigo( )
   {
      return gxTv_Sdtsdtentradaconsumo_Trancursocodigo ;
   }

   public void setTrancursocodigo( String value )
   {
      gxTv_Sdtsdtentradaconsumo_Trancursocodigo = value ;
   }

   public java.util.Vector getDetalles( )
   {
      return gxTv_Sdtsdtentradaconsumo_Detalles ;
   }

   public void setDetalles( java.util.Vector value )
   {
      gxTv_Sdtsdtentradaconsumo_Detalles = value ;
   }

   protected short gxTv_Sdtsdtentradaconsumo_Tranregionid ;
   protected int gxTv_Sdtsdtentradaconsumo_Tranregioncodigo ;
   protected long gxTv_Sdtsdtentradaconsumo_Tranid ;
   protected long gxTv_Sdtsdtentradaconsumo_Tranconsecutivocc ;
   protected long gxTv_Sdtsdtentradaconsumo_Tranidcuentadanteorigen ;
   protected long gxTv_Sdtsdtentradaconsumo_Tranidproveedor ;
   protected String gxTv_Sdtsdtentradaconsumo_Tranestado ;
   protected String gxTv_Sdtsdtentradaconsumo_Tranregionabrev ;
   protected String gxTv_Sdtsdtentradaconsumo_Tranmoduloorigen ;
   protected String gxTv_Sdtsdtentradaconsumo_Trancodalmaorigen ;
   protected String gxTv_Sdtsdtentradaconsumo_Trancodbodeorigen ;
   protected String gxTv_Sdtsdtentradaconsumo_Trancentrocostocodigo ;
   protected String gxTv_Sdtsdtentradaconsumo_Tranareadantecodigo ;
   protected String gxTv_Sdtsdtentradaconsumo_Trancursocodigo ;
   protected java.util.Date gxTv_Sdtsdtentradaconsumo_Tranfecharegistro ;
   protected java.util.Date gxTv_Sdtsdtentradaconsumo_Tranfecharatificacion ;
   protected java.util.Vector gxTv_Sdtsdtentradaconsumo_Detalles=null ;
}

