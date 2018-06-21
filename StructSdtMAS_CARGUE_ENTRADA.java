/*
               File: StructSdtMAS_CARGUE_ENTRADA
        Description: MAS_CARGUE_ENTRADA
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:30.20
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtMAS_CARGUE_ENTRADA implements Cloneable, java.io.Serializable
{
   public StructSdtMAS_CARGUE_ENTRADA( )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada = "" ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion = new java.math.BigDecimal(0) ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada = "" ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo = new java.math.BigDecimal(0) ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Interes = new java.math.BigDecimal(0) ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos = new java.math.BigDecimal(0) ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Marca = "" ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Modelo = "" ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Serial = "" ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Mode = "" ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_Z = "" ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_Z = "" ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Interes_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Marca_Z = "" ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Modelo_Z = "" ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Serial_Z = "" ;
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

   public long getNrotransaccion( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion ;
   }

   public void setNrotransaccion( long value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion = value ;
   }

   public short getIdcarmas( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas ;
   }

   public void setIdcarmas( short value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas = value ;
   }

   public String getConsecutivoentrada( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada ;
   }

   public void setConsecutivoentrada( String value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada = value ;
   }

   public java.math.BigDecimal getCostoadquisicion( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion ;
   }

   public void setCostoadquisicion( java.math.BigDecimal value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion = value ;
   }

   public String getDescripcionentrada( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada ;
   }

   public void setDescripcionentrada( String value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada = value ;
   }

   public int getCantidadentrada( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada ;
   }

   public void setCantidadentrada( int value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada = value ;
   }

   public short getIndicadorphi( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi ;
   }

   public void setIndicadorphi( short value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi = value ;
   }

   public java.math.BigDecimal getValorfuturo( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo ;
   }

   public void setValorfuturo( java.math.BigDecimal value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo = value ;
   }

   public short getTiempo( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Tiempo ;
   }

   public void setTiempo( short value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Tiempo = value ;
   }

   public java.math.BigDecimal getInteres( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Interes ;
   }

   public void setInteres( java.math.BigDecimal value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Interes = value ;
   }

   public short getVidautil( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Vidautil ;
   }

   public void setVidautil( short value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Vidautil = value ;
   }

   public java.math.BigDecimal getOtroscostos( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos ;
   }

   public void setOtroscostos( java.math.BigDecimal value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos = value ;
   }

   public String getMarca( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Marca ;
   }

   public void setMarca( String value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Marca = value ;
   }

   public String getModelo( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Modelo ;
   }

   public void setModelo( String value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Modelo = value ;
   }

   public String getSerial( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Serial ;
   }

   public void setSerial( String value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Serial = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Initialized = value ;
   }

   public long getNrotransaccion_Z( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion_Z ;
   }

   public void setNrotransaccion_Z( long value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion_Z = value ;
   }

   public short getIdcarmas_Z( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas_Z ;
   }

   public void setIdcarmas_Z( short value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas_Z = value ;
   }

   public String getConsecutivoentrada_Z( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_Z ;
   }

   public void setConsecutivoentrada_Z( String value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_Z = value ;
   }

   public java.math.BigDecimal getCostoadquisicion_Z( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_Z ;
   }

   public void setCostoadquisicion_Z( java.math.BigDecimal value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_Z = value ;
   }

   public String getDescripcionentrada_Z( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_Z ;
   }

   public void setDescripcionentrada_Z( String value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_Z = value ;
   }

   public int getCantidadentrada_Z( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_Z ;
   }

   public void setCantidadentrada_Z( int value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_Z = value ;
   }

   public short getIndicadorphi_Z( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi_Z ;
   }

   public void setIndicadorphi_Z( short value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi_Z = value ;
   }

   public java.math.BigDecimal getValorfuturo_Z( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo_Z ;
   }

   public void setValorfuturo_Z( java.math.BigDecimal value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo_Z = value ;
   }

   public short getTiempo_Z( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Tiempo_Z ;
   }

   public void setTiempo_Z( short value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Tiempo_Z = value ;
   }

   public java.math.BigDecimal getInteres_Z( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Interes_Z ;
   }

   public void setInteres_Z( java.math.BigDecimal value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Interes_Z = value ;
   }

   public short getVidautil_Z( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Vidautil_Z ;
   }

   public void setVidautil_Z( short value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Vidautil_Z = value ;
   }

   public java.math.BigDecimal getOtroscostos_Z( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos_Z ;
   }

   public void setOtroscostos_Z( java.math.BigDecimal value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos_Z = value ;
   }

   public String getMarca_Z( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Marca_Z ;
   }

   public void setMarca_Z( String value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Marca_Z = value ;
   }

   public String getModelo_Z( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Modelo_Z ;
   }

   public void setModelo_Z( String value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Modelo_Z = value ;
   }

   public String getSerial_Z( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Serial_Z ;
   }

   public void setSerial_Z( String value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Serial_Z = value ;
   }

   public byte getConsecutivoentrada_N( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_N ;
   }

   public void setConsecutivoentrada_N( byte value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_N = value ;
   }

   public byte getCostoadquisicion_N( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_N ;
   }

   public void setCostoadquisicion_N( byte value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_N = value ;
   }

   public byte getDescripcionentrada_N( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_N ;
   }

   public void setDescripcionentrada_N( byte value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_N = value ;
   }

   public byte getCantidadentrada_N( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_N ;
   }

   public void setCantidadentrada_N( byte value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_N = value ;
   }

   protected byte gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_N ;
   protected byte gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_N ;
   protected byte gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_N ;
   protected byte gxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_N ;
   protected short gxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas ;
   protected short gxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi ;
   protected short gxTv_SdtMAS_CARGUE_ENTRADA_Tiempo ;
   protected short gxTv_SdtMAS_CARGUE_ENTRADA_Vidautil ;
   protected short gxTv_SdtMAS_CARGUE_ENTRADA_Initialized ;
   protected short gxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas_Z ;
   protected short gxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi_Z ;
   protected short gxTv_SdtMAS_CARGUE_ENTRADA_Tiempo_Z ;
   protected short gxTv_SdtMAS_CARGUE_ENTRADA_Vidautil_Z ;
   protected int gxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada ;
   protected int gxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_Z ;
   protected long gxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion ;
   protected long gxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion_Z ;
   protected String gxTv_SdtMAS_CARGUE_ENTRADA_Mode ;
   protected String gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada ;
   protected String gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada ;
   protected String gxTv_SdtMAS_CARGUE_ENTRADA_Marca ;
   protected String gxTv_SdtMAS_CARGUE_ENTRADA_Modelo ;
   protected String gxTv_SdtMAS_CARGUE_ENTRADA_Serial ;
   protected String gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_Z ;
   protected String gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_Z ;
   protected String gxTv_SdtMAS_CARGUE_ENTRADA_Marca_Z ;
   protected String gxTv_SdtMAS_CARGUE_ENTRADA_Modelo_Z ;
   protected String gxTv_SdtMAS_CARGUE_ENTRADA_Serial_Z ;
   protected java.math.BigDecimal gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion ;
   protected java.math.BigDecimal gxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo ;
   protected java.math.BigDecimal gxTv_SdtMAS_CARGUE_ENTRADA_Interes ;
   protected java.math.BigDecimal gxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos ;
   protected java.math.BigDecimal gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_Z ;
   protected java.math.BigDecimal gxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo_Z ;
   protected java.math.BigDecimal gxTv_SdtMAS_CARGUE_ENTRADA_Interes_Z ;
   protected java.math.BigDecimal gxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos_Z ;
}

