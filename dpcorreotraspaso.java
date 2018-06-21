/*
               File: DPCorreoTraspaso
        Description: DPCorreo Traspaso
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:56.22
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpcorreotraspaso extends GXProcedure
{
   public dpcorreotraspaso( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpcorreotraspaso.class ), "" );
   }

   public dpcorreotraspaso( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public com.orions2.SdtSDTCorreoTraspaso executeUdp( long aP0 )
   {
      dpcorreotraspaso.this.AV5Tran_Id = aP0;
      dpcorreotraspaso.this.aP1 = aP1;
      dpcorreotraspaso.this.aP1 = new com.orions2.SdtSDTCorreoTraspaso[] {new com.orions2.SdtSDTCorreoTraspaso()};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( long aP0 ,
                        com.orions2.SdtSDTCorreoTraspaso[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( long aP0 ,
                             com.orions2.SdtSDTCorreoTraspaso[] aP1 )
   {
      dpcorreotraspaso.this.AV5Tran_Id = aP0;
      dpcorreotraspaso.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000B3 */
      pr_default.execute(0, new Object[] {new Long(AV5Tran_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A48Tran_CentroCostoId = P000B3_A48Tran_CentroCostoId[0] ;
         A50Tran_CentroCostoIdDestino = P000B3_A50Tran_CentroCostoIdDestino[0] ;
         n50Tran_CentroCostoIdDestino = P000B3_n50Tran_CentroCostoIdDestino[0] ;
         A57Tran_RegionId = P000B3_A57Tran_RegionId[0] ;
         n57Tran_RegionId = P000B3_n57Tran_RegionId[0] ;
         A518Tran_RegionIdDestino = P000B3_A518Tran_RegionIdDestino[0] ;
         n518Tran_RegionIdDestino = P000B3_n518Tran_RegionIdDestino[0] ;
         A49Tran_CodigoMovimiento = P000B3_A49Tran_CodigoMovimiento[0] ;
         A51Tran_IdCuentadanteOrigen = P000B3_A51Tran_IdCuentadanteOrigen[0] ;
         n51Tran_IdCuentadanteOrigen = P000B3_n51Tran_IdCuentadanteOrigen[0] ;
         A52Tran_IdCuentadanteDestino = P000B3_A52Tran_IdCuentadanteDestino[0] ;
         n52Tran_IdCuentadanteDestino = P000B3_n52Tran_IdCuentadanteDestino[0] ;
         A46Tran_Id = P000B3_A46Tran_Id[0] ;
         A714Tran_EmailCuentadanteOrigen = P000B3_A714Tran_EmailCuentadanteOrigen[0] ;
         n714Tran_EmailCuentadanteOrigen = P000B3_n714Tran_EmailCuentadanteOrigen[0] ;
         A715Tran_EmailCuentadanteDestino = P000B3_A715Tran_EmailCuentadanteDestino[0] ;
         n715Tran_EmailCuentadanteDestino = P000B3_n715Tran_EmailCuentadanteDestino[0] ;
         A384Tran_NombCuentadanteOrigen = P000B3_A384Tran_NombCuentadanteOrigen[0] ;
         n384Tran_NombCuentadanteOrigen = P000B3_n384Tran_NombCuentadanteOrigen[0] ;
         A390Tran_FechaRatificacion = P000B3_A390Tran_FechaRatificacion[0] ;
         n390Tran_FechaRatificacion = P000B3_n390Tran_FechaRatificacion[0] ;
         A381Tran_DescripcionMovimiento = P000B3_A381Tran_DescripcionMovimiento[0] ;
         n381Tran_DescripcionMovimiento = P000B3_n381Tran_DescripcionMovimiento[0] ;
         A481Tran_IndE_S = P000B3_A481Tran_IndE_S[0] ;
         n481Tran_IndE_S = P000B3_n481Tran_IndE_S[0] ;
         A513Tran_ConsecutivoCC = P000B3_A513Tran_ConsecutivoCC[0] ;
         n513Tran_ConsecutivoCC = P000B3_n513Tran_ConsecutivoCC[0] ;
         A422Tran_RegionDescripcion = P000B3_A422Tran_RegionDescripcion[0] ;
         n422Tran_RegionDescripcion = P000B3_n422Tran_RegionDescripcion[0] ;
         A421Tran_RegionCodigo = P000B3_A421Tran_RegionCodigo[0] ;
         n421Tran_RegionCodigo = P000B3_n421Tran_RegionCodigo[0] ;
         A520Tran_RegionDescripcionDestino = P000B3_A520Tran_RegionDescripcionDestino[0] ;
         n520Tran_RegionDescripcionDestino = P000B3_n520Tran_RegionDescripcionDestino[0] ;
         A519Tran_RegionCodigoDestino = P000B3_A519Tran_RegionCodigoDestino[0] ;
         n519Tran_RegionCodigoDestino = P000B3_n519Tran_RegionCodigoDestino[0] ;
         A420Tran_CentroCostoDescripcion = P000B3_A420Tran_CentroCostoDescripcion[0] ;
         n420Tran_CentroCostoDescripcion = P000B3_n420Tran_CentroCostoDescripcion[0] ;
         A419Tran_CentroCostoCodigo = P000B3_A419Tran_CentroCostoCodigo[0] ;
         n419Tran_CentroCostoCodigo = P000B3_n419Tran_CentroCostoCodigo[0] ;
         A517Tran_CentroCostoDescripcionDes = P000B3_A517Tran_CentroCostoDescripcionDes[0] ;
         n517Tran_CentroCostoDescripcionDes = P000B3_n517Tran_CentroCostoDescripcionDes[0] ;
         A516Tran_CentroCostoCodigoDestino = P000B3_A516Tran_CentroCostoCodigoDestino[0] ;
         n516Tran_CentroCostoCodigoDestino = P000B3_n516Tran_CentroCostoCodigoDestino[0] ;
         A483Tran_ValorTransaccion = P000B3_A483Tran_ValorTransaccion[0] ;
         n483Tran_ValorTransaccion = P000B3_n483Tran_ValorTransaccion[0] ;
         A40000GXC1 = P000B3_A40000GXC1[0] ;
         n40000GXC1 = P000B3_n40000GXC1[0] ;
         A420Tran_CentroCostoDescripcion = P000B3_A420Tran_CentroCostoDescripcion[0] ;
         n420Tran_CentroCostoDescripcion = P000B3_n420Tran_CentroCostoDescripcion[0] ;
         A419Tran_CentroCostoCodigo = P000B3_A419Tran_CentroCostoCodigo[0] ;
         n419Tran_CentroCostoCodigo = P000B3_n419Tran_CentroCostoCodigo[0] ;
         A517Tran_CentroCostoDescripcionDes = P000B3_A517Tran_CentroCostoDescripcionDes[0] ;
         n517Tran_CentroCostoDescripcionDes = P000B3_n517Tran_CentroCostoDescripcionDes[0] ;
         A516Tran_CentroCostoCodigoDestino = P000B3_A516Tran_CentroCostoCodigoDestino[0] ;
         n516Tran_CentroCostoCodigoDestino = P000B3_n516Tran_CentroCostoCodigoDestino[0] ;
         A422Tran_RegionDescripcion = P000B3_A422Tran_RegionDescripcion[0] ;
         n422Tran_RegionDescripcion = P000B3_n422Tran_RegionDescripcion[0] ;
         A421Tran_RegionCodigo = P000B3_A421Tran_RegionCodigo[0] ;
         n421Tran_RegionCodigo = P000B3_n421Tran_RegionCodigo[0] ;
         A520Tran_RegionDescripcionDestino = P000B3_A520Tran_RegionDescripcionDestino[0] ;
         n520Tran_RegionDescripcionDestino = P000B3_n520Tran_RegionDescripcionDestino[0] ;
         A519Tran_RegionCodigoDestino = P000B3_A519Tran_RegionCodigoDestino[0] ;
         n519Tran_RegionCodigoDestino = P000B3_n519Tran_RegionCodigoDestino[0] ;
         A381Tran_DescripcionMovimiento = P000B3_A381Tran_DescripcionMovimiento[0] ;
         n381Tran_DescripcionMovimiento = P000B3_n381Tran_DescripcionMovimiento[0] ;
         A714Tran_EmailCuentadanteOrigen = P000B3_A714Tran_EmailCuentadanteOrigen[0] ;
         n714Tran_EmailCuentadanteOrigen = P000B3_n714Tran_EmailCuentadanteOrigen[0] ;
         A384Tran_NombCuentadanteOrigen = P000B3_A384Tran_NombCuentadanteOrigen[0] ;
         n384Tran_NombCuentadanteOrigen = P000B3_n384Tran_NombCuentadanteOrigen[0] ;
         A715Tran_EmailCuentadanteDestino = P000B3_A715Tran_EmailCuentadanteDestino[0] ;
         n715Tran_EmailCuentadanteDestino = P000B3_n715Tran_EmailCuentadanteDestino[0] ;
         A40000GXC1 = P000B3_A40000GXC1[0] ;
         n40000GXC1 = P000B3_n40000GXC1[0] ;
         Gxm1sdtcorreotraspaso.setgxTv_SdtSDTCorreoTraspaso_Nombcuentadanteorigen( A384Tran_NombCuentadanteOrigen );
         Gxm1sdtcorreotraspaso.setgxTv_SdtSDTCorreoTraspaso_Fecharatificacion( A390Tran_FechaRatificacion );
         Gxm1sdtcorreotraspaso.setgxTv_SdtSDTCorreoTraspaso_Descripcionmovimiento( A381Tran_DescripcionMovimiento );
         Gxm1sdtcorreotraspaso.setgxTv_SdtSDTCorreoTraspaso_Indicadormovimiento( A481Tran_IndE_S );
         Gxm1sdtcorreotraspaso.setgxTv_SdtSDTCorreoTraspaso_Tranid( (short)(A513Tran_ConsecutivoCC) );
         Gxm1sdtcorreotraspaso.setgxTv_SdtSDTCorreoTraspaso_Tranregionalorigen( GXutil.str( A421Tran_RegionCodigo, 10, 0)+"-"+A422Tran_RegionDescripcion );
         Gxm1sdtcorreotraspaso.setgxTv_SdtSDTCorreoTraspaso_Tranregionaldestino( GXutil.str( A519Tran_RegionCodigoDestino, 10, 0)+"-"+A520Tran_RegionDescripcionDestino );
         Gxm1sdtcorreotraspaso.setgxTv_SdtSDTCorreoTraspaso_Trancentrocostodescripcionorigen( A419Tran_CentroCostoCodigo+"-"+A420Tran_CentroCostoDescripcion );
         Gxm1sdtcorreotraspaso.setgxTv_SdtSDTCorreoTraspaso_Trancentrocostodescripciondestino( A516Tran_CentroCostoCodigoDestino+"-"+A517Tran_CentroCostoDescripcionDes );
         Gxm1sdtcorreotraspaso.setgxTv_SdtSDTCorreoTraspaso_Tranvalortransaccion( A483Tran_ValorTransaccion );
         while ( (pr_default.getStatus(0) != 101) && ( P000B3_A46Tran_Id[0] == A46Tran_Id ) )
         {
            A51Tran_IdCuentadanteOrigen = P000B3_A51Tran_IdCuentadanteOrigen[0] ;
            n51Tran_IdCuentadanteOrigen = P000B3_n51Tran_IdCuentadanteOrigen[0] ;
            A52Tran_IdCuentadanteDestino = P000B3_A52Tran_IdCuentadanteDestino[0] ;
            n52Tran_IdCuentadanteDestino = P000B3_n52Tran_IdCuentadanteDestino[0] ;
            A714Tran_EmailCuentadanteOrigen = P000B3_A714Tran_EmailCuentadanteOrigen[0] ;
            n714Tran_EmailCuentadanteOrigen = P000B3_n714Tran_EmailCuentadanteOrigen[0] ;
            A715Tran_EmailCuentadanteDestino = P000B3_A715Tran_EmailCuentadanteDestino[0] ;
            n715Tran_EmailCuentadanteDestino = P000B3_n715Tran_EmailCuentadanteDestino[0] ;
            A714Tran_EmailCuentadanteOrigen = P000B3_A714Tran_EmailCuentadanteOrigen[0] ;
            n714Tran_EmailCuentadanteOrigen = P000B3_n714Tran_EmailCuentadanteOrigen[0] ;
            A715Tran_EmailCuentadanteDestino = P000B3_A715Tran_EmailCuentadanteDestino[0] ;
            n715Tran_EmailCuentadanteDestino = P000B3_n715Tran_EmailCuentadanteDestino[0] ;
            Gxm2sdtcorreotraspaso_emails = (com.orions2.SdtSDTCorreoTraspaso_emailsItem)new com.orions2.SdtSDTCorreoTraspaso_emailsItem(remoteHandle, context);
            Gxm1sdtcorreotraspaso.getgxTv_SdtSDTCorreoTraspaso_Emails().add(Gxm2sdtcorreotraspaso_emails, 0);
            Gxm2sdtcorreotraspaso_emails.setgxTv_SdtSDTCorreoTraspaso_emailsItem_Emailcuentadanteorigen( A714Tran_EmailCuentadanteOrigen );
            Gxm2sdtcorreotraspaso_emails.setgxTv_SdtSDTCorreoTraspaso_emailsItem_Emailcuentadantedestino( A715Tran_EmailCuentadanteDestino );
            /* Exiting from a For First loop. */
            if (true) break;
         }
         Gxm3sdtcorreotraspaso_cantidad = (com.orions2.SdtSDTCorreoTraspaso_cantidadItem)new com.orions2.SdtSDTCorreoTraspaso_cantidadItem(remoteHandle, context);
         Gxm1sdtcorreotraspaso.getgxTv_SdtSDTCorreoTraspaso_Cantidad().add(Gxm3sdtcorreotraspaso_cantidad, 0);
         Gxm3sdtcorreotraspaso_cantidad.setgxTv_SdtSDTCorreoTraspaso_cantidadItem_Trancantidadelementos( (int)(A40000GXC1) );
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = dpcorreotraspaso.this.Gxm1sdtcorreotraspaso;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm1sdtcorreotraspaso = new com.orions2.SdtSDTCorreoTraspaso(remoteHandle, context);
      scmdbuf = "" ;
      P000B3_A48Tran_CentroCostoId = new long[1] ;
      P000B3_A50Tran_CentroCostoIdDestino = new long[1] ;
      P000B3_n50Tran_CentroCostoIdDestino = new boolean[] {false} ;
      P000B3_A57Tran_RegionId = new long[1] ;
      P000B3_n57Tran_RegionId = new boolean[] {false} ;
      P000B3_A518Tran_RegionIdDestino = new long[1] ;
      P000B3_n518Tran_RegionIdDestino = new boolean[] {false} ;
      P000B3_A49Tran_CodigoMovimiento = new String[] {""} ;
      P000B3_A51Tran_IdCuentadanteOrigen = new long[1] ;
      P000B3_n51Tran_IdCuentadanteOrigen = new boolean[] {false} ;
      P000B3_A52Tran_IdCuentadanteDestino = new long[1] ;
      P000B3_n52Tran_IdCuentadanteDestino = new boolean[] {false} ;
      P000B3_A46Tran_Id = new long[1] ;
      P000B3_A714Tran_EmailCuentadanteOrigen = new String[] {""} ;
      P000B3_n714Tran_EmailCuentadanteOrigen = new boolean[] {false} ;
      P000B3_A715Tran_EmailCuentadanteDestino = new String[] {""} ;
      P000B3_n715Tran_EmailCuentadanteDestino = new boolean[] {false} ;
      P000B3_A384Tran_NombCuentadanteOrigen = new String[] {""} ;
      P000B3_n384Tran_NombCuentadanteOrigen = new boolean[] {false} ;
      P000B3_A390Tran_FechaRatificacion = new java.util.Date[] {GXutil.nullDate()} ;
      P000B3_n390Tran_FechaRatificacion = new boolean[] {false} ;
      P000B3_A381Tran_DescripcionMovimiento = new String[] {""} ;
      P000B3_n381Tran_DescripcionMovimiento = new boolean[] {false} ;
      P000B3_A481Tran_IndE_S = new String[] {""} ;
      P000B3_n481Tran_IndE_S = new boolean[] {false} ;
      P000B3_A513Tran_ConsecutivoCC = new long[1] ;
      P000B3_n513Tran_ConsecutivoCC = new boolean[] {false} ;
      P000B3_A422Tran_RegionDescripcion = new String[] {""} ;
      P000B3_n422Tran_RegionDescripcion = new boolean[] {false} ;
      P000B3_A421Tran_RegionCodigo = new short[1] ;
      P000B3_n421Tran_RegionCodigo = new boolean[] {false} ;
      P000B3_A520Tran_RegionDescripcionDestino = new String[] {""} ;
      P000B3_n520Tran_RegionDescripcionDestino = new boolean[] {false} ;
      P000B3_A519Tran_RegionCodigoDestino = new short[1] ;
      P000B3_n519Tran_RegionCodigoDestino = new boolean[] {false} ;
      P000B3_A420Tran_CentroCostoDescripcion = new String[] {""} ;
      P000B3_n420Tran_CentroCostoDescripcion = new boolean[] {false} ;
      P000B3_A419Tran_CentroCostoCodigo = new String[] {""} ;
      P000B3_n419Tran_CentroCostoCodigo = new boolean[] {false} ;
      P000B3_A517Tran_CentroCostoDescripcionDes = new String[] {""} ;
      P000B3_n517Tran_CentroCostoDescripcionDes = new boolean[] {false} ;
      P000B3_A516Tran_CentroCostoCodigoDestino = new String[] {""} ;
      P000B3_n516Tran_CentroCostoCodigoDestino = new boolean[] {false} ;
      P000B3_A483Tran_ValorTransaccion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000B3_n483Tran_ValorTransaccion = new boolean[] {false} ;
      P000B3_A40000GXC1 = new long[1] ;
      P000B3_n40000GXC1 = new boolean[] {false} ;
      A49Tran_CodigoMovimiento = "" ;
      A714Tran_EmailCuentadanteOrigen = "" ;
      A715Tran_EmailCuentadanteDestino = "" ;
      A384Tran_NombCuentadanteOrigen = "" ;
      A390Tran_FechaRatificacion = GXutil.resetTime( GXutil.nullDate() );
      A381Tran_DescripcionMovimiento = "" ;
      A481Tran_IndE_S = "" ;
      A422Tran_RegionDescripcion = "" ;
      A520Tran_RegionDescripcionDestino = "" ;
      A420Tran_CentroCostoDescripcion = "" ;
      A419Tran_CentroCostoCodigo = "" ;
      A517Tran_CentroCostoDescripcionDes = "" ;
      A516Tran_CentroCostoCodigoDestino = "" ;
      A483Tran_ValorTransaccion = DecimalUtil.ZERO ;
      Gxm2sdtcorreotraspaso_emails = new com.orions2.SdtSDTCorreoTraspaso_emailsItem(remoteHandle, context);
      Gxm3sdtcorreotraspaso_cantidad = new com.orions2.SdtSDTCorreoTraspaso_cantidadItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.dpcorreotraspaso__default(),
         new Object[] {
             new Object[] {
            P000B3_A48Tran_CentroCostoId, P000B3_A50Tran_CentroCostoIdDestino, P000B3_n50Tran_CentroCostoIdDestino, P000B3_A57Tran_RegionId, P000B3_n57Tran_RegionId, P000B3_A518Tran_RegionIdDestino, P000B3_n518Tran_RegionIdDestino, P000B3_A49Tran_CodigoMovimiento, P000B3_A51Tran_IdCuentadanteOrigen, P000B3_n51Tran_IdCuentadanteOrigen,
            P000B3_A52Tran_IdCuentadanteDestino, P000B3_n52Tran_IdCuentadanteDestino, P000B3_A46Tran_Id, P000B3_A714Tran_EmailCuentadanteOrigen, P000B3_n714Tran_EmailCuentadanteOrigen, P000B3_A715Tran_EmailCuentadanteDestino, P000B3_n715Tran_EmailCuentadanteDestino, P000B3_A384Tran_NombCuentadanteOrigen, P000B3_n384Tran_NombCuentadanteOrigen, P000B3_A390Tran_FechaRatificacion,
            P000B3_n390Tran_FechaRatificacion, P000B3_A381Tran_DescripcionMovimiento, P000B3_n381Tran_DescripcionMovimiento, P000B3_A481Tran_IndE_S, P000B3_n481Tran_IndE_S, P000B3_A513Tran_ConsecutivoCC, P000B3_n513Tran_ConsecutivoCC, P000B3_A422Tran_RegionDescripcion, P000B3_n422Tran_RegionDescripcion, P000B3_A421Tran_RegionCodigo,
            P000B3_n421Tran_RegionCodigo, P000B3_A520Tran_RegionDescripcionDestino, P000B3_n520Tran_RegionDescripcionDestino, P000B3_A519Tran_RegionCodigoDestino, P000B3_n519Tran_RegionCodigoDestino, P000B3_A420Tran_CentroCostoDescripcion, P000B3_n420Tran_CentroCostoDescripcion, P000B3_A419Tran_CentroCostoCodigo, P000B3_n419Tran_CentroCostoCodigo, P000B3_A517Tran_CentroCostoDescripcionDes,
            P000B3_n517Tran_CentroCostoDescripcionDes, P000B3_A516Tran_CentroCostoCodigoDestino, P000B3_n516Tran_CentroCostoCodigoDestino, P000B3_A483Tran_ValorTransaccion, P000B3_n483Tran_ValorTransaccion, P000B3_A40000GXC1, P000B3_n40000GXC1
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A421Tran_RegionCodigo ;
   private short A519Tran_RegionCodigoDestino ;
   private short Gx_err ;
   private long AV5Tran_Id ;
   private long A48Tran_CentroCostoId ;
   private long A50Tran_CentroCostoIdDestino ;
   private long A57Tran_RegionId ;
   private long A518Tran_RegionIdDestino ;
   private long A51Tran_IdCuentadanteOrigen ;
   private long A52Tran_IdCuentadanteDestino ;
   private long A46Tran_Id ;
   private long A513Tran_ConsecutivoCC ;
   private long A40000GXC1 ;
   private java.math.BigDecimal A483Tran_ValorTransaccion ;
   private String scmdbuf ;
   private java.util.Date A390Tran_FechaRatificacion ;
   private boolean n50Tran_CentroCostoIdDestino ;
   private boolean n57Tran_RegionId ;
   private boolean n518Tran_RegionIdDestino ;
   private boolean n51Tran_IdCuentadanteOrigen ;
   private boolean n52Tran_IdCuentadanteDestino ;
   private boolean n714Tran_EmailCuentadanteOrigen ;
   private boolean n715Tran_EmailCuentadanteDestino ;
   private boolean n384Tran_NombCuentadanteOrigen ;
   private boolean n390Tran_FechaRatificacion ;
   private boolean n381Tran_DescripcionMovimiento ;
   private boolean n481Tran_IndE_S ;
   private boolean n513Tran_ConsecutivoCC ;
   private boolean n422Tran_RegionDescripcion ;
   private boolean n421Tran_RegionCodigo ;
   private boolean n520Tran_RegionDescripcionDestino ;
   private boolean n519Tran_RegionCodigoDestino ;
   private boolean n420Tran_CentroCostoDescripcion ;
   private boolean n419Tran_CentroCostoCodigo ;
   private boolean n517Tran_CentroCostoDescripcionDes ;
   private boolean n516Tran_CentroCostoCodigoDestino ;
   private boolean n483Tran_ValorTransaccion ;
   private boolean n40000GXC1 ;
   private String A49Tran_CodigoMovimiento ;
   private String A714Tran_EmailCuentadanteOrigen ;
   private String A715Tran_EmailCuentadanteDestino ;
   private String A384Tran_NombCuentadanteOrigen ;
   private String A381Tran_DescripcionMovimiento ;
   private String A481Tran_IndE_S ;
   private String A422Tran_RegionDescripcion ;
   private String A520Tran_RegionDescripcionDestino ;
   private String A420Tran_CentroCostoDescripcion ;
   private String A419Tran_CentroCostoCodigo ;
   private String A517Tran_CentroCostoDescripcionDes ;
   private String A516Tran_CentroCostoCodigoDestino ;
   private com.orions2.SdtSDTCorreoTraspaso[] aP1 ;
   private IDataStoreProvider pr_default ;
   private long[] P000B3_A48Tran_CentroCostoId ;
   private long[] P000B3_A50Tran_CentroCostoIdDestino ;
   private boolean[] P000B3_n50Tran_CentroCostoIdDestino ;
   private long[] P000B3_A57Tran_RegionId ;
   private boolean[] P000B3_n57Tran_RegionId ;
   private long[] P000B3_A518Tran_RegionIdDestino ;
   private boolean[] P000B3_n518Tran_RegionIdDestino ;
   private String[] P000B3_A49Tran_CodigoMovimiento ;
   private long[] P000B3_A51Tran_IdCuentadanteOrigen ;
   private boolean[] P000B3_n51Tran_IdCuentadanteOrigen ;
   private long[] P000B3_A52Tran_IdCuentadanteDestino ;
   private boolean[] P000B3_n52Tran_IdCuentadanteDestino ;
   private long[] P000B3_A46Tran_Id ;
   private String[] P000B3_A714Tran_EmailCuentadanteOrigen ;
   private boolean[] P000B3_n714Tran_EmailCuentadanteOrigen ;
   private String[] P000B3_A715Tran_EmailCuentadanteDestino ;
   private boolean[] P000B3_n715Tran_EmailCuentadanteDestino ;
   private String[] P000B3_A384Tran_NombCuentadanteOrigen ;
   private boolean[] P000B3_n384Tran_NombCuentadanteOrigen ;
   private java.util.Date[] P000B3_A390Tran_FechaRatificacion ;
   private boolean[] P000B3_n390Tran_FechaRatificacion ;
   private String[] P000B3_A381Tran_DescripcionMovimiento ;
   private boolean[] P000B3_n381Tran_DescripcionMovimiento ;
   private String[] P000B3_A481Tran_IndE_S ;
   private boolean[] P000B3_n481Tran_IndE_S ;
   private long[] P000B3_A513Tran_ConsecutivoCC ;
   private boolean[] P000B3_n513Tran_ConsecutivoCC ;
   private String[] P000B3_A422Tran_RegionDescripcion ;
   private boolean[] P000B3_n422Tran_RegionDescripcion ;
   private short[] P000B3_A421Tran_RegionCodigo ;
   private boolean[] P000B3_n421Tran_RegionCodigo ;
   private String[] P000B3_A520Tran_RegionDescripcionDestino ;
   private boolean[] P000B3_n520Tran_RegionDescripcionDestino ;
   private short[] P000B3_A519Tran_RegionCodigoDestino ;
   private boolean[] P000B3_n519Tran_RegionCodigoDestino ;
   private String[] P000B3_A420Tran_CentroCostoDescripcion ;
   private boolean[] P000B3_n420Tran_CentroCostoDescripcion ;
   private String[] P000B3_A419Tran_CentroCostoCodigo ;
   private boolean[] P000B3_n419Tran_CentroCostoCodigo ;
   private String[] P000B3_A517Tran_CentroCostoDescripcionDes ;
   private boolean[] P000B3_n517Tran_CentroCostoDescripcionDes ;
   private String[] P000B3_A516Tran_CentroCostoCodigoDestino ;
   private boolean[] P000B3_n516Tran_CentroCostoCodigoDestino ;
   private java.math.BigDecimal[] P000B3_A483Tran_ValorTransaccion ;
   private boolean[] P000B3_n483Tran_ValorTransaccion ;
   private long[] P000B3_A40000GXC1 ;
   private boolean[] P000B3_n40000GXC1 ;
   private com.orions2.SdtSDTCorreoTraspaso Gxm1sdtcorreotraspaso ;
   private com.orions2.SdtSDTCorreoTraspaso_emailsItem Gxm2sdtcorreotraspaso_emails ;
   private com.orions2.SdtSDTCorreoTraspaso_cantidadItem Gxm3sdtcorreotraspaso_cantidad ;
}

final  class dpcorreotraspaso__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000B3", "SELECT T1.Tran_CentroCostoId AS Tran_CentroCostoId, T1.Tran_CentroCostoIdDestino AS Tran_CentroCostoIdDestino, T1.Tran_RegionId AS Tran_RegionId, T1.Tran_RegionIdDestino AS Tran_RegionIdDestino, T1.Tran_CodigoMovimiento AS Tran_CodigoMovimiento, T1.Tran_IdCuentadanteOrigen AS Tran_IdCuentadanteOrigen, T1.Tran_IdCuentadanteDestino AS Tran_IdCuentadanteDestino, T1.Tran_Id, T7.Cuen_Email AS Tran_EmailCuentadanteOrigen, T8.Cuen_Email AS Tran_EmailCuentadanteDestino, T7.Cuen_Nombre AS Tran_NombCuentadanteOrigen, T1.Tran_FechaRatificacion, T6.Tpmo_Descripcion AS Tran_DescripcionMovimiento, T1.Tran_IndE_S AS Tran_IndE_S, T1.Tran_ConsecutivoCC, T4.Regi_Descripcion AS Tran_RegionDescripcion, T4.Regi_Cod AS Tran_RegionCodigo, T5.Regi_Descripcion AS Tran_RegionDescripcionDestino, T5.Regi_Cod AS Tran_RegionCodigoDestino, T2.Cent_Descripcion AS Tran_CentroCostoDescripcion, T2.Cent_Codigo AS Tran_CentroCostoCodigo, T3.Cent_Descripcion AS Tran_CentroCostoDescripcionDes, T3.Cent_Codigo AS Tran_CentroCostoCodigoDestino, T1.Tran_ValorTransaccion, COALESCE( T9.GXC1, 0) AS GXC1 FROM ((((((((ALM_TRANSACCION T1 INNER JOIN GEN_CENTROCOSTO T2 ON T2.Cent_Id = T1.Tran_CentroCostoId) LEFT JOIN GEN_CENTROCOSTO T3 ON T3.Cent_Id = T1.Tran_CentroCostoIdDestino) LEFT JOIN GEN_REGIONAL T4 ON T4.Regi_Id = T1.Tran_RegionId) LEFT JOIN GEN_REGIONAL T5 ON T5.Regi_Id = T1.Tran_RegionIdDestino) INNER JOIN ALM_TIPO_MOVIMIENTO T6 ON T6.Tpmo_Codigo = T1.Tran_CodigoMovimiento) LEFT JOIN ALM_CUENTADANTE T7 ON T7.Cuen_Identificacion = T1.Tran_IdCuentadanteOrigen) LEFT JOIN ALM_CUENTADANTE T8 ON T8.Cuen_Identificacion = T1.Tran_IdCuentadanteDestino) LEFT JOIN (SELECT SUM(TDet_Cantidad) AS GXC1, Tran_Id FROM ALM_DETALLE_TRANSACCION GROUP BY Tran_Id ) T9 ON T9.Tran_Id = T1.Tran_Id) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((long[]) buf[8])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(8) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((long[]) buf[25])[0] = rslt.getLong(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(24,2) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((long[]) buf[45])[0] = rslt.getLong(25) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
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

