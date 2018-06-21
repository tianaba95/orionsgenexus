/*
               File: SdtreportExecutionRequest_reportParametername
        Description: reportExecutionRequest
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: May 29, 2018 15:54:51.75
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

public final  class SdtreportExecutionRequest_reportParametername extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtreportExecutionRequest_reportParametername( )
   {
      this(  new ModelContext(SdtreportExecutionRequest_reportParametername.class));
   }

   public SdtreportExecutionRequest_reportParametername( ModelContext context )
   {
      super( context, "SdtreportExecutionRequest_reportParametername");
   }

   public SdtreportExecutionRequest_reportParametername( int remoteHandle ,
                                                         ModelContext context )
   {
      super( remoteHandle, context, "SdtreportExecutionRequest_reportParametername");
   }

   public SdtreportExecutionRequest_reportParametername( StructSdtreportExecutionRequest_reportParametername struct )
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
               gxTv_SdtreportExecutionRequest_reportParametername_Name = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "value") )
            {
               gxTv_SdtreportExecutionRequest_reportParametername_Value = oReader.getValue() ;
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
         sName = "reportExecutionRequest.reportParametername" ;
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
      oWriter.writeElement("name", GXutil.rtrim( gxTv_SdtreportExecutionRequest_reportParametername_Name));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("value", GXutil.rtrim( gxTv_SdtreportExecutionRequest_reportParametername_Value));
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
      AddObjectProperty("name", gxTv_SdtreportExecutionRequest_reportParametername_Name, false);
      AddObjectProperty("value", gxTv_SdtreportExecutionRequest_reportParametername_Value, false);
   }

   public String getgxTv_SdtreportExecutionRequest_reportParametername_Name( )
   {
      return gxTv_SdtreportExecutionRequest_reportParametername_Name ;
   }

   public void setgxTv_SdtreportExecutionRequest_reportParametername_Name( String value )
   {
      gxTv_SdtreportExecutionRequest_reportParametername_Name = value ;
   }

   public String getgxTv_SdtreportExecutionRequest_reportParametername_Value( )
   {
      return gxTv_SdtreportExecutionRequest_reportParametername_Value ;
   }

   public void setgxTv_SdtreportExecutionRequest_reportParametername_Value( String value )
   {
      gxTv_SdtreportExecutionRequest_reportParametername_Value = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtreportExecutionRequest_reportParametername_Name = "" ;
      gxTv_SdtreportExecutionRequest_reportParametername_Value = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtreportExecutionRequest_reportParametername Clone( )
   {
      return (com.orions2.SdtreportExecutionRequest_reportParametername)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtreportExecutionRequest_reportParametername struct )
   {
      setgxTv_SdtreportExecutionRequest_reportParametername_Name(struct.getName());
      setgxTv_SdtreportExecutionRequest_reportParametername_Value(struct.getValue());
   }

   public com.orions2.StructSdtreportExecutionRequest_reportParametername getStruct( )
   {
      com.orions2.StructSdtreportExecutionRequest_reportParametername struct = new com.orions2.StructSdtreportExecutionRequest_reportParametername ();
      struct.setName(getgxTv_SdtreportExecutionRequest_reportParametername_Name());
      struct.setValue(getgxTv_SdtreportExecutionRequest_reportParametername_Value());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtreportExecutionRequest_reportParametername_Name ;
   protected String gxTv_SdtreportExecutionRequest_reportParametername_Value ;
}

