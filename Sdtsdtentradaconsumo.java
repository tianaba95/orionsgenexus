/*
               File: Sdtsdtentradaconsumo
        Description: sdtentradaconsumo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:17.71
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

public final  class Sdtsdtentradaconsumo extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public Sdtsdtentradaconsumo( )
   {
      this(  new ModelContext(Sdtsdtentradaconsumo.class));
   }

   public Sdtsdtentradaconsumo( ModelContext context )
   {
      super( context, "Sdtsdtentradaconsumo");
   }

   public Sdtsdtentradaconsumo( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle, context, "Sdtsdtentradaconsumo");
   }

   public Sdtsdtentradaconsumo( StructSdtsdtentradaconsumo struct )
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
               gxTv_Sdtsdtentradaconsumo_Tranregioncodigo = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranRegionId") )
            {
               gxTv_Sdtsdtentradaconsumo_Tranregionid = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranRegionAbrev") )
            {
               gxTv_Sdtsdtentradaconsumo_Tranregionabrev = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranId") )
            {
               gxTv_Sdtsdtentradaconsumo_Tranid = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranConsecutivocc") )
            {
               gxTv_Sdtsdtentradaconsumo_Tranconsecutivocc = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranModuloOrigen") )
            {
               gxTv_Sdtsdtentradaconsumo_Tranmoduloorigen = oReader.getValue() ;
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
                  gxTv_Sdtsdtentradaconsumo_Tranfecharegistro = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_Sdtsdtentradaconsumo_Tranfecharegistro = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
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
                  gxTv_Sdtsdtentradaconsumo_Tranfecharatificacion = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_Sdtsdtentradaconsumo_Tranfecharatificacion = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranCodAlmaOrigen") )
            {
               gxTv_Sdtsdtentradaconsumo_Trancodalmaorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranCodBodeOrigen") )
            {
               gxTv_Sdtsdtentradaconsumo_Trancodbodeorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranIdCuentadanteOrigen") )
            {
               gxTv_Sdtsdtentradaconsumo_Tranidcuentadanteorigen = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranIdProveedor") )
            {
               gxTv_Sdtsdtentradaconsumo_Tranidproveedor = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranEstado") )
            {
               gxTv_Sdtsdtentradaconsumo_Tranestado = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranCentroCostoCodigo") )
            {
               gxTv_Sdtsdtentradaconsumo_Trancentrocostocodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranAreadanteCodigo") )
            {
               gxTv_Sdtsdtentradaconsumo_Tranareadantecodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "trancursocodigo") )
            {
               gxTv_Sdtsdtentradaconsumo_Trancursocodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "detalles") )
            {
               if ( gxTv_Sdtsdtentradaconsumo_Detalles == null )
               {
                  gxTv_Sdtsdtentradaconsumo_Detalles = new GXBaseCollection<com.orions2.Sdtsdtentradaconsumo_detallesitem>(com.orions2.Sdtsdtentradaconsumo_detallesitem.class, "sdtentradaconsumo.detallesitem", "ACBSENA", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_Sdtsdtentradaconsumo_Detalles.readxmlcollection(oReader, "detalles", "detallesitem") ;
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
         sName = "sdtentradaconsumo" ;
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
      oWriter.writeElement("tranRegionCodigo", GXutil.trim( GXutil.str( gxTv_Sdtsdtentradaconsumo_Tranregioncodigo, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranRegionId", GXutil.trim( GXutil.str( gxTv_Sdtsdtentradaconsumo_Tranregionid, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranRegionAbrev", GXutil.rtrim( gxTv_Sdtsdtentradaconsumo_Tranregionabrev));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranId", GXutil.trim( GXutil.str( gxTv_Sdtsdtentradaconsumo_Tranid, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranConsecutivocc", GXutil.trim( GXutil.str( gxTv_Sdtsdtentradaconsumo_Tranconsecutivocc, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranModuloOrigen", GXutil.rtrim( gxTv_Sdtsdtentradaconsumo_Tranmoduloorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_Sdtsdtentradaconsumo_Tranfecharegistro) )
      {
         oWriter.writeStartElement("tranFechaRegistro");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_Sdtsdtentradaconsumo_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_Sdtsdtentradaconsumo_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_Sdtsdtentradaconsumo_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_Sdtsdtentradaconsumo_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_Sdtsdtentradaconsumo_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_Sdtsdtentradaconsumo_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("tranFechaRegistro", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_Sdtsdtentradaconsumo_Tranfecharatificacion) )
      {
         oWriter.writeStartElement("tranFechaRatificacion");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_Sdtsdtentradaconsumo_Tranfecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_Sdtsdtentradaconsumo_Tranfecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_Sdtsdtentradaconsumo_Tranfecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_Sdtsdtentradaconsumo_Tranfecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_Sdtsdtentradaconsumo_Tranfecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_Sdtsdtentradaconsumo_Tranfecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("tranFechaRatificacion", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
      }
      oWriter.writeElement("tranCodAlmaOrigen", GXutil.rtrim( gxTv_Sdtsdtentradaconsumo_Trancodalmaorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranCodBodeOrigen", GXutil.rtrim( gxTv_Sdtsdtentradaconsumo_Trancodbodeorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranIdCuentadanteOrigen", GXutil.trim( GXutil.str( gxTv_Sdtsdtentradaconsumo_Tranidcuentadanteorigen, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranIdProveedor", GXutil.trim( GXutil.str( gxTv_Sdtsdtentradaconsumo_Tranidproveedor, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranEstado", GXutil.rtrim( gxTv_Sdtsdtentradaconsumo_Tranestado));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranCentroCostoCodigo", GXutil.rtrim( gxTv_Sdtsdtentradaconsumo_Trancentrocostocodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranAreadanteCodigo", GXutil.rtrim( gxTv_Sdtsdtentradaconsumo_Tranareadantecodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("trancursocodigo", GXutil.rtrim( gxTv_Sdtsdtentradaconsumo_Trancursocodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( gxTv_Sdtsdtentradaconsumo_Detalles != null )
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
         gxTv_Sdtsdtentradaconsumo_Detalles.writexmlcollection(oWriter, "detalles", sNameSpace1, "detallesitem", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("tranRegionCodigo", gxTv_Sdtsdtentradaconsumo_Tranregioncodigo, false);
      AddObjectProperty("tranRegionId", gxTv_Sdtsdtentradaconsumo_Tranregionid, false);
      AddObjectProperty("tranRegionAbrev", gxTv_Sdtsdtentradaconsumo_Tranregionabrev, false);
      AddObjectProperty("tranId", gxTv_Sdtsdtentradaconsumo_Tranid, false);
      AddObjectProperty("tranConsecutivocc", GXutil.ltrim( GXutil.str( gxTv_Sdtsdtentradaconsumo_Tranconsecutivocc, 18, 0)), false);
      AddObjectProperty("tranModuloOrigen", gxTv_Sdtsdtentradaconsumo_Tranmoduloorigen, false);
      datetime_STZ = gxTv_Sdtsdtentradaconsumo_Tranfecharegistro ;
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
      datetime_STZ = gxTv_Sdtsdtentradaconsumo_Tranfecharatificacion ;
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
      AddObjectProperty("tranCodAlmaOrigen", gxTv_Sdtsdtentradaconsumo_Trancodalmaorigen, false);
      AddObjectProperty("tranCodBodeOrigen", gxTv_Sdtsdtentradaconsumo_Trancodbodeorigen, false);
      AddObjectProperty("tranIdCuentadanteOrigen", GXutil.ltrim( GXutil.str( gxTv_Sdtsdtentradaconsumo_Tranidcuentadanteorigen, 18, 0)), false);
      AddObjectProperty("tranIdProveedor", GXutil.ltrim( GXutil.str( gxTv_Sdtsdtentradaconsumo_Tranidproveedor, 18, 0)), false);
      AddObjectProperty("tranEstado", gxTv_Sdtsdtentradaconsumo_Tranestado, false);
      AddObjectProperty("tranCentroCostoCodigo", gxTv_Sdtsdtentradaconsumo_Trancentrocostocodigo, false);
      AddObjectProperty("tranAreadanteCodigo", gxTv_Sdtsdtentradaconsumo_Tranareadantecodigo, false);
      AddObjectProperty("trancursocodigo", gxTv_Sdtsdtentradaconsumo_Trancursocodigo, false);
      if ( gxTv_Sdtsdtentradaconsumo_Detalles != null )
      {
         AddObjectProperty("detalles", gxTv_Sdtsdtentradaconsumo_Detalles, false);
      }
   }

   public int getgxTv_Sdtsdtentradaconsumo_Tranregioncodigo( )
   {
      return gxTv_Sdtsdtentradaconsumo_Tranregioncodigo ;
   }

   public void setgxTv_Sdtsdtentradaconsumo_Tranregioncodigo( int value )
   {
      gxTv_Sdtsdtentradaconsumo_Tranregioncodigo = value ;
   }

   public short getgxTv_Sdtsdtentradaconsumo_Tranregionid( )
   {
      return gxTv_Sdtsdtentradaconsumo_Tranregionid ;
   }

   public void setgxTv_Sdtsdtentradaconsumo_Tranregionid( short value )
   {
      gxTv_Sdtsdtentradaconsumo_Tranregionid = value ;
   }

   public String getgxTv_Sdtsdtentradaconsumo_Tranregionabrev( )
   {
      return gxTv_Sdtsdtentradaconsumo_Tranregionabrev ;
   }

   public void setgxTv_Sdtsdtentradaconsumo_Tranregionabrev( String value )
   {
      gxTv_Sdtsdtentradaconsumo_Tranregionabrev = value ;
   }

   public long getgxTv_Sdtsdtentradaconsumo_Tranid( )
   {
      return gxTv_Sdtsdtentradaconsumo_Tranid ;
   }

   public void setgxTv_Sdtsdtentradaconsumo_Tranid( long value )
   {
      gxTv_Sdtsdtentradaconsumo_Tranid = value ;
   }

   public long getgxTv_Sdtsdtentradaconsumo_Tranconsecutivocc( )
   {
      return gxTv_Sdtsdtentradaconsumo_Tranconsecutivocc ;
   }

   public void setgxTv_Sdtsdtentradaconsumo_Tranconsecutivocc( long value )
   {
      gxTv_Sdtsdtentradaconsumo_Tranconsecutivocc = value ;
   }

   public String getgxTv_Sdtsdtentradaconsumo_Tranmoduloorigen( )
   {
      return gxTv_Sdtsdtentradaconsumo_Tranmoduloorigen ;
   }

   public void setgxTv_Sdtsdtentradaconsumo_Tranmoduloorigen( String value )
   {
      gxTv_Sdtsdtentradaconsumo_Tranmoduloorigen = value ;
   }

   public java.util.Date getgxTv_Sdtsdtentradaconsumo_Tranfecharegistro( )
   {
      return gxTv_Sdtsdtentradaconsumo_Tranfecharegistro ;
   }

   public void setgxTv_Sdtsdtentradaconsumo_Tranfecharegistro( java.util.Date value )
   {
      gxTv_Sdtsdtentradaconsumo_Tranfecharegistro = value ;
   }

   public java.util.Date getgxTv_Sdtsdtentradaconsumo_Tranfecharatificacion( )
   {
      return gxTv_Sdtsdtentradaconsumo_Tranfecharatificacion ;
   }

   public void setgxTv_Sdtsdtentradaconsumo_Tranfecharatificacion( java.util.Date value )
   {
      gxTv_Sdtsdtentradaconsumo_Tranfecharatificacion = value ;
   }

   public String getgxTv_Sdtsdtentradaconsumo_Trancodalmaorigen( )
   {
      return gxTv_Sdtsdtentradaconsumo_Trancodalmaorigen ;
   }

   public void setgxTv_Sdtsdtentradaconsumo_Trancodalmaorigen( String value )
   {
      gxTv_Sdtsdtentradaconsumo_Trancodalmaorigen = value ;
   }

   public String getgxTv_Sdtsdtentradaconsumo_Trancodbodeorigen( )
   {
      return gxTv_Sdtsdtentradaconsumo_Trancodbodeorigen ;
   }

   public void setgxTv_Sdtsdtentradaconsumo_Trancodbodeorigen( String value )
   {
      gxTv_Sdtsdtentradaconsumo_Trancodbodeorigen = value ;
   }

   public long getgxTv_Sdtsdtentradaconsumo_Tranidcuentadanteorigen( )
   {
      return gxTv_Sdtsdtentradaconsumo_Tranidcuentadanteorigen ;
   }

   public void setgxTv_Sdtsdtentradaconsumo_Tranidcuentadanteorigen( long value )
   {
      gxTv_Sdtsdtentradaconsumo_Tranidcuentadanteorigen = value ;
   }

   public long getgxTv_Sdtsdtentradaconsumo_Tranidproveedor( )
   {
      return gxTv_Sdtsdtentradaconsumo_Tranidproveedor ;
   }

   public void setgxTv_Sdtsdtentradaconsumo_Tranidproveedor( long value )
   {
      gxTv_Sdtsdtentradaconsumo_Tranidproveedor = value ;
   }

   public String getgxTv_Sdtsdtentradaconsumo_Tranestado( )
   {
      return gxTv_Sdtsdtentradaconsumo_Tranestado ;
   }

   public void setgxTv_Sdtsdtentradaconsumo_Tranestado( String value )
   {
      gxTv_Sdtsdtentradaconsumo_Tranestado = value ;
   }

   public String getgxTv_Sdtsdtentradaconsumo_Trancentrocostocodigo( )
   {
      return gxTv_Sdtsdtentradaconsumo_Trancentrocostocodigo ;
   }

   public void setgxTv_Sdtsdtentradaconsumo_Trancentrocostocodigo( String value )
   {
      gxTv_Sdtsdtentradaconsumo_Trancentrocostocodigo = value ;
   }

   public String getgxTv_Sdtsdtentradaconsumo_Tranareadantecodigo( )
   {
      return gxTv_Sdtsdtentradaconsumo_Tranareadantecodigo ;
   }

   public void setgxTv_Sdtsdtentradaconsumo_Tranareadantecodigo( String value )
   {
      gxTv_Sdtsdtentradaconsumo_Tranareadantecodigo = value ;
   }

   public String getgxTv_Sdtsdtentradaconsumo_Trancursocodigo( )
   {
      return gxTv_Sdtsdtentradaconsumo_Trancursocodigo ;
   }

   public void setgxTv_Sdtsdtentradaconsumo_Trancursocodigo( String value )
   {
      gxTv_Sdtsdtentradaconsumo_Trancursocodigo = value ;
   }

   public GXBaseCollection<com.orions2.Sdtsdtentradaconsumo_detallesitem> getgxTv_Sdtsdtentradaconsumo_Detalles( )
   {
      if ( gxTv_Sdtsdtentradaconsumo_Detalles == null )
      {
         gxTv_Sdtsdtentradaconsumo_Detalles = new GXBaseCollection<com.orions2.Sdtsdtentradaconsumo_detallesitem>(com.orions2.Sdtsdtentradaconsumo_detallesitem.class, "sdtentradaconsumo.detallesitem", "ACBSENA", remoteHandle);
      }
      return gxTv_Sdtsdtentradaconsumo_Detalles ;
   }

   public void setgxTv_Sdtsdtentradaconsumo_Detalles( GXBaseCollection<com.orions2.Sdtsdtentradaconsumo_detallesitem> value )
   {
      gxTv_Sdtsdtentradaconsumo_Detalles = value ;
   }

   public void setgxTv_Sdtsdtentradaconsumo_Detalles_SetNull( )
   {
      gxTv_Sdtsdtentradaconsumo_Detalles = null ;
   }

   public boolean getgxTv_Sdtsdtentradaconsumo_Detalles_IsNull( )
   {
      if ( gxTv_Sdtsdtentradaconsumo_Detalles == null )
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
      gxTv_Sdtsdtentradaconsumo_Tranregionabrev = "" ;
      gxTv_Sdtsdtentradaconsumo_Tranmoduloorigen = "" ;
      gxTv_Sdtsdtentradaconsumo_Tranfecharegistro = GXutil.resetTime( GXutil.nullDate() );
      gxTv_Sdtsdtentradaconsumo_Tranfecharatificacion = GXutil.resetTime( GXutil.nullDate() );
      gxTv_Sdtsdtentradaconsumo_Trancodalmaorigen = "" ;
      gxTv_Sdtsdtentradaconsumo_Trancodbodeorigen = "" ;
      gxTv_Sdtsdtentradaconsumo_Tranestado = "" ;
      gxTv_Sdtsdtentradaconsumo_Trancentrocostocodigo = "" ;
      gxTv_Sdtsdtentradaconsumo_Tranareadantecodigo = "" ;
      gxTv_Sdtsdtentradaconsumo_Trancursocodigo = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public com.orions2.Sdtsdtentradaconsumo Clone( )
   {
      return (com.orions2.Sdtsdtentradaconsumo)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtsdtentradaconsumo struct )
   {
      setgxTv_Sdtsdtentradaconsumo_Tranregioncodigo(struct.getTranregioncodigo());
      setgxTv_Sdtsdtentradaconsumo_Tranregionid(struct.getTranregionid());
      setgxTv_Sdtsdtentradaconsumo_Tranregionabrev(struct.getTranregionabrev());
      setgxTv_Sdtsdtentradaconsumo_Tranid(struct.getTranid());
      setgxTv_Sdtsdtentradaconsumo_Tranconsecutivocc(struct.getTranconsecutivocc());
      setgxTv_Sdtsdtentradaconsumo_Tranmoduloorigen(struct.getTranmoduloorigen());
      setgxTv_Sdtsdtentradaconsumo_Tranfecharegistro(struct.getTranfecharegistro());
      setgxTv_Sdtsdtentradaconsumo_Tranfecharatificacion(struct.getTranfecharatificacion());
      setgxTv_Sdtsdtentradaconsumo_Trancodalmaorigen(struct.getTrancodalmaorigen());
      setgxTv_Sdtsdtentradaconsumo_Trancodbodeorigen(struct.getTrancodbodeorigen());
      setgxTv_Sdtsdtentradaconsumo_Tranidcuentadanteorigen(struct.getTranidcuentadanteorigen());
      setgxTv_Sdtsdtentradaconsumo_Tranidproveedor(struct.getTranidproveedor());
      setgxTv_Sdtsdtentradaconsumo_Tranestado(struct.getTranestado());
      setgxTv_Sdtsdtentradaconsumo_Trancentrocostocodigo(struct.getTrancentrocostocodigo());
      setgxTv_Sdtsdtentradaconsumo_Tranareadantecodigo(struct.getTranareadantecodigo());
      setgxTv_Sdtsdtentradaconsumo_Trancursocodigo(struct.getTrancursocodigo());
      GXBaseCollection<com.orions2.Sdtsdtentradaconsumo_detallesitem> gxTv_Sdtsdtentradaconsumo_Detalles_aux = new GXBaseCollection<com.orions2.Sdtsdtentradaconsumo_detallesitem>(com.orions2.Sdtsdtentradaconsumo_detallesitem.class, "sdtentradaconsumo.detallesitem", "ACBSENA", remoteHandle) ;
      GXBaseCollection<com.orions2.Sdtsdtentradaconsumo_detallesitem> gxTv_Sdtsdtentradaconsumo_Detalles_aux1 = new GXBaseCollection<com.orions2.Sdtsdtentradaconsumo_detallesitem>(com.orions2.Sdtsdtentradaconsumo_detallesitem.class, "sdtentradaconsumo.detallesitem", "ACBSENA", remoteHandle) ;
      gxTv_Sdtsdtentradaconsumo_Detalles_aux1.setStruct(struct.getDetalles());
      for (int i = 0; i < gxTv_Sdtsdtentradaconsumo_Detalles_aux1.size(); i++)
      {
         gxTv_Sdtsdtentradaconsumo_Detalles_aux.add(new com.orions2.Sdtsdtentradaconsumo_detallesitem(gxTv_Sdtsdtentradaconsumo_Detalles_aux1.elementAt(i).getStruct()));
      }
      setgxTv_Sdtsdtentradaconsumo_Detalles(gxTv_Sdtsdtentradaconsumo_Detalles_aux);
   }

   public com.orions2.StructSdtsdtentradaconsumo getStruct( )
   {
      com.orions2.StructSdtsdtentradaconsumo struct = new com.orions2.StructSdtsdtentradaconsumo ();
      struct.setTranregioncodigo(getgxTv_Sdtsdtentradaconsumo_Tranregioncodigo());
      struct.setTranregionid(getgxTv_Sdtsdtentradaconsumo_Tranregionid());
      struct.setTranregionabrev(getgxTv_Sdtsdtentradaconsumo_Tranregionabrev());
      struct.setTranid(getgxTv_Sdtsdtentradaconsumo_Tranid());
      struct.setTranconsecutivocc(getgxTv_Sdtsdtentradaconsumo_Tranconsecutivocc());
      struct.setTranmoduloorigen(getgxTv_Sdtsdtentradaconsumo_Tranmoduloorigen());
      struct.setTranfecharegistro(getgxTv_Sdtsdtentradaconsumo_Tranfecharegistro());
      struct.setTranfecharatificacion(getgxTv_Sdtsdtentradaconsumo_Tranfecharatificacion());
      struct.setTrancodalmaorigen(getgxTv_Sdtsdtentradaconsumo_Trancodalmaorigen());
      struct.setTrancodbodeorigen(getgxTv_Sdtsdtentradaconsumo_Trancodbodeorigen());
      struct.setTranidcuentadanteorigen(getgxTv_Sdtsdtentradaconsumo_Tranidcuentadanteorigen());
      struct.setTranidproveedor(getgxTv_Sdtsdtentradaconsumo_Tranidproveedor());
      struct.setTranestado(getgxTv_Sdtsdtentradaconsumo_Tranestado());
      struct.setTrancentrocostocodigo(getgxTv_Sdtsdtentradaconsumo_Trancentrocostocodigo());
      struct.setTranareadantecodigo(getgxTv_Sdtsdtentradaconsumo_Tranareadantecodigo());
      struct.setTrancursocodigo(getgxTv_Sdtsdtentradaconsumo_Trancursocodigo());
      Vector aux_vectorgxTv_Sdtsdtentradaconsumo_Detalles = getgxTv_Sdtsdtentradaconsumo_Detalles().getStruct();
      Vector aux_vector1gxTv_Sdtsdtentradaconsumo_Detalles = new Vector();
      for (int i = 0; i < aux_vectorgxTv_Sdtsdtentradaconsumo_Detalles.size(); i++)
      {
         aux_vector1gxTv_Sdtsdtentradaconsumo_Detalles.addElement(((com.orions2.Sdtsdtentradaconsumo_detallesitem)aux_vectorgxTv_Sdtsdtentradaconsumo_Detalles.elementAt(i)).getStruct());
      }
      struct.setDetalles(aux_vector1gxTv_Sdtsdtentradaconsumo_Detalles);
      return struct ;
   }

   protected short gxTv_Sdtsdtentradaconsumo_Tranregionid ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_Sdtsdtentradaconsumo_Tranregioncodigo ;
   protected long gxTv_Sdtsdtentradaconsumo_Tranid ;
   protected long gxTv_Sdtsdtentradaconsumo_Tranconsecutivocc ;
   protected long gxTv_Sdtsdtentradaconsumo_Tranidcuentadanteorigen ;
   protected long gxTv_Sdtsdtentradaconsumo_Tranidproveedor ;
   protected String gxTv_Sdtsdtentradaconsumo_Tranestado ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_Sdtsdtentradaconsumo_Tranfecharegistro ;
   protected java.util.Date gxTv_Sdtsdtentradaconsumo_Tranfecharatificacion ;
   protected java.util.Date datetime_STZ ;
   protected String gxTv_Sdtsdtentradaconsumo_Tranregionabrev ;
   protected String gxTv_Sdtsdtentradaconsumo_Tranmoduloorigen ;
   protected String gxTv_Sdtsdtentradaconsumo_Trancodalmaorigen ;
   protected String gxTv_Sdtsdtentradaconsumo_Trancodbodeorigen ;
   protected String gxTv_Sdtsdtentradaconsumo_Trancentrocostocodigo ;
   protected String gxTv_Sdtsdtentradaconsumo_Tranareadantecodigo ;
   protected String gxTv_Sdtsdtentradaconsumo_Trancursocodigo ;
   protected GXBaseCollection<com.orions2.Sdtsdtentradaconsumo_detallesitem> gxTv_Sdtsdtentradaconsumo_Detalles_aux ;
   protected GXBaseCollection<com.orions2.Sdtsdtentradaconsumo_detallesitem> gxTv_Sdtsdtentradaconsumo_Detalles_aux1 ;
   protected GXBaseCollection<com.orions2.Sdtsdtentradaconsumo_detallesitem> gxTv_Sdtsdtentradaconsumo_Detalles=null ;
}

