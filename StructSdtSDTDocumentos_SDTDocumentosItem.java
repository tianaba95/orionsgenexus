/*
               File: StructSdtSDTDocumentos_SDTDocumentosItem
        Description: SDTDocumentos
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:17.50
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTDocumentos_SDTDocumentosItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTDocumentos_SDTDocumentosItem( )
   {
      gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_descrip_documento = "" ;
      gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_prefijo_documento = "" ;
      gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_archivo = "" ;
      gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_ruta_archivo = "" ;
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

   public short getTran_nro_documento( )
   {
      return gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_nro_documento ;
   }

   public void setTran_nro_documento( short value )
   {
      gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_nro_documento = value ;
   }

   public String getTran_descrip_documento( )
   {
      return gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_descrip_documento ;
   }

   public void setTran_descrip_documento( String value )
   {
      gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_descrip_documento = value ;
   }

   public String getTran_prefijo_documento( )
   {
      return gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_prefijo_documento ;
   }

   public void setTran_prefijo_documento( String value )
   {
      gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_prefijo_documento = value ;
   }

   public String getTran_archivo( )
   {
      return gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_archivo ;
   }

   public void setTran_archivo( String value )
   {
      gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_archivo = value ;
   }

   public String getTran_ruta_archivo( )
   {
      return gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_ruta_archivo ;
   }

   public void setTran_ruta_archivo( String value )
   {
      gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_ruta_archivo = value ;
   }

   protected short gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_nro_documento ;
   protected String gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_archivo ;
   protected String gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_descrip_documento ;
   protected String gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_prefijo_documento ;
   protected String gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_ruta_archivo ;
}

