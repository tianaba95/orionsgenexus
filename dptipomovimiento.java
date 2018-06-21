/*
               File: DPTipoMovimiento
        Description: DP Tipo Movimiento
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:54.46
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dptipomovimiento extends GXProcedure
{
   public dptipomovimiento( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dptipomovimiento.class ), "" );
   }

   public dptipomovimiento( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GXBaseCollection<com.orions2.SdtSDTTipoMovimiento_SDTTipoMovimientoItem> executeUdp( long aP0 ,
                                                                                               long aP1 )
   {
      dptipomovimiento.this.AV6Regi_Id = aP0;
      dptipomovimiento.this.AV5Cent_Id = aP1;
      dptipomovimiento.this.aP2 = aP2;
      dptipomovimiento.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<com.orions2.SdtSDTTipoMovimiento_SDTTipoMovimientoItem>()};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( long aP0 ,
                        long aP1 ,
                        GXBaseCollection<com.orions2.SdtSDTTipoMovimiento_SDTTipoMovimientoItem>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long aP0 ,
                             long aP1 ,
                             GXBaseCollection<com.orions2.SdtSDTTipoMovimiento_SDTTipoMovimientoItem>[] aP2 )
   {
      dptipomovimiento.this.AV6Regi_Id = aP0;
      dptipomovimiento.this.AV5Cent_Id = aP1;
      dptipomovimiento.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00012 */
      pr_default.execute(0, new Object[] {new Long(AV6Regi_Id), new Long(AV5Cent_Id), new Long(AV6Regi_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A429Mbod_CentCostoCodigo = P00012_A429Mbod_CentCostoCodigo[0] ;
         n429Mbod_CentCostoCodigo = P00012_n429Mbod_CentCostoCodigo[0] ;
         A426Mbod_RegionCodigo = P00012_A426Mbod_RegionCodigo[0] ;
         n426Mbod_RegionCodigo = P00012_n426Mbod_RegionCodigo[0] ;
         A63Mbod_CentCostoId = P00012_A63Mbod_CentCostoId[0] ;
         A62Mbod_RegionId = P00012_A62Mbod_RegionId[0] ;
         A434Mbod_Estado = P00012_A434Mbod_Estado[0] ;
         A428Mbod_TipoMovDescrip = P00012_A428Mbod_TipoMovDescrip[0] ;
         n428Mbod_TipoMovDescrip = P00012_n428Mbod_TipoMovDescrip[0] ;
         A61Mbod_TipoMovCodigo = P00012_A61Mbod_TipoMovCodigo[0] ;
         A429Mbod_CentCostoCodigo = P00012_A429Mbod_CentCostoCodigo[0] ;
         n429Mbod_CentCostoCodigo = P00012_n429Mbod_CentCostoCodigo[0] ;
         A426Mbod_RegionCodigo = P00012_A426Mbod_RegionCodigo[0] ;
         n426Mbod_RegionCodigo = P00012_n426Mbod_RegionCodigo[0] ;
         A428Mbod_TipoMovDescrip = P00012_A428Mbod_TipoMovDescrip[0] ;
         n428Mbod_TipoMovDescrip = P00012_n428Mbod_TipoMovDescrip[0] ;
         Gxm1sdttipomovimiento = (com.orions2.SdtSDTTipoMovimiento_SDTTipoMovimientoItem)new com.orions2.SdtSDTTipoMovimiento_SDTTipoMovimientoItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdttipomovimiento, 0);
         Gxm1sdttipomovimiento.setgxTv_SdtSDTTipoMovimiento_SDTTipoMovimientoItem_Tran_codigomovimiento( A61Mbod_TipoMovCodigo );
         Gxm1sdttipomovimiento.setgxTv_SdtSDTTipoMovimiento_SDTTipoMovimientoItem_Tran_descripcionmovimiento( A428Mbod_TipoMovDescrip );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = dptipomovimiento.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<com.orions2.SdtSDTTipoMovimiento_SDTTipoMovimientoItem>(com.orions2.SdtSDTTipoMovimiento_SDTTipoMovimientoItem.class, "SDTTipoMovimiento.SDTTipoMovimientoItem", "ACBSENA", remoteHandle);
      scmdbuf = "" ;
      P00012_A429Mbod_CentCostoCodigo = new String[] {""} ;
      P00012_n429Mbod_CentCostoCodigo = new boolean[] {false} ;
      P00012_A426Mbod_RegionCodigo = new short[1] ;
      P00012_n426Mbod_RegionCodigo = new boolean[] {false} ;
      P00012_A63Mbod_CentCostoId = new long[1] ;
      P00012_A62Mbod_RegionId = new long[1] ;
      P00012_A434Mbod_Estado = new String[] {""} ;
      P00012_A428Mbod_TipoMovDescrip = new String[] {""} ;
      P00012_n428Mbod_TipoMovDescrip = new boolean[] {false} ;
      P00012_A61Mbod_TipoMovCodigo = new String[] {""} ;
      A429Mbod_CentCostoCodigo = "" ;
      A434Mbod_Estado = "" ;
      A428Mbod_TipoMovDescrip = "" ;
      A61Mbod_TipoMovCodigo = "" ;
      Gxm1sdttipomovimiento = new com.orions2.SdtSDTTipoMovimiento_SDTTipoMovimientoItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.dptipomovimiento__default(),
         new Object[] {
             new Object[] {
            P00012_A429Mbod_CentCostoCodigo, P00012_n429Mbod_CentCostoCodigo, P00012_A426Mbod_RegionCodigo, P00012_n426Mbod_RegionCodigo, P00012_A63Mbod_CentCostoId, P00012_A62Mbod_RegionId, P00012_A434Mbod_Estado, P00012_A428Mbod_TipoMovDescrip, P00012_n428Mbod_TipoMovDescrip, P00012_A61Mbod_TipoMovCodigo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A426Mbod_RegionCodigo ;
   private short Gx_err ;
   private long AV6Regi_Id ;
   private long AV5Cent_Id ;
   private long A63Mbod_CentCostoId ;
   private long A62Mbod_RegionId ;
   private String scmdbuf ;
   private String A434Mbod_Estado ;
   private boolean n429Mbod_CentCostoCodigo ;
   private boolean n426Mbod_RegionCodigo ;
   private boolean n428Mbod_TipoMovDescrip ;
   private String A429Mbod_CentCostoCodigo ;
   private String A428Mbod_TipoMovDescrip ;
   private String A61Mbod_TipoMovCodigo ;
   private GXBaseCollection<com.orions2.SdtSDTTipoMovimiento_SDTTipoMovimientoItem>[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00012_A429Mbod_CentCostoCodigo ;
   private boolean[] P00012_n429Mbod_CentCostoCodigo ;
   private short[] P00012_A426Mbod_RegionCodigo ;
   private boolean[] P00012_n426Mbod_RegionCodigo ;
   private long[] P00012_A63Mbod_CentCostoId ;
   private long[] P00012_A62Mbod_RegionId ;
   private String[] P00012_A434Mbod_Estado ;
   private String[] P00012_A428Mbod_TipoMovDescrip ;
   private boolean[] P00012_n428Mbod_TipoMovDescrip ;
   private String[] P00012_A61Mbod_TipoMovCodigo ;
   private GXBaseCollection<com.orions2.SdtSDTTipoMovimiento_SDTTipoMovimientoItem> Gxm2rootcol ;
   private com.orions2.SdtSDTTipoMovimiento_SDTTipoMovimientoItem Gxm1sdttipomovimiento ;
}

final  class dptipomovimiento__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00012", "SELECT DISTINCT NULL AS Mbod_CentCostoCodigo, NULL AS Mbod_RegionCodigo, NULL AS Mbod_CentCostoId, NULL AS Mbod_RegionId, NULL AS Mbod_Estado, Mbod_TipoMovDescrip, Mbod_TipoMovCodigo FROM ( SELECT T2.Cent_Codigo AS Mbod_CentCostoCodigo, T3.Regi_Cod AS Mbod_RegionCodigo, T1.Mbod_CentCostoId AS Mbod_CentCostoId, T1.Mbod_RegionId AS Mbod_RegionId, T1.Mbod_Estado, T4.Tpmo_Descripcion AS Mbod_TipoMovDescrip, T1.Mbod_TipoMovCodigo AS Mbod_TipoMovCodigo FROM (((ALM_RESTRICCIONES T1 INNER JOIN GEN_CENTROCOSTO T2 ON T2.Cent_Id = T1.Mbod_CentCostoId) INNER JOIN GEN_REGIONAL T3 ON T3.Regi_Id = T1.Mbod_RegionId) INNER JOIN ALM_TIPO_MOVIMIENTO T4 ON T4.Tpmo_Codigo = T1.Mbod_TipoMovCodigo) WHERE T1.Mbod_Estado = 'A' and ( ( T1.Mbod_RegionId = ? and T1.Mbod_CentCostoId = ?) or ( T3.Regi_Cod = 0 and T2.Cent_Codigo = '000000') or ( T1.Mbod_RegionId = ? and T2.Cent_Codigo = '000000')) ORDER BY T1.Mbod_TipoMovCodigo) DistinctT ORDER BY Mbod_TipoMovCodigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
               ((String[]) buf[6])[0] = rslt.getString(5, 1) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
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
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
      }
   }

}

