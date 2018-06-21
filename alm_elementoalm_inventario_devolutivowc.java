/*
               File: ALM_ELEMENTOALM_INVENTARIO_DEVOLUTIVOWC
        Description: ALM_ELEMENTOALM_INVENTARIO_DEVOLUTIVOWC
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:15:25.26
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.alm_elementoalm_inventario_devolutivowc")
public final  class alm_elementoalm_inventario_devolutivowc extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new alm_elementoalm_inventario_devolutivowc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new alm_elementoalm_inventario_devolutivowc_impl(context);
   }

   public String getServletInfo( )
   {
      return "ALM_ELEMENTOALM_INVENTARIO_DEVOLUTIVOWC";
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

