/*
               File: GXApplication
        Description: No description for object
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 18, 2018 14:15:2.57
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.util.*;
import javax.ws.rs.core.Application;
import com.genexus.util.GXServices;
import com.genexus.webpanels.WebUtils;

public final  class GXApplication extends Application
{
   public Set<Class<?>> getClasses( )
   {
      Set<Class<?>> rrcs = new HashSet<Class<?>>();
      WebUtils.getGXApplicationClasses( getClass(), rrcs);
      WebUtils.AddExternalServices( getClass(), rrcs);
      return rrcs ;
   }

}

