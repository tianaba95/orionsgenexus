/*
               File: ALM_TIPO_MOVIMIENTOALM_RESTRICCIONESWC
        Description: ALM_TIPO_MOVIMIENTOALM_RESTRICCIONESWC
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:14:0.26
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.alm_tipo_movimientoalm_restriccioneswc")
public final  class alm_tipo_movimientoalm_restriccioneswc extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new alm_tipo_movimientoalm_restriccioneswc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new alm_tipo_movimientoalm_restriccioneswc_impl(context);
   }

   public String getServletInfo( )
   {
      return "ALM_TIPO_MOVIMIENTOALM_RESTRICCIONESWC";
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

