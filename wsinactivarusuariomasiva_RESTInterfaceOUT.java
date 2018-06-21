/*
               File: wsinactivarusuariomasiva_RESTInterfaceOUT
        Description: WSInactivar Usuario Masiva
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:11.90
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
@XmlType(name =  "wsinactivarusuariomasiva_RESTInterfaceOUT" , namespace = "http://tempuri.org/" , propOrder={  })
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class wsinactivarusuariomasiva_RESTInterfaceOUT
{
   String AV17Usuario ;
   @XmlElement(name="Usuario")
   @JsonProperty("Usuario")
   public String getUsuario( )
   {
      return AV17Usuario ;
   }

   @JsonProperty("Usuario")
   public void setUsuario(  String Value )
   {
      AV17Usuario= Value;
      setValue = true;
   }


   String AV11Estado ;
   @XmlElement(name="Estado")
   @JsonProperty("Estado")
   public String getEstado( )
   {
      return AV11Estado ;
   }

   @JsonProperty("Estado")
   public void setEstado(  String Value )
   {
      AV11Estado= Value;
      setValue = true;
   }


   public boolean setValue = false;
}

