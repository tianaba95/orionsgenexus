/*
               File: ALM_CUENTADANTEALM_TRANSACCION3WC
        Description: ALM_CUENTADANTEALM_TRANSACCION3 WC
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:12:43.63
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.alm_cuentadantealm_transaccion3wc")
public final  class alm_cuentadantealm_transaccion3wc extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new alm_cuentadantealm_transaccion3wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new alm_cuentadantealm_transaccion3wc_impl(context);
   }

   public String getServletInfo( )
   {
      return "ALM_CUENTADANTEALM_TRANSACCION3 WC";
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

