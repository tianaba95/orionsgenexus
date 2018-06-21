/*
               File: LoginSena
        Description: Login Sena
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:20:3.6
       Program type: Main program
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.loginsena")
public final  class loginsena extends GXWebObjectStub
{
   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(com.orions2.GXcfg.class);
      com.orions2.loginsena_impl pgm = new com.orions2.loginsena_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new loginsena_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new loginsena_impl(context);
   }

   public String getServletInfo( )
   {
      return "Login Sena";
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

