/*
               File: SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem
        Description: SDT_ALMACEN_REPORTE
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: May 10, 2018 17:5:32.0
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

public final  class SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem( )
   {
      this(  new ModelContext(SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem.class));
   }

   public SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem( ModelContext context )
   {
      super( context, "SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem");
   }

   public SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem( int remoteHandle ,
                                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem");
   }

   public SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem( StructSdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "ALMA_CODIGO") )
            {
               gxTv_SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem_Alma_codigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ALMA_DESCRIPCION") )
            {
               gxTv_SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem_Alma_descripcion = oReader.getValue() ;
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
         sName = "SDT_ALMACEN_REPORTE.SDT_ALMACEN_REPORTEItem" ;
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
      oWriter.writeElement("ALMA_CODIGO", GXutil.rtrim( gxTv_SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem_Alma_codigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("ALMA_DESCRIPCION", GXutil.rtrim( gxTv_SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem_Alma_descripcion));
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
      AddObjectProperty("ALMA_CODIGO", gxTv_SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem_Alma_codigo, false);
      AddObjectProperty("ALMA_DESCRIPCION", gxTv_SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem_Alma_descripcion, false);
   }

   public String getgxTv_SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem_Alma_codigo( )
   {
      return gxTv_SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem_Alma_codigo ;
   }

   public void setgxTv_SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem_Alma_codigo( String value )
   {
      gxTv_SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem_Alma_codigo = value ;
   }

   public String getgxTv_SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem_Alma_descripcion( )
   {
      return gxTv_SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem_Alma_descripcion ;
   }

   public void setgxTv_SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem_Alma_descripcion( String value )
   {
      gxTv_SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem_Alma_descripcion = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem_Alma_codigo = "" ;
      gxTv_SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem_Alma_descripcion = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem Clone( )
   {
      return (com.orions2.SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem struct )
   {
      setgxTv_SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem_Alma_codigo(struct.getAlma_codigo());
      setgxTv_SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem_Alma_descripcion(struct.getAlma_descripcion());
   }

   public com.orions2.StructSdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem getStruct( )
   {
      com.orions2.StructSdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem struct = new com.orions2.StructSdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem ();
      struct.setAlma_codigo(getgxTv_SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem_Alma_codigo());
      struct.setAlma_descripcion(getgxTv_SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem_Alma_descripcion());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem_Alma_codigo ;
   protected String gxTv_SdtSDT_ALMACEN_REPORTE_SDT_ALMACEN_REPORTEItem_Alma_descripcion ;
}

