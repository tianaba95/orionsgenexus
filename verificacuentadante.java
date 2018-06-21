/*
               File: VerificaCuentadante
        Description: Verifica Cuentadante
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:57.68
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class verificacuentadante extends GXProcedure
{
   public verificacuentadante( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( verificacuentadante.class ), "" );
   }

   public verificacuentadante( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      verificacuentadante.this.AV10Cent_Id = aP0[0];
      this.aP0 = aP0;
      verificacuentadante.this.AV9Alma_Modulo = aP1[0];
      this.aP1 = aP1;
      verificacuentadante.this.AV8Alma_Codigo = aP2[0];
      this.aP2 = aP2;
      verificacuentadante.this.AV11Existe = aP3[0];
      this.aP3 = aP3;
      verificacuentadante.this.aP3 = new String[] {""};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( long[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( long[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      verificacuentadante.this.AV10Cent_Id = aP0[0];
      this.aP0 = aP0;
      verificacuentadante.this.AV9Alma_Modulo = aP1[0];
      this.aP1 = aP1;
      verificacuentadante.this.AV8Alma_Codigo = aP2[0];
      this.aP2 = aP2;
      verificacuentadante.this.AV11Existe = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11Existe = "N" ;
      /* Using cursor P000M2 */
      pr_default.execute(0, new Object[] {new Long(AV10Cent_Id), AV9Alma_Modulo, AV8Alma_Codigo});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A29Tpal_Id = P000M2_A29Tpal_Id[0] ;
         A28Alma_Codigo = P000M2_A28Alma_Codigo[0] ;
         A27Alma_Modulo = P000M2_A27Alma_Modulo[0] ;
         A1Cent_Id = P000M2_A1Cent_Id[0] ;
         A307Tpal_Descripcion = P000M2_A307Tpal_Descripcion[0] ;
         A307Tpal_Descripcion = P000M2_A307Tpal_Descripcion[0] ;
         if ( GXutil.like( GXutil.upper( A307Tpal_Descripcion) , GXutil.padr( "%SERVICIOS%" , 254 , "%"),  ' ' ) )
         {
            AV11Existe = "S" ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = verificacuentadante.this.AV10Cent_Id;
      this.aP1[0] = verificacuentadante.this.AV9Alma_Modulo;
      this.aP2[0] = verificacuentadante.this.AV8Alma_Codigo;
      this.aP3[0] = verificacuentadante.this.AV11Existe;
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
      P000M2_A29Tpal_Id = new long[1] ;
      P000M2_A28Alma_Codigo = new String[] {""} ;
      P000M2_A27Alma_Modulo = new String[] {""} ;
      P000M2_A1Cent_Id = new long[1] ;
      P000M2_A307Tpal_Descripcion = new String[] {""} ;
      A28Alma_Codigo = "" ;
      A27Alma_Modulo = "" ;
      A307Tpal_Descripcion = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.verificacuentadante__default(),
         new Object[] {
             new Object[] {
            P000M2_A29Tpal_Id, P000M2_A28Alma_Codigo, P000M2_A27Alma_Modulo, P000M2_A1Cent_Id, P000M2_A307Tpal_Descripcion
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV10Cent_Id ;
   private long A29Tpal_Id ;
   private long A1Cent_Id ;
   private String AV11Existe ;
   private String scmdbuf ;
   private String AV9Alma_Modulo ;
   private String AV8Alma_Codigo ;
   private String A28Alma_Codigo ;
   private String A27Alma_Modulo ;
   private String A307Tpal_Descripcion ;
   private long[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private long[] P000M2_A29Tpal_Id ;
   private String[] P000M2_A28Alma_Codigo ;
   private String[] P000M2_A27Alma_Modulo ;
   private long[] P000M2_A1Cent_Id ;
   private String[] P000M2_A307Tpal_Descripcion ;
}

final  class verificacuentadante__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000M2", "SELECT T1.Tpal_Id, T1.Alma_Codigo, T1.Alma_Modulo, T1.Cent_Id, T2.Tpal_Descripcion FROM (ALM_ALMACEN T1 INNER JOIN ALM_TIPO_ALMACEN T2 ON T2.Tpal_Id = T1.Tpal_Id) WHERE T1.Cent_Id = ? and T1.Alma_Modulo = ? and T1.Alma_Codigo = ? ORDER BY T1.Cent_Id, T1.Alma_Modulo, T1.Alma_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
      }
   }

}

