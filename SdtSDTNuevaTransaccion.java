/*
               File: SdtSDTNuevaTransaccion
        Description: SDTNuevaTransaccion
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:19.12
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTNuevaTransaccion extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTNuevaTransaccion( )
   {
      this(  new ModelContext(SdtSDTNuevaTransaccion.class));
   }

   public SdtSDTNuevaTransaccion( ModelContext context )
   {
      super( context, "SdtSDTNuevaTransaccion");
   }

   public SdtSDTNuevaTransaccion( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTNuevaTransaccion");
   }

   public SdtSDTNuevaTransaccion( StructSdtSDTNuevaTransaccion struct )
   {
      this();
      setStruct(struct);
   }

   private static java.util.HashMap mapper = new java.util.HashMap();
   static
   {
   }

   public String getJsonMap( String value )
   {
      return (String) mapper.get(value);
   }

   public short readxml( com.genexus.xml.XMLReader oReader ,
                         String sName )
   {
      short GXSoapError = 1 ;
      sTagName = oReader.getName() ;
      if ( oReader.getIsSimple() == 0 )
      {
         GXSoapError = oReader.read() ;
         nOutParmCount = (short)(0) ;
         while ( ( ( GXutil.strcmp(oReader.getName(), sTagName) != 0 ) || ( oReader.getNodeType() == 1 ) ) && ( GXSoapError > 0 ) )
         {
            readOk = (short)(0) ;
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_Id") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_FechaRegistro") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTNuevaTransaccion_Tran_fecharegistro = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtSDTNuevaTransaccion_Tran_fecharegistro = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CodigoMovimiento") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_codigomovimiento = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_ModuloOrigen") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_moduloorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CodAlmaOrigen") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_codalmaorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CodBodeOrigen") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_codbodeorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_IdCuentadanteOrigen") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_idcuentadanteorigen = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_ModuloDestino") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_modulodestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CodAlmaDestino") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_codalmadestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CodBodeDestino") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_codbodedestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_IdCuentadanteDestino") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_idcuentadantedestino = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_FechaRatificacion") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTNuevaTransaccion_Tran_fecharatificacion = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtSDTNuevaTransaccion_Tran_fecharatificacion = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_UsuarioRatifica") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_usuarioratifica = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_Estado") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_estado = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_UsuarioId") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_usuarioid = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CentroCostoId") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_centrocostoid = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_RegionId") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_regionid = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_IndE_S") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_inde_s = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_TipoElemento") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_tipoelemento = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_Observaciones") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_observaciones = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_AreadanteCodigo") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_areadantecodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CursoCodigo") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_cursocodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_ValorTransaccion") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_valortransaccion = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_NumeroLineas") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_numerolineas = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_ConsecutivoCC") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_consecutivocc = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_TipoIngreso") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_tipoingreso = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_NumeroIngreso") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_numeroingreso = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_FechaIngreso") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTNuevaTransaccion_Tran_fechaingreso = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtSDTNuevaTransaccion_Tran_fechaingreso = localUtil.ymdtod( (int)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (int)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (int)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CentroCostoIdDestino") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_centrocostoiddestino = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_RegionIdDestino") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_regioniddestino = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_TipoEntra") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_tipoentra = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CantidadPadres") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_cantidadpadres = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_IdProveedor") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_idproveedor = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_Detalle") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_detalle = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_IdCuentadanteResponsabilidad") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_idcuentadanteresponsabilidad = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_TransaccResponsabilidad") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_transaccresponsabilidad = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_FechaResponsabilidad") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTNuevaTransaccion_Tran_fecharesponsabilidad = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtSDTNuevaTransaccion_Tran_fecharesponsabilidad = localUtil.ymdtod( (int)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (int)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (int)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_TablaResponsabilidad") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_tablaresponsabilidad = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_EntidadGobierno") )
            {
               gxTv_SdtSDTNuevaTransaccion_Tran_entidadgobierno = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            nOutParmCount = (short)(nOutParmCount+1) ;
            if ( readOk == 0 )
            {
               context.globals.sSOAPErrMsg = context.globals.sSOAPErrMsg + "Error reading " + sTagName + GXutil.newLine( ) ;
               context.globals.sSOAPErrMsg = context.globals.sSOAPErrMsg + "Message: " + oReader.readRawXML() ;
               GXSoapError = (short)(nOutParmCount*-1) ;
            }
         }
      }
      return GXSoapError ;
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace )
   {
      writexml(oWriter, sName, sNameSpace, true);
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace ,
                         boolean sIncludeState )
   {
      if ( (GXutil.strcmp("", sName)==0) )
      {
         sName = "SDTNuevaTransaccion" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "ACBSENA" ;
      }
      oWriter.writeStartElement(sName);
      if ( GXutil.strcmp(GXutil.left( sNameSpace, 10), "[*:nosend]") != 0 )
      {
         oWriter.writeAttribute("xmlns", sNameSpace);
      }
      else
      {
         sNameSpace = GXutil.right( sNameSpace, GXutil.len( sNameSpace)-10) ;
      }
      oWriter.writeElement("Tran_Id", GXutil.trim( GXutil.str( gxTv_SdtSDTNuevaTransaccion_Tran_id, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTNuevaTransaccion_Tran_fecharegistro) )
      {
         oWriter.writeStartElement("Tran_FechaRegistro");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTNuevaTransaccion_Tran_fecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTNuevaTransaccion_Tran_fecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTNuevaTransaccion_Tran_fecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSDTNuevaTransaccion_Tran_fecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSDTNuevaTransaccion_Tran_fecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSDTNuevaTransaccion_Tran_fecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Tran_FechaRegistro", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
      }
      oWriter.writeElement("Tran_CodigoMovimiento", GXutil.rtrim( gxTv_SdtSDTNuevaTransaccion_Tran_codigomovimiento));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_ModuloOrigen", GXutil.rtrim( gxTv_SdtSDTNuevaTransaccion_Tran_moduloorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CodAlmaOrigen", GXutil.rtrim( gxTv_SdtSDTNuevaTransaccion_Tran_codalmaorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CodBodeOrigen", GXutil.rtrim( gxTv_SdtSDTNuevaTransaccion_Tran_codbodeorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_IdCuentadanteOrigen", GXutil.trim( GXutil.str( gxTv_SdtSDTNuevaTransaccion_Tran_idcuentadanteorigen, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_ModuloDestino", GXutil.rtrim( gxTv_SdtSDTNuevaTransaccion_Tran_modulodestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CodAlmaDestino", GXutil.rtrim( gxTv_SdtSDTNuevaTransaccion_Tran_codalmadestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CodBodeDestino", GXutil.rtrim( gxTv_SdtSDTNuevaTransaccion_Tran_codbodedestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_IdCuentadanteDestino", GXutil.trim( GXutil.str( gxTv_SdtSDTNuevaTransaccion_Tran_idcuentadantedestino, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTNuevaTransaccion_Tran_fecharatificacion) )
      {
         oWriter.writeStartElement("Tran_FechaRatificacion");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTNuevaTransaccion_Tran_fecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTNuevaTransaccion_Tran_fecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTNuevaTransaccion_Tran_fecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSDTNuevaTransaccion_Tran_fecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSDTNuevaTransaccion_Tran_fecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSDTNuevaTransaccion_Tran_fecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Tran_FechaRatificacion", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
      }
      oWriter.writeElement("Tran_UsuarioRatifica", GXutil.rtrim( gxTv_SdtSDTNuevaTransaccion_Tran_usuarioratifica));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_Estado", GXutil.rtrim( gxTv_SdtSDTNuevaTransaccion_Tran_estado));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_UsuarioId", GXutil.trim( GXutil.str( gxTv_SdtSDTNuevaTransaccion_Tran_usuarioid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CentroCostoId", GXutil.trim( GXutil.str( gxTv_SdtSDTNuevaTransaccion_Tran_centrocostoid, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_RegionId", GXutil.trim( GXutil.str( gxTv_SdtSDTNuevaTransaccion_Tran_regionid, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_IndE_S", GXutil.rtrim( gxTv_SdtSDTNuevaTransaccion_Tran_inde_s));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_TipoElemento", GXutil.rtrim( gxTv_SdtSDTNuevaTransaccion_Tran_tipoelemento));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_Observaciones", GXutil.rtrim( gxTv_SdtSDTNuevaTransaccion_Tran_observaciones));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_AreadanteCodigo", GXutil.rtrim( gxTv_SdtSDTNuevaTransaccion_Tran_areadantecodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CursoCodigo", GXutil.rtrim( gxTv_SdtSDTNuevaTransaccion_Tran_cursocodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_ValorTransaccion", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTNuevaTransaccion_Tran_valortransaccion, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_NumeroLineas", GXutil.trim( GXutil.str( gxTv_SdtSDTNuevaTransaccion_Tran_numerolineas, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_ConsecutivoCC", GXutil.trim( GXutil.str( gxTv_SdtSDTNuevaTransaccion_Tran_consecutivocc, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_TipoIngreso", GXutil.trim( GXutil.str( gxTv_SdtSDTNuevaTransaccion_Tran_tipoingreso, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_NumeroIngreso", GXutil.rtrim( gxTv_SdtSDTNuevaTransaccion_Tran_numeroingreso));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTNuevaTransaccion_Tran_fechaingreso) )
      {
         oWriter.writeStartElement("Tran_FechaIngreso");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTNuevaTransaccion_Tran_fechaingreso), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTNuevaTransaccion_Tran_fechaingreso), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTNuevaTransaccion_Tran_fechaingreso), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Tran_FechaIngreso", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
      }
      oWriter.writeElement("Tran_CentroCostoIdDestino", GXutil.trim( GXutil.str( gxTv_SdtSDTNuevaTransaccion_Tran_centrocostoiddestino, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_RegionIdDestino", GXutil.trim( GXutil.str( gxTv_SdtSDTNuevaTransaccion_Tran_regioniddestino, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_TipoEntra", GXutil.rtrim( gxTv_SdtSDTNuevaTransaccion_Tran_tipoentra));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CantidadPadres", GXutil.trim( GXutil.str( gxTv_SdtSDTNuevaTransaccion_Tran_cantidadpadres, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_IdProveedor", GXutil.trim( GXutil.str( gxTv_SdtSDTNuevaTransaccion_Tran_idproveedor, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_Detalle", GXutil.rtrim( gxTv_SdtSDTNuevaTransaccion_Tran_detalle));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_IdCuentadanteResponsabilidad", GXutil.trim( GXutil.str( gxTv_SdtSDTNuevaTransaccion_Tran_idcuentadanteresponsabilidad, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_TransaccResponsabilidad", GXutil.trim( GXutil.str( gxTv_SdtSDTNuevaTransaccion_Tran_transaccresponsabilidad, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTNuevaTransaccion_Tran_fecharesponsabilidad) )
      {
         oWriter.writeStartElement("Tran_FechaResponsabilidad");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTNuevaTransaccion_Tran_fecharesponsabilidad), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTNuevaTransaccion_Tran_fecharesponsabilidad), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTNuevaTransaccion_Tran_fecharesponsabilidad), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Tran_FechaResponsabilidad", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
      }
      oWriter.writeElement("Tran_TablaResponsabilidad", GXutil.trim( GXutil.str( gxTv_SdtSDTNuevaTransaccion_Tran_tablaresponsabilidad, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_EntidadGobierno", GXutil.rtrim( gxTv_SdtSDTNuevaTransaccion_Tran_entidadgobierno));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("Tran_Id", gxTv_SdtSDTNuevaTransaccion_Tran_id, false);
      datetime_STZ = gxTv_SdtSDTNuevaTransaccion_Tran_fecharegistro ;
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Tran_FechaRegistro", sDateCnv, false);
      AddObjectProperty("Tran_CodigoMovimiento", gxTv_SdtSDTNuevaTransaccion_Tran_codigomovimiento, false);
      AddObjectProperty("Tran_ModuloOrigen", gxTv_SdtSDTNuevaTransaccion_Tran_moduloorigen, false);
      AddObjectProperty("Tran_CodAlmaOrigen", gxTv_SdtSDTNuevaTransaccion_Tran_codalmaorigen, false);
      AddObjectProperty("Tran_CodBodeOrigen", gxTv_SdtSDTNuevaTransaccion_Tran_codbodeorigen, false);
      AddObjectProperty("Tran_IdCuentadanteOrigen", GXutil.ltrim( GXutil.str( gxTv_SdtSDTNuevaTransaccion_Tran_idcuentadanteorigen, 18, 0)), false);
      AddObjectProperty("Tran_ModuloDestino", gxTv_SdtSDTNuevaTransaccion_Tran_modulodestino, false);
      AddObjectProperty("Tran_CodAlmaDestino", gxTv_SdtSDTNuevaTransaccion_Tran_codalmadestino, false);
      AddObjectProperty("Tran_CodBodeDestino", gxTv_SdtSDTNuevaTransaccion_Tran_codbodedestino, false);
      AddObjectProperty("Tran_IdCuentadanteDestino", GXutil.ltrim( GXutil.str( gxTv_SdtSDTNuevaTransaccion_Tran_idcuentadantedestino, 18, 0)), false);
      datetime_STZ = gxTv_SdtSDTNuevaTransaccion_Tran_fecharatificacion ;
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Tran_FechaRatificacion", sDateCnv, false);
      AddObjectProperty("Tran_UsuarioRatifica", gxTv_SdtSDTNuevaTransaccion_Tran_usuarioratifica, false);
      AddObjectProperty("Tran_Estado", gxTv_SdtSDTNuevaTransaccion_Tran_estado, false);
      AddObjectProperty("Tran_UsuarioId", GXutil.ltrim( GXutil.str( gxTv_SdtSDTNuevaTransaccion_Tran_usuarioid, 18, 0)), false);
      AddObjectProperty("Tran_CentroCostoId", gxTv_SdtSDTNuevaTransaccion_Tran_centrocostoid, false);
      AddObjectProperty("Tran_RegionId", gxTv_SdtSDTNuevaTransaccion_Tran_regionid, false);
      AddObjectProperty("Tran_IndE_S", gxTv_SdtSDTNuevaTransaccion_Tran_inde_s, false);
      AddObjectProperty("Tran_TipoElemento", gxTv_SdtSDTNuevaTransaccion_Tran_tipoelemento, false);
      AddObjectProperty("Tran_Observaciones", gxTv_SdtSDTNuevaTransaccion_Tran_observaciones, false);
      AddObjectProperty("Tran_AreadanteCodigo", gxTv_SdtSDTNuevaTransaccion_Tran_areadantecodigo, false);
      AddObjectProperty("Tran_CursoCodigo", gxTv_SdtSDTNuevaTransaccion_Tran_cursocodigo, false);
      AddObjectProperty("Tran_ValorTransaccion", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSDTNuevaTransaccion_Tran_valortransaccion, 18, 2)), false);
      AddObjectProperty("Tran_NumeroLineas", GXutil.ltrim( GXutil.str( gxTv_SdtSDTNuevaTransaccion_Tran_numerolineas, 18, 0)), false);
      AddObjectProperty("Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( gxTv_SdtSDTNuevaTransaccion_Tran_consecutivocc, 18, 0)), false);
      AddObjectProperty("Tran_TipoIngreso", gxTv_SdtSDTNuevaTransaccion_Tran_tipoingreso, false);
      AddObjectProperty("Tran_NumeroIngreso", gxTv_SdtSDTNuevaTransaccion_Tran_numeroingreso, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTNuevaTransaccion_Tran_fechaingreso), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTNuevaTransaccion_Tran_fechaingreso), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTNuevaTransaccion_Tran_fechaingreso), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Tran_FechaIngreso", sDateCnv, false);
      AddObjectProperty("Tran_CentroCostoIdDestino", gxTv_SdtSDTNuevaTransaccion_Tran_centrocostoiddestino, false);
      AddObjectProperty("Tran_RegionIdDestino", gxTv_SdtSDTNuevaTransaccion_Tran_regioniddestino, false);
      AddObjectProperty("Tran_TipoEntra", gxTv_SdtSDTNuevaTransaccion_Tran_tipoentra, false);
      AddObjectProperty("Tran_CantidadPadres", gxTv_SdtSDTNuevaTransaccion_Tran_cantidadpadres, false);
      AddObjectProperty("Tran_IdProveedor", GXutil.ltrim( GXutil.str( gxTv_SdtSDTNuevaTransaccion_Tran_idproveedor, 18, 0)), false);
      AddObjectProperty("Tran_Detalle", gxTv_SdtSDTNuevaTransaccion_Tran_detalle, false);
      AddObjectProperty("Tran_IdCuentadanteResponsabilidad", GXutil.ltrim( GXutil.str( gxTv_SdtSDTNuevaTransaccion_Tran_idcuentadanteresponsabilidad, 18, 0)), false);
      AddObjectProperty("Tran_TransaccResponsabilidad", gxTv_SdtSDTNuevaTransaccion_Tran_transaccresponsabilidad, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTNuevaTransaccion_Tran_fecharesponsabilidad), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTNuevaTransaccion_Tran_fecharesponsabilidad), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTNuevaTransaccion_Tran_fecharesponsabilidad), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Tran_FechaResponsabilidad", sDateCnv, false);
      AddObjectProperty("Tran_TablaResponsabilidad", gxTv_SdtSDTNuevaTransaccion_Tran_tablaresponsabilidad, false);
      AddObjectProperty("Tran_EntidadGobierno", gxTv_SdtSDTNuevaTransaccion_Tran_entidadgobierno, false);
   }

   public long getgxTv_SdtSDTNuevaTransaccion_Tran_id( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_id ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_id( long value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_id = value ;
   }

   public java.util.Date getgxTv_SdtSDTNuevaTransaccion_Tran_fecharegistro( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_fecharegistro ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_fecharegistro( java.util.Date value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_fecharegistro = value ;
   }

   public String getgxTv_SdtSDTNuevaTransaccion_Tran_codigomovimiento( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_codigomovimiento ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_codigomovimiento( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_codigomovimiento = value ;
   }

   public String getgxTv_SdtSDTNuevaTransaccion_Tran_moduloorigen( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_moduloorigen ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_moduloorigen( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_moduloorigen = value ;
   }

   public String getgxTv_SdtSDTNuevaTransaccion_Tran_codalmaorigen( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_codalmaorigen ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_codalmaorigen( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_codalmaorigen = value ;
   }

   public String getgxTv_SdtSDTNuevaTransaccion_Tran_codbodeorigen( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_codbodeorigen ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_codbodeorigen( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_codbodeorigen = value ;
   }

   public long getgxTv_SdtSDTNuevaTransaccion_Tran_idcuentadanteorigen( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_idcuentadanteorigen ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_idcuentadanteorigen( long value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_idcuentadanteorigen = value ;
   }

   public String getgxTv_SdtSDTNuevaTransaccion_Tran_modulodestino( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_modulodestino ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_modulodestino( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_modulodestino = value ;
   }

   public String getgxTv_SdtSDTNuevaTransaccion_Tran_codalmadestino( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_codalmadestino ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_codalmadestino( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_codalmadestino = value ;
   }

   public String getgxTv_SdtSDTNuevaTransaccion_Tran_codbodedestino( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_codbodedestino ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_codbodedestino( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_codbodedestino = value ;
   }

   public long getgxTv_SdtSDTNuevaTransaccion_Tran_idcuentadantedestino( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_idcuentadantedestino ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_idcuentadantedestino( long value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_idcuentadantedestino = value ;
   }

   public java.util.Date getgxTv_SdtSDTNuevaTransaccion_Tran_fecharatificacion( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_fecharatificacion ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_fecharatificacion( java.util.Date value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_fecharatificacion = value ;
   }

   public String getgxTv_SdtSDTNuevaTransaccion_Tran_usuarioratifica( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_usuarioratifica ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_usuarioratifica( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_usuarioratifica = value ;
   }

   public String getgxTv_SdtSDTNuevaTransaccion_Tran_estado( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_estado ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_estado( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_estado = value ;
   }

   public long getgxTv_SdtSDTNuevaTransaccion_Tran_usuarioid( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_usuarioid ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_usuarioid( long value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_usuarioid = value ;
   }

   public long getgxTv_SdtSDTNuevaTransaccion_Tran_centrocostoid( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_centrocostoid ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_centrocostoid( long value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_centrocostoid = value ;
   }

   public long getgxTv_SdtSDTNuevaTransaccion_Tran_regionid( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_regionid ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_regionid( long value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_regionid = value ;
   }

   public String getgxTv_SdtSDTNuevaTransaccion_Tran_inde_s( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_inde_s ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_inde_s( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_inde_s = value ;
   }

   public String getgxTv_SdtSDTNuevaTransaccion_Tran_tipoelemento( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_tipoelemento ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_tipoelemento( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_tipoelemento = value ;
   }

   public String getgxTv_SdtSDTNuevaTransaccion_Tran_observaciones( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_observaciones ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_observaciones( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_observaciones = value ;
   }

   public String getgxTv_SdtSDTNuevaTransaccion_Tran_areadantecodigo( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_areadantecodigo ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_areadantecodigo( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_areadantecodigo = value ;
   }

   public String getgxTv_SdtSDTNuevaTransaccion_Tran_cursocodigo( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_cursocodigo ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_cursocodigo( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_cursocodigo = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTNuevaTransaccion_Tran_valortransaccion( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_valortransaccion ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_valortransaccion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_valortransaccion = value ;
   }

   public long getgxTv_SdtSDTNuevaTransaccion_Tran_numerolineas( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_numerolineas ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_numerolineas( long value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_numerolineas = value ;
   }

   public long getgxTv_SdtSDTNuevaTransaccion_Tran_consecutivocc( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_consecutivocc ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_consecutivocc( long value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_consecutivocc = value ;
   }

   public long getgxTv_SdtSDTNuevaTransaccion_Tran_tipoingreso( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_tipoingreso ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_tipoingreso( long value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_tipoingreso = value ;
   }

   public String getgxTv_SdtSDTNuevaTransaccion_Tran_numeroingreso( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_numeroingreso ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_numeroingreso( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_numeroingreso = value ;
   }

   public java.util.Date getgxTv_SdtSDTNuevaTransaccion_Tran_fechaingreso( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_fechaingreso ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_fechaingreso( java.util.Date value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_fechaingreso = value ;
   }

   public long getgxTv_SdtSDTNuevaTransaccion_Tran_centrocostoiddestino( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_centrocostoiddestino ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_centrocostoiddestino( long value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_centrocostoiddestino = value ;
   }

   public long getgxTv_SdtSDTNuevaTransaccion_Tran_regioniddestino( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_regioniddestino ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_regioniddestino( long value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_regioniddestino = value ;
   }

   public String getgxTv_SdtSDTNuevaTransaccion_Tran_tipoentra( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_tipoentra ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_tipoentra( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_tipoentra = value ;
   }

   public int getgxTv_SdtSDTNuevaTransaccion_Tran_cantidadpadres( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_cantidadpadres ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_cantidadpadres( int value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_cantidadpadres = value ;
   }

   public long getgxTv_SdtSDTNuevaTransaccion_Tran_idproveedor( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_idproveedor ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_idproveedor( long value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_idproveedor = value ;
   }

   public String getgxTv_SdtSDTNuevaTransaccion_Tran_detalle( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_detalle ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_detalle( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_detalle = value ;
   }

   public long getgxTv_SdtSDTNuevaTransaccion_Tran_idcuentadanteresponsabilidad( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_idcuentadanteresponsabilidad ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_idcuentadanteresponsabilidad( long value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_idcuentadanteresponsabilidad = value ;
   }

   public long getgxTv_SdtSDTNuevaTransaccion_Tran_transaccresponsabilidad( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_transaccresponsabilidad ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_transaccresponsabilidad( long value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_transaccresponsabilidad = value ;
   }

   public java.util.Date getgxTv_SdtSDTNuevaTransaccion_Tran_fecharesponsabilidad( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_fecharesponsabilidad ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_fecharesponsabilidad( java.util.Date value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_fecharesponsabilidad = value ;
   }

   public short getgxTv_SdtSDTNuevaTransaccion_Tran_tablaresponsabilidad( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_tablaresponsabilidad ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_tablaresponsabilidad( short value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_tablaresponsabilidad = value ;
   }

   public String getgxTv_SdtSDTNuevaTransaccion_Tran_entidadgobierno( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_entidadgobierno ;
   }

   public void setgxTv_SdtSDTNuevaTransaccion_Tran_entidadgobierno( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_entidadgobierno = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_fecharegistro = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSDTNuevaTransaccion_Tran_codigomovimiento = "" ;
      gxTv_SdtSDTNuevaTransaccion_Tran_moduloorigen = "" ;
      gxTv_SdtSDTNuevaTransaccion_Tran_codalmaorigen = "" ;
      gxTv_SdtSDTNuevaTransaccion_Tran_codbodeorigen = "" ;
      gxTv_SdtSDTNuevaTransaccion_Tran_modulodestino = "" ;
      gxTv_SdtSDTNuevaTransaccion_Tran_codalmadestino = "" ;
      gxTv_SdtSDTNuevaTransaccion_Tran_codbodedestino = "" ;
      gxTv_SdtSDTNuevaTransaccion_Tran_fecharatificacion = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSDTNuevaTransaccion_Tran_usuarioratifica = "" ;
      gxTv_SdtSDTNuevaTransaccion_Tran_estado = "" ;
      gxTv_SdtSDTNuevaTransaccion_Tran_inde_s = "" ;
      gxTv_SdtSDTNuevaTransaccion_Tran_tipoelemento = "" ;
      gxTv_SdtSDTNuevaTransaccion_Tran_observaciones = "" ;
      gxTv_SdtSDTNuevaTransaccion_Tran_areadantecodigo = "" ;
      gxTv_SdtSDTNuevaTransaccion_Tran_cursocodigo = "" ;
      gxTv_SdtSDTNuevaTransaccion_Tran_valortransaccion = DecimalUtil.ZERO ;
      gxTv_SdtSDTNuevaTransaccion_Tran_numeroingreso = "" ;
      gxTv_SdtSDTNuevaTransaccion_Tran_fechaingreso = GXutil.nullDate() ;
      gxTv_SdtSDTNuevaTransaccion_Tran_tipoentra = "" ;
      gxTv_SdtSDTNuevaTransaccion_Tran_detalle = "" ;
      gxTv_SdtSDTNuevaTransaccion_Tran_fecharesponsabilidad = GXutil.nullDate() ;
      gxTv_SdtSDTNuevaTransaccion_Tran_entidadgobierno = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public com.orions2.SdtSDTNuevaTransaccion Clone( )
   {
      return (com.orions2.SdtSDTNuevaTransaccion)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTNuevaTransaccion struct )
   {
      setgxTv_SdtSDTNuevaTransaccion_Tran_id(struct.getTran_id());
      setgxTv_SdtSDTNuevaTransaccion_Tran_fecharegistro(struct.getTran_fecharegistro());
      setgxTv_SdtSDTNuevaTransaccion_Tran_codigomovimiento(struct.getTran_codigomovimiento());
      setgxTv_SdtSDTNuevaTransaccion_Tran_moduloorigen(struct.getTran_moduloorigen());
      setgxTv_SdtSDTNuevaTransaccion_Tran_codalmaorigen(struct.getTran_codalmaorigen());
      setgxTv_SdtSDTNuevaTransaccion_Tran_codbodeorigen(struct.getTran_codbodeorigen());
      setgxTv_SdtSDTNuevaTransaccion_Tran_idcuentadanteorigen(struct.getTran_idcuentadanteorigen());
      setgxTv_SdtSDTNuevaTransaccion_Tran_modulodestino(struct.getTran_modulodestino());
      setgxTv_SdtSDTNuevaTransaccion_Tran_codalmadestino(struct.getTran_codalmadestino());
      setgxTv_SdtSDTNuevaTransaccion_Tran_codbodedestino(struct.getTran_codbodedestino());
      setgxTv_SdtSDTNuevaTransaccion_Tran_idcuentadantedestino(struct.getTran_idcuentadantedestino());
      setgxTv_SdtSDTNuevaTransaccion_Tran_fecharatificacion(struct.getTran_fecharatificacion());
      setgxTv_SdtSDTNuevaTransaccion_Tran_usuarioratifica(struct.getTran_usuarioratifica());
      setgxTv_SdtSDTNuevaTransaccion_Tran_estado(struct.getTran_estado());
      setgxTv_SdtSDTNuevaTransaccion_Tran_usuarioid(struct.getTran_usuarioid());
      setgxTv_SdtSDTNuevaTransaccion_Tran_centrocostoid(struct.getTran_centrocostoid());
      setgxTv_SdtSDTNuevaTransaccion_Tran_regionid(struct.getTran_regionid());
      setgxTv_SdtSDTNuevaTransaccion_Tran_inde_s(struct.getTran_inde_s());
      setgxTv_SdtSDTNuevaTransaccion_Tran_tipoelemento(struct.getTran_tipoelemento());
      setgxTv_SdtSDTNuevaTransaccion_Tran_observaciones(struct.getTran_observaciones());
      setgxTv_SdtSDTNuevaTransaccion_Tran_areadantecodigo(struct.getTran_areadantecodigo());
      setgxTv_SdtSDTNuevaTransaccion_Tran_cursocodigo(struct.getTran_cursocodigo());
      setgxTv_SdtSDTNuevaTransaccion_Tran_valortransaccion(struct.getTran_valortransaccion());
      setgxTv_SdtSDTNuevaTransaccion_Tran_numerolineas(struct.getTran_numerolineas());
      setgxTv_SdtSDTNuevaTransaccion_Tran_consecutivocc(struct.getTran_consecutivocc());
      setgxTv_SdtSDTNuevaTransaccion_Tran_tipoingreso(struct.getTran_tipoingreso());
      setgxTv_SdtSDTNuevaTransaccion_Tran_numeroingreso(struct.getTran_numeroingreso());
      setgxTv_SdtSDTNuevaTransaccion_Tran_fechaingreso(struct.getTran_fechaingreso());
      setgxTv_SdtSDTNuevaTransaccion_Tran_centrocostoiddestino(struct.getTran_centrocostoiddestino());
      setgxTv_SdtSDTNuevaTransaccion_Tran_regioniddestino(struct.getTran_regioniddestino());
      setgxTv_SdtSDTNuevaTransaccion_Tran_tipoentra(struct.getTran_tipoentra());
      setgxTv_SdtSDTNuevaTransaccion_Tran_cantidadpadres(struct.getTran_cantidadpadres());
      setgxTv_SdtSDTNuevaTransaccion_Tran_idproveedor(struct.getTran_idproveedor());
      setgxTv_SdtSDTNuevaTransaccion_Tran_detalle(struct.getTran_detalle());
      setgxTv_SdtSDTNuevaTransaccion_Tran_idcuentadanteresponsabilidad(struct.getTran_idcuentadanteresponsabilidad());
      setgxTv_SdtSDTNuevaTransaccion_Tran_transaccresponsabilidad(struct.getTran_transaccresponsabilidad());
      setgxTv_SdtSDTNuevaTransaccion_Tran_fecharesponsabilidad(struct.getTran_fecharesponsabilidad());
      setgxTv_SdtSDTNuevaTransaccion_Tran_tablaresponsabilidad(struct.getTran_tablaresponsabilidad());
      setgxTv_SdtSDTNuevaTransaccion_Tran_entidadgobierno(struct.getTran_entidadgobierno());
   }

   public com.orions2.StructSdtSDTNuevaTransaccion getStruct( )
   {
      com.orions2.StructSdtSDTNuevaTransaccion struct = new com.orions2.StructSdtSDTNuevaTransaccion ();
      struct.setTran_id(getgxTv_SdtSDTNuevaTransaccion_Tran_id());
      struct.setTran_fecharegistro(getgxTv_SdtSDTNuevaTransaccion_Tran_fecharegistro());
      struct.setTran_codigomovimiento(getgxTv_SdtSDTNuevaTransaccion_Tran_codigomovimiento());
      struct.setTran_moduloorigen(getgxTv_SdtSDTNuevaTransaccion_Tran_moduloorigen());
      struct.setTran_codalmaorigen(getgxTv_SdtSDTNuevaTransaccion_Tran_codalmaorigen());
      struct.setTran_codbodeorigen(getgxTv_SdtSDTNuevaTransaccion_Tran_codbodeorigen());
      struct.setTran_idcuentadanteorigen(getgxTv_SdtSDTNuevaTransaccion_Tran_idcuentadanteorigen());
      struct.setTran_modulodestino(getgxTv_SdtSDTNuevaTransaccion_Tran_modulodestino());
      struct.setTran_codalmadestino(getgxTv_SdtSDTNuevaTransaccion_Tran_codalmadestino());
      struct.setTran_codbodedestino(getgxTv_SdtSDTNuevaTransaccion_Tran_codbodedestino());
      struct.setTran_idcuentadantedestino(getgxTv_SdtSDTNuevaTransaccion_Tran_idcuentadantedestino());
      struct.setTran_fecharatificacion(getgxTv_SdtSDTNuevaTransaccion_Tran_fecharatificacion());
      struct.setTran_usuarioratifica(getgxTv_SdtSDTNuevaTransaccion_Tran_usuarioratifica());
      struct.setTran_estado(getgxTv_SdtSDTNuevaTransaccion_Tran_estado());
      struct.setTran_usuarioid(getgxTv_SdtSDTNuevaTransaccion_Tran_usuarioid());
      struct.setTran_centrocostoid(getgxTv_SdtSDTNuevaTransaccion_Tran_centrocostoid());
      struct.setTran_regionid(getgxTv_SdtSDTNuevaTransaccion_Tran_regionid());
      struct.setTran_inde_s(getgxTv_SdtSDTNuevaTransaccion_Tran_inde_s());
      struct.setTran_tipoelemento(getgxTv_SdtSDTNuevaTransaccion_Tran_tipoelemento());
      struct.setTran_observaciones(getgxTv_SdtSDTNuevaTransaccion_Tran_observaciones());
      struct.setTran_areadantecodigo(getgxTv_SdtSDTNuevaTransaccion_Tran_areadantecodigo());
      struct.setTran_cursocodigo(getgxTv_SdtSDTNuevaTransaccion_Tran_cursocodigo());
      struct.setTran_valortransaccion(getgxTv_SdtSDTNuevaTransaccion_Tran_valortransaccion());
      struct.setTran_numerolineas(getgxTv_SdtSDTNuevaTransaccion_Tran_numerolineas());
      struct.setTran_consecutivocc(getgxTv_SdtSDTNuevaTransaccion_Tran_consecutivocc());
      struct.setTran_tipoingreso(getgxTv_SdtSDTNuevaTransaccion_Tran_tipoingreso());
      struct.setTran_numeroingreso(getgxTv_SdtSDTNuevaTransaccion_Tran_numeroingreso());
      struct.setTran_fechaingreso(getgxTv_SdtSDTNuevaTransaccion_Tran_fechaingreso());
      struct.setTran_centrocostoiddestino(getgxTv_SdtSDTNuevaTransaccion_Tran_centrocostoiddestino());
      struct.setTran_regioniddestino(getgxTv_SdtSDTNuevaTransaccion_Tran_regioniddestino());
      struct.setTran_tipoentra(getgxTv_SdtSDTNuevaTransaccion_Tran_tipoentra());
      struct.setTran_cantidadpadres(getgxTv_SdtSDTNuevaTransaccion_Tran_cantidadpadres());
      struct.setTran_idproveedor(getgxTv_SdtSDTNuevaTransaccion_Tran_idproveedor());
      struct.setTran_detalle(getgxTv_SdtSDTNuevaTransaccion_Tran_detalle());
      struct.setTran_idcuentadanteresponsabilidad(getgxTv_SdtSDTNuevaTransaccion_Tran_idcuentadanteresponsabilidad());
      struct.setTran_transaccresponsabilidad(getgxTv_SdtSDTNuevaTransaccion_Tran_transaccresponsabilidad());
      struct.setTran_fecharesponsabilidad(getgxTv_SdtSDTNuevaTransaccion_Tran_fecharesponsabilidad());
      struct.setTran_tablaresponsabilidad(getgxTv_SdtSDTNuevaTransaccion_Tran_tablaresponsabilidad());
      struct.setTran_entidadgobierno(getgxTv_SdtSDTNuevaTransaccion_Tran_entidadgobierno());
      return struct ;
   }

   protected short gxTv_SdtSDTNuevaTransaccion_Tran_tablaresponsabilidad ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTNuevaTransaccion_Tran_cantidadpadres ;
   protected long gxTv_SdtSDTNuevaTransaccion_Tran_id ;
   protected long gxTv_SdtSDTNuevaTransaccion_Tran_idcuentadanteorigen ;
   protected long gxTv_SdtSDTNuevaTransaccion_Tran_idcuentadantedestino ;
   protected long gxTv_SdtSDTNuevaTransaccion_Tran_usuarioid ;
   protected long gxTv_SdtSDTNuevaTransaccion_Tran_centrocostoid ;
   protected long gxTv_SdtSDTNuevaTransaccion_Tran_regionid ;
   protected long gxTv_SdtSDTNuevaTransaccion_Tran_numerolineas ;
   protected long gxTv_SdtSDTNuevaTransaccion_Tran_consecutivocc ;
   protected long gxTv_SdtSDTNuevaTransaccion_Tran_tipoingreso ;
   protected long gxTv_SdtSDTNuevaTransaccion_Tran_centrocostoiddestino ;
   protected long gxTv_SdtSDTNuevaTransaccion_Tran_regioniddestino ;
   protected long gxTv_SdtSDTNuevaTransaccion_Tran_idproveedor ;
   protected long gxTv_SdtSDTNuevaTransaccion_Tran_idcuentadanteresponsabilidad ;
   protected long gxTv_SdtSDTNuevaTransaccion_Tran_transaccresponsabilidad ;
   protected java.math.BigDecimal gxTv_SdtSDTNuevaTransaccion_Tran_valortransaccion ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_estado ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_tipoelemento ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_numeroingreso ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_tipoentra ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_detalle ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTNuevaTransaccion_Tran_fecharegistro ;
   protected java.util.Date gxTv_SdtSDTNuevaTransaccion_Tran_fecharatificacion ;
   protected java.util.Date datetime_STZ ;
   protected java.util.Date gxTv_SdtSDTNuevaTransaccion_Tran_fechaingreso ;
   protected java.util.Date gxTv_SdtSDTNuevaTransaccion_Tran_fecharesponsabilidad ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_observaciones ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_codigomovimiento ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_moduloorigen ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_codalmaorigen ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_codbodeorigen ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_modulodestino ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_codalmadestino ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_codbodedestino ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_usuarioratifica ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_inde_s ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_areadantecodigo ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_cursocodigo ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_entidadgobierno ;
}

