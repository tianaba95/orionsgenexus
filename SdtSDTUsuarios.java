/*
               File: SdtSDTUsuarios
        Description: SDTUsuarios
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 18, 2018 13:32:47.71
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

public final  class SdtSDTUsuarios extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTUsuarios( )
   {
      this(  new ModelContext(SdtSDTUsuarios.class));
   }

   public SdtSDTUsuarios( ModelContext context )
   {
      super( context, "SdtSDTUsuarios");
   }

   public SdtSDTUsuarios( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTUsuarios");
   }

   public SdtSDTUsuarios( StructSdtSDTUsuarios struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "usuaId") )
            {
               gxTv_SdtSDTUsuarios_Usuaid = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "usuaCodigo") )
            {
               gxTv_SdtSDTUsuarios_Usuacodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "usuaNombre") )
            {
               gxTv_SdtSDTUsuarios_Usuanombre = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "usuaEmail") )
            {
               gxTv_SdtSDTUsuarios_Usuaemail = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "usuaCedula") )
            {
               gxTv_SdtSDTUsuarios_Usuacedula = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "usuaClave") )
            {
               gxTv_SdtSDTUsuarios_Usuaclave = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "usuaEstado") )
            {
               gxTv_SdtSDTUsuarios_Usuaestado = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "usuaUsuaprueba") )
            {
               gxTv_SdtSDTUsuarios_Usuausuaprueba = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "usuaTipocontrato") )
            {
               gxTv_SdtSDTUsuarios_Usuatipocontrato = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "usuaUsuariocrea") )
            {
               gxTv_SdtSDTUsuarios_Usuausuariocrea = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "usuaFechacrea") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTUsuarios_Usuafechacrea = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtSDTUsuarios_Usuafechacrea = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "usuaUsuariomodifica") )
            {
               gxTv_SdtSDTUsuarios_Usuausuariomodifica = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "usuaFechamodifica") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTUsuarios_Usuafechamodifica = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtSDTUsuarios_Usuafechamodifica = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "genCentrocostoCollection") )
            {
               if ( gxTv_SdtSDTUsuarios_Gencentrocostocollection == null )
               {
                  gxTv_SdtSDTUsuarios_Gencentrocostocollection = new GXBaseCollection<com.orions2.SdtSDTUsuarios_genCentrocostoCollectionItem>(com.orions2.SdtSDTUsuarios_genCentrocostoCollectionItem.class, "SDTUsuarios.genCentrocostoCollectionItem", "ACBSENA", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTUsuarios_Gencentrocostocollection.readxmlcollection(oReader, "genCentrocostoCollection", "genCentrocostoCollectionItem") ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "segRolCollection") )
            {
               if ( gxTv_SdtSDTUsuarios_Segrolcollection == null )
               {
                  gxTv_SdtSDTUsuarios_Segrolcollection = new GXBaseCollection<com.orions2.SdtSDTUsuarios_segRolCollectionItem>(com.orions2.SdtSDTUsuarios_segRolCollectionItem.class, "SDTUsuarios.segRolCollectionItem", "ACBSENA", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTUsuarios_Segrolcollection.readxmlcollection(oReader, "segRolCollection", "segRolCollectionItem") ;
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
         sName = "SDTUsuarios" ;
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
      oWriter.writeElement("usuaId", GXutil.trim( GXutil.str( gxTv_SdtSDTUsuarios_Usuaid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("usuaCodigo", GXutil.rtrim( gxTv_SdtSDTUsuarios_Usuacodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("usuaNombre", GXutil.rtrim( gxTv_SdtSDTUsuarios_Usuanombre));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("usuaEmail", GXutil.rtrim( gxTv_SdtSDTUsuarios_Usuaemail));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("usuaCedula", GXutil.trim( GXutil.str( gxTv_SdtSDTUsuarios_Usuacedula, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("usuaClave", GXutil.rtrim( gxTv_SdtSDTUsuarios_Usuaclave));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("usuaEstado", GXutil.rtrim( gxTv_SdtSDTUsuarios_Usuaestado));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("usuaUsuaprueba", GXutil.rtrim( gxTv_SdtSDTUsuarios_Usuausuaprueba));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("usuaTipocontrato", GXutil.rtrim( gxTv_SdtSDTUsuarios_Usuatipocontrato));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("usuaUsuariocrea", GXutil.rtrim( gxTv_SdtSDTUsuarios_Usuausuariocrea));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTUsuarios_Usuafechacrea) )
      {
         oWriter.writeStartElement("usuaFechacrea");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTUsuarios_Usuafechacrea), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTUsuarios_Usuafechacrea), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTUsuarios_Usuafechacrea), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSDTUsuarios_Usuafechacrea), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSDTUsuarios_Usuafechacrea), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSDTUsuarios_Usuafechacrea), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("usuaFechacrea", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
      }
      oWriter.writeElement("usuaUsuariomodifica", GXutil.rtrim( gxTv_SdtSDTUsuarios_Usuausuariomodifica));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTUsuarios_Usuafechamodifica) )
      {
         oWriter.writeStartElement("usuaFechamodifica");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTUsuarios_Usuafechamodifica), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTUsuarios_Usuafechamodifica), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTUsuarios_Usuafechamodifica), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSDTUsuarios_Usuafechamodifica), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSDTUsuarios_Usuafechamodifica), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSDTUsuarios_Usuafechamodifica), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("usuaFechamodifica", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
      }
      if ( gxTv_SdtSDTUsuarios_Gencentrocostocollection != null )
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
         gxTv_SdtSDTUsuarios_Gencentrocostocollection.writexmlcollection(oWriter, "genCentrocostoCollection", sNameSpace1, "genCentrocostoCollectionItem", sNameSpace1);
      }
      if ( gxTv_SdtSDTUsuarios_Segrolcollection != null )
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
         gxTv_SdtSDTUsuarios_Segrolcollection.writexmlcollection(oWriter, "segRolCollection", sNameSpace1, "segRolCollectionItem", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("usuaId", GXutil.ltrim( GXutil.str( gxTv_SdtSDTUsuarios_Usuaid, 18, 0)), false);
      AddObjectProperty("usuaCodigo", gxTv_SdtSDTUsuarios_Usuacodigo, false);
      AddObjectProperty("usuaNombre", gxTv_SdtSDTUsuarios_Usuanombre, false);
      AddObjectProperty("usuaEmail", gxTv_SdtSDTUsuarios_Usuaemail, false);
      AddObjectProperty("usuaCedula", GXutil.ltrim( GXutil.str( gxTv_SdtSDTUsuarios_Usuacedula, 18, 0)), false);
      AddObjectProperty("usuaClave", gxTv_SdtSDTUsuarios_Usuaclave, false);
      AddObjectProperty("usuaEstado", gxTv_SdtSDTUsuarios_Usuaestado, false);
      AddObjectProperty("usuaUsuaprueba", gxTv_SdtSDTUsuarios_Usuausuaprueba, false);
      AddObjectProperty("usuaTipocontrato", gxTv_SdtSDTUsuarios_Usuatipocontrato, false);
      AddObjectProperty("usuaUsuariocrea", gxTv_SdtSDTUsuarios_Usuausuariocrea, false);
      datetime_STZ = gxTv_SdtSDTUsuarios_Usuafechacrea ;
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
      AddObjectProperty("usuaFechacrea", sDateCnv, false);
      AddObjectProperty("usuaUsuariomodifica", gxTv_SdtSDTUsuarios_Usuausuariomodifica, false);
      datetime_STZ = gxTv_SdtSDTUsuarios_Usuafechamodifica ;
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
      AddObjectProperty("usuaFechamodifica", sDateCnv, false);
      if ( gxTv_SdtSDTUsuarios_Gencentrocostocollection != null )
      {
         AddObjectProperty("genCentrocostoCollection", gxTv_SdtSDTUsuarios_Gencentrocostocollection, false);
      }
      if ( gxTv_SdtSDTUsuarios_Segrolcollection != null )
      {
         AddObjectProperty("segRolCollection", gxTv_SdtSDTUsuarios_Segrolcollection, false);
      }
   }

   public long getgxTv_SdtSDTUsuarios_Usuaid( )
   {
      return gxTv_SdtSDTUsuarios_Usuaid ;
   }

   public void setgxTv_SdtSDTUsuarios_Usuaid( long value )
   {
      gxTv_SdtSDTUsuarios_Usuaid = value ;
   }

   public String getgxTv_SdtSDTUsuarios_Usuacodigo( )
   {
      return gxTv_SdtSDTUsuarios_Usuacodigo ;
   }

   public void setgxTv_SdtSDTUsuarios_Usuacodigo( String value )
   {
      gxTv_SdtSDTUsuarios_Usuacodigo = value ;
   }

   public String getgxTv_SdtSDTUsuarios_Usuanombre( )
   {
      return gxTv_SdtSDTUsuarios_Usuanombre ;
   }

   public void setgxTv_SdtSDTUsuarios_Usuanombre( String value )
   {
      gxTv_SdtSDTUsuarios_Usuanombre = value ;
   }

   public String getgxTv_SdtSDTUsuarios_Usuaemail( )
   {
      return gxTv_SdtSDTUsuarios_Usuaemail ;
   }

   public void setgxTv_SdtSDTUsuarios_Usuaemail( String value )
   {
      gxTv_SdtSDTUsuarios_Usuaemail = value ;
   }

   public long getgxTv_SdtSDTUsuarios_Usuacedula( )
   {
      return gxTv_SdtSDTUsuarios_Usuacedula ;
   }

   public void setgxTv_SdtSDTUsuarios_Usuacedula( long value )
   {
      gxTv_SdtSDTUsuarios_Usuacedula = value ;
   }

   public String getgxTv_SdtSDTUsuarios_Usuaclave( )
   {
      return gxTv_SdtSDTUsuarios_Usuaclave ;
   }

   public void setgxTv_SdtSDTUsuarios_Usuaclave( String value )
   {
      gxTv_SdtSDTUsuarios_Usuaclave = value ;
   }

   public String getgxTv_SdtSDTUsuarios_Usuaestado( )
   {
      return gxTv_SdtSDTUsuarios_Usuaestado ;
   }

   public void setgxTv_SdtSDTUsuarios_Usuaestado( String value )
   {
      gxTv_SdtSDTUsuarios_Usuaestado = value ;
   }

   public String getgxTv_SdtSDTUsuarios_Usuausuaprueba( )
   {
      return gxTv_SdtSDTUsuarios_Usuausuaprueba ;
   }

   public void setgxTv_SdtSDTUsuarios_Usuausuaprueba( String value )
   {
      gxTv_SdtSDTUsuarios_Usuausuaprueba = value ;
   }

   public String getgxTv_SdtSDTUsuarios_Usuatipocontrato( )
   {
      return gxTv_SdtSDTUsuarios_Usuatipocontrato ;
   }

   public void setgxTv_SdtSDTUsuarios_Usuatipocontrato( String value )
   {
      gxTv_SdtSDTUsuarios_Usuatipocontrato = value ;
   }

   public String getgxTv_SdtSDTUsuarios_Usuausuariocrea( )
   {
      return gxTv_SdtSDTUsuarios_Usuausuariocrea ;
   }

   public void setgxTv_SdtSDTUsuarios_Usuausuariocrea( String value )
   {
      gxTv_SdtSDTUsuarios_Usuausuariocrea = value ;
   }

   public java.util.Date getgxTv_SdtSDTUsuarios_Usuafechacrea( )
   {
      return gxTv_SdtSDTUsuarios_Usuafechacrea ;
   }

   public void setgxTv_SdtSDTUsuarios_Usuafechacrea( java.util.Date value )
   {
      gxTv_SdtSDTUsuarios_Usuafechacrea = value ;
   }

   public String getgxTv_SdtSDTUsuarios_Usuausuariomodifica( )
   {
      return gxTv_SdtSDTUsuarios_Usuausuariomodifica ;
   }

   public void setgxTv_SdtSDTUsuarios_Usuausuariomodifica( String value )
   {
      gxTv_SdtSDTUsuarios_Usuausuariomodifica = value ;
   }

   public java.util.Date getgxTv_SdtSDTUsuarios_Usuafechamodifica( )
   {
      return gxTv_SdtSDTUsuarios_Usuafechamodifica ;
   }

   public void setgxTv_SdtSDTUsuarios_Usuafechamodifica( java.util.Date value )
   {
      gxTv_SdtSDTUsuarios_Usuafechamodifica = value ;
   }

   public GXBaseCollection<com.orions2.SdtSDTUsuarios_genCentrocostoCollectionItem> getgxTv_SdtSDTUsuarios_Gencentrocostocollection( )
   {
      if ( gxTv_SdtSDTUsuarios_Gencentrocostocollection == null )
      {
         gxTv_SdtSDTUsuarios_Gencentrocostocollection = new GXBaseCollection<com.orions2.SdtSDTUsuarios_genCentrocostoCollectionItem>(com.orions2.SdtSDTUsuarios_genCentrocostoCollectionItem.class, "SDTUsuarios.genCentrocostoCollectionItem", "ACBSENA", remoteHandle);
      }
      return gxTv_SdtSDTUsuarios_Gencentrocostocollection ;
   }

   public void setgxTv_SdtSDTUsuarios_Gencentrocostocollection( GXBaseCollection<com.orions2.SdtSDTUsuarios_genCentrocostoCollectionItem> value )
   {
      gxTv_SdtSDTUsuarios_Gencentrocostocollection = value ;
   }

   public void setgxTv_SdtSDTUsuarios_Gencentrocostocollection_SetNull( )
   {
      gxTv_SdtSDTUsuarios_Gencentrocostocollection = null ;
   }

   public boolean getgxTv_SdtSDTUsuarios_Gencentrocostocollection_IsNull( )
   {
      if ( gxTv_SdtSDTUsuarios_Gencentrocostocollection == null )
      {
         return true ;
      }
      return false ;
   }

   public GXBaseCollection<com.orions2.SdtSDTUsuarios_segRolCollectionItem> getgxTv_SdtSDTUsuarios_Segrolcollection( )
   {
      if ( gxTv_SdtSDTUsuarios_Segrolcollection == null )
      {
         gxTv_SdtSDTUsuarios_Segrolcollection = new GXBaseCollection<com.orions2.SdtSDTUsuarios_segRolCollectionItem>(com.orions2.SdtSDTUsuarios_segRolCollectionItem.class, "SDTUsuarios.segRolCollectionItem", "ACBSENA", remoteHandle);
      }
      return gxTv_SdtSDTUsuarios_Segrolcollection ;
   }

   public void setgxTv_SdtSDTUsuarios_Segrolcollection( GXBaseCollection<com.orions2.SdtSDTUsuarios_segRolCollectionItem> value )
   {
      gxTv_SdtSDTUsuarios_Segrolcollection = value ;
   }

   public void setgxTv_SdtSDTUsuarios_Segrolcollection_SetNull( )
   {
      gxTv_SdtSDTUsuarios_Segrolcollection = null ;
   }

   public boolean getgxTv_SdtSDTUsuarios_Segrolcollection_IsNull( )
   {
      if ( gxTv_SdtSDTUsuarios_Segrolcollection == null )
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
      gxTv_SdtSDTUsuarios_Usuacodigo = "" ;
      gxTv_SdtSDTUsuarios_Usuanombre = "" ;
      gxTv_SdtSDTUsuarios_Usuaemail = "" ;
      gxTv_SdtSDTUsuarios_Usuaclave = "" ;
      gxTv_SdtSDTUsuarios_Usuaestado = "" ;
      gxTv_SdtSDTUsuarios_Usuausuaprueba = "" ;
      gxTv_SdtSDTUsuarios_Usuatipocontrato = "" ;
      gxTv_SdtSDTUsuarios_Usuausuariocrea = "" ;
      gxTv_SdtSDTUsuarios_Usuafechacrea = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSDTUsuarios_Usuausuariomodifica = "" ;
      gxTv_SdtSDTUsuarios_Usuafechamodifica = GXutil.resetTime( GXutil.nullDate() );
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public com.orions2.SdtSDTUsuarios Clone( )
   {
      return (com.orions2.SdtSDTUsuarios)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTUsuarios struct )
   {
      setgxTv_SdtSDTUsuarios_Usuaid(struct.getUsuaid());
      setgxTv_SdtSDTUsuarios_Usuacodigo(struct.getUsuacodigo());
      setgxTv_SdtSDTUsuarios_Usuanombre(struct.getUsuanombre());
      setgxTv_SdtSDTUsuarios_Usuaemail(struct.getUsuaemail());
      setgxTv_SdtSDTUsuarios_Usuacedula(struct.getUsuacedula());
      setgxTv_SdtSDTUsuarios_Usuaclave(struct.getUsuaclave());
      setgxTv_SdtSDTUsuarios_Usuaestado(struct.getUsuaestado());
      setgxTv_SdtSDTUsuarios_Usuausuaprueba(struct.getUsuausuaprueba());
      setgxTv_SdtSDTUsuarios_Usuatipocontrato(struct.getUsuatipocontrato());
      setgxTv_SdtSDTUsuarios_Usuausuariocrea(struct.getUsuausuariocrea());
      setgxTv_SdtSDTUsuarios_Usuafechacrea(struct.getUsuafechacrea());
      setgxTv_SdtSDTUsuarios_Usuausuariomodifica(struct.getUsuausuariomodifica());
      setgxTv_SdtSDTUsuarios_Usuafechamodifica(struct.getUsuafechamodifica());
      GXBaseCollection<com.orions2.SdtSDTUsuarios_genCentrocostoCollectionItem> gxTv_SdtSDTUsuarios_Gencentrocostocollection_aux = new GXBaseCollection<com.orions2.SdtSDTUsuarios_genCentrocostoCollectionItem>(com.orions2.SdtSDTUsuarios_genCentrocostoCollectionItem.class, "SDTUsuarios.genCentrocostoCollectionItem", "ACBSENA", remoteHandle) ;
      GXBaseCollection<com.orions2.SdtSDTUsuarios_genCentrocostoCollectionItem> gxTv_SdtSDTUsuarios_Gencentrocostocollection_aux1 = new GXBaseCollection<com.orions2.SdtSDTUsuarios_genCentrocostoCollectionItem>(com.orions2.SdtSDTUsuarios_genCentrocostoCollectionItem.class, "SDTUsuarios.genCentrocostoCollectionItem", "ACBSENA", remoteHandle) ;
      gxTv_SdtSDTUsuarios_Gencentrocostocollection_aux1.setStruct(struct.getGencentrocostocollection());
      for (int i = 0; i < gxTv_SdtSDTUsuarios_Gencentrocostocollection_aux1.size(); i++)
      {
         gxTv_SdtSDTUsuarios_Gencentrocostocollection_aux.add(new com.orions2.SdtSDTUsuarios_genCentrocostoCollectionItem(gxTv_SdtSDTUsuarios_Gencentrocostocollection_aux1.elementAt(i).getStruct()));
      }
      setgxTv_SdtSDTUsuarios_Gencentrocostocollection(gxTv_SdtSDTUsuarios_Gencentrocostocollection_aux);
      GXBaseCollection<com.orions2.SdtSDTUsuarios_segRolCollectionItem> gxTv_SdtSDTUsuarios_Segrolcollection_aux = new GXBaseCollection<com.orions2.SdtSDTUsuarios_segRolCollectionItem>(com.orions2.SdtSDTUsuarios_segRolCollectionItem.class, "SDTUsuarios.segRolCollectionItem", "ACBSENA", remoteHandle) ;
      GXBaseCollection<com.orions2.SdtSDTUsuarios_segRolCollectionItem> gxTv_SdtSDTUsuarios_Segrolcollection_aux1 = new GXBaseCollection<com.orions2.SdtSDTUsuarios_segRolCollectionItem>(com.orions2.SdtSDTUsuarios_segRolCollectionItem.class, "SDTUsuarios.segRolCollectionItem", "ACBSENA", remoteHandle) ;
      gxTv_SdtSDTUsuarios_Segrolcollection_aux1.setStruct(struct.getSegrolcollection());
      for (int i = 0; i < gxTv_SdtSDTUsuarios_Segrolcollection_aux1.size(); i++)
      {
         gxTv_SdtSDTUsuarios_Segrolcollection_aux.add(new com.orions2.SdtSDTUsuarios_segRolCollectionItem(gxTv_SdtSDTUsuarios_Segrolcollection_aux1.elementAt(i).getStruct()));
      }
      setgxTv_SdtSDTUsuarios_Segrolcollection(gxTv_SdtSDTUsuarios_Segrolcollection_aux);
   }

   public com.orions2.StructSdtSDTUsuarios getStruct( )
   {
      com.orions2.StructSdtSDTUsuarios struct = new com.orions2.StructSdtSDTUsuarios ();
      struct.setUsuaid(getgxTv_SdtSDTUsuarios_Usuaid());
      struct.setUsuacodigo(getgxTv_SdtSDTUsuarios_Usuacodigo());
      struct.setUsuanombre(getgxTv_SdtSDTUsuarios_Usuanombre());
      struct.setUsuaemail(getgxTv_SdtSDTUsuarios_Usuaemail());
      struct.setUsuacedula(getgxTv_SdtSDTUsuarios_Usuacedula());
      struct.setUsuaclave(getgxTv_SdtSDTUsuarios_Usuaclave());
      struct.setUsuaestado(getgxTv_SdtSDTUsuarios_Usuaestado());
      struct.setUsuausuaprueba(getgxTv_SdtSDTUsuarios_Usuausuaprueba());
      struct.setUsuatipocontrato(getgxTv_SdtSDTUsuarios_Usuatipocontrato());
      struct.setUsuausuariocrea(getgxTv_SdtSDTUsuarios_Usuausuariocrea());
      struct.setUsuafechacrea(getgxTv_SdtSDTUsuarios_Usuafechacrea());
      struct.setUsuausuariomodifica(getgxTv_SdtSDTUsuarios_Usuausuariomodifica());
      struct.setUsuafechamodifica(getgxTv_SdtSDTUsuarios_Usuafechamodifica());
      Vector aux_vectorgxTv_SdtSDTUsuarios_Gencentrocostocollection = getgxTv_SdtSDTUsuarios_Gencentrocostocollection().getStruct();
      Vector aux_vector1gxTv_SdtSDTUsuarios_Gencentrocostocollection = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtSDTUsuarios_Gencentrocostocollection.size(); i++)
      {
         aux_vector1gxTv_SdtSDTUsuarios_Gencentrocostocollection.addElement(((com.orions2.SdtSDTUsuarios_genCentrocostoCollectionItem)aux_vectorgxTv_SdtSDTUsuarios_Gencentrocostocollection.elementAt(i)).getStruct());
      }
      struct.setGencentrocostocollection(aux_vector1gxTv_SdtSDTUsuarios_Gencentrocostocollection);
      Vector aux_vectorgxTv_SdtSDTUsuarios_Segrolcollection = getgxTv_SdtSDTUsuarios_Segrolcollection().getStruct();
      Vector aux_vector1gxTv_SdtSDTUsuarios_Segrolcollection = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtSDTUsuarios_Segrolcollection.size(); i++)
      {
         aux_vector1gxTv_SdtSDTUsuarios_Segrolcollection.addElement(((com.orions2.SdtSDTUsuarios_segRolCollectionItem)aux_vectorgxTv_SdtSDTUsuarios_Segrolcollection.elementAt(i)).getStruct());
      }
      struct.setSegrolcollection(aux_vector1gxTv_SdtSDTUsuarios_Segrolcollection);
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSDTUsuarios_Usuaid ;
   protected long gxTv_SdtSDTUsuarios_Usuacedula ;
   protected String gxTv_SdtSDTUsuarios_Usuaestado ;
   protected String gxTv_SdtSDTUsuarios_Usuatipocontrato ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTUsuarios_Usuafechacrea ;
   protected java.util.Date gxTv_SdtSDTUsuarios_Usuafechamodifica ;
   protected java.util.Date datetime_STZ ;
   protected String gxTv_SdtSDTUsuarios_Usuacodigo ;
   protected String gxTv_SdtSDTUsuarios_Usuanombre ;
   protected String gxTv_SdtSDTUsuarios_Usuaemail ;
   protected String gxTv_SdtSDTUsuarios_Usuaclave ;
   protected String gxTv_SdtSDTUsuarios_Usuausuaprueba ;
   protected String gxTv_SdtSDTUsuarios_Usuausuariocrea ;
   protected String gxTv_SdtSDTUsuarios_Usuausuariomodifica ;
   protected GXBaseCollection<com.orions2.SdtSDTUsuarios_genCentrocostoCollectionItem> gxTv_SdtSDTUsuarios_Gencentrocostocollection_aux ;
   protected GXBaseCollection<com.orions2.SdtSDTUsuarios_genCentrocostoCollectionItem> gxTv_SdtSDTUsuarios_Gencentrocostocollection_aux1 ;
   protected GXBaseCollection<com.orions2.SdtSDTUsuarios_segRolCollectionItem> gxTv_SdtSDTUsuarios_Segrolcollection_aux ;
   protected GXBaseCollection<com.orions2.SdtSDTUsuarios_segRolCollectionItem> gxTv_SdtSDTUsuarios_Segrolcollection_aux1 ;
   protected GXBaseCollection<com.orions2.SdtSDTUsuarios_genCentrocostoCollectionItem> gxTv_SdtSDTUsuarios_Gencentrocostocollection=null ;
   protected GXBaseCollection<com.orions2.SdtSDTUsuarios_segRolCollectionItem> gxTv_SdtSDTUsuarios_Segrolcollection=null ;
}

