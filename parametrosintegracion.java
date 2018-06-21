/*
               File: ParametrosIntegracion
        Description: Parametros Integracion
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:15.45
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class parametrosintegracion extends GXProcedure
{
   public parametrosintegracion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( parametrosintegracion.class ), "" );
   }

   public parametrosintegracion( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( )
   {
      parametrosintegracion.this.aP0 = aP0;
      parametrosintegracion.this.aP0 = new String[] {""};
      initialize();
      privateExecute();
      return aP0[0];
   }

   public void execute( String[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String[] aP0 )
   {
      parametrosintegracion.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P002Y2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A208Para_Nombre = P002Y2_A208Para_Nombre[0] ;
         A209Para_Valor = P002Y2_A209Para_Valor[0] ;
         A20Para_Id = P002Y2_A20Para_Id[0] ;
         AV10Ambiente = A209Para_Valor ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P002Y3 */
      pr_default.execute(1, new Object[] {AV10Ambiente});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A208Para_Nombre = P002Y3_A208Para_Nombre[0] ;
         A210Para_Ambiente = P002Y3_A210Para_Ambiente[0] ;
         A209Para_Valor = P002Y3_A209Para_Valor[0] ;
         A20Para_Id = P002Y3_A20Para_Id[0] ;
         AV12Integra = GXutil.ltrim( GXutil.trim( A209Para_Valor)) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = parametrosintegracion.this.AV12Integra;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Integra = "" ;
      scmdbuf = "" ;
      P002Y2_A208Para_Nombre = new String[] {""} ;
      P002Y2_A209Para_Valor = new String[] {""} ;
      P002Y2_A20Para_Id = new long[1] ;
      A208Para_Nombre = "" ;
      A209Para_Valor = "" ;
      AV10Ambiente = "" ;
      P002Y3_A208Para_Nombre = new String[] {""} ;
      P002Y3_A210Para_Ambiente = new String[] {""} ;
      P002Y3_A209Para_Valor = new String[] {""} ;
      P002Y3_A20Para_Id = new long[1] ;
      A210Para_Ambiente = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.parametrosintegracion__default(),
         new Object[] {
             new Object[] {
            P002Y2_A208Para_Nombre, P002Y2_A209Para_Valor, P002Y2_A20Para_Id
            }
            , new Object[] {
            P002Y3_A208Para_Nombre, P002Y3_A210Para_Ambiente, P002Y3_A209Para_Valor, P002Y3_A20Para_Id
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long A20Para_Id ;
   private String AV12Integra ;
   private String scmdbuf ;
   private String A208Para_Nombre ;
   private String A209Para_Valor ;
   private String AV10Ambiente ;
   private String A210Para_Ambiente ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P002Y2_A208Para_Nombre ;
   private String[] P002Y2_A209Para_Valor ;
   private long[] P002Y2_A20Para_Id ;
   private String[] P002Y3_A208Para_Nombre ;
   private String[] P002Y3_A210Para_Ambiente ;
   private String[] P002Y3_A209Para_Valor ;
   private long[] P002Y3_A20Para_Id ;
}

final  class parametrosintegracion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002Y2", "SELECT Para_Nombre, Para_Valor, Para_Id FROM SEG_PARAMETROS WHERE Para_Nombre = 'AMBIENTE' ORDER BY Para_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P002Y3", "SELECT Para_Nombre, Para_Ambiente, Para_Valor, Para_Id FROM SEG_PARAMETROS WHERE (Para_Ambiente = ?) AND (Para_Nombre = 'INTEGRA ORIONS1') ORDER BY Para_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
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
               stmt.setVarchar(1, (String)parms[0], 50);
               return;
      }
   }

}

