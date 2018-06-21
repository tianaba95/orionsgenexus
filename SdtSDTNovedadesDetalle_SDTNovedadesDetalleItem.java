/*
               File: SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem
        Description: SDTNovedadesDetalle
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:18.99
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

public final  class SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem( )
   {
      this(  new ModelContext(SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem.class));
   }

   public SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem( ModelContext context )
   {
      super( context, "SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem");
   }

   public SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem( int remoteHandle ,
                                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem");
   }

   public SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem( StructSdtSDTNovedadesDetalle_SDTNovedadesDetalleItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nove_Linea") )
            {
               gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_linea = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nove_LineaTrn") )
            {
               gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_lineatrn = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nove_ValorAntiguo") )
            {
               gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valorantiguo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nove_ValorNuevo") )
            {
               gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valornuevo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nove_Consecutivo") )
            {
               gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_consecutivo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nove_Placa") )
            {
               gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_placa = oReader.getValue() ;
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
         sName = "SDTNovedadesDetalle.SDTNovedadesDetalleItem" ;
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
      oWriter.writeElement("Nove_Linea", GXutil.trim( GXutil.str( gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_linea, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Nove_LineaTrn", GXutil.trim( GXutil.str( gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_lineatrn, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Nove_ValorAntiguo", GXutil.rtrim( gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valorantiguo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Nove_ValorNuevo", GXutil.rtrim( gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valornuevo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Nove_Consecutivo", GXutil.rtrim( gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_consecutivo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Nove_Placa", GXutil.rtrim( gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_placa));
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
      AddObjectProperty("Nove_Linea", gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_linea, false);
      AddObjectProperty("Nove_LineaTrn", GXutil.ltrim( GXutil.str( gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_lineatrn, 18, 0)), false);
      AddObjectProperty("Nove_ValorAntiguo", gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valorantiguo, false);
      AddObjectProperty("Nove_ValorNuevo", gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valornuevo, false);
      AddObjectProperty("Nove_Consecutivo", gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_consecutivo, false);
      AddObjectProperty("Nove_Placa", gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_placa, false);
   }

   public int getgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_linea( )
   {
      return gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_linea ;
   }

   public void setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_linea( int value )
   {
      gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_linea = value ;
   }

   public long getgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_lineatrn( )
   {
      return gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_lineatrn ;
   }

   public void setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_lineatrn( long value )
   {
      gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_lineatrn = value ;
   }

   public String getgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valorantiguo( )
   {
      return gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valorantiguo ;
   }

   public void setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valorantiguo( String value )
   {
      gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valorantiguo = value ;
   }

   public String getgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valornuevo( )
   {
      return gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valornuevo ;
   }

   public void setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valornuevo( String value )
   {
      gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valornuevo = value ;
   }

   public String getgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_consecutivo( )
   {
      return gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_consecutivo ;
   }

   public void setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_consecutivo( String value )
   {
      gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_consecutivo = value ;
   }

   public String getgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_placa( )
   {
      return gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_placa ;
   }

   public void setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_placa( String value )
   {
      gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_placa = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valorantiguo = "" ;
      gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valornuevo = "" ;
      gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_consecutivo = "" ;
      gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_placa = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem Clone( )
   {
      return (com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTNovedadesDetalle_SDTNovedadesDetalleItem struct )
   {
      setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_linea(struct.getNove_linea());
      setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_lineatrn(struct.getNove_lineatrn());
      setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valorantiguo(struct.getNove_valorantiguo());
      setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valornuevo(struct.getNove_valornuevo());
      setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_consecutivo(struct.getNove_consecutivo());
      setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_placa(struct.getNove_placa());
   }

   public com.orions2.StructSdtSDTNovedadesDetalle_SDTNovedadesDetalleItem getStruct( )
   {
      com.orions2.StructSdtSDTNovedadesDetalle_SDTNovedadesDetalleItem struct = new com.orions2.StructSdtSDTNovedadesDetalle_SDTNovedadesDetalleItem ();
      struct.setNove_linea(getgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_linea());
      struct.setNove_lineatrn(getgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_lineatrn());
      struct.setNove_valorantiguo(getgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valorantiguo());
      struct.setNove_valornuevo(getgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valornuevo());
      struct.setNove_consecutivo(getgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_consecutivo());
      struct.setNove_placa(getgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_placa());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_linea ;
   protected long gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_lineatrn ;
   protected String sTagName ;
   protected String gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valorantiguo ;
   protected String gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valornuevo ;
   protected String gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_consecutivo ;
   protected String gxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_placa ;
}

