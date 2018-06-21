/*
               File: PBodega_Destino
        Description: PBodega_Destino
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:10.56
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbodega_destino extends GXProcedure
{
   public pbodega_destino( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbodega_destino.class ), "" );
   }

   public pbodega_destino( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GXBaseCollection<com.orions2.SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem> executeUdp( long[] aP0 ,
                                                                                                 long[] aP1 ,
                                                                                                 String[] aP2 ,
                                                                                                 String[] aP3 ,
                                                                                                 String[] aP4 ,
                                                                                                 String[] aP5 ,
                                                                                                 String[] aP6 ,
                                                                                                 String[] aP7 )
   {
      pbodega_destino.this.AV15Tran_RegionId = aP0[0];
      this.aP0 = aP0;
      pbodega_destino.this.AV9Tran_CentroCostoId = aP1[0];
      this.aP1 = aP1;
      pbodega_destino.this.AV12Tran_CodigoMovimiento = aP2[0];
      this.aP2 = aP2;
      pbodega_destino.this.AV14Tran_ModuloOrigen = aP3[0];
      this.aP3 = aP3;
      pbodega_destino.this.AV19Tran_CodAlmaOrigen = aP4[0];
      this.aP4 = aP4;
      pbodega_destino.this.AV11Tran_CodBodeOrigen = aP5[0];
      this.aP5 = aP5;
      pbodega_destino.this.AV13Tran_ModuloDestino = aP6[0];
      this.aP6 = aP6;
      pbodega_destino.this.AV10Tran_CodAlmaDestino = aP7[0];
      this.aP7 = aP7;
      pbodega_destino.this.AV17SDTBodegaOrigenTrn = aP8[0];
      this.aP8 = aP8;
      pbodega_destino.this.aP8 = new GXBaseCollection[] {new GXBaseCollection<com.orions2.SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem>()};
      initialize();
      privateExecute();
      return aP8[0];
   }

   public void execute( long[] aP0 ,
                        long[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        GXBaseCollection<com.orions2.SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem>[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( long[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             GXBaseCollection<com.orions2.SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem>[] aP8 )
   {
      pbodega_destino.this.AV15Tran_RegionId = aP0[0];
      this.aP0 = aP0;
      pbodega_destino.this.AV9Tran_CentroCostoId = aP1[0];
      this.aP1 = aP1;
      pbodega_destino.this.AV12Tran_CodigoMovimiento = aP2[0];
      this.aP2 = aP2;
      pbodega_destino.this.AV14Tran_ModuloOrigen = aP3[0];
      this.aP3 = aP3;
      pbodega_destino.this.AV19Tran_CodAlmaOrigen = aP4[0];
      this.aP4 = aP4;
      pbodega_destino.this.AV11Tran_CodBodeOrigen = aP5[0];
      this.aP5 = aP5;
      pbodega_destino.this.AV13Tran_ModuloDestino = aP6[0];
      this.aP6 = aP6;
      pbodega_destino.this.AV10Tran_CodAlmaDestino = aP7[0];
      this.aP7 = aP7;
      pbodega_destino.this.AV17SDTBodegaOrigenTrn = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV22GXLvl2 = (byte)(0) ;
      /* Using cursor P00222 */
      pr_default.execute(0, new Object[] {AV11Tran_CodBodeOrigen, new Long(AV15Tran_RegionId), new Long(AV9Tran_CentroCostoId), AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV19Tran_CodAlmaOrigen, AV13Tran_ModuloDestino, AV10Tran_CodAlmaDestino});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A434Mbod_Estado = P00222_A434Mbod_Estado[0] ;
         A345Mbod_AlmDestinoCodigo = P00222_A345Mbod_AlmDestinoCodigo[0] ;
         A368Mbod_AlmModDestino = P00222_A368Mbod_AlmModDestino[0] ;
         A64Mbod_BodOrigenCodigo = P00222_A64Mbod_BodOrigenCodigo[0] ;
         A342Mbod_AlmOrigenCodigo = P00222_A342Mbod_AlmOrigenCodigo[0] ;
         A364Mbod_AlmModOrigen = P00222_A364Mbod_AlmModOrigen[0] ;
         A61Mbod_TipoMovCodigo = P00222_A61Mbod_TipoMovCodigo[0] ;
         A63Mbod_CentCostoId = P00222_A63Mbod_CentCostoId[0] ;
         A62Mbod_RegionId = P00222_A62Mbod_RegionId[0] ;
         A65Mbod_BodDestinoCodigo = P00222_A65Mbod_BodDestinoCodigo[0] ;
         A60Mbod_Id = P00222_A60Mbod_Id[0] ;
         AV22GXLvl2 = (byte)(1) ;
         if ( GXutil.strcmp(A65Mbod_BodDestinoCodigo, "000") != 0 )
         {
            AV18SDTBodegaOrigenTrnItem = (com.orions2.SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem)new com.orions2.SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem(remoteHandle, context);
            AV18SDTBodegaOrigenTrnItem.setgxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_codigo( A65Mbod_BodDestinoCodigo );
            AV8Mbod_BodOrigenCodigo = A65Mbod_BodDestinoCodigo ;
            /* Execute user subroutine: 'BODEGA' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV18SDTBodegaOrigenTrnItem.setgxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_descripcion( AV16Bode_Descripcion );
            AV17SDTBodegaOrigenTrn.add(AV18SDTBodegaOrigenTrnItem, 0);
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
      if ( AV22GXLvl2 == 0 )
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
      AV16Bode_Descripcion = "" ;
      /* Using cursor P00223 */
      pr_default.execute(1, new Object[] {new Long(AV9Tran_CentroCostoId), AV13Tran_ModuloDestino, AV10Tran_CodAlmaDestino, AV8Mbod_BodOrigenCodigo});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A31Bode_Codigo = P00223_A31Bode_Codigo[0] ;
         A28Alma_Codigo = P00223_A28Alma_Codigo[0] ;
         A27Alma_Modulo = P00223_A27Alma_Modulo[0] ;
         A1Cent_Id = P00223_A1Cent_Id[0] ;
         A695BBode_Descripcion = P00223_A695BBode_Descripcion[0] ;
         AV16Bode_Descripcion = A695BBode_Descripcion ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void S121( )
   {
      /* 'TODOS BODEGA' Routine */
      /* Using cursor P00224 */
      pr_default.execute(2, new Object[] {new Long(AV9Tran_CentroCostoId), AV13Tran_ModuloDestino, AV10Tran_CodAlmaDestino});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A28Alma_Codigo = P00224_A28Alma_Codigo[0] ;
         A27Alma_Modulo = P00224_A27Alma_Modulo[0] ;
         A1Cent_Id = P00224_A1Cent_Id[0] ;
         A31Bode_Codigo = P00224_A31Bode_Codigo[0] ;
         A695BBode_Descripcion = P00224_A695BBode_Descripcion[0] ;
         if ( GXutil.strcmp(A31Bode_Codigo, "000") != 0 )
         {
            AV18SDTBodegaOrigenTrnItem = (com.orions2.SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem)new com.orions2.SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem(remoteHandle, context);
            AV18SDTBodegaOrigenTrnItem.setgxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_codigo( A31Bode_Codigo );
            AV18SDTBodegaOrigenTrnItem.setgxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_descripcion( A695BBode_Descripcion );
            AV17SDTBodegaOrigenTrn.add(AV18SDTBodegaOrigenTrnItem, 0);
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S131( )
   {
      /* 'RESTRICCIONES' Routine */
      AV25GXLvl57 = (byte)(0) ;
      /* Using cursor P00225 */
      pr_default.execute(3, new Object[] {new Long(AV15Tran_RegionId), new Long(AV9Tran_CentroCostoId), AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV11Tran_CodBodeOrigen, AV13Tran_ModuloDestino, AV10Tran_CodAlmaDestino, new Long(AV15Tran_RegionId), new Long(AV9Tran_CentroCostoId), AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV13Tran_ModuloDestino, AV10Tran_CodAlmaDestino, new Long(AV15Tran_RegionId), new Long(AV9Tran_CentroCostoId), AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV11Tran_CodBodeOrigen, AV13Tran_ModuloDestino, new Long(AV15Tran_RegionId), new Long(AV9Tran_CentroCostoId), AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV13Tran_ModuloDestino, new Long(AV15Tran_RegionId), new Long(AV9Tran_CentroCostoId), AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV19Tran_CodAlmaOrigen, AV13Tran_ModuloDestino, AV10Tran_CodAlmaDestino, new Long(AV15Tran_RegionId), new Long(AV9Tran_CentroCostoId), AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV19Tran_CodAlmaOrigen, AV11Tran_CodBodeOrigen, AV13Tran_ModuloDestino, new Long(AV15Tran_RegionId), new Long(AV9Tran_CentroCostoId), AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV19Tran_CodAlmaOrigen, AV13Tran_ModuloDestino});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A345Mbod_AlmDestinoCodigo = P00225_A345Mbod_AlmDestinoCodigo[0] ;
         A368Mbod_AlmModDestino = P00225_A368Mbod_AlmModDestino[0] ;
         A64Mbod_BodOrigenCodigo = P00225_A64Mbod_BodOrigenCodigo[0] ;
         A342Mbod_AlmOrigenCodigo = P00225_A342Mbod_AlmOrigenCodigo[0] ;
         A364Mbod_AlmModOrigen = P00225_A364Mbod_AlmModOrigen[0] ;
         A61Mbod_TipoMovCodigo = P00225_A61Mbod_TipoMovCodigo[0] ;
         A63Mbod_CentCostoId = P00225_A63Mbod_CentCostoId[0] ;
         A62Mbod_RegionId = P00225_A62Mbod_RegionId[0] ;
         A434Mbod_Estado = P00225_A434Mbod_Estado[0] ;
         A65Mbod_BodDestinoCodigo = P00225_A65Mbod_BodDestinoCodigo[0] ;
         A60Mbod_Id = P00225_A60Mbod_Id[0] ;
         AV25GXLvl57 = (byte)(1) ;
         if ( GXutil.strcmp(A65Mbod_BodDestinoCodigo, "000") != 0 )
         {
            AV18SDTBodegaOrigenTrnItem = (com.orions2.SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem)new com.orions2.SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem(remoteHandle, context);
            AV18SDTBodegaOrigenTrnItem.setgxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_codigo( A65Mbod_BodDestinoCodigo );
            AV8Mbod_BodOrigenCodigo = A65Mbod_BodDestinoCodigo ;
            /* Execute user subroutine: 'BODEGA' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(3);
               returnInSub = true;
               if (true) return;
            }
            AV18SDTBodegaOrigenTrnItem.setgxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_descripcion( AV16Bode_Descripcion );
            AV17SDTBodegaOrigenTrn.add(AV18SDTBodegaOrigenTrnItem, 0);
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
      if ( AV25GXLvl57 == 0 )
      {
         /* Using cursor P00226 */
         pr_default.execute(4, new Object[] {new Long(AV15Tran_RegionId), AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV19Tran_CodAlmaOrigen, AV11Tran_CodBodeOrigen, AV13Tran_ModuloDestino, AV10Tran_CodAlmaDestino, AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV19Tran_CodAlmaOrigen, AV11Tran_CodBodeOrigen, AV13Tran_ModuloDestino, AV10Tran_CodAlmaDestino, new Long(AV15Tran_RegionId), AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV11Tran_CodBodeOrigen, AV13Tran_ModuloDestino, AV10Tran_CodAlmaDestino, AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV11Tran_CodBodeOrigen, AV13Tran_ModuloDestino, AV10Tran_CodAlmaDestino, new Long(AV15Tran_RegionId), AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV19Tran_CodAlmaOrigen, AV13Tran_ModuloDestino, AV10Tran_CodAlmaDestino, AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV19Tran_CodAlmaOrigen, AV13Tran_ModuloDestino, AV10Tran_CodAlmaDestino, new Long(AV15Tran_RegionId), AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV13Tran_ModuloDestino, AV10Tran_CodAlmaDestino, AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV13Tran_ModuloDestino, AV10Tran_CodAlmaDestino, new Long(AV15Tran_RegionId), AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV19Tran_CodAlmaOrigen, AV11Tran_CodBodeOrigen, AV13Tran_ModuloDestino, AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV19Tran_CodAlmaOrigen, AV11Tran_CodBodeOrigen, AV13Tran_ModuloDestino, new Long(AV15Tran_RegionId), AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV11Tran_CodBodeOrigen, AV13Tran_ModuloDestino, AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV11Tran_CodBodeOrigen, AV13Tran_ModuloDestino, new Long(AV15Tran_RegionId), AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV19Tran_CodAlmaOrigen, AV13Tran_ModuloDestino, AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV19Tran_CodAlmaOrigen, AV13Tran_ModuloDestino, new Long(AV15Tran_RegionId), AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV13Tran_ModuloDestino, AV12Tran_CodigoMovimiento, AV14Tran_ModuloOrigen, AV13Tran_ModuloDestino});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A63Mbod_CentCostoId = P00226_A63Mbod_CentCostoId[0] ;
            A426Mbod_RegionCodigo = P00226_A426Mbod_RegionCodigo[0] ;
            n426Mbod_RegionCodigo = P00226_n426Mbod_RegionCodigo[0] ;
            A345Mbod_AlmDestinoCodigo = P00226_A345Mbod_AlmDestinoCodigo[0] ;
            A368Mbod_AlmModDestino = P00226_A368Mbod_AlmModDestino[0] ;
            A64Mbod_BodOrigenCodigo = P00226_A64Mbod_BodOrigenCodigo[0] ;
            A342Mbod_AlmOrigenCodigo = P00226_A342Mbod_AlmOrigenCodigo[0] ;
            A364Mbod_AlmModOrigen = P00226_A364Mbod_AlmModOrigen[0] ;
            A61Mbod_TipoMovCodigo = P00226_A61Mbod_TipoMovCodigo[0] ;
            A429Mbod_CentCostoCodigo = P00226_A429Mbod_CentCostoCodigo[0] ;
            n429Mbod_CentCostoCodigo = P00226_n429Mbod_CentCostoCodigo[0] ;
            A62Mbod_RegionId = P00226_A62Mbod_RegionId[0] ;
            A434Mbod_Estado = P00226_A434Mbod_Estado[0] ;
            A65Mbod_BodDestinoCodigo = P00226_A65Mbod_BodDestinoCodigo[0] ;
            A60Mbod_Id = P00226_A60Mbod_Id[0] ;
            A429Mbod_CentCostoCodigo = P00226_A429Mbod_CentCostoCodigo[0] ;
            n429Mbod_CentCostoCodigo = P00226_n429Mbod_CentCostoCodigo[0] ;
            A426Mbod_RegionCodigo = P00226_A426Mbod_RegionCodigo[0] ;
            n426Mbod_RegionCodigo = P00226_n426Mbod_RegionCodigo[0] ;
            if ( GXutil.strcmp(A65Mbod_BodDestinoCodigo, "000") != 0 )
            {
               AV18SDTBodegaOrigenTrnItem = (com.orions2.SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem)new com.orions2.SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem(remoteHandle, context);
               AV18SDTBodegaOrigenTrnItem.setgxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_codigo( A65Mbod_BodDestinoCodigo );
               AV8Mbod_BodOrigenCodigo = A65Mbod_BodDestinoCodigo ;
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
               AV18SDTBodegaOrigenTrnItem.setgxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_descripcion( AV16Bode_Descripcion );
               AV17SDTBodegaOrigenTrn.add(AV18SDTBodegaOrigenTrnItem, 0);
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
      this.aP0[0] = pbodega_destino.this.AV15Tran_RegionId;
      this.aP1[0] = pbodega_destino.this.AV9Tran_CentroCostoId;
      this.aP2[0] = pbodega_destino.this.AV12Tran_CodigoMovimiento;
      this.aP3[0] = pbodega_destino.this.AV14Tran_ModuloOrigen;
      this.aP4[0] = pbodega_destino.this.AV19Tran_CodAlmaOrigen;
      this.aP5[0] = pbodega_destino.this.AV11Tran_CodBodeOrigen;
      this.aP6[0] = pbodega_destino.this.AV13Tran_ModuloDestino;
      this.aP7[0] = pbodega_destino.this.AV10Tran_CodAlmaDestino;
      this.aP8[0] = pbodega_destino.this.AV17SDTBodegaOrigenTrn;
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
      P00222_A434Mbod_Estado = new String[] {""} ;
      P00222_A345Mbod_AlmDestinoCodigo = new String[] {""} ;
      P00222_A368Mbod_AlmModDestino = new String[] {""} ;
      P00222_A64Mbod_BodOrigenCodigo = new String[] {""} ;
      P00222_A342Mbod_AlmOrigenCodigo = new String[] {""} ;
      P00222_A364Mbod_AlmModOrigen = new String[] {""} ;
      P00222_A61Mbod_TipoMovCodigo = new String[] {""} ;
      P00222_A63Mbod_CentCostoId = new long[1] ;
      P00222_A62Mbod_RegionId = new long[1] ;
      P00222_A65Mbod_BodDestinoCodigo = new String[] {""} ;
      P00222_A60Mbod_Id = new long[1] ;
      A434Mbod_Estado = "" ;
      A345Mbod_AlmDestinoCodigo = "" ;
      A368Mbod_AlmModDestino = "" ;
      A64Mbod_BodOrigenCodigo = "" ;
      A342Mbod_AlmOrigenCodigo = "" ;
      A364Mbod_AlmModOrigen = "" ;
      A61Mbod_TipoMovCodigo = "" ;
      A65Mbod_BodDestinoCodigo = "" ;
      AV18SDTBodegaOrigenTrnItem = new com.orions2.SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem(remoteHandle, context);
      AV8Mbod_BodOrigenCodigo = "" ;
      AV16Bode_Descripcion = "" ;
      P00223_A31Bode_Codigo = new String[] {""} ;
      P00223_A28Alma_Codigo = new String[] {""} ;
      P00223_A27Alma_Modulo = new String[] {""} ;
      P00223_A1Cent_Id = new long[1] ;
      P00223_A695BBode_Descripcion = new String[] {""} ;
      A31Bode_Codigo = "" ;
      A28Alma_Codigo = "" ;
      A27Alma_Modulo = "" ;
      A695BBode_Descripcion = "" ;
      P00224_A28Alma_Codigo = new String[] {""} ;
      P00224_A27Alma_Modulo = new String[] {""} ;
      P00224_A1Cent_Id = new long[1] ;
      P00224_A31Bode_Codigo = new String[] {""} ;
      P00224_A695BBode_Descripcion = new String[] {""} ;
      P00225_A345Mbod_AlmDestinoCodigo = new String[] {""} ;
      P00225_A368Mbod_AlmModDestino = new String[] {""} ;
      P00225_A64Mbod_BodOrigenCodigo = new String[] {""} ;
      P00225_A342Mbod_AlmOrigenCodigo = new String[] {""} ;
      P00225_A364Mbod_AlmModOrigen = new String[] {""} ;
      P00225_A61Mbod_TipoMovCodigo = new String[] {""} ;
      P00225_A63Mbod_CentCostoId = new long[1] ;
      P00225_A62Mbod_RegionId = new long[1] ;
      P00225_A434Mbod_Estado = new String[] {""} ;
      P00225_A65Mbod_BodDestinoCodigo = new String[] {""} ;
      P00225_A60Mbod_Id = new long[1] ;
      P00226_A63Mbod_CentCostoId = new long[1] ;
      P00226_A426Mbod_RegionCodigo = new short[1] ;
      P00226_n426Mbod_RegionCodigo = new boolean[] {false} ;
      P00226_A345Mbod_AlmDestinoCodigo = new String[] {""} ;
      P00226_A368Mbod_AlmModDestino = new String[] {""} ;
      P00226_A64Mbod_BodOrigenCodigo = new String[] {""} ;
      P00226_A342Mbod_AlmOrigenCodigo = new String[] {""} ;
      P00226_A364Mbod_AlmModOrigen = new String[] {""} ;
      P00226_A61Mbod_TipoMovCodigo = new String[] {""} ;
      P00226_A429Mbod_CentCostoCodigo = new String[] {""} ;
      P00226_n429Mbod_CentCostoCodigo = new boolean[] {false} ;
      P00226_A62Mbod_RegionId = new long[1] ;
      P00226_A434Mbod_Estado = new String[] {""} ;
      P00226_A65Mbod_BodDestinoCodigo = new String[] {""} ;
      P00226_A60Mbod_Id = new long[1] ;
      A429Mbod_CentCostoCodigo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.pbodega_destino__default(),
         new Object[] {
             new Object[] {
            P00222_A434Mbod_Estado, P00222_A345Mbod_AlmDestinoCodigo, P00222_A368Mbod_AlmModDestino, P00222_A64Mbod_BodOrigenCodigo, P00222_A342Mbod_AlmOrigenCodigo, P00222_A364Mbod_AlmModOrigen, P00222_A61Mbod_TipoMovCodigo, P00222_A63Mbod_CentCostoId, P00222_A62Mbod_RegionId, P00222_A65Mbod_BodDestinoCodigo,
            P00222_A60Mbod_Id
            }
            , new Object[] {
            P00223_A31Bode_Codigo, P00223_A28Alma_Codigo, P00223_A27Alma_Modulo, P00223_A1Cent_Id, P00223_A695BBode_Descripcion
            }
            , new Object[] {
            P00224_A28Alma_Codigo, P00224_A27Alma_Modulo, P00224_A1Cent_Id, P00224_A31Bode_Codigo, P00224_A695BBode_Descripcion
            }
            , new Object[] {
            P00225_A345Mbod_AlmDestinoCodigo, P00225_A368Mbod_AlmModDestino, P00225_A64Mbod_BodOrigenCodigo, P00225_A342Mbod_AlmOrigenCodigo, P00225_A364Mbod_AlmModOrigen, P00225_A61Mbod_TipoMovCodigo, P00225_A63Mbod_CentCostoId, P00225_A62Mbod_RegionId, P00225_A434Mbod_Estado, P00225_A65Mbod_BodDestinoCodigo,
            P00225_A60Mbod_Id
            }
            , new Object[] {
            P00226_A63Mbod_CentCostoId, P00226_A426Mbod_RegionCodigo, P00226_n426Mbod_RegionCodigo, P00226_A345Mbod_AlmDestinoCodigo, P00226_A368Mbod_AlmModDestino, P00226_A64Mbod_BodOrigenCodigo, P00226_A342Mbod_AlmOrigenCodigo, P00226_A364Mbod_AlmModOrigen, P00226_A61Mbod_TipoMovCodigo, P00226_A429Mbod_CentCostoCodigo,
            P00226_n429Mbod_CentCostoCodigo, P00226_A62Mbod_RegionId, P00226_A434Mbod_Estado, P00226_A65Mbod_BodDestinoCodigo, P00226_A60Mbod_Id
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV22GXLvl2 ;
   private byte AV25GXLvl57 ;
   private short A426Mbod_RegionCodigo ;
   private short Gx_err ;
   private long AV15Tran_RegionId ;
   private long AV9Tran_CentroCostoId ;
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
   private String AV19Tran_CodAlmaOrigen ;
   private String AV11Tran_CodBodeOrigen ;
   private String AV13Tran_ModuloDestino ;
   private String AV10Tran_CodAlmaDestino ;
   private String A345Mbod_AlmDestinoCodigo ;
   private String A368Mbod_AlmModDestino ;
   private String A64Mbod_BodOrigenCodigo ;
   private String A342Mbod_AlmOrigenCodigo ;
   private String A364Mbod_AlmModOrigen ;
   private String A61Mbod_TipoMovCodigo ;
   private String A65Mbod_BodDestinoCodigo ;
   private String AV8Mbod_BodOrigenCodigo ;
   private String AV16Bode_Descripcion ;
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
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private GXBaseCollection<com.orions2.SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem>[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P00222_A434Mbod_Estado ;
   private String[] P00222_A345Mbod_AlmDestinoCodigo ;
   private String[] P00222_A368Mbod_AlmModDestino ;
   private String[] P00222_A64Mbod_BodOrigenCodigo ;
   private String[] P00222_A342Mbod_AlmOrigenCodigo ;
   private String[] P00222_A364Mbod_AlmModOrigen ;
   private String[] P00222_A61Mbod_TipoMovCodigo ;
   private long[] P00222_A63Mbod_CentCostoId ;
   private long[] P00222_A62Mbod_RegionId ;
   private String[] P00222_A65Mbod_BodDestinoCodigo ;
   private long[] P00222_A60Mbod_Id ;
   private String[] P00223_A31Bode_Codigo ;
   private String[] P00223_A28Alma_Codigo ;
   private String[] P00223_A27Alma_Modulo ;
   private long[] P00223_A1Cent_Id ;
   private String[] P00223_A695BBode_Descripcion ;
   private String[] P00224_A28Alma_Codigo ;
   private String[] P00224_A27Alma_Modulo ;
   private long[] P00224_A1Cent_Id ;
   private String[] P00224_A31Bode_Codigo ;
   private String[] P00224_A695BBode_Descripcion ;
   private String[] P00225_A345Mbod_AlmDestinoCodigo ;
   private String[] P00225_A368Mbod_AlmModDestino ;
   private String[] P00225_A64Mbod_BodOrigenCodigo ;
   private String[] P00225_A342Mbod_AlmOrigenCodigo ;
   private String[] P00225_A364Mbod_AlmModOrigen ;
   private String[] P00225_A61Mbod_TipoMovCodigo ;
   private long[] P00225_A63Mbod_CentCostoId ;
   private long[] P00225_A62Mbod_RegionId ;
   private String[] P00225_A434Mbod_Estado ;
   private String[] P00225_A65Mbod_BodDestinoCodigo ;
   private long[] P00225_A60Mbod_Id ;
   private long[] P00226_A63Mbod_CentCostoId ;
   private short[] P00226_A426Mbod_RegionCodigo ;
   private boolean[] P00226_n426Mbod_RegionCodigo ;
   private String[] P00226_A345Mbod_AlmDestinoCodigo ;
   private String[] P00226_A368Mbod_AlmModDestino ;
   private String[] P00226_A64Mbod_BodOrigenCodigo ;
   private String[] P00226_A342Mbod_AlmOrigenCodigo ;
   private String[] P00226_A364Mbod_AlmModOrigen ;
   private String[] P00226_A61Mbod_TipoMovCodigo ;
   private String[] P00226_A429Mbod_CentCostoCodigo ;
   private boolean[] P00226_n429Mbod_CentCostoCodigo ;
   private long[] P00226_A62Mbod_RegionId ;
   private String[] P00226_A434Mbod_Estado ;
   private String[] P00226_A65Mbod_BodDestinoCodigo ;
   private long[] P00226_A60Mbod_Id ;
   private GXBaseCollection<com.orions2.SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem> AV17SDTBodegaOrigenTrn ;
   private com.orions2.SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem AV18SDTBodegaOrigenTrnItem ;
}

final  class pbodega_destino__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00222", "SELECT Mbod_Estado, Mbod_AlmDestinoCodigo, Mbod_AlmModDestino, Mbod_BodOrigenCodigo, Mbod_AlmOrigenCodigo, Mbod_AlmModOrigen, Mbod_TipoMovCodigo, Mbod_CentCostoId, Mbod_RegionId, Mbod_BodDestinoCodigo, Mbod_Id FROM ALM_RESTRICCIONES WHERE (Mbod_BodOrigenCodigo = ?) AND (Mbod_RegionId = ?) AND (Mbod_CentCostoId = ?) AND (Mbod_TipoMovCodigo = ?) AND (Mbod_AlmModOrigen = ?) AND (Mbod_AlmOrigenCodigo = ?) AND (Mbod_AlmModDestino = ?) AND (Mbod_AlmDestinoCodigo = ?) AND (Mbod_Estado = 'A') ORDER BY Mbod_BodOrigenCodigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P00223", "SELECT Bode_Codigo, Alma_Codigo, Alma_Modulo, Cent_Id, BBode_Descripcion FROM ALM_ALMACEN_BODEGAS WHERE Cent_Id = ? and Alma_Modulo = ? and Alma_Codigo = ? and Bode_Codigo = ? ORDER BY Cent_Id, Alma_Modulo, Alma_Codigo, Bode_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P00224", "SELECT Alma_Codigo, Alma_Modulo, Cent_Id, Bode_Codigo, BBode_Descripcion FROM ALM_ALMACEN_BODEGAS WHERE Cent_Id = ? and Alma_Modulo = ? and Alma_Codigo = ? ORDER BY Cent_Id, Alma_Modulo, Alma_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P00225", "SELECT Mbod_AlmDestinoCodigo, Mbod_AlmModDestino, Mbod_BodOrigenCodigo, Mbod_AlmOrigenCodigo, Mbod_AlmModOrigen, Mbod_TipoMovCodigo, Mbod_CentCostoId, Mbod_RegionId, Mbod_Estado, Mbod_BodDestinoCodigo, Mbod_Id FROM ALM_RESTRICCIONES WHERE (( Mbod_RegionId = ? and Mbod_CentCostoId = ? and Mbod_TipoMovCodigo = ? and Mbod_AlmModOrigen = ? and Mbod_AlmOrigenCodigo = '00' and Mbod_BodOrigenCodigo = ? and Mbod_AlmModDestino = ? and Mbod_AlmDestinoCodigo = ?) or ( Mbod_RegionId = ? and Mbod_CentCostoId = ? and Mbod_TipoMovCodigo = ? and Mbod_AlmModOrigen = ? and Mbod_AlmOrigenCodigo = '00' and Mbod_BodOrigenCodigo = '000' and Mbod_AlmModDestino = ? and Mbod_AlmDestinoCodigo = ?) or ( Mbod_RegionId = ? and Mbod_CentCostoId = ? and Mbod_TipoMovCodigo = ? and Mbod_AlmModOrigen = ? and Mbod_AlmOrigenCodigo = '00' and Mbod_BodOrigenCodigo = ? and Mbod_AlmModDestino = ? and Mbod_AlmDestinoCodigo = '00') or ( Mbod_RegionId = ? and Mbod_CentCostoId = ? and Mbod_TipoMovCodigo = ? and Mbod_AlmModOrigen = ? and Mbod_AlmOrigenCodigo = '00' and Mbod_BodOrigenCodigo = '000' and Mbod_AlmModDestino = ? and Mbod_AlmDestinoCodigo = '00') or ( Mbod_RegionId = ? and Mbod_CentCostoId = ? and Mbod_TipoMovCodigo = ? and Mbod_AlmModOrigen = ? and Mbod_AlmOrigenCodigo = ? and Mbod_BodOrigenCodigo = '000' and Mbod_AlmModDestino = ? and Mbod_AlmDestinoCodigo = ?) or ( Mbod_RegionId = ? and Mbod_CentCostoId = ? and Mbod_TipoMovCodigo = ? and Mbod_AlmModOrigen = ? and Mbod_AlmOrigenCodigo = ? and Mbod_BodOrigenCodigo = ? and Mbod_AlmModDestino = ? and Mbod_AlmDestinoCodigo = '00') or ( Mbod_RegionId = ? and Mbod_CentCostoId = ? and Mbod_TipoMovCodigo = ? and Mbod_AlmModOrigen = ? and Mbod_AlmOrigenCodigo = ? and Mbod_BodOrigenCodigo = '000' and Mbod_AlmModDestino = ? and Mbod_AlmDestinoCodigo = '00')) AND (Mbod_Estado = 'A') ORDER BY Mbod_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P00226", "SELECT T1.Mbod_CentCostoId AS Mbod_CentCostoId, T3.Regi_Cod AS Mbod_RegionCodigo, T1.Mbod_AlmDestinoCodigo, T1.Mbod_AlmModDestino, T1.Mbod_BodOrigenCodigo, T1.Mbod_AlmOrigenCodigo, T1.Mbod_AlmModOrigen, T1.Mbod_TipoMovCodigo, T2.Cent_Codigo AS Mbod_CentCostoCodigo, T1.Mbod_RegionId AS Mbod_RegionId, T1.Mbod_Estado, T1.Mbod_BodDestinoCodigo, T1.Mbod_Id FROM ((ALM_RESTRICCIONES T1 INNER JOIN GEN_CENTROCOSTO T2 ON T2.Cent_Id = T1.Mbod_CentCostoId) INNER JOIN GEN_REGIONAL T3 ON T3.Regi_Id = T1.Mbod_RegionId) WHERE (( T1.Mbod_RegionId = ? and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = ? and T1.Mbod_BodOrigenCodigo = ? and T1.Mbod_AlmModDestino = ? and T1.Mbod_AlmDestinoCodigo = ?) or ( T3.Regi_Cod = 0 and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = ? and T1.Mbod_BodOrigenCodigo = ? and T1.Mbod_AlmModDestino = ? and T1.Mbod_AlmDestinoCodigo = ?) or ( T1.Mbod_RegionId = ? and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = '00' and T1.Mbod_BodOrigenCodigo = ? and T1.Mbod_AlmModDestino = ? and T1.Mbod_AlmDestinoCodigo = ?) or ( T3.Regi_Cod = 0 and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = '00' and T1.Mbod_BodOrigenCodigo = ? and T1.Mbod_AlmModDestino = ? and T1.Mbod_AlmDestinoCodigo = ?) or ( T1.Mbod_RegionId = ? and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = ? and T1.Mbod_BodOrigenCodigo = '000' and T1.Mbod_AlmModDestino = ? and T1.Mbod_AlmDestinoCodigo = ?) or ( T3.Regi_Cod = 0 and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = ? and T1.Mbod_BodOrigenCodigo = '000' and T1.Mbod_AlmModDestino = ? and T1.Mbod_AlmDestinoCodigo = ?) or ( T1.Mbod_RegionId = ? and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = '00' and T1.Mbod_BodOrigenCodigo = '000' and T1.Mbod_AlmModDestino = ? and T1.Mbod_AlmDestinoCodigo = ?) or ( T3.Regi_Cod = 0 and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = '00' and T1.Mbod_BodOrigenCodigo = '000' and T1.Mbod_AlmModDestino = ? and T1.Mbod_AlmDestinoCodigo = ?) or ( T1.Mbod_RegionId = ? and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = ? and T1.Mbod_BodOrigenCodigo = ? and T1.Mbod_AlmModDestino = ? and T1.Mbod_AlmDestinoCodigo = '00') or ( T3.Regi_Cod = 0 and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = ? and T1.Mbod_BodOrigenCodigo = ? and T1.Mbod_AlmModDestino = ? and T1.Mbod_AlmDestinoCodigo = '00') or ( T1.Mbod_RegionId = ? and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = '00' and T1.Mbod_BodOrigenCodigo = ? and T1.Mbod_AlmModDestino = ? and T1.Mbod_AlmDestinoCodigo = '00') or ( T3.Regi_Cod = 0 and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = '00' and T1.Mbod_BodOrigenCodigo = ? and T1.Mbod_AlmModDestino = ? and T1.Mbod_AlmDestinoCodigo = '00') or ( T1.Mbod_RegionId = ? and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = ? and T1.Mbod_BodOrigenCodigo = '000' and T1.Mbod_AlmModDestino = ? and T1.Mbod_AlmDestinoCodigo = '00') or ( T3.Regi_Cod = 0 and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = ? and T1.Mbod_BodOrigenCodigo = '000' and T1.Mbod_AlmModDestino = ? and T1.Mbod_AlmDestinoCodigo = '00') or ( T1.Mbod_RegionId = ? and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = '00' and T1.Mbod_BodOrigenCodigo = '000' and T1.Mbod_AlmModDestino = ? and T1.Mbod_AlmDestinoCodigo = '00') or ( T3.Regi_Cod = 0 and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = '00' and T1.Mbod_BodOrigenCodigo = '000' and T1.Mbod_AlmModDestino = ? and T1.Mbod_AlmDestinoCodigo = '00')) AND (T1.Mbod_Estado = 'A') ORDER BY T1.Mbod_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((long[]) buf[7])[0] = rslt.getLong(8) ;
               ((long[]) buf[8])[0] = rslt.getLong(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((long[]) buf[10])[0] = rslt.getLong(11) ;
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
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((long[]) buf[6])[0] = rslt.getLong(7) ;
               ((long[]) buf[7])[0] = rslt.getLong(8) ;
               ((String[]) buf[8])[0] = rslt.getString(9, 1) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((long[]) buf[10])[0] = rslt.getLong(11) ;
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
               ((String[]) buf[9])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(10) ;
               ((String[]) buf[12])[0] = rslt.getString(11, 1) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(12) ;
               ((long[]) buf[14])[0] = rslt.getLong(13) ;
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
               stmt.setVarchar(8, (String)parms[7], 2);
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 3);
               stmt.setVarchar(4, (String)parms[3], 8);
               stmt.setVarchar(5, (String)parms[4], 3);
               stmt.setVarchar(6, (String)parms[5], 8);
               stmt.setVarchar(7, (String)parms[6], 2);
               stmt.setLong(8, ((Number) parms[7]).longValue());
               stmt.setLong(9, ((Number) parms[8]).longValue());
               stmt.setVarchar(10, (String)parms[9], 3);
               stmt.setVarchar(11, (String)parms[10], 8);
               stmt.setVarchar(12, (String)parms[11], 8);
               stmt.setVarchar(13, (String)parms[12], 2);
               stmt.setLong(14, ((Number) parms[13]).longValue());
               stmt.setLong(15, ((Number) parms[14]).longValue());
               stmt.setVarchar(16, (String)parms[15], 3);
               stmt.setVarchar(17, (String)parms[16], 8);
               stmt.setVarchar(18, (String)parms[17], 3);
               stmt.setVarchar(19, (String)parms[18], 8);
               stmt.setLong(20, ((Number) parms[19]).longValue());
               stmt.setLong(21, ((Number) parms[20]).longValue());
               stmt.setVarchar(22, (String)parms[21], 3);
               stmt.setVarchar(23, (String)parms[22], 8);
               stmt.setVarchar(24, (String)parms[23], 8);
               stmt.setLong(25, ((Number) parms[24]).longValue());
               stmt.setLong(26, ((Number) parms[25]).longValue());
               stmt.setVarchar(27, (String)parms[26], 3);
               stmt.setVarchar(28, (String)parms[27], 8);
               stmt.setVarchar(29, (String)parms[28], 2);
               stmt.setVarchar(30, (String)parms[29], 8);
               stmt.setVarchar(31, (String)parms[30], 2);
               stmt.setLong(32, ((Number) parms[31]).longValue());
               stmt.setLong(33, ((Number) parms[32]).longValue());
               stmt.setVarchar(34, (String)parms[33], 3);
               stmt.setVarchar(35, (String)parms[34], 8);
               stmt.setVarchar(36, (String)parms[35], 2);
               stmt.setVarchar(37, (String)parms[36], 3);
               stmt.setVarchar(38, (String)parms[37], 8);
               stmt.setLong(39, ((Number) parms[38]).longValue());
               stmt.setLong(40, ((Number) parms[39]).longValue());
               stmt.setVarchar(41, (String)parms[40], 3);
               stmt.setVarchar(42, (String)parms[41], 8);
               stmt.setVarchar(43, (String)parms[42], 2);
               stmt.setVarchar(44, (String)parms[43], 8);
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 3);
               stmt.setVarchar(3, (String)parms[2], 8);
               stmt.setVarchar(4, (String)parms[3], 2);
               stmt.setVarchar(5, (String)parms[4], 3);
               stmt.setVarchar(6, (String)parms[5], 8);
               stmt.setVarchar(7, (String)parms[6], 2);
               stmt.setVarchar(8, (String)parms[7], 3);
               stmt.setVarchar(9, (String)parms[8], 8);
               stmt.setVarchar(10, (String)parms[9], 2);
               stmt.setVarchar(11, (String)parms[10], 3);
               stmt.setVarchar(12, (String)parms[11], 8);
               stmt.setVarchar(13, (String)parms[12], 2);
               stmt.setLong(14, ((Number) parms[13]).longValue());
               stmt.setVarchar(15, (String)parms[14], 3);
               stmt.setVarchar(16, (String)parms[15], 8);
               stmt.setVarchar(17, (String)parms[16], 3);
               stmt.setVarchar(18, (String)parms[17], 8);
               stmt.setVarchar(19, (String)parms[18], 2);
               stmt.setVarchar(20, (String)parms[19], 3);
               stmt.setVarchar(21, (String)parms[20], 8);
               stmt.setVarchar(22, (String)parms[21], 3);
               stmt.setVarchar(23, (String)parms[22], 8);
               stmt.setVarchar(24, (String)parms[23], 2);
               stmt.setLong(25, ((Number) parms[24]).longValue());
               stmt.setVarchar(26, (String)parms[25], 3);
               stmt.setVarchar(27, (String)parms[26], 8);
               stmt.setVarchar(28, (String)parms[27], 2);
               stmt.setVarchar(29, (String)parms[28], 8);
               stmt.setVarchar(30, (String)parms[29], 2);
               stmt.setVarchar(31, (String)parms[30], 3);
               stmt.setVarchar(32, (String)parms[31], 8);
               stmt.setVarchar(33, (String)parms[32], 2);
               stmt.setVarchar(34, (String)parms[33], 8);
               stmt.setVarchar(35, (String)parms[34], 2);
               stmt.setLong(36, ((Number) parms[35]).longValue());
               stmt.setVarchar(37, (String)parms[36], 3);
               stmt.setVarchar(38, (String)parms[37], 8);
               stmt.setVarchar(39, (String)parms[38], 8);
               stmt.setVarchar(40, (String)parms[39], 2);
               stmt.setVarchar(41, (String)parms[40], 3);
               stmt.setVarchar(42, (String)parms[41], 8);
               stmt.setVarchar(43, (String)parms[42], 8);
               stmt.setVarchar(44, (String)parms[43], 2);
               stmt.setLong(45, ((Number) parms[44]).longValue());
               stmt.setVarchar(46, (String)parms[45], 3);
               stmt.setVarchar(47, (String)parms[46], 8);
               stmt.setVarchar(48, (String)parms[47], 2);
               stmt.setVarchar(49, (String)parms[48], 3);
               stmt.setVarchar(50, (String)parms[49], 8);
               stmt.setVarchar(51, (String)parms[50], 3);
               stmt.setVarchar(52, (String)parms[51], 8);
               stmt.setVarchar(53, (String)parms[52], 2);
               stmt.setVarchar(54, (String)parms[53], 3);
               stmt.setVarchar(55, (String)parms[54], 8);
               stmt.setLong(56, ((Number) parms[55]).longValue());
               stmt.setVarchar(57, (String)parms[56], 3);
               stmt.setVarchar(58, (String)parms[57], 8);
               stmt.setVarchar(59, (String)parms[58], 3);
               stmt.setVarchar(60, (String)parms[59], 8);
               stmt.setVarchar(61, (String)parms[60], 3);
               stmt.setVarchar(62, (String)parms[61], 8);
               stmt.setVarchar(63, (String)parms[62], 3);
               stmt.setVarchar(64, (String)parms[63], 8);
               stmt.setLong(65, ((Number) parms[64]).longValue());
               stmt.setVarchar(66, (String)parms[65], 3);
               stmt.setVarchar(67, (String)parms[66], 8);
               stmt.setVarchar(68, (String)parms[67], 2);
               stmt.setVarchar(69, (String)parms[68], 8);
               stmt.setVarchar(70, (String)parms[69], 3);
               stmt.setVarchar(71, (String)parms[70], 8);
               stmt.setVarchar(72, (String)parms[71], 2);
               stmt.setVarchar(73, (String)parms[72], 8);
               stmt.setLong(74, ((Number) parms[73]).longValue());
               stmt.setVarchar(75, (String)parms[74], 3);
               stmt.setVarchar(76, (String)parms[75], 8);
               stmt.setVarchar(77, (String)parms[76], 8);
               stmt.setVarchar(78, (String)parms[77], 3);
               stmt.setVarchar(79, (String)parms[78], 8);
               stmt.setVarchar(80, (String)parms[79], 8);
               return;
      }
   }

}

