/*
               File: Sdtsdtcambiarestadotransaccion
        Description: sdtcambiarestadotransaccion
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:16.79
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

public final  class Sdtsdtcambiarestadotransaccion extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public Sdtsdtcambiarestadotransaccion( )
   {
      this(  new ModelContext(Sdtsdtcambiarestadotransaccion.class));
   }

   public Sdtsdtcambiarestadotransaccion( ModelContext context )
   {
      super( context, "Sdtsdtcambiarestadotransaccion");
   }

   public Sdtsdtcambiarestadotransaccion( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle, context, "Sdtsdtcambiarestadotransaccion");
   }

   public Sdtsdtcambiarestadotransaccion( StructSdtsdtcambiarestadotransaccion struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranRegionCodigo") )
            {
               gxTv_Sdtsdtcambiarestadotransaccion_Tranregioncodigo = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranRegionAbrev") )
            {
               gxTv_Sdtsdtcambiarestadotransaccion_Tranregionabrev = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranId") )
            {
               gxTv_Sdtsdtcambiarestadotransaccion_Tranid = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranModuloOrigen") )
            {
               gxTv_Sdtsdtcambiarestadotransaccion_Tranmoduloorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranModuloDestino") )
            {
               gxTv_Sdtsdtcambiarestadotransaccion_Tranmodulodestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranEstado") )
            {
               gxTv_Sdtsdtcambiarestadotransaccion_Tranestado = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "tranTipoElemento") )
            {
               gxTv_Sdtsdtcambiarestadotransaccion_Trantipoelemento = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "detalles") )
            {
               if ( gxTv_Sdtsdtcambiarestadotransaccion_Detalles == null )
               {
                  gxTv_Sdtsdtcambiarestadotransaccion_Detalles = new GXBaseCollection<com.orions2.Sdtsdtcambiarestadotransaccion_detallesitem>(com.orions2.Sdtsdtcambiarestadotransaccion_detallesitem.class, "sdtcambiarestadotransaccion.detallesitem", "ACBSENA", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_Sdtsdtcambiarestadotransaccion_Detalles.readxmlcollection(oReader, "detalles", "detallesitem") ;
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
         sName = "sdtcambiarestadotransaccion" ;
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
      oWriter.writeElement("tranRegionCodigo", GXutil.trim( GXutil.str( gxTv_Sdtsdtcambiarestadotransaccion_Tranregioncodigo, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranRegionAbrev", GXutil.rtrim( gxTv_Sdtsdtcambiarestadotransaccion_Tranregionabrev));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranId", GXutil.trim( GXutil.str( gxTv_Sdtsdtcambiarestadotransaccion_Tranid, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranModuloOrigen", GXutil.rtrim( gxTv_Sdtsdtcambiarestadotransaccion_Tranmoduloorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranModuloDestino", GXutil.rtrim( gxTv_Sdtsdtcambiarestadotransaccion_Tranmodulodestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranEstado", GXutil.rtrim( gxTv_Sdtsdtcambiarestadotransaccion_Tranestado));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("tranTipoElemento", GXutil.rtrim( gxTv_Sdtsdtcambiarestadotransaccion_Trantipoelemento));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( gxTv_Sdtsdtcambiarestadotransaccion_Detalles != null )
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
         gxTv_Sdtsdtcambiarestadotransaccion_Detalles.writexmlcollection(oWriter, "detalles", sNameSpace1, "detallesitem", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("tranRegionCodigo", gxTv_Sdtsdtcambiarestadotransaccion_Tranregioncodigo, false);
      AddObjectProperty("tranRegionAbrev", gxTv_Sdtsdtcambiarestadotransaccion_Tranregionabrev, false);
      AddObjectProperty("tranId", gxTv_Sdtsdtcambiarestadotransaccion_Tranid, false);
      AddObjectProperty("tranModuloOrigen", gxTv_Sdtsdtcambiarestadotransaccion_Tranmoduloorigen, false);
      AddObjectProperty("tranModuloDestino", gxTv_Sdtsdtcambiarestadotransaccion_Tranmodulodestino, false);
      AddObjectProperty("tranEstado", gxTv_Sdtsdtcambiarestadotransaccion_Tranestado, false);
      AddObjectProperty("tranTipoElemento", gxTv_Sdtsdtcambiarestadotransaccion_Trantipoelemento, false);
      if ( gxTv_Sdtsdtcambiarestadotransaccion_Detalles != null )
      {
         AddObjectProperty("detalles", gxTv_Sdtsdtcambiarestadotransaccion_Detalles, false);
      }
   }

   public int getgxTv_Sdtsdtcambiarestadotransaccion_Tranregioncodigo( )
   {
      return gxTv_Sdtsdtcambiarestadotransaccion_Tranregioncodigo ;
   }

   public void setgxTv_Sdtsdtcambiarestadotransaccion_Tranregioncodigo( int value )
   {
      gxTv_Sdtsdtcambiarestadotransaccion_Tranregioncodigo = value ;
   }

   public String getgxTv_Sdtsdtcambiarestadotransaccion_Tranregionabrev( )
   {
      return gxTv_Sdtsdtcambiarestadotransaccion_Tranregionabrev ;
   }

   public void setgxTv_Sdtsdtcambiarestadotransaccion_Tranregionabrev( String value )
   {
      gxTv_Sdtsdtcambiarestadotransaccion_Tranregionabrev = value ;
   }

   public long getgxTv_Sdtsdtcambiarestadotransaccion_Tranid( )
   {
      return gxTv_Sdtsdtcambiarestadotransaccion_Tranid ;
   }

   public void setgxTv_Sdtsdtcambiarestadotransaccion_Tranid( long value )
   {
      gxTv_Sdtsdtcambiarestadotransaccion_Tranid = value ;
   }

   public String getgxTv_Sdtsdtcambiarestadotransaccion_Tranmoduloorigen( )
   {
      return gxTv_Sdtsdtcambiarestadotransaccion_Tranmoduloorigen ;
   }

   public void setgxTv_Sdtsdtcambiarestadotransaccion_Tranmoduloorigen( String value )
   {
      gxTv_Sdtsdtcambiarestadotransaccion_Tranmoduloorigen = value ;
   }

   public String getgxTv_Sdtsdtcambiarestadotransaccion_Tranmodulodestino( )
   {
      return gxTv_Sdtsdtcambiarestadotransaccion_Tranmodulodestino ;
   }

   public void setgxTv_Sdtsdtcambiarestadotransaccion_Tranmodulodestino( String value )
   {
      gxTv_Sdtsdtcambiarestadotransaccion_Tranmodulodestino = value ;
   }

   public String getgxTv_Sdtsdtcambiarestadotransaccion_Tranestado( )
   {
      return gxTv_Sdtsdtcambiarestadotransaccion_Tranestado ;
   }

   public void setgxTv_Sdtsdtcambiarestadotransaccion_Tranestado( String value )
   {
      gxTv_Sdtsdtcambiarestadotransaccion_Tranestado = value ;
   }

   public String getgxTv_Sdtsdtcambiarestadotransaccion_Trantipoelemento( )
   {
      return gxTv_Sdtsdtcambiarestadotransaccion_Trantipoelemento ;
   }

   public void setgxTv_Sdtsdtcambiarestadotransaccion_Trantipoelemento( String value )
   {
      gxTv_Sdtsdtcambiarestadotransaccion_Trantipoelemento = value ;
   }

   public GXBaseCollection<com.orions2.Sdtsdtcambiarestadotransaccion_detallesitem> getgxTv_Sdtsdtcambiarestadotransaccion_Detalles( )
   {
      if ( gxTv_Sdtsdtcambiarestadotransaccion_Detalles == null )
      {
         gxTv_Sdtsdtcambiarestadotransaccion_Detalles = new GXBaseCollection<com.orions2.Sdtsdtcambiarestadotransaccion_detallesitem>(com.orions2.Sdtsdtcambiarestadotransaccion_detallesitem.class, "sdtcambiarestadotransaccion.detallesitem", "ACBSENA", remoteHandle);
      }
      return gxTv_Sdtsdtcambiarestadotransaccion_Detalles ;
   }

   public void setgxTv_Sdtsdtcambiarestadotransaccion_Detalles( GXBaseCollection<com.orions2.Sdtsdtcambiarestadotransaccion_detallesitem> value )
   {
      gxTv_Sdtsdtcambiarestadotransaccion_Detalles = value ;
   }

   public void setgxTv_Sdtsdtcambiarestadotransaccion_Detalles_SetNull( )
   {
      gxTv_Sdtsdtcambiarestadotransaccion_Detalles = null ;
   }

   public boolean getgxTv_Sdtsdtcambiarestadotransaccion_Detalles_IsNull( )
   {
      if ( gxTv_Sdtsdtcambiarestadotransaccion_Detalles == null )
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
      gxTv_Sdtsdtcambiarestadotransaccion_Tranregionabrev = "" ;
      gxTv_Sdtsdtcambiarestadotransaccion_Tranmoduloorigen = "" ;
      gxTv_Sdtsdtcambiarestadotransaccion_Tranmodulodestino = "" ;
      gxTv_Sdtsdtcambiarestadotransaccion_Tranestado = "" ;
      gxTv_Sdtsdtcambiarestadotransaccion_Trantipoelemento = "" ;
      sTagName = "" ;
   }

   public com.orions2.Sdtsdtcambiarestadotransaccion Clone( )
   {
      return (com.orions2.Sdtsdtcambiarestadotransaccion)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtsdtcambiarestadotransaccion struct )
   {
      setgxTv_Sdtsdtcambiarestadotransaccion_Tranregioncodigo(struct.getTranregioncodigo());
      setgxTv_Sdtsdtcambiarestadotransaccion_Tranregionabrev(struct.getTranregionabrev());
      setgxTv_Sdtsdtcambiarestadotransaccion_Tranid(struct.getTranid());
      setgxTv_Sdtsdtcambiarestadotransaccion_Tranmoduloorigen(struct.getTranmoduloorigen());
      setgxTv_Sdtsdtcambiarestadotransaccion_Tranmodulodestino(struct.getTranmodulodestino());
      setgxTv_Sdtsdtcambiarestadotransaccion_Tranestado(struct.getTranestado());
      setgxTv_Sdtsdtcambiarestadotransaccion_Trantipoelemento(struct.getTrantipoelemento());
      GXBaseCollection<com.orions2.Sdtsdtcambiarestadotransaccion_detallesitem> gxTv_Sdtsdtcambiarestadotransaccion_Detalles_aux = new GXBaseCollection<com.orions2.Sdtsdtcambiarestadotransaccion_detallesitem>(com.orions2.Sdtsdtcambiarestadotransaccion_detallesitem.class, "sdtcambiarestadotransaccion.detallesitem", "ACBSENA", remoteHandle) ;
      GXBaseCollection<com.orions2.Sdtsdtcambiarestadotransaccion_detallesitem> gxTv_Sdtsdtcambiarestadotransaccion_Detalles_aux1 = new GXBaseCollection<com.orions2.Sdtsdtcambiarestadotransaccion_detallesitem>(com.orions2.Sdtsdtcambiarestadotransaccion_detallesitem.class, "sdtcambiarestadotransaccion.detallesitem", "ACBSENA", remoteHandle) ;
      gxTv_Sdtsdtcambiarestadotransaccion_Detalles_aux1.setStruct(struct.getDetalles());
      for (int i = 0; i < gxTv_Sdtsdtcambiarestadotransaccion_Detalles_aux1.size(); i++)
      {
         gxTv_Sdtsdtcambiarestadotransaccion_Detalles_aux.add(new com.orions2.Sdtsdtcambiarestadotransaccion_detallesitem(gxTv_Sdtsdtcambiarestadotransaccion_Detalles_aux1.elementAt(i).getStruct()));
      }
      setgxTv_Sdtsdtcambiarestadotransaccion_Detalles(gxTv_Sdtsdtcambiarestadotransaccion_Detalles_aux);
   }

   public com.orions2.StructSdtsdtcambiarestadotransaccion getStruct( )
   {
      com.orions2.StructSdtsdtcambiarestadotransaccion struct = new com.orions2.StructSdtsdtcambiarestadotransaccion ();
      struct.setTranregioncodigo(getgxTv_Sdtsdtcambiarestadotransaccion_Tranregioncodigo());
      struct.setTranregionabrev(getgxTv_Sdtsdtcambiarestadotransaccion_Tranregionabrev());
      struct.setTranid(getgxTv_Sdtsdtcambiarestadotransaccion_Tranid());
      struct.setTranmoduloorigen(getgxTv_Sdtsdtcambiarestadotransaccion_Tranmoduloorigen());
      struct.setTranmodulodestino(getgxTv_Sdtsdtcambiarestadotransaccion_Tranmodulodestino());
      struct.setTranestado(getgxTv_Sdtsdtcambiarestadotransaccion_Tranestado());
      struct.setTrantipoelemento(getgxTv_Sdtsdtcambiarestadotransaccion_Trantipoelemento());
      Vector aux_vectorgxTv_Sdtsdtcambiarestadotransaccion_Detalles = getgxTv_Sdtsdtcambiarestadotransaccion_Detalles().getStruct();
      Vector aux_vector1gxTv_Sdtsdtcambiarestadotransaccion_Detalles = new Vector();
      for (int i = 0; i < aux_vectorgxTv_Sdtsdtcambiarestadotransaccion_Detalles.size(); i++)
      {
         aux_vector1gxTv_Sdtsdtcambiarestadotransaccion_Detalles.addElement(((com.orions2.Sdtsdtcambiarestadotransaccion_detallesitem)aux_vectorgxTv_Sdtsdtcambiarestadotransaccion_Detalles.elementAt(i)).getStruct());
      }
      struct.setDetalles(aux_vector1gxTv_Sdtsdtcambiarestadotransaccion_Detalles);
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_Sdtsdtcambiarestadotransaccion_Tranregioncodigo ;
   protected long gxTv_Sdtsdtcambiarestadotransaccion_Tranid ;
   protected String gxTv_Sdtsdtcambiarestadotransaccion_Tranestado ;
   protected String gxTv_Sdtsdtcambiarestadotransaccion_Trantipoelemento ;
   protected String sTagName ;
   protected String gxTv_Sdtsdtcambiarestadotransaccion_Tranregionabrev ;
   protected String gxTv_Sdtsdtcambiarestadotransaccion_Tranmoduloorigen ;
   protected String gxTv_Sdtsdtcambiarestadotransaccion_Tranmodulodestino ;
   protected GXBaseCollection<com.orions2.Sdtsdtcambiarestadotransaccion_detallesitem> gxTv_Sdtsdtcambiarestadotransaccion_Detalles_aux ;
   protected GXBaseCollection<com.orions2.Sdtsdtcambiarestadotransaccion_detallesitem> gxTv_Sdtsdtcambiarestadotransaccion_Detalles_aux1 ;
   protected GXBaseCollection<com.orions2.Sdtsdtcambiarestadotransaccion_detallesitem> gxTv_Sdtsdtcambiarestadotransaccion_Detalles=null ;
}

