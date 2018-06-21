/*
               File: SdtSDTHVTraza_SDTHVTrazaItem
        Description: SDTHVTraza
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:18.33
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

public final  class SdtSDTHVTraza_SDTHVTrazaItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTHVTraza_SDTHVTrazaItem( )
   {
      this(  new ModelContext(SdtSDTHVTraza_SDTHVTrazaItem.class));
   }

   public SdtSDTHVTraza_SDTHVTrazaItem( ModelContext context )
   {
      super( context, "SdtSDTHVTraza_SDTHVTrazaItem");
   }

   public SdtSDTHVTraza_SDTHVTrazaItem( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTHVTraza_SDTHVTrazaItem");
   }

   public SdtSDTHVTraza_SDTHVTrazaItem( StructSdtSDTHVTraza_SDTHVTrazaItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "gTran_CentroCostoCodigo") )
            {
               gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_centrocostocodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "gTran_CodigoMovimiento") )
            {
               gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_codigomovimiento = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "gTran_DescripcionMovimiento") )
            {
               gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_descripcionmovimiento = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "gTran_ConsecutivoCC") )
            {
               gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_consecutivocc = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "gTran_FechaRegistro") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_fecharegistro = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_fecharegistro = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "gTran_IdCuentadanteDestino") )
            {
               gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_idcuentadantedestino = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "gTran_CedulaCuentadanteDestino") )
            {
               gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_cedulacuentadantedestino = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "gTran_NombCuentadanteDestino") )
            {
               gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_nombcuentadantedestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "gTran_Estado") )
            {
               gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_estado = oReader.getValue() ;
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
         sName = "SDTHVTraza.SDTHVTrazaItem" ;
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
      oWriter.writeElement("gTran_CentroCostoCodigo", GXutil.rtrim( gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_centrocostocodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("gTran_CodigoMovimiento", GXutil.rtrim( gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_codigomovimiento));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("gTran_DescripcionMovimiento", GXutil.rtrim( gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_descripcionmovimiento));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("gTran_ConsecutivoCC", GXutil.trim( GXutil.str( gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_consecutivocc, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_fecharegistro) )
      {
         oWriter.writeStartElement("gTran_FechaRegistro");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_fecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_fecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_fecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_fecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_fecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_fecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("gTran_FechaRegistro", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
      }
      oWriter.writeElement("gTran_IdCuentadanteDestino", GXutil.trim( GXutil.str( gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_idcuentadantedestino, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("gTran_CedulaCuentadanteDestino", GXutil.trim( GXutil.str( gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_cedulacuentadantedestino, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("gTran_NombCuentadanteDestino", GXutil.rtrim( gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_nombcuentadantedestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("gTran_Estado", GXutil.rtrim( gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_estado));
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
      AddObjectProperty("gTran_CentroCostoCodigo", gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_centrocostocodigo, false);
      AddObjectProperty("gTran_CodigoMovimiento", gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_codigomovimiento, false);
      AddObjectProperty("gTran_DescripcionMovimiento", gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_descripcionmovimiento, false);
      AddObjectProperty("gTran_ConsecutivoCC", GXutil.ltrim( GXutil.str( gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_consecutivocc, 18, 0)), false);
      datetime_STZ = gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_fecharegistro ;
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
      AddObjectProperty("gTran_FechaRegistro", sDateCnv, false);
      AddObjectProperty("gTran_IdCuentadanteDestino", GXutil.ltrim( GXutil.str( gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_idcuentadantedestino, 18, 0)), false);
      AddObjectProperty("gTran_CedulaCuentadanteDestino", GXutil.ltrim( GXutil.str( gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_cedulacuentadantedestino, 18, 0)), false);
      AddObjectProperty("gTran_NombCuentadanteDestino", gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_nombcuentadantedestino, false);
      AddObjectProperty("gTran_Estado", gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_estado, false);
   }

   public String getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_centrocostocodigo( )
   {
      return gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_centrocostocodigo ;
   }

   public void setgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_centrocostocodigo( String value )
   {
      gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_centrocostocodigo = value ;
   }

   public String getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_codigomovimiento( )
   {
      return gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_codigomovimiento ;
   }

   public void setgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_codigomovimiento( String value )
   {
      gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_codigomovimiento = value ;
   }

   public String getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_descripcionmovimiento( )
   {
      return gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_descripcionmovimiento ;
   }

   public void setgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_descripcionmovimiento( String value )
   {
      gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_descripcionmovimiento = value ;
   }

   public long getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_consecutivocc( )
   {
      return gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_consecutivocc ;
   }

   public void setgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_consecutivocc( long value )
   {
      gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_consecutivocc = value ;
   }

   public java.util.Date getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_fecharegistro( )
   {
      return gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_fecharegistro ;
   }

   public void setgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_fecharegistro( java.util.Date value )
   {
      gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_fecharegistro = value ;
   }

   public long getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_idcuentadantedestino( )
   {
      return gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_idcuentadantedestino ;
   }

   public void setgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_idcuentadantedestino( long value )
   {
      gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_idcuentadantedestino = value ;
   }

   public long getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_cedulacuentadantedestino( )
   {
      return gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_cedulacuentadantedestino ;
   }

   public void setgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_cedulacuentadantedestino( long value )
   {
      gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_cedulacuentadantedestino = value ;
   }

   public String getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_nombcuentadantedestino( )
   {
      return gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_nombcuentadantedestino ;
   }

   public void setgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_nombcuentadantedestino( String value )
   {
      gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_nombcuentadantedestino = value ;
   }

   public String getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_estado( )
   {
      return gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_estado ;
   }

   public void setgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_estado( String value )
   {
      gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_estado = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_centrocostocodigo = "" ;
      gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_codigomovimiento = "" ;
      gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_descripcionmovimiento = "" ;
      gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_fecharegistro = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_nombcuentadantedestino = "" ;
      gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_estado = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public com.orions2.SdtSDTHVTraza_SDTHVTrazaItem Clone( )
   {
      return (com.orions2.SdtSDTHVTraza_SDTHVTrazaItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTHVTraza_SDTHVTrazaItem struct )
   {
      setgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_centrocostocodigo(struct.getGtran_centrocostocodigo());
      setgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_codigomovimiento(struct.getGtran_codigomovimiento());
      setgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_descripcionmovimiento(struct.getGtran_descripcionmovimiento());
      setgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_consecutivocc(struct.getGtran_consecutivocc());
      setgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_fecharegistro(struct.getGtran_fecharegistro());
      setgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_idcuentadantedestino(struct.getGtran_idcuentadantedestino());
      setgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_cedulacuentadantedestino(struct.getGtran_cedulacuentadantedestino());
      setgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_nombcuentadantedestino(struct.getGtran_nombcuentadantedestino());
      setgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_estado(struct.getGtran_estado());
   }

   public com.orions2.StructSdtSDTHVTraza_SDTHVTrazaItem getStruct( )
   {
      com.orions2.StructSdtSDTHVTraza_SDTHVTrazaItem struct = new com.orions2.StructSdtSDTHVTraza_SDTHVTrazaItem ();
      struct.setGtran_centrocostocodigo(getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_centrocostocodigo());
      struct.setGtran_codigomovimiento(getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_codigomovimiento());
      struct.setGtran_descripcionmovimiento(getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_descripcionmovimiento());
      struct.setGtran_consecutivocc(getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_consecutivocc());
      struct.setGtran_fecharegistro(getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_fecharegistro());
      struct.setGtran_idcuentadantedestino(getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_idcuentadantedestino());
      struct.setGtran_cedulacuentadantedestino(getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_cedulacuentadantedestino());
      struct.setGtran_nombcuentadantedestino(getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_nombcuentadantedestino());
      struct.setGtran_estado(getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_estado());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_consecutivocc ;
   protected long gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_idcuentadantedestino ;
   protected long gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_cedulacuentadantedestino ;
   protected String gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_estado ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_fecharegistro ;
   protected java.util.Date datetime_STZ ;
   protected String gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_centrocostocodigo ;
   protected String gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_codigomovimiento ;
   protected String gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_descripcionmovimiento ;
   protected String gxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_nombcuentadantedestino ;
}

