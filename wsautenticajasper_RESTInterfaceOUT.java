/*
               File: wsautenticajasper_RESTInterfaceOUT
        Description: WSAutentica Jasper
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: May 29, 2018 14:16:10.2
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
@XmlType(name =  "wsautenticajasper_RESTInterfaceOUT" , namespace = "http://tempuri.org/" , propOrder={  })
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class wsautenticajasper_RESTInterfaceOUT
{
   String AV14lvc ;
   @XmlElement(name="lvc")
   @JsonProperty("lvc")
   public String getlvc( )
   {
      return AV14lvc ;
   }

   @JsonProperty("lvc")
   public void setlvc(  String Value )
   {
      AV14lvc= Value;
      setValue = true;
   }


   String Gx_msg ;
   @XmlElement(name="Msg")
   @JsonProperty("Msg")
   public String getGx_msg( )
   {
      return Gx_msg ;
   }

   @JsonProperty("Gx_msg")
   public void setGx_msg(  String Value )
   {
      Gx_msg= Value;
      setValue = true;
   }


   public boolean setValue = false;
}

