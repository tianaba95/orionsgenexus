/*
               File: GEN_REGIONALGEN_CENTROCOSTOWC
        Description: GEN_REGIONALGEN_CENTROCOSTOWC
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:15.90
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.gen_regionalgen_centrocostowc")
public final  class gen_regionalgen_centrocostowc extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new gen_regionalgen_centrocostowc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new gen_regionalgen_centrocostowc_impl(context);
   }

   public String getServletInfo( )
   {
      return "GEN_REGIONALGEN_CENTROCOSTOWC";
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

