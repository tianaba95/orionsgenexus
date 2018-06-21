/*
               File: PEntraConsuDet
        Description: PEntra Consumo Detalle
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:0.90
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pentraconsudet extends GXProcedure
{
   public pentraconsudet( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pentraconsudet.class ), "" );
   }

   public pentraconsudet( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long[] aP0 ,
                             long[] aP1 ,
                             GXBaseCollection<com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem>[] aP2 ,
                             String[] aP3 )
   {
      pentraconsudet.this.AV11Tran_Id = aP0[0];
      this.aP0 = aP0;
      pentraconsudet.this.AV13pTDet_Consecutivo = aP1[0];
      this.aP1 = aP1;
      pentraconsudet.this.AV8SDTDetalleTrnAtr = aP2[0];
      this.aP2 = aP2;
      pentraconsudet.this.Gx_mode = aP3[0];
      this.aP3 = aP3;
      pentraconsudet.this.AV12Elem_Consecutivo = aP4[0];
      this.aP4 = aP4;
      pentraconsudet.this.aP4 = new String[] {""};
      initialize();
      privateExecute();
      return aP4[0];
   }

   public void execute( long[] aP0 ,
                        long[] aP1 ,
                        GXBaseCollection<com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem>[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( long[] aP0 ,
                             long[] aP1 ,
                             GXBaseCollection<com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem>[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pentraconsudet.this.AV11Tran_Id = aP0[0];
      this.aP0 = aP0;
      pentraconsudet.this.AV13pTDet_Consecutivo = aP1[0];
      this.aP1 = aP1;
      pentraconsudet.this.AV8SDTDetalleTrnAtr = aP2[0];
      this.aP2 = aP2;
      pentraconsudet.this.Gx_mode = aP3[0];
      this.aP3 = aP3;
      pentraconsudet.this.AV12Elem_Consecutivo = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: 'INICIO' */
      S111 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'INICIO' Routine */
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Execute user subroutine: 'AGREGAR' */
         S121 ();
         if (returnInSub) return;
      }
      else if ( GXutil.strcmp(Gx_mode, "UDP") == 0 )
      {
         /* Execute user subroutine: 'MODIFICAR' */
         S131 ();
         if (returnInSub) return;
      }
      else if ( GXutil.strcmp(Gx_mode, "EXC") == 0 )
      {
         /* Execute user subroutine: 'AGREGAREXC' */
         S141 ();
         if (returnInSub) return;
      }
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "pentraconsudet");
   }

   public void S121( )
   {
      /* 'AGREGAR' Routine */
      /* Using cursor P00182 */
      pr_default.execute(0, new Object[] {new Long(AV11Tran_Id), AV12Elem_Consecutivo});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A525TDet_Atributos = P00182_A525TDet_Atributos[0] ;
         A66Elem_Consecutivo = P00182_A66Elem_Consecutivo[0] ;
         A46Tran_Id = P00182_A46Tran_Id[0] ;
         A69TDet_Consecutivo = P00182_A69TDet_Consecutivo[0] ;
         AV10TDet_Consecutivo = A69TDet_Consecutivo ;
         /* Execute user subroutine: 'AGREGARATRIBUTOS' */
         S152 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S152( )
   {
      /* 'AGREGARATRIBUTOS' Routine */
      AV18GXV1 = 1 ;
      while ( AV18GXV1 <= AV8SDTDetalleTrnAtr.size() )
      {
         AV9SDTDetalleTrnAtrItem = (com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem)((com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem)AV8SDTDetalleTrnAtr.elementAt(-1+AV18GXV1));
         AV19GXLvl28 = (byte)(0) ;
         /* Using cursor P00183 */
         pr_default.execute(1, new Object[] {new Long(AV11Tran_Id), new Long(AV10TDet_Consecutivo), new Long(AV9SDTDetalleTrnAtrItem.getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listid())});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A70TDet_ListId = P00183_A70TDet_ListId[0] ;
            A69TDet_Consecutivo = P00183_A69TDet_Consecutivo[0] ;
            A46Tran_Id = P00183_A46Tran_Id[0] ;
            AV19GXLvl28 = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         if ( AV19GXLvl28 == 0 )
         {
            /*
               INSERT RECORD ON TABLE ALM_DETALLE_TRANSACCIONATRIBUT

            */
            A46Tran_Id = AV11Tran_Id ;
            A69TDet_Consecutivo = AV10TDet_Consecutivo ;
            A70TDet_ListId = AV9SDTDetalleTrnAtrItem.getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listid() ;
            A494TDet_ValorAtributo = AV9SDTDetalleTrnAtrItem.getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_valoratributo() ;
            /* Using cursor P00184 */
            pr_default.execute(2, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo), new Long(A70TDet_ListId), A494TDet_ValorAtributo});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCIONATRIBUT") ;
            if ( (pr_default.getStatus(2) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
         }
         AV18GXV1 = (int)(AV18GXV1+1) ;
      }
      /* Optimized UPDATE. */
      /* Using cursor P00185 */
      pr_default.execute(3, new Object[] {new Long(AV11Tran_Id), new Long(AV10TDet_Consecutivo)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCION") ;
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCION") ;
      /* End optimized UPDATE. */
   }

   public void S131( )
   {
      /* 'MODIFICAR' Routine */
      AV21GXV2 = 1 ;
      while ( AV21GXV2 <= AV8SDTDetalleTrnAtr.size() )
      {
         AV9SDTDetalleTrnAtrItem = (com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem)((com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem)AV8SDTDetalleTrnAtr.elementAt(-1+AV21GXV2));
         /* Optimized UPDATE. */
         /* Using cursor P00186 */
         pr_default.execute(4, new Object[] {AV9SDTDetalleTrnAtrItem.getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_valoratributo(), new Long(AV11Tran_Id), new Long(AV13pTDet_Consecutivo), new Long(AV9SDTDetalleTrnAtrItem.getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listid())});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCIONATRIBUT") ;
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCIONATRIBUT") ;
         /* End optimized UPDATE. */
         AV21GXV2 = (int)(AV21GXV2+1) ;
      }
      /* Optimized UPDATE. */
      /* Using cursor P00187 */
      pr_default.execute(5, new Object[] {new Long(AV11Tran_Id), new Long(AV13pTDet_Consecutivo)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCION") ;
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCION") ;
      /* End optimized UPDATE. */
   }

   public void S141( )
   {
      /* 'AGREGAREXC' Routine */
      AV24GXV3 = 1 ;
      while ( AV24GXV3 <= AV8SDTDetalleTrnAtr.size() )
      {
         AV9SDTDetalleTrnAtrItem = (com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem)((com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem)AV8SDTDetalleTrnAtr.elementAt(-1+AV24GXV3));
         /*
            INSERT RECORD ON TABLE ALM_DETALLE_TRANSACCIONATRIBUT

         */
         A46Tran_Id = AV11Tran_Id ;
         A69TDet_Consecutivo = AV13pTDet_Consecutivo ;
         A70TDet_ListId = AV9SDTDetalleTrnAtrItem.getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listid() ;
         A494TDet_ValorAtributo = AV9SDTDetalleTrnAtrItem.getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_valoratributo() ;
         /* Using cursor P00188 */
         pr_default.execute(6, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo), new Long(A70TDet_ListId), A494TDet_ValorAtributo});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCIONATRIBUT") ;
         if ( (pr_default.getStatus(6) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         /* Optimized UPDATE. */
         /* Using cursor P00189 */
         pr_default.execute(7, new Object[] {new Long(AV11Tran_Id), new Long(AV13pTDet_Consecutivo)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCION") ;
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCION") ;
         /* End optimized UPDATE. */
         AV24GXV3 = (int)(AV24GXV3+1) ;
      }
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "pentraconsudet");
   }

   protected void cleanup( )
   {
      this.aP0[0] = pentraconsudet.this.AV11Tran_Id;
      this.aP1[0] = pentraconsudet.this.AV13pTDet_Consecutivo;
      this.aP2[0] = pentraconsudet.this.AV8SDTDetalleTrnAtr;
      this.aP3[0] = pentraconsudet.this.Gx_mode;
      this.aP4[0] = pentraconsudet.this.AV12Elem_Consecutivo;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A494TDet_ValorAtributo = "" ;
      A525TDet_Atributos = "" ;
      scmdbuf = "" ;
      P00182_A525TDet_Atributos = new String[] {""} ;
      P00182_A66Elem_Consecutivo = new String[] {""} ;
      P00182_A46Tran_Id = new long[1] ;
      P00182_A69TDet_Consecutivo = new long[1] ;
      A66Elem_Consecutivo = "" ;
      AV9SDTDetalleTrnAtrItem = new com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem(remoteHandle, context);
      P00183_A70TDet_ListId = new long[1] ;
      P00183_A69TDet_Consecutivo = new long[1] ;
      P00183_A46Tran_Id = new long[1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.pentraconsudet__default(),
         new Object[] {
             new Object[] {
            P00182_A525TDet_Atributos, P00182_A66Elem_Consecutivo, P00182_A46Tran_Id, P00182_A69TDet_Consecutivo
            }
            , new Object[] {
            P00183_A70TDet_ListId, P00183_A69TDet_Consecutivo, P00183_A46Tran_Id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19GXLvl28 ;
   private short Gx_err ;
   private int AV18GXV1 ;
   private int GX_INS13 ;
   private int AV21GXV2 ;
   private int AV24GXV3 ;
   private long AV11Tran_Id ;
   private long AV13pTDet_Consecutivo ;
   private long A46Tran_Id ;
   private long A69TDet_Consecutivo ;
   private long A70TDet_ListId ;
   private long AV10TDet_Consecutivo ;
   private String Gx_mode ;
   private String scmdbuf ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private String AV12Elem_Consecutivo ;
   private String A494TDet_ValorAtributo ;
   private String A525TDet_Atributos ;
   private String A66Elem_Consecutivo ;
   private long[] aP0 ;
   private long[] aP1 ;
   private GXBaseCollection<com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem>[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00182_A525TDet_Atributos ;
   private String[] P00182_A66Elem_Consecutivo ;
   private long[] P00182_A46Tran_Id ;
   private long[] P00182_A69TDet_Consecutivo ;
   private long[] P00183_A70TDet_ListId ;
   private long[] P00183_A69TDet_Consecutivo ;
   private long[] P00183_A46Tran_Id ;
   private GXBaseCollection<com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem> AV8SDTDetalleTrnAtr ;
   private com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem AV9SDTDetalleTrnAtrItem ;
}

final  class pentraconsudet__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00182", "SELECT TDet_Atributos, Elem_Consecutivo, Tran_Id, TDet_Consecutivo FROM ALM_DETALLE_TRANSACCION WHERE (Tran_Id = ? and Elem_Consecutivo = ?) AND (TDet_Atributos = 'NO') ORDER BY Tran_Id, Elem_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P00183", "SELECT TDet_ListId, TDet_Consecutivo, Tran_Id FROM ALM_DETALLE_TRANSACCIONATRIBUT WHERE Tran_Id = ? and TDet_Consecutivo = ? and TDet_ListId = ? ORDER BY Tran_Id, TDet_Consecutivo, TDet_ListId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P00184", "INSERT INTO ALM_DETALLE_TRANSACCIONATRIBUT(Tran_Id, TDet_Consecutivo, TDet_ListId, TDet_ValorAtributo) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_DETALLE_TRANSACCIONATRIBUT")
         ,new UpdateCursor("P00185", "UPDATE ALM_DETALLE_TRANSACCION SET TDet_Atributos='NO'  WHERE Tran_Id = ? and TDet_Consecutivo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_DETALLE_TRANSACCION")
         ,new UpdateCursor("P00186", "UPDATE ALM_DETALLE_TRANSACCIONATRIBUT SET TDet_ValorAtributo=?  WHERE Tran_Id = ? and TDet_Consecutivo = ? and TDet_ListId = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_DETALLE_TRANSACCIONATRIBUT")
         ,new UpdateCursor("P00187", "UPDATE ALM_DETALLE_TRANSACCION SET TDet_Atributos='SI'  WHERE Tran_Id = ? and TDet_Consecutivo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_DETALLE_TRANSACCION")
         ,new UpdateCursor("P00188", "INSERT INTO ALM_DETALLE_TRANSACCIONATRIBUT(Tran_Id, TDet_Consecutivo, TDet_ListId, TDet_ValorAtributo) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_DETALLE_TRANSACCIONATRIBUT")
         ,new UpdateCursor("P00189", "UPDATE ALM_DETALLE_TRANSACCION SET TDet_Atributos='SI'  WHERE Tran_Id = ? and TDet_Consecutivo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_DETALLE_TRANSACCION")
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
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
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
               stmt.setVarchar(2, (String)parms[1], 9);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setVarchar(4, (String)parms[3], 200, false);
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 200, false);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setBigDecimal(3, ((Number) parms[2]).longValue(), 0);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setVarchar(4, (String)parms[3], 200, false);
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
      }
   }

}

