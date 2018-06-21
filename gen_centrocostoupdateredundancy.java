/*
               File: GEN_CENTROCOSTOUpdateRedundancy
        Description: Update redundancy for GEN_CENTROCOSTO
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:15.50
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class gen_centrocostoupdateredundancy extends GXProcedure
{
   public gen_centrocostoupdateredundancy( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gen_centrocostoupdateredundancy.class ), "" );
   }

   public gen_centrocostoupdateredundancy( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public long executeUdp( )
   {
      gen_centrocostoupdateredundancy.this.A1Cent_Id = aP0[0];
      this.aP0 = aP0;
      gen_centrocostoupdateredundancy.this.aP0 = new long[] {0};
      initialize();
      privateExecute();
      return aP0[0];
   }

   public void execute( long[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( long[] aP0 )
   {
      gen_centrocostoupdateredundancy.this.A1Cent_Id = aP0[0];
      this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor GEN_CENTRO2 */
      pr_default.execute(0, new Object[] {new Long(A1Cent_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2Regi_Id = GEN_CENTRO2_A2Regi_Id[0] ;
         AV2GXV2 = A2Regi_Id ;
         /* Optimized UPDATE. */
         /* Using cursor GEN_CENTRO3 */
         pr_default.execute(1, new Object[] {new Long(AV2GXV2), new Long(A1Cent_Id)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_CUENTADANTE") ;
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_CUENTADANTE") ;
         /* End optimized UPDATE. */
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = gen_centrocostoupdateredundancy.this.A1Cent_Id;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      GEN_CENTRO2_A1Cent_Id = new long[1] ;
      GEN_CENTRO2_A2Regi_Id = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.gen_centrocostoupdateredundancy__default(),
         new Object[] {
             new Object[] {
            GEN_CENTRO2_A1Cent_Id, GEN_CENTRO2_A2Regi_Id
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long A1Cent_Id ;
   private long A2Regi_Id ;
   private long AV2GXV2 ;
   private String scmdbuf ;
   private long[] aP0 ;
   private IDataStoreProvider pr_default ;
   private long[] GEN_CENTRO2_A1Cent_Id ;
   private long[] GEN_CENTRO2_A2Regi_Id ;
}

final  class gen_centrocostoupdateredundancy__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("GEN_CENTRO2", "SELECT Cent_Id, Regi_Id FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ORDER BY Cent_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("GEN_CENTRO3", "UPDATE ALM_CUENTADANTE SET Regi_Id=?  WHERE Cent_Id = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_CUENTADANTE")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

