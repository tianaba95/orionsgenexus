/*
               File: WPRecorCont
        Description: Recordar Contraseña
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:21:11.7
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.wprecorcont")
public final  class wprecorcont extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wprecorcont_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wprecorcont_impl(context);
   }

   public String getServletInfo( )
   {
      return "Recordar Contraseña";
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

