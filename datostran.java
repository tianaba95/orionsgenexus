/*
               File: DatosTran
        Description: Datos Tran
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:2.14
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class datostran extends GXProcedure
{
   public datostran( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( datostran.class ), "" );
   }

   public datostran( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long[] aP0 ,
                             long[] aP1 ,
                             long[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             long[] aP6 ,
                             long[] aP7 ,
                             String[] aP8 )
   {
      datostran.this.AV12Tran_Id = aP0[0];
      this.aP0 = aP0;
      datostran.this.AV13Regi_Id = aP1[0];
      this.aP1 = aP1;
      datostran.this.AV11Cent_Id = aP2[0];
      this.aP2 = aP2;
      datostran.this.AV9Alma_Modulo = aP3[0];
      this.aP3 = aP3;
      datostran.this.AV8Alma_Codigo = aP4[0];
      this.aP4 = aP4;
      datostran.this.AV10Bode_Codigo = aP5[0];
      this.aP5 = aP5;
      datostran.this.AV14Tran_ConsecutivoCC = aP6[0];
      this.aP6 = aP6;
      datostran.this.AV15Tran_IdCuentadanteOrigen = aP7[0];
      this.aP7 = aP7;
      datostran.this.AV16Tran_DescripcionMovimiento = aP8[0];
      this.aP8 = aP8;
      datostran.this.AV17Tran_Estado = aP9[0];
      this.aP9 = aP9;
      datostran.this.aP9 = new String[] {""};
      initialize();
      privateExecute();
      return aP9[0];
   }

   public void execute( long[] aP0 ,
                        long[] aP1 ,
                        long[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        long[] aP6 ,
                        long[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( long[] aP0 ,
                             long[] aP1 ,
                             long[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             long[] aP6 ,
                             long[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 )
   {
      datostran.this.AV12Tran_Id = aP0[0];
      this.aP0 = aP0;
      datostran.this.AV13Regi_Id = aP1[0];
      this.aP1 = aP1;
      datostran.this.AV11Cent_Id = aP2[0];
      this.aP2 = aP2;
      datostran.this.AV9Alma_Modulo = aP3[0];
      this.aP3 = aP3;
      datostran.this.AV8Alma_Codigo = aP4[0];
      this.aP4 = aP4;
      datostran.this.AV10Bode_Codigo = aP5[0];
      this.aP5 = aP5;
      datostran.this.AV14Tran_ConsecutivoCC = aP6[0];
      this.aP6 = aP6;
      datostran.this.AV15Tran_IdCuentadanteOrigen = aP7[0];
      this.aP7 = aP7;
      datostran.this.AV16Tran_DescripcionMovimiento = aP8[0];
      this.aP8 = aP8;
      datostran.this.AV17Tran_Estado = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13Regi_Id = 0 ;
      AV11Cent_Id = 0 ;
      AV8Alma_Codigo = "" ;
      AV9Alma_Modulo = "" ;
      AV10Bode_Codigo = "" ;
      AV14Tran_ConsecutivoCC = 0 ;
      AV15Tran_IdCuentadanteOrigen = 0 ;
      /* Using cursor P001F2 */
      pr_default.execute(0, new Object[] {new Long(AV12Tran_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A49Tran_CodigoMovimiento = P001F2_A49Tran_CodigoMovimiento[0] ;
         A46Tran_Id = P001F2_A46Tran_Id[0] ;
         A57Tran_RegionId = P001F2_A57Tran_RegionId[0] ;
         n57Tran_RegionId = P001F2_n57Tran_RegionId[0] ;
         A48Tran_CentroCostoId = P001F2_A48Tran_CentroCostoId[0] ;
         A110Tran_ModuloOrigen = P001F2_A110Tran_ModuloOrigen[0] ;
         A109Tran_CodAlmaOrigen = P001F2_A109Tran_CodAlmaOrigen[0] ;
         A112Tran_CodBodeOrigen = P001F2_A112Tran_CodBodeOrigen[0] ;
         A513Tran_ConsecutivoCC = P001F2_A513Tran_ConsecutivoCC[0] ;
         n513Tran_ConsecutivoCC = P001F2_n513Tran_ConsecutivoCC[0] ;
         A51Tran_IdCuentadanteOrigen = P001F2_A51Tran_IdCuentadanteOrigen[0] ;
         n51Tran_IdCuentadanteOrigen = P001F2_n51Tran_IdCuentadanteOrigen[0] ;
         A381Tran_DescripcionMovimiento = P001F2_A381Tran_DescripcionMovimiento[0] ;
         n381Tran_DescripcionMovimiento = P001F2_n381Tran_DescripcionMovimiento[0] ;
         A58Tran_Estado = P001F2_A58Tran_Estado[0] ;
         n58Tran_Estado = P001F2_n58Tran_Estado[0] ;
         A381Tran_DescripcionMovimiento = P001F2_A381Tran_DescripcionMovimiento[0] ;
         n381Tran_DescripcionMovimiento = P001F2_n381Tran_DescripcionMovimiento[0] ;
         AV13Regi_Id = A57Tran_RegionId ;
         AV11Cent_Id = A48Tran_CentroCostoId ;
         AV9Alma_Modulo = A110Tran_ModuloOrigen ;
         AV8Alma_Codigo = A109Tran_CodAlmaOrigen ;
         AV10Bode_Codigo = A112Tran_CodBodeOrigen ;
         AV14Tran_ConsecutivoCC = A513Tran_ConsecutivoCC ;
         AV15Tran_IdCuentadanteOrigen = A51Tran_IdCuentadanteOrigen ;
         AV16Tran_DescripcionMovimiento = A381Tran_DescripcionMovimiento ;
         AV17Tran_Estado = A58Tran_Estado ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = datostran.this.AV12Tran_Id;
      this.aP1[0] = datostran.this.AV13Regi_Id;
      this.aP2[0] = datostran.this.AV11Cent_Id;
      this.aP3[0] = datostran.this.AV9Alma_Modulo;
      this.aP4[0] = datostran.this.AV8Alma_Codigo;
      this.aP5[0] = datostran.this.AV10Bode_Codigo;
      this.aP6[0] = datostran.this.AV14Tran_ConsecutivoCC;
      this.aP7[0] = datostran.this.AV15Tran_IdCuentadanteOrigen;
      this.aP8[0] = datostran.this.AV16Tran_DescripcionMovimiento;
      this.aP9[0] = datostran.this.AV17Tran_Estado;
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
      P001F2_A49Tran_CodigoMovimiento = new String[] {""} ;
      P001F2_A46Tran_Id = new long[1] ;
      P001F2_A57Tran_RegionId = new long[1] ;
      P001F2_n57Tran_RegionId = new boolean[] {false} ;
      P001F2_A48Tran_CentroCostoId = new long[1] ;
      P001F2_A110Tran_ModuloOrigen = new String[] {""} ;
      P001F2_A109Tran_CodAlmaOrigen = new String[] {""} ;
      P001F2_A112Tran_CodBodeOrigen = new String[] {""} ;
      P001F2_A513Tran_ConsecutivoCC = new long[1] ;
      P001F2_n513Tran_ConsecutivoCC = new boolean[] {false} ;
      P001F2_A51Tran_IdCuentadanteOrigen = new long[1] ;
      P001F2_n51Tran_IdCuentadanteOrigen = new boolean[] {false} ;
      P001F2_A381Tran_DescripcionMovimiento = new String[] {""} ;
      P001F2_n381Tran_DescripcionMovimiento = new boolean[] {false} ;
      P001F2_A58Tran_Estado = new String[] {""} ;
      P001F2_n58Tran_Estado = new boolean[] {false} ;
      A49Tran_CodigoMovimiento = "" ;
      A110Tran_ModuloOrigen = "" ;
      A109Tran_CodAlmaOrigen = "" ;
      A112Tran_CodBodeOrigen = "" ;
      A381Tran_DescripcionMovimiento = "" ;
      A58Tran_Estado = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.datostran__default(),
         new Object[] {
             new Object[] {
            P001F2_A49Tran_CodigoMovimiento, P001F2_A46Tran_Id, P001F2_A57Tran_RegionId, P001F2_n57Tran_RegionId, P001F2_A48Tran_CentroCostoId, P001F2_A110Tran_ModuloOrigen, P001F2_A109Tran_CodAlmaOrigen, P001F2_A112Tran_CodBodeOrigen, P001F2_A513Tran_ConsecutivoCC, P001F2_n513Tran_ConsecutivoCC,
            P001F2_A51Tran_IdCuentadanteOrigen, P001F2_n51Tran_IdCuentadanteOrigen, P001F2_A381Tran_DescripcionMovimiento, P001F2_n381Tran_DescripcionMovimiento, P001F2_A58Tran_Estado, P001F2_n58Tran_Estado
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV12Tran_Id ;
   private long AV13Regi_Id ;
   private long AV11Cent_Id ;
   private long AV14Tran_ConsecutivoCC ;
   private long AV15Tran_IdCuentadanteOrigen ;
   private long A46Tran_Id ;
   private long A57Tran_RegionId ;
   private long A48Tran_CentroCostoId ;
   private long A513Tran_ConsecutivoCC ;
   private long A51Tran_IdCuentadanteOrigen ;
   private String AV17Tran_Estado ;
   private String scmdbuf ;
   private String A58Tran_Estado ;
   private boolean n57Tran_RegionId ;
   private boolean n513Tran_ConsecutivoCC ;
   private boolean n51Tran_IdCuentadanteOrigen ;
   private boolean n381Tran_DescripcionMovimiento ;
   private boolean n58Tran_Estado ;
   private String AV9Alma_Modulo ;
   private String AV8Alma_Codigo ;
   private String AV10Bode_Codigo ;
   private String AV16Tran_DescripcionMovimiento ;
   private String A49Tran_CodigoMovimiento ;
   private String A110Tran_ModuloOrigen ;
   private String A109Tran_CodAlmaOrigen ;
   private String A112Tran_CodBodeOrigen ;
   private String A381Tran_DescripcionMovimiento ;
   private long[] aP0 ;
   private long[] aP1 ;
   private long[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private long[] aP6 ;
   private long[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P001F2_A49Tran_CodigoMovimiento ;
   private long[] P001F2_A46Tran_Id ;
   private long[] P001F2_A57Tran_RegionId ;
   private boolean[] P001F2_n57Tran_RegionId ;
   private long[] P001F2_A48Tran_CentroCostoId ;
   private String[] P001F2_A110Tran_ModuloOrigen ;
   private String[] P001F2_A109Tran_CodAlmaOrigen ;
   private String[] P001F2_A112Tran_CodBodeOrigen ;
   private long[] P001F2_A513Tran_ConsecutivoCC ;
   private boolean[] P001F2_n513Tran_ConsecutivoCC ;
   private long[] P001F2_A51Tran_IdCuentadanteOrigen ;
   private boolean[] P001F2_n51Tran_IdCuentadanteOrigen ;
   private String[] P001F2_A381Tran_DescripcionMovimiento ;
   private boolean[] P001F2_n381Tran_DescripcionMovimiento ;
   private String[] P001F2_A58Tran_Estado ;
   private boolean[] P001F2_n58Tran_Estado ;
}

final  class datostran__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001F2", "SELECT T1.Tran_CodigoMovimiento AS Tran_CodigoMovimiento, T1.Tran_Id, T1.Tran_RegionId, T1.Tran_CentroCostoId, T1.Tran_ModuloOrigen, T1.Tran_CodAlmaOrigen, T1.Tran_CodBodeOrigen, T1.Tran_ConsecutivoCC, T1.Tran_IdCuentadanteOrigen, T2.Tpmo_Descripcion AS Tran_DescripcionMovimiento, T1.Tran_Estado FROM (ALM_TRANSACCION T1 INNER JOIN ALM_TIPO_MOVIMIENTO T2 ON T2.Tpmo_Codigo = T1.Tran_CodigoMovimiento) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((long[]) buf[8])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 1) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
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
      }
   }

}

