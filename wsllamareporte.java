/*
               File: WSLlamaReporte
        Description: WSLlama Reporte
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:15.60
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wsllamareporte extends GXProcedure
{
   public wsllamareporte( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wsllamareporte.class ), "" );
   }

   public wsllamareporte( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( short[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             java.util.Date[] aP7 ,
                             java.util.Date[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             long[] aP13 ,
                             long[] aP14 ,
                             long[] aP15 ,
                             long[] aP16 ,
                             String[] aP17 ,
                             String[] aP18 ,
                             String[] aP19 ,
                             String[] aP20 ,
                             GXBaseCollection<com.orions2.SdtSDTSku_SDTSkuItem>[] aP21 ,
                             String[] aP22 )
   {
      wsllamareporte.this.AV47RPT_REP_ID = aP0[0];
      this.aP0 = aP0;
      wsllamareporte.this.AV55Codigo_Regional = aP1[0];
      this.aP1 = aP1;
      wsllamareporte.this.AV28Cent_Codigo = aP2[0];
      this.aP2 = aP2;
      wsllamareporte.this.AV34Modulo = aP3[0];
      this.aP3 = aP3;
      wsllamareporte.this.AV25Almacen = aP4[0];
      this.aP4 = aP4;
      wsllamareporte.this.AV26Bodega = aP5[0];
      this.aP5 = aP5;
      wsllamareporte.this.AV59CedulaChar = aP6[0];
      this.aP6 = aP6;
      wsllamareporte.this.AV32Fecha_Inicial = aP7[0];
      this.aP7 = aP7;
      wsllamareporte.this.AV31Fecha_Final = aP8[0];
      this.aP8 = aP8;
      wsllamareporte.this.AV30Estado_Inicial = aP9[0];
      this.aP9 = aP9;
      wsllamareporte.this.AV29Estado_Final = aP10[0];
      this.aP10 = aP10;
      wsllamareporte.this.AV36Movimiento_Inicial = aP11[0];
      this.aP11 = aP11;
      wsllamareporte.this.AV35Movimiento_Final = aP12[0];
      this.aP12 = aP12;
      wsllamareporte.this.AV40Trans_ConsecutivoCC = aP13[0];
      this.aP13 = aP13;
      wsllamareporte.this.AV41Trans_ConsecutivoCCFin = aP14[0];
      this.aP14 = aP14;
      wsllamareporte.this.AV39Tipo_Codigo = aP15[0];
      this.aP15 = aP15;
      wsllamareporte.this.AV42Proveedor = aP16[0];
      this.aP16 = aP16;
      wsllamareporte.this.AV44Area_Codigo = aP17[0];
      this.aP17 = aP17;
      wsllamareporte.this.AV45Curs_Codigo = aP18[0];
      this.aP18 = aP18;
      wsllamareporte.this.AV56Placa = aP19[0];
      this.aP19 = aP19;
      wsllamareporte.this.AV33Formato = aP20[0];
      this.aP20 = aP20;
      wsllamareporte.this.AV38SDTSKU = aP21[0];
      this.aP21 = aP21;
      wsllamareporte.this.AV19Usuario = aP22[0];
      this.aP22 = aP22;
      wsllamareporte.this.AV64Periodo = aP23[0];
      this.aP23 = aP23;
      wsllamareporte.this.aP23 = new String[] {""};
      initialize();
      privateExecute();
      return aP23[0];
   }

   public void execute( short[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        java.util.Date[] aP7 ,
                        java.util.Date[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 ,
                        long[] aP13 ,
                        long[] aP14 ,
                        long[] aP15 ,
                        long[] aP16 ,
                        String[] aP17 ,
                        String[] aP18 ,
                        String[] aP19 ,
                        String[] aP20 ,
                        GXBaseCollection<com.orions2.SdtSDTSku_SDTSkuItem>[] aP21 ,
                        String[] aP22 ,
                        String[] aP23 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23);
   }

   private void execute_int( short[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             java.util.Date[] aP7 ,
                             java.util.Date[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             long[] aP13 ,
                             long[] aP14 ,
                             long[] aP15 ,
                             long[] aP16 ,
                             String[] aP17 ,
                             String[] aP18 ,
                             String[] aP19 ,
                             String[] aP20 ,
                             GXBaseCollection<com.orions2.SdtSDTSku_SDTSkuItem>[] aP21 ,
                             String[] aP22 ,
                             String[] aP23 )
   {
      wsllamareporte.this.AV47RPT_REP_ID = aP0[0];
      this.aP0 = aP0;
      wsllamareporte.this.AV55Codigo_Regional = aP1[0];
      this.aP1 = aP1;
      wsllamareporte.this.AV28Cent_Codigo = aP2[0];
      this.aP2 = aP2;
      wsllamareporte.this.AV34Modulo = aP3[0];
      this.aP3 = aP3;
      wsllamareporte.this.AV25Almacen = aP4[0];
      this.aP4 = aP4;
      wsllamareporte.this.AV26Bodega = aP5[0];
      this.aP5 = aP5;
      wsllamareporte.this.AV59CedulaChar = aP6[0];
      this.aP6 = aP6;
      wsllamareporte.this.AV32Fecha_Inicial = aP7[0];
      this.aP7 = aP7;
      wsllamareporte.this.AV31Fecha_Final = aP8[0];
      this.aP8 = aP8;
      wsllamareporte.this.AV30Estado_Inicial = aP9[0];
      this.aP9 = aP9;
      wsllamareporte.this.AV29Estado_Final = aP10[0];
      this.aP10 = aP10;
      wsllamareporte.this.AV36Movimiento_Inicial = aP11[0];
      this.aP11 = aP11;
      wsllamareporte.this.AV35Movimiento_Final = aP12[0];
      this.aP12 = aP12;
      wsllamareporte.this.AV40Trans_ConsecutivoCC = aP13[0];
      this.aP13 = aP13;
      wsllamareporte.this.AV41Trans_ConsecutivoCCFin = aP14[0];
      this.aP14 = aP14;
      wsllamareporte.this.AV39Tipo_Codigo = aP15[0];
      this.aP15 = aP15;
      wsllamareporte.this.AV42Proveedor = aP16[0];
      this.aP16 = aP16;
      wsllamareporte.this.AV44Area_Codigo = aP17[0];
      this.aP17 = aP17;
      wsllamareporte.this.AV45Curs_Codigo = aP18[0];
      this.aP18 = aP18;
      wsllamareporte.this.AV56Placa = aP19[0];
      this.aP19 = aP19;
      wsllamareporte.this.AV33Formato = aP20[0];
      this.aP20 = aP20;
      wsllamareporte.this.AV38SDTSKU = aP21[0];
      this.aP21 = aP21;
      wsllamareporte.this.AV19Usuario = aP22[0];
      this.aP22 = aP22;
      wsllamareporte.this.AV64Periodo = aP23[0];
      this.aP23 = aP23;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = AV12Host ;
      GXv_char2[0] = AV17URL ;
      GXv_int3[0] = AV16Puerto ;
      GXv_char4[0] = AV57URLAutentica ;
      new com.orions2.parametrosreportes(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3, GXv_char4) ;
      wsllamareporte.this.AV12Host = GXv_char1[0] ;
      wsllamareporte.this.AV17URL = GXv_char2[0] ;
      wsllamareporte.this.AV16Puerto = GXv_int3[0] ;
      wsllamareporte.this.AV57URLAutentica = GXv_char4[0] ;
      AV17URL = "http://" + GXutil.trim( AV12Host) + ":" + GXutil.trim( GXutil.str( AV16Puerto, 4, 0)) + GXutil.trim( AV17URL) ;
      /* Execute user subroutine: 'REPORTES' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV17URL = AV17URL + AV48NomReporte ;
      if ( ( GXutil.strcmp(AV33Formato, "pdf") == 0 ) || ( GXutil.strcmp(AV33Formato, "") == 0 ) )
      {
         AV17URL = AV17URL + ".pdf?" ;
      }
      else
      {
         AV17URL = AV17URL + "Plano.xls?" ;
      }
      /* Execute user subroutine: 'PARAMETROS' */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV17URL = AV17URL + "USUARIO=" + AV19Usuario ;
      System.out.println( "URL"+AV17URL );
      AV54window.setUrl( AV17URL );
      httpContext.newWindow(AV54window);
      cleanup();
   }

   public void S111( )
   {
      /* 'REPORTES' Routine */
      AV48NomReporte = "" ;
      /* Using cursor P002W2 */
      pr_default.execute(0, new Object[] {new Short(AV47RPT_REP_ID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A843RPT_REP_ID = P002W2_A843RPT_REP_ID[0] ;
         A844RPT_REP_NOMBRE = P002W2_A844RPT_REP_NOMBRE[0] ;
         n844RPT_REP_NOMBRE = P002W2_n844RPT_REP_NOMBRE[0] ;
         AV48NomReporte = A844RPT_REP_NOMBRE ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
   }

   public void S121( )
   {
      /* 'PARAMETROS' Routine */
      /* Using cursor P002W3 */
      pr_default.execute(1, new Object[] {new Short(AV47RPT_REP_ID)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A843RPT_REP_ID = P002W3_A843RPT_REP_ID[0] ;
         A860RPT_PAR_NOMBREINTERNO = P002W3_A860RPT_PAR_NOMBREINTERNO[0] ;
         n860RPT_PAR_NOMBREINTERNO = P002W3_n860RPT_PAR_NOMBREINTERNO[0] ;
         A840RPT_PAR_ID = P002W3_A840RPT_PAR_ID[0] ;
         A852RPT_REP_PARM_ORDEN = P002W3_A852RPT_REP_PARM_ORDEN[0] ;
         n852RPT_REP_PARM_ORDEN = P002W3_n852RPT_REP_PARM_ORDEN[0] ;
         A860RPT_PAR_NOMBREINTERNO = P002W3_A860RPT_PAR_NOMBREINTERNO[0] ;
         n860RPT_PAR_NOMBREINTERNO = P002W3_n860RPT_PAR_NOMBREINTERNO[0] ;
         AV49Parametro = A860RPT_PAR_NOMBREINTERNO ;
         AV50IdParametro = A840RPT_PAR_ID ;
         if ( AV50IdParametro != 17 )
         {
            /* Execute user subroutine: 'VALORES' */
            S133 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               returnInSub = true;
               if (true) return;
            }
            if ( AV58Incluir )
            {
               if ( AV50IdParametro == 16 )
               {
                  AV17URL = AV17URL + AV49Parametro + "=" + AV61Consecutivos + "&" ;
               }
               else
               {
                  AV17URL = AV17URL + AV49Parametro + "=" + AV52Valor + "&" ;
               }
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S133( )
   {
      /* 'VALORES' Routine */
      AV52Valor = "" ;
      AV58Incluir = true ;
      if ( AV50IdParametro == 1 )
      {
         AV52Valor = GXutil.trim( AV55Codigo_Regional) ;
      }
      else if ( AV50IdParametro == 2 )
      {
         AV52Valor = GXutil.trim( AV28Cent_Codigo) ;
      }
      else if ( AV50IdParametro == 3 )
      {
         AV52Valor = GXutil.trim( AV34Modulo) ;
      }
      else if ( AV50IdParametro == 4 )
      {
         AV52Valor = GXutil.trim( AV25Almacen) ;
      }
      else if ( AV50IdParametro == 5 )
      {
         AV52Valor = GXutil.trim( AV26Bodega) ;
      }
      else if ( AV50IdParametro == 6 )
      {
         if ( GXutil.strcmp(AV59CedulaChar, "") == 0 )
         {
            AV58Incluir = false ;
         }
         else
         {
            AV52Valor = AV59CedulaChar ;
         }
      }
      else if ( AV50IdParametro == 7 )
      {
         if ( GXutil.dateCompare(AV32Fecha_Inicial, GXutil.nullDate()) )
         {
            AV58Incluir = false ;
         }
         else
         {
            AV52Valor = GXutil.trim( localUtil.dtoc( AV32Fecha_Inicial, 3, "/")) ;
         }
      }
      else if ( AV50IdParametro == 8 )
      {
         if ( GXutil.dateCompare(AV31Fecha_Final, GXutil.nullDate()) )
         {
            AV58Incluir = false ;
         }
         else
         {
            AV52Valor = GXutil.trim( localUtil.dtoc( AV31Fecha_Final, 3, "/")) ;
         }
      }
      else if ( AV50IdParametro == 9 )
      {
         AV52Valor = GXutil.trim( AV30Estado_Inicial) ;
      }
      else if ( AV50IdParametro == 10 )
      {
         AV52Valor = GXutil.trim( AV29Estado_Final) ;
      }
      else if ( AV50IdParametro == 11 )
      {
         AV52Valor = GXutil.trim( AV36Movimiento_Inicial) ;
      }
      else if ( AV50IdParametro == 12 )
      {
         AV52Valor = GXutil.trim( AV35Movimiento_Final) ;
      }
      else if ( AV50IdParametro == 13 )
      {
         AV52Valor = GXutil.trim( GXutil.str( AV40Trans_ConsecutivoCC, 18, 0)) ;
      }
      else if ( AV50IdParametro == 14 )
      {
         AV52Valor = GXutil.trim( GXutil.str( AV41Trans_ConsecutivoCCFin, 18, 0)) ;
      }
      else if ( AV50IdParametro == 15 )
      {
         AV52Valor = GXutil.trim( GXutil.str( AV39Tipo_Codigo, 18, 0)) ;
      }
      else if ( AV50IdParametro == 16 )
      {
         AV69GXV1 = 1 ;
         while ( AV69GXV1 <= AV38SDTSKU.size() )
         {
            AV60SDTSKUItem = (com.orions2.SdtSDTSku_SDTSkuItem)((com.orions2.SdtSDTSku_SDTSkuItem)AV38SDTSKU.elementAt(-1+AV69GXV1));
            AV63Todos = AV63Todos + AV60SDTSKUItem.getgxTv_SdtSDTSku_SDTSkuItem_Elem_consecutivo() + "," ;
            AV69GXV1 = (int)(AV69GXV1+1) ;
         }
         AV62Tamano = (short)(GXutil.len( AV63Todos)-1) ;
         AV61Consecutivos = GXutil.substring( AV63Todos, 1, AV62Tamano) ;
      }
      else if ( AV50IdParametro == 18 )
      {
         if ( AV42Proveedor == 0 )
         {
            AV58Incluir = false ;
         }
         else
         {
            AV52Valor = GXutil.trim( GXutil.str( AV42Proveedor, 18, 0)) ;
         }
      }
      else if ( AV50IdParametro == 19 )
      {
         if ( GXutil.strcmp(AV44Area_Codigo, "") == 0 )
         {
            AV58Incluir = false ;
         }
         else
         {
            AV52Valor = GXutil.trim( AV44Area_Codigo) ;
         }
      }
      else if ( AV50IdParametro == 20 )
      {
         if ( GXutil.strcmp(AV45Curs_Codigo, "") == 0 )
         {
            AV58Incluir = false ;
         }
         else
         {
            AV52Valor = GXutil.trim( AV45Curs_Codigo) ;
         }
      }
      else if ( AV50IdParametro == 21 )
      {
         AV52Valor = GXutil.trim( AV56Placa) ;
      }
      else if ( AV50IdParametro == 22 )
      {
         AV52Valor = GXutil.trim( AV64Periodo) ;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = wsllamareporte.this.AV47RPT_REP_ID;
      this.aP1[0] = wsllamareporte.this.AV55Codigo_Regional;
      this.aP2[0] = wsllamareporte.this.AV28Cent_Codigo;
      this.aP3[0] = wsllamareporte.this.AV34Modulo;
      this.aP4[0] = wsllamareporte.this.AV25Almacen;
      this.aP5[0] = wsllamareporte.this.AV26Bodega;
      this.aP6[0] = wsllamareporte.this.AV59CedulaChar;
      this.aP7[0] = wsllamareporte.this.AV32Fecha_Inicial;
      this.aP8[0] = wsllamareporte.this.AV31Fecha_Final;
      this.aP9[0] = wsllamareporte.this.AV30Estado_Inicial;
      this.aP10[0] = wsllamareporte.this.AV29Estado_Final;
      this.aP11[0] = wsllamareporte.this.AV36Movimiento_Inicial;
      this.aP12[0] = wsllamareporte.this.AV35Movimiento_Final;
      this.aP13[0] = wsllamareporte.this.AV40Trans_ConsecutivoCC;
      this.aP14[0] = wsllamareporte.this.AV41Trans_ConsecutivoCCFin;
      this.aP15[0] = wsllamareporte.this.AV39Tipo_Codigo;
      this.aP16[0] = wsllamareporte.this.AV42Proveedor;
      this.aP17[0] = wsllamareporte.this.AV44Area_Codigo;
      this.aP18[0] = wsllamareporte.this.AV45Curs_Codigo;
      this.aP19[0] = wsllamareporte.this.AV56Placa;
      this.aP20[0] = wsllamareporte.this.AV33Formato;
      this.aP21[0] = wsllamareporte.this.AV38SDTSKU;
      this.aP22[0] = wsllamareporte.this.AV19Usuario;
      this.aP23[0] = wsllamareporte.this.AV64Periodo;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Host = "" ;
      GXv_char1 = new String [1] ;
      AV17URL = "" ;
      GXv_char2 = new String [1] ;
      GXv_int3 = new short [1] ;
      AV57URLAutentica = "" ;
      GXv_char4 = new String [1] ;
      AV48NomReporte = "" ;
      AV54window = new com.genexus.webpanels.GXWindow();
      scmdbuf = "" ;
      P002W2_A843RPT_REP_ID = new short[1] ;
      P002W2_A844RPT_REP_NOMBRE = new String[] {""} ;
      P002W2_n844RPT_REP_NOMBRE = new boolean[] {false} ;
      A844RPT_REP_NOMBRE = "" ;
      P002W3_A843RPT_REP_ID = new short[1] ;
      P002W3_A860RPT_PAR_NOMBREINTERNO = new String[] {""} ;
      P002W3_n860RPT_PAR_NOMBREINTERNO = new boolean[] {false} ;
      P002W3_A840RPT_PAR_ID = new short[1] ;
      P002W3_A852RPT_REP_PARM_ORDEN = new short[1] ;
      P002W3_n852RPT_REP_PARM_ORDEN = new boolean[] {false} ;
      A860RPT_PAR_NOMBREINTERNO = "" ;
      AV49Parametro = "" ;
      AV61Consecutivos = "" ;
      AV52Valor = "" ;
      AV60SDTSKUItem = new com.orions2.SdtSDTSku_SDTSkuItem(remoteHandle, context);
      AV63Todos = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wsllamareporte__default(),
         new Object[] {
             new Object[] {
            P002W2_A843RPT_REP_ID, P002W2_A844RPT_REP_NOMBRE, P002W2_n844RPT_REP_NOMBRE
            }
            , new Object[] {
            P002W3_A843RPT_REP_ID, P002W3_A860RPT_PAR_NOMBREINTERNO, P002W3_n860RPT_PAR_NOMBREINTERNO, P002W3_A840RPT_PAR_ID, P002W3_A852RPT_REP_PARM_ORDEN, P002W3_n852RPT_REP_PARM_ORDEN
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV47RPT_REP_ID ;
   private short AV16Puerto ;
   private short GXv_int3[] ;
   private short A843RPT_REP_ID ;
   private short A840RPT_PAR_ID ;
   private short A852RPT_REP_PARM_ORDEN ;
   private short AV50IdParametro ;
   private short AV62Tamano ;
   private short Gx_err ;
   private int AV69GXV1 ;
   private long AV40Trans_ConsecutivoCC ;
   private long AV41Trans_ConsecutivoCCFin ;
   private long AV39Tipo_Codigo ;
   private long AV42Proveedor ;
   private String AV30Estado_Inicial ;
   private String AV29Estado_Final ;
   private String AV33Formato ;
   private String AV64Periodo ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private java.util.Date AV32Fecha_Inicial ;
   private java.util.Date AV31Fecha_Final ;
   private boolean returnInSub ;
   private boolean n844RPT_REP_NOMBRE ;
   private boolean n860RPT_PAR_NOMBREINTERNO ;
   private boolean n852RPT_REP_PARM_ORDEN ;
   private boolean AV58Incluir ;
   private String AV55Codigo_Regional ;
   private String AV28Cent_Codigo ;
   private String AV34Modulo ;
   private String AV25Almacen ;
   private String AV26Bodega ;
   private String AV59CedulaChar ;
   private String AV36Movimiento_Inicial ;
   private String AV35Movimiento_Final ;
   private String AV44Area_Codigo ;
   private String AV45Curs_Codigo ;
   private String AV56Placa ;
   private String AV19Usuario ;
   private String AV12Host ;
   private String AV17URL ;
   private String AV57URLAutentica ;
   private String AV48NomReporte ;
   private String A844RPT_REP_NOMBRE ;
   private String A860RPT_PAR_NOMBREINTERNO ;
   private String AV49Parametro ;
   private String AV61Consecutivos ;
   private String AV52Valor ;
   private String AV63Todos ;
   private com.genexus.webpanels.GXWindow AV54window ;
   private short[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private java.util.Date[] aP7 ;
   private java.util.Date[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private String[] aP11 ;
   private String[] aP12 ;
   private long[] aP13 ;
   private long[] aP14 ;
   private long[] aP15 ;
   private long[] aP16 ;
   private String[] aP17 ;
   private String[] aP18 ;
   private String[] aP19 ;
   private String[] aP20 ;
   private GXBaseCollection<com.orions2.SdtSDTSku_SDTSkuItem>[] aP21 ;
   private String[] aP22 ;
   private String[] aP23 ;
   private IDataStoreProvider pr_default ;
   private short[] P002W2_A843RPT_REP_ID ;
   private String[] P002W2_A844RPT_REP_NOMBRE ;
   private boolean[] P002W2_n844RPT_REP_NOMBRE ;
   private short[] P002W3_A843RPT_REP_ID ;
   private String[] P002W3_A860RPT_PAR_NOMBREINTERNO ;
   private boolean[] P002W3_n860RPT_PAR_NOMBREINTERNO ;
   private short[] P002W3_A840RPT_PAR_ID ;
   private short[] P002W3_A852RPT_REP_PARM_ORDEN ;
   private boolean[] P002W3_n852RPT_REP_PARM_ORDEN ;
   private GXBaseCollection<com.orions2.SdtSDTSku_SDTSkuItem> AV38SDTSKU ;
   private com.orions2.SdtSDTSku_SDTSkuItem AV60SDTSKUItem ;
}

final  class wsllamareporte__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002W2", "SELECT RPT_REP_ID, RPT_REP_NOMBRE FROM RPT_REPORTE WHERE RPT_REP_ID = ? ORDER BY RPT_REP_ID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P002W3", "SELECT T1.RPT_REP_ID, T2.RPT_PAR_NOMBREINTERNO, T1.RPT_PAR_ID, T1.RPT_REP_PARM_ORDEN FROM (RPT_REP_PARM T1 INNER JOIN RPT_PARAMETROS T2 ON T2.RPT_PAR_ID = T1.RPT_PAR_ID) WHERE T1.RPT_REP_ID = ? ORDER BY T1.RPT_REP_ID, T1.RPT_REP_PARM_ORDEN ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               ((short[]) buf[4])[0] = rslt.getShort(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
      }
   }

}

