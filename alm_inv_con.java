/*
               File: ALM_INV_CON
        Description: ALMACEN INVENTARIO CONSUMO
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:15:1.11
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.alm_inv_con")
public final  class alm_inv_con extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new alm_inv_con_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new alm_inv_con_impl(context);
   }

   public String getServletInfo( )
   {
      return "ALMACEN INVENTARIO CONSUMO";
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

