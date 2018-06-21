/*
               File: SdtSDTDocumentos_SDTDocumentosItem
        Description: SDTDocumentos
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:17.48
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

public final  class SdtSDTDocumentos_SDTDocumentosItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTDocumentos_SDTDocumentosItem( )
   {
      this(  new ModelContext(SdtSDTDocumentos_SDTDocumentosItem.class));
   }

   public SdtSDTDocumentos_SDTDocumentosItem( ModelContext context )
   {
      super( context, "SdtSDTDocumentos_SDTDocumentosItem");
   }

   public SdtSDTDocumentos_SDTDocumentosItem( int remoteHandle ,
                                              ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTDocumentos_SDTDocumentosItem");
   }

   public SdtSDTDocumentos_SDTDocumentosItem( StructSdtSDTDocumentos_SDTDocumentosItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_Nro_Documento") )
            {
               gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_nro_documento = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_Descrip_Documento") )
            {
               gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_descrip_documento = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_Prefijo_Documento") )
            {
               gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_prefijo_documento = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_Archivo") )
            {
               gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_archivo=GXutil.blobFromBase64( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_Ruta_Archivo") )
            {
               gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_ruta_archivo = oReader.getValue() ;
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
         sName = "SDTDocumentos.SDTDocumentosItem" ;
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
      oWriter.writeElement("Tran_Nro_Documento", GXutil.trim( GXutil.str( gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_nro_documento, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_Descrip_Documento", GXutil.rtrim( gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_descrip_documento));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_Prefijo_Documento", GXutil.rtrim( gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_prefijo_documento));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_Archivo", GXutil.blobToBase64( gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_archivo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_Ruta_Archivo", GXutil.rtrim( gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_ruta_archivo));
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
      AddObjectProperty("Tran_Nro_Documento", gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_nro_documento, false);
      AddObjectProperty("Tran_Descrip_Documento", gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_descrip_documento, false);
      AddObjectProperty("Tran_Prefijo_Documento", gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_prefijo_documento, false);
      AddObjectProperty("Tran_Archivo", gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_archivo, false);
      AddObjectProperty("Tran_Ruta_Archivo", gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_ruta_archivo, false);
   }

   public short getgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_nro_documento( )
   {
      return gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_nro_documento ;
   }

   public void setgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_nro_documento( short value )
   {
      gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_nro_documento = value ;
   }

   public String getgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_descrip_documento( )
   {
      return gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_descrip_documento ;
   }

   public void setgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_descrip_documento( String value )
   {
      gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_descrip_documento = value ;
   }

   public String getgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_prefijo_documento( )
   {
      return gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_prefijo_documento ;
   }

   public void setgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_prefijo_documento( String value )
   {
      gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_prefijo_documento = value ;
   }

   @GxUpload
   public String getgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_archivo( )
   {
      return gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_archivo ;
   }

   public void setgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_archivo( String value )
   {
      gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_archivo = value ;
   }

   public String getgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_ruta_archivo( )
   {
      return gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_ruta_archivo ;
   }

   public void setgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_ruta_archivo( String value )
   {
      gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_ruta_archivo = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_descrip_documento = "" ;
      gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_prefijo_documento = "" ;
      gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_archivo = "" ;
      gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_ruta_archivo = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTDocumentos_SDTDocumentosItem Clone( )
   {
      return (com.orions2.SdtSDTDocumentos_SDTDocumentosItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTDocumentos_SDTDocumentosItem struct )
   {
      setgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_nro_documento(struct.getTran_nro_documento());
      setgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_descrip_documento(struct.getTran_descrip_documento());
      setgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_prefijo_documento(struct.getTran_prefijo_documento());
      setgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_archivo(struct.getTran_archivo());
      setgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_ruta_archivo(struct.getTran_ruta_archivo());
   }

   public com.orions2.StructSdtSDTDocumentos_SDTDocumentosItem getStruct( )
   {
      com.orions2.StructSdtSDTDocumentos_SDTDocumentosItem struct = new com.orions2.StructSdtSDTDocumentos_SDTDocumentosItem ();
      struct.setTran_nro_documento(getgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_nro_documento());
      struct.setTran_descrip_documento(getgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_descrip_documento());
      struct.setTran_prefijo_documento(getgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_prefijo_documento());
      struct.setTran_archivo(getgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_archivo());
      struct.setTran_ruta_archivo(getgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_ruta_archivo());
      return struct ;
   }

   protected short gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_nro_documento ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_archivo ;
   protected String gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_descrip_documento ;
   protected String gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_prefijo_documento ;
   protected String gxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_ruta_archivo ;
}

