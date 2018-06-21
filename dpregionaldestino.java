/*
               File: DPRegionalDestino
        Description: DPRegional Destino
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:55.58
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpregionaldestino extends GXProcedure
{
   public dpregionaldestino( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpregionaldestino.class ), "" );
   }

   public dpregionaldestino( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GXBaseCollection<com.orions2.SdtSDTRegionDestino_SDTRegionDestinoItem> executeUdp( )
   {
      dpregionaldestino.this.aP0 = aP0;
      dpregionaldestino.this.aP0 = new GXBaseCollection[] {new GXBaseCollection<com.orions2.SdtSDTRegionDestino_SDTRegionDestinoItem>()};
      initialize();
      privateExecute();
      return aP0[0];
   }

   public void execute( GXBaseCollection<com.orions2.SdtSDTRegionDestino_SDTRegionDestinoItem>[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( GXBaseCollection<com.orions2.SdtSDTRegionDestino_SDTRegionDestinoItem>[] aP0 )
   {
      dpregionaldestino.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000E2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A12Regi_Cod = P000E2_A12Regi_Cod[0] ;
         A2Regi_Id = P000E2_A2Regi_Id[0] ;
         A13Regi_Descripcion = P000E2_A13Regi_Descripcion[0] ;
         Gxm1sdtregiondestino = (com.orions2.SdtSDTRegionDestino_SDTRegionDestinoItem)new com.orions2.SdtSDTRegionDestino_SDTRegionDestinoItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtregiondestino, 0);
         Gxm1sdtregiondestino.setgxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regioniddestino( A2Regi_Id );
         Gxm1sdtregiondestino.setgxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regioncodigodestino( A12Regi_Cod );
         Gxm1sdtregiondestino.setgxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regiondescripciondestino( GXutil.str( A12Regi_Cod, 4, 0)+" - "+A13Regi_Descripcion );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = dpregionaldestino.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<com.orions2.SdtSDTRegionDestino_SDTRegionDestinoItem>(com.orions2.SdtSDTRegionDestino_SDTRegionDestinoItem.class, "SDTRegionDestino.SDTRegionDestinoItem", "ACBSENA", remoteHandle);
      scmdbuf = "" ;
      P000E2_A12Regi_Cod = new short[1] ;
      P000E2_A2Regi_Id = new long[1] ;
      P000E2_A13Regi_Descripcion = new String[] {""} ;
      A13Regi_Descripcion = "" ;
      Gxm1sdtregiondestino = new com.orions2.SdtSDTRegionDestino_SDTRegionDestinoItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.dpregionaldestino__default(),
         new Object[] {
             new Object[] {
            P000E2_A12Regi_Cod, P000E2_A2Regi_Id, P000E2_A13Regi_Descripcion
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A12Regi_Cod ;
   private short Gx_err ;
   private long A2Regi_Id ;
   private String scmdbuf ;
   private String A13Regi_Descripcion ;
   private GXBaseCollection<com.orions2.SdtSDTRegionDestino_SDTRegionDestinoItem>[] aP0 ;
   private IDataStoreProvider pr_default ;
   private short[] P000E2_A12Regi_Cod ;
   private long[] P000E2_A2Regi_Id ;
   private String[] P000E2_A13Regi_Descripcion ;
   private GXBaseCollection<com.orions2.SdtSDTRegionDestino_SDTRegionDestinoItem> Gxm2rootcol ;
   private com.orions2.SdtSDTRegionDestino_SDTRegionDestinoItem Gxm1sdtregiondestino ;
}

final  class dpregionaldestino__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000E2", "SELECT Regi_Cod, Regi_Id, Regi_Descripcion FROM GEN_REGIONAL WHERE Regi_Cod <> 0 ORDER BY Regi_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

