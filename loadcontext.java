/*
               File: LoadContext
        Description: Load Context
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:56.42
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class loadcontext extends GXProcedure
{
   public loadcontext( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( loadcontext.class ), "" );
   }

   public loadcontext( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public com.orions2.SdtContext executeUdp( )
   {
      loadcontext.this.aP0 = aP0;
      loadcontext.this.aP0 = new com.orions2.SdtContext[] {new com.orions2.SdtContext()};
      initialize();
      privateExecute();
      return aP0[0];
   }

   public void execute( com.orions2.SdtContext[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( com.orions2.SdtContext[] aP0 )
   {
      loadcontext.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Context.fromxml(AV9Session.getValue("context"), null, null);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = loadcontext.this.AV8Context;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Context = new com.orions2.SdtContext(remoteHandle, context);
      AV9Session = httpContext.getWebSession();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private com.orions2.SdtContext[] aP0 ;
   private com.orions2.SdtContext AV8Context ;
}

