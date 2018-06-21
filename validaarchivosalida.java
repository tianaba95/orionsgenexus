/*
               File: ValidaArchivoSalida
        Description: Valida Archivo Salida
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:30.33
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class validaarchivosalida extends GXProcedure
{
   public validaarchivosalida( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( validaarchivosalida.class ), "" );
   }

   public validaarchivosalida( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String[] aP2 ,
                        short[] aP3 ,
                        short[] aP4 ,
                        short[] aP5 ,
                        long aP6 ,
                        long aP7 ,
                        String aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String[] aP2 ,
                             short[] aP3 ,
                             short[] aP4 ,
                             short[] aP5 ,
                             long aP6 ,
                             long aP7 ,
                             String aP8 )
   {
      validaarchivosalida.this.AV8Archivo = aP0;
      validaarchivosalida.this.AV33Tipo_Bien = aP1;
      validaarchivosalida.this.aP2 = aP2;
      validaarchivosalida.this.aP3 = aP3;
      validaarchivosalida.this.aP4 = aP4;
      validaarchivosalida.this.aP5 = aP5;
      validaarchivosalida.this.AV39Tran_Id = aP6;
      validaarchivosalida.this.AV38Tran_CodTipoElemento = aP7;
      validaarchivosalida.this.AV41Tran_IndE_S = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: 'INICIARLECTURA' */
      S111 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'INICIARLECTURA' Routine */
      AV17ExcelDocument.setUseAutomation( (short)(0) );
      AV17ExcelDocument.Open(AV8Archivo);
      if ( AV17ExcelDocument.getErrCode() != 0 )
      {
         AV22Mensaje = AV17ExcelDocument.getErrDescription() ;
      }
      else
      {
         AV30Row = (short)(2) ;
         AV31SALIDA = (short)(0) ;
         AV13CuentaCargados = (short)(0) ;
         AV14CuentaFallos = (short)(0) ;
         AV26MessageCount = (short)(0) ;
         while ( ! (GXutil.strcmp("", GXutil.trim( AV17ExcelDocument.Cells(AV30Row, 1, 1, 1).getText()))==0) )
         {
            AV31SALIDA = (short)(AV31SALIDA+1) ;
            AV21MasCargue.setgxTv_SdtMAS_CARGUE_SALIDAS_Numtrn( AV39Tran_Id );
            AV21MasCargue.setgxTv_SdtMAS_CARGUE_SALIDAS_Id_salida( AV31SALIDA );
            if ( GXutil.strcmp(AV33Tipo_Bien, "D") == 0 )
            {
               AV21MasCargue.setgxTv_SdtMAS_CARGUE_SALIDAS_Placasena( AV17ExcelDocument.Cells(AV30Row, 1, 1, 1).getText() );
               AV46PLACA = (short)(AV17ExcelDocument.Cells(AV30Row, 1, 1, 1).getNumber()) ;
            }
            if ( GXutil.strcmp(AV33Tipo_Bien, "C") == 0 )
            {
               AV21MasCargue.setgxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo( AV17ExcelDocument.Cells(AV30Row, 1, 1, 1).getText() );
               AV21MasCargue.setgxTv_SdtMAS_CARGUE_SALIDAS_Cantidad( (short)(AV17ExcelDocument.Cells(AV30Row, 2, 1, 1).getNumber()) );
            }
            AV21MasCargue.Save();
            if ( AV21MasCargue.Fail() )
            {
               AV14CuentaFallos = (short)(AV14CuentaFallos+1) ;
               AV50GXV2 = 1 ;
               AV49GXV1 = AV21MasCargue.GetMessages() ;
               while ( AV50GXV2 <= AV49GXV1.size() )
               {
                  AV25Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV49GXV1.elementAt(-1+AV50GXV2));
                  /* Execute user subroutine: 'MENSAJEERROR' */
                  S251 ();
                  if (returnInSub) return;
                  AV24MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
                  AV24MensajesItem.setgxTv_SdtMensajes_MensajesItem_Fila( AV30Row );
                  AV24MensajesItem.setgxTv_SdtMensajes_MensajesItem_Columna( AV28NumeroColumna );
                  AV24MensajesItem.setgxTv_SdtMensajes_MensajesItem_Inconsistencia( AV27MessageDescrip );
                  AV23Mensajes.add(AV24MensajesItem, 0);
                  AV24MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
                  AV50GXV2 = (int)(AV50GXV2+1) ;
               }
               AV32Session1.setValue("SDTErrores", AV23Mensajes.toxml(false, true, "Mensajes", "ACBSENA"));
               AV24MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
               AV26MessageCount = (short)(AV26MessageCount+(AV21MasCargue.GetMessages().size())) ;
            }
            else
            {
               AV13CuentaCargados = (short)(AV13CuentaCargados+1) ;
            }
            Application.commit(context, remoteHandle, "DEFAULT",pr_default, "validaarchivosalida");
            AV30Row = (short)(AV30Row+1) ;
         }
         AV17ExcelDocument.Close();
         AV22Mensaje = AV22Mensaje + "RESULTADOS DEL PROCESO DE CARGUE" + GXutil.newLine( ) + "- Total de registros Correctos   :	" + GXutil.trim( GXutil.str( AV13CuentaCargados, 4, 0)) + GXutil.newLine( ) + "- Total de registros Fallidos    :	" + GXutil.trim( GXutil.str( AV14CuentaFallos, 4, 0)) ;
      }
      /* Execute user subroutine: 'INICIAPROCESO' */
      S121 ();
      if (returnInSub) return;
   }

   public void S121( )
   {
      /* 'INICIAPROCESO' Routine */
      if ( AV14CuentaFallos == 0 )
      {
         if ( GXutil.strcmp(AV33Tipo_Bien, "C") == 0 )
         {
            AV15Elem_Consecutivo = "" ;
            /* Using cursor P001L2 */
            pr_default.execute(0, new Object[] {new Long(AV39Tran_Id)});
            while ( (pr_default.getStatus(0) != 101) )
            {
               A78NUMTRN = P001L2_A78NUMTRN[0] ;
               A553CONSECUTIVO = P001L2_A553CONSECUTIVO[0] ;
               n553CONSECUTIVO = P001L2_n553CONSECUTIVO[0] ;
               A554CANTIDAD = P001L2_A554CANTIDAD[0] ;
               n554CANTIDAD = P001L2_n554CANTIDAD[0] ;
               A79ID_SALIDA = P001L2_A79ID_SALIDA[0] ;
               AV18ID_SALIDA = A79ID_SALIDA ;
               AV15Elem_Consecutivo = GXutil.trim( A553CONSECUTIVO) ;
               AV9CANTIDAD = A554CANTIDAD ;
               /* Execute user subroutine: 'VALIDA TIPO CODIGO' */
               S132 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
               pr_default.readNext(0);
            }
            pr_default.close(0);
            if ( AV14CuentaFallos == 0 )
            {
               /* Using cursor P001L3 */
               pr_default.execute(1, new Object[] {new Long(AV39Tran_Id)});
               while ( (pr_default.getStatus(1) != 101) )
               {
                  A78NUMTRN = P001L3_A78NUMTRN[0] ;
                  A553CONSECUTIVO = P001L3_A553CONSECUTIVO[0] ;
                  n553CONSECUTIVO = P001L3_n553CONSECUTIVO[0] ;
                  A554CANTIDAD = P001L3_A554CANTIDAD[0] ;
                  n554CANTIDAD = P001L3_n554CANTIDAD[0] ;
                  A79ID_SALIDA = P001L3_A79ID_SALIDA[0] ;
                  AV18ID_SALIDA = A79ID_SALIDA ;
                  AV15Elem_Consecutivo = GXutil.trim( A553CONSECUTIVO) ;
                  AV9CANTIDAD = A554CANTIDAD ;
                  /* Execute user subroutine: 'VALIDA ALMACEN BODEGA' */
                  S143 ();
                  if ( returnInSub )
                  {
                     pr_default.close(1);
                     returnInSub = true;
                     if (true) return;
                  }
                  pr_default.readNext(1);
               }
               pr_default.close(1);
            }
            if ( AV14CuentaFallos == 0 )
            {
               /* Using cursor P001L4 */
               pr_default.execute(2, new Object[] {new Long(AV39Tran_Id)});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A78NUMTRN = P001L4_A78NUMTRN[0] ;
                  A553CONSECUTIVO = P001L4_A553CONSECUTIVO[0] ;
                  n553CONSECUTIVO = P001L4_n553CONSECUTIVO[0] ;
                  A554CANTIDAD = P001L4_A554CANTIDAD[0] ;
                  n554CANTIDAD = P001L4_n554CANTIDAD[0] ;
                  A79ID_SALIDA = P001L4_A79ID_SALIDA[0] ;
                  AV18ID_SALIDA = A79ID_SALIDA ;
                  AV15Elem_Consecutivo = GXutil.trim( A553CONSECUTIVO) ;
                  AV9CANTIDAD = A554CANTIDAD ;
                  /* Execute user subroutine: 'VALIDA CANTIDAD' */
                  S154 ();
                  if ( returnInSub )
                  {
                     pr_default.close(2);
                     returnInSub = true;
                     if (true) return;
                  }
                  pr_default.readNext(2);
               }
               pr_default.close(2);
            }
         }
         if ( GXutil.strcmp(AV33Tipo_Bien, "D") == 0 )
         {
            AV15Elem_Consecutivo = "" ;
            /* Using cursor P001L5 */
            pr_default.execute(3, new Object[] {new Long(AV39Tran_Id)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A78NUMTRN = P001L5_A78NUMTRN[0] ;
               A530PLACASENA = P001L5_A530PLACASENA[0] ;
               n530PLACASENA = P001L5_n530PLACASENA[0] ;
               A79ID_SALIDA = P001L5_A79ID_SALIDA[0] ;
               AV18ID_SALIDA = A79ID_SALIDA ;
               AV29PLACASENA = A530PLACASENA ;
               /* Execute user subroutine: 'BUSCAR INVENTARIO' */
               S165 ();
               if ( returnInSub )
               {
                  pr_default.close(3);
                  returnInSub = true;
                  if (true) return;
               }
               pr_default.readNext(3);
            }
            pr_default.close(3);
            if ( AV14CuentaFallos == 0 )
            {
               AV15Elem_Consecutivo = "" ;
               /* Using cursor P001L6 */
               pr_default.execute(4, new Object[] {new Long(AV39Tran_Id)});
               while ( (pr_default.getStatus(4) != 101) )
               {
                  A78NUMTRN = P001L6_A78NUMTRN[0] ;
                  A530PLACASENA = P001L6_A530PLACASENA[0] ;
                  n530PLACASENA = P001L6_n530PLACASENA[0] ;
                  A79ID_SALIDA = P001L6_A79ID_SALIDA[0] ;
                  AV18ID_SALIDA = A79ID_SALIDA ;
                  AV29PLACASENA = A530PLACASENA ;
                  /* Execute user subroutine: 'BUSCAR ELEMENTO' */
                  S176 ();
                  if ( returnInSub )
                  {
                     pr_default.close(4);
                     returnInSub = true;
                     if (true) return;
                  }
                  pr_default.readNext(4);
               }
               pr_default.close(4);
            }
            if ( AV14CuentaFallos == 0 )
            {
               /* Using cursor P001L7 */
               pr_default.execute(5, new Object[] {new Long(AV39Tran_Id)});
               while ( (pr_default.getStatus(5) != 101) )
               {
                  A46Tran_Id = P001L7_A46Tran_Id[0] ;
                  A57Tran_RegionId = P001L7_A57Tran_RegionId[0] ;
                  n57Tran_RegionId = P001L7_n57Tran_RegionId[0] ;
                  A48Tran_CentroCostoId = P001L7_A48Tran_CentroCostoId[0] ;
                  A110Tran_ModuloOrigen = P001L7_A110Tran_ModuloOrigen[0] ;
                  A109Tran_CodAlmaOrigen = P001L7_A109Tran_CodAlmaOrigen[0] ;
                  A387Tran_CodBodeDestino = P001L7_A387Tran_CodBodeDestino[0] ;
                  A51Tran_IdCuentadanteOrigen = P001L7_A51Tran_IdCuentadanteOrigen[0] ;
                  n51Tran_IdCuentadanteOrigen = P001L7_n51Tran_IdCuentadanteOrigen[0] ;
                  AV43Tran_RegionId = A57Tran_RegionId ;
                  AV34Tran_CentroCostoId = A48Tran_CentroCostoId ;
                  AV42Tran_ModuloOrigen = A110Tran_ModuloOrigen ;
                  AV35Tran_CodAlmaOrigen = A109Tran_CodAlmaOrigen ;
                  AV36Tran_CodBodeDestino = A387Tran_CodBodeDestino ;
                  AV40Tran_IdCuentadanteOrigen = A51Tran_IdCuentadanteOrigen ;
                  /* Execute user subroutine: 'CUENTADANTE' */
                  S187 ();
                  if ( returnInSub )
                  {
                     pr_default.close(5);
                     returnInSub = true;
                     if (true) return;
                  }
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(5);
            }
         }
      }
      if ( AV14CuentaFallos >= 1 )
      {
         /* Optimized DELETE. */
         /* Using cursor P001L8 */
         pr_default.execute(6, new Object[] {new Long(AV39Tran_Id)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("MAS_CARGUE_SALIDAS") ;
         /* End optimized DELETE. */
      }
   }

   public void S191( )
   {
      /* 'BODEGA ORIGEN CONSUMO' Routine */
      /* Using cursor P001L9 */
      pr_default.execute(7, new Object[] {new Long(AV39Tran_Id)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A78NUMTRN = P001L9_A78NUMTRN[0] ;
         A553CONSECUTIVO = P001L9_A553CONSECUTIVO[0] ;
         n553CONSECUTIVO = P001L9_n553CONSECUTIVO[0] ;
         A554CANTIDAD = P001L9_A554CANTIDAD[0] ;
         n554CANTIDAD = P001L9_n554CANTIDAD[0] ;
         A79ID_SALIDA = P001L9_A79ID_SALIDA[0] ;
         AV18ID_SALIDA = A79ID_SALIDA ;
         AV11consecutivo = A553CONSECUTIVO ;
         AV9CANTIDAD = A554CANTIDAD ;
         /* Execute user subroutine: 'CONSECUTIVO CANTIDAD Y BODEGA' */
         S209 ();
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

   public void S209( )
   {
      /* 'CONSECUTIVO CANTIDAD Y BODEGA' Routine */
      AV59GXLvl142 = (byte)(0) ;
      /* Using cursor P001L10 */
      pr_default.execute(8, new Object[] {AV11consecutivo, new Long(AV34Tran_CentroCostoId), AV42Tran_ModuloOrigen, AV35Tran_CodAlmaOrigen, AV37Tran_CodBodeOrigen});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A31Bode_Codigo = P001L10_A31Bode_Codigo[0] ;
         A28Alma_Codigo = P001L10_A28Alma_Codigo[0] ;
         A27Alma_Modulo = P001L10_A27Alma_Modulo[0] ;
         A66Elem_Consecutivo = P001L10_A66Elem_Consecutivo[0] ;
         A92Centro_Id = P001L10_A92Centro_Id[0] ;
         A91Regional = P001L10_A91Regional[0] ;
         A93Trans_Id = P001L10_A93Trans_Id[0] ;
         A94Num_Linea = P001L10_A94Num_Linea[0] ;
         AV59GXLvl142 = (byte)(1) ;
         pr_default.readNext(8);
      }
      pr_default.close(8);
      if ( AV59GXLvl142 == 0 )
      {
         AV14CuentaFallos = (short)(AV14CuentaFallos+1) ;
         AV24MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
         AV24MensajesItem.setgxTv_SdtMensajes_MensajesItem_Fila( AV18ID_SALIDA );
         AV24MensajesItem.setgxTv_SdtMensajes_MensajesItem_Columna( (short)(1) );
         AV24MensajesItem.setgxTv_SdtMensajes_MensajesItem_Inconsistencia( "El traslado de los elementos de la bodega origen no se puede realizar" );
         AV23Mensajes.add(AV24MensajesItem, 0);
         AV24MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
         AV32Session1.setValue("SDTErrores", AV23Mensajes.toxml(false, true, "Mensajes", "ACBSENA"));
         AV24MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
         AV22Mensaje = "RESULTADOS DEL PROCESO DE CARGUE" + GXutil.newLine( ) + "- Total de registros Fallidos    :	" + GXutil.trim( GXutil.str( AV14CuentaFallos, 4, 0)) ;
      }
   }

   public void S211( )
   {
      /* 'VALIDA BODEGA ORIGEN' Routine */
      /* Using cursor P001L11 */
      pr_default.execute(9, new Object[] {new Long(AV39Tran_Id)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A78NUMTRN = P001L11_A78NUMTRN[0] ;
         A530PLACASENA = P001L11_A530PLACASENA[0] ;
         n530PLACASENA = P001L11_n530PLACASENA[0] ;
         A79ID_SALIDA = P001L11_A79ID_SALIDA[0] ;
         AV18ID_SALIDA = A79ID_SALIDA ;
         AV29PLACASENA = A530PLACASENA ;
         /* Execute user subroutine: 'PLACA Y BODEGA' */
         S2211 ();
         if ( returnInSub )
         {
            pr_default.close(9);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(9);
      }
      pr_default.close(9);
   }

   public void S2211( )
   {
      /* 'PLACA Y BODEGA' Routine */
      AV61GXLvl176 = (byte)(0) ;
      /* Using cursor P001L12 */
      pr_default.execute(10, new Object[] {AV29PLACASENA, new Long(AV34Tran_CentroCostoId), AV42Tran_ModuloOrigen, AV35Tran_CodAlmaOrigen, AV36Tran_CodBodeDestino});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A414Invd_BodegaCodigo = P001L12_A414Invd_BodegaCodigo[0] ;
         A413Invd_AlmacenCodigo = P001L12_A413Invd_AlmacenCodigo[0] ;
         A412Invd_ModuloAlmacen = P001L12_A412Invd_ModuloAlmacen[0] ;
         A411Invd_CentroCostoId = P001L12_A411Invd_CentroCostoId[0] ;
         A67Invd_NumeroPlaca = P001L12_A67Invd_NumeroPlaca[0] ;
         A66Elem_Consecutivo = P001L12_A66Elem_Consecutivo[0] ;
         AV61GXLvl176 = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
      if ( AV61GXLvl176 == 0 )
      {
         AV14CuentaFallos = (short)(AV14CuentaFallos+1) ;
         AV24MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
         AV24MensajesItem.setgxTv_SdtMensajes_MensajesItem_Fila( AV18ID_SALIDA );
         AV24MensajesItem.setgxTv_SdtMensajes_MensajesItem_Columna( (short)(1) );
         AV24MensajesItem.setgxTv_SdtMensajes_MensajesItem_Inconsistencia( "La placa del bien no se encuentra asociada a la bodega origen" );
         AV23Mensajes.add(AV24MensajesItem, 0);
         AV24MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
         AV32Session1.setValue("SDTErrores", AV23Mensajes.toxml(false, true, "Mensajes", "ACBSENA"));
         AV24MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
         AV22Mensaje = "RESULTADOS DEL PROCESO DE CARGUE" + GXutil.newLine( ) + "- Total de registros Fallidos    :	" + GXutil.trim( GXutil.str( AV14CuentaFallos, 4, 0)) ;
      }
   }

   public void S187( )
   {
      /* 'CUENTADANTE' Routine */
      /* Using cursor P001L13 */
      pr_default.execute(11, new Object[] {new Long(AV39Tran_Id)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A78NUMTRN = P001L13_A78NUMTRN[0] ;
         A530PLACASENA = P001L13_A530PLACASENA[0] ;
         n530PLACASENA = P001L13_n530PLACASENA[0] ;
         A79ID_SALIDA = P001L13_A79ID_SALIDA[0] ;
         AV18ID_SALIDA = A79ID_SALIDA ;
         AV29PLACASENA = A530PLACASENA ;
         /* Execute user subroutine: 'PLACA Y CUENTADANTE' */
         S2313 ();
         if ( returnInSub )
         {
            pr_default.close(11);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(11);
      }
      pr_default.close(11);
   }

   public void S2313( )
   {
      /* 'PLACA Y CUENTADANTE' Routine */
      /* Using cursor P001L14 */
      pr_default.execute(12, new Object[] {AV29PLACASENA, new Long(AV43Tran_RegionId), new Long(AV34Tran_CentroCostoId), AV42Tran_ModuloOrigen, AV35Tran_CodAlmaOrigen, AV36Tran_CodBodeDestino});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A414Invd_BodegaCodigo = P001L14_A414Invd_BodegaCodigo[0] ;
         A413Invd_AlmacenCodigo = P001L14_A413Invd_AlmacenCodigo[0] ;
         A412Invd_ModuloAlmacen = P001L14_A412Invd_ModuloAlmacen[0] ;
         A411Invd_CentroCostoId = P001L14_A411Invd_CentroCostoId[0] ;
         A410Invd_RegionalId = P001L14_A410Invd_RegionalId[0] ;
         A67Invd_NumeroPlaca = P001L14_A67Invd_NumeroPlaca[0] ;
         A43Cuen_Identificacion = P001L14_A43Cuen_Identificacion[0] ;
         n43Cuen_Identificacion = P001L14_n43Cuen_Identificacion[0] ;
         A66Elem_Consecutivo = P001L14_A66Elem_Consecutivo[0] ;
         if ( AV40Tran_IdCuentadanteOrigen != A43Cuen_Identificacion )
         {
            AV14CuentaFallos = (short)(AV14CuentaFallos+1) ;
            AV24MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
            AV24MensajesItem.setgxTv_SdtMensajes_MensajesItem_Fila( AV18ID_SALIDA );
            AV24MensajesItem.setgxTv_SdtMensajes_MensajesItem_Columna( (short)(1) );
            AV24MensajesItem.setgxTv_SdtMensajes_MensajesItem_Inconsistencia( "La placa del bien no se encuentra asociado al cuentadante o almacenista origen" );
            AV23Mensajes.add(AV24MensajesItem, 0);
            AV24MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
            AV32Session1.setValue("SDTErrores", AV23Mensajes.toxml(false, true, "Mensajes", "ACBSENA"));
            AV24MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
            AV22Mensaje = "RESULTADOS DEL PROCESO DE CARGUE" + GXutil.newLine( ) + "- Total de registros Fallidos    :	" + GXutil.trim( GXutil.str( AV14CuentaFallos, 4, 0)) ;
         }
         pr_default.readNext(12);
      }
      pr_default.close(12);
   }

   public void S176( )
   {
      /* 'BUSCAR ELEMENTO' Routine */
      /* Using cursor P001L15 */
      pr_default.execute(13, new Object[] {AV29PLACASENA, AV29PLACASENA});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A68Invd_PlacaPadre = P001L15_A68Invd_PlacaPadre[0] ;
         n68Invd_PlacaPadre = P001L15_n68Invd_PlacaPadre[0] ;
         A67Invd_NumeroPlaca = P001L15_A67Invd_NumeroPlaca[0] ;
         A66Elem_Consecutivo = P001L15_A66Elem_Consecutivo[0] ;
         AV15Elem_Consecutivo = A66Elem_Consecutivo ;
         /* Execute user subroutine: 'VALIDA TIPO CODIGO' */
         S132 ();
         if ( returnInSub )
         {
            pr_default.close(13);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(13);
      }
      pr_default.close(13);
   }

   public void S165( )
   {
      /* 'BUSCAR INVENTARIO' Routine */
      /* Using cursor P001L16 */
      pr_default.execute(14, new Object[] {AV29PLACASENA, AV29PLACASENA});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A68Invd_PlacaPadre = P001L16_A68Invd_PlacaPadre[0] ;
         n68Invd_PlacaPadre = P001L16_n68Invd_PlacaPadre[0] ;
         A67Invd_NumeroPlaca = P001L16_A67Invd_NumeroPlaca[0] ;
         A66Elem_Consecutivo = P001L16_A66Elem_Consecutivo[0] ;
         A501Invd_EsPlacaPadre = P001L16_A501Invd_EsPlacaPadre[0] ;
         n501Invd_EsPlacaPadre = P001L16_n501Invd_EsPlacaPadre[0] ;
         A463Invd_Estado = P001L16_A463Invd_Estado[0] ;
         n463Invd_Estado = P001L16_n463Invd_Estado[0] ;
         AV15Elem_Consecutivo = A66Elem_Consecutivo ;
         if ( GXutil.strcmp(A501Invd_EsPlacaPadre, "NO") == 0 )
         {
            if ( GXutil.strcmp(A68Invd_PlacaPadre, AV29PLACASENA) != 0 )
            {
               AV20Invd_PlacaPadre = A68Invd_PlacaPadre ;
               /* Execute user subroutine: 'BUSCAR PADRE HERMANOS' */
               S2416 ();
               if ( returnInSub )
               {
                  pr_default.close(14);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         if ( GXutil.strcmp(A463Invd_Estado, "P") == 0 )
         {
            AV14CuentaFallos = (short)(AV14CuentaFallos+1) ;
            AV24MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
            AV24MensajesItem.setgxTv_SdtMensajes_MensajesItem_Fila( AV18ID_SALIDA );
            AV24MensajesItem.setgxTv_SdtMensajes_MensajesItem_Columna( (short)(1) );
            AV24MensajesItem.setgxTv_SdtMensajes_MensajesItem_Inconsistencia( "La placa se encuentra en tránsito" );
            AV23Mensajes.add(AV24MensajesItem, 0);
            AV24MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
            AV32Session1.setValue("SDTErrores", AV23Mensajes.toxml(false, true, "Mensajes", "ACBSENA"));
            AV24MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
            AV22Mensaje = "RESULTADOS DEL PROCESO DE CARGUE" + GXutil.newLine( ) + "- Total de registros Fallidos    :	" + GXutil.trim( GXutil.str( AV14CuentaFallos, 4, 0)) ;
         }
         pr_default.readNext(14);
      }
      pr_default.close(14);
   }

   public void S2416( )
   {
      /* 'BUSCAR PADRE HERMANOS' Routine */
      /* Using cursor P001L17 */
      pr_default.execute(15, new Object[] {AV20Invd_PlacaPadre, AV20Invd_PlacaPadre});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A68Invd_PlacaPadre = P001L17_A68Invd_PlacaPadre[0] ;
         n68Invd_PlacaPadre = P001L17_n68Invd_PlacaPadre[0] ;
         A67Invd_NumeroPlaca = P001L17_A67Invd_NumeroPlaca[0] ;
         A463Invd_Estado = P001L17_A463Invd_Estado[0] ;
         n463Invd_Estado = P001L17_n463Invd_Estado[0] ;
         A66Elem_Consecutivo = P001L17_A66Elem_Consecutivo[0] ;
         if ( GXutil.strcmp(A463Invd_Estado, "P") == 0 )
         {
            AV14CuentaFallos = (short)(AV14CuentaFallos+1) ;
            AV24MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
            AV24MensajesItem.setgxTv_SdtMensajes_MensajesItem_Fila( AV18ID_SALIDA );
            AV24MensajesItem.setgxTv_SdtMensajes_MensajesItem_Columna( (short)(1) );
            AV24MensajesItem.setgxTv_SdtMensajes_MensajesItem_Inconsistencia( "La placa se encuentra en tránsito" );
            AV23Mensajes.add(AV24MensajesItem, 0);
            AV24MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
            AV32Session1.setValue("SDTErrores", AV23Mensajes.toxml(false, true, "Mensajes", "ACBSENA"));
            AV24MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
            AV22Mensaje = "RESULTADOS DEL PROCESO DE CARGUE" + GXutil.newLine( ) + "- Total de registros Fallidos    :	" + GXutil.trim( GXutil.str( AV14CuentaFallos, 4, 0)) ;
         }
         pr_default.readNext(15);
      }
      pr_default.close(15);
   }

   public void S132( )
   {
      /* 'VALIDA TIPO CODIGO' Routine */
      /* Using cursor P001L18 */
      pr_default.execute(16, new Object[] {AV15Elem_Consecutivo});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A66Elem_Consecutivo = P001L18_A66Elem_Consecutivo[0] ;
         A33Tipo_Codigo = P001L18_A33Tipo_Codigo[0] ;
         if ( A33Tipo_Codigo != AV38Tran_CodTipoElemento )
         {
            AV14CuentaFallos = (short)(AV14CuentaFallos+1) ;
            AV24MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
            AV24MensajesItem.setgxTv_SdtMensajes_MensajesItem_Fila( AV18ID_SALIDA );
            AV24MensajesItem.setgxTv_SdtMensajes_MensajesItem_Columna( (short)(1) );
            AV24MensajesItem.setgxTv_SdtMensajes_MensajesItem_Inconsistencia( "El tipo de elemento no tiene relación con el tipo de transacción" );
            AV23Mensajes.add(AV24MensajesItem, 0);
            AV24MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
            AV32Session1.setValue("SDTErrores", AV23Mensajes.toxml(false, true, "Mensajes", "ACBSENA"));
            AV24MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
            AV22Mensaje = "RESULTADOS DEL PROCESO DE CARGUE" + GXutil.newLine( ) + "- Total de registros Fallidos    :	" + GXutil.trim( GXutil.str( AV14CuentaFallos, 4, 0)) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(16);
   }

   public void S143( )
   {
      /* 'VALIDA ALMACEN BODEGA' Routine */
      /* Using cursor P001L19 */
      pr_default.execute(17, new Object[] {new Long(AV39Tran_Id)});
      while ( (pr_default.getStatus(17) != 101) )
      {
         A46Tran_Id = P001L19_A46Tran_Id[0] ;
         A57Tran_RegionId = P001L19_A57Tran_RegionId[0] ;
         n57Tran_RegionId = P001L19_n57Tran_RegionId[0] ;
         A48Tran_CentroCostoId = P001L19_A48Tran_CentroCostoId[0] ;
         A110Tran_ModuloOrigen = P001L19_A110Tran_ModuloOrigen[0] ;
         A109Tran_CodAlmaOrigen = P001L19_A109Tran_CodAlmaOrigen[0] ;
         A112Tran_CodBodeOrigen = P001L19_A112Tran_CodBodeOrigen[0] ;
         AV43Tran_RegionId = A57Tran_RegionId ;
         AV34Tran_CentroCostoId = A48Tran_CentroCostoId ;
         AV42Tran_ModuloOrigen = A110Tran_ModuloOrigen ;
         AV35Tran_CodAlmaOrigen = GXutil.trim( A109Tran_CodAlmaOrigen) ;
         AV37Tran_CodBodeOrigen = GXutil.trim( A112Tran_CodBodeOrigen) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(17);
      AV69GXLvl327 = (byte)(0) ;
      /* Using cursor P001L20 */
      pr_default.execute(18, new Object[] {new Long(AV43Tran_RegionId), new Long(AV34Tran_CentroCostoId), AV42Tran_ModuloOrigen, AV35Tran_CodAlmaOrigen, AV37Tran_CodBodeOrigen, AV15Elem_Consecutivo});
      while ( (pr_default.getStatus(18) != 101) )
      {
         A31Bode_Codigo = P001L20_A31Bode_Codigo[0] ;
         A28Alma_Codigo = P001L20_A28Alma_Codigo[0] ;
         A27Alma_Modulo = P001L20_A27Alma_Modulo[0] ;
         A66Elem_Consecutivo = P001L20_A66Elem_Consecutivo[0] ;
         A92Centro_Id = P001L20_A92Centro_Id[0] ;
         A91Regional = P001L20_A91Regional[0] ;
         A93Trans_Id = P001L20_A93Trans_Id[0] ;
         A94Num_Linea = P001L20_A94Num_Linea[0] ;
         AV69GXLvl327 = (byte)(1) ;
         pr_default.readNext(18);
      }
      pr_default.close(18);
      if ( AV69GXLvl327 == 0 )
      {
         AV14CuentaFallos = (short)(AV14CuentaFallos+1) ;
         AV24MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
         AV24MensajesItem.setgxTv_SdtMensajes_MensajesItem_Fila( AV18ID_SALIDA );
         AV24MensajesItem.setgxTv_SdtMensajes_MensajesItem_Columna( (short)(1) );
         AV24MensajesItem.setgxTv_SdtMensajes_MensajesItem_Inconsistencia( "El elemento no pertenece a la bodega origen" );
         AV23Mensajes.add(AV24MensajesItem, 0);
         AV24MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
         AV32Session1.setValue("SDTErrores", AV23Mensajes.toxml(false, true, "Mensajes", "ACBSENA"));
         AV24MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
         AV22Mensaje = "RESULTADOS DEL PROCESO DE CARGUE" + GXutil.newLine( ) + "- Total de registros Fallidos    :	" + GXutil.trim( GXutil.str( AV14CuentaFallos, 4, 0)) ;
      }
   }

   public void S154( )
   {
      /* 'VALIDA CANTIDAD' Routine */
      AV10Cantidad_Diponible = 0 ;
      /* Using cursor P001L21 */
      pr_default.execute(19, new Object[] {new Long(AV39Tran_Id)});
      while ( (pr_default.getStatus(19) != 101) )
      {
         A46Tran_Id = P001L21_A46Tran_Id[0] ;
         A109Tran_CodAlmaOrigen = P001L21_A109Tran_CodAlmaOrigen[0] ;
         A112Tran_CodBodeOrigen = P001L21_A112Tran_CodBodeOrigen[0] ;
         A48Tran_CentroCostoId = P001L21_A48Tran_CentroCostoId[0] ;
         AV35Tran_CodAlmaOrigen = A109Tran_CodAlmaOrigen ;
         AV37Tran_CodBodeOrigen = A112Tran_CodBodeOrigen ;
         AV34Tran_CentroCostoId = A48Tran_CentroCostoId ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(19);
      /* Optimized group. */
      /* Using cursor P001L22 */
      pr_default.execute(20, new Object[] {AV15Elem_Consecutivo, new Long(AV34Tran_CentroCostoId), AV35Tran_CodAlmaOrigen, AV37Tran_CodBodeOrigen});
      c618Cantidad_Diponible = P001L22_A618Cantidad_Diponible[0] ;
      n618Cantidad_Diponible = P001L22_n618Cantidad_Diponible[0] ;
      pr_default.close(20);
      AV10Cantidad_Diponible = (int)(AV10Cantidad_Diponible+c618Cantidad_Diponible) ;
      /* End optimized group. */
      if ( AV9CANTIDAD > AV10Cantidad_Diponible )
      {
         AV14CuentaFallos = (short)(AV14CuentaFallos+1) ;
         AV24MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
         AV24MensajesItem.setgxTv_SdtMensajes_MensajesItem_Fila( AV18ID_SALIDA );
         AV24MensajesItem.setgxTv_SdtMensajes_MensajesItem_Columna( (short)(2) );
         AV24MensajesItem.setgxTv_SdtMensajes_MensajesItem_Inconsistencia( "El elemento no tiene disponible para la solicitud" );
         AV23Mensajes.add(AV24MensajesItem, 0);
         AV24MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
         AV32Session1.setValue("SDTErrores", AV23Mensajes.toxml(false, true, "Mensajes", "ACBSENA"));
         AV24MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
         AV22Mensaje = "RESULTADOS DEL PROCESO DE CARGUE" + GXutil.newLine( ) + "- Total de registros Fallidos    :	" + GXutil.trim( GXutil.str( AV14CuentaFallos, 4, 0)) ;
      }
   }

   public void S251( )
   {
      /* 'MENSAJEERROR' Routine */
      if ( GXutil.strcmp(AV25Message.getgxTv_SdtMessages_Message_Id(), "OutOfRange") == 0 )
      {
         AV28NumeroColumna = (short)(GXutil.lval( GXutil.substring( AV25Message.getgxTv_SdtMessages_Message_Description(), 2, 3))) ;
         AV44ColumnaExcel = GXutil.trim( AV17ExcelDocument.Cells(1, AV28NumeroColumna, 1, 1).getText()) ;
         AV27MessageDescrip = GXutil.substring( AV25Message.getgxTv_SdtMessages_Message_Description(), 5, 100) ;
      }
      else
      {
         AV45Nombrecolumna = GXutil.trim( AV25Message.getgxTv_SdtMessages_Message_Id()) ;
         AV28NumeroColumna = (short)(GXutil.lval( GXutil.substring( AV45Nombrecolumna, 2, 3))) ;
         AV44ColumnaExcel = GXutil.trim( AV17ExcelDocument.Cells(1, AV28NumeroColumna, 1, 1).getText()) ;
         AV27MessageDescrip = AV25Message.getgxTv_SdtMessages_Message_Description() ;
      }
   }

   protected void cleanup( )
   {
      this.aP2[0] = validaarchivosalida.this.AV22Mensaje;
      this.aP3[0] = validaarchivosalida.this.AV14CuentaFallos;
      this.aP4[0] = validaarchivosalida.this.AV13CuentaCargados;
      this.aP5[0] = validaarchivosalida.this.AV26MessageCount;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "validaarchivosalida");
      CloseOpenCursors();
      AV17ExcelDocument.cleanup();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV22Mensaje = "" ;
      AV17ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV21MasCargue = new com.orions2.SdtMAS_CARGUE_SALIDAS(remoteHandle);
      AV49GXV1 = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Messages.Message", "GeneXus", remoteHandle);
      AV25Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV24MensajesItem = new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
      AV27MessageDescrip = "" ;
      AV23Mensajes = new GXBaseCollection<com.orions2.SdtMensajes_MensajesItem>(com.orions2.SdtMensajes_MensajesItem.class, "Mensajes.MensajesItem", "ACBSENA", remoteHandle);
      AV32Session1 = httpContext.getWebSession();
      AV15Elem_Consecutivo = "" ;
      scmdbuf = "" ;
      P001L2_A78NUMTRN = new long[1] ;
      P001L2_A553CONSECUTIVO = new String[] {""} ;
      P001L2_n553CONSECUTIVO = new boolean[] {false} ;
      P001L2_A554CANTIDAD = new short[1] ;
      P001L2_n554CANTIDAD = new boolean[] {false} ;
      P001L2_A79ID_SALIDA = new short[1] ;
      A553CONSECUTIVO = "" ;
      P001L3_A78NUMTRN = new long[1] ;
      P001L3_A553CONSECUTIVO = new String[] {""} ;
      P001L3_n553CONSECUTIVO = new boolean[] {false} ;
      P001L3_A554CANTIDAD = new short[1] ;
      P001L3_n554CANTIDAD = new boolean[] {false} ;
      P001L3_A79ID_SALIDA = new short[1] ;
      P001L4_A78NUMTRN = new long[1] ;
      P001L4_A553CONSECUTIVO = new String[] {""} ;
      P001L4_n553CONSECUTIVO = new boolean[] {false} ;
      P001L4_A554CANTIDAD = new short[1] ;
      P001L4_n554CANTIDAD = new boolean[] {false} ;
      P001L4_A79ID_SALIDA = new short[1] ;
      P001L5_A78NUMTRN = new long[1] ;
      P001L5_A530PLACASENA = new String[] {""} ;
      P001L5_n530PLACASENA = new boolean[] {false} ;
      P001L5_A79ID_SALIDA = new short[1] ;
      A530PLACASENA = "" ;
      AV29PLACASENA = "" ;
      P001L6_A78NUMTRN = new long[1] ;
      P001L6_A530PLACASENA = new String[] {""} ;
      P001L6_n530PLACASENA = new boolean[] {false} ;
      P001L6_A79ID_SALIDA = new short[1] ;
      P001L7_A46Tran_Id = new long[1] ;
      P001L7_A57Tran_RegionId = new long[1] ;
      P001L7_n57Tran_RegionId = new boolean[] {false} ;
      P001L7_A48Tran_CentroCostoId = new long[1] ;
      P001L7_A110Tran_ModuloOrigen = new String[] {""} ;
      P001L7_A109Tran_CodAlmaOrigen = new String[] {""} ;
      P001L7_A387Tran_CodBodeDestino = new String[] {""} ;
      P001L7_A51Tran_IdCuentadanteOrigen = new long[1] ;
      P001L7_n51Tran_IdCuentadanteOrigen = new boolean[] {false} ;
      A110Tran_ModuloOrigen = "" ;
      A109Tran_CodAlmaOrigen = "" ;
      A387Tran_CodBodeDestino = "" ;
      AV42Tran_ModuloOrigen = "" ;
      AV35Tran_CodAlmaOrigen = "" ;
      AV36Tran_CodBodeDestino = "" ;
      P001L9_A78NUMTRN = new long[1] ;
      P001L9_A553CONSECUTIVO = new String[] {""} ;
      P001L9_n553CONSECUTIVO = new boolean[] {false} ;
      P001L9_A554CANTIDAD = new short[1] ;
      P001L9_n554CANTIDAD = new boolean[] {false} ;
      P001L9_A79ID_SALIDA = new short[1] ;
      AV11consecutivo = "" ;
      AV37Tran_CodBodeOrigen = "" ;
      P001L10_A31Bode_Codigo = new String[] {""} ;
      P001L10_A28Alma_Codigo = new String[] {""} ;
      P001L10_A27Alma_Modulo = new String[] {""} ;
      P001L10_A66Elem_Consecutivo = new String[] {""} ;
      P001L10_A92Centro_Id = new long[1] ;
      P001L10_A91Regional = new long[1] ;
      P001L10_A93Trans_Id = new long[1] ;
      P001L10_A94Num_Linea = new int[1] ;
      A31Bode_Codigo = "" ;
      A28Alma_Codigo = "" ;
      A27Alma_Modulo = "" ;
      A66Elem_Consecutivo = "" ;
      P001L11_A78NUMTRN = new long[1] ;
      P001L11_A530PLACASENA = new String[] {""} ;
      P001L11_n530PLACASENA = new boolean[] {false} ;
      P001L11_A79ID_SALIDA = new short[1] ;
      P001L12_A414Invd_BodegaCodigo = new String[] {""} ;
      P001L12_A413Invd_AlmacenCodigo = new String[] {""} ;
      P001L12_A412Invd_ModuloAlmacen = new String[] {""} ;
      P001L12_A411Invd_CentroCostoId = new long[1] ;
      P001L12_A67Invd_NumeroPlaca = new String[] {""} ;
      P001L12_A66Elem_Consecutivo = new String[] {""} ;
      A414Invd_BodegaCodigo = "" ;
      A413Invd_AlmacenCodigo = "" ;
      A412Invd_ModuloAlmacen = "" ;
      A67Invd_NumeroPlaca = "" ;
      P001L13_A78NUMTRN = new long[1] ;
      P001L13_A530PLACASENA = new String[] {""} ;
      P001L13_n530PLACASENA = new boolean[] {false} ;
      P001L13_A79ID_SALIDA = new short[1] ;
      P001L14_A414Invd_BodegaCodigo = new String[] {""} ;
      P001L14_A413Invd_AlmacenCodigo = new String[] {""} ;
      P001L14_A412Invd_ModuloAlmacen = new String[] {""} ;
      P001L14_A411Invd_CentroCostoId = new long[1] ;
      P001L14_A410Invd_RegionalId = new long[1] ;
      P001L14_A67Invd_NumeroPlaca = new String[] {""} ;
      P001L14_A43Cuen_Identificacion = new long[1] ;
      P001L14_n43Cuen_Identificacion = new boolean[] {false} ;
      P001L14_A66Elem_Consecutivo = new String[] {""} ;
      P001L15_A68Invd_PlacaPadre = new String[] {""} ;
      P001L15_n68Invd_PlacaPadre = new boolean[] {false} ;
      P001L15_A67Invd_NumeroPlaca = new String[] {""} ;
      P001L15_A66Elem_Consecutivo = new String[] {""} ;
      A68Invd_PlacaPadre = "" ;
      P001L16_A68Invd_PlacaPadre = new String[] {""} ;
      P001L16_n68Invd_PlacaPadre = new boolean[] {false} ;
      P001L16_A67Invd_NumeroPlaca = new String[] {""} ;
      P001L16_A66Elem_Consecutivo = new String[] {""} ;
      P001L16_A501Invd_EsPlacaPadre = new String[] {""} ;
      P001L16_n501Invd_EsPlacaPadre = new boolean[] {false} ;
      P001L16_A463Invd_Estado = new String[] {""} ;
      P001L16_n463Invd_Estado = new boolean[] {false} ;
      A501Invd_EsPlacaPadre = "" ;
      A463Invd_Estado = "" ;
      AV20Invd_PlacaPadre = "" ;
      P001L17_A68Invd_PlacaPadre = new String[] {""} ;
      P001L17_n68Invd_PlacaPadre = new boolean[] {false} ;
      P001L17_A67Invd_NumeroPlaca = new String[] {""} ;
      P001L17_A463Invd_Estado = new String[] {""} ;
      P001L17_n463Invd_Estado = new boolean[] {false} ;
      P001L17_A66Elem_Consecutivo = new String[] {""} ;
      P001L18_A66Elem_Consecutivo = new String[] {""} ;
      P001L18_A33Tipo_Codigo = new long[1] ;
      P001L19_A46Tran_Id = new long[1] ;
      P001L19_A57Tran_RegionId = new long[1] ;
      P001L19_n57Tran_RegionId = new boolean[] {false} ;
      P001L19_A48Tran_CentroCostoId = new long[1] ;
      P001L19_A110Tran_ModuloOrigen = new String[] {""} ;
      P001L19_A109Tran_CodAlmaOrigen = new String[] {""} ;
      P001L19_A112Tran_CodBodeOrigen = new String[] {""} ;
      A112Tran_CodBodeOrigen = "" ;
      P001L20_A31Bode_Codigo = new String[] {""} ;
      P001L20_A28Alma_Codigo = new String[] {""} ;
      P001L20_A27Alma_Modulo = new String[] {""} ;
      P001L20_A66Elem_Consecutivo = new String[] {""} ;
      P001L20_A92Centro_Id = new long[1] ;
      P001L20_A91Regional = new long[1] ;
      P001L20_A93Trans_Id = new long[1] ;
      P001L20_A94Num_Linea = new int[1] ;
      P001L21_A46Tran_Id = new long[1] ;
      P001L21_A109Tran_CodAlmaOrigen = new String[] {""} ;
      P001L21_A112Tran_CodBodeOrigen = new String[] {""} ;
      P001L21_A48Tran_CentroCostoId = new long[1] ;
      P001L22_A618Cantidad_Diponible = new int[1] ;
      P001L22_n618Cantidad_Diponible = new boolean[] {false} ;
      AV44ColumnaExcel = "" ;
      AV45Nombrecolumna = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.validaarchivosalida__default(),
         new Object[] {
             new Object[] {
            P001L2_A78NUMTRN, P001L2_A553CONSECUTIVO, P001L2_n553CONSECUTIVO, P001L2_A554CANTIDAD, P001L2_n554CANTIDAD, P001L2_A79ID_SALIDA
            }
            , new Object[] {
            P001L3_A78NUMTRN, P001L3_A553CONSECUTIVO, P001L3_n553CONSECUTIVO, P001L3_A554CANTIDAD, P001L3_n554CANTIDAD, P001L3_A79ID_SALIDA
            }
            , new Object[] {
            P001L4_A78NUMTRN, P001L4_A553CONSECUTIVO, P001L4_n553CONSECUTIVO, P001L4_A554CANTIDAD, P001L4_n554CANTIDAD, P001L4_A79ID_SALIDA
            }
            , new Object[] {
            P001L5_A78NUMTRN, P001L5_A530PLACASENA, P001L5_n530PLACASENA, P001L5_A79ID_SALIDA
            }
            , new Object[] {
            P001L6_A78NUMTRN, P001L6_A530PLACASENA, P001L6_n530PLACASENA, P001L6_A79ID_SALIDA
            }
            , new Object[] {
            P001L7_A46Tran_Id, P001L7_A57Tran_RegionId, P001L7_n57Tran_RegionId, P001L7_A48Tran_CentroCostoId, P001L7_A110Tran_ModuloOrigen, P001L7_A109Tran_CodAlmaOrigen, P001L7_A387Tran_CodBodeDestino, P001L7_A51Tran_IdCuentadanteOrigen, P001L7_n51Tran_IdCuentadanteOrigen
            }
            , new Object[] {
            }
            , new Object[] {
            P001L9_A78NUMTRN, P001L9_A553CONSECUTIVO, P001L9_n553CONSECUTIVO, P001L9_A554CANTIDAD, P001L9_n554CANTIDAD, P001L9_A79ID_SALIDA
            }
            , new Object[] {
            P001L10_A31Bode_Codigo, P001L10_A28Alma_Codigo, P001L10_A27Alma_Modulo, P001L10_A66Elem_Consecutivo, P001L10_A92Centro_Id, P001L10_A91Regional, P001L10_A93Trans_Id, P001L10_A94Num_Linea
            }
            , new Object[] {
            P001L11_A78NUMTRN, P001L11_A530PLACASENA, P001L11_n530PLACASENA, P001L11_A79ID_SALIDA
            }
            , new Object[] {
            P001L12_A414Invd_BodegaCodigo, P001L12_A413Invd_AlmacenCodigo, P001L12_A412Invd_ModuloAlmacen, P001L12_A411Invd_CentroCostoId, P001L12_A67Invd_NumeroPlaca, P001L12_A66Elem_Consecutivo
            }
            , new Object[] {
            P001L13_A78NUMTRN, P001L13_A530PLACASENA, P001L13_n530PLACASENA, P001L13_A79ID_SALIDA
            }
            , new Object[] {
            P001L14_A414Invd_BodegaCodigo, P001L14_A413Invd_AlmacenCodigo, P001L14_A412Invd_ModuloAlmacen, P001L14_A411Invd_CentroCostoId, P001L14_A410Invd_RegionalId, P001L14_A67Invd_NumeroPlaca, P001L14_A43Cuen_Identificacion, P001L14_n43Cuen_Identificacion, P001L14_A66Elem_Consecutivo
            }
            , new Object[] {
            P001L15_A68Invd_PlacaPadre, P001L15_n68Invd_PlacaPadre, P001L15_A67Invd_NumeroPlaca, P001L15_A66Elem_Consecutivo
            }
            , new Object[] {
            P001L16_A68Invd_PlacaPadre, P001L16_n68Invd_PlacaPadre, P001L16_A67Invd_NumeroPlaca, P001L16_A66Elem_Consecutivo, P001L16_A501Invd_EsPlacaPadre, P001L16_n501Invd_EsPlacaPadre, P001L16_A463Invd_Estado, P001L16_n463Invd_Estado
            }
            , new Object[] {
            P001L17_A68Invd_PlacaPadre, P001L17_n68Invd_PlacaPadre, P001L17_A67Invd_NumeroPlaca, P001L17_A463Invd_Estado, P001L17_n463Invd_Estado, P001L17_A66Elem_Consecutivo
            }
            , new Object[] {
            P001L18_A66Elem_Consecutivo, P001L18_A33Tipo_Codigo
            }
            , new Object[] {
            P001L19_A46Tran_Id, P001L19_A57Tran_RegionId, P001L19_n57Tran_RegionId, P001L19_A48Tran_CentroCostoId, P001L19_A110Tran_ModuloOrigen, P001L19_A109Tran_CodAlmaOrigen, P001L19_A112Tran_CodBodeOrigen
            }
            , new Object[] {
            P001L20_A31Bode_Codigo, P001L20_A28Alma_Codigo, P001L20_A27Alma_Modulo, P001L20_A66Elem_Consecutivo, P001L20_A92Centro_Id, P001L20_A91Regional, P001L20_A93Trans_Id, P001L20_A94Num_Linea
            }
            , new Object[] {
            P001L21_A46Tran_Id, P001L21_A109Tran_CodAlmaOrigen, P001L21_A112Tran_CodBodeOrigen, P001L21_A48Tran_CentroCostoId
            }
            , new Object[] {
            P001L22_A618Cantidad_Diponible, P001L22_n618Cantidad_Diponible
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV59GXLvl142 ;
   private byte AV61GXLvl176 ;
   private byte AV69GXLvl327 ;
   private short AV14CuentaFallos ;
   private short AV13CuentaCargados ;
   private short AV26MessageCount ;
   private short AV30Row ;
   private short AV31SALIDA ;
   private short AV46PLACA ;
   private short AV28NumeroColumna ;
   private short A554CANTIDAD ;
   private short A79ID_SALIDA ;
   private short AV18ID_SALIDA ;
   private short AV9CANTIDAD ;
   private short Gx_err ;
   private int AV50GXV2 ;
   private int A94Num_Linea ;
   private int AV10Cantidad_Diponible ;
   private int c618Cantidad_Diponible ;
   private long AV39Tran_Id ;
   private long AV38Tran_CodTipoElemento ;
   private long A78NUMTRN ;
   private long A46Tran_Id ;
   private long A57Tran_RegionId ;
   private long A48Tran_CentroCostoId ;
   private long A51Tran_IdCuentadanteOrigen ;
   private long AV43Tran_RegionId ;
   private long AV34Tran_CentroCostoId ;
   private long AV40Tran_IdCuentadanteOrigen ;
   private long A92Centro_Id ;
   private long A91Regional ;
   private long A93Trans_Id ;
   private long A411Invd_CentroCostoId ;
   private long A410Invd_RegionalId ;
   private long A43Cuen_Identificacion ;
   private long A33Tipo_Codigo ;
   private String scmdbuf ;
   private String A501Invd_EsPlacaPadre ;
   private boolean returnInSub ;
   private boolean n553CONSECUTIVO ;
   private boolean n554CANTIDAD ;
   private boolean n530PLACASENA ;
   private boolean n57Tran_RegionId ;
   private boolean n51Tran_IdCuentadanteOrigen ;
   private boolean n43Cuen_Identificacion ;
   private boolean n68Invd_PlacaPadre ;
   private boolean n501Invd_EsPlacaPadre ;
   private boolean n463Invd_Estado ;
   private boolean n618Cantidad_Diponible ;
   private String AV8Archivo ;
   private String AV33Tipo_Bien ;
   private String AV22Mensaje ;
   private String AV41Tran_IndE_S ;
   private String AV27MessageDescrip ;
   private String AV15Elem_Consecutivo ;
   private String A553CONSECUTIVO ;
   private String A530PLACASENA ;
   private String AV29PLACASENA ;
   private String A110Tran_ModuloOrigen ;
   private String A109Tran_CodAlmaOrigen ;
   private String A387Tran_CodBodeDestino ;
   private String AV42Tran_ModuloOrigen ;
   private String AV35Tran_CodAlmaOrigen ;
   private String AV36Tran_CodBodeDestino ;
   private String AV11consecutivo ;
   private String AV37Tran_CodBodeOrigen ;
   private String A31Bode_Codigo ;
   private String A28Alma_Codigo ;
   private String A27Alma_Modulo ;
   private String A66Elem_Consecutivo ;
   private String A414Invd_BodegaCodigo ;
   private String A413Invd_AlmacenCodigo ;
   private String A412Invd_ModuloAlmacen ;
   private String A67Invd_NumeroPlaca ;
   private String A68Invd_PlacaPadre ;
   private String A463Invd_Estado ;
   private String AV20Invd_PlacaPadre ;
   private String A112Tran_CodBodeOrigen ;
   private String AV44ColumnaExcel ;
   private String AV45Nombrecolumna ;
   private com.genexus.gxoffice.ExcelDoc AV17ExcelDocument ;
   private com.orions2.SdtMAS_CARGUE_SALIDAS AV21MasCargue ;
   private String[] aP2 ;
   private short[] aP3 ;
   private short[] aP4 ;
   private short[] aP5 ;
   private IDataStoreProvider pr_default ;
   private long[] P001L2_A78NUMTRN ;
   private String[] P001L2_A553CONSECUTIVO ;
   private boolean[] P001L2_n553CONSECUTIVO ;
   private short[] P001L2_A554CANTIDAD ;
   private boolean[] P001L2_n554CANTIDAD ;
   private short[] P001L2_A79ID_SALIDA ;
   private long[] P001L3_A78NUMTRN ;
   private String[] P001L3_A553CONSECUTIVO ;
   private boolean[] P001L3_n553CONSECUTIVO ;
   private short[] P001L3_A554CANTIDAD ;
   private boolean[] P001L3_n554CANTIDAD ;
   private short[] P001L3_A79ID_SALIDA ;
   private long[] P001L4_A78NUMTRN ;
   private String[] P001L4_A553CONSECUTIVO ;
   private boolean[] P001L4_n553CONSECUTIVO ;
   private short[] P001L4_A554CANTIDAD ;
   private boolean[] P001L4_n554CANTIDAD ;
   private short[] P001L4_A79ID_SALIDA ;
   private long[] P001L5_A78NUMTRN ;
   private String[] P001L5_A530PLACASENA ;
   private boolean[] P001L5_n530PLACASENA ;
   private short[] P001L5_A79ID_SALIDA ;
   private long[] P001L6_A78NUMTRN ;
   private String[] P001L6_A530PLACASENA ;
   private boolean[] P001L6_n530PLACASENA ;
   private short[] P001L6_A79ID_SALIDA ;
   private long[] P001L7_A46Tran_Id ;
   private long[] P001L7_A57Tran_RegionId ;
   private boolean[] P001L7_n57Tran_RegionId ;
   private long[] P001L7_A48Tran_CentroCostoId ;
   private String[] P001L7_A110Tran_ModuloOrigen ;
   private String[] P001L7_A109Tran_CodAlmaOrigen ;
   private String[] P001L7_A387Tran_CodBodeDestino ;
   private long[] P001L7_A51Tran_IdCuentadanteOrigen ;
   private boolean[] P001L7_n51Tran_IdCuentadanteOrigen ;
   private long[] P001L9_A78NUMTRN ;
   private String[] P001L9_A553CONSECUTIVO ;
   private boolean[] P001L9_n553CONSECUTIVO ;
   private short[] P001L9_A554CANTIDAD ;
   private boolean[] P001L9_n554CANTIDAD ;
   private short[] P001L9_A79ID_SALIDA ;
   private String[] P001L10_A31Bode_Codigo ;
   private String[] P001L10_A28Alma_Codigo ;
   private String[] P001L10_A27Alma_Modulo ;
   private String[] P001L10_A66Elem_Consecutivo ;
   private long[] P001L10_A92Centro_Id ;
   private long[] P001L10_A91Regional ;
   private long[] P001L10_A93Trans_Id ;
   private int[] P001L10_A94Num_Linea ;
   private long[] P001L11_A78NUMTRN ;
   private String[] P001L11_A530PLACASENA ;
   private boolean[] P001L11_n530PLACASENA ;
   private short[] P001L11_A79ID_SALIDA ;
   private String[] P001L12_A414Invd_BodegaCodigo ;
   private String[] P001L12_A413Invd_AlmacenCodigo ;
   private String[] P001L12_A412Invd_ModuloAlmacen ;
   private long[] P001L12_A411Invd_CentroCostoId ;
   private String[] P001L12_A67Invd_NumeroPlaca ;
   private String[] P001L12_A66Elem_Consecutivo ;
   private long[] P001L13_A78NUMTRN ;
   private String[] P001L13_A530PLACASENA ;
   private boolean[] P001L13_n530PLACASENA ;
   private short[] P001L13_A79ID_SALIDA ;
   private String[] P001L14_A414Invd_BodegaCodigo ;
   private String[] P001L14_A413Invd_AlmacenCodigo ;
   private String[] P001L14_A412Invd_ModuloAlmacen ;
   private long[] P001L14_A411Invd_CentroCostoId ;
   private long[] P001L14_A410Invd_RegionalId ;
   private String[] P001L14_A67Invd_NumeroPlaca ;
   private long[] P001L14_A43Cuen_Identificacion ;
   private boolean[] P001L14_n43Cuen_Identificacion ;
   private String[] P001L14_A66Elem_Consecutivo ;
   private String[] P001L15_A68Invd_PlacaPadre ;
   private boolean[] P001L15_n68Invd_PlacaPadre ;
   private String[] P001L15_A67Invd_NumeroPlaca ;
   private String[] P001L15_A66Elem_Consecutivo ;
   private String[] P001L16_A68Invd_PlacaPadre ;
   private boolean[] P001L16_n68Invd_PlacaPadre ;
   private String[] P001L16_A67Invd_NumeroPlaca ;
   private String[] P001L16_A66Elem_Consecutivo ;
   private String[] P001L16_A501Invd_EsPlacaPadre ;
   private boolean[] P001L16_n501Invd_EsPlacaPadre ;
   private String[] P001L16_A463Invd_Estado ;
   private boolean[] P001L16_n463Invd_Estado ;
   private String[] P001L17_A68Invd_PlacaPadre ;
   private boolean[] P001L17_n68Invd_PlacaPadre ;
   private String[] P001L17_A67Invd_NumeroPlaca ;
   private String[] P001L17_A463Invd_Estado ;
   private boolean[] P001L17_n463Invd_Estado ;
   private String[] P001L17_A66Elem_Consecutivo ;
   private String[] P001L18_A66Elem_Consecutivo ;
   private long[] P001L18_A33Tipo_Codigo ;
   private long[] P001L19_A46Tran_Id ;
   private long[] P001L19_A57Tran_RegionId ;
   private boolean[] P001L19_n57Tran_RegionId ;
   private long[] P001L19_A48Tran_CentroCostoId ;
   private String[] P001L19_A110Tran_ModuloOrigen ;
   private String[] P001L19_A109Tran_CodAlmaOrigen ;
   private String[] P001L19_A112Tran_CodBodeOrigen ;
   private String[] P001L20_A31Bode_Codigo ;
   private String[] P001L20_A28Alma_Codigo ;
   private String[] P001L20_A27Alma_Modulo ;
   private String[] P001L20_A66Elem_Consecutivo ;
   private long[] P001L20_A92Centro_Id ;
   private long[] P001L20_A91Regional ;
   private long[] P001L20_A93Trans_Id ;
   private int[] P001L20_A94Num_Linea ;
   private long[] P001L21_A46Tran_Id ;
   private String[] P001L21_A109Tran_CodAlmaOrigen ;
   private String[] P001L21_A112Tran_CodBodeOrigen ;
   private long[] P001L21_A48Tran_CentroCostoId ;
   private int[] P001L22_A618Cantidad_Diponible ;
   private boolean[] P001L22_n618Cantidad_Diponible ;
   private com.genexus.webpanels.WebSession AV32Session1 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV49GXV1 ;
   private GXBaseCollection<com.orions2.SdtMensajes_MensajesItem> AV23Mensajes ;
   private com.genexus.SdtMessages_Message AV25Message ;
   private com.orions2.SdtMensajes_MensajesItem AV24MensajesItem ;
}

final  class validaarchivosalida__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001L2", "SELECT NUMTRN, CONSECUTIVO, CANTIDAD, ID_SALIDA FROM MAS_CARGUE_SALIDAS WHERE NUMTRN = ? ORDER BY NUMTRN, ID_SALIDA ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001L3", "SELECT NUMTRN, CONSECUTIVO, CANTIDAD, ID_SALIDA FROM MAS_CARGUE_SALIDAS WHERE NUMTRN = ? ORDER BY NUMTRN, ID_SALIDA ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001L4", "SELECT NUMTRN, CONSECUTIVO, CANTIDAD, ID_SALIDA FROM MAS_CARGUE_SALIDAS WHERE NUMTRN = ? ORDER BY NUMTRN, ID_SALIDA ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001L5", "SELECT NUMTRN, PLACASENA, ID_SALIDA FROM MAS_CARGUE_SALIDAS WHERE NUMTRN = ? ORDER BY NUMTRN, ID_SALIDA ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001L6", "SELECT NUMTRN, PLACASENA, ID_SALIDA FROM MAS_CARGUE_SALIDAS WHERE NUMTRN = ? ORDER BY NUMTRN, ID_SALIDA ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001L7", "SELECT Tran_Id, Tran_RegionId, Tran_CentroCostoId, Tran_ModuloOrigen, Tran_CodAlmaOrigen, Tran_CodBodeDestino, Tran_IdCuentadanteOrigen FROM ALM_TRANSACCION WHERE Tran_Id = ? ORDER BY Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P001L8", "DELETE FROM MAS_CARGUE_SALIDAS  WHERE NUMTRN = ?", GX_NOMASK + GX_MASKLOOPLOCK, "MAS_CARGUE_SALIDAS")
         ,new ForEachCursor("P001L9", "SELECT NUMTRN, CONSECUTIVO, CANTIDAD, ID_SALIDA FROM MAS_CARGUE_SALIDAS WHERE NUMTRN = ? ORDER BY NUMTRN, ID_SALIDA ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001L10", "SELECT Bode_Codigo, Alma_Codigo, Alma_Modulo, Elem_Consecutivo, Centro_Id, Regional, Trans_Id, Num_Linea FROM ALM_INV_CON WHERE (Elem_Consecutivo = ?) AND (Centro_Id = ?) AND (Alma_Modulo = ?) AND (Alma_Codigo = ?) AND (Bode_Codigo = ?) ORDER BY Elem_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001L11", "SELECT NUMTRN, PLACASENA, ID_SALIDA FROM MAS_CARGUE_SALIDAS WHERE NUMTRN = ? ORDER BY NUMTRN, ID_SALIDA ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001L12", "SELECT Invd_BodegaCodigo, Invd_AlmacenCodigo, Invd_ModuloAlmacen, Invd_CentroCostoId, Invd_NumeroPlaca, Elem_Consecutivo FROM ALM_INVENTARIO_DEVOLUTIVO WHERE (Invd_NumeroPlaca = ?) AND (Invd_CentroCostoId = ?) AND (Invd_ModuloAlmacen = ?) AND (Invd_AlmacenCodigo = ?) AND (Invd_BodegaCodigo = ?) ORDER BY Invd_NumeroPlaca ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P001L13", "SELECT NUMTRN, PLACASENA, ID_SALIDA FROM MAS_CARGUE_SALIDAS WHERE NUMTRN = ? ORDER BY NUMTRN, ID_SALIDA ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001L14", "SELECT Invd_BodegaCodigo, Invd_AlmacenCodigo, Invd_ModuloAlmacen, Invd_CentroCostoId, Invd_RegionalId, Invd_NumeroPlaca, Cuen_Identificacion, Elem_Consecutivo FROM ALM_INVENTARIO_DEVOLUTIVO WHERE (Invd_NumeroPlaca = ? and Invd_RegionalId = ?) AND (Invd_CentroCostoId = ?) AND (Invd_ModuloAlmacen = ?) AND (Invd_AlmacenCodigo = ?) AND (Invd_BodegaCodigo = ?) ORDER BY Invd_NumeroPlaca, Invd_RegionalId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001L15", "SELECT Invd_PlacaPadre, Invd_NumeroPlaca, Elem_Consecutivo FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Invd_NumeroPlaca = ? or Invd_PlacaPadre = ? ORDER BY Elem_Consecutivo, Invd_NumeroPlaca ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001L16", "SELECT Invd_PlacaPadre, Invd_NumeroPlaca, Elem_Consecutivo, Invd_EsPlacaPadre, Invd_Estado FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Invd_NumeroPlaca = ? or Invd_PlacaPadre = ? ORDER BY Elem_Consecutivo, Invd_NumeroPlaca ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001L17", "SELECT Invd_PlacaPadre, Invd_NumeroPlaca, Invd_Estado, Elem_Consecutivo FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Invd_NumeroPlaca = ? or Invd_PlacaPadre = ? ORDER BY Elem_Consecutivo, Invd_NumeroPlaca ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001L18", "SELECT Elem_Consecutivo, Tipo_Codigo FROM ALM_ELEMENTO WHERE Elem_Consecutivo = ? ORDER BY Elem_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P001L19", "SELECT Tran_Id, Tran_RegionId, Tran_CentroCostoId, Tran_ModuloOrigen, Tran_CodAlmaOrigen, Tran_CodBodeOrigen FROM ALM_TRANSACCION WHERE Tran_Id = ? ORDER BY Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P001L20", "SELECT Bode_Codigo, Alma_Codigo, Alma_Modulo, Elem_Consecutivo, Centro_Id, Regional, Trans_Id, Num_Linea FROM ALM_INV_CON WHERE Regional = ? and Centro_Id = ? and Alma_Modulo = ? and Alma_Codigo = ? and Bode_Codigo = ? and Elem_Consecutivo = ? ORDER BY Regional, Centro_Id, Alma_Modulo, Alma_Codigo, Bode_Codigo, Elem_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001L21", "SELECT Tran_Id, Tran_CodAlmaOrigen, Tran_CodBodeOrigen, Tran_CentroCostoId FROM ALM_TRANSACCION WHERE Tran_Id = ? ORDER BY Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P001L22", "SELECT SUM(Cantidad_Diponible) FROM ALM_INV_CON WHERE (Elem_Consecutivo = ?) AND (Centro_Id = ?) AND (Alma_Codigo = ?) AND (Bode_Codigo = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4) ;
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((long[]) buf[7])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4) ;
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((long[]) buf[5])[0] = rslt.getLong(6) ;
               ((long[]) buf[6])[0] = rslt.getLong(7) ;
               ((int[]) buf[7])[0] = rslt.getInt(8) ;
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               return;
            case 11 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((long[]) buf[6])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(8) ;
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[4])[0] = rslt.getString(4, 2) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 17 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((long[]) buf[5])[0] = rslt.getLong(6) ;
               ((long[]) buf[6])[0] = rslt.getLong(7) ;
               ((int[]) buf[7])[0] = rslt.getInt(8) ;
               return;
            case 19 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               return;
            case 20 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 9);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 8);
               stmt.setVarchar(4, (String)parms[3], 2);
               stmt.setVarchar(5, (String)parms[4], 3);
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 30);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 8);
               stmt.setVarchar(4, (String)parms[3], 2);
               stmt.setVarchar(5, (String)parms[4], 3);
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 30);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setVarchar(4, (String)parms[3], 8);
               stmt.setVarchar(5, (String)parms[4], 2);
               stmt.setVarchar(6, (String)parms[5], 3);
               return;
            case 13 :
               stmt.setVarchar(1, (String)parms[0], 30);
               stmt.setVarchar(2, (String)parms[1], 30);
               return;
            case 14 :
               stmt.setVarchar(1, (String)parms[0], 30);
               stmt.setVarchar(2, (String)parms[1], 30);
               return;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 30);
               stmt.setVarchar(2, (String)parms[1], 30);
               return;
            case 16 :
               stmt.setVarchar(1, (String)parms[0], 9);
               return;
            case 17 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 18 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 8);
               stmt.setVarchar(4, (String)parms[3], 2);
               stmt.setVarchar(5, (String)parms[4], 3);
               stmt.setVarchar(6, (String)parms[5], 9);
               return;
            case 19 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 20 :
               stmt.setVarchar(1, (String)parms[0], 9);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 2);
               stmt.setVarchar(4, (String)parms[3], 3);
               return;
      }
   }

}

