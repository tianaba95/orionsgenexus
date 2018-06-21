/*
               File: DPRatificar
        Description: DPRatificar
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:55.48
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpratificar extends GXProcedure
{
   public dpratificar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpratificar.class ), "" );
   }

   public dpratificar( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public com.orions2.SdtSDTRatificar executeUdp( long aP0 )
   {
      dpratificar.this.AV5Tran_Id = aP0;
      dpratificar.this.aP1 = aP1;
      dpratificar.this.aP1 = new com.orions2.SdtSDTRatificar[] {new com.orions2.SdtSDTRatificar()};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( long aP0 ,
                        com.orions2.SdtSDTRatificar[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( long aP0 ,
                             com.orions2.SdtSDTRatificar[] aP1 )
   {
      dpratificar.this.AV5Tran_Id = aP0;
      dpratificar.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00092 */
      pr_default.execute(0, new Object[] {new Long(AV5Tran_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A57Tran_RegionId = P00092_A57Tran_RegionId[0] ;
         n57Tran_RegionId = P00092_n57Tran_RegionId[0] ;
         A49Tran_CodigoMovimiento = P00092_A49Tran_CodigoMovimiento[0] ;
         A46Tran_Id = P00092_A46Tran_Id[0] ;
         A513Tran_ConsecutivoCC = P00092_A513Tran_ConsecutivoCC[0] ;
         n513Tran_ConsecutivoCC = P00092_n513Tran_ConsecutivoCC[0] ;
         A421Tran_RegionCodigo = P00092_A421Tran_RegionCodigo[0] ;
         n421Tran_RegionCodigo = P00092_n421Tran_RegionCodigo[0] ;
         A594Tran_RegionAbrev = P00092_A594Tran_RegionAbrev[0] ;
         n594Tran_RegionAbrev = P00092_n594Tran_RegionAbrev[0] ;
         A499Tran_CodTipoElemento = P00092_A499Tran_CodTipoElemento[0] ;
         n499Tran_CodTipoElemento = P00092_n499Tran_CodTipoElemento[0] ;
         A421Tran_RegionCodigo = P00092_A421Tran_RegionCodigo[0] ;
         n421Tran_RegionCodigo = P00092_n421Tran_RegionCodigo[0] ;
         A594Tran_RegionAbrev = P00092_A594Tran_RegionAbrev[0] ;
         n594Tran_RegionAbrev = P00092_n594Tran_RegionAbrev[0] ;
         A499Tran_CodTipoElemento = P00092_A499Tran_CodTipoElemento[0] ;
         n499Tran_CodTipoElemento = P00092_n499Tran_CodTipoElemento[0] ;
         Gxm1sdtratificar.setgxTv_SdtSDTRatificar_Tranid( A46Tran_Id );
         Gxm1sdtratificar.setgxTv_SdtSDTRatificar_Tranconsecutivocc( A513Tran_ConsecutivoCC );
         Gxm1sdtratificar.setgxTv_SdtSDTRatificar_Tranregioncodigo( A421Tran_RegionCodigo );
         Gxm1sdtratificar.setgxTv_SdtSDTRatificar_Tranregionabrev( A594Tran_RegionAbrev );
         Gxm1sdtratificar.setgxTv_SdtSDTRatificar_Trancodtipoelemento( A499Tran_CodTipoElemento );
         /* Using cursor P00093 */
         pr_default.execute(1, new Object[] {new Long(A46Tran_Id)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A490TDet_PlacaNumero = P00093_A490TDet_PlacaNumero[0] ;
            n490TDet_PlacaNumero = P00093_n490TDet_PlacaNumero[0] ;
            A69TDet_Consecutivo = P00093_A69TDet_Consecutivo[0] ;
            Gxm2sdtratificar_atributos = (com.orions2.SdtSDTRatificar_ATRIBUTOSItem)new com.orions2.SdtSDTRatificar_ATRIBUTOSItem(remoteHandle, context);
            Gxm1sdtratificar.getgxTv_SdtSDTRatificar_Atributos().add(Gxm2sdtratificar_atributos, 0);
            Gxm2sdtratificar_atributos.setgxTv_SdtSDTRatificar_ATRIBUTOSItem_Tdetplacanumero( A490TDet_PlacaNumero );
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = dpratificar.this.Gxm1sdtratificar;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm1sdtratificar = new com.orions2.SdtSDTRatificar(remoteHandle, context);
      scmdbuf = "" ;
      P00092_A57Tran_RegionId = new long[1] ;
      P00092_n57Tran_RegionId = new boolean[] {false} ;
      P00092_A49Tran_CodigoMovimiento = new String[] {""} ;
      P00092_A46Tran_Id = new long[1] ;
      P00092_A513Tran_ConsecutivoCC = new long[1] ;
      P00092_n513Tran_ConsecutivoCC = new boolean[] {false} ;
      P00092_A421Tran_RegionCodigo = new short[1] ;
      P00092_n421Tran_RegionCodigo = new boolean[] {false} ;
      P00092_A594Tran_RegionAbrev = new String[] {""} ;
      P00092_n594Tran_RegionAbrev = new boolean[] {false} ;
      P00092_A499Tran_CodTipoElemento = new long[1] ;
      P00092_n499Tran_CodTipoElemento = new boolean[] {false} ;
      A49Tran_CodigoMovimiento = "" ;
      A594Tran_RegionAbrev = "" ;
      P00093_A46Tran_Id = new long[1] ;
      P00093_A490TDet_PlacaNumero = new String[] {""} ;
      P00093_n490TDet_PlacaNumero = new boolean[] {false} ;
      P00093_A69TDet_Consecutivo = new long[1] ;
      A490TDet_PlacaNumero = "" ;
      Gxm2sdtratificar_atributos = new com.orions2.SdtSDTRatificar_ATRIBUTOSItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.dpratificar__default(),
         new Object[] {
             new Object[] {
            P00092_A57Tran_RegionId, P00092_n57Tran_RegionId, P00092_A49Tran_CodigoMovimiento, P00092_A46Tran_Id, P00092_A513Tran_ConsecutivoCC, P00092_n513Tran_ConsecutivoCC, P00092_A421Tran_RegionCodigo, P00092_n421Tran_RegionCodigo, P00092_A594Tran_RegionAbrev, P00092_n594Tran_RegionAbrev,
            P00092_A499Tran_CodTipoElemento, P00092_n499Tran_CodTipoElemento
            }
            , new Object[] {
            P00093_A46Tran_Id, P00093_A490TDet_PlacaNumero, P00093_n490TDet_PlacaNumero, P00093_A69TDet_Consecutivo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A421Tran_RegionCodigo ;
   private short Gx_err ;
   private long AV5Tran_Id ;
   private long A57Tran_RegionId ;
   private long A46Tran_Id ;
   private long A513Tran_ConsecutivoCC ;
   private long A499Tran_CodTipoElemento ;
   private long A69TDet_Consecutivo ;
   private String scmdbuf ;
   private boolean n57Tran_RegionId ;
   private boolean n513Tran_ConsecutivoCC ;
   private boolean n421Tran_RegionCodigo ;
   private boolean n594Tran_RegionAbrev ;
   private boolean n499Tran_CodTipoElemento ;
   private boolean n490TDet_PlacaNumero ;
   private String A49Tran_CodigoMovimiento ;
   private String A594Tran_RegionAbrev ;
   private String A490TDet_PlacaNumero ;
   private com.orions2.SdtSDTRatificar[] aP1 ;
   private IDataStoreProvider pr_default ;
   private long[] P00092_A57Tran_RegionId ;
   private boolean[] P00092_n57Tran_RegionId ;
   private String[] P00092_A49Tran_CodigoMovimiento ;
   private long[] P00092_A46Tran_Id ;
   private long[] P00092_A513Tran_ConsecutivoCC ;
   private boolean[] P00092_n513Tran_ConsecutivoCC ;
   private short[] P00092_A421Tran_RegionCodigo ;
   private boolean[] P00092_n421Tran_RegionCodigo ;
   private String[] P00092_A594Tran_RegionAbrev ;
   private boolean[] P00092_n594Tran_RegionAbrev ;
   private long[] P00092_A499Tran_CodTipoElemento ;
   private boolean[] P00092_n499Tran_CodTipoElemento ;
   private long[] P00093_A46Tran_Id ;
   private String[] P00093_A490TDet_PlacaNumero ;
   private boolean[] P00093_n490TDet_PlacaNumero ;
   private long[] P00093_A69TDet_Consecutivo ;
   private com.orions2.SdtSDTRatificar Gxm1sdtratificar ;
   private com.orions2.SdtSDTRatificar_ATRIBUTOSItem Gxm2sdtratificar_atributos ;
}

final  class dpratificar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00092", "SELECT T1.Tran_RegionId AS Tran_RegionId, T1.Tran_CodigoMovimiento AS Tran_CodigoMovimiento, T1.Tran_Id, T1.Tran_ConsecutivoCC, T2.Regi_Cod AS Tran_RegionCodigo, T2.Regi_Abrev AS Tran_RegionAbrev, T3.Tipo_Codigo AS Tran_CodTipoElemento FROM ((ALM_TRANSACCION T1 LEFT JOIN GEN_REGIONAL T2 ON T2.Regi_Id = T1.Tran_RegionId) INNER JOIN ALM_TIPO_MOVIMIENTO T3 ON T3.Tpmo_Codigo = T1.Tran_CodigoMovimiento) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P00093", "SELECT Tran_Id, TDet_PlacaNumero, TDet_Consecutivo FROM ALM_DETALLE_TRANSACCION WHERE Tran_Id = ? ORDER BY Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
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
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

