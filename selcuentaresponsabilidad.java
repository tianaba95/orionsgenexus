/*
               File: SelCuentaResponsabilidad
        Description: Selecciona Cuenta Responsabilidad
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:21:42.57
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.selcuentaresponsabilidad")
public final  class selcuentaresponsabilidad extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new selcuentaresponsabilidad_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new selcuentaresponsabilidad_impl(context);
   }

   public String getServletInfo( )
   {
      return "Selecciona Cuenta Responsabilidad";
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

