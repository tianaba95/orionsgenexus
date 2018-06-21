/*
               File: IsAuthorized
        Description: Is Authorized
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:56.3
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class isauthorized extends GXProcedure
{
   public isauthorized( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( isauthorized.class ), "" );
   }

   public isauthorized( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public boolean executeUdp( String aP0 )
   {
      isauthorized.this.GxObject = aP0;
      isauthorized.this.aP1 = aP1;
      isauthorized.this.aP1 = new boolean[] {false};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( String aP0 ,
                        boolean[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             boolean[] aP1 )
   {
      isauthorized.this.GxObject = aP0;
      isauthorized.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Authorized = true ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = isauthorized.this.AV9Authorized;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private boolean AV9Authorized ;
   private String GxObject ;
   private boolean[] aP1 ;
}

