/*
               File: DPModuloOrigenTrn
        Description: DP Modulo Origen Trn
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:55.64
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpmoduloorigentrn extends GXProcedure
{
   public dpmoduloorigentrn( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpmoduloorigentrn.class ), "" );
   }

   public dpmoduloorigentrn( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GXBaseCollection<com.orions2.SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem> executeUdp( String aP0 ,
                                                                                                 long aP1 ,
                                                                                                 long aP2 )
   {
      dpmoduloorigentrn.this.AV5Tpmo_Codigo = aP0;
      dpmoduloorigentrn.this.AV6Cent_Id = aP1;
      dpmoduloorigentrn.this.AV7Regi_Id = aP2;
      dpmoduloorigentrn.this.aP3 = aP3;
      dpmoduloorigentrn.this.aP3 = new GXBaseCollection[] {new GXBaseCollection<com.orions2.SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem>()};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        long aP2 ,
                        GXBaseCollection<com.orions2.SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem>[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             long aP2 ,
                             GXBaseCollection<com.orions2.SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem>[] aP3 )
   {
      dpmoduloorigentrn.this.AV5Tpmo_Codigo = aP0;
      dpmoduloorigentrn.this.AV6Cent_Id = aP1;
      dpmoduloorigentrn.this.AV7Regi_Id = aP2;
      dpmoduloorigentrn.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000D2 */
      pr_default.execute(0, new Object[] {new Long(AV7Regi_Id), new Long(AV6Cent_Id), AV5Tpmo_Codigo, new Long(AV7Regi_Id), AV5Tpmo_Codigo, AV5Tpmo_Codigo});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A426Mbod_RegionCodigo = P000D2_A426Mbod_RegionCodigo[0] ;
         n426Mbod_RegionCodigo = P000D2_n426Mbod_RegionCodigo[0] ;
         A429Mbod_CentCostoCodigo = P000D2_A429Mbod_CentCostoCodigo[0] ;
         n429Mbod_CentCostoCodigo = P000D2_n429Mbod_CentCostoCodigo[0] ;
         A61Mbod_TipoMovCodigo = P000D2_A61Mbod_TipoMovCodigo[0] ;
         A63Mbod_CentCostoId = P000D2_A63Mbod_CentCostoId[0] ;
         A62Mbod_RegionId = P000D2_A62Mbod_RegionId[0] ;
         A434Mbod_Estado = P000D2_A434Mbod_Estado[0] ;
         A364Mbod_AlmModOrigen = P000D2_A364Mbod_AlmModOrigen[0] ;
         A60Mbod_Id = P000D2_A60Mbod_Id[0] ;
         A429Mbod_CentCostoCodigo = P000D2_A429Mbod_CentCostoCodigo[0] ;
         n429Mbod_CentCostoCodigo = P000D2_n429Mbod_CentCostoCodigo[0] ;
         A426Mbod_RegionCodigo = P000D2_A426Mbod_RegionCodigo[0] ;
         n426Mbod_RegionCodigo = P000D2_n426Mbod_RegionCodigo[0] ;
         Gxm1sdtmoduloorigentrn = (com.orions2.SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem)new com.orions2.SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtmoduloorigentrn, 0);
         Gxm1sdtmoduloorigentrn.setgxTv_SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem_Tran_moduloorigen( A364Mbod_AlmModOrigen );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = dpmoduloorigentrn.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<com.orions2.SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem>(com.orions2.SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem.class, "SDTModuloOrigenTrn.SDTModuloOrigenTrnItem", "ACBSENA", remoteHandle);
      scmdbuf = "" ;
      P000D2_A426Mbod_RegionCodigo = new short[1] ;
      P000D2_n426Mbod_RegionCodigo = new boolean[] {false} ;
      P000D2_A429Mbod_CentCostoCodigo = new String[] {""} ;
      P000D2_n429Mbod_CentCostoCodigo = new boolean[] {false} ;
      P000D2_A61Mbod_TipoMovCodigo = new String[] {""} ;
      P000D2_A63Mbod_CentCostoId = new long[1] ;
      P000D2_A62Mbod_RegionId = new long[1] ;
      P000D2_A434Mbod_Estado = new String[] {""} ;
      P000D2_A364Mbod_AlmModOrigen = new String[] {""} ;
      P000D2_A60Mbod_Id = new long[1] ;
      A429Mbod_CentCostoCodigo = "" ;
      A61Mbod_TipoMovCodigo = "" ;
      A434Mbod_Estado = "" ;
      A364Mbod_AlmModOrigen = "" ;
      Gxm1sdtmoduloorigentrn = new com.orions2.SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.dpmoduloorigentrn__default(),
         new Object[] {
             new Object[] {
            P000D2_A426Mbod_RegionCodigo, P000D2_n426Mbod_RegionCodigo, P000D2_A429Mbod_CentCostoCodigo, P000D2_n429Mbod_CentCostoCodigo, P000D2_A61Mbod_TipoMovCodigo, P000D2_A63Mbod_CentCostoId, P000D2_A62Mbod_RegionId, P000D2_A434Mbod_Estado, P000D2_A364Mbod_AlmModOrigen, P000D2_A60Mbod_Id
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A426Mbod_RegionCodigo ;
   private short Gx_err ;
   private long AV6Cent_Id ;
   private long AV7Regi_Id ;
   private long A63Mbod_CentCostoId ;
   private long A62Mbod_RegionId ;
   private long A60Mbod_Id ;
   private String scmdbuf ;
   private String A434Mbod_Estado ;
   private boolean n426Mbod_RegionCodigo ;
   private boolean n429Mbod_CentCostoCodigo ;
   private String AV5Tpmo_Codigo ;
   private String A429Mbod_CentCostoCodigo ;
   private String A61Mbod_TipoMovCodigo ;
   private String A364Mbod_AlmModOrigen ;
   private GXBaseCollection<com.orions2.SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem>[] aP3 ;
   private IDataStoreProvider pr_default ;
   private short[] P000D2_A426Mbod_RegionCodigo ;
   private boolean[] P000D2_n426Mbod_RegionCodigo ;
   private String[] P000D2_A429Mbod_CentCostoCodigo ;
   private boolean[] P000D2_n429Mbod_CentCostoCodigo ;
   private String[] P000D2_A61Mbod_TipoMovCodigo ;
   private long[] P000D2_A63Mbod_CentCostoId ;
   private long[] P000D2_A62Mbod_RegionId ;
   private String[] P000D2_A434Mbod_Estado ;
   private String[] P000D2_A364Mbod_AlmModOrigen ;
   private long[] P000D2_A60Mbod_Id ;
   private GXBaseCollection<com.orions2.SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem> Gxm2rootcol ;
   private com.orions2.SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem Gxm1sdtmoduloorigentrn ;
}

final  class dpmoduloorigentrn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000D2", "SELECT T3.Regi_Cod AS Mbod_RegionCodigo, T2.Cent_Codigo AS Mbod_CentCostoCodigo, T1.Mbod_TipoMovCodigo, T1.Mbod_CentCostoId AS Mbod_CentCostoId, T1.Mbod_RegionId AS Mbod_RegionId, T1.Mbod_Estado, T1.Mbod_AlmModOrigen, T1.Mbod_Id FROM ((ALM_RESTRICCIONES T1 INNER JOIN GEN_CENTROCOSTO T2 ON T2.Cent_Id = T1.Mbod_CentCostoId) INNER JOIN GEN_REGIONAL T3 ON T3.Regi_Id = T1.Mbod_RegionId) WHERE T1.Mbod_Estado = 'A' and ( ( T1.Mbod_RegionId = ? and T1.Mbod_CentCostoId = ? and T1.Mbod_TipoMovCodigo = ?) or ( T1.Mbod_RegionId = ? and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ?) or ( T3.Regi_Cod = 0 and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ?)) ORDER BY T1.Mbod_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
               ((long[]) buf[6])[0] = rslt.getLong(5) ;
               ((String[]) buf[7])[0] = rslt.getString(6, 1) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(7) ;
               ((long[]) buf[9])[0] = rslt.getLong(8) ;
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setVarchar(5, (String)parms[4], 3);
               stmt.setVarchar(6, (String)parms[5], 3);
               return;
      }
   }

}

