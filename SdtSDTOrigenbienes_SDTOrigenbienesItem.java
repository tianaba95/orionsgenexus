/*
               File: SdtSDTOrigenbienes_SDTOrigenbienesItem
        Description: SDTOrigenbienes
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:19.42
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

public final  class SdtSDTOrigenbienes_SDTOrigenbienesItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTOrigenbienes_SDTOrigenbienesItem( )
   {
      this(  new ModelContext(SdtSDTOrigenbienes_SDTOrigenbienesItem.class));
   }

   public SdtSDTOrigenbienes_SDTOrigenbienesItem( ModelContext context )
   {
      super( context, "SdtSDTOrigenbienes_SDTOrigenbienesItem");
   }

   public SdtSDTOrigenbienes_SDTOrigenbienesItem( int remoteHandle ,
                                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTOrigenbienes_SDTOrigenbienesItem");
   }

   public SdtSDTOrigenbienes_SDTOrigenbienesItem( StructSdtSDTOrigenbienes_SDTOrigenbienesItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Orig_Identificador") )
            {
               gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Orig_identificador = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Orig_Descripcion") )
            {
               gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Orig_descripcion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tpmo_SolicitaNumero") )
            {
               gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Tpmo_solicitanumero = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tpmo_SolicitaFecha") )
            {
               gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Tpmo_solicitafecha = oReader.getValue() ;
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
         sName = "SDTOrigenbienes.SDTOrigenbienesItem" ;
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
      oWriter.writeElement("Orig_Identificador", GXutil.trim( GXutil.str( gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Orig_identificador, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Orig_Descripcion", GXutil.rtrim( gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Orig_descripcion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tpmo_SolicitaNumero", GXutil.rtrim( gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Tpmo_solicitanumero));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tpmo_SolicitaFecha", GXutil.rtrim( gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Tpmo_solicitafecha));
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
      AddObjectProperty("Orig_Identificador", gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Orig_identificador, false);
      AddObjectProperty("Orig_Descripcion", gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Orig_descripcion, false);
      AddObjectProperty("Tpmo_SolicitaNumero", gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Tpmo_solicitanumero, false);
      AddObjectProperty("Tpmo_SolicitaFecha", gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Tpmo_solicitafecha, false);
   }

   public long getgxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Orig_identificador( )
   {
      return gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Orig_identificador ;
   }

   public void setgxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Orig_identificador( long value )
   {
      gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Orig_identificador = value ;
   }

   public String getgxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Orig_descripcion( )
   {
      return gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Orig_descripcion ;
   }

   public void setgxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Orig_descripcion( String value )
   {
      gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Orig_descripcion = value ;
   }

   public String getgxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Tpmo_solicitanumero( )
   {
      return gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Tpmo_solicitanumero ;
   }

   public void setgxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Tpmo_solicitanumero( String value )
   {
      gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Tpmo_solicitanumero = value ;
   }

   public String getgxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Tpmo_solicitafecha( )
   {
      return gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Tpmo_solicitafecha ;
   }

   public void setgxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Tpmo_solicitafecha( String value )
   {
      gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Tpmo_solicitafecha = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Orig_descripcion = "" ;
      gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Tpmo_solicitanumero = "" ;
      gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Tpmo_solicitafecha = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTOrigenbienes_SDTOrigenbienesItem Clone( )
   {
      return (com.orions2.SdtSDTOrigenbienes_SDTOrigenbienesItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTOrigenbienes_SDTOrigenbienesItem struct )
   {
      setgxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Orig_identificador(struct.getOrig_identificador());
      setgxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Orig_descripcion(struct.getOrig_descripcion());
      setgxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Tpmo_solicitanumero(struct.getTpmo_solicitanumero());
      setgxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Tpmo_solicitafecha(struct.getTpmo_solicitafecha());
   }

   public com.orions2.StructSdtSDTOrigenbienes_SDTOrigenbienesItem getStruct( )
   {
      com.orions2.StructSdtSDTOrigenbienes_SDTOrigenbienesItem struct = new com.orions2.StructSdtSDTOrigenbienes_SDTOrigenbienesItem ();
      struct.setOrig_identificador(getgxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Orig_identificador());
      struct.setOrig_descripcion(getgxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Orig_descripcion());
      struct.setTpmo_solicitanumero(getgxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Tpmo_solicitanumero());
      struct.setTpmo_solicitafecha(getgxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Tpmo_solicitafecha());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Orig_identificador ;
   protected String sTagName ;
   protected String gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Orig_descripcion ;
   protected String gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Tpmo_solicitanumero ;
   protected String gxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Tpmo_solicitafecha ;
}

