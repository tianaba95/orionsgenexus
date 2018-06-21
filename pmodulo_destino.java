/*
               File: PModulo_Destino
        Description: PModulo_Destino
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:8.42
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodulo_destino extends GXProcedure
{
   public pmodulo_destino( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodulo_destino.class ), "" );
   }

   public pmodulo_destino( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GXBaseCollection<com.orions2.SdtSDTModuloDestino_SDTModuloDestinoItem> executeUdp( long[] aP0 ,
                                                                                             long[] aP1 ,
                                                                                             String[] aP2 ,
                                                                                             String[] aP3 ,
                                                                                             String[] aP4 ,
                                                                                             String[] aP5 )
   {
      pmodulo_destino.this.AV12Tran_RegionId = aP0[0];
      this.aP0 = aP0;
      pmodulo_destino.this.AV8Tran_CentroCostoId = aP1[0];
      this.aP1 = aP1;
      pmodulo_destino.this.AV10Tran_CodigoMovimiento = aP2[0];
      this.aP2 = aP2;
      pmodulo_destino.this.AV11Tran_ModuloOrigen = aP3[0];
      this.aP3 = aP3;
      pmodulo_destino.this.AV15Tran_CodAlmaOrigen = aP4[0];
      this.aP4 = aP4;
      pmodulo_destino.this.AV9Tran_CodBodeOrigen = aP5[0];
      this.aP5 = aP5;
      pmodulo_destino.this.AV13SDTModuloDestino = aP6[0];
      this.aP6 = aP6;
      pmodulo_destino.this.aP6 = new GXBaseCollection[] {new GXBaseCollection<com.orions2.SdtSDTModuloDestino_SDTModuloDestinoItem>()};
      initialize();
      privateExecute();
      return aP6[0];
   }

   public void execute( long[] aP0 ,
                        long[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        GXBaseCollection<com.orions2.SdtSDTModuloDestino_SDTModuloDestinoItem>[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( long[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             GXBaseCollection<com.orions2.SdtSDTModuloDestino_SDTModuloDestinoItem>[] aP6 )
   {
      pmodulo_destino.this.AV12Tran_RegionId = aP0[0];
      this.aP0 = aP0;
      pmodulo_destino.this.AV8Tran_CentroCostoId = aP1[0];
      this.aP1 = aP1;
      pmodulo_destino.this.AV10Tran_CodigoMovimiento = aP2[0];
      this.aP2 = aP2;
      pmodulo_destino.this.AV11Tran_ModuloOrigen = aP3[0];
      this.aP3 = aP3;
      pmodulo_destino.this.AV15Tran_CodAlmaOrigen = aP4[0];
      this.aP4 = aP4;
      pmodulo_destino.this.AV9Tran_CodBodeOrigen = aP5[0];
      this.aP5 = aP5;
      pmodulo_destino.this.AV13SDTModuloDestino = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18GXLvl2 = (byte)(0) ;
      /* Using cursor P00202 */
      pr_default.execute(0, new Object[] {AV9Tran_CodBodeOrigen, new Long(AV12Tran_RegionId), new Long(AV8Tran_CentroCostoId), AV10Tran_CodigoMovimiento, AV11Tran_ModuloOrigen, AV15Tran_CodAlmaOrigen});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A434Mbod_Estado = P00202_A434Mbod_Estado[0] ;
         A64Mbod_BodOrigenCodigo = P00202_A64Mbod_BodOrigenCodigo[0] ;
         A342Mbod_AlmOrigenCodigo = P00202_A342Mbod_AlmOrigenCodigo[0] ;
         A364Mbod_AlmModOrigen = P00202_A364Mbod_AlmModOrigen[0] ;
         A61Mbod_TipoMovCodigo = P00202_A61Mbod_TipoMovCodigo[0] ;
         A63Mbod_CentCostoId = P00202_A63Mbod_CentCostoId[0] ;
         A62Mbod_RegionId = P00202_A62Mbod_RegionId[0] ;
         A368Mbod_AlmModDestino = P00202_A368Mbod_AlmModDestino[0] ;
         A60Mbod_Id = P00202_A60Mbod_Id[0] ;
         AV18GXLvl2 = (byte)(1) ;
         AV14SDTModuloDestinoItem = (com.orions2.SdtSDTModuloDestino_SDTModuloDestinoItem)new com.orions2.SdtSDTModuloDestino_SDTModuloDestinoItem(remoteHandle, context);
         AV14SDTModuloDestinoItem.setgxTv_SdtSDTModuloDestino_SDTModuloDestinoItem_Modulo( A368Mbod_AlmModDestino );
         AV13SDTModuloDestino.add(AV14SDTModuloDestinoItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV18GXLvl2 == 0 )
      {
         /* Execute user subroutine: 'RESTRICCIONES' */
         S111 ();
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
      /* 'RESTRICCIONES' Routine */
      /* Using cursor P00203 */
      pr_default.execute(1, new Object[] {new Long(AV12Tran_RegionId), AV10Tran_CodigoMovimiento, AV11Tran_ModuloOrigen, AV15Tran_CodAlmaOrigen, AV9Tran_CodBodeOrigen, AV10Tran_CodigoMovimiento, AV11Tran_ModuloOrigen, AV15Tran_CodAlmaOrigen, AV9Tran_CodBodeOrigen, new Long(AV12Tran_RegionId), new Long(AV8Tran_CentroCostoId), AV10Tran_CodigoMovimiento, AV11Tran_ModuloOrigen, AV9Tran_CodBodeOrigen, new Long(AV12Tran_RegionId), AV10Tran_CodigoMovimiento, AV11Tran_ModuloOrigen, AV9Tran_CodBodeOrigen, AV10Tran_CodigoMovimiento, AV11Tran_ModuloOrigen, AV9Tran_CodBodeOrigen, new Long(AV12Tran_RegionId), AV10Tran_CodigoMovimiento, AV11Tran_ModuloOrigen, AV15Tran_CodAlmaOrigen, AV10Tran_CodigoMovimiento, AV11Tran_ModuloOrigen, AV15Tran_CodAlmaOrigen, new Long(AV12Tran_RegionId), new Long(AV8Tran_CentroCostoId), AV10Tran_CodigoMovimiento, AV11Tran_ModuloOrigen, new Long(AV12Tran_RegionId), AV10Tran_CodigoMovimiento, AV11Tran_ModuloOrigen, AV10Tran_CodigoMovimiento, AV11Tran_ModuloOrigen});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A63Mbod_CentCostoId = P00203_A63Mbod_CentCostoId[0] ;
         A426Mbod_RegionCodigo = P00203_A426Mbod_RegionCodigo[0] ;
         n426Mbod_RegionCodigo = P00203_n426Mbod_RegionCodigo[0] ;
         A64Mbod_BodOrigenCodigo = P00203_A64Mbod_BodOrigenCodigo[0] ;
         A342Mbod_AlmOrigenCodigo = P00203_A342Mbod_AlmOrigenCodigo[0] ;
         A364Mbod_AlmModOrigen = P00203_A364Mbod_AlmModOrigen[0] ;
         A61Mbod_TipoMovCodigo = P00203_A61Mbod_TipoMovCodigo[0] ;
         A429Mbod_CentCostoCodigo = P00203_A429Mbod_CentCostoCodigo[0] ;
         n429Mbod_CentCostoCodigo = P00203_n429Mbod_CentCostoCodigo[0] ;
         A62Mbod_RegionId = P00203_A62Mbod_RegionId[0] ;
         A434Mbod_Estado = P00203_A434Mbod_Estado[0] ;
         A368Mbod_AlmModDestino = P00203_A368Mbod_AlmModDestino[0] ;
         A60Mbod_Id = P00203_A60Mbod_Id[0] ;
         A429Mbod_CentCostoCodigo = P00203_A429Mbod_CentCostoCodigo[0] ;
         n429Mbod_CentCostoCodigo = P00203_n429Mbod_CentCostoCodigo[0] ;
         A426Mbod_RegionCodigo = P00203_A426Mbod_RegionCodigo[0] ;
         n426Mbod_RegionCodigo = P00203_n426Mbod_RegionCodigo[0] ;
         AV14SDTModuloDestinoItem = (com.orions2.SdtSDTModuloDestino_SDTModuloDestinoItem)new com.orions2.SdtSDTModuloDestino_SDTModuloDestinoItem(remoteHandle, context);
         AV14SDTModuloDestinoItem.setgxTv_SdtSDTModuloDestino_SDTModuloDestinoItem_Modulo( A368Mbod_AlmModDestino );
         AV13SDTModuloDestino.add(AV14SDTModuloDestinoItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmodulo_destino.this.AV12Tran_RegionId;
      this.aP1[0] = pmodulo_destino.this.AV8Tran_CentroCostoId;
      this.aP2[0] = pmodulo_destino.this.AV10Tran_CodigoMovimiento;
      this.aP3[0] = pmodulo_destino.this.AV11Tran_ModuloOrigen;
      this.aP4[0] = pmodulo_destino.this.AV15Tran_CodAlmaOrigen;
      this.aP5[0] = pmodulo_destino.this.AV9Tran_CodBodeOrigen;
      this.aP6[0] = pmodulo_destino.this.AV13SDTModuloDestino;
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
      P00202_A434Mbod_Estado = new String[] {""} ;
      P00202_A64Mbod_BodOrigenCodigo = new String[] {""} ;
      P00202_A342Mbod_AlmOrigenCodigo = new String[] {""} ;
      P00202_A364Mbod_AlmModOrigen = new String[] {""} ;
      P00202_A61Mbod_TipoMovCodigo = new String[] {""} ;
      P00202_A63Mbod_CentCostoId = new long[1] ;
      P00202_A62Mbod_RegionId = new long[1] ;
      P00202_A368Mbod_AlmModDestino = new String[] {""} ;
      P00202_A60Mbod_Id = new long[1] ;
      A434Mbod_Estado = "" ;
      A64Mbod_BodOrigenCodigo = "" ;
      A342Mbod_AlmOrigenCodigo = "" ;
      A364Mbod_AlmModOrigen = "" ;
      A61Mbod_TipoMovCodigo = "" ;
      A368Mbod_AlmModDestino = "" ;
      AV14SDTModuloDestinoItem = new com.orions2.SdtSDTModuloDestino_SDTModuloDestinoItem(remoteHandle, context);
      P00203_A63Mbod_CentCostoId = new long[1] ;
      P00203_A426Mbod_RegionCodigo = new short[1] ;
      P00203_n426Mbod_RegionCodigo = new boolean[] {false} ;
      P00203_A64Mbod_BodOrigenCodigo = new String[] {""} ;
      P00203_A342Mbod_AlmOrigenCodigo = new String[] {""} ;
      P00203_A364Mbod_AlmModOrigen = new String[] {""} ;
      P00203_A61Mbod_TipoMovCodigo = new String[] {""} ;
      P00203_A429Mbod_CentCostoCodigo = new String[] {""} ;
      P00203_n429Mbod_CentCostoCodigo = new boolean[] {false} ;
      P00203_A62Mbod_RegionId = new long[1] ;
      P00203_A434Mbod_Estado = new String[] {""} ;
      P00203_A368Mbod_AlmModDestino = new String[] {""} ;
      P00203_A60Mbod_Id = new long[1] ;
      A429Mbod_CentCostoCodigo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.pmodulo_destino__default(),
         new Object[] {
             new Object[] {
            P00202_A434Mbod_Estado, P00202_A64Mbod_BodOrigenCodigo, P00202_A342Mbod_AlmOrigenCodigo, P00202_A364Mbod_AlmModOrigen, P00202_A61Mbod_TipoMovCodigo, P00202_A63Mbod_CentCostoId, P00202_A62Mbod_RegionId, P00202_A368Mbod_AlmModDestino, P00202_A60Mbod_Id
            }
            , new Object[] {
            P00203_A63Mbod_CentCostoId, P00203_A426Mbod_RegionCodigo, P00203_n426Mbod_RegionCodigo, P00203_A64Mbod_BodOrigenCodigo, P00203_A342Mbod_AlmOrigenCodigo, P00203_A364Mbod_AlmModOrigen, P00203_A61Mbod_TipoMovCodigo, P00203_A429Mbod_CentCostoCodigo, P00203_n429Mbod_CentCostoCodigo, P00203_A62Mbod_RegionId,
            P00203_A434Mbod_Estado, P00203_A368Mbod_AlmModDestino, P00203_A60Mbod_Id
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18GXLvl2 ;
   private short A426Mbod_RegionCodigo ;
   private short Gx_err ;
   private long AV12Tran_RegionId ;
   private long AV8Tran_CentroCostoId ;
   private long A63Mbod_CentCostoId ;
   private long A62Mbod_RegionId ;
   private long A60Mbod_Id ;
   private String scmdbuf ;
   private String A434Mbod_Estado ;
   private boolean returnInSub ;
   private boolean n426Mbod_RegionCodigo ;
   private boolean n429Mbod_CentCostoCodigo ;
   private String AV10Tran_CodigoMovimiento ;
   private String AV11Tran_ModuloOrigen ;
   private String AV15Tran_CodAlmaOrigen ;
   private String AV9Tran_CodBodeOrigen ;
   private String A64Mbod_BodOrigenCodigo ;
   private String A342Mbod_AlmOrigenCodigo ;
   private String A364Mbod_AlmModOrigen ;
   private String A61Mbod_TipoMovCodigo ;
   private String A368Mbod_AlmModDestino ;
   private String A429Mbod_CentCostoCodigo ;
   private long[] aP0 ;
   private long[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private GXBaseCollection<com.orions2.SdtSDTModuloDestino_SDTModuloDestinoItem>[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P00202_A434Mbod_Estado ;
   private String[] P00202_A64Mbod_BodOrigenCodigo ;
   private String[] P00202_A342Mbod_AlmOrigenCodigo ;
   private String[] P00202_A364Mbod_AlmModOrigen ;
   private String[] P00202_A61Mbod_TipoMovCodigo ;
   private long[] P00202_A63Mbod_CentCostoId ;
   private long[] P00202_A62Mbod_RegionId ;
   private String[] P00202_A368Mbod_AlmModDestino ;
   private long[] P00202_A60Mbod_Id ;
   private long[] P00203_A63Mbod_CentCostoId ;
   private short[] P00203_A426Mbod_RegionCodigo ;
   private boolean[] P00203_n426Mbod_RegionCodigo ;
   private String[] P00203_A64Mbod_BodOrigenCodigo ;
   private String[] P00203_A342Mbod_AlmOrigenCodigo ;
   private String[] P00203_A364Mbod_AlmModOrigen ;
   private String[] P00203_A61Mbod_TipoMovCodigo ;
   private String[] P00203_A429Mbod_CentCostoCodigo ;
   private boolean[] P00203_n429Mbod_CentCostoCodigo ;
   private long[] P00203_A62Mbod_RegionId ;
   private String[] P00203_A434Mbod_Estado ;
   private String[] P00203_A368Mbod_AlmModDestino ;
   private long[] P00203_A60Mbod_Id ;
   private GXBaseCollection<com.orions2.SdtSDTModuloDestino_SDTModuloDestinoItem> AV13SDTModuloDestino ;
   private com.orions2.SdtSDTModuloDestino_SDTModuloDestinoItem AV14SDTModuloDestinoItem ;
}

final  class pmodulo_destino__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00202", "SELECT Mbod_Estado, Mbod_BodOrigenCodigo, Mbod_AlmOrigenCodigo, Mbod_AlmModOrigen, Mbod_TipoMovCodigo, Mbod_CentCostoId, Mbod_RegionId, Mbod_AlmModDestino, Mbod_Id FROM ALM_RESTRICCIONES WHERE (Mbod_BodOrigenCodigo = ?) AND (Mbod_RegionId = ?) AND (Mbod_CentCostoId = ?) AND (Mbod_TipoMovCodigo = ?) AND (Mbod_AlmModOrigen = ?) AND (Mbod_AlmOrigenCodigo = ?) AND (Mbod_Estado = 'A') ORDER BY Mbod_BodOrigenCodigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P00203", "SELECT T1.Mbod_CentCostoId AS Mbod_CentCostoId, T3.Regi_Cod AS Mbod_RegionCodigo, T1.Mbod_BodOrigenCodigo, T1.Mbod_AlmOrigenCodigo, T1.Mbod_AlmModOrigen, T1.Mbod_TipoMovCodigo, T2.Cent_Codigo AS Mbod_CentCostoCodigo, T1.Mbod_RegionId AS Mbod_RegionId, T1.Mbod_Estado, T1.Mbod_AlmModDestino, T1.Mbod_Id FROM ((ALM_RESTRICCIONES T1 INNER JOIN GEN_CENTROCOSTO T2 ON T2.Cent_Id = T1.Mbod_CentCostoId) INNER JOIN GEN_REGIONAL T3 ON T3.Regi_Id = T1.Mbod_RegionId) WHERE (( T1.Mbod_RegionId = ? and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = ? and T1.Mbod_BodOrigenCodigo = ?) or ( T3.Regi_Cod = 0 and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = ? and T1.Mbod_BodOrigenCodigo = ?) or ( T1.Mbod_RegionId = ? and T1.Mbod_CentCostoId = ? and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = '00' and T1.Mbod_BodOrigenCodigo = ?) or ( T1.Mbod_RegionId = ? and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = '00' and T1.Mbod_BodOrigenCodigo = ?) or ( T3.Regi_Cod = 0 and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = '00' and T1.Mbod_BodOrigenCodigo = ?) or ( T1.Mbod_RegionId = ? and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = ? and T1.Mbod_BodOrigenCodigo = '000') or ( T3.Regi_Cod = 0 and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = ? and T1.Mbod_BodOrigenCodigo = '000') or ( T1.Mbod_RegionId = ? and T1.Mbod_CentCostoId = ? and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = '00' and T1.Mbod_BodOrigenCodigo = '000') or ( T1.Mbod_RegionId = ? and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = '00' and T1.Mbod_BodOrigenCodigo = '000') or ( T3.Regi_Cod = 0 and T2.Cent_Codigo = '000000' and T1.Mbod_TipoMovCodigo = ? and T1.Mbod_AlmModOrigen = ? and T1.Mbod_AlmOrigenCodigo = '00' and T1.Mbod_BodOrigenCodigo = '000')) AND (T1.Mbod_Estado = 'A') ORDER BY T1.Mbod_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((long[]) buf[5])[0] = rslt.getLong(6) ;
               ((long[]) buf[6])[0] = rslt.getLong(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((long[]) buf[8])[0] = rslt.getLong(9) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(8) ;
               ((String[]) buf[10])[0] = rslt.getString(9, 1) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(10) ;
               ((long[]) buf[12])[0] = rslt.getLong(11) ;
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
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 3);
               stmt.setVarchar(3, (String)parms[2], 8);
               stmt.setVarchar(4, (String)parms[3], 2);
               stmt.setVarchar(5, (String)parms[4], 3);
               stmt.setVarchar(6, (String)parms[5], 3);
               stmt.setVarchar(7, (String)parms[6], 8);
               stmt.setVarchar(8, (String)parms[7], 2);
               stmt.setVarchar(9, (String)parms[8], 3);
               stmt.setLong(10, ((Number) parms[9]).longValue());
               stmt.setLong(11, ((Number) parms[10]).longValue());
               stmt.setVarchar(12, (String)parms[11], 3);
               stmt.setVarchar(13, (String)parms[12], 8);
               stmt.setVarchar(14, (String)parms[13], 3);
               stmt.setLong(15, ((Number) parms[14]).longValue());
               stmt.setVarchar(16, (String)parms[15], 3);
               stmt.setVarchar(17, (String)parms[16], 8);
               stmt.setVarchar(18, (String)parms[17], 3);
               stmt.setVarchar(19, (String)parms[18], 3);
               stmt.setVarchar(20, (String)parms[19], 8);
               stmt.setVarchar(21, (String)parms[20], 3);
               stmt.setLong(22, ((Number) parms[21]).longValue());
               stmt.setVarchar(23, (String)parms[22], 3);
               stmt.setVarchar(24, (String)parms[23], 8);
               stmt.setVarchar(25, (String)parms[24], 2);
               stmt.setVarchar(26, (String)parms[25], 3);
               stmt.setVarchar(27, (String)parms[26], 8);
               stmt.setVarchar(28, (String)parms[27], 2);
               stmt.setLong(29, ((Number) parms[28]).longValue());
               stmt.setLong(30, ((Number) parms[29]).longValue());
               stmt.setVarchar(31, (String)parms[30], 3);
               stmt.setVarchar(32, (String)parms[31], 8);
               stmt.setLong(33, ((Number) parms[32]).longValue());
               stmt.setVarchar(34, (String)parms[33], 3);
               stmt.setVarchar(35, (String)parms[34], 8);
               stmt.setVarchar(36, (String)parms[35], 3);
               stmt.setVarchar(37, (String)parms[36], 8);
               return;
      }
   }

}

