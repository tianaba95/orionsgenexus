/*
               File: EliminaDetalleTrn
        Description: Elimina Detalle Trn
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:2.66
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class eliminadetalletrn extends GXProcedure
{
   public eliminadetalletrn( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( eliminadetalletrn.class ), "" );
   }

   public eliminadetalletrn( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public long executeUdp( long[] aP0 )
   {
      eliminadetalletrn.this.AV21Tran_Id = aP0[0];
      this.aP0 = aP0;
      eliminadetalletrn.this.AV16TDet_Consecutivo = aP1[0];
      this.aP1 = aP1;
      eliminadetalletrn.this.aP1 = new long[] {0};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( long[] aP0 ,
                        long[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( long[] aP0 ,
                             long[] aP1 )
   {
      eliminadetalletrn.this.AV21Tran_Id = aP0[0];
      this.aP0 = aP0;
      eliminadetalletrn.this.AV16TDet_Consecutivo = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV21Tran_Id ;
      GXv_int2[0] = AV14Regi_Id ;
      GXv_int3[0] = AV11Cent_Id ;
      GXv_char4[0] = AV9Alma_Modulo ;
      GXv_char5[0] = AV8Alma_Codigo ;
      GXv_char6[0] = AV10Bode_Codigo ;
      GXv_int7[0] = AV20Tran_ConsecutivoCC ;
      GXv_int8[0] = AV24Tran_IdCuentadanteOrigen ;
      GXv_char9[0] = AV26Tran_DescripcionMovimiento ;
      GXv_char10[0] = AV28Tran_Estado ;
      new com.orions2.datostran(remoteHandle, context).execute( GXv_int1, GXv_int2, GXv_int3, GXv_char4, GXv_char5, GXv_char6, GXv_int7, GXv_int8, GXv_char9, GXv_char10) ;
      eliminadetalletrn.this.AV21Tran_Id = GXv_int1[0] ;
      eliminadetalletrn.this.AV14Regi_Id = GXv_int2[0] ;
      eliminadetalletrn.this.AV11Cent_Id = GXv_int3[0] ;
      eliminadetalletrn.this.AV9Alma_Modulo = GXv_char4[0] ;
      eliminadetalletrn.this.AV8Alma_Codigo = GXv_char5[0] ;
      eliminadetalletrn.this.AV10Bode_Codigo = GXv_char6[0] ;
      eliminadetalletrn.this.AV20Tran_ConsecutivoCC = GXv_int7[0] ;
      eliminadetalletrn.this.AV24Tran_IdCuentadanteOrigen = GXv_int8[0] ;
      eliminadetalletrn.this.AV26Tran_DescripcionMovimiento = GXv_char9[0] ;
      eliminadetalletrn.this.AV28Tran_Estado = GXv_char10[0] ;
      AV12Costo_Total_Dev = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P001G2 */
      pr_default.execute(0, new Object[] {new Long(AV21Tran_Id), new Long(AV16TDet_Consecutivo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A69TDet_Consecutivo = P001G2_A69TDet_Consecutivo[0] ;
         A46Tran_Id = P001G2_A46Tran_Id[0] ;
         A490TDet_PlacaNumero = P001G2_A490TDet_PlacaNumero[0] ;
         n490TDet_PlacaNumero = P001G2_n490TDet_PlacaNumero[0] ;
         A66Elem_Consecutivo = P001G2_A66Elem_Consecutivo[0] ;
         A487TDet_Cantidad = P001G2_A487TDet_Cantidad[0] ;
         A491TDet_PlacaPadre = P001G2_A491TDet_PlacaPadre[0] ;
         n491TDet_PlacaPadre = P001G2_n491TDet_PlacaPadre[0] ;
         A505TDet_EsPadre = P001G2_A505TDet_EsPadre[0] ;
         AV18TDet_PlacaNumero = A490TDet_PlacaNumero ;
         AV22Elem_Consecutivo = A66Elem_Consecutivo ;
         AV15TDet_Cantidad = A487TDet_Cantidad ;
         AV19TDet_PlacaPadre = A491TDet_PlacaPadre ;
         AV17TDet_EsPadre = A505TDet_EsPadre ;
         AV13Invd_NumeroPlaca = A490TDet_PlacaNumero ;
         AV25Consecutivo = (int)(AV16TDet_Consecutivo) ;
         /* Execute user subroutine: 'ACTUALIZA ESTADO' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( GXutil.strcmp(AV17TDet_EsPadre, "SI") == 0 )
         {
            /* Execute user subroutine: 'BUSCA PLACAS HIJAS' */
            S141 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         if ( ! (GXutil.strcmp("", AV19TDet_PlacaPadre)==0) )
         {
            /* Execute user subroutine: 'BUSCA PLACA PADRE E HIJAS' */
            S151 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Optimized DELETE. */
      /* Using cursor P001G3 */
      pr_default.execute(1, new Object[] {new Long(AV21Tran_Id), new Long(AV16TDet_Consecutivo)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCION") ;
      /* End optimized DELETE. */
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "eliminadetalletrn");
      /* Execute user subroutine: 'ACTUALIZARTRANSACCION' */
      S161 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'ACTUALIZA ESTADO' Routine */
      /* Using cursor P001G4 */
      pr_default.execute(2, new Object[] {AV22Elem_Consecutivo, AV13Invd_NumeroPlaca});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A67Invd_NumeroPlaca = P001G4_A67Invd_NumeroPlaca[0] ;
         A66Elem_Consecutivo = P001G4_A66Elem_Consecutivo[0] ;
         A463Invd_Estado = P001G4_A463Invd_Estado[0] ;
         n463Invd_Estado = P001G4_n463Invd_Estado[0] ;
         A629Costo_Total_Dev = P001G4_A629Costo_Total_Dev[0] ;
         A463Invd_Estado = "R" ;
         n463Invd_Estado = false ;
         AV12Costo_Total_Dev = A629Costo_Total_Dev ;
         /* Using cursor P001G5 */
         pr_default.execute(3, new Object[] {new Boolean(n463Invd_Estado), A463Invd_Estado, A66Elem_Consecutivo, A67Invd_NumeroPlaca});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      /* Execute user subroutine: 'ELIMINA DATOS SALIDA' */
      S121 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'ACTUALIZA CABECERA' */
      S131 ();
      if (returnInSub) return;
   }

   public void S141( )
   {
      /* 'BUSCA PLACAS HIJAS' Routine */
      /* Using cursor P001G6 */
      pr_default.execute(4, new Object[] {new Long(AV21Tran_Id), AV18TDet_PlacaNumero});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A491TDet_PlacaPadre = P001G6_A491TDet_PlacaPadre[0] ;
         n491TDet_PlacaPadre = P001G6_n491TDet_PlacaPadre[0] ;
         A46Tran_Id = P001G6_A46Tran_Id[0] ;
         A66Elem_Consecutivo = P001G6_A66Elem_Consecutivo[0] ;
         A490TDet_PlacaNumero = P001G6_A490TDet_PlacaNumero[0] ;
         n490TDet_PlacaNumero = P001G6_n490TDet_PlacaNumero[0] ;
         A69TDet_Consecutivo = P001G6_A69TDet_Consecutivo[0] ;
         AV22Elem_Consecutivo = A66Elem_Consecutivo ;
         AV13Invd_NumeroPlaca = A490TDet_PlacaNumero ;
         AV25Consecutivo = (int)(A69TDet_Consecutivo) ;
         /* Execute user subroutine: 'ACTUALIZA ESTADO' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(4);
            returnInSub = true;
            if (true) return;
         }
         /* Using cursor P001G7 */
         pr_default.execute(5, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCION") ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S151( )
   {
      /* 'BUSCA PLACA PADRE E HIJAS' Routine */
      /* Using cursor P001G8 */
      pr_default.execute(6, new Object[] {new Long(AV21Tran_Id), AV19TDet_PlacaPadre});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A490TDet_PlacaNumero = P001G8_A490TDet_PlacaNumero[0] ;
         n490TDet_PlacaNumero = P001G8_n490TDet_PlacaNumero[0] ;
         A46Tran_Id = P001G8_A46Tran_Id[0] ;
         A66Elem_Consecutivo = P001G8_A66Elem_Consecutivo[0] ;
         A69TDet_Consecutivo = P001G8_A69TDet_Consecutivo[0] ;
         AV22Elem_Consecutivo = A66Elem_Consecutivo ;
         AV13Invd_NumeroPlaca = A490TDet_PlacaNumero ;
         AV25Consecutivo = (int)(A69TDet_Consecutivo) ;
         /* Execute user subroutine: 'ACTUALIZA ESTADO' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(6);
            returnInSub = true;
            if (true) return;
         }
         /* Using cursor P001G9 */
         pr_default.execute(7, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCION") ;
         pr_default.readNext(6);
      }
      pr_default.close(6);
      /* Using cursor P001G10 */
      pr_default.execute(8, new Object[] {new Long(AV21Tran_Id), AV19TDet_PlacaPadre});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A491TDet_PlacaPadre = P001G10_A491TDet_PlacaPadre[0] ;
         n491TDet_PlacaPadre = P001G10_n491TDet_PlacaPadre[0] ;
         A46Tran_Id = P001G10_A46Tran_Id[0] ;
         A66Elem_Consecutivo = P001G10_A66Elem_Consecutivo[0] ;
         A490TDet_PlacaNumero = P001G10_A490TDet_PlacaNumero[0] ;
         n490TDet_PlacaNumero = P001G10_n490TDet_PlacaNumero[0] ;
         A69TDet_Consecutivo = P001G10_A69TDet_Consecutivo[0] ;
         AV22Elem_Consecutivo = A66Elem_Consecutivo ;
         AV13Invd_NumeroPlaca = A490TDet_PlacaNumero ;
         AV25Consecutivo = (int)(A69TDet_Consecutivo) ;
         /* Execute user subroutine: 'ACTUALIZA ESTADO' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(8);
            returnInSub = true;
            if (true) return;
         }
         /* Using cursor P001G11 */
         pr_default.execute(9, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCION") ;
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   public void S131( )
   {
      /* 'ACTUALIZA CABECERA' Routine */
      /* Optimized UPDATE. */
      /* Using cursor P001G12 */
      pr_default.execute(10, new Object[] {AV12Costo_Total_Dev, new Long(AV21Tran_Id)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
      /* End optimized UPDATE. */
   }

   public void S121( )
   {
      /* 'ELIMINA DATOS SALIDA' Routine */
      /* Optimized DELETE. */
      /* Using cursor P001G13 */
      pr_default.execute(11, new Object[] {new Long(AV21Tran_Id), new Integer(AV25Consecutivo)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DET_TRAN_DATOS_SALIDA") ;
      /* End optimized DELETE. */
   }

   public void S161( )
   {
      /* 'ACTUALIZARTRANSACCION' Routine */
      /* Optimized group. */
      /* Using cursor P001G14 */
      pr_default.execute(12, new Object[] {new Long(AV21Tran_Id)});
      c489TDet_ValorTotal = P001G14_A489TDet_ValorTotal[0] ;
      pr_default.close(12);
      AV27TDet_ValorTotal = AV27TDet_ValorTotal.add(c489TDet_ValorTotal) ;
      /* End optimized group. */
      /* Optimized UPDATE. */
      /* Using cursor P001G15 */
      pr_default.execute(13, new Object[] {new Boolean(n483Tran_ValorTransaccion), AV27TDet_ValorTotal, new Long(AV21Tran_Id)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
      /* End optimized UPDATE. */
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "eliminadetalletrn");
   }

   protected void cleanup( )
   {
      this.aP0[0] = eliminadetalletrn.this.AV21Tran_Id;
      this.aP1[0] = eliminadetalletrn.this.AV16TDet_Consecutivo;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new long [1] ;
      GXv_int2 = new long [1] ;
      GXv_int3 = new long [1] ;
      AV9Alma_Modulo = "" ;
      GXv_char4 = new String [1] ;
      AV8Alma_Codigo = "" ;
      GXv_char5 = new String [1] ;
      AV10Bode_Codigo = "" ;
      GXv_char6 = new String [1] ;
      GXv_int7 = new long [1] ;
      GXv_int8 = new long [1] ;
      AV26Tran_DescripcionMovimiento = "" ;
      GXv_char9 = new String [1] ;
      AV28Tran_Estado = "" ;
      GXv_char10 = new String [1] ;
      AV12Costo_Total_Dev = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P001G2_A69TDet_Consecutivo = new long[1] ;
      P001G2_A46Tran_Id = new long[1] ;
      P001G2_A490TDet_PlacaNumero = new String[] {""} ;
      P001G2_n490TDet_PlacaNumero = new boolean[] {false} ;
      P001G2_A66Elem_Consecutivo = new String[] {""} ;
      P001G2_A487TDet_Cantidad = new long[1] ;
      P001G2_A491TDet_PlacaPadre = new String[] {""} ;
      P001G2_n491TDet_PlacaPadre = new boolean[] {false} ;
      P001G2_A505TDet_EsPadre = new String[] {""} ;
      A490TDet_PlacaNumero = "" ;
      A66Elem_Consecutivo = "" ;
      A491TDet_PlacaPadre = "" ;
      A505TDet_EsPadre = "" ;
      AV18TDet_PlacaNumero = "" ;
      AV22Elem_Consecutivo = "" ;
      AV19TDet_PlacaPadre = "" ;
      AV17TDet_EsPadre = "" ;
      AV13Invd_NumeroPlaca = "" ;
      P001G4_A67Invd_NumeroPlaca = new String[] {""} ;
      P001G4_A66Elem_Consecutivo = new String[] {""} ;
      P001G4_A463Invd_Estado = new String[] {""} ;
      P001G4_n463Invd_Estado = new boolean[] {false} ;
      P001G4_A629Costo_Total_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A67Invd_NumeroPlaca = "" ;
      A463Invd_Estado = "" ;
      A629Costo_Total_Dev = DecimalUtil.ZERO ;
      P001G6_A491TDet_PlacaPadre = new String[] {""} ;
      P001G6_n491TDet_PlacaPadre = new boolean[] {false} ;
      P001G6_A46Tran_Id = new long[1] ;
      P001G6_A66Elem_Consecutivo = new String[] {""} ;
      P001G6_A490TDet_PlacaNumero = new String[] {""} ;
      P001G6_n490TDet_PlacaNumero = new boolean[] {false} ;
      P001G6_A69TDet_Consecutivo = new long[1] ;
      P001G8_A490TDet_PlacaNumero = new String[] {""} ;
      P001G8_n490TDet_PlacaNumero = new boolean[] {false} ;
      P001G8_A46Tran_Id = new long[1] ;
      P001G8_A66Elem_Consecutivo = new String[] {""} ;
      P001G8_A69TDet_Consecutivo = new long[1] ;
      P001G10_A491TDet_PlacaPadre = new String[] {""} ;
      P001G10_n491TDet_PlacaPadre = new boolean[] {false} ;
      P001G10_A46Tran_Id = new long[1] ;
      P001G10_A66Elem_Consecutivo = new String[] {""} ;
      P001G10_A490TDet_PlacaNumero = new String[] {""} ;
      P001G10_n490TDet_PlacaNumero = new boolean[] {false} ;
      P001G10_A69TDet_Consecutivo = new long[1] ;
      c489TDet_ValorTotal = DecimalUtil.ZERO ;
      P001G14_A489TDet_ValorTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV27TDet_ValorTotal = DecimalUtil.ZERO ;
      A483Tran_ValorTransaccion = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.eliminadetalletrn__default(),
         new Object[] {
             new Object[] {
            P001G2_A69TDet_Consecutivo, P001G2_A46Tran_Id, P001G2_A490TDet_PlacaNumero, P001G2_n490TDet_PlacaNumero, P001G2_A66Elem_Consecutivo, P001G2_A487TDet_Cantidad, P001G2_A491TDet_PlacaPadre, P001G2_n491TDet_PlacaPadre, P001G2_A505TDet_EsPadre
            }
            , new Object[] {
            }
            , new Object[] {
            P001G4_A67Invd_NumeroPlaca, P001G4_A66Elem_Consecutivo, P001G4_A463Invd_Estado, P001G4_n463Invd_Estado, P001G4_A629Costo_Total_Dev
            }
            , new Object[] {
            }
            , new Object[] {
            P001G6_A491TDet_PlacaPadre, P001G6_n491TDet_PlacaPadre, P001G6_A46Tran_Id, P001G6_A66Elem_Consecutivo, P001G6_A490TDet_PlacaNumero, P001G6_n490TDet_PlacaNumero, P001G6_A69TDet_Consecutivo
            }
            , new Object[] {
            }
            , new Object[] {
            P001G8_A490TDet_PlacaNumero, P001G8_n490TDet_PlacaNumero, P001G8_A46Tran_Id, P001G8_A66Elem_Consecutivo, P001G8_A69TDet_Consecutivo
            }
            , new Object[] {
            }
            , new Object[] {
            P001G10_A491TDet_PlacaPadre, P001G10_n491TDet_PlacaPadre, P001G10_A46Tran_Id, P001G10_A66Elem_Consecutivo, P001G10_A490TDet_PlacaNumero, P001G10_n490TDet_PlacaNumero, P001G10_A69TDet_Consecutivo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P001G14_A489TDet_ValorTotal
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV25Consecutivo ;
   private long AV21Tran_Id ;
   private long AV16TDet_Consecutivo ;
   private long GXv_int1[] ;
   private long AV14Regi_Id ;
   private long GXv_int2[] ;
   private long AV11Cent_Id ;
   private long GXv_int3[] ;
   private long AV20Tran_ConsecutivoCC ;
   private long GXv_int7[] ;
   private long AV24Tran_IdCuentadanteOrigen ;
   private long GXv_int8[] ;
   private long A69TDet_Consecutivo ;
   private long A46Tran_Id ;
   private long A487TDet_Cantidad ;
   private long AV15TDet_Cantidad ;
   private java.math.BigDecimal AV12Costo_Total_Dev ;
   private java.math.BigDecimal A629Costo_Total_Dev ;
   private java.math.BigDecimal c489TDet_ValorTotal ;
   private java.math.BigDecimal AV27TDet_ValorTotal ;
   private java.math.BigDecimal A483Tran_ValorTransaccion ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String GXv_char9[] ;
   private String AV28Tran_Estado ;
   private String GXv_char10[] ;
   private String scmdbuf ;
   private boolean n490TDet_PlacaNumero ;
   private boolean n491TDet_PlacaPadre ;
   private boolean returnInSub ;
   private boolean n463Invd_Estado ;
   private boolean n483Tran_ValorTransaccion ;
   private String AV9Alma_Modulo ;
   private String AV8Alma_Codigo ;
   private String AV10Bode_Codigo ;
   private String AV26Tran_DescripcionMovimiento ;
   private String A490TDet_PlacaNumero ;
   private String A66Elem_Consecutivo ;
   private String A491TDet_PlacaPadre ;
   private String A505TDet_EsPadre ;
   private String AV18TDet_PlacaNumero ;
   private String AV22Elem_Consecutivo ;
   private String AV19TDet_PlacaPadre ;
   private String AV17TDet_EsPadre ;
   private String AV13Invd_NumeroPlaca ;
   private String A67Invd_NumeroPlaca ;
   private String A463Invd_Estado ;
   private long[] aP0 ;
   private long[] aP1 ;
   private IDataStoreProvider pr_default ;
   private long[] P001G2_A69TDet_Consecutivo ;
   private long[] P001G2_A46Tran_Id ;
   private String[] P001G2_A490TDet_PlacaNumero ;
   private boolean[] P001G2_n490TDet_PlacaNumero ;
   private String[] P001G2_A66Elem_Consecutivo ;
   private long[] P001G2_A487TDet_Cantidad ;
   private String[] P001G2_A491TDet_PlacaPadre ;
   private boolean[] P001G2_n491TDet_PlacaPadre ;
   private String[] P001G2_A505TDet_EsPadre ;
   private String[] P001G4_A67Invd_NumeroPlaca ;
   private String[] P001G4_A66Elem_Consecutivo ;
   private String[] P001G4_A463Invd_Estado ;
   private boolean[] P001G4_n463Invd_Estado ;
   private java.math.BigDecimal[] P001G4_A629Costo_Total_Dev ;
   private String[] P001G6_A491TDet_PlacaPadre ;
   private boolean[] P001G6_n491TDet_PlacaPadre ;
   private long[] P001G6_A46Tran_Id ;
   private String[] P001G6_A66Elem_Consecutivo ;
   private String[] P001G6_A490TDet_PlacaNumero ;
   private boolean[] P001G6_n490TDet_PlacaNumero ;
   private long[] P001G6_A69TDet_Consecutivo ;
   private String[] P001G8_A490TDet_PlacaNumero ;
   private boolean[] P001G8_n490TDet_PlacaNumero ;
   private long[] P001G8_A46Tran_Id ;
   private String[] P001G8_A66Elem_Consecutivo ;
   private long[] P001G8_A69TDet_Consecutivo ;
   private String[] P001G10_A491TDet_PlacaPadre ;
   private boolean[] P001G10_n491TDet_PlacaPadre ;
   private long[] P001G10_A46Tran_Id ;
   private String[] P001G10_A66Elem_Consecutivo ;
   private String[] P001G10_A490TDet_PlacaNumero ;
   private boolean[] P001G10_n490TDet_PlacaNumero ;
   private long[] P001G10_A69TDet_Consecutivo ;
   private java.math.BigDecimal[] P001G14_A489TDet_ValorTotal ;
}

final  class eliminadetalletrn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001G2", "SELECT TDet_Consecutivo, Tran_Id, TDet_PlacaNumero, Elem_Consecutivo, TDet_Cantidad, TDet_PlacaPadre, TDet_EsPadre FROM ALM_DETALLE_TRANSACCION WHERE Tran_Id = ? and TDet_Consecutivo = ? ORDER BY Tran_Id, TDet_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P001G3", "DELETE FROM ALM_DETALLE_TRANSACCION  WHERE Tran_Id = ? and TDet_Consecutivo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_DETALLE_TRANSACCION")
         ,new ForEachCursor("P001G4", "SELECT Invd_NumeroPlaca, Elem_Consecutivo, Invd_Estado, Costo_Total_Dev FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Elem_Consecutivo = ? and Invd_NumeroPlaca = ? ORDER BY Elem_Consecutivo, Invd_NumeroPlaca  FOR UPDATE OF Invd_Estado NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P001G5", "UPDATE ALM_INVENTARIO_DEVOLUTIVO SET Invd_Estado=?  WHERE Elem_Consecutivo = ? AND Invd_NumeroPlaca = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INVENTARIO_DEVOLUTIVO")
         ,new ForEachCursor("P001G6", "SELECT TDet_PlacaPadre, Tran_Id, Elem_Consecutivo, TDet_PlacaNumero, TDet_Consecutivo FROM ALM_DETALLE_TRANSACCION WHERE (Tran_Id = ?) AND (TDet_PlacaPadre = ?) ORDER BY Tran_Id  FOR UPDATE OF TDet_PlacaPadre NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P001G7", "DELETE FROM ALM_DETALLE_TRANSACCION  WHERE Tran_Id = ? AND TDet_Consecutivo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_DETALLE_TRANSACCION")
         ,new ForEachCursor("P001G8", "SELECT TDet_PlacaNumero, Tran_Id, Elem_Consecutivo, TDet_Consecutivo FROM ALM_DETALLE_TRANSACCION WHERE Tran_Id = ? and TDet_PlacaNumero = ? ORDER BY Tran_Id, TDet_PlacaNumero  FOR UPDATE OF Elem_Consecutivo NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P001G9", "DELETE FROM ALM_DETALLE_TRANSACCION  WHERE Tran_Id = ? AND TDet_Consecutivo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_DETALLE_TRANSACCION")
         ,new ForEachCursor("P001G10", "SELECT TDet_PlacaPadre, Tran_Id, Elem_Consecutivo, TDet_PlacaNumero, TDet_Consecutivo FROM ALM_DETALLE_TRANSACCION WHERE (Tran_Id = ?) AND (TDet_PlacaPadre = ?) ORDER BY Tran_Id  FOR UPDATE OF TDet_PlacaPadre NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P001G11", "DELETE FROM ALM_DETALLE_TRANSACCION  WHERE Tran_Id = ? AND TDet_Consecutivo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_DETALLE_TRANSACCION")
         ,new UpdateCursor("P001G12", "UPDATE ALM_TRANSACCION SET Tran_ValorTransaccion=Tran_ValorTransaccion - ?  WHERE Tran_Id = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_TRANSACCION")
         ,new UpdateCursor("P001G13", "DELETE FROM ALM_DET_TRAN_DATOS_SALIDA  WHERE Tran_Id = ? and TDet_Consecutivo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_DET_TRAN_DATOS_SALIDA")
         ,new ForEachCursor("P001G14", "SELECT SUM(TDet_ValorTotal) FROM ALM_DETALLE_TRANSACCION WHERE Tran_Id = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P001G15", "UPDATE ALM_TRANSACCION SET Tran_ValorTransaccion=?  WHERE Tran_Id = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_TRANSACCION")
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((long[]) buf[5])[0] = rslt.getLong(5) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(7) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(5) ;
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(5) ;
               return;
            case 12 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2) ;
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
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 9);
               stmt.setVarchar(2, (String)parms[1], 30);
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 1);
               }
               stmt.setVarchar(2, (String)parms[2], 9, false);
               stmt.setVarchar(3, (String)parms[3], 30, false);
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 30);
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 30);
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 30);
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 10 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               stmt.setLong(2, ((Number) parms[2]).longValue());
               return;
      }
   }

}

