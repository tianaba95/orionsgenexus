/*
               File: SdtSDTUsuarios_segRolCollectionItem
        Description: SDTUsuarios
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 18, 2018 13:32:47.85
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

public final  class SdtSDTUsuarios_segRolCollectionItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTUsuarios_segRolCollectionItem( )
   {
      this(  new ModelContext(SdtSDTUsuarios_segRolCollectionItem.class));
   }

   public SdtSDTUsuarios_segRolCollectionItem( ModelContext context )
   {
      super( context, "SdtSDTUsuarios_segRolCollectionItem");
   }

   public SdtSDTUsuarios_segRolCollectionItem( int remoteHandle ,
                                               ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTUsuarios_segRolCollectionItem");
   }

   public SdtSDTUsuarios_segRolCollectionItem( StructSdtSDTUsuarios_segRolCollectionItem struct )
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
               gxTv_SdtSDTUsuarios_segRolCollectionItem_Rolid = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "rolDescripcion") )
            {
               gxTv_SdtSDTUsuarios_segRolCollectionItem_Roldescripcion = oReader.getValue() ;
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
         sName = "SDTUsuarios.segRolCollectionItem" ;
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
      oWriter.writeElement("rolId", GXutil.trim( GXutil.str( gxTv_SdtSDTUsuarios_segRolCollectionItem_Rolid, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("rolDescripcion", GXutil.rtrim( gxTv_SdtSDTUsuarios_segRolCollectionItem_Roldescripcion));
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
      AddObjectProperty("rolId", gxTv_SdtSDTUsuarios_segRolCollectionItem_Rolid, false);
      AddObjectProperty("rolDescripcion", gxTv_SdtSDTUsuarios_segRolCollectionItem_Roldescripcion, false);
   }

   public long getgxTv_SdtSDTUsuarios_segRolCollectionItem_Rolid( )
   {
      return gxTv_SdtSDTUsuarios_segRolCollectionItem_Rolid ;
   }

   public void setgxTv_SdtSDTUsuarios_segRolCollectionItem_Rolid( long value )
   {
      gxTv_SdtSDTUsuarios_segRolCollectionItem_Rolid = value ;
   }

   public String getgxTv_SdtSDTUsuarios_segRolCollectionItem_Roldescripcion( )
   {
      return gxTv_SdtSDTUsuarios_segRolCollectionItem_Roldescripcion ;
   }

   public void setgxTv_SdtSDTUsuarios_segRolCollectionItem_Roldescripcion( String value )
   {
      gxTv_SdtSDTUsuarios_segRolCollectionItem_Roldescripcion = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTUsuarios_segRolCollectionItem_Roldescripcion = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTUsuarios_segRolCollectionItem Clone( )
   {
      return (com.orions2.SdtSDTUsuarios_segRolCollectionItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTUsuarios_segRolCollectionItem struct )
   {
      setgxTv_SdtSDTUsuarios_segRolCollectionItem_Rolid(struct.getRolid());
      setgxTv_SdtSDTUsuarios_segRolCollectionItem_Roldescripcion(struct.getRoldescripcion());
   }

   public com.orions2.StructSdtSDTUsuarios_segRolCollectionItem getStruct( )
   {
      com.orions2.StructSdtSDTUsuarios_segRolCollectionItem struct = new com.orions2.StructSdtSDTUsuarios_segRolCollectionItem ();
      struct.setRolid(getgxTv_SdtSDTUsuarios_segRolCollectionItem_Rolid());
      struct.setRoldescripcion(getgxTv_SdtSDTUsuarios_segRolCollectionItem_Roldescripcion());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSDTUsuarios_segRolCollectionItem_Rolid ;
   protected String sTagName ;
   protected String gxTv_SdtSDTUsuarios_segRolCollectionItem_Roldescripcion ;
}

