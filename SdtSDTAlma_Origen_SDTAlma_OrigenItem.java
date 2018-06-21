/*
               File: SdtSDTAlma_Origen_SDTAlma_OrigenItem
        Description: SDTAlma_Origen
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:15.97
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

public final  class SdtSDTAlma_Origen_SDTAlma_OrigenItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTAlma_Origen_SDTAlma_OrigenItem( )
   {
      this(  new ModelContext(SdtSDTAlma_Origen_SDTAlma_OrigenItem.class));
   }

   public SdtSDTAlma_Origen_SDTAlma_OrigenItem( ModelContext context )
   {
      super( context, "SdtSDTAlma_Origen_SDTAlma_OrigenItem");
   }

   public SdtSDTAlma_Origen_SDTAlma_OrigenItem( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTAlma_Origen_SDTAlma_OrigenItem");
   }

   public SdtSDTAlma_Origen_SDTAlma_OrigenItem( StructSdtSDTAlma_Origen_SDTAlma_OrigenItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Alma_Codigo") )
            {
               gxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_codigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Alma_Descripcion") )
            {
               gxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_descripcion = oReader.getValue() ;
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
         sName = "SDTAlma_Origen.SDTAlma_OrigenItem" ;
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
      oWriter.writeElement("Alma_Codigo", GXutil.rtrim( gxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_codigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Alma_Descripcion", GXutil.rtrim( gxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_descripcion));
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
      AddObjectProperty("Alma_Codigo", gxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_codigo, false);
      AddObjectProperty("Alma_Descripcion", gxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_descripcion, false);
   }

   public String getgxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_codigo( )
   {
      return gxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_codigo ;
   }

   public void setgxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_codigo( String value )
   {
      gxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_codigo = value ;
   }

   public String getgxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_descripcion( )
   {
      return gxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_descripcion ;
   }

   public void setgxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_descripcion( String value )
   {
      gxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_descripcion = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_codigo = "" ;
      gxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_descripcion = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem Clone( )
   {
      return (com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTAlma_Origen_SDTAlma_OrigenItem struct )
   {
      setgxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_codigo(struct.getAlma_codigo());
      setgxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_descripcion(struct.getAlma_descripcion());
   }

   public com.orions2.StructSdtSDTAlma_Origen_SDTAlma_OrigenItem getStruct( )
   {
      com.orions2.StructSdtSDTAlma_Origen_SDTAlma_OrigenItem struct = new com.orions2.StructSdtSDTAlma_Origen_SDTAlma_OrigenItem ();
      struct.setAlma_codigo(getgxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_codigo());
      struct.setAlma_descripcion(getgxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_descripcion());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_codigo ;
   protected String gxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_descripcion ;
}

