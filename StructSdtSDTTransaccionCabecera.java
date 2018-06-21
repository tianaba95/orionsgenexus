/*
               File: StructSdtSDTTransaccionCabecera
        Description: SDTTransaccionCabecera
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:20.50
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTTransaccionCabecera implements Cloneable, java.io.Serializable
{
   public StructSdtSDTTransaccionCabecera( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTTransaccionCabecera_Tranregionabrev = "" ;
      gxTv_SdtSDTTransaccionCabecera_Tranindes = "" ;
      gxTv_SdtSDTTransaccionCabecera_Trancodigomovimiento = "" ;
      gxTv_SdtSDTTransaccionCabecera_Tranmoduloorigen = "" ;
      gxTv_SdtSDTTransaccionCabecera_Trancodalmaorigen = "" ;
      gxTv_SdtSDTTransaccionCabecera_Trancodbodeorigen = "" ;
      gxTv_SdtSDTTransaccionCabecera_Tranmodulodestino = "" ;
      gxTv_SdtSDTTransaccionCabecera_Trancodalmadestino = "" ;
      gxTv_SdtSDTTransaccionCabecera_Trancodbodedestino = "" ;
      gxTv_SdtSDTTransaccionCabecera_Tranobservaciones = "" ;
      gxTv_SdtSDTTransaccionCabecera_Tranestado = "" ;
      gxTv_SdtSDTTransaccionCabecera_Tranfecharegistro = cal.getTime() ;
      gxTv_SdtSDTTransaccionCabecera_Tranfecharatificacion = cal.getTime() ;
      gxTv_SdtSDTTransaccionCabecera_Trancentrocostocodigo = "" ;
      gxTv_SdtSDTTransaccionCabecera_Trancursocodigo = "" ;
      gxTv_SdtSDTTransaccionCabecera_Tranareadantecodigo = "" ;
      gxTv_SdtSDTTransaccionCabecera_Trannumeroingreso = "" ;
      gxTv_SdtSDTTransaccionCabecera_Tranfechaingreso = cal.getTime() ;
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

   public short getTranregioncodigo( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Tranregioncodigo ;
   }

   public void setTranregioncodigo( short value )
   {
      gxTv_SdtSDTTransaccionCabecera_Tranregioncodigo = value ;
   }

   public String getTranregionabrev( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Tranregionabrev ;
   }

   public void setTranregionabrev( String value )
   {
      gxTv_SdtSDTTransaccionCabecera_Tranregionabrev = value ;
   }

   public long getTranid( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Tranid ;
   }

   public void setTranid( long value )
   {
      gxTv_SdtSDTTransaccionCabecera_Tranid = value ;
   }

   public String getTranindes( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Tranindes ;
   }

   public void setTranindes( String value )
   {
      gxTv_SdtSDTTransaccionCabecera_Tranindes = value ;
   }

   public String getTrancodigomovimiento( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Trancodigomovimiento ;
   }

   public void setTrancodigomovimiento( String value )
   {
      gxTv_SdtSDTTransaccionCabecera_Trancodigomovimiento = value ;
   }

   public long getTranconsecutivocc( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Tranconsecutivocc ;
   }

   public void setTranconsecutivocc( long value )
   {
      gxTv_SdtSDTTransaccionCabecera_Tranconsecutivocc = value ;
   }

   public String getTranmoduloorigen( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Tranmoduloorigen ;
   }

   public void setTranmoduloorigen( String value )
   {
      gxTv_SdtSDTTransaccionCabecera_Tranmoduloorigen = value ;
   }

   public String getTrancodalmaorigen( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Trancodalmaorigen ;
   }

   public void setTrancodalmaorigen( String value )
   {
      gxTv_SdtSDTTransaccionCabecera_Trancodalmaorigen = value ;
   }

   public String getTrancodbodeorigen( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Trancodbodeorigen ;
   }

   public void setTrancodbodeorigen( String value )
   {
      gxTv_SdtSDTTransaccionCabecera_Trancodbodeorigen = value ;
   }

   public long getTranidcuentadanteorigen( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Tranidcuentadanteorigen ;
   }

   public void setTranidcuentadanteorigen( long value )
   {
      gxTv_SdtSDTTransaccionCabecera_Tranidcuentadanteorigen = value ;
   }

   public long getTranidproveedor( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Tranidproveedor ;
   }

   public void setTranidproveedor( long value )
   {
      gxTv_SdtSDTTransaccionCabecera_Tranidproveedor = value ;
   }

   public String getTranmodulodestino( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Tranmodulodestino ;
   }

   public void setTranmodulodestino( String value )
   {
      gxTv_SdtSDTTransaccionCabecera_Tranmodulodestino = value ;
   }

   public String getTrancodalmadestino( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Trancodalmadestino ;
   }

   public void setTrancodalmadestino( String value )
   {
      gxTv_SdtSDTTransaccionCabecera_Trancodalmadestino = value ;
   }

   public String getTrancodbodedestino( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Trancodbodedestino ;
   }

   public void setTrancodbodedestino( String value )
   {
      gxTv_SdtSDTTransaccionCabecera_Trancodbodedestino = value ;
   }

   public long getTranidcuentadantedestino( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Tranidcuentadantedestino ;
   }

   public void setTranidcuentadantedestino( long value )
   {
      gxTv_SdtSDTTransaccionCabecera_Tranidcuentadantedestino = value ;
   }

   public String getTranobservaciones( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Tranobservaciones ;
   }

   public void setTranobservaciones( String value )
   {
      gxTv_SdtSDTTransaccionCabecera_Tranobservaciones = value ;
   }

   public String getTranestado( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Tranestado ;
   }

   public void setTranestado( String value )
   {
      gxTv_SdtSDTTransaccionCabecera_Tranestado = value ;
   }

   public java.util.Date getTranfecharegistro( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Tranfecharegistro ;
   }

   public void setTranfecharegistro( java.util.Date value )
   {
      gxTv_SdtSDTTransaccionCabecera_Tranfecharegistro = value ;
   }

   public java.util.Date getTranfecharatificacion( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Tranfecharatificacion ;
   }

   public void setTranfecharatificacion( java.util.Date value )
   {
      gxTv_SdtSDTTransaccionCabecera_Tranfecharatificacion = value ;
   }

   public String getTrancentrocostocodigo( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Trancentrocostocodigo ;
   }

   public void setTrancentrocostocodigo( String value )
   {
      gxTv_SdtSDTTransaccionCabecera_Trancentrocostocodigo = value ;
   }

   public String getTrancursocodigo( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Trancursocodigo ;
   }

   public void setTrancursocodigo( String value )
   {
      gxTv_SdtSDTTransaccionCabecera_Trancursocodigo = value ;
   }

   public String getTranareadantecodigo( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Tranareadantecodigo ;
   }

   public void setTranareadantecodigo( String value )
   {
      gxTv_SdtSDTTransaccionCabecera_Tranareadantecodigo = value ;
   }

   public long getTrantipoingreso( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Trantipoingreso ;
   }

   public void setTrantipoingreso( long value )
   {
      gxTv_SdtSDTTransaccionCabecera_Trantipoingreso = value ;
   }

   public String getTrannumeroingreso( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Trannumeroingreso ;
   }

   public void setTrannumeroingreso( String value )
   {
      gxTv_SdtSDTTransaccionCabecera_Trannumeroingreso = value ;
   }

   public java.util.Date getTranfechaingreso( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Tranfechaingreso ;
   }

   public void setTranfechaingreso( java.util.Date value )
   {
      gxTv_SdtSDTTransaccionCabecera_Tranfechaingreso = value ;
   }

   public java.util.Vector getLista( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Lista ;
   }

   public void setLista( java.util.Vector value )
   {
      gxTv_SdtSDTTransaccionCabecera_Lista = value ;
   }

   protected short gxTv_SdtSDTTransaccionCabecera_Tranregioncodigo ;
   protected long gxTv_SdtSDTTransaccionCabecera_Tranid ;
   protected long gxTv_SdtSDTTransaccionCabecera_Tranconsecutivocc ;
   protected long gxTv_SdtSDTTransaccionCabecera_Tranidcuentadanteorigen ;
   protected long gxTv_SdtSDTTransaccionCabecera_Tranidproveedor ;
   protected long gxTv_SdtSDTTransaccionCabecera_Tranidcuentadantedestino ;
   protected long gxTv_SdtSDTTransaccionCabecera_Trantipoingreso ;
   protected String gxTv_SdtSDTTransaccionCabecera_Tranestado ;
   protected String gxTv_SdtSDTTransaccionCabecera_Trannumeroingreso ;
   protected String gxTv_SdtSDTTransaccionCabecera_Tranobservaciones ;
   protected String gxTv_SdtSDTTransaccionCabecera_Tranregionabrev ;
   protected String gxTv_SdtSDTTransaccionCabecera_Tranindes ;
   protected String gxTv_SdtSDTTransaccionCabecera_Trancodigomovimiento ;
   protected String gxTv_SdtSDTTransaccionCabecera_Tranmoduloorigen ;
   protected String gxTv_SdtSDTTransaccionCabecera_Trancodalmaorigen ;
   protected String gxTv_SdtSDTTransaccionCabecera_Trancodbodeorigen ;
   protected String gxTv_SdtSDTTransaccionCabecera_Tranmodulodestino ;
   protected String gxTv_SdtSDTTransaccionCabecera_Trancodalmadestino ;
   protected String gxTv_SdtSDTTransaccionCabecera_Trancodbodedestino ;
   protected String gxTv_SdtSDTTransaccionCabecera_Trancentrocostocodigo ;
   protected String gxTv_SdtSDTTransaccionCabecera_Trancursocodigo ;
   protected String gxTv_SdtSDTTransaccionCabecera_Tranareadantecodigo ;
   protected java.util.Date gxTv_SdtSDTTransaccionCabecera_Tranfecharegistro ;
   protected java.util.Date gxTv_SdtSDTTransaccionCabecera_Tranfecharatificacion ;
   protected java.util.Date gxTv_SdtSDTTransaccionCabecera_Tranfechaingreso ;
   protected java.util.Vector gxTv_SdtSDTTransaccionCabecera_Lista=null ;
}

