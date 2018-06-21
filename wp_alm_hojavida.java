/*
               File: WP_ALM_HOJAVIDA
        Description: Hoja de vida del activo fijo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:20:49.10
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.wp_alm_hojavida")
public final  class wp_alm_hojavida extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wp_alm_hojavida_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wp_alm_hojavida_impl(context);
   }

   public String getServletInfo( )
   {
      return "Hoja de vida del activo fijo";
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

