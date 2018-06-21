/*
               File: RPT_PARAMETROSRPT_REP_PARMWC
        Description: RPT_PARAMETROSRPT_REP_PARMWC
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:40.21
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.rpt_parametrosrpt_rep_parmwc")
public final  class rpt_parametrosrpt_rep_parmwc extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rpt_parametrosrpt_rep_parmwc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rpt_parametrosrpt_rep_parmwc_impl(context);
   }

   public String getServletInfo( )
   {
      return "RPT_PARAMETROSRPT_REP_PARMWC";
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

