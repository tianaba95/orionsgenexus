/*
               File: SdtSDTRatificar_ATRIBUTOSItem
        Description: SDTRatificar
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:19.65
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

public final  class SdtSDTRatificar_ATRIBUTOSItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTRatificar_ATRIBUTOSItem( )
   {
      this(  new ModelContext(SdtSDTRatificar_ATRIBUTOSItem.class));
   }

   public SdtSDTRatificar_ATRIBUTOSItem( ModelContext context )
   {
      super( context, "SdtSDTRatificar_ATRIBUTOSItem");
   }

   public SdtSDTRatificar_ATRIBUTOSItem( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTRatificar_ATRIBUTOSItem");
   }

   public SdtSDTRatificar_ATRIBUTOSItem( StructSdtSDTRatificar_ATRIBUTOSItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "tDetPlacaNumero") )
            {
               gxTv_SdtSDTRatificar_ATRIBUTOSItem_Tdetplacanumero = oReader.getValue() ;
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
         sName = "SDTRatificar.ATRIBUTOSItem" ;
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
      oWriter.writeElement("tDetPlacaNumero", GXutil.rtrim( gxTv_SdtSDTRatificar_ATRIBUTOSItem_Tdetplacanumero));
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
      AddObjectProperty("tDetPlacaNumero", gxTv_SdtSDTRatificar_ATRIBUTOSItem_Tdetplacanumero, false);
   }

   public String getgxTv_SdtSDTRatificar_ATRIBUTOSItem_Tdetplacanumero( )
   {
      return gxTv_SdtSDTRatificar_ATRIBUTOSItem_Tdetplacanumero ;
   }

   public void setgxTv_SdtSDTRatificar_ATRIBUTOSItem_Tdetplacanumero( String value )
   {
      gxTv_SdtSDTRatificar_ATRIBUTOSItem_Tdetplacanumero = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTRatificar_ATRIBUTOSItem_Tdetplacanumero = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTRatificar_ATRIBUTOSItem Clone( )
   {
      return (com.orions2.SdtSDTRatificar_ATRIBUTOSItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTRatificar_ATRIBUTOSItem struct )
   {
      setgxTv_SdtSDTRatificar_ATRIBUTOSItem_Tdetplacanumero(struct.getTdetplacanumero());
   }

   public com.orions2.StructSdtSDTRatificar_ATRIBUTOSItem getStruct( )
   {
      com.orions2.StructSdtSDTRatificar_ATRIBUTOSItem struct = new com.orions2.StructSdtSDTRatificar_ATRIBUTOSItem ();
      struct.setTdetplacanumero(getgxTv_SdtSDTRatificar_ATRIBUTOSItem_Tdetplacanumero());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtSDTRatificar_ATRIBUTOSItem_Tdetplacanumero ;
}

