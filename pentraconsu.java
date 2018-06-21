/*
               File: PEntraConsu
        Description: Entradas Consumibles
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:0.68
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pentraconsu extends GXProcedure
{
   public pentraconsu( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pentraconsu.class ), "" );
   }

   public pentraconsu( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public long executeUdp( com.orions2.SdtSDTDetalleTrn[] aP0 ,
                           String[] aP1 ,
                           long[] aP2 ,
                           short[] aP3 )
   {
      pentraconsu.this.AV8SDTDetalleTrn = aP0[0];
      this.aP0 = aP0;
      pentraconsu.this.Gx_mode = aP1[0];
      this.aP1 = aP1;
      pentraconsu.this.AV9Tran_Id = aP2[0];
      this.aP2 = aP2;
      pentraconsu.this.AV11SWError = aP3[0];
      this.aP3 = aP3;
      pentraconsu.this.AV10TDet_Consecutivo = aP4[0];
      this.aP4 = aP4;
      pentraconsu.this.aP4 = new long[] {0};
      initialize();
      privateExecute();
      return aP4[0];
   }

   public void execute( com.orions2.SdtSDTDetalleTrn[] aP0 ,
                        String[] aP1 ,
                        long[] aP2 ,
                        short[] aP3 ,
                        long[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( com.orions2.SdtSDTDetalleTrn[] aP0 ,
                             String[] aP1 ,
                             long[] aP2 ,
                             short[] aP3 ,
                             long[] aP4 )
   {
      pentraconsu.this.AV8SDTDetalleTrn = aP0[0];
      this.aP0 = aP0;
      pentraconsu.this.Gx_mode = aP1[0];
      this.aP1 = aP1;
      pentraconsu.this.AV9Tran_Id = aP2[0];
      this.aP2 = aP2;
      pentraconsu.this.AV11SWError = aP3[0];
      this.aP3 = aP3;
      pentraconsu.this.AV10TDet_Consecutivo = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: 'INICIAPROCESO' */
      S111 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'INICIAPROCESO' Routine */
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Execute user subroutine: 'CONSULTARCONSECUTIVO' */
         S121 ();
         if (returnInSub) return;
         /* Execute user subroutine: 'AGREGAR' */
         S131 ();
         if (returnInSub) return;
         /* Execute user subroutine: 'ACTUALIZATRANSACCION' */
         S141 ();
         if (returnInSub) return;
      }
      else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
      {
         /* Execute user subroutine: 'ELIMINAR' */
         S151 ();
         if (returnInSub) return;
         /* Execute user subroutine: 'ACTUALIZATRANSACCION' */
         S141 ();
         if (returnInSub) return;
      }
   }

   public void S121( )
   {
      /* 'CONSULTARCONSECUTIVO' Routine */
      AV16GXLvl16 = (byte)(0) ;
      /* Using cursor P00172 */
      pr_default.execute(0, new Object[] {new Long(AV9Tran_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A46Tran_Id = P00172_A46Tran_Id[0] ;
         A69TDet_Consecutivo = P00172_A69TDet_Consecutivo[0] ;
         AV16GXLvl16 = (byte)(1) ;
         AV10TDet_Consecutivo = (long)(A69TDet_Consecutivo+1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV16GXLvl16 == 0 )
      {
         AV10TDet_Consecutivo = 1 ;
      }
   }

   public void S131( )
   {
      /* 'AGREGAR' Routine */
      AV11SWError = (short)(0) ;
      /*
         INSERT RECORD ON TABLE ALM_DETALLE_TRANSACCION

      */
      A46Tran_Id = AV9Tran_Id ;
      A69TDet_Consecutivo = AV10TDet_Consecutivo ;
      A66Elem_Consecutivo = AV8SDTDetalleTrn.getgxTv_SdtSDTDetalleTrn_Elem_consecutivo() ;
      A487TDet_Cantidad = AV8SDTDetalleTrn.getgxTv_SdtSDTDetalleTrn_Tdet_cantidad() ;
      A488TDet_ValorUnitario = AV8SDTDetalleTrn.getgxTv_SdtSDTDetalleTrn_Tdet_valorunitario() ;
      A657TDet_Otros_Costos = AV8SDTDetalleTrn.getgxTv_SdtSDTDetalleTrn_Tdet_otros_costos() ;
      n657TDet_Otros_Costos = false ;
      A489TDet_ValorTotal = (AV8SDTDetalleTrn.getgxTv_SdtSDTDetalleTrn_Tdet_valorunitario().add(AV8SDTDetalleTrn.getgxTv_SdtSDTDetalleTrn_Tdet_otros_costos())).multiply(DecimalUtil.doubleToDec(AV8SDTDetalleTrn.getgxTv_SdtSDTDetalleTrn_Tdet_cantidad())) ;
      A505TDet_EsPadre = "NA" ;
      A525TDet_Atributos = "NO" ;
      A653TDet_Valor_Presente = DecimalUtil.ZERO ;
      n653TDet_Valor_Presente = false ;
      n653TDet_Valor_Presente = true ;
      A654TDet_Valor_Futuro = DecimalUtil.ZERO ;
      n654TDet_Valor_Futuro = false ;
      n654TDet_Valor_Futuro = true ;
      A655TDet_Taza = (short)(0) ;
      n655TDet_Taza = false ;
      n655TDet_Taza = true ;
      A656TDet_Plazo_N = (byte)(0) ;
      n656TDet_Plazo_N = false ;
      n656TDet_Plazo_N = true ;
      A658TDet_Agrupado = (short)(0) ;
      n658TDet_Agrupado = false ;
      n658TDet_Agrupado = true ;
      /* Using cursor P00173 */
      pr_default.execute(1, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo), A66Elem_Consecutivo, new Long(A487TDet_Cantidad), A488TDet_ValorUnitario, A489TDet_ValorTotal, A505TDet_EsPadre, A525TDet_Atributos, new Boolean(n653TDet_Valor_Presente), A653TDet_Valor_Presente, new Boolean(n654TDet_Valor_Futuro), A654TDet_Valor_Futuro, new Boolean(n655TDet_Taza), new Short(A655TDet_Taza), new Boolean(n656TDet_Plazo_N), new Byte(A656TDet_Plazo_N), new Boolean(n657TDet_Otros_Costos), A657TDet_Otros_Costos, new Boolean(n658TDet_Agrupado), new Short(A658TDet_Agrupado)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCION") ;
      if ( (pr_default.getStatus(1) == 1) )
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

   public void S151( )
   {
      /* 'ELIMINAR' Routine */
      /* Using cursor P00174 */
      pr_default.execute(2, new Object[] {new Long(AV9Tran_Id), AV8SDTDetalleTrn.getgxTv_SdtSDTDetalleTrn_Elem_consecutivo()});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A66Elem_Consecutivo = P00174_A66Elem_Consecutivo[0] ;
         A46Tran_Id = P00174_A46Tran_Id[0] ;
         A69TDet_Consecutivo = P00174_A69TDet_Consecutivo[0] ;
         A489TDet_ValorTotal = P00174_A489TDet_ValorTotal[0] ;
         AV10TDet_Consecutivo = A69TDet_Consecutivo ;
         AV12TDet_ValorTotal = A489TDet_ValorTotal ;
         /* Using cursor P00175 */
         pr_default.execute(3, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCION") ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S141( )
   {
      /* 'ACTUALIZATRANSACCION' Routine */
      /* Optimized group. */
      /* Using cursor P00176 */
      pr_default.execute(4, new Object[] {new Long(AV9Tran_Id)});
      c489TDet_ValorTotal = P00176_A489TDet_ValorTotal[0] ;
      pr_default.close(4);
      AV12TDet_ValorTotal = AV12TDet_ValorTotal.add(c489TDet_ValorTotal) ;
      /* End optimized group. */
      /* Optimized UPDATE. */
      /* Using cursor P00177 */
      pr_default.execute(5, new Object[] {new Boolean(n483Tran_ValorTransaccion), AV12TDet_ValorTotal, new Long(AV9Tran_Id)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
      /* End optimized UPDATE. */
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "pentraconsu");
   }

   protected void cleanup( )
   {
      this.aP0[0] = pentraconsu.this.AV8SDTDetalleTrn;
      this.aP1[0] = pentraconsu.this.Gx_mode;
      this.aP2[0] = pentraconsu.this.AV9Tran_Id;
      this.aP3[0] = pentraconsu.this.AV11SWError;
      this.aP4[0] = pentraconsu.this.AV10TDet_Consecutivo;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "pentraconsu");
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
      P00172_A46Tran_Id = new long[1] ;
      P00172_A69TDet_Consecutivo = new long[1] ;
      A653TDet_Valor_Presente = DecimalUtil.ZERO ;
      A654TDet_Valor_Futuro = DecimalUtil.ZERO ;
      A66Elem_Consecutivo = "" ;
      A488TDet_ValorUnitario = DecimalUtil.ZERO ;
      A657TDet_Otros_Costos = DecimalUtil.ZERO ;
      A489TDet_ValorTotal = DecimalUtil.ZERO ;
      A505TDet_EsPadre = "" ;
      A525TDet_Atributos = "" ;
      Gx_emsg = "" ;
      P00174_A66Elem_Consecutivo = new String[] {""} ;
      P00174_A46Tran_Id = new long[1] ;
      P00174_A69TDet_Consecutivo = new long[1] ;
      P00174_A489TDet_ValorTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV12TDet_ValorTotal = DecimalUtil.ZERO ;
      c489TDet_ValorTotal = DecimalUtil.ZERO ;
      P00176_A489TDet_ValorTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A483Tran_ValorTransaccion = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.pentraconsu__default(),
         new Object[] {
             new Object[] {
            P00172_A46Tran_Id, P00172_A69TDet_Consecutivo
            }
            , new Object[] {
            }
            , new Object[] {
            P00174_A66Elem_Consecutivo, P00174_A46Tran_Id, P00174_A69TDet_Consecutivo, P00174_A489TDet_ValorTotal
            }
            , new Object[] {
            }
            , new Object[] {
            P00176_A489TDet_ValorTotal
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16GXLvl16 ;
   private byte A656TDet_Plazo_N ;
   private short AV11SWError ;
   private short A655TDet_Taza ;
   private short A658TDet_Agrupado ;
   private short Gx_err ;
   private int GX_INS12 ;
   private long AV9Tran_Id ;
   private long AV10TDet_Consecutivo ;
   private long A69TDet_Consecutivo ;
   private long A46Tran_Id ;
   private long A487TDet_Cantidad ;
   private java.math.BigDecimal A653TDet_Valor_Presente ;
   private java.math.BigDecimal A654TDet_Valor_Futuro ;
   private java.math.BigDecimal A488TDet_ValorUnitario ;
   private java.math.BigDecimal A657TDet_Otros_Costos ;
   private java.math.BigDecimal A489TDet_ValorTotal ;
   private java.math.BigDecimal AV12TDet_ValorTotal ;
   private java.math.BigDecimal c489TDet_ValorTotal ;
   private java.math.BigDecimal A483Tran_ValorTransaccion ;
   private String Gx_mode ;
   private String scmdbuf ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n657TDet_Otros_Costos ;
   private boolean n653TDet_Valor_Presente ;
   private boolean n654TDet_Valor_Futuro ;
   private boolean n655TDet_Taza ;
   private boolean n656TDet_Plazo_N ;
   private boolean n658TDet_Agrupado ;
   private boolean n483Tran_ValorTransaccion ;
   private String A66Elem_Consecutivo ;
   private String A505TDet_EsPadre ;
   private String A525TDet_Atributos ;
   private com.orions2.SdtSDTDetalleTrn[] aP0 ;
   private String[] aP1 ;
   private long[] aP2 ;
   private short[] aP3 ;
   private long[] aP4 ;
   private IDataStoreProvider pr_default ;
   private long[] P00172_A46Tran_Id ;
   private long[] P00172_A69TDet_Consecutivo ;
   private String[] P00174_A66Elem_Consecutivo ;
   private long[] P00174_A46Tran_Id ;
   private long[] P00174_A69TDet_Consecutivo ;
   private java.math.BigDecimal[] P00174_A489TDet_ValorTotal ;
   private java.math.BigDecimal[] P00176_A489TDet_ValorTotal ;
   private com.orions2.SdtSDTDetalleTrn AV8SDTDetalleTrn ;
}

final  class pentraconsu__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00172", "SELECT * FROM (SELECT Tran_Id, TDet_Consecutivo FROM ALM_DETALLE_TRANSACCION WHERE Tran_Id = ? ORDER BY Tran_Id DESC, TDet_Consecutivo DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P00173", "INSERT INTO ALM_DETALLE_TRANSACCION(Tran_Id, TDet_Consecutivo, Elem_Consecutivo, TDet_Cantidad, TDet_ValorUnitario, TDet_ValorTotal, TDet_EsPadre, TDet_Atributos, TDet_Valor_Presente, TDet_Valor_Futuro, TDet_Taza, TDet_Plazo_N, TDet_Otros_Costos, TDet_Agrupado, TDet_PlacaNumero, TDet_Observaciones, TDet_PlacaPadre, TDet_PlacaRecuperada) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_DETALLE_TRANSACCION")
         ,new ForEachCursor("P00174", "SELECT Elem_Consecutivo, Tran_Id, TDet_Consecutivo, TDet_ValorTotal FROM ALM_DETALLE_TRANSACCION WHERE Tran_Id = ? and Elem_Consecutivo = ? ORDER BY Tran_Id, Elem_Consecutivo  FOR UPDATE OF TDet_Consecutivo NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P00175", "DELETE FROM ALM_DETALLE_TRANSACCION  WHERE Tran_Id = ? AND TDet_Consecutivo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_DETALLE_TRANSACCION")
         ,new ForEachCursor("P00176", "SELECT SUM(TDet_ValorTotal) FROM ALM_DETALLE_TRANSACCION WHERE Tran_Id = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P00177", "UPDATE ALM_TRANSACCION SET Tran_ValorTransaccion=?  WHERE Tran_Id = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_TRANSACCION")
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
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2) ;
               return;
            case 4 :
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
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               stmt.setVarchar(3, (String)parms[2], 9, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setVarchar(7, (String)parms[6], 2, false);
               stmt.setVarchar(8, (String)parms[7], 2, false);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[19]).shortValue());
               }
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 9);
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
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

