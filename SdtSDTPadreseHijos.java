/*
               File: SdtSDTPadreseHijos
        Description: SDTPadreseHijos
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:19.45
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

public final  class SdtSDTPadreseHijos extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTPadreseHijos( )
   {
      this(  new ModelContext(SdtSDTPadreseHijos.class));
   }

   public SdtSDTPadreseHijos( ModelContext context )
   {
      super( context, "SdtSDTPadreseHijos");
   }

   public SdtSDTPadreseHijos( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTPadreseHijos");
   }

   public SdtSDTPadreseHijos( StructSdtSDTPadreseHijos struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "regiAbrev") )
            {
               gxTv_SdtSDTPadreseHijos_Regiabrev = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "regiCod") )
            {
               gxTv_SdtSDTPadreseHijos_Regicod = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Placas") )
            {
               if ( gxTv_SdtSDTPadreseHijos_Placas == null )
               {
                  gxTv_SdtSDTPadreseHijos_Placas = new GXBaseCollection<com.orions2.SdtSDTPadreseHijos_PlacasItem>(com.orions2.SdtSDTPadreseHijos_PlacasItem.class, "SDTPadreseHijos.PlacasItem", "ACBSENA", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTPadreseHijos_Placas.readxmlcollection(oReader, "Placas", "PlacasItem") ;
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
         sName = "SDTPadreseHijos" ;
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
      oWriter.writeElement("regiAbrev", GXutil.rtrim( gxTv_SdtSDTPadreseHijos_Regiabrev));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("regiCod", GXutil.trim( GXutil.str( gxTv_SdtSDTPadreseHijos_Regicod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( gxTv_SdtSDTPadreseHijos_Placas != null )
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
         gxTv_SdtSDTPadreseHijos_Placas.writexmlcollection(oWriter, "Placas", sNameSpace1, "PlacasItem", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("regiAbrev", gxTv_SdtSDTPadreseHijos_Regiabrev, false);
      AddObjectProperty("regiCod", gxTv_SdtSDTPadreseHijos_Regicod, false);
      if ( gxTv_SdtSDTPadreseHijos_Placas != null )
      {
         AddObjectProperty("Placas", gxTv_SdtSDTPadreseHijos_Placas, false);
      }
   }

   public String getgxTv_SdtSDTPadreseHijos_Regiabrev( )
   {
      return gxTv_SdtSDTPadreseHijos_Regiabrev ;
   }

   public void setgxTv_SdtSDTPadreseHijos_Regiabrev( String value )
   {
      gxTv_SdtSDTPadreseHijos_Regiabrev = value ;
   }

   public short getgxTv_SdtSDTPadreseHijos_Regicod( )
   {
      return gxTv_SdtSDTPadreseHijos_Regicod ;
   }

   public void setgxTv_SdtSDTPadreseHijos_Regicod( short value )
   {
      gxTv_SdtSDTPadreseHijos_Regicod = value ;
   }

   public GXBaseCollection<com.orions2.SdtSDTPadreseHijos_PlacasItem> getgxTv_SdtSDTPadreseHijos_Placas( )
   {
      if ( gxTv_SdtSDTPadreseHijos_Placas == null )
      {
         gxTv_SdtSDTPadreseHijos_Placas = new GXBaseCollection<com.orions2.SdtSDTPadreseHijos_PlacasItem>(com.orions2.SdtSDTPadreseHijos_PlacasItem.class, "SDTPadreseHijos.PlacasItem", "ACBSENA", remoteHandle);
      }
      return gxTv_SdtSDTPadreseHijos_Placas ;
   }

   public void setgxTv_SdtSDTPadreseHijos_Placas( GXBaseCollection<com.orions2.SdtSDTPadreseHijos_PlacasItem> value )
   {
      gxTv_SdtSDTPadreseHijos_Placas = value ;
   }

   public void setgxTv_SdtSDTPadreseHijos_Placas_SetNull( )
   {
      gxTv_SdtSDTPadreseHijos_Placas = null ;
   }

   public boolean getgxTv_SdtSDTPadreseHijos_Placas_IsNull( )
   {
      if ( gxTv_SdtSDTPadreseHijos_Placas == null )
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
      gxTv_SdtSDTPadreseHijos_Regiabrev = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTPadreseHijos Clone( )
   {
      return (com.orions2.SdtSDTPadreseHijos)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTPadreseHijos struct )
   {
      setgxTv_SdtSDTPadreseHijos_Regiabrev(struct.getRegiabrev());
      setgxTv_SdtSDTPadreseHijos_Regicod(struct.getRegicod());
      GXBaseCollection<com.orions2.SdtSDTPadreseHijos_PlacasItem> gxTv_SdtSDTPadreseHijos_Placas_aux = new GXBaseCollection<com.orions2.SdtSDTPadreseHijos_PlacasItem>(com.orions2.SdtSDTPadreseHijos_PlacasItem.class, "SDTPadreseHijos.PlacasItem", "ACBSENA", remoteHandle) ;
      GXBaseCollection<com.orions2.SdtSDTPadreseHijos_PlacasItem> gxTv_SdtSDTPadreseHijos_Placas_aux1 = new GXBaseCollection<com.orions2.SdtSDTPadreseHijos_PlacasItem>(com.orions2.SdtSDTPadreseHijos_PlacasItem.class, "SDTPadreseHijos.PlacasItem", "ACBSENA", remoteHandle) ;
      gxTv_SdtSDTPadreseHijos_Placas_aux1.setStruct(struct.getPlacas());
      for (int i = 0; i < gxTv_SdtSDTPadreseHijos_Placas_aux1.size(); i++)
      {
         gxTv_SdtSDTPadreseHijos_Placas_aux.add(new com.orions2.SdtSDTPadreseHijos_PlacasItem(gxTv_SdtSDTPadreseHijos_Placas_aux1.elementAt(i).getStruct()));
      }
      setgxTv_SdtSDTPadreseHijos_Placas(gxTv_SdtSDTPadreseHijos_Placas_aux);
   }

   public com.orions2.StructSdtSDTPadreseHijos getStruct( )
   {
      com.orions2.StructSdtSDTPadreseHijos struct = new com.orions2.StructSdtSDTPadreseHijos ();
      struct.setRegiabrev(getgxTv_SdtSDTPadreseHijos_Regiabrev());
      struct.setRegicod(getgxTv_SdtSDTPadreseHijos_Regicod());
      Vector aux_vectorgxTv_SdtSDTPadreseHijos_Placas = getgxTv_SdtSDTPadreseHijos_Placas().getStruct();
      Vector aux_vector1gxTv_SdtSDTPadreseHijos_Placas = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtSDTPadreseHijos_Placas.size(); i++)
      {
         aux_vector1gxTv_SdtSDTPadreseHijos_Placas.addElement(((com.orions2.SdtSDTPadreseHijos_PlacasItem)aux_vectorgxTv_SdtSDTPadreseHijos_Placas.elementAt(i)).getStruct());
      }
      struct.setPlacas(aux_vector1gxTv_SdtSDTPadreseHijos_Placas);
      return struct ;
   }

   protected short gxTv_SdtSDTPadreseHijos_Regicod ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtSDTPadreseHijos_Regiabrev ;
   protected GXBaseCollection<com.orions2.SdtSDTPadreseHijos_PlacasItem> gxTv_SdtSDTPadreseHijos_Placas_aux ;
   protected GXBaseCollection<com.orions2.SdtSDTPadreseHijos_PlacasItem> gxTv_SdtSDTPadreseHijos_Placas_aux1 ;
   protected GXBaseCollection<com.orions2.SdtSDTPadreseHijos_PlacasItem> gxTv_SdtSDTPadreseHijos_Placas=null ;
}

