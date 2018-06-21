/*
               File: DPCentroUsuario
        Description: Centros Usuario
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: April 10, 2018 12:5:0.51
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpcentrousuario extends GXProcedure
{
   public dpcentrousuario( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpcentrousuario.class ), "" );
   }

   public dpcentrousuario( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GXBaseCollection<com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem> executeUdp( String aP0 )
   {
      dpcentrousuario.this.AV5pRegi_Descripcion = aP0;
      dpcentrousuario.this.aP1 = aP1;
      dpcentrousuario.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem>()};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( String aP0 ,
                        GXBaseCollection<com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             GXBaseCollection<com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem>[] aP1 )
   {
      dpcentrousuario.this.AV5pRegi_Descripcion = aP0;
      dpcentrousuario.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000H2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2Regi_Id = P000H2_A2Regi_Id[0] ;
         A1Cent_Id = P000H2_A1Cent_Id[0] ;
         A3Cent_Codigo = P000H2_A3Cent_Codigo[0] ;
         A4Cent_Descripcion = P000H2_A4Cent_Descripcion[0] ;
         A12Regi_Cod = P000H2_A12Regi_Cod[0] ;
         A13Regi_Descripcion = P000H2_A13Regi_Descripcion[0] ;
         A154Regi_Abrev = P000H2_A154Regi_Abrev[0] ;
         A12Regi_Cod = P000H2_A12Regi_Cod[0] ;
         A13Regi_Descripcion = P000H2_A13Regi_Descripcion[0] ;
         A154Regi_Abrev = P000H2_A154Regi_Abrev[0] ;
         Gxm1sdtcentrousuario = (com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem)new com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtcentrousuario, 0);
         Gxm1sdtcentrousuario.setgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Cent_id( A1Cent_Id );
         Gxm1sdtcentrousuario.setgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Cent_codigo( A3Cent_Codigo );
         Gxm1sdtcentrousuario.setgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Cent_descripcion( A4Cent_Descripcion );
         Gxm1sdtcentrousuario.setgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Regi_cod( A12Regi_Cod );
         Gxm1sdtcentrousuario.setgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Regi_descripcion( A13Regi_Descripcion );
         Gxm1sdtcentrousuario.setgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Regi_abrev( A154Regi_Abrev );
         Gxm1sdtcentrousuario.setgxTv_SdtSDTCentroUsuario_SDTCentroUsuarioItem_Seleccion( false );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = dpcentrousuario.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem>(com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem.class, "SDTCentroUsuario.SDTCentroUsuarioItem", "ACBSENA", remoteHandle);
      scmdbuf = "" ;
      P000H2_A2Regi_Id = new long[1] ;
      P000H2_A1Cent_Id = new long[1] ;
      P000H2_A3Cent_Codigo = new String[] {""} ;
      P000H2_A4Cent_Descripcion = new String[] {""} ;
      P000H2_A12Regi_Cod = new short[1] ;
      P000H2_A13Regi_Descripcion = new String[] {""} ;
      P000H2_A154Regi_Abrev = new String[] {""} ;
      A3Cent_Codigo = "" ;
      A4Cent_Descripcion = "" ;
      A13Regi_Descripcion = "" ;
      A154Regi_Abrev = "" ;
      Gxm1sdtcentrousuario = new com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.dpcentrousuario__default(),
         new Object[] {
             new Object[] {
            P000H2_A2Regi_Id, P000H2_A1Cent_Id, P000H2_A3Cent_Codigo, P000H2_A4Cent_Descripcion, P000H2_A12Regi_Cod, P000H2_A13Regi_Descripcion, P000H2_A154Regi_Abrev
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A12Regi_Cod ;
   private short Gx_err ;
   private long A2Regi_Id ;
   private long A1Cent_Id ;
   private String scmdbuf ;
   private String AV5pRegi_Descripcion ;
   private String A3Cent_Codigo ;
   private String A4Cent_Descripcion ;
   private String A13Regi_Descripcion ;
   private String A154Regi_Abrev ;
   private GXBaseCollection<com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem>[] aP1 ;
   private IDataStoreProvider pr_default ;
   private long[] P000H2_A2Regi_Id ;
   private long[] P000H2_A1Cent_Id ;
   private String[] P000H2_A3Cent_Codigo ;
   private String[] P000H2_A4Cent_Descripcion ;
   private short[] P000H2_A12Regi_Cod ;
   private String[] P000H2_A13Regi_Descripcion ;
   private String[] P000H2_A154Regi_Abrev ;
   private GXBaseCollection<com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem> Gxm2rootcol ;
   private com.orions2.SdtSDTCentroUsuario_SDTCentroUsuarioItem Gxm1sdtcentrousuario ;
}

final  class dpcentrousuario__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000H2", "SELECT T1.Regi_Id, T1.Cent_Id, T1.Cent_Codigo, T1.Cent_Descripcion, T2.Regi_Cod, T2.Regi_Descripcion, T2.Regi_Abrev FROM (GEN_CENTROCOSTO T1 INNER JOIN GEN_REGIONAL T2 ON T2.Regi_Id = T1.Regi_Id) ORDER BY T1.Cent_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
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

