/*
               File: PEntraDevo
        Description: PEntra Devolutivo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:1.15
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pentradevo extends GXProcedure
{
   public pentradevo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pentradevo.class ), "" );
   }

   public pentradevo( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( com.orions2.SdtSDTDetalleTrn[] aP0 )
   {
      pentradevo.this.AV9SDTDetalleTrn = aP0[0];
      this.aP0 = aP0;
      pentradevo.this.AV11Tran_TipoEntra = aP1[0];
      this.aP1 = aP1;
      pentradevo.this.aP1 = new String[] {""};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( com.orions2.SdtSDTDetalleTrn[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( com.orions2.SdtSDTDetalleTrn[] aP0 ,
                             String[] aP1 )
   {
      pentradevo.this.AV9SDTDetalleTrn = aP0[0];
      this.aP0 = aP0;
      pentradevo.this.AV11Tran_TipoEntra = aP1[0];
      this.aP1 = aP1;
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
      /* Execute user subroutine: 'AGREGAR' */
      S121 ();
      if (returnInSub) return;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "pentradevo");
      /* Execute user subroutine: 'ACTUALIZATRANSACCION' */
      S131 ();
      if (returnInSub) return;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "pentradevo");
      /* Execute user subroutine: 'REPOSICION' */
      S141 ();
      if (returnInSub) return;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "pentradevo");
   }

   public void S121( )
   {
      /* 'AGREGAR' Routine */
      /*
         INSERT RECORD ON TABLE ALM_DETALLE_TRANSACCION

      */
      A46Tran_Id = AV9SDTDetalleTrn.getgxTv_SdtSDTDetalleTrn_Tran_id() ;
      A69TDet_Consecutivo = AV9SDTDetalleTrn.getgxTv_SdtSDTDetalleTrn_Tdet_consecutivo() ;
      A66Elem_Consecutivo = AV9SDTDetalleTrn.getgxTv_SdtSDTDetalleTrn_Elem_consecutivo() ;
      A487TDet_Cantidad = AV9SDTDetalleTrn.getgxTv_SdtSDTDetalleTrn_Tdet_cantidad() ;
      A488TDet_ValorUnitario = AV9SDTDetalleTrn.getgxTv_SdtSDTDetalleTrn_Tdet_valorunitario() ;
      A489TDet_ValorTotal = AV9SDTDetalleTrn.getgxTv_SdtSDTDetalleTrn_Tdet_valortotal() ;
      A490TDet_PlacaNumero = AV9SDTDetalleTrn.getgxTv_SdtSDTDetalleTrn_Tdet_placanumero() ;
      n490TDet_PlacaNumero = false ;
      A491TDet_PlacaPadre = AV9SDTDetalleTrn.getgxTv_SdtSDTDetalleTrn_Tdet_placapadre() ;
      n491TDet_PlacaPadre = false ;
      A505TDet_EsPadre = AV9SDTDetalleTrn.getgxTv_SdtSDTDetalleTrn_Tdet_espadre() ;
      A525TDet_Atributos = AV9SDTDetalleTrn.getgxTv_SdtSDTDetalleTrn_Tdet_atributos() ;
      A653TDet_Valor_Presente = AV9SDTDetalleTrn.getgxTv_SdtSDTDetalleTrn_Tdet_valor_presente() ;
      n653TDet_Valor_Presente = false ;
      A654TDet_Valor_Futuro = AV9SDTDetalleTrn.getgxTv_SdtSDTDetalleTrn_Tdet_valor_futuro() ;
      n654TDet_Valor_Futuro = false ;
      A655TDet_Taza = AV9SDTDetalleTrn.getgxTv_SdtSDTDetalleTrn_Tdet_taza() ;
      n655TDet_Taza = false ;
      A656TDet_Plazo_N = AV9SDTDetalleTrn.getgxTv_SdtSDTDetalleTrn_Tdet_plazo_n() ;
      n656TDet_Plazo_N = false ;
      A657TDet_Otros_Costos = AV9SDTDetalleTrn.getgxTv_SdtSDTDetalleTrn_Tdet_otros_costos() ;
      n657TDet_Otros_Costos = false ;
      A658TDet_Agrupado = AV9SDTDetalleTrn.getgxTv_SdtSDTDetalleTrn_Tdet_agrupado() ;
      n658TDet_Agrupado = false ;
      A817TDet_PlacaRecuperada = AV9SDTDetalleTrn.getgxTv_SdtSDTDetalleTrn_Tdet_placarecuperada() ;
      n817TDet_PlacaRecuperada = false ;
      /* Using cursor P001B2 */
      pr_default.execute(0, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo), A66Elem_Consecutivo, new Long(A487TDet_Cantidad), A488TDet_ValorUnitario, A489TDet_ValorTotal, new Boolean(n490TDet_PlacaNumero), A490TDet_PlacaNumero, new Boolean(n491TDet_PlacaPadre), A491TDet_PlacaPadre, A505TDet_EsPadre, A525TDet_Atributos, new Boolean(n653TDet_Valor_Presente), A653TDet_Valor_Presente, new Boolean(n654TDet_Valor_Futuro), A654TDet_Valor_Futuro, new Boolean(n655TDet_Taza), new Short(A655TDet_Taza), new Boolean(n656TDet_Plazo_N), new Byte(A656TDet_Plazo_N), new Boolean(n657TDet_Otros_Costos), A657TDet_Otros_Costos, new Boolean(n658TDet_Agrupado), new Short(A658TDet_Agrupado), new Boolean(n817TDet_PlacaRecuperada), A817TDet_PlacaRecuperada});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCION") ;
      if ( (pr_default.getStatus(0) == 1) )
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

   public void S131( )
   {
      /* 'ACTUALIZATRANSACCION' Routine */
      /* Optimized group. */
      /* Using cursor P001B3 */
      pr_default.execute(1, new Object[] {new Long(AV9SDTDetalleTrn.getgxTv_SdtSDTDetalleTrn_Tran_id())});
      c489TDet_ValorTotal = P001B3_A489TDet_ValorTotal[0] ;
      pr_default.close(1);
      AV10TDet_ValorTotal = AV10TDet_ValorTotal.add(c489TDet_ValorTotal) ;
      /* End optimized group. */
      /* Optimized UPDATE. */
      /* Using cursor P001B4 */
      pr_default.execute(2, new Object[] {new Boolean(n527Tran_TipoEntra), AV11Tran_TipoEntra, new Boolean(n483Tran_ValorTransaccion), AV10TDet_ValorTotal, new Long(AV9SDTDetalleTrn.getgxTv_SdtSDTDetalleTrn_Tran_id())});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
      /* End optimized UPDATE. */
   }

   public void S141( )
   {
      /* 'REPOSICION' Routine */
      AV8PlacaRecuperada = AV9SDTDetalleTrn.getgxTv_SdtSDTDetalleTrn_Tdet_placarecuperada() ;
      if ( GXutil.strcmp(AV8PlacaRecuperada, "") != 0 )
      {
         /* Optimized UPDATE. */
         /* Using cursor P001B5 */
         pr_default.execute(3, new Object[] {AV8PlacaRecuperada});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
         /* End optimized UPDATE. */
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pentradevo.this.AV9SDTDetalleTrn;
      this.aP1[0] = pentradevo.this.AV11Tran_TipoEntra;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "pentradevo");
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A66Elem_Consecutivo = "" ;
      A488TDet_ValorUnitario = DecimalUtil.ZERO ;
      A489TDet_ValorTotal = DecimalUtil.ZERO ;
      A490TDet_PlacaNumero = "" ;
      A491TDet_PlacaPadre = "" ;
      A505TDet_EsPadre = "" ;
      A525TDet_Atributos = "" ;
      A653TDet_Valor_Presente = DecimalUtil.ZERO ;
      A654TDet_Valor_Futuro = DecimalUtil.ZERO ;
      A657TDet_Otros_Costos = DecimalUtil.ZERO ;
      A817TDet_PlacaRecuperada = "" ;
      Gx_emsg = "" ;
      c489TDet_ValorTotal = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P001B3_A489TDet_ValorTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV10TDet_ValorTotal = DecimalUtil.ZERO ;
      A527Tran_TipoEntra = "" ;
      A483Tran_ValorTransaccion = DecimalUtil.ZERO ;
      AV8PlacaRecuperada = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.pentradevo__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P001B3_A489TDet_ValorTotal
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

   private byte A656TDet_Plazo_N ;
   private short A655TDet_Taza ;
   private short A658TDet_Agrupado ;
   private short Gx_err ;
   private int GX_INS12 ;
   private long A46Tran_Id ;
   private long A69TDet_Consecutivo ;
   private long A487TDet_Cantidad ;
   private java.math.BigDecimal A488TDet_ValorUnitario ;
   private java.math.BigDecimal A489TDet_ValorTotal ;
   private java.math.BigDecimal A653TDet_Valor_Presente ;
   private java.math.BigDecimal A654TDet_Valor_Futuro ;
   private java.math.BigDecimal A657TDet_Otros_Costos ;
   private java.math.BigDecimal c489TDet_ValorTotal ;
   private java.math.BigDecimal AV10TDet_ValorTotal ;
   private java.math.BigDecimal A483Tran_ValorTransaccion ;
   private String AV11Tran_TipoEntra ;
   private String Gx_emsg ;
   private String scmdbuf ;
   private String A527Tran_TipoEntra ;
   private boolean returnInSub ;
   private boolean n490TDet_PlacaNumero ;
   private boolean n491TDet_PlacaPadre ;
   private boolean n653TDet_Valor_Presente ;
   private boolean n654TDet_Valor_Futuro ;
   private boolean n655TDet_Taza ;
   private boolean n656TDet_Plazo_N ;
   private boolean n657TDet_Otros_Costos ;
   private boolean n658TDet_Agrupado ;
   private boolean n817TDet_PlacaRecuperada ;
   private boolean n527Tran_TipoEntra ;
   private boolean n483Tran_ValorTransaccion ;
   private String A66Elem_Consecutivo ;
   private String A490TDet_PlacaNumero ;
   private String A491TDet_PlacaPadre ;
   private String A505TDet_EsPadre ;
   private String A525TDet_Atributos ;
   private String A817TDet_PlacaRecuperada ;
   private String AV8PlacaRecuperada ;
   private com.orions2.SdtSDTDetalleTrn[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P001B3_A489TDet_ValorTotal ;
   private com.orions2.SdtSDTDetalleTrn AV9SDTDetalleTrn ;
}

final  class pentradevo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P001B2", "INSERT INTO ALM_DETALLE_TRANSACCION(Tran_Id, TDet_Consecutivo, Elem_Consecutivo, TDet_Cantidad, TDet_ValorUnitario, TDet_ValorTotal, TDet_PlacaNumero, TDet_PlacaPadre, TDet_EsPadre, TDet_Atributos, TDet_Valor_Presente, TDet_Valor_Futuro, TDet_Taza, TDet_Plazo_N, TDet_Otros_Costos, TDet_Agrupado, TDet_PlacaRecuperada, TDet_Observaciones) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_DETALLE_TRANSACCION")
         ,new ForEachCursor("P001B3", "SELECT SUM(TDet_ValorTotal) FROM ALM_DETALLE_TRANSACCION WHERE Tran_Id = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P001B4", "UPDATE ALM_TRANSACCION SET Tran_TipoEntra=?, Tran_ValorTransaccion=?  WHERE Tran_Id = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_TRANSACCION")
         ,new UpdateCursor("P001B5", "UPDATE ALM_INVENTARIO_DEVOLUTIVO SET Invd_Estado='P'  WHERE Invd_NumeroPlaca = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INVENTARIO_DEVOLUTIVO")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
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
               stmt.setVarchar(3, (String)parms[2], 9, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[7], 30);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[9], 30);
               }
               stmt.setVarchar(9, (String)parms[10], 2, false);
               stmt.setVarchar(10, (String)parms[11], 2, false);
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(14, ((Number) parms[19]).byteValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[23]).shortValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[25], 30);
               }
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 4);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               stmt.setLong(3, ((Number) parms[4]).longValue());
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 30);
               return;
      }
   }

}

