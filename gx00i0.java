/*
               File: Gx00I0
        Description: Selection List REGIONAL
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:21:56.99
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.gx00i0")
public final  class gx00i0 extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new gx00i0_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new gx00i0_impl(context);
   }

   public String getServletInfo( )
   {
      return "Selection List REGIONAL";
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

