/*
               File: PRatificaPadres
        Description: PRatifica Padres
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:57.54
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pratificapadres extends GXProcedure
{
   public pratificapadres( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pratificapadres.class ), "" );
   }

   public pratificapadres( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public long executeUdp( )
   {
      pratificapadres.this.AV8Tran_Id = aP0[0];
      this.aP0 = aP0;
      pratificapadres.this.aP0 = new long[] {0};
      initialize();
      privateExecute();
      return aP0[0];
   }

   public void execute( long[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( long[] aP0 )
   {
      pratificapadres.this.AV8Tran_Id = aP0[0];
      this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000J2 */
      pr_default.execute(0, new Object[] {new Long(AV8Tran_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A46Tran_Id = P000J2_A46Tran_Id[0] ;
         A58Tran_Estado = P000J2_A58Tran_Estado[0] ;
         n58Tran_Estado = P000J2_n58Tran_Estado[0] ;
         A390Tran_FechaRatificacion = P000J2_A390Tran_FechaRatificacion[0] ;
         n390Tran_FechaRatificacion = P000J2_n390Tran_FechaRatificacion[0] ;
         A58Tran_Estado = "R" ;
         n58Tran_Estado = false ;
         A390Tran_FechaRatificacion = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n390Tran_FechaRatificacion = false ;
         /* Using cursor P000J3 */
         pr_default.execute(1, new Object[] {new Long(A46Tran_Id)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A66Elem_Consecutivo = P000J3_A66Elem_Consecutivo[0] ;
            A490TDet_PlacaNumero = P000J3_A490TDet_PlacaNumero[0] ;
            n490TDet_PlacaNumero = P000J3_n490TDet_PlacaNumero[0] ;
            A69TDet_Consecutivo = P000J3_A69TDet_Consecutivo[0] ;
            AV10Elem_Consecutivo = A66Elem_Consecutivo ;
            AV9TDet_PlacaNumero = A490TDet_PlacaNumero ;
            /* Execute user subroutine: 'CAMBIA ESTADO' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P000J4 */
         pr_default.execute(2, new Object[] {new Boolean(n58Tran_Estado), A58Tran_Estado, new Boolean(n390Tran_FechaRatificacion), A390Tran_FechaRatificacion, new Long(A46Tran_Id)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'CAMBIA ESTADO' Routine */
      /* Optimized UPDATE. */
      /* Using cursor P000J5 */
      pr_default.execute(3, new Object[] {AV10Elem_Consecutivo, AV9TDet_PlacaNumero});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
      /* End optimized UPDATE. */
   }

   protected void cleanup( )
   {
      this.aP0[0] = pratificapadres.this.AV8Tran_Id;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "pratificapadres");
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
      P000J2_A46Tran_Id = new long[1] ;
      P000J2_A58Tran_Estado = new String[] {""} ;
      P000J2_n58Tran_Estado = new boolean[] {false} ;
      P000J2_A390Tran_FechaRatificacion = new java.util.Date[] {GXutil.nullDate()} ;
      P000J2_n390Tran_FechaRatificacion = new boolean[] {false} ;
      A58Tran_Estado = "" ;
      A390Tran_FechaRatificacion = GXutil.resetTime( GXutil.nullDate() );
      P000J3_A46Tran_Id = new long[1] ;
      P000J3_A66Elem_Consecutivo = new String[] {""} ;
      P000J3_A490TDet_PlacaNumero = new String[] {""} ;
      P000J3_n490TDet_PlacaNumero = new boolean[] {false} ;
      P000J3_A69TDet_Consecutivo = new long[1] ;
      A66Elem_Consecutivo = "" ;
      A490TDet_PlacaNumero = "" ;
      AV10Elem_Consecutivo = "" ;
      AV9TDet_PlacaNumero = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.pratificapadres__default(),
         new Object[] {
             new Object[] {
            P000J2_A46Tran_Id, P000J2_A58Tran_Estado, P000J2_n58Tran_Estado, P000J2_A390Tran_FechaRatificacion, P000J2_n390Tran_FechaRatificacion
            }
            , new Object[] {
            P000J3_A46Tran_Id, P000J3_A66Elem_Consecutivo, P000J3_A490TDet_PlacaNumero, P000J3_n490TDet_PlacaNumero, P000J3_A69TDet_Consecutivo
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
   private long AV8Tran_Id ;
   private long A46Tran_Id ;
   private long A69TDet_Consecutivo ;
   private String scmdbuf ;
   private String A58Tran_Estado ;
   private java.util.Date A390Tran_FechaRatificacion ;
   private boolean n58Tran_Estado ;
   private boolean n390Tran_FechaRatificacion ;
   private boolean n490TDet_PlacaNumero ;
   private boolean returnInSub ;
   private String A66Elem_Consecutivo ;
   private String A490TDet_PlacaNumero ;
   private String AV10Elem_Consecutivo ;
   private String AV9TDet_PlacaNumero ;
   private long[] aP0 ;
   private IDataStoreProvider pr_default ;
   private long[] P000J2_A46Tran_Id ;
   private String[] P000J2_A58Tran_Estado ;
   private boolean[] P000J2_n58Tran_Estado ;
   private java.util.Date[] P000J2_A390Tran_FechaRatificacion ;
   private boolean[] P000J2_n390Tran_FechaRatificacion ;
   private long[] P000J3_A46Tran_Id ;
   private String[] P000J3_A66Elem_Consecutivo ;
   private String[] P000J3_A490TDet_PlacaNumero ;
   private boolean[] P000J3_n490TDet_PlacaNumero ;
   private long[] P000J3_A69TDet_Consecutivo ;
}

final  class pratificapadres__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000J2", "SELECT Tran_Id, Tran_Estado, Tran_FechaRatificacion FROM ALM_TRANSACCION WHERE Tran_Id = ? ORDER BY Tran_Id  FOR UPDATE OF Tran_Estado, Tran_FechaRatificacion NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P000J3", "SELECT Tran_Id, Elem_Consecutivo, TDet_PlacaNumero, TDet_Consecutivo FROM ALM_DETALLE_TRANSACCION WHERE Tran_Id = ? ORDER BY Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("P000J4", "UPDATE ALM_TRANSACCION SET Tran_Estado=?, Tran_FechaRatificacion=?  WHERE Tran_Id = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_TRANSACCION")
         ,new UpdateCursor("P000J5", "UPDATE ALM_INVENTARIO_DEVOLUTIVO SET Invd_Estado='R'  WHERE Elem_Consecutivo = ? and Invd_NumeroPlaca = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INVENTARIO_DEVOLUTIVO")
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 2 :
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
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[3], false);
               }
               stmt.setLong(3, ((Number) parms[4]).longValue());
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 9);
               stmt.setVarchar(2, (String)parms[1], 30);
               return;
      }
   }

}

