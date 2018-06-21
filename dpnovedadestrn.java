/*
               File: DPNovedadesTrn
        Description: DPNovedades Trn
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:56.9
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpnovedadestrn extends GXProcedure
{
   public dpnovedadestrn( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpnovedadestrn.class ), "" );
   }

   public dpnovedadestrn( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GXBaseCollection<com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem> executeUdp( long aP0 )
   {
      dpnovedadestrn.this.AV5Tran_Id = aP0;
      dpnovedadestrn.this.aP1 = aP1;
      dpnovedadestrn.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem>()};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( long aP0 ,
                        GXBaseCollection<com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( long aP0 ,
                             GXBaseCollection<com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem>[] aP1 )
   {
      dpnovedadestrn.this.AV5Tran_Id = aP0;
      dpnovedadestrn.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000L2 */
      pr_default.execute(0, new Object[] {new Long(AV5Tran_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A107Nove_TransId = P000L2_A107Nove_TransId[0] ;
         n107Nove_TransId = P000L2_n107Nove_TransId[0] ;
         A765Nove_Estado = P000L2_A765Nove_Estado[0] ;
         n765Nove_Estado = P000L2_n765Nove_Estado[0] ;
         A106Nove_Identificador = P000L2_A106Nove_Identificador[0] ;
         A814Nove_TranCC = P000L2_A814Nove_TranCC[0] ;
         n814Nove_TranCC = P000L2_n814Nove_TranCC[0] ;
         A104TNov_Codigo = P000L2_A104TNov_Codigo[0] ;
         n104TNov_Codigo = P000L2_n104TNov_Codigo[0] ;
         A769TNov_Descripcion = P000L2_A769TNov_Descripcion[0] ;
         n769TNov_Descripcion = P000L2_n769TNov_Descripcion[0] ;
         A804Nove_Soporte = P000L2_A804Nove_Soporte[0] ;
         n804Nove_Soporte = P000L2_n804Nove_Soporte[0] ;
         A811Nove_ValorAntiguo = P000L2_A811Nove_ValorAntiguo[0] ;
         n811Nove_ValorAntiguo = P000L2_n811Nove_ValorAntiguo[0] ;
         A812Nove_ValorNuevo = P000L2_A812Nove_ValorNuevo[0] ;
         n812Nove_ValorNuevo = P000L2_n812Nove_ValorNuevo[0] ;
         A774TNov_Nombre_Campo = P000L2_A774TNov_Nombre_Campo[0] ;
         n774TNov_Nombre_Campo = P000L2_n774TNov_Nombre_Campo[0] ;
         A770TNov_Tipo = P000L2_A770TNov_Tipo[0] ;
         n770TNov_Tipo = P000L2_n770TNov_Tipo[0] ;
         A780Nove_FechaRegistro = P000L2_A780Nove_FechaRegistro[0] ;
         n780Nove_FechaRegistro = P000L2_n780Nove_FechaRegistro[0] ;
         A108Nove_Linea = P000L2_A108Nove_Linea[0] ;
         A107Nove_TransId = P000L2_A107Nove_TransId[0] ;
         n107Nove_TransId = P000L2_n107Nove_TransId[0] ;
         A765Nove_Estado = P000L2_A765Nove_Estado[0] ;
         n765Nove_Estado = P000L2_n765Nove_Estado[0] ;
         A104TNov_Codigo = P000L2_A104TNov_Codigo[0] ;
         n104TNov_Codigo = P000L2_n104TNov_Codigo[0] ;
         A804Nove_Soporte = P000L2_A804Nove_Soporte[0] ;
         n804Nove_Soporte = P000L2_n804Nove_Soporte[0] ;
         A780Nove_FechaRegistro = P000L2_A780Nove_FechaRegistro[0] ;
         n780Nove_FechaRegistro = P000L2_n780Nove_FechaRegistro[0] ;
         A814Nove_TranCC = P000L2_A814Nove_TranCC[0] ;
         n814Nove_TranCC = P000L2_n814Nove_TranCC[0] ;
         A769TNov_Descripcion = P000L2_A769TNov_Descripcion[0] ;
         n769TNov_Descripcion = P000L2_n769TNov_Descripcion[0] ;
         A774TNov_Nombre_Campo = P000L2_A774TNov_Nombre_Campo[0] ;
         n774TNov_Nombre_Campo = P000L2_n774TNov_Nombre_Campo[0] ;
         A770TNov_Tipo = P000L2_A770TNov_Tipo[0] ;
         n770TNov_Tipo = P000L2_n770TNov_Tipo[0] ;
         Gxm1sdtnovedadtrn = (com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem)new com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtnovedadtrn, 0);
         Gxm1sdtnovedadtrn.setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_identificador( A106Nove_Identificador );
         Gxm1sdtnovedadtrn.setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_fecharegistro( A780Nove_FechaRegistro );
         Gxm1sdtnovedadtrn.setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_transid( A107Nove_TransId );
         Gxm1sdtnovedadtrn.setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_trancc( A814Nove_TranCC );
         Gxm1sdtnovedadtrn.setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_codigo( A104TNov_Codigo );
         Gxm1sdtnovedadtrn.setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_descripcion( A769TNov_Descripcion );
         Gxm1sdtnovedadtrn.setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_soporte( A804Nove_Soporte );
         Gxm1sdtnovedadtrn.setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valorantiguo( A811Nove_ValorAntiguo );
         Gxm1sdtnovedadtrn.setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valornuevo( A812Nove_ValorNuevo );
         Gxm1sdtnovedadtrn.setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_nombre_campo( A774TNov_Nombre_Campo );
         Gxm1sdtnovedadtrn.setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_tipo( A770TNov_Tipo );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = dpnovedadestrn.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem>(com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem.class, "SDTNovedadTrn.SDTNovedadTrnItem", "ACBSENA", remoteHandle);
      scmdbuf = "" ;
      P000L2_A107Nove_TransId = new long[1] ;
      P000L2_n107Nove_TransId = new boolean[] {false} ;
      P000L2_A765Nove_Estado = new String[] {""} ;
      P000L2_n765Nove_Estado = new boolean[] {false} ;
      P000L2_A106Nove_Identificador = new long[1] ;
      P000L2_A814Nove_TranCC = new long[1] ;
      P000L2_n814Nove_TranCC = new boolean[] {false} ;
      P000L2_A104TNov_Codigo = new int[1] ;
      P000L2_n104TNov_Codigo = new boolean[] {false} ;
      P000L2_A769TNov_Descripcion = new String[] {""} ;
      P000L2_n769TNov_Descripcion = new boolean[] {false} ;
      P000L2_A804Nove_Soporte = new String[] {""} ;
      P000L2_n804Nove_Soporte = new boolean[] {false} ;
      P000L2_A811Nove_ValorAntiguo = new String[] {""} ;
      P000L2_n811Nove_ValorAntiguo = new boolean[] {false} ;
      P000L2_A812Nove_ValorNuevo = new String[] {""} ;
      P000L2_n812Nove_ValorNuevo = new boolean[] {false} ;
      P000L2_A774TNov_Nombre_Campo = new String[] {""} ;
      P000L2_n774TNov_Nombre_Campo = new boolean[] {false} ;
      P000L2_A770TNov_Tipo = new String[] {""} ;
      P000L2_n770TNov_Tipo = new boolean[] {false} ;
      P000L2_A780Nove_FechaRegistro = new java.util.Date[] {GXutil.nullDate()} ;
      P000L2_n780Nove_FechaRegistro = new boolean[] {false} ;
      P000L2_A108Nove_Linea = new int[1] ;
      A765Nove_Estado = "" ;
      A769TNov_Descripcion = "" ;
      A804Nove_Soporte = "" ;
      A811Nove_ValorAntiguo = "" ;
      A812Nove_ValorNuevo = "" ;
      A774TNov_Nombre_Campo = "" ;
      A770TNov_Tipo = "" ;
      A780Nove_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      Gxm1sdtnovedadtrn = new com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.dpnovedadestrn__default(),
         new Object[] {
             new Object[] {
            P000L2_A107Nove_TransId, P000L2_n107Nove_TransId, P000L2_A765Nove_Estado, P000L2_n765Nove_Estado, P000L2_A106Nove_Identificador, P000L2_A814Nove_TranCC, P000L2_n814Nove_TranCC, P000L2_A104TNov_Codigo, P000L2_n104TNov_Codigo, P000L2_A769TNov_Descripcion,
            P000L2_n769TNov_Descripcion, P000L2_A804Nove_Soporte, P000L2_n804Nove_Soporte, P000L2_A811Nove_ValorAntiguo, P000L2_n811Nove_ValorAntiguo, P000L2_A812Nove_ValorNuevo, P000L2_n812Nove_ValorNuevo, P000L2_A774TNov_Nombre_Campo, P000L2_n774TNov_Nombre_Campo, P000L2_A770TNov_Tipo,
            P000L2_n770TNov_Tipo, P000L2_A780Nove_FechaRegistro, P000L2_n780Nove_FechaRegistro, P000L2_A108Nove_Linea
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A104TNov_Codigo ;
   private int A108Nove_Linea ;
   private long AV5Tran_Id ;
   private long A107Nove_TransId ;
   private long A106Nove_Identificador ;
   private long A814Nove_TranCC ;
   private String scmdbuf ;
   private String A765Nove_Estado ;
   private java.util.Date A780Nove_FechaRegistro ;
   private boolean n107Nove_TransId ;
   private boolean n765Nove_Estado ;
   private boolean n814Nove_TranCC ;
   private boolean n104TNov_Codigo ;
   private boolean n769TNov_Descripcion ;
   private boolean n804Nove_Soporte ;
   private boolean n811Nove_ValorAntiguo ;
   private boolean n812Nove_ValorNuevo ;
   private boolean n774TNov_Nombre_Campo ;
   private boolean n770TNov_Tipo ;
   private boolean n780Nove_FechaRegistro ;
   private String A804Nove_Soporte ;
   private String A769TNov_Descripcion ;
   private String A811Nove_ValorAntiguo ;
   private String A812Nove_ValorNuevo ;
   private String A774TNov_Nombre_Campo ;
   private String A770TNov_Tipo ;
   private GXBaseCollection<com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem>[] aP1 ;
   private IDataStoreProvider pr_default ;
   private long[] P000L2_A107Nove_TransId ;
   private boolean[] P000L2_n107Nove_TransId ;
   private String[] P000L2_A765Nove_Estado ;
   private boolean[] P000L2_n765Nove_Estado ;
   private long[] P000L2_A106Nove_Identificador ;
   private long[] P000L2_A814Nove_TranCC ;
   private boolean[] P000L2_n814Nove_TranCC ;
   private int[] P000L2_A104TNov_Codigo ;
   private boolean[] P000L2_n104TNov_Codigo ;
   private String[] P000L2_A769TNov_Descripcion ;
   private boolean[] P000L2_n769TNov_Descripcion ;
   private String[] P000L2_A804Nove_Soporte ;
   private boolean[] P000L2_n804Nove_Soporte ;
   private String[] P000L2_A811Nove_ValorAntiguo ;
   private boolean[] P000L2_n811Nove_ValorAntiguo ;
   private String[] P000L2_A812Nove_ValorNuevo ;
   private boolean[] P000L2_n812Nove_ValorNuevo ;
   private String[] P000L2_A774TNov_Nombre_Campo ;
   private boolean[] P000L2_n774TNov_Nombre_Campo ;
   private String[] P000L2_A770TNov_Tipo ;
   private boolean[] P000L2_n770TNov_Tipo ;
   private java.util.Date[] P000L2_A780Nove_FechaRegistro ;
   private boolean[] P000L2_n780Nove_FechaRegistro ;
   private int[] P000L2_A108Nove_Linea ;
   private GXBaseCollection<com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem> Gxm2rootcol ;
   private com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem Gxm1sdtnovedadtrn ;
}

final  class dpnovedadestrn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000L2", "SELECT T2.Nove_TransId AS Nove_TransId, T2.Nove_Estado, T1.Nove_Identificador, T3.Tran_ConsecutivoCC AS Nove_TranCC, T2.TNov_Codigo, T4.TNov_Descripcion, T2.Nove_Soporte, T1.Nove_ValorAntiguo, T1.Nove_ValorNuevo, T4.TNov_Nombre_Campo, T4.TNov_Tipo, T2.Nove_FechaRegistro, T1.Nove_Linea FROM (((ALM_NOVEDADDETALLE T1 INNER JOIN ALM_NOVEDAD T2 ON T2.Nove_Identificador = T1.Nove_Identificador) LEFT JOIN ALM_TRANSACCION T3 ON T3.Tran_Id = T2.Nove_TransId) LEFT JOIN ALM_TIPO_NOVEDAD T4 ON T4.TNov_Codigo = T2.TNov_Codigo) WHERE (T2.Nove_TransId = ?) AND (T2.Nove_Estado = 'C') ORDER BY T2.Nove_FechaRegistro DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getBLOBFile(7, "tmp", "") ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((int[]) buf[23])[0] = rslt.getInt(13) ;
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
      }
   }

}

