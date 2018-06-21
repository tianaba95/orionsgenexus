/*
               File: Inconsistencias
        Description: Inconsistencias
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:2.6
       Program type: HTTP procedure
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.inconsistencias")
public final  class inconsistencias extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new inconsistencias_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new inconsistencias_impl(context);
   }

   public String getServletInfo( )
   {
      return "Inconsistencias";
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

