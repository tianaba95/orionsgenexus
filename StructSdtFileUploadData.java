/*
               File: StructSdtFileUploadData
        Description: FileUploadData
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:15.71
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtFileUploadData implements Cloneable, java.io.Serializable
{
   public StructSdtFileUploadData( )
   {
      gxTv_SdtFileUploadData_Fullname = "" ;
      gxTv_SdtFileUploadData_Name = "" ;
      gxTv_SdtFileUploadData_Extension = "" ;
      gxTv_SdtFileUploadData_File = "" ;
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

   public String getFullname( )
   {
      return gxTv_SdtFileUploadData_Fullname ;
   }

   public void setFullname( String value )
   {
      gxTv_SdtFileUploadData_Fullname = value ;
   }

   public String getName( )
   {
      return gxTv_SdtFileUploadData_Name ;
   }

   public void setName( String value )
   {
      gxTv_SdtFileUploadData_Name = value ;
   }

   public String getExtension( )
   {
      return gxTv_SdtFileUploadData_Extension ;
   }

   public void setExtension( String value )
   {
      gxTv_SdtFileUploadData_Extension = value ;
   }

   public long getSize( )
   {
      return gxTv_SdtFileUploadData_Size ;
   }

   public void setSize( long value )
   {
      gxTv_SdtFileUploadData_Size = value ;
   }

   public String getFile( )
   {
      return gxTv_SdtFileUploadData_File ;
   }

   public void setFile( String value )
   {
      gxTv_SdtFileUploadData_File = value ;
   }

   protected long gxTv_SdtFileUploadData_Size ;
   protected String gxTv_SdtFileUploadData_Fullname ;
   protected String gxTv_SdtFileUploadData_Name ;
   protected String gxTv_SdtFileUploadData_Extension ;
   protected String gxTv_SdtFileUploadData_File ;
}

