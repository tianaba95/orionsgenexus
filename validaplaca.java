/*
               File: ValidaPlaca
        Description: Valida Placa
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:58.29
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class validaplaca extends GXProcedure
{
   public validaplaca( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( validaplaca.class ), "" );
   }

   public validaplaca( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 )
   {
      validaplaca.this.AV9Invd_NumeroPlaca = aP0;
      validaplaca.this.aP1 = aP1;
      validaplaca.this.aP1 = new String[] {""};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 )
   {
      validaplaca.this.AV9Invd_NumeroPlaca = aP0;
      validaplaca.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Ind = "S" ;
      AV12GXLvl2 = (byte)(0) ;
      /* Using cursor P000U2 */
      pr_default.execute(0, new Object[] {AV9Invd_NumeroPlaca});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A67Invd_NumeroPlaca = P000U2_A67Invd_NumeroPlaca[0] ;
         A66Elem_Consecutivo = P000U2_A66Elem_Consecutivo[0] ;
         AV12GXLvl2 = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV12GXLvl2 == 0 )
      {
         AV8Ind = "N" ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = validaplaca.this.AV8Ind;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Ind = "" ;
      scmdbuf = "" ;
      P000U2_A67Invd_NumeroPlaca = new String[] {""} ;
      P000U2_A66Elem_Consecutivo = new String[] {""} ;
      A67Invd_NumeroPlaca = "" ;
      A66Elem_Consecutivo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.validaplaca__default(),
         new Object[] {
             new Object[] {
            P000U2_A67Invd_NumeroPlaca, P000U2_A66Elem_Consecutivo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12GXLvl2 ;
   private short Gx_err ;
   private String scmdbuf ;
   private String AV9Invd_NumeroPlaca ;
   private String AV8Ind ;
   private String A67Invd_NumeroPlaca ;
   private String A66Elem_Consecutivo ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P000U2_A67Invd_NumeroPlaca ;
   private String[] P000U2_A66Elem_Consecutivo ;
}

final  class validaplaca__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000U2", "SELECT Invd_NumeroPlaca, Elem_Consecutivo FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Invd_NumeroPlaca = ? ORDER BY Invd_NumeroPlaca ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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

