/*
               File: StructSdtContext
        Description: Context
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:15.67
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtContext implements Cloneable, java.io.Serializable
{
   public StructSdtContext( )
   {
      gxTv_SdtContext_User = "" ;
      gxTv_SdtContext_Profile = "" ;
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

   public String getUser( )
   {
      return gxTv_SdtContext_User ;
   }

   public void setUser( String value )
   {
      gxTv_SdtContext_User = value ;
   }

   public short getCompanycode( )
   {
      return gxTv_SdtContext_Companycode ;
   }

   public void setCompanycode( short value )
   {
      gxTv_SdtContext_Companycode = value ;
   }

   public String getProfile( )
   {
      return gxTv_SdtContext_Profile ;
   }

   public void setProfile( String value )
   {
      gxTv_SdtContext_Profile = value ;
   }

   protected short gxTv_SdtContext_Companycode ;
   protected String gxTv_SdtContext_User ;
   protected String gxTv_SdtContext_Profile ;
}

