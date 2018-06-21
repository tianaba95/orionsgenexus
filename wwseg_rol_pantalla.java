/*
               File: WWSEG_ROL_PANTALLA
        Description: Work With Roles y pantallas
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:19:20.94
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.wwseg_rol_pantalla")
public final  class wwseg_rol_pantalla extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wwseg_rol_pantalla_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wwseg_rol_pantalla_impl(context);
   }

   public String getServletInfo( )
   {
      return "Work With Roles y pantallas";
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

