/*
               File: PCreaTransaccion
        Description: PCrea Transaccion
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:11.38
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcreatransaccion extends GXProcedure
{
   public pcreatransaccion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcreatransaccion.class ), "" );
   }

   public pcreatransaccion( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( com.orions2.SdtSDTNuevaTransaccion[] aP0 ,
                             long[] aP1 )
   {
      pcreatransaccion.this.AV10SDTNuevaTransaccion = aP0[0];
      this.aP0 = aP0;
      pcreatransaccion.this.AV11Tran_Id = aP1[0];
      this.aP1 = aP1;
      pcreatransaccion.this.AV9ConsecutivoCC = aP2[0];
      this.aP2 = aP2;
      pcreatransaccion.this.aP2 = new String[] {""};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( com.orions2.SdtSDTNuevaTransaccion[] aP0 ,
                        long[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( com.orions2.SdtSDTNuevaTransaccion[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 )
   {
      pcreatransaccion.this.AV10SDTNuevaTransaccion = aP0[0];
      this.aP0 = aP0;
      pcreatransaccion.this.AV11Tran_Id = aP1[0];
      this.aP1 = aP1;
      pcreatransaccion.this.AV9ConsecutivoCC = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Tran_CentroCostoId = AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_centrocostoid() ;
      GXt_char1 = AV9ConsecutivoCC ;
      GXv_char2[0] = "TRANS" ;
      GXv_int3[0] = AV8Tran_CentroCostoId ;
      GXv_char4[0] = GXt_char1 ;
      new com.orions2.cons_tran_pla(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4) ;
      pcreatransaccion.this.AV8Tran_CentroCostoId = GXv_int3[0] ;
      pcreatransaccion.this.GXt_char1 = GXv_char4[0] ;
      AV9ConsecutivoCC = GXt_char1 ;
      /*
         INSERT RECORD ON TABLE ALM_TRANSACCION

      */
      A55Tran_FechaRegistro = GXutil.now( ) ;
      A47Tran_UsuarioId = AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_usuarioid() ;
      n47Tran_UsuarioId = false ;
      A48Tran_CentroCostoId = AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_centrocostoid() ;
      A57Tran_RegionId = AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_regionid() ;
      n57Tran_RegionId = false ;
      A49Tran_CodigoMovimiento = AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_codigomovimiento() ;
      A481Tran_IndE_S = AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_inde_s() ;
      n481Tran_IndE_S = false ;
      A482Tran_TipoElemento = AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_tipoelemento() ;
      A110Tran_ModuloOrigen = AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_moduloorigen() ;
      A109Tran_CodAlmaOrigen = AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_codalmaorigen() ;
      A112Tran_CodBodeOrigen = AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_codbodeorigen() ;
      if ( ! (0==AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_idcuentadanteorigen()) )
      {
         A51Tran_IdCuentadanteOrigen = AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_idcuentadanteorigen() ;
         n51Tran_IdCuentadanteOrigen = false ;
      }
      else
      {
         A51Tran_IdCuentadanteOrigen = 0 ;
         n51Tran_IdCuentadanteOrigen = false ;
         n51Tran_IdCuentadanteOrigen = true ;
      }
      if ( ! (0==AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_idproveedor()) )
      {
         A53Tran_IdProveedor = AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_idproveedor() ;
         n53Tran_IdProveedor = false ;
      }
      else
      {
         A53Tran_IdProveedor = 0 ;
         n53Tran_IdProveedor = false ;
         n53Tran_IdProveedor = true ;
      }
      A385Tran_ModuloDestino = AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_modulodestino() ;
      A111Tran_CodAlmaDestino = AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_codalmadestino() ;
      A387Tran_CodBodeDestino = AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_codbodedestino() ;
      A52Tran_IdCuentadanteDestino = AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_idcuentadantedestino() ;
      n52Tran_IdCuentadanteDestino = false ;
      A416Tran_Observaciones = AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_observaciones() ;
      n416Tran_Observaciones = false ;
      A58Tran_Estado = "I" ;
      n58Tran_Estado = false ;
      A513Tran_ConsecutivoCC = GXutil.lval( AV9ConsecutivoCC) ;
      n513Tran_ConsecutivoCC = false ;
      if ( ! (GXutil.strcmp("", AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_areadantecodigo())==0) )
      {
         A407Tran_AreadanteCodigo = AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_areadantecodigo() ;
         n407Tran_AreadanteCodigo = false ;
      }
      else
      {
         A407Tran_AreadanteCodigo = "" ;
         n407Tran_AreadanteCodigo = false ;
         n407Tran_AreadanteCodigo = true ;
      }
      if ( ! (GXutil.strcmp("", AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_cursocodigo())==0) )
      {
         A408Tran_CursoCodigo = AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_cursocodigo() ;
         n408Tran_CursoCodigo = false ;
      }
      else
      {
         A408Tran_CursoCodigo = "" ;
         n408Tran_CursoCodigo = false ;
         n408Tran_CursoCodigo = true ;
      }
      if ( ! (0==AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_tipoingreso()) )
      {
         A54Tran_TipoIngreso = AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_tipoingreso() ;
         n54Tran_TipoIngreso = false ;
      }
      else
      {
         A54Tran_TipoIngreso = 0 ;
         n54Tran_TipoIngreso = false ;
         n54Tran_TipoIngreso = true ;
      }
      A514Tran_NumeroIngreso = AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_numeroingreso() ;
      n514Tran_NumeroIngreso = false ;
      A515Tran_FechaIngreso = AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_fechaingreso() ;
      n515Tran_FechaIngreso = false ;
      A50Tran_CentroCostoIdDestino = AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_centrocostoiddestino() ;
      n50Tran_CentroCostoIdDestino = false ;
      A518Tran_RegionIdDestino = AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_regioniddestino() ;
      n518Tran_RegionIdDestino = false ;
      A524Tran_Detalle = AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_detalle() ;
      n524Tran_Detalle = false ;
      A527Tran_TipoEntra = AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_tipoentra() ;
      n527Tran_TipoEntra = false ;
      if ( ! (0==AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_idcuentadanteresponsabilidad()) )
      {
         A56Tran_IdCuentadanteResponsabili = AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_idcuentadanteresponsabilidad() ;
         n56Tran_IdCuentadanteResponsabili = false ;
         A719Tran_TransaccResponsabilidad = AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_transaccresponsabilidad() ;
         n719Tran_TransaccResponsabilidad = false ;
         A720Tran_FechaResponsabilidad = AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_fecharesponsabilidad() ;
         n720Tran_FechaResponsabilidad = false ;
         A758Tran_TablaResponsabilidad = AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_tablaresponsabilidad() ;
         n758Tran_TablaResponsabilidad = false ;
      }
      else
      {
         A56Tran_IdCuentadanteResponsabili = 0 ;
         n56Tran_IdCuentadanteResponsabili = false ;
         n56Tran_IdCuentadanteResponsabili = true ;
         A719Tran_TransaccResponsabilidad = 0 ;
         n719Tran_TransaccResponsabilidad = false ;
         n719Tran_TransaccResponsabilidad = true ;
         A720Tran_FechaResponsabilidad = GXutil.nullDate() ;
         n720Tran_FechaResponsabilidad = false ;
         n720Tran_FechaResponsabilidad = true ;
         A758Tran_TablaResponsabilidad = (short)(0) ;
         n758Tran_TablaResponsabilidad = false ;
         n758Tran_TablaResponsabilidad = true ;
      }
      A859Tran_EntidadGobierno = AV10SDTNuevaTransaccion.getgxTv_SdtSDTNuevaTransaccion_Tran_entidadgobierno() ;
      n859Tran_EntidadGobierno = false ;
      /* Using cursor P00232 */
      pr_default.execute(0, new Object[] {A55Tran_FechaRegistro, new Boolean(n47Tran_UsuarioId), new Long(A47Tran_UsuarioId), new Long(A48Tran_CentroCostoId), new Boolean(n57Tran_RegionId), new Long(A57Tran_RegionId), A49Tran_CodigoMovimiento, new Boolean(n481Tran_IndE_S), A481Tran_IndE_S, A482Tran_TipoElemento, A110Tran_ModuloOrigen, A109Tran_CodAlmaOrigen, A112Tran_CodBodeOrigen, new Boolean(n51Tran_IdCuentadanteOrigen), new Long(A51Tran_IdCuentadanteOrigen), new Boolean(n53Tran_IdProveedor), new Long(A53Tran_IdProveedor), A385Tran_ModuloDestino, A111Tran_CodAlmaDestino, A387Tran_CodBodeDestino, new Boolean(n52Tran_IdCuentadanteDestino), new Long(A52Tran_IdCuentadanteDestino), new Boolean(n416Tran_Observaciones), A416Tran_Observaciones, new Boolean(n407Tran_AreadanteCodigo), A407Tran_AreadanteCodigo, new Boolean(n408Tran_CursoCodigo), A408Tran_CursoCodigo, new Boolean(n58Tran_Estado), A58Tran_Estado, new Boolean(n513Tran_ConsecutivoCC), new Long(A513Tran_ConsecutivoCC), new Boolean(n54Tran_TipoIngreso), new Long(A54Tran_TipoIngreso), new Boolean(n514Tran_NumeroIngreso), A514Tran_NumeroIngreso, new Boolean(n515Tran_FechaIngreso), A515Tran_FechaIngreso, new Boolean(n50Tran_CentroCostoIdDestino), new Long(A50Tran_CentroCostoIdDestino), new Boolean(n518Tran_RegionIdDestino), new Long(A518Tran_RegionIdDestino), new Boolean(n524Tran_Detalle), A524Tran_Detalle, new Boolean(n527Tran_TipoEntra), A527Tran_TipoEntra, new Boolean(n56Tran_IdCuentadanteResponsabili), new Long(A56Tran_IdCuentadanteResponsabili), new Boolean(n719Tran_TransaccResponsabilidad), new Long(A719Tran_TransaccResponsabilidad), new Boolean(n720Tran_FechaResponsabilidad), A720Tran_FechaResponsabilidad, new Boolean(n758Tran_TablaResponsabilidad), new Short(A758Tran_TablaResponsabilidad), new Boolean(n859Tran_EntidadGobierno), A859Tran_EntidadGobierno});
      /* Retrieving last key number assigned */
      /* Using cursor P00233 */
      pr_default.execute(1);
      A46Tran_Id = P00233_A46Tran_Id[0] ;
      n46Tran_Id = P00233_n46Tran_Id[0] ;
      pr_default.close(1);
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
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
      AV11Tran_Id = A46Tran_Id ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcreatransaccion.this.AV10SDTNuevaTransaccion;
      this.aP1[0] = pcreatransaccion.this.AV11Tran_Id;
      this.aP2[0] = pcreatransaccion.this.AV9ConsecutivoCC;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "pcreatransaccion");
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      GXv_int3 = new long [1] ;
      GXv_char4 = new String [1] ;
      A55Tran_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      A49Tran_CodigoMovimiento = "" ;
      A481Tran_IndE_S = "" ;
      A482Tran_TipoElemento = "" ;
      A110Tran_ModuloOrigen = "" ;
      A109Tran_CodAlmaOrigen = "" ;
      A112Tran_CodBodeOrigen = "" ;
      A385Tran_ModuloDestino = "" ;
      A111Tran_CodAlmaDestino = "" ;
      A387Tran_CodBodeDestino = "" ;
      A416Tran_Observaciones = "" ;
      A58Tran_Estado = "" ;
      A407Tran_AreadanteCodigo = "" ;
      A408Tran_CursoCodigo = "" ;
      A514Tran_NumeroIngreso = "" ;
      A515Tran_FechaIngreso = GXutil.nullDate() ;
      A524Tran_Detalle = "" ;
      A527Tran_TipoEntra = "" ;
      A720Tran_FechaResponsabilidad = GXutil.nullDate() ;
      A859Tran_EntidadGobierno = "" ;
      scmdbuf = "" ;
      P00233_A46Tran_Id = new long[1] ;
      P00233_n46Tran_Id = new boolean[] {false} ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.pcreatransaccion__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P00233_A46Tran_Id
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A758Tran_TablaResponsabilidad ;
   private short Gx_err ;
   private int GX_INS7 ;
   private long AV11Tran_Id ;
   private long AV8Tran_CentroCostoId ;
   private long GXv_int3[] ;
   private long A47Tran_UsuarioId ;
   private long A48Tran_CentroCostoId ;
   private long A57Tran_RegionId ;
   private long A51Tran_IdCuentadanteOrigen ;
   private long A53Tran_IdProveedor ;
   private long A52Tran_IdCuentadanteDestino ;
   private long A513Tran_ConsecutivoCC ;
   private long A54Tran_TipoIngreso ;
   private long A50Tran_CentroCostoIdDestino ;
   private long A518Tran_RegionIdDestino ;
   private long A56Tran_IdCuentadanteResponsabili ;
   private long A719Tran_TransaccResponsabilidad ;
   private long A46Tran_Id ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String A482Tran_TipoElemento ;
   private String A58Tran_Estado ;
   private String A514Tran_NumeroIngreso ;
   private String A524Tran_Detalle ;
   private String A527Tran_TipoEntra ;
   private String scmdbuf ;
   private String Gx_emsg ;
   private java.util.Date A55Tran_FechaRegistro ;
   private java.util.Date A515Tran_FechaIngreso ;
   private java.util.Date A720Tran_FechaResponsabilidad ;
   private boolean n47Tran_UsuarioId ;
   private boolean n57Tran_RegionId ;
   private boolean n481Tran_IndE_S ;
   private boolean n51Tran_IdCuentadanteOrigen ;
   private boolean n53Tran_IdProveedor ;
   private boolean n52Tran_IdCuentadanteDestino ;
   private boolean n416Tran_Observaciones ;
   private boolean n58Tran_Estado ;
   private boolean n513Tran_ConsecutivoCC ;
   private boolean n407Tran_AreadanteCodigo ;
   private boolean n408Tran_CursoCodigo ;
   private boolean n54Tran_TipoIngreso ;
   private boolean n514Tran_NumeroIngreso ;
   private boolean n515Tran_FechaIngreso ;
   private boolean n50Tran_CentroCostoIdDestino ;
   private boolean n518Tran_RegionIdDestino ;
   private boolean n524Tran_Detalle ;
   private boolean n527Tran_TipoEntra ;
   private boolean n56Tran_IdCuentadanteResponsabili ;
   private boolean n719Tran_TransaccResponsabilidad ;
   private boolean n720Tran_FechaResponsabilidad ;
   private boolean n758Tran_TablaResponsabilidad ;
   private boolean n859Tran_EntidadGobierno ;
   private boolean n46Tran_Id ;
   private String A416Tran_Observaciones ;
   private String AV9ConsecutivoCC ;
   private String A49Tran_CodigoMovimiento ;
   private String A481Tran_IndE_S ;
   private String A110Tran_ModuloOrigen ;
   private String A109Tran_CodAlmaOrigen ;
   private String A112Tran_CodBodeOrigen ;
   private String A385Tran_ModuloDestino ;
   private String A111Tran_CodAlmaDestino ;
   private String A387Tran_CodBodeDestino ;
   private String A407Tran_AreadanteCodigo ;
   private String A408Tran_CursoCodigo ;
   private String A859Tran_EntidadGobierno ;
   private com.orions2.SdtSDTNuevaTransaccion[] aP0 ;
   private long[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private long[] P00233_A46Tran_Id ;
   private boolean[] P00233_n46Tran_Id ;
   private com.orions2.SdtSDTNuevaTransaccion AV10SDTNuevaTransaccion ;
}

