/*
               File: SdtSDTCambiaContrasena_genCentrocostoCollectionItem
        Description: SDTCambiaContrasena
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:16.76
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

public final  class SdtSDTCambiaContrasena_genCentrocostoCollectionItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTCambiaContrasena_genCentrocostoCollectionItem( )
   {
      this(  new ModelContext(SdtSDTCambiaContrasena_genCentrocostoCollectionItem.class));
   }

   public SdtSDTCambiaContrasena_genCentrocostoCollectionItem( ModelContext context )
   {
      super( context, "SdtSDTCambiaContrasena_genCentrocostoCollectionItem");
   }

   public SdtSDTCambiaContrasena_genCentrocostoCollectionItem( int remoteHandle ,
                                                               ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTCambiaContrasena_genCentrocostoCollectionItem");
   }

   public SdtSDTCambiaContrasena_genCentrocostoCollectionItem( StructSdtSDTCambiaContrasena_genCentrocostoCollectionItem struct )
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
               gxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Centcodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "centDescripcion") )
            {
               gxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Centdescripcion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "regiCod") )
            {
               gxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regicod = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "regiDescripcion") )
            {
               gxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regidescripcion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "regiAbrev") )
            {
               gxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regiabrev = oReader.getValue() ;
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
         sName = "SDTCambiaContrasena.genCentrocostoCollectionItem" ;
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
      oWriter.writeElement("centCodigo", GXutil.rtrim( gxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Centcodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("centDescripcion", GXutil.rtrim( gxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Centdescripcion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("regiCod", GXutil.trim( GXutil.str( gxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regicod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("regiDescripcion", GXutil.rtrim( gxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regidescripcion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("regiAbrev", GXutil.rtrim( gxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regiabrev));
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
      AddObjectProperty("centCodigo", gxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Centcodigo, false);
      AddObjectProperty("centDescripcion", gxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Centdescripcion, false);
      AddObjectProperty("regiCod", gxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regicod, false);
      AddObjectProperty("regiDescripcion", gxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regidescripcion, false);
      AddObjectProperty("regiAbrev", gxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regiabrev, false);
   }

   public String getgxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Centcodigo( )
   {
      return gxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Centcodigo ;
   }

   public void setgxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Centcodigo( String value )
   {
      gxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Centcodigo = value ;
   }

   public String getgxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Centdescripcion( )
   {
      return gxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Centdescripcion ;
   }

   public void setgxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Centdescripcion( String value )
   {
      gxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Centdescripcion = value ;
   }

   public short getgxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regicod( )
   {
      return gxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regicod ;
   }

   public void setgxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regicod( short value )
   {
      gxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regicod = value ;
   }

   public String getgxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regidescripcion( )
   {
      return gxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regidescripcion ;
   }

   public void setgxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regidescripcion( String value )
   {
      gxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regidescripcion = value ;
   }

   public String getgxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regiabrev( )
   {
      return gxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regiabrev ;
   }

   public void setgxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regiabrev( String value )
   {
      gxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regiabrev = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Centcodigo = "" ;
      gxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Centdescripcion = "" ;
      gxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regidescripcion = "" ;
      gxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regiabrev = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTCambiaContrasena_genCentrocostoCollectionItem Clone( )
   {
      return (com.orions2.SdtSDTCambiaContrasena_genCentrocostoCollectionItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTCambiaContrasena_genCentrocostoCollectionItem struct )
   {
      setgxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Centcodigo(struct.getCentcodigo());
      setgxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Centdescripcion(struct.getCentdescripcion());
      setgxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regicod(struct.getRegicod());
      setgxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regidescripcion(struct.getRegidescripcion());
      setgxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regiabrev(struct.getRegiabrev());
   }

   public com.orions2.StructSdtSDTCambiaContrasena_genCentrocostoCollectionItem getStruct( )
   {
      com.orions2.StructSdtSDTCambiaContrasena_genCentrocostoCollectionItem struct = new com.orions2.StructSdtSDTCambiaContrasena_genCentrocostoCollectionItem ();
      struct.setCentcodigo(getgxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Centcodigo());
      struct.setCentdescripcion(getgxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Centdescripcion());
      struct.setRegicod(getgxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regicod());
      struct.setRegidescripcion(getgxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regidescripcion());
      struct.setRegiabrev(getgxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regiabrev());
      return struct ;
   }

   protected short gxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regicod ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Centcodigo ;
   protected String gxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Centdescripcion ;
   protected String gxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regidescripcion ;
   protected String gxTv_SdtSDTCambiaContrasena_genCentrocostoCollectionItem_Regiabrev ;
}

