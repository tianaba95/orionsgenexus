/*
               File: PBodegas
        Description: PBodegas
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:14.35
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbodegas extends GXProcedure
{
   public pbodegas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbodegas.class ), "" );
   }

   public pbodegas( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pbodegas.this.AV8Cent_Id = aP0[0];
      this.aP0 = aP0;
      pbodegas.this.AV9Alma_Modulo = aP1[0];
      this.aP1 = aP1;
      pbodegas.this.AV10Alma_Codigo = aP2[0];
      this.aP2 = aP2;
      pbodegas.this.AV11Bode_Codigo = aP3[0];
      this.aP3 = aP3;
      pbodegas.this.AV12Alma_Descripcion = aP4[0];
      this.aP4 = aP4;
      pbodegas.this.AV13BBode_Descripcion = aP5[0];
      this.aP5 = aP5;
      pbodegas.this.aP5 = new String[] {""};
      initialize();
      privateExecute();
      return aP5[0];
   }

   public void execute( long[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( long[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pbodegas.this.AV8Cent_Id = aP0[0];
      this.aP0 = aP0;
      pbodegas.this.AV9Alma_Modulo = aP1[0];
      this.aP1 = aP1;
      pbodegas.this.AV10Alma_Codigo = aP2[0];
      this.aP2 = aP2;
      pbodegas.this.AV11Bode_Codigo = aP3[0];
      this.aP3 = aP3;
      pbodegas.this.AV12Alma_Descripcion = aP4[0];
      this.aP4 = aP4;
      pbodegas.this.AV13BBode_Descripcion = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12Alma_Descripcion = "" ;
      /* Using cursor P002M2 */
      pr_default.execute(0, new Object[] {new Long(AV8Cent_Id), AV9Alma_Modulo, AV10Alma_Codigo});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A28Alma_Codigo = P002M2_A28Alma_Codigo[0] ;
         A27Alma_Modulo = P002M2_A27Alma_Modulo[0] ;
         A1Cent_Id = P002M2_A1Cent_Id[0] ;
         A252Alma_Descripcion = P002M2_A252Alma_Descripcion[0] ;
         AV12Alma_Descripcion = A28Alma_Codigo + "-" + A252Alma_Descripcion ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV13BBode_Descripcion = "" ;
      /* Using cursor P002M3 */
      pr_default.execute(1, new Object[] {new Long(AV8Cent_Id), AV9Alma_Modulo, AV10Alma_Codigo, AV11Bode_Codigo});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A31Bode_Codigo = P002M3_A31Bode_Codigo[0] ;
         A28Alma_Codigo = P002M3_A28Alma_Codigo[0] ;
         A27Alma_Modulo = P002M3_A27Alma_Modulo[0] ;
         A1Cent_Id = P002M3_A1Cent_Id[0] ;
         A695BBode_Descripcion = P002M3_A695BBode_Descripcion[0] ;
         AV13BBode_Descripcion = A31Bode_Codigo + "-" + A695BBode_Descripcion ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbodegas.this.AV8Cent_Id;
      this.aP1[0] = pbodegas.this.AV9Alma_Modulo;
      this.aP2[0] = pbodegas.this.AV10Alma_Codigo;
      this.aP3[0] = pbodegas.this.AV11Bode_Codigo;
      this.aP4[0] = pbodegas.this.AV12Alma_Descripcion;
      this.aP5[0] = pbodegas.this.AV13BBode_Descripcion;
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
      P002M2_A28Alma_Codigo = new String[] {""} ;
      P002M2_A27Alma_Modulo = new String[] {""} ;
      P002M2_A1Cent_Id = new long[1] ;
      P002M2_A252Alma_Descripcion = new String[] {""} ;
      A28Alma_Codigo = "" ;
      A27Alma_Modulo = "" ;
      A252Alma_Descripcion = "" ;
      P002M3_A31Bode_Codigo = new String[] {""} ;
      P002M3_A28Alma_Codigo = new String[] {""} ;
      P002M3_A27Alma_Modulo = new String[] {""} ;
      P002M3_A1Cent_Id = new long[1] ;
      P002M3_A695BBode_Descripcion = new String[] {""} ;
      A31Bode_Codigo = "" ;
      A695BBode_Descripcion = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.pbodegas__default(),
         new Object[] {
             new Object[] {
            P002M2_A28Alma_Codigo, P002M2_A27Alma_Modulo, P002M2_A1Cent_Id, P002M2_A252Alma_Descripcion
            }
            , new Object[] {
            P002M3_A31Bode_Codigo, P002M3_A28Alma_Codigo, P002M3_A27Alma_Modulo, P002M3_A1Cent_Id, P002M3_A695BBode_Descripcion
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV8Cent_Id ;
   private long A1Cent_Id ;
   private String scmdbuf ;
   private String AV9Alma_Modulo ;
   private String AV10Alma_Codigo ;
   private String AV11Bode_Codigo ;
   private String AV12Alma_Descripcion ;
   private String AV13BBode_Descripcion ;
   private String A28Alma_Codigo ;
   private String A27Alma_Modulo ;
   private String A252Alma_Descripcion ;
   private String A31Bode_Codigo ;
   private String A695BBode_Descripcion ;
   private long[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P002M2_A28Alma_Codigo ;
   private String[] P002M2_A27Alma_Modulo ;
   private long[] P002M2_A1Cent_Id ;
   private String[] P002M2_A252Alma_Descripcion ;
   private String[] P002M3_A31Bode_Codigo ;
   private String[] P002M3_A28Alma_Codigo ;
   private String[] P002M3_A27Alma_Modulo ;
   private long[] P002M3_A1Cent_Id ;
   private String[] P002M3_A695BBode_Descripcion ;
}

final  class pbodegas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002M2", "SELECT Alma_Codigo, Alma_Modulo, Cent_Id, Alma_Descripcion FROM ALM_ALMACEN WHERE Cent_Id = ? and Alma_Modulo = ? and Alma_Codigo = ? ORDER BY Cent_Id, Alma_Modulo, Alma_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P002M3", "SELECT Bode_Codigo, Alma_Codigo, Alma_Modulo, Cent_Id, BBode_Descripcion FROM ALM_ALMACEN_BODEGAS WHERE Cent_Id = ? and Alma_Modulo = ? and Alma_Codigo = ? and Bode_Codigo = ? ORDER BY Cent_Id, Alma_Modulo, Alma_Codigo, Bode_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
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
               stmt.setVarchar(4, (String)parms[3], 3);
               return;
      }
   }

}

