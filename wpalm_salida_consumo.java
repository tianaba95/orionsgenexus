/*
               File: WPALM_SALIDA_CONSUMO
        Description: Salida detalle de consumo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:18:28.52
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.wpalm_salida_consumo")
public final  class wpalm_salida_consumo extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wpalm_salida_consumo_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wpalm_salida_consumo_impl(context);
   }

   public String getServletInfo( )
   {
      return "Salida detalle de consumo";
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

