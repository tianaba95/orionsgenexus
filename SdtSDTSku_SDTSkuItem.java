/*
               File: SdtSDTSku_SDTSkuItem
        Description: SDTSku
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:20.25
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

public final  class SdtSDTSku_SDTSkuItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTSku_SDTSkuItem( )
   {
      this(  new ModelContext(SdtSDTSku_SDTSkuItem.class));
   }

   public SdtSDTSku_SDTSkuItem( ModelContext context )
   {
      super( context, "SdtSDTSku_SDTSkuItem");
   }

   public SdtSDTSku_SDTSkuItem( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTSku_SDTSkuItem");
   }

   public SdtSDTSku_SDTSkuItem( StructSdtSDTSku_SDTSkuItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Elem_Consecutivo") )
            {
               gxTv_SdtSDTSku_SDTSkuItem_Elem_consecutivo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cata_Descripcion") )
            {
               gxTv_SdtSDTSku_SDTSkuItem_Cata_descripcion = oReader.getValue() ;
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
         sName = "SDTSku.SDTSkuItem" ;
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
      oWriter.writeElement("Elem_Consecutivo", GXutil.rtrim( gxTv_SdtSDTSku_SDTSkuItem_Elem_consecutivo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Cata_Descripcion", GXutil.rtrim( gxTv_SdtSDTSku_SDTSkuItem_Cata_descripcion));
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
      AddObjectProperty("Elem_Consecutivo", gxTv_SdtSDTSku_SDTSkuItem_Elem_consecutivo, false);
      AddObjectProperty("Cata_Descripcion", gxTv_SdtSDTSku_SDTSkuItem_Cata_descripcion, false);
   }

   public String getgxTv_SdtSDTSku_SDTSkuItem_Elem_consecutivo( )
   {
      return gxTv_SdtSDTSku_SDTSkuItem_Elem_consecutivo ;
   }

   public void setgxTv_SdtSDTSku_SDTSkuItem_Elem_consecutivo( String value )
   {
      gxTv_SdtSDTSku_SDTSkuItem_Elem_consecutivo = value ;
   }

   public String getgxTv_SdtSDTSku_SDTSkuItem_Cata_descripcion( )
   {
      return gxTv_SdtSDTSku_SDTSkuItem_Cata_descripcion ;
   }

   public void setgxTv_SdtSDTSku_SDTSkuItem_Cata_descripcion( String value )
   {
      gxTv_SdtSDTSku_SDTSkuItem_Cata_descripcion = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTSku_SDTSkuItem_Elem_consecutivo = "" ;
      gxTv_SdtSDTSku_SDTSkuItem_Cata_descripcion = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTSku_SDTSkuItem Clone( )
   {
      return (com.orions2.SdtSDTSku_SDTSkuItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTSku_SDTSkuItem struct )
   {
      setgxTv_SdtSDTSku_SDTSkuItem_Elem_consecutivo(struct.getElem_consecutivo());
      setgxTv_SdtSDTSku_SDTSkuItem_Cata_descripcion(struct.getCata_descripcion());
   }

   public com.orions2.StructSdtSDTSku_SDTSkuItem getStruct( )
   {
      com.orions2.StructSdtSDTSku_SDTSkuItem struct = new com.orions2.StructSdtSDTSku_SDTSkuItem ();
      struct.setElem_consecutivo(getgxTv_SdtSDTSku_SDTSkuItem_Elem_consecutivo());
      struct.setCata_descripcion(getgxTv_SdtSDTSku_SDTSkuItem_Cata_descripcion());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtSDTSku_SDTSkuItem_Elem_consecutivo ;
   protected String gxTv_SdtSDTSku_SDTSkuItem_Cata_descripcion ;
}

