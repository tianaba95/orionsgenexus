/*
               File: Sdtsdtsalidadevolutivo_detallesitem
        Description: sdtsalidadevolutivo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:20.15
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

public final  class Sdtsdtsalidadevolutivo_detallesitem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public Sdtsdtsalidadevolutivo_detallesitem( )
   {
      this(  new ModelContext(Sdtsdtsalidadevolutivo_detallesitem.class));
   }

   public Sdtsdtsalidadevolutivo_detallesitem( ModelContext context )
   {
      super( context, "Sdtsdtsalidadevolutivo_detallesitem");
   }

   public Sdtsdtsalidadevolutivo_detallesitem( int remoteHandle ,
                                               ModelContext context )
   {
      super( remoteHandle, context, "Sdtsdtsalidadevolutivo_detallesitem");
   }

   public Sdtsdtsalidadevolutivo_detallesitem( StructSdtsdtsalidadevolutivo_detallesitem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "tDetConsecutivo") )
            {
               gxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetconsecutivo = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tdetplacanumero") )
            {
               gxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetplacanumero = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "elemConsecutivo") )
            {
               gxTv_Sdtsdtsalidadevolutivo_detallesitem_Elemconsecutivo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "elemDescripcion") )
            {
               gxTv_Sdtsdtsalidadevolutivo_detallesitem_Elemdescripcion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tdetcantidad") )
            {
               gxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetcantidad = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "lista") )
            {
               if ( gxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista == null )
               {
                  gxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista = new GXBaseCollection<com.orions2.Sdtsdtsalidadevolutivo_detallesitem_listaItem>(com.orions2.Sdtsdtsalidadevolutivo_detallesitem_listaItem.class, "sdtsalidadevolutivo.detallesitem.listaItem", "ACBSENA", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista.readxmlcollection(oReader, "lista", "listaItem") ;
               }
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
         sName = "sdtsalidadevolutivo.detallesitem" ;
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
      oWriter.writeElement("tDetConsecutivo", GXutil.trim( GXutil.str( gxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetconsecutivo, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tdetplacanumero", GXutil.rtrim( gxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetplacanumero));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("elemConsecutivo", GXutil.rtrim( gxTv_Sdtsdtsalidadevolutivo_detallesitem_Elemconsecutivo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("elemDescripcion", GXutil.rtrim( gxTv_Sdtsdtsalidadevolutivo_detallesitem_Elemdescripcion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tdetcantidad", GXutil.trim( GXutil.str( gxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetcantidad, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( gxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista != null )
      {
         String sNameSpace1 ;
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "ACBSENA" ;
         }
         else
         {
            sNameSpace1 = "ACBSENA" ;
         }
         gxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista.writexmlcollection(oWriter, "lista", sNameSpace1, "listaItem", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("tDetConsecutivo", GXutil.ltrim( GXutil.str( gxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetconsecutivo, 18, 0)), false);
      AddObjectProperty("tdetplacanumero", gxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetplacanumero, false);
      AddObjectProperty("elemConsecutivo", gxTv_Sdtsdtsalidadevolutivo_detallesitem_Elemconsecutivo, false);
      AddObjectProperty("elemDescripcion", gxTv_Sdtsdtsalidadevolutivo_detallesitem_Elemdescripcion, false);
      AddObjectProperty("tdetcantidad", gxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetcantidad, false);
      if ( gxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista != null )
      {
         AddObjectProperty("lista", gxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista, false);
      }
   }

   public long getgxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetconsecutivo( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetconsecutivo ;
   }

   public void setgxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetconsecutivo( long value )
   {
      gxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetconsecutivo = value ;
   }

   public String getgxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetplacanumero( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetplacanumero ;
   }

   public void setgxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetplacanumero( String value )
   {
      gxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetplacanumero = value ;
   }

   public String getgxTv_Sdtsdtsalidadevolutivo_detallesitem_Elemconsecutivo( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_detallesitem_Elemconsecutivo ;
   }

   public void setgxTv_Sdtsdtsalidadevolutivo_detallesitem_Elemconsecutivo( String value )
   {
      gxTv_Sdtsdtsalidadevolutivo_detallesitem_Elemconsecutivo = value ;
   }

   public String getgxTv_Sdtsdtsalidadevolutivo_detallesitem_Elemdescripcion( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_detallesitem_Elemdescripcion ;
   }

   public void setgxTv_Sdtsdtsalidadevolutivo_detallesitem_Elemdescripcion( String value )
   {
      gxTv_Sdtsdtsalidadevolutivo_detallesitem_Elemdescripcion = value ;
   }

   public long getgxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetcantidad( )
   {
      return gxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetcantidad ;
   }

   public void setgxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetcantidad( long value )
   {
      gxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetcantidad = value ;
   }

   public GXBaseCollection<com.orions2.Sdtsdtsalidadevolutivo_detallesitem_listaItem> getgxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista( )
   {
      if ( gxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista == null )
      {
         gxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista = new GXBaseCollection<com.orions2.Sdtsdtsalidadevolutivo_detallesitem_listaItem>(com.orions2.Sdtsdtsalidadevolutivo_detallesitem_listaItem.class, "sdtsalidadevolutivo.detallesitem.listaItem", "ACBSENA", remoteHandle);
      }
      return gxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista ;
   }

   public void setgxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista( GXBaseCollection<com.orions2.Sdtsdtsalidadevolutivo_detallesitem_listaItem> value )
   {
      gxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista = value ;
   }

   public void setgxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista_SetNull( )
   {
      gxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista = null ;
   }

   public boolean getgxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista_IsNull( )
   {
      if ( gxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista == null )
      {
         return true ;
      }
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetplacanumero = "" ;
      gxTv_Sdtsdtsalidadevolutivo_detallesitem_Elemconsecutivo = "" ;
      gxTv_Sdtsdtsalidadevolutivo_detallesitem_Elemdescripcion = "" ;
      sTagName = "" ;
   }

   public com.orions2.Sdtsdtsalidadevolutivo_detallesitem Clone( )
   {
      return (com.orions2.Sdtsdtsalidadevolutivo_detallesitem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtsdtsalidadevolutivo_detallesitem struct )
   {
      setgxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetconsecutivo(struct.getTdetconsecutivo());
      setgxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetplacanumero(struct.getTdetplacanumero());
      setgxTv_Sdtsdtsalidadevolutivo_detallesitem_Elemconsecutivo(struct.getElemconsecutivo());
      setgxTv_Sdtsdtsalidadevolutivo_detallesitem_Elemdescripcion(struct.getElemdescripcion());
      setgxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetcantidad(struct.getTdetcantidad());
      GXBaseCollection<com.orions2.Sdtsdtsalidadevolutivo_detallesitem_listaItem> gxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista_aux = new GXBaseCollection<com.orions2.Sdtsdtsalidadevolutivo_detallesitem_listaItem>(com.orions2.Sdtsdtsalidadevolutivo_detallesitem_listaItem.class, "sdtsalidadevolutivo.detallesitem.listaItem", "ACBSENA", remoteHandle) ;
      GXBaseCollection<com.orions2.Sdtsdtsalidadevolutivo_detallesitem_listaItem> gxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista_aux1 = new GXBaseCollection<com.orions2.Sdtsdtsalidadevolutivo_detallesitem_listaItem>(com.orions2.Sdtsdtsalidadevolutivo_detallesitem_listaItem.class, "sdtsalidadevolutivo.detallesitem.listaItem", "ACBSENA", remoteHandle) ;
      gxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista_aux1.setStruct(struct.getLista());
      for (int i = 0; i < gxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista_aux1.size(); i++)
      {
         gxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista_aux.add(new com.orions2.Sdtsdtsalidadevolutivo_detallesitem_listaItem(gxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista_aux1.elementAt(i).getStruct()));
      }
      setgxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista(gxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista_aux);
   }

   public com.orions2.StructSdtsdtsalidadevolutivo_detallesitem getStruct( )
   {
      com.orions2.StructSdtsdtsalidadevolutivo_detallesitem struct = new com.orions2.StructSdtsdtsalidadevolutivo_detallesitem ();
      struct.setTdetconsecutivo(getgxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetconsecutivo());
      struct.setTdetplacanumero(getgxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetplacanumero());
      struct.setElemconsecutivo(getgxTv_Sdtsdtsalidadevolutivo_detallesitem_Elemconsecutivo());
      struct.setElemdescripcion(getgxTv_Sdtsdtsalidadevolutivo_detallesitem_Elemdescripcion());
      struct.setTdetcantidad(getgxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetcantidad());
      Vector aux_vectorgxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista = getgxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista().getStruct();
      Vector aux_vector1gxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista = new Vector();
      for (int i = 0; i < aux_vectorgxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista.size(); i++)
      {
         aux_vector1gxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista.addElement(((com.orions2.Sdtsdtsalidadevolutivo_detallesitem_listaItem)aux_vectorgxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista.elementAt(i)).getStruct());
      }
      struct.setLista(aux_vector1gxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista);
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetconsecutivo ;
   protected long gxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetcantidad ;
   protected String sTagName ;
   protected String gxTv_Sdtsdtsalidadevolutivo_detallesitem_Tdetplacanumero ;
   protected String gxTv_Sdtsdtsalidadevolutivo_detallesitem_Elemconsecutivo ;
   protected String gxTv_Sdtsdtsalidadevolutivo_detallesitem_Elemdescripcion ;
   protected GXBaseCollection<com.orions2.Sdtsdtsalidadevolutivo_detallesitem_listaItem> gxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista_aux ;
   protected GXBaseCollection<com.orions2.Sdtsdtsalidadevolutivo_detallesitem_listaItem> gxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista_aux1 ;
   protected GXBaseCollection<com.orions2.Sdtsdtsalidadevolutivo_detallesitem_listaItem> gxTv_Sdtsdtsalidadevolutivo_detallesitem_Lista=null ;
}

