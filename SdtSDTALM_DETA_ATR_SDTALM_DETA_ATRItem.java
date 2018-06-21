/*
               File: SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem
        Description: SDTALM_DETA_ATR
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:16.4
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

public final  class SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem( )
   {
      this(  new ModelContext(SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem.class));
   }

   public SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem( ModelContext context )
   {
      super( context, "SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem");
   }

   public SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem( int remoteHandle ,
                                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem");
   }

   public SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem( StructSdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TDet_ListDescripcion") )
            {
               gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listdescripcion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TDet_ValorAtributo") )
            {
               gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_valoratributo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TDet_ListTipo") )
            {
               gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listtipo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TDet_ListId") )
            {
               gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listid = GXutil.lval( oReader.getValue()) ;
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
         sName = "SDTALM_DETA_ATR.SDTALM_DETA_ATRItem" ;
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
      oWriter.writeElement("TDet_ListDescripcion", GXutil.rtrim( gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listdescripcion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TDet_ValorAtributo", GXutil.rtrim( gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_valoratributo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TDet_ListTipo", GXutil.rtrim( gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listtipo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TDet_ListId", GXutil.trim( GXutil.str( gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listid, 11, 0)));
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
      AddObjectProperty("TDet_ListDescripcion", gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listdescripcion, false);
      AddObjectProperty("TDet_ValorAtributo", gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_valoratributo, false);
      AddObjectProperty("TDet_ListTipo", gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listtipo, false);
      AddObjectProperty("TDet_ListId", gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listid, false);
   }

   public String getgxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listdescripcion( )
   {
      return gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listdescripcion ;
   }

   public void setgxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listdescripcion( String value )
   {
      gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listdescripcion = value ;
   }

   public String getgxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_valoratributo( )
   {
      return gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_valoratributo ;
   }

   public void setgxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_valoratributo( String value )
   {
      gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_valoratributo = value ;
   }

   public String getgxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listtipo( )
   {
      return gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listtipo ;
   }

   public void setgxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listtipo( String value )
   {
      gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listtipo = value ;
   }

   public long getgxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listid( )
   {
      return gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listid ;
   }

   public void setgxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listid( long value )
   {
      gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listid = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listdescripcion = "" ;
      gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_valoratributo = "" ;
      gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listtipo = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem Clone( )
   {
      return (com.orions2.SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem struct )
   {
      setgxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listdescripcion(struct.getTdet_listdescripcion());
      setgxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_valoratributo(struct.getTdet_valoratributo());
      setgxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listtipo(struct.getTdet_listtipo());
      setgxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listid(struct.getTdet_listid());
   }

   public com.orions2.StructSdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem getStruct( )
   {
      com.orions2.StructSdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem struct = new com.orions2.StructSdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem ();
      struct.setTdet_listdescripcion(getgxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listdescripcion());
      struct.setTdet_valoratributo(getgxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_valoratributo());
      struct.setTdet_listtipo(getgxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listtipo());
      struct.setTdet_listid(getgxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listid());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listid ;
   protected String gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listtipo ;
   protected String sTagName ;
   protected String gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_listdescripcion ;
   protected String gxTv_SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem_Tdet_valoratributo ;
}

