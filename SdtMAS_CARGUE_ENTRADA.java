/*
               File: SdtMAS_CARGUE_ENTRADA
        Description: MAS_CARGUE_ENTRADA
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:29.46
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

public final  class SdtMAS_CARGUE_ENTRADA extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtMAS_CARGUE_ENTRADA( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtMAS_CARGUE_ENTRADA.class));
   }

   public SdtMAS_CARGUE_ENTRADA( int remoteHandle ,
                                 ModelContext context )
   {
      super( context, "SdtMAS_CARGUE_ENTRADA");
      initialize( remoteHandle) ;
   }

   public SdtMAS_CARGUE_ENTRADA( int remoteHandle ,
                                 StructSdtMAS_CARGUE_ENTRADA struct )
   {
      this(remoteHandle);
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

   public void Load( long AV83NROTRANSACCION ,
                     short AV84IDCARMAS )
   {
      IGxSilentTrn obj ;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {new Long(AV83NROTRANSACCION),new Short(AV84IDCARMAS)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"NROTRANSACCION", long.class}, new Object[]{"IDCARMAS", short.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties() ;
      metadata.set("Name", "MAS_CARGUE_ENTRADA");
      metadata.set("BT", "MAS_CARGUE_ENTRADA");
      metadata.set("PK", "[ \"NROTRANSACCION\",\"IDCARMAS\" ]");
      metadata.set("AllowInsert", "True");
      metadata.set("AllowUpdate", "True");
      metadata.set("AllowDelete", "True");
      return metadata ;
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "NROTRANSACCION") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "IDCARMAS") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CONSECUTIVOENTRADA") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "COSTOADQUISICION") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DESCRIPCIONENTRADA") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CANTIDADENTRADA") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "INDICADORPHI") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VALORFUTURO") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TIEMPO") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Tiempo = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "INTERES") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Interes = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VIDAUTIL") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Vidautil = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OTROSCOSTOS") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MARCA") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Marca = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MODELO") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Modelo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SERIAL") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Serial = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Mode = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Initialized = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NROTRANSACCION_Z") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "IDCARMAS_Z") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CONSECUTIVOENTRADA_Z") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "COSTOADQUISICION_Z") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DESCRIPCIONENTRADA_Z") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CANTIDADENTRADA_Z") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_Z = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "INDICADORPHI_Z") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VALORFUTURO_Z") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TIEMPO_Z") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Tiempo_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "INTERES_Z") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Interes_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VIDAUTIL_Z") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Vidautil_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OTROSCOSTOS_Z") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MARCA_Z") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Marca_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MODELO_Z") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Modelo_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SERIAL_Z") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Serial_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CONSECUTIVOENTRADA_N") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "COSTOADQUISICION_N") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DESCRIPCIONENTRADA_N") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CANTIDADENTRADA_N") )
            {
               gxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_N = (byte)(GXutil.lval( oReader.getValue())) ;
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
         sName = "MAS_CARGUE_ENTRADA" ;
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
      oWriter.writeElement("NROTRANSACCION", GXutil.trim( GXutil.str( gxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("IDCARMAS", GXutil.trim( GXutil.str( gxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("CONSECUTIVOENTRADA", GXutil.rtrim( gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("COSTOADQUISICION", GXutil.trim( GXutil.strNoRound( gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("DESCRIPCIONENTRADA", GXutil.rtrim( gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("CANTIDADENTRADA", GXutil.trim( GXutil.str( gxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("INDICADORPHI", GXutil.trim( GXutil.str( gxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("VALORFUTURO", GXutil.trim( GXutil.strNoRound( gxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TIEMPO", GXutil.trim( GXutil.str( gxTv_SdtMAS_CARGUE_ENTRADA_Tiempo, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("INTERES", GXutil.trim( GXutil.strNoRound( gxTv_SdtMAS_CARGUE_ENTRADA_Interes, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("VIDAUTIL", GXutil.trim( GXutil.str( gxTv_SdtMAS_CARGUE_ENTRADA_Vidautil, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("OTROSCOSTOS", GXutil.trim( GXutil.strNoRound( gxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("MARCA", GXutil.rtrim( gxTv_SdtMAS_CARGUE_ENTRADA_Marca));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("MODELO", GXutil.rtrim( gxTv_SdtMAS_CARGUE_ENTRADA_Modelo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("SERIAL", GXutil.rtrim( gxTv_SdtMAS_CARGUE_ENTRADA_Serial));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtMAS_CARGUE_ENTRADA_Mode));
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtMAS_CARGUE_ENTRADA_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
         oWriter.writeElement("NROTRANSACCION_Z", GXutil.trim( GXutil.str( gxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion_Z, 11, 0)));
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
         oWriter.writeElement("IDCARMAS_Z", GXutil.trim( GXutil.str( gxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
         oWriter.writeElement("CONSECUTIVOENTRADA_Z", GXutil.rtrim( gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_Z));
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
         oWriter.writeElement("COSTOADQUISICION_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_Z, 18, 2)));
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
         oWriter.writeElement("DESCRIPCIONENTRADA_Z", GXutil.rtrim( gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_Z));
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
         oWriter.writeElement("CANTIDADENTRADA_Z", GXutil.trim( GXutil.str( gxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
         oWriter.writeElement("INDICADORPHI_Z", GXutil.trim( GXutil.str( gxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
         oWriter.writeElement("VALORFUTURO_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo_Z, 18, 2)));
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
         oWriter.writeElement("TIEMPO_Z", GXutil.trim( GXutil.str( gxTv_SdtMAS_CARGUE_ENTRADA_Tiempo_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
         oWriter.writeElement("INTERES_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtMAS_CARGUE_ENTRADA_Interes_Z, 6, 2)));
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
         oWriter.writeElement("VIDAUTIL_Z", GXutil.trim( GXutil.str( gxTv_SdtMAS_CARGUE_ENTRADA_Vidautil_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
         oWriter.writeElement("OTROSCOSTOS_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos_Z, 18, 2)));
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
         oWriter.writeElement("MARCA_Z", GXutil.rtrim( gxTv_SdtMAS_CARGUE_ENTRADA_Marca_Z));
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
         oWriter.writeElement("MODELO_Z", GXutil.rtrim( gxTv_SdtMAS_CARGUE_ENTRADA_Modelo_Z));
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
         oWriter.writeElement("SERIAL_Z", GXutil.rtrim( gxTv_SdtMAS_CARGUE_ENTRADA_Serial_Z));
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
         oWriter.writeElement("CONSECUTIVOENTRADA_N", GXutil.trim( GXutil.str( gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
         oWriter.writeElement("COSTOADQUISICION_N", GXutil.trim( GXutil.str( gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
         oWriter.writeElement("DESCRIPCIONENTRADA_N", GXutil.trim( GXutil.str( gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
         oWriter.writeElement("CANTIDADENTRADA_N", GXutil.trim( GXutil.str( gxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("NROTRANSACCION", gxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion, false);
      AddObjectProperty("IDCARMAS", gxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas, false);
      AddObjectProperty("CONSECUTIVOENTRADA", gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada, false);
      AddObjectProperty("COSTOADQUISICION", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion, 18, 2)), false);
      AddObjectProperty("DESCRIPCIONENTRADA", gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada, false);
      AddObjectProperty("CANTIDADENTRADA", gxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada, false);
      AddObjectProperty("INDICADORPHI", gxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi, false);
      AddObjectProperty("VALORFUTURO", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo, 18, 2)), false);
      AddObjectProperty("TIEMPO", gxTv_SdtMAS_CARGUE_ENTRADA_Tiempo, false);
      AddObjectProperty("INTERES", gxTv_SdtMAS_CARGUE_ENTRADA_Interes, false);
      AddObjectProperty("VIDAUTIL", gxTv_SdtMAS_CARGUE_ENTRADA_Vidautil, false);
      AddObjectProperty("OTROSCOSTOS", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos, 18, 2)), false);
      AddObjectProperty("MARCA", gxTv_SdtMAS_CARGUE_ENTRADA_Marca, false);
      AddObjectProperty("MODELO", gxTv_SdtMAS_CARGUE_ENTRADA_Modelo, false);
      AddObjectProperty("SERIAL", gxTv_SdtMAS_CARGUE_ENTRADA_Serial, false);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtMAS_CARGUE_ENTRADA_Mode, false);
         AddObjectProperty("Initialized", gxTv_SdtMAS_CARGUE_ENTRADA_Initialized, false);
         AddObjectProperty("NROTRANSACCION_Z", gxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion_Z, false);
         AddObjectProperty("IDCARMAS_Z", gxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas_Z, false);
         AddObjectProperty("CONSECUTIVOENTRADA_Z", gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_Z, false);
         AddObjectProperty("COSTOADQUISICION_Z", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_Z, 18, 2)), false);
         AddObjectProperty("DESCRIPCIONENTRADA_Z", gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_Z, false);
         AddObjectProperty("CANTIDADENTRADA_Z", gxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_Z, false);
         AddObjectProperty("INDICADORPHI_Z", gxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi_Z, false);
         AddObjectProperty("VALORFUTURO_Z", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo_Z, 18, 2)), false);
         AddObjectProperty("TIEMPO_Z", gxTv_SdtMAS_CARGUE_ENTRADA_Tiempo_Z, false);
         AddObjectProperty("INTERES_Z", gxTv_SdtMAS_CARGUE_ENTRADA_Interes_Z, false);
         AddObjectProperty("VIDAUTIL_Z", gxTv_SdtMAS_CARGUE_ENTRADA_Vidautil_Z, false);
         AddObjectProperty("OTROSCOSTOS_Z", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos_Z, 18, 2)), false);
         AddObjectProperty("MARCA_Z", gxTv_SdtMAS_CARGUE_ENTRADA_Marca_Z, false);
         AddObjectProperty("MODELO_Z", gxTv_SdtMAS_CARGUE_ENTRADA_Modelo_Z, false);
         AddObjectProperty("SERIAL_Z", gxTv_SdtMAS_CARGUE_ENTRADA_Serial_Z, false);
         AddObjectProperty("CONSECUTIVOENTRADA_N", gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_N, false);
         AddObjectProperty("COSTOADQUISICION_N", gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_N, false);
         AddObjectProperty("DESCRIPCIONENTRADA_N", gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_N, false);
         AddObjectProperty("CANTIDADENTRADA_N", gxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_N, false);
      }
   }

   public void updateDirties( com.orions2.SdtMAS_CARGUE_ENTRADA sdt )
   {
      if ( sdt.IsDirty("NROTRANSACCION") )
      {
         gxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion = sdt.getgxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion() ;
      }
      if ( sdt.IsDirty("IDCARMAS") )
      {
         gxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas = sdt.getgxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas() ;
      }
      if ( sdt.IsDirty("CONSECUTIVOENTRADA") )
      {
         gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada = sdt.getgxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada() ;
      }
      if ( sdt.IsDirty("COSTOADQUISICION") )
      {
         gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion = sdt.getgxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion() ;
      }
      if ( sdt.IsDirty("DESCRIPCIONENTRADA") )
      {
         gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada = sdt.getgxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada() ;
      }
      if ( sdt.IsDirty("CANTIDADENTRADA") )
      {
         gxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada = sdt.getgxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada() ;
      }
      if ( sdt.IsDirty("INDICADORPHI") )
      {
         gxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi = sdt.getgxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi() ;
      }
      if ( sdt.IsDirty("VALORFUTURO") )
      {
         gxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo = sdt.getgxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo() ;
      }
      if ( sdt.IsDirty("TIEMPO") )
      {
         gxTv_SdtMAS_CARGUE_ENTRADA_Tiempo = sdt.getgxTv_SdtMAS_CARGUE_ENTRADA_Tiempo() ;
      }
      if ( sdt.IsDirty("INTERES") )
      {
         gxTv_SdtMAS_CARGUE_ENTRADA_Interes = sdt.getgxTv_SdtMAS_CARGUE_ENTRADA_Interes() ;
      }
      if ( sdt.IsDirty("VIDAUTIL") )
      {
         gxTv_SdtMAS_CARGUE_ENTRADA_Vidautil = sdt.getgxTv_SdtMAS_CARGUE_ENTRADA_Vidautil() ;
      }
      if ( sdt.IsDirty("OTROSCOSTOS") )
      {
         gxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos = sdt.getgxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos() ;
      }
      if ( sdt.IsDirty("MARCA") )
      {
         gxTv_SdtMAS_CARGUE_ENTRADA_Marca = sdt.getgxTv_SdtMAS_CARGUE_ENTRADA_Marca() ;
      }
      if ( sdt.IsDirty("MODELO") )
      {
         gxTv_SdtMAS_CARGUE_ENTRADA_Modelo = sdt.getgxTv_SdtMAS_CARGUE_ENTRADA_Modelo() ;
      }
      if ( sdt.IsDirty("SERIAL") )
      {
         gxTv_SdtMAS_CARGUE_ENTRADA_Serial = sdt.getgxTv_SdtMAS_CARGUE_ENTRADA_Serial() ;
      }
   }

   public long getgxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion( long value )
   {
      if ( gxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion != value )
      {
         gxTv_SdtMAS_CARGUE_ENTRADA_Mode = "INS" ;
         this.setgxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_ENTRADA_Tiempo_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_ENTRADA_Interes_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_ENTRADA_Vidautil_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_ENTRADA_Marca_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_ENTRADA_Modelo_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_ENTRADA_Serial_Z_SetNull( );
      }
      SetDirty("Nrotransaccion");
      gxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion = value ;
   }

   public short getgxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas( short value )
   {
      if ( gxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas != value )
      {
         gxTv_SdtMAS_CARGUE_ENTRADA_Mode = "INS" ;
         this.setgxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_ENTRADA_Tiempo_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_ENTRADA_Interes_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_ENTRADA_Vidautil_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_ENTRADA_Marca_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_ENTRADA_Modelo_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_ENTRADA_Serial_Z_SetNull( );
      }
      SetDirty("Idcarmas");
      gxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas = value ;
   }

   public String getgxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada( String value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_N = (byte)(0) ;
      SetDirty("Consecutivoentrada");
      gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_N = (byte)(1) ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada = "" ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion( java.math.BigDecimal value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_N = (byte)(0) ;
      SetDirty("Costoadquisicion");
      gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_N = (byte)(1) ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion = DecimalUtil.ZERO ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada( String value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_N = (byte)(0) ;
      SetDirty("Descripcionentrada");
      gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_N = (byte)(1) ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada = "" ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada( int value )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_N = (byte)(0) ;
      SetDirty("Cantidadentrada");
      gxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_N = (byte)(1) ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada = 0 ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi( short value )
   {
      SetDirty("Indicadorphi");
      gxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi = value ;
   }

   public java.math.BigDecimal getgxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo( java.math.BigDecimal value )
   {
      SetDirty("Valorfuturo");
      gxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo = value ;
   }

   public short getgxTv_SdtMAS_CARGUE_ENTRADA_Tiempo( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Tiempo ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Tiempo( short value )
   {
      SetDirty("Tiempo");
      gxTv_SdtMAS_CARGUE_ENTRADA_Tiempo = value ;
   }

   public java.math.BigDecimal getgxTv_SdtMAS_CARGUE_ENTRADA_Interes( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Interes ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Interes( java.math.BigDecimal value )
   {
      SetDirty("Interes");
      gxTv_SdtMAS_CARGUE_ENTRADA_Interes = value ;
   }

   public short getgxTv_SdtMAS_CARGUE_ENTRADA_Vidautil( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Vidautil ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Vidautil( short value )
   {
      SetDirty("Vidautil");
      gxTv_SdtMAS_CARGUE_ENTRADA_Vidautil = value ;
   }

   public java.math.BigDecimal getgxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos( java.math.BigDecimal value )
   {
      SetDirty("Otroscostos");
      gxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos = value ;
   }

   public String getgxTv_SdtMAS_CARGUE_ENTRADA_Marca( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Marca ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Marca( String value )
   {
      SetDirty("Marca");
      gxTv_SdtMAS_CARGUE_ENTRADA_Marca = value ;
   }

   public String getgxTv_SdtMAS_CARGUE_ENTRADA_Modelo( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Modelo ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Modelo( String value )
   {
      SetDirty("Modelo");
      gxTv_SdtMAS_CARGUE_ENTRADA_Modelo = value ;
   }

   public String getgxTv_SdtMAS_CARGUE_ENTRADA_Serial( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Serial ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Serial( String value )
   {
      SetDirty("Serial");
      gxTv_SdtMAS_CARGUE_ENTRADA_Serial = value ;
   }

   public String getgxTv_SdtMAS_CARGUE_ENTRADA_Mode( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Mode ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Mode( String value )
   {
      SetDirty("Mode");
      gxTv_SdtMAS_CARGUE_ENTRADA_Mode = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Mode_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Mode = "" ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_ENTRADA_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtMAS_CARGUE_ENTRADA_Initialized( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Initialized ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Initialized( short value )
   {
      SetDirty("Initialized");
      gxTv_SdtMAS_CARGUE_ENTRADA_Initialized = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Initialized_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_ENTRADA_Initialized_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion_Z( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion_Z ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion_Z( long value )
   {
      SetDirty("Nrotransaccion_Z");
      gxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion_Z = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion_Z_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion_Z = 0 ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas_Z( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas_Z ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas_Z( short value )
   {
      SetDirty("Idcarmas_Z");
      gxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas_Z = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas_Z_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_Z( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_Z ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_Z( String value )
   {
      SetDirty("Consecutivoentrada_Z");
      gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_Z = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_Z_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_Z = "" ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_Z( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_Z ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_Z( java.math.BigDecimal value )
   {
      SetDirty("Costoadquisicion_Z");
      gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_Z = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_Z_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_Z = DecimalUtil.ZERO ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_Z( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_Z ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_Z( String value )
   {
      SetDirty("Descripcionentrada_Z");
      gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_Z = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_Z_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_Z = "" ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_Z( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_Z ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_Z( int value )
   {
      SetDirty("Cantidadentrada_Z");
      gxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_Z = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_Z_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_Z = 0 ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi_Z( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi_Z ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi_Z( short value )
   {
      SetDirty("Indicadorphi_Z");
      gxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi_Z = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi_Z_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo_Z( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo_Z ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo_Z( java.math.BigDecimal value )
   {
      SetDirty("Valorfuturo_Z");
      gxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo_Z = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo_Z_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo_Z = DecimalUtil.ZERO ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtMAS_CARGUE_ENTRADA_Tiempo_Z( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Tiempo_Z ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Tiempo_Z( short value )
   {
      SetDirty("Tiempo_Z");
      gxTv_SdtMAS_CARGUE_ENTRADA_Tiempo_Z = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Tiempo_Z_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Tiempo_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_ENTRADA_Tiempo_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtMAS_CARGUE_ENTRADA_Interes_Z( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Interes_Z ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Interes_Z( java.math.BigDecimal value )
   {
      SetDirty("Interes_Z");
      gxTv_SdtMAS_CARGUE_ENTRADA_Interes_Z = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Interes_Z_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Interes_Z = DecimalUtil.ZERO ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_ENTRADA_Interes_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtMAS_CARGUE_ENTRADA_Vidautil_Z( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Vidautil_Z ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Vidautil_Z( short value )
   {
      SetDirty("Vidautil_Z");
      gxTv_SdtMAS_CARGUE_ENTRADA_Vidautil_Z = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Vidautil_Z_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Vidautil_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_ENTRADA_Vidautil_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos_Z( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos_Z ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos_Z( java.math.BigDecimal value )
   {
      SetDirty("Otroscostos_Z");
      gxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos_Z = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos_Z_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos_Z = DecimalUtil.ZERO ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtMAS_CARGUE_ENTRADA_Marca_Z( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Marca_Z ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Marca_Z( String value )
   {
      SetDirty("Marca_Z");
      gxTv_SdtMAS_CARGUE_ENTRADA_Marca_Z = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Marca_Z_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Marca_Z = "" ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_ENTRADA_Marca_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtMAS_CARGUE_ENTRADA_Modelo_Z( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Modelo_Z ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Modelo_Z( String value )
   {
      SetDirty("Modelo_Z");
      gxTv_SdtMAS_CARGUE_ENTRADA_Modelo_Z = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Modelo_Z_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Modelo_Z = "" ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_ENTRADA_Modelo_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtMAS_CARGUE_ENTRADA_Serial_Z( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Serial_Z ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Serial_Z( String value )
   {
      SetDirty("Serial_Z");
      gxTv_SdtMAS_CARGUE_ENTRADA_Serial_Z = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Serial_Z_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Serial_Z = "" ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_ENTRADA_Serial_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_N( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_N ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_N( byte value )
   {
      SetDirty("Consecutivoentrada_N");
      gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_N = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_N_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_N( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_N ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_N( byte value )
   {
      SetDirty("Costoadquisicion_N");
      gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_N = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_N_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_N( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_N ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_N( byte value )
   {
      SetDirty("Descripcionentrada_N");
      gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_N = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_N_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_N( )
   {
      return gxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_N ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_N( byte value )
   {
      SetDirty("Cantidadentrada_N");
      gxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_N = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_N_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      com.orions2.mas_cargue_entrada_bc obj ;
      obj = new com.orions2.mas_cargue_entrada_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada = "" ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion = DecimalUtil.ZERO ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada = "" ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo = DecimalUtil.ZERO ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Interes = DecimalUtil.ZERO ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos = DecimalUtil.ZERO ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Marca = "" ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Modelo = "" ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Serial = "" ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Mode = "" ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_Z = "" ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_Z = DecimalUtil.ZERO ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_Z = "" ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo_Z = DecimalUtil.ZERO ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Interes_Z = DecimalUtil.ZERO ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos_Z = DecimalUtil.ZERO ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Marca_Z = "" ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Modelo_Z = "" ;
      gxTv_SdtMAS_CARGUE_ENTRADA_Serial_Z = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtMAS_CARGUE_ENTRADA Clone( )
   {
      com.orions2.SdtMAS_CARGUE_ENTRADA sdt ;
      com.orions2.mas_cargue_entrada_bc obj ;
      sdt = (com.orions2.SdtMAS_CARGUE_ENTRADA)(clone()) ;
      obj = (com.orions2.mas_cargue_entrada_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( com.orions2.StructSdtMAS_CARGUE_ENTRADA struct )
   {
      setgxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion(struct.getNrotransaccion());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas(struct.getIdcarmas());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada(struct.getConsecutivoentrada());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion(struct.getCostoadquisicion());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada(struct.getDescripcionentrada());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada(struct.getCantidadentrada());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi(struct.getIndicadorphi());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo(struct.getValorfuturo());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Tiempo(struct.getTiempo());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Interes(struct.getInteres());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Vidautil(struct.getVidautil());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos(struct.getOtroscostos());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Marca(struct.getMarca());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Modelo(struct.getModelo());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Serial(struct.getSerial());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Mode(struct.getMode());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Initialized(struct.getInitialized());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion_Z(struct.getNrotransaccion_Z());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas_Z(struct.getIdcarmas_Z());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_Z(struct.getConsecutivoentrada_Z());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_Z(struct.getCostoadquisicion_Z());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_Z(struct.getDescripcionentrada_Z());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_Z(struct.getCantidadentrada_Z());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi_Z(struct.getIndicadorphi_Z());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo_Z(struct.getValorfuturo_Z());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Tiempo_Z(struct.getTiempo_Z());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Interes_Z(struct.getInteres_Z());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Vidautil_Z(struct.getVidautil_Z());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos_Z(struct.getOtroscostos_Z());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Marca_Z(struct.getMarca_Z());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Modelo_Z(struct.getModelo_Z());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Serial_Z(struct.getSerial_Z());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_N(struct.getConsecutivoentrada_N());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_N(struct.getCostoadquisicion_N());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_N(struct.getDescripcionentrada_N());
      setgxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_N(struct.getCantidadentrada_N());
   }

   public com.orions2.StructSdtMAS_CARGUE_ENTRADA getStruct( )
   {
      com.orions2.StructSdtMAS_CARGUE_ENTRADA struct = new com.orions2.StructSdtMAS_CARGUE_ENTRADA ();
      struct.setNrotransaccion(getgxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion());
      struct.setIdcarmas(getgxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas());
      struct.setConsecutivoentrada(getgxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada());
      struct.setCostoadquisicion(getgxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion());
      struct.setDescripcionentrada(getgxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada());
      struct.setCantidadentrada(getgxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada());
      struct.setIndicadorphi(getgxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi());
      struct.setValorfuturo(getgxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo());
      struct.setTiempo(getgxTv_SdtMAS_CARGUE_ENTRADA_Tiempo());
      struct.setInteres(getgxTv_SdtMAS_CARGUE_ENTRADA_Interes());
      struct.setVidautil(getgxTv_SdtMAS_CARGUE_ENTRADA_Vidautil());
      struct.setOtroscostos(getgxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos());
      struct.setMarca(getgxTv_SdtMAS_CARGUE_ENTRADA_Marca());
      struct.setModelo(getgxTv_SdtMAS_CARGUE_ENTRADA_Modelo());
      struct.setSerial(getgxTv_SdtMAS_CARGUE_ENTRADA_Serial());
      struct.setMode(getgxTv_SdtMAS_CARGUE_ENTRADA_Mode());
      struct.setInitialized(getgxTv_SdtMAS_CARGUE_ENTRADA_Initialized());
      struct.setNrotransaccion_Z(getgxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion_Z());
      struct.setIdcarmas_Z(getgxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas_Z());
      struct.setConsecutivoentrada_Z(getgxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_Z());
      struct.setCostoadquisicion_Z(getgxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_Z());
      struct.setDescripcionentrada_Z(getgxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_Z());
      struct.setCantidadentrada_Z(getgxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_Z());
      struct.setIndicadorphi_Z(getgxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi_Z());
      struct.setValorfuturo_Z(getgxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo_Z());
      struct.setTiempo_Z(getgxTv_SdtMAS_CARGUE_ENTRADA_Tiempo_Z());
      struct.setInteres_Z(getgxTv_SdtMAS_CARGUE_ENTRADA_Interes_Z());
      struct.setVidautil_Z(getgxTv_SdtMAS_CARGUE_ENTRADA_Vidautil_Z());
      struct.setOtroscostos_Z(getgxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos_Z());
      struct.setMarca_Z(getgxTv_SdtMAS_CARGUE_ENTRADA_Marca_Z());
      struct.setModelo_Z(getgxTv_SdtMAS_CARGUE_ENTRADA_Modelo_Z());
      struct.setSerial_Z(getgxTv_SdtMAS_CARGUE_ENTRADA_Serial_Z());
      struct.setConsecutivoentrada_N(getgxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_N());
      struct.setCostoadquisicion_N(getgxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_N());
      struct.setDescripcionentrada_N(getgxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_N());
      struct.setCantidadentrada_N(getgxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_N());
      return struct ;
   }

   private byte gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_N ;
   private byte gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_N ;
   private byte gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_N ;
   private byte gxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_N ;
   private short gxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas ;
   private short gxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi ;
   private short gxTv_SdtMAS_CARGUE_ENTRADA_Tiempo ;
   private short gxTv_SdtMAS_CARGUE_ENTRADA_Vidautil ;
   private short gxTv_SdtMAS_CARGUE_ENTRADA_Initialized ;
   private short gxTv_SdtMAS_CARGUE_ENTRADA_Idcarmas_Z ;
   private short gxTv_SdtMAS_CARGUE_ENTRADA_Indicadorphi_Z ;
   private short gxTv_SdtMAS_CARGUE_ENTRADA_Tiempo_Z ;
   private short gxTv_SdtMAS_CARGUE_ENTRADA_Vidautil_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada ;
   private int gxTv_SdtMAS_CARGUE_ENTRADA_Cantidadentrada_Z ;
   private long gxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion ;
   private long gxTv_SdtMAS_CARGUE_ENTRADA_Nrotransaccion_Z ;
   private java.math.BigDecimal gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion ;
   private java.math.BigDecimal gxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo ;
   private java.math.BigDecimal gxTv_SdtMAS_CARGUE_ENTRADA_Interes ;
   private java.math.BigDecimal gxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos ;
   private java.math.BigDecimal gxTv_SdtMAS_CARGUE_ENTRADA_Costoadquisicion_Z ;
   private java.math.BigDecimal gxTv_SdtMAS_CARGUE_ENTRADA_Valorfuturo_Z ;
   private java.math.BigDecimal gxTv_SdtMAS_CARGUE_ENTRADA_Interes_Z ;
   private java.math.BigDecimal gxTv_SdtMAS_CARGUE_ENTRADA_Otroscostos_Z ;
   private String gxTv_SdtMAS_CARGUE_ENTRADA_Mode ;
   private String sTagName ;
   private String gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada ;
   private String gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada ;
   private String gxTv_SdtMAS_CARGUE_ENTRADA_Marca ;
   private String gxTv_SdtMAS_CARGUE_ENTRADA_Modelo ;
   private String gxTv_SdtMAS_CARGUE_ENTRADA_Serial ;
   private String gxTv_SdtMAS_CARGUE_ENTRADA_Consecutivoentrada_Z ;
   private String gxTv_SdtMAS_CARGUE_ENTRADA_Descripcionentrada_Z ;
   private String gxTv_SdtMAS_CARGUE_ENTRADA_Marca_Z ;
   private String gxTv_SdtMAS_CARGUE_ENTRADA_Modelo_Z ;
   private String gxTv_SdtMAS_CARGUE_ENTRADA_Serial_Z ;
}

