/*
               File: mas_cargue_entrada_bc
        Description: MAS_CARGUE_ENTRADA
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:28.61
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

public final  class mas_cargue_entrada_bc extends GXWebPanel implements IGxSilentTrn
{
   public mas_cargue_entrada_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mas_cargue_entrada_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mas_cargue_entrada_bc.class ));
   }

   public mas_cargue_entrada_bc( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow1C49( ) ;
      standaloneNotModal( ) ;
      initializeNonKey1C49( ) ;
      standaloneModal( ) ;
      addRow1C49( ) ;
      Gx_mode = "INS" ;
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         /* Execute user event: After Trn */
         e111C2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z83NROTRANSACCION = A83NROTRANSACCION ;
            Z84IDCARMAS = A84IDCARMAS ;
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

   public void confirm_1C0( )
   {
      beforeValidate1C49( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls1C49( ) ;
         }
         else
         {
            checkExtendedTable1C49( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1C49( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e121C2( )
   {
      /* Start Routine */
   }

   public void e111C2( )
   {
      /* After Trn Routine */
   }

   public void zm1C49( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         Z537CONSECUTIVOENTRADA = A537CONSECUTIVOENTRADA ;
         Z538COSTOADQUISICION = A538COSTOADQUISICION ;
         Z540DESCRIPCIONENTRADA = A540DESCRIPCIONENTRADA ;
         Z601CANTIDADENTRADA = A601CANTIDADENTRADA ;
         Z686INDICADORPHI = A686INDICADORPHI ;
         Z645VALORFUTURO = A645VALORFUTURO ;
         Z647TIEMPO = A647TIEMPO ;
         Z646INTERES = A646INTERES ;
         Z648VIDAUTIL = A648VIDAUTIL ;
         Z644OTROSCOSTOS = A644OTROSCOSTOS ;
         Z605MARCA = A605MARCA ;
         Z607MODELO = A607MODELO ;
         Z606SERIAL = A606SERIAL ;
      }
      if ( GX_JID == -4 )
      {
         Z83NROTRANSACCION = A83NROTRANSACCION ;
         Z84IDCARMAS = A84IDCARMAS ;
         Z537CONSECUTIVOENTRADA = A537CONSECUTIVOENTRADA ;
         Z538COSTOADQUISICION = A538COSTOADQUISICION ;
         Z540DESCRIPCIONENTRADA = A540DESCRIPCIONENTRADA ;
         Z601CANTIDADENTRADA = A601CANTIDADENTRADA ;
         Z686INDICADORPHI = A686INDICADORPHI ;
         Z645VALORFUTURO = A645VALORFUTURO ;
         Z647TIEMPO = A647TIEMPO ;
         Z646INTERES = A646INTERES ;
         Z648VIDAUTIL = A648VIDAUTIL ;
         Z644OTROSCOSTOS = A644OTROSCOSTOS ;
         Z605MARCA = A605MARCA ;
         Z607MODELO = A607MODELO ;
         Z606SERIAL = A606SERIAL ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load1C49( )
   {
      /* Using cursor BC001C4 */
      pr_default.execute(2, new Object[] {new Long(A83NROTRANSACCION), new Short(A84IDCARMAS)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound49 = (short)(1) ;
         A537CONSECUTIVOENTRADA = BC001C4_A537CONSECUTIVOENTRADA[0] ;
         n537CONSECUTIVOENTRADA = BC001C4_n537CONSECUTIVOENTRADA[0] ;
         A538COSTOADQUISICION = BC001C4_A538COSTOADQUISICION[0] ;
         n538COSTOADQUISICION = BC001C4_n538COSTOADQUISICION[0] ;
         A540DESCRIPCIONENTRADA = BC001C4_A540DESCRIPCIONENTRADA[0] ;
         n540DESCRIPCIONENTRADA = BC001C4_n540DESCRIPCIONENTRADA[0] ;
         A601CANTIDADENTRADA = BC001C4_A601CANTIDADENTRADA[0] ;
         n601CANTIDADENTRADA = BC001C4_n601CANTIDADENTRADA[0] ;
         A686INDICADORPHI = BC001C4_A686INDICADORPHI[0] ;
         A645VALORFUTURO = BC001C4_A645VALORFUTURO[0] ;
         A647TIEMPO = BC001C4_A647TIEMPO[0] ;
         A646INTERES = BC001C4_A646INTERES[0] ;
         A648VIDAUTIL = BC001C4_A648VIDAUTIL[0] ;
         A644OTROSCOSTOS = BC001C4_A644OTROSCOSTOS[0] ;
         A605MARCA = BC001C4_A605MARCA[0] ;
         A607MODELO = BC001C4_A607MODELO[0] ;
         A606SERIAL = BC001C4_A606SERIAL[0] ;
         zm1C49( -4) ;
      }
      pr_default.close(2);
      onLoadActions1C49( ) ;
   }

   public void onLoadActions1C49( )
   {
   }

   public void checkExtendedTable1C49( )
   {
      standaloneModal( ) ;
      if ( (GXutil.strcmp("", A537CONSECUTIVOENTRADA)==0) )
      {
         httpContext.GX_msglist.addItem("CONSECUTIVO : El campo se encuentra vacio", "c01", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! (GXutil.strcmp("", A537CONSECUTIVOENTRADA)==0) )
      {
         GXv_char1[0] = AV8Ind2 ;
         new com.orions2.validaelemento(remoteHandle, context).execute( GXutil.trim( A537CONSECUTIVOENTRADA), GXv_char1) ;
         mas_cargue_entrada_bc.this.AV8Ind2 = GXv_char1[0] ;
      }
      if ( GXutil.strcmp(AV8Ind2, "N") == 0 )
      {
         httpContext.GX_msglist.addItem("CONSECUTIVO: No existe ", "c01", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1C49( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1C49( )
   {
      /* Using cursor BC001C5 */
      pr_default.execute(3, new Object[] {new Long(A83NROTRANSACCION), new Short(A84IDCARMAS)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound49 = (short)(1) ;
      }
      else
      {
         RcdFound49 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC001C6 */
      pr_default.execute(4, new Object[] {new Long(A83NROTRANSACCION), new Short(A84IDCARMAS)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm1C49( 4) ;
         RcdFound49 = (short)(1) ;
         A83NROTRANSACCION = BC001C6_A83NROTRANSACCION[0] ;
         A84IDCARMAS = BC001C6_A84IDCARMAS[0] ;
         A537CONSECUTIVOENTRADA = BC001C6_A537CONSECUTIVOENTRADA[0] ;
         n537CONSECUTIVOENTRADA = BC001C6_n537CONSECUTIVOENTRADA[0] ;
         A538COSTOADQUISICION = BC001C6_A538COSTOADQUISICION[0] ;
         n538COSTOADQUISICION = BC001C6_n538COSTOADQUISICION[0] ;
         A540DESCRIPCIONENTRADA = BC001C6_A540DESCRIPCIONENTRADA[0] ;
         n540DESCRIPCIONENTRADA = BC001C6_n540DESCRIPCIONENTRADA[0] ;
         A601CANTIDADENTRADA = BC001C6_A601CANTIDADENTRADA[0] ;
         n601CANTIDADENTRADA = BC001C6_n601CANTIDADENTRADA[0] ;
         A686INDICADORPHI = BC001C6_A686INDICADORPHI[0] ;
         A645VALORFUTURO = BC001C6_A645VALORFUTURO[0] ;
         A647TIEMPO = BC001C6_A647TIEMPO[0] ;
         A646INTERES = BC001C6_A646INTERES[0] ;
         A648VIDAUTIL = BC001C6_A648VIDAUTIL[0] ;
         A644OTROSCOSTOS = BC001C6_A644OTROSCOSTOS[0] ;
         A605MARCA = BC001C6_A605MARCA[0] ;
         A607MODELO = BC001C6_A607MODELO[0] ;
         A606SERIAL = BC001C6_A606SERIAL[0] ;
         Z83NROTRANSACCION = A83NROTRANSACCION ;
         Z84IDCARMAS = A84IDCARMAS ;
         sMode49 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1C49( ) ;
         if ( AnyError == 1 )
         {
            RcdFound49 = (short)(0) ;
            initializeNonKey1C49( ) ;
         }
         Gx_mode = sMode49 ;
      }
      else
      {
         RcdFound49 = (short)(0) ;
         initializeNonKey1C49( ) ;
         sMode49 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode49 ;
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1C49( ) ;
      if ( RcdFound49 == 0 )
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
      confirm_1C0( ) ;
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

   public void checkOptimisticConcurrency1C49( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC001C7 */
         pr_default.execute(5, new Object[] {new Long(A83NROTRANSACCION), new Short(A84IDCARMAS)});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"MAS_CARGUE_ENTRADA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(5) == 101) || ( GXutil.strcmp(Z537CONSECUTIVOENTRADA, BC001C7_A537CONSECUTIVOENTRADA[0]) != 0 ) || ( DecimalUtil.compareTo(Z538COSTOADQUISICION, BC001C7_A538COSTOADQUISICION[0]) != 0 ) || ( GXutil.strcmp(Z540DESCRIPCIONENTRADA, BC001C7_A540DESCRIPCIONENTRADA[0]) != 0 ) || ( Z601CANTIDADENTRADA != BC001C7_A601CANTIDADENTRADA[0] ) || ( Z686INDICADORPHI != BC001C7_A686INDICADORPHI[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z645VALORFUTURO, BC001C7_A645VALORFUTURO[0]) != 0 ) || ( Z647TIEMPO != BC001C7_A647TIEMPO[0] ) || ( DecimalUtil.compareTo(Z646INTERES, BC001C7_A646INTERES[0]) != 0 ) || ( Z648VIDAUTIL != BC001C7_A648VIDAUTIL[0] ) || ( DecimalUtil.compareTo(Z644OTROSCOSTOS, BC001C7_A644OTROSCOSTOS[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z605MARCA, BC001C7_A605MARCA[0]) != 0 ) || ( GXutil.strcmp(Z607MODELO, BC001C7_A607MODELO[0]) != 0 ) || ( GXutil.strcmp(Z606SERIAL, BC001C7_A606SERIAL[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"MAS_CARGUE_ENTRADA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1C49( )
   {
      beforeValidate1C49( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1C49( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1C49( 0) ;
         checkOptimisticConcurrency1C49( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1C49( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1C49( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC001C8 */
                  pr_default.execute(6, new Object[] {new Long(A83NROTRANSACCION), new Short(A84IDCARMAS), new Boolean(n537CONSECUTIVOENTRADA), A537CONSECUTIVOENTRADA, new Boolean(n538COSTOADQUISICION), A538COSTOADQUISICION, new Boolean(n540DESCRIPCIONENTRADA), A540DESCRIPCIONENTRADA, new Boolean(n601CANTIDADENTRADA), new Integer(A601CANTIDADENTRADA), new Short(A686INDICADORPHI), A645VALORFUTURO, new Short(A647TIEMPO), A646INTERES, new Short(A648VIDAUTIL), A644OTROSCOSTOS, A605MARCA, A607MODELO, A606SERIAL});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("MAS_CARGUE_ENTRADA") ;
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
            load1C49( ) ;
         }
         endLevel1C49( ) ;
      }
      closeExtendedTableCursors1C49( ) ;
   }

   public void update1C49( )
   {
      beforeValidate1C49( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1C49( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1C49( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1C49( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1C49( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC001C9 */
                  pr_default.execute(7, new Object[] {new Boolean(n537CONSECUTIVOENTRADA), A537CONSECUTIVOENTRADA, new Boolean(n538COSTOADQUISICION), A538COSTOADQUISICION, new Boolean(n540DESCRIPCIONENTRADA), A540DESCRIPCIONENTRADA, new Boolean(n601CANTIDADENTRADA), new Integer(A601CANTIDADENTRADA), new Short(A686INDICADORPHI), A645VALORFUTURO, new Short(A647TIEMPO), A646INTERES, new Short(A648VIDAUTIL), A644OTROSCOSTOS, A605MARCA, A607MODELO, A606SERIAL, new Long(A83NROTRANSACCION), new Short(A84IDCARMAS)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("MAS_CARGUE_ENTRADA") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"MAS_CARGUE_ENTRADA"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1C49( ) ;
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
         endLevel1C49( ) ;
      }
      closeExtendedTableCursors1C49( ) ;
   }

   public void deferredUpdate1C49( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1C49( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1C49( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1C49( ) ;
         afterConfirm1C49( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1C49( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC001C10 */
               pr_default.execute(8, new Object[] {new Long(A83NROTRANSACCION), new Short(A84IDCARMAS)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("MAS_CARGUE_ENTRADA") ;
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
      sMode49 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1C49( ) ;
      Gx_mode = sMode49 ;
   }

   public void onDeleteControls1C49( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1C49( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1C49( ) ;
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

   public void scanKeyStart1C49( )
   {
      /* Scan By routine */
      /* Using cursor BC001C11 */
      pr_default.execute(9, new Object[] {new Long(A83NROTRANSACCION), new Short(A84IDCARMAS)});
      RcdFound49 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound49 = (short)(1) ;
         A83NROTRANSACCION = BC001C11_A83NROTRANSACCION[0] ;
         A84IDCARMAS = BC001C11_A84IDCARMAS[0] ;
         A537CONSECUTIVOENTRADA = BC001C11_A537CONSECUTIVOENTRADA[0] ;
         n537CONSECUTIVOENTRADA = BC001C11_n537CONSECUTIVOENTRADA[0] ;
         A538COSTOADQUISICION = BC001C11_A538COSTOADQUISICION[0] ;
         n538COSTOADQUISICION = BC001C11_n538COSTOADQUISICION[0] ;
         A540DESCRIPCIONENTRADA = BC001C11_A540DESCRIPCIONENTRADA[0] ;
         n540DESCRIPCIONENTRADA = BC001C11_n540DESCRIPCIONENTRADA[0] ;
         A601CANTIDADENTRADA = BC001C11_A601CANTIDADENTRADA[0] ;
         n601CANTIDADENTRADA = BC001C11_n601CANTIDADENTRADA[0] ;
         A686INDICADORPHI = BC001C11_A686INDICADORPHI[0] ;
         A645VALORFUTURO = BC001C11_A645VALORFUTURO[0] ;
         A647TIEMPO = BC001C11_A647TIEMPO[0] ;
         A646INTERES = BC001C11_A646INTERES[0] ;
         A648VIDAUTIL = BC001C11_A648VIDAUTIL[0] ;
         A644OTROSCOSTOS = BC001C11_A644OTROSCOSTOS[0] ;
         A605MARCA = BC001C11_A605MARCA[0] ;
         A607MODELO = BC001C11_A607MODELO[0] ;
         A606SERIAL = BC001C11_A606SERIAL[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1C49( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound49 = (short)(0) ;
      scanKeyLoad1C49( ) ;
   }

   public void scanKeyLoad1C49( )
   {
      sMode49 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound49 = (short)(1) ;
         A83NROTRANSACCION = BC001C11_A83NROTRANSACCION[0] ;
         A84IDCARMAS = BC001C11_A84IDCARMAS[0] ;
         A537CONSECUTIVOENTRADA = BC001C11_A537CONSECUTIVOENTRADA[0] ;
         n537CONSECUTIVOENTRADA = BC001C11_n537CONSECUTIVOENTRADA[0] ;
         A538COSTOADQUISICION = BC001C11_A538COSTOADQUISICION[0] ;
         n538COSTOADQUISICION = BC001C11_n538COSTOADQUISICION[0] ;
         A540DESCRIPCIONENTRADA = BC001C11_A540DESCRIPCIONENTRADA[0] ;
         n540DESCRIPCIONENTRADA = BC001C11_n540DESCRIPCIONENTRADA[0] ;
         A601CANTIDADENTRADA = BC001C11_A601CANTIDADENTRADA[0] ;
         n601CANTIDADENTRADA = BC001C11_n601CANTIDADENTRADA[0] ;
         A686INDICADORPHI = BC001C11_A686INDICADORPHI[0] ;
         A645VALORFUTURO = BC001C11_A645VALORFUTURO[0] ;
         A647TIEMPO = BC001C11_A647TIEMPO[0] ;
         A646INTERES = BC001C11_A646INTERES[0] ;
         A648VIDAUTIL = BC001C11_A648VIDAUTIL[0] ;
         A644OTROSCOSTOS = BC001C11_A644OTROSCOSTOS[0] ;
         A605MARCA = BC001C11_A605MARCA[0] ;
         A607MODELO = BC001C11_A607MODELO[0] ;
         A606SERIAL = BC001C11_A606SERIAL[0] ;
      }
      Gx_mode = sMode49 ;
   }

   public void scanKeyEnd1C49( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1C49( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1C49( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1C49( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1C49( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1C49( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1C49( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1C49( )
   {
   }

   public void addRow1C49( )
   {
      VarsToRow49( bcMAS_CARGUE_ENTRADA) ;
   }

   public void readRow1C49( )
   {
      RowToVars49( bcMAS_CARGUE_ENTRADA, 1) ;
   }

   public void initializeNonKey1C49( )
   {
      AV8Ind2 = "" ;
      A537CONSECUTIVOENTRADA = "" ;
      n537CONSECUTIVOENTRADA = false ;
      A538COSTOADQUISICION = DecimalUtil.ZERO ;
      n538COSTOADQUISICION = false ;
      A540DESCRIPCIONENTRADA = "" ;
      n540DESCRIPCIONENTRADA = false ;
      A601CANTIDADENTRADA = 0 ;
      n601CANTIDADENTRADA = false ;
      A686INDICADORPHI = (short)(0) ;
      A645VALORFUTURO = DecimalUtil.ZERO ;
      A647TIEMPO = (short)(0) ;
      A646INTERES = DecimalUtil.ZERO ;
      A648VIDAUTIL = (short)(0) ;
      A644OTROSCOSTOS = DecimalUtil.ZERO ;
      A605MARCA = "" ;
      A607MODELO = "" ;
      A606SERIAL = "" ;
      Z537CONSECUTIVOENTRADA = "" ;
      Z538COSTOADQUISICION = DecimalUtil.ZERO ;
      Z540DESCRIPCIONENTRADA = "" ;
      Z601CANTIDADENTRADA = 0 ;
      Z686INDICADORPHI = (short)(0) ;
      Z645VALORFUTURO = DecimalUtil.ZERO ;
      Z647TIEMPO = (short)(0) ;
      Z646INTERES = DecimalUtil.ZERO ;
      Z648VIDAUTIL = (short)(0) ;
      Z644OTROSCOSTOS = DecimalUtil.ZERO ;
      Z605MARCA = "" ;
      Z607MODELO = "" ;
      Z606SERIAL = "" ;
   }

   public void initAll1C49( )
   {
      A83NROTRANSACCION = 0 ;
      A84IDCARMAS = (short)(0) ;
      initializeNonKey1C49( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow49( com.orions2.SdtMAS_CARGUE_ENTRADA obj49 )
   {
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Mode( Gx_mode );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada( A537CONSECUTIVOENTRADA );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion( A538COSTOADQUISICION );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada( A540DESCRIPCIONENTRADA );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada( A601CANTIDADENTRADA );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi( A686INDICADORPHI );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo( A645VALORFUTURO );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Tiempo( A647TIEMPO );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Interes( A646INTERES );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Vidautil( A648VIDAUTIL );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos( A644OTROSCOSTOS );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Marca( A605MARCA );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Modelo( A607MODELO );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Serial( A606SERIAL );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion( A83NROTRANSACCION );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas( A84IDCARMAS );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion_Z( Z83NROTRANSACCION );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas_Z( Z84IDCARMAS );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_Z( Z537CONSECUTIVOENTRADA );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_Z( Z538COSTOADQUISICION );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_Z( Z540DESCRIPCIONENTRADA );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_Z( Z601CANTIDADENTRADA );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi_Z( Z686INDICADORPHI );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo_Z( Z645VALORFUTURO );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Tiempo_Z( Z647TIEMPO );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Interes_Z( Z646INTERES );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Vidautil_Z( Z648VIDAUTIL );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos_Z( Z644OTROSCOSTOS );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Marca_Z( Z605MARCA );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Modelo_Z( Z607MODELO );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Serial_Z( Z606SERIAL );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_N( (byte)((byte)((n537CONSECUTIVOENTRADA)?1:0)) );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_N( (byte)((byte)((n538COSTOADQUISICION)?1:0)) );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_N( (byte)((byte)((n540DESCRIPCIONENTRADA)?1:0)) );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_N( (byte)((byte)((n601CANTIDADENTRADA)?1:0)) );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Mode( Gx_mode );
   }

   public void KeyVarsToRow49( com.orions2.SdtMAS_CARGUE_ENTRADA obj49 )
   {
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion( A83NROTRANSACCION );
      obj49.setgxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas( A84IDCARMAS );
   }

   public void RowToVars49( com.orions2.SdtMAS_CARGUE_ENTRADA obj49 ,
                            int forceLoad )
   {
      Gx_mode = obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Mode() ;
      A537CONSECUTIVOENTRADA = obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada() ;
      n537CONSECUTIVOENTRADA = false ;
      A538COSTOADQUISICION = obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion() ;
      n538COSTOADQUISICION = false ;
      A540DESCRIPCIONENTRADA = obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada() ;
      n540DESCRIPCIONENTRADA = false ;
      A601CANTIDADENTRADA = obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada() ;
      n601CANTIDADENTRADA = false ;
      A686INDICADORPHI = obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi() ;
      A645VALORFUTURO = obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo() ;
      A647TIEMPO = obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Tiempo() ;
      A646INTERES = obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Interes() ;
      A648VIDAUTIL = obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Vidautil() ;
      A644OTROSCOSTOS = obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos() ;
      A605MARCA = obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Marca() ;
      A607MODELO = obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Modelo() ;
      A606SERIAL = obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Serial() ;
      A83NROTRANSACCION = obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion() ;
      A84IDCARMAS = obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas() ;
      Z83NROTRANSACCION = obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion_Z() ;
      Z84IDCARMAS = obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas_Z() ;
      Z537CONSECUTIVOENTRADA = obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_Z() ;
      Z538COSTOADQUISICION = obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_Z() ;
      Z540DESCRIPCIONENTRADA = obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_Z() ;
      Z601CANTIDADENTRADA = obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_Z() ;
      Z686INDICADORPHI = obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi_Z() ;
      Z645VALORFUTURO = obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo_Z() ;
      Z647TIEMPO = obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Tiempo_Z() ;
      Z646INTERES = obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Interes_Z() ;
      Z648VIDAUTIL = obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Vidautil_Z() ;
      Z644OTROSCOSTOS = obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos_Z() ;
      Z605MARCA = obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Marca_Z() ;
      Z607MODELO = obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Modelo_Z() ;
      Z606SERIAL = obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Serial_Z() ;
      n537CONSECUTIVOENTRADA = (boolean)((obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_N()==0)?false:true) ;
      n538COSTOADQUISICION = (boolean)((obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_N()==0)?false:true) ;
      n540DESCRIPCIONENTRADA = (boolean)((obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_N()==0)?false:true) ;
      n601CANTIDADENTRADA = (boolean)((obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_N()==0)?false:true) ;
      Gx_mode = obj49.getgxTv_SdtMAS_CARGUE_ENTRADA_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A83NROTRANSACCION = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A84IDCARMAS = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.SHORT)).shortValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1C49( ) ;
      scanKeyStart1C49( ) ;
      if ( RcdFound49 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z83NROTRANSACCION = A83NROTRANSACCION ;
         Z84IDCARMAS = A84IDCARMAS ;
      }
      zm1C49( -4) ;
      onLoadActions1C49( ) ;
      addRow1C49( ) ;
      scanKeyEnd1C49( ) ;
      if ( RcdFound49 == 0 )
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
      RowToVars49( bcMAS_CARGUE_ENTRADA, 0) ;
      scanKeyStart1C49( ) ;
      if ( RcdFound49 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z83NROTRANSACCION = A83NROTRANSACCION ;
         Z84IDCARMAS = A84IDCARMAS ;
      }
      zm1C49( -4) ;
      onLoadActions1C49( ) ;
      addRow1C49( ) ;
      scanKeyEnd1C49( ) ;
      if ( RcdFound49 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1C49( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert1C49( ) ;
      }
      else
      {
         if ( RcdFound49 == 1 )
         {
            if ( ( A83NROTRANSACCION != Z83NROTRANSACCION ) || ( A84IDCARMAS != Z84IDCARMAS ) )
            {
               A83NROTRANSACCION = Z83NROTRANSACCION ;
               A84IDCARMAS = Z84IDCARMAS ;
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
               update1C49( ) ;
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
               if ( ( A83NROTRANSACCION != Z83NROTRANSACCION ) || ( A84IDCARMAS != Z84IDCARMAS ) )
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
                     insert1C49( ) ;
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
                     insert1C49( ) ;
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
      RowToVars49( bcMAS_CARGUE_ENTRADA, 0) ;
      saveImpl( ) ;
      VarsToRow49( bcMAS_CARGUE_ENTRADA) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars49( bcMAS_CARGUE_ENTRADA, 0) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1C49( ) ;
      afterTrn( ) ;
      VarsToRow49( bcMAS_CARGUE_ENTRADA) ;
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
         com.orions2.SdtMAS_CARGUE_ENTRADA auxBC = new com.orions2.SdtMAS_CARGUE_ENTRADA( remoteHandle, context) ;
         auxBC.Load(A83NROTRANSACCION, A84IDCARMAS);
         auxBC.updateDirties(bcMAS_CARGUE_ENTRADA);
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
      RowToVars49( bcMAS_CARGUE_ENTRADA, 0) ;
      updateImpl( ) ;
      VarsToRow49( bcMAS_CARGUE_ENTRADA) ;
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
      RowToVars49( bcMAS_CARGUE_ENTRADA, 0) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1C49( ) ;
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
      VarsToRow49( bcMAS_CARGUE_ENTRADA) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars49( bcMAS_CARGUE_ENTRADA, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1C49( ) ;
      if ( RcdFound49 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A83NROTRANSACCION != Z83NROTRANSACCION ) || ( A84IDCARMAS != Z84IDCARMAS ) )
         {
            A83NROTRANSACCION = Z83NROTRANSACCION ;
            A84IDCARMAS = Z84IDCARMAS ;
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
         if ( ( A83NROTRANSACCION != Z83NROTRANSACCION ) || ( A84IDCARMAS != Z84IDCARMAS ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "mas_cargue_entrada_bc");
      VarsToRow49( bcMAS_CARGUE_ENTRADA) ;
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
      Gx_mode = bcMAS_CARGUE_ENTRADA.getgxTv_SdtMAS_CARGUE_ENTRADA_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcMAS_CARGUE_ENTRADA.setgxTv_SdtMAS_CARGUE_ENTRADA_Mode( Gx_mode );
   }

   public void SetSDT( com.orions2.SdtMAS_CARGUE_ENTRADA sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcMAS_CARGUE_ENTRADA )
      {
         bcMAS_CARGUE_ENTRADA = sdt ;
         if ( GXutil.strcmp(bcMAS_CARGUE_ENTRADA.getgxTv_SdtMAS_CARGUE_ENTRADA_Mode(), "") == 0 )
         {
            bcMAS_CARGUE_ENTRADA.setgxTv_SdtMAS_CARGUE_ENTRADA_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow49( bcMAS_CARGUE_ENTRADA) ;
         }
         else
         {
            RowToVars49( bcMAS_CARGUE_ENTRADA, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcMAS_CARGUE_ENTRADA.getgxTv_SdtMAS_CARGUE_ENTRADA_Mode(), "") == 0 )
         {
            bcMAS_CARGUE_ENTRADA.setgxTv_SdtMAS_CARGUE_ENTRADA_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars49( bcMAS_CARGUE_ENTRADA, 1) ;
   }

   public SdtMAS_CARGUE_ENTRADA getMAS_CARGUE_ENTRADA_BC( )
   {
      return bcMAS_CARGUE_ENTRADA ;
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
      Z537CONSECUTIVOENTRADA = "" ;
      A537CONSECUTIVOENTRADA = "" ;
      Z538COSTOADQUISICION = DecimalUtil.ZERO ;
      A538COSTOADQUISICION = DecimalUtil.ZERO ;
      Z540DESCRIPCIONENTRADA = "" ;
      A540DESCRIPCIONENTRADA = "" ;
      Z645VALORFUTURO = DecimalUtil.ZERO ;
      A645VALORFUTURO = DecimalUtil.ZERO ;
      Z646INTERES = DecimalUtil.ZERO ;
      A646INTERES = DecimalUtil.ZERO ;
      Z644OTROSCOSTOS = DecimalUtil.ZERO ;
      A644OTROSCOSTOS = DecimalUtil.ZERO ;
      Z605MARCA = "" ;
      A605MARCA = "" ;
      Z607MODELO = "" ;
      A607MODELO = "" ;
      Z606SERIAL = "" ;
      A606SERIAL = "" ;
      BC001C4_A83NROTRANSACCION = new long[1] ;
      BC001C4_A84IDCARMAS = new short[1] ;
      BC001C4_A537CONSECUTIVOENTRADA = new String[] {""} ;
      BC001C4_n537CONSECUTIVOENTRADA = new boolean[] {false} ;
      BC001C4_A538COSTOADQUISICION = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC001C4_n538COSTOADQUISICION = new boolean[] {false} ;
      BC001C4_A540DESCRIPCIONENTRADA = new String[] {""} ;
      BC001C4_n540DESCRIPCIONENTRADA = new boolean[] {false} ;
      BC001C4_A601CANTIDADENTRADA = new int[1] ;
      BC001C4_n601CANTIDADENTRADA = new boolean[] {false} ;
      BC001C4_A686INDICADORPHI = new short[1] ;
      BC001C4_A645VALORFUTURO = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC001C4_A647TIEMPO = new short[1] ;
      BC001C4_A646INTERES = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC001C4_A648VIDAUTIL = new short[1] ;
      BC001C4_A644OTROSCOSTOS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC001C4_A605MARCA = new String[] {""} ;
      BC001C4_A607MODELO = new String[] {""} ;
      BC001C4_A606SERIAL = new String[] {""} ;
      AV8Ind2 = "" ;
      GXv_char1 = new String [1] ;
      BC001C5_A83NROTRANSACCION = new long[1] ;
      BC001C5_A84IDCARMAS = new short[1] ;
      BC001C6_A83NROTRANSACCION = new long[1] ;
      BC001C6_A84IDCARMAS = new short[1] ;
      BC001C6_A537CONSECUTIVOENTRADA = new String[] {""} ;
      BC001C6_n537CONSECUTIVOENTRADA = new boolean[] {false} ;
      BC001C6_A538COSTOADQUISICION = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC001C6_n538COSTOADQUISICION = new boolean[] {false} ;
      BC001C6_A540DESCRIPCIONENTRADA = new String[] {""} ;
      BC001C6_n540DESCRIPCIONENTRADA = new boolean[] {false} ;
      BC001C6_A601CANTIDADENTRADA = new int[1] ;
      BC001C6_n601CANTIDADENTRADA = new boolean[] {false} ;
      BC001C6_A686INDICADORPHI = new short[1] ;
      BC001C6_A645VALORFUTURO = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC001C6_A647TIEMPO = new short[1] ;
      BC001C6_A646INTERES = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC001C6_A648VIDAUTIL = new short[1] ;
      BC001C6_A644OTROSCOSTOS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC001C6_A605MARCA = new String[] {""} ;
      BC001C6_A607MODELO = new String[] {""} ;
      BC001C6_A606SERIAL = new String[] {""} ;
      sMode49 = "" ;
      BC001C7_A83NROTRANSACCION = new long[1] ;
      BC001C7_A84IDCARMAS = new short[1] ;
      BC001C7_A537CONSECUTIVOENTRADA = new String[] {""} ;
      BC001C7_n537CONSECUTIVOENTRADA = new boolean[] {false} ;
      BC001C7_A538COSTOADQUISICION = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC001C7_n538COSTOADQUISICION = new boolean[] {false} ;
      BC001C7_A540DESCRIPCIONENTRADA = new String[] {""} ;
      BC001C7_n540DESCRIPCIONENTRADA = new boolean[] {false} ;
      BC001C7_A601CANTIDADENTRADA = new int[1] ;
      BC001C7_n601CANTIDADENTRADA = new boolean[] {false} ;
      BC001C7_A686INDICADORPHI = new short[1] ;
      BC001C7_A645VALORFUTURO = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC001C7_A647TIEMPO = new short[1] ;
      BC001C7_A646INTERES = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC001C7_A648VIDAUTIL = new short[1] ;
      BC001C7_A644OTROSCOSTOS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC001C7_A605MARCA = new String[] {""} ;
      BC001C7_A607MODELO = new String[] {""} ;
      BC001C7_A606SERIAL = new String[] {""} ;
      BC001C11_A83NROTRANSACCION = new long[1] ;
      BC001C11_A84IDCARMAS = new short[1] ;
      BC001C11_A537CONSECUTIVOENTRADA = new String[] {""} ;
      BC001C11_n537CONSECUTIVOENTRADA = new boolean[] {false} ;
      BC001C11_A538COSTOADQUISICION = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC001C11_n538COSTOADQUISICION = new boolean[] {false} ;
      BC001C11_A540DESCRIPCIONENTRADA = new String[] {""} ;
      BC001C11_n540DESCRIPCIONENTRADA = new boolean[] {false} ;
      BC001C11_A601CANTIDADENTRADA = new int[1] ;
      BC001C11_n601CANTIDADENTRADA = new boolean[] {false} ;
      BC001C11_A686INDICADORPHI = new short[1] ;
      BC001C11_A645VALORFUTURO = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC001C11_A647TIEMPO = new short[1] ;
      BC001C11_A646INTERES = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC001C11_A648VIDAUTIL = new short[1] ;
      BC001C11_A644OTROSCOSTOS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC001C11_A605MARCA = new String[] {""} ;
      BC001C11_A607MODELO = new String[] {""} ;
      BC001C11_A606SERIAL = new String[] {""} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.mas_cargue_entrada_bc__default(),
         new Object[] {
             new Object[] {
            BC001C2_A83NROTRANSACCION, BC001C2_A84IDCARMAS, BC001C2_A537CONSECUTIVOENTRADA, BC001C2_n537CONSECUTIVOENTRADA, BC001C2_A538COSTOADQUISICION, BC001C2_n538COSTOADQUISICION, BC001C2_A540DESCRIPCIONENTRADA, BC001C2_n540DESCRIPCIONENTRADA, BC001C2_A601CANTIDADENTRADA, BC001C2_n601CANTIDADENTRADA,
            BC001C2_A686INDICADORPHI, BC001C2_A645VALORFUTURO, BC001C2_A647TIEMPO, BC001C2_A646INTERES, BC001C2_A648VIDAUTIL, BC001C2_A644OTROSCOSTOS, BC001C2_A605MARCA, BC001C2_A607MODELO, BC001C2_A606SERIAL
            }
            , new Object[] {
            BC001C3_A83NROTRANSACCION, BC001C3_A84IDCARMAS, BC001C3_A537CONSECUTIVOENTRADA, BC001C3_n537CONSECUTIVOENTRADA, BC001C3_A538COSTOADQUISICION, BC001C3_n538COSTOADQUISICION, BC001C3_A540DESCRIPCIONENTRADA, BC001C3_n540DESCRIPCIONENTRADA, BC001C3_A601CANTIDADENTRADA, BC001C3_n601CANTIDADENTRADA,
            BC001C3_A686INDICADORPHI, BC001C3_A645VALORFUTURO, BC001C3_A647TIEMPO, BC001C3_A646INTERES, BC001C3_A648VIDAUTIL, BC001C3_A644OTROSCOSTOS, BC001C3_A605MARCA, BC001C3_A607MODELO, BC001C3_A606SERIAL
            }
            , new Object[] {
            BC001C4_A83NROTRANSACCION, BC001C4_A84IDCARMAS, BC001C4_A537CONSECUTIVOENTRADA, BC001C4_n537CONSECUTIVOENTRADA, BC001C4_A538COSTOADQUISICION, BC001C4_n538COSTOADQUISICION, BC001C4_A540DESCRIPCIONENTRADA, BC001C4_n540DESCRIPCIONENTRADA, BC001C4_A601CANTIDADENTRADA, BC001C4_n601CANTIDADENTRADA,
            BC001C4_A686INDICADORPHI, BC001C4_A645VALORFUTURO, BC001C4_A647TIEMPO, BC001C4_A646INTERES, BC001C4_A648VIDAUTIL, BC001C4_A644OTROSCOSTOS, BC001C4_A605MARCA, BC001C4_A607MODELO, BC001C4_A606SERIAL
            }
            , new Object[] {
            BC001C5_A83NROTRANSACCION, BC001C5_A84IDCARMAS
            }
            , new Object[] {
            BC001C6_A83NROTRANSACCION, BC001C6_A84IDCARMAS, BC001C6_A537CONSECUTIVOENTRADA, BC001C6_n537CONSECUTIVOENTRADA, BC001C6_A538COSTOADQUISICION, BC001C6_n538COSTOADQUISICION, BC001C6_A540DESCRIPCIONENTRADA, BC001C6_n540DESCRIPCIONENTRADA, BC001C6_A601CANTIDADENTRADA, BC001C6_n601CANTIDADENTRADA,
            BC001C6_A686INDICADORPHI, BC001C6_A645VALORFUTURO, BC001C6_A647TIEMPO, BC001C6_A646INTERES, BC001C6_A648VIDAUTIL, BC001C6_A644OTROSCOSTOS, BC001C6_A605MARCA, BC001C6_A607MODELO, BC001C6_A606SERIAL
            }
            , new Object[] {
            BC001C7_A83NROTRANSACCION, BC001C7_A84IDCARMAS, BC001C7_A537CONSECUTIVOENTRADA, BC001C7_n537CONSECUTIVOENTRADA, BC001C7_A538COSTOADQUISICION, BC001C7_n538COSTOADQUISICION, BC001C7_A540DESCRIPCIONENTRADA, BC001C7_n540DESCRIPCIONENTRADA, BC001C7_A601CANTIDADENTRADA, BC001C7_n601CANTIDADENTRADA,
            BC001C7_A686INDICADORPHI, BC001C7_A645VALORFUTURO, BC001C7_A647TIEMPO, BC001C7_A646INTERES, BC001C7_A648VIDAUTIL, BC001C7_A644OTROSCOSTOS, BC001C7_A605MARCA, BC001C7_A607MODELO, BC001C7_A606SERIAL
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC001C11_A83NROTRANSACCION, BC001C11_A84IDCARMAS, BC001C11_A537CONSECUTIVOENTRADA, BC001C11_n537CONSECUTIVOENTRADA, BC001C11_A538COSTOADQUISICION, BC001C11_n538COSTOADQUISICION, BC001C11_A540DESCRIPCIONENTRADA, BC001C11_n540DESCRIPCIONENTRADA, BC001C11_A601CANTIDADENTRADA, BC001C11_n601CANTIDADENTRADA,
            BC001C11_A686INDICADORPHI, BC001C11_A645VALORFUTURO, BC001C11_A647TIEMPO, BC001C11_A646INTERES, BC001C11_A648VIDAUTIL, BC001C11_A644OTROSCOSTOS, BC001C11_A605MARCA, BC001C11_A607MODELO, BC001C11_A606SERIAL
            }
         }
      );
      /* Execute Start event if defined. */
      /* Execute user event: Start */
      e121C2 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z84IDCARMAS ;
   private short A84IDCARMAS ;
   private short Z686INDICADORPHI ;
   private short A686INDICADORPHI ;
   private short Z647TIEMPO ;
   private short A647TIEMPO ;
   private short Z648VIDAUTIL ;
   private short A648VIDAUTIL ;
   private short RcdFound49 ;
   private int trnEnded ;
   private int GX_JID ;
   private int Z601CANTIDADENTRADA ;
   private int A601CANTIDADENTRADA ;
   private long Z83NROTRANSACCION ;
   private long A83NROTRANSACCION ;
   private java.math.BigDecimal Z538COSTOADQUISICION ;
   private java.math.BigDecimal A538COSTOADQUISICION ;
   private java.math.BigDecimal Z645VALORFUTURO ;
   private java.math.BigDecimal A645VALORFUTURO ;
   private java.math.BigDecimal Z646INTERES ;
   private java.math.BigDecimal A646INTERES ;
   private java.math.BigDecimal Z644OTROSCOSTOS ;
   private java.math.BigDecimal A644OTROSCOSTOS ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String GXv_char1[] ;
   private String sMode49 ;
   private boolean n537CONSECUTIVOENTRADA ;
   private boolean n538COSTOADQUISICION ;
   private boolean n540DESCRIPCIONENTRADA ;
   private boolean n601CANTIDADENTRADA ;
   private boolean Gx_longc ;
   private String Z537CONSECUTIVOENTRADA ;
   private String A537CONSECUTIVOENTRADA ;
   private String Z540DESCRIPCIONENTRADA ;
   private String A540DESCRIPCIONENTRADA ;
   private String Z605MARCA ;
   private String A605MARCA ;
   private String Z607MODELO ;
   private String A607MODELO ;
   private String Z606SERIAL ;
   private String A606SERIAL ;
   private String AV8Ind2 ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.orions2.SdtMAS_CARGUE_ENTRADA bcMAS_CARGUE_ENTRADA ;
   private IDataStoreProvider pr_default ;
   private long[] BC001C4_A83NROTRANSACCION ;
   private short[] BC001C4_A84IDCARMAS ;
   private String[] BC001C4_A537CONSECUTIVOENTRADA ;
   private boolean[] BC001C4_n537CONSECUTIVOENTRADA ;
   private java.math.BigDecimal[] BC001C4_A538COSTOADQUISICION ;
   private boolean[] BC001C4_n538COSTOADQUISICION ;
   private String[] BC001C4_A540DESCRIPCIONENTRADA ;
   private boolean[] BC001C4_n540DESCRIPCIONENTRADA ;
   private int[] BC001C4_A601CANTIDADENTRADA ;
   private boolean[] BC001C4_n601CANTIDADENTRADA ;
   private short[] BC001C4_A686INDICADORPHI ;
   private java.math.BigDecimal[] BC001C4_A645VALORFUTURO ;
   private short[] BC001C4_A647TIEMPO ;
   private java.math.BigDecimal[] BC001C4_A646INTERES ;
   private short[] BC001C4_A648VIDAUTIL ;
   private java.math.BigDecimal[] BC001C4_A644OTROSCOSTOS ;
   private String[] BC001C4_A605MARCA ;
   private String[] BC001C4_A607MODELO ;
   private String[] BC001C4_A606SERIAL ;
   private long[] BC001C5_A83NROTRANSACCION ;
   private short[] BC001C5_A84IDCARMAS ;
   private long[] BC001C6_A83NROTRANSACCION ;
   private short[] BC001C6_A84IDCARMAS ;
   private String[] BC001C6_A537CONSECUTIVOENTRADA ;
   private boolean[] BC001C6_n537CONSECUTIVOENTRADA ;
   private java.math.BigDecimal[] BC001C6_A538COSTOADQUISICION ;
   private boolean[] BC001C6_n538COSTOADQUISICION ;
   private String[] BC001C6_A540DESCRIPCIONENTRADA ;
   private boolean[] BC001C6_n540DESCRIPCIONENTRADA ;
   private int[] BC001C6_A601CANTIDADENTRADA ;
   private boolean[] BC001C6_n601CANTIDADENTRADA ;
   private short[] BC001C6_A686INDICADORPHI ;
   private java.math.BigDecimal[] BC001C6_A645VALORFUTURO ;
   private short[] BC001C6_A647TIEMPO ;
   private java.math.BigDecimal[] BC001C6_A646INTERES ;
   private short[] BC001C6_A648VIDAUTIL ;
   private java.math.BigDecimal[] BC001C6_A644OTROSCOSTOS ;
   private String[] BC001C6_A605MARCA ;
   private String[] BC001C6_A607MODELO ;
   private String[] BC001C6_A606SERIAL ;
   private long[] BC001C7_A83NROTRANSACCION ;
   private short[] BC001C7_A84IDCARMAS ;
   private String[] BC001C7_A537CONSECUTIVOENTRADA ;
   private boolean[] BC001C7_n537CONSECUTIVOENTRADA ;
   private java.math.BigDecimal[] BC001C7_A538COSTOADQUISICION ;
   private boolean[] BC001C7_n538COSTOADQUISICION ;
   private String[] BC001C7_A540DESCRIPCIONENTRADA ;
   private boolean[] BC001C7_n540DESCRIPCIONENTRADA ;
   private int[] BC001C7_A601CANTIDADENTRADA ;
   private boolean[] BC001C7_n601CANTIDADENTRADA ;
   private short[] BC001C7_A686INDICADORPHI ;
   private java.math.BigDecimal[] BC001C7_A645VALORFUTURO ;
   private short[] BC001C7_A647TIEMPO ;
   private java.math.BigDecimal[] BC001C7_A646INTERES ;
   private short[] BC001C7_A648VIDAUTIL ;
   private java.math.BigDecimal[] BC001C7_A644OTROSCOSTOS ;
   private String[] BC001C7_A605MARCA ;
   private String[] BC001C7_A607MODELO ;
   private String[] BC001C7_A606SERIAL ;
   private long[] BC001C11_A83NROTRANSACCION ;
   private short[] BC001C11_A84IDCARMAS ;
   private String[] BC001C11_A537CONSECUTIVOENTRADA ;
   private boolean[] BC001C11_n537CONSECUTIVOENTRADA ;
   private java.math.BigDecimal[] BC001C11_A538COSTOADQUISICION ;
   private boolean[] BC001C11_n538COSTOADQUISICION ;
   private String[] BC001C11_A540DESCRIPCIONENTRADA ;
   private boolean[] BC001C11_n540DESCRIPCIONENTRADA ;
   private int[] BC001C11_A601CANTIDADENTRADA ;
   private boolean[] BC001C11_n601CANTIDADENTRADA ;
   private short[] BC001C11_A686INDICADORPHI ;
   private java.math.BigDecimal[] BC001C11_A645VALORFUTURO ;
   private short[] BC001C11_A647TIEMPO ;
   private java.math.BigDecimal[] BC001C11_A646INTERES ;
   private short[] BC001C11_A648VIDAUTIL ;
   private java.math.BigDecimal[] BC001C11_A644OTROSCOSTOS ;
   private String[] BC001C11_A605MARCA ;
   private String[] BC001C11_A607MODELO ;
   private String[] BC001C11_A606SERIAL ;
   private long[] BC001C2_A83NROTRANSACCION ;
   private short[] BC001C2_A84IDCARMAS ;
   private String[] BC001C2_A537CONSECUTIVOENTRADA ;
   private java.math.BigDecimal[] BC001C2_A538COSTOADQUISICION ;
   private String[] BC001C2_A540DESCRIPCIONENTRADA ;
   private int[] BC001C2_A601CANTIDADENTRADA ;
   private short[] BC001C2_A686INDICADORPHI ;
   private java.math.BigDecimal[] BC001C2_A645VALORFUTURO ;
   private short[] BC001C2_A647TIEMPO ;
   private java.math.BigDecimal[] BC001C2_A646INTERES ;
   private short[] BC001C2_A648VIDAUTIL ;
   private java.math.BigDecimal[] BC001C2_A644OTROSCOSTOS ;
   private String[] BC001C2_A605MARCA ;
   private String[] BC001C2_A607MODELO ;
   private String[] BC001C2_A606SERIAL ;
   private long[] BC001C3_A83NROTRANSACCION ;
   private short[] BC001C3_A84IDCARMAS ;
   private String[] BC001C3_A537CONSECUTIVOENTRADA ;
   private java.math.BigDecimal[] BC001C3_A538COSTOADQUISICION ;
   private String[] BC001C3_A540DESCRIPCIONENTRADA ;
   private int[] BC001C3_A601CANTIDADENTRADA ;
   private short[] BC001C3_A686INDICADORPHI ;
   private java.math.BigDecimal[] BC001C3_A645VALORFUTURO ;
   private short[] BC001C3_A647TIEMPO ;
   private java.math.BigDecimal[] BC001C3_A646INTERES ;
   private short[] BC001C3_A648VIDAUTIL ;
   private java.math.BigDecimal[] BC001C3_A644OTROSCOSTOS ;
   private String[] BC001C3_A605MARCA ;
   private String[] BC001C3_A607MODELO ;
   private String[] BC001C3_A606SERIAL ;
   private boolean[] BC001C2_n537CONSECUTIVOENTRADA ;
   private boolean[] BC001C2_n538COSTOADQUISICION ;
   private boolean[] BC001C2_n540DESCRIPCIONENTRADA ;
   private boolean[] BC001C2_n601CANTIDADENTRADA ;
   private boolean[] BC001C3_n537CONSECUTIVOENTRADA ;
   private boolean[] BC001C3_n538COSTOADQUISICION ;
   private boolean[] BC001C3_n540DESCRIPCIONENTRADA ;
   private boolean[] BC001C3_n601CANTIDADENTRADA ;
}

final  class mas_cargue_entrada_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC001C2", "SELECT NROTRANSACCION, IDCARMAS, CONSECUTIVOENTRADA, COSTOADQUISICION, DESCRIPCIONENTRADA, CANTIDADENTRADA, INDICADORPHI, VALORFUTURO, TIEMPO, INTERES, VIDAUTIL, OTROSCOSTOS, MARCA, MODELO, SERIAL FROM MAS_CARGUE_ENTRADA WHERE NROTRANSACCION = ? AND IDCARMAS = ?  FOR UPDATE OF CONSECUTIVOENTRADA, COSTOADQUISICION, DESCRIPCIONENTRADA, CANTIDADENTRADA, INDICADORPHI, VALORFUTURO, TIEMPO, INTERES, VIDAUTIL, OTROSCOSTOS, MARCA, MODELO, SERIAL NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001C3", "SELECT NROTRANSACCION, IDCARMAS, CONSECUTIVOENTRADA, COSTOADQUISICION, DESCRIPCIONENTRADA, CANTIDADENTRADA, INDICADORPHI, VALORFUTURO, TIEMPO, INTERES, VIDAUTIL, OTROSCOSTOS, MARCA, MODELO, SERIAL FROM MAS_CARGUE_ENTRADA WHERE NROTRANSACCION = ? AND IDCARMAS = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001C4", "SELECT /*+ FIRST_ROWS(100) */ TM1.NROTRANSACCION, TM1.IDCARMAS, TM1.CONSECUTIVOENTRADA, TM1.COSTOADQUISICION, TM1.DESCRIPCIONENTRADA, TM1.CANTIDADENTRADA, TM1.INDICADORPHI, TM1.VALORFUTURO, TM1.TIEMPO, TM1.INTERES, TM1.VIDAUTIL, TM1.OTROSCOSTOS, TM1.MARCA, TM1.MODELO, TM1.SERIAL FROM MAS_CARGUE_ENTRADA TM1 WHERE TM1.NROTRANSACCION = ? and TM1.IDCARMAS = ? ORDER BY TM1.NROTRANSACCION, TM1.IDCARMAS ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC001C5", "SELECT /*+ FIRST_ROWS(1) */ NROTRANSACCION, IDCARMAS FROM MAS_CARGUE_ENTRADA WHERE NROTRANSACCION = ? AND IDCARMAS = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001C6", "SELECT NROTRANSACCION, IDCARMAS, CONSECUTIVOENTRADA, COSTOADQUISICION, DESCRIPCIONENTRADA, CANTIDADENTRADA, INDICADORPHI, VALORFUTURO, TIEMPO, INTERES, VIDAUTIL, OTROSCOSTOS, MARCA, MODELO, SERIAL FROM MAS_CARGUE_ENTRADA WHERE NROTRANSACCION = ? AND IDCARMAS = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001C7", "SELECT NROTRANSACCION, IDCARMAS, CONSECUTIVOENTRADA, COSTOADQUISICION, DESCRIPCIONENTRADA, CANTIDADENTRADA, INDICADORPHI, VALORFUTURO, TIEMPO, INTERES, VIDAUTIL, OTROSCOSTOS, MARCA, MODELO, SERIAL FROM MAS_CARGUE_ENTRADA WHERE NROTRANSACCION = ? AND IDCARMAS = ?  FOR UPDATE OF CONSECUTIVOENTRADA, COSTOADQUISICION, DESCRIPCIONENTRADA, CANTIDADENTRADA, INDICADORPHI, VALORFUTURO, TIEMPO, INTERES, VIDAUTIL, OTROSCOSTOS, MARCA, MODELO, SERIAL NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC001C8", "INSERT INTO MAS_CARGUE_ENTRADA(NROTRANSACCION, IDCARMAS, CONSECUTIVOENTRADA, COSTOADQUISICION, DESCRIPCIONENTRADA, CANTIDADENTRADA, INDICADORPHI, VALORFUTURO, TIEMPO, INTERES, VIDAUTIL, OTROSCOSTOS, MARCA, MODELO, SERIAL) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "MAS_CARGUE_ENTRADA")
         ,new UpdateCursor("BC001C9", "UPDATE MAS_CARGUE_ENTRADA SET CONSECUTIVOENTRADA=?, COSTOADQUISICION=?, DESCRIPCIONENTRADA=?, CANTIDADENTRADA=?, INDICADORPHI=?, VALORFUTURO=?, TIEMPO=?, INTERES=?, VIDAUTIL=?, OTROSCOSTOS=?, MARCA=?, MODELO=?, SERIAL=?  WHERE NROTRANSACCION = ? AND IDCARMAS = ?", GX_NOMASK, "MAS_CARGUE_ENTRADA")
         ,new UpdateCursor("BC001C10", "DELETE FROM MAS_CARGUE_ENTRADA  WHERE NROTRANSACCION = ? AND IDCARMAS = ?", GX_NOMASK, "MAS_CARGUE_ENTRADA")
         ,new ForEachCursor("BC001C11", "SELECT /*+ FIRST_ROWS(100) */ TM1.NROTRANSACCION, TM1.IDCARMAS, TM1.CONSECUTIVOENTRADA, TM1.COSTOADQUISICION, TM1.DESCRIPCIONENTRADA, TM1.CANTIDADENTRADA, TM1.INDICADORPHI, TM1.VALORFUTURO, TM1.TIEMPO, TM1.INTERES, TM1.VIDAUTIL, TM1.OTROSCOSTOS, TM1.MARCA, TM1.MODELO, TM1.SERIAL FROM MAS_CARGUE_ENTRADA TM1 WHERE TM1.NROTRANSACCION = ? and TM1.IDCARMAS = ? ORDER BY TM1.NROTRANSACCION, TM1.IDCARMAS ",true, GX_NOMASK, false, this,100,0,false )
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
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7) ;
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2) ;
               ((short[]) buf[12])[0] = rslt.getShort(9) ;
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2) ;
               ((short[]) buf[14])[0] = rslt.getShort(11) ;
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,2) ;
               ((String[]) buf[16])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(14) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(15) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7) ;
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2) ;
               ((short[]) buf[12])[0] = rslt.getShort(9) ;
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2) ;
               ((short[]) buf[14])[0] = rslt.getShort(11) ;
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,2) ;
               ((String[]) buf[16])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(14) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(15) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7) ;
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2) ;
               ((short[]) buf[12])[0] = rslt.getShort(9) ;
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2) ;
               ((short[]) buf[14])[0] = rslt.getShort(11) ;
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,2) ;
               ((String[]) buf[16])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(14) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(15) ;
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
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7) ;
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2) ;
               ((short[]) buf[12])[0] = rslt.getShort(9) ;
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2) ;
               ((short[]) buf[14])[0] = rslt.getShort(11) ;
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,2) ;
               ((String[]) buf[16])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(14) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(15) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7) ;
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2) ;
               ((short[]) buf[12])[0] = rslt.getShort(9) ;
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2) ;
               ((short[]) buf[14])[0] = rslt.getShort(11) ;
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,2) ;
               ((String[]) buf[16])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(14) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(15) ;
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7) ;
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2) ;
               ((short[]) buf[12])[0] = rslt.getShort(9) ;
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2) ;
               ((short[]) buf[14])[0] = rslt.getShort(11) ;
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,2) ;
               ((String[]) buf[16])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(14) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(15) ;
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
                  stmt.setVarchar(3, (String)parms[3], 9);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[7], 200);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[9]).intValue());
               }
               stmt.setShort(7, ((Number) parms[10]).shortValue());
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[11], 2);
               stmt.setShort(9, ((Number) parms[12]).shortValue());
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[13], 2);
               stmt.setShort(11, ((Number) parms[14]).shortValue());
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[15], 2);
               stmt.setVarchar(13, (String)parms[16], 50, false);
               stmt.setVarchar(14, (String)parms[17], 50, false);
               stmt.setVarchar(15, (String)parms[18], 50, false);
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 9);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 200);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[7]).intValue());
               }
               stmt.setShort(5, ((Number) parms[8]).shortValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[9], 2);
               stmt.setShort(7, ((Number) parms[10]).shortValue());
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[11], 2);
               stmt.setShort(9, ((Number) parms[12]).shortValue());
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[13], 2);
               stmt.setVarchar(11, (String)parms[14], 50, false);
               stmt.setVarchar(12, (String)parms[15], 50, false);
               stmt.setVarchar(13, (String)parms[16], 50, false);
               stmt.setLong(14, ((Number) parms[17]).longValue());
               stmt.setShort(15, ((Number) parms[18]).shortValue());
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

