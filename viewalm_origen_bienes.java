/*
               File: ViewALM_ORIGEN_BIENES
        Description: View ALM_ORIGEN_BIENES
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:20:3.38
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.viewalm_origen_bienes")
public final  class viewalm_origen_bienes extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new viewalm_origen_bienes_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new viewalm_origen_bienes_impl(context);
   }

   public String getServletInfo( )
   {
      return "View ALM_ORIGEN_BIENES";
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

