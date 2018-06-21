/*
               File: PBuscaCuentadante
        Description: PBusca Cuentadante
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:11.59
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbuscacuentadante extends GXProcedure
{
   public pbuscacuentadante( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbuscacuentadante.class ), "" );
   }

   public pbuscacuentadante( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public long executeUdp( long aP0 ,
                           String aP1 ,
                           String aP2 ,
                           long[] aP3 ,
                           String[] aP4 )
   {
      pbuscacuentadante.this.AV10Cent_Id = aP0;
      pbuscacuentadante.this.AV9Alma_Modulo = aP1;
      pbuscacuentadante.this.AV8Alma_Codigo = aP2;
      pbuscacuentadante.this.aP3 = aP3;
      pbuscacuentadante.this.aP4 = aP4;
      pbuscacuentadante.this.aP5 = aP5;
      pbuscacuentadante.this.aP5 = new long[] {0};
      initialize();
      privateExecute();
      return aP5[0];
   }

   public void execute( long aP0 ,
                        String aP1 ,
                        String aP2 ,
                        long[] aP3 ,
                        String[] aP4 ,
                        long[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( long aP0 ,
                             String aP1 ,
                             String aP2 ,
                             long[] aP3 ,
                             String[] aP4 ,
                             long[] aP5 )
   {
      pbuscacuentadante.this.AV10Cent_Id = aP0;
      pbuscacuentadante.this.AV9Alma_Modulo = aP1;
      pbuscacuentadante.this.AV8Alma_Codigo = aP2;
      pbuscacuentadante.this.aP3 = aP3;
      pbuscacuentadante.this.aP4 = aP4;
      pbuscacuentadante.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11Alma_IdResponsable = 0 ;
      AV12Alma_NombreResponsable = "" ;
      /* Using cursor P00252 */
      pr_default.execute(0, new Object[] {new Long(AV10Cent_Id), AV9Alma_Modulo, AV8Alma_Codigo});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A28Alma_Codigo = P00252_A28Alma_Codigo[0] ;
         A27Alma_Modulo = P00252_A27Alma_Modulo[0] ;
         A1Cent_Id = P00252_A1Cent_Id[0] ;
         A30Alma_IdResponsable = P00252_A30Alma_IdResponsable[0] ;
         A266Alma_NombreResponsable = P00252_A266Alma_NombreResponsable[0] ;
         n266Alma_NombreResponsable = P00252_n266Alma_NombreResponsable[0] ;
         A265Alma_CedulaResponsable = P00252_A265Alma_CedulaResponsable[0] ;
         n265Alma_CedulaResponsable = P00252_n265Alma_CedulaResponsable[0] ;
         A266Alma_NombreResponsable = P00252_A266Alma_NombreResponsable[0] ;
         n266Alma_NombreResponsable = P00252_n266Alma_NombreResponsable[0] ;
         A265Alma_CedulaResponsable = P00252_A265Alma_CedulaResponsable[0] ;
         n265Alma_CedulaResponsable = P00252_n265Alma_CedulaResponsable[0] ;
         AV11Alma_IdResponsable = A30Alma_IdResponsable ;
         AV12Alma_NombreResponsable = A266Alma_NombreResponsable ;
         AV14Cuen_Cedula = A265Alma_CedulaResponsable ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = pbuscacuentadante.this.AV11Alma_IdResponsable;
      this.aP4[0] = pbuscacuentadante.this.AV12Alma_NombreResponsable;
      this.aP5[0] = pbuscacuentadante.this.AV14Cuen_Cedula;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Alma_NombreResponsable = "" ;
      scmdbuf = "" ;
      P00252_A28Alma_Codigo = new String[] {""} ;
      P00252_A27Alma_Modulo = new String[] {""} ;
      P00252_A1Cent_Id = new long[1] ;
      P00252_A30Alma_IdResponsable = new long[1] ;
      P00252_A266Alma_NombreResponsable = new String[] {""} ;
      P00252_n266Alma_NombreResponsable = new boolean[] {false} ;
      P00252_A265Alma_CedulaResponsable = new long[1] ;
      P00252_n265Alma_CedulaResponsable = new boolean[] {false} ;
      A28Alma_Codigo = "" ;
      A27Alma_Modulo = "" ;
      A266Alma_NombreResponsable = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.pbuscacuentadante__default(),
         new Object[] {
             new Object[] {
            P00252_A28Alma_Codigo, P00252_A27Alma_Modulo, P00252_A1Cent_Id, P00252_A30Alma_IdResponsable, P00252_A266Alma_NombreResponsable, P00252_n266Alma_NombreResponsable, P00252_A265Alma_CedulaResponsable, P00252_n265Alma_CedulaResponsable
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV10Cent_Id ;
   private long AV11Alma_IdResponsable ;
   private long AV14Cuen_Cedula ;
   private long A1Cent_Id ;
   private long A30Alma_IdResponsable ;
   private long A265Alma_CedulaResponsable ;
   private String scmdbuf ;
   private boolean n266Alma_NombreResponsable ;
   private boolean n265Alma_CedulaResponsable ;
   private String AV9Alma_Modulo ;
   private String AV8Alma_Codigo ;
   private String AV12Alma_NombreResponsable ;
   private String A28Alma_Codigo ;
   private String A27Alma_Modulo ;
   private String A266Alma_NombreResponsable ;
   private long[] aP3 ;
   private String[] aP4 ;
   private long[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P00252_A28Alma_Codigo ;
   private String[] P00252_A27Alma_Modulo ;
   private long[] P00252_A1Cent_Id ;
   private long[] P00252_A30Alma_IdResponsable ;
   private String[] P00252_A266Alma_NombreResponsable ;
   private boolean[] P00252_n266Alma_NombreResponsable ;
   private long[] P00252_A265Alma_CedulaResponsable ;
   private boolean[] P00252_n265Alma_CedulaResponsable ;
}

final  class pbuscacuentadante__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00252", "SELECT T1.Alma_Codigo, T1.Alma_Modulo, T1.Cent_Id, T1.Alma_IdResponsable AS Alma_IdResponsable, T2.Cuen_Nombre AS Alma_NombreResponsable, T2.Cuen_Cedula AS Alma_CedulaResponsable FROM (ALM_ALMACEN T1 INNER JOIN ALM_CUENTADANTE T2 ON T2.Cuen_Identificacion = T1.Alma_IdResponsable) WHERE T1.Cent_Id = ? and T1.Alma_Modulo = ? and T1.Alma_Codigo = ? ORDER BY T1.Cent_Id, T1.Alma_Modulo, T1.Alma_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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

