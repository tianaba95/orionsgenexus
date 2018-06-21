/*
               File: wscierremes_RESTInterfaceOUT
        Description: WSCierre Mes
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:57.15
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
@XmlType(name =  "wscierremes_RESTInterfaceOUT" , namespace = "http://tempuri.org/" , propOrder={  })
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class wscierremes_RESTInterfaceOUT
{
   String AV8Tran_Id ;
   @XmlElement(name="Tran_Id")
   @JsonProperty("Tran_Id")
   public String getTran_Id( )
   {
      return AV8Tran_Id ;
   }

   @JsonProperty("Tran_Id")
   public void setTran_Id(  String Value )
   {
      AV8Tran_Id= Value;
      setValue = true;
   }


   String AV22Respuesta ;
   @XmlElement(name="Respuesta")
   @JsonProperty("Respuesta")
   public String getRespuesta( )
   {
      return AV22Respuesta ;
   }

   @JsonProperty("Respuesta")
   public void setRespuesta(  String Value )
   {
      AV22Respuesta= Value;
      setValue = true;
   }


   public boolean setValue = false;
}

