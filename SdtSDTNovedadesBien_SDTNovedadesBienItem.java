/*
               File: SdtSDTNovedadesBien_SDTNovedadesBienItem
        Description: SDTNovedadesBien
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:18.93
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

public final  class SdtSDTNovedadesBien_SDTNovedadesBienItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTNovedadesBien_SDTNovedadesBienItem( )
   {
      this(  new ModelContext(SdtSDTNovedadesBien_SDTNovedadesBienItem.class));
   }

   public SdtSDTNovedadesBien_SDTNovedadesBienItem( ModelContext context )
   {
      super( context, "SdtSDTNovedadesBien_SDTNovedadesBienItem");
   }

   public SdtSDTNovedadesBien_SDTNovedadesBienItem( int remoteHandle ,
                                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTNovedadesBien_SDTNovedadesBienItem");
   }

   public SdtSDTNovedadesBien_SDTNovedadesBienItem( StructSdtSDTNovedadesBien_SDTNovedadesBienItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nove_Identificador") )
            {
               gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_identificador = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nove_FechaRegistro") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_fecharegistro = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_fecharegistro = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nove_Placa") )
            {
               gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_placa = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nove_ValorAntiguo") )
            {
               gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_valorantiguo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nove_ValorNuevo") )
            {
               gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_valornuevo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TNov_Codigo") )
            {
               gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Tnov_codigo = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TNov_Descripcion") )
            {
               gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Tnov_descripcion = oReader.getValue() ;
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
         sName = "SDTNovedadesBien.SDTNovedadesBienItem" ;
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
      oWriter.writeElement("Nove_Identificador", GXutil.trim( GXutil.str( gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_identificador, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_fecharegistro) )
      {
         oWriter.writeStartElement("Nove_FechaRegistro");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_fecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_fecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_fecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_fecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_fecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_fecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Nove_FechaRegistro", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
      }
      oWriter.writeElement("Nove_Placa", GXutil.rtrim( gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_placa));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Nove_ValorAntiguo", GXutil.rtrim( gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_valorantiguo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Nove_ValorNuevo", GXutil.rtrim( gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_valornuevo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TNov_Codigo", GXutil.trim( GXutil.str( gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Tnov_codigo, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TNov_Descripcion", GXutil.rtrim( gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Tnov_descripcion));
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
      AddObjectProperty("Nove_Identificador", gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_identificador, false);
      datetime_STZ = gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_fecharegistro ;
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Nove_FechaRegistro", sDateCnv, false);
      AddObjectProperty("Nove_Placa", gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_placa, false);
      AddObjectProperty("Nove_ValorAntiguo", gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_valorantiguo, false);
      AddObjectProperty("Nove_ValorNuevo", gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_valornuevo, false);
      AddObjectProperty("TNov_Codigo", gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Tnov_codigo, false);
      AddObjectProperty("TNov_Descripcion", gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Tnov_descripcion, false);
   }

   public long getgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_identificador( )
   {
      return gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_identificador ;
   }

   public void setgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_identificador( long value )
   {
      gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_identificador = value ;
   }

   public java.util.Date getgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_fecharegistro( )
   {
      return gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_fecharegistro ;
   }

   public void setgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_fecharegistro( java.util.Date value )
   {
      gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_fecharegistro = value ;
   }

   public String getgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_placa( )
   {
      return gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_placa ;
   }

   public void setgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_placa( String value )
   {
      gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_placa = value ;
   }

   public String getgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_valorantiguo( )
   {
      return gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_valorantiguo ;
   }

   public void setgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_valorantiguo( String value )
   {
      gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_valorantiguo = value ;
   }

   public String getgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_valornuevo( )
   {
      return gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_valornuevo ;
   }

   public void setgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_valornuevo( String value )
   {
      gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_valornuevo = value ;
   }

   public int getgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Tnov_codigo( )
   {
      return gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Tnov_codigo ;
   }

   public void setgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Tnov_codigo( int value )
   {
      gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Tnov_codigo = value ;
   }

   public String getgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Tnov_descripcion( )
   {
      return gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Tnov_descripcion ;
   }

   public void setgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Tnov_descripcion( String value )
   {
      gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Tnov_descripcion = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_fecharegistro = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_placa = "" ;
      gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_valorantiguo = "" ;
      gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_valornuevo = "" ;
      gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Tnov_descripcion = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public com.orions2.SdtSDTNovedadesBien_SDTNovedadesBienItem Clone( )
   {
      return (com.orions2.SdtSDTNovedadesBien_SDTNovedadesBienItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTNovedadesBien_SDTNovedadesBienItem struct )
   {
      setgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_identificador(struct.getNove_identificador());
      setgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_fecharegistro(struct.getNove_fecharegistro());
      setgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_placa(struct.getNove_placa());
      setgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_valorantiguo(struct.getNove_valorantiguo());
      setgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_valornuevo(struct.getNove_valornuevo());
      setgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Tnov_codigo(struct.getTnov_codigo());
      setgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Tnov_descripcion(struct.getTnov_descripcion());
   }

   public com.orions2.StructSdtSDTNovedadesBien_SDTNovedadesBienItem getStruct( )
   {
      com.orions2.StructSdtSDTNovedadesBien_SDTNovedadesBienItem struct = new com.orions2.StructSdtSDTNovedadesBien_SDTNovedadesBienItem ();
      struct.setNove_identificador(getgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_identificador());
      struct.setNove_fecharegistro(getgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_fecharegistro());
      struct.setNove_placa(getgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_placa());
      struct.setNove_valorantiguo(getgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_valorantiguo());
      struct.setNove_valornuevo(getgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_valornuevo());
      struct.setTnov_codigo(getgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Tnov_codigo());
      struct.setTnov_descripcion(getgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Tnov_descripcion());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Tnov_codigo ;
   protected long gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_identificador ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_fecharegistro ;
   protected java.util.Date datetime_STZ ;
   protected String gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_placa ;
   protected String gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_valorantiguo ;
   protected String gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_valornuevo ;
   protected String gxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Tnov_descripcion ;
}

