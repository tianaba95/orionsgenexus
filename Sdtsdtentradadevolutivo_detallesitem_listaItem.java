/*
               File: Sdtsdtentradadevolutivo_detallesitem_listaItem
        Description: sdtentradadevolutivo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:18.20
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

public final  class Sdtsdtentradadevolutivo_detallesitem_listaItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public Sdtsdtentradadevolutivo_detallesitem_listaItem( )
   {
      this(  new ModelContext(Sdtsdtentradadevolutivo_detallesitem_listaItem.class));
   }

   public Sdtsdtentradadevolutivo_detallesitem_listaItem( ModelContext context )
   {
      super( context, "Sdtsdtentradadevolutivo_detallesitem_listaItem");
   }

   public Sdtsdtentradadevolutivo_detallesitem_listaItem( int remoteHandle ,
                                                          ModelContext context )
   {
      super( remoteHandle, context, "Sdtsdtentradadevolutivo_detallesitem_listaItem");
   }

   public Sdtsdtentradadevolutivo_detallesitem_listaItem( StructSdtsdtentradadevolutivo_detallesitem_listaItem struct )
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
               gxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Codigolista = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "nombreLista") )
            {
               gxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Nombrelista = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "valorLista") )
            {
               gxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Valorlista = oReader.getValue() ;
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
         sName = "sdtentradadevolutivo.detallesitem.listaItem" ;
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
      oWriter.writeElement("codigoLista", GXutil.trim( GXutil.str( gxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Codigolista, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("nombreLista", GXutil.rtrim( gxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Nombrelista));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("valorLista", GXutil.rtrim( gxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Valorlista));
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
      AddObjectProperty("codigoLista", gxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Codigolista, false);
      AddObjectProperty("nombreLista", gxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Nombrelista, false);
      AddObjectProperty("valorLista", gxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Valorlista, false);
   }

   public long getgxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Codigolista( )
   {
      return gxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Codigolista ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Codigolista( long value )
   {
      gxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Codigolista = value ;
   }

   public String getgxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Nombrelista( )
   {
      return gxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Nombrelista ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Nombrelista( String value )
   {
      gxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Nombrelista = value ;
   }

   public String getgxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Valorlista( )
   {
      return gxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Valorlista ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Valorlista( String value )
   {
      gxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Valorlista = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Nombrelista = "" ;
      gxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Valorlista = "" ;
      sTagName = "" ;
   }

   public com.orions2.Sdtsdtentradadevolutivo_detallesitem_listaItem Clone( )
   {
      return (com.orions2.Sdtsdtentradadevolutivo_detallesitem_listaItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtsdtentradadevolutivo_detallesitem_listaItem struct )
   {
      setgxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Codigolista(struct.getCodigolista());
      setgxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Nombrelista(struct.getNombrelista());
      setgxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Valorlista(struct.getValorlista());
   }

   public com.orions2.StructSdtsdtentradadevolutivo_detallesitem_listaItem getStruct( )
   {
      com.orions2.StructSdtsdtentradadevolutivo_detallesitem_listaItem struct = new com.orions2.StructSdtsdtentradadevolutivo_detallesitem_listaItem ();
      struct.setCodigolista(getgxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Codigolista());
      struct.setNombrelista(getgxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Nombrelista());
      struct.setValorlista(getgxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Valorlista());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Codigolista ;
   protected String sTagName ;
   protected String gxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Nombrelista ;
   protected String gxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Valorlista ;
}

