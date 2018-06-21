/*
               File: Sdtsdtentradaconsumo_detallesitem
        Description: sdtentradaconsumo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:17.83
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

public final  class Sdtsdtentradaconsumo_detallesitem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public Sdtsdtentradaconsumo_detallesitem( )
   {
      this(  new ModelContext(Sdtsdtentradaconsumo_detallesitem.class));
   }

   public Sdtsdtentradaconsumo_detallesitem( ModelContext context )
   {
      super( context, "Sdtsdtentradaconsumo_detallesitem");
   }

   public Sdtsdtentradaconsumo_detallesitem( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle, context, "Sdtsdtentradaconsumo_detallesitem");
   }

   public Sdtsdtentradaconsumo_detallesitem( StructSdtsdtentradaconsumo_detallesitem struct )
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
               gxTv_Sdtsdtentradaconsumo_detallesitem_Tdetconsecutivo = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tdetcantidad") )
            {
               gxTv_Sdtsdtentradaconsumo_detallesitem_Tdetcantidad = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "elemConsecutivo") )
            {
               gxTv_Sdtsdtentradaconsumo_detallesitem_Elemconsecutivo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "elemDescripcion") )
            {
               gxTv_Sdtsdtentradaconsumo_detallesitem_Elemdescripcion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tDetValorTotal") )
            {
               gxTv_Sdtsdtentradaconsumo_detallesitem_Tdetvalortotal = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "marca") )
            {
               gxTv_Sdtsdtentradaconsumo_detallesitem_Marca = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "serial") )
            {
               gxTv_Sdtsdtentradaconsumo_detallesitem_Serial = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "modelo") )
            {
               gxTv_Sdtsdtentradaconsumo_detallesitem_Modelo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "otroscostos") )
            {
               gxTv_Sdtsdtentradaconsumo_detallesitem_Otroscostos = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "lista") )
            {
               if ( gxTv_Sdtsdtentradaconsumo_detallesitem_Lista == null )
               {
                  gxTv_Sdtsdtentradaconsumo_detallesitem_Lista = new GXBaseCollection<com.orions2.Sdtsdtentradaconsumo_detallesitem_listaItem>(com.orions2.Sdtsdtentradaconsumo_detallesitem_listaItem.class, "sdtentradaconsumo.detallesitem.listaItem", "ACBSENA", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_Sdtsdtentradaconsumo_detallesitem_Lista.readxmlcollection(oReader, "lista", "listaItem") ;
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
         sName = "sdtentradaconsumo.detallesitem" ;
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
      oWriter.writeElement("tDetConsecutivo", GXutil.trim( GXutil.str( gxTv_Sdtsdtentradaconsumo_detallesitem_Tdetconsecutivo, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tdetcantidad", GXutil.trim( GXutil.str( gxTv_Sdtsdtentradaconsumo_detallesitem_Tdetcantidad, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("elemConsecutivo", GXutil.rtrim( gxTv_Sdtsdtentradaconsumo_detallesitem_Elemconsecutivo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("elemDescripcion", GXutil.rtrim( gxTv_Sdtsdtentradaconsumo_detallesitem_Elemdescripcion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tDetValorTotal", GXutil.trim( GXutil.strNoRound( gxTv_Sdtsdtentradaconsumo_detallesitem_Tdetvalortotal, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("marca", GXutil.rtrim( gxTv_Sdtsdtentradaconsumo_detallesitem_Marca));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("serial", GXutil.rtrim( gxTv_Sdtsdtentradaconsumo_detallesitem_Serial));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("modelo", GXutil.rtrim( gxTv_Sdtsdtentradaconsumo_detallesitem_Modelo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("otroscostos", GXutil.trim( GXutil.strNoRound( gxTv_Sdtsdtentradaconsumo_detallesitem_Otroscostos, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( gxTv_Sdtsdtentradaconsumo_detallesitem_Lista != null )
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
         gxTv_Sdtsdtentradaconsumo_detallesitem_Lista.writexmlcollection(oWriter, "lista", sNameSpace1, "listaItem", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("tDetConsecutivo", GXutil.ltrim( GXutil.str( gxTv_Sdtsdtentradaconsumo_detallesitem_Tdetconsecutivo, 18, 0)), false);
      AddObjectProperty("tdetcantidad", gxTv_Sdtsdtentradaconsumo_detallesitem_Tdetcantidad, false);
      AddObjectProperty("elemConsecutivo", gxTv_Sdtsdtentradaconsumo_detallesitem_Elemconsecutivo, false);
      AddObjectProperty("elemDescripcion", gxTv_Sdtsdtentradaconsumo_detallesitem_Elemdescripcion, false);
      AddObjectProperty("tDetValorTotal", GXutil.ltrim( GXutil.strNoRound( gxTv_Sdtsdtentradaconsumo_detallesitem_Tdetvalortotal, 18, 2)), false);
      AddObjectProperty("marca", gxTv_Sdtsdtentradaconsumo_detallesitem_Marca, false);
      AddObjectProperty("serial", gxTv_Sdtsdtentradaconsumo_detallesitem_Serial, false);
      AddObjectProperty("modelo", gxTv_Sdtsdtentradaconsumo_detallesitem_Modelo, false);
      AddObjectProperty("otroscostos", GXutil.ltrim( GXutil.strNoRound( gxTv_Sdtsdtentradaconsumo_detallesitem_Otroscostos, 18, 2)), false);
      if ( gxTv_Sdtsdtentradaconsumo_detallesitem_Lista != null )
      {
         AddObjectProperty("lista", gxTv_Sdtsdtentradaconsumo_detallesitem_Lista, false);
      }
   }

   public long getgxTv_Sdtsdtentradaconsumo_detallesitem_Tdetconsecutivo( )
   {
      return gxTv_Sdtsdtentradaconsumo_detallesitem_Tdetconsecutivo ;
   }

   public void setgxTv_Sdtsdtentradaconsumo_detallesitem_Tdetconsecutivo( long value )
   {
      gxTv_Sdtsdtentradaconsumo_detallesitem_Tdetconsecutivo = value ;
   }

   public long getgxTv_Sdtsdtentradaconsumo_detallesitem_Tdetcantidad( )
   {
      return gxTv_Sdtsdtentradaconsumo_detallesitem_Tdetcantidad ;
   }

   public void setgxTv_Sdtsdtentradaconsumo_detallesitem_Tdetcantidad( long value )
   {
      gxTv_Sdtsdtentradaconsumo_detallesitem_Tdetcantidad = value ;
   }

   public String getgxTv_Sdtsdtentradaconsumo_detallesitem_Elemconsecutivo( )
   {
      return gxTv_Sdtsdtentradaconsumo_detallesitem_Elemconsecutivo ;
   }

   public void setgxTv_Sdtsdtentradaconsumo_detallesitem_Elemconsecutivo( String value )
   {
      gxTv_Sdtsdtentradaconsumo_detallesitem_Elemconsecutivo = value ;
   }

   public String getgxTv_Sdtsdtentradaconsumo_detallesitem_Elemdescripcion( )
   {
      return gxTv_Sdtsdtentradaconsumo_detallesitem_Elemdescripcion ;
   }

   public void setgxTv_Sdtsdtentradaconsumo_detallesitem_Elemdescripcion( String value )
   {
      gxTv_Sdtsdtentradaconsumo_detallesitem_Elemdescripcion = value ;
   }

   public java.math.BigDecimal getgxTv_Sdtsdtentradaconsumo_detallesitem_Tdetvalortotal( )
   {
      return gxTv_Sdtsdtentradaconsumo_detallesitem_Tdetvalortotal ;
   }

   public void setgxTv_Sdtsdtentradaconsumo_detallesitem_Tdetvalortotal( java.math.BigDecimal value )
   {
      gxTv_Sdtsdtentradaconsumo_detallesitem_Tdetvalortotal = value ;
   }

   public String getgxTv_Sdtsdtentradaconsumo_detallesitem_Marca( )
   {
      return gxTv_Sdtsdtentradaconsumo_detallesitem_Marca ;
   }

   public void setgxTv_Sdtsdtentradaconsumo_detallesitem_Marca( String value )
   {
      gxTv_Sdtsdtentradaconsumo_detallesitem_Marca = value ;
   }

   public String getgxTv_Sdtsdtentradaconsumo_detallesitem_Serial( )
   {
      return gxTv_Sdtsdtentradaconsumo_detallesitem_Serial ;
   }

   public void setgxTv_Sdtsdtentradaconsumo_detallesitem_Serial( String value )
   {
      gxTv_Sdtsdtentradaconsumo_detallesitem_Serial = value ;
   }

   public String getgxTv_Sdtsdtentradaconsumo_detallesitem_Modelo( )
   {
      return gxTv_Sdtsdtentradaconsumo_detallesitem_Modelo ;
   }

   public void setgxTv_Sdtsdtentradaconsumo_detallesitem_Modelo( String value )
   {
      gxTv_Sdtsdtentradaconsumo_detallesitem_Modelo = value ;
   }

   public java.math.BigDecimal getgxTv_Sdtsdtentradaconsumo_detallesitem_Otroscostos( )
   {
      return gxTv_Sdtsdtentradaconsumo_detallesitem_Otroscostos ;
   }

   public void setgxTv_Sdtsdtentradaconsumo_detallesitem_Otroscostos( java.math.BigDecimal value )
   {
      gxTv_Sdtsdtentradaconsumo_detallesitem_Otroscostos = value ;
   }

   public GXBaseCollection<com.orions2.Sdtsdtentradaconsumo_detallesitem_listaItem> getgxTv_Sdtsdtentradaconsumo_detallesitem_Lista( )
   {
      if ( gxTv_Sdtsdtentradaconsumo_detallesitem_Lista == null )
      {
         gxTv_Sdtsdtentradaconsumo_detallesitem_Lista = new GXBaseCollection<com.orions2.Sdtsdtentradaconsumo_detallesitem_listaItem>(com.orions2.Sdtsdtentradaconsumo_detallesitem_listaItem.class, "sdtentradaconsumo.detallesitem.listaItem", "ACBSENA", remoteHandle);
      }
      return gxTv_Sdtsdtentradaconsumo_detallesitem_Lista ;
   }

   public void setgxTv_Sdtsdtentradaconsumo_detallesitem_Lista( GXBaseCollection<com.orions2.Sdtsdtentradaconsumo_detallesitem_listaItem> value )
   {
      gxTv_Sdtsdtentradaconsumo_detallesitem_Lista = value ;
   }

   public void setgxTv_Sdtsdtentradaconsumo_detallesitem_Lista_SetNull( )
   {
      gxTv_Sdtsdtentradaconsumo_detallesitem_Lista = null ;
   }

   public boolean getgxTv_Sdtsdtentradaconsumo_detallesitem_Lista_IsNull( )
   {
      if ( gxTv_Sdtsdtentradaconsumo_detallesitem_Lista == null )
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
      gxTv_Sdtsdtentradaconsumo_detallesitem_Elemconsecutivo = "" ;
      gxTv_Sdtsdtentradaconsumo_detallesitem_Elemdescripcion = "" ;
      gxTv_Sdtsdtentradaconsumo_detallesitem_Tdetvalortotal = DecimalUtil.ZERO ;
      gxTv_Sdtsdtentradaconsumo_detallesitem_Marca = "" ;
      gxTv_Sdtsdtentradaconsumo_detallesitem_Serial = "" ;
      gxTv_Sdtsdtentradaconsumo_detallesitem_Modelo = "" ;
      gxTv_Sdtsdtentradaconsumo_detallesitem_Otroscostos = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public com.orions2.Sdtsdtentradaconsumo_detallesitem Clone( )
   {
      return (com.orions2.Sdtsdtentradaconsumo_detallesitem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtsdtentradaconsumo_detallesitem struct )
   {
      setgxTv_Sdtsdtentradaconsumo_detallesitem_Tdetconsecutivo(struct.getTdetconsecutivo());
      setgxTv_Sdtsdtentradaconsumo_detallesitem_Tdetcantidad(struct.getTdetcantidad());
      setgxTv_Sdtsdtentradaconsumo_detallesitem_Elemconsecutivo(struct.getElemconsecutivo());
      setgxTv_Sdtsdtentradaconsumo_detallesitem_Elemdescripcion(struct.getElemdescripcion());
      setgxTv_Sdtsdtentradaconsumo_detallesitem_Tdetvalortotal(struct.getTdetvalortotal());
      setgxTv_Sdtsdtentradaconsumo_detallesitem_Marca(struct.getMarca());
      setgxTv_Sdtsdtentradaconsumo_detallesitem_Serial(struct.getSerial());
      setgxTv_Sdtsdtentradaconsumo_detallesitem_Modelo(struct.getModelo());
      setgxTv_Sdtsdtentradaconsumo_detallesitem_Otroscostos(struct.getOtroscostos());
      GXBaseCollection<com.orions2.Sdtsdtentradaconsumo_detallesitem_listaItem> gxTv_Sdtsdtentradaconsumo_detallesitem_Lista_aux = new GXBaseCollection<com.orions2.Sdtsdtentradaconsumo_detallesitem_listaItem>(com.orions2.Sdtsdtentradaconsumo_detallesitem_listaItem.class, "sdtentradaconsumo.detallesitem.listaItem", "ACBSENA", remoteHandle) ;
      GXBaseCollection<com.orions2.Sdtsdtentradaconsumo_detallesitem_listaItem> gxTv_Sdtsdtentradaconsumo_detallesitem_Lista_aux1 = new GXBaseCollection<com.orions2.Sdtsdtentradaconsumo_detallesitem_listaItem>(com.orions2.Sdtsdtentradaconsumo_detallesitem_listaItem.class, "sdtentradaconsumo.detallesitem.listaItem", "ACBSENA", remoteHandle) ;
      gxTv_Sdtsdtentradaconsumo_detallesitem_Lista_aux1.setStruct(struct.getLista());
      for (int i = 0; i < gxTv_Sdtsdtentradaconsumo_detallesitem_Lista_aux1.size(); i++)
      {
         gxTv_Sdtsdtentradaconsumo_detallesitem_Lista_aux.add(new com.orions2.Sdtsdtentradaconsumo_detallesitem_listaItem(gxTv_Sdtsdtentradaconsumo_detallesitem_Lista_aux1.elementAt(i).getStruct()));
      }
      setgxTv_Sdtsdtentradaconsumo_detallesitem_Lista(gxTv_Sdtsdtentradaconsumo_detallesitem_Lista_aux);
   }

   public com.orions2.StructSdtsdtentradaconsumo_detallesitem getStruct( )
   {
      com.orions2.StructSdtsdtentradaconsumo_detallesitem struct = new com.orions2.StructSdtsdtentradaconsumo_detallesitem ();
      struct.setTdetconsecutivo(getgxTv_Sdtsdtentradaconsumo_detallesitem_Tdetconsecutivo());
      struct.setTdetcantidad(getgxTv_Sdtsdtentradaconsumo_detallesitem_Tdetcantidad());
      struct.setElemconsecutivo(getgxTv_Sdtsdtentradaconsumo_detallesitem_Elemconsecutivo());
      struct.setElemdescripcion(getgxTv_Sdtsdtentradaconsumo_detallesitem_Elemdescripcion());
      struct.setTdetvalortotal(getgxTv_Sdtsdtentradaconsumo_detallesitem_Tdetvalortotal());
      struct.setMarca(getgxTv_Sdtsdtentradaconsumo_detallesitem_Marca());
      struct.setSerial(getgxTv_Sdtsdtentradaconsumo_detallesitem_Serial());
      struct.setModelo(getgxTv_Sdtsdtentradaconsumo_detallesitem_Modelo());
      struct.setOtroscostos(getgxTv_Sdtsdtentradaconsumo_detallesitem_Otroscostos());
      Vector aux_vectorgxTv_Sdtsdtentradaconsumo_detallesitem_Lista = getgxTv_Sdtsdtentradaconsumo_detallesitem_Lista().getStruct();
      Vector aux_vector1gxTv_Sdtsdtentradaconsumo_detallesitem_Lista = new Vector();
      for (int i = 0; i < aux_vectorgxTv_Sdtsdtentradaconsumo_detallesitem_Lista.size(); i++)
      {
         aux_vector1gxTv_Sdtsdtentradaconsumo_detallesitem_Lista.addElement(((com.orions2.Sdtsdtentradaconsumo_detallesitem_listaItem)aux_vectorgxTv_Sdtsdtentradaconsumo_detallesitem_Lista.elementAt(i)).getStruct());
      }
      struct.setLista(aux_vector1gxTv_Sdtsdtentradaconsumo_detallesitem_Lista);
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_Sdtsdtentradaconsumo_detallesitem_Tdetconsecutivo ;
   protected long gxTv_Sdtsdtentradaconsumo_detallesitem_Tdetcantidad ;
   protected java.math.BigDecimal gxTv_Sdtsdtentradaconsumo_detallesitem_Tdetvalortotal ;
   protected java.math.BigDecimal gxTv_Sdtsdtentradaconsumo_detallesitem_Otroscostos ;
   protected String sTagName ;
   protected String gxTv_Sdtsdtentradaconsumo_detallesitem_Elemconsecutivo ;
   protected String gxTv_Sdtsdtentradaconsumo_detallesitem_Elemdescripcion ;
   protected String gxTv_Sdtsdtentradaconsumo_detallesitem_Marca ;
   protected String gxTv_Sdtsdtentradaconsumo_detallesitem_Serial ;
   protected String gxTv_Sdtsdtentradaconsumo_detallesitem_Modelo ;
   protected GXBaseCollection<com.orions2.Sdtsdtentradaconsumo_detallesitem_listaItem> gxTv_Sdtsdtentradaconsumo_detallesitem_Lista_aux ;
   protected GXBaseCollection<com.orions2.Sdtsdtentradaconsumo_detallesitem_listaItem> gxTv_Sdtsdtentradaconsumo_detallesitem_Lista_aux1 ;
   protected GXBaseCollection<com.orions2.Sdtsdtentradaconsumo_detallesitem_listaItem> gxTv_Sdtsdtentradaconsumo_detallesitem_Lista=null ;
}

