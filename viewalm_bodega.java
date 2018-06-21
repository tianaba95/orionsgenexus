/*
               File: ViewALM_BODEGA
        Description: View ALM_BODEGA
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:19:31.33
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.viewalm_bodega")
public final  class viewalm_bodega extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new viewalm_bodega_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new viewalm_bodega_impl(context);
   }

   public String getServletInfo( )
   {
      return "View ALM_BODEGA";
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

