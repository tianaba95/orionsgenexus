/*
               File: DPDocumentos
        Description: DPDocumentos
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:55.84
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpdocumentos extends GXProcedure
{
   public dpdocumentos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpdocumentos.class ), "" );
   }

   public dpdocumentos( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GXBaseCollection<com.orions2.SdtSDTDocumentos_SDTDocumentosItem> executeUdp( String aP0 )
   {
      dpdocumentos.this.AV5Tpmo_Codigo = aP0;
      dpdocumentos.this.aP1 = aP1;
      dpdocumentos.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.orions2.SdtSDTDocumentos_SDTDocumentosItem>()};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( String aP0 ,
                        GXBaseCollection<com.orions2.SdtSDTDocumentos_SDTDocumentosItem>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             GXBaseCollection<com.orions2.SdtSDTDocumentos_SDTDocumentosItem>[] aP1 )
   {
      dpdocumentos.this.AV5Tpmo_Codigo = aP0;
      dpdocumentos.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000I2 */
      pr_default.execute(0, new Object[] {AV5Tpmo_Codigo});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A38Tpmo_Codigo = P000I2_A38Tpmo_Codigo[0] ;
         A819Docu_Nro = P000I2_A819Docu_Nro[0] ;
         A820Docu_Descripcion = P000I2_A820Docu_Descripcion[0] ;
         n820Docu_Descripcion = P000I2_n820Docu_Descripcion[0] ;
         A821Docu_Prefijo = P000I2_A821Docu_Prefijo[0] ;
         n821Docu_Prefijo = P000I2_n821Docu_Prefijo[0] ;
         A820Docu_Descripcion = P000I2_A820Docu_Descripcion[0] ;
         n820Docu_Descripcion = P000I2_n820Docu_Descripcion[0] ;
         A821Docu_Prefijo = P000I2_A821Docu_Prefijo[0] ;
         n821Docu_Prefijo = P000I2_n821Docu_Prefijo[0] ;
         Gxm1sdtdocumentos = (com.orions2.SdtSDTDocumentos_SDTDocumentosItem)new com.orions2.SdtSDTDocumentos_SDTDocumentosItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtdocumentos, 0);
         Gxm1sdtdocumentos.setgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_nro_documento( A819Docu_Nro );
         Gxm1sdtdocumentos.setgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_descrip_documento( A820Docu_Descripcion );
         Gxm1sdtdocumentos.setgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_prefijo_documento( A821Docu_Prefijo );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = dpdocumentos.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<com.orions2.SdtSDTDocumentos_SDTDocumentosItem>(com.orions2.SdtSDTDocumentos_SDTDocumentosItem.class, "SDTDocumentos.SDTDocumentosItem", "ACBSENA", remoteHandle);
      scmdbuf = "" ;
      P000I2_A38Tpmo_Codigo = new String[] {""} ;
      P000I2_A819Docu_Nro = new short[1] ;
      P000I2_A820Docu_Descripcion = new String[] {""} ;
      P000I2_n820Docu_Descripcion = new boolean[] {false} ;
      P000I2_A821Docu_Prefijo = new String[] {""} ;
      P000I2_n821Docu_Prefijo = new boolean[] {false} ;
      A38Tpmo_Codigo = "" ;
      A820Docu_Descripcion = "" ;
      A821Docu_Prefijo = "" ;
      Gxm1sdtdocumentos = new com.orions2.SdtSDTDocumentos_SDTDocumentosItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.dpdocumentos__default(),
         new Object[] {
             new Object[] {
            P000I2_A38Tpmo_Codigo, P000I2_A819Docu_Nro, P000I2_A820Docu_Descripcion, P000I2_n820Docu_Descripcion, P000I2_A821Docu_Prefijo, P000I2_n821Docu_Prefijo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A819Docu_Nro ;
   private short Gx_err ;
   private String scmdbuf ;
   private boolean n820Docu_Descripcion ;
   private boolean n821Docu_Prefijo ;
   private String AV5Tpmo_Codigo ;
   private String A38Tpmo_Codigo ;
   private String A820Docu_Descripcion ;
   private String A821Docu_Prefijo ;
   private GXBaseCollection<com.orions2.SdtSDTDocumentos_SDTDocumentosItem>[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P000I2_A38Tpmo_Codigo ;
   private short[] P000I2_A819Docu_Nro ;
   private String[] P000I2_A820Docu_Descripcion ;
   private boolean[] P000I2_n820Docu_Descripcion ;
   private String[] P000I2_A821Docu_Prefijo ;
   private boolean[] P000I2_n821Docu_Prefijo ;
   private GXBaseCollection<com.orions2.SdtSDTDocumentos_SDTDocumentosItem> Gxm2rootcol ;
   private com.orions2.SdtSDTDocumentos_SDTDocumentosItem Gxm1sdtdocumentos ;
}

final  class dpdocumentos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000I2", "SELECT T1.Tpmo_Codigo, T1.Docu_Nro, T2.Docu_Descripcion, T2.Docu_Prefijo FROM (ALM_TIPO_MOVIMIENTO_DOCUMENTO T1 INNER JOIN ALM_DOCUMENTOS T2 ON T2.Docu_Nro = T1.Docu_Nro) WHERE T1.Tpmo_Codigo = ? ORDER BY T1.Tpmo_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setVarchar(1, (String)parms[0], 3);
               return;
      }
   }

}

