/*
               File: WWALM_ORIGEN_BIENES
        Description: Work With Orígen de los bienes y destinaciones de las bajas
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:20:3.94
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.wwalm_origen_bienes")
public final  class wwalm_origen_bienes extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wwalm_origen_bienes_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wwalm_origen_bienes_impl(context);
   }

   public String getServletInfo( )
   {
      return "Work With Orígen de los bienes y destinaciones de las bajas";
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

