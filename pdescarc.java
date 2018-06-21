/*
               File: PDescArc
        Description: Stub for PDescArc
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:12.95
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdescarc extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(com.orions2.GXcfg.class);
      pdescarc pgm = new pdescarc (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {
      String aP0 = "";
      String aP1 = "";
      String aP2 = "";

      try
      {
         aP0 = (String) args[0];
         aP1 = (String) args[1];
         aP2 = (String) args[2];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2);
   }

   public pdescarc( )
   {
      super( -1 , new ModelContext( pdescarc.class ), "" );
      Application.init(com.orions2.GXcfg.class);
   }

   public pdescarc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdescarc.class ), "" );
   }

   public pdescarc( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 )
   {
      pdescarc.this.AV2Tipo = aP0;
      pdescarc.this.AV3NomArch = aP1;
      pdescarc.this.AV4Path = aP2;
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
   private String AV2Tipo ;
   private String AV3NomArch ;
   private String AV4Path ;
}

