/*
               File: Sdtsdtsalidaconsumo
        Description: sdtsalidaconsumo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:19.84
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

public final  class Sdtsdtsalidaconsumo extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public Sdtsdtsalidaconsumo( )
   {
      this(  new ModelContext(Sdtsdtsalidaconsumo.class));
   }

   public Sdtsdtsalidaconsumo( ModelContext context )
   {
      super( context, "Sdtsdtsalidaconsumo");
   }

   public Sdtsdtsalidaconsumo( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle, context, "Sdtsdtsalidaconsumo");
   }

   public Sdtsdtsalidaconsumo( StructSdtsdtsalidaconsumo struct )
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
               gxTv_Sdtsdtsalidaconsumo_Tranregioncodigo = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranRegionAbrev") )
            {
               gxTv_Sdtsdtsalidaconsumo_Tranregionabrev = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranId") )
            {
               gxTv_Sdtsdtsalidaconsumo_Tranid = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranConsecutivocc") )
            {
               gxTv_Sdtsdtsalidaconsumo_Tranconsecutivocc = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranModuloDestino") )
            {
               gxTv_Sdtsdtsalidaconsumo_Tranmodulodestino = oReader.getValue() ;
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
                  gxTv_Sdtsdtsalidaconsumo_Tranfecharegistro = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_Sdtsdtsalidaconsumo_Tranfecharegistro = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranCodAlmaDestino") )
            {
               gxTv_Sdtsdtsalidaconsumo_Trancodalmadestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranCodBodeDestino") )
            {
               gxTv_Sdtsdtsalidaconsumo_Trancodbodedestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranIdCuentadanteDestino") )
            {
               gxTv_Sdtsdtsalidaconsumo_Tranidcuentadantedestino = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranEstado") )
            {
               gxTv_Sdtsdtsalidaconsumo_Tranestado = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranCentroCostoCodigo") )
            {
               gxTv_Sdtsdtsalidaconsumo_Trancentrocostocodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranCentroCostoCodigoDestino") )
            {
               gxTv_Sdtsdtsalidaconsumo_Trancentrocostocodigodestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "trancursocodigo") )
            {
               gxTv_Sdtsdtsalidaconsumo_Trancursocodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranAreadanteCodigo") )
            {
               gxTv_Sdtsdtsalidaconsumo_Tranareadantecodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tipoDeElemento") )
            {
               gxTv_Sdtsdtsalidaconsumo_Tipodeelemento = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "detalles") )
            {
               if ( gxTv_Sdtsdtsalidaconsumo_Detalles == null )
               {
                  gxTv_Sdtsdtsalidaconsumo_Detalles = new GXBaseCollection<com.orions2.Sdtsdtsalidaconsumo_detallesitem>(com.orions2.Sdtsdtsalidaconsumo_detallesitem.class, "sdtsalidaconsumo.detallesitem", "ACBSENA", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_Sdtsdtsalidaconsumo_Detalles.readxmlcollection(oReader, "detalles", "detallesitem") ;
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
         sName = "sdtsalidaconsumo" ;
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
      oWriter.writeElement("tranRegionCodigo", GXutil.trim( GXutil.str( gxTv_Sdtsdtsalidaconsumo_Tranregioncodigo, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranRegionAbrev", GXutil.rtrim( gxTv_Sdtsdtsalidaconsumo_Tranregionabrev));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranId", GXutil.trim( GXutil.str( gxTv_Sdtsdtsalidaconsumo_Tranid, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranConsecutivocc", GXutil.trim( GXutil.str( gxTv_Sdtsdtsalidaconsumo_Tranconsecutivocc, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranModuloDestino", GXutil.rtrim( gxTv_Sdtsdtsalidaconsumo_Tranmodulodestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_Sdtsdtsalidaconsumo_Tranfecharegistro) )
      {
         oWriter.writeStartElement("tranFechaRegistro");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_Sdtsdtsalidaconsumo_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_Sdtsdtsalidaconsumo_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_Sdtsdtsalidaconsumo_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_Sdtsdtsalidaconsumo_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_Sdtsdtsalidaconsumo_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_Sdtsdtsalidaconsumo_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("tranFechaRegistro", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
      }
      oWriter.writeElement("tranCodAlmaDestino", GXutil.rtrim( gxTv_Sdtsdtsalidaconsumo_Trancodalmadestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranCodBodeDestino", GXutil.rtrim( gxTv_Sdtsdtsalidaconsumo_Trancodbodedestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranIdCuentadanteDestino", GXutil.trim( GXutil.str( gxTv_Sdtsdtsalidaconsumo_Tranidcuentadantedestino, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranEstado", GXutil.rtrim( gxTv_Sdtsdtsalidaconsumo_Tranestado));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranCentroCostoCodigo", GXutil.rtrim( gxTv_Sdtsdtsalidaconsumo_Trancentrocostocodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranCentroCostoCodigoDestino", GXutil.rtrim( gxTv_Sdtsdtsalidaconsumo_Trancentrocostocodigodestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("trancursocodigo", GXutil.rtrim( gxTv_Sdtsdtsalidaconsumo_Trancursocodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranAreadanteCodigo", GXutil.rtrim( gxTv_Sdtsdtsalidaconsumo_Tranareadantecodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tipoDeElemento", GXutil.rtrim( gxTv_Sdtsdtsalidaconsumo_Tipodeelemento));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( gxTv_Sdtsdtsalidaconsumo_Detalles != null )
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
         gxTv_Sdtsdtsalidaconsumo_Detalles.writexmlcollection(oWriter, "detalles", sNameSpace1, "detallesitem", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("tranRegionCodigo", gxTv_Sdtsdtsalidaconsumo_Tranregioncodigo, false);
      AddObjectProperty("tranRegionAbrev", gxTv_Sdtsdtsalidaconsumo_Tranregionabrev, false);
      AddObjectProperty("tranId", gxTv_Sdtsdtsalidaconsumo_Tranid, false);
      AddObjectProperty("tranConsecutivocc", GXutil.ltrim( GXutil.str( gxTv_Sdtsdtsalidaconsumo_Tranconsecutivocc, 18, 0)), false);
      AddObjectProperty("tranModuloDestino", gxTv_Sdtsdtsalidaconsumo_Tranmodulodestino, false);
      datetime_STZ = gxTv_Sdtsdtsalidaconsumo_Tranfecharegistro ;
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
      AddObjectProperty("tranCodAlmaDestino", gxTv_Sdtsdtsalidaconsumo_Trancodalmadestino, false);
      AddObjectProperty("tranCodBodeDestino", gxTv_Sdtsdtsalidaconsumo_Trancodbodedestino, false);
      AddObjectProperty("tranIdCuentadanteDestino", GXutil.ltrim( GXutil.str( gxTv_Sdtsdtsalidaconsumo_Tranidcuentadantedestino, 18, 0)), false);
      AddObjectProperty("tranEstado", gxTv_Sdtsdtsalidaconsumo_Tranestado, false);
      AddObjectProperty("tranCentroCostoCodigo", gxTv_Sdtsdtsalidaconsumo_Trancentrocostocodigo, false);
      AddObjectProperty("tranCentroCostoCodigoDestino", gxTv_Sdtsdtsalidaconsumo_Trancentrocostocodigodestino, false);
      AddObjectProperty("trancursocodigo", gxTv_Sdtsdtsalidaconsumo_Trancursocodigo, false);
      AddObjectProperty("tranAreadanteCodigo", gxTv_Sdtsdtsalidaconsumo_Tranareadantecodigo, false);
      AddObjectProperty("tipoDeElemento", gxTv_Sdtsdtsalidaconsumo_Tipodeelemento, false);
      if ( gxTv_Sdtsdtsalidaconsumo_Detalles != null )
      {
         AddObjectProperty("detalles", gxTv_Sdtsdtsalidaconsumo_Detalles, false);
      }
   }

   public int getgxTv_Sdtsdtsalidaconsumo_Tranregioncodigo( )
   {
      return gxTv_Sdtsdtsalidaconsumo_Tranregioncodigo ;
   }

   public void setgxTv_Sdtsdtsalidaconsumo_Tranregioncodigo( int value )
   {
      gxTv_Sdtsdtsalidaconsumo_Tranregioncodigo = value ;
   }

   public String getgxTv_Sdtsdtsalidaconsumo_Tranregionabrev( )
   {
      return gxTv_Sdtsdtsalidaconsumo_Tranregionabrev ;
   }

   public void setgxTv_Sdtsdtsalidaconsumo_Tranregionabrev( String value )
   {
      gxTv_Sdtsdtsalidaconsumo_Tranregionabrev = value ;
   }

   public long getgxTv_Sdtsdtsalidaconsumo_Tranid( )
   {
      return gxTv_Sdtsdtsalidaconsumo_Tranid ;
   }

   public void setgxTv_Sdtsdtsalidaconsumo_Tranid( long value )
   {
      gxTv_Sdtsdtsalidaconsumo_Tranid = value ;
   }

   public long getgxTv_Sdtsdtsalidaconsumo_Tranconsecutivocc( )
   {
      return gxTv_Sdtsdtsalidaconsumo_Tranconsecutivocc ;
   }

   public void setgxTv_Sdtsdtsalidaconsumo_Tranconsecutivocc( long value )
   {
      gxTv_Sdtsdtsalidaconsumo_Tranconsecutivocc = value ;
   }

   public String getgxTv_Sdtsdtsalidaconsumo_Tranmodulodestino( )
   {
      return gxTv_Sdtsdtsalidaconsumo_Tranmodulodestino ;
   }

   public void setgxTv_Sdtsdtsalidaconsumo_Tranmodulodestino( String value )
   {
      gxTv_Sdtsdtsalidaconsumo_Tranmodulodestino = value ;
   }

   public java.util.Date getgxTv_Sdtsdtsalidaconsumo_Tranfecharegistro( )
   {
      return gxTv_Sdtsdtsalidaconsumo_Tranfecharegistro ;
   }

   public void setgxTv_Sdtsdtsalidaconsumo_Tranfecharegistro( java.util.Date value )
   {
      gxTv_Sdtsdtsalidaconsumo_Tranfecharegistro = value ;
   }

   public String getgxTv_Sdtsdtsalidaconsumo_Trancodalmadestino( )
   {
      return gxTv_Sdtsdtsalidaconsumo_Trancodalmadestino ;
   }

   public void setgxTv_Sdtsdtsalidaconsumo_Trancodalmadestino( String value )
   {
      gxTv_Sdtsdtsalidaconsumo_Trancodalmadestino = value ;
   }

   public String getgxTv_Sdtsdtsalidaconsumo_Trancodbodedestino( )
   {
      return gxTv_Sdtsdtsalidaconsumo_Trancodbodedestino ;
   }

   public void setgxTv_Sdtsdtsalidaconsumo_Trancodbodedestino( String value )
   {
      gxTv_Sdtsdtsalidaconsumo_Trancodbodedestino = value ;
   }

   public long getgxTv_Sdtsdtsalidaconsumo_Tranidcuentadantedestino( )
   {
      return gxTv_Sdtsdtsalidaconsumo_Tranidcuentadantedestino ;
   }

   public void setgxTv_Sdtsdtsalidaconsumo_Tranidcuentadantedestino( long value )
   {
      gxTv_Sdtsdtsalidaconsumo_Tranidcuentadantedestino = value ;
   }

   public String getgxTv_Sdtsdtsalidaconsumo_Tranestado( )
   {
      return gxTv_Sdtsdtsalidaconsumo_Tranestado ;
   }

   public void setgxTv_Sdtsdtsalidaconsumo_Tranestado( String value )
   {
      gxTv_Sdtsdtsalidaconsumo_Tranestado = value ;
   }

   public String getgxTv_Sdtsdtsalidaconsumo_Trancentrocostocodigo( )
   {
      return gxTv_Sdtsdtsalidaconsumo_Trancentrocostocodigo ;
   }

   public void setgxTv_Sdtsdtsalidaconsumo_Trancentrocostocodigo( String value )
   {
      gxTv_Sdtsdtsalidaconsumo_Trancentrocostocodigo = value ;
   }

   public String getgxTv_Sdtsdtsalidaconsumo_Trancentrocostocodigodestino( )
   {
      return gxTv_Sdtsdtsalidaconsumo_Trancentrocostocodigodestino ;
   }

   public void setgxTv_Sdtsdtsalidaconsumo_Trancentrocostocodigodestino( String value )
   {
      gxTv_Sdtsdtsalidaconsumo_Trancentrocostocodigodestino = value ;
   }

   public String getgxTv_Sdtsdtsalidaconsumo_Trancursocodigo( )
   {
      return gxTv_Sdtsdtsalidaconsumo_Trancursocodigo ;
   }

   public void setgxTv_Sdtsdtsalidaconsumo_Trancursocodigo( String value )
   {
      gxTv_Sdtsdtsalidaconsumo_Trancursocodigo = value ;
   }

   public String getgxTv_Sdtsdtsalidaconsumo_Tranareadantecodigo( )
   {
      return gxTv_Sdtsdtsalidaconsumo_Tranareadantecodigo ;
   }

   public void setgxTv_Sdtsdtsalidaconsumo_Tranareadantecodigo( String value )
   {
      gxTv_Sdtsdtsalidaconsumo_Tranareadantecodigo = value ;
   }

   public String getgxTv_Sdtsdtsalidaconsumo_Tipodeelemento( )
   {
      return gxTv_Sdtsdtsalidaconsumo_Tipodeelemento ;
   }

   public void setgxTv_Sdtsdtsalidaconsumo_Tipodeelemento( String value )
   {
      gxTv_Sdtsdtsalidaconsumo_Tipodeelemento = value ;
   }

   public GXBaseCollection<com.orions2.Sdtsdtsalidaconsumo_detallesitem> getgxTv_Sdtsdtsalidaconsumo_Detalles( )
   {
      if ( gxTv_Sdtsdtsalidaconsumo_Detalles == null )
      {
         gxTv_Sdtsdtsalidaconsumo_Detalles = new GXBaseCollection<com.orions2.Sdtsdtsalidaconsumo_detallesitem>(com.orions2.Sdtsdtsalidaconsumo_detallesitem.class, "sdtsalidaconsumo.detallesitem", "ACBSENA", remoteHandle);
      }
      return gxTv_Sdtsdtsalidaconsumo_Detalles ;
   }

   public void setgxTv_Sdtsdtsalidaconsumo_Detalles( GXBaseCollection<com.orions2.Sdtsdtsalidaconsumo_detallesitem> value )
   {
      gxTv_Sdtsdtsalidaconsumo_Detalles = value ;
   }

   public void setgxTv_Sdtsdtsalidaconsumo_Detalles_SetNull( )
   {
      gxTv_Sdtsdtsalidaconsumo_Detalles = null ;
   }

   public boolean getgxTv_Sdtsdtsalidaconsumo_Detalles_IsNull( )
   {
      if ( gxTv_Sdtsdtsalidaconsumo_Detalles == null )
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
      gxTv_Sdtsdtsalidaconsumo_Tranregionabrev = "" ;
      gxTv_Sdtsdtsalidaconsumo_Tranmodulodestino = "" ;
      gxTv_Sdtsdtsalidaconsumo_Tranfecharegistro = GXutil.resetTime( GXutil.nullDate() );
      gxTv_Sdtsdtsalidaconsumo_Trancodalmadestino = "" ;
      gxTv_Sdtsdtsalidaconsumo_Trancodbodedestino = "" ;
      gxTv_Sdtsdtsalidaconsumo_Tranestado = "" ;
      gxTv_Sdtsdtsalidaconsumo_Trancentrocostocodigo = "" ;
      gxTv_Sdtsdtsalidaconsumo_Trancentrocostocodigodestino = "" ;
      gxTv_Sdtsdtsalidaconsumo_Trancursocodigo = "" ;
      gxTv_Sdtsdtsalidaconsumo_Tranareadantecodigo = "" ;
      gxTv_Sdtsdtsalidaconsumo_Tipodeelemento = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public com.orions2.Sdtsdtsalidaconsumo Clone( )
   {
      return (com.orions2.Sdtsdtsalidaconsumo)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtsdtsalidaconsumo struct )
   {
      setgxTv_Sdtsdtsalidaconsumo_Tranregioncodigo(struct.getTranregioncodigo());
      setgxTv_Sdtsdtsalidaconsumo_Tranregionabrev(struct.getTranregionabrev());
      setgxTv_Sdtsdtsalidaconsumo_Tranid(struct.getTranid());
      setgxTv_Sdtsdtsalidaconsumo_Tranconsecutivocc(struct.getTranconsecutivocc());
      setgxTv_Sdtsdtsalidaconsumo_Tranmodulodestino(struct.getTranmodulodestino());
      setgxTv_Sdtsdtsalidaconsumo_Tranfecharegistro(struct.getTranfecharegistro());
      setgxTv_Sdtsdtsalidaconsumo_Trancodalmadestino(struct.getTrancodalmadestino());
      setgxTv_Sdtsdtsalidaconsumo_Trancodbodedestino(struct.getTrancodbodedestino());
      setgxTv_Sdtsdtsalidaconsumo_Tranidcuentadantedestino(struct.getTranidcuentadantedestino());
      setgxTv_Sdtsdtsalidaconsumo_Tranestado(struct.getTranestado());
      setgxTv_Sdtsdtsalidaconsumo_Trancentrocostocodigo(struct.getTrancentrocostocodigo());
      setgxTv_Sdtsdtsalidaconsumo_Trancentrocostocodigodestino(struct.getTrancentrocostocodigodestino());
      setgxTv_Sdtsdtsalidaconsumo_Trancursocodigo(struct.getTrancursocodigo());
      setgxTv_Sdtsdtsalidaconsumo_Tranareadantecodigo(struct.getTranareadantecodigo());
      setgxTv_Sdtsdtsalidaconsumo_Tipodeelemento(struct.getTipodeelemento());
      GXBaseCollection<com.orions2.Sdtsdtsalidaconsumo_detallesitem> gxTv_Sdtsdtsalidaconsumo_Detalles_aux = new GXBaseCollection<com.orions2.Sdtsdtsalidaconsumo_detallesitem>(com.orions2.Sdtsdtsalidaconsumo_detallesitem.class, "sdtsalidaconsumo.detallesitem", "ACBSENA", remoteHandle) ;
      GXBaseCollection<com.orions2.Sdtsdtsalidaconsumo_detallesitem> gxTv_Sdtsdtsalidaconsumo_Detalles_aux1 = new GXBaseCollection<com.orions2.Sdtsdtsalidaconsumo_detallesitem>(com.orions2.Sdtsdtsalidaconsumo_detallesitem.class, "sdtsalidaconsumo.detallesitem", "ACBSENA", remoteHandle) ;
      gxTv_Sdtsdtsalidaconsumo_Detalles_aux1.setStruct(struct.getDetalles());
      for (int i = 0; i < gxTv_Sdtsdtsalidaconsumo_Detalles_aux1.size(); i++)
      {
         gxTv_Sdtsdtsalidaconsumo_Detalles_aux.add(new com.orions2.Sdtsdtsalidaconsumo_detallesitem(gxTv_Sdtsdtsalidaconsumo_Detalles_aux1.elementAt(i).getStruct()));
      }
      setgxTv_Sdtsdtsalidaconsumo_Detalles(gxTv_Sdtsdtsalidaconsumo_Detalles_aux);
   }

   public com.orions2.StructSdtsdtsalidaconsumo getStruct( )
   {
      com.orions2.StructSdtsdtsalidaconsumo struct = new com.orions2.StructSdtsdtsalidaconsumo ();
      struct.setTranregioncodigo(getgxTv_Sdtsdtsalidaconsumo_Tranregioncodigo());
      struct.setTranregionabrev(getgxTv_Sdtsdtsalidaconsumo_Tranregionabrev());
      struct.setTranid(getgxTv_Sdtsdtsalidaconsumo_Tranid());
      struct.setTranconsecutivocc(getgxTv_Sdtsdtsalidaconsumo_Tranconsecutivocc());
      struct.setTranmodulodestino(getgxTv_Sdtsdtsalidaconsumo_Tranmodulodestino());
      struct.setTranfecharegistro(getgxTv_Sdtsdtsalidaconsumo_Tranfecharegistro());
      struct.setTrancodalmadestino(getgxTv_Sdtsdtsalidaconsumo_Trancodalmadestino());
      struct.setTrancodbodedestino(getgxTv_Sdtsdtsalidaconsumo_Trancodbodedestino());
      struct.setTranidcuentadantedestino(getgxTv_Sdtsdtsalidaconsumo_Tranidcuentadantedestino());
      struct.setTranestado(getgxTv_Sdtsdtsalidaconsumo_Tranestado());
      struct.setTrancentrocostocodigo(getgxTv_Sdtsdtsalidaconsumo_Trancentrocostocodigo());
      struct.setTrancentrocostocodigodestino(getgxTv_Sdtsdtsalidaconsumo_Trancentrocostocodigodestino());
      struct.setTrancursocodigo(getgxTv_Sdtsdtsalidaconsumo_Trancursocodigo());
      struct.setTranareadantecodigo(getgxTv_Sdtsdtsalidaconsumo_Tranareadantecodigo());
      struct.setTipodeelemento(getgxTv_Sdtsdtsalidaconsumo_Tipodeelemento());
      Vector aux_vectorgxTv_Sdtsdtsalidaconsumo_Detalles = getgxTv_Sdtsdtsalidaconsumo_Detalles().getStruct();
      Vector aux_vector1gxTv_Sdtsdtsalidaconsumo_Detalles = new Vector();
      for (int i = 0; i < aux_vectorgxTv_Sdtsdtsalidaconsumo_Detalles.size(); i++)
      {
         aux_vector1gxTv_Sdtsdtsalidaconsumo_Detalles.addElement(((com.orions2.Sdtsdtsalidaconsumo_detallesitem)aux_vectorgxTv_Sdtsdtsalidaconsumo_Detalles.elementAt(i)).getStruct());
      }
      struct.setDetalles(aux_vector1gxTv_Sdtsdtsalidaconsumo_Detalles);
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_Sdtsdtsalidaconsumo_Tranregioncodigo ;
   protected long gxTv_Sdtsdtsalidaconsumo_Tranid ;
   protected long gxTv_Sdtsdtsalidaconsumo_Tranconsecutivocc ;
   protected long gxTv_Sdtsdtsalidaconsumo_Tranidcuentadantedestino ;
   protected String gxTv_Sdtsdtsalidaconsumo_Tranestado ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_Sdtsdtsalidaconsumo_Tranfecharegistro ;
   protected java.util.Date datetime_STZ ;
   protected String gxTv_Sdtsdtsalidaconsumo_Tranregionabrev ;
   protected String gxTv_Sdtsdtsalidaconsumo_Tranmodulodestino ;
   protected String gxTv_Sdtsdtsalidaconsumo_Trancodalmadestino ;
   protected String gxTv_Sdtsdtsalidaconsumo_Trancodbodedestino ;
   protected String gxTv_Sdtsdtsalidaconsumo_Trancentrocostocodigo ;
   protected String gxTv_Sdtsdtsalidaconsumo_Trancentrocostocodigodestino ;
   protected String gxTv_Sdtsdtsalidaconsumo_Trancursocodigo ;
   protected String gxTv_Sdtsdtsalidaconsumo_Tranareadantecodigo ;
   protected String gxTv_Sdtsdtsalidaconsumo_Tipodeelemento ;
   protected GXBaseCollection<com.orions2.Sdtsdtsalidaconsumo_detallesitem> gxTv_Sdtsdtsalidaconsumo_Detalles_aux ;
   protected GXBaseCollection<com.orions2.Sdtsdtsalidaconsumo_detallesitem> gxTv_Sdtsdtsalidaconsumo_Detalles_aux1 ;
   protected GXBaseCollection<com.orions2.Sdtsdtsalidaconsumo_detallesitem> gxTv_Sdtsdtsalidaconsumo_Detalles=null ;
}

