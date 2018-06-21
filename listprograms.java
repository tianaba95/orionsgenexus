/*
               File: ListPrograms
        Description: List Programs
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:56.56
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class listprograms extends GXProcedure
{
   public listprograms( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( listprograms.class ), "" );
   }

   public listprograms( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GXBaseCollection<com.orions2.SdtProgramNames_ProgramName> executeUdp( )
   {
      listprograms.this.aP0 = aP0;
      listprograms.this.aP0 = new GXBaseCollection[] {new GXBaseCollection<com.orions2.SdtProgramNames_ProgramName>()};
      initialize();
      privateExecute();
      return aP0[0];
   }

   public void execute( GXBaseCollection<com.orions2.SdtProgramNames_ProgramName>[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( GXBaseCollection<com.orions2.SdtProgramNames_ProgramName>[] aP0 )
   {
      listprograms.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9ProgramNames = new GXBaseCollection<com.orions2.SdtProgramNames_ProgramName>(com.orions2.SdtProgramNames_ProgramName.class, "ProgramNames.ProgramName", "ACBSENA", remoteHandle) ;
      AV11name = "WWALM_ALMACEN" ;
      AV12description = "Work With Almacéns" ;
      AV13link = formatLink("com.orions2.wwalm_almacen")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWALM_ALMGEN" ;
      AV12description = "Work With Almacén generals" ;
      AV13link = formatLink("com.orions2.wwalm_almgen")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWALM_AREA" ;
      AV12description = "Work With ALAMCEN AREAS" ;
      AV13link = formatLink("com.orions2.wwalm_area")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWALM_BODEGA" ;
      AV12description = "Lista de Bodegas" ;
      AV13link = formatLink("com.orions2.wwalm_bodega")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWALM_CAT_FAM" ;
      AV12description = "Work With Familia del catálogoes" ;
      AV13link = formatLink("com.orions2.wwalm_cat_fam")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWALM_CAT_SEG" ;
      AV12description = "Work With Segmento del catálogoes" ;
      AV13link = formatLink("com.orions2.wwalm_cat_seg")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWALM_CAT_TIP" ;
      AV12description = "Work With Tipo de catálogoes" ;
      AV13link = formatLink("com.orions2.wwalm_cat_tip")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWALM_CATALOGO" ;
      AV12description = "Work With Catálogoes" ;
      AV13link = formatLink("com.orions2.wwalm_catalogo")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWALM_CLASE" ;
      AV12description = "Lista de Clases" ;
      AV13link = formatLink("com.orions2.wwalm_clase")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWALM_CUENTADANTE" ;
      AV12description = "Lista Cuentadantes" ;
      AV13link = formatLink("com.orions2.wwalm_cuentadante")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWALM_CUENTADANTE_MULTI" ;
      AV12description = "Cuentadante Multiple" ;
      AV13link = formatLink("com.orions2.wwalm_cuentadante_multi")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWALM_DETALLE_TRANSACCION" ;
      AV12description = "Work With Detalle transaccións" ;
      AV13link = formatLink("com.orions2.wwalm_detalle_transaccion")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWALM_DOCUMENTOS" ;
      AV12description = "Work With ALM_DOCUMENTOSS" ;
      AV13link = formatLink("com.orions2.wwalm_documentos")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWALM_ELEMENTO" ;
      AV12description = "Elementos" ;
      AV13link = formatLink("com.orions2.wwalm_elemento")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWALM_INV_CON" ;
      AV12description = "Work With ALMACEN INVENTARIO CONSUMOES" ;
      AV13link = formatLink("com.orions2.wwalm_inv_con")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWALM_INV_KARDEX" ;
      AV12description = "Work With Inventario Kardexs" ;
      AV13link = formatLink("com.orions2.wwalm_inv_kardex")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWALM_INVENTARIO_DEVOLUTIVO" ;
      AV12description = "Work With Inventario devolutivoes" ;
      AV13link = formatLink("com.orions2.wwalm_inventario_devolutivo")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWALM_LISTA_ATRIBUTOS" ;
      AV12description = "Lista de atributos" ;
      AV13link = formatLink("com.orions2.wwalm_lista_atributos")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWALM_NOVEDAD" ;
      AV12description = "Work With Novedads" ;
      AV13link = formatLink("com.orions2.wwalm_novedad")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWALM_ORIGEN_BIENES" ;
      AV12description = "Work With Orígen de los bienes y destinaciones de las bajas" ;
      AV13link = formatLink("com.orions2.wwalm_origen_bienes")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWALM_RESTRICCIONES" ;
      AV12description = "Restricciones" ;
      AV13link = formatLink("com.orions2.wwalm_restricciones")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWALM_TIPO_ALMACEN" ;
      AV12description = "Work With Tipo de almacéns" ;
      AV13link = formatLink("com.orions2.wwalm_tipo_almacen")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWALM_TIPO_ELEMENTO" ;
      AV12description = "Lista tipo elementos" ;
      AV13link = formatLink("com.orions2.wwalm_tipo_elemento")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWALM_TIPO_MOVIMIENTO" ;
      AV12description = "Lista tipo de movimientos" ;
      AV13link = formatLink("com.orions2.wwalm_tipo_movimiento")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWALM_TIPO_NOVEDAD" ;
      AV12description = "Work With Tipo de Novedads" ;
      AV13link = formatLink("com.orions2.wwalm_tipo_novedad")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWALM_TIPO_TERCERO" ;
      AV12description = "Work With Tipo de terceroes" ;
      AV13link = formatLink("com.orions2.wwalm_tipo_tercero")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWALM_TRANSACCION" ;
      AV12description = "Transacciones" ;
      AV13link = formatLink("com.orions2.wwalm_transaccion")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWALM_UNIDAD_MEDIDA" ;
      AV12description = "Work With Unidad de medidas" ;
      AV13link = formatLink("com.orions2.wwalm_unidad_medida")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWGEN_CENTROCOSTO" ;
      AV12description = "Centros de costo" ;
      AV13link = formatLink("com.orions2.wwgen_centrocosto")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWGEN_CIUDAD" ;
      AV12description = "Work With Ciudads" ;
      AV13link = formatLink("com.orions2.wwgen_ciudad")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWGEN_DEPARTAMENTO" ;
      AV12description = "Work With Departamentoes" ;
      AV13link = formatLink("com.orions2.wwgen_departamento")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWGEN_PAIS" ;
      AV12description = "Work With País" ;
      AV13link = formatLink("com.orions2.wwgen_pais")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWGEN_REGIONAL" ;
      AV12description = "Work With Regionals" ;
      AV13link = formatLink("com.orions2.wwgen_regional")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWRPT_PARAMETROS" ;
      AV12description = "Work With PARAMETROS DE REPORTES" ;
      AV13link = formatLink("com.orions2.wwrpt_parametros")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWRPT_REPORTE" ;
      AV12description = "Work With REPORTES" ;
      AV13link = formatLink("com.orions2.wwrpt_reporte")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWSEG_MODULO_MENU" ;
      AV12description = "Work With Móduloes" ;
      AV13link = formatLink("com.orions2.wwseg_modulo_menu")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWSEG_PANTALLA" ;
      AV12description = "Work With Pantallas" ;
      AV13link = formatLink("com.orions2.wwseg_pantalla")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWSEG_PARAMETROS" ;
      AV12description = "Work With Parámetross" ;
      AV13link = formatLink("com.orions2.wwseg_parametros")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWSEG_ROL" ;
      AV12description = "Work With Rols" ;
      AV13link = formatLink("com.orions2.wwseg_rol")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWSEG_ROL_PANTALLA" ;
      AV12description = "Work With Roles y pantallas" ;
      AV13link = formatLink("com.orions2.wwseg_rol_pantalla")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWSEG_ROLYPANTALLA" ;
      AV12description = "Work With Rol y pantalls" ;
      AV13link = formatLink("com.orions2.wwseg_rolypantalla")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWSEG_USUARIO" ;
      AV12description = "Work With Usuarios" ;
      AV13link = formatLink("com.orions2.wwseg_usuario")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWSEG_USUARIOROL" ;
      AV12description = "Work With Usuario y Roles" ;
      AV13link = formatLink("com.orions2.wwseg_usuariorol")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'ADDPROGRAM' Routine */
      AV8IsAuthorized = true ;
      GXt_boolean1 = AV8IsAuthorized ;
      GXv_boolean2[0] = GXt_boolean1 ;
      new com.orions2.isauthorized(remoteHandle, context).execute( AV11name, GXv_boolean2) ;
      listprograms.this.GXt_boolean1 = GXv_boolean2[0] ;
      AV8IsAuthorized = GXt_boolean1 ;
      if ( AV8IsAuthorized )
      {
         AV10ProgramName = (com.orions2.SdtProgramNames_ProgramName)new com.orions2.SdtProgramNames_ProgramName(remoteHandle, context);
         AV10ProgramName.setgxTv_SdtProgramNames_ProgramName_Name( AV11name );
         AV10ProgramName.setgxTv_SdtProgramNames_ProgramName_Description( AV12description );
         AV10ProgramName.setgxTv_SdtProgramNames_ProgramName_Link( AV13link );
         AV9ProgramNames.add(AV10ProgramName, 0);
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = listprograms.this.AV9ProgramNames;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9ProgramNames = new GXBaseCollection<com.orions2.SdtProgramNames_ProgramName>(com.orions2.SdtProgramNames_ProgramName.class, "ProgramNames.ProgramName", "ACBSENA", remoteHandle);
      AV11name = "" ;
      AV12description = "" ;
      AV13link = "" ;
      GXv_boolean2 = new boolean [1] ;
      AV10ProgramName = new com.orions2.SdtProgramNames_ProgramName(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private boolean returnInSub ;
   private boolean AV8IsAuthorized ;
   private boolean GXt_boolean1 ;
   private boolean GXv_boolean2[] ;
   private String AV11name ;
   private String AV12description ;
   private String AV13link ;
   private GXBaseCollection<com.orions2.SdtProgramNames_ProgramName>[] aP0 ;
   private GXBaseCollection<com.orions2.SdtProgramNames_ProgramName> AV9ProgramNames ;
   private com.orions2.SdtProgramNames_ProgramName AV10ProgramName ;
}

