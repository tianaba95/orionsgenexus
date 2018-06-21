/*
               File: Integracion
        Description: Integracion
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:3.32
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class integracion extends GXProcedure
{
   public integracion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( integracion.class ), "" );
   }

   public integracion( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public int executeUdp( long aP0 ,
                          String aP1 ,
                          String aP2 ,
                          String[] aP3 )
   {
      integracion.this.AV55Tran_Id = aP0;
      integracion.this.AV57Tran_IndE_S = aP1;
      integracion.this.AV43Tipo_Bien = aP2;
      integracion.this.AV62Tran_TipoEntra = aP3[0];
      this.aP3 = aP3;
      integracion.this.AV45Tran_CantidadPadres = aP4[0];
      this.aP4 = aP4;
      integracion.this.aP4 = new int[] {0};
      initialize();
      privateExecute();
      return aP4[0];
   }

   public void execute( long aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String[] aP3 ,
                        int[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( long aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 ,
                             int[] aP4 )
   {
      integracion.this.AV55Tran_Id = aP0;
      integracion.this.AV57Tran_IndE_S = aP1;
      integracion.this.AV43Tipo_Bien = aP2;
      integracion.this.AV62Tran_TipoEntra = aP3[0];
      this.aP3 = aP3;
      integracion.this.AV45Tran_CantidadPadres = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: 'INICIA_INTEGRACION' */
      S111 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'INICIA_INTEGRACION' Routine */
      AV85Usuario = AV86websession.getValue("Usuario") ;
      /* Execute user subroutine: 'DATOS_TRANSACCION' */
      S121 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV43Tipo_Bien, "D") == 0 )
      {
         /* Execute user subroutine: 'INTEGRA_DEVOLUTIVO' */
         S131 ();
         if (returnInSub) return;
      }
      else if ( GXutil.strcmp(AV43Tipo_Bien, "C") == 0 )
      {
         /* Execute user subroutine: 'INTEGRA_CONSUMO' */
         S141 ();
         if (returnInSub) return;
      }
   }

   public void S121( )
   {
      /* 'DATOS_TRANSACCION' Routine */
      AV18ConsecutivoItem = (short)(0) ;
      /* Using cursor P001D2 */
      pr_default.execute(0, new Object[] {new Long(AV55Tran_Id), new Long(AV55Tran_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A46Tran_Id = P001D2_A46Tran_Id[0] ;
         A57Tran_RegionId = P001D2_A57Tran_RegionId[0] ;
         n57Tran_RegionId = P001D2_n57Tran_RegionId[0] ;
         A48Tran_CentroCostoId = P001D2_A48Tran_CentroCostoId[0] ;
         A110Tran_ModuloOrigen = P001D2_A110Tran_ModuloOrigen[0] ;
         A109Tran_CodAlmaOrigen = P001D2_A109Tran_CodAlmaOrigen[0] ;
         A112Tran_CodBodeOrigen = P001D2_A112Tran_CodBodeOrigen[0] ;
         A51Tran_IdCuentadanteOrigen = P001D2_A51Tran_IdCuentadanteOrigen[0] ;
         n51Tran_IdCuentadanteOrigen = P001D2_n51Tran_IdCuentadanteOrigen[0] ;
         A55Tran_FechaRegistro = P001D2_A55Tran_FechaRegistro[0] ;
         A58Tran_Estado = P001D2_A58Tran_Estado[0] ;
         n58Tran_Estado = P001D2_n58Tran_Estado[0] ;
         /* Using cursor P001D3 */
         pr_default.execute(1, new Object[] {new Boolean(n57Tran_RegionId), new Long(A57Tran_RegionId)});
         A421Tran_RegionCodigo = P001D3_A421Tran_RegionCodigo[0] ;
         n421Tran_RegionCodigo = P001D3_n421Tran_RegionCodigo[0] ;
         AV61Tran_RegionId = A57Tran_RegionId ;
         AV60Tran_RegionCodigo = A421Tran_RegionCodigo ;
         AV47Tran_CentroCostoId = A48Tran_CentroCostoId ;
         AV59Tran_ModuloOrigen = A110Tran_ModuloOrigen ;
         AV49Tran_CodAlmaOrigen = A109Tran_CodAlmaOrigen ;
         AV51Tran_CodBodeOrigen = A112Tran_CodBodeOrigen ;
         AV56Tran_IdCuentadanteOrigen = A51Tran_IdCuentadanteOrigen ;
         A55Tran_FechaRegistro = GXutil.now( ) ;
         A58Tran_Estado = "P" ;
         n58Tran_Estado = false ;
         /* Using cursor P001D4 */
         pr_default.execute(2, new Object[] {A55Tran_FechaRegistro, new Boolean(n58Tran_Estado), A58Tran_Estado, new Long(A46Tran_Id)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      pr_default.close(1);
   }

   public void S131( )
   {
      /* 'INTEGRA_DEVOLUTIVO' Routine */
      if ( ( GXutil.strcmp(AV57Tran_IndE_S, "S") == 0 ) || ( GXutil.strcmp(AV57Tran_IndE_S, "T") == 0 ) || ( GXutil.strcmp(AV57Tran_IndE_S, "R") == 0 ) )
      {
         /* Execute user subroutine: 'INTEGRA_SALIDA_DEVOLUTIVO' */
         S151 ();
         if (returnInSub) return;
      }
      else if ( GXutil.strcmp(AV57Tran_IndE_S, "E") == 0 )
      {
         if ( GXutil.strcmp(AV62Tran_TipoEntra, "ELSP") == 0 )
         {
            /* Execute user subroutine: 'INTEGRA_ENTRA_DEVOLUTIVO_ELSP_NEUP_UEUP' */
            S161 ();
            if (returnInSub) return;
         }
         else if ( GXutil.strcmp(AV62Tran_TipoEntra, "NEUP") == 0 )
         {
            /* Execute user subroutine: 'INTEGRA_ENTRA_DEVOLUTIVO_ELSP_NEUP_UEUP' */
            S161 ();
            if (returnInSub) return;
         }
         else if ( GXutil.strcmp(AV62Tran_TipoEntra, "UEUP") == 0 )
         {
            /* Execute user subroutine: 'INTEGRA_ENTRA_DEVOLUTIVO_ELSP_NEUP_UEUP' */
            S161 ();
            if (returnInSub) return;
         }
         GXv_int1[0] = AV55Tran_Id ;
         GXv_char2[0] = "RAT" ;
         GXv_char3[0] = AV62Tran_TipoEntra ;
         GXv_char4[0] = AV85Usuario ;
         new com.orions2.pratifientdev(remoteHandle, context).execute( GXv_int1, GXv_char2, GXv_char3, GXv_char4) ;
         integracion.this.AV55Tran_Id = GXv_int1[0] ;
         integracion.this.AV62Tran_TipoEntra = GXv_char3[0] ;
         integracion.this.AV85Usuario = GXv_char4[0] ;
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "integracion");
      }
   }

   public void S151( )
   {
      /* 'INTEGRA_SALIDA_DEVOLUTIVO' Routine */
      /* Using cursor P001D5 */
      pr_default.execute(3, new Object[] {new Long(AV55Tran_Id)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A78NUMTRN = P001D5_A78NUMTRN[0] ;
         A530PLACASENA = P001D5_A530PLACASENA[0] ;
         n530PLACASENA = P001D5_n530PLACASENA[0] ;
         A79ID_SALIDA = P001D5_A79ID_SALIDA[0] ;
         AV38PLACASENA = A530PLACASENA ;
         /* Execute user subroutine: 'BUSCAR_DATOS_PLACA' */
         S173 ();
         if ( returnInSub )
         {
            pr_default.close(3);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      GXv_int1[0] = AV55Tran_Id ;
      GXv_objcol_SdtSDTInvDevoSel_SDTInvDevoSelItem5[0] = AV74SDTInvDevoSel ;
      new com.orions2.psalidadevmultiple(remoteHandle, context).execute( GXv_int1, GXv_objcol_SdtSDTInvDevoSel_SDTInvDevoSelItem5) ;
      integracion.this.AV55Tran_Id = GXv_int1[0] ;
      AV74SDTInvDevoSel = GXv_objcol_SdtSDTInvDevoSel_SDTInvDevoSelItem5[0] ;
   }

   public void S173( )
   {
      /* 'BUSCAR_DATOS_PLACA' Routine */
      /* Using cursor P001D6 */
      pr_default.execute(4, new Object[] {AV38PLACASENA});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A67Invd_NumeroPlaca = P001D6_A67Invd_NumeroPlaca[0] ;
         A66Elem_Consecutivo = P001D6_A66Elem_Consecutivo[0] ;
         A501Invd_EsPlacaPadre = P001D6_A501Invd_EsPlacaPadre[0] ;
         n501Invd_EsPlacaPadre = P001D6_n501Invd_EsPlacaPadre[0] ;
         A629Costo_Total_Dev = P001D6_A629Costo_Total_Dev[0] ;
         A68Invd_PlacaPadre = P001D6_A68Invd_PlacaPadre[0] ;
         n68Invd_PlacaPadre = P001D6_n68Invd_PlacaPadre[0] ;
         AV22Elem_Consecutivo = A66Elem_Consecutivo ;
         AV27Invd_EsPlacaPadre = A501Invd_EsPlacaPadre ;
         AV76Costo_Total_Dev = A629Costo_Total_Dev ;
         AV29Invd_PlacaPadre = A68Invd_PlacaPadre ;
         AV28Invd_NumeroPlaca = A67Invd_NumeroPlaca ;
         /* Execute user subroutine: 'BUSCA_TRANSACCION_ENTRADA' */
         S184 ();
         if ( returnInSub )
         {
            pr_default.close(4);
            returnInSub = true;
            if (true) return;
         }
         /* Execute user subroutine: 'CARGA_SDT_DEVOLUTIVO' */
         S194 ();
         if ( returnInSub )
         {
            pr_default.close(4);
            returnInSub = true;
            if (true) return;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void S184( )
   {
      /* 'BUSCA_TRANSACCION_ENTRADA' Routine */
      /* Using cursor P001D7 */
      pr_default.execute(5, new Object[] {AV38PLACASENA});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A490TDet_PlacaNumero = P001D7_A490TDet_PlacaNumero[0] ;
         n490TDet_PlacaNumero = P001D7_n490TDet_PlacaNumero[0] ;
         A481Tran_IndE_S = P001D7_A481Tran_IndE_S[0] ;
         n481Tran_IndE_S = P001D7_n481Tran_IndE_S[0] ;
         A46Tran_Id = P001D7_A46Tran_Id[0] ;
         A69TDet_Consecutivo = P001D7_A69TDet_Consecutivo[0] ;
         A481Tran_IndE_S = P001D7_A481Tran_IndE_S[0] ;
         n481Tran_IndE_S = P001D7_n481Tran_IndE_S[0] ;
         AV78eTran_Id = A46Tran_Id ;
         AV77eTDet_Consecutivo = A69TDet_Consecutivo ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void S194( )
   {
      /* 'CARGA_SDT_DEVOLUTIVO' Routine */
      AV75SDTInvDevoSelItem = (com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)new com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem(remoteHandle, context);
      AV75SDTInvDevoSelItem.setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_numeroplaca( AV38PLACASENA );
      AV75SDTInvDevoSelItem.setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Elem_consecutivo( AV22Elem_Consecutivo );
      AV75SDTInvDevoSelItem.setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Costo_total_dev( AV76Costo_Total_Dev );
      AV75SDTInvDevoSelItem.setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_seleccion( "1" );
      AV75SDTInvDevoSelItem.setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_entrada( AV78eTran_Id );
      AV75SDTInvDevoSelItem.setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_nrolinea( (int)(AV77eTDet_Consecutivo) );
      AV74SDTInvDevoSel.add(AV75SDTInvDevoSelItem, 0);
   }

   public void S161( )
   {
      /* 'INTEGRA_ENTRA_DEVOLUTIVO_ELSP_NEUP_UEUP' Routine */
      /* Using cursor P001D8 */
      pr_default.execute(6, new Object[] {new Long(AV55Tran_Id)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A83NROTRANSACCION = P001D8_A83NROTRANSACCION[0] ;
         A537CONSECUTIVOENTRADA = P001D8_A537CONSECUTIVOENTRADA[0] ;
         n537CONSECUTIVOENTRADA = P001D8_n537CONSECUTIVOENTRADA[0] ;
         A686INDICADORPHI = P001D8_A686INDICADORPHI[0] ;
         A538COSTOADQUISICION = P001D8_A538COSTOADQUISICION[0] ;
         n538COSTOADQUISICION = P001D8_n538COSTOADQUISICION[0] ;
         A644OTROSCOSTOS = P001D8_A644OTROSCOSTOS[0] ;
         A645VALORFUTURO = P001D8_A645VALORFUTURO[0] ;
         A646INTERES = P001D8_A646INTERES[0] ;
         A647TIEMPO = P001D8_A647TIEMPO[0] ;
         A648VIDAUTIL = P001D8_A648VIDAUTIL[0] ;
         A84IDCARMAS = P001D8_A84IDCARMAS[0] ;
         AV23IDCARMAS = A84IDCARMAS ;
         AV17CONSECUTIVOENTRA = A537CONSECUTIVOENTRADA ;
         AV24INDICADORPHI = A686INDICADORPHI ;
         AV80COSTOADQUI = A538COSTOADQUISICION ;
         AV36OTROSCOSTOS = A644OTROSCOSTOS ;
         AV65VALORFUTURO = A645VALORFUTURO ;
         AV26INTERES = A646INTERES ;
         AV42TIEMPO = A647TIEMPO ;
         AV67VIDAUTIL = A648VIDAUTIL ;
         /* Execute user subroutine: 'CARGA_SDT_DEVOLUTIVO_ENTRADA' */
         S206 ();
         if ( returnInSub )
         {
            pr_default.close(6);
            returnInSub = true;
            if (true) return;
         }
         /* Execute user subroutine: 'INTEGRA_ATRIBUTOS' */
         S216 ();
         if ( returnInSub )
         {
            pr_default.close(6);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void S206( )
   {
      /* 'CARGA_SDT_DEVOLUTIVO_ENTRADA' Routine */
      AV15Cons_Numero = "" ;
      GXv_char4[0] = "PLACA" ;
      GXv_int1[0] = AV47Tran_CentroCostoId ;
      GXv_char3[0] = AV15Cons_Numero ;
      new com.orions2.cons_tran_pla(remoteHandle, context).execute( GXv_char4, GXv_int1, GXv_char3) ;
      integracion.this.AV47Tran_CentroCostoId = GXv_int1[0] ;
      integracion.this.AV15Cons_Numero = GXv_char3[0] ;
      /* Execute user subroutine: 'CONSULTAULTIMOCONSE' */
      S221 ();
      if (returnInSub) return;
      if ( ( ( DecimalUtil.compareTo(AV26INTERES, DecimalUtil.ZERO) == 0 ) && ( AV42TIEMPO == 0 ) ) || ( ( AV26INTERES.doubleValue() == 0 ) && ( AV42TIEMPO == 0 ) ) || ( ( DecimalUtil.compareTo(AV26INTERES, DecimalUtil.ZERO) == 0 ) && ( AV42TIEMPO == 0 ) ) || ( ( AV26INTERES.doubleValue() == 0 ) && ( AV42TIEMPO == 0 ) ) )
      {
         AV95Valor_presente = (short)(0) ;
      }
      else
      {
         /* Execute user subroutine: 'CALCULARDESMANTELAMIENTO' */
         S231 ();
         if (returnInSub) return;
      }
      AV83Total_Costos = AV80COSTOADQUI.add(AV36OTROSCOSTOS).add(DecimalUtil.doubleToDec(AV95Valor_presente)) ;
      AV81SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tran_id( AV55Tran_Id );
      AV81SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_consecutivo( AV84TDet_Consecutivo );
      AV81SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Elem_consecutivo( AV17CONSECUTIVOENTRA );
      AV81SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_cantidad( 1 );
      AV81SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_valorunitario( AV80COSTOADQUI );
      AV81SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_valortotal( AV83Total_Costos );
      AV81SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_placanumero( GXutil.trim( AV15Cons_Numero) );
      AV81SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_placapadre( "" );
      if ( GXutil.strcmp(AV62Tran_TipoEntra, "ELSP") == 0 )
      {
         AV81SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_espadre( "NA" );
         AV81SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_placapadre( "" );
      }
      else if ( GXutil.strcmp(AV62Tran_TipoEntra, "NEUP") == 0 )
      {
         if ( AV24INDICADORPHI == 1 )
         {
            AV41TDet_PlacaPadre = "" ;
            AV81SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_espadre( "SI" );
            AV81SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_placapadre( "" );
            AV41TDet_PlacaPadre = GXutil.trim( AV15Cons_Numero) ;
         }
         else
         {
            AV81SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_espadre( "NO" );
            AV81SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_placapadre( AV41TDet_PlacaPadre );
         }
      }
      else if ( GXutil.strcmp(AV62Tran_TipoEntra, "UEUP") == 0 )
      {
         if ( AV24INDICADORPHI == 1 )
         {
            AV41TDet_PlacaPadre = "" ;
            AV81SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_espadre( "SI" );
            AV81SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_placapadre( "" );
            AV41TDet_PlacaPadre = GXutil.trim( AV15Cons_Numero) ;
         }
         else if ( AV24INDICADORPHI > 1 )
         {
            AV81SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_espadre( "NO" );
            AV81SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_placapadre( AV41TDet_PlacaPadre );
         }
         else if ( AV24INDICADORPHI == 0 )
         {
            AV81SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_espadre( "NA" );
            AV81SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_placapadre( "" );
         }
      }
      AV81SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_atributos( "NO" );
      AV81SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_valor_presente( DecimalUtil.doubleToDec(AV95Valor_presente) );
      AV81SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_valor_futuro( AV65VALORFUTURO );
      AV81SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_taza( (short)(DecimalUtil.decToDouble(AV26INTERES)) );
      AV81SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_plazo_n( (byte)(AV42TIEMPO) );
      AV81SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_otros_costos( AV36OTROSCOSTOS );
      AV81SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_agrupado( (short)(-1) );
      AV81SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_placarecuperada( "" );
      GXv_SdtSDTDetalleTrn6[0] = AV81SDTDetalleTrn;
      GXv_char4[0] = AV62Tran_TipoEntra ;
      new com.orions2.pentradevo(remoteHandle, context).execute( GXv_SdtSDTDetalleTrn6, GXv_char4) ;
      AV81SDTDetalleTrn = GXv_SdtSDTDetalleTrn6[0] ;
      integracion.this.AV62Tran_TipoEntra = GXv_char4[0] ;
   }

   public void S141( )
   {
      /* 'INTEGRA_CONSUMO' Routine */
      if ( GXutil.strcmp(AV57Tran_IndE_S, "E") == 0 )
      {
         /* Execute user subroutine: 'INTEGRA_ENTRADA_CONSUMO' */
         S241 ();
         if (returnInSub) return;
         GXv_int1[0] = AV55Tran_Id ;
         GXv_char4[0] = "RAT" ;
         GXv_char3[0] = "" ;
         GXv_char2[0] = AV85Usuario ;
         new com.orions2.pratifientcon(remoteHandle, context).execute( GXv_int1, GXv_char4, GXv_char3, GXv_char2) ;
         integracion.this.AV55Tran_Id = GXv_int1[0] ;
         integracion.this.AV85Usuario = GXv_char2[0] ;
      }
      else if ( ( GXutil.strcmp(AV57Tran_IndE_S, "S") == 0 ) || ( GXutil.strcmp(AV57Tran_IndE_S, "R") == 0 ) )
      {
         /* Execute user subroutine: 'INTEGRA_SALIDA_CONSUMO' */
         S251 ();
         if (returnInSub) return;
      }
   }

   public void S241( )
   {
      /* 'INTEGRA_ENTRADA_CONSUMO' Routine */
      /* Using cursor P001D9 */
      pr_default.execute(7, new Object[] {new Long(AV55Tran_Id)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A83NROTRANSACCION = P001D9_A83NROTRANSACCION[0] ;
         A537CONSECUTIVOENTRADA = P001D9_A537CONSECUTIVOENTRADA[0] ;
         n537CONSECUTIVOENTRADA = P001D9_n537CONSECUTIVOENTRADA[0] ;
         A601CANTIDADENTRADA = P001D9_A601CANTIDADENTRADA[0] ;
         n601CANTIDADENTRADA = P001D9_n601CANTIDADENTRADA[0] ;
         A538COSTOADQUISICION = P001D9_A538COSTOADQUISICION[0] ;
         n538COSTOADQUISICION = P001D9_n538COSTOADQUISICION[0] ;
         A644OTROSCOSTOS = P001D9_A644OTROSCOSTOS[0] ;
         A84IDCARMAS = P001D9_A84IDCARMAS[0] ;
         AV23IDCARMAS = A84IDCARMAS ;
         AV17CONSECUTIVOENTRA = A537CONSECUTIVOENTRADA ;
         AV13CANTIDADENTRADA = A601CANTIDADENTRADA ;
         AV80COSTOADQUI = A538COSTOADQUISICION ;
         AV36OTROSCOSTOS = A644OTROSCOSTOS ;
         /* Execute user subroutine: 'CARGA_SDT_CONSUMO' */
         S267 ();
         if ( returnInSub )
         {
            pr_default.close(7);
            returnInSub = true;
            if (true) return;
         }
         /* Execute user subroutine: 'INTEGRA_ATRIBUTOS' */
         S216 ();
         if ( returnInSub )
         {
            pr_default.close(7);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void S267( )
   {
      /* 'CARGA_SDT_CONSUMO' Routine */
      AV83Total_Costos = AV80COSTOADQUI.add((AV36OTROSCOSTOS.divide(DecimalUtil.doubleToDec(AV13CANTIDADENTRADA), 18, java.math.BigDecimal.ROUND_DOWN))) ;
      AV81SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_cantidad( AV13CANTIDADENTRADA );
      AV81SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Elem_consecutivo( AV17CONSECUTIVOENTRA );
      AV81SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_valorunitario( AV80COSTOADQUI );
      AV81SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_valortotal( AV83Total_Costos.multiply(DecimalUtil.doubleToDec(AV13CANTIDADENTRADA)) );
      AV81SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_otros_costos( AV36OTROSCOSTOS.divide(DecimalUtil.doubleToDec(AV13CANTIDADENTRADA), 18, java.math.BigDecimal.ROUND_DOWN) );
      GXv_SdtSDTDetalleTrn6[0] = AV81SDTDetalleTrn;
      GXv_char4[0] = "INS" ;
      GXv_int1[0] = AV55Tran_Id ;
      GXv_int7[0] = (short)(DecimalUtil.decToDouble(AV111Swerror)) ;
      GXv_int8[0] = AV84TDet_Consecutivo ;
      new com.orions2.pentraconsu(remoteHandle, context).execute( GXv_SdtSDTDetalleTrn6, GXv_char4, GXv_int1, GXv_int7, GXv_int8) ;
      AV81SDTDetalleTrn = GXv_SdtSDTDetalleTrn6[0] ;
      integracion.this.AV55Tran_Id = GXv_int1[0] ;
      integracion.this.AV111Swerror = DecimalUtil.doubleToDec(GXv_int7[0]) ;
      integracion.this.AV84TDet_Consecutivo = GXv_int8[0] ;
   }

   public void S216( )
   {
      /* 'INTEGRA_ATRIBUTOS' Routine */
      /* Using cursor P001D10 */
      pr_default.execute(8, new Object[] {new Long(AV55Tran_Id), new Short(AV23IDCARMAS)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A81ID_ENTRADA = P001D10_A81ID_ENTRADA[0] ;
         A80NUMEROTRN = P001D10_A80NUMEROTRN[0] ;
         A535ATRIBUTO = P001D10_A535ATRIBUTO[0] ;
         n535ATRIBUTO = P001D10_n535ATRIBUTO[0] ;
         A536VALORATRIBUTO = P001D10_A536VALORATRIBUTO[0] ;
         n536VALORATRIBUTO = P001D10_n536VALORATRIBUTO[0] ;
         A82IDATRIBUTO = P001D10_A82IDATRIBUTO[0] ;
         AV10ATRIBUTO = GXutil.trim( A535ATRIBUTO) ;
         AV64VALORATRIBUTO = GXutil.trim( A536VALORATRIBUTO) ;
         /* Execute user subroutine: 'DATOS_ATRIBUTOS' */
         S278 ();
         if ( returnInSub )
         {
            pr_default.close(8);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(8);
      }
      pr_default.close(8);
      GXv_int8[0] = AV55Tran_Id ;
      GXv_int1[0] = AV84TDet_Consecutivo ;
      GXv_objcol_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem9[0] = AV88SDTDetalleTrnAtr ;
      GXv_char4[0] = "EXC" ;
      GXv_char3[0] = AV22Elem_Consecutivo ;
      new com.orions2.pentraconsudet(remoteHandle, context).execute( GXv_int8, GXv_int1, GXv_objcol_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem9, GXv_char4, GXv_char3) ;
      integracion.this.AV55Tran_Id = GXv_int8[0] ;
      integracion.this.AV84TDet_Consecutivo = GXv_int1[0] ;
      AV88SDTDetalleTrnAtr = GXv_objcol_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem9[0] ;
      integracion.this.AV22Elem_Consecutivo = GXv_char3[0] ;
      AV88SDTDetalleTrnAtr.clear();
   }

   public void S278( )
   {
      /* 'DATOS_ATRIBUTOS' Routine */
      /* Using cursor P001D11 */
      pr_default.execute(9, new Object[] {AV10ATRIBUTO});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A393List_Descripcion = P001D11_A393List_Descripcion[0] ;
         A36List_Id = P001D11_A36List_Id[0] ;
         AV31List_Id = A36List_Id ;
         pr_default.readNext(9);
      }
      pr_default.close(9);
      /* Execute user subroutine: 'CARGA_SDT_ATRIBUTOS' */
      S281 ();
      if (returnInSub) return;
   }

   public void S281( )
   {
      /* 'CARGA_SDT_ATRIBUTOS' Routine */
      AV89SDTDetalleTrnAtrItem.setgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listid( AV31List_Id );
      AV89SDTDetalleTrnAtrItem.setgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_valoratributo( AV64VALORATRIBUTO );
      AV88SDTDetalleTrnAtr.add(AV89SDTDetalleTrnAtrItem, 0);
      AV89SDTDetalleTrnAtrItem = (com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem)new com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem(remoteHandle, context);
   }

   public void S221( )
   {
      /* 'CONSULTAULTIMOCONSE' Routine */
      /* Using cursor P001D12 */
      pr_default.execute(10, new Object[] {new Long(AV55Tran_Id)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A46Tran_Id = P001D12_A46Tran_Id[0] ;
         A69TDet_Consecutivo = P001D12_A69TDet_Consecutivo[0] ;
         AV84TDet_Consecutivo = A69TDet_Consecutivo ;
         pr_default.readNext(10);
      }
      pr_default.close(10);
      AV84TDet_Consecutivo = (long)(AV84TDet_Consecutivo+1) ;
   }

   public void S231( )
   {
      /* 'CALCULARDESMANTELAMIENTO' Routine */
      AV96A = DecimalUtil.doubleToDec(1).add((AV26INTERES.divide(DecimalUtil.doubleToDec(100), 18, java.math.BigDecimal.ROUND_DOWN))) ;
      AV98N = AV42TIEMPO ;
      AV97VF = AV65VALORFUTURO ;
      /* User Code */
       java.math.BigDecimal a = AV96A;
      /* User Code */
       double _b 	= AV98N;
      /* User Code */
       double _a 	= a.doubleValue();
      /* User Code */
       double _c 	= java.lang.Math.pow(_a,_b);
      /* User Code */
       AV99C 	=  new java.math.BigDecimal(_c);
      AV95Valor_presente = (short)(DecimalUtil.decToDouble(AV97VF.divide(AV99C, 18, java.math.BigDecimal.ROUND_DOWN))) ;
   }

   public void S251( )
   {
      /* 'INTEGRA_SALIDA_CONSUMO' Routine */
      /* Using cursor P001D13 */
      pr_default.execute(11, new Object[] {new Long(AV55Tran_Id)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A78NUMTRN = P001D13_A78NUMTRN[0] ;
         A553CONSECUTIVO = P001D13_A553CONSECUTIVO[0] ;
         n553CONSECUTIVO = P001D13_n553CONSECUTIVO[0] ;
         A554CANTIDAD = P001D13_A554CANTIDAD[0] ;
         n554CANTIDAD = P001D13_n554CANTIDAD[0] ;
         A79ID_SALIDA = P001D13_A79ID_SALIDA[0] ;
         AV16CONSECUTIVO = GXutil.trim( A553CONSECUTIVO) ;
         AV11CANTIDAD = A554CANTIDAD ;
         /* Execute user subroutine: 'INTEGRA SALIDA CONSUMO' */
         S2911 ();
         if ( returnInSub )
         {
            pr_default.close(11);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(11);
      }
      pr_default.close(11);
      GXv_int8[0] = AV55Tran_Id ;
      GXv_objcol_SdtSDTInvenConsumo_SDTInvenConsumoItem10[0] = AV101SDTInvenConsumo ;
      new com.orions2.psalidaconsumo(remoteHandle, context).execute( GXv_int8, GXv_objcol_SdtSDTInvenConsumo_SDTInvenConsumoItem10) ;
      integracion.this.AV55Tran_Id = GXv_int8[0] ;
      AV101SDTInvenConsumo = GXv_objcol_SdtSDTInvenConsumo_SDTInvenConsumoItem10[0] ;
   }

   public void S2911( )
   {
      /* 'INTEGRA SALIDA CONSUMO' Routine */
      AV34Nro_Linea = 0 ;
      /* Using cursor P001D14 */
      pr_default.execute(12, new Object[] {new Long(AV61Tran_RegionId), new Long(AV47Tran_CentroCostoId), AV59Tran_ModuloOrigen, AV49Tran_CodAlmaOrigen, AV51Tran_CodBodeOrigen, AV16CONSECUTIVO});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A91Regional = P001D14_A91Regional[0] ;
         A92Centro_Id = P001D14_A92Centro_Id[0] ;
         A27Alma_Modulo = P001D14_A27Alma_Modulo[0] ;
         A28Alma_Codigo = P001D14_A28Alma_Codigo[0] ;
         A31Bode_Codigo = P001D14_A31Bode_Codigo[0] ;
         A66Elem_Consecutivo = P001D14_A66Elem_Consecutivo[0] ;
         A618Cantidad_Diponible = P001D14_A618Cantidad_Diponible[0] ;
         n618Cantidad_Diponible = P001D14_n618Cantidad_Diponible[0] ;
         A93Trans_Id = P001D14_A93Trans_Id[0] ;
         A94Num_Linea = P001D14_A94Num_Linea[0] ;
         A709Trans_FechaRatificacion = P001D14_A709Trans_FechaRatificacion[0] ;
         n709Trans_FechaRatificacion = P001D14_n709Trans_FechaRatificacion[0] ;
         A709Trans_FechaRatificacion = P001D14_A709Trans_FechaRatificacion[0] ;
         n709Trans_FechaRatificacion = P001D14_n709Trans_FechaRatificacion[0] ;
         AV53Tran_Entrada = A93Trans_Id ;
         if ( A618Cantidad_Diponible <= AV11CANTIDAD )
         {
            AV34Nro_Linea = A94Num_Linea ;
            AV71Cantidad_des = (short)(A618Cantidad_Diponible) ;
            AV11CANTIDAD = (short)(AV11CANTIDAD-AV71Cantidad_des) ;
            /* Execute user subroutine: 'CARGA_SDT_CONSUMO_SALIDA' */
            S3012 ();
            if ( returnInSub )
            {
               pr_default.close(12);
               pr_default.close(12);
               returnInSub = true;
               if (true) return;
            }
         }
         if ( A618Cantidad_Diponible > AV11CANTIDAD )
         {
            AV34Nro_Linea = A94Num_Linea ;
            AV71Cantidad_des = AV11CANTIDAD ;
            AV11CANTIDAD = (short)(AV11CANTIDAD-AV71Cantidad_des) ;
            /* Execute user subroutine: 'CARGA_SDT_CONSUMO_SALIDA' */
            S3012 ();
            if ( returnInSub )
            {
               pr_default.close(12);
               pr_default.close(12);
               returnInSub = true;
               if (true) return;
            }
         }
         if ( AV11CANTIDAD == 0 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(12);
      }
      pr_default.close(12);
   }

   public void S3012( )
   {
      /* 'CARGA_SDT_CONSUMO_SALIDA' Routine */
      AV102SDTInvenConsumoItem = (com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)new com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem(remoteHandle, context);
      AV102SDTInvenConsumoItem.setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Regional( AV61Tran_RegionId );
      AV102SDTInvenConsumoItem.setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Centro_id( AV47Tran_CentroCostoId );
      AV102SDTInvenConsumoItem.setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_modulo( AV59Tran_ModuloOrigen );
      AV102SDTInvenConsumoItem.setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_codigo( AV49Tran_CodAlmaOrigen );
      AV102SDTInvenConsumoItem.setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Bode_codigo( AV51Tran_CodBodeOrigen );
      AV102SDTInvenConsumoItem.setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Trans_id( AV53Tran_Entrada );
      AV102SDTInvenConsumoItem.setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_consecutivo( AV16CONSECUTIVO );
      AV102SDTInvenConsumoItem.setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Num_linea( AV34Nro_Linea );
      AV102SDTInvenConsumoItem.setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_solicitada( AV71Cantidad_des );
      AV101SDTInvenConsumo.add(AV102SDTInvenConsumoItem, 0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = integracion.this.AV62Tran_TipoEntra;
      this.aP4[0] = integracion.this.AV45Tran_CantidadPadres;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "integracion");
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV85Usuario = "" ;
      AV86websession = httpContext.getWebSession();
      scmdbuf = "" ;
      P001D2_A46Tran_Id = new long[1] ;
      P001D2_A57Tran_RegionId = new long[1] ;
      P001D2_n57Tran_RegionId = new boolean[] {false} ;
      P001D2_A48Tran_CentroCostoId = new long[1] ;
      P001D2_A110Tran_ModuloOrigen = new String[] {""} ;
      P001D2_A109Tran_CodAlmaOrigen = new String[] {""} ;
      P001D2_A112Tran_CodBodeOrigen = new String[] {""} ;
      P001D2_A51Tran_IdCuentadanteOrigen = new long[1] ;
      P001D2_n51Tran_IdCuentadanteOrigen = new boolean[] {false} ;
      P001D2_A55Tran_FechaRegistro = new java.util.Date[] {GXutil.nullDate()} ;
      P001D2_A58Tran_Estado = new String[] {""} ;
      P001D2_n58Tran_Estado = new boolean[] {false} ;
      A110Tran_ModuloOrigen = "" ;
      A109Tran_CodAlmaOrigen = "" ;
      A112Tran_CodBodeOrigen = "" ;
      A55Tran_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      A58Tran_Estado = "" ;
      P001D3_A421Tran_RegionCodigo = new short[1] ;
      P001D3_n421Tran_RegionCodigo = new boolean[] {false} ;
      AV59Tran_ModuloOrigen = "" ;
      AV49Tran_CodAlmaOrigen = "" ;
      AV51Tran_CodBodeOrigen = "" ;
      P001D5_A78NUMTRN = new long[1] ;
      P001D5_A530PLACASENA = new String[] {""} ;
      P001D5_n530PLACASENA = new boolean[] {false} ;
      P001D5_A79ID_SALIDA = new short[1] ;
      A530PLACASENA = "" ;
      AV38PLACASENA = "" ;
      AV74SDTInvDevoSel = new GXBaseCollection<com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem>(com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem.class, "SDTInvDevoSel.SDTInvDevoSelItem", "ACBSENA", remoteHandle);
      GXv_objcol_SdtSDTInvDevoSel_SDTInvDevoSelItem5 = new GXBaseCollection [1] ;
      P001D6_A67Invd_NumeroPlaca = new String[] {""} ;
      P001D6_A66Elem_Consecutivo = new String[] {""} ;
      P001D6_A501Invd_EsPlacaPadre = new String[] {""} ;
      P001D6_n501Invd_EsPlacaPadre = new boolean[] {false} ;
      P001D6_A629Costo_Total_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001D6_A68Invd_PlacaPadre = new String[] {""} ;
      P001D6_n68Invd_PlacaPadre = new boolean[] {false} ;
      A67Invd_NumeroPlaca = "" ;
      A66Elem_Consecutivo = "" ;
      A501Invd_EsPlacaPadre = "" ;
      A629Costo_Total_Dev = DecimalUtil.ZERO ;
      A68Invd_PlacaPadre = "" ;
      AV22Elem_Consecutivo = "" ;
      AV27Invd_EsPlacaPadre = "" ;
      AV76Costo_Total_Dev = DecimalUtil.ZERO ;
      AV29Invd_PlacaPadre = "" ;
      AV28Invd_NumeroPlaca = "" ;
      P001D7_A490TDet_PlacaNumero = new String[] {""} ;
      P001D7_n490TDet_PlacaNumero = new boolean[] {false} ;
      P001D7_A481Tran_IndE_S = new String[] {""} ;
      P001D7_n481Tran_IndE_S = new boolean[] {false} ;
      P001D7_A46Tran_Id = new long[1] ;
      P001D7_A69TDet_Consecutivo = new long[1] ;
      A490TDet_PlacaNumero = "" ;
      A481Tran_IndE_S = "" ;
      AV75SDTInvDevoSelItem = new com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem(remoteHandle, context);
      P001D8_A83NROTRANSACCION = new long[1] ;
      P001D8_A537CONSECUTIVOENTRADA = new String[] {""} ;
      P001D8_n537CONSECUTIVOENTRADA = new boolean[] {false} ;
      P001D8_A686INDICADORPHI = new short[1] ;
      P001D8_A538COSTOADQUISICION = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001D8_n538COSTOADQUISICION = new boolean[] {false} ;
      P001D8_A644OTROSCOSTOS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001D8_A645VALORFUTURO = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001D8_A646INTERES = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001D8_A647TIEMPO = new short[1] ;
      P001D8_A648VIDAUTIL = new short[1] ;
      P001D8_A84IDCARMAS = new short[1] ;
      A537CONSECUTIVOENTRADA = "" ;
      A538COSTOADQUISICION = DecimalUtil.ZERO ;
      A644OTROSCOSTOS = DecimalUtil.ZERO ;
      A645VALORFUTURO = DecimalUtil.ZERO ;
      A646INTERES = DecimalUtil.ZERO ;
      AV17CONSECUTIVOENTRA = "" ;
      AV80COSTOADQUI = DecimalUtil.ZERO ;
      AV36OTROSCOSTOS = DecimalUtil.ZERO ;
      AV65VALORFUTURO = DecimalUtil.ZERO ;
      AV26INTERES = DecimalUtil.ZERO ;
      AV15Cons_Numero = "" ;
      AV83Total_Costos = DecimalUtil.ZERO ;
      AV81SDTDetalleTrn = new com.orions2.SdtSDTDetalleTrn(remoteHandle, context);
      AV41TDet_PlacaPadre = "" ;
      AV91PlacaRecuperada = "" ;
      GXv_char2 = new String [1] ;
      P001D9_A83NROTRANSACCION = new long[1] ;
      P001D9_A537CONSECUTIVOENTRADA = new String[] {""} ;
      P001D9_n537CONSECUTIVOENTRADA = new boolean[] {false} ;
      P001D9_A601CANTIDADENTRADA = new int[1] ;
      P001D9_n601CANTIDADENTRADA = new boolean[] {false} ;
      P001D9_A538COSTOADQUISICION = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001D9_n538COSTOADQUISICION = new boolean[] {false} ;
      P001D9_A644OTROSCOSTOS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001D9_A84IDCARMAS = new short[1] ;
      GXv_SdtSDTDetalleTrn6 = new com.orions2.SdtSDTDetalleTrn [1] ;
      AV111Swerror = DecimalUtil.ZERO ;
      GXv_int7 = new short [1] ;
      P001D10_A81ID_ENTRADA = new short[1] ;
      P001D10_A80NUMEROTRN = new long[1] ;
      P001D10_A535ATRIBUTO = new String[] {""} ;
      P001D10_n535ATRIBUTO = new boolean[] {false} ;
      P001D10_A536VALORATRIBUTO = new String[] {""} ;
      P001D10_n536VALORATRIBUTO = new boolean[] {false} ;
      P001D10_A82IDATRIBUTO = new short[1] ;
      A535ATRIBUTO = "" ;
      A536VALORATRIBUTO = "" ;
      AV10ATRIBUTO = "" ;
      AV64VALORATRIBUTO = "" ;
      GXv_int1 = new long [1] ;
      AV88SDTDetalleTrnAtr = new GXBaseCollection<com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem>(com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem.class, "SDTDetalleTrnAtr.SDTDetalleTrnAtrItem", "ACBSENA", remoteHandle);
      GXv_objcol_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem9 = new GXBaseCollection [1] ;
      GXv_char4 = new String [1] ;
      GXv_char3 = new String [1] ;
      P001D11_A393List_Descripcion = new String[] {""} ;
      P001D11_A36List_Id = new long[1] ;
      A393List_Descripcion = "" ;
      AV89SDTDetalleTrnAtrItem = new com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem(remoteHandle, context);
      P001D12_A46Tran_Id = new long[1] ;
      P001D12_A69TDet_Consecutivo = new long[1] ;
      AV96A = DecimalUtil.ZERO ;
      AV97VF = DecimalUtil.ZERO ;
      AV99C = DecimalUtil.ZERO ;
      P001D13_A78NUMTRN = new long[1] ;
      P001D13_A553CONSECUTIVO = new String[] {""} ;
      P001D13_n553CONSECUTIVO = new boolean[] {false} ;
      P001D13_A554CANTIDAD = new short[1] ;
      P001D13_n554CANTIDAD = new boolean[] {false} ;
      P001D13_A79ID_SALIDA = new short[1] ;
      A553CONSECUTIVO = "" ;
      AV16CONSECUTIVO = "" ;
      GXv_int8 = new long [1] ;
      AV101SDTInvenConsumo = new GXBaseCollection<com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem>(com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem.class, "SDTInvenConsumo.SDTInvenConsumoItem", "ACBSENA", remoteHandle);
      GXv_objcol_SdtSDTInvenConsumo_SDTInvenConsumoItem10 = new GXBaseCollection [1] ;
      P001D14_A91Regional = new long[1] ;
      P001D14_A92Centro_Id = new long[1] ;
      P001D14_A27Alma_Modulo = new String[] {""} ;
      P001D14_A28Alma_Codigo = new String[] {""} ;
      P001D14_A31Bode_Codigo = new String[] {""} ;
      P001D14_A66Elem_Consecutivo = new String[] {""} ;
      P001D14_A618Cantidad_Diponible = new int[1] ;
      P001D14_n618Cantidad_Diponible = new boolean[] {false} ;
      P001D14_A93Trans_Id = new long[1] ;
      P001D14_A94Num_Linea = new int[1] ;
      P001D14_A709Trans_FechaRatificacion = new java.util.Date[] {GXutil.nullDate()} ;
      P001D14_n709Trans_FechaRatificacion = new boolean[] {false} ;
      A27Alma_Modulo = "" ;
      A28Alma_Codigo = "" ;
      A31Bode_Codigo = "" ;
      A709Trans_FechaRatificacion = GXutil.resetTime( GXutil.nullDate() );
      AV102SDTInvenConsumoItem = new com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.integracion__default(),
         new Object[] {
             new Object[] {
            P001D2_A46Tran_Id, P001D2_A57Tran_RegionId, P001D2_n57Tran_RegionId, P001D2_A48Tran_CentroCostoId, P001D2_A110Tran_ModuloOrigen, P001D2_A109Tran_CodAlmaOrigen, P001D2_A112Tran_CodBodeOrigen, P001D2_A51Tran_IdCuentadanteOrigen, P001D2_n51Tran_IdCuentadanteOrigen, P001D2_A55Tran_FechaRegistro,
            P001D2_A58Tran_Estado, P001D2_n58Tran_Estado
            }
            , new Object[] {
            P001D3_A421Tran_RegionCodigo, P001D3_n421Tran_RegionCodigo
            }
            , new Object[] {
            }
            , new Object[] {
            P001D5_A78NUMTRN, P001D5_A530PLACASENA, P001D5_n530PLACASENA, P001D5_A79ID_SALIDA
            }
            , new Object[] {
            P001D6_A67Invd_NumeroPlaca, P001D6_A66Elem_Consecutivo, P001D6_A501Invd_EsPlacaPadre, P001D6_n501Invd_EsPlacaPadre, P001D6_A629Costo_Total_Dev, P001D6_A68Invd_PlacaPadre, P001D6_n68Invd_PlacaPadre
            }
            , new Object[] {
            P001D7_A490TDet_PlacaNumero, P001D7_n490TDet_PlacaNumero, P001D7_A481Tran_IndE_S, P001D7_n481Tran_IndE_S, P001D7_A46Tran_Id, P001D7_A69TDet_Consecutivo
            }
            , new Object[] {
            P001D8_A83NROTRANSACCION, P001D8_A537CONSECUTIVOENTRADA, P001D8_n537CONSECUTIVOENTRADA, P001D8_A686INDICADORPHI, P001D8_A538COSTOADQUISICION, P001D8_n538COSTOADQUISICION, P001D8_A644OTROSCOSTOS, P001D8_A645VALORFUTURO, P001D8_A646INTERES, P001D8_A647TIEMPO,
            P001D8_A648VIDAUTIL, P001D8_A84IDCARMAS
            }
            , new Object[] {
            P001D9_A83NROTRANSACCION, P001D9_A537CONSECUTIVOENTRADA, P001D9_n537CONSECUTIVOENTRADA, P001D9_A601CANTIDADENTRADA, P001D9_n601CANTIDADENTRADA, P001D9_A538COSTOADQUISICION, P001D9_n538COSTOADQUISICION, P001D9_A644OTROSCOSTOS, P001D9_A84IDCARMAS
            }
            , new Object[] {
            P001D10_A81ID_ENTRADA, P001D10_A80NUMEROTRN, P001D10_A535ATRIBUTO, P001D10_n535ATRIBUTO, P001D10_A536VALORATRIBUTO, P001D10_n536VALORATRIBUTO, P001D10_A82IDATRIBUTO
            }
            , new Object[] {
            P001D11_A393List_Descripcion, P001D11_A36List_Id
            }
            , new Object[] {
            P001D12_A46Tran_Id, P001D12_A69TDet_Consecutivo
            }
            , new Object[] {
            P001D13_A78NUMTRN, P001D13_A553CONSECUTIVO, P001D13_n553CONSECUTIVO, P001D13_A554CANTIDAD, P001D13_n554CANTIDAD, P001D13_A79ID_SALIDA
            }
            , new Object[] {
            P001D14_A91Regional, P001D14_A92Centro_Id, P001D14_A27Alma_Modulo, P001D14_A28Alma_Codigo, P001D14_A31Bode_Codigo, P001D14_A66Elem_Consecutivo, P001D14_A618Cantidad_Diponible, P001D14_n618Cantidad_Diponible, P001D14_A93Trans_Id, P001D14_A94Num_Linea,
            P001D14_A709Trans_FechaRatificacion, P001D14_n709Trans_FechaRatificacion
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV18ConsecutivoItem ;
   private short A421Tran_RegionCodigo ;
   private short AV60Tran_RegionCodigo ;
   private short A79ID_SALIDA ;
   private short A686INDICADORPHI ;
   private short A647TIEMPO ;
   private short A648VIDAUTIL ;
   private short A84IDCARMAS ;
   private short AV23IDCARMAS ;
   private short AV24INDICADORPHI ;
   private short AV42TIEMPO ;
   private short AV67VIDAUTIL ;
   private short AV95Valor_presente ;
   private short GXv_int7[] ;
   private short A81ID_ENTRADA ;
   private short A82IDATRIBUTO ;
   private short AV98N ;
   private short A554CANTIDAD ;
   private short AV11CANTIDAD ;
   private short AV71Cantidad_des ;
   private short Gx_err ;
   private int AV45Tran_CantidadPadres ;
   private int A601CANTIDADENTRADA ;
   private int AV13CANTIDADENTRADA ;
   private int AV34Nro_Linea ;
   private int A618Cantidad_Diponible ;
   private int A94Num_Linea ;
   private long AV55Tran_Id ;
   private long A46Tran_Id ;
   private long A57Tran_RegionId ;
   private long A48Tran_CentroCostoId ;
   private long A51Tran_IdCuentadanteOrigen ;
   private long AV61Tran_RegionId ;
   private long AV47Tran_CentroCostoId ;
   private long AV56Tran_IdCuentadanteOrigen ;
   private long A78NUMTRN ;
   private long A69TDet_Consecutivo ;
   private long AV78eTran_Id ;
   private long AV77eTDet_Consecutivo ;
   private long A83NROTRANSACCION ;
   private long AV84TDet_Consecutivo ;
   private long A80NUMEROTRN ;
   private long GXv_int1[] ;
   private long A36List_Id ;
   private long AV31List_Id ;
   private long GXv_int8[] ;
   private long A91Regional ;
   private long A92Centro_Id ;
   private long A93Trans_Id ;
   private long AV53Tran_Entrada ;
   private java.math.BigDecimal A629Costo_Total_Dev ;
   private java.math.BigDecimal AV76Costo_Total_Dev ;
   private java.math.BigDecimal A538COSTOADQUISICION ;
   private java.math.BigDecimal A644OTROSCOSTOS ;
   private java.math.BigDecimal A645VALORFUTURO ;
   private java.math.BigDecimal A646INTERES ;
   private java.math.BigDecimal AV80COSTOADQUI ;
   private java.math.BigDecimal AV36OTROSCOSTOS ;
   private java.math.BigDecimal AV65VALORFUTURO ;
   private java.math.BigDecimal AV26INTERES ;
   private java.math.BigDecimal AV83Total_Costos ;
   private java.math.BigDecimal AV111Swerror ;
   private java.math.BigDecimal AV96A ;
   private java.math.BigDecimal AV97VF ;
   private java.math.BigDecimal AV99C ;
   private String AV62Tran_TipoEntra ;
   private String scmdbuf ;
   private String A58Tran_Estado ;
   private String A501Invd_EsPlacaPadre ;
   private String AV27Invd_EsPlacaPadre ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private java.util.Date A55Tran_FechaRegistro ;
   private java.util.Date A709Trans_FechaRatificacion ;
   private boolean returnInSub ;
   private boolean n57Tran_RegionId ;
   private boolean n51Tran_IdCuentadanteOrigen ;
   private boolean n58Tran_Estado ;
   private boolean n421Tran_RegionCodigo ;
   private boolean n530PLACASENA ;
   private boolean n501Invd_EsPlacaPadre ;
   private boolean n68Invd_PlacaPadre ;
   private boolean n490TDet_PlacaNumero ;
   private boolean n481Tran_IndE_S ;
   private boolean n537CONSECUTIVOENTRADA ;
   private boolean n538COSTOADQUISICION ;
   private boolean n601CANTIDADENTRADA ;
   private boolean n535ATRIBUTO ;
   private boolean n536VALORATRIBUTO ;
   private boolean n553CONSECUTIVO ;
   private boolean n554CANTIDAD ;
   private boolean n618Cantidad_Diponible ;
   private boolean n709Trans_FechaRatificacion ;
   private String AV57Tran_IndE_S ;
   private String AV43Tipo_Bien ;
   private String AV85Usuario ;
   private String A110Tran_ModuloOrigen ;
   private String A109Tran_CodAlmaOrigen ;
   private String A112Tran_CodBodeOrigen ;
   private String AV59Tran_ModuloOrigen ;
   private String AV49Tran_CodAlmaOrigen ;
   private String AV51Tran_CodBodeOrigen ;
   private String A530PLACASENA ;
   private String AV38PLACASENA ;
   private String A67Invd_NumeroPlaca ;
   private String A66Elem_Consecutivo ;
   private String A68Invd_PlacaPadre ;
   private String AV22Elem_Consecutivo ;
   private String AV29Invd_PlacaPadre ;
   private String AV28Invd_NumeroPlaca ;
   private String A490TDet_PlacaNumero ;
   private String A481Tran_IndE_S ;
   private String A537CONSECUTIVOENTRADA ;
   private String AV17CONSECUTIVOENTRA ;
   private String AV15Cons_Numero ;
   private String AV41TDet_PlacaPadre ;
   private String AV91PlacaRecuperada ;
   private String A535ATRIBUTO ;
   private String A536VALORATRIBUTO ;
   private String AV10ATRIBUTO ;
   private String AV64VALORATRIBUTO ;
   private String A393List_Descripcion ;
   private String A553CONSECUTIVO ;
   private String AV16CONSECUTIVO ;
   private String A27Alma_Modulo ;
   private String A28Alma_Codigo ;
   private String A31Bode_Codigo ;
   private com.genexus.webpanels.WebSession AV86websession ;
   private com.orions2.SdtSDTDetalleTrn AV81SDTDetalleTrn ;
   private com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem AV89SDTDetalleTrnAtrItem ;
   private String[] aP3 ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
   private long[] P001D2_A46Tran_Id ;
   private long[] P001D2_A57Tran_RegionId ;
   private boolean[] P001D2_n57Tran_RegionId ;
   private long[] P001D2_A48Tran_CentroCostoId ;
   private String[] P001D2_A110Tran_ModuloOrigen ;
   private String[] P001D2_A109Tran_CodAlmaOrigen ;
   private String[] P001D2_A112Tran_CodBodeOrigen ;
   private long[] P001D2_A51Tran_IdCuentadanteOrigen ;
   private boolean[] P001D2_n51Tran_IdCuentadanteOrigen ;
   private java.util.Date[] P001D2_A55Tran_FechaRegistro ;
   private String[] P001D2_A58Tran_Estado ;
   private boolean[] P001D2_n58Tran_Estado ;
   private short[] P001D3_A421Tran_RegionCodigo ;
   private boolean[] P001D3_n421Tran_RegionCodigo ;
   private long[] P001D5_A78NUMTRN ;
   private String[] P001D5_A530PLACASENA ;
   private boolean[] P001D5_n530PLACASENA ;
   private short[] P001D5_A79ID_SALIDA ;
   private String[] P001D6_A67Invd_NumeroPlaca ;
   private String[] P001D6_A66Elem_Consecutivo ;
   private String[] P001D6_A501Invd_EsPlacaPadre ;
   private boolean[] P001D6_n501Invd_EsPlacaPadre ;
   private java.math.BigDecimal[] P001D6_A629Costo_Total_Dev ;
   private String[] P001D6_A68Invd_PlacaPadre ;
   private boolean[] P001D6_n68Invd_PlacaPadre ;
   private String[] P001D7_A490TDet_PlacaNumero ;
   private boolean[] P001D7_n490TDet_PlacaNumero ;
   private String[] P001D7_A481Tran_IndE_S ;
   private boolean[] P001D7_n481Tran_IndE_S ;
   private long[] P001D7_A46Tran_Id ;
   private long[] P001D7_A69TDet_Consecutivo ;
   private long[] P001D8_A83NROTRANSACCION ;
   private String[] P001D8_A537CONSECUTIVOENTRADA ;
   private boolean[] P001D8_n537CONSECUTIVOENTRADA ;
   private short[] P001D8_A686INDICADORPHI ;
   private java.math.BigDecimal[] P001D8_A538COSTOADQUISICION ;
   private boolean[] P001D8_n538COSTOADQUISICION ;
   private java.math.BigDecimal[] P001D8_A644OTROSCOSTOS ;
   private java.math.BigDecimal[] P001D8_A645VALORFUTURO ;
   private java.math.BigDecimal[] P001D8_A646INTERES ;
   private short[] P001D8_A647TIEMPO ;
   private short[] P001D8_A648VIDAUTIL ;
   private short[] P001D8_A84IDCARMAS ;
   private long[] P001D9_A83NROTRANSACCION ;
   private String[] P001D9_A537CONSECUTIVOENTRADA ;
   private boolean[] P001D9_n537CONSECUTIVOENTRADA ;
   private int[] P001D9_A601CANTIDADENTRADA ;
   private boolean[] P001D9_n601CANTIDADENTRADA ;
   private java.math.BigDecimal[] P001D9_A538COSTOADQUISICION ;
   private boolean[] P001D9_n538COSTOADQUISICION ;
   private java.math.BigDecimal[] P001D9_A644OTROSCOSTOS ;
   private short[] P001D9_A84IDCARMAS ;
   private short[] P001D10_A81ID_ENTRADA ;
   private long[] P001D10_A80NUMEROTRN ;
   private String[] P001D10_A535ATRIBUTO ;
   private boolean[] P001D10_n535ATRIBUTO ;
   private String[] P001D10_A536VALORATRIBUTO ;
   private boolean[] P001D10_n536VALORATRIBUTO ;
   private short[] P001D10_A82IDATRIBUTO ;
   private String[] P001D11_A393List_Descripcion ;
   private long[] P001D11_A36List_Id ;
   private long[] P001D12_A46Tran_Id ;
   private long[] P001D12_A69TDet_Consecutivo ;
   private long[] P001D13_A78NUMTRN ;
   private String[] P001D13_A553CONSECUTIVO ;
   private boolean[] P001D13_n553CONSECUTIVO ;
   private short[] P001D13_A554CANTIDAD ;
   private boolean[] P001D13_n554CANTIDAD ;
   private short[] P001D13_A79ID_SALIDA ;
   private long[] P001D14_A91Regional ;
   private long[] P001D14_A92Centro_Id ;
   private String[] P001D14_A27Alma_Modulo ;
   private String[] P001D14_A28Alma_Codigo ;
   private String[] P001D14_A31Bode_Codigo ;
   private String[] P001D14_A66Elem_Consecutivo ;
   private int[] P001D14_A618Cantidad_Diponible ;
   private boolean[] P001D14_n618Cantidad_Diponible ;
   private long[] P001D14_A93Trans_Id ;
   private int[] P001D14_A94Num_Linea ;
   private java.util.Date[] P001D14_A709Trans_FechaRatificacion ;
   private boolean[] P001D14_n709Trans_FechaRatificacion ;
   private GXBaseCollection<com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem> AV74SDTInvDevoSel ;
   private GXBaseCollection<com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem> GXv_objcol_SdtSDTInvDevoSel_SDTInvDevoSelItem5[] ;
   private GXBaseCollection<com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem> AV88SDTDetalleTrnAtr ;
   private GXBaseCollection<com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem> GXv_objcol_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem9[] ;
   private GXBaseCollection<com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem> AV101SDTInvenConsumo ;
   private GXBaseCollection<com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem> GXv_objcol_SdtSDTInvenConsumo_SDTInvenConsumoItem10[] ;
   private com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem AV75SDTInvDevoSelItem ;
   private com.orions2.SdtSDTDetalleTrn GXv_SdtSDTDetalleTrn6[] ;
   private com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem AV102SDTInvenConsumoItem ;
}

final  class integracion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001D2", "SELECT Tran_Id, Tran_RegionId, Tran_CentroCostoId, Tran_ModuloOrigen, Tran_CodAlmaOrigen, Tran_CodBodeOrigen, Tran_IdCuentadanteOrigen, Tran_FechaRegistro, Tran_Estado FROM ALM_TRANSACCION WHERE (Tran_Id = ?) AND (Tran_Id = ?)  FOR UPDATE OF Tran_FechaRegistro, Tran_Estado NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P001D3", "SELECT Regi_Cod AS Tran_RegionCodigo FROM GEN_REGIONAL WHERE Regi_Id = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P001D4", "UPDATE ALM_TRANSACCION SET Tran_FechaRegistro=?, Tran_Estado=?  WHERE Tran_Id = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_TRANSACCION")
         ,new ForEachCursor("P001D5", "SELECT NUMTRN, PLACASENA, ID_SALIDA FROM MAS_CARGUE_SALIDAS WHERE NUMTRN = ? ORDER BY NUMTRN ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001D6", "SELECT Invd_NumeroPlaca, Elem_Consecutivo, Invd_EsPlacaPadre, Costo_Total_Dev, Invd_PlacaPadre FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Invd_NumeroPlaca = ? ORDER BY Invd_NumeroPlaca ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P001D7", "SELECT * FROM (SELECT T1.TDet_PlacaNumero, T2.Tran_IndE_S, T1.Tran_Id, T1.TDet_Consecutivo FROM (ALM_DETALLE_TRANSACCION T1 INNER JOIN ALM_TRANSACCION T2 ON T2.Tran_Id = T1.Tran_Id) WHERE (T2.Tran_IndE_S = 'E') AND (T1.TDet_PlacaNumero = ?) ORDER BY T1.Tran_Id, T1.TDet_Consecutivo) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P001D8", "SELECT NROTRANSACCION, CONSECUTIVOENTRADA, INDICADORPHI, COSTOADQUISICION, OTROSCOSTOS, VALORFUTURO, INTERES, TIEMPO, VIDAUTIL, IDCARMAS FROM MAS_CARGUE_ENTRADA WHERE NROTRANSACCION = ? ORDER BY NROTRANSACCION, IDCARMAS ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001D9", "SELECT NROTRANSACCION, CONSECUTIVOENTRADA, CANTIDADENTRADA, COSTOADQUISICION, OTROSCOSTOS, IDCARMAS FROM MAS_CARGUE_ENTRADA WHERE NROTRANSACCION = ? ORDER BY NROTRANSACCION, IDCARMAS ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001D10", "SELECT ID_ENTRADA, NUMEROTRN, ATRIBUTO, VALORATRIBUTO, IDATRIBUTO FROM MAS_CARGUE_ATRIBUTOS WHERE NUMEROTRN = ? and ID_ENTRADA = ? ORDER BY NUMEROTRN, ID_ENTRADA, IDATRIBUTO ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001D11", "SELECT List_Descripcion, List_Id FROM ALM_LISTA_ATRIBUTOS WHERE List_Descripcion = ? ORDER BY List_Descripcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001D12", "SELECT Tran_Id, TDet_Consecutivo FROM ALM_DETALLE_TRANSACCION WHERE Tran_Id = ? ORDER BY Tran_Id, TDet_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001D13", "SELECT NUMTRN, CONSECUTIVO, CANTIDAD, ID_SALIDA FROM MAS_CARGUE_SALIDAS WHERE NUMTRN = ? ORDER BY NUMTRN, ID_SALIDA ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001D14", "SELECT T1.Regional, T1.Centro_Id, T1.Alma_Modulo, T1.Alma_Codigo, T1.Bode_Codigo, T1.Elem_Consecutivo, T1.Cantidad_Diponible, T1.Trans_Id AS Trans_Id, T1.Num_Linea, T2.Tran_FechaRatificacion AS Trans_FechaRatificacion FROM (ALM_INV_CON T1 INNER JOIN ALM_TRANSACCION T2 ON T2.Tran_Id = T1.Trans_Id) WHERE (T1.Regional = ? and T1.Centro_Id = ? and T1.Alma_Modulo = ? and T1.Alma_Codigo = ? and T1.Bode_Codigo = ? and T1.Elem_Consecutivo = ?) AND (T1.Cantidad_Diponible > 0) ORDER BY T1.Regional, T1.Centro_Id, T1.Alma_Modulo, T1.Alma_Codigo, T1.Bode_Codigo, T1.Elem_Consecutivo, T2.Tran_FechaRatificacion, T1.Num_Linea ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((long[]) buf[7])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8) ;
               ((String[]) buf[10])[0] = rslt.getString(9, 1) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2) ;
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2) ;
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2) ;
               ((short[]) buf[9])[0] = rslt.getShort(8) ;
               ((short[]) buf[10])[0] = rslt.getShort(9) ;
               ((short[]) buf[11])[0] = rslt.getShort(10) ;
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2) ;
               ((short[]) buf[8])[0] = rslt.getShort(6) ;
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5) ;
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 11 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4) ;
               return;
            case 12 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((int[]) buf[6])[0] = rslt.getInt(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(8) ;
               ((int[]) buf[9])[0] = rslt.getInt(9) ;
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               return;
            case 2 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 1);
               }
               stmt.setLong(3, ((Number) parms[3]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 30);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 30);
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 50);
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 8);
               stmt.setVarchar(4, (String)parms[3], 2);
               stmt.setVarchar(5, (String)parms[4], 3);
               stmt.setVarchar(6, (String)parms[5], 9);
               return;
      }
   }

}

