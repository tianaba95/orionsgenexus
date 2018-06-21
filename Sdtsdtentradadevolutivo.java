/*
               File: Sdtsdtentradadevolutivo
        Description: sdtentradadevolutivo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:17.95
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

public final  class Sdtsdtentradadevolutivo extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public Sdtsdtentradadevolutivo( )
   {
      this(  new ModelContext(Sdtsdtentradadevolutivo.class));
   }

   public Sdtsdtentradadevolutivo( ModelContext context )
   {
      super( context, "Sdtsdtentradadevolutivo");
   }

   public Sdtsdtentradadevolutivo( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle, context, "Sdtsdtentradadevolutivo");
   }

   public Sdtsdtentradadevolutivo( StructSdtsdtentradadevolutivo struct )
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
               gxTv_Sdtsdtentradadevolutivo_Tranregioncodigo = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranRegionId") )
            {
               gxTv_Sdtsdtentradadevolutivo_Tranregionid = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranRegionAbrev") )
            {
               gxTv_Sdtsdtentradadevolutivo_Tranregionabrev = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranId") )
            {
               gxTv_Sdtsdtentradadevolutivo_Tranid = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranConsecutivocc") )
            {
               gxTv_Sdtsdtentradadevolutivo_Tranconsecutivocc = GXutil.lval( oReader.getValue()) ;
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
                  gxTv_Sdtsdtentradadevolutivo_Tranfecharegistro = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_Sdtsdtentradadevolutivo_Tranfecharegistro = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranCodAlmaOrigen") )
            {
               gxTv_Sdtsdtentradadevolutivo_Trancodalmaorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranModuloOrigen") )
            {
               gxTv_Sdtsdtentradadevolutivo_Tranmoduloorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranCodBodeOrigen") )
            {
               gxTv_Sdtsdtentradadevolutivo_Trancodbodeorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranIdCuentadanteOrigen") )
            {
               gxTv_Sdtsdtentradadevolutivo_Tranidcuentadanteorigen = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranIdProveedor") )
            {
               gxTv_Sdtsdtentradadevolutivo_Tranidproveedor = GXutil.lval( oReader.getValue()) ;
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
                  gxTv_Sdtsdtentradadevolutivo_Tranfecharatificacion = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_Sdtsdtentradadevolutivo_Tranfecharatificacion = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranEstado") )
            {
               gxTv_Sdtsdtentradadevolutivo_Tranestado = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranCentroCostoCodigo") )
            {
               gxTv_Sdtsdtentradadevolutivo_Trancentrocostocodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranAreadanteCodigo") )
            {
               gxTv_Sdtsdtentradadevolutivo_Tranareadantecodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "detalles") )
            {
               if ( gxTv_Sdtsdtentradadevolutivo_Detalles == null )
               {
                  gxTv_Sdtsdtentradadevolutivo_Detalles = new GXBaseCollection<com.orions2.Sdtsdtentradadevolutivo_detallesitem>(com.orions2.Sdtsdtentradadevolutivo_detallesitem.class, "sdtentradadevolutivo.detallesitem", "ACBSENA", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_Sdtsdtentradadevolutivo_Detalles.readxmlcollection(oReader, "detalles", "detallesitem") ;
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
         sName = "sdtentradadevolutivo" ;
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
      oWriter.writeElement("tranRegionCodigo", GXutil.trim( GXutil.str( gxTv_Sdtsdtentradadevolutivo_Tranregioncodigo, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranRegionId", GXutil.trim( GXutil.str( gxTv_Sdtsdtentradadevolutivo_Tranregionid, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranRegionAbrev", GXutil.rtrim( gxTv_Sdtsdtentradadevolutivo_Tranregionabrev));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranId", GXutil.trim( GXutil.str( gxTv_Sdtsdtentradadevolutivo_Tranid, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranConsecutivocc", GXutil.trim( GXutil.str( gxTv_Sdtsdtentradadevolutivo_Tranconsecutivocc, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_Sdtsdtentradadevolutivo_Tranfecharegistro) )
      {
         oWriter.writeStartElement("tranFechaRegistro");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_Sdtsdtentradadevolutivo_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_Sdtsdtentradadevolutivo_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_Sdtsdtentradadevolutivo_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_Sdtsdtentradadevolutivo_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_Sdtsdtentradadevolutivo_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_Sdtsdtentradadevolutivo_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("tranFechaRegistro", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
      }
      oWriter.writeElement("tranCodAlmaOrigen", GXutil.rtrim( gxTv_Sdtsdtentradadevolutivo_Trancodalmaorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranModuloOrigen", GXutil.rtrim( gxTv_Sdtsdtentradadevolutivo_Tranmoduloorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranCodBodeOrigen", GXutil.rtrim( gxTv_Sdtsdtentradadevolutivo_Trancodbodeorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranIdCuentadanteOrigen", GXutil.trim( GXutil.str( gxTv_Sdtsdtentradadevolutivo_Tranidcuentadanteorigen, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranIdProveedor", GXutil.trim( GXutil.str( gxTv_Sdtsdtentradadevolutivo_Tranidproveedor, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_Sdtsdtentradadevolutivo_Tranfecharatificacion) )
      {
         oWriter.writeStartElement("tranFechaRatificacion");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_Sdtsdtentradadevolutivo_Tranfecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_Sdtsdtentradadevolutivo_Tranfecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_Sdtsdtentradadevolutivo_Tranfecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_Sdtsdtentradadevolutivo_Tranfecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_Sdtsdtentradadevolutivo_Tranfecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_Sdtsdtentradadevolutivo_Tranfecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("tranFechaRatificacion", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
      }
      oWriter.writeElement("tranEstado", GXutil.rtrim( gxTv_Sdtsdtentradadevolutivo_Tranestado));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranCentroCostoCodigo", GXutil.rtrim( gxTv_Sdtsdtentradadevolutivo_Trancentrocostocodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranAreadanteCodigo", GXutil.rtrim( gxTv_Sdtsdtentradadevolutivo_Tranareadantecodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( gxTv_Sdtsdtentradadevolutivo_Detalles != null )
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
         gxTv_Sdtsdtentradadevolutivo_Detalles.writexmlcollection(oWriter, "detalles", sNameSpace1, "detallesitem", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("tranRegionCodigo", gxTv_Sdtsdtentradadevolutivo_Tranregioncodigo, false);
      AddObjectProperty("tranRegionId", gxTv_Sdtsdtentradadevolutivo_Tranregionid, false);
      AddObjectProperty("tranRegionAbrev", gxTv_Sdtsdtentradadevolutivo_Tranregionabrev, false);
      AddObjectProperty("tranId", gxTv_Sdtsdtentradadevolutivo_Tranid, false);
      AddObjectProperty("tranConsecutivocc", GXutil.ltrim( GXutil.str( gxTv_Sdtsdtentradadevolutivo_Tranconsecutivocc, 18, 0)), false);
      datetime_STZ = gxTv_Sdtsdtentradadevolutivo_Tranfecharegistro ;
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
      AddObjectProperty("tranCodAlmaOrigen", gxTv_Sdtsdtentradadevolutivo_Trancodalmaorigen, false);
      AddObjectProperty("tranModuloOrigen", gxTv_Sdtsdtentradadevolutivo_Tranmoduloorigen, false);
      AddObjectProperty("tranCodBodeOrigen", gxTv_Sdtsdtentradadevolutivo_Trancodbodeorigen, false);
      AddObjectProperty("tranIdCuentadanteOrigen", GXutil.ltrim( GXutil.str( gxTv_Sdtsdtentradadevolutivo_Tranidcuentadanteorigen, 18, 0)), false);
      AddObjectProperty("tranIdProveedor", GXutil.ltrim( GXutil.str( gxTv_Sdtsdtentradadevolutivo_Tranidproveedor, 18, 0)), false);
      datetime_STZ = gxTv_Sdtsdtentradadevolutivo_Tranfecharatificacion ;
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
      AddObjectProperty("tranEstado", gxTv_Sdtsdtentradadevolutivo_Tranestado, false);
      AddObjectProperty("tranCentroCostoCodigo", gxTv_Sdtsdtentradadevolutivo_Trancentrocostocodigo, false);
      AddObjectProperty("tranAreadanteCodigo", gxTv_Sdtsdtentradadevolutivo_Tranareadantecodigo, false);
      if ( gxTv_Sdtsdtentradadevolutivo_Detalles != null )
      {
         AddObjectProperty("detalles", gxTv_Sdtsdtentradadevolutivo_Detalles, false);
      }
   }

   public int getgxTv_Sdtsdtentradadevolutivo_Tranregioncodigo( )
   {
      return gxTv_Sdtsdtentradadevolutivo_Tranregioncodigo ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_Tranregioncodigo( int value )
   {
      gxTv_Sdtsdtentradadevolutivo_Tranregioncodigo = value ;
   }

   public short getgxTv_Sdtsdtentradadevolutivo_Tranregionid( )
   {
      return gxTv_Sdtsdtentradadevolutivo_Tranregionid ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_Tranregionid( short value )
   {
      gxTv_Sdtsdtentradadevolutivo_Tranregionid = value ;
   }

   public String getgxTv_Sdtsdtentradadevolutivo_Tranregionabrev( )
   {
      return gxTv_Sdtsdtentradadevolutivo_Tranregionabrev ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_Tranregionabrev( String value )
   {
      gxTv_Sdtsdtentradadevolutivo_Tranregionabrev = value ;
   }

   public long getgxTv_Sdtsdtentradadevolutivo_Tranid( )
   {
      return gxTv_Sdtsdtentradadevolutivo_Tranid ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_Tranid( long value )
   {
      gxTv_Sdtsdtentradadevolutivo_Tranid = value ;
   }

   public long getgxTv_Sdtsdtentradadevolutivo_Tranconsecutivocc( )
   {
      return gxTv_Sdtsdtentradadevolutivo_Tranconsecutivocc ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_Tranconsecutivocc( long value )
   {
      gxTv_Sdtsdtentradadevolutivo_Tranconsecutivocc = value ;
   }

   public java.util.Date getgxTv_Sdtsdtentradadevolutivo_Tranfecharegistro( )
   {
      return gxTv_Sdtsdtentradadevolutivo_Tranfecharegistro ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_Tranfecharegistro( java.util.Date value )
   {
      gxTv_Sdtsdtentradadevolutivo_Tranfecharegistro = value ;
   }

   public String getgxTv_Sdtsdtentradadevolutivo_Trancodalmaorigen( )
   {
      return gxTv_Sdtsdtentradadevolutivo_Trancodalmaorigen ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_Trancodalmaorigen( String value )
   {
      gxTv_Sdtsdtentradadevolutivo_Trancodalmaorigen = value ;
   }

   public String getgxTv_Sdtsdtentradadevolutivo_Tranmoduloorigen( )
   {
      return gxTv_Sdtsdtentradadevolutivo_Tranmoduloorigen ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_Tranmoduloorigen( String value )
   {
      gxTv_Sdtsdtentradadevolutivo_Tranmoduloorigen = value ;
   }

   public String getgxTv_Sdtsdtentradadevolutivo_Trancodbodeorigen( )
   {
      return gxTv_Sdtsdtentradadevolutivo_Trancodbodeorigen ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_Trancodbodeorigen( String value )
   {
      gxTv_Sdtsdtentradadevolutivo_Trancodbodeorigen = value ;
   }

   public long getgxTv_Sdtsdtentradadevolutivo_Tranidcuentadanteorigen( )
   {
      return gxTv_Sdtsdtentradadevolutivo_Tranidcuentadanteorigen ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_Tranidcuentadanteorigen( long value )
   {
      gxTv_Sdtsdtentradadevolutivo_Tranidcuentadanteorigen = value ;
   }

   public long getgxTv_Sdtsdtentradadevolutivo_Tranidproveedor( )
   {
      return gxTv_Sdtsdtentradadevolutivo_Tranidproveedor ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_Tranidproveedor( long value )
   {
      gxTv_Sdtsdtentradadevolutivo_Tranidproveedor = value ;
   }

   public java.util.Date getgxTv_Sdtsdtentradadevolutivo_Tranfecharatificacion( )
   {
      return gxTv_Sdtsdtentradadevolutivo_Tranfecharatificacion ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_Tranfecharatificacion( java.util.Date value )
   {
      gxTv_Sdtsdtentradadevolutivo_Tranfecharatificacion = value ;
   }

   public String getgxTv_Sdtsdtentradadevolutivo_Tranestado( )
   {
      return gxTv_Sdtsdtentradadevolutivo_Tranestado ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_Tranestado( String value )
   {
      gxTv_Sdtsdtentradadevolutivo_Tranestado = value ;
   }

   public String getgxTv_Sdtsdtentradadevolutivo_Trancentrocostocodigo( )
   {
      return gxTv_Sdtsdtentradadevolutivo_Trancentrocostocodigo ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_Trancentrocostocodigo( String value )
   {
      gxTv_Sdtsdtentradadevolutivo_Trancentrocostocodigo = value ;
   }

   public String getgxTv_Sdtsdtentradadevolutivo_Tranareadantecodigo( )
   {
      return gxTv_Sdtsdtentradadevolutivo_Tranareadantecodigo ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_Tranareadantecodigo( String value )
   {
      gxTv_Sdtsdtentradadevolutivo_Tranareadantecodigo = value ;
   }

   public GXBaseCollection<com.orions2.Sdtsdtentradadevolutivo_detallesitem> getgxTv_Sdtsdtentradadevolutivo_Detalles( )
   {
      if ( gxTv_Sdtsdtentradadevolutivo_Detalles == null )
      {
         gxTv_Sdtsdtentradadevolutivo_Detalles = new GXBaseCollection<com.orions2.Sdtsdtentradadevolutivo_detallesitem>(com.orions2.Sdtsdtentradadevolutivo_detallesitem.class, "sdtentradadevolutivo.detallesitem", "ACBSENA", remoteHandle);
      }
      return gxTv_Sdtsdtentradadevolutivo_Detalles ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_Detalles( GXBaseCollection<com.orions2.Sdtsdtentradadevolutivo_detallesitem> value )
   {
      gxTv_Sdtsdtentradadevolutivo_Detalles = value ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_Detalles_SetNull( )
   {
      gxTv_Sdtsdtentradadevolutivo_Detalles = null ;
   }

   public boolean getgxTv_Sdtsdtentradadevolutivo_Detalles_IsNull( )
   {
      if ( gxTv_Sdtsdtentradadevolutivo_Detalles == null )
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
      gxTv_Sdtsdtentradadevolutivo_Tranregionabrev = "" ;
      gxTv_Sdtsdtentradadevolutivo_Tranfecharegistro = GXutil.resetTime( GXutil.nullDate() );
      gxTv_Sdtsdtentradadevolutivo_Trancodalmaorigen = "" ;
      gxTv_Sdtsdtentradadevolutivo_Tranmoduloorigen = "" ;
      gxTv_Sdtsdtentradadevolutivo_Trancodbodeorigen = "" ;
      gxTv_Sdtsdtentradadevolutivo_Tranfecharatificacion = GXutil.resetTime( GXutil.nullDate() );
      gxTv_Sdtsdtentradadevolutivo_Tranestado = "" ;
      gxTv_Sdtsdtentradadevolutivo_Trancentrocostocodigo = "" ;
      gxTv_Sdtsdtentradadevolutivo_Tranareadantecodigo = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public com.orions2.Sdtsdtentradadevolutivo Clone( )
   {
      return (com.orions2.Sdtsdtentradadevolutivo)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtsdtentradadevolutivo struct )
   {
      setgxTv_Sdtsdtentradadevolutivo_Tranregioncodigo(struct.getTranregioncodigo());
      setgxTv_Sdtsdtentradadevolutivo_Tranregionid(struct.getTranregionid());
      setgxTv_Sdtsdtentradadevolutivo_Tranregionabrev(struct.getTranregionabrev());
      setgxTv_Sdtsdtentradadevolutivo_Tranid(struct.getTranid());
      setgxTv_Sdtsdtentradadevolutivo_Tranconsecutivocc(struct.getTranconsecutivocc());
      setgxTv_Sdtsdtentradadevolutivo_Tranfecharegistro(struct.getTranfecharegistro());
      setgxTv_Sdtsdtentradadevolutivo_Trancodalmaorigen(struct.getTrancodalmaorigen());
      setgxTv_Sdtsdtentradadevolutivo_Tranmoduloorigen(struct.getTranmoduloorigen());
      setgxTv_Sdtsdtentradadevolutivo_Trancodbodeorigen(struct.getTrancodbodeorigen());
      setgxTv_Sdtsdtentradadevolutivo_Tranidcuentadanteorigen(struct.getTranidcuentadanteorigen());
      setgxTv_Sdtsdtentradadevolutivo_Tranidproveedor(struct.getTranidproveedor());
      setgxTv_Sdtsdtentradadevolutivo_Tranfecharatificacion(struct.getTranfecharatificacion());
      setgxTv_Sdtsdtentradadevolutivo_Tranestado(struct.getTranestado());
      setgxTv_Sdtsdtentradadevolutivo_Trancentrocostocodigo(struct.getTrancentrocostocodigo());
      setgxTv_Sdtsdtentradadevolutivo_Tranareadantecodigo(struct.getTranareadantecodigo());
      GXBaseCollection<com.orions2.Sdtsdtentradadevolutivo_detallesitem> gxTv_Sdtsdtentradadevolutivo_Detalles_aux = new GXBaseCollection<com.orions2.Sdtsdtentradadevolutivo_detallesitem>(com.orions2.Sdtsdtentradadevolutivo_detallesitem.class, "sdtentradadevolutivo.detallesitem", "ACBSENA", remoteHandle) ;
      GXBaseCollection<com.orions2.Sdtsdtentradadevolutivo_detallesitem> gxTv_Sdtsdtentradadevolutivo_Detalles_aux1 = new GXBaseCollection<com.orions2.Sdtsdtentradadevolutivo_detallesitem>(com.orions2.Sdtsdtentradadevolutivo_detallesitem.class, "sdtentradadevolutivo.detallesitem", "ACBSENA", remoteHandle) ;
      gxTv_Sdtsdtentradadevolutivo_Detalles_aux1.setStruct(struct.getDetalles());
      for (int i = 0; i < gxTv_Sdtsdtentradadevolutivo_Detalles_aux1.size(); i++)
      {
         gxTv_Sdtsdtentradadevolutivo_Detalles_aux.add(new com.orions2.Sdtsdtentradadevolutivo_detallesitem(gxTv_Sdtsdtentradadevolutivo_Detalles_aux1.elementAt(i).getStruct()));
      }
      setgxTv_Sdtsdtentradadevolutivo_Detalles(gxTv_Sdtsdtentradadevolutivo_Detalles_aux);
   }

   public com.orions2.StructSdtsdtentradadevolutivo getStruct( )
   {
      com.orions2.StructSdtsdtentradadevolutivo struct = new com.orions2.StructSdtsdtentradadevolutivo ();
      struct.setTranregioncodigo(getgxTv_Sdtsdtentradadevolutivo_Tranregioncodigo());
      struct.setTranregionid(getgxTv_Sdtsdtentradadevolutivo_Tranregionid());
      struct.setTranregionabrev(getgxTv_Sdtsdtentradadevolutivo_Tranregionabrev());
      struct.setTranid(getgxTv_Sdtsdtentradadevolutivo_Tranid());
      struct.setTranconsecutivocc(getgxTv_Sdtsdtentradadevolutivo_Tranconsecutivocc());
      struct.setTranfecharegistro(getgxTv_Sdtsdtentradadevolutivo_Tranfecharegistro());
      struct.setTrancodalmaorigen(getgxTv_Sdtsdtentradadevolutivo_Trancodalmaorigen());
      struct.setTranmoduloorigen(getgxTv_Sdtsdtentradadevolutivo_Tranmoduloorigen());
      struct.setTrancodbodeorigen(getgxTv_Sdtsdtentradadevolutivo_Trancodbodeorigen());
      struct.setTranidcuentadanteorigen(getgxTv_Sdtsdtentradadevolutivo_Tranidcuentadanteorigen());
      struct.setTranidproveedor(getgxTv_Sdtsdtentradadevolutivo_Tranidproveedor());
      struct.setTranfecharatificacion(getgxTv_Sdtsdtentradadevolutivo_Tranfecharatificacion());
      struct.setTranestado(getgxTv_Sdtsdtentradadevolutivo_Tranestado());
      struct.setTrancentrocostocodigo(getgxTv_Sdtsdtentradadevolutivo_Trancentrocostocodigo());
      struct.setTranareadantecodigo(getgxTv_Sdtsdtentradadevolutivo_Tranareadantecodigo());
      Vector aux_vectorgxTv_Sdtsdtentradadevolutivo_Detalles = getgxTv_Sdtsdtentradadevolutivo_Detalles().getStruct();
      Vector aux_vector1gxTv_Sdtsdtentradadevolutivo_Detalles = new Vector();
      for (int i = 0; i < aux_vectorgxTv_Sdtsdtentradadevolutivo_Detalles.size(); i++)
      {
         aux_vector1gxTv_Sdtsdtentradadevolutivo_Detalles.addElement(((com.orions2.Sdtsdtentradadevolutivo_detallesitem)aux_vectorgxTv_Sdtsdtentradadevolutivo_Detalles.elementAt(i)).getStruct());
      }
      struct.setDetalles(aux_vector1gxTv_Sdtsdtentradadevolutivo_Detalles);
      return struct ;
   }

   protected short gxTv_Sdtsdtentradadevolutivo_Tranregionid ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_Sdtsdtentradadevolutivo_Tranregioncodigo ;
   protected long gxTv_Sdtsdtentradadevolutivo_Tranid ;
   protected long gxTv_Sdtsdtentradadevolutivo_Tranconsecutivocc ;
   protected long gxTv_Sdtsdtentradadevolutivo_Tranidcuentadanteorigen ;
   protected long gxTv_Sdtsdtentradadevolutivo_Tranidproveedor ;
   protected String gxTv_Sdtsdtentradadevolutivo_Tranestado ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_Sdtsdtentradadevolutivo_Tranfecharegistro ;
   protected java.util.Date gxTv_Sdtsdtentradadevolutivo_Tranfecharatificacion ;
   protected java.util.Date datetime_STZ ;
   protected String gxTv_Sdtsdtentradadevolutivo_Tranregionabrev ;
   protected String gxTv_Sdtsdtentradadevolutivo_Trancodalmaorigen ;
   protected String gxTv_Sdtsdtentradadevolutivo_Tranmoduloorigen ;
   protected String gxTv_Sdtsdtentradadevolutivo_Trancodbodeorigen ;
   protected String gxTv_Sdtsdtentradadevolutivo_Trancentrocostocodigo ;
   protected String gxTv_Sdtsdtentradadevolutivo_Tranareadantecodigo ;
   protected GXBaseCollection<com.orions2.Sdtsdtentradadevolutivo_detallesitem> gxTv_Sdtsdtentradadevolutivo_Detalles_aux ;
   protected GXBaseCollection<com.orions2.Sdtsdtentradadevolutivo_detallesitem> gxTv_Sdtsdtentradadevolutivo_Detalles_aux1 ;
   protected GXBaseCollection<com.orions2.Sdtsdtentradadevolutivo_detallesitem> gxTv_Sdtsdtentradadevolutivo_Detalles=null ;
}

