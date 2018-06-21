/*
               File: PrcRecordarContrasena
        Description: Prc Recordar Contraseña
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:58.62
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prcrecordarcontrasena extends GXProcedure
{
   public prcrecordarcontrasena( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prcrecordarcontrasena.class ), "" );
   }

   public prcrecordarcontrasena( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      prcrecordarcontrasena.this.AV8Usuario = aP0[0];
      this.aP0 = aP0;
      prcrecordarcontrasena.this.AV9Indicador = aP1[0];
      this.aP1 = aP1;
      prcrecordarcontrasena.this.AV10Usua_Email = aP2[0];
      this.aP2 = aP2;
      prcrecordarcontrasena.this.aP2 = new String[] {""};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      prcrecordarcontrasena.this.AV8Usuario = aP0[0];
      this.aP0 = aP0;
      prcrecordarcontrasena.this.AV9Indicador = aP1[0];
      this.aP1 = aP1;
      prcrecordarcontrasena.this.AV10Usua_Email = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Indicador = "" ;
      AV18GXLvl2 = (byte)(0) ;
      /* Using cursor P000Y2 */
      pr_default.execute(0, new Object[] {AV8Usuario});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A24Usua_Codigo = P000Y2_A24Usua_Codigo[0] ;
         A221Usua_Estado = P000Y2_A221Usua_Estado[0] ;
         A219Usua_Email = P000Y2_A219Usua_Email[0] ;
         A26Usua_Cedula = P000Y2_A26Usua_Cedula[0] ;
         A220Usua_Clave = P000Y2_A220Usua_Clave[0] ;
         A228Usua_IndCambioClave = P000Y2_A228Usua_IndCambioClave[0] ;
         A23Usua_Id = P000Y2_A23Usua_Id[0] ;
         AV18GXLvl2 = (byte)(1) ;
         if ( GXutil.strcmp(A221Usua_Estado, "I") == 0 )
         {
            AV9Indicador = "I" ;
         }
         else
         {
            AV10Usua_Email = A219Usua_Email ;
            AV11CryptoHash.setAlgorithm( "SHA512" );
            A220Usua_Clave = AV11CryptoHash.compute(GXutil.trim( GXutil.ltrim( GXutil.str( A26Usua_Cedula, 18, 0))), "") ;
            A228Usua_IndCambioClave = "S" ;
            AV9Indicador = "S" ;
         }
         /* Using cursor P000Y3 */
         pr_default.execute(1, new Object[] {A220Usua_Clave, A228Usua_IndCambioClave, new Long(A23Usua_Id)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_USUARIO") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV18GXLvl2 == 0 )
      {
         AV9Indicador = "N" ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prcrecordarcontrasena.this.AV8Usuario;
      this.aP1[0] = prcrecordarcontrasena.this.AV9Indicador;
      this.aP2[0] = prcrecordarcontrasena.this.AV10Usua_Email;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "prcrecordarcontrasena");
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
      P000Y2_A24Usua_Codigo = new String[] {""} ;
      P000Y2_A221Usua_Estado = new String[] {""} ;
      P000Y2_A219Usua_Email = new String[] {""} ;
      P000Y2_A26Usua_Cedula = new long[1] ;
      P000Y2_A220Usua_Clave = new String[] {""} ;
      P000Y2_A228Usua_IndCambioClave = new String[] {""} ;
      P000Y2_A23Usua_Id = new long[1] ;
      A24Usua_Codigo = "" ;
      A221Usua_Estado = "" ;
      A219Usua_Email = "" ;
      A220Usua_Clave = "" ;
      A228Usua_IndCambioClave = "" ;
      AV11CryptoHash = new com.genexus.cryptography.GXHashing();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.prcrecordarcontrasena__default(),
         new Object[] {
             new Object[] {
            P000Y2_A24Usua_Codigo, P000Y2_A221Usua_Estado, P000Y2_A219Usua_Email, P000Y2_A26Usua_Cedula, P000Y2_A220Usua_Clave, P000Y2_A228Usua_IndCambioClave, P000Y2_A23Usua_Id
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18GXLvl2 ;
   private short Gx_err ;
   private long A26Usua_Cedula ;
   private long A23Usua_Id ;
   private String AV9Indicador ;
   private String scmdbuf ;
   private String A221Usua_Estado ;
   private String A228Usua_IndCambioClave ;
   private String AV8Usuario ;
   private String AV10Usua_Email ;
   private String A24Usua_Codigo ;
   private String A219Usua_Email ;
   private String A220Usua_Clave ;
   private com.genexus.cryptography.GXHashing AV11CryptoHash ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P000Y2_A24Usua_Codigo ;
   private String[] P000Y2_A221Usua_Estado ;
   private String[] P000Y2_A219Usua_Email ;
   private long[] P000Y2_A26Usua_Cedula ;
   private String[] P000Y2_A220Usua_Clave ;
   private String[] P000Y2_A228Usua_IndCambioClave ;
   private long[] P000Y2_A23Usua_Id ;
}

final  class prcrecordarcontrasena__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000Y2", "SELECT Usua_Codigo, Usua_Estado, Usua_Email, Usua_Cedula, Usua_Clave, Usua_IndCambioClave, Usua_Id FROM SEG_USUARIO WHERE Usua_Codigo = ? ORDER BY Usua_Codigo  FOR UPDATE OF Usua_Clave, Usua_IndCambioClave NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P000Y3", "UPDATE SEG_USUARIO SET Usua_Clave=?, Usua_IndCambioClave=?  WHERE Usua_Id = ?", GX_NOMASK + GX_MASKLOOPLOCK, "SEG_USUARIO")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getString(6, 1) ;
               ((long[]) buf[6])[0] = rslt.getLong(7) ;
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

