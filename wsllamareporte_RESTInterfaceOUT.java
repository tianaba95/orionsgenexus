/*
               File: wsllamareporte_RESTInterfaceOUT
        Description: WSLlama Reporte
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:15.82
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import com.genexus.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name =  "wsllamareporte_RESTInterfaceOUT" , namespace = "http://tempuri.org/" , propOrder={  })
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class wsllamareporte_RESTInterfaceOUT
{
   short AV47RPT_REP_ID ;
   @XmlElement(name="RPT_REP_ID")
   @JsonProperty("RPT_REP_ID")
   public short getRPT_REP_ID( )
   {
      return AV47RPT_REP_ID ;
   }

   @JsonProperty("RPT_REP_ID")
   public void setRPT_REP_ID(  short Value )
   {
      AV47RPT_REP_ID= Value;
      setValue = true;
   }


   String AV55Codigo_Regional ;
   @XmlElement(name="Codigo_Regional")
   @JsonProperty("Codigo_Regional")
   public String getCodigo_Regional( )
   {
      return AV55Codigo_Regional ;
   }

   @JsonProperty("Codigo_Regional")
   public void setCodigo_Regional(  String Value )
   {
      AV55Codigo_Regional= Value;
      setValue = true;
   }


   String AV28Cent_Codigo ;
   @XmlElement(name="Cent_Codigo")
   @JsonProperty("Cent_Codigo")
   public String getCent_Codigo( )
   {
      return AV28Cent_Codigo ;
   }

   @JsonProperty("Cent_Codigo")
   public void setCent_Codigo(  String Value )
   {
      AV28Cent_Codigo= Value;
      setValue = true;
   }


   String AV34Modulo ;
   @XmlElement(name="Modulo")
   @JsonProperty("Modulo")
   public String getModulo( )
   {
      return AV34Modulo ;
   }

   @JsonProperty("Modulo")
   public void setModulo(  String Value )
   {
      AV34Modulo= Value;
      setValue = true;
   }


   String AV25Almacen ;
   @XmlElement(name="Almacen")
   @JsonProperty("Almacen")
   public String getAlmacen( )
   {
      return AV25Almacen ;
   }

   @JsonProperty("Almacen")
   public void setAlmacen(  String Value )
   {
      AV25Almacen= Value;
      setValue = true;
   }


   String AV26Bodega ;
   @XmlElement(name="Bodega")
   @JsonProperty("Bodega")
   public String getBodega( )
   {
      return AV26Bodega ;
   }

   @JsonProperty("Bodega")
   public void setBodega(  String Value )
   {
      AV26Bodega= Value;
      setValue = true;
   }


   String AV59CedulaChar ;
   @XmlElement(name="CedulaChar")
   @JsonProperty("CedulaChar")
   public String getCedulaChar( )
   {
      return AV59CedulaChar ;
   }

   @JsonProperty("CedulaChar")
   public void setCedulaChar(  String Value )
   {
      AV59CedulaChar= Value;
      setValue = true;
   }


   String AV32Fecha_Inicial ;
   @XmlElement(name="Fecha_Inicial")
   @JsonProperty("Fecha_Inicial")
   public String getFecha_Inicial( )
   {
      return AV32Fecha_Inicial ;
   }

   @JsonProperty("Fecha_Inicial")
   public void setFecha_Inicial(  String Value )
   {
      AV32Fecha_Inicial= Value;
      setValue = true;
   }


   String AV31Fecha_Final ;
   @XmlElement(name="Fecha_Final")
   @JsonProperty("Fecha_Final")
   public String getFecha_Final( )
   {
      return AV31Fecha_Final ;
   }

   @JsonProperty("Fecha_Final")
   public void setFecha_Final(  String Value )
   {
      AV31Fecha_Final= Value;
      setValue = true;
   }


   String AV30Estado_Inicial ;
   @XmlElement(name="Estado_Inicial")
   @JsonProperty("Estado_Inicial")
   public String getEstado_Inicial( )
   {
      return AV30Estado_Inicial ;
   }

   @JsonProperty("Estado_Inicial")
   public void setEstado_Inicial(  String Value )
   {
      AV30Estado_Inicial= Value;
      setValue = true;
   }


   String AV29Estado_Final ;
   @XmlElement(name="Estado_Final")
   @JsonProperty("Estado_Final")
   public String getEstado_Final( )
   {
      return AV29Estado_Final ;
   }

   @JsonProperty("Estado_Final")
   public void setEstado_Final(  String Value )
   {
      AV29Estado_Final= Value;
      setValue = true;
   }


   String AV36Movimiento_Inicial ;
   @XmlElement(name="Movimiento_Inicial")
   @JsonProperty("Movimiento_Inicial")
   public String getMovimiento_Inicial( )
   {
      return AV36Movimiento_Inicial ;
   }

   @JsonProperty("Movimiento_Inicial")
   public void setMovimiento_Inicial(  String Value )
   {
      AV36Movimiento_Inicial= Value;
      setValue = true;
   }


   String AV35Movimiento_Final ;
   @XmlElement(name="Movimiento_Final")
   @JsonProperty("Movimiento_Final")
   public String getMovimiento_Final( )
   {
      return AV35Movimiento_Final ;
   }

   @JsonProperty("Movimiento_Final")
   public void setMovimiento_Final(  String Value )
   {
      AV35Movimiento_Final= Value;
      setValue = true;
   }


   String AV40Trans_ConsecutivoCC ;
   @XmlElement(name="Trans_ConsecutivoCC")
   @JsonProperty("Trans_ConsecutivoCC")
   public String getTrans_ConsecutivoCC( )
   {
      return AV40Trans_ConsecutivoCC ;
   }

   @JsonProperty("Trans_ConsecutivoCC")
   public void setTrans_ConsecutivoCC(  String Value )
   {
      AV40Trans_ConsecutivoCC= Value;
      setValue = true;
   }


   String AV41Trans_ConsecutivoCCFin ;
   @XmlElement(name="Trans_ConsecutivoCCFin")
   @JsonProperty("Trans_ConsecutivoCCFin")
   public String getTrans_ConsecutivoCCFin( )
   {
      return AV41Trans_ConsecutivoCCFin ;
   }

   @JsonProperty("Trans_ConsecutivoCCFin")
   public void setTrans_ConsecutivoCCFin(  String Value )
   {
      AV41Trans_ConsecutivoCCFin= Value;
      setValue = true;
   }


   String AV39Tipo_Codigo ;
   @XmlElement(name="Tipo_Codigo")
   @JsonProperty("Tipo_Codigo")
   public String getTipo_Codigo( )
   {
      return AV39Tipo_Codigo ;
   }

   @JsonProperty("Tipo_Codigo")
   public void setTipo_Codigo(  String Value )
   {
      AV39Tipo_Codigo= Value;
      setValue = true;
   }


   String AV42Proveedor ;
   @XmlElement(name="Proveedor")
   @JsonProperty("Proveedor")
   public String getProveedor( )
   {
      return AV42Proveedor ;
   }

   @JsonProperty("Proveedor")
   public void setProveedor(  String Value )
   {
      AV42Proveedor= Value;
      setValue = true;
   }


   String AV44Area_Codigo ;
   @XmlElement(name="Area_Codigo")
   @JsonProperty("Area_Codigo")
   public String getArea_Codigo( )
   {
      return AV44Area_Codigo ;
   }

   @JsonProperty("Area_Codigo")
   public void setArea_Codigo(  String Value )
   {
      AV44Area_Codigo= Value;
      setValue = true;
   }


   String AV45Curs_Codigo ;
   @XmlElement(name="Curs_Codigo")
   @JsonProperty("Curs_Codigo")
   public String getCurs_Codigo( )
   {
      return AV45Curs_Codigo ;
   }

   @JsonProperty("Curs_Codigo")
   public void setCurs_Codigo(  String Value )
   {
      AV45Curs_Codigo= Value;
      setValue = true;
   }


   String AV56Placa ;
   @XmlElement(name="Placa")
   @JsonProperty("Placa")
   public String getPlaca( )
   {
      return AV56Placa ;
   }

   @JsonProperty("Placa")
   public void setPlaca(  String Value )
   {
      AV56Placa= Value;
      setValue = true;
   }


   String AV33Formato ;
   @XmlElement(name="Formato")
   @JsonProperty("Formato")
   public String getFormato( )
   {
      return AV33Formato ;
   }

   @JsonProperty("Formato")
   public void setFormato(  String Value )
   {
      AV33Formato= Value;
      setValue = true;
   }


   Vector<com.orions2.SdtSDTSku_SDTSkuItem_RESTInterface> AV38SDTSKU ;
   @XmlElement(name="SDTSKU")
   @JsonProperty("SDTSKU")
   public Vector<com.orions2.SdtSDTSku_SDTSkuItem_RESTInterface> getSDTSKU( )
   {
      return AV38SDTSKU ;
   }

   @JsonProperty("SDTSKU")
   public void setSDTSKU(  Vector<com.orions2.SdtSDTSku_SDTSkuItem_RESTInterface> Value )
   {
      AV38SDTSKU= Value;
      if ( Value.size() > 0 )
      {
         setValue = true;
      }
   }


   String AV19Usuario ;
   @XmlElement(name="Usuario")
   @JsonProperty("Usuario")
   public String getUsuario( )
   {
      return AV19Usuario ;
   }

   @JsonProperty("Usuario")
   public void setUsuario(  String Value )
   {
      AV19Usuario= Value;
      setValue = true;
   }


   String AV64Periodo ;
   @XmlElement(name="Periodo")
   @JsonProperty("Periodo")
   public String getPeriodo( )
   {
      return AV64Periodo ;
   }

   @JsonProperty("Periodo")
   public void setPeriodo(  String Value )
   {
      AV64Periodo= Value;
      setValue = true;
   }


   public boolean setValue = false;
}

