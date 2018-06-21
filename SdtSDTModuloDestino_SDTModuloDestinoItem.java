/*
               File: SdtSDTModuloDestino_SDTModuloDestinoItem
        Description: SDTModuloDestino
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:18.85
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

public final  class SdtSDTModuloDestino_SDTModuloDestinoItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTModuloDestino_SDTModuloDestinoItem( )
   {
      this(  new ModelContext(SdtSDTModuloDestino_SDTModuloDestinoItem.class));
   }

   public SdtSDTModuloDestino_SDTModuloDestinoItem( ModelContext context )
   {
      super( context, "SdtSDTModuloDestino_SDTModuloDestinoItem");
   }

   public SdtSDTModuloDestino_SDTModuloDestinoItem( int remoteHandle ,
                                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTModuloDestino_SDTModuloDestinoItem");
   }

   public SdtSDTModuloDestino_SDTModuloDestinoItem( StructSdtSDTModuloDestino_SDTModuloDestinoItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Modulo") )
            {
               gxTv_SdtSDTModuloDestino_SDTModuloDestinoItem_Modulo = oReader.getValue() ;
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
         sName = "SDTModuloDestino.SDTModuloDestinoItem" ;
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
      oWriter.writeElement("Modulo", GXutil.rtrim( gxTv_SdtSDTModuloDestino_SDTModuloDestinoItem_Modulo));
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
      AddObjectProperty("Modulo", gxTv_SdtSDTModuloDestino_SDTModuloDestinoItem_Modulo, false);
   }

   public String getgxTv_SdtSDTModuloDestino_SDTModuloDestinoItem_Modulo( )
   {
      return gxTv_SdtSDTModuloDestino_SDTModuloDestinoItem_Modulo ;
   }

   public void setgxTv_SdtSDTModuloDestino_SDTModuloDestinoItem_Modulo( String value )
   {
      gxTv_SdtSDTModuloDestino_SDTModuloDestinoItem_Modulo = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTModuloDestino_SDTModuloDestinoItem_Modulo = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTModuloDestino_SDTModuloDestinoItem Clone( )
   {
      return (com.orions2.SdtSDTModuloDestino_SDTModuloDestinoItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTModuloDestino_SDTModuloDestinoItem struct )
   {
      setgxTv_SdtSDTModuloDestino_SDTModuloDestinoItem_Modulo(struct.getModulo());
   }

   public com.orions2.StructSdtSDTModuloDestino_SDTModuloDestinoItem getStruct( )
   {
      com.orions2.StructSdtSDTModuloDestino_SDTModuloDestinoItem struct = new com.orions2.StructSdtSDTModuloDestino_SDTModuloDestinoItem ();
      struct.setModulo(getgxTv_SdtSDTModuloDestino_SDTModuloDestinoItem_Modulo());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtSDTModuloDestino_SDTModuloDestinoItem_Modulo ;
}

