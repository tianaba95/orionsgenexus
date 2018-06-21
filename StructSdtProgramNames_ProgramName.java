/*
               File: StructSdtProgramNames_ProgramName
        Description: ProgramNames
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:15.89
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtProgramNames_ProgramName implements Cloneable, java.io.Serializable
{
   public StructSdtProgramNames_ProgramName( )
   {
      gxTv_SdtProgramNames_ProgramName_Name = "" ;
      gxTv_SdtProgramNames_ProgramName_Description = "" ;
      gxTv_SdtProgramNames_ProgramName_Link = "" ;
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

   public String getName( )
   {
      return gxTv_SdtProgramNames_ProgramName_Name ;
   }

   public void setName( String value )
   {
      gxTv_SdtProgramNames_ProgramName_Name = value ;
   }

   public String getDescription( )
   {
      return gxTv_SdtProgramNames_ProgramName_Description ;
   }

   public void setDescription( String value )
   {
      gxTv_SdtProgramNames_ProgramName_Description = value ;
   }

   public String getLink( )
   {
      return gxTv_SdtProgramNames_ProgramName_Link ;
   }

   public void setLink( String value )
   {
      gxTv_SdtProgramNames_ProgramName_Link = value ;
   }

   protected String gxTv_SdtProgramNames_ProgramName_Name ;
   protected String gxTv_SdtProgramNames_ProgramName_Description ;
   protected String gxTv_SdtProgramNames_ProgramName_Link ;
}

