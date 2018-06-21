/*
               File: PCargarMenu
        Description: Cargar Menu
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:7.10
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcargarmenu extends GXProcedure
{
   public pcargarmenu( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcargarmenu.class ), "" );
   }

   public pcargarmenu( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GXBaseCollection<com.orions2.SdtgpxMenuItems_gpxMenuItem> executeUdp( long aP0 )
   {
      pcargarmenu.this.AV16Usua_Id = aP0;
      pcargarmenu.this.aP1 = aP1;
      pcargarmenu.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.orions2.SdtgpxMenuItems_gpxMenuItem>()};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( long aP0 ,
                        GXBaseCollection<com.orions2.SdtgpxMenuItems_gpxMenuItem>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( long aP0 ,
                             GXBaseCollection<com.orions2.SdtgpxMenuItems_gpxMenuItem>[] aP1 )
   {
      pcargarmenu.this.AV16Usua_Id = aP0;
      pcargarmenu.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: 'CARGARMODULOS' */
      S111 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CARGARMODULOS' Routine */
      /* Using cursor P001T2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A16Modu_Id = P001T2_A16Modu_Id[0] ;
         A17Modu_Descripcion = P001T2_A17Modu_Descripcion[0] ;
         AV12Modu_Id = A16Modu_Id ;
         AV9gpxMenuItem.setgxTv_SdtgpxMenuItems_gpxMenuItem_Code( GXutil.str( AV12Modu_Id, 11, 0) );
         AV9gpxMenuItem.setgxTv_SdtgpxMenuItems_gpxMenuItem_Title( A17Modu_Descripcion );
         AV9gpxMenuItem.setgxTv_SdtgpxMenuItems_gpxMenuItem_Description( A17Modu_Descripcion );
         AV9gpxMenuItem.setgxTv_SdtgpxMenuItems_gpxMenuItem_Url( "#" );
         /* Execute user subroutine: 'CARGARPANTALLAS' */
         S122 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV8gpxMenuItems.add(AV9gpxMenuItem, 0);
         AV9gpxMenuItem = (com.orions2.SdtgpxMenuItems_gpxMenuItem)new com.orions2.SdtgpxMenuItems_gpxMenuItem(remoteHandle, context);
         AV11gpxMenuItemsPantalla.clear();
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S122( )
   {
      /* 'CARGARPANTALLAS' Routine */
      /* Using cursor P001T3 */
      pr_default.execute(1, new Object[] {new Long(AV12Modu_Id)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A16Modu_Id = P001T3_A16Modu_Id[0] ;
         A18Pant_Id = P001T3_A18Pant_Id[0] ;
         A19Pant_Descripcion = P001T3_A19Pant_Descripcion[0] ;
         A203Pant_NombreInterno = P001T3_A203Pant_NombreInterno[0] ;
         A697Pant_Orden = P001T3_A697Pant_Orden[0] ;
         AV10gpxMenuItemPantalla = (com.orions2.SdtgpxMenuItems_gpxMenuItem)new com.orions2.SdtgpxMenuItems_gpxMenuItem(remoteHandle, context);
         AV15Pant_Id = A18Pant_Id ;
         AV10gpxMenuItemPantalla.setgxTv_SdtgpxMenuItems_gpxMenuItem_Code( GXutil.str( AV15Pant_Id, 6, 0) );
         AV10gpxMenuItemPantalla.setgxTv_SdtgpxMenuItems_gpxMenuItem_Title( A19Pant_Descripcion );
         AV10gpxMenuItemPantalla.setgxTv_SdtgpxMenuItems_gpxMenuItem_Description( A19Pant_Descripcion );
         AV10gpxMenuItemPantalla.setgxTv_SdtgpxMenuItems_gpxMenuItem_Url( ((GXutil.strcmp("", A203Pant_NombreInterno)==0) ? "#" : GXutil.concat( "com.orions2.", GXutil.lower( A203Pant_NombreInterno), "")) );
         AV13Cargar = false ;
         /* Execute user subroutine: 'BUSCARPERMISOS' */
         S133 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
         if ( AV13Cargar )
         {
            AV9gpxMenuItem.getgxTv_SdtgpxMenuItems_gpxMenuItem_Subitems().add(AV10gpxMenuItemPantalla, 0);
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S133( )
   {
      /* 'BUSCARPERMISOS' Routine */
      /* Using cursor P001T4 */
      pr_default.execute(2, new Object[] {new Long(AV16Usua_Id)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A23Usua_Id = P001T4_A23Usua_Id[0] ;
         A21Rol_Id = P001T4_A21Rol_Id[0] ;
         AV14Rol_Id = A21Rol_Id ;
         /* Execute user subroutine: 'PERMISOPANTALLA' */
         S144 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S144( )
   {
      /* 'PERMISOPANTALLA' Routine */
      /* Using cursor P001T5 */
      pr_default.execute(3, new Object[] {new Long(AV14Rol_Id), new Integer(AV15Pant_Id)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A18Pant_Id = P001T5_A18Pant_Id[0] ;
         A21Rol_Id = P001T5_A21Rol_Id[0] ;
         AV13Cargar = true ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP1[0] = pcargarmenu.this.AV8gpxMenuItems;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8gpxMenuItems = new GXBaseCollection<com.orions2.SdtgpxMenuItems_gpxMenuItem>(com.orions2.SdtgpxMenuItems_gpxMenuItem.class, "gpxMenuItems.gpxMenuItem", "ACBSENA", remoteHandle);
      scmdbuf = "" ;
      P001T2_A16Modu_Id = new long[1] ;
      P001T2_A17Modu_Descripcion = new String[] {""} ;
      A17Modu_Descripcion = "" ;
      AV9gpxMenuItem = new com.orions2.SdtgpxMenuItems_gpxMenuItem(remoteHandle, context);
      AV11gpxMenuItemsPantalla = new GXBaseCollection<com.orions2.SdtgpxMenuItems_gpxMenuItem>(com.orions2.SdtgpxMenuItems_gpxMenuItem.class, "gpxMenuItems.gpxMenuItem", "ACBSENA", remoteHandle);
      P001T3_A16Modu_Id = new long[1] ;
      P001T3_A18Pant_Id = new int[1] ;
      P001T3_A19Pant_Descripcion = new String[] {""} ;
      P001T3_A203Pant_NombreInterno = new String[] {""} ;
      P001T3_A697Pant_Orden = new short[1] ;
      A19Pant_Descripcion = "" ;
      A203Pant_NombreInterno = "" ;
      AV10gpxMenuItemPantalla = new com.orions2.SdtgpxMenuItems_gpxMenuItem(remoteHandle, context);
      P001T4_A23Usua_Id = new long[1] ;
      P001T4_A21Rol_Id = new long[1] ;
      P001T5_A18Pant_Id = new int[1] ;
      P001T5_A21Rol_Id = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.pcargarmenu__default(),
         new Object[] {
             new Object[] {
            P001T2_A16Modu_Id, P001T2_A17Modu_Descripcion
            }
            , new Object[] {
            P001T3_A16Modu_Id, P001T3_A18Pant_Id, P001T3_A19Pant_Descripcion, P001T3_A203Pant_NombreInterno, P001T3_A697Pant_Orden
            }
            , new Object[] {
            P001T4_A23Usua_Id, P001T4_A21Rol_Id
            }
            , new Object[] {
            P001T5_A18Pant_Id, P001T5_A21Rol_Id
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A697Pant_Orden ;
   private short Gx_err ;
   private int A18Pant_Id ;
   private int AV15Pant_Id ;
   private long AV16Usua_Id ;
   private long A16Modu_Id ;
   private long AV12Modu_Id ;
   private long A23Usua_Id ;
   private long A21Rol_Id ;
   private long AV14Rol_Id ;
   private String scmdbuf ;
   private String A203Pant_NombreInterno ;
   private boolean returnInSub ;
   private boolean AV13Cargar ;
   private String A17Modu_Descripcion ;
   private String A19Pant_Descripcion ;
   private com.orions2.SdtgpxMenuItems_gpxMenuItem AV9gpxMenuItem ;
   private GXBaseCollection<com.orions2.SdtgpxMenuItems_gpxMenuItem>[] aP1 ;
   private IDataStoreProvider pr_default ;
   private long[] P001T2_A16Modu_Id ;
   private String[] P001T2_A17Modu_Descripcion ;
   private long[] P001T3_A16Modu_Id ;
   private int[] P001T3_A18Pant_Id ;
   private String[] P001T3_A19Pant_Descripcion ;
   private String[] P001T3_A203Pant_NombreInterno ;
   private short[] P001T3_A697Pant_Orden ;
   private long[] P001T4_A23Usua_Id ;
   private long[] P001T4_A21Rol_Id ;
   private int[] P001T5_A18Pant_Id ;
   private long[] P001T5_A21Rol_Id ;
   private GXBaseCollection<com.orions2.SdtgpxMenuItems_gpxMenuItem> AV8gpxMenuItems ;
   private GXBaseCollection<com.orions2.SdtgpxMenuItems_gpxMenuItem> AV11gpxMenuItemsPantalla ;
   private com.orions2.SdtgpxMenuItems_gpxMenuItem AV10gpxMenuItemPantalla ;
}

final  class pcargarmenu__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001T2", "SELECT Modu_Id, Modu_Descripcion FROM SEG_MODULO_MENU ORDER BY Modu_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001T3", "SELECT Modu_Id, Pant_Id, Pant_Descripcion, Pant_NombreInterno, Pant_Orden FROM SEG_PANTALLA WHERE Modu_Id = ? ORDER BY Pant_Orden ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001T4", "SELECT Usua_Id, Rol_Id FROM SEG_USUARIO_ROL WHERE Usua_Id = ? ORDER BY Usua_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001T5", "SELECT Pant_Id, Rol_Id FROM SEG_ROL_PANTALLA WHERE Rol_Id = ? and Pant_Id = ? ORDER BY Rol_Id, Pant_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getString(4, 50) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 2 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

