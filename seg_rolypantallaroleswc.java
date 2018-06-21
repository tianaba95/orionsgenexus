/*
               File: SEG_ROLYPANTALLAROLESWC
        Description: SEG_ROLYPANTALLAROLESWC
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: April 9, 2018 14:52:27.12
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.seg_rolypantallaroleswc")
public final  class seg_rolypantallaroleswc extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new seg_rolypantallaroleswc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new seg_rolypantallaroleswc_impl(context);
   }

   public String getServletInfo( )
   {
      return "SEG_ROLYPANTALLAROLESWC";
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

