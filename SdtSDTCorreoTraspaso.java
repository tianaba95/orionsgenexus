/*
               File: SdtSDTCorreoTraspaso
        Description: SDTCorreoTraspaso
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:17.7
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

public final  class SdtSDTCorreoTraspaso extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTCorreoTraspaso( )
   {
      this(  new ModelContext(SdtSDTCorreoTraspaso.class));
   }

   public SdtSDTCorreoTraspaso( ModelContext context )
   {
      super( context, "SdtSDTCorreoTraspaso");
   }

   public SdtSDTCorreoTraspaso( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTCorreoTraspaso");
   }

   public SdtSDTCorreoTraspaso( StructSdtSDTCorreoTraspaso struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "nombCuentadanteOrigen") )
            {
               gxTv_SdtSDTCorreoTraspaso_Nombcuentadanteorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "fechaRatificacion") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTCorreoTraspaso_Fecharatificacion = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtSDTCorreoTraspaso_Fecharatificacion = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "descripcionMovimiento") )
            {
               gxTv_SdtSDTCorreoTraspaso_Descripcionmovimiento = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "indicadorMovimiento") )
            {
               gxTv_SdtSDTCorreoTraspaso_Indicadormovimiento = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranId") )
            {
               gxTv_SdtSDTCorreoTraspaso_Tranid = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranRegionalOrigen") )
            {
               gxTv_SdtSDTCorreoTraspaso_Tranregionalorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranRegionalDestino") )
            {
               gxTv_SdtSDTCorreoTraspaso_Tranregionaldestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranCentroCostoDescripcionOrigen") )
            {
               gxTv_SdtSDTCorreoTraspaso_Trancentrocostodescripcionorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranCentroCostoDescripcionDestino") )
            {
               gxTv_SdtSDTCorreoTraspaso_Trancentrocostodescripciondestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranValorTransaccion") )
            {
               gxTv_SdtSDTCorreoTraspaso_Tranvalortransaccion = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "emails") )
            {
               if ( gxTv_SdtSDTCorreoTraspaso_Emails == null )
               {
                  gxTv_SdtSDTCorreoTraspaso_Emails = new GXBaseCollection<com.orions2.SdtSDTCorreoTraspaso_emailsItem>(com.orions2.SdtSDTCorreoTraspaso_emailsItem.class, "SDTCorreoTraspaso.emailsItem", "ACBSENA", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTCorreoTraspaso_Emails.readxmlcollection(oReader, "emails", "emailsItem") ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "cantidad") )
            {
               if ( gxTv_SdtSDTCorreoTraspaso_Cantidad == null )
               {
                  gxTv_SdtSDTCorreoTraspaso_Cantidad = new GXBaseCollection<com.orions2.SdtSDTCorreoTraspaso_cantidadItem>(com.orions2.SdtSDTCorreoTraspaso_cantidadItem.class, "SDTCorreoTraspaso.cantidadItem", "ACBSENA", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTCorreoTraspaso_Cantidad.readxmlcollection(oReader, "cantidad", "cantidadItem") ;
               }
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
         sName = "SDTCorreoTraspaso" ;
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
      oWriter.writeElement("nombCuentadanteOrigen", GXutil.rtrim( gxTv_SdtSDTCorreoTraspaso_Nombcuentadanteorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTCorreoTraspaso_Fecharatificacion) )
      {
         oWriter.writeStartElement("fechaRatificacion");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTCorreoTraspaso_Fecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTCorreoTraspaso_Fecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTCorreoTraspaso_Fecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSDTCorreoTraspaso_Fecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSDTCorreoTraspaso_Fecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSDTCorreoTraspaso_Fecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("fechaRatificacion", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
      }
      oWriter.writeElement("descripcionMovimiento", GXutil.rtrim( gxTv_SdtSDTCorreoTraspaso_Descripcionmovimiento));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("indicadorMovimiento", GXutil.rtrim( gxTv_SdtSDTCorreoTraspaso_Indicadormovimiento));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranId", GXutil.trim( GXutil.str( gxTv_SdtSDTCorreoTraspaso_Tranid, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranRegionalOrigen", GXutil.rtrim( gxTv_SdtSDTCorreoTraspaso_Tranregionalorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranRegionalDestino", GXutil.rtrim( gxTv_SdtSDTCorreoTraspaso_Tranregionaldestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranCentroCostoDescripcionOrigen", GXutil.rtrim( gxTv_SdtSDTCorreoTraspaso_Trancentrocostodescripcionorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranCentroCostoDescripcionDestino", GXutil.rtrim( gxTv_SdtSDTCorreoTraspaso_Trancentrocostodescripciondestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranValorTransaccion", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTCorreoTraspaso_Tranvalortransaccion, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( gxTv_SdtSDTCorreoTraspaso_Emails != null )
      {
         String sNameSpace1 ;
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "ACBSENA" ;
         }
         else
         {
            sNameSpace1 = "ACBSENA" ;
         }
         gxTv_SdtSDTCorreoTraspaso_Emails.writexmlcollection(oWriter, "emails", sNameSpace1, "emailsItem", sNameSpace1);
      }
      if ( gxTv_SdtSDTCorreoTraspaso_Cantidad != null )
      {
         String sNameSpace1 ;
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "ACBSENA" ;
         }
         else
         {
            sNameSpace1 = "ACBSENA" ;
         }
         gxTv_SdtSDTCorreoTraspaso_Cantidad.writexmlcollection(oWriter, "cantidad", sNameSpace1, "cantidadItem", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("nombCuentadanteOrigen", gxTv_SdtSDTCorreoTraspaso_Nombcuentadanteorigen, false);
      datetime_STZ = gxTv_SdtSDTCorreoTraspaso_Fecharatificacion ;
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
      AddObjectProperty("fechaRatificacion", sDateCnv, false);
      AddObjectProperty("descripcionMovimiento", gxTv_SdtSDTCorreoTraspaso_Descripcionmovimiento, false);
      AddObjectProperty("indicadorMovimiento", gxTv_SdtSDTCorreoTraspaso_Indicadormovimiento, false);
      AddObjectProperty("tranId", gxTv_SdtSDTCorreoTraspaso_Tranid, false);
      AddObjectProperty("tranRegionalOrigen", gxTv_SdtSDTCorreoTraspaso_Tranregionalorigen, false);
      AddObjectProperty("tranRegionalDestino", gxTv_SdtSDTCorreoTraspaso_Tranregionaldestino, false);
      AddObjectProperty("tranCentroCostoDescripcionOrigen", gxTv_SdtSDTCorreoTraspaso_Trancentrocostodescripcionorigen, false);
      AddObjectProperty("tranCentroCostoDescripcionDestino", gxTv_SdtSDTCorreoTraspaso_Trancentrocostodescripciondestino, false);
      AddObjectProperty("tranValorTransaccion", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSDTCorreoTraspaso_Tranvalortransaccion, 18, 2)), false);
      if ( gxTv_SdtSDTCorreoTraspaso_Emails != null )
      {
         AddObjectProperty("emails", gxTv_SdtSDTCorreoTraspaso_Emails, false);
      }
      if ( gxTv_SdtSDTCorreoTraspaso_Cantidad != null )
      {
         AddObjectProperty("cantidad", gxTv_SdtSDTCorreoTraspaso_Cantidad, false);
      }
   }

   public String getgxTv_SdtSDTCorreoTraspaso_Nombcuentadanteorigen( )
   {
      return gxTv_SdtSDTCorreoTraspaso_Nombcuentadanteorigen ;
   }

   public void setgxTv_SdtSDTCorreoTraspaso_Nombcuentadanteorigen( String value )
   {
      gxTv_SdtSDTCorreoTraspaso_Nombcuentadanteorigen = value ;
   }

   public java.util.Date getgxTv_SdtSDTCorreoTraspaso_Fecharatificacion( )
   {
      return gxTv_SdtSDTCorreoTraspaso_Fecharatificacion ;
   }

   public void setgxTv_SdtSDTCorreoTraspaso_Fecharatificacion( java.util.Date value )
   {
      gxTv_SdtSDTCorreoTraspaso_Fecharatificacion = value ;
   }

   public String getgxTv_SdtSDTCorreoTraspaso_Descripcionmovimiento( )
   {
      return gxTv_SdtSDTCorreoTraspaso_Descripcionmovimiento ;
   }

   public void setgxTv_SdtSDTCorreoTraspaso_Descripcionmovimiento( String value )
   {
      gxTv_SdtSDTCorreoTraspaso_Descripcionmovimiento = value ;
   }

   public String getgxTv_SdtSDTCorreoTraspaso_Indicadormovimiento( )
   {
      return gxTv_SdtSDTCorreoTraspaso_Indicadormovimiento ;
   }

   public void setgxTv_SdtSDTCorreoTraspaso_Indicadormovimiento( String value )
   {
      gxTv_SdtSDTCorreoTraspaso_Indicadormovimiento = value ;
   }

   public short getgxTv_SdtSDTCorreoTraspaso_Tranid( )
   {
      return gxTv_SdtSDTCorreoTraspaso_Tranid ;
   }

   public void setgxTv_SdtSDTCorreoTraspaso_Tranid( short value )
   {
      gxTv_SdtSDTCorreoTraspaso_Tranid = value ;
   }

   public String getgxTv_SdtSDTCorreoTraspaso_Tranregionalorigen( )
   {
      return gxTv_SdtSDTCorreoTraspaso_Tranregionalorigen ;
   }

   public void setgxTv_SdtSDTCorreoTraspaso_Tranregionalorigen( String value )
   {
      gxTv_SdtSDTCorreoTraspaso_Tranregionalorigen = value ;
   }

   public String getgxTv_SdtSDTCorreoTraspaso_Tranregionaldestino( )
   {
      return gxTv_SdtSDTCorreoTraspaso_Tranregionaldestino ;
   }

   public void setgxTv_SdtSDTCorreoTraspaso_Tranregionaldestino( String value )
   {
      gxTv_SdtSDTCorreoTraspaso_Tranregionaldestino = value ;
   }

   public String getgxTv_SdtSDTCorreoTraspaso_Trancentrocostodescripcionorigen( )
   {
      return gxTv_SdtSDTCorreoTraspaso_Trancentrocostodescripcionorigen ;
   }

   public void setgxTv_SdtSDTCorreoTraspaso_Trancentrocostodescripcionorigen( String value )
   {
      gxTv_SdtSDTCorreoTraspaso_Trancentrocostodescripcionorigen = value ;
   }

   public String getgxTv_SdtSDTCorreoTraspaso_Trancentrocostodescripciondestino( )
   {
      return gxTv_SdtSDTCorreoTraspaso_Trancentrocostodescripciondestino ;
   }

   public void setgxTv_SdtSDTCorreoTraspaso_Trancentrocostodescripciondestino( String value )
   {
      gxTv_SdtSDTCorreoTraspaso_Trancentrocostodescripciondestino = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTCorreoTraspaso_Tranvalortransaccion( )
   {
      return gxTv_SdtSDTCorreoTraspaso_Tranvalortransaccion ;
   }

   public void setgxTv_SdtSDTCorreoTraspaso_Tranvalortransaccion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTCorreoTraspaso_Tranvalortransaccion = value ;
   }

   public GXBaseCollection<com.orions2.SdtSDTCorreoTraspaso_emailsItem> getgxTv_SdtSDTCorreoTraspaso_Emails( )
   {
      if ( gxTv_SdtSDTCorreoTraspaso_Emails == null )
      {
         gxTv_SdtSDTCorreoTraspaso_Emails = new GXBaseCollection<com.orions2.SdtSDTCorreoTraspaso_emailsItem>(com.orions2.SdtSDTCorreoTraspaso_emailsItem.class, "SDTCorreoTraspaso.emailsItem", "ACBSENA", remoteHandle);
      }
      return gxTv_SdtSDTCorreoTraspaso_Emails ;
   }

   public void setgxTv_SdtSDTCorreoTraspaso_Emails( GXBaseCollection<com.orions2.SdtSDTCorreoTraspaso_emailsItem> value )
   {
      gxTv_SdtSDTCorreoTraspaso_Emails = value ;
   }

   public void setgxTv_SdtSDTCorreoTraspaso_Emails_SetNull( )
   {
      gxTv_SdtSDTCorreoTraspaso_Emails = null ;
   }

   public boolean getgxTv_SdtSDTCorreoTraspaso_Emails_IsNull( )
   {
      if ( gxTv_SdtSDTCorreoTraspaso_Emails == null )
      {
         return true ;
      }
      return false ;
   }

   public GXBaseCollection<com.orions2.SdtSDTCorreoTraspaso_cantidadItem> getgxTv_SdtSDTCorreoTraspaso_Cantidad( )
   {
      if ( gxTv_SdtSDTCorreoTraspaso_Cantidad == null )
      {
         gxTv_SdtSDTCorreoTraspaso_Cantidad = new GXBaseCollection<com.orions2.SdtSDTCorreoTraspaso_cantidadItem>(com.orions2.SdtSDTCorreoTraspaso_cantidadItem.class, "SDTCorreoTraspaso.cantidadItem", "ACBSENA", remoteHandle);
      }
      return gxTv_SdtSDTCorreoTraspaso_Cantidad ;
   }

   public void setgxTv_SdtSDTCorreoTraspaso_Cantidad( GXBaseCollection<com.orions2.SdtSDTCorreoTraspaso_cantidadItem> value )
   {
      gxTv_SdtSDTCorreoTraspaso_Cantidad = value ;
   }

   public void setgxTv_SdtSDTCorreoTraspaso_Cantidad_SetNull( )
   {
      gxTv_SdtSDTCorreoTraspaso_Cantidad = null ;
   }

   public boolean getgxTv_SdtSDTCorreoTraspaso_Cantidad_IsNull( )
   {
      if ( gxTv_SdtSDTCorreoTraspaso_Cantidad == null )
      {
         return true ;
      }
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTCorreoTraspaso_Nombcuentadanteorigen = "" ;
      gxTv_SdtSDTCorreoTraspaso_Fecharatificacion = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSDTCorreoTraspaso_Descripcionmovimiento = "" ;
      gxTv_SdtSDTCorreoTraspaso_Indicadormovimiento = "" ;
      gxTv_SdtSDTCorreoTraspaso_Tranregionalorigen = "" ;
      gxTv_SdtSDTCorreoTraspaso_Tranregionaldestino = "" ;
      gxTv_SdtSDTCorreoTraspaso_Trancentrocostodescripcionorigen = "" ;
      gxTv_SdtSDTCorreoTraspaso_Trancentrocostodescripciondestino = "" ;
      gxTv_SdtSDTCorreoTraspaso_Tranvalortransaccion = DecimalUtil.ZERO ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public com.orions2.SdtSDTCorreoTraspaso Clone( )
   {
      return (com.orions2.SdtSDTCorreoTraspaso)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTCorreoTraspaso struct )
   {
      setgxTv_SdtSDTCorreoTraspaso_Nombcuentadanteorigen(struct.getNombcuentadanteorigen());
      setgxTv_SdtSDTCorreoTraspaso_Fecharatificacion(struct.getFecharatificacion());
      setgxTv_SdtSDTCorreoTraspaso_Descripcionmovimiento(struct.getDescripcionmovimiento());
      setgxTv_SdtSDTCorreoTraspaso_Indicadormovimiento(struct.getIndicadormovimiento());
      setgxTv_SdtSDTCorreoTraspaso_Tranid(struct.getTranid());
      setgxTv_SdtSDTCorreoTraspaso_Tranregionalorigen(struct.getTranregionalorigen());
      setgxTv_SdtSDTCorreoTraspaso_Tranregionaldestino(struct.getTranregionaldestino());
      setgxTv_SdtSDTCorreoTraspaso_Trancentrocostodescripcionorigen(struct.getTrancentrocostodescripcionorigen());
      setgxTv_SdtSDTCorreoTraspaso_Trancentrocostodescripciondestino(struct.getTrancentrocostodescripciondestino());
      setgxTv_SdtSDTCorreoTraspaso_Tranvalortransaccion(struct.getTranvalortransaccion());
      GXBaseCollection<com.orions2.SdtSDTCorreoTraspaso_emailsItem> gxTv_SdtSDTCorreoTraspaso_Emails_aux = new GXBaseCollection<com.orions2.SdtSDTCorreoTraspaso_emailsItem>(com.orions2.SdtSDTCorreoTraspaso_emailsItem.class, "SDTCorreoTraspaso.emailsItem", "ACBSENA", remoteHandle) ;
      GXBaseCollection<com.orions2.SdtSDTCorreoTraspaso_emailsItem> gxTv_SdtSDTCorreoTraspaso_Emails_aux1 = new GXBaseCollection<com.orions2.SdtSDTCorreoTraspaso_emailsItem>(com.orions2.SdtSDTCorreoTraspaso_emailsItem.class, "SDTCorreoTraspaso.emailsItem", "ACBSENA", remoteHandle) ;
      gxTv_SdtSDTCorreoTraspaso_Emails_aux1.setStruct(struct.getEmails());
      for (int i = 0; i < gxTv_SdtSDTCorreoTraspaso_Emails_aux1.size(); i++)
      {
         gxTv_SdtSDTCorreoTraspaso_Emails_aux.add(new com.orions2.SdtSDTCorreoTraspaso_emailsItem(gxTv_SdtSDTCorreoTraspaso_Emails_aux1.elementAt(i).getStruct()));
      }
      setgxTv_SdtSDTCorreoTraspaso_Emails(gxTv_SdtSDTCorreoTraspaso_Emails_aux);
      GXBaseCollection<com.orions2.SdtSDTCorreoTraspaso_cantidadItem> gxTv_SdtSDTCorreoTraspaso_Cantidad_aux = new GXBaseCollection<com.orions2.SdtSDTCorreoTraspaso_cantidadItem>(com.orions2.SdtSDTCorreoTraspaso_cantidadItem.class, "SDTCorreoTraspaso.cantidadItem", "ACBSENA", remoteHandle) ;
      GXBaseCollection<com.orions2.SdtSDTCorreoTraspaso_cantidadItem> gxTv_SdtSDTCorreoTraspaso_Cantidad_aux1 = new GXBaseCollection<com.orions2.SdtSDTCorreoTraspaso_cantidadItem>(com.orions2.SdtSDTCorreoTraspaso_cantidadItem.class, "SDTCorreoTraspaso.cantidadItem", "ACBSENA", remoteHandle) ;
      gxTv_SdtSDTCorreoTraspaso_Cantidad_aux1.setStruct(struct.getCantidad());
      for (int i = 0; i < gxTv_SdtSDTCorreoTraspaso_Cantidad_aux1.size(); i++)
      {
         gxTv_SdtSDTCorreoTraspaso_Cantidad_aux.add(new com.orions2.SdtSDTCorreoTraspaso_cantidadItem(gxTv_SdtSDTCorreoTraspaso_Cantidad_aux1.elementAt(i).getStruct()));
      }
      setgxTv_SdtSDTCorreoTraspaso_Cantidad(gxTv_SdtSDTCorreoTraspaso_Cantidad_aux);
   }

   public com.orions2.StructSdtSDTCorreoTraspaso getStruct( )
   {
      com.orions2.StructSdtSDTCorreoTraspaso struct = new com.orions2.StructSdtSDTCorreoTraspaso ();
      struct.setNombcuentadanteorigen(getgxTv_SdtSDTCorreoTraspaso_Nombcuentadanteorigen());
      struct.setFecharatificacion(getgxTv_SdtSDTCorreoTraspaso_Fecharatificacion());
      struct.setDescripcionmovimiento(getgxTv_SdtSDTCorreoTraspaso_Descripcionmovimiento());
      struct.setIndicadormovimiento(getgxTv_SdtSDTCorreoTraspaso_Indicadormovimiento());
      struct.setTranid(getgxTv_SdtSDTCorreoTraspaso_Tranid());
      struct.setTranregionalorigen(getgxTv_SdtSDTCorreoTraspaso_Tranregionalorigen());
      struct.setTranregionaldestino(getgxTv_SdtSDTCorreoTraspaso_Tranregionaldestino());
      struct.setTrancentrocostodescripcionorigen(getgxTv_SdtSDTCorreoTraspaso_Trancentrocostodescripcionorigen());
      struct.setTrancentrocostodescripciondestino(getgxTv_SdtSDTCorreoTraspaso_Trancentrocostodescripciondestino());
      struct.setTranvalortransaccion(getgxTv_SdtSDTCorreoTraspaso_Tranvalortransaccion());
      Vector aux_vectorgxTv_SdtSDTCorreoTraspaso_Emails = getgxTv_SdtSDTCorreoTraspaso_Emails().getStruct();
      Vector aux_vector1gxTv_SdtSDTCorreoTraspaso_Emails = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtSDTCorreoTraspaso_Emails.size(); i++)
      {
         aux_vector1gxTv_SdtSDTCorreoTraspaso_Emails.addElement(((com.orions2.SdtSDTCorreoTraspaso_emailsItem)aux_vectorgxTv_SdtSDTCorreoTraspaso_Emails.elementAt(i)).getStruct());
      }
      struct.setEmails(aux_vector1gxTv_SdtSDTCorreoTraspaso_Emails);
      Vector aux_vectorgxTv_SdtSDTCorreoTraspaso_Cantidad = getgxTv_SdtSDTCorreoTraspaso_Cantidad().getStruct();
      Vector aux_vector1gxTv_SdtSDTCorreoTraspaso_Cantidad = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtSDTCorreoTraspaso_Cantidad.size(); i++)
      {
         aux_vector1gxTv_SdtSDTCorreoTraspaso_Cantidad.addElement(((com.orions2.SdtSDTCorreoTraspaso_cantidadItem)aux_vectorgxTv_SdtSDTCorreoTraspaso_Cantidad.elementAt(i)).getStruct());
      }
      struct.setCantidad(aux_vector1gxTv_SdtSDTCorreoTraspaso_Cantidad);
      return struct ;
   }

   protected short gxTv_SdtSDTCorreoTraspaso_Tranid ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDTCorreoTraspaso_Tranvalortransaccion ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTCorreoTraspaso_Fecharatificacion ;
   protected java.util.Date datetime_STZ ;
   protected String gxTv_SdtSDTCorreoTraspaso_Nombcuentadanteorigen ;
   protected String gxTv_SdtSDTCorreoTraspaso_Descripcionmovimiento ;
   protected String gxTv_SdtSDTCorreoTraspaso_Indicadormovimiento ;
   protected String gxTv_SdtSDTCorreoTraspaso_Tranregionalorigen ;
   protected String gxTv_SdtSDTCorreoTraspaso_Tranregionaldestino ;
   protected String gxTv_SdtSDTCorreoTraspaso_Trancentrocostodescripcionorigen ;
   protected String gxTv_SdtSDTCorreoTraspaso_Trancentrocostodescripciondestino ;
   protected GXBaseCollection<com.orions2.SdtSDTCorreoTraspaso_emailsItem> gxTv_SdtSDTCorreoTraspaso_Emails_aux ;
   protected GXBaseCollection<com.orions2.SdtSDTCorreoTraspaso_emailsItem> gxTv_SdtSDTCorreoTraspaso_Emails_aux1 ;
   protected GXBaseCollection<com.orions2.SdtSDTCorreoTraspaso_cantidadItem> gxTv_SdtSDTCorreoTraspaso_Cantidad_aux ;
   protected GXBaseCollection<com.orions2.SdtSDTCorreoTraspaso_cantidadItem> gxTv_SdtSDTCorreoTraspaso_Cantidad_aux1 ;
   protected GXBaseCollection<com.orions2.SdtSDTCorreoTraspaso_emailsItem> gxTv_SdtSDTCorreoTraspaso_Emails=null ;
   protected GXBaseCollection<com.orions2.SdtSDTCorreoTraspaso_cantidadItem> gxTv_SdtSDTCorreoTraspaso_Cantidad=null ;
}

