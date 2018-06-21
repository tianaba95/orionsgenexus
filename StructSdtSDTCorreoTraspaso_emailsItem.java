/*
               File: StructSdtSDTCorreoTraspaso_emailsItem
        Description: SDTCorreoTraspaso
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:17.17
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTCorreoTraspaso_emailsItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTCorreoTraspaso_emailsItem( )
   {
      gxTv_SdtSDTCorreoTraspaso_emailsItem_Emailcuentadanteorigen = "" ;
      gxTv_SdtSDTCorreoTraspaso_emailsItem_Emailcuentadantedestino = "" ;
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

   public String getEmailcuentadanteorigen( )
   {
      return gxTv_SdtSDTCorreoTraspaso_emailsItem_Emailcuentadanteorigen ;
   }

   public void setEmailcuentadanteorigen( String value )
   {
      gxTv_SdtSDTCorreoTraspaso_emailsItem_Emailcuentadanteorigen = value ;
   }

   public String getEmailcuentadantedestino( )
   {
      return gxTv_SdtSDTCorreoTraspaso_emailsItem_Emailcuentadantedestino ;
   }

   public void setEmailcuentadantedestino( String value )
   {
      gxTv_SdtSDTCorreoTraspaso_emailsItem_Emailcuentadantedestino = value ;
   }

   protected String gxTv_SdtSDTCorreoTraspaso_emailsItem_Emailcuentadanteorigen ;
   protected String gxTv_SdtSDTCorreoTraspaso_emailsItem_Emailcuentadantedestino ;
}

