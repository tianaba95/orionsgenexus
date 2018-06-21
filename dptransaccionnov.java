/*
               File: DPTransaccionNov
        Description: DPTransaccion Nov
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: April 9, 2018 15:27:57.74
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dptransaccionnov extends GXProcedure
{
   public dptransaccionnov( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dptransaccionnov.class ), "" );
   }

   public dptransaccionnov( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GXBaseCollection<com.orions2.SdtSDTTransaccionNov_SDTTransaccionNovItem> executeUdp( long aP0 )
   {
      dptransaccionnov.this.AV5Regi_Id = aP0;
      dptransaccionnov.this.aP1 = aP1;
      dptransaccionnov.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.orions2.SdtSDTTransaccionNov_SDTTransaccionNovItem>()};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( long aP0 ,
                        GXBaseCollection<com.orions2.SdtSDTTransaccionNov_SDTTransaccionNovItem>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( long aP0 ,
                             GXBaseCollection<com.orions2.SdtSDTTransaccionNov_SDTTransaccionNovItem>[] aP1 )
   {
      dptransaccionnov.this.AV5Regi_Id = aP0;
      dptransaccionnov.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000G2 */
      pr_default.execute(0, new Object[] {new Long(AV5Regi_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A48Tran_CentroCostoId = P000G2_A48Tran_CentroCostoId[0] ;
         A51Tran_IdCuentadanteOrigen = P000G2_A51Tran_IdCuentadanteOrigen[0] ;
         n51Tran_IdCuentadanteOrigen = P000G2_n51Tran_IdCuentadanteOrigen[0] ;
         A53Tran_IdProveedor = P000G2_A53Tran_IdProveedor[0] ;
         n53Tran_IdProveedor = P000G2_n53Tran_IdProveedor[0] ;
         A52Tran_IdCuentadanteDestino = P000G2_A52Tran_IdCuentadanteDestino[0] ;
         n52Tran_IdCuentadanteDestino = P000G2_n52Tran_IdCuentadanteDestino[0] ;
         A58Tran_Estado = P000G2_A58Tran_Estado[0] ;
         n58Tran_Estado = P000G2_n58Tran_Estado[0] ;
         A57Tran_RegionId = P000G2_A57Tran_RegionId[0] ;
         n57Tran_RegionId = P000G2_n57Tran_RegionId[0] ;
         A46Tran_Id = P000G2_A46Tran_Id[0] ;
         A513Tran_ConsecutivoCC = P000G2_A513Tran_ConsecutivoCC[0] ;
         n513Tran_ConsecutivoCC = P000G2_n513Tran_ConsecutivoCC[0] ;
         A419Tran_CentroCostoCodigo = P000G2_A419Tran_CentroCostoCodigo[0] ;
         n419Tran_CentroCostoCodigo = P000G2_n419Tran_CentroCostoCodigo[0] ;
         A420Tran_CentroCostoDescripcion = P000G2_A420Tran_CentroCostoDescripcion[0] ;
         n420Tran_CentroCostoDescripcion = P000G2_n420Tran_CentroCostoDescripcion[0] ;
         A421Tran_RegionCodigo = P000G2_A421Tran_RegionCodigo[0] ;
         n421Tran_RegionCodigo = P000G2_n421Tran_RegionCodigo[0] ;
         A422Tran_RegionDescripcion = P000G2_A422Tran_RegionDescripcion[0] ;
         n422Tran_RegionDescripcion = P000G2_n422Tran_RegionDescripcion[0] ;
         A49Tran_CodigoMovimiento = P000G2_A49Tran_CodigoMovimiento[0] ;
         A381Tran_DescripcionMovimiento = P000G2_A381Tran_DescripcionMovimiento[0] ;
         n381Tran_DescripcionMovimiento = P000G2_n381Tran_DescripcionMovimiento[0] ;
         A110Tran_ModuloOrigen = P000G2_A110Tran_ModuloOrigen[0] ;
         A109Tran_CodAlmaOrigen = P000G2_A109Tran_CodAlmaOrigen[0] ;
         A112Tran_CodBodeOrigen = P000G2_A112Tran_CodBodeOrigen[0] ;
         A384Tran_NombCuentadanteOrigen = P000G2_A384Tran_NombCuentadanteOrigen[0] ;
         n384Tran_NombCuentadanteOrigen = P000G2_n384Tran_NombCuentadanteOrigen[0] ;
         A702Tran_CedulaCuentadanteOrigen = P000G2_A702Tran_CedulaCuentadanteOrigen[0] ;
         n702Tran_CedulaCuentadanteOrigen = P000G2_n702Tran_CedulaCuentadanteOrigen[0] ;
         A575Tran_NombreProveedor = P000G2_A575Tran_NombreProveedor[0] ;
         n575Tran_NombreProveedor = P000G2_n575Tran_NombreProveedor[0] ;
         A703Tran_CedulaProveedor = P000G2_A703Tran_CedulaProveedor[0] ;
         n703Tran_CedulaProveedor = P000G2_n703Tran_CedulaProveedor[0] ;
         A385Tran_ModuloDestino = P000G2_A385Tran_ModuloDestino[0] ;
         A111Tran_CodAlmaDestino = P000G2_A111Tran_CodAlmaDestino[0] ;
         A387Tran_CodBodeDestino = P000G2_A387Tran_CodBodeDestino[0] ;
         A389Tran_NombCuentadanteDestino = P000G2_A389Tran_NombCuentadanteDestino[0] ;
         n389Tran_NombCuentadanteDestino = P000G2_n389Tran_NombCuentadanteDestino[0] ;
         A704Tran_CedulaCuentadanteDestino = P000G2_A704Tran_CedulaCuentadanteDestino[0] ;
         n704Tran_CedulaCuentadanteDestino = P000G2_n704Tran_CedulaCuentadanteDestino[0] ;
         A419Tran_CentroCostoCodigo = P000G2_A419Tran_CentroCostoCodigo[0] ;
         n419Tran_CentroCostoCodigo = P000G2_n419Tran_CentroCostoCodigo[0] ;
         A420Tran_CentroCostoDescripcion = P000G2_A420Tran_CentroCostoDescripcion[0] ;
         n420Tran_CentroCostoDescripcion = P000G2_n420Tran_CentroCostoDescripcion[0] ;
         A384Tran_NombCuentadanteOrigen = P000G2_A384Tran_NombCuentadanteOrigen[0] ;
         n384Tran_NombCuentadanteOrigen = P000G2_n384Tran_NombCuentadanteOrigen[0] ;
         A702Tran_CedulaCuentadanteOrigen = P000G2_A702Tran_CedulaCuentadanteOrigen[0] ;
         n702Tran_CedulaCuentadanteOrigen = P000G2_n702Tran_CedulaCuentadanteOrigen[0] ;
         A575Tran_NombreProveedor = P000G2_A575Tran_NombreProveedor[0] ;
         n575Tran_NombreProveedor = P000G2_n575Tran_NombreProveedor[0] ;
         A703Tran_CedulaProveedor = P000G2_A703Tran_CedulaProveedor[0] ;
         n703Tran_CedulaProveedor = P000G2_n703Tran_CedulaProveedor[0] ;
         A389Tran_NombCuentadanteDestino = P000G2_A389Tran_NombCuentadanteDestino[0] ;
         n389Tran_NombCuentadanteDestino = P000G2_n389Tran_NombCuentadanteDestino[0] ;
         A704Tran_CedulaCuentadanteDestino = P000G2_A704Tran_CedulaCuentadanteDestino[0] ;
         n704Tran_CedulaCuentadanteDestino = P000G2_n704Tran_CedulaCuentadanteDestino[0] ;
         A421Tran_RegionCodigo = P000G2_A421Tran_RegionCodigo[0] ;
         n421Tran_RegionCodigo = P000G2_n421Tran_RegionCodigo[0] ;
         A422Tran_RegionDescripcion = P000G2_A422Tran_RegionDescripcion[0] ;
         n422Tran_RegionDescripcion = P000G2_n422Tran_RegionDescripcion[0] ;
         A381Tran_DescripcionMovimiento = P000G2_A381Tran_DescripcionMovimiento[0] ;
         n381Tran_DescripcionMovimiento = P000G2_n381Tran_DescripcionMovimiento[0] ;
         Gxm1sdttransaccionnov = (com.orions2.SdtSDTTransaccionNov_SDTTransaccionNovItem)new com.orions2.SdtSDTTransaccionNov_SDTTransaccionNovItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdttransaccionnov, 0);
         Gxm1sdttransaccionnov.setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_id( A46Tran_Id );
         Gxm1sdttransaccionnov.setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_consecutivocc( A513Tran_ConsecutivoCC );
         Gxm1sdttransaccionnov.setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_consecutivochar( GXutil.str( A513Tran_ConsecutivoCC, 18, 0) );
         Gxm1sdttransaccionnov.setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_centrocostocodigo( A419Tran_CentroCostoCodigo );
         Gxm1sdttransaccionnov.setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_centrocostodescripcion( A420Tran_CentroCostoDescripcion );
         Gxm1sdttransaccionnov.setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_regioncodigo( A421Tran_RegionCodigo );
         Gxm1sdttransaccionnov.setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_regiondescripcion( A422Tran_RegionDescripcion );
         Gxm1sdttransaccionnov.setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codigomovimiento( A49Tran_CodigoMovimiento );
         Gxm1sdttransaccionnov.setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_descripcionmovimiento( A381Tran_DescripcionMovimiento );
         Gxm1sdttransaccionnov.setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_moduloorigen( A110Tran_ModuloOrigen );
         Gxm1sdttransaccionnov.setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codalmaorigen( A109Tran_CodAlmaOrigen );
         Gxm1sdttransaccionnov.setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codbodeorigen( A112Tran_CodBodeOrigen );
         Gxm1sdttransaccionnov.setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombcuentadanteorigen( A384Tran_NombCuentadanteOrigen );
         Gxm1sdttransaccionnov.setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_cedulacuentadanteorigen( A702Tran_CedulaCuentadanteOrigen );
         Gxm1sdttransaccionnov.setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombreproveedor( A575Tran_NombreProveedor );
         Gxm1sdttransaccionnov.setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_cedulaproveedor( A703Tran_CedulaProveedor );
         Gxm1sdttransaccionnov.setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_modulodestino( A385Tran_ModuloDestino );
         Gxm1sdttransaccionnov.setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codalmadestino( A111Tran_CodAlmaDestino );
         Gxm1sdttransaccionnov.setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codbodedestino( A387Tran_CodBodeDestino );
         Gxm1sdttransaccionnov.setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombcuentadantedestino( A389Tran_NombCuentadanteDestino );
         Gxm1sdttransaccionnov.setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_cedulacuentadantedestino( A704Tran_CedulaCuentadanteDestino );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = dptransaccionnov.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<com.orions2.SdtSDTTransaccionNov_SDTTransaccionNovItem>(com.orions2.SdtSDTTransaccionNov_SDTTransaccionNovItem.class, "SDTTransaccionNov.SDTTransaccionNovItem", "ACBSENA", remoteHandle);
      scmdbuf = "" ;
      P000G2_A48Tran_CentroCostoId = new long[1] ;
      P000G2_A51Tran_IdCuentadanteOrigen = new long[1] ;
      P000G2_n51Tran_IdCuentadanteOrigen = new boolean[] {false} ;
      P000G2_A53Tran_IdProveedor = new long[1] ;
      P000G2_n53Tran_IdProveedor = new boolean[] {false} ;
      P000G2_A52Tran_IdCuentadanteDestino = new long[1] ;
      P000G2_n52Tran_IdCuentadanteDestino = new boolean[] {false} ;
      P000G2_A58Tran_Estado = new String[] {""} ;
      P000G2_n58Tran_Estado = new boolean[] {false} ;
      P000G2_A57Tran_RegionId = new long[1] ;
      P000G2_n57Tran_RegionId = new boolean[] {false} ;
      P000G2_A46Tran_Id = new long[1] ;
      P000G2_A513Tran_ConsecutivoCC = new long[1] ;
      P000G2_n513Tran_ConsecutivoCC = new boolean[] {false} ;
      P000G2_A419Tran_CentroCostoCodigo = new String[] {""} ;
      P000G2_n419Tran_CentroCostoCodigo = new boolean[] {false} ;
      P000G2_A420Tran_CentroCostoDescripcion = new String[] {""} ;
      P000G2_n420Tran_CentroCostoDescripcion = new boolean[] {false} ;
      P000G2_A421Tran_RegionCodigo = new short[1] ;
      P000G2_n421Tran_RegionCodigo = new boolean[] {false} ;
      P000G2_A422Tran_RegionDescripcion = new String[] {""} ;
      P000G2_n422Tran_RegionDescripcion = new boolean[] {false} ;
      P000G2_A49Tran_CodigoMovimiento = new String[] {""} ;
      P000G2_A381Tran_DescripcionMovimiento = new String[] {""} ;
      P000G2_n381Tran_DescripcionMovimiento = new boolean[] {false} ;
      P000G2_A110Tran_ModuloOrigen = new String[] {""} ;
      P000G2_A109Tran_CodAlmaOrigen = new String[] {""} ;
      P000G2_A112Tran_CodBodeOrigen = new String[] {""} ;
      P000G2_A384Tran_NombCuentadanteOrigen = new String[] {""} ;
      P000G2_n384Tran_NombCuentadanteOrigen = new boolean[] {false} ;
      P000G2_A702Tran_CedulaCuentadanteOrigen = new long[1] ;
      P000G2_n702Tran_CedulaCuentadanteOrigen = new boolean[] {false} ;
      P000G2_A575Tran_NombreProveedor = new String[] {""} ;
      P000G2_n575Tran_NombreProveedor = new boolean[] {false} ;
      P000G2_A703Tran_CedulaProveedor = new long[1] ;
      P000G2_n703Tran_CedulaProveedor = new boolean[] {false} ;
      P000G2_A385Tran_ModuloDestino = new String[] {""} ;
      P000G2_A111Tran_CodAlmaDestino = new String[] {""} ;
      P000G2_A387Tran_CodBodeDestino = new String[] {""} ;
      P000G2_A389Tran_NombCuentadanteDestino = new String[] {""} ;
      P000G2_n389Tran_NombCuentadanteDestino = new boolean[] {false} ;
      P000G2_A704Tran_CedulaCuentadanteDestino = new long[1] ;
      P000G2_n704Tran_CedulaCuentadanteDestino = new boolean[] {false} ;
      A58Tran_Estado = "" ;
      A419Tran_CentroCostoCodigo = "" ;
      A420Tran_CentroCostoDescripcion = "" ;
      A422Tran_RegionDescripcion = "" ;
      A49Tran_CodigoMovimiento = "" ;
      A381Tran_DescripcionMovimiento = "" ;
      A110Tran_ModuloOrigen = "" ;
      A109Tran_CodAlmaOrigen = "" ;
      A112Tran_CodBodeOrigen = "" ;
      A384Tran_NombCuentadanteOrigen = "" ;
      A575Tran_NombreProveedor = "" ;
      A385Tran_ModuloDestino = "" ;
      A111Tran_CodAlmaDestino = "" ;
      A387Tran_CodBodeDestino = "" ;
      A389Tran_NombCuentadanteDestino = "" ;
      Gxm1sdttransaccionnov = new com.orions2.SdtSDTTransaccionNov_SDTTransaccionNovItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.dptransaccionnov__default(),
         new Object[] {
             new Object[] {
            P000G2_A48Tran_CentroCostoId, P000G2_A51Tran_IdCuentadanteOrigen, P000G2_n51Tran_IdCuentadanteOrigen, P000G2_A53Tran_IdProveedor, P000G2_n53Tran_IdProveedor, P000G2_A52Tran_IdCuentadanteDestino, P000G2_n52Tran_IdCuentadanteDestino, P000G2_A58Tran_Estado, P000G2_n58Tran_Estado, P000G2_A57Tran_RegionId,
            P000G2_n57Tran_RegionId, P000G2_A46Tran_Id, P000G2_A513Tran_ConsecutivoCC, P000G2_n513Tran_ConsecutivoCC, P000G2_A419Tran_CentroCostoCodigo, P000G2_n419Tran_CentroCostoCodigo, P000G2_A420Tran_CentroCostoDescripcion, P000G2_n420Tran_CentroCostoDescripcion, P000G2_A421Tran_RegionCodigo, P000G2_n421Tran_RegionCodigo,
            P000G2_A422Tran_RegionDescripcion, P000G2_n422Tran_RegionDescripcion, P000G2_A49Tran_CodigoMovimiento, P000G2_A381Tran_DescripcionMovimiento, P000G2_n381Tran_DescripcionMovimiento, P000G2_A110Tran_ModuloOrigen, P000G2_A109Tran_CodAlmaOrigen, P000G2_A112Tran_CodBodeOrigen, P000G2_A384Tran_NombCuentadanteOrigen, P000G2_n384Tran_NombCuentadanteOrigen,
            P000G2_A702Tran_CedulaCuentadanteOrigen, P000G2_n702Tran_CedulaCuentadanteOrigen, P000G2_A575Tran_NombreProveedor, P000G2_n575Tran_NombreProveedor, P000G2_A703Tran_CedulaProveedor, P000G2_n703Tran_CedulaProveedor, P000G2_A385Tran_ModuloDestino, P000G2_A111Tran_CodAlmaDestino, P000G2_A387Tran_CodBodeDestino, P000G2_A389Tran_NombCuentadanteDestino,
            P000G2_n389Tran_NombCuentadanteDestino, P000G2_A704Tran_CedulaCuentadanteDestino, P000G2_n704Tran_CedulaCuentadanteDestino
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A421Tran_RegionCodigo ;
   private short Gx_err ;
   private long AV5Regi_Id ;
   private long A48Tran_CentroCostoId ;
   private long A51Tran_IdCuentadanteOrigen ;
   private long A53Tran_IdProveedor ;
   private long A52Tran_IdCuentadanteDestino ;
   private long A57Tran_RegionId ;
   private long A46Tran_Id ;
   private long A513Tran_ConsecutivoCC ;
   private long A702Tran_CedulaCuentadanteOrigen ;
   private long A703Tran_CedulaProveedor ;
   private long A704Tran_CedulaCuentadanteDestino ;
   private String scmdbuf ;
   private String A58Tran_Estado ;
   private boolean n51Tran_IdCuentadanteOrigen ;
   private boolean n53Tran_IdProveedor ;
   private boolean n52Tran_IdCuentadanteDestino ;
   private boolean n58Tran_Estado ;
   private boolean n57Tran_RegionId ;
   private boolean n513Tran_ConsecutivoCC ;
   private boolean n419Tran_CentroCostoCodigo ;
   private boolean n420Tran_CentroCostoDescripcion ;
   private boolean n421Tran_RegionCodigo ;
   private boolean n422Tran_RegionDescripcion ;
   private boolean n381Tran_DescripcionMovimiento ;
   private boolean n384Tran_NombCuentadanteOrigen ;
   private boolean n702Tran_CedulaCuentadanteOrigen ;
   private boolean n575Tran_NombreProveedor ;
   private boolean n703Tran_CedulaProveedor ;
   private boolean n389Tran_NombCuentadanteDestino ;
   private boolean n704Tran_CedulaCuentadanteDestino ;
   private String A419Tran_CentroCostoCodigo ;
   private String A420Tran_CentroCostoDescripcion ;
   private String A422Tran_RegionDescripcion ;
   private String A49Tran_CodigoMovimiento ;
   private String A381Tran_DescripcionMovimiento ;
   private String A110Tran_ModuloOrigen ;
   private String A109Tran_CodAlmaOrigen ;
   private String A112Tran_CodBodeOrigen ;
   private String A384Tran_NombCuentadanteOrigen ;
   private String A575Tran_NombreProveedor ;
   private String A385Tran_ModuloDestino ;
   private String A111Tran_CodAlmaDestino ;
   private String A387Tran_CodBodeDestino ;
   private String A389Tran_NombCuentadanteDestino ;
   private GXBaseCollection<com.orions2.SdtSDTTransaccionNov_SDTTransaccionNovItem>[] aP1 ;
   private IDataStoreProvider pr_default ;
   private long[] P000G2_A48Tran_CentroCostoId ;
   private long[] P000G2_A51Tran_IdCuentadanteOrigen ;
   private boolean[] P000G2_n51Tran_IdCuentadanteOrigen ;
   private long[] P000G2_A53Tran_IdProveedor ;
   private boolean[] P000G2_n53Tran_IdProveedor ;
   private long[] P000G2_A52Tran_IdCuentadanteDestino ;
   private boolean[] P000G2_n52Tran_IdCuentadanteDestino ;
   private String[] P000G2_A58Tran_Estado ;
   private boolean[] P000G2_n58Tran_Estado ;
   private long[] P000G2_A57Tran_RegionId ;
   private boolean[] P000G2_n57Tran_RegionId ;
   private long[] P000G2_A46Tran_Id ;
   private long[] P000G2_A513Tran_ConsecutivoCC ;
   private boolean[] P000G2_n513Tran_ConsecutivoCC ;
   private String[] P000G2_A419Tran_CentroCostoCodigo ;
   private boolean[] P000G2_n419Tran_CentroCostoCodigo ;
   private String[] P000G2_A420Tran_CentroCostoDescripcion ;
   private boolean[] P000G2_n420Tran_CentroCostoDescripcion ;
   private short[] P000G2_A421Tran_RegionCodigo ;
   private boolean[] P000G2_n421Tran_RegionCodigo ;
   private String[] P000G2_A422Tran_RegionDescripcion ;
   private boolean[] P000G2_n422Tran_RegionDescripcion ;
   private String[] P000G2_A49Tran_CodigoMovimiento ;
   private String[] P000G2_A381Tran_DescripcionMovimiento ;
   private boolean[] P000G2_n381Tran_DescripcionMovimiento ;
   private String[] P000G2_A110Tran_ModuloOrigen ;
   private String[] P000G2_A109Tran_CodAlmaOrigen ;
   private String[] P000G2_A112Tran_CodBodeOrigen ;
   private String[] P000G2_A384Tran_NombCuentadanteOrigen ;
   private boolean[] P000G2_n384Tran_NombCuentadanteOrigen ;
   private long[] P000G2_A702Tran_CedulaCuentadanteOrigen ;
   private boolean[] P000G2_n702Tran_CedulaCuentadanteOrigen ;
   private String[] P000G2_A575Tran_NombreProveedor ;
   private boolean[] P000G2_n575Tran_NombreProveedor ;
   private long[] P000G2_A703Tran_CedulaProveedor ;
   private boolean[] P000G2_n703Tran_CedulaProveedor ;
   private String[] P000G2_A385Tran_ModuloDestino ;
   private String[] P000G2_A111Tran_CodAlmaDestino ;
   private String[] P000G2_A387Tran_CodBodeDestino ;
   private String[] P000G2_A389Tran_NombCuentadanteDestino ;
   private boolean[] P000G2_n389Tran_NombCuentadanteDestino ;
   private long[] P000G2_A704Tran_CedulaCuentadanteDestino ;
   private boolean[] P000G2_n704Tran_CedulaCuentadanteDestino ;
   private GXBaseCollection<com.orions2.SdtSDTTransaccionNov_SDTTransaccionNovItem> Gxm2rootcol ;
   private com.orions2.SdtSDTTransaccionNov_SDTTransaccionNovItem Gxm1sdttransaccionnov ;
}

final  class dptransaccionnov__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000G2", "SELECT T1.Tran_CentroCostoId AS Tran_CentroCostoId, T1.Tran_IdCuentadanteOrigen AS Tran_IdCuentadanteOrigen, T1.Tran_IdProveedor AS Tran_IdProveedor, T1.Tran_IdCuentadanteDestino AS Tran_IdCuentadanteDestino, T1.Tran_Estado, T1.Tran_RegionId AS Tran_RegionId, T1.Tran_Id, T1.Tran_ConsecutivoCC, T2.Cent_Codigo AS Tran_CentroCostoCodigo, T2.Cent_Descripcion AS Tran_CentroCostoDescripcion, T6.Regi_Cod AS Tran_RegionCodigo, T6.Regi_Descripcion AS Tran_RegionDescripcion, T1.Tran_CodigoMovimiento AS Tran_CodigoMovimiento, T7.Tpmo_Descripcion AS Tran_DescripcionMovimiento, T1.Tran_ModuloOrigen, T1.Tran_CodAlmaOrigen, T1.Tran_CodBodeOrigen, T3.Cuen_Nombre AS Tran_NombCuentadanteOrigen, T3.Cuen_Cedula AS Tran_CedulaCuentadanteOrigen, T4.Cuen_Nombre AS Tran_NombreProveedor, T4.Cuen_Cedula AS Tran_CedulaProveedor, T1.Tran_ModuloDestino, T1.Tran_CodAlmaDestino, T1.Tran_CodBodeDestino, T5.Cuen_Nombre AS Tran_NombCuentadanteDestino, T5.Cuen_Cedula AS Tran_CedulaCuentadanteDestino FROM ((((((ALM_TRANSACCION T1 INNER JOIN GEN_CENTROCOSTO T2 ON T2.Cent_Id = T1.Tran_CentroCostoId) LEFT JOIN ALM_CUENTADANTE T3 ON T3.Cuen_Identificacion = T1.Tran_IdCuentadanteOrigen) LEFT JOIN ALM_CUENTADANTE T4 ON T4.Cuen_Identificacion = T1.Tran_IdProveedor) LEFT JOIN ALM_CUENTADANTE T5 ON T5.Cuen_Identificacion = T1.Tran_IdCuentadanteDestino) LEFT JOIN GEN_REGIONAL T6 ON T6.Regi_Id = T1.Tran_RegionId) INNER JOIN ALM_TIPO_MOVIMIENTO T7 ON T7.Tpmo_Codigo = T1.Tran_CodigoMovimiento) WHERE (T1.Tran_RegionId = ?) AND (T1.Tran_Estado = 'R') ORDER BY T1.Tran_RegionId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(7) ;
               ((long[]) buf[12])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[23])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15) ;
               ((String[]) buf[26])[0] = rslt.getVarchar(16) ;
               ((String[]) buf[27])[0] = rslt.getVarchar(17) ;
               ((String[]) buf[28])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((long[]) buf[30])[0] = rslt.getLong(19) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((long[]) buf[34])[0] = rslt.getLong(21) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getVarchar(22) ;
               ((String[]) buf[37])[0] = rslt.getVarchar(23) ;
               ((String[]) buf[38])[0] = rslt.getVarchar(24) ;
               ((String[]) buf[39])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((long[]) buf[41])[0] = rslt.getLong(26) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
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

