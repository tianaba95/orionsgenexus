/*
               File: SelecInvenResponsabilidad
        Description: Selec Inven Responsabilidad
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:20:46.54
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.selecinvenresponsabilidad")
public final  class selecinvenresponsabilidad extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new selecinvenresponsabilidad_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new selecinvenresponsabilidad_impl(context);
   }

   public String getServletInfo( )
   {
      return "Selec Inven Responsabilidad";
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

