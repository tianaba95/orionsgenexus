/*
               File: SdtSDTUsuarios_genCentrocostoCollectionItem
        Description: SDTUsuarios
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 18, 2018 13:32:47.82
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

public final  class SdtSDTUsuarios_genCentrocostoCollectionItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTUsuarios_genCentrocostoCollectionItem( )
   {
      this(  new ModelContext(SdtSDTUsuarios_genCentrocostoCollectionItem.class));
   }

   public SdtSDTUsuarios_genCentrocostoCollectionItem( ModelContext context )
   {
      super( context, "SdtSDTUsuarios_genCentrocostoCollectionItem");
   }

   public SdtSDTUsuarios_genCentrocostoCollectionItem( int remoteHandle ,
                                                       ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTUsuarios_genCentrocostoCollectionItem");
   }

   public SdtSDTUsuarios_genCentrocostoCollectionItem( StructSdtSDTUsuarios_genCentrocostoCollectionItem struct )
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
               gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Centcodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "centDescripcion") )
            {
               gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Centdescripcion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "regiCod") )
            {
               gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regicod = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "regiDescripcion") )
            {
               gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regidescripcion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "regiAbrev") )
            {
               gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regiabrev = oReader.getValue() ;
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
         sName = "SDTUsuarios.genCentrocostoCollectionItem" ;
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
      oWriter.writeElement("centCodigo", GXutil.rtrim( gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Centcodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("centDescripcion", GXutil.rtrim( gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Centdescripcion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("regiCod", GXutil.trim( GXutil.str( gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regicod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("regiDescripcion", GXutil.rtrim( gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regidescripcion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("regiAbrev", GXutil.rtrim( gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regiabrev));
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
      AddObjectProperty("centCodigo", gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Centcodigo, false);
      AddObjectProperty("centDescripcion", gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Centdescripcion, false);
      AddObjectProperty("regiCod", gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regicod, false);
      AddObjectProperty("regiDescripcion", gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regidescripcion, false);
      AddObjectProperty("regiAbrev", gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regiabrev, false);
   }

   public String getgxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Centcodigo( )
   {
      return gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Centcodigo ;
   }

   public void setgxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Centcodigo( String value )
   {
      gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Centcodigo = value ;
   }

   public String getgxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Centdescripcion( )
   {
      return gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Centdescripcion ;
   }

   public void setgxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Centdescripcion( String value )
   {
      gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Centdescripcion = value ;
   }

   public short getgxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regicod( )
   {
      return gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regicod ;
   }

   public void setgxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regicod( short value )
   {
      gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regicod = value ;
   }

   public String getgxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regidescripcion( )
   {
      return gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regidescripcion ;
   }

   public void setgxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regidescripcion( String value )
   {
      gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regidescripcion = value ;
   }

   public String getgxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regiabrev( )
   {
      return gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regiabrev ;
   }

   public void setgxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regiabrev( String value )
   {
      gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regiabrev = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Centcodigo = "" ;
      gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Centdescripcion = "" ;
      gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regidescripcion = "" ;
      gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regiabrev = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTUsuarios_genCentrocostoCollectionItem Clone( )
   {
      return (com.orions2.SdtSDTUsuarios_genCentrocostoCollectionItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTUsuarios_genCentrocostoCollectionItem struct )
   {
      setgxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Centcodigo(struct.getCentcodigo());
      setgxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Centdescripcion(struct.getCentdescripcion());
      setgxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regicod(struct.getRegicod());
      setgxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regidescripcion(struct.getRegidescripcion());
      setgxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regiabrev(struct.getRegiabrev());
   }

   public com.orions2.StructSdtSDTUsuarios_genCentrocostoCollectionItem getStruct( )
   {
      com.orions2.StructSdtSDTUsuarios_genCentrocostoCollectionItem struct = new com.orions2.StructSdtSDTUsuarios_genCentrocostoCollectionItem ();
      struct.setCentcodigo(getgxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Centcodigo());
      struct.setCentdescripcion(getgxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Centdescripcion());
      struct.setRegicod(getgxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regicod());
      struct.setRegidescripcion(getgxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regidescripcion());
      struct.setRegiabrev(getgxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regiabrev());
      return struct ;
   }

   protected short gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regicod ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Centcodigo ;
   protected String gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Centdescripcion ;
   protected String gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regidescripcion ;
   protected String gxTv_SdtSDTUsuarios_genCentrocostoCollectionItem_Regiabrev ;
}

