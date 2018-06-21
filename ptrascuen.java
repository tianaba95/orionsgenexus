/*
               File: PTrasCuen
        Description: Stub for PTrasCuen
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:8.68
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptrascuen extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(com.orions2.GXcfg.class);
      ptrascuen pgm = new ptrascuen (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {
      long aP0 = 0;

      try
      {
         aP0 = (long) GXutil.val( args[0], ".");
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0);
   }

   public ptrascuen( )
   {
      super( -1 , new ModelContext( ptrascuen.class ), "" );
      Application.init(com.orions2.GXcfg.class);
   }

   public ptrascuen( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptrascuen.class ), "" );
   }

   public ptrascuen( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( long aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( long aP0 )
   {
      ptrascuen.this.AV2pTran_Id = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      Application.cleanup(context, this, remoteHandle);
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
   private long AV2pTran_Id ;
}

