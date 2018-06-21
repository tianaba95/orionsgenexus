/*
               File: StructSdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem
        Description: SDTDetalleTrnAtr
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:17.47
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem( )
   {
      gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listdescripcion = "" ;
      gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listtipo = "" ;
      gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_valoratributo = "" ;
      gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Clas_atributoobligatorio = "" ;
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

   public long getTdet_listid( )
   {
      return gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listid ;
   }

   public void setTdet_listid( long value )
   {
      gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listid = value ;
   }

   public String getTdet_listdescripcion( )
   {
      return gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listdescripcion ;
   }

   public void setTdet_listdescripcion( String value )
   {
      gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listdescripcion = value ;
   }

   public String getTdet_listtipo( )
   {
      return gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listtipo ;
   }

   public void setTdet_listtipo( String value )
   {
      gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listtipo = value ;
   }

   public String getTdet_valoratributo( )
   {
      return gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_valoratributo ;
   }

   public void setTdet_valoratributo( String value )
   {
      gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_valoratributo = value ;
   }

   public String getClas_atributoobligatorio( )
   {
      return gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Clas_atributoobligatorio ;
   }

   public void setClas_atributoobligatorio( String value )
   {
      gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Clas_atributoobligatorio = value ;
   }

   protected long gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listid ;
   protected String gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listtipo ;
   protected String gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Clas_atributoobligatorio ;
   protected String gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listdescripcion ;
   protected String gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_valoratributo ;
}

