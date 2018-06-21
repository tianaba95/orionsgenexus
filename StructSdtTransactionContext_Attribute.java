/*
               File: StructSdtTransactionContext_Attribute
        Description: TransactionContext
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:20.83
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtTransactionContext_Attribute implements Cloneable, java.io.Serializable
{
   public StructSdtTransactionContext_Attribute( )
   {
      gxTv_SdtTransactionContext_Attribute_Attributename = "" ;
      gxTv_SdtTransactionContext_Attribute_Attributevalue = "" ;
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

   public String getAttributename( )
   {
      return gxTv_SdtTransactionContext_Attribute_Attributename ;
   }

   public void setAttributename( String value )
   {
      gxTv_SdtTransactionContext_Attribute_Attributename = value ;
   }

   public String getAttributevalue( )
   {
      return gxTv_SdtTransactionContext_Attribute_Attributevalue ;
   }

   public void setAttributevalue( String value )
   {
      gxTv_SdtTransactionContext_Attribute_Attributevalue = value ;
   }

   protected String gxTv_SdtTransactionContext_Attribute_Attributename ;
   protected String gxTv_SdtTransactionContext_Attribute_Attributevalue ;
}

