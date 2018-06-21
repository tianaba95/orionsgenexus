/*
               File: wsrecordarusuario_RESTInterfaceOUT
        Description: WSRecordar Usuario
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:3.13
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
@XmlType(name =  "wsrecordarusuario_RESTInterfaceOUT" , namespace = "http://tempuri.org/" , propOrder={  })
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class wsrecordarusuario_RESTInterfaceOUT
{
   String AV17usua_Cedula ;
   @XmlElement(name="usua_Cedula")
   @JsonProperty("usua_Cedula")
   public String getusua_Cedula( )
   {
      return AV17usua_Cedula ;
   }

   @JsonProperty("usua_Cedula")
   public void setusua_Cedula(  String Value )
   {
      AV17usua_Cedula= Value;
      setValue = true;
   }


   String AV19Usua_Email ;
   @XmlElement(name="Usua_Email")
   @JsonProperty("Usua_Email")
   public String getUsua_Email( )
   {
      return AV19Usua_Email ;
   }

   @JsonProperty("Usua_Email")
   public void setUsua_Email(  String Value )
   {
      AV19Usua_Email= Value;
      setValue = true;
   }


   String AV22Error ;
   @XmlElement(name="Error")
   @JsonProperty("Error")
   public String getError( )
   {
      return AV22Error ;
   }

   @JsonProperty("Error")
   public void setError(  String Value )
   {
      AV22Error= Value;
      setValue = true;
   }


   public boolean setValue = false;
}

