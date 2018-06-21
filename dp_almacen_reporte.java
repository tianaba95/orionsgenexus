/*
               File: DP_ALMACEN_REPORTE
        Description: DP_ALMACEN_REPORTE
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: May 11, 2018 10:50:7.30
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dp_almacen_reporte extends GXProcedure
{
   public dp_almacen_reporte( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dp_almacen_reporte.class ), "" );
   }

   public dp_almacen_reporte( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GXBaseCollection<com.orions2.SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem> executeUdp( long aP0 ,
                                                                                                   String aP1 )
   {
      dp_almacen_reporte.this.AV7CENT_ID = aP0;
      dp_almacen_reporte.this.AV6ALMA_MODULO = aP1;
      dp_almacen_reporte.this.aP2 = aP2;
      dp_almacen_reporte.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<com.orions2.SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem>()};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( long aP0 ,
                        String aP1 ,
                        GXBaseCollection<com.orions2.SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long aP0 ,
                             String aP1 ,
                             GXBaseCollection<com.orions2.SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem>[] aP2 )
   {
      dp_almacen_reporte.this.AV7CENT_ID = aP0;
      dp_almacen_reporte.this.AV6ALMA_MODULO = aP1;
      dp_almacen_reporte.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000J2 */
      pr_default.execute(0, new Object[] {new Long(AV7CENT_ID), AV6ALMA_MODULO});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A673Alma_Estado = P000J2_A673Alma_Estado[0] ;
         n673Alma_Estado = P000J2_n673Alma_Estado[0] ;
         A27Alma_Modulo = P000J2_A27Alma_Modulo[0] ;
         A1Cent_Id = P000J2_A1Cent_Id[0] ;
         A28Alma_Codigo = P000J2_A28Alma_Codigo[0] ;
         A252Alma_Descripcion = P000J2_A252Alma_Descripcion[0] ;
         Gxm1sdt_almacen_reporte = (com.orions2.SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem)new com.orions2.SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdt_almacen_reporte, 0);
         Gxm1sdt_almacen_reporte.setgxTv_SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem_Alma_codigo( A28Alma_Codigo );
         Gxm1sdt_almacen_reporte.setgxTv_SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem_Alma_descripcion( A252Alma_Descripcion );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = dp_almacen_reporte.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<com.orions2.SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem>(com.orions2.SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem.class, "SDT_ALMACEN_REPORTE.SDT_ALMACEN_REPORTEItem", "ACBSENA", remoteHandle);
      scmdbuf = "" ;
      P000J2_A673Alma_Estado = new String[] {""} ;
      P000J2_n673Alma_Estado = new boolean[] {false} ;
      P000J2_A27Alma_Modulo = new String[] {""} ;
      P000J2_A1Cent_Id = new long[1] ;
      P000J2_A28Alma_Codigo = new String[] {""} ;
      P000J2_A252Alma_Descripcion = new String[] {""} ;
      A673Alma_Estado = "" ;
      A27Alma_Modulo = "" ;
      A28Alma_Codigo = "" ;
      A252Alma_Descripcion = "" ;
      Gxm1sdt_almacen_reporte = new com.orions2.SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.dp_almacen_reporte__default(),
         new Object[] {
             new Object[] {
            P000J2_A673Alma_Estado, P000J2_n673Alma_Estado, P000J2_A27Alma_Modulo, P000J2_A1Cent_Id, P000J2_A28Alma_Codigo, P000J2_A252Alma_Descripcion
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV7CENT_ID ;
   private long A1Cent_Id ;
   private String scmdbuf ;
   private String A673Alma_Estado ;
   private boolean n673Alma_Estado ;
   private String AV6ALMA_MODULO ;
   private String A27Alma_Modulo ;
   private String A28Alma_Codigo ;
   private String A252Alma_Descripcion ;
   private GXBaseCollection<com.orions2.SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem>[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P000J2_A673Alma_Estado ;
   private boolean[] P000J2_n673Alma_Estado ;
   private String[] P000J2_A27Alma_Modulo ;
   private long[] P000J2_A1Cent_Id ;
   private String[] P000J2_A28Alma_Codigo ;
   private String[] P000J2_A252Alma_Descripcion ;
   private GXBaseCollection<com.orions2.SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem> Gxm2rootcol ;
   private com.orions2.SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem Gxm1sdt_almacen_reporte ;
}

final  class dp_almacen_reporte__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000J2", "SELECT Alma_Estado, Alma_Modulo, Cent_Id, Alma_Codigo, Alma_Descripcion FROM ALM_ALMACEN WHERE (Cent_Id = ? and Alma_Modulo = ?) AND (Alma_Estado = 'A') ORDER BY Cent_Id, Alma_Modulo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 8);
               return;
      }
   }

}

