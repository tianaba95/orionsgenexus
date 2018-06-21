/*
               File: SdtSDTEditarRol
        Description: SDTEditarRol
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:17.56
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

public final  class SdtSDTEditarRol extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTEditarRol( )
   {
      this(  new ModelContext(SdtSDTEditarRol.class));
   }

   public SdtSDTEditarRol( ModelContext context )
   {
      super( context, "SdtSDTEditarRol");
   }

   public SdtSDTEditarRol( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTEditarRol");
   }

   public SdtSDTEditarRol( StructSdtSDTEditarRol struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "usuaCodigo") )
            {
               gxTv_SdtSDTEditarRol_Usuacodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "usuaNombre") )
            {
               gxTv_SdtSDTEditarRol_Usuanombre = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "usuaCedula") )
            {
               gxTv_SdtSDTEditarRol_Usuacedula = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "usuaUsuaprueba") )
            {
               gxTv_SdtSDTEditarRol_Usuausuaprueba = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "usuaUsuariomodifica") )
            {
               gxTv_SdtSDTEditarRol_Usuausuariomodifica = oReader.getValue() ;
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
                  gxTv_SdtSDTEditarRol_Usuafechamodifica = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtSDTEditarRol_Usuafechamodifica = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "segRolCollectionEliminado") )
            {
               if ( gxTv_SdtSDTEditarRol_Segrolcollectioneliminado == null )
               {
                  gxTv_SdtSDTEditarRol_Segrolcollectioneliminado = new GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem>(com.orions2.SdtSDTRolUs_SDTRolUsItem.class, "SDTRolUs.SDTRolUsItem", "ACBSENA", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtSDTEditarRol_Segrolcollectioneliminado.readxml(oReader, "segRolCollectionEliminado") ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "segRolCollectionAgregado") )
            {
               if ( gxTv_SdtSDTEditarRol_Segrolcollectionagregado == null )
               {
                  gxTv_SdtSDTEditarRol_Segrolcollectionagregado = new GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem>(com.orions2.SdtSDTRolUs_SDTRolUsItem.class, "SDTRolUs.SDTRolUsItem", "ACBSENA", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtSDTEditarRol_Segrolcollectionagregado.readxml(oReader, "segRolCollectionAgregado") ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "segRolCollection") )
            {
               if ( gxTv_SdtSDTEditarRol_Segrolcollection == null )
               {
                  gxTv_SdtSDTEditarRol_Segrolcollection = new GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem>(com.orions2.SdtSDTRolUs_SDTRolUsItem.class, "SDTRolUs.SDTRolUsItem", "ACBSENA", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtSDTEditarRol_Segrolcollection.readxml(oReader, "segRolCollection") ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "genCentrocostoCollectionEliminado") )
            {
               if ( gxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado == null )
               {
                  gxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado = new GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem>(com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem.class, "SDTCentroUsu.SDTCentroUsuItem", "ACBSENA", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado.readxml(oReader, "genCentrocostoCollectionEliminado") ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "genCentrocostoCollectionAgregado") )
            {
               if ( gxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado == null )
               {
                  gxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado = new GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem>(com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem.class, "SDTCentroUsu.SDTCentroUsuItem", "ACBSENA", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado.readxml(oReader, "genCentrocostoCollectionAgregado") ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "genCentrocostoCollection") )
            {
               if ( gxTv_SdtSDTEditarRol_Gencentrocostocollection == null )
               {
                  gxTv_SdtSDTEditarRol_Gencentrocostocollection = new GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem>(com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem.class, "SDTCentroUsu.SDTCentroUsuItem", "ACBSENA", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtSDTEditarRol_Gencentrocostocollection.readxml(oReader, "genCentrocostoCollection") ;
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
         sName = "SDTEditarRol" ;
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
      oWriter.writeElement("usuaCodigo", GXutil.rtrim( gxTv_SdtSDTEditarRol_Usuacodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("usuaNombre", GXutil.rtrim( gxTv_SdtSDTEditarRol_Usuanombre));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("usuaCedula", GXutil.trim( GXutil.str( gxTv_SdtSDTEditarRol_Usuacedula, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("usuaUsuaprueba", GXutil.rtrim( gxTv_SdtSDTEditarRol_Usuausuaprueba));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("usuaUsuariomodifica", GXutil.rtrim( gxTv_SdtSDTEditarRol_Usuausuariomodifica));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTEditarRol_Usuafechamodifica) )
      {
         oWriter.writeStartElement("usuaFechamodifica");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTEditarRol_Usuafechamodifica), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTEditarRol_Usuafechamodifica), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTEditarRol_Usuafechamodifica), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSDTEditarRol_Usuafechamodifica), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSDTEditarRol_Usuafechamodifica), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSDTEditarRol_Usuafechamodifica), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("usuaFechamodifica", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
      }
      if ( gxTv_SdtSDTEditarRol_Segrolcollectioneliminado != null )
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
         gxTv_SdtSDTEditarRol_Segrolcollectioneliminado.writexml(oWriter, "segRolCollectionEliminado", sNameSpace1);
      }
      if ( gxTv_SdtSDTEditarRol_Segrolcollectionagregado != null )
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
         gxTv_SdtSDTEditarRol_Segrolcollectionagregado.writexml(oWriter, "segRolCollectionAgregado", sNameSpace1);
      }
      if ( gxTv_SdtSDTEditarRol_Segrolcollection != null )
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
         gxTv_SdtSDTEditarRol_Segrolcollection.writexml(oWriter, "segRolCollection", sNameSpace1);
      }
      if ( gxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado != null )
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
         gxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado.writexml(oWriter, "genCentrocostoCollectionEliminado", sNameSpace1);
      }
      if ( gxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado != null )
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
         gxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado.writexml(oWriter, "genCentrocostoCollectionAgregado", sNameSpace1);
      }
      if ( gxTv_SdtSDTEditarRol_Gencentrocostocollection != null )
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
         gxTv_SdtSDTEditarRol_Gencentrocostocollection.writexml(oWriter, "genCentrocostoCollection", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("usuaCodigo", gxTv_SdtSDTEditarRol_Usuacodigo, false);
      AddObjectProperty("usuaNombre", gxTv_SdtSDTEditarRol_Usuanombre, false);
      AddObjectProperty("usuaCedula", GXutil.ltrim( GXutil.str( gxTv_SdtSDTEditarRol_Usuacedula, 18, 0)), false);
      AddObjectProperty("usuaUsuaprueba", gxTv_SdtSDTEditarRol_Usuausuaprueba, false);
      AddObjectProperty("usuaUsuariomodifica", gxTv_SdtSDTEditarRol_Usuausuariomodifica, false);
      datetime_STZ = gxTv_SdtSDTEditarRol_Usuafechamodifica ;
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
      if ( gxTv_SdtSDTEditarRol_Segrolcollectioneliminado != null )
      {
         AddObjectProperty("segRolCollectionEliminado", gxTv_SdtSDTEditarRol_Segrolcollectioneliminado, false);
      }
      if ( gxTv_SdtSDTEditarRol_Segrolcollectionagregado != null )
      {
         AddObjectProperty("segRolCollectionAgregado", gxTv_SdtSDTEditarRol_Segrolcollectionagregado, false);
      }
      if ( gxTv_SdtSDTEditarRol_Segrolcollection != null )
      {
         AddObjectProperty("segRolCollection", gxTv_SdtSDTEditarRol_Segrolcollection, false);
      }
      if ( gxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado != null )
      {
         AddObjectProperty("genCentrocostoCollectionEliminado", gxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado, false);
      }
      if ( gxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado != null )
      {
         AddObjectProperty("genCentrocostoCollectionAgregado", gxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado, false);
      }
      if ( gxTv_SdtSDTEditarRol_Gencentrocostocollection != null )
      {
         AddObjectProperty("genCentrocostoCollection", gxTv_SdtSDTEditarRol_Gencentrocostocollection, false);
      }
   }

   public String getgxTv_SdtSDTEditarRol_Usuacodigo( )
   {
      return gxTv_SdtSDTEditarRol_Usuacodigo ;
   }

   public void setgxTv_SdtSDTEditarRol_Usuacodigo( String value )
   {
      gxTv_SdtSDTEditarRol_Usuacodigo = value ;
   }

   public String getgxTv_SdtSDTEditarRol_Usuanombre( )
   {
      return gxTv_SdtSDTEditarRol_Usuanombre ;
   }

   public void setgxTv_SdtSDTEditarRol_Usuanombre( String value )
   {
      gxTv_SdtSDTEditarRol_Usuanombre = value ;
   }

   public long getgxTv_SdtSDTEditarRol_Usuacedula( )
   {
      return gxTv_SdtSDTEditarRol_Usuacedula ;
   }

   public void setgxTv_SdtSDTEditarRol_Usuacedula( long value )
   {
      gxTv_SdtSDTEditarRol_Usuacedula = value ;
   }

   public String getgxTv_SdtSDTEditarRol_Usuausuaprueba( )
   {
      return gxTv_SdtSDTEditarRol_Usuausuaprueba ;
   }

   public void setgxTv_SdtSDTEditarRol_Usuausuaprueba( String value )
   {
      gxTv_SdtSDTEditarRol_Usuausuaprueba = value ;
   }

   public String getgxTv_SdtSDTEditarRol_Usuausuariomodifica( )
   {
      return gxTv_SdtSDTEditarRol_Usuausuariomodifica ;
   }

   public void setgxTv_SdtSDTEditarRol_Usuausuariomodifica( String value )
   {
      gxTv_SdtSDTEditarRol_Usuausuariomodifica = value ;
   }

   public java.util.Date getgxTv_SdtSDTEditarRol_Usuafechamodifica( )
   {
      return gxTv_SdtSDTEditarRol_Usuafechamodifica ;
   }

   public void setgxTv_SdtSDTEditarRol_Usuafechamodifica( java.util.Date value )
   {
      gxTv_SdtSDTEditarRol_Usuafechamodifica = value ;
   }

   public GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem> getgxTv_SdtSDTEditarRol_Segrolcollectioneliminado( )
   {
      if ( gxTv_SdtSDTEditarRol_Segrolcollectioneliminado == null )
      {
         gxTv_SdtSDTEditarRol_Segrolcollectioneliminado = new GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem>(com.orions2.SdtSDTRolUs_SDTRolUsItem.class, "SDTRolUs.SDTRolUsItem", "ACBSENA", remoteHandle);
      }
      return gxTv_SdtSDTEditarRol_Segrolcollectioneliminado ;
   }

   public void setgxTv_SdtSDTEditarRol_Segrolcollectioneliminado( GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem> value )
   {
      gxTv_SdtSDTEditarRol_Segrolcollectioneliminado = value ;
   }

   public void setgxTv_SdtSDTEditarRol_Segrolcollectioneliminado_SetNull( )
   {
      gxTv_SdtSDTEditarRol_Segrolcollectioneliminado = null ;
   }

   public boolean getgxTv_SdtSDTEditarRol_Segrolcollectioneliminado_IsNull( )
   {
      if ( gxTv_SdtSDTEditarRol_Segrolcollectioneliminado == null )
      {
         return true ;
      }
      return false ;
   }

   public GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem> getgxTv_SdtSDTEditarRol_Segrolcollectionagregado( )
   {
      if ( gxTv_SdtSDTEditarRol_Segrolcollectionagregado == null )
      {
         gxTv_SdtSDTEditarRol_Segrolcollectionagregado = new GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem>(com.orions2.SdtSDTRolUs_SDTRolUsItem.class, "SDTRolUs.SDTRolUsItem", "ACBSENA", remoteHandle);
      }
      return gxTv_SdtSDTEditarRol_Segrolcollectionagregado ;
   }

   public void setgxTv_SdtSDTEditarRol_Segrolcollectionagregado( GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem> value )
   {
      gxTv_SdtSDTEditarRol_Segrolcollectionagregado = value ;
   }

   public void setgxTv_SdtSDTEditarRol_Segrolcollectionagregado_SetNull( )
   {
      gxTv_SdtSDTEditarRol_Segrolcollectionagregado = null ;
   }

   public boolean getgxTv_SdtSDTEditarRol_Segrolcollectionagregado_IsNull( )
   {
      if ( gxTv_SdtSDTEditarRol_Segrolcollectionagregado == null )
      {
         return true ;
      }
      return false ;
   }

   public GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem> getgxTv_SdtSDTEditarRol_Segrolcollection( )
   {
      if ( gxTv_SdtSDTEditarRol_Segrolcollection == null )
      {
         gxTv_SdtSDTEditarRol_Segrolcollection = new GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem>(com.orions2.SdtSDTRolUs_SDTRolUsItem.class, "SDTRolUs.SDTRolUsItem", "ACBSENA", remoteHandle);
      }
      return gxTv_SdtSDTEditarRol_Segrolcollection ;
   }

   public void setgxTv_SdtSDTEditarRol_Segrolcollection( GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem> value )
   {
      gxTv_SdtSDTEditarRol_Segrolcollection = value ;
   }

   public void setgxTv_SdtSDTEditarRol_Segrolcollection_SetNull( )
   {
      gxTv_SdtSDTEditarRol_Segrolcollection = null ;
   }

   public boolean getgxTv_SdtSDTEditarRol_Segrolcollection_IsNull( )
   {
      if ( gxTv_SdtSDTEditarRol_Segrolcollection == null )
      {
         return true ;
      }
      return false ;
   }

   public GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> getgxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado( )
   {
      if ( gxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado == null )
      {
         gxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado = new GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem>(com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem.class, "SDTCentroUsu.SDTCentroUsuItem", "ACBSENA", remoteHandle);
      }
      return gxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado ;
   }

   public void setgxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado( GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> value )
   {
      gxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado = value ;
   }

   public void setgxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado_SetNull( )
   {
      gxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado = null ;
   }

   public boolean getgxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado_IsNull( )
   {
      if ( gxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado == null )
      {
         return true ;
      }
      return false ;
   }

   public GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> getgxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado( )
   {
      if ( gxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado == null )
      {
         gxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado = new GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem>(com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem.class, "SDTCentroUsu.SDTCentroUsuItem", "ACBSENA", remoteHandle);
      }
      return gxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado ;
   }

   public void setgxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado( GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> value )
   {
      gxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado = value ;
   }

   public void setgxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado_SetNull( )
   {
      gxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado = null ;
   }

   public boolean getgxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado_IsNull( )
   {
      if ( gxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado == null )
      {
         return true ;
      }
      return false ;
   }

   public GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> getgxTv_SdtSDTEditarRol_Gencentrocostocollection( )
   {
      if ( gxTv_SdtSDTEditarRol_Gencentrocostocollection == null )
      {
         gxTv_SdtSDTEditarRol_Gencentrocostocollection = new GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem>(com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem.class, "SDTCentroUsu.SDTCentroUsuItem", "ACBSENA", remoteHandle);
      }
      return gxTv_SdtSDTEditarRol_Gencentrocostocollection ;
   }

   public void setgxTv_SdtSDTEditarRol_Gencentrocostocollection( GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> value )
   {
      gxTv_SdtSDTEditarRol_Gencentrocostocollection = value ;
   }

   public void setgxTv_SdtSDTEditarRol_Gencentrocostocollection_SetNull( )
   {
      gxTv_SdtSDTEditarRol_Gencentrocostocollection = null ;
   }

   public boolean getgxTv_SdtSDTEditarRol_Gencentrocostocollection_IsNull( )
   {
      if ( gxTv_SdtSDTEditarRol_Gencentrocostocollection == null )
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
      gxTv_SdtSDTEditarRol_Usuacodigo = "" ;
      gxTv_SdtSDTEditarRol_Usuanombre = "" ;
      gxTv_SdtSDTEditarRol_Usuausuaprueba = "" ;
      gxTv_SdtSDTEditarRol_Usuausuariomodifica = "" ;
      gxTv_SdtSDTEditarRol_Usuafechamodifica = GXutil.resetTime( GXutil.nullDate() );
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public com.orions2.SdtSDTEditarRol Clone( )
   {
      return (com.orions2.SdtSDTEditarRol)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTEditarRol struct )
   {
      setgxTv_SdtSDTEditarRol_Usuacodigo(struct.getUsuacodigo());
      setgxTv_SdtSDTEditarRol_Usuanombre(struct.getUsuanombre());
      setgxTv_SdtSDTEditarRol_Usuacedula(struct.getUsuacedula());
      setgxTv_SdtSDTEditarRol_Usuausuaprueba(struct.getUsuausuaprueba());
      setgxTv_SdtSDTEditarRol_Usuausuariomodifica(struct.getUsuausuariomodifica());
      setgxTv_SdtSDTEditarRol_Usuafechamodifica(struct.getUsuafechamodifica());
      GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem> gxTv_SdtSDTEditarRol_Segrolcollectioneliminado_aux = new GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem>(com.orions2.SdtSDTRolUs_SDTRolUsItem.class, "SDTRolUs.SDTRolUsItem", "ACBSENA", remoteHandle) ;
      GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem> gxTv_SdtSDTEditarRol_Segrolcollectioneliminado_aux1 = new GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem>(com.orions2.SdtSDTRolUs_SDTRolUsItem.class, "SDTRolUs.SDTRolUsItem", "ACBSENA", remoteHandle) ;
      gxTv_SdtSDTEditarRol_Segrolcollectioneliminado_aux1.setStruct(struct.getSegrolcollectioneliminado());
      for (int i = 0; i < gxTv_SdtSDTEditarRol_Segrolcollectioneliminado_aux1.size(); i++)
      {
         gxTv_SdtSDTEditarRol_Segrolcollectioneliminado_aux.add(new com.orions2.SdtSDTRolUs_SDTRolUsItem(gxTv_SdtSDTEditarRol_Segrolcollectioneliminado_aux1.elementAt(i).getStruct()));
      }
      setgxTv_SdtSDTEditarRol_Segrolcollectioneliminado(gxTv_SdtSDTEditarRol_Segrolcollectioneliminado_aux);
      GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem> gxTv_SdtSDTEditarRol_Segrolcollectionagregado_aux = new GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem>(com.orions2.SdtSDTRolUs_SDTRolUsItem.class, "SDTRolUs.SDTRolUsItem", "ACBSENA", remoteHandle) ;
      GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem> gxTv_SdtSDTEditarRol_Segrolcollectionagregado_aux1 = new GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem>(com.orions2.SdtSDTRolUs_SDTRolUsItem.class, "SDTRolUs.SDTRolUsItem", "ACBSENA", remoteHandle) ;
      gxTv_SdtSDTEditarRol_Segrolcollectionagregado_aux1.setStruct(struct.getSegrolcollectionagregado());
      for (int i = 0; i < gxTv_SdtSDTEditarRol_Segrolcollectionagregado_aux1.size(); i++)
      {
         gxTv_SdtSDTEditarRol_Segrolcollectionagregado_aux.add(new com.orions2.SdtSDTRolUs_SDTRolUsItem(gxTv_SdtSDTEditarRol_Segrolcollectionagregado_aux1.elementAt(i).getStruct()));
      }
      setgxTv_SdtSDTEditarRol_Segrolcollectionagregado(gxTv_SdtSDTEditarRol_Segrolcollectionagregado_aux);
      GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem> gxTv_SdtSDTEditarRol_Segrolcollection_aux = new GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem>(com.orions2.SdtSDTRolUs_SDTRolUsItem.class, "SDTRolUs.SDTRolUsItem", "ACBSENA", remoteHandle) ;
      GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem> gxTv_SdtSDTEditarRol_Segrolcollection_aux1 = new GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem>(com.orions2.SdtSDTRolUs_SDTRolUsItem.class, "SDTRolUs.SDTRolUsItem", "ACBSENA", remoteHandle) ;
      gxTv_SdtSDTEditarRol_Segrolcollection_aux1.setStruct(struct.getSegrolcollection());
      for (int i = 0; i < gxTv_SdtSDTEditarRol_Segrolcollection_aux1.size(); i++)
      {
         gxTv_SdtSDTEditarRol_Segrolcollection_aux.add(new com.orions2.SdtSDTRolUs_SDTRolUsItem(gxTv_SdtSDTEditarRol_Segrolcollection_aux1.elementAt(i).getStruct()));
      }
      setgxTv_SdtSDTEditarRol_Segrolcollection(gxTv_SdtSDTEditarRol_Segrolcollection_aux);
      GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> gxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado_aux = new GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem>(com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem.class, "SDTCentroUsu.SDTCentroUsuItem", "ACBSENA", remoteHandle) ;
      GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> gxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado_aux1 = new GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem>(com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem.class, "SDTCentroUsu.SDTCentroUsuItem", "ACBSENA", remoteHandle) ;
      gxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado_aux1.setStruct(struct.getGencentrocostocollectioneliminado());
      for (int i = 0; i < gxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado_aux1.size(); i++)
      {
         gxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado_aux.add(new com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem(gxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado_aux1.elementAt(i).getStruct()));
      }
      setgxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado(gxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado_aux);
      GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> gxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado_aux = new GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem>(com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem.class, "SDTCentroUsu.SDTCentroUsuItem", "ACBSENA", remoteHandle) ;
      GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> gxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado_aux1 = new GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem>(com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem.class, "SDTCentroUsu.SDTCentroUsuItem", "ACBSENA", remoteHandle) ;
      gxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado_aux1.setStruct(struct.getGencentrocostocollectionagregado());
      for (int i = 0; i < gxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado_aux1.size(); i++)
      {
         gxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado_aux.add(new com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem(gxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado_aux1.elementAt(i).getStruct()));
      }
      setgxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado(gxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado_aux);
      GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> gxTv_SdtSDTEditarRol_Gencentrocostocollection_aux = new GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem>(com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem.class, "SDTCentroUsu.SDTCentroUsuItem", "ACBSENA", remoteHandle) ;
      GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> gxTv_SdtSDTEditarRol_Gencentrocostocollection_aux1 = new GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem>(com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem.class, "SDTCentroUsu.SDTCentroUsuItem", "ACBSENA", remoteHandle) ;
      gxTv_SdtSDTEditarRol_Gencentrocostocollection_aux1.setStruct(struct.getGencentrocostocollection());
      for (int i = 0; i < gxTv_SdtSDTEditarRol_Gencentrocostocollection_aux1.size(); i++)
      {
         gxTv_SdtSDTEditarRol_Gencentrocostocollection_aux.add(new com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem(gxTv_SdtSDTEditarRol_Gencentrocostocollection_aux1.elementAt(i).getStruct()));
      }
      setgxTv_SdtSDTEditarRol_Gencentrocostocollection(gxTv_SdtSDTEditarRol_Gencentrocostocollection_aux);
   }

   public com.orions2.StructSdtSDTEditarRol getStruct( )
   {
      com.orions2.StructSdtSDTEditarRol struct = new com.orions2.StructSdtSDTEditarRol ();
      struct.setUsuacodigo(getgxTv_SdtSDTEditarRol_Usuacodigo());
      struct.setUsuanombre(getgxTv_SdtSDTEditarRol_Usuanombre());
      struct.setUsuacedula(getgxTv_SdtSDTEditarRol_Usuacedula());
      struct.setUsuausuaprueba(getgxTv_SdtSDTEditarRol_Usuausuaprueba());
      struct.setUsuausuariomodifica(getgxTv_SdtSDTEditarRol_Usuausuariomodifica());
      struct.setUsuafechamodifica(getgxTv_SdtSDTEditarRol_Usuafechamodifica());
      Vector aux_vectorgxTv_SdtSDTEditarRol_Segrolcollectioneliminado = getgxTv_SdtSDTEditarRol_Segrolcollectioneliminado().getStruct();
      Vector aux_vector1gxTv_SdtSDTEditarRol_Segrolcollectioneliminado = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtSDTEditarRol_Segrolcollectioneliminado.size(); i++)
      {
         aux_vector1gxTv_SdtSDTEditarRol_Segrolcollectioneliminado.addElement(((com.orions2.SdtSDTRolUs_SDTRolUsItem)aux_vectorgxTv_SdtSDTEditarRol_Segrolcollectioneliminado.elementAt(i)).getStruct());
      }
      struct.setSegrolcollectioneliminado(aux_vector1gxTv_SdtSDTEditarRol_Segrolcollectioneliminado);
      Vector aux_vectorgxTv_SdtSDTEditarRol_Segrolcollectionagregado = getgxTv_SdtSDTEditarRol_Segrolcollectionagregado().getStruct();
      Vector aux_vector1gxTv_SdtSDTEditarRol_Segrolcollectionagregado = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtSDTEditarRol_Segrolcollectionagregado.size(); i++)
      {
         aux_vector1gxTv_SdtSDTEditarRol_Segrolcollectionagregado.addElement(((com.orions2.SdtSDTRolUs_SDTRolUsItem)aux_vectorgxTv_SdtSDTEditarRol_Segrolcollectionagregado.elementAt(i)).getStruct());
      }
      struct.setSegrolcollectionagregado(aux_vector1gxTv_SdtSDTEditarRol_Segrolcollectionagregado);
      Vector aux_vectorgxTv_SdtSDTEditarRol_Segrolcollection = getgxTv_SdtSDTEditarRol_Segrolcollection().getStruct();
      Vector aux_vector1gxTv_SdtSDTEditarRol_Segrolcollection = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtSDTEditarRol_Segrolcollection.size(); i++)
      {
         aux_vector1gxTv_SdtSDTEditarRol_Segrolcollection.addElement(((com.orions2.SdtSDTRolUs_SDTRolUsItem)aux_vectorgxTv_SdtSDTEditarRol_Segrolcollection.elementAt(i)).getStruct());
      }
      struct.setSegrolcollection(aux_vector1gxTv_SdtSDTEditarRol_Segrolcollection);
      Vector aux_vectorgxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado = getgxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado().getStruct();
      Vector aux_vector1gxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado.size(); i++)
      {
         aux_vector1gxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado.addElement(((com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem)aux_vectorgxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado.elementAt(i)).getStruct());
      }
      struct.setGencentrocostocollectioneliminado(aux_vector1gxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado);
      Vector aux_vectorgxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado = getgxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado().getStruct();
      Vector aux_vector1gxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado.size(); i++)
      {
         aux_vector1gxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado.addElement(((com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem)aux_vectorgxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado.elementAt(i)).getStruct());
      }
      struct.setGencentrocostocollectionagregado(aux_vector1gxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado);
      Vector aux_vectorgxTv_SdtSDTEditarRol_Gencentrocostocollection = getgxTv_SdtSDTEditarRol_Gencentrocostocollection().getStruct();
      Vector aux_vector1gxTv_SdtSDTEditarRol_Gencentrocostocollection = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtSDTEditarRol_Gencentrocostocollection.size(); i++)
      {
         aux_vector1gxTv_SdtSDTEditarRol_Gencentrocostocollection.addElement(((com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem)aux_vectorgxTv_SdtSDTEditarRol_Gencentrocostocollection.elementAt(i)).getStruct());
      }
      struct.setGencentrocostocollection(aux_vector1gxTv_SdtSDTEditarRol_Gencentrocostocollection);
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSDTEditarRol_Usuacedula ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTEditarRol_Usuafechamodifica ;
   protected java.util.Date datetime_STZ ;
   protected String gxTv_SdtSDTEditarRol_Usuacodigo ;
   protected String gxTv_SdtSDTEditarRol_Usuanombre ;
   protected String gxTv_SdtSDTEditarRol_Usuausuaprueba ;
   protected String gxTv_SdtSDTEditarRol_Usuausuariomodifica ;
   protected GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem> gxTv_SdtSDTEditarRol_Segrolcollectioneliminado_aux ;
   protected GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem> gxTv_SdtSDTEditarRol_Segrolcollectioneliminado_aux1 ;
   protected GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem> gxTv_SdtSDTEditarRol_Segrolcollectionagregado_aux ;
   protected GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem> gxTv_SdtSDTEditarRol_Segrolcollectionagregado_aux1 ;
   protected GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem> gxTv_SdtSDTEditarRol_Segrolcollection_aux ;
   protected GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem> gxTv_SdtSDTEditarRol_Segrolcollection_aux1 ;
   protected GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> gxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado_aux ;
   protected GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> gxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado_aux1 ;
   protected GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> gxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado_aux ;
   protected GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> gxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado_aux1 ;
   protected GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> gxTv_SdtSDTEditarRol_Gencentrocostocollection_aux ;
   protected GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> gxTv_SdtSDTEditarRol_Gencentrocostocollection_aux1 ;
   protected GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem> gxTv_SdtSDTEditarRol_Segrolcollectioneliminado=null ;
   protected GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem> gxTv_SdtSDTEditarRol_Segrolcollectionagregado=null ;
   protected GXBaseCollection<com.orions2.SdtSDTRolUs_SDTRolUsItem> gxTv_SdtSDTEditarRol_Segrolcollection=null ;
   protected GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> gxTv_SdtSDTEditarRol_Gencentrocostocollectioneliminado=null ;
   protected GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> gxTv_SdtSDTEditarRol_Gencentrocostocollectionagregado=null ;
   protected GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> gxTv_SdtSDTEditarRol_Gencentrocostocollection=null ;
}

