/*
               File: pcambiarplacas_RESTInterfaceOUT
        Description: PCambiar Placas
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:7.6
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
@XmlType(name =  "pcambiarplacas_RESTInterfaceOUT" , namespace = "http://tempuri.org/" , propOrder={  })
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class pcambiarplacas_RESTInterfaceOUT
{
   String AV11Tran_Id ;
   @XmlElement(name="Tran_Id")
   @JsonProperty("Tran_Id")
   public String getTran_Id( )
   {
      return AV11Tran_Id ;
   }

   @JsonProperty("Tran_Id")
   public void setTran_Id(  String Value )
   {
      AV11Tran_Id= Value;
      setValue = true;
   }


   String AV9Placa ;
   @XmlElement(name="Placa")
   @JsonProperty("Placa")
   public String getPlaca( )
   {
      return AV9Placa ;
   }

   @JsonProperty("Placa")
   public void setPlaca(  String Value )
   {
      AV9Placa= Value;
      setValue = true;
   }


   String AV15Observaciones ;
   @XmlElement(name="Observaciones")
   @JsonProperty("Observaciones")
   public String getObservaciones( )
   {
      return AV15Observaciones ;
   }

   @JsonProperty("Observaciones")
   public void setObservaciones(  String Value )
   {
      AV15Observaciones= Value;
      setValue = true;
   }


   String AV12Accion ;
   @XmlElement(name="Accion")
   @JsonProperty("Accion")
   public String getAccion( )
   {
      return AV12Accion ;
   }

   @JsonProperty("Accion")
   public void setAccion(  String Value )
   {
      AV12Accion= Value;
      setValue = true;
   }


   String AV14NuevaPlaca ;
   @XmlElement(name="NuevaPlaca")
   @JsonProperty("NuevaPlaca")
   public String getNuevaPlaca( )
   {
      return AV14NuevaPlaca ;
   }

   @JsonProperty("NuevaPlaca")
   public void setNuevaPlaca(  String Value )
   {
      AV14NuevaPlaca= Value;
      setValue = true;
   }


   String AV13EsPlacaPadre ;
   @XmlElement(name="EsPlacaPadre")
   @JsonProperty("EsPlacaPadre")
   public String getEsPlacaPadre( )
   {
      return AV13EsPlacaPadre ;
   }

   @JsonProperty("EsPlacaPadre")
   public void setEsPlacaPadre(  String Value )
   {
      AV13EsPlacaPadre= Value;
      setValue = true;
   }


   String AV16PlacaPadre ;
   @XmlElement(name="PlacaPadre")
   @JsonProperty("PlacaPadre")
   public String getPlacaPadre( )
   {
      return AV16PlacaPadre ;
   }

   @JsonProperty("PlacaPadre")
   public void setPlacaPadre(  String Value )
   {
      AV16PlacaPadre= Value;
      setValue = true;
   }


   String AV18NuevaEsPlacaPadre ;
   @XmlElement(name="NuevaEsPlacaPadre")
   @JsonProperty("NuevaEsPlacaPadre")
   public String getNuevaEsPlacaPadre( )
   {
      return AV18NuevaEsPlacaPadre ;
   }

   @JsonProperty("NuevaEsPlacaPadre")
   public void setNuevaEsPlacaPadre(  String Value )
   {
      AV18NuevaEsPlacaPadre= Value;
      setValue = true;
   }


   String AV19NuevaPlacaPadre ;
   @XmlElement(name="NuevaPlacaPadre")
   @JsonProperty("NuevaPlacaPadre")
   public String getNuevaPlacaPadre( )
   {
      return AV19NuevaPlacaPadre ;
   }

   @JsonProperty("NuevaPlacaPadre")
   public void setNuevaPlacaPadre(  String Value )
   {
      AV19NuevaPlacaPadre= Value;
      setValue = true;
   }


   public boolean setValue = false;
}

