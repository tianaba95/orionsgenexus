/*
               File: StructSdtTabOptions_TabOptionsItem
        Description: TabOptions
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:20.76
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtTabOptions_TabOptionsItem implements Cloneable, java.io.Serializable
{
   public StructSdtTabOptions_TabOptionsItem( )
   {
      gxTv_SdtTabOptions_TabOptionsItem_Code = "" ;
      gxTv_SdtTabOptions_TabOptionsItem_Description = "" ;
      gxTv_SdtTabOptions_TabOptionsItem_Link = "" ;
      gxTv_SdtTabOptions_TabOptionsItem_Webcomponent = "" ;
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

   public String getCode( )
   {
      return gxTv_SdtTabOptions_TabOptionsItem_Code ;
   }

   public void setCode( String value )
   {
      gxTv_SdtTabOptions_TabOptionsItem_Code = value ;
   }

   public String getDescription( )
   {
      return gxTv_SdtTabOptions_TabOptionsItem_Description ;
   }

   public void setDescription( String value )
   {
      gxTv_SdtTabOptions_TabOptionsItem_Description = value ;
   }

   public String getLink( )
   {
      return gxTv_SdtTabOptions_TabOptionsItem_Link ;
   }

   public void setLink( String value )
   {
      gxTv_SdtTabOptions_TabOptionsItem_Link = value ;
   }

   public String getWebcomponent( )
   {
      return gxTv_SdtTabOptions_TabOptionsItem_Webcomponent ;
   }

   public void setWebcomponent( String value )
   {
      gxTv_SdtTabOptions_TabOptionsItem_Webcomponent = value ;
   }

   protected String gxTv_SdtTabOptions_TabOptionsItem_Code ;
   protected String gxTv_SdtTabOptions_TabOptionsItem_Description ;
   protected String gxTv_SdtTabOptions_TabOptionsItem_Link ;
   protected String gxTv_SdtTabOptions_TabOptionsItem_Webcomponent ;
}

