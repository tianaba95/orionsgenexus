/*
               File: CambiaContrasena
        Description: Cambia Contraseña
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:58.52
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cambiacontrasena extends GXProcedure
{
   public cambiacontrasena( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cambiacontrasena.class ), "" );
   }

   public cambiacontrasena( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      cambiacontrasena.this.AV14Usuario = aP0[0];
      this.aP0 = aP0;
      cambiacontrasena.this.AV9ClaveActual = aP1[0];
      this.aP1 = aP1;
      cambiacontrasena.this.AV8Clave = aP2[0];
      this.aP2 = aP2;
      cambiacontrasena.this.AV12Indicador = aP3[0];
      this.aP3 = aP3;
      cambiacontrasena.this.AV13Nombre = aP4[0];
      this.aP4 = aP4;
      cambiacontrasena.this.aP4 = new String[] {""};
      initialize();
      privateExecute();
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      cambiacontrasena.this.AV14Usuario = aP0[0];
      this.aP0 = aP0;
      cambiacontrasena.this.AV9ClaveActual = aP1[0];
      this.aP1 = aP1;
      cambiacontrasena.this.AV8Clave = aP2[0];
      this.aP2 = aP2;
      cambiacontrasena.this.AV12Indicador = aP3[0];
      this.aP3 = aP3;
      cambiacontrasena.this.AV13Nombre = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12Indicador = "" ;
      /* Using cursor P000X2 */
      pr_default.execute(0, new Object[] {AV14Usuario});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A24Usua_Codigo = P000X2_A24Usua_Codigo[0] ;
         A25Usua_Nombre = P000X2_A25Usua_Nombre[0] ;
         A220Usua_Clave = P000X2_A220Usua_Clave[0] ;
         A228Usua_IndCambioClave = P000X2_A228Usua_IndCambioClave[0] ;
         A23Usua_Id = P000X2_A23Usua_Id[0] ;
         AV11Cryptohash.setAlgorithm( "SHA512" );
         AV10ClaveCripto = GXutil.substring( AV11Cryptohash.compute(GXutil.trim( GXutil.ltrim( AV9ClaveActual)), ""), 1, 20) ;
         AV13Nombre = A25Usua_Nombre ;
         if ( GXutil.strcmp(AV10ClaveCripto, A220Usua_Clave) != 0 )
         {
            AV12Indicador = "E" ;
         }
         else
         {
            AV12Indicador = "A" ;
            A220Usua_Clave = AV11Cryptohash.compute(GXutil.trim( GXutil.ltrim( AV8Clave)), "") ;
            A228Usua_IndCambioClave = "N" ;
         }
         /* Using cursor P000X3 */
         pr_default.execute(1, new Object[] {A220Usua_Clave, A228Usua_IndCambioClave, new Long(A23Usua_Id)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_USUARIO") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = cambiacontrasena.this.AV14Usuario;
      this.aP1[0] = cambiacontrasena.this.AV9ClaveActual;
      this.aP2[0] = cambiacontrasena.this.AV8Clave;
      this.aP3[0] = cambiacontrasena.this.AV12Indicador;
      this.aP4[0] = cambiacontrasena.this.AV13Nombre;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "cambiacontrasena");
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P000X2_A24Usua_Codigo = new String[] {""} ;
      P000X2_A25Usua_Nombre = new String[] {""} ;
      P000X2_A220Usua_Clave = new String[] {""} ;
      P000X2_A228Usua_IndCambioClave = new String[] {""} ;
      P000X2_A23Usua_Id = new long[1] ;
      A24Usua_Codigo = "" ;
      A25Usua_Nombre = "" ;
      A220Usua_Clave = "" ;
      A228Usua_IndCambioClave = "" ;
      AV11Cryptohash = new com.genexus.cryptography.GXHashing();
      AV10ClaveCripto = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.cambiacontrasena__default(),
         new Object[] {
             new Object[] {
            P000X2_A24Usua_Codigo, P000X2_A25Usua_Nombre, P000X2_A220Usua_Clave, P000X2_A228Usua_IndCambioClave, P000X2_A23Usua_Id
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long A23Usua_Id ;
   private String AV12Indicador ;
   private String scmdbuf ;
   private String A228Usua_IndCambioClave ;
   private String AV14Usuario ;
   private String AV9ClaveActual ;
   private String AV8Clave ;
   private String AV13Nombre ;
   private String A24Usua_Codigo ;
   private String A25Usua_Nombre ;
   private String A220Usua_Clave ;
   private String AV10ClaveCripto ;
   private com.genexus.cryptography.GXHashing AV11Cryptohash ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P000X2_A24Usua_Codigo ;
   private String[] P000X2_A25Usua_Nombre ;
   private String[] P000X2_A220Usua_Clave ;
   private String[] P000X2_A228Usua_IndCambioClave ;
   private long[] P000X2_A23Usua_Id ;
}

final  class cambiacontrasena__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000X2", "SELECT Usua_Codigo, Usua_Nombre, Usua_Clave, Usua_IndCambioClave, Usua_Id FROM SEG_USUARIO WHERE Usua_Codigo = ? ORDER BY Usua_Codigo  FOR UPDATE OF Usua_Clave, Usua_IndCambioClave NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P000X3", "UPDATE SEG_USUARIO SET Usua_Clave=?, Usua_IndCambioClave=?  WHERE Usua_Id = ?", GX_NOMASK + GX_MASKLOOPLOCK, "SEG_USUARIO")
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getString(4, 1) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
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
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setBigDecimal(3, ((Number) parms[2]).longValue(), 0);
               return;
      }
   }

}

