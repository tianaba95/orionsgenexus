/*
               File: WPALM_ASOCIAR_PLACAS
        Description: Asociar y desasociar placas
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:18:36.54
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.wpalm_asociar_placas")
public final  class wpalm_asociar_placas extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wpalm_asociar_placas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wpalm_asociar_placas_impl(context);
   }

   public String getServletInfo( )
   {
      return "Asociar y desasociar placas";
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

