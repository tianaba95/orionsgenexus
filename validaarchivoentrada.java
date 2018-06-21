/*
               File: ValidaArchivoEntrada
        Description: Valida Archivo Entrada
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:32.63
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class validaarchivoentrada extends GXProcedure
{
   public validaarchivoentrada( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( validaarchivoentrada.class ), "" );
   }

   public validaarchivoentrada( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public short executeUdp( String aP0 ,
                            long aP1 ,
                            String aP2 ,
                            long aP3 ,
                            String aP4 ,
                            String[] aP5 ,
                            short[] aP6 ,
                            short[] aP7 )
   {
      validaarchivoentrada.this.AV10Archivo = aP0;
      validaarchivoentrada.this.AV43Tran_id = aP1;
      validaarchivoentrada.this.AV41Tipo_Bien = aP2;
      validaarchivoentrada.this.AV42Tran_CodTipoElemento = aP3;
      validaarchivoentrada.this.AV44Tran_TipoEntra = aP4;
      validaarchivoentrada.this.aP5 = aP5;
      validaarchivoentrada.this.aP6 = aP6;
      validaarchivoentrada.this.aP7 = aP7;
      validaarchivoentrada.this.aP8 = aP8;
      validaarchivoentrada.this.aP8 = new short[] {0};
      initialize();
      privateExecute();
      return aP8[0];
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        String aP2 ,
                        long aP3 ,
                        String aP4 ,
                        String[] aP5 ,
                        short[] aP6 ,
                        short[] aP7 ,
                        short[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             String aP2 ,
                             long aP3 ,
                             String aP4 ,
                             String[] aP5 ,
                             short[] aP6 ,
                             short[] aP7 ,
                             short[] aP8 )
   {
      validaarchivoentrada.this.AV10Archivo = aP0;
      validaarchivoentrada.this.AV43Tran_id = aP1;
      validaarchivoentrada.this.AV41Tipo_Bien = aP2;
      validaarchivoentrada.this.AV42Tran_CodTipoElemento = aP3;
      validaarchivoentrada.this.AV44Tran_TipoEntra = aP4;
      validaarchivoentrada.this.aP5 = aP5;
      validaarchivoentrada.this.aP6 = aP6;
      validaarchivoentrada.this.aP7 = aP7;
      validaarchivoentrada.this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21ExcelDocument.Open(AV10Archivo);
      if ( AV21ExcelDocument.getErrCode() != 0 )
      {
         AV28Mensaje = AV21ExcelDocument.getErrDescription() + "*" ;
      }
      else
      {
         AV39Row = (short)(2) ;
         AV17CuentaCargados = (short)(0) ;
         AV18CuentaFallos = (short)(0) ;
         AV32MessageCount = (short)(0) ;
         while ( ! (GXutil.strcmp("", GXutil.trim( AV21ExcelDocument.Cells(AV39Row, 1, 1, 1).getText()))==0) || ! (GXutil.strcmp("", GXutil.trim( AV21ExcelDocument.Cells(AV39Row, 4, 1, 1).getText()))==0) )
         {
            if ( GXutil.strcmp(AV41Tipo_Bien, "D") == 0 )
            {
               AV27MasCargueEntrada.setgxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion( AV43Tran_id );
               AV27MasCargueEntrada.setgxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas( AV39Row );
               AV27MasCargueEntrada.setgxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada( 1 );
               AV27MasCargueEntrada.setgxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada( AV21ExcelDocument.Cells(AV39Row, 1, 1, 1).getText() );
               AV27MasCargueEntrada.setgxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi( (short)(AV21ExcelDocument.Cells(AV39Row, 2, 1, 1).getNumber()) );
               AV27MasCargueEntrada.setgxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada( AV21ExcelDocument.Cells(AV39Row, 3, 1, 1).getText() );
               AV27MasCargueEntrada.setgxTv_SdtMAS_CARGUE_ENTRADA_Marca( AV21ExcelDocument.Cells(AV39Row, 4, 1, 1).getText() );
               AV27MasCargueEntrada.setgxTv_SdtMAS_CARGUE_ENTRADA_Modelo( AV21ExcelDocument.Cells(AV39Row, 5, 1, 1).getText() );
               AV27MasCargueEntrada.setgxTv_SdtMAS_CARGUE_ENTRADA_Serial( AV21ExcelDocument.Cells(AV39Row, 6, 1, 1).getText() );
               AV27MasCargueEntrada.setgxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion( DecimalUtil.doubleToDec(AV21ExcelDocument.Cells(AV39Row, 7, 1, 1).getNumber()) );
               AV27MasCargueEntrada.setgxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos( DecimalUtil.doubleToDec(AV21ExcelDocument.Cells(AV39Row, 8, 1, 1).getNumber()) );
               AV27MasCargueEntrada.setgxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo( DecimalUtil.doubleToDec(AV21ExcelDocument.Cells(AV39Row, 9, 1, 1).getNumber()) );
               AV27MasCargueEntrada.setgxTv_SdtMAS_CARGUE_ENTRADA_Interes( DecimalUtil.doubleToDec(AV21ExcelDocument.Cells(AV39Row, 10, 1, 1).getNumber()) );
               AV27MasCargueEntrada.setgxTv_SdtMAS_CARGUE_ENTRADA_Tiempo( (short)(AV21ExcelDocument.Cells(AV39Row, 11, 1, 1).getNumber()) );
               AV27MasCargueEntrada.setgxTv_SdtMAS_CARGUE_ENTRADA_Vidautil( (short)(AV21ExcelDocument.Cells(AV39Row, 12, 1, 1).getNumber()) );
            }
            if ( GXutil.strcmp(AV41Tipo_Bien, "C") == 0 )
            {
               AV27MasCargueEntrada.setgxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion( AV43Tran_id );
               AV27MasCargueEntrada.setgxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas( AV39Row );
               AV27MasCargueEntrada.setgxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada( AV21ExcelDocument.Cells(AV39Row, 1, 1, 1).getText() );
               AV27MasCargueEntrada.setgxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada( AV21ExcelDocument.Cells(AV39Row, 2, 1, 1).getText() );
               AV27MasCargueEntrada.setgxTv_SdtMAS_CARGUE_ENTRADA_Marca( AV21ExcelDocument.Cells(AV39Row, 3, 1, 1).getText() );
               AV27MasCargueEntrada.setgxTv_SdtMAS_CARGUE_ENTRADA_Modelo( AV21ExcelDocument.Cells(AV39Row, 4, 1, 1).getText() );
               AV27MasCargueEntrada.setgxTv_SdtMAS_CARGUE_ENTRADA_Serial( AV21ExcelDocument.Cells(AV39Row, 5, 1, 1).getText() );
               AV27MasCargueEntrada.setgxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada( (int)(AV21ExcelDocument.Cells(AV39Row, 6, 1, 1).getNumber()) );
               AV27MasCargueEntrada.setgxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion( DecimalUtil.doubleToDec(AV21ExcelDocument.Cells(AV39Row, 7, 1, 1).getNumber()) );
               AV27MasCargueEntrada.setgxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos( DecimalUtil.doubleToDec(AV21ExcelDocument.Cells(AV39Row, 8, 1, 1).getNumber()) );
            }
            AV27MasCargueEntrada.Save();
            if ( AV27MasCargueEntrada.Fail() )
            {
               AV18CuentaFallos = (short)(AV18CuentaFallos+1) ;
               AV75GXV2 = 1 ;
               AV74GXV1 = AV27MasCargueEntrada.GetMessages() ;
               while ( AV75GXV2 <= AV74GXV1.size() )
               {
                  AV31Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV74GXV1.elementAt(-1+AV75GXV2));
                  /* Execute user subroutine: 'MENSAJE ERROR' */
                  S211 ();
                  if ( returnInSub )
                  {
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
                  AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Fila( AV39Row );
                  AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Columna( AV35NumeroColumna );
                  AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Inconsistencia( AV33MessageDescrip );
                  AV29Mensajes.add(AV30MensajesItem, 0);
                  AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
                  AV75GXV2 = (int)(AV75GXV2+1) ;
               }
               AV40Session1.setValue("SDTErrores", AV29Mensajes.toxml(false, true, "Mensajes", "ACBSENA"));
               AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
               AV32MessageCount = (short)(AV32MessageCount+(AV27MasCargueEntrada.GetMessages().size())) ;
            }
            else
            {
               AV17CuentaCargados = (short)(AV17CuentaCargados+1) ;
            }
            Application.commit(context, remoteHandle, "DEFAULT",pr_default, "validaarchivoentrada");
            AV39Row = (short)(AV39Row+1) ;
         }
         AV28Mensaje = AV28Mensaje + "RESULTADOS DEL PROCESO DE CARGUE" + GXutil.newLine( ) + "- Total de registros Correctos    :	" + GXutil.trim( GXutil.str( AV17CuentaCargados, 4, 0)) + GXutil.newLine( ) + "- Total de errores    :	" + GXutil.trim( GXutil.str( AV18CuentaFallos, 4, 0)) ;
      }
      AV21ExcelDocument.Close();
      if ( AV18CuentaFallos == 0 )
      {
         /* Execute user subroutine: 'VALOR BIENES' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV18CuentaFallos == 0 )
         {
            /* Execute user subroutine: 'TIPO ELEMENTO' */
            S151 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( AV18CuentaFallos == 0 )
            {
               /* Execute user subroutine: 'VALIDA INDICADOR' */
               S221 ();
               if ( returnInSub )
               {
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( AV18CuentaFallos == 0 )
               {
                  AV21ExcelDocument.Open(AV10Archivo);
                  if ( AV21ExcelDocument.getErrCode() != 0 )
                  {
                     AV28Mensaje = AV21ExcelDocument.getErrDescription() ;
                  }
                  else
                  {
                     /* Using cursor P001J2 */
                     pr_default.execute(0, new Object[] {new Long(AV43Tran_id)});
                     while ( (pr_default.getStatus(0) != 101) )
                     {
                        A83NROTRANSACCION = P001J2_A83NROTRANSACCION[0] ;
                        A537CONSECUTIVOENTRADA = P001J2_A537CONSECUTIVOENTRADA[0] ;
                        n537CONSECUTIVOENTRADA = P001J2_n537CONSECUTIVOENTRADA[0] ;
                        A84IDCARMAS = P001J2_A84IDCARMAS[0] ;
                        AV8IDCARMAS = A84IDCARMAS ;
                        AV13Cols = (short)(1) ;
                        while ( ! (GXutil.strcmp("", GXutil.trim( AV21ExcelDocument.Cells(1, AV13Cols, 1, 1).getText()))==0) )
                        {
                           AV11ATRIBUTO = AV21ExcelDocument.Cells(1, AV13Cols, 1, 1).getText() ;
                           AV45VALORATRIBUTO = AV21ExcelDocument.Cells(AV8IDCARMAS, AV13Cols, 1, 1).getText() ;
                           AV20Elem_Consecutivo = GXutil.trim( A537CONSECUTIVOENTRADA) ;
                           /* Execute user subroutine: 'BUSCAR ATRIBUTO PARAMETRIZADO' */
                           S171 ();
                           if ( returnInSub )
                           {
                              pr_default.close(0);
                              returnInSub = true;
                              cleanup();
                              if (true) return;
                           }
                           AV13Cols = (short)(AV13Cols+1) ;
                        }
                        pr_default.readNext(0);
                     }
                     pr_default.close(0);
                  }
                  AV21ExcelDocument.Close();
                  /* Using cursor P001J3 */
                  pr_default.execute(1, new Object[] {new Long(AV43Tran_id)});
                  while ( (pr_default.getStatus(1) != 101) )
                  {
                     A83NROTRANSACCION = P001J3_A83NROTRANSACCION[0] ;
                     A537CONSECUTIVOENTRADA = P001J3_A537CONSECUTIVOENTRADA[0] ;
                     n537CONSECUTIVOENTRADA = P001J3_n537CONSECUTIVOENTRADA[0] ;
                     A84IDCARMAS = P001J3_A84IDCARMAS[0] ;
                     AV8IDCARMAS = A84IDCARMAS ;
                     AV20Elem_Consecutivo = GXutil.trim( A537CONSECUTIVOENTRADA) ;
                     /* Execute user subroutine: 'BUSCO ATRIBUTOS ELEMENTO' */
                     S191 ();
                     if ( returnInSub )
                     {
                        pr_default.close(1);
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                     pr_default.readNext(1);
                  }
                  pr_default.close(1);
               }
            }
         }
      }
      if ( AV18CuentaFallos >= 1 )
      {
         /* Optimized DELETE. */
         /* Using cursor P001J4 */
         pr_default.execute(2, new Object[] {new Long(AV43Tran_id)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("MAS_CARGUE_ENTRADA") ;
         /* End optimized DELETE. */
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'VALOR BIENES' Routine */
      AV9pTpmo_Codigo = "" ;
      /* Using cursor P001J5 */
      pr_default.execute(3, new Object[] {new Long(AV43Tran_id)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A46Tran_Id = P001J5_A46Tran_Id[0] ;
         A49Tran_CodigoMovimiento = P001J5_A49Tran_CodigoMovimiento[0] ;
         A482Tran_TipoElemento = P001J5_A482Tran_TipoElemento[0] ;
         AV9pTpmo_Codigo = A49Tran_CodigoMovimiento ;
         AV48cTran_TipoElemento = A482Tran_TipoElemento ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      AV20Elem_Consecutivo = "" ;
      /* Using cursor P001J6 */
      pr_default.execute(4, new Object[] {new Long(AV43Tran_id)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A83NROTRANSACCION = P001J6_A83NROTRANSACCION[0] ;
         A537CONSECUTIVOENTRADA = P001J6_A537CONSECUTIVOENTRADA[0] ;
         n537CONSECUTIVOENTRADA = P001J6_n537CONSECUTIVOENTRADA[0] ;
         A601CANTIDADENTRADA = P001J6_A601CANTIDADENTRADA[0] ;
         n601CANTIDADENTRADA = P001J6_n601CANTIDADENTRADA[0] ;
         A538COSTOADQUISICION = P001J6_A538COSTOADQUISICION[0] ;
         n538COSTOADQUISICION = P001J6_n538COSTOADQUISICION[0] ;
         A644OTROSCOSTOS = P001J6_A644OTROSCOSTOS[0] ;
         A645VALORFUTURO = P001J6_A645VALORFUTURO[0] ;
         A647TIEMPO = P001J6_A647TIEMPO[0] ;
         A646INTERES = P001J6_A646INTERES[0] ;
         A648VIDAUTIL = P001J6_A648VIDAUTIL[0] ;
         A605MARCA = P001J6_A605MARCA[0] ;
         A607MODELO = P001J6_A607MODELO[0] ;
         A606SERIAL = P001J6_A606SERIAL[0] ;
         A686INDICADORPHI = P001J6_A686INDICADORPHI[0] ;
         A540DESCRIPCIONENTRADA = P001J6_A540DESCRIPCIONENTRADA[0] ;
         n540DESCRIPCIONENTRADA = P001J6_n540DESCRIPCIONENTRADA[0] ;
         A84IDCARMAS = P001J6_A84IDCARMAS[0] ;
         AV8IDCARMAS = A84IDCARMAS ;
         AV20Elem_Consecutivo = GXutil.trim( A537CONSECUTIVOENTRADA) ;
         AV61rCANTIDADENTRADA = A601CANTIDADENTRADA ;
         AV57rCOSTOADQUISICION = A538COSTOADQUISICION ;
         AV56rOTROSCOSTOS = A644OTROSCOSTOS ;
         AV53rVALORFUTURO = A645VALORFUTURO ;
         AV60rTIEMPO = A647TIEMPO ;
         AV62INTERES = A646INTERES ;
         AV50rVIDAUTIL = A648VIDAUTIL ;
         AV38pValorBien = A538COSTOADQUISICION.add(A644OTROSCOSTOS) ;
         AV68pMARCA = A605MARCA ;
         AV69pMODELO = A607MODELO ;
         AV70pSERIAL = A606SERIAL ;
         AV46INDICADORPHI = A686INDICADORPHI ;
         AV71rDESCRIPCIONENTRADA = A540DESCRIPCIONENTRADA ;
         /* Execute user subroutine: 'VALIDAVALORES' */
         S126 ();
         if ( returnInSub )
         {
            pr_default.close(4);
            returnInSub = true;
            if (true) return;
         }
         if ( GXutil.strcmp(AV48cTran_TipoElemento, "D") == 0 )
         {
            /* Execute user subroutine: 'VALIDA BIEN' */
            S136 ();
            if ( returnInSub )
            {
               pr_default.close(4);
               returnInSub = true;
               if (true) return;
            }
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S126( )
   {
      /* 'VALIDAVALORES' Routine */
      if ( (GXutil.strcmp("", GXutil.trim( AV71rDESCRIPCIONENTRADA))==0) )
      {
         if ( GXutil.strcmp(AV48cTran_TipoElemento, "C") == 0 )
         {
            AV63Columna = (short)(2) ;
         }
         else
         {
            AV63Columna = (short)(3) ;
         }
         AV64Inconsistencia = "El valor de OBSERVACIONES es obligatorio" ;
         /* Execute user subroutine: 'CARGARERRORES' */
         S141 ();
         if (returnInSub) return;
      }
      if ( (GXutil.strcmp("", GXutil.trim( AV68pMARCA))==0) )
      {
         if ( GXutil.strcmp(AV48cTran_TipoElemento, "C") == 0 )
         {
            AV63Columna = (short)(3) ;
         }
         else
         {
            AV63Columna = (short)(4) ;
         }
         AV64Inconsistencia = "El valor de MARCA es obligatorio" ;
         /* Execute user subroutine: 'CARGARERRORES' */
         S141 ();
         if (returnInSub) return;
      }
      if ( (GXutil.strcmp("", GXutil.trim( AV69pMODELO))==0) )
      {
         if ( GXutil.strcmp(AV48cTran_TipoElemento, "C") == 0 )
         {
            AV63Columna = (short)(4) ;
         }
         else
         {
            AV63Columna = (short)(5) ;
         }
         AV64Inconsistencia = "El valor de MODELO es obligatorio" ;
         /* Execute user subroutine: 'CARGARERRORES' */
         S141 ();
         if (returnInSub) return;
      }
      if ( (GXutil.strcmp("", GXutil.trim( AV70pSERIAL))==0) )
      {
         if ( GXutil.strcmp(AV48cTran_TipoElemento, "C") == 0 )
         {
            AV63Columna = (short)(5) ;
         }
         else
         {
            AV63Columna = (short)(6) ;
         }
         AV64Inconsistencia = "El valor de SERIAL es obligatorio" ;
         /* Execute user subroutine: 'CARGARERRORES' */
         S141 ();
         if (returnInSub) return;
      }
      if ( GXutil.strcmp(AV48cTran_TipoElemento, "C") == 0 )
      {
         if ( AV61rCANTIDADENTRADA <= 0 )
         {
            AV63Columna = (short)(6) ;
            AV64Inconsistencia = "El valor de CANTIDAD es menor o igual a cero (0)" ;
            /* Execute user subroutine: 'CARGARERRORES' */
            S141 ();
            if (returnInSub) return;
         }
      }
      if ( AV57rCOSTOADQUISICION.doubleValue() <= 0 )
      {
         AV63Columna = (short)(7) ;
         AV64Inconsistencia = "El valor de COSTO ADQUISICION es menor o igual a cero (0)" ;
         /* Execute user subroutine: 'CARGARERRORES' */
         S141 ();
         if (returnInSub) return;
      }
      if ( AV56rOTROSCOSTOS.doubleValue() < 0 )
      {
         AV63Columna = (short)(8) ;
         AV64Inconsistencia = "El valor de OTROS COSTOS es menor a cero (0)" ;
         /* Execute user subroutine: 'CARGARERRORES' */
         S141 ();
         if (returnInSub) return;
      }
      if ( AV53rVALORFUTURO.doubleValue() < 0 )
      {
         AV63Columna = (short)(9) ;
         AV64Inconsistencia = "El valor de VALOR FUTURO es menor o igual a cero (0)" ;
         /* Execute user subroutine: 'CARGARERRORES' */
         S141 ();
         if (returnInSub) return;
      }
      if ( AV60rTIEMPO < 0 )
      {
         AV63Columna = (short)(10) ;
         AV64Inconsistencia = "El valor de TIEMPO es menor o igual a cero (0)" ;
         /* Execute user subroutine: 'CARGARERRORES' */
         S141 ();
         if (returnInSub) return;
      }
      if ( ( AV62INTERES.doubleValue() < 0 ) || ( AV62INTERES.doubleValue() > 100 ) )
      {
         AV63Columna = (short)(11) ;
         AV64Inconsistencia = "El valor de INTERES no cumple con el rango 1 - 100" ;
         /* Execute user subroutine: 'CARGARERRORES' */
         S141 ();
         if (returnInSub) return;
      }
      if ( AV50rVIDAUTIL < 0 )
      {
         AV63Columna = (short)(12) ;
         AV64Inconsistencia = "El valor de VIDA UTIL es menor o igual a cero (0)" ;
         /* Execute user subroutine: 'CARGARERRORES' */
         S141 ();
         if (returnInSub) return;
      }
   }

   public void S141( )
   {
      /* 'CARGARERRORES' Routine */
      AV18CuentaFallos = (short)(AV18CuentaFallos+1) ;
      AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
      AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Fila( AV8IDCARMAS );
      AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Columna( AV63Columna );
      AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Inconsistencia( AV64Inconsistencia );
      AV29Mensajes.add(AV30MensajesItem, 0);
      AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
      AV40Session1.setValue("SDTErrores", AV29Mensajes.toxml(false, true, "Mensajes", "ACBSENA"));
      AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
      AV28Mensaje = "RESULTADOS DEL PROCESO DE CARGUE" + GXutil.newLine( ) + "- Total de errores    :	" + GXutil.trim( GXutil.str( AV18CuentaFallos, 4, 0)) ;
   }

   public void S136( )
   {
      /* 'VALIDA BIEN' Routine */
      GXv_boolean1[0] = AV36pRespuesta ;
      new com.orions2.pcal_bien_adm(remoteHandle, context).execute( AV9pTpmo_Codigo, AV38pValorBien, GXv_boolean1) ;
      validaarchivoentrada.this.AV36pRespuesta = GXv_boolean1[0] ;
      if ( ! AV36pRespuesta && ( AV46INDICADORPHI == 0 ) )
      {
         AV18CuentaFallos = (short)(AV18CuentaFallos+1) ;
         AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
         AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Fila( AV8IDCARMAS );
         AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Columna( (short)(7) );
         AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Inconsistencia( "El valor de adquisición del bien es menor que el permitido" );
         AV29Mensajes.add(AV30MensajesItem, 0);
         AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
         AV40Session1.setValue("SDTErrores", AV29Mensajes.toxml(false, true, "Mensajes", "ACBSENA"));
         AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
         AV28Mensaje = "RESULTADOS DEL PROCESO DE CARGUE" + GXutil.newLine( ) + "- Total de errores    :	" + GXutil.trim( GXutil.str( AV18CuentaFallos, 4, 0)) ;
      }
      if ( ! AV36pRespuesta && ( AV46INDICADORPHI == 1 ) )
      {
         AV18CuentaFallos = (short)(AV18CuentaFallos+1) ;
         AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
         AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Fila( AV8IDCARMAS );
         AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Columna( (short)(7) );
         AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Inconsistencia( "El valor de adquisición del bien es menor que el permitido" );
         AV29Mensajes.add(AV30MensajesItem, 0);
         AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
         AV40Session1.setValue("SDTErrores", AV29Mensajes.toxml(false, true, "Mensajes", "ACBSENA"));
         AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
         AV28Mensaje = "RESULTADOS DEL PROCESO DE CARGUE" + GXutil.newLine( ) + "- Total de errores    :	" + GXutil.trim( GXutil.str( AV18CuentaFallos, 4, 0)) ;
      }
   }

   public void S151( )
   {
      /* 'TIPO ELEMENTO' Routine */
      AV20Elem_Consecutivo = "" ;
      /* Using cursor P001J7 */
      pr_default.execute(5, new Object[] {new Long(AV43Tran_id)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A83NROTRANSACCION = P001J7_A83NROTRANSACCION[0] ;
         A537CONSECUTIVOENTRADA = P001J7_A537CONSECUTIVOENTRADA[0] ;
         n537CONSECUTIVOENTRADA = P001J7_n537CONSECUTIVOENTRADA[0] ;
         A84IDCARMAS = P001J7_A84IDCARMAS[0] ;
         AV8IDCARMAS = A84IDCARMAS ;
         AV20Elem_Consecutivo = GXutil.trim( A537CONSECUTIVOENTRADA) ;
         /* Execute user subroutine: 'VALIDA TIPO CODIGO' */
         S167 ();
         if ( returnInSub )
         {
            pr_default.close(5);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void S167( )
   {
      /* 'VALIDA TIPO CODIGO' Routine */
      /* Using cursor P001J8 */
      pr_default.execute(6, new Object[] {AV20Elem_Consecutivo});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A66Elem_Consecutivo = P001J8_A66Elem_Consecutivo[0] ;
         A33Tipo_Codigo = P001J8_A33Tipo_Codigo[0] ;
         if ( A33Tipo_Codigo != AV42Tran_CodTipoElemento )
         {
            AV18CuentaFallos = (short)(AV18CuentaFallos+1) ;
            AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
            AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Fila( AV8IDCARMAS );
            AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Columna( (short)(1) );
            AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Inconsistencia( "El tipo de elemento no tiene relación con el tipo de transacción" );
            AV29Mensajes.add(AV30MensajesItem, 0);
            AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
            AV40Session1.setValue("SDTErrores", AV29Mensajes.toxml(false, true, "Mensajes", "ACBSENA"));
            AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
            AV28Mensaje = "RESULTADOS DEL PROCESO DE CARGUE" + GXutil.newLine( ) + "- Total de errores    :	" + GXutil.trim( GXutil.str( AV18CuentaFallos, 4, 0)) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   public void S171( )
   {
      /* 'BUSCAR ATRIBUTO PARAMETRIZADO' Routine */
      /* Using cursor P001J9 */
      pr_default.execute(7, new Object[] {AV11ATRIBUTO});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A393List_Descripcion = P001J9_A393List_Descripcion[0] ;
         A36List_Id = P001J9_A36List_Id[0] ;
         AV26List_Id = A36List_Id ;
         /* Execute user subroutine: 'ATRIBUTOS' */
         S189 ();
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

   public void S189( )
   {
      /* 'ATRIBUTOS' Routine */
      /* Using cursor P001J10 */
      pr_default.execute(8, new Object[] {AV20Elem_Consecutivo});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A37Cata_Codigo = P001J10_A37Cata_Codigo[0] ;
         A66Elem_Consecutivo = P001J10_A66Elem_Consecutivo[0] ;
         A34Clas_Codigo = P001J10_A34Clas_Codigo[0] ;
         A34Clas_Codigo = P001J10_A34Clas_Codigo[0] ;
         AV12Clas_Codigo = GXutil.trim( A34Clas_Codigo) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
      /* Using cursor P001J11 */
      pr_default.execute(9, new Object[] {AV12Clas_Codigo, new Long(AV26List_Id)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A36List_Id = P001J11_A36List_Id[0] ;
         A34Clas_Codigo = P001J11_A34Clas_Codigo[0] ;
         /*
            INSERT RECORD ON TABLE MAS_CARGUE_ATRIBUTOS

         */
         A80NUMEROTRN = AV43Tran_id ;
         A81ID_ENTRADA = AV8IDCARMAS ;
         A82IDATRIBUTO = AV13Cols ;
         A541TIPOATRIBUTO = "O" ;
         n541TIPOATRIBUTO = false ;
         A535ATRIBUTO = AV11ATRIBUTO ;
         n535ATRIBUTO = false ;
         A536VALORATRIBUTO = AV45VALORATRIBUTO ;
         n536VALORATRIBUTO = false ;
         /* Using cursor P001J12 */
         pr_default.execute(10, new Object[] {new Long(A80NUMEROTRN), new Short(A81ID_ENTRADA), new Short(A82IDATRIBUTO), new Boolean(n541TIPOATRIBUTO), A541TIPOATRIBUTO, new Boolean(n535ATRIBUTO), A535ATRIBUTO, new Boolean(n536VALORATRIBUTO), A536VALORATRIBUTO});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("MAS_CARGUE_ATRIBUTOS") ;
         if ( (pr_default.getStatus(10) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "validaarchivoentrada");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   public void S191( )
   {
      /* 'BUSCO ATRIBUTOS ELEMENTO' Routine */
      /* Using cursor P001J13 */
      pr_default.execute(11, new Object[] {AV20Elem_Consecutivo});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A37Cata_Codigo = P001J13_A37Cata_Codigo[0] ;
         A66Elem_Consecutivo = P001J13_A66Elem_Consecutivo[0] ;
         A34Clas_Codigo = P001J13_A34Clas_Codigo[0] ;
         A34Clas_Codigo = P001J13_A34Clas_Codigo[0] ;
         AV12Clas_Codigo = GXutil.trim( A34Clas_Codigo) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
      /* Using cursor P001J14 */
      pr_default.execute(12, new Object[] {AV12Clas_Codigo});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A555Clas_AtributoObligatorio = P001J14_A555Clas_AtributoObligatorio[0] ;
         A34Clas_Codigo = P001J14_A34Clas_Codigo[0] ;
         A36List_Id = P001J14_A36List_Id[0] ;
         A393List_Descripcion = P001J14_A393List_Descripcion[0] ;
         A393List_Descripcion = P001J14_A393List_Descripcion[0] ;
         AV26List_Id = A36List_Id ;
         AV25List_Descripcion = GXutil.trim( A393List_Descripcion) ;
         /* Execute user subroutine: 'ERROR DE ATRIBUTO' */
         S2014 ();
         if ( returnInSub )
         {
            pr_default.close(12);
            pr_default.close(12);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(12);
      }
      pr_default.close(12);
   }

   public void S2014( )
   {
      /* 'ERROR DE ATRIBUTO' Routine */
      AV88GXLvl383 = (byte)(0) ;
      /* Using cursor P001J15 */
      pr_default.execute(13, new Object[] {AV25List_Descripcion});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A535ATRIBUTO = P001J15_A535ATRIBUTO[0] ;
         n535ATRIBUTO = P001J15_n535ATRIBUTO[0] ;
         A80NUMEROTRN = P001J15_A80NUMEROTRN[0] ;
         A81ID_ENTRADA = P001J15_A81ID_ENTRADA[0] ;
         A82IDATRIBUTO = P001J15_A82IDATRIBUTO[0] ;
         AV88GXLvl383 = (byte)(1) ;
         pr_default.readNext(13);
      }
      pr_default.close(13);
      if ( AV88GXLvl383 == 0 )
      {
         AV18CuentaFallos = (short)(AV18CuentaFallos+1) ;
         AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
         AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Fila( A81ID_ENTRADA );
         AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Columna( A82IDATRIBUTO );
         AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Inconsistencia( "No se encontro el Atributo : "+AV25List_Descripcion );
         AV29Mensajes.add(AV30MensajesItem, 0);
         AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
         AV40Session1.setValue("SDTErrores", AV29Mensajes.toxml(false, true, "Mensajes", "ACBSENA"));
         AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
         AV28Mensaje = "RESULTADOS DEL PROCESO DE CARGUE" + GXutil.newLine( ) + "- Total de errores    :	" + GXutil.trim( GXutil.str( AV18CuentaFallos, 4, 0)) + GXutil.str( AV24J, 10, 0) ;
      }
   }

   public void S211( )
   {
      /* 'MENSAJE ERROR' Routine */
      if ( GXutil.strcmp(AV31Message.getgxTv_SdtMessages_Message_Id(), "OutOfRange") == 0 )
      {
         AV35NumeroColumna = (short)(GXutil.lval( GXutil.substring( AV31Message.getgxTv_SdtMessages_Message_Description(), 2, 3))) ;
         AV15ColumnaExcel2 = GXutil.trim( AV21ExcelDocument.Cells(1, AV35NumeroColumna, 1, 1).getText()) ;
         AV33MessageDescrip = GXutil.substring( AV31Message.getgxTv_SdtMessages_Message_Description(), 5, 100) ;
      }
      else
      {
         AV34NombreColumna = GXutil.trim( AV31Message.getgxTv_SdtMessages_Message_Id()) ;
         AV35NumeroColumna = (short)(GXutil.lval( GXutil.substring( AV34NombreColumna, 2, 3))) ;
         AV14ColumnaExcel = GXutil.trim( AV21ExcelDocument.Cells(1, AV35NumeroColumna, 1, 1).getText()) ;
         AV33MessageDescrip = AV31Message.getgxTv_SdtMessages_Message_Description() ;
      }
   }

   public void S221( )
   {
      /* 'VALIDA INDICADOR' Routine */
      if ( GXutil.strcmp(AV44Tran_TipoEntra, "ELSP") == 0 )
      {
         /* Using cursor P001J16 */
         pr_default.execute(14, new Object[] {new Long(AV43Tran_id)});
         while ( (pr_default.getStatus(14) != 101) )
         {
            A83NROTRANSACCION = P001J16_A83NROTRANSACCION[0] ;
            A686INDICADORPHI = P001J16_A686INDICADORPHI[0] ;
            A84IDCARMAS = P001J16_A84IDCARMAS[0] ;
            AV8IDCARMAS = A84IDCARMAS ;
            if ( A686INDICADORPHI != 0 )
            {
               AV18CuentaFallos = (short)(AV18CuentaFallos+1) ;
               AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
               AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Fila( AV8IDCARMAS );
               AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Columna( (short)(2) );
               AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Inconsistencia( "Indicador de entrada para elemento no válido" );
               AV29Mensajes.add(AV30MensajesItem, 0);
               AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
               AV40Session1.setValue("SDTErrores", AV29Mensajes.toxml(false, true, "Mensajes", "ACBSENA"));
               AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
               AV28Mensaje = "RESULTADOS DEL PROCESO DE CARGUE" + GXutil.newLine( ) + "- Total de errores    :	" + GXutil.trim( GXutil.str( AV18CuentaFallos, 4, 0)) + GXutil.str( AV24J, 10, 0) ;
            }
            pr_default.readNext(14);
         }
         pr_default.close(14);
      }
      if ( GXutil.strcmp(AV44Tran_TipoEntra, "NEUP") == 0 )
      {
         AV23IndicadorPadre = (short)(0) ;
         /* Using cursor P001J17 */
         pr_default.execute(15, new Object[] {new Long(AV43Tran_id)});
         while ( (pr_default.getStatus(15) != 101) )
         {
            A83NROTRANSACCION = P001J17_A83NROTRANSACCION[0] ;
            A686INDICADORPHI = P001J17_A686INDICADORPHI[0] ;
            A84IDCARMAS = P001J17_A84IDCARMAS[0] ;
            AV8IDCARMAS = A84IDCARMAS ;
            if ( A686INDICADORPHI == 1 )
            {
               AV23IndicadorPadre = (short)(AV23IndicadorPadre+1) ;
            }
            if ( ( A686INDICADORPHI == 1 ) && ( A84IDCARMAS != 2 ) )
            {
               AV18CuentaFallos = (short)(AV18CuentaFallos+1) ;
               AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
               AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Fila( AV8IDCARMAS );
               AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Columna( (short)(2) );
               AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Inconsistencia( "Indicador de entrada del padre no es válido" );
               AV29Mensajes.add(AV30MensajesItem, 0);
               AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
               AV40Session1.setValue("SDTErrores", AV29Mensajes.toxml(false, true, "Mensajes", "ACBSENA"));
               AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
               AV28Mensaje = "RESULTADOS DEL PROCESO DE CARGUE" + GXutil.newLine( ) + "- Total de errores    :	" + GXutil.trim( GXutil.str( AV18CuentaFallos, 4, 0)) + GXutil.str( AV24J, 10, 0) ;
            }
            if ( ( A686INDICADORPHI <= 0 ) || ( A686INDICADORPHI > 2 ) )
            {
               AV18CuentaFallos = (short)(AV18CuentaFallos+1) ;
               AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
               AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Fila( AV8IDCARMAS );
               AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Columna( (short)(2) );
               AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Inconsistencia( "Indicador de entrada para elemento no válido" );
               AV29Mensajes.add(AV30MensajesItem, 0);
               AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
               AV40Session1.setValue("SDTErrores", AV29Mensajes.toxml(false, true, "Mensajes", "ACBSENA"));
               AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
               AV28Mensaje = "RESULTADOS DEL PROCESO DE CARGUE" + GXutil.newLine( ) + "- Total de errores    :	" + GXutil.trim( GXutil.str( AV18CuentaFallos, 4, 0)) + GXutil.str( AV24J, 10, 0) ;
            }
            pr_default.readNext(15);
         }
         pr_default.close(15);
         if ( AV18CuentaFallos == 0 )
         {
            if ( ( AV23IndicadorPadre == 0 ) || ( AV23IndicadorPadre > 1 ) )
            {
               AV18CuentaFallos = (short)(AV18CuentaFallos+1) ;
               AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
               AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Fila( (short)(2) );
               AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Columna( (short)(2) );
               AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Inconsistencia( "Indicador de entrada para el padre no existe o hay varios padres" );
               AV29Mensajes.add(AV30MensajesItem, 0);
               AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
               AV40Session1.setValue("SDTErrores", AV29Mensajes.toxml(false, true, "Mensajes", "ACBSENA"));
               AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
               AV28Mensaje = "RESULTADOS DEL PROCESO DE CARGUE" + GXutil.newLine( ) + "- Total de errores    :	" + GXutil.trim( GXutil.str( AV18CuentaFallos, 4, 0)) + GXutil.str( AV24J, 10, 0) ;
            }
         }
         if ( AV18CuentaFallos == 0 )
         {
            /* Using cursor P001J18 */
            pr_default.execute(16, new Object[] {new Long(AV43Tran_id)});
            while ( (pr_default.getStatus(16) != 101) )
            {
               brk1J18 = false ;
               A83NROTRANSACCION = P001J18_A83NROTRANSACCION[0] ;
               A537CONSECUTIVOENTRADA = P001J18_A537CONSECUTIVOENTRADA[0] ;
               n537CONSECUTIVOENTRADA = P001J18_n537CONSECUTIVOENTRADA[0] ;
               A84IDCARMAS = P001J18_A84IDCARMAS[0] ;
               AV19CuentaRepetidos = (short)(0) ;
               AV16CONSECUTIVOENTRADA = A537CONSECUTIVOENTRADA ;
               while ( (pr_default.getStatus(16) != 101) && ( P001J18_A83NROTRANSACCION[0] == A83NROTRANSACCION ) )
               {
                  brk1J18 = false ;
                  A537CONSECUTIVOENTRADA = P001J18_A537CONSECUTIVOENTRADA[0] ;
                  n537CONSECUTIVOENTRADA = P001J18_n537CONSECUTIVOENTRADA[0] ;
                  A84IDCARMAS = P001J18_A84IDCARMAS[0] ;
                  if ( GXutil.strcmp(AV16CONSECUTIVOENTRADA, A537CONSECUTIVOENTRADA) == 0 )
                  {
                     AV19CuentaRepetidos = (short)(AV19CuentaRepetidos+1) ;
                  }
                  brk1J18 = true ;
                  pr_default.readNext(16);
               }
               if ( AV19CuentaRepetidos > 1 )
               {
                  AV18CuentaFallos = (short)(AV18CuentaFallos+1) ;
                  AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
                  AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Fila( AV8IDCARMAS );
                  AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Columna( (short)(1) );
                  AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Inconsistencia( "Códigos de elementos padre repetidos" );
                  AV29Mensajes.add(AV30MensajesItem, 0);
                  AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
                  AV40Session1.setValue("SDTErrores", AV29Mensajes.toxml(false, true, "Mensajes", "ACBSENA"));
                  AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
                  AV28Mensaje = "RESULTADOS DEL PROCESO DE CARGUE" + GXutil.newLine( ) + "- Total de errores    :	" + GXutil.trim( GXutil.str( AV18CuentaFallos, 4, 0)) + GXutil.str( AV24J, 10, 0) ;
               }
               if ( ! brk1J18 )
               {
                  brk1J18 = true ;
                  pr_default.readNext(16);
               }
            }
            pr_default.close(16);
         }
      }
      if ( GXutil.strcmp(AV44Tran_TipoEntra, "UEUP") == 0 )
      {
         AV23IndicadorPadre = (short)(0) ;
         /* Using cursor P001J19 */
         pr_default.execute(17, new Object[] {new Long(AV43Tran_id)});
         while ( (pr_default.getStatus(17) != 101) )
         {
            A83NROTRANSACCION = P001J19_A83NROTRANSACCION[0] ;
            A686INDICADORPHI = P001J19_A686INDICADORPHI[0] ;
            A84IDCARMAS = P001J19_A84IDCARMAS[0] ;
            AV8IDCARMAS = A84IDCARMAS ;
            if ( A686INDICADORPHI == 1 )
            {
               AV23IndicadorPadre = (short)(AV23IndicadorPadre+1) ;
               /* Execute user subroutine: 'BUSCA HIJOS' */
               S2320 ();
               if ( returnInSub )
               {
                  pr_default.close(17);
                  returnInSub = true;
                  if (true) return;
               }
               if ( AV22IndicadorHijo == 0 )
               {
                  AV18CuentaFallos = (short)(AV18CuentaFallos+1) ;
                  AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
                  AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Fila( AV8IDCARMAS );
                  AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Columna( (short)(1) );
                  AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Inconsistencia( "El elemento padre no tiene hijos asociados" );
                  AV29Mensajes.add(AV30MensajesItem, 0);
                  AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
                  AV40Session1.setValue("SDTErrores", AV29Mensajes.toxml(false, true, "Mensajes", "ACBSENA"));
                  AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
                  AV28Mensaje = "RESULTADOS DEL PROCESO DE CARGUE" + GXutil.newLine( ) + "- Total de errores    :	" + GXutil.trim( GXutil.str( AV18CuentaFallos, 4, 0)) + GXutil.str( AV24J, 10, 0) ;
               }
            }
            pr_default.readNext(17);
         }
         pr_default.close(17);
         if ( AV23IndicadorPadre == 0 )
         {
            AV18CuentaFallos = (short)(AV18CuentaFallos+1) ;
            AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
            AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Fila( (short)(1) );
            AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Columna( (short)(2) );
            AV30MensajesItem.setgxTv_SdtMensajes_MensajesItem_Inconsistencia( "No hay elementos padres en el archivo" );
            AV29Mensajes.add(AV30MensajesItem, 0);
            AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
            AV40Session1.setValue("SDTErrores", AV29Mensajes.toxml(false, true, "Mensajes", "ACBSENA"));
            AV30MensajesItem = (com.orions2.SdtMensajes_MensajesItem)new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
            AV28Mensaje = "RESULTADOS DEL PROCESO DE CARGUE" + GXutil.newLine( ) + "- Total de errores    :	" + GXutil.trim( GXutil.str( AV18CuentaFallos, 4, 0)) + GXutil.str( AV24J, 10, 0) ;
         }
      }
   }

   public void S2320( )
   {
      /* 'BUSCA HIJOS' Routine */
      AV22IndicadorHijo = (short)(0) ;
      /* Optimized group. */
      /* Using cursor P001J20 */
      pr_default.execute(18, new Object[] {new Long(AV43Tran_id), new Short(AV8IDCARMAS)});
      cV22IndicadorHijo = P001J20_AV22IndicadorHijo[0] ;
      pr_default.close(18);
      AV22IndicadorHijo = (short)(AV22IndicadorHijo+cV22IndicadorHijo*1) ;
      /* End optimized group. */
   }

   protected void cleanup( )
   {
      this.aP5[0] = validaarchivoentrada.this.AV28Mensaje;
      this.aP6[0] = validaarchivoentrada.this.AV18CuentaFallos;
      this.aP7[0] = validaarchivoentrada.this.AV17CuentaCargados;
      this.aP8[0] = validaarchivoentrada.this.AV32MessageCount;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "validaarchivoentrada");
      CloseOpenCursors();
      AV21ExcelDocument.cleanup();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV28Mensaje = "" ;
      AV21ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV27MasCargueEntrada = new com.orions2.SdtMAS_CARGUE_ENTRADA(remoteHandle);
      AV74GXV1 = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Messages.Message", "GeneXus", remoteHandle);
      AV31Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV30MensajesItem = new com.orions2.SdtMensajes_MensajesItem(remoteHandle, context);
      AV33MessageDescrip = "" ;
      AV29Mensajes = new GXBaseCollection<com.orions2.SdtMensajes_MensajesItem>(com.orions2.SdtMensajes_MensajesItem.class, "Mensajes.MensajesItem", "ACBSENA", remoteHandle);
      AV40Session1 = httpContext.getWebSession();
      scmdbuf = "" ;
      P001J2_A83NROTRANSACCION = new long[1] ;
      P001J2_A537CONSECUTIVOENTRADA = new String[] {""} ;
      P001J2_n537CONSECUTIVOENTRADA = new boolean[] {false} ;
      P001J2_A84IDCARMAS = new short[1] ;
      A537CONSECUTIVOENTRADA = "" ;
      AV11ATRIBUTO = "" ;
      AV45VALORATRIBUTO = "" ;
      AV20Elem_Consecutivo = "" ;
      P001J3_A83NROTRANSACCION = new long[1] ;
      P001J3_A537CONSECUTIVOENTRADA = new String[] {""} ;
      P001J3_n537CONSECUTIVOENTRADA = new boolean[] {false} ;
      P001J3_A84IDCARMAS = new short[1] ;
      AV9pTpmo_Codigo = "" ;
      P001J5_A46Tran_Id = new long[1] ;
      P001J5_A49Tran_CodigoMovimiento = new String[] {""} ;
      P001J5_A482Tran_TipoElemento = new String[] {""} ;
      A49Tran_CodigoMovimiento = "" ;
      A482Tran_TipoElemento = "" ;
      AV48cTran_TipoElemento = "" ;
      P001J6_A83NROTRANSACCION = new long[1] ;
      P001J6_A537CONSECUTIVOENTRADA = new String[] {""} ;
      P001J6_n537CONSECUTIVOENTRADA = new boolean[] {false} ;
      P001J6_A601CANTIDADENTRADA = new int[1] ;
      P001J6_n601CANTIDADENTRADA = new boolean[] {false} ;
      P001J6_A538COSTOADQUISICION = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001J6_n538COSTOADQUISICION = new boolean[] {false} ;
      P001J6_A644OTROSCOSTOS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001J6_A645VALORFUTURO = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001J6_A647TIEMPO = new short[1] ;
      P001J6_A646INTERES = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001J6_A648VIDAUTIL = new short[1] ;
      P001J6_A605MARCA = new String[] {""} ;
      P001J6_A607MODELO = new String[] {""} ;
      P001J6_A606SERIAL = new String[] {""} ;
      P001J6_A686INDICADORPHI = new short[1] ;
      P001J6_A540DESCRIPCIONENTRADA = new String[] {""} ;
      P001J6_n540DESCRIPCIONENTRADA = new boolean[] {false} ;
      P001J6_A84IDCARMAS = new short[1] ;
      A538COSTOADQUISICION = DecimalUtil.ZERO ;
      A644OTROSCOSTOS = DecimalUtil.ZERO ;
      A645VALORFUTURO = DecimalUtil.ZERO ;
      A646INTERES = DecimalUtil.ZERO ;
      A605MARCA = "" ;
      A607MODELO = "" ;
      A606SERIAL = "" ;
      A540DESCRIPCIONENTRADA = "" ;
      AV57rCOSTOADQUISICION = DecimalUtil.ZERO ;
      AV56rOTROSCOSTOS = DecimalUtil.ZERO ;
      AV53rVALORFUTURO = DecimalUtil.ZERO ;
      AV62INTERES = DecimalUtil.ZERO ;
      AV38pValorBien = DecimalUtil.ZERO ;
      AV68pMARCA = "" ;
      AV69pMODELO = "" ;
      AV70pSERIAL = "" ;
      AV71rDESCRIPCIONENTRADA = "" ;
      AV64Inconsistencia = "" ;
      GXv_boolean1 = new boolean [1] ;
      P001J7_A83NROTRANSACCION = new long[1] ;
      P001J7_A537CONSECUTIVOENTRADA = new String[] {""} ;
      P001J7_n537CONSECUTIVOENTRADA = new boolean[] {false} ;
      P001J7_A84IDCARMAS = new short[1] ;
      P001J8_A66Elem_Consecutivo = new String[] {""} ;
      P001J8_A33Tipo_Codigo = new long[1] ;
      A66Elem_Consecutivo = "" ;
      P001J9_A393List_Descripcion = new String[] {""} ;
      P001J9_A36List_Id = new long[1] ;
      A393List_Descripcion = "" ;
      P001J10_A37Cata_Codigo = new String[] {""} ;
      P001J10_A66Elem_Consecutivo = new String[] {""} ;
      P001J10_A34Clas_Codigo = new String[] {""} ;
      A37Cata_Codigo = "" ;
      A34Clas_Codigo = "" ;
      AV12Clas_Codigo = "" ;
      P001J11_A36List_Id = new long[1] ;
      P001J11_A34Clas_Codigo = new String[] {""} ;
      A541TIPOATRIBUTO = "" ;
      A535ATRIBUTO = "" ;
      A536VALORATRIBUTO = "" ;
      Gx_emsg = "" ;
      P001J13_A37Cata_Codigo = new String[] {""} ;
      P001J13_A66Elem_Consecutivo = new String[] {""} ;
      P001J13_A34Clas_Codigo = new String[] {""} ;
      P001J14_A555Clas_AtributoObligatorio = new String[] {""} ;
      P001J14_A34Clas_Codigo = new String[] {""} ;
      P001J14_A36List_Id = new long[1] ;
      P001J14_A393List_Descripcion = new String[] {""} ;
      A555Clas_AtributoObligatorio = "" ;
      AV25List_Descripcion = "" ;
      P001J15_A535ATRIBUTO = new String[] {""} ;
      P001J15_n535ATRIBUTO = new boolean[] {false} ;
      P001J15_A80NUMEROTRN = new long[1] ;
      P001J15_A81ID_ENTRADA = new short[1] ;
      P001J15_A82IDATRIBUTO = new short[1] ;
      AV15ColumnaExcel2 = "" ;
      AV34NombreColumna = "" ;
      AV14ColumnaExcel = "" ;
      P001J16_A83NROTRANSACCION = new long[1] ;
      P001J16_A686INDICADORPHI = new short[1] ;
      P001J16_A84IDCARMAS = new short[1] ;
      P001J17_A83NROTRANSACCION = new long[1] ;
      P001J17_A686INDICADORPHI = new short[1] ;
      P001J17_A84IDCARMAS = new short[1] ;
      P001J18_A83NROTRANSACCION = new long[1] ;
      P001J18_A537CONSECUTIVOENTRADA = new String[] {""} ;
      P001J18_n537CONSECUTIVOENTRADA = new boolean[] {false} ;
      P001J18_A84IDCARMAS = new short[1] ;
      AV16CONSECUTIVOENTRADA = "" ;
      P001J19_A83NROTRANSACCION = new long[1] ;
      P001J19_A686INDICADORPHI = new short[1] ;
      P001J19_A84IDCARMAS = new short[1] ;
      P001J20_AV22IndicadorHijo = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.validaarchivoentrada__default(),
         new Object[] {
             new Object[] {
            P001J2_A83NROTRANSACCION, P001J2_A537CONSECUTIVOENTRADA, P001J2_n537CONSECUTIVOENTRADA, P001J2_A84IDCARMAS
            }
            , new Object[] {
            P001J3_A83NROTRANSACCION, P001J3_A537CONSECUTIVOENTRADA, P001J3_n537CONSECUTIVOENTRADA, P001J3_A84IDCARMAS
            }
            , new Object[] {
            }
            , new Object[] {
            P001J5_A46Tran_Id, P001J5_A49Tran_CodigoMovimiento, P001J5_A482Tran_TipoElemento
            }
            , new Object[] {
            P001J6_A83NROTRANSACCION, P001J6_A537CONSECUTIVOENTRADA, P001J6_n537CONSECUTIVOENTRADA, P001J6_A601CANTIDADENTRADA, P001J6_n601CANTIDADENTRADA, P001J6_A538COSTOADQUISICION, P001J6_n538COSTOADQUISICION, P001J6_A644OTROSCOSTOS, P001J6_A645VALORFUTURO, P001J6_A647TIEMPO,
            P001J6_A646INTERES, P001J6_A648VIDAUTIL, P001J6_A605MARCA, P001J6_A607MODELO, P001J6_A606SERIAL, P001J6_A686INDICADORPHI, P001J6_A540DESCRIPCIONENTRADA, P001J6_n540DESCRIPCIONENTRADA, P001J6_A84IDCARMAS
            }
            , new Object[] {
            P001J7_A83NROTRANSACCION, P001J7_A537CONSECUTIVOENTRADA, P001J7_n537CONSECUTIVOENTRADA, P001J7_A84IDCARMAS
            }
            , new Object[] {
            P001J8_A66Elem_Consecutivo, P001J8_A33Tipo_Codigo
            }
            , new Object[] {
            P001J9_A393List_Descripcion, P001J9_A36List_Id
            }
            , new Object[] {
            P001J10_A37Cata_Codigo, P001J10_A66Elem_Consecutivo, P001J10_A34Clas_Codigo
            }
            , new Object[] {
            P001J11_A36List_Id, P001J11_A34Clas_Codigo
            }
            , new Object[] {
            }
            , new Object[] {
            P001J13_A37Cata_Codigo, P001J13_A66Elem_Consecutivo, P001J13_A34Clas_Codigo
            }
            , new Object[] {
            P001J14_A555Clas_AtributoObligatorio, P001J14_A34Clas_Codigo, P001J14_A36List_Id, P001J14_A393List_Descripcion
            }
            , new Object[] {
            P001J15_A535ATRIBUTO, P001J15_n535ATRIBUTO, P001J15_A80NUMEROTRN, P001J15_A81ID_ENTRADA, P001J15_A82IDATRIBUTO
            }
            , new Object[] {
            P001J16_A83NROTRANSACCION, P001J16_A686INDICADORPHI, P001J16_A84IDCARMAS
            }
            , new Object[] {
            P001J17_A83NROTRANSACCION, P001J17_A686INDICADORPHI, P001J17_A84IDCARMAS
            }
            , new Object[] {
            P001J18_A83NROTRANSACCION, P001J18_A537CONSECUTIVOENTRADA, P001J18_n537CONSECUTIVOENTRADA, P001J18_A84IDCARMAS
            }
            , new Object[] {
            P001J19_A83NROTRANSACCION, P001J19_A686INDICADORPHI, P001J19_A84IDCARMAS
            }
            , new Object[] {
            P001J20_AV22IndicadorHijo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV88GXLvl383 ;
   private short AV18CuentaFallos ;
   private short AV17CuentaCargados ;
   private short AV32MessageCount ;
   private short AV39Row ;
   private short AV35NumeroColumna ;
   private short A84IDCARMAS ;
   private short AV8IDCARMAS ;
   private short AV13Cols ;
   private short A647TIEMPO ;
   private short A648VIDAUTIL ;
   private short A686INDICADORPHI ;
   private short AV60rTIEMPO ;
   private short AV50rVIDAUTIL ;
   private short AV46INDICADORPHI ;
   private short AV63Columna ;
   private short A81ID_ENTRADA ;
   private short A82IDATRIBUTO ;
   private short Gx_err ;
   private short AV24J ;
   private short AV23IndicadorPadre ;
   private short AV19CuentaRepetidos ;
   private short AV22IndicadorHijo ;
   private short cV22IndicadorHijo ;
   private int AV75GXV2 ;
   private int A601CANTIDADENTRADA ;
   private int AV61rCANTIDADENTRADA ;
   private int GX_INS48 ;
   private long AV43Tran_id ;
   private long AV42Tran_CodTipoElemento ;
   private long A83NROTRANSACCION ;
   private long A46Tran_Id ;
   private long A33Tipo_Codigo ;
   private long A36List_Id ;
   private long AV26List_Id ;
   private long A80NUMEROTRN ;
   private java.math.BigDecimal A538COSTOADQUISICION ;
   private java.math.BigDecimal A644OTROSCOSTOS ;
   private java.math.BigDecimal A645VALORFUTURO ;
   private java.math.BigDecimal A646INTERES ;
   private java.math.BigDecimal AV57rCOSTOADQUISICION ;
   private java.math.BigDecimal AV56rOTROSCOSTOS ;
   private java.math.BigDecimal AV53rVALORFUTURO ;
   private java.math.BigDecimal AV62INTERES ;
   private java.math.BigDecimal AV38pValorBien ;
   private String AV44Tran_TipoEntra ;
   private String scmdbuf ;
   private String A482Tran_TipoElemento ;
   private String AV48cTran_TipoElemento ;
   private String Gx_emsg ;
   private String A555Clas_AtributoObligatorio ;
   private boolean returnInSub ;
   private boolean n537CONSECUTIVOENTRADA ;
   private boolean n601CANTIDADENTRADA ;
   private boolean n538COSTOADQUISICION ;
   private boolean n540DESCRIPCIONENTRADA ;
   private boolean AV36pRespuesta ;
   private boolean GXv_boolean1[] ;
   private boolean n541TIPOATRIBUTO ;
   private boolean n535ATRIBUTO ;
   private boolean n536VALORATRIBUTO ;
   private boolean brk1J18 ;
   private String AV10Archivo ;
   private String AV41Tipo_Bien ;
   private String AV28Mensaje ;
   private String AV33MessageDescrip ;
   private String A537CONSECUTIVOENTRADA ;
   private String AV11ATRIBUTO ;
   private String AV45VALORATRIBUTO ;
   private String AV20Elem_Consecutivo ;
   private String AV9pTpmo_Codigo ;
   private String A49Tran_CodigoMovimiento ;
   private String A605MARCA ;
   private String A607MODELO ;
   private String A606SERIAL ;
   private String A540DESCRIPCIONENTRADA ;
   private String AV68pMARCA ;
   private String AV69pMODELO ;
   private String AV70pSERIAL ;
   private String AV71rDESCRIPCIONENTRADA ;
   private String AV64Inconsistencia ;
   private String A66Elem_Consecutivo ;
   private String A393List_Descripcion ;
   private String A37Cata_Codigo ;
   private String A34Clas_Codigo ;
   private String AV12Clas_Codigo ;
   private String A541TIPOATRIBUTO ;
   private String A535ATRIBUTO ;
   private String A536VALORATRIBUTO ;
   private String AV25List_Descripcion ;
   private String AV15ColumnaExcel2 ;
   private String AV34NombreColumna ;
   private String AV14ColumnaExcel ;
   private String AV16CONSECUTIVOENTRADA ;
   private com.orions2.SdtMAS_CARGUE_ENTRADA AV27MasCargueEntrada ;
   private String[] aP5 ;
   private short[] aP6 ;
   private short[] aP7 ;
   private short[] aP8 ;
   private IDataStoreProvider pr_default ;
   private long[] P001J2_A83NROTRANSACCION ;
   private String[] P001J2_A537CONSECUTIVOENTRADA ;
   private boolean[] P001J2_n537CONSECUTIVOENTRADA ;
   private short[] P001J2_A84IDCARMAS ;
   private long[] P001J3_A83NROTRANSACCION ;
   private String[] P001J3_A537CONSECUTIVOENTRADA ;
   private boolean[] P001J3_n537CONSECUTIVOENTRADA ;
   private short[] P001J3_A84IDCARMAS ;
   private long[] P001J5_A46Tran_Id ;
   private String[] P001J5_A49Tran_CodigoMovimiento ;
   private String[] P001J5_A482Tran_TipoElemento ;
   private long[] P001J6_A83NROTRANSACCION ;
   private String[] P001J6_A537CONSECUTIVOENTRADA ;
   private boolean[] P001J6_n537CONSECUTIVOENTRADA ;
   private int[] P001J6_A601CANTIDADENTRADA ;
   private boolean[] P001J6_n601CANTIDADENTRADA ;
   private java.math.BigDecimal[] P001J6_A538COSTOADQUISICION ;
   private boolean[] P001J6_n538COSTOADQUISICION ;
   private java.math.BigDecimal[] P001J6_A644OTROSCOSTOS ;
   private java.math.BigDecimal[] P001J6_A645VALORFUTURO ;
   private short[] P001J6_A647TIEMPO ;
   private java.math.BigDecimal[] P001J6_A646INTERES ;
   private short[] P001J6_A648VIDAUTIL ;
   private String[] P001J6_A605MARCA ;
   private String[] P001J6_A607MODELO ;
   private String[] P001J6_A606SERIAL ;
   private short[] P001J6_A686INDICADORPHI ;
   private String[] P001J6_A540DESCRIPCIONENTRADA ;
   private boolean[] P001J6_n540DESCRIPCIONENTRADA ;
   private short[] P001J6_A84IDCARMAS ;
   private long[] P001J7_A83NROTRANSACCION ;
   private String[] P001J7_A537CONSECUTIVOENTRADA ;
   private boolean[] P001J7_n537CONSECUTIVOENTRADA ;
   private short[] P001J7_A84IDCARMAS ;
   private String[] P001J8_A66Elem_Consecutivo ;
   private long[] P001J8_A33Tipo_Codigo ;
   private String[] P001J9_A393List_Descripcion ;
   private long[] P001J9_A36List_Id ;
   private String[] P001J10_A37Cata_Codigo ;
   private String[] P001J10_A66Elem_Consecutivo ;
   private String[] P001J10_A34Clas_Codigo ;
   private long[] P001J11_A36List_Id ;
   private String[] P001J11_A34Clas_Codigo ;
   private String[] P001J13_A37Cata_Codigo ;
   private String[] P001J13_A66Elem_Consecutivo ;
   private String[] P001J13_A34Clas_Codigo ;
   private String[] P001J14_A555Clas_AtributoObligatorio ;
   private String[] P001J14_A34Clas_Codigo ;
   private long[] P001J14_A36List_Id ;
   private String[] P001J14_A393List_Descripcion ;
   private String[] P001J15_A535ATRIBUTO ;
   private boolean[] P001J15_n535ATRIBUTO ;
   private long[] P001J15_A80NUMEROTRN ;
   private short[] P001J15_A81ID_ENTRADA ;
   private short[] P001J15_A82IDATRIBUTO ;
   private long[] P001J16_A83NROTRANSACCION ;
   private short[] P001J16_A686INDICADORPHI ;
   private short[] P001J16_A84IDCARMAS ;
   private long[] P001J17_A83NROTRANSACCION ;
   private short[] P001J17_A686INDICADORPHI ;
   private short[] P001J17_A84IDCARMAS ;
   private long[] P001J18_A83NROTRANSACCION ;
   private String[] P001J18_A537CONSECUTIVOENTRADA ;
   private boolean[] P001J18_n537CONSECUTIVOENTRADA ;
   private short[] P001J18_A84IDCARMAS ;
   private long[] P001J19_A83NROTRANSACCION ;
   private short[] P001J19_A686INDICADORPHI ;
   private short[] P001J19_A84IDCARMAS ;
   private short[] P001J20_AV22IndicadorHijo ;
   private com.genexus.gxoffice.ExcelDoc AV21ExcelDocument ;
   private com.genexus.webpanels.WebSession AV40Session1 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV74GXV1 ;
   private GXBaseCollection<com.orions2.SdtMensajes_MensajesItem> AV29Mensajes ;
   private com.genexus.SdtMessages_Message AV31Message ;
   private com.orions2.SdtMensajes_MensajesItem AV30MensajesItem ;
}

final  class validaarchivoentrada__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001J2", "SELECT NROTRANSACCION, CONSECUTIVOENTRADA, IDCARMAS FROM MAS_CARGUE_ENTRADA WHERE NROTRANSACCION = ? ORDER BY NROTRANSACCION, IDCARMAS ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001J3", "SELECT NROTRANSACCION, CONSECUTIVOENTRADA, IDCARMAS FROM MAS_CARGUE_ENTRADA WHERE NROTRANSACCION = ? ORDER BY NROTRANSACCION, IDCARMAS ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("P001J4", "DELETE FROM MAS_CARGUE_ENTRADA  WHERE NROTRANSACCION = ?", GX_NOMASK + GX_MASKLOOPLOCK, "MAS_CARGUE_ENTRADA")
         ,new ForEachCursor("P001J5", "SELECT Tran_Id, Tran_CodigoMovimiento, Tran_TipoElemento FROM ALM_TRANSACCION WHERE Tran_Id = ? ORDER BY Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P001J6", "SELECT NROTRANSACCION, CONSECUTIVOENTRADA, CANTIDADENTRADA, COSTOADQUISICION, OTROSCOSTOS, VALORFUTURO, TIEMPO, INTERES, VIDAUTIL, MARCA, MODELO, SERIAL, INDICADORPHI, DESCRIPCIONENTRADA, IDCARMAS FROM MAS_CARGUE_ENTRADA WHERE NROTRANSACCION = ? ORDER BY NROTRANSACCION, IDCARMAS ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001J7", "SELECT NROTRANSACCION, CONSECUTIVOENTRADA, IDCARMAS FROM MAS_CARGUE_ENTRADA WHERE NROTRANSACCION = ? ORDER BY NROTRANSACCION, IDCARMAS ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001J8", "SELECT Elem_Consecutivo, Tipo_Codigo FROM ALM_ELEMENTO WHERE Elem_Consecutivo = ? ORDER BY Elem_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P001J9", "SELECT List_Descripcion, List_Id FROM ALM_LISTA_ATRIBUTOS WHERE List_Descripcion = ? ORDER BY List_Descripcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001J10", "SELECT T1.Cata_Codigo, T1.Elem_Consecutivo, T2.Clas_Codigo FROM (ALM_ELEMENTO T1 INNER JOIN ALM_CATALOGO T2 ON T2.Cata_Codigo = T1.Cata_Codigo) WHERE T1.Elem_Consecutivo = ? ORDER BY T1.Elem_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P001J11", "SELECT List_Id, Clas_Codigo FROM ALM_CLASEATRIBUTOS WHERE Clas_Codigo = ? and List_Id = ? ORDER BY Clas_Codigo, List_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P001J12", "INSERT INTO MAS_CARGUE_ATRIBUTOS(NUMEROTRN, ID_ENTRADA, IDATRIBUTO, TIPOATRIBUTO, ATRIBUTO, VALORATRIBUTO) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "MAS_CARGUE_ATRIBUTOS")
         ,new ForEachCursor("P001J13", "SELECT T1.Cata_Codigo, T1.Elem_Consecutivo, T2.Clas_Codigo FROM (ALM_ELEMENTO T1 INNER JOIN ALM_CATALOGO T2 ON T2.Cata_Codigo = T1.Cata_Codigo) WHERE T1.Elem_Consecutivo = ? ORDER BY T1.Elem_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P001J14", "SELECT T1.Clas_AtributoObligatorio, T1.Clas_Codigo, T1.List_Id, T2.List_Descripcion FROM (ALM_CLASEATRIBUTOS T1 INNER JOIN ALM_LISTA_ATRIBUTOS T2 ON T2.List_Id = T1.List_Id) WHERE (T1.Clas_Codigo = ?) AND (T1.Clas_AtributoObligatorio = 'SI') ORDER BY T1.Clas_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001J15", "SELECT ATRIBUTO, NUMEROTRN, ID_ENTRADA, IDATRIBUTO FROM MAS_CARGUE_ATRIBUTOS WHERE ATRIBUTO = RTRIM(LTRIM(?)) ORDER BY NUMEROTRN, ID_ENTRADA, IDATRIBUTO ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001J16", "SELECT NROTRANSACCION, INDICADORPHI, IDCARMAS FROM MAS_CARGUE_ENTRADA WHERE NROTRANSACCION = ? ORDER BY NROTRANSACCION, IDCARMAS ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001J17", "SELECT NROTRANSACCION, INDICADORPHI, IDCARMAS FROM MAS_CARGUE_ENTRADA WHERE NROTRANSACCION = ? ORDER BY NROTRANSACCION, IDCARMAS ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001J18", "SELECT NROTRANSACCION, CONSECUTIVOENTRADA, IDCARMAS FROM MAS_CARGUE_ENTRADA WHERE NROTRANSACCION = ? ORDER BY NROTRANSACCION ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001J19", "SELECT NROTRANSACCION, INDICADORPHI, IDCARMAS FROM MAS_CARGUE_ENTRADA WHERE NROTRANSACCION = ? ORDER BY NROTRANSACCION, IDCARMAS ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001J20", "SELECT COUNT(*) FROM MAS_CARGUE_ENTRADA WHERE (NROTRANSACCION = ?) AND (INDICADORPHI = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 1) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2) ;
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2) ;
               ((short[]) buf[9])[0] = rslt.getShort(7) ;
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2) ;
               ((short[]) buf[11])[0] = rslt.getShort(9) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(11) ;
               ((String[]) buf[14])[0] = rslt.getVarchar(12) ;
               ((short[]) buf[15])[0] = rslt.getShort(13) ;
               ((String[]) buf[16])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(15) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               ((short[]) buf[4])[0] = rslt.getShort(4) ;
               return;
            case 14 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               return;
            case 15 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               return;
            case 16 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               return;
            case 17 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               return;
            case 18 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
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
               stmt.setVarchar(1, (String)parms[0], 9);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 50);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 9);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 7);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[4], 1);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[6], 50);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[8], 200);
               }
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 9);
               return;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 7);
               return;
            case 13 :
               stmt.setVarchar(1, (String)parms[0], 50);
               return;
            case 14 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 15 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 16 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 17 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 18 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

