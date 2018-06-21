/*
               File: mas_cargue_salidas_bc
        Description: MAS_CARGUE_SALIDAS
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:25.61
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mas_cargue_salidas_bc extends GXWebPanel implements IGxSilentTrn
{
   public mas_cargue_salidas_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mas_cargue_salidas_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mas_cargue_salidas_bc.class ));
   }

   public mas_cargue_salidas_bc( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow1A47( ) ;
      standaloneNotModal( ) ;
      initializeNonKey1A47( ) ;
      standaloneModal( ) ;
      addRow1A47( ) ;
      Gx_mode = "INS" ;
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z78NUMTRN = A78NUMTRN ;
            Z79ID_SALIDA = A79ID_SALIDA ;
            SetMode( "UPD") ;
         }
      }
   }

   public String toString( )
   {
      return "" ;
   }

   public GXContentInfo getContentInfo( )
   {
      return (GXContentInfo)(null) ;
   }

   public boolean Reindex( )
   {
      return true ;
   }

   public void confirm_1A0( )
   {
      beforeValidate1A47( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls1A47( ) ;
         }
         else
         {
            checkExtendedTable1A47( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1A47( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void zm1A47( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z530PLACASENA = A530PLACASENA ;
         Z553CONSECUTIVO = A553CONSECUTIVO ;
         Z554CANTIDAD = A554CANTIDAD ;
         Z602OBSERVACIONES = A602OBSERVACIONES ;
      }
      if ( GX_JID == -8 )
      {
         Z78NUMTRN = A78NUMTRN ;
         Z79ID_SALIDA = A79ID_SALIDA ;
         Z530PLACASENA = A530PLACASENA ;
         Z553CONSECUTIVO = A553CONSECUTIVO ;
         Z554CANTIDAD = A554CANTIDAD ;
         Z602OBSERVACIONES = A602OBSERVACIONES ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load1A47( )
   {
      /* Using cursor BC001A4 */
      pr_default.execute(2, new Object[] {new Long(A78NUMTRN), new Short(A79ID_SALIDA)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound47 = (short)(1) ;
         A530PLACASENA = BC001A4_A530PLACASENA[0] ;
         n530PLACASENA = BC001A4_n530PLACASENA[0] ;
         A553CONSECUTIVO = BC001A4_A553CONSECUTIVO[0] ;
         n553CONSECUTIVO = BC001A4_n553CONSECUTIVO[0] ;
         A554CANTIDAD = BC001A4_A554CANTIDAD[0] ;
         n554CANTIDAD = BC001A4_n554CANTIDAD[0] ;
         A602OBSERVACIONES = BC001A4_A602OBSERVACIONES[0] ;
         n602OBSERVACIONES = BC001A4_n602OBSERVACIONES[0] ;
         zm1A47( -8) ;
      }
      pr_default.close(2);
      onLoadActions1A47( ) ;
   }

   public void onLoadActions1A47( )
   {
   }

   public void checkExtendedTable1A47( )
   {
      standaloneModal( ) ;
      if ( ! (GXutil.strcmp("", A530PLACASENA)==0) )
      {
         GXv_char1[0] = AV11Ind6 ;
         new com.orions2.validaplaca(remoteHandle, context).execute( GXutil.trim( A530PLACASENA), GXv_char1) ;
         mas_cargue_salidas_bc.this.AV11Ind6 = GXv_char1[0] ;
      }
      if ( GXutil.strcmp(AV11Ind6, "N") == 0 )
      {
         httpContext.GX_msglist.addItem("PLACASENA: No existe en el invetario", "c01", 1, "");
         AnyError = (short)(1) ;
      }
      if ( (GXutil.strcmp("", A530PLACASENA)==0) && (GXutil.strcmp("", A553CONSECUTIVO)==0) && (0==A554CANTIDAD) )
      {
         httpContext.GX_msglist.addItem("CONSECUTIVO: El dato no es válido o se encuentra vacio", "c01", 1, "");
         AnyError = (short)(1) ;
      }
      if ( (GXutil.strcmp("", A530PLACASENA)==0) && (0==A554CANTIDAD) )
      {
         httpContext.GX_msglist.addItem("CONSECUTIVO: El dato no es válido o se encuentra vacio", "c01", 1, "");
         AnyError = (short)(1) ;
      }
      if ( (GXutil.strcmp("", A530PLACASENA)==0) && (GXutil.strcmp("", A553CONSECUTIVO)==0) && (0==A554CANTIDAD) )
      {
         httpContext.GX_msglist.addItem("CANTIDAD: El dato no es válido o se encuentra vacio", "c02", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! (GXutil.strcmp("", A553CONSECUTIVO)==0) )
      {
         GXv_char1[0] = AV8Ind2 ;
         new com.orions2.validaelemento(remoteHandle, context).execute( GXutil.trim( A553CONSECUTIVO), GXv_char1) ;
         mas_cargue_salidas_bc.this.AV8Ind2 = GXv_char1[0] ;
      }
      if ( GXutil.strcmp(AV8Ind2, "N") == 0 )
      {
         httpContext.GX_msglist.addItem("ELEMENTO: No existe resgitro", "c01", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1A47( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1A47( )
   {
      /* Using cursor BC001A5 */
      pr_default.execute(3, new Object[] {new Long(A78NUMTRN), new Short(A79ID_SALIDA)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound47 = (short)(1) ;
      }
      else
      {
         RcdFound47 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC001A6 */
      pr_default.execute(4, new Object[] {new Long(A78NUMTRN), new Short(A79ID_SALIDA)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm1A47( 8) ;
         RcdFound47 = (short)(1) ;
         A78NUMTRN = BC001A6_A78NUMTRN[0] ;
         A79ID_SALIDA = BC001A6_A79ID_SALIDA[0] ;
         A530PLACASENA = BC001A6_A530PLACASENA[0] ;
         n530PLACASENA = BC001A6_n530PLACASENA[0] ;
         A553CONSECUTIVO = BC001A6_A553CONSECUTIVO[0] ;
         n553CONSECUTIVO = BC001A6_n553CONSECUTIVO[0] ;
         A554CANTIDAD = BC001A6_A554CANTIDAD[0] ;
         n554CANTIDAD = BC001A6_n554CANTIDAD[0] ;
         A602OBSERVACIONES = BC001A6_A602OBSERVACIONES[0] ;
         n602OBSERVACIONES = BC001A6_n602OBSERVACIONES[0] ;
         Z78NUMTRN = A78NUMTRN ;
         Z79ID_SALIDA = A79ID_SALIDA ;
         sMode47 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1A47( ) ;
         if ( AnyError == 1 )
         {
            RcdFound47 = (short)(0) ;
            initializeNonKey1A47( ) ;
         }
         Gx_mode = sMode47 ;
      }
      else
      {
         RcdFound47 = (short)(0) ;
         initializeNonKey1A47( ) ;
         sMode47 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode47 ;
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1A47( ) ;
      if ( RcdFound47 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
      }
      getByPrimaryKey( ) ;
   }

   public void insert_check( )
   {
      confirm_1A0( ) ;
      IsConfirmed = (short)(0) ;
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void checkOptimisticConcurrency1A47( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC001A7 */
         pr_default.execute(5, new Object[] {new Long(A78NUMTRN), new Short(A79ID_SALIDA)});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"MAS_CARGUE_SALIDAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(5) == 101) || ( GXutil.strcmp(Z530PLACASENA, BC001A7_A530PLACASENA[0]) != 0 ) || ( GXutil.strcmp(Z553CONSECUTIVO, BC001A7_A553CONSECUTIVO[0]) != 0 ) || ( Z554CANTIDAD != BC001A7_A554CANTIDAD[0] ) || ( GXutil.strcmp(Z602OBSERVACIONES, BC001A7_A602OBSERVACIONES[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"MAS_CARGUE_SALIDAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1A47( )
   {
      beforeValidate1A47( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1A47( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1A47( 0) ;
         checkOptimisticConcurrency1A47( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1A47( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1A47( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC001A8 */
                  pr_default.execute(6, new Object[] {new Long(A78NUMTRN), new Short(A79ID_SALIDA), new Boolean(n530PLACASENA), A530PLACASENA, new Boolean(n553CONSECUTIVO), A553CONSECUTIVO, new Boolean(n554CANTIDAD), new Short(A554CANTIDAD), new Boolean(n602OBSERVACIONES), A602OBSERVACIONES});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("MAS_CARGUE_SALIDAS") ;
                  if ( (pr_default.getStatus(6) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            load1A47( ) ;
         }
         endLevel1A47( ) ;
      }
      closeExtendedTableCursors1A47( ) ;
   }

   public void update1A47( )
   {
      beforeValidate1A47( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1A47( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1A47( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1A47( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1A47( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC001A9 */
                  pr_default.execute(7, new Object[] {new Boolean(n530PLACASENA), A530PLACASENA, new Boolean(n553CONSECUTIVO), A553CONSECUTIVO, new Boolean(n554CANTIDAD), new Short(A554CANTIDAD), new Boolean(n602OBSERVACIONES), A602OBSERVACIONES, new Long(A78NUMTRN), new Short(A79ID_SALIDA)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("MAS_CARGUE_SALIDAS") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"MAS_CARGUE_SALIDAS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1A47( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), "SuccessfullyUpdated", 0, "", true);
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel1A47( ) ;
      }
      closeExtendedTableCursors1A47( ) ;
   }

   public void deferredUpdate1A47( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1A47( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1A47( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1A47( ) ;
         afterConfirm1A47( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1A47( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC001A10 */
               pr_default.execute(8, new Object[] {new Long(A78NUMTRN), new Short(A79ID_SALIDA)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("MAS_CARGUE_SALIDAS") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucdeleted"), "SuccessfullyDeleted", 0, "", true);
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode47 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1A47( ) ;
      Gx_mode = sMode47 ;
   }

   public void onDeleteControls1A47( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1A47( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1A47( ) ;
      }
      if ( AnyError == 0 )
      {
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanKeyStart1A47( )
   {
      /* Using cursor BC001A11 */
      pr_default.execute(9, new Object[] {new Long(A78NUMTRN), new Short(A79ID_SALIDA)});
      RcdFound47 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound47 = (short)(1) ;
         A78NUMTRN = BC001A11_A78NUMTRN[0] ;
         A79ID_SALIDA = BC001A11_A79ID_SALIDA[0] ;
         A530PLACASENA = BC001A11_A530PLACASENA[0] ;
         n530PLACASENA = BC001A11_n530PLACASENA[0] ;
         A553CONSECUTIVO = BC001A11_A553CONSECUTIVO[0] ;
         n553CONSECUTIVO = BC001A11_n553CONSECUTIVO[0] ;
         A554CANTIDAD = BC001A11_A554CANTIDAD[0] ;
         n554CANTIDAD = BC001A11_n554CANTIDAD[0] ;
         A602OBSERVACIONES = BC001A11_A602OBSERVACIONES[0] ;
         n602OBSERVACIONES = BC001A11_n602OBSERVACIONES[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1A47( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound47 = (short)(0) ;
      scanKeyLoad1A47( ) ;
   }

   public void scanKeyLoad1A47( )
   {
      sMode47 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound47 = (short)(1) ;
         A78NUMTRN = BC001A11_A78NUMTRN[0] ;
         A79ID_SALIDA = BC001A11_A79ID_SALIDA[0] ;
         A530PLACASENA = BC001A11_A530PLACASENA[0] ;
         n530PLACASENA = BC001A11_n530PLACASENA[0] ;
         A553CONSECUTIVO = BC001A11_A553CONSECUTIVO[0] ;
         n553CONSECUTIVO = BC001A11_n553CONSECUTIVO[0] ;
         A554CANTIDAD = BC001A11_A554CANTIDAD[0] ;
         n554CANTIDAD = BC001A11_n554CANTIDAD[0] ;
         A602OBSERVACIONES = BC001A11_A602OBSERVACIONES[0] ;
         n602OBSERVACIONES = BC001A11_n602OBSERVACIONES[0] ;
      }
      Gx_mode = sMode47 ;
   }

   public void scanKeyEnd1A47( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1A47( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1A47( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1A47( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1A47( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1A47( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1A47( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1A47( )
   {
   }

   public void addRow1A47( )
   {
      VarsToRow47( bcMAS_CARGUE_SALIDAS) ;
   }

   public void readRow1A47( )
   {
      RowToVars47( bcMAS_CARGUE_SALIDAS, 1) ;
   }

   public void initializeNonKey1A47( )
   {
      AV11Ind6 = "" ;
      AV8Ind2 = "" ;
      A530PLACASENA = "" ;
      n530PLACASENA = false ;
      A553CONSECUTIVO = "" ;
      n553CONSECUTIVO = false ;
      A554CANTIDAD = (short)(0) ;
      n554CANTIDAD = false ;
      A602OBSERVACIONES = "" ;
      n602OBSERVACIONES = false ;
      Z530PLACASENA = "" ;
      Z553CONSECUTIVO = "" ;
      Z554CANTIDAD = (short)(0) ;
      Z602OBSERVACIONES = "" ;
   }

   public void initAll1A47( )
   {
      A78NUMTRN = 0 ;
      A79ID_SALIDA = (short)(0) ;
      initializeNonKey1A47( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow47( com.orions2.SdtMAS_CARGUE_SALIDAS obj47 )
   {
      obj47.setgxTv_SdtMAS_CARGUE_SALIDAS_Mode( Gx_mode );
      obj47.setgxTv_SdtMAS_CARGUE_SALIDAS_Placasena( A530PLACASENA );
      obj47.setgxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo( A553CONSECUTIVO );
      obj47.setgxTv_SdtMAS_CARGUE_SALIDAS_Cantidad( A554CANTIDAD );
      obj47.setgxTv_SdtMAS_CARGUE_SALIDAS_Observaciones( A602OBSERVACIONES );
      obj47.setgxTv_SdtMAS_CARGUE_SALIDAS_Numtrn( A78NUMTRN );
      obj47.setgxTv_SdtMAS_CARGUE_SALIDAS_Id_salida( A79ID_SALIDA );
      obj47.setgxTv_SdtMAS_CARGUE_SALIDAS_Numtrn_Z( Z78NUMTRN );
      obj47.setgxTv_SdtMAS_CARGUE_SALIDAS_Id_salida_Z( Z79ID_SALIDA );
      obj47.setgxTv_SdtMAS_CARGUE_SALIDAS_Placasena_Z( Z530PLACASENA );
      obj47.setgxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_Z( Z553CONSECUTIVO );
      obj47.setgxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_Z( Z554CANTIDAD );
      obj47.setgxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_Z( Z602OBSERVACIONES );
      obj47.setgxTv_SdtMAS_CARGUE_SALIDAS_Placasena_N( (byte)((byte)((n530PLACASENA)?1:0)) );
      obj47.setgxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_N( (byte)((byte)((n553CONSECUTIVO)?1:0)) );
      obj47.setgxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_N( (byte)((byte)((n554CANTIDAD)?1:0)) );
      obj47.setgxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_N( (byte)((byte)((n602OBSERVACIONES)?1:0)) );
      obj47.setgxTv_SdtMAS_CARGUE_SALIDAS_Mode( Gx_mode );
   }

   public void KeyVarsToRow47( com.orions2.SdtMAS_CARGUE_SALIDAS obj47 )
   {
      obj47.setgxTv_SdtMAS_CARGUE_SALIDAS_Numtrn( A78NUMTRN );
      obj47.setgxTv_SdtMAS_CARGUE_SALIDAS_Id_salida( A79ID_SALIDA );
   }

   public void RowToVars47( com.orions2.SdtMAS_CARGUE_SALIDAS obj47 ,
                            int forceLoad )
   {
      Gx_mode = obj47.getgxTv_SdtMAS_CARGUE_SALIDAS_Mode() ;
      A530PLACASENA = obj47.getgxTv_SdtMAS_CARGUE_SALIDAS_Placasena() ;
      n530PLACASENA = false ;
      A553CONSECUTIVO = obj47.getgxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo() ;
      n553CONSECUTIVO = false ;
      A554CANTIDAD = obj47.getgxTv_SdtMAS_CARGUE_SALIDAS_Cantidad() ;
      n554CANTIDAD = false ;
      A602OBSERVACIONES = obj47.getgxTv_SdtMAS_CARGUE_SALIDAS_Observaciones() ;
      n602OBSERVACIONES = false ;
      A78NUMTRN = obj47.getgxTv_SdtMAS_CARGUE_SALIDAS_Numtrn() ;
      A79ID_SALIDA = obj47.getgxTv_SdtMAS_CARGUE_SALIDAS_Id_salida() ;
      Z78NUMTRN = obj47.getgxTv_SdtMAS_CARGUE_SALIDAS_Numtrn_Z() ;
      Z79ID_SALIDA = obj47.getgxTv_SdtMAS_CARGUE_SALIDAS_Id_salida_Z() ;
      Z530PLACASENA = obj47.getgxTv_SdtMAS_CARGUE_SALIDAS_Placasena_Z() ;
      Z553CONSECUTIVO = obj47.getgxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_Z() ;
      Z554CANTIDAD = obj47.getgxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_Z() ;
      Z602OBSERVACIONES = obj47.getgxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_Z() ;
      n530PLACASENA = (boolean)((obj47.getgxTv_SdtMAS_CARGUE_SALIDAS_Placasena_N()==0)?false:true) ;
      n553CONSECUTIVO = (boolean)((obj47.getgxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_N()==0)?false:true) ;
      n554CANTIDAD = (boolean)((obj47.getgxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_N()==0)?false:true) ;
      n602OBSERVACIONES = (boolean)((obj47.getgxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_N()==0)?false:true) ;
      Gx_mode = obj47.getgxTv_SdtMAS_CARGUE_SALIDAS_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A78NUMTRN = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A79ID_SALIDA = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.SHORT)).shortValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1A47( ) ;
      scanKeyStart1A47( ) ;
      if ( RcdFound47 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z78NUMTRN = A78NUMTRN ;
         Z79ID_SALIDA = A79ID_SALIDA ;
      }
      zm1A47( -8) ;
      onLoadActions1A47( ) ;
      addRow1A47( ) ;
      scanKeyEnd1A47( ) ;
      if ( RcdFound47 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Load( )
   {
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      RowToVars47( bcMAS_CARGUE_SALIDAS, 0) ;
      scanKeyStart1A47( ) ;
      if ( RcdFound47 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z78NUMTRN = A78NUMTRN ;
         Z79ID_SALIDA = A79ID_SALIDA ;
      }
      zm1A47( -8) ;
      onLoadActions1A47( ) ;
      addRow1A47( ) ;
      scanKeyEnd1A47( ) ;
      if ( RcdFound47 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1A47( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert1A47( ) ;
      }
      else
      {
         if ( RcdFound47 == 1 )
         {
            if ( ( A78NUMTRN != Z78NUMTRN ) || ( A79ID_SALIDA != Z79ID_SALIDA ) )
            {
               A78NUMTRN = Z78NUMTRN ;
               A79ID_SALIDA = Z79ID_SALIDA ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
               AnyError = (short)(1) ;
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               /* Update record */
               update1A47( ) ;
            }
         }
         else
         {
            if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
               AnyError = (short)(1) ;
            }
            else
            {
               if ( ( A78NUMTRN != Z78NUMTRN ) || ( A79ID_SALIDA != Z79ID_SALIDA ) )
               {
                  if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  else
                  {
                     Gx_mode = "INS" ;
                     /* Insert record */
                     insert1A47( ) ;
                  }
               }
               else
               {
                  if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
                  else
                  {
                     Gx_mode = "INS" ;
                     /* Insert record */
                     insert1A47( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
   }

   public void Save( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars47( bcMAS_CARGUE_SALIDAS, 0) ;
      saveImpl( ) ;
      VarsToRow47( bcMAS_CARGUE_SALIDAS) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars47( bcMAS_CARGUE_SALIDAS, 0) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1A47( ) ;
      afterTrn( ) ;
      VarsToRow47( bcMAS_CARGUE_SALIDAS) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void updateImpl( )
   {
      if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
      {
         saveImpl( ) ;
      }
      else
      {
         com.orions2.SdtMAS_CARGUE_SALIDAS auxBC = new com.orions2.SdtMAS_CARGUE_SALIDAS( remoteHandle, context) ;
         auxBC.Load(A78NUMTRN, A79ID_SALIDA);
         auxBC.updateDirties(bcMAS_CARGUE_SALIDAS);
         auxBC.Save();
         IGxSilentTrn auxTrn = auxBC.getTransaction() ;
         LclMsgLst = auxTrn.GetMessages() ;
         AnyError = (short)(auxTrn.Errors()) ;
         Gx_mode = auxTrn.GetMode() ;
         httpContext.GX_msglist = LclMsgLst ;
         afterTrn( ) ;
      }
   }

   public boolean Update( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars47( bcMAS_CARGUE_SALIDAS, 0) ;
      updateImpl( ) ;
      VarsToRow47( bcMAS_CARGUE_SALIDAS) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public boolean InsertOrUpdate( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars47( bcMAS_CARGUE_SALIDAS, 0) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1A47( ) ;
      if ( AnyError == 1 )
      {
         AnyError = (short)(0) ;
         httpContext.GX_msglist.removeAllItems();
         updateImpl( ) ;
      }
      else
      {
         afterTrn( ) ;
      }
      VarsToRow47( bcMAS_CARGUE_SALIDAS) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars47( bcMAS_CARGUE_SALIDAS, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1A47( ) ;
      if ( RcdFound47 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A78NUMTRN != Z78NUMTRN ) || ( A79ID_SALIDA != Z79ID_SALIDA ) )
         {
            A78NUMTRN = Z78NUMTRN ;
            A79ID_SALIDA = Z79ID_SALIDA ;
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            delete_check( ) ;
         }
         else
         {
            Gx_mode = "UPD" ;
            update_check( ) ;
         }
      }
      else
      {
         if ( ( A78NUMTRN != Z78NUMTRN ) || ( A79ID_SALIDA != Z79ID_SALIDA ) )
         {
            Gx_mode = "INS" ;
            insert_check( ) ;
         }
         else
         {
            if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
               AnyError = (short)(1) ;
            }
            else
            {
               Gx_mode = "INS" ;
               insert_check( ) ;
            }
         }
      }
      Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "mas_cargue_salidas_bc");
      VarsToRow47( bcMAS_CARGUE_SALIDAS) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public int Errors( )
   {
      if ( AnyError == 0 )
      {
         return 0 ;
      }
      return 1 ;
   }

   public com.genexus.internet.MsgList GetMessages( )
   {
      return LclMsgLst ;
   }

   public String GetMode( )
   {
      Gx_mode = bcMAS_CARGUE_SALIDAS.getgxTv_SdtMAS_CARGUE_SALIDAS_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcMAS_CARGUE_SALIDAS.setgxTv_SdtMAS_CARGUE_SALIDAS_Mode( Gx_mode );
   }

   public void SetSDT( com.orions2.SdtMAS_CARGUE_SALIDAS sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcMAS_CARGUE_SALIDAS )
      {
         bcMAS_CARGUE_SALIDAS = sdt ;
         if ( GXutil.strcmp(bcMAS_CARGUE_SALIDAS.getgxTv_SdtMAS_CARGUE_SALIDAS_Mode(), "") == 0 )
         {
            bcMAS_CARGUE_SALIDAS.setgxTv_SdtMAS_CARGUE_SALIDAS_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow47( bcMAS_CARGUE_SALIDAS) ;
         }
         else
         {
            RowToVars47( bcMAS_CARGUE_SALIDAS, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcMAS_CARGUE_SALIDAS.getgxTv_SdtMAS_CARGUE_SALIDAS_Mode(), "") == 0 )
         {
            bcMAS_CARGUE_SALIDAS.setgxTv_SdtMAS_CARGUE_SALIDAS_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars47( bcMAS_CARGUE_SALIDAS, 1) ;
   }

   public SdtMAS_CARGUE_SALIDAS getMAS_CARGUE_SALIDAS_BC( )
   {
      return bcMAS_CARGUE_SALIDAS ;
   }


   public void webExecute( )
   {
   }

   protected void createObjects( )
   {
   }

   protected void Process( )
   {
   }

   protected void cleanup( )
   {
      super.cleanup();
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Gx_mode = "" ;
      Z530PLACASENA = "" ;
      A530PLACASENA = "" ;
      Z553CONSECUTIVO = "" ;
      A553CONSECUTIVO = "" ;
      Z602OBSERVACIONES = "" ;
      A602OBSERVACIONES = "" ;
      BC001A4_A78NUMTRN = new long[1] ;
      BC001A4_A79ID_SALIDA = new short[1] ;
      BC001A4_A530PLACASENA = new String[] {""} ;
      BC001A4_n530PLACASENA = new boolean[] {false} ;
      BC001A4_A553CONSECUTIVO = new String[] {""} ;
      BC001A4_n553CONSECUTIVO = new boolean[] {false} ;
      BC001A4_A554CANTIDAD = new short[1] ;
      BC001A4_n554CANTIDAD = new boolean[] {false} ;
      BC001A4_A602OBSERVACIONES = new String[] {""} ;
      BC001A4_n602OBSERVACIONES = new boolean[] {false} ;
      AV11Ind6 = "" ;
      AV8Ind2 = "" ;
      GXv_char1 = new String [1] ;
      BC001A5_A78NUMTRN = new long[1] ;
      BC001A5_A79ID_SALIDA = new short[1] ;
      BC001A6_A78NUMTRN = new long[1] ;
      BC001A6_A79ID_SALIDA = new short[1] ;
      BC001A6_A530PLACASENA = new String[] {""} ;
      BC001A6_n530PLACASENA = new boolean[] {false} ;
      BC001A6_A553CONSECUTIVO = new String[] {""} ;
      BC001A6_n553CONSECUTIVO = new boolean[] {false} ;
      BC001A6_A554CANTIDAD = new short[1] ;
      BC001A6_n554CANTIDAD = new boolean[] {false} ;
      BC001A6_A602OBSERVACIONES = new String[] {""} ;
      BC001A6_n602OBSERVACIONES = new boolean[] {false} ;
      sMode47 = "" ;
      BC001A7_A78NUMTRN = new long[1] ;
      BC001A7_A79ID_SALIDA = new short[1] ;
      BC001A7_A530PLACASENA = new String[] {""} ;
      BC001A7_n530PLACASENA = new boolean[] {false} ;
      BC001A7_A553CONSECUTIVO = new String[] {""} ;
      BC001A7_n553CONSECUTIVO = new boolean[] {false} ;
      BC001A7_A554CANTIDAD = new short[1] ;
      BC001A7_n554CANTIDAD = new boolean[] {false} ;
      BC001A7_A602OBSERVACIONES = new String[] {""} ;
      BC001A7_n602OBSERVACIONES = new boolean[] {false} ;
      BC001A11_A78NUMTRN = new long[1] ;
      BC001A11_A79ID_SALIDA = new short[1] ;
      BC001A11_A530PLACASENA = new String[] {""} ;
      BC001A11_n530PLACASENA = new boolean[] {false} ;
      BC001A11_A553CONSECUTIVO = new String[] {""} ;
      BC001A11_n553CONSECUTIVO = new boolean[] {false} ;
      BC001A11_A554CANTIDAD = new short[1] ;
      BC001A11_n554CANTIDAD = new boolean[] {false} ;
      BC001A11_A602OBSERVACIONES = new String[] {""} ;
      BC001A11_n602OBSERVACIONES = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.mas_cargue_salidas_bc__default(),
         new Object[] {
             new Object[] {
            BC001A2_A78NUMTRN, BC001A2_A79ID_SALIDA, BC001A2_A530PLACASENA, BC001A2_n530PLACASENA, BC001A2_A553CONSECUTIVO, BC001A2_n553CONSECUTIVO, BC001A2_A554CANTIDAD, BC001A2_n554CANTIDAD, BC001A2_A602OBSERVACIONES, BC001A2_n602OBSERVACIONES
            }
            , new Object[] {
            BC001A3_A78NUMTRN, BC001A3_A79ID_SALIDA, BC001A3_A530PLACASENA, BC001A3_n530PLACASENA, BC001A3_A553CONSECUTIVO, BC001A3_n553CONSECUTIVO, BC001A3_A554CANTIDAD, BC001A3_n554CANTIDAD, BC001A3_A602OBSERVACIONES, BC001A3_n602OBSERVACIONES
            }
            , new Object[] {
            BC001A4_A78NUMTRN, BC001A4_A79ID_SALIDA, BC001A4_A530PLACASENA, BC001A4_n530PLACASENA, BC001A4_A553CONSECUTIVO, BC001A4_n553CONSECUTIVO, BC001A4_A554CANTIDAD, BC001A4_n554CANTIDAD, BC001A4_A602OBSERVACIONES, BC001A4_n602OBSERVACIONES
            }
            , new Object[] {
            BC001A5_A78NUMTRN, BC001A5_A79ID_SALIDA
            }
            , new Object[] {
            BC001A6_A78NUMTRN, BC001A6_A79ID_SALIDA, BC001A6_A530PLACASENA, BC001A6_n530PLACASENA, BC001A6_A553CONSECUTIVO, BC001A6_n553CONSECUTIVO, BC001A6_A554CANTIDAD, BC001A6_n554CANTIDAD, BC001A6_A602OBSERVACIONES, BC001A6_n602OBSERVACIONES
            }
            , new Object[] {
            BC001A7_A78NUMTRN, BC001A7_A79ID_SALIDA, BC001A7_A530PLACASENA, BC001A7_n530PLACASENA, BC001A7_A553CONSECUTIVO, BC001A7_n553CONSECUTIVO, BC001A7_A554CANTIDAD, BC001A7_n554CANTIDAD, BC001A7_A602OBSERVACIONES, BC001A7_n602OBSERVACIONES
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC001A11_A78NUMTRN, BC001A11_A79ID_SALIDA, BC001A11_A530PLACASENA, BC001A11_n530PLACASENA, BC001A11_A553CONSECUTIVO, BC001A11_n553CONSECUTIVO, BC001A11_A554CANTIDAD, BC001A11_n554CANTIDAD, BC001A11_A602OBSERVACIONES, BC001A11_n602OBSERVACIONES
            }
         }
      );
      /* Execute Start event if defined. */
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z79ID_SALIDA ;
   private short A79ID_SALIDA ;
   private short Z554CANTIDAD ;
   private short A554CANTIDAD ;
   private short RcdFound47 ;
   private int trnEnded ;
   private int GX_JID ;
   private long Z78NUMTRN ;
   private long A78NUMTRN ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String GXv_char1[] ;
   private String sMode47 ;
   private boolean n530PLACASENA ;
   private boolean n553CONSECUTIVO ;
   private boolean n554CANTIDAD ;
   private boolean n602OBSERVACIONES ;
   private String Z530PLACASENA ;
   private String A530PLACASENA ;
   private String Z553CONSECUTIVO ;
   private String A553CONSECUTIVO ;
   private String Z602OBSERVACIONES ;
   private String A602OBSERVACIONES ;
   private String AV11Ind6 ;
   private String AV8Ind2 ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.orions2.SdtMAS_CARGUE_SALIDAS bcMAS_CARGUE_SALIDAS ;
   private IDataStoreProvider pr_default ;
   private long[] BC001A4_A78NUMTRN ;
   private short[] BC001A4_A79ID_SALIDA ;
   private String[] BC001A4_A530PLACASENA ;
   private boolean[] BC001A4_n530PLACASENA ;
   private String[] BC001A4_A553CONSECUTIVO ;
   private boolean[] BC001A4_n553CONSECUTIVO ;
   private short[] BC001A4_A554CANTIDAD ;
   private boolean[] BC001A4_n554CANTIDAD ;
   private String[] BC001A4_A602OBSERVACIONES ;
   private boolean[] BC001A4_n602OBSERVACIONES ;
   private long[] BC001A5_A78NUMTRN ;
   private short[] BC001A5_A79ID_SALIDA ;
   private long[] BC001A6_A78NUMTRN ;
   private short[] BC001A6_A79ID_SALIDA ;
   private String[] BC001A6_A530PLACASENA ;
   private boolean[] BC001A6_n530PLACASENA ;
   private String[] BC001A6_A553CONSECUTIVO ;
   private boolean[] BC001A6_n553CONSECUTIVO ;
   private short[] BC001A6_A554CANTIDAD ;
   private boolean[] BC001A6_n554CANTIDAD ;
   private String[] BC001A6_A602OBSERVACIONES ;
   private boolean[] BC001A6_n602OBSERVACIONES ;
   private long[] BC001A7_A78NUMTRN ;
   private short[] BC001A7_A79ID_SALIDA ;
   private String[] BC001A7_A530PLACASENA ;
   private boolean[] BC001A7_n530PLACASENA ;
   private String[] BC001A7_A553CONSECUTIVO ;
   private boolean[] BC001A7_n553CONSECUTIVO ;
   private short[] BC001A7_A554CANTIDAD ;
   private boolean[] BC001A7_n554CANTIDAD ;
   private String[] BC001A7_A602OBSERVACIONES ;
   private boolean[] BC001A7_n602OBSERVACIONES ;
   private long[] BC001A11_A78NUMTRN ;
   private short[] BC001A11_A79ID_SALIDA ;
   private String[] BC001A11_A530PLACASENA ;
   private boolean[] BC001A11_n530PLACASENA ;
   private String[] BC001A11_A553CONSECUTIVO ;
   private boolean[] BC001A11_n553CONSECUTIVO ;
   private short[] BC001A11_A554CANTIDAD ;
   private boolean[] BC001A11_n554CANTIDAD ;
   private String[] BC001A11_A602OBSERVACIONES ;
   private boolean[] BC001A11_n602OBSERVACIONES ;
   private long[] BC001A2_A78NUMTRN ;
   private short[] BC001A2_A79ID_SALIDA ;
   private String[] BC001A2_A530PLACASENA ;
   private String[] BC001A2_A553CONSECUTIVO ;
   private short[] BC001A2_A554CANTIDAD ;
   private String[] BC001A2_A602OBSERVACIONES ;
   private long[] BC001A3_A78NUMTRN ;
   private short[] BC001A3_A79ID_SALIDA ;
   private String[] BC001A3_A530PLACASENA ;
   private String[] BC001A3_A553CONSECUTIVO ;
   private short[] BC001A3_A554CANTIDAD ;
   private String[] BC001A3_A602OBSERVACIONES ;
   private boolean[] BC001A2_n530PLACASENA ;
   private boolean[] BC001A2_n553CONSECUTIVO ;
   private boolean[] BC001A2_n554CANTIDAD ;
   private boolean[] BC001A2_n602OBSERVACIONES ;
   private boolean[] BC001A3_n530PLACASENA ;
   private boolean[] BC001A3_n553CONSECUTIVO ;
   private boolean[] BC001A3_n554CANTIDAD ;
   private boolean[] BC001A3_n602OBSERVACIONES ;
}

final  class mas_cargue_salidas_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC001A2", "SELECT NUMTRN, ID_SALIDA, PLACASENA, CONSECUTIVO, CANTIDAD, OBSERVACIONES FROM MAS_CARGUE_SALIDAS WHERE NUMTRN = ? AND ID_SALIDA = ?  FOR UPDATE OF PLACASENA, CONSECUTIVO, CANTIDAD, OBSERVACIONES NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001A3", "SELECT NUMTRN, ID_SALIDA, PLACASENA, CONSECUTIVO, CANTIDAD, OBSERVACIONES FROM MAS_CARGUE_SALIDAS WHERE NUMTRN = ? AND ID_SALIDA = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001A4", "SELECT /*+ FIRST_ROWS(100) */ TM1.NUMTRN, TM1.ID_SALIDA, TM1.PLACASENA, TM1.CONSECUTIVO, TM1.CANTIDAD, TM1.OBSERVACIONES FROM MAS_CARGUE_SALIDAS TM1 WHERE TM1.NUMTRN = ? and TM1.ID_SALIDA = ? ORDER BY TM1.NUMTRN, TM1.ID_SALIDA ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC001A5", "SELECT /*+ FIRST_ROWS(1) */ NUMTRN, ID_SALIDA FROM MAS_CARGUE_SALIDAS WHERE NUMTRN = ? AND ID_SALIDA = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001A6", "SELECT NUMTRN, ID_SALIDA, PLACASENA, CONSECUTIVO, CANTIDAD, OBSERVACIONES FROM MAS_CARGUE_SALIDAS WHERE NUMTRN = ? AND ID_SALIDA = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001A7", "SELECT NUMTRN, ID_SALIDA, PLACASENA, CONSECUTIVO, CANTIDAD, OBSERVACIONES FROM MAS_CARGUE_SALIDAS WHERE NUMTRN = ? AND ID_SALIDA = ?  FOR UPDATE OF PLACASENA, CONSECUTIVO, CANTIDAD, OBSERVACIONES NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC001A8", "INSERT INTO MAS_CARGUE_SALIDAS(NUMTRN, ID_SALIDA, PLACASENA, CONSECUTIVO, CANTIDAD, OBSERVACIONES) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "MAS_CARGUE_SALIDAS")
         ,new UpdateCursor("BC001A9", "UPDATE MAS_CARGUE_SALIDAS SET PLACASENA=?, CONSECUTIVO=?, CANTIDAD=?, OBSERVACIONES=?  WHERE NUMTRN = ? AND ID_SALIDA = ?", GX_NOMASK, "MAS_CARGUE_SALIDAS")
         ,new UpdateCursor("BC001A10", "DELETE FROM MAS_CARGUE_SALIDAS  WHERE NUMTRN = ? AND ID_SALIDA = ?", GX_NOMASK, "MAS_CARGUE_SALIDAS")
         ,new ForEachCursor("BC001A11", "SELECT /*+ FIRST_ROWS(100) */ TM1.NUMTRN, TM1.ID_SALIDA, TM1.PLACASENA, TM1.CONSECUTIVO, TM1.CANTIDAD, TM1.OBSERVACIONES FROM MAS_CARGUE_SALIDAS TM1 WHERE TM1.NUMTRN = ? and TM1.ID_SALIDA = ? ORDER BY TM1.NUMTRN, TM1.ID_SALIDA ",true, GX_NOMASK, false, this,100,0,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[5], 9);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[9], 500);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 30);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 9);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 500);
               }
               stmt.setLong(5, ((Number) parms[8]).longValue());
               stmt.setShort(6, ((Number) parms[9]).shortValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

