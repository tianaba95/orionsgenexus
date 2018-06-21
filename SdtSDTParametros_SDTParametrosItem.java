/*
               File: SdtSDTParametros_SDTParametrosItem
        Description: SDTParametros
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:19.50
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

public final  class SdtSDTParametros_SDTParametrosItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTParametros_SDTParametrosItem( )
   {
      this(  new ModelContext(SdtSDTParametros_SDTParametrosItem.class));
   }

   public SdtSDTParametros_SDTParametrosItem( ModelContext context )
   {
      super( context, "SdtSDTParametros_SDTParametrosItem");
   }

   public SdtSDTParametros_SDTParametrosItem( int remoteHandle ,
                                              ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTParametros_SDTParametrosItem");
   }

   public SdtSDTParametros_SDTParametrosItem( StructSdtSDTParametros_SDTParametrosItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Para_Id") )
            {
               gxTv_SdtSDTParametros_SDTParametrosItem_Para_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Para_Nombre") )
            {
               gxTv_SdtSDTParametros_SDTParametrosItem_Para_nombre = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Para_Valor") )
            {
               gxTv_SdtSDTParametros_SDTParametrosItem_Para_valor = oReader.getValue() ;
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
         sName = "SDTParametros.SDTParametrosItem" ;
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
      oWriter.writeElement("Para_Id", GXutil.trim( GXutil.str( gxTv_SdtSDTParametros_SDTParametrosItem_Para_id, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Para_Nombre", GXutil.rtrim( gxTv_SdtSDTParametros_SDTParametrosItem_Para_nombre));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Para_Valor", GXutil.rtrim( gxTv_SdtSDTParametros_SDTParametrosItem_Para_valor));
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
      AddObjectProperty("Para_Id", gxTv_SdtSDTParametros_SDTParametrosItem_Para_id, false);
      AddObjectProperty("Para_Nombre", gxTv_SdtSDTParametros_SDTParametrosItem_Para_nombre, false);
      AddObjectProperty("Para_Valor", gxTv_SdtSDTParametros_SDTParametrosItem_Para_valor, false);
   }

   public long getgxTv_SdtSDTParametros_SDTParametrosItem_Para_id( )
   {
      return gxTv_SdtSDTParametros_SDTParametrosItem_Para_id ;
   }

   public void setgxTv_SdtSDTParametros_SDTParametrosItem_Para_id( long value )
   {
      gxTv_SdtSDTParametros_SDTParametrosItem_Para_id = value ;
   }

   public String getgxTv_SdtSDTParametros_SDTParametrosItem_Para_nombre( )
   {
      return gxTv_SdtSDTParametros_SDTParametrosItem_Para_nombre ;
   }

   public void setgxTv_SdtSDTParametros_SDTParametrosItem_Para_nombre( String value )
   {
      gxTv_SdtSDTParametros_SDTParametrosItem_Para_nombre = value ;
   }

   public String getgxTv_SdtSDTParametros_SDTParametrosItem_Para_valor( )
   {
      return gxTv_SdtSDTParametros_SDTParametrosItem_Para_valor ;
   }

   public void setgxTv_SdtSDTParametros_SDTParametrosItem_Para_valor( String value )
   {
      gxTv_SdtSDTParametros_SDTParametrosItem_Para_valor = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTParametros_SDTParametrosItem_Para_nombre = "" ;
      gxTv_SdtSDTParametros_SDTParametrosItem_Para_valor = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTParametros_SDTParametrosItem Clone( )
   {
      return (com.orions2.SdtSDTParametros_SDTParametrosItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTParametros_SDTParametrosItem struct )
   {
      setgxTv_SdtSDTParametros_SDTParametrosItem_Para_id(struct.getPara_id());
      setgxTv_SdtSDTParametros_SDTParametrosItem_Para_nombre(struct.getPara_nombre());
      setgxTv_SdtSDTParametros_SDTParametrosItem_Para_valor(struct.getPara_valor());
   }

   public com.orions2.StructSdtSDTParametros_SDTParametrosItem getStruct( )
   {
      com.orions2.StructSdtSDTParametros_SDTParametrosItem struct = new com.orions2.StructSdtSDTParametros_SDTParametrosItem ();
      struct.setPara_id(getgxTv_SdtSDTParametros_SDTParametrosItem_Para_id());
      struct.setPara_nombre(getgxTv_SdtSDTParametros_SDTParametrosItem_Para_nombre());
      struct.setPara_valor(getgxTv_SdtSDTParametros_SDTParametrosItem_Para_valor());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSDTParametros_SDTParametrosItem_Para_id ;
   protected String sTagName ;
   protected String gxTv_SdtSDTParametros_SDTParametrosItem_Para_nombre ;
   protected String gxTv_SdtSDTParametros_SDTParametrosItem_Para_valor ;
}

