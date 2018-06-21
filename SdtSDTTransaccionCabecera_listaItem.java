/*
               File: SdtSDTTransaccionCabecera_listaItem
        Description: SDTTransaccionCabecera
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:20.51
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

public final  class SdtSDTTransaccionCabecera_listaItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTTransaccionCabecera_listaItem( )
   {
      this(  new ModelContext(SdtSDTTransaccionCabecera_listaItem.class));
   }

   public SdtSDTTransaccionCabecera_listaItem( ModelContext context )
   {
      super( context, "SdtSDTTransaccionCabecera_listaItem");
   }

   public SdtSDTTransaccionCabecera_listaItem( int remoteHandle ,
                                               ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTTransaccionCabecera_listaItem");
   }

   public SdtSDTTransaccionCabecera_listaItem( StructSdtSDTTransaccionCabecera_listaItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "codigoLista") )
            {
               gxTv_SdtSDTTransaccionCabecera_listaItem_Codigolista = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "nombreLista") )
            {
               gxTv_SdtSDTTransaccionCabecera_listaItem_Nombrelista = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "valorLista") )
            {
               gxTv_SdtSDTTransaccionCabecera_listaItem_Valorlista = oReader.getValue() ;
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
         sName = "SDTTransaccionCabecera.listaItem" ;
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
      oWriter.writeElement("codigoLista", GXutil.trim( GXutil.str( gxTv_SdtSDTTransaccionCabecera_listaItem_Codigolista, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("nombreLista", GXutil.rtrim( gxTv_SdtSDTTransaccionCabecera_listaItem_Nombrelista));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("valorLista", GXutil.rtrim( gxTv_SdtSDTTransaccionCabecera_listaItem_Valorlista));
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
      AddObjectProperty("codigoLista", gxTv_SdtSDTTransaccionCabecera_listaItem_Codigolista, false);
      AddObjectProperty("nombreLista", gxTv_SdtSDTTransaccionCabecera_listaItem_Nombrelista, false);
      AddObjectProperty("valorLista", gxTv_SdtSDTTransaccionCabecera_listaItem_Valorlista, false);
   }

   public long getgxTv_SdtSDTTransaccionCabecera_listaItem_Codigolista( )
   {
      return gxTv_SdtSDTTransaccionCabecera_listaItem_Codigolista ;
   }

   public void setgxTv_SdtSDTTransaccionCabecera_listaItem_Codigolista( long value )
   {
      gxTv_SdtSDTTransaccionCabecera_listaItem_Codigolista = value ;
   }

   public String getgxTv_SdtSDTTransaccionCabecera_listaItem_Nombrelista( )
   {
      return gxTv_SdtSDTTransaccionCabecera_listaItem_Nombrelista ;
   }

   public void setgxTv_SdtSDTTransaccionCabecera_listaItem_Nombrelista( String value )
   {
      gxTv_SdtSDTTransaccionCabecera_listaItem_Nombrelista = value ;
   }

   public String getgxTv_SdtSDTTransaccionCabecera_listaItem_Valorlista( )
   {
      return gxTv_SdtSDTTransaccionCabecera_listaItem_Valorlista ;
   }

   public void setgxTv_SdtSDTTransaccionCabecera_listaItem_Valorlista( String value )
   {
      gxTv_SdtSDTTransaccionCabecera_listaItem_Valorlista = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTTransaccionCabecera_listaItem_Nombrelista = "" ;
      gxTv_SdtSDTTransaccionCabecera_listaItem_Valorlista = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTTransaccionCabecera_listaItem Clone( )
   {
      return (com.orions2.SdtSDTTransaccionCabecera_listaItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTTransaccionCabecera_listaItem struct )
   {
      setgxTv_SdtSDTTransaccionCabecera_listaItem_Codigolista(struct.getCodigolista());
      setgxTv_SdtSDTTransaccionCabecera_listaItem_Nombrelista(struct.getNombrelista());
      setgxTv_SdtSDTTransaccionCabecera_listaItem_Valorlista(struct.getValorlista());
   }

   public com.orions2.StructSdtSDTTransaccionCabecera_listaItem getStruct( )
   {
      com.orions2.StructSdtSDTTransaccionCabecera_listaItem struct = new com.orions2.StructSdtSDTTransaccionCabecera_listaItem ();
      struct.setCodigolista(getgxTv_SdtSDTTransaccionCabecera_listaItem_Codigolista());
      struct.setNombrelista(getgxTv_SdtSDTTransaccionCabecera_listaItem_Nombrelista());
      struct.setValorlista(getgxTv_SdtSDTTransaccionCabecera_listaItem_Valorlista());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSDTTransaccionCabecera_listaItem_Codigolista ;
   protected String sTagName ;
   protected String gxTv_SdtSDTTransaccionCabecera_listaItem_Nombrelista ;
   protected String gxTv_SdtSDTTransaccionCabecera_listaItem_Valorlista ;
}

