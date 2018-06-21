/*
               File: Sdtsdtsalidadevolutivo
        Description: sdtsalidadevolutivo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:20.3
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

public final  class Sdtsdtsalidadevolutivo extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public Sdtsdtsalidadevolutivo( )
   {
      this(  new ModelContext(Sdtsdtsalidadevolutivo.class));
   }

   public Sdtsdtsalidadevolutivo( ModelContext context )
   {
      super( context, "Sdtsdtsalidadevolutivo");
   }

   public Sdtsdtsalidadevolutivo( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle, context, "Sdtsdtsalidadevolutivo");
   }

   public Sdtsdtsalidadevolutivo( StructSdtsdtsalidadevolutivo struct )
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
               gxTv_Sdtsdtsalidadevolutivo_Tranregioncodigo = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranRegionAbrev") )
            {
               gxTv_Sdtsdtsalidadevolutivo_Tranregionabrev = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranId") )
            {
               gxTv_Sdtsdtsalidadevolutivo_Tranid = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranConsecutivocc") )
            {
               gxTv_Sdtsdtsalidadevolutivo_Tranconsecutivocc = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranModuloOrigen") )
            {
               gxTv_Sdtsdtsalidadevolutivo_Tranmoduloorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranModuloDestino") )
            {
               gxTv_Sdtsdtsalidadevolutivo_Tranmodulodestino = oReader.getValue() ;
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
                  gxTv_Sdtsdtsalidadevolutivo_Tranfecharegistro = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_Sdtsdtsalidadevolutivo_Tranfecharegistro = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranCodAlmaOrigen") )
            {
               gxTv_Sdtsdtsalidadevolutivo_Trancodalmaorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranCodAlmaDestino") )
            {
               gxTv_Sdtsdtsalidadevolutivo_Trancodalmadestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranCodBodeOrigen") )
            {
               gxTv_Sdtsdtsalidadevolutivo_Trancodbodeorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranCodBodeDestino") )
            {
               gxTv_Sdtsdtsalidadevolutivo_Trancodbodedestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranIdCuentadanteDestino") )
            {
               gxTv_Sdtsdtsalidadevolutivo_Tranidcuentadantedestino = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranEstado") )
            {
               gxTv_Sdtsdtsalidadevolutivo_Tranestado = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranCentroCostoCodigo") )
            {
               gxTv_Sdtsdtsalidadevolutivo_Trancentrocostocodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranCentroCostoCodigoDestino") )
            {
               gxTv_Sdtsdtsalidadevolutivo_Trancentrocostocodigodestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "trancursocodigo") )
            {
               gxTv_Sdtsdtsalidadevolutivo_Trancursocodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranAreadanteCodigo") )
            {
               gxTv_Sdtsdtsalidadevolutivo_Tranareadantecodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tipoDeElemento") )
            {
               gxTv_Sdtsdtsalidadevolutivo_Tipodeelemento = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "detalles") )
            {
               if ( gxTv_Sdtsdtsalidadevolutivo_Detalles == null )
               {
                  gxTv_Sdtsdtsalidadevolutivo_Detalles = new GXBaseCollection<com.orions2.Sdtsdtsalidadevolutivo_detallesitem>(com.orions2.Sdtsdtsalidadevolutivo_detallesitem.class, "sdtsalidadevolutivo.detallesitem", "ACBSENA", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_Sdtsdtsalidadevolutivo_Detalles.readxmlcollection(oReader, "detalles", "detallesitem") ;
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
         sName = "sdtsalidadevolutivo" ;
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
      oWriter.writeElement("tranRegionCodigo", GXutil.trim( GXutil.str( gxTv_Sdtsdtsalidadevolutivo_Tranregioncodigo, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranRegionAbrev", GXutil.rtrim( gxTv_Sdtsdtsalidadevolutivo_Tranregionabrev));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranId", GXutil.trim( GXutil.str( gxTv_Sdtsdtsalidadevolutivo_Tranid, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranConsecutivocc", GXutil.trim( GXutil.str( gxTv_Sdtsdtsalidadevolutivo_Tranconsecutivocc, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranModuloOrigen", GXutil.rtrim( gxTv_Sdtsdtsalidadevolutivo_Tranmoduloorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranModuloDestino", GXutil.rtrim( gxTv_Sdtsdtsalidadevolutivo_Tranmodulodestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_Sdtsdtsalidadevolutivo_Tranfecharegistro) )
      {
         oWriter.writeStartElement("tranFechaRegistro");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_Sdtsdtsalidadevolutivo_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_Sdtsdtsalidadevolutivo_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_Sdtsdtsalidadevolutivo_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_Sdtsdtsalidadevolutivo_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_Sdtsdtsalidadevolutivo_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_Sdtsdtsalidadevolutivo_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("tranFechaRegistro", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
      }
      oWriter.writeElement("tranCodAlmaOrigen", GXutil.rtrim( gxTv_Sdtsdtsalidadevolutivo_Trancodalmaorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranCodAlmaDestino", GXutil.rtrim( gxTv_Sdtsdtsalidadevolutivo_Trancodalmadestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranCodBodeOrigen", GXutil.rtrim( gxTv_Sdtsdtsalidadevolutivo_Trancodbodeorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranCodBodeDestino", GXutil.rtrim( gxTv_Sdtsdtsalidadevolutivo_Trancodbodedestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranIdCuentadanteDestino", GXutil.trim( GXutil.str( gxTv_Sdtsdtsalidadevolutivo_Tranidcuentadantedestino, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranEstado", GXutil.rtrim( gxTv_Sdtsdtsalidadevolutivo_Tranestado));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranCentroCostoCodigo", GXutil.rtrim( gxTv_Sdtsdtsalidadevolutivo_Trancentrocostocodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranCentroCostoCodigoDestino", GXutil.rtrim( gxTv_Sdtsdtsalidadevolutivo_Trancentrocostocodigodestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("trancursocodigo", GXutil.rtrim( gxTv_Sdtsdtsalidadevolutivo_Trancursocodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranAreadanteCodigo", GXutil.rtrim( gxTv_Sdtsdtsalidadevolutivo_Tranareadantecodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tipoDeElemento", GXutil.rtrim( gxTv_Sdtsdtsalidadevolutivo_Tipodeelemento));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( gxTv_Sdtsdtsalidadevolutivo_Detalles != null )
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
         gxTv_Sdtsdtsalidadevolutivo_Detalles.writexmlcollection(oWriter, "detalles", sNameSpace1, "detallesitem", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("tranRegionCodigo", gxTv_Sdtsdtsalidadevolutivo_Tranregioncodigo, false);
      AddObjectProperty("tranRegionAbrev", gxTv_Sdtsdtsalidadevolutivo_Tranregionabrev, false);
      AddObjectProperty("tranId", gxTv_Sdtsdtsalidadevolutivo_Tranid, false);
      AddObjectProperty("tranConsecutivocc", GXutil.ltrim( GXutil.str( gxTv_Sdtsdtsalidadevolutivo_Tranconsecutivocc, 18, 0)), false);
      AddObjectProperty("tranModuloOrigen", gxTv_Sdtsdtsalidadevolutivo_Tranmoduloorigen, false);
      AddObjectProperty("tranModuloDestino", gxTv_Sdtsdtsalidadevolutivo_Tranmodulodestino, false);
      datetime_STZ = gxTv_Sdtsdtsalidadevolutivo_Tranfecharegistro ;
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
      AddObjectProperty("tranCodAlmaOrigen", gxTv_Sdtsdtsalidadevolutivo_Trancodalmaorigen, false);
      AddObjectProperty("tranCodAlmaDestino", gxTv_Sdtsdtsalidadevolutivo_Trancodalmadestino, false);
      AddObjectProperty("tranCodBodeOrigen", gxTv_Sdtsdtsalidadevolutivo_Trancodbodeorigen, false);
      AddObjectProperty("tranCodBodeDestino", gxTv_Sdtsdtsalidadevolutivo_Trancodbodedestino, false);
      AddObjectProperty("tranIdCuentadanteDestino", GXutil.ltrim( GXutil.str( gxTv_Sdtsdtsalidadevolutivo_Tranidcuentadantedestino, 18, 0)), false);
      AddObjectProperty("tranEstado", gxTv_Sdtsdtsalidadevolutivo_Tranestado, false);
      AddObjectProperty("tranCentroCostoCodigo", gxTv_Sdtsdtsalidadevolutivo_Trancentrocostocodigo, false);
      AddObjectProperty("tranCentroCostoCodigoDestino", gxTv_Sdtsdtsalidadevolutivo_Trancentrocostocodigodestino, false);
      AddObjectProperty("trancursocodigo", gxTv_Sdtsdtsalidadevolutivo_Trancursocodigo, false);
      AddObjectProperty("tranAreadanteCodigo", gxTv_Sdtsdtsalidadevolutivo_Tranareadantecodigo, false);
      AddObjectProperty("tipoDeElemento", gxTv_Sdtsdtsalidadevolutivo_Tipodeelemento, false);
      if ( gxTv_Sdtsdtsalidadevolutivo_Detalles != null )
      {
         AddObjectProperty("detalles", gxTv_Sdtsdtsalidadevolutivo_Detalles, false);
      }
   }

   public int getgxTv_Sdtsdtsalidadevolutivo_Tranregioncodigo( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Tranregioncodigo ;
   }

   public void setgxTv_Sdtsdtsalidadevolutivo_Tranregioncodigo( int value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Tranregioncodigo = value ;
   }

   public String getgxTv_Sdtsdtsalidadevolutivo_Tranregionabrev( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Tranregionabrev ;
   }

   public void setgxTv_Sdtsdtsalidadevolutivo_Tranregionabrev( String value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Tranregionabrev = value ;
   }

   public long getgxTv_Sdtsdtsalidadevolutivo_Tranid( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Tranid ;
   }

   public void setgxTv_Sdtsdtsalidadevolutivo_Tranid( long value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Tranid = value ;
   }

   public long getgxTv_Sdtsdtsalidadevolutivo_Tranconsecutivocc( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Tranconsecutivocc ;
   }

   public void setgxTv_Sdtsdtsalidadevolutivo_Tranconsecutivocc( long value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Tranconsecutivocc = value ;
   }

   public String getgxTv_Sdtsdtsalidadevolutivo_Tranmoduloorigen( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Tranmoduloorigen ;
   }

   public void setgxTv_Sdtsdtsalidadevolutivo_Tranmoduloorigen( String value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Tranmoduloorigen = value ;
   }

   public String getgxTv_Sdtsdtsalidadevolutivo_Tranmodulodestino( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Tranmodulodestino ;
   }

   public void setgxTv_Sdtsdtsalidadevolutivo_Tranmodulodestino( String value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Tranmodulodestino = value ;
   }

   public java.util.Date getgxTv_Sdtsdtsalidadevolutivo_Tranfecharegistro( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Tranfecharegistro ;
   }

   public void setgxTv_Sdtsdtsalidadevolutivo_Tranfecharegistro( java.util.Date value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Tranfecharegistro = value ;
   }

   public String getgxTv_Sdtsdtsalidadevolutivo_Trancodalmaorigen( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Trancodalmaorigen ;
   }

   public void setgxTv_Sdtsdtsalidadevolutivo_Trancodalmaorigen( String value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Trancodalmaorigen = value ;
   }

   public String getgxTv_Sdtsdtsalidadevolutivo_Trancodalmadestino( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Trancodalmadestino ;
   }

   public void setgxTv_Sdtsdtsalidadevolutivo_Trancodalmadestino( String value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Trancodalmadestino = value ;
   }

   public String getgxTv_Sdtsdtsalidadevolutivo_Trancodbodeorigen( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Trancodbodeorigen ;
   }

   public void setgxTv_Sdtsdtsalidadevolutivo_Trancodbodeorigen( String value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Trancodbodeorigen = value ;
   }

   public String getgxTv_Sdtsdtsalidadevolutivo_Trancodbodedestino( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Trancodbodedestino ;
   }

   public void setgxTv_Sdtsdtsalidadevolutivo_Trancodbodedestino( String value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Trancodbodedestino = value ;
   }

   public long getgxTv_Sdtsdtsalidadevolutivo_Tranidcuentadantedestino( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Tranidcuentadantedestino ;
   }

   public void setgxTv_Sdtsdtsalidadevolutivo_Tranidcuentadantedestino( long value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Tranidcuentadantedestino = value ;
   }

   public String getgxTv_Sdtsdtsalidadevolutivo_Tranestado( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Tranestado ;
   }

   public void setgxTv_Sdtsdtsalidadevolutivo_Tranestado( String value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Tranestado = value ;
   }

   public String getgxTv_Sdtsdtsalidadevolutivo_Trancentrocostocodigo( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Trancentrocostocodigo ;
   }

   public void setgxTv_Sdtsdtsalidadevolutivo_Trancentrocostocodigo( String value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Trancentrocostocodigo = value ;
   }

   public String getgxTv_Sdtsdtsalidadevolutivo_Trancentrocostocodigodestino( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Trancentrocostocodigodestino ;
   }

   public void setgxTv_Sdtsdtsalidadevolutivo_Trancentrocostocodigodestino( String value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Trancentrocostocodigodestino = value ;
   }

   public String getgxTv_Sdtsdtsalidadevolutivo_Trancursocodigo( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Trancursocodigo ;
   }

   public void setgxTv_Sdtsdtsalidadevolutivo_Trancursocodigo( String value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Trancursocodigo = value ;
   }

   public String getgxTv_Sdtsdtsalidadevolutivo_Tranareadantecodigo( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Tranareadantecodigo ;
   }

   public void setgxTv_Sdtsdtsalidadevolutivo_Tranareadantecodigo( String value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Tranareadantecodigo = value ;
   }

   public String getgxTv_Sdtsdtsalidadevolutivo_Tipodeelemento( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_Tipodeelemento ;
   }

   public void setgxTv_Sdtsdtsalidadevolutivo_Tipodeelemento( String value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Tipodeelemento = value ;
   }

   public GXBaseCollection<com.orions2.Sdtsdtsalidadevolutivo_detallesitem> getgxTv_Sdtsdtsalidadevolutivo_Detalles( )
   {
      if ( gxTv_Sdtsdtsalidadevolutivo_Detalles == null )
      {
         gxTv_Sdtsdtsalidadevolutivo_Detalles = new GXBaseCollection<com.orions2.Sdtsdtsalidadevolutivo_detallesitem>(com.orions2.Sdtsdtsalidadevolutivo_detallesitem.class, "sdtsalidadevolutivo.detallesitem", "ACBSENA", remoteHandle);
      }
      return gxTv_Sdtsdtsalidadevolutivo_Detalles ;
   }

   public void setgxTv_Sdtsdtsalidadevolutivo_Detalles( GXBaseCollection<com.orions2.Sdtsdtsalidadevolutivo_detallesitem> value )
   {
      gxTv_Sdtsdtsalidadevolutivo_Detalles = value ;
   }

   public void setgxTv_Sdtsdtsalidadevolutivo_Detalles_SetNull( )
   {
      gxTv_Sdtsdtsalidadevolutivo_Detalles = null ;
   }

   public boolean getgxTv_Sdtsdtsalidadevolutivo_Detalles_IsNull( )
   {
      if ( gxTv_Sdtsdtsalidadevolutivo_Detalles == null )
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
      gxTv_Sdtsdtsalidadevolutivo_Tranregionabrev = "" ;
      gxTv_Sdtsdtsalidadevolutivo_Tranmoduloorigen = "" ;
      gxTv_Sdtsdtsalidadevolutivo_Tranmodulodestino = "" ;
      gxTv_Sdtsdtsalidadevolutivo_Tranfecharegistro = GXutil.resetTime( GXutil.nullDate() );
      gxTv_Sdtsdtsalidadevolutivo_Trancodalmaorigen = "" ;
      gxTv_Sdtsdtsalidadevolutivo_Trancodalmadestino = "" ;
      gxTv_Sdtsdtsalidadevolutivo_Trancodbodeorigen = "" ;
      gxTv_Sdtsdtsalidadevolutivo_Trancodbodedestino = "" ;
      gxTv_Sdtsdtsalidadevolutivo_Tranestado = "" ;
      gxTv_Sdtsdtsalidadevolutivo_Trancentrocostocodigo = "" ;
      gxTv_Sdtsdtsalidadevolutivo_Trancentrocostocodigodestino = "" ;
      gxTv_Sdtsdtsalidadevolutivo_Trancursocodigo = "" ;
      gxTv_Sdtsdtsalidadevolutivo_Tranareadantecodigo = "" ;
      gxTv_Sdtsdtsalidadevolutivo_Tipodeelemento = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public com.orions2.Sdtsdtsalidadevolutivo Clone( )
   {
      return (com.orions2.Sdtsdtsalidadevolutivo)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtsdtsalidadevolutivo struct )
   {
      setgxTv_Sdtsdtsalidadevolutivo_Tranregioncodigo(struct.getTranregioncodigo());
      setgxTv_Sdtsdtsalidadevolutivo_Tranregionabrev(struct.getTranregionabrev());
      setgxTv_Sdtsdtsalidadevolutivo_Tranid(struct.getTranid());
      setgxTv_Sdtsdtsalidadevolutivo_Tranconsecutivocc(struct.getTranconsecutivocc());
      setgxTv_Sdtsdtsalidadevolutivo_Tranmoduloorigen(struct.getTranmoduloorigen());
      setgxTv_Sdtsdtsalidadevolutivo_Tranmodulodestino(struct.getTranmodulodestino());
      setgxTv_Sdtsdtsalidadevolutivo_Tranfecharegistro(struct.getTranfecharegistro());
      setgxTv_Sdtsdtsalidadevolutivo_Trancodalmaorigen(struct.getTrancodalmaorigen());
      setgxTv_Sdtsdtsalidadevolutivo_Trancodalmadestino(struct.getTrancodalmadestino());
      setgxTv_Sdtsdtsalidadevolutivo_Trancodbodeorigen(struct.getTrancodbodeorigen());
      setgxTv_Sdtsdtsalidadevolutivo_Trancodbodedestino(struct.getTrancodbodedestino());
      setgxTv_Sdtsdtsalidadevolutivo_Tranidcuentadantedestino(struct.getTranidcuentadantedestino());
      setgxTv_Sdtsdtsalidadevolutivo_Tranestado(struct.getTranestado());
      setgxTv_Sdtsdtsalidadevolutivo_Trancentrocostocodigo(struct.getTrancentrocostocodigo());
      setgxTv_Sdtsdtsalidadevolutivo_Trancentrocostocodigodestino(struct.getTrancentrocostocodigodestino());
      setgxTv_Sdtsdtsalidadevolutivo_Trancursocodigo(struct.getTrancursocodigo());
      setgxTv_Sdtsdtsalidadevolutivo_Tranareadantecodigo(struct.getTranareadantecodigo());
      setgxTv_Sdtsdtsalidadevolutivo_Tipodeelemento(struct.getTipodeelemento());
      GXBaseCollection<com.orions2.Sdtsdtsalidadevolutivo_detallesitem> gxTv_Sdtsdtsalidadevolutivo_Detalles_aux = new GXBaseCollection<com.orions2.Sdtsdtsalidadevolutivo_detallesitem>(com.orions2.Sdtsdtsalidadevolutivo_detallesitem.class, "sdtsalidadevolutivo.detallesitem", "ACBSENA", remoteHandle) ;
      GXBaseCollection<com.orions2.Sdtsdtsalidadevolutivo_detallesitem> gxTv_Sdtsdtsalidadevolutivo_Detalles_aux1 = new GXBaseCollection<com.orions2.Sdtsdtsalidadevolutivo_detallesitem>(com.orions2.Sdtsdtsalidadevolutivo_detallesitem.class, "sdtsalidadevolutivo.detallesitem", "ACBSENA", remoteHandle) ;
      gxTv_Sdtsdtsalidadevolutivo_Detalles_aux1.setStruct(struct.getDetalles());
      for (int i = 0; i < gxTv_Sdtsdtsalidadevolutivo_Detalles_aux1.size(); i++)
      {
         gxTv_Sdtsdtsalidadevolutivo_Detalles_aux.add(new com.orions2.Sdtsdtsalidadevolutivo_detallesitem(gxTv_Sdtsdtsalidadevolutivo_Detalles_aux1.elementAt(i).getStruct()));
      }
      setgxTv_Sdtsdtsalidadevolutivo_Detalles(gxTv_Sdtsdtsalidadevolutivo_Detalles_aux);
   }

   public com.orions2.StructSdtsdtsalidadevolutivo getStruct( )
   {
      com.orions2.StructSdtsdtsalidadevolutivo struct = new com.orions2.StructSdtsdtsalidadevolutivo ();
      struct.setTranregioncodigo(getgxTv_Sdtsdtsalidadevolutivo_Tranregioncodigo());
      struct.setTranregionabrev(getgxTv_Sdtsdtsalidadevolutivo_Tranregionabrev());
      struct.setTranid(getgxTv_Sdtsdtsalidadevolutivo_Tranid());
      struct.setTranconsecutivocc(getgxTv_Sdtsdtsalidadevolutivo_Tranconsecutivocc());
      struct.setTranmoduloorigen(getgxTv_Sdtsdtsalidadevolutivo_Tranmoduloorigen());
      struct.setTranmodulodestino(getgxTv_Sdtsdtsalidadevolutivo_Tranmodulodestino());
      struct.setTranfecharegistro(getgxTv_Sdtsdtsalidadevolutivo_Tranfecharegistro());
      struct.setTrancodalmaorigen(getgxTv_Sdtsdtsalidadevolutivo_Trancodalmaorigen());
      struct.setTrancodalmadestino(getgxTv_Sdtsdtsalidadevolutivo_Trancodalmadestino());
      struct.setTrancodbodeorigen(getgxTv_Sdtsdtsalidadevolutivo_Trancodbodeorigen());
      struct.setTrancodbodedestino(getgxTv_Sdtsdtsalidadevolutivo_Trancodbodedestino());
      struct.setTranidcuentadantedestino(getgxTv_Sdtsdtsalidadevolutivo_Tranidcuentadantedestino());
      struct.setTranestado(getgxTv_Sdtsdtsalidadevolutivo_Tranestado());
      struct.setTrancentrocostocodigo(getgxTv_Sdtsdtsalidadevolutivo_Trancentrocostocodigo());
      struct.setTrancentrocostocodigodestino(getgxTv_Sdtsdtsalidadevolutivo_Trancentrocostocodigodestino());
      struct.setTrancursocodigo(getgxTv_Sdtsdtsalidadevolutivo_Trancursocodigo());
      struct.setTranareadantecodigo(getgxTv_Sdtsdtsalidadevolutivo_Tranareadantecodigo());
      struct.setTipodeelemento(getgxTv_Sdtsdtsalidadevolutivo_Tipodeelemento());
      Vector aux_vectorgxTv_Sdtsdtsalidadevolutivo_Detalles = getgxTv_Sdtsdtsalidadevolutivo_Detalles().getStruct();
      Vector aux_vector1gxTv_Sdtsdtsalidadevolutivo_Detalles = new Vector();
      for (int i = 0; i < aux_vectorgxTv_Sdtsdtsalidadevolutivo_Detalles.size(); i++)
      {
         aux_vector1gxTv_Sdtsdtsalidadevolutivo_Detalles.addElement(((com.orions2.Sdtsdtsalidadevolutivo_detallesitem)aux_vectorgxTv_Sdtsdtsalidadevolutivo_Detalles.elementAt(i)).getStruct());
      }
      struct.setDetalles(aux_vector1gxTv_Sdtsdtsalidadevolutivo_Detalles);
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_Sdtsdtsalidadevolutivo_Tranregioncodigo ;
   protected long gxTv_Sdtsdtsalidadevolutivo_Tranid ;
   protected long gxTv_Sdtsdtsalidadevolutivo_Tranconsecutivocc ;
   protected long gxTv_Sdtsdtsalidadevolutivo_Tranidcuentadantedestino ;
   protected String gxTv_Sdtsdtsalidadevolutivo_Tranestado ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_Sdtsdtsalidadevolutivo_Tranfecharegistro ;
   protected java.util.Date datetime_STZ ;
   protected String gxTv_Sdtsdtsalidadevolutivo_Tranregionabrev ;
   protected String gxTv_Sdtsdtsalidadevolutivo_Tranmoduloorigen ;
   protected String gxTv_Sdtsdtsalidadevolutivo_Tranmodulodestino ;
   protected String gxTv_Sdtsdtsalidadevolutivo_Trancodalmaorigen ;
   protected String gxTv_Sdtsdtsalidadevolutivo_Trancodalmadestino ;
   protected String gxTv_Sdtsdtsalidadevolutivo_Trancodbodeorigen ;
   protected String gxTv_Sdtsdtsalidadevolutivo_Trancodbodedestino ;
   protected String gxTv_Sdtsdtsalidadevolutivo_Trancentrocostocodigo ;
   protected String gxTv_Sdtsdtsalidadevolutivo_Trancentrocostocodigodestino ;
   protected String gxTv_Sdtsdtsalidadevolutivo_Trancursocodigo ;
   protected String gxTv_Sdtsdtsalidadevolutivo_Tranareadantecodigo ;
   protected String gxTv_Sdtsdtsalidadevolutivo_Tipodeelemento ;
   protected GXBaseCollection<com.orions2.Sdtsdtsalidadevolutivo_detallesitem> gxTv_Sdtsdtsalidadevolutivo_Detalles_aux ;
   protected GXBaseCollection<com.orions2.Sdtsdtsalidadevolutivo_detallesitem> gxTv_Sdtsdtsalidadevolutivo_Detalles_aux1 ;
   protected GXBaseCollection<com.orions2.Sdtsdtsalidadevolutivo_detallesitem> gxTv_Sdtsdtsalidadevolutivo_Detalles=null ;
}

