/*
               File: StructSdtgpxMenuItems_gpxMenuItem
        Description: gpxMenuItems
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:15.75
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtgpxMenuItems_gpxMenuItem implements Cloneable, java.io.Serializable
{
   public StructSdtgpxMenuItems_gpxMenuItem( )
   {
      gxTv_SdtgpxMenuItems_gpxMenuItem_Code = "" ;
      gxTv_SdtgpxMenuItems_gpxMenuItem_Title = "" ;
      gxTv_SdtgpxMenuItems_gpxMenuItem_Url = "" ;
      gxTv_SdtgpxMenuItems_gpxMenuItem_Linktarget = "" ;
      gxTv_SdtgpxMenuItems_gpxMenuItem_Image = "" ;
      gxTv_SdtgpxMenuItems_gpxMenuItem_Description = "" ;
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
      return gxTv_SdtgpxMenuItems_gpxMenuItem_Code ;
   }

   public void setCode( String value )
   {
      gxTv_SdtgpxMenuItems_gpxMenuItem_Code = value ;
   }

   public String getTitle( )
   {
      return gxTv_SdtgpxMenuItems_gpxMenuItem_Title ;
   }

   public void setTitle( String value )
   {
      gxTv_SdtgpxMenuItems_gpxMenuItem_Title = value ;
   }

   public String getUrl( )
   {
      return gxTv_SdtgpxMenuItems_gpxMenuItem_Url ;
   }

   public void setUrl( String value )
   {
      gxTv_SdtgpxMenuItems_gpxMenuItem_Url = value ;
   }

   public String getLinktarget( )
   {
      return gxTv_SdtgpxMenuItems_gpxMenuItem_Linktarget ;
   }

   public void setLinktarget( String value )
   {
      gxTv_SdtgpxMenuItems_gpxMenuItem_Linktarget = value ;
   }

   public String getImage( )
   {
      return gxTv_SdtgpxMenuItems_gpxMenuItem_Image ;
   }

   public void setImage( String value )
   {
      gxTv_SdtgpxMenuItems_gpxMenuItem_Image = value ;
   }

   public String getDescription( )
   {
      return gxTv_SdtgpxMenuItems_gpxMenuItem_Description ;
   }

   public void setDescription( String value )
   {
      gxTv_SdtgpxMenuItems_gpxMenuItem_Description = value ;
   }

   public short getIndex( )
   {
      return gxTv_SdtgpxMenuItems_gpxMenuItem_Index ;
   }

   public void setIndex( short value )
   {
      gxTv_SdtgpxMenuItems_gpxMenuItem_Index = value ;
   }

   public java.util.Vector getSubitems( )
   {
      return gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems ;
   }

   public void setSubitems( java.util.Vector value )
   {
      gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems = value ;
   }

   protected short gxTv_SdtgpxMenuItems_gpxMenuItem_Index ;
   protected String gxTv_SdtgpxMenuItems_gpxMenuItem_Code ;
   protected String gxTv_SdtgpxMenuItems_gpxMenuItem_Title ;
   protected String gxTv_SdtgpxMenuItems_gpxMenuItem_Url ;
   protected String gxTv_SdtgpxMenuItems_gpxMenuItem_Linktarget ;
   protected String gxTv_SdtgpxMenuItems_gpxMenuItem_Image ;
   protected String gxTv_SdtgpxMenuItems_gpxMenuItem_Description ;
   protected java.util.Vector gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems=null ;
}

