/*
               File: PR_USUARIOROL
        Description: MODIFICAR USUARIO
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:59.0
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pr_usuariorol extends GXProcedure
{
   public pr_usuariorol( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pr_usuariorol.class ), "" );
   }

   public pr_usuariorol( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long[] aP0 ,
                             String[] aP1 ,
                             GXBaseCollection<com.orions2.SdtSDTRolUsu_SDTRolUsuItem>[] aP2 ,
                             GXBaseCollection<com.orions2.SdtSDTCECUsu_SDTCECUsuItem>[] aP3 )
   {
      pr_usuariorol.this.AV10pUsua_Id = aP0[0];
      this.aP0 = aP0;
      pr_usuariorol.this.AV16Usua_Codigo = aP1[0];
      this.aP1 = aP1;
      pr_usuariorol.this.AV13SDTRolUsu = aP2[0];
      this.aP2 = aP2;
      pr_usuariorol.this.AV11SDTCECUsu = aP3[0];
      this.aP3 = aP3;
      pr_usuariorol.this.AV17Usuario = aP4[0];
      this.aP4 = aP4;
      pr_usuariorol.this.aP4 = new String[] {""};
      initialize();
      privateExecute();
      return aP4[0];
   }

   public void execute( long[] aP0 ,
                        String[] aP1 ,
                        GXBaseCollection<com.orions2.SdtSDTRolUsu_SDTRolUsuItem>[] aP2 ,
                        GXBaseCollection<com.orions2.SdtSDTCECUsu_SDTCECUsuItem>[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( long[] aP0 ,
                             String[] aP1 ,
                             GXBaseCollection<com.orions2.SdtSDTRolUsu_SDTRolUsuItem>[] aP2 ,
                             GXBaseCollection<com.orions2.SdtSDTCECUsu_SDTCECUsuItem>[] aP3 ,
                             String[] aP4 )
   {
      pr_usuariorol.this.AV10pUsua_Id = aP0[0];
      this.aP0 = aP0;
      pr_usuariorol.this.AV16Usua_Codigo = aP1[0];
      this.aP1 = aP1;
      pr_usuariorol.this.AV13SDTRolUsu = aP2[0];
      this.aP2 = aP2;
      pr_usuariorol.this.AV11SDTCECUsu = aP3[0];
      this.aP3 = aP3;
      pr_usuariorol.this.AV17Usuario = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: 'INICIO' */
      S111 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'INICIO' Routine */
      /* Execute user subroutine: 'LIMPIARROLES' */
      S121 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LIMPIARCENTRO' */
      S131 ();
      if (returnInSub) return;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "pr_usuariorol");
      /* Execute user subroutine: 'ACTUALIZARROLES' */
      S141 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'ACTUALIZARCENTROS' */
      S151 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'AUDITORIAUSUARIO' */
      S161 ();
      if (returnInSub) return;
   }

   public void S121( )
   {
      /* 'LIMPIARROLES' Routine */
      if ( AV13SDTRolUsu.size() > 0 )
      {
         /* Using cursor P00122 */
         pr_default.execute(0, new Object[] {new Long(AV10pUsua_Id)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A23Usua_Id = P00122_A23Usua_Id[0] ;
            A21Rol_Id = P00122_A21Rol_Id[0] ;
            AV20Rol_Id = A21Rol_Id ;
            /* Execute user subroutine: 'CAMBIAADMINISTRADOR' */
            S172 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
            /* Using cursor P00123 */
            pr_default.execute(1, new Object[] {new Long(A23Usua_Id), new Long(A21Rol_Id)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_USUARIO_ROL") ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
   }

   public void S131( )
   {
      /* 'LIMPIARCENTRO' Routine */
      if ( AV11SDTCECUsu.size() >= 0 )
      {
         /* Optimized DELETE. */
         /* Using cursor P00124 */
         pr_default.execute(2, new Object[] {new Long(AV10pUsua_Id)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_USUARIO_CENTRO") ;
         /* End optimized DELETE. */
      }
   }

   public void S141( )
   {
      /* 'ACTUALIZARROLES' Routine */
      if ( AV13SDTRolUsu.size() > 0 )
      {
         AV25GXV1 = 1 ;
         while ( AV25GXV1 <= AV13SDTRolUsu.size() )
         {
            AV14SDTRolUsuItem = (com.orions2.SdtSDTRolUsu_SDTRolUsuItem)((com.orions2.SdtSDTRolUsu_SDTRolUsuItem)AV13SDTRolUsu.elementAt(-1+AV25GXV1));
            /*
               INSERT RECORD ON TABLE SEG_USUARIO_ROL

            */
            A23Usua_Id = AV10pUsua_Id ;
            A21Rol_Id = AV14SDTRolUsuItem.getgxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_id() ;
            /* Using cursor P00125 */
            pr_default.execute(3, new Object[] {new Long(A23Usua_Id), new Long(A21Rol_Id)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_USUARIO_ROL") ;
            if ( (pr_default.getStatus(3) == 1) )
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
            /* Execute user subroutine: 'ADMINISTRADOR' */
            S181 ();
            if (returnInSub) return;
            AV25GXV1 = (int)(AV25GXV1+1) ;
         }
      }
   }

   public void S151( )
   {
      /* 'ACTUALIZARCENTROS' Routine */
      if ( AV11SDTCECUsu.size() > 0 )
      {
         AV26GXV2 = 1 ;
         while ( AV26GXV2 <= AV11SDTCECUsu.size() )
         {
            AV12SDTCECUsuItem = (com.orions2.SdtSDTCECUsu_SDTCECUsuItem)((com.orions2.SdtSDTCECUsu_SDTCECUsuItem)AV11SDTCECUsu.elementAt(-1+AV26GXV2));
            /*
               INSERT RECORD ON TABLE SEG_USUARIO_CENTRO

            */
            A23Usua_Id = AV10pUsua_Id ;
            A1Cent_Id = AV12SDTCECUsuItem.getgxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_id() ;
            /* Using cursor P00126 */
            pr_default.execute(4, new Object[] {new Long(A23Usua_Id), new Long(A1Cent_Id)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_USUARIO_CENTRO") ;
            if ( (pr_default.getStatus(4) == 1) )
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
            AV26GXV2 = (int)(AV26GXV2+1) ;
         }
      }
   }

   public void S161( )
   {
      /* 'AUDITORIAUSUARIO' Routine */
      GXv_int1[0] = AV10pUsua_Id ;
      GXv_char2[0] = AV16Usua_Codigo ;
      GXv_objcol_SdtSDTRolUsu_SDTRolUsuItem3[0] = AV13SDTRolUsu ;
      GXv_objcol_SdtSDTCECUsu_SDTCECUsuItem4[0] = AV11SDTCECUsu ;
      GXv_char5[0] = "UDP" ;
      GXv_char6[0] = AV17Usuario ;
      new com.orions2.creaauditusuroles(remoteHandle, context).execute( GXv_int1, GXv_char2, GXv_objcol_SdtSDTRolUsu_SDTRolUsuItem3, GXv_objcol_SdtSDTCECUsu_SDTCECUsuItem4, GXv_char5, GXv_char6) ;
      pr_usuariorol.this.AV10pUsua_Id = GXv_int1[0] ;
      pr_usuariorol.this.AV16Usua_Codigo = GXv_char2[0] ;
      AV13SDTRolUsu = GXv_objcol_SdtSDTRolUsu_SDTRolUsuItem3[0] ;
      AV11SDTCECUsu = GXv_objcol_SdtSDTCECUsu_SDTCECUsuItem4[0] ;
      pr_usuariorol.this.AV17Usuario = GXv_char6[0] ;
   }

   public void S191( )
   {
      /* 'DATOSWS' Routine */
      GXv_char6[0] = AV8Host ;
      GXv_char5[0] = AV15URL ;
      GXv_int7[0] = AV9Puerto ;
      new com.orions2.parametrosservicios(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_int7) ;
      pr_usuariorol.this.AV8Host = GXv_char6[0] ;
      pr_usuariorol.this.AV15URL = GXv_char5[0] ;
      pr_usuariorol.this.AV9Puerto = GXv_int7[0] ;
      AV18HttpClient.setHost( AV8Host );
      AV18HttpClient.setPort( AV9Puerto );
      AV18HttpClient.setBaseURL( AV15URL );
   }

   public void S181( )
   {
      /* 'ADMINISTRADOR' Routine */
      /* Using cursor P00127 */
      pr_default.execute(5, new Object[] {new Long(AV14SDTRolUsuItem.getgxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_id())});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A21Rol_Id = P00127_A21Rol_Id[0] ;
         A402Rol_Tipo = P00127_A402Rol_Tipo[0] ;
         AV19Rol_Tipo = A402Rol_Tipo ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
      if ( GXutil.strcmp(AV19Rol_Tipo, "S") == 0 )
      {
         /* Optimized UPDATE. */
         /* Using cursor P00128 */
         pr_default.execute(6, new Object[] {new Long(AV10pUsua_Id)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_USUARIO") ;
         Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_USUARIO") ;
         /* End optimized UPDATE. */
      }
   }

   public void S172( )
   {
      /* 'CAMBIAADMINISTRADOR' Routine */
      /* Optimized UPDATE. */
      /* Using cursor P00129 */
      pr_default.execute(7, new Object[] {new Long(AV10pUsua_Id)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_USUARIO") ;
      Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_USUARIO") ;
      /* End optimized UPDATE. */
   }

   protected void cleanup( )
   {
      this.aP0[0] = pr_usuariorol.this.AV10pUsua_Id;
      this.aP1[0] = pr_usuariorol.this.AV16Usua_Codigo;
      this.aP2[0] = pr_usuariorol.this.AV13SDTRolUsu;
      this.aP3[0] = pr_usuariorol.this.AV11SDTCECUsu;
      this.aP4[0] = pr_usuariorol.this.AV17Usuario;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "pr_usuariorol");
      CloseOpenCursors();
      AV18HttpClient.cleanup();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P00122_A23Usua_Id = new long[1] ;
      P00122_A21Rol_Id = new long[1] ;
      AV14SDTRolUsuItem = new com.orions2.SdtSDTRolUsu_SDTRolUsuItem(remoteHandle, context);
      Gx_emsg = "" ;
      AV12SDTCECUsuItem = new com.orions2.SdtSDTCECUsu_SDTCECUsuItem(remoteHandle, context);
      GXv_int1 = new long [1] ;
      GXv_char2 = new String [1] ;
      GXv_objcol_SdtSDTRolUsu_SDTRolUsuItem3 = new GXBaseCollection [1] ;
      GXv_objcol_SdtSDTCECUsu_SDTCECUsuItem4 = new GXBaseCollection [1] ;
      AV8Host = "" ;
      GXv_char6 = new String [1] ;
      AV15URL = "" ;
      GXv_char5 = new String [1] ;
      GXv_int7 = new short [1] ;
      AV18HttpClient = new com.genexus.internet.HttpClient();
      P00127_A21Rol_Id = new long[1] ;
      P00127_A402Rol_Tipo = new String[] {""} ;
      A402Rol_Tipo = "" ;
      AV19Rol_Tipo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.pr_usuariorol__default(),
         new Object[] {
             new Object[] {
            P00122_A23Usua_Id, P00122_A21Rol_Id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00127_A21Rol_Id, P00127_A402Rol_Tipo
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private short AV9Puerto ;
   private short GXv_int7[] ;
   private int AV25GXV1 ;
   private int GX_INS6 ;
   private int AV26GXV2 ;
   private int GX_INS4 ;
   private long AV10pUsua_Id ;
   private long A23Usua_Id ;
   private long A21Rol_Id ;
   private long AV20Rol_Id ;
   private long A1Cent_Id ;
   private long GXv_int1[] ;
   private String scmdbuf ;
   private String Gx_emsg ;
   private String GXv_char2[] ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String A402Rol_Tipo ;
   private String AV19Rol_Tipo ;
   private boolean returnInSub ;
   private String AV16Usua_Codigo ;
   private String AV17Usuario ;
   private String AV8Host ;
   private String AV15URL ;
   private com.genexus.internet.HttpClient AV18HttpClient ;
   private long[] aP0 ;
   private String[] aP1 ;
   private GXBaseCollection<com.orions2.SdtSDTRolUsu_SDTRolUsuItem>[] aP2 ;
   private GXBaseCollection<com.orions2.SdtSDTCECUsu_SDTCECUsuItem>[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private long[] P00122_A23Usua_Id ;
   private long[] P00122_A21Rol_Id ;
   private long[] P00127_A21Rol_Id ;
   private String[] P00127_A402Rol_Tipo ;
   private GXBaseCollection<com.orions2.SdtSDTCECUsu_SDTCECUsuItem> AV11SDTCECUsu ;
   private GXBaseCollection<com.orions2.SdtSDTCECUsu_SDTCECUsuItem> GXv_objcol_SdtSDTCECUsu_SDTCECUsuItem4[] ;
   private GXBaseCollection<com.orions2.SdtSDTRolUsu_SDTRolUsuItem> AV13SDTRolUsu ;
   private GXBaseCollection<com.orions2.SdtSDTRolUsu_SDTRolUsuItem> GXv_objcol_SdtSDTRolUsu_SDTRolUsuItem3[] ;
   private com.orions2.SdtSDTCECUsu_SDTCECUsuItem AV12SDTCECUsuItem ;
   private com.orions2.SdtSDTRolUsu_SDTRolUsuItem AV14SDTRolUsuItem ;
}

final  class pr_usuariorol__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00122", "SELECT Usua_Id, Rol_Id FROM SEG_USUARIO_ROL WHERE Usua_Id = ? ORDER BY Usua_Id, Rol_Id ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("P00123", "DELETE FROM SEG_USUARIO_ROL  WHERE Usua_Id = ? AND Rol_Id = ?", GX_NOMASK + GX_MASKLOOPLOCK, "SEG_USUARIO_ROL")
         ,new UpdateCursor("P00124", "DELETE FROM SEG_USUARIO_CENTRO  WHERE Usua_Id = ?", GX_NOMASK + GX_MASKLOOPLOCK, "SEG_USUARIO_CENTRO")
         ,new UpdateCursor("P00125", "INSERT INTO SEG_USUARIO_ROL(Usua_Id, Rol_Id) VALUES(?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "SEG_USUARIO_ROL")
         ,new UpdateCursor("P00126", "INSERT INTO SEG_USUARIO_CENTRO(Usua_Id, Cent_Id) VALUES(?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "SEG_USUARIO_CENTRO")
         ,new ForEachCursor("P00127", "SELECT Rol_Id, Rol_Tipo FROM SEG_ROL WHERE Rol_Id = ? ORDER BY Rol_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P00128", "UPDATE SEG_USUARIO SET Usua_Administrador='S'  WHERE Usua_Id = ?", GX_NOMASK + GX_MASKLOOPLOCK, "SEG_USUARIO")
         ,new UpdateCursor("P00129", "UPDATE SEG_USUARIO SET Usua_Administrador='N'  WHERE Usua_Id = ?", GX_NOMASK + GX_MASKLOOPLOCK, "SEG_USUARIO")
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
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 1) ;
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 3 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 4 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 6 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 7 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
      }
   }

}

