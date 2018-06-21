/*
               File: RPT_EJECUCION
        Description: RPT_EJECUCION
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:41.56
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.rpt_ejecucion")
public final  class rpt_ejecucion extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rpt_ejecucion_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rpt_ejecucion_impl(context);
   }

   public String getServletInfo( )
   {
      return "RPT_EJECUCION";
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

