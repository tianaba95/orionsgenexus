/*
               File: StructSdtSDTALM_RESTRICCIONES
        Description: SDTALM_RESTRICCIONES
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:16.23
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTALM_RESTRICCIONES implements Cloneable, java.io.Serializable
{
   public StructSdtSDTALM_RESTRICCIONES( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovcodigo = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovdescrip = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipoelementodesc = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_regiondescripcion = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostocodigo = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_centrocostodescrip = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmodorigen = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigencodigo = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigendescripcion = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigencodigo = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigendescripcion = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmoddestino = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinocodigo = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinodescripcion = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinocodigo = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinodescripcion = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_estado = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechacrea = cal.getTime() ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_usuariocrea = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechamodifica = cal.getTime() ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_usuariomodifica = "" ;
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

   public long getMbod_id( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_id ;
   }

   public void setMbod_id( long value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_id = value ;
   }

   public String getMbod_tipomovcodigo( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovcodigo ;
   }

   public void setMbod_tipomovcodigo( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovcodigo = value ;
   }

   public String getMbod_tipomovdescrip( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovdescrip ;
   }

   public void setMbod_tipomovdescrip( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovdescrip = value ;
   }

   public long getMbod_tipoelementocod( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipoelementocod ;
   }

   public void setMbod_tipoelementocod( long value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipoelementocod = value ;
   }

   public String getMbod_tipoelementodesc( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipoelementodesc ;
   }

   public void setMbod_tipoelementodesc( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipoelementodesc = value ;
   }

   public long getMbod_regionid( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_regionid ;
   }

   public void setMbod_regionid( long value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_regionid = value ;
   }

   public short getMbod_regioncodigo( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_regioncodigo ;
   }

   public void setMbod_regioncodigo( short value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_regioncodigo = value ;
   }

   public String getMbod_regiondescripcion( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_regiondescripcion ;
   }

   public void setMbod_regiondescripcion( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_regiondescripcion = value ;
   }

   public long getMbod_centcostoid( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostoid ;
   }

   public void setMbod_centcostoid( long value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostoid = value ;
   }

   public String getMbod_centcostocodigo( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostocodigo ;
   }

   public void setMbod_centcostocodigo( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostocodigo = value ;
   }

   public String getMbod_centrocostodescrip( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_centrocostodescrip ;
   }

   public void setMbod_centrocostodescrip( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_centrocostodescrip = value ;
   }

   public String getMbod_almmodorigen( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmodorigen ;
   }

   public void setMbod_almmodorigen( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmodorigen = value ;
   }

   public String getMbod_almorigencodigo( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigencodigo ;
   }

   public void setMbod_almorigencodigo( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigencodigo = value ;
   }

   public String getMbod_almorigendescripcion( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigendescripcion ;
   }

   public void setMbod_almorigendescripcion( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigendescripcion = value ;
   }

   public String getMbod_bodorigencodigo( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigencodigo ;
   }

   public void setMbod_bodorigencodigo( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigencodigo = value ;
   }

   public String getMbod_bodorigendescripcion( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigendescripcion ;
   }

   public void setMbod_bodorigendescripcion( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigendescripcion = value ;
   }

   public String getMbod_almmoddestino( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmoddestino ;
   }

   public void setMbod_almmoddestino( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmoddestino = value ;
   }

   public String getMbod_almdestinocodigo( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinocodigo ;
   }

   public void setMbod_almdestinocodigo( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinocodigo = value ;
   }

   public String getMbod_almdestinodescripcion( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinodescripcion ;
   }

   public void setMbod_almdestinodescripcion( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinodescripcion = value ;
   }

   public String getMbod_boddestinocodigo( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinocodigo ;
   }

   public void setMbod_boddestinocodigo( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinocodigo = value ;
   }

   public String getMbod_boddestinodescripcion( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinodescripcion ;
   }

   public void setMbod_boddestinodescripcion( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinodescripcion = value ;
   }

   public String getMbod_estado( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_estado ;
   }

   public void setMbod_estado( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_estado = value ;
   }

   public java.util.Date getMbod_fechacrea( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechacrea ;
   }

   public void setMbod_fechacrea( java.util.Date value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechacrea = value ;
   }

   public String getMbod_usuariocrea( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_usuariocrea ;
   }

   public void setMbod_usuariocrea( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_usuariocrea = value ;
   }

   public java.util.Date getMbod_fechamodifica( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechamodifica ;
   }

   public void setMbod_fechamodifica( java.util.Date value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechamodifica = value ;
   }

   public String getMbod_usuariomodifica( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_usuariomodifica ;
   }

   public void setMbod_usuariomodifica( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_usuariomodifica = value ;
   }

   protected short gxTv_SdtSDTALM_RESTRICCIONES_Mbod_regioncodigo ;
   protected long gxTv_SdtSDTALM_RESTRICCIONES_Mbod_id ;
   protected long gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipoelementocod ;
   protected long gxTv_SdtSDTALM_RESTRICCIONES_Mbod_regionid ;
   protected long gxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostoid ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_estado ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovcodigo ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovdescrip ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipoelementodesc ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_regiondescripcion ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostocodigo ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_centrocostodescrip ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmodorigen ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigencodigo ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigendescripcion ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigencodigo ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigendescripcion ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmoddestino ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinocodigo ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinodescripcion ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinocodigo ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinodescripcion ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_usuariocrea ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_usuariomodifica ;
   protected java.util.Date gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechacrea ;
   protected java.util.Date gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechamodifica ;
}

