/*
               File: Gx01O1
        Description: Selection List DOCUMENTOS DEL MOVIMIENTO
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:2.31
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.gx01o1")
public final  class gx01o1 extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new gx01o1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new gx01o1_impl(context);
   }

   public String getServletInfo( )
   {
      return "Selection List DOCUMENTOS DEL MOVIMIENTO";
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