final  class pcreatransaccion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00232", "INSERT INTO ALM_TRANSACCION(Tran_FechaRegistro, Tran_UsuarioId, Tran_CentroCostoId, Tran_RegionId, Tran_CodigoMovimiento, Tran_IndE_S, Tran_TipoElemento, Tran_ModuloOrigen, Tran_CodAlmaOrigen, Tran_CodBodeOrigen, Tran_IdCuentadanteOrigen, Tran_IdProveedor, Tran_ModuloDestino, Tran_CodAlmaDestino, Tran_CodBodeDestino, Tran_IdCuentadanteDestino, Tran_Observaciones, Tran_AreadanteCodigo, Tran_CursoCodigo, Tran_Estado, Tran_ConsecutivoCC, Tran_TipoIngreso, Tran_NumeroIngreso, Tran_FechaIngreso, Tran_CentroCostoIdDestino, Tran_RegionIdDestino, Tran_Detalle, Tran_TipoEntra, Tran_IdCuentadanteResponsabili, Tran_TransaccResponsabilidad, Tran_FechaResponsabilidad, Tran_TablaResponsabilidad, Tran_EntidadGobierno) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_TRANSACCION")
         ,new ForEachCursor("P00233", "SELECT Tran_Id.CURRVAL FROM DUAL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(2, ((Number) parms[2]).longValue(), 0);
               }
               stmt.setLong(3, ((Number) parms[3]).longValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(4, ((Number) parms[5]).longValue());
               }
               stmt.setVarchar(5, (String)parms[6], 3, false);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[8], 1);
               }
               stmt.setString(7, (String)parms[9], 1);
               stmt.setVarchar(8, (String)parms[10], 8, false);
               stmt.setVarchar(9, (String)parms[11], 2, false);
               stmt.setVarchar(10, (String)parms[12], 3, false);
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(11, ((Number) parms[14]).longValue(), 0);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(12, ((Number) parms[16]).longValue(), 0);
               }
               stmt.setVarchar(13, (String)parms[17], 8, false);
               stmt.setVarchar(14, (String)parms[18], 2, false);
               stmt.setVarchar(15, (String)parms[19], 3, false);
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(16, ((Number) parms[21]).longValue(), 0);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(17, (String)parms[23]);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[25], 20);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[27], 41);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[29], 1);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(21, ((Number) parms[31]).longValue(), 0);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(22, ((Number) parms[33]).longValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[35], 30);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDate(24, (java.util.Date)parms[37]);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(25, ((Number) parms[39]).longValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(26, ((Number) parms[41]).longValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[43], 1);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[45], 4);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(29, ((Number) parms[47]).longValue(), 0);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(30, ((Number) parms[49]).longValue());
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDate(31, (java.util.Date)parms[51]);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(32, ((Number) parms[53]).shortValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(33, (String)parms[55], 2);
               }
               return;
      }
   }

}

