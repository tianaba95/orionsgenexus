/*
               File: ValidaUsuario
        Description: Valida Usuario
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:58.68
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class validausuario extends GXProcedure
{
   public validausuario( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( validausuario.class ), "" );
   }

   public validausuario( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public long executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           String[] aP4 ,
                           String[] aP5 )
   {
      validausuario.this.AV14Usuario = aP0[0];
      this.aP0 = aP0;
      validausuario.this.AV8Clave = aP1[0];
      this.aP1 = aP1;
      validausuario.this.AV10Indicador = aP2[0];
      this.aP2 = aP2;
      validausuario.this.AV13Usua_IndCambioClave = aP3[0];
      this.aP3 = aP3;
      validausuario.this.AV11Usua_Administrador = aP4[0];
      this.aP4 = aP4;
      validausuario.this.AV15Nombre = aP5[0];
      this.aP5 = aP5;
      validausuario.this.AV16Usua_Id = aP6[0];
      this.aP6 = aP6;
      validausuario.this.aP6 = new long[] {0};
      initialize();
      privateExecute();
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        long[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             long[] aP6 )
   {
      validausuario.this.AV14Usuario = aP0[0];
      this.aP0 = aP0;
      validausuario.this.AV8Clave = aP1[0];
      this.aP1 = aP1;
      validausuario.this.AV10Indicador = aP2[0];
      this.aP2 = aP2;
      validausuario.this.AV13Usua_IndCambioClave = aP3[0];
      this.aP3 = aP3;
      validausuario.this.AV11Usua_Administrador = aP4[0];
      this.aP4 = aP4;
      validausuario.this.AV15Nombre = aP5[0];
      this.aP5 = aP5;
      validausuario.this.AV16Usua_Id = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Indicador = "" ;
      AV19GXLvl5 = (byte)(0) ;
      /* Using cursor P000Z2 */
      pr_default.execute(0, new Object[] {AV14Usuario});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A24Usua_Codigo = P000Z2_A24Usua_Codigo[0] ;
         A23Usua_Id = P000Z2_A23Usua_Id[0] ;
         A228Usua_IndCambioClave = P000Z2_A228Usua_IndCambioClave[0] ;
         A229Usua_Administrador = P000Z2_A229Usua_Administrador[0] ;
         A25Usua_Nombre = P000Z2_A25Usua_Nombre[0] ;
         A220Usua_Clave = P000Z2_A220Usua_Clave[0] ;
         A221Usua_Estado = P000Z2_A221Usua_Estado[0] ;
         AV19GXLvl5 = (byte)(1) ;
         AV9CryptoHash.setAlgorithm( "SHA512" );
         AV12Usua_Clave = GXutil.substring( AV9CryptoHash.compute(GXutil.trim( GXutil.ltrim( AV8Clave)), ""), 1, 20) ;
         AV16Usua_Id = A23Usua_Id ;
         AV13Usua_IndCambioClave = A228Usua_IndCambioClave ;
         AV11Usua_Administrador = A229Usua_Administrador ;
         AV15Nombre = A25Usua_Nombre ;
         if ( GXutil.strcmp(AV12Usua_Clave, A220Usua_Clave) == 0 )
         {
            AV10Indicador = "A" ;
         }
         else
         {
            AV10Indicador = "E" ;
         }
         if ( GXutil.strcmp(A221Usua_Estado, "I") == 0 )
         {
            AV10Indicador = "I" ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV19GXLvl5 == 0 )
      {
         AV10Indicador = "N" ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = validausuario.this.AV14Usuario;
      this.aP1[0] = validausuario.this.AV8Clave;
      this.aP2[0] = validausuario.this.AV10Indicador;
      this.aP3[0] = validausuario.this.AV13Usua_IndCambioClave;
      this.aP4[0] = validausuario.this.AV11Usua_Administrador;
      this.aP5[0] = validausuario.this.AV15Nombre;
      this.aP6[0] = validausuario.this.AV16Usua_Id;
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
      P000Z2_A24Usua_Codigo = new String[] {""} ;
      P000Z2_A23Usua_Id = new long[1] ;
      P000Z2_A228Usua_IndCambioClave = new String[] {""} ;
      P000Z2_A229Usua_Administrador = new String[] {""} ;
      P000Z2_A25Usua_Nombre = new String[] {""} ;
      P000Z2_A220Usua_Clave = new String[] {""} ;
      P000Z2_A221Usua_Estado = new String[] {""} ;
      A24Usua_Codigo = "" ;
      A228Usua_IndCambioClave = "" ;
      A229Usua_Administrador = "" ;
      A25Usua_Nombre = "" ;
      A220Usua_Clave = "" ;
      A221Usua_Estado = "" ;
      AV9CryptoHash = new com.genexus.cryptography.GXHashing();
      AV12Usua_Clave = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.validausuario__default(),
         new Object[] {
             new Object[] {
            P000Z2_A24Usua_Codigo, P000Z2_A23Usua_Id, P000Z2_A228Usua_IndCambioClave, P000Z2_A229Usua_Administrador, P000Z2_A25Usua_Nombre, P000Z2_A220Usua_Clave, P000Z2_A221Usua_Estado
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19GXLvl5 ;
   private short Gx_err ;
   private long AV16Usua_Id ;
   private long A23Usua_Id ;
   private String AV10Indicador ;
   private String AV13Usua_IndCambioClave ;
   private String AV11Usua_Administrador ;
   private String scmdbuf ;
   private String A228Usua_IndCambioClave ;
   private String A229Usua_Administrador ;
   private String A221Usua_Estado ;
   private String AV14Usuario ;
   private String AV8Clave ;
   private String AV15Nombre ;
   private String A24Usua_Codigo ;
   private String A25Usua_Nombre ;
   private String A220Usua_Clave ;
   private String AV12Usua_Clave ;
   private com.genexus.cryptography.GXHashing AV9CryptoHash ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private long[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P000Z2_A24Usua_Codigo ;
   private long[] P000Z2_A23Usua_Id ;
   private String[] P000Z2_A228Usua_IndCambioClave ;
   private String[] P000Z2_A229Usua_Administrador ;
   private String[] P000Z2_A25Usua_Nombre ;
   private String[] P000Z2_A220Usua_Clave ;
   private String[] P000Z2_A221Usua_Estado ;
}

final  class validausuario__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000Z2", "SELECT Usua_Codigo, Usua_Id, Usua_IndCambioClave, Usua_Administrador, Usua_Nombre, Usua_Clave, Usua_Estado FROM SEG_USUARIO WHERE Usua_Codigo = ? ORDER BY Usua_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 1) ;
               ((String[]) buf[3])[0] = rslt.getString(4, 1) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getString(7, 1) ;
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

