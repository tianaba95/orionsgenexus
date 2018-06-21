/*
               File: SEG_PANTALLASEG_ROL_PANTALLAWC
        Description: PANTALLA_ROL_PANTALLA
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:16:4.69
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.seg_pantallaseg_rol_pantallawc")
public final  class seg_pantallaseg_rol_pantallawc extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new seg_pantallaseg_rol_pantallawc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new seg_pantallaseg_rol_pantallawc_impl(context);
   }

   public String getServletInfo( )
   {
      return "PANTALLA_ROL_PANTALLA";
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

