/*
               File: SdtSDTCierreMes
        Description: SDTCierreMes
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:17.0
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

public final  class SdtSDTCierreMes extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTCierreMes( )
   {
      this(  new ModelContext(SdtSDTCierreMes.class));
   }

   public SdtSDTCierreMes( ModelContext context )
   {
      super( context, "SdtSDTCierreMes");
   }

   public SdtSDTCierreMes( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTCierreMes");
   }

   public SdtSDTCierreMes( StructSdtSDTCierreMes struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranFechaRegistro") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTCierreMes_Tranfecharegistro = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtSDTCierreMes_Tranfecharegistro = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranRegionAbrevOrigen") )
            {
               gxTv_SdtSDTCierreMes_Tranregionabrevorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranRegionCodigo") )
            {
               gxTv_SdtSDTCierreMes_Tranregioncodigo = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranCentroCostoCodigoOrigen") )
            {
               gxTv_SdtSDTCierreMes_Trancentrocostocodigoorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranModuloOrigen") )
            {
               gxTv_SdtSDTCierreMes_Tranmoduloorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranCodAlmaOrigen") )
            {
               gxTv_SdtSDTCierreMes_Trancodalmaorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranCodBodeOrigen") )
            {
               gxTv_SdtSDTCierreMes_Trancodbodeorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranRegionCodigoDestino") )
            {
               gxTv_SdtSDTCierreMes_Tranregioncodigodestino = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranRegionAbrevDestino") )
            {
               gxTv_SdtSDTCierreMes_Tranregionabrevdestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranModuloDestino") )
            {
               gxTv_SdtSDTCierreMes_Tranmodulodestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranCodAlmaDestino") )
            {
               gxTv_SdtSDTCierreMes_Trancodalmadestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranCodBodeDestino") )
            {
               gxTv_SdtSDTCierreMes_Trancodbodedestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranCentroCostoCodigoDestino") )
            {
               gxTv_SdtSDTCierreMes_Trancentrocostocodigodestino = oReader.getValue() ;
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
         sName = "SDTCierreMes" ;
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
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTCierreMes_Tranfecharegistro) )
      {
         oWriter.writeStartElement("tranFechaRegistro");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTCierreMes_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTCierreMes_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTCierreMes_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSDTCierreMes_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSDTCierreMes_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSDTCierreMes_Tranfecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("tranFechaRegistro", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
      }
      oWriter.writeElement("tranRegionAbrevOrigen", GXutil.rtrim( gxTv_SdtSDTCierreMes_Tranregionabrevorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranRegionCodigo", GXutil.trim( GXutil.str( gxTv_SdtSDTCierreMes_Tranregioncodigo, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranCentroCostoCodigoOrigen", GXutil.rtrim( gxTv_SdtSDTCierreMes_Trancentrocostocodigoorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranModuloOrigen", GXutil.rtrim( gxTv_SdtSDTCierreMes_Tranmoduloorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranCodAlmaOrigen", GXutil.rtrim( gxTv_SdtSDTCierreMes_Trancodalmaorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranCodBodeOrigen", GXutil.rtrim( gxTv_SdtSDTCierreMes_Trancodbodeorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranRegionCodigoDestino", GXutil.trim( GXutil.str( gxTv_SdtSDTCierreMes_Tranregioncodigodestino, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranRegionAbrevDestino", GXutil.rtrim( gxTv_SdtSDTCierreMes_Tranregionabrevdestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranModuloDestino", GXutil.rtrim( gxTv_SdtSDTCierreMes_Tranmodulodestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranCodAlmaDestino", GXutil.rtrim( gxTv_SdtSDTCierreMes_Trancodalmadestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranCodBodeDestino", GXutil.rtrim( gxTv_SdtSDTCierreMes_Trancodbodedestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranCentroCostoCodigoDestino", GXutil.rtrim( gxTv_SdtSDTCierreMes_Trancentrocostocodigodestino));
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
      datetime_STZ = gxTv_SdtSDTCierreMes_Tranfecharegistro ;
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
      AddObjectProperty("tranRegionAbrevOrigen", gxTv_SdtSDTCierreMes_Tranregionabrevorigen, false);
      AddObjectProperty("tranRegionCodigo", gxTv_SdtSDTCierreMes_Tranregioncodigo, false);
      AddObjectProperty("tranCentroCostoCodigoOrigen", gxTv_SdtSDTCierreMes_Trancentrocostocodigoorigen, false);
      AddObjectProperty("tranModuloOrigen", gxTv_SdtSDTCierreMes_Tranmoduloorigen, false);
      AddObjectProperty("tranCodAlmaOrigen", gxTv_SdtSDTCierreMes_Trancodalmaorigen, false);
      AddObjectProperty("tranCodBodeOrigen", gxTv_SdtSDTCierreMes_Trancodbodeorigen, false);
      AddObjectProperty("tranRegionCodigoDestino", gxTv_SdtSDTCierreMes_Tranregioncodigodestino, false);
      AddObjectProperty("tranRegionAbrevDestino", gxTv_SdtSDTCierreMes_Tranregionabrevdestino, false);
      AddObjectProperty("tranModuloDestino", gxTv_SdtSDTCierreMes_Tranmodulodestino, false);
      AddObjectProperty("tranCodAlmaDestino", gxTv_SdtSDTCierreMes_Trancodalmadestino, false);
      AddObjectProperty("tranCodBodeDestino", gxTv_SdtSDTCierreMes_Trancodbodedestino, false);
      AddObjectProperty("tranCentroCostoCodigoDestino", gxTv_SdtSDTCierreMes_Trancentrocostocodigodestino, false);
   }

   public java.util.Date getgxTv_SdtSDTCierreMes_Tranfecharegistro( )
   {
      return gxTv_SdtSDTCierreMes_Tranfecharegistro ;
   }

   public void setgxTv_SdtSDTCierreMes_Tranfecharegistro( java.util.Date value )
   {
      gxTv_SdtSDTCierreMes_Tranfecharegistro = value ;
   }

   public String getgxTv_SdtSDTCierreMes_Tranregionabrevorigen( )
   {
      return gxTv_SdtSDTCierreMes_Tranregionabrevorigen ;
   }

   public void setgxTv_SdtSDTCierreMes_Tranregionabrevorigen( String value )
   {
      gxTv_SdtSDTCierreMes_Tranregionabrevorigen = value ;
   }

   public short getgxTv_SdtSDTCierreMes_Tranregioncodigo( )
   {
      return gxTv_SdtSDTCierreMes_Tranregioncodigo ;
   }

   public void setgxTv_SdtSDTCierreMes_Tranregioncodigo( short value )
   {
      gxTv_SdtSDTCierreMes_Tranregioncodigo = value ;
   }

   public String getgxTv_SdtSDTCierreMes_Trancentrocostocodigoorigen( )
   {
      return gxTv_SdtSDTCierreMes_Trancentrocostocodigoorigen ;
   }

   public void setgxTv_SdtSDTCierreMes_Trancentrocostocodigoorigen( String value )
   {
      gxTv_SdtSDTCierreMes_Trancentrocostocodigoorigen = value ;
   }

   public String getgxTv_SdtSDTCierreMes_Tranmoduloorigen( )
   {
      return gxTv_SdtSDTCierreMes_Tranmoduloorigen ;
   }

   public void setgxTv_SdtSDTCierreMes_Tranmoduloorigen( String value )
   {
      gxTv_SdtSDTCierreMes_Tranmoduloorigen = value ;
   }

   public String getgxTv_SdtSDTCierreMes_Trancodalmaorigen( )
   {
      return gxTv_SdtSDTCierreMes_Trancodalmaorigen ;
   }

   public void setgxTv_SdtSDTCierreMes_Trancodalmaorigen( String value )
   {
      gxTv_SdtSDTCierreMes_Trancodalmaorigen = value ;
   }

   public String getgxTv_SdtSDTCierreMes_Trancodbodeorigen( )
   {
      return gxTv_SdtSDTCierreMes_Trancodbodeorigen ;
   }

   public void setgxTv_SdtSDTCierreMes_Trancodbodeorigen( String value )
   {
      gxTv_SdtSDTCierreMes_Trancodbodeorigen = value ;
   }

   public short getgxTv_SdtSDTCierreMes_Tranregioncodigodestino( )
   {
      return gxTv_SdtSDTCierreMes_Tranregioncodigodestino ;
   }

   public void setgxTv_SdtSDTCierreMes_Tranregioncodigodestino( short value )
   {
      gxTv_SdtSDTCierreMes_Tranregioncodigodestino = value ;
   }

   public String getgxTv_SdtSDTCierreMes_Tranregionabrevdestino( )
   {
      return gxTv_SdtSDTCierreMes_Tranregionabrevdestino ;
   }

   public void setgxTv_SdtSDTCierreMes_Tranregionabrevdestino( String value )
   {
      gxTv_SdtSDTCierreMes_Tranregionabrevdestino = value ;
   }

   public String getgxTv_SdtSDTCierreMes_Tranmodulodestino( )
   {
      return gxTv_SdtSDTCierreMes_Tranmodulodestino ;
   }

   public void setgxTv_SdtSDTCierreMes_Tranmodulodestino( String value )
   {
      gxTv_SdtSDTCierreMes_Tranmodulodestino = value ;
   }

   public String getgxTv_SdtSDTCierreMes_Trancodalmadestino( )
   {
      return gxTv_SdtSDTCierreMes_Trancodalmadestino ;
   }

   public void setgxTv_SdtSDTCierreMes_Trancodalmadestino( String value )
   {
      gxTv_SdtSDTCierreMes_Trancodalmadestino = value ;
   }

   public String getgxTv_SdtSDTCierreMes_Trancodbodedestino( )
   {
      return gxTv_SdtSDTCierreMes_Trancodbodedestino ;
   }

   public void setgxTv_SdtSDTCierreMes_Trancodbodedestino( String value )
   {
      gxTv_SdtSDTCierreMes_Trancodbodedestino = value ;
   }

   public String getgxTv_SdtSDTCierreMes_Trancentrocostocodigodestino( )
   {
      return gxTv_SdtSDTCierreMes_Trancentrocostocodigodestino ;
   }

   public void setgxTv_SdtSDTCierreMes_Trancentrocostocodigodestino( String value )
   {
      gxTv_SdtSDTCierreMes_Trancentrocostocodigodestino = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTCierreMes_Tranfecharegistro = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSDTCierreMes_Tranregionabrevorigen = "" ;
      gxTv_SdtSDTCierreMes_Trancentrocostocodigoorigen = "" ;
      gxTv_SdtSDTCierreMes_Tranmoduloorigen = "" ;
      gxTv_SdtSDTCierreMes_Trancodalmaorigen = "" ;
      gxTv_SdtSDTCierreMes_Trancodbodeorigen = "" ;
      gxTv_SdtSDTCierreMes_Tranregionabrevdestino = "" ;
      gxTv_SdtSDTCierreMes_Tranmodulodestino = "" ;
      gxTv_SdtSDTCierreMes_Trancodalmadestino = "" ;
      gxTv_SdtSDTCierreMes_Trancodbodedestino = "" ;
      gxTv_SdtSDTCierreMes_Trancentrocostocodigodestino = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public com.orions2.SdtSDTCierreMes Clone( )
   {
      return (com.orions2.SdtSDTCierreMes)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTCierreMes struct )
   {
      setgxTv_SdtSDTCierreMes_Tranfecharegistro(struct.getTranfecharegistro());
      setgxTv_SdtSDTCierreMes_Tranregionabrevorigen(struct.getTranregionabrevorigen());
      setgxTv_SdtSDTCierreMes_Tranregioncodigo(struct.getTranregioncodigo());
      setgxTv_SdtSDTCierreMes_Trancentrocostocodigoorigen(struct.getTrancentrocostocodigoorigen());
      setgxTv_SdtSDTCierreMes_Tranmoduloorigen(struct.getTranmoduloorigen());
      setgxTv_SdtSDTCierreMes_Trancodalmaorigen(struct.getTrancodalmaorigen());
      setgxTv_SdtSDTCierreMes_Trancodbodeorigen(struct.getTrancodbodeorigen());
      setgxTv_SdtSDTCierreMes_Tranregioncodigodestino(struct.getTranregioncodigodestino());
      setgxTv_SdtSDTCierreMes_Tranregionabrevdestino(struct.getTranregionabrevdestino());
      setgxTv_SdtSDTCierreMes_Tranmodulodestino(struct.getTranmodulodestino());
      setgxTv_SdtSDTCierreMes_Trancodalmadestino(struct.getTrancodalmadestino());
      setgxTv_SdtSDTCierreMes_Trancodbodedestino(struct.getTrancodbodedestino());
      setgxTv_SdtSDTCierreMes_Trancentrocostocodigodestino(struct.getTrancentrocostocodigodestino());
   }

   public com.orions2.StructSdtSDTCierreMes getStruct( )
   {
      com.orions2.StructSdtSDTCierreMes struct = new com.orions2.StructSdtSDTCierreMes ();
      struct.setTranfecharegistro(getgxTv_SdtSDTCierreMes_Tranfecharegistro());
      struct.setTranregionabrevorigen(getgxTv_SdtSDTCierreMes_Tranregionabrevorigen());
      struct.setTranregioncodigo(getgxTv_SdtSDTCierreMes_Tranregioncodigo());
      struct.setTrancentrocostocodigoorigen(getgxTv_SdtSDTCierreMes_Trancentrocostocodigoorigen());
      struct.setTranmoduloorigen(getgxTv_SdtSDTCierreMes_Tranmoduloorigen());
      struct.setTrancodalmaorigen(getgxTv_SdtSDTCierreMes_Trancodalmaorigen());
      struct.setTrancodbodeorigen(getgxTv_SdtSDTCierreMes_Trancodbodeorigen());
      struct.setTranregioncodigodestino(getgxTv_SdtSDTCierreMes_Tranregioncodigodestino());
      struct.setTranregionabrevdestino(getgxTv_SdtSDTCierreMes_Tranregionabrevdestino());
      struct.setTranmodulodestino(getgxTv_SdtSDTCierreMes_Tranmodulodestino());
      struct.setTrancodalmadestino(getgxTv_SdtSDTCierreMes_Trancodalmadestino());
      struct.setTrancodbodedestino(getgxTv_SdtSDTCierreMes_Trancodbodedestino());
      struct.setTrancentrocostocodigodestino(getgxTv_SdtSDTCierreMes_Trancentrocostocodigodestino());
      return struct ;
   }

   protected short gxTv_SdtSDTCierreMes_Tranregioncodigo ;
   protected short gxTv_SdtSDTCierreMes_Tranregioncodigodestino ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTCierreMes_Tranfecharegistro ;
   protected java.util.Date datetime_STZ ;
   protected String gxTv_SdtSDTCierreMes_Tranregionabrevorigen ;
   protected String gxTv_SdtSDTCierreMes_Trancentrocostocodigoorigen ;
   protected String gxTv_SdtSDTCierreMes_Tranmoduloorigen ;
   protected String gxTv_SdtSDTCierreMes_Trancodalmaorigen ;
   protected String gxTv_SdtSDTCierreMes_Trancodbodeorigen ;
   protected String gxTv_SdtSDTCierreMes_Tranregionabrevdestino ;
   protected String gxTv_SdtSDTCierreMes_Tranmodulodestino ;
   protected String gxTv_SdtSDTCierreMes_Trancodalmadestino ;
   protected String gxTv_SdtSDTCierreMes_Trancodbodedestino ;
   protected String gxTv_SdtSDTCierreMes_Trancentrocostocodigodestino ;
}

