/*
               File: Gx00F0
        Description: Selection List ALMACEN INVENTARIO CONSUMO
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:4.93
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.gx00f0")
public final  class gx00f0 extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new gx00f0_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new gx00f0_impl(context);
   }

   public String getServletInfo( )
   {
      return "Selection List ALMACEN INVENTARIO CONSUMO";
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

