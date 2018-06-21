/*
               File: ALM_TRANSACCIONLoadRedundancy
        Description: Load redundancy in table ALM_TRANSACCION
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:15.37
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class alm_transaccionloadredundancy extends GXProcedure
{
   public alm_transaccionloadredundancy( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_transaccionloadredundancy.class ), "" );
   }

   public alm_transaccionloadredundancy( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( "Loading redundancy in table ALM_TRANSACCION ..." );
      /* Using cursor ALM_TRANSA2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A48Tran_CentroCostoId = ALM_TRANSA2_A48Tran_CentroCostoId[0] ;
         A50Tran_CentroCostoIdDestino = ALM_TRANSA2_A50Tran_CentroCostoIdDestino[0] ;
         n50Tran_CentroCostoIdDestino = ALM_TRANSA2_n50Tran_CentroCostoIdDestino[0] ;
         A49Tran_CodigoMovimiento = ALM_TRANSA2_A49Tran_CodigoMovimiento[0] ;
         A518Tran_RegionIdDestino = ALM_TRANSA2_A518Tran_RegionIdDestino[0] ;
         n518Tran_RegionIdDestino = ALM_TRANSA2_n518Tran_RegionIdDestino[0] ;
         A482Tran_TipoElemento = ALM_TRANSA2_A482Tran_TipoElemento[0] ;
         n482Tran_TipoElemento = ALM_TRANSA2_n482Tran_TipoElemento[0] ;
         A481Tran_IndE_S = ALM_TRANSA2_A481Tran_IndE_S[0] ;
         n481Tran_IndE_S = ALM_TRANSA2_n481Tran_IndE_S[0] ;
         A57Tran_RegionId = ALM_TRANSA2_A57Tran_RegionId[0] ;
         n57Tran_RegionId = ALM_TRANSA2_n57Tran_RegionId[0] ;
         A46Tran_Id = ALM_TRANSA2_A46Tran_Id[0] ;
         O518Tran_RegionIdDestino = A518Tran_RegionIdDestino ;
         n518Tran_RegionIdDestino = false ;
         O482Tran_TipoElemento = A482Tran_TipoElemento ;
         n482Tran_TipoElemento = false ;
         O481Tran_IndE_S = A481Tran_IndE_S ;
         n481Tran_IndE_S = false ;
         O57Tran_RegionId = A57Tran_RegionId ;
         n57Tran_RegionId = false ;
         O518Tran_RegionIdDestino = A518Tran_RegionIdDestino ;
         n518Tran_RegionIdDestino = false ;
         O482Tran_TipoElemento = A482Tran_TipoElemento ;
         n482Tran_TipoElemento = false ;
         O481Tran_IndE_S = A481Tran_IndE_S ;
         n481Tran_IndE_S = false ;
         O57Tran_RegionId = A57Tran_RegionId ;
         n57Tran_RegionId = false ;
         /* Using cursor ALM_TRANSA3 */
         pr_default.execute(1, new Object[] {A49Tran_CodigoMovimiento});
         A499Tran_CodTipoElemento = ALM_TRANSA3_A499Tran_CodTipoElemento[0] ;
         n499Tran_CodTipoElemento = ALM_TRANSA3_n499Tran_CodTipoElemento[0] ;
         A481Tran_IndE_S = ALM_TRANSA3_A481Tran_IndE_S[0] ;
         n481Tran_IndE_S = ALM_TRANSA3_n481Tran_IndE_S[0] ;
         O481Tran_IndE_S = A481Tran_IndE_S ;
         n481Tran_IndE_S = false ;
         /* Using cursor ALM_TRANSA4 */
         pr_default.execute(2, new Object[] {new Boolean(n499Tran_CodTipoElemento), new Long(A499Tran_CodTipoElemento)});
         A482Tran_TipoElemento = ALM_TRANSA4_A482Tran_TipoElemento[0] ;
         n482Tran_TipoElemento = ALM_TRANSA4_n482Tran_TipoElemento[0] ;
         O482Tran_TipoElemento = A482Tran_TipoElemento ;
         n482Tran_TipoElemento = false ;
         /* Using cursor ALM_TRANSA5 */
         pr_default.execute(3, new Object[] {new Boolean(n50Tran_CentroCostoIdDestino), new Long(A50Tran_CentroCostoIdDestino)});
         A518Tran_RegionIdDestino = ALM_TRANSA5_A518Tran_RegionIdDestino[0] ;
         n518Tran_RegionIdDestino = ALM_TRANSA5_n518Tran_RegionIdDestino[0] ;
         O518Tran_RegionIdDestino = A518Tran_RegionIdDestino ;
         n518Tran_RegionIdDestino = false ;
         /* Using cursor ALM_TRANSA6 */
         pr_default.execute(4, new Object[] {new Long(A48Tran_CentroCostoId)});
         A57Tran_RegionId = ALM_TRANSA6_A57Tran_RegionId[0] ;
         n57Tran_RegionId = ALM_TRANSA6_n57Tran_RegionId[0] ;
         O57Tran_RegionId = A57Tran_RegionId ;
         n57Tran_RegionId = false ;
         A518Tran_RegionIdDestino = O518Tran_RegionIdDestino ;
         n518Tran_RegionIdDestino = false ;
         A482Tran_TipoElemento = O482Tran_TipoElemento ;
         n482Tran_TipoElemento = false ;
         A481Tran_IndE_S = O481Tran_IndE_S ;
         n481Tran_IndE_S = false ;
         A57Tran_RegionId = O57Tran_RegionId ;
         n57Tran_RegionId = false ;
         /* Using cursor ALM_TRANSA7 */
         pr_default.execute(5, new Object[] {new Boolean(n518Tran_RegionIdDestino), new Long(A518Tran_RegionIdDestino), new Boolean(n482Tran_TipoElemento), A482Tran_TipoElemento, new Boolean(n481Tran_IndE_S), A481Tran_IndE_S, new Boolean(n57Tran_RegionId), new Long(A57Tran_RegionId), new Long(A46Tran_Id)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(1);
      pr_default.close(2);
      System.out.println( "" );
      cleanup();
   }

   protected void cleanup( )
   {
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
      ALM_TRANSA2_A48Tran_CentroCostoId = new long[1] ;
      ALM_TRANSA2_A50Tran_CentroCostoIdDestino = new long[1] ;
      ALM_TRANSA2_n50Tran_CentroCostoIdDestino = new boolean[] {false} ;
      ALM_TRANSA2_A49Tran_CodigoMovimiento = new String[] {""} ;
      ALM_TRANSA2_A518Tran_RegionIdDestino = new long[1] ;
      ALM_TRANSA2_n518Tran_RegionIdDestino = new boolean[] {false} ;
      ALM_TRANSA2_A482Tran_TipoElemento = new String[] {""} ;
      ALM_TRANSA2_n482Tran_TipoElemento = new boolean[] {false} ;
      ALM_TRANSA2_A481Tran_IndE_S = new String[] {""} ;
      ALM_TRANSA2_n481Tran_IndE_S = new boolean[] {false} ;
      ALM_TRANSA2_A57Tran_RegionId = new long[1] ;
      ALM_TRANSA2_n57Tran_RegionId = new boolean[] {false} ;
      ALM_TRANSA2_A46Tran_Id = new long[1] ;
      A49Tran_CodigoMovimiento = "" ;
      A482Tran_TipoElemento = "" ;
      A481Tran_IndE_S = "" ;
      O482Tran_TipoElemento = "" ;
      O481Tran_IndE_S = "" ;
      ALM_TRANSA3_A499Tran_CodTipoElemento = new long[1] ;
      ALM_TRANSA3_n499Tran_CodTipoElemento = new boolean[] {false} ;
      ALM_TRANSA3_A481Tran_IndE_S = new String[] {""} ;
      ALM_TRANSA3_n481Tran_IndE_S = new boolean[] {false} ;
      ALM_TRANSA4_A482Tran_TipoElemento = new String[] {""} ;
      ALM_TRANSA4_n482Tran_TipoElemento = new boolean[] {false} ;
      ALM_TRANSA5_A518Tran_RegionIdDestino = new long[1] ;
      ALM_TRANSA5_n518Tran_RegionIdDestino = new boolean[] {false} ;
      ALM_TRANSA6_A57Tran_RegionId = new long[1] ;
      ALM_TRANSA6_n57Tran_RegionId = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_transaccionloadredundancy__default(),
         new Object[] {
             new Object[] {
            ALM_TRANSA2_A48Tran_CentroCostoId, ALM_TRANSA2_A50Tran_CentroCostoIdDestino, ALM_TRANSA2_n50Tran_CentroCostoIdDestino, ALM_TRANSA2_A49Tran_CodigoMovimiento, ALM_TRANSA2_A518Tran_RegionIdDestino, ALM_TRANSA2_n518Tran_RegionIdDestino, ALM_TRANSA2_A482Tran_TipoElemento, ALM_TRANSA2_A481Tran_IndE_S, ALM_TRANSA2_n481Tran_IndE_S, ALM_TRANSA2_A57Tran_RegionId,
            ALM_TRANSA2_n57Tran_RegionId, ALM_TRANSA2_A46Tran_Id
            }
            , new Object[] {
            ALM_TRANSA3_A499Tran_CodTipoElemento, ALM_TRANSA3_n499Tran_CodTipoElemento, ALM_TRANSA3_A481Tran_IndE_S, ALM_TRANSA3_n481Tran_IndE_S
            }
            , new Object[] {
            ALM_TRANSA4_A482Tran_TipoElemento, ALM_TRANSA4_n482Tran_TipoElemento
            }
            , new Object[] {
            ALM_TRANSA5_A518Tran_RegionIdDestino, ALM_TRANSA5_n518Tran_RegionIdDestino
            }
            , new Object[] {
            ALM_TRANSA6_A57Tran_RegionId, ALM_TRANSA6_n57Tran_RegionId
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long A48Tran_CentroCostoId ;
   private long A50Tran_CentroCostoIdDestino ;
   private long A518Tran_RegionIdDestino ;
   private long A57Tran_RegionId ;
   private long A46Tran_Id ;
   private long O518Tran_RegionIdDestino ;
   private long O57Tran_RegionId ;
   private long A499Tran_CodTipoElemento ;
   private String scmdbuf ;
   private String A482Tran_TipoElemento ;
   private String O482Tran_TipoElemento ;
   private boolean n50Tran_CentroCostoIdDestino ;
   private boolean n518Tran_RegionIdDestino ;
   private boolean n482Tran_TipoElemento ;
   private boolean n481Tran_IndE_S ;
   private boolean n57Tran_RegionId ;
   private boolean n499Tran_CodTipoElemento ;
   private String A49Tran_CodigoMovimiento ;
   private String A481Tran_IndE_S ;
   private String O481Tran_IndE_S ;
   private IDataStoreProvider pr_default ;
   private long[] ALM_TRANSA2_A48Tran_CentroCostoId ;
   private long[] ALM_TRANSA2_A50Tran_CentroCostoIdDestino ;
   private boolean[] ALM_TRANSA2_n50Tran_CentroCostoIdDestino ;
   private String[] ALM_TRANSA2_A49Tran_CodigoMovimiento ;
   private long[] ALM_TRANSA2_A518Tran_RegionIdDestino ;
   private boolean[] ALM_TRANSA2_n518Tran_RegionIdDestino ;
   private String[] ALM_TRANSA2_A482Tran_TipoElemento ;
   private boolean[] ALM_TRANSA2_n482Tran_TipoElemento ;
   private String[] ALM_TRANSA2_A481Tran_IndE_S ;
   private boolean[] ALM_TRANSA2_n481Tran_IndE_S ;
   private long[] ALM_TRANSA2_A57Tran_RegionId ;
   private boolean[] ALM_TRANSA2_n57Tran_RegionId ;
   private long[] ALM_TRANSA2_A46Tran_Id ;
   private long[] ALM_TRANSA3_A499Tran_CodTipoElemento ;
   private boolean[] ALM_TRANSA3_n499Tran_CodTipoElemento ;
   private String[] ALM_TRANSA3_A481Tran_IndE_S ;
   private boolean[] ALM_TRANSA3_n481Tran_IndE_S ;
   private String[] ALM_TRANSA4_A482Tran_TipoElemento ;
   private boolean[] ALM_TRANSA4_n482Tran_TipoElemento ;
   private long[] ALM_TRANSA5_A518Tran_RegionIdDestino ;
   private boolean[] ALM_TRANSA5_n518Tran_RegionIdDestino ;
   private long[] ALM_TRANSA6_A57Tran_RegionId ;
   private boolean[] ALM_TRANSA6_n57Tran_RegionId ;
}

final  class alm_transaccionloadredundancy__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("ALM_TRANSA2", "SELECT Tran_CentroCostoId, Tran_CentroCostoIdDestino, Tran_CodigoMovimiento, Tran_RegionIdDestino, Tran_TipoElemento, Tran_IndE_S, Tran_RegionId, Tran_Id FROM ALM_TRANSACCION ORDER BY Tran_Id  FOR UPDATE OF Tran_RegionIdDestino, Tran_TipoElemento, Tran_IndE_S, Tran_RegionId NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("ALM_TRANSA3", "SELECT Tipo_Codigo AS Tran_CodTipoElemento, Tpmo_TipoE_S AS Tran_IndE_S FROM ALM_TIPO_MOVIMIENTO WHERE Tpmo_Codigo = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("ALM_TRANSA4", "SELECT Tipo_Tipo AS Tran_TipoElemento FROM ALM_TIPO_ELEMENTO WHERE Tipo_Codigo = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("ALM_TRANSA5", "SELECT Regi_Id AS Tran_RegionIdDestino FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("ALM_TRANSA6", "SELECT Regi_Id AS Tran_RegionId FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("ALM_TRANSA7", "UPDATE ALM_TRANSACCION SET Tran_RegionIdDestino=?, Tran_TipoElemento=?, Tran_IndE_S=?, Tran_RegionId=?  WHERE Tran_Id = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_TRANSACCION")
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(8) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 1);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(4, ((Number) parms[7]).longValue());
               }
               stmt.setLong(5, ((Number) parms[8]).longValue());
               return;
      }
   }

}

