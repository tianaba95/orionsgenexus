/*
               File: EliminaTrn
        Description: Elimina Trn
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:11.92
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class eliminatrn extends GXProcedure
{
   public eliminatrn( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( eliminatrn.class ), "" );
   }

   public eliminatrn( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      eliminatrn.this.AV8Tran_Id = aP0[0];
      this.aP0 = aP0;
      eliminatrn.this.AV10Usuario = aP1[0];
      this.aP1 = aP1;
      eliminatrn.this.AV11Tran_Estado = aP2[0];
      this.aP2 = aP2;
      eliminatrn.this.AV12ObservacionAnular = aP3[0];
      this.aP3 = aP3;
      eliminatrn.this.aP3 = new String[] {""};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( long[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( long[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      eliminatrn.this.AV8Tran_Id = aP0[0];
      this.aP0 = aP0;
      eliminatrn.this.AV10Usuario = aP1[0];
      this.aP1 = aP1;
      eliminatrn.this.AV11Tran_Estado = aP2[0];
      this.aP2 = aP2;
      eliminatrn.this.AV12ObservacionAnular = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00272 */
      pr_default.execute(0, new Object[] {new Long(AV8Tran_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A46Tran_Id = P00272_A46Tran_Id[0] ;
         A58Tran_Estado = P00272_A58Tran_Estado[0] ;
         n58Tran_Estado = P00272_n58Tran_Estado[0] ;
         A668Tran_UsuarioEliminaoAnula = P00272_A668Tran_UsuarioEliminaoAnula[0] ;
         n668Tran_UsuarioEliminaoAnula = P00272_n668Tran_UsuarioEliminaoAnula[0] ;
         A669Tran_FechaEliminaoAnula = P00272_A669Tran_FechaEliminaoAnula[0] ;
         n669Tran_FechaEliminaoAnula = P00272_n669Tran_FechaEliminaoAnula[0] ;
         A670Tran_ObservacionesAnula = P00272_A670Tran_ObservacionesAnula[0] ;
         n670Tran_ObservacionesAnula = P00272_n670Tran_ObservacionesAnula[0] ;
         A57Tran_RegionId = P00272_A57Tran_RegionId[0] ;
         n57Tran_RegionId = P00272_n57Tran_RegionId[0] ;
         A48Tran_CentroCostoId = P00272_A48Tran_CentroCostoId[0] ;
         A110Tran_ModuloOrigen = P00272_A110Tran_ModuloOrigen[0] ;
         A109Tran_CodAlmaOrigen = P00272_A109Tran_CodAlmaOrigen[0] ;
         A112Tran_CodBodeOrigen = P00272_A112Tran_CodBodeOrigen[0] ;
         A482Tran_TipoElemento = P00272_A482Tran_TipoElemento[0] ;
         A481Tran_IndE_S = P00272_A481Tran_IndE_S[0] ;
         n481Tran_IndE_S = P00272_n481Tran_IndE_S[0] ;
         A58Tran_Estado = AV11Tran_Estado ;
         n58Tran_Estado = false ;
         A668Tran_UsuarioEliminaoAnula = AV10Usuario ;
         n668Tran_UsuarioEliminaoAnula = false ;
         A669Tran_FechaEliminaoAnula = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n669Tran_FechaEliminaoAnula = false ;
         A670Tran_ObservacionesAnula = AV12ObservacionAnular ;
         n670Tran_ObservacionesAnula = false ;
         AV14Regi_Id = A57Tran_RegionId ;
         AV20Cent_Id = A48Tran_CentroCostoId ;
         AV16Alma_Modulo = A110Tran_ModuloOrigen ;
         AV15Alma_Codigo = A109Tran_CodAlmaOrigen ;
         AV17Bode_Codigo = A112Tran_CodBodeOrigen ;
         AV9Tran_TipoElemento = A482Tran_TipoElemento ;
         AV27Tran_IndE_S = A481Tran_IndE_S ;
         /* Using cursor P00273 */
         pr_default.execute(1, new Object[] {new Boolean(n58Tran_Estado), A58Tran_Estado, new Boolean(n668Tran_UsuarioEliminaoAnula), A668Tran_UsuarioEliminaoAnula, new Boolean(n669Tran_FechaEliminaoAnula), A669Tran_FechaEliminaoAnula, new Boolean(n670Tran_ObservacionesAnula), A670Tran_ObservacionesAnula, new Long(A46Tran_Id)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P00274 */
      pr_default.execute(2, new Object[] {new Long(AV8Tran_Id)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A46Tran_Id = P00274_A46Tran_Id[0] ;
         A69TDet_Consecutivo = P00274_A69TDet_Consecutivo[0] ;
         A66Elem_Consecutivo = P00274_A66Elem_Consecutivo[0] ;
         A490TDet_PlacaNumero = P00274_A490TDet_PlacaNumero[0] ;
         n490TDet_PlacaNumero = P00274_n490TDet_PlacaNumero[0] ;
         AV13TDet_Consecutivo = A69TDet_Consecutivo ;
         AV18Elem_Consecutivo = A66Elem_Consecutivo ;
         AV24Invd_NumeroPlaca = A490TDet_PlacaNumero ;
         if ( GXutil.strcmp(AV27Tran_IndE_S, "E") != 0 )
         {
            if ( GXutil.strcmp(AV9Tran_TipoElemento, "C") == 0 )
            {
               /* Using cursor P00275 */
               pr_default.execute(3, new Object[] {new Long(AV8Tran_Id), new Long(AV13TDet_Consecutivo)});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A69TDet_Consecutivo = P00275_A69TDet_Consecutivo[0] ;
                  A46Tran_Id = P00275_A46Tran_Id[0] ;
                  A71Tran_Entrada = P00275_A71Tran_Entrada[0] ;
                  A72Nro_Linea = P00275_A72Nro_Linea[0] ;
                  A687Tran_Cantidad = P00275_A687Tran_Cantidad[0] ;
                  n687Tran_Cantidad = P00275_n687Tran_Cantidad[0] ;
                  AV21Tran_Entrada = A71Tran_Entrada ;
                  AV22Nro_Linea = A72Nro_Linea ;
                  AV19Tran_Cantidad = A687Tran_Cantidad ;
                  /* Execute user subroutine: 'ACTUALIZA INVENTARIO' */
                  S111 ();
                  if ( returnInSub )
                  {
                     pr_default.close(3);
                     pr_default.close(2);
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  pr_default.readNext(3);
               }
               pr_default.close(3);
            }
            else
            {
               /* Optimized UPDATE. */
               /* Using cursor P00276 */
               pr_default.execute(4, new Object[] {AV18Elem_Consecutivo, AV24Invd_NumeroPlaca});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
               /* End optimized UPDATE. */
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      cleanup();
   }

   public void S111( )
   {
      /* 'ACTUALIZA INVENTARIO' Routine */
      /* Optimized UPDATE. */
      /* Using cursor P00277 */
      pr_default.execute(5, new Object[] {new Integer(AV19Tran_Cantidad), new Integer(AV19Tran_Cantidad), new Long(AV14Regi_Id), new Long(AV20Cent_Id), AV16Alma_Modulo, AV15Alma_Codigo, AV17Bode_Codigo, new Long(AV21Tran_Entrada), AV18Elem_Consecutivo, new Integer(AV22Nro_Linea)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INV_CON") ;
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INV_CON") ;
      /* End optimized UPDATE. */
   }

   protected void cleanup( )
   {
      this.aP0[0] = eliminatrn.this.AV8Tran_Id;
      this.aP1[0] = eliminatrn.this.AV10Usuario;
      this.aP2[0] = eliminatrn.this.AV11Tran_Estado;
      this.aP3[0] = eliminatrn.this.AV12ObservacionAnular;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "eliminatrn");
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
      P00272_A46Tran_Id = new long[1] ;
      P00272_A58Tran_Estado = new String[] {""} ;
      P00272_n58Tran_Estado = new boolean[] {false} ;
      P00272_A668Tran_UsuarioEliminaoAnula = new String[] {""} ;
      P00272_n668Tran_UsuarioEliminaoAnula = new boolean[] {false} ;
      P00272_A669Tran_FechaEliminaoAnula = new java.util.Date[] {GXutil.nullDate()} ;
      P00272_n669Tran_FechaEliminaoAnula = new boolean[] {false} ;
      P00272_A670Tran_ObservacionesAnula = new String[] {""} ;
      P00272_n670Tran_ObservacionesAnula = new boolean[] {false} ;
      P00272_A57Tran_RegionId = new long[1] ;
      P00272_n57Tran_RegionId = new boolean[] {false} ;
      P00272_A48Tran_CentroCostoId = new long[1] ;
      P00272_A110Tran_ModuloOrigen = new String[] {""} ;
      P00272_A109Tran_CodAlmaOrigen = new String[] {""} ;
      P00272_A112Tran_CodBodeOrigen = new String[] {""} ;
      P00272_A482Tran_TipoElemento = new String[] {""} ;
      P00272_A481Tran_IndE_S = new String[] {""} ;
      P00272_n481Tran_IndE_S = new boolean[] {false} ;
      A58Tran_Estado = "" ;
      A668Tran_UsuarioEliminaoAnula = "" ;
      A669Tran_FechaEliminaoAnula = GXutil.resetTime( GXutil.nullDate() );
      A670Tran_ObservacionesAnula = "" ;
      A110Tran_ModuloOrigen = "" ;
      A109Tran_CodAlmaOrigen = "" ;
      A112Tran_CodBodeOrigen = "" ;
      A482Tran_TipoElemento = "" ;
      A481Tran_IndE_S = "" ;
      AV16Alma_Modulo = "" ;
      AV15Alma_Codigo = "" ;
      AV17Bode_Codigo = "" ;
      AV9Tran_TipoElemento = "" ;
      AV27Tran_IndE_S = "" ;
      P00274_A46Tran_Id = new long[1] ;
      P00274_A69TDet_Consecutivo = new long[1] ;
      P00274_A66Elem_Consecutivo = new String[] {""} ;
      P00274_A490TDet_PlacaNumero = new String[] {""} ;
      P00274_n490TDet_PlacaNumero = new boolean[] {false} ;
      A66Elem_Consecutivo = "" ;
      A490TDet_PlacaNumero = "" ;
      AV18Elem_Consecutivo = "" ;
      AV24Invd_NumeroPlaca = "" ;
      P00275_A69TDet_Consecutivo = new long[1] ;
      P00275_A46Tran_Id = new long[1] ;
      P00275_A71Tran_Entrada = new long[1] ;
      P00275_A72Nro_Linea = new int[1] ;
      P00275_A687Tran_Cantidad = new int[1] ;
      P00275_n687Tran_Cantidad = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.eliminatrn__default(),
         new Object[] {
             new Object[] {
            P00272_A46Tran_Id, P00272_A58Tran_Estado, P00272_n58Tran_Estado, P00272_A668Tran_UsuarioEliminaoAnula, P00272_n668Tran_UsuarioEliminaoAnula, P00272_A669Tran_FechaEliminaoAnula, P00272_n669Tran_FechaEliminaoAnula, P00272_A670Tran_ObservacionesAnula, P00272_n670Tran_ObservacionesAnula, P00272_A57Tran_RegionId,
            P00272_n57Tran_RegionId, P00272_A48Tran_CentroCostoId, P00272_A110Tran_ModuloOrigen, P00272_A109Tran_CodAlmaOrigen, P00272_A112Tran_CodBodeOrigen, P00272_A482Tran_TipoElemento, P00272_A481Tran_IndE_S, P00272_n481Tran_IndE_S
            }
            , new Object[] {
            }
            , new Object[] {
            P00274_A46Tran_Id, P00274_A69TDet_Consecutivo, P00274_A66Elem_Consecutivo, P00274_A490TDet_PlacaNumero, P00274_n490TDet_PlacaNumero
            }
            , new Object[] {
            P00275_A69TDet_Consecutivo, P00275_A46Tran_Id, P00275_A71Tran_Entrada, P00275_A72Nro_Linea, P00275_A687Tran_Cantidad, P00275_n687Tran_Cantidad
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

   private short Gx_err ;
   private int A72Nro_Linea ;
   private int A687Tran_Cantidad ;
   private int AV22Nro_Linea ;
   private int AV19Tran_Cantidad ;
   private long AV8Tran_Id ;
   private long A46Tran_Id ;
   private long A57Tran_RegionId ;
   private long A48Tran_CentroCostoId ;
   private long AV14Regi_Id ;
   private long AV20Cent_Id ;
   private long A69TDet_Consecutivo ;
   private long AV13TDet_Consecutivo ;
   private long A71Tran_Entrada ;
   private long AV21Tran_Entrada ;
   private String AV11Tran_Estado ;
   private String scmdbuf ;
   private String A58Tran_Estado ;
   private String A482Tran_TipoElemento ;
   private String AV9Tran_TipoElemento ;
   private java.util.Date A669Tran_FechaEliminaoAnula ;
   private boolean n58Tran_Estado ;
   private boolean n668Tran_UsuarioEliminaoAnula ;
   private boolean n669Tran_FechaEliminaoAnula ;
   private boolean n670Tran_ObservacionesAnula ;
   private boolean n57Tran_RegionId ;
   private boolean n481Tran_IndE_S ;
   private boolean n490TDet_PlacaNumero ;
   private boolean n687Tran_Cantidad ;
   private boolean returnInSub ;
   private String AV10Usuario ;
   private String AV12ObservacionAnular ;
   private String A668Tran_UsuarioEliminaoAnula ;
   private String A670Tran_ObservacionesAnula ;
   private String A110Tran_ModuloOrigen ;
   private String A109Tran_CodAlmaOrigen ;
   private String A112Tran_CodBodeOrigen ;
   private String A481Tran_IndE_S ;
   private String AV16Alma_Modulo ;
   private String AV15Alma_Codigo ;
   private String AV17Bode_Codigo ;
   private String AV27Tran_IndE_S ;
   private String A66Elem_Consecutivo ;
   private String A490TDet_PlacaNumero ;
   private String AV18Elem_Consecutivo ;
   private String AV24Invd_NumeroPlaca ;
   private long[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private long[] P00272_A46Tran_Id ;
   private String[] P00272_A58Tran_Estado ;
   private boolean[] P00272_n58Tran_Estado ;
   private String[] P00272_A668Tran_UsuarioEliminaoAnula ;
   private boolean[] P00272_n668Tran_UsuarioEliminaoAnula ;
   private java.util.Date[] P00272_A669Tran_FechaEliminaoAnula ;
   private boolean[] P00272_n669Tran_FechaEliminaoAnula ;
   private String[] P00272_A670Tran_ObservacionesAnula ;
   private boolean[] P00272_n670Tran_ObservacionesAnula ;
   private long[] P00272_A57Tran_RegionId ;
   private boolean[] P00272_n57Tran_RegionId ;
   private long[] P00272_A48Tran_CentroCostoId ;
   private String[] P00272_A110Tran_ModuloOrigen ;
   private String[] P00272_A109Tran_CodAlmaOrigen ;
   private String[] P00272_A112Tran_CodBodeOrigen ;
   private String[] P00272_A482Tran_TipoElemento ;
   private String[] P00272_A481Tran_IndE_S ;
   private boolean[] P00272_n481Tran_IndE_S ;
   private long[] P00274_A46Tran_Id ;
   private long[] P00274_A69TDet_Consecutivo ;
   private String[] P00274_A66Elem_Consecutivo ;
   private String[] P00274_A490TDet_PlacaNumero ;
   private boolean[] P00274_n490TDet_PlacaNumero ;
   private long[] P00275_A69TDet_Consecutivo ;
   private long[] P00275_A46Tran_Id ;
   private long[] P00275_A71Tran_Entrada ;
   private int[] P00275_A72Nro_Linea ;
   private int[] P00275_A687Tran_Cantidad ;
   private boolean[] P00275_n687Tran_Cantidad ;
}

final  class eliminatrn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00272", "SELECT Tran_Id, Tran_Estado, Tran_UsuarioEliminaoAnula, Tran_FechaEliminaoAnula, Tran_ObservacionesAnula, Tran_RegionId, Tran_CentroCostoId, Tran_ModuloOrigen, Tran_CodAlmaOrigen, Tran_CodBodeOrigen, Tran_TipoElemento, Tran_IndE_S FROM ALM_TRANSACCION WHERE Tran_Id = ? ORDER BY Tran_Id  FOR UPDATE OF Tran_Estado, Tran_UsuarioEliminaoAnula, Tran_FechaEliminaoAnula, Tran_ObservacionesAnula NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P00273", "UPDATE ALM_TRANSACCION SET Tran_Estado=?, Tran_UsuarioEliminaoAnula=?, Tran_FechaEliminaoAnula=?, Tran_ObservacionesAnula=?  WHERE Tran_Id = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_TRANSACCION")
         ,new ForEachCursor("P00274", "SELECT Tran_Id, TDet_Consecutivo, Elem_Consecutivo, TDet_PlacaNumero FROM ALM_DETALLE_TRANSACCION WHERE Tran_Id = ? ORDER BY Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P00275", "SELECT TDet_Consecutivo, Tran_Id, Tran_Entrada, Nro_Linea, Tran_Cantidad FROM ALM_DET_TRAN_DATOS_SALIDA WHERE Tran_Id = ? and TDet_Consecutivo = ? ORDER BY Tran_Id, TDet_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("P00276", "UPDATE ALM_INVENTARIO_DEVOLUTIVO SET Invd_Estado='R'  WHERE Elem_Consecutivo = ? and Invd_NumeroPlaca = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INVENTARIO_DEVOLUTIVO")
         ,new UpdateCursor("P00277", "UPDATE ALM_INV_CON SET Cantidad_Transito=Cantidad_Transito - ?, Cantidad_Diponible=Cantidad_Diponible + ?  WHERE Regional = ? and Centro_Id = ? and Alma_Modulo = ? and Alma_Codigo = ? and Bode_Codigo = ? and Trans_Id = ? and Elem_Consecutivo = ? and Num_Linea = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INV_CON")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(7) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[15])[0] = rslt.getString(11, 1) ;
               ((String[]) buf[16])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[5], false);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 300);
               }
               stmt.setLong(5, ((Number) parms[8]).longValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 9);
               stmt.setVarchar(2, (String)parms[1], 30);
               return;
            case 5 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setVarchar(5, (String)parms[4], 8);
               stmt.setVarchar(6, (String)parms[5], 2);
               stmt.setVarchar(7, (String)parms[6], 3);
               stmt.setLong(8, ((Number) parms[7]).longValue());
               stmt.setVarchar(9, (String)parms[8], 9);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               return;
      }
   }

}

