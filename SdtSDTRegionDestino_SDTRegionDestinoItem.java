/*
               File: SdtSDTRegionDestino_SDTRegionDestinoItem
        Description: SDTRegionDestino
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:19.73
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

public final  class SdtSDTRegionDestino_SDTRegionDestinoItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTRegionDestino_SDTRegionDestinoItem( )
   {
      this(  new ModelContext(SdtSDTRegionDestino_SDTRegionDestinoItem.class));
   }

   public SdtSDTRegionDestino_SDTRegionDestinoItem( ModelContext context )
   {
      super( context, "SdtSDTRegionDestino_SDTRegionDestinoItem");
   }

   public SdtSDTRegionDestino_SDTRegionDestinoItem( int remoteHandle ,
                                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTRegionDestino_SDTRegionDestinoItem");
   }

   public SdtSDTRegionDestino_SDTRegionDestinoItem( StructSdtSDTRegionDestino_SDTRegionDestinoItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_RegionIdDestino") )
            {
               gxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regioniddestino = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_RegionCodigoDestino") )
            {
               gxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regioncodigodestino = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_RegionDescripcionDestino") )
            {
               gxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regiondescripciondestino = oReader.getValue() ;
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
         sName = "SDTRegionDestino.SDTRegionDestinoItem" ;
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
      oWriter.writeElement("Tran_RegionIdDestino", GXutil.trim( GXutil.str( gxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regioniddestino, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_RegionCodigoDestino", GXutil.trim( GXutil.str( gxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regioncodigodestino, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_RegionDescripcionDestino", GXutil.rtrim( gxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regiondescripciondestino));
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
      AddObjectProperty("Tran_RegionIdDestino", gxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regioniddestino, false);
      AddObjectProperty("Tran_RegionCodigoDestino", gxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regioncodigodestino, false);
      AddObjectProperty("Tran_RegionDescripcionDestino", gxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regiondescripciondestino, false);
   }

   public long getgxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regioniddestino( )
   {
      return gxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regioniddestino ;
   }

   public void setgxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regioniddestino( long value )
   {
      gxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regioniddestino = value ;
   }

   public short getgxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regioncodigodestino( )
   {
      return gxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regioncodigodestino ;
   }

   public void setgxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regioncodigodestino( short value )
   {
      gxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regioncodigodestino = value ;
   }

   public String getgxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regiondescripciondestino( )
   {
      return gxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regiondescripciondestino ;
   }

   public void setgxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regiondescripciondestino( String value )
   {
      gxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regiondescripciondestino = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regiondescripciondestino = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTRegionDestino_SDTRegionDestinoItem Clone( )
   {
      return (com.orions2.SdtSDTRegionDestino_SDTRegionDestinoItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTRegionDestino_SDTRegionDestinoItem struct )
   {
      setgxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regioniddestino(struct.getTran_regioniddestino());
      setgxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regioncodigodestino(struct.getTran_regioncodigodestino());
      setgxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regiondescripciondestino(struct.getTran_regiondescripciondestino());
   }

   public com.orions2.StructSdtSDTRegionDestino_SDTRegionDestinoItem getStruct( )
   {
      com.orions2.StructSdtSDTRegionDestino_SDTRegionDestinoItem struct = new com.orions2.StructSdtSDTRegionDestino_SDTRegionDestinoItem ();
      struct.setTran_regioniddestino(getgxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regioniddestino());
      struct.setTran_regioncodigodestino(getgxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regioncodigodestino());
      struct.setTran_regiondescripciondestino(getgxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regiondescripciondestino());
      return struct ;
   }

   protected short gxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regioncodigodestino ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regioniddestino ;
   protected String sTagName ;
   protected String gxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regiondescripciondestino ;
}

