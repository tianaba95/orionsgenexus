/*
               File: SdtreportExecutionRequest
        Description: reportExecutionRequest
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:15.89
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

public final  class SdtreportExecutionRequest extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtreportExecutionRequest( )
   {
      this(  new ModelContext(SdtreportExecutionRequest.class));
   }

   public SdtreportExecutionRequest( ModelContext context )
   {
      super( context, "SdtreportExecutionRequest");
   }

   public SdtreportExecutionRequest( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle, context, "SdtreportExecutionRequest");
   }

   public SdtreportExecutionRequest( StructSdtreportExecutionRequest struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "reportUnitUri") )
            {
               gxTv_SdtreportExecutionRequest_Reportunituri = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "async") )
            {
               gxTv_SdtreportExecutionRequest_Async = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "freshData") )
            {
               gxTv_SdtreportExecutionRequest_Freshdata = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "saveDataSnapshot") )
            {
               gxTv_SdtreportExecutionRequest_Savedatasnapshot = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "outputFormat") )
            {
               gxTv_SdtreportExecutionRequest_Outputformat = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "interactive") )
            {
               gxTv_SdtreportExecutionRequest_Interactive = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ignorePagination") )
            {
               gxTv_SdtreportExecutionRequest_Ignorepagination = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "parameters") )
            {
               if ( gxTv_SdtreportExecutionRequest_Parameters == null )
               {
                  gxTv_SdtreportExecutionRequest_Parameters = new GXBaseCollection<com.orions2.SdtreportExecutionRequest_reportParameter>(com.orions2.SdtreportExecutionRequest_reportParameter.class, "reportExecutionRequest.reportParameter", "ACBSENA", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtreportExecutionRequest_Parameters.readxmlcollection(oReader, "parameters", "reportParameter") ;
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
         sName = "reportExecutionRequest" ;
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
      oWriter.writeElement("reportUnitUri", GXutil.rtrim( gxTv_SdtreportExecutionRequest_Reportunituri));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("async", GXutil.rtrim( gxTv_SdtreportExecutionRequest_Async));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("freshData", GXutil.rtrim( gxTv_SdtreportExecutionRequest_Freshdata));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("saveDataSnapshot", GXutil.rtrim( gxTv_SdtreportExecutionRequest_Savedatasnapshot));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("outputFormat", GXutil.rtrim( gxTv_SdtreportExecutionRequest_Outputformat));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("interactive", GXutil.rtrim( gxTv_SdtreportExecutionRequest_Interactive));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("ignorePagination", GXutil.rtrim( gxTv_SdtreportExecutionRequest_Ignorepagination));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( gxTv_SdtreportExecutionRequest_Parameters != null )
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
         gxTv_SdtreportExecutionRequest_Parameters.writexmlcollection(oWriter, "parameters", sNameSpace1, "reportParameter", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("reportUnitUri", gxTv_SdtreportExecutionRequest_Reportunituri, false);
      AddObjectProperty("async", gxTv_SdtreportExecutionRequest_Async, false);
      AddObjectProperty("freshData", gxTv_SdtreportExecutionRequest_Freshdata, false);
      AddObjectProperty("saveDataSnapshot", gxTv_SdtreportExecutionRequest_Savedatasnapshot, false);
      AddObjectProperty("outputFormat", gxTv_SdtreportExecutionRequest_Outputformat, false);
      AddObjectProperty("interactive", gxTv_SdtreportExecutionRequest_Interactive, false);
      AddObjectProperty("ignorePagination", gxTv_SdtreportExecutionRequest_Ignorepagination, false);
      if ( gxTv_SdtreportExecutionRequest_Parameters != null )
      {
         AddObjectProperty("parameters", gxTv_SdtreportExecutionRequest_Parameters, false);
      }
   }

   public String getgxTv_SdtreportExecutionRequest_Reportunituri( )
   {
      return gxTv_SdtreportExecutionRequest_Reportunituri ;
   }

   public void setgxTv_SdtreportExecutionRequest_Reportunituri( String value )
   {
      gxTv_SdtreportExecutionRequest_Reportunituri = value ;
   }

   public String getgxTv_SdtreportExecutionRequest_Async( )
   {
      return gxTv_SdtreportExecutionRequest_Async ;
   }

   public void setgxTv_SdtreportExecutionRequest_Async( String value )
   {
      gxTv_SdtreportExecutionRequest_Async = value ;
   }

   public String getgxTv_SdtreportExecutionRequest_Freshdata( )
   {
      return gxTv_SdtreportExecutionRequest_Freshdata ;
   }

   public void setgxTv_SdtreportExecutionRequest_Freshdata( String value )
   {
      gxTv_SdtreportExecutionRequest_Freshdata = value ;
   }

   public String getgxTv_SdtreportExecutionRequest_Savedatasnapshot( )
   {
      return gxTv_SdtreportExecutionRequest_Savedatasnapshot ;
   }

   public void setgxTv_SdtreportExecutionRequest_Savedatasnapshot( String value )
   {
      gxTv_SdtreportExecutionRequest_Savedatasnapshot = value ;
   }

   public String getgxTv_SdtreportExecutionRequest_Outputformat( )
   {
      return gxTv_SdtreportExecutionRequest_Outputformat ;
   }

   public void setgxTv_SdtreportExecutionRequest_Outputformat( String value )
   {
      gxTv_SdtreportExecutionRequest_Outputformat = value ;
   }

   public String getgxTv_SdtreportExecutionRequest_Interactive( )
   {
      return gxTv_SdtreportExecutionRequest_Interactive ;
   }

   public void setgxTv_SdtreportExecutionRequest_Interactive( String value )
   {
      gxTv_SdtreportExecutionRequest_Interactive = value ;
   }

   public String getgxTv_SdtreportExecutionRequest_Ignorepagination( )
   {
      return gxTv_SdtreportExecutionRequest_Ignorepagination ;
   }

   public void setgxTv_SdtreportExecutionRequest_Ignorepagination( String value )
   {
      gxTv_SdtreportExecutionRequest_Ignorepagination = value ;
   }

   public GXBaseCollection<com.orions2.SdtreportExecutionRequest_reportParameter> getgxTv_SdtreportExecutionRequest_Parameters( )
   {
      if ( gxTv_SdtreportExecutionRequest_Parameters == null )
      {
         gxTv_SdtreportExecutionRequest_Parameters = new GXBaseCollection<com.orions2.SdtreportExecutionRequest_reportParameter>(com.orions2.SdtreportExecutionRequest_reportParameter.class, "reportExecutionRequest.reportParameter", "ACBSENA", remoteHandle);
      }
      return gxTv_SdtreportExecutionRequest_Parameters ;
   }

   public void setgxTv_SdtreportExecutionRequest_Parameters( GXBaseCollection<com.orions2.SdtreportExecutionRequest_reportParameter> value )
   {
      gxTv_SdtreportExecutionRequest_Parameters = value ;
   }

   public void setgxTv_SdtreportExecutionRequest_Parameters_SetNull( )
   {
      gxTv_SdtreportExecutionRequest_Parameters = null ;
   }

   public boolean getgxTv_SdtreportExecutionRequest_Parameters_IsNull( )
   {
      if ( gxTv_SdtreportExecutionRequest_Parameters == null )
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
      gxTv_SdtreportExecutionRequest_Reportunituri = "" ;
      gxTv_SdtreportExecutionRequest_Async = "" ;
      gxTv_SdtreportExecutionRequest_Freshdata = "" ;
      gxTv_SdtreportExecutionRequest_Savedatasnapshot = "" ;
      gxTv_SdtreportExecutionRequest_Outputformat = "" ;
      gxTv_SdtreportExecutionRequest_Interactive = "" ;
      gxTv_SdtreportExecutionRequest_Ignorepagination = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtreportExecutionRequest Clone( )
   {
      return (com.orions2.SdtreportExecutionRequest)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtreportExecutionRequest struct )
   {
      setgxTv_SdtreportExecutionRequest_Reportunituri(struct.getReportunituri());
      setgxTv_SdtreportExecutionRequest_Async(struct.getAsync());
      setgxTv_SdtreportExecutionRequest_Freshdata(struct.getFreshdata());
      setgxTv_SdtreportExecutionRequest_Savedatasnapshot(struct.getSavedatasnapshot());
      setgxTv_SdtreportExecutionRequest_Outputformat(struct.getOutputformat());
      setgxTv_SdtreportExecutionRequest_Interactive(struct.getInteractive());
      setgxTv_SdtreportExecutionRequest_Ignorepagination(struct.getIgnorepagination());
      GXBaseCollection<com.orions2.SdtreportExecutionRequest_reportParameter> gxTv_SdtreportExecutionRequest_Parameters_aux = new GXBaseCollection<com.orions2.SdtreportExecutionRequest_reportParameter>(com.orions2.SdtreportExecutionRequest_reportParameter.class, "reportExecutionRequest.reportParameter", "ACBSENA", remoteHandle) ;
      GXBaseCollection<com.orions2.SdtreportExecutionRequest_reportParameter> gxTv_SdtreportExecutionRequest_Parameters_aux1 = new GXBaseCollection<com.orions2.SdtreportExecutionRequest_reportParameter>(com.orions2.SdtreportExecutionRequest_reportParameter.class, "reportExecutionRequest.reportParameter", "ACBSENA", remoteHandle) ;
      gxTv_SdtreportExecutionRequest_Parameters_aux1.setStruct(struct.getParameters());
      for (int i = 0; i < gxTv_SdtreportExecutionRequest_Parameters_aux1.size(); i++)
      {
         gxTv_SdtreportExecutionRequest_Parameters_aux.add(new com.orions2.SdtreportExecutionRequest_reportParameter(gxTv_SdtreportExecutionRequest_Parameters_aux1.elementAt(i).getStruct()));
      }
      setgxTv_SdtreportExecutionRequest_Parameters(gxTv_SdtreportExecutionRequest_Parameters_aux);
   }

   public com.orions2.StructSdtreportExecutionRequest getStruct( )
   {
      com.orions2.StructSdtreportExecutionRequest struct = new com.orions2.StructSdtreportExecutionRequest ();
      struct.setReportunituri(getgxTv_SdtreportExecutionRequest_Reportunituri());
      struct.setAsync(getgxTv_SdtreportExecutionRequest_Async());
      struct.setFreshdata(getgxTv_SdtreportExecutionRequest_Freshdata());
      struct.setSavedatasnapshot(getgxTv_SdtreportExecutionRequest_Savedatasnapshot());
      struct.setOutputformat(getgxTv_SdtreportExecutionRequest_Outputformat());
      struct.setInteractive(getgxTv_SdtreportExecutionRequest_Interactive());
      struct.setIgnorepagination(getgxTv_SdtreportExecutionRequest_Ignorepagination());
      Vector aux_vectorgxTv_SdtreportExecutionRequest_Parameters = getgxTv_SdtreportExecutionRequest_Parameters().getStruct();
      Vector aux_vector1gxTv_SdtreportExecutionRequest_Parameters = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtreportExecutionRequest_Parameters.size(); i++)
      {
         aux_vector1gxTv_SdtreportExecutionRequest_Parameters.addElement(((com.orions2.SdtreportExecutionRequest_reportParameter)aux_vectorgxTv_SdtreportExecutionRequest_Parameters.elementAt(i)).getStruct());
      }
      struct.setParameters(aux_vector1gxTv_SdtreportExecutionRequest_Parameters);
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtreportExecutionRequest_Reportunituri ;
   protected String gxTv_SdtreportExecutionRequest_Async ;
   protected String gxTv_SdtreportExecutionRequest_Freshdata ;
   protected String gxTv_SdtreportExecutionRequest_Savedatasnapshot ;
   protected String gxTv_SdtreportExecutionRequest_Outputformat ;
   protected String gxTv_SdtreportExecutionRequest_Interactive ;
   protected String gxTv_SdtreportExecutionRequest_Ignorepagination ;
   protected GXBaseCollection<com.orions2.SdtreportExecutionRequest_reportParameter> gxTv_SdtreportExecutionRequest_Parameters_aux ;
   protected GXBaseCollection<com.orions2.SdtreportExecutionRequest_reportParameter> gxTv_SdtreportExecutionRequest_Parameters_aux1 ;
   protected GXBaseCollection<com.orions2.SdtreportExecutionRequest_reportParameter> gxTv_SdtreportExecutionRequest_Parameters=null ;
}

