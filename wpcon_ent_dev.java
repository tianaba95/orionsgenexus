/*
               File: WPCON_ENT_DEV
        Description: Entrada elementos devolutivo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:18:43.6
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.wpcon_ent_dev")
public final  class wpcon_ent_dev extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wpcon_ent_dev_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wpcon_ent_dev_impl(context);
   }

   public String getServletInfo( )
   {
      return "Entrada elementos devolutivo";
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

