/*
               File: Export_cargue_masivo
        Description: Export_cargue_masivo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:11.68
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class export_cargue_masivo extends GXProcedure
{
   public export_cargue_masivo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( export_cargue_masivo.class ), "" );
   }

   public export_cargue_masivo( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String[] aP2 )
   {
      export_cargue_masivo.this.AV16Tran_IndE_S = aP0;
      export_cargue_masivo.this.AV14List_tipo_elemento = aP1;
      export_cargue_masivo.this.aP2 = aP2;
      export_cargue_masivo.this.aP3 = aP3;
      export_cargue_masivo.this.aP3 = new String[] {""};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      export_cargue_masivo.this.AV16Tran_IndE_S = aP0;
      export_cargue_masivo.this.AV14List_tipo_elemento = aP1;
      export_cargue_masivo.this.aP2 = aP2;
      export_cargue_masivo.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Random = (int)(GXutil.random( )*10000) ;
      AV12Filename = "Export_LISTADO_COLUMNAS-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
      AV11ExcelDocument.Open(AV12Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11ExcelDocument.Clear();
      AV8CellRow = 1 ;
      AV13FirstColumn = 1 ;
      if ( GXutil.strcmp(AV16Tran_IndE_S, "E") == 0 )
      {
         if ( GXutil.strcmp(AV14List_tipo_elemento, "D") == 0 )
         {
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+0, 1, 1).setBold( (short)(1) );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+0, 1, 1).setText( "CONSECUTIVO" );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+1, 1, 1).setBold( (short)(1) );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+1, 1, 1).setText( "INDICADOR" );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+2, 1, 1).setBold( (short)(1) );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+2, 1, 1).setText( "OBSERVACIONES" );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+3, 1, 1).setBold( (short)(1) );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+3, 1, 1).setText( "MARCA" );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+4, 1, 1).setBold( (short)(1) );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+4, 1, 1).setText( "MODELO" );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+5, 1, 1).setBold( (short)(1) );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+5, 1, 1).setText( "SERIAL" );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+6, 1, 1).setBold( (short)(1) );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+6, 1, 1).setText( "COSTO ADQUISICION" );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+7, 1, 1).setBold( (short)(1) );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+7, 1, 1).setText( "OTROSCOSTOS" );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+8, 1, 1).setBold( (short)(1) );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+8, 1, 1).setText( "VALOR FUTURO" );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+9, 1, 1).setBold( (short)(1) );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+9, 1, 1).setText( "INTERES" );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+10, 1, 1).setBold( (short)(1) );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+10, 1, 1).setText( "TIEMPO" );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+11, 1, 1).setBold( (short)(1) );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+11, 1, 1).setText( "VIDAUTIL" );
            AV9Contador = (short)(12) ;
         }
         if ( GXutil.strcmp(AV14List_tipo_elemento, "C") == 0 )
         {
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+0, 1, 1).setBold( (short)(1) );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+0, 1, 1).setText( "CONSECUTIVO" );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+1, 1, 1).setBold( (short)(1) );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+1, 1, 1).setText( "OBSERVACIONES" );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+2, 1, 1).setBold( (short)(1) );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+2, 1, 1).setText( "MARCA" );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+3, 1, 1).setBold( (short)(1) );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+3, 1, 1).setText( "MODELO" );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+4, 1, 1).setBold( (short)(1) );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+4, 1, 1).setText( "SERIAL" );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+5, 1, 1).setBold( (short)(1) );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+5, 1, 1).setText( "CANTIDAD" );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+6, 1, 1).setBold( (short)(1) );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+6, 1, 1).setText( "COSTO UNITARIO" );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+7, 1, 1).setBold( (short)(1) );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+7, 1, 1).setText( "OTROSCOSTOS" );
            AV9Contador = (short)(8) ;
         }
         /* Using cursor P00262 */
         pr_default.execute(0, new Object[] {AV14List_tipo_elemento, AV14List_tipo_elemento});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A36List_Id = P00262_A36List_Id[0] ;
            A685List_tipo_elemento = P00262_A685List_tipo_elemento[0] ;
            n685List_tipo_elemento = P00262_n685List_tipo_elemento[0] ;
            A393List_Descripcion = P00262_A393List_Descripcion[0] ;
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+AV9Contador, 1, 1).setBold( (short)(1) );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+AV9Contador, 1, 1).setText( A393List_Descripcion );
            AV9Contador = (short)(AV9Contador+1) ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
      if ( ( GXutil.strcmp(AV16Tran_IndE_S, "S") == 0 ) || ( GXutil.strcmp(AV16Tran_IndE_S, "T") == 0 ) )
      {
         if ( GXutil.strcmp(AV14List_tipo_elemento, "D") == 0 )
         {
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+0, 1, 1).setBold( (short)(1) );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+0, 1, 1).setText( "PLACA" );
         }
         if ( GXutil.strcmp(AV14List_tipo_elemento, "C") == 0 )
         {
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+0, 1, 1).setBold( (short)(1) );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+0, 1, 1).setText( "CONSECUTIVO" );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+1, 1, 1).setBold( (short)(1) );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+1, 1, 1).setText( "CANTIDAD" );
            AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+2, 1, 1).setBold( (short)(1) );
         }
      }
      AV11ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11ExcelDocument.Close();
      cleanup();
   }

   public void S111( )
   {
      /* 'CHECKSTATUS' Routine */
      if ( AV11ExcelDocument.getErrCode() != 0 )
      {
         AV12Filename = "" ;
         AV10ErrorMessage = AV11ExcelDocument.getErrDescription() ;
         AV11ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   protected void cleanup( )
   {
      this.aP2[0] = export_cargue_masivo.this.AV12Filename;
      this.aP3[0] = export_cargue_masivo.this.AV10ErrorMessage;
      CloseOpenCursors();
      AV11ExcelDocument.cleanup();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Filename = "" ;
      AV10ErrorMessage = "" ;
      AV11ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      scmdbuf = "" ;
      P00262_A36List_Id = new long[1] ;
      P00262_A685List_tipo_elemento = new String[] {""} ;
      P00262_n685List_tipo_elemento = new boolean[] {false} ;
      P00262_A393List_Descripcion = new String[] {""} ;
      A685List_tipo_elemento = "" ;
      A393List_Descripcion = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.export_cargue_masivo__default(),
         new Object[] {
             new Object[] {
            P00262_A36List_Id, P00262_A685List_tipo_elemento, P00262_n685List_tipo_elemento, P00262_A393List_Descripcion
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV9Contador ;
   private short Gx_err ;
   private int AV15Random ;
   private int AV8CellRow ;
   private int AV13FirstColumn ;
   private long A36List_Id ;
   private String scmdbuf ;
   private boolean returnInSub ;
   private boolean n685List_tipo_elemento ;
   private String AV16Tran_IndE_S ;
   private String AV14List_tipo_elemento ;
   private String AV12Filename ;
   private String AV10ErrorMessage ;
   private String A685List_tipo_elemento ;
   private String A393List_Descripcion ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private long[] P00262_A36List_Id ;
   private String[] P00262_A685List_tipo_elemento ;
   private boolean[] P00262_n685List_tipo_elemento ;
   private String[] P00262_A393List_Descripcion ;
   private com.genexus.gxoffice.ExcelDoc AV11ExcelDocument ;
}

final  class export_cargue_masivo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00262", "SELECT List_Id, List_tipo_elemento, List_Descripcion FROM ALM_LISTA_ATRIBUTOS WHERE (List_tipo_elemento = ? or ? = 'A') AND (List_Id > 4) ORDER BY List_tipo_elemento ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
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
               stmt.setVarchar(1, (String)parms[0], 1);
               stmt.setVarchar(2, (String)parms[1], 1);
               return;
      }
   }

}

