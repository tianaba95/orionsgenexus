/*
               File: PEstadoNovedad
        Description: PEstado Novedad
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 15, 2018 11:8:25.60
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pestadonovedad extends GXProcedure
{
   public pestadonovedad( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pestadonovedad.class ), "" );
   }

   public pestadonovedad( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long[] aP0 ,
                             String[] aP1 )
   {
      pestadonovedad.this.AV8Nove_Identificador = aP0[0];
      this.aP0 = aP0;
      pestadonovedad.this.AV9Nove_Estado = aP1[0];
      this.aP1 = aP1;
      pestadonovedad.this.AV10Nove_RespuestaProc = aP2[0];
      this.aP2 = aP2;
      pestadonovedad.this.aP2 = new String[] {""};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( long[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      pestadonovedad.this.AV8Nove_Identificador = aP0[0];
      this.aP0 = aP0;
      pestadonovedad.this.AV9Nove_Estado = aP1[0];
      this.aP1 = aP1;
      pestadonovedad.this.AV10Nove_RespuestaProc = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P002H2 */
      pr_default.execute(0, new Object[] {new Long(AV8Nove_Identificador)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A106Nove_Identificador = P002H2_A106Nove_Identificador[0] ;
         A803Nove_Masivo = P002H2_A803Nove_Masivo[0] ;
         n803Nove_Masivo = P002H2_n803Nove_Masivo[0] ;
         A765Nove_Estado = P002H2_A765Nove_Estado[0] ;
         n765Nove_Estado = P002H2_n765Nove_Estado[0] ;
         A815Nove_RespuestaProc = P002H2_A815Nove_RespuestaProc[0] ;
         n815Nove_RespuestaProc = P002H2_n815Nove_RespuestaProc[0] ;
         if ( ( GXutil.strcmp(A803Nove_Masivo, "SI") == 0 ) && ( GXutil.strcmp(AV9Nove_Estado, "F") == 0 ) )
         {
            A765Nove_Estado = "E" ;
            n765Nove_Estado = false ;
         }
         A815Nove_RespuestaProc = AV10Nove_RespuestaProc ;
         n815Nove_RespuestaProc = false ;
         /* Using cursor P002H3 */
         pr_default.execute(1, new Object[] {new Boolean(n765Nove_Estado), A765Nove_Estado, new Boolean(n815Nove_RespuestaProc), A815Nove_RespuestaProc, new Long(A106Nove_Identificador)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_NOVEDAD") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pestadonovedad.this.AV8Nove_Identificador;
      this.aP1[0] = pestadonovedad.this.AV9Nove_Estado;
      this.aP2[0] = pestadonovedad.this.AV10Nove_RespuestaProc;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "pestadonovedad");
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
      P002H2_A106Nove_Identificador = new long[1] ;
      P002H2_A803Nove_Masivo = new String[] {""} ;
      P002H2_n803Nove_Masivo = new boolean[] {false} ;
      P002H2_A765Nove_Estado = new String[] {""} ;
      P002H2_n765Nove_Estado = new boolean[] {false} ;
      P002H2_A815Nove_RespuestaProc = new String[] {""} ;
      P002H2_n815Nove_RespuestaProc = new boolean[] {false} ;
      A803Nove_Masivo = "" ;
      A765Nove_Estado = "" ;
      A815Nove_RespuestaProc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.pestadonovedad__default(),
         new Object[] {
             new Object[] {
            P002H2_A106Nove_Identificador, P002H2_A803Nove_Masivo, P002H2_n803Nove_Masivo, P002H2_A765Nove_Estado, P002H2_n765Nove_Estado, P002H2_A815Nove_RespuestaProc, P002H2_n815Nove_RespuestaProc
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV8Nove_Identificador ;
   private long A106Nove_Identificador ;
   private String AV9Nove_Estado ;
   private String scmdbuf ;
   private String A765Nove_Estado ;
   private boolean n803Nove_Masivo ;
   private boolean n765Nove_Estado ;
   private boolean n815Nove_RespuestaProc ;
   private String AV10Nove_RespuestaProc ;
   private String A803Nove_Masivo ;
   private String A815Nove_RespuestaProc ;
   private long[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private long[] P002H2_A106Nove_Identificador ;
   private String[] P002H2_A803Nove_Masivo ;
   private boolean[] P002H2_n803Nove_Masivo ;
   private String[] P002H2_A765Nove_Estado ;
   private boolean[] P002H2_n765Nove_Estado ;
   private String[] P002H2_A815Nove_RespuestaProc ;
   private boolean[] P002H2_n815Nove_RespuestaProc ;
}

final  class pestadonovedad__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002H2", "SELECT Nove_Identificador, Nove_Masivo, Nove_Estado, Nove_RespuestaProc FROM ALM_NOVEDAD WHERE Nove_Identificador = ? ORDER BY Nove_Identificador  FOR UPDATE OF Nove_Estado, Nove_RespuestaProc NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P002H3", "UPDATE ALM_NOVEDAD SET Nove_Estado=?, Nove_RespuestaProc=?  WHERE Nove_Identificador = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_NOVEDAD")
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 200);
               }
               stmt.setLong(3, ((Number) parms[4]).longValue());
               return;
      }
   }

}

