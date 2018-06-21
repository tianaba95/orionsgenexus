/*
               File: DPInactivaUsuario
        Description: DPInactiva Usuario
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:54.34
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpinactivausuario extends GXProcedure
{
   public dpinactivausuario( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpinactivausuario.class ), "" );
   }

   public dpinactivausuario( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GXBaseCollection<com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem> executeUdp( long aP0 ,
                                                                                                     byte aP1 )
   {
      dpinactivausuario.this.AV6Usua_Id = aP0;
      dpinactivausuario.this.AV7Tipo = aP1;
      dpinactivausuario.this.aP2 = aP2;
      dpinactivausuario.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem>()};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( long aP0 ,
                        byte aP1 ,
                        GXBaseCollection<com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long aP0 ,
                             byte aP1 ,
                             GXBaseCollection<com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem>[] aP2 )
   {
      dpinactivausuario.this.AV6Usua_Id = aP0;
      dpinactivausuario.this.AV7Tipo = aP1;
      dpinactivausuario.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00022 */
      pr_default.execute(0, new Object[] {new Long(AV6Usua_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A23Usua_Id = P00022_A23Usua_Id[0] ;
         A24Usua_Codigo = P00022_A24Usua_Codigo[0] ;
         Gxm1sdtinactivarusuarios = (com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem)new com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtinactivarusuarios, 0);
         Gxm1sdtinactivarusuarios.setgxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Tipoactivacion( AV7Tipo );
         Gxm1sdtinactivarusuarios.setgxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Usuacodigo( A24Usua_Codigo );
         /* Using cursor P00023 */
         pr_default.execute(1, new Object[] {new Long(A23Usua_Id)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2Regi_Id = P00023_A2Regi_Id[0] ;
            A1Cent_Id = P00023_A1Cent_Id[0] ;
            A3Cent_Codigo = P00023_A3Cent_Codigo[0] ;
            A4Cent_Descripcion = P00023_A4Cent_Descripcion[0] ;
            A12Regi_Cod = P00023_A12Regi_Cod[0] ;
            A13Regi_Descripcion = P00023_A13Regi_Descripcion[0] ;
            A2Regi_Id = P00023_A2Regi_Id[0] ;
            A3Cent_Codigo = P00023_A3Cent_Codigo[0] ;
            A4Cent_Descripcion = P00023_A4Cent_Descripcion[0] ;
            A12Regi_Cod = P00023_A12Regi_Cod[0] ;
            A13Regi_Descripcion = P00023_A13Regi_Descripcion[0] ;
            Gxm3sdtinactivarusuarios_gencentrocostocollection = (com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem)new com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem(remoteHandle, context);
            Gxm1sdtinactivarusuarios.getgxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection().add(Gxm3sdtinactivarusuarios_gencentrocostocollection, 0);
            Gxm3sdtinactivarusuarios_gencentrocostocollection.setgxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem_Centid( A1Cent_Id );
            Gxm3sdtinactivarusuarios_gencentrocostocollection.setgxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem_Centcodigo( A3Cent_Codigo );
            Gxm3sdtinactivarusuarios_gencentrocostocollection.setgxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem_Centdescripcion( A4Cent_Descripcion );
            Gxm3sdtinactivarusuarios_gencentrocostocollection.setgxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem_Regicod( A12Regi_Cod );
            Gxm3sdtinactivarusuarios_gencentrocostocollection.setgxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem_Regidescripcion( A13Regi_Descripcion );
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = dpinactivausuario.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem>(com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem.class, "SDTInactivarUsuarios.SDTInactivarUsuariosItem", "ACBSENA", remoteHandle);
      scmdbuf = "" ;
      P00022_A23Usua_Id = new long[1] ;
      P00022_A24Usua_Codigo = new String[] {""} ;
      A24Usua_Codigo = "" ;
      Gxm1sdtinactivarusuarios = new com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem(remoteHandle, context);
      P00023_A2Regi_Id = new long[1] ;
      P00023_A23Usua_Id = new long[1] ;
      P00023_A1Cent_Id = new long[1] ;
      P00023_A3Cent_Codigo = new String[] {""} ;
      P00023_A4Cent_Descripcion = new String[] {""} ;
      P00023_A12Regi_Cod = new short[1] ;
      P00023_A13Regi_Descripcion = new String[] {""} ;
      A3Cent_Codigo = "" ;
      A4Cent_Descripcion = "" ;
      A13Regi_Descripcion = "" ;
      Gxm3sdtinactivarusuarios_gencentrocostocollection = new com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.dpinactivausuario__default(),
         new Object[] {
             new Object[] {
            P00022_A23Usua_Id, P00022_A24Usua_Codigo
            }
            , new Object[] {
            P00023_A2Regi_Id, P00023_A23Usua_Id, P00023_A1Cent_Id, P00023_A3Cent_Codigo, P00023_A4Cent_Descripcion, P00023_A12Regi_Cod, P00023_A13Regi_Descripcion
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV7Tipo ;
   private short A12Regi_Cod ;
   private short Gx_err ;
   private long AV6Usua_Id ;
   private long A23Usua_Id ;
   private long A2Regi_Id ;
   private long A1Cent_Id ;
   private String scmdbuf ;
   private String A24Usua_Codigo ;
   private String A3Cent_Codigo ;
   private String A4Cent_Descripcion ;
   private String A13Regi_Descripcion ;
   private GXBaseCollection<com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem>[] aP2 ;
   private IDataStoreProvider pr_default ;
   private long[] P00022_A23Usua_Id ;
   private String[] P00022_A24Usua_Codigo ;
   private long[] P00023_A2Regi_Id ;
   private long[] P00023_A23Usua_Id ;
   private long[] P00023_A1Cent_Id ;
   private String[] P00023_A3Cent_Codigo ;
   private String[] P00023_A4Cent_Descripcion ;
   private short[] P00023_A12Regi_Cod ;
   private String[] P00023_A13Regi_Descripcion ;
   private GXBaseCollection<com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem> Gxm2rootcol ;
   private com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem Gxm1sdtinactivarusuarios ;
   private com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem Gxm3sdtinactivarusuarios_gencentrocostocollection ;
}

final  class dpinactivausuario__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00022", "SELECT Usua_Id, Usua_Codigo FROM SEG_USUARIO WHERE Usua_Id = ? ORDER BY Usua_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P00023", "SELECT T2.Regi_Id, T1.Usua_Id, T1.Cent_Id, T2.Cent_Codigo, T2.Cent_Descripcion, T3.Regi_Cod, T3.Regi_Descripcion FROM ((SEG_USUARIO_CENTRO T1 INNER JOIN GEN_CENTROCOSTO T2 ON T2.Cent_Id = T1.Cent_Id) INNER JOIN GEN_REGIONAL T3 ON T3.Regi_Id = T2.Regi_Id) WHERE T1.Usua_Id = ? ORDER BY T1.Usua_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
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
            case 0 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 1 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
      }
   }

}

