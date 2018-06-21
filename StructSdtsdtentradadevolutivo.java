/*
               File: StructSdtsdtentradadevolutivo
        Description: sdtentradadevolutivo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:18.7
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtsdtentradadevolutivo implements Cloneable, java.io.Serializable
{
   public StructSdtsdtentradadevolutivo( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_Sdtsdtentradadevolutivo_Tranregionabrev = "" ;
      gxTv_Sdtsdtentradadevolutivo_Tranfecharegistro = cal.getTime() ;
      gxTv_Sdtsdtentradadevolutivo_Trancodalmaorigen = "" ;
      gxTv_Sdtsdtentradadevolutivo_Tranmoduloorigen = "" ;
      gxTv_Sdtsdtentradadevolutivo_Trancodbodeorigen = "" ;
      gxTv_Sdtsdtentradadevolutivo_Tranfecharatificacion = cal.getTime() ;
      gxTv_Sdtsdtentradadevolutivo_Tranestado = "" ;
      gxTv_Sdtsdtentradadevolutivo_Trancentrocostocodigo = "" ;
      gxTv_Sdtsdtentradadevolutivo_Tranareadantecodigo = "" ;
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
      return gxTv_Sdtsdtentradadevolutivo_Tranregioncodigo ;
   }

   public void setTranregioncodigo( int value )
   {
      gxTv_Sdtsdtentradadevolutivo_Tranregioncodigo = value ;
   }

   public short getTranregionid( )
   {
      return gxTv_Sdtsdtentradadevolutivo_Tranregionid ;
   }

   public void setTranregionid( short value )
   {
      gxTv_Sdtsdtentradadevolutivo_Tranregionid = value ;
   }

   public String getTranregionabrev( )
   {
      return gxTv_Sdtsdtentradadevolutivo_Tranregionabrev ;
   }

   public void setTranregionabrev( String value )
   {
      gxTv_Sdtsdtentradadevolutivo_Tranregionabrev = value ;
   }

   public long getTranid( )
   {
      return gxTv_Sdtsdtentradadevolutivo_Tranid ;
   }

   public void setTranid( long value )
   {
      gxTv_Sdtsdtentradadevolutivo_Tranid = value ;
   }

   public long getTranconsecutivocc( )
   {
      return gxTv_Sdtsdtentradadevolutivo_Tranconsecutivocc ;
   }

   public void setTranconsecutivocc( long value )
   {
      gxTv_Sdtsdtentradadevolutivo_Tranconsecutivocc = value ;
   }

   public java.util.Date getTranfecharegistro( )
   {
      return gxTv_Sdtsdtentradadevolutivo_Tranfecharegistro ;
   }

   public void setTranfecharegistro( java.util.Date value )
   {
      gxTv_Sdtsdtentradadevolutivo_Tranfecharegistro = value ;
   }

   public String getTrancodalmaorigen( )
   {
      return gxTv_Sdtsdtentradadevolutivo_Trancodalmaorigen ;
   }

   public void setTrancodalmaorigen( String value )
   {
      gxTv_Sdtsdtentradadevolutivo_Trancodalmaorigen = value ;
   }

   public String getTranmoduloorigen( )
   {
      return gxTv_Sdtsdtentradadevolutivo_Tranmoduloorigen ;
   }

   public void setTranmoduloorigen( String value )
   {
      gxTv_Sdtsdtentradadevolutivo_Tranmoduloorigen = value ;
   }

   public String getTrancodbodeorigen( )
   {
      return gxTv_Sdtsdtentradadevolutivo_Trancodbodeorigen ;
   }

   public void setTrancodbodeorigen( String value )
   {
      gxTv_Sdtsdtentradadevolutivo_Trancodbodeorigen = value ;
   }

   public long getTranidcuentadanteorigen( )
   {
      return gxTv_Sdtsdtentradadevolutivo_Tranidcuentadanteorigen ;
   }

   public void setTranidcuentadanteorigen( long value )
   {
      gxTv_Sdtsdtentradadevolutivo_Tranidcuentadanteorigen = value ;
   }

   public long getTranidproveedor( )
   {
      return gxTv_Sdtsdtentradadevolutivo_Tranidproveedor ;
   }

   public void setTranidproveedor( long value )
   {
      gxTv_Sdtsdtentradadevolutivo_Tranidproveedor = value ;
   }

   public java.util.Date getTranfecharatificacion( )
   {
      return gxTv_Sdtsdtentradadevolutivo_Tranfecharatificacion ;
   }

   public void setTranfecharatificacion( java.util.Date value )
   {
      gxTv_Sdtsdtentradadevolutivo_Tranfecharatificacion = value ;
   }

   public String getTranestado( )
   {
      return gxTv_Sdtsdtentradadevolutivo_Tranestado ;
   }

   public void setTranestado( String value )
   {
      gxTv_Sdtsdtentradadevolutivo_Tranestado = value ;
   }

   public String getTrancentrocostocodigo( )
   {
      return gxTv_Sdtsdtentradadevolutivo_Trancentrocostocodigo ;
   }

   public void setTrancentrocostocodigo( String value )
   {
      gxTv_Sdtsdtentradadevolutivo_Trancentrocostocodigo = value ;
   }

   public String getTranareadantecodigo( )
   {
      return gxTv_Sdtsdtentradadevolutivo_Tranareadantecodigo ;
   }

   public void setTranareadantecodigo( String value )
   {
      gxTv_Sdtsdtentradadevolutivo_Tranareadantecodigo = value ;
   }

   public java.util.Vector getDetalles( )
   {
      return gxTv_Sdtsdtentradadevolutivo_Detalles ;
   }

   public void setDetalles( java.util.Vector value )
   {
      gxTv_Sdtsdtentradadevolutivo_Detalles = value ;
   }

   protected short gxTv_Sdtsdtentradadevolutivo_Tranregionid ;
   protected int gxTv_Sdtsdtentradadevolutivo_Tranregioncodigo ;
   protected long gxTv_Sdtsdtentradadevolutivo_Tranid ;
   protected long gxTv_Sdtsdtentradadevolutivo_Tranconsecutivocc ;
   protected long gxTv_Sdtsdtentradadevolutivo_Tranidcuentadanteorigen ;
   protected long gxTv_Sdtsdtentradadevolutivo_Tranidproveedor ;
   protected String gxTv_Sdtsdtentradadevolutivo_Tranestado ;
   protected String gxTv_Sdtsdtentradadevolutivo_Tranregionabrev ;
   protected String gxTv_Sdtsdtentradadevolutivo_Trancodalmaorigen ;
   protected String gxTv_Sdtsdtentradadevolutivo_Tranmoduloorigen ;
   protected String gxTv_Sdtsdtentradadevolutivo_Trancodbodeorigen ;
   protected String gxTv_Sdtsdtentradadevolutivo_Trancentrocostocodigo ;
   protected String gxTv_Sdtsdtentradadevolutivo_Tranareadantecodigo ;
   protected java.util.Date gxTv_Sdtsdtentradadevolutivo_Tranfecharegistro ;
   protected java.util.Date gxTv_Sdtsdtentradadevolutivo_Tranfecharatificacion ;
   protected java.util.Vector gxTv_Sdtsdtentradadevolutivo_Detalles=null ;
}

