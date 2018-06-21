/*
               File: SdtSDTRatificar
        Description: SDTRatificar
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:19.63
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

public final  class SdtSDTRatificar extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTRatificar( )
   {
      this(  new ModelContext(SdtSDTRatificar.class));
   }

   public SdtSDTRatificar( ModelContext context )
   {
      super( context, "SdtSDTRatificar");
   }

   public SdtSDTRatificar( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTRatificar");
   }

   public SdtSDTRatificar( StructSdtSDTRatificar struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranId") )
            {
               gxTv_SdtSDTRatificar_Tranid = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranConsecutivoCC") )
            {
               gxTv_SdtSDTRatificar_Tranconsecutivocc = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranRegionCodigo") )
            {
               gxTv_SdtSDTRatificar_Tranregioncodigo = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranRegionAbrev") )
            {
               gxTv_SdtSDTRatificar_Tranregionabrev = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranCodTipoElemento") )
            {
               gxTv_SdtSDTRatificar_Trancodtipoelemento = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ATRIBUTOS") )
            {
               if ( gxTv_SdtSDTRatificar_Atributos == null )
               {
                  gxTv_SdtSDTRatificar_Atributos = new GXBaseCollection<com.orions2.SdtSDTRatificar_ATRIBUTOSItem>(com.orions2.SdtSDTRatificar_ATRIBUTOSItem.class, "SDTRatificar.ATRIBUTOSItem", "ACBSENA", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTRatificar_Atributos.readxmlcollection(oReader, "ATRIBUTOS", "ATRIBUTOSItem") ;
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
         sName = "SDTRatificar" ;
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
      oWriter.writeElement("tranId", GXutil.trim( GXutil.str( gxTv_SdtSDTRatificar_Tranid, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranConsecutivoCC", GXutil.trim( GXutil.str( gxTv_SdtSDTRatificar_Tranconsecutivocc, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranRegionCodigo", GXutil.trim( GXutil.str( gxTv_SdtSDTRatificar_Tranregioncodigo, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranRegionAbrev", GXutil.rtrim( gxTv_SdtSDTRatificar_Tranregionabrev));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranCodTipoElemento", GXutil.trim( GXutil.str( gxTv_SdtSDTRatificar_Trancodtipoelemento, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( gxTv_SdtSDTRatificar_Atributos != null )
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
         gxTv_SdtSDTRatificar_Atributos.writexmlcollection(oWriter, "ATRIBUTOS", sNameSpace1, "ATRIBUTOSItem", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("tranId", gxTv_SdtSDTRatificar_Tranid, false);
      AddObjectProperty("tranConsecutivoCC", GXutil.ltrim( GXutil.str( gxTv_SdtSDTRatificar_Tranconsecutivocc, 18, 0)), false);
      AddObjectProperty("tranRegionCodigo", gxTv_SdtSDTRatificar_Tranregioncodigo, false);
      AddObjectProperty("tranRegionAbrev", gxTv_SdtSDTRatificar_Tranregionabrev, false);
      AddObjectProperty("tranCodTipoElemento", GXutil.ltrim( GXutil.str( gxTv_SdtSDTRatificar_Trancodtipoelemento, 18, 0)), false);
      if ( gxTv_SdtSDTRatificar_Atributos != null )
      {
         AddObjectProperty("ATRIBUTOS", gxTv_SdtSDTRatificar_Atributos, false);
      }
   }

   public long getgxTv_SdtSDTRatificar_Tranid( )
   {
      return gxTv_SdtSDTRatificar_Tranid ;
   }

   public void setgxTv_SdtSDTRatificar_Tranid( long value )
   {
      gxTv_SdtSDTRatificar_Tranid = value ;
   }

   public long getgxTv_SdtSDTRatificar_Tranconsecutivocc( )
   {
      return gxTv_SdtSDTRatificar_Tranconsecutivocc ;
   }

   public void setgxTv_SdtSDTRatificar_Tranconsecutivocc( long value )
   {
      gxTv_SdtSDTRatificar_Tranconsecutivocc = value ;
   }

   public short getgxTv_SdtSDTRatificar_Tranregioncodigo( )
   {
      return gxTv_SdtSDTRatificar_Tranregioncodigo ;
   }

   public void setgxTv_SdtSDTRatificar_Tranregioncodigo( short value )
   {
      gxTv_SdtSDTRatificar_Tranregioncodigo = value ;
   }

   public String getgxTv_SdtSDTRatificar_Tranregionabrev( )
   {
      return gxTv_SdtSDTRatificar_Tranregionabrev ;
   }

   public void setgxTv_SdtSDTRatificar_Tranregionabrev( String value )
   {
      gxTv_SdtSDTRatificar_Tranregionabrev = value ;
   }

   public long getgxTv_SdtSDTRatificar_Trancodtipoelemento( )
   {
      return gxTv_SdtSDTRatificar_Trancodtipoelemento ;
   }

   public void setgxTv_SdtSDTRatificar_Trancodtipoelemento( long value )
   {
      gxTv_SdtSDTRatificar_Trancodtipoelemento = value ;
   }

   public GXBaseCollection<com.orions2.SdtSDTRatificar_ATRIBUTOSItem> getgxTv_SdtSDTRatificar_Atributos( )
   {
      if ( gxTv_SdtSDTRatificar_Atributos == null )
      {
         gxTv_SdtSDTRatificar_Atributos = new GXBaseCollection<com.orions2.SdtSDTRatificar_ATRIBUTOSItem>(com.orions2.SdtSDTRatificar_ATRIBUTOSItem.class, "SDTRatificar.ATRIBUTOSItem", "ACBSENA", remoteHandle);
      }
      return gxTv_SdtSDTRatificar_Atributos ;
   }

   public void setgxTv_SdtSDTRatificar_Atributos( GXBaseCollection<com.orions2.SdtSDTRatificar_ATRIBUTOSItem> value )
   {
      gxTv_SdtSDTRatificar_Atributos = value ;
   }

   public void setgxTv_SdtSDTRatificar_Atributos_SetNull( )
   {
      gxTv_SdtSDTRatificar_Atributos = null ;
   }

   public boolean getgxTv_SdtSDTRatificar_Atributos_IsNull( )
   {
      if ( gxTv_SdtSDTRatificar_Atributos == null )
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
      gxTv_SdtSDTRatificar_Tranregionabrev = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTRatificar Clone( )
   {
      return (com.orions2.SdtSDTRatificar)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTRatificar struct )
   {
      setgxTv_SdtSDTRatificar_Tranid(struct.getTranid());
      setgxTv_SdtSDTRatificar_Tranconsecutivocc(struct.getTranconsecutivocc());
      setgxTv_SdtSDTRatificar_Tranregioncodigo(struct.getTranregioncodigo());
      setgxTv_SdtSDTRatificar_Tranregionabrev(struct.getTranregionabrev());
      setgxTv_SdtSDTRatificar_Trancodtipoelemento(struct.getTrancodtipoelemento());
      GXBaseCollection<com.orions2.SdtSDTRatificar_ATRIBUTOSItem> gxTv_SdtSDTRatificar_Atributos_aux = new GXBaseCollection<com.orions2.SdtSDTRatificar_ATRIBUTOSItem>(com.orions2.SdtSDTRatificar_ATRIBUTOSItem.class, "SDTRatificar.ATRIBUTOSItem", "ACBSENA", remoteHandle) ;
      GXBaseCollection<com.orions2.SdtSDTRatificar_ATRIBUTOSItem> gxTv_SdtSDTRatificar_Atributos_aux1 = new GXBaseCollection<com.orions2.SdtSDTRatificar_ATRIBUTOSItem>(com.orions2.SdtSDTRatificar_ATRIBUTOSItem.class, "SDTRatificar.ATRIBUTOSItem", "ACBSENA", remoteHandle) ;
      gxTv_SdtSDTRatificar_Atributos_aux1.setStruct(struct.getAtributos());
      for (int i = 0; i < gxTv_SdtSDTRatificar_Atributos_aux1.size(); i++)
      {
         gxTv_SdtSDTRatificar_Atributos_aux.add(new com.orions2.SdtSDTRatificar_ATRIBUTOSItem(gxTv_SdtSDTRatificar_Atributos_aux1.elementAt(i).getStruct()));
      }
      setgxTv_SdtSDTRatificar_Atributos(gxTv_SdtSDTRatificar_Atributos_aux);
   }

   public com.orions2.StructSdtSDTRatificar getStruct( )
   {
      com.orions2.StructSdtSDTRatificar struct = new com.orions2.StructSdtSDTRatificar ();
      struct.setTranid(getgxTv_SdtSDTRatificar_Tranid());
      struct.setTranconsecutivocc(getgxTv_SdtSDTRatificar_Tranconsecutivocc());
      struct.setTranregioncodigo(getgxTv_SdtSDTRatificar_Tranregioncodigo());
      struct.setTranregionabrev(getgxTv_SdtSDTRatificar_Tranregionabrev());
      struct.setTrancodtipoelemento(getgxTv_SdtSDTRatificar_Trancodtipoelemento());
      Vector aux_vectorgxTv_SdtSDTRatificar_Atributos = getgxTv_SdtSDTRatificar_Atributos().getStruct();
      Vector aux_vector1gxTv_SdtSDTRatificar_Atributos = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtSDTRatificar_Atributos.size(); i++)
      {
         aux_vector1gxTv_SdtSDTRatificar_Atributos.addElement(((com.orions2.SdtSDTRatificar_ATRIBUTOSItem)aux_vectorgxTv_SdtSDTRatificar_Atributos.elementAt(i)).getStruct());
      }
      struct.setAtributos(aux_vector1gxTv_SdtSDTRatificar_Atributos);
      return struct ;
   }

   protected short gxTv_SdtSDTRatificar_Tranregioncodigo ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSDTRatificar_Tranid ;
   protected long gxTv_SdtSDTRatificar_Tranconsecutivocc ;
   protected long gxTv_SdtSDTRatificar_Trancodtipoelemento ;
   protected String sTagName ;
   protected String gxTv_SdtSDTRatificar_Tranregionabrev ;
   protected GXBaseCollection<com.orions2.SdtSDTRatificar_ATRIBUTOSItem> gxTv_SdtSDTRatificar_Atributos_aux ;
   protected GXBaseCollection<com.orions2.SdtSDTRatificar_ATRIBUTOSItem> gxTv_SdtSDTRatificar_Atributos_aux1 ;
   protected GXBaseCollection<com.orions2.SdtSDTRatificar_ATRIBUTOSItem> gxTv_SdtSDTRatificar_Atributos=null ;
}

