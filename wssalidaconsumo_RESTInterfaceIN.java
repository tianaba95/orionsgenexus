/*
               File: wssalidaconsumo_RESTInterfaceIN
        Description: WSsalidaconsumo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:7.51
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
@XmlType(name =  "wssalidaconsumo_RESTInterfaceIN" , namespace = "http://tempuri.org/" , propOrder={  })
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class wssalidaconsumo_RESTInterfaceIN
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


   public boolean setValue = false;
}

