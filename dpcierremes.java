/*
               File: DPCierreMes
        Description: DPCierre Mes
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:54.73
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpcierremes extends GXProcedure
{
   public dpcierremes( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpcierremes.class ), "" );
   }

   public dpcierremes( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public com.orions2.SdtSDTCierreMes executeUdp( long aP0 )
   {
      dpcierremes.this.AV5Tran_Id = aP0;
      dpcierremes.this.aP1 = aP1;
      dpcierremes.this.aP1 = new com.orions2.SdtSDTCierreMes[] {new com.orions2.SdtSDTCierreMes()};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( long aP0 ,
                        com.orions2.SdtSDTCierreMes[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( long aP0 ,
                             com.orions2.SdtSDTCierreMes[] aP1 )
   {
      dpcierremes.this.AV5Tran_Id = aP0;
      dpcierremes.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00042 */
      pr_default.execute(0, new Object[] {new Long(AV5Tran_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A48Tran_CentroCostoId = P00042_A48Tran_CentroCostoId[0] ;
         A57Tran_RegionId = P00042_A57Tran_RegionId[0] ;
         n57Tran_RegionId = P00042_n57Tran_RegionId[0] ;
         A46Tran_Id = P00042_A46Tran_Id[0] ;
         A594Tran_RegionAbrev = P00042_A594Tran_RegionAbrev[0] ;
         n594Tran_RegionAbrev = P00042_n594Tran_RegionAbrev[0] ;
         A421Tran_RegionCodigo = P00042_A421Tran_RegionCodigo[0] ;
         n421Tran_RegionCodigo = P00042_n421Tran_RegionCodigo[0] ;
         A419Tran_CentroCostoCodigo = P00042_A419Tran_CentroCostoCodigo[0] ;
         n419Tran_CentroCostoCodigo = P00042_n419Tran_CentroCostoCodigo[0] ;
         A110Tran_ModuloOrigen = P00042_A110Tran_ModuloOrigen[0] ;
         A109Tran_CodAlmaOrigen = P00042_A109Tran_CodAlmaOrigen[0] ;
         A112Tran_CodBodeOrigen = P00042_A112Tran_CodBodeOrigen[0] ;
         A385Tran_ModuloDestino = P00042_A385Tran_ModuloDestino[0] ;
         A111Tran_CodAlmaDestino = P00042_A111Tran_CodAlmaDestino[0] ;
         A387Tran_CodBodeDestino = P00042_A387Tran_CodBodeDestino[0] ;
         A419Tran_CentroCostoCodigo = P00042_A419Tran_CentroCostoCodigo[0] ;
         n419Tran_CentroCostoCodigo = P00042_n419Tran_CentroCostoCodigo[0] ;
         A594Tran_RegionAbrev = P00042_A594Tran_RegionAbrev[0] ;
         n594Tran_RegionAbrev = P00042_n594Tran_RegionAbrev[0] ;
         A421Tran_RegionCodigo = P00042_A421Tran_RegionCodigo[0] ;
         n421Tran_RegionCodigo = P00042_n421Tran_RegionCodigo[0] ;
         GXt_dtime1 = GXutil.resetTime( Gx_date );
         Gxm1sdtcierremes.setgxTv_SdtSDTCierreMes_Tranfecharegistro( GXt_dtime1 );
         Gxm1sdtcierremes.setgxTv_SdtSDTCierreMes_Tranregionabrevorigen( A594Tran_RegionAbrev );
         Gxm1sdtcierremes.setgxTv_SdtSDTCierreMes_Tranregioncodigo( A421Tran_RegionCodigo );
         Gxm1sdtcierremes.setgxTv_SdtSDTCierreMes_Trancentrocostocodigoorigen( A419Tran_CentroCostoCodigo );
         Gxm1sdtcierremes.setgxTv_SdtSDTCierreMes_Tranmoduloorigen( A110Tran_ModuloOrigen );
         Gxm1sdtcierremes.setgxTv_SdtSDTCierreMes_Trancodalmaorigen( A109Tran_CodAlmaOrigen );
         Gxm1sdtcierremes.setgxTv_SdtSDTCierreMes_Trancodbodeorigen( A112Tran_CodBodeOrigen );
         Gxm1sdtcierremes.setgxTv_SdtSDTCierreMes_Tranregioncodigodestino( A421Tran_RegionCodigo );
         Gxm1sdtcierremes.setgxTv_SdtSDTCierreMes_Tranregionabrevdestino( A594Tran_RegionAbrev );
         Gxm1sdtcierremes.setgxTv_SdtSDTCierreMes_Tranmodulodestino( A385Tran_ModuloDestino );
         Gxm1sdtcierremes.setgxTv_SdtSDTCierreMes_Trancodalmadestino( A111Tran_CodAlmaDestino );
         Gxm1sdtcierremes.setgxTv_SdtSDTCierreMes_Trancodbodedestino( A387Tran_CodBodeDestino );
         Gxm1sdtcierremes.setgxTv_SdtSDTCierreMes_Trancentrocostocodigodestino( A419Tran_CentroCostoCodigo );
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = dpcierremes.this.Gxm1sdtcierremes;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm1sdtcierremes = new com.orions2.SdtSDTCierreMes(remoteHandle, context);
      scmdbuf = "" ;
      P00042_A48Tran_CentroCostoId = new long[1] ;
      P00042_A57Tran_RegionId = new long[1] ;
      P00042_n57Tran_RegionId = new boolean[] {false} ;
      P00042_A46Tran_Id = new long[1] ;
      P00042_A594Tran_RegionAbrev = new String[] {""} ;
      P00042_n594Tran_RegionAbrev = new boolean[] {false} ;
      P00042_A421Tran_RegionCodigo = new short[1] ;
      P00042_n421Tran_RegionCodigo = new boolean[] {false} ;
      P00042_A419Tran_CentroCostoCodigo = new String[] {""} ;
      P00042_n419Tran_CentroCostoCodigo = new boolean[] {false} ;
      P00042_A110Tran_ModuloOrigen = new String[] {""} ;
      P00042_A109Tran_CodAlmaOrigen = new String[] {""} ;
      P00042_A112Tran_CodBodeOrigen = new String[] {""} ;
      P00042_A385Tran_ModuloDestino = new String[] {""} ;
      P00042_A111Tran_CodAlmaDestino = new String[] {""} ;
      P00042_A387Tran_CodBodeDestino = new String[] {""} ;
      A594Tran_RegionAbrev = "" ;
      A419Tran_CentroCostoCodigo = "" ;
      A110Tran_ModuloOrigen = "" ;
      A109Tran_CodAlmaOrigen = "" ;
      A112Tran_CodBodeOrigen = "" ;
      A385Tran_ModuloDestino = "" ;
      A111Tran_CodAlmaDestino = "" ;
      A387Tran_CodBodeDestino = "" ;
      Gx_date = GXutil.nullDate() ;
      GXt_dtime1 = GXutil.resetTime( GXutil.nullDate() );
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.dpcierremes__default(),
         new Object[] {
             new Object[] {
            P00042_A48Tran_CentroCostoId, P00042_A57Tran_RegionId, P00042_n57Tran_RegionId, P00042_A46Tran_Id, P00042_A594Tran_RegionAbrev, P00042_n594Tran_RegionAbrev, P00042_A421Tran_RegionCodigo, P00042_n421Tran_RegionCodigo, P00042_A419Tran_CentroCostoCodigo, P00042_n419Tran_CentroCostoCodigo,
            P00042_A110Tran_ModuloOrigen, P00042_A109Tran_CodAlmaOrigen, P00042_A112Tran_CodBodeOrigen, P00042_A385Tran_ModuloDestino, P00042_A111Tran_CodAlmaDestino, P00042_A387Tran_CodBodeDestino
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private short A421Tran_RegionCodigo ;
   private short Gx_err ;
   private long AV5Tran_Id ;
   private long A48Tran_CentroCostoId ;
   private long A57Tran_RegionId ;
   private long A46Tran_Id ;
   private String scmdbuf ;
   private java.util.Date GXt_dtime1 ;
   private java.util.Date Gx_date ;
   private boolean n57Tran_RegionId ;
   private boolean n594Tran_RegionAbrev ;
   private boolean n421Tran_RegionCodigo ;
   private boolean n419Tran_CentroCostoCodigo ;
   private String A594Tran_RegionAbrev ;
   private String A419Tran_CentroCostoCodigo ;
   private String A110Tran_ModuloOrigen ;
   private String A109Tran_CodAlmaOrigen ;
   private String A112Tran_CodBodeOrigen ;
   private String A385Tran_ModuloDestino ;
   private String A111Tran_CodAlmaDestino ;
   private String A387Tran_CodBodeDestino ;
   private com.orions2.SdtSDTCierreMes[] aP1 ;
   private IDataStoreProvider pr_default ;
   private long[] P00042_A48Tran_CentroCostoId ;
   private long[] P00042_A57Tran_RegionId ;
   private boolean[] P00042_n57Tran_RegionId ;
   private long[] P00042_A46Tran_Id ;
   private String[] P00042_A594Tran_RegionAbrev ;
   private boolean[] P00042_n594Tran_RegionAbrev ;
   private short[] P00042_A421Tran_RegionCodigo ;
   private boolean[] P00042_n421Tran_RegionCodigo ;
   private String[] P00042_A419Tran_CentroCostoCodigo ;
   private boolean[] P00042_n419Tran_CentroCostoCodigo ;
   private String[] P00042_A110Tran_ModuloOrigen ;
   private String[] P00042_A109Tran_CodAlmaOrigen ;
   private String[] P00042_A112Tran_CodBodeOrigen ;
   private String[] P00042_A385Tran_ModuloDestino ;
   private String[] P00042_A111Tran_CodAlmaDestino ;
   private String[] P00042_A387Tran_CodBodeDestino ;
   private com.orions2.SdtSDTCierreMes Gxm1sdtcierremes ;
}

final  class dpcierremes__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00042", "SELECT T1.Tran_CentroCostoId AS Tran_CentroCostoId, T1.Tran_RegionId AS Tran_RegionId, T1.Tran_Id, T3.Regi_Abrev AS Tran_RegionAbrev, T3.Regi_Cod AS Tran_RegionCodigo, T2.Cent_Codigo AS Tran_CentroCostoCodigo, T1.Tran_ModuloOrigen, T1.Tran_CodAlmaOrigen, T1.Tran_CodBodeOrigen, T1.Tran_ModuloDestino, T1.Tran_CodAlmaDestino, T1.Tran_CodBodeDestino FROM ((ALM_TRANSACCION T1 INNER JOIN GEN_CENTROCOSTO T2 ON T2.Cent_Id = T1.Tran_CentroCostoId) LEFT JOIN GEN_REGIONAL T3 ON T3.Regi_Id = T1.Tran_RegionId) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[14])[0] = rslt.getVarchar(11) ;
               ((String[]) buf[15])[0] = rslt.getVarchar(12) ;
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

