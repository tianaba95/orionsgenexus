/*
               File: WScambiaestadotransaccion
        Description: WScambiaestadotransaccion
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:12.98
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wscambiaestadotransaccion extends GXProcedure
{
   public wscambiaestadotransaccion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wscambiaestadotransaccion.class ), "" );
   }

   public wscambiaestadotransaccion( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public long executeUdp( )
   {
      wscambiaestadotransaccion.this.AV8Tran_Id = aP0[0];
      this.aP0 = aP0;
      wscambiaestadotransaccion.this.aP0 = new long[] {0};
      initialize();
      privateExecute();
      return aP0[0];
   }

   public void execute( long[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( long[] aP0 )
   {
      wscambiaestadotransaccion.this.AV8Tran_Id = aP0[0];
      this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18Programa = "cambiarEstadoTransaccion" ;
      GXv_char1[0] = AV13Host ;
      GXv_char2[0] = AV21URL ;
      GXv_int3[0] = AV19Puerto ;
      new com.orions2.parametrosservicios(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3) ;
      wscambiaestadotransaccion.this.AV13Host = GXv_char1[0] ;
      wscambiaestadotransaccion.this.AV21URL = GXv_char2[0] ;
      wscambiaestadotransaccion.this.AV19Puerto = GXv_int3[0] ;
      AV14HttpClient.setHost( AV13Host );
      AV14HttpClient.setPort( AV19Puerto );
      AV14HttpClient.setBaseURL( AV21URL );
      /* Using cursor P002C2 */
      pr_default.execute(0, new Object[] {new Long(AV8Tran_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A48Tran_CentroCostoId = P002C2_A48Tran_CentroCostoId[0] ;
         A57Tran_RegionId = P002C2_A57Tran_RegionId[0] ;
         n57Tran_RegionId = P002C2_n57Tran_RegionId[0] ;
         A419Tran_CentroCostoCodigo = P002C2_A419Tran_CentroCostoCodigo[0] ;
         n419Tran_CentroCostoCodigo = P002C2_n419Tran_CentroCostoCodigo[0] ;
         A46Tran_Id = P002C2_A46Tran_Id[0] ;
         A421Tran_RegionCodigo = P002C2_A421Tran_RegionCodigo[0] ;
         n421Tran_RegionCodigo = P002C2_n421Tran_RegionCodigo[0] ;
         A594Tran_RegionAbrev = P002C2_A594Tran_RegionAbrev[0] ;
         n594Tran_RegionAbrev = P002C2_n594Tran_RegionAbrev[0] ;
         A110Tran_ModuloOrigen = P002C2_A110Tran_ModuloOrigen[0] ;
         A385Tran_ModuloDestino = P002C2_A385Tran_ModuloDestino[0] ;
         A58Tran_Estado = P002C2_A58Tran_Estado[0] ;
         n58Tran_Estado = P002C2_n58Tran_Estado[0] ;
         A482Tran_TipoElemento = P002C2_A482Tran_TipoElemento[0] ;
         A419Tran_CentroCostoCodigo = P002C2_A419Tran_CentroCostoCodigo[0] ;
         n419Tran_CentroCostoCodigo = P002C2_n419Tran_CentroCostoCodigo[0] ;
         A421Tran_RegionCodigo = P002C2_A421Tran_RegionCodigo[0] ;
         n421Tran_RegionCodigo = P002C2_n421Tran_RegionCodigo[0] ;
         A594Tran_RegionAbrev = P002C2_A594Tran_RegionAbrev[0] ;
         n594Tran_RegionAbrev = P002C2_n594Tran_RegionAbrev[0] ;
         AV20SDTAlmTransaccion.setgxTv_Sdtsdtcambiarestadotransaccion_Tranid( A46Tran_Id );
         AV20SDTAlmTransaccion.setgxTv_Sdtsdtcambiarestadotransaccion_Tranregioncodigo( A421Tran_RegionCodigo );
         AV20SDTAlmTransaccion.setgxTv_Sdtsdtcambiarestadotransaccion_Tranregionabrev( A594Tran_RegionAbrev );
         AV20SDTAlmTransaccion.setgxTv_Sdtsdtcambiarestadotransaccion_Tranmoduloorigen( A110Tran_ModuloOrigen );
         AV20SDTAlmTransaccion.setgxTv_Sdtsdtcambiarestadotransaccion_Tranmodulodestino( A385Tran_ModuloDestino );
         AV20SDTAlmTransaccion.setgxTv_Sdtsdtcambiarestadotransaccion_Tranestado( A58Tran_Estado );
         AV20SDTAlmTransaccion.setgxTv_Sdtsdtcambiarestadotransaccion_Trantipoelemento( A482Tran_TipoElemento );
         AV15i = (short)(0) ;
         /* Using cursor P002C3 */
         pr_default.execute(1, new Object[] {new Long(A46Tran_Id)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A66Elem_Consecutivo = P002C3_A66Elem_Consecutivo[0] ;
            A490TDet_PlacaNumero = P002C3_A490TDet_PlacaNumero[0] ;
            n490TDet_PlacaNumero = P002C3_n490TDet_PlacaNumero[0] ;
            A487TDet_Cantidad = P002C3_A487TDet_Cantidad[0] ;
            A489TDet_ValorTotal = P002C3_A489TDet_ValorTotal[0] ;
            A69TDet_Consecutivo = P002C3_A69TDet_Consecutivo[0] ;
            AV9AlmDetalleTransaccionItem.setgxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetconsecutivo( A69TDet_Consecutivo );
            AV9AlmDetalleTransaccionItem.setgxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Elemconsecutivo( A66Elem_Consecutivo );
            AV9AlmDetalleTransaccionItem.setgxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetplacanumero( A490TDet_PlacaNumero );
            AV9AlmDetalleTransaccionItem.setgxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetcantidad( (short)(A487TDet_Cantidad) );
            AV9AlmDetalleTransaccionItem.setgxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetvalortotal( A489TDet_ValorTotal );
            AV9AlmDetalleTransaccionItem.setgxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Trancentrocostocodigo( A419Tran_CentroCostoCodigo );
            AV20SDTAlmTransaccion.getgxTv_Sdtsdtcambiarestadotransaccion_Detalles().add(AV9AlmDetalleTransaccionItem.Clone(), 0);
            AV9AlmDetalleTransaccionItem = (com.orions2.Sdtsdtcambiarestadotransaccion_detallesitem)new com.orions2.Sdtsdtcambiarestadotransaccion_detallesitem(remoteHandle, context);
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV10body = AV20SDTAlmTransaccion.toJSonString(false) ;
      AV14HttpClient.addHeader("Content-type", "application/json;charset=UTF-8");
      AV14HttpClient.addString(AV10body);
      AV14HttpClient.execute("POST", AV18Programa);
      AV17lvc = AV14HttpClient.getString() ;
      if ( AV14HttpClient.getStatusCode() == 201 )
      {
         httpContext.GX_msglist.addItem("Los Datos Fueron Guardados");
         AV12Estado = "K" ;
      }
      else
      {
         httpContext.GX_msglist.addItem("Ha ocurrido un error en el Web Services");
         AV12Estado = "E" ;
      }
      GXv_char2[0] = "CTRWS" ;
      GXv_int4[0] = AV11cons_Numero ;
      new com.orions2.devuelveconsecutivo(remoteHandle, context).execute( GXv_char2, GXv_int4) ;
      wscambiaestadotransaccion.this.AV11cons_Numero = GXv_int4[0] ;
      /*
         INSERT RECORD ON TABLE SEG_CONTROL_WEBSERVICES

      */
      A15Control_Id = AV11cons_Numero ;
      A193Control_IdUsuario = AV22Usua_Id ;
      A190Control_Body = AV10body ;
      A192Control_Estado = AV12Estado ;
      A187Control_FechaHora = GXutil.now( ) ;
      A191Control_Lvc = AV17lvc ;
      A189Control_Programa = AV18Programa ;
      A188Control_Usuario = AV23Usuario ;
      /* Using cursor P002C4 */
      pr_default.execute(2, new Object[] {new Long(A15Control_Id), A187Control_FechaHora, new Long(A193Control_IdUsuario), A188Control_Usuario, A189Control_Programa, A190Control_Body, A191Control_Lvc, A192Control_Estado});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_CONTROL_WEBSERVICES") ;
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
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = wscambiaestadotransaccion.this.AV8Tran_Id;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "wscambiaestadotransaccion");
      CloseOpenCursors();
      AV14HttpClient.cleanup();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18Programa = "" ;
      AV13Host = "" ;
      GXv_char1 = new String [1] ;
      AV21URL = "" ;
      GXv_int3 = new short [1] ;
      AV14HttpClient = new com.genexus.internet.HttpClient();
      scmdbuf = "" ;
      P002C2_A48Tran_CentroCostoId = new long[1] ;
      P002C2_A57Tran_RegionId = new long[1] ;
      P002C2_n57Tran_RegionId = new boolean[] {false} ;
      P002C2_A419Tran_CentroCostoCodigo = new String[] {""} ;
      P002C2_n419Tran_CentroCostoCodigo = new boolean[] {false} ;
      P002C2_A46Tran_Id = new long[1] ;
      P002C2_A421Tran_RegionCodigo = new short[1] ;
      P002C2_n421Tran_RegionCodigo = new boolean[] {false} ;
      P002C2_A594Tran_RegionAbrev = new String[] {""} ;
      P002C2_n594Tran_RegionAbrev = new boolean[] {false} ;
      P002C2_A110Tran_ModuloOrigen = new String[] {""} ;
      P002C2_A385Tran_ModuloDestino = new String[] {""} ;
      P002C2_A58Tran_Estado = new String[] {""} ;
      P002C2_n58Tran_Estado = new boolean[] {false} ;
      P002C2_A482Tran_TipoElemento = new String[] {""} ;
      A419Tran_CentroCostoCodigo = "" ;
      A594Tran_RegionAbrev = "" ;
      A110Tran_ModuloOrigen = "" ;
      A385Tran_ModuloDestino = "" ;
      A58Tran_Estado = "" ;
      A482Tran_TipoElemento = "" ;
      AV20SDTAlmTransaccion = new com.orions2.Sdtsdtcambiarestadotransaccion(remoteHandle, context);
      P002C3_A46Tran_Id = new long[1] ;
      P002C3_A66Elem_Consecutivo = new String[] {""} ;
      P002C3_A490TDet_PlacaNumero = new String[] {""} ;
      P002C3_n490TDet_PlacaNumero = new boolean[] {false} ;
      P002C3_A487TDet_Cantidad = new long[1] ;
      P002C3_A489TDet_ValorTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002C3_A69TDet_Consecutivo = new long[1] ;
      A66Elem_Consecutivo = "" ;
      A490TDet_PlacaNumero = "" ;
      A489TDet_ValorTotal = DecimalUtil.ZERO ;
      AV9AlmDetalleTransaccionItem = new com.orions2.Sdtsdtcambiarestadotransaccion_detallesitem(remoteHandle, context);
      AV10body = "" ;
      AV17lvc = "" ;
      AV12Estado = "" ;
      GXv_char2 = new String [1] ;
      GXv_int4 = new long [1] ;
      A190Control_Body = "" ;
      A192Control_Estado = "" ;
      A187Control_FechaHora = GXutil.resetTime( GXutil.nullDate() );
      A191Control_Lvc = "" ;
      A189Control_Programa = "" ;
      A188Control_Usuario = "" ;
      AV23Usuario = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wscambiaestadotransaccion__default(),
         new Object[] {
             new Object[] {
            P002C2_A48Tran_CentroCostoId, P002C2_A57Tran_RegionId, P002C2_n57Tran_RegionId, P002C2_A419Tran_CentroCostoCodigo, P002C2_n419Tran_CentroCostoCodigo, P002C2_A46Tran_Id, P002C2_A421Tran_RegionCodigo, P002C2_n421Tran_RegionCodigo, P002C2_A594Tran_RegionAbrev, P002C2_n594Tran_RegionAbrev,
            P002C2_A110Tran_ModuloOrigen, P002C2_A385Tran_ModuloDestino, P002C2_A58Tran_Estado, P002C2_n58Tran_Estado, P002C2_A482Tran_TipoElemento
            }
            , new Object[] {
            P002C3_A46Tran_Id, P002C3_A66Elem_Consecutivo, P002C3_A490TDet_PlacaNumero, P002C3_n490TDet_PlacaNumero, P002C3_A487TDet_Cantidad, P002C3_A489TDet_ValorTotal, P002C3_A69TDet_Consecutivo
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV19Puerto ;
   private short GXv_int3[] ;
   private short A421Tran_RegionCodigo ;
   private short AV15i ;
   private short Gx_err ;
   private int GX_INS23 ;
   private long AV8Tran_Id ;
   private long A48Tran_CentroCostoId ;
   private long A57Tran_RegionId ;
   private long A46Tran_Id ;
   private long A487TDet_Cantidad ;
   private long A69TDet_Consecutivo ;
   private long AV11cons_Numero ;
   private long GXv_int4[] ;
   private long A15Control_Id ;
   private long A193Control_IdUsuario ;
   private long AV22Usua_Id ;
   private java.math.BigDecimal A489TDet_ValorTotal ;
   private String AV18Programa ;
   private String GXv_char1[] ;
   private String scmdbuf ;
   private String A58Tran_Estado ;
   private String A482Tran_TipoElemento ;
   private String AV12Estado ;
   private String GXv_char2[] ;
   private String A192Control_Estado ;
   private String A189Control_Programa ;
   private String Gx_emsg ;
   private java.util.Date A187Control_FechaHora ;
   private boolean n57Tran_RegionId ;
   private boolean n419Tran_CentroCostoCodigo ;
   private boolean n421Tran_RegionCodigo ;
   private boolean n594Tran_RegionAbrev ;
   private boolean n58Tran_Estado ;
   private boolean n490TDet_PlacaNumero ;
   private String AV10body ;
   private String AV17lvc ;
   private String A190Control_Body ;
   private String A191Control_Lvc ;
   private String AV13Host ;
   private String AV21URL ;
   private String A419Tran_CentroCostoCodigo ;
   private String A594Tran_RegionAbrev ;
   private String A110Tran_ModuloOrigen ;
   private String A385Tran_ModuloDestino ;
   private String A66Elem_Consecutivo ;
   private String A490TDet_PlacaNumero ;
   private String A188Control_Usuario ;
   private String AV23Usuario ;
   private com.genexus.internet.HttpClient AV14HttpClient ;
   private com.orions2.Sdtsdtcambiarestadotransaccion AV20SDTAlmTransaccion ;
   private com.orions2.Sdtsdtcambiarestadotransaccion_detallesitem AV9AlmDetalleTransaccionItem ;
   private long[] aP0 ;
   private IDataStoreProvider pr_default ;
   private long[] P002C2_A48Tran_CentroCostoId ;
   private long[] P002C2_A57Tran_RegionId ;
   private boolean[] P002C2_n57Tran_RegionId ;
   private String[] P002C2_A419Tran_CentroCostoCodigo ;
   private boolean[] P002C2_n419Tran_CentroCostoCodigo ;
   private long[] P002C2_A46Tran_Id ;
   private short[] P002C2_A421Tran_RegionCodigo ;
   private boolean[] P002C2_n421Tran_RegionCodigo ;
   private String[] P002C2_A594Tran_RegionAbrev ;
   private boolean[] P002C2_n594Tran_RegionAbrev ;
   private String[] P002C2_A110Tran_ModuloOrigen ;
   private String[] P002C2_A385Tran_ModuloDestino ;
   private String[] P002C2_A58Tran_Estado ;
   private boolean[] P002C2_n58Tran_Estado ;
   private String[] P002C2_A482Tran_TipoElemento ;
   private long[] P002C3_A46Tran_Id ;
   private String[] P002C3_A66Elem_Consecutivo ;
   private String[] P002C3_A490TDet_PlacaNumero ;
   private boolean[] P002C3_n490TDet_PlacaNumero ;
   private long[] P002C3_A487TDet_Cantidad ;
   private java.math.BigDecimal[] P002C3_A489TDet_ValorTotal ;
   private long[] P002C3_A69TDet_Consecutivo ;
}

final  class wscambiaestadotransaccion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002C2", "SELECT T1.Tran_CentroCostoId AS Tran_CentroCostoId, T1.Tran_RegionId AS Tran_RegionId, T2.Cent_Codigo AS Tran_CentroCostoCodigo, T1.Tran_Id, T3.Regi_Cod AS Tran_RegionCodigo, T3.Regi_Abrev AS Tran_RegionAbrev, T1.Tran_ModuloOrigen, T1.Tran_ModuloDestino, T1.Tran_Estado, T1.Tran_TipoElemento FROM ((ALM_TRANSACCION T1 INNER JOIN GEN_CENTROCOSTO T2 ON T2.Cent_Id = T1.Tran_CentroCostoId) LEFT JOIN GEN_REGIONAL T3 ON T3.Regi_Id = T1.Tran_RegionId) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P002C3", "SELECT Tran_Id, Elem_Consecutivo, TDet_PlacaNumero, TDet_Cantidad, TDet_ValorTotal, TDet_Consecutivo FROM ALM_DETALLE_TRANSACCION WHERE Tran_Id = ? ORDER BY Tran_Id, TDet_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("P002C4", "INSERT INTO SEG_CONTROL_WEBSERVICES(Control_Id, Control_FechaHora, Control_IdUsuario, Control_Usuario, Control_Programa, Control_Body, Control_Lvc, Control_Estado, Control_CodUsuario) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "SEG_CONTROL_WEBSERVICES")
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
               ((short[]) buf[6])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[12])[0] = rslt.getString(9, 1) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 1) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2) ;
               ((long[]) buf[6])[0] = rslt.getLong(6) ;
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
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setBigDecimal(3, ((Number) parms[2]).longValue(), 0);
               stmt.setVarchar(4, (String)parms[3], 30, false);
               stmt.setString(5, (String)parms[4], 25);
               stmt.setLongVarchar(6, (String)parms[5], false);
               stmt.setLongVarchar(7, (String)parms[6], false);
               stmt.setString(8, (String)parms[7], 1);
               return;
      }
   }

}

