/*
               File: SdtSDTRegionalTrn_SDTRegionalTrnItem
        Description: SDTRegionalTrn
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:19.70
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

public final  class SdtSDTRegionalTrn_SDTRegionalTrnItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTRegionalTrn_SDTRegionalTrnItem( )
   {
      this(  new ModelContext(SdtSDTRegionalTrn_SDTRegionalTrnItem.class));
   }

   public SdtSDTRegionalTrn_SDTRegionalTrnItem( ModelContext context )
   {
      super( context, "SdtSDTRegionalTrn_SDTRegionalTrnItem");
   }

   public SdtSDTRegionalTrn_SDTRegionalTrnItem( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTRegionalTrn_SDTRegionalTrnItem");
   }

   public SdtSDTRegionalTrn_SDTRegionalTrnItem( StructSdtSDTRegionalTrn_SDTRegionalTrnItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_RegionId") )
            {
               gxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regionid = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_RegionCodigo") )
            {
               gxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regioncodigo = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_RegionDescripcion") )
            {
               gxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regiondescripcion = oReader.getValue() ;
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
         sName = "SDTRegionalTrn.SDTRegionalTrnItem" ;
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
      oWriter.writeElement("Tran_RegionId", GXutil.trim( GXutil.str( gxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regionid, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_RegionCodigo", GXutil.trim( GXutil.str( gxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regioncodigo, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_RegionDescripcion", GXutil.rtrim( gxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regiondescripcion));
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
      AddObjectProperty("Tran_RegionId", gxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regionid, false);
      AddObjectProperty("Tran_RegionCodigo", gxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regioncodigo, false);
      AddObjectProperty("Tran_RegionDescripcion", gxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regiondescripcion, false);
   }

   public long getgxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regionid( )
   {
      return gxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regionid ;
   }

   public void setgxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regionid( long value )
   {
      gxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regionid = value ;
   }

   public short getgxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regioncodigo( )
   {
      return gxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regioncodigo ;
   }

   public void setgxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regioncodigo( short value )
   {
      gxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regioncodigo = value ;
   }

   public String getgxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regiondescripcion( )
   {
      return gxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regiondescripcion ;
   }

   public void setgxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regiondescripcion( String value )
   {
      gxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regiondescripcion = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regiondescripcion = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTRegionalTrn_SDTRegionalTrnItem Clone( )
   {
      return (com.orions2.SdtSDTRegionalTrn_SDTRegionalTrnItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTRegionalTrn_SDTRegionalTrnItem struct )
   {
      setgxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regionid(struct.getTran_regionid());
      setgxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regioncodigo(struct.getTran_regioncodigo());
      setgxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regiondescripcion(struct.getTran_regiondescripcion());
   }

   public com.orions2.StructSdtSDTRegionalTrn_SDTRegionalTrnItem getStruct( )
   {
      com.orions2.StructSdtSDTRegionalTrn_SDTRegionalTrnItem struct = new com.orions2.StructSdtSDTRegionalTrn_SDTRegionalTrnItem ();
      struct.setTran_regionid(getgxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regionid());
      struct.setTran_regioncodigo(getgxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regioncodigo());
      struct.setTran_regiondescripcion(getgxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regiondescripcion());
      return struct ;
   }

   protected short gxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regioncodigo ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regionid ;
   protected String sTagName ;
   protected String gxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regiondescripcion ;
}

