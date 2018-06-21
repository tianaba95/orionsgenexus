/*
               File: SdtSDTDetalle_SDTDetalleItem
        Description: SDTDetalle
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:17.25
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

public final  class SdtSDTDetalle_SDTDetalleItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTDetalle_SDTDetalleItem( )
   {
      this(  new ModelContext(SdtSDTDetalle_SDTDetalleItem.class));
   }

   public SdtSDTDetalle_SDTDetalleItem( ModelContext context )
   {
      super( context, "SdtSDTDetalle_SDTDetalleItem");
   }

   public SdtSDTDetalle_SDTDetalleItem( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTDetalle_SDTDetalleItem");
   }

   public SdtSDTDetalle_SDTDetalleItem( StructSdtSDTDetalle_SDTDetalleItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Placa") )
            {
               gxTv_SdtSDTDetalle_SDTDetalleItem_Placa = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Consecutivo") )
            {
               gxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Descripcion") )
            {
               gxTv_SdtSDTDetalle_SDTDetalleItem_Descripcion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PlacaPadreActual") )
            {
               gxTv_SdtSDTDetalle_SDTDetalleItem_Placapadreactual = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PlacaPadreNueva") )
            {
               gxTv_SdtSDTDetalle_SDTDetalleItem_Placapadrenueva = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CantidadActual") )
            {
               gxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadactual = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CantidadNueva") )
            {
               gxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadnueva = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ConsecutivoActual") )
            {
               gxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivoactual = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ConsecutivoNuevo") )
            {
               gxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivonuevo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nro_Linea") )
            {
               gxTv_SdtSDTDetalle_SDTDetalleItem_Nro_linea = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AtributoActual") )
            {
               gxTv_SdtSDTDetalle_SDTDetalleItem_Atributoactual = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AtributoNuevo") )
            {
               gxTv_SdtSDTDetalle_SDTDetalleItem_Atributonuevo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ValorActual") )
            {
               gxTv_SdtSDTDetalle_SDTDetalleItem_Valoractual = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ValorNuevo") )
            {
               gxTv_SdtSDTDetalle_SDTDetalleItem_Valornuevo = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SDTDetalle.SDTDetalleItem" ;
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
      oWriter.writeElement("Placa", GXutil.rtrim( gxTv_SdtSDTDetalle_SDTDetalleItem_Placa));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Consecutivo", GXutil.rtrim( gxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Descripcion", GXutil.rtrim( gxTv_SdtSDTDetalle_SDTDetalleItem_Descripcion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("PlacaPadreActual", GXutil.rtrim( gxTv_SdtSDTDetalle_SDTDetalleItem_Placapadreactual));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("PlacaPadreNueva", GXutil.rtrim( gxTv_SdtSDTDetalle_SDTDetalleItem_Placapadrenueva));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("CantidadActual", GXutil.trim( GXutil.str( gxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadactual, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("CantidadNueva", GXutil.trim( GXutil.str( gxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadnueva, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("ConsecutivoActual", GXutil.rtrim( gxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivoactual));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("ConsecutivoNuevo", GXutil.rtrim( gxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivonuevo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Nro_Linea", GXutil.trim( GXutil.str( gxTv_SdtSDTDetalle_SDTDetalleItem_Nro_linea, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("AtributoActual", GXutil.rtrim( gxTv_SdtSDTDetalle_SDTDetalleItem_Atributoactual));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("AtributoNuevo", GXutil.rtrim( gxTv_SdtSDTDetalle_SDTDetalleItem_Atributonuevo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("ValorActual", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDetalle_SDTDetalleItem_Valoractual, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("ValorNuevo", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDetalle_SDTDetalleItem_Valornuevo, 10, 2)));
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
      AddObjectProperty("Placa", gxTv_SdtSDTDetalle_SDTDetalleItem_Placa, false);
      AddObjectProperty("Consecutivo", gxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivo, false);
      AddObjectProperty("Descripcion", gxTv_SdtSDTDetalle_SDTDetalleItem_Descripcion, false);
      AddObjectProperty("PlacaPadreActual", gxTv_SdtSDTDetalle_SDTDetalleItem_Placapadreactual, false);
      AddObjectProperty("PlacaPadreNueva", gxTv_SdtSDTDetalle_SDTDetalleItem_Placapadrenueva, false);
      AddObjectProperty("CantidadActual", gxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadactual, false);
      AddObjectProperty("CantidadNueva", gxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadnueva, false);
      AddObjectProperty("ConsecutivoActual", gxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivoactual, false);
      AddObjectProperty("ConsecutivoNuevo", gxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivonuevo, false);
      AddObjectProperty("Nro_Linea", gxTv_SdtSDTDetalle_SDTDetalleItem_Nro_linea, false);
      AddObjectProperty("AtributoActual", gxTv_SdtSDTDetalle_SDTDetalleItem_Atributoactual, false);
      AddObjectProperty("AtributoNuevo", gxTv_SdtSDTDetalle_SDTDetalleItem_Atributonuevo, false);
      AddObjectProperty("ValorActual", gxTv_SdtSDTDetalle_SDTDetalleItem_Valoractual, false);
      AddObjectProperty("ValorNuevo", gxTv_SdtSDTDetalle_SDTDetalleItem_Valornuevo, false);
   }

   public String getgxTv_SdtSDTDetalle_SDTDetalleItem_Placa( )
   {
      return gxTv_SdtSDTDetalle_SDTDetalleItem_Placa ;
   }

   public void setgxTv_SdtSDTDetalle_SDTDetalleItem_Placa( String value )
   {
      gxTv_SdtSDTDetalle_SDTDetalleItem_Placa = value ;
   }

   public String getgxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivo( )
   {
      return gxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivo ;
   }

   public void setgxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivo( String value )
   {
      gxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivo = value ;
   }

   public String getgxTv_SdtSDTDetalle_SDTDetalleItem_Descripcion( )
   {
      return gxTv_SdtSDTDetalle_SDTDetalleItem_Descripcion ;
   }

   public void setgxTv_SdtSDTDetalle_SDTDetalleItem_Descripcion( String value )
   {
      gxTv_SdtSDTDetalle_SDTDetalleItem_Descripcion = value ;
   }

   public String getgxTv_SdtSDTDetalle_SDTDetalleItem_Placapadreactual( )
   {
      return gxTv_SdtSDTDetalle_SDTDetalleItem_Placapadreactual ;
   }

   public void setgxTv_SdtSDTDetalle_SDTDetalleItem_Placapadreactual( String value )
   {
      gxTv_SdtSDTDetalle_SDTDetalleItem_Placapadreactual = value ;
   }

   public String getgxTv_SdtSDTDetalle_SDTDetalleItem_Placapadrenueva( )
   {
      return gxTv_SdtSDTDetalle_SDTDetalleItem_Placapadrenueva ;
   }

   public void setgxTv_SdtSDTDetalle_SDTDetalleItem_Placapadrenueva( String value )
   {
      gxTv_SdtSDTDetalle_SDTDetalleItem_Placapadrenueva = value ;
   }

   public long getgxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadactual( )
   {
      return gxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadactual ;
   }

   public void setgxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadactual( long value )
   {
      gxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadactual = value ;
   }

   public long getgxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadnueva( )
   {
      return gxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadnueva ;
   }

   public void setgxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadnueva( long value )
   {
      gxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadnueva = value ;
   }

   public String getgxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivoactual( )
   {
      return gxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivoactual ;
   }

   public void setgxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivoactual( String value )
   {
      gxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivoactual = value ;
   }

   public String getgxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivonuevo( )
   {
      return gxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivonuevo ;
   }

   public void setgxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivonuevo( String value )
   {
      gxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivonuevo = value ;
   }

   public int getgxTv_SdtSDTDetalle_SDTDetalleItem_Nro_linea( )
   {
      return gxTv_SdtSDTDetalle_SDTDetalleItem_Nro_linea ;
   }

   public void setgxTv_SdtSDTDetalle_SDTDetalleItem_Nro_linea( int value )
   {
      gxTv_SdtSDTDetalle_SDTDetalleItem_Nro_linea = value ;
   }

   public String getgxTv_SdtSDTDetalle_SDTDetalleItem_Atributoactual( )
   {
      return gxTv_SdtSDTDetalle_SDTDetalleItem_Atributoactual ;
   }

   public void setgxTv_SdtSDTDetalle_SDTDetalleItem_Atributoactual( String value )
   {
      gxTv_SdtSDTDetalle_SDTDetalleItem_Atributoactual = value ;
   }

   public String getgxTv_SdtSDTDetalle_SDTDetalleItem_Atributonuevo( )
   {
      return gxTv_SdtSDTDetalle_SDTDetalleItem_Atributonuevo ;
   }

   public void setgxTv_SdtSDTDetalle_SDTDetalleItem_Atributonuevo( String value )
   {
      gxTv_SdtSDTDetalle_SDTDetalleItem_Atributonuevo = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDetalle_SDTDetalleItem_Valoractual( )
   {
      return gxTv_SdtSDTDetalle_SDTDetalleItem_Valoractual ;
   }

   public void setgxTv_SdtSDTDetalle_SDTDetalleItem_Valoractual( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDetalle_SDTDetalleItem_Valoractual = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDetalle_SDTDetalleItem_Valornuevo( )
   {
      return gxTv_SdtSDTDetalle_SDTDetalleItem_Valornuevo ;
   }

   public void setgxTv_SdtSDTDetalle_SDTDetalleItem_Valornuevo( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDetalle_SDTDetalleItem_Valornuevo = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTDetalle_SDTDetalleItem_Placa = "" ;
      gxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivo = "" ;
      gxTv_SdtSDTDetalle_SDTDetalleItem_Descripcion = "" ;
      gxTv_SdtSDTDetalle_SDTDetalleItem_Placapadreactual = "" ;
      gxTv_SdtSDTDetalle_SDTDetalleItem_Placapadrenueva = "" ;
      gxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivoactual = "" ;
      gxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivonuevo = "" ;
      gxTv_SdtSDTDetalle_SDTDetalleItem_Atributoactual = "" ;
      gxTv_SdtSDTDetalle_SDTDetalleItem_Atributonuevo = "" ;
      gxTv_SdtSDTDetalle_SDTDetalleItem_Valoractual = DecimalUtil.ZERO ;
      gxTv_SdtSDTDetalle_SDTDetalleItem_Valornuevo = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTDetalle_SDTDetalleItem Clone( )
   {
      return (com.orions2.SdtSDTDetalle_SDTDetalleItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTDetalle_SDTDetalleItem struct )
   {
      setgxTv_SdtSDTDetalle_SDTDetalleItem_Placa(struct.getPlaca());
      setgxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivo(struct.getConsecutivo());
      setgxTv_SdtSDTDetalle_SDTDetalleItem_Descripcion(struct.getDescripcion());
      setgxTv_SdtSDTDetalle_SDTDetalleItem_Placapadreactual(struct.getPlacapadreactual());
      setgxTv_SdtSDTDetalle_SDTDetalleItem_Placapadrenueva(struct.getPlacapadrenueva());
      setgxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadactual(struct.getCantidadactual());
      setgxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadnueva(struct.getCantidadnueva());
      setgxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivoactual(struct.getConsecutivoactual());
      setgxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivonuevo(struct.getConsecutivonuevo());
      setgxTv_SdtSDTDetalle_SDTDetalleItem_Nro_linea(struct.getNro_linea());
      setgxTv_SdtSDTDetalle_SDTDetalleItem_Atributoactual(struct.getAtributoactual());
      setgxTv_SdtSDTDetalle_SDTDetalleItem_Atributonuevo(struct.getAtributonuevo());
      setgxTv_SdtSDTDetalle_SDTDetalleItem_Valoractual(struct.getValoractual());
      setgxTv_SdtSDTDetalle_SDTDetalleItem_Valornuevo(struct.getValornuevo());
   }

   public com.orions2.StructSdtSDTDetalle_SDTDetalleItem getStruct( )
   {
      com.orions2.StructSdtSDTDetalle_SDTDetalleItem struct = new com.orions2.StructSdtSDTDetalle_SDTDetalleItem ();
      struct.setPlaca(getgxTv_SdtSDTDetalle_SDTDetalleItem_Placa());
      struct.setConsecutivo(getgxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivo());
      struct.setDescripcion(getgxTv_SdtSDTDetalle_SDTDetalleItem_Descripcion());
      struct.setPlacapadreactual(getgxTv_SdtSDTDetalle_SDTDetalleItem_Placapadreactual());
      struct.setPlacapadrenueva(getgxTv_SdtSDTDetalle_SDTDetalleItem_Placapadrenueva());
      struct.setCantidadactual(getgxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadactual());
      struct.setCantidadnueva(getgxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadnueva());
      struct.setConsecutivoactual(getgxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivoactual());
      struct.setConsecutivonuevo(getgxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivonuevo());
      struct.setNro_linea(getgxTv_SdtSDTDetalle_SDTDetalleItem_Nro_linea());
      struct.setAtributoactual(getgxTv_SdtSDTDetalle_SDTDetalleItem_Atributoactual());
      struct.setAtributonuevo(getgxTv_SdtSDTDetalle_SDTDetalleItem_Atributonuevo());
      struct.setValoractual(getgxTv_SdtSDTDetalle_SDTDetalleItem_Valoractual());
      struct.setValornuevo(getgxTv_SdtSDTDetalle_SDTDetalleItem_Valornuevo());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTDetalle_SDTDetalleItem_Nro_linea ;
   protected long gxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadactual ;
   protected long gxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadnueva ;
   protected java.math.BigDecimal gxTv_SdtSDTDetalle_SDTDetalleItem_Valoractual ;
   protected java.math.BigDecimal gxTv_SdtSDTDetalle_SDTDetalleItem_Valornuevo ;
   protected String sTagName ;
   protected String gxTv_SdtSDTDetalle_SDTDetalleItem_Placa ;
   protected String gxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivo ;
   protected String gxTv_SdtSDTDetalle_SDTDetalleItem_Descripcion ;
   protected String gxTv_SdtSDTDetalle_SDTDetalleItem_Placapadreactual ;
   protected String gxTv_SdtSDTDetalle_SDTDetalleItem_Placapadrenueva ;
   protected String gxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivoactual ;
   protected String gxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivonuevo ;
   protected String gxTv_SdtSDTDetalle_SDTDetalleItem_Atributoactual ;
   protected String gxTv_SdtSDTDetalle_SDTDetalleItem_Atributonuevo ;
}

