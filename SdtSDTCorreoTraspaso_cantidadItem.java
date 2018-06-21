/*
               File: SdtSDTCorreoTraspaso_cantidadItem
        Description: SDTCorreoTraspaso
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:17.17
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

public final  class SdtSDTCorreoTraspaso_cantidadItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTCorreoTraspaso_cantidadItem( )
   {
      this(  new ModelContext(SdtSDTCorreoTraspaso_cantidadItem.class));
   }

   public SdtSDTCorreoTraspaso_cantidadItem( ModelContext context )
   {
      super( context, "SdtSDTCorreoTraspaso_cantidadItem");
   }

   public SdtSDTCorreoTraspaso_cantidadItem( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTCorreoTraspaso_cantidadItem");
   }

   public SdtSDTCorreoTraspaso_cantidadItem( StructSdtSDTCorreoTraspaso_cantidadItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranCantidadElementos") )
            {
               gxTv_SdtSDTCorreoTraspaso_cantidadItem_Trancantidadelementos = (int)(GXutil.lval( oReader.getValue())) ;
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
         sName = "SDTCorreoTraspaso.cantidadItem" ;
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
      oWriter.writeElement("tranCantidadElementos", GXutil.trim( GXutil.str( gxTv_SdtSDTCorreoTraspaso_cantidadItem_Trancantidadelementos, 7, 0)));
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
      AddObjectProperty("tranCantidadElementos", gxTv_SdtSDTCorreoTraspaso_cantidadItem_Trancantidadelementos, false);
   }

   public int getgxTv_SdtSDTCorreoTraspaso_cantidadItem_Trancantidadelementos( )
   {
      return gxTv_SdtSDTCorreoTraspaso_cantidadItem_Trancantidadelementos ;
   }

   public void setgxTv_SdtSDTCorreoTraspaso_cantidadItem_Trancantidadelementos( int value )
   {
      gxTv_SdtSDTCorreoTraspaso_cantidadItem_Trancantidadelementos = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      sTagName = "" ;
   }

   public com.orions2.SdtSDTCorreoTraspaso_cantidadItem Clone( )
   {
      return (com.orions2.SdtSDTCorreoTraspaso_cantidadItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTCorreoTraspaso_cantidadItem struct )
   {
      setgxTv_SdtSDTCorreoTraspaso_cantidadItem_Trancantidadelementos(struct.getTrancantidadelementos());
   }

   public com.orions2.StructSdtSDTCorreoTraspaso_cantidadItem getStruct( )
   {
      com.orions2.StructSdtSDTCorreoTraspaso_cantidadItem struct = new com.orions2.StructSdtSDTCorreoTraspaso_cantidadItem ();
      struct.setTrancantidadelementos(getgxTv_SdtSDTCorreoTraspaso_cantidadItem_Trancantidadelementos());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTCorreoTraspaso_cantidadItem_Trancantidadelementos ;
   protected String sTagName ;
}

