/*
               File: SdtSDTCambiaContrasena
        Description: SDTCambiaContrasena
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:16.73
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

public final  class SdtSDTCambiaContrasena extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTCambiaContrasena( )
   {
      this(  new ModelContext(SdtSDTCambiaContrasena.class));
   }

   public SdtSDTCambiaContrasena( ModelContext context )
   {
      super( context, "SdtSDTCambiaContrasena");
   }

   public SdtSDTCambiaContrasena( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTCambiaContrasena");
   }

   public SdtSDTCambiaContrasena( StructSdtSDTCambiaContrasena struct )
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
               gxTv_SdtSDTCambiaContrasena_Usuacodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "usuaClave") )
            {
               gxTv_SdtSDTCambiaContrasena_Usuaclave = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "genCentrocostoCollection") )
            {
               if ( gxTv_SdtSDTCambiaContrasena_Gencentrocostocollection == null )
               {
                  gxTv_SdtSDTCambiaContrasena_Gencentrocostocollection = new GXBaseCollection<com.orions2.SdtSDTCambiaContrasena_genCentrocostoCollectionItem>(com.orions2.SdtSDTCambiaContrasena_genCentrocostoCollectionItem.class, "SDTCambiaContrasena.genCentrocostoCollectionItem", "ACBSENA", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTCambiaContrasena_Gencentrocostocollection.readxmlcollection(oReader, "genCentrocostoCollection", "genCentrocostoCollectionItem") ;
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
         sName = "SDTCambiaContrasena" ;
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
      oWriter.writeElement("usuaCodigo", GXutil.rtrim( gxTv_SdtSDTCambiaContrasena_Usuacodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("usuaClave", GXutil.rtrim( gxTv_SdtSDTCambiaContrasena_Usuaclave));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( gxTv_SdtSDTCambiaContrasena_Gencentrocostocollection != null )
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
         gxTv_SdtSDTCambiaContrasena_Gencentrocostocollection.writexmlcollection(oWriter, "genCentrocostoCollection", sNameSpace1, "genCentrocostoCollectionItem", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("usuaCodigo", gxTv_SdtSDTCambiaContrasena_Usuacodigo, false);
      AddObjectProperty("usuaClave", gxTv_SdtSDTCambiaContrasena_Usuaclave, false);
      if ( gxTv_SdtSDTCambiaContrasena_Gencentrocostocollection != null )
      {
         AddObjectProperty("genCentrocostoCollection", gxTv_SdtSDTCambiaContrasena_Gencentrocostocollection, false);
      }
   }

   public String getgxTv_SdtSDTCambiaContrasena_Usuacodigo( )
   {
      return gxTv_SdtSDTCambiaContrasena_Usuacodigo ;
   }

   public void setgxTv_SdtSDTCambiaContrasena_Usuacodigo( String value )
   {
      gxTv_SdtSDTCambiaContrasena_Usuacodigo = value ;
   }

   public String getgxTv_SdtSDTCambiaContrasena_Usuaclave( )
   {
      return gxTv_SdtSDTCambiaContrasena_Usuaclave ;
   }

   public void setgxTv_SdtSDTCambiaContrasena_Usuaclave( String value )
   {
      gxTv_SdtSDTCambiaContrasena_Usuaclave = value ;
   }

   public GXBaseCollection<com.orions2.SdtSDTCambiaContrasena_genCentrocostoCollectionItem> getgxTv_SdtSDTCambiaContrasena_Gencentrocostocollection( )
   {
      if ( gxTv_SdtSDTCambiaContrasena_Gencentrocostocollection == null )
      {
         gxTv_SdtSDTCambiaContrasena_Gencentrocostocollection = new GXBaseCollection<com.orions2.SdtSDTCambiaContrasena_genCentrocostoCollectionItem>(com.orions2.SdtSDTCambiaContrasena_genCentrocostoCollectionItem.class, "SDTCambiaContrasena.genCentrocostoCollectionItem", "ACBSENA", remoteHandle);
      }
      return gxTv_SdtSDTCambiaContrasena_Gencentrocostocollection ;
   }

   public void setgxTv_SdtSDTCambiaContrasena_Gencentrocostocollection( GXBaseCollection<com.orions2.SdtSDTCambiaContrasena_genCentrocostoCollectionItem> value )
   {
      gxTv_SdtSDTCambiaContrasena_Gencentrocostocollection = value ;
   }

   public void setgxTv_SdtSDTCambiaContrasena_Gencentrocostocollection_SetNull( )
   {
      gxTv_SdtSDTCambiaContrasena_Gencentrocostocollection = null ;
   }

   public boolean getgxTv_SdtSDTCambiaContrasena_Gencentrocostocollection_IsNull( )
   {
      if ( gxTv_SdtSDTCambiaContrasena_Gencentrocostocollection == null )
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
      gxTv_SdtSDTCambiaContrasena_Usuacodigo = "" ;
      gxTv_SdtSDTCambiaContrasena_Usuaclave = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTCambiaContrasena Clone( )
   {
      return (com.orions2.SdtSDTCambiaContrasena)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTCambiaContrasena struct )
   {
      setgxTv_SdtSDTCambiaContrasena_Usuacodigo(struct.getUsuacodigo());
      setgxTv_SdtSDTCambiaContrasena_Usuaclave(struct.getUsuaclave());
      GXBaseCollection<com.orions2.SdtSDTCambiaContrasena_genCentrocostoCollectionItem> gxTv_SdtSDTCambiaContrasena_Gencentrocostocollection_aux = new GXBaseCollection<com.orions2.SdtSDTCambiaContrasena_genCentrocostoCollectionItem>(com.orions2.SdtSDTCambiaContrasena_genCentrocostoCollectionItem.class, "SDTCambiaContrasena.genCentrocostoCollectionItem", "ACBSENA", remoteHandle) ;
      GXBaseCollection<com.orions2.SdtSDTCambiaContrasena_genCentrocostoCollectionItem> gxTv_SdtSDTCambiaContrasena_Gencentrocostocollection_aux1 = new GXBaseCollection<com.orions2.SdtSDTCambiaContrasena_genCentrocostoCollectionItem>(com.orions2.SdtSDTCambiaContrasena_genCentrocostoCollectionItem.class, "SDTCambiaContrasena.genCentrocostoCollectionItem", "ACBSENA", remoteHandle) ;
      gxTv_SdtSDTCambiaContrasena_Gencentrocostocollection_aux1.setStruct(struct.getGencentrocostocollection());
      for (int i = 0; i < gxTv_SdtSDTCambiaContrasena_Gencentrocostocollection_aux1.size(); i++)
      {
         gxTv_SdtSDTCambiaContrasena_Gencentrocostocollection_aux.add(new com.orions2.SdtSDTCambiaContrasena_genCentrocostoCollectionItem(gxTv_SdtSDTCambiaContrasena_Gencentrocostocollection_aux1.elementAt(i).getStruct()));
      }
      setgxTv_SdtSDTCambiaContrasena_Gencentrocostocollection(gxTv_SdtSDTCambiaContrasena_Gencentrocostocollection_aux);
   }

   public com.orions2.StructSdtSDTCambiaContrasena getStruct( )
   {
      com.orions2.StructSdtSDTCambiaContrasena struct = new com.orions2.StructSdtSDTCambiaContrasena ();
      struct.setUsuacodigo(getgxTv_SdtSDTCambiaContrasena_Usuacodigo());
      struct.setUsuaclave(getgxTv_SdtSDTCambiaContrasena_Usuaclave());
      Vector aux_vectorgxTv_SdtSDTCambiaContrasena_Gencentrocostocollection = getgxTv_SdtSDTCambiaContrasena_Gencentrocostocollection().getStruct();
      Vector aux_vector1gxTv_SdtSDTCambiaContrasena_Gencentrocostocollection = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtSDTCambiaContrasena_Gencentrocostocollection.size(); i++)
      {
         aux_vector1gxTv_SdtSDTCambiaContrasena_Gencentrocostocollection.addElement(((com.orions2.SdtSDTCambiaContrasena_genCentrocostoCollectionItem)aux_vectorgxTv_SdtSDTCambiaContrasena_Gencentrocostocollection.elementAt(i)).getStruct());
      }
      struct.setGencentrocostocollection(aux_vector1gxTv_SdtSDTCambiaContrasena_Gencentrocostocollection);
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtSDTCambiaContrasena_Usuacodigo ;
   protected String gxTv_SdtSDTCambiaContrasena_Usuaclave ;
   protected GXBaseCollection<com.orions2.SdtSDTCambiaContrasena_genCentrocostoCollectionItem> gxTv_SdtSDTCambiaContrasena_Gencentrocostocollection_aux ;
   protected GXBaseCollection<com.orions2.SdtSDTCambiaContrasena_genCentrocostoCollectionItem> gxTv_SdtSDTCambiaContrasena_Gencentrocostocollection_aux1 ;
   protected GXBaseCollection<com.orions2.SdtSDTCambiaContrasena_genCentrocostoCollectionItem> gxTv_SdtSDTCambiaContrasena_Gencentrocostocollection=null ;
}

