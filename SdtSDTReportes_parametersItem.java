/*
               File: SdtSDTReportes_parametersItem
        Description: SDTReportes
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: May 29, 2018 15:35:9.0
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

public final  class SdtSDTReportes_parametersItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTReportes_parametersItem( )
   {
      this(  new ModelContext(SdtSDTReportes_parametersItem.class));
   }

   public SdtSDTReportes_parametersItem( ModelContext context )
   {
      super( context, "SdtSDTReportes_parametersItem");
   }

   public SdtSDTReportes_parametersItem( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTReportes_parametersItem");
   }

   public SdtSDTReportes_parametersItem( StructSdtSDTReportes_parametersItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "name") )
            {
               gxTv_SdtSDTReportes_parametersItem_Name = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "value") )
            {
               gxTv_SdtSDTReportes_parametersItem_Value = oReader.getValue() ;
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
         sName = "SDTReportes.parametersItem" ;
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
      oWriter.writeElement("name", GXutil.rtrim( gxTv_SdtSDTReportes_parametersItem_Name));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("value", GXutil.rtrim( gxTv_SdtSDTReportes_parametersItem_Value));
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
      AddObjectProperty("name", gxTv_SdtSDTReportes_parametersItem_Name, false);
      AddObjectProperty("value", gxTv_SdtSDTReportes_parametersItem_Value, false);
   }

   public String getgxTv_SdtSDTReportes_parametersItem_Name( )
   {
      return gxTv_SdtSDTReportes_parametersItem_Name ;
   }

   public void setgxTv_SdtSDTReportes_parametersItem_Name( String value )
   {
      gxTv_SdtSDTReportes_parametersItem_Name = value ;
   }

   public String getgxTv_SdtSDTReportes_parametersItem_Value( )
   {
      return gxTv_SdtSDTReportes_parametersItem_Value ;
   }

   public void setgxTv_SdtSDTReportes_parametersItem_Value( String value )
   {
      gxTv_SdtSDTReportes_parametersItem_Value = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTReportes_parametersItem_Name = "" ;
      gxTv_SdtSDTReportes_parametersItem_Value = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTReportes_parametersItem Clone( )
   {
      return (com.orions2.SdtSDTReportes_parametersItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTReportes_parametersItem struct )
   {
      setgxTv_SdtSDTReportes_parametersItem_Name(struct.getName());
      setgxTv_SdtSDTReportes_parametersItem_Value(struct.getValue());
   }

   public com.orions2.StructSdtSDTReportes_parametersItem getStruct( )
   {
      com.orions2.StructSdtSDTReportes_parametersItem struct = new com.orions2.StructSdtSDTReportes_parametersItem ();
      struct.setName(getgxTv_SdtSDTReportes_parametersItem_Name());
      struct.setValue(getgxTv_SdtSDTReportes_parametersItem_Value());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtSDTReportes_parametersItem_Name ;
   protected String gxTv_SdtSDTReportes_parametersItem_Value ;
}

