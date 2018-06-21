/*
               File: PValidaArchivoNov
        Description: PValida Archivo Nov
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:14.90
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvalidaarchivonov extends GXProcedure
{
   public pvalidaarchivonov( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvalidaarchivonov.class ), "" );
   }

   public pvalidaarchivonov( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GXBaseCollection<com.orions2.SdtSDTErrorMasivo_SDTErrorMasivoItem> executeUdp( String[] aP0 ,
                                                                                         GXBaseCollection<com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem>[] aP1 ,
                                                                                         String[] aP2 ,
                                                                                         long[] aP3 ,
                                                                                         long[] aP4 ,
                                                                                         String[] aP5 )
   {
      pvalidaarchivonov.this.AV8Archivo = aP0[0];
      this.aP0 = aP0;
      pvalidaarchivonov.this.AV12SDTNovedadesDetalle = aP1[0];
      this.aP1 = aP1;
      pvalidaarchivonov.this.AV14TNov_Tipo = aP2[0];
      this.aP2 = aP2;
      pvalidaarchivonov.this.AV15Regi_Id = aP3[0];
      this.aP3 = aP3;
      pvalidaarchivonov.this.AV16Tran_ConsecutivoCC = aP4[0];
      this.aP4 = aP4;
      pvalidaarchivonov.this.AV22Errores = aP5[0];
      this.aP5 = aP5;
      pvalidaarchivonov.this.AV20SDTErrorMasivo = aP6[0];
      this.aP6 = aP6;
      pvalidaarchivonov.this.aP6 = new GXBaseCollection[] {new GXBaseCollection<com.orions2.SdtSDTErrorMasivo_SDTErrorMasivoItem>()};
      initialize();
      privateExecute();
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        GXBaseCollection<com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem>[] aP1 ,
                        String[] aP2 ,
                        long[] aP3 ,
                        long[] aP4 ,
                        String[] aP5 ,
                        GXBaseCollection<com.orions2.SdtSDTErrorMasivo_SDTErrorMasivoItem>[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             GXBaseCollection<com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem>[] aP1 ,
                             String[] aP2 ,
                             long[] aP3 ,
                             long[] aP4 ,
                             String[] aP5 ,
                             GXBaseCollection<com.orions2.SdtSDTErrorMasivo_SDTErrorMasivoItem>[] aP6 )
   {
      pvalidaarchivonov.this.AV8Archivo = aP0[0];
      this.aP0 = aP0;
      pvalidaarchivonov.this.AV12SDTNovedadesDetalle = aP1[0];
      this.aP1 = aP1;
      pvalidaarchivonov.this.AV14TNov_Tipo = aP2[0];
      this.aP2 = aP2;
      pvalidaarchivonov.this.AV15Regi_Id = aP3[0];
      this.aP3 = aP3;
      pvalidaarchivonov.this.AV16Tran_ConsecutivoCC = aP4[0];
      this.aP4 = aP4;
      pvalidaarchivonov.this.AV22Errores = aP5[0];
      this.aP5 = aP5;
      pvalidaarchivonov.this.AV20SDTErrorMasivo = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV22Errores = "N" ;
      AV23Tran_Id = 0 ;
      /* Using cursor P002O2 */
      pr_default.execute(0, new Object[] {new Long(AV15Regi_Id), new Long(AV16Tran_ConsecutivoCC)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A513Tran_ConsecutivoCC = P002O2_A513Tran_ConsecutivoCC[0] ;
         n513Tran_ConsecutivoCC = P002O2_n513Tran_ConsecutivoCC[0] ;
         A57Tran_RegionId = P002O2_A57Tran_RegionId[0] ;
         n57Tran_RegionId = P002O2_n57Tran_RegionId[0] ;
         A46Tran_Id = P002O2_A46Tran_Id[0] ;
         AV23Tran_Id = A46Tran_Id ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV9ExcelDocument.Open(AV8Archivo);
      if ( AV9ExcelDocument.getErrCode() != 0 )
      {
         AV10Respuesta = AV9ExcelDocument.getErrDescription() + "*" ;
      }
      else
      {
         AV11Row = 2 ;
         while ( ! (GXutil.strcmp("", GXutil.trim( AV9ExcelDocument.Cells(AV11Row, 1, 1, 1).getText()))==0) || ! (GXutil.strcmp("", GXutil.trim( AV9ExcelDocument.Cells(AV11Row, 2, 1, 1).getText()))==0) )
         {
            if ( GXutil.strcmp(AV14TNov_Tipo, "D") == 0 )
            {
               AV17Nove_Consecutivo = AV9ExcelDocument.Cells(AV11Row, 1, 1, 1).getText() ;
               /* Execute user subroutine: 'VALIDA CONSECUTIVO' */
               S111 ();
               if ( returnInSub )
               {
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( GXutil.strcmp(AV19Error, "S") == 0 )
               {
                  AV22Errores = "S" ;
                  AV21SDTErrorMasivoItem = (com.orions2.SdtSDTErrorMasivo_SDTErrorMasivoItem)new com.orions2.SdtSDTErrorMasivo_SDTErrorMasivoItem(remoteHandle, context);
                  AV21SDTErrorMasivoItem.setgxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Fila( (short)(AV11Row) );
                  AV21SDTErrorMasivoItem.setgxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Columna( (short)(1) );
                  AV21SDTErrorMasivoItem.setgxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Error( "No existe el consecutivo para la regional y transacción seleccionada" );
                  AV20SDTErrorMasivo.add(AV21SDTErrorMasivoItem, 0);
               }
            }
            else
            {
               AV18Nove_Placa = AV9ExcelDocument.Cells(AV11Row, 1, 1, 1).getText() ;
               /* Execute user subroutine: 'VALIDA PLACA' */
               S121 ();
               if ( returnInSub )
               {
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               System.out.println( "Placa : "+AV18Nove_Placa );
               System.out.println( "Error : "+AV19Error );
               if ( ( GXutil.strcmp(AV19Error, "S") == 0 ) || ( GXutil.strcmp(AV19Error, "E") == 0 ) )
               {
                  AV22Errores = "S" ;
                  AV21SDTErrorMasivoItem = (com.orions2.SdtSDTErrorMasivo_SDTErrorMasivoItem)new com.orions2.SdtSDTErrorMasivo_SDTErrorMasivoItem(remoteHandle, context);
                  AV21SDTErrorMasivoItem.setgxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Fila( (short)(AV11Row) );
                  AV21SDTErrorMasivoItem.setgxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Columna( (short)(1) );
                  if ( GXutil.strcmp(AV19Error, "S") == 0 )
                  {
                     AV21SDTErrorMasivoItem.setgxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Error( "No existe la placa para la regional seleccionada" );
                  }
                  else
                  {
                     AV21SDTErrorMasivoItem.setgxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Error( "No es posible mover la placa ya que se encuentra pendiente en otro movimiento" );
                  }
                  AV20SDTErrorMasivo.add(AV21SDTErrorMasivoItem, 0);
               }
            }
            AV11Row = (int)(AV11Row+1) ;
         }
         System.out.println( "Errores :"+AV22Errores );
         if ( GXutil.strcmp(AV22Errores, "N") == 0 )
         {
            AV11Row = 2 ;
            while ( ! (GXutil.strcmp("", GXutil.trim( AV9ExcelDocument.Cells(AV11Row, 1, 1, 1).getText()))==0) || ! (GXutil.strcmp("", GXutil.trim( AV9ExcelDocument.Cells(AV11Row, 2, 1, 1).getText()))==0) )
            {
               AV13SDTNovedadesDetalleItem = (com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem)new com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem(remoteHandle, context);
               AV13SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_linea( AV11Row );
               AV13SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_lineatrn( AV11Row );
               AV13SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valornuevo( AV9ExcelDocument.Cells(AV11Row, 2, 1, 1).getText() );
               if ( GXutil.strcmp(AV14TNov_Tipo, "D") == 0 )
               {
                  AV13SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_consecutivo( AV9ExcelDocument.Cells(AV11Row, 1, 1, 1).getText() );
               }
               else
               {
                  AV13SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_placa( AV9ExcelDocument.Cells(AV11Row, 1, 1, 1).getText() );
               }
               AV12SDTNovedadesDetalle.add(AV13SDTNovedadesDetalleItem, 0);
               AV11Row = (int)(AV11Row+1) ;
            }
         }
         AV9ExcelDocument.Close();
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'VALIDA CONSECUTIVO' Routine */
      AV19Error = "S" ;
      /* Using cursor P002O3 */
      pr_default.execute(1, new Object[] {new Long(AV23Tran_Id), AV17Nove_Consecutivo});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A66Elem_Consecutivo = P002O3_A66Elem_Consecutivo[0] ;
         A46Tran_Id = P002O3_A46Tran_Id[0] ;
         A69TDet_Consecutivo = P002O3_A69TDet_Consecutivo[0] ;
         AV19Error = "N" ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S121( )
   {
      /* 'VALIDA PLACA' Routine */
      AV19Error = "S" ;
      /* Using cursor P002O4 */
      pr_default.execute(2, new Object[] {AV18Nove_Placa, new Long(AV15Regi_Id)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A410Invd_RegionalId = P002O4_A410Invd_RegionalId[0] ;
         A67Invd_NumeroPlaca = P002O4_A67Invd_NumeroPlaca[0] ;
         A463Invd_Estado = P002O4_A463Invd_Estado[0] ;
         n463Invd_Estado = P002O4_n463Invd_Estado[0] ;
         A66Elem_Consecutivo = P002O4_A66Elem_Consecutivo[0] ;
         if ( GXutil.strcmp(A463Invd_Estado, "R") == 0 )
         {
            AV19Error = "N" ;
         }
         else
         {
            AV19Error = "E" ;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pvalidaarchivonov.this.AV8Archivo;
      this.aP1[0] = pvalidaarchivonov.this.AV12SDTNovedadesDetalle;
      this.aP2[0] = pvalidaarchivonov.this.AV14TNov_Tipo;
      this.aP3[0] = pvalidaarchivonov.this.AV15Regi_Id;
      this.aP4[0] = pvalidaarchivonov.this.AV16Tran_ConsecutivoCC;
      this.aP5[0] = pvalidaarchivonov.this.AV22Errores;
      this.aP6[0] = pvalidaarchivonov.this.AV20SDTErrorMasivo;
      CloseOpenCursors();
      AV9ExcelDocument.cleanup();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P002O2_A513Tran_ConsecutivoCC = new long[1] ;
      P002O2_n513Tran_ConsecutivoCC = new boolean[] {false} ;
      P002O2_A57Tran_RegionId = new long[1] ;
      P002O2_n57Tran_RegionId = new boolean[] {false} ;
      P002O2_A46Tran_Id = new long[1] ;
      AV9ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV10Respuesta = "" ;
      AV17Nove_Consecutivo = "" ;
      AV19Error = "" ;
      AV21SDTErrorMasivoItem = new com.orions2.SdtSDTErrorMasivo_SDTErrorMasivoItem(remoteHandle, context);
      AV18Nove_Placa = "" ;
      AV13SDTNovedadesDetalleItem = new com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem(remoteHandle, context);
      P002O3_A66Elem_Consecutivo = new String[] {""} ;
      P002O3_A46Tran_Id = new long[1] ;
      P002O3_A69TDet_Consecutivo = new long[1] ;
      A66Elem_Consecutivo = "" ;
      P002O4_A410Invd_RegionalId = new long[1] ;
      P002O4_A67Invd_NumeroPlaca = new String[] {""} ;
      P002O4_A463Invd_Estado = new String[] {""} ;
      P002O4_n463Invd_Estado = new boolean[] {false} ;
      P002O4_A66Elem_Consecutivo = new String[] {""} ;
      A67Invd_NumeroPlaca = "" ;
      A463Invd_Estado = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.pvalidaarchivonov__default(),
         new Object[] {
             new Object[] {
            P002O2_A513Tran_ConsecutivoCC, P002O2_n513Tran_ConsecutivoCC, P002O2_A57Tran_RegionId, P002O2_n57Tran_RegionId, P002O2_A46Tran_Id
            }
            , new Object[] {
            P002O3_A66Elem_Consecutivo, P002O3_A46Tran_Id, P002O3_A69TDet_Consecutivo
            }
            , new Object[] {
            P002O4_A410Invd_RegionalId, P002O4_A67Invd_NumeroPlaca, P002O4_A463Invd_Estado, P002O4_n463Invd_Estado, P002O4_A66Elem_Consecutivo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV11Row ;
   private long AV15Regi_Id ;
   private long AV16Tran_ConsecutivoCC ;
   private long AV23Tran_Id ;
   private long A513Tran_ConsecutivoCC ;
   private long A57Tran_RegionId ;
   private long A46Tran_Id ;
   private long A69TDet_Consecutivo ;
   private long A410Invd_RegionalId ;
   private String AV22Errores ;
   private String scmdbuf ;
   private String AV19Error ;
   private boolean n513Tran_ConsecutivoCC ;
   private boolean n57Tran_RegionId ;
   private boolean returnInSub ;
   private boolean n463Invd_Estado ;
   private String AV8Archivo ;
   private String AV14TNov_Tipo ;
   private String AV10Respuesta ;
   private String AV17Nove_Consecutivo ;
   private String AV18Nove_Placa ;
   private String A66Elem_Consecutivo ;
   private String A67Invd_NumeroPlaca ;
   private String A463Invd_Estado ;
   private String[] aP0 ;
   private GXBaseCollection<com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem>[] aP1 ;
   private String[] aP2 ;
   private long[] aP3 ;
   private long[] aP4 ;
   private String[] aP5 ;
   private GXBaseCollection<com.orions2.SdtSDTErrorMasivo_SDTErrorMasivoItem>[] aP6 ;
   private IDataStoreProvider pr_default ;
   private long[] P002O2_A513Tran_ConsecutivoCC ;
   private boolean[] P002O2_n513Tran_ConsecutivoCC ;
   private long[] P002O2_A57Tran_RegionId ;
   private boolean[] P002O2_n57Tran_RegionId ;
   private long[] P002O2_A46Tran_Id ;
   private String[] P002O3_A66Elem_Consecutivo ;
   private long[] P002O3_A46Tran_Id ;
   private long[] P002O3_A69TDet_Consecutivo ;
   private long[] P002O4_A410Invd_RegionalId ;
   private String[] P002O4_A67Invd_NumeroPlaca ;
   private String[] P002O4_A463Invd_Estado ;
   private boolean[] P002O4_n463Invd_Estado ;
   private String[] P002O4_A66Elem_Consecutivo ;
   private com.genexus.gxoffice.ExcelDoc AV9ExcelDocument ;
   private GXBaseCollection<com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem> AV12SDTNovedadesDetalle ;
   private GXBaseCollection<com.orions2.SdtSDTErrorMasivo_SDTErrorMasivoItem> AV20SDTErrorMasivo ;
   private com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem AV13SDTNovedadesDetalleItem ;
   private com.orions2.SdtSDTErrorMasivo_SDTErrorMasivoItem AV21SDTErrorMasivoItem ;
}

final  class pvalidaarchivonov__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002O2", "SELECT Tran_ConsecutivoCC, Tran_RegionId, Tran_Id FROM ALM_TRANSACCION WHERE Tran_RegionId = ? and Tran_ConsecutivoCC = ? ORDER BY Tran_RegionId, Tran_ConsecutivoCC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P002O3", "SELECT Elem_Consecutivo, Tran_Id, TDet_Consecutivo FROM ALM_DETALLE_TRANSACCION WHERE Tran_Id = ? and Elem_Consecutivo = ? ORDER BY Tran_Id, Elem_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P002O4", "SELECT Invd_RegionalId, Invd_NumeroPlaca, Invd_Estado, Elem_Consecutivo FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Invd_NumeroPlaca = ? and Invd_RegionalId = ? ORDER BY Invd_NumeroPlaca, Invd_RegionalId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
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
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 9);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 30);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

