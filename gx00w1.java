/*
               File: Gx00W1
        Description: Selection List Movimiento or�gen de los bienes
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:24:46.14
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.gx00w1")
public final  class gx00w1 extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new gx00w1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new gx00w1_impl(context);
   }

   public String getServletInfo( )
   {
      return "Selection List Movimiento or�gen de los bienes";
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

