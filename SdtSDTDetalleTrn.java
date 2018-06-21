/*
               File: SdtSDTDetalleTrn
        Description: SDTDetalleTrn
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:17.33
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

public final  class SdtSDTDetalleTrn extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTDetalleTrn( )
   {
      this(  new ModelContext(SdtSDTDetalleTrn.class));
   }

   public SdtSDTDetalleTrn( ModelContext context )
   {
      super( context, "SdtSDTDetalleTrn");
   }

   public SdtSDTDetalleTrn( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTDetalleTrn");
   }

   public SdtSDTDetalleTrn( StructSdtSDTDetalleTrn struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_Id") )
            {
               gxTv_SdtSDTDetalleTrn_Tran_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TDet_Consecutivo") )
            {
               gxTv_SdtSDTDetalleTrn_Tdet_consecutivo = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Elem_Consecutivo") )
            {
               gxTv_SdtSDTDetalleTrn_Elem_consecutivo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Elem_Descripcion") )
            {
               gxTv_SdtSDTDetalleTrn_Elem_descripcion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cata_Descripcion") )
            {
               gxTv_SdtSDTDetalleTrn_Cata_descripcion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TDet_Cantidad") )
            {
               gxTv_SdtSDTDetalleTrn_Tdet_cantidad = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TDet_ValorUnitario") )
            {
               gxTv_SdtSDTDetalleTrn_Tdet_valorunitario = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TDet_ValorTotal") )
            {
               gxTv_SdtSDTDetalleTrn_Tdet_valortotal = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TDet_PlacaNumero") )
            {
               gxTv_SdtSDTDetalleTrn_Tdet_placanumero = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TDet_Observaciones") )
            {
               gxTv_SdtSDTDetalleTrn_Tdet_observaciones = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TDet_PlacaPadre") )
            {
               gxTv_SdtSDTDetalleTrn_Tdet_placapadre = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TDet_EsPadre") )
            {
               gxTv_SdtSDTDetalleTrn_Tdet_espadre = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TDet_Atributos") )
            {
               gxTv_SdtSDTDetalleTrn_Tdet_atributos = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TDet_Valor_Presente") )
            {
               gxTv_SdtSDTDetalleTrn_Tdet_valor_presente = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TDet_Valor_Futuro") )
            {
               gxTv_SdtSDTDetalleTrn_Tdet_valor_futuro = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TDet_Taza") )
            {
               gxTv_SdtSDTDetalleTrn_Tdet_taza = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TDet_Plazo_N") )
            {
               gxTv_SdtSDTDetalleTrn_Tdet_plazo_n = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TDet_Otros_Costos") )
            {
               gxTv_SdtSDTDetalleTrn_Tdet_otros_costos = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TDet_Agrupado") )
            {
               gxTv_SdtSDTDetalleTrn_Tdet_agrupado = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TDet_PlacaRecuperada") )
            {
               gxTv_SdtSDTDetalleTrn_Tdet_placarecuperada = oReader.getValue() ;
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
         sName = "SDTDetalleTrn" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "ACBSENA" ;
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
      oWriter.writeElement("Tran_Id", GXutil.trim( GXutil.str( gxTv_SdtSDTDetalleTrn_Tran_id, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TDet_Consecutivo", GXutil.trim( GXutil.str( gxTv_SdtSDTDetalleTrn_Tdet_consecutivo, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Elem_Consecutivo", GXutil.rtrim( gxTv_SdtSDTDetalleTrn_Elem_consecutivo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Elem_Descripcion", GXutil.rtrim( gxTv_SdtSDTDetalleTrn_Elem_descripcion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Cata_Descripcion", GXutil.rtrim( gxTv_SdtSDTDetalleTrn_Cata_descripcion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TDet_Cantidad", GXutil.trim( GXutil.str( gxTv_SdtSDTDetalleTrn_Tdet_cantidad, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TDet_ValorUnitario", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDetalleTrn_Tdet_valorunitario, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TDet_ValorTotal", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDetalleTrn_Tdet_valortotal, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TDet_PlacaNumero", GXutil.rtrim( gxTv_SdtSDTDetalleTrn_Tdet_placanumero));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TDet_Observaciones", GXutil.rtrim( gxTv_SdtSDTDetalleTrn_Tdet_observaciones));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TDet_PlacaPadre", GXutil.rtrim( gxTv_SdtSDTDetalleTrn_Tdet_placapadre));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TDet_EsPadre", GXutil.rtrim( gxTv_SdtSDTDetalleTrn_Tdet_espadre));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TDet_Atributos", GXutil.rtrim( gxTv_SdtSDTDetalleTrn_Tdet_atributos));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TDet_Valor_Presente", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDetalleTrn_Tdet_valor_presente, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TDet_Valor_Futuro", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDetalleTrn_Tdet_valor_futuro, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TDet_Taza", GXutil.trim( GXutil.str( gxTv_SdtSDTDetalleTrn_Tdet_taza, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TDet_Plazo_N", GXutil.trim( GXutil.str( gxTv_SdtSDTDetalleTrn_Tdet_plazo_n, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TDet_Otros_Costos", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDetalleTrn_Tdet_otros_costos, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TDet_Agrupado", GXutil.trim( GXutil.str( gxTv_SdtSDTDetalleTrn_Tdet_agrupado, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TDet_PlacaRecuperada", GXutil.rtrim( gxTv_SdtSDTDetalleTrn_Tdet_placarecuperada));
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
      AddObjectProperty("Tran_Id", gxTv_SdtSDTDetalleTrn_Tran_id, false);
      AddObjectProperty("TDet_Consecutivo", GXutil.ltrim( GXutil.str( gxTv_SdtSDTDetalleTrn_Tdet_consecutivo, 18, 0)), false);
      AddObjectProperty("Elem_Consecutivo", gxTv_SdtSDTDetalleTrn_Elem_consecutivo, false);
      AddObjectProperty("Elem_Descripcion", gxTv_SdtSDTDetalleTrn_Elem_descripcion, false);
      AddObjectProperty("Cata_Descripcion", gxTv_SdtSDTDetalleTrn_Cata_descripcion, false);
      AddObjectProperty("TDet_Cantidad", gxTv_SdtSDTDetalleTrn_Tdet_cantidad, false);
      AddObjectProperty("TDet_ValorUnitario", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSDTDetalleTrn_Tdet_valorunitario, 18, 2)), false);
      AddObjectProperty("TDet_ValorTotal", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSDTDetalleTrn_Tdet_valortotal, 18, 2)), false);
      AddObjectProperty("TDet_PlacaNumero", gxTv_SdtSDTDetalleTrn_Tdet_placanumero, false);
      AddObjectProperty("TDet_Observaciones", gxTv_SdtSDTDetalleTrn_Tdet_observaciones, false);
      AddObjectProperty("TDet_PlacaPadre", gxTv_SdtSDTDetalleTrn_Tdet_placapadre, false);
      AddObjectProperty("TDet_EsPadre", gxTv_SdtSDTDetalleTrn_Tdet_espadre, false);
      AddObjectProperty("TDet_Atributos", gxTv_SdtSDTDetalleTrn_Tdet_atributos, false);
      AddObjectProperty("TDet_Valor_Presente", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSDTDetalleTrn_Tdet_valor_presente, 18, 2)), false);
      AddObjectProperty("TDet_Valor_Futuro", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSDTDetalleTrn_Tdet_valor_futuro, 18, 2)), false);
      AddObjectProperty("TDet_Taza", gxTv_SdtSDTDetalleTrn_Tdet_taza, false);
      AddObjectProperty("TDet_Plazo_N", gxTv_SdtSDTDetalleTrn_Tdet_plazo_n, false);
      AddObjectProperty("TDet_Otros_Costos", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSDTDetalleTrn_Tdet_otros_costos, 18, 2)), false);
      AddObjectProperty("TDet_Agrupado", gxTv_SdtSDTDetalleTrn_Tdet_agrupado, false);
      AddObjectProperty("TDet_PlacaRecuperada", gxTv_SdtSDTDetalleTrn_Tdet_placarecuperada, false);
   }

   public long getgxTv_SdtSDTDetalleTrn_Tran_id( )
   {
      return gxTv_SdtSDTDetalleTrn_Tran_id ;
   }

   public void setgxTv_SdtSDTDetalleTrn_Tran_id( long value )
   {
      gxTv_SdtSDTDetalleTrn_Tran_id = value ;
   }

   public long getgxTv_SdtSDTDetalleTrn_Tdet_consecutivo( )
   {
      return gxTv_SdtSDTDetalleTrn_Tdet_consecutivo ;
   }

   public void setgxTv_SdtSDTDetalleTrn_Tdet_consecutivo( long value )
   {
      gxTv_SdtSDTDetalleTrn_Tdet_consecutivo = value ;
   }

   public String getgxTv_SdtSDTDetalleTrn_Elem_consecutivo( )
   {
      return gxTv_SdtSDTDetalleTrn_Elem_consecutivo ;
   }

   public void setgxTv_SdtSDTDetalleTrn_Elem_consecutivo( String value )
   {
      gxTv_SdtSDTDetalleTrn_Elem_consecutivo = value ;
   }

   public String getgxTv_SdtSDTDetalleTrn_Elem_descripcion( )
   {
      return gxTv_SdtSDTDetalleTrn_Elem_descripcion ;
   }

   public void setgxTv_SdtSDTDetalleTrn_Elem_descripcion( String value )
   {
      gxTv_SdtSDTDetalleTrn_Elem_descripcion = value ;
   }

   public String getgxTv_SdtSDTDetalleTrn_Cata_descripcion( )
   {
      return gxTv_SdtSDTDetalleTrn_Cata_descripcion ;
   }

   public void setgxTv_SdtSDTDetalleTrn_Cata_descripcion( String value )
   {
      gxTv_SdtSDTDetalleTrn_Cata_descripcion = value ;
   }

   public long getgxTv_SdtSDTDetalleTrn_Tdet_cantidad( )
   {
      return gxTv_SdtSDTDetalleTrn_Tdet_cantidad ;
   }

   public void setgxTv_SdtSDTDetalleTrn_Tdet_cantidad( long value )
   {
      gxTv_SdtSDTDetalleTrn_Tdet_cantidad = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDetalleTrn_Tdet_valorunitario( )
   {
      return gxTv_SdtSDTDetalleTrn_Tdet_valorunitario ;
   }

   public void setgxTv_SdtSDTDetalleTrn_Tdet_valorunitario( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDetalleTrn_Tdet_valorunitario = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDetalleTrn_Tdet_valortotal( )
   {
      return gxTv_SdtSDTDetalleTrn_Tdet_valortotal ;
   }

   public void setgxTv_SdtSDTDetalleTrn_Tdet_valortotal( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDetalleTrn_Tdet_valortotal = value ;
   }

   public String getgxTv_SdtSDTDetalleTrn_Tdet_placanumero( )
   {
      return gxTv_SdtSDTDetalleTrn_Tdet_placanumero ;
   }

   public void setgxTv_SdtSDTDetalleTrn_Tdet_placanumero( String value )
   {
      gxTv_SdtSDTDetalleTrn_Tdet_placanumero = value ;
   }

   public String getgxTv_SdtSDTDetalleTrn_Tdet_observaciones( )
   {
      return gxTv_SdtSDTDetalleTrn_Tdet_observaciones ;
   }

   public void setgxTv_SdtSDTDetalleTrn_Tdet_observaciones( String value )
   {
      gxTv_SdtSDTDetalleTrn_Tdet_observaciones = value ;
   }

   public String getgxTv_SdtSDTDetalleTrn_Tdet_placapadre( )
   {
      return gxTv_SdtSDTDetalleTrn_Tdet_placapadre ;
   }

   public void setgxTv_SdtSDTDetalleTrn_Tdet_placapadre( String value )
   {
      gxTv_SdtSDTDetalleTrn_Tdet_placapadre = value ;
   }

   public String getgxTv_SdtSDTDetalleTrn_Tdet_espadre( )
   {
      return gxTv_SdtSDTDetalleTrn_Tdet_espadre ;
   }

   public void setgxTv_SdtSDTDetalleTrn_Tdet_espadre( String value )
   {
      gxTv_SdtSDTDetalleTrn_Tdet_espadre = value ;
   }

   public String getgxTv_SdtSDTDetalleTrn_Tdet_atributos( )
   {
      return gxTv_SdtSDTDetalleTrn_Tdet_atributos ;
   }

   public void setgxTv_SdtSDTDetalleTrn_Tdet_atributos( String value )
   {
      gxTv_SdtSDTDetalleTrn_Tdet_atributos = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDetalleTrn_Tdet_valor_presente( )
   {
      return gxTv_SdtSDTDetalleTrn_Tdet_valor_presente ;
   }

   public void setgxTv_SdtSDTDetalleTrn_Tdet_valor_presente( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDetalleTrn_Tdet_valor_presente = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDetalleTrn_Tdet_valor_futuro( )
   {
      return gxTv_SdtSDTDetalleTrn_Tdet_valor_futuro ;
   }

   public void setgxTv_SdtSDTDetalleTrn_Tdet_valor_futuro( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDetalleTrn_Tdet_valor_futuro = value ;
   }

   public short getgxTv_SdtSDTDetalleTrn_Tdet_taza( )
   {
      return gxTv_SdtSDTDetalleTrn_Tdet_taza ;
   }

   public void setgxTv_SdtSDTDetalleTrn_Tdet_taza( short value )
   {
      gxTv_SdtSDTDetalleTrn_Tdet_taza = value ;
   }

   public byte getgxTv_SdtSDTDetalleTrn_Tdet_plazo_n( )
   {
      return gxTv_SdtSDTDetalleTrn_Tdet_plazo_n ;
   }

   public void setgxTv_SdtSDTDetalleTrn_Tdet_plazo_n( byte value )
   {
      gxTv_SdtSDTDetalleTrn_Tdet_plazo_n = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDetalleTrn_Tdet_otros_costos( )
   {
      return gxTv_SdtSDTDetalleTrn_Tdet_otros_costos ;
   }

   public void setgxTv_SdtSDTDetalleTrn_Tdet_otros_costos( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDetalleTrn_Tdet_otros_costos = value ;
   }

   public short getgxTv_SdtSDTDetalleTrn_Tdet_agrupado( )
   {
      return gxTv_SdtSDTDetalleTrn_Tdet_agrupado ;
   }

   public void setgxTv_SdtSDTDetalleTrn_Tdet_agrupado( short value )
   {
      gxTv_SdtSDTDetalleTrn_Tdet_agrupado = value ;
   }

   public String getgxTv_SdtSDTDetalleTrn_Tdet_placarecuperada( )
   {
      return gxTv_SdtSDTDetalleTrn_Tdet_placarecuperada ;
   }

   public void setgxTv_SdtSDTDetalleTrn_Tdet_placarecuperada( String value )
   {
      gxTv_SdtSDTDetalleTrn_Tdet_placarecuperada = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTDetalleTrn_Elem_consecutivo = "" ;
      gxTv_SdtSDTDetalleTrn_Elem_descripcion = "" ;
      gxTv_SdtSDTDetalleTrn_Cata_descripcion = "" ;
      gxTv_SdtSDTDetalleTrn_Tdet_valorunitario = DecimalUtil.ZERO ;
      gxTv_SdtSDTDetalleTrn_Tdet_valortotal = DecimalUtil.ZERO ;
      gxTv_SdtSDTDetalleTrn_Tdet_placanumero = "" ;
      gxTv_SdtSDTDetalleTrn_Tdet_observaciones = "" ;
      gxTv_SdtSDTDetalleTrn_Tdet_placapadre = "" ;
      gxTv_SdtSDTDetalleTrn_Tdet_espadre = "" ;
      gxTv_SdtSDTDetalleTrn_Tdet_atributos = "" ;
      gxTv_SdtSDTDetalleTrn_Tdet_valor_presente = DecimalUtil.ZERO ;
      gxTv_SdtSDTDetalleTrn_Tdet_valor_futuro = DecimalUtil.ZERO ;
      gxTv_SdtSDTDetalleTrn_Tdet_otros_costos = DecimalUtil.ZERO ;
      gxTv_SdtSDTDetalleTrn_Tdet_placarecuperada = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTDetalleTrn Clone( )
   {
      return (com.orions2.SdtSDTDetalleTrn)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTDetalleTrn struct )
   {
      setgxTv_SdtSDTDetalleTrn_Tran_id(struct.getTran_id());
      setgxTv_SdtSDTDetalleTrn_Tdet_consecutivo(struct.getTdet_consecutivo());
      setgxTv_SdtSDTDetalleTrn_Elem_consecutivo(struct.getElem_consecutivo());
      setgxTv_SdtSDTDetalleTrn_Elem_descripcion(struct.getElem_descripcion());
      setgxTv_SdtSDTDetalleTrn_Cata_descripcion(struct.getCata_descripcion());
      setgxTv_SdtSDTDetalleTrn_Tdet_cantidad(struct.getTdet_cantidad());
      setgxTv_SdtSDTDetalleTrn_Tdet_valorunitario(struct.getTdet_valorunitario());
      setgxTv_SdtSDTDetalleTrn_Tdet_valortotal(struct.getTdet_valortotal());
      setgxTv_SdtSDTDetalleTrn_Tdet_placanumero(struct.getTdet_placanumero());
      setgxTv_SdtSDTDetalleTrn_Tdet_observaciones(struct.getTdet_observaciones());
      setgxTv_SdtSDTDetalleTrn_Tdet_placapadre(struct.getTdet_placapadre());
      setgxTv_SdtSDTDetalleTrn_Tdet_espadre(struct.getTdet_espadre());
      setgxTv_SdtSDTDetalleTrn_Tdet_atributos(struct.getTdet_atributos());
      setgxTv_SdtSDTDetalleTrn_Tdet_valor_presente(struct.getTdet_valor_presente());
      setgxTv_SdtSDTDetalleTrn_Tdet_valor_futuro(struct.getTdet_valor_futuro());
      setgxTv_SdtSDTDetalleTrn_Tdet_taza(struct.getTdet_taza());
      setgxTv_SdtSDTDetalleTrn_Tdet_plazo_n(struct.getTdet_plazo_n());
      setgxTv_SdtSDTDetalleTrn_Tdet_otros_costos(struct.getTdet_otros_costos());
      setgxTv_SdtSDTDetalleTrn_Tdet_agrupado(struct.getTdet_agrupado());
      setgxTv_SdtSDTDetalleTrn_Tdet_placarecuperada(struct.getTdet_placarecuperada());
   }

   public com.orions2.StructSdtSDTDetalleTrn getStruct( )
   {
      com.orions2.StructSdtSDTDetalleTrn struct = new com.orions2.StructSdtSDTDetalleTrn ();
      struct.setTran_id(getgxTv_SdtSDTDetalleTrn_Tran_id());
      struct.setTdet_consecutivo(getgxTv_SdtSDTDetalleTrn_Tdet_consecutivo());
      struct.setElem_consecutivo(getgxTv_SdtSDTDetalleTrn_Elem_consecutivo());
      struct.setElem_descripcion(getgxTv_SdtSDTDetalleTrn_Elem_descripcion());
      struct.setCata_descripcion(getgxTv_SdtSDTDetalleTrn_Cata_descripcion());
      struct.setTdet_cantidad(getgxTv_SdtSDTDetalleTrn_Tdet_cantidad());
      struct.setTdet_valorunitario(getgxTv_SdtSDTDetalleTrn_Tdet_valorunitario());
      struct.setTdet_valortotal(getgxTv_SdtSDTDetalleTrn_Tdet_valortotal());
      struct.setTdet_placanumero(getgxTv_SdtSDTDetalleTrn_Tdet_placanumero());
      struct.setTdet_observaciones(getgxTv_SdtSDTDetalleTrn_Tdet_observaciones());
      struct.setTdet_placapadre(getgxTv_SdtSDTDetalleTrn_Tdet_placapadre());
      struct.setTdet_espadre(getgxTv_SdtSDTDetalleTrn_Tdet_espadre());
      struct.setTdet_atributos(getgxTv_SdtSDTDetalleTrn_Tdet_atributos());
      struct.setTdet_valor_presente(getgxTv_SdtSDTDetalleTrn_Tdet_valor_presente());
      struct.setTdet_valor_futuro(getgxTv_SdtSDTDetalleTrn_Tdet_valor_futuro());
      struct.setTdet_taza(getgxTv_SdtSDTDetalleTrn_Tdet_taza());
      struct.setTdet_plazo_n(getgxTv_SdtSDTDetalleTrn_Tdet_plazo_n());
      struct.setTdet_otros_costos(getgxTv_SdtSDTDetalleTrn_Tdet_otros_costos());
      struct.setTdet_agrupado(getgxTv_SdtSDTDetalleTrn_Tdet_agrupado());
      struct.setTdet_placarecuperada(getgxTv_SdtSDTDetalleTrn_Tdet_placarecuperada());
      return struct ;
   }

   protected byte gxTv_SdtSDTDetalleTrn_Tdet_plazo_n ;
   protected short gxTv_SdtSDTDetalleTrn_Tdet_taza ;
   protected short gxTv_SdtSDTDetalleTrn_Tdet_agrupado ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSDTDetalleTrn_Tran_id ;
   protected long gxTv_SdtSDTDetalleTrn_Tdet_consecutivo ;
   protected long gxTv_SdtSDTDetalleTrn_Tdet_cantidad ;
   protected java.math.BigDecimal gxTv_SdtSDTDetalleTrn_Tdet_valorunitario ;
   protected java.math.BigDecimal gxTv_SdtSDTDetalleTrn_Tdet_valortotal ;
   protected java.math.BigDecimal gxTv_SdtSDTDetalleTrn_Tdet_valor_presente ;
   protected java.math.BigDecimal gxTv_SdtSDTDetalleTrn_Tdet_valor_futuro ;
   protected java.math.BigDecimal gxTv_SdtSDTDetalleTrn_Tdet_otros_costos ;
   protected String sTagName ;
   protected String gxTv_SdtSDTDetalleTrn_Elem_consecutivo ;
   protected String gxTv_SdtSDTDetalleTrn_Elem_descripcion ;
   protected String gxTv_SdtSDTDetalleTrn_Cata_descripcion ;
   protected String gxTv_SdtSDTDetalleTrn_Tdet_placanumero ;
   protected String gxTv_SdtSDTDetalleTrn_Tdet_observaciones ;
   protected String gxTv_SdtSDTDetalleTrn_Tdet_placapadre ;
   protected String gxTv_SdtSDTDetalleTrn_Tdet_espadre ;
   protected String gxTv_SdtSDTDetalleTrn_Tdet_atributos ;
   protected String gxTv_SdtSDTDetalleTrn_Tdet_placarecuperada ;
}

