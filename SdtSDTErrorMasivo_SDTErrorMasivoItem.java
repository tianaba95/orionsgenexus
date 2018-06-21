/*
               File: SdtSDTErrorMasivo_SDTErrorMasivoItem
        Description: SDTErrorMasivo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:18.23
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

public final  class SdtSDTErrorMasivo_SDTErrorMasivoItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTErrorMasivo_SDTErrorMasivoItem( )
   {
      this(  new ModelContext(SdtSDTErrorMasivo_SDTErrorMasivoItem.class));
   }

   public SdtSDTErrorMasivo_SDTErrorMasivoItem( ModelContext context )
   {
      super( context, "SdtSDTErrorMasivo_SDTErrorMasivoItem");
   }

   public SdtSDTErrorMasivo_SDTErrorMasivoItem( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTErrorMasivo_SDTErrorMasivoItem");
   }

   public SdtSDTErrorMasivo_SDTErrorMasivoItem( StructSdtSDTErrorMasivo_SDTErrorMasivoItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fila") )
            {
               gxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Fila = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Columna") )
            {
               gxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Columna = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Error") )
            {
               gxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Error = oReader.getValue() ;
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
         sName = "SDTErrorMasivo.SDTErrorMasivoItem" ;
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
      oWriter.writeElement("Fila", GXutil.trim( GXutil.str( gxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Fila, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Columna", GXutil.trim( GXutil.str( gxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Columna, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Error", GXutil.rtrim( gxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Error));
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
      AddObjectProperty("Fila", gxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Fila, false);
      AddObjectProperty("Columna", gxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Columna, false);
      AddObjectProperty("Error", gxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Error, false);
   }

   public short getgxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Fila( )
   {
      return gxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Fila ;
   }

   public void setgxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Fila( short value )
   {
      gxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Fila = value ;
   }

   public short getgxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Columna( )
   {
      return gxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Columna ;
   }

   public void setgxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Columna( short value )
   {
      gxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Columna = value ;
   }

   public String getgxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Error( )
   {
      return gxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Error ;
   }

   public void setgxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Error( String value )
   {
      gxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Error = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Error = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTErrorMasivo_SDTErrorMasivoItem Clone( )
   {
      return (com.orions2.SdtSDTErrorMasivo_SDTErrorMasivoItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTErrorMasivo_SDTErrorMasivoItem struct )
   {
      setgxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Fila(struct.getFila());
      setgxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Columna(struct.getColumna());
      setgxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Error(struct.getError());
   }

   public com.orions2.StructSdtSDTErrorMasivo_SDTErrorMasivoItem getStruct( )
   {
      com.orions2.StructSdtSDTErrorMasivo_SDTErrorMasivoItem struct = new com.orions2.StructSdtSDTErrorMasivo_SDTErrorMasivoItem ();
      struct.setFila(getgxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Fila());
      struct.setColumna(getgxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Columna());
      struct.setError(getgxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Error());
      return struct ;
   }

   protected short gxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Fila ;
   protected short gxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Columna ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtSDTErrorMasivo_SDTErrorMasivoItem_Error ;
}

