/*
               File: SdtSDTInventarioDevolutivo
        Description: SDTInventarioDevolutivo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:18.75
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

public final  class SdtSDTInventarioDevolutivo extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTInventarioDevolutivo( )
   {
      this(  new ModelContext(SdtSDTInventarioDevolutivo.class));
   }

   public SdtSDTInventarioDevolutivo( ModelContext context )
   {
      super( context, "SdtSDTInventarioDevolutivo");
   }

   public SdtSDTInventarioDevolutivo( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTInventarioDevolutivo");
   }

   public SdtSDTInventarioDevolutivo( StructSdtSDTInventarioDevolutivo struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Invd_NumeroPlaca") )
            {
               gxTv_SdtSDTInventarioDevolutivo_Invd_numeroplaca = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Invd_DescripcionDevolutivo") )
            {
               gxTv_SdtSDTInventarioDevolutivo_Invd_descripciondevolutivo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Invd_RegionalId") )
            {
               gxTv_SdtSDTInventarioDevolutivo_Invd_regionalid = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Invd_CentroCostoId") )
            {
               gxTv_SdtSDTInventarioDevolutivo_Invd_centrocostoid = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Invd_ModuloAlmacen") )
            {
               gxTv_SdtSDTInventarioDevolutivo_Invd_moduloalmacen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Invd_AlmacenCodigo") )
            {
               gxTv_SdtSDTInventarioDevolutivo_Invd_almacencodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Invd_BodegaCodigo") )
            {
               gxTv_SdtSDTInventarioDevolutivo_Invd_bodegacodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Invd_Serial") )
            {
               gxTv_SdtSDTInventarioDevolutivo_Invd_serial = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Invd_Marca") )
            {
               gxTv_SdtSDTInventarioDevolutivo_Invd_marca = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Invd_Modelo") )
            {
               gxTv_SdtSDTInventarioDevolutivo_Invd_modelo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Invd_Estado") )
            {
               gxTv_SdtSDTInventarioDevolutivo_Invd_estado = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Invd_VidaUtil") )
            {
               gxTv_SdtSDTInventarioDevolutivo_Invd_vidautil = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Invd_ValorAdquisicion") )
            {
               gxTv_SdtSDTInventarioDevolutivo_Invd_valoradquisicion = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Invd_FechaAdquisicion") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTInventarioDevolutivo_Invd_fechaadquisicion = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtSDTInventarioDevolutivo_Invd_fechaadquisicion = localUtil.ymdtod( (int)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (int)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (int)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cuen_Identificacion") )
            {
               gxTv_SdtSDTInventarioDevolutivo_Cuen_identificacion = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Invd_PlacaPadre") )
            {
               gxTv_SdtSDTInventarioDevolutivo_Invd_placapadre = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Invd_EsPlacaPadre") )
            {
               gxTv_SdtSDTInventarioDevolutivo_Invd_esplacapadre = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Invd_FechaServicio") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTInventarioDevolutivo_Invd_fechaservicio = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtSDTInventarioDevolutivo_Invd_fechaservicio = localUtil.ymdtod( (int)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (int)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (int)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), "."))) ;
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
         sName = "SDTInventarioDevolutivo" ;
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
      oWriter.writeElement("Invd_NumeroPlaca", GXutil.rtrim( gxTv_SdtSDTInventarioDevolutivo_Invd_numeroplaca));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Invd_DescripcionDevolutivo", GXutil.rtrim( gxTv_SdtSDTInventarioDevolutivo_Invd_descripciondevolutivo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Invd_RegionalId", GXutil.trim( GXutil.str( gxTv_SdtSDTInventarioDevolutivo_Invd_regionalid, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Invd_CentroCostoId", GXutil.trim( GXutil.str( gxTv_SdtSDTInventarioDevolutivo_Invd_centrocostoid, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Invd_ModuloAlmacen", GXutil.rtrim( gxTv_SdtSDTInventarioDevolutivo_Invd_moduloalmacen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Invd_AlmacenCodigo", GXutil.rtrim( gxTv_SdtSDTInventarioDevolutivo_Invd_almacencodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Invd_BodegaCodigo", GXutil.rtrim( gxTv_SdtSDTInventarioDevolutivo_Invd_bodegacodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Invd_Serial", GXutil.rtrim( gxTv_SdtSDTInventarioDevolutivo_Invd_serial));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Invd_Marca", GXutil.rtrim( gxTv_SdtSDTInventarioDevolutivo_Invd_marca));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Invd_Modelo", GXutil.rtrim( gxTv_SdtSDTInventarioDevolutivo_Invd_modelo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Invd_Estado", GXutil.rtrim( gxTv_SdtSDTInventarioDevolutivo_Invd_estado));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Invd_VidaUtil", GXutil.trim( GXutil.str( gxTv_SdtSDTInventarioDevolutivo_Invd_vidautil, 7, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Invd_ValorAdquisicion", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInventarioDevolutivo_Invd_valoradquisicion, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTInventarioDevolutivo_Invd_fechaadquisicion) )
      {
         oWriter.writeStartElement("Invd_FechaAdquisicion");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTInventarioDevolutivo_Invd_fechaadquisicion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTInventarioDevolutivo_Invd_fechaadquisicion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTInventarioDevolutivo_Invd_fechaadquisicion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Invd_FechaAdquisicion", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
      }
      oWriter.writeElement("Cuen_Identificacion", GXutil.trim( GXutil.str( gxTv_SdtSDTInventarioDevolutivo_Cuen_identificacion, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Invd_PlacaPadre", GXutil.rtrim( gxTv_SdtSDTInventarioDevolutivo_Invd_placapadre));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Invd_EsPlacaPadre", GXutil.rtrim( gxTv_SdtSDTInventarioDevolutivo_Invd_esplacapadre));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTInventarioDevolutivo_Invd_fechaservicio) )
      {
         oWriter.writeStartElement("Invd_FechaServicio");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTInventarioDevolutivo_Invd_fechaservicio), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTInventarioDevolutivo_Invd_fechaservicio), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTInventarioDevolutivo_Invd_fechaservicio), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Invd_FechaServicio", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("Invd_NumeroPlaca", gxTv_SdtSDTInventarioDevolutivo_Invd_numeroplaca, false);
      AddObjectProperty("Invd_DescripcionDevolutivo", gxTv_SdtSDTInventarioDevolutivo_Invd_descripciondevolutivo, false);
      AddObjectProperty("Invd_RegionalId", gxTv_SdtSDTInventarioDevolutivo_Invd_regionalid, false);
      AddObjectProperty("Invd_CentroCostoId", gxTv_SdtSDTInventarioDevolutivo_Invd_centrocostoid, false);
      AddObjectProperty("Invd_ModuloAlmacen", gxTv_SdtSDTInventarioDevolutivo_Invd_moduloalmacen, false);
      AddObjectProperty("Invd_AlmacenCodigo", gxTv_SdtSDTInventarioDevolutivo_Invd_almacencodigo, false);
      AddObjectProperty("Invd_BodegaCodigo", gxTv_SdtSDTInventarioDevolutivo_Invd_bodegacodigo, false);
      AddObjectProperty("Invd_Serial", gxTv_SdtSDTInventarioDevolutivo_Invd_serial, false);
      AddObjectProperty("Invd_Marca", gxTv_SdtSDTInventarioDevolutivo_Invd_marca, false);
      AddObjectProperty("Invd_Modelo", gxTv_SdtSDTInventarioDevolutivo_Invd_modelo, false);
      AddObjectProperty("Invd_Estado", gxTv_SdtSDTInventarioDevolutivo_Invd_estado, false);
      AddObjectProperty("Invd_VidaUtil", gxTv_SdtSDTInventarioDevolutivo_Invd_vidautil, false);
      AddObjectProperty("Invd_ValorAdquisicion", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSDTInventarioDevolutivo_Invd_valoradquisicion, 18, 2)), false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTInventarioDevolutivo_Invd_fechaadquisicion), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTInventarioDevolutivo_Invd_fechaadquisicion), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTInventarioDevolutivo_Invd_fechaadquisicion), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Invd_FechaAdquisicion", sDateCnv, false);
      AddObjectProperty("Cuen_Identificacion", GXutil.ltrim( GXutil.str( gxTv_SdtSDTInventarioDevolutivo_Cuen_identificacion, 18, 0)), false);
      AddObjectProperty("Invd_PlacaPadre", gxTv_SdtSDTInventarioDevolutivo_Invd_placapadre, false);
      AddObjectProperty("Invd_EsPlacaPadre", gxTv_SdtSDTInventarioDevolutivo_Invd_esplacapadre, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTInventarioDevolutivo_Invd_fechaservicio), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTInventarioDevolutivo_Invd_fechaservicio), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTInventarioDevolutivo_Invd_fechaservicio), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Invd_FechaServicio", sDateCnv, false);
   }

   public String getgxTv_SdtSDTInventarioDevolutivo_Invd_numeroplaca( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Invd_numeroplaca ;
   }

   public void setgxTv_SdtSDTInventarioDevolutivo_Invd_numeroplaca( String value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_numeroplaca = value ;
   }

   public String getgxTv_SdtSDTInventarioDevolutivo_Invd_descripciondevolutivo( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Invd_descripciondevolutivo ;
   }

   public void setgxTv_SdtSDTInventarioDevolutivo_Invd_descripciondevolutivo( String value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_descripciondevolutivo = value ;
   }

   public long getgxTv_SdtSDTInventarioDevolutivo_Invd_regionalid( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Invd_regionalid ;
   }

   public void setgxTv_SdtSDTInventarioDevolutivo_Invd_regionalid( long value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_regionalid = value ;
   }

   public long getgxTv_SdtSDTInventarioDevolutivo_Invd_centrocostoid( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Invd_centrocostoid ;
   }

   public void setgxTv_SdtSDTInventarioDevolutivo_Invd_centrocostoid( long value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_centrocostoid = value ;
   }

   public String getgxTv_SdtSDTInventarioDevolutivo_Invd_moduloalmacen( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Invd_moduloalmacen ;
   }

   public void setgxTv_SdtSDTInventarioDevolutivo_Invd_moduloalmacen( String value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_moduloalmacen = value ;
   }

   public String getgxTv_SdtSDTInventarioDevolutivo_Invd_almacencodigo( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Invd_almacencodigo ;
   }

   public void setgxTv_SdtSDTInventarioDevolutivo_Invd_almacencodigo( String value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_almacencodigo = value ;
   }

   public String getgxTv_SdtSDTInventarioDevolutivo_Invd_bodegacodigo( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Invd_bodegacodigo ;
   }

   public void setgxTv_SdtSDTInventarioDevolutivo_Invd_bodegacodigo( String value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_bodegacodigo = value ;
   }

   public String getgxTv_SdtSDTInventarioDevolutivo_Invd_serial( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Invd_serial ;
   }

   public void setgxTv_SdtSDTInventarioDevolutivo_Invd_serial( String value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_serial = value ;
   }

   public String getgxTv_SdtSDTInventarioDevolutivo_Invd_marca( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Invd_marca ;
   }

   public void setgxTv_SdtSDTInventarioDevolutivo_Invd_marca( String value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_marca = value ;
   }

   public String getgxTv_SdtSDTInventarioDevolutivo_Invd_modelo( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Invd_modelo ;
   }

   public void setgxTv_SdtSDTInventarioDevolutivo_Invd_modelo( String value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_modelo = value ;
   }

   public String getgxTv_SdtSDTInventarioDevolutivo_Invd_estado( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Invd_estado ;
   }

   public void setgxTv_SdtSDTInventarioDevolutivo_Invd_estado( String value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_estado = value ;
   }

   public int getgxTv_SdtSDTInventarioDevolutivo_Invd_vidautil( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Invd_vidautil ;
   }

   public void setgxTv_SdtSDTInventarioDevolutivo_Invd_vidautil( int value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_vidautil = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInventarioDevolutivo_Invd_valoradquisicion( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Invd_valoradquisicion ;
   }

   public void setgxTv_SdtSDTInventarioDevolutivo_Invd_valoradquisicion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_valoradquisicion = value ;
   }

   public java.util.Date getgxTv_SdtSDTInventarioDevolutivo_Invd_fechaadquisicion( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Invd_fechaadquisicion ;
   }

   public void setgxTv_SdtSDTInventarioDevolutivo_Invd_fechaadquisicion( java.util.Date value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_fechaadquisicion = value ;
   }

   public long getgxTv_SdtSDTInventarioDevolutivo_Cuen_identificacion( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Cuen_identificacion ;
   }

   public void setgxTv_SdtSDTInventarioDevolutivo_Cuen_identificacion( long value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Cuen_identificacion = value ;
   }

   public String getgxTv_SdtSDTInventarioDevolutivo_Invd_placapadre( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Invd_placapadre ;
   }

   public void setgxTv_SdtSDTInventarioDevolutivo_Invd_placapadre( String value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_placapadre = value ;
   }

   public String getgxTv_SdtSDTInventarioDevolutivo_Invd_esplacapadre( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Invd_esplacapadre ;
   }

   public void setgxTv_SdtSDTInventarioDevolutivo_Invd_esplacapadre( String value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_esplacapadre = value ;
   }

   public java.util.Date getgxTv_SdtSDTInventarioDevolutivo_Invd_fechaservicio( )
   {
      return gxTv_SdtSDTInventarioDevolutivo_Invd_fechaservicio ;
   }

   public void setgxTv_SdtSDTInventarioDevolutivo_Invd_fechaservicio( java.util.Date value )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_fechaservicio = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTInventarioDevolutivo_Invd_numeroplaca = "" ;
      gxTv_SdtSDTInventarioDevolutivo_Invd_descripciondevolutivo = "" ;
      gxTv_SdtSDTInventarioDevolutivo_Invd_moduloalmacen = "" ;
      gxTv_SdtSDTInventarioDevolutivo_Invd_almacencodigo = "" ;
      gxTv_SdtSDTInventarioDevolutivo_Invd_bodegacodigo = "" ;
      gxTv_SdtSDTInventarioDevolutivo_Invd_serial = "" ;
      gxTv_SdtSDTInventarioDevolutivo_Invd_marca = "" ;
      gxTv_SdtSDTInventarioDevolutivo_Invd_modelo = "" ;
      gxTv_SdtSDTInventarioDevolutivo_Invd_estado = "" ;
      gxTv_SdtSDTInventarioDevolutivo_Invd_valoradquisicion = DecimalUtil.ZERO ;
      gxTv_SdtSDTInventarioDevolutivo_Invd_fechaadquisicion = GXutil.nullDate() ;
      gxTv_SdtSDTInventarioDevolutivo_Invd_placapadre = "" ;
      gxTv_SdtSDTInventarioDevolutivo_Invd_esplacapadre = "" ;
      gxTv_SdtSDTInventarioDevolutivo_Invd_fechaservicio = GXutil.nullDate() ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public com.orions2.SdtSDTInventarioDevolutivo Clone( )
   {
      return (com.orions2.SdtSDTInventarioDevolutivo)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTInventarioDevolutivo struct )
   {
      setgxTv_SdtSDTInventarioDevolutivo_Invd_numeroplaca(struct.getInvd_numeroplaca());
      setgxTv_SdtSDTInventarioDevolutivo_Invd_descripciondevolutivo(struct.getInvd_descripciondevolutivo());
      setgxTv_SdtSDTInventarioDevolutivo_Invd_regionalid(struct.getInvd_regionalid());
      setgxTv_SdtSDTInventarioDevolutivo_Invd_centrocostoid(struct.getInvd_centrocostoid());
      setgxTv_SdtSDTInventarioDevolutivo_Invd_moduloalmacen(struct.getInvd_moduloalmacen());
      setgxTv_SdtSDTInventarioDevolutivo_Invd_almacencodigo(struct.getInvd_almacencodigo());
      setgxTv_SdtSDTInventarioDevolutivo_Invd_bodegacodigo(struct.getInvd_bodegacodigo());
      setgxTv_SdtSDTInventarioDevolutivo_Invd_serial(struct.getInvd_serial());
      setgxTv_SdtSDTInventarioDevolutivo_Invd_marca(struct.getInvd_marca());
      setgxTv_SdtSDTInventarioDevolutivo_Invd_modelo(struct.getInvd_modelo());
      setgxTv_SdtSDTInventarioDevolutivo_Invd_estado(struct.getInvd_estado());
      setgxTv_SdtSDTInventarioDevolutivo_Invd_vidautil(struct.getInvd_vidautil());
      setgxTv_SdtSDTInventarioDevolutivo_Invd_valoradquisicion(struct.getInvd_valoradquisicion());
      setgxTv_SdtSDTInventarioDevolutivo_Invd_fechaadquisicion(struct.getInvd_fechaadquisicion());
      setgxTv_SdtSDTInventarioDevolutivo_Cuen_identificacion(struct.getCuen_identificacion());
      setgxTv_SdtSDTInventarioDevolutivo_Invd_placapadre(struct.getInvd_placapadre());
      setgxTv_SdtSDTInventarioDevolutivo_Invd_esplacapadre(struct.getInvd_esplacapadre());
      setgxTv_SdtSDTInventarioDevolutivo_Invd_fechaservicio(struct.getInvd_fechaservicio());
   }

   public com.orions2.StructSdtSDTInventarioDevolutivo getStruct( )
   {
      com.orions2.StructSdtSDTInventarioDevolutivo struct = new com.orions2.StructSdtSDTInventarioDevolutivo ();
      struct.setInvd_numeroplaca(getgxTv_SdtSDTInventarioDevolutivo_Invd_numeroplaca());
      struct.setInvd_descripciondevolutivo(getgxTv_SdtSDTInventarioDevolutivo_Invd_descripciondevolutivo());
      struct.setInvd_regionalid(getgxTv_SdtSDTInventarioDevolutivo_Invd_regionalid());
      struct.setInvd_centrocostoid(getgxTv_SdtSDTInventarioDevolutivo_Invd_centrocostoid());
      struct.setInvd_moduloalmacen(getgxTv_SdtSDTInventarioDevolutivo_Invd_moduloalmacen());
      struct.setInvd_almacencodigo(getgxTv_SdtSDTInventarioDevolutivo_Invd_almacencodigo());
      struct.setInvd_bodegacodigo(getgxTv_SdtSDTInventarioDevolutivo_Invd_bodegacodigo());
      struct.setInvd_serial(getgxTv_SdtSDTInventarioDevolutivo_Invd_serial());
      struct.setInvd_marca(getgxTv_SdtSDTInventarioDevolutivo_Invd_marca());
      struct.setInvd_modelo(getgxTv_SdtSDTInventarioDevolutivo_Invd_modelo());
      struct.setInvd_estado(getgxTv_SdtSDTInventarioDevolutivo_Invd_estado());
      struct.setInvd_vidautil(getgxTv_SdtSDTInventarioDevolutivo_Invd_vidautil());
      struct.setInvd_valoradquisicion(getgxTv_SdtSDTInventarioDevolutivo_Invd_valoradquisicion());
      struct.setInvd_fechaadquisicion(getgxTv_SdtSDTInventarioDevolutivo_Invd_fechaadquisicion());
      struct.setCuen_identificacion(getgxTv_SdtSDTInventarioDevolutivo_Cuen_identificacion());
      struct.setInvd_placapadre(getgxTv_SdtSDTInventarioDevolutivo_Invd_placapadre());
      struct.setInvd_esplacapadre(getgxTv_SdtSDTInventarioDevolutivo_Invd_esplacapadre());
      struct.setInvd_fechaservicio(getgxTv_SdtSDTInventarioDevolutivo_Invd_fechaservicio());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTInventarioDevolutivo_Invd_vidautil ;
   protected long gxTv_SdtSDTInventarioDevolutivo_Invd_regionalid ;
   protected long gxTv_SdtSDTInventarioDevolutivo_Invd_centrocostoid ;
   protected long gxTv_SdtSDTInventarioDevolutivo_Cuen_identificacion ;
   protected java.math.BigDecimal gxTv_SdtSDTInventarioDevolutivo_Invd_valoradquisicion ;
   protected String gxTv_SdtSDTInventarioDevolutivo_Invd_esplacapadre ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTInventarioDevolutivo_Invd_fechaadquisicion ;
   protected java.util.Date gxTv_SdtSDTInventarioDevolutivo_Invd_fechaservicio ;
   protected String gxTv_SdtSDTInventarioDevolutivo_Invd_descripciondevolutivo ;
   protected String gxTv_SdtSDTInventarioDevolutivo_Invd_numeroplaca ;
   protected String gxTv_SdtSDTInventarioDevolutivo_Invd_moduloalmacen ;
   protected String gxTv_SdtSDTInventarioDevolutivo_Invd_almacencodigo ;
   protected String gxTv_SdtSDTInventarioDevolutivo_Invd_bodegacodigo ;
   protected String gxTv_SdtSDTInventarioDevolutivo_Invd_serial ;
   protected String gxTv_SdtSDTInventarioDevolutivo_Invd_marca ;
   protected String gxTv_SdtSDTInventarioDevolutivo_Invd_modelo ;
   protected String gxTv_SdtSDTInventarioDevolutivo_Invd_estado ;
   protected String gxTv_SdtSDTInventarioDevolutivo_Invd_placapadre ;
}

