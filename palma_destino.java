/*
               File: PAlma_Destino
        Description: PAlma_Destino
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:10.9
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palma_destino extends GXProcedure
{
   public palma_destino( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palma_destino.class ), "" );
   }

   public palma_destino( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GXBaseCollection<com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem> executeUdp( long[] aP0 ,
                                                                                         long[] aP1 ,
                                                                                         String[] aP2 ,
                                                                                         String[] aP3 ,
                                                                                         String[] aP4 ,
                                                                                         String[] aP5 ,
                                                                                         String[] aP6 )
   {
      palma_destino.this.AV15Tran_RegionId = aP0[0];
      this.aP0 = aP0;
      palma_destino.this.AV10Tran_CentroCostoId = aP1[0];
      this.aP1 = aP1;
      palma_destino.this.AV12Tran_CodigoMovimiento = aP2[0];
      this.aP2 = aP2;
      palma_destino.this.AV14Tran_ModuloOrigen = aP3[0];
      this.aP3 = aP3;
      palma_destino.this.AV18Tran_CodAlmaOrigen = aP4[0];
      this.aP4 = aP4;
      palma_destino.this.AV11Tran_CodBodeOrigen = aP5[0];
      this.aP5 = aP5;
      palma_destino.this.AV13Tran_ModuloDestino = aP6[0];
      this.aP6 = aP6;
      palma_destino.this.AV16SDTAlma_Origen = aP7[0];
      this.aP7 = aP7;
      palma_destino.this.aP7 = new GXBaseCollection[] {new GXBaseCollection<com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem>()};
      initialize();
      privateExecute();
      return aP7[0];
   }

   public void execute( long[] aP0 ,
                        long[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        GXBaseCollection<com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem>[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( long[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             GXBaseCollection<com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem>[] aP7 )
   {
      palma_destino.this.AV15Tran_RegionId = aP0[0];
      this.aP0 = aP0;
      palma_destino.this.AV10Tran_CentroCostoId = aP1[0];
      this.aP1 = aP1;
      palma_destino.this.AV12Tran_CodigoMovimiento = aP2[0];
      this.aP2 = aP2;
      palma_destino.this.AV14Tran_ModuloOrigen = aP3[0];
      this.aP3 = aP3;
      palma_destino.this.AV18Tran_CodAlmaOrigen = aP4[0];
      this.aP4 = aP4;
      palma_destino.this.AV11Tran_CodBodeOrigen = aP5[0];
      this.aP5 = aP5;
      palma_destino.this.AV13Tran_ModuloDestino = aP6[0];
      this.aP6 = aP6;
      palma_destino.this.AV16SDTAlma_Origen = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21GXLvl2 = (byte)(0) ;
      /* Using cursor P00212 */
      pr_default.execute(0, new Object[] {AV11Tran_CodBodeOrigen, new Long(AV15Tran_RegionId), new Long(AV10Tran_CentroCostoId), AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV18Tran_CodAlmaOrigen, AV13Tran_ModuloDestino});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A434Mbod_Estado = P00212_A434Mbod_Estado[0] ;
         A368Mbod_AlmModDestino = P00212_A368Mbod_AlmModDestino[0] ;
         A64Mbod_BodOrigenCodigo = P00212_A64Mbod_BodOrigenCodigo[0] ;
         A342Mbod_AlmOrigenCodigo = P00212_A342Mbod_AlmOrigenCodigo[0] ;
         A364Mbod_AlmModOrigen = P00212_A364Mbod_AlmModOrigen[0] ;
         A61Mbod_TipoMovCodigo = P00212_A61Mbod_TipoMovCodigo[0] ;
         A63Mbod_CentCostoId = P00212_A63Mbod_CentCostoId[0] ;
         A62Mbod_RegionId = P00212_A62Mbod_RegionId[0] ;
         A345Mbod_AlmDestinoCodigo = P00212_A345Mbod_AlmDestinoCodigo[0] ;
         A60Mbod_Id = P00212_A60Mbod_Id[0] ;
         AV21GXLvl2 = (byte)(1) ;
         if ( GXutil.strcmp(A345Mbod_AlmDestinoCodigo, "00") != 0 )
         {
            AV17SDTAlma_OrigenItem = (com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem)new com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem(remoteHandle, context);
            AV17SDTAlma_OrigenItem.setgxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_codigo( A345Mbod_AlmDestinoCodigo );
            AV9Mbod_AlmDestinoCodigo = A345Mbod_AlmDestinoCodigo ;
            /* Execute user subroutine: 'ALMACEN' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV17SDTAlma_OrigenItem.setgxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_descripcion( AV8Alma_Descripcion );
            AV16SDTAlma_Origen.add(AV17SDTAlma_OrigenItem, 0);
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
      if ( AV21GXLvl2 == 0 )
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
      AV8Alma_Descripcion = "" ;
      /* Using cursor P00213 */
      pr_default.execute(1, new Object[] {new Long(AV10Tran_CentroCostoId), AV13Tran_ModuloDestino, AV9Mbod_AlmDestinoCodigo});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A28Alma_Codigo = P00213_A28Alma_Codigo[0] ;
         A27Alma_Modulo = P00213_A27Alma_Modulo[0] ;
         A1Cent_Id = P00213_A1Cent_Id[0] ;
         A252Alma_Descripcion = P00213_A252Alma_Descripcion[0] ;
         AV8Alma_Descripcion = A252Alma_Descripcion ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void S121( )
   {
      /* 'TODOS ALMACEN' Routine */
      /* Using cursor P00214 */
      pr_default.execute(2, new Object[] {new Long(AV10Tran_CentroCostoId), AV13Tran_ModuloDestino});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A27Alma_Modulo = P00214_A27Alma_Modulo[0] ;
         A1Cent_Id = P00214_A1Cent_Id[0] ;
         A28Alma_Codigo = P00214_A28Alma_Codigo[0] ;
         A252Alma_Descripcion = P00214_A252Alma_Descripcion[0] ;
         if ( GXutil.strcmp(A28Alma_Codigo, "00") != 0 )
         {
            AV17SDTAlma_OrigenItem = (com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem)new com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem(remoteHandle, context);
            AV17SDTAlma_OrigenItem.setgxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_codigo( A28Alma_Codigo );
            AV17SDTAlma_OrigenItem.setgxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_descripcion( A252Alma_Descripcion );
            AV16SDTAlma_Origen.add(AV17SDTAlma_OrigenItem, 0);
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S131( )
   {
      /* 'RESTRICCIONES' Routine */
      AV24GXLvl53 = (byte)(0) ;
      /* Using cursor P00215 */
      pr_default.execute(3, new Object[] {new Long(AV15Tran_RegionId), new Long(AV10Tran_CentroCostoId), AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV11Tran_CodBodeOrigen, AV13Tran_ModuloDestino, new Long(AV15Tran_RegionId), new Long(AV10Tran_CentroCostoId), AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV13Tran_ModuloDestino, new Long(AV15Tran_RegionId), new Long(AV10Tran_CentroCostoId), AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV18Tran_CodAlmaOrigen, AV13Tran_ModuloDestino});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A368Mbod_AlmModDestino = P00215_A368Mbod_AlmModDestino[0] ;
         A64Mbod_BodOrigenCodigo = P00215_A64Mbod_BodOrigenCodigo[0] ;
         A342Mbod_AlmOrigenCodigo = P00215_A342Mbod_AlmOrigenCodigo[0] ;
         A364Mbod_AlmModOrigen = P00215_A364Mbod_AlmModOrigen[0] ;
         A61Mbod_TipoMovCodigo = P00215_A61Mbod_TipoMovCodigo[0] ;
         A63Mbod_CentCostoId = P00215_A63Mbod_CentCostoId[0] ;
         A62Mbod_RegionId = P00215_A62Mbod_RegionId[0] ;
         A434Mbod_Estado = P00215_A434Mbod_Estado[0] ;
         A345Mbod_AlmDestinoCodigo = P00215_A345Mbod_AlmDestinoCodigo[0] ;
         A60Mbod_Id = P00215_A60Mbod_Id[0] ;
         AV24GXLvl53 = (byte)(1) ;
         if ( GXutil.strcmp(A345Mbod_AlmDestinoCodigo, "00") != 0 )
         {
            AV17SDTAlma_OrigenItem = (com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem)new com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem(remoteHandle, context);
            AV17SDTAlma_OrigenItem.setgxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_codigo( A345Mbod_AlmDestinoCodigo );
            AV9Mbod_AlmDestinoCodigo = A345Mbod_AlmDestinoCodigo ;
            /* Execute user subroutine: 'ALMACEN' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(3);
               returnInSub = true;
               if (true) return;
            }
            AV17SDTAlma_OrigenItem.setgxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_descripcion( AV8Alma_Descripcion );
            AV16SDTAlma_Origen.add(AV17SDTAlma_OrigenItem, 0);
         }
         else
         {
            /* Execute user subroutine: 'TODOS ALMACEN' */
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
      if ( AV24GXLvl53 == 0 )
      {
         /* Using cursor P00216 */
         pr_default.execute(4, new Object[] {new Long(AV15Tran_RegionId), AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV18Tran_CodAlmaOrigen, AV11Tran_CodBodeOrigen, AV13Tran_ModuloDestino, AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV18Tran_CodAlmaOrigen, AV11Tran_CodBodeOrigen, AV13Tran_ModuloDestino, new Long(AV15Tran_RegionId), AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV11Tran_CodBodeOrigen, AV13Tran_ModuloDestino, AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV11Tran_CodBodeOrigen, AV13Tran_ModuloDestino, new Long(AV15Tran_RegionId), AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV18Tran_CodAlmaOrigen, AV13Tran_ModuloDestino, AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV18Tran_CodAlmaOrigen, AV13Tran_ModuloDestino, new Long(AV15Tran_RegionId), AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV13Tran_ModuloDestino, AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV13Tran_ModuloDestino});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A63Mbod_CentCostoId = P00216_A63Mbod_CentCostoId[0] ;
            A426Mbod_RegionCodigo = P00216_A426Mbod_RegionCodigo[0] ;
            n426Mbod_RegionCodigo = P00216_n426Mbod_RegionCodigo[0] ;
            A368Mbod_AlmModDestino = P00216_A368Mbod_AlmModDestino[0] ;
            A64Mbod_BodOrigenCodigo = P00216_A64Mbod_BodOrigenCodigo[0] ;
            A342Mbod_AlmOrigenCodigo = P00216_A342Mbod_AlmOrigenCodigo[0] ;
            A364Mbod_AlmModOrigen = P00216_A364Mbod_AlmModOrigen[0] ;
            A61Mbod_TipoMovCodigo = P00216_A61Mbod_TipoMovCodigo[0] ;
            A429Mbod_CentCostoCodigo = P00216_A429Mbod_CentCostoCodigo[0] ;
            n429Mbod_CentCostoCodigo = P00216_n429Mbod_CentCostoCodigo[0] ;
            A62Mbod_RegionId = P00216_A62Mbod_RegionId[0] ;
            A434Mbod_Estado = P00216_A434Mbod_Estado[0] ;
            A345Mbod_AlmDestinoCodigo = P00216_A345Mbod_AlmDestinoCodigo[0] ;
            A60Mbod_Id = P00216_A60Mbod_Id[0] ;
            A429Mbod_CentCostoCodigo = P00216_A429Mbod_CentCostoCodigo[0] ;
            n429Mbod_CentCostoCodigo = P00216_n429Mbod_CentCostoCodigo[0] ;
            A426Mbod_RegionCodigo = P00216_A426Mbod_RegionCodigo[0] ;
            n426Mbod_RegionCodigo = P00216_n426Mbod_RegionCodigo[0] ;
            if ( GXutil.strcmp(A345Mbod_AlmDestinoCodigo, "00") != 0 )
            {
               AV17SDTAlma_OrigenItem = (com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem)new com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem(remoteHandle, context);
               AV17SDTAlma_OrigenItem.setgxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_codigo( A345Mbod_AlmDestinoCodigo );
               AV9Mbod_AlmDestinoCodigo = A345Mbod_AlmDestinoCodigo ;
               /* Execute user subroutine: 'ALMACEN' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(4);
                  pr_default.close(4);
                  pr_default.close(4);
                  returnInSub = true;
                  if (true) return;
               }
               AV17SDTAlma_OrigenItem.setgxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_descripcion( AV8Alma_Descripcion );
               AV16SDTAlma_Origen.add(AV17SDTAlma_OrigenItem, 0);
            }
            else
            {
               /* Execute user subroutine: 'TODOS ALMACEN' */
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
      this.aP0[0] = palma_destino.this.AV15Tran_RegionId;
      this.aP1[0] = palma_destino.this.AV10Tran_CentroCostoId;
      this.aP2[0] = palma_destino.this.AV12Tran_CodigoMovimiento;
      this.aP3[0] = palma_destino.this.AV14Tran_ModuloOrigen;
      this.aP4[0] = palma_destino.this.AV18Tran_CodAlmaOrigen;
      this.aP5[0] = palma_destino.this.AV11Tran_CodBodeOrigen;
      this.aP6[0] = palma_destino.this.AV13Tran_ModuloDestino;
      this.aP7[0] = palma_destino.this.AV16SDTAlma_Origen;
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
      P00212_A434Mbod_Estado = new String[] {""} ;
      P00212_A368Mbod_AlmModDestino = new String[] {""} ;
      P00212_A64Mbod_BodOrigenCodigo = new String[] {""} ;
      P00212_A342Mbod_AlmOrigenCodigo = new String[] {""} ;
      P00212_A364Mbod_AlmModOrigen = new String[] {""} ;
      P00212_A61Mbod_TipoMovCodigo = new String[] {""} ;
      P00212_A63Mbod_CentCostoId = new long[1] ;
      P00212_A62Mbod_RegionId = new long[1] ;
      P00212_A345Mbod_AlmDestinoCodigo = new String[] {""} ;
      P00212_A60Mbod_Id = new long[1] ;
      A434Mbod_Estado = "" ;
      A368Mbod_AlmModDestino = "" ;
      A64Mbod_BodOrigenCodigo = "" ;
      A342Mbod_AlmOrigenCodigo = "" ;
      A364Mbod_AlmModOrigen = "" ;
      A61Mbod_TipoMovCodigo = "" ;
      A345Mbod_AlmDestinoCodigo = "" ;
      AV17SDTAlma_OrigenItem = new com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem(remoteHandle, context);
      AV9Mbod_AlmDestinoCodigo = "" ;
      AV8Alma_Descripcion = "" ;
      P00213_A28Alma_Codigo = new String[] {""} ;
      P00213_A27Alma_Modulo = new String[] {""} ;
      P00213_A1Cent_Id = new long[1] ;
      P00213_A252Alma_Descripcion = new String[] {""} ;
      A28Alma_Codigo = "" ;
      A27Alma_Modulo = "" ;
      A252Alma_Descripcion = "" ;
      P00214_A27Alma_Modulo = new String[] {""} ;
      P00214_A1Cent_Id = new long[1] ;
      P00214_A28Alma_Codigo = new String[] {""} ;
      P00214_A252Alma_Descripcion = new String[] {""} ;
      P00215_A368Mbod_AlmModDestino = new String[] {""} ;
      P00215_A64Mbod_BodOrigenCodigo = new String[] {""} ;
      P00215_A342Mbod_AlmOrigenCodigo = new String[] {""} ;
      P00215_A364Mbod_AlmModOrigen = new String[] {""} ;
      P00215_A61Mbod_TipoMovCodigo = new String[] {""} ;
      P00215_A63Mbod_CentCostoId = new long[1] ;
      P00215_A62Mbod_RegionId = new long[1] ;
      P00215_A434Mbod_Estado = new String[] {""} ;
      P00215_A345Mbod_AlmDestinoCodigo = new String[] {""} ;
      P00215_A60Mbod_Id = new long[1] ;
      P00216_A63Mbod_CentCostoId = new long[1] ;
      P00216_A426Mbod_RegionCodigo = new short[1] ;
      P00216_n426Mbod_RegionCodigo = new boolean[] {false} ;
      P00216_A368Mbod_AlmModDestino = new String[] {""} ;
      P00216_A64Mbod_BodOrigenCodigo = new String[] {""} ;
      P00216_A342Mbod_AlmOrigenCodigo = new String[] {""} ;
      P00216_A364Mbod_AlmModOrigen = new String[] {""} ;
      P00216_A61Mbod_TipoMovCodigo = new String[] {""} ;
      P00216_A429Mbod_CentCostoCodigo = new String[] {""} ;
      P00216_n429Mbod_CentCostoCodigo = new boolean[] {false} ;
      P00216_A62Mbod_RegionId = new long[1] ;
      P00216_A434Mbod_Estado = new String[] {""} ;
      P00216_A345Mbod_AlmDestinoCodigo = new String[] {""} ;
      P00216_A60Mbod_Id = new long[1] ;
      A429Mbod_CentCostoCodigo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.palma_destino__default(),
         new Object[] {
             new Object[] {
            P00212_A434Mbod_Estado, P00212_A368Mbod_AlmModDestino, P00212_A64Mbod_BodOrigenCodigo, P00212_A342Mbod_AlmOrigenCodigo, P00212_A364Mbod_AlmModOrigen, P00212_A61Mbod_TipoMovCodigo, P00212_A63Mbod_CentCostoId, P00212_A62Mbod_RegionId, P00212_A345Mbod_AlmDestinoCodigo, P00212_A60Mbod_Id
            }
            , new Object[] {
            P00213_A28Alma_Codigo, P00213_A27Alma_Modulo, P00213_A1Cent_Id, P00213_A252Alma_Descripcion
            }
            , new Object[] {
            P00214_A27Alma_Modulo, P00214_A1Cent_Id, P00214_A28Alma_Codigo, P00214_A252Alma_Descripcion
            }
            , new Object[] {
            P00215_A368Mbod_AlmModDestino, P00215_A64Mbod_BodOrigenCodigo, P00215_A342Mbod_AlmOrigenCodigo, P00215_A364Mbod_AlmModOrigen, P00215_A61Mbod_TipoMovCodigo, P00215_A63Mbod_CentCostoId, P00215_A62Mbod_RegionId, P00215_A434Mbod_Estado, P00215_A345Mbod_AlmDestinoCodigo, P00215_A60Mbod_Id
            }
            , new Object[] {
            P00216_A63Mbod_CentCostoId, P00216_A426Mbod_RegionCodigo, P00216_n426Mbod_RegionCodigo, P00216_A368Mbod_AlmModDestino, P00216_A64Mbod_BodOrigenCodigo, P00216_A342Mbod_AlmOrigenCodigo, P00216_A364Mbod_AlmModOrigen, P00216_A61Mbod_TipoMovCodigo, P00216_A429Mbod_CentCostoCodigo, P00216_n429Mbod_CentCostoCodigo,
            P00216_A62Mbod_RegionId, P00216_A434Mbod_Estado, P00216_A345Mbod_AlmDestinoCodigo, P00216_A60Mbod_Id
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV21GXLvl2 ;
   private byte AV24GXLvl53 ;
   private short A426Mbod_RegionCodigo ;
   private short Gx_err ;
   private long AV15Tran_RegionId ;
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
   private String AV12Tran_CodigoMovimiento ;
   private String AV14Tran_ModuloOrigen ;
   private String AV18Tran_CodAlmaOrigen ;
   private String AV11Tran_CodBodeOrigen ;
   private String AV13Tran_ModuloDestino ;
   private String A368Mbod_AlmModDestino ;
   private String A64Mbod_BodOrigenCodigo ;
   private String A342Mbod_AlmOrigenCodigo ;
   private String A364Mbod_AlmModOrigen ;
   private String A61Mbod_TipoMovCodigo ;
   private String A345Mbod_AlmDestinoCodigo ;
   private String AV9Mbod_AlmDestinoCodigo ;
   private String AV8Alma_Descripcion ;
   private String A28Alma_Codigo ;
   private String A27Alma_Modulo ;
   private String A252Alma_Descripcion ;
   private String A429Mbod_CentCostoCodigo ;
   private long[] aP0 ;
   private long[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private GXBaseCollection<com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem>[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P00212_A434Mbod_Estado ;
   private String[] P00212_A368Mbod_AlmModDestino ;
   private String[] P00212_A64Mbod_BodOrigenCodigo ;
   private String[] P00212_A342Mbod_AlmOrigenCodigo ;
   private String[] P00212_A364Mbod_AlmModOrigen ;
   private String[] P00212_A61Mbod_TipoMovCodigo ;
   private long[] P00212_A63Mbod_CentCostoId ;
   private long[] P00212_A62Mbod_RegionId ;
   private String[] P00212_A345Mbod_AlmDestinoCodigo ;
   private long[] P00212_A60Mbod_Id ;
   private String[] P00213_A28Alma_Codigo ;
   private String[] P00213_A27Alma_Modulo ;
   private long[] P00213_A1Cent_Id ;
   private String[] P00213_A252Alma_Descripcion ;
   private String[] P00214_A27Alma_Modulo ;
   private long[] P00214_A1Cent_Id ;
   private String[] P00214_A28Alma_Codigo ;
   private String[] P00214_A252Alma_Descripcion ;
   private String[] P00215_A368Mbod_AlmModDestino ;
   private String[] P00215_A64Mbod_BodOrigenCodigo ;
   private String[] P00215_A342Mbod_AlmOrigenCodigo ;
   private String[] P00215_A364Mbod_AlmModOrigen ;
   private String[] P00215_A61Mbod_TipoMovCodigo ;
   private long[] P00215_A63Mbod_CentCostoId ;
   private long[] P00215_A62Mbod_RegionId ;
   private String[] P00215_A434Mbod_Estado ;
   private String[] P00215_A345Mbod_AlmDestinoCodigo ;
   private long[] P00215_A60Mbod_Id ;
   private long[] P00216_A63Mbod_CentCostoId ;
   private short[] P00216_A426Mbod_RegionCodigo ;
   private boolean[] P00216_n426Mbod_RegionCodigo ;
   private String[] P00216_A368Mbod_AlmModDestino ;
   private String[] P00216_A64Mbod_BodOrigenCodigo ;
   private String[] P00216_A342Mbod_AlmOrigenCodigo ;
   private String[] P00216_A364Mbod_AlmModOrigen ;
   private String[] P00216_A61Mbod_TipoMovCodigo ;
   private String[] P00216_A429Mbod_CentCostoCodigo ;
   private boolean[] P00216_n429Mbod_CentCostoCodigo ;
   private long[] P00216_A62Mbod_RegionId ;
   private String[] P00216_A434Mbod_Estado ;
   private String[] P00216_A345Mbod_AlmDestinoCodigo ;
   private long[] P00216_A60Mbod_Id ;
   private GXBaseCollection<com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem> AV16SDTAlma_Origen ;
   private com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem AV17SDTAlma_OrigenItem ;
}

final  class palma_destino__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00212", "SELECT Mbod_Estado, Mbod_AlmModDestino, Mbod_BodOrigenCodigo, Mbod_AlmOrigenCodigo, Mbod_AlmModOrigen, Mbod_TipoMovCodigo, Mbod_CentCostoId, Mbod_RegionId, Mbod_AlmDestinoCodigo, Mbod_Id FROM ALM_RESTRICCIONES WHERE (Mbod_BodOrigenCodigo = ?) AND (Mbod_RegionId = ?) AND (Mbod_CentCostoId = ?) AND (Mbod_TipoMovCodigo = ?) AND (Mbod_AlmModOrigen = ?) AND (Mbod_AlmOrigenCodigo = ?) AND (Mbod_AlmModDestino = ?) AND (Mbod_Estado = 'A') ORDER BY Mbod_BodOrigenCodigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P00213", "SELECT Alma_Codigo, Alma_Modulo, Cent_Id, Alma_Descripcion FROM ALM_ALMACEN WHERE Cent_Id = ? and Alma_Modulo = ? and Alma_Codigo = ? ORDER BY Cent_Id, Alma_Modulo, Alma_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P00214", "SELECT Alma_Modulo, Cent_Id, Alma_Codigo, Alma_Descripcion FROM ALM_ALMACEN WHERE Cent_Id = ? and Alma_Modulo = ? ORDER BY Cent_Id, Alma_Modulo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P00215", "SELECT Mbod_AlmModDestino, Mbod_BodOrigenCodigo, Mbod_AlmOrigenCodigo, Mbod_AlmModOrigen, Mbod_TipoMovCodigo, Mbod_CentCostoId, Mbod_RegionId, Mbod_Estado, Mbod_AlmDestinoCodigo, Mbod_Id FROM ALM_RESTRICCIONES WHERE (( Mbod_RegionId = ? and Mbod_CentCostoId = ? and Mbod_TipoMovCodigo = ? and Mbod_AlmModOrigen = ? and Mbod_AlmOrigenCodigo = '00' and Mbod_BodOrigenCodigo = ? and Mbod_AlmModDestino = ?) or ( Mbod_RegionId = ? and Mbod_CentCostoId = ? and Mbod_TipoMovCodigo = ? and Mbod_AlmModOrigen = ? and Mbod_AlmOrigenCodigo = '00' and Mbod_BodOrigenCodigo = '000' and Mbod_AlmModDestino = ?) or ( Mbod_RegionId = ? and Mbod_CentCostoId = ? and Mbod_TipoMovCodigo = ? and Mbod_AlmModOrigen = ? and Mbod_AlmOrigenCodigo = ? and Mbod_BodOrigenCodigo = '000' and Mbod_AlmModDestino = ?)) AND (Mbod_Estado = 'A') ORDER BY Mbod_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P00216", "SELECT T1.Mbod_CentCostoId AS Mbod_CentCostoId, T3.Regi_Cod AS Mbod_RegionCodigo, T1.Mbod_AlmModDestino, T1.Mbod_BodOrigenCodigo, T1.Mbod_AlmOrigenCodigo, T1.Mbod_AlmModOrigen, T1.Mbod_TipoMovCodigo, T2.Cent_Codigo AS Mbod_CentCostoCodigo, T1.Mbod_RegionId AS Mbod_RegionId, T1.Mbod_Estado, T1.Mbod_AlmDestinoCodigo, T1.Mbod_Id FROM ((ALM_RESTRICCIONES T1 INNER JOIN GEN_CENTROCOSTO T2 ON T2.Cent_Id = T1.Mbod_CentCostoId) INNER JOIN GEN_REGIONAL T3 ON T3.Regi_Id = T1.Mbod_RegionId) WHERE (( T1.Mbod_RegionId = ? and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = ? and T1.Mbod_BodOrigenCodigo = ? and T1.Mbod_AlmModDestino = ?) or ( T3.Regi_Cod = 0 and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = ? and T1.Mbod_BodOrigenCodigo = ? and T1.Mbod_AlmModDestino = ?) or ( T1.Mbod_RegionId = ? and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = '00' and T1.Mbod_BodOrigenCodigo = ? and T1.Mbod_AlmModDestino = ?) or ( T3.Regi_Cod = 0 and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = '00' and T1.Mbod_BodOrigenCodigo = ? and T1.Mbod_AlmModDestino = ?) or ( T1.Mbod_RegionId = ? and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = ? and T1.Mbod_BodOrigenCodigo = '000' and T1.Mbod_AlmModDestino = ?) or ( T3.Regi_Cod = 0 and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = ? and T1.Mbod_BodOrigenCodigo = '000' and T1.Mbod_AlmModDestino = ?) or ( T1.Mbod_RegionId = ? and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = '00' and T1.Mbod_BodOrigenCodigo = '000' and T1.Mbod_AlmModDestino = ?) or ( T3.Regi_Cod = 0 and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = '00' and T1.Mbod_BodOrigenCodigo = '000' and T1.Mbod_AlmModDestino = ?)) AND (T1.Mbod_Estado = 'A') ORDER BY T1.Mbod_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((long[]) buf[6])[0] = rslt.getLong(7) ;
               ((long[]) buf[7])[0] = rslt.getLong(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((long[]) buf[9])[0] = rslt.getLong(10) ;
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
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((long[]) buf[5])[0] = rslt.getLong(6) ;
               ((long[]) buf[6])[0] = rslt.getLong(7) ;
               ((String[]) buf[7])[0] = rslt.getString(8, 1) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((long[]) buf[9])[0] = rslt.getLong(10) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(9) ;
               ((String[]) buf[11])[0] = rslt.getString(10, 1) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(11) ;
               ((long[]) buf[13])[0] = rslt.getLong(12) ;
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
               stmt.setVarchar(4, (String)parms[3], 3);
               stmt.setVarchar(5, (String)parms[4], 8);
               stmt.setVarchar(6, (String)parms[5], 2);
               stmt.setVarchar(7, (String)parms[6], 8);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 3);
               stmt.setVarchar(4, (String)parms[3], 8);
               stmt.setVarchar(5, (String)parms[4], 3);
               stmt.setVarchar(6, (String)parms[5], 8);
               stmt.setLong(7, ((Number) parms[6]).longValue());
               stmt.setLong(8, ((Number) parms[7]).longValue());
               stmt.setVarchar(9, (String)parms[8], 3);
               stmt.setVarchar(10, (String)parms[9], 8);
               stmt.setVarchar(11, (String)parms[10], 8);
               stmt.setLong(12, ((Number) parms[11]).longValue());
               stmt.setLong(13, ((Number) parms[12]).longValue());
               stmt.setVarchar(14, (String)parms[13], 3);
               stmt.setVarchar(15, (String)parms[14], 8);
               stmt.setVarchar(16, (String)parms[15], 2);
               stmt.setVarchar(17, (String)parms[16], 8);
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 3);
               stmt.setVarchar(3, (String)parms[2], 8);
               stmt.setVarchar(4, (String)parms[3], 2);
               stmt.setVarchar(5, (String)parms[4], 3);
               stmt.setVarchar(6, (String)parms[5], 8);
               stmt.setVarchar(7, (String)parms[6], 3);
               stmt.setVarchar(8, (String)parms[7], 8);
               stmt.setVarchar(9, (String)parms[8], 2);
               stmt.setVarchar(10, (String)parms[9], 3);
               stmt.setVarchar(11, (String)parms[10], 8);
               stmt.setLong(12, ((Number) parms[11]).longValue());
               stmt.setVarchar(13, (String)parms[12], 3);
               stmt.setVarchar(14, (String)parms[13], 8);
               stmt.setVarchar(15, (String)parms[14], 3);
               stmt.setVarchar(16, (String)parms[15], 8);
               stmt.setVarchar(17, (String)parms[16], 3);
               stmt.setVarchar(18, (String)parms[17], 8);
               stmt.setVarchar(19, (String)parms[18], 3);
               stmt.setVarchar(20, (String)parms[19], 8);
               stmt.setLong(21, ((Number) parms[20]).longValue());
               stmt.setVarchar(22, (String)parms[21], 3);
               stmt.setVarchar(23, (String)parms[22], 8);
               stmt.setVarchar(24, (String)parms[23], 2);
               stmt.setVarchar(25, (String)parms[24], 8);
               stmt.setVarchar(26, (String)parms[25], 3);
               stmt.setVarchar(27, (String)parms[26], 8);
               stmt.setVarchar(28, (String)parms[27], 2);
               stmt.setVarchar(29, (String)parms[28], 8);
               stmt.setLong(30, ((Number) parms[29]).longValue());
               stmt.setVarchar(31, (String)parms[30], 3);
               stmt.setVarchar(32, (String)parms[31], 8);
               stmt.setVarchar(33, (String)parms[32], 8);
               stmt.setVarchar(34, (String)parms[33], 3);
               stmt.setVarchar(35, (String)parms[34], 8);
               stmt.setVarchar(36, (String)parms[35], 8);
               return;
      }
   }

}

