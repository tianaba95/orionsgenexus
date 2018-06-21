/*
               File: ViewGEN_CENTROCOSTO
        Description: View GEN_CENTROCOSTO
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:43.82
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.viewgen_centrocosto")
public final  class viewgen_centrocosto extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new viewgen_centrocosto_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new viewgen_centrocosto_impl(context);
   }

   public String getServletInfo( )
   {
      return "View GEN_CENTROCOSTO";
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

