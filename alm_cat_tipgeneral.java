/*
               File: ALM_CAT_TIPGeneral
        Description: ALM_CAT_TIPGeneral
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:13.19
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.alm_cat_tipgeneral")
public final  class alm_cat_tipgeneral extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new alm_cat_tipgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new alm_cat_tipgeneral_impl(context);
   }

   public String getServletInfo( )
   {
      return "ALM_CAT_TIPGeneral";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

}

