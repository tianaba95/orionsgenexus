/*
               File: Export_Novedades
        Description: Export_Novedades
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:14.81
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class export_novedades extends GXProcedure
{
   public export_novedades( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( export_novedades.class ), "" );
   }

   public export_novedades( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String[] aP0 )
   {
      export_novedades.this.aP0 = aP0;
      export_novedades.this.aP1 = aP1;
      export_novedades.this.aP1 = new String[] {""};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      export_novedades.this.aP0 = aP0;
      export_novedades.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Random = (int)(GXutil.random( )*10000) ;
      AV12Filename = "Export_Novedades" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+0, 1, 1).setBold( (short)(1) );
      AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+0, 1, 1).setText( "PLACA O CONSECUTIVO" );
      AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+1, 1, 1).setBold( (short)(1) );
      AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+1, 1, 1).setText( "NUEVO VALOR" );
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
      this.aP0[0] = export_novedades.this.AV12Filename;
      this.aP1[0] = export_novedades.this.AV10ErrorMessage;
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
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV15Random ;
   private int AV8CellRow ;
   private int AV13FirstColumn ;
   private boolean returnInSub ;
   private String AV12Filename ;
   private String AV10ErrorMessage ;
   private String[] aP0 ;
   private String[] aP1 ;
   private com.genexus.gxoffice.ExcelDoc AV11ExcelDocument ;
}

