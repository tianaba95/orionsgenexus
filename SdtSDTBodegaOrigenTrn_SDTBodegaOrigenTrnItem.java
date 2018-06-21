/*
               File: SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem
        Description: SDTBodegaOrigenTrn
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:16.25
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

public final  class SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem( )
   {
      this(  new ModelContext(SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem.class));
   }

   public SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem( ModelContext context )
   {
      super( context, "SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem");
   }

   public SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem( int remoteHandle ,
                                                        ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem");
   }

   public SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem( StructSdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Bode_Codigo") )
            {
               gxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_codigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Bode_Descripcion") )
            {
               gxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_descripcion = oReader.getValue() ;
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
         sName = "SDTBodegaOrigenTrn.SDTBodegaOrigenTrnItem" ;
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
      oWriter.writeElement("Bode_Codigo", GXutil.rtrim( gxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_codigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Bode_Descripcion", GXutil.rtrim( gxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_descripcion));
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
      AddObjectProperty("Bode_Codigo", gxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_codigo, false);
      AddObjectProperty("Bode_Descripcion", gxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_descripcion, false);
   }

   public String getgxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_codigo( )
   {
      return gxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_codigo ;
   }

   public void setgxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_codigo( String value )
   {
      gxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_codigo = value ;
   }

   public String getgxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_descripcion( )
   {
      return gxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_descripcion ;
   }

   public void setgxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_descripcion( String value )
   {
      gxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_descripcion = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_codigo = "" ;
      gxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_descripcion = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem Clone( )
   {
      return (com.orions2.SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem struct )
   {
      setgxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_codigo(struct.getBode_codigo());
      setgxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_descripcion(struct.getBode_descripcion());
   }

   public com.orions2.StructSdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem getStruct( )
   {
      com.orions2.StructSdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem struct = new com.orions2.StructSdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem ();
      struct.setBode_codigo(getgxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_codigo());
      struct.setBode_descripcion(getgxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_descripcion());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_codigo ;
   protected String gxTv_SdtSDTBodegaOrigenTrn_SDTBodegaOrigenTrnItem_Bode_descripcion ;
}

