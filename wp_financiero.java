/*
               File: WP_Financiero
        Description: Procesos financieros
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:24:1.84
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.wp_financiero")
public final  class wp_financiero extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wp_financiero_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wp_financiero_impl(context);
   }

   public String getServletInfo( )
   {
      return "Procesos financieros";
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

