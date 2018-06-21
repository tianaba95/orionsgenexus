/*
               File: DPUsuario
        Description: DPUsuario
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:54.85
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpusuario extends GXProcedure
{
   public dpusuario( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpusuario.class ), "" );
   }

   public dpusuario( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public com.orions2.SdtSDTUsuarios executeUdp( long aP0 )
   {
      dpusuario.this.AV5Usua_Id = aP0;
      dpusuario.this.aP1 = aP1;
      dpusuario.this.aP1 = new com.orions2.SdtSDTUsuarios[] {new com.orions2.SdtSDTUsuarios()};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( long aP0 ,
                        com.orions2.SdtSDTUsuarios[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( long aP0 ,
                             com.orions2.SdtSDTUsuarios[] aP1 )
   {
      dpusuario.this.AV5Usua_Id = aP0;
      dpusuario.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00062 */
      pr_default.execute(0, new Object[] {new Long(AV5Usua_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A23Usua_Id = P00062_A23Usua_Id[0] ;
         A24Usua_Codigo = P00062_A24Usua_Codigo[0] ;
         A25Usua_Nombre = P00062_A25Usua_Nombre[0] ;
         A219Usua_Email = P00062_A219Usua_Email[0] ;
         A26Usua_Cedula = P00062_A26Usua_Cedula[0] ;
         A220Usua_Clave = P00062_A220Usua_Clave[0] ;
         A221Usua_Estado = P00062_A221Usua_Estado[0] ;
         A222Usua_UsuAprueba = P00062_A222Usua_UsuAprueba[0] ;
         A226Usua_TipoContrato = P00062_A226Usua_TipoContrato[0] ;
         A223Usua_UsuarioCrea = P00062_A223Usua_UsuarioCrea[0] ;
         A224Usua_FechaCrea = P00062_A224Usua_FechaCrea[0] ;
         A225Usua_UsuarioModifica = P00062_A225Usua_UsuarioModifica[0] ;
         A227usua_FechaModifica = P00062_A227usua_FechaModifica[0] ;
         Gxm1sdtusuarios.setgxTv_SdtSDTUsuarios_Usuaid( A23Usua_Id );
         Gxm1sdtusuarios.setgxTv_SdtSDTUsuarios_Usuacodigo( A24Usua_Codigo );
         Gxm1sdtusuarios.setgxTv_SdtSDTUsuarios_Usuanombre( A25Usua_Nombre );
         Gxm1sdtusuarios.setgxTv_SdtSDTUsuarios_Usuaemail( A219Usua_Email );
         Gxm1sdtusuarios.setgxTv_SdtSDTUsuarios_Usuacedula( A26Usua_Cedula );
         Gxm1sdtusuarios.setgxTv_SdtSDTUsuarios_Usuaclave( A220Usua_Clave );
         Gxm1sdtusuarios.setgxTv_SdtSDTUsuarios_Usuaestado( A221Usua_Estado );
         Gxm1sdtusuarios.setgxTv_SdtSDTUsuarios_Usuausuaprueba( A222Usua_UsuAprueba );
         Gxm1sdtusuarios.setgxTv_SdtSDTUsuarios_Usuatipocontrato( A226Usua_TipoContrato );
         Gxm1sdtusuarios.setgxTv_SdtSDTUsuarios_Usuausuariocrea( A223Usua_UsuarioCrea );
         Gxm1sdtusuarios.setgxTv_SdtSDTUsuarios_Usuafechacrea( A224Usua_FechaCrea );
         Gxm1sdtusuarios.setgxTv_SdtSDTUsuarios_Usuausuariomodifica( A225Usua_UsuarioModifica );
         Gxm1sdtusuarios.setgxTv_SdtSDTUsuarios_Usuafechamodifica( A227usua_FechaModifica );
         /* Using cursor P00063 */
         pr_default.execute(1, new Object[] {new Long(AV5Usua_Id)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1Cent_Id = P00063_A1Cent_Id[0] ;
            A2Regi_Id = P00063_A2Regi_Id[0] ;
            A23Usua_Id = P00063_A23Usua_Id[0] ;
            A3Cent_Codigo = P00063_A3Cent_Codigo[0] ;
            A4Cent_Descripcion = P00063_A4Cent_Descripcion[0] ;
            A12Regi_Cod = P00063_A12Regi_Cod[0] ;
            A13Regi_Descripcion = P00063_A13Regi_Descripcion[0] ;
            A154Regi_Abrev = P00063_A154Regi_Abrev[0] ;
            A2Regi_Id = P00063_A2Regi_Id[0] ;
            A3Cent_Codigo = P00063_A3Cent_Codigo[0] ;
            A4Cent_Descripcion = P00063_A4Cent_Descripcion[0] ;
            A12Regi_Cod = P00063_A12Regi_Cod[0] ;
            A13Regi_Descripcion = P00063_A13Regi_Descripcion[0] ;
            A154Regi_Abrev = P00063_A154Regi_Abrev[0] ;
            Gxm2sdtusuarios_gencentrocostocollection = (com.orions2.SdtSDTUsuarios_genCentrocostoCollectionItem)new com.orions2.SdtSDTUsuarios_genCentrocostoCollectionItem(remoteHandle, context);
            Gxm1sdtusuarios.getgxTv_SdtSDTUsuarios_Gencentrocostocollection().add(Gxm2sdtusuarios_gencentrocostocollection, 0);
            Gxm2sdtusuarios_gencentrocostocollection.setgxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Centcodigo( A3Cent_Codigo );
            Gxm2sdtusuarios_gencentrocostocollection.setgxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Centdescripcion( A4Cent_Descripcion );
            Gxm2sdtusuarios_gencentrocostocollection.setgxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regicod( A12Regi_Cod );
            Gxm2sdtusuarios_gencentrocostocollection.setgxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regidescripcion( A13Regi_Descripcion );
            Gxm2sdtusuarios_gencentrocostocollection.setgxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regiabrev( A154Regi_Abrev );
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P00064 */
         pr_default.execute(2, new Object[] {new Long(A23Usua_Id)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A21Rol_Id = P00064_A21Rol_Id[0] ;
            A22Rol_Descripcion = P00064_A22Rol_Descripcion[0] ;
            A22Rol_Descripcion = P00064_A22Rol_Descripcion[0] ;
            Gxm3sdtusuarios_segrolcollection = (com.orions2.SdtSDTUsuarios_segRolCollectionItem)new com.orions2.SdtSDTUsuarios_segRolCollectionItem(remoteHandle, context);
            Gxm1sdtusuarios.getgxTv_SdtSDTUsuarios_Segrolcollection().add(Gxm3sdtusuarios_segrolcollection, 0);
            Gxm3sdtusuarios_segrolcollection.setgxTv_SdtSDTUsuarios_segRolCollectionItem_Rolid( A21Rol_Id );
            Gxm3sdtusuarios_segrolcollection.setgxTv_SdtSDTUsuarios_segRolCollectionItem_Roldescripcion( A22Rol_Descripcion );
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = dpusuario.this.Gxm1sdtusuarios;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm1sdtusuarios = new com.orions2.SdtSDTUsuarios(remoteHandle, context);
      scmdbuf = "" ;
      P00062_A23Usua_Id = new long[1] ;
      P00062_A24Usua_Codigo = new String[] {""} ;
      P00062_A25Usua_Nombre = new String[] {""} ;
      P00062_A219Usua_Email = new String[] {""} ;
      P00062_A26Usua_Cedula = new long[1] ;
      P00062_A220Usua_Clave = new String[] {""} ;
      P00062_A221Usua_Estado = new String[] {""} ;
      P00062_A222Usua_UsuAprueba = new String[] {""} ;
      P00062_A226Usua_TipoContrato = new String[] {""} ;
      P00062_A223Usua_UsuarioCrea = new String[] {""} ;
      P00062_A224Usua_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      P00062_A225Usua_UsuarioModifica = new String[] {""} ;
      P00062_A227usua_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      A24Usua_Codigo = "" ;
      A25Usua_Nombre = "" ;
      A219Usua_Email = "" ;
      A220Usua_Clave = "" ;
      A221Usua_Estado = "" ;
      A222Usua_UsuAprueba = "" ;
      A226Usua_TipoContrato = "" ;
      A223Usua_UsuarioCrea = "" ;
      A224Usua_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A225Usua_UsuarioModifica = "" ;
      A227usua_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      P00063_A1Cent_Id = new long[1] ;
      P00063_A2Regi_Id = new long[1] ;
      P00063_A23Usua_Id = new long[1] ;
      P00063_A3Cent_Codigo = new String[] {""} ;
      P00063_A4Cent_Descripcion = new String[] {""} ;
      P00063_A12Regi_Cod = new short[1] ;
      P00063_A13Regi_Descripcion = new String[] {""} ;
      P00063_A154Regi_Abrev = new String[] {""} ;
      A3Cent_Codigo = "" ;
      A4Cent_Descripcion = "" ;
      A13Regi_Descripcion = "" ;
      A154Regi_Abrev = "" ;
      Gxm2sdtusuarios_gencentrocostocollection = new com.orions2.SdtSDTUsuarios_genCentrocostoCollectionItem(remoteHandle, context);
      P00064_A23Usua_Id = new long[1] ;
      P00064_A21Rol_Id = new long[1] ;
      P00064_A22Rol_Descripcion = new String[] {""} ;
      A22Rol_Descripcion = "" ;
      Gxm3sdtusuarios_segrolcollection = new com.orions2.SdtSDTUsuarios_segRolCollectionItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.dpusuario__default(),
         new Object[] {
             new Object[] {
            P00062_A23Usua_Id, P00062_A24Usua_Codigo, P00062_A25Usua_Nombre, P00062_A219Usua_Email, P00062_A26Usua_Cedula, P00062_A220Usua_Clave, P00062_A221Usua_Estado, P00062_A222Usua_UsuAprueba, P00062_A226Usua_TipoContrato, P00062_A223Usua_UsuarioCrea,
            P00062_A224Usua_FechaCrea, P00062_A225Usua_UsuarioModifica, P00062_A227usua_FechaModifica
            }
            , new Object[] {
            P00063_A1Cent_Id, P00063_A2Regi_Id, P00063_A23Usua_Id, P00063_A3Cent_Codigo, P00063_A4Cent_Descripcion, P00063_A12Regi_Cod, P00063_A13Regi_Descripcion, P00063_A154Regi_Abrev
            }
            , new Object[] {
            P00064_A23Usua_Id, P00064_A21Rol_Id, P00064_A22Rol_Descripcion
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A12Regi_Cod ;
   private short Gx_err ;
   private long AV5Usua_Id ;
   private long A23Usua_Id ;
   private long A26Usua_Cedula ;
   private long A1Cent_Id ;
   private long A2Regi_Id ;
   private long A21Rol_Id ;
   private String scmdbuf ;
   private String A221Usua_Estado ;
   private String A226Usua_TipoContrato ;
   private java.util.Date A224Usua_FechaCrea ;
   private java.util.Date A227usua_FechaModifica ;
   private String A24Usua_Codigo ;
   private String A25Usua_Nombre ;
   private String A219Usua_Email ;
   private String A220Usua_Clave ;
   private String A222Usua_UsuAprueba ;
   private String A223Usua_UsuarioCrea ;
   private String A225Usua_UsuarioModifica ;
   private String A3Cent_Codigo ;
   private String A4Cent_Descripcion ;
   private String A13Regi_Descripcion ;
   private String A154Regi_Abrev ;
   private String A22Rol_Descripcion ;
   private com.orions2.SdtSDTUsuarios[] aP1 ;
   private IDataStoreProvider pr_default ;
   private long[] P00062_A23Usua_Id ;
   private String[] P00062_A24Usua_Codigo ;
   private String[] P00062_A25Usua_Nombre ;
   private String[] P00062_A219Usua_Email ;
   private long[] P00062_A26Usua_Cedula ;
   private String[] P00062_A220Usua_Clave ;
   private String[] P00062_A221Usua_Estado ;
   private String[] P00062_A222Usua_UsuAprueba ;
   private String[] P00062_A226Usua_TipoContrato ;
   private String[] P00062_A223Usua_UsuarioCrea ;
   private java.util.Date[] P00062_A224Usua_FechaCrea ;
   private String[] P00062_A225Usua_UsuarioModifica ;
   private java.util.Date[] P00062_A227usua_FechaModifica ;
   private long[] P00063_A1Cent_Id ;
   private long[] P00063_A2Regi_Id ;
   private long[] P00063_A23Usua_Id ;
   private String[] P00063_A3Cent_Codigo ;
   private String[] P00063_A4Cent_Descripcion ;
   private short[] P00063_A12Regi_Cod ;
   private String[] P00063_A13Regi_Descripcion ;
   private String[] P00063_A154Regi_Abrev ;
   private long[] P00064_A23Usua_Id ;
   private long[] P00064_A21Rol_Id ;
   private String[] P00064_A22Rol_Descripcion ;
   private com.orions2.SdtSDTUsuarios Gxm1sdtusuarios ;
   private com.orions2.SdtSDTUsuarios_genCentrocostoCollectionItem Gxm2sdtusuarios_gencentrocostocollection ;
   private com.orions2.SdtSDTUsuarios_segRolCollectionItem Gxm3sdtusuarios_segrolcollection ;
}

final  class dpusuario__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00062", "SELECT Usua_Id, Usua_Codigo, Usua_Nombre, Usua_Email, Usua_Cedula, Usua_Clave, Usua_Estado, Usua_UsuAprueba, Usua_TipoContrato, Usua_UsuarioCrea, Usua_FechaCrea, Usua_UsuarioModifica, usua_FechaModifica FROM SEG_USUARIO WHERE Usua_Id = ? ORDER BY Usua_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P00063", "SELECT T1.Cent_Id, T2.Regi_Id, T1.Usua_Id, T2.Cent_Codigo, T2.Cent_Descripcion, T3.Regi_Cod, T3.Regi_Descripcion, T3.Regi_Abrev FROM ((SEG_USUARIO_CENTRO T1 INNER JOIN GEN_CENTROCOSTO T2 ON T2.Cent_Id = T1.Cent_Id) INNER JOIN GEN_REGIONAL T3 ON T3.Regi_Id = T2.Regi_Id) WHERE T1.Usua_Id = ? ORDER BY T1.Usua_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P00064", "SELECT T1.Usua_Id, T1.Rol_Id, T2.Rol_Descripcion FROM (SEG_USUARIO_ROL T1 INNER JOIN SEG_ROL T2 ON T2.Rol_Id = T1.Rol_Id) WHERE T1.Usua_Id = ? ORDER BY T1.Usua_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getString(7, 1) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getString(9, 1) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(11) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(12) ;
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(13) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
            case 0 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 1 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 2 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
      }
   }

}

