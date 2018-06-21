/*
               File: SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem
        Description: SDTInactivarUsuarios
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:18.40
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

public final  class SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem( )
   {
      this(  new ModelContext(SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem.class));
   }

   public SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem( ModelContext context )
   {
      super( context, "SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem");
   }

   public SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem( int remoteHandle ,
                                                            ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem");
   }

   public SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem( StructSdtSDTInactivarUsuarios_SDTInactivarUsuariosItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "tipoActivacion") )
            {
               gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Tipoactivacion = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "usuaCodigo") )
            {
               gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Usuacodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "genCentrocostoCollection") )
            {
               if ( gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection == null )
               {
                  gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection = new GXBaseCollection<com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem>(com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem.class, "SDTInactivarUsuarios.SDTInactivarUsuariosItem.genCentrocostoCollectionItem", "ACBSENA", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection.readxmlcollection(oReader, "genCentrocostoCollection", "genCentrocostoCollectionItem") ;
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
         sName = "SDTInactivarUsuarios.SDTInactivarUsuariosItem" ;
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
      oWriter.writeElement("tipoActivacion", GXutil.trim( GXutil.str( gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Tipoactivacion, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("usuaCodigo", GXutil.rtrim( gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Usuacodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection != null )
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
         gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection.writexmlcollection(oWriter, "genCentrocostoCollection", sNameSpace1, "genCentrocostoCollectionItem", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("tipoActivacion", gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Tipoactivacion, false);
      AddObjectProperty("usuaCodigo", gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Usuacodigo, false);
      if ( gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection != null )
      {
         AddObjectProperty("genCentrocostoCollection", gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection, false);
      }
   }

   public byte getgxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Tipoactivacion( )
   {
      return gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Tipoactivacion ;
   }

   public void setgxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Tipoactivacion( byte value )
   {
      gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Tipoactivacion = value ;
   }

   public String getgxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Usuacodigo( )
   {
      return gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Usuacodigo ;
   }

   public void setgxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Usuacodigo( String value )
   {
      gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Usuacodigo = value ;
   }

   public GXBaseCollection<com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem> getgxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection( )
   {
      if ( gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection == null )
      {
         gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection = new GXBaseCollection<com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem>(com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem.class, "SDTInactivarUsuarios.SDTInactivarUsuariosItem.genCentrocostoCollectionItem", "ACBSENA", remoteHandle);
      }
      return gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection ;
   }

   public void setgxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection( GXBaseCollection<com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem> value )
   {
      gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection = value ;
   }

   public void setgxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection_SetNull( )
   {
      gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection = null ;
   }

   public boolean getgxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection_IsNull( )
   {
      if ( gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection == null )
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
      gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Usuacodigo = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem Clone( )
   {
      return (com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTInactivarUsuarios_SDTInactivarUsuariosItem struct )
   {
      setgxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Tipoactivacion(struct.getTipoactivacion());
      setgxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Usuacodigo(struct.getUsuacodigo());
      GXBaseCollection<com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem> gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection_aux = new GXBaseCollection<com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem>(com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem.class, "SDTInactivarUsuarios.SDTInactivarUsuariosItem.genCentrocostoCollectionItem", "ACBSENA", remoteHandle) ;
      GXBaseCollection<com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem> gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection_aux1 = new GXBaseCollection<com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem>(com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem.class, "SDTInactivarUsuarios.SDTInactivarUsuariosItem.genCentrocostoCollectionItem", "ACBSENA", remoteHandle) ;
      gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection_aux1.setStruct(struct.getGencentrocostocollection());
      for (int i = 0; i < gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection_aux1.size(); i++)
      {
         gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection_aux.add(new com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem(gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection_aux1.elementAt(i).getStruct()));
      }
      setgxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection(gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection_aux);
   }

   public com.orions2.StructSdtSDTInactivarUsuarios_SDTInactivarUsuariosItem getStruct( )
   {
      com.orions2.StructSdtSDTInactivarUsuarios_SDTInactivarUsuariosItem struct = new com.orions2.StructSdtSDTInactivarUsuarios_SDTInactivarUsuariosItem ();
      struct.setTipoactivacion(getgxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Tipoactivacion());
      struct.setUsuacodigo(getgxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Usuacodigo());
      Vector aux_vectorgxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection = getgxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection().getStruct();
      Vector aux_vector1gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection.size(); i++)
      {
         aux_vector1gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection.addElement(((com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem)aux_vectorgxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection.elementAt(i)).getStruct());
      }
      struct.setGencentrocostocollection(aux_vector1gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection);
      return struct ;
   }

   protected byte gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Tipoactivacion ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Usuacodigo ;
   protected GXBaseCollection<com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem> gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection_aux ;
   protected GXBaseCollection<com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem> gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection_aux1 ;
   protected GXBaseCollection<com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_genCentrocostoCollectionItem> gxTv_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem_Gencentrocostocollection=null ;
}

