/*
               File: Gx0041
        Description: Selection List USUARIO Y CENTROS DE COSTO
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:24:9.84
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.gx0041")
public final  class gx0041 extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new gx0041_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new gx0041_impl(context);
   }

   public String getServletInfo( )
   {
      return "Selection List USUARIO Y CENTROS DE COSTO";
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

