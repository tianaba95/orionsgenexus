/*
               File: PCambiaAlmacenista
        Description: PCambia Almacenista
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:15.10
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcambiaalmacenista extends GXProcedure
{
   public pcambiaalmacenista( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcambiaalmacenista.class ), "" );
   }

   public pcambiaalmacenista( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public long executeUdp( long[] aP0 ,
                           String[] aP1 ,
                           String[] aP2 )
   {
      pcambiaalmacenista.this.AV8Cent_Id = aP0[0];
      this.aP0 = aP0;
      pcambiaalmacenista.this.AV9Alma_Modulo = aP1[0];
      this.aP1 = aP1;
      pcambiaalmacenista.this.AV10Alma_Codigo = aP2[0];
      this.aP2 = aP2;
      pcambiaalmacenista.this.AV11Cuen_Identificacion = aP3[0];
      this.aP3 = aP3;
      pcambiaalmacenista.this.aP3 = new long[] {0};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( long[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        long[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( long[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             long[] aP3 )
   {
      pcambiaalmacenista.this.AV8Cent_Id = aP0[0];
      this.aP0 = aP0;
      pcambiaalmacenista.this.AV9Alma_Modulo = aP1[0];
      this.aP1 = aP1;
      pcambiaalmacenista.this.AV10Alma_Codigo = aP2[0];
      this.aP2 = aP2;
      pcambiaalmacenista.this.AV11Cuen_Identificacion = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P002Q2 */
      pr_default.execute(0, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(AV11Cuen_Identificacion), new Long(AV8Cent_Id), AV9Alma_Modulo, AV10Alma_Codigo});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcambiaalmacenista.this.AV8Cent_Id;
      this.aP1[0] = pcambiaalmacenista.this.AV9Alma_Modulo;
      this.aP2[0] = pcambiaalmacenista.this.AV10Alma_Codigo;
      this.aP3[0] = pcambiaalmacenista.this.AV11Cuen_Identificacion;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "pcambiaalmacenista");
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.pcambiaalmacenista__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV8Cent_Id ;
   private long AV11Cuen_Identificacion ;
   private long A43Cuen_Identificacion ;
   private boolean n43Cuen_Identificacion ;
   private String AV9Alma_Modulo ;
   private String AV10Alma_Codigo ;
   private long[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private long[] aP3 ;
   private IDataStoreProvider pr_default ;
}

final  class pcambiaalmacenista__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P002Q2", "UPDATE ALM_INVENTARIO_DEVOLUTIVO SET Cuen_Identificacion=?  WHERE Invd_CentroCostoId = ? and Invd_ModuloAlmacen = ? and Invd_AlmacenCodigo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INVENTARIO_DEVOLUTIVO")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               stmt.setLong(2, ((Number) parms[2]).longValue());
               stmt.setVarchar(3, (String)parms[3], 8);
               stmt.setVarchar(4, (String)parms[4], 2);
               return;
      }
   }

}

