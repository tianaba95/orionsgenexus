/*
               File: SdtSDTRolUs_SDTRolUsItem
        Description: SDTRolUs
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:19.78
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

public final  class SdtSDTRolUs_SDTRolUsItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTRolUs_SDTRolUsItem( )
   {
      this(  new ModelContext(SdtSDTRolUs_SDTRolUsItem.class));
   }

   public SdtSDTRolUs_SDTRolUsItem( ModelContext context )
   {
      super( context, "SdtSDTRolUs_SDTRolUsItem");
   }

   public SdtSDTRolUs_SDTRolUsItem( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTRolUs_SDTRolUsItem");
   }

   public SdtSDTRolUs_SDTRolUsItem( StructSdtSDTRolUs_SDTRolUsItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "rolId") )
            {
               gxTv_SdtSDTRolUs_SDTRolUsItem_Rolid = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "rolDescripcion") )
            {
               gxTv_SdtSDTRolUs_SDTRolUsItem_Roldescripcion = oReader.getValue() ;
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
         sName = "SDTRolUs.SDTRolUsItem" ;
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
      oWriter.writeElement("rolId", GXutil.trim( GXutil.str( gxTv_SdtSDTRolUs_SDTRolUsItem_Rolid, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("rolDescripcion", GXutil.rtrim( gxTv_SdtSDTRolUs_SDTRolUsItem_Roldescripcion));
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
      AddObjectProperty("rolId", gxTv_SdtSDTRolUs_SDTRolUsItem_Rolid, false);
      AddObjectProperty("rolDescripcion", gxTv_SdtSDTRolUs_SDTRolUsItem_Roldescripcion, false);
   }

   public long getgxTv_SdtSDTRolUs_SDTRolUsItem_Rolid( )
   {
      return gxTv_SdtSDTRolUs_SDTRolUsItem_Rolid ;
   }

   public void setgxTv_SdtSDTRolUs_SDTRolUsItem_Rolid( long value )
   {
      gxTv_SdtSDTRolUs_SDTRolUsItem_Rolid = value ;
   }

   public String getgxTv_SdtSDTRolUs_SDTRolUsItem_Roldescripcion( )
   {
      return gxTv_SdtSDTRolUs_SDTRolUsItem_Roldescripcion ;
   }

   public void setgxTv_SdtSDTRolUs_SDTRolUsItem_Roldescripcion( String value )
   {
      gxTv_SdtSDTRolUs_SDTRolUsItem_Roldescripcion = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTRolUs_SDTRolUsItem_Roldescripcion = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTRolUs_SDTRolUsItem Clone( )
   {
      return (com.orions2.SdtSDTRolUs_SDTRolUsItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTRolUs_SDTRolUsItem struct )
   {
      setgxTv_SdtSDTRolUs_SDTRolUsItem_Rolid(struct.getRolid());
      setgxTv_SdtSDTRolUs_SDTRolUsItem_Roldescripcion(struct.getRoldescripcion());
   }

   public com.orions2.StructSdtSDTRolUs_SDTRolUsItem getStruct( )
   {
      com.orions2.StructSdtSDTRolUs_SDTRolUsItem struct = new com.orions2.StructSdtSDTRolUs_SDTRolUsItem ();
      struct.setRolid(getgxTv_SdtSDTRolUs_SDTRolUsItem_Rolid());
      struct.setRoldescripcion(getgxTv_SdtSDTRolUs_SDTRolUsItem_Roldescripcion());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSDTRolUs_SDTRolUsItem_Rolid ;
   protected String sTagName ;
   protected String gxTv_SdtSDTRolUs_SDTRolUsItem_Roldescripcion ;
}

