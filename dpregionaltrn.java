/*
               File: DPRegionalTrn
        Description: DPRegional Trn
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:55.38
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpregionaltrn extends GXProcedure
{
   public dpregionaltrn( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpregionaltrn.class ), "" );
   }

   public dpregionaltrn( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GXBaseCollection<com.orions2.SdtSDTRegionalTrn_SDTRegionalTrnItem> executeUdp( long aP0 )
   {
      dpregionaltrn.this.AV5Usua_Id = aP0;
      dpregionaltrn.this.aP1 = aP1;
      dpregionaltrn.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.orions2.SdtSDTRegionalTrn_SDTRegionalTrnItem>()};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( long aP0 ,
                        GXBaseCollection<com.orions2.SdtSDTRegionalTrn_SDTRegionalTrnItem>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( long aP0 ,
                             GXBaseCollection<com.orions2.SdtSDTRegionalTrn_SDTRegionalTrnItem>[] aP1 )
   {
      dpregionaltrn.this.AV5Usua_Id = aP0;
      dpregionaltrn.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000C2 */
      pr_default.execute(0, new Object[] {new Long(AV5Usua_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1Cent_Id = P000C2_A1Cent_Id[0] ;
         A23Usua_Id = P000C2_A23Usua_Id[0] ;
         A2Regi_Id = P000C2_A2Regi_Id[0] ;
         A12Regi_Cod = P000C2_A12Regi_Cod[0] ;
         A13Regi_Descripcion = P000C2_A13Regi_Descripcion[0] ;
         A2Regi_Id = P000C2_A2Regi_Id[0] ;
         A12Regi_Cod = P000C2_A12Regi_Cod[0] ;
         A13Regi_Descripcion = P000C2_A13Regi_Descripcion[0] ;
         Gxm1sdtregionaltrn = (com.orions2.SdtSDTRegionalTrn_SDTRegionalTrnItem)new com.orions2.SdtSDTRegionalTrn_SDTRegionalTrnItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtregionaltrn, 0);
         Gxm1sdtregionaltrn.setgxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regionid( A2Regi_Id );
         Gxm1sdtregionaltrn.setgxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regioncodigo( A12Regi_Cod );
         Gxm1sdtregionaltrn.setgxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regiondescripcion( GXutil.str( A12Regi_Cod, 4, 0)+" - "+A13Regi_Descripcion );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = dpregionaltrn.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<com.orions2.SdtSDTRegionalTrn_SDTRegionalTrnItem>(com.orions2.SdtSDTRegionalTrn_SDTRegionalTrnItem.class, "SDTRegionalTrn.SDTRegionalTrnItem", "ACBSENA", remoteHandle);
      scmdbuf = "" ;
      P000C2_A1Cent_Id = new long[1] ;
      P000C2_A23Usua_Id = new long[1] ;
      P000C2_A2Regi_Id = new long[1] ;
      P000C2_A12Regi_Cod = new short[1] ;
      P000C2_A13Regi_Descripcion = new String[] {""} ;
      A13Regi_Descripcion = "" ;
      Gxm1sdtregionaltrn = new com.orions2.SdtSDTRegionalTrn_SDTRegionalTrnItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.dpregionaltrn__default(),
         new Object[] {
             new Object[] {
            P000C2_A1Cent_Id, P000C2_A23Usua_Id, P000C2_A2Regi_Id, P000C2_A12Regi_Cod, P000C2_A13Regi_Descripcion
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A12Regi_Cod ;
   private short Gx_err ;
   private long AV5Usua_Id ;
   private long A1Cent_Id ;
   private long A23Usua_Id ;
   private long A2Regi_Id ;
   private String scmdbuf ;
   private String A13Regi_Descripcion ;
   private GXBaseCollection<com.orions2.SdtSDTRegionalTrn_SDTRegionalTrnItem>[] aP1 ;
   private IDataStoreProvider pr_default ;
   private long[] P000C2_A1Cent_Id ;
   private long[] P000C2_A23Usua_Id ;
   private long[] P000C2_A2Regi_Id ;
   private short[] P000C2_A12Regi_Cod ;
   private String[] P000C2_A13Regi_Descripcion ;
   private GXBaseCollection<com.orions2.SdtSDTRegionalTrn_SDTRegionalTrnItem> Gxm2rootcol ;
   private com.orions2.SdtSDTRegionalTrn_SDTRegionalTrnItem Gxm1sdtregionaltrn ;
}

final  class dpregionaltrn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000C2", "SELECT T1.Cent_Id, T1.Usua_Id, T2.Regi_Id, T3.Regi_Cod, T3.Regi_Descripcion FROM ((SEG_USUARIO_CENTRO T1 INNER JOIN GEN_CENTROCOSTO T2 ON T2.Cent_Id = T1.Cent_Id) INNER JOIN GEN_REGIONAL T3 ON T3.Regi_Id = T2.Regi_Id) WHERE T1.Usua_Id = ? ORDER BY T1.Usua_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
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
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
      }
   }

}

