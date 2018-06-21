/*
               File: SdtSDTPadreseHijos_PlacasItem
        Description: SDTPadreseHijos
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:19.47
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

public final  class SdtSDTPadreseHijos_PlacasItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTPadreseHijos_PlacasItem( )
   {
      this(  new ModelContext(SdtSDTPadreseHijos_PlacasItem.class));
   }

   public SdtSDTPadreseHijos_PlacasItem( ModelContext context )
   {
      super( context, "SdtSDTPadreseHijos_PlacasItem");
   }

   public SdtSDTPadreseHijos_PlacasItem( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTPadreseHijos_PlacasItem");
   }

   public SdtSDTPadreseHijos_PlacasItem( StructSdtSDTPadreseHijos_PlacasItem struct )
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
               gxTv_SdtSDTPadreseHijos_PlacasItem_Tdetplacanumero = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tDetPlacaPadre") )
            {
               gxTv_SdtSDTPadreseHijos_PlacasItem_Tdetplacapadre = oReader.getValue() ;
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
         sName = "SDTPadreseHijos.PlacasItem" ;
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
      oWriter.writeElement("tDetPlacaNumero", GXutil.rtrim( gxTv_SdtSDTPadreseHijos_PlacasItem_Tdetplacanumero));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tDetPlacaPadre", GXutil.rtrim( gxTv_SdtSDTPadreseHijos_PlacasItem_Tdetplacapadre));
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
      AddObjectProperty("tDetPlacaNumero", gxTv_SdtSDTPadreseHijos_PlacasItem_Tdetplacanumero, false);
      AddObjectProperty("tDetPlacaPadre", gxTv_SdtSDTPadreseHijos_PlacasItem_Tdetplacapadre, false);
   }

   public String getgxTv_SdtSDTPadreseHijos_PlacasItem_Tdetplacanumero( )
   {
      return gxTv_SdtSDTPadreseHijos_PlacasItem_Tdetplacanumero ;
   }

   public void setgxTv_SdtSDTPadreseHijos_PlacasItem_Tdetplacanumero( String value )
   {
      gxTv_SdtSDTPadreseHijos_PlacasItem_Tdetplacanumero = value ;
   }

   public String getgxTv_SdtSDTPadreseHijos_PlacasItem_Tdetplacapadre( )
   {
      return gxTv_SdtSDTPadreseHijos_PlacasItem_Tdetplacapadre ;
   }

   public void setgxTv_SdtSDTPadreseHijos_PlacasItem_Tdetplacapadre( String value )
   {
      gxTv_SdtSDTPadreseHijos_PlacasItem_Tdetplacapadre = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTPadreseHijos_PlacasItem_Tdetplacanumero = "" ;
      gxTv_SdtSDTPadreseHijos_PlacasItem_Tdetplacapadre = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTPadreseHijos_PlacasItem Clone( )
   {
      return (com.orions2.SdtSDTPadreseHijos_PlacasItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTPadreseHijos_PlacasItem struct )
   {
      setgxTv_SdtSDTPadreseHijos_PlacasItem_Tdetplacanumero(struct.getTdetplacanumero());
      setgxTv_SdtSDTPadreseHijos_PlacasItem_Tdetplacapadre(struct.getTdetplacapadre());
   }

   public com.orions2.StructSdtSDTPadreseHijos_PlacasItem getStruct( )
   {
      com.orions2.StructSdtSDTPadreseHijos_PlacasItem struct = new com.orions2.StructSdtSDTPadreseHijos_PlacasItem ();
      struct.setTdetplacanumero(getgxTv_SdtSDTPadreseHijos_PlacasItem_Tdetplacanumero());
      struct.setTdetplacapadre(getgxTv_SdtSDTPadreseHijos_PlacasItem_Tdetplacapadre());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtSDTPadreseHijos_PlacasItem_Tdetplacanumero ;
   protected String gxTv_SdtSDTPadreseHijos_PlacasItem_Tdetplacapadre ;
}

