/*
               File: SdtSDTSku_SDTSkuItem_RESTInterface
        Description: WSLlama Reporte
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:15.78
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import com.genexus.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@XmlType(name =  "SDTSku.SDTSkuItem" , namespace = "ACBSENA" , propOrder={ "elem_consecutivo", "cata_descripcion" })
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtSDTSku_SDTSkuItem_RESTInterface extends GxGenericCollectionItem<com.orions2.SdtSDTSku_SDTSkuItem>
{
   public SdtSDTSku_SDTSkuItem_RESTInterface( )
   {
      super(new com.orions2.SdtSDTSku_SDTSkuItem ());
   }

   public SdtSDTSku_SDTSkuItem_RESTInterface( com.orions2.SdtSDTSku_SDTSkuItem psdt )
   {
      super(psdt);
   }

   @XmlElement(name="Elem_Consecutivo")
   @JsonProperty("Elem_Consecutivo")
   public String getgxTv_SdtSDTSku_SDTSkuItem_Elem_consecutivo( )
   {
      return GXutil.rtrim(((com.orions2.SdtSDTSku_SDTSkuItem)getSdt()).getgxTv_SdtSDTSku_SDTSkuItem_Elem_consecutivo()) ;
   }

   @JsonProperty("Elem_Consecutivo")
   public void setgxTv_SdtSDTSku_SDTSkuItem_Elem_consecutivo(  String Value )
   {
      ((com.orions2.SdtSDTSku_SDTSkuItem)getSdt()).setgxTv_SdtSDTSku_SDTSkuItem_Elem_consecutivo(Value);
   }


   @XmlElement(name="Cata_Descripcion")
   @JsonProperty("Cata_Descripcion")
   public String getgxTv_SdtSDTSku_SDTSkuItem_Cata_descripcion( )
   {
      return GXutil.rtrim(((com.orions2.SdtSDTSku_SDTSkuItem)getSdt()).getgxTv_SdtSDTSku_SDTSkuItem_Cata_descripcion()) ;
   }

   @JsonProperty("Cata_Descripcion")
   public void setgxTv_SdtSDTSku_SDTSkuItem_Cata_descripcion(  String Value )
   {
      ((com.orions2.SdtSDTSku_SDTSkuItem)getSdt()).setgxTv_SdtSDTSku_SDTSkuItem_Cata_descripcion(Value);
   }


   int remoteHandle = -1;
}

