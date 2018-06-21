/*
               File: ALM_CUENTADANTELoadRedundancy
        Description: Load redundancy in table ALM_CUENTADANTE
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:15.32
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class alm_cuentadanteloadredundancy extends GXProcedure
{
   public alm_cuentadanteloadredundancy( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_cuentadanteloadredundancy.class ), "" );
   }

   public alm_cuentadanteloadredundancy( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( "Loading redundancy in table ALM_CUENTADANTE ..." );
      /* Using cursor ALM_CUENTA2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1Cent_Id = ALM_CUENTA2_A1Cent_Id[0] ;
         A2Regi_Id = ALM_CUENTA2_A2Regi_Id[0] ;
         A2Regi_Id = ALM_CUENTA2_A2Regi_Id[0] ;
         A43Cuen_Identificacion = ALM_CUENTA2_A43Cuen_Identificacion[0] ;
         O2Regi_Id = A2Regi_Id ;
         A2Regi_Id = ALM_CUENTA2_A2Regi_Id[0] ;
         O2Regi_Id = A2Regi_Id ;
         A2Regi_Id = O2Regi_Id ;
         O2Regi_Id = A2Regi_Id ;
         /* Using cursor ALM_CUENTA3 */
         pr_default.execute(1, new Object[] {new Long(A2Regi_Id), new Long(A43Cuen_Identificacion)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_CUENTADANTE") ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( "" );
      cleanup();
   }

   protected void cleanup( )
   {
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
      ALM_CUENTA2_A1Cent_Id = new long[1] ;
      ALM_CUENTA2_A2Regi_Id = new long[1] ;
      ALM_CUENTA2_A43Cuen_Identificacion = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_cuentadanteloadredundancy__default(),
         new Object[] {
             new Object[] {
            ALM_CUENTA2_A1Cent_Id, ALM_CUENTA2_A2Regi_Id, ALM_CUENTA2_A2Regi_Id, ALM_CUENTA2_A43Cuen_Identificacion
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
   private long A43Cuen_Identificacion ;
   private long O2Regi_Id ;
   private String scmdbuf ;
   private IDataStoreProvider pr_default ;
   private long[] ALM_CUENTA2_A1Cent_Id ;
   private long[] ALM_CUENTA2_A2Regi_Id ;
   private long[] ALM_CUENTA2_A43Cuen_Identificacion ;
}

final  class alm_cuentadanteloadredundancy__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("ALM_CUENTA2", "SELECT T1.Cent_Id, T1.Regi_Id, T2.Regi_Id, T1.Cuen_Identificacion FROM (ALM_CUENTADANTE T1 INNER JOIN GEN_CENTROCOSTO T2 ON T2.Cent_Id = T1.Cent_Id) ORDER BY T1.Cuen_Identificacion  FOR UPDATE OF T1.Regi_Id NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("ALM_CUENTA3", "UPDATE ALM_CUENTADANTE SET Regi_Id=?  WHERE Cuen_Identificacion = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_CUENTADANTE")
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
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
      }
   }

}

