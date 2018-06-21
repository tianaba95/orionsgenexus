/*
               File: SdtSDTCentroUsu_SDTCentroUsuItem
        Description: SDTCentroUsu
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:16.92
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

public final  class SdtSDTCentroUsu_SDTCentroUsuItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTCentroUsu_SDTCentroUsuItem( )
   {
      this(  new ModelContext(SdtSDTCentroUsu_SDTCentroUsuItem.class));
   }

   public SdtSDTCentroUsu_SDTCentroUsuItem( ModelContext context )
   {
      super( context, "SdtSDTCentroUsu_SDTCentroUsuItem");
   }

   public SdtSDTCentroUsu_SDTCentroUsuItem( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTCentroUsu_SDTCentroUsuItem");
   }

   public SdtSDTCentroUsu_SDTCentroUsuItem( StructSdtSDTCentroUsu_SDTCentroUsuItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "centCodigo") )
            {
               gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centcodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "centId") )
            {
               gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centid = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "regiCod") )
            {
               gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Regicod = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "regiAbrev") )
            {
               gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Regiabrev = oReader.getValue() ;
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
         sName = "SDTCentroUsu.SDTCentroUsuItem" ;
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
      oWriter.writeElement("centCodigo", GXutil.rtrim( gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centcodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("centId", GXutil.trim( GXutil.str( gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centid, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("regiCod", GXutil.trim( GXutil.str( gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Regicod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("regiAbrev", GXutil.rtrim( gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Regiabrev));
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
      AddObjectProperty("centCodigo", gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centcodigo, false);
      AddObjectProperty("centId", gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centid, false);
      AddObjectProperty("regiCod", gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Regicod, false);
      AddObjectProperty("regiAbrev", gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Regiabrev, false);
   }

   public String getgxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centcodigo( )
   {
      return gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centcodigo ;
   }

   public void setgxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centcodigo( String value )
   {
      gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centcodigo = value ;
   }

   public long getgxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centid( )
   {
      return gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centid ;
   }

   public void setgxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centid( long value )
   {
      gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centid = value ;
   }

   public short getgxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Regicod( )
   {
      return gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Regicod ;
   }

   public void setgxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Regicod( short value )
   {
      gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Regicod = value ;
   }

   public String getgxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Regiabrev( )
   {
      return gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Regiabrev ;
   }

   public void setgxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Regiabrev( String value )
   {
      gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Regiabrev = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centcodigo = "" ;
      gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Regiabrev = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem Clone( )
   {
      return (com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTCentroUsu_SDTCentroUsuItem struct )
   {
      setgxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centcodigo(struct.getCentcodigo());
      setgxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centid(struct.getCentid());
      setgxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Regicod(struct.getRegicod());
      setgxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Regiabrev(struct.getRegiabrev());
   }

   public com.orions2.StructSdtSDTCentroUsu_SDTCentroUsuItem getStruct( )
   {
      com.orions2.StructSdtSDTCentroUsu_SDTCentroUsuItem struct = new com.orions2.StructSdtSDTCentroUsu_SDTCentroUsuItem ();
      struct.setCentcodigo(getgxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centcodigo());
      struct.setCentid(getgxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centid());
      struct.setRegicod(getgxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Regicod());
      struct.setRegiabrev(getgxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Regiabrev());
      return struct ;
   }

   protected short gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Regicod ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centid ;
   protected String sTagName ;
   protected String gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Centcodigo ;
   protected String gxTv_SdtSDTCentroUsu_SDTCentroUsuItem_Regiabrev ;
}

