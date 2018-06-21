/*
               File: SdtSDTEditarCCU
        Description: SDTEditarCCU
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:17.51
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

public final  class SdtSDTEditarCCU extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTEditarCCU( )
   {
      this(  new ModelContext(SdtSDTEditarCCU.class));
   }

   public SdtSDTEditarCCU( ModelContext context )
   {
      super( context, "SdtSDTEditarCCU");
   }

   public SdtSDTEditarCCU( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTEditarCCU");
   }

   public SdtSDTEditarCCU( StructSdtSDTEditarCCU struct )
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
               gxTv_SdtSDTEditarCCU_Usuacodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "genCentrocostoCollectionEliminado") )
            {
               if ( gxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado == null )
               {
                  gxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado = new GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem>(com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem.class, "SDTCentroUsu.SDTCentroUsuItem", "ACBSENA", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado.readxml(oReader, "genCentrocostoCollectionEliminado") ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "genCentrocostoCollectionAgregado") )
            {
               if ( gxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado == null )
               {
                  gxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado = new GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem>(com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem.class, "SDTCentroUsu.SDTCentroUsuItem", "ACBSENA", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado.readxml(oReader, "genCentrocostoCollectionAgregado") ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "genCentrocostoCollection") )
            {
               if ( gxTv_SdtSDTEditarCCU_Gencentrocostocollection == null )
               {
                  gxTv_SdtSDTEditarCCU_Gencentrocostocollection = new GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem>(com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem.class, "SDTCentroUsu.SDTCentroUsuItem", "ACBSENA", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtSDTEditarCCU_Gencentrocostocollection.readxml(oReader, "genCentrocostoCollection") ;
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
         sName = "SDTEditarCCU" ;
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
      oWriter.writeElement("usuaCodigo", GXutil.rtrim( gxTv_SdtSDTEditarCCU_Usuacodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( gxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado != null )
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
         gxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado.writexml(oWriter, "genCentrocostoCollectionEliminado", sNameSpace1);
      }
      if ( gxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado != null )
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
         gxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado.writexml(oWriter, "genCentrocostoCollectionAgregado", sNameSpace1);
      }
      if ( gxTv_SdtSDTEditarCCU_Gencentrocostocollection != null )
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
         gxTv_SdtSDTEditarCCU_Gencentrocostocollection.writexml(oWriter, "genCentrocostoCollection", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("usuaCodigo", gxTv_SdtSDTEditarCCU_Usuacodigo, false);
      if ( gxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado != null )
      {
         AddObjectProperty("genCentrocostoCollectionEliminado", gxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado, false);
      }
      if ( gxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado != null )
      {
         AddObjectProperty("genCentrocostoCollectionAgregado", gxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado, false);
      }
      if ( gxTv_SdtSDTEditarCCU_Gencentrocostocollection != null )
      {
         AddObjectProperty("genCentrocostoCollection", gxTv_SdtSDTEditarCCU_Gencentrocostocollection, false);
      }
   }

   public String getgxTv_SdtSDTEditarCCU_Usuacodigo( )
   {
      return gxTv_SdtSDTEditarCCU_Usuacodigo ;
   }

   public void setgxTv_SdtSDTEditarCCU_Usuacodigo( String value )
   {
      gxTv_SdtSDTEditarCCU_Usuacodigo = value ;
   }

   public GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> getgxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado( )
   {
      if ( gxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado == null )
      {
         gxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado = new GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem>(com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem.class, "SDTCentroUsu.SDTCentroUsuItem", "ACBSENA", remoteHandle);
      }
      return gxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado ;
   }

   public void setgxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado( GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> value )
   {
      gxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado = value ;
   }

   public void setgxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado_SetNull( )
   {
      gxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado = null ;
   }

   public boolean getgxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado_IsNull( )
   {
      if ( gxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado == null )
      {
         return true ;
      }
      return false ;
   }

   public GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> getgxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado( )
   {
      if ( gxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado == null )
      {
         gxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado = new GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem>(com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem.class, "SDTCentroUsu.SDTCentroUsuItem", "ACBSENA", remoteHandle);
      }
      return gxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado ;
   }

   public void setgxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado( GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> value )
   {
      gxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado = value ;
   }

   public void setgxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado_SetNull( )
   {
      gxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado = null ;
   }

   public boolean getgxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado_IsNull( )
   {
      if ( gxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado == null )
      {
         return true ;
      }
      return false ;
   }

   public GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> getgxTv_SdtSDTEditarCCU_Gencentrocostocollection( )
   {
      if ( gxTv_SdtSDTEditarCCU_Gencentrocostocollection == null )
      {
         gxTv_SdtSDTEditarCCU_Gencentrocostocollection = new GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem>(com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem.class, "SDTCentroUsu.SDTCentroUsuItem", "ACBSENA", remoteHandle);
      }
      return gxTv_SdtSDTEditarCCU_Gencentrocostocollection ;
   }

   public void setgxTv_SdtSDTEditarCCU_Gencentrocostocollection( GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> value )
   {
      gxTv_SdtSDTEditarCCU_Gencentrocostocollection = value ;
   }

   public void setgxTv_SdtSDTEditarCCU_Gencentrocostocollection_SetNull( )
   {
      gxTv_SdtSDTEditarCCU_Gencentrocostocollection = null ;
   }

   public boolean getgxTv_SdtSDTEditarCCU_Gencentrocostocollection_IsNull( )
   {
      if ( gxTv_SdtSDTEditarCCU_Gencentrocostocollection == null )
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
      gxTv_SdtSDTEditarCCU_Usuacodigo = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTEditarCCU Clone( )
   {
      return (com.orions2.SdtSDTEditarCCU)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTEditarCCU struct )
   {
      setgxTv_SdtSDTEditarCCU_Usuacodigo(struct.getUsuacodigo());
      GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> gxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado_aux = new GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem>(com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem.class, "SDTCentroUsu.SDTCentroUsuItem", "ACBSENA", remoteHandle) ;
      GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> gxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado_aux1 = new GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem>(com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem.class, "SDTCentroUsu.SDTCentroUsuItem", "ACBSENA", remoteHandle) ;
      gxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado_aux1.setStruct(struct.getGencentrocostocollectioneliminado());
      for (int i = 0; i < gxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado_aux1.size(); i++)
      {
         gxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado_aux.add(new com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem(gxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado_aux1.elementAt(i).getStruct()));
      }
      setgxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado(gxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado_aux);
      GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> gxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado_aux = new GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem>(com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem.class, "SDTCentroUsu.SDTCentroUsuItem", "ACBSENA", remoteHandle) ;
      GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> gxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado_aux1 = new GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem>(com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem.class, "SDTCentroUsu.SDTCentroUsuItem", "ACBSENA", remoteHandle) ;
      gxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado_aux1.setStruct(struct.getGencentrocostocollectionagregado());
      for (int i = 0; i < gxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado_aux1.size(); i++)
      {
         gxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado_aux.add(new com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem(gxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado_aux1.elementAt(i).getStruct()));
      }
      setgxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado(gxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado_aux);
      GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> gxTv_SdtSDTEditarCCU_Gencentrocostocollection_aux = new GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem>(com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem.class, "SDTCentroUsu.SDTCentroUsuItem", "ACBSENA", remoteHandle) ;
      GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> gxTv_SdtSDTEditarCCU_Gencentrocostocollection_aux1 = new GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem>(com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem.class, "SDTCentroUsu.SDTCentroUsuItem", "ACBSENA", remoteHandle) ;
      gxTv_SdtSDTEditarCCU_Gencentrocostocollection_aux1.setStruct(struct.getGencentrocostocollection());
      for (int i = 0; i < gxTv_SdtSDTEditarCCU_Gencentrocostocollection_aux1.size(); i++)
      {
         gxTv_SdtSDTEditarCCU_Gencentrocostocollection_aux.add(new com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem(gxTv_SdtSDTEditarCCU_Gencentrocostocollection_aux1.elementAt(i).getStruct()));
      }
      setgxTv_SdtSDTEditarCCU_Gencentrocostocollection(gxTv_SdtSDTEditarCCU_Gencentrocostocollection_aux);
   }

   public com.orions2.StructSdtSDTEditarCCU getStruct( )
   {
      com.orions2.StructSdtSDTEditarCCU struct = new com.orions2.StructSdtSDTEditarCCU ();
      struct.setUsuacodigo(getgxTv_SdtSDTEditarCCU_Usuacodigo());
      Vector aux_vectorgxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado = getgxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado().getStruct();
      Vector aux_vector1gxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado.size(); i++)
      {
         aux_vector1gxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado.addElement(((com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem)aux_vectorgxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado.elementAt(i)).getStruct());
      }
      struct.setGencentrocostocollectioneliminado(aux_vector1gxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado);
      Vector aux_vectorgxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado = getgxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado().getStruct();
      Vector aux_vector1gxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado.size(); i++)
      {
         aux_vector1gxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado.addElement(((com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem)aux_vectorgxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado.elementAt(i)).getStruct());
      }
      struct.setGencentrocostocollectionagregado(aux_vector1gxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado);
      Vector aux_vectorgxTv_SdtSDTEditarCCU_Gencentrocostocollection = getgxTv_SdtSDTEditarCCU_Gencentrocostocollection().getStruct();
      Vector aux_vector1gxTv_SdtSDTEditarCCU_Gencentrocostocollection = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtSDTEditarCCU_Gencentrocostocollection.size(); i++)
      {
         aux_vector1gxTv_SdtSDTEditarCCU_Gencentrocostocollection.addElement(((com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem)aux_vectorgxTv_SdtSDTEditarCCU_Gencentrocostocollection.elementAt(i)).getStruct());
      }
      struct.setGencentrocostocollection(aux_vector1gxTv_SdtSDTEditarCCU_Gencentrocostocollection);
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtSDTEditarCCU_Usuacodigo ;
   protected GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> gxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado_aux ;
   protected GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> gxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado_aux1 ;
   protected GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> gxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado_aux ;
   protected GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> gxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado_aux1 ;
   protected GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> gxTv_SdtSDTEditarCCU_Gencentrocostocollection_aux ;
   protected GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> gxTv_SdtSDTEditarCCU_Gencentrocostocollection_aux1 ;
   protected GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> gxTv_SdtSDTEditarCCU_Gencentrocostocollectioneliminado=null ;
   protected GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> gxTv_SdtSDTEditarCCU_Gencentrocostocollectionagregado=null ;
   protected GXBaseCollection<com.orions2.SdtSDTCentroUsu_SDTCentroUsuItem> gxTv_SdtSDTEditarCCU_Gencentrocostocollection=null ;
}

