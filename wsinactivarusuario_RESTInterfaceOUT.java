/*
               File: wsinactivarusuario_RESTInterfaceOUT
        Description: WSInactivar Usuario
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:58.24
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
@XmlType(name =  "wsinactivarusuario_RESTInterfaceOUT" , namespace = "http://tempuri.org/" , propOrder={  })
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class wsinactivarusuario_RESTInterfaceOUT
{
   String AV20Usuario ;
   @XmlElement(name="Usuario")
   @JsonProperty("Usuario")
   public String getUsuario( )
   {
      return AV20Usuario ;
   }

   @JsonProperty("Usuario")
   public void setUsuario(  String Value )
   {
      AV20Usuario= Value;
      setValue = true;
   }


   String AV19Usua_Id ;
   @XmlElement(name="Usua_Id")
   @JsonProperty("Usua_Id")
   public String getUsua_Id( )
   {
      return AV19Usua_Id ;
   }

   @JsonProperty("Usua_Id")
   public void setUsua_Id(  String Value )
   {
      AV19Usua_Id= Value;
      setValue = true;
   }


   byte AV21Tipo ;
   @XmlElement(name="Tipo")
   @JsonProperty("Tipo")
   public byte getTipo( )
   {
      return AV21Tipo ;
   }

   @JsonProperty("Tipo")
   public void setTipo(  byte Value )
   {
      AV21Tipo= Value;
      setValue = true;
   }


   public boolean setValue = false;
}

