/*
               File: PCambiarPlacas
        Description: PCambiar Placas
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:6.47
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcambiarplacas extends GXProcedure
{
   public pcambiarplacas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcambiarplacas.class ), "" );
   }

   public pcambiarplacas( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      pcambiarplacas.this.AV11Tran_Id = aP0[0];
      this.aP0 = aP0;
      pcambiarplacas.this.AV9Placa = aP1[0];
      this.aP1 = aP1;
      pcambiarplacas.this.AV15Observaciones = aP2[0];
      this.aP2 = aP2;
      pcambiarplacas.this.AV12Accion = aP3[0];
      this.aP3 = aP3;
      pcambiarplacas.this.AV14NuevaPlaca = aP4[0];
      this.aP4 = aP4;
      pcambiarplacas.this.AV13EsPlacaPadre = aP5[0];
      this.aP5 = aP5;
      pcambiarplacas.this.AV16PlacaPadre = aP6[0];
      this.aP6 = aP6;
      pcambiarplacas.this.AV18NuevaEsPlacaPadre = aP7[0];
      this.aP7 = aP7;
      pcambiarplacas.this.AV19NuevaPlacaPadre = aP8[0];
      this.aP8 = aP8;
      pcambiarplacas.this.aP8 = new String[] {""};
      initialize();
      privateExecute();
      return aP8[0];
   }

   public void execute( long[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( long[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      pcambiarplacas.this.AV11Tran_Id = aP0[0];
      this.aP0 = aP0;
      pcambiarplacas.this.AV9Placa = aP1[0];
      this.aP1 = aP1;
      pcambiarplacas.this.AV15Observaciones = aP2[0];
      this.aP2 = aP2;
      pcambiarplacas.this.AV12Accion = aP3[0];
      this.aP3 = aP3;
      pcambiarplacas.this.AV14NuevaPlaca = aP4[0];
      this.aP4 = aP4;
      pcambiarplacas.this.AV13EsPlacaPadre = aP5[0];
      this.aP5 = aP5;
      pcambiarplacas.this.AV16PlacaPadre = aP6[0];
      this.aP6 = aP6;
      pcambiarplacas.this.AV18NuevaEsPlacaPadre = aP7[0];
      this.aP7 = aP7;
      pcambiarplacas.this.AV19NuevaPlacaPadre = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV24GXLvl4 = (byte)(0) ;
      /* Using cursor P001Q2 */
      pr_default.execute(0, new Object[] {new Long(AV11Tran_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A46Tran_Id = P001Q2_A46Tran_Id[0] ;
         A69TDet_Consecutivo = P001Q2_A69TDet_Consecutivo[0] ;
         AV24GXLvl4 = (byte)(1) ;
         AV10TDet_Consecutivo = (long)(A69TDet_Consecutivo+1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV24GXLvl4 == 0 )
      {
         AV10TDet_Consecutivo = 1 ;
      }
      if ( ( GXutil.strcmp(AV12Accion, "DESAS") == 0 ) && ! (GXutil.strcmp("", AV16PlacaPadre)==0) )
      {
         /* Using cursor P001Q3 */
         pr_default.execute(1, new Object[] {AV9Placa});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A67Invd_NumeroPlaca = P001Q3_A67Invd_NumeroPlaca[0] ;
            A66Elem_Consecutivo = P001Q3_A66Elem_Consecutivo[0] ;
            A463Invd_Estado = P001Q3_A463Invd_Estado[0] ;
            n463Invd_Estado = P001Q3_n463Invd_Estado[0] ;
            A68Invd_PlacaPadre = P001Q3_A68Invd_PlacaPadre[0] ;
            n68Invd_PlacaPadre = P001Q3_n68Invd_PlacaPadre[0] ;
            AV8Elem_Consecutivo = A66Elem_Consecutivo ;
            A463Invd_Estado = "P" ;
            n463Invd_Estado = false ;
            A68Invd_PlacaPadre = "" ;
            n68Invd_PlacaPadre = false ;
            /* Using cursor P001Q4 */
            pr_default.execute(2, new Object[] {new Boolean(n463Invd_Estado), A463Invd_Estado, new Boolean(n68Invd_PlacaPadre), A68Invd_PlacaPadre, A66Elem_Consecutivo, A67Invd_NumeroPlaca});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         AV20TDet_PlacaNumero = AV9Placa ;
         AV21TDet_PlacaPadre = "" ;
         AV17TDet_EsPadre = "NO" ;
         /* Execute user subroutine: 'CREADETALLE' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( ( GXutil.strcmp(AV12Accion, "DESAS") == 0 ) && ( GXutil.strcmp(AV13EsPlacaPadre, "SI") == 0 ) )
      {
         /* Using cursor P001Q5 */
         pr_default.execute(3, new Object[] {AV9Placa});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A67Invd_NumeroPlaca = P001Q5_A67Invd_NumeroPlaca[0] ;
            A66Elem_Consecutivo = P001Q5_A66Elem_Consecutivo[0] ;
            A463Invd_Estado = P001Q5_A463Invd_Estado[0] ;
            n463Invd_Estado = P001Q5_n463Invd_Estado[0] ;
            A501Invd_EsPlacaPadre = P001Q5_A501Invd_EsPlacaPadre[0] ;
            n501Invd_EsPlacaPadre = P001Q5_n501Invd_EsPlacaPadre[0] ;
            AV8Elem_Consecutivo = A66Elem_Consecutivo ;
            A463Invd_Estado = "P" ;
            n463Invd_Estado = false ;
            A501Invd_EsPlacaPadre = "NO" ;
            n501Invd_EsPlacaPadre = false ;
            /* Using cursor P001Q6 */
            pr_default.execute(4, new Object[] {new Boolean(n463Invd_Estado), A463Invd_Estado, new Boolean(n501Invd_EsPlacaPadre), A501Invd_EsPlacaPadre, A66Elem_Consecutivo, A67Invd_NumeroPlaca});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         AV20TDet_PlacaNumero = AV9Placa ;
         AV21TDet_PlacaPadre = "" ;
         AV17TDet_EsPadre = "NO" ;
         /* Execute user subroutine: 'CREADETALLE' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Using cursor P001Q7 */
         pr_default.execute(5, new Object[] {AV9Placa});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A68Invd_PlacaPadre = P001Q7_A68Invd_PlacaPadre[0] ;
            n68Invd_PlacaPadre = P001Q7_n68Invd_PlacaPadre[0] ;
            A66Elem_Consecutivo = P001Q7_A66Elem_Consecutivo[0] ;
            A463Invd_Estado = P001Q7_A463Invd_Estado[0] ;
            n463Invd_Estado = P001Q7_n463Invd_Estado[0] ;
            A67Invd_NumeroPlaca = P001Q7_A67Invd_NumeroPlaca[0] ;
            A68Invd_PlacaPadre = "" ;
            n68Invd_PlacaPadre = false ;
            AV8Elem_Consecutivo = A66Elem_Consecutivo ;
            A463Invd_Estado = "P" ;
            n463Invd_Estado = false ;
            AV10TDet_Consecutivo = (long)(AV10TDet_Consecutivo+1) ;
            AV20TDet_PlacaNumero = A67Invd_NumeroPlaca ;
            AV21TDet_PlacaPadre = "" ;
            AV17TDet_EsPadre = "NO" ;
            /* Execute user subroutine: 'CREADETALLE' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(5);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Using cursor P001Q8 */
            pr_default.execute(6, new Object[] {new Boolean(n68Invd_PlacaPadre), A68Invd_PlacaPadre, new Boolean(n463Invd_Estado), A463Invd_Estado, A66Elem_Consecutivo, A67Invd_NumeroPlaca});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
            pr_default.readNext(5);
         }
         pr_default.close(5);
      }
      else if ( ( GXutil.strcmp(AV12Accion, "ASOCI") == 0 ) && ( GXutil.strcmp(AV13EsPlacaPadre, "SI") != 0 ) && ( (GXutil.strcmp("", AV16PlacaPadre)==0) ) && ( GXutil.strcmp(AV18NuevaEsPlacaPadre, "SI") == 0 ) && ( (GXutil.strcmp("", AV19NuevaPlacaPadre)==0) ) )
      {
         /* Using cursor P001Q9 */
         pr_default.execute(7, new Object[] {AV9Placa});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A67Invd_NumeroPlaca = P001Q9_A67Invd_NumeroPlaca[0] ;
            A66Elem_Consecutivo = P001Q9_A66Elem_Consecutivo[0] ;
            A463Invd_Estado = P001Q9_A463Invd_Estado[0] ;
            n463Invd_Estado = P001Q9_n463Invd_Estado[0] ;
            A68Invd_PlacaPadre = P001Q9_A68Invd_PlacaPadre[0] ;
            n68Invd_PlacaPadre = P001Q9_n68Invd_PlacaPadre[0] ;
            AV8Elem_Consecutivo = A66Elem_Consecutivo ;
            A463Invd_Estado = "P" ;
            n463Invd_Estado = false ;
            A68Invd_PlacaPadre = AV14NuevaPlaca ;
            n68Invd_PlacaPadre = false ;
            /* Using cursor P001Q10 */
            pr_default.execute(8, new Object[] {new Boolean(n463Invd_Estado), A463Invd_Estado, new Boolean(n68Invd_PlacaPadre), A68Invd_PlacaPadre, A66Elem_Consecutivo, A67Invd_NumeroPlaca});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(7);
         AV20TDet_PlacaNumero = AV9Placa ;
         AV21TDet_PlacaPadre = AV14NuevaPlaca ;
         AV17TDet_EsPadre = "NO" ;
         /* Execute user subroutine: 'CREADETALLE' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( ( GXutil.strcmp(AV12Accion, "ASOCI") == 0 ) && ( GXutil.strcmp(AV13EsPlacaPadre, "SI") != 0 ) && ( (GXutil.strcmp("", AV16PlacaPadre)==0) ) && ( GXutil.strcmp(AV18NuevaEsPlacaPadre, "SI") != 0 ) && ( (GXutil.strcmp("", AV19NuevaPlacaPadre)==0) ) )
      {
         /* Using cursor P001Q11 */
         pr_default.execute(9, new Object[] {AV9Placa});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A67Invd_NumeroPlaca = P001Q11_A67Invd_NumeroPlaca[0] ;
            A66Elem_Consecutivo = P001Q11_A66Elem_Consecutivo[0] ;
            A463Invd_Estado = P001Q11_A463Invd_Estado[0] ;
            n463Invd_Estado = P001Q11_n463Invd_Estado[0] ;
            A68Invd_PlacaPadre = P001Q11_A68Invd_PlacaPadre[0] ;
            n68Invd_PlacaPadre = P001Q11_n68Invd_PlacaPadre[0] ;
            AV8Elem_Consecutivo = A66Elem_Consecutivo ;
            A463Invd_Estado = "P" ;
            n463Invd_Estado = false ;
            A68Invd_PlacaPadre = AV14NuevaPlaca ;
            n68Invd_PlacaPadre = false ;
            /* Using cursor P001Q12 */
            pr_default.execute(10, new Object[] {new Boolean(n463Invd_Estado), A463Invd_Estado, new Boolean(n68Invd_PlacaPadre), A68Invd_PlacaPadre, A66Elem_Consecutivo, A67Invd_NumeroPlaca});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(9);
         AV20TDet_PlacaNumero = AV9Placa ;
         AV21TDet_PlacaPadre = AV14NuevaPlaca ;
         AV17TDet_EsPadre = "NO" ;
         /* Execute user subroutine: 'CREADETALLE' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Using cursor P001Q13 */
         pr_default.execute(11, new Object[] {AV14NuevaPlaca});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A67Invd_NumeroPlaca = P001Q13_A67Invd_NumeroPlaca[0] ;
            A66Elem_Consecutivo = P001Q13_A66Elem_Consecutivo[0] ;
            A463Invd_Estado = P001Q13_A463Invd_Estado[0] ;
            n463Invd_Estado = P001Q13_n463Invd_Estado[0] ;
            A501Invd_EsPlacaPadre = P001Q13_A501Invd_EsPlacaPadre[0] ;
            n501Invd_EsPlacaPadre = P001Q13_n501Invd_EsPlacaPadre[0] ;
            AV8Elem_Consecutivo = A66Elem_Consecutivo ;
            A463Invd_Estado = "P" ;
            n463Invd_Estado = false ;
            A501Invd_EsPlacaPadre = "SI" ;
            n501Invd_EsPlacaPadre = false ;
            /* Using cursor P001Q14 */
            pr_default.execute(12, new Object[] {new Boolean(n463Invd_Estado), A463Invd_Estado, new Boolean(n501Invd_EsPlacaPadre), A501Invd_EsPlacaPadre, A66Elem_Consecutivo, A67Invd_NumeroPlaca});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(11);
         AV10TDet_Consecutivo = (long)(AV10TDet_Consecutivo+1) ;
         AV20TDet_PlacaNumero = AV14NuevaPlaca ;
         AV21TDet_PlacaPadre = "" ;
         AV17TDet_EsPadre = "SI" ;
         /* Execute user subroutine: 'CREADETALLE' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( ( GXutil.strcmp(AV12Accion, "ASOCI") == 0 ) && ( GXutil.strcmp(AV13EsPlacaPadre, "SI") == 0 ) && ( (GXutil.strcmp("", AV16PlacaPadre)==0) ) && ( GXutil.strcmp(AV18NuevaEsPlacaPadre, "SI") == 0 ) && ( (GXutil.strcmp("", AV19NuevaPlacaPadre)==0) ) )
      {
         /* Using cursor P001Q15 */
         pr_default.execute(13, new Object[] {AV9Placa});
         while ( (pr_default.getStatus(13) != 101) )
         {
            A67Invd_NumeroPlaca = P001Q15_A67Invd_NumeroPlaca[0] ;
            A66Elem_Consecutivo = P001Q15_A66Elem_Consecutivo[0] ;
            A463Invd_Estado = P001Q15_A463Invd_Estado[0] ;
            n463Invd_Estado = P001Q15_n463Invd_Estado[0] ;
            A501Invd_EsPlacaPadre = P001Q15_A501Invd_EsPlacaPadre[0] ;
            n501Invd_EsPlacaPadre = P001Q15_n501Invd_EsPlacaPadre[0] ;
            AV8Elem_Consecutivo = A66Elem_Consecutivo ;
            A463Invd_Estado = "P" ;
            n463Invd_Estado = false ;
            A501Invd_EsPlacaPadre = "NO" ;
            n501Invd_EsPlacaPadre = false ;
            /* Using cursor P001Q16 */
            pr_default.execute(14, new Object[] {new Boolean(n463Invd_Estado), A463Invd_Estado, new Boolean(n501Invd_EsPlacaPadre), A501Invd_EsPlacaPadre, A66Elem_Consecutivo, A67Invd_NumeroPlaca});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(13);
         AV20TDet_PlacaNumero = AV9Placa ;
         AV21TDet_PlacaPadre = "" ;
         AV17TDet_EsPadre = "NO" ;
         /* Execute user subroutine: 'CREADETALLE' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Using cursor P001Q17 */
         pr_default.execute(15, new Object[] {AV9Placa});
         while ( (pr_default.getStatus(15) != 101) )
         {
            A68Invd_PlacaPadre = P001Q17_A68Invd_PlacaPadre[0] ;
            n68Invd_PlacaPadre = P001Q17_n68Invd_PlacaPadre[0] ;
            A66Elem_Consecutivo = P001Q17_A66Elem_Consecutivo[0] ;
            A463Invd_Estado = P001Q17_A463Invd_Estado[0] ;
            n463Invd_Estado = P001Q17_n463Invd_Estado[0] ;
            A67Invd_NumeroPlaca = P001Q17_A67Invd_NumeroPlaca[0] ;
            AV8Elem_Consecutivo = A66Elem_Consecutivo ;
            A68Invd_PlacaPadre = AV14NuevaPlaca ;
            n68Invd_PlacaPadre = false ;
            A463Invd_Estado = "P" ;
            n463Invd_Estado = false ;
            AV10TDet_Consecutivo = (long)(AV10TDet_Consecutivo+1) ;
            AV20TDet_PlacaNumero = A67Invd_NumeroPlaca ;
            AV21TDet_PlacaPadre = AV14NuevaPlaca ;
            AV17TDet_EsPadre = "NO" ;
            /* Execute user subroutine: 'CREADETALLE' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(15);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Using cursor P001Q18 */
            pr_default.execute(16, new Object[] {new Boolean(n68Invd_PlacaPadre), A68Invd_PlacaPadre, new Boolean(n463Invd_Estado), A463Invd_Estado, A66Elem_Consecutivo, A67Invd_NumeroPlaca});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
            pr_default.readNext(15);
         }
         pr_default.close(15);
      }
      else if ( ( GXutil.strcmp(AV12Accion, "ASOCI") == 0 ) && ( GXutil.strcmp(AV13EsPlacaPadre, "SI") == 0 ) && ( (GXutil.strcmp("", AV16PlacaPadre)==0) ) && ( GXutil.strcmp(AV18NuevaEsPlacaPadre, "SI") != 0 ) && ( (GXutil.strcmp("", AV19NuevaPlacaPadre)==0) ) )
      {
         /* Using cursor P001Q19 */
         pr_default.execute(17, new Object[] {AV9Placa});
         while ( (pr_default.getStatus(17) != 101) )
         {
            A67Invd_NumeroPlaca = P001Q19_A67Invd_NumeroPlaca[0] ;
            A66Elem_Consecutivo = P001Q19_A66Elem_Consecutivo[0] ;
            A463Invd_Estado = P001Q19_A463Invd_Estado[0] ;
            n463Invd_Estado = P001Q19_n463Invd_Estado[0] ;
            A501Invd_EsPlacaPadre = P001Q19_A501Invd_EsPlacaPadre[0] ;
            n501Invd_EsPlacaPadre = P001Q19_n501Invd_EsPlacaPadre[0] ;
            AV8Elem_Consecutivo = A66Elem_Consecutivo ;
            A463Invd_Estado = "P" ;
            n463Invd_Estado = false ;
            A501Invd_EsPlacaPadre = "NO" ;
            n501Invd_EsPlacaPadre = false ;
            /* Using cursor P001Q20 */
            pr_default.execute(18, new Object[] {new Boolean(n463Invd_Estado), A463Invd_Estado, new Boolean(n501Invd_EsPlacaPadre), A501Invd_EsPlacaPadre, A66Elem_Consecutivo, A67Invd_NumeroPlaca});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(17);
         AV20TDet_PlacaNumero = AV9Placa ;
         AV21TDet_PlacaPadre = "" ;
         AV17TDet_EsPadre = "NO" ;
         /* Execute user subroutine: 'CREADETALLE' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Using cursor P001Q21 */
         pr_default.execute(19, new Object[] {AV14NuevaPlaca});
         while ( (pr_default.getStatus(19) != 101) )
         {
            A67Invd_NumeroPlaca = P001Q21_A67Invd_NumeroPlaca[0] ;
            A66Elem_Consecutivo = P001Q21_A66Elem_Consecutivo[0] ;
            A463Invd_Estado = P001Q21_A463Invd_Estado[0] ;
            n463Invd_Estado = P001Q21_n463Invd_Estado[0] ;
            A501Invd_EsPlacaPadre = P001Q21_A501Invd_EsPlacaPadre[0] ;
            n501Invd_EsPlacaPadre = P001Q21_n501Invd_EsPlacaPadre[0] ;
            AV8Elem_Consecutivo = A66Elem_Consecutivo ;
            A463Invd_Estado = "P" ;
            n463Invd_Estado = false ;
            A501Invd_EsPlacaPadre = "SI" ;
            n501Invd_EsPlacaPadre = false ;
            /* Using cursor P001Q22 */
            pr_default.execute(20, new Object[] {new Boolean(n463Invd_Estado), A463Invd_Estado, new Boolean(n501Invd_EsPlacaPadre), A501Invd_EsPlacaPadre, A66Elem_Consecutivo, A67Invd_NumeroPlaca});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(19);
         AV10TDet_Consecutivo = (long)(AV10TDet_Consecutivo+1) ;
         AV20TDet_PlacaNumero = AV14NuevaPlaca ;
         AV21TDet_PlacaPadre = "" ;
         AV17TDet_EsPadre = "SI" ;
         /* Execute user subroutine: 'CREADETALLE' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Using cursor P001Q23 */
         pr_default.execute(21, new Object[] {AV9Placa});
         while ( (pr_default.getStatus(21) != 101) )
         {
            A68Invd_PlacaPadre = P001Q23_A68Invd_PlacaPadre[0] ;
            n68Invd_PlacaPadre = P001Q23_n68Invd_PlacaPadre[0] ;
            A66Elem_Consecutivo = P001Q23_A66Elem_Consecutivo[0] ;
            A463Invd_Estado = P001Q23_A463Invd_Estado[0] ;
            n463Invd_Estado = P001Q23_n463Invd_Estado[0] ;
            A67Invd_NumeroPlaca = P001Q23_A67Invd_NumeroPlaca[0] ;
            AV8Elem_Consecutivo = A66Elem_Consecutivo ;
            A68Invd_PlacaPadre = AV14NuevaPlaca ;
            n68Invd_PlacaPadre = false ;
            A463Invd_Estado = "P" ;
            n463Invd_Estado = false ;
            AV10TDet_Consecutivo = (long)(AV10TDet_Consecutivo+1) ;
            AV20TDet_PlacaNumero = A67Invd_NumeroPlaca ;
            AV21TDet_PlacaPadre = AV14NuevaPlaca ;
            AV17TDet_EsPadre = "NO" ;
            /* Execute user subroutine: 'CREADETALLE' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(21);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Using cursor P001Q24 */
            pr_default.execute(22, new Object[] {new Boolean(n68Invd_PlacaPadre), A68Invd_PlacaPadre, new Boolean(n463Invd_Estado), A463Invd_Estado, A66Elem_Consecutivo, A67Invd_NumeroPlaca});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
            pr_default.readNext(21);
         }
         pr_default.close(21);
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CREADETALLE' Routine */
      /*
         INSERT RECORD ON TABLE ALM_DETALLE_TRANSACCION

      */
      A46Tran_Id = AV11Tran_Id ;
      A69TDet_Consecutivo = AV10TDet_Consecutivo ;
      A66Elem_Consecutivo = AV8Elem_Consecutivo ;
      A487TDet_Cantidad = 1 ;
      A490TDet_PlacaNumero = AV20TDet_PlacaNumero ;
      n490TDet_PlacaNumero = false ;
      A491TDet_PlacaPadre = AV21TDet_PlacaPadre ;
      n491TDet_PlacaPadre = false ;
      A504TDet_Observaciones = AV15Observaciones ;
      n504TDet_Observaciones = false ;
      A505TDet_EsPadre = AV17TDet_EsPadre ;
      /* Using cursor P001Q25 */
      pr_default.execute(23, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo), A66Elem_Consecutivo, new Long(A487TDet_Cantidad), new Boolean(n490TDet_PlacaNumero), A490TDet_PlacaNumero, new Boolean(n504TDet_Observaciones), A504TDet_Observaciones, new Boolean(n491TDet_PlacaPadre), A491TDet_PlacaPadre, A505TDet_EsPadre});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCION") ;
      if ( (pr_default.getStatus(23) == 1) )
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
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcambiarplacas.this.AV11Tran_Id;
      this.aP1[0] = pcambiarplacas.this.AV9Placa;
      this.aP2[0] = pcambiarplacas.this.AV15Observaciones;
      this.aP3[0] = pcambiarplacas.this.AV12Accion;
      this.aP4[0] = pcambiarplacas.this.AV14NuevaPlaca;
      this.aP5[0] = pcambiarplacas.this.AV13EsPlacaPadre;
      this.aP6[0] = pcambiarplacas.this.AV16PlacaPadre;
      this.aP7[0] = pcambiarplacas.this.AV18NuevaEsPlacaPadre;
      this.aP8[0] = pcambiarplacas.this.AV19NuevaPlacaPadre;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "pcambiarplacas");
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P001Q2_A46Tran_Id = new long[1] ;
      P001Q2_A69TDet_Consecutivo = new long[1] ;
      P001Q3_A67Invd_NumeroPlaca = new String[] {""} ;
      P001Q3_A66Elem_Consecutivo = new String[] {""} ;
      P001Q3_A463Invd_Estado = new String[] {""} ;
      P001Q3_n463Invd_Estado = new boolean[] {false} ;
      P001Q3_A68Invd_PlacaPadre = new String[] {""} ;
      P001Q3_n68Invd_PlacaPadre = new boolean[] {false} ;
      A67Invd_NumeroPlaca = "" ;
      A66Elem_Consecutivo = "" ;
      A463Invd_Estado = "" ;
      A68Invd_PlacaPadre = "" ;
      AV8Elem_Consecutivo = "" ;
      AV20TDet_PlacaNumero = "" ;
      AV21TDet_PlacaPadre = "" ;
      AV17TDet_EsPadre = "" ;
      P001Q5_A67Invd_NumeroPlaca = new String[] {""} ;
      P001Q5_A66Elem_Consecutivo = new String[] {""} ;
      P001Q5_A463Invd_Estado = new String[] {""} ;
      P001Q5_n463Invd_Estado = new boolean[] {false} ;
      P001Q5_A501Invd_EsPlacaPadre = new String[] {""} ;
      P001Q5_n501Invd_EsPlacaPadre = new boolean[] {false} ;
      A501Invd_EsPlacaPadre = "" ;
      P001Q7_A68Invd_PlacaPadre = new String[] {""} ;
      P001Q7_n68Invd_PlacaPadre = new boolean[] {false} ;
      P001Q7_A66Elem_Consecutivo = new String[] {""} ;
      P001Q7_A463Invd_Estado = new String[] {""} ;
      P001Q7_n463Invd_Estado = new boolean[] {false} ;
      P001Q7_A67Invd_NumeroPlaca = new String[] {""} ;
      P001Q9_A67Invd_NumeroPlaca = new String[] {""} ;
      P001Q9_A66Elem_Consecutivo = new String[] {""} ;
      P001Q9_A463Invd_Estado = new String[] {""} ;
      P001Q9_n463Invd_Estado = new boolean[] {false} ;
      P001Q9_A68Invd_PlacaPadre = new String[] {""} ;
      P001Q9_n68Invd_PlacaPadre = new boolean[] {false} ;
      P001Q11_A67Invd_NumeroPlaca = new String[] {""} ;
      P001Q11_A66Elem_Consecutivo = new String[] {""} ;
      P001Q11_A463Invd_Estado = new String[] {""} ;
      P001Q11_n463Invd_Estado = new boolean[] {false} ;
      P001Q11_A68Invd_PlacaPadre = new String[] {""} ;
      P001Q11_n68Invd_PlacaPadre = new boolean[] {false} ;
      P001Q13_A67Invd_NumeroPlaca = new String[] {""} ;
      P001Q13_A66Elem_Consecutivo = new String[] {""} ;
      P001Q13_A463Invd_Estado = new String[] {""} ;
      P001Q13_n463Invd_Estado = new boolean[] {false} ;
      P001Q13_A501Invd_EsPlacaPadre = new String[] {""} ;
      P001Q13_n501Invd_EsPlacaPadre = new boolean[] {false} ;
      P001Q15_A67Invd_NumeroPlaca = new String[] {""} ;
      P001Q15_A66Elem_Consecutivo = new String[] {""} ;
      P001Q15_A463Invd_Estado = new String[] {""} ;
      P001Q15_n463Invd_Estado = new boolean[] {false} ;
      P001Q15_A501Invd_EsPlacaPadre = new String[] {""} ;
      P001Q15_n501Invd_EsPlacaPadre = new boolean[] {false} ;
      P001Q17_A68Invd_PlacaPadre = new String[] {""} ;
      P001Q17_n68Invd_PlacaPadre = new boolean[] {false} ;
      P001Q17_A66Elem_Consecutivo = new String[] {""} ;
      P001Q17_A463Invd_Estado = new String[] {""} ;
      P001Q17_n463Invd_Estado = new boolean[] {false} ;
      P001Q17_A67Invd_NumeroPlaca = new String[] {""} ;
      P001Q19_A67Invd_NumeroPlaca = new String[] {""} ;
      P001Q19_A66Elem_Consecutivo = new String[] {""} ;
      P001Q19_A463Invd_Estado = new String[] {""} ;
      P001Q19_n463Invd_Estado = new boolean[] {false} ;
      P001Q19_A501Invd_EsPlacaPadre = new String[] {""} ;
      P001Q19_n501Invd_EsPlacaPadre = new boolean[] {false} ;
      P001Q21_A67Invd_NumeroPlaca = new String[] {""} ;
      P001Q21_A66Elem_Consecutivo = new String[] {""} ;
      P001Q21_A463Invd_Estado = new String[] {""} ;
      P001Q21_n463Invd_Estado = new boolean[] {false} ;
      P001Q21_A501Invd_EsPlacaPadre = new String[] {""} ;
      P001Q21_n501Invd_EsPlacaPadre = new boolean[] {false} ;
      P001Q23_A68Invd_PlacaPadre = new String[] {""} ;
      P001Q23_n68Invd_PlacaPadre = new boolean[] {false} ;
      P001Q23_A66Elem_Consecutivo = new String[] {""} ;
      P001Q23_A463Invd_Estado = new String[] {""} ;
      P001Q23_n463Invd_Estado = new boolean[] {false} ;
      P001Q23_A67Invd_NumeroPlaca = new String[] {""} ;
      A490TDet_PlacaNumero = "" ;
      A491TDet_PlacaPadre = "" ;
      A504TDet_Observaciones = "" ;
      A505TDet_EsPadre = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.pcambiarplacas__default(),
         new Object[] {
             new Object[] {
            P001Q2_A46Tran_Id, P001Q2_A69TDet_Consecutivo
            }
            , new Object[] {
            P001Q3_A67Invd_NumeroPlaca, P001Q3_A66Elem_Consecutivo, P001Q3_A463Invd_Estado, P001Q3_n463Invd_Estado, P001Q3_A68Invd_PlacaPadre, P001Q3_n68Invd_PlacaPadre
            }
            , new Object[] {
            }
            , new Object[] {
            P001Q5_A67Invd_NumeroPlaca, P001Q5_A66Elem_Consecutivo, P001Q5_A463Invd_Estado, P001Q5_n463Invd_Estado, P001Q5_A501Invd_EsPlacaPadre, P001Q5_n501Invd_EsPlacaPadre
            }
            , new Object[] {
            }
            , new Object[] {
            P001Q7_A68Invd_PlacaPadre, P001Q7_n68Invd_PlacaPadre, P001Q7_A66Elem_Consecutivo, P001Q7_A463Invd_Estado, P001Q7_n463Invd_Estado, P001Q7_A67Invd_NumeroPlaca
            }
            , new Object[] {
            }
            , new Object[] {
            P001Q9_A67Invd_NumeroPlaca, P001Q9_A66Elem_Consecutivo, P001Q9_A463Invd_Estado, P001Q9_n463Invd_Estado, P001Q9_A68Invd_PlacaPadre, P001Q9_n68Invd_PlacaPadre
            }
            , new Object[] {
            }
            , new Object[] {
            P001Q11_A67Invd_NumeroPlaca, P001Q11_A66Elem_Consecutivo, P001Q11_A463Invd_Estado, P001Q11_n463Invd_Estado, P001Q11_A68Invd_PlacaPadre, P001Q11_n68Invd_PlacaPadre
            }
            , new Object[] {
            }
            , new Object[] {
            P001Q13_A67Invd_NumeroPlaca, P001Q13_A66Elem_Consecutivo, P001Q13_A463Invd_Estado, P001Q13_n463Invd_Estado, P001Q13_A501Invd_EsPlacaPadre, P001Q13_n501Invd_EsPlacaPadre
            }
            , new Object[] {
            }
            , new Object[] {
            P001Q15_A67Invd_NumeroPlaca, P001Q15_A66Elem_Consecutivo, P001Q15_A463Invd_Estado, P001Q15_n463Invd_Estado, P001Q15_A501Invd_EsPlacaPadre, P001Q15_n501Invd_EsPlacaPadre
            }
            , new Object[] {
            }
            , new Object[] {
            P001Q17_A68Invd_PlacaPadre, P001Q17_n68Invd_PlacaPadre, P001Q17_A66Elem_Consecutivo, P001Q17_A463Invd_Estado, P001Q17_n463Invd_Estado, P001Q17_A67Invd_NumeroPlaca
            }
            , new Object[] {
            }
            , new Object[] {
            P001Q19_A67Invd_NumeroPlaca, P001Q19_A66Elem_Consecutivo, P001Q19_A463Invd_Estado, P001Q19_n463Invd_Estado, P001Q19_A501Invd_EsPlacaPadre, P001Q19_n501Invd_EsPlacaPadre
            }
            , new Object[] {
            }
            , new Object[] {
            P001Q21_A67Invd_NumeroPlaca, P001Q21_A66Elem_Consecutivo, P001Q21_A463Invd_Estado, P001Q21_n463Invd_Estado, P001Q21_A501Invd_EsPlacaPadre, P001Q21_n501Invd_EsPlacaPadre
            }
            , new Object[] {
            }
            , new Object[] {
            P001Q23_A68Invd_PlacaPadre, P001Q23_n68Invd_PlacaPadre, P001Q23_A66Elem_Consecutivo, P001Q23_A463Invd_Estado, P001Q23_n463Invd_Estado, P001Q23_A67Invd_NumeroPlaca
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV24GXLvl4 ;
   private short Gx_err ;
   private int GX_INS12 ;
   private long AV11Tran_Id ;
   private long A46Tran_Id ;
   private long A69TDet_Consecutivo ;
   private long AV10TDet_Consecutivo ;
   private long A487TDet_Cantidad ;
   private String AV12Accion ;
   private String AV13EsPlacaPadre ;
   private String AV18NuevaEsPlacaPadre ;
   private String scmdbuf ;
   private String A501Invd_EsPlacaPadre ;
   private String Gx_emsg ;
   private boolean n463Invd_Estado ;
   private boolean n68Invd_PlacaPadre ;
   private boolean returnInSub ;
   private boolean n501Invd_EsPlacaPadre ;
   private boolean n490TDet_PlacaNumero ;
   private boolean n491TDet_PlacaPadre ;
   private boolean n504TDet_Observaciones ;
   private String AV15Observaciones ;
   private String AV9Placa ;
   private String AV14NuevaPlaca ;
   private String AV16PlacaPadre ;
   private String AV19NuevaPlacaPadre ;
   private String A67Invd_NumeroPlaca ;
   private String A66Elem_Consecutivo ;
   private String A463Invd_Estado ;
   private String A68Invd_PlacaPadre ;
   private String AV8Elem_Consecutivo ;
   private String AV20TDet_PlacaNumero ;
   private String AV21TDet_PlacaPadre ;
   private String AV17TDet_EsPadre ;
   private String A490TDet_PlacaNumero ;
   private String A491TDet_PlacaPadre ;
   private String A504TDet_Observaciones ;
   private String A505TDet_EsPadre ;
   private long[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private long[] P001Q2_A46Tran_Id ;
   private long[] P001Q2_A69TDet_Consecutivo ;
   private String[] P001Q3_A67Invd_NumeroPlaca ;
   private String[] P001Q3_A66Elem_Consecutivo ;
   private String[] P001Q3_A463Invd_Estado ;
   private boolean[] P001Q3_n463Invd_Estado ;
   private String[] P001Q3_A68Invd_PlacaPadre ;
   private boolean[] P001Q3_n68Invd_PlacaPadre ;
   private String[] P001Q5_A67Invd_NumeroPlaca ;
   private String[] P001Q5_A66Elem_Consecutivo ;
   private String[] P001Q5_A463Invd_Estado ;
   private boolean[] P001Q5_n463Invd_Estado ;
   private String[] P001Q5_A501Invd_EsPlacaPadre ;
   private boolean[] P001Q5_n501Invd_EsPlacaPadre ;
   private String[] P001Q7_A68Invd_PlacaPadre ;
   private boolean[] P001Q7_n68Invd_PlacaPadre ;
   private String[] P001Q7_A66Elem_Consecutivo ;
   private String[] P001Q7_A463Invd_Estado ;
   private boolean[] P001Q7_n463Invd_Estado ;
   private String[] P001Q7_A67Invd_NumeroPlaca ;
   private String[] P001Q9_A67Invd_NumeroPlaca ;
   private String[] P001Q9_A66Elem_Consecutivo ;
   private String[] P001Q9_A463Invd_Estado ;
   private boolean[] P001Q9_n463Invd_Estado ;
   private String[] P001Q9_A68Invd_PlacaPadre ;
   private boolean[] P001Q9_n68Invd_PlacaPadre ;
   private String[] P001Q11_A67Invd_NumeroPlaca ;
   private String[] P001Q11_A66Elem_Consecutivo ;
   private String[] P001Q11_A463Invd_Estado ;
   private boolean[] P001Q11_n463Invd_Estado ;
   private String[] P001Q11_A68Invd_PlacaPadre ;
   private boolean[] P001Q11_n68Invd_PlacaPadre ;
   private String[] P001Q13_A67Invd_NumeroPlaca ;
   private String[] P001Q13_A66Elem_Consecutivo ;
   private String[] P001Q13_A463Invd_Estado ;
   private boolean[] P001Q13_n463Invd_Estado ;
   private String[] P001Q13_A501Invd_EsPlacaPadre ;
   private boolean[] P001Q13_n501Invd_EsPlacaPadre ;
   private String[] P001Q15_A67Invd_NumeroPlaca ;
   private String[] P001Q15_A66Elem_Consecutivo ;
   private String[] P001Q15_A463Invd_Estado ;
   private boolean[] P001Q15_n463Invd_Estado ;
   private String[] P001Q15_A501Invd_EsPlacaPadre ;
   private boolean[] P001Q15_n501Invd_EsPlacaPadre ;
   private String[] P001Q17_A68Invd_PlacaPadre ;
   private boolean[] P001Q17_n68Invd_PlacaPadre ;
   private String[] P001Q17_A66Elem_Consecutivo ;
   private String[] P001Q17_A463Invd_Estado ;
   private boolean[] P001Q17_n463Invd_Estado ;
   private String[] P001Q17_A67Invd_NumeroPlaca ;
   private String[] P001Q19_A67Invd_NumeroPlaca ;
   private String[] P001Q19_A66Elem_Consecutivo ;
   private String[] P001Q19_A463Invd_Estado ;
   private boolean[] P001Q19_n463Invd_Estado ;
   private String[] P001Q19_A501Invd_EsPlacaPadre ;
   private boolean[] P001Q19_n501Invd_EsPlacaPadre ;
   private String[] P001Q21_A67Invd_NumeroPlaca ;
   private String[] P001Q21_A66Elem_Consecutivo ;
   private String[] P001Q21_A463Invd_Estado ;
   private boolean[] P001Q21_n463Invd_Estado ;
   private String[] P001Q21_A501Invd_EsPlacaPadre ;
   private boolean[] P001Q21_n501Invd_EsPlacaPadre ;
   private String[] P001Q23_A68Invd_PlacaPadre ;
   private boolean[] P001Q23_n68Invd_PlacaPadre ;
   private String[] P001Q23_A66Elem_Consecutivo ;
   private String[] P001Q23_A463Invd_Estado ;
   private boolean[] P001Q23_n463Invd_Estado ;
   private String[] P001Q23_A67Invd_NumeroPlaca ;
}

final  class pcambiarplacas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001Q2", "SELECT * FROM (SELECT Tran_Id, TDet_Consecutivo FROM ALM_DETALLE_TRANSACCION WHERE Tran_Id = ? ORDER BY Tran_Id DESC, TDet_Consecutivo DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P001Q3", "SELECT Invd_NumeroPlaca, Elem_Consecutivo, Invd_Estado, Invd_PlacaPadre FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Invd_NumeroPlaca = ? ORDER BY Invd_NumeroPlaca  FOR UPDATE OF Invd_Estado, Invd_PlacaPadre NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P001Q4", "UPDATE ALM_INVENTARIO_DEVOLUTIVO SET Invd_Estado=?, Invd_PlacaPadre=?  WHERE Elem_Consecutivo = ? AND Invd_NumeroPlaca = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INVENTARIO_DEVOLUTIVO")
         ,new ForEachCursor("P001Q5", "SELECT Invd_NumeroPlaca, Elem_Consecutivo, Invd_Estado, Invd_EsPlacaPadre FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Invd_NumeroPlaca = ? ORDER BY Invd_NumeroPlaca  FOR UPDATE OF Invd_Estado, Invd_EsPlacaPadre NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P001Q6", "UPDATE ALM_INVENTARIO_DEVOLUTIVO SET Invd_Estado=?, Invd_EsPlacaPadre=?  WHERE Elem_Consecutivo = ? AND Invd_NumeroPlaca = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INVENTARIO_DEVOLUTIVO")
         ,new ForEachCursor("P001Q7", "SELECT Invd_PlacaPadre, Elem_Consecutivo, Invd_Estado, Invd_NumeroPlaca FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Invd_PlacaPadre = ? ORDER BY Elem_Consecutivo, Invd_NumeroPlaca  FOR UPDATE OF Invd_PlacaPadre, Invd_Estado NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P001Q8", "UPDATE ALM_INVENTARIO_DEVOLUTIVO SET Invd_PlacaPadre=?, Invd_Estado=?  WHERE Elem_Consecutivo = ? AND Invd_NumeroPlaca = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INVENTARIO_DEVOLUTIVO")
         ,new ForEachCursor("P001Q9", "SELECT Invd_NumeroPlaca, Elem_Consecutivo, Invd_Estado, Invd_PlacaPadre FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Invd_NumeroPlaca = ? ORDER BY Invd_NumeroPlaca  FOR UPDATE OF Invd_Estado, Invd_PlacaPadre NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P001Q10", "UPDATE ALM_INVENTARIO_DEVOLUTIVO SET Invd_Estado=?, Invd_PlacaPadre=?  WHERE Elem_Consecutivo = ? AND Invd_NumeroPlaca = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INVENTARIO_DEVOLUTIVO")
         ,new ForEachCursor("P001Q11", "SELECT Invd_NumeroPlaca, Elem_Consecutivo, Invd_Estado, Invd_PlacaPadre FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Invd_NumeroPlaca = ? ORDER BY Invd_NumeroPlaca  FOR UPDATE OF Invd_Estado, Invd_PlacaPadre NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P001Q12", "UPDATE ALM_INVENTARIO_DEVOLUTIVO SET Invd_Estado=?, Invd_PlacaPadre=?  WHERE Elem_Consecutivo = ? AND Invd_NumeroPlaca = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INVENTARIO_DEVOLUTIVO")
         ,new ForEachCursor("P001Q13", "SELECT Invd_NumeroPlaca, Elem_Consecutivo, Invd_Estado, Invd_EsPlacaPadre FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Invd_NumeroPlaca = ? ORDER BY Invd_NumeroPlaca  FOR UPDATE OF Invd_Estado, Invd_EsPlacaPadre NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P001Q14", "UPDATE ALM_INVENTARIO_DEVOLUTIVO SET Invd_Estado=?, Invd_EsPlacaPadre=?  WHERE Elem_Consecutivo = ? AND Invd_NumeroPlaca = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INVENTARIO_DEVOLUTIVO")
         ,new ForEachCursor("P001Q15", "SELECT Invd_NumeroPlaca, Elem_Consecutivo, Invd_Estado, Invd_EsPlacaPadre FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Invd_NumeroPlaca = ? ORDER BY Invd_NumeroPlaca  FOR UPDATE OF Invd_Estado, Invd_EsPlacaPadre NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P001Q16", "UPDATE ALM_INVENTARIO_DEVOLUTIVO SET Invd_Estado=?, Invd_EsPlacaPadre=?  WHERE Elem_Consecutivo = ? AND Invd_NumeroPlaca = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INVENTARIO_DEVOLUTIVO")
         ,new ForEachCursor("P001Q17", "SELECT Invd_PlacaPadre, Elem_Consecutivo, Invd_Estado, Invd_NumeroPlaca FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Invd_PlacaPadre = ? ORDER BY Elem_Consecutivo, Invd_NumeroPlaca  FOR UPDATE OF Invd_PlacaPadre, Invd_Estado NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P001Q18", "UPDATE ALM_INVENTARIO_DEVOLUTIVO SET Invd_PlacaPadre=?, Invd_Estado=?  WHERE Elem_Consecutivo = ? AND Invd_NumeroPlaca = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INVENTARIO_DEVOLUTIVO")
         ,new ForEachCursor("P001Q19", "SELECT Invd_NumeroPlaca, Elem_Consecutivo, Invd_Estado, Invd_EsPlacaPadre FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Invd_NumeroPlaca = ? ORDER BY Invd_NumeroPlaca  FOR UPDATE OF Invd_Estado, Invd_EsPlacaPadre NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P001Q20", "UPDATE ALM_INVENTARIO_DEVOLUTIVO SET Invd_Estado=?, Invd_EsPlacaPadre=?  WHERE Elem_Consecutivo = ? AND Invd_NumeroPlaca = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INVENTARIO_DEVOLUTIVO")
         ,new ForEachCursor("P001Q21", "SELECT Invd_NumeroPlaca, Elem_Consecutivo, Invd_Estado, Invd_EsPlacaPadre FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Invd_NumeroPlaca = ? ORDER BY Invd_NumeroPlaca  FOR UPDATE OF Invd_Estado, Invd_EsPlacaPadre NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P001Q22", "UPDATE ALM_INVENTARIO_DEVOLUTIVO SET Invd_Estado=?, Invd_EsPlacaPadre=?  WHERE Elem_Consecutivo = ? AND Invd_NumeroPlaca = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INVENTARIO_DEVOLUTIVO")
         ,new ForEachCursor("P001Q23", "SELECT Invd_PlacaPadre, Elem_Consecutivo, Invd_Estado, Invd_NumeroPlaca FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Invd_PlacaPadre = ? ORDER BY Elem_Consecutivo, Invd_NumeroPlaca  FOR UPDATE OF Invd_PlacaPadre, Invd_Estado NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P001Q24", "UPDATE ALM_INVENTARIO_DEVOLUTIVO SET Invd_PlacaPadre=?, Invd_Estado=?  WHERE Elem_Consecutivo = ? AND Invd_NumeroPlaca = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INVENTARIO_DEVOLUTIVO")
         ,new UpdateCursor("P001Q25", "INSERT INTO ALM_DETALLE_TRANSACCION(Tran_Id, TDet_Consecutivo, Elem_Consecutivo, TDet_Cantidad, TDet_PlacaNumero, TDet_Observaciones, TDet_PlacaPadre, TDet_EsPadre, TDet_ValorUnitario, TDet_ValorTotal, TDet_Atributos, TDet_Valor_Presente, TDet_Valor_Futuro, TDet_Taza, TDet_Plazo_N, TDet_Otros_Costos, TDet_Agrupado, TDet_PlacaRecuperada) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_DETALLE_TRANSACCION")
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 2) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 2) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 2) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 2) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 2) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
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
               stmt.setVarchar(1, (String)parms[0], 30);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 30);
               }
               stmt.setVarchar(3, (String)parms[4], 9, false);
               stmt.setVarchar(4, (String)parms[5], 30, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 30);
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 2);
               }
               stmt.setVarchar(3, (String)parms[4], 9, false);
               stmt.setVarchar(4, (String)parms[5], 30, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 30);
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 30);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 1);
               }
               stmt.setVarchar(3, (String)parms[4], 9, false);
               stmt.setVarchar(4, (String)parms[5], 30, false);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 30);
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 30);
               }
               stmt.setVarchar(3, (String)parms[4], 9, false);
               stmt.setVarchar(4, (String)parms[5], 30, false);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 30);
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 30);
               }
               stmt.setVarchar(3, (String)parms[4], 9, false);
               stmt.setVarchar(4, (String)parms[5], 30, false);
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 30);
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 2);
               }
               stmt.setVarchar(3, (String)parms[4], 9, false);
               stmt.setVarchar(4, (String)parms[5], 30, false);
               return;
            case 13 :
               stmt.setVarchar(1, (String)parms[0], 30);
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 2);
               }
               stmt.setVarchar(3, (String)parms[4], 9, false);
               stmt.setVarchar(4, (String)parms[5], 30, false);
               return;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 30);
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 30);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 1);
               }
               stmt.setVarchar(3, (String)parms[4], 9, false);
               stmt.setVarchar(4, (String)parms[5], 30, false);
               return;
            case 17 :
               stmt.setVarchar(1, (String)parms[0], 30);
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 2);
               }
               stmt.setVarchar(3, (String)parms[4], 9, false);
               stmt.setVarchar(4, (String)parms[5], 30, false);
               return;
            case 19 :
               stmt.setVarchar(1, (String)parms[0], 30);
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 2);
               }
               stmt.setVarchar(3, (String)parms[4], 9, false);
               stmt.setVarchar(4, (String)parms[5], 30, false);
               return;
            case 21 :
               stmt.setVarchar(1, (String)parms[0], 30);
               return;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 30);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 1);
               }
               stmt.setVarchar(3, (String)parms[4], 9, false);
               stmt.setVarchar(4, (String)parms[5], 30, false);
               return;
            case 23 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               stmt.setVarchar(3, (String)parms[2], 9, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[5], 30);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[7], 200);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[9], 30);
               }
               stmt.setVarchar(8, (String)parms[10], 2, false);
               return;
      }
   }

}

