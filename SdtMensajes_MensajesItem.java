/*
               File: SdtMensajes_MensajesItem
        Description: Mensajes
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:15.84
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

public final  class SdtMensajes_MensajesItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtMensajes_MensajesItem( )
   {
      this(  new ModelContext(SdtMensajes_MensajesItem.class));
   }

   public SdtMensajes_MensajesItem( ModelContext context )
   {
      super( context, "SdtMensajes_MensajesItem");
   }

   public SdtMensajes_MensajesItem( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtMensajes_MensajesItem");
   }

   public SdtMensajes_MensajesItem( StructSdtMensajes_MensajesItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Columna") )
            {
               gxTv_SdtMensajes_MensajesItem_Columna = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Descripcion") )
            {
               gxTv_SdtMensajes_MensajesItem_Descripcion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fila") )
            {
               gxTv_SdtMensajes_MensajesItem_Fila = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Inconsistencia") )
            {
               gxTv_SdtMensajes_MensajesItem_Inconsistencia = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NombreArchivo") )
            {
               gxTv_SdtMensajes_MensajesItem_Nombrearchivo=GXutil.blobFromBase64( oReader.getValue()) ;
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
         sName = "Mensajes.MensajesItem" ;
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
      oWriter.writeElement("Columna", GXutil.trim( GXutil.str( gxTv_SdtMensajes_MensajesItem_Columna, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Descripcion", GXutil.rtrim( gxTv_SdtMensajes_MensajesItem_Descripcion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Fila", GXutil.trim( GXutil.str( gxTv_SdtMensajes_MensajesItem_Fila, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Inconsistencia", GXutil.rtrim( gxTv_SdtMensajes_MensajesItem_Inconsistencia));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("NombreArchivo", GXutil.blobToBase64( gxTv_SdtMensajes_MensajesItem_Nombrearchivo));
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
      AddObjectProperty("Columna", gxTv_SdtMensajes_MensajesItem_Columna, false);
      AddObjectProperty("Descripcion", gxTv_SdtMensajes_MensajesItem_Descripcion, false);
      AddObjectProperty("Fila", gxTv_SdtMensajes_MensajesItem_Fila, false);
      AddObjectProperty("Inconsistencia", gxTv_SdtMensajes_MensajesItem_Inconsistencia, false);
      AddObjectProperty("NombreArchivo", gxTv_SdtMensajes_MensajesItem_Nombrearchivo, false);
   }

   public short getgxTv_SdtMensajes_MensajesItem_Columna( )
   {
      return gxTv_SdtMensajes_MensajesItem_Columna ;
   }

   public void setgxTv_SdtMensajes_MensajesItem_Columna( short value )
   {
      gxTv_SdtMensajes_MensajesItem_Columna = value ;
   }

   public String getgxTv_SdtMensajes_MensajesItem_Descripcion( )
   {
      return gxTv_SdtMensajes_MensajesItem_Descripcion ;
   }

   public void setgxTv_SdtMensajes_MensajesItem_Descripcion( String value )
   {
      gxTv_SdtMensajes_MensajesItem_Descripcion = value ;
   }

   public short getgxTv_SdtMensajes_MensajesItem_Fila( )
   {
      return gxTv_SdtMensajes_MensajesItem_Fila ;
   }

   public void setgxTv_SdtMensajes_MensajesItem_Fila( short value )
   {
      gxTv_SdtMensajes_MensajesItem_Fila = value ;
   }

   public String getgxTv_SdtMensajes_MensajesItem_Inconsistencia( )
   {
      return gxTv_SdtMensajes_MensajesItem_Inconsistencia ;
   }

   public void setgxTv_SdtMensajes_MensajesItem_Inconsistencia( String value )
   {
      gxTv_SdtMensajes_MensajesItem_Inconsistencia = value ;
   }

   @GxUpload
   public String getgxTv_SdtMensajes_MensajesItem_Nombrearchivo( )
   {
      return gxTv_SdtMensajes_MensajesItem_Nombrearchivo ;
   }

   public void setgxTv_SdtMensajes_MensajesItem_Nombrearchivo( String value )
   {
      gxTv_SdtMensajes_MensajesItem_Nombrearchivo = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtMensajes_MensajesItem_Descripcion = "" ;
      gxTv_SdtMensajes_MensajesItem_Inconsistencia = "" ;
      gxTv_SdtMensajes_MensajesItem_Nombrearchivo = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtMensajes_MensajesItem Clone( )
   {
      return (com.orions2.SdtMensajes_MensajesItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtMensajes_MensajesItem struct )
   {
      setgxTv_SdtMensajes_MensajesItem_Columna(struct.getColumna());
      setgxTv_SdtMensajes_MensajesItem_Descripcion(struct.getDescripcion());
      setgxTv_SdtMensajes_MensajesItem_Fila(struct.getFila());
      setgxTv_SdtMensajes_MensajesItem_Inconsistencia(struct.getInconsistencia());
      setgxTv_SdtMensajes_MensajesItem_Nombrearchivo(struct.getNombrearchivo());
   }

   public com.orions2.StructSdtMensajes_MensajesItem getStruct( )
   {
      com.orions2.StructSdtMensajes_MensajesItem struct = new com.orions2.StructSdtMensajes_MensajesItem ();
      struct.setColumna(getgxTv_SdtMensajes_MensajesItem_Columna());
      struct.setDescripcion(getgxTv_SdtMensajes_MensajesItem_Descripcion());
      struct.setFila(getgxTv_SdtMensajes_MensajesItem_Fila());
      struct.setInconsistencia(getgxTv_SdtMensajes_MensajesItem_Inconsistencia());
      struct.setNombrearchivo(getgxTv_SdtMensajes_MensajesItem_Nombrearchivo());
      return struct ;
   }

   protected short gxTv_SdtMensajes_MensajesItem_Columna ;
   protected short gxTv_SdtMensajes_MensajesItem_Fila ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtMensajes_MensajesItem_Nombrearchivo ;
   protected String gxTv_SdtMensajes_MensajesItem_Descripcion ;
   protected String gxTv_SdtMensajes_MensajesItem_Inconsistencia ;
}

