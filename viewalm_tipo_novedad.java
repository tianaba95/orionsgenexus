/*
               File: ViewALM_TIPO_NOVEDAD
        Description: View ALM_TIPO_NOVEDAD
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:19:24.49
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.viewalm_tipo_novedad")
public final  class viewalm_tipo_novedad extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new viewalm_tipo_novedad_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new viewalm_tipo_novedad_impl(context);
   }

   public String getServletInfo( )
   {
      return "View ALM_TIPO_NOVEDAD";
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

