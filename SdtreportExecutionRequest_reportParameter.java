/*
               File: SdtreportExecutionRequest_reportParameter
        Description: reportExecutionRequest
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:15.93
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

public final  class SdtreportExecutionRequest_reportParameter extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtreportExecutionRequest_reportParameter( )
   {
      this(  new ModelContext(SdtreportExecutionRequest_reportParameter.class));
   }

   public SdtreportExecutionRequest_reportParameter( ModelContext context )
   {
      super( context, "SdtreportExecutionRequest_reportParameter");
   }

   public SdtreportExecutionRequest_reportParameter( int remoteHandle ,
                                                     ModelContext context )
   {
      super( remoteHandle, context, "SdtreportExecutionRequest_reportParameter");
   }

   public SdtreportExecutionRequest_reportParameter( StructSdtreportExecutionRequest_reportParameter struct )
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
               gxTv_SdtreportExecutionRequest_reportParameter_Name = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "value") )
            {
               gxTv_SdtreportExecutionRequest_reportParameter_Value = oReader.getValue() ;
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
         sName = "reportExecutionRequest.reportParameter" ;
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
      oWriter.writeElement("name", GXutil.rtrim( gxTv_SdtreportExecutionRequest_reportParameter_Name));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("value", GXutil.rtrim( gxTv_SdtreportExecutionRequest_reportParameter_Value));
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
      AddObjectProperty("name", gxTv_SdtreportExecutionRequest_reportParameter_Name, false);
      AddObjectProperty("value", gxTv_SdtreportExecutionRequest_reportParameter_Value, false);
   }

   public String getgxTv_SdtreportExecutionRequest_reportParameter_Name( )
   {
      return gxTv_SdtreportExecutionRequest_reportParameter_Name ;
   }

   public void setgxTv_SdtreportExecutionRequest_reportParameter_Name( String value )
   {
      gxTv_SdtreportExecutionRequest_reportParameter_Name = value ;
   }

   public String getgxTv_SdtreportExecutionRequest_reportParameter_Value( )
   {
      return gxTv_SdtreportExecutionRequest_reportParameter_Value ;
   }

   public void setgxTv_SdtreportExecutionRequest_reportParameter_Value( String value )
   {
      gxTv_SdtreportExecutionRequest_reportParameter_Value = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtreportExecutionRequest_reportParameter_Name = "" ;
      gxTv_SdtreportExecutionRequest_reportParameter_Value = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtreportExecutionRequest_reportParameter Clone( )
   {
      return (com.orions2.SdtreportExecutionRequest_reportParameter)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtreportExecutionRequest_reportParameter struct )
   {
      setgxTv_SdtreportExecutionRequest_reportParameter_Name(struct.getName());
      setgxTv_SdtreportExecutionRequest_reportParameter_Value(struct.getValue());
   }

   public com.orions2.StructSdtreportExecutionRequest_reportParameter getStruct( )
   {
      com.orions2.StructSdtreportExecutionRequest_reportParameter struct = new com.orions2.StructSdtreportExecutionRequest_reportParameter ();
      struct.setName(getgxTv_SdtreportExecutionRequest_reportParameter_Name());
      struct.setValue(getgxTv_SdtreportExecutionRequest_reportParameter_Value());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtreportExecutionRequest_reportParameter_Name ;
   protected String gxTv_SdtreportExecutionRequest_reportParameter_Value ;
}

