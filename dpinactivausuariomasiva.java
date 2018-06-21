/*
               File: DPInactivaUsuarioMasiva
        Description: DPInactiva Usuario Masiva
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:55.28
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpinactivausuariomasiva extends GXProcedure
{
   public dpinactivausuariomasiva( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpinactivausuariomasiva.class ), "" );
   }

   public dpinactivausuariomasiva( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GXBaseCollection<com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem> executeUdp( )
   {
      dpinactivausuariomasiva.this.aP0 = aP0;
      dpinactivausuariomasiva.this.aP0 = new GXBaseCollection[] {new GXBaseCollection<com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem>()};
      initialize();
      privateExecute();
      return aP0[0];
   }

   public void execute( GXBaseCollection<com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem>[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( GXBaseCollection<com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem>[] aP0 )
   {
      dpinactivausuariomasiva.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000A2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A23Usua_Id = P000A2_A23Usua_Id[0] ;
         A221Usua_Estado = P000A2_A221Usua_Estado[0] ;
         A226Usua_TipoContrato = P000A2_A226Usua_TipoContrato[0] ;
         A24Usua_Codigo = P000A2_A24Usua_Codigo[0] ;
         Gxm1sdtinactivarusuarios = (com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem)new com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtinactivarusuarios, 0);
         Gxm1sdtinactivarusuarios.setgxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Tipoactivacion( (byte)(0) );
         Gxm1sdtinactivarusuarios.setgxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Usuacodigo( A24Usua_Codigo );
         /* Using cursor P000A3 */
         pr_default.execute(1, new Object[] {new Long(A23Usua_Id)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2Regi_Id = P000A3_A2Regi_Id[0] ;
            A1Cent_Id = P000A3_A1Cent_Id[0] ;
            A3Cent_Codigo = P000A3_A3Cent_Codigo[0] ;
            A4Cent_Descripcion = P000A3_A4Cent_Descripcion[0] ;
            A12Regi_Cod = P000A3_A12Regi_Cod[0] ;
            A13Regi_Descripcion = P000A3_A13Regi_Descripcion[0] ;
            A2Regi_Id = P000A3_A2Regi_Id[0] ;
            A3Cent_Codigo = P000A3_A3Cent_Codigo[0] ;
            A4Cent_Descripcion = P000A3_A4Cent_Descripcion[0] ;
            A12Regi_Cod = P000A3_A12Regi_Cod[0] ;
            A13Regi_Descripcion = P000A3_A13Regi_Descripcion[0] ;
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
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = dpinactivausuariomasiva.this.Gxm2rootcol;
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
      P000A2_A23Usua_Id = new long[1] ;
      P000A2_A221Usua_Estado = new String[] {""} ;
      P000A2_A226Usua_TipoContrato = new String[] {""} ;
      P000A2_A24Usua_Codigo = new String[] {""} ;
      A221Usua_Estado = "" ;
      A226Usua_TipoContrato = "" ;
      A24Usua_Codigo = "" ;
      Gxm1sdtinactivarusuarios = new com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem(remoteHandle, context);
      P000A3_A2Regi_Id = new long[1] ;
      P000A3_A23Usua_Id = new long[1] ;
      P000A3_A1Cent_Id = new long[1] ;
      P000A3_A3Cent_Codigo = new String[] {""} ;
      P000A3_A4Cent_Descripcion = new String[] {""} ;
      P000A3_A12Regi_Cod = new short[1] ;
      P000A3_A13Regi_Descripcion = new String[] {""} ;
      A3Cent_Codigo = "" ;
      A4Cent_Descripcion = "" ;
      A13Regi_Descripcion = "" ;
      Gxm3sdtinactivarusuarios_gencentrocostocollection = new com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.dpinactivausuariomasiva__default(),
         new Object[] {
             new Object[] {
            P000A2_A23Usua_Id, P000A2_A221Usua_Estado, P000A2_A226Usua_TipoContrato, P000A2_A24Usua_Codigo
            }
            , new Object[] {
            P000A3_A2Regi_Id, P000A3_A23Usua_Id, P000A3_A1Cent_Id, P000A3_A3Cent_Codigo, P000A3_A4Cent_Descripcion, P000A3_A12Regi_Cod, P000A3_A13Regi_Descripcion
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A12Regi_Cod ;
   private short Gx_err ;
   private long A23Usua_Id ;
   private long A2Regi_Id ;
   private long A1Cent_Id ;
   private String scmdbuf ;
   private String A221Usua_Estado ;
   private String A226Usua_TipoContrato ;
   private String A24Usua_Codigo ;
   private String A3Cent_Codigo ;
   private String A4Cent_Descripcion ;
   private String A13Regi_Descripcion ;
   private GXBaseCollection<com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem>[] aP0 ;
   private IDataStoreProvider pr_default ;
   private long[] P000A2_A23Usua_Id ;
   private String[] P000A2_A221Usua_Estado ;
   private String[] P000A2_A226Usua_TipoContrato ;
   private String[] P000A2_A24Usua_Codigo ;
   private long[] P000A3_A2Regi_Id ;
   private long[] P000A3_A23Usua_Id ;
   private long[] P000A3_A1Cent_Id ;
   private String[] P000A3_A3Cent_Codigo ;
   private String[] P000A3_A4Cent_Descripcion ;
   private short[] P000A3_A12Regi_Cod ;
   private String[] P000A3_A13Regi_Descripcion ;
   private GXBaseCollection<com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem> Gxm2rootcol ;
   private com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem Gxm1sdtinactivarusuarios ;
   private com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem Gxm3sdtinactivarusuarios_gencentrocostocollection ;
}

final  class dpinactivausuariomasiva__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000A2", "SELECT Usua_Id, Usua_Estado, Usua_TipoContrato, Usua_Codigo FROM SEG_USUARIO WHERE (Usua_TipoContrato = 'C') AND (Usua_Estado = 'A') ORDER BY Usua_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P000A3", "SELECT T2.Regi_Id, T1.Usua_Id, T1.Cent_Id, T2.Cent_Codigo, T2.Cent_Descripcion, T3.Regi_Cod, T3.Regi_Descripcion FROM ((SEG_USUARIO_CENTRO T1 INNER JOIN GEN_CENTROCOSTO T2 ON T2.Cent_Id = T1.Cent_Id) INNER JOIN GEN_REGIONAL T3 ON T3.Regi_Id = T2.Regi_Id) WHERE T1.Usua_Id = ? ORDER BY T1.Usua_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 1) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
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
            case 1 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
      }
   }

}

