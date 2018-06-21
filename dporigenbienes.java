/*
               File: DPOrigenBienes
        Description: DPOrigen Bienes
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:55.76
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dporigenbienes extends GXProcedure
{
   public dporigenbienes( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dporigenbienes.class ), "" );
   }

   public dporigenbienes( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GXBaseCollection<com.orions2.SdtSDTOrigenbienes_SDTOrigenbienesItem> executeUdp( String aP0 )
   {
      dporigenbienes.this.AV5Tpmo_Codigo = aP0;
      dporigenbienes.this.aP1 = aP1;
      dporigenbienes.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.orions2.SdtSDTOrigenbienes_SDTOrigenbienesItem>()};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( String aP0 ,
                        GXBaseCollection<com.orions2.SdtSDTOrigenbienes_SDTOrigenbienesItem>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             GXBaseCollection<com.orions2.SdtSDTOrigenbienes_SDTOrigenbienesItem>[] aP1 )
   {
      dporigenbienes.this.AV5Tpmo_Codigo = aP0;
      dporigenbienes.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000F2 */
      pr_default.execute(0, new Object[] {AV5Tpmo_Codigo});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A38Tpmo_Codigo = P000F2_A38Tpmo_Codigo[0] ;
         A41Orig_Identificador = P000F2_A41Orig_Identificador[0] ;
         A635Orig_Descripcion = P000F2_A635Orig_Descripcion[0] ;
         n635Orig_Descripcion = P000F2_n635Orig_Descripcion[0] ;
         A642Tpmo_SolicitaNumero = P000F2_A642Tpmo_SolicitaNumero[0] ;
         A643Tpmo_SolicitaFecha = P000F2_A643Tpmo_SolicitaFecha[0] ;
         A635Orig_Descripcion = P000F2_A635Orig_Descripcion[0] ;
         n635Orig_Descripcion = P000F2_n635Orig_Descripcion[0] ;
         Gxm1sdtorigenbienes = (com.orions2.SdtSDTOrigenbienes_SDTOrigenbienesItem)new com.orions2.SdtSDTOrigenbienes_SDTOrigenbienesItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtorigenbienes, 0);
         Gxm1sdtorigenbienes.setgxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Orig_identificador( A41Orig_Identificador );
         Gxm1sdtorigenbienes.setgxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Orig_descripcion( A635Orig_Descripcion );
         Gxm1sdtorigenbienes.setgxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Tpmo_solicitanumero( A642Tpmo_SolicitaNumero );
         Gxm1sdtorigenbienes.setgxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Tpmo_solicitafecha( A643Tpmo_SolicitaFecha );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = dporigenbienes.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<com.orions2.SdtSDTOrigenbienes_SDTOrigenbienesItem>(com.orions2.SdtSDTOrigenbienes_SDTOrigenbienesItem.class, "SDTOrigenbienes.SDTOrigenbienesItem", "ACBSENA", remoteHandle);
      scmdbuf = "" ;
      P000F2_A38Tpmo_Codigo = new String[] {""} ;
      P000F2_A41Orig_Identificador = new long[1] ;
      P000F2_A635Orig_Descripcion = new String[] {""} ;
      P000F2_n635Orig_Descripcion = new boolean[] {false} ;
      P000F2_A642Tpmo_SolicitaNumero = new String[] {""} ;
      P000F2_A643Tpmo_SolicitaFecha = new String[] {""} ;
      A38Tpmo_Codigo = "" ;
      A635Orig_Descripcion = "" ;
      A642Tpmo_SolicitaNumero = "" ;
      A643Tpmo_SolicitaFecha = "" ;
      Gxm1sdtorigenbienes = new com.orions2.SdtSDTOrigenbienes_SDTOrigenbienesItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.dporigenbienes__default(),
         new Object[] {
             new Object[] {
            P000F2_A38Tpmo_Codigo, P000F2_A41Orig_Identificador, P000F2_A635Orig_Descripcion, P000F2_n635Orig_Descripcion, P000F2_A642Tpmo_SolicitaNumero, P000F2_A643Tpmo_SolicitaFecha
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long A41Orig_Identificador ;
   private String scmdbuf ;
   private boolean n635Orig_Descripcion ;
   private String AV5Tpmo_Codigo ;
   private String A38Tpmo_Codigo ;
   private String A635Orig_Descripcion ;
   private String A642Tpmo_SolicitaNumero ;
   private String A643Tpmo_SolicitaFecha ;
   private GXBaseCollection<com.orions2.SdtSDTOrigenbienes_SDTOrigenbienesItem>[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P000F2_A38Tpmo_Codigo ;
   private long[] P000F2_A41Orig_Identificador ;
   private String[] P000F2_A635Orig_Descripcion ;
   private boolean[] P000F2_n635Orig_Descripcion ;
   private String[] P000F2_A642Tpmo_SolicitaNumero ;
   private String[] P000F2_A643Tpmo_SolicitaFecha ;
   private GXBaseCollection<com.orions2.SdtSDTOrigenbienes_SDTOrigenbienesItem> Gxm2rootcol ;
   private com.orions2.SdtSDTOrigenbienes_SDTOrigenbienesItem Gxm1sdtorigenbienes ;
}

final  class dporigenbienes__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000F2", "SELECT T1.Tpmo_Codigo, T1.Orig_Identificador, T2.Orig_Descripcion, T1.Tpmo_SolicitaNumero, T1.Tpmo_SolicitaFecha FROM (ALM_TIPO_MOVIMIENTO_ORIGEN T1 INNER JOIN ALM_ORIGEN_BIENES T2 ON T2.Orig_Identificador = T1.Orig_Identificador) WHERE T1.Tpmo_Codigo = ? ORDER BY T1.Tpmo_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
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
               stmt.setVarchar(1, (String)parms[0], 3);
               return;
      }
   }

}

