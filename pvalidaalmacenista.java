/*
               File: PValidaAlmacenista
        Description: PValida Almacenista
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:14.49
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvalidaalmacenista extends GXProcedure
{
   public pvalidaalmacenista( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvalidaalmacenista.class ), "" );
   }

   public pvalidaalmacenista( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public int executeUdp( long[] aP0 ,
                          String[] aP1 ,
                          String[] aP2 ,
                          long[] aP3 )
   {
      pvalidaalmacenista.this.AV8Cent_Id = aP0[0];
      this.aP0 = aP0;
      pvalidaalmacenista.this.AV9Alma_Modulo = aP1[0];
      this.aP1 = aP1;
      pvalidaalmacenista.this.AV10Alma_Codigo = aP2[0];
      this.aP2 = aP2;
      pvalidaalmacenista.this.AV11Alma_IdResponsable = aP3[0];
      this.aP3 = aP3;
      pvalidaalmacenista.this.AV14Tran = aP4[0];
      this.aP4 = aP4;
      pvalidaalmacenista.this.aP4 = new int[] {0};
      initialize();
      privateExecute();
      return aP4[0];
   }

   public void execute( long[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        long[] aP3 ,
                        int[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( long[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             long[] aP3 ,
                             int[] aP4 )
   {
      pvalidaalmacenista.this.AV8Cent_Id = aP0[0];
      this.aP0 = aP0;
      pvalidaalmacenista.this.AV9Alma_Modulo = aP1[0];
      this.aP1 = aP1;
      pvalidaalmacenista.this.AV10Alma_Codigo = aP2[0];
      this.aP2 = aP2;
      pvalidaalmacenista.this.AV11Alma_IdResponsable = aP3[0];
      this.aP3 = aP3;
      pvalidaalmacenista.this.AV14Tran = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14Tran = 0 ;
      /* Optimized group. */
      /* Using cursor P002L2 */
      pr_default.execute(0, new Object[] {new Long(AV8Cent_Id), AV9Alma_Modulo, AV10Alma_Codigo});
      cV14Tran = P002L2_AV14Tran[0] ;
      pr_default.close(0);
      AV14Tran = (int)(AV14Tran+cV14Tran*1) ;
      /* End optimized group. */
      /* Optimized group. */
      /* Using cursor P002L3 */
      pr_default.execute(1, new Object[] {new Long(AV8Cent_Id), AV9Alma_Modulo, AV10Alma_Codigo});
      cV14Tran = P002L3_AV14Tran[0] ;
      pr_default.close(1);
      AV14Tran = (int)(AV14Tran+cV14Tran*1) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pvalidaalmacenista.this.AV8Cent_Id;
      this.aP1[0] = pvalidaalmacenista.this.AV9Alma_Modulo;
      this.aP2[0] = pvalidaalmacenista.this.AV10Alma_Codigo;
      this.aP3[0] = pvalidaalmacenista.this.AV11Alma_IdResponsable;
      this.aP4[0] = pvalidaalmacenista.this.AV14Tran;
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
      P002L2_AV14Tran = new int[1] ;
      P002L3_AV14Tran = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.pvalidaalmacenista__default(),
         new Object[] {
             new Object[] {
            P002L2_AV14Tran
            }
            , new Object[] {
            P002L3_AV14Tran
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV14Tran ;
   private int cV14Tran ;
   private long AV8Cent_Id ;
   private long AV11Alma_IdResponsable ;
   private String scmdbuf ;
   private String AV9Alma_Modulo ;
   private String AV10Alma_Codigo ;
   private long[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private long[] aP3 ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P002L2_AV14Tran ;
   private int[] P002L3_AV14Tran ;
}

final  class pvalidaalmacenista__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002L2", "SELECT COUNT(*) FROM ALM_TRANSACCION WHERE (Tran_CentroCostoId = ? and Tran_ModuloOrigen = ? and Tran_CodAlmaOrigen = ?) AND (Tran_Estado = 'P' or Tran_Estado = 'I') ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("P002L3", "SELECT COUNT(*) FROM ALM_TRANSACCION WHERE (Tran_CentroCostoIdDestino = ? and Tran_ModuloDestino = ? and Tran_CodAlmaDestino = ?) AND (Tran_Estado = 'P' or Tran_Estado = 'I') ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
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
               stmt.setVarchar(2, (String)parms[1], 8);
               stmt.setVarchar(3, (String)parms[2], 2);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 8);
               stmt.setVarchar(3, (String)parms[2], 2);
               return;
      }
   }

}

