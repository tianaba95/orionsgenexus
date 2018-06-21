/*
               File: PValidaNovedad
        Description: PValida Novedad
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:13.42
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvalidanovedad extends GXProcedure
{
   public pvalidanovedad( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvalidanovedad.class ), "" );
   }

   public pvalidanovedad( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 )
   {
      pvalidanovedad.this.AV8Tran_Id = aP0[0];
      this.aP0 = aP0;
      pvalidanovedad.this.AV9TNov_Codigo = aP1[0];
      this.aP1 = aP1;
      pvalidanovedad.this.AV10TNov_Nro_Cambios = aP2[0];
      this.aP2 = aP2;
      pvalidanovedad.this.AV11Permitido = aP3[0];
      this.aP3 = aP3;
      pvalidanovedad.this.aP3 = new String[] {""};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( long[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( long[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 )
   {
      pvalidanovedad.this.AV8Tran_Id = aP0[0];
      this.aP0 = aP0;
      pvalidanovedad.this.AV9TNov_Codigo = aP1[0];
      this.aP1 = aP1;
      pvalidanovedad.this.AV10TNov_Nro_Cambios = aP2[0];
      this.aP2 = aP2;
      pvalidanovedad.this.AV11Permitido = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12Contador = (short)(0) ;
      /* Using cursor P002I2 */
      pr_default.execute(0, new Object[] {new Integer(AV9TNov_Codigo), new Long(AV8Tran_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A104TNov_Codigo = P002I2_A104TNov_Codigo[0] ;
         n104TNov_Codigo = P002I2_n104TNov_Codigo[0] ;
         A107Nove_TransId = P002I2_A107Nove_TransId[0] ;
         n107Nove_TransId = P002I2_n107Nove_TransId[0] ;
         A765Nove_Estado = P002I2_A765Nove_Estado[0] ;
         n765Nove_Estado = P002I2_n765Nove_Estado[0] ;
         A106Nove_Identificador = P002I2_A106Nove_Identificador[0] ;
         if ( GXutil.strcmp(A765Nove_Estado, "C") == 0 )
         {
            AV12Contador = (short)(AV12Contador+1) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV12Contador >= AV10TNov_Nro_Cambios )
      {
         AV11Permitido = "NO" ;
      }
      else
      {
         AV11Permitido = "SI" ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pvalidanovedad.this.AV8Tran_Id;
      this.aP1[0] = pvalidanovedad.this.AV9TNov_Codigo;
      this.aP2[0] = pvalidanovedad.this.AV10TNov_Nro_Cambios;
      this.aP3[0] = pvalidanovedad.this.AV11Permitido;
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
      P002I2_A104TNov_Codigo = new int[1] ;
      P002I2_n104TNov_Codigo = new boolean[] {false} ;
      P002I2_A107Nove_TransId = new long[1] ;
      P002I2_n107Nove_TransId = new boolean[] {false} ;
      P002I2_A765Nove_Estado = new String[] {""} ;
      P002I2_n765Nove_Estado = new boolean[] {false} ;
      P002I2_A106Nove_Identificador = new long[1] ;
      A765Nove_Estado = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.pvalidanovedad__default(),
         new Object[] {
             new Object[] {
            P002I2_A104TNov_Codigo, P002I2_n104TNov_Codigo, P002I2_A107Nove_TransId, P002I2_n107Nove_TransId, P002I2_A765Nove_Estado, P002I2_n765Nove_Estado, P002I2_A106Nove_Identificador
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TNov_Nro_Cambios ;
   private short AV12Contador ;
   private short Gx_err ;
   private int AV9TNov_Codigo ;
   private int A104TNov_Codigo ;
   private long AV8Tran_Id ;
   private long A107Nove_TransId ;
   private long A106Nove_Identificador ;
   private String scmdbuf ;
   private String A765Nove_Estado ;
   private boolean n104TNov_Codigo ;
   private boolean n107Nove_TransId ;
   private boolean n765Nove_Estado ;
   private String AV11Permitido ;
   private long[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private int[] P002I2_A104TNov_Codigo ;
   private boolean[] P002I2_n104TNov_Codigo ;
   private long[] P002I2_A107Nove_TransId ;
   private boolean[] P002I2_n107Nove_TransId ;
   private String[] P002I2_A765Nove_Estado ;
   private boolean[] P002I2_n765Nove_Estado ;
   private long[] P002I2_A106Nove_Identificador ;
}

final  class pvalidanovedad__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002I2", "SELECT TNov_Codigo, Nove_TransId, Nove_Estado, Nove_Identificador FROM ALM_NOVEDAD WHERE (TNov_Codigo = ?) AND (Nove_TransId = ?) ORDER BY TNov_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(4) ;
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

