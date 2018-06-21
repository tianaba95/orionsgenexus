/*
               File: SdtSDTInvenConsumo_SDTInvenConsumoItem
        Description: SDTInvenConsumo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:18.57
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

public final  class SdtSDTInvenConsumo_SDTInvenConsumoItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTInvenConsumo_SDTInvenConsumoItem( )
   {
      this(  new ModelContext(SdtSDTInvenConsumo_SDTInvenConsumoItem.class));
   }

   public SdtSDTInvenConsumo_SDTInvenConsumoItem( ModelContext context )
   {
      super( context, "SdtSDTInvenConsumo_SDTInvenConsumoItem");
   }

   public SdtSDTInvenConsumo_SDTInvenConsumoItem( int remoteHandle ,
                                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTInvenConsumo_SDTInvenConsumoItem");
   }

   public SdtSDTInvenConsumo_SDTInvenConsumoItem( StructSdtSDTInvenConsumo_SDTInvenConsumoItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Regional") )
            {
               gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Regional = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Centro_Id") )
            {
               gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Centro_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Alma_Modulo") )
            {
               gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_modulo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Alma_Codigo") )
            {
               gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_codigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Bode_Codigo") )
            {
               gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Bode_codigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Trans_Id") )
            {
               gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Trans_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Elem_Consecutivo") )
            {
               gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_consecutivo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Num_Linea") )
            {
               gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Num_linea = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Elem_Descripcion") )
            {
               gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_descripcion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cata_Codigo") )
            {
               gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cata_codigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cata_Descripcion") )
            {
               gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cata_descripcion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cantidad_Transito") )
            {
               gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_transito = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Valor_Unitario") )
            {
               gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Valor_unitario = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Otros_Costos") )
            {
               gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Otros_costos = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Costo_Total") )
            {
               gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Costo_total = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Descrip_Atributos") )
            {
               gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Descrip_atributos = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cantidad_Solicitada") )
            {
               gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_solicitada = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_FechaRatificacion") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_fecharatificacion = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_fecharatificacion = localUtil.ymdtod( (int)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (int)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (int)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cantidad_Diponible") )
            {
               gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_diponible = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UNIMED_COD") )
            {
               gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Unimed_cod = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UNIMED_DES") )
            {
               gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Unimed_des = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Observaciones") )
            {
               gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Observaciones = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Marca") )
            {
               gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Marca = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Modelo") )
            {
               gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Modelo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Serial") )
            {
               gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Serial = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_Consecutivo") )
            {
               gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_consecutivo = GXutil.lval( oReader.getValue()) ;
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
         sName = "SDTInvenConsumo.SDTInvenConsumoItem" ;
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
      oWriter.writeElement("Regional", GXutil.trim( GXutil.str( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Regional, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Centro_Id", GXutil.trim( GXutil.str( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Centro_id, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Alma_Modulo", GXutil.rtrim( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_modulo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Alma_Codigo", GXutil.rtrim( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_codigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Bode_Codigo", GXutil.rtrim( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Bode_codigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Trans_Id", GXutil.trim( GXutil.str( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Trans_id, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Elem_Consecutivo", GXutil.rtrim( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_consecutivo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Num_Linea", GXutil.trim( GXutil.str( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Num_linea, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Elem_Descripcion", GXutil.rtrim( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_descripcion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Cata_Codigo", GXutil.rtrim( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cata_codigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Cata_Descripcion", GXutil.rtrim( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cata_descripcion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Cantidad_Transito", GXutil.trim( GXutil.str( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_transito, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Valor_Unitario", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Valor_unitario, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Otros_Costos", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Otros_costos, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Costo_Total", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Costo_total, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Descrip_Atributos", GXutil.rtrim( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Descrip_atributos));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Cantidad_Solicitada", GXutil.trim( GXutil.str( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_solicitada, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_fecharatificacion) )
      {
         oWriter.writeStartElement("Tran_FechaRatificacion");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_fecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_fecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_fecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Tran_FechaRatificacion", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
      }
      oWriter.writeElement("Cantidad_Diponible", GXutil.trim( GXutil.str( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_diponible, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("UNIMED_COD", GXutil.trim( GXutil.str( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Unimed_cod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("UNIMED_DES", GXutil.rtrim( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Unimed_des));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Observaciones", GXutil.rtrim( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Observaciones));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Marca", GXutil.rtrim( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Marca));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Modelo", GXutil.rtrim( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Modelo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Serial", GXutil.rtrim( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Serial));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_Consecutivo", GXutil.trim( GXutil.str( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_consecutivo, 18, 0)));
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
      AddObjectProperty("Regional", gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Regional, false);
      AddObjectProperty("Centro_Id", gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Centro_id, false);
      AddObjectProperty("Alma_Modulo", gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_modulo, false);
      AddObjectProperty("Alma_Codigo", gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_codigo, false);
      AddObjectProperty("Bode_Codigo", gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Bode_codigo, false);
      AddObjectProperty("Trans_Id", gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Trans_id, false);
      AddObjectProperty("Elem_Consecutivo", gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_consecutivo, false);
      AddObjectProperty("Num_Linea", gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Num_linea, false);
      AddObjectProperty("Elem_Descripcion", gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_descripcion, false);
      AddObjectProperty("Cata_Codigo", gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cata_codigo, false);
      AddObjectProperty("Cata_Descripcion", gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cata_descripcion, false);
      AddObjectProperty("Cantidad_Transito", gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_transito, false);
      AddObjectProperty("Valor_Unitario", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Valor_unitario, 18, 2)), false);
      AddObjectProperty("Otros_Costos", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Otros_costos, 18, 2)), false);
      AddObjectProperty("Costo_Total", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Costo_total, 18, 2)), false);
      AddObjectProperty("Descrip_Atributos", gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Descrip_atributos, false);
      AddObjectProperty("Cantidad_Solicitada", gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_solicitada, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_fecharatificacion), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_fecharatificacion), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_fecharatificacion), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Tran_FechaRatificacion", sDateCnv, false);
      AddObjectProperty("Cantidad_Diponible", gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_diponible, false);
      AddObjectProperty("UNIMED_COD", gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Unimed_cod, false);
      AddObjectProperty("UNIMED_DES", gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Unimed_des, false);
      AddObjectProperty("Observaciones", gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Observaciones, false);
      AddObjectProperty("Marca", gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Marca, false);
      AddObjectProperty("Modelo", gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Modelo, false);
      AddObjectProperty("Serial", gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Serial, false);
      AddObjectProperty("Tran_Consecutivo", GXutil.ltrim( GXutil.str( gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_consecutivo, 18, 0)), false);
   }

   public long getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Regional( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Regional ;
   }

   public void setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Regional( long value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Regional = value ;
   }

   public long getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Centro_id( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Centro_id ;
   }

   public void setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Centro_id( long value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Centro_id = value ;
   }

   public String getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_modulo( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_modulo ;
   }

   public void setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_modulo( String value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_modulo = value ;
   }

   public String getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_codigo( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_codigo ;
   }

   public void setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_codigo( String value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_codigo = value ;
   }

   public String getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Bode_codigo( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Bode_codigo ;
   }

   public void setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Bode_codigo( String value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Bode_codigo = value ;
   }

   public long getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Trans_id( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Trans_id ;
   }

   public void setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Trans_id( long value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Trans_id = value ;
   }

   public String getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_consecutivo( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_consecutivo ;
   }

   public void setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_consecutivo( String value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_consecutivo = value ;
   }

   public int getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Num_linea( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Num_linea ;
   }

   public void setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Num_linea( int value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Num_linea = value ;
   }

   public String getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_descripcion( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_descripcion ;
   }

   public void setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_descripcion( String value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_descripcion = value ;
   }

   public String getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cata_codigo( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cata_codigo ;
   }

   public void setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cata_codigo( String value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cata_codigo = value ;
   }

   public String getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cata_descripcion( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cata_descripcion ;
   }

   public void setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cata_descripcion( String value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cata_descripcion = value ;
   }

   public int getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_transito( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_transito ;
   }

   public void setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_transito( int value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_transito = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Valor_unitario( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Valor_unitario ;
   }

   public void setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Valor_unitario( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Valor_unitario = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Otros_costos( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Otros_costos ;
   }

   public void setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Otros_costos( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Otros_costos = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Costo_total( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Costo_total ;
   }

   public void setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Costo_total( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Costo_total = value ;
   }

   public String getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Descrip_atributos( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Descrip_atributos ;
   }

   public void setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Descrip_atributos( String value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Descrip_atributos = value ;
   }

   public int getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_solicitada( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_solicitada ;
   }

   public void setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_solicitada( int value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_solicitada = value ;
   }

   public java.util.Date getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_fecharatificacion( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_fecharatificacion ;
   }

   public void setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_fecharatificacion( java.util.Date value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_fecharatificacion = value ;
   }

   public int getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_diponible( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_diponible ;
   }

   public void setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_diponible( int value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_diponible = value ;
   }

   public int getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Unimed_cod( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Unimed_cod ;
   }

   public void setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Unimed_cod( int value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Unimed_cod = value ;
   }

   public String getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Unimed_des( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Unimed_des ;
   }

   public void setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Unimed_des( String value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Unimed_des = value ;
   }

   public String getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Observaciones( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Observaciones ;
   }

   public void setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Observaciones( String value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Observaciones = value ;
   }

   public String getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Marca( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Marca ;
   }

   public void setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Marca( String value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Marca = value ;
   }

   public String getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Modelo( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Modelo ;
   }

   public void setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Modelo( String value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Modelo = value ;
   }

   public String getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Serial( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Serial ;
   }

   public void setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Serial( String value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Serial = value ;
   }

   public long getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_consecutivo( )
   {
      return gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_consecutivo ;
   }

   public void setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_consecutivo( long value )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_consecutivo = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_modulo = "" ;
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_codigo = "" ;
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Bode_codigo = "" ;
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_consecutivo = "" ;
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_descripcion = "" ;
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cata_codigo = "" ;
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cata_descripcion = "" ;
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Valor_unitario = DecimalUtil.ZERO ;
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Otros_costos = DecimalUtil.ZERO ;
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Costo_total = DecimalUtil.ZERO ;
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Descrip_atributos = "" ;
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_fecharatificacion = GXutil.nullDate() ;
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Unimed_des = "" ;
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Observaciones = "" ;
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Marca = "" ;
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Modelo = "" ;
      gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Serial = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem Clone( )
   {
      return (com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTInvenConsumo_SDTInvenConsumoItem struct )
   {
      setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Regional(struct.getRegional());
      setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Centro_id(struct.getCentro_id());
      setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_modulo(struct.getAlma_modulo());
      setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_codigo(struct.getAlma_codigo());
      setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Bode_codigo(struct.getBode_codigo());
      setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Trans_id(struct.getTrans_id());
      setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_consecutivo(struct.getElem_consecutivo());
      setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Num_linea(struct.getNum_linea());
      setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_descripcion(struct.getElem_descripcion());
      setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cata_codigo(struct.getCata_codigo());
      setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cata_descripcion(struct.getCata_descripcion());
      setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_transito(struct.getCantidad_transito());
      setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Valor_unitario(struct.getValor_unitario());
      setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Otros_costos(struct.getOtros_costos());
      setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Costo_total(struct.getCosto_total());
      setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Descrip_atributos(struct.getDescrip_atributos());
      setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_solicitada(struct.getCantidad_solicitada());
      setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_fecharatificacion(struct.getTran_fecharatificacion());
      setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_diponible(struct.getCantidad_diponible());
      setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Unimed_cod(struct.getUnimed_cod());
      setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Unimed_des(struct.getUnimed_des());
      setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Observaciones(struct.getObservaciones());
      setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Marca(struct.getMarca());
      setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Modelo(struct.getModelo());
      setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Serial(struct.getSerial());
      setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_consecutivo(struct.getTran_consecutivo());
   }

   public com.orions2.StructSdtSDTInvenConsumo_SDTInvenConsumoItem getStruct( )
   {
      com.orions2.StructSdtSDTInvenConsumo_SDTInvenConsumoItem struct = new com.orions2.StructSdtSDTInvenConsumo_SDTInvenConsumoItem ();
      struct.setRegional(getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Regional());
      struct.setCentro_id(getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Centro_id());
      struct.setAlma_modulo(getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_modulo());
      struct.setAlma_codigo(getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_codigo());
      struct.setBode_codigo(getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Bode_codigo());
      struct.setTrans_id(getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Trans_id());
      struct.setElem_consecutivo(getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_consecutivo());
      struct.setNum_linea(getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Num_linea());
      struct.setElem_descripcion(getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_descripcion());
      struct.setCata_codigo(getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cata_codigo());
      struct.setCata_descripcion(getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cata_descripcion());
      struct.setCantidad_transito(getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_transito());
      struct.setValor_unitario(getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Valor_unitario());
      struct.setOtros_costos(getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Otros_costos());
      struct.setCosto_total(getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Costo_total());
      struct.setDescrip_atributos(getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Descrip_atributos());
      struct.setCantidad_solicitada(getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_solicitada());
      struct.setTran_fecharatificacion(getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_fecharatificacion());
      struct.setCantidad_diponible(getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_diponible());
      struct.setUnimed_cod(getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Unimed_cod());
      struct.setUnimed_des(getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Unimed_des());
      struct.setObservaciones(getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Observaciones());
      struct.setMarca(getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Marca());
      struct.setModelo(getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Modelo());
      struct.setSerial(getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Serial());
      struct.setTran_consecutivo(getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_consecutivo());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Num_linea ;
   protected int gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_transito ;
   protected int gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_solicitada ;
   protected int gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_diponible ;
   protected int gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Unimed_cod ;
   protected long gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Regional ;
   protected long gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Centro_id ;
   protected long gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Trans_id ;
   protected long gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_consecutivo ;
   protected java.math.BigDecimal gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Valor_unitario ;
   protected java.math.BigDecimal gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Otros_costos ;
   protected java.math.BigDecimal gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Costo_total ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_fecharatificacion ;
   protected String gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Descrip_atributos ;
   protected String gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_modulo ;
   protected String gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_codigo ;
   protected String gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Bode_codigo ;
   protected String gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_consecutivo ;
   protected String gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_descripcion ;
   protected String gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cata_codigo ;
   protected String gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cata_descripcion ;
   protected String gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Unimed_des ;
   protected String gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Observaciones ;
   protected String gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Marca ;
   protected String gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Modelo ;
   protected String gxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Serial ;
}

