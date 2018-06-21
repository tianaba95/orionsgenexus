/*
               File: wscreausuario_RESTInterfaceIN
        Description: WSCrea Usuario
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:56.90
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
@XmlType(name =  "wscreausuario_RESTInterfaceIN" , namespace = "http://tempuri.org/" , propOrder={  })
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class wscreausuario_RESTInterfaceIN
{
   String AV18Usua_Id ;
   @XmlElement(name="Usua_Id")
   @JsonProperty("Usua_Id")
   public String getUsua_Id( )
   {
      return AV18Usua_Id ;
   }

   @JsonProperty("Usua_Id")
   public void setUsua_Id(  String Value )
   {
      AV18Usua_Id= Value;
      setValue = true;
   }


   String Gx_mode ;
   @XmlElement(name="Mode")
   @JsonProperty("Mode")
   public String getGx_mode( )
   {
      return Gx_mode ;
   }

   @JsonProperty("Gx_mode")
   public void setGx_mode(  String Value )
   {
      if ( Value == null )
      {
         Gx_mode = "" ;
      }
      else
      {
         Gx_mode= Value;
      }
      setValue = true;
   }


   public boolean setValue = false;
}

