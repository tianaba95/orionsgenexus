/*
               File: aptrascuen_impl
        Description: Reporte Traspaso Cuentadantes
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:8.74
       Program type: Main program
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class aptrascuen_impl extends GXWebReport
{
   public aptrascuen_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", com.genexus.util.Encryption.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(0)) ;
      }
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      if ( ! entryPointCalled )
      {
         AV38pTran_Id = GXutil.lval( gxfirstwebparm) ;
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.setDefaultTheme("Carmine");
      M_top = 0 ;
      M_bot = 6 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      add_metrics( ) ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      getPrinter().GxSetDocName("") ;
      try
      {
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 2, 5, 12240, 20160, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Execute user subroutine: 'INICIORREPORTE' */
         S111 ();
         if ( returnInSub )
         {
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h1U0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'INICIORREPORTE' Routine */
      /* Execute user subroutine: 'IMPENCABEZADO' */
      S121 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'IMPDETALLETRAN' */
      S131 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'IMPOBSERVACIONES' */
      S141 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'IMPTITULOS' */
      S151 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'BUSCADETALLEELEM' */
      S161 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'IMPTOTAL' */
      S171 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'IMPPIEPAGINA' */
      S181 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'IMPFIRMAS' */
      S191 ();
      if (returnInSub) return;
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'IMPENCABEZADO' Routine */
      /* Execute user subroutine: 'DATOSUSUARIO' */
      S201 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'DATOSTRANSACCION' */
      S211 ();
      if (returnInSub) return;
   }

   public void S201( ) throws ProcessInterruptedException
   {
      /* 'DATOSUSUARIO' Routine */
      AV94rUsuario = GXutil.upper( AV112websession.getValue("Usuario")) ;
   }

   public void S211( ) throws ProcessInterruptedException
   {
      /* 'DATOSTRANSACCION' Routine */
      /* Using cursor P001U2 */
      pr_default.execute(0, new Object[] {new Long(AV38pTran_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A416Tran_Observaciones = P001U2_A416Tran_Observaciones[0] ;
         n416Tran_Observaciones = P001U2_n416Tran_Observaciones[0] ;
         A50Tran_CentroCostoIdDestino = P001U2_A50Tran_CentroCostoIdDestino[0] ;
         n50Tran_CentroCostoIdDestino = P001U2_n50Tran_CentroCostoIdDestino[0] ;
         A57Tran_RegionId = P001U2_A57Tran_RegionId[0] ;
         n57Tran_RegionId = P001U2_n57Tran_RegionId[0] ;
         A518Tran_RegionIdDestino = P001U2_A518Tran_RegionIdDestino[0] ;
         n518Tran_RegionIdDestino = P001U2_n518Tran_RegionIdDestino[0] ;
         A46Tran_Id = P001U2_A46Tran_Id[0] ;
         A421Tran_RegionCodigo = P001U2_A421Tran_RegionCodigo[0] ;
         n421Tran_RegionCodigo = P001U2_n421Tran_RegionCodigo[0] ;
         A422Tran_RegionDescripcion = P001U2_A422Tran_RegionDescripcion[0] ;
         n422Tran_RegionDescripcion = P001U2_n422Tran_RegionDescripcion[0] ;
         A48Tran_CentroCostoId = P001U2_A48Tran_CentroCostoId[0] ;
         A419Tran_CentroCostoCodigo = P001U2_A419Tran_CentroCostoCodigo[0] ;
         n419Tran_CentroCostoCodigo = P001U2_n419Tran_CentroCostoCodigo[0] ;
         A420Tran_CentroCostoDescripcion = P001U2_A420Tran_CentroCostoDescripcion[0] ;
         n420Tran_CentroCostoDescripcion = P001U2_n420Tran_CentroCostoDescripcion[0] ;
         A49Tran_CodigoMovimiento = P001U2_A49Tran_CodigoMovimiento[0] ;
         A381Tran_DescripcionMovimiento = P001U2_A381Tran_DescripcionMovimiento[0] ;
         n381Tran_DescripcionMovimiento = P001U2_n381Tran_DescripcionMovimiento[0] ;
         A482Tran_TipoElemento = P001U2_A482Tran_TipoElemento[0] ;
         A481Tran_IndE_S = P001U2_A481Tran_IndE_S[0] ;
         n481Tran_IndE_S = P001U2_n481Tran_IndE_S[0] ;
         A513Tran_ConsecutivoCC = P001U2_A513Tran_ConsecutivoCC[0] ;
         n513Tran_ConsecutivoCC = P001U2_n513Tran_ConsecutivoCC[0] ;
         A55Tran_FechaRegistro = P001U2_A55Tran_FechaRegistro[0] ;
         A390Tran_FechaRatificacion = P001U2_A390Tran_FechaRatificacion[0] ;
         n390Tran_FechaRatificacion = P001U2_n390Tran_FechaRatificacion[0] ;
         A483Tran_ValorTransaccion = P001U2_A483Tran_ValorTransaccion[0] ;
         n483Tran_ValorTransaccion = P001U2_n483Tran_ValorTransaccion[0] ;
         A58Tran_Estado = P001U2_A58Tran_Estado[0] ;
         n58Tran_Estado = P001U2_n58Tran_Estado[0] ;
         A109Tran_CodAlmaOrigen = P001U2_A109Tran_CodAlmaOrigen[0] ;
         A110Tran_ModuloOrigen = P001U2_A110Tran_ModuloOrigen[0] ;
         A112Tran_CodBodeOrigen = P001U2_A112Tran_CodBodeOrigen[0] ;
         A51Tran_IdCuentadanteOrigen = P001U2_A51Tran_IdCuentadanteOrigen[0] ;
         n51Tran_IdCuentadanteOrigen = P001U2_n51Tran_IdCuentadanteOrigen[0] ;
         A53Tran_IdProveedor = P001U2_A53Tran_IdProveedor[0] ;
         n53Tran_IdProveedor = P001U2_n53Tran_IdProveedor[0] ;
         A703Tran_CedulaProveedor = P001U2_A703Tran_CedulaProveedor[0] ;
         n703Tran_CedulaProveedor = P001U2_n703Tran_CedulaProveedor[0] ;
         A575Tran_NombreProveedor = P001U2_A575Tran_NombreProveedor[0] ;
         n575Tran_NombreProveedor = P001U2_n575Tran_NombreProveedor[0] ;
         A111Tran_CodAlmaDestino = P001U2_A111Tran_CodAlmaDestino[0] ;
         A385Tran_ModuloDestino = P001U2_A385Tran_ModuloDestino[0] ;
         A387Tran_CodBodeDestino = P001U2_A387Tran_CodBodeDestino[0] ;
         A52Tran_IdCuentadanteDestino = P001U2_A52Tran_IdCuentadanteDestino[0] ;
         n52Tran_IdCuentadanteDestino = P001U2_n52Tran_IdCuentadanteDestino[0] ;
         A519Tran_RegionCodigoDestino = P001U2_A519Tran_RegionCodigoDestino[0] ;
         n519Tran_RegionCodigoDestino = P001U2_n519Tran_RegionCodigoDestino[0] ;
         A516Tran_CentroCostoCodigoDestino = P001U2_A516Tran_CentroCostoCodigoDestino[0] ;
         n516Tran_CentroCostoCodigoDestino = P001U2_n516Tran_CentroCostoCodigoDestino[0] ;
         A517Tran_CentroCostoDescripcionDes = P001U2_A517Tran_CentroCostoDescripcionDes[0] ;
         n517Tran_CentroCostoDescripcionDes = P001U2_n517Tran_CentroCostoDescripcionDes[0] ;
         A516Tran_CentroCostoCodigoDestino = P001U2_A516Tran_CentroCostoCodigoDestino[0] ;
         n516Tran_CentroCostoCodigoDestino = P001U2_n516Tran_CentroCostoCodigoDestino[0] ;
         A517Tran_CentroCostoDescripcionDes = P001U2_A517Tran_CentroCostoDescripcionDes[0] ;
         n517Tran_CentroCostoDescripcionDes = P001U2_n517Tran_CentroCostoDescripcionDes[0] ;
         A421Tran_RegionCodigo = P001U2_A421Tran_RegionCodigo[0] ;
         n421Tran_RegionCodigo = P001U2_n421Tran_RegionCodigo[0] ;
         A422Tran_RegionDescripcion = P001U2_A422Tran_RegionDescripcion[0] ;
         n422Tran_RegionDescripcion = P001U2_n422Tran_RegionDescripcion[0] ;
         A519Tran_RegionCodigoDestino = P001U2_A519Tran_RegionCodigoDestino[0] ;
         n519Tran_RegionCodigoDestino = P001U2_n519Tran_RegionCodigoDestino[0] ;
         A419Tran_CentroCostoCodigo = P001U2_A419Tran_CentroCostoCodigo[0] ;
         n419Tran_CentroCostoCodigo = P001U2_n419Tran_CentroCostoCodigo[0] ;
         A420Tran_CentroCostoDescripcion = P001U2_A420Tran_CentroCostoDescripcion[0] ;
         n420Tran_CentroCostoDescripcion = P001U2_n420Tran_CentroCostoDescripcion[0] ;
         A381Tran_DescripcionMovimiento = P001U2_A381Tran_DescripcionMovimiento[0] ;
         n381Tran_DescripcionMovimiento = P001U2_n381Tran_DescripcionMovimiento[0] ;
         A703Tran_CedulaProveedor = P001U2_A703Tran_CedulaProveedor[0] ;
         n703Tran_CedulaProveedor = P001U2_n703Tran_CedulaProveedor[0] ;
         A575Tran_NombreProveedor = P001U2_A575Tran_NombreProveedor[0] ;
         n575Tran_NombreProveedor = P001U2_n575Tran_NombreProveedor[0] ;
         AV90rTran_RegionCodigo = A421Tran_RegionCodigo ;
         AV91rTran_RegionDescripcion = GXutil.concat( GXutil.str( AV90rTran_RegionCodigo, 4, 0), A422Tran_RegionDescripcion, ". ") ;
         AV22Cent_Id = A48Tran_CentroCostoId ;
         AV70rTran_CentroCostoCodigo = A419Tran_CentroCostoCodigo ;
         AV72RTran_CentroCostoDescripcion = A420Tran_CentroCostoDescripcion ;
         AV77rTran_CodigoMovimiento = A49Tran_CodigoMovimiento ;
         AV81rTran_DescripcionMovimiento = GXutil.upper( A381Tran_DescripcionMovimiento) ;
         AV110Tran_TipoElemento = A482Tran_TipoElemento ;
         AV108Tran_IndE_S = A481Tran_IndE_S ;
         AV78rTran_ConsecutivoCC = A513Tran_ConsecutivoCC ;
         AV85rTran_FechaRegistro = A55Tran_FechaRegistro ;
         AV84rTran_FechaRatificacion = A390Tran_FechaRatificacion ;
         AV111Tran_ValorTransaccion = A483Tran_ValorTransaccion ;
         AV113Tran_Estado = A58Tran_Estado ;
         if ( GXutil.strcmp(AV113Tran_Estado, "A") == 0 )
         {
            AV82rTran_Estado = "ANULADA" ;
         }
         else if ( GXutil.strcmp(AV113Tran_Estado, "R") == 0 )
         {
            AV82rTran_Estado = "RATIFICADA" ;
         }
         else if ( GXutil.strcmp(AV113Tran_Estado, "P") == 0 )
         {
            AV82rTran_Estado = "PENDIENTE" ;
         }
         else if ( GXutil.strcmp(AV113Tran_Estado, "I") == 0 )
         {
            AV82rTran_Estado = "INCOMPLETA" ;
         }
         AV74rTran_CodAlmaOrigen = A109Tran_CodAlmaOrigen ;
         AV12Alma_Codigo = AV74rTran_CodAlmaOrigen ;
         AV14Alma_Modulo = A110Tran_ModuloOrigen ;
         /* Execute user subroutine: 'DATOSALMACEN' */
         S223 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         AV80rTran_DescpAlmaOrigen = AV13Alma_Descripcion ;
         AV76rTran_CodBodeOrigen = A112Tran_CodBodeOrigen ;
         AV17Bode_Codigo = AV76rTran_CodBodeOrigen ;
         /* Execute user subroutine: 'DATOSBODEGAAREA' */
         S233 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         AV42rBArea_CodigoOrigen = AV16BArea_Codigo ;
         AV44rBArea_DescripcionOrigen = AV8BArea_Descripcion ;
         if ( GXutil.strcmp(AV108Tran_IndE_S, "E") != 0 )
         {
            AV87rTran_IdCuentadanteOrigen = A51Tran_IdCuentadanteOrigen ;
            AV26Cuen_Identificacion = AV87rTran_IdCuentadanteOrigen ;
            /* Execute user subroutine: 'DATOSCUENTADANTE' */
            S243 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               if (true) return;
            }
            AV48rCuen_CedulaOrigen = AV25Cuen_Cedula ;
            AV50rCuen_NombreOrigen = AV27Cuen_Nombre ;
         }
         else
         {
            AV87rTran_IdCuentadanteOrigen = A53Tran_IdProveedor ;
            AV48rCuen_CedulaOrigen = A703Tran_CedulaProveedor ;
            AV50rCuen_NombreOrigen = A575Tran_NombreProveedor ;
         }
         AV9rTran_CodAlmaDestino = A111Tran_CodAlmaDestino ;
         AV12Alma_Codigo = AV9rTran_CodAlmaDestino ;
         AV14Alma_Modulo = A385Tran_ModuloDestino ;
         /* Execute user subroutine: 'DATOSALMACEN' */
         S223 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         AV79rTran_DescpAlmaDestino = AV13Alma_Descripcion ;
         AV75rTran_CodBodeDestino = A387Tran_CodBodeDestino ;
         AV17Bode_Codigo = AV75rTran_CodBodeDestino ;
         /* Execute user subroutine: 'DATOSBODEGAAREA' */
         S233 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         AV41rBArea_CodigoDestino = AV16BArea_Codigo ;
         AV43rBArea_DescripcionDestino = AV8BArea_Descripcion ;
         AV86rTran_IdCuentadanteDestino = A52Tran_IdCuentadanteDestino ;
         AV26Cuen_Identificacion = AV86rTran_IdCuentadanteDestino ;
         /* Execute user subroutine: 'DATOSCUENTADANTE' */
         S243 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         AV47rCuen_CedulaDestino = AV25Cuen_Cedula ;
         AV49rCuen_NombreDestino = AV27Cuen_Nombre ;
         AV109Tran_Observaciones = A416Tran_Observaciones ;
         AV11rTran_RegionCodigoDestino = A519Tran_RegionCodigoDestino ;
         AV71rTran_CentroCostoCodigoDestino = A516Tran_CentroCostoCodigoDestino ;
         AV73rTran_CentroCostoDescripcionDestino = A517Tran_CentroCostoDescripcionDes ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
   }

   public void S223( ) throws ProcessInterruptedException
   {
      /* 'DATOSALMACEN' Routine */
      /* Using cursor P001U3 */
      pr_default.execute(1, new Object[] {new Long(AV22Cent_Id), AV14Alma_Modulo, AV12Alma_Codigo});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A28Alma_Codigo = P001U3_A28Alma_Codigo[0] ;
         A27Alma_Modulo = P001U3_A27Alma_Modulo[0] ;
         A1Cent_Id = P001U3_A1Cent_Id[0] ;
         A252Alma_Descripcion = P001U3_A252Alma_Descripcion[0] ;
         AV13Alma_Descripcion = GXutil.upper( A252Alma_Descripcion) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void S233( ) throws ProcessInterruptedException
   {
      /* 'DATOSBODEGAAREA' Routine */
      /* Using cursor P001U4 */
      pr_default.execute(2, new Object[] {new Long(AV22Cent_Id), AV14Alma_Modulo, AV12Alma_Codigo, AV17Bode_Codigo});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A31Bode_Codigo = P001U4_A31Bode_Codigo[0] ;
         A28Alma_Codigo = P001U4_A28Alma_Codigo[0] ;
         A27Alma_Modulo = P001U4_A27Alma_Modulo[0] ;
         A1Cent_Id = P001U4_A1Cent_Id[0] ;
         A32BArea_Codigo = P001U4_A32BArea_Codigo[0] ;
         n32BArea_Codigo = P001U4_n32BArea_Codigo[0] ;
         A695BBode_Descripcion = P001U4_A695BBode_Descripcion[0] ;
         AV16BArea_Codigo = A32BArea_Codigo ;
         AV8BArea_Descripcion = A695BBode_Descripcion ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void S243( ) throws ProcessInterruptedException
   {
      /* 'DATOSCUENTADANTE' Routine */
      /* Using cursor P001U5 */
      pr_default.execute(3, new Object[] {new Long(AV26Cuen_Identificacion)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A43Cuen_Identificacion = P001U5_A43Cuen_Identificacion[0] ;
         A688Cuen_Cedula = P001U5_A688Cuen_Cedula[0] ;
         A44Cuen_Nombre = P001U5_A44Cuen_Nombre[0] ;
         n44Cuen_Nombre = P001U5_n44Cuen_Nombre[0] ;
         AV25Cuen_Cedula = A688Cuen_Cedula ;
         AV27Cuen_Nombre = GXutil.upper( A44Cuen_Nombre) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'IMPDETALLETRAN' Routine */
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'IMPOBSERVACIONES' Routine */
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'IMPTITULOS' Routine */
   }

   public void S161( ) throws ProcessInterruptedException
   {
      /* 'BUSCADETALLEELEM' Routine */
      AV114NumItem = (short)(0) ;
      /* Using cursor P001U6 */
      pr_default.execute(4, new Object[] {new Long(AV38pTran_Id)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A66Elem_Consecutivo = P001U6_A66Elem_Consecutivo[0] ;
         A37Cata_Codigo = P001U6_A37Cata_Codigo[0] ;
         A34Clas_Codigo = P001U6_A34Clas_Codigo[0] ;
         A35FAM_Codigo = P001U6_A35FAM_Codigo[0] ;
         A46Tran_Id = P001U6_A46Tran_Id[0] ;
         A75SEG_Codigo = P001U6_A75SEG_Codigo[0] ;
         A37Cata_Codigo = P001U6_A37Cata_Codigo[0] ;
         A34Clas_Codigo = P001U6_A34Clas_Codigo[0] ;
         A35FAM_Codigo = P001U6_A35FAM_Codigo[0] ;
         A75SEG_Codigo = P001U6_A75SEG_Codigo[0] ;
         AV96SEG_Codigo = A75SEG_Codigo ;
         /* Execute user subroutine: 'IMPDETALLE' */
         S2510 ();
         if ( returnInSub )
         {
            pr_default.close(4);
            pr_default.close(4);
            pr_default.close(4);
            pr_default.close(4);
            pr_default.close(4);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         h1U0( false, 17) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText("Total Grupo", 1175, Gx_line+0, 1246, Gx_line+14, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68rTotalGrupo, "")), 1275, Gx_line+0, 1370, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+17) ;
         AV68rTotalGrupo = "" ;
         AV105TotalGrupo = DecimalUtil.ZERO ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S2510( ) throws ProcessInterruptedException
   {
      /* 'IMPDETALLE' Routine */
      /* Using cursor P001U7 */
      pr_default.execute(5, new Object[] {new Long(AV38pTran_Id), AV96SEG_Codigo});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A37Cata_Codigo = P001U7_A37Cata_Codigo[0] ;
         A34Clas_Codigo = P001U7_A34Clas_Codigo[0] ;
         A35FAM_Codigo = P001U7_A35FAM_Codigo[0] ;
         A75SEG_Codigo = P001U7_A75SEG_Codigo[0] ;
         A46Tran_Id = P001U7_A46Tran_Id[0] ;
         A33Tipo_Codigo = P001U7_A33Tipo_Codigo[0] ;
         A298Cata_Descripcion = P001U7_A298Cata_Descripcion[0] ;
         A66Elem_Consecutivo = P001U7_A66Elem_Consecutivo[0] ;
         A557Elem_Descripcion = P001U7_A557Elem_Descripcion[0] ;
         A490TDet_PlacaNumero = P001U7_A490TDet_PlacaNumero[0] ;
         n490TDet_PlacaNumero = P001U7_n490TDet_PlacaNumero[0] ;
         A491TDet_PlacaPadre = P001U7_A491TDet_PlacaPadre[0] ;
         n491TDet_PlacaPadre = P001U7_n491TDet_PlacaPadre[0] ;
         A77UNIMED_COD = P001U7_A77UNIMED_COD[0] ;
         A487TDet_Cantidad = P001U7_A487TDet_Cantidad[0] ;
         A489TDet_ValorTotal = P001U7_A489TDet_ValorTotal[0] ;
         A488TDet_ValorUnitario = P001U7_A488TDet_ValorUnitario[0] ;
         A657TDet_Otros_Costos = P001U7_A657TDet_Otros_Costos[0] ;
         n657TDet_Otros_Costos = P001U7_n657TDet_Otros_Costos[0] ;
         A653TDet_Valor_Presente = P001U7_A653TDet_Valor_Presente[0] ;
         n653TDet_Valor_Presente = P001U7_n653TDet_Valor_Presente[0] ;
         A69TDet_Consecutivo = P001U7_A69TDet_Consecutivo[0] ;
         A37Cata_Codigo = P001U7_A37Cata_Codigo[0] ;
         A33Tipo_Codigo = P001U7_A33Tipo_Codigo[0] ;
         A557Elem_Descripcion = P001U7_A557Elem_Descripcion[0] ;
         A77UNIMED_COD = P001U7_A77UNIMED_COD[0] ;
         A34Clas_Codigo = P001U7_A34Clas_Codigo[0] ;
         A298Cata_Descripcion = P001U7_A298Cata_Descripcion[0] ;
         A35FAM_Codigo = P001U7_A35FAM_Codigo[0] ;
         A75SEG_Codigo = P001U7_A75SEG_Codigo[0] ;
         AV114NumItem = (short)(AV114NumItem+1) ;
         AV56rSEG_Codigo = A75SEG_Codigo ;
         AV116rTipo_Codigo = A33Tipo_Codigo ;
         AV21Cata_Descripcion = A298Cata_Descripcion ;
         AV52rElem_Consecutivo = A66Elem_Consecutivo ;
         AV97TDet_Consecutivo = A69TDet_Consecutivo ;
         AV28Elem_Descripcion = A557Elem_Descripcion ;
         AV51rDescripcion = GXutil.concat( AV21Cata_Descripcion, AV28Elem_Descripcion, " >>") ;
         AV59rTDet_PlacaNumero = A490TDet_PlacaNumero ;
         AV60rTDet_PlacaPadre = A491TDet_PlacaPadre ;
         if ( GXutil.strcmp(AV108Tran_IndE_S, "E") != 0 )
         {
            if ( GXutil.strcmp(AV110Tran_TipoElemento, "D") == 0 )
            {
               /* Execute user subroutine: 'BUSCARENTRADADEVOLUTIVO' */
               S2611 ();
               if ( returnInSub )
               {
                  pr_default.close(5);
                  pr_default.close(5);
                  pr_default.close(5);
                  pr_default.close(5);
                  pr_default.close(5);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  if (true) return;
               }
            }
            if ( GXutil.strcmp(AV110Tran_TipoElemento, "C") == 0 )
            {
               /* Execute user subroutine: 'BUSCARENTRADACONSUMO' */
               S2711 ();
               if ( returnInSub )
               {
                  pr_default.close(5);
                  pr_default.close(5);
                  pr_default.close(5);
                  pr_default.close(5);
                  pr_default.close(5);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else
         {
            AV30eTran_Id = AV38pTran_Id ;
            AV29eTDet_Consecutivo = AV97TDet_Consecutivo ;
            /* Execute user subroutine: 'BUSCARATRIBUTOS' */
            S2811 ();
            if ( returnInSub )
            {
               pr_default.close(5);
               pr_default.close(5);
               pr_default.close(5);
               pr_default.close(5);
               pr_default.close(5);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               if (true) return;
            }
         }
         AV93rUNIMED_COD = A77UNIMED_COD ;
         AV57rTDet_Cantidad = A487TDet_Cantidad ;
         AV100TDet_ValorTotal = A489TDet_ValorTotal ;
         AV101TDet_ValorUnitario = A488TDet_ValorUnitario ;
         AV98TDet_Otros_Costos = A657TDet_Otros_Costos ;
         AV99TDet_Valor_Presente = A653TDet_Valor_Presente ;
         AV62rTDet_ValorTotal = GXutil.concat( "$", GXutil.trim( localUtil.format( AV100TDet_ValorTotal, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), " ") ;
         AV63rTDet_ValorUnitario = GXutil.concat( "$", GXutil.trim( localUtil.format( AV101TDet_ValorUnitario, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), " ") ;
         AV58rTDet_Otros_Costos = GXutil.concat( "$", GXutil.trim( localUtil.format( AV98TDet_Otros_Costos, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), " ") ;
         AV61rTDet_Valor_Presente = GXutil.concat( "$", GXutil.trim( localUtil.format( AV99TDet_Valor_Presente, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), " ") ;
         AV105TotalGrupo = AV105TotalGrupo.add(A489TDet_ValorTotal) ;
         AV68rTotalGrupo = GXutil.concat( "$", GXutil.trim( localUtil.format( AV105TotalGrupo, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), " ") ;
         h1U0( false, 88) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56rSEG_Codigo, "")), 50, Gx_line+0, 77, Gx_line+14, 1, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52rElem_Consecutivo, "")), 92, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59rTDet_PlacaNumero, "")), 417, Gx_line+0, 509, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51rDescripcion, "")), 135, Gx_line+0, 410, Gx_line+83, 0+16, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV93rUNIMED_COD), "ZZZZZ9")), 883, Gx_line+0, 922, Gx_line+15, 1+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62rTDet_ValorTotal, "")), 1275, Gx_line+0, 1370, Gx_line+15, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63rTDet_ValorUnitario, "")), 967, Gx_line+0, 1062, Gx_line+15, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40rAtributos, "")), 608, Gx_line+0, 883, Gx_line+83, 0+16, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60rTDet_PlacaPadre, "")), 508, Gx_line+0, 608, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69rTran_Abreviado, "")), 417, Gx_line+33, 452, Gx_line+48, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88rTran_NumeroIngreso, "")), 467, Gx_line+33, 520, Gx_line+48, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83rTran_FechaIngreso, "")), 533, Gx_line+33, 586, Gx_line+48, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10rTran_NombreProveedor, "@!")), 417, Gx_line+50, 592, Gx_line+83, 0+16, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV57rTDet_Cantidad), "ZZZZZZZZZ9")), 917, Gx_line+0, 958, Gx_line+15, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58rTDet_Otros_Costos, "")), 1079, Gx_line+0, 1174, Gx_line+15, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61rTDet_Valor_Presente, "")), 1165, Gx_line+0, 1260, Gx_line+15, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV114NumItem), "ZZ9")), 4, Gx_line+0, 21, Gx_line+15, 1, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV116rTipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")), 25, Gx_line+0, 52, Gx_line+14, 1, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+88) ;
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void S2611( ) throws ProcessInterruptedException
   {
      /* 'BUSCARENTRADADEVOLUTIVO' Routine */
      /* Using cursor P001U8 */
      pr_default.execute(6, new Object[] {new Boolean(n490TDet_PlacaNumero), A490TDet_PlacaNumero});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A490TDet_PlacaNumero = P001U8_A490TDet_PlacaNumero[0] ;
         n490TDet_PlacaNumero = P001U8_n490TDet_PlacaNumero[0] ;
         A481Tran_IndE_S = P001U8_A481Tran_IndE_S[0] ;
         n481Tran_IndE_S = P001U8_n481Tran_IndE_S[0] ;
         A46Tran_Id = P001U8_A46Tran_Id[0] ;
         A69TDet_Consecutivo = P001U8_A69TDet_Consecutivo[0] ;
         A481Tran_IndE_S = P001U8_A481Tran_IndE_S[0] ;
         n481Tran_IndE_S = P001U8_n481Tran_IndE_S[0] ;
         AV30eTran_Id = A46Tran_Id ;
         AV29eTDet_Consecutivo = A69TDet_Consecutivo ;
         /* Execute user subroutine: 'BUSCARATRIBUTOS' */
         S2811 ();
         if ( returnInSub )
         {
            pr_default.close(6);
            pr_default.close(6);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void S2711( ) throws ProcessInterruptedException
   {
      /* 'BUSCARENTRADACONSUMO' Routine */
      /* Using cursor P001U9 */
      pr_default.execute(7, new Object[] {new Long(AV38pTran_Id), new Long(AV97TDet_Consecutivo)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A69TDet_Consecutivo = P001U9_A69TDet_Consecutivo[0] ;
         A46Tran_Id = P001U9_A46Tran_Id[0] ;
         A71Tran_Entrada = P001U9_A71Tran_Entrada[0] ;
         A72Nro_Linea = P001U9_A72Nro_Linea[0] ;
         AV30eTran_Id = A71Tran_Entrada ;
         AV29eTDet_Consecutivo = A72Nro_Linea ;
         /* Execute user subroutine: 'BUSCARATRIBUTOS' */
         S2811 ();
         if ( returnInSub )
         {
            pr_default.close(7);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void S2811( ) throws ProcessInterruptedException
   {
      /* 'BUSCARATRIBUTOS' Routine */
      AV40rAtributos = "" ;
      /* Using cursor P001U10 */
      pr_default.execute(8, new Object[] {new Long(AV30eTran_Id), new Long(AV29eTDet_Consecutivo)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A70TDet_ListId = P001U10_A70TDet_ListId[0] ;
         A69TDet_Consecutivo = P001U10_A69TDet_Consecutivo[0] ;
         A46Tran_Id = P001U10_A46Tran_Id[0] ;
         A494TDet_ValorAtributo = P001U10_A494TDet_ValorAtributo[0] ;
         A492TDet_ListDescripcion = P001U10_A492TDet_ListDescripcion[0] ;
         n492TDet_ListDescripcion = P001U10_n492TDet_ListDescripcion[0] ;
         A492TDet_ListDescripcion = P001U10_A492TDet_ListDescripcion[0] ;
         n492TDet_ListDescripcion = P001U10_n492TDet_ListDescripcion[0] ;
         AV40rAtributos = AV40rAtributos + GXutil.upper( A492TDet_ListDescripcion) + ":" + GXutil.upper( A494TDet_ValorAtributo) + " " ;
         pr_default.readNext(8);
      }
      pr_default.close(8);
      AV69rTran_Abreviado = "" ;
      AV88rTran_NumeroIngreso = "" ;
      AV83rTran_FechaIngreso = "" ;
      AV10rTran_NombreProveedor = "" ;
      /* Using cursor P001U11 */
      pr_default.execute(9, new Object[] {new Long(AV30eTran_Id)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A53Tran_IdProveedor = P001U11_A53Tran_IdProveedor[0] ;
         n53Tran_IdProveedor = P001U11_n53Tran_IdProveedor[0] ;
         A54Tran_TipoIngreso = P001U11_A54Tran_TipoIngreso[0] ;
         n54Tran_TipoIngreso = P001U11_n54Tran_TipoIngreso[0] ;
         A46Tran_Id = P001U11_A46Tran_Id[0] ;
         A756Tran_Abreviado = P001U11_A756Tran_Abreviado[0] ;
         n756Tran_Abreviado = P001U11_n756Tran_Abreviado[0] ;
         A514Tran_NumeroIngreso = P001U11_A514Tran_NumeroIngreso[0] ;
         n514Tran_NumeroIngreso = P001U11_n514Tran_NumeroIngreso[0] ;
         A515Tran_FechaIngreso = P001U11_A515Tran_FechaIngreso[0] ;
         n515Tran_FechaIngreso = P001U11_n515Tran_FechaIngreso[0] ;
         A575Tran_NombreProveedor = P001U11_A575Tran_NombreProveedor[0] ;
         n575Tran_NombreProveedor = P001U11_n575Tran_NombreProveedor[0] ;
         A575Tran_NombreProveedor = P001U11_A575Tran_NombreProveedor[0] ;
         n575Tran_NombreProveedor = P001U11_n575Tran_NombreProveedor[0] ;
         A756Tran_Abreviado = P001U11_A756Tran_Abreviado[0] ;
         n756Tran_Abreviado = P001U11_n756Tran_Abreviado[0] ;
         AV69rTran_Abreviado = A756Tran_Abreviado ;
         AV88rTran_NumeroIngreso = GXutil.trim( A514Tran_NumeroIngreso) ;
         if ( GXutil.day( A515Tran_FechaIngreso) == 0 )
         {
            AV83rTran_FechaIngreso = "" ;
         }
         else
         {
            AV83rTran_FechaIngreso = GXutil.trim( GXutil.str( GXutil.day( A515Tran_FechaIngreso), 10, 0)) + "/" + GXutil.trim( GXutil.str( GXutil.month( A515Tran_FechaIngreso), 10, 0)) + "/" + GXutil.trim( GXutil.str( GXutil.year( A515Tran_FechaIngreso), 10, 0)) ;
         }
         AV10rTran_NombreProveedor = A575Tran_NombreProveedor ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   public void S171( ) throws ProcessInterruptedException
   {
      /* 'IMPTOTAL' Routine */
      GXv_decimal1[0] = AV111Tran_ValorTransaccion ;
      GXv_char2[0] = AV95rValorLetras ;
      new com.orions2.pnumlet(remoteHandle, context).execute( GXv_decimal1, GXv_char2) ;
      aptrascuen_impl.this.AV111Tran_ValorTransaccion = GXv_decimal1[0] ;
      aptrascuen_impl.this.AV95rValorLetras = GXv_char2[0] ;
      AV92rTran_ValorTransaccion = GXutil.concat( "$", GXutil.trim( localUtil.format( AV111Tran_ValorTransaccion, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), " ") ;
      AV95rValorLetras = GXutil.concat( "SON", AV95rValorLetras, ": ") ;
      h1U0( false, 23) ;
      getPrinter().GxDrawLine(0, Gx_line+0, 1383, Gx_line+0, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(0, Gx_line+0, 1383, Gx_line+0, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(0, Gx_line+17, 1383, Gx_line+17, 1, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92rTran_ValorTransaccion, "")), 1275, Gx_line+0, 1370, Gx_line+15, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV95rValorLetras, "")), 17, Gx_line+0, 1042, Gx_line+15, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+23) ;
   }

   public void S181( ) throws ProcessInterruptedException
   {
      /* 'IMPPIEPAGINA' Routine */
      AV36PiePagina = "RESPONDO ADMINISTRATIVAMENTE Y FISCALMENTE POR LOS BIENES AQUÍ RELACIONADOS Y RENDIRÉ " + "CUENTA DE SU UTILIZACIÓN, TODO ELLO SEGÚN LO DISPUESTO SOBRE ESTE PARTICULAR EN LA CONSTITUCIÓN " + "NACIONAL Y EN ESPECIAL LO ESTABLECIDO EN EL NUMERAL 16 DEL ARTICULO 40 DE LA LEY 200 DE 1995. " ;
      h1U0( false, 74) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36PiePagina, "")), 242, Gx_line+17, 1159, Gx_line+67, 1+16, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+74) ;
   }

   public void S191( ) throws ProcessInterruptedException
   {
      /* 'IMPFIRMAS' Routine */
      /* Execute user subroutine: 'BUSCAFIRMAS' */
      S291 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'BUSCARALMACENISTA' */
      S301 ();
      if (returnInSub) return;
      if ( ( GXutil.strcmp(AV107Tpmo_ImprimeOrigen, "SI") == 0 ) && ( GXutil.strcmp(AV106Tpmo_ImprimeDestino, "SI") == 0 ) && ( GXutil.strcmp(AV104Tmpo_ImprimeResponsable, "SI") == 0 ) )
      {
         AV35NumeroFirma = (short)(3) ;
      }
      else if ( ( GXutil.strcmp(AV107Tpmo_ImprimeOrigen, "NO") == 0 ) && ( GXutil.strcmp(AV106Tpmo_ImprimeDestino, "SI") == 0 ) && ( GXutil.strcmp(AV104Tmpo_ImprimeResponsable, "SI") == 0 ) )
      {
         AV35NumeroFirma = (short)(2) ;
      }
      else if ( ( GXutil.strcmp(AV107Tpmo_ImprimeOrigen, "SI") == 0 ) && ( GXutil.strcmp(AV106Tpmo_ImprimeDestino, "NO") == 0 ) && ( GXutil.strcmp(AV104Tmpo_ImprimeResponsable, "SI") == 0 ) )
      {
         AV35NumeroFirma = (short)(2) ;
      }
      else if ( ( GXutil.strcmp(AV107Tpmo_ImprimeOrigen, "SI") == 0 ) && ( GXutil.strcmp(AV106Tpmo_ImprimeDestino, "SI") == 0 ) && ( GXutil.strcmp(AV104Tmpo_ImprimeResponsable, "NO") == 0 ) )
      {
         AV35NumeroFirma = (short)(2) ;
      }
      else if ( ( GXutil.strcmp(AV107Tpmo_ImprimeOrigen, "SI") == 0 ) && ( GXutil.strcmp(AV106Tpmo_ImprimeDestino, "NO") == 0 ) && ( GXutil.strcmp(AV104Tmpo_ImprimeResponsable, "NO") == 0 ) )
      {
         AV35NumeroFirma = (short)(1) ;
      }
      else if ( ( GXutil.strcmp(AV107Tpmo_ImprimeOrigen, "NO") == 0 ) && ( GXutil.strcmp(AV106Tpmo_ImprimeDestino, "SI") == 0 ) && ( GXutil.strcmp(AV104Tmpo_ImprimeResponsable, "NO") == 0 ) )
      {
         AV35NumeroFirma = (short)(1) ;
      }
      else if ( ( GXutil.strcmp(AV107Tpmo_ImprimeOrigen, "NO") == 0 ) && ( GXutil.strcmp(AV106Tpmo_ImprimeDestino, "NO") == 0 ) && ( GXutil.strcmp(AV104Tmpo_ImprimeResponsable, "SI") == 0 ) )
      {
         AV35NumeroFirma = (short)(1) ;
      }
      if ( AV35NumeroFirma == 3 )
      {
         AV65rTipoFirma1 = "ALMACENISTA" ;
         AV53rNombreFirma1 = GXutil.trim( GXutil.upper( AV15Alma_NombreResponsable)) ;
         AV66rTipoFirma2 = "CUENTADANTE ORIGEN" ;
         AV54rNombreFirma2 = GXutil.trim( GXutil.upper( AV50rCuen_NombreOrigen)) ;
         AV67rTipoFirma3 = "CUENTADANTE DESTINO" ;
         AV55rNombreFirma3 = GXutil.trim( GXutil.upper( AV49rCuen_NombreDestino)) ;
         h1U0( false, 115) ;
         getPrinter().GxDrawLine(33, Gx_line+83, 266, Gx_line+83, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(358, Gx_line+83, 591, Gx_line+83, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(683, Gx_line+83, 916, Gx_line+83, 1, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55rNombreFirma3, "")), 683, Gx_line+83, 916, Gx_line+98, 1, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54rNombreFirma2, "")), 358, Gx_line+83, 591, Gx_line+98, 1, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53rNombreFirma1, "")), 33, Gx_line+83, 266, Gx_line+98, 1, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67rTipoFirma3, "")), 683, Gx_line+100, 916, Gx_line+115, 1, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66rTipoFirma2, "")), 358, Gx_line+100, 591, Gx_line+115, 1, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65rTipoFirma1, "")), 33, Gx_line+100, 266, Gx_line+115, 1, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+115) ;
      }
      else if ( AV35NumeroFirma == 2 )
      {
         if ( ( GXutil.strcmp(AV104Tmpo_ImprimeResponsable, "SI") == 0 ) && ( GXutil.strcmp(AV107Tpmo_ImprimeOrigen, "SI") == 0 ) && ( GXutil.strcmp(AV106Tpmo_ImprimeDestino, "NO") == 0 ) )
         {
            AV65rTipoFirma1 = "ALMACENISTA" ;
            AV53rNombreFirma1 = GXutil.trim( GXutil.upper( AV15Alma_NombreResponsable)) ;
            AV66rTipoFirma2 = "CUENTADANTE ORIGEN" ;
            AV54rNombreFirma2 = GXutil.trim( GXutil.upper( AV50rCuen_NombreOrigen)) ;
         }
         else if ( ( GXutil.strcmp(AV104Tmpo_ImprimeResponsable, "NO") == 0 ) && ( GXutil.strcmp(AV107Tpmo_ImprimeOrigen, "SI") == 0 ) && ( GXutil.strcmp(AV106Tpmo_ImprimeDestino, "SI") == 0 ) )
         {
            AV65rTipoFirma1 = "CUENTADANTE ORIGEN" ;
            AV53rNombreFirma1 = GXutil.trim( GXutil.upper( AV50rCuen_NombreOrigen)) ;
            AV66rTipoFirma2 = "CUENTADANTE DESTINO" ;
            AV54rNombreFirma2 = GXutil.trim( GXutil.upper( AV49rCuen_NombreDestino)) ;
         }
         else if ( ( GXutil.strcmp(AV104Tmpo_ImprimeResponsable, "SI") == 0 ) && ( GXutil.strcmp(AV107Tpmo_ImprimeOrigen, "NO") == 0 ) && ( GXutil.strcmp(AV106Tpmo_ImprimeDestino, "SI") == 0 ) )
         {
            AV65rTipoFirma1 = "ALMACENISTA" ;
            AV53rNombreFirma1 = GXutil.trim( GXutil.upper( AV15Alma_NombreResponsable)) ;
            AV66rTipoFirma2 = "CUENTADANTE DESTINO" ;
            AV54rNombreFirma2 = GXutil.trim( GXutil.upper( AV49rCuen_NombreDestino)) ;
         }
         h1U0( false, 115) ;
         getPrinter().GxDrawLine(375, Gx_line+83, 608, Gx_line+83, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(42, Gx_line+83, 275, Gx_line+83, 1, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65rTipoFirma1, "")), 42, Gx_line+100, 275, Gx_line+115, 1, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66rTipoFirma2, "")), 375, Gx_line+100, 608, Gx_line+115, 1, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53rNombreFirma1, "")), 42, Gx_line+83, 275, Gx_line+98, 1, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54rNombreFirma2, "")), 375, Gx_line+83, 608, Gx_line+98, 1, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+115) ;
      }
      else if ( AV35NumeroFirma == 1 )
      {
         if ( GXutil.strcmp(AV104Tmpo_ImprimeResponsable, "SI") == 0 )
         {
            AV65rTipoFirma1 = "ALMACENISTA" ;
            AV53rNombreFirma1 = GXutil.trim( GXutil.upper( AV15Alma_NombreResponsable)) ;
         }
         else if ( GXutil.strcmp(AV107Tpmo_ImprimeOrigen, "SI") == 0 )
         {
            AV65rTipoFirma1 = "CUENTADANTE ORIGEN" ;
            AV53rNombreFirma1 = GXutil.trim( GXutil.upper( AV50rCuen_NombreOrigen)) ;
         }
         else if ( GXutil.strcmp(AV106Tpmo_ImprimeDestino, "SI") == 0 )
         {
            AV65rTipoFirma1 = "CUENTADANTE DESTINO" ;
            AV53rNombreFirma1 = GXutil.trim( GXutil.upper( AV49rCuen_NombreDestino)) ;
         }
         h1U0( false, 115) ;
         getPrinter().GxDrawLine(42, Gx_line+83, 275, Gx_line+83, 1, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65rTipoFirma1, "")), 42, Gx_line+100, 275, Gx_line+115, 1, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53rNombreFirma1, "")), 42, Gx_line+83, 275, Gx_line+98, 1, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+115) ;
      }
   }

   public void S291( ) throws ProcessInterruptedException
   {
      /* 'BUSCAFIRMAS' Routine */
      /* Using cursor P001U12 */
      pr_default.execute(10, new Object[] {AV77rTran_CodigoMovimiento});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A38Tpmo_Codigo = P001U12_A38Tpmo_Codigo[0] ;
         A716Tpmo_ImprimeOrigen = P001U12_A716Tpmo_ImprimeOrigen[0] ;
         n716Tpmo_ImprimeOrigen = P001U12_n716Tpmo_ImprimeOrigen[0] ;
         A717Tpmo_ImprimeDestino = P001U12_A717Tpmo_ImprimeDestino[0] ;
         n717Tpmo_ImprimeDestino = P001U12_n717Tpmo_ImprimeDestino[0] ;
         A718Tmpo_ImprimeResponsable = P001U12_A718Tmpo_ImprimeResponsable[0] ;
         n718Tmpo_ImprimeResponsable = P001U12_n718Tmpo_ImprimeResponsable[0] ;
         AV107Tpmo_ImprimeOrigen = A716Tpmo_ImprimeOrigen ;
         AV106Tpmo_ImprimeDestino = A717Tpmo_ImprimeDestino ;
         AV104Tmpo_ImprimeResponsable = A718Tmpo_ImprimeResponsable ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   public void S301( ) throws ProcessInterruptedException
   {
      /* 'BUSCARALMACENISTA' Routine */
      /* Using cursor P001U13 */
      pr_default.execute(11, new Object[] {new Long(AV22Cent_Id)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A30Alma_IdResponsable = P001U13_A30Alma_IdResponsable[0] ;
         A1Cent_Id = P001U13_A1Cent_Id[0] ;
         A266Alma_NombreResponsable = P001U13_A266Alma_NombreResponsable[0] ;
         n266Alma_NombreResponsable = P001U13_n266Alma_NombreResponsable[0] ;
         A27Alma_Modulo = P001U13_A27Alma_Modulo[0] ;
         A28Alma_Codigo = P001U13_A28Alma_Codigo[0] ;
         A266Alma_NombreResponsable = P001U13_A266Alma_NombreResponsable[0] ;
         n266Alma_NombreResponsable = P001U13_n266Alma_NombreResponsable[0] ;
         AV15Alma_NombreResponsable = A266Alma_NombreResponsable ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(11);
      }
      pr_default.close(11);
   }

   public void h1U0( boolean bFoot ,
                     int Inc )
   {
      /* Skip the required number of lines */
      while ( ( ToSkip > 0 ) || ( Gx_line + Inc > P_lines ) )
      {
         if ( Gx_line + Inc >= P_lines )
         {
            if ( Gx_page > 0 )
            {
               /* Print footers */
               Gx_line = P_lines ;
               getPrinter().GxEndPage() ;
               if ( bFoot )
               {
                  return  ;
               }
            }
            ToSkip = 0 ;
            Gx_line = 0 ;
            Gx_page = (int)(Gx_page+1) ;
            /* Skip Margin Top Lines */
            Gx_line = (int)(Gx_line+(M_top*lineHeight)) ;
            /* Print headers */
            getPrinter().GxStartPage() ;
            getPrinter().setPage(Gx_page);
            getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "35309654-5bf1-4adc-b684-068095000e09", "", context.getHttpContext().getTheme( )), 92, Gx_line+0, 196, Gx_line+86) ;
            getPrinter().GxDrawLine(17, Gx_line+84, 1384, Gx_line+84, 3, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("FECHA", 1225, Gx_line+17, 1267, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("USUARIO", 1225, Gx_line+33, 1282, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("PAGINA", 1225, Gx_line+50, 1271, Gx_line+66, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 1300, Gx_line+50, 1317, Gx_line+67, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 1300, Gx_line+17, 1351, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV94rUsuario, "@!")), 1300, Gx_line+33, 1375, Gx_line+50, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("{{Pages}} ", 1329, Gx_line+50, 1346, Gx_line+67, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("de", 1310, Gx_line+50, 1326, Gx_line+66, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("SENA- SERVICIO NACIONAL DE APRENDIZAJE", 550, Gx_line+0, 857, Gx_line+17, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("899.999.034-1", 658, Gx_line+17, 742, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV91rTran_RegionDescripcion, "")), 267, Gx_line+67, 581, Gx_line+85, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText("C. de Costo:", 592, Gx_line+67, 668, Gx_line+84, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70rTran_CentroCostoCodigo, "")), 675, Gx_line+67, 749, Gx_line+85, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72RTran_CentroCostoDescripcion, "")), 750, Gx_line+67, 1064, Gx_line+85, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+89) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV84rTran_FechaRatificacion, "99/99/9999 99:99"), 767, Gx_line+33, 856, Gx_line+51, 2, 0, 0, 0) ;
            getPrinter().GxDrawText("Fecha Ratificación", 642, Gx_line+33, 759, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( AV85rTran_FechaRegistro, "99/99/99 99:99"), 767, Gx_line+17, 856, Gx_line+35, 2, 0, 0, 0) ;
            getPrinter().GxDrawText("Fecha Movimiento", 642, Gx_line+17, 758, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV78rTran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")), 583, Gx_line+17, 625, Gx_line+35, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("Transación No.", 467, Gx_line+17, 564, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77rTran_CodigoMovimiento, "")), 583, Gx_line+0, 625, Gx_line+18, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("Movimiento", 467, Gx_line+0, 540, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("Estado.", 676, Gx_line+50, 725, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82rTran_Estado, "")), 742, Gx_line+50, 831, Gx_line+68, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV81rTran_DescripcionMovimiento, "")), 642, Gx_line+0, 1022, Gx_line+18, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+75) ;
            if ( GXutil.strcmp(AV70rTran_CentroCostoCodigo, AV71rTran_CentroCostoCodigoDestino) == 0 )
            {
               getPrinter().GxDrawRect(133, Gx_line+0, 625, Gx_line+67, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(783, Gx_line+0, 1275, Gx_line+67, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV48rCuen_CedulaOrigen), "ZZZZZZZZZZZZZZZZZ9")), 192, Gx_line+50, 343, Gx_line+67, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV47rCuen_CedulaDestino), "ZZZZZZZZZZZZZZZZZ9")), 842, Gx_line+50, 993, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV87rTran_IdCuentadanteOrigen), "ZZZZZZZZZZZZZZZZZ9")), 142, Gx_line+50, 200, Gx_line+67, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV86rTran_IdCuentadanteDestino), "ZZZZZZZZZZZZZZZZZ9")), 792, Gx_line+50, 850, Gx_line+67, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74rTran_CodAlmaOrigen, "")), 142, Gx_line+17, 167, Gx_line+34, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80rTran_DescpAlmaOrigen, "")), 275, Gx_line+17, 608, Gx_line+34, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76rTran_CodBodeOrigen, "")), 142, Gx_line+33, 181, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50rCuen_NombreOrigen, "@!")), 275, Gx_line+50, 608, Gx_line+67, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42rBArea_CodigoOrigen, "")), 192, Gx_line+33, 250, Gx_line+50, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44rBArea_DescripcionOrigen, "")), 275, Gx_line+33, 526, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9rTran_CodAlmaDestino, "")), 792, Gx_line+17, 817, Gx_line+32, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79rTran_DescpAlmaDestino, "")), 925, Gx_line+17, 1258, Gx_line+34, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75rTran_CodBodeDestino, "")), 792, Gx_line+33, 831, Gx_line+50, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41rBArea_CodigoDestino, "")), 842, Gx_line+33, 900, Gx_line+50, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43rBArea_DescripcionDestino, "")), 925, Gx_line+33, 1176, Gx_line+50, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49rCuen_NombreDestino, "@!")), 925, Gx_line+50, 1258, Gx_line+67, 0, 0, 0, 0) ;
               getPrinter().GxDrawText("OBSERVACIÓN:", 0, Gx_line+83, 375, Gx_line+99, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("ORIGEN", 142, Gx_line+0, 203, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("DESTINO", 792, Gx_line+0, 863, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+100) ;
            }
            else
            {
               getPrinter().GxDrawRect(133, Gx_line+0, 625, Gx_line+83, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(783, Gx_line+0, 1275, Gx_line+83, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV48rCuen_CedulaOrigen), "ZZZZZZZZZZZZZZZZZ9")), 192, Gx_line+67, 343, Gx_line+84, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV47rCuen_CedulaDestino), "ZZZZZZZZZZZZZZZZZ9")), 842, Gx_line+67, 993, Gx_line+84, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV87rTran_IdCuentadanteOrigen), "ZZZZZZZZZZZZZZZZZ9")), 142, Gx_line+67, 200, Gx_line+84, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV86rTran_IdCuentadanteDestino), "ZZZZZZZZZZZZZZZZZ9")), 792, Gx_line+67, 850, Gx_line+84, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74rTran_CodAlmaOrigen, "")), 142, Gx_line+33, 167, Gx_line+50, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80rTran_DescpAlmaOrigen, "")), 275, Gx_line+33, 608, Gx_line+50, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76rTran_CodBodeOrigen, "")), 142, Gx_line+50, 181, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50rCuen_NombreOrigen, "@!")), 275, Gx_line+67, 608, Gx_line+84, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42rBArea_CodigoOrigen, "")), 192, Gx_line+50, 250, Gx_line+67, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44rBArea_DescripcionOrigen, "")), 275, Gx_line+50, 526, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9rTran_CodAlmaDestino, "")), 792, Gx_line+33, 817, Gx_line+48, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79rTran_DescpAlmaDestino, "")), 925, Gx_line+33, 1258, Gx_line+50, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75rTran_CodBodeDestino, "")), 792, Gx_line+50, 831, Gx_line+67, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41rBArea_CodigoDestino, "")), 842, Gx_line+50, 900, Gx_line+67, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43rBArea_DescripcionDestino, "")), 925, Gx_line+50, 1176, Gx_line+67, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49rCuen_NombreDestino, "@!")), 925, Gx_line+67, 1258, Gx_line+84, 0, 0, 0, 0) ;
               getPrinter().GxDrawText("OBSERVACIÓN:", 0, Gx_line+100, 375, Gx_line+116, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11rTran_RegionCodigoDestino), "ZZZ9")), 792, Gx_line+17, 826, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71rTran_CentroCostoCodigoDestino, "")), 842, Gx_line+17, 926, Gx_line+34, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73rTran_CentroCostoDescripcionDestino, "")), 925, Gx_line+17, 1239, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("ORIGEN", 142, Gx_line+0, 203, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("DESTINO", 792, Gx_line+0, 863, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+119) ;
            }
            AV23contadorlinea = (short)(1) ;
            while ( AV23contadorlinea <= 6 )
            {
               AV89rTran_Observaciones = GXutil.gxgetmli( AV109Tran_Observaciones, AV23contadorlinea, (short)(200)) ;
               if ( ! (GXutil.strcmp("", AV89rTran_Observaciones)==0) && ( AV23contadorlinea == 1 ) )
               {
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(AV89rTran_Observaciones, 0, Gx_line+0, 1058, Gx_line+15, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
               }
               else
               {
                  if ( ! (GXutil.strcmp("", AV89rTran_Observaciones)==0) )
                  {
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(AV89rTran_Observaciones, 0, Gx_line+0, 1058, Gx_line+15, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                  }
               }
               AV23contadorlinea = (short)(AV23contadorlinea+1) ;
            }
            getPrinter().GxDrawLine(0, Gx_line+33, 1383, Gx_line+33, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+0, 1383, Gx_line+0, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("Item", 0, Gx_line+17, 26, Gx_line+31, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("Tipo", 25, Gx_line+17, 52, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("Grupo", 50, Gx_line+17, 86, Gx_line+31, 1, 0, 0, 0) ;
            getPrinter().GxDrawText("Codigo", 92, Gx_line+17, 134, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("Descripciòn", 135, Gx_line+17, 206, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("Placa", 417, Gx_line+0, 451, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("Atributos", 608, Gx_line+17, 661, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("Unid.", 892, Gx_line+17, 924, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("Valor Total", 1308, Gx_line+17, 1374, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("Vlr. Unit.", 1000, Gx_line+17, 1053, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("Otros", 1142, Gx_line+17, 1174, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("Vlr. Presente", 1183, Gx_line+17, 1260, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("Placa Padre", 525, Gx_line+0, 598, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("Origen", 475, Gx_line+17, 515, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("Cant.", 942, Gx_line+17, 974, Gx_line+31, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+39) ;
            if (true) break;
         }
         else
         {
            PrtOffset = 0 ;
            Gx_line = (int)(Gx_line+1) ;
         }
         ToSkip = (int)(ToSkip-1) ;
      }
      getPrinter().setPage(Gx_page);
   }

   public void add_metrics( )
   {
      add_metrics0( ) ;
      add_metrics1( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected java.io.OutputStream getOutputStream( )
   {
      return httpContext.getOutputStream();
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      AV94rUsuario = "" ;
      AV112websession = httpContext.getWebSession();
      scmdbuf = "" ;
      P001U2_A416Tran_Observaciones = new String[] {""} ;
      P001U2_n416Tran_Observaciones = new boolean[] {false} ;
      P001U2_A50Tran_CentroCostoIdDestino = new long[1] ;
      P001U2_n50Tran_CentroCostoIdDestino = new boolean[] {false} ;
      P001U2_A57Tran_RegionId = new long[1] ;
      P001U2_n57Tran_RegionId = new boolean[] {false} ;
      P001U2_A518Tran_RegionIdDestino = new long[1] ;
      P001U2_n518Tran_RegionIdDestino = new boolean[] {false} ;
      P001U2_A46Tran_Id = new long[1] ;
      P001U2_A421Tran_RegionCodigo = new short[1] ;
      P001U2_n421Tran_RegionCodigo = new boolean[] {false} ;
      P001U2_A422Tran_RegionDescripcion = new String[] {""} ;
      P001U2_n422Tran_RegionDescripcion = new boolean[] {false} ;
      P001U2_A48Tran_CentroCostoId = new long[1] ;
      P001U2_A419Tran_CentroCostoCodigo = new String[] {""} ;
      P001U2_n419Tran_CentroCostoCodigo = new boolean[] {false} ;
      P001U2_A420Tran_CentroCostoDescripcion = new String[] {""} ;
      P001U2_n420Tran_CentroCostoDescripcion = new boolean[] {false} ;
      P001U2_A49Tran_CodigoMovimiento = new String[] {""} ;
      P001U2_A381Tran_DescripcionMovimiento = new String[] {""} ;
      P001U2_n381Tran_DescripcionMovimiento = new boolean[] {false} ;
      P001U2_A482Tran_TipoElemento = new String[] {""} ;
      P001U2_A481Tran_IndE_S = new String[] {""} ;
      P001U2_n481Tran_IndE_S = new boolean[] {false} ;
      P001U2_A513Tran_ConsecutivoCC = new long[1] ;
      P001U2_n513Tran_ConsecutivoCC = new boolean[] {false} ;
      P001U2_A55Tran_FechaRegistro = new java.util.Date[] {GXutil.nullDate()} ;
      P001U2_A390Tran_FechaRatificacion = new java.util.Date[] {GXutil.nullDate()} ;
      P001U2_n390Tran_FechaRatificacion = new boolean[] {false} ;
      P001U2_A483Tran_ValorTransaccion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001U2_n483Tran_ValorTransaccion = new boolean[] {false} ;
      P001U2_A58Tran_Estado = new String[] {""} ;
      P001U2_n58Tran_Estado = new boolean[] {false} ;
      P001U2_A109Tran_CodAlmaOrigen = new String[] {""} ;
      P001U2_A110Tran_ModuloOrigen = new String[] {""} ;
      P001U2_A112Tran_CodBodeOrigen = new String[] {""} ;
      P001U2_A51Tran_IdCuentadanteOrigen = new long[1] ;
      P001U2_n51Tran_IdCuentadanteOrigen = new boolean[] {false} ;
      P001U2_A53Tran_IdProveedor = new long[1] ;
      P001U2_n53Tran_IdProveedor = new boolean[] {false} ;
      P001U2_A703Tran_CedulaProveedor = new long[1] ;
      P001U2_n703Tran_CedulaProveedor = new boolean[] {false} ;
      P001U2_A575Tran_NombreProveedor = new String[] {""} ;
      P001U2_n575Tran_NombreProveedor = new boolean[] {false} ;
      P001U2_A111Tran_CodAlmaDestino = new String[] {""} ;
      P001U2_A385Tran_ModuloDestino = new String[] {""} ;
      P001U2_A387Tran_CodBodeDestino = new String[] {""} ;
      P001U2_A52Tran_IdCuentadanteDestino = new long[1] ;
      P001U2_n52Tran_IdCuentadanteDestino = new boolean[] {false} ;
      P001U2_A519Tran_RegionCodigoDestino = new short[1] ;
      P001U2_n519Tran_RegionCodigoDestino = new boolean[] {false} ;
      P001U2_A516Tran_CentroCostoCodigoDestino = new String[] {""} ;
      P001U2_n516Tran_CentroCostoCodigoDestino = new boolean[] {false} ;
      P001U2_A517Tran_CentroCostoDescripcionDes = new String[] {""} ;
      P001U2_n517Tran_CentroCostoDescripcionDes = new boolean[] {false} ;
      A416Tran_Observaciones = "" ;
      A422Tran_RegionDescripcion = "" ;
      A419Tran_CentroCostoCodigo = "" ;
      A420Tran_CentroCostoDescripcion = "" ;
      A49Tran_CodigoMovimiento = "" ;
      A381Tran_DescripcionMovimiento = "" ;
      A482Tran_TipoElemento = "" ;
      A481Tran_IndE_S = "" ;
      A55Tran_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      A390Tran_FechaRatificacion = GXutil.resetTime( GXutil.nullDate() );
      A483Tran_ValorTransaccion = DecimalUtil.ZERO ;
      A58Tran_Estado = "" ;
      A109Tran_CodAlmaOrigen = "" ;
      A110Tran_ModuloOrigen = "" ;
      A112Tran_CodBodeOrigen = "" ;
      A575Tran_NombreProveedor = "" ;
      A111Tran_CodAlmaDestino = "" ;
      A385Tran_ModuloDestino = "" ;
      A387Tran_CodBodeDestino = "" ;
      A516Tran_CentroCostoCodigoDestino = "" ;
      A517Tran_CentroCostoDescripcionDes = "" ;
      AV91rTran_RegionDescripcion = "" ;
      AV70rTran_CentroCostoCodigo = "" ;
      AV72RTran_CentroCostoDescripcion = "" ;
      AV77rTran_CodigoMovimiento = "" ;
      AV81rTran_DescripcionMovimiento = "" ;
      AV110Tran_TipoElemento = "" ;
      AV108Tran_IndE_S = "" ;
      AV85rTran_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      AV84rTran_FechaRatificacion = GXutil.resetTime( GXutil.nullDate() );
      AV111Tran_ValorTransaccion = DecimalUtil.ZERO ;
      AV113Tran_Estado = "" ;
      AV82rTran_Estado = "" ;
      AV74rTran_CodAlmaOrigen = "" ;
      AV12Alma_Codigo = "" ;
      AV14Alma_Modulo = "" ;
      AV80rTran_DescpAlmaOrigen = "" ;
      AV13Alma_Descripcion = "" ;
      AV76rTran_CodBodeOrigen = "" ;
      AV17Bode_Codigo = "" ;
      AV42rBArea_CodigoOrigen = "" ;
      AV16BArea_Codigo = "" ;
      AV44rBArea_DescripcionOrigen = "" ;
      AV8BArea_Descripcion = "" ;
      AV50rCuen_NombreOrigen = "" ;
      AV27Cuen_Nombre = "" ;
      AV9rTran_CodAlmaDestino = "" ;
      AV79rTran_DescpAlmaDestino = "" ;
      AV75rTran_CodBodeDestino = "" ;
      AV41rBArea_CodigoDestino = "" ;
      AV43rBArea_DescripcionDestino = "" ;
      AV49rCuen_NombreDestino = "" ;
      AV109Tran_Observaciones = "" ;
      AV71rTran_CentroCostoCodigoDestino = "" ;
      AV73rTran_CentroCostoDescripcionDestino = "" ;
      P001U3_A28Alma_Codigo = new String[] {""} ;
      P001U3_A27Alma_Modulo = new String[] {""} ;
      P001U3_A1Cent_Id = new long[1] ;
      P001U3_A252Alma_Descripcion = new String[] {""} ;
      A28Alma_Codigo = "" ;
      A27Alma_Modulo = "" ;
      A252Alma_Descripcion = "" ;
      P001U4_A31Bode_Codigo = new String[] {""} ;
      P001U4_A28Alma_Codigo = new String[] {""} ;
      P001U4_A27Alma_Modulo = new String[] {""} ;
      P001U4_A1Cent_Id = new long[1] ;
      P001U4_A32BArea_Codigo = new String[] {""} ;
      P001U4_n32BArea_Codigo = new boolean[] {false} ;
      P001U4_A695BBode_Descripcion = new String[] {""} ;
      A31Bode_Codigo = "" ;
      A32BArea_Codigo = "" ;
      A695BBode_Descripcion = "" ;
      P001U5_A43Cuen_Identificacion = new long[1] ;
      P001U5_A688Cuen_Cedula = new long[1] ;
      P001U5_A44Cuen_Nombre = new String[] {""} ;
      P001U5_n44Cuen_Nombre = new boolean[] {false} ;
      A44Cuen_Nombre = "" ;
      P001U6_A66Elem_Consecutivo = new String[] {""} ;
      P001U6_A37Cata_Codigo = new String[] {""} ;
      P001U6_A34Clas_Codigo = new String[] {""} ;
      P001U6_A35FAM_Codigo = new String[] {""} ;
      P001U6_A46Tran_Id = new long[1] ;
      P001U6_A75SEG_Codigo = new String[] {""} ;
      A66Elem_Consecutivo = "" ;
      A37Cata_Codigo = "" ;
      A34Clas_Codigo = "" ;
      A35FAM_Codigo = "" ;
      A75SEG_Codigo = "" ;
      AV96SEG_Codigo = "" ;
      AV68rTotalGrupo = "" ;
      AV105TotalGrupo = DecimalUtil.ZERO ;
      A756Tran_Abreviado = "" ;
      A514Tran_NumeroIngreso = "" ;
      P001U7_A37Cata_Codigo = new String[] {""} ;
      P001U7_A34Clas_Codigo = new String[] {""} ;
      P001U7_A35FAM_Codigo = new String[] {""} ;
      P001U7_A75SEG_Codigo = new String[] {""} ;
      P001U7_A46Tran_Id = new long[1] ;
      P001U7_A33Tipo_Codigo = new long[1] ;
      P001U7_A298Cata_Descripcion = new String[] {""} ;
      P001U7_A66Elem_Consecutivo = new String[] {""} ;
      P001U7_A557Elem_Descripcion = new String[] {""} ;
      P001U7_A490TDet_PlacaNumero = new String[] {""} ;
      P001U7_n490TDet_PlacaNumero = new boolean[] {false} ;
      P001U7_A491TDet_PlacaPadre = new String[] {""} ;
      P001U7_n491TDet_PlacaPadre = new boolean[] {false} ;
      P001U7_A77UNIMED_COD = new int[1] ;
      P001U7_A487TDet_Cantidad = new long[1] ;
      P001U7_A489TDet_ValorTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001U7_A488TDet_ValorUnitario = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001U7_A657TDet_Otros_Costos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001U7_n657TDet_Otros_Costos = new boolean[] {false} ;
      P001U7_A653TDet_Valor_Presente = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001U7_n653TDet_Valor_Presente = new boolean[] {false} ;
      P001U7_A69TDet_Consecutivo = new long[1] ;
      A298Cata_Descripcion = "" ;
      A557Elem_Descripcion = "" ;
      A490TDet_PlacaNumero = "" ;
      A491TDet_PlacaPadre = "" ;
      A489TDet_ValorTotal = DecimalUtil.ZERO ;
      A488TDet_ValorUnitario = DecimalUtil.ZERO ;
      A657TDet_Otros_Costos = DecimalUtil.ZERO ;
      A653TDet_Valor_Presente = DecimalUtil.ZERO ;
      AV56rSEG_Codigo = "" ;
      AV21Cata_Descripcion = "" ;
      AV52rElem_Consecutivo = "" ;
      AV28Elem_Descripcion = "" ;
      AV51rDescripcion = "" ;
      AV59rTDet_PlacaNumero = "" ;
      AV60rTDet_PlacaPadre = "" ;
      AV100TDet_ValorTotal = DecimalUtil.ZERO ;
      AV101TDet_ValorUnitario = DecimalUtil.ZERO ;
      AV98TDet_Otros_Costos = DecimalUtil.ZERO ;
      AV99TDet_Valor_Presente = DecimalUtil.ZERO ;
      AV62rTDet_ValorTotal = "" ;
      AV63rTDet_ValorUnitario = "" ;
      AV58rTDet_Otros_Costos = "" ;
      AV61rTDet_Valor_Presente = "" ;
      AV40rAtributos = "" ;
      AV69rTran_Abreviado = "" ;
      AV88rTran_NumeroIngreso = "" ;
      AV83rTran_FechaIngreso = "" ;
      AV10rTran_NombreProveedor = "" ;
      P001U8_A490TDet_PlacaNumero = new String[] {""} ;
      P001U8_n490TDet_PlacaNumero = new boolean[] {false} ;
      P001U8_A481Tran_IndE_S = new String[] {""} ;
      P001U8_n481Tran_IndE_S = new boolean[] {false} ;
      P001U8_A46Tran_Id = new long[1] ;
      P001U8_A69TDet_Consecutivo = new long[1] ;
      P001U9_A69TDet_Consecutivo = new long[1] ;
      P001U9_A46Tran_Id = new long[1] ;
      P001U9_A71Tran_Entrada = new long[1] ;
      P001U9_A72Nro_Linea = new int[1] ;
      P001U10_A70TDet_ListId = new long[1] ;
      P001U10_A69TDet_Consecutivo = new long[1] ;
      P001U10_A46Tran_Id = new long[1] ;
      P001U10_A494TDet_ValorAtributo = new String[] {""} ;
      P001U10_A492TDet_ListDescripcion = new String[] {""} ;
      P001U10_n492TDet_ListDescripcion = new boolean[] {false} ;
      A494TDet_ValorAtributo = "" ;
      A492TDet_ListDescripcion = "" ;
      P001U11_A53Tran_IdProveedor = new long[1] ;
      P001U11_n53Tran_IdProveedor = new boolean[] {false} ;
      P001U11_A54Tran_TipoIngreso = new long[1] ;
      P001U11_n54Tran_TipoIngreso = new boolean[] {false} ;
      P001U11_A46Tran_Id = new long[1] ;
      P001U11_A756Tran_Abreviado = new String[] {""} ;
      P001U11_n756Tran_Abreviado = new boolean[] {false} ;
      P001U11_A514Tran_NumeroIngreso = new String[] {""} ;
      P001U11_n514Tran_NumeroIngreso = new boolean[] {false} ;
      P001U11_A515Tran_FechaIngreso = new java.util.Date[] {GXutil.nullDate()} ;
      P001U11_n515Tran_FechaIngreso = new boolean[] {false} ;
      P001U11_A575Tran_NombreProveedor = new String[] {""} ;
      P001U11_n575Tran_NombreProveedor = new boolean[] {false} ;
      A515Tran_FechaIngreso = GXutil.nullDate() ;
      GXv_decimal1 = new java.math.BigDecimal [1] ;
      AV95rValorLetras = "" ;
      GXv_char2 = new String [1] ;
      AV92rTran_ValorTransaccion = "" ;
      AV36PiePagina = "" ;
      AV107Tpmo_ImprimeOrigen = "" ;
      AV106Tpmo_ImprimeDestino = "" ;
      AV104Tmpo_ImprimeResponsable = "" ;
      AV65rTipoFirma1 = "" ;
      AV53rNombreFirma1 = "" ;
      AV15Alma_NombreResponsable = "" ;
      AV66rTipoFirma2 = "" ;
      AV54rNombreFirma2 = "" ;
      AV67rTipoFirma3 = "" ;
      AV55rNombreFirma3 = "" ;
      P001U12_A38Tpmo_Codigo = new String[] {""} ;
      P001U12_A716Tpmo_ImprimeOrigen = new String[] {""} ;
      P001U12_n716Tpmo_ImprimeOrigen = new boolean[] {false} ;
      P001U12_A717Tpmo_ImprimeDestino = new String[] {""} ;
      P001U12_n717Tpmo_ImprimeDestino = new boolean[] {false} ;
      P001U12_A718Tmpo_ImprimeResponsable = new String[] {""} ;
      P001U12_n718Tmpo_ImprimeResponsable = new boolean[] {false} ;
      A38Tpmo_Codigo = "" ;
      A716Tpmo_ImprimeOrigen = "" ;
      A717Tpmo_ImprimeDestino = "" ;
      A718Tmpo_ImprimeResponsable = "" ;
      P001U13_A30Alma_IdResponsable = new long[1] ;
      P001U13_A1Cent_Id = new long[1] ;
      P001U13_A266Alma_NombreResponsable = new String[] {""} ;
      P001U13_n266Alma_NombreResponsable = new boolean[] {false} ;
      P001U13_A27Alma_Modulo = new String[] {""} ;
      P001U13_A28Alma_Codigo = new String[] {""} ;
      A266Alma_NombreResponsable = "" ;
      Gx_date = GXutil.nullDate() ;
      AV89rTran_Observaciones = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.aptrascuen__default(),
         new Object[] {
             new Object[] {
            P001U2_A416Tran_Observaciones, P001U2_n416Tran_Observaciones, P001U2_A50Tran_CentroCostoIdDestino, P001U2_n50Tran_CentroCostoIdDestino, P001U2_A57Tran_RegionId, P001U2_n57Tran_RegionId, P001U2_A518Tran_RegionIdDestino, P001U2_n518Tran_RegionIdDestino, P001U2_A46Tran_Id, P001U2_A421Tran_RegionCodigo,
            P001U2_n421Tran_RegionCodigo, P001U2_A422Tran_RegionDescripcion, P001U2_n422Tran_RegionDescripcion, P001U2_A48Tran_CentroCostoId, P001U2_A419Tran_CentroCostoCodigo, P001U2_n419Tran_CentroCostoCodigo, P001U2_A420Tran_CentroCostoDescripcion, P001U2_n420Tran_CentroCostoDescripcion, P001U2_A49Tran_CodigoMovimiento, P001U2_A381Tran_DescripcionMovimiento,
            P001U2_n381Tran_DescripcionMovimiento, P001U2_A482Tran_TipoElemento, P001U2_A481Tran_IndE_S, P001U2_n481Tran_IndE_S, P001U2_A513Tran_ConsecutivoCC, P001U2_n513Tran_ConsecutivoCC, P001U2_A55Tran_FechaRegistro, P001U2_A390Tran_FechaRatificacion, P001U2_n390Tran_FechaRatificacion, P001U2_A483Tran_ValorTransaccion,
            P001U2_n483Tran_ValorTransaccion, P001U2_A58Tran_Estado, P001U2_n58Tran_Estado, P001U2_A109Tran_CodAlmaOrigen, P001U2_A110Tran_ModuloOrigen, P001U2_A112Tran_CodBodeOrigen, P001U2_A51Tran_IdCuentadanteOrigen, P001U2_n51Tran_IdCuentadanteOrigen, P001U2_A53Tran_IdProveedor, P001U2_n53Tran_IdProveedor,
            P001U2_A703Tran_CedulaProveedor, P001U2_n703Tran_CedulaProveedor, P001U2_A575Tran_NombreProveedor, P001U2_n575Tran_NombreProveedor, P001U2_A111Tran_CodAlmaDestino, P001U2_A385Tran_ModuloDestino, P001U2_A387Tran_CodBodeDestino, P001U2_A52Tran_IdCuentadanteDestino, P001U2_n52Tran_IdCuentadanteDestino, P001U2_A519Tran_RegionCodigoDestino,
            P001U2_n519Tran_RegionCodigoDestino, P001U2_A516Tran_CentroCostoCodigoDestino, P001U2_n516Tran_CentroCostoCodigoDestino, P001U2_A517Tran_CentroCostoDescripcionDes, P001U2_n517Tran_CentroCostoDescripcionDes
            }
            , new Object[] {
            P001U3_A28Alma_Codigo, P001U3_A27Alma_Modulo, P001U3_A1Cent_Id, P001U3_A252Alma_Descripcion
            }
            , new Object[] {
            P001U4_A31Bode_Codigo, P001U4_A28Alma_Codigo, P001U4_A27Alma_Modulo, P001U4_A1Cent_Id, P001U4_A32BArea_Codigo, P001U4_n32BArea_Codigo, P001U4_A695BBode_Descripcion
            }
            , new Object[] {
            P001U5_A43Cuen_Identificacion, P001U5_A688Cuen_Cedula, P001U5_A44Cuen_Nombre, P001U5_n44Cuen_Nombre
            }
            , new Object[] {
            P001U6_A66Elem_Consecutivo, P001U6_A37Cata_Codigo, P001U6_A34Clas_Codigo, P001U6_A35FAM_Codigo, P001U6_A46Tran_Id, P001U6_A75SEG_Codigo
            }
            , new Object[] {
            P001U7_A37Cata_Codigo, P001U7_A34Clas_Codigo, P001U7_A35FAM_Codigo, P001U7_A75SEG_Codigo, P001U7_A46Tran_Id, P001U7_A33Tipo_Codigo, P001U7_A298Cata_Descripcion, P001U7_A66Elem_Consecutivo, P001U7_A557Elem_Descripcion, P001U7_A490TDet_PlacaNumero,
            P001U7_n490TDet_PlacaNumero, P001U7_A491TDet_PlacaPadre, P001U7_n491TDet_PlacaPadre, P001U7_A77UNIMED_COD, P001U7_A487TDet_Cantidad, P001U7_A489TDet_ValorTotal, P001U7_A488TDet_ValorUnitario, P001U7_A657TDet_Otros_Costos, P001U7_n657TDet_Otros_Costos, P001U7_A653TDet_Valor_Presente,
            P001U7_n653TDet_Valor_Presente, P001U7_A69TDet_Consecutivo
            }
            , new Object[] {
            P001U8_A490TDet_PlacaNumero, P001U8_n490TDet_PlacaNumero, P001U8_A481Tran_IndE_S, P001U8_n481Tran_IndE_S, P001U8_A46Tran_Id, P001U8_A69TDet_Consecutivo
            }
            , new Object[] {
            P001U9_A69TDet_Consecutivo, P001U9_A46Tran_Id, P001U9_A71Tran_Entrada, P001U9_A72Nro_Linea
            }
            , new Object[] {
            P001U10_A70TDet_ListId, P001U10_A69TDet_Consecutivo, P001U10_A46Tran_Id, P001U10_A494TDet_ValorAtributo, P001U10_A492TDet_ListDescripcion, P001U10_n492TDet_ListDescripcion
            }
            , new Object[] {
            P001U11_A53Tran_IdProveedor, P001U11_n53Tran_IdProveedor, P001U11_A54Tran_TipoIngreso, P001U11_n54Tran_TipoIngreso, P001U11_A46Tran_Id, P001U11_A756Tran_Abreviado, P001U11_n756Tran_Abreviado, P001U11_A514Tran_NumeroIngreso, P001U11_n514Tran_NumeroIngreso, P001U11_A515Tran_FechaIngreso,
            P001U11_n515Tran_FechaIngreso, P001U11_A575Tran_NombreProveedor, P001U11_n575Tran_NombreProveedor
            }
            , new Object[] {
            P001U12_A38Tpmo_Codigo, P001U12_A716Tpmo_ImprimeOrigen, P001U12_n716Tpmo_ImprimeOrigen, P001U12_A717Tpmo_ImprimeDestino, P001U12_n717Tpmo_ImprimeDestino, P001U12_A718Tmpo_ImprimeResponsable, P001U12_n718Tmpo_ImprimeResponsable
            }
            , new Object[] {
            P001U13_A30Alma_IdResponsable, P001U13_A1Cent_Id, P001U13_A266Alma_NombreResponsable, P001U13_n266Alma_NombreResponsable, P001U13_A27Alma_Modulo, P001U13_A28Alma_Codigo
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short A421Tran_RegionCodigo ;
   private short A519Tran_RegionCodigoDestino ;
   private short AV90rTran_RegionCodigo ;
   private short AV11rTran_RegionCodigoDestino ;
   private short AV114NumItem ;
   private short AV35NumeroFirma ;
   private short AV23contadorlinea ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int A77UNIMED_COD ;
   private int AV93rUNIMED_COD ;
   private int A72Nro_Linea ;
   private long AV38pTran_Id ;
   private long A50Tran_CentroCostoIdDestino ;
   private long A57Tran_RegionId ;
   private long A518Tran_RegionIdDestino ;
   private long A46Tran_Id ;
   private long A48Tran_CentroCostoId ;
   private long A513Tran_ConsecutivoCC ;
   private long A51Tran_IdCuentadanteOrigen ;
   private long A53Tran_IdProveedor ;
   private long A703Tran_CedulaProveedor ;
   private long A52Tran_IdCuentadanteDestino ;
   private long AV22Cent_Id ;
   private long AV78rTran_ConsecutivoCC ;
   private long AV87rTran_IdCuentadanteOrigen ;
   private long AV26Cuen_Identificacion ;
   private long AV48rCuen_CedulaOrigen ;
   private long AV25Cuen_Cedula ;
   private long AV86rTran_IdCuentadanteDestino ;
   private long AV47rCuen_CedulaDestino ;
   private long A1Cent_Id ;
   private long A43Cuen_Identificacion ;
   private long A688Cuen_Cedula ;
   private long A33Tipo_Codigo ;
   private long A487TDet_Cantidad ;
   private long A69TDet_Consecutivo ;
   private long AV116rTipo_Codigo ;
   private long AV97TDet_Consecutivo ;
   private long AV30eTran_Id ;
   private long AV29eTDet_Consecutivo ;
   private long AV57rTDet_Cantidad ;
   private long A71Tran_Entrada ;
   private long A70TDet_ListId ;
   private long A54Tran_TipoIngreso ;
   private long A30Alma_IdResponsable ;
   private java.math.BigDecimal A483Tran_ValorTransaccion ;
   private java.math.BigDecimal AV111Tran_ValorTransaccion ;
   private java.math.BigDecimal AV105TotalGrupo ;
   private java.math.BigDecimal A489TDet_ValorTotal ;
   private java.math.BigDecimal A488TDet_ValorUnitario ;
   private java.math.BigDecimal A657TDet_Otros_Costos ;
   private java.math.BigDecimal A653TDet_Valor_Presente ;
   private java.math.BigDecimal AV100TDet_ValorTotal ;
   private java.math.BigDecimal AV101TDet_ValorUnitario ;
   private java.math.BigDecimal AV98TDet_Otros_Costos ;
   private java.math.BigDecimal AV99TDet_Valor_Presente ;
   private java.math.BigDecimal GXv_decimal1[] ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String scmdbuf ;
   private String A482Tran_TipoElemento ;
   private String A58Tran_Estado ;
   private String AV110Tran_TipoElemento ;
   private String AV113Tran_Estado ;
   private String AV82rTran_Estado ;
   private String A514Tran_NumeroIngreso ;
   private String GXv_char2[] ;
   private java.util.Date A55Tran_FechaRegistro ;
   private java.util.Date A390Tran_FechaRatificacion ;
   private java.util.Date AV85rTran_FechaRegistro ;
   private java.util.Date AV84rTran_FechaRatificacion ;
   private java.util.Date A515Tran_FechaIngreso ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private boolean n416Tran_Observaciones ;
   private boolean n50Tran_CentroCostoIdDestino ;
   private boolean n57Tran_RegionId ;
   private boolean n518Tran_RegionIdDestino ;
   private boolean n421Tran_RegionCodigo ;
   private boolean n422Tran_RegionDescripcion ;
   private boolean n419Tran_CentroCostoCodigo ;
   private boolean n420Tran_CentroCostoDescripcion ;
   private boolean n381Tran_DescripcionMovimiento ;
   private boolean n481Tran_IndE_S ;
   private boolean n513Tran_ConsecutivoCC ;
   private boolean n390Tran_FechaRatificacion ;
   private boolean n483Tran_ValorTransaccion ;
   private boolean n58Tran_Estado ;
   private boolean n51Tran_IdCuentadanteOrigen ;
   private boolean n53Tran_IdProveedor ;
   private boolean n703Tran_CedulaProveedor ;
   private boolean n575Tran_NombreProveedor ;
   private boolean n52Tran_IdCuentadanteDestino ;
   private boolean n519Tran_RegionCodigoDestino ;
   private boolean n516Tran_CentroCostoCodigoDestino ;
   private boolean n517Tran_CentroCostoDescripcionDes ;
   private boolean n32BArea_Codigo ;
   private boolean n44Cuen_Nombre ;
   private boolean n490TDet_PlacaNumero ;
   private boolean n491TDet_PlacaPadre ;
   private boolean n657TDet_Otros_Costos ;
   private boolean n653TDet_Valor_Presente ;
   private boolean n492TDet_ListDescripcion ;
   private boolean n54Tran_TipoIngreso ;
   private boolean n756Tran_Abreviado ;
   private boolean n514Tran_NumeroIngreso ;
   private boolean n515Tran_FechaIngreso ;
   private boolean n716Tpmo_ImprimeOrigen ;
   private boolean n717Tpmo_ImprimeDestino ;
   private boolean n718Tmpo_ImprimeResponsable ;
   private boolean n266Alma_NombreResponsable ;
   private String A416Tran_Observaciones ;
   private String AV109Tran_Observaciones ;
   private String AV89rTran_Observaciones ;
   private String AV94rUsuario ;
   private String A422Tran_RegionDescripcion ;
   private String A419Tran_CentroCostoCodigo ;
   private String A420Tran_CentroCostoDescripcion ;
   private String A49Tran_CodigoMovimiento ;
   private String A381Tran_DescripcionMovimiento ;
   private String A481Tran_IndE_S ;
   private String A109Tran_CodAlmaOrigen ;
   private String A110Tran_ModuloOrigen ;
   private String A112Tran_CodBodeOrigen ;
   private String A575Tran_NombreProveedor ;
   private String A111Tran_CodAlmaDestino ;
   private String A385Tran_ModuloDestino ;
   private String A387Tran_CodBodeDestino ;
   private String A516Tran_CentroCostoCodigoDestino ;
   private String A517Tran_CentroCostoDescripcionDes ;
   private String AV91rTran_RegionDescripcion ;
   private String AV70rTran_CentroCostoCodigo ;
   private String AV72RTran_CentroCostoDescripcion ;
   private String AV77rTran_CodigoMovimiento ;
   private String AV81rTran_DescripcionMovimiento ;
   private String AV108Tran_IndE_S ;
   private String AV74rTran_CodAlmaOrigen ;
   private String AV12Alma_Codigo ;
   private String AV14Alma_Modulo ;
   private String AV80rTran_DescpAlmaOrigen ;
   private String AV13Alma_Descripcion ;
   private String AV76rTran_CodBodeOrigen ;
   private String AV17Bode_Codigo ;
   private String AV42rBArea_CodigoOrigen ;
   private String AV16BArea_Codigo ;
   private String AV44rBArea_DescripcionOrigen ;
   private String AV8BArea_Descripcion ;
   private String AV50rCuen_NombreOrigen ;
   private String AV27Cuen_Nombre ;
   private String AV9rTran_CodAlmaDestino ;
   private String AV79rTran_DescpAlmaDestino ;
   private String AV75rTran_CodBodeDestino ;
   private String AV41rBArea_CodigoDestino ;
   private String AV43rBArea_DescripcionDestino ;
   private String AV49rCuen_NombreDestino ;
   private String AV71rTran_CentroCostoCodigoDestino ;
   private String AV73rTran_CentroCostoDescripcionDestino ;
   private String A28Alma_Codigo ;
   private String A27Alma_Modulo ;
   private String A252Alma_Descripcion ;
   private String A31Bode_Codigo ;
   private String A32BArea_Codigo ;
   private String A695BBode_Descripcion ;
   private String A44Cuen_Nombre ;
   private String A66Elem_Consecutivo ;
   private String A37Cata_Codigo ;
   private String A34Clas_Codigo ;
   private String A35FAM_Codigo ;
   private String A75SEG_Codigo ;
   private String AV96SEG_Codigo ;
   private String AV68rTotalGrupo ;
   private String A756Tran_Abreviado ;
   private String A298Cata_Descripcion ;
   private String A557Elem_Descripcion ;
   private String A490TDet_PlacaNumero ;
   private String A491TDet_PlacaPadre ;
   private String AV56rSEG_Codigo ;
   private String AV21Cata_Descripcion ;
   private String AV52rElem_Consecutivo ;
   private String AV28Elem_Descripcion ;
   private String AV51rDescripcion ;
   private String AV59rTDet_PlacaNumero ;
   private String AV60rTDet_PlacaPadre ;
   private String AV62rTDet_ValorTotal ;
   private String AV63rTDet_ValorUnitario ;
   private String AV58rTDet_Otros_Costos ;
   private String AV61rTDet_Valor_Presente ;
   private String AV40rAtributos ;
   private String AV69rTran_Abreviado ;
   private String AV88rTran_NumeroIngreso ;
   private String AV83rTran_FechaIngreso ;
   private String AV10rTran_NombreProveedor ;
   private String A494TDet_ValorAtributo ;
   private String A492TDet_ListDescripcion ;
   private String AV95rValorLetras ;
   private String AV92rTran_ValorTransaccion ;
   private String AV36PiePagina ;
   private String AV107Tpmo_ImprimeOrigen ;
   private String AV106Tpmo_ImprimeDestino ;
   private String AV104Tmpo_ImprimeResponsable ;
   private String AV65rTipoFirma1 ;
   private String AV53rNombreFirma1 ;
   private String AV15Alma_NombreResponsable ;
   private String AV66rTipoFirma2 ;
   private String AV54rNombreFirma2 ;
   private String AV67rTipoFirma3 ;
   private String AV55rNombreFirma3 ;
   private String A38Tpmo_Codigo ;
   private String A716Tpmo_ImprimeOrigen ;
   private String A717Tpmo_ImprimeDestino ;
   private String A718Tmpo_ImprimeResponsable ;
   private String A266Alma_NombreResponsable ;
   private com.genexus.webpanels.WebSession AV112websession ;
   private IDataStoreProvider pr_default ;
   private String[] P001U2_A416Tran_Observaciones ;
   private boolean[] P001U2_n416Tran_Observaciones ;
   private long[] P001U2_A50Tran_CentroCostoIdDestino ;
   private boolean[] P001U2_n50Tran_CentroCostoIdDestino ;
   private long[] P001U2_A57Tran_RegionId ;
   private boolean[] P001U2_n57Tran_RegionId ;
   private long[] P001U2_A518Tran_RegionIdDestino ;
   private boolean[] P001U2_n518Tran_RegionIdDestino ;
   private long[] P001U2_A46Tran_Id ;
   private short[] P001U2_A421Tran_RegionCodigo ;
   private boolean[] P001U2_n421Tran_RegionCodigo ;
   private String[] P001U2_A422Tran_RegionDescripcion ;
   private boolean[] P001U2_n422Tran_RegionDescripcion ;
   private long[] P001U2_A48Tran_CentroCostoId ;
   private String[] P001U2_A419Tran_CentroCostoCodigo ;
   private boolean[] P001U2_n419Tran_CentroCostoCodigo ;
   private String[] P001U2_A420Tran_CentroCostoDescripcion ;
   private boolean[] P001U2_n420Tran_CentroCostoDescripcion ;
   private String[] P001U2_A49Tran_CodigoMovimiento ;
   private String[] P001U2_A381Tran_DescripcionMovimiento ;
   private boolean[] P001U2_n381Tran_DescripcionMovimiento ;
   private String[] P001U2_A482Tran_TipoElemento ;
   private String[] P001U2_A481Tran_IndE_S ;
   private boolean[] P001U2_n481Tran_IndE_S ;
   private long[] P001U2_A513Tran_ConsecutivoCC ;
   private boolean[] P001U2_n513Tran_ConsecutivoCC ;
   private java.util.Date[] P001U2_A55Tran_FechaRegistro ;
   private java.util.Date[] P001U2_A390Tran_FechaRatificacion ;
   private boolean[] P001U2_n390Tran_FechaRatificacion ;
   private java.math.BigDecimal[] P001U2_A483Tran_ValorTransaccion ;
   private boolean[] P001U2_n483Tran_ValorTransaccion ;
   private String[] P001U2_A58Tran_Estado ;
   private boolean[] P001U2_n58Tran_Estado ;
   private String[] P001U2_A109Tran_CodAlmaOrigen ;
   private String[] P001U2_A110Tran_ModuloOrigen ;
   private String[] P001U2_A112Tran_CodBodeOrigen ;
   private long[] P001U2_A51Tran_IdCuentadanteOrigen ;
   private boolean[] P001U2_n51Tran_IdCuentadanteOrigen ;
   private long[] P001U2_A53Tran_IdProveedor ;
   private boolean[] P001U2_n53Tran_IdProveedor ;
   private long[] P001U2_A703Tran_CedulaProveedor ;
   private boolean[] P001U2_n703Tran_CedulaProveedor ;
   private String[] P001U2_A575Tran_NombreProveedor ;
   private boolean[] P001U2_n575Tran_NombreProveedor ;
   private String[] P001U2_A111Tran_CodAlmaDestino ;
   private String[] P001U2_A385Tran_ModuloDestino ;
   private String[] P001U2_A387Tran_CodBodeDestino ;
   private long[] P001U2_A52Tran_IdCuentadanteDestino ;
   private boolean[] P001U2_n52Tran_IdCuentadanteDestino ;
   private short[] P001U2_A519Tran_RegionCodigoDestino ;
   private boolean[] P001U2_n519Tran_RegionCodigoDestino ;
   private String[] P001U2_A516Tran_CentroCostoCodigoDestino ;
   private boolean[] P001U2_n516Tran_CentroCostoCodigoDestino ;
   private String[] P001U2_A517Tran_CentroCostoDescripcionDes ;
   private boolean[] P001U2_n517Tran_CentroCostoDescripcionDes ;
   private String[] P001U3_A28Alma_Codigo ;
   private String[] P001U3_A27Alma_Modulo ;
   private long[] P001U3_A1Cent_Id ;
   private String[] P001U3_A252Alma_Descripcion ;
   private String[] P001U4_A31Bode_Codigo ;
   private String[] P001U4_A28Alma_Codigo ;
   private String[] P001U4_A27Alma_Modulo ;
   private long[] P001U4_A1Cent_Id ;
   private String[] P001U4_A32BArea_Codigo ;
   private boolean[] P001U4_n32BArea_Codigo ;
   private String[] P001U4_A695BBode_Descripcion ;
   private long[] P001U5_A43Cuen_Identificacion ;
   private long[] P001U5_A688Cuen_Cedula ;
   private String[] P001U5_A44Cuen_Nombre ;
   private boolean[] P001U5_n44Cuen_Nombre ;
   private String[] P001U6_A66Elem_Consecutivo ;
   private String[] P001U6_A37Cata_Codigo ;
   private String[] P001U6_A34Clas_Codigo ;
   private String[] P001U6_A35FAM_Codigo ;
   private long[] P001U6_A46Tran_Id ;
   private String[] P001U6_A75SEG_Codigo ;
   private String[] P001U7_A37Cata_Codigo ;
   private String[] P001U7_A34Clas_Codigo ;
   private String[] P001U7_A35FAM_Codigo ;
   private String[] P001U7_A75SEG_Codigo ;
   private long[] P001U7_A46Tran_Id ;
   private long[] P001U7_A33Tipo_Codigo ;
   private String[] P001U7_A298Cata_Descripcion ;
   private String[] P001U7_A66Elem_Consecutivo ;
   private String[] P001U7_A557Elem_Descripcion ;
   private String[] P001U7_A490TDet_PlacaNumero ;
   private boolean[] P001U7_n490TDet_PlacaNumero ;
   private String[] P001U7_A491TDet_PlacaPadre ;
   private boolean[] P001U7_n491TDet_PlacaPadre ;
   private int[] P001U7_A77UNIMED_COD ;
   private long[] P001U7_A487TDet_Cantidad ;
   private java.math.BigDecimal[] P001U7_A489TDet_ValorTotal ;
   private java.math.BigDecimal[] P001U7_A488TDet_ValorUnitario ;
   private java.math.BigDecimal[] P001U7_A657TDet_Otros_Costos ;
   private boolean[] P001U7_n657TDet_Otros_Costos ;
   private java.math.BigDecimal[] P001U7_A653TDet_Valor_Presente ;
   private boolean[] P001U7_n653TDet_Valor_Presente ;
   private long[] P001U7_A69TDet_Consecutivo ;
   private String[] P001U8_A490TDet_PlacaNumero ;
   private boolean[] P001U8_n490TDet_PlacaNumero ;
   private String[] P001U8_A481Tran_IndE_S ;
   private boolean[] P001U8_n481Tran_IndE_S ;
   private long[] P001U8_A46Tran_Id ;
   private long[] P001U8_A69TDet_Consecutivo ;
   private long[] P001U9_A69TDet_Consecutivo ;
   private long[] P001U9_A46Tran_Id ;
   private long[] P001U9_A71Tran_Entrada ;
   private int[] P001U9_A72Nro_Linea ;
   private long[] P001U10_A70TDet_ListId ;
   private long[] P001U10_A69TDet_Consecutivo ;
   private long[] P001U10_A46Tran_Id ;
   private String[] P001U10_A494TDet_ValorAtributo ;
   private String[] P001U10_A492TDet_ListDescripcion ;
   private boolean[] P001U10_n492TDet_ListDescripcion ;
   private long[] P001U11_A53Tran_IdProveedor ;
   private boolean[] P001U11_n53Tran_IdProveedor ;
   private long[] P001U11_A54Tran_TipoIngreso ;
   private boolean[] P001U11_n54Tran_TipoIngreso ;
   private long[] P001U11_A46Tran_Id ;
   private String[] P001U11_A756Tran_Abreviado ;
   private boolean[] P001U11_n756Tran_Abreviado ;
   private String[] P001U11_A514Tran_NumeroIngreso ;
   private boolean[] P001U11_n514Tran_NumeroIngreso ;
   private java.util.Date[] P001U11_A515Tran_FechaIngreso ;
   private boolean[] P001U11_n515Tran_FechaIngreso ;
   private String[] P001U11_A575Tran_NombreProveedor ;
   private boolean[] P001U11_n575Tran_NombreProveedor ;
   private String[] P001U12_A38Tpmo_Codigo ;
   private String[] P001U12_A716Tpmo_ImprimeOrigen ;
   private boolean[] P001U12_n716Tpmo_ImprimeOrigen ;
   private String[] P001U12_A717Tpmo_ImprimeDestino ;
   private boolean[] P001U12_n717Tpmo_ImprimeDestino ;
   private String[] P001U12_A718Tmpo_ImprimeResponsable ;
   private boolean[] P001U12_n718Tmpo_ImprimeResponsable ;
   private long[] P001U13_A30Alma_IdResponsable ;
   private long[] P001U13_A1Cent_Id ;
   private String[] P001U13_A266Alma_NombreResponsable ;
   private boolean[] P001U13_n266Alma_NombreResponsable ;
   private String[] P001U13_A27Alma_Modulo ;
   private String[] P001U13_A28Alma_Codigo ;
}

final  class aptrascuen__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001U2", "SELECT T1.Tran_Observaciones, T1.Tran_CentroCostoIdDestino AS Tran_CentroCostoIdDestino, T1.Tran_RegionId AS Tran_RegionId, T1.Tran_RegionIdDestino AS Tran_RegionIdDestino, T1.Tran_Id, T3.Regi_Cod AS Tran_RegionCodigo, T3.Regi_Descripcion AS Tran_RegionDescripcion, T1.Tran_CentroCostoId AS Tran_CentroCostoId, T5.Cent_Codigo AS Tran_CentroCostoCodigo, T5.Cent_Descripcion AS Tran_CentroCostoDescripcion, T1.Tran_CodigoMovimiento AS Tran_CodigoMovimiento, T6.Tpmo_Descripcion AS Tran_DescripcionMovimiento, T1.Tran_TipoElemento, T1.Tran_IndE_S AS Tran_IndE_S, T1.Tran_ConsecutivoCC, T1.Tran_FechaRegistro, T1.Tran_FechaRatificacion, T1.Tran_ValorTransaccion, T1.Tran_Estado, T1.Tran_CodAlmaOrigen, T1.Tran_ModuloOrigen, T1.Tran_CodBodeOrigen, T1.Tran_IdCuentadanteOrigen, T1.Tran_IdProveedor AS Tran_IdProveedor, T7.Cuen_Cedula AS Tran_CedulaProveedor, T7.Cuen_Nombre AS Tran_NombreProveedor, T1.Tran_CodAlmaDestino, T1.Tran_ModuloDestino, T1.Tran_CodBodeDestino, T1.Tran_IdCuentadanteDestino, T4.Regi_Cod AS Tran_RegionCodigoDestino, T2.Cent_Codigo AS Tran_CentroCostoCodigoDestino, T2.Cent_Descripcion AS Tran_CentroCostoDescripcionDes FROM ((((((ALM_TRANSACCION T1 LEFT JOIN GEN_CENTROCOSTO T2 ON T2.Cent_Id = T1.Tran_CentroCostoIdDestino) LEFT JOIN GEN_REGIONAL T3 ON T3.Regi_Id = T1.Tran_RegionId) LEFT JOIN GEN_REGIONAL T4 ON T4.Regi_Id = T1.Tran_RegionIdDestino) INNER JOIN GEN_CENTROCOSTO T5 ON T5.Cent_Id = T1.Tran_CentroCostoId) INNER JOIN ALM_TIPO_MOVIMIENTO T6 ON T6.Tpmo_Codigo = T1.Tran_CodigoMovimiento) LEFT JOIN ALM_CUENTADANTE T7 ON T7.Cuen_Identificacion = T1.Tran_IdProveedor) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P001U3", "SELECT Alma_Codigo, Alma_Modulo, Cent_Id, Alma_Descripcion FROM ALM_ALMACEN WHERE Cent_Id = ? and Alma_Modulo = ? and Alma_Codigo = ? ORDER BY Cent_Id, Alma_Modulo, Alma_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P001U4", "SELECT Bode_Codigo, Alma_Codigo, Alma_Modulo, Cent_Id, BArea_Codigo, BBode_Descripcion FROM ALM_ALMACEN_BODEGAS WHERE Cent_Id = ? and Alma_Modulo = ? and Alma_Codigo = ? and Bode_Codigo = ? ORDER BY Cent_Id, Alma_Modulo, Alma_Codigo, Bode_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P001U5", "SELECT Cuen_Identificacion, Cuen_Cedula, Cuen_Nombre FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ORDER BY Cuen_Identificacion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P001U6", "SELECT DISTINCT NULL AS Elem_Consecutivo, NULL AS Cata_Codigo, NULL AS Clas_Codigo, NULL AS FAM_Codigo, NULL AS Tran_Id, SEG_Codigo FROM ( SELECT T1.Elem_Consecutivo, T2.Cata_Codigo, T3.Clas_Codigo, T4.FAM_Codigo, T1.Tran_Id, T5.SEG_Codigo FROM ((((ALM_DETALLE_TRANSACCION T1 INNER JOIN ALM_ELEMENTO T2 ON T2.Elem_Consecutivo = T1.Elem_Consecutivo) INNER JOIN ALM_CATALOGO T3 ON T3.Cata_Codigo = T2.Cata_Codigo) INNER JOIN ALM_CLASE T4 ON T4.Clas_Codigo = T3.Clas_Codigo) INNER JOIN ALM_CAT_FAM T5 ON T5.FAM_Codigo = T4.FAM_Codigo) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id, T5.SEG_Codigo) DistinctT ORDER BY SEG_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001U7", "SELECT T2.Cata_Codigo, T3.Clas_Codigo, T4.FAM_Codigo, T5.SEG_Codigo, T1.Tran_Id, T2.Tipo_Codigo, T3.Cata_Descripcion, T1.Elem_Consecutivo, T2.Elem_Descripcion, T1.TDet_PlacaNumero, T1.TDet_PlacaPadre, T2.UNIMED_COD, T1.TDet_Cantidad, T1.TDet_ValorTotal, T1.TDet_ValorUnitario, T1.TDet_Otros_Costos, T1.TDet_Valor_Presente, T1.TDet_Consecutivo FROM ((((ALM_DETALLE_TRANSACCION T1 INNER JOIN ALM_ELEMENTO T2 ON T2.Elem_Consecutivo = T1.Elem_Consecutivo) INNER JOIN ALM_CATALOGO T3 ON T3.Cata_Codigo = T2.Cata_Codigo) INNER JOIN ALM_CLASE T4 ON T4.Clas_Codigo = T3.Clas_Codigo) INNER JOIN ALM_CAT_FAM T5 ON T5.FAM_Codigo = T4.FAM_Codigo) WHERE T1.Tran_Id = ? and T5.SEG_Codigo = ? ORDER BY T1.Tran_Id, T5.SEG_Codigo, T1.TDet_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001U8", "SELECT * FROM (SELECT T1.TDet_PlacaNumero, T2.Tran_IndE_S AS Tran_IndE_S, T1.Tran_Id, T1.TDet_Consecutivo FROM (ALM_DETALLE_TRANSACCION T1 INNER JOIN ALM_TRANSACCION T2 ON T2.Tran_Id = T1.Tran_Id) WHERE (T1.TDet_PlacaNumero = ?) AND (T2.Tran_IndE_S = 'E') ORDER BY T1.Tran_Id, T1.TDet_Consecutivo) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P001U9", "SELECT TDet_Consecutivo, Tran_Id, Tran_Entrada, Nro_Linea FROM ALM_DET_TRAN_DATOS_SALIDA WHERE Tran_Id = ? and TDet_Consecutivo = ? ORDER BY Tran_Id, TDet_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001U10", "SELECT T1.TDet_ListId AS TDet_ListId, T1.TDet_Consecutivo, T1.Tran_Id, T1.TDet_ValorAtributo, T2.List_Descripcion AS TDet_ListDescripcion FROM (ALM_DETALLE_TRANSACCIONATRIBUT T1 INNER JOIN ALM_LISTA_ATRIBUTOS T2 ON T2.List_Id = T1.TDet_ListId) WHERE T1.Tran_Id = ? and T1.TDet_Consecutivo = ? ORDER BY T1.Tran_Id, T1.TDet_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001U11", "SELECT T1.Tran_IdProveedor AS Tran_IdProveedor, T1.Tran_TipoIngreso AS Tran_TipoIngreso, T1.Tran_Id, T3.Orig_Descripcion_Abreviado AS Tran_Abreviado, T1.Tran_NumeroIngreso, T1.Tran_FechaIngreso, T2.Cuen_Nombre AS Tran_NombreProveedor FROM ((ALM_TRANSACCION T1 LEFT JOIN ALM_CUENTADANTE T2 ON T2.Cuen_Identificacion = T1.Tran_IdProveedor) LEFT JOIN ALM_ORIGEN_BIENES T3 ON T3.Orig_Identificador = T1.Tran_TipoIngreso) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P001U12", "SELECT Tpmo_Codigo, Tpmo_ImprimeOrigen, Tpmo_ImprimeDestino, Tmpo_ImprimeResponsable FROM ALM_TIPO_MOVIMIENTO WHERE Tpmo_Codigo = ? ORDER BY Tpmo_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P001U13", "SELECT * FROM (SELECT T1.Alma_IdResponsable AS Alma_IdResponsable, T1.Cent_Id, T2.Cuen_Nombre AS Alma_NombreResponsable, T1.Alma_Modulo, T1.Alma_Codigo FROM (ALM_ALMACEN T1 INNER JOIN ALM_CUENTADANTE T2 ON T2.Cuen_Identificacion = T1.Alma_IdResponsable) WHERE T1.Cent_Id = ? ORDER BY T1.Cent_Id) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5) ;
               ((short[]) buf[9])[0] = rslt.getShort(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(8) ;
               ((String[]) buf[14])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 1) ;
               ((String[]) buf[22])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((long[]) buf[24])[0] = rslt.getLong(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDateTime(16) ;
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(18,2) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(19, 1) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(20) ;
               ((String[]) buf[34])[0] = rslt.getVarchar(21) ;
               ((String[]) buf[35])[0] = rslt.getVarchar(22) ;
               ((long[]) buf[36])[0] = rslt.getLong(23) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((long[]) buf[38])[0] = rslt.getLong(24) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((long[]) buf[40])[0] = rslt.getLong(25) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(27) ;
               ((String[]) buf[45])[0] = rslt.getVarchar(28) ;
               ((String[]) buf[46])[0] = rslt.getVarchar(29) ;
               ((long[]) buf[47])[0] = rslt.getLong(30) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((short[]) buf[49])[0] = rslt.getShort(31) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(32) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getVarchar(33) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((long[]) buf[5])[0] = rslt.getLong(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(12) ;
               ((long[]) buf[14])[0] = rslt.getLong(13) ;
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,2) ;
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,2) ;
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(17,2) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(18) ;
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               return;
            case 8 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 30) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 11 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
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
               stmt.setVarchar(2, (String)parms[1], 8);
               stmt.setVarchar(3, (String)parms[2], 2);
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 8);
               stmt.setVarchar(3, (String)parms[2], 2);
               stmt.setVarchar(4, (String)parms[3], 3);
               return;
            case 3 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 3);
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 30);
               }
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 3);
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

