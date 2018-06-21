/*
               File: SdtSDTHVHijos_SDTHVHijosItem
        Description: SDTHVHijos
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:18.29
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

public final  class SdtSDTHVHijos_SDTHVHijosItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTHVHijos_SDTHVHijosItem( )
   {
      this(  new ModelContext(SdtSDTHVHijos_SDTHVHijosItem.class));
   }

   public SdtSDTHVHijos_SDTHVHijosItem( ModelContext context )
   {
      super( context, "SdtSDTHVHijos_SDTHVHijosItem");
   }

   public SdtSDTHVHijos_SDTHVHijosItem( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTHVHijos_SDTHVHijosItem");
   }

   public SdtSDTHVHijos_SDTHVHijosItem( StructSdtSDTHVHijos_SDTHVHijosItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "gElem_Consecutivo") )
            {
               gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gelem_consecutivo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "gCata_Descripcion") )
            {
               gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gcata_descripcion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "gInvd_NumeroPlaca") )
            {
               gxTv_SdtSDTHVHijos_SDTHVHijosItem_Ginvd_numeroplaca = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "gMarca") )
            {
               gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gmarca = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "gSerial") )
            {
               gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gserial = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "gModelo") )
            {
               gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gmodelo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "gTDet_Observaciones") )
            {
               gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gtdet_observaciones = oReader.getValue() ;
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
         sName = "SDTHVHijos.SDTHVHijosItem" ;
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
      oWriter.writeElement("gElem_Consecutivo", GXutil.rtrim( gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gelem_consecutivo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("gCata_Descripcion", GXutil.rtrim( gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gcata_descripcion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("gInvd_NumeroPlaca", GXutil.rtrim( gxTv_SdtSDTHVHijos_SDTHVHijosItem_Ginvd_numeroplaca));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("gMarca", GXutil.rtrim( gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gmarca));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("gSerial", GXutil.rtrim( gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gserial));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("gModelo", GXutil.rtrim( gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gmodelo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("gTDet_Observaciones", GXutil.rtrim( gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gtdet_observaciones));
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
      AddObjectProperty("gElem_Consecutivo", gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gelem_consecutivo, false);
      AddObjectProperty("gCata_Descripcion", gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gcata_descripcion, false);
      AddObjectProperty("gInvd_NumeroPlaca", gxTv_SdtSDTHVHijos_SDTHVHijosItem_Ginvd_numeroplaca, false);
      AddObjectProperty("gMarca", gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gmarca, false);
      AddObjectProperty("gSerial", gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gserial, false);
      AddObjectProperty("gModelo", gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gmodelo, false);
      AddObjectProperty("gTDet_Observaciones", gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gtdet_observaciones, false);
   }

   public String getgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gelem_consecutivo( )
   {
      return gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gelem_consecutivo ;
   }

   public void setgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gelem_consecutivo( String value )
   {
      gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gelem_consecutivo = value ;
   }

   public String getgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gcata_descripcion( )
   {
      return gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gcata_descripcion ;
   }

   public void setgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gcata_descripcion( String value )
   {
      gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gcata_descripcion = value ;
   }

   public String getgxTv_SdtSDTHVHijos_SDTHVHijosItem_Ginvd_numeroplaca( )
   {
      return gxTv_SdtSDTHVHijos_SDTHVHijosItem_Ginvd_numeroplaca ;
   }

   public void setgxTv_SdtSDTHVHijos_SDTHVHijosItem_Ginvd_numeroplaca( String value )
   {
      gxTv_SdtSDTHVHijos_SDTHVHijosItem_Ginvd_numeroplaca = value ;
   }

   public String getgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gmarca( )
   {
      return gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gmarca ;
   }

   public void setgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gmarca( String value )
   {
      gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gmarca = value ;
   }

   public String getgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gserial( )
   {
      return gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gserial ;
   }

   public void setgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gserial( String value )
   {
      gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gserial = value ;
   }

   public String getgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gmodelo( )
   {
      return gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gmodelo ;
   }

   public void setgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gmodelo( String value )
   {
      gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gmodelo = value ;
   }

   public String getgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gtdet_observaciones( )
   {
      return gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gtdet_observaciones ;
   }

   public void setgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gtdet_observaciones( String value )
   {
      gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gtdet_observaciones = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gelem_consecutivo = "" ;
      gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gcata_descripcion = "" ;
      gxTv_SdtSDTHVHijos_SDTHVHijosItem_Ginvd_numeroplaca = "" ;
      gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gmarca = "" ;
      gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gserial = "" ;
      gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gmodelo = "" ;
      gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gtdet_observaciones = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTHVHijos_SDTHVHijosItem Clone( )
   {
      return (com.orions2.SdtSDTHVHijos_SDTHVHijosItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTHVHijos_SDTHVHijosItem struct )
   {
      setgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gelem_consecutivo(struct.getGelem_consecutivo());
      setgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gcata_descripcion(struct.getGcata_descripcion());
      setgxTv_SdtSDTHVHijos_SDTHVHijosItem_Ginvd_numeroplaca(struct.getGinvd_numeroplaca());
      setgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gmarca(struct.getGmarca());
      setgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gserial(struct.getGserial());
      setgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gmodelo(struct.getGmodelo());
      setgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gtdet_observaciones(struct.getGtdet_observaciones());
   }

   public com.orions2.StructSdtSDTHVHijos_SDTHVHijosItem getStruct( )
   {
      com.orions2.StructSdtSDTHVHijos_SDTHVHijosItem struct = new com.orions2.StructSdtSDTHVHijos_SDTHVHijosItem ();
      struct.setGelem_consecutivo(getgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gelem_consecutivo());
      struct.setGcata_descripcion(getgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gcata_descripcion());
      struct.setGinvd_numeroplaca(getgxTv_SdtSDTHVHijos_SDTHVHijosItem_Ginvd_numeroplaca());
      struct.setGmarca(getgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gmarca());
      struct.setGserial(getgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gserial());
      struct.setGmodelo(getgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gmodelo());
      struct.setGtdet_observaciones(getgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gtdet_observaciones());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gelem_consecutivo ;
   protected String gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gcata_descripcion ;
   protected String gxTv_SdtSDTHVHijos_SDTHVHijosItem_Ginvd_numeroplaca ;
   protected String gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gmarca ;
   protected String gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gserial ;
   protected String gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gmodelo ;
   protected String gxTv_SdtSDTHVHijos_SDTHVHijosItem_Gtdet_observaciones ;
}

