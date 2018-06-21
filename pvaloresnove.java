/*
               File: PValoresNove
        Description: PValores Nove
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:14.59
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvaloresnove extends GXProcedure
{
   public pvaloresnove( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvaloresnove.class ), "" );
   }

   public pvaloresnove( int remoteHandle ,
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
      pvaloresnove.this.AV9Nove_Identificador = aP0[0];
      this.aP0 = aP0;
      pvaloresnove.this.AV8TNov_Nombre_Campo = aP1[0];
      this.aP1 = aP1;
      pvaloresnove.this.AV10Nove_ValorAntiguo = aP2[0];
      this.aP2 = aP2;
      pvaloresnove.this.AV11Nove_ValorNuevo = aP3[0];
      this.aP3 = aP3;
      pvaloresnove.this.AV12Valor_Antiguo = aP4[0];
      this.aP4 = aP4;
      pvaloresnove.this.AV13Valor_Nuevo = aP5[0];
      this.aP5 = aP5;
      pvaloresnove.this.aP5 = new String[] {""};
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
      pvaloresnove.this.AV9Nove_Identificador = aP0[0];
      this.aP0 = aP0;
      pvaloresnove.this.AV8TNov_Nombre_Campo = aP1[0];
      this.aP1 = aP1;
      pvaloresnove.this.AV10Nove_ValorAntiguo = aP2[0];
      this.aP2 = aP2;
      pvaloresnove.this.AV11Nove_ValorNuevo = aP3[0];
      this.aP3 = aP3;
      pvaloresnove.this.AV12Valor_Antiguo = aP4[0];
      this.aP4 = aP4;
      pvaloresnove.this.AV13Valor_Nuevo = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12Valor_Antiguo = "" ;
      AV13Valor_Nuevo = "" ;
      if ( ( GXutil.strcmp(AV8TNov_Nombre_Campo, "Tran_IdProveedor") == 0 ) || ( GXutil.strcmp(AV8TNov_Nombre_Campo, "Tran_IdCuentadanteDestino") == 0 ) )
      {
         /* Using cursor P002N2 */
         pr_default.execute(0, new Object[] {AV10Nove_ValorAntiguo});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A43Cuen_Identificacion = P002N2_A43Cuen_Identificacion[0] ;
            A44Cuen_Nombre = P002N2_A44Cuen_Nombre[0] ;
            n44Cuen_Nombre = P002N2_n44Cuen_Nombre[0] ;
            AV12Valor_Antiguo = A44Cuen_Nombre ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         /* Using cursor P002N3 */
         pr_default.execute(1, new Object[] {AV11Nove_ValorNuevo});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A43Cuen_Identificacion = P002N3_A43Cuen_Identificacion[0] ;
            A44Cuen_Nombre = P002N3_A44Cuen_Nombre[0] ;
            n44Cuen_Nombre = P002N3_n44Cuen_Nombre[0] ;
            AV13Valor_Nuevo = A44Cuen_Nombre ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      else if ( GXutil.strcmp(AV8TNov_Nombre_Campo, "Tran_TipoIngreso") == 0 )
      {
         /* Using cursor P002N4 */
         pr_default.execute(2, new Object[] {AV10Nove_ValorAntiguo});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A41Orig_Identificador = P002N4_A41Orig_Identificador[0] ;
            A635Orig_Descripcion = P002N4_A635Orig_Descripcion[0] ;
            n635Orig_Descripcion = P002N4_n635Orig_Descripcion[0] ;
            AV12Valor_Antiguo = A635Orig_Descripcion ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Using cursor P002N5 */
         pr_default.execute(3, new Object[] {AV11Nove_ValorNuevo});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A41Orig_Identificador = P002N5_A41Orig_Identificador[0] ;
            A635Orig_Descripcion = P002N5_A635Orig_Descripcion[0] ;
            n635Orig_Descripcion = P002N5_n635Orig_Descripcion[0] ;
            AV13Valor_Nuevo = A635Orig_Descripcion ;
            pr_default.readNext(3);
         }
         pr_default.close(3);
      }
      else if ( GXutil.strcmp(AV8TNov_Nombre_Campo, "Tran_AreadanteCodigo") == 0 )
      {
         /* Using cursor P002N6 */
         pr_default.execute(4, new Object[] {AV10Nove_ValorAntiguo});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A59Area_Codigo = P002N6_A59Area_Codigo[0] ;
            A452Area_Descripcion = P002N6_A452Area_Descripcion[0] ;
            AV12Valor_Antiguo = A452Area_Descripcion ;
            pr_default.readNext(4);
         }
         pr_default.close(4);
         /* Using cursor P002N7 */
         pr_default.execute(5, new Object[] {AV11Nove_ValorNuevo});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A59Area_Codigo = P002N7_A59Area_Codigo[0] ;
            A452Area_Descripcion = P002N7_A452Area_Descripcion[0] ;
            AV13Valor_Nuevo = A452Area_Descripcion ;
            pr_default.readNext(5);
         }
         pr_default.close(5);
      }
      else if ( GXutil.strcmp(AV8TNov_Nombre_Campo, "Tran_CursoCodigo") == 0 )
      {
         /* Using cursor P002N8 */
         pr_default.execute(6, new Object[] {AV10Nove_ValorAntiguo});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A73Curs_Codigo = P002N8_A73Curs_Codigo[0] ;
            A424Curs_Descripcion = P002N8_A424Curs_Descripcion[0] ;
            AV12Valor_Antiguo = A424Curs_Descripcion ;
            pr_default.readNext(6);
         }
         pr_default.close(6);
         /* Using cursor P002N9 */
         pr_default.execute(7, new Object[] {AV11Nove_ValorNuevo});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A73Curs_Codigo = P002N9_A73Curs_Codigo[0] ;
            A424Curs_Descripcion = P002N9_A424Curs_Descripcion[0] ;
            AV13Valor_Nuevo = A424Curs_Descripcion ;
            pr_default.readNext(7);
         }
         pr_default.close(7);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pvaloresnove.this.AV9Nove_Identificador;
      this.aP1[0] = pvaloresnove.this.AV8TNov_Nombre_Campo;
      this.aP2[0] = pvaloresnove.this.AV10Nove_ValorAntiguo;
      this.aP3[0] = pvaloresnove.this.AV11Nove_ValorNuevo;
      this.aP4[0] = pvaloresnove.this.AV12Valor_Antiguo;
      this.aP5[0] = pvaloresnove.this.AV13Valor_Nuevo;
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
      P002N2_A43Cuen_Identificacion = new long[1] ;
      P002N2_A44Cuen_Nombre = new String[] {""} ;
      P002N2_n44Cuen_Nombre = new boolean[] {false} ;
      A44Cuen_Nombre = "" ;
      P002N3_A43Cuen_Identificacion = new long[1] ;
      P002N3_A44Cuen_Nombre = new String[] {""} ;
      P002N3_n44Cuen_Nombre = new boolean[] {false} ;
      P002N4_A41Orig_Identificador = new long[1] ;
      P002N4_A635Orig_Descripcion = new String[] {""} ;
      P002N4_n635Orig_Descripcion = new boolean[] {false} ;
      A635Orig_Descripcion = "" ;
      P002N5_A41Orig_Identificador = new long[1] ;
      P002N5_A635Orig_Descripcion = new String[] {""} ;
      P002N5_n635Orig_Descripcion = new boolean[] {false} ;
      P002N6_A59Area_Codigo = new String[] {""} ;
      P002N6_A452Area_Descripcion = new String[] {""} ;
      A59Area_Codigo = "" ;
      A452Area_Descripcion = "" ;
      P002N7_A59Area_Codigo = new String[] {""} ;
      P002N7_A452Area_Descripcion = new String[] {""} ;
      P002N8_A73Curs_Codigo = new String[] {""} ;
      P002N8_A424Curs_Descripcion = new String[] {""} ;
      A73Curs_Codigo = "" ;
      A424Curs_Descripcion = "" ;
      P002N9_A73Curs_Codigo = new String[] {""} ;
      P002N9_A424Curs_Descripcion = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.pvaloresnove__default(),
         new Object[] {
             new Object[] {
            P002N2_A43Cuen_Identificacion, P002N2_A44Cuen_Nombre, P002N2_n44Cuen_Nombre
            }
            , new Object[] {
            P002N3_A43Cuen_Identificacion, P002N3_A44Cuen_Nombre, P002N3_n44Cuen_Nombre
            }
            , new Object[] {
            P002N4_A41Orig_Identificador, P002N4_A635Orig_Descripcion, P002N4_n635Orig_Descripcion
            }
            , new Object[] {
            P002N5_A41Orig_Identificador, P002N5_A635Orig_Descripcion, P002N5_n635Orig_Descripcion
            }
            , new Object[] {
            P002N6_A59Area_Codigo, P002N6_A452Area_Descripcion
            }
            , new Object[] {
            P002N7_A59Area_Codigo, P002N7_A452Area_Descripcion
            }
            , new Object[] {
            P002N8_A73Curs_Codigo, P002N8_A424Curs_Descripcion
            }
            , new Object[] {
            P002N9_A73Curs_Codigo, P002N9_A424Curs_Descripcion
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV9Nove_Identificador ;
   private long A43Cuen_Identificacion ;
   private long A41Orig_Identificador ;
   private String scmdbuf ;
   private boolean n44Cuen_Nombre ;
   private boolean n635Orig_Descripcion ;
   private String AV8TNov_Nombre_Campo ;
   private String AV10Nove_ValorAntiguo ;
   private String AV11Nove_ValorNuevo ;
   private String AV12Valor_Antiguo ;
   private String AV13Valor_Nuevo ;
   private String A44Cuen_Nombre ;
   private String A635Orig_Descripcion ;
   private String A59Area_Codigo ;
   private String A452Area_Descripcion ;
   private String A73Curs_Codigo ;
   private String A424Curs_Descripcion ;
   private long[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private long[] P002N2_A43Cuen_Identificacion ;
   private String[] P002N2_A44Cuen_Nombre ;
   private boolean[] P002N2_n44Cuen_Nombre ;
   private long[] P002N3_A43Cuen_Identificacion ;
   private String[] P002N3_A44Cuen_Nombre ;
   private boolean[] P002N3_n44Cuen_Nombre ;
   private long[] P002N4_A41Orig_Identificador ;
   private String[] P002N4_A635Orig_Descripcion ;
   private boolean[] P002N4_n635Orig_Descripcion ;
   private long[] P002N5_A41Orig_Identificador ;
   private String[] P002N5_A635Orig_Descripcion ;
   private boolean[] P002N5_n635Orig_Descripcion ;
   private String[] P002N6_A59Area_Codigo ;
   private String[] P002N6_A452Area_Descripcion ;
   private String[] P002N7_A59Area_Codigo ;
   private String[] P002N7_A452Area_Descripcion ;
   private String[] P002N8_A73Curs_Codigo ;
   private String[] P002N8_A424Curs_Descripcion ;
   private String[] P002N9_A73Curs_Codigo ;
   private String[] P002N9_A424Curs_Descripcion ;
}

final  class pvaloresnove__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002N2", "SELECT Cuen_Identificacion, Cuen_Nombre FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = TO_NUMBER(NVL(TRIM(RTRIM(LTRIM(?))), '0')) ORDER BY Cuen_Identificacion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P002N3", "SELECT Cuen_Identificacion, Cuen_Nombre FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = TO_NUMBER(NVL(TRIM(RTRIM(LTRIM(?))), '0')) ORDER BY Cuen_Identificacion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P002N4", "SELECT Orig_Identificador, Orig_Descripcion FROM ALM_ORIGEN_BIENES WHERE Orig_Identificador = TO_NUMBER(NVL(TRIM(RTRIM(LTRIM(?))), '0')) ORDER BY Orig_Descripcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P002N5", "SELECT Orig_Identificador, Orig_Descripcion FROM ALM_ORIGEN_BIENES WHERE Orig_Identificador = TO_NUMBER(NVL(TRIM(RTRIM(LTRIM(?))), '0')) ORDER BY Orig_Descripcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P002N6", "SELECT Area_Codigo, Area_Descripcion FROM ALM_AREADANTE WHERE Area_Codigo = RTRIM(LTRIM(?)) ORDER BY Area_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P002N7", "SELECT Area_Codigo, Area_Descripcion FROM ALM_AREADANTE WHERE Area_Codigo = RTRIM(LTRIM(?)) ORDER BY Area_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P002N8", "SELECT Curs_Codigo, Curs_Descripcion FROM ALM_CURSOS WHERE Curs_Codigo = RTRIM(LTRIM(?)) ORDER BY Curs_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P002N9", "SELECT Curs_Codigo, Curs_Descripcion FROM ALM_CURSOS WHERE Curs_Codigo = RTRIM(LTRIM(?)) ORDER BY Curs_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
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
               stmt.setVarchar(1, (String)parms[0], 200);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 200);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 200);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 200);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 200);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 200);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 200);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 200);
               return;
      }
   }

}

