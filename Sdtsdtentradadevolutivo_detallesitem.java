/*
               File: Sdtsdtentradadevolutivo_detallesitem
        Description: sdtentradadevolutivo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:18.8
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

public final  class Sdtsdtentradadevolutivo_detallesitem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public Sdtsdtentradadevolutivo_detallesitem( )
   {
      this(  new ModelContext(Sdtsdtentradadevolutivo_detallesitem.class));
   }

   public Sdtsdtentradadevolutivo_detallesitem( ModelContext context )
   {
      super( context, "Sdtsdtentradadevolutivo_detallesitem");
   }

   public Sdtsdtentradadevolutivo_detallesitem( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle, context, "Sdtsdtentradadevolutivo_detallesitem");
   }

   public Sdtsdtentradadevolutivo_detallesitem( StructSdtsdtentradadevolutivo_detallesitem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "elemDescripcion") )
            {
               gxTv_Sdtsdtentradadevolutivo_detallesitem_Elemdescripcion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "elemConsecutivo") )
            {
               gxTv_Sdtsdtentradadevolutivo_detallesitem_Elemconsecutivo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tDetPlacaNumero") )
            {
               gxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetplacanumero = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "cataVidaUtil") )
            {
               gxTv_Sdtsdtentradadevolutivo_detallesitem_Catavidautil = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tDetConsecutivo") )
            {
               gxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetconsecutivo = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tDetValorTotal") )
            {
               gxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetvalortotal = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tDetPlacaPadre") )
            {
               gxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetplacapadre = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "marca") )
            {
               gxTv_Sdtsdtentradadevolutivo_detallesitem_Marca = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "serial") )
            {
               gxTv_Sdtsdtentradadevolutivo_detallesitem_Serial = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "modelo") )
            {
               gxTv_Sdtsdtentradadevolutivo_detallesitem_Modelo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "otroscostos") )
            {
               gxTv_Sdtsdtentradadevolutivo_detallesitem_Otroscostos = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "valorpresente") )
            {
               gxTv_Sdtsdtentradadevolutivo_detallesitem_Valorpresente = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "valorfuturo") )
            {
               gxTv_Sdtsdtentradadevolutivo_detallesitem_Valorfuturo = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "interes") )
            {
               gxTv_Sdtsdtentradadevolutivo_detallesitem_Interes = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tiempo") )
            {
               gxTv_Sdtsdtentradadevolutivo_detallesitem_Tiempo = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "lista") )
            {
               if ( gxTv_Sdtsdtentradadevolutivo_detallesitem_Lista == null )
               {
                  gxTv_Sdtsdtentradadevolutivo_detallesitem_Lista = new GXBaseCollection<com.orions2.Sdtsdtentradadevolutivo_detallesitem_listaItem>(com.orions2.Sdtsdtentradadevolutivo_detallesitem_listaItem.class, "sdtentradadevolutivo.detallesitem.listaItem", "ACBSENA", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_Sdtsdtentradadevolutivo_detallesitem_Lista.readxmlcollection(oReader, "lista", "listaItem") ;
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
         sName = "sdtentradadevolutivo.detallesitem" ;
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
      oWriter.writeElement("elemDescripcion", GXutil.rtrim( gxTv_Sdtsdtentradadevolutivo_detallesitem_Elemdescripcion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("elemConsecutivo", GXutil.rtrim( gxTv_Sdtsdtentradadevolutivo_detallesitem_Elemconsecutivo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tDetPlacaNumero", GXutil.rtrim( gxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetplacanumero));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("cataVidaUtil", GXutil.trim( GXutil.str( gxTv_Sdtsdtentradadevolutivo_detallesitem_Catavidautil, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tDetConsecutivo", GXutil.trim( GXutil.str( gxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetconsecutivo, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tDetValorTotal", GXutil.trim( GXutil.strNoRound( gxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetvalortotal, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tDetPlacaPadre", GXutil.rtrim( gxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetplacapadre));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("marca", GXutil.rtrim( gxTv_Sdtsdtentradadevolutivo_detallesitem_Marca));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("serial", GXutil.rtrim( gxTv_Sdtsdtentradadevolutivo_detallesitem_Serial));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("modelo", GXutil.rtrim( gxTv_Sdtsdtentradadevolutivo_detallesitem_Modelo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("otroscostos", GXutil.trim( GXutil.strNoRound( gxTv_Sdtsdtentradadevolutivo_detallesitem_Otroscostos, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("valorpresente", GXutil.trim( GXutil.strNoRound( gxTv_Sdtsdtentradadevolutivo_detallesitem_Valorpresente, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("valorfuturo", GXutil.trim( GXutil.strNoRound( gxTv_Sdtsdtentradadevolutivo_detallesitem_Valorfuturo, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("interes", GXutil.trim( GXutil.strNoRound( gxTv_Sdtsdtentradadevolutivo_detallesitem_Interes, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tiempo", GXutil.trim( GXutil.str( gxTv_Sdtsdtentradadevolutivo_detallesitem_Tiempo, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( gxTv_Sdtsdtentradadevolutivo_detallesitem_Lista != null )
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
         gxTv_Sdtsdtentradadevolutivo_detallesitem_Lista.writexmlcollection(oWriter, "lista", sNameSpace1, "listaItem", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("elemDescripcion", gxTv_Sdtsdtentradadevolutivo_detallesitem_Elemdescripcion, false);
      AddObjectProperty("elemConsecutivo", gxTv_Sdtsdtentradadevolutivo_detallesitem_Elemconsecutivo, false);
      AddObjectProperty("tDetPlacaNumero", gxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetplacanumero, false);
      AddObjectProperty("cataVidaUtil", gxTv_Sdtsdtentradadevolutivo_detallesitem_Catavidautil, false);
      AddObjectProperty("tDetConsecutivo", GXutil.ltrim( GXutil.str( gxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetconsecutivo, 18, 0)), false);
      AddObjectProperty("tDetValorTotal", GXutil.ltrim( GXutil.strNoRound( gxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetvalortotal, 18, 2)), false);
      AddObjectProperty("tDetPlacaPadre", gxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetplacapadre, false);
      AddObjectProperty("marca", gxTv_Sdtsdtentradadevolutivo_detallesitem_Marca, false);
      AddObjectProperty("serial", gxTv_Sdtsdtentradadevolutivo_detallesitem_Serial, false);
      AddObjectProperty("modelo", gxTv_Sdtsdtentradadevolutivo_detallesitem_Modelo, false);
      AddObjectProperty("otroscostos", GXutil.ltrim( GXutil.strNoRound( gxTv_Sdtsdtentradadevolutivo_detallesitem_Otroscostos, 18, 2)), false);
      AddObjectProperty("valorpresente", GXutil.ltrim( GXutil.strNoRound( gxTv_Sdtsdtentradadevolutivo_detallesitem_Valorpresente, 18, 2)), false);
      AddObjectProperty("valorfuturo", GXutil.ltrim( GXutil.strNoRound( gxTv_Sdtsdtentradadevolutivo_detallesitem_Valorfuturo, 18, 2)), false);
      AddObjectProperty("interes", gxTv_Sdtsdtentradadevolutivo_detallesitem_Interes, false);
      AddObjectProperty("tiempo", gxTv_Sdtsdtentradadevolutivo_detallesitem_Tiempo, false);
      if ( gxTv_Sdtsdtentradadevolutivo_detallesitem_Lista != null )
      {
         AddObjectProperty("lista", gxTv_Sdtsdtentradadevolutivo_detallesitem_Lista, false);
      }
   }

   public String getgxTv_Sdtsdtentradadevolutivo_detallesitem_Elemdescripcion( )
   {
      return gxTv_Sdtsdtentradadevolutivo_detallesitem_Elemdescripcion ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_detallesitem_Elemdescripcion( String value )
   {
      gxTv_Sdtsdtentradadevolutivo_detallesitem_Elemdescripcion = value ;
   }

   public String getgxTv_Sdtsdtentradadevolutivo_detallesitem_Elemconsecutivo( )
   {
      return gxTv_Sdtsdtentradadevolutivo_detallesitem_Elemconsecutivo ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_detallesitem_Elemconsecutivo( String value )
   {
      gxTv_Sdtsdtentradadevolutivo_detallesitem_Elemconsecutivo = value ;
   }

   public String getgxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetplacanumero( )
   {
      return gxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetplacanumero ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetplacanumero( String value )
   {
      gxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetplacanumero = value ;
   }

   public short getgxTv_Sdtsdtentradadevolutivo_detallesitem_Catavidautil( )
   {
      return gxTv_Sdtsdtentradadevolutivo_detallesitem_Catavidautil ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_detallesitem_Catavidautil( short value )
   {
      gxTv_Sdtsdtentradadevolutivo_detallesitem_Catavidautil = value ;
   }

   public long getgxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetconsecutivo( )
   {
      return gxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetconsecutivo ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetconsecutivo( long value )
   {
      gxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetconsecutivo = value ;
   }

   public java.math.BigDecimal getgxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetvalortotal( )
   {
      return gxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetvalortotal ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetvalortotal( java.math.BigDecimal value )
   {
      gxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetvalortotal = value ;
   }

   public String getgxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetplacapadre( )
   {
      return gxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetplacapadre ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetplacapadre( String value )
   {
      gxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetplacapadre = value ;
   }

   public String getgxTv_Sdtsdtentradadevolutivo_detallesitem_Marca( )
   {
      return gxTv_Sdtsdtentradadevolutivo_detallesitem_Marca ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_detallesitem_Marca( String value )
   {
      gxTv_Sdtsdtentradadevolutivo_detallesitem_Marca = value ;
   }

   public String getgxTv_Sdtsdtentradadevolutivo_detallesitem_Serial( )
   {
      return gxTv_Sdtsdtentradadevolutivo_detallesitem_Serial ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_detallesitem_Serial( String value )
   {
      gxTv_Sdtsdtentradadevolutivo_detallesitem_Serial = value ;
   }

   public String getgxTv_Sdtsdtentradadevolutivo_detallesitem_Modelo( )
   {
      return gxTv_Sdtsdtentradadevolutivo_detallesitem_Modelo ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_detallesitem_Modelo( String value )
   {
      gxTv_Sdtsdtentradadevolutivo_detallesitem_Modelo = value ;
   }

   public java.math.BigDecimal getgxTv_Sdtsdtentradadevolutivo_detallesitem_Otroscostos( )
   {
      return gxTv_Sdtsdtentradadevolutivo_detallesitem_Otroscostos ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_detallesitem_Otroscostos( java.math.BigDecimal value )
   {
      gxTv_Sdtsdtentradadevolutivo_detallesitem_Otroscostos = value ;
   }

   public java.math.BigDecimal getgxTv_Sdtsdtentradadevolutivo_detallesitem_Valorpresente( )
   {
      return gxTv_Sdtsdtentradadevolutivo_detallesitem_Valorpresente ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_detallesitem_Valorpresente( java.math.BigDecimal value )
   {
      gxTv_Sdtsdtentradadevolutivo_detallesitem_Valorpresente = value ;
   }

   public java.math.BigDecimal getgxTv_Sdtsdtentradadevolutivo_detallesitem_Valorfuturo( )
   {
      return gxTv_Sdtsdtentradadevolutivo_detallesitem_Valorfuturo ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_detallesitem_Valorfuturo( java.math.BigDecimal value )
   {
      gxTv_Sdtsdtentradadevolutivo_detallesitem_Valorfuturo = value ;
   }

   public java.math.BigDecimal getgxTv_Sdtsdtentradadevolutivo_detallesitem_Interes( )
   {
      return gxTv_Sdtsdtentradadevolutivo_detallesitem_Interes ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_detallesitem_Interes( java.math.BigDecimal value )
   {
      gxTv_Sdtsdtentradadevolutivo_detallesitem_Interes = value ;
   }

   public short getgxTv_Sdtsdtentradadevolutivo_detallesitem_Tiempo( )
   {
      return gxTv_Sdtsdtentradadevolutivo_detallesitem_Tiempo ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_detallesitem_Tiempo( short value )
   {
      gxTv_Sdtsdtentradadevolutivo_detallesitem_Tiempo = value ;
   }

   public GXBaseCollection<com.orions2.Sdtsdtentradadevolutivo_detallesitem_listaItem> getgxTv_Sdtsdtentradadevolutivo_detallesitem_Lista( )
   {
      if ( gxTv_Sdtsdtentradadevolutivo_detallesitem_Lista == null )
      {
         gxTv_Sdtsdtentradadevolutivo_detallesitem_Lista = new GXBaseCollection<com.orions2.Sdtsdtentradadevolutivo_detallesitem_listaItem>(com.orions2.Sdtsdtentradadevolutivo_detallesitem_listaItem.class, "sdtentradadevolutivo.detallesitem.listaItem", "ACBSENA", remoteHandle);
      }
      return gxTv_Sdtsdtentradadevolutivo_detallesitem_Lista ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_detallesitem_Lista( GXBaseCollection<com.orions2.Sdtsdtentradadevolutivo_detallesitem_listaItem> value )
   {
      gxTv_Sdtsdtentradadevolutivo_detallesitem_Lista = value ;
   }

   public void setgxTv_Sdtsdtentradadevolutivo_detallesitem_Lista_SetNull( )
   {
      gxTv_Sdtsdtentradadevolutivo_detallesitem_Lista = null ;
   }

   public boolean getgxTv_Sdtsdtentradadevolutivo_detallesitem_Lista_IsNull( )
   {
      if ( gxTv_Sdtsdtentradadevolutivo_detallesitem_Lista == null )
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
      gxTv_Sdtsdtentradadevolutivo_detallesitem_Elemdescripcion = "" ;
      gxTv_Sdtsdtentradadevolutivo_detallesitem_Elemconsecutivo = "" ;
      gxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetplacanumero = "" ;
      gxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetvalortotal = DecimalUtil.ZERO ;
      gxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetplacapadre = "" ;
      gxTv_Sdtsdtentradadevolutivo_detallesitem_Marca = "" ;
      gxTv_Sdtsdtentradadevolutivo_detallesitem_Serial = "" ;
      gxTv_Sdtsdtentradadevolutivo_detallesitem_Modelo = "" ;
      gxTv_Sdtsdtentradadevolutivo_detallesitem_Otroscostos = DecimalUtil.ZERO ;
      gxTv_Sdtsdtentradadevolutivo_detallesitem_Valorpresente = DecimalUtil.ZERO ;
      gxTv_Sdtsdtentradadevolutivo_detallesitem_Valorfuturo = DecimalUtil.ZERO ;
      gxTv_Sdtsdtentradadevolutivo_detallesitem_Interes = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public com.orions2.Sdtsdtentradadevolutivo_detallesitem Clone( )
   {
      return (com.orions2.Sdtsdtentradadevolutivo_detallesitem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtsdtentradadevolutivo_detallesitem struct )
   {
      setgxTv_Sdtsdtentradadevolutivo_detallesitem_Elemdescripcion(struct.getElemdescripcion());
      setgxTv_Sdtsdtentradadevolutivo_detallesitem_Elemconsecutivo(struct.getElemconsecutivo());
      setgxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetplacanumero(struct.getTdetplacanumero());
      setgxTv_Sdtsdtentradadevolutivo_detallesitem_Catavidautil(struct.getCatavidautil());
      setgxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetconsecutivo(struct.getTdetconsecutivo());
      setgxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetvalortotal(struct.getTdetvalortotal());
      setgxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetplacapadre(struct.getTdetplacapadre());
      setgxTv_Sdtsdtentradadevolutivo_detallesitem_Marca(struct.getMarca());
      setgxTv_Sdtsdtentradadevolutivo_detallesitem_Serial(struct.getSerial());
      setgxTv_Sdtsdtentradadevolutivo_detallesitem_Modelo(struct.getModelo());
      setgxTv_Sdtsdtentradadevolutivo_detallesitem_Otroscostos(struct.getOtroscostos());
      setgxTv_Sdtsdtentradadevolutivo_detallesitem_Valorpresente(struct.getValorpresente());
      setgxTv_Sdtsdtentradadevolutivo_detallesitem_Valorfuturo(struct.getValorfuturo());
      setgxTv_Sdtsdtentradadevolutivo_detallesitem_Interes(struct.getInteres());
      setgxTv_Sdtsdtentradadevolutivo_detallesitem_Tiempo(struct.getTiempo());
      GXBaseCollection<com.orions2.Sdtsdtentradadevolutivo_detallesitem_listaItem> gxTv_Sdtsdtentradadevolutivo_detallesitem_Lista_aux = new GXBaseCollection<com.orions2.Sdtsdtentradadevolutivo_detallesitem_listaItem>(com.orions2.Sdtsdtentradadevolutivo_detallesitem_listaItem.class, "sdtentradadevolutivo.detallesitem.listaItem", "ACBSENA", remoteHandle) ;
      GXBaseCollection<com.orions2.Sdtsdtentradadevolutivo_detallesitem_listaItem> gxTv_Sdtsdtentradadevolutivo_detallesitem_Lista_aux1 = new GXBaseCollection<com.orions2.Sdtsdtentradadevolutivo_detallesitem_listaItem>(com.orions2.Sdtsdtentradadevolutivo_detallesitem_listaItem.class, "sdtentradadevolutivo.detallesitem.listaItem", "ACBSENA", remoteHandle) ;
      gxTv_Sdtsdtentradadevolutivo_detallesitem_Lista_aux1.setStruct(struct.getLista());
      for (int i = 0; i < gxTv_Sdtsdtentradadevolutivo_detallesitem_Lista_aux1.size(); i++)
      {
         gxTv_Sdtsdtentradadevolutivo_detallesitem_Lista_aux.add(new com.orions2.Sdtsdtentradadevolutivo_detallesitem_listaItem(gxTv_Sdtsdtentradadevolutivo_detallesitem_Lista_aux1.elementAt(i).getStruct()));
      }
      setgxTv_Sdtsdtentradadevolutivo_detallesitem_Lista(gxTv_Sdtsdtentradadevolutivo_detallesitem_Lista_aux);
   }

   public com.orions2.StructSdtsdtentradadevolutivo_detallesitem getStruct( )
   {
      com.orions2.StructSdtsdtentradadevolutivo_detallesitem struct = new com.orions2.StructSdtsdtentradadevolutivo_detallesitem ();
      struct.setElemdescripcion(getgxTv_Sdtsdtentradadevolutivo_detallesitem_Elemdescripcion());
      struct.setElemconsecutivo(getgxTv_Sdtsdtentradadevolutivo_detallesitem_Elemconsecutivo());
      struct.setTdetplacanumero(getgxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetplacanumero());
      struct.setCatavidautil(getgxTv_Sdtsdtentradadevolutivo_detallesitem_Catavidautil());
      struct.setTdetconsecutivo(getgxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetconsecutivo());
      struct.setTdetvalortotal(getgxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetvalortotal());
      struct.setTdetplacapadre(getgxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetplacapadre());
      struct.setMarca(getgxTv_Sdtsdtentradadevolutivo_detallesitem_Marca());
      struct.setSerial(getgxTv_Sdtsdtentradadevolutivo_detallesitem_Serial());
      struct.setModelo(getgxTv_Sdtsdtentradadevolutivo_detallesitem_Modelo());
      struct.setOtroscostos(getgxTv_Sdtsdtentradadevolutivo_detallesitem_Otroscostos());
      struct.setValorpresente(getgxTv_Sdtsdtentradadevolutivo_detallesitem_Valorpresente());
      struct.setValorfuturo(getgxTv_Sdtsdtentradadevolutivo_detallesitem_Valorfuturo());
      struct.setInteres(getgxTv_Sdtsdtentradadevolutivo_detallesitem_Interes());
      struct.setTiempo(getgxTv_Sdtsdtentradadevolutivo_detallesitem_Tiempo());
      Vector aux_vectorgxTv_Sdtsdtentradadevolutivo_detallesitem_Lista = getgxTv_Sdtsdtentradadevolutivo_detallesitem_Lista().getStruct();
      Vector aux_vector1gxTv_Sdtsdtentradadevolutivo_detallesitem_Lista = new Vector();
      for (int i = 0; i < aux_vectorgxTv_Sdtsdtentradadevolutivo_detallesitem_Lista.size(); i++)
      {
         aux_vector1gxTv_Sdtsdtentradadevolutivo_detallesitem_Lista.addElement(((com.orions2.Sdtsdtentradadevolutivo_detallesitem_listaItem)aux_vectorgxTv_Sdtsdtentradadevolutivo_detallesitem_Lista.elementAt(i)).getStruct());
      }
      struct.setLista(aux_vector1gxTv_Sdtsdtentradadevolutivo_detallesitem_Lista);
      return struct ;
   }

   protected short gxTv_Sdtsdtentradadevolutivo_detallesitem_Catavidautil ;
   protected short gxTv_Sdtsdtentradadevolutivo_detallesitem_Tiempo ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetconsecutivo ;
   protected java.math.BigDecimal gxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetvalortotal ;
   protected java.math.BigDecimal gxTv_Sdtsdtentradadevolutivo_detallesitem_Otroscostos ;
   protected java.math.BigDecimal gxTv_Sdtsdtentradadevolutivo_detallesitem_Valorpresente ;
   protected java.math.BigDecimal gxTv_Sdtsdtentradadevolutivo_detallesitem_Valorfuturo ;
   protected java.math.BigDecimal gxTv_Sdtsdtentradadevolutivo_detallesitem_Interes ;
   protected String sTagName ;
   protected String gxTv_Sdtsdtentradadevolutivo_detallesitem_Elemdescripcion ;
   protected String gxTv_Sdtsdtentradadevolutivo_detallesitem_Elemconsecutivo ;
   protected String gxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetplacanumero ;
   protected String gxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetplacapadre ;
   protected String gxTv_Sdtsdtentradadevolutivo_detallesitem_Marca ;
   protected String gxTv_Sdtsdtentradadevolutivo_detallesitem_Serial ;
   protected String gxTv_Sdtsdtentradadevolutivo_detallesitem_Modelo ;
   protected GXBaseCollection<com.orions2.Sdtsdtentradadevolutivo_detallesitem_listaItem> gxTv_Sdtsdtentradadevolutivo_detallesitem_Lista_aux ;
   protected GXBaseCollection<com.orions2.Sdtsdtentradadevolutivo_detallesitem_listaItem> gxTv_Sdtsdtentradadevolutivo_detallesitem_Lista_aux1 ;
   protected GXBaseCollection<com.orions2.Sdtsdtentradadevolutivo_detallesitem_listaItem> gxTv_Sdtsdtentradadevolutivo_detallesitem_Lista=null ;
}

