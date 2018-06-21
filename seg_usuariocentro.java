/*
               File: SEG_USUARIOCENTRO
        Description: Usuario Centro de Costo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:41.59
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.orions2.seg_usuariocentro")
public final  class seg_usuariocentro extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new seg_usuariocentro_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new seg_usuariocentro_impl(context);
   }

   public String getServletInfo( )
   {
      return "Usuario Centro de Costo";
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

