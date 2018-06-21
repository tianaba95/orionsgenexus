/*
               File: ViewALM_CAT_TIP
        Description: View ALM_CAT_TIP
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:19:54.5
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.viewalm_cat_tip")
public final  class viewalm_cat_tip extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new viewalm_cat_tip_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new viewalm_cat_tip_impl(context);
   }

   public String getServletInfo( )
   {
      return "View ALM_CAT_TIP";
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

