/*
               File: PCedulaCuentaMultiple
        Description: Cedula Cuenta Multiple
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:57.77
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcedulacuentamultiple extends GXProcedure
{
   public pcedulacuentamultiple( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcedulacuentamultiple.class ), "" );
   }

   public pcedulacuentamultiple( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public long executeUdp( long aP0 )
   {
      pcedulacuentamultiple.this.AV8pCent_Id = aP0;
      pcedulacuentamultiple.this.aP1 = aP1;
      pcedulacuentamultiple.this.aP1 = new long[] {0};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( long aP0 ,
                        long[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( long aP0 ,
                             long[] aP1 )
   {
      pcedulacuentamultiple.this.AV8pCent_Id = aP0;
      pcedulacuentamultiple.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: 'BUCARCENTROCOSTO' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'ARMARCEDULA' */
      S121 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'BUCARCENTROCOSTO' Routine */
      /* Using cursor P000N2 */
      pr_default.execute(0, new Object[] {new Long(AV8pCent_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2Regi_Id = P000N2_A2Regi_Id[0] ;
         A1Cent_Id = P000N2_A1Cent_Id[0] ;
         A12Regi_Cod = P000N2_A12Regi_Cod[0] ;
         A3Cent_Codigo = P000N2_A3Cent_Codigo[0] ;
         A694Cent_ConsMultiCedula = P000N2_A694Cent_ConsMultiCedula[0] ;
         A12Regi_Cod = P000N2_A12Regi_Cod[0] ;
         AV10Regi_Cod = A12Regi_Cod ;
         AV12Cent_Codigo = A3Cent_Codigo ;
         AV11Cent_ConsMultiCedula = (long)(A694Cent_ConsMultiCedula+1) ;
         A694Cent_ConsMultiCedula = (long)(A694Cent_ConsMultiCedula+1) ;
         /* Using cursor P000N3 */
         pr_default.execute(1, new Object[] {new Long(A694Cent_ConsMultiCedula), new Long(A1Cent_Id)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("GEN_CENTROCOSTO") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
   }

   public void S121( )
   {
      /* 'ARMARCEDULA' Routine */
      AV13sCuen_Cedula = GXutil.substring( AV12Cent_Codigo, 1, 4) ;
      if ( AV11Cent_ConsMultiCedula < 10 )
      {
         AV14Consecutivo = GXutil.concat( "000000", GXutil.trim( GXutil.str( AV11Cent_ConsMultiCedula, 18, 0)), "") ;
      }
      else if ( ( AV11Cent_ConsMultiCedula >= 10 ) && ( AV11Cent_ConsMultiCedula < 100 ) )
      {
         AV14Consecutivo = GXutil.concat( "00000", GXutil.trim( GXutil.str( AV11Cent_ConsMultiCedula, 18, 0)), "") ;
      }
      else if ( ( AV11Cent_ConsMultiCedula >= 100 ) && ( AV11Cent_ConsMultiCedula < 1000 ) )
      {
         AV14Consecutivo = GXutil.concat( "0000", GXutil.trim( GXutil.str( AV11Cent_ConsMultiCedula, 18, 0)), "") ;
      }
      else if ( ( AV11Cent_ConsMultiCedula >= 1000 ) && ( AV11Cent_ConsMultiCedula < 10000 ) )
      {
         AV14Consecutivo = GXutil.concat( "000", GXutil.trim( GXutil.str( AV11Cent_ConsMultiCedula, 18, 0)), "") ;
      }
      else if ( ( AV11Cent_ConsMultiCedula >= 10000 ) && ( AV11Cent_ConsMultiCedula < 100000 ) )
      {
         AV14Consecutivo = GXutil.concat( "00", GXutil.trim( GXutil.str( AV11Cent_ConsMultiCedula, 18, 0)), "") ;
      }
      else if ( ( AV11Cent_ConsMultiCedula >= 100000 ) && ( AV11Cent_ConsMultiCedula < 1000000 ) )
      {
         AV14Consecutivo = GXutil.concat( "0", GXutil.trim( GXutil.str( AV11Cent_ConsMultiCedula, 18, 0)), "") ;
      }
      else if ( ( AV11Cent_ConsMultiCedula >= 1000000 ) && ( AV11Cent_ConsMultiCedula < 10000000 ) )
      {
         AV14Consecutivo = GXutil.trim( GXutil.str( AV11Cent_ConsMultiCedula, 18, 0)) ;
      }
      AV9cCuen_Cedula = GXutil.lval( GXutil.concat( AV13sCuen_Cedula, GXutil.trim( AV14Consecutivo), "")) ;
   }

   protected void cleanup( )
   {
      this.aP1[0] = pcedulacuentamultiple.this.AV9cCuen_Cedula;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "pcedulacuentamultiple");
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
      P000N2_A2Regi_Id = new long[1] ;
      P000N2_A1Cent_Id = new long[1] ;
      P000N2_A12Regi_Cod = new short[1] ;
      P000N2_A3Cent_Codigo = new String[] {""} ;
      P000N2_A694Cent_ConsMultiCedula = new long[1] ;
      A3Cent_Codigo = "" ;
      AV12Cent_Codigo = "" ;
      AV13sCuen_Cedula = "" ;
      AV14Consecutivo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.pcedulacuentamultiple__default(),
         new Object[] {
             new Object[] {
            P000N2_A2Regi_Id, P000N2_A1Cent_Id, P000N2_A12Regi_Cod, P000N2_A3Cent_Codigo, P000N2_A694Cent_ConsMultiCedula
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A12Regi_Cod ;
   private short AV10Regi_Cod ;
   private short Gx_err ;
   private long AV8pCent_Id ;
   private long AV9cCuen_Cedula ;
   private long A2Regi_Id ;
   private long A1Cent_Id ;
   private long A694Cent_ConsMultiCedula ;
   private long AV11Cent_ConsMultiCedula ;
   private String scmdbuf ;
   private String AV13sCuen_Cedula ;
   private boolean returnInSub ;
   private String A3Cent_Codigo ;
   private String AV12Cent_Codigo ;
   private String AV14Consecutivo ;
   private long[] aP1 ;
   private IDataStoreProvider pr_default ;
   private long[] P000N2_A2Regi_Id ;
   private long[] P000N2_A1Cent_Id ;
   private short[] P000N2_A12Regi_Cod ;
   private String[] P000N2_A3Cent_Codigo ;
   private long[] P000N2_A694Cent_ConsMultiCedula ;
}

final  class pcedulacuentamultiple__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000N2", "SELECT T1.Regi_Id, T1.Cent_Id, T2.Regi_Cod, T1.Cent_Codigo, T1.Cent_ConsMultiCedula FROM (GEN_CENTROCOSTO T1 INNER JOIN GEN_REGIONAL T2 ON T2.Regi_Id = T1.Regi_Id) WHERE T1.Cent_Id = ? ORDER BY T1.Cent_Id  FOR UPDATE OF T1.Cent_ConsMultiCedula NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P000N3", "UPDATE GEN_CENTROCOSTO SET Cent_ConsMultiCedula=?  WHERE Cent_Id = ?", GX_NOMASK + GX_MASKLOOPLOCK, "GEN_CENTROCOSTO")
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
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
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
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

