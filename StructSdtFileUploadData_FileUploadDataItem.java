/*
               File: StructSdtFileUploadData_FileUploadDataItem
        Description: FileUploadData
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 18, 2018 14:13:18.77
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtFileUploadData_FileUploadDataItem implements Cloneable, java.io.Serializable
{
   public StructSdtFileUploadData_FileUploadDataItem( )
   {
      gxTv_SdtFileUploadData_FileUploadDataItem_Fullname = "" ;
      gxTv_SdtFileUploadData_FileUploadDataItem_Name = "" ;
      gxTv_SdtFileUploadData_FileUploadDataItem_Extension = "" ;
      gxTv_SdtFileUploadData_FileUploadDataItem_File = "" ;
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
      return gxTv_SdtFileUploadData_FileUploadDataItem_Fullname ;
   }

   public void setFullname( String value )
   {
      gxTv_SdtFileUploadData_FileUploadDataItem_Fullname = value ;
   }

   public String getName( )
   {
      return gxTv_SdtFileUploadData_FileUploadDataItem_Name ;
   }

   public void setName( String value )
   {
      gxTv_SdtFileUploadData_FileUploadDataItem_Name = value ;
   }

   public String getExtension( )
   {
      return gxTv_SdtFileUploadData_FileUploadDataItem_Extension ;
   }

   public void setExtension( String value )
   {
      gxTv_SdtFileUploadData_FileUploadDataItem_Extension = value ;
   }

   public long getSize( )
   {
      return gxTv_SdtFileUploadData_FileUploadDataItem_Size ;
   }

   public void setSize( long value )
   {
      gxTv_SdtFileUploadData_FileUploadDataItem_Size = value ;
   }

   public String getFile( )
   {
      return gxTv_SdtFileUploadData_FileUploadDataItem_File ;
   }

   public void setFile( String value )
   {
      gxTv_SdtFileUploadData_FileUploadDataItem_File = value ;
   }

   protected long gxTv_SdtFileUploadData_FileUploadDataItem_Size ;
   protected String gxTv_SdtFileUploadData_FileUploadDataItem_Fullname ;
   protected String gxTv_SdtFileUploadData_FileUploadDataItem_Name ;
   protected String gxTv_SdtFileUploadData_FileUploadDataItem_Extension ;
   protected String gxTv_SdtFileUploadData_FileUploadDataItem_File ;
}

