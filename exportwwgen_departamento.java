/*
               File: ExportWWGEN_DEPARTAMENTO
        Description: Export WWGEN_DEPARTAMENTO
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:59.32
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class exportwwgen_departamento extends GXProcedure
{
   public exportwwgen_departamento( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( exportwwgen_departamento.class ), "" );
   }

   public exportwwgen_departamento( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String[] aP1 )
   {
      exportwwgen_departamento.this.AV16Dept_Descripcion = aP0;
      exportwwgen_departamento.this.aP1 = aP1;
      exportwwgen_departamento.this.aP2 = aP2;
      exportwwgen_departamento.this.aP2 = new String[] {""};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      exportwwgen_departamento.this.AV16Dept_Descripcion = aP0;
      exportwwgen_departamento.this.aP1 = aP1;
      exportwwgen_departamento.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Random = (int)(GXutil.random( )*10000) ;
      AV11Filename = "ExportWWGEN_DEPARTAMENTO-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
      AV10ExcelDocument.Open(AV11Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV10ExcelDocument.Clear();
      AV13CellRow = 1 ;
      AV14FirstColumn = 1 ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( "Código Departamento" );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "Descripción Departamento" );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setText( "Código del País" );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setText( "Descripción del País" );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setText( "Usuario Creación Dpto" );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setText( "Fecha Creación Dpto" );
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV16Dept_Descripcion ,
                                           A10Dept_Descripcion } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      } ) ;
      lV16Dept_Descripcion = GXutil.concat( GXutil.rtrim( AV16Dept_Descripcion), "%", "") ;
      /* Using cursor P000Q2 */
      pr_default.execute(0, new Object[] {lV16Dept_Descripcion});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10Dept_Descripcion = P000Q2_A10Dept_Descripcion[0] ;
         A6Dept_Codigo = P000Q2_A6Dept_Codigo[0] ;
         A9Pais_Codigo = P000Q2_A9Pais_Codigo[0] ;
         A11Pais_Descripcion = P000Q2_A11Pais_Descripcion[0] ;
         A132Dept_UsuarioCrea = P000Q2_A132Dept_UsuarioCrea[0] ;
         A133Dept_FechaCrea = P000Q2_A133Dept_FechaCrea[0] ;
         A11Pais_Descripcion = P000Q2_A11Pais_Descripcion[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setNumber( A6Dept_Codigo );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( A10Dept_Descripcion );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setText( A9Pais_Codigo );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setText( A11Pais_Descripcion );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setText( A132Dept_UsuarioCrea );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, 0, 3, "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setDate( A133Dept_FechaCrea );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV10ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV10ExcelDocument.Close();
      cleanup();
   }

   public void S111( )
   {
      /* 'CHECKSTATUS' Routine */
      if ( AV10ExcelDocument.getErrCode() != 0 )
      {
         AV11Filename = "" ;
         AV12ErrorMessage = AV10ExcelDocument.getErrDescription() ;
         AV10ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   protected void cleanup( )
   {
      this.aP1[0] = exportwwgen_departamento.this.AV11Filename;
      this.aP2[0] = exportwwgen_departamento.this.AV12ErrorMessage;
      CloseOpenCursors();
      AV10ExcelDocument.cleanup();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11Filename = "" ;
      AV12ErrorMessage = "" ;
      AV10ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      scmdbuf = "" ;
      lV16Dept_Descripcion = "" ;
      A10Dept_Descripcion = "" ;
      P000Q2_A10Dept_Descripcion = new String[] {""} ;
      P000Q2_A6Dept_Codigo = new short[1] ;
      P000Q2_A9Pais_Codigo = new String[] {""} ;
      P000Q2_A11Pais_Descripcion = new String[] {""} ;
      P000Q2_A132Dept_UsuarioCrea = new String[] {""} ;
      P000Q2_A133Dept_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      A9Pais_Codigo = "" ;
      A11Pais_Descripcion = "" ;
      A132Dept_UsuarioCrea = "" ;
      A133Dept_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.exportwwgen_departamento__default(),
         new Object[] {
             new Object[] {
            P000Q2_A10Dept_Descripcion, P000Q2_A6Dept_Codigo, P000Q2_A9Pais_Codigo, P000Q2_A11Pais_Descripcion, P000Q2_A132Dept_UsuarioCrea, P000Q2_A133Dept_FechaCrea
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A6Dept_Codigo ;
   private short Gx_err ;
   private int AV15Random ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private String scmdbuf ;
   private java.util.Date A133Dept_FechaCrea ;
   private boolean returnInSub ;
   private String AV16Dept_Descripcion ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String lV16Dept_Descripcion ;
   private String A10Dept_Descripcion ;
   private String A9Pais_Codigo ;
   private String A11Pais_Descripcion ;
   private String A132Dept_UsuarioCrea ;
   private String[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P000Q2_A10Dept_Descripcion ;
   private short[] P000Q2_A6Dept_Codigo ;
   private String[] P000Q2_A9Pais_Codigo ;
   private String[] P000Q2_A11Pais_Descripcion ;
   private String[] P000Q2_A132Dept_UsuarioCrea ;
   private java.util.Date[] P000Q2_A133Dept_FechaCrea ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
}

final  class exportwwgen_departamento__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P000Q2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV16Dept_Descripcion ,
                                          String A10Dept_Descripcion )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int1 ;
      GXv_int1 = new byte [1] ;
      Object[] GXv_Object2 ;
      GXv_Object2 = new Object [2] ;
      scmdbuf = "SELECT T1.Dept_Descripcion, T1.Dept_Codigo, T1.Pais_Codigo, T2.Pais_Descripcion," ;
      scmdbuf = scmdbuf + " T1.Dept_UsuarioCrea, T1.Dept_FechaCrea FROM (GEN_DEPARTAMENTO T1 INNER JOIN GEN_PAIS" ;
      scmdbuf = scmdbuf + " T2 ON T2.Pais_Codigo = T1.Pais_Codigo)" ;
      if ( ! (GXutil.strcmp("", AV16Dept_Descripcion)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (T1.Dept_Descripcion like ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (T1.Dept_Descripcion like ?)" ;
         }
      }
      else
      {
         GXv_int1[0] = (byte)(1) ;
      }
      if ( GXutil.strcmp("", sWhereString) != 0 )
      {
         scmdbuf = scmdbuf + " WHERE" + sWhereString ;
      }
      scmdbuf = scmdbuf + " ORDER BY T1.Dept_Descripcion" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P000Q2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000Q2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6) ;
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx ;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[1], 50);
               }
               return;
      }
   }

}

