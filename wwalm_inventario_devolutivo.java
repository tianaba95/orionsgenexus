/*
               File: WWALM_INVENTARIO_DEVOLUTIVO
        Description: Work With Inventario devolutivo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:19:7.54
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.wwalm_inventario_devolutivo")
public final  class wwalm_inventario_devolutivo extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wwalm_inventario_devolutivo_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wwalm_inventario_devolutivo_impl(context);
   }

   public String getServletInfo( )
   {
      return "Work With Inventario devolutivo";
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

