/*
               File: WWALM_TIPO_MOVIMIENTO
        Description: Work With Tipo de movimiento
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:19:35.62
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.wwalm_tipo_movimiento")
public final  class wwalm_tipo_movimiento extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wwalm_tipo_movimiento_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wwalm_tipo_movimiento_impl(context);
   }

   public String getServletInfo( )
   {
      return "Work With Tipo de movimiento";
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

