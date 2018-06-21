/*
               File: VerificaPlaca
        Description: Verifica Placa
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:2.51
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class verificaplaca extends GXProcedure
{
   public verificaplaca( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( verificaplaca.class ), "" );
   }

   public verificaplaca( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public int executeUdp( String aP0 ,
                          String[] aP1 ,
                          String[] aP2 ,
                          java.math.BigDecimal[] aP3 ,
                          String[] aP4 ,
                          String[] aP5 ,
                          long aP6 ,
                          long aP7 ,
                          String aP8 ,
                          String aP9 ,
                          String aP10 ,
                          String[] aP11 ,
                          String[] aP12 ,
                          long[] aP13 )
   {
      verificaplaca.this.AV13Placa = aP0;
      verificaplaca.this.aP1 = aP1;
      verificaplaca.this.aP2 = aP2;
      verificaplaca.this.aP3 = aP3;
      verificaplaca.this.aP4 = aP4;
      verificaplaca.this.aP5 = aP5;
      verificaplaca.this.AV14Regi_Id = aP6;
      verificaplaca.this.AV11Cent_Id = aP7;
      verificaplaca.this.AV9Alma_Modulo = aP8;
      verificaplaca.this.AV8Alma_Codigo = aP9;
      verificaplaca.this.AV10Bode_Codigo = aP10;
      verificaplaca.this.aP11 = aP11;
      verificaplaca.this.aP12 = aP12;
      verificaplaca.this.aP13 = aP13;
      verificaplaca.this.aP14 = aP14;
      verificaplaca.this.aP14 = new int[] {0};
      initialize();
      privateExecute();
      return aP14[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        long aP6 ,
                        long aP7 ,
                        String aP8 ,
                        String aP9 ,
                        String aP10 ,
                        String[] aP11 ,
                        String[] aP12 ,
                        long[] aP13 ,
                        int[] aP14 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             long aP6 ,
                             long aP7 ,
                             String aP8 ,
                             String aP9 ,
                             String aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             long[] aP13 ,
                             int[] aP14 )
   {
      verificaplaca.this.AV13Placa = aP0;
      verificaplaca.this.aP1 = aP1;
      verificaplaca.this.aP2 = aP2;
      verificaplaca.this.aP3 = aP3;
      verificaplaca.this.aP4 = aP4;
      verificaplaca.this.aP5 = aP5;
      verificaplaca.this.AV14Regi_Id = aP6;
      verificaplaca.this.AV11Cent_Id = aP7;
      verificaplaca.this.AV9Alma_Modulo = aP8;
      verificaplaca.this.AV8Alma_Codigo = aP9;
      verificaplaca.this.AV10Bode_Codigo = aP10;
      verificaplaca.this.aP11 = aP11;
      verificaplaca.this.aP12 = aP12;
      verificaplaca.this.aP13 = aP13;
      verificaplaca.this.aP14 = aP14;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Cata_Descripcion = "" ;
      AV17EsPlacaPadre = "" ;
      AV21PlacaPadre = "" ;
      AV23ValorAdquisicion = DecimalUtil.ZERO ;
      AV12Invd_Estado = "" ;
      AV16Error = "N" ;
      AV28GXLvl10 = (byte)(0) ;
      /* Using cursor P001H2 */
      pr_default.execute(0, new Object[] {AV13Placa});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A66Elem_Consecutivo = P001H2_A66Elem_Consecutivo[0] ;
         A37Cata_Codigo = P001H2_A37Cata_Codigo[0] ;
         A67Invd_NumeroPlaca = P001H2_A67Invd_NumeroPlaca[0] ;
         A298Cata_Descripcion = P001H2_A298Cata_Descripcion[0] ;
         A501Invd_EsPlacaPadre = P001H2_A501Invd_EsPlacaPadre[0] ;
         n501Invd_EsPlacaPadre = P001H2_n501Invd_EsPlacaPadre[0] ;
         A68Invd_PlacaPadre = P001H2_A68Invd_PlacaPadre[0] ;
         n68Invd_PlacaPadre = P001H2_n68Invd_PlacaPadre[0] ;
         A465Invd_ValorAdquisicion = P001H2_A465Invd_ValorAdquisicion[0] ;
         n465Invd_ValorAdquisicion = P001H2_n465Invd_ValorAdquisicion[0] ;
         A463Invd_Estado = P001H2_A463Invd_Estado[0] ;
         n463Invd_Estado = P001H2_n463Invd_Estado[0] ;
         A414Invd_BodegaCodigo = P001H2_A414Invd_BodegaCodigo[0] ;
         A413Invd_AlmacenCodigo = P001H2_A413Invd_AlmacenCodigo[0] ;
         A412Invd_ModuloAlmacen = P001H2_A412Invd_ModuloAlmacen[0] ;
         A411Invd_CentroCostoId = P001H2_A411Invd_CentroCostoId[0] ;
         A410Invd_RegionalId = P001H2_A410Invd_RegionalId[0] ;
         A37Cata_Codigo = P001H2_A37Cata_Codigo[0] ;
         A298Cata_Descripcion = P001H2_A298Cata_Descripcion[0] ;
         AV28GXLvl10 = (byte)(1) ;
         AV15Cata_Descripcion = A298Cata_Descripcion ;
         AV17EsPlacaPadre = A501Invd_EsPlacaPadre ;
         AV21PlacaPadre = A68Invd_PlacaPadre ;
         AV23ValorAdquisicion = A465Invd_ValorAdquisicion ;
         AV12Invd_Estado = A463Invd_Estado ;
         if ( ( AV14Regi_Id == A410Invd_RegionalId ) && ( AV11Cent_Id == A411Invd_CentroCostoId ) && ( GXutil.strcmp(AV9Alma_Modulo, A412Invd_ModuloAlmacen) == 0 ) && ( GXutil.strcmp(AV8Alma_Codigo, A413Invd_AlmacenCodigo) == 0 ) && ( GXutil.strcmp(AV10Bode_Codigo, A414Invd_BodegaCodigo) == 0 ) )
         {
            GXv_char1[0] = AV13Placa ;
            GXv_char2[0] = AV18Marca ;
            GXv_char3[0] = AV19Modelo ;
            GXv_char4[0] = AV22Serial ;
            GXv_char5[0] = AV20Observaciones ;
            GXv_int6[0] = AV25Tran_IdEntrada ;
            GXv_int7[0] = AV24Nro_Linea ;
            new com.orions2.buscaatributos(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_char3, GXv_char4, GXv_char5, GXv_int6, GXv_int7) ;
            verificaplaca.this.AV13Placa = GXv_char1[0] ;
            verificaplaca.this.AV18Marca = GXv_char2[0] ;
            verificaplaca.this.AV19Modelo = GXv_char3[0] ;
            verificaplaca.this.AV22Serial = GXv_char4[0] ;
            verificaplaca.this.AV20Observaciones = GXv_char5[0] ;
            verificaplaca.this.AV25Tran_IdEntrada = GXv_int6[0] ;
            verificaplaca.this.AV24Nro_Linea = GXv_int7[0] ;
            AV16Error = "N" ;
         }
         else
         {
            AV16Error = "S" ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV28GXLvl10 == 0 )
      {
         AV16Error = "E" ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = verificaplaca.this.AV15Cata_Descripcion;
      this.aP2[0] = verificaplaca.this.AV21PlacaPadre;
      this.aP3[0] = verificaplaca.this.AV23ValorAdquisicion;
      this.aP4[0] = verificaplaca.this.AV17EsPlacaPadre;
      this.aP5[0] = verificaplaca.this.AV12Invd_Estado;
      this.aP11[0] = verificaplaca.this.AV16Error;
      this.aP12[0] = verificaplaca.this.AV20Observaciones;
      this.aP13[0] = verificaplaca.this.AV25Tran_IdEntrada;
      this.aP14[0] = verificaplaca.this.AV24Nro_Linea;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15Cata_Descripcion = "" ;
      AV21PlacaPadre = "" ;
      AV23ValorAdquisicion = DecimalUtil.ZERO ;
      AV17EsPlacaPadre = "" ;
      AV12Invd_Estado = "" ;
      AV16Error = "" ;
      AV20Observaciones = "" ;
      scmdbuf = "" ;
      P001H2_A66Elem_Consecutivo = new String[] {""} ;
      P001H2_A37Cata_Codigo = new String[] {""} ;
      P001H2_A67Invd_NumeroPlaca = new String[] {""} ;
      P001H2_A298Cata_Descripcion = new String[] {""} ;
      P001H2_A501Invd_EsPlacaPadre = new String[] {""} ;
      P001H2_n501Invd_EsPlacaPadre = new boolean[] {false} ;
      P001H2_A68Invd_PlacaPadre = new String[] {""} ;
      P001H2_n68Invd_PlacaPadre = new boolean[] {false} ;
      P001H2_A465Invd_ValorAdquisicion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001H2_n465Invd_ValorAdquisicion = new boolean[] {false} ;
      P001H2_A463Invd_Estado = new String[] {""} ;
      P001H2_n463Invd_Estado = new boolean[] {false} ;
      P001H2_A414Invd_BodegaCodigo = new String[] {""} ;
      P001H2_A413Invd_AlmacenCodigo = new String[] {""} ;
      P001H2_A412Invd_ModuloAlmacen = new String[] {""} ;
      P001H2_A411Invd_CentroCostoId = new long[1] ;
      P001H2_A410Invd_RegionalId = new long[1] ;
      A66Elem_Consecutivo = "" ;
      A37Cata_Codigo = "" ;
      A67Invd_NumeroPlaca = "" ;
      A298Cata_Descripcion = "" ;
      A501Invd_EsPlacaPadre = "" ;
      A68Invd_PlacaPadre = "" ;
      A465Invd_ValorAdquisicion = DecimalUtil.ZERO ;
      A463Invd_Estado = "" ;
      A414Invd_BodegaCodigo = "" ;
      A413Invd_AlmacenCodigo = "" ;
      A412Invd_ModuloAlmacen = "" ;
      GXv_char1 = new String [1] ;
      AV18Marca = "" ;
      GXv_char2 = new String [1] ;
      AV19Modelo = "" ;
      GXv_char3 = new String [1] ;
      AV22Serial = "" ;
      GXv_char4 = new String [1] ;
      GXv_char5 = new String [1] ;
      GXv_int6 = new long [1] ;
      GXv_int7 = new int [1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.verificaplaca__default(),
         new Object[] {
             new Object[] {
            P001H2_A66Elem_Consecutivo, P001H2_A37Cata_Codigo, P001H2_A67Invd_NumeroPlaca, P001H2_A298Cata_Descripcion, P001H2_A501Invd_EsPlacaPadre, P001H2_n501Invd_EsPlacaPadre, P001H2_A68Invd_PlacaPadre, P001H2_n68Invd_PlacaPadre, P001H2_A465Invd_ValorAdquisicion, P001H2_n465Invd_ValorAdquisicion,
            P001H2_A463Invd_Estado, P001H2_n463Invd_Estado, P001H2_A414Invd_BodegaCodigo, P001H2_A413Invd_AlmacenCodigo, P001H2_A412Invd_ModuloAlmacen, P001H2_A411Invd_CentroCostoId, P001H2_A410Invd_RegionalId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV28GXLvl10 ;
   private short Gx_err ;
   private int AV24Nro_Linea ;
   private int GXv_int7[] ;
   private long AV14Regi_Id ;
   private long AV11Cent_Id ;
   private long AV25Tran_IdEntrada ;
   private long A411Invd_CentroCostoId ;
   private long A410Invd_RegionalId ;
   private long GXv_int6[] ;
   private java.math.BigDecimal AV23ValorAdquisicion ;
   private java.math.BigDecimal A465Invd_ValorAdquisicion ;
   private String AV17EsPlacaPadre ;
   private String AV16Error ;
   private String scmdbuf ;
   private String A501Invd_EsPlacaPadre ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private boolean n501Invd_EsPlacaPadre ;
   private boolean n68Invd_PlacaPadre ;
   private boolean n465Invd_ValorAdquisicion ;
   private boolean n463Invd_Estado ;
   private String AV13Placa ;
   private String AV15Cata_Descripcion ;
   private String AV21PlacaPadre ;
   private String AV12Invd_Estado ;
   private String AV9Alma_Modulo ;
   private String AV8Alma_Codigo ;
   private String AV10Bode_Codigo ;
   private String AV20Observaciones ;
   private String A66Elem_Consecutivo ;
   private String A37Cata_Codigo ;
   private String A67Invd_NumeroPlaca ;
   private String A298Cata_Descripcion ;
   private String A68Invd_PlacaPadre ;
   private String A463Invd_Estado ;
   private String A414Invd_BodegaCodigo ;
   private String A413Invd_AlmacenCodigo ;
   private String A412Invd_ModuloAlmacen ;
   private String AV18Marca ;
   private String AV19Modelo ;
   private String AV22Serial ;
   private String[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP11 ;
   private String[] aP12 ;
   private long[] aP13 ;
   private int[] aP14 ;
   private IDataStoreProvider pr_default ;
   private String[] P001H2_A66Elem_Consecutivo ;
   private String[] P001H2_A37Cata_Codigo ;
   private String[] P001H2_A67Invd_NumeroPlaca ;
   private String[] P001H2_A298Cata_Descripcion ;
   private String[] P001H2_A501Invd_EsPlacaPadre ;
   private boolean[] P001H2_n501Invd_EsPlacaPadre ;
   private String[] P001H2_A68Invd_PlacaPadre ;
   private boolean[] P001H2_n68Invd_PlacaPadre ;
   private java.math.BigDecimal[] P001H2_A465Invd_ValorAdquisicion ;
   private boolean[] P001H2_n465Invd_ValorAdquisicion ;
   private String[] P001H2_A463Invd_Estado ;
   private boolean[] P001H2_n463Invd_Estado ;
   private String[] P001H2_A414Invd_BodegaCodigo ;
   private String[] P001H2_A413Invd_AlmacenCodigo ;
   private String[] P001H2_A412Invd_ModuloAlmacen ;
   private long[] P001H2_A411Invd_CentroCostoId ;
   private long[] P001H2_A410Invd_RegionalId ;
}

final  class verificaplaca__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001H2", "SELECT T1.Elem_Consecutivo, T2.Cata_Codigo, T1.Invd_NumeroPlaca, T3.Cata_Descripcion, T1.Invd_EsPlacaPadre, T1.Invd_PlacaPadre, T1.Invd_ValorAdquisicion, T1.Invd_Estado, T1.Invd_BodegaCodigo, T1.Invd_AlmacenCodigo, T1.Invd_ModuloAlmacen, T1.Invd_CentroCostoId, T1.Invd_RegionalId FROM ((ALM_INVENTARIO_DEVOLUTIVO T1 INNER JOIN ALM_ELEMENTO T2 ON T2.Elem_Consecutivo = T1.Elem_Consecutivo) INNER JOIN ALM_CATALOGO T3 ON T3.Cata_Codigo = T2.Cata_Codigo) WHERE T1.Invd_NumeroPlaca = ? ORDER BY T1.Invd_NumeroPlaca ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getString(5, 2) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[14])[0] = rslt.getVarchar(11) ;
               ((long[]) buf[15])[0] = rslt.getLong(12) ;
               ((long[]) buf[16])[0] = rslt.getLong(13) ;
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
               stmt.setVarchar(1, (String)parms[0], 30);
               return;
      }
   }

}

