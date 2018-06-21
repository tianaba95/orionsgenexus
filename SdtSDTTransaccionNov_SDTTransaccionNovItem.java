/*
               File: SdtSDTTransaccionNov_SDTTransaccionNovItem
        Description: SDTTransaccionNov
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: April 13, 2018 14:7:54.2
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

public final  class SdtSDTTransaccionNov_SDTTransaccionNovItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTTransaccionNov_SDTTransaccionNovItem( )
   {
      this(  new ModelContext(SdtSDTTransaccionNov_SDTTransaccionNovItem.class));
   }

   public SdtSDTTransaccionNov_SDTTransaccionNovItem( ModelContext context )
   {
      super( context, "SdtSDTTransaccionNov_SDTTransaccionNovItem");
   }

   public SdtSDTTransaccionNov_SDTTransaccionNovItem( int remoteHandle ,
                                                      ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTTransaccionNov_SDTTransaccionNovItem");
   }

   public SdtSDTTransaccionNov_SDTTransaccionNovItem( StructSdtSDTTransaccionNov_SDTTransaccionNovItem struct )
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
               gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_ConsecutivoChar") )
            {
               gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_consecutivochar = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CentroCostoCodigo") )
            {
               gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_centrocostocodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CentroCostoDescripcion") )
            {
               gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_centrocostodescripcion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_RegionCodigo") )
            {
               gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_regioncodigo = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_RegionDescripcion") )
            {
               gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_regiondescripcion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CodigoMovimiento") )
            {
               gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codigomovimiento = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_DescripcionMovimiento") )
            {
               gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_descripcionmovimiento = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_ModuloOrigen") )
            {
               gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_moduloorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CodAlmaOrigen") )
            {
               gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codalmaorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CodBodeOrigen") )
            {
               gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codbodeorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CedulaCuentadanteOrigen") )
            {
               gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_cedulacuentadanteorigen = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_NombCuentadanteOrigen") )
            {
               gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombcuentadanteorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CedulaProveedor") )
            {
               gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_cedulaproveedor = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_NombreProveedor") )
            {
               gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombreproveedor = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_ModuloDestino") )
            {
               gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_modulodestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CodAlmaDestino") )
            {
               gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codalmadestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CodBodeDestino") )
            {
               gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codbodedestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CedulaCuentadanteDestino") )
            {
               gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_cedulacuentadantedestino = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_NombCuentadanteDestino") )
            {
               gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombcuentadantedestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_ConsecutivoCC") )
            {
               gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_consecutivocc = GXutil.lval( oReader.getValue()) ;
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
         sName = "SDTTransaccionNov.SDTTransaccionNovItem" ;
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
      oWriter.writeElement("Tran_Id", GXutil.trim( GXutil.str( gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_id, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_ConsecutivoChar", GXutil.rtrim( gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_consecutivochar));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CentroCostoCodigo", GXutil.rtrim( gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_centrocostocodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CentroCostoDescripcion", GXutil.rtrim( gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_centrocostodescripcion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_RegionCodigo", GXutil.trim( GXutil.str( gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_regioncodigo, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_RegionDescripcion", GXutil.rtrim( gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_regiondescripcion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CodigoMovimiento", GXutil.rtrim( gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codigomovimiento));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_DescripcionMovimiento", GXutil.rtrim( gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_descripcionmovimiento));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_ModuloOrigen", GXutil.rtrim( gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_moduloorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CodAlmaOrigen", GXutil.rtrim( gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codalmaorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CodBodeOrigen", GXutil.rtrim( gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codbodeorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CedulaCuentadanteOrigen", GXutil.trim( GXutil.str( gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_cedulacuentadanteorigen, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_NombCuentadanteOrigen", GXutil.rtrim( gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombcuentadanteorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CedulaProveedor", GXutil.trim( GXutil.str( gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_cedulaproveedor, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_NombreProveedor", GXutil.rtrim( gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombreproveedor));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_ModuloDestino", GXutil.rtrim( gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_modulodestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CodAlmaDestino", GXutil.rtrim( gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codalmadestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CodBodeDestino", GXutil.rtrim( gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codbodedestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CedulaCuentadanteDestino", GXutil.trim( GXutil.str( gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_cedulacuentadantedestino, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_NombCuentadanteDestino", GXutil.rtrim( gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombcuentadantedestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_ConsecutivoCC", GXutil.trim( GXutil.str( gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_consecutivocc, 18, 0)));
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
      AddObjectProperty("Tran_Id", gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_id, false);
      AddObjectProperty("Tran_ConsecutivoChar", gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_consecutivochar, false);
      AddObjectProperty("Tran_CentroCostoCodigo", gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_centrocostocodigo, false);
      AddObjectProperty("Tran_CentroCostoDescripcion", gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_centrocostodescripcion, false);
      AddObjectProperty("Tran_RegionCodigo", gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_regioncodigo, false);
      AddObjectProperty("Tran_RegionDescripcion", gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_regiondescripcion, false);
      AddObjectProperty("Tran_CodigoMovimiento", gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codigomovimiento, false);
      AddObjectProperty("Tran_DescripcionMovimiento", gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_descripcionmovimiento, false);
      AddObjectProperty("Tran_ModuloOrigen", gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_moduloorigen, false);
      AddObjectProperty("Tran_CodAlmaOrigen", gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codalmaorigen, false);
      AddObjectProperty("Tran_CodBodeOrigen", gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codbodeorigen, false);
      AddObjectProperty("Tran_CedulaCuentadanteOrigen", GXutil.ltrim( GXutil.str( gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_cedulacuentadanteorigen, 18, 0)), false);
      AddObjectProperty("Tran_NombCuentadanteOrigen", gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombcuentadanteorigen, false);
      AddObjectProperty("Tran_CedulaProveedor", GXutil.ltrim( GXutil.str( gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_cedulaproveedor, 18, 0)), false);
      AddObjectProperty("Tran_NombreProveedor", gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombreproveedor, false);
      AddObjectProperty("Tran_ModuloDestino", gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_modulodestino, false);
      AddObjectProperty("Tran_CodAlmaDestino", gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codalmadestino, false);
      AddObjectProperty("Tran_CodBodeDestino", gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codbodedestino, false);
      AddObjectProperty("Tran_CedulaCuentadanteDestino", GXutil.ltrim( GXutil.str( gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_cedulacuentadantedestino, 18, 0)), false);
      AddObjectProperty("Tran_NombCuentadanteDestino", gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombcuentadantedestino, false);
      AddObjectProperty("Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_consecutivocc, 18, 0)), false);
   }

   public long getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_id( )
   {
      return gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_id ;
   }

   public void setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_id( long value )
   {
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_id = value ;
   }

   public String getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_consecutivochar( )
   {
      return gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_consecutivochar ;
   }

   public void setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_consecutivochar( String value )
   {
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_consecutivochar = value ;
   }

   public String getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_centrocostocodigo( )
   {
      return gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_centrocostocodigo ;
   }

   public void setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_centrocostocodigo( String value )
   {
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_centrocostocodigo = value ;
   }

   public String getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_centrocostodescripcion( )
   {
      return gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_centrocostodescripcion ;
   }

   public void setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_centrocostodescripcion( String value )
   {
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_centrocostodescripcion = value ;
   }

   public short getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_regioncodigo( )
   {
      return gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_regioncodigo ;
   }

   public void setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_regioncodigo( short value )
   {
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_regioncodigo = value ;
   }

   public String getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_regiondescripcion( )
   {
      return gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_regiondescripcion ;
   }

   public void setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_regiondescripcion( String value )
   {
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_regiondescripcion = value ;
   }

   public String getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codigomovimiento( )
   {
      return gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codigomovimiento ;
   }

   public void setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codigomovimiento( String value )
   {
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codigomovimiento = value ;
   }

   public String getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_descripcionmovimiento( )
   {
      return gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_descripcionmovimiento ;
   }

   public void setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_descripcionmovimiento( String value )
   {
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_descripcionmovimiento = value ;
   }

   public String getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_moduloorigen( )
   {
      return gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_moduloorigen ;
   }

   public void setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_moduloorigen( String value )
   {
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_moduloorigen = value ;
   }

   public String getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codalmaorigen( )
   {
      return gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codalmaorigen ;
   }

   public void setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codalmaorigen( String value )
   {
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codalmaorigen = value ;
   }

   public String getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codbodeorigen( )
   {
      return gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codbodeorigen ;
   }

   public void setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codbodeorigen( String value )
   {
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codbodeorigen = value ;
   }

   public long getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_cedulacuentadanteorigen( )
   {
      return gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_cedulacuentadanteorigen ;
   }

   public void setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_cedulacuentadanteorigen( long value )
   {
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_cedulacuentadanteorigen = value ;
   }

   public String getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombcuentadanteorigen( )
   {
      return gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombcuentadanteorigen ;
   }

   public void setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombcuentadanteorigen( String value )
   {
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombcuentadanteorigen = value ;
   }

   public long getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_cedulaproveedor( )
   {
      return gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_cedulaproveedor ;
   }

   public void setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_cedulaproveedor( long value )
   {
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_cedulaproveedor = value ;
   }

   public String getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombreproveedor( )
   {
      return gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombreproveedor ;
   }

   public void setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombreproveedor( String value )
   {
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombreproveedor = value ;
   }

   public String getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_modulodestino( )
   {
      return gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_modulodestino ;
   }

   public void setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_modulodestino( String value )
   {
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_modulodestino = value ;
   }

   public String getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codalmadestino( )
   {
      return gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codalmadestino ;
   }

   public void setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codalmadestino( String value )
   {
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codalmadestino = value ;
   }

   public String getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codbodedestino( )
   {
      return gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codbodedestino ;
   }

   public void setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codbodedestino( String value )
   {
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codbodedestino = value ;
   }

   public long getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_cedulacuentadantedestino( )
   {
      return gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_cedulacuentadantedestino ;
   }

   public void setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_cedulacuentadantedestino( long value )
   {
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_cedulacuentadantedestino = value ;
   }

   public String getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombcuentadantedestino( )
   {
      return gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombcuentadantedestino ;
   }

   public void setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombcuentadantedestino( String value )
   {
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombcuentadantedestino = value ;
   }

   public long getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_consecutivocc( )
   {
      return gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_consecutivocc ;
   }

   public void setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_consecutivocc( long value )
   {
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_consecutivocc = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_consecutivochar = "" ;
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_centrocostocodigo = "" ;
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_centrocostodescripcion = "" ;
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_regiondescripcion = "" ;
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codigomovimiento = "" ;
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_descripcionmovimiento = "" ;
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_moduloorigen = "" ;
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codalmaorigen = "" ;
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codbodeorigen = "" ;
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombcuentadanteorigen = "" ;
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombreproveedor = "" ;
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_modulodestino = "" ;
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codalmadestino = "" ;
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codbodedestino = "" ;
      gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombcuentadantedestino = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTTransaccionNov_SDTTransaccionNovItem Clone( )
   {
      return (com.orions2.SdtSDTTransaccionNov_SDTTransaccionNovItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTTransaccionNov_SDTTransaccionNovItem struct )
   {
      setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_id(struct.getTran_id());
      setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_consecutivochar(struct.getTran_consecutivochar());
      setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_centrocostocodigo(struct.getTran_centrocostocodigo());
      setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_centrocostodescripcion(struct.getTran_centrocostodescripcion());
      setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_regioncodigo(struct.getTran_regioncodigo());
      setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_regiondescripcion(struct.getTran_regiondescripcion());
      setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codigomovimiento(struct.getTran_codigomovimiento());
      setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_descripcionmovimiento(struct.getTran_descripcionmovimiento());
      setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_moduloorigen(struct.getTran_moduloorigen());
      setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codalmaorigen(struct.getTran_codalmaorigen());
      setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codbodeorigen(struct.getTran_codbodeorigen());
      setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_cedulacuentadanteorigen(struct.getTran_cedulacuentadanteorigen());
      setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombcuentadanteorigen(struct.getTran_nombcuentadanteorigen());
      setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_cedulaproveedor(struct.getTran_cedulaproveedor());
      setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombreproveedor(struct.getTran_nombreproveedor());
      setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_modulodestino(struct.getTran_modulodestino());
      setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codalmadestino(struct.getTran_codalmadestino());
      setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codbodedestino(struct.getTran_codbodedestino());
      setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_cedulacuentadantedestino(struct.getTran_cedulacuentadantedestino());
      setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombcuentadantedestino(struct.getTran_nombcuentadantedestino());
      setgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_consecutivocc(struct.getTran_consecutivocc());
   }

   public com.orions2.StructSdtSDTTransaccionNov_SDTTransaccionNovItem getStruct( )
   {
      com.orions2.StructSdtSDTTransaccionNov_SDTTransaccionNovItem struct = new com.orions2.StructSdtSDTTransaccionNov_SDTTransaccionNovItem ();
      struct.setTran_id(getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_id());
      struct.setTran_consecutivochar(getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_consecutivochar());
      struct.setTran_centrocostocodigo(getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_centrocostocodigo());
      struct.setTran_centrocostodescripcion(getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_centrocostodescripcion());
      struct.setTran_regioncodigo(getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_regioncodigo());
      struct.setTran_regiondescripcion(getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_regiondescripcion());
      struct.setTran_codigomovimiento(getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codigomovimiento());
      struct.setTran_descripcionmovimiento(getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_descripcionmovimiento());
      struct.setTran_moduloorigen(getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_moduloorigen());
      struct.setTran_codalmaorigen(getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codalmaorigen());
      struct.setTran_codbodeorigen(getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codbodeorigen());
      struct.setTran_cedulacuentadanteorigen(getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_cedulacuentadanteorigen());
      struct.setTran_nombcuentadanteorigen(getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombcuentadanteorigen());
      struct.setTran_cedulaproveedor(getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_cedulaproveedor());
      struct.setTran_nombreproveedor(getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombreproveedor());
      struct.setTran_modulodestino(getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_modulodestino());
      struct.setTran_codalmadestino(getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codalmadestino());
      struct.setTran_codbodedestino(getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codbodedestino());
      struct.setTran_cedulacuentadantedestino(getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_cedulacuentadantedestino());
      struct.setTran_nombcuentadantedestino(getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombcuentadantedestino());
      struct.setTran_consecutivocc(getgxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_consecutivocc());
      return struct ;
   }

   protected short gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_regioncodigo ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_id ;
   protected long gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_cedulacuentadanteorigen ;
   protected long gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_cedulaproveedor ;
   protected long gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_cedulacuentadantedestino ;
   protected long gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_consecutivocc ;
   protected String sTagName ;
   protected String gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_consecutivochar ;
   protected String gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_centrocostocodigo ;
   protected String gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_centrocostodescripcion ;
   protected String gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_regiondescripcion ;
   protected String gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codigomovimiento ;
   protected String gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_descripcionmovimiento ;
   protected String gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_moduloorigen ;
   protected String gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codalmaorigen ;
   protected String gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codbodeorigen ;
   protected String gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombcuentadanteorigen ;
   protected String gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombreproveedor ;
   protected String gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_modulodestino ;
   protected String gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codalmadestino ;
   protected String gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_codbodedestino ;
   protected String gxTv_SdtSDTTransaccionNov_SDTTransaccionNovItem_Tran_nombcuentadantedestino ;
}

