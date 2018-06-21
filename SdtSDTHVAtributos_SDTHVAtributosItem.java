/*
               File: SdtSDTHVAtributos_SDTHVAtributosItem
        Description: SDTHVAtributos
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:18.27
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

public final  class SdtSDTHVAtributos_SDTHVAtributosItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTHVAtributos_SDTHVAtributosItem( )
   {
      this(  new ModelContext(SdtSDTHVAtributos_SDTHVAtributosItem.class));
   }

   public SdtSDTHVAtributos_SDTHVAtributosItem( ModelContext context )
   {
      super( context, "SdtSDTHVAtributos_SDTHVAtributosItem");
   }

   public SdtSDTHVAtributos_SDTHVAtributosItem( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTHVAtributos_SDTHVAtributosItem");
   }

   public SdtSDTHVAtributos_SDTHVAtributosItem( StructSdtSDTHVAtributos_SDTHVAtributosItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "gTDet_ListDescripcion") )
            {
               gxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_listdescripcion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "gTDet_ValorAtributo") )
            {
               gxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_valoratributo = oReader.getValue() ;
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
         sName = "SDTHVAtributos.SDTHVAtributosItem" ;
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
      oWriter.writeElement("gTDet_ListDescripcion", GXutil.rtrim( gxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_listdescripcion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("gTDet_ValorAtributo", GXutil.rtrim( gxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_valoratributo));
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
      AddObjectProperty("gTDet_ListDescripcion", gxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_listdescripcion, false);
      AddObjectProperty("gTDet_ValorAtributo", gxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_valoratributo, false);
   }

   public String getgxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_listdescripcion( )
   {
      return gxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_listdescripcion ;
   }

   public void setgxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_listdescripcion( String value )
   {
      gxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_listdescripcion = value ;
   }

   public String getgxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_valoratributo( )
   {
      return gxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_valoratributo ;
   }

   public void setgxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_valoratributo( String value )
   {
      gxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_valoratributo = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_listdescripcion = "" ;
      gxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_valoratributo = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTHVAtributos_SDTHVAtributosItem Clone( )
   {
      return (com.orions2.SdtSDTHVAtributos_SDTHVAtributosItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTHVAtributos_SDTHVAtributosItem struct )
   {
      setgxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_listdescripcion(struct.getGtdet_listdescripcion());
      setgxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_valoratributo(struct.getGtdet_valoratributo());
   }

   public com.orions2.StructSdtSDTHVAtributos_SDTHVAtributosItem getStruct( )
   {
      com.orions2.StructSdtSDTHVAtributos_SDTHVAtributosItem struct = new com.orions2.StructSdtSDTHVAtributos_SDTHVAtributosItem ();
      struct.setGtdet_listdescripcion(getgxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_listdescripcion());
      struct.setGtdet_valoratributo(getgxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_valoratributo());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_listdescripcion ;
   protected String gxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_valoratributo ;
}

