/*
               File: CreaAuditUsuRoles
        Description: Crea Audit Usu Roles
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:58.86
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class creaauditusuroles extends GXProcedure
{
   public creaauditusuroles( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( creaauditusuroles.class ), "" );
   }

   public creaauditusuroles( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long[] aP0 ,
                             String[] aP1 ,
                             GXBaseCollection<com.orions2.SdtSDTRolUsu_SDTRolUsuItem>[] aP2 ,
                             GXBaseCollection<com.orions2.SdtSDTCECUsu_SDTCECUsuItem>[] aP3 ,
                             String[] aP4 )
   {
      creaauditusuroles.this.AV11Usua_Id = aP0[0];
      this.aP0 = aP0;
      creaauditusuroles.this.AV10Usua_Codigo = aP1[0];
      this.aP1 = aP1;
      creaauditusuroles.this.AV14SDTRolUsu = aP2[0];
      this.aP2 = aP2;
      creaauditusuroles.this.AV15SDTCECUsu = aP3[0];
      this.aP3 = aP3;
      creaauditusuroles.this.Gx_mode = aP4[0];
      this.aP4 = aP4;
      creaauditusuroles.this.AV12Usuario = aP5[0];
      this.aP5 = aP5;
      creaauditusuroles.this.aP5 = new String[] {""};
      initialize();
      privateExecute();
      return aP5[0];
   }

   public void execute( long[] aP0 ,
                        String[] aP1 ,
                        GXBaseCollection<com.orions2.SdtSDTRolUsu_SDTRolUsuItem>[] aP2 ,
                        GXBaseCollection<com.orions2.SdtSDTCECUsu_SDTCECUsuItem>[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( long[] aP0 ,
                             String[] aP1 ,
                             GXBaseCollection<com.orions2.SdtSDTRolUsu_SDTRolUsuItem>[] aP2 ,
                             GXBaseCollection<com.orions2.SdtSDTCECUsu_SDTCECUsuItem>[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      creaauditusuroles.this.AV11Usua_Id = aP0[0];
      this.aP0 = aP0;
      creaauditusuroles.this.AV10Usua_Codigo = aP1[0];
      this.aP1 = aP1;
      creaauditusuroles.this.AV14SDTRolUsu = aP2[0];
      this.aP2 = aP2;
      creaauditusuroles.this.AV15SDTCECUsu = aP3[0];
      this.aP3 = aP3;
      creaauditusuroles.this.Gx_mode = aP4[0];
      this.aP4 = aP4;
      creaauditusuroles.this.AV12Usuario = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = "AUDUS" ;
      GXv_int2[0] = AV9cons_Numero ;
      new com.orions2.devuelveconsecutivo(remoteHandle, context).execute( GXv_char1, GXv_int2) ;
      creaauditusuroles.this.AV9cons_Numero = GXv_int2[0] ;
      /* Execute user subroutine: 'ROLES' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'REGIONES' */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /*
         INSERT RECORD ON TABLE SEG_AUDITORIAUSUARIO

      */
      A14Audi_Usua_Id = AV9cons_Numero ;
      A186Audi_Usua_IdUsu = AV11Usua_Id ;
      A166Audi_Usua_Fecha = GXutil.now( ) ;
      A180Audi_Usua_RolNew = AV8Audi_Usua_RolNew ;
      A181Audi_Usua_CentroCostoNew = AV13Audi_Usua_CentroCostoNew ;
      A185Audi_Usua_UsuaMod = AV12Usuario ;
      A182Audi_Usua_Modo = Gx_mode ;
      /* Using cursor P00112 */
      pr_default.execute(0, new Object[] {new Long(A14Audi_Usua_Id), new Long(A186Audi_Usua_IdUsu), A166Audi_Usua_Fecha, A180Audi_Usua_RolNew, A181Audi_Usua_CentroCostoNew, A182Audi_Usua_Modo, A185Audi_Usua_UsuaMod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_AUDITORIAUSUARIO") ;
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
      cleanup();
   }

   public void S111( )
   {
      /* 'ROLES' Routine */
      AV8Audi_Usua_RolNew = "" ;
      AV21GXV1 = 1 ;
      while ( AV21GXV1 <= AV14SDTRolUsu.size() )
      {
         AV16SDTRolUsuItem = (com.orions2.SdtSDTRolUsu_SDTRolUsuItem)((com.orions2.SdtSDTRolUsu_SDTRolUsuItem)AV14SDTRolUsu.elementAt(-1+AV21GXV1));
         AV8Audi_Usua_RolNew = AV8Audi_Usua_RolNew + GXutil.trim( GXutil.str( AV16SDTRolUsuItem.getgxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_id(), 11, 0)) + "," ;
         AV21GXV1 = (int)(AV21GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'REGIONES' Routine */
      AV13Audi_Usua_CentroCostoNew = "" ;
      AV22GXV2 = 1 ;
      while ( AV22GXV2 <= AV15SDTCECUsu.size() )
      {
         AV17SDTCECUsuItem = (com.orions2.SdtSDTCECUsu_SDTCECUsuItem)((com.orions2.SdtSDTCECUsu_SDTCECUsuItem)AV15SDTCECUsu.elementAt(-1+AV22GXV2));
         AV13Audi_Usua_CentroCostoNew = AV13Audi_Usua_CentroCostoNew + GXutil.trim( AV17SDTCECUsuItem.getgxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_codigo()) + "/" + GXutil.trim( GXutil.str( AV17SDTCECUsuItem.getgxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_cod(), 4, 0)) + "," ;
         AV22GXV2 = (int)(AV22GXV2+1) ;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = creaauditusuroles.this.AV11Usua_Id;
      this.aP1[0] = creaauditusuroles.this.AV10Usua_Codigo;
      this.aP2[0] = creaauditusuroles.this.AV14SDTRolUsu;
      this.aP3[0] = creaauditusuroles.this.AV15SDTCECUsu;
      this.aP4[0] = creaauditusuroles.this.Gx_mode;
      this.aP5[0] = creaauditusuroles.this.AV12Usuario;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "creaauditusuroles");
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char1 = new String [1] ;
      GXv_int2 = new long [1] ;
      A166Audi_Usua_Fecha = GXutil.resetTime( GXutil.nullDate() );
      A180Audi_Usua_RolNew = "" ;
      AV8Audi_Usua_RolNew = "" ;
      A181Audi_Usua_CentroCostoNew = "" ;
      AV13Audi_Usua_CentroCostoNew = "" ;
      A185Audi_Usua_UsuaMod = "" ;
      A182Audi_Usua_Modo = "" ;
      Gx_emsg = "" ;
      AV16SDTRolUsuItem = new com.orions2.SdtSDTRolUsu_SDTRolUsuItem(remoteHandle, context);
      AV17SDTCECUsuItem = new com.orions2.SdtSDTCECUsu_SDTCECUsuItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.creaauditusuroles__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int GX_INS22 ;
   private int AV21GXV1 ;
   private int AV22GXV2 ;
   private long AV11Usua_Id ;
   private long AV9cons_Numero ;
   private long GXv_int2[] ;
   private long A14Audi_Usua_Id ;
   private long A186Audi_Usua_IdUsu ;
   private String Gx_mode ;
   private String GXv_char1[] ;
   private String A182Audi_Usua_Modo ;
   private String Gx_emsg ;
   private java.util.Date A166Audi_Usua_Fecha ;
   private boolean returnInSub ;
   private String A180Audi_Usua_RolNew ;
   private String AV8Audi_Usua_RolNew ;
   private String A181Audi_Usua_CentroCostoNew ;
   private String AV13Audi_Usua_CentroCostoNew ;
   private String AV10Usua_Codigo ;
   private String AV12Usuario ;
   private String A185Audi_Usua_UsuaMod ;
   private long[] aP0 ;
   private String[] aP1 ;
   private GXBaseCollection<com.orions2.SdtSDTRolUsu_SDTRolUsuItem>[] aP2 ;
   private GXBaseCollection<com.orions2.SdtSDTCECUsu_SDTCECUsuItem>[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private GXBaseCollection<com.orions2.SdtSDTRolUsu_SDTRolUsuItem> AV14SDTRolUsu ;
   private GXBaseCollection<com.orions2.SdtSDTCECUsu_SDTCECUsuItem> AV15SDTCECUsu ;
   private com.orions2.SdtSDTRolUsu_SDTRolUsuItem AV16SDTRolUsuItem ;
   private com.orions2.SdtSDTCECUsu_SDTCECUsuItem AV17SDTCECUsuItem ;
}

final  class creaauditusuroles__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00112", "INSERT INTO SEG_AUDITORIAUSUARIO(Audi_Usua_Id, Audi_Usua_IdUsu, Audi_Usua_Fecha, Audi_Usua_RolNew, Audi_Usua_CentroCostoNew, Audi_Usua_Modo, Audi_Usua_UsuaMod, Audi_Usua_Codigo, Audi_Usua_NombreOld, Audi_Usua_NombreNew, Audi_Usua_EmailOld, Audi_Usua_EmailNew, Audi_Usua_CedulaOld, Audi_Usua_CedulaNew, Audi_Usua_ClaveOld, Audi_Usua_ClaveNew, Audi_Usua_EstadoOld, Audi_Usua_EstadoNew, Audi_Usua_UsuApruebaOld, Audi_Usua_UsuApruebaNew, Audi_Usua_TipoContrOld, Audi_Usua_TipoContrNew) VALUES(?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "SEG_AUDITORIAUSUARIO")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
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
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setLongVarchar(4, (String)parms[3], false);
               stmt.setLongVarchar(5, (String)parms[4], false);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setVarchar(7, (String)parms[6], 30, false);
               return;
      }
   }

}

