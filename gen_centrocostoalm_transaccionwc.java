/*
               File: GEN_CENTROCOSTOALM_TRANSACCIONWC
        Description: GEN_CENTROCOSTOALM_TRANSACCIONWC
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:14:1.80
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.gen_centrocostoalm_transaccionwc")
public final  class gen_centrocostoalm_transaccionwc extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new gen_centrocostoalm_transaccionwc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new gen_centrocostoalm_transaccionwc_impl(context);
   }

   public String getServletInfo( )
   {
      return "GEN_CENTROCOSTOALM_TRANSACCIONWC";
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

