/*
               File: ALM_BODEGAALM_INV_CONWC
        Description: ALM_BODEGAALM_INV_CONWC
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:15:4.96
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.alm_bodegaalm_inv_conwc")
public final  class alm_bodegaalm_inv_conwc extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new alm_bodegaalm_inv_conwc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new alm_bodegaalm_inv_conwc_impl(context);
   }

   public String getServletInfo( )
   {
      return "ALM_BODEGAALM_INV_CONWC";
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

