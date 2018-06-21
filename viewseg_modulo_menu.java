/*
               File: ViewSEG_MODULO_MENU
        Description: View SEG_MODULO_MENU
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:19:18.41
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.viewseg_modulo_menu")
public final  class viewseg_modulo_menu extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new viewseg_modulo_menu_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new viewseg_modulo_menu_impl(context);
   }

   public String getServletInfo( )
   {
      return "View SEG_MODULO_MENU";
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

