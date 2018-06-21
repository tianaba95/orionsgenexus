/*
               File: ErroresNovedadesMasivo
        Description: Errores Novedades Masivo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:15.18
       Program type: HTTP procedure
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.erroresnovedadesmasivo")
public final  class erroresnovedadesmasivo extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new erroresnovedadesmasivo_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new erroresnovedadesmasivo_impl(context);
   }

   public String getServletInfo( )
   {
      return "Errores Novedades Masivo";
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

