/*
               File: PCrea_Novedad
        Description: PCrea_Novedad
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:13.22
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcrea_novedad extends GXProcedure
{
   public pcrea_novedad( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcrea_novedad.class ), "" );
   }

   public pcrea_novedad( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public long executeUdp( com.orions2.SdtSDTNovedades[] aP0 ,
                           GXBaseCollection<com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem>[] aP1 )
   {
      pcrea_novedad.this.AV8SDTNovedades = aP0[0];
      this.aP0 = aP0;
      pcrea_novedad.this.AV9SDTNovedadesDetalle = aP1[0];
      this.aP1 = aP1;
      pcrea_novedad.this.AV11Nove_Identificador = aP2[0];
      this.aP2 = aP2;
      pcrea_novedad.this.aP2 = new long[] {0};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( com.orions2.SdtSDTNovedades[] aP0 ,
                        GXBaseCollection<com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem>[] aP1 ,
                        long[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( com.orions2.SdtSDTNovedades[] aP0 ,
                             GXBaseCollection<com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem>[] aP1 ,
                             long[] aP2 )
   {
      pcrea_novedad.this.AV8SDTNovedades = aP0[0];
      this.aP0 = aP0;
      pcrea_novedad.this.AV9SDTNovedadesDetalle = aP1[0];
      this.aP1 = aP1;
      pcrea_novedad.this.AV11Nove_Identificador = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE ALM_NOVEDAD

      */
      A780Nove_FechaRegistro = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n780Nove_FechaRegistro = false ;
      A781Nove_UsuarioRegistro = AV8SDTNovedades.getgxTv_SdtSDTNovedades_Nove_usuarioregistro() ;
      n781Nove_UsuarioRegistro = false ;
      if ( ! (0==AV8SDTNovedades.getgxTv_SdtSDTNovedades_Nove_transid()) )
      {
         A107Nove_TransId = AV8SDTNovedades.getgxTv_SdtSDTNovedades_Nove_transid() ;
         n107Nove_TransId = false ;
      }
      else
      {
         A107Nove_TransId = 0 ;
         n107Nove_TransId = false ;
         n107Nove_TransId = true ;
      }
      A104TNov_Codigo = AV8SDTNovedades.getgxTv_SdtSDTNovedades_Tnov_codigo() ;
      n104TNov_Codigo = false ;
      A802Nove_Observaciones = AV8SDTNovedades.getgxTv_SdtSDTNovedades_Nove_observaciones() ;
      n802Nove_Observaciones = false ;
      A803Nove_Masivo = AV8SDTNovedades.getgxTv_SdtSDTNovedades_Nove_masivo() ;
      n803Nove_Masivo = false ;
      A804Nove_Soporte = AV8SDTNovedades.getgxTv_SdtSDTNovedades_Nove_soporte() ;
      n804Nove_Soporte = false ;
      /* Using cursor P002G2 */
      pr_default.execute(0, new Object[] {new Boolean(n780Nove_FechaRegistro), A780Nove_FechaRegistro, new Boolean(n781Nove_UsuarioRegistro), new Long(A781Nove_UsuarioRegistro), new Boolean(n107Nove_TransId), new Long(A107Nove_TransId), new Boolean(n104TNov_Codigo), new Integer(A104TNov_Codigo), new Boolean(n802Nove_Observaciones), A802Nove_Observaciones, new Boolean(n803Nove_Masivo), A803Nove_Masivo, new Boolean(n804Nove_Soporte), A804Nove_Soporte});
      /* Retrieving last key number assigned */
      /* Using cursor P002G3 */
      pr_default.execute(1);
      A106Nove_Identificador = P002G3_A106Nove_Identificador[0] ;
      n106Nove_Identificador = P002G3_n106Nove_Identificador[0] ;
      pr_default.close(1);
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_NOVEDAD") ;
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
      AV11Nove_Identificador = A106Nove_Identificador ;
      AV14GXV1 = 1 ;
      while ( AV14GXV1 <= AV9SDTNovedadesDetalle.size() )
      {
         AV10SDTNovedadesDetalleItem = (com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem)((com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem)AV9SDTNovedadesDetalle.elementAt(-1+AV14GXV1));
         /*
            INSERT RECORD ON TABLE ALM_NOVEDADDETALLE

         */
         A108Nove_Linea = AV10SDTNovedadesDetalleItem.getgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_linea() ;
         A806Nove_LineaTrn = AV10SDTNovedadesDetalleItem.getgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_lineatrn() ;
         n806Nove_LineaTrn = false ;
         A811Nove_ValorAntiguo = AV10SDTNovedadesDetalleItem.getgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valorantiguo() ;
         n811Nove_ValorAntiguo = false ;
         A812Nove_ValorNuevo = AV10SDTNovedadesDetalleItem.getgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valornuevo() ;
         n812Nove_ValorNuevo = false ;
         A807Nove_Consecutivo = AV10SDTNovedadesDetalleItem.getgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_consecutivo() ;
         A810Nove_Placa = AV10SDTNovedadesDetalleItem.getgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_placa() ;
         /* Using cursor P002G4 */
         pr_default.execute(2, new Object[] {new Boolean(n106Nove_Identificador), new Long(A106Nove_Identificador), new Integer(A108Nove_Linea), new Boolean(n806Nove_LineaTrn), new Long(A806Nove_LineaTrn), A807Nove_Consecutivo, A810Nove_Placa, new Boolean(n811Nove_ValorAntiguo), A811Nove_ValorAntiguo, new Boolean(n812Nove_ValorNuevo), A812Nove_ValorNuevo});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_NOVEDADDETALLE") ;
         if ( (pr_default.getStatus(2) == 1) )
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
         AV14GXV1 = (int)(AV14GXV1+1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcrea_novedad.this.AV8SDTNovedades;
      this.aP1[0] = pcrea_novedad.this.AV9SDTNovedadesDetalle;
      this.aP2[0] = pcrea_novedad.this.AV11Nove_Identificador;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "pcrea_novedad");
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A780Nove_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      A802Nove_Observaciones = "" ;
      A803Nove_Masivo = "" ;
      A804Nove_Soporte = "" ;
      scmdbuf = "" ;
      P002G3_A106Nove_Identificador = new long[1] ;
      P002G3_n106Nove_Identificador = new boolean[] {false} ;
      Gx_emsg = "" ;
      AV10SDTNovedadesDetalleItem = new com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem(remoteHandle, context);
      A811Nove_ValorAntiguo = "" ;
      A812Nove_ValorNuevo = "" ;
      A807Nove_Consecutivo = "" ;
      A810Nove_Placa = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.pcrea_novedad__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P002G3_A106Nove_Identificador
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int GX_INS56 ;
   private int A104TNov_Codigo ;
   private int AV14GXV1 ;
   private int GX_INS57 ;
   private int A108Nove_Linea ;
   private long AV11Nove_Identificador ;
   private long A781Nove_UsuarioRegistro ;
   private long A107Nove_TransId ;
   private long A106Nove_Identificador ;
   private long A806Nove_LineaTrn ;
   private String scmdbuf ;
   private String Gx_emsg ;
   private java.util.Date A780Nove_FechaRegistro ;
   private boolean n780Nove_FechaRegistro ;
   private boolean n781Nove_UsuarioRegistro ;
   private boolean n107Nove_TransId ;
   private boolean n104TNov_Codigo ;
   private boolean n802Nove_Observaciones ;
   private boolean n803Nove_Masivo ;
   private boolean n804Nove_Soporte ;
   private boolean n106Nove_Identificador ;
   private boolean n806Nove_LineaTrn ;
   private boolean n811Nove_ValorAntiguo ;
   private boolean n812Nove_ValorNuevo ;
   private String A802Nove_Observaciones ;
   private String A804Nove_Soporte ;
   private String A803Nove_Masivo ;
   private String A811Nove_ValorAntiguo ;
   private String A812Nove_ValorNuevo ;
   private String A807Nove_Consecutivo ;
   private String A810Nove_Placa ;
   private com.orions2.SdtSDTNovedades[] aP0 ;
   private GXBaseCollection<com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem>[] aP1 ;
   private long[] aP2 ;
   private IDataStoreProvider pr_default ;
   private long[] P002G3_A106Nove_Identificador ;
   private boolean[] P002G3_n106Nove_Identificador ;
   private GXBaseCollection<com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem> AV9SDTNovedadesDetalle ;
   private com.orions2.SdtSDTNovedades AV8SDTNovedades ;
   private com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem AV10SDTNovedadesDetalleItem ;
}

