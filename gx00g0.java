/*
               File: Gx00G0
        Description: Selection List INVENTARIO DEVOLUTIVO
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:24:31.40
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.gx00g0")
public final  class gx00g0 extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new gx00g0_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new gx00g0_impl(context);
   }

   public String getServletInfo( )
   {
      return "Selection List INVENTARIO DEVOLUTIVO";
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

