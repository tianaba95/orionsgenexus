/*
               File: DPRecordarUsuario
        Description: DPRecordar Usuario
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:55.10
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dprecordarusuario extends GXProcedure
{
   public dprecordarusuario( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dprecordarusuario.class ), "" );
   }

   public dprecordarusuario( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public com.orions2.SdtSDTRecordarUsuario executeUdp( long aP0 )
   {
      dprecordarusuario.this.AV5Usua_Id = aP0;
      dprecordarusuario.this.aP1 = aP1;
      dprecordarusuario.this.aP1 = new com.orions2.SdtSDTRecordarUsuario[] {new com.orions2.SdtSDTRecordarUsuario()};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( long aP0 ,
                        com.orions2.SdtSDTRecordarUsuario[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( long aP0 ,
                             com.orions2.SdtSDTRecordarUsuario[] aP1 )
   {
      dprecordarusuario.this.AV5Usua_Id = aP0;
      dprecordarusuario.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00082 */
      pr_default.execute(0, new Object[] {new Long(AV5Usua_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A23Usua_Id = P00082_A23Usua_Id[0] ;
         A219Usua_Email = P00082_A219Usua_Email[0] ;
         A26Usua_Cedula = P00082_A26Usua_Cedula[0] ;
         Gxm1sdtrecordarusuario.setgxTv_SdtSDTRecordarUsuario_Usuaemail( A219Usua_Email );
         Gxm1sdtrecordarusuario.setgxTv_SdtSDTRecordarUsuario_Usuacedula( A26Usua_Cedula );
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = dprecordarusuario.this.Gxm1sdtrecordarusuario;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm1sdtrecordarusuario = new com.orions2.SdtSDTRecordarUsuario(remoteHandle, context);
      scmdbuf = "" ;
      P00082_A23Usua_Id = new long[1] ;
      P00082_A219Usua_Email = new String[] {""} ;
      P00082_A26Usua_Cedula = new long[1] ;
      A219Usua_Email = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.dprecordarusuario__default(),
         new Object[] {
             new Object[] {
            P00082_A23Usua_Id, P00082_A219Usua_Email, P00082_A26Usua_Cedula
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV5Usua_Id ;
   private long A23Usua_Id ;
   private long A26Usua_Cedula ;
   private String scmdbuf ;
   private String A219Usua_Email ;
   private com.orions2.SdtSDTRecordarUsuario[] aP1 ;
   private IDataStoreProvider pr_default ;
   private long[] P00082_A23Usua_Id ;
   private String[] P00082_A219Usua_Email ;
   private long[] P00082_A26Usua_Cedula ;
   private com.orions2.SdtSDTRecordarUsuario Gxm1sdtrecordarusuario ;
}

final  class dprecordarusuario__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00082", "SELECT Usua_Id, Usua_Email, Usua_Cedula FROM SEG_USUARIO WHERE Usua_Id = ? ORDER BY Usua_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
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

