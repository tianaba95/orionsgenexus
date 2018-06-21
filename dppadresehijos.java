/*
               File: DPPadreseHijos
        Description: DPPadrese Hijos
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:55.2
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dppadresehijos extends GXProcedure
{
   public dppadresehijos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dppadresehijos.class ), "" );
   }

   public dppadresehijos( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public com.orions2.SdtSDTPadreseHijos executeUdp( long aP0 )
   {
      dppadresehijos.this.AV5Tran_Id = aP0;
      dppadresehijos.this.aP1 = aP1;
      dppadresehijos.this.aP1 = new com.orions2.SdtSDTPadreseHijos[] {new com.orions2.SdtSDTPadreseHijos()};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( long aP0 ,
                        com.orions2.SdtSDTPadreseHijos[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( long aP0 ,
                             com.orions2.SdtSDTPadreseHijos[] aP1 )
   {
      dppadresehijos.this.AV5Tran_Id = aP0;
      dppadresehijos.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00052 */
      pr_default.execute(0, new Object[] {new Long(AV5Tran_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A57Tran_RegionId = P00052_A57Tran_RegionId[0] ;
         n57Tran_RegionId = P00052_n57Tran_RegionId[0] ;
         A46Tran_Id = P00052_A46Tran_Id[0] ;
         A594Tran_RegionAbrev = P00052_A594Tran_RegionAbrev[0] ;
         n594Tran_RegionAbrev = P00052_n594Tran_RegionAbrev[0] ;
         A421Tran_RegionCodigo = P00052_A421Tran_RegionCodigo[0] ;
         n421Tran_RegionCodigo = P00052_n421Tran_RegionCodigo[0] ;
         A594Tran_RegionAbrev = P00052_A594Tran_RegionAbrev[0] ;
         n594Tran_RegionAbrev = P00052_n594Tran_RegionAbrev[0] ;
         A421Tran_RegionCodigo = P00052_A421Tran_RegionCodigo[0] ;
         n421Tran_RegionCodigo = P00052_n421Tran_RegionCodigo[0] ;
         Gxm1sdtpadresehijos.setgxTv_SdtSDTPadreseHijos_Regiabrev( A594Tran_RegionAbrev );
         Gxm1sdtpadresehijos.setgxTv_SdtSDTPadreseHijos_Regicod( A421Tran_RegionCodigo );
         /* Using cursor P00053 */
         pr_default.execute(1, new Object[] {new Long(A46Tran_Id)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A490TDet_PlacaNumero = P00053_A490TDet_PlacaNumero[0] ;
            n490TDet_PlacaNumero = P00053_n490TDet_PlacaNumero[0] ;
            A491TDet_PlacaPadre = P00053_A491TDet_PlacaPadre[0] ;
            n491TDet_PlacaPadre = P00053_n491TDet_PlacaPadre[0] ;
            A69TDet_Consecutivo = P00053_A69TDet_Consecutivo[0] ;
            Gxm2sdtpadresehijos_placas = (com.orions2.SdtSDTPadreseHijos_PlacasItem)new com.orions2.SdtSDTPadreseHijos_PlacasItem(remoteHandle, context);
            Gxm1sdtpadresehijos.getgxTv_SdtSDTPadreseHijos_Placas().add(Gxm2sdtpadresehijos_placas, 0);
            Gxm2sdtpadresehijos_placas.setgxTv_SdtSDTPadreseHijos_PlacasItem_Tdetplacanumero( A490TDet_PlacaNumero );
            Gxm2sdtpadresehijos_placas.setgxTv_SdtSDTPadreseHijos_PlacasItem_Tdetplacapadre( A491TDet_PlacaPadre );
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = dppadresehijos.this.Gxm1sdtpadresehijos;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm1sdtpadresehijos = new com.orions2.SdtSDTPadreseHijos(remoteHandle, context);
      scmdbuf = "" ;
      P00052_A57Tran_RegionId = new long[1] ;
      P00052_n57Tran_RegionId = new boolean[] {false} ;
      P00052_A46Tran_Id = new long[1] ;
      P00052_A594Tran_RegionAbrev = new String[] {""} ;
      P00052_n594Tran_RegionAbrev = new boolean[] {false} ;
      P00052_A421Tran_RegionCodigo = new short[1] ;
      P00052_n421Tran_RegionCodigo = new boolean[] {false} ;
      A594Tran_RegionAbrev = "" ;
      P00053_A46Tran_Id = new long[1] ;
      P00053_A490TDet_PlacaNumero = new String[] {""} ;
      P00053_n490TDet_PlacaNumero = new boolean[] {false} ;
      P00053_A491TDet_PlacaPadre = new String[] {""} ;
      P00053_n491TDet_PlacaPadre = new boolean[] {false} ;
      P00053_A69TDet_Consecutivo = new long[1] ;
      A490TDet_PlacaNumero = "" ;
      A491TDet_PlacaPadre = "" ;
      Gxm2sdtpadresehijos_placas = new com.orions2.SdtSDTPadreseHijos_PlacasItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.dppadresehijos__default(),
         new Object[] {
             new Object[] {
            P00052_A57Tran_RegionId, P00052_n57Tran_RegionId, P00052_A46Tran_Id, P00052_A594Tran_RegionAbrev, P00052_n594Tran_RegionAbrev, P00052_A421Tran_RegionCodigo, P00052_n421Tran_RegionCodigo
            }
            , new Object[] {
            P00053_A46Tran_Id, P00053_A490TDet_PlacaNumero, P00053_n490TDet_PlacaNumero, P00053_A491TDet_PlacaPadre, P00053_n491TDet_PlacaPadre, P00053_A69TDet_Consecutivo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A421Tran_RegionCodigo ;
   private short Gx_err ;
   private long AV5Tran_Id ;
   private long A57Tran_RegionId ;
   private long A46Tran_Id ;
   private long A69TDet_Consecutivo ;
   private String scmdbuf ;
   private boolean n57Tran_RegionId ;
   private boolean n594Tran_RegionAbrev ;
   private boolean n421Tran_RegionCodigo ;
   private boolean n490TDet_PlacaNumero ;
   private boolean n491TDet_PlacaPadre ;
   private String A594Tran_RegionAbrev ;
   private String A490TDet_PlacaNumero ;
   private String A491TDet_PlacaPadre ;
   private com.orions2.SdtSDTPadreseHijos[] aP1 ;
   private IDataStoreProvider pr_default ;
   private long[] P00052_A57Tran_RegionId ;
   private boolean[] P00052_n57Tran_RegionId ;
   private long[] P00052_A46Tran_Id ;
   private String[] P00052_A594Tran_RegionAbrev ;
   private boolean[] P00052_n594Tran_RegionAbrev ;
   private short[] P00052_A421Tran_RegionCodigo ;
   private boolean[] P00052_n421Tran_RegionCodigo ;
   private long[] P00053_A46Tran_Id ;
   private String[] P00053_A490TDet_PlacaNumero ;
   private boolean[] P00053_n490TDet_PlacaNumero ;
   private String[] P00053_A491TDet_PlacaPadre ;
   private boolean[] P00053_n491TDet_PlacaPadre ;
   private long[] P00053_A69TDet_Consecutivo ;
   private com.orions2.SdtSDTPadreseHijos Gxm1sdtpadresehijos ;
   private com.orions2.SdtSDTPadreseHijos_PlacasItem Gxm2sdtpadresehijos_placas ;
}

final  class dppadresehijos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00052", "SELECT T1.Tran_RegionId AS Tran_RegionId, T1.Tran_Id, T2.Regi_Abrev AS Tran_RegionAbrev, T2.Regi_Cod AS Tran_RegionCodigo FROM (ALM_TRANSACCION T1 LEFT JOIN GEN_REGIONAL T2 ON T2.Regi_Id = T1.Tran_RegionId) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P00053", "SELECT Tran_Id, TDet_PlacaNumero, TDet_PlacaPadre, TDet_Consecutivo FROM ALM_DETALLE_TRANSACCION WHERE Tran_Id = ? ORDER BY Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

