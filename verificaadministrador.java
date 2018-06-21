/*
               File: VerificaAdministrador
        Description: Verifica Administrador
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:11.78
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class verificaadministrador extends GXProcedure
{
   public verificaadministrador( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( verificaadministrador.class ), "" );
   }

   public verificaadministrador( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long[] aP0 )
   {
      verificaadministrador.this.AV8Usua_Id = aP0[0];
      this.aP0 = aP0;
      verificaadministrador.this.AV9Usua_Administrador = aP1[0];
      this.aP1 = aP1;
      verificaadministrador.this.aP1 = new String[] {""};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( long[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( long[] aP0 ,
                             String[] aP1 )
   {
      verificaadministrador.this.AV8Usua_Id = aP0[0];
      this.aP0 = aP0;
      verificaadministrador.this.AV9Usua_Administrador = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Usua_Administrador = "" ;
      /* Using cursor P00292 */
      pr_default.execute(0, new Object[] {new Long(AV8Usua_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A23Usua_Id = P00292_A23Usua_Id[0] ;
         A229Usua_Administrador = P00292_A229Usua_Administrador[0] ;
         AV9Usua_Administrador = A229Usua_Administrador ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = verificaadministrador.this.AV8Usua_Id;
      this.aP1[0] = verificaadministrador.this.AV9Usua_Administrador;
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
      P00292_A23Usua_Id = new long[1] ;
      P00292_A229Usua_Administrador = new String[] {""} ;
      A229Usua_Administrador = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.verificaadministrador__default(),
         new Object[] {
             new Object[] {
            P00292_A23Usua_Id, P00292_A229Usua_Administrador
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV8Usua_Id ;
   private long A23Usua_Id ;
   private String AV9Usua_Administrador ;
   private String scmdbuf ;
   private String A229Usua_Administrador ;
   private long[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private long[] P00292_A23Usua_Id ;
   private String[] P00292_A229Usua_Administrador ;
}

final  class verificaadministrador__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00292", "SELECT Usua_Id, Usua_Administrador FROM SEG_USUARIO WHERE Usua_Id = ? ORDER BY Usua_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
      }
   }

}

