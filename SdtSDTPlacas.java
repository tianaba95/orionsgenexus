/*
               File: SdtSDTPlacas
        Description: SDTPlacas
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:19.51
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

public final  class SdtSDTPlacas extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTPlacas( )
   {
      this(  new ModelContext(SdtSDTPlacas.class));
   }

   public SdtSDTPlacas( ModelContext context )
   {
      super( context, "SdtSDTPlacas");
   }

   public SdtSDTPlacas( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTPlacas");
   }

   public SdtSDTPlacas( StructSdtSDTPlacas struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Elem_Consecutivo") )
            {
               gxTv_SdtSDTPlacas_Elem_consecutivo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cata_Descripcion") )
            {
               gxTv_SdtSDTPlacas_Cata_descripcion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Invd_NumeroPlaca") )
            {
               gxTv_SdtSDTPlacas_Invd_numeroplaca = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Invd_ValorAdquisicion") )
            {
               gxTv_SdtSDTPlacas_Invd_valoradquisicion = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Invd_PlacaPadre") )
            {
               gxTv_SdtSDTPlacas_Invd_placapadre = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Invd_EsPlacaPadre") )
            {
               gxTv_SdtSDTPlacas_Invd_esplacapadre = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Otros_Costos_Dev") )
            {
               gxTv_SdtSDTPlacas_Otros_costos_dev = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Costo_Desmante") )
            {
               gxTv_SdtSDTPlacas_Costo_desmante = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Variable_VF") )
            {
               gxTv_SdtSDTPlacas_Variable_vf = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Variable_I") )
            {
               gxTv_SdtSDTPlacas_Variable_i = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Costo_Total_Dev") )
            {
               gxTv_SdtSDTPlacas_Costo_total_dev = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Variable_N") )
            {
               gxTv_SdtSDTPlacas_Variable_n = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Vida_Util_Inicial") )
            {
               gxTv_SdtSDTPlacas_Vida_util_inicial = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Vida_Util_Actual") )
            {
               gxTv_SdtSDTPlacas_Vida_util_actual = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Marca") )
            {
               gxTv_SdtSDTPlacas_Marca = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Modelo") )
            {
               gxTv_SdtSDTPlacas_Modelo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Serial") )
            {
               gxTv_SdtSDTPlacas_Serial = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Observaciones") )
            {
               gxTv_SdtSDTPlacas_Observaciones = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_Entrada") )
            {
               gxTv_SdtSDTPlacas_Tran_entrada = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nro_Linea") )
            {
               gxTv_SdtSDTPlacas_Nro_linea = (int)(GXutil.lval( oReader.getValue())) ;
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
         sName = "SDTPlacas" ;
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
      oWriter.writeElement("Elem_Consecutivo", GXutil.rtrim( gxTv_SdtSDTPlacas_Elem_consecutivo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Cata_Descripcion", GXutil.rtrim( gxTv_SdtSDTPlacas_Cata_descripcion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Invd_NumeroPlaca", GXutil.rtrim( gxTv_SdtSDTPlacas_Invd_numeroplaca));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Invd_ValorAdquisicion", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTPlacas_Invd_valoradquisicion, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Invd_PlacaPadre", GXutil.rtrim( gxTv_SdtSDTPlacas_Invd_placapadre));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Invd_EsPlacaPadre", GXutil.rtrim( gxTv_SdtSDTPlacas_Invd_esplacapadre));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Otros_Costos_Dev", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTPlacas_Otros_costos_dev, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Costo_Desmante", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTPlacas_Costo_desmante, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Variable_VF", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTPlacas_Variable_vf, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Variable_I", GXutil.trim( GXutil.str( gxTv_SdtSDTPlacas_Variable_i, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Costo_Total_Dev", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTPlacas_Costo_total_dev, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Variable_N", GXutil.trim( GXutil.str( gxTv_SdtSDTPlacas_Variable_n, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Vida_Util_Inicial", GXutil.trim( GXutil.str( gxTv_SdtSDTPlacas_Vida_util_inicial, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Vida_Util_Actual", GXutil.trim( GXutil.str( gxTv_SdtSDTPlacas_Vida_util_actual, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Marca", GXutil.rtrim( gxTv_SdtSDTPlacas_Marca));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Modelo", GXutil.rtrim( gxTv_SdtSDTPlacas_Modelo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Serial", GXutil.rtrim( gxTv_SdtSDTPlacas_Serial));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Observaciones", GXutil.rtrim( gxTv_SdtSDTPlacas_Observaciones));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_Entrada", GXutil.trim( GXutil.str( gxTv_SdtSDTPlacas_Tran_entrada, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Nro_Linea", GXutil.trim( GXutil.str( gxTv_SdtSDTPlacas_Nro_linea, 8, 0)));
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
      AddObjectProperty("Elem_Consecutivo", gxTv_SdtSDTPlacas_Elem_consecutivo, false);
      AddObjectProperty("Cata_Descripcion", gxTv_SdtSDTPlacas_Cata_descripcion, false);
      AddObjectProperty("Invd_NumeroPlaca", gxTv_SdtSDTPlacas_Invd_numeroplaca, false);
      AddObjectProperty("Invd_ValorAdquisicion", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSDTPlacas_Invd_valoradquisicion, 18, 2)), false);
      AddObjectProperty("Invd_PlacaPadre", gxTv_SdtSDTPlacas_Invd_placapadre, false);
      AddObjectProperty("Invd_EsPlacaPadre", gxTv_SdtSDTPlacas_Invd_esplacapadre, false);
      AddObjectProperty("Otros_Costos_Dev", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSDTPlacas_Otros_costos_dev, 18, 2)), false);
      AddObjectProperty("Costo_Desmante", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSDTPlacas_Costo_desmante, 18, 2)), false);
      AddObjectProperty("Variable_VF", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSDTPlacas_Variable_vf, 18, 2)), false);
      AddObjectProperty("Variable_I", gxTv_SdtSDTPlacas_Variable_i, false);
      AddObjectProperty("Costo_Total_Dev", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSDTPlacas_Costo_total_dev, 18, 2)), false);
      AddObjectProperty("Variable_N", gxTv_SdtSDTPlacas_Variable_n, false);
      AddObjectProperty("Vida_Util_Inicial", gxTv_SdtSDTPlacas_Vida_util_inicial, false);
      AddObjectProperty("Vida_Util_Actual", gxTv_SdtSDTPlacas_Vida_util_actual, false);
      AddObjectProperty("Marca", gxTv_SdtSDTPlacas_Marca, false);
      AddObjectProperty("Modelo", gxTv_SdtSDTPlacas_Modelo, false);
      AddObjectProperty("Serial", gxTv_SdtSDTPlacas_Serial, false);
      AddObjectProperty("Observaciones", gxTv_SdtSDTPlacas_Observaciones, false);
      AddObjectProperty("Tran_Entrada", gxTv_SdtSDTPlacas_Tran_entrada, false);
      AddObjectProperty("Nro_Linea", gxTv_SdtSDTPlacas_Nro_linea, false);
   }

   public String getgxTv_SdtSDTPlacas_Elem_consecutivo( )
   {
      return gxTv_SdtSDTPlacas_Elem_consecutivo ;
   }

   public void setgxTv_SdtSDTPlacas_Elem_consecutivo( String value )
   {
      gxTv_SdtSDTPlacas_Elem_consecutivo = value ;
   }

   public String getgxTv_SdtSDTPlacas_Cata_descripcion( )
   {
      return gxTv_SdtSDTPlacas_Cata_descripcion ;
   }

   public void setgxTv_SdtSDTPlacas_Cata_descripcion( String value )
   {
      gxTv_SdtSDTPlacas_Cata_descripcion = value ;
   }

   public String getgxTv_SdtSDTPlacas_Invd_numeroplaca( )
   {
      return gxTv_SdtSDTPlacas_Invd_numeroplaca ;
   }

   public void setgxTv_SdtSDTPlacas_Invd_numeroplaca( String value )
   {
      gxTv_SdtSDTPlacas_Invd_numeroplaca = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTPlacas_Invd_valoradquisicion( )
   {
      return gxTv_SdtSDTPlacas_Invd_valoradquisicion ;
   }

   public void setgxTv_SdtSDTPlacas_Invd_valoradquisicion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTPlacas_Invd_valoradquisicion = value ;
   }

   public String getgxTv_SdtSDTPlacas_Invd_placapadre( )
   {
      return gxTv_SdtSDTPlacas_Invd_placapadre ;
   }

   public void setgxTv_SdtSDTPlacas_Invd_placapadre( String value )
   {
      gxTv_SdtSDTPlacas_Invd_placapadre = value ;
   }

   public String getgxTv_SdtSDTPlacas_Invd_esplacapadre( )
   {
      return gxTv_SdtSDTPlacas_Invd_esplacapadre ;
   }

   public void setgxTv_SdtSDTPlacas_Invd_esplacapadre( String value )
   {
      gxTv_SdtSDTPlacas_Invd_esplacapadre = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTPlacas_Otros_costos_dev( )
   {
      return gxTv_SdtSDTPlacas_Otros_costos_dev ;
   }

   public void setgxTv_SdtSDTPlacas_Otros_costos_dev( java.math.BigDecimal value )
   {
      gxTv_SdtSDTPlacas_Otros_costos_dev = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTPlacas_Costo_desmante( )
   {
      return gxTv_SdtSDTPlacas_Costo_desmante ;
   }

   public void setgxTv_SdtSDTPlacas_Costo_desmante( java.math.BigDecimal value )
   {
      gxTv_SdtSDTPlacas_Costo_desmante = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTPlacas_Variable_vf( )
   {
      return gxTv_SdtSDTPlacas_Variable_vf ;
   }

   public void setgxTv_SdtSDTPlacas_Variable_vf( java.math.BigDecimal value )
   {
      gxTv_SdtSDTPlacas_Variable_vf = value ;
   }

   public short getgxTv_SdtSDTPlacas_Variable_i( )
   {
      return gxTv_SdtSDTPlacas_Variable_i ;
   }

   public void setgxTv_SdtSDTPlacas_Variable_i( short value )
   {
      gxTv_SdtSDTPlacas_Variable_i = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTPlacas_Costo_total_dev( )
   {
      return gxTv_SdtSDTPlacas_Costo_total_dev ;
   }

   public void setgxTv_SdtSDTPlacas_Costo_total_dev( java.math.BigDecimal value )
   {
      gxTv_SdtSDTPlacas_Costo_total_dev = value ;
   }

   public short getgxTv_SdtSDTPlacas_Variable_n( )
   {
      return gxTv_SdtSDTPlacas_Variable_n ;
   }

   public void setgxTv_SdtSDTPlacas_Variable_n( short value )
   {
      gxTv_SdtSDTPlacas_Variable_n = value ;
   }

   public short getgxTv_SdtSDTPlacas_Vida_util_inicial( )
   {
      return gxTv_SdtSDTPlacas_Vida_util_inicial ;
   }

   public void setgxTv_SdtSDTPlacas_Vida_util_inicial( short value )
   {
      gxTv_SdtSDTPlacas_Vida_util_inicial = value ;
   }

   public short getgxTv_SdtSDTPlacas_Vida_util_actual( )
   {
      return gxTv_SdtSDTPlacas_Vida_util_actual ;
   }

   public void setgxTv_SdtSDTPlacas_Vida_util_actual( short value )
   {
      gxTv_SdtSDTPlacas_Vida_util_actual = value ;
   }

   public String getgxTv_SdtSDTPlacas_Marca( )
   {
      return gxTv_SdtSDTPlacas_Marca ;
   }

   public void setgxTv_SdtSDTPlacas_Marca( String value )
   {
      gxTv_SdtSDTPlacas_Marca = value ;
   }

   public String getgxTv_SdtSDTPlacas_Modelo( )
   {
      return gxTv_SdtSDTPlacas_Modelo ;
   }

   public void setgxTv_SdtSDTPlacas_Modelo( String value )
   {
      gxTv_SdtSDTPlacas_Modelo = value ;
   }

   public String getgxTv_SdtSDTPlacas_Serial( )
   {
      return gxTv_SdtSDTPlacas_Serial ;
   }

   public void setgxTv_SdtSDTPlacas_Serial( String value )
   {
      gxTv_SdtSDTPlacas_Serial = value ;
   }

   public String getgxTv_SdtSDTPlacas_Observaciones( )
   {
      return gxTv_SdtSDTPlacas_Observaciones ;
   }

   public void setgxTv_SdtSDTPlacas_Observaciones( String value )
   {
      gxTv_SdtSDTPlacas_Observaciones = value ;
   }

   public long getgxTv_SdtSDTPlacas_Tran_entrada( )
   {
      return gxTv_SdtSDTPlacas_Tran_entrada ;
   }

   public void setgxTv_SdtSDTPlacas_Tran_entrada( long value )
   {
      gxTv_SdtSDTPlacas_Tran_entrada = value ;
   }

   public int getgxTv_SdtSDTPlacas_Nro_linea( )
   {
      return gxTv_SdtSDTPlacas_Nro_linea ;
   }

   public void setgxTv_SdtSDTPlacas_Nro_linea( int value )
   {
      gxTv_SdtSDTPlacas_Nro_linea = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTPlacas_Elem_consecutivo = "" ;
      gxTv_SdtSDTPlacas_Cata_descripcion = "" ;
      gxTv_SdtSDTPlacas_Invd_numeroplaca = "" ;
      gxTv_SdtSDTPlacas_Invd_valoradquisicion = DecimalUtil.ZERO ;
      gxTv_SdtSDTPlacas_Invd_placapadre = "" ;
      gxTv_SdtSDTPlacas_Invd_esplacapadre = "" ;
      gxTv_SdtSDTPlacas_Otros_costos_dev = DecimalUtil.ZERO ;
      gxTv_SdtSDTPlacas_Costo_desmante = DecimalUtil.ZERO ;
      gxTv_SdtSDTPlacas_Variable_vf = DecimalUtil.ZERO ;
      gxTv_SdtSDTPlacas_Costo_total_dev = DecimalUtil.ZERO ;
      gxTv_SdtSDTPlacas_Marca = "" ;
      gxTv_SdtSDTPlacas_Modelo = "" ;
      gxTv_SdtSDTPlacas_Serial = "" ;
      gxTv_SdtSDTPlacas_Observaciones = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTPlacas Clone( )
   {
      return (com.orions2.SdtSDTPlacas)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTPlacas struct )
   {
      setgxTv_SdtSDTPlacas_Elem_consecutivo(struct.getElem_consecutivo());
      setgxTv_SdtSDTPlacas_Cata_descripcion(struct.getCata_descripcion());
      setgxTv_SdtSDTPlacas_Invd_numeroplaca(struct.getInvd_numeroplaca());
      setgxTv_SdtSDTPlacas_Invd_valoradquisicion(struct.getInvd_valoradquisicion());
      setgxTv_SdtSDTPlacas_Invd_placapadre(struct.getInvd_placapadre());
      setgxTv_SdtSDTPlacas_Invd_esplacapadre(struct.getInvd_esplacapadre());
      setgxTv_SdtSDTPlacas_Otros_costos_dev(struct.getOtros_costos_dev());
      setgxTv_SdtSDTPlacas_Costo_desmante(struct.getCosto_desmante());
      setgxTv_SdtSDTPlacas_Variable_vf(struct.getVariable_vf());
      setgxTv_SdtSDTPlacas_Variable_i(struct.getVariable_i());
      setgxTv_SdtSDTPlacas_Costo_total_dev(struct.getCosto_total_dev());
      setgxTv_SdtSDTPlacas_Variable_n(struct.getVariable_n());
      setgxTv_SdtSDTPlacas_Vida_util_inicial(struct.getVida_util_inicial());
      setgxTv_SdtSDTPlacas_Vida_util_actual(struct.getVida_util_actual());
      setgxTv_SdtSDTPlacas_Marca(struct.getMarca());
      setgxTv_SdtSDTPlacas_Modelo(struct.getModelo());
      setgxTv_SdtSDTPlacas_Serial(struct.getSerial());
      setgxTv_SdtSDTPlacas_Observaciones(struct.getObservaciones());
      setgxTv_SdtSDTPlacas_Tran_entrada(struct.getTran_entrada());
      setgxTv_SdtSDTPlacas_Nro_linea(struct.getNro_linea());
   }

   public com.orions2.StructSdtSDTPlacas getStruct( )
   {
      com.orions2.StructSdtSDTPlacas struct = new com.orions2.StructSdtSDTPlacas ();
      struct.setElem_consecutivo(getgxTv_SdtSDTPlacas_Elem_consecutivo());
      struct.setCata_descripcion(getgxTv_SdtSDTPlacas_Cata_descripcion());
      struct.setInvd_numeroplaca(getgxTv_SdtSDTPlacas_Invd_numeroplaca());
      struct.setInvd_valoradquisicion(getgxTv_SdtSDTPlacas_Invd_valoradquisicion());
      struct.setInvd_placapadre(getgxTv_SdtSDTPlacas_Invd_placapadre());
      struct.setInvd_esplacapadre(getgxTv_SdtSDTPlacas_Invd_esplacapadre());
      struct.setOtros_costos_dev(getgxTv_SdtSDTPlacas_Otros_costos_dev());
      struct.setCosto_desmante(getgxTv_SdtSDTPlacas_Costo_desmante());
      struct.setVariable_vf(getgxTv_SdtSDTPlacas_Variable_vf());
      struct.setVariable_i(getgxTv_SdtSDTPlacas_Variable_i());
      struct.setCosto_total_dev(getgxTv_SdtSDTPlacas_Costo_total_dev());
      struct.setVariable_n(getgxTv_SdtSDTPlacas_Variable_n());
      struct.setVida_util_inicial(getgxTv_SdtSDTPlacas_Vida_util_inicial());
      struct.setVida_util_actual(getgxTv_SdtSDTPlacas_Vida_util_actual());
      struct.setMarca(getgxTv_SdtSDTPlacas_Marca());
      struct.setModelo(getgxTv_SdtSDTPlacas_Modelo());
      struct.setSerial(getgxTv_SdtSDTPlacas_Serial());
      struct.setObservaciones(getgxTv_SdtSDTPlacas_Observaciones());
      struct.setTran_entrada(getgxTv_SdtSDTPlacas_Tran_entrada());
      struct.setNro_linea(getgxTv_SdtSDTPlacas_Nro_linea());
      return struct ;
   }

   protected short gxTv_SdtSDTPlacas_Variable_i ;
   protected short gxTv_SdtSDTPlacas_Variable_n ;
   protected short gxTv_SdtSDTPlacas_Vida_util_inicial ;
   protected short gxTv_SdtSDTPlacas_Vida_util_actual ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTPlacas_Nro_linea ;
   protected long gxTv_SdtSDTPlacas_Tran_entrada ;
   protected java.math.BigDecimal gxTv_SdtSDTPlacas_Invd_valoradquisicion ;
   protected java.math.BigDecimal gxTv_SdtSDTPlacas_Otros_costos_dev ;
   protected java.math.BigDecimal gxTv_SdtSDTPlacas_Costo_desmante ;
   protected java.math.BigDecimal gxTv_SdtSDTPlacas_Variable_vf ;
   protected java.math.BigDecimal gxTv_SdtSDTPlacas_Costo_total_dev ;
   protected String gxTv_SdtSDTPlacas_Invd_esplacapadre ;
   protected String sTagName ;
   protected String gxTv_SdtSDTPlacas_Elem_consecutivo ;
   protected String gxTv_SdtSDTPlacas_Cata_descripcion ;
   protected String gxTv_SdtSDTPlacas_Invd_numeroplaca ;
   protected String gxTv_SdtSDTPlacas_Invd_placapadre ;
   protected String gxTv_SdtSDTPlacas_Marca ;
   protected String gxTv_SdtSDTPlacas_Modelo ;
   protected String gxTv_SdtSDTPlacas_Serial ;
   protected String gxTv_SdtSDTPlacas_Observaciones ;
}

