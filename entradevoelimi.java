/*
               File: EntraDevoElimi
        Description: Entrada Devolutivo Eliminar
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:4.23
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class entradevoelimi extends GXProcedure
{
   public entradevoelimi( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradevoelimi.class ), "" );
   }

   public entradevoelimi( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( short aP0 ,
                             long[] aP1 ,
                             String aP2 ,
                             long[] aP3 ,
                             short[] aP4 )
   {
      entradevoelimi.this.AV9SWEliminar = aP0;
      entradevoelimi.this.AV8Tran_Id = aP1[0];
      this.aP1 = aP1;
      entradevoelimi.this.AV10TDet_CodigoBien = aP2;
      entradevoelimi.this.AV11TDet_Consecutivo = aP3[0];
      this.aP3 = aP3;
      entradevoelimi.this.AV13TDet_Agrupado = aP4[0];
      this.aP4 = aP4;
      entradevoelimi.this.AV14TDet_PlacaRecuperada = aP5[0];
      this.aP5 = aP5;
      entradevoelimi.this.aP5 = new String[] {""};
      initialize();
      privateExecute();
      return aP5[0];
   }

   public void execute( short aP0 ,
                        long[] aP1 ,
                        String aP2 ,
                        long[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( short aP0 ,
                             long[] aP1 ,
                             String aP2 ,
                             long[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      entradevoelimi.this.AV9SWEliminar = aP0;
      entradevoelimi.this.AV8Tran_Id = aP1[0];
      this.aP1 = aP1;
      entradevoelimi.this.AV10TDet_CodigoBien = aP2;
      entradevoelimi.this.AV11TDet_Consecutivo = aP3[0];
      this.aP3 = aP3;
      entradevoelimi.this.AV13TDet_Agrupado = aP4[0];
      this.aP4 = aP4;
      entradevoelimi.this.AV14TDet_PlacaRecuperada = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: 'RECUPERACION' */
      S191 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV9SWEliminar == 1 )
      {
         /* Execute user subroutine: 'BUSCARDETALLEULEP' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'ELIMARDETALLEULEP' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'ACTUALIZARTRANSACCION' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( AV9SWEliminar == 2 )
      {
         /* Using cursor P001M2 */
         pr_default.execute(0, new Object[] {new Long(AV8Tran_Id), AV10TDet_CodigoBien, new Short(AV13TDet_Agrupado)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A658TDet_Agrupado = P001M2_A658TDet_Agrupado[0] ;
            n658TDet_Agrupado = P001M2_n658TDet_Agrupado[0] ;
            A66Elem_Consecutivo = P001M2_A66Elem_Consecutivo[0] ;
            A46Tran_Id = P001M2_A46Tran_Id[0] ;
            A69TDet_Consecutivo = P001M2_A69TDet_Consecutivo[0] ;
            AV11TDet_Consecutivo = A69TDet_Consecutivo ;
            /* Execute user subroutine: 'ELIMINARDETALLEATRIBUTOS1' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         /* Execute user subroutine: 'ELIMARDETALLE1' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'ACTUALIZARTRANSACCION' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( AV9SWEliminar == 3 )
      {
         /* Execute user subroutine: 'ELIMINARDETALLEATRIBUTOS' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'ELIMARDETALLE' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'ACTUALIZARTRANSACCION' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( ( AV9SWEliminar == 4 ) || ( AV9SWEliminar == 5 ) )
      {
         /* Execute user subroutine: 'ELIMINARDETALLEATRIBUTOS1' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'ELIMARDETALLE1' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'ACTUALIZARTRANSACCION' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'ELIMINARDETALLEATRIBUTOS' Routine */
      /* Optimized DELETE. */
      /* Using cursor P001M3 */
      pr_default.execute(1, new Object[] {new Long(AV8Tran_Id)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCIONATRIBUT") ;
      /* End optimized DELETE. */
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "entradevoelimi");
   }

   public void S121( )
   {
      /* 'ELIMARDETALLE' Routine */
      /* Optimized DELETE. */
      /* Using cursor P001M4 */
      pr_default.execute(2, new Object[] {new Long(AV8Tran_Id)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCION") ;
      /* End optimized DELETE. */
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "entradevoelimi");
   }

   public void S131( )
   {
      /* 'ELIMINARDETALLEATRIBUTOS1' Routine */
      /* Optimized DELETE. */
      /* Using cursor P001M5 */
      pr_default.execute(3, new Object[] {new Long(AV8Tran_Id), new Long(AV11TDet_Consecutivo)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCIONATRIBUT") ;
      /* End optimized DELETE. */
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "entradevoelimi");
   }

   public void S141( )
   {
      /* 'ELIMARDETALLE1' Routine */
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           new Short(AV9SWEliminar) ,
                                           A66Elem_Consecutivo ,
                                           AV10TDet_CodigoBien ,
                                           new Long(A69TDet_Consecutivo) ,
                                           new Long(AV11TDet_Consecutivo) ,
                                           new Long(AV8Tran_Id) ,
                                           new Long(A46Tran_Id) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.LONG
                                           }
      } ) ;
      /* Using cursor P001M6 */
      pr_default.execute(4, new Object[] {new Long(AV8Tran_Id), AV10TDet_CodigoBien, new Long(AV11TDet_Consecutivo)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A69TDet_Consecutivo = P001M6_A69TDet_Consecutivo[0] ;
         A66Elem_Consecutivo = P001M6_A66Elem_Consecutivo[0] ;
         A46Tran_Id = P001M6_A46Tran_Id[0] ;
         /* Using cursor P001M7 */
         pr_default.execute(5, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCION") ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "entradevoelimi");
   }

   public void S151( )
   {
      /* 'ACTUALIZARTRANSACCION' Routine */
      /* Optimized group. */
      /* Using cursor P001M8 */
      pr_default.execute(6, new Object[] {new Long(AV8Tran_Id)});
      c489TDet_ValorTotal = P001M8_A489TDet_ValorTotal[0] ;
      pr_default.close(6);
      AV12TDet_ValorTotal = AV12TDet_ValorTotal.add(c489TDet_ValorTotal) ;
      /* End optimized group. */
      /* Optimized UPDATE. */
      /* Using cursor P001M9 */
      pr_default.execute(7, new Object[] {new Boolean(n483Tran_ValorTransaccion), AV12TDet_ValorTotal, new Long(AV8Tran_Id)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
      /* End optimized UPDATE. */
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "entradevoelimi");
   }

   public void S161( )
   {
      /* 'BUSCARDETALLEULEP' Routine */
      /* Using cursor P001M10 */
      pr_default.execute(8, new Object[] {new Long(AV8Tran_Id), new Short(AV13TDet_Agrupado)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A658TDet_Agrupado = P001M10_A658TDet_Agrupado[0] ;
         n658TDet_Agrupado = P001M10_n658TDet_Agrupado[0] ;
         A46Tran_Id = P001M10_A46Tran_Id[0] ;
         A69TDet_Consecutivo = P001M10_A69TDet_Consecutivo[0] ;
         AV11TDet_Consecutivo = A69TDet_Consecutivo ;
         /* Execute user subroutine: 'ELIMINARDETALLEATRIBUTOSULEP' */
         S179 ();
         if ( returnInSub )
         {
            pr_default.close(8);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   public void S179( )
   {
      /* 'ELIMINARDETALLEATRIBUTOSULEP' Routine */
      /* Optimized DELETE. */
      /* Using cursor P001M11 */
      pr_default.execute(9, new Object[] {new Long(AV8Tran_Id), new Long(AV11TDet_Consecutivo)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCIONATRIBUT") ;
      /* End optimized DELETE. */
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "entradevoelimi");
   }

   public void S181( )
   {
      /* 'ELIMARDETALLEULEP' Routine */
      /* Optimized DELETE. */
      /* Using cursor P001M12 */
      pr_default.execute(10, new Object[] {new Long(AV8Tran_Id), new Short(AV13TDet_Agrupado)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCION") ;
      /* End optimized DELETE. */
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "entradevoelimi");
   }

   public void S191( )
   {
      /* 'RECUPERACION' Routine */
      if ( GXutil.strcmp(AV14TDet_PlacaRecuperada, "") != 0 )
      {
         /* Optimized UPDATE. */
         /* Using cursor P001M13 */
         pr_default.execute(11, new Object[] {AV14TDet_PlacaRecuperada});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
         /* End optimized UPDATE. */
      }
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "entradevoelimi");
   }

   protected void cleanup( )
   {
      this.aP1[0] = entradevoelimi.this.AV8Tran_Id;
      this.aP3[0] = entradevoelimi.this.AV11TDet_Consecutivo;
      this.aP4[0] = entradevoelimi.this.AV13TDet_Agrupado;
      this.aP5[0] = entradevoelimi.this.AV14TDet_PlacaRecuperada;
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
      P001M2_A658TDet_Agrupado = new short[1] ;
      P001M2_n658TDet_Agrupado = new boolean[] {false} ;
      P001M2_A66Elem_Consecutivo = new String[] {""} ;
      P001M2_A46Tran_Id = new long[1] ;
      P001M2_A69TDet_Consecutivo = new long[1] ;
      A66Elem_Consecutivo = "" ;
      P001M6_A69TDet_Consecutivo = new long[1] ;
      P001M6_A66Elem_Consecutivo = new String[] {""} ;
      P001M6_A46Tran_Id = new long[1] ;
      c489TDet_ValorTotal = DecimalUtil.ZERO ;
      P001M8_A489TDet_ValorTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV12TDet_ValorTotal = DecimalUtil.ZERO ;
      A483Tran_ValorTransaccion = DecimalUtil.ZERO ;
      P001M10_A658TDet_Agrupado = new short[1] ;
      P001M10_n658TDet_Agrupado = new boolean[] {false} ;
      P001M10_A46Tran_Id = new long[1] ;
      P001M10_A69TDet_Consecutivo = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.entradevoelimi__default(),
         new Object[] {
             new Object[] {
            P001M2_A658TDet_Agrupado, P001M2_n658TDet_Agrupado, P001M2_A66Elem_Consecutivo, P001M2_A46Tran_Id, P001M2_A69TDet_Consecutivo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P001M6_A69TDet_Consecutivo, P001M6_A66Elem_Consecutivo, P001M6_A46Tran_Id
            }
            , new Object[] {
            }
            , new Object[] {
            P001M8_A489TDet_ValorTotal
            }
            , new Object[] {
            }
            , new Object[] {
            P001M10_A658TDet_Agrupado, P001M10_n658TDet_Agrupado, P001M10_A46Tran_Id, P001M10_A69TDet_Consecutivo
            }
            , new Object[] {
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

   private short AV9SWEliminar ;
   private short AV13TDet_Agrupado ;
   private short A658TDet_Agrupado ;
   private short Gx_err ;
   private long AV8Tran_Id ;
   private long AV11TDet_Consecutivo ;
   private long A46Tran_Id ;
   private long A69TDet_Consecutivo ;
   private java.math.BigDecimal c489TDet_ValorTotal ;
   private java.math.BigDecimal AV12TDet_ValorTotal ;
   private java.math.BigDecimal A483Tran_ValorTransaccion ;
   private String scmdbuf ;
   private boolean returnInSub ;
   private boolean n658TDet_Agrupado ;
   private boolean n483Tran_ValorTransaccion ;
   private String AV10TDet_CodigoBien ;
   private String AV14TDet_PlacaRecuperada ;
   private String A66Elem_Consecutivo ;
   private long[] aP1 ;
   private long[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private short[] P001M2_A658TDet_Agrupado ;
   private boolean[] P001M2_n658TDet_Agrupado ;
   private String[] P001M2_A66Elem_Consecutivo ;
   private long[] P001M2_A46Tran_Id ;
   private long[] P001M2_A69TDet_Consecutivo ;
   private long[] P001M6_A69TDet_Consecutivo ;
   private String[] P001M6_A66Elem_Consecutivo ;
   private long[] P001M6_A46Tran_Id ;
   private java.math.BigDecimal[] P001M8_A489TDet_ValorTotal ;
   private short[] P001M10_A658TDet_Agrupado ;
   private boolean[] P001M10_n658TDet_Agrupado ;
   private long[] P001M10_A46Tran_Id ;
   private long[] P001M10_A69TDet_Consecutivo ;
}

final  class entradevoelimi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P001M6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          short AV9SWEliminar ,
                                          String A66Elem_Consecutivo ,
                                          String AV10TDet_CodigoBien ,
                                          long A69TDet_Consecutivo ,
                                          long AV11TDet_Consecutivo ,
                                          long AV8Tran_Id ,
                                          long A46Tran_Id )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int1 ;
      GXv_int1 = new byte [3] ;
      Object[] GXv_Object2 ;
      GXv_Object2 = new Object [2] ;
      scmdbuf = "SELECT TDet_Consecutivo, Elem_Consecutivo, Tran_Id FROM ALM_DETALLE_TRANSACCION" ;
      scmdbuf = scmdbuf + " WHERE (Tran_Id = ?)" ;
      if ( AV9SWEliminar == 2 )
      {
         sWhereString = sWhereString + " and (Elem_Consecutivo = ?)" ;
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ( AV9SWEliminar == 4 ) || ( AV9SWEliminar == 5 ) )
      {
         sWhereString = sWhereString + " and (TDet_Consecutivo = ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY Tran_Id, TDet_Consecutivo" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 4 :
                  return conditional_P001M6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , ((Number) dynConstraints[6]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001M2", "SELECT TDet_Agrupado, Elem_Consecutivo, Tran_Id, TDet_Consecutivo FROM ALM_DETALLE_TRANSACCION WHERE (Tran_Id = ? and Elem_Consecutivo = ?) AND (TDet_Agrupado = ?) ORDER BY Tran_Id, Elem_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("P001M3", "DELETE FROM ALM_DETALLE_TRANSACCIONATRIBUT  WHERE Tran_Id = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_DETALLE_TRANSACCIONATRIBUT")
         ,new UpdateCursor("P001M4", "DELETE FROM ALM_DETALLE_TRANSACCION  WHERE Tran_Id = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_DETALLE_TRANSACCION")
         ,new UpdateCursor("P001M5", "DELETE FROM ALM_DETALLE_TRANSACCIONATRIBUT  WHERE Tran_Id = ? and TDet_Consecutivo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_DETALLE_TRANSACCIONATRIBUT")
         ,new ForEachCursor("P001M6", "scmdbuf",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P001M7", "DELETE FROM ALM_DETALLE_TRANSACCION  WHERE Tran_Id = ? AND TDet_Consecutivo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_DETALLE_TRANSACCION")
         ,new ForEachCursor("P001M8", "SELECT SUM(TDet_ValorTotal) FROM ALM_DETALLE_TRANSACCION WHERE Tran_Id = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P001M9", "UPDATE ALM_TRANSACCION SET Tran_ValorTransaccion=?  WHERE Tran_Id = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_TRANSACCION")
         ,new ForEachCursor("P001M10", "SELECT TDet_Agrupado, Tran_Id, TDet_Consecutivo FROM ALM_DETALLE_TRANSACCION WHERE (Tran_Id = ?) AND (TDet_Agrupado = ?) ORDER BY Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("P001M11", "DELETE FROM ALM_DETALLE_TRANSACCIONATRIBUT  WHERE Tran_Id = ? and TDet_Consecutivo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_DETALLE_TRANSACCIONATRIBUT")
         ,new UpdateCursor("P001M12", "DELETE FROM ALM_DETALLE_TRANSACCION  WHERE (Tran_Id = ?) AND (TDet_Agrupado = ?)", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_DETALLE_TRANSACCION")
         ,new UpdateCursor("P001M13", "UPDATE ALM_INVENTARIO_DEVOLUTIVO SET Invd_Estado='R'  WHERE Invd_NumeroPlaca = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INVENTARIO_DEVOLUTIVO")
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2) ;
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx ;
      switch ( cursor )
      {
            case 0 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 9);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[3]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[4], 9);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, ((Number) parms[5]).longValue(), 0);
               }
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 7 :
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
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 30);
               return;
      }
   }

}

