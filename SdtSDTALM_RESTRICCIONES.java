/*
               File: SdtSDTALM_RESTRICCIONES
        Description: SDTALM_RESTRICCIONES
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:16.9
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

public final  class SdtSDTALM_RESTRICCIONES extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTALM_RESTRICCIONES( )
   {
      this(  new ModelContext(SdtSDTALM_RESTRICCIONES.class));
   }

   public SdtSDTALM_RESTRICCIONES( ModelContext context )
   {
      super( context, "SdtSDTALM_RESTRICCIONES");
   }

   public SdtSDTALM_RESTRICCIONES( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTALM_RESTRICCIONES");
   }

   public SdtSDTALM_RESTRICCIONES( StructSdtSDTALM_RESTRICCIONES struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mbod_Id") )
            {
               gxTv_SdtSDTALM_RESTRICCIONES_Mbod_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mbod_TipoMovCodigo") )
            {
               gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovcodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mbod_TipoMovDescrip") )
            {
               gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovdescrip = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mbod_TipoElementoCod") )
            {
               gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipoelementocod = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mbod_TipoElementoDesc") )
            {
               gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipoelementodesc = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mbod_RegionId") )
            {
               gxTv_SdtSDTALM_RESTRICCIONES_Mbod_regionid = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mbod_RegionCodigo") )
            {
               gxTv_SdtSDTALM_RESTRICCIONES_Mbod_regioncodigo = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mbod_RegionDescripcion") )
            {
               gxTv_SdtSDTALM_RESTRICCIONES_Mbod_regiondescripcion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mbod_CentCostoId") )
            {
               gxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostoid = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mbod_CentCostoCodigo") )
            {
               gxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostocodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mbod_CentroCostoDescrip") )
            {
               gxTv_SdtSDTALM_RESTRICCIONES_Mbod_centrocostodescrip = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mbod_AlmModOrigen") )
            {
               gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmodorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mbod_AlmOrigenCodigo") )
            {
               gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigencodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mbod_AlmOrigenDescripcion") )
            {
               gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigendescripcion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mbod_BodOrigenCodigo") )
            {
               gxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigencodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mbod_BodOrigenDescripcion") )
            {
               gxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigendescripcion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mbod_AlmModDestino") )
            {
               gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmoddestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mbod_AlmDestinoCodigo") )
            {
               gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinocodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mbod_AlmDestinoDescripcion") )
            {
               gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinodescripcion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mbod_BodDestinoCodigo") )
            {
               gxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinocodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mbod_BodDestinoDescripcion") )
            {
               gxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinodescripcion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mbod_Estado") )
            {
               gxTv_SdtSDTALM_RESTRICCIONES_Mbod_estado = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mbod_FechaCrea") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechacrea = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechacrea = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mbod_UsuarioCrea") )
            {
               gxTv_SdtSDTALM_RESTRICCIONES_Mbod_usuariocrea = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mbod_FechaModifica") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechamodifica = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechamodifica = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mbod_UsuarioModifica") )
            {
               gxTv_SdtSDTALM_RESTRICCIONES_Mbod_usuariomodifica = oReader.getValue() ;
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
         sName = "SDTALM_RESTRICCIONES" ;
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
      oWriter.writeElement("Mbod_Id", GXutil.trim( GXutil.str( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_id, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Mbod_TipoMovCodigo", GXutil.rtrim( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovcodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Mbod_TipoMovDescrip", GXutil.rtrim( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovdescrip));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Mbod_TipoElementoCod", GXutil.trim( GXutil.str( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipoelementocod, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Mbod_TipoElementoDesc", GXutil.rtrim( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipoelementodesc));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Mbod_RegionId", GXutil.trim( GXutil.str( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_regionid, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Mbod_RegionCodigo", GXutil.trim( GXutil.str( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_regioncodigo, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Mbod_RegionDescripcion", GXutil.rtrim( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_regiondescripcion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Mbod_CentCostoId", GXutil.trim( GXutil.str( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostoid, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Mbod_CentCostoCodigo", GXutil.rtrim( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostocodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Mbod_CentroCostoDescrip", GXutil.rtrim( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_centrocostodescrip));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Mbod_AlmModOrigen", GXutil.rtrim( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmodorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Mbod_AlmOrigenCodigo", GXutil.rtrim( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigencodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Mbod_AlmOrigenDescripcion", GXutil.rtrim( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigendescripcion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Mbod_BodOrigenCodigo", GXutil.rtrim( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigencodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Mbod_BodOrigenDescripcion", GXutil.rtrim( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigendescripcion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Mbod_AlmModDestino", GXutil.rtrim( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmoddestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Mbod_AlmDestinoCodigo", GXutil.rtrim( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinocodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Mbod_AlmDestinoDescripcion", GXutil.rtrim( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinodescripcion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Mbod_BodDestinoCodigo", GXutil.rtrim( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinocodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Mbod_BodDestinoDescripcion", GXutil.rtrim( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinodescripcion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Mbod_Estado", GXutil.rtrim( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_estado));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechacrea) )
      {
         oWriter.writeStartElement("Mbod_FechaCrea");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechacrea), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechacrea), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechacrea), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechacrea), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechacrea), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechacrea), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Mbod_FechaCrea", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
      }
      oWriter.writeElement("Mbod_UsuarioCrea", GXutil.rtrim( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_usuariocrea));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechamodifica) )
      {
         oWriter.writeStartElement("Mbod_FechaModifica");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechamodifica), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechamodifica), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechamodifica), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechamodifica), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechamodifica), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechamodifica), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Mbod_FechaModifica", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
      }
      oWriter.writeElement("Mbod_UsuarioModifica", GXutil.rtrim( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_usuariomodifica));
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
      AddObjectProperty("Mbod_Id", gxTv_SdtSDTALM_RESTRICCIONES_Mbod_id, false);
      AddObjectProperty("Mbod_TipoMovCodigo", gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovcodigo, false);
      AddObjectProperty("Mbod_TipoMovDescrip", gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovdescrip, false);
      AddObjectProperty("Mbod_TipoElementoCod", GXutil.ltrim( GXutil.str( gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipoelementocod, 18, 0)), false);
      AddObjectProperty("Mbod_TipoElementoDesc", gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipoelementodesc, false);
      AddObjectProperty("Mbod_RegionId", gxTv_SdtSDTALM_RESTRICCIONES_Mbod_regionid, false);
      AddObjectProperty("Mbod_RegionCodigo", gxTv_SdtSDTALM_RESTRICCIONES_Mbod_regioncodigo, false);
      AddObjectProperty("Mbod_RegionDescripcion", gxTv_SdtSDTALM_RESTRICCIONES_Mbod_regiondescripcion, false);
      AddObjectProperty("Mbod_CentCostoId", gxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostoid, false);
      AddObjectProperty("Mbod_CentCostoCodigo", gxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostocodigo, false);
      AddObjectProperty("Mbod_CentroCostoDescrip", gxTv_SdtSDTALM_RESTRICCIONES_Mbod_centrocostodescrip, false);
      AddObjectProperty("Mbod_AlmModOrigen", gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmodorigen, false);
      AddObjectProperty("Mbod_AlmOrigenCodigo", gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigencodigo, false);
      AddObjectProperty("Mbod_AlmOrigenDescripcion", gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigendescripcion, false);
      AddObjectProperty("Mbod_BodOrigenCodigo", gxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigencodigo, false);
      AddObjectProperty("Mbod_BodOrigenDescripcion", gxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigendescripcion, false);
      AddObjectProperty("Mbod_AlmModDestino", gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmoddestino, false);
      AddObjectProperty("Mbod_AlmDestinoCodigo", gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinocodigo, false);
      AddObjectProperty("Mbod_AlmDestinoDescripcion", gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinodescripcion, false);
      AddObjectProperty("Mbod_BodDestinoCodigo", gxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinocodigo, false);
      AddObjectProperty("Mbod_BodDestinoDescripcion", gxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinodescripcion, false);
      AddObjectProperty("Mbod_Estado", gxTv_SdtSDTALM_RESTRICCIONES_Mbod_estado, false);
      datetime_STZ = gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechacrea ;
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
      AddObjectProperty("Mbod_FechaCrea", sDateCnv, false);
      AddObjectProperty("Mbod_UsuarioCrea", gxTv_SdtSDTALM_RESTRICCIONES_Mbod_usuariocrea, false);
      datetime_STZ = gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechamodifica ;
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
      AddObjectProperty("Mbod_FechaModifica", sDateCnv, false);
      AddObjectProperty("Mbod_UsuarioModifica", gxTv_SdtSDTALM_RESTRICCIONES_Mbod_usuariomodifica, false);
   }

   public long getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_id( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_id ;
   }

   public void setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_id( long value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_id = value ;
   }

   public String getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovcodigo( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovcodigo ;
   }

   public void setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovcodigo( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovcodigo = value ;
   }

   public String getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovdescrip( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovdescrip ;
   }

   public void setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovdescrip( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovdescrip = value ;
   }

   public long getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipoelementocod( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipoelementocod ;
   }

   public void setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipoelementocod( long value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipoelementocod = value ;
   }

   public String getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipoelementodesc( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipoelementodesc ;
   }

   public void setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipoelementodesc( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipoelementodesc = value ;
   }

   public long getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_regionid( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_regionid ;
   }

   public void setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_regionid( long value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_regionid = value ;
   }

   public short getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_regioncodigo( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_regioncodigo ;
   }

   public void setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_regioncodigo( short value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_regioncodigo = value ;
   }

   public String getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_regiondescripcion( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_regiondescripcion ;
   }

   public void setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_regiondescripcion( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_regiondescripcion = value ;
   }

   public long getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostoid( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostoid ;
   }

   public void setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostoid( long value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostoid = value ;
   }

   public String getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostocodigo( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostocodigo ;
   }

   public void setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostocodigo( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostocodigo = value ;
   }

   public String getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_centrocostodescrip( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_centrocostodescrip ;
   }

   public void setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_centrocostodescrip( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_centrocostodescrip = value ;
   }

   public String getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmodorigen( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmodorigen ;
   }

   public void setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmodorigen( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmodorigen = value ;
   }

   public String getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigencodigo( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigencodigo ;
   }

   public void setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigencodigo( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigencodigo = value ;
   }

   public String getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigendescripcion( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigendescripcion ;
   }

   public void setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigendescripcion( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigendescripcion = value ;
   }

   public String getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigencodigo( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigencodigo ;
   }

   public void setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigencodigo( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigencodigo = value ;
   }

   public String getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigendescripcion( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigendescripcion ;
   }

   public void setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigendescripcion( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigendescripcion = value ;
   }

   public String getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmoddestino( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmoddestino ;
   }

   public void setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmoddestino( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmoddestino = value ;
   }

   public String getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinocodigo( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinocodigo ;
   }

   public void setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinocodigo( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinocodigo = value ;
   }

   public String getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinodescripcion( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinodescripcion ;
   }

   public void setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinodescripcion( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinodescripcion = value ;
   }

   public String getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinocodigo( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinocodigo ;
   }

   public void setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinocodigo( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinocodigo = value ;
   }

   public String getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinodescripcion( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinodescripcion ;
   }

   public void setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinodescripcion( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinodescripcion = value ;
   }

   public String getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_estado( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_estado ;
   }

   public void setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_estado( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_estado = value ;
   }

   public java.util.Date getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechacrea( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechacrea ;
   }

   public void setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechacrea( java.util.Date value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechacrea = value ;
   }

   public String getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_usuariocrea( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_usuariocrea ;
   }

   public void setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_usuariocrea( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_usuariocrea = value ;
   }

   public java.util.Date getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechamodifica( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechamodifica ;
   }

   public void setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechamodifica( java.util.Date value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechamodifica = value ;
   }

   public String getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_usuariomodifica( )
   {
      return gxTv_SdtSDTALM_RESTRICCIONES_Mbod_usuariomodifica ;
   }

   public void setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_usuariomodifica( String value )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_usuariomodifica = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovcodigo = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovdescrip = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipoelementodesc = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_regiondescripcion = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostocodigo = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_centrocostodescrip = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmodorigen = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigencodigo = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigendescripcion = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigencodigo = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigendescripcion = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmoddestino = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinocodigo = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinodescripcion = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinocodigo = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinodescripcion = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_estado = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechacrea = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_usuariocrea = "" ;
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechamodifica = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSDTALM_RESTRICCIONES_Mbod_usuariomodifica = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public com.orions2.SdtSDTALM_RESTRICCIONES Clone( )
   {
      return (com.orions2.SdtSDTALM_RESTRICCIONES)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTALM_RESTRICCIONES struct )
   {
      setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_id(struct.getMbod_id());
      setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovcodigo(struct.getMbod_tipomovcodigo());
      setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovdescrip(struct.getMbod_tipomovdescrip());
      setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipoelementocod(struct.getMbod_tipoelementocod());
      setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipoelementodesc(struct.getMbod_tipoelementodesc());
      setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_regionid(struct.getMbod_regionid());
      setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_regioncodigo(struct.getMbod_regioncodigo());
      setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_regiondescripcion(struct.getMbod_regiondescripcion());
      setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostoid(struct.getMbod_centcostoid());
      setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostocodigo(struct.getMbod_centcostocodigo());
      setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_centrocostodescrip(struct.getMbod_centrocostodescrip());
      setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmodorigen(struct.getMbod_almmodorigen());
      setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigencodigo(struct.getMbod_almorigencodigo());
      setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigendescripcion(struct.getMbod_almorigendescripcion());
      setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigencodigo(struct.getMbod_bodorigencodigo());
      setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigendescripcion(struct.getMbod_bodorigendescripcion());
      setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmoddestino(struct.getMbod_almmoddestino());
      setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinocodigo(struct.getMbod_almdestinocodigo());
      setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinodescripcion(struct.getMbod_almdestinodescripcion());
      setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinocodigo(struct.getMbod_boddestinocodigo());
      setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinodescripcion(struct.getMbod_boddestinodescripcion());
      setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_estado(struct.getMbod_estado());
      setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechacrea(struct.getMbod_fechacrea());
      setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_usuariocrea(struct.getMbod_usuariocrea());
      setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechamodifica(struct.getMbod_fechamodifica());
      setgxTv_SdtSDTALM_RESTRICCIONES_Mbod_usuariomodifica(struct.getMbod_usuariomodifica());
   }

   public com.orions2.StructSdtSDTALM_RESTRICCIONES getStruct( )
   {
      com.orions2.StructSdtSDTALM_RESTRICCIONES struct = new com.orions2.StructSdtSDTALM_RESTRICCIONES ();
      struct.setMbod_id(getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_id());
      struct.setMbod_tipomovcodigo(getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovcodigo());
      struct.setMbod_tipomovdescrip(getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovdescrip());
      struct.setMbod_tipoelementocod(getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipoelementocod());
      struct.setMbod_tipoelementodesc(getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipoelementodesc());
      struct.setMbod_regionid(getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_regionid());
      struct.setMbod_regioncodigo(getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_regioncodigo());
      struct.setMbod_regiondescripcion(getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_regiondescripcion());
      struct.setMbod_centcostoid(getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostoid());
      struct.setMbod_centcostocodigo(getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostocodigo());
      struct.setMbod_centrocostodescrip(getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_centrocostodescrip());
      struct.setMbod_almmodorigen(getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmodorigen());
      struct.setMbod_almorigencodigo(getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigencodigo());
      struct.setMbod_almorigendescripcion(getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigendescripcion());
      struct.setMbod_bodorigencodigo(getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigencodigo());
      struct.setMbod_bodorigendescripcion(getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigendescripcion());
      struct.setMbod_almmoddestino(getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmoddestino());
      struct.setMbod_almdestinocodigo(getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinocodigo());
      struct.setMbod_almdestinodescripcion(getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinodescripcion());
      struct.setMbod_boddestinocodigo(getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinocodigo());
      struct.setMbod_boddestinodescripcion(getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinodescripcion());
      struct.setMbod_estado(getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_estado());
      struct.setMbod_fechacrea(getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechacrea());
      struct.setMbod_usuariocrea(getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_usuariocrea());
      struct.setMbod_fechamodifica(getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechamodifica());
      struct.setMbod_usuariomodifica(getgxTv_SdtSDTALM_RESTRICCIONES_Mbod_usuariomodifica());
      return struct ;
   }

   protected short gxTv_SdtSDTALM_RESTRICCIONES_Mbod_regioncodigo ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSDTALM_RESTRICCIONES_Mbod_id ;
   protected long gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipoelementocod ;
   protected long gxTv_SdtSDTALM_RESTRICCIONES_Mbod_regionid ;
   protected long gxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostoid ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_estado ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechacrea ;
   protected java.util.Date gxTv_SdtSDTALM_RESTRICCIONES_Mbod_fechamodifica ;
   protected java.util.Date datetime_STZ ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovcodigo ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipomovdescrip ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_tipoelementodesc ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_regiondescripcion ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_centcostocodigo ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_centrocostodescrip ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmodorigen ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigencodigo ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almorigendescripcion ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigencodigo ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_bodorigendescripcion ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almmoddestino ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinocodigo ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_almdestinodescripcion ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinocodigo ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_boddestinodescripcion ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_usuariocrea ;
   protected String gxTv_SdtSDTALM_RESTRICCIONES_Mbod_usuariomodifica ;
}

