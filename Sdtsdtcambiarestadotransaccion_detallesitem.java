/*
               File: Sdtsdtcambiarestadotransaccion_detallesitem
        Description: sdtcambiarestadotransaccion
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:16.85
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

public final  class Sdtsdtcambiarestadotransaccion_detallesitem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public Sdtsdtcambiarestadotransaccion_detallesitem( )
   {
      this(  new ModelContext(Sdtsdtcambiarestadotransaccion_detallesitem.class));
   }

   public Sdtsdtcambiarestadotransaccion_detallesitem( ModelContext context )
   {
      super( context, "Sdtsdtcambiarestadotransaccion_detallesitem");
   }

   public Sdtsdtcambiarestadotransaccion_detallesitem( int remoteHandle ,
                                                       ModelContext context )
   {
      super( remoteHandle, context, "Sdtsdtcambiarestadotransaccion_detallesitem");
   }

   public Sdtsdtcambiarestadotransaccion_detallesitem( StructSdtsdtcambiarestadotransaccion_detallesitem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "elemConsecutivo") )
            {
               gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Elemconsecutivo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tDetPlacaNumero") )
            {
               gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetplacanumero = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tDetConsecutivo") )
            {
               gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetconsecutivo = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tDetValorTotal") )
            {
               gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetvalortotal = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tdetCantidad") )
            {
               gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetcantidad = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranCentroCostoCodigo") )
            {
               gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Trancentrocostocodigo = oReader.getValue() ;
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
         sName = "sdtcambiarestadotransaccion.detallesitem" ;
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
      oWriter.writeElement("elemConsecutivo", GXutil.rtrim( gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Elemconsecutivo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tDetPlacaNumero", GXutil.rtrim( gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetplacanumero));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tDetConsecutivo", GXutil.trim( GXutil.str( gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetconsecutivo, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tDetValorTotal", GXutil.trim( GXutil.strNoRound( gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetvalortotal, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tdetCantidad", GXutil.trim( GXutil.str( gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetcantidad, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranCentroCostoCodigo", GXutil.rtrim( gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Trancentrocostocodigo));
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
      AddObjectProperty("elemConsecutivo", gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Elemconsecutivo, false);
      AddObjectProperty("tDetPlacaNumero", gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetplacanumero, false);
      AddObjectProperty("tDetConsecutivo", GXutil.ltrim( GXutil.str( gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetconsecutivo, 18, 0)), false);
      AddObjectProperty("tDetValorTotal", GXutil.ltrim( GXutil.strNoRound( gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetvalortotal, 18, 2)), false);
      AddObjectProperty("tdetCantidad", gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetcantidad, false);
      AddObjectProperty("tranCentroCostoCodigo", gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Trancentrocostocodigo, false);
   }

   public String getgxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Elemconsecutivo( )
   {
      return gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Elemconsecutivo ;
   }

   public void setgxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Elemconsecutivo( String value )
   {
      gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Elemconsecutivo = value ;
   }

   public String getgxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetplacanumero( )
   {
      return gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetplacanumero ;
   }

   public void setgxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetplacanumero( String value )
   {
      gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetplacanumero = value ;
   }

   public long getgxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetconsecutivo( )
   {
      return gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetconsecutivo ;
   }

   public void setgxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetconsecutivo( long value )
   {
      gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetconsecutivo = value ;
   }

   public java.math.BigDecimal getgxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetvalortotal( )
   {
      return gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetvalortotal ;
   }

   public void setgxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetvalortotal( java.math.BigDecimal value )
   {
      gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetvalortotal = value ;
   }

   public short getgxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetcantidad( )
   {
      return gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetcantidad ;
   }

   public void setgxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetcantidad( short value )
   {
      gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetcantidad = value ;
   }

   public String getgxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Trancentrocostocodigo( )
   {
      return gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Trancentrocostocodigo ;
   }

   public void setgxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Trancentrocostocodigo( String value )
   {
      gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Trancentrocostocodigo = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Elemconsecutivo = "" ;
      gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetplacanumero = "" ;
      gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetvalortotal = DecimalUtil.ZERO ;
      gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Trancentrocostocodigo = "" ;
      sTagName = "" ;
   }

   public com.orions2.Sdtsdtcambiarestadotransaccion_detallesitem Clone( )
   {
      return (com.orions2.Sdtsdtcambiarestadotransaccion_detallesitem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtsdtcambiarestadotransaccion_detallesitem struct )
   {
      setgxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Elemconsecutivo(struct.getElemconsecutivo());
      setgxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetplacanumero(struct.getTdetplacanumero());
      setgxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetconsecutivo(struct.getTdetconsecutivo());
      setgxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetvalortotal(struct.getTdetvalortotal());
      setgxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetcantidad(struct.getTdetcantidad());
      setgxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Trancentrocostocodigo(struct.getTrancentrocostocodigo());
   }

   public com.orions2.StructSdtsdtcambiarestadotransaccion_detallesitem getStruct( )
   {
      com.orions2.StructSdtsdtcambiarestadotransaccion_detallesitem struct = new com.orions2.StructSdtsdtcambiarestadotransaccion_detallesitem ();
      struct.setElemconsecutivo(getgxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Elemconsecutivo());
      struct.setTdetplacanumero(getgxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetplacanumero());
      struct.setTdetconsecutivo(getgxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetconsecutivo());
      struct.setTdetvalortotal(getgxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetvalortotal());
      struct.setTdetcantidad(getgxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetcantidad());
      struct.setTrancentrocostocodigo(getgxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Trancentrocostocodigo());
      return struct ;
   }

   protected short gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetcantidad ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetconsecutivo ;
   protected java.math.BigDecimal gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetvalortotal ;
   protected String sTagName ;
   protected String gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Elemconsecutivo ;
   protected String gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Tdetplacanumero ;
   protected String gxTv_Sdtsdtcambiarestadotransaccion_detallesitem_Trancentrocostocodigo ;
}