final  class pcrea_novedad__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new BlobUpdateCursor("P002G2", "BEGIN INSERT INTO ALM_NOVEDAD(Nove_FechaRegistro, Nove_UsuarioRegistro, Nove_TransId, TNov_Codigo, Nove_Observaciones, Nove_Masivo, Nove_Soporte, Nove_RutaSoporte, Nove_Estado, Nove_RespuestaProc) VALUES(?, ?, ?, ?, ?, ?, '0', ' ', ' ', ' ')  RETURNING ROWID INTO ?; END;",
         "SELECT Nove_Soporte FROM ALM_NOVEDAD WHERE ROWID = ? FOR UPDATE", "ins", 6, GX_NOMASK + GX_MASKLOOPLOCK, "ALM_NOVEDAD")
         ,new ForEachCursor("P002G3", "SELECT Nove_Identificador.CURRVAL FROM DUAL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P002G4", "INSERT INTO ALM_NOVEDADDETALLE(Nove_Identificador, Nove_Linea, Nove_LineaTrn, Nove_Consecutivo, Nove_Placa, Nove_ValorAntiguo, Nove_ValorNuevo) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_NOVEDADDETALLE")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(1, (java.util.Date)parms[1], false);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(2, ((Number) parms[3]).longValue(), 0);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(3, ((Number) parms[5]).longValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(5, (String)parms[9]);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 2);
               }
               stmt.setBLOBFile(1, ((Boolean) parms[12]).booleanValue() ? null : (String)parms[13]);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(3, ((Number) parms[4]).longValue(), 0);
               }
               stmt.setVarchar(4, (String)parms[5], 9, false);
               stmt.setVarchar(5, (String)parms[6], 30, false);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[8], 200);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[10], 200);
               }
               return;
      }
   }

}

