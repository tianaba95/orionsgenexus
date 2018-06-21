/*
               File: DPNovedadesBien
        Description: DPNovedades Bien
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:55.90
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpnovedadesbien extends GXProcedure
{
   public dpnovedadesbien( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpnovedadesbien.class ), "" );
   }

   public dpnovedadesbien( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GXBaseCollection<com.orions2.SdtSDTNovedadesBien_SDTNovedadesBienItem> executeUdp( String aP0 )
   {
      dpnovedadesbien.this.AV5Placa = aP0;
      dpnovedadesbien.this.aP1 = aP1;
      dpnovedadesbien.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.orions2.SdtSDTNovedadesBien_SDTNovedadesBienItem>()};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( String aP0 ,
                        GXBaseCollection<com.orions2.SdtSDTNovedadesBien_SDTNovedadesBienItem>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             GXBaseCollection<com.orions2.SdtSDTNovedadesBien_SDTNovedadesBienItem>[] aP1 )
   {
      dpnovedadesbien.this.AV5Placa = aP0;
      dpnovedadesbien.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000K2 */
      pr_default.execute(0, new Object[] {AV5Placa});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A810Nove_Placa = P000K2_A810Nove_Placa[0] ;
         A765Nove_Estado = P000K2_A765Nove_Estado[0] ;
         n765Nove_Estado = P000K2_n765Nove_Estado[0] ;
         A106Nove_Identificador = P000K2_A106Nove_Identificador[0] ;
         A811Nove_ValorAntiguo = P000K2_A811Nove_ValorAntiguo[0] ;
         n811Nove_ValorAntiguo = P000K2_n811Nove_ValorAntiguo[0] ;
         A812Nove_ValorNuevo = P000K2_A812Nove_ValorNuevo[0] ;
         n812Nove_ValorNuevo = P000K2_n812Nove_ValorNuevo[0] ;
         A104TNov_Codigo = P000K2_A104TNov_Codigo[0] ;
         n104TNov_Codigo = P000K2_n104TNov_Codigo[0] ;
         A769TNov_Descripcion = P000K2_A769TNov_Descripcion[0] ;
         n769TNov_Descripcion = P000K2_n769TNov_Descripcion[0] ;
         A780Nove_FechaRegistro = P000K2_A780Nove_FechaRegistro[0] ;
         n780Nove_FechaRegistro = P000K2_n780Nove_FechaRegistro[0] ;
         A108Nove_Linea = P000K2_A108Nove_Linea[0] ;
         A765Nove_Estado = P000K2_A765Nove_Estado[0] ;
         n765Nove_Estado = P000K2_n765Nove_Estado[0] ;
         A104TNov_Codigo = P000K2_A104TNov_Codigo[0] ;
         n104TNov_Codigo = P000K2_n104TNov_Codigo[0] ;
         A780Nove_FechaRegistro = P000K2_A780Nove_FechaRegistro[0] ;
         n780Nove_FechaRegistro = P000K2_n780Nove_FechaRegistro[0] ;
         A769TNov_Descripcion = P000K2_A769TNov_Descripcion[0] ;
         n769TNov_Descripcion = P000K2_n769TNov_Descripcion[0] ;
         Gxm1sdtnovedadesbien = (com.orions2.SdtSDTNovedadesBien_SDTNovedadesBienItem)new com.orions2.SdtSDTNovedadesBien_SDTNovedadesBienItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtnovedadesbien, 0);
         Gxm1sdtnovedadesbien.setgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_identificador( A106Nove_Identificador );
         Gxm1sdtnovedadesbien.setgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_fecharegistro( A780Nove_FechaRegistro );
         Gxm1sdtnovedadesbien.setgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_placa( A810Nove_Placa );
         Gxm1sdtnovedadesbien.setgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_valorantiguo( A811Nove_ValorAntiguo );
         Gxm1sdtnovedadesbien.setgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_valornuevo( A812Nove_ValorNuevo );
         Gxm1sdtnovedadesbien.setgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Tnov_codigo( A104TNov_Codigo );
         Gxm1sdtnovedadesbien.setgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Tnov_descripcion( A769TNov_Descripcion );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = dpnovedadesbien.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<com.orions2.SdtSDTNovedadesBien_SDTNovedadesBienItem>(com.orions2.SdtSDTNovedadesBien_SDTNovedadesBienItem.class, "SDTNovedadesBien.SDTNovedadesBienItem", "ACBSENA", remoteHandle);
      scmdbuf = "" ;
      P000K2_A810Nove_Placa = new String[] {""} ;
      P000K2_A765Nove_Estado = new String[] {""} ;
      P000K2_n765Nove_Estado = new boolean[] {false} ;
      P000K2_A106Nove_Identificador = new long[1] ;
      P000K2_A811Nove_ValorAntiguo = new String[] {""} ;
      P000K2_n811Nove_ValorAntiguo = new boolean[] {false} ;
      P000K2_A812Nove_ValorNuevo = new String[] {""} ;
      P000K2_n812Nove_ValorNuevo = new boolean[] {false} ;
      P000K2_A104TNov_Codigo = new int[1] ;
      P000K2_n104TNov_Codigo = new boolean[] {false} ;
      P000K2_A769TNov_Descripcion = new String[] {""} ;
      P000K2_n769TNov_Descripcion = new boolean[] {false} ;
      P000K2_A780Nove_FechaRegistro = new java.util.Date[] {GXutil.nullDate()} ;
      P000K2_n780Nove_FechaRegistro = new boolean[] {false} ;
      P000K2_A108Nove_Linea = new int[1] ;
      A810Nove_Placa = "" ;
      A765Nove_Estado = "" ;
      A811Nove_ValorAntiguo = "" ;
      A812Nove_ValorNuevo = "" ;
      A769TNov_Descripcion = "" ;
      A780Nove_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      Gxm1sdtnovedadesbien = new com.orions2.SdtSDTNovedadesBien_SDTNovedadesBienItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.dpnovedadesbien__default(),
         new Object[] {
             new Object[] {
            P000K2_A810Nove_Placa, P000K2_A765Nove_Estado, P000K2_n765Nove_Estado, P000K2_A106Nove_Identificador, P000K2_A811Nove_ValorAntiguo, P000K2_n811Nove_ValorAntiguo, P000K2_A812Nove_ValorNuevo, P000K2_n812Nove_ValorNuevo, P000K2_A104TNov_Codigo, P000K2_n104TNov_Codigo,
            P000K2_A769TNov_Descripcion, P000K2_n769TNov_Descripcion, P000K2_A780Nove_FechaRegistro, P000K2_n780Nove_FechaRegistro, P000K2_A108Nove_Linea
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A104TNov_Codigo ;
   private int A108Nove_Linea ;
   private long A106Nove_Identificador ;
   private String scmdbuf ;
   private String A765Nove_Estado ;
   private java.util.Date A780Nove_FechaRegistro ;
   private boolean n765Nove_Estado ;
   private boolean n811Nove_ValorAntiguo ;
   private boolean n812Nove_ValorNuevo ;
   private boolean n104TNov_Codigo ;
   private boolean n769TNov_Descripcion ;
   private boolean n780Nove_FechaRegistro ;
   private String AV5Placa ;
   private String A810Nove_Placa ;
   private String A811Nove_ValorAntiguo ;
   private String A812Nove_ValorNuevo ;
   private String A769TNov_Descripcion ;
   private GXBaseCollection<com.orions2.SdtSDTNovedadesBien_SDTNovedadesBienItem>[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P000K2_A810Nove_Placa ;
   private String[] P000K2_A765Nove_Estado ;
   private boolean[] P000K2_n765Nove_Estado ;
   private long[] P000K2_A106Nove_Identificador ;
   private String[] P000K2_A811Nove_ValorAntiguo ;
   private boolean[] P000K2_n811Nove_ValorAntiguo ;
   private String[] P000K2_A812Nove_ValorNuevo ;
   private boolean[] P000K2_n812Nove_ValorNuevo ;
   private int[] P000K2_A104TNov_Codigo ;
   private boolean[] P000K2_n104TNov_Codigo ;
   private String[] P000K2_A769TNov_Descripcion ;
   private boolean[] P000K2_n769TNov_Descripcion ;
   private java.util.Date[] P000K2_A780Nove_FechaRegistro ;
   private boolean[] P000K2_n780Nove_FechaRegistro ;
   private int[] P000K2_A108Nove_Linea ;
   private GXBaseCollection<com.orions2.SdtSDTNovedadesBien_SDTNovedadesBienItem> Gxm2rootcol ;
   private com.orions2.SdtSDTNovedadesBien_SDTNovedadesBienItem Gxm1sdtnovedadesbien ;
}

final  class dpnovedadesbien__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000K2", "SELECT T1.Nove_Placa, T2.Nove_Estado, T1.Nove_Identificador, T1.Nove_ValorAntiguo, T1.Nove_ValorNuevo, T2.TNov_Codigo, T3.TNov_Descripcion, T2.Nove_FechaRegistro, T1.Nove_Linea FROM ((ALM_NOVEDADDETALLE T1 INNER JOIN ALM_NOVEDAD T2 ON T2.Nove_Identificador = T1.Nove_Identificador) LEFT JOIN ALM_TIPO_NOVEDAD T3 ON T3.TNov_Codigo = T2.TNov_Codigo) WHERE T1.Nove_Placa = ? and T2.Nove_Estado = 'C' ORDER BY T1.Nove_Placa, T2.Nove_Estado, T2.Nove_FechaRegistro DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9) ;
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

