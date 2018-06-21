/*
               File: DPTransaccionCabecera
        Description: DPTransaccion Cabecera
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:54.58
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dptransaccioncabecera extends GXProcedure
{
   public dptransaccioncabecera( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dptransaccioncabecera.class ), "" );
   }

   public dptransaccioncabecera( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public com.orions2.SdtSDTTransaccionCabecera executeUdp( long aP0 )
   {
      dptransaccioncabecera.this.AV5Tran_Id = aP0;
      dptransaccioncabecera.this.aP1 = aP1;
      dptransaccioncabecera.this.aP1 = new com.orions2.SdtSDTTransaccionCabecera[] {new com.orions2.SdtSDTTransaccionCabecera()};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( long aP0 ,
                        com.orions2.SdtSDTTransaccionCabecera[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( long aP0 ,
                             com.orions2.SdtSDTTransaccionCabecera[] aP1 )
   {
      dptransaccioncabecera.this.AV5Tran_Id = aP0;
      dptransaccioncabecera.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00032 */
      pr_default.execute(0, new Object[] {new Long(AV5Tran_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A416Tran_Observaciones = P00032_A416Tran_Observaciones[0] ;
         n416Tran_Observaciones = P00032_n416Tran_Observaciones[0] ;
         A48Tran_CentroCostoId = P00032_A48Tran_CentroCostoId[0] ;
         A57Tran_RegionId = P00032_A57Tran_RegionId[0] ;
         n57Tran_RegionId = P00032_n57Tran_RegionId[0] ;
         A46Tran_Id = P00032_A46Tran_Id[0] ;
         A421Tran_RegionCodigo = P00032_A421Tran_RegionCodigo[0] ;
         n421Tran_RegionCodigo = P00032_n421Tran_RegionCodigo[0] ;
         A594Tran_RegionAbrev = P00032_A594Tran_RegionAbrev[0] ;
         n594Tran_RegionAbrev = P00032_n594Tran_RegionAbrev[0] ;
         A481Tran_IndE_S = P00032_A481Tran_IndE_S[0] ;
         n481Tran_IndE_S = P00032_n481Tran_IndE_S[0] ;
         A49Tran_CodigoMovimiento = P00032_A49Tran_CodigoMovimiento[0] ;
         A513Tran_ConsecutivoCC = P00032_A513Tran_ConsecutivoCC[0] ;
         n513Tran_ConsecutivoCC = P00032_n513Tran_ConsecutivoCC[0] ;
         A110Tran_ModuloOrigen = P00032_A110Tran_ModuloOrigen[0] ;
         A109Tran_CodAlmaOrigen = P00032_A109Tran_CodAlmaOrigen[0] ;
         A112Tran_CodBodeOrigen = P00032_A112Tran_CodBodeOrigen[0] ;
         A51Tran_IdCuentadanteOrigen = P00032_A51Tran_IdCuentadanteOrigen[0] ;
         n51Tran_IdCuentadanteOrigen = P00032_n51Tran_IdCuentadanteOrigen[0] ;
         A53Tran_IdProveedor = P00032_A53Tran_IdProveedor[0] ;
         n53Tran_IdProveedor = P00032_n53Tran_IdProveedor[0] ;
         A385Tran_ModuloDestino = P00032_A385Tran_ModuloDestino[0] ;
         A111Tran_CodAlmaDestino = P00032_A111Tran_CodAlmaDestino[0] ;
         A387Tran_CodBodeDestino = P00032_A387Tran_CodBodeDestino[0] ;
         A52Tran_IdCuentadanteDestino = P00032_A52Tran_IdCuentadanteDestino[0] ;
         n52Tran_IdCuentadanteDestino = P00032_n52Tran_IdCuentadanteDestino[0] ;
         A58Tran_Estado = P00032_A58Tran_Estado[0] ;
         n58Tran_Estado = P00032_n58Tran_Estado[0] ;
         A55Tran_FechaRegistro = P00032_A55Tran_FechaRegistro[0] ;
         A390Tran_FechaRatificacion = P00032_A390Tran_FechaRatificacion[0] ;
         n390Tran_FechaRatificacion = P00032_n390Tran_FechaRatificacion[0] ;
         A419Tran_CentroCostoCodigo = P00032_A419Tran_CentroCostoCodigo[0] ;
         n419Tran_CentroCostoCodigo = P00032_n419Tran_CentroCostoCodigo[0] ;
         A408Tran_CursoCodigo = P00032_A408Tran_CursoCodigo[0] ;
         n408Tran_CursoCodigo = P00032_n408Tran_CursoCodigo[0] ;
         A407Tran_AreadanteCodigo = P00032_A407Tran_AreadanteCodigo[0] ;
         n407Tran_AreadanteCodigo = P00032_n407Tran_AreadanteCodigo[0] ;
         A54Tran_TipoIngreso = P00032_A54Tran_TipoIngreso[0] ;
         n54Tran_TipoIngreso = P00032_n54Tran_TipoIngreso[0] ;
         A514Tran_NumeroIngreso = P00032_A514Tran_NumeroIngreso[0] ;
         n514Tran_NumeroIngreso = P00032_n514Tran_NumeroIngreso[0] ;
         A515Tran_FechaIngreso = P00032_A515Tran_FechaIngreso[0] ;
         n515Tran_FechaIngreso = P00032_n515Tran_FechaIngreso[0] ;
         A419Tran_CentroCostoCodigo = P00032_A419Tran_CentroCostoCodigo[0] ;
         n419Tran_CentroCostoCodigo = P00032_n419Tran_CentroCostoCodigo[0] ;
         A421Tran_RegionCodigo = P00032_A421Tran_RegionCodigo[0] ;
         n421Tran_RegionCodigo = P00032_n421Tran_RegionCodigo[0] ;
         A594Tran_RegionAbrev = P00032_A594Tran_RegionAbrev[0] ;
         n594Tran_RegionAbrev = P00032_n594Tran_RegionAbrev[0] ;
         Gxm1sdttransaccioncabecera.setgxTv_SdtSDTTransaccionCabecera_Tranregioncodigo( A421Tran_RegionCodigo );
         Gxm1sdttransaccioncabecera.setgxTv_SdtSDTTransaccionCabecera_Tranregionabrev( A594Tran_RegionAbrev );
         Gxm1sdttransaccioncabecera.setgxTv_SdtSDTTransaccionCabecera_Tranid( A46Tran_Id );
         Gxm1sdttransaccioncabecera.setgxTv_SdtSDTTransaccionCabecera_Tranindes( A481Tran_IndE_S );
         Gxm1sdttransaccioncabecera.setgxTv_SdtSDTTransaccionCabecera_Trancodigomovimiento( A49Tran_CodigoMovimiento );
         Gxm1sdttransaccioncabecera.setgxTv_SdtSDTTransaccionCabecera_Tranconsecutivocc( A513Tran_ConsecutivoCC );
         Gxm1sdttransaccioncabecera.setgxTv_SdtSDTTransaccionCabecera_Tranmoduloorigen( A110Tran_ModuloOrigen );
         Gxm1sdttransaccioncabecera.setgxTv_SdtSDTTransaccionCabecera_Trancodalmaorigen( A109Tran_CodAlmaOrigen );
         Gxm1sdttransaccioncabecera.setgxTv_SdtSDTTransaccionCabecera_Trancodbodeorigen( A112Tran_CodBodeOrigen );
         Gxm1sdttransaccioncabecera.setgxTv_SdtSDTTransaccionCabecera_Tranidcuentadanteorigen( A51Tran_IdCuentadanteOrigen );
         Gxm1sdttransaccioncabecera.setgxTv_SdtSDTTransaccionCabecera_Tranidproveedor( A53Tran_IdProveedor );
         Gxm1sdttransaccioncabecera.setgxTv_SdtSDTTransaccionCabecera_Tranmodulodestino( A385Tran_ModuloDestino );
         Gxm1sdttransaccioncabecera.setgxTv_SdtSDTTransaccionCabecera_Trancodalmadestino( A111Tran_CodAlmaDestino );
         Gxm1sdttransaccioncabecera.setgxTv_SdtSDTTransaccionCabecera_Trancodbodedestino( A387Tran_CodBodeDestino );
         Gxm1sdttransaccioncabecera.setgxTv_SdtSDTTransaccionCabecera_Tranidcuentadantedestino( A52Tran_IdCuentadanteDestino );
         Gxm1sdttransaccioncabecera.setgxTv_SdtSDTTransaccionCabecera_Tranobservaciones( A416Tran_Observaciones );
         Gxm1sdttransaccioncabecera.setgxTv_SdtSDTTransaccionCabecera_Tranestado( A58Tran_Estado );
         Gxm1sdttransaccioncabecera.setgxTv_SdtSDTTransaccionCabecera_Tranfecharegistro( A55Tran_FechaRegistro );
         Gxm1sdttransaccioncabecera.setgxTv_SdtSDTTransaccionCabecera_Tranfecharatificacion( A390Tran_FechaRatificacion );
         Gxm1sdttransaccioncabecera.setgxTv_SdtSDTTransaccionCabecera_Trancentrocostocodigo( A419Tran_CentroCostoCodigo );
         Gxm1sdttransaccioncabecera.setgxTv_SdtSDTTransaccionCabecera_Trancursocodigo( A408Tran_CursoCodigo );
         Gxm1sdttransaccioncabecera.setgxTv_SdtSDTTransaccionCabecera_Tranareadantecodigo( A407Tran_AreadanteCodigo );
         Gxm1sdttransaccioncabecera.setgxTv_SdtSDTTransaccionCabecera_Trantipoingreso( A54Tran_TipoIngreso );
         Gxm1sdttransaccioncabecera.setgxTv_SdtSDTTransaccionCabecera_Trannumeroingreso( A514Tran_NumeroIngreso );
         Gxm1sdttransaccioncabecera.setgxTv_SdtSDTTransaccionCabecera_Tranfechaingreso( A515Tran_FechaIngreso );
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = dptransaccioncabecera.this.Gxm1sdttransaccioncabecera;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm1sdttransaccioncabecera = new com.orions2.SdtSDTTransaccionCabecera(remoteHandle, context);
      scmdbuf = "" ;
      P00032_A416Tran_Observaciones = new String[] {""} ;
      P00032_n416Tran_Observaciones = new boolean[] {false} ;
      P00032_A48Tran_CentroCostoId = new long[1] ;
      P00032_A57Tran_RegionId = new long[1] ;
      P00032_n57Tran_RegionId = new boolean[] {false} ;
      P00032_A46Tran_Id = new long[1] ;
      P00032_A421Tran_RegionCodigo = new short[1] ;
      P00032_n421Tran_RegionCodigo = new boolean[] {false} ;
      P00032_A594Tran_RegionAbrev = new String[] {""} ;
      P00032_n594Tran_RegionAbrev = new boolean[] {false} ;
      P00032_A481Tran_IndE_S = new String[] {""} ;
      P00032_n481Tran_IndE_S = new boolean[] {false} ;
      P00032_A49Tran_CodigoMovimiento = new String[] {""} ;
      P00032_A513Tran_ConsecutivoCC = new long[1] ;
      P00032_n513Tran_ConsecutivoCC = new boolean[] {false} ;
      P00032_A110Tran_ModuloOrigen = new String[] {""} ;
      P00032_A109Tran_CodAlmaOrigen = new String[] {""} ;
      P00032_A112Tran_CodBodeOrigen = new String[] {""} ;
      P00032_A51Tran_IdCuentadanteOrigen = new long[1] ;
      P00032_n51Tran_IdCuentadanteOrigen = new boolean[] {false} ;
      P00032_A53Tran_IdProveedor = new long[1] ;
      P00032_n53Tran_IdProveedor = new boolean[] {false} ;
      P00032_A385Tran_ModuloDestino = new String[] {""} ;
      P00032_A111Tran_CodAlmaDestino = new String[] {""} ;
      P00032_A387Tran_CodBodeDestino = new String[] {""} ;
      P00032_A52Tran_IdCuentadanteDestino = new long[1] ;
      P00032_n52Tran_IdCuentadanteDestino = new boolean[] {false} ;
      P00032_A58Tran_Estado = new String[] {""} ;
      P00032_n58Tran_Estado = new boolean[] {false} ;
      P00032_A55Tran_FechaRegistro = new java.util.Date[] {GXutil.nullDate()} ;
      P00032_A390Tran_FechaRatificacion = new java.util.Date[] {GXutil.nullDate()} ;
      P00032_n390Tran_FechaRatificacion = new boolean[] {false} ;
      P00032_A419Tran_CentroCostoCodigo = new String[] {""} ;
      P00032_n419Tran_CentroCostoCodigo = new boolean[] {false} ;
      P00032_A408Tran_CursoCodigo = new String[] {""} ;
      P00032_n408Tran_CursoCodigo = new boolean[] {false} ;
      P00032_A407Tran_AreadanteCodigo = new String[] {""} ;
      P00032_n407Tran_AreadanteCodigo = new boolean[] {false} ;
      P00032_A54Tran_TipoIngreso = new long[1] ;
      P00032_n54Tran_TipoIngreso = new boolean[] {false} ;
      P00032_A514Tran_NumeroIngreso = new String[] {""} ;
      P00032_n514Tran_NumeroIngreso = new boolean[] {false} ;
      P00032_A515Tran_FechaIngreso = new java.util.Date[] {GXutil.nullDate()} ;
      P00032_n515Tran_FechaIngreso = new boolean[] {false} ;
      A416Tran_Observaciones = "" ;
      A594Tran_RegionAbrev = "" ;
      A481Tran_IndE_S = "" ;
      A49Tran_CodigoMovimiento = "" ;
      A110Tran_ModuloOrigen = "" ;
      A109Tran_CodAlmaOrigen = "" ;
      A112Tran_CodBodeOrigen = "" ;
      A385Tran_ModuloDestino = "" ;
      A111Tran_CodAlmaDestino = "" ;
      A387Tran_CodBodeDestino = "" ;
      A58Tran_Estado = "" ;
      A55Tran_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      A390Tran_FechaRatificacion = GXutil.resetTime( GXutil.nullDate() );
      A419Tran_CentroCostoCodigo = "" ;
      A408Tran_CursoCodigo = "" ;
      A407Tran_AreadanteCodigo = "" ;
      A514Tran_NumeroIngreso = "" ;
      A515Tran_FechaIngreso = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.dptransaccioncabecera__default(),
         new Object[] {
             new Object[] {
            P00032_A416Tran_Observaciones, P00032_n416Tran_Observaciones, P00032_A48Tran_CentroCostoId, P00032_A57Tran_RegionId, P00032_n57Tran_RegionId, P00032_A46Tran_Id, P00032_A421Tran_RegionCodigo, P00032_n421Tran_RegionCodigo, P00032_A594Tran_RegionAbrev, P00032_n594Tran_RegionAbrev,
            P00032_A481Tran_IndE_S, P00032_n481Tran_IndE_S, P00032_A49Tran_CodigoMovimiento, P00032_A513Tran_ConsecutivoCC, P00032_n513Tran_ConsecutivoCC, P00032_A110Tran_ModuloOrigen, P00032_A109Tran_CodAlmaOrigen, P00032_A112Tran_CodBodeOrigen, P00032_A51Tran_IdCuentadanteOrigen, P00032_n51Tran_IdCuentadanteOrigen,
            P00032_A53Tran_IdProveedor, P00032_n53Tran_IdProveedor, P00032_A385Tran_ModuloDestino, P00032_A111Tran_CodAlmaDestino, P00032_A387Tran_CodBodeDestino, P00032_A52Tran_IdCuentadanteDestino, P00032_n52Tran_IdCuentadanteDestino, P00032_A58Tran_Estado, P00032_n58Tran_Estado, P00032_A55Tran_FechaRegistro,
            P00032_A390Tran_FechaRatificacion, P00032_n390Tran_FechaRatificacion, P00032_A419Tran_CentroCostoCodigo, P00032_n419Tran_CentroCostoCodigo, P00032_A408Tran_CursoCodigo, P00032_n408Tran_CursoCodigo, P00032_A407Tran_AreadanteCodigo, P00032_n407Tran_AreadanteCodigo, P00032_A54Tran_TipoIngreso, P00032_n54Tran_TipoIngreso,
            P00032_A514Tran_NumeroIngreso, P00032_n514Tran_NumeroIngreso, P00032_A515Tran_FechaIngreso, P00032_n515Tran_FechaIngreso
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A421Tran_RegionCodigo ;
   private short Gx_err ;
   private long AV5Tran_Id ;
   private long A48Tran_CentroCostoId ;
   private long A57Tran_RegionId ;
   private long A46Tran_Id ;
   private long A513Tran_ConsecutivoCC ;
   private long A51Tran_IdCuentadanteOrigen ;
   private long A53Tran_IdProveedor ;
   private long A52Tran_IdCuentadanteDestino ;
   private long A54Tran_TipoIngreso ;
   private String scmdbuf ;
   private String A58Tran_Estado ;
   private String A514Tran_NumeroIngreso ;
   private java.util.Date A55Tran_FechaRegistro ;
   private java.util.Date A390Tran_FechaRatificacion ;
   private java.util.Date A515Tran_FechaIngreso ;
   private boolean n416Tran_Observaciones ;
   private boolean n57Tran_RegionId ;
   private boolean n421Tran_RegionCodigo ;
   private boolean n594Tran_RegionAbrev ;
   private boolean n481Tran_IndE_S ;
   private boolean n513Tran_ConsecutivoCC ;
   private boolean n51Tran_IdCuentadanteOrigen ;
   private boolean n53Tran_IdProveedor ;
   private boolean n52Tran_IdCuentadanteDestino ;
   private boolean n58Tran_Estado ;
   private boolean n390Tran_FechaRatificacion ;
   private boolean n419Tran_CentroCostoCodigo ;
   private boolean n408Tran_CursoCodigo ;
   private boolean n407Tran_AreadanteCodigo ;
   private boolean n54Tran_TipoIngreso ;
   private boolean n514Tran_NumeroIngreso ;
   private boolean n515Tran_FechaIngreso ;
   private String A416Tran_Observaciones ;
   private String A594Tran_RegionAbrev ;
   private String A481Tran_IndE_S ;
   private String A49Tran_CodigoMovimiento ;
   private String A110Tran_ModuloOrigen ;
   private String A109Tran_CodAlmaOrigen ;
   private String A112Tran_CodBodeOrigen ;
   private String A385Tran_ModuloDestino ;
   private String A111Tran_CodAlmaDestino ;
   private String A387Tran_CodBodeDestino ;
   private String A419Tran_CentroCostoCodigo ;
   private String A408Tran_CursoCodigo ;
   private String A407Tran_AreadanteCodigo ;
   private com.orions2.SdtSDTTransaccionCabecera[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00032_A416Tran_Observaciones ;
   private boolean[] P00032_n416Tran_Observaciones ;
   private long[] P00032_A48Tran_CentroCostoId ;
   private long[] P00032_A57Tran_RegionId ;
   private boolean[] P00032_n57Tran_RegionId ;
   private long[] P00032_A46Tran_Id ;
   private short[] P00032_A421Tran_RegionCodigo ;
   private boolean[] P00032_n421Tran_RegionCodigo ;
   private String[] P00032_A594Tran_RegionAbrev ;
   private boolean[] P00032_n594Tran_RegionAbrev ;
   private String[] P00032_A481Tran_IndE_S ;
   private boolean[] P00032_n481Tran_IndE_S ;
   private String[] P00032_A49Tran_CodigoMovimiento ;
   private long[] P00032_A513Tran_ConsecutivoCC ;
   private boolean[] P00032_n513Tran_ConsecutivoCC ;
   private String[] P00032_A110Tran_ModuloOrigen ;
   private String[] P00032_A109Tran_CodAlmaOrigen ;
   private String[] P00032_A112Tran_CodBodeOrigen ;
   private long[] P00032_A51Tran_IdCuentadanteOrigen ;
   private boolean[] P00032_n51Tran_IdCuentadanteOrigen ;
   private long[] P00032_A53Tran_IdProveedor ;
   private boolean[] P00032_n53Tran_IdProveedor ;
   private String[] P00032_A385Tran_ModuloDestino ;
   private String[] P00032_A111Tran_CodAlmaDestino ;
   private String[] P00032_A387Tran_CodBodeDestino ;
   private long[] P00032_A52Tran_IdCuentadanteDestino ;
   private boolean[] P00032_n52Tran_IdCuentadanteDestino ;
   private String[] P00032_A58Tran_Estado ;
   private boolean[] P00032_n58Tran_Estado ;
   private java.util.Date[] P00032_A55Tran_FechaRegistro ;
   private java.util.Date[] P00032_A390Tran_FechaRatificacion ;
   private boolean[] P00032_n390Tran_FechaRatificacion ;
   private String[] P00032_A419Tran_CentroCostoCodigo ;
   private boolean[] P00032_n419Tran_CentroCostoCodigo ;
   private String[] P00032_A408Tran_CursoCodigo ;
   private boolean[] P00032_n408Tran_CursoCodigo ;
   private String[] P00032_A407Tran_AreadanteCodigo ;
   private boolean[] P00032_n407Tran_AreadanteCodigo ;
   private long[] P00032_A54Tran_TipoIngreso ;
   private boolean[] P00032_n54Tran_TipoIngreso ;
   private String[] P00032_A514Tran_NumeroIngreso ;
   private boolean[] P00032_n514Tran_NumeroIngreso ;
   private java.util.Date[] P00032_A515Tran_FechaIngreso ;
   private boolean[] P00032_n515Tran_FechaIngreso ;
   private com.orions2.SdtSDTTransaccionCabecera Gxm1sdttransaccioncabecera ;
}

final  class dptransaccioncabecera__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00032", "SELECT T1.Tran_Observaciones, T1.Tran_CentroCostoId AS Tran_CentroCostoId, T1.Tran_RegionId AS Tran_RegionId, T1.Tran_Id, T3.Regi_Cod AS Tran_RegionCodigo, T3.Regi_Abrev AS Tran_RegionAbrev, T1.Tran_IndE_S, T1.Tran_CodigoMovimiento, T1.Tran_ConsecutivoCC, T1.Tran_ModuloOrigen, T1.Tran_CodAlmaOrigen, T1.Tran_CodBodeOrigen, T1.Tran_IdCuentadanteOrigen, T1.Tran_IdProveedor, T1.Tran_ModuloDestino, T1.Tran_CodAlmaDestino, T1.Tran_CodBodeDestino, T1.Tran_IdCuentadanteDestino, T1.Tran_Estado, T1.Tran_FechaRegistro, T1.Tran_FechaRatificacion, T2.Cent_Codigo AS Tran_CentroCostoCodigo, T1.Tran_CursoCodigo, T1.Tran_AreadanteCodigo, T1.Tran_TipoIngreso, T1.Tran_NumeroIngreso, T1.Tran_FechaIngreso FROM ((ALM_TRANSACCION T1 INNER JOIN GEN_CENTROCOSTO T2 ON T2.Cent_Id = T1.Tran_CentroCostoId) LEFT JOIN GEN_REGIONAL T3 ON T3.Regi_Id = T1.Tran_RegionId) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
               ((short[]) buf[6])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((long[]) buf[13])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(12) ;
               ((long[]) buf[18])[0] = rslt.getLong(13) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((long[]) buf[20])[0] = rslt.getLong(14) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(15) ;
               ((String[]) buf[23])[0] = rslt.getVarchar(16) ;
               ((String[]) buf[24])[0] = rslt.getVarchar(17) ;
               ((long[]) buf[25])[0] = rslt.getLong(18) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(19, 1) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDateTime(20) ;
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDateTime(21) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((long[]) buf[38])[0] = rslt.getLong(25) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(26, 30) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[42])[0] = rslt.getGXDate(27) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
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

