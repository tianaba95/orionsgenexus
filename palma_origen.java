/*
               File: PAlma_Origen
        Description: Almacen Origen
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:7.86
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palma_origen extends GXProcedure
{
   public palma_origen( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palma_origen.class ), "" );
   }

   public palma_origen( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GXBaseCollection<com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem> executeUdp( long[] aP0 ,
                                                                                         long[] aP1 ,
                                                                                         String[] aP2 ,
                                                                                         String[] aP3 )
   {
      palma_origen.this.AV11Tran_RegionId = aP0[0];
      this.aP0 = aP0;
      palma_origen.this.AV8Tran_CentroCostoId = aP1[0];
      this.aP1 = aP1;
      palma_origen.this.AV9Tran_CodigoMovimiento = aP2[0];
      this.aP2 = aP2;
      palma_origen.this.AV10Tran_ModuloOrigen = aP3[0];
      this.aP3 = aP3;
      palma_origen.this.AV12SDTAlma_Origen = aP4[0];
      this.aP4 = aP4;
      palma_origen.this.aP4 = new GXBaseCollection[] {new GXBaseCollection<com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem>()};
      initialize();
      privateExecute();
      return aP4[0];
   }

   public void execute( long[] aP0 ,
                        long[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        GXBaseCollection<com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem>[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( long[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             GXBaseCollection<com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem>[] aP4 )
   {
      palma_origen.this.AV11Tran_RegionId = aP0[0];
      this.aP0 = aP0;
      palma_origen.this.AV8Tran_CentroCostoId = aP1[0];
      this.aP1 = aP1;
      palma_origen.this.AV9Tran_CodigoMovimiento = aP2[0];
      this.aP2 = aP2;
      palma_origen.this.AV10Tran_ModuloOrigen = aP3[0];
      this.aP3 = aP3;
      palma_origen.this.AV12SDTAlma_Origen = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18GXLvl2 = (byte)(0) ;
      /* Using cursor P001Y2 */
      pr_default.execute(0, new Object[] {AV9Tran_CodigoMovimiento, new Long(AV11Tran_RegionId), new Long(AV8Tran_CentroCostoId), AV10Tran_ModuloOrigen});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A434Mbod_Estado = P001Y2_A434Mbod_Estado[0] ;
         A364Mbod_AlmModOrigen = P001Y2_A364Mbod_AlmModOrigen[0] ;
         A61Mbod_TipoMovCodigo = P001Y2_A61Mbod_TipoMovCodigo[0] ;
         A63Mbod_CentCostoId = P001Y2_A63Mbod_CentCostoId[0] ;
         A62Mbod_RegionId = P001Y2_A62Mbod_RegionId[0] ;
         A342Mbod_AlmOrigenCodigo = P001Y2_A342Mbod_AlmOrigenCodigo[0] ;
         A60Mbod_Id = P001Y2_A60Mbod_Id[0] ;
         AV18GXLvl2 = (byte)(1) ;
         if ( GXutil.strcmp(A342Mbod_AlmOrigenCodigo, "00") != 0 )
         {
            AV13SDTAlma_OrigenItem = (com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem)new com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem(remoteHandle, context);
            AV13SDTAlma_OrigenItem.setgxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_codigo( A342Mbod_AlmOrigenCodigo );
            AV15Mbod_AlmOrigenCodigo = A342Mbod_AlmOrigenCodigo ;
            /* Execute user subroutine: 'ALMACEN' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV13SDTAlma_OrigenItem.setgxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_descripcion( AV14Alma_Descripcion );
            AV12SDTAlma_Origen.add(AV13SDTAlma_OrigenItem, 0);
         }
         else
         {
            /* Execute user subroutine: 'TODOS ALMACEN' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV18GXLvl2 == 0 )
      {
         /* Execute user subroutine: 'RESTRICCIONES' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'ALMACEN' Routine */
      AV14Alma_Descripcion = "" ;
      /* Using cursor P001Y3 */
      pr_default.execute(1, new Object[] {new Long(AV8Tran_CentroCostoId), AV10Tran_ModuloOrigen, AV15Mbod_AlmOrigenCodigo});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A28Alma_Codigo = P001Y3_A28Alma_Codigo[0] ;
         A27Alma_Modulo = P001Y3_A27Alma_Modulo[0] ;
         A1Cent_Id = P001Y3_A1Cent_Id[0] ;
         A252Alma_Descripcion = P001Y3_A252Alma_Descripcion[0] ;
         AV14Alma_Descripcion = A252Alma_Descripcion ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void S121( )
   {
      /* 'TODOS ALMACEN' Routine */
      /* Using cursor P001Y4 */
      pr_default.execute(2, new Object[] {new Long(AV8Tran_CentroCostoId), AV10Tran_ModuloOrigen});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A27Alma_Modulo = P001Y4_A27Alma_Modulo[0] ;
         A1Cent_Id = P001Y4_A1Cent_Id[0] ;
         A28Alma_Codigo = P001Y4_A28Alma_Codigo[0] ;
         A252Alma_Descripcion = P001Y4_A252Alma_Descripcion[0] ;
         if ( GXutil.strcmp(A28Alma_Codigo, "00") != 0 )
         {
            AV13SDTAlma_OrigenItem = (com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem)new com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem(remoteHandle, context);
            AV13SDTAlma_OrigenItem.setgxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_codigo( A28Alma_Codigo );
            AV13SDTAlma_OrigenItem.setgxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_descripcion( A252Alma_Descripcion );
            AV12SDTAlma_Origen.add(AV13SDTAlma_OrigenItem, 0);
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S131( )
   {
      /* 'RESTRICCIONES' Routine */
      /* Using cursor P001Y5 */
      pr_default.execute(3, new Object[] {new Long(AV11Tran_RegionId), AV9Tran_CodigoMovimiento, AV10Tran_ModuloOrigen, AV9Tran_CodigoMovimiento, AV10Tran_ModuloOrigen});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A63Mbod_CentCostoId = P001Y5_A63Mbod_CentCostoId[0] ;
         A426Mbod_RegionCodigo = P001Y5_A426Mbod_RegionCodigo[0] ;
         n426Mbod_RegionCodigo = P001Y5_n426Mbod_RegionCodigo[0] ;
         A364Mbod_AlmModOrigen = P001Y5_A364Mbod_AlmModOrigen[0] ;
         A61Mbod_TipoMovCodigo = P001Y5_A61Mbod_TipoMovCodigo[0] ;
         A429Mbod_CentCostoCodigo = P001Y5_A429Mbod_CentCostoCodigo[0] ;
         n429Mbod_CentCostoCodigo = P001Y5_n429Mbod_CentCostoCodigo[0] ;
         A62Mbod_RegionId = P001Y5_A62Mbod_RegionId[0] ;
         A434Mbod_Estado = P001Y5_A434Mbod_Estado[0] ;
         A342Mbod_AlmOrigenCodigo = P001Y5_A342Mbod_AlmOrigenCodigo[0] ;
         A60Mbod_Id = P001Y5_A60Mbod_Id[0] ;
         A429Mbod_CentCostoCodigo = P001Y5_A429Mbod_CentCostoCodigo[0] ;
         n429Mbod_CentCostoCodigo = P001Y5_n429Mbod_CentCostoCodigo[0] ;
         A426Mbod_RegionCodigo = P001Y5_A426Mbod_RegionCodigo[0] ;
         n426Mbod_RegionCodigo = P001Y5_n426Mbod_RegionCodigo[0] ;
         if ( GXutil.strcmp(A342Mbod_AlmOrigenCodigo, "00") != 0 )
         {
            AV13SDTAlma_OrigenItem = (com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem)new com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem(remoteHandle, context);
            AV13SDTAlma_OrigenItem.setgxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_codigo( A342Mbod_AlmOrigenCodigo );
            AV15Mbod_AlmOrigenCodigo = A342Mbod_AlmOrigenCodigo ;
            /* Execute user subroutine: 'ALMACEN' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(3);
               pr_default.close(3);
               pr_default.close(3);
               returnInSub = true;
               if (true) return;
            }
            AV13SDTAlma_OrigenItem.setgxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_descripcion( AV14Alma_Descripcion );
            AV12SDTAlma_Origen.add(AV13SDTAlma_OrigenItem, 0);
         }
         else
         {
            /* Execute user subroutine: 'TODOS ALMACEN' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(3);
               pr_default.close(3);
               pr_default.close(3);
               returnInSub = true;
               if (true) return;
            }
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP0[0] = palma_origen.this.AV11Tran_RegionId;
      this.aP1[0] = palma_origen.this.AV8Tran_CentroCostoId;
      this.aP2[0] = palma_origen.this.AV9Tran_CodigoMovimiento;
      this.aP3[0] = palma_origen.this.AV10Tran_ModuloOrigen;
      this.aP4[0] = palma_origen.this.AV12SDTAlma_Origen;
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
      P001Y2_A434Mbod_Estado = new String[] {""} ;
      P001Y2_A364Mbod_AlmModOrigen = new String[] {""} ;
      P001Y2_A61Mbod_TipoMovCodigo = new String[] {""} ;
      P001Y2_A63Mbod_CentCostoId = new long[1] ;
      P001Y2_A62Mbod_RegionId = new long[1] ;
      P001Y2_A342Mbod_AlmOrigenCodigo = new String[] {""} ;
      P001Y2_A60Mbod_Id = new long[1] ;
      A434Mbod_Estado = "" ;
      A364Mbod_AlmModOrigen = "" ;
      A61Mbod_TipoMovCodigo = "" ;
      A342Mbod_AlmOrigenCodigo = "" ;
      AV13SDTAlma_OrigenItem = new com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem(remoteHandle, context);
      AV15Mbod_AlmOrigenCodigo = "" ;
      AV14Alma_Descripcion = "" ;
      P001Y3_A28Alma_Codigo = new String[] {""} ;
      P001Y3_A27Alma_Modulo = new String[] {""} ;
      P001Y3_A1Cent_Id = new long[1] ;
      P001Y3_A252Alma_Descripcion = new String[] {""} ;
      A28Alma_Codigo = "" ;
      A27Alma_Modulo = "" ;
      A252Alma_Descripcion = "" ;
      P001Y4_A27Alma_Modulo = new String[] {""} ;
      P001Y4_A1Cent_Id = new long[1] ;
      P001Y4_A28Alma_Codigo = new String[] {""} ;
      P001Y4_A252Alma_Descripcion = new String[] {""} ;
      P001Y5_A63Mbod_CentCostoId = new long[1] ;
      P001Y5_A426Mbod_RegionCodigo = new short[1] ;
      P001Y5_n426Mbod_RegionCodigo = new boolean[] {false} ;
      P001Y5_A364Mbod_AlmModOrigen = new String[] {""} ;
      P001Y5_A61Mbod_TipoMovCodigo = new String[] {""} ;
      P001Y5_A429Mbod_CentCostoCodigo = new String[] {""} ;
      P001Y5_n429Mbod_CentCostoCodigo = new boolean[] {false} ;
      P001Y5_A62Mbod_RegionId = new long[1] ;
      P001Y5_A434Mbod_Estado = new String[] {""} ;
      P001Y5_A342Mbod_AlmOrigenCodigo = new String[] {""} ;
      P001Y5_A60Mbod_Id = new long[1] ;
      A429Mbod_CentCostoCodigo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.palma_origen__default(),
         new Object[] {
             new Object[] {
            P001Y2_A434Mbod_Estado, P001Y2_A364Mbod_AlmModOrigen, P001Y2_A61Mbod_TipoMovCodigo, P001Y2_A63Mbod_CentCostoId, P001Y2_A62Mbod_RegionId, P001Y2_A342Mbod_AlmOrigenCodigo, P001Y2_A60Mbod_Id
            }
            , new Object[] {
            P001Y3_A28Alma_Codigo, P001Y3_A27Alma_Modulo, P001Y3_A1Cent_Id, P001Y3_A252Alma_Descripcion
            }
            , new Object[] {
            P001Y4_A27Alma_Modulo, P001Y4_A1Cent_Id, P001Y4_A28Alma_Codigo, P001Y4_A252Alma_Descripcion
            }
            , new Object[] {
            P001Y5_A63Mbod_CentCostoId, P001Y5_A426Mbod_RegionCodigo, P001Y5_n426Mbod_RegionCodigo, P001Y5_A364Mbod_AlmModOrigen, P001Y5_A61Mbod_TipoMovCodigo, P001Y5_A429Mbod_CentCostoCodigo, P001Y5_n429Mbod_CentCostoCodigo, P001Y5_A62Mbod_RegionId, P001Y5_A434Mbod_Estado, P001Y5_A342Mbod_AlmOrigenCodigo,
            P001Y5_A60Mbod_Id
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18GXLvl2 ;
   private short A426Mbod_RegionCodigo ;
   private short Gx_err ;
   private long AV11Tran_RegionId ;
   private long AV8Tran_CentroCostoId ;
   private long A63Mbod_CentCostoId ;
   private long A62Mbod_RegionId ;
   private long A60Mbod_Id ;
   private long A1Cent_Id ;
   private String scmdbuf ;
   private String A434Mbod_Estado ;
   private boolean returnInSub ;
   private boolean n426Mbod_RegionCodigo ;
   private boolean n429Mbod_CentCostoCodigo ;
   private String AV9Tran_CodigoMovimiento ;
   private String AV10Tran_ModuloOrigen ;
   private String A364Mbod_AlmModOrigen ;
   private String A61Mbod_TipoMovCodigo ;
   private String A342Mbod_AlmOrigenCodigo ;
   private String AV15Mbod_AlmOrigenCodigo ;
   private String AV14Alma_Descripcion ;
   private String A28Alma_Codigo ;
   private String A27Alma_Modulo ;
   private String A252Alma_Descripcion ;
   private String A429Mbod_CentCostoCodigo ;
   private long[] aP0 ;
   private long[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private GXBaseCollection<com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem>[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P001Y2_A434Mbod_Estado ;
   private String[] P001Y2_A364Mbod_AlmModOrigen ;
   private String[] P001Y2_A61Mbod_TipoMovCodigo ;
   private long[] P001Y2_A63Mbod_CentCostoId ;
   private long[] P001Y2_A62Mbod_RegionId ;
   private String[] P001Y2_A342Mbod_AlmOrigenCodigo ;
   private long[] P001Y2_A60Mbod_Id ;
   private String[] P001Y3_A28Alma_Codigo ;
   private String[] P001Y3_A27Alma_Modulo ;
   private long[] P001Y3_A1Cent_Id ;
   private String[] P001Y3_A252Alma_Descripcion ;
   private String[] P001Y4_A27Alma_Modulo ;
   private long[] P001Y4_A1Cent_Id ;
   private String[] P001Y4_A28Alma_Codigo ;
   private String[] P001Y4_A252Alma_Descripcion ;
   private long[] P001Y5_A63Mbod_CentCostoId ;
   private short[] P001Y5_A426Mbod_RegionCodigo ;
   private boolean[] P001Y5_n426Mbod_RegionCodigo ;
   private String[] P001Y5_A364Mbod_AlmModOrigen ;
   private String[] P001Y5_A61Mbod_TipoMovCodigo ;
   private String[] P001Y5_A429Mbod_CentCostoCodigo ;
   private boolean[] P001Y5_n429Mbod_CentCostoCodigo ;
   private long[] P001Y5_A62Mbod_RegionId ;
   private String[] P001Y5_A434Mbod_Estado ;
   private String[] P001Y5_A342Mbod_AlmOrigenCodigo ;
   private long[] P001Y5_A60Mbod_Id ;
   private GXBaseCollection<com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem> AV12SDTAlma_Origen ;
   private com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem AV13SDTAlma_OrigenItem ;
}

final  class palma_origen__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001Y2", "SELECT Mbod_Estado, Mbod_AlmModOrigen, Mbod_TipoMovCodigo, Mbod_CentCostoId, Mbod_RegionId, Mbod_AlmOrigenCodigo, Mbod_Id FROM ALM_RESTRICCIONES WHERE (Mbod_TipoMovCodigo = ?) AND (Mbod_RegionId = ?) AND (Mbod_CentCostoId = ?) AND (Mbod_AlmModOrigen = ?) AND (Mbod_Estado = 'A') ORDER BY Mbod_TipoMovCodigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001Y3", "SELECT Alma_Codigo, Alma_Modulo, Cent_Id, Alma_Descripcion FROM ALM_ALMACEN WHERE Cent_Id = ? and Alma_Modulo = ? and Alma_Codigo = ? ORDER BY Cent_Id, Alma_Modulo, Alma_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P001Y4", "SELECT Alma_Modulo, Cent_Id, Alma_Codigo, Alma_Descripcion FROM ALM_ALMACEN WHERE Cent_Id = ? and Alma_Modulo = ? ORDER BY Cent_Id, Alma_Modulo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001Y5", "SELECT T1.Mbod_CentCostoId AS Mbod_CentCostoId, T3.Regi_Cod AS Mbod_RegionCodigo, T1.Mbod_AlmModOrigen, T1.Mbod_TipoMovCodigo, T2.Cent_Codigo AS Mbod_CentCostoCodigo, T1.Mbod_RegionId AS Mbod_RegionId, T1.Mbod_Estado, T1.Mbod_AlmOrigenCodigo, T1.Mbod_Id FROM ((ALM_RESTRICCIONES T1 INNER JOIN GEN_CENTROCOSTO T2 ON T2.Cent_Id = T1.Mbod_CentCostoId) INNER JOIN GEN_REGIONAL T3 ON T3.Regi_Id = T1.Mbod_RegionId) WHERE (( T1.Mbod_RegionId = ? and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ?) or ( T3.Regi_Cod = 0 and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ?)) AND (T1.Mbod_Estado = 'A') ORDER BY T1.Mbod_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((long[]) buf[6])[0] = rslt.getLong(7) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(6) ;
               ((String[]) buf[8])[0] = rslt.getString(7, 1) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(8) ;
               ((long[]) buf[10])[0] = rslt.getLong(9) ;
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
               stmt.setVarchar(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setVarchar(4, (String)parms[3], 8);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 8);
               stmt.setVarchar(3, (String)parms[2], 2);
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 8);
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 3);
               stmt.setVarchar(3, (String)parms[2], 8);
               stmt.setVarchar(4, (String)parms[3], 3);
               stmt.setVarchar(5, (String)parms[4], 8);
               return;
      }
   }

}

