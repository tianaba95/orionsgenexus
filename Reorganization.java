/*
               File: Reorganization
        Description: No description for object
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: May 30, 2018 12:5:29.64
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class Reorganization extends GXReorganization
{
   ModelContext context;
   public static void main( String args[] )
   {
      new Reorganization().executeReorg(args, false);
   }

   public Reorganization( )
   {
      super(GXcfg.class);
   }

   public String getPackageDir( )
   {
      return "com\\orions2\\" ;
   }

   public void init( )
   {
      Application.setApplet( this);
   }

   public void execute( )
   {
      context = new ModelContext(getClass());
      reorg r = new reorg(getHandle());
      setReorgProcedure(r);
      r.execute();
   }

}

