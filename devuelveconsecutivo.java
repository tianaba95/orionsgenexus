/*
               File: DevuelveConsecutivo
        Description: Devuelve Consecutivo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:56.45
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class devuelveconsecutivo extends GXProcedure
{
   public devuelveconsecutivo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( devuelveconsecutivo.class ), "" );
   }

   public devuelveconsecutivo( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public long executeUdp( String[] aP0 )
   {
      devuelveconsecutivo.this.AV8cons_Codigo = aP0[0];
      this.aP0 = aP0;
      devuelveconsecutivo.this.AV9Cons_Numero = aP1[0];
      this.aP1 = aP1;
      devuelveconsecutivo.this.aP1 = new long[] {0};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 )
   {
      devuelveconsecutivo.this.AV8cons_Codigo = aP0[0];
      this.aP0 = aP0;
      devuelveconsecutivo.this.AV9Cons_Numero = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12GXLvl3 = (byte)(0) ;
      /* Using cursor P000E2 */
      pr_default.execute(0, new Object[] {AV8cons_Codigo});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8Cons_Codigo = P000E2_A8Cons_Codigo[0] ;
         A131Cons_Numero = P000E2_A131Cons_Numero[0] ;
         AV12GXLvl3 = (byte)(1) ;
         AV9Cons_Numero = (long)(A131Cons_Numero+1) ;
         A131Cons_Numero = (long)(A131Cons_Numero+1) ;
         /* Using cursor P000E3 */
         pr_default.execute(1, new Object[] {new Long(A131Cons_Numero), A8Cons_Codigo});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("GEN_CONSECUTIVO") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV12GXLvl3 == 0 )
      {
         /*
            INSERT RECORD ON TABLE GEN_CONSECUTIVO

         */
         A8Cons_Codigo = AV8cons_Codigo ;
         A131Cons_Numero = 1 ;
         /* Using cursor P000E4 */
         pr_default.execute(2, new Object[] {A8Cons_Codigo, new Long(A131Cons_Numero)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("GEN_CONSECUTIVO") ;
         if ( (pr_default.getStatus(2) == 1) )
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
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = devuelveconsecutivo.this.AV8cons_Codigo;
      this.aP1[0] = devuelveconsecutivo.this.AV9Cons_Numero;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "devuelveconsecutivo");
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
      P000E2_A8Cons_Codigo = new String[] {""} ;
      P000E2_A131Cons_Numero = new long[1] ;
      A8Cons_Codigo = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.devuelveconsecutivo__default(),
         new Object[] {
             new Object[] {
            P000E2_A8Cons_Codigo, P000E2_A131Cons_Numero
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

   private byte AV12GXLvl3 ;
   private short Gx_err ;
   private int GX_INS19 ;
   private long AV9Cons_Numero ;
   private long A131Cons_Numero ;
   private String AV8cons_Codigo ;
   private String scmdbuf ;
   private String A8Cons_Codigo ;
   private String Gx_emsg ;
   private String[] aP0 ;
   private long[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P000E2_A8Cons_Codigo ;
   private long[] P000E2_A131Cons_Numero ;
}

final  class devuelveconsecutivo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000E2", "SELECT Cons_Codigo, Cons_Numero FROM GEN_CONSECUTIVO WHERE Cons_Codigo = ? ORDER BY Cons_Codigo  FOR UPDATE OF Cons_Numero NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P000E3", "UPDATE GEN_CONSECUTIVO SET Cons_Numero=?  WHERE Cons_Codigo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "GEN_CONSECUTIVO")
         ,new UpdateCursor("P000E4", "INSERT INTO GEN_CONSECUTIVO(Cons_Codigo, Cons_Numero) VALUES(?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "GEN_CONSECUTIVO")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
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
               stmt.setString(1, (String)parms[0], 5);
               return;
            case 1 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               stmt.setString(2, (String)parms[1], 5);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 5);
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
      }
   }

}

