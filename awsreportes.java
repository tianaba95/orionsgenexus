/*
               File: WSReportes
        Description: WSReportes
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: May 28, 2018 12:7:35.29
       Program type: Main program
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.awsreportes")
public final  class awsreportes extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new awsreportes_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new awsreportes_impl(context);
   }

   public String getServletInfo( )
   {
      return "WSReportes";
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

