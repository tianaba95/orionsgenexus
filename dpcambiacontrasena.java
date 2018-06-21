/*
               File: DPCambiaContrasena
        Description: DPCambia Contraseña
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:55.16
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpcambiacontrasena extends GXProcedure
{
   public dpcambiacontrasena( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpcambiacontrasena.class ), "" );
   }

   public dpcambiacontrasena( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public com.orions2.SdtSDTCambiaContrasena executeUdp( String aP0 ,
                                                         String aP1 )
   {
      dpcambiacontrasena.this.AV5Usua_Codigo = aP0;
      dpcambiacontrasena.this.AV6Usua_Clave = aP1;
      dpcambiacontrasena.this.aP2 = aP2;
      dpcambiacontrasena.this.aP2 = new com.orions2.SdtSDTCambiaContrasena[] {new com.orions2.SdtSDTCambiaContrasena()};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        com.orions2.SdtSDTCambiaContrasena[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             com.orions2.SdtSDTCambiaContrasena[] aP2 )
   {
      dpcambiacontrasena.this.AV5Usua_Codigo = aP0;
      dpcambiacontrasena.this.AV6Usua_Clave = aP1;
      dpcambiacontrasena.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gxm1sdtcambiacontrasena.setgxTv_SdtSDTCambiaContrasena_Usuacodigo( AV5Usua_Codigo );
      Gxm1sdtcambiacontrasena.setgxTv_SdtSDTCambiaContrasena_Usuaclave( AV6Usua_Clave );
      /* Using cursor P00072 */
      pr_default.execute(0, new Object[] {AV5Usua_Codigo});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2Regi_Id = P00072_A2Regi_Id[0] ;
         A24Usua_Codigo = P00072_A24Usua_Codigo[0] ;
         A4Cent_Descripcion = P00072_A4Cent_Descripcion[0] ;
         A12Regi_Cod = P00072_A12Regi_Cod[0] ;
         A13Regi_Descripcion = P00072_A13Regi_Descripcion[0] ;
         A154Regi_Abrev = P00072_A154Regi_Abrev[0] ;
         A3Cent_Codigo = P00072_A3Cent_Codigo[0] ;
         A1Cent_Id = P00072_A1Cent_Id[0] ;
         A23Usua_Id = P00072_A23Usua_Id[0] ;
         A2Regi_Id = P00072_A2Regi_Id[0] ;
         A4Cent_Descripcion = P00072_A4Cent_Descripcion[0] ;
         A3Cent_Codigo = P00072_A3Cent_Codigo[0] ;
         A12Regi_Cod = P00072_A12Regi_Cod[0] ;
         A13Regi_Descripcion = P00072_A13Regi_Descripcion[0] ;
         A154Regi_Abrev = P00072_A154Regi_Abrev[0] ;
         A24Usua_Codigo = P00072_A24Usua_Codigo[0] ;
         Gxm2sdtcambiacontrasena_gencentrocostocollection = (com.orions2.SdtSDTCambiaContrasena_genCentrocostoCollectionItem)new com.orions2.SdtSDTCambiaContrasena_genCentrocostoCollectionItem(remoteHandle, context);
         Gxm1sdtcambiacontrasena.getgxTv_SdtSDTCambiaContrasena_Gencentrocostocollection().add(Gxm2sdtcambiacontrasena_gencentrocostocollection, 0);
         Gxm2sdtcambiacontrasena_gencentrocostocollection.setgxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Centcodigo( A3Cent_Codigo );
         Gxm2sdtcambiacontrasena_gencentrocostocollection.setgxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Centdescripcion( A4Cent_Descripcion );
         Gxm2sdtcambiacontrasena_gencentrocostocollection.setgxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regicod( A12Regi_Cod );
         Gxm2sdtcambiacontrasena_gencentrocostocollection.setgxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regidescripcion( A13Regi_Descripcion );
         Gxm2sdtcambiacontrasena_gencentrocostocollection.setgxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regiabrev( A154Regi_Abrev );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = dpcambiacontrasena.this.Gxm1sdtcambiacontrasena;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm1sdtcambiacontrasena = new com.orions2.SdtSDTCambiaContrasena(remoteHandle, context);
      scmdbuf = "" ;
      P00072_A2Regi_Id = new long[1] ;
      P00072_A24Usua_Codigo = new String[] {""} ;
      P00072_A4Cent_Descripcion = new String[] {""} ;
      P00072_A12Regi_Cod = new short[1] ;
      P00072_A13Regi_Descripcion = new String[] {""} ;
      P00072_A154Regi_Abrev = new String[] {""} ;
      P00072_A3Cent_Codigo = new String[] {""} ;
      P00072_A1Cent_Id = new long[1] ;
      P00072_A23Usua_Id = new long[1] ;
      A24Usua_Codigo = "" ;
      A4Cent_Descripcion = "" ;
      A13Regi_Descripcion = "" ;
      A154Regi_Abrev = "" ;
      A3Cent_Codigo = "" ;
      Gxm2sdtcambiacontrasena_gencentrocostocollection = new com.orions2.SdtSDTCambiaContrasena_genCentrocostoCollectionItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.dpcambiacontrasena__default(),
         new Object[] {
             new Object[] {
            P00072_A2Regi_Id, P00072_A24Usua_Codigo, P00072_A4Cent_Descripcion, P00072_A12Regi_Cod, P00072_A13Regi_Descripcion, P00072_A154Regi_Abrev, P00072_A3Cent_Codigo, P00072_A1Cent_Id, P00072_A23Usua_Id
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
   private long A23Usua_Id ;
   private String scmdbuf ;
   private String AV5Usua_Codigo ;
   private String AV6Usua_Clave ;
   private String A24Usua_Codigo ;
   private String A4Cent_Descripcion ;
   private String A13Regi_Descripcion ;
   private String A154Regi_Abrev ;
   private String A3Cent_Codigo ;
   private com.orions2.SdtSDTCambiaContrasena[] aP2 ;
   private IDataStoreProvider pr_default ;
   private long[] P00072_A2Regi_Id ;
   private String[] P00072_A24Usua_Codigo ;
   private String[] P00072_A4Cent_Descripcion ;
   private short[] P00072_A12Regi_Cod ;
   private String[] P00072_A13Regi_Descripcion ;
   private String[] P00072_A154Regi_Abrev ;
   private String[] P00072_A3Cent_Codigo ;
   private long[] P00072_A1Cent_Id ;
   private long[] P00072_A23Usua_Id ;
   private com.orions2.SdtSDTCambiaContrasena Gxm1sdtcambiacontrasena ;
   private com.orions2.SdtSDTCambiaContrasena_genCentrocostoCollectionItem Gxm2sdtcambiacontrasena_gencentrocostocollection ;
}

final  class dpcambiacontrasena__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00072", "SELECT T2.Regi_Id, T4.Usua_Codigo, T2.Cent_Descripcion, T3.Regi_Cod, T3.Regi_Descripcion, T3.Regi_Abrev, T2.Cent_Codigo, T1.Cent_Id, T1.Usua_Id FROM (((SEG_USUARIO_CENTRO T1 INNER JOIN GEN_CENTROCOSTO T2 ON T2.Cent_Id = T1.Cent_Id) INNER JOIN GEN_REGIONAL T3 ON T3.Regi_Id = T2.Regi_Id) INNER JOIN SEG_USUARIO T4 ON T4.Usua_Id = T1.Usua_Id) WHERE T4.Usua_Codigo = ? ORDER BY T1.Usua_Id, T1.Cent_Id, T2.Cent_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((long[]) buf[7])[0] = rslt.getLong(8) ;
               ((long[]) buf[8])[0] = rslt.getLong(9) ;
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
               stmt.setVarchar(1, (String)parms[0], 30);
               return;
      }
   }

}

