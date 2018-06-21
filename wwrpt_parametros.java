/*
               File: WWRPT_PARAMETROS
        Description: Work With PARAMETROS DE REPORTES
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:23:22.90
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.wwrpt_parametros")
public final  class wwrpt_parametros extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wwrpt_parametros_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wwrpt_parametros_impl(context);
   }

   public String getServletInfo( )
   {
      return "Work With PARAMETROS DE REPORTES";
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

