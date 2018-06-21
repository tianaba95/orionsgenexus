/*
               File: SdtSDTInvDevoSel_SDTInvDevoSelItem
        Description: SDTInvDevoSel
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:18.47
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

public final  class SdtSDTInvDevoSel_SDTInvDevoSelItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTInvDevoSel_SDTInvDevoSelItem( )
   {
      this(  new ModelContext(SdtSDTInvDevoSel_SDTInvDevoSelItem.class));
   }

   public SdtSDTInvDevoSel_SDTInvDevoSelItem( ModelContext context )
   {
      super( context, "SdtSDTInvDevoSel_SDTInvDevoSelItem");
   }

   public SdtSDTInvDevoSel_SDTInvDevoSelItem( int remoteHandle ,
                                              ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTInvDevoSel_SDTInvDevoSelItem");
   }

   public SdtSDTInvDevoSel_SDTInvDevoSelItem( StructSdtSDTInvDevoSel_SDTInvDevoSelItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Invd_NumeroPlaca") )
            {
               gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_numeroplaca = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Elem_Consecutivo") )
            {
               gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Elem_consecutivo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cata_Descripcion") )
            {
               gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Cata_descripcion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Invd_PlacaPadre") )
            {
               gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_placapadre = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Marca") )
            {
               gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Marca = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Modelo") )
            {
               gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Modelo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Serial") )
            {
               gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Serial = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Invd_FechaAdquisicion") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_fechaadquisicion = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_fechaadquisicion = localUtil.ymdtod( (int)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (int)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (int)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Observaciones") )
            {
               gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Observaciones = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Costo_Total_Dev") )
            {
               gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Costo_total_dev = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Invd_Estado") )
            {
               gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_estado = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Invd_Seleccion") )
            {
               gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_seleccion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_Entrada") )
            {
               gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_entrada = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_NroLinea") )
            {
               gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_nrolinea = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_ConsecutivoCC") )
            {
               gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_consecutivocc = GXutil.lval( oReader.getValue()) ;
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
         sName = "SDTInvDevoSel.SDTInvDevoSelItem" ;
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
      oWriter.writeElement("Invd_NumeroPlaca", GXutil.rtrim( gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_numeroplaca));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Elem_Consecutivo", GXutil.rtrim( gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Elem_consecutivo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Cata_Descripcion", GXutil.rtrim( gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Cata_descripcion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Invd_PlacaPadre", GXutil.rtrim( gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_placapadre));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Marca", GXutil.rtrim( gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Marca));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Modelo", GXutil.rtrim( gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Modelo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Serial", GXutil.rtrim( gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Serial));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_fechaadquisicion) )
      {
         oWriter.writeStartElement("Invd_FechaAdquisicion");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_fechaadquisicion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_fechaadquisicion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_fechaadquisicion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Invd_FechaAdquisicion", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
      }
      oWriter.writeElement("Observaciones", GXutil.rtrim( gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Observaciones));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Costo_Total_Dev", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Costo_total_dev, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Invd_Estado", GXutil.rtrim( gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_estado));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Invd_Seleccion", GXutil.rtrim( gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_seleccion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_Entrada", GXutil.trim( GXutil.str( gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_entrada, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_NroLinea", GXutil.trim( GXutil.str( gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_nrolinea, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_ConsecutivoCC", GXutil.trim( GXutil.str( gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_consecutivocc, 18, 0)));
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
      AddObjectProperty("Invd_NumeroPlaca", gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_numeroplaca, false);
      AddObjectProperty("Elem_Consecutivo", gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Elem_consecutivo, false);
      AddObjectProperty("Cata_Descripcion", gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Cata_descripcion, false);
      AddObjectProperty("Invd_PlacaPadre", gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_placapadre, false);
      AddObjectProperty("Marca", gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Marca, false);
      AddObjectProperty("Modelo", gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Modelo, false);
      AddObjectProperty("Serial", gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Serial, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_fechaadquisicion), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_fechaadquisicion), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_fechaadquisicion), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Invd_FechaAdquisicion", sDateCnv, false);
      AddObjectProperty("Observaciones", gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Observaciones, false);
      AddObjectProperty("Costo_Total_Dev", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Costo_total_dev, 18, 2)), false);
      AddObjectProperty("Invd_Estado", gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_estado, false);
      AddObjectProperty("Invd_Seleccion", gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_seleccion, false);
      AddObjectProperty("Tran_Entrada", gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_entrada, false);
      AddObjectProperty("Tran_NroLinea", gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_nrolinea, false);
      AddObjectProperty("Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_consecutivocc, 18, 0)), false);
   }

   public String getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_numeroplaca( )
   {
      return gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_numeroplaca ;
   }

   public void setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_numeroplaca( String value )
   {
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_numeroplaca = value ;
   }

   public String getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Elem_consecutivo( )
   {
      return gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Elem_consecutivo ;
   }

   public void setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Elem_consecutivo( String value )
   {
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Elem_consecutivo = value ;
   }

   public String getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Cata_descripcion( )
   {
      return gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Cata_descripcion ;
   }

   public void setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Cata_descripcion( String value )
   {
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Cata_descripcion = value ;
   }

   public String getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_placapadre( )
   {
      return gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_placapadre ;
   }

   public void setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_placapadre( String value )
   {
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_placapadre = value ;
   }

   public String getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Marca( )
   {
      return gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Marca ;
   }

   public void setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Marca( String value )
   {
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Marca = value ;
   }

   public String getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Modelo( )
   {
      return gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Modelo ;
   }

   public void setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Modelo( String value )
   {
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Modelo = value ;
   }

   public String getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Serial( )
   {
      return gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Serial ;
   }

   public void setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Serial( String value )
   {
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Serial = value ;
   }

   public java.util.Date getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_fechaadquisicion( )
   {
      return gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_fechaadquisicion ;
   }

   public void setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_fechaadquisicion( java.util.Date value )
   {
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_fechaadquisicion = value ;
   }

   public String getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Observaciones( )
   {
      return gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Observaciones ;
   }

   public void setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Observaciones( String value )
   {
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Observaciones = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Costo_total_dev( )
   {
      return gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Costo_total_dev ;
   }

   public void setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Costo_total_dev( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Costo_total_dev = value ;
   }

   public String getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_estado( )
   {
      return gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_estado ;
   }

   public void setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_estado( String value )
   {
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_estado = value ;
   }

   public String getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_seleccion( )
   {
      return gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_seleccion ;
   }

   public void setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_seleccion( String value )
   {
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_seleccion = value ;
   }

   public long getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_entrada( )
   {
      return gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_entrada ;
   }

   public void setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_entrada( long value )
   {
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_entrada = value ;
   }

   public int getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_nrolinea( )
   {
      return gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_nrolinea ;
   }

   public void setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_nrolinea( int value )
   {
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_nrolinea = value ;
   }

   public long getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_consecutivocc( )
   {
      return gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_consecutivocc ;
   }

   public void setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_consecutivocc( long value )
   {
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_consecutivocc = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_numeroplaca = "" ;
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Elem_consecutivo = "" ;
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Cata_descripcion = "" ;
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_placapadre = "" ;
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Marca = "" ;
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Modelo = "" ;
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Serial = "" ;
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_fechaadquisicion = GXutil.nullDate() ;
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Observaciones = "" ;
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Costo_total_dev = DecimalUtil.ZERO ;
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_estado = "" ;
      gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_seleccion = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem Clone( )
   {
      return (com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTInvDevoSel_SDTInvDevoSelItem struct )
   {
      setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_numeroplaca(struct.getInvd_numeroplaca());
      setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Elem_consecutivo(struct.getElem_consecutivo());
      setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Cata_descripcion(struct.getCata_descripcion());
      setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_placapadre(struct.getInvd_placapadre());
      setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Marca(struct.getMarca());
      setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Modelo(struct.getModelo());
      setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Serial(struct.getSerial());
      setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_fechaadquisicion(struct.getInvd_fechaadquisicion());
      setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Observaciones(struct.getObservaciones());
      setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Costo_total_dev(struct.getCosto_total_dev());
      setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_estado(struct.getInvd_estado());
      setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_seleccion(struct.getInvd_seleccion());
      setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_entrada(struct.getTran_entrada());
      setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_nrolinea(struct.getTran_nrolinea());
      setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_consecutivocc(struct.getTran_consecutivocc());
   }

   public com.orions2.StructSdtSDTInvDevoSel_SDTInvDevoSelItem getStruct( )
   {
      com.orions2.StructSdtSDTInvDevoSel_SDTInvDevoSelItem struct = new com.orions2.StructSdtSDTInvDevoSel_SDTInvDevoSelItem ();
      struct.setInvd_numeroplaca(getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_numeroplaca());
      struct.setElem_consecutivo(getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Elem_consecutivo());
      struct.setCata_descripcion(getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Cata_descripcion());
      struct.setInvd_placapadre(getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_placapadre());
      struct.setMarca(getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Marca());
      struct.setModelo(getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Modelo());
      struct.setSerial(getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Serial());
      struct.setInvd_fechaadquisicion(getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_fechaadquisicion());
      struct.setObservaciones(getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Observaciones());
      struct.setCosto_total_dev(getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Costo_total_dev());
      struct.setInvd_estado(getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_estado());
      struct.setInvd_seleccion(getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_seleccion());
      struct.setTran_entrada(getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_entrada());
      struct.setTran_nrolinea(getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_nrolinea());
      struct.setTran_consecutivocc(getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_consecutivocc());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_nrolinea ;
   protected long gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_entrada ;
   protected long gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_consecutivocc ;
   protected java.math.BigDecimal gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Costo_total_dev ;
   protected String gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_seleccion ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_fechaadquisicion ;
   protected String gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_numeroplaca ;
   protected String gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Elem_consecutivo ;
   protected String gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Cata_descripcion ;
   protected String gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_placapadre ;
   protected String gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Marca ;
   protected String gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Modelo ;
   protected String gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Serial ;
   protected String gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Observaciones ;
   protected String gxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_estado ;
}

