/*
               File: PCAL_BIEN_ADM
        Description: CALCULO BIEN EN ADMINISTRACION
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:3.17
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcal_bien_adm extends GXProcedure
{
   public pcal_bien_adm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcal_bien_adm.class ), "" );
   }

   public pcal_bien_adm( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public boolean executeUdp( String aP0 ,
                              java.math.BigDecimal aP1 )
   {
      pcal_bien_adm.this.AV11pTpmo_Codigo = aP0;
      pcal_bien_adm.this.AV17pValorBien = aP1;
      pcal_bien_adm.this.aP2 = aP2;
      pcal_bien_adm.this.aP2 = new boolean[] {false};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( String aP0 ,
                        java.math.BigDecimal aP1 ,
                        boolean[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             java.math.BigDecimal aP1 ,
                             boolean[] aP2 )
   {
      pcal_bien_adm.this.AV11pTpmo_Codigo = aP0;
      pcal_bien_adm.this.AV17pValorBien = aP1;
      pcal_bien_adm.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: 'BUSCARAMBIENTE' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'BUSCARPARAMETROS' */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'BUSCARTIPOMOVIMIENTO' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'VALIDARCONDICION' */
      S141 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'BUSCARAMBIENTE' Routine */
      /* Using cursor P001K2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A208Para_Nombre = P001K2_A208Para_Nombre[0] ;
         A209Para_Valor = P001K2_A209Para_Valor[0] ;
         A20Para_Id = P001K2_A20Para_Id[0] ;
         AV8Ambiente = A209Para_Valor ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S121( )
   {
      /* 'BUSCARPARAMETROS' Routine */
      /* Using cursor P001K3 */
      pr_default.execute(1, new Object[] {AV8Ambiente});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A210Para_Ambiente = P001K3_A210Para_Ambiente[0] ;
         A208Para_Nombre = P001K3_A208Para_Nombre[0] ;
         A209Para_Valor = P001K3_A209Para_Valor[0] ;
         A20Para_Id = P001K3_A20Para_Id[0] ;
         if ( GXutil.strcmp(A208Para_Nombre, "VALOR UVT") == 0 )
         {
            AV16ValorUVT = DecimalUtil.doubleToDec(GXutil.val( A209Para_Valor, ".")) ;
         }
         else if ( GXutil.strcmp(A208Para_Nombre, "NUMERO UVT") == 0 )
         {
            AV9NumeroUVT = (short)(GXutil.lval( A209Para_Valor)) ;
         }
         else if ( GXutil.strcmp(A208Para_Nombre, "VALOR SMMLV") == 0 )
         {
            AV15ValorSMMLV = DecimalUtil.doubleToDec(GXutil.val( A209Para_Valor, ".")) ;
         }
         else if ( GXutil.strcmp(A208Para_Nombre, "CALCULA UVT") == 0 )
         {
            AV12SWCalculo = A209Para_Valor ;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S131( )
   {
      /* 'BUSCARTIPOMOVIMIENTO' Routine */
      /* Using cursor P001K4 */
      pr_default.execute(2, new Object[] {AV11pTpmo_Codigo});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A38Tpmo_Codigo = P001K4_A38Tpmo_Codigo[0] ;
         A633Tpmo_Controlado = P001K4_A633Tpmo_Controlado[0] ;
         n633Tpmo_Controlado = P001K4_n633Tpmo_Controlado[0] ;
         AV13Tpmo_Controlado = A633Tpmo_Controlado ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void S141( )
   {
      /* 'VALIDARCONDICION' Routine */
      if ( GXutil.strcmp(AV13Tpmo_Controlado, "SI") == 0 )
      {
         if ( GXutil.strcmp(AV12SWCalculo, "NO") == 0 )
         {
            AV14ValorControlado = AV15ValorSMMLV.divide(DecimalUtil.doubleToDec(2), 18, java.math.BigDecimal.ROUND_DOWN) ;
         }
         else
         {
            AV14ValorControlado = AV16ValorUVT.multiply(DecimalUtil.doubleToDec(AV9NumeroUVT)) ;
         }
         if ( DecimalUtil.compareTo(AV17pValorBien, AV14ValorControlado) > 0 )
         {
            AV10pRespuesta = false ;
         }
         else
         {
            AV10pRespuesta = true ;
         }
      }
      else
      {
         if ( GXutil.strcmp(AV12SWCalculo, "NO") == 0 )
         {
            AV14ValorControlado = AV15ValorSMMLV.divide(DecimalUtil.doubleToDec(2), 18, java.math.BigDecimal.ROUND_DOWN) ;
         }
         else
         {
            AV14ValorControlado = AV16ValorUVT.multiply(DecimalUtil.doubleToDec(AV9NumeroUVT)) ;
         }
         if ( DecimalUtil.compareTo(AV17pValorBien, AV14ValorControlado) <= 0 )
         {
            AV10pRespuesta = false ;
         }
         else
         {
            AV10pRespuesta = true ;
         }
      }
   }

   protected void cleanup( )
   {
      this.aP2[0] = pcal_bien_adm.this.AV10pRespuesta;
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
      P001K2_A208Para_Nombre = new String[] {""} ;
      P001K2_A209Para_Valor = new String[] {""} ;
      P001K2_A20Para_Id = new long[1] ;
      A208Para_Nombre = "" ;
      A209Para_Valor = "" ;
      AV8Ambiente = "" ;
      P001K3_A210Para_Ambiente = new String[] {""} ;
      P001K3_A208Para_Nombre = new String[] {""} ;
      P001K3_A209Para_Valor = new String[] {""} ;
      P001K3_A20Para_Id = new long[1] ;
      A210Para_Ambiente = "" ;
      AV16ValorUVT = DecimalUtil.ZERO ;
      AV15ValorSMMLV = DecimalUtil.ZERO ;
      AV12SWCalculo = "" ;
      P001K4_A38Tpmo_Codigo = new String[] {""} ;
      P001K4_A633Tpmo_Controlado = new String[] {""} ;
      P001K4_n633Tpmo_Controlado = new boolean[] {false} ;
      A38Tpmo_Codigo = "" ;
      A633Tpmo_Controlado = "" ;
      AV13Tpmo_Controlado = "" ;
      AV14ValorControlado = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.pcal_bien_adm__default(),
         new Object[] {
             new Object[] {
            P001K2_A208Para_Nombre, P001K2_A209Para_Valor, P001K2_A20Para_Id
            }
            , new Object[] {
            P001K3_A210Para_Ambiente, P001K3_A208Para_Nombre, P001K3_A209Para_Valor, P001K3_A20Para_Id
            }
            , new Object[] {
            P001K4_A38Tpmo_Codigo, P001K4_A633Tpmo_Controlado, P001K4_n633Tpmo_Controlado
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV9NumeroUVT ;
   private short Gx_err ;
   private long A20Para_Id ;
   private java.math.BigDecimal AV17pValorBien ;
   private java.math.BigDecimal AV16ValorUVT ;
   private java.math.BigDecimal AV15ValorSMMLV ;
   private java.math.BigDecimal AV14ValorControlado ;
   private String scmdbuf ;
   private boolean AV10pRespuesta ;
   private boolean returnInSub ;
   private boolean n633Tpmo_Controlado ;
   private String AV11pTpmo_Codigo ;
   private String A208Para_Nombre ;
   private String A209Para_Valor ;
   private String AV8Ambiente ;
   private String A210Para_Ambiente ;
   private String AV12SWCalculo ;
   private String A38Tpmo_Codigo ;
   private String A633Tpmo_Controlado ;
   private String AV13Tpmo_Controlado ;
   private boolean[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P001K2_A208Para_Nombre ;
   private String[] P001K2_A209Para_Valor ;
   private long[] P001K2_A20Para_Id ;
   private String[] P001K3_A210Para_Ambiente ;
   private String[] P001K3_A208Para_Nombre ;
   private String[] P001K3_A209Para_Valor ;
   private long[] P001K3_A20Para_Id ;
   private String[] P001K4_A38Tpmo_Codigo ;
   private String[] P001K4_A633Tpmo_Controlado ;
   private boolean[] P001K4_n633Tpmo_Controlado ;
}

final  class pcal_bien_adm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001K2", "SELECT Para_Nombre, Para_Valor, Para_Id FROM SEG_PARAMETROS WHERE Para_Nombre = 'AMBIENTE' ORDER BY Para_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001K3", "SELECT Para_Ambiente, Para_Nombre, Para_Valor, Para_Id FROM SEG_PARAMETROS WHERE Para_Ambiente = ? ORDER BY Para_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001K4", "SELECT Tpmo_Codigo, Tpmo_Controlado FROM ALM_TIPO_MOVIMIENTO WHERE Tpmo_Codigo = ? ORDER BY Tpmo_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 3);
               return;
      }
   }

}

