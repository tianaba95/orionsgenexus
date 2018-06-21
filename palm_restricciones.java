/*
               File: PALM_RESTRICCIONES
        Description: PALM_RESTRICCIONES
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:59.43
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palm_restricciones extends GXProcedure
{
   public palm_restricciones( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palm_restricciones.class ), "" );
   }

   public palm_restricciones( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public long executeUdp( com.orions2.SdtSDTALM_RESTRICCIONES[] aP0 ,
                           String[] aP1 )
   {
      palm_restricciones.this.AV8SDTALM_RESTRICCIONES = aP0[0];
      this.aP0 = aP0;
      palm_restricciones.this.Gx_mode = aP1[0];
      this.aP1 = aP1;
      palm_restricciones.this.AV9PMbod_Id = aP2[0];
      this.aP2 = aP2;
      palm_restricciones.this.aP2 = new long[] {0};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( com.orions2.SdtSDTALM_RESTRICCIONES[] aP0 ,
                        String[] aP1 ,
                        long[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( com.orions2.SdtSDTALM_RESTRICCIONES[] aP0 ,
                             String[] aP1 ,
                             long[] aP2 )
   {
      palm_restricciones.this.AV8SDTALM_RESTRICCIONES = aP0[0];
      this.aP0 = aP0;
      palm_restricciones.this.Gx_mode = aP1[0];
      this.aP1 = aP1;
      palm_restricciones.this.AV9PMbod_Id = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: 'INICIAPROCESO' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "palm_restricciones");
      cleanup();
   }

   public void S111( )
   {
      /* 'INICIAPROCESO' Routine */
      if ( GXutil.strcmp(Gx_mode, "CAR") == 0 )
      {
         /* Execute user subroutine: 'MODOCARGAR' */
         S121 ();
         if (returnInSub) return;
      }
      else if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Execute user subroutine: 'MODOINSERTAR' */
         S131 ();
         if (returnInSub) return;
      }
      else if ( GXutil.strcmp(Gx_mode, "UDP") == 0 )
      {
         /* Execute user subroutine: 'MODOMODIFICAR' */
         S141 ();
         if (returnInSub) return;
      }
      else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
      {
         /* Execute user subroutine: 'MODOELIMINAR' */
         S151 ();
         if (returnInSub) return;
      }
   }

   public void S121( )
   {
      /* 'MODOCARGAR' Routine */
      /* Using cursor P00132 */
      pr_default.execute(0, new Object[] {new Long(AV9PMbod_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A60Mbod_Id = P00132_A60Mbod_Id[0] ;
         A61Mbod_TipoMovCodigo = P00132_A61Mbod_TipoMovCodigo[0] ;
         A428Mbod_TipoMovDescrip = P00132_A428Mbod_TipoMovDescrip[0] ;
         n428Mbod_TipoMovDescrip = P00132_n428Mbod_TipoMovDescrip[0] ;
         A431Mbod_TipoElementoCod = P00132_A431Mbod_TipoElementoCod[0] ;
         n431Mbod_TipoElementoCod = P00132_n431Mbod_TipoElementoCod[0] ;
         A432Mbod_TipoElementoDesc = P00132_A432Mbod_TipoElementoDesc[0] ;
         n432Mbod_TipoElementoDesc = P00132_n432Mbod_TipoElementoDesc[0] ;
         A62Mbod_RegionId = P00132_A62Mbod_RegionId[0] ;
         A426Mbod_RegionCodigo = P00132_A426Mbod_RegionCodigo[0] ;
         n426Mbod_RegionCodigo = P00132_n426Mbod_RegionCodigo[0] ;
         A427Mbod_RegionDescripcion = P00132_A427Mbod_RegionDescripcion[0] ;
         n427Mbod_RegionDescripcion = P00132_n427Mbod_RegionDescripcion[0] ;
         A63Mbod_CentCostoId = P00132_A63Mbod_CentCostoId[0] ;
         A429Mbod_CentCostoCodigo = P00132_A429Mbod_CentCostoCodigo[0] ;
         n429Mbod_CentCostoCodigo = P00132_n429Mbod_CentCostoCodigo[0] ;
         A430Mbod_CentroCostoDescrip = P00132_A430Mbod_CentroCostoDescrip[0] ;
         n430Mbod_CentroCostoDescrip = P00132_n430Mbod_CentroCostoDescrip[0] ;
         A364Mbod_AlmModOrigen = P00132_A364Mbod_AlmModOrigen[0] ;
         A342Mbod_AlmOrigenCodigo = P00132_A342Mbod_AlmOrigenCodigo[0] ;
         A64Mbod_BodOrigenCodigo = P00132_A64Mbod_BodOrigenCodigo[0] ;
         A368Mbod_AlmModDestino = P00132_A368Mbod_AlmModDestino[0] ;
         A345Mbod_AlmDestinoCodigo = P00132_A345Mbod_AlmDestinoCodigo[0] ;
         A65Mbod_BodDestinoCodigo = P00132_A65Mbod_BodDestinoCodigo[0] ;
         A434Mbod_Estado = P00132_A434Mbod_Estado[0] ;
         A428Mbod_TipoMovDescrip = P00132_A428Mbod_TipoMovDescrip[0] ;
         n428Mbod_TipoMovDescrip = P00132_n428Mbod_TipoMovDescrip[0] ;
         A431Mbod_TipoElementoCod = P00132_A431Mbod_TipoElementoCod[0] ;
         n431Mbod_TipoElementoCod = P00132_n431Mbod_TipoElementoCod[0] ;
         A432Mbod_TipoElementoDesc = P00132_A432Mbod_TipoElementoDesc[0] ;
         n432Mbod_TipoElementoDesc = P00132_n432Mbod_TipoElementoDesc[0] ;
         A426Mbod_RegionCodigo = P00132_A426Mbod_RegionCodigo[0] ;
         n426Mbod_RegionCodigo = P00132_n426Mbod_RegionCodigo[0] ;
         A427Mbod_RegionDescripcion = P00132_A427Mbod_RegionDescripcion[0] ;
         n427Mbod_RegionDescripcion = P00132_n427Mbod_RegionDescripcion[0] ;
         A429Mbod_CentCostoCodigo = P00132_A429Mbod_CentCostoCodigo[0] ;
         n429Mbod_CentCostoCodigo = P00132_n429Mbod_CentCostoCodigo[0] ;
         A430Mbod_CentroCostoDescrip = P00132_A430Mbod_CentroCostoDescrip[0] ;
         n430Mbod_CentroCostoDescrip = P00132_n430Mbod_CentroCostoDescrip[0] ;
         AV8SDTALM_RESTRICCIONES.setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovcodigo( A61Mbod_TipoMovCodigo );
         AV8SDTALM_RESTRICCIONES.setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovdescrip( A428Mbod_TipoMovDescrip );
         AV8SDTALM_RESTRICCIONES.setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipoelementocod( A431Mbod_TipoElementoCod );
         AV8SDTALM_RESTRICCIONES.setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipoelementodesc( A432Mbod_TipoElementoDesc );
         AV8SDTALM_RESTRICCIONES.setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_regionid( A62Mbod_RegionId );
         AV8SDTALM_RESTRICCIONES.setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_regioncodigo( A426Mbod_RegionCodigo );
         AV8SDTALM_RESTRICCIONES.setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_regiondescripcion( A427Mbod_RegionDescripcion );
         AV8SDTALM_RESTRICCIONES.setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostoid( A63Mbod_CentCostoId );
         AV8SDTALM_RESTRICCIONES.setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostocodigo( A429Mbod_CentCostoCodigo );
         AV8SDTALM_RESTRICCIONES.setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_centrocostodescrip( A430Mbod_CentroCostoDescrip );
         AV8SDTALM_RESTRICCIONES.setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmodorigen( A364Mbod_AlmModOrigen );
         AV8SDTALM_RESTRICCIONES.setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigencodigo( A342Mbod_AlmOrigenCodigo );
         /* Execute user subroutine: 'BUSCARALMACENORIGEN' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV8SDTALM_RESTRICCIONES.setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigencodigo( A64Mbod_BodOrigenCodigo );
         /* Execute user subroutine: 'BUSCARBODEGAORIGEN' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV8SDTALM_RESTRICCIONES.setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmoddestino( A368Mbod_AlmModDestino );
         AV8SDTALM_RESTRICCIONES.setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinocodigo( A345Mbod_AlmDestinoCodigo );
         /* Execute user subroutine: 'BUSCARALMACENDESTINO' */
         S182 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV8SDTALM_RESTRICCIONES.setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinocodigo( A65Mbod_BodDestinoCodigo );
         /* Execute user subroutine: 'BUSCARBODEGADESTINO' */
         S192 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV8SDTALM_RESTRICCIONES.setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_estado( A434Mbod_Estado );
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'MODOINSERTAR' Routine */
      /*
         INSERT RECORD ON TABLE ALM_RESTRICCIONES

      */
      A61Mbod_TipoMovCodigo = AV8SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovcodigo() ;
      A62Mbod_RegionId = AV8SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_regionid() ;
      A63Mbod_CentCostoId = AV8SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostoid() ;
      A364Mbod_AlmModOrigen = AV8SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmodorigen() ;
      A342Mbod_AlmOrigenCodigo = AV8SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigencodigo() ;
      A64Mbod_BodOrigenCodigo = AV8SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigencodigo() ;
      A368Mbod_AlmModDestino = AV8SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmoddestino() ;
      A345Mbod_AlmDestinoCodigo = AV8SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinocodigo() ;
      A65Mbod_BodDestinoCodigo = AV8SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinocodigo() ;
      A433Mbod_FechaCrea = GXutil.now( ) ;
      A359Mbod_UsuarioCrea = AV8SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_usuariocrea() ;
      A434Mbod_Estado = "A" ;
      /* Using cursor P00133 */
      pr_default.execute(1, new Object[] {A61Mbod_TipoMovCodigo, new Long(A62Mbod_RegionId), new Long(A63Mbod_CentCostoId), A364Mbod_AlmModOrigen, A342Mbod_AlmOrigenCodigo, A64Mbod_BodOrigenCodigo, A368Mbod_AlmModDestino, A345Mbod_AlmDestinoCodigo, A65Mbod_BodDestinoCodigo, A434Mbod_Estado, A433Mbod_FechaCrea, A359Mbod_UsuarioCrea});
      /* Retrieving last key number assigned */
      /* Using cursor P00134 */
      pr_default.execute(2);
      A60Mbod_Id = P00134_A60Mbod_Id[0] ;
      pr_default.close(2);
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_RESTRICCIONES") ;
      if ( (pr_default.getStatus(1) == 1) )
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
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "palm_restricciones");
   }

   public void S141( )
   {
      /* 'MODOMODIFICAR' Routine */
      /* Using cursor P00135 */
      pr_default.execute(3, new Object[] {new Long(AV9PMbod_Id)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A60Mbod_Id = P00135_A60Mbod_Id[0] ;
         A61Mbod_TipoMovCodigo = P00135_A61Mbod_TipoMovCodigo[0] ;
         A62Mbod_RegionId = P00135_A62Mbod_RegionId[0] ;
         A63Mbod_CentCostoId = P00135_A63Mbod_CentCostoId[0] ;
         A364Mbod_AlmModOrigen = P00135_A364Mbod_AlmModOrigen[0] ;
         A342Mbod_AlmOrigenCodigo = P00135_A342Mbod_AlmOrigenCodigo[0] ;
         A64Mbod_BodOrigenCodigo = P00135_A64Mbod_BodOrigenCodigo[0] ;
         A368Mbod_AlmModDestino = P00135_A368Mbod_AlmModDestino[0] ;
         A345Mbod_AlmDestinoCodigo = P00135_A345Mbod_AlmDestinoCodigo[0] ;
         A65Mbod_BodDestinoCodigo = P00135_A65Mbod_BodDestinoCodigo[0] ;
         A362Mbod_FechaModifica = P00135_A362Mbod_FechaModifica[0] ;
         A361Mbod_UsuarioModifica = P00135_A361Mbod_UsuarioModifica[0] ;
         A434Mbod_Estado = P00135_A434Mbod_Estado[0] ;
         A61Mbod_TipoMovCodigo = AV8SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovcodigo() ;
         A62Mbod_RegionId = AV8SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_regionid() ;
         A63Mbod_CentCostoId = AV8SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostoid() ;
         A364Mbod_AlmModOrigen = AV8SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmodorigen() ;
         A342Mbod_AlmOrigenCodigo = AV8SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigencodigo() ;
         A64Mbod_BodOrigenCodigo = AV8SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigencodigo() ;
         A368Mbod_AlmModDestino = AV8SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmoddestino() ;
         A345Mbod_AlmDestinoCodigo = AV8SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinocodigo() ;
         A65Mbod_BodDestinoCodigo = AV8SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinocodigo() ;
         A362Mbod_FechaModifica = GXutil.now( ) ;
         A361Mbod_UsuarioModifica = AV8SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_usuariomodifica() ;
         A434Mbod_Estado = AV8SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_estado() ;
         /* Using cursor P00136 */
         pr_default.execute(4, new Object[] {A61Mbod_TipoMovCodigo, new Long(A62Mbod_RegionId), new Long(A63Mbod_CentCostoId), A364Mbod_AlmModOrigen, A342Mbod_AlmOrigenCodigo, A64Mbod_BodOrigenCodigo, A368Mbod_AlmModDestino, A345Mbod_AlmDestinoCodigo, A65Mbod_BodDestinoCodigo, A362Mbod_FechaModifica, A361Mbod_UsuarioModifica, A434Mbod_Estado, new Long(A60Mbod_Id)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_RESTRICCIONES") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void S151( )
   {
      /* 'MODOELIMINAR' Routine */
      /* Optimized UPDATE. */
      /* Using cursor P00137 */
      pr_default.execute(5, new Object[] {new Long(AV9PMbod_Id)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_RESTRICCIONES") ;
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_RESTRICCIONES") ;
      /* End optimized UPDATE. */
   }

   public void S162( )
   {
      /* 'BUSCARALMACENORIGEN' Routine */
      /* Using cursor P00138 */
      pr_default.execute(6, new Object[] {AV8SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigencodigo()});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A28Alma_Codigo = P00138_A28Alma_Codigo[0] ;
         A252Alma_Descripcion = P00138_A252Alma_Descripcion[0] ;
         A1Cent_Id = P00138_A1Cent_Id[0] ;
         A27Alma_Modulo = P00138_A27Alma_Modulo[0] ;
         AV8SDTALM_RESTRICCIONES.setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigendescripcion( A252Alma_Descripcion );
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void S182( )
   {
      /* 'BUSCARALMACENDESTINO' Routine */
      /* Using cursor P00139 */
      pr_default.execute(7, new Object[] {AV8SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinocodigo()});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A28Alma_Codigo = P00139_A28Alma_Codigo[0] ;
         A252Alma_Descripcion = P00139_A252Alma_Descripcion[0] ;
         A1Cent_Id = P00139_A1Cent_Id[0] ;
         A27Alma_Modulo = P00139_A27Alma_Modulo[0] ;
         AV8SDTALM_RESTRICCIONES.setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinodescripcion( A252Alma_Descripcion );
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void S172( )
   {
      /* 'BUSCARBODEGAORIGEN' Routine */
      /* Using cursor P001310 */
      pr_default.execute(8, new Object[] {AV8SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigencodigo()});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A31Bode_Codigo = P001310_A31Bode_Codigo[0] ;
         A251Bode_Descripcion = P001310_A251Bode_Descripcion[0] ;
         AV8SDTALM_RESTRICCIONES.setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigendescripcion( A251Bode_Descripcion );
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
   }

   public void S192( )
   {
      /* 'BUSCARBODEGADESTINO' Routine */
      /* Using cursor P001311 */
      pr_default.execute(9, new Object[] {AV8SDTALM_RESTRICCIONES.getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinocodigo()});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A31Bode_Codigo = P001311_A31Bode_Codigo[0] ;
         A251Bode_Descripcion = P001311_A251Bode_Descripcion[0] ;
         AV8SDTALM_RESTRICCIONES.setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinodescripcion( A251Bode_Descripcion );
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   protected void cleanup( )
   {
      this.aP0[0] = palm_restricciones.this.AV8SDTALM_RESTRICCIONES;
      this.aP1[0] = palm_restricciones.this.Gx_mode;
      this.aP2[0] = palm_restricciones.this.AV9PMbod_Id;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P00132_A60Mbod_Id = new long[1] ;
      P00132_A61Mbod_TipoMovCodigo = new String[] {""} ;
      P00132_A428Mbod_TipoMovDescrip = new String[] {""} ;
      P00132_n428Mbod_TipoMovDescrip = new boolean[] {false} ;
      P00132_A431Mbod_TipoElementoCod = new long[1] ;
      P00132_n431Mbod_TipoElementoCod = new boolean[] {false} ;
      P00132_A432Mbod_TipoElementoDesc = new String[] {""} ;
      P00132_n432Mbod_TipoElementoDesc = new boolean[] {false} ;
      P00132_A62Mbod_RegionId = new long[1] ;
      P00132_A426Mbod_RegionCodigo = new short[1] ;
      P00132_n426Mbod_RegionCodigo = new boolean[] {false} ;
      P00132_A427Mbod_RegionDescripcion = new String[] {""} ;
      P00132_n427Mbod_RegionDescripcion = new boolean[] {false} ;
      P00132_A63Mbod_CentCostoId = new long[1] ;
      P00132_A429Mbod_CentCostoCodigo = new String[] {""} ;
      P00132_n429Mbod_CentCostoCodigo = new boolean[] {false} ;
      P00132_A430Mbod_CentroCostoDescrip = new String[] {""} ;
      P00132_n430Mbod_CentroCostoDescrip = new boolean[] {false} ;
      P00132_A364Mbod_AlmModOrigen = new String[] {""} ;
      P00132_A342Mbod_AlmOrigenCodigo = new String[] {""} ;
      P00132_A64Mbod_BodOrigenCodigo = new String[] {""} ;
      P00132_A368Mbod_AlmModDestino = new String[] {""} ;
      P00132_A345Mbod_AlmDestinoCodigo = new String[] {""} ;
      P00132_A65Mbod_BodDestinoCodigo = new String[] {""} ;
      P00132_A434Mbod_Estado = new String[] {""} ;
      A61Mbod_TipoMovCodigo = "" ;
      A428Mbod_TipoMovDescrip = "" ;
      A432Mbod_TipoElementoDesc = "" ;
      A427Mbod_RegionDescripcion = "" ;
      A429Mbod_CentCostoCodigo = "" ;
      A430Mbod_CentroCostoDescrip = "" ;
      A364Mbod_AlmModOrigen = "" ;
      A342Mbod_AlmOrigenCodigo = "" ;
      A64Mbod_BodOrigenCodigo = "" ;
      A368Mbod_AlmModDestino = "" ;
      A345Mbod_AlmDestinoCodigo = "" ;
      A65Mbod_BodDestinoCodigo = "" ;
      A434Mbod_Estado = "" ;
      A433Mbod_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A359Mbod_UsuarioCrea = "" ;
      P00134_A60Mbod_Id = new long[1] ;
      Gx_emsg = "" ;
      P00135_A60Mbod_Id = new long[1] ;
      P00135_A61Mbod_TipoMovCodigo = new String[] {""} ;
      P00135_A62Mbod_RegionId = new long[1] ;
      P00135_A63Mbod_CentCostoId = new long[1] ;
      P00135_A364Mbod_AlmModOrigen = new String[] {""} ;
      P00135_A342Mbod_AlmOrigenCodigo = new String[] {""} ;
      P00135_A64Mbod_BodOrigenCodigo = new String[] {""} ;
      P00135_A368Mbod_AlmModDestino = new String[] {""} ;
      P00135_A345Mbod_AlmDestinoCodigo = new String[] {""} ;
      P00135_A65Mbod_BodDestinoCodigo = new String[] {""} ;
      P00135_A362Mbod_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      P00135_A361Mbod_UsuarioModifica = new String[] {""} ;
      P00135_A434Mbod_Estado = new String[] {""} ;
      A362Mbod_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      A361Mbod_UsuarioModifica = "" ;
      P00138_A28Alma_Codigo = new String[] {""} ;
      P00138_A252Alma_Descripcion = new String[] {""} ;
      P00138_A1Cent_Id = new long[1] ;
      P00138_A27Alma_Modulo = new String[] {""} ;
      A28Alma_Codigo = "" ;
      A252Alma_Descripcion = "" ;
      A27Alma_Modulo = "" ;
      P00139_A28Alma_Codigo = new String[] {""} ;
      P00139_A252Alma_Descripcion = new String[] {""} ;
      P00139_A1Cent_Id = new long[1] ;
      P00139_A27Alma_Modulo = new String[] {""} ;
      P001310_A31Bode_Codigo = new String[] {""} ;
      P001310_A251Bode_Descripcion = new String[] {""} ;
      A31Bode_Codigo = "" ;
      A251Bode_Descripcion = "" ;
      P001311_A31Bode_Codigo = new String[] {""} ;
      P001311_A251Bode_Descripcion = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.palm_restricciones__default(),
         new Object[] {
             new Object[] {
            P00132_A60Mbod_Id, P00132_A61Mbod_TipoMovCodigo, P00132_A428Mbod_TipoMovDescrip, P00132_n428Mbod_TipoMovDescrip, P00132_A431Mbod_TipoElementoCod, P00132_n431Mbod_TipoElementoCod, P00132_A432Mbod_TipoElementoDesc, P00132_n432Mbod_TipoElementoDesc, P00132_A62Mbod_RegionId, P00132_A426Mbod_RegionCodigo,
            P00132_n426Mbod_RegionCodigo, P00132_A427Mbod_RegionDescripcion, P00132_n427Mbod_RegionDescripcion, P00132_A63Mbod_CentCostoId, P00132_A429Mbod_CentCostoCodigo, P00132_n429Mbod_CentCostoCodigo, P00132_A430Mbod_CentroCostoDescrip, P00132_n430Mbod_CentroCostoDescrip, P00132_A364Mbod_AlmModOrigen, P00132_A342Mbod_AlmOrigenCodigo,
            P00132_A64Mbod_BodOrigenCodigo, P00132_A368Mbod_AlmModDestino, P00132_A345Mbod_AlmDestinoCodigo, P00132_A65Mbod_BodDestinoCodigo, P00132_A434Mbod_Estado
            }
            , new Object[] {
            }
            , new Object[] {
            P00134_A60Mbod_Id
            }
            , new Object[] {
            P00135_A60Mbod_Id, P00135_A61Mbod_TipoMovCodigo, P00135_A62Mbod_RegionId, P00135_A63Mbod_CentCostoId, P00135_A364Mbod_AlmModOrigen, P00135_A342Mbod_AlmOrigenCodigo, P00135_A64Mbod_BodOrigenCodigo, P00135_A368Mbod_AlmModDestino, P00135_A345Mbod_AlmDestinoCodigo, P00135_A65Mbod_BodDestinoCodigo,
            P00135_A362Mbod_FechaModifica, P00135_A361Mbod_UsuarioModifica, P00135_A434Mbod_Estado
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00138_A28Alma_Codigo, P00138_A252Alma_Descripcion, P00138_A1Cent_Id, P00138_A27Alma_Modulo
            }
            , new Object[] {
            P00139_A28Alma_Codigo, P00139_A252Alma_Descripcion, P00139_A1Cent_Id, P00139_A27Alma_Modulo
            }
            , new Object[] {
            P001310_A31Bode_Codigo, P001310_A251Bode_Descripcion
            }
            , new Object[] {
            P001311_A31Bode_Codigo, P001311_A251Bode_Descripcion
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A426Mbod_RegionCodigo ;
   private short Gx_err ;
   private int GX_INS8 ;
   private long AV9PMbod_Id ;
   private long A60Mbod_Id ;
   private long A431Mbod_TipoElementoCod ;
   private long A62Mbod_RegionId ;
   private long A63Mbod_CentCostoId ;
   private long A1Cent_Id ;
   private String Gx_mode ;
   private String scmdbuf ;
   private String A434Mbod_Estado ;
   private String Gx_emsg ;
   private java.util.Date A433Mbod_FechaCrea ;
   private java.util.Date A362Mbod_FechaModifica ;
   private boolean returnInSub ;
   private boolean n428Mbod_TipoMovDescrip ;
   private boolean n431Mbod_TipoElementoCod ;
   private boolean n432Mbod_TipoElementoDesc ;
   private boolean n426Mbod_RegionCodigo ;
   private boolean n427Mbod_RegionDescripcion ;
   private boolean n429Mbod_CentCostoCodigo ;
   private boolean n430Mbod_CentroCostoDescrip ;
   private String A61Mbod_TipoMovCodigo ;
   private String A428Mbod_TipoMovDescrip ;
   private String A432Mbod_TipoElementoDesc ;
   private String A427Mbod_RegionDescripcion ;
   private String A429Mbod_CentCostoCodigo ;
   private String A430Mbod_CentroCostoDescrip ;
   private String A364Mbod_AlmModOrigen ;
   private String A342Mbod_AlmOrigenCodigo ;
   private String A64Mbod_BodOrigenCodigo ;
   private String A368Mbod_AlmModDestino ;
   private String A345Mbod_AlmDestinoCodigo ;
   private String A65Mbod_BodDestinoCodigo ;
   private String A359Mbod_UsuarioCrea ;
   private String A361Mbod_UsuarioModifica ;
   private String A28Alma_Codigo ;
   private String A252Alma_Descripcion ;
   private String A27Alma_Modulo ;
   private String A31Bode_Codigo ;
   private String A251Bode_Descripcion ;
   private com.orions2.SdtSDTALM_RESTRICCIONES[] aP0 ;
   private String[] aP1 ;
   private long[] aP2 ;
   private IDataStoreProvider pr_default ;
   private long[] P00132_A60Mbod_Id ;
   private String[] P00132_A61Mbod_TipoMovCodigo ;
   private String[] P00132_A428Mbod_TipoMovDescrip ;
   private boolean[] P00132_n428Mbod_TipoMovDescrip ;
   private long[] P00132_A431Mbod_TipoElementoCod ;
   private boolean[] P00132_n431Mbod_TipoElementoCod ;
   private String[] P00132_A432Mbod_TipoElementoDesc ;
   private boolean[] P00132_n432Mbod_TipoElementoDesc ;
   private long[] P00132_A62Mbod_RegionId ;
   private short[] P00132_A426Mbod_RegionCodigo ;
   private boolean[] P00132_n426Mbod_RegionCodigo ;
   private String[] P00132_A427Mbod_RegionDescripcion ;
   private boolean[] P00132_n427Mbod_RegionDescripcion ;
   private long[] P00132_A63Mbod_CentCostoId ;
   private String[] P00132_A429Mbod_CentCostoCodigo ;
   private boolean[] P00132_n429Mbod_CentCostoCodigo ;
   private String[] P00132_A430Mbod_CentroCostoDescrip ;
   private boolean[] P00132_n430Mbod_CentroCostoDescrip ;
   private String[] P00132_A364Mbod_AlmModOrigen ;
   private String[] P00132_A342Mbod_AlmOrigenCodigo ;
   private String[] P00132_A64Mbod_BodOrigenCodigo ;
   private String[] P00132_A368Mbod_AlmModDestino ;
   private String[] P00132_A345Mbod_AlmDestinoCodigo ;
   private String[] P00132_A65Mbod_BodDestinoCodigo ;
   private String[] P00132_A434Mbod_Estado ;
   private long[] P00134_A60Mbod_Id ;
   private long[] P00135_A60Mbod_Id ;
   private String[] P00135_A61Mbod_TipoMovCodigo ;
   private long[] P00135_A62Mbod_RegionId ;
   private long[] P00135_A63Mbod_CentCostoId ;
   private String[] P00135_A364Mbod_AlmModOrigen ;
   private String[] P00135_A342Mbod_AlmOrigenCodigo ;
   private String[] P00135_A64Mbod_BodOrigenCodigo ;
   private String[] P00135_A368Mbod_AlmModDestino ;
   private String[] P00135_A345Mbod_AlmDestinoCodigo ;
   private String[] P00135_A65Mbod_BodDestinoCodigo ;
   private java.util.Date[] P00135_A362Mbod_FechaModifica ;
   private String[] P00135_A361Mbod_UsuarioModifica ;
   private String[] P00135_A434Mbod_Estado ;
   private String[] P00138_A28Alma_Codigo ;
   private String[] P00138_A252Alma_Descripcion ;
   private long[] P00138_A1Cent_Id ;
   private String[] P00138_A27Alma_Modulo ;
   private String[] P00139_A28Alma_Codigo ;
   private String[] P00139_A252Alma_Descripcion ;
   private long[] P00139_A1Cent_Id ;
   private String[] P00139_A27Alma_Modulo ;
   private String[] P001310_A31Bode_Codigo ;
   private String[] P001310_A251Bode_Descripcion ;
   private String[] P001311_A31Bode_Codigo ;
   private String[] P001311_A251Bode_Descripcion ;
   private com.orions2.SdtSDTALM_RESTRICCIONES AV8SDTALM_RESTRICCIONES ;
}

final  class palm_restricciones__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00132", "SELECT T1.Mbod_Id, T1.Mbod_TipoMovCodigo AS Mbod_TipoMovCodigo, T2.Tpmo_Descripcion AS Mbod_TipoMovDescrip, T2.Tipo_Codigo AS Mbod_TipoElementoCod, T3.Tipo_Descripcion AS Mbod_TipoElementoDesc, T1.Mbod_RegionId AS Mbod_RegionId, T4.Regi_Cod AS Mbod_RegionCodigo, T4.Regi_Descripcion AS Mbod_RegionDescripcion, T1.Mbod_CentCostoId AS Mbod_CentCostoId, T5.Cent_Codigo AS Mbod_CentCostoCodigo, T5.Cent_Descripcion AS Mbod_CentroCostoDescrip, T1.Mbod_AlmModOrigen, T1.Mbod_AlmOrigenCodigo, T1.Mbod_BodOrigenCodigo, T1.Mbod_AlmModDestino, T1.Mbod_AlmDestinoCodigo, T1.Mbod_BodDestinoCodigo, T1.Mbod_Estado FROM ((((ALM_RESTRICCIONES T1 INNER JOIN ALM_TIPO_MOVIMIENTO T2 ON T2.Tpmo_Codigo = T1.Mbod_TipoMovCodigo) LEFT JOIN ALM_TIPO_ELEMENTO T3 ON T3.Tipo_Codigo = T2.Tipo_Codigo) INNER JOIN GEN_REGIONAL T4 ON T4.Regi_Id = T1.Mbod_RegionId) INNER JOIN GEN_CENTROCOSTO T5 ON T5.Cent_Id = T1.Mbod_CentCostoId) WHERE T1.Mbod_Id = ? ORDER BY T1.Mbod_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P00133", "INSERT INTO ALM_RESTRICCIONES(Mbod_TipoMovCodigo, Mbod_RegionId, Mbod_CentCostoId, Mbod_AlmModOrigen, Mbod_AlmOrigenCodigo, Mbod_BodOrigenCodigo, Mbod_AlmModDestino, Mbod_AlmDestinoCodigo, Mbod_BodDestinoCodigo, Mbod_Estado, Mbod_FechaCrea, Mbod_UsuarioCrea, Mbod_FechaModifica, Mbod_UsuarioModifica) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_RESTRICCIONES")
         ,new ForEachCursor("P00134", "SELECT Mbod_Id.CURRVAL FROM DUAL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("P00135", "SELECT Mbod_Id, Mbod_TipoMovCodigo, Mbod_RegionId, Mbod_CentCostoId, Mbod_AlmModOrigen, Mbod_AlmOrigenCodigo, Mbod_BodOrigenCodigo, Mbod_AlmModDestino, Mbod_AlmDestinoCodigo, Mbod_BodDestinoCodigo, Mbod_FechaModifica, Mbod_UsuarioModifica, Mbod_Estado FROM ALM_RESTRICCIONES WHERE Mbod_Id = ? ORDER BY Mbod_Id  FOR UPDATE OF Mbod_TipoMovCodigo, Mbod_RegionId, Mbod_CentCostoId, Mbod_AlmModOrigen, Mbod_AlmOrigenCodigo, Mbod_BodOrigenCodigo, Mbod_AlmModDestino, Mbod_AlmDestinoCodigo, Mbod_BodDestinoCodigo, Mbod_FechaModifica, Mbod_UsuarioModifica, Mbod_Estado NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P00136", "UPDATE ALM_RESTRICCIONES SET Mbod_TipoMovCodigo=?, Mbod_RegionId=?, Mbod_CentCostoId=?, Mbod_AlmModOrigen=?, Mbod_AlmOrigenCodigo=?, Mbod_BodOrigenCodigo=?, Mbod_AlmModDestino=?, Mbod_AlmDestinoCodigo=?, Mbod_BodDestinoCodigo=?, Mbod_FechaModifica=?, Mbod_UsuarioModifica=?, Mbod_Estado=?  WHERE Mbod_Id = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_RESTRICCIONES")
         ,new UpdateCursor("P00137", "UPDATE ALM_RESTRICCIONES SET Mbod_Estado='I'  WHERE Mbod_Id = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_RESTRICCIONES")
         ,new ForEachCursor("P00138", "SELECT Alma_Codigo, Alma_Descripcion, Cent_Id, Alma_Modulo FROM ALM_ALMACEN WHERE Alma_Codigo = ? ORDER BY Cent_Id, Alma_Modulo, Alma_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P00139", "SELECT Alma_Codigo, Alma_Descripcion, Cent_Id, Alma_Modulo FROM ALM_ALMACEN WHERE Alma_Codigo = ? ORDER BY Cent_Id, Alma_Modulo, Alma_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001310", "SELECT Bode_Codigo, Bode_Descripcion FROM ALM_BODEGA WHERE Bode_Codigo = ? ORDER BY Bode_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P001311", "SELECT Bode_Codigo, Bode_Descripcion FROM ALM_BODEGA WHERE Bode_Codigo = ? ORDER BY Bode_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(6) ;
               ((short[]) buf[9])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(9) ;
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((String[]) buf[19])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[20])[0] = rslt.getVarchar(14) ;
               ((String[]) buf[21])[0] = rslt.getVarchar(15) ;
               ((String[]) buf[22])[0] = rslt.getVarchar(16) ;
               ((String[]) buf[23])[0] = rslt.getVarchar(17) ;
               ((String[]) buf[24])[0] = rslt.getString(18, 1) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(11) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(12) ;
               ((String[]) buf[12])[0] = rslt.getString(13, 1) ;
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 9 :
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setVarchar(4, (String)parms[3], 8, false);
               stmt.setVarchar(5, (String)parms[4], 2, false);
               stmt.setVarchar(6, (String)parms[5], 3, false);
               stmt.setVarchar(7, (String)parms[6], 8, false);
               stmt.setVarchar(8, (String)parms[7], 2, false);
               stmt.setVarchar(9, (String)parms[8], 3, false);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setDateTime(11, (java.util.Date)parms[10], false);
               stmt.setVarchar(12, (String)parms[11], 30, false);
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setVarchar(4, (String)parms[3], 8, false);
               stmt.setVarchar(5, (String)parms[4], 2, false);
               stmt.setVarchar(6, (String)parms[5], 3, false);
               stmt.setVarchar(7, (String)parms[6], 8, false);
               stmt.setVarchar(8, (String)parms[7], 2, false);
               stmt.setVarchar(9, (String)parms[8], 3, false);
               stmt.setDateTime(10, (java.util.Date)parms[9], false);
               stmt.setVarchar(11, (String)parms[10], 30, false);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setLong(13, ((Number) parms[12]).longValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 2);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 2);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 3);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 3);
               return;
      }
   }

}

