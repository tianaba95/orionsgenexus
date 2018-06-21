/*
               File: PBode_Origen
        Description: PBode_Origen
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:8.9
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbode_origen extends GXProcedure
{
   public pbode_origen( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbode_origen.class ), "" );
   }

   public pbode_origen( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GXBaseCollection<com.orions2.SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem> executeUdp( long[] aP0 ,
                                                                                                 long[] aP1 ,
                                                                                                 String[] aP2 ,
                                                                                                 String[] aP3 ,
                                                                                                 String[] aP4 )
   {
      pbode_origen.this.AV13Tran_RegionId = aP0[0];
      this.aP0 = aP0;
      pbode_origen.this.AV10Tran_CentroCostoId = aP1[0];
      this.aP1 = aP1;
      pbode_origen.this.AV11Tran_CodigoMovimiento = aP2[0];
      this.aP2 = aP2;
      pbode_origen.this.AV12Tran_ModuloOrigen = aP3[0];
      this.aP3 = aP3;
      pbode_origen.this.AV17Tran_CodAlmaOrigen = aP4[0];
      this.aP4 = aP4;
      pbode_origen.this.AV15SDTBodegaOrigenTrn = aP5[0];
      this.aP5 = aP5;
      pbode_origen.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<com.orions2.SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem>()};
      initialize();
      privateExecute();
      return aP5[0];
   }

   public void execute( long[] aP0 ,
                        long[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        GXBaseCollection<com.orions2.SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( long[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             GXBaseCollection<com.orions2.SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem>[] aP5 )
   {
      pbode_origen.this.AV13Tran_RegionId = aP0[0];
      this.aP0 = aP0;
      pbode_origen.this.AV10Tran_CentroCostoId = aP1[0];
      this.aP1 = aP1;
      pbode_origen.this.AV11Tran_CodigoMovimiento = aP2[0];
      this.aP2 = aP2;
      pbode_origen.this.AV12Tran_ModuloOrigen = aP3[0];
      this.aP3 = aP3;
      pbode_origen.this.AV17Tran_CodAlmaOrigen = aP4[0];
      this.aP4 = aP4;
      pbode_origen.this.AV15SDTBodegaOrigenTrn = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV20GXLvl2 = (byte)(0) ;
      /* Using cursor P001Z2 */
      pr_default.execute(0, new Object[] {AV11Tran_CodigoMovimiento, new Long(AV13Tran_RegionId), new Long(AV10Tran_CentroCostoId), AV12Tran_ModuloOrigen, AV17Tran_CodAlmaOrigen});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A434Mbod_Estado = P001Z2_A434Mbod_Estado[0] ;
         A342Mbod_AlmOrigenCodigo = P001Z2_A342Mbod_AlmOrigenCodigo[0] ;
         A364Mbod_AlmModOrigen = P001Z2_A364Mbod_AlmModOrigen[0] ;
         A61Mbod_TipoMovCodigo = P001Z2_A61Mbod_TipoMovCodigo[0] ;
         A63Mbod_CentCostoId = P001Z2_A63Mbod_CentCostoId[0] ;
         A62Mbod_RegionId = P001Z2_A62Mbod_RegionId[0] ;
         A64Mbod_BodOrigenCodigo = P001Z2_A64Mbod_BodOrigenCodigo[0] ;
         A60Mbod_Id = P001Z2_A60Mbod_Id[0] ;
         AV20GXLvl2 = (byte)(1) ;
         if ( GXutil.strcmp(A64Mbod_BodOrigenCodigo, "000") != 0 )
         {
            AV16SDTBodegaOrigenTrnItem = (com.orions2.SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem)new com.orions2.SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem(remoteHandle, context);
            AV16SDTBodegaOrigenTrnItem.setgxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_codigo( A64Mbod_BodOrigenCodigo );
            AV9Mbod_BodOrigenCodigo = A64Mbod_BodOrigenCodigo ;
            /* Execute user subroutine: 'BODEGA' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV16SDTBodegaOrigenTrnItem.setgxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_descripcion( AV14Bode_Descripcion );
            AV15SDTBodegaOrigenTrn.add(AV16SDTBodegaOrigenTrnItem, 0);
         }
         else
         {
            /* Execute user subroutine: 'TODOS BODEGA' */
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
      if ( AV20GXLvl2 == 0 )
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
      /* 'BODEGA' Routine */
      AV14Bode_Descripcion = "" ;
      /* Using cursor P001Z3 */
      pr_default.execute(1, new Object[] {new Long(AV10Tran_CentroCostoId), AV12Tran_ModuloOrigen, AV17Tran_CodAlmaOrigen, AV9Mbod_BodOrigenCodigo});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A31Bode_Codigo = P001Z3_A31Bode_Codigo[0] ;
         A28Alma_Codigo = P001Z3_A28Alma_Codigo[0] ;
         A27Alma_Modulo = P001Z3_A27Alma_Modulo[0] ;
         A1Cent_Id = P001Z3_A1Cent_Id[0] ;
         A695BBode_Descripcion = P001Z3_A695BBode_Descripcion[0] ;
         AV14Bode_Descripcion = A695BBode_Descripcion ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void S121( )
   {
      /* 'TODOS BODEGA' Routine */
      /* Using cursor P001Z4 */
      pr_default.execute(2, new Object[] {new Long(AV10Tran_CentroCostoId), AV12Tran_ModuloOrigen, AV17Tran_CodAlmaOrigen});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A28Alma_Codigo = P001Z4_A28Alma_Codigo[0] ;
         A27Alma_Modulo = P001Z4_A27Alma_Modulo[0] ;
         A1Cent_Id = P001Z4_A1Cent_Id[0] ;
         A31Bode_Codigo = P001Z4_A31Bode_Codigo[0] ;
         A695BBode_Descripcion = P001Z4_A695BBode_Descripcion[0] ;
         if ( GXutil.strcmp(A31Bode_Codigo, "000") != 0 )
         {
            AV16SDTBodegaOrigenTrnItem = (com.orions2.SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem)new com.orions2.SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem(remoteHandle, context);
            AV16SDTBodegaOrigenTrnItem.setgxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_codigo( A31Bode_Codigo );
            AV16SDTBodegaOrigenTrnItem.setgxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_descripcion( A695BBode_Descripcion );
            AV15SDTBodegaOrigenTrn.add(AV16SDTBodegaOrigenTrnItem, 0);
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S131( )
   {
      /* 'RESTRICCIONES' Routine */
      AV23GXLvl53 = (byte)(0) ;
      /* Using cursor P001Z5 */
      pr_default.execute(3, new Object[] {AV11Tran_CodigoMovimiento, new Long(AV13Tran_RegionId), new Long(AV10Tran_CentroCostoId), AV12Tran_ModuloOrigen});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A342Mbod_AlmOrigenCodigo = P001Z5_A342Mbod_AlmOrigenCodigo[0] ;
         A364Mbod_AlmModOrigen = P001Z5_A364Mbod_AlmModOrigen[0] ;
         A61Mbod_TipoMovCodigo = P001Z5_A61Mbod_TipoMovCodigo[0] ;
         A63Mbod_CentCostoId = P001Z5_A63Mbod_CentCostoId[0] ;
         A62Mbod_RegionId = P001Z5_A62Mbod_RegionId[0] ;
         A434Mbod_Estado = P001Z5_A434Mbod_Estado[0] ;
         A64Mbod_BodOrigenCodigo = P001Z5_A64Mbod_BodOrigenCodigo[0] ;
         A60Mbod_Id = P001Z5_A60Mbod_Id[0] ;
         AV23GXLvl53 = (byte)(1) ;
         if ( GXutil.strcmp(A64Mbod_BodOrigenCodigo, "000") != 0 )
         {
            AV16SDTBodegaOrigenTrnItem = (com.orions2.SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem)new com.orions2.SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem(remoteHandle, context);
            AV16SDTBodegaOrigenTrnItem.setgxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_codigo( A64Mbod_BodOrigenCodigo );
            AV9Mbod_BodOrigenCodigo = A64Mbod_BodOrigenCodigo ;
            /* Execute user subroutine: 'BODEGA' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(3);
               returnInSub = true;
               if (true) return;
            }
            AV16SDTBodegaOrigenTrnItem.setgxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_descripcion( AV14Bode_Descripcion );
            AV15SDTBodegaOrigenTrn.add(AV16SDTBodegaOrigenTrnItem, 0);
         }
         else
         {
            /* Execute user subroutine: 'TODOS BODEGA' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(3);
               returnInSub = true;
               if (true) return;
            }
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      if ( AV23GXLvl53 == 0 )
      {
         /* Using cursor P001Z6 */
         pr_default.execute(4, new Object[] {new Long(AV13Tran_RegionId), AV11Tran_CodigoMovimiento, AV12Tran_ModuloOrigen, AV17Tran_CodAlmaOrigen, AV11Tran_CodigoMovimiento, AV12Tran_ModuloOrigen, AV17Tran_CodAlmaOrigen, new Long(AV13Tran_RegionId), AV11Tran_CodigoMovimiento, AV12Tran_ModuloOrigen, AV11Tran_CodigoMovimiento, AV12Tran_ModuloOrigen});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A63Mbod_CentCostoId = P001Z6_A63Mbod_CentCostoId[0] ;
            A426Mbod_RegionCodigo = P001Z6_A426Mbod_RegionCodigo[0] ;
            n426Mbod_RegionCodigo = P001Z6_n426Mbod_RegionCodigo[0] ;
            A342Mbod_AlmOrigenCodigo = P001Z6_A342Mbod_AlmOrigenCodigo[0] ;
            A364Mbod_AlmModOrigen = P001Z6_A364Mbod_AlmModOrigen[0] ;
            A61Mbod_TipoMovCodigo = P001Z6_A61Mbod_TipoMovCodigo[0] ;
            A429Mbod_CentCostoCodigo = P001Z6_A429Mbod_CentCostoCodigo[0] ;
            n429Mbod_CentCostoCodigo = P001Z6_n429Mbod_CentCostoCodigo[0] ;
            A62Mbod_RegionId = P001Z6_A62Mbod_RegionId[0] ;
            A434Mbod_Estado = P001Z6_A434Mbod_Estado[0] ;
            A64Mbod_BodOrigenCodigo = P001Z6_A64Mbod_BodOrigenCodigo[0] ;
            A60Mbod_Id = P001Z6_A60Mbod_Id[0] ;
            A429Mbod_CentCostoCodigo = P001Z6_A429Mbod_CentCostoCodigo[0] ;
            n429Mbod_CentCostoCodigo = P001Z6_n429Mbod_CentCostoCodigo[0] ;
            A426Mbod_RegionCodigo = P001Z6_A426Mbod_RegionCodigo[0] ;
            n426Mbod_RegionCodigo = P001Z6_n426Mbod_RegionCodigo[0] ;
            if ( GXutil.strcmp(A64Mbod_BodOrigenCodigo, "000") != 0 )
            {
               AV16SDTBodegaOrigenTrnItem = (com.orions2.SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem)new com.orions2.SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem(remoteHandle, context);
               AV16SDTBodegaOrigenTrnItem.setgxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_codigo( A64Mbod_BodOrigenCodigo );
               AV9Mbod_BodOrigenCodigo = A64Mbod_BodOrigenCodigo ;
               /* Execute user subroutine: 'BODEGA' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(4);
                  pr_default.close(4);
                  pr_default.close(4);
                  returnInSub = true;
                  if (true) return;
               }
               AV16SDTBodegaOrigenTrnItem.setgxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_descripcion( AV14Bode_Descripcion );
               AV15SDTBodegaOrigenTrn.add(AV16SDTBodegaOrigenTrnItem, 0);
            }
            else
            {
               /* Execute user subroutine: 'TODOS BODEGA' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(4);
                  pr_default.close(4);
                  pr_default.close(4);
                  returnInSub = true;
                  if (true) return;
               }
            }
            pr_default.readNext(4);
         }
         pr_default.close(4);
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbode_origen.this.AV13Tran_RegionId;
      this.aP1[0] = pbode_origen.this.AV10Tran_CentroCostoId;
      this.aP2[0] = pbode_origen.this.AV11Tran_CodigoMovimiento;
      this.aP3[0] = pbode_origen.this.AV12Tran_ModuloOrigen;
      this.aP4[0] = pbode_origen.this.AV17Tran_CodAlmaOrigen;
      this.aP5[0] = pbode_origen.this.AV15SDTBodegaOrigenTrn;
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
      P001Z2_A434Mbod_Estado = new String[] {""} ;
      P001Z2_A342Mbod_AlmOrigenCodigo = new String[] {""} ;
      P001Z2_A364Mbod_AlmModOrigen = new String[] {""} ;
      P001Z2_A61Mbod_TipoMovCodigo = new String[] {""} ;
      P001Z2_A63Mbod_CentCostoId = new long[1] ;
      P001Z2_A62Mbod_RegionId = new long[1] ;
      P001Z2_A64Mbod_BodOrigenCodigo = new String[] {""} ;
      P001Z2_A60Mbod_Id = new long[1] ;
      A434Mbod_Estado = "" ;
      A342Mbod_AlmOrigenCodigo = "" ;
      A364Mbod_AlmModOrigen = "" ;
      A61Mbod_TipoMovCodigo = "" ;
      A64Mbod_BodOrigenCodigo = "" ;
      AV16SDTBodegaOrigenTrnItem = new com.orions2.SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem(remoteHandle, context);
      AV9Mbod_BodOrigenCodigo = "" ;
      AV14Bode_Descripcion = "" ;
      P001Z3_A31Bode_Codigo = new String[] {""} ;
      P001Z3_A28Alma_Codigo = new String[] {""} ;
      P001Z3_A27Alma_Modulo = new String[] {""} ;
      P001Z3_A1Cent_Id = new long[1] ;
      P001Z3_A695BBode_Descripcion = new String[] {""} ;
      A31Bode_Codigo = "" ;
      A28Alma_Codigo = "" ;
      A27Alma_Modulo = "" ;
      A695BBode_Descripcion = "" ;
      P001Z4_A28Alma_Codigo = new String[] {""} ;
      P001Z4_A27Alma_Modulo = new String[] {""} ;
      P001Z4_A1Cent_Id = new long[1] ;
      P001Z4_A31Bode_Codigo = new String[] {""} ;
      P001Z4_A695BBode_Descripcion = new String[] {""} ;
      P001Z5_A342Mbod_AlmOrigenCodigo = new String[] {""} ;
      P001Z5_A364Mbod_AlmModOrigen = new String[] {""} ;
      P001Z5_A61Mbod_TipoMovCodigo = new String[] {""} ;
      P001Z5_A63Mbod_CentCostoId = new long[1] ;
      P001Z5_A62Mbod_RegionId = new long[1] ;
      P001Z5_A434Mbod_Estado = new String[] {""} ;
      P001Z5_A64Mbod_BodOrigenCodigo = new String[] {""} ;
      P001Z5_A60Mbod_Id = new long[1] ;
      P001Z6_A63Mbod_CentCostoId = new long[1] ;
      P001Z6_A426Mbod_RegionCodigo = new short[1] ;
      P001Z6_n426Mbod_RegionCodigo = new boolean[] {false} ;
      P001Z6_A342Mbod_AlmOrigenCodigo = new String[] {""} ;
      P001Z6_A364Mbod_AlmModOrigen = new String[] {""} ;
      P001Z6_A61Mbod_TipoMovCodigo = new String[] {""} ;
      P001Z6_A429Mbod_CentCostoCodigo = new String[] {""} ;
      P001Z6_n429Mbod_CentCostoCodigo = new boolean[] {false} ;
      P001Z6_A62Mbod_RegionId = new long[1] ;
      P001Z6_A434Mbod_Estado = new String[] {""} ;
      P001Z6_A64Mbod_BodOrigenCodigo = new String[] {""} ;
      P001Z6_A60Mbod_Id = new long[1] ;
      A429Mbod_CentCostoCodigo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.pbode_origen__default(),
         new Object[] {
             new Object[] {
            P001Z2_A434Mbod_Estado, P001Z2_A342Mbod_AlmOrigenCodigo, P001Z2_A364Mbod_AlmModOrigen, P001Z2_A61Mbod_TipoMovCodigo, P001Z2_A63Mbod_CentCostoId, P001Z2_A62Mbod_RegionId, P001Z2_A64Mbod_BodOrigenCodigo, P001Z2_A60Mbod_Id
            }
            , new Object[] {
            P001Z3_A31Bode_Codigo, P001Z3_A28Alma_Codigo, P001Z3_A27Alma_Modulo, P001Z3_A1Cent_Id, P001Z3_A695BBode_Descripcion
            }
            , new Object[] {
            P001Z4_A28Alma_Codigo, P001Z4_A27Alma_Modulo, P001Z4_A1Cent_Id, P001Z4_A31Bode_Codigo, P001Z4_A695BBode_Descripcion
            }
            , new Object[] {
            P001Z5_A342Mbod_AlmOrigenCodigo, P001Z5_A364Mbod_AlmModOrigen, P001Z5_A61Mbod_TipoMovCodigo, P001Z5_A63Mbod_CentCostoId, P001Z5_A62Mbod_RegionId, P001Z5_A434Mbod_Estado, P001Z5_A64Mbod_BodOrigenCodigo, P001Z5_A60Mbod_Id
            }
            , new Object[] {
            P001Z6_A63Mbod_CentCostoId, P001Z6_A426Mbod_RegionCodigo, P001Z6_n426Mbod_RegionCodigo, P001Z6_A342Mbod_AlmOrigenCodigo, P001Z6_A364Mbod_AlmModOrigen, P001Z6_A61Mbod_TipoMovCodigo, P001Z6_A429Mbod_CentCostoCodigo, P001Z6_n429Mbod_CentCostoCodigo, P001Z6_A62Mbod_RegionId, P001Z6_A434Mbod_Estado,
            P001Z6_A64Mbod_BodOrigenCodigo, P001Z6_A60Mbod_Id
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20GXLvl2 ;
   private byte AV23GXLvl53 ;
   private short A426Mbod_RegionCodigo ;
   private short Gx_err ;
   private long AV13Tran_RegionId ;
   private long AV10Tran_CentroCostoId ;
   private long A63Mbod_CentCostoId ;
   private long A62Mbod_RegionId ;
   private long A60Mbod_Id ;
   private long A1Cent_Id ;
   private String scmdbuf ;
   private String A434Mbod_Estado ;
   private boolean returnInSub ;
   private boolean n426Mbod_RegionCodigo ;
   private boolean n429Mbod_CentCostoCodigo ;
   private String AV11Tran_CodigoMovimiento ;
   private String AV12Tran_ModuloOrigen ;
   private String AV17Tran_CodAlmaOrigen ;
   private String A342Mbod_AlmOrigenCodigo ;
   private String A364Mbod_AlmModOrigen ;
   private String A61Mbod_TipoMovCodigo ;
   private String A64Mbod_BodOrigenCodigo ;
   private String AV9Mbod_BodOrigenCodigo ;
   private String AV14Bode_Descripcion ;
   private String A31Bode_Codigo ;
   private String A28Alma_Codigo ;
   private String A27Alma_Modulo ;
   private String A695BBode_Descripcion ;
   private String A429Mbod_CentCostoCodigo ;
   private long[] aP0 ;
   private long[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private GXBaseCollection<com.orions2.SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem>[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P001Z2_A434Mbod_Estado ;
   private String[] P001Z2_A342Mbod_AlmOrigenCodigo ;
   private String[] P001Z2_A364Mbod_AlmModOrigen ;
   private String[] P001Z2_A61Mbod_TipoMovCodigo ;
   private long[] P001Z2_A63Mbod_CentCostoId ;
   private long[] P001Z2_A62Mbod_RegionId ;
   private String[] P001Z2_A64Mbod_BodOrigenCodigo ;
   private long[] P001Z2_A60Mbod_Id ;
   private String[] P001Z3_A31Bode_Codigo ;
   private String[] P001Z3_A28Alma_Codigo ;
   private String[] P001Z3_A27Alma_Modulo ;
   private long[] P001Z3_A1Cent_Id ;
   private String[] P001Z3_A695BBode_Descripcion ;
   private String[] P001Z4_A28Alma_Codigo ;
   private String[] P001Z4_A27Alma_Modulo ;
   private long[] P001Z4_A1Cent_Id ;
   private String[] P001Z4_A31Bode_Codigo ;
   private String[] P001Z4_A695BBode_Descripcion ;
   private String[] P001Z5_A342Mbod_AlmOrigenCodigo ;
   private String[] P001Z5_A364Mbod_AlmModOrigen ;
   private String[] P001Z5_A61Mbod_TipoMovCodigo ;
   private long[] P001Z5_A63Mbod_CentCostoId ;
   private long[] P001Z5_A62Mbod_RegionId ;
   private String[] P001Z5_A434Mbod_Estado ;
   private String[] P001Z5_A64Mbod_BodOrigenCodigo ;
   private long[] P001Z5_A60Mbod_Id ;
   private long[] P001Z6_A63Mbod_CentCostoId ;
   private short[] P001Z6_A426Mbod_RegionCodigo ;
   private boolean[] P001Z6_n426Mbod_RegionCodigo ;
   private String[] P001Z6_A342Mbod_AlmOrigenCodigo ;
   private String[] P001Z6_A364Mbod_AlmModOrigen ;
   private String[] P001Z6_A61Mbod_TipoMovCodigo ;
   private String[] P001Z6_A429Mbod_CentCostoCodigo ;
   private boolean[] P001Z6_n429Mbod_CentCostoCodigo ;
   private long[] P001Z6_A62Mbod_RegionId ;
   private String[] P001Z6_A434Mbod_Estado ;
   private String[] P001Z6_A64Mbod_BodOrigenCodigo ;
   private long[] P001Z6_A60Mbod_Id ;
   private GXBaseCollection<com.orions2.SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem> AV15SDTBodegaOrigenTrn ;
   private com.orions2.SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem AV16SDTBodegaOrigenTrnItem ;
}

final  class pbode_origen__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001Z2", "SELECT Mbod_Estado, Mbod_AlmOrigenCodigo, Mbod_AlmModOrigen, Mbod_TipoMovCodigo, Mbod_CentCostoId, Mbod_RegionId, Mbod_BodOrigenCodigo, Mbod_Id FROM ALM_RESTRICCIONES WHERE (Mbod_TipoMovCodigo = ?) AND (Mbod_RegionId = ?) AND (Mbod_CentCostoId = ?) AND (Mbod_AlmModOrigen = ?) AND (Mbod_AlmOrigenCodigo = ?) AND (Mbod_Estado = 'A') ORDER BY Mbod_TipoMovCodigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001Z3", "SELECT Bode_Codigo, Alma_Codigo, Alma_Modulo, Cent_Id, BBode_Descripcion FROM ALM_ALMACEN_BODEGAS WHERE Cent_Id = ? and Alma_Modulo = ? and Alma_Codigo = ? and Bode_Codigo = ? ORDER BY Cent_Id, Alma_Modulo, Alma_Codigo, Bode_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P001Z4", "SELECT Alma_Codigo, Alma_Modulo, Cent_Id, Bode_Codigo, BBode_Descripcion FROM ALM_ALMACEN_BODEGAS WHERE Cent_Id = ? and Alma_Modulo = ? and Alma_Codigo = ? ORDER BY Cent_Id, Alma_Modulo, Alma_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001Z5", "SELECT Mbod_AlmOrigenCodigo, Mbod_AlmModOrigen, Mbod_TipoMovCodigo, Mbod_CentCostoId, Mbod_RegionId, Mbod_Estado, Mbod_BodOrigenCodigo, Mbod_Id FROM ALM_RESTRICCIONES WHERE (Mbod_TipoMovCodigo = ?) AND (Mbod_Estado = 'A') AND (Mbod_RegionId = ?) AND (Mbod_CentCostoId = ?) AND (Mbod_AlmModOrigen = ?) AND (Mbod_AlmOrigenCodigo = '00') ORDER BY Mbod_TipoMovCodigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001Z6", "SELECT T1.Mbod_CentCostoId AS Mbod_CentCostoId, T3.Regi_Cod AS Mbod_RegionCodigo, T1.Mbod_AlmOrigenCodigo, T1.Mbod_AlmModOrigen, T1.Mbod_TipoMovCodigo, T2.Cent_Codigo AS Mbod_CentCostoCodigo, T1.Mbod_RegionId AS Mbod_RegionId, T1.Mbod_Estado, T1.Mbod_BodOrigenCodigo, T1.Mbod_Id FROM ((ALM_RESTRICCIONES T1 INNER JOIN GEN_CENTROCOSTO T2 ON T2.Cent_Id = T1.Mbod_CentCostoId) INNER JOIN GEN_REGIONAL T3 ON T3.Regi_Id = T1.Mbod_RegionId) WHERE (( T1.Mbod_RegionId = ? and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = ?) or ( T3.Regi_Cod = 0 and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = ?) or ( T1.Mbod_RegionId = ? and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = '00') or ( T3.Regi_Cod = 0 and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = '00')) AND (T1.Mbod_Estado = 'A') ORDER BY T1.Mbod_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((long[]) buf[5])[0] = rslt.getLong(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((long[]) buf[7])[0] = rslt.getLong(8) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((String[]) buf[5])[0] = rslt.getString(6, 1) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((long[]) buf[7])[0] = rslt.getLong(8) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(7) ;
               ((String[]) buf[9])[0] = rslt.getString(8, 1) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((long[]) buf[11])[0] = rslt.getLong(10) ;
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
               stmt.setVarchar(5, (String)parms[4], 2);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 8);
               stmt.setVarchar(3, (String)parms[2], 2);
               stmt.setVarchar(4, (String)parms[3], 3);
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 8);
               stmt.setVarchar(3, (String)parms[2], 2);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setVarchar(4, (String)parms[3], 8);
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 3);
               stmt.setVarchar(3, (String)parms[2], 8);
               stmt.setVarchar(4, (String)parms[3], 2);
               stmt.setVarchar(5, (String)parms[4], 3);
               stmt.setVarchar(6, (String)parms[5], 8);
               stmt.setVarchar(7, (String)parms[6], 2);
               stmt.setLong(8, ((Number) parms[7]).longValue());
               stmt.setVarchar(9, (String)parms[8], 3);
               stmt.setVarchar(10, (String)parms[9], 8);
               stmt.setVarchar(11, (String)parms[10], 3);
               stmt.setVarchar(12, (String)parms[11], 8);
               return;
      }
   }

}

