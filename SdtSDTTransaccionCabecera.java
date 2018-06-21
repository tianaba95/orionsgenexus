/*
               File: SdtSDTTransaccionCabecera
        Description: SDTTransaccionCabecera
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:20.33
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

public final  class SdtSDTTransaccionCabecera extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTTransaccionCabecera( )
   {
      this(  new ModelContext(SdtSDTTransaccionCabecera.class));
   }

   public SdtSDTTransaccionCabecera( ModelContext context )
   {
      super( context, "SdtSDTTransaccionCabecera");
   }

   public SdtSDTTransaccionCabecera( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTTransaccionCabecera");
   }

   public SdtSDTTransaccionCabecera( StructSdtSDTTransaccionCabecera struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranRegionCodigo") )
            {
               gxTv_SdtSDTTransaccionCabecera_Tranregioncodigo = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranRegionAbrev") )
            {
               gxTv_SdtSDTTransaccionCabecera_Tranregionabrev = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranId") )
            {
               gxTv_SdtSDTTransaccionCabecera_Tranid = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranIndES") )
            {
               gxTv_SdtSDTTransaccionCabecera_Tranindes = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranCodigoMovimiento") )
            {
               gxTv_SdtSDTTransaccionCabecera_Trancodigomovimiento = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranConsecutivoCC") )
            {
               gxTv_SdtSDTTransaccionCabecera_Tranconsecutivocc = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranModuloOrigen") )
            {
               gxTv_SdtSDTTransaccionCabecera_Tranmoduloorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranCodAlmaOrigen") )
            {
               gxTv_SdtSDTTransaccionCabecera_Trancodalmaorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranCodBodeOrigen") )
            {
               gxTv_SdtSDTTransaccionCabecera_Trancodbodeorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranIdCuentadanteOrigen") )
            {
               gxTv_SdtSDTTransaccionCabecera_Tranidcuentadanteorigen = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranIdProveedor") )
            {
               gxTv_SdtSDTTransaccionCabecera_Tranidproveedor = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranModuloDestino") )
            {
               gxTv_SdtSDTTransaccionCabecera_Tranmodulodestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranCodAlmaDestino") )
            {
               gxTv_SdtSDTTransaccionCabecera_Trancodalmadestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranCodBodeDestino") )
            {
               gxTv_SdtSDTTransaccionCabecera_Trancodbodedestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranIdCuentadanteDestino") )
            {
               gxTv_SdtSDTTransaccionCabecera_Tranidcuentadantedestino = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranObservaciones") )
            {
               gxTv_SdtSDTTransaccionCabecera_Tranobservaciones = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranEstado") )
            {
               gxTv_SdtSDTTransaccionCabecera_Tranestado = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranFechaRegistro") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTTransaccionCabecera_Tranfecharegistro = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtSDTTransaccionCabecera_Tranfecharegistro = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranFechaRatificacion") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTTransaccionCabecera_Tranfecharatificacion = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtSDTTransaccionCabecera_Tranfecharatificacion = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranCentroCostoCodigo") )
            {
               gxTv_SdtSDTTransaccionCabecera_Trancentrocostocodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranCursoCodigo") )
            {
               gxTv_SdtSDTTransaccionCabecera_Trancursocodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranAreadanteCodigo") )
            {
               gxTv_SdtSDTTransaccionCabecera_Tranareadantecodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranTipoIngreso") )
            {
               gxTv_SdtSDTTransaccionCabecera_Trantipoingreso = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranNumeroIngreso") )
            {
               gxTv_SdtSDTTransaccionCabecera_Trannumeroingreso = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranFechaIngreso") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTTransaccionCabecera_Tranfechaingreso = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtSDTTransaccionCabecera_Tranfechaingreso = localUtil.ymdtod( (int)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (int)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (int)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "lista") )
            {
               if ( gxTv_SdtSDTTransaccionCabecera_Lista == null )
               {
                  gxTv_SdtSDTTransaccionCabecera_Lista = new GXBaseCollection<com.orions2.SdtSDTTransaccionCabecera_listaItem>(com.orions2.SdtSDTTransaccionCabecera_listaItem.class, "SDTTransaccionCabecera.listaItem", "ACBSENA", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTTransaccionCabecera_Lista.readxmlcollection(oReader, "lista", "listaItem") ;
               }
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
         sName = "SDTTransaccionCabecera" ;
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
      oWriter.writeElement("tranRegionCodigo", GXutil.trim( GXutil.str( gxTv_SdtSDTTransaccionCabecera_Tranregioncodigo, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranRegionAbrev", GXutil.rtrim( gxTv_SdtSDTTransaccionCabecera_Tranregionabrev));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranId", GXutil.trim( GXutil.str( gxTv_SdtSDTTransaccionCabecera_Tranid, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranIndES", GXutil.rtrim( gxTv_SdtSDTTransaccionCabecera_Tranindes));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranCodigoMovimiento", GXutil.rtrim( gxTv_SdtSDTTransaccionCabecera_Trancodigomovimiento));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranConsecutivoCC", GXutil.trim( GXutil.str( gxTv_SdtSDTTransaccionCabecera_Tranconsecutivocc, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranModuloOrigen", GXutil.rtrim( gxTv_SdtSDTTransaccionCabecera_Tranmoduloorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranCodAlmaOrigen", GXutil.rtrim( gxTv_SdtSDTTransaccionCabecera_Trancodalmaorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranCodBodeOrigen", GXutil.rtrim( gxTv_SdtSDTTransaccionCabecera_Trancodbodeorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranIdCuentadanteOrigen", GXutil.trim( GXutil.str( gxTv_SdtSDTTransaccionCabecera_Tranidcuentadanteorigen, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranIdProveedor", GXutil.trim( GXutil.str( gxTv_SdtSDTTransaccionCabecera_Tranidproveedor, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranModuloDestino", GXutil.rtrim( gxTv_SdtSDTTransaccionCabecera_Tranmodulodestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranCodAlmaDestino", GXutil.rtrim( gxTv_SdtSDTTransaccionCabecera_Trancodalmadestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranCodBodeDestino", GXutil.rtrim( gxTv_SdtSDTTransaccionCabecera_Trancodbodedestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranIdCuentadanteDestino", GXutil.trim( GXutil.str( gxTv_SdtSDTTransaccionCabecera_Tranidcuentadantedestino, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranObservaciones", GXutil.rtrim( gxTv_SdtSDTTransaccionCabecera_Tranobservaciones));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranEstado", GXutil.rtrim( gxTv_SdtSDTTransaccionCabecera_Tranestado));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTTransaccionCabecera_Tranfecharegistro) )
      {
         oWriter.writeStartElement("tranFechaRegistro");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTTransaccionCabecera_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTTransaccionCabecera_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTTransaccionCabecera_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSDTTransaccionCabecera_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSDTTransaccionCabecera_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSDTTransaccionCabecera_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("tranFechaRegistro", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTTransaccionCabecera_Tranfecharatificacion) )
      {
         oWriter.writeStartElement("tranFechaRatificacion");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTTransaccionCabecera_Tranfecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTTransaccionCabecera_Tranfecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTTransaccionCabecera_Tranfecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSDTTransaccionCabecera_Tranfecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSDTTransaccionCabecera_Tranfecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSDTTransaccionCabecera_Tranfecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("tranFechaRatificacion", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
      }
      oWriter.writeElement("tranCentroCostoCodigo", GXutil.rtrim( gxTv_SdtSDTTransaccionCabecera_Trancentrocostocodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranCursoCodigo", GXutil.rtrim( gxTv_SdtSDTTransaccionCabecera_Trancursocodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranAreadanteCodigo", GXutil.rtrim( gxTv_SdtSDTTransaccionCabecera_Tranareadantecodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranTipoIngreso", GXutil.trim( GXutil.str( gxTv_SdtSDTTransaccionCabecera_Trantipoingreso, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranNumeroIngreso", GXutil.rtrim( gxTv_SdtSDTTransaccionCabecera_Trannumeroingreso));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTTransaccionCabecera_Tranfechaingreso) )
      {
         oWriter.writeStartElement("tranFechaIngreso");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTTransaccionCabecera_Tranfechaingreso), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTTransaccionCabecera_Tranfechaingreso), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTTransaccionCabecera_Tranfechaingreso), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("tranFechaIngreso", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
      }
      if ( gxTv_SdtSDTTransaccionCabecera_Lista != null )
      {
         String sNameSpace1 ;
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "ACBSENA" ;
         }
         else
         {
            sNameSpace1 = "ACBSENA" ;
         }
         gxTv_SdtSDTTransaccionCabecera_Lista.writexmlcollection(oWriter, "lista", sNameSpace1, "listaItem", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("tranRegionCodigo", gxTv_SdtSDTTransaccionCabecera_Tranregioncodigo, false);
      AddObjectProperty("tranRegionAbrev", gxTv_SdtSDTTransaccionCabecera_Tranregionabrev, false);
      AddObjectProperty("tranId", gxTv_SdtSDTTransaccionCabecera_Tranid, false);
      AddObjectProperty("tranIndES", gxTv_SdtSDTTransaccionCabecera_Tranindes, false);
      AddObjectProperty("tranCodigoMovimiento", gxTv_SdtSDTTransaccionCabecera_Trancodigomovimiento, false);
      AddObjectProperty("tranConsecutivoCC", GXutil.ltrim( GXutil.str( gxTv_SdtSDTTransaccionCabecera_Tranconsecutivocc, 18, 0)), false);
      AddObjectProperty("tranModuloOrigen", gxTv_SdtSDTTransaccionCabecera_Tranmoduloorigen, false);
      AddObjectProperty("tranCodAlmaOrigen", gxTv_SdtSDTTransaccionCabecera_Trancodalmaorigen, false);
      AddObjectProperty("tranCodBodeOrigen", gxTv_SdtSDTTransaccionCabecera_Trancodbodeorigen, false);
      AddObjectProperty("tranIdCuentadanteOrigen", GXutil.ltrim( GXutil.str( gxTv_SdtSDTTransaccionCabecera_Tranidcuentadanteorigen, 18, 0)), false);
      AddObjectProperty("tranIdProveedor", GXutil.ltrim( GXutil.str( gxTv_SdtSDTTransaccionCabecera_Tranidproveedor, 18, 0)), false);
      AddObjectProperty("tranModuloDestino", gxTv_SdtSDTTransaccionCabecera_Tranmodulodestino, false);
      AddObjectProperty("tranCodAlmaDestino", gxTv_SdtSDTTransaccionCabecera_Trancodalmadestino, false);
      AddObjectProperty("tranCodBodeDestino", gxTv_SdtSDTTransaccionCabecera_Trancodbodedestino, false);
      AddObjectProperty("tranIdCuentadanteDestino", GXutil.ltrim( GXutil.str( gxTv_SdtSDTTransaccionCabecera_Tranidcuentadantedestino, 18, 0)), false);
      AddObjectProperty("tranObservaciones", gxTv_SdtSDTTransaccionCabecera_Tranobservaciones, false);
      AddObjectProperty("tranEstado", gxTv_SdtSDTTransaccionCabecera_Tranestado, false);
      datetime_STZ = gxTv_SdtSDTTransaccionCabecera_Tranfecharegistro ;
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
      AddObjectProperty("tranFechaRegistro", sDateCnv, false);
      datetime_STZ = gxTv_SdtSDTTransaccionCabecera_Tranfecharatificacion ;
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
      AddObjectProperty("tranFechaRatificacion", sDateCnv, false);
      AddObjectProperty("tranCentroCostoCodigo", gxTv_SdtSDTTransaccionCabecera_Trancentrocostocodigo, false);
      AddObjectProperty("tranCursoCodigo", gxTv_SdtSDTTransaccionCabecera_Trancursocodigo, false);
      AddObjectProperty("tranAreadanteCodigo", gxTv_SdtSDTTransaccionCabecera_Tranareadantecodigo, false);
      AddObjectProperty("tranTipoIngreso", gxTv_SdtSDTTransaccionCabecera_Trantipoingreso, false);
      AddObjectProperty("tranNumeroIngreso", gxTv_SdtSDTTransaccionCabecera_Trannumeroingreso, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTTransaccionCabecera_Tranfechaingreso), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTTransaccionCabecera_Tranfechaingreso), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTTransaccionCabecera_Tranfechaingreso), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("tranFechaIngreso", sDateCnv, false);
      if ( gxTv_SdtSDTTransaccionCabecera_Lista != null )
      {
         AddObjectProperty("lista", gxTv_SdtSDTTransaccionCabecera_Lista, false);
      }
   }

   public short getgxTv_SdtSDTTransaccionCabecera_Tranregioncodigo( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Tranregioncodigo ;
   }

   public void setgxTv_SdtSDTTransaccionCabecera_Tranregioncodigo( short value )
   {
      gxTv_SdtSDTTransaccionCabecera_Tranregioncodigo = value ;
   }

   public String getgxTv_SdtSDTTransaccionCabecera_Tranregionabrev( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Tranregionabrev ;
   }

   public void setgxTv_SdtSDTTransaccionCabecera_Tranregionabrev( String value )
   {
      gxTv_SdtSDTTransaccionCabecera_Tranregionabrev = value ;
   }

   public long getgxTv_SdtSDTTransaccionCabecera_Tranid( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Tranid ;
   }

   public void setgxTv_SdtSDTTransaccionCabecera_Tranid( long value )
   {
      gxTv_SdtSDTTransaccionCabecera_Tranid = value ;
   }

   public String getgxTv_SdtSDTTransaccionCabecera_Tranindes( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Tranindes ;
   }

   public void setgxTv_SdtSDTTransaccionCabecera_Tranindes( String value )
   {
      gxTv_SdtSDTTransaccionCabecera_Tranindes = value ;
   }

   public String getgxTv_SdtSDTTransaccionCabecera_Trancodigomovimiento( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Trancodigomovimiento ;
   }

   public void setgxTv_SdtSDTTransaccionCabecera_Trancodigomovimiento( String value )
   {
      gxTv_SdtSDTTransaccionCabecera_Trancodigomovimiento = value ;
   }

   public long getgxTv_SdtSDTTransaccionCabecera_Tranconsecutivocc( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Tranconsecutivocc ;
   }

   public void setgxTv_SdtSDTTransaccionCabecera_Tranconsecutivocc( long value )
   {
      gxTv_SdtSDTTransaccionCabecera_Tranconsecutivocc = value ;
   }

   public String getgxTv_SdtSDTTransaccionCabecera_Tranmoduloorigen( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Tranmoduloorigen ;
   }

   public void setgxTv_SdtSDTTransaccionCabecera_Tranmoduloorigen( String value )
   {
      gxTv_SdtSDTTransaccionCabecera_Tranmoduloorigen = value ;
   }

   public String getgxTv_SdtSDTTransaccionCabecera_Trancodalmaorigen( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Trancodalmaorigen ;
   }

   public void setgxTv_SdtSDTTransaccionCabecera_Trancodalmaorigen( String value )
   {
      gxTv_SdtSDTTransaccionCabecera_Trancodalmaorigen = value ;
   }

   public String getgxTv_SdtSDTTransaccionCabecera_Trancodbodeorigen( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Trancodbodeorigen ;
   }

   public void setgxTv_SdtSDTTransaccionCabecera_Trancodbodeorigen( String value )
   {
      gxTv_SdtSDTTransaccionCabecera_Trancodbodeorigen = value ;
   }

   public long getgxTv_SdtSDTTransaccionCabecera_Tranidcuentadanteorigen( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Tranidcuentadanteorigen ;
   }

   public void setgxTv_SdtSDTTransaccionCabecera_Tranidcuentadanteorigen( long value )
   {
      gxTv_SdtSDTTransaccionCabecera_Tranidcuentadanteorigen = value ;
   }

   public long getgxTv_SdtSDTTransaccionCabecera_Tranidproveedor( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Tranidproveedor ;
   }

   public void setgxTv_SdtSDTTransaccionCabecera_Tranidproveedor( long value )
   {
      gxTv_SdtSDTTransaccionCabecera_Tranidproveedor = value ;
   }

   public String getgxTv_SdtSDTTransaccionCabecera_Tranmodulodestino( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Tranmodulodestino ;
   }

   public void setgxTv_SdtSDTTransaccionCabecera_Tranmodulodestino( String value )
   {
      gxTv_SdtSDTTransaccionCabecera_Tranmodulodestino = value ;
   }

   public String getgxTv_SdtSDTTransaccionCabecera_Trancodalmadestino( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Trancodalmadestino ;
   }

   public void setgxTv_SdtSDTTransaccionCabecera_Trancodalmadestino( String value )
   {
      gxTv_SdtSDTTransaccionCabecera_Trancodalmadestino = value ;
   }

   public String getgxTv_SdtSDTTransaccionCabecera_Trancodbodedestino( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Trancodbodedestino ;
   }

   public void setgxTv_SdtSDTTransaccionCabecera_Trancodbodedestino( String value )
   {
      gxTv_SdtSDTTransaccionCabecera_Trancodbodedestino = value ;
   }

   public long getgxTv_SdtSDTTransaccionCabecera_Tranidcuentadantedestino( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Tranidcuentadantedestino ;
   }

   public void setgxTv_SdtSDTTransaccionCabecera_Tranidcuentadantedestino( long value )
   {
      gxTv_SdtSDTTransaccionCabecera_Tranidcuentadantedestino = value ;
   }

   public String getgxTv_SdtSDTTransaccionCabecera_Tranobservaciones( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Tranobservaciones ;
   }

   public void setgxTv_SdtSDTTransaccionCabecera_Tranobservaciones( String value )
   {
      gxTv_SdtSDTTransaccionCabecera_Tranobservaciones = value ;
   }

   public String getgxTv_SdtSDTTransaccionCabecera_Tranestado( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Tranestado ;
   }

   public void setgxTv_SdtSDTTransaccionCabecera_Tranestado( String value )
   {
      gxTv_SdtSDTTransaccionCabecera_Tranestado = value ;
   }

   public java.util.Date getgxTv_SdtSDTTransaccionCabecera_Tranfecharegistro( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Tranfecharegistro ;
   }

   public void setgxTv_SdtSDTTransaccionCabecera_Tranfecharegistro( java.util.Date value )
   {
      gxTv_SdtSDTTransaccionCabecera_Tranfecharegistro = value ;
   }

   public java.util.Date getgxTv_SdtSDTTransaccionCabecera_Tranfecharatificacion( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Tranfecharatificacion ;
   }

   public void setgxTv_SdtSDTTransaccionCabecera_Tranfecharatificacion( java.util.Date value )
   {
      gxTv_SdtSDTTransaccionCabecera_Tranfecharatificacion = value ;
   }

   public String getgxTv_SdtSDTTransaccionCabecera_Trancentrocostocodigo( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Trancentrocostocodigo ;
   }

   public void setgxTv_SdtSDTTransaccionCabecera_Trancentrocostocodigo( String value )
   {
      gxTv_SdtSDTTransaccionCabecera_Trancentrocostocodigo = value ;
   }

   public String getgxTv_SdtSDTTransaccionCabecera_Trancursocodigo( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Trancursocodigo ;
   }

   public void setgxTv_SdtSDTTransaccionCabecera_Trancursocodigo( String value )
   {
      gxTv_SdtSDTTransaccionCabecera_Trancursocodigo = value ;
   }

   public String getgxTv_SdtSDTTransaccionCabecera_Tranareadantecodigo( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Tranareadantecodigo ;
   }

   public void setgxTv_SdtSDTTransaccionCabecera_Tranareadantecodigo( String value )
   {
      gxTv_SdtSDTTransaccionCabecera_Tranareadantecodigo = value ;
   }

   public long getgxTv_SdtSDTTransaccionCabecera_Trantipoingreso( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Trantipoingreso ;
   }

   public void setgxTv_SdtSDTTransaccionCabecera_Trantipoingreso( long value )
   {
      gxTv_SdtSDTTransaccionCabecera_Trantipoingreso = value ;
   }

   public String getgxTv_SdtSDTTransaccionCabecera_Trannumeroingreso( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Trannumeroingreso ;
   }

   public void setgxTv_SdtSDTTransaccionCabecera_Trannumeroingreso( String value )
   {
      gxTv_SdtSDTTransaccionCabecera_Trannumeroingreso = value ;
   }

   public java.util.Date getgxTv_SdtSDTTransaccionCabecera_Tranfechaingreso( )
   {
      return gxTv_SdtSDTTransaccionCabecera_Tranfechaingreso ;
   }

   public void setgxTv_SdtSDTTransaccionCabecera_Tranfechaingreso( java.util.Date value )
   {
      gxTv_SdtSDTTransaccionCabecera_Tranfechaingreso = value ;
   }

   public GXBaseCollection<com.orions2.SdtSDTTransaccionCabecera_listaItem> getgxTv_SdtSDTTransaccionCabecera_Lista( )
   {
      if ( gxTv_SdtSDTTransaccionCabecera_Lista == null )
      {
         gxTv_SdtSDTTransaccionCabecera_Lista = new GXBaseCollection<com.orions2.SdtSDTTransaccionCabecera_listaItem>(com.orions2.SdtSDTTransaccionCabecera_listaItem.class, "SDTTransaccionCabecera.listaItem", "ACBSENA", remoteHandle);
      }
      return gxTv_SdtSDTTransaccionCabecera_Lista ;
   }

   public void setgxTv_SdtSDTTransaccionCabecera_Lista( GXBaseCollection<com.orions2.SdtSDTTransaccionCabecera_listaItem> value )
   {
      gxTv_SdtSDTTransaccionCabecera_Lista = value ;
   }

   public void setgxTv_SdtSDTTransaccionCabecera_Lista_SetNull( )
   {
      gxTv_SdtSDTTransaccionCabecera_Lista = null ;
   }

   public boolean getgxTv_SdtSDTTransaccionCabecera_Lista_IsNull( )
   {
      if ( gxTv_SdtSDTTransaccionCabecera_Lista == null )
      {
         return true ;
      }
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTTransaccionCabecera_Tranregionabrev = "" ;
      gxTv_SdtSDTTransaccionCabecera_Tranindes = "" ;
      gxTv_SdtSDTTransaccionCabecera_Trancodigomovimiento = "" ;
      gxTv_SdtSDTTransaccionCabecera_Tranmoduloorigen = "" ;
      gxTv_SdtSDTTransaccionCabecera_Trancodalmaorigen = "" ;
      gxTv_SdtSDTTransaccionCabecera_Trancodbodeorigen = "" ;
      gxTv_SdtSDTTransaccionCabecera_Tranmodulodestino = "" ;
      gxTv_SdtSDTTransaccionCabecera_Trancodalmadestino = "" ;
      gxTv_SdtSDTTransaccionCabecera_Trancodbodedestino = "" ;
      gxTv_SdtSDTTransaccionCabecera_Tranobservaciones = "" ;
      gxTv_SdtSDTTransaccionCabecera_Tranestado = "" ;
      gxTv_SdtSDTTransaccionCabecera_Tranfecharegistro = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSDTTransaccionCabecera_Tranfecharatificacion = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSDTTransaccionCabecera_Trancentrocostocodigo = "" ;
      gxTv_SdtSDTTransaccionCabecera_Trancursocodigo = "" ;
      gxTv_SdtSDTTransaccionCabecera_Tranareadantecodigo = "" ;
      gxTv_SdtSDTTransaccionCabecera_Trannumeroingreso = "" ;
      gxTv_SdtSDTTransaccionCabecera_Tranfechaingreso = GXutil.nullDate() ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public com.orions2.SdtSDTTransaccionCabecera Clone( )
   {
      return (com.orions2.SdtSDTTransaccionCabecera)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTTransaccionCabecera struct )
   {
      setgxTv_SdtSDTTransaccionCabecera_Tranregioncodigo(struct.getTranregioncodigo());
      setgxTv_SdtSDTTransaccionCabecera_Tranregionabrev(struct.getTranregionabrev());
      setgxTv_SdtSDTTransaccionCabecera_Tranid(struct.getTranid());
      setgxTv_SdtSDTTransaccionCabecera_Tranindes(struct.getTranindes());
      setgxTv_SdtSDTTransaccionCabecera_Trancodigomovimiento(struct.getTrancodigomovimiento());
      setgxTv_SdtSDTTransaccionCabecera_Tranconsecutivocc(struct.getTranconsecutivocc());
      setgxTv_SdtSDTTransaccionCabecera_Tranmoduloorigen(struct.getTranmoduloorigen());
      setgxTv_SdtSDTTransaccionCabecera_Trancodalmaorigen(struct.getTrancodalmaorigen());
      setgxTv_SdtSDTTransaccionCabecera_Trancodbodeorigen(struct.getTrancodbodeorigen());
      setgxTv_SdtSDTTransaccionCabecera_Tranidcuentadanteorigen(struct.getTranidcuentadanteorigen());
      setgxTv_SdtSDTTransaccionCabecera_Tranidproveedor(struct.getTranidproveedor());
      setgxTv_SdtSDTTransaccionCabecera_Tranmodulodestino(struct.getTranmodulodestino());
      setgxTv_SdtSDTTransaccionCabecera_Trancodalmadestino(struct.getTrancodalmadestino());
      setgxTv_SdtSDTTransaccionCabecera_Trancodbodedestino(struct.getTrancodbodedestino());
      setgxTv_SdtSDTTransaccionCabecera_Tranidcuentadantedestino(struct.getTranidcuentadantedestino());
      setgxTv_SdtSDTTransaccionCabecera_Tranobservaciones(struct.getTranobservaciones());
      setgxTv_SdtSDTTransaccionCabecera_Tranestado(struct.getTranestado());
      setgxTv_SdtSDTTransaccionCabecera_Tranfecharegistro(struct.getTranfecharegistro());
      setgxTv_SdtSDTTransaccionCabecera_Tranfecharatificacion(struct.getTranfecharatificacion());
      setgxTv_SdtSDTTransaccionCabecera_Trancentrocostocodigo(struct.getTrancentrocostocodigo());
      setgxTv_SdtSDTTransaccionCabecera_Trancursocodigo(struct.getTrancursocodigo());
      setgxTv_SdtSDTTransaccionCabecera_Tranareadantecodigo(struct.getTranareadantecodigo());
      setgxTv_SdtSDTTransaccionCabecera_Trantipoingreso(struct.getTrantipoingreso());
      setgxTv_SdtSDTTransaccionCabecera_Trannumeroingreso(struct.getTrannumeroingreso());
      setgxTv_SdtSDTTransaccionCabecera_Tranfechaingreso(struct.getTranfechaingreso());
      GXBaseCollection<com.orions2.SdtSDTTransaccionCabecera_listaItem> gxTv_SdtSDTTransaccionCabecera_Lista_aux = new GXBaseCollection<com.orions2.SdtSDTTransaccionCabecera_listaItem>(com.orions2.SdtSDTTransaccionCabecera_listaItem.class, "SDTTransaccionCabecera.listaItem", "ACBSENA", remoteHandle) ;
      GXBaseCollection<com.orions2.SdtSDTTransaccionCabecera_listaItem> gxTv_SdtSDTTransaccionCabecera_Lista_aux1 = new GXBaseCollection<com.orions2.SdtSDTTransaccionCabecera_listaItem>(com.orions2.SdtSDTTransaccionCabecera_listaItem.class, "SDTTransaccionCabecera.listaItem", "ACBSENA", remoteHandle) ;
      gxTv_SdtSDTTransaccionCabecera_Lista_aux1.setStruct(struct.getLista());
      for (int i = 0; i < gxTv_SdtSDTTransaccionCabecera_Lista_aux1.size(); i++)
      {
         gxTv_SdtSDTTransaccionCabecera_Lista_aux.add(new com.orions2.SdtSDTTransaccionCabecera_listaItem(gxTv_SdtSDTTransaccionCabecera_Lista_aux1.elementAt(i).getStruct()));
      }
      setgxTv_SdtSDTTransaccionCabecera_Lista(gxTv_SdtSDTTransaccionCabecera_Lista_aux);
   }

   public com.orions2.StructSdtSDTTransaccionCabecera getStruct( )
   {
      com.orions2.StructSdtSDTTransaccionCabecera struct = new com.orions2.StructSdtSDTTransaccionCabecera ();
      struct.setTranregioncodigo(getgxTv_SdtSDTTransaccionCabecera_Tranregioncodigo());
      struct.setTranregionabrev(getgxTv_SdtSDTTransaccionCabecera_Tranregionabrev());
      struct.setTranid(getgxTv_SdtSDTTransaccionCabecera_Tranid());
      struct.setTranindes(getgxTv_SdtSDTTransaccionCabecera_Tranindes());
      struct.setTrancodigomovimiento(getgxTv_SdtSDTTransaccionCabecera_Trancodigomovimiento());
      struct.setTranconsecutivocc(getgxTv_SdtSDTTransaccionCabecera_Tranconsecutivocc());
      struct.setTranmoduloorigen(getgxTv_SdtSDTTransaccionCabecera_Tranmoduloorigen());
      struct.setTrancodalmaorigen(getgxTv_SdtSDTTransaccionCabecera_Trancodalmaorigen());
      struct.setTrancodbodeorigen(getgxTv_SdtSDTTransaccionCabecera_Trancodbodeorigen());
      struct.setTranidcuentadanteorigen(getgxTv_SdtSDTTransaccionCabecera_Tranidcuentadanteorigen());
      struct.setTranidproveedor(getgxTv_SdtSDTTransaccionCabecera_Tranidproveedor());
      struct.setTranmodulodestino(getgxTv_SdtSDTTransaccionCabecera_Tranmodulodestino());
      struct.setTrancodalmadestino(getgxTv_SdtSDTTransaccionCabecera_Trancodalmadestino());
      struct.setTrancodbodedestino(getgxTv_SdtSDTTransaccionCabecera_Trancodbodedestino());
      struct.setTranidcuentadantedestino(getgxTv_SdtSDTTransaccionCabecera_Tranidcuentadantedestino());
      struct.setTranobservaciones(getgxTv_SdtSDTTransaccionCabecera_Tranobservaciones());
      struct.setTranestado(getgxTv_SdtSDTTransaccionCabecera_Tranestado());
      struct.setTranfecharegistro(getgxTv_SdtSDTTransaccionCabecera_Tranfecharegistro());
      struct.setTranfecharatificacion(getgxTv_SdtSDTTransaccionCabecera_Tranfecharatificacion());
      struct.setTrancentrocostocodigo(getgxTv_SdtSDTTransaccionCabecera_Trancentrocostocodigo());
      struct.setTrancursocodigo(getgxTv_SdtSDTTransaccionCabecera_Trancursocodigo());
      struct.setTranareadantecodigo(getgxTv_SdtSDTTransaccionCabecera_Tranareadantecodigo());
      struct.setTrantipoingreso(getgxTv_SdtSDTTransaccionCabecera_Trantipoingreso());
      struct.setTrannumeroingreso(getgxTv_SdtSDTTransaccionCabecera_Trannumeroingreso());
      struct.setTranfechaingreso(getgxTv_SdtSDTTransaccionCabecera_Tranfechaingreso());
      Vector aux_vectorgxTv_SdtSDTTransaccionCabecera_Lista = getgxTv_SdtSDTTransaccionCabecera_Lista().getStruct();
      Vector aux_vector1gxTv_SdtSDTTransaccionCabecera_Lista = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtSDTTransaccionCabecera_Lista.size(); i++)
      {
         aux_vector1gxTv_SdtSDTTransaccionCabecera_Lista.addElement(((com.orions2.SdtSDTTransaccionCabecera_listaItem)aux_vectorgxTv_SdtSDTTransaccionCabecera_Lista.elementAt(i)).getStruct());
      }
      struct.setLista(aux_vector1gxTv_SdtSDTTransaccionCabecera_Lista);
      return struct ;
   }

   protected short gxTv_SdtSDTTransaccionCabecera_Tranregioncodigo ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSDTTransaccionCabecera_Tranid ;
   protected long gxTv_SdtSDTTransaccionCabecera_Tranconsecutivocc ;
   protected long gxTv_SdtSDTTransaccionCabecera_Tranidcuentadanteorigen ;
   protected long gxTv_SdtSDTTransaccionCabecera_Tranidproveedor ;
   protected long gxTv_SdtSDTTransaccionCabecera_Tranidcuentadantedestino ;
   protected long gxTv_SdtSDTTransaccionCabecera_Trantipoingreso ;
   protected String gxTv_SdtSDTTransaccionCabecera_Tranestado ;
   protected String gxTv_SdtSDTTransaccionCabecera_Trannumeroingreso ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTTransaccionCabecera_Tranfecharegistro ;
   protected java.util.Date gxTv_SdtSDTTransaccionCabecera_Tranfecharatificacion ;
   protected java.util.Date datetime_STZ ;
   protected java.util.Date gxTv_SdtSDTTransaccionCabecera_Tranfechaingreso ;
   protected String gxTv_SdtSDTTransaccionCabecera_Tranobservaciones ;
   protected String gxTv_SdtSDTTransaccionCabecera_Tranregionabrev ;
   protected String gxTv_SdtSDTTransaccionCabecera_Tranindes ;
   protected String gxTv_SdtSDTTransaccionCabecera_Trancodigomovimiento ;
   protected String gxTv_SdtSDTTransaccionCabecera_Tranmoduloorigen ;
   protected String gxTv_SdtSDTTransaccionCabecera_Trancodalmaorigen ;
   protected String gxTv_SdtSDTTransaccionCabecera_Trancodbodeorigen ;
   protected String gxTv_SdtSDTTransaccionCabecera_Tranmodulodestino ;
   protected String gxTv_SdtSDTTransaccionCabecera_Trancodalmadestino ;
   protected String gxTv_SdtSDTTransaccionCabecera_Trancodbodedestino ;
   protected String gxTv_SdtSDTTransaccionCabecera_Trancentrocostocodigo ;
   protected String gxTv_SdtSDTTransaccionCabecera_Trancursocodigo ;
   protected String gxTv_SdtSDTTransaccionCabecera_Tranareadantecodigo ;
   protected GXBaseCollection<com.orions2.SdtSDTTransaccionCabecera_listaItem> gxTv_SdtSDTTransaccionCabecera_Lista_aux ;
   protected GXBaseCollection<com.orions2.SdtSDTTransaccionCabecera_listaItem> gxTv_SdtSDTTransaccionCabecera_Lista_aux1 ;
   protected GXBaseCollection<com.orions2.SdtSDTTransaccionCabecera_listaItem> gxTv_SdtSDTTransaccionCabecera_Lista=null ;
}

