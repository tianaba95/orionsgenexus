/*
               File: wscambiacontrasena_RESTInterfaceOUT
        Description: WSCambia Contraseña
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:58.82
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
@XmlType(name =  "wscambiacontrasena_RESTInterfaceOUT" , namespace = "http://tempuri.org/" , propOrder={  })
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class wscambiacontrasena_RESTInterfaceOUT
{
   String AV16Usuario ;
   @XmlElement(name="Usuario")
   @JsonProperty("Usuario")
   public String getUsuario( )
   {
      return AV16Usuario ;
   }

   @JsonProperty("Usuario")
   public void setUsuario(  String Value )
   {
      AV16Usuario= Value;
      setValue = true;
   }


   String AV15Usua_Clave ;
   @XmlElement(name="Usua_Clave")
   @JsonProperty("Usua_Clave")
   public String getUsua_Clave( )
   {
      return AV15Usua_Clave ;
   }

   @JsonProperty("Usua_Clave")
   public void setUsua_Clave(  String Value )
   {
      AV15Usua_Clave= Value;
      setValue = true;
   }


   public boolean setValue = false;
}

