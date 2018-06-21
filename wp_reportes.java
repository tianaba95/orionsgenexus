/*
               File: WP_REPORTES
        Description: Reportes
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 18, 2018 10:58:26.71
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.wp_reportes")
public final  class wp_reportes extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wp_reportes_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wp_reportes_impl(context);
   }

   public String getServletInfo( )
   {
      return "Reportes";
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

