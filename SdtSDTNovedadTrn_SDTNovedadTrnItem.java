/*
               File: SdtSDTNovedadTrn_SDTNovedadTrnItem
        Description: SDTNovedadTrn
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:19.3
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

public final  class SdtSDTNovedadTrn_SDTNovedadTrnItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTNovedadTrn_SDTNovedadTrnItem( )
   {
      this(  new ModelContext(SdtSDTNovedadTrn_SDTNovedadTrnItem.class));
   }

   public SdtSDTNovedadTrn_SDTNovedadTrnItem( ModelContext context )
   {
      super( context, "SdtSDTNovedadTrn_SDTNovedadTrnItem");
   }

   public SdtSDTNovedadTrn_SDTNovedadTrnItem( int remoteHandle ,
                                              ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTNovedadTrn_SDTNovedadTrnItem");
   }

   public SdtSDTNovedadTrn_SDTNovedadTrnItem( StructSdtSDTNovedadTrn_SDTNovedadTrnItem struct )
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
               gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_identificador = GXutil.lval( oReader.getValue()) ;
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
                  gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_fecharegistro = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_fecharegistro = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nove_TransId") )
            {
               gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_transid = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nove_TranCC") )
            {
               gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_trancc = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TNov_Codigo") )
            {
               gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_codigo = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TNov_Descripcion") )
            {
               gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_descripcion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nove_Soporte") )
            {
               gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_soporte=GXutil.blobFromBase64( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nove_ValorAntiguo") )
            {
               gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valorantiguo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nove_ValorNuevo") )
            {
               gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valornuevo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TNov_Nombre_Campo") )
            {
               gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_nombre_campo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Valor_Antiguo") )
            {
               gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_antiguo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Valor_Nuevo") )
            {
               gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_nuevo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TNov_Tipo") )
            {
               gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_tipo = oReader.getValue() ;
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
         sName = "SDTNovedadTrn.SDTNovedadTrnItem" ;
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
      oWriter.writeElement("Nove_Identificador", GXutil.trim( GXutil.str( gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_identificador, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_fecharegistro) )
      {
         oWriter.writeStartElement("Nove_FechaRegistro");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_fecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_fecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_fecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_fecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_fecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_fecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Nove_FechaRegistro", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
      }
      oWriter.writeElement("Nove_TransId", GXutil.trim( GXutil.str( gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_transid, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Nove_TranCC", GXutil.trim( GXutil.str( gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_trancc, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TNov_Codigo", GXutil.trim( GXutil.str( gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_codigo, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TNov_Descripcion", GXutil.rtrim( gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_descripcion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Nove_Soporte", GXutil.blobToBase64( gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_soporte));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Nove_ValorAntiguo", GXutil.rtrim( gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valorantiguo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Nove_ValorNuevo", GXutil.rtrim( gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valornuevo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TNov_Nombre_Campo", GXutil.rtrim( gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_nombre_campo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Valor_Antiguo", GXutil.rtrim( gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_antiguo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Valor_Nuevo", GXutil.rtrim( gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_nuevo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TNov_Tipo", GXutil.rtrim( gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_tipo));
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
      AddObjectProperty("Nove_Identificador", gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_identificador, false);
      datetime_STZ = gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_fecharegistro ;
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
      AddObjectProperty("Nove_TransId", gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_transid, false);
      AddObjectProperty("Nove_TranCC", GXutil.ltrim( GXutil.str( gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_trancc, 18, 0)), false);
      AddObjectProperty("TNov_Codigo", gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_codigo, false);
      AddObjectProperty("TNov_Descripcion", gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_descripcion, false);
      AddObjectProperty("Nove_Soporte", gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_soporte, false);
      AddObjectProperty("Nove_ValorAntiguo", gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valorantiguo, false);
      AddObjectProperty("Nove_ValorNuevo", gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valornuevo, false);
      AddObjectProperty("TNov_Nombre_Campo", gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_nombre_campo, false);
      AddObjectProperty("Valor_Antiguo", gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_antiguo, false);
      AddObjectProperty("Valor_Nuevo", gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_nuevo, false);
      AddObjectProperty("TNov_Tipo", gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_tipo, false);
   }

   public long getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_identificador( )
   {
      return gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_identificador ;
   }

   public void setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_identificador( long value )
   {
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_identificador = value ;
   }

   public java.util.Date getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_fecharegistro( )
   {
      return gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_fecharegistro ;
   }

   public void setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_fecharegistro( java.util.Date value )
   {
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_fecharegistro = value ;
   }

   public long getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_transid( )
   {
      return gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_transid ;
   }

   public void setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_transid( long value )
   {
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_transid = value ;
   }

   public long getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_trancc( )
   {
      return gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_trancc ;
   }

   public void setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_trancc( long value )
   {
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_trancc = value ;
   }

   public int getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_codigo( )
   {
      return gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_codigo ;
   }

   public void setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_codigo( int value )
   {
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_codigo = value ;
   }

   public String getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_descripcion( )
   {
      return gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_descripcion ;
   }

   public void setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_descripcion( String value )
   {
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_descripcion = value ;
   }

   @GxUpload
   public String getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_soporte( )
   {
      return gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_soporte ;
   }

   public void setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_soporte( String value )
   {
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_soporte = value ;
   }

   public String getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valorantiguo( )
   {
      return gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valorantiguo ;
   }

   public void setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valorantiguo( String value )
   {
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valorantiguo = value ;
   }

   public String getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valornuevo( )
   {
      return gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valornuevo ;
   }

   public void setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valornuevo( String value )
   {
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valornuevo = value ;
   }

   public String getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_nombre_campo( )
   {
      return gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_nombre_campo ;
   }

   public void setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_nombre_campo( String value )
   {
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_nombre_campo = value ;
   }

   public String getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_antiguo( )
   {
      return gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_antiguo ;
   }

   public void setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_antiguo( String value )
   {
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_antiguo = value ;
   }

   public String getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_nuevo( )
   {
      return gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_nuevo ;
   }

   public void setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_nuevo( String value )
   {
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_nuevo = value ;
   }

   public String getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_tipo( )
   {
      return gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_tipo ;
   }

   public void setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_tipo( String value )
   {
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_tipo = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_fecharegistro = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_descripcion = "" ;
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_soporte = "" ;
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valorantiguo = "" ;
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valornuevo = "" ;
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_nombre_campo = "" ;
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_antiguo = "" ;
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_nuevo = "" ;
      gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_tipo = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem Clone( )
   {
      return (com.orions2.SdtSDTNovedadTrn_SDTNovedadTrnItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTNovedadTrn_SDTNovedadTrnItem struct )
   {
      setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_identificador(struct.getNove_identificador());
      setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_fecharegistro(struct.getNove_fecharegistro());
      setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_transid(struct.getNove_transid());
      setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_trancc(struct.getNove_trancc());
      setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_codigo(struct.getTnov_codigo());
      setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_descripcion(struct.getTnov_descripcion());
      setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_soporte(struct.getNove_soporte());
      setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valorantiguo(struct.getNove_valorantiguo());
      setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valornuevo(struct.getNove_valornuevo());
      setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_nombre_campo(struct.getTnov_nombre_campo());
      setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_antiguo(struct.getValor_antiguo());
      setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_nuevo(struct.getValor_nuevo());
      setgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_tipo(struct.getTnov_tipo());
   }

   public com.orions2.StructSdtSDTNovedadTrn_SDTNovedadTrnItem getStruct( )
   {
      com.orions2.StructSdtSDTNovedadTrn_SDTNovedadTrnItem struct = new com.orions2.StructSdtSDTNovedadTrn_SDTNovedadTrnItem ();
      struct.setNove_identificador(getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_identificador());
      struct.setNove_fecharegistro(getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_fecharegistro());
      struct.setNove_transid(getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_transid());
      struct.setNove_trancc(getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_trancc());
      struct.setTnov_codigo(getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_codigo());
      struct.setTnov_descripcion(getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_descripcion());
      struct.setNove_soporte(getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_soporte());
      struct.setNove_valorantiguo(getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valorantiguo());
      struct.setNove_valornuevo(getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valornuevo());
      struct.setTnov_nombre_campo(getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_nombre_campo());
      struct.setValor_antiguo(getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_antiguo());
      struct.setValor_nuevo(getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_nuevo());
      struct.setTnov_tipo(getgxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_tipo());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_codigo ;
   protected long gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_identificador ;
   protected long gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_transid ;
   protected long gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_trancc ;
   protected String gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_antiguo ;
   protected String gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Valor_nuevo ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_fecharegistro ;
   protected java.util.Date datetime_STZ ;
   protected String gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_soporte ;
   protected String gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_descripcion ;
   protected String gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valorantiguo ;
   protected String gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Nove_valornuevo ;
   protected String gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_nombre_campo ;
   protected String gxTv_SdtSDTNovedadTrn_SDTNovedadTrnItem_Tnov_tipo ;
}

