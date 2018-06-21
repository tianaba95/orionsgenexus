/*
               File: ParametrosReportes
        Description: Parametros Reportes
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:23.62
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class parametrosreportes extends GXProcedure
{
   public parametrosreportes( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( parametrosreportes.class ), "" );
   }

   public parametrosreportes( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 )
   {
      parametrosreportes.this.aP0 = aP0;
      parametrosreportes.this.aP1 = aP1;
      parametrosreportes.this.aP2 = aP2;
      parametrosreportes.this.aP3 = aP3;
      parametrosreportes.this.aP3 = new String[] {""};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 )
   {
      parametrosreportes.this.aP0 = aP0;
      parametrosreportes.this.aP1 = aP1;
      parametrosreportes.this.aP2 = aP2;
      parametrosreportes.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P002X2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A208Para_Nombre = P002X2_A208Para_Nombre[0] ;
         A209Para_Valor = P002X2_A209Para_Valor[0] ;
         A20Para_Id = P002X2_A20Para_Id[0] ;
         AV10Ambiente = A209Para_Valor ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P002X3 */
      pr_default.execute(1, new Object[] {AV10Ambiente});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A208Para_Nombre = P002X3_A208Para_Nombre[0] ;
         A210Para_Ambiente = P002X3_A210Para_Ambiente[0] ;
         A209Para_Valor = P002X3_A209Para_Valor[0] ;
         A20Para_Id = P002X3_A20Para_Id[0] ;
         AV9Host = GXutil.ltrim( GXutil.trim( A209Para_Valor)) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Using cursor P002X4 */
      pr_default.execute(2, new Object[] {AV10Ambiente});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A208Para_Nombre = P002X4_A208Para_Nombre[0] ;
         A210Para_Ambiente = P002X4_A210Para_Ambiente[0] ;
         A209Para_Valor = P002X4_A209Para_Valor[0] ;
         A20Para_Id = P002X4_A20Para_Id[0] ;
         AV11URL = GXutil.ltrim( GXutil.trim( A209Para_Valor)) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      /* Using cursor P002X5 */
      pr_default.execute(3, new Object[] {AV10Ambiente});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A208Para_Nombre = P002X5_A208Para_Nombre[0] ;
         A210Para_Ambiente = P002X5_A210Para_Ambiente[0] ;
         A209Para_Valor = P002X5_A209Para_Valor[0] ;
         A20Para_Id = P002X5_A20Para_Id[0] ;
         AV8Puerto = (short)(GXutil.lval( A209Para_Valor)) ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
      /* Using cursor P002X6 */
      pr_default.execute(4, new Object[] {AV10Ambiente});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A208Para_Nombre = P002X6_A208Para_Nombre[0] ;
         A210Para_Ambiente = P002X6_A210Para_Ambiente[0] ;
         A209Para_Valor = P002X6_A209Para_Valor[0] ;
         A20Para_Id = P002X6_A20Para_Id[0] ;
         AV12URLAutentica = GXutil.ltrim( GXutil.trim( A209Para_Valor)) ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = parametrosreportes.this.AV9Host;
      this.aP1[0] = parametrosreportes.this.AV11URL;
      this.aP2[0] = parametrosreportes.this.AV8Puerto;
      this.aP3[0] = parametrosreportes.this.AV12URLAutentica;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Host = "" ;
      AV11URL = "" ;
      AV12URLAutentica = "" ;
      scmdbuf = "" ;
      P002X2_A208Para_Nombre = new String[] {""} ;
      P002X2_A209Para_Valor = new String[] {""} ;
      P002X2_A20Para_Id = new long[1] ;
      A208Para_Nombre = "" ;
      A209Para_Valor = "" ;
      AV10Ambiente = "" ;
      P002X3_A208Para_Nombre = new String[] {""} ;
      P002X3_A210Para_Ambiente = new String[] {""} ;
      P002X3_A209Para_Valor = new String[] {""} ;
      P002X3_A20Para_Id = new long[1] ;
      A210Para_Ambiente = "" ;
      P002X4_A208Para_Nombre = new String[] {""} ;
      P002X4_A210Para_Ambiente = new String[] {""} ;
      P002X4_A209Para_Valor = new String[] {""} ;
      P002X4_A20Para_Id = new long[1] ;
      P002X5_A208Para_Nombre = new String[] {""} ;
      P002X5_A210Para_Ambiente = new String[] {""} ;
      P002X5_A209Para_Valor = new String[] {""} ;
      P002X5_A20Para_Id = new long[1] ;
      P002X6_A208Para_Nombre = new String[] {""} ;
      P002X6_A210Para_Ambiente = new String[] {""} ;
      P002X6_A209Para_Valor = new String[] {""} ;
      P002X6_A20Para_Id = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.parametrosreportes__default(),
         new Object[] {
             new Object[] {
            P002X2_A208Para_Nombre, P002X2_A209Para_Valor, P002X2_A20Para_Id
            }
            , new Object[] {
            P002X3_A208Para_Nombre, P002X3_A210Para_Ambiente, P002X3_A209Para_Valor, P002X3_A20Para_Id
            }
            , new Object[] {
            P002X4_A208Para_Nombre, P002X4_A210Para_Ambiente, P002X4_A209Para_Valor, P002X4_A20Para_Id
            }
            , new Object[] {
            P002X5_A208Para_Nombre, P002X5_A210Para_Ambiente, P002X5_A209Para_Valor, P002X5_A20Para_Id
            }
            , new Object[] {
            P002X6_A208Para_Nombre, P002X6_A210Para_Ambiente, P002X6_A209Para_Valor, P002X6_A20Para_Id
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8Puerto ;
   private short Gx_err ;
   private long A20Para_Id ;
   private String scmdbuf ;
   private String AV9Host ;
   private String AV11URL ;
   private String AV12URLAutentica ;
   private String A208Para_Nombre ;
   private String A209Para_Valor ;
   private String AV10Ambiente ;
   private String A210Para_Ambiente ;
   private String[] aP0 ;
   private String[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P002X2_A208Para_Nombre ;
   private String[] P002X2_A209Para_Valor ;
   private long[] P002X2_A20Para_Id ;
   private String[] P002X3_A208Para_Nombre ;
   private String[] P002X3_A210Para_Ambiente ;
   private String[] P002X3_A209Para_Valor ;
   private long[] P002X3_A20Para_Id ;
   private String[] P002X4_A208Para_Nombre ;
   private String[] P002X4_A210Para_Ambiente ;
   private String[] P002X4_A209Para_Valor ;
   private long[] P002X4_A20Para_Id ;
   private String[] P002X5_A208Para_Nombre ;
   private String[] P002X5_A210Para_Ambiente ;
   private String[] P002X5_A209Para_Valor ;
   private long[] P002X5_A20Para_Id ;
   private String[] P002X6_A208Para_Nombre ;
   private String[] P002X6_A210Para_Ambiente ;
   private String[] P002X6_A209Para_Valor ;
   private long[] P002X6_A20Para_Id ;
}

final  class parametrosreportes__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002X2", "SELECT Para_Nombre, Para_Valor, Para_Id FROM SEG_PARAMETROS WHERE Para_Nombre = 'AMBIENTE' ORDER BY Para_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P002X3", "SELECT Para_Nombre, Para_Ambiente, Para_Valor, Para_Id FROM SEG_PARAMETROS WHERE (Para_Ambiente = ?) AND (Para_Nombre = 'SERVIDOR REPORTES') ORDER BY Para_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P002X4", "SELECT Para_Nombre, Para_Ambiente, Para_Valor, Para_Id FROM SEG_PARAMETROS WHERE (Para_Ambiente = ?) AND (Para_Nombre = 'URL REPORTES') ORDER BY Para_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P002X5", "SELECT Para_Nombre, Para_Ambiente, Para_Valor, Para_Id FROM SEG_PARAMETROS WHERE (Para_Ambiente = ?) AND (Para_Nombre = 'PUERTO REPORTES') ORDER BY Para_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P002X6", "SELECT Para_Nombre, Para_Ambiente, Para_Valor, Para_Id FROM SEG_PARAMETROS WHERE (Para_Ambiente = ?) AND (Para_Nombre = 'URL REPORTES AUTENTICA') ORDER BY Para_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               return;
            case 4 :
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
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 50);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 50);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 50);
               return;
      }
   }

}

